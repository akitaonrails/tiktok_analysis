package com.ss.android.ugc.aweme.im.sdk.chat.ui.unavailable;

import X.C01GW;
import X.C0IB0;
import X.C0ZNW;
import X.C869590Y9l;
import X.C898640ZNe;
import X.C898650ZNf;
import X.C898660ZNg;
import X.C898690ZNj;
import X.C902710ZbB;
import X.InterfaceC461380I7k;
import X.InterfaceC902790ZbJ;
import X.InterfaceC903660Zci;
import com.ss.android.ugc.aweme.im.messagelist.api.cell.MessageListProtocolEnum;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutPowerCell;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS248S0000000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class LastProtocolAllUnavailable implements SkeletonMessageListProtocol<C898650ZNf, C898640ZNe> {
    public final Class<? extends IMSkeletonLayoutPowerCell<?, C898650ZNf>> LL = UnavailableCardSendPowerCell.class;
    public final Class<? extends IMSkeletonLayoutPowerCell<?, C898640ZNe>> LLILLJJLI = UnavailableCardReceivePowerCell.class;
    public final C898660ZNg LLILLL = new C898660ZNg(AFwS248S0000000_14.get$arr$(262));
    public final MessageListProtocolEnum LLILZ = MessageListProtocolEnum.UN_HANDLE_UNAVAILABLE;

    @Override // X.InterfaceC902780ZbI
    public final InterfaceC902790ZbJ<C898640ZNe> An() {
        return null;
    }

    @Override // X.InterfaceC902780ZbI
    public final InterfaceC902790ZbJ<C898650ZNf> Wh() {
        return null;
    }

    @Override // X.InterfaceC902770ZbH
    public final boolean isEnabled() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol
    public final Class<? extends IMSkeletonLayoutPowerCell<?, C898650ZNf>> da() {
        return this.LL;
    }

    @Override // X.InterfaceC902770ZbH
    public final MessageListProtocolEnum getInterceptOrdering() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC902770ZbH
    public final InterfaceC903660Zci getMsgHandlerCheck() {
        return this.LLILLL;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol
    public final Class<? extends IMSkeletonLayoutPowerCell<?, C898640ZNe>> gr() {
        return this.LLILLJJLI;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol
    public final C902710ZbB Vx2(C01GW c01gw) {
        return new C902710ZbB(this, c01gw);
    }

    @Override // X.InterfaceC902770ZbH
    public final List<C869590Y9l> intercept(List<? extends C869590Y9l> list) {
        ArrayList arrayList = new ArrayList();
        for (C869590Y9l c869590Y9l : list) {
            if (c869590Y9l.getMsgType() != 4071) {
                arrayList.add(c869590Y9l);
            }
        }
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol
    public final InterfaceC461380I7k m72(C869590Y9l c869590Y9l, C0IB0 c0ib0) {
        C0IB0 c0ib0LIZ = C0ZNW.LIZ(c0ib0);
        C898690ZNj c898690ZNj = C898690ZNj.LIZ;
        return new C898650ZNf(C0ZNW.LIZIZ(c0ib0LIZ, c898690ZNj), c898690ZNj);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol
    public final InterfaceC461380I7k ts1(C869590Y9l c869590Y9l, C0IB0 c0ib0) {
        C0IB0 c0ib0LIZ = C0ZNW.LIZ(c0ib0);
        C898690ZNj c898690ZNj = C898690ZNj.LIZ;
        return new C898640ZNe(C0ZNW.LIZIZ(c0ib0LIZ, c898690ZNj), c898690ZNj);
    }
}
