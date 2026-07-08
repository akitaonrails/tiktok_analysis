package com.ss.android.ugc.aweme.ttsvoice.model;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
public final class UrlStruct {

    @C09CT("height")
    public final int height;

    @C09CT("uri")
    public final String uri;

    @C09CT("url_key")
    public final String urlKey;

    @C09CT("url_list")
    public final List<String> urlList;

    @C09CT("width")
    public final int width;

    public UrlStruct() {
        this(null, null, 0, 0, null, 31, null);
    }

    public UrlStruct(String str, List<String> list, int i, int i2, String str2) {
        this.uri = str;
        this.urlList = list;
        this.width = i;
        this.height = i2;
        this.urlKey = str2;
    }

    public UrlStruct(String str, List list, int i, int i2, String str2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? C13BV.INSTANCE : list, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2, (i3 & 16) == 0 ? str2 : "");
    }
}
