package com.ss.android.ugc.aweme.tako.model;

import X.C09CT;
import X.C13BV;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoImageItem implements Serializable {
    public static final int $stable = 8;

    @C09CT("height")
    public final int height;

    @C09CT("image_id")
    public final String imageId;

    @C09CT("local_cache_path")
    public final String localCachePath;

    @C09CT("url_list")
    public final List<String> urlList;

    @C09CT("width")
    public final int width;

    public TakoImageItem() {
        this(null, null, 0, 0, null, 31, null);
    }

    public TakoImageItem(String str, List<String> list, int i, int i2, String str2) {
        this.imageId = str;
        this.urlList = list;
        this.width = i;
        this.height = i2;
        this.localCachePath = str2;
    }

    public TakoImageItem(String str, List list, int i, int i2, String str2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? C13BV.INSTANCE : list, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2, (i3 & 16) == 0 ? str2 : "");
    }
}
