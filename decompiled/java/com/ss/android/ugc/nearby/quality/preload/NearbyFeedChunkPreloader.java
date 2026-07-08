package com.ss.android.ugc.nearby.quality.preload;

import X.C01GW;
import X.C11NZ;
import X.C1203730hQh;
import X.C1203760hQk;
import X.C1499810p8F;
import X.C1515820pY4;
import X.C20019113Un;
import X.C538540LAe;
import X.InterfaceC727570SgN;
import android.os.Bundle;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.net.preload.PreloadExtraData;
import com.ss.android.ugc.aweme.preload.PreloadExtraInfo;
import com.ss.android.ugc.nearby.container.model.NearbyRevampResponse;
import com.ss.android.ugc.nearby.container.repo.INearbyApi;
import com.ss.android.ugc.nearby.roaming.RoamingLocationInfo;
import com.ss.android.ugc.nearby.settings.NearbyChunkOptExperiment;
import com.ss.android.ugc.tiktok.location_api.service.LocationRegion;
import java.util.Collections;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes19.dex */
public final class NearbyFeedChunkPreloader implements InterfaceC727570SgN<INearbyApi, C11NZ<C1515820pY4<NearbyRevampResponse>>> {
    public static final C1203760hQk Companion = new Object() { // from class: X.0hQk
    };

    @Override // X.InterfaceC20153313tL
    public boolean enable(Bundle bundle) {
        return true;
    }

    @Override // X.InterfaceC727570SgN
    public C1499810p8F getPreloadStrategy(Bundle bundle) {
        return new C1499810p8F(false, Api.LIZ, null, C538540LAe.LLJJJIL, false, 28);
    }

    @Override // X.InterfaceC727570SgN
    public boolean handleException(Exception exc) throws Exception {
        throw exc;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC727570SgN
    /* JADX INFO: renamed from: preload */
    public C11NZ<C1515820pY4<NearbyRevampResponse>> preload2(Bundle bundle, Function1<? super Class<INearbyApi>, ? extends INearbyApi> function1) {
        Boolean bool;
        C1203730hQh.LIZ.getClass();
        RoamingLocationInfo roamingLocationInfoLIZ = C1203730hQh.LIZ();
        LocationRegion locationRegionIfManual = null;
        if (ComplianceServiceProvider.LJI().LJIIJ(false)) {
            bool = (Boolean) ComplianceServiceProvider.LJI().LJJIII().getValue();
        } else {
            bool = null;
        }
        C01GW c01gw = NearbyChunkOptExperiment.LIZIZ;
        INearbyApi.ChunkParams chunkParams = new INearbyApi.ChunkParams(Integer.valueOf(((NearbyChunkOptExperiment.NearbyChunkOptConfig) c01gw.getValue()).firstChunkCount), Integer.valueOf(((NearbyChunkOptExperiment.NearbyChunkOptConfig) c01gw.getValue()).secondChunkCount), Integer.valueOf(((NearbyChunkOptExperiment.NearbyChunkOptConfig) c01gw.getValue()).thirdChunkCount));
        INearbyApi iNearbyApiInvoke = function1.invoke(INearbyApi.class);
        if (roamingLocationInfoLIZ != null) {
            locationRegionIfManual = roamingLocationInfoLIZ.toLocationRegionIfManual();
        }
        C20019113Un.LIZ.getClass();
        return iNearbyApiInvoke.fetchNearbyDataChunk(new INearbyApi.NearbyRequestBodyForChunk(locationRegionIfManual, 0, 12, bool, C20019113Un.LIZ(), chunkParams), new PreloadExtraData(true, new PreloadExtraInfo(-1, "nearby", "nearby", "/tiktok/feed/nearby/chunk", Collections.singletonList("manual_selection_region")), false, "preload", 4));
    }
}
