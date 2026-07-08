package com.ss.android.ugc.aweme.service;

import X.C1308910kAL;
import X.C1389340mG4;
import X.C1390920mIc;
import X.C1391850mK7;
import X.C1697810uHb;
import X.C19252910Tv;
import X.C19EG;
import X.C1E8U;
import X.C20698015z0;
import X.C20698415z4;
import X.C20698515z5;
import X.C20698815z8;
import X.C294280BgA;
import X.EnumC1390800mIQ;
import X.EnumC20698315z3;
import android.content.Context;
import android.content.DialogInterface;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.captionsheet.BaseCaptionSheetFragment;
import com.ss.android.ugc.aweme.captionsheet.LandscapeCaptionDialogFragment;
import com.ss.android.ugc.aweme.captionsheet.LandscapeCaptionPanelFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;
import com.ss.android.ugc.trill.setting.DoNotTranslateSettingPageV2;
import com.ss.android.ugc.trill.setting.TranslationLanguageSettingPage;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: loaded from: classes32.dex */
public final class CaptionSheetServiceImpl implements ICaptionSheetService {
    public static final /* synthetic */ int LIZ = 0;

    @Override // com.ss.android.ugc.aweme.service.ICaptionSheetService
    public final void LIZJ(EnumC20698315z3 enumC20698315z3, C20698515z5 c20698515z5) {
        boolean z;
        if (c20698515z5.t5()) {
            return;
        }
        BaseCaptionSheetFragment baseCaptionSheetFragmentLIZ = ((C20698015z0) new C20698415z4(c20698515z5).LIZIZ.getValue()).LIZ(enumC20698315z3);
        LandscapeCaptionPanelFragment landscapeCaptionPanelFragment = null;
        if (enumC20698315z3 == EnumC20698315z3.LANDSCAPE_CAPTIONS) {
            LandscapeCaptionDialogFragment landscapeCaptionDialogFragment = new LandscapeCaptionDialogFragment();
            if (baseCaptionSheetFragmentLIZ instanceof LandscapeCaptionPanelFragment) {
                landscapeCaptionPanelFragment = (LandscapeCaptionPanelFragment) baseCaptionSheetFragmentLIZ;
            }
            landscapeCaptionDialogFragment.LL = landscapeCaptionPanelFragment;
            landscapeCaptionDialogFragment.show(c20698515z5.LLILZ, "Caption");
            return;
        }
        if (enumC20698315z3 == EnumC20698315z3.CAPTIONS && C19252910Tv.LIZIZ.LIZLLL().LIZIZ().LJ(null)) {
            z = true;
            baseCaptionSheetFragmentLIZ.LLIZ = true;
            C19252910Tv.LIZIZ.LIZLLL().LIZIZ().LIZIZ("SkeletonSharePanelFragment", "CaptionsPanelFragment", c20698515z5.getEnterFrom());
        } else {
            z = false;
        }
        C1390920mIc c1390920mIc = new C1390920mIc(z, C1389340mG4.LIZJ(null, null).LIZIZ);
        c1390920mIc.LJIIIIZZ(0);
        c1390920mIc.LIZ.LLJLILLLLZIIL = false;
        boolean zContains = C1697810uHb.LJIIJJI(EnumC1390800mIQ.PHOTO_FULL_PAGE, EnumC1390800mIQ.DM_CHAT_PAGE_ICON, EnumC1390800mIQ.COMMENT_TRANS_CTA_BANNER_V2).contains(c20698515z5.getEnterMethod());
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJJIJIIJIL = zContains;
        tuxSheet.LLJJIJI = baseCaptionSheetFragmentLIZ;
        DialogInterface.OnDismissListener onDismissListenerAR = c20698515z5.aR();
        if (onDismissListenerAR != null) {
            c1390920mIc.LIZ.LLILLJJLI = onDismissListenerAR;
        }
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zp, c20698515z5.LLILZIL);
        TuxSheet tuxSheet2 = c1390920mIc.LIZ;
        tuxSheet2.LLJI = numLIZJ;
        C1391850mK7.LIZIZ(tuxSheet2, "video_captions_nscreen");
        tuxSheet2.show(c20698515z5.LLILZ, "CLACaptionSheet");
        c20698515z5.kc();
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionSheetService
    public final void LIZIZ(Aweme aweme, Context context, List list, C19EG c19eg, String str) {
        if (!C1E8U.LIZIZ()) {
            return;
        }
        TranslationLanguageSettingPage translationLanguageSettingPageLJIIIIZZ = C20698815z8.LIZ().LJIIIIZZ(list, str, aweme);
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        c1390920mIc.LJIIIIZZ(0);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJLILLLLZIIL = false;
        tuxSheet.LLJJIJIIJIL = false;
        tuxSheet.LLJJIJI = translationLanguageSettingPageLJIIIIZZ;
        tuxSheet.show(c19eg.getSupportFragmentManager(), "TranslationLanguageSheet");
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionSheetService
    public final void LIZ(Aweme aweme, Context context, PushSettings pushSettings, C19EG c19eg, String str, String str2) {
        if (!C294280BgA.LIZ() && !C1E8U.LIZIZ()) {
            return;
        }
        DoNotTranslateSettingPageV2 doNotTranslateSettingPageV2LJII = C20698815z8.LIZ().LJII(pushSettings, str, str2, aweme);
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        c1390920mIc.LJIIIIZZ(0);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJLILLLLZIIL = false;
        tuxSheet.LLJJIJIIJIL = false;
        tuxSheet.LLJJIJI = doNotTranslateSettingPageV2LJII;
        tuxSheet.show(c19eg.getSupportFragmentManager(), "ClaDNTSheet");
    }
}
