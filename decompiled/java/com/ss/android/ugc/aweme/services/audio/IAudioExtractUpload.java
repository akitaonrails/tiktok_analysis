package com.ss.android.ugc.aweme.services.audio;

/* JADX INFO: loaded from: classes23.dex */
public interface IAudioExtractUpload {
    void cancelUpload();

    int consume(int i, byte[] bArr, int i2);

    void disableDeleteCacheWhenEnd(boolean z);

    long getCrc32ByOffset(long j, long j2);

    long getCurrentUploadOffset();

    long getFileSize();

    long getHeaderSize();

    long getNoConsumeBufferSize(long j, int i);

    void init(String str, String str2, boolean z);

    boolean isProduceFinish();

    void produce(byte[] bArr, long j, int i, boolean z);

    void stopUpload(boolean z);

    int streamConsume(long j, byte[] bArr, int i, int i2);
}
