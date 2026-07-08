package com.ss.android.ugc.aweme.poi.search;

import X.AbstractC1202400hOY;
import X.C1198600hIQ;
import X.C1199470hJp;
import X.C1199950hKb;
import X.C11NZ;
import X.C1200280hL8;
import X.C1207450hWh;
import X.C1499810p8F;
import X.C2084808Es;
import X.C2188811AlT;
import X.C259800zU;
import X.C844470XAv;
import X.InterfaceC687820QyS;
import X.InterfaceC727570SgN;
import android.os.Bundle;
import com.bytedance.i18n.location.api.LocationData;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.poi.api.PoiSearchApi;
import com.ss.android.ugc.aweme.poi_api.experiment.PoiEnableExperiment;
import kotlin.Pair;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiPostPreload implements InterfaceC727570SgN<PoiSearchApi, C11NZ<PoiSearchApi.PoiSearchResultWrapperV2>> {
    public static final C1199470hJp Companion = new Object() { // from class: X.0hJp
    };
    public final C1200280hL8 locationPermissionManager = C1199950hKb.LIZ();

    /* JADX WARN: Multi-variable type inference failed */
    private final Pair<Double, Double> getLocationData() {
        final C259800zU c259800zU = new C259800zU();
        Pair pairLIZLLL = C1198600hIQ.LIZLLL();
        AbstractC1202400hOY abstractC1202400hOY = (AbstractC1202400hOY) pairLIZLLL.getFirst();
        AbstractC1202400hOY abstractC1202400hOY2 = (AbstractC1202400hOY) pairLIZLLL.getSecond();
        if (this.locationPermissionManager.LIZJ()) {
            C1207450hWh.LIZ.LJIIL("poi", "add_location", abstractC1202400hOY, abstractC1202400hOY2, new InterfaceC687820QyS() { // from class: X.0OA5
                /* JADX WARN: Type inference failed for: r3v0, types: [T, kotlin.Pair] */
                @Override // X.InterfaceC687820QyS
                public final void LIZ(LocationData locationData) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("get location data successfully, location=");
                    sbLIZ.append(locationData.latitude);
                    sbLIZ.append(',');
                    sbLIZ.append(locationData.longitude);
                    C2188811AlT.LIZIZ(sbLIZ);
                    c259800zU.element = new Pair(Double.valueOf(locationData.latitude), Double.valueOf(locationData.longitude));
                }

                @Override // X.InterfaceC687820QyS
                public final void onError(int i, String str) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("get location data failed, errMsg=");
                    sbLIZ.append(str);
                    C2188811AlT.LIZIZ(sbLIZ);
                }
            }, -1L);
        }
        return (Pair) c259800zU.element;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b1 A[PHI: r3
      0x00b1: PHI (r3v3 com.ss.android.ugc.aweme.poi.PoiMobParam) = (r3v1 com.ss.android.ugc.aweme.poi.PoiMobParam), (r3v6 com.ss.android.ugc.aweme.poi.PoiMobParam) binds: [B:31:0x00a9, B:9:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final X.C1199140hJI buildRequestBody(android.os.Bundle r41) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.search.PoiPostPreload.buildRequestBody(android.os.Bundle):X.0hJI");
    }

    private final String generateSignature(long j) {
        C844470XAv.LIZ.getClass();
        return C2084808Es.LIZ(String.valueOf(C844470XAv.LJIIJ) + PoiEnableExperiment.LIZIZ() + j);
    }

    @Override // X.InterfaceC20153313tL
    public boolean enable(Bundle bundle) {
        boolean z;
        if (bundle != null) {
            z = bundle.getBoolean("enable_preload");
        } else {
            z = false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("enablePreload=");
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        return z;
    }

    @Override // X.InterfaceC727570SgN
    public C1499810p8F getPreloadStrategy(Bundle bundle) {
        return new C1499810p8F(false, Api.LIZ, null, 20000, false, 28);
    }

    @Override // X.InterfaceC727570SgN
    public boolean handleException(Exception exc) throws Exception {
        throw exc;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0051  */
    @Override // X.InterfaceC727570SgN
    /* JADX INFO: renamed from: preload */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public X.C11NZ<com.ss.android.ugc.aweme.poi.api.PoiSearchApi.PoiSearchResultWrapperV2> preload2(android.os.Bundle r18, kotlin.jvm.functions.Function1<? super java.lang.Class<com.ss.android.ugc.aweme.poi.api.PoiSearchApi>, ? extends com.ss.android.ugc.aweme.poi.api.PoiSearchApi> r19) {
        /*
            r17 = this;
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT> r0 = com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT.class
            java.lang.Object r4 = r1.getService(r0)
            com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT r4 = (com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT) r4
            r7 = r18
            if (r7 == 0) goto Laa
            java.lang.String r0 = "page_start_ts"
            long r2 = r7.getLong(r0)
        L16:
            r6 = r17
            X.0hJI r1 = r6.buildRequestBody(r7)
            X.0hJK r0 = com.ss.android.ugc.aweme.poi.api.PoiSearchApi.LIZ
            r0.getClass()
            java.lang.String r0 = "/tiktok/poi/api/place/recommend"
            com.ss.android.ugc.aweme.poi.model.PoiSearchRequestBody r0 = X.C1199160hJK.LIZIZ(r2, r1, r0)
            com.ss.android.ugc.aweme.poi.model.PoiSearchRequestBody r4 = r4.LJJII(r0)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "requestBodyWithPermissionInfo="
            r1.append(r0)
            r1.append(r4)
            X.C2188811AlT.LIZIZ(r1)
            int r5 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            java.lang.String r1 = "poi_mob_param"
            r8 = 0
            if (r5 >= r0) goto L9f
            if (r7 == 0) goto L9d
            java.io.Serializable r1 = r7.getSerializable(r1)
        L49:
            boolean r0 = r1 instanceof com.ss.android.ugc.aweme.poi.PoiMobParam
            if (r0 == 0) goto L53
            com.ss.android.ugc.aweme.poi.PoiMobParam r1 = (com.ss.android.ugc.aweme.poi.PoiMobParam) r1
        L4f:
            if (r1 == 0) goto L53
            java.lang.String r8 = r1.enterFrom
        L53:
            java.lang.Class<com.ss.android.ugc.aweme.poi.api.PoiSearchApi> r0 = com.ss.android.ugc.aweme.poi.api.PoiSearchApi.class
            r1 = r19
            java.lang.Object r1 = r1.invoke(r0)
            com.ss.android.ugc.aweme.poi.api.PoiSearchApi r1 = (com.ss.android.ugc.aweme.poi.api.PoiSearchApi) r1
            java.lang.String r12 = "application/json"
            java.lang.String r13 = r6.generateSignature(r2)
            X.0XAv r0 = X.C844470XAv.LIZ
            r0.getClass()
            int r0 = X.C844470XAv.LJIIJ
            java.lang.String r14 = java.lang.String.valueOf(r0)
            com.google.gson.n r15 = r4.toJsonObject()
            com.ss.android.ugc.aweme.net.preload.PreloadExtraData r4 = new com.ss.android.ugc.aweme.net.preload.PreloadExtraData
            com.ss.android.ugc.aweme.preload.PreloadExtraInfo r6 = new com.ss.android.ugc.aweme.preload.PreloadExtraInfo
            java.lang.String r9 = ""
            java.lang.String r10 = "/tiktok/poi/api/place/recommend"
            r7 = -1
            java.lang.String r3 = "filter_ids"
            java.lang.String r2 = "page"
            java.lang.String r0 = "timestamp"
            java.lang.String[] r0 = new java.lang.String[]{r2, r0, r3}
            java.util.List r11 = X.C1697810uHb.LJIIJJI(r0)
            r6.<init>(r7, r8, r9, r10, r11)
            r8 = 0
            r9 = 12
            r5 = 0
            r6 = r6
            r7 = r5
            r4.<init>(r5, r6, r7, r8, r9)
            r11 = r1
            r16 = r4
            X.11NZ r0 = r11.recommendPoi(r12, r13, r14, r15, r16)
            return r0
        L9d:
            r1 = r8
            goto L49
        L9f:
            if (r7 == 0) goto L53
            java.lang.Class<com.ss.android.ugc.aweme.poi.PoiMobParam> r0 = com.ss.android.ugc.aweme.poi.PoiMobParam.class
            java.io.Serializable r1 = r7.getSerializable(r1, r0)
            com.ss.android.ugc.aweme.poi.PoiMobParam r1 = (com.ss.android.ugc.aweme.poi.PoiMobParam) r1
            goto L4f
        Laa:
            long r2 = java.lang.System.currentTimeMillis()
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.search.PoiPostPreload.preload2(android.os.Bundle, kotlin.jvm.functions.Function1):X.11NZ");
    }
}
