package com.ss.android.ugc.aweme.im.messagelist.protocols;

import X.C01GW;
import X.C0IB0;
import X.C0ICS;
import X.C0Z2Z;
import X.C0ZR6;
import X.C0ZR7;
import X.C869590Y9l;
import X.C898670ZNh;
import X.C898790ZNt;
import X.C900010ZSl;
import X.C900020ZSm;
import X.C902710ZbB;
import X.InterfaceC461380I7k;
import X.InterfaceC900060ZSq;
import X.InterfaceC902790ZbJ;
import X.InterfaceC903660Zci;
import com.ss.android.ugc.aweme.im.message.template.card.DynamicCardTemplate;
import com.ss.android.ugc.aweme.im.messagelist.api.cell.MessageListProtocolEnum;
import com.ss.android.ugc.aweme.im.saas.host.api.foundation.IMCrossAppFeatureDiffApi;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutPowerCell;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class DynamicCardProtocol implements SkeletonMessageListProtocol<C900020ZSm, C900010ZSl> {
    public final Class<? extends IMSkeletonLayoutPowerCell<?, C900020ZSm>> LL = DynamicCardSendPowerCell.class;
    public final Class<? extends IMSkeletonLayoutPowerCell<?, C900010ZSl>> LLILLJJLI = DynamicCardReceivePowerCell.class;
    public final C898790ZNt LLILLL = new C898790ZNt(new int[]{2000});
    public final MessageListProtocolEnum LLILZ = MessageListProtocolEnum.DYNAMIC_CARD;
    public final C0ZR7 LLILZIL = new InterfaceC902790ZbJ<C900020ZSm>(this) { // from class: X.0ZR7
        public final Class<C900020ZSm> LL = C900020ZSm.class;

        @Override // X.InterfaceC902790ZbJ
        public final Integer getCustomViewPoolSize() {
            return 12;
        }

        @Override // X.InterfaceC902790ZbJ
        public final Class<C900020ZSm> getPowerItemClazz() {
            return this.LL;
        }

        {
            this.getClass();
        }
    };
    public final C0ZR6 LLILZLL = new InterfaceC902790ZbJ<C900010ZSl>(this) { // from class: X.0ZR6
        public final Class<C900010ZSl> LL = C900010ZSl.class;

        @Override // X.InterfaceC902790ZbJ
        public final Integer getCustomViewPoolSize() {
            return 12;
        }

        @Override // X.InterfaceC902790ZbJ
        public final Class<C900010ZSl> getPowerItemClazz() {
            return this.LL;
        }

        {
            this.getClass();
        }
    };

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC902770ZbH
    public final List<C869590Y9l> intercept(List<? extends C869590Y9l> list) {
        return list;
    }

    @Override // X.InterfaceC902770ZbH
    public final boolean isEnabled() {
        IMCrossAppFeatureDiffApi.LIZ.getClass();
        IMCrossAppFeatureDiffApi iMCrossAppFeatureDiffApiLIZIZ = C898670ZNh.LIZIZ();
        if (iMCrossAppFeatureDiffApiLIZIZ == null) {
            return false;
        }
        iMCrossAppFeatureDiffApiLIZIZ.LJIILLIIL();
        return true;
    }

    @Override // X.InterfaceC902780ZbI
    public final InterfaceC902790ZbJ<C900010ZSl> An() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC902780ZbI
    public final InterfaceC902790ZbJ<C900020ZSm> Wh() {
        return this.LLILZIL;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol
    public final Class<? extends IMSkeletonLayoutPowerCell<?, C900020ZSm>> da() {
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
    public final Class<? extends IMSkeletonLayoutPowerCell<?, C900010ZSl>> gr() {
        return this.LLILLJJLI;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol
    public final C902710ZbB Vx2(C01GW c01gw) {
        return new C902710ZbB(this, c01gw);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol
    public final InterfaceC461380I7k m72(C869590Y9l c869590Y9l, C0IB0 c0ib0) {
        return new InterfaceC900060ZSq((DynamicCardTemplate) C0Z2Z.LIZ(c869590Y9l, DynamicCardTemplate.class), C0ICS.LIZ(true), c0ib0) { // from class: X.0ZSm
            public final DynamicCardTemplate LL;
            public final C462620ICe LLILLJJLI;
            public final C0IB0 LLILLL;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C900020ZSm)) {
                    return false;
                }
                C900020ZSm c900020ZSm = (C900020ZSm) obj;
                return Intrinsics.LJFF(this.LL, c900020ZSm.LL) && Intrinsics.LJFF(this.LLILLJJLI, c900020ZSm.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c900020ZSm.LLILLL);
            }

            public final int hashCode() {
                DynamicCardTemplate dynamicCardTemplate = this.LL;
                return ((((dynamicCardTemplate == null ? 0 : dynamicCardTemplate.hashCode()) * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode();
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("DynamicCardSendSkeletonLayoutPowerItem(dynamicCardTemplate=");
                sbLIZ.append(this.LL);
                sbLIZ.append(", backgroundConfig=");
                sbLIZ.append(this.LLILLJJLI);
                sbLIZ.append(", skeletonLayoutData=");
                sbLIZ.append(this.LLILLL);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // X.InterfaceC900060ZSq
            public final C462620ICe LIZJ() {
                return this.LLILLJJLI;
            }

            @Override // X.InterfaceC900060ZSq
            public final DynamicCardTemplate LJJLIL() {
                return this.LL;
            }

            @Override // X.InterfaceC461380I7k
            public final C0IB0 LLILII() {
                return this.LLILLL;
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
                return C900050ZSp.LIZ(this, interfaceC1891350zJl);
            }

            {
                this.LL = dynamicCardTemplate;
                this.LLILLJJLI = c462620ICe;
                this.LLILLL = c0ib0;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol
    public final InterfaceC461380I7k ts1(C869590Y9l c869590Y9l, C0IB0 c0ib0) {
        return new InterfaceC900060ZSq((DynamicCardTemplate) C0Z2Z.LIZ(c869590Y9l, DynamicCardTemplate.class), C0ICS.LIZ(false), c0ib0) { // from class: X.0ZSl
            public final DynamicCardTemplate LL;
            public final C462620ICe LLILLJJLI;
            public final C0IB0 LLILLL;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C900010ZSl)) {
                    return false;
                }
                C900010ZSl c900010ZSl = (C900010ZSl) obj;
                return Intrinsics.LJFF(this.LL, c900010ZSl.LL) && Intrinsics.LJFF(this.LLILLJJLI, c900010ZSl.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c900010ZSl.LLILLL);
            }

            public final int hashCode() {
                DynamicCardTemplate dynamicCardTemplate = this.LL;
                return ((((dynamicCardTemplate == null ? 0 : dynamicCardTemplate.hashCode()) * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode();
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("DynamicCardReceiveSkeletonLayoutPowerItem(dynamicCardTemplate=");
                sbLIZ.append(this.LL);
                sbLIZ.append(", backgroundConfig=");
                sbLIZ.append(this.LLILLJJLI);
                sbLIZ.append(", skeletonLayoutData=");
                sbLIZ.append(this.LLILLL);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // X.InterfaceC900060ZSq
            public final C462620ICe LIZJ() {
                return this.LLILLJJLI;
            }

            @Override // X.InterfaceC900060ZSq
            public final DynamicCardTemplate LJJLIL() {
                return this.LL;
            }

            @Override // X.InterfaceC461380I7k
            public final C0IB0 LLILII() {
                return this.LLILLL;
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
                return C900050ZSp.LIZ(this, interfaceC1891350zJl);
            }

            {
                this.LL = dynamicCardTemplate;
                this.LLILLJJLI = c462620ICe;
                this.LLILLL = c0ib0;
            }
        };
    }
}
