package com.ss.android.ugc.aweme.plugin.journey;

import X.C09CT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class OnboardingFlowData {

    @C09CT("steps")
    public final List<NewUserJourneyStep> steps;

    public OnboardingFlowData() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OnboardingFlowData) && Intrinsics.LJFF(this.steps, ((OnboardingFlowData) obj).steps);
    }

    public OnboardingFlowData(List<NewUserJourneyStep> list) {
        this.steps = list;
    }
}
