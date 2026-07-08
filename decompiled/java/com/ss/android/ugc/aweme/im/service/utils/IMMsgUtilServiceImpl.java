package com.ss.android.ugc.aweme.im.service.utils;

import X.C0ZDX;
import X.C1383370m6R;
import X.C2097608Jq;
import X.C869590Y9l;
import X.C890330YwJ;
import X.C892250YzP;
import X.C896070ZDh;
import X.EnumC898050ZKx;
import com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi;
import com.ss.android.ugc.aweme.im.common.model.ReferenceInfoHint;
import com.ss.android.ugc.aweme.im.message.content.BaseContent;
import com.ss.android.ugc.aweme.im.message.content.ShareAwemeContent;
import com.ss.android.ugc.aweme.im.message.content.adapter.BaseContentParserKt;
import com.ss.android.ugc.aweme.im.service.analytics.IMessageAnalyticsUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes15.dex */
public final class IMMsgUtilServiceImpl implements IIMMsgUtilService {
    @Override // com.ss.android.ugc.aweme.im.service.utils.IIMMsgUtilService
    public final Map<String, String> LIZ(C869590Y9l c869590Y9l) {
        Map<String, String> mapLIZ;
        IMessageAnalyticsUtils.LIZ.getClass();
        IMessageAnalyticsUtils iMessageAnalyticsUtilsLIZ = C892250YzP.LIZ();
        if (iMessageAnalyticsUtilsLIZ == null || (mapLIZ = iMessageAnalyticsUtilsLIZ.LIZ(c869590Y9l)) == null) {
            return C2097608Jq.LJ();
        }
        return mapLIZ;
    }

    @Override // com.ss.android.ugc.aweme.im.service.utils.IIMMsgUtilService
    public final boolean LIZJ(C869590Y9l c869590Y9l) {
        IMChatListApi.LJJIII.getClass();
        return C890330YwJ.LIZ().LJJIIJ().LIZJ(c869590Y9l);
    }

    @Override // com.ss.android.ugc.aweme.im.service.utils.IIMMsgUtilService
    public final String LIZLLL(C869590Y9l c869590Y9l) {
        ReferenceInfoHint referenceInfoHintLJIIIZ = C0ZDX.LJIIIZ(c869590Y9l);
        if (referenceInfoHintLJIIIZ != null) {
            return referenceInfoHintLJIIIZ.getRefmsg_uid();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.im.service.utils.IIMMsgUtilService
    public final String LJ(C869590Y9l c869590Y9l) {
        String strLJ;
        IMessageAnalyticsUtils.LIZ.getClass();
        IMessageAnalyticsUtils iMessageAnalyticsUtilsLIZ = C892250YzP.LIZ();
        if (iMessageAnalyticsUtilsLIZ == null || (strLJ = iMessageAnalyticsUtilsLIZ.LJ(c869590Y9l)) == null) {
            return "";
        }
        return strLJ;
    }

    @Override // com.ss.android.ugc.aweme.im.service.utils.IIMMsgUtilService
    public final String LJFF(C869590Y9l c869590Y9l) {
        String strLJIIJ;
        ShareAwemeContent.Companion companion = ShareAwemeContent.Companion;
        if (companion.isEncourageMufInteractionMsg(c869590Y9l)) {
            if (companion.isEncourageMufLikeMsg(c869590Y9l)) {
                strLJIIJ = C1383370m6R.LJIIJ(2131831180);
            } else if (companion.isEncourageMufCommentMsg(c869590Y9l)) {
                strLJIIJ = C1383370m6R.LJIIJ(2131831178);
            } else if (companion.isEncourageMufRepostMsg(c869590Y9l)) {
                strLJIIJ = C1383370m6R.LJIIJ(2131831182);
            } else if (companion.isEncourageMufFavouriteMsg(c869590Y9l)) {
                strLJIIJ = C1383370m6R.LJIIJ(2131831177);
            } else if (companion.isEncourageMufLikeStoryMsg(c869590Y9l)) {
                strLJIIJ = C1383370m6R.LJIIJ(2131831181);
            } else if (companion.isEncourageMufCommentStoryMsg(c869590Y9l)) {
                strLJIIJ = C1383370m6R.LJIIJ(2131831179);
            } else {
                strLJIIJ = "";
            }
            if (strLJIIJ.length() > 0) {
                return strLJIIJ;
            }
            return null;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.im.service.utils.IIMMsgUtilService
    public final boolean LJII(C869590Y9l c869590Y9l) {
        return ShareAwemeContent.Companion.isVideoMention(c869590Y9l);
    }

    @Override // com.ss.android.ugc.aweme.im.service.utils.IIMMsgUtilService
    public final Boolean LJIIIIZZ(C869590Y9l c869590Y9l) {
        boolean z;
        Integer numValueOf;
        if (c869590Y9l == null) {
            return null;
        }
        BaseContent orParseJsonContent = BaseContentParserKt.getOrParseJsonContent(c869590Y9l, BaseContent.class);
        if (orParseJsonContent != null && (numValueOf = Integer.valueOf(orParseJsonContent.type)) != null && (numValueOf.intValue() == 709 || numValueOf.intValue() == 710 || numValueOf.intValue() == 712)) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // com.ss.android.ugc.aweme.im.service.utils.IIMMsgUtilService
    public final boolean LJIIIZ(C869590Y9l c869590Y9l) {
        return ShareAwemeContent.Companion.isVideoTag(c869590Y9l);
    }

    @Override // com.ss.android.ugc.aweme.im.service.utils.IIMMsgUtilService
    public final boolean LJIIJ(C869590Y9l c869590Y9l) {
        return ShareAwemeContent.Companion.isStoryMention(c869590Y9l);
    }

    @Override // com.ss.android.ugc.aweme.im.service.utils.IIMMsgUtilService
    public final boolean LJIIJJI(C869590Y9l c869590Y9l) {
        return ShareAwemeContent.Companion.isPostToStoryBackwardsMention(c869590Y9l);
    }

    @Override // com.ss.android.ugc.aweme.im.service.utils.IIMMsgUtilService
    public final boolean LJIIL(C869590Y9l c869590Y9l) {
        return ShareAwemeContent.Companion.isStoryToStoryBackwardsMention(c869590Y9l);
    }

    @Override // com.ss.android.ugc.aweme.im.service.utils.IIMMsgUtilService
    public final boolean LJIILIIL(C869590Y9l c869590Y9l) {
        return ShareAwemeContent.Companion.isVideoMentionAndTag(c869590Y9l);
    }

    @Override // com.ss.android.ugc.aweme.im.service.utils.IIMMsgUtilService
    public final CharSequence LIZIZ(C869590Y9l c869590Y9l, String str) {
        IMChatListApi.LJJIII.getClass();
        return C890330YwJ.LIZ().LJJIIJ().LIZIZ(c869590Y9l, str);
    }

    @Override // com.ss.android.ugc.aweme.im.service.utils.IIMMsgUtilService
    public final boolean LJI(C869590Y9l c869590Y9l, EnumC898050ZKx enumC898050ZKx) {
        return C896070ZDh.LIZJ(c869590Y9l, enumC898050ZKx);
    }
}
