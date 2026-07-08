package com.ss.android.ugc.aweme.theater.social.protocol;

import X.C01GW;
import X.C0IB0;
import X.C0MXL;
import X.C0MXP;
import X.C0MXQ;
import X.C869590Y9l;
import X.C898770ZNr;
import X.C898790ZNt;
import X.C902710ZbB;
import X.InterfaceC461380I7k;
import X.InterfaceC902790ZbJ;
import X.InterfaceC903660Zci;
import com.ss.android.ugc.aweme.im.messagelist.api.cell.MessageListProtocolEnum;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutPowerCell;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol;
import com.ss.android.ugc.tools.chat.data.IcAigcCommonMessageCard;
import java.util.List;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class AITheaterSocialGeneratedMessageListProtocol implements SkeletonMessageListProtocol<C0MXP, C0MXQ> {
    public final Class<? extends IMSkeletonLayoutPowerCell<?, C0MXP>> LL = AITheaterSocialGeneratedSendPowerCell.class;
    public final Class<? extends IMSkeletonLayoutPowerCell<?, C0MXQ>> LLILLJJLI = AITheaterSocialGeneratedReceivePowerCell.class;
    public final C898790ZNt LLILLL = new C898790ZNt(new int[]{2001}, AFwS248S0000000_14.get$arr$(332));
    public final MessageListProtocolEnum LLILZ = MessageListProtocolEnum.AI_THEATER_GENERATED_CARD;

    @Override // X.InterfaceC902780ZbI
    public final InterfaceC902790ZbJ<C0MXQ> An() {
        return null;
    }

    @Override // X.InterfaceC902780ZbI
    public final InterfaceC902790ZbJ<C0MXP> Wh() {
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
    public final Class<? extends IMSkeletonLayoutPowerCell<?, C0MXP>> da() {
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
    public final Class<? extends IMSkeletonLayoutPowerCell<?, C0MXQ>> gr() {
        return this.LLILLJJLI;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol
    public final C902710ZbB Vx2(C01GW c01gw) {
        return new C902710ZbB(this, c01gw);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol
    public final InterfaceC461380I7k m72(C869590Y9l c869590Y9l, C0IB0 c0ib0) {
        return new C0MXL(c0ib0, new C898770ZNr(c869590Y9l).LIZLLL()) { // from class: X.0MXP
            public final C0IB0 LL;
            public final IcAigcCommonMessageCard LLILLJJLI;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0MXP)) {
                    return false;
                }
                C0MXP c0mxp = (C0MXP) obj;
                return Intrinsics.LJFF(this.LL, c0mxp.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0mxp.LLILLJJLI);
            }

            public final int hashCode() {
                int iHashCode = this.LL.hashCode() * 31;
                IcAigcCommonMessageCard icAigcCommonMessageCard = this.LLILLJJLI;
                return iHashCode + (icAigcCommonMessageCard == null ? 0 : icAigcCommonMessageCard.hashCode());
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("AITheaterSocialGeneratedSendItem(skeletonLayoutData=");
                sbLIZ.append(this.LL);
                sbLIZ.append(", msgCard=");
                sbLIZ.append(this.LLILLJJLI);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // X.C0MXL
            public final IcAigcCommonMessageCard LJJIII() {
                return this.LLILLJJLI;
            }

            @Override // X.InterfaceC461380I7k
            public final C0IB0 LLILII() {
                return this.LL;
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
                return C0MXM.LIZ(this, interfaceC1891350zJl);
            }

            {
                this.LL = c0ib0;
                this.LLILLJJLI = icAigcCommonMessageCard;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol
    public final InterfaceC461380I7k ts1(C869590Y9l c869590Y9l, final C0IB0 c0ib0) {
        final IcAigcCommonMessageCard icAigcCommonMessageCardLIZLLL = new C898770ZNr(c869590Y9l).LIZLLL();
        return new C0MXL(c0ib0, icAigcCommonMessageCardLIZLLL) { // from class: X.0MXQ
            public final C0IB0 LL;
            public final IcAigcCommonMessageCard LLILLJJLI;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0MXQ)) {
                    return false;
                }
                C0MXQ c0mxq = (C0MXQ) obj;
                return Intrinsics.LJFF(this.LL, c0mxq.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0mxq.LLILLJJLI);
            }

            public final int hashCode() {
                int iHashCode = this.LL.hashCode() * 31;
                IcAigcCommonMessageCard icAigcCommonMessageCard = this.LLILLJJLI;
                return iHashCode + (icAigcCommonMessageCard == null ? 0 : icAigcCommonMessageCard.hashCode());
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("AITheaterSocialGeneratedReceiveItem(skeletonLayoutData=");
                sbLIZ.append(this.LL);
                sbLIZ.append(", msgCard=");
                sbLIZ.append(this.LLILLJJLI);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // X.C0MXL
            public final IcAigcCommonMessageCard LJJIII() {
                return this.LLILLJJLI;
            }

            @Override // X.InterfaceC461380I7k
            public final C0IB0 LLILII() {
                return this.LL;
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
                return C0MXM.LIZ(this, interfaceC1891350zJl);
            }

            {
                this.LL = c0ib0;
                this.LLILLJJLI = icAigcCommonMessageCardLIZLLL;
            }
        };
    }
}
