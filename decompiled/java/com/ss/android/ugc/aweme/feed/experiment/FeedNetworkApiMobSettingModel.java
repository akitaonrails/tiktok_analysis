package com.ss.android.ugc.aweme.feed.experiment;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes27.dex */
public final class FeedNetworkApiMobSettingModel {

    @C09CT("apis")
    public final List<String> apis;

    @C09CT("enable")
    public final boolean enable;

    public FeedNetworkApiMobSettingModel() {
        this(false, null, 3, null);
    }

    public FeedNetworkApiMobSettingModel(boolean z, List<String> list) {
        this.enable = z;
        this.apis = list;
    }

    public FeedNetworkApiMobSettingModel(boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? C13BV.INSTANCE : list);
    }
}
