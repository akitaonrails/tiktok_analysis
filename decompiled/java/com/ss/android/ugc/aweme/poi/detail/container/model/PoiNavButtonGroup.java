package com.ss.android.ugc.aweme.poi.detail.container.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiNavButtonGroup implements Serializable {

    @C09CT("fold_button_list")
    public final List<PoiButton> foldButtons;

    @C09CT("is_immersion")
    public final boolean isImmersion;

    @C09CT("right_button_list")
    public final List<PoiButton> rightButtons;

    public PoiNavButtonGroup() {
        this(false, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoiNavButtonGroup)) {
            return false;
        }
        PoiNavButtonGroup poiNavButtonGroup = (PoiNavButtonGroup) obj;
        return this.isImmersion == poiNavButtonGroup.isImmersion && Intrinsics.LJFF(this.rightButtons, poiNavButtonGroup.rightButtons) && Intrinsics.LJFF(this.foldButtons, poiNavButtonGroup.foldButtons);
    }

    public final boolean isImmersion() {
        return this.isImmersion;
    }

    public PoiNavButtonGroup(boolean z, List<PoiButton> list, List<PoiButton> list2) {
        this.isImmersion = z;
        this.rightButtons = list;
        this.foldButtons = list2;
    }
}
