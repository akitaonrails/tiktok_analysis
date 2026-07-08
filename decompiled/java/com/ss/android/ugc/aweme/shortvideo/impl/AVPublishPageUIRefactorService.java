package com.ss.android.ugc.aweme.shortvideo.impl;

import X.C0C64;
import X.C0DVV;
import X.C273250AnL;
import X.C291370BbT;
import com.ss.android.ugc.aweme.services.publish.IAVPublishPageUIRefactorService;
import com.ss.android.ugc.aweme.services.publish.IDebugAddLinkOptionService;
import com.ss.android.ugc.aweme.services.publish.IPublishOptionCustomViewFactory;

/* JADX INFO: loaded from: classes5.dex */
public final class AVPublishPageUIRefactorService implements IAVPublishPageUIRefactorService {
    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishPageUIRefactorService
    public final long getSharePanelDismissDuration() {
        return ((Number) C273250AnL.LIZ.getValue()).longValue();
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishPageUIRefactorService
    public final boolean disableShareShow() {
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_publish_page_share_button_refactor", true) == 2;
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishPageUIRefactorService
    public final boolean enableLargeMentionAndHashTagBtn() {
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_publish_page_enlarge_mention_and_hashtag", true) == 1;
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishPageUIRefactorService
    public final boolean enableLargePostBtn() {
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_publish_page_enlarge_post_button", true) == 1;
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishPageUIRefactorService
    public final boolean enableRefactorAddLinkECommerceGuide() {
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_publish_page_remove_products_and_more", true) == 1;
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishPageUIRefactorService
    public final boolean enableRefactorPoiRcmdList() {
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_publish_page_poi_recommendation_text_adjustment", true) == 1;
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishPageUIRefactorService
    public final boolean enableRefactorPublishIcon() {
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_publish_page_icon_refactor", true) == 1;
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishPageUIRefactorService
    public final boolean enableRefactorPublishUI() {
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_publish_page_ui_refactor", true) == 1;
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishPageUIRefactorService
    public final boolean enableRemoveHashTagLoading() {
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_publish_page_remove_hashtag_loading", true) == 1;
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishPageUIRefactorService
    public final boolean enableToastCenter() {
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_publish_page_toast_to_center", true) == 1;
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishPageUIRefactorService
    public final boolean enableUseShareSheet() {
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_publish_page_share_button_refactor", true) == 1;
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishPageUIRefactorService
    public final boolean fixPublishPageSheetColor() {
        return C291370BbT.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishPageUIRefactorService
    public final boolean isRefactorNewUserAddLinkGuideEnable() {
        return C0C64.LJIILLIIL().LJIIIZ(31744, "studio_publish_page_remove_red_dot_and_bubble_and_subtitle", true, false);
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishPageUIRefactorService
    public final boolean isRefactorNewUserMoreOptionGuideEnable() {
        return C0C64.LJIILLIIL().LJIIIZ(31744, "studio_publish_page_remove_more_option_subtitle", true, false);
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishPageUIRefactorService
    public final boolean isRefactorPublishAddLinkOption() {
        return C0C64.LJIILLIIL().LJIIIZ(31744, "studio_publish_page_add_link_new_display_style", true, false);
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishPageUIRefactorService
    public final boolean isRefactorPublishPoiOption() {
        return C0C64.LJIILLIIL().LJIIIZ(31744, "studio_publish_page_location_label_new_display_style", true, false);
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishPageUIRefactorService
    public final IDebugAddLinkOptionService debugAddLinkOptionService() {
        return new IDebugAddLinkOptionService() { // from class: X.0CR5
            @Override // com.ss.android.ugc.aweme.services.publish.IDebugAddLinkOptionService
            public final boolean mockAddedMoreThanLimitAnchors() {
                return C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_publish_page_add_link_debug_mock", true) == 1;
            }

            @Override // com.ss.android.ugc.aweme.services.publish.IDebugAddLinkOptionService
            public final boolean mockNetworkNotAvailable() {
                return C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_publish_page_add_link_debug_mock", true) == 2;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishPageUIRefactorService
    public final IPublishOptionCustomViewFactory getPublishOptionCustomViewFactory() {
        return C0DVV.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishPageUIRefactorService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void highlightContent(android.view.View r6, java.lang.Integer r7) {
        /*
            r5 = this;
            if (r6 == 0) goto L32
            android.content.Context r1 = r6.getContext()
            if (r1 == 0) goto L32
            if (r7 == 0) goto L2e
            int r0 = r7.intValue()
        Le:
            java.lang.Integer r0 = X.C1308910kAL.LIZJ(r0, r1)
            if (r0 == 0) goto L32
            int r4 = r0.intValue()
        L18:
            r6.setBackgroundColor(r4)
        L1b:
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r0 = X.C2107308Nj.LIZ
            X.054G r3 = X.C2296808zG.LIZ(r0)
            X.06LM r2 = new X.06LM
            r1 = 0
            r2.<init>(r4, r6, r1)
            r0 = 3
            X.C23250099c.LIZLLL(r3, r1, r1, r2, r0)
            return
        L2e:
            r0 = 2131100580(0x7f0603a4, float:1.7813545E38)
            goto Le
        L32:
            r4 = 0
            if (r6 == 0) goto L1b
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.impl.AVPublishPageUIRefactorService.highlightContent(android.view.View, java.lang.Integer):void");
    }
}
