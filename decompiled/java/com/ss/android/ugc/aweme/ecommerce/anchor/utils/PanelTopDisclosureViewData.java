package com.ss.android.ugc.aweme.ecommerce.anchor.utils;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.PanelTopDisclosureLabel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes27.dex */
public final class PanelTopDisclosureViewData implements Serializable {

    @C09CT("panel_top_disclosure_label")
    public final PanelTopDisclosureLabel label;

    public PanelTopDisclosureViewData() {
        this(null);
    }

    public PanelTopDisclosureViewData(PanelTopDisclosureLabel panelTopDisclosureLabel) {
        this.label = panelTopDisclosureLabel;
    }
}
