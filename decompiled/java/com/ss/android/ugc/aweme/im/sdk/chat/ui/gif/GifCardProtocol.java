package com.ss.android.ugc.aweme.im.sdk.chat.ui.gif;

import X.C01GW;
import X.C0IB0;
import X.C0ICJ;
import X.C0ICK;
import X.C0ICS;
import X.C869590Y9l;
import X.C898790ZNt;
import X.C902710ZbB;
import X.InterfaceC461380I7k;
import X.InterfaceC902790ZbJ;
import X.InterfaceC903660Zci;
import com.ss.android.ugc.aweme.im.messagelist.api.cell.MessageListProtocolEnum;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutPowerCell;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class GifCardProtocol implements SkeletonMessageListProtocol<C0ICK, C0ICJ> {
    public final Class<? extends IMSkeletonLayoutPowerCell<?, C0ICK>> LL = GifSendPowerCell.class;
    public final Class<? extends IMSkeletonLayoutPowerCell<?, C0ICJ>> LLILLJJLI = GifReceivePowerCell.class;
    public final C898790ZNt LLILLL = new C898790ZNt(new int[]{5});
    public final MessageListProtocolEnum LLILZ = MessageListProtocolEnum.GIF;

    @Override // X.InterfaceC902780ZbI
    public final InterfaceC902790ZbJ<C0ICJ> An() {
        return null;
    }

    @Override // X.InterfaceC902780ZbI
    public final InterfaceC902790ZbJ<C0ICK> Wh() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC902770ZbH
    public final List<C869590Y9l> intercept(List<? extends C869590Y9l> list) {
        return list;
    }

    @Override // X.InterfaceC902770ZbH
    public final boolean isEnabled() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol
    public final Class<? extends IMSkeletonLayoutPowerCell<?, C0ICK>> da() {
        return this.LL;
    }

    @Override // X.InterfaceC902770ZbH
    public final MessageListProtocolEnum getInterceptOrdering() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC902770ZbH
    public final /* bridge */ /* synthetic */ InterfaceC903660Zci getMsgHandlerCheck() {
        return this.LLILLL;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol
    public final Class<? extends IMSkeletonLayoutPowerCell<?, C0ICJ>> gr() {
        return this.LLILLJJLI;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol
    public final C902710ZbB Vx2(C01GW c01gw) {
        return new C902710ZbB(this, c01gw);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol
    public final InterfaceC461380I7k m72(C869590Y9l c869590Y9l, C0IB0 c0ib0) {
        return new C0ICK(C0ICS.LIZ(true), c0ib0);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol
    public final InterfaceC461380I7k ts1(C869590Y9l c869590Y9l, C0IB0 c0ib0) {
        return new C0ICJ(C0ICS.LIZ(false), c0ib0);
    }
}
