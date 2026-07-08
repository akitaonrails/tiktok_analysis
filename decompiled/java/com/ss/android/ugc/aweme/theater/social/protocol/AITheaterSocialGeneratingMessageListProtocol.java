package com.ss.android.ugc.aweme.theater.social.protocol;

import X.C01GW;
import X.C0IB0;
import X.C0MXR;
import X.C0MXS;
import X.C0MXT;
import X.C0ZOV;
import X.C869590Y9l;
import X.C898770ZNr;
import X.C898790ZNt;
import X.C898860ZOa;
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
public final class AITheaterSocialGeneratingMessageListProtocol implements SkeletonMessageListProtocol<C0MXS, C0MXR> {
    public final Class<? extends IMSkeletonLayoutPowerCell<?, C0MXS>> LL = AITheaterSocialGeneratingSendPowerCell.class;
    public final Class<? extends IMSkeletonLayoutPowerCell<?, C0MXR>> LLILLJJLI = AITheaterSocialGeneratingReceivePowerCell.class;
    public final C898790ZNt LLILLL = new C898790ZNt(new int[]{2001}, AFwS248S0000000_14.get$arr$(333));
    public final MessageListProtocolEnum LLILZ = MessageListProtocolEnum.AI_THEATER_GENERATING_CARD;

    @Override // X.InterfaceC902780ZbI
    public final InterfaceC902790ZbJ<C0MXR> An() {
        return null;
    }

    @Override // X.InterfaceC902780ZbI
    public final InterfaceC902790ZbJ<C0MXS> Wh() {
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
    public final Class<? extends IMSkeletonLayoutPowerCell<?, C0MXS>> da() {
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
    public final Class<? extends IMSkeletonLayoutPowerCell<?, C0MXR>> gr() {
        return this.LLILLJJLI;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol
    public final C902710ZbB Vx2(C01GW c01gw) {
        return new C902710ZbB(this, c01gw);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol
    public final InterfaceC461380I7k m72(C869590Y9l c869590Y9l, C0IB0 c0ib0) {
        IcAigcCommonMessageCard icAigcCommonMessageCardLIZLLL = new C898770ZNr(c869590Y9l).LIZLLL();
        c0ib0.LIZIZ.LIZJ.getClass();
        return new C0MXT(C0IB0.LIZ(c0ib0, C0ZOV.LIZ(c0ib0.LIZIZ, new C898860ZOa(false, true, false, false)), null, 5), icAigcCommonMessageCardLIZLLL) { // from class: X.0MXS
            public final C0IB0 LL;
            public final IcAigcCommonMessageCard LLILLJJLI;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0MXS)) {
                    return false;
                }
                C0MXS c0mxs = (C0MXS) obj;
                return Intrinsics.LJFF(this.LL, c0mxs.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0mxs.LLILLJJLI);
            }

            public final int hashCode() {
                int iHashCode = this.LL.hashCode() * 31;
                IcAigcCommonMessageCard icAigcCommonMessageCard = this.LLILLJJLI;
                return iHashCode + (icAigcCommonMessageCard == null ? 0 : icAigcCommonMessageCard.hashCode());
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("AITheaterSocialGeneratingSendItem(skeletonLayoutData=");
                sbLIZ.append(this.LL);
                sbLIZ.append(", msgCard=");
                sbLIZ.append(this.LLILLJJLI);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // X.C0MXT
            public final IcAigcCommonMessageCard LJJIII() {
                return this.LLILLJJLI;
            }

            @Override // X.InterfaceC461380I7k
            public final C0IB0 LLILII() {
                return this.LL;
            }

            @Override // X.InterfaceC1891350zJl
            public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
                return C0MXO.LIZ(this, interfaceC1891350zJl);
            }

            @Override // X.InterfaceC1891350zJl
            public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
                return C0MXO.LIZIZ(this, interfaceC1891350zJl);
            }

            @Override // X.InterfaceC1891350zJl
            public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
                return C0MXO.LIZJ(this, interfaceC1891350zJl);
            }

            {
                this.LL = c0ib0;
                this.LLILLJJLI = icAigcCommonMessageCardLIZLLL;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol
    public final InterfaceC461380I7k ts1(C869590Y9l c869590Y9l, C0IB0 c0ib0) {
        final IcAigcCommonMessageCard icAigcCommonMessageCardLIZLLL = new C898770ZNr(c869590Y9l).LIZLLL();
        c0ib0.LIZIZ.LIZJ.getClass();
        final C0IB0 c0ib0LIZ = C0IB0.LIZ(c0ib0, C0ZOV.LIZ(c0ib0.LIZIZ, new C898860ZOa(false, true, false, false)), null, 5);
        return new C0MXT(c0ib0LIZ, icAigcCommonMessageCardLIZLLL) { // from class: X.0MXR
            public final C0IB0 LL;
            public final IcAigcCommonMessageCard LLILLJJLI;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0MXR)) {
                    return false;
                }
                C0MXR c0mxr = (C0MXR) obj;
                return Intrinsics.LJFF(this.LL, c0mxr.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0mxr.LLILLJJLI);
            }

            public final int hashCode() {
                int iHashCode = this.LL.hashCode() * 31;
                IcAigcCommonMessageCard icAigcCommonMessageCard = this.LLILLJJLI;
                return iHashCode + (icAigcCommonMessageCard == null ? 0 : icAigcCommonMessageCard.hashCode());
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("AITheaterSocialGeneratingReceiveItem(skeletonLayoutData=");
                sbLIZ.append(this.LL);
                sbLIZ.append(", msgCard=");
                sbLIZ.append(this.LLILLJJLI);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // X.C0MXT
            public final IcAigcCommonMessageCard LJJIII() {
                return this.LLILLJJLI;
            }

            @Override // X.InterfaceC461380I7k
            public final C0IB0 LLILII() {
                return this.LL;
            }

            @Override // X.InterfaceC1891350zJl
            public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
                return C0MXO.LIZ(this, interfaceC1891350zJl);
            }

            @Override // X.InterfaceC1891350zJl
            public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
                return C0MXO.LIZIZ(this, interfaceC1891350zJl);
            }

            @Override // X.InterfaceC1891350zJl
            public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
                return C0MXO.LIZJ(this, interfaceC1891350zJl);
            }

            {
                this.LL = c0ib0LIZ;
                this.LLILLJJLI = icAigcCommonMessageCardLIZLLL;
            }
        };
    }
}
