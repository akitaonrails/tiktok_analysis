package com.bytedance.tts.pigeon.paas.detailpage.component.impl;

import com.bytedance.tts.pigeon.GECPigeon;
import com.bytedance.tts.pigeon.container.protocol.AbsPigeonEventProtocol;
import com.bytedance.tts.pigeon.paas.detailpage.protocol.IConversationDetailContainer;
import com.bytedance.tts.pigeon.paas.detailpage.protocol.IConversationDetailProtocol;

/* JADX INFO: loaded from: classes15.dex */
public class AbsConversationDetailComponent<T extends IConversationDetailContainer> extends AbsPigeonEventProtocol implements IConversationDetailProtocol {
    public final GECPigeon LL;
    public final T LLILLJJLI;

    public void LJJLIIIJILLIZJL() {
    }

    @Override // X.C0YXB
    public final GECPigeon LJJJJLL() {
        return this.LL;
    }

    public AbsConversationDetailComponent(GECPigeon gECPigeon, T t) {
        this.LL = gECPigeon;
        this.LLILLJJLI = t;
    }
}
