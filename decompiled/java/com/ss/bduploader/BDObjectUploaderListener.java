package com.ss.bduploader;

/* JADX INFO: loaded from: classes35.dex */
public interface BDObjectUploaderListener {
    int objectUploadCheckNetState(int i, int i2);

    void onLog(int i, int i2, String str);

    void onNotify(int i, long j, BDObjectInfo bDObjectInfo);
}
