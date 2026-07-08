package com.ss.android.ugc.aweme.im.sdk.chat.ui.text.protocol;

import X.C01GW;
import X.C0IB0;
import X.C461460I7s;
import X.C461470I7t;
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
import kotlin.jvm.internal.AFwS236S0000000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class TextBigEmojiProtocol implements SkeletonMessageListProtocol<C461470I7t, C461460I7s> {
    public final Class<? extends IMSkeletonLayoutPowerCell<?, C461470I7t>> LL = TextBigEmojiSendPowerCell.class;
    public final Class<? extends IMSkeletonLayoutPowerCell<?, C461460I7s>> LLILLJJLI = TextBigEmojiReceivePowerCell.class;
    public final C898790ZNt LLILLL = new C898790ZNt(new int[]{7}, AFwS236S0000000_6.get$arr$(184));
    public final MessageListProtocolEnum LLILZ = MessageListProtocolEnum.TEXT_BIG_EMOJI;

    @Override // X.InterfaceC902780ZbI
    public final InterfaceC902790ZbJ<C461460I7s> An() {
        return null;
    }

    @Override // X.InterfaceC902780ZbI
    public final InterfaceC902790ZbJ<C461470I7t> Wh() {
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
    public final Class<? extends IMSkeletonLayoutPowerCell<?, C461470I7t>> da() {
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
    public final Class<? extends IMSkeletonLayoutPowerCell<?, C461460I7s>> gr() {
        return this.LLILLJJLI;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol
    public final C902710ZbB Vx2(C01GW c01gw) {
        return new C902710ZbB(this, c01gw);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol
    public final InterfaceC461380I7k m72(C869590Y9l c869590Y9l, C0IB0 c0ib0) {
        return new C461470I7t(c0ib0);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol
    public final InterfaceC461380I7k ts1(C869590Y9l c869590Y9l, C0IB0 c0ib0) {
        return new C461460I7s(c0ib0);
    }
}
