package com.ss.bduploader;

/* JADX INFO: loaded from: classes35.dex */
public class BDImageInfo {
    public String mEncryptionMeta;
    public long mErrorCode;
    public String mErrorMsg;
    public int mFileIndex;
    public String mImageTosKey;
    public String mMetaInfo;
    public long mProgress;

    public BDImageInfo(String str, long j, String str2, int i, String str3, String str4) {
        this.mImageTosKey = str;
        this.mProgress = j;
        this.mErrorCode = j;
        this.mErrorMsg = str2;
        this.mFileIndex = i;
        this.mMetaInfo = str3;
        this.mEncryptionMeta = str4;
    }
}
