package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public class PrivateUrlModel extends BaseResponse {

    @C09CT("hybrid_label")
    public List<AwemeHybridLabelModel> hybridLabels;

    @C09CT("label_private")
    public UrlModel labelPrivate;

    @C09CT("video_text")
    public List<AwemeTextLabelModel> textVideoLabels;

    public List<AwemeHybridLabelModel> getHybridLabels() {
        return this.hybridLabels;
    }

    public UrlModel getLabelPrivate() {
        return this.labelPrivate;
    }

    public List<AwemeTextLabelModel> getTextVideoLabels() {
        return this.textVideoLabels;
    }

    public void setHybridLabels(List<AwemeHybridLabelModel> list) {
        this.hybridLabels = list;
    }

    public void setLabelPrivate(UrlModel urlModel) {
        this.labelPrivate = urlModel;
    }

    public void setTextVideoLabels(List<AwemeTextLabelModel> list) {
        this.textVideoLabels = list;
    }
}
