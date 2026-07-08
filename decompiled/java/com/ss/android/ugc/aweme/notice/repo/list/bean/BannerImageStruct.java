package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class BannerImageStruct {

    @C09CT("image_url")
    public final UrlModel imageUrl;

    @C09CT("masking_text")
    public final MissionTextStruct maskingText;

    @C09CT("schema_url")
    public final String schemaUrl;

    @C09CT("text_list")
    public final List<MissionTextStruct> textList;

    public BannerImageStruct() {
        this(null, null, null, "");
    }

    public BannerImageStruct(UrlModel urlModel, List<MissionTextStruct> list, MissionTextStruct missionTextStruct, String str) {
        this.imageUrl = urlModel;
        this.textList = list;
        this.maskingText = missionTextStruct;
        this.schemaUrl = str;
    }
}
