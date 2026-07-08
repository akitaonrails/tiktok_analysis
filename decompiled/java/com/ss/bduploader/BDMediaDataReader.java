package com.ss.bduploader;

/* JADX INFO: loaded from: classes36.dex */
public interface BDMediaDataReader {
    int close(int i);

    long getValue(int i, int i2);

    int open(int i);

    int read(int i, long j, byte[] bArr, int i2);
}
