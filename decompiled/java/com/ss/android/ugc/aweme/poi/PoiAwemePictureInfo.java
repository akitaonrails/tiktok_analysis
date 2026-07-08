package com.ss.android.ugc.aweme.poi;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiAwemePictureInfo implements Serializable {

    @C09CT("author")
    public final PoiAwemePicAuthorStruct author;

    @C09CT("can_report")
    public final Boolean canReport;

    @C09CT("compressed_url_info")
    public final UrlModel compressedUrlInfo;

    @C09CT("cover_style")
    public final Integer coverStyle;

    @C09CT("entity_id")
    public final String entityId;

    @C09CT("entity_type")
    public final Integer entityType;

    @C09CT("origin_url_info")
    public final UrlModel originUrlInfo;

    @C09CT("pic_id")
    public final String picId;

    @C09CT("ref_code")
    public final String refCode;

    @C09CT("source")
    public final String source;

    @C09CT("url_info")
    public final UrlModel urlInfo;

    public PoiAwemePictureInfo() {
        this(null, null, null, null, null, null, null, null, null, null, null);
    }

    public PoiAwemePictureInfo(UrlModel urlModel, UrlModel urlModel2, UrlModel urlModel3, String str, Integer num, PoiAwemePicAuthorStruct poiAwemePicAuthorStruct, String str2, String str3, Boolean bool, String str4, Integer num2) {
        this.urlInfo = urlModel;
        this.compressedUrlInfo = urlModel2;
        this.originUrlInfo = urlModel3;
        this.picId = str;
        this.entityType = num;
        this.author = poiAwemePicAuthorStruct;
        this.source = str2;
        this.refCode = str3;
        this.canReport = bool;
        this.entityId = str4;
        this.coverStyle = num2;
    }
}
