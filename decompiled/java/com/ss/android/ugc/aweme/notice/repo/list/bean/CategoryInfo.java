package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class CategoryInfo {

    @C09CT("category_id")
    public final Integer categoryId;

    @C09CT("event_tracking_fields")
    public List<KeyValueHolder> eventTrackingExtra;

    @C09CT("icon")
    public final UrlModel icon;

    @C09CT("label")
    public final int label;

    @C09CT("label_title")
    public final String labelTitle;

    public CategoryInfo() {
        this(0, "", null, null, null);
    }

    public CategoryInfo(int i, String str, Integer num, UrlModel urlModel, List<KeyValueHolder> list) {
        this.label = i;
        this.labelTitle = str;
        this.categoryId = num;
        this.icon = urlModel;
        this.eventTrackingExtra = list;
    }
}
