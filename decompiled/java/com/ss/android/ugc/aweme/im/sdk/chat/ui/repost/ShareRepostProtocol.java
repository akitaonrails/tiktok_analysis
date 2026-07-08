package com.ss.android.ugc.aweme.im.sdk.chat.ui.repost;

import X.C01GW;
import X.C0IB0;
import X.C0IBZ;
import X.C0ICS;
import X.C462390IBh;
import X.C462400IBi;
import X.C869590Y9l;
import X.C898790ZNt;
import X.C902710ZbB;
import X.InterfaceC461380I7k;
import X.InterfaceC462380IBg;
import X.InterfaceC902790ZbJ;
import X.InterfaceC903660Zci;
import com.ss.android.ugc.aweme.im.messagelist.api.cell.MessageListProtocolEnum;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutPowerCell;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class ShareRepostProtocol implements SkeletonMessageListProtocol<C462400IBi, C462390IBh> {
    public final Class<? extends IMSkeletonLayoutPowerCell<?, C462400IBi>> LL = ShareRepostSendPowerCell.class;
    public final Class<? extends IMSkeletonLayoutPowerCell<?, C462390IBh>> LLILLJJLI = ShareRepostReceivePowerCell.class;
    public final C898790ZNt LLILLL = new C898790ZNt(new int[]{1817});
    public final MessageListProtocolEnum LLILZ = MessageListProtocolEnum.SHARE_REPOST;

    @Override // X.InterfaceC902780ZbI
    public final InterfaceC902790ZbJ<C462390IBh> An() {
        return null;
    }

    @Override // X.InterfaceC902780ZbI
    public final InterfaceC902790ZbJ<C462400IBi> Wh() {
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
    public final Class<? extends IMSkeletonLayoutPowerCell<?, C462400IBi>> da() {
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
    public final Class<? extends IMSkeletonLayoutPowerCell<?, C462390IBh>> gr() {
        return this.LLILLJJLI;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol
    public final C902710ZbB Vx2(C01GW c01gw) {
        return new C902710ZbB(this, c01gw);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol
    public final InterfaceC461380I7k m72(C869590Y9l c869590Y9l, C0IB0 c0ib0) {
        return new InterfaceC462380IBg(C0IBZ.LIZ(c869590Y9l), C0ICS.LIZ(true), c0ib0) { // from class: X.0IBi
            public final C462350IBd LL;
            public final C462620ICe LLILLJJLI;
            public final C0IB0 LLILLL;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C462400IBi)) {
                    return false;
                }
                C462400IBi c462400IBi = (C462400IBi) obj;
                return Intrinsics.LJFF(this.LL, c462400IBi.LL) && Intrinsics.LJFF(this.LLILLJJLI, c462400IBi.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c462400IBi.LLILLL);
            }

            public final int hashCode() {
                return (((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode();
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ShareRepostSendSkeletonLayoutPowerItem(content=");
                sbLIZ.append(this.LL);
                sbLIZ.append(", backgroundConfig=");
                sbLIZ.append(this.LLILLJJLI);
                sbLIZ.append(", skeletonLayoutData=");
                sbLIZ.append(this.LLILLL);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // X.InterfaceC462380IBg
            public final C462620ICe LIZJ() {
                return this.LLILLJJLI;
            }

            @Override // X.InterfaceC461380I7k
            public final C0IB0 LLILII() {
                return this.LLILLL;
            }

            @Override // X.InterfaceC462380IBg
            public final C462350IBd getContent() {
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
                return C462370IBf.LIZ(this, interfaceC1891350zJl);
            }

            {
                this.LL = c462350IBd;
                this.LLILLJJLI = c462620ICe;
                this.LLILLL = c0ib0;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol
    public final InterfaceC461380I7k ts1(C869590Y9l c869590Y9l, C0IB0 c0ib0) {
        return new InterfaceC462380IBg(C0IBZ.LIZ(c869590Y9l), C0ICS.LIZ(false), c0ib0) { // from class: X.0IBh
            public final C462350IBd LL;
            public final C462620ICe LLILLJJLI;
            public final C0IB0 LLILLL;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C462390IBh)) {
                    return false;
                }
                C462390IBh c462390IBh = (C462390IBh) obj;
                return Intrinsics.LJFF(this.LL, c462390IBh.LL) && Intrinsics.LJFF(this.LLILLJJLI, c462390IBh.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c462390IBh.LLILLL);
            }

            public final int hashCode() {
                return (((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode();
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ShareRepostReceiveSkeletonLayoutPowerItem(content=");
                sbLIZ.append(this.LL);
                sbLIZ.append(", backgroundConfig=");
                sbLIZ.append(this.LLILLJJLI);
                sbLIZ.append(", skeletonLayoutData=");
                sbLIZ.append(this.LLILLL);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // X.InterfaceC462380IBg
            public final C462620ICe LIZJ() {
                return this.LLILLJJLI;
            }

            @Override // X.InterfaceC461380I7k
            public final C0IB0 LLILII() {
                return this.LLILLL;
            }

            @Override // X.InterfaceC462380IBg
            public final C462350IBd getContent() {
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
                return C462370IBf.LIZ(this, interfaceC1891350zJl);
            }

            {
                this.LL = c462350IBd;
                this.LLILLJJLI = c462620ICe;
                this.LLILLL = c0ib0;
            }
        };
    }
}
