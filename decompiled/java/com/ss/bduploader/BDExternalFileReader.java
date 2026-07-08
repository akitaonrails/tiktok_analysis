package com.ss.bduploader;

import java.util.List;

/* JADX INFO: loaded from: classes35.dex */
public interface BDExternalFileReader {
    void cancel();

    long getCrc32ByOffset(long j, int i);

    long getValue(int i);

    int readSlice(int i, byte[] bArr, int i2);

    int readSliceByOffset(long j, byte[] bArr, int i, int i2);

    List<Long> readSliceByOffsetAdv(long j, byte[] bArr, int i, int i2);
}
