package com.ss.android.ugc.aweme.msg;

import X.C01GW;
import X.C0IB0;
import X.C0ICS;
import X.C461510I7x;
import X.C461520I7y;
import X.C687700QyG;
import X.C869590Y9l;
import X.C898790ZNt;
import X.C902710ZbB;
import X.InterfaceC1146704e9;
import X.InterfaceC461350I7h;
import X.InterfaceC461380I7k;
import X.InterfaceC902790ZbJ;
import X.InterfaceC903660Zci;
import com.ss.android.ugc.aweme.im.common.scope.ChatRoomScope;
import com.ss.android.ugc.aweme.im.messagelist.api.cell.MessageListProtocolEnum;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutPowerCell;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class GroupInvitationMessageProtocol implements SkeletonMessageListProtocol<C461520I7y, C461510I7x>, InterfaceC1146704e9 {
    public final Class<? extends IMSkeletonLayoutPowerCell<?, C461520I7y>> LL = GroupInvitationSendPowerCell.class;
    public final Class<? extends IMSkeletonLayoutPowerCell<?, C461510I7x>> LLILLJJLI = GroupInvitationReceivePowerCell.class;
    public final C898790ZNt LLILLL = new C898790ZNt(new int[]{1033});
    public final MessageListProtocolEnum LLILZ = MessageListProtocolEnum.GROUP_INVITATION;

    @Override // X.InterfaceC902780ZbI
    public final InterfaceC902790ZbJ<C461510I7x> An() {
        return null;
    }

    @Override // X.InterfaceC902780ZbI
    public final InterfaceC902790ZbJ<C461520I7y> Wh() {
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{ChatRoomScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ChatRoomScope.class);
        return arrayList;
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
    public final Class<? extends IMSkeletonLayoutPowerCell<?, C461520I7y>> da() {
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
    public final Class<? extends IMSkeletonLayoutPowerCell<?, C461510I7x>> gr() {
        return this.LLILLJJLI;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol
    public final C902710ZbB Vx2(C01GW c01gw) {
        return new C902710ZbB(this, c01gw);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol
    public final InterfaceC461380I7k m72(C869590Y9l c869590Y9l, C0IB0 c0ib0) {
        return new InterfaceC461350I7h(C0ICS.LIZ(true), c0ib0) { // from class: X.0I7y
            public final C0IB0 LL;
            public final C462620ICe LLILLJJLI;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C461520I7y)) {
                    return false;
                }
                C461520I7y c461520I7y = (C461520I7y) obj;
                return Intrinsics.LJFF(this.LL, c461520I7y.LL) && Intrinsics.LJFF(this.LLILLJJLI, c461520I7y.LLILLJJLI);
            }

            public final int hashCode() {
                return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("GroupInvitationSendPowerItem(skeletonLayoutData=");
                sbLIZ.append(this.LL);
                sbLIZ.append(", backgroundConfig=");
                sbLIZ.append(this.LLILLJJLI);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // X.InterfaceC461350I7h
            public final C462620ICe LIZJ() {
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
                return C461370I7j.LIZ(this, interfaceC1891350zJl);
            }

            {
                this.LL = c0ib0;
                this.LLILLJJLI = c462620ICe;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol
    public final InterfaceC461380I7k ts1(C869590Y9l c869590Y9l, C0IB0 c0ib0) {
        return new InterfaceC461350I7h(C0ICS.LIZ(false), c0ib0) { // from class: X.0I7x
            public final C0IB0 LL;
            public final C462620ICe LLILLJJLI;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C461510I7x)) {
                    return false;
                }
                C461510I7x c461510I7x = (C461510I7x) obj;
                return Intrinsics.LJFF(this.LL, c461510I7x.LL) && Intrinsics.LJFF(this.LLILLJJLI, c461510I7x.LLILLJJLI);
            }

            public final int hashCode() {
                return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("GroupInvitationReceivePowerItem(skeletonLayoutData=");
                sbLIZ.append(this.LL);
                sbLIZ.append(", backgroundConfig=");
                sbLIZ.append(this.LLILLJJLI);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // X.InterfaceC461350I7h
            public final C462620ICe LIZJ() {
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
                return C461370I7j.LIZ(this, interfaceC1891350zJl);
            }

            {
                this.LL = c0ib0;
                this.LLILLJJLI = c462620ICe;
            }
        };
    }
}
