package com.ss.mediakit.net;

/* JADX INFO: loaded from: classes24.dex */
public class AVMDLDNSInfo {
    public String mErrorStr;
    public long mExpiredTime;
    public String mExtraInfo;
    public String mHost;
    public String[] mHosts;
    public String mId;
    public String mIpList;
    public int mTTL;
    public int mType;

    public AVMDLDNSInfo() {
    }

    public AVMDLDNSInfo(int i, String str, String str2, long j, String str3) {
        this.mType = i;
        this.mHost = str;
        this.mIpList = str2;
        this.mExpiredTime = j;
        this.mId = str3;
    }

    public AVMDLDNSInfo(int i, String[] strArr, String str, long j, String str2) {
        this.mType = i;
        this.mHosts = strArr;
        this.mIpList = str;
        this.mExpiredTime = j;
        this.mId = str2;
    }

    public AVMDLDNSInfo(int i, String str, String str2, long j, String str3, String str4) {
        this.mType = i;
        this.mHost = str;
        this.mIpList = str2;
        this.mExpiredTime = j;
        this.mId = str3;
        this.mErrorStr = str4;
    }
}
