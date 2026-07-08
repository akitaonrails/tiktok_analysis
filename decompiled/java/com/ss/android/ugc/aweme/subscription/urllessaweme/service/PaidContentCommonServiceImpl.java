package com.ss.android.ugc.aweme.subscription.urllessaweme.service;

import X.C04TD;
import X.C0C64;
import X.C1200604mq;
import X.C1200704mr;
import X.C1541950qED;
import X.C1608240rx8;
import X.C1608250rx9;
import X.C19EG;
import X.C20684815ws;
import X.C2097608Jq;
import X.C705420Rlk;
import X.C705480Rlq;
import X.C786410Ut5;
import X.InterfaceC1059280dfi;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.subscription.mainactivityassem.PGCSubsMainActivityAssem;
import com.ss.android.ugc.aweme.subscription.service.ISubscriptionCommonService;
import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS425S0200000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class PaidContentCommonServiceImpl implements ISubscriptionCommonService {
    public static ISubscriptionCommonService LIZ() {
        Object objLIZ = C04TD.LIZ(ISubscriptionCommonService.class, false);
        if (objLIZ != null) {
            return (ISubscriptionCommonService) objLIZ;
        }
        if (C04TD.H5 == null) {
            synchronized (ISubscriptionCommonService.class) {
                if (C04TD.H5 == null) {
                    C04TD.H5 = new PaidContentCommonServiceImpl();
                }
            }
        }
        return C04TD.H5;
    }

    @Override // com.ss.android.ugc.aweme.subscription.service.ISubscriptionCommonService
    public final PGCSubsMainActivityAssem LIZJ() {
        return new PGCSubsMainActivityAssem();
    }

    @Override // com.ss.android.ugc.aweme.subscription.service.ISubscriptionCommonService
    public final int LIZLLL(long j) {
        return C705420Rlk.LIZ(j);
    }

    @Override // com.ss.android.ugc.aweme.subscription.service.ISubscriptionCommonService
    public final void LJFF(String str) {
        C705480Rlq.LIZ.add(str);
    }

    @Override // com.ss.android.ugc.aweme.subscription.service.ISubscriptionCommonService
    public final boolean LJI(String str) {
        return C705480Rlq.LIZ(str);
    }

    @Override // com.ss.android.ugc.aweme.subscription.service.ISubscriptionCommonService
    public final boolean LJ(C19EG c19eg, String str) {
        String str2;
        C1200604mq c1200604mq;
        boolean z;
        View decorView;
        ViewGroup viewGroup;
        if (c19eg != null && str != null && str.length() != 0) {
            C1200704mr.LIZ.getClass();
            C1200604mq c1200604mq2 = C1200704mr.LIZIZ;
            if (c1200604mq2 != null) {
                str2 = c1200604mq2.LIZ;
            } else {
                str2 = null;
            }
            if (Intrinsics.LJFF(str2, str) && (c1200604mq = C1200704mr.LIZIZ) != null && C0C64.LJIILLIIL().LJIJ(31744, 0, "enable_pgc_iap_popup", true) == 1) {
                Keva keva = C1608240rx8.LIZ;
                Calendar calendar = Calendar.getInstance();
                Keva keva2 = C1608240rx8.LIZ;
                long j = keva2.getLong("subs_post_purchase_education_last_shown_time", 0L);
                Calendar calendar2 = Calendar.getInstance();
                calendar2.setTimeInMillis(j);
                int i = keva2.getInt("subs_post_purchase_education_total_show_count", 0);
                if (calendar.get(1) == calendar2.get(1) && calendar.get(6) == calendar2.get(6)) {
                    z = true;
                } else {
                    z = false;
                }
                if (i < 2 && !z) {
                    Window window = c19eg.getWindow();
                    if (window != null) {
                        decorView = window.getDecorView();
                    } else {
                        decorView = null;
                    }
                    if ((decorView instanceof ViewGroup) && (viewGroup = (ViewGroup) decorView) != null) {
                        final FrameLayout frameLayout = new FrameLayout(c19eg);
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                        layoutParams.gravity = 80;
                        viewGroup.addView(frameLayout, layoutParams);
                        C1608250rx9 c1608250rx9 = C1608250rx9.LIZ;
                        Map<String, Object> map = c1200604mq.LIZJ;
                        final AwS425S0200000_24 awS425S0200000_24 = new AwS425S0200000_24(viewGroup, frameLayout, 79);
                        c1608250rx9.getClass();
                        final Map mapLJIIZILJ = C2097608Jq.LJIIZILJ(map);
                        SparkContext sparkContext = new SparkContext();
                        sparkContext.LJJLIIJ("aweme://roma_redirect/?spark_page=pgc_iap_components_container&roma_group_key=spark_page_pgc_iap_components_container&roma_page_key=p&scene=post_purchase_education&business_line=2");
                        sparkContext.usePreload = true;
                        sparkContext.LJJLIIIJILLIZJL(new LinkedHashMap(mapLJIIZILJ));
                        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ = C1608250rx9.LIZIZ;
                        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ == null) {
                            C1541950qED.LIZJ.getClass();
                            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ = new C1541950qED(c19eg, sparkContext).LIZ(false);
                            C1608250rx9.LIZIZ = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ;
                        }
                        C786410Ut5.LJLZ(0, frameLayout);
                        C786410Ut5.LJJJJI(frameLayout);
                        SparkContext sparkContext2 = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ.getSparkContext();
                        if (sparkContext2 != null) {
                            sparkContext2.LJJJJJ(new InterfaceC1059280dfi() { // from class: X.0rx7
                                @Override // X.InterfaceC1059280dfi
                                public final void m3(boolean z2) {
                                }

                                @Override // X.InterfaceC1051240dSk
                                public final void refresh() {
                                }

                                @Override // X.InterfaceC1059280dfi
                                public final void close() {
                                    C786410Ut5.LJJJJI(frameLayout);
                                    C786410Ut5.LJLZ(8, frameLayout);
                                    C1608250rx9.LIZ.getClass();
                                    SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = C1608250rx9.LIZIZ;
                                    if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
                                        boolean z2 = SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLLILZJ;
                                        sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJJ(true);
                                    }
                                    C1608250rx9.LIZIZ = null;
                                    C20684815ws.LJIILLIIL("subs_post_purchase_education_click_got_it", C1608250rx9.LIZ(mapLJIIZILJ));
                                    C20684815ws.LJIILLIIL("subs_post_purchase_education_dismiss", C1608250rx9.LIZ(mapLJIIZILJ));
                                    awS425S0200000_24.invoke();
                                }
                            });
                        }
                        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ.getParent() instanceof ViewGroup) {
                            C786410Ut5.LJJJLZIJ(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ, (ViewGroup) sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ.getParent());
                        }
                        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
                        layoutParams2.gravity = 80;
                        frameLayout.addView(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ, layoutParams2);
                        C786410Ut5.LLLLIIIILLL(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ, 0);
                        C20684815ws.LJIILLIIL("subs_post_purchase_education_show", C1608250rx9.LIZ(mapLJIIZILJ));
                        sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ.LJIIIIZZ();
                        keva2.storeInt("subs_post_purchase_education_total_show_count", keva2.getInt("subs_post_purchase_education_total_show_count", 0) + 1);
                        keva2.storeLong("subs_post_purchase_education_last_shown_time", System.currentTimeMillis());
                        C1200704mr.LIZIZ = null;
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
