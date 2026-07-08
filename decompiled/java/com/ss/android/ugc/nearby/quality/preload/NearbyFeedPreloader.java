package com.ss.android.ugc.nearby.quality.preload;

import X.AnonymousClass0957;
import X.C0PEM;
import X.C1203730hQh;
import X.C1203750hQj;
import X.C1203770hQl;
import X.C1203930hR1;
import X.C1499810p8F;
import X.C2296808zG;
import X.C23250099c;
import X.EnumC1204030hRB;
import X.InterfaceC727570SgN;
import android.os.Bundle;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.nearby.container.model.NearbyRevampResponse;
import com.ss.android.ugc.nearby.container.repo.INearbyApi;
import com.ss.android.ugc.nearby.roaming.RoamingLocationInfo;
import com.ss.android.ugc.nearby.settings.NearbyDoubleColumnRequestCountExperiment;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes19.dex */
public final class NearbyFeedPreloader implements InterfaceC727570SgN<INearbyApi, AnonymousClass0957<? extends NearbyRevampResponse>> {
    public static final C1203770hQl Companion = new Object() { // from class: X.0hQl
    };

    @Override // X.InterfaceC20153313tL
    public boolean enable(Bundle bundle) {
        return true;
    }

    @Override // X.InterfaceC727570SgN
    public C1499810p8F getPreloadStrategy(Bundle bundle) {
        return new C1499810p8F(false, Api.LIZ, null, 20000, false, 28);
    }

    @Override // X.InterfaceC727570SgN
    public boolean handleException(Exception exc) throws Exception {
        throw exc;
    }

    @Override // X.InterfaceC727570SgN
    /* JADX INFO: renamed from: preload */
    public AnonymousClass0957<? extends NearbyRevampResponse> preload2(Bundle bundle, Function1<? super Class<INearbyApi>, ? extends INearbyApi> function1) {
        String str;
        Integer numLIZ;
        C1203730hQh.LIZ.getClass();
        RoamingLocationInfo roamingLocationInfoLIZ = C1203730hQh.LIZ();
        C1203930hR1 c1203930hR1 = C1203930hR1.LIZ;
        if (roamingLocationInfoLIZ != null) {
            str = roamingLocationInfoLIZ.manualRegion;
        } else {
            str = null;
        }
        c1203930hR1.getClass();
        if (C1203930hR1.LJIILIIL(str) && C1203930hR1.LJ() != null) {
            numLIZ = NearbyDoubleColumnRequestCountExperiment.LIZ(EnumC1204030hRB.SECOND_REFRESH);
        } else {
            numLIZ = NearbyDoubleColumnRequestCountExperiment.LIZ(EnumC1204030hRB.FIRST_ENTER);
        }
        return C23250099c.LIZIZ(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1203750hQj(function1, roamingLocationInfoLIZ, numLIZ, null), 3);
    }
}
