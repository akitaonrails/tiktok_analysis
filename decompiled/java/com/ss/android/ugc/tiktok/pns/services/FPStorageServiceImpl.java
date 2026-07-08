package com.ss.android.ugc.tiktok.pns.services;

import X.C01GW;
import X.C452501pT;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.tiktok.pns.FPStorageService;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class FPStorageServiceImpl implements FPStorageService {
    public static final /* synthetic */ int LIZJ = 0;
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(755));

    public final Keva LIZ() {
        return (Keva) this.LIZIZ.getValue();
    }

    @Override // com.ss.android.ugc.tiktok.pns.FPStorageService
    public final long LJ() {
        return LIZ().getLong("parentalGuardianDuration", 0L);
    }

    @Override // com.ss.android.ugc.tiktok.pns.FPStorageService
    public final void LJFF(long j) {
        LIZ().storeLong("parentalGuardianDuration", j);
    }

    @Override // com.ss.android.ugc.tiktok.pns.FPStorageService
    public final boolean getBoolean(String str) {
        return LIZ().getBoolean(str, false);
    }

    @Override // com.ss.android.ugc.tiktok.pns.FPStorageService
    public final int getInt(String str) {
        return LIZ().getInt(str, 0);
    }

    @Override // com.ss.android.ugc.tiktok.pns.FPStorageService
    public final String getString(String str) {
        return LIZ().getString(str, "");
    }

    @Override // com.ss.android.ugc.tiktok.pns.FPStorageService
    public final void LIZIZ(String str, String str2) {
        LIZ().storeString(str, str2);
    }

    @Override // com.ss.android.ugc.tiktok.pns.FPStorageService
    public final void LIZJ(String str, int i) {
        LIZ().storeInt(str, i);
    }

    @Override // com.ss.android.ugc.tiktok.pns.FPStorageService
    public final void LIZLLL(String str, boolean z) {
        LIZ().storeBoolean(str, z);
    }
}
