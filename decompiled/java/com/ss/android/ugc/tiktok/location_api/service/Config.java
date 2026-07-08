package com.ss.android.ugc.tiktok.location_api.service;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class Config {

    @C09CT("business")
    public final String business;

    @C09CT("location_accuracy")
    public final int locationAccuracy;

    @C09CT("popup_scene_v2")
    public List<PopupSceneV2> popupSceneV2;

    @C09CT("region_source")
    public final String regionSource;

    public Config(String str, String str2, int i, List<PopupSceneV2> list) {
        this.business = str;
        this.regionSource = str2;
        this.locationAccuracy = i;
        this.popupSceneV2 = list;
    }
}
