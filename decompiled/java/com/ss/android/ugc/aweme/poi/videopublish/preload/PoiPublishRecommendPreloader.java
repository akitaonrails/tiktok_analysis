package com.ss.android.ugc.aweme.poi.videopublish.preload;

import X.C0C2R;
import X.C1189060h32;
import X.C1199140hJI;
import X.C1199160hJK;
import X.C1199630hK5;
import X.C1199950hKb;
import X.C11NZ;
import X.C1200280hL8;
import X.C1209020hZE;
import X.C1499810p8F;
import X.C2084808Es;
import X.C297510BlN;
import X.C844470XAv;
import X.InterfaceC727570SgN;
import Y.AkS95S0400000_18;
import android.os.Bundle;
import com.bytedance.i18n.location.api.LocationData;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.creative.model.MediaLocationMetaDataModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.net.preload.PreloadExtraData;
import com.ss.android.ugc.aweme.poi.PoiMobParam;
import com.ss.android.ugc.aweme.poi.api.PoiSearchApi;
import com.ss.android.ugc.aweme.poi.model.PoiSearchRequestBody;
import com.ss.android.ugc.aweme.poi_api.experiment.PoiEnableExperiment;
import com.ss.android.ugc.aweme.preload.PreloadExtraInfo;
import com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiPublishRecommendPreloader implements InterfaceC727570SgN<PoiSearchApi, C11NZ<PoiSearchApi.PoiSearchResultWrapperV2>> {
    public static final C1199630hK5 Companion = new Object() { // from class: X.0hK5
    };
    public static final String TAG = "PoiPublishPreload";
    public static double preloadLatitude;
    public static double preloadLongitude;
    public final C1200280hL8 locationPermissionManager = C1199950hKb.LIZ();
    public Long requestStart;

    @Override // X.InterfaceC20153313tL
    public boolean enable(Bundle bundle) {
        return true;
    }

    private final C11NZ<LocationData> getLocation() {
        return C11NZ.LJIJJLI(new C1209020hZE(this, 3));
    }

    private final String generateSignature(long j) {
        C844470XAv.LIZ.getClass();
        return C2084808Es.LIZ(String.valueOf(C844470XAv.LJIIJ) + PoiEnableExperiment.LIZIZ() + j);
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
    /* JADX WARN: Removed duplicated region for block: B:17:0x0037 A[PHI: r6
      0x0037: PHI (r6v4 com.ss.android.ugc.aweme.poi.PoiMobParam) = (r6v1 com.ss.android.ugc.aweme.poi.PoiMobParam), (r6v5 com.ss.android.ugc.aweme.poi.PoiMobParam) binds: [B:14:0x002b, B:16:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003b A[Catch: Exception -> 0x009d, TRY_ENTER, TryCatch #0 {Exception -> 0x009d, blocks: (B:3:0x0006, B:10:0x0022, B:12:0x0026, B:19:0x003b, B:20:0x0040, B:21:0x0046, B:23:0x0060, B:30:0x006f, B:32:0x0091, B:34:0x0096, B:9:0x001e, B:14:0x002b), top: B:39:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0040 A[Catch: Exception -> 0x009d, TryCatch #0 {Exception -> 0x009d, blocks: (B:3:0x0006, B:10:0x0022, B:12:0x0026, B:19:0x003b, B:20:0x0040, B:21:0x0046, B:23:0x0060, B:30:0x006f, B:32:0x0091, B:34:0x0096, B:9:0x001e, B:14:0x002b), top: B:39:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0060 A[Catch: Exception -> 0x009d, TryCatch #0 {Exception -> 0x009d, blocks: (B:3:0x0006, B:10:0x0022, B:12:0x0026, B:19:0x003b, B:20:0x0040, B:21:0x0046, B:23:0x0060, B:30:0x006f, B:32:0x0091, B:34:0x0096, B:9:0x001e, B:14:0x002b), top: B:39:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0091 A[Catch: Exception -> 0x009d, TryCatch #0 {Exception -> 0x009d, blocks: (B:3:0x0006, B:10:0x0022, B:12:0x0026, B:19:0x003b, B:20:0x0040, B:21:0x0046, B:23:0x0060, B:30:0x006f, B:32:0x0091, B:34:0x0096, B:9:0x001e, B:14:0x002b), top: B:39:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0096 A[Catch: Exception -> 0x009d, TryCatch #0 {Exception -> 0x009d, blocks: (B:3:0x0006, B:10:0x0022, B:12:0x0026, B:19:0x003b, B:20:0x0040, B:21:0x0046, B:23:0x0060, B:30:0x006f, B:32:0x0091, B:34:0x0096, B:9:0x001e, B:14:0x002b), top: B:39:0x0006 }] */
    @Override // X.InterfaceC727570SgN
    /* JADX INFO: renamed from: preload */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public X.C11NZ<com.ss.android.ugc.aweme.poi.api.PoiSearchApi.PoiSearchResultWrapperV2> preload2(android.os.Bundle r12, kotlin.jvm.functions.Function1<? super java.lang.Class<com.ss.android.ugc.aweme.poi.api.PoiSearchApi>, ? extends com.ss.android.ugc.aweme.poi.api.PoiSearchApi> r13) {
        /*
            r11 = this;
            r0 = 0
            com.ss.android.ugc.aweme.poi.videopublish.preload.PoiPublishRecommendPreloader.preloadLatitude = r0
            com.ss.android.ugc.aweme.poi.videopublish.preload.PoiPublishRecommendPreloader.preloadLongitude = r0
            X.0hK6 r1 = new X.AbstractC1196150hET() { // from class: X.0hK6
                public static final java.lang.String LIZIZ = "start_preload";

                static {
                    /*
                        X.0hK6 r0 = new X.0hK6
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:X.0hK6) X.0hK6.LIZ X.0hK6
                        java.lang.String r0 = "start_preload"
                        X.C1199640hK6.LIZIZ = r0
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1199640hK6.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1199640hK6.<init>():void");
                }

                @Override // X.AbstractC1196150hET
                public final java.lang.String LIZIZ() {
                    /*
                        r1 = this;
                        java.lang.String r0 = X.C1199640hK6.LIZIZ
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1199640hK6.LIZIZ():java.lang.String");
                }
            }     // Catch: java.lang.Exception -> L9d
            r1.getClass()     // Catch: java.lang.Exception -> L9d
            java.lang.String r0 = "preload_recommond_poi"
            r7 = 0
            r1.LIZJ(r0, r7)     // Catch: java.lang.Exception -> L9d
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L9d
            java.lang.String r1 = "poi_mob_param"
            r2 = 33
            if (r3 >= r2) goto L29
            if (r12 == 0) goto L1c
            goto L1e
        L1c:
            r6 = r7
            goto L22
        L1e:
            java.io.Serializable r6 = r12.getSerializable(r1)     // Catch: java.lang.Exception -> L9d
        L22:
            boolean r0 = r6 instanceof com.ss.android.ugc.aweme.poi.PoiMobParam     // Catch: java.lang.Exception -> L9d
            if (r0 == 0) goto L34
            com.ss.android.ugc.aweme.poi.PoiMobParam r6 = (com.ss.android.ugc.aweme.poi.PoiMobParam) r6     // Catch: java.lang.Exception -> L9d
            goto L35
        L29:
            if (r12 == 0) goto L34
            java.lang.Class<com.ss.android.ugc.aweme.poi.PoiMobParam> r0 = com.ss.android.ugc.aweme.poi.PoiMobParam.class
            java.io.Serializable r6 = r12.getSerializable(r1, r0)     // Catch: java.lang.Exception -> L9d
            com.ss.android.ugc.aweme.poi.PoiMobParam r6 = (com.ss.android.ugc.aweme.poi.PoiMobParam) r6     // Catch: java.lang.Exception -> L9d
            goto L37
        L34:
            r6 = r7
        L35:
            if (r12 == 0) goto L46
        L37:
            java.lang.String r1 = "metadata"
            if (r3 >= r2) goto L40
            java.util.ArrayList r7 = r12.getParcelableArrayList(r1)     // Catch: java.lang.Exception -> L9d
            goto L46
        L40:
            java.lang.Class<com.ss.android.ugc.aweme.creative.model.MediaLocationMetaDataModel> r0 = com.ss.android.ugc.aweme.creative.model.MediaLocationMetaDataModel.class
            java.util.ArrayList r7 = r12.getParcelableArrayList(r1, r0)     // Catch: java.lang.Exception -> L9d
        L46:
            X.0XAv r0 = X.C844470XAv.LIZ     // Catch: java.lang.Exception -> L9d
            r0.getClass()     // Catch: java.lang.Exception -> L9d
            android.content.Context r0 = X.C844470XAv.LIZ()     // Catch: java.lang.Exception -> L9d
            boolean r4 = X.C1194170hBH.LIZJ(r0)     // Catch: java.lang.Exception -> L9d
            r5 = r11
            X.0hL8 r0 = r5.locationPermissionManager     // Catch: java.lang.Exception -> L9d
            boolean r3 = r0.LIZJ()     // Catch: java.lang.Exception -> L9d
            boolean r0 = X.C1199620hK4.LIZ()     // Catch: java.lang.Exception -> L9d
            if (r0 != 0) goto L68
            boolean r0 = X.C1199620hK4.LIZIZ()     // Catch: java.lang.Exception -> L9d
            if (r0 != 0) goto L68
            r2 = r3
            goto L6f
        L68:
            if (r3 == 0) goto L6e
            if (r4 == 0) goto L6e
            r2 = 1
            goto L6f
        L6e:
            r2 = 0
        L6f:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Exception -> L9d
            java.lang.String r0 = "preload system service = "
            r1.append(r0)     // Catch: java.lang.Exception -> L9d
            r1.append(r4)     // Catch: java.lang.Exception -> L9d
            java.lang.String r0 = ",gps permission = "
            r1.append(r0)     // Catch: java.lang.Exception -> L9d
            r1.append(r3)     // Catch: java.lang.Exception -> L9d
            java.lang.String r0 = ",location available = "
            r1.append(r0)     // Catch: java.lang.Exception -> L9d
            r1.append(r2)     // Catch: java.lang.Exception -> L9d
            X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Exception -> L9d
            r8 = r13
            if (r2 == 0) goto L96
            X.11NZ r0 = r5.sendRequestAfterLocation(r6, r7, r8)     // Catch: java.lang.Exception -> L9d
            return r0
        L96:
            r10 = 0
            r9 = 0
            X.11NZ r0 = r5.sendRequest(r6, r7, r8, r9, r10)     // Catch: java.lang.Exception -> L9d
            return r0
        L9d:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "cache "
            r1.append(r0)
            java.lang.String r0 = r2.getMessage()
            r1.append(r0)
            X.C2188811AlT.LIZIZ(r1)
            X.0hTX r1 = X.C1205490hTX.LIZ
            X.0hTZ r0 = X.EnumC1205510hTZ.POI_RECOMMEND_PRELOAD
            r1.LJ(r0, r2)
            X.11Iw r0 = X.C11NZ.LJJIJLIJ(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.videopublish.preload.PoiPublishRecommendPreloader.preload2(android.os.Bundle, kotlin.jvm.functions.Function1):X.11NZ");
    }

    private final C11NZ<PoiSearchApi.PoiSearchResultWrapperV2> sendRequestAfterLocation(PoiMobParam poiMobParam, ArrayList<MediaLocationMetaDataModel> arrayList, Function1<? super Class<PoiSearchApi>, ? extends PoiSearchApi> function1) {
        return getLocation().LJJJ(new AkS95S0400000_18(this, poiMobParam, arrayList, function1, 0), false).LJJL(new AkS95S0400000_18(this, poiMobParam, arrayList, function1, 1));
    }

    public final C11NZ<PoiSearchApi.PoiSearchResultWrapperV2> sendRequest(PoiMobParam poiMobParam, ArrayList<MediaLocationMetaDataModel> arrayList, Function1<? super Class<PoiSearchApi>, ? extends PoiSearchApi> function1, boolean z, Pair<Double, Double> pair) {
        Boolean bool;
        double dDoubleValue;
        double dDoubleValue2;
        double dDoubleValue3;
        String str;
        Map<String, String> map;
        n nVar;
        List arrayList2;
        this.requestStart = Long.valueOf(System.currentTimeMillis());
        boolean zLIZ = C297510BlN.LIZ();
        PoiSearchRequestBody poiSearchRequestBodyLJJII = null;
        if (zLIZ) {
            bool = Boolean.TRUE;
        } else {
            bool = null;
        }
        double dDoubleValue4 = 0.0d;
        if (pair != null) {
            dDoubleValue = pair.getFirst().doubleValue();
        } else {
            dDoubleValue = 0.0d;
        }
        preloadLatitude = dDoubleValue;
        if (pair != null) {
            dDoubleValue2 = pair.getSecond().doubleValue();
        } else {
            dDoubleValue2 = 0.0d;
        }
        preloadLongitude = dDoubleValue2;
        boolean zLIZJ = this.locationPermissionManager.LIZJ();
        if (pair != null) {
            dDoubleValue3 = pair.getFirst().doubleValue();
            dDoubleValue4 = pair.getSecond().doubleValue();
        } else {
            dDoubleValue3 = 0.0d;
        }
        if (poiMobParam != null) {
            str = poiMobParam.enterFrom;
            map = poiMobParam.creationExtraData;
        } else {
            str = null;
            map = null;
        }
        C1199140hJI c1199140hJI = new C1199140hJI(dDoubleValue4, dDoubleValue3, arrayList, 0L, null, "RECOMMEND", 20L, 0L, zLIZJ, 0L, null, str, null, null, null, C1189060h32.LJJIIJZLJL(map), null, null, Boolean.valueOf(zLIZ), bool, null, null, null, null, null, -1682055240, 31);
        boolean z2 = false;
        ILocationBaseServiceForMT iLocationBaseServiceForMT = (ILocationBaseServiceForMT) PluggableExtentionKt.pluggableSpi$default(ILocationBaseServiceForMT.class, false, false, false, 14, null);
        long jCurrentTimeMillis = System.currentTimeMillis();
        PoiSearchApi.LIZ.getClass();
        PoiSearchRequestBody poiSearchRequestBodyLIZIZ = C1199160hJK.LIZIZ(jCurrentTimeMillis, c1199140hJI, "/tiktok/poi/api/place/recommend");
        if (iLocationBaseServiceForMT != null) {
            poiSearchRequestBodyLJJII = iLocationBaseServiceForMT.LJJII(poiSearchRequestBodyLIZIZ);
        }
        PoiSearchApi poiSearchApiInvoke = function1.invoke(PoiSearchApi.class);
        String strGenerateSignature = generateSignature(jCurrentTimeMillis);
        C844470XAv.LIZ.getClass();
        String strValueOf = String.valueOf(C844470XAv.LJIIJ);
        if (poiSearchRequestBodyLJJII == null || (nVar = poiSearchRequestBodyLJJII.toJsonObject()) == null) {
            nVar = new n();
        }
        String str2 = c1199140hJI.LJIIJJI;
        try {
            arrayList2 = (List) C0C2R.LIZIZ.getValue();
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            arrayList2 = new ArrayList();
        }
        return poiSearchApiInvoke.recommendPoi("application/json", strGenerateSignature, strValueOf, nVar, new PreloadExtraData(z2, new PreloadExtraInfo(-1, str2, "", "/tiktok/poi/api/place/recommend", arrayList2), z2, "preload", 4));
    }
}
