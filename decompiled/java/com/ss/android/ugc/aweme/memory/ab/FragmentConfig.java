package com.ss.android.ugc.aweme.memory.ab;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class FragmentConfig {
    public static final int $stable = 8;

    @C09CT("forceMain")
    public final boolean forceMain;

    @C09CT("forceOld")
    public final boolean forceOld;

    @C09CT("forceX")
    public final boolean forceX;

    @C09CT("fragmentActivities")
    public final List<String> fragmentActivities;

    @C09CT("fragmentList")
    public final List<String> fragmentList;

    @C09CT("recursive")
    public final boolean recursive;

    public FragmentConfig() {
        this(true, false, false, false, null, null);
    }

    public FragmentConfig(boolean z, boolean z2, boolean z3, boolean z4, List<String> list, List<String> list2) {
        this.recursive = z;
        this.forceMain = z2;
        this.forceX = z3;
        this.forceOld = z4;
        this.fragmentActivities = list;
        this.fragmentList = list2;
    }
}
