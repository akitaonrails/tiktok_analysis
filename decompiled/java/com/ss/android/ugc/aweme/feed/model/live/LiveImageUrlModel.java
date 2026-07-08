package com.ss.android.ugc.aweme.feed.model.live;

import X.C09CT;
import X.C13BV;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
public final class LiveImageUrlModel implements Serializable {

    @C09CT("uri")
    public String uri;

    @C09CT("url_list")
    public List<String> urls;

    public LiveImageUrlModel() {
        this(null, null, 3, null);
    }

    public final void setUri(String str) {
        this.uri = str;
    }

    public final void setUrls(List<String> list) {
        this.urls = list;
    }

    public LiveImageUrlModel(String str, List<String> list) {
        this.uri = str;
        this.urls = list;
    }

    public LiveImageUrlModel(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? C13BV.INSTANCE : list);
    }
}
