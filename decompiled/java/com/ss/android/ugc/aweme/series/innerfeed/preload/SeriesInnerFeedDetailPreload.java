package com.ss.android.ugc.aweme.series.innerfeed.preload;

import X.C0CQT;
import X.C11IR;
import X.C11NZ;
import X.C1499810p8F;
import X.C1611670s2f;
import X.C1611810s2t;
import X.C2095008Iq;
import X.InterfaceC727570SgN;
import android.os.Bundle;
import android.os.SystemClock;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.model.PaidCollectionDetailResponse;
import com.ss.android.ugc.aweme.series.seriesdetail.api.SeriesDetailApi;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: loaded from: classes19.dex */
public final class SeriesInnerFeedDetailPreload implements InterfaceC727570SgN<SeriesDetailApi.GetPaidCollectionDetailApi, C11NZ<PaidCollectionDetailResponse>> {
    public static final int $stable = 0;

    @Override // X.InterfaceC20153313tL
    public boolean enable(Bundle bundle) {
        boolean zLIZ = false;
        try {
            SettingsManager.LIZLLL().getClass();
            zLIZ = SettingsManager.LIZ("series_inner_feed_api_preload_enable", false);
            return zLIZ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return zLIZ;
        }
    }

    @Override // X.InterfaceC727570SgN
    public C1499810p8F getPreloadStrategy(Bundle bundle) {
        return new C1499810p8F(false, C0CQT.LIZJ, null, 0, false, 29);
    }

    @Override // X.InterfaceC727570SgN
    public boolean handleException(Exception exc) {
        return true;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.InterfaceC727570SgN
    /* JADX INFO: renamed from: preload */
    public C11NZ<PaidCollectionDetailResponse> preload2(Bundle bundle, Function1<? super Class<SeriesDetailApi.GetPaidCollectionDetailApi>, ? extends SeriesDetailApi.GetPaidCollectionDetailApi> function1) throws JSONException {
        String string;
        Long lValueOf;
        if (bundle != null && ((((string = bundle.getString("collection_id")) != null && (lValueOf = C2095008Iq.LJIILIIL(string)) != null) || (lValueOf = Long.valueOf(bundle.getLong("collection_id"))) != null) && lValueOf.longValue() != 0)) {
            C1611670s2f c1611670s2f = C1611670s2f.LIZ;
            String string2 = lValueOf.toString();
            c1611670s2f.getClass();
            C1611810s2t c1611810s2tLIZIZ = C1611670s2f.LIZIZ(string2);
            c1611810s2tLIZIZ.getClass();
            if (!Intrinsics.LJFF(c1611810s2tLIZIZ, C1611670s2f.LIZJ) && c1611810s2tLIZIZ.LJII == 0) {
                c1611810s2tLIZIZ.LJII = SystemClock.elapsedRealtime();
                C1611810s2t.LIZIZ(c1611810s2tLIZIZ, "detailNetworkPreloadStart");
            }
            return function1.invoke(SeriesDetailApi.GetPaidCollectionDetailApi.class).getPaidCollectionDetail(lValueOf.longValue(), 1, true, null);
        }
        return C11IR.LL;
    }
}
