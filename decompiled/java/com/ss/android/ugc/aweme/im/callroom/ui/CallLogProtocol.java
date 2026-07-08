package com.ss.android.ugc.aweme.im.callroom.ui;

import X.C01GW;
import X.C0IB0;
import X.C869590Y9l;
import X.C898790ZNt;
import X.C899850ZRv;
import X.C899860ZRw;
import X.C902710ZbB;
import X.InterfaceC461380I7k;
import X.InterfaceC899890ZRz;
import X.InterfaceC902790ZbJ;
import X.InterfaceC903660Zci;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.messagelist.api.cell.MessageListProtocolEnum;
import com.ss.android.ugc.aweme.im.messagelist.api.ui.IIMMessageBubbleService;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutPowerCell;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class CallLogProtocol implements SkeletonMessageListProtocol<C899860ZRw, C899850ZRv> {
    public final Class<? extends IMSkeletonLayoutPowerCell<?, C899860ZRw>> LL = CallLogSendPowerCell.class;
    public final Class<? extends IMSkeletonLayoutPowerCell<?, C899850ZRv>> LLILLJJLI = CallLogReceivePowerCell.class;
    public final C898790ZNt LLILLL = new C898790ZNt(new int[]{1823});
    public final MessageListProtocolEnum LLILZ = MessageListProtocolEnum.CALL_LOG_CARD;

    @Override // X.InterfaceC902780ZbI
    public final InterfaceC902790ZbJ<C899850ZRv> An() {
        return null;
    }

    @Override // X.InterfaceC902780ZbI
    public final InterfaceC902790ZbJ<C899860ZRw> Wh() {
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
    public final Class<? extends IMSkeletonLayoutPowerCell<?, C899860ZRw>> da() {
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
    public final Class<? extends IMSkeletonLayoutPowerCell<?, C899850ZRv>> gr() {
        return this.LLILLJJLI;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol
    public final C902710ZbB Vx2(C01GW c01gw) {
        return new C902710ZbB(this, c01gw);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol
    public final InterfaceC461380I7k m72(C869590Y9l c869590Y9l, C0IB0 c0ib0) {
        Object objPluggableSpiForReal = PluggableExtentionKt.pluggableSpiForReal(IIMMessageBubbleService.class);
        if (objPluggableSpiForReal != null) {
            return new C899860ZRw(((IIMMessageBubbleService) objPluggableSpiForReal).LJI(null), c0ib0);
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol
    public final InterfaceC461380I7k ts1(C869590Y9l c869590Y9l, C0IB0 c0ib0) {
        Object objPluggableSpiForReal = PluggableExtentionKt.pluggableSpiForReal(IIMMessageBubbleService.class);
        if (objPluggableSpiForReal != null) {
            return new InterfaceC899890ZRz(((IIMMessageBubbleService) objPluggableSpiForReal).LIZLLL(null), c0ib0) { // from class: X.0ZRv
                public final C0ZXS LL;
                public final C0IB0 LLILLJJLI;

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C899850ZRv)) {
                        return false;
                    }
                    C899850ZRv c899850ZRv = (C899850ZRv) obj;
                    return Intrinsics.LJFF(this.LL, c899850ZRv.LL) && Intrinsics.LJFF(this.LLILLJJLI, c899850ZRv.LLILLJJLI);
                }

                public final int hashCode() {
                    return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
                }

                public final String toString() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("CallLogReceiveSkeletonLayoutPowerItem(bubbleConfig=");
                    sbLIZ.append(this.LL);
                    sbLIZ.append(", skeletonLayoutData=");
                    sbLIZ.append(this.LLILLJJLI);
                    sbLIZ.append(')');
                    return C2188811AlT.LIZIZ(sbLIZ);
                }

                @Override // X.InterfaceC899890ZRz
                public final C0ZXS LJII() {
                    return this.LL;
                }

                @Override // X.InterfaceC461380I7k
                public final C0IB0 LLILII() {
                    return this.LLILLJJLI;
                }

                @Override // X.InterfaceC1891350zJl
                public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
                    return Intrinsics.LJFF(interfaceC1891350zJl, this);
                }

                @Override // X.InterfaceC1891350zJl
                public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
                    return C461450I7r.LIZ(this, interfaceC1891350zJl);
                }

                @Override // X.InterfaceC1891350zJl
                public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
                    return C899870ZRx.LIZ(this, interfaceC1891350zJl);
                }

                {
                    this.LL = c0zxs;
                    this.LLILLJJLI = c0ib0;
                }
            };
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
