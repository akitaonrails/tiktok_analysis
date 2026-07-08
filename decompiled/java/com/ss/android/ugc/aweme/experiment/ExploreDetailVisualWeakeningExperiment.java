package com.ss.android.ugc.aweme.experiment;

import X.C098200Yq;
import X.C0C64;
import X.C189200o6;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ExploreDetailVisualWeakeningExperiment {
    public static final int CONTROL = 0;
    public static final int FOLLOW_BUTTON_VISUAL_WEAKENING = 2;
    public static final ExploreDetailVisualWeakeningExperiment INSTANCE = new ExploreDetailVisualWeakeningExperiment();
    public static final int LINK_VISUAL_WEAKENING = 1;

    public final int getGroup() {
        Object c098200Yq;
        try {
            c098200Yq = Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 0, "explore_detail_page_visual_weakening", true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = 0;
        }
        int iIntValue = ((Number) c098200Yq).intValue();
        if (iIntValue < 0 || iIntValue >= 3) {
            c098200Yq = null;
        }
        Integer num = (Integer) c098200Yq;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final boolean enableFollowButtonWeakening(String str) {
        if (Intrinsics.LJFF(str, "homepage_explore") && getGroup() >= 2) {
            return true;
        }
        return false;
    }

    public final boolean enableLinkWeakening(String str) {
        if (Intrinsics.LJFF(str, "homepage_explore") && getGroup() >= 1) {
            return true;
        }
        return false;
    }
}
