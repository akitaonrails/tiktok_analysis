package com.mammon.audiosdk.structures;

import com.mammon.audiosdk.enums.SAMICoreHttpPayloadType;
import com.mammon.audiosdk.enums.SAMICoreTokenType;

/* JADX INFO: loaded from: classes4.dex */
public class SAMICoreHttpCommonContextCreateParameter {
    public String apiNamespace;
    public String appKey;
    public int connectTimeoutMs;
    public String customBodyItem;
    public byte[] data;
    public String header;
    public long mixedTokenTimestamp;
    public Object requestPayload;
    public SAMICoreHttpPayloadType requestPayloadType;
    public SAMICoreHttpPayloadType responsePayloadType;
    public String token;
    public SAMICoreTokenType tokenType;
    public String url;
    public String version;

    public int getRequestPayloadType() {
        SAMICoreHttpPayloadType sAMICoreHttpPayloadType = this.requestPayloadType;
        if (sAMICoreHttpPayloadType != null) {
            return sAMICoreHttpPayloadType.getValue();
        }
        System.out.println("requestPayloadType is null, return 0 as fallback!");
        return 0;
    }

    public int getResponsePayloadType() {
        SAMICoreHttpPayloadType sAMICoreHttpPayloadType = this.responsePayloadType;
        if (sAMICoreHttpPayloadType != null) {
            return sAMICoreHttpPayloadType.getValue();
        }
        System.out.println("responsePayloadType is null, return 0 as fallback!");
        return 0;
    }

    public int getTokenType() {
        SAMICoreTokenType sAMICoreTokenType = this.tokenType;
        if (sAMICoreTokenType != null) {
            return sAMICoreTokenType.getValue();
        }
        System.out.println("tokenType is null, return 0 as fallback!");
        return 0;
    }
}
