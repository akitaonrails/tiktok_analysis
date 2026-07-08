package com.ss.android.ugc.aweme.theater.social.protocol;

import X.C01GW;
import X.C08JS;
import X.C0IB0;
import X.C0MXN;
import X.C0ZOV;
import X.C558330Lv5;
import X.C869590Y9l;
import X.C898790ZNt;
import X.C898860ZOa;
import X.C902710ZbB;
import X.InterfaceC461380I7k;
import X.InterfaceC902790ZbJ;
import X.InterfaceC903660Zci;
import com.ss.android.ugc.aweme.im.messagelist.api.cell.MessageListProtocolEnum;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public final class AITheaterSocialFakeGeneratingMessageListProtocol implements SkeletonMessageListProtocol<C0MXN, C0MXN> {
    public final Class<AITheaterSocialFakeGeneratingSendPowerCell> LL = AITheaterSocialFakeGeneratingSendPowerCell.class;
    public final Class<AITheaterSocialFakeGeneratingReceivePowerCell> LLILLJJLI = AITheaterSocialFakeGeneratingReceivePowerCell.class;
    public final C898790ZNt LLILLL = new C898790ZNt(new int[]{4078});
    public final MessageListProtocolEnum LLILZ = MessageListProtocolEnum.FAKE_AI_THEATER_GENERATING_CARD;

    @Override // X.InterfaceC902780ZbI
    public final InterfaceC902790ZbJ<C0MXN> An() {
        return null;
    }

    @Override // X.InterfaceC902780ZbI
    public final InterfaceC902790ZbJ<C0MXN> Wh() {
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
    public final Class<AITheaterSocialFakeGeneratingSendPowerCell> da() {
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
    public final Class<AITheaterSocialFakeGeneratingReceivePowerCell> gr() {
        return this.LLILLJJLI;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol
    public final C902710ZbB Vx2(C01GW c01gw) {
        return new C902710ZbB(this, c01gw);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol
    public final InterfaceC461380I7k m72(C869590Y9l c869590Y9l, C0IB0 c0ib0) {
        C558330Lv5 c558330Lv5 = (C558330Lv5) C08JS.LIZ(c869590Y9l.getContent(), C558330Lv5.class);
        c0ib0.LIZIZ.LIZJ.getClass();
        return new C0MXN(C0IB0.LIZ(c0ib0, C0ZOV.LIZ(c0ib0.LIZIZ, new C898860ZOa(false, true, false, false)), null, 5), c558330Lv5.getSocialModel());
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol
    public final InterfaceC461380I7k ts1(C869590Y9l c869590Y9l, C0IB0 c0ib0) {
        C558330Lv5 c558330Lv5 = (C558330Lv5) C08JS.LIZ(c869590Y9l.getContent(), C558330Lv5.class);
        c0ib0.LIZIZ.LIZJ.getClass();
        return new C0MXN(C0IB0.LIZ(c0ib0, C0ZOV.LIZ(c0ib0.LIZIZ, new C898860ZOa(false, true, false, false)), null, 5), c558330Lv5.getSocialModel());
    }
}
