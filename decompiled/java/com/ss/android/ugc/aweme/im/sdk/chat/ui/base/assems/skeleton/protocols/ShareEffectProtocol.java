package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.skeleton.protocols;

import X.C01GW;
import X.C0IB0;
import X.C0ICS;
import X.C869590Y9l;
import X.C898790ZNt;
import X.C900460ZUe;
import X.C900470ZUf;
import X.C900650ZUx;
import X.C902710ZbB;
import X.InterfaceC461380I7k;
import X.InterfaceC900630ZUv;
import X.InterfaceC902790ZbJ;
import X.InterfaceC903660Zci;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.message.content.ShareEffectContent;
import com.ss.android.ugc.aweme.im.message.content.adapter.BaseContentParserKt;
import com.ss.android.ugc.aweme.im.messagelist.api.cell.MessageListProtocolEnum;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutPowerCell;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.skeleton.IMShareEffectNewTemplateCardExperiment;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class ShareEffectProtocol implements SkeletonMessageListProtocol<C900470ZUf, C900460ZUe> {
    public final Class<? extends IMSkeletonLayoutPowerCell<?, C900470ZUf>> LL = ShareEffectSendPowerCell.class;
    public final Class<? extends IMSkeletonLayoutPowerCell<?, C900460ZUe>> LLILLJJLI = ShareEffectReceivePowerCell.class;
    public final C898790ZNt LLILLL = new C898790ZNt(new int[]{72});
    public final boolean LLILZ = IMShareEffectNewTemplateCardExperiment.isEnabled();
    public final MessageListProtocolEnum LLILZIL = MessageListProtocolEnum.SHARE_EFFECT_NEW_CARD;

    @Override // X.InterfaceC902780ZbI
    public final InterfaceC902790ZbJ<C900460ZUe> An() {
        return null;
    }

    @Override // X.InterfaceC902780ZbI
    public final InterfaceC902790ZbJ<C900470ZUf> Wh() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC902770ZbH
    public final List<C869590Y9l> intercept(List<? extends C869590Y9l> list) {
        return list;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol
    public final Class<? extends IMSkeletonLayoutPowerCell<?, C900470ZUf>> da() {
        return this.LL;
    }

    @Override // X.InterfaceC902770ZbH
    public final MessageListProtocolEnum getInterceptOrdering() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC902770ZbH
    public final /* bridge */ /* synthetic */ InterfaceC903660Zci getMsgHandlerCheck() {
        return this.LLILLL;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol
    public final Class<? extends IMSkeletonLayoutPowerCell<?, C900460ZUe>> gr() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC902770ZbH
    public final boolean isEnabled() {
        return this.LLILZ;
    }

    public static C900650ZUx LIZ(ShareEffectContent shareEffectContent) {
        String stickerId;
        String title;
        Long userCount;
        UrlModel cover = null;
        if (shareEffectContent != null) {
            stickerId = shareEffectContent.getStickerId();
            title = shareEffectContent.getTitle();
            userCount = shareEffectContent.getUserCount();
            cover = shareEffectContent.getCover();
        } else {
            stickerId = null;
            title = null;
            userCount = null;
        }
        return new C900650ZUx(stickerId, cover, userCount, title);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol
    public final C902710ZbB Vx2(C01GW c01gw) {
        return new C902710ZbB(this, c01gw);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol
    public final InterfaceC461380I7k m72(C869590Y9l c869590Y9l, C0IB0 c0ib0) {
        return new InterfaceC900630ZUv(LIZ((ShareEffectContent) BaseContentParserKt.getOrParseJsonContent(c869590Y9l, ShareEffectContent.class)), C0ICS.LIZ(true), c0ib0) { // from class: X.0ZUf
            public final C900650ZUx LL;
            public final C462620ICe LLILLJJLI;
            public final C0IB0 LLILLL;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C900470ZUf)) {
                    return false;
                }
                C900470ZUf c900470ZUf = (C900470ZUf) obj;
                return Intrinsics.LJFF(this.LL, c900470ZUf.LL) && Intrinsics.LJFF(this.LLILLJJLI, c900470ZUf.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c900470ZUf.LLILLL);
            }

            public final int hashCode() {
                return (((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode();
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ShareEffectSendSkeletonLayoutPowerItem(content=");
                sbLIZ.append(this.LL);
                sbLIZ.append(", backgroundConfig=");
                sbLIZ.append(this.LLILLJJLI);
                sbLIZ.append(", skeletonLayoutData=");
                sbLIZ.append(this.LLILLL);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // X.InterfaceC900630ZUv
            public final C462620ICe LIZJ() {
                return this.LLILLJJLI;
            }

            @Override // X.InterfaceC461380I7k
            public final C0IB0 LLILII() {
                return this.LLILLL;
            }

            @Override // X.InterfaceC900630ZUv
            public final C900650ZUx getContent() {
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
                return C900620ZUu.LIZ(this, interfaceC1891350zJl);
            }

            {
                this.LL = c900650ZUx;
                this.LLILLJJLI = c462620ICe;
                this.LLILLL = c0ib0;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol
    public final InterfaceC461380I7k ts1(C869590Y9l c869590Y9l, C0IB0 c0ib0) {
        return new InterfaceC900630ZUv(LIZ((ShareEffectContent) BaseContentParserKt.getOrParseJsonContent(c869590Y9l, ShareEffectContent.class)), C0ICS.LIZ(false), c0ib0) { // from class: X.0ZUe
            public final C900650ZUx LL;
            public final C462620ICe LLILLJJLI;
            public final C0IB0 LLILLL;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C900460ZUe)) {
                    return false;
                }
                C900460ZUe c900460ZUe = (C900460ZUe) obj;
                return Intrinsics.LJFF(this.LL, c900460ZUe.LL) && Intrinsics.LJFF(this.LLILLJJLI, c900460ZUe.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c900460ZUe.LLILLL);
            }

            public final int hashCode() {
                return (((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode();
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ShareEffectReceiveSkeletonLayoutPowerItem(content=");
                sbLIZ.append(this.LL);
                sbLIZ.append(", backgroundConfig=");
                sbLIZ.append(this.LLILLJJLI);
                sbLIZ.append(", skeletonLayoutData=");
                sbLIZ.append(this.LLILLL);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // X.InterfaceC900630ZUv
            public final C462620ICe LIZJ() {
                return this.LLILLJJLI;
            }

            @Override // X.InterfaceC461380I7k
            public final C0IB0 LLILII() {
                return this.LLILLL;
            }

            @Override // X.InterfaceC900630ZUv
            public final C900650ZUx getContent() {
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
                return C900620ZUu.LIZ(this, interfaceC1891350zJl);
            }

            {
                this.LL = c900650ZUx;
                this.LLILLJJLI = c462620ICe;
                this.LLILLL = c0ib0;
            }
        };
    }
}
