package com.ss.android.ugc.aweme.poi;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiAmusementModel implements Serializable {

    @C09CT("location_area")
    public final String childLocationArea;

    @C09CT("name")
    public final String name;

    @C09CT("pic_urls")
    public final List<String> picUrls;

    @C09CT("aweme_infos")
    public final List<PoiAwemeInfo> poiAwemeInfos;

    public PoiAmusementModel() {
        this(null, null, null, null);
    }

    public PoiAmusementModel(String str, List<PoiAwemeInfo> list, List<String> list2, String str2) {
        this.name = str;
        this.poiAwemeInfos = list;
        this.picUrls = list2;
        this.childLocationArea = str2;
    }
}
