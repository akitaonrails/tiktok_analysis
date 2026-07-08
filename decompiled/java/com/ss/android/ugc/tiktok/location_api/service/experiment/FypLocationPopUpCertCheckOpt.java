package com.ss.android.ugc.tiktok.location_api.service.experiment;

import X.C01GW;
import X.C452501pT;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class FypLocationPopUpCertCheckOpt {
    public static final boolean DEFAULT = false;
    public static final FypLocationPopUpCertCheckOpt INSTANCE = new FypLocationPopUpCertCheckOpt();
    public static final C01GW config$delegate = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2305));

    private final boolean getConfig() {
        return ((Boolean) config$delegate.getValue()).booleanValue();
    }

    public final boolean enable() {
        return getConfig();
    }
}
