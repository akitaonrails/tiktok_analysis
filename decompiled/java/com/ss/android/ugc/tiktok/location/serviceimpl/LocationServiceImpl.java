package com.ss.android.ugc.tiktok.location.serviceimpl;

import X.AbstractC1549150qPp;
import X.AbstractC20656215sG;
import X.AbstractC20660815t0;
import X.AbstractC738140SxQ;
import X.AbstractC838380Wui;
import X.C0C64;
import X.C0CCZ;
import X.C0P07;
import X.C0TFZ;
import X.C0TSW;
import X.C0WP5;
import X.C1201430hMz;
import X.C1201600hNG;
import X.C1202170hOB;
import X.C1207210hWJ;
import X.C1207340hWW;
import X.C1207520hWo;
import X.C1207670hX3;
import X.C1207680hX4;
import X.C1207700hX6;
import X.C1207720hX8;
import X.C1207750hXB;
import X.C1207770hXD;
import X.C1207800hXG;
import X.C1207820hXI;
import X.C1207850hXL;
import X.C1207880hXO;
import X.C1207920hXS;
import X.C1208010hXb;
import X.C1208030hXd;
import X.C1216920hly;
import X.C12Q8;
import X.C13IQ;
import X.C13LE;
import X.C13LP;
import X.C145T;
import X.C145Y;
import X.C1668306g5;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C1798550wu5;
import X.C19514511Wl;
import X.C19514711Wn;
import X.C19741112Lp;
import X.C1AG0;
import X.C1AUN;
import X.C1BYV;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2344809Gs;
import X.C238400w2;
import X.C2418809dq;
import X.C259800zU;
import X.C687980Qyi;
import X.C786410Ut5;
import X.C844470XAv;
import X.InterfaceC1207030hW1;
import X.InterfaceC1207440hWg;
import X.InterfaceC1207780hXE;
import X.InterfaceC19359210oY;
import X.InterfaceC19515111Wr;
import X.InterfaceC687820QyS;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.i18n.location.api.LocationData;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.poi_api.service.IPoiService;
import com.ss.android.ugc.tiktok.location.component.LocationFypGpsFetchComponent;
import com.ss.android.ugc.tiktok.location.task.InitLocationTask;
import com.ss.android.ugc.tiktok.location_api.service.Config;
import com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT;
import com.ss.android.ugc.tiktok.location_api.service.ILocationService;
import com.ss.android.ugc.tiktok.location_api.service.PermissionCache;
import com.ss.android.ugc.tiktok.location_api.service.PopupSceneV2;
import com.ss.android.ugc.tiktok.location_api.service.jsb.RequestLocationData;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS12S0300100_18;
import kotlin.jvm.internal.AwS21S0300100_18;
import kotlin.jvm.internal.AwS372S0200000_6;
import kotlin.jvm.internal.AwS56S0310000_18;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import org.json.JSONException;

/* JADX INFO: loaded from: classes19.dex */
public final class LocationServiceImpl implements ILocationService {
    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationService
    public final C13IQ<? extends AbstractC738140SxQ> LJIJI() {
        return C13LE.LIZ(LocationFypGpsFetchComponent.class);
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationService
    public final void LJIJJLI() {
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationService
    public final C0CCZ LJFF() {
        return new InitLocationTask();
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationService
    public final boolean LJIIJJI() {
        C1BYV.LIZ.getClass();
        return C1BYV.LIZLLL();
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationService
    public final List<Class<? extends AbstractC1549150qPp<?, ?>>> LJIILIIL() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(C1AUN.class);
        arrayList.add(C0TSW.class);
        arrayList.add(RequestLocationData.class);
        arrayList.add(C1AG0.class);
        arrayList.add(C2418809dq.class);
        arrayList.addAll(((IPoiService) ServiceManager.get().getService(IPoiService.class)).LJJIIZI());
        return arrayList;
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationService
    public final void LJIILJJIL() {
        C1207820hXI.LIZ.getClass();
        String str = C844470XAv.LJIIIIZZ.LIZ;
        if (TextUtils.isEmpty(str)) {
            C2344809Gs.LJFF("LocationInitializer", "Api host is null");
        } else if (u.LJJIIJZLJL(str, "https://", false)) {
        }
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationService
    public final Map<String, String> LIZ() {
        return ((ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class)).LIZ();
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationService
    public final boolean LJ() {
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "poi_add_location_optimization_ip", false) == 1;
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationService
    public final boolean LJIIZILJ() {
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "poi_add_location_optimization_precise", false) == 1;
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationService
    public final boolean LJIJ() {
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "poi_add_location_optimization_coarse", false) == 1;
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationService
    public final View LJIIJ(View view) {
        return view.findViewById(R.id.w2o);
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationService
    public final void LJIILL(C1202170hOB c1202170hOB) {
        if (C145T.LIZJ()) {
            c1202170hOB.invoke(0, null);
        } else {
            C1207820hXI.LIZ.LIZIZ(null, null, null, null, c1202170hOB, "manual");
        }
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationService
    public final boolean LJIL(String... strArr) {
        PermissionCache permissionCache = PermissionCache.LL;
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        permissionCache.getClass();
        return PermissionCache.LIZIZ(strArr2);
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationService
    public final View LIZJ(Context context, ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv) {
        return C786410Ut5.Td(C786410Ut5.ne(context), R.layout.dkc, viewOnAttachStateChangeListenerC20604515jv, false);
    }

    @Override // X.InterfaceC1207490hWl
    public final boolean LJI(String str, String str2) {
        C1207340hWW.LIZ.getClass();
        return C1207340hWW.LJI(str, str2);
    }

    @Override // X.InterfaceC1207490hWl
    public final boolean LJII(int i, Context context) {
        PermissionCache.LL.getClass();
        return PermissionCache.LIZIZ("android.permission.ACCESS_COARSE_LOCATION");
    }

    @Override // X.InterfaceC1207490hWl
    public final LocationData LJIIIIZZ(TokenCert tokenCert, TokenCert tokenCert2) {
        LocationData locationData;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getLastLocationSyncNew - business: ");
        sbLIZ.append("search");
        sbLIZ.append(", scene: ");
        sbLIZ.append("poi_biz");
        sbLIZ.append(",bpeaCert: ");
        sbLIZ.append(tokenCert);
        sbLIZ.append(", decryptCert: ");
        sbLIZ.append(tokenCert2);
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("LocationService", C2188811AlT.LIZIZ(sbLIZ));
        try {
            locationData = C1798550wu5.LIZIZ.LJIIJ(new C1216920hly(new C0TFZ(null, tokenCert, tokenCert2, 1), 0L, 0L, null, 62));
            if (locationData.LIZIZ()) {
                C0P07.LIZ.getClass();
                C0P07.LIZ(tokenCert, tokenCert2, locationData, "search", "poi_biz");
                return locationData;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("e = ");
            sbLIZ2.append(e.getMessage());
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("LocationService", C2188811AlT.LIZIZ(sbLIZ2));
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            locationData = new LocationData(0.0d, 0.0d, 0L, -999, message, 0, false, 0.0d, null, 0, null, null, null, null, null, null, null, null, null, 524263, null);
        }
        return locationData;
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationService
    public final void LJIIIZ(View view, boolean z) {
        View viewFindViewById;
        View viewFindViewById2;
        if (z) {
            if (view != null && (viewFindViewById2 = view.findViewById(R.id.fz3)) != null) {
                C786410Ut5.LJLLLLLL(0, viewFindViewById2);
                return;
            }
            return;
        }
        if (view == null || (viewFindViewById = view.findViewById(R.id.fz3)) == null) {
            return;
        }
        C786410Ut5.LJLLLLLL(8, viewFindViewById);
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationService
    public final void LJIILLIIL(Context context, View view, Function0 function0) {
        View viewFindViewById = view.findViewById(R.id.fz3);
        if (viewFindViewById != null) {
            C786410Ut5.LJLLLLLL(0, viewFindViewById);
        }
        C1749280vcc c1749280vcc = (C1749280vcc) view.findViewById(R.id.w2o);
        if (c1749280vcc != null) {
            C1722300uv6 c1722300uv6 = new C1722300uv6();
            c1722300uv6.LJI = context.getResources().getString(2131835151);
            c1722300uv6.LJIIIIZZ = context.getResources().getString(2131835149);
            c1722300uv6.LJIIIZ = new AwS372S0200000_6(context, (Context) function0, (Function0<Unit>) 95);
            c1749280vcc.setStatus(c1722300uv6);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from", "search_poi");
        C20684815ws.LJIILLIIL("show_location_banner", linkedHashMap);
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationService
    public final void LIZIZ(Fragment fragment, Aweme aweme, String str, boolean z) {
        InterfaceC1207780hXE c1207670hX3;
        if (aweme != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("recordFeedVVCount aid=");
            sbLIZ.append(str);
            sbLIZ.append(", isAd=");
            sbLIZ.append(z);
            C2188811AlT.LIZIZ(sbLIZ);
            if (C1207800hXG.LIZ == null) {
                if (!Intrinsics.LJFF(C1207720hX8.LIZ(), C1207720hX8.LIZ)) {
                    c1207670hX3 = new C1207700hX6();
                } else {
                    C1207680hX4.LIZ.getClass();
                    if (C1207680hX4.LIZ().enable != null) {
                        c1207670hX3 = new C1207670hX3();
                    } else {
                        c1207670hX3 = null;
                    }
                }
                C1207800hXG.LIZ = c1207670hX3;
            }
            InterfaceC1207780hXE interfaceC1207780hXE = C1207800hXG.LIZ;
            if (interfaceC1207780hXE != null) {
                interfaceC1207780hXE.LIZIZ(fragment, aweme, str, z);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJJ(final java.lang.String r18, final java.lang.String r19, final com.bytedance.bpea.basics.Cert r20, final com.bytedance.bpea.basics.Cert r21, final X.InterfaceC687820QyS r22, java.lang.Long r23) {
        /*
            r1 = 0
            r5 = r22
            long r6 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L3a
            if (r23 == 0) goto L13
            long r14 = r23.longValue()     // Catch: java.lang.Exception -> L3a
            r2 = 0
            int r0 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r0 >= 0) goto L16
        L13:
            r14 = 3600000(0x36ee80, double:1.7786363E-317)
        L16:
            X.0hly r10 = new X.0hly     // Catch: java.lang.Exception -> L3a
            X.0TFZ r11 = new X.0TFZ     // Catch: java.lang.Exception -> L3a
            r0 = 1
            r8 = r21
            r9 = r20
            r11.<init>(r1, r9, r8, r0)     // Catch: java.lang.Exception -> L3a
            r12 = 30000(0x7530, double:1.4822E-319)
            r17 = 56
            r16 = r1
            r10.<init>(r11, r12, r14, r16, r17)     // Catch: java.lang.Exception -> L3a
            X.0hOC r2 = new X.0hOC     // Catch: java.lang.Exception -> L3a
            r4 = r19
            r3 = r18
            r2.<init>()     // Catch: java.lang.Exception -> L3a
            com.bytedance.i18n.location.api.LocationClient r0 = X.C1798550wu5.LIZIZ     // Catch: java.lang.Exception -> L3a
            r0.LJIJ(r2, r10)     // Catch: java.lang.Exception -> L3a
            return
        L3a:
            r3 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3)
            java.lang.StringBuilder r2 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "Location fetch exception:"
            r2.append(r0)
            java.lang.String r0 = r3.getMessage()
            r2.append(r0)
            java.lang.String r2 = X.C2188811AlT.LIZIZ(r2)
            r0 = -1000(0xfffffffffffffc18, float:NaN)
            r5.onError(r0, r2)
            X.0hTX r0 = X.C1205490hTX.LIZ
            X.1EMR r2 = X.C1EMR.LS_FETCH_LOCATION
            r0.getClass()
            java.lang.String r0 = "-1000"
            X.C1205490hTX.LIZLLL(r2, r0, r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.tiktok.location.serviceimpl.LocationServiceImpl.LJJ(java.lang.String, java.lang.String, com.bytedance.bpea.basics.Cert, com.bytedance.bpea.basics.Cert, X.0QyS, java.lang.Long):void");
    }

    @Override // X.InterfaceC1207490hWl
    public final void LJIIL(final String str, final String str2, final Cert cert, final Cert cert2, final InterfaceC687820QyS interfaceC687820QyS, final Long l) {
        cert.attachCustomInfo("transmit_enable", Boolean.valueOf(C0WP5.LIZ));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fetchLocation - business: ");
        sbLIZ.append(str);
        sbLIZ.append(", scene: ");
        sbLIZ.append(str2);
        sbLIZ.append(",bepaCert: ");
        sbLIZ.append(cert);
        sbLIZ.append(", decryptCert: ");
        sbLIZ.append(cert2);
        sbLIZ.append(", cacheTime: ");
        sbLIZ.append(l);
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("LocationService", C2188811AlT.LIZIZ(sbLIZ));
        if (!LJIIJJI()) {
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("LocationService", "Locate now allowed");
            interfaceC687820QyS.onError(-999, "not allow to locate，You may not have agreed to location-related policy terms, or be in Guest Mode or Child Mode.");
            return;
        }
        if (!C1207770hXD.LIZ().useNewPlatform) {
            C1207340hWW.LIZ.getClass();
            if (!C1207340hWW.LJI(str, str2)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append('(');
                sbLIZ2.append(str);
                sbLIZ2.append(',');
                sbLIZ2.append(str2);
                sbLIZ2.append(") is not allow");
                interfaceC687820QyS.onError(-998, C2188811AlT.LIZIZ(sbLIZ2));
                return;
            }
        }
        try {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("location sdk init = ");
            sbLIZ3.append(C145T.LIZJ());
            sbLIZ3.append("  currentThread = ");
            sbLIZ3.append(C786410Ut5.u3().getName());
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("LocationService", C2188811AlT.LIZIZ(sbLIZ3));
            if (!C145T.LIZJ() && (C0C64.LJIILLIIL().LJIIIZ(31744, "location_force_init_experiment", true, true) || Looper.getMainLooper().getThread() == C786410Ut5.u3())) {
                C844470XAv.LIZ.getClass();
                C145T.LIZIZ(C844470XAv.LIZ(), new C145Y() { // from class: X.0hOA
                    @Override // X.C145Y
                    public final void LIZJ(String str3, boolean z) {
                        cert.attachCustomInfo("df_status", "finish_install");
                        C23250099c.LIZLLL(C2296808zG.LIZIZ(), null, null, new C1202150hO9(this, str, str2, cert, cert2, interfaceC687820QyS, l, null), 3);
                    }

                    @Override // X.C145Y
                    public final void LIZ(int i, String str3, boolean z) {
                        C23250099c.LIZLLL(C2296808zG.LIZIZ(), null, null, new C0IPZ(interfaceC687820QyS, null), 3);
                    }
                });
            } else {
                LJJ(str, str2, cert, cert2, interfaceC687820QyS, l);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("Location SDK init exception:");
            sbLIZ4.append(e.getMessage());
            interfaceC687820QyS.onError(-996, C2188811AlT.LIZIZ(sbLIZ4));
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("e = ");
            sbLIZ5.append(e.getMessage());
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("LocationService", C2188811AlT.LIZIZ(sbLIZ5));
        }
    }

    @Override // X.InterfaceC1207490hWl
    public final void LIZLLL(final TokenCert tokenCert, final Activity activity, Fragment fragment, final C1207520hWo c1207520hWo, final InterfaceC1207030hW1 interfaceC1207030hW1, final C687980Qyi c687980Qyi, final InterfaceC19359210oY interfaceC19359210oY) {
        String str;
        String str2;
        String str3;
        C1207750hXB.LIZ.getClass();
        if (PopupManager.LJI()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("fetchNew: popup showing, elementLabel: ");
            AbstractC20656215sG abstractC20656215sGLJ = PopupManager.LJ();
            String str4 = null;
            if (abstractC20656215sGLJ != null) {
                str = abstractC20656215sGLJ.elementLabel;
            } else {
                str = null;
            }
            sbLIZ.append(str);
            sbLIZ.append(" triggerId: ");
            AbstractC20656215sG abstractC20656215sGLJ2 = PopupManager.LJ();
            if (abstractC20656215sGLJ2 != null) {
                str2 = abstractC20656215sGLJ2.triggerId;
            } else {
                str2 = null;
            }
            sbLIZ.append(str2);
            C2188811AlT.LIZIZ(sbLIZ);
            C1207210hWJ c1207210hWJ = (C1207210hWJ) C1207750hXB.LIZJ.getValue();
            AbstractC20656215sG abstractC20656215sGLJ3 = PopupManager.LJ();
            if (abstractC20656215sGLJ3 != null) {
                str3 = abstractC20656215sGLJ3.elementLabel;
            } else {
                str3 = null;
            }
            AbstractC20656215sG abstractC20656215sGLJ4 = PopupManager.LJ();
            if (abstractC20656215sGLJ4 != null) {
                str4 = abstractC20656215sGLJ4.triggerId;
            }
            c1207210hWJ.LJJIFFI(null, str3, true, str4, null);
        }
        final C1208010hXb c1208010hXb = new C1208010hXb(tokenCert, activity, fragment);
        PopupManager.LJIJ(new AbstractC20660815t0(c1208010hXb) { // from class: X.0hX9
            @Override // X.InterfaceC20660515sx
            public final int getPriority() {
                return 210;
            }

            @Override // X.InterfaceC20659015si
            public final void LJFF(C688120Qyw c688120Qyw, final C20656615sK c20656615sK) {
                C1208030hXd c1208030hXd = new C1208030hXd(activity, c1207520hWo, tokenCert);
                final InterfaceC1207030hW1 interfaceC1207030hW12 = interfaceC1207030hW1;
                c1208030hXd.LIZ(new InterfaceC1207030hW1() { // from class: X.0hXA
                    @Override // X.InterfaceC1207030hW1
                    public final void LIZ() {
                        InterfaceC1207030hW1 interfaceC1207030hW13 = interfaceC1207030hW12;
                        if (interfaceC1207030hW13 != null) {
                            interfaceC1207030hW13.LIZ();
                        }
                        c20656615sK.LIZ();
                    }

                    @Override // X.InterfaceC1207030hW1
                    public final void LIZJ(int i) {
                        InterfaceC1207030hW1 interfaceC1207030hW13 = interfaceC1207030hW12;
                        if (interfaceC1207030hW13 != null) {
                            interfaceC1207030hW13.LIZJ(i);
                        }
                        c20656615sK.LIZ();
                    }

                    @Override // X.InterfaceC1207030hW1
                    public final void LIZIZ(int i, String str5) {
                        InterfaceC1207030hW1 interfaceC1207030hW13 = interfaceC1207030hW12;
                        if (interfaceC1207030hW13 != null) {
                            interfaceC1207030hW13.LIZIZ(i, str5);
                        }
                        c20656615sK.LIZ();
                    }
                }, c687980Qyi, interfaceC19359210oY);
            }

            @Override // X.AbstractC20656215sG
            public final void showPopupFailed(int i, String str5) {
                super.showPopupFailed(i, str5);
                C1207750hXB.LIZ.getClass();
                ((C1207210hWJ) C1207750hXB.LIZJ.getValue()).LJJIFFI(str5, null, PopupManager.LJI(), null, Integer.valueOf(i));
            }
        }, "location", new C1668306g5("local_permission_gps_general"));
    }

    @Override // X.InterfaceC1207490hWl
    public final void LJIJJ(final String str, final String str2, final Cert cert, final Activity activity, final C1207520hWo c1207520hWo, final InterfaceC1207030hW1 interfaceC1207030hW1, final InterfaceC1207440hWg interfaceC1207440hWg) throws JSONException {
        C1207750hXB.LIZ.getClass();
        if (!C1207750hXB.LIZIZ) {
            final C1201600hNG c1201600hNG = new C1201600hNG();
            C1207340hWW.LIZ.getClass();
            if (!C1207340hWW.LJI(str, str2)) {
                if (interfaceC1207030hW1 != null) {
                    interfaceC1207030hW1.LIZIZ(100, "this scene is not allow to apply for location permissions");
                    return;
                }
                return;
            }
            C19741112Lp.LIZ.getClass();
            if (C19741112Lp.LIZLLL(activity, "android.permission.ACCESS_COARSE_LOCATION")) {
                if (interfaceC1207030hW1 == null) {
                    return;
                }
                interfaceC1207030hW1.LIZ();
                return;
            }
            final long jCurrentTimeMillis = System.currentTimeMillis();
            List<String> listLJIIZILJ = ((ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class)).LJIIZILJ();
            final boolean zR4 = C786410Ut5.r4(activity, "android.permission.ACCESS_COARSE_LOCATION");
            final C259800zU c259800zU = new C259800zU();
            final C238400w2 c238400w2 = new C238400w2();
            c238400w2.element = System.currentTimeMillis();
            C19514711Wn c19514711WnLIZIZ = C19514711Wn.LIZIZ.LIZIZ(activity, cert);
            String[] strArr = (String[]) listLJIIZILJ.toArray(new String[0]);
            C19514511Wl c19514511WlLIZIZ = c19514711WnLIZIZ.LIZIZ((String[]) Arrays.copyOf(strArr, strArr.length));
            c19514511WlLIZIZ.LIZJ.LIZ(new AbstractC838380Wui() { // from class: X.0hWY
                /* JADX WARN: Type inference failed for: r0v14, types: [T, X.0hWf] */
                @Override // X.AbstractC838380Wui
                public final void LIZIZ(C19514611Wm c19514611Wm, C0HWO... c0hwoArr) {
                    List<PopupSceneV2> list;
                    PopupSceneV2 popupSceneV2LIZ;
                    String strLJJIIZ;
                    List<PopupSceneV2> list2;
                    PopupSceneV2 popupSceneV2LIZ2;
                    String str3;
                    String str4;
                    String str5;
                    String str6;
                    AwS56S0310000_18 awS56S0310000_18 = new AwS56S0310000_18(c19514611Wm, c238400w2, zR4, c1207520hWo, 1);
                    C1207340hWW c1207340hWW = C1207340hWW.LIZ;
                    String str7 = str;
                    String str8 = str2;
                    c1207340hWW.getClass();
                    if (C1207340hWW.LJII(str7, str8)) {
                        C1201600hNG c1201600hNG2 = c1201600hNG;
                        Activity activity2 = activity;
                        C1207520hWo c1207520hWo2 = c1207520hWo;
                        String str9 = str;
                        String str10 = str2;
                        Cert cert2 = cert;
                        InterfaceC1207030hW1 interfaceC1207030hW12 = interfaceC1207030hW1;
                        c1201600hNG2.getClass();
                        long jCurrentTimeMillis2 = System.currentTimeMillis();
                        String str11 = null;
                        if (C13LP.LJJJJ(cert2.certToken(), C1201430hMz.LIZIZ().openSettingsCertTokenList)) {
                            if (!C13LP.LJJJJ(cert2.certToken(), C1201430hMz.LIZIZ().prePopupCertTokenList)) {
                                awS56S0310000_18.invoke();
                                return;
                            }
                            AwS21S0300100_18 awS21S0300100_18 = new AwS21S0300100_18(activity2, jCurrentTimeMillis2, c1207520hWo2, awS56S0310000_18, 3);
                            AwS21S0300100_18 awS21S0300100_182 = new AwS21S0300100_18(activity2, jCurrentTimeMillis2, c1207520hWo2, interfaceC1207030hW12, 2);
                            C1201470hN3.LIZ.getClass();
                            C1201470hN3.LJFF(activity2, awS21S0300100_18, awS21S0300100_182);
                            C1207400hWc c1207400hWc = C1207400hWc.LIZ;
                            if (c1207520hWo2 != null) {
                                str5 = c1207520hWo2.LIZLLL;
                                str6 = c1207520hWo2.LIZ;
                                str11 = c1207520hWo2.LIZIZ;
                            } else {
                                str5 = null;
                                str6 = null;
                            }
                            c1207400hWc.getClass();
                            C1207400hWc.LJ(str5, str6, str11);
                            return;
                        }
                        C1397580mTM c1397580mTM = new C1397580mTM(activity2);
                        c1397580mTM.LJI(activity2.getResources().getString(2131850512));
                        c1397580mTM.LIZIZ(C1207340hWW.LJ(str9, str10));
                        c1397580mTM.LJII = false;
                        C1238130iKB.LIZ(c1397580mTM, new AwS12S0300100_18(activity2, jCurrentTimeMillis2, c1207520hWo2, awS56S0310000_18, 5));
                        new C1397510mTF(c1397580mTM).LIZLLL();
                        C1207400hWc c1207400hWc2 = C1207400hWc.LIZ;
                        if (c1207520hWo2 != null) {
                            str3 = c1207520hWo2.LIZLLL;
                            str4 = c1207520hWo2.LIZ;
                            str11 = c1207520hWo2.LIZIZ;
                        } else {
                            str3 = null;
                            str4 = null;
                        }
                        c1207400hWc2.getClass();
                        C1207400hWc.LJ(str3, str4, str11);
                        return;
                    }
                    awS56S0310000_18.invoke();
                    String str12 = str;
                    String str13 = str2;
                    Config configLIZIZ = C1207340hWW.LIZIZ(str12);
                    if (configLIZIZ == null || (list = configLIZIZ.popupSceneV2) == null || (popupSceneV2LIZ = C1207350hWX.LIZ(str13, list)) == null || popupSceneV2LIZ.popupUIType != EnumC1153630g7t.HINT.getType() || C1207340hWW.LJIILIIL(configLIZIZ)) {
                        return;
                    }
                    String strLJ = C1207340hWW.LJ(str, str2);
                    if (TextUtils.isEmpty(strLJ)) {
                        strLJ = activity.getString(2131844821);
                    }
                    String str14 = str;
                    String str15 = str2;
                    Config configLIZIZ2 = C1207340hWW.LIZIZ(str14);
                    if (configLIZIZ2 != null && (((list2 = configLIZIZ2.popupSceneV2) != null && (popupSceneV2LIZ2 = C1207350hWX.LIZ(str15, list2)) != null && popupSceneV2LIZ2.hidePopupTitle == 1) || C1207340hWW.LJIILIIL(configLIZIZ2))) {
                        strLJJIIZ = "";
                    } else {
                        strLJJIIZ = ((ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class)).LJJIIZ(activity);
                    }
                    c259800zU.element = C0JOG.LIZ(activity, strLJJIIZ, strLJ);
                }
            });
            c19514511WlLIZIZ.LIZJ(new InterfaceC19515111Wr() { // from class: X.0hWZ
                @Override // X.InterfaceC19515111Wr
                public final void onCanceled() {
                }

                /* JADX WARN: Removed duplicated region for block: B:177:0x0397  */
                /* JADX WARN: Removed duplicated region for block: B:180:0x03a8  */
                /* JADX WARN: Removed duplicated region for block: B:182:0x03b8  */
                @Override // X.InterfaceC19515111Wr
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void LIZ(X.C0HWO... r23) {
                    /*
                        Method dump skipped, instruction units count: 957
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1207370hWZ.LIZ(X.0HWO[]):void");
                }
            });
            return;
        }
        if (C1207770hXD.LIZ().useNewPlatform && C1207770hXD.LIZ().useNewRequestPermissions) {
            new C1208030hXd(activity, c1207520hWo, cert).LIZ(interfaceC1207030hW1, interfaceC1207440hWg, new C1207920hXS(c1207520hWo));
            return;
        }
        C1207850hXL c1207850hXL = new C1207850hXL(activity, c1207520hWo, cert);
        C19741112Lp.LIZ.getClass();
        if (C19741112Lp.LIZLLL(activity, "android.permission.ACCESS_COARSE_LOCATION")) {
            if (interfaceC1207030hW1 == null) {
                return;
            }
            interfaceC1207030hW1.LIZ();
            return;
        }
        List<String> listLJIIZILJ2 = ((ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class)).LJIIZILJ();
        c1207850hXL.LJFF = C786410Ut5.r4(activity, "android.permission.ACCESS_COARSE_LOCATION");
        c1207850hXL.LJII = interfaceC1207030hW1;
        if (C13LP.LJJJJ(cert.certToken(), C1201430hMz.LIZIZ().openSettingsCertTokenList) && (!C13LP.LJJJJ(r2, C1201430hMz.LIZIZ().prePopupCertTokenList))) {
            c1207850hXL.LJ.LJJJLZIJ(activity, (String[]) listLJIIZILJ2.toArray(new String[0]), cert, new C1207880hXO(c1207850hXL, interfaceC1207030hW1, interfaceC1207440hWg), null);
            return;
        }
        c1207850hXL.LJ.LJJJLZIJ(activity, (String[]) listLJIIZILJ2.toArray(new String[0]), cert, new C1207880hXO(c1207850hXL, interfaceC1207030hW1, interfaceC1207440hWg), (C12Q8) c1207850hXL.LJI.getValue());
    }
}
