package com.ss.android.ugc.aweme.biz.ab;

import X.C09CT;
import X.C13BV;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class PipoOnboardingSuccPageConfigModel {

    @C09CT("countdown")
    public final long countdownTime;

    @C09CT("special_entrances")
    public final List<String> specialEntrances;

    public PipoOnboardingSuccPageConfigModel() {
        this(0L, null, 3, null);
    }

    public PipoOnboardingSuccPageConfigModel(long j, List<String> list) {
        this.countdownTime = j;
        this.specialEntrances = list;
    }

    public PipoOnboardingSuccPageConfigModel(long j, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Mp4ScreenVideoLoadTimeout.CONTROL : j, (i & 2) != 0 ? C13BV.INSTANCE : list);
    }
}
