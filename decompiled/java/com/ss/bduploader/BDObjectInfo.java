package com.ss.bduploader;

/* JADX INFO: loaded from: classes23.dex */
public class BDObjectInfo {
    public String mEncryptionMeta;
    public long mErrorCode;
    public int mFileIndex;
    public String mImageTosKey;
    public String mMetaInfo;
    public long mProgress;

    public BDObjectInfo(String str, long j, int i, String str2, String str3) {
        this.mImageTosKey = str;
        this.mProgress = j;
        this.mErrorCode = j;
        this.mFileIndex = i;
        this.mMetaInfo = str2;
        this.mEncryptionMeta = str3;
    }
}
