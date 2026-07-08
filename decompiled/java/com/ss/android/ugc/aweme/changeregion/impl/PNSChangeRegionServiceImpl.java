package com.ss.android.ugc.aweme.changeregion.impl;

import X.AbstractC1703340uQW;
import X.C01GW;
import X.C098200Yq;
import X.C0PEM;
import X.C0WZX;
import X.C100C;
import X.C1203604nK;
import X.C1207404nw;
import X.C1238730iL9;
import X.C1701330uNH;
import X.C1703320uQU;
import X.C1703330uQV;
import X.C1703350uQX;
import X.C1703360uQY;
import X.C1703370uQZ;
import X.C1703420uQe;
import X.C1703490uQl;
import X.C1703500uQm;
import X.C1703510uQn;
import X.C1703540uQq;
import X.C1703550uQr;
import X.C1703670uR3;
import X.C189200o6;
import X.C1DFH;
import X.C2107308Nj;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C23250099c;
import X.C348870Dm1;
import X.C817503Hh;
import X.InterfaceC1703280uQQ;
import X.InterfaceC1703520uQo;
import X.InterfaceC1703530uQp;
import X.InterfaceC1703650uR1;
import X.InterfaceC1710120ubS;
import android.app.Activity;
import android.content.Intent;
import androidx.lifecycle.LiveData;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.changeregion.sdk.model.Country;
import com.ss.android.ugc.aweme.changeregion.ui.MusCountryListActivity;
import com.ss.android.ugc.aweme.changeregion.util.StoreRegionInterceptor;
import com.ss.android.ugc.aweme.changeregionapi.api.IPNSChangeRegionDep;
import com.ss.android.ugc.aweme.changeregionapi.api.IPNSChangeRegionService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.setting.I18nSettingManageMyAccountActivity;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class PNSChangeRegionServiceImpl implements IPNSChangeRegionService {
    public String LIZ = "device_api";
    public final AtomicBoolean LIZIZ = new AtomicBoolean(false);

    public final void LJIIZILJ() {
        if (this.LIZIZ.compareAndSet(false, true)) {
            if (C1207404nw.LIZ()) {
                C01GW c01gw = C1703370uQZ.LIZ;
                C1703670uR3 c1703670uR3 = new InterfaceC1703280uQQ<C1703420uQe>() { // from class: X.0uR3
                    @Override // X.InterfaceC1703280uQQ
                    public final Object LIZ(InterfaceC1364105Vn<? super C1703300uQS<C1703420uQe>> interfaceC1364105Vn) {
                        final C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
                        c2252611DEt.LJIJJ();
                        IPNSChangeRegionDep iPNSChangeRegionDep = (IPNSChangeRegionDep) PluggableExtentionKt.pluggableSpi$default(IPNSChangeRegionDep.class, false, false, false, 14, null);
                        if (iPNSChangeRegionDep != null) {
                            iPNSChangeRegionDep.LJI();
                        }
                        final C1703300uQS c1703300uQS = new C1703300uQS();
                        c1703300uQS.LIZIZ = "/passport/app/store_region/";
                        final long jCurrentTimeMillis = System.currentTimeMillis();
                        ((C0XH0) C0XH0.LIZLLL()).LIZIZ("/passport/app/store_region/", C2097608Jq.LJ(), new C0XH7<C846060XGy>() { // from class: X.0uR5
                            /* JADX WARN: Removed duplicated region for block: B:33:0x00c7  */
                            @Override // X.C0XH7
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final void LJI(X.C0XGA r11) {
                                /*
                                    Method dump skipped, instruction units count: 230
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: X.C1703690uR5.LJI(X.0XGA):void");
                            }

                            @Override // X.C0XH7
                            public final void LJ(C0XGA c0xga, int i) {
                                int i2;
                                InterfaceC1519030pdF interfaceC1519030pdFLIZJ = C100C.LIZ.LIZJ();
                                Pair[] pairArr = new Pair[4];
                                pairArr[0] = new Pair("isSuccess", CardStruct.IStatusCode.DEFAULT);
                                pairArr[1] = new Pair("service", "/passport/app/store_region/");
                                if (c0xga != null) {
                                    i2 = c0xga.LIZLLL;
                                } else {
                                    i2 = 0;
                                }
                                pairArr[2] = new Pair("code", String.valueOf(i2));
                                pairArr[3] = new Pair("duration", String.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
                                interfaceC1519030pdFLIZJ.LIZ("compliance_api_status", C2097608Jq.LJIIIIZZ(pairArr));
                                C1703420uQe c1703420uQe = new C1703420uQe(false, new Country("", ""), null, null);
                                C1703300uQS<C1703420uQe> c1703300uQS2 = c1703300uQS;
                                c1703300uQS2.LIZ(i);
                                c1703300uQS2.LIZ = c1703420uQe;
                                c1703300uQS2.LIZLLL = Boolean.FALSE;
                                c2252611DEt.LJJIFFI(null, c1703300uQS);
                            }
                        });
                        Object objLJIJ = c2252611DEt.LJIJ();
                        if (objLJIJ == C099R.LJFF()) {
                            C099Q.LIZJ(interfaceC1364105Vn);
                        }
                        return objLJIJ;
                    }
                };
                C1703370uQZ.LIZIZ.getValue().getClass();
                C1703350uQX.LIZIZ.put("new_user_request_by_account_sdk", c1703670uR3);
                C1703370uQZ.LIZLLL.put("new_user", "new_user_request_by_account_sdk");
                C1703540uQq c1703540uQq = new C1703540uQq();
                CopyOnWriteArrayList<InterfaceC1703530uQp> copyOnWriteArrayList = C1703370uQZ.LIZJ;
                if (!copyOnWriteArrayList.contains(c1703540uQq)) {
                    copyOnWriteArrayList.add(c1703540uQq);
                }
            }
            IPNSChangeRegionDep iPNSChangeRegionDep = (IPNSChangeRegionDep) PluggableExtentionKt.pluggableSpi$default(IPNSChangeRegionDep.class, false, false, false, 14, null);
            if (iPNSChangeRegionDep != null) {
                iPNSChangeRegionDep.init();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.changeregionapi.api.IPNSChangeRegionService
    public final void LIZIZ() throws Exception {
        LJIIZILJ();
        try {
            C1703370uQZ.LIZIZ("existing_user");
        } catch (C348870Dm1 e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // com.ss.android.ugc.aweme.changeregionapi.api.IPNSChangeRegionService
    public final String LIZLLL() {
        C1238730iL9 value;
        Country country;
        LJIIZILJ();
        if (!C1207404nw.LIZ()) {
            return C1703500uQm.LIZJ.LIZLLL;
        }
        LiveData<? extends C1238730iL9> liveDataLJI = LJI();
        if (liveDataLJI == null || (value = liveDataLJI.getValue()) == null || (country = value.LIZIZ) == null) {
            return null;
        }
        return country.code;
    }

    @Override // com.ss.android.ugc.aweme.changeregionapi.api.IPNSChangeRegionService
    public final LiveData<? extends C1238730iL9> LJ() {
        Object c098200Yq;
        LJIIZILJ();
        try {
            C1703370uQZ.LIZJ().getClass();
            c098200Yq = C1703360uQY.LIZ("existing_user").LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        return (LiveData) c098200Yq;
    }

    @Override // com.ss.android.ugc.aweme.changeregionapi.api.IPNSChangeRegionService
    public final String LJFF() {
        Country country;
        Country country2;
        String str;
        LJIIZILJ();
        if (!C1207404nw.LIZ()) {
            C1703510uQn c1703510uQn = C1703500uQm.LIZJ;
            String str2 = c1703510uQn.LJFF;
            if (str2 != null) {
                return str2;
            }
            String str3 = c1703510uQn.LJ;
            return str3 == null ? c1703510uQn.LIZIZ : str3;
        }
        LiveData<? extends C1238730iL9> liveDataLJI = LJI();
        if (liveDataLJI == null) {
            return null;
        }
        C1238730iL9 value = liveDataLJI.getValue();
        if (value != null && (country2 = value.LIZJ) != null && (str = country2.name) != null) {
            return str;
        }
        C1238730iL9 value2 = liveDataLJI.getValue();
        if (value2 == null || (country = value2.LIZIZ) == null) {
            return null;
        }
        return country.name;
    }

    @Override // com.ss.android.ugc.aweme.changeregionapi.api.IPNSChangeRegionService
    public final LiveData<? extends C1238730iL9> LJI() {
        Object c098200Yq;
        LJIIZILJ();
        try {
            C1703370uQZ.LIZJ().getClass();
            c098200Yq = C1703360uQY.LIZ("new_user").LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        return (LiveData) c098200Yq;
    }

    @Override // com.ss.android.ugc.aweme.changeregionapi.api.IPNSChangeRegionService
    public final boolean LJIIJJI() {
        boolean z;
        C1238730iL9 value;
        LJIIZILJ();
        if (C1207404nw.LIZ()) {
            LiveData<? extends C1238730iL9> liveDataLJI = LJI();
            if (liveDataLJI == null || (value = liveDataLJI.getValue()) == null) {
                return false;
            }
            z = value.LIZ;
        } else {
            z = C1703500uQm.LIZLLL;
        }
        if (!z) {
            return false;
        }
        IPNSChangeRegionDep iPNSChangeRegionDep = (IPNSChangeRegionDep) PluggableExtentionKt.pluggableSpi$default(IPNSChangeRegionDep.class, false, false, false, 14, null);
        if (iPNSChangeRegionDep != null) {
            iPNSChangeRegionDep.LJIIIIZZ();
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.changeregionapi.api.IPNSChangeRegionService
    public final int LJIIL() {
        LJIIZILJ();
        if (!C1207404nw.LIZ()) {
            return C1703500uQm.LIZJ.LIZJ;
        }
        try {
            C1703370uQZ.LIZJ().getClass();
            C1238730iL9 c1238730iL9 = (C1238730iL9) C1703360uQY.LIZ("new_user").LIZ.getValue();
            if (c1238730iL9 != null) {
                return c1238730iL9.LIZJ != null ? 1 : 0;
            }
            return 0;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return 0;
        }
    }

    @Override // com.ss.android.ugc.aweme.changeregionapi.api.IPNSChangeRegionService
    public final void LJIILJJIL() throws Exception {
        LJIIZILJ();
        if (C1207404nw.LIZ()) {
            try {
                SettingsManager.LIZLLL().getClass();
                if (!SettingsManager.LIZ("change_region_init_region_only_one_time", true)) {
                    Gson gson = C1703500uQm.LIZ;
                    LJIIIZ(0, C1703490uQl.LIZ(), C1703490uQl.LIZ(), "device_api");
                }
                C1703370uQZ.LIZIZ("new_user");
                return;
            } catch (C348870Dm1 e) {
                TryCatchGuardChecker.doCheck(e);
                return;
            }
        }
        Gson gson2 = C1703500uQm.LIZ;
        SettingsManager.LIZLLL().getClass();
        if (!SettingsManager.LIZ("change_region_init_region_only_one_time", true)) {
            C1703510uQn c1703510uQn = C1703500uQm.LIZJ;
            c1703510uQn.LIZ = C1703490uQl.LIZ();
            c1703510uQn.LIZIZ = C1703490uQl.LIZ();
            c1703510uQn.LIZJ = 0;
            c1703510uQn.LIZLLL = C1703490uQl.LIZ();
            C1703490uQl.LIZJ();
        }
        C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C1703550uQr(null), 2);
    }

    @Override // com.ss.android.ugc.aweme.changeregionapi.api.IPNSChangeRegionService
    public final String getStoreRegion() {
        Country country;
        Country country2;
        String str;
        LJIIZILJ();
        if (!C1207404nw.LIZ()) {
            Gson gson = C1703500uQm.LIZ;
            return C1703490uQl.LIZIZ();
        }
        LiveData<? extends C1238730iL9> liveDataLJI = LJI();
        if (liveDataLJI == null) {
            return null;
        }
        C1238730iL9 value = liveDataLJI.getValue();
        if (value != null && (country2 = value.LIZJ) != null && (str = country2.code) != null) {
            return str;
        }
        C1238730iL9 value2 = liveDataLJI.getValue();
        if (value2 == null || (country = value2.LIZIZ) == null) {
            return null;
        }
        return country.code;
    }

    @Override // com.ss.android.ugc.aweme.changeregionapi.api.IPNSChangeRegionService
    public final StoreRegionInterceptor LJIIJ() {
        return StoreRegionInterceptor.LL;
    }

    @Override // com.ss.android.ugc.aweme.changeregionapi.api.IPNSChangeRegionService
    public final String LJIILIIL() {
        return this.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.changeregionapi.api.IPNSChangeRegionService
    public final void LIZ(boolean z) throws Exception {
        LJIIZILJ();
        if (C1207404nw.LIZ()) {
            try {
                C1703370uQZ.LIZJ().getClass();
                AbstractC1703340uQW abstractC1703340uQWLIZ = C1703360uQY.LIZ("new_user");
                C817503Hh c817503Hh = C817503Hh.LL;
                C1DFH c1dfh = C0PEM.LIZ;
                C23250099c.LIZLLL(c817503Hh, C2107308Nj.LIZ, null, new C1703320uQU(abstractC1703340uQWLIZ, z, null), 2);
                return;
            } catch (C348870Dm1 e) {
                TryCatchGuardChecker.doCheck(e);
                return;
            }
        }
        C1703500uQm.LIZLLL = z;
        C1703490uQl.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.changeregionapi.api.IPNSChangeRegionService
    public final void LJII(InterfaceC1703520uQo interfaceC1703520uQo) {
        Gson gson = C1703500uQm.LIZ;
        C1703500uQm.LIZIZ.remove(interfaceC1703520uQo);
    }

    @Override // com.ss.android.ugc.aweme.changeregionapi.api.IPNSChangeRegionService
    public final void LJIIIIZZ(InterfaceC1703520uQo interfaceC1703520uQo) {
        CopyOnWriteArrayList<InterfaceC1703520uQo> copyOnWriteArrayList = C1703500uQm.LIZIZ;
        if (!copyOnWriteArrayList.contains(interfaceC1703520uQo)) {
            copyOnWriteArrayList.add(interfaceC1703520uQo);
        }
    }

    @Override // com.ss.android.ugc.aweme.changeregionapi.api.IPNSChangeRegionService
    public final void LJIILL(I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity) throws Exception {
        LJIIZILJ();
        try {
            C1703370uQZ.LIZ(i18nSettingManageMyAccountActivity, "existing_user");
        } catch (C348870Dm1 e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // com.ss.android.ugc.aweme.changeregionapi.api.IPNSChangeRegionService
    public final void LJIILLIIL(Activity activity, InterfaceC1710120ubS interfaceC1710120ubS) throws Exception {
        Object c098200Yq;
        String str;
        LJIIZILJ();
        if (C1207404nw.LIZ()) {
            try {
                C1703370uQZ.LIZ(activity, "new_user");
                return;
            } catch (C348870Dm1 e) {
                TryCatchGuardChecker.doCheck(e);
                return;
            }
        }
        C01GW c01gw = C1203604nK.LIZ;
        if (((Boolean) c01gw.getValue()).booleanValue()) {
            try {
                if (((Boolean) c01gw.getValue()).booleanValue()) {
                    str = "https://www.tiktok.com/tpp/inapp/pns_product_poseidon/change-region-selector.html?hide_nav_bar=1&show_loading=1&container_color_auto_dark=1&use_spark=1&bdhm_bid=tiktok_privacy_product_hybrid&should_full_screen=1&_pia_=1&enter_from=signup";
                } else {
                    str = "//consent/country/list/mus";
                }
                String strEncode = URLEncoder.encode(UriProtector.parse(str).buildUpon().appendQueryParameter("reg_store_region", getStoreRegion()).appendQueryParameter("signup_localized_country", LJFF()).toString(), "UTF-8");
                InterfaceC1703650uR1 interfaceC1703650uR1LJ = C100C.LIZ.LJ();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("aweme://webview?url=");
                sbLIZ.append(strEncode);
                interfaceC1703650uR1LJ.LIZ(activity, C2188811AlT.LIZIZ(sbLIZ), null, null, null);
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            C189200o6.m1boximpl(c098200Yq);
            return;
        }
        Intent intent = new Intent(activity, (Class<?>) MusCountryListActivity.class);
        intent.addFlags(131072);
        MusCountryListActivity.LLJI = interfaceC1710120ubS;
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, intent, "Context_startActivity_1");
        C1701330uNH.LIZ(intent, activity);
        C2204961BRm.LJIILLIIL(activity, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmgYpHJ2SBKxWLnFR5VXPAXwM4YTe+IbPXIVPpqxCelvf2OsuC+6rhCOYLo", null));
    }

    @Override // com.ss.android.ugc.aweme.changeregionapi.api.IPNSChangeRegionService
    public final void LIZJ(String str, String str2, String str3, String str4) {
        if (!Intrinsics.LJFF(str, str3) && Intrinsics.LJFF(str2, str4) && str4 != null && str4.length() > 0) {
            LJIIZILJ();
            Iterator<InterfaceC1703530uQp> it2 = C1703370uQZ.LIZJ.iterator();
            while (it2.hasNext()) {
                it2.next().LIZ();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.changeregionapi.api.IPNSChangeRegionService
    public final boolean LJIIIZ(int i, String str, String str2, String str3) throws Exception {
        String storeRegion;
        boolean z;
        IPNSChangeRegionDep iPNSChangeRegionDep;
        boolean z2 = false;
        if (str != null) {
            Locale locale = Locale.ROOT;
            if (!Intrinsics.LJFF(str.toLowerCase(locale), "unknown")) {
                LJIIZILJ();
                if (str2 != null && !Intrinsics.LJFF(str2.toLowerCase(locale), "unknown")) {
                    if (str.length() > 2) {
                        storeRegion = getStoreRegion();
                        if (storeRegion == null) {
                            storeRegion = "";
                        }
                    } else {
                        storeRegion = str;
                    }
                    z = true;
                } else {
                    str2 = str;
                    storeRegion = str;
                    z = false;
                }
                if (C1207404nw.LIZ()) {
                    try {
                        C01GW c01gw = C1703370uQZ.LIZ;
                        Country country = new Country(storeRegion, str2);
                        if (i == 1) {
                            z2 = true;
                        }
                        C1703370uQZ.LIZJ().getClass();
                        AbstractC1703340uQW abstractC1703340uQWLIZ = C1703360uQY.LIZ("new_user");
                        C817503Hh c817503Hh = C817503Hh.LL;
                        C1DFH c1dfh = C0PEM.LIZ;
                        C23250099c.LIZLLL(c817503Hh, C2107308Nj.LIZ, null, new C1703330uQV(abstractC1703340uQWLIZ, z2, country, null), 2);
                    } catch (C348870Dm1 e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                } else {
                    C1703510uQn c1703510uQn = C1703500uQm.LIZJ;
                    c1703510uQn.LIZ = storeRegion;
                    c1703510uQn.LIZIZ = str2;
                    c1703510uQn.LIZJ = i;
                    if (i == 0) {
                        c1703510uQn.LIZLLL = storeRegion;
                        c1703510uQn.LJ = str2;
                    } else {
                        c1703510uQn.LJI = storeRegion;
                        c1703510uQn.LJFF = str2;
                    }
                    C1703490uQl.LIZJ();
                }
                this.LIZ = str3;
                if (z && i == 1 && (iPNSChangeRegionDep = (IPNSChangeRegionDep) PluggableExtentionKt.pluggableSpi$default(IPNSChangeRegionDep.class, false, false, false, 14, null)) != null) {
                    iPNSChangeRegionDep.LJIIIZ(Intrinsics.LJFF(str.toLowerCase(Locale.ROOT), "kr"));
                }
                return z;
            }
        }
        return false;
    }
}
