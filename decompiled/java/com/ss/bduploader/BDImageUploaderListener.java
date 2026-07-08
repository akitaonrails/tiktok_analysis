package com.ss.bduploader;

/* JADX INFO: loaded from: classes35.dex */
public interface BDImageUploaderListener {
    int imageUploadCheckNetState(int i, int i2);

    void onLog(int i, int i2, String str);

    void onNotify(int i, long j, BDImageInfo bDImageInfo);
}
