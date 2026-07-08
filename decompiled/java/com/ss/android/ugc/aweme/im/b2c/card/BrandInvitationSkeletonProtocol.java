package com.ss.android.ugc.aweme.im.b2c.card;

import X.C01GW;
import X.C0IB0;
import X.C0ZRV;
import X.C0ZRW;
import X.C0ZRY;
import X.C869590Y9l;
import X.C898790ZNt;
import X.C899640ZRa;
import X.C902710ZbB;
import X.InterfaceC461380I7k;
import X.InterfaceC902790ZbJ;
import X.InterfaceC903660Zci;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.message.content.BaseContent;
import com.ss.android.ugc.aweme.im.message.content.BrandInvitationContent;
import com.ss.android.ugc.aweme.im.message.content.LinkInfo;
import com.ss.android.ugc.aweme.im.message.content.MessageTitle;
import com.ss.android.ugc.aweme.im.message.content.SystemCardContent;
import com.ss.android.ugc.aweme.im.message.content.TextInfo;
import com.ss.android.ugc.aweme.im.message.content.Title;
import com.ss.android.ugc.aweme.im.message.content.VideoInfo;
import com.ss.android.ugc.aweme.im.message.content.adapter.BaseContentParserKt;
import com.ss.android.ugc.aweme.im.messagelist.api.cell.MessageListProtocolEnum;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutPowerCell;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class BrandInvitationSkeletonProtocol implements SkeletonMessageListProtocol<C0ZRW, C0ZRV> {
    public final Class<? extends IMSkeletonLayoutPowerCell<?, C0ZRW>> LL = BrandInvitationSendPowerCell.class;
    public final Class<? extends IMSkeletonLayoutPowerCell<?, C0ZRV>> LLILLJJLI = BrandInvitationReceivePowerCell.class;
    public final C898790ZNt LLILLL = new C898790ZNt(new int[]{1037});
    public final MessageListProtocolEnum LLILZ = MessageListProtocolEnum.BRAND_INVITATION;

    @Override // X.InterfaceC902780ZbI
    public final InterfaceC902790ZbJ<C0ZRV> An() {
        return null;
    }

    @Override // X.InterfaceC902780ZbI
    public final InterfaceC902790ZbJ<C0ZRW> Wh() {
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
    public final Class<? extends IMSkeletonLayoutPowerCell<?, C0ZRW>> da() {
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
    public final Class<? extends IMSkeletonLayoutPowerCell<?, C0ZRV>> gr() {
        return this.LLILLJJLI;
    }

    public static C899640ZRa LIZ(C869590Y9l c869590Y9l) {
        SystemCardContent systemCardContent;
        String str;
        UrlModel urlModel;
        TextInfo textInfo;
        VideoInfo videoInfo;
        TextInfo textInfo2;
        MessageTitle messageTitle;
        String str2;
        Title title;
        BaseContent orParseJsonContent = BaseContentParserKt.getOrParseJsonContent(c869590Y9l, BrandInvitationContent.class);
        LinkInfo linkInfo = null;
        if (orParseJsonContent instanceof BrandInvitationContent) {
            systemCardContent = (SystemCardContent) orParseJsonContent;
        } else {
            systemCardContent = null;
        }
        if (systemCardContent != null && (title = systemCardContent.getTitle()) != null) {
            str = title.title;
        } else {
            str = null;
        }
        String str3 = "";
        if (str == null) {
            str = "";
        }
        if (systemCardContent != null && (textInfo2 = systemCardContent.getTextInfo()) != null && (messageTitle = textInfo2.title) != null && (str2 = messageTitle.title) != null) {
            str3 = str2;
        }
        if (systemCardContent != null && (videoInfo = systemCardContent.getVideoInfo()) != null) {
            urlModel = videoInfo.cover;
        } else {
            urlModel = null;
            if (systemCardContent == null) {
                textInfo = null;
            }
            return new C899640ZRa(str, str3, urlModel, textInfo, linkInfo);
        }
        textInfo = systemCardContent.getTextInfo();
        linkInfo = systemCardContent.getLinkInfo();
        return new C899640ZRa(str, str3, urlModel, textInfo, linkInfo);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol
    public final C902710ZbB Vx2(C01GW c01gw) {
        return new C902710ZbB(this, c01gw);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol
    public final InterfaceC461380I7k m72(C869590Y9l c869590Y9l, final C0IB0 c0ib0) {
        final C899640ZRa c899640ZRaLIZ = LIZ(c869590Y9l);
        return new C0ZRY(c899640ZRaLIZ, c0ib0) { // from class: X.0ZRW
            public final C899640ZRa LL;
            public final C0IB0 LLILLJJLI;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0ZRW)) {
                    return false;
                }
                C0ZRW c0zrw = (C0ZRW) obj;
                return Intrinsics.LJFF(this.LL, c0zrw.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0zrw.LLILLJJLI);
            }

            public final int hashCode() {
                return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("BrandInvitationSendSkeletonLayoutPowerItem(content=");
                sbLIZ.append(this.LL);
                sbLIZ.append(", skeletonLayoutData=");
                sbLIZ.append(this.LLILLJJLI);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // X.InterfaceC461380I7k
            public final C0IB0 LLILII() {
                return this.LLILLJJLI;
            }

            @Override // X.C0ZRY
            public final C899640ZRa getContent() {
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
                return C0ZRX.LIZ(this, interfaceC1891350zJl);
            }

            {
                this.LL = c899640ZRaLIZ;
                this.LLILLJJLI = c0ib0;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol
    public final InterfaceC461380I7k ts1(C869590Y9l c869590Y9l, final C0IB0 c0ib0) {
        final C899640ZRa c899640ZRaLIZ = LIZ(c869590Y9l);
        return new C0ZRY(c899640ZRaLIZ, c0ib0) { // from class: X.0ZRV
            public final C899640ZRa LL;
            public final C0IB0 LLILLJJLI;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0ZRV)) {
                    return false;
                }
                C0ZRV c0zrv = (C0ZRV) obj;
                return Intrinsics.LJFF(this.LL, c0zrv.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0zrv.LLILLJJLI);
            }

            public final int hashCode() {
                return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("BrandInvitationReceiveSkeletonLayoutPowerItem(content=");
                sbLIZ.append(this.LL);
                sbLIZ.append(", skeletonLayoutData=");
                sbLIZ.append(this.LLILLJJLI);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // X.InterfaceC461380I7k
            public final C0IB0 LLILII() {
                return this.LLILLJJLI;
            }

            @Override // X.C0ZRY
            public final C899640ZRa getContent() {
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
                return C0ZRX.LIZ(this, interfaceC1891350zJl);
            }

            {
                this.LL = c899640ZRaLIZ;
                this.LLILLJJLI = c0ib0;
            }
        };
    }
}
