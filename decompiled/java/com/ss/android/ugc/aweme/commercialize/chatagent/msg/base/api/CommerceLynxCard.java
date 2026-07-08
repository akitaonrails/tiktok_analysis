package com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.api;

import X.C09CT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class CommerceLynxCard {

    @C09CT("component_data")
    public CommerceLynxCardComponentData componentData;

    @C09CT("component_name")
    public String componentName;

    @C09CT("raw_value")
    public String rawValue;

    public CommerceLynxCard() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommerceLynxCard)) {
            return false;
        }
        CommerceLynxCard commerceLynxCard = (CommerceLynxCard) obj;
        return Intrinsics.LJFF(this.componentName, commerceLynxCard.componentName) && Intrinsics.LJFF(this.componentData, commerceLynxCard.componentData) && Intrinsics.LJFF(this.rawValue, commerceLynxCard.rawValue);
    }

    public CommerceLynxCard(String str, CommerceLynxCardComponentData commerceLynxCardComponentData, String str2) {
        this.componentName = str;
        this.componentData = commerceLynxCardComponentData;
        this.rawValue = str2;
    }
}
