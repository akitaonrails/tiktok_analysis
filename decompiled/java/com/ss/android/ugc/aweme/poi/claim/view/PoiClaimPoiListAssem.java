package com.ss.android.ugc.aweme.poi.claim.view;

import X.AbstractC738140SxQ;
import X.AnonymousClass0956;
import X.C019F;
import X.C01GW;
import X.C1198600hIQ;
import X.C1200050hKl;
import X.C1200090hKp;
import X.C1200110hKr;
import X.C1200540hLY;
import X.C1200620hLg;
import X.C1200770hLv;
import X.C1200780hLw;
import X.C1200810hLz;
import X.C1207450hWh;
import X.C1220000hqw;
import X.C1388190mED;
import X.C1389890mGx;
import X.C13LE;
import X.C13LP;
import X.C15438062q;
import X.C1558520qew;
import X.C1637806bA;
import X.C1749280vcc;
import X.C1770850wBP;
import X.C197039127h;
import X.C19719912Dl;
import X.C19741112Lp;
import X.C19EG;
import X.C20509915Nh;
import X.C20603715jn;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C339190DRl;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C686930Qx1;
import X.C723700Sa8;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736950SvV;
import X.C786410Ut5;
import X.InterfaceC1554640qYg;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC687820QyS;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.AsS45S0100000_18;
import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.bytedance.i18n.location.api.LocationData;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.poi.PoiData;
import com.ss.android.ugc.aweme.poi.claim.vm.PoiClaimPoiListViewModel;
import com.ss.android.ugc.aweme.poi.claim.vm.PoiClaimViewModel;
import com.ss.android.ugc.aweme.tux.business.powerlist.LoadingFooterCell;
import com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT;
import com.ss.android.ugc.tiktok.location_api.service.ILocationService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.AwS632S0100000_18;
import kotlin.jvm.internal.AwS8S1001000_18;
import kotlin.jvm.internal.Intrinsics;
import wh6.AbS699S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiClaimPoiListAssem extends UIListContentAssem<PoiClaimPoiListViewModel> implements IPoiClaimListAssemAbility, InterfaceC1554640qYg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIL;
    public C1749280vcc LLIZLLLIL;
    public C197039127h LLJ;
    public final C736950SvV LLJI = new C736950SvV(C13LE.LIZ(PoiClaimPoiListViewModel.class), AFwS206S0000000_18.get$arr$(277), new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS256S0000000_18.get$arr$(281), new AwS562S0100000_18((AbstractC738140SxQ) this, 886), new C451610HnL(this, true, true), new C723700Sa8(this));
    public final AssemVMLazy LLJIJIL;
    public AnonymousClass0956 LLJILJIL;
    public final C01GW LLJILJILJ;
    public volatile String LLJILLL;
    public boolean LLJJ;
    public C20509915Nh LLJJI;
    public final List<String> LLJJIII;
    public List<Boolean> LLJJIJI;
    public List<Boolean> LLJJIJIIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiClaimPoiListAssem.class, "pageVm", "getPageVm()Lcom/ss/android/ugc/aweme/poi/claim/vm/PoiClaimViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 1103320491) {
            return null;
        }
        return this;
    }

    public PoiClaimPoiListAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiClaimViewModel.class);
        this.LLJIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS562S0100000_18(c19719912DlLIZ, 885), AFwS256S0000000_18.get$arr$(280), null, true);
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS562S0100000_18(this, 884));
        ILocationBaseServiceForMT iLocationBaseServiceForMT = (ILocationBaseServiceForMT) PluggableExtentionKt.pluggableSpi$default(ILocationBaseServiceForMT.class, false, false, false, 14, null);
        this.LLJJIII = iLocationBaseServiceForMT != null ? iLocationBaseServiceForMT.LJIIZILJ() : null;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final ViewOnAttachStateChangeListenerC20604515jv Go() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLJILJILJ.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final C20603715jn Ho() {
        C20603715jn c20603715jn = new C20603715jn();
        c20603715jn.LIZ = 5;
        c20603715jn.LIZJ = false;
        c20603715jn.LIZLLL = LoadingFooterCell.class;
        return c20603715jn;
    }

    public final void LJ() {
        C1749280vcc c1749280vcc = this.LLIZLLLIL;
        if (c1749280vcc != null) {
            C786410Ut5.LLLZLZ(c1749280vcc, 0);
            if (c1749280vcc.getBackground() != null) {
                c1749280vcc.setBackground(null);
            }
            C339190DRl.LIZLLL(Go());
            c1749280vcc.LJ();
        }
    }

    public final PoiClaimViewModel Lo() {
        AssemVMLazy assemVMLazy = this.LLJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIL;
        return (PoiClaimViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    /* JADX INFO: renamed from: No, reason: merged with bridge method [inline-methods] */
    public final PoiClaimPoiListViewModel ip() {
        return (PoiClaimPoiListViewModel) this.LLJI.getValue();
    }

    public final void d() {
        C1749280vcc c1749280vcc = this.LLIZLLLIL;
        boolean z = false;
        if (c1749280vcc != null) {
            C786410Ut5.LLLZLZ(c1749280vcc, 0);
        }
        List<Boolean> list = this.LLJJIJIIJIL;
        if (list == null || list.contains(Boolean.TRUE)) {
            LJ();
            C01GW c01gw = C1198600hIQ.LIZ;
            Pair pair = new Pair(CertProviderManagerKt.findCert("bpea-config-claim-poi_poi_claim_poi_locate_android", 1476788523), CertProviderManagerKt.findCert("bpea-claim_poi_fetch_cache_location_decrypt", 1476788524));
            Cert cert = (Cert) pair.getFirst();
            Cert cert2 = (Cert) pair.getSecond();
            C1200770hLv c1200770hLv = C1200770hLv.LIZ;
            c1200770hLv.getClass();
            c1200770hLv.LIZJ("start_fetch_location", null);
            C1207450hWh.LIZ.LJIIL("poi", "claim_poi", cert, cert2, new InterfaceC687820QyS() { // from class: X.0hLc
                @Override // X.InterfaceC687820QyS
                public final void LIZ(LocationData locationData) {
                    LIZIZ(locationData.latitude, locationData.longitude);
                    C1200770hLv c1200770hLv2 = C1200770hLv.LIZ;
                    c1200770hLv2.getClass();
                    c1200770hLv2.LIZJ("fetch_location_success", null);
                }

                /* JADX WARN: Removed duplicated region for block: B:11:0x003d  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void LIZIZ(final double r9, final double r11) {
                    /*
                        r8 = this;
                        com.ss.android.ugc.aweme.poi.claim.view.PoiClaimPoiListAssem r0 = r8.LIZ
                        androidx.lifecycle.LifecycleRegistry r0 = r0.getLifecycle()
                        androidx.lifecycle.Lifecycle$State r1 = r0.getCurrentState()
                        androidx.lifecycle.Lifecycle$State r0 = androidx.lifecycle.Lifecycle.State.DESTROYED
                        if (r1 != r0) goto Lf
                        return
                    Lf:
                        java.lang.Class<com.ss.android.ugc.tiktok.location_api.service.ILocationService> r0 = com.ss.android.ugc.tiktok.location_api.service.ILocationService.class
                        r1 = 0
                        r4 = 14
                        r5 = 0
                        r2 = r1
                        r3 = r1
                        java.lang.Object r1 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r0, r1, r2, r3, r4, r5)
                        com.ss.android.ugc.tiktok.location_api.service.ILocationService r1 = (com.ss.android.ugc.tiktok.location_api.service.ILocationService) r1
                        if (r1 == 0) goto L3d
                        java.lang.String r0 = "android.permission.ACCESS_COARSE_LOCATION"
                        java.lang.String[] r0 = new java.lang.String[]{r0}
                        boolean r0 = r1.LJIL(r0)
                        r7 = 1
                        if (r0 != r7) goto L3d
                    L2c:
                        android.os.Handler r0 = X.C724640Sbe.LIZ()
                        X.0hLd r1 = new X.0hLd
                        com.ss.android.ugc.aweme.poi.claim.view.PoiClaimPoiListAssem r2 = r8.LIZ
                        r5 = r11
                        r3 = r9
                        r1.<init>()
                        X.C786410Ut5.LJJZZIII(r0, r1)
                        return
                    L3d:
                        r7 = 0
                        goto L2c
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1200580hLc.LIZIZ(double, double):void");
                }

                @Override // X.InterfaceC687820QyS
                public final void onError(int i, String str) {
                    LIZIZ(0.0d, 0.0d);
                    C1200770hLv c1200770hLv2 = C1200770hLv.LIZ;
                    c1200770hLv2.getClass();
                    c1200770hLv2.LIZJ("fetch_location_fail", new AwS8S1001000_18(i, str, 3));
                }
            }, -1L);
            return;
        }
        PoiClaimPoiListViewModel poiClaimPoiListViewModelJo = Jo();
        ILocationService iLocationService = (ILocationService) PluggableExtentionKt.pluggableSpi$default(ILocationService.class, false, false, false, 14, null);
        if (iLocationService != null && true == iLocationService.LJIL("android.permission.ACCESS_COARSE_LOCATION")) {
            z = true;
        }
        poiClaimPoiListViewModelJo.LLILLL = 0.0d;
        poiClaimPoiListViewModelJo.LLILZ = 0.0d;
        poiClaimPoiListViewModelJo.LLILZIL = z;
        uh(this.LLJILLL, true);
    }

    @Override // com.ss.android.ugc.aweme.poi.claim.view.IPoiClaimListAssemAbility
    public final boolean yc0() {
        C197039127h c197039127h = this.LLJ;
        return c197039127h != null && true == c197039127h.LLLII;
    }

    public final void Vo() {
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(fragmentLJI);
            c1389890mGx.LJIIIZ(2131826412);
            c1389890mGx.LJIIJJI();
        }
        So(false);
    }

    @Override // com.ss.android.ugc.aweme.poi.claim.view.IPoiClaimListAssemAbility
    public final void mt0() {
        Jo().listClear();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        Activity activityLIZ;
        Window window;
        View decorView;
        IBinder windowToken;
        super.onDestroy();
        Jo().wQ2("exit_search");
        C20509915Nh c20509915Nh = this.LLJJI;
        if (c20509915Nh != null) {
            c20509915Nh.LIZIZ();
        }
        this.LLJJI = null;
        Context context = getContext();
        if (context != null && (activityLIZ = C1388190mED.LIZ(context)) != null && (window = activityLIZ.getWindow()) != null && (decorView = window.getDecorView()) != null && (windowToken = decorView.getWindowToken()) != null) {
            Context context2 = getContext();
            ((InputMethodManager) (context2 != null ? C786410Ut5.H2(context2, "input_method") : null)).hideSoftInputFromWindow(windowToken, 0);
        }
        nf(null);
        Jo().LLJIJIL.LIZ.evictAll();
        AnonymousClass0956 anonymousClass0956 = this.LLJILJIL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        So(false);
        this.LLJILJIL = null;
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        ArrayList arrayList;
        super.onPause();
        List<String> list = this.LLJJIII;
        if (list != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            for (String str : list) {
                C19741112Lp c19741112Lp = C19741112Lp.LIZ;
                Context context = LJJIJL().getContext();
                c19741112Lp.getClass();
                arrayList.add(Boolean.valueOf(C19741112Lp.LIZLLL(context, str)));
            }
        } else {
            arrayList = null;
        }
        this.LLJJIJI = arrayList;
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        ArrayList arrayList;
        super.onResume();
        List<String> list = this.LLJJIII;
        Boolean boolValueOf = null;
        if (list != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            for (String str : list) {
                C19741112Lp c19741112Lp = C19741112Lp.LIZ;
                Context context = LJJIJL().getContext();
                c19741112Lp.getClass();
                arrayList.add(Boolean.valueOf(C19741112Lp.LIZLLL(context, str)));
            }
        } else {
            arrayList = null;
        }
        this.LLJJIJIIJIL = arrayList;
        List<Boolean> list2 = this.LLJJIJI;
        boolean z = false;
        if (list2 != null) {
            if (arrayList != null) {
                ArrayList<Pair> arrayList2 = (ArrayList) C13LP.LLIILII(arrayList, list2);
                if (arrayList2.isEmpty()) {
                    z = true;
                    boolValueOf = Boolean.valueOf(z);
                } else {
                    for (Pair pair : arrayList2) {
                        if (((Boolean) pair.getFirst()).booleanValue() != ((Boolean) pair.getSecond()).booleanValue()) {
                            break;
                        }
                    }
                    z = true;
                    boolValueOf = Boolean.valueOf(z);
                }
            }
            if (Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
                return;
            }
        }
        d();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
    @Override // com.ss.android.ugc.aweme.poi.claim.view.IPoiClaimListAssemAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void HF(boolean r4) {
        /*
            r3 = this;
            X.127h r2 = r3.LLJ
            if (r2 == 0) goto L14
            if (r4 != 0) goto L15
            X.15jv r0 = r3.Go()
            int r1 = r0.getVisibility()
            r0 = 0
            if (r1 != 0) goto L15
        L11:
            X.C786410Ut5.LLLLLLJ(r2, r0)
        L14:
            return
        L15:
            r0 = 8
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.claim.view.PoiClaimPoiListAssem.HF(boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Oo(com.ss.android.ugc.aweme.poi.PoiData r7) {
        /*
            r6 = this;
            r0 = 1
            kotlin.Pair[] r4 = new kotlin.Pair[r0]
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            java.lang.String r1 = r7.poiId
            java.lang.String r0 = "id"
            r3.put(r0, r1)
            java.lang.String r1 = "name"
            java.lang.String r0 = r7.name
            r3.put(r1, r0)
            java.lang.String r1 = "formatted_address"
            java.lang.String r0 = r7.formattedAddress
            r3.put(r1, r0)
            double r0 = r7.longitude
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
            java.lang.String r0 = "longitude"
            r3.put(r0, r1)
            double r0 = r7.latitude
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
            java.lang.String r0 = "latitude"
            r3.put(r0, r1)
            java.lang.String r0 = r7.details
            r5 = 0
            if (r0 == 0) goto L7c
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Exception -> L65
            r2.<init>(r0)     // Catch: java.lang.Exception -> L65
            java.lang.String r0 = "tt_type_name_tiny"
            java.lang.String r1 = r2.optString(r0)     // Catch: java.lang.Exception -> L65
            int r0 = r1.length()     // Catch: java.lang.Exception -> L65
            if (r0 > 0) goto L7e
            r0 = 0
            if (r0 != 0) goto L7e
            java.lang.String r0 = "tt_type_name_medium"
            java.lang.String r1 = r2.optString(r0)     // Catch: java.lang.Exception -> L65
            int r0 = r1.length()     // Catch: java.lang.Exception -> L65
            if (r0 > 0) goto L7e
            java.lang.String r0 = "tt_type_name_super"
            java.lang.String r1 = r2.optString(r0)     // Catch: java.lang.Exception -> L65
            int r0 = r1.length()     // Catch: java.lang.Exception -> L65
            if (r0 <= 0) goto L7c
            goto L7e
        L65:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "something was wrong when getCategoryName, e="
            r1.append(r0)
            java.lang.String r0 = r2.getMessage()
            r1.append(r0)
            X.C2188811AlT.LIZIZ(r1)
        L7c:
            java.lang.String r1 = ""
        L7e:
            java.lang.String r0 = "category"
            r3.put(r0, r1)
            java.lang.String r1 = "poi_title_img"
            java.lang.String r0 = r7.poiTitleImg
            r3.put(r1, r0)
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "poi_list_page"
            r1.<init>(r0, r3)
            r4[r5] = r1
            java.util.Map r1 = X.C2097608Jq.LJIIJ(r4)
            java.util.HashMap r1 = (java.util.HashMap) r1
            com.ss.android.ugc.aweme.poi.claim.vm.PoiClaimViewModel r0 = r6.Lo()
            X.0hLt r2 = r0.LLILLJJLI
            r2.LIZ(r1)
            X.0Q7z r1 = X.C1558520qew.LJIIL(r6)
            X.0hLy r0 = r2.LIZJ
            if (r0 == 0) goto Lad
            r0.LIZJ(r2, r1)
        Lad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.claim.view.PoiClaimPoiListAssem.Oo(com.ss.android.ugc.aweme.poi.PoiData):void");
    }

    public final void So(boolean z) {
        if (z) {
            C197039127h c197039127h = this.LLJ;
            if (c197039127h != null) {
                c197039127h.setLoading(true);
            }
            C197039127h c197039127h2 = this.LLJ;
            if (c197039127h2 != null) {
                c197039127h2.setClickable(false);
                return;
            }
            return;
        }
        C197039127h c197039127h3 = this.LLJ;
        if (c197039127h3 != null) {
            c197039127h3.setLoading(false);
        }
        C197039127h c197039127h4 = this.LLJ;
        if (c197039127h4 == null) {
            return;
        }
        c197039127h4.setClickable(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.poi.claim.view.IPoiClaimListAssemAbility
    public final void nE0(boolean z) {
        PoiData poiData;
        String str;
        PoiClaimPoiListViewModel poiClaimPoiListViewModelJo = Jo();
        poiClaimPoiListViewModelJo.getClass();
        C1200050hKl c1200050hKl = null;
        poiClaimPoiListViewModelJo.setState(new AwS597S0100000_18((PoiData) null, 926));
        if (!z || (poiData = ((C1200090hKp) Jo().getState()).LLILLJJLI) == null) {
            return;
        }
        C1200090hKp c1200090hKp = (C1200090hKp) Jo().getState();
        c1200090hKp.getClass();
        List<C1200050hKl> list = c1200090hKp.getListState().LLILZ;
        if (list != null) {
            Iterator<C1200050hKl> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                C1200050hKl next = it2.next();
                PoiData poiData2 = next.LL;
                if (poiData2 != null) {
                    str = poiData2.poiId;
                } else {
                    str = null;
                }
                if (Intrinsics.LJFF(str, poiData.poiId)) {
                    c1200050hKl = next;
                    break;
                }
            }
            c1200050hKl = c1200050hKl;
        }
        C1200540hLY c1200540hLY = C1200540hLY.LIZ;
        C1200780hLw c1200780hLw = Jo().LLILZLL;
        c1200540hLY.getClass();
        C1200540hLY.LIZIZ(c1200050hKl, c1200780hLw);
    }

    @Override // com.ss.android.ugc.aweme.poi.claim.view.IPoiClaimListAssemAbility
    public final void nf(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("lastSearchKeyword update from ");
        sbLIZ.append(this.LLJILLL);
        sbLIZ.append(" to ");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        this.LLJILLL = str;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        ArrayList arrayList;
        super.onViewCreated(view);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiClaimPoiListAssem onViewCreated hashCode=");
        sbLIZ.append(hashCode());
        C2188811AlT.LIZIZ(sbLIZ);
        this.LLIZLLLIL = (C1749280vcc) view.findViewById(R.id.qyl);
        C197039127h c197039127h = (C197039127h) view.findViewById(R.id.qys);
        this.LLJ = c197039127h;
        if (c197039127h != null) {
            c197039127h.LJJLI(C1200810hLz.LIZ());
        }
        C197039127h c197039127h2 = this.LLJ;
        if (c197039127h2 != null) {
            C786410Ut5.I7(new AbS699S0100000_18(this, 52, 42), c197039127h2);
        }
        List<String> list = this.LLJJIII;
        if (list != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            for (String str : list) {
                C19741112Lp c19741112Lp = C19741112Lp.LIZ;
                Context context = LJJIJL().getContext();
                c19741112Lp.getClass();
                arrayList.add(Boolean.valueOf(C19741112Lp.LIZLLL(context, str)));
            }
        } else {
            arrayList = null;
        }
        this.LLJJIJI = arrayList;
        this.LLJJIJIIJIL = arrayList;
        Jo().LLILZLL = Lo().LL;
        Go().addOnScrollListener(new AsS45S0100000_18(this, 15));
        Go().LJIILJJIL(PoiClaimPowerCell.class);
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            Jo().LLJILJIL = new C1200110hKr(new C686930Qx1(c19egLIZ));
        }
        PoiClaimPoiListViewModel poiClaimPoiListViewModelJo = Jo();
        C1200620hLg c1200620hLg = new C2217381BqS() { // from class: X.0hLg
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C1200090hKp c1200090hKp = (C1200090hKp) obj;
                c1200090hKp.getClass();
                return C627260Oiy.LIZLLL(c1200090hKp);
            }
        };
        C1770850wBP c1770850wBP = new C1770850wBP();
        c1770850wBP.LIZ = true;
        poiClaimPoiListViewModelJo.asyncSubscribe(c1200620hLg, this, c1770850wBP, new AwS597S0100000_18(this, 909), new AwS562S0100000_18(this, 2590), new AwS597S0100000_18(this, 911));
        C736680Sv4.LJIIIIZZ(this, Jo(), new C2217381BqS() { // from class: X.0hLi
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1200090hKp) obj).LLILLJJLI;
            }
        }, null, new AwS632S0100000_18(this, 274), 6);
        d();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00d1  */
    @Override // com.ss.android.ugc.aweme.poi.claim.view.IPoiClaimListAssemAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void uh(java.lang.String r10, boolean r11) {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.claim.view.PoiClaimPoiListAssem.uh(java.lang.String, boolean):void");
    }
}
