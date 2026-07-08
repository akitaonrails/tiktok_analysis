package com.ss.android.ugc.aweme.experiment;

import X.AnonymousClass0720;
import X.C01GW;
import X.C17969071z;
import X.C452501pT;
import X.InterfaceC725980Sdo;

/* JADX INFO: loaded from: classes4.dex */
public final class ViewStubOptExperimentV2 implements InterfaceC725980Sdo {
    public static final boolean ALL_OPT = true;
    public static final AnonymousClass0720 Companion = new Object() { // from class: X.0720
    };
    public static final boolean DEFAULT_VALUE = false;
    public static final String KEY = "feed_viewstub_opt_v2";
    public static boolean expVal;
    public static boolean hasInit;
    public final C01GW coldBootExpVal$delegate = C452501pT.LIZIZ(new C17969071z());

    /* JADX INFO: renamed from: default, reason: not valid java name */
    public final boolean f67default;

    private final boolean getColdBootExpVal() {
        return ((Boolean) this.coldBootExpVal$delegate.getValue()).booleanValue();
    }

    @Override // X.InterfaceC725980Sdo
    public boolean hit() {
        return getColdBootExpVal();
    }

    public final boolean getDefault() {
        return this.f67default;
    }
}
