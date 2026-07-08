package com.ss.android.ugc.aweme.im.sdk.chat.ui.user;

import X.C01GW;
import X.C0IB0;
import X.C0IB1;
import X.C0ICS;
import X.C461020I6a;
import X.C462510IBt;
import X.C462620ICe;
import X.C869590Y9l;
import X.C898560ZMw;
import X.C898790ZNt;
import X.C899660ZRc;
import X.C899670ZRd;
import X.C902710ZbB;
import X.InterfaceC461380I7k;
import X.InterfaceC899690ZRf;
import X.InterfaceC902790ZbJ;
import X.InterfaceC903660Zci;
import com.ss.android.ugc.aweme.im.messagelist.api.cell.MessageListProtocolEnum;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ForwardOrReply;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.MessageReactionsState;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.NoButton;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutPowerCell;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol;
import java.util.List;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class ShareUserSimpleProtocol implements SkeletonMessageListProtocol<C899670ZRd, C899660ZRc> {
    public final Class<? extends IMSkeletonLayoutPowerCell<?, C899670ZRd>> LL = ShareUserSimpleSendPowerCell.class;
    public final Class<? extends IMSkeletonLayoutPowerCell<?, C899660ZRc>> LLILLJJLI = ShareUserSimpleReceivePowerCell.class;
    public final C898790ZNt LLILLL = new C898790ZNt(new int[]{25}, AFwS248S0000000_14.get$arr$(267));
    public final MessageListProtocolEnum LLILZ = MessageListProtocolEnum.SHARE_USER_SIMPLE;

    @Override // X.InterfaceC902780ZbI
    public final InterfaceC902790ZbJ<C899660ZRc> An() {
        return null;
    }

    @Override // X.InterfaceC902780ZbI
    public final InterfaceC902790ZbJ<C899670ZRd> Wh() {
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
    public final Class<? extends IMSkeletonLayoutPowerCell<?, C899670ZRd>> da() {
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
    public final Class<? extends IMSkeletonLayoutPowerCell<?, C899660ZRc>> gr() {
        return this.LLILLJJLI;
    }

    public static C0IB0 LIZ(C0IB0 c0ib0) {
        MessageReactionsState messageReactionsState;
        C461020I6a<? extends Object> c461020I6a;
        C461020I6a<? extends Object> c461020I6a2 = c0ib0.LIZJ.get(C898560ZMw.LIZ);
        if (c461020I6a2 != null && c461020I6a2.LIZIZ) {
            T t = c461020I6a2.LIZ;
            if ((t instanceof MessageReactionsState) && (messageReactionsState = (MessageReactionsState) t) != null && messageReactionsState.hasBigSocialAvatar() && (c461020I6a = c0ib0.LIZJ.get(C462510IBt.LIZ)) != null && c461020I6a.LIZIZ && (c461020I6a.LIZ instanceof ForwardOrReply)) {
                return C0IB1.LIZIZ(c0ib0, NoButton.INSTANCE, false);
            }
            return c0ib0;
        }
        return c0ib0;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol
    public final C902710ZbB Vx2(C01GW c01gw) {
        return new C902710ZbB(this, c01gw);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol
    public final InterfaceC461380I7k m72(C869590Y9l c869590Y9l, C0IB0 c0ib0) {
        return new InterfaceC899690ZRf(C0ICS.LIZ(true), LIZ(c0ib0)) { // from class: X.0ZRd
            public final C462620ICe LL;
            public final C0IB0 LLILLJJLI;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C899670ZRd)) {
                    return false;
                }
                C899670ZRd c899670ZRd = (C899670ZRd) obj;
                return Intrinsics.LJFF(this.LL, c899670ZRd.LL) && Intrinsics.LJFF(this.LLILLJJLI, c899670ZRd.LLILLJJLI);
            }

            public final int hashCode() {
                return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ShareUserSimpleSendSkeletonLayoutPowerItem(backgroundConfig=");
                sbLIZ.append(this.LL);
                sbLIZ.append(", skeletonLayoutData=");
                sbLIZ.append(this.LLILLJJLI);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // X.InterfaceC899690ZRf
            public final C462620ICe LIZJ() {
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
                return C899680ZRe.LIZ(this, interfaceC1891350zJl);
            }

            {
                this.LL = c462620ICe;
                this.LLILLJJLI = c0ib0;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol
    public final InterfaceC461380I7k ts1(C869590Y9l c869590Y9l, C0IB0 c0ib0) {
        final C462620ICe c462620ICeLIZ = C0ICS.LIZ(false);
        final C0IB0 c0ib0LIZ = LIZ(c0ib0);
        return new InterfaceC899690ZRf(c462620ICeLIZ, c0ib0LIZ) { // from class: X.0ZRc
            public final C462620ICe LL;
            public final C0IB0 LLILLJJLI;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C899660ZRc)) {
                    return false;
                }
                C899660ZRc c899660ZRc = (C899660ZRc) obj;
                return Intrinsics.LJFF(this.LL, c899660ZRc.LL) && Intrinsics.LJFF(this.LLILLJJLI, c899660ZRc.LLILLJJLI);
            }

            public final int hashCode() {
                return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ShareUserSimpleReceiveSkeletonLayoutPowerItem(backgroundConfig=");
                sbLIZ.append(this.LL);
                sbLIZ.append(", skeletonLayoutData=");
                sbLIZ.append(this.LLILLJJLI);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // X.InterfaceC899690ZRf
            public final C462620ICe LIZJ() {
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
                return C899680ZRe.LIZ(this, interfaceC1891350zJl);
            }

            {
                this.LL = c462620ICeLIZ;
                this.LLILLJJLI = c0ib0LIZ;
            }
        };
    }
}
