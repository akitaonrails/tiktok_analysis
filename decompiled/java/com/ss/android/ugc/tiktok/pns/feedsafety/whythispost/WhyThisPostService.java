package com.ss.android.ugc.tiktok.pns.feedsafety.whythispost;

import X.AbstractC848400XPy;
import X.C0C64;
import X.C0XQ7;
import X.C1390920mIc;
import X.C19EG;
import X.C20684815ws;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.compliance.api.services.video.IPNSVideoViewService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.tiktok.pns.feedsafety.api.whythispost.IWhyThisPostService;
import com.ss.android.ugc.tiktok.pns.feedsafety.whythispost.ui.ContainerFragment;

/* JADX INFO: loaded from: classes22.dex */
public final class WhyThisPostService implements IWhyThisPostService {
    public static boolean LIZIZ() {
        long registerTime = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().getRegisterTime();
        if (registerTime <= 0 || (System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)) - registerTime >= 604800) {
            return false;
        }
        IPNSVideoViewService iPNSVideoViewService = (IPNSVideoViewService) PluggableExtentionKt.pluggableSpi$default(IPNSVideoViewService.class, false, false, false, 14, null);
        return iPNSVideoViewService == null || iPNSVideoViewService.LIZJ() < 100;
    }

    @Override // com.ss.android.ugc.tiktok.pns.feedsafety.api.whythispost.IWhyThisPostService
    public final boolean isEnabled() {
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "enable_wtp3", true) != 0;
    }

    @Override // com.ss.android.ugc.tiktok.pns.feedsafety.api.whythispost.IWhyThisPostService
    public final void LIZ(C19EG c19eg, Aweme aweme, BaseSharePackage baseSharePackage) {
        C20684815ws.onEventV3("click_why_this_post3_before_context");
        if ((c19eg instanceof C19EG) && c19eg != null) {
            C20684815ws.onEventV3("click_why_this_post3_before_builder");
            C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
            c1390920mIc.LIZ.LLJJIJI = new ContainerFragment(aweme, baseSharePackage);
            c1390920mIc.LJIIIIZZ(1);
            TuxSheet tuxSheet = c1390920mIc.LIZ;
            tuxSheet.LLJJIJIIJIL = true;
            tuxSheet.LLJLILLLLZIIL = false;
            tuxSheet.LLJLLL = false;
            C20684815ws.onEventV3("click_why_this_post3_before_show");
            tuxSheet.show(c19eg.getSupportFragmentManager(), "WhyThisPost");
        }
    }
}
