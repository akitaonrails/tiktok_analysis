package com.ss.android.ugc.aweme.ad.feed.task.detect;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes34.dex */
public final class AppAdsDetectAppConfig {

    @C09CT("app_list")
    public final List<AppInfo> _appList;

    @C09CT("data_expiration_duration_ms")
    public final Long _dataExpirationDuration;

    @C09CT("detect_config")
    public final DetectConfig detectConfig;

    @C09CT("enable")
    public final Boolean enable;

    @C09CT("version")
    public final Long version;

    public AppAdsDetectAppConfig() {
        this(null, null, null, null, null, 31, null);
    }

    public AppAdsDetectAppConfig(Long l, Boolean bool, DetectConfig detectConfig, List<AppInfo> list, Long l2) {
        this.version = l;
        this.enable = bool;
        this.detectConfig = detectConfig;
        this._appList = list;
        this._dataExpirationDuration = l2;
    }

    public AppAdsDetectAppConfig(Long l, Boolean bool, DetectConfig detectConfig, List list, Long l2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? -1L : l, (i & 2) != 0 ? Boolean.FALSE : bool, (i & 4) != 0 ? new DetectConfig(null, null, null) : detectConfig, (i & 8) != 0 ? C13BV.INSTANCE : list, (i & 16) != 0 ? null : l2);
    }
}
