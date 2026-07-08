package com.ss.bduploader.net;

/* JADX INFO: loaded from: classes24.dex */
public class BDUploadDNSInfo {
    public Error mErr;
    public String mErrorStr;
    public long mExpiredTime;
    public String mExtraInfo;
    public String mHost;
    public String mId;
    public String mIpList;
    public int mType;

    public BDUploadDNSInfo(int i, String str, String str2, long j, String str3) {
        this.mType = i;
        this.mHost = str;
        this.mIpList = str2;
        this.mExpiredTime = j;
        this.mId = str3;
    }

    public BDUploadDNSInfo(int i, String str, String str2, long j, String str3, String str4) {
        this.mType = i;
        this.mHost = str;
        this.mIpList = str2;
        this.mExpiredTime = j;
        this.mId = str3;
        this.mErrorStr = str4;
    }
}
