package com.ss.bytertc.engine;

import com.ss.bytertc.engine.handler.IRTSRoomEventHandler;

/* JADX INFO: loaded from: classes33.dex */
public abstract class RTSRoom {
    public abstract void destroy();

    public abstract int joinRoom();

    public abstract int leaveRoom();

    public abstract long sendRoomBinaryMessage(byte[] bArr);

    public abstract long sendRoomMessage(String str);

    public abstract int setRTSRoomEventHandler(IRTSRoomEventHandler iRTSRoomEventHandler);
}
