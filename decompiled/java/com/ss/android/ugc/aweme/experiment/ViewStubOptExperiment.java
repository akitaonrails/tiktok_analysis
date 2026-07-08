package com.ss.android.ugc.aweme.experiment;

import X.C01GW;
import X.C071Y;
import X.C071Z;
import X.C452501pT;
import X.InterfaceC725980Sdo;

/* JADX INFO: loaded from: classes4.dex */
public final class ViewStubOptExperiment implements InterfaceC725980Sdo {
    public static final boolean DEFAULT_VALUE = true;
    public static final String KEY = "feed_viewstub_opt";
    public static boolean hasInit;
    public final boolean DEFAULT = true;
    public final C01GW coldBootExpVal$delegate = C452501pT.LIZIZ(new C071Y());
    public static final C071Z Companion = new C071Z();
    public static boolean expVal = true;

    private final boolean getColdBootExpVal() {
        return ((Boolean) this.coldBootExpVal$delegate.getValue()).booleanValue();
    }

    @Override // X.InterfaceC725980Sdo
    public boolean hit() {
        return getColdBootExpVal();
    }

    public final boolean getDEFAULT() {
        return this.DEFAULT;
    }
}
