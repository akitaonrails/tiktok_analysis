package com.ss.android.ugc.aweme.ecommercelive.common.infra.data;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PlacementLabel;
import java.util.List;

/* JADX INFO: loaded from: classes33.dex */
public final class CardTitleInfo {

    @C09CT("placement_labels")
    public final List<PlacementLabel> placementLabels;

    @C09CT("separator")
    public final String separator;

    @C09CT("use_label_text")
    public final boolean useLabelText;

    @C09CT("user_right_info")
    public final UserRight userRightInfo;

    public CardTitleInfo() {
        this(null, "·", null, false);
    }

    public CardTitleInfo(List<PlacementLabel> list, String str, UserRight userRight, boolean z) {
        this.placementLabels = list;
        this.separator = str;
        this.userRightInfo = userRight;
        this.useLabelText = z;
    }
}
