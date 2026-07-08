package com.ss.android.ugc.aweme.im.sdk.chat.ui.unified;

import X.C01GW;
import X.C0I3J;
import X.C0IB0;
import X.C0ICS;
import X.C0Z2Z;
import X.C1173604iU;
import X.C123100dR;
import X.C1233704sB;
import X.C1258904wF;
import X.C13BV;
import X.C1622006Ws;
import X.C1843500y4a;
import X.C21627319kV;
import X.C460250I3b;
import X.C460280I3e;
import X.C460450I3v;
import X.C869590Y9l;
import X.C898790ZNt;
import X.C900420ZUa;
import X.C900430ZUb;
import X.C900480ZUg;
import X.C902710ZbB;
import X.InterfaceC460300I3g;
import X.InterfaceC460900I5o;
import X.InterfaceC461380I7k;
import X.InterfaceC902790ZbJ;
import X.InterfaceC903660Zci;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.message.content.ShareChallengeContent;
import com.ss.android.ugc.aweme.im.message.content.ShareCompilationContent;
import com.ss.android.ugc.aweme.im.message.content.ShareEffectContent;
import com.ss.android.ugc.aweme.im.message.content.ShareMusicContent;
import com.ss.android.ugc.aweme.im.message.content.ShareQnAContent;
import com.ss.android.ugc.aweme.im.message.content.adapter.BaseContentParserKt;
import com.ss.android.ugc.aweme.im.message.template.card.ImageCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.imagecard.ImageCardTitleBar;
import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import com.ss.android.ugc.aweme.im.message.template.component.TextComponent;
import com.ss.android.ugc.aweme.im.message.template.component.VideoCoverComponent;
import com.ss.android.ugc.aweme.im.messagelist.api.cell.MessageListProtocolEnum;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutPowerCell;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol;
import com.ss.android.ugc.aweme.im.service.ITemplateIconResourceMapper;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS380S0200000_14;
import kotlin.jvm.internal.AwS585S0100000_6;
import kotlin.jvm.internal.AwS593S0100000_14;
import kotlin.jvm.internal.AwS628S0100000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class UnifiedShareMultipleProtocol implements SkeletonMessageListProtocol<C900430ZUb, C900420ZUa> {
    public final Class<? extends IMSkeletonLayoutPowerCell<?, C900430ZUb>> LL = UnifiedMultipleShareSendPowerCell.class;
    public final Class<? extends IMSkeletonLayoutPowerCell<?, C900420ZUa>> LLILLJJLI = UnifiedMultipleShareReceivePowerCell.class;
    public final C898790ZNt LLILLL = new C898790ZNt(new int[]{22, 33, 19, 81, 72, 1801, 3001});
    public final MessageListProtocolEnum LLILZ = MessageListProtocolEnum.UNIFIED_SHARE_MULTIPLE;

    @Override // X.InterfaceC902780ZbI
    public final InterfaceC902790ZbJ<C900420ZUa> An() {
        return null;
    }

    @Override // X.InterfaceC902780ZbI
    public final InterfaceC902790ZbJ<C900430ZUb> Wh() {
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
    public final Class<? extends IMSkeletonLayoutPowerCell<?, C900430ZUb>> da() {
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
    public final Class<? extends IMSkeletonLayoutPowerCell<?, C900420ZUa>> gr() {
        return this.LLILLJJLI;
    }

    public static C900480ZUg LIZ(C869590Y9l c869590Y9l) {
        List<String> list;
        InterfaceC460900I5o c1173604iU;
        InterfaceC460300I3g c1233704sB;
        String str;
        List<VideoCoverComponent> list2;
        List<String> list3;
        UrlModel urlModelLIZ;
        ImageCardTitleBar imageCardTitleBar;
        TextComponent textComponent;
        ImageCardTitleBar imageCardTitleBar2;
        TextComponent textComponent2;
        String str2;
        ImageCardTitleBar imageCardTitleBar3;
        TextComponent textComponent3;
        String str3;
        ImageCardTitleBar imageCardTitleBar4;
        ImageComponent imageComponent;
        long jLongValue;
        Long userCount;
        Long userCount2;
        String title;
        String authorName;
        String title2;
        long userCount3;
        long userCount4;
        long userCount5;
        String title3;
        int userCount6;
        String questionName;
        int userCount7;
        String musicName;
        int msgType = c869590Y9l.getMsgType();
        int userCount8 = 0;
        String str4 = "";
        ArrayList arrayList = null;
        List<UrlModel> awemeCoverList = null;
        List<UrlModel> awemeCoverList2 = null;
        List<UrlModel> coverUrl = null;
        List<UrlModel> awemeCoverList3 = null;
        List<UrlModel> awemeCoverList4 = null;
        arrayList = null;
        if (msgType == 22) {
            ShareMusicContent shareMusicContent = (ShareMusicContent) BaseContentParserKt.getOrParseJsonContent(c869590Y9l, ShareMusicContent.class);
            C460450I3v c460450I3v = new C460450I3v(R.raw.icon_music_note_s_alt, null);
            if (shareMusicContent != null && (musicName = shareMusicContent.getMusicName()) != null) {
                str4 = musicName;
            }
            C1258904wF c1258904wF = new C1258904wF(str4);
            if (shareMusicContent != null) {
                userCount7 = shareMusicContent.getUserCount();
            } else {
                userCount7 = 0;
            }
            C21627319kV c21627319kVLIZJ = C21627319kV.LIZJ();
            if (shareMusicContent != null) {
                userCount8 = shareMusicContent.getUserCount();
            }
            C460280I3e c460280I3e = new C460280I3e(userCount7, c21627319kVLIZJ.LJFF(C1843500y4a.LIZIZ(userCount8)));
            if (shareMusicContent != null) {
                awemeCoverList = shareMusicContent.getAwemeCoverList();
            }
            return new C900480ZUg(c460450I3v, c1258904wF, c460280I3e, 0, awemeCoverList, true, new C1622006Ws(new AwS585S0100000_6(shareMusicContent, 258)));
        }
        if (msgType == 33) {
            ShareQnAContent shareQnAContent = (ShareQnAContent) BaseContentParserKt.getOrParseJsonContent(c869590Y9l, ShareQnAContent.class);
            C460450I3v c460450I3v2 = new C460450I3v(R.raw.icon_qa_ltr, null);
            if (shareQnAContent != null && (questionName = shareQnAContent.getQuestionName()) != null) {
                str4 = questionName;
            }
            C1258904wF c1258904wF2 = new C1258904wF(str4);
            if (shareQnAContent != null) {
                userCount6 = shareQnAContent.getUserCount();
            } else {
                userCount6 = 0;
            }
            C21627319kV c21627319kVLIZJ2 = C21627319kV.LIZJ();
            if (shareQnAContent != null) {
                userCount8 = shareQnAContent.getUserCount();
            }
            C460280I3e c460280I3e2 = new C460280I3e(userCount6, c21627319kVLIZJ2.LJFF(C1843500y4a.LIZIZ(userCount8)));
            if (shareQnAContent != null) {
                awemeCoverList2 = shareQnAContent.getAwemeCoverList();
            }
            return new C900480ZUg(c460450I3v2, c1258904wF2, c460280I3e2, 0, awemeCoverList2, true, new C1622006Ws(new AwS593S0100000_14(shareQnAContent, 210)));
        }
        long jLongValue2 = 0;
        if (msgType == 19) {
            ShareChallengeContent shareChallengeContent = (ShareChallengeContent) BaseContentParserKt.getOrParseJsonContent(c869590Y9l, ShareChallengeContent.class);
            if (shareChallengeContent != null) {
                userCount3 = shareChallengeContent.getUserCount();
            } else {
                userCount3 = 0;
            }
            C460450I3v c460450I3v3 = new C460450I3v(R.raw.icon_number, null);
            if (shareChallengeContent != null && (title3 = shareChallengeContent.getTitle()) != null) {
                str4 = title3;
            }
            C1258904wF c1258904wF3 = new C1258904wF(str4);
            if (shareChallengeContent != null) {
                userCount4 = shareChallengeContent.getUserCount();
            } else {
                userCount4 = 0;
            }
            C21627319kV c21627319kVLIZJ3 = C21627319kV.LIZJ();
            if (shareChallengeContent != null) {
                userCount5 = shareChallengeContent.getUserCount();
            } else {
                userCount5 = 0;
            }
            C460280I3e c460280I3e3 = new C460280I3e(userCount4, c21627319kVLIZJ3.LJFF(C1843500y4a.LIZIZ(userCount5)));
            if (userCount3 <= 0) {
                userCount8 = 4;
            }
            if (shareChallengeContent != null) {
                coverUrl = shareChallengeContent.getCoverUrl();
            }
            return new C900480ZUg(c460450I3v3, c1258904wF3, c460280I3e3, userCount8, coverUrl, true, new C1622006Ws(new AwS593S0100000_14(shareChallengeContent, 207)));
        }
        if (msgType == 81) {
            ShareCompilationContent shareCompilationContent = (ShareCompilationContent) BaseContentParserKt.getOrParseJsonContent(c869590Y9l, ShareCompilationContent.class);
            C460450I3v c460450I3v4 = new C460450I3v(R.raw.icon_playlist, null);
            if (shareCompilationContent != null && (title2 = shareCompilationContent.getTitle()) != null) {
                str4 = title2;
            }
            C460250I3b c460250I3b = new C460250I3b(str4, new AwS628S0100000_14(shareCompilationContent, 46));
            if (shareCompilationContent != null) {
                authorName = shareCompilationContent.getAuthorName();
            } else {
                authorName = null;
            }
            C1233704sB c1233704sB2 = new C1233704sB(2131840557, authorName);
            if (shareCompilationContent != null) {
                awemeCoverList3 = shareCompilationContent.getAwemeCoverList();
            }
            return new C900480ZUg(c460450I3v4, c460250I3b, c1233704sB2, 0, awemeCoverList3, false, new C1622006Ws(new AwS593S0100000_14(shareCompilationContent, 209)));
        }
        if (msgType == 72) {
            ShareEffectContent shareEffectContent = (ShareEffectContent) BaseContentParserKt.getOrParseJsonContent(c869590Y9l, ShareEffectContent.class);
            C460450I3v c460450I3v5 = new C460450I3v(R.raw.icon_effect, null);
            if (shareEffectContent != null && (title = shareEffectContent.getTitle()) != null) {
                str4 = title;
            }
            C1258904wF c1258904wF4 = new C1258904wF(str4);
            if (shareEffectContent != null && (userCount2 = shareEffectContent.getUserCount()) != null) {
                jLongValue = userCount2.longValue();
            } else {
                jLongValue = 0;
            }
            C21627319kV c21627319kVLIZJ4 = C21627319kV.LIZJ();
            if (shareEffectContent != null && (userCount = shareEffectContent.getUserCount()) != null) {
                jLongValue2 = userCount.longValue();
            }
            C460280I3e c460280I3e4 = new C460280I3e(jLongValue, c21627319kVLIZJ4.LJFF(C1843500y4a.LIZIZ(jLongValue2)));
            if (shareEffectContent != null) {
                awemeCoverList4 = shareEffectContent.getAwemeCoverList();
            }
            return new C900480ZUg(c460450I3v5, c1258904wF4, c460280I3e4, 0, awemeCoverList4, true, new C1622006Ws(new AwS593S0100000_14(shareEffectContent, 208)));
        }
        if (msgType != 1801 && msgType != 3001) {
            "Mismatch with type specific in msgHandlerCheck".toString();
            throw new IllegalStateException("Mismatch with type specific in msgHandlerCheck");
        }
        ImageCardTemplate imageCardTemplate = (ImageCardTemplate) C0Z2Z.LIZ(c869590Y9l, ImageCardTemplate.class);
        if (imageCardTemplate != null && (imageCardTitleBar4 = imageCardTemplate.titleBar) != null && (imageComponent = imageCardTitleBar4.leftImage) != null) {
            list = imageComponent.urls;
        } else {
            list = null;
        }
        if (list != null && !list.isEmpty()) {
            c1173604iU = new C1173604iU(list);
        } else {
            ITemplateIconResourceMapper iTemplateIconResourceMapper = (ITemplateIconResourceMapper) PluggableExtentionKt.pluggableSpiForReal(ITemplateIconResourceMapper.class);
            if (iTemplateIconResourceMapper != null) {
                c1173604iU = new C460450I3v(iTemplateIconResourceMapper.LIZ(c869590Y9l.getScene(), true), null);
            } else {
                c1173604iU = new C1173604iU(C13BV.INSTANCE);
            }
        }
        if (imageCardTemplate != null && (imageCardTitleBar3 = imageCardTemplate.titleBar) != null && (textComponent3 = imageCardTitleBar3.title) != null && (str3 = textComponent3.text) != null && str3.length() != 0) {
            c1233704sB = new C1258904wF(str3);
        } else {
            c1233704sB = new C1233704sB(2131832164, (List<String>) null);
        }
        if (imageCardTemplate != null && (imageCardTitleBar2 = imageCardTemplate.titleBar) != null && (textComponent2 = imageCardTitleBar2.subtitle) != null && (str2 = textComponent2.text) != null) {
            str4 = str2;
        }
        C1258904wF c1258904wF5 = new C1258904wF(str4);
        if (imageCardTemplate != null && (imageCardTitleBar = imageCardTemplate.titleBar) != null && (textComponent = imageCardTitleBar.subtitle) != null) {
            str = textComponent.text;
        } else {
            str = null;
        }
        if (!C123100dR.LIZ(str)) {
            userCount8 = 8;
        }
        if (imageCardTemplate != null && (list2 = imageCardTemplate.videoCoversComponentList) != null) {
            arrayList = new ArrayList();
            Iterator<VideoCoverComponent> it2 = list2.iterator();
            while (it2.hasNext()) {
                ImageComponent imageComponent2 = it2.next().coverImage;
                if (imageComponent2 != null && (list3 = imageComponent2.urls) != null && (urlModelLIZ = C0I3J.LIZ(list3)) != null) {
                    arrayList.add(urlModelLIZ);
                }
            }
        }
        return new C900480ZUg(c1173604iU, c1233704sB, c1258904wF5, userCount8, arrayList, false, new C1622006Ws(new AwS380S0200000_14(c869590Y9l, imageCardTemplate, 82)));
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol
    public final C902710ZbB Vx2(C01GW c01gw) {
        return new C902710ZbB(this, c01gw);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol
    public final InterfaceC461380I7k m72(C869590Y9l c869590Y9l, C0IB0 c0ib0) {
        return new C900430ZUb(LIZ(c869590Y9l), C0ICS.LIZ(true), c0ib0);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol
    public final InterfaceC461380I7k ts1(C869590Y9l c869590Y9l, C0IB0 c0ib0) {
        return new C900420ZUa(LIZ(c869590Y9l), C0ICS.LIZ(false), c0ib0);
    }
}
