package com.ss.android.ugc.aweme.discover.abtest;

import X.C09CT;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchSecurityControlValue {

    @C09CT("disable_at_user_search")
    public boolean disableAtUserSearch;

    @C09CT("disable_ecom_tab")
    public boolean disableEcomTab;

    @C09CT("disable_effect_search")
    public boolean disableEffectSearch;

    @C09CT("disable_general_tab")
    public boolean disableGeneralTab;

    @C09CT("disable_hashtag_search")
    public boolean disableHashtagSearch;

    @C09CT("disable_hashtag_tab")
    public boolean disableHashtagTab;

    @C09CT("disable_live_tab")
    public boolean disableLiveTab;

    @C09CT("disable_music_search")
    public boolean disableMusicSearch;

    @C09CT("disable_music_tab")
    public boolean disableMusicTab;

    @C09CT("disable_photo_tab")
    public final boolean disablePhotoTab;

    @C09CT("disable_poi_tab")
    public final boolean disablePoiTab;

    @C09CT("disable_sug")
    public boolean disableSug;

    @C09CT("disable_suggest_guide")
    public boolean disableSuggestGuide;

    @C09CT("disable_comment_suggested_search")
    public boolean disableSuggestWords;

    @C09CT("disable_user_tab")
    public boolean disableUserTab;

    @C09CT("disable_video_tab")
    public boolean disableVideoTab;

    public SearchSecurityControlValue() {
        this(false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false);
    }

    public SearchSecurityControlValue(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        this.disableGeneralTab = z;
        this.disableVideoTab = z2;
        this.disableUserTab = z3;
        this.disableMusicTab = z4;
        this.disableHashtagTab = z5;
        this.disableEcomTab = z6;
        this.disableLiveTab = z7;
        this.disablePoiTab = z8;
        this.disablePhotoTab = z9;
        this.disableSug = z10;
        this.disableSuggestGuide = z11;
        this.disableEffectSearch = z12;
        this.disableMusicSearch = z13;
        this.disableAtUserSearch = z14;
        this.disableHashtagSearch = z15;
        this.disableSuggestWords = z16;
    }
}
