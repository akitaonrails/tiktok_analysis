package com.ss.android.ugc.nearby.quality.preload;

import X.AnonymousClass0957;
import X.C0PEM;
import X.C1203710hQf;
import X.C1203720hQg;
import X.C1203730hQh;
import X.C1499810p8F;
import X.C2188811AlT;
import X.C2296808zG;
import X.C23250099c;
import X.C266840Ad0;
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
public final class NearbyInnerFeedPreloader implements InterfaceC727570SgN<INearbyApi, AnonymousClass0957<? extends NearbyRevampResponse>> {
    public static final C1203720hQg Companion = new Object() { // from class: X.0hQg
    };
    public Long entranceId;

    @Override // X.InterfaceC20153313tL
    public boolean enable(Bundle bundle) {
        if (((Number) C266840Ad0.LIZ.getValue()).intValue() > 0) {
            return true;
        }
        return false;
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
        int iIntValue;
        Long lValueOf;
        C1203730hQh.LIZ.getClass();
        RoamingLocationInfo roamingLocationInfoLIZ = C1203730hQh.LIZ();
        Integer numLIZ = NearbyDoubleColumnRequestCountExperiment.LIZ(EnumC1204030hRB.INNER_PRELOAD);
        if (numLIZ != null) {
            iIntValue = numLIZ.intValue();
        } else {
            iIntValue = ((Number) C266840Ad0.LIZ.getValue()).intValue();
        }
        if (bundle != null) {
            lValueOf = Long.valueOf(bundle.getLong("key_entrance_id"));
        } else {
            lValueOf = null;
        }
        this.entranceId = lValueOf;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("preload entranceId=");
        sbLIZ.append(this.entranceId);
        C2188811AlT.LIZIZ(sbLIZ);
        return C23250099c.LIZIZ(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1203710hQf(function1, roamingLocationInfoLIZ, iIntValue, this, null), 3);
    }
}
