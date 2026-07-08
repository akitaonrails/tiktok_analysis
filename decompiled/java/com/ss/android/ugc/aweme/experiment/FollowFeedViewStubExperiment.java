package com.ss.android.ugc.aweme.experiment;

import X.C01GW;
import X.C1783806yi;
import X.C1783906yj;
import X.C452501pT;
import X.InterfaceC725980Sdo;

/* JADX INFO: loaded from: classes4.dex */
public final class FollowFeedViewStubExperiment implements InterfaceC725980Sdo {
    public static final C1783906yj Companion = new Object() { // from class: X.06yj
    };
    public static final boolean DEFAULT_VALUE = false;
    public static final String KEY = "follow_feed_viewstub_opt";
    public static final String REPO_NAME = "ab_repo_cold_boot";
    public static boolean expVal;
    public static boolean hasInit;
    public final boolean close;
    public final C01GW expVal$delegate = C452501pT.LIZIZ(new C1783806yi());

    private final boolean getExpVal() {
        return ((Boolean) this.expVal$delegate.getValue()).booleanValue();
    }

    @Override // X.InterfaceC725980Sdo
    public boolean hit() {
        return getExpVal();
    }

    public final boolean getClose() {
        return this.close;
    }
}
