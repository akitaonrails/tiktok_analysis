package com.ss.android.vesdk;

import X.AbstractC2239611ClD;
import X.C0VSJ;
import X.C0VSP;
import X.C20307314d5;
import X.C2188811AlT;
import X.C2484209oO;
import X.C580950MqT;
import X.C794210VDn;
import X.EnumC2007907tl;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ttve.nativePort.TEVideoUtils;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes31.dex */
public class VERecordData implements Parcelable {
    public String concatAudio;
    public String concatVideo;
    public List<VERecordSegmentData> mSegmentDataList;
    public boolean mUseMusic;
    public static final Parcelable.Creator<VERecordData> CREATOR = new C20307314d5(6);
    public static final String TAG = "VERecordData";
    public static final String[] DATAFIELD = {"counts", "audioLengths", "speeds", "musicStartTime", "encodeMode", "offset", "videoQuality", "random", "duatStartTime", "audioEffects", "newSync", "encodeMethod", "videoLengths"};
    public static final String[] suffixs = {"_frag_v", "_frag_a"};

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean isSegmentOriginLenth() {
        for (VERecordSegmentData vERecordSegmentData : this.mSegmentDataList) {
            long j = (vERecordSegmentData.mTrimOut - vERecordSegmentData.mTrimIn) / 1000;
            long j2 = (vERecordSegmentData.mCutTrimOut - vERecordSegmentData.mCutTrimIn) / 1000;
            String str = TAG;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("segmentData.mTrimOut: ");
            sbLIZ.append(vERecordSegmentData.mTrimOut);
            sbLIZ.append(" segmentData.mTrimIn: ");
            sbLIZ.append(vERecordSegmentData.mTrimIn);
            sbLIZ.append(" segmentData.mVideoLength: ");
            sbLIZ.append(vERecordSegmentData.mVideoLength);
            C2484209oO.LIZ(str, C2188811AlT.LIZIZ(sbLIZ));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("segmentData.mCutTrimOut: ");
            sbLIZ2.append(vERecordSegmentData.mCutTrimOut);
            sbLIZ2.append(" segmentData.mCutTrimIn: ");
            sbLIZ2.append(vERecordSegmentData.mCutTrimIn);
            sbLIZ2.append(" segmentData.mAudioLength: ");
            sbLIZ2.append(vERecordSegmentData.mAudioLength);
            C2484209oO.LIZ(str, C2188811AlT.LIZIZ(sbLIZ2));
            if (vERecordSegmentData.mEnable) {
                long j3 = vERecordSegmentData.mVideoLength;
                if (j < j3 / 1000 || j2 < j3 / 1000) {
                }
            }
            C2484209oO.LIZJ(str, "is not Segment Origin Lenth");
            return false;
        }
        return true;
    }

    public VERecordData() {
    }

    public List<VERecordSegmentData> getSegmentData() {
        return this.mSegmentDataList;
    }

    public boolean isUseMusic() {
        return this.mUseMusic;
    }

    /* JADX INFO: loaded from: classes9.dex */
    public static final class VERecordSegmentData implements Parcelable {
        public static final Parcelable.Creator<VERecordSegmentData> CREATOR = new C580950MqT(7);
        public String mAudio;
        public long mAudioLength;
        public long mCutTrimIn;
        public long mCutTrimOut;
        public boolean mEnable;
        public ROTATE_DEGREE mRotate;
        public float mSpeed;
        public long mTrimIn;
        public long mTrimOut;
        public String mVideo;
        public long mVideoLength;
        public float mVideoSpeed;
        public boolean mWithNoSpeedBoth;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public long getCutTrimIn() {
            return this.mCutTrimIn;
        }

        public long getCutTrimOut() {
            return this.mCutTrimOut;
        }

        public VERecordSegmentData(Parcel parcel) {
            boolean z;
            this.mVideoSpeed = 1.0f;
            this.mVideo = parcel.readString();
            this.mAudio = parcel.readString();
            this.mVideoLength = parcel.readLong();
            this.mAudioLength = parcel.readLong();
            this.mVideoSpeed = parcel.readFloat();
            this.mSpeed = parcel.readFloat();
            this.mRotate = (ROTATE_DEGREE) parcel.readParcelable(ROTATE_DEGREE.class.getClassLoader());
            this.mTrimIn = parcel.readLong();
            this.mTrimOut = parcel.readLong();
            if (parcel.readByte() != 0) {
                z = true;
            } else {
                z = false;
            }
            this.mEnable = z;
            this.mCutTrimIn = parcel.readLong();
            this.mCutTrimOut = parcel.readLong();
            this.mWithNoSpeedBoth = parcel.readByte() != 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.mVideo);
            parcel.writeString(this.mAudio);
            parcel.writeLong(this.mVideoLength);
            parcel.writeLong(this.mAudioLength);
            parcel.writeFloat(this.mVideoSpeed);
            parcel.writeFloat(this.mSpeed);
            parcel.writeParcelable(this.mRotate, i);
            parcel.writeLong(this.mTrimIn);
            parcel.writeLong(this.mTrimOut);
            parcel.writeByte(this.mEnable ? (byte) 1 : (byte) 0);
            parcel.writeLong(this.mCutTrimIn);
            parcel.writeLong(this.mCutTrimOut);
            parcel.writeByte(this.mWithNoSpeedBoth ? (byte) 1 : (byte) 0);
        }

        public VERecordSegmentData(String str, long j, String str2, long j2, float f, long j3, long j4, boolean z) {
            this.mVideoSpeed = 1.0f;
            this.mVideo = str;
            this.mAudio = str2;
            this.mVideoLength = j;
            this.mAudioLength = j2;
            this.mSpeed = f;
            this.mTrimIn = j3;
            this.mCutTrimIn = j3;
            this.mTrimOut = j4;
            this.mCutTrimOut = j4;
            this.mEnable = z;
        }

        public VERecordSegmentData(String str, long j, String str2, long j2, float f, float f2, ROTATE_DEGREE rotate_degree, long j3, long j4, boolean z) {
            this.mVideo = str;
            this.mAudio = str2;
            this.mVideoLength = j;
            this.mAudioLength = j2;
            this.mVideoSpeed = f;
            this.mSpeed = f2;
            this.mRotate = rotate_degree;
            this.mTrimIn = j3;
            this.mCutTrimIn = j3;
            this.mTrimOut = j4;
            this.mCutTrimOut = j4;
            this.mEnable = z;
        }
    }

    public VERecordData(Parcel parcel) {
        boolean z;
        this.mSegmentDataList = parcel.createTypedArrayList(VERecordSegmentData.CREATOR);
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.mUseMusic = z;
        this.concatVideo = parcel.readString();
        this.concatAudio = parcel.readString();
    }

    public VERecordSegmentData removeSegmentData(int i) {
        String str = TAG;
        C2484209oO.LJI(str, "removeSegmentData...");
        if (i >= 0 && i < this.mSegmentDataList.size()) {
            return (VERecordSegmentData) ListProtector.remove(this.mSegmentDataList, i);
        }
        C2484209oO.LIZJ(str, "Parameter error");
        return null;
    }

    public VERecordData(List<VERecordSegmentData> list, boolean z) {
        this.mSegmentDataList = list;
        this.mUseMusic = z;
    }

    public static int covertJsonToRecordData(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            C2484209oO.LIZJ(TAG, "Segmented video path is empty.");
            return -100;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(File.separatorChar);
        sbLIZ.append("");
        if (!str.endsWith(C2188811AlT.LIZIZ(sbLIZ))) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str);
            sbLIZ2.append(File.separatorChar);
            str = C2188811AlT.LIZIZ(sbLIZ2);
        }
        try {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(str);
            sbLIZ3.append("data.txt");
            C0VSJ c0vsj = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ3));
            c0vsj.createNewFile();
            BufferedWriter bufferedWriter = new BufferedWriter(new C794210VDn(c0vsj));
            int i = 0;
            while (true) {
                String[] strArr = DATAFIELD;
                if (i < strArr.length) {
                    JSONArray jSONArray = (JSONArray) jSONObject.get(strArr[i]);
                    String strLIZIZ = "";
                    for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append(strLIZIZ);
                        sbLIZ4.append(jSONArray.get(i2));
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ4);
                        if (i2 != jSONArray.length() - 1) {
                            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                            sbLIZ5.append(strLIZIZ);
                            sbLIZ5.append("\t");
                            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ5);
                        }
                    }
                    bufferedWriter.write(strLIZIZ);
                    bufferedWriter.write("\n");
                    i++;
                } else {
                    bufferedWriter.close();
                    return 0;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2484209oO.LIZJ(TAG, "Reading file contents error");
            return -1;
        }
    }

    public static JSONObject covertRecordDataToJson(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            C2484209oO.LIZJ(TAG, "Segmented video path is empty.");
            return null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(File.separatorChar);
        sbLIZ.append("");
        if (!str.endsWith(C2188811AlT.LIZIZ(sbLIZ))) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str);
            sbLIZ2.append(File.separatorChar);
            str = C2188811AlT.LIZIZ(sbLIZ2);
        }
        JSONObject jSONObject = new JSONObject();
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(str);
        sbLIZ3.append("data.txt");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
        C0VSJ c0vsj = new C0VSJ(strLIZIZ);
        if (!c0vsj.exists()) {
            String str2 = TAG;
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append(strLIZIZ);
            sbLIZ4.append(" is not exist");
            C2484209oO.LIZJ(str2, C2188811AlT.LIZIZ(sbLIZ4));
            return null;
        }
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(new C0VSP(c0vsj));
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            for (String str3 : DATAFIELD) {
                String line = bufferedReader.readLine();
                if (TextUtils.isEmpty(line) && str3 != "offset") {
                    return null;
                }
                if (str3 == "counts") {
                    CastIntegerProtector.valueOf(line).intValue();
                }
                String[] strArrSplit = line.split("\t");
                JSONArray jSONArray = new JSONArray();
                for (String str4 : strArrSplit) {
                    jSONArray.put(str4);
                }
                jSONObject.put(str3, jSONArray);
            }
            bufferedReader.close();
            inputStreamReader.close();
            return jSONObject;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2484209oO.LIZJ(TAG, "Reading file contents error");
            return null;
        }
    }

    public static VERecordData create(AbstractC2239611ClD abstractC2239611ClD, boolean z) {
        String strLIZIZ;
        long jLongValue;
        long jLongValue2;
        String strLIZJ = abstractC2239611ClD.LIZJ();
        if (TextUtils.isEmpty(strLIZJ)) {
            C2484209oO.LIZJ(TAG, "Segmented video path is empty.");
            return null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(File.separatorChar);
        sbLIZ.append("");
        if (!strLIZJ.endsWith(C2188811AlT.LIZIZ(sbLIZ))) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(strLIZJ);
            sbLIZ2.append(File.separatorChar);
            strLIZJ = C2188811AlT.LIZIZ(sbLIZ2);
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(strLIZJ);
        sbLIZ3.append("data.txt");
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
        C0VSJ c0vsj = new C0VSJ(strLIZIZ2);
        String[] strArrSplit = new String[0];
        if (!c0vsj.exists()) {
            String str = TAG;
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append(strLIZIZ2);
            sbLIZ4.append(" is not exist");
            C2484209oO.LIZJ(str, C2188811AlT.LIZIZ(sbLIZ4));
            return null;
        }
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(new C0VSP(c0vsj));
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String line = bufferedReader.readLine();
            if (TextUtils.isEmpty(line)) {
                C2484209oO.LIZJ(TAG, "not found count");
                return null;
            }
            int iIntValue = CastIntegerProtector.valueOf(line).intValue();
            String line2 = bufferedReader.readLine();
            if (TextUtils.isEmpty(line2)) {
                C2484209oO.LIZJ(TAG, "not found audioLength");
                return null;
            }
            String[] strArrSplit2 = line2.split("\t");
            String line3 = bufferedReader.readLine();
            if (TextUtils.isEmpty(line3)) {
                C2484209oO.LIZJ(TAG, "not found speed");
                return null;
            }
            String[] strArrSplit3 = line3.split("\t");
            String line4 = bufferedReader.readLine();
            if (TextUtils.isEmpty(line4)) {
                C2484209oO.LIZJ(TAG, "not found music start time");
                return null;
            }
            String[] strArrSplit4 = line4.split("\t");
            int i = 0;
            do {
                bufferedReader.readLine();
                i++;
            } while (i < 8);
            String line5 = bufferedReader.readLine();
            if (TextUtils.isEmpty(line5)) {
                C2484209oO.LJI(TAG, "not found video length");
            } else {
                strArrSplit = line5.split("\t");
            }
            bufferedReader.close();
            inputStreamReader.close();
            if (iIntValue != 0 && iIntValue == strArrSplit2.length && iIntValue == strArrSplit3.length) {
                VERecordData vERecordData = new VERecordData();
                vERecordData.mSegmentDataList = new LinkedList();
                int i2 = 1;
                if (strArrSplit4.length == iIntValue && z) {
                    vERecordData.mUseMusic = true;
                } else {
                    vERecordData.mUseMusic = false;
                }
                do {
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append(strLIZJ);
                    sbLIZ5.append(i2);
                    sbLIZ5.append("_frag_v");
                    String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ5);
                    if (vERecordData.mUseMusic) {
                        strLIZIZ = "";
                    } else {
                        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                        sbLIZ6.append(strLIZJ);
                        sbLIZ6.append(i2);
                        sbLIZ6.append("_frag_a");
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ6);
                    }
                    if (vERecordData.mUseMusic) {
                        if (strArrSplit4.length > i2) {
                            jLongValue2 = CastLongProtector.valueOf(strArrSplit4[i2]).longValue() - CastLongProtector.valueOf(strArrSplit4[i2 - 1]).longValue();
                        } else {
                            if (strArrSplit.length >= i2) {
                                jLongValue2 = CastLongProtector.valueOf(strArrSplit[i2 - 1]).longValue();
                            }
                            int[] iArr = new int[10];
                            TEVideoUtils.nativeGetFileInfo(strLIZIZ3, iArr);
                            jLongValue = iArr[3] * LSPassThroughRecordSizeConfig.DEFAULT;
                            String str2 = TAG;
                            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                            sbLIZ7.append("audioLength is 0, use file length: ");
                            sbLIZ7.append(jLongValue);
                            C2484209oO.LJI(str2, C2188811AlT.LIZIZ(sbLIZ7));
                            vERecordData.mSegmentDataList.add(new VERecordSegmentData(strLIZIZ3, jLongValue, strLIZIZ, jLongValue, CastFloatProtector.valueOf(strArrSplit3[i2 - 1]).floatValue(), 0L, jLongValue, true));
                            i2++;
                        }
                        jLongValue = jLongValue2 * 1000;
                    } else {
                        jLongValue = CastLongProtector.valueOf(strArrSplit2[i2 - 1]).longValue();
                    }
                    if (jLongValue <= 0) {
                        int[] iArr2 = new int[10];
                        TEVideoUtils.nativeGetFileInfo(strLIZIZ3, iArr2);
                        jLongValue = iArr2[3] * LSPassThroughRecordSizeConfig.DEFAULT;
                        String str22 = TAG;
                        StringBuilder sbLIZ72 = C2188811AlT.LIZ();
                        sbLIZ72.append("audioLength is 0, use file length: ");
                        sbLIZ72.append(jLongValue);
                        C2484209oO.LJI(str22, C2188811AlT.LIZIZ(sbLIZ72));
                    }
                    vERecordData.mSegmentDataList.add(new VERecordSegmentData(strLIZIZ3, jLongValue, strLIZIZ, jLongValue, CastFloatProtector.valueOf(strArrSplit3[i2 - 1]).floatValue(), 0L, jLongValue, true));
                    i2++;
                } while (i2 <= iIntValue);
                return vERecordData;
            }
            C2484209oO.LIZJ(TAG, "Read file contents error, segmented information mismatch!");
            return null;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2484209oO.LIZJ(TAG, "Reading file contents error");
            return null;
        }
    }

    public int addSegmentData(int i, VERecordSegmentData vERecordSegmentData) {
        String str = TAG;
        C2484209oO.LJI(str, "addSegmentData...");
        if (i >= 0 && i <= this.mSegmentDataList.size()) {
            ListProtector.add(this.mSegmentDataList, i, vERecordSegmentData);
            return 0;
        }
        C2484209oO.LIZJ(str, "Parameter error");
        return -100;
    }

    public VERecordSegmentData replaceSegmentData(int i, VERecordData vERecordData) {
        List<VERecordSegmentData> list;
        String str = TAG;
        C2484209oO.LJI(str, "replaceSegmentData...");
        if (i >= 0 && i < this.mSegmentDataList.size() && (list = vERecordData.mSegmentDataList) != null && list.size() != 0) {
            VERecordSegmentData vERecordSegmentData = (VERecordSegmentData) ListProtector.remove(this.mSegmentDataList, i);
            long j = vERecordSegmentData.mVideoLength;
            Iterator<VERecordSegmentData> it2 = vERecordData.mSegmentDataList.iterator();
            long j2 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                VERecordSegmentData next = it2.next();
                if ((next.mVideoLength + j2) - j >= 0) {
                    long j3 = j - j2;
                    next.mAudioLength = j3;
                    next.mVideoLength = j3;
                    next.mCutTrimOut = j3;
                    next.mTrimOut = j3;
                    ListProtector.add(this.mSegmentDataList, i, next);
                    break;
                }
                ListProtector.add(this.mSegmentDataList, i, next);
                j2 += next.mVideoLength;
                i++;
            }
            return vERecordSegmentData;
        }
        C2484209oO.LIZJ(str, "Parameter error");
        return null;
    }

    public int setTimeRange(long j, long j2) {
        String str = TAG;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setTimeRange, start: ");
        sbLIZ.append(j);
        sbLIZ.append(" end: ");
        sbLIZ.append(j2);
        C2484209oO.LJI(str, C2188811AlT.LIZIZ(sbLIZ));
        if (j2 <= j) {
            return -100;
        }
        long j3 = 0;
        for (VERecordSegmentData vERecordSegmentData : this.mSegmentDataList) {
            long j4 = vERecordSegmentData.mTrimOut;
            long j5 = vERecordSegmentData.mTrimIn;
            long j6 = j4 - j5;
            if (j3 < j || j3 + j6 > j2) {
                if (j3 + j6 > j && j3 < j2) {
                    long j7 = (j - j3) + j5;
                    long j8 = (j2 - j3) + j5;
                    if (j7 > j5) {
                        j5 = j7;
                    }
                    vERecordSegmentData.mCutTrimIn = j5;
                    if (j8 <= j4) {
                        j4 = j8;
                    }
                    vERecordSegmentData.mCutTrimOut = j4;
                } else {
                    vERecordSegmentData.mCutTrimIn = 0L;
                    vERecordSegmentData.mCutTrimOut = 0L;
                    vERecordSegmentData.mEnable = false;
                }
            }
            j3 += j6;
        }
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.mSegmentDataList);
        parcel.writeByte(this.mUseMusic ? (byte) 1 : (byte) 0);
        parcel.writeString(this.concatVideo);
        parcel.writeString(this.concatAudio);
    }

    public static String getVideoRecordFilePath(String str, int i, EnumC2007907tl enumC2007907tl) {
        String str2;
        if (enumC2007907tl == EnumC2007907tl.VIDEO) {
            str2 = "_frag_v";
        } else {
            str2 = "_frag_a";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(i);
        sbLIZ.append(str2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
