package com.ss.android.ugc.nearby.settings;

import X.C09CT;

/* JADX INFO: loaded from: classes19.dex */
public final class NearbyLocationChangeCardExpData {

    @C09CT("location_change_card_enable")
    public final Boolean canInsertCard;

    @C09CT("show_location_card_index")
    public final Integer cardIndex;

    public NearbyLocationChangeCardExpData() {
        this(null, null);
    }

    public NearbyLocationChangeCardExpData(Boolean bool, Integer num) {
        this.canInsertCard = bool;
        this.cardIndex = num;
    }
}
