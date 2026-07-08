package com.ss.android.ugc.aweme.im.sdk.chat.ui.unified;

import X.C01GW;
import X.C0I3J;
import X.C0I98;
import X.C0IB0;
import X.C0IB1;
import X.C0ICS;
import X.C0Z2Z;
import X.C1233604sA;
import X.C1233704sB;
import X.C1258904wF;
import X.C1622006Ws;
import X.C21627319kV;
import X.C2188811AlT;
import X.C460250I3b;
import X.C461020I6a;
import X.C462510IBt;
import X.C824430WVt;
import X.C844450XAt;
import X.C869590Y9l;
import X.C898560ZMw;
import X.C898790ZNt;
import X.C900440ZUc;
import X.C900450ZUd;
import X.C900520ZUk;
import X.C902710ZbB;
import X.InterfaceC460300I3g;
import X.InterfaceC461380I7k;
import X.InterfaceC902790ZbJ;
import X.InterfaceC903660Zci;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.message.content.ShareChallengeContent;
import com.ss.android.ugc.aweme.im.message.content.ShareCompilationContent;
import com.ss.android.ugc.aweme.im.message.content.ShareEffectContent;
import com.ss.android.ugc.aweme.im.message.content.ShareMusicContent;
import com.ss.android.ugc.aweme.im.message.content.ShareQnAContent;
import com.ss.android.ugc.aweme.im.message.content.ShareSearchContent;
import com.ss.android.ugc.aweme.im.message.content.ShareSubscribeInviteContent;
import com.ss.android.ugc.aweme.im.message.content.ShareWebContent;
import com.ss.android.ugc.aweme.im.message.content.adapter.BaseContentParserKt;
import com.ss.android.ugc.aweme.im.message.template.card.ImageCardTemplate;
import com.ss.android.ugc.aweme.im.messagelist.api.cell.MessageListProtocolEnum;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ForwardOrReply;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.MessageReactionsState;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.NoButton;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutPowerCell;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol;
import com.ss.android.ugc.aweme.im.service.ITemplateIconResourceMapper;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS380S0200000_14;
import kotlin.jvm.internal.AwS585S0100000_6;
import kotlin.jvm.internal.AwS593S0100000_14;
import kotlin.jvm.internal.AwS628S0100000_14;
import kotlin.jvm.internal.AwS99S0201000_14;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes15.dex */
public final class UnifiedShareSimpleProtocol implements SkeletonMessageListProtocol<C900450ZUd, C900440ZUc> {
    public static final C900520ZUk LLIZ = new C900520ZUk(R.raw.icon_2pt_link, new C1233704sB(2131836214, (List<String>) null), new C1258904wF(""), 8, null, null, true, false, false, new C1622006Ws(AFwS248S0000000_14.get$arr$(265)), null, true, 1408);
    public final SessionInfo LL;
    public final Class<? extends IMSkeletonLayoutPowerCell<?, C900450ZUd>> LLILLJJLI = UnifiedSimpleShareSendPowerCell.class;
    public final Class<? extends IMSkeletonLayoutPowerCell<?, C900440ZUc>> LLILLL = UnifiedSimpleShareReceivePowerCell.class;
    public final C898790ZNt LLILZ = new C898790ZNt(new int[]{22, 33, 19, 81, 72, 1801, 3001, 26, 1038, 1036}, AFwS248S0000000_14.get$arr$(266));
    public final MessageListProtocolEnum LLILZIL = MessageListProtocolEnum.UNIFIED_SHARE_SIMPLE;
    public final C21627319kV LLILZLL = C21627319kV.LIZJ();

    @Override // X.InterfaceC902780ZbI
    public final InterfaceC902790ZbJ<C900440ZUc> An() {
        return null;
    }

    @Override // X.InterfaceC902780ZbI
    public final InterfaceC902790ZbJ<C900450ZUd> Wh() {
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
    public final Class<? extends IMSkeletonLayoutPowerCell<?, C900450ZUd>> da() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC902770ZbH
    public final MessageListProtocolEnum getInterceptOrdering() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC902770ZbH
    public final /* bridge */ /* synthetic */ InterfaceC903660Zci getMsgHandlerCheck() {
        return this.LLILZ;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol
    public final Class<? extends IMSkeletonLayoutPowerCell<?, C900440ZUc>> gr() {
        return this.LLILLL;
    }

    public UnifiedShareSimpleProtocol(SessionInfo sessionInfo) {
        this.LL = sessionInfo;
    }

    public final C900520ZUk LIZJ(C869590Y9l c869590Y9l) {
        int i;
        String title;
        int i2;
        String image;
        String desc;
        String desc2;
        int i3;
        InterfaceC460300I3g c1258904wF;
        int i4;
        Long userCount;
        String title2;
        String title3;
        String authorName;
        String title4;
        String questionName;
        Integer numValueOf;
        String musicName;
        int msgType = c869590Y9l.getMsgType();
        String str = "";
        UrlModel urlModelLJIILIIL = null;
        UrlModel coverThumb = null;
        Integer numValueOf2 = null;
        Long lValueOf = null;
        UrlModel cover = null;
        urlModelLJIILIIL = null;
        UrlModel urlModelLJIILIIL2 = null;
        if (msgType == 22) {
            ShareMusicContent shareMusicContent = (ShareMusicContent) BaseContentParserKt.getOrParseJsonContent(c869590Y9l, ShareMusicContent.class);
            if (shareMusicContent != null && (musicName = shareMusicContent.getMusicName()) != null) {
                str = musicName;
            }
            C1258904wF c1258904wF2 = new C1258904wF(str);
            if (shareMusicContent != null) {
                numValueOf = Integer.valueOf(shareMusicContent.getUserCount());
            } else {
                numValueOf = null;
            }
            C1233604sA c1233604sALIZ = LIZ(this, numValueOf);
            if (shareMusicContent != null) {
                coverThumb = shareMusicContent.getCoverThumb();
            }
            return new C900520ZUk(R.raw.icon_2pt_music_note, c1258904wF2, c1233604sALIZ, 0, 2131835741, coverThumb, false, false, false, new C1622006Ws(new AwS585S0100000_6(shareMusicContent, 259)), null, true, 1472);
        }
        if (msgType == 33) {
            ShareQnAContent shareQnAContent = (ShareQnAContent) BaseContentParserKt.getOrParseJsonContent(c869590Y9l, ShareQnAContent.class);
            if (shareQnAContent != null && (questionName = shareQnAContent.getQuestionName()) != null) {
                str = questionName;
            }
            C1258904wF c1258904wF3 = new C1258904wF(str);
            if (shareQnAContent != null) {
                numValueOf2 = Integer.valueOf(shareQnAContent.getUserCount());
            }
            return new C900520ZUk(R.raw.icon_2pt_qa_ltr, c1258904wF3, LIZ(this, numValueOf2), 0, 2131835676, null, false, false, false, new C1622006Ws(new AwS593S0100000_14(shareQnAContent, 214)), null, true, 1472);
        }
        int i5 = 0;
        if (msgType == 19) {
            ShareChallengeContent shareChallengeContent = (ShareChallengeContent) BaseContentParserKt.getOrParseJsonContent(c869590Y9l, ShareChallengeContent.class);
            if (shareChallengeContent != null && (title4 = shareChallengeContent.getTitle()) != null) {
                str = title4;
            }
            C1258904wF c1258904wF4 = new C1258904wF(str);
            if (shareChallengeContent != null) {
                lValueOf = Long.valueOf(shareChallengeContent.getUserCount());
            }
            C1233604sA c1233604sALIZ2 = LIZ(this, lValueOf);
            if (shareChallengeContent == null || shareChallengeContent.getUserCount() <= 0) {
                i5 = 4;
            }
            return new C900520ZUk(R.raw.icon_2pt_number, c1258904wF4, c1233604sALIZ2, i5, null, null, false, false, false, new C1622006Ws(new AwS593S0100000_14(shareChallengeContent, 216)), null, true, 1472);
        }
        if (msgType == 81) {
            ShareCompilationContent shareCompilationContent = (ShareCompilationContent) BaseContentParserKt.getOrParseJsonContent(c869590Y9l, ShareCompilationContent.class);
            if (shareCompilationContent == null || (title3 = shareCompilationContent.getTitle()) == null) {
                title3 = "";
            }
            C460250I3b c460250I3b = new C460250I3b(title3, new AwS628S0100000_14(shareCompilationContent, 47));
            if (shareCompilationContent != null && (authorName = shareCompilationContent.getAuthorName()) != null) {
                str = authorName;
            }
            return new C900520ZUk(R.raw.icon_2pt_playlist, c460250I3b, new C1233704sB(2131840557, str), 0, 2131829411, null, false, false, false, new C1622006Ws(new AwS593S0100000_14(shareCompilationContent, 213)), null, false, 1472);
        }
        if (msgType == 72) {
            ShareEffectContent shareEffectContent = (ShareEffectContent) BaseContentParserKt.getOrParseJsonContent(c869590Y9l, ShareEffectContent.class);
            if (shareEffectContent != null && (title2 = shareEffectContent.getTitle()) != null) {
                str = title2;
            }
            C1258904wF c1258904wF5 = new C1258904wF(str);
            if (shareEffectContent != null) {
                userCount = shareEffectContent.getUserCount();
            } else {
                userCount = null;
            }
            C1233604sA c1233604sALIZ3 = LIZ(this, userCount);
            if (shareEffectContent != null) {
                cover = shareEffectContent.getCover();
            }
            return new C900520ZUk(R.raw.icon_2pt_effect, c1258904wF5, c1233604sALIZ3, 0, 2131848878, cover, false, false, false, new C1622006Ws(new AwS593S0100000_14(shareEffectContent, 215)), null, true, 1472);
        }
        if (msgType == 26) {
            ShareWebContent shareWebContent = (ShareWebContent) BaseContentParserKt.getOrParseJsonContent(c869590Y9l, ShareWebContent.class);
            if (shareWebContent != null) {
                String[] strArr = C844450XAt.LIZ;
                if (!C844450XAt.LIZJ(shareWebContent.getUrl(), C844450XAt.LIZIZ()) && !C844450XAt.LIZJ(shareWebContent.getImage(), C844450XAt.LIZIZ())) {
                    boolean zIsHighRiskConversation = this.LL.isHighRiskConversation();
                    if (zIsHighRiskConversation) {
                        i3 = R.raw.icon_large_protection;
                    } else {
                        i3 = R.raw.icon_2pt_link;
                    }
                    String title5 = shareWebContent.getTitle();
                    if (title5 == null) {
                        title5 = "";
                    }
                    C1258904wF c1258904wF6 = new C1258904wF(title5);
                    if (zIsHighRiskConversation) {
                        c1258904wF = new C1233704sB(2131832033, (List<String>) null);
                    } else {
                        String desc3 = shareWebContent.getDesc();
                        if (desc3 != null) {
                            str = desc3;
                        }
                        c1258904wF = new C1258904wF(str);
                        String desc4 = shareWebContent.getDesc();
                        if (desc4 == null || a0.LJJJIL(desc4)) {
                            i4 = 8;
                        }
                        return new C900520ZUk(i3, c1258904wF6, c1258904wF, i4, 2131835832, C0I98.LJIILIIL(shareWebContent.getImage()), false, zIsHighRiskConversation, zIsHighRiskConversation, new C1622006Ws(new AwS380S0200000_14(c869590Y9l, shareWebContent, 83)), null, true, 1088);
                    }
                    i4 = 0;
                    return new C900520ZUk(i3, c1258904wF6, c1258904wF, i4, 2131835832, C0I98.LJIILIIL(shareWebContent.getImage()), false, zIsHighRiskConversation, zIsHighRiskConversation, new C1622006Ws(new AwS380S0200000_14(c869590Y9l, shareWebContent, 83)), null, true, 1088);
                }
            }
            return LLIZ;
        }
        if (msgType == 1038) {
            ShareSubscribeInviteContent shareSubscribeInviteContent = (ShareSubscribeInviteContent) BaseContentParserKt.getOrParseJsonContent(c869590Y9l, ShareSubscribeInviteContent.class);
            if (shareSubscribeInviteContent == null || (title = shareSubscribeInviteContent.getTitle()) == null) {
                title = "";
            }
            C1258904wF c1258904wF7 = new C1258904wF(title);
            if (shareSubscribeInviteContent != null && (desc2 = shareSubscribeInviteContent.getDesc()) != null) {
                str = desc2;
            }
            C1258904wF c1258904wF8 = new C1258904wF(str);
            if (shareSubscribeInviteContent != null && (desc = shareSubscribeInviteContent.getDesc()) != null && !a0.LJJJIL(desc)) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            if (shareSubscribeInviteContent != null && (image = shareSubscribeInviteContent.getImage()) != null) {
                urlModelLJIILIIL2 = C0I98.LJIILIIL(image);
            }
            return new C900520ZUk(R.raw.icon_2pt_link, c1258904wF7, c1258904wF8, i2, 2131835832, urlModelLJIILIIL2, false, false, false, new C1622006Ws(new AwS593S0100000_14(shareSubscribeInviteContent, 212)), null, true, 1472);
        }
        if (msgType == 1036) {
            ShareSearchContent shareSearchContent = (ShareSearchContent) BaseContentParserKt.getOrParseJsonContent(c869590Y9l, ShareSearchContent.class);
            if (shareSearchContent != null) {
                String[] strArr2 = C844450XAt.LIZ;
                if (!C844450XAt.LIZJ(shareSearchContent.getImage(), C844450XAt.LIZIZ()) && !C844450XAt.LIZJ(shareSearchContent.getUrl(), C844450XAt.LIZIZ()) && !C824430WVt.LIZIZ(shareSearchContent.getSchema())) {
                    String title6 = shareSearchContent.getTitle();
                    if (title6 == null) {
                        title6 = "";
                    }
                    C1258904wF c1258904wF9 = new C1258904wF(title6);
                    String desc5 = shareSearchContent.getDesc();
                    if (desc5 != null) {
                        str = desc5;
                    }
                    C1258904wF c1258904wF10 = new C1258904wF(str);
                    String desc6 = shareSearchContent.getDesc();
                    if (desc6 != null && !a0.LJJJIL(desc6)) {
                        i = 0;
                    } else {
                        i = 8;
                    }
                    String image2 = shareSearchContent.getImage();
                    if (image2 != null) {
                        urlModelLJIILIIL = C0I98.LJIILIIL(image2);
                    }
                    return new C900520ZUk(R.raw.icon_2pt_link, c1258904wF9, c1258904wF10, i, 2131835832, urlModelLJIILIIL, false, false, false, new C1622006Ws(new AwS593S0100000_14(shareSearchContent, 211)), null, true, 1472);
                }
            }
            return LLIZ;
        }
        if (msgType == 1801) {
            return LIZLLL(c869590Y9l, (ImageCardTemplate) C0Z2Z.LIZ(c869590Y9l, ImageCardTemplate.class));
        }
        if (msgType == 3001) {
            return LIZLLL(c869590Y9l, (ImageCardTemplate) C0Z2Z.LIZ(c869590Y9l, ImageCardTemplate.class));
        }
        "Missmatch with type specific in msgHandlerCheck".toString();
        throw new IllegalStateException("Missmatch with type specific in msgHandlerCheck");
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol
    public final C902710ZbB Vx2(C01GW c01gw) {
        return new C902710ZbB(this, c01gw);
    }

    public static C1233604sA LIZ(UnifiedShareSimpleProtocol unifiedShareSimpleProtocol, Number number) {
        unifiedShareSimpleProtocol.getClass();
        if (number == null) {
            number = 0;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(2131755704);
        sbLIZ.append(':');
        sbLIZ.append(number);
        return new C1233604sA(C2188811AlT.LIZIZ(sbLIZ), new AwS99S0201000_14(2131755704, number, unifiedShareSimpleProtocol, 2));
    }

    public static C900520ZUk LIZLLL(C869590Y9l c869590Y9l, ImageCardTemplate imageCardTemplate) {
        boolean z;
        InterfaceC460300I3g c1233704sB;
        if (imageCardTemplate == null) {
            return LLIZ;
        }
        int i = 0;
        int iLIZ = ((ITemplateIconResourceMapper) ServiceManager.get().getService(ITemplateIconResourceMapper.class)).LIZ(c869590Y9l.getScene(), false);
        String str = imageCardTemplate.titleBar.title.text;
        if (str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        UrlModel urlModelLIZ = null;
        if (z) {
            c1233704sB = new C1258904wF(str);
        } else {
            c1233704sB = new C1233704sB(2131832164, (List<String>) null);
        }
        String str2 = imageCardTemplate.titleBar.subtitle.text;
        C1258904wF c1258904wF = new C1258904wF(str2);
        if (str2.length() == 0) {
            i = 8;
        }
        List<String> list = imageCardTemplate.titleBar.leftImage.urls;
        if (!list.isEmpty()) {
            urlModelLIZ = C0I3J.LIZ(list);
        }
        return new C900520ZUk(iLIZ, c1233704sB, c1258904wF, i, null, urlModelLIZ, false, false, false, new C1622006Ws(new AwS380S0200000_14(c869590Y9l, imageCardTemplate, 39)), new C1622006Ws(AFwS201S0000000_14.get$arr$(226)), false, 448);
    }

    public static C0IB0 LJ(C0IB0 c0ib0, boolean z) {
        MessageReactionsState messageReactionsState;
        if (!z) {
            C461020I6a<? extends Object> c461020I6a = c0ib0.LIZJ.get(C898560ZMw.LIZ);
            if (c461020I6a != null && c461020I6a.LIZIZ) {
                T t = c461020I6a.LIZ;
                if (!(t instanceof MessageReactionsState) || (messageReactionsState = (MessageReactionsState) t) == null || !messageReactionsState.hasBigSocialAvatar()) {
                    return c0ib0;
                }
            } else {
                return c0ib0;
            }
        }
        C461020I6a<? extends Object> c461020I6a2 = c0ib0.LIZJ.get(C462510IBt.LIZ);
        if (c461020I6a2 != null && c461020I6a2.LIZIZ && (c461020I6a2.LIZ instanceof ForwardOrReply)) {
            return C0IB1.LIZIZ(c0ib0, NoButton.INSTANCE, false);
        }
        return c0ib0;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol
    public final InterfaceC461380I7k m72(C869590Y9l c869590Y9l, C0IB0 c0ib0) {
        C900520ZUk c900520ZUkLIZJ = LIZJ(c869590Y9l);
        return new C900450ZUd(c900520ZUkLIZJ, C0ICS.LIZ(true), LJ(c0ib0, c900520ZUkLIZJ.LJI));
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol
    public final InterfaceC461380I7k ts1(C869590Y9l c869590Y9l, C0IB0 c0ib0) {
        return new C900440ZUc(LIZJ(c869590Y9l), C0ICS.LIZ(false), LJ(c0ib0, LIZJ(c869590Y9l).LJI));
    }
}
