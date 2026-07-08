package com.ss.bduploader;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes35.dex */
public class BDVideoInfo {
    public String mCallbackArgs;
    public String mCoverUri;
    public String mEncryptionMeta;
    public long mErrorCode;
    public String mErrorMsg;
    public long mFileIndex;
    public JSONObject mLog;
    public long mProgress;
    public long mRetryInfo;
    public long mRetryType;
    public String mServerInfo;
    public String mTosKey;
    public String mVideoId;
    public String mVideoMediaInfo;

    public BDVideoInfo(String str, String str2, long j, String str3, String str4, String str5, String str6) {
        this(str, str2, j, str3, str4, str5, str6, null);
    }

    public BDVideoInfo(String str, String str2, long j, String str3, String str4, String str5, String str6, String str7) {
        this.mVideoId = str;
        this.mCoverUri = str2;
        this.mProgress = j;
        this.mErrorCode = j;
        this.mErrorMsg = str3;
        this.mTosKey = str4;
        this.mVideoMediaInfo = str5;
        this.mEncryptionMeta = str6;
        this.mCallbackArgs = str7;
    }

    public BDVideoInfo(String str, String str2, long j, int i, String str3, String str4, String str5, String str6, String str7) {
        this.mVideoId = str;
        this.mCoverUri = str2;
        long j2 = i;
        this.mProgress = j2;
        this.mFileIndex = j;
        this.mErrorCode = j2;
        this.mErrorMsg = str3;
        this.mTosKey = str4;
        this.mVideoMediaInfo = str5;
        this.mEncryptionMeta = str6;
        this.mCallbackArgs = str7;
    }
}
