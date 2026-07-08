package com.bytedance.android.livesdk.api.revenue.privilege.model;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tikcast.api.privilege.EntranceIconAnimation;
import tikcast.api.privilege.QueryUserPrivilegesResponse;

/* JADX INFO: loaded from: classes8.dex */
public final class PrivilegeCenterConfig {

    @C09CT("entrance_animation")
    public final List<EntranceIconAnimation> entranceAnimations;

    @C09CT("entrance_config")
    public final QueryUserPrivilegesResponse.EntranceConfig entranceConfig;

    @C09CT("show_entrance")
    public final boolean showEntrance;

    public PrivilegeCenterConfig(boolean z, QueryUserPrivilegesResponse.EntranceConfig entranceConfig, List<EntranceIconAnimation> list) {
        this.showEntrance = z;
        this.entranceConfig = entranceConfig;
        this.entranceAnimations = list;
    }

    public PrivilegeCenterConfig(boolean z, QueryUserPrivilegesResponse.EntranceConfig entranceConfig, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, entranceConfig, (i & 4) != 0 ? C13BV.INSTANCE : list);
    }
}
