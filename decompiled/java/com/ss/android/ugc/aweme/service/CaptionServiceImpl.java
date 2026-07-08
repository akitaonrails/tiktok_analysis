package com.ss.android.ugc.aweme.service;

import X.C0RT2;
import X.C0SXG;
import X.C10EU;
import X.C1383320m6M;
import X.C13LE;
import X.C1440005kM;
import X.C161N;
import X.C1699690uKd;
import X.C19719912Dl;
import X.C19EG;
import X.C20698515z5;
import X.C20698615z6;
import X.C20702515zj;
import X.C20702615zk;
import X.C20703515zt;
import X.C2296808zG;
import X.C23250099c;
import X.C2511309sl;
import X.C300940Bqu;
import X.C463101rB;
import X.C581750Mrl;
import X.C582980Mtk;
import X.C715480S4s;
import X.C715800S5y;
import X.C746760TRa;
import X.C786410Ut5;
import X.C844470XAv;
import X.EnumC1390800mIQ;
import X.EnumC20698315z3;
import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.autocaption.refactor.CLACaptionAssemV2;
import com.ss.android.ugc.aweme.autocaption.refactor.CLACaptionDebugAssemV2;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CaptionItemModel;
import com.ss.android.ugc.aweme.feed.model.CaptionModel;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.network.CaptionNetworkPartner;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class CaptionServiceImpl implements ICLACaptionService {
    @Override // com.ss.android.ugc.aweme.service.ICLACaptionService
    public final C19719912Dl LJFF() {
        return C13LE.LIZ(CLACaptionDebugAssemV2.class);
    }

    @Override // com.ss.android.ugc.aweme.service.ICLACaptionService
    public final C19719912Dl LJII() {
        return C13LE.LIZ(CLACaptionAssemV2.class);
    }

    @Override // com.ss.android.ugc.aweme.service.ICLACaptionService
    public final CaptionNetworkPartner LIZ() {
        return new CaptionNetworkPartner();
    }

    @Override // com.ss.android.ugc.aweme.service.ICLACaptionService
    public final boolean LIZJ(Aweme aweme) {
        if (aweme == null || C10EU.LJIILIIL()) {
            return false;
        }
        return C20703515zt.LJJII(aweme);
    }

    @Override // com.ss.android.ugc.aweme.service.ICLACaptionService
    public final boolean LJ(Aweme aweme) {
        boolean z;
        C20703515zt.LIZ.getClass();
        if (C20703515zt.LJJIFFI(aweme, false) && !C20703515zt.LJJIIJZLJL(aweme)) {
            z = true;
        } else {
            z = false;
        }
        C161N c161n = C20703515zt.LIZIZ;
        if ((!c161n.LJIILL(aweme, null, Boolean.TRUE) || !C746760TRa.LIZ().LJLILLLLZI() || !C20703515zt.LJIL(aweme)) && !z) {
            return false;
        }
        return C20702515zj.LIZ(aweme, c161n.LL());
    }

    @Override // com.ss.android.ugc.aweme.service.ICLACaptionService
    public final void LJIIIIZZ(Aweme aweme) {
        String aid;
        Video video;
        CaptionModel captionModel;
        List<CaptionItemModel> list;
        C20702615zk c20702615zk = C20702615zk.LIZ;
        if (aweme != null && (aid = aweme.getAid()) != null && aid.length() != 0 && (video = aweme.getVideo()) != null && (captionModel = video.getCaptionModel()) != null && (list = captionModel.captionList) != null && !list.isEmpty()) {
            if (C2511309sl.LIZ) {
                C20702615zk.LIZ.getClass();
                C20702615zk.LIZ(aweme);
            } else {
                C23250099c.LIZLLL(C2296808zG.LIZ(C1699690uKd.LIZ()), null, null, new C463101rB(aweme, null), 3);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.service.ICLACaptionService
    public final C581750Mrl LJIIIZ(Aweme aweme) {
        String aid;
        Video video;
        CaptionModel captionModel;
        List<CaptionItemModel> list;
        C20702615zk c20702615zk = C20702615zk.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C1699690uKd.LIZ()), null, null, new C715800S5y(aweme, null), 3);
        if (aweme == null || (aid = aweme.getAid()) == null || aid.length() == 0 || (video = aweme.getVideo()) == null || (captionModel = video.getCaptionModel()) == null || (list = captionModel.captionList) == null || list.isEmpty()) {
            return null;
        }
        C20702615zk.LIZ.getClass();
        return C20702615zk.LIZ(aweme);
    }

    @Override // com.ss.android.ugc.aweme.service.ICLACaptionService
    public final int LJIIJ(Aweme aweme) {
        String aid;
        C581750Mrl c581750MrlLIZIZ;
        C20702615zk.LIZ.getClass();
        if (aweme == null || (aid = aweme.getAid()) == null || aid.length() == 0 || (c581750MrlLIZIZ = C20702615zk.LIZIZ.LIZIZ(aid)) == null) {
            return -1;
        }
        return c581750MrlLIZIZ.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.service.ICLACaptionService
    public final boolean R2(Aweme aweme) {
        if (!C1383320m6M.LIZ(aweme) && !TextUtils.isEmpty(aweme.getAid())) {
            C20703515zt.LIZ.getClass();
            if (!C20703515zt.LIZIZ.LJIJI(aweme) && !C300940Bqu.LIZ() && aweme.getAwemeType() != 160) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.service.ICLACaptionService
    public final void LIZLLL(C20698515z5 c20698515z5, boolean z) {
        EnumC20698315z3 enumC20698315z3;
        C20698615z6 c20698615z6 = C20698615z6.LIZIZ;
        if (z) {
            enumC20698315z3 = EnumC20698315z3.LANDSCAPE_CAPTIONS;
        } else {
            Aweme aweme = c20698515z5.getAweme();
            if (aweme != null && C582980Mtk.LIZIZ(aweme)) {
                enumC20698315z3 = EnumC20698315z3.PHOTO_MODE;
            } else if (Intrinsics.LJFF(c20698515z5.getEnterFrom(), "DIRECT_MESSAGE")) {
                enumC20698315z3 = EnumC20698315z3.DIRECT_MESSAGE;
            } else {
                enumC20698315z3 = EnumC20698315z3.CAPTIONS;
            }
        }
        c20698615z6.LIZJ(enumC20698315z3, c20698515z5);
    }

    @Override // com.ss.android.ugc.aweme.service.ICLACaptionService
    public final CaptionModel LJIIJJI(Aweme aweme, String str, CaptionModel captionModel) {
        String str2;
        List<CaptionItemModel> list;
        CaptionItemModel captionItemModelLIZLLL = C20702515zj.LIZLLL(aweme);
        if (captionItemModelLIZLLL != null) {
            str2 = captionItemModelLIZLLL.languageCode;
        } else {
            str2 = null;
        }
        if (Intrinsics.LJFF(str2, str) || (list = captionModel.captionList) == null) {
            return captionModel;
        }
        ArrayList arrayList = new ArrayList(list);
        CaptionItemModel captionItemModelLJII = C161N.LIZIZ.LJII(aweme, str);
        if (captionItemModelLJII == null) {
            return captionModel;
        }
        arrayList.add(captionItemModelLJII);
        return captionModel.copy(captionModel.hasOriginalAudio, captionModel.enableAutoCaption, captionModel.originalCaptionLanguage, arrayList, captionModel.creatorEditedCaptionId, captionModel.appearance, captionModel.position, captionModel.captionsType, captionModel.noOriginalCaptionReasonV2, captionModel.duplicateLanguages, captionModel.isAuthorDubbingQualified);
    }

    @Override // com.ss.android.ugc.aweme.service.ICLACaptionService
    public final void LIZIZ(C19EG c19eg, Aweme aweme, String str, EnumC1390800mIQ enumC1390800mIQ) {
        C0RT2.LIZ().LIZLLL(new C20698515z5(aweme, str, enumC1390800mIQ, c19eg.getSupportFragmentManager(), c19eg), C0SXG.LIZ(c19eg));
    }

    @Override // com.ss.android.ugc.aweme.service.ICLACaptionService
    public final void LJIIL(String str, String str2, EnumC1390800mIQ enumC1390800mIQ, C19EG c19eg) {
        C1440005kM.LIZ(new C715480S4s(str, str2, enumC1390800mIQ, System.identityHashCode(c19eg)));
    }

    @Override // com.ss.android.ugc.aweme.service.ICLACaptionService
    public final void LJI(Context context, String str, EnumC1390800mIQ enumC1390800mIQ, Aweme aweme, boolean z, Long l) {
        String uid;
        int i = 0;
        if (aweme != null && l != null) {
            C161N c161n = C161N.LIZIZ;
            boolean zLJIJJ = c161n.LJIJJ(aweme);
            c161n.LJJLIIJ();
            long jLongValue = l.longValue();
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "aweme://caption/translate/creator_edit_caption/new");
            smartRouteBuildRoute.withParam("cla_subtitle_id", jLongValue);
            String aid = aweme.getAid();
            String str2 = "";
            if (aid == null) {
                aid = "";
            }
            smartRouteBuildRoute.withParam("item_id", aid);
            smartRouteBuildRoute.withParam("enter_from", str);
            smartRouteBuildRoute.withParam("enter_method", enumC1390800mIQ.getValue());
            String aid2 = aweme.getAid();
            if (aid2 == null) {
                aid2 = "";
            }
            smartRouteBuildRoute.withParam("group_id", aid2);
            User author = aweme.getAuthor();
            if (author != null && (uid = author.getUid()) != null) {
                str2 = uid;
            }
            smartRouteBuildRoute.withParam("author_id", str2);
            smartRouteBuildRoute.withParam("aweme", aweme);
            smartRouteBuildRoute.withParam("add_caption_flow_entry", z);
            if (aweme.getVideo() != null && aweme.getVideo().isLongVideo()) {
                i = 1;
            }
            smartRouteBuildRoute.withParam("is_long", i);
            smartRouteBuildRoute.withParam("with_tap_to_edit", zLJIJJ);
            smartRouteBuildRoute.open();
            return;
        }
        C844470XAv.LIZ.getClass();
        C786410Ut5.re(Toast.makeText(C844470XAv.LIZ(), R.string.txq, 0));
    }
}
