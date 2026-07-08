package com.ss.android.ugc.aweme.feed.model.live;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class PreviewBenefitLine implements Serializable {

    @C09CT("preview_benefits")
    public final List<PreviewBenefitPoint> previewBenefits;

    @C09CT("separator")
    public final PreviewBenefitPoint separator;

    public PreviewBenefitLine() {
        this(null, null);
    }

    public PreviewBenefitLine(List<PreviewBenefitPoint> list, PreviewBenefitPoint previewBenefitPoint) {
        this.previewBenefits = list;
        this.separator = previewBenefitPoint;
    }
}
