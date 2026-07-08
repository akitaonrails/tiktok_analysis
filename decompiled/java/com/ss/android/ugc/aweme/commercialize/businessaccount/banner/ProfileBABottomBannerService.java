package com.ss.android.ugc.aweme.commercialize.businessaccount.banner;

import X.C1057450dcl;
import X.C19EG;
import X.C20515215Pi;
import X.C20684815ws;
import X.C2344009Gk;
import X.C5180020c;
import X.C786410Ut5;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.keva.KevaImpl;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.ba.IProfileBABottomBanner;
import com.ss.android.ugc.aweme.commerce.BizAccount;
import com.ss.android.ugc.aweme.commerce.BizProfileBannerInfo;
import com.ss.android.ugc.aweme.commercialize.tcm.depend.IBaBottomBannerInfo;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileBABottomBannerService implements IProfileBABottomBanner {
    @Override // com.ss.android.ugc.aweme.ba.IProfileBABottomBanner
    public final boolean LIZIZ() {
        BizAccount bizAccountLIZ;
        BizProfileBannerInfo bizProfileBannerInfo;
        String bannerShowKey;
        IBaBottomBannerInfo iBaBottomBannerInfo = (IBaBottomBannerInfo) PluggableExtentionKt.pluggableSpi$default(IBaBottomBannerInfo.class, false, false, false, 14, null);
        return (iBaBottomBannerInfo == null || (bizAccountLIZ = iBaBottomBannerInfo.LIZ()) == null || (bizProfileBannerInfo = bizAccountLIZ.getBizProfileBannerInfo()) == null || (bannerShowKey = bizProfileBannerInfo.getBannerShowKey()) == null || KevaImpl.getRepo("profile_ba_bottom_banner_service", 1).getBoolean(bannerShowKey, false)) ? false : true;
    }

    @Override // com.ss.android.ugc.aweme.ba.IProfileBABottomBanner
    public final void LIZ(final C19EG c19eg, FrameLayout frameLayout) {
        BizAccount bizAccountLIZ;
        BizProfileBannerInfo bizProfileBannerInfo;
        String bannerShowKey;
        IBaBottomBannerInfo iBaBottomBannerInfo;
        BizAccount bizAccountLIZ2;
        BizProfileBannerInfo bizProfileBannerInfo2;
        final String currentUserID;
        IBaBottomBannerInfo iBaBottomBannerInfo2 = (IBaBottomBannerInfo) PluggableExtentionKt.pluggableSpi$default(IBaBottomBannerInfo.class, false, false, false, 14, null);
        if (iBaBottomBannerInfo2 != null && (bizAccountLIZ = iBaBottomBannerInfo2.LIZ()) != null && (bizProfileBannerInfo = bizAccountLIZ.getBizProfileBannerInfo()) != null && (bannerShowKey = bizProfileBannerInfo.getBannerShowKey()) != null) {
            if (c19eg != null && (iBaBottomBannerInfo = (IBaBottomBannerInfo) PluggableExtentionKt.pluggableSpi$default(IBaBottomBannerInfo.class, false, false, false, 14, null)) != null && (bizAccountLIZ2 = iBaBottomBannerInfo.LIZ()) != null && (bizProfileBannerInfo2 = bizAccountLIZ2.getBizProfileBannerInfo()) != null) {
                String title = bizProfileBannerInfo2.getTitle();
                String subtitle = bizProfileBannerInfo2.getSubtitle();
                String buttonText = bizProfileBannerInfo2.getButtonText();
                final String schema = bizProfileBannerInfo2.getSchema();
                IUserService iUserService = (IUserService) PluggableExtentionKt.pluggableSpi$default(IUserService.class, false, false, false, 14, null);
                if (iUserService == null || (currentUserID = iUserService.getCurrentUserID()) == null) {
                    currentUserID = "";
                }
                if (frameLayout != null) {
                    C786410Ut5.LJLZ(0, frameLayout);
                    C20515215Pi c20515215Pi = new C20515215Pi(frameLayout);
                    C1057450dcl c1057450dcl = c20515215Pi.LIZ;
                    c1057450dcl.LJ = title;
                    c1057450dcl.LJFF = subtitle;
                    c1057450dcl.LJI = buttonText;
                    c1057450dcl.LJII = -1;
                    c1057450dcl.LJIIJ = 0;
                    c1057450dcl.LJIILIIL = new View.OnClickListener() { // from class: X.05vF
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            SmartRouter.buildRoute(c19eg, schema).open();
                            C2344009Gk c2344009Gk = new C2344009Gk();
                            c2344009Gk.LJIIIIZZ("user_id", currentUserID);
                            C20684815ws.LJIILLIIL("downgrade_profile_popup_verify", c2344009Gk.LIZ);
                        }
                    };
                    c1057450dcl.LJIIJJI = new View.OnClickListener() { // from class: X.0iSR
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                        }
                    };
                    C5180020c c5180020c = new C5180020c(currentUserID, 1);
                    C1057450dcl c1057450dcl2 = c20515215Pi.LIZ;
                    c1057450dcl2.LJIILJJIL = c5180020c;
                    c1057450dcl2.LIZJ = false;
                    c1057450dcl2.LJIILL = true;
                    c20515215Pi.LIZLLL();
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LJIIIIZZ("user_id", currentUserID);
                    C20684815ws.LJIILLIIL("downgrade_profile_popup_show", c2344009Gk.LIZ);
                }
            }
            KevaImpl.getRepo("profile_ba_bottom_banner_service", 1).storeBoolean(bannerShowKey, true);
        }
    }
}
