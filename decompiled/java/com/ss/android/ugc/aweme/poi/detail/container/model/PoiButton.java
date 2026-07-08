package com.ss.android.ugc.aweme.poi.detail.container.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiButton implements Serializable {

    @C09CT("button_name")
    public final String buttonName;

    @C09CT("button_type")
    public final Integer buttonType;

    @C09CT("click_actions")
    public final List<ClickEvent> clickEvent;

    @C09CT("icon")
    public final DynamicIcon icon;

    public PoiButton() {
        this(null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoiButton)) {
            return false;
        }
        PoiButton poiButton = (PoiButton) obj;
        return Intrinsics.LJFF(this.icon, poiButton.icon) && Intrinsics.LJFF(this.buttonName, poiButton.buttonName) && Intrinsics.LJFF(this.buttonType, poiButton.buttonType) && Intrinsics.LJFF(this.clickEvent, poiButton.clickEvent);
    }

    public final String mobBtnName() {
        Integer num = this.buttonType;
        return num != null ? num.intValue() == 1 ? "favourite" : num.intValue() == 2 ? "share" : num.intValue() == 3 ? "report" : num.intValue() == 4 ? "help" : num.intValue() == 6 ? "my_reviews" : num.intValue() == 5 ? "recently_favourite" : num.intValue() == 7 ? "add_review" : num.intValue() == 12 ? "suggest_location_info" : num.intValue() == 11 ? "route" : num.intValue() == 9 ? "reserve" : num.intValue() == 10 ? "order" : "unknown" : "unknown";
    }

    public PoiButton(DynamicIcon dynamicIcon, String str, Integer num, List<ClickEvent> list) {
        this.icon = dynamicIcon;
        this.buttonName = str;
        this.buttonType = num;
        this.clickEvent = list;
    }
}
