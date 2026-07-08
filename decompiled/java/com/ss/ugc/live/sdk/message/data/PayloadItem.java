package com.ss.ugc.live.sdk.message.data;

import X.C2221941Bxo;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes35.dex */
public class PayloadItem {
    public String compressType;
    public FullLinkTrack fullLinkTrack;
    public List<C2221941Bxo> headers;
    public long logId;
    public final Map<String, Object> mExtraParams = new HashMap();
    public final MessageTrackTimeInfo messageTrackTimeInfo = new MessageTrackTimeInfo();
    public byte[] payload;
    public String payloadEncoding;
    public String payloadType;
    public long seqId;
    public long serverTime;

    public String getCompressType() {
        return this.compressType;
    }

    public Map<String, Object> getExtraParams() {
        return this.mExtraParams;
    }

    public List<C2221941Bxo> getHeaders() {
        return this.headers;
    }

    public long getLogId() {
        return this.logId;
    }

    public MessageTrackTimeInfo getMessageTrackTimeInfo() {
        return this.messageTrackTimeInfo;
    }

    public byte[] getPayload() {
        return this.payload;
    }

    public String getPayloadEncoding() {
        return this.payloadEncoding;
    }

    public String getPayloadType() {
        return this.payloadType;
    }

    public long getSeqId() {
        return this.seqId;
    }

    public long getServerTime() {
        return this.serverTime;
    }

    public void setCompressType(String str) {
        this.compressType = str;
    }

    public void setHeaders(List<C2221941Bxo> list) {
        this.headers = list;
    }

    public void setLogId(long j) {
        this.logId = j;
    }

    public void setPayload(byte[] bArr) {
        this.payload = bArr;
    }

    public void setPayloadEncoding(String str) {
        this.payloadEncoding = str;
    }

    public void setPayloadType(String str) {
        this.payloadType = str;
    }

    public void setSeqId(long j) {
        this.seqId = j;
    }

    public void setServerTime(long j) {
        this.serverTime = j;
    }

    public PayloadItem(String str, byte[] bArr, String str2, long j, long j2) {
        this.payloadType = str;
        this.payload = bArr;
        this.compressType = str2;
        this.logId = j;
        this.serverTime = j2;
    }

    public PayloadItem(String str, String str2, byte[] bArr, List<C2221941Bxo> list, long j, long j2) {
        this.payloadType = str;
        this.payloadEncoding = str2;
        this.payload = bArr;
        this.headers = list;
        this.logId = j;
        this.seqId = j2;
    }

    public PayloadItem(String str, byte[] bArr, String str2, long j, long j2, long j3, List<C2221941Bxo> list) {
        this.payloadType = str;
        this.payload = bArr;
        this.compressType = str2;
        this.logId = j;
        this.seqId = j2;
        this.serverTime = j3;
        this.headers = list;
    }
}
