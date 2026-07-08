package com.ss.android.ugc.aweme.compliance.protection.digitalwellbeing.api;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class AmberAlert {

    @C09CT("amber_alert_details")
    public final List<AmberAlertDetail> amberAlertDetails;

    @C09CT("on_alert")
    public final Boolean onAlert;

    public AmberAlert() {
        this(null, null, 3, null);
    }

    public AmberAlert(Boolean bool, List<AmberAlertDetail> list) {
        this.onAlert = bool;
        this.amberAlertDetails = list;
    }

    public AmberAlert(Boolean bool, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Boolean.FALSE : bool, (i & 2) != 0 ? C13BV.INSTANCE : list);
    }
}
