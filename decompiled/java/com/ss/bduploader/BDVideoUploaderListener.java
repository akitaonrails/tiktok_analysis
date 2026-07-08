package com.ss.bduploader;

/* JADX INFO: loaded from: classes35.dex */
public interface BDVideoUploaderListener {
    String getStringFromExtern(int i);

    void onLog(int i, int i2, String str);

    void onNotify(int i, long j, BDVideoInfo bDVideoInfo);

    void onUploadVideoStage(int i, long j);

    int videoUploadCheckNetState(int i, int i2);
}
