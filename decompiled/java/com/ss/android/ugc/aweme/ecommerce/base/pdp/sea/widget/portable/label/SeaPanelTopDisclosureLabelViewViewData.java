package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.widget.portable.label;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.PanelTopDisclosureLabel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes27.dex */
public final class SeaPanelTopDisclosureLabelViewViewData implements Serializable {
    public static final int $stable = 8;

    @C09CT("panel_top_disclosure_label")
    public final PanelTopDisclosureLabel label;

    public SeaPanelTopDisclosureLabelViewViewData() {
        this(null);
    }

    public SeaPanelTopDisclosureLabelViewViewData(PanelTopDisclosureLabel panelTopDisclosureLabel) {
        this.label = panelTopDisclosureLabel;
    }
}
