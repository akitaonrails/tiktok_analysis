package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;

/* JADX INFO: loaded from: classes28.dex */
public final class AggTopItem {

    @C09CT("image_url")
    public final UrlModel imageUrl;

    @C09CT("top_schema_url")
    public final String topSchemaUrl;

    @C09CT("top_text")
    public final String topText;

    public AggTopItem() {
        this(null, null, null);
    }

    public final AggTopItem copy(UrlModel urlModel, String str, String str2) {
        return new AggTopItem(urlModel, str, str2);
    }

    public int hashCode() {
        UrlModel urlModel = this.imageUrl;
        int iHashCode = (urlModel == null ? 0 : urlModel.hashCode()) * 31;
        String str = this.topSchemaUrl;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.topText;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public AggTopItem(UrlModel urlModel, String str, String str2) {
        this.imageUrl = urlModel;
        this.topSchemaUrl = str;
        this.topText = str2;
    }
}
