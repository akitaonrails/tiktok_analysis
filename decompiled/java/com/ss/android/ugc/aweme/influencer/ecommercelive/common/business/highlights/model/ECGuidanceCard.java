package com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.highlights.model;

import X.C09CT;
import X.C13BV;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes10.dex */
public final class ECGuidanceCard implements Serializable {
    public static final int $stable = 8;

    @C09CT("button")
    public final List<ECGuidanceButton> buttons;

    @C09CT("details")
    public final List<GuidanceDetail> details;

    @C09CT("icon_height")
    public final int iconHeight;

    @C09CT("icon_url")
    public final String iconUrl;

    @C09CT("icon_url_dark_mode")
    public final String iconUrlDarkMode;

    @C09CT("icon_width")
    public final int iconWidth;

    @C09CT("terms_of_service")
    public final TermsOfService termsOfService;

    @C09CT("title")
    public final String title;

    public ECGuidanceCard() {
        this(null, null, 0, 0, null, null, null, null, 255, null);
    }

    public ECGuidanceCard(String str, String str2, int i, int i2, String str3, List<GuidanceDetail> list, List<ECGuidanceButton> list2, TermsOfService termsOfService) {
        this.iconUrl = str;
        this.iconUrlDarkMode = str2;
        this.iconWidth = i;
        this.iconHeight = i2;
        this.title = str3;
        this.details = list;
        this.buttons = list2;
        this.termsOfService = termsOfService;
    }

    public ECGuidanceCard(String str, String str2, int i, int i2, String str3, List list, List list2, TermsOfService termsOfService, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? null : str, (i3 & 2) != 0 ? null : str2, (i3 & 4) != 0 ? 0 : i, (i3 & 8) == 0 ? i2 : 0, (i3 & 16) != 0 ? null : str3, (i3 & 32) != 0 ? C13BV.INSTANCE : list, (i3 & 64) != 0 ? C13BV.INSTANCE : list2, (i3 & 128) == 0 ? termsOfService : null);
    }
}
