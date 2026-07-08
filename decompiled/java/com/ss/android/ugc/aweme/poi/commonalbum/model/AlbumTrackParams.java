package com.ss.android.ugc.aweme.poi.commonalbum.model;

import X.C09CT;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class AlbumTrackParams {

    @C09CT("biz_params")
    public final Map<String, String> bizParams;

    @C09CT("general_mob_params")
    public final Map<String, String> generalMobParams;

    public AlbumTrackParams() {
        this(null, null);
    }

    public AlbumTrackParams(Map<String, String> map, Map<String, String> map2) {
        this.generalMobParams = map;
        this.bizParams = map2;
    }
}
