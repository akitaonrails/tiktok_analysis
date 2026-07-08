package com.bytedance.ies.ugc.aweme.rich.model.feed.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class IndicatorData implements Serializable {

    @C09CT("box_url")
    public final AwemeUrl boxUrl;

    @C09CT("conversion_area")
    public final NewButtonInfo conversionArea;

    @C09CT("indicator_icon")
    public final UrlModel indicatorIcon;

    @C09CT("indicator_start_box")
    public final BoxData indicatorStartBox;

    public IndicatorData() {
        this(null, null, null, null);
    }

    public IndicatorData(UrlModel urlModel, BoxData boxData, AwemeUrl awemeUrl, NewButtonInfo newButtonInfo) {
        this.indicatorIcon = urlModel;
        this.indicatorStartBox = boxData;
        this.boxUrl = awemeUrl;
        this.conversionArea = newButtonInfo;
    }
}
