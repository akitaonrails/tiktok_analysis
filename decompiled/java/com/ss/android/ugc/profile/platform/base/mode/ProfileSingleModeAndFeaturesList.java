package com.ss.android.ugc.profile.platform.base.mode;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileSingleModeAndFeaturesList {

    @C09CT("name")
    public final String name;

    @C09CT("support_components")
    public final List<String> support_components;

    public ProfileSingleModeAndFeaturesList() {
        this(null, null, 3, null);
    }

    public ProfileSingleModeAndFeaturesList(String str, List<String> list) {
        this.name = str;
        this.support_components = list;
    }

    public ProfileSingleModeAndFeaturesList(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "normal_mode" : str, (i & 2) != 0 ? C13BV.INSTANCE : list);
    }
}
