package com.ss.android.ugc.aweme.im.sdk.chat.ui.user;

import X.C01GW;
import X.C0IB0;
import X.C0ICS;
import X.C462690ICl;
import X.C462700ICm;
import X.C869590Y9l;
import X.C898790ZNt;
import X.C902710ZbB;
import X.InterfaceC461380I7k;
import X.InterfaceC462720ICo;
import X.InterfaceC902790ZbJ;
import X.InterfaceC903660Zci;
import com.ss.android.ugc.aweme.im.messagelist.api.cell.MessageListProtocolEnum;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutPowerCell;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class ShareUserMultipleProtocol implements SkeletonMessageListProtocol<C462700ICm, C462690ICl> {
    public final Class<? extends IMSkeletonLayoutPowerCell<?, C462700ICm>> LL = ShareUserMultipleSendPowerCell.class;
    public final Class<? extends IMSkeletonLayoutPowerCell<?, C462690ICl>> LLILLJJLI = ShareUserMultipleReceivePowerCell.class;
    public final C898790ZNt LLILLL = new C898790ZNt(new int[]{25});
    public final MessageListProtocolEnum LLILZ = MessageListProtocolEnum.SHARE_USER_MULTIPLE;

    @Override // X.InterfaceC902780ZbI
    public final InterfaceC902790ZbJ<C462690ICl> An() {
        return null;
    }

    @Override // X.InterfaceC902780ZbI
    public final InterfaceC902790ZbJ<C462700ICm> Wh() {
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
    public final Class<? extends IMSkeletonLayoutPowerCell<?, C462700ICm>> da() {
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
    public final Class<? extends IMSkeletonLayoutPowerCell<?, C462690ICl>> gr() {
        return this.LLILLJJLI;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol
    public final C902710ZbB Vx2(C01GW c01gw) {
        return new C902710ZbB(this, c01gw);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol
    public final InterfaceC461380I7k m72(C869590Y9l c869590Y9l, C0IB0 c0ib0) {
        return new InterfaceC462720ICo(C0ICS.LIZ(true), c0ib0) { // from class: X.0ICm
            public final C462620ICe LL;
            public final C0IB0 LLILLJJLI;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C462700ICm)) {
                    return false;
                }
                C462700ICm c462700ICm = (C462700ICm) obj;
                return Intrinsics.LJFF(this.LL, c462700ICm.LL) && Intrinsics.LJFF(this.LLILLJJLI, c462700ICm.LLILLJJLI);
            }

            public final int hashCode() {
                return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ShareUserMultipleSendSkeletonLayoutPowerItem(backgroundConfig=");
                sbLIZ.append(this.LL);
                sbLIZ.append(", skeletonLayoutData=");
                sbLIZ.append(this.LLILLJJLI);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // X.InterfaceC462720ICo
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
                return C462710ICn.LIZ(this, interfaceC1891350zJl);
            }

            {
                this.LL = c462620ICe;
                this.LLILLJJLI = c0ib0;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol
    public final InterfaceC461380I7k ts1(C869590Y9l c869590Y9l, C0IB0 c0ib0) {
        return new InterfaceC462720ICo(C0ICS.LIZ(false), c0ib0) { // from class: X.0ICl
            public final C462620ICe LL;
            public final C0IB0 LLILLJJLI;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C462690ICl)) {
                    return false;
                }
                C462690ICl c462690ICl = (C462690ICl) obj;
                return Intrinsics.LJFF(this.LL, c462690ICl.LL) && Intrinsics.LJFF(this.LLILLJJLI, c462690ICl.LLILLJJLI);
            }

            public final int hashCode() {
                return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ShareUserMultipleReceiveSkeletonLayoutPowerItem(backgroundConfig=");
                sbLIZ.append(this.LL);
                sbLIZ.append(", skeletonLayoutData=");
                sbLIZ.append(this.LLILLJJLI);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // X.InterfaceC462720ICo
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
                return C462710ICn.LIZ(this, interfaceC1891350zJl);
            }

            {
                this.LL = c462620ICe;
                this.LLILLJJLI = c0ib0;
            }
        };
    }
}
