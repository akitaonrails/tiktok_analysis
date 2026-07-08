package com.ss.android.ugc.aweme.im.sdk.chat.ui.portrait;

import X.C01GW;
import X.C0I3J;
import X.C0IB0;
import X.C0ICS;
import X.C0Z2Z;
import X.C1258904wF;
import X.C462620ICe;
import X.C462740ICq;
import X.C462750ICr;
import X.C462790ICv;
import X.C869590Y9l;
import X.C898790ZNt;
import X.C902710ZbB;
import X.InterfaceC461380I7k;
import X.InterfaceC462770ICt;
import X.InterfaceC902790ZbJ;
import X.InterfaceC903660Zci;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.message.template.card.PortraitCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.BaseUserComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import com.ss.android.ugc.aweme.im.message.template.component.TextComponent;
import com.ss.android.ugc.aweme.im.messagelist.api.cell.MessageListProtocolEnum;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutPowerCell;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class PortraitCardProtocol implements SkeletonMessageListProtocol<C462750ICr, C462740ICq> {
    public final Class<? extends IMSkeletonLayoutPowerCell<?, C462750ICr>> LL = PortraitCardSendPowerCell.class;
    public final Class<? extends IMSkeletonLayoutPowerCell<?, C462740ICq>> LLILLJJLI = PortraitCardReceivePowerCell.class;
    public final C898790ZNt LLILLL = new C898790ZNt(new int[]{1806});
    public final MessageListProtocolEnum LLILZ = MessageListProtocolEnum.PORTRAIT_CARD;

    @Override // X.InterfaceC902780ZbI
    public final InterfaceC902790ZbJ<C462740ICq> An() {
        return null;
    }

    @Override // X.InterfaceC902780ZbI
    public final InterfaceC902790ZbJ<C462750ICr> Wh() {
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
    public final Class<? extends IMSkeletonLayoutPowerCell<?, C462750ICr>> da() {
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
    public final Class<? extends IMSkeletonLayoutPowerCell<?, C462740ICq>> gr() {
        return this.LLILLJJLI;
    }

    public static C462790ICv LIZ(PortraitCardTemplate portraitCardTemplate) {
        String str;
        String str2;
        String str3;
        UrlModel urlModelLIZ;
        List<String> list;
        BaseUserComponent baseUserComponent;
        ImageComponent imageComponent;
        List<String> list2;
        TextComponent textComponent;
        String str4;
        TextComponent textComponent2;
        TextComponent textComponent3;
        BaseUserComponent baseUserComponent2;
        TextComponent textComponent4;
        UrlModel urlModelLIZ2 = null;
        if (portraitCardTemplate != null && (baseUserComponent2 = portraitCardTemplate.userInfoComponent) != null && (textComponent4 = baseUserComponent2.nickname) != null) {
            str = textComponent4.text;
        } else {
            str = null;
        }
        String str5 = "";
        if (str == null) {
            str = "";
        }
        C1258904wF c1258904wF = new C1258904wF(str);
        if (portraitCardTemplate == null || (textComponent3 = portraitCardTemplate.titleComponent) == null || (str2 = textComponent3.text) == null) {
            str2 = "";
        }
        C1258904wF c1258904wF2 = new C1258904wF(str2);
        if (portraitCardTemplate == null || (textComponent2 = portraitCardTemplate.subTitleComponent) == null || (str3 = textComponent2.text) == null) {
            str3 = "";
        }
        C1258904wF c1258904wF3 = new C1258904wF(str3);
        if (portraitCardTemplate != null && (textComponent = portraitCardTemplate.hintTitleComponent) != null && (str4 = textComponent.text) != null) {
            str5 = str4;
        }
        C1258904wF c1258904wF4 = new C1258904wF(str5);
        if (portraitCardTemplate != null && (baseUserComponent = portraitCardTemplate.userInfoComponent) != null && (imageComponent = baseUserComponent.avatar) != null && (list2 = imageComponent.urls) != null) {
            urlModelLIZ = C0I3J.LIZ(list2);
        } else {
            urlModelLIZ = null;
            if (portraitCardTemplate != null) {
            }
            return new C462790ICv(c1258904wF, c1258904wF2, c1258904wF3, c1258904wF4, urlModelLIZ, urlModelLIZ2);
        }
        ImageComponent imageComponent2 = portraitCardTemplate.imageComponent;
        if (imageComponent2 != null && (list = imageComponent2.urls) != null) {
            urlModelLIZ2 = C0I3J.LIZ(list);
        }
        return new C462790ICv(c1258904wF, c1258904wF2, c1258904wF3, c1258904wF4, urlModelLIZ, urlModelLIZ2);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol
    public final C902710ZbB Vx2(C01GW c01gw) {
        return new C902710ZbB(this, c01gw);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol
    public final InterfaceC461380I7k m72(C869590Y9l c869590Y9l, final C0IB0 c0ib0) {
        final C462790ICv c462790ICvLIZ = LIZ((PortraitCardTemplate) C0Z2Z.LIZ(c869590Y9l, PortraitCardTemplate.class));
        final C462620ICe c462620ICeLIZ = C0ICS.LIZ(true);
        return new InterfaceC462770ICt(c462790ICvLIZ, c462620ICeLIZ, c0ib0) { // from class: X.0ICr
            public final C462790ICv LL;
            public final C462620ICe LLILLJJLI;
            public final C0IB0 LLILLL;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C462750ICr)) {
                    return false;
                }
                C462750ICr c462750ICr = (C462750ICr) obj;
                return Intrinsics.LJFF(this.LL, c462750ICr.LL) && Intrinsics.LJFF(this.LLILLJJLI, c462750ICr.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c462750ICr.LLILLL);
            }

            public final int hashCode() {
                return (((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode();
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("PortraitCardSendSkeletonLayoutPowerItem(content=");
                sbLIZ.append(this.LL);
                sbLIZ.append(", backgroundConfig=");
                sbLIZ.append(this.LLILLJJLI);
                sbLIZ.append(", skeletonLayoutData=");
                sbLIZ.append(this.LLILLL);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // X.InterfaceC462770ICt
            public final C462620ICe LIZJ() {
                return this.LLILLJJLI;
            }

            @Override // X.InterfaceC461380I7k
            public final C0IB0 LLILII() {
                return this.LLILLL;
            }

            @Override // X.InterfaceC462770ICt
            public final C462790ICv getContent() {
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
                return C462760ICs.LIZ(this, interfaceC1891350zJl);
            }

            {
                this.LL = c462790ICvLIZ;
                this.LLILLJJLI = c462620ICeLIZ;
                this.LLILLL = c0ib0;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol
    public final InterfaceC461380I7k ts1(C869590Y9l c869590Y9l, final C0IB0 c0ib0) {
        final C462790ICv c462790ICvLIZ = LIZ((PortraitCardTemplate) C0Z2Z.LIZ(c869590Y9l, PortraitCardTemplate.class));
        final C462620ICe c462620ICeLIZ = C0ICS.LIZ(false);
        return new InterfaceC462770ICt(c462790ICvLIZ, c462620ICeLIZ, c0ib0) { // from class: X.0ICq
            public final C462790ICv LL;
            public final C462620ICe LLILLJJLI;
            public final C0IB0 LLILLL;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C462740ICq)) {
                    return false;
                }
                C462740ICq c462740ICq = (C462740ICq) obj;
                return Intrinsics.LJFF(this.LL, c462740ICq.LL) && Intrinsics.LJFF(this.LLILLJJLI, c462740ICq.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c462740ICq.LLILLL);
            }

            public final int hashCode() {
                return (((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode();
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("PortraitCardReceiveSkeletonLayoutPowerItem(content=");
                sbLIZ.append(this.LL);
                sbLIZ.append(", backgroundConfig=");
                sbLIZ.append(this.LLILLJJLI);
                sbLIZ.append(", skeletonLayoutData=");
                sbLIZ.append(this.LLILLL);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // X.InterfaceC462770ICt
            public final C462620ICe LIZJ() {
                return this.LLILLJJLI;
            }

            @Override // X.InterfaceC461380I7k
            public final C0IB0 LLILII() {
                return this.LLILLL;
            }

            @Override // X.InterfaceC462770ICt
            public final C462790ICv getContent() {
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
                return C462760ICs.LIZ(this, interfaceC1891350zJl);
            }

            {
                this.LL = c462790ICvLIZ;
                this.LLILLJJLI = c462620ICeLIZ;
                this.LLILLL = c0ib0;
            }
        };
    }
}
