package com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.locationservices;

import X.AbstractC431340Gvk;
import X.C0HXM;
import X.C1206930hVr;
import X.C1207450hWh;
import X.C1207520hWo;
import X.C1308910kAL;
import X.C1388190mED;
import X.C1389890mGx;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C13LE;
import X.C13LP;
import X.C15438062q;
import X.C19719912Dl;
import X.C19741112Lp;
import X.C19EG;
import X.C20684815ws;
import X.C21566519ah;
import X.C21566819ak;
import X.C21566919al;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2217401BqU;
import X.C2344009Gk;
import X.C259800zU;
import X.C444920HcY;
import X.C452070Ho5;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C985403tE;
import X.DialogInterfaceOnClickListenerC1208800hYs;
import X.InterfaceC1207030hW1;
import X.InterfaceC2217461Bqa;
import X.InterfaceC724530SbT;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.locationservices.LocationServiceManagementSettings;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.locationservices.LocationServicesManager;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.locationservices.LocationServicesVM;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.port.in.IAVSettingService;
import com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS142S0201000_18;
import kotlin.jvm.internal.AwS158S0101000_18;
import kotlin.jvm.internal.AwS21S0010000_6;
import kotlin.jvm.internal.AwS30S1201000_18;
import kotlin.jvm.internal.AwS384S0200000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.AwS620S0100000_6;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes19.dex */
public final class LocationServicesManager {
    public static final LocationServicesManager LIZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LIZIZ;
    public static final String LIZJ;
    public static final String LIZLLL;
    public static WeakReference<LocationServicesVM> LJ;
    public static LifecycleEventObserver LJFF;

    static {
        C2217401BqU c2217401BqU = new C2217401BqU(LocationServicesManager.class, "vm", "<v#0>", 0);
        C13LE.LIZ.getClass();
        LIZIZ = new InterfaceC2217461Bqa[]{c2217401BqU};
        LIZ = new LocationServicesManager();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        LocationServiceManagementSettings.LocationServiceManagementModel locationServiceManagementModel = LocationServiceManagementSettings.LIZ;
        sbLIZ.append(locationServiceManagementModel.domain);
        sbLIZ.append("/%s/");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(strLIZIZ);
        sbLIZ2.append(locationServiceManagementModel.centerLocationPath);
        LIZJ = C2188811AlT.LIZIZ(sbLIZ2);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(strLIZIZ);
        sbLIZ3.append(locationServiceManagementModel.centerPath);
        LIZLLL = C2188811AlT.LIZIZ(sbLIZ3);
    }

    public static void LIZJ(C19EG c19eg) {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(LocationServicesVM.class);
        AssemVMLazy assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(c19eg, c19719912DlLIZ), new AwS562S0100000_18(c19719912DlLIZ, 139), new C452070Ho5(), C724750Sbp.LJII(c19eg), C724750Sbp.LJIIIZ(c19eg), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) c19eg, 140), AFwS256S0000000_18.get$arr$(48));
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LIZIZ;
        LJ = new WeakReference<>(assemVMLazy.getValue());
    }

    public static void LJ(Bundle bundle) {
        Object obj;
        Integer num;
        LocationServicesVM locationServicesVM;
        LocationServicesVM locationServicesVM2;
        WeakReference<LocationServicesVM> weakReference = LJ;
        Object obj2 = null;
        if (weakReference != null && (locationServicesVM2 = weakReference.get()) != null) {
            obj = locationServicesVM2.LLILZ.get("event");
        } else {
            obj = null;
        }
        if ((obj instanceof String) && obj != null) {
            WeakReference<LocationServicesVM> weakReference2 = LJ;
            if (weakReference2 != null && (locationServicesVM = weakReference2.get()) != null) {
                obj2 = locationServicesVM.LLILZ.get("gps_authorization");
            }
            if ((obj2 instanceof Integer) && (num = (Integer) obj2) != null) {
                int iIntValue = num.intValue();
                AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18(bundle, 141);
                AwS158S0101000_18 awS158S0101000_18 = new AwS158S0101000_18(iIntValue, bundle, 4);
                AwS562S0100000_18 awS562S0100000_182 = new AwS562S0100000_18(bundle, 142);
                if (Intrinsics.LJFF(obj, "system_location_setting_off_result")) {
                    awS562S0100000_18.invoke();
                } else if (Intrinsics.LJFF(obj, "system_location_device_setting_result")) {
                    awS158S0101000_18.invoke();
                } else {
                    awS562S0100000_182.invoke();
                }
            }
        }
    }

    public static void LJI(Context context) {
        LocationServicesVM locationServicesVM;
        C0HXM state;
        LocationServicesVM locationServicesVM2;
        Lifecycle lifecycle;
        LocationServicesVM locationServicesVM3;
        Lifecycle lifecycle2;
        LifecycleEventObserver lifecycleEventObserver;
        WeakReference<LocationServicesVM> weakReference = LJ;
        if (weakReference != null && (locationServicesVM3 = weakReference.get()) != null && (lifecycle2 = locationServicesVM3.getLifecycle()) != null && (lifecycleEventObserver = LJFF) != null) {
            lifecycle2.removeObserver(lifecycleEventObserver);
            LJFF = null;
        }
        C1206930hVr.LIZ.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from", "location_services_setting");
        linkedHashMap.put("enter_method", "click_gps_never");
        C20684815ws.LJIILLIIL("system_location_setting_off_show", linkedHashMap);
        WeakReference<LocationServicesVM> weakReference2 = LJ;
        if (weakReference2 != null && (locationServicesVM = weakReference2.get()) != null && (state = locationServicesVM.getState()) != null && state.LL) {
            C21566919al c21566919al = new C21566919al(context);
            c21566919al.LIZIZ = context.getResources().getString(2131839195);
            c21566919al.LIZJ = context.getResources().getString(2131839194);
            c21566919al.LJIIJJI(new DialogInterfaceOnClickListenerC1208800hYs(context, 0), context.getResources().getString(2131826361), true);
            c21566919al.LJIIJ = new C21566819ak(new DialogInterfaceOnClickListenerC1208800hYs(context, 1), context.getResources().getString(2131826362), false);
            c21566919al.LJII = false;
            c21566919al.LIZLLL(AFwS256S0000000_18.get$arr$(50));
            final C21566519ah c21566519ah = new C21566519ah(c21566919al);
            final WeakReference weakReference3 = new WeakReference(context);
            LJFF = new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.locationservices.LocationServicesManager$setUpNeverButtonClickEvent$5$1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    LocationServicesVM locationServicesVM4;
                    Lifecycle lifecycle3;
                    LocationServicesVM locationServicesVM5;
                    Context context2 = weakReference3.get();
                    if (context2 == null) {
                        return;
                    }
                    boolean zLJII = C1207450hWh.LIZ.LJII(0, context2);
                    if (event == Lifecycle.Event.ON_RESUME && !zLJII) {
                        WeakReference<LocationServicesVM> weakReference4 = LocationServicesManager.LJ;
                        if (weakReference4 != null && (locationServicesVM5 = weakReference4.get()) != null) {
                            locationServicesVM5.setState(new AwS21S0010000_6(false, 29));
                        }
                        c21566519ah.LIZIZ(null);
                        WeakReference<LocationServicesVM> weakReference5 = LocationServicesManager.LJ;
                        if (weakReference5 != null && (locationServicesVM4 = weakReference5.get()) != null && (lifecycle3 = locationServicesVM4.getLifecycle()) != null) {
                            lifecycle3.removeObserver(this);
                        }
                        LocationServicesManager.LJFF = null;
                        C1206930hVr c1206930hVr = C1206930hVr.LIZ;
                        Integer numValueOf = Integer.valueOf(zLJII ? 1 : 0);
                        AwS597S0100000_18 awS597S0100000_18 = new AwS597S0100000_18(context2, 64);
                        c1206930hVr.getClass();
                        C1206930hVr.LIZIZ("system_location_setting_off_result", "click_gps_never", numValueOf, awS597S0100000_18);
                    }
                }
            };
            WeakReference<LocationServicesVM> weakReference4 = LJ;
            if (weakReference4 != null && (locationServicesVM2 = weakReference4.get()) != null && (lifecycle = locationServicesVM2.getLifecycle()) != null) {
                lifecycle.addObserver(LJFF);
            }
            c21566519ah.LIZLLL();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v3 */
    public static void LJIIIIZZ(Context context) {
        LocationServicesVM locationServicesVM;
        Lifecycle lifecycle;
        List<String> listLJIIZILJ;
        LocationServicesVM locationServicesVM2;
        LocationServicesVM locationServicesVM3;
        Lifecycle lifecycle2;
        LifecycleEventObserver lifecycleEventObserver;
        WeakReference<LocationServicesVM> weakReference = LJ;
        T arrayList = 0;
        arrayList = 0;
        if (weakReference != null && (locationServicesVM3 = weakReference.get()) != null && (lifecycle2 = locationServicesVM3.getLifecycle()) != null && (lifecycleEventObserver = LJFF) != null) {
            lifecycle2.removeObserver(lifecycleEventObserver);
            LJFF = null;
        }
        boolean zLJII = C1207450hWh.LIZ.LJII(0, context);
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "location_services_setting");
        c2344009Gk.LIZJ(zLJII ? 1 : 0, "gps_authorization");
        C20684815ws.LJIILLIIL("open_device_settings", c2344009Gk.LIZ);
        C19741112Lp.LIZ.getClass();
        C19741112Lp.LJIIIZ(context, "android.permission.ACCESS_COARSE_LOCATION");
        WeakReference<LocationServicesVM> weakReference2 = LJ;
        if (weakReference2 != null && (locationServicesVM2 = weakReference2.get()) != null) {
            locationServicesVM2.LLILZ.put(locationServicesVM2.LL, "system_location_device_setting_result");
            locationServicesVM2.LLILZ.put(locationServicesVM2.LLILLL, Integer.valueOf(zLJII ? 1 : 0));
        }
        final C259800zU c259800zU = new C259800zU();
        ILocationBaseServiceForMT iLocationBaseServiceForMT = (ILocationBaseServiceForMT) PluggableExtentionKt.pluggableSpi$default(ILocationBaseServiceForMT.class, false, false, false, 14, null);
        if (iLocationBaseServiceForMT != null && (listLJIIZILJ = iLocationBaseServiceForMT.LJIIZILJ()) != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(listLJIIZILJ, 10));
            for (String str : listLJIIZILJ) {
                C19741112Lp.LIZ.getClass();
                arrayList.add(Boolean.valueOf(C19741112Lp.LIZLLL(context, str)));
            }
        }
        c259800zU.element = arrayList;
        final WeakReference weakReference3 = new WeakReference(context);
        LifecycleEventObserver lifecycleEventObserver2 = new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.locationservices.LocationServicesManager$setupOpenDevicesSettingsClickEvent$2
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v3, types: [X.09Gk] */
            /* JADX WARN: Type inference failed for: r7v0 */
            /* JADX WARN: Type inference failed for: r7v1, types: [int] */
            /* JADX WARN: Type inference failed for: r7v3 */
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                ?? LJII;
                ArrayList arrayList2;
                Boolean boolValueOf;
                LocationServicesVM locationServicesVM4;
                Lifecycle lifecycle3;
                LocationServicesVM locationServicesVM5;
                List<Boolean> list;
                List<String> listLJIIZILJ2;
                Context context2 = weakReference3.get();
                if (context2 == null) {
                    return;
                }
                C1207450hWh c1207450hWh = C1207450hWh.LIZ;
                boolean z = false;
                boolean zLJII2 = c1207450hWh.LJII(0, context2);
                if (event == Lifecycle.Event.ON_PAUSE) {
                    LJII = c1207450hWh.LJII(0, context2);
                } else {
                    LJII = 0;
                }
                if (event == Lifecycle.Event.ON_RESUME) {
                    ILocationBaseServiceForMT iLocationBaseServiceForMT2 = (ILocationBaseServiceForMT) PluggableExtentionKt.pluggableSpi$default(ILocationBaseServiceForMT.class, false, false, false, 14, null);
                    if (iLocationBaseServiceForMT2 != null && (listLJIIZILJ2 = iLocationBaseServiceForMT2.LJIIZILJ()) != null) {
                        arrayList2 = new ArrayList(C15438062q.LJIJJ(listLJIIZILJ2, 10));
                        for (String str2 : listLJIIZILJ2) {
                            C19741112Lp.LIZ.getClass();
                            arrayList2.add(Boolean.valueOf(C19741112Lp.LIZLLL(context2, str2)));
                        }
                    } else {
                        arrayList2 = null;
                    }
                    if (arrayList2 != null && (list = c259800zU.element) != null) {
                        ArrayList<Pair> arrayList3 = (ArrayList) C13LP.LLIILII(list, arrayList2);
                        if (!arrayList3.isEmpty()) {
                            for (Pair pair : arrayList3) {
                                if (((Boolean) pair.getFirst()).booleanValue() != ((Boolean) pair.getSecond()).booleanValue()) {
                                    break;
                                }
                            }
                            z = true;
                            boolValueOf = Boolean.valueOf(z);
                        } else {
                            z = true;
                            boolValueOf = Boolean.valueOf(z);
                        }
                    } else {
                        boolValueOf = null;
                    }
                    if (Intrinsics.LJFF(boolValueOf, Boolean.FALSE)) {
                        ?? c2344009Gk2 = new C2344009Gk();
                        c2344009Gk2.LJIIIIZZ("enter_from", "location_services_setting");
                        c2344009Gk2.LIZJ(LJII, "gps_authorization");
                        c2344009Gk2.LIZJ(1, "is_changed");
                        Map<String, String> map = c2344009Gk2.LIZ;
                        ILocationBaseServiceForMT iLocationBaseServiceForMT3 = (ILocationBaseServiceForMT) PluggableExtentionKt.pluggableSpi$default(ILocationBaseServiceForMT.class, false, false, false, 14, null);
                        if (iLocationBaseServiceForMT3 != null) {
                            iLocationBaseServiceForMT3.LJJIII(context2, map);
                        }
                        C20684815ws.LJIILLIIL("system_location_device_setting_result", map);
                        WeakReference<LocationServicesVM> weakReference4 = LocationServicesManager.LJ;
                        if (weakReference4 != null && (locationServicesVM5 = weakReference4.get()) != null) {
                            locationServicesVM5.setState(new AwS21S0010000_6(zLJII2, 29));
                        }
                        WeakReference<LocationServicesVM> weakReference5 = LocationServicesManager.LJ;
                        if (weakReference5 != null && (locationServicesVM4 = weakReference5.get()) != null && (lifecycle3 = locationServicesVM4.getLifecycle()) != null) {
                            lifecycle3.removeObserver(this);
                        }
                        LocationServicesManager.LJFF = null;
                    }
                }
            }
        };
        LJFF = lifecycleEventObserver2;
        WeakReference<LocationServicesVM> weakReference4 = LJ;
        if (weakReference4 != null && (locationServicesVM = weakReference4.get()) != null && (lifecycle = locationServicesVM.getLifecycle()) != null) {
            lifecycle.addObserver(lifecycleEventObserver2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0012  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJIIIZ(android.content.Context r9) {
        /*
            r5 = 0
            if (r9 == 0) goto L30
            boolean r3 = X.C1194170hBH.LIZ(r9)
        L7:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 31
            r2 = 1
            if (r1 >= r0) goto L18
            r1 = 1
        Lf:
            r0 = 0
        L10:
            if (r3 == 0) goto L17
            if (r1 != 0) goto L16
            if (r0 == 0) goto L17
        L16:
            r5 = 1
        L17:
            return r5
        L18:
            r1 = 0
            java.lang.Class<com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT> r4 = com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT.class
            r8 = 14
            r9 = 0
            r6 = r5
            r7 = r5
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r4, r5, r6, r7, r8, r9)
            com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT r0 = (com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT) r0
            if (r0 == 0) goto Lf
            boolean r0 = r0.LJIIL()
            if (r0 != r2) goto Lf
            r0 = 1
            goto L10
        L30:
            r3 = 0
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.locationservices.LocationServicesManager.LJIIIZ(android.content.Context):boolean");
    }

    public static C1389890mGx LIZIZ(Context context, LifecycleOwner lifecycleOwner) {
        Fragment fragment;
        Activity activityLIZ = C1388190mED.LIZ(context);
        if (activityLIZ != null) {
            return new C1389890mGx(activityLIZ);
        }
        if (!(lifecycleOwner instanceof Fragment) || (fragment = (Fragment) lifecycleOwner) == null) {
            return null;
        }
        return new C1389890mGx(fragment);
    }

    public static void LIZLLL(InterfaceC724530SbT interfaceC724530SbT, Function1 function1) {
        LocationServicesVM locationServicesVM;
        WeakReference<LocationServicesVM> weakReference = LJ;
        if (weakReference != null && (locationServicesVM = weakReference.get()) != null) {
            C736680Sv4.LJIIIIZZ(interfaceC724530SbT, locationServicesVM, new C2217381BqS() { // from class: X.0HXN
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Boolean.valueOf(((C0HXM) obj).LL);
                }
            }, null, new AwS620S0100000_6(function1, (Function1<? super Boolean, Unit>) 15), 6);
        }
    }

    public static void LJFF(Context context, LifecycleOwner lifecycleOwner) {
        String nickName;
        AccountUserService accountUserServiceLJIIJ;
        C1206930hVr.LIZ.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from", "location_services_setting");
        C20684815ws.LJIILLIIL("delete_location_history_show", linkedHashMap);
        C1397580mTM c1397580mTM = new C1397580mTM(context);
        c1397580mTM.LJII = false;
        c1397580mTM.LJI(context.getResources().getString(2131830536));
        String string = context.getResources().getString(2131844822);
        Object[] objArr = new Object[1];
        IAccountService iAccountService = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null);
        if (iAccountService != null && (accountUserServiceLJIIJ = iAccountService.LJIIJ()) != null) {
            nickName = accountUserServiceLJIIJ.getNickName();
        } else {
            nickName = "";
        }
        objArr[0] = nickName;
        c1397580mTM.LIZIZ(C786410Ut5.j4(string, Arrays.copyOf(objArr, 1)));
        C985403tE.LIZ(c1397580mTM, new AwS384S0200000_18(context, lifecycleOwner, 26));
        c1397580mTM.LIZLLL(AFwS256S0000000_18.get$arr$(49));
        new C1397510mTF(c1397580mTM).LIZLLL();
    }

    public static void LJII(Context context, String str) {
        LocationServicesVM locationServicesVM;
        C0HXM state;
        TokenCert tokenCertWith;
        Activity activity;
        LocationServicesVM locationServicesVM2;
        Lifecycle lifecycle;
        LifecycleEventObserver lifecycleEventObserver;
        WeakReference<LocationServicesVM> weakReference = LJ;
        if (weakReference != null && (locationServicesVM = weakReference.get()) != null && (state = locationServicesVM.getState()) != null && !state.LL) {
            WeakReference<LocationServicesVM> weakReference2 = LJ;
            if (weakReference2 != null && (locationServicesVM2 = weakReference2.get()) != null && (lifecycle = locationServicesVM2.getLifecycle()) != null && (lifecycleEventObserver = LJFF) != null) {
                lifecycle.removeObserver(lifecycleEventObserver);
                LJFF = null;
            }
            ILocationBaseServiceForMT iLocationBaseServiceForMT = (ILocationBaseServiceForMT) PluggableExtentionKt.pluggableSpi$default(ILocationBaseServiceForMT.class, false, false, false, 14, null);
            if (iLocationBaseServiceForMT != null && iLocationBaseServiceForMT.LJIILJJIL()) {
                tokenCertWith = TokenCert.Companion.with("bpea-location_services_request_permission_v2_for_precise");
            } else {
                tokenCertWith = TokenCert.Companion.with("bpea-location_services_request_permission_v2");
            }
            if ((context instanceof C19EG) && (activity = (Activity) context) != null) {
                C1207450hWh.LIZ.LJIJJ("poi", "location_services", tokenCertWith, activity, new C1207520hWo("location_services_setting", "click_gps_while_using", null, str, false, false, null, null, null, 500), new InterfaceC1207030hW1() { // from class: X.0hVp
                    @Override // X.InterfaceC1207030hW1
                    public final void LIZIZ(int i, String str2) {
                    }

                    @Override // X.InterfaceC1207030hW1
                    public final void LIZ() {
                        LocationServicesVM locationServicesVM3;
                        WeakReference<LocationServicesVM> weakReference3 = LocationServicesManager.LJ;
                        if (weakReference3 == null || (locationServicesVM3 = weakReference3.get()) == null) {
                            return;
                        }
                        locationServicesVM3.setState(new AwS21S0010000_6(true, 29));
                    }

                    @Override // X.InterfaceC1207030hW1
                    public final void LIZJ(int i) {
                        LocationServicesVM locationServicesVM3;
                        WeakReference<LocationServicesVM> weakReference3 = LocationServicesManager.LJ;
                        if (weakReference3 != null && (locationServicesVM3 = weakReference3.get()) != null) {
                            locationServicesVM3.setState(new AwS21S0010000_6(false, 29));
                        }
                    }
                }, null);
            }
        }
    }

    public static void LJIIJ(Context context, Bundle bundle) {
        Boolean boolValueOf;
        if (bundle != null) {
            if (context != null) {
                boolValueOf = Boolean.valueOf(C1207450hWh.LIZ.LJII(0, context));
            } else {
                boolValueOf = null;
            }
            boolean zLJFF = Intrinsics.LJFF(boolValueOf, Boolean.TRUE);
            String string = bundle.getString("event");
            if (string != null) {
                LocationServicesManager locationServicesManager = LIZ;
                AwS158S0101000_18 awS158S0101000_18 = new AwS158S0101000_18(context, zLJFF ? 1 : 0, 5);
                AwS142S0201000_18 awS142S0201000_18 = new AwS142S0201000_18(context, zLJFF ? 1 : 0, bundle, 1);
                AwS30S1201000_18 awS30S1201000_18 = new AwS30S1201000_18(zLJFF ? 1 : 0, context, bundle, string, 0);
                locationServicesManager.getClass();
                if (Intrinsics.LJFF(string, "system_location_setting_off_result")) {
                    awS158S0101000_18.invoke();
                } else if (Intrinsics.LJFF(string, "system_location_device_setting_result")) {
                    awS142S0201000_18.invoke();
                } else {
                    awS30S1201000_18.invoke();
                }
            }
        }
    }

    public static SpannableStringBuilder LIZ(final Context context, final LifecycleOwner lifecycleOwner, String str, String str2, final String str3) {
        final Integer numLIZJ;
        String strJ4 = C786410Ut5.j4(str, Arrays.copyOf(new Object[]{str2}, 1));
        SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(strJ4);
        int iLJJJ = a0.LJJJ(strJ4, str2, 0, false, 6);
        int length = str2.length() + iLJJJ;
        final Integer numLIZJ2 = null;
        if (context != null) {
            numLIZJ = C1308910kAL.LIZJ(R.attr.a1j, context);
            numLIZJ2 = C1308910kAL.LIZJ(R.attr.nd, context);
        } else {
            numLIZJ = null;
        }
        if (numLIZJ != null && numLIZJ2 != null) {
            C786410Ut5.q2(spannableStringBuilderValueOf, new AbstractC431340Gvk(numLIZJ, numLIZJ2, context, lifecycleOwner, str3) { // from class: X.0hVq
                public final /* synthetic */ Context LL;
                public final /* synthetic */ LifecycleOwner LLILLJJLI;
                public final /* synthetic */ String LLILLL;

                @Override // android.text.style.ClickableSpan
                public final void onClick(View view) {
                    String appLanguage;
                    try {
                        if (C036E.LIZ.LIZIZ()) {
                            IAVSettingService iAVSettingService = (IAVSettingService) PluggableExtentionKt.pluggableSpi$default(IAVSettingService.class, false, false, false, 14, null);
                            if (iAVSettingService == null || (appLanguage = iAVSettingService.getAppLanguage()) == null) {
                                appLanguage = "";
                            }
                            String strJ42 = C786410Ut5.j4(this.LLILLL, Arrays.copyOf(new Object[]{appLanguage}, 1));
                            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(this.LL, "aweme://webview");
                            smartRouteBuildRoute.withParam("url", strJ42);
                            smartRouteBuildRoute.withParam("title", "");
                            smartRouteBuildRoute.withParam("show_separate_line", true);
                            smartRouteBuildRoute.open();
                            return;
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    LocationServicesManager locationServicesManager = LocationServicesManager.LIZ;
                    Context context2 = this.LL;
                    LifecycleOwner lifecycleOwner2 = this.LLILLJJLI;
                    locationServicesManager.getClass();
                    C1389890mGx c1389890mGxLIZIZ = LocationServicesManager.LIZIZ(context2, lifecycleOwner2);
                    if (c1389890mGxLIZIZ != null) {
                        c1389890mGxLIZIZ.LJIIIZ(2131837962);
                        c1389890mGxLIZIZ.LJIIJJI();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(numLIZJ.intValue(), numLIZJ2.intValue());
                    this.LL = context;
                    this.LLILLJJLI = lifecycleOwner;
                    this.LLILLL = str3;
                }
            }, iLJJJ, length, 33);
        }
        C786410Ut5.q2(spannableStringBuilderValueOf, new C444920HcY(52, false), iLJJJ, length, 33);
        C786410Ut5.q2(spannableStringBuilderValueOf, new AbsoluteSizeSpan(14, true), iLJJJ, length, 33);
        return spannableStringBuilderValueOf;
    }
}
