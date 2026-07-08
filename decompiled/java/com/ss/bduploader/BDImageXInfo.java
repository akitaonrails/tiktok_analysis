package com.ss.bduploader;

/* JADX INFO: loaded from: classes35.dex */
public class BDImageXInfo {
    public String mEncryptionMeta;
    public BDImageXE2EEncryptionInfo mEnd2EndEncryption;
    public long mErrorCode;
    public String mErrorMsg;
    public int mFileIndex;
    public String mImageTosKey;
    public String mMetaInfo;
    public long mProgress;

    public BDImageXInfo(String str, long j, int i, String str2, String str3, BDImageXE2EEncryptionInfo bDImageXE2EEncryptionInfo) {
        this.mImageTosKey = str;
        this.mProgress = j;
        this.mErrorCode = j;
        this.mFileIndex = i;
        this.mMetaInfo = str2;
        this.mEncryptionMeta = str3;
        this.mEnd2EndEncryption = bDImageXE2EEncryptionInfo;
    }
}
