package com.ss.android.ugc.aweme.minis.route;

import X.C11S5;
import X.C1227904rF;
import X.C1701940uOG;
import X.C1918407fK;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2196441Axm;
import X.C2196951Ayb;
import X.C786410Ut5;
import X.EnumC2196421Axk;
import X.InterfaceC1242560iRK;
import X.InterfaceC19474811He;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.router.route.IRouteAction;
import com.ss.android.ugc.aweme.minis.model.MinisLinkMeta;
import com.ss.android.ugc.aweme.minis.model.MinisMeta;
import com.ss.android.ugc.aweme.minis.model.NetworkResponse;
import com.ss.android.ugc.aweme.minis.model.TiktokMinisLinkParseResponse;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes20.dex */
public final class MinisTokenRouteAction implements IRouteAction {
    public static final int $stable = 0;
    public static final C1918407fK Companion = new C1918407fK();

    private final void fetchMinisLinkParseData(Context context, String str, final InterfaceC1242560iRK interfaceC1242560iRK) {
        Application application;
        int i = C2187451AjH.LIZ;
        Context contextN3 = null;
        if (context != null) {
            contextN3 = C786410Ut5.N3(context);
        }
        if ((contextN3 instanceof Application) && (application = (Application) contextN3) != null) {
            final long jCurrentTimeMillis = System.currentTimeMillis();
            new C2196951Ayb(application).LJFF(str).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LIZ(new InterfaceC19474811He<NetworkResponse<TiktokMinisLinkParseResponse>>() { // from class: X.0iRJ
                @Override // X.InterfaceC19474811He
                public final void onError(Throwable th) {
                    int i2 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("fetchMinisLinkParseData, onError:");
                    sbLIZ.append(th);
                    C2188811AlT.LIZIZ(sbLIZ);
                    long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                    int iOrdinal = EnumC1386420mBM.MINIS_STATUS_UNKNOWN.ordinal();
                    JSONArray jSONArray = C2196361Axe.LIZ;
                    C2196361Axe.LJFF(iOrdinal, "", null, -1, jCurrentTimeMillis2, false);
                    NetworkResponse<TiktokMinisLinkParseResponse> networkResponse = new NetworkResponse<>(null, -1, false, null, false, null, null);
                    InterfaceC1242560iRK interfaceC1242560iRK2 = interfaceC1242560iRK;
                    if (interfaceC1242560iRK2 != null) {
                        interfaceC1242560iRK2.LIZ(false, networkResponse);
                    }
                }

                @Override // X.InterfaceC19474811He
                public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
                    int i2 = C2187451AjH.LIZ;
                }

                @Override // X.InterfaceC19474811He
                public final void onSuccess(NetworkResponse<TiktokMinisLinkParseResponse> networkResponse) {
                    int iOrdinal;
                    int iIntValue;
                    String str2;
                    MinisLinkMeta minisLinkMeta;
                    MinisMeta minisMeta;
                    Integer num;
                    MinisMeta minisMeta2;
                    Integer num2;
                    NetworkResponse<TiktokMinisLinkParseResponse> networkResponse2 = networkResponse;
                    int i2 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("fetchMinisLinkParseData, onSuccess, data:");
                    sbLIZ.append(networkResponse2);
                    C2188811AlT.LIZIZ(sbLIZ);
                    long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                    TiktokMinisLinkParseResponse tiktokMinisLinkParseResponse = networkResponse2.data;
                    if (tiktokMinisLinkParseResponse != null && (minisMeta2 = tiktokMinisLinkParseResponse.minisMeta) != null && (num2 = minisMeta2.minisStatus) != null) {
                        iOrdinal = num2.intValue();
                    } else {
                        iOrdinal = EnumC1386420mBM.MINIS_STATUS_UNKNOWN.ordinal();
                    }
                    TiktokMinisLinkParseResponse tiktokMinisLinkParseResponse2 = networkResponse2.data;
                    if (tiktokMinisLinkParseResponse2 != null && (num = tiktokMinisLinkParseResponse2.statusCode) != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    TiktokMinisLinkParseResponse tiktokMinisLinkParseResponse3 = networkResponse2.data;
                    String str3 = null;
                    if (tiktokMinisLinkParseResponse3 != null && (minisMeta = tiktokMinisLinkParseResponse3.minisMeta) != null) {
                        str2 = minisMeta.clientKey;
                    } else {
                        str2 = null;
                    }
                    JSONArray jSONArray = C2196361Axe.LIZ;
                    if (tiktokMinisLinkParseResponse3 != null && (minisLinkMeta = tiktokMinisLinkParseResponse3.minisLinkMeta) != null) {
                        str3 = minisLinkMeta.minisSchema;
                    }
                    C2196361Axe.LJFF(iOrdinal, str3, str2, iIntValue, jCurrentTimeMillis2, true);
                    InterfaceC1242560iRK interfaceC1242560iRK2 = interfaceC1242560iRK;
                    if (interfaceC1242560iRK2 != null) {
                        interfaceC1242560iRK2.LIZ(true, networkResponse2);
                    }
                }
            });
        }
    }

    @Override // com.bytedance.router.route.IRouteAction
    public Object open(final Context context, String str, Bundle bundle) {
        String string;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MinisRouteAction, open, url:");
        sbLIZ.append(str);
        sbLIZ.append(", extra:");
        C1227904rF.LIZ.getClass();
        sbLIZ.append(C1227904rF.LJI(bundle));
        C2188811AlT.LIZIZ(sbLIZ);
        if (bundle != null) {
            string = bundle.getString("minis_token", null);
            bundle.getString("minis_scene", null);
        } else {
            string = null;
        }
        final C2196441Axm c2196441Axm = new C2196441Axm(EnumC2196421Axk.FETCH_LINK, true, 0, "", 0L, 0L);
        c2196441Axm.setStartTime(System.currentTimeMillis());
        fetchMinisLinkParseData(context, string, new InterfaceC1242560iRK() { // from class: X.0iRM
            /* JADX WARN: Removed duplicated region for block: B:18:0x004e  */
            /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
            @Override // X.InterfaceC1242560iRK
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(boolean r7, com.ss.android.ugc.aweme.minis.model.NetworkResponse<com.ss.android.ugc.aweme.minis.model.TiktokMinisLinkParseResponse> r8) {
                /*
                    r6 = this;
                    int r0 = X.C2187451AjH.LIZ
                    java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
                    java.lang.String r0 = "isSuccess:"
                    r1.append(r0)
                    r1.append(r7)
                    java.lang.String r0 = ", resp:"
                    r1.append(r0)
                    X.04rF r0 = X.C1227904rF.LIZ
                    r0.getClass()
                    java.lang.String r0 = X.C1227904rF.LJI(r8)
                    r1.append(r0)
                    X.C2188811AlT.LIZIZ(r1)
                    X.1Axm r2 = r1
                    long r0 = java.lang.System.currentTimeMillis()
                    r2.setEndTime(r0)
                    if (r7 == 0) goto L77
                    if (r8 == 0) goto L77
                    r5 = 0
                    if (r8 == 0) goto L77
                    T r0 = r8.data
                    com.ss.android.ugc.aweme.minis.model.TiktokMinisLinkParseResponse r0 = (com.ss.android.ugc.aweme.minis.model.TiktokMinisLinkParseResponse) r0
                    if (r0 == 0) goto L78
                    com.ss.android.ugc.aweme.minis.model.MinisLinkMeta r0 = r0.minisLinkMeta
                    if (r0 == 0) goto L78
                    java.lang.String r2 = r0.minisSchema
                L3e:
                    T r0 = r8.data
                    com.ss.android.ugc.aweme.minis.model.TiktokMinisLinkParseResponse r0 = (com.ss.android.ugc.aweme.minis.model.TiktokMinisLinkParseResponse) r0
                    if (r0 == 0) goto L4c
                    com.ss.android.ugc.aweme.minis.model.MinisMeta r0 = r0.minisMeta
                    if (r0 == 0) goto L4c
                    com.ss.android.ugc.aweme.minis.model.MinisMetaResp r5 = X.C2196961Ayc.LIZ(r0)
                L4c:
                    if (r2 == 0) goto L77
                    X.1Axm r4 = r1
                    android.content.Context r1 = r2
                    r3 = 1
                    r4.setSuccess(r3)
                    r0 = 0
                    r4.setErrorCode(r0)
                    com.bytedance.router.SmartRoute r2 = com.bytedance.router.SmartRouter.buildRoute(r1, r2)
                    java.lang.String r1 = "enter_method"
                    java.lang.String r0 = "minis_link"
                    r2.withParam(r1, r0)
                    java.lang.String r0 = "is_from_token_app_link"
                    r2.withParam(r0, r3)
                    java.lang.String r0 = "minis_token_meta_data"
                    r2.withParam(r0, r5)
                    java.lang.String r0 = "perf_fetch_link"
                    r2.withParam(r0, r4)
                    r2.open()
                L77:
                    return
                L78:
                    r2 = r5
                    if (r8 == 0) goto L4c
                    goto L3e
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1242580iRM.LIZ(boolean, com.ss.android.ugc.aweme.minis.model.NetworkResponse):void");
            }
        });
        return Boolean.TRUE;
    }
}
