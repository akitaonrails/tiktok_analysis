package com.ss.android.ugc.aweme.ecommerce.sec.captcha;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
public final class EcomSecurityEventMatchersModel {

    @C09CT("hook_event")
    public final String hookEvent;

    @C09CT("params")
    public final List<Object> params;

    @C09CT("track_info_params")
    public final List<String> trackInfoParams;

    public EcomSecurityEventMatchersModel() {
        this(null, null, null, 7, null);
    }

    public EcomSecurityEventMatchersModel(String str, List<Object> list, List<String> list2) {
        this.hookEvent = str;
        this.params = list;
        this.trackInfoParams = list2;
    }

    public EcomSecurityEventMatchersModel(String str, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? C13BV.INSTANCE : list, (i & 4) != 0 ? C13BV.INSTANCE : list2);
    }
}
