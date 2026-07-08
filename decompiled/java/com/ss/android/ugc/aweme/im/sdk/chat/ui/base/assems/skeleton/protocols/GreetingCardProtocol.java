package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.skeleton.protocols;

import X.C01GW;
import X.C0IB0;
import X.C0ZDX;
import X.C461300I7c;
import X.C461420I7o;
import X.C461430I7p;
import X.C869590Y9l;
import X.C898790ZNt;
import X.C902710ZbB;
import X.InterfaceC461380I7k;
import X.InterfaceC461400I7m;
import X.InterfaceC902790ZbJ;
import X.InterfaceC903660Zci;
import com.ss.android.ugc.aweme.im.message.template.component.GreetingCardInfoComponent;
import com.ss.android.ugc.aweme.im.messagelist.api.cell.MessageListProtocolEnum;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutPowerCell;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol;
import java.util.List;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class GreetingCardProtocol implements SkeletonMessageListProtocol<C461430I7p, C461420I7o> {
    public final Class<? extends IMSkeletonLayoutPowerCell<?, C461430I7p>> LL = GreetingCardSendPowerCell.class;
    public final Class<? extends IMSkeletonLayoutPowerCell<?, C461420I7o>> LLILLJJLI = GreetingCardReceivePowerCell.class;
    public final C898790ZNt LLILLL = new C898790ZNt(new int[]{1814}, AFwS236S0000000_6.get$arr$(179));
    public final MessageListProtocolEnum LLILZ = MessageListProtocolEnum.GREETING_CARD;

    @Override // X.InterfaceC902780ZbI
    public final InterfaceC902790ZbJ<C461420I7o> An() {
        return null;
    }

    @Override // X.InterfaceC902780ZbI
    public final InterfaceC902790ZbJ<C461430I7p> Wh() {
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
    public final Class<? extends IMSkeletonLayoutPowerCell<?, C461430I7p>> da() {
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
    public final Class<? extends IMSkeletonLayoutPowerCell<?, C461420I7o>> gr() {
        return this.LLILLJJLI;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol
    public final C902710ZbB Vx2(C01GW c01gw) {
        return new C902710ZbB(this, c01gw);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol
    public final InterfaceC461380I7k m72(C869590Y9l c869590Y9l, C0IB0 c0ib0) {
        boolean zLIZIZ;
        GreetingCardInfoComponent greetingCardInfoComponentLJI = C0ZDX.LJI(c869590Y9l);
        if (greetingCardInfoComponentLJI == null) {
            zLIZIZ = false;
        } else {
            zLIZIZ = C461300I7c.LIZIZ(c869590Y9l, greetingCardInfoComponentLJI.status);
        }
        return new InterfaceC461400I7m(c0ib0, zLIZIZ) { // from class: X.0I7p
            public final C0IB0 LL;
            public final boolean LLILLJJLI;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C461430I7p)) {
                    return false;
                }
                C461430I7p c461430I7p = (C461430I7p) obj;
                return Intrinsics.LJFF(this.LL, c461430I7p.LL) && this.LLILLJJLI == c461430I7p.LLILLJJLI;
            }

            public final int hashCode() {
                return (this.LL.hashCode() * 31) + C786410Ut5.Z2(this.LLILLJJLI);
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("GreetingCardSendSkeletonLayoutPowerItem(skeletonLayoutData=");
                sbLIZ.append(this.LL);
                sbLIZ.append(", isCardOpened=");
                sbLIZ.append(this.LLILLJJLI);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // X.InterfaceC461400I7m
            public final boolean LJJLJLI() {
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
                return C461390I7l.LIZ(this, interfaceC1891350zJl);
            }

            {
                this.LL = c0ib0;
                this.LLILLJJLI = zLIZIZ;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol
    public final InterfaceC461380I7k ts1(C869590Y9l c869590Y9l, final C0IB0 c0ib0) {
        final boolean zLIZIZ;
        GreetingCardInfoComponent greetingCardInfoComponentLJI = C0ZDX.LJI(c869590Y9l);
        if (greetingCardInfoComponentLJI == null) {
            zLIZIZ = false;
        } else {
            zLIZIZ = C461300I7c.LIZIZ(c869590Y9l, greetingCardInfoComponentLJI.status);
        }
        return new InterfaceC461400I7m(c0ib0, zLIZIZ) { // from class: X.0I7o
            public final C0IB0 LL;
            public final boolean LLILLJJLI;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C461420I7o)) {
                    return false;
                }
                C461420I7o c461420I7o = (C461420I7o) obj;
                return Intrinsics.LJFF(this.LL, c461420I7o.LL) && this.LLILLJJLI == c461420I7o.LLILLJJLI;
            }

            public final int hashCode() {
                return (this.LL.hashCode() * 31) + C786410Ut5.Z2(this.LLILLJJLI);
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("GreetingCardReceiveSkeletonLayoutPowerItem(skeletonLayoutData=");
                sbLIZ.append(this.LL);
                sbLIZ.append(", isCardOpened=");
                sbLIZ.append(this.LLILLJJLI);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // X.InterfaceC461400I7m
            public final boolean LJJLJLI() {
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
                return C461390I7l.LIZ(this, interfaceC1891350zJl);
            }

            {
                this.LL = c0ib0;
                this.LLILLJJLI = zLIZIZ;
            }
        };
    }
}
