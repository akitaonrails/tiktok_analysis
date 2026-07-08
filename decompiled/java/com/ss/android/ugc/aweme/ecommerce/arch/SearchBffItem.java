package com.ss.android.ugc.aweme.ecommerce.arch;

import X.C09CT;
import com.google.gson.k;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchBffItem {

    @C09CT("btm")
    public final String btm;

    @C09CT("data")
    public k data;

    @C09CT("item_id")
    public final String id;

    @C09CT("style")
    public final MixStyle style;

    @C09CT("tech_type")
    public final int techType;

    @C09CT("track_data")
    public final String trackData;

    @C09CT("biz_type")
    public final int type;

    public SearchBffItem(String str, int i, int i2, k kVar, String str2, String str3, MixStyle mixStyle) {
        this.id = str;
        this.type = i;
        this.techType = i2;
        this.data = kVar;
        this.trackData = str2;
        this.btm = str3;
        this.style = mixStyle;
    }
}
