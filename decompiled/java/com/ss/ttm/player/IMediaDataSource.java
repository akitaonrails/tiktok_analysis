package com.ss.ttm.player;

import java.io.Closeable;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes24.dex */
public interface IMediaDataSource extends Closeable {
    int close(int i);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    String getFilePath();

    int getMDSVersion();

    long getSize();

    long getSize(int i);

    int open(String str);

    int readAt(int i, long j, ByteBuffer byteBuffer, int i2, int i3);

    int readAt(long j, byte[] bArr, int i, int i2);
}
