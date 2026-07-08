package com.ss.android.ugc.aweme.account.switchaccount;

import X.AbstractC848400XPy;
import X.C08QT;
import X.C08QU;
import X.C09RB;
import X.C0XQ5;
import X.C0XQ7;
import X.C0XUE;
import X.C0XUU;
import X.C123100dR;
import X.C13LP;
import X.C1913340ztE;
import X.C1939607ik;
import X.C19EG;
import X.C20684815ws;
import X.C2097908Jt;
import X.C2344009Gk;
import X.C486860J7k;
import X.C786410Ut5;
import X.C848230XPh;
import X.C849710XUz;
import X.DialogC1389620mGW;
import X.InterfaceC849490XUd;
import Y.AObserverS188S0200000_28;
import Y.ARunnableS101S0000000_28;
import Y.ARunnableS102S0100000_2;
import Y.ARunnableS128S0100000_28;
import android.app.Activity;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.account.experiment.ProfileTabDoubleTapSwitchConfig;
import com.ss.android.ugc.aweme.account.experiment.SwitchAccountGestureGuardSettings;
import com.ss.android.ugc.aweme.account.login.ViewPagerBottomSheetBehavior;
import com.ss.android.ugc.aweme.account.model.BaseLoginMethod;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.user.SignificantUserInfo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AFwS247S0000000_13;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes29.dex */
public final class ProfileTabDoubleClickHandlerImpl implements IProfileTabDoubleClickHandler {
    public WeakReference<Fragment> LIZ;
    public volatile long LIZJ;
    public final AtomicBoolean LIZIZ = new AtomicBoolean(false);
    public final BPEAHandler LIZLLL = new BPEAHandler(Looper.getMainLooper());
    public final ARunnableS102S0100000_2 LJ = new ARunnableS102S0100000_2(this, 13);

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    @Override // com.ss.android.ugc.aweme.account.switchaccount.IProfileTabDoubleClickHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZ() {
        /*
            r3 = this;
            java.lang.ref.WeakReference<androidx.fragment.app.Fragment> r0 = r3.LIZ
            if (r0 == 0) goto L4f
            java.lang.Object r0 = r0.get()
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            if (r0 == 0) goto L4f
            X.19EG r0 = r0.getActivity()
        L10:
            X.09Gk r2 = new X.09Gk
            r2.<init>()
            if (r0 == 0) goto L28
            com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager r0 = X.C486860J7k.LIZIZ(r0)
            java.lang.String r1 = r0.LLJJIJIL
            X.0rKY r0 = X.C1584320rKY.LIZ
            r0.getClass()
            java.lang.String r1 = X.C1584320rKY.LJI(r1)
            if (r1 != 0) goto L2a
        L28:
            java.lang.String r1 = ""
        L2a:
            java.lang.String r0 = "enter_from"
            r2.LJIIIIZZ(r0, r1)
            com.ss.android.ugc.aweme.AccountUserService r0 = X.C0XQ5.LIZ()
            java.util.List r0 = r0.LJJI()
            int r1 = r0.size()
            java.lang.String r0 = "account_cnt"
            r2.LIZJ(r1, r0)
            java.util.Map<java.lang.String, java.lang.String> r1 = r2.LIZ
            java.lang.String r0 = "double_tap_profile_tab"
            X.C20684815ws.LJIILLIIL(r0, r1)
            com.ss.android.ugc.aweme.user.SignificantUserInfo r0 = LIZJ()
            if (r0 == 0) goto L51
            r0 = 1
            return r0
        L4f:
            r0 = 0
            goto L10
        L51:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.switchaccount.ProfileTabDoubleClickHandlerImpl.LIZ():boolean");
    }

    public static SignificantUserInfo LIZJ() {
        String curUserId;
        List<String> listLJJI;
        Object next;
        long jLongValue;
        long jLongValue2;
        String str;
        if (ProfileTabDoubleTapSwitchConfig.LIZIZ() && C0XQ7.LIZJ().isEnableMultiAccountLogin() && ((AbstractC848400XPy) C0XQ7.LJFF()).isLogin() && (curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId()) != null && curUserId.length() != 0 && (listLJJI = ((AbstractC848400XPy) C0XQ7.LJFF()).LJJI()) != null) {
            ArrayList arrayList = new ArrayList();
            for (String str2 : listLJJI) {
                String str3 = str2;
                if (str3.length() > 0 && !Intrinsics.LJFF(str3, curUserId)) {
                    arrayList.add(str2);
                }
            }
            if (!arrayList.isEmpty()) {
                if (arrayList.size() == 1) {
                    str = (String) C13LP.LJJJJZI(arrayList);
                } else {
                    HashMap map = new HashMap();
                    JSONArray jSONArrayLIZ = C849710XUz.LIZ();
                    int length = jSONArrayLIZ.length();
                    for (int i = 0; i < length; i++) {
                        JSONObject jSONObjectOptJSONObject = jSONArrayLIZ.optJSONObject(i);
                        if (jSONObjectOptJSONObject != null) {
                            String strOptString = jSONObjectOptJSONObject.optString("uid", "");
                            if (strOptString.length() != 0) {
                                long jOptLong = jSONObjectOptJSONObject.optLong("ts", 0L);
                                Long l = (Long) map.get(strOptString);
                                if (l == null || jOptLong > l.longValue()) {
                                    map.put(strOptString, Long.valueOf(jOptLong));
                                }
                            }
                        }
                    }
                    JSONObject jSONObjectLIZIZ = C849710XUz.LIZIZ();
                    Iterator<String> itKeys = jSONObjectLIZIZ.keys();
                    while (itKeys.hasNext()) {
                        String next2 = itKeys.next();
                        if (next2 != null && next2.length() != 0) {
                            long jOptLong2 = jSONObjectLIZIZ.optLong(next2, 0L);
                            Long l2 = (Long) map.get(next2);
                            if (l2 == null || jOptLong2 > l2.longValue()) {
                                map.put(next2, Long.valueOf(jOptLong2));
                            }
                        }
                    }
                    C0XUE.LIZ.getClass();
                    C08QU c08quLJIIIZ = C09RB.LJIIIZ(new C1939607ik(C0XUE.LIZIZ), AFwS247S0000000_13.get$arr$(50));
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    C08QT c08qt = new C08QT(c08quLJIIIZ);
                    while (c08qt.hasNext()) {
                        Object next3 = c08qt.next();
                        String uid = ((BaseLoginMethod) next3).getUid();
                        Object arrayList2 = linkedHashMap.get(uid);
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                            linkedHashMap.put(uid, arrayList2);
                        }
                        ((List) arrayList2).add(next3);
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(C2097908Jt.LIZIZ(linkedHashMap.size()));
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        Object key = entry.getKey();
                        Iterator it2 = ((List) entry.getValue()).iterator();
                        if (!it2.hasNext()) {
                            throw new NoSuchElementException();
                        }
                        Long lastActiveTime = ((BaseLoginMethod) it2.next()).getLastActiveTime();
                        long jLongValue3 = lastActiveTime != null ? lastActiveTime.longValue() : Long.MIN_VALUE;
                        while (it2.hasNext()) {
                            Long lastActiveTime2 = ((BaseLoginMethod) it2.next()).getLastActiveTime();
                            long jLongValue4 = lastActiveTime2 != null ? lastActiveTime2.longValue() : Long.MIN_VALUE;
                            if (jLongValue3 < jLongValue4) {
                                jLongValue3 = jLongValue4;
                            }
                        }
                        linkedHashMap2.put(key, Long.valueOf(jLongValue3));
                    }
                    Iterator it3 = arrayList.iterator();
                    if (it3.hasNext()) {
                        next = it3.next();
                        if (it3.hasNext()) {
                            Long l3 = (Long) map.get(next);
                            if (l3 != null) {
                                jLongValue = l3.longValue();
                            } else {
                                Long l4 = (Long) linkedHashMap2.get(next);
                                jLongValue = l4 != null ? l4.longValue() : Long.MIN_VALUE;
                            }
                            do {
                                Object next4 = it3.next();
                                Long l5 = (Long) map.get(next4);
                                if (l5 != null) {
                                    jLongValue2 = l5.longValue();
                                } else {
                                    Long l6 = (Long) linkedHashMap2.get(next4);
                                    jLongValue2 = l6 != null ? l6.longValue() : Long.MIN_VALUE;
                                }
                                if (jLongValue < jLongValue2) {
                                    next = next4;
                                    jLongValue = jLongValue2;
                                }
                            } while (it3.hasNext());
                        }
                    } else {
                        next = null;
                    }
                    str = (String) next;
                }
                if (str != null && str.length() != 0) {
                    C0XQ5.LIZ().getClass();
                    if (str != null) {
                        C848230XPh.LL.getClass();
                        SignificantUserInfo significantUserInfoLJIIJJI = C848230XPh.LJIIJJI(str);
                        if (significantUserInfoLJIIJJI != null && C123100dR.LIZ(significantUserInfoLJIIJJI.vdc) && C123100dR.LIZ(significantUserInfoLJIIJJI.storeCountry) && C123100dR.LIZ(significantUserInfoLJIIJJI.sessionId)) {
                            return significantUserInfoLJIIJJI;
                        }
                    }
                    return null;
                }
            }
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.account.switchaccount.IProfileTabDoubleClickHandler
    public final void init(Fragment fragment) {
        Fragment fragment2;
        WeakReference<Fragment> weakReference = this.LIZ;
        if (weakReference != null) {
            fragment2 = weakReference.get();
        } else {
            fragment2 = null;
        }
        if (fragment2 == fragment) {
            return;
        }
        this.LIZ = new WeakReference<>(fragment);
        C19EG activity = fragment.getActivity();
        if (activity == null) {
            return;
        }
        ScrollSwitchStateManager scrollSwitchStateManagerLIZIZ = C486860J7k.LIZIZ(activity);
        scrollSwitchStateManagerLIZIZ.LLJJI.observe(fragment, new AObserverS188S0200000_28((Object) this, (View) fragment, (ViewPagerBottomSheetBehavior<View>) 2));
    }

    public final void LIZIZ(final C19EG c19eg, SignificantUserInfo significantUserInfo, final String str, String str2) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("enter_method", "double_tap");
        if (str2 == null) {
            str2 = "";
        }
        c2344009Gk.LJIIIIZZ("from_uid", str2);
        c2344009Gk.LJIIIIZZ("to_uid", significantUserInfo.uid);
        C20684815ws.LJIILLIIL("switch_account_submit", c2344009Gk.LIZ);
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("enter_from", str, bundle);
        C786410Ut5.LJJJI("enter_method", "double_tap", bundle);
        C1913340ztE.LIZ.getClass();
        if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            if (SwitchAccountGestureGuardSettings.LIZ().loadingEnabled && !c19eg.isFinishing() && !c19eg.isDestroyed()) {
                if (C1913340ztE.LIZJ != null) {
                    WeakReference<Activity> weakReference = C1913340ztE.LIZLLL;
                    if (weakReference == null || weakReference.get() != c19eg) {
                        C1913340ztE.LIZIZ();
                        DialogC1389620mGW dialogC1389620mGW = new DialogC1389620mGW(c19eg);
                        dialogC1389620mGW.setCancelable(false);
                        dialogC1389620mGW.LJJLIIJ(true);
                        C786410Ut5.J4(dialogC1389620mGW);
                        C1913340ztE.LIZJ = dialogC1389620mGW;
                        C1913340ztE.LIZLLL = new WeakReference<>(c19eg);
                    }
                } else {
                    try {
                        DialogC1389620mGW dialogC1389620mGW2 = new DialogC1389620mGW(c19eg);
                        dialogC1389620mGW2.setCancelable(false);
                        dialogC1389620mGW2.LJJLIIJ(true);
                        C786410Ut5.J4(dialogC1389620mGW2);
                        C1913340ztE.LIZJ = dialogC1389620mGW2;
                        C1913340ztE.LIZLLL = new WeakReference<>(c19eg);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        C1913340ztE.LIZ.getClass();
                        C1913340ztE.LIZJ = null;
                        C1913340ztE.LIZLLL = null;
                    }
                }
            }
        } else {
            C786410Ut5.LJJZZIII(C1913340ztE.LIZIZ, new ARunnableS128S0100000_28(c19eg, 98));
        }
        InterfaceC849490XUd interfaceC849490XUd = new InterfaceC849490XUd() { // from class: X.0ztF
            @Override // X.InterfaceC849490XUd
            public final void onSuccess() {
                C2344009Gk c2344009Gk2 = new C2344009Gk();
                c2344009Gk2.LJIIIIZZ("enter_from", str);
                c2344009Gk2.LJIIIIZZ("enter_method", "double_tap");
                c2344009Gk2.LIZJ(1, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
                C20684815ws.LJIILLIIL("switch_account_result", c2344009Gk2.LIZ);
                C1904920zfe.LIZJ(EnumC1904890zfb.DOUBLE_CLICK);
                this.LIZJ = SystemClock.elapsedRealtime();
                C1913340ztE.LIZ.getClass();
                if (!Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
                    C786410Ut5.LJJZZIII(C1913340ztE.LIZIZ, new ARunnableS101S0000000_28(1));
                } else if (C1913340ztE.LIZJ != null) {
                    long j = SwitchAccountGestureGuardSettings.LIZ().guardWindowMs;
                    if (j < 0) {
                        j = 0;
                    }
                    BPEAHandler bPEAHandler = C1913340ztE.LIZIZ;
                    RunnableC1913330ztD runnableC1913330ztD = C1913340ztE.LJ;
                    bPEAHandler.removeCallbacks(runnableC1913330ztD);
                    C786410Ut5.LJLIIL(j, bPEAHandler, runnableC1913330ztD);
                }
                this.LIZIZ.set(false);
            }

            /* JADX WARN: Removed duplicated region for block: B:18:0x0062  */
            /* JADX WARN: Removed duplicated region for block: B:23:0x007f  */
            @Override // X.InterfaceC849490XUd
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(java.lang.Integer r10, java.lang.String r11) {
                /*
                    r9 = this;
                    X.09Gk r3 = new X.09Gk
                    r3.<init>()
                    java.lang.String r1 = r1
                    java.lang.String r0 = "enter_from"
                    r3.LJIIIIZZ(r0, r1)
                    java.lang.String r1 = "double_tap"
                    java.lang.String r0 = "enter_method"
                    r3.LJIIIIZZ(r0, r1)
                    r4 = 0
                    java.lang.String r0 = "status"
                    r3.LIZJ(r4, r0)
                    r2 = -1
                    if (r10 == 0) goto L90
                    int r1 = r10.intValue()
                L20:
                    java.lang.String r0 = "fail_info"
                    r3.LIZJ(r1, r0)
                    java.util.Map<java.lang.String, java.lang.String> r1 = r3.LIZ
                    java.lang.String r0 = "switch_account_result"
                    X.C20684815ws.LJIILLIIL(r0, r1)
                    X.0ztE r0 = X.C1913340ztE.LIZ
                    r0.getClass()
                    X.C1913340ztE.LIZ()
                    if (r10 == 0) goto L42
                    int r1 = r10.intValue()
                    r0 = 1349(0x545, float:1.89E-42)
                    if (r1 == r0) goto L5a
                    int r2 = r10.intValue()
                L42:
                    r1 = 1
                    if (r2 <= 0) goto L62
                    if (r11 == 0) goto L62
                    int r0 = r11.length()
                    if (r0 == 0) goto L62
                    X.0mGx r1 = new X.0mGx
                    X.19EG r0 = r3
                    r1.<init>(r0)
                    r1.LJIIJ(r11)
                    r1.LJIIJJI()
                L5a:
                    com.ss.android.ugc.aweme.account.switchaccount.ProfileTabDoubleClickHandlerImpl r0 = r2
                    java.util.concurrent.atomic.AtomicBoolean r0 = r0.LIZIZ
                    r0.set(r4)
                    return
                L62:
                    java.lang.Class<com.ss.android.ugc.aweme.net.ui.INetworkStandardUIService> r3 = com.ss.android.ugc.aweme.net.ui.INetworkStandardUIService.class
                    r7 = 14
                    r8 = 0
                    r5 = r4
                    r6 = r4
                    java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r3, r4, r5, r6, r7, r8)
                    com.ss.android.ugc.aweme.net.ui.INetworkStandardUIService r0 = (com.ss.android.ugc.aweme.net.ui.INetworkStandardUIService) r0
                    if (r0 == 0) goto L7f
                    boolean r0 = r0.isStandardUIEnable()
                    if (r0 != r1) goto L7f
                    X.19EG r1 = r3
                    java.lang.String r0 = r1
                    X.C1257170iot.LIZIZ(r1, r0, r8, r8)
                    goto L5a
                L7f:
                    X.0mGx r1 = new X.0mGx
                    X.19EG r0 = r3
                    r1.<init>(r0)
                    r0 = 2131834217(0x7f113569, float:1.9301538E38)
                    r1.LJIIIZ(r0)
                    r1.LJIIJJI()
                    goto L5a
                L90:
                    r1 = -1
                    goto L20
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1913350ztF.LIZ(java.lang.Integer, java.lang.String):void");
            }
        };
        boolean zLJI = MethodIDManager.LJI(196714);
        C0XUU.LJ(significantUserInfo, bundle, false, false, interfaceC849490XUd);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }
}
