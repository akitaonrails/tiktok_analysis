package com.ss.android.ugc.aweme.im.b2c.card;

import X.C01GW;
import X.C0IB0;
import X.C0ICS;
import X.C0ZRU;
import X.C869590Y9l;
import X.C898790ZNt;
import X.C900080ZSs;
import X.C900090ZSt;
import X.C902710ZbB;
import X.InterfaceC461380I7k;
import X.InterfaceC900110ZSv;
import X.InterfaceC902790ZbJ;
import X.InterfaceC903660Zci;
import com.ss.android.ugc.aweme.im.messagelist.api.cell.MessageListProtocolEnum;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutPowerCell;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class InfoCardSkeletonProtocol implements SkeletonMessageListProtocol<C900090ZSt, C900080ZSs> {
    public final Class<? extends IMSkeletonLayoutPowerCell<?, C900090ZSt>> LL = InfoCardSendPowerCell.class;
    public final Class<? extends IMSkeletonLayoutPowerCell<?, C900080ZSs>> LLILLJJLI = InfoCardReceivePowerCell.class;
    public final C898790ZNt LLILLL = new C898790ZNt(new int[]{1804});
    public final MessageListProtocolEnum LLILZ = MessageListProtocolEnum.INFO_CARD;

    @Override // X.InterfaceC902780ZbI
    public final InterfaceC902790ZbJ<C900080ZSs> An() {
        return null;
    }

    @Override // X.InterfaceC902780ZbI
    public final InterfaceC902790ZbJ<C900090ZSt> Wh() {
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
    public final Class<? extends IMSkeletonLayoutPowerCell<?, C900090ZSt>> da() {
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
    public final Class<? extends IMSkeletonLayoutPowerCell<?, C900080ZSs>> gr() {
        return this.LLILLJJLI;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol
    public final C902710ZbB Vx2(C01GW c01gw) {
        return new C902710ZbB(this, c01gw);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol
    public final InterfaceC461380I7k m72(C869590Y9l c869590Y9l, C0IB0 c0ib0) {
        return new InterfaceC900110ZSv(C0ZRU.LIZ(c869590Y9l), C0ICS.LIZ(true), c0ib0) { // from class: X.0ZSt
            public final char[] LL;
            public final C462620ICe LLILLJJLI;
            public final C0IB0 LLILLL;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C900090ZSt)) {
                    return false;
                }
                C900090ZSt c900090ZSt = (C900090ZSt) obj;
                return Intrinsics.LJFF(this.LL, c900090ZSt.LL) && Intrinsics.LJFF(this.LLILLJJLI, c900090ZSt.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c900090ZSt.LLILLL);
            }

            public final int hashCode() {
                char[] cArr = this.LL;
                return ((((cArr == null ? 0 : Arrays.hashCode(cArr)) * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode();
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("InfoCardSendSkeletonLayoutPowerItem(clickState=");
                sbLIZ.append(Arrays.toString(this.LL));
                sbLIZ.append(", backgroundConfig=");
                sbLIZ.append(this.LLILLJJLI);
                sbLIZ.append(", skeletonLayoutData=");
                sbLIZ.append(this.LLILLL);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // X.InterfaceC900110ZSv
            public final C462620ICe LIZJ() {
                return this.LLILLJJLI;
            }

            @Override // X.InterfaceC461380I7k
            public final C0IB0 LLILII() {
                return this.LLILLL;
            }

            @Override // X.InterfaceC900110ZSv
            public final char[] LLJILLL() {
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
                return C900100ZSu.LIZ(this, interfaceC1891350zJl);
            }

            {
                this.LL = cArr;
                this.LLILLJJLI = c462620ICe;
                this.LLILLL = c0ib0;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol
    public final InterfaceC461380I7k ts1(C869590Y9l c869590Y9l, C0IB0 c0ib0) {
        return new InterfaceC900110ZSv(C0ZRU.LIZ(c869590Y9l), C0ICS.LIZ(false), c0ib0) { // from class: X.0ZSs
            public final char[] LL;
            public final C462620ICe LLILLJJLI;
            public final C0IB0 LLILLL;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C900080ZSs)) {
                    return false;
                }
                C900080ZSs c900080ZSs = (C900080ZSs) obj;
                return Intrinsics.LJFF(this.LL, c900080ZSs.LL) && Intrinsics.LJFF(this.LLILLJJLI, c900080ZSs.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c900080ZSs.LLILLL);
            }

            public final int hashCode() {
                char[] cArr = this.LL;
                return ((((cArr == null ? 0 : Arrays.hashCode(cArr)) * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode();
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("InfoCardReceiveSkeletonLayoutPowerItem(clickState=");
                sbLIZ.append(Arrays.toString(this.LL));
                sbLIZ.append(", backgroundConfig=");
                sbLIZ.append(this.LLILLJJLI);
                sbLIZ.append(", skeletonLayoutData=");
                sbLIZ.append(this.LLILLL);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // X.InterfaceC900110ZSv
            public final C462620ICe LIZJ() {
                return this.LLILLJJLI;
            }

            @Override // X.InterfaceC461380I7k
            public final C0IB0 LLILII() {
                return this.LLILLL;
            }

            @Override // X.InterfaceC900110ZSv
            public final char[] LLJILLL() {
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
                return C900100ZSu.LIZ(this, interfaceC1891350zJl);
            }

            {
                this.LL = cArr;
                this.LLILLJJLI = c462620ICe;
                this.LLILLL = c0ib0;
            }
        };
    }
}
