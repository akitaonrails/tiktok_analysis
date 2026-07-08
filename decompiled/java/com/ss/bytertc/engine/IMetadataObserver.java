package com.ss.bytertc.engine;

/* JADX INFO: loaded from: classes21.dex */
public interface IMetadataObserver {
    void onMetadataReceived(byte[] bArr, String str, long j);

    byte[] onReadyToSendMetadata(long j);
}
