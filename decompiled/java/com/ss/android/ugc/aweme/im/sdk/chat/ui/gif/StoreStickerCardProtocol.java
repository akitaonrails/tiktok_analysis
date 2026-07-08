package com.ss.android.ugc.aweme.im.sdk.chat.ui.gif;

import X.C01GW;
import X.C0IB0;
import X.C0ICS;
import X.C0ICW;
import X.C0ICX;
import X.C0ICY;
import X.C454960Hsk;
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
public final class StoreStickerCardProtocol implements SkeletonMessageListProtocol<C0ICY, C0ICX> {
    public final Class<? extends IMSkeletonLayoutPowerCell<?, C0ICY>> LL = StoreStickerSendPowerCell.class;
    public final Class<? extends IMSkeletonLayoutPowerCell<?, C0ICX>> LLILLJJLI = StoreStickerReceivePowerCell.class;
    public final C898790ZNt LLILLL = new C898790ZNt(new int[]{1805});
    public final MessageListProtocolEnum LLILZ = MessageListProtocolEnum.STORE_STICKER;

    @Override // X.InterfaceC902780ZbI
    public final InterfaceC902790ZbJ<C0ICX> An() {
        return null;
    }

    @Override // X.InterfaceC902780ZbI
    public final InterfaceC902790ZbJ<C0ICY> Wh() {
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
    public final Class<? extends IMSkeletonLayoutPowerCell<?, C0ICY>> da() {
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
    public final Class<? extends IMSkeletonLayoutPowerCell<?, C0ICX>> gr() {
        return this.LLILLJJLI;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol
    public final C902710ZbB Vx2(C01GW c01gw) {
        return new C902710ZbB(this, c01gw);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol
    public final InterfaceC461380I7k m72(C869590Y9l c869590Y9l, C0IB0 c0ib0) {
        return new C0ICY(C0ICS.LIZ(true), c0ib0, new C0ICW(C454960Hsk.LIZ(c869590Y9l)));
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol
    public final InterfaceC461380I7k ts1(C869590Y9l c869590Y9l, C0IB0 c0ib0) {
        return new C0ICX(C0ICS.LIZ(false), c0ib0, new C0ICW(C454960Hsk.LIZ(c869590Y9l)));
    }
}
