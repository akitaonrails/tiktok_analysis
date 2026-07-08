package com.ss.android.ugc.aweme.service.proactive;

import X.AbstractC848400XPy;
import X.AnonymousClass0583;
import X.C01GW;
import X.C0PEM;
import X.C0XQ7;
import X.C10H6;
import X.C10H7;
import X.C1196104m7;
import X.C13BV;
import X.C13E8;
import X.C15438062q;
import X.C1697810uHb;
import X.C19EG;
import X.C20012813Sc;
import X.C20684815ws;
import X.C2296808zG;
import X.C23250099c;
import X.C2344009Gk;
import X.C255730A0l;
import X.C257300z5;
import X.C306400Bzi;
import X.C452501pT;
import X.C7740030o;
import X.C823050WQl;
import X.C848800XRm;
import X.EnumC20027813Xw;
import android.app.Activity;
import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.service.proactive.ProactiveLoginConfig;
import com.ss.android.ugc.aweme.service.proactive.ProactiveTriggerLocalCache;
import com.ss.android.ugc.aweme.service.proactive.ProactiveTriggersService;
import com.ss.android.ugc.aweme.utils.GsonProvider;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AwS574S0100000_30;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes31.dex */
public final class ProactiveTriggersService implements IProactiveTriggersService {
    public final Map<EnumC20027813Xw, C13E8<Long>> LIZ;
    public final C13E8<Long> LIZIZ;
    public final Boolean LIZJ;
    public ProactiveLoginConfig LIZLLL;
    public C13E8<String> LJ;
    public boolean LJFF;
    public boolean LJI;
    public Long LJII;
    public final List<Long> LJIIIIZZ;
    public final List<Long> LJIIIZ;
    public final IAccountService LJIIJ;
    public final C01GW LJIIJJI;

    @Override // com.ss.android.ugc.aweme.service.proactive.IProactiveTriggersService
    public final void LIZLLL() {
        C13E8<Long> c13e8 = this.LIZIZ;
        if (c13e8 != null) {
            int iMax = Math.max(this.LIZLLL.vv, 1) + 1;
            c13e8.addFirst(Long.valueOf(System.currentTimeMillis()));
            if (c13e8.size() > iMax) {
                c13e8.removeLast();
            }
            if (c13e8.size() == this.LIZLLL.vv) {
                C20684815ws.onEventV3("proactive_login_pass_vv_check");
            }
            LJIJI();
        }
    }

    @Override // com.ss.android.ugc.aweme.service.proactive.IProactiveTriggersService
    public final void LJII() {
        String str = new SimpleDateFormat("yyyy/MM/dd", Locale.getDefault()).format(Long.valueOf(new Date().getTime()));
        C13E8<String> c13e8 = this.LJ;
        if (c13e8 == null) {
            c13e8 = new C13E8<>();
        }
        c13e8.addFirst(str);
        if (c13e8.size() > 3) {
            c13e8.removeLast();
        }
        LJIJI();
        this.LJ = c13e8;
    }

    @Override // com.ss.android.ugc.aweme.service.proactive.IProactiveTriggersService
    public final void LJIILIIL() {
        PopupManager.LIZJ(C848800XRm.class);
    }

    public final Keva LJIIZILJ() {
        return (Keva) this.LJIIJJI.getValue();
    }

    public ProactiveTriggersService() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.LIZ = linkedHashMap;
        this.LIZLLL = new ProactiveLoginConfig(CardStruct.IStatusCode.DEFAULT, -1, 8, -1, -1);
        this.LJIIIIZZ = new ArrayList();
        this.LJIIIZ = new ArrayList();
        this.LJIIJ = (IAccountService) ServiceManager.get().getService(IAccountService.class);
        this.LJIIJJI = C452501pT.LIZIZ(new C1196104m7());
        String string = LJIIZILJ().getString("ProactiveTriggersService", "");
        if (TextUtils.isEmpty(string)) {
            this.LIZIZ = new C13E8<>(this.LIZLLL.vv);
            this.LIZJ = Boolean.TRUE;
        } else {
            try {
                ProactiveTriggerLocalCache proactiveTriggerLocalCache = (ProactiveTriggerLocalCache) ((GsonProvider) ServiceManager.get().getService(GsonProvider.class)).getGson().LJII(string, ProactiveTriggerLocalCache.class);
                if (proactiveTriggerLocalCache != null) {
                    Object obj = proactiveTriggerLocalCache.allLoginTriggerRecords;
                    linkedHashMap.putAll(obj == null ? new LinkedHashMap() : obj);
                    this.LIZIZ = proactiveTriggerLocalCache.userVVRecords;
                    this.LIZJ = proactiveTriggerLocalCache.isFirstTime;
                    ProactiveLoginConfig proactiveLoginConfig = this.LIZLLL;
                    String str = proactiveLoginConfig.decision;
                    int i = proactiveLoginConfig.design;
                    int i2 = proactiveLoginConfig.vv;
                    Integer num = proactiveTriggerLocalCache.minHoursIntervalLoginPanel;
                    Integer numValueOf = Integer.valueOf(num != null ? num.intValue() : -1);
                    Integer num2 = proactiveTriggerLocalCache.dayLimitLoginPanel;
                    this.LIZLLL = new ProactiveLoginConfig(str, i, i2, numValueOf, Integer.valueOf(num2 != null ? num2.intValue() : -1));
                    this.LJ = proactiveTriggerLocalCache.downloadRecords;
                } else {
                    this.LIZIZ = new C13E8<>(this.LIZLLL.vv);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                this.LIZIZ = new C13E8<>(this.LIZLLL.vv);
                this.LIZJ = Boolean.TRUE;
            }
        }
        C13E8<Long> c13e8 = this.LIZIZ;
        if (c13e8 != null) {
            Calendar calendar = Calendar.getInstance();
            long timeInMillis = calendar.getTimeInMillis() - (((long) (((calendar.get(11) * 60) + (calendar.get(12) * 60)) + calendar.get(13))) * 1000);
            while (c13e8.size() > 0 && c13e8.last().longValue() < timeInMillis) {
                c13e8.removeLast();
            }
            if (c13e8.size() >= this.LIZLLL.vv) {
                C20684815ws.onEventV3("proactive_login_pass_vv_check");
            }
        }
        List<Long> list = this.LJIIIIZZ;
        String string2 = LJIIZILJ().getString("enter_profile_records", "");
        ((ArrayList) list).addAll(TextUtils.isEmpty(string2) ? new C13E8() : (Collection) GsonProtectorUtils.fromJson(C7740030o.LIZ().getGson(), string2, new TypeToken<List<? extends Long>>() { // from class: X.04aD
        }.getType()));
        List<Long> list2 = this.LJIIIZ;
        String string3 = LJIIZILJ().getString("enter_search_records", "");
        ((ArrayList) list2).addAll(TextUtils.isEmpty(string3) ? C13BV.INSTANCE : (Collection) GsonProtectorUtils.fromJson(C7740030o.LIZ().getGson(), string3, new TypeToken<List<? extends Long>>() { // from class: X.04aE
        }.getType()));
    }

    @Override // com.ss.android.ugc.aweme.service.proactive.IProactiveTriggersService
    public final boolean LJ() {
        int i;
        if (((AbstractC848400XPy) C0XQ7.LJFF()).isLogin() || C255730A0l.LIZ() == 0) {
            return false;
        }
        String str = new SimpleDateFormat("yyyy/MM/dd", Locale.getDefault()).format(Long.valueOf(new Date().getTime()));
        C13E8<String> c13e8 = this.LJ;
        if (c13e8 != null) {
            if (c13e8.isEmpty()) {
                i = 0;
            } else {
                Iterator<String> it2 = c13e8.iterator();
                i = 0;
                while (it2.hasNext()) {
                    if (Intrinsics.LJFF(it2.next(), str) && (i = i + 1) < 0) {
                        C1697810uHb.LJIJ();
                        throw null;
                    }
                }
            }
            if (C255730A0l.LIZ() == 1 || C255730A0l.LIZ() == 2 ? i == 2 : i == 3) {
                Map<EnumC20027813Xw, C13E8<Long>> map = this.LIZ;
                if (C20012813Sc.LIZIZ(map)) {
                    if (map != null) {
                        C13E8 c13e82 = (C13E8) ((LinkedHashMap) map).get(EnumC20027813Xw.PROACTIVE_LOGIN_AFTER_DOWNLOAD);
                        if (c13e82 != null) {
                            if (c13e82.size() < 3) {
                                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(c13e82, 10));
                                Iterator<E> it3 = c13e82.iterator();
                                while (it3.hasNext()) {
                                    arrayList.add(C257300z5.LIZIZ(((Number) it3.next()).longValue()));
                                }
                                String strLIZIZ = C257300z5.LIZIZ(System.currentTimeMillis());
                                if (arrayList.size() >= 1) {
                                    if (!Intrinsics.LJFF(ListProtector.get(arrayList, 0), strLIZIZ)) {
                                        if ((C255730A0l.LIZ() == 2 || C255730A0l.LIZ() == 4) && arrayList.size() >= 2 && ((Number) c13e82.get(1)).longValue() + (((long) 7) * 86400000) >= System.currentTimeMillis()) {
                                            return false;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.service.proactive.IProactiveTriggersService
    public final boolean LJIIIZ() {
        if (((AbstractC848400XPy) C0XQ7.LJFF()).isLogin() || C306400Bzi.LIZ() != 4 || !this.LJI) {
            return false;
        }
        if (LJIIZILJ().getBoolean("did_click_share", false)) {
            return C20012813Sc.LIZ(this.LIZ);
        }
        if (!LJIIZILJ().contains("did_click_share")) {
            LJIIZILJ().storeBoolean("did_click_share", true);
        }
        return false;
    }

    public final void LJIJI() {
        C823050WQl.LIZIZ().submit(new Runnable() { // from class: X.13vb
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("ProactiveTriggersService@d7fd.persistRecords$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("ProactiveTriggersService@d7fd.persistRecords$1");
            }

            public final void LIZ() {
                Gson gson = C7740030o.LIZ().getGson();
                ProactiveTriggersService proactiveTriggersService = this.LL;
                Map<EnumC20027813Xw, C13E8<Long>> map = proactiveTriggersService.LIZ;
                C13E8<Long> c13e8 = proactiveTriggersService.LIZIZ;
                Boolean bool = proactiveTriggersService.LIZJ;
                ProactiveLoginConfig proactiveLoginConfig = proactiveTriggersService.LIZLLL;
                String json = GsonProtectorUtils.toJson(gson, new ProactiveTriggerLocalCache(map, c13e8, bool, proactiveLoginConfig.minHoursIntervalLoginPanel, proactiveLoginConfig.dayLimitLoginPanel, proactiveTriggersService.LJ));
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("userVVRecords: ");
                C13E8<Long> c13e82 = this.LL.LIZIZ;
                sbLIZ.append(c13e82 != null ? Integer.valueOf(c13e82.size()) : null);
                sbLIZ.append(": ");
                sbLIZ.append(this.LL.LIZIZ);
                C2188811AlT.LIZIZ(sbLIZ);
                this.LL.LJIIZILJ().storeString("ProactiveTriggersService", json);
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.service.proactive.IProactiveTriggersService
    public final boolean LIZ(boolean z) {
        Long l;
        if ((C306400Bzi.LIZ() != 2 && C306400Bzi.LIZ() != 3) || ((AbstractC848400XPy) C0XQ7.LJFF()).isLogin() || !this.LJI || !this.LJFF) {
            return false;
        }
        if (z) {
            Long l2 = this.LJII;
            C13E8<Long> c13e8 = this.LIZIZ;
            if (c13e8 != null) {
                l = c13e8.get(0);
            } else {
                l = null;
            }
            if (!Intrinsics.LJFF(l2, l)) {
                return false;
            }
        }
        if (C20012813Sc.LIZ(this.LIZ)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.service.proactive.IProactiveTriggersService
    public final void LIZIZ(String str) {
        this.LJI = Intrinsics.LJFF(str, "homepage_hot");
    }

    @Override // com.ss.android.ugc.aweme.service.proactive.IProactiveTriggersService
    public final void LIZJ(C19EG c19eg) {
        if (!(c19eg instanceof C19EG) || ((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            return;
        }
        C10H7.LIZ.getClass();
        if (!C10H7.LIZIZ) {
            return;
        }
        ((ArrayList) this.LJIIIZ).add(Long.valueOf(System.currentTimeMillis()));
        if (((ArrayList) this.LJIIIZ).size() > 5) {
            ListProtector.remove(this.LJIIIZ, 0);
        }
        LJIIZILJ().storeString("enter_search_records", GsonProtectorUtils.toJson(C7740030o.LIZ().getGson(), this.LJIIIZ));
        if (C257300z5.LIZ(this.LJIIIZ) == C10H7.LIZJ) {
            Map<EnumC20027813Xw, C13E8<Long>> map = this.LIZ;
            if (C20012813Sc.LIZIZ(map)) {
                if (map != null) {
                    C13E8 c13e8 = (C13E8) ((LinkedHashMap) map).get(EnumC20027813Xw.PROACTIVE_LOGIN_ON_SEARCH_PAGE);
                    if (c13e8 != null && (!c13e8.isEmpty()) && ((Number) c13e8.get(0)).longValue() + (((long) C10H7.LIZLLL) * 86400000) > System.currentTimeMillis()) {
                        return;
                    }
                }
                PopupManager.LJIJI(new C848800XRm(c19eg, "search_result", "proactive_search", c19eg.getString(2131845262), c19eg.getString(2131845262), null, 0.7d, null, new AwS574S0100000_30(this, 94), 160), true);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.service.proactive.IProactiveTriggersService
    public final void LJFF(String str) {
        this.LJFF = Intrinsics.LJFF(str, "homepage_hot");
    }

    @Override // com.ss.android.ugc.aweme.service.proactive.IProactiveTriggersService
    public final void LJIIJ(C19EG c19eg) {
        if (!(c19eg instanceof C19EG) || ((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            return;
        }
        C10H6.LIZ.getClass();
        if (!C10H6.LIZIZ) {
            return;
        }
        ((ArrayList) this.LJIIIIZZ).add(Long.valueOf(System.currentTimeMillis()));
        if (((ArrayList) this.LJIIIIZZ).size() > 5) {
            ListProtector.remove(this.LJIIIIZZ, 0);
        }
        LJIIZILJ().storeString("enter_profile_records", GsonProtectorUtils.toJson(C7740030o.LIZ().getGson(), this.LJIIIIZZ));
        if (C257300z5.LIZ(this.LJIIIIZZ) == C10H6.LIZJ) {
            Map<EnumC20027813Xw, C13E8<Long>> map = this.LIZ;
            if (C20012813Sc.LIZIZ(map)) {
                if (map != null) {
                    C13E8 c13e8 = (C13E8) ((LinkedHashMap) map).get(EnumC20027813Xw.PROACTIVE_LOGIN_ON_PROFILE_PAGE);
                    if (c13e8 != null && (!c13e8.isEmpty()) && ((Number) c13e8.get(0)).longValue() + (((long) C10H6.LIZLLL) * 86400000) > System.currentTimeMillis()) {
                        return;
                    }
                }
                PopupManager.LJIJI(new C848800XRm(c19eg, "proactive_profile", "others_homepage_profile", c19eg.getString(2131845262), c19eg.getString(2131845262), null, 0.7d, null, new AwS574S0100000_30(this, 93), 160), true);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.service.proactive.IProactiveTriggersService
    public final boolean LJIILJJIL(C19EG c19eg) {
        if (!(c19eg instanceof C19EG) || ((AbstractC848400XPy) C0XQ7.LJFF()).isLogin() || !C20012813Sc.LIZIZ(this.LIZ)) {
            return false;
        }
        PopupManager.LJIJI(new C848800XRm(c19eg, "cold_launch", "daily_predict", c19eg.getString(2131845262), c19eg.getString(2131845262), null, 0.7d, null, new AwS574S0100000_30(this, 95), 160), true);
        return true;
    }

    @Override // com.ss.android.ugc.aweme.service.proactive.IProactiveTriggersService
    public final void LJIILLIIL(String str) {
        int iIntValue;
        if (!TextUtils.isEmpty(str)) {
            try {
                ProactiveLoginConfig proactiveLoginConfig = (ProactiveLoginConfig) ((GsonProvider) ServiceManager.get().getService(GsonProvider.class)).getGson().LJII(str, ProactiveLoginConfig.class);
                if (proactiveLoginConfig != null) {
                    LJIJ(proactiveLoginConfig);
                    String str2 = proactiveLoginConfig.decision;
                    int i = proactiveLoginConfig.design;
                    int i2 = proactiveLoginConfig.vv;
                    if (i2 <= 0) {
                        i2 = 8;
                    }
                    Integer num = proactiveLoginConfig.minHoursIntervalLoginPanel;
                    int iIntValue2 = -1;
                    if (num != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = -1;
                    }
                    Integer numValueOf = Integer.valueOf(iIntValue);
                    Integer num2 = proactiveLoginConfig.dayLimitLoginPanel;
                    if (num2 != null) {
                        iIntValue2 = num2.intValue();
                    }
                    this.LIZLLL = new ProactiveLoginConfig(str2, i, i2, numValueOf, Integer.valueOf(iIntValue2));
                }
                LJIJI();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public final void LJIJ(ProactiveLoginConfig proactiveLoginConfig) {
        String str;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("decision", proactiveLoginConfig.decision);
        c2344009Gk.LIZJ(proactiveLoginConfig.design, "design");
        if (Intrinsics.LJFF(this.LIZJ, Boolean.TRUE)) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJIIIIZZ("is_first_time", str);
        c2344009Gk.LJ(proactiveLoginConfig.minHoursIntervalLoginPanel, "min_hours_interval_login_panel");
        c2344009Gk.LJ(proactiveLoginConfig.dayLimitLoginPanel, "day_limit_login_panel");
        C20684815ws.LJIILLIIL("proactive_config", c2344009Gk.LIZ);
    }

    public final void LJIJJ(EnumC20027813Xw enumC20027813Xw) {
        if (!this.LIZ.containsKey(enumC20027813Xw)) {
            this.LIZ.put(enumC20027813Xw, new C13E8<>());
        }
        C13E8 c13e8 = (C13E8) ((LinkedHashMap) this.LIZ).get(enumC20027813Xw);
        if (c13e8 != null) {
            c13e8.addFirst(Long.valueOf(System.currentTimeMillis()));
            if (c13e8.size() > 5) {
                c13e8.removeLast();
            }
            LJIJI();
        }
    }

    @Override // com.ss.android.ugc.aweme.service.proactive.IProactiveTriggersService
    public final void LJI(Activity activity, String str) {
        if (!(activity instanceof C19EG)) {
            return;
        }
        C19EG c19eg = (C19EG) activity;
        PopupManager.LJIJI(new C848800XRm(c19eg, str, "download_success", c19eg.getString(2131845258), c19eg.getString(2131845259), null, 0.0d, null, new AwS574S0100000_30(this, 90), 224), true);
    }

    @Override // com.ss.android.ugc.aweme.service.proactive.IProactiveTriggersService
    public final void LJIIIIZZ(Activity activity, String str) {
        if (!(activity instanceof C19EG)) {
            return;
        }
        C19EG c19eg = (C19EG) activity;
        PopupManager.LJIJI(new C848800XRm(c19eg, str, "click_share_button", c19eg.getString(2131845258), c19eg.getString(2131845259), null, 0.0d, null, new AwS574S0100000_30(this, 91), 224), true);
    }

    @Override // com.ss.android.ugc.aweme.service.proactive.IProactiveTriggersService
    public final void LJIIJJI(Activity activity, String str) {
        Long l;
        C13E8<Long> c13e8 = this.LIZIZ;
        if (c13e8 != null && !c13e8.isEmpty()) {
            C13E8<Long> c13e82 = this.LIZIZ;
            if (c13e82 != null) {
                l = c13e82.get(0);
            } else {
                l = null;
            }
            this.LJII = l;
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new AnonymousClass0583(this, activity, str, "click_copy_link", null), 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
    @Override // com.ss.android.ugc.aweme.service.proactive.IProactiveTriggersService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIL(X.C19EG r24, java.lang.String r25) {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.service.proactive.ProactiveTriggersService.LJIIL(X.19EG, java.lang.String):void");
    }

    @Override // com.ss.android.ugc.aweme.service.proactive.IProactiveTriggersService
    public final void LJIILL(Activity activity, String str, String str2, boolean z) {
        if (!LIZ(z) || !(activity instanceof C19EG)) {
            return;
        }
        C19EG c19eg = (C19EG) activity;
        PopupManager.LJIJI(new C848800XRm(c19eg, str, str2, c19eg.getString(2131845258), c19eg.getString(2131845259), null, 0.0d, null, new AwS574S0100000_30(this, 92), 224), true);
    }
}
