package com.ss.android.ugc.aweme.commercialize.model;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.io.Serializable;

/* JADX INFO: loaded from: classes12.dex */
public final class Ad4adModel implements Serializable {
    public boolean banButton;

    @C09CT("is_promote_new")
    public final boolean isPromoteNew;

    @C09CT("not_interested_button_text")
    public final String notInterestedButtonText;

    @C09CT("promote_button_text")
    public final String promoteButtonText;

    @C09CT("promotion_label")
    public final String promotionLabel;

    @C09CT("not_interested_toast_text")
    public final String toast;

    @C09CT("web_url")
    public final String webUrl;

    @C09CT("why_this_ad")
    public final String whyThisAd;

    public final boolean isPromoteNew() {
        return this.isPromoteNew;
    }

    public final int getPromoteUserType(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (!this.isPromoteNew) {
            return 1;
        }
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && awemeRawAd.getAdvId() != null) {
            return 2;
        }
        return 3;
    }

    public final void setBanButton(boolean z) {
        this.banButton = z;
    }

    public Ad4adModel(String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2) {
        this.promotionLabel = str;
        this.promoteButtonText = str2;
        this.notInterestedButtonText = str3;
        this.whyThisAd = str4;
        this.webUrl = str5;
        this.toast = str6;
        this.isPromoteNew = z;
        this.banButton = z2;
    }
}
