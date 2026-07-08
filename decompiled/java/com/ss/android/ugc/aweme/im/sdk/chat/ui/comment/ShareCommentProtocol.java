package com.ss.android.ugc.aweme.im.sdk.chat.ui.comment;

import X.C01GW;
import X.C0IB0;
import X.C0ICS;
import X.C0ZZC;
import X.C0ZZJ;
import X.C869590Y9l;
import X.C898790ZNt;
import X.C899990ZSj;
import X.C900000ZSk;
import X.C902710ZbB;
import X.InterfaceC461380I7k;
import X.InterfaceC902790ZbJ;
import X.InterfaceC903660Zci;
import com.ss.android.ugc.aweme.im.messagelist.api.cell.MessageListProtocolEnum;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutPowerCell;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class ShareCommentProtocol implements SkeletonMessageListProtocol<C900000ZSk, C899990ZSj> {
    public final Class<? extends IMSkeletonLayoutPowerCell<?, C900000ZSk>> LL = ShareCommentSendPowerCell.class;
    public final Class<? extends IMSkeletonLayoutPowerCell<?, C899990ZSj>> LLILLJJLI = ShareCommentReceivePowerCell.class;
    public final C898790ZNt LLILLL = new C898790ZNt(new int[]{40});
    public final MessageListProtocolEnum LLILZ = MessageListProtocolEnum.SHARE_COMMENT;

    @Override // X.InterfaceC902780ZbI
    public final InterfaceC902790ZbJ<C899990ZSj> An() {
        return null;
    }

    @Override // X.InterfaceC902780ZbI
    public final InterfaceC902790ZbJ<C900000ZSk> Wh() {
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
    public final Class<? extends IMSkeletonLayoutPowerCell<?, C900000ZSk>> da() {
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
    public final Class<? extends IMSkeletonLayoutPowerCell<?, C899990ZSj>> gr() {
        return this.LLILLJJLI;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol
    public final C902710ZbB Vx2(C01GW c01gw) {
        return new C902710ZbB(this, c01gw);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol
    public final InterfaceC461380I7k m72(C869590Y9l c869590Y9l, C0IB0 c0ib0) {
        return new C0ZZJ(C0ZZC.LIZ(c869590Y9l), C0ICS.LIZ(true), c0ib0) { // from class: X.0ZSk
            public final C0ZZE LL;
            public final C462620ICe LLILLJJLI;
            public final C0IB0 LLILLL;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C900000ZSk)) {
                    return false;
                }
                C900000ZSk c900000ZSk = (C900000ZSk) obj;
                return Intrinsics.LJFF(this.LL, c900000ZSk.LL) && Intrinsics.LJFF(this.LLILLJJLI, c900000ZSk.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c900000ZSk.LLILLL);
            }

            public final int hashCode() {
                return (((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode();
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ShareCommentSendSkeletonLayoutPowerItem(content=");
                sbLIZ.append(this.LL);
                sbLIZ.append(", backgroundConfig=");
                sbLIZ.append(this.LLILLJJLI);
                sbLIZ.append(", skeletonLayoutData=");
                sbLIZ.append(this.LLILLL);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // X.C0ZZJ
            public final C462620ICe LIZJ() {
                return this.LLILLJJLI;
            }

            @Override // X.InterfaceC461380I7k
            public final C0IB0 LLILII() {
                return this.LLILLL;
            }

            @Override // X.C0ZZJ
            public final C0ZZE getContent() {
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
                return C0ZZF.LIZ(this, interfaceC1891350zJl);
            }

            {
                this.LL = c0zze;
                this.LLILLJJLI = c462620ICe;
                this.LLILLL = c0ib0;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol
    public final InterfaceC461380I7k ts1(C869590Y9l c869590Y9l, C0IB0 c0ib0) {
        return new C0ZZJ(C0ZZC.LIZ(c869590Y9l), C0ICS.LIZ(false), c0ib0) { // from class: X.0ZSj
            public final C0ZZE LL;
            public final C462620ICe LLILLJJLI;
            public final C0IB0 LLILLL;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C899990ZSj)) {
                    return false;
                }
                C899990ZSj c899990ZSj = (C899990ZSj) obj;
                return Intrinsics.LJFF(this.LL, c899990ZSj.LL) && Intrinsics.LJFF(this.LLILLJJLI, c899990ZSj.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c899990ZSj.LLILLL);
            }

            public final int hashCode() {
                return (((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode();
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ShareCommentReceiveSkeletonLayoutPowerItem(content=");
                sbLIZ.append(this.LL);
                sbLIZ.append(", backgroundConfig=");
                sbLIZ.append(this.LLILLJJLI);
                sbLIZ.append(", skeletonLayoutData=");
                sbLIZ.append(this.LLILLL);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // X.C0ZZJ
            public final C462620ICe LIZJ() {
                return this.LLILLJJLI;
            }

            @Override // X.InterfaceC461380I7k
            public final C0IB0 LLILII() {
                return this.LLILLL;
            }

            @Override // X.C0ZZJ
            public final C0ZZE getContent() {
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
                return C0ZZF.LIZ(this, interfaceC1891350zJl);
            }

            {
                this.LL = c0zze;
                this.LLILLJJLI = c462620ICe;
                this.LLILLL = c0ib0;
            }
        };
    }
}
