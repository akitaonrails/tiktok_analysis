package com.ss.android.ugc.aweme.model.api.data;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes30.dex */
public final class ProfileNaviInitialDataModel implements Serializable {

    @C09CT("features")
    public List<ProfileNaviFeatureDataModel> features;

    @C09CT("starter_navi_id")
    public String id;

    @C09CT("staticImage")
    public ProfileNaviStaticImageDataModel image;

    public final void setFeatures(List<ProfileNaviFeatureDataModel> list) {
        this.features = list;
    }

    public final void setId(String str) {
        this.id = str;
    }

    public final void setImage(ProfileNaviStaticImageDataModel profileNaviStaticImageDataModel) {
        this.image = profileNaviStaticImageDataModel;
    }

    public ProfileNaviInitialDataModel(String str, ProfileNaviStaticImageDataModel profileNaviStaticImageDataModel, List<ProfileNaviFeatureDataModel> list) {
        this.id = str;
        this.image = profileNaviStaticImageDataModel;
        this.features = list;
    }
}
