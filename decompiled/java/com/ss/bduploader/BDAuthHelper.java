package com.ss.bduploader;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.bduploader.AWSV4Auth;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes14.dex */
public class BDAuthHelper {
    public String accessKeyID;
    public String authorization;
    public TreeMap<String, String> awsHeaders;
    public String canonicalURI;
    public boolean debug;
    public String host;
    public String httpMethodName;
    public String payload;
    public TreeMap<String, ArrayList<String>> queryParameters;
    public String queryStr;
    public String regionName;
    public String secretAccessKey;
    public String serviceName;
    public String xAmzDate;
    public String xAmzSecurityToken;

    public Map<String, String> getSignature() {
        TreeMap<String, String> treeMap = new TreeMap<>();
        treeMap.put("x-amz-date", this.xAmzDate);
        treeMap.put("X-Amz-Security-Token", this.xAmzSecurityToken);
        parseAPIString(this.queryStr);
        String str = TextUtils.isEmpty(this.canonicalURI) ? "/top/v1" : this.canonicalURI;
        AWSV4Auth.Builder builder = new AWSV4Auth.Builder(this.accessKeyID, this.secretAccessKey);
        builder.regionName(this.regionName);
        builder.serviceName(this.serviceName);
        builder.httpMethodName(this.httpMethodName);
        builder.canonicalURI(str);
        builder.queryParameters(this.queryParameters);
        builder.awsHeaders(treeMap);
        builder.payload(this.payload);
        Map<String, String> headers = builder.build().getHeaders();
        this.authorization = headers.get("Authorization");
        return headers;
    }

    private String parseAPIString(String str) {
        if (TextUtils.isEmpty(str)) {
            return "parseAPIString:query string is empty";
        }
        try {
            String[] strArrSplit = str.split("[?]");
            if (strArrSplit.length < 2) {
                return "parseAPIString:query string param is empty";
            }
            String[] strArrSplit2 = strArrSplit[1].split("&");
            TreeMap<String, ArrayList<String>> treeMap = new TreeMap<>();
            for (String str2 : strArrSplit2) {
                String[] strArrSplit3 = str2.split("=");
                if (strArrSplit3.length >= 2) {
                    if (!treeMap.containsKey(strArrSplit3[0])) {
                        ArrayList<String> arrayList = new ArrayList<>();
                        arrayList.add(strArrSplit3[1]);
                        treeMap.put(strArrSplit3[0], arrayList);
                    } else {
                        treeMap.get(strArrSplit3[0]).add(strArrSplit3[1]);
                    }
                }
            }
            this.queryParameters = treeMap;
            return null;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public String getStringValue(int i) {
        getSignature();
        if (i != 10) {
            return null;
        }
        return this.authorization;
    }

    public void setAwsHeaders(TreeMap<String, String> treeMap) {
        this.awsHeaders = treeMap;
    }

    public void setQueryParameters(TreeMap<String, ArrayList<String>> treeMap) {
        this.queryParameters = treeMap;
    }

    public void setStringValue(int i, String str) {
        switch (i) {
            case 0:
                this.accessKeyID = str;
                break;
            case 1:
                this.secretAccessKey = str;
                break;
            case 2:
                this.regionName = str;
                break;
            case 3:
                this.serviceName = str;
                break;
            case 4:
                this.httpMethodName = str;
                break;
            case 5:
                this.canonicalURI = str;
                break;
            case 6:
                this.payload = str;
                break;
            case 7:
                this.host = str;
                break;
            case 8:
                this.xAmzDate = str;
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                this.xAmzSecurityToken = str;
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                this.queryStr = str;
                break;
        }
    }
}
