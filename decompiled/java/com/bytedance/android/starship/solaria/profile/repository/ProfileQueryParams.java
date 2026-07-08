package com.bytedance.android.starship.solaria.profile.repository;

import X.C09CT;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class ProfileQueryParams {

    @C09CT("group_param")
    public final Map<String, Long> map;

    public ProfileQueryParams() {
        this(null);
    }

    public ProfileQueryParams(Map<String, Long> map) {
        this.map = map;
    }
}
