package com.mammon.audiosdk.structures;

import com.mammon.audiosdk.enums.SAMICoreHttpPayloadType;

/* JADX INFO: loaded from: classes4.dex */
public class SAMICoreHttpCommonContextResponseBody {
    public String apiNamespace;
    public byte[] data;
    public Object payload;
    public SAMICoreHttpPayloadType payloadType;
    public int statusCode;
    public String statusText;
    public String taskId;

    public int getPayloadType() {
        SAMICoreHttpPayloadType sAMICoreHttpPayloadType = this.payloadType;
        if (sAMICoreHttpPayloadType != null) {
            return sAMICoreHttpPayloadType.getValue();
        }
        System.out.println("payloadType is null, return 0 as fallback!");
        return 0;
    }

    public void setPayloadType(int i) {
        this.payloadType = SAMICoreHttpPayloadType.fromInt(i);
    }
}
