package com.ss.android.ugc.gamora.recorder.navi.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes30.dex */
public final class ProfileNaviCandidate implements Serializable {
    public static final int $stable = 8;

    @C09CT("features")
    public List<ProfileNaviFeature> features;

    @C09CT("starter_navi_id")
    public String starterNaviId;

    @C09CT("staticImage")
    public ProfileNaviStaticImage staticImage;

    public final void setFeatures(List<ProfileNaviFeature> list) {
        this.features = list;
    }

    public final void setStarterNaviId(String str) {
        this.starterNaviId = str;
    }

    public final void setStaticImage(ProfileNaviStaticImage profileNaviStaticImage) {
        this.staticImage = profileNaviStaticImage;
    }

    public ProfileNaviCandidate(String str, List<ProfileNaviFeature> list, ProfileNaviStaticImage profileNaviStaticImage) {
        this.starterNaviId = str;
        this.features = list;
        this.staticImage = profileNaviStaticImage;
    }
}
