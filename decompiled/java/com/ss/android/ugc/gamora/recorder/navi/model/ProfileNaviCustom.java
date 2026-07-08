package com.ss.android.ugc.gamora.recorder.navi.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes30.dex */
public final class ProfileNaviCustom implements Serializable {
    public static final int $stable = 8;

    @C09CT("background_color")
    public String backgroundColor;

    @C09CT("features")
    public List<ProfileNaviFeature> features;

    @C09CT("navi_id")
    public String naviId;

    @C09CT("staticImage")
    public List<ProfileNaviStaticImage> staticImage;

    @C09CT("user_id")
    public String userId;

    public final void setBackgroundColor(String str) {
        this.backgroundColor = str;
    }

    public final void setFeatures(List<ProfileNaviFeature> list) {
        this.features = list;
    }

    public final void setNaviId(String str) {
        this.naviId = str;
    }

    public final void setStaticImage(List<ProfileNaviStaticImage> list) {
        this.staticImage = list;
    }

    public final void setUserId(String str) {
        this.userId = str;
    }

    public ProfileNaviCustom(String str, String str2, String str3, List<ProfileNaviFeature> list, List<ProfileNaviStaticImage> list2) {
        this.naviId = str;
        this.userId = str2;
        this.backgroundColor = str3;
        this.features = list;
        this.staticImage = list2;
    }
}
