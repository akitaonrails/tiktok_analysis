package com.bytedance.common.wschannel;

import X.InterfaceC821350WJx;
import com.bytedance.common.wschannel.model.WsChannelMsg;

/* JADX INFO: loaded from: classes14.dex */
public final class MainProcessMsg extends WsChannelMsg {
    public final InterfaceC821350WJx mListener;
    public final WsChannelMsg origin;

    public MainProcessMsg(WsChannelMsg wsChannelMsg, InterfaceC821350WJx interfaceC821350WJx) {
        super(wsChannelMsg);
        this.origin = wsChannelMsg;
        this.mListener = interfaceC821350WJx;
    }
}
