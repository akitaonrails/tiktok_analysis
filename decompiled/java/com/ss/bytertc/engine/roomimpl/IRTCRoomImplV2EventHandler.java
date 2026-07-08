package com.ss.bytertc.engine.roomimpl;

import com.ss.lyrax.ILyraxSubscriber;
import com.ss.lyrax.stream.LyraxStreamKey;

/* JADX INFO: loaded from: classes21.dex */
public interface IRTCRoomImplV2EventHandler {
    void onCreateLyraxSubscriber(LyraxStreamKey lyraxStreamKey, ILyraxSubscriber iLyraxSubscriber);

    void onRemoveLyraxSubscriber(LyraxStreamKey lyraxStreamKey, ILyraxSubscriber iLyraxSubscriber);

    void onRoomError(int i);
}
