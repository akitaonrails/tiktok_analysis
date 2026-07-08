package com.ss.android.ugc.aweme.minis.service;

import X.C01GW;
import X.C09JN;
import X.C0PEM;
import X.C1017903yT;
import X.C11S5;
import X.C1304490k3D;
import X.C1720106oR;
import X.C1918407fK;
import X.C1DFH;
import X.C2107308Nj;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2195011AvT;
import X.C2195151Avh;
import X.C2195221Avo;
import X.C2196211AxP;
import X.C2196291AxX;
import X.C2196331Axb;
import X.C2196361Axe;
import X.C2196371Axf;
import X.C2196951Ayb;
import X.C2196961Ayc;
import X.C2296808zG;
import X.C23250099c;
import X.C452501pT;
import X.C786410Ut5;
import X.C844470XAv;
import X.EnumC1304510k3F;
import X.EnumC1386420mBM;
import X.EnumC2192711Arl;
import X.InterfaceC1006410cIR;
import Y.AfS197S0100000_28;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.minis.api.IMiniGameRenderService;
import com.ss.android.ugc.aweme.minis.common.SchemaParserData;
import com.ss.android.ugc.aweme.minis.model.MinisLinkMeta;
import com.ss.android.ugc.aweme.minis.model.MinisMeta;
import com.ss.android.ugc.aweme.minis.model.MinisMetaResp;
import com.ss.android.ugc.aweme.minis.model.NetworkResponse;
import com.ss.android.ugc.aweme.minis.model.TiktokMinisLinkParseResponse;
import com.ss.android.ugc.aweme.minis.route.MinisTokenRouteAction;
import com.ss.android.ugc.aweme.minis.settings.MinisTtmgConfigSettings;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AFwS225S0000000_34;
import kotlin.jvm.internal.AwS118S1000000_34;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes35.dex */
public final class MiniGameRenderServiceImpl implements IMiniGameRenderService {
    public static final ConcurrentHashMap<String, NetworkResponse<TiktokMinisLinkParseResponse>> LIZIZ = new ConcurrentHashMap<>();
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(86));

    public static boolean LIZJ(Uri uri) {
        Locale locale;
        String lowerCase;
        String host;
        String lowerCase2;
        List<String> pathSegments;
        String scheme = uri.getScheme();
        if (scheme == null || (lowerCase = scheme.toLowerCase((locale = Locale.ROOT))) == null) {
            return false;
        }
        if ((!Intrinsics.LJFF(lowerCase, "http") && !Intrinsics.LJFF(lowerCase, "https")) || (host = uri.getHost()) == null || (lowerCase2 = host.toLowerCase(locale)) == null) {
            return false;
        }
        if ((!Intrinsics.LJFF(lowerCase2, "tiktok.com") && !u.LJIIZILJ(lowerCase2, ".tiktok.com", false)) || (pathSegments = uri.getPathSegments()) == null || pathSegments.size() < 2 || !u.LJIJI("minis", (String) ListProtector.get(pathSegments, 0), true) || ((CharSequence) ListProtector.get(pathSegments, 1)).length() <= 0) {
            return false;
        }
        return true;
    }

    public static void LJ(SchemaParserData schemaParserData) {
        C844470XAv.LIZ.getClass();
        C2196951Ayb.LIZLLL(new C2196951Ayb((Application) C786410Ut5.N3(C844470XAv.LIZ())), schemaParserData, true, null, 4).LJJIJIIJI(C11S5.LIZ()).LJJIIZ(new C09JN() { // from class: X.0ylf
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("MiniGameRenderServiceImpl@ccfc.reportOpenUsage$1");
                C1C7U.LIZIZ("MiniGameRenderServiceImpl@ccfc.reportOpenUsage$1");
            }
        }, new AfS197S0100000_28(schemaParserData, 20));
    }

    public static Integer LJFF(Integer num) {
        if (num != null) {
            if (num.intValue() != EnumC1386420mBM.MINIS_STATUS_ONLINE.ordinal()) {
                if (num.intValue() == EnumC1386420mBM.MINIS_STATUS_OFFLINE.ordinal()) {
                    return 202;
                }
                if (num.intValue() == EnumC1386420mBM.MINIS_STATUS_NO_PERMISSION.ordinal()) {
                    return 203;
                }
                if (num.intValue() == EnumC1386420mBM.MINIS_STATUS_UNSUPPORTED_REGION.ordinal()) {
                    return 204;
                }
                if (num.intValue() == EnumC1386420mBM.MINIS_STATUS_AGE_LIMITATION.ordinal()) {
                    return 205;
                }
                return 206;
            }
            return null;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.minis.api.IMiniGameRenderService
    public final void LIZ(Activity activity, String str) {
        boolean z;
        TiktokMinisLinkParseResponse tiktokMinisLinkParseResponse;
        String str2;
        Uri uri = UriProtector.parse(str);
        if (!LIZJ(uri)) {
            SchemaParserData schemaParserData = new SchemaParserData(0);
            schemaParserData.LJIIL(uri);
            LJ(schemaParserData);
            SmartRouter.buildRoute(activity, str).open();
            return;
        }
        MinisTokenRouteAction.Companion.getClass();
        String strLIZ = C1918407fK.LIZ(uri);
        if (strLIZ.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("open, empty token from schema: ");
            sbLIZ.append(str);
            C1720106oR.LIZ("MiniGameRenderServiceImpl", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        NetworkResponse<TiktokMinisLinkParseResponse> networkResponse = LIZIZ.get(strLIZ);
        MinisMetaResp minisMetaRespLIZ = null;
        if (networkResponse != null && (tiktokMinisLinkParseResponse = networkResponse.data) != null) {
            MinisLinkMeta minisLinkMeta = tiktokMinisLinkParseResponse.minisLinkMeta;
            if (minisLinkMeta != null) {
                str2 = minisLinkMeta.minisSchema;
            } else {
                str2 = null;
                if (tiktokMinisLinkParseResponse != null) {
                }
                if (str2 != null && str2.length() != 0) {
                    SchemaParserData.Companion.getClass();
                    String strLIZIZ = C2196291AxX.LIZIZ(str2);
                    SchemaParserData schemaParserData2 = new SchemaParserData(0);
                    schemaParserData2.LJIIL(UriProtector.parse(strLIZIZ));
                    LJ(schemaParserData2);
                    SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(activity, strLIZIZ);
                    smartRouteBuildRoute.withParam("enter_method", "minis_link");
                    smartRouteBuildRoute.withParam("is_from_token_app_link", true);
                    smartRouteBuildRoute.withParam("enter_minis_token", strLIZ);
                    smartRouteBuildRoute.withParam("minis_token_meta_data", minisMetaRespLIZ);
                    smartRouteBuildRoute.open();
                    return;
                }
            }
            MinisMeta minisMeta = tiktokMinisLinkParseResponse.minisMeta;
            if (minisMeta != null) {
                minisMetaRespLIZ = C2196961Ayc.LIZ(minisMeta);
            }
            if (str2 != null) {
                SchemaParserData.Companion.getClass();
                String strLIZIZ2 = C2196291AxX.LIZIZ(str2);
                SchemaParserData schemaParserData22 = new SchemaParserData(0);
                schemaParserData22.LJIIL(UriProtector.parse(strLIZIZ2));
                LJ(schemaParserData22);
                SmartRoute smartRouteBuildRoute2 = SmartRouter.buildRoute(activity, strLIZIZ2);
                smartRouteBuildRoute2.withParam("enter_method", "minis_link");
                smartRouteBuildRoute2.withParam("is_from_token_app_link", true);
                smartRouteBuildRoute2.withParam("enter_minis_token", strLIZ);
                smartRouteBuildRoute2.withParam("minis_token_meta_data", minisMetaRespLIZ);
                smartRouteBuildRoute2.open();
                return;
            }
        }
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("open, cached linkResponse miss or minisSchema empty, token: ");
        sbLIZ2.append(strLIZ);
        C1720106oR.LIZ("MiniGameRenderServiceImpl", C2188811AlT.LIZIZ(sbLIZ2));
    }

    @Override // com.ss.android.ugc.aweme.minis.api.IMiniGameRenderService
    public final InterfaceC1006410cIR LIZIZ(Activity activity, String str) throws JSONException {
        String strLIZ;
        C2196331Axb.LIZ.getClass();
        C2196331Axb.LIZ(true);
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        Application application = (Application) C786410Ut5.N3(contextLIZ);
        Uri uri = UriProtector.parse(str);
        boolean zLIZJ = LIZJ(uri);
        if (zLIZJ) {
            MinisTokenRouteAction.Companion.getClass();
            strLIZ = C1918407fK.LIZ(uri);
        } else {
            strLIZ = null;
        }
        C1304490k3D c1304490k3D = new C1304490k3D(contextLIZ);
        if (c1304490k3D.LLIZ != EnumC1304510k3F.IDLE) {
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("initializeOffscreen called in invalid state: ");
            sbLIZ.append(c1304490k3D.LLIZ);
            C1720106oR.LIZ("MiniGameRenderView", C2188811AlT.LIZIZ(sbLIZ));
        } else {
            c1304490k3D.LIZ();
            c1304490k3D.LLIZ = EnumC1304510k3F.INITIALIZED;
        }
        C2195011AvT c2195011AvT = new C2195011AvT(c1304490k3D);
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("onMiniGameRenderInstanceCreated, render:");
        sbLIZ2.append(c2195011AvT);
        C2188811AlT.LIZIZ(sbLIZ2);
        C2195221Avo.LJI = new WeakReference<>(c2195011AvT);
        this.LIZ.getValue().getClass();
        C2196211AxP.LJI();
        if (zLIZJ && strLIZ != null && strLIZ.length() != 0) {
            c2195011AvT.LIZLLL = new AwS118S1000000_34(strLIZ, 0);
        }
        C2196371Axf c2196371Axf = new C2196371Axf(false, false, false, false, -1, C1017903yT.LIZ(), EnumC2192711Arl.MINIS_STAGE_PROD, new HashMap(), 0L, 0L, 0L, 0L, null, null);
        c2196371Axf.setFlowStartTime(System.currentTimeMillis());
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z = MinisTtmgConfigSettings.LIZ().enableMinisServiceLoadPerfRevamp;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C2195151Avh(c2195011AvT, this, application, str, uri, zLIZJ, z, c2196371Axf, jCurrentTimeMillis, activity, strLIZ, c1304490k3D, atomicBoolean, null), 3);
        return c2195011AvT;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(X.C1304490k3D r10, X.InterfaceC1364105Vn<? super java.lang.Boolean> r11) {
        /*
            Method dump skipped, instruction units count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.minis.service.MiniGameRenderServiceImpl.LIZLLL(X.0k3D, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0274  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJI(android.app.Application r14, java.lang.String r15, android.net.Uri r16, boolean r17, X.InterfaceC1364105Vn<? super X.C1871650ynz> r18) {
        /*
            Method dump skipped, instruction units count: 766
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.minis.service.MiniGameRenderServiceImpl.LJI(android.app.Application, java.lang.String, android.net.Uri, boolean, X.05Vn):java.lang.Object");
    }

    public static final boolean LJII(AtomicBoolean atomicBoolean, C2196371Axf c2196371Axf, boolean z, boolean z2, int i, SchemaParserData schemaParserData) {
        if (!atomicBoolean.compareAndSet(false, true)) {
            return false;
        }
        c2196371Axf.setSuccess(z2);
        c2196371Axf.setErrorCode(i);
        c2196371Axf.setFlowEndTime(System.currentTimeMillis());
        JSONArray jSONArray = C2196361Axe.LIZ;
        C2196361Axe.LJII(c2196371Axf, schemaParserData, null);
        if (z) {
            C2196361Axe.LJI(c2196371Axf, schemaParserData);
        }
        return true;
    }
}
