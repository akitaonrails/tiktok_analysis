package com.ss.android.ugc.aweme.portrait.service.dummy;

import X.C547760Le2;
import X.C547770Le3;
import X.C547780Le4;
import X.C548050LeV;
import X.C548060LeW;
import X.C548070LeX;
import X.C548080LeY;
import X.C550270Li5;
import X.InterfaceC535110Kyj;
import X.InterfaceC548110Leb;
import X.InterfaceC550350LiD;
import X.InterfaceC707110RoT;
import com.ss.android.ugc.aweme.portrait.service.AIPortraitEventService;
import com.ss.android.ugc.aweme.portrait.service.IAIPortraitCreationService;
import com.ss.android.ugc.aweme.portrait.service.IAIPortraitDraftService;
import com.ss.android.ugc.aweme.portrait.service.IAIPortraitFeatureService;
import com.ss.android.ugc.aweme.portrait.service.IAIPortraitLauncher;

/* JADX INFO: loaded from: classes9.dex */
public final class DummyAIPortraitFeatureServiceImpl implements IAIPortraitFeatureService {
    public static final DummyAIPortraitFeatureServiceImpl LJIIIZ = new DummyAIPortraitFeatureServiceImpl();
    public final C547760Le2 LIZIZ = C547760Le2.LIZ;
    public final C550270Li5 LIZJ = C550270Li5.LIZ;
    public final C548070LeX LIZLLL = C548070LeX.LIZ;
    public final C548050LeV LJ = C548050LeV.LIZ;
    public final C548060LeW LJFF = C548060LeW.LIZ;
    public final C547780Le4 LJI = C547780Le4.LIZ;
    public final C547770Le3 LJII = C547770Le3.LIZ;
    public final C548080LeY LJIIIIZZ = C548080LeY.LIZ;

    @Override // com.ss.android.ugc.aweme.portrait.service.IAIPortraitFeatureService
    public final boolean isFeatureEnabled() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.portrait.service.IAIPortraitFeatureService
    public final IAIPortraitLauncher LIZ() {
        return this.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.portrait.service.IAIPortraitFeatureService
    public final InterfaceC707110RoT LIZIZ() {
        return this.LJFF;
    }

    @Override // com.ss.android.ugc.aweme.portrait.service.IAIPortraitFeatureService
    public final InterfaceC550350LiD LIZLLL() {
        return this.LJIIIIZZ;
    }

    @Override // com.ss.android.ugc.aweme.portrait.service.IAIPortraitFeatureService
    public final InterfaceC548110Leb LJ() {
        return this.LIZLLL;
    }

    @Override // com.ss.android.ugc.aweme.portrait.service.IAIPortraitFeatureService
    public final IAIPortraitCreationService LJFF() {
        return this.LJ;
    }

    @Override // com.ss.android.ugc.aweme.portrait.service.IAIPortraitFeatureService
    public final IAIPortraitDraftService LJI() {
        return this.LJII;
    }

    @Override // com.ss.android.ugc.aweme.portrait.service.IAIPortraitFeatureService
    public final InterfaceC535110Kyj LJII() {
        return this.LJI;
    }

    @Override // com.ss.android.ugc.aweme.portrait.service.IAIPortraitFeatureService
    public final AIPortraitEventService LJIIIIZZ() {
        return this.LIZJ;
    }
}
