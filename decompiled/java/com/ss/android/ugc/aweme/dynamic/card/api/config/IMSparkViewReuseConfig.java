package com.ss.android.ugc.aweme.dynamic.card.api.config;

import X.C09CT;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class IMSparkViewReuseConfig {

    @C09CT("allow_schema_list")
    public final ArrayList<String> allowList;

    @C09CT("deny_schema_list")
    public final ArrayList<String> denyList;

    @C09CT("reuse_enable")
    public final boolean enable;

    @C09CT("expired_time_in_seconds")
    public final int expiredTimeInSeconds;

    @C09CT("is_allow_all_schema")
    public final boolean isAllowAllSchema;

    @C09CT("lynx_resource_channels")
    public final List<String> lynxResourceChannels;

    @C09CT("reuse_in_app_lifecycle")
    public final boolean reuseInAppLifecycle;

    @C09CT("reuse_volume")
    public final int volume;

    public IMSparkViewReuseConfig() {
        this(false, 0, 0, false, null, null, false, null, 255, null);
    }

    public IMSparkViewReuseConfig(boolean z, int i, int i2, boolean z2, ArrayList<String> arrayList, ArrayList<String> arrayList2, boolean z3, List<String> list) {
        this.enable = z;
        this.volume = i;
        this.expiredTimeInSeconds = i2;
        this.isAllowAllSchema = z2;
        this.allowList = arrayList;
        this.denyList = arrayList2;
        this.reuseInAppLifecycle = z3;
        this.lynxResourceChannels = list;
    }

    public IMSparkViewReuseConfig(boolean z, int i, int i2, boolean z2, ArrayList arrayList, ArrayList arrayList2, boolean z3, List list, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? false : z, (i3 & 2) != 0 ? 10 : i, (i3 & 4) != 0 ? -1 : i2, (i3 & 8) != 0 ? true : z2, (i3 & 16) != 0 ? null : arrayList, (i3 & 32) == 0 ? arrayList2 : null, (i3 & 64) == 0 ? z3 : false, (i3 & 128) != 0 ? Collections.singletonList("tiktok_im_message_template_lynx") : list);
    }
}
