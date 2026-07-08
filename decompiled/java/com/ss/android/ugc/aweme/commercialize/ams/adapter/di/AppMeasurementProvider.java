package com.ss.android.ugc.aweme.commercialize.ams.adapter.di;

import X.C04TF;
import X.C0N21;
import X.C0N22;
import X.C0N23;
import X.C12865051r;
import X.C585270MxR;
import com.ss.android.ugc.aweme.commercialize.ams.di.MeasurementDependencyModules;
import com.ss.android.ugc.aweme.commercialize.appmeasurement.IAppMeasurementProvider;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class AppMeasurementProvider implements IAppMeasurementProvider {
    public final C0N22 LIZ = new C0N22();
    public final C0N21 LIZIZ = new C0N21();

    @Override // com.ss.android.ugc.aweme.commercialize.appmeasurement.IAppMeasurementProvider
    public final boolean LIZIZ(JSONObject jSONObject) {
        JSONObject jSONObjectLIZ = C12865051r.LIZ(jSONObject.optString("ad_extra_data"));
        boolean zLJFF = Intrinsics.LJFF(jSONObjectLIZ.optString("track_from_ams"), "1");
        boolean zLJFF2 = Intrinsics.LJFF(jSONObjectLIZ.optString("track_from_ams_not_drop"), "1");
        if (!zLJFF && !zLJFF2) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.appmeasurement.IAppMeasurementProvider
    public final boolean LIZ(Aweme aweme, String str) {
        C0N23 c0n23LIZ = this.LIZIZ.LIZ(aweme);
        MeasurementDependencyModules.LIZ.getClass();
        C04TF.LIZ().isDebug();
        if (c0n23LIZ != null) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.appmeasurement.IAppMeasurementProvider
    public final boolean LIZJ(Aweme aweme, String str) {
        C0N23 c0n23LIZJ;
        C0N22 c0n22 = this.LIZ;
        C0N23 c0n23 = null;
        if (aweme == null) {
            c0n22.getClass();
        } else if (C0N22.LJ(aweme) && (c0n23LIZJ = C0N22.LIZJ(aweme)) != null && ((ConcurrentHashMap) C585270MxR.LIZ).get(c0n23LIZJ) != null) {
            c0n23 = c0n23LIZJ;
        }
        MeasurementDependencyModules.LIZ.getClass();
        C04TF.LIZ().isDebug();
        C0N23 c0n23LIZ = this.LIZIZ.LIZ(aweme);
        C04TF.LIZ().isDebug();
        C04TF.LIZ().isDebug();
        if (c0n23 == null && c0n23LIZ == null) {
            return false;
        }
        return true;
    }
}
