package com.bytedance.retrofit2.mime;

import X.C08FF;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.regex.Pattern;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public class TTRequestCompressManager {
    public static AddZstdCompressCallback sAddZstdCompressCallback = null;
    public static int sBrotliCompressQuality = 4;
    public static volatile CompressDataCallback sCallback = null;
    public static volatile boolean sCompressOptEnabled = false;
    public static int sMaxBodyCompressSize = 1048576;
    public static int sMinBodyCompressSize = 100;
    public static volatile boolean sRequestCompressEnabled = false;
    public static int sZstdCompressLevel = 6;
    public static CompressType sCompressType = CompressType.NONE;
    public static CopyOnWriteArraySet<String> sEqualPathArraySet = new CopyOnWriteArraySet<>();
    public static CopyOnWriteArraySet<String> sPrefixPathArraySet = new CopyOnWriteArraySet<>();
    public static CopyOnWriteArraySet<Pattern> sRegexPathArraySet = new CopyOnWriteArraySet<>();
    public static CopyOnWriteArraySet<String> sZstdEqualPathArraySet = new CopyOnWriteArraySet<>();
    public static CopyOnWriteArraySet<String> sZstdPrefixPathArraySet = new CopyOnWriteArraySet<>();
    public static CopyOnWriteArraySet<Pattern> sZstdRegexPathArraySet = new CopyOnWriteArraySet<>();
    public static CopyOnWriteArraySet<String> sHostGroupArraySet = new CopyOnWriteArraySet<>();
    public static CopyOnWriteArraySet<String> sBlockEqualPathArraySet = new CopyOnWriteArraySet<>();
    public static CopyOnWriteArraySet<Pattern> sBlockPatternPathArraySet = new CopyOnWriteArraySet<>();
    public static volatile Boolean sGlobalCompressDisabled = Boolean.FALSE;
    public static final char[] HEX_ARRAY = "0123456789ABCDEF".toCharArray();

    public interface AddZstdCompressCallback {
        byte[] compress(byte[] bArr, int i);

        byte[] decompress(byte[] bArr, int i);
    }

    public interface CompressDataCallback {
        byte[] compressData(byte[] bArr, int i, int i2, int i3);

        byte[] decompressData(byte[] bArr, int i, int i2);
    }

    public static void resetCompressConfig() {
        sRequestCompressEnabled = false;
        sMaxBodyCompressSize = 1048576;
        sMinBodyCompressSize = 100;
        sCompressType = CompressType.NONE;
        sEqualPathArraySet.clear();
        sPrefixPathArraySet.clear();
        sRegexPathArraySet.clear();
        sZstdEqualPathArraySet.clear();
        sZstdPrefixPathArraySet.clear();
        sZstdRegexPathArraySet.clear();
        sHostGroupArraySet.clear();
        sBlockEqualPathArraySet.clear();
        sBlockPatternPathArraySet.clear();
    }

    public static void setGlobalForbidenCompress() {
        sGlobalCompressDisabled = Boolean.TRUE;
    }

    public enum CompressType {
        NONE(0),
        GZIP(1),
        BROTLI(2),
        ZSTD(3);

        public final int mType;

        public int getType() {
            return this.mType;
        }

        public static CompressType valueOf(String str) {
            return (CompressType) C08FF.LIZ(CompressType.class, str);
        }

        CompressType(int i) {
            this.mType = i;
        }
    }

    public enum DisableCompress {
        NONE(0),
        GLOBAL_DISABLE(1),
        TNC_DISABLE(2),
        URL_MISMATCH(3),
        BODY_SIZE_MISMATCH(4),
        BODY_SIZE_OVERFLOW(5),
        ZSTD_PREFIX_MISMATCH(6),
        GZIP_PREFIX_MISMATCH(7),
        BODY_ENCRYPTED(8),
        REMOVE_ENCODING(9),
        DATA_NULL(10);

        public final int reason;

        public int getReason() {
            return this.reason;
        }

        public static DisableCompress valueOf(String str) {
            return (DisableCompress) C08FF.LIZ(DisableCompress.class, str);
        }

        DisableCompress(int i) {
            this.reason = i;
        }
    }

    public static boolean isBodyOptEnabled() {
        return sCompressOptEnabled;
    }

    public static class CompressData {
        public String contentEncoding;
        public byte[] data;
        public int failedCode;
        public String failedPrefixData;
        public CompressType type;

        public CompressData(int i) {
            this.failedCode = i;
        }
    }

    public static String byteArrayToHexString(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i = 0; i < bArr.length; i++) {
            int i2 = bArr[i] & 255;
            int i3 = i * 2;
            char[] cArr2 = HEX_ARRAY;
            cArr[i3] = cArr2[i2 >>> 4];
            cArr[i3 + 1] = cArr2[i2 & 15];
        }
        return new String(cArr);
    }

    public static void covertIntToCompressType(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    sCompressType = CompressType.NONE;
                    return;
                } else {
                    sCompressType = CompressType.ZSTD;
                    return;
                }
            }
            sCompressType = CompressType.BROTLI;
            return;
        }
        sCompressType = CompressType.GZIP;
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0045: MOVE (r4 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:16777285), block:B:26:0x0045 */
    public static byte[] gzipDecompress(byte[] bArr) throws Throwable {
        GZIPInputStream gZIPInputStream;
        GZIPInputStream gZIPInputStream2;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPInputStream gZIPInputStream3 = null;
        try {
            try {
                try {
                    gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(bArr));
                } catch (Throwable th) {
                    th = th;
                    gZIPInputStream3 = gZIPInputStream2;
                    TryCatchGuardChecker.doCheck(th);
                    if (gZIPInputStream3 != null) {
                        try {
                            gZIPInputStream3.close();
                        } catch (IOException e) {
                            TryCatchGuardChecker.doCheck(e);
                            throw th;
                        }
                    }
                    byteArrayOutputStream.close();
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
                gZIPInputStream = null;
            }
            try {
                byte[] bArr2 = new byte[SpeechEngineDefines.TTS_WORK_MODE_BOTH];
                while (true) {
                    int i = gZIPInputStream.read(bArr2);
                    if (i >= 0) {
                        byteArrayOutputStream.write(bArr2, 0, i);
                    } else {
                        try {
                            break;
                        } catch (IOException e3) {
                            TryCatchGuardChecker.doCheck(e3);
                        }
                    }
                }
                gZIPInputStream.close();
                byteArrayOutputStream.close();
                return byteArrayOutputStream.toByteArray();
            } catch (IOException e4) {
                e = e4;
                TryCatchGuardChecker.doCheck(e);
                if (gZIPInputStream != null) {
                    try {
                        gZIPInputStream.close();
                    } catch (IOException e5) {
                        TryCatchGuardChecker.doCheck(e5);
                        return null;
                    }
                }
                byteArrayOutputStream.close();
                return null;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static boolean isEmptySet(Set<?> set) {
        if (set != null && !set.isEmpty()) {
            return false;
        }
        return true;
    }

    public static boolean isHostMatch(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Iterator<String> it2 = sHostGroupArraySet.iterator();
        while (it2.hasNext()) {
            if (matchPattern(str, it2.next())) {
                return true;
            }
        }
        return false;
    }

    public static void onServerConfigChanged(JSONObject jSONObject) {
        boolean z;
        if (jSONObject == null) {
            return;
        }
        resetCompressConfig();
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("tt_compress");
        if (jSONObjectOptJSONObject == null) {
            return;
        }
        boolean z2 = false;
        if (jSONObjectOptJSONObject.optInt("enabled", 0) > 0) {
            z = true;
        } else {
            z = false;
        }
        sRequestCompressEnabled = z;
        if (jSONObjectOptJSONObject.optInt("opt_enabled", 0) > 0) {
            z2 = true;
        }
        sCompressOptEnabled = z2;
        sMaxBodyCompressSize = jSONObjectOptJSONObject.optInt("max_body_size", 1048576);
        sMinBodyCompressSize = jSONObjectOptJSONObject.optInt("min_body_size", 100);
        int iOptInt = jSONObjectOptJSONObject.optInt("br_level", 4);
        if (iOptInt >= 0 && iOptInt <= 11) {
            sBrotliCompressQuality = iOptInt;
        }
        int iOptInt2 = jSONObjectOptJSONObject.optInt("zstd_level", 6);
        if (iOptInt2 >= 1 && iOptInt2 <= 22) {
            sZstdCompressLevel = iOptInt2;
        }
        covertIntToCompressType(jSONObjectOptJSONObject.optInt("type", CompressType.GZIP.getType()));
        parseArraySetStringConfig(jSONObjectOptJSONObject.optJSONArray("equal_path"), sEqualPathArraySet);
        parseArraySetStringConfig(jSONObjectOptJSONObject.optJSONArray("prefix_path"), sPrefixPathArraySet);
        parseArraySetPatternConfig(jSONObjectOptJSONObject.optJSONArray("regex_path"), sRegexPathArraySet);
        parseArraySetStringConfig(jSONObjectOptJSONObject.optJSONArray("zstd_equal_path"), sZstdEqualPathArraySet);
        parseArraySetStringConfig(jSONObjectOptJSONObject.optJSONArray("zstd_prefix_path"), sZstdPrefixPathArraySet);
        parseArraySetPatternConfig(jSONObjectOptJSONObject.optJSONArray("zstd_regex_path"), sZstdRegexPathArraySet);
        parseArraySetStringConfig(jSONObjectOptJSONObject.optJSONArray("host_group"), sHostGroupArraySet);
        parseArraySetStringConfig(jSONObjectOptJSONObject.optJSONArray("block_path_equal_list"), sBlockEqualPathArraySet);
        parseArraySetPatternConfig(jSONObjectOptJSONObject.optJSONArray("block_path_regex_list"), sBlockPatternPathArraySet);
        Logger.debug();
    }

    public static void setAddZstdCompressCallback(AddZstdCompressCallback addZstdCompressCallback) {
        sAddZstdCompressCallback = addZstdCompressCallback;
    }

    public static void setCompressDataCallback(CompressDataCallback compressDataCallback) {
        sCallback = compressDataCallback;
    }

    public static byte[] brotliDecompress(byte[] bArr, int i) {
        if (bArr == null || sCallback == null) {
            return null;
        }
        return sCallback.decompressData(bArr, i, CompressType.BROTLI.getType());
    }

    public static CompressType getCompressType(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            if (!isEmptySet(sZstdEqualPathArraySet) && sZstdEqualPathArraySet.contains(str2)) {
                return CompressType.ZSTD;
            }
            if (!isEmptySet(sZstdPrefixPathArraySet)) {
                Iterator<String> it2 = sZstdPrefixPathArraySet.iterator();
                while (it2.hasNext()) {
                    if (str2.startsWith(it2.next())) {
                        return CompressType.ZSTD;
                    }
                }
            }
            if (!isEmptySet(sZstdRegexPathArraySet)) {
                for (Pattern pattern : sZstdRegexPathArraySet) {
                    if (pattern != null) {
                        try {
                            if (pattern.matcher(str2).matches()) {
                                return CompressType.ZSTD;
                            }
                            continue;
                        } catch (IllegalArgumentException e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                }
            }
            if (!isEmptySet(sEqualPathArraySet) && sEqualPathArraySet.contains(str2)) {
                return sCompressType;
            }
            if (!isEmptySet(sPrefixPathArraySet)) {
                Iterator<String> it3 = sPrefixPathArraySet.iterator();
                while (it3.hasNext()) {
                    if (str2.startsWith(it3.next())) {
                        return sCompressType;
                    }
                }
            }
            if (!isEmptySet(sRegexPathArraySet)) {
                for (Pattern pattern2 : sRegexPathArraySet) {
                    if (pattern2 != null) {
                        try {
                            if (pattern2.matcher(str2).matches()) {
                                return sCompressType;
                            }
                            continue;
                        } catch (IllegalArgumentException e2) {
                            TryCatchGuardChecker.doCheck(e2);
                        }
                    }
                }
            }
            if (!isEmptySet(sHostGroupArraySet) && isHostMatch(str)) {
                if (!isEmptySet(sBlockEqualPathArraySet) && sBlockEqualPathArraySet.contains(str2)) {
                    return CompressType.NONE;
                }
                if (!isEmptySet(sBlockPatternPathArraySet)) {
                    for (Pattern pattern3 : sBlockPatternPathArraySet) {
                        if (pattern3 != null) {
                            try {
                                if (pattern3.matcher(str2).matches()) {
                                    return CompressType.NONE;
                                }
                                continue;
                            } catch (IllegalArgumentException e3) {
                                TryCatchGuardChecker.doCheck(e3);
                            }
                        }
                    }
                }
                return sCompressType;
            }
            return CompressType.NONE;
        }
        return CompressType.NONE;
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0037: MOVE (r4 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]) (LINE:33554487), block:B:26:0x0037 */
    public static byte[] gzipCompress(byte[] bArr, int i) throws Throwable {
        GZIPOutputStream gZIPOutputStream;
        DeflaterOutputStream deflaterOutputStream;
        DeflaterOutputStream deflaterOutputStream2 = null;
        if (bArr == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            try {
                try {
                    gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                } catch (Throwable th) {
                    th = th;
                    deflaterOutputStream2 = deflaterOutputStream;
                    TryCatchGuardChecker.doCheck(th);
                    if (deflaterOutputStream2 != null) {
                        try {
                            deflaterOutputStream2.close();
                        } catch (IOException e) {
                            TryCatchGuardChecker.doCheck(e);
                            throw th;
                        }
                    }
                    byteArrayOutputStream.close();
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
                gZIPOutputStream = null;
            }
            try {
                gZIPOutputStream.write(bArr);
                try {
                    gZIPOutputStream.close();
                    byteArrayOutputStream.close();
                } catch (IOException e3) {
                    TryCatchGuardChecker.doCheck(e3);
                }
                return byteArrayOutputStream.toByteArray();
            } catch (IOException e4) {
                e = e4;
                TryCatchGuardChecker.doCheck(e);
                if (gZIPOutputStream != null) {
                    try {
                        gZIPOutputStream.close();
                    } catch (IOException e5) {
                        TryCatchGuardChecker.doCheck(e5);
                        return null;
                    }
                }
                byteArrayOutputStream.close();
                return null;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static boolean matchPattern(String str, String str2) {
        if (str == null || str2 == null) {
            return false;
        }
        int length = str.length();
        int length2 = str2.length();
        int i = 0;
        int i2 = 0;
        int i3 = -1;
        int i4 = -1;
        while (i < length) {
            if (i2 < length2 && (str2.charAt(i2) == '?' || str2.charAt(i2) == str.charAt(i))) {
                i++;
                i2++;
            } else if (i2 < length2 && str2.charAt(i2) == '*') {
                i4 = i;
                i3 = i2;
                i2++;
            } else {
                if (i3 == -1) {
                    return false;
                }
                i2 = i3 + 1;
                i4++;
                i = i4;
            }
        }
        while (i2 < length2) {
            if (str2.charAt(i2) != '*') {
                return false;
            }
            i2++;
        }
        return true;
    }

    public static void parseArraySetPatternConfig(JSONArray jSONArray, CopyOnWriteArraySet<Pattern> copyOnWriteArraySet) {
        if (jSONArray != null && copyOnWriteArraySet != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    String string = JSONArrayProtectorUtils.getString(jSONArray, i);
                    if (!TextUtils.isEmpty(string)) {
                        try {
                            copyOnWriteArraySet.add(PatternProtector.compile(string, 2));
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                        }
                    }
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                    return;
                }
            }
        }
    }

    public static void parseArraySetStringConfig(JSONArray jSONArray, CopyOnWriteArraySet<String> copyOnWriteArraySet) {
        if (jSONArray != null && copyOnWriteArraySet != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    String string = JSONArrayProtectorUtils.getString(jSONArray, i);
                    if (!TextUtils.isEmpty(string)) {
                        copyOnWriteArraySet.add(string);
                    }
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                    return;
                }
            }
        }
    }

    public static byte[] zstdCompress(byte[] bArr, int i) {
        AddZstdCompressCallback addZstdCompressCallback = sAddZstdCompressCallback;
        if (addZstdCompressCallback != null) {
            return addZstdCompressCallback.compress(bArr, i);
        }
        return null;
    }

    public static byte[] zstdDecompress(byte[] bArr, int i) {
        AddZstdCompressCallback addZstdCompressCallback = sAddZstdCompressCallback;
        if (addZstdCompressCallback != null) {
            return addZstdCompressCallback.decompress(bArr, i);
        }
        return null;
    }

    public static byte[] brotliCompress(byte[] bArr, int i, int i2) {
        if (bArr == null || sCallback == null) {
            return null;
        }
        return sCallback.compressData(bArr, i, i2, CompressType.BROTLI.getType());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static byte[] decompressDataByType(byte[] bArr, String str, int i) {
        if (bArr != null && !TextUtils.isEmpty(str)) {
            str.getClass();
            switch (str.hashCode()) {
                case 3152:
                    if (str.equals("br")) {
                        return brotliDecompress(bArr, bArr.length);
                    }
                    return bArr;
                case 3189082:
                    if (str.equals("gzip")) {
                        return gzipDecompress(bArr);
                    }
                    return bArr;
                case 3748713:
                    if (str.equals("zstd")) {
                        return zstdDecompress(bArr, i);
                    }
                    return bArr;
                default:
                    return bArr;
            }
        }
        return bArr;
    }

    public static boolean canUseCompressedBody(int i, byte[] bArr, CompressType compressType, CompressData compressData) {
        if (bArr == null || bArr.length <= 3) {
            return false;
        }
        if (!sCompressOptEnabled) {
            return true;
        }
        if (bArr.length >= i) {
            compressData.failedCode = DisableCompress.BODY_SIZE_OVERFLOW.getReason();
            return false;
        }
        if (compressType == CompressType.GZIP) {
            byte b = bArr[0];
            byte b2 = bArr[1];
            byte b3 = bArr[2];
            if (b == 31 && b2 == -117 && b3 == 8) {
                return true;
            }
            compressData.failedCode = DisableCompress.GZIP_PREFIX_MISMATCH.getReason();
            compressData.failedPrefixData = byteArrayToHexString(new byte[]{b, b2, b3});
            return false;
        }
        if (compressType != CompressType.ZSTD) {
            return true;
        }
        byte b4 = bArr[0];
        byte b5 = bArr[1];
        byte b6 = bArr[2];
        if (b4 == 40 && b5 == -75 && b6 == 47) {
            return true;
        }
        compressData.failedCode = DisableCompress.ZSTD_PREFIX_MISMATCH.getReason();
        compressData.failedPrefixData = byteArrayToHexString(new byte[]{b4, b5, b6});
        return false;
    }

    public static CompressData compressBody(byte[] bArr, int i, String str, String str2, boolean z) throws Throwable {
        CompressData compressData = new CompressData(0);
        if (sGlobalCompressDisabled.booleanValue()) {
            Logger.debug();
            compressData.failedCode = DisableCompress.GLOBAL_DISABLE.getReason();
            return compressData;
        }
        if (sRequestCompressEnabled) {
            CompressType compressType = sCompressType;
            CompressType compressType2 = CompressType.NONE;
            if (compressType != compressType2) {
                CompressType compressType3 = getCompressType(str, str2);
                if (!z && compressType3 == compressType2) {
                    Logger.debug();
                    compressData.failedCode = DisableCompress.URL_MISMATCH.getReason();
                    return compressData;
                }
                if (i <= sMaxBodyCompressSize && i >= sMinBodyCompressSize) {
                    if (compressType3 == CompressType.GZIP) {
                        byte[] bArrGzipCompress = gzipCompress(bArr, i);
                        if (!canUseCompressedBody(i, bArrGzipCompress, compressType3, compressData)) {
                            return compressData;
                        }
                        compressData.data = bArrGzipCompress;
                        compressData.type = compressType3;
                        compressData.contentEncoding = "gzip";
                        return compressData;
                    }
                    if (compressType3 == CompressType.BROTLI) {
                        byte[] bArrBrotliCompress = brotliCompress(bArr, i, sBrotliCompressQuality);
                        if (!canUseCompressedBody(i, bArrBrotliCompress, compressType3, compressData)) {
                            return compressData;
                        }
                        compressData.data = bArrBrotliCompress;
                        compressData.type = compressType3;
                        compressData.contentEncoding = "br";
                        return compressData;
                    }
                    if (compressType3 == CompressType.ZSTD) {
                        byte[] bArrZstdCompress = zstdCompress(bArr, sZstdCompressLevel);
                        if (!canUseCompressedBody(i, bArrZstdCompress, compressType3, compressData)) {
                            return compressData;
                        }
                        compressData.data = bArrZstdCompress;
                        compressData.type = compressType3;
                        compressData.contentEncoding = "zstd";
                        return compressData;
                    }
                    return null;
                }
                Logger.debug();
                compressData.failedCode = DisableCompress.BODY_SIZE_MISMATCH.getReason();
                return compressData;
            }
        }
        Logger.debug();
        compressData.failedCode = DisableCompress.TNC_DISABLE.getReason();
        return compressData;
    }
}
