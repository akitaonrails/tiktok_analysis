package com.ss.android.ugc.aweme.net.experiment;

import X.C08CX;
import X.C09CT;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Collections;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes24.dex */
public final class RiskyRetryRequestStrategy {

    @C09CT("block_window_ms")
    public final int blockWindowMs;

    @C09CT("disable_when_path_starts_with")
    public final Set<String> disableWhenPathStartsWith;

    @C09CT("enable")
    public final boolean enable;

    @C09CT("enable_during_start_up")
    public final boolean enableDuringStartup;

    @C09CT("enable_test_api")
    public final boolean enableTestApi;

    @C09CT("enable_when_path_starts_with")
    public final Set<String> enableWhenPathStartsWith;

    @C09CT("enable_when_url_contains")
    public final Set<String> enableWhenUrlContains;

    @C09CT("error_http_code")
    public final Set<Integer> errorHttpCode;

    @C09CT("error_max_count")
    public final int errorMaxCount;

    @C09CT("error_time_ms")
    public final int errorTimeMs;

    public RiskyRetryRequestStrategy() {
        this(false, false, null, null, null, null, 0, 0, 0, false, 1023, null);
    }

    public RiskyRetryRequestStrategy(boolean z, boolean z2, Set<String> set, Set<String> set2, Set<String> set3, Set<Integer> set4, int i, int i2, int i3, boolean z3) {
        this.enable = z;
        this.enableDuringStartup = z2;
        this.enableWhenUrlContains = set;
        this.enableWhenPathStartsWith = set2;
        this.disableWhenPathStartsWith = set3;
        this.errorHttpCode = set4;
        this.errorMaxCount = i;
        this.errorTimeMs = i2;
        this.blockWindowMs = i3;
        this.enableTestApi = z3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public RiskyRetryRequestStrategy(boolean z, boolean z2, Set set, Set set2, Set set3, Set set4, int i, int i2, int i3, boolean z3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        int i5 = i2;
        Set set5 = set4;
        Set set6 = set3;
        Set set7 = set2;
        Set set8 = set;
        boolean z4 = z2;
        this((i4 & 1) != 0 ? false : z, (i4 & 2) != 0 ? true : z4, (i4 & 4) != 0 ? Collections.singleton("tiktok") : set8, (i4 & 8) != 0 ? Collections.singleton("/") : set7, (i4 & 16) != 0 ? C08CX.INSTANCE : set6, (i4 & 32) != 0 ? Collections.singleton(429) : set5, (i4 & 64) == 0 ? i : 1, (i4 & 128) != 0 ? LSPassThroughRecordSizeConfig.DEFAULT : i5, (i4 & 256) == 0 ? i3 : LSPassThroughRecordSizeConfig.DEFAULT, (i4 & 512) == 0 ? z3 : false);
    }
}
