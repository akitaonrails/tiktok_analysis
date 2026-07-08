package com.ss.android.ugc.aweme.poi.search;

import X.C01GW;
import X.C03H5;
import X.C098200Yq;
import X.C0QSJ;
import X.C0WZX;
import X.C0ZP4;
import X.C1189060h32;
import X.C1192290h8F;
import X.C1197490hGd;
import X.C1197840hHC;
import X.C1198630hIT;
import X.C1199450hJn;
import X.C1199460hJo;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1220000hqw;
import X.C123100dR;
import X.C1388190mED;
import X.C13JW;
import X.C13JX;
import X.C13LE;
import X.C1554610qYd;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1685300txQ;
import X.C1770850wBP;
import X.C189200o6;
import X.C18JG;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C20684815ws;
import X.C2204961BRm;
import X.C2365509Or;
import X.C2371409Qy;
import X.C338520DOw;
import X.C451460Hn6;
import X.C451620HnM;
import X.C452070Ho5;
import X.C673150Qan;
import X.C687700QyG;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736950SvV;
import X.C786410Ut5;
import X.EnumC1198680hIY;
import X.InterfaceC0148002o;
import X.InterfaceC1146704e9;
import X.InterfaceC1206390hUz;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC1740760vOs;
import X.InterfaceC2217241BqE;
import X.InterfaceC665370Q7z;
import X.InterfaceC687730QyJ;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.InterfaceC836760Ws6;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.immersionbar.ImmersionBar;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.system.TuxImmersionBar;
import com.google.gson.Gson;
import com.google.gson.s;
import com.ss.android.ugc.aweme.creative.model.MediaLocationMetaDataModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.poi.BasePage;
import com.ss.android.ugc.aweme.poi.PoiData;
import com.ss.android.ugc.aweme.poi.PoiMobParam;
import com.ss.android.ugc.aweme.poi.creator.PoiCreatorVM;
import com.ss.android.ugc.aweme.poi.creator.vm.PoiSearchCreatorVM;
import com.ss.android.ugc.aweme.poi.search.eventtrack.IPoiSearchProvider;
import com.ss.android.ugc.aweme.poi.search.eventtrack.PoiSearchCreationProvider;
import com.ss.android.ugc.aweme.poi.search.eventtrack.PoiSearchMobProvider;
import com.ss.android.ugc.aweme.poi.utils.PageDurationObserver;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS32S0010000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;

/* JADX INFO: loaded from: classes19.dex */
@InterfaceC836760Ws6
public final class PoiSearchFragment extends BasePage implements InterfaceC724530SbT, IPoiSearchAbility, InterfaceC1206390hUz, InterfaceC1740760vOs, C0QSJ, InterfaceC1146704e9 {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjUjHELIOSIGEgLSQ+Kid9GColGioyOiYkDz0yLygpJzs=";
    public final C01GW LLIZLLLIL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS256S0000000_18.get$arr$(653), "poi_mob_param", PoiMobParam.class);
    public final C01GW LLJ = RouteArgExtension.INSTANCE.optionalArg(this, AFwS256S0000000_18.get$arr$(649), "aid", String.class);
    public final C01GW LLJI = RouteArgExtension.INSTANCE.optionalArg(this, AFwS256S0000000_18.get$arr$(655), "page_scene", EnumC1198680hIY.class);
    public final C01GW LLJIJIL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS256S0000000_18.get$arr$(652), "media_location_meta_data_list_json", String.class);
    public final C01GW LLJILJIL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS256S0000000_18.get$arr$(656), "retag_enter_method", String.class);
    public final C01GW LLJILJILJ = RouteArgExtension.INSTANCE.optionalArg(this, AFwS256S0000000_18.get$arr$(648), "after_post_days", String.class);
    public final C01GW LLJILLL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS256S0000000_18.get$arr$(651), "from_find_nearby_place_click", Boolean.class);
    public final C01GW LLJJ = RouteArgExtension.INSTANCE.optionalArg(this, AFwS256S0000000_18.get$arr$(659), "skip_search_gps_show", Boolean.class);
    public final C01GW LLJJI = RouteArgExtension.INSTANCE.optionalArg(this, AFwS256S0000000_18.get$arr$(658), "show_rec_poi_re_tag_banner", Boolean.class);
    public final C01GW LLJJIII = RouteArgExtension.INSTANCE.optionalArg(this, AFwS256S0000000_18.get$arr$(650), "edit_post_show_rec_poi", Boolean.class);
    public final C01GW LLJJIJI = RouteArgExtension.INSTANCE.optionalArg(this, AFwS256S0000000_18.get$arr$(657), "show_banner", Boolean.class);
    public final C01GW LLJJIJIIJIL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS256S0000000_18.get$arr$(660), "source_btm_token", Void.class);
    public boolean LLJJIJIL;
    public final C736950SvV LLJJJ;
    public final C736950SvV LLJJJIL;
    public final C736950SvV LLJJJJ;
    public PoiSearchCreationProvider LLJJJJJIL;
    public PoiSearchMobProvider LLJJJJLIIL;
    public String LLJJL;

    @Override // X.InterfaceC1206390hUz
    public final void V6() {
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{PoiSearchScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        return null;
    }

    @Override // X.InterfaceC724530SbT, X.InterfaceC736810SvH
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC736810SvH getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC725050ScJ
    public final C03H5 getActualReceiver() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC725050ScJ<C03H5> getActualReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC1740760vOs
    public String getBtmPageCode() {
        return "a4257.b25801";
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(PoiSearchScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(PoiSearchScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // X.InterfaceC1206390hUz
    public final void onPageSelected(int i) {
    }

    @Override // X.InterfaceC1740760vOs
    public final Map<String, String> r9() {
        return null;
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.InterfaceC1206390hUz
    public final void LLLILZLLLI() {
        Context context;
        Activity activityLIZ;
        Window window;
        View decorView;
        IBinder windowToken;
        InputMethodManager inputMethodManager;
        if (!this.LLJJIJIL || (context = getContext()) == null || (activityLIZ = C1388190mED.LIZ(context)) == null || (window = activityLIZ.getWindow()) == null || (decorView = window.getDecorView()) == null || (windowToken = decorView.getWindowToken()) == null) {
            return;
        }
        Context context2 = getContext();
        Object objH2 = context2 != null ? C786410Ut5.H2(context2, "input_method") : null;
        if (!(objH2 instanceof InputMethodManager) || (inputMethodManager = (InputMethodManager) objH2) == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(windowToken, 0);
    }

    public final PoiSearchVM UR() {
        return (PoiSearchVM) this.LLJJJ.getValue();
    }

    public PoiSearchFragment() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiSearchVM.class);
        AFwS206S0000000_18 aFwS206S0000000_18 = AFwS206S0000000_18.get$arr$(521);
        AFwS256S0000000_18 aFwS256S0000000_18 = AFwS256S0000000_18.get$arr$(661);
        C451460Hn6 c451460Hn6 = new C451460Hn6(this, false);
        C451620HnM c451620HnM = new C451620HnM(this, true);
        C338520DOw c338520DOw = new C338520DOw(this);
        C452070Ho5 c452070Ho5 = new C452070Ho5();
        this.LLJJJ = new C736950SvV(c19719912DlLIZ, aFwS206S0000000_18, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), aFwS256S0000000_18, c451460Hn6, c451620HnM, c338520DOw);
        this.LLJJJIL = new C736950SvV(C13LE.LIZ(PoiSearchCreatorVM.class), AFwS206S0000000_18.get$arr$(520), c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS256S0000000_18.get$arr$(662), new C451460Hn6(this, false), new C451620HnM(this, true), new C338520DOw(this));
        AFwS206S0000000_18 aFwS206S0000000_182 = AFwS206S0000000_18.get$arr$(519);
        this.LLJJJJ = new C736950SvV(C13LE.LIZ(PoiCreatorVM.class), aFwS206S0000000_182, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS256S0000000_18.get$arr$(663), new C451460Hn6(this, false), new C451620HnM(this, true), new C338520DOw(this));
        this.LLJJL = "system_exit";
    }

    public final void VR() {
        C19EG activity = getActivity();
        if (activity == null) {
            return;
        }
        TuxImmersionBar tuxImmersionBar = new TuxImmersionBar(activity, ImmersionBar.LJIILJJIL(activity));
        tuxImmersionBar.LJIIIIZZ(R.attr.bx);
        tuxImmersionBar.LJ(R.attr.bx);
        tuxImmersionBar.LIZ(true);
        tuxImmersionBar.LIZLLL();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        UR().CQ2("exit_search");
        C19EG activity = getActivity();
        if (activity != null) {
            C1558520qew.LJIIJJI(C1558360qeg.LJI(activity, null), IPoiSearchAbility.class, null);
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJFF = C1558360qeg.LJFF(this, null);
        PoiSearchCreationProvider poiSearchCreationProvider = this.LLJJJJJIL;
        if (poiSearchCreationProvider != null) {
            C1554610qYd.LIZLLL(interfaceC665370Q7zLJFF, IPoiSearchProvider.class, poiSearchCreationProvider);
        }
        PoiSearchMobProvider poiSearchMobProvider = this.LLJJJJLIIL;
        if (poiSearchMobProvider != null) {
            C1554610qYd.LIZLLL(interfaceC665370Q7zLJFF, IPoiSearchProvider.class, poiSearchMobProvider);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        PoiMobParam poiMobParam = (PoiMobParam) this.LLIZLLLIL.getValue();
        C1189060h32.LJIJI(linkedHashMap, "enter_from", poiMobParam != null ? poiMobParam.enterFrom : null);
        PoiData poiData = UR().LLJZIJLIL;
        C1189060h32.LJIJI(linkedHashMap, "poi_id", poiData != null ? poiData.poiId : null);
        String str = ((C1197490hGd) UR().getState()).LL;
        C1189060h32.LJIJI(linkedHashMap, "choose_poi_type", (str == null || str.length() == 0) ? "default_search" : "search");
        if (C123100dR.LIZ(((C1197490hGd) UR().getState()).LL)) {
            C1189060h32.LJIJI(linkedHashMap, "session_id", String.valueOf(UR().LLJL));
        }
        C1198630hIT c1198630hIT = UR().LLL;
        C1189060h32.LJIJI(linkedHashMap, "publish_log_id", c1198630hIT != null ? c1198630hIT.LLILLL : null);
        long jCurrentTimeMillis = System.currentTimeMillis();
        Long l = UR().LLJILJILJ;
        C1189060h32.LJIJI(linkedHashMap, "duration", String.valueOf(jCurrentTimeMillis - (l != null ? l.longValue() : 0L)));
        C1189060h32.LJIJI(linkedHashMap, "is_choose_poi", UR().LLL != null ? "1" : CardStruct.IStatusCode.DEFAULT);
        C20684815ws.LJIILLIIL("post_search_add_location_time", linkedHashMap);
        UR().LLJZIJLIL = null;
        UR().LLL = null;
        PoiSearchVM poiSearchVMUR = UR();
        poiSearchVMUR.getClass();
        C1197840hHC.LIZ.getClass();
        poiSearchVMUR.LLJ = C1197840hHC.LIZ();
        ((ArrayList) poiSearchVMUR.LLIZLLLIL).clear();
        poiSearchVMUR.LLJILJIL = true;
        poiSearchVMUR.setState(new AwS597S0100000_18(poiSearchVMUR, 671));
        PoiSearchCreatorVM poiSearchCreatorVM = (PoiSearchCreatorVM) this.LLJJJIL.getValue();
        poiSearchCreatorVM.LL = true;
        poiSearchCreatorVM.setState(new AwS32S0010000_18(false, 22));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        VR();
    }

    @Override // com.ss.android.ugc.aweme.poi.BasePage, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        super.onStart();
        C19EG activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            window.setSoftInputMode(32);
        }
        if (this.LLJJIJIL) {
            VR();
        }
    }

    @Override // com.ss.android.ugc.aweme.poi.BasePage, X.InterfaceC21503819Do
    public final void tv() {
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            C2204961BRm.LLJJJ(c19egLIZ, 100, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPqnatHd2TPdrALVaog2iLZLmRYpBuWb+Wtvqxg=", null));
            c19egLIZ.finish();
        }
    }

    @Override // X.InterfaceC1740760vOs
    public final String w3() {
        return String.valueOf(hashCode());
    }

    @Override // com.ss.android.ugc.aweme.poi.search.IPoiSearchAbility
    public final String yd0() {
        return this.LLJJL;
    }

    @Override // com.ss.android.ugc.aweme.poi.search.IPoiSearchAbility
    public final boolean zL0() {
        return this.LLJJIJIL;
    }

    @Override // com.ss.android.ugc.aweme.poi.search.IPoiSearchAbility
    public final void FA(String str) {
        this.LLJJL = str;
    }

    @Override // com.ss.android.ugc.aweme.poi.BasePage, X.InterfaceC21503819Do
    public final void Q9(Activity activity) {
        String str;
        PoiMobParam poiMobParam = (PoiMobParam) this.LLIZLLLIL.getValue();
        if (poiMobParam != null) {
            str = poiMobParam.enterFrom;
        } else {
            str = null;
        }
        if (!Intrinsics.LJFF(str, "video_post_page") && (this.LLJI.getValue() == EnumC1198680hIY.ADD_LOCATION || this.LLJI.getValue() == EnumC1198680hIY.LOCATION_STICKER)) {
            if (activity != null) {
                activity.setTheme(R.style.xz);
            } else {
                return;
            }
        } else if (activity == null) {
            return;
        }
        C19EG c19eg = (C19EG) activity;
        TuxImmersionBar tuxImmersionBar = new TuxImmersionBar(c19eg, ImmersionBar.LJIILJJIL(c19eg));
        tuxImmersionBar.LJIIIIZZ(R.attr.bx);
        tuxImmersionBar.LJ(R.attr.bx);
        tuxImmersionBar.LIZ(true);
        tuxImmersionBar.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.poi.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C1192290h8F.LIZ(this, "poi_search_main", null, false, null, null, 30);
        C1192290h8F.LIZJ(this, new AwS597S0100000_18(this, 501));
        activityConfiguration(AFwS256S0000000_18.get$arr$(654));
        getLifecycle().addObserver(new PageDurationObserver(new AwS597S0100000_18(this, 502), 2));
        C18JG.LJII(this, getBtmPageCode(), (String) ((Void) this.LLJJIJIIJIL.getValue()));
        UR().LLLFF = BtmSDK.INSTANCE.getPageId(PageFinder.via((Fragment) this));
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to com.ss.android.ugc.aweme.poi.search.PoiSearchFragment for r14v2 'this'  java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(android.view.View r15, android.os.Bundle r16) {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.search.PoiSearchFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        List<MediaLocationMetaDataModel> arrayList;
        boolean zBooleanValue;
        boolean zBooleanValue2;
        C19EG c19egLIZIZ;
        Intent intent;
        Context context = getContext();
        if (context != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null && (intent = c19egLIZIZ.getIntent()) != null) {
            this.LLJJIJIL = intent.getBooleanExtra("use_creator_ui", false);
            long longExtra = intent.getLongExtra("page_start_ts", -1L);
            if (longExtra > 0) {
                UR().LLJILJILJ = Long.valueOf(longExtra);
                C1199460hJo c1199460hJo = C1199460hJo.LIZ;
                C1199450hJn c1199450hJn = new C1199450hJn("poi_search");
                c1199450hJn.LIZLLL = "page_open";
                c1199450hJn.LIZ(System.currentTimeMillis() - longExtra);
                c1199460hJo.getClass();
                C1199460hJo.LIZ(c1199450hJn);
            }
        }
        PoiSearchVM poiSearchVMUR = UR();
        EnumC1198680hIY enumC1198680hIY = (EnumC1198680hIY) this.LLJI.getValue();
        if (enumC1198680hIY == null) {
            enumC1198680hIY = EnumC1198680hIY.ADD_LOCATION;
        }
        poiSearchVMUR.LLILLL = enumC1198680hIY;
        PoiSearchVM poiSearchVMUR2 = UR();
        Object value = this.LLJJI.getValue();
        Boolean bool = Boolean.TRUE;
        poiSearchVMUR2.LL = Intrinsics.LJFF(value, bool);
        UR().LLILLJJLI = Intrinsics.LJFF(this.LLJJIII.getValue(), bool);
        UR().LLILZ = (String) this.LLJ.getValue();
        String str = (String) this.LLJIJIL.getValue();
        C19GS c19gs = null;
        try {
            Gson gsonLIZ = C2365509Or.LIZ();
            C13JX c13jx = KTypeProjection.LIZJ;
            C13JW c13jwLJII = C13LE.LJII(MediaLocationMetaDataModel.class);
            c13jx.getClass();
            Object objFromJson = GsonProtectorUtils.fromJson(gsonLIZ, str, C2371409Qy.LIZJ(C13LE.LJIIIIZZ(List.class, C13JX.LIZ(c13jwLJII))));
            if (!(objFromJson instanceof List)) {
                objFromJson = null;
            }
            arrayList = (List) objFromJson;
        } catch (s e) {
            TryCatchGuardChecker.doCheck(e);
            arrayList = null;
        }
        PoiSearchVM poiSearchVMUR3 = UR();
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        poiSearchVMUR3.LLILZIL = arrayList;
        UR().LLJJIII = (String) this.LLJILJIL.getValue();
        UR().LLJJIJI = (String) this.LLJILJILJ.getValue();
        PoiSearchVM poiSearchVMUR4 = UR();
        Boolean bool2 = (Boolean) this.LLJILLL.getValue();
        if (bool2 != null) {
            zBooleanValue = bool2.booleanValue();
        } else {
            zBooleanValue = false;
        }
        poiSearchVMUR4.LLJJIJIIJIL = zBooleanValue;
        PoiSearchVM poiSearchVMUR5 = UR();
        Boolean bool3 = (Boolean) this.LLJJ.getValue();
        if (bool3 != null) {
            zBooleanValue2 = bool3.booleanValue();
        } else {
            zBooleanValue2 = false;
        }
        poiSearchVMUR5.LLJJIJIL = zBooleanValue2;
        if (this.LLJJIJIL) {
            UR().LLJJJJJIL = ((PoiCreatorVM) this.LLJJJJ.getValue()).LLILLJJLI;
        } else {
            UR().LLJJJJJIL = (PoiMobParam) this.LLIZLLLIL.getValue();
        }
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.e1d, viewGroup, false);
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o> C0ZP4 subscribe(AssemViewModel<S> assemViewModel, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super S, Unit> function2) {
        return C736680Sv4.LJIILLIIL(this, assemViewModel, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJ(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJIILJJIL(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631620sYq<? super C03H5, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C736680Sv4.LIZLLL(assemViewModel, this, c1770850wBP, function1, interfaceC1631620sYq, interfaceC2217241BqE, interfaceC2217241BqE2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1770850wBP<C11H7<A, B, C>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631630sYr<? super C03H5, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C736680Sv4.LJFF(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1770850wBP, function1, interfaceC1631630sYr);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1770850wBP<C11H6<A, B, C, D>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685420txc<? super C03H5, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C736680Sv4.LJI(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1770850wBP, function1, interfaceC1685420txc);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D, E> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1770850wBP<C11H2<A, B, C, D, E>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685430txd<? super C03H5, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        return C736680Sv4.LJII(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1770850wBP, function1, interfaceC1685430txd);
    }
}
