package com.ss.android.ugc.aweme.ecommercelive.audience.common.business.audience.api.data;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class PreviewData {

    @C09CT("bag_data")
    public final BagData bagData;

    @C09CT("highlight_data")
    public final PreviewHighlightData highlightData;

    public PreviewData(BagData bagData, PreviewHighlightData previewHighlightData) {
        this.bagData = bagData;
        this.highlightData = previewHighlightData;
    }
}
