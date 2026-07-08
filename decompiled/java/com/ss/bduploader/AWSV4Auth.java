package com.ss.bduploader;

import X.C2188811AlT;
import X.C786410Ut5;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;
import java.util.TreeMap;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes14.dex */
public class AWSV4Auth {
    public static String MAC_ALGORITHM = "HmacSHA256";
    public static final char[] hexArray;
    public static Mac mMacInstance;
    public static MessageDigest mMessageDigest;
    public String accessKeyID;
    public TreeMap<String, String> awsHeaders;
    public boolean awsHeadersHasTimestamp;
    public String canonicalURI;
    public String currentDate;
    public boolean debug;
    public String httpMethodName;
    public String payload;
    public TreeMap<String, ArrayList<String>> queryParameters;
    public String regionName;
    public String secretAccessKey;
    public String serviceName;
    public String strSignedHeader;
    public String xAmzDate;

    public static class Builder {
        public String accessKeyID;
        public TreeMap<String, String> awsHeaders;
        public String canonicalURI;
        public boolean debug;
        public String httpMethodName;
        public String payload;
        public TreeMap<String, ArrayList<String>> queryParameters;
        public String regionName;
        public String secretAccessKey;
        public String serviceName;

        public Builder debug() {
            this.debug = true;
            return this;
        }

        public AWSV4Auth build() {
            return new AWSV4Auth(this);
        }

        public Builder awsHeaders(TreeMap<String, String> treeMap) {
            this.awsHeaders = treeMap;
            return this;
        }

        public Builder canonicalURI(String str) {
            this.canonicalURI = str;
            return this;
        }

        public Builder httpMethodName(String str) {
            this.httpMethodName = str;
            return this;
        }

        public Builder payload(String str) {
            this.payload = str;
            return this;
        }

        public Builder queryParameters(TreeMap<String, ArrayList<String>> treeMap) {
            this.queryParameters = treeMap;
            return this;
        }

        public Builder regionName(String str) {
            this.regionName = str;
            return this;
        }

        public Builder serviceName(String str) {
            this.serviceName = str;
            return this;
        }

        public Builder(String str, String str2) {
            this.accessKeyID = str;
            this.secretAccessKey = str2;
        }
    }

    static {
        try {
            mMacInstance = Mac.getInstance("HmacSHA256");
            mMessageDigest = MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        hexArray = "0123456789ABCDEF".toCharArray();
    }

    private String findTimestampFromHeaderCaseInsensitive() {
        TreeMap<String, String> treeMap = this.awsHeaders;
        if (treeMap == null || treeMap.isEmpty()) {
            return null;
        }
        for (Map.Entry<String, String> entry : this.awsHeaders.entrySet()) {
            if (entry.getKey().toLowerCase().equals("x-amz-date")) {
                return entry.getValue();
            }
        }
        return null;
    }

    private String getTimeStamp() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd'T'HHmmss'Z'");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat.format(new Date());
    }

    private String prepareCanonicalRequest() {
        StringBuilder sb = new StringBuilder("");
        sb.append(this.httpMethodName);
        sb.append("\n");
        String str = this.canonicalURI;
        String str2 = (str == null || str.trim().isEmpty()) ? "/" : this.canonicalURI;
        this.canonicalURI = str2;
        sb.append(str2);
        sb.append("\n");
        StringBuilder sb2 = new StringBuilder("");
        TreeMap<String, ArrayList<String>> treeMap = this.queryParameters;
        if (treeMap == null || treeMap.isEmpty()) {
            sb2.append("\n");
        } else {
            for (Map.Entry<String, ArrayList<String>> entry : this.queryParameters.entrySet()) {
                String key = entry.getKey();
                ArrayList<String> value = entry.getValue();
                for (int i = 0; i < value.size(); i++) {
                    sb2.append(key);
                    sb2.append("=");
                    sb2.append(encodeParameter((String) ListProtector.get(value, i)));
                    sb2.append("&");
                }
            }
            sb2.deleteCharAt(sb2.lastIndexOf("&"));
            sb2.append("\n");
        }
        sb.append((CharSequence) sb2);
        StringBuilder sb3 = new StringBuilder("");
        TreeMap<String, String> treeMap2 = this.awsHeaders;
        if (treeMap2 == null || treeMap2.isEmpty()) {
            sb.append("\n");
        } else {
            TreeMap treeMap3 = new TreeMap();
            for (Map.Entry<String, String> entry2 : this.awsHeaders.entrySet()) {
                treeMap3.put(entry2.getKey().toLowerCase(), entry2.getValue().trim());
            }
            for (Map.Entry entry3 : treeMap3.entrySet()) {
                String lowerCase = ((String) entry3.getKey()).toLowerCase();
                String strTrim = ((String) entry3.getValue()).trim();
                sb3.append(lowerCase);
                sb3.append(";");
                sb.append(lowerCase);
                sb.append(":");
                sb.append(strTrim);
                sb.append("\n");
            }
            sb.append("\n");
        }
        String strSubstring = sb3.substring(0, sb3.length() - 1);
        this.strSignedHeader = strSubstring;
        sb.append(strSubstring);
        sb.append("\n");
        String str3 = this.payload;
        String str4 = str3 != null ? str3 : "";
        this.payload = str4;
        sb.append(generateHex(str4));
        if (this.debug) {
            PrintStream printStream = System.out;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("##Canonical Request:\n");
            sbLIZ.append(sb.toString());
            printStream.println(C2188811AlT.LIZIZ(sbLIZ));
        }
        return sb.toString();
    }

    public Map<String, String> getHeaders() {
        String strCalculateSignature = calculateSignature(prepareStringToSign(prepareCanonicalRequest()));
        if (strCalculateSignature == null) {
            if (!this.debug) {
                return null;
            }
            PrintStream printStream = System.out;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("##Signature:\n");
            sbLIZ.append(strCalculateSignature);
            printStream.println(C2188811AlT.LIZIZ(sbLIZ));
            return null;
        }
        HashMap map = new HashMap(0);
        for (Map.Entry<String, String> entry : this.awsHeaders.entrySet()) {
            map.put(entry.getKey(), entry.getValue());
        }
        map.put("Authorization", buildAuthorizationString(strCalculateSignature));
        if (this.debug) {
            PrintStream printStream2 = System.out;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("##Signature:\n");
            sbLIZ2.append(strCalculateSignature);
            printStream2.println(C2188811AlT.LIZIZ(sbLIZ2));
            System.out.println("##Header:");
            for (Map.Entry entry2 : map.entrySet()) {
                PrintStream printStream3 = System.out;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append((String) entry2.getKey());
                sbLIZ3.append(" = ");
                sbLIZ3.append((String) entry2.getValue());
                printStream3.println(C2188811AlT.LIZIZ(sbLIZ3));
            }
            System.out.println("================================");
        }
        return map;
    }

    public AWSV4Auth() {
    }

    public AWSV4Auth(Builder builder) {
        this.accessKeyID = builder.accessKeyID;
        this.secretAccessKey = builder.secretAccessKey;
        this.regionName = builder.regionName;
        this.serviceName = builder.serviceName;
        this.httpMethodName = builder.httpMethodName;
        this.canonicalURI = builder.canonicalURI;
        this.queryParameters = builder.queryParameters;
        TreeMap<String, String> treeMap = builder.awsHeaders;
        this.awsHeaders = treeMap;
        this.payload = builder.payload;
        this.debug = builder.debug;
        if (treeMap == null) {
            this.awsHeaders = new TreeMap<>();
        }
        String strFindTimestampFromHeaderCaseInsensitive = findTimestampFromHeaderCaseInsensitive();
        this.xAmzDate = strFindTimestampFromHeaderCaseInsensitive;
        if (strFindTimestampFromHeaderCaseInsensitive == null) {
            String timeStamp = getTimeStamp();
            this.xAmzDate = timeStamp;
            this.awsHeaders.put("x-amz-date", timeStamp);
        } else {
            this.awsHeadersHasTimestamp = true;
        }
        this.currentDate = getDateFromTimeStamp(this.xAmzDate);
    }

    private String buildAuthorizationString(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AWS4-HMAC-SHA256 Credential=");
        sbLIZ.append(this.accessKeyID);
        sbLIZ.append("/");
        sbLIZ.append(this.currentDate);
        sbLIZ.append("/");
        sbLIZ.append(this.regionName);
        sbLIZ.append("/");
        sbLIZ.append(this.serviceName);
        sbLIZ.append("/");
        sbLIZ.append("aws4_request");
        sbLIZ.append(",SignedHeaders=");
        sbLIZ.append(this.strSignedHeader);
        sbLIZ.append(",Signature=");
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    private String bytesToHex(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i = 0; i < bArr.length; i++) {
            int i2 = bArr[i] & 255;
            int i3 = i * 2;
            char[] cArr2 = hexArray;
            cArr[i3] = cArr2[i2 >>> 4];
            cArr[i3 + 1] = cArr2[i2 & 15];
        }
        return new String(cArr).toLowerCase();
    }

    private String calculateSignature(String str) {
        try {
            return bytesToHex(SHA256UseMac(getSignatureKey(this.secretAccessKey, this.currentDate, this.regionName, this.serviceName), str));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    private String encodeParameter(String str) {
        try {
            str = URLEncoder.encode(str, "UTF-8").replace("+", "%20").replace("*", "%2A").replace("%7E", "~");
            return str;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return str;
        }
    }

    public static synchronized String generateHex(String str) {
        try {
            mMessageDigest.update(str.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
        return C786410Ut5.j4("%064x", new Object[]{new BigInteger(1, mMessageDigest.digest())});
    }

    private String getDateFromTimeStamp(String str) {
        if (str != null && str.length() >= 8) {
            return str.substring(0, 8);
        }
        return null;
    }

    private String prepareStringToSign(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AWS4-HMAC-SHA256\n");
        sbLIZ.append(this.xAmzDate);
        sbLIZ.append("\n");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(strLIZIZ);
        sbLIZ2.append(this.currentDate);
        sbLIZ2.append("/");
        sbLIZ2.append(this.regionName);
        sbLIZ2.append("/");
        sbLIZ2.append(this.serviceName);
        sbLIZ2.append("/");
        sbLIZ2.append("aws4_request");
        sbLIZ2.append("\n");
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(strLIZIZ2);
        sbLIZ3.append(generateHex(str));
        String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ3);
        if (this.debug) {
            PrintStream printStream = System.out;
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("##String to sign:\n");
            sbLIZ4.append(strLIZIZ3);
            printStream.println(C2188811AlT.LIZIZ(sbLIZ4));
        }
        return strLIZIZ3;
    }

    public static synchronized byte[] SHA256UseMac(byte[] bArr, String str) {
        mMacInstance.init(new SecretKeySpec(bArr, MAC_ALGORITHM));
        return mMacInstance.doFinal(str.getBytes("UTF8"));
    }

    public static synchronized byte[] getSignatureKey(String str, String str2, String str3, String str4) {
        StringBuilder sbLIZ;
        sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AWS4");
        sbLIZ.append(str);
        return SHA256UseMac(SHA256UseMac(SHA256UseMac(SHA256UseMac(C2188811AlT.LIZIZ(sbLIZ).getBytes("UTF8"), str2), str3), str4), "aws4_request");
    }
}
