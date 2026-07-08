package com.bytedance.android.livesdk.gift.assets;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class ResourceModel {

    @C09CT("uri")
    public String uri;

    @C09CT("url_list")
    public List<String> urlList;

    public ResourceModel() {
        this(null, null, 3, null);
    }

    public ResourceModel(String str, List<String> list) {
        this.uri = str;
        this.urlList = list;
    }

    public ResourceModel(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? C13BV.INSTANCE : list);
    }
}
