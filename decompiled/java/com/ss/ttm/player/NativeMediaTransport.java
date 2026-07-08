package com.ss.ttm.player;

import android.util.AndroidRuntimeException;
import com.ss.ttm.player.MediaTransport;

/* JADX INFO: loaded from: classes24.dex */
public class NativeMediaTransport extends MediaTransport {
    public static boolean isNativeMediaTransport(MediaTransport mediaTransport) {
        return mediaTransport instanceof NativeMediaTransport;
    }

    @Override // com.ss.ttm.player.MediaTransport
    public final void sendPacket(MediaTransport.MediaPacket mediaPacket) {
        throw new AndroidRuntimeException("Should not be here");
    }
}
