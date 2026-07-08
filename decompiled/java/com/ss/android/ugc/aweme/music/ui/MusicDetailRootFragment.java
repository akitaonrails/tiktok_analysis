package com.ss.android.ugc.aweme.music.ui;

import X.AbstractC1399690mWl;
import X.AnonymousClass1991;
import X.AnonymousClass1993;
import X.C098200Yq;
import X.C0BM3;
import X.C0OGM;
import X.C0QFS;
import X.C1202330hOR;
import X.C1202340hOS;
import X.C1361400lX0;
import X.C1399330mWB;
import X.C1399660mWi;
import X.C1399730mWp;
import X.C1401320mZO;
import X.C1443560nfW;
import X.C1458960o4M;
import X.C1554960qZC;
import X.C1558360qeg;
import X.C1685300txQ;
import X.C1800490wxD;
import X.C189200o6;
import X.C19EG;
import X.C19EH;
import X.C19GS;
import X.C20684815ws;
import X.C2344009Gk;
import X.C294780Bgy;
import X.C297090Bkh;
import X.C488650JEh;
import X.C627690Ojf;
import X.C755440TkE;
import X.C786410Ut5;
import X.C818480W8w;
import X.C960203pA;
import X.InterfaceC1399350mWD;
import X.InterfaceC1555100qZQ;
import X.InterfaceC1581830rGX;
import X.InterfaceC1670800ta2;
import X.InterfaceC1740760vOs;
import X.InterfaceC214897198d;
import X.InterfaceC21659319pf;
import X.InterfaceC655270Pn3;
import X.InterfaceC744180THc;
import Y.AfS190S0100000_21;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.SAFTikTokFragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import bsj.a5;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ICommercePageTrackingService;
import com.ss.android.ugc.aweme.SAFFragmentRootScene;
import com.ss.android.ugc.aweme.analysis.Analysis;
import com.ss.android.ugc.aweme.base.component.AnalysisActivityComponent;
import com.ss.android.ugc.aweme.benchmark.BenchmarkServiceImpl;
import com.ss.android.ugc.aweme.bl.IBenchmarkService;
import com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.model.MatchedSoundInfo;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.TTToDspLogExtra;
import com.ss.android.ugc.aweme.music.v2.MusicDetailFragment;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.structure.api.ICommerceService;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
public final class MusicDetailRootFragment extends SAFTikTokFragment implements InterfaceC744180THc, C0QFS, InterfaceC1581830rGX, InterfaceC1740760vOs, C0OGM, InterfaceC655270Pn3, InterfaceC21659319pf {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2Zig5OiHELIOSYwZjAlZwImOywvDSonKSwgGyA8PAM+KCg+LSs4";
    public String LLJILLL;
    public String LLJJ;
    public String LLJJI;
    public String LLJJIII;
    public String LLJJIJI;
    public boolean LLJJIJIIJIL;
    public String LLJJIJIL;
    public Music LLJJJ;
    public C1401320mZO LLJJJIL;
    public List<InterfaceC1399350mWD> LLJJJJ;
    public boolean LLJJJJJIL;
    public String LLJJJJLIIL;
    public String LLJJL;
    public AnalysisActivityComponent LLJJLIIIJLLLLLLLZ;
    public String LLJL;
    public final C1399660mWi LLJLIL = new AbstractC1399690mWl() { // from class: X.0mWi
        {
            super(this.LLILLJJLI);
        }

        @Override // X.InterfaceC1399350mWD
        public final boolean onKeyDown(int i, KeyEvent keyEvent) {
            C1399710mWn.LIZIZ.LIZ(Integer.valueOf(i), keyEvent, this.LLILLJJLI.getActivity());
            if (i != 24 && i != 25) {
                return false;
            }
            C1457560o26.LIZIZ(-1, i, "single_song");
            return false;
        }
    };

    @Override // X.InterfaceC1740760vOs
    public String getBtmPageCode() {
        return "b5171";
    }

    @Override // X.InterfaceC1581830rGX
    public final String getPageName() {
        return "single_song";
    }

    @Override // X.C0OGM
    public final int getPageType() {
        return 2;
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        this.LLJJLIIIJLLLLLLLZ = null;
        super.onDestroy();
    }

    @Override // X.InterfaceC1740760vOs
    public final Map<String, String> r9() {
        return null;
    }

    @Override // X.InterfaceC744180THc
    public final Analysis getAnalysis() {
        long j;
        long j2 = 0;
        try {
            String str = this.LLJJ;
            j = str != null ? CastLongProtector.parseLong(str) : 0L;
            try {
                String str2 = this.LLJJI;
                if (str2 != null) {
                    j2 = CastLongProtector.parseLong(str2);
                }
            } catch (Exception e) {
                e = e;
                TryCatchGuardChecker.doCheck(e);
            }
        } catch (Exception e2) {
            e = e2;
            j = 0;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("page_model", "detail");
            String str3 = this.LLJJ;
            if (str3 == null) {
                str3 = "";
            }
            jSONObject.put("music_id", str3);
            String str4 = this.LLJILLL;
            if (str4 == null) {
                str4 = "";
            }
            jSONObject.put("single_song_shoot_previous_page", str4);
            String str5 = this.LLJJIII;
            if (str5 == null) {
                str5 = "";
            }
            jSONObject.put("single_song_shoot_previous_enter_method", str5);
            String str6 = this.LLJJIJI;
            jSONObject.put("previous_search_query", str6 != null ? str6 : "");
        } catch (JSONException e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        Analysis analysis = new Analysis();
        analysis.setLabelName("single_song");
        analysis.setExt_value(j);
        analysis.setValue(j2);
        analysis.setExt_json(jSONObject);
        return analysis;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0mWi] */
    public MusicDetailRootFragment() {
        aS(AFwS259S0000000_21.get$arr$(201));
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, X.InterfaceC214902198i
    public final void YP() {
        InterfaceC214897198d interfaceC214897198d;
        AnonymousClass1993 anonymousClass1993;
        C1202330hOR c1202330hOR;
        BaseActivity baseActivity;
        C1361400lX0 c1361400lX0;
        if (ib() != null) {
            super.YP();
            return;
        }
        InterfaceC1670800ta2 activity = getActivity();
        if (C294780Bgy.LIZ()) {
            if (!(activity instanceof InterfaceC214897198d) || (interfaceC214897198d = (InterfaceC214897198d) activity) == null) {
                return;
            }
        } else if (!(activity instanceof InterfaceC214897198d) || (interfaceC214897198d = (InterfaceC214897198d) activity) == null || !interfaceC214897198d.getEnableSAF()) {
            return;
        }
        if (interfaceC214897198d.migrateDarkModeImplToFragment()) {
            C19EG activity2 = getActivity();
            if (!(activity2 instanceof BaseActivity) || (baseActivity = (BaseActivity) activity2) == null) {
                return;
            }
            C755440TkE.LIZ(baseActivity);
            if (C960203pA.LIZIZ(baseActivity) && baseActivity.isDarkModeSupported()) {
                SAFFragmentRootScene sAFFragmentRootSceneIb = ib();
                Context sceneContext = sAFFragmentRootSceneIb != null ? sAFFragmentRootSceneIb.getSceneContext() : null;
                if ((sceneContext instanceof C488650JEh) && (c1361400lX0 = (C1361400lX0) sceneContext) != null) {
                    c1361400lX0.setTheme(R.style.y0);
                }
            }
        }
        if (interfaceC214897198d.migrateImmersiveBarImplToFragment()) {
            AnonymousClass1991 anonymousClass1991LIZIZ = C1800490wxD.LIZIZ(this);
            if (!(anonymousClass1991LIZIZ instanceof AnonymousClass1993) || (anonymousClass1993 = (AnonymousClass1993) anonymousClass1991LIZIZ) == null || (c1202330hOR = anonymousClass1993.LJIL) == null || !(!c1202330hOR.LIZIZ)) {
                return;
            }
            C1202340hOS.LIZJ(C1202340hOS.LIZ(this, c1202330hOR, true, false), c1202330hOR);
        }
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, X.InterfaceC214902198i
    public final void finish() {
        SAFTikTokFragment sAFTikTokFragmentLIZIZ = C1399730mWp.LIZIZ(this);
        if (sAFTikTokFragmentLIZIZ != null) {
            sAFTikTokFragmentLIZIZ.finish();
        } else {
            super.finish();
        }
    }

    public final C1401320mZO hS() {
        MatchedSoundInfo matchedSongInfo;
        String id = null;
        if (C297090Bkh.LIZ() && this.LLJJIJIIJIL) {
            return null;
        }
        if (this.LLJJJIL == null) {
            C1401320mZO c1401320mZO = new C1401320mZO();
            c1401320mZO.LLILLL = true;
            String str = this.LLJJ;
            String str2 = c1401320mZO.LLJI;
            Music music = this.LLJJJ;
            if (music != null && (matchedSongInfo = music.getMatchedSongInfo()) != null) {
                id = matchedSongInfo.getId();
            }
            c1401320mZO.LJIJI(str, str2, id);
            this.LLJJJIL = c1401320mZO;
        }
        return this.LLJJJIL;
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, X.InterfaceC214902198i
    public final boolean onBackPressed() {
        SAFTikTokFragment sAFTikTokFragmentLIZIZ = C1399730mWp.LIZIZ(this);
        return sAFTikTokFragmentLIZIZ != null ? sAFTikTokFragmentLIZIZ.onBackPressed() : super.onBackPressed();
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        AnalysisActivityComponent analysisActivityComponent = this.LLJJLIIIJLLLLLLLZ;
        if (analysisActivityComponent != null) {
            analysisActivityComponent.LIZIZ(this.LLJL);
        }
        LIZ(false);
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        AnalysisActivityComponent analysisActivityComponent = this.LLJJLIIIJLLLLLLLZ;
        if (analysisActivityComponent != null) {
            analysisActivityComponent.LL = System.currentTimeMillis();
        }
        LIZ(true);
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        IBenchmarkService iBenchmarkServiceCreateIBenchmarkServicebyMonsterPlugin = BenchmarkServiceImpl.createIBenchmarkServicebyMonsterPlugin(false);
        if (iBenchmarkServiceCreateIBenchmarkServicebyMonsterPlugin != null) {
            iBenchmarkServiceCreateIBenchmarkServicebyMonsterPlugin.startBenchmark(4);
        }
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        IBenchmarkService iBenchmarkServiceCreateIBenchmarkServicebyMonsterPlugin = BenchmarkServiceImpl.createIBenchmarkServicebyMonsterPlugin(false);
        if (iBenchmarkServiceCreateIBenchmarkServicebyMonsterPlugin != null) {
            iBenchmarkServiceCreateIBenchmarkServicebyMonsterPlugin.stopBenchmark();
        }
    }

    @Override // X.InterfaceC21659319pf
    public final View uN() {
        View view = getView();
        if (view != null) {
            return view.findViewById(R.id.frc);
        }
        return null;
    }

    @Override // X.InterfaceC1740760vOs
    public final String w3() {
        return String.valueOf(hashCode());
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.LLJJLIIIJLLLLLLLZ = new AnalysisActivityComponent(this);
        C818480W8w.LIZ("single_song");
    }

    @Override // X.InterfaceC655270Pn3
    public final void registerActivityOnKeyDownListener(InterfaceC1399350mWD interfaceC1399350mWD) {
        if (!isAdded()) {
            return;
        }
        List<InterfaceC1399350mWD> list = this.LLJJJJ;
        if (list != null && list.contains(interfaceC1399350mWD)) {
            return;
        }
        if (this.LLJJJJ == null) {
            this.LLJJJJ = new ArrayList();
        }
        List<InterfaceC1399350mWD> list2 = this.LLJJJJ;
        if (list2 != null) {
            list2.add(interfaceC1399350mWD);
        }
    }

    @Override // X.InterfaceC655270Pn3
    public final void unRegisterActivityOnKeyDownListener(InterfaceC1399350mWD interfaceC1399350mWD) {
        List<InterfaceC1399350mWD> list = this.LLJJJJ;
        if (list != null) {
            ((ArrayList) list).remove(interfaceC1399350mWD);
        }
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, X.InterfaceC214902198i
    public final Boolean onKeyDown(int i, KeyEvent keyEvent) {
        List<InterfaceC1399350mWD> list = this.LLJJJJ;
        if (list != null) {
            Iterator<InterfaceC1399350mWD> it2 = list.iterator();
            while (it2.hasNext()) {
                if (it2.next().onKeyDown(i, keyEvent)) {
                    return Boolean.TRUE;
                }
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) throws Throwable {
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        int i;
        String string6;
        String string7;
        Serializable serializable;
        Integer numValueOf;
        boolean z;
        String string8;
        String string9;
        String string10;
        String string11;
        String string12;
        String string13;
        String string14;
        C19EG activity;
        Window window;
        super.onViewCreated(view, bundle);
        if (a5.LIZ() && (activity = getActivity()) != null && (window = activity.getWindow()) != null) {
            window.addFlags(128);
        }
        View viewFindViewById = view.findViewById(R.id.w0u);
        if (viewFindViewById != null) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById);
        }
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            string = arguments2.getString(FollowStatusChangeMethod.PARAM_UID);
        } else {
            string = null;
        }
        this.LLJJ = string;
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            string2 = arguments3.getString("partnerMusicId");
        } else {
            string2 = null;
        }
        if (TextUtils.isEmpty(this.LLJJ) && TextUtils.isEmpty(string2)) {
            finish();
        } else {
            Bundle arguments4 = getArguments();
            if (arguments4 != null) {
                string3 = arguments4.getString("aweme_id");
            } else {
                string3 = null;
            }
            this.LLJJI = string3;
            Bundle arguments5 = getArguments();
            if (arguments5 != null) {
                string4 = arguments5.getString("extra_music_from");
            } else {
                string4 = null;
            }
            this.LLJILLL = string4;
            Bundle arguments6 = getArguments();
            if (arguments6 == null || (string5 = arguments6.getString("extra_music_from")) == null) {
                string5 = this.LLJILLL;
            }
            C786410Ut5.LJJJI("first_enter_from", string5, arguments);
            if (Intrinsics.LJFF("search_result", this.LLJILLL)) {
                i = 2;
            } else {
                Bundle arguments7 = getArguments();
                if (arguments7 != null) {
                    i = arguments7.getInt("extra_enter_from", 0);
                } else {
                    i = 0;
                }
            }
            arguments.putInt("extra_enter_from", i);
            Bundle arguments8 = getArguments();
            if (arguments8 != null) {
                string6 = arguments8.getString("enter_method");
            } else {
                string6 = null;
            }
            this.LLJJIII = string6;
            Bundle arguments9 = getArguments();
            if (arguments9 != null) {
                string7 = arguments9.getString("previous_search_query");
            } else {
                string7 = null;
            }
            this.LLJJIJI = string7;
            Bundle arguments10 = getArguments();
            if (arguments10 != null) {
                serializable = arguments10.getSerializable("enter_music_from_pre_page");
            } else {
                serializable = null;
            }
            this.LLJJJ = (Music) serializable;
            Bundle arguments11 = getArguments();
            if (arguments11 != null) {
                numValueOf = Integer.valueOf(arguments11.getInt("open_edit_sheet", 0));
            } else {
                numValueOf = null;
            }
            if (numValueOf != null && numValueOf.intValue() == 1) {
                arguments.putBoolean("open_edit_sheet", true);
            }
            if (!arguments.containsKey("tt_to_dsp_log_extra")) {
                C786410Ut5.LJJIZ(arguments, "tt_to_dsp_log_extra", new TTToDspLogExtra());
            }
            Bundle arguments12 = getArguments();
            if (arguments12 != null && arguments12.getBoolean("extra_enter_mdp_from_vidoe_music_basic_vm")) {
                z = true;
            } else {
                z = false;
            }
            this.LLJJIJIIJIL = z;
            ICommercePageTrackingService iCommercePageTrackingServiceLIZLLL = ((ICommerceService) ServiceManager.get().getService(ICommerceService.class)).LIZLLL();
            Bundle arguments13 = getArguments();
            if (arguments13 != null) {
                string8 = arguments13.getString("aweme_id");
            } else {
                string8 = null;
            }
            iCommercePageTrackingServiceLIZLLL.LIZIZ(string8);
            Bundle arguments14 = getArguments();
            String str = "";
            if (arguments14 != null && (string13 = arguments14.getString("process_id", "")) != null) {
                str = string13;
            }
            this.LLJJIJIL = str;
            Bundle arguments15 = getArguments();
            if (arguments15 != null) {
                string9 = arguments15.getString("author_id");
            } else {
                string9 = null;
            }
            this.LLJJJJLIIL = string9;
            Bundle arguments16 = getArguments();
            if (arguments16 != null) {
                string10 = arguments16.getString("group_id");
            } else {
                string10 = null;
            }
            this.LLJJL = string10;
            Bundle arguments17 = getArguments();
            if (arguments17 != null) {
                string11 = arguments17.getString("banner_id");
            } else {
                string11 = null;
            }
            Bundle arguments18 = getArguments();
            if (arguments18 != null) {
                string12 = arguments18.getString("banner_type");
            } else {
                string12 = null;
            }
            if (TextUtils.equals(this.LLJILLL, "choose_music_with_banner")) {
                ((ICommerceMediaService) ServiceManager.get().getService(ICommerceMediaService.class)).LJIILJJIL(this).nX(string11, string12);
            }
            if (Intrinsics.LJFF("collection_music", this.LLJILLL)) {
                C1458960o4M.LIZ = true;
            }
            if (C0BM3.LIZ()) {
                hS();
            }
            Bundle arguments19 = getArguments();
            if (arguments19 != null && arguments19.getBoolean("send_enter_mob", false)) {
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("enter_from", this.LLJILLL);
                c2344009Gk.LJIIIIZZ("enter_method", this.LLJJIII);
                c2344009Gk.LJIIIIZZ("music_id", this.LLJJ);
                c2344009Gk.LJIIIIZZ("process_id", this.LLJJIJIL);
                c2344009Gk.LJIIIIZZ("group_id", C1443560nfW.LJIIIIZZ());
                c2344009Gk.LJIIIIZZ("from_group_id", C1443560nfW.LJIIIIZZ());
                C20684815ws.LJIILLIIL("enter_music_detail", c2344009Gk.LIZ);
            }
            FragmentManager childFragmentManager = getChildFragmentManager();
            C19EH c19ehLJIIJ = childFragmentManager.LJIIJ();
            Fragment fragmentLJJJJZI = childFragmentManager.LJJJJZI("music_detail_fragment_tag");
            if (fragmentLJJJJZI == null) {
                MusicDetailFragment.LLJJI.getClass();
                fragmentLJJJJZI = new MusicDetailFragment();
                fragmentLJJJJZI.setArguments(arguments);
            }
            fragmentLJJJJZI.setUserVisibleHint(true);
            c19ehLJIIJ.LJIJ(R.id.eqx, fragmentLJJJJZI, "music_detail_fragment_tag");
            c19ehLJIIJ.LJIIIZ();
        }
        BtmSDK btmSDK = BtmSDK.INSTANCE;
        Bundle arguments20 = getArguments();
        if (arguments20 != null) {
            string14 = arguments20.getString("source_btm_token");
        } else {
            string14 = null;
        }
        btmSDK.registerBtmPageOnCreate(this, "a2270.b5171", string14);
        C1399330mWB.LIZ.getClass();
        C1399330mWB.LIZIZ = System.currentTimeMillis();
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558360qeg.LJFF(this, null), "source_default_key", C627690Ojf.class, null);
        if (interfaceC1555100qZQLIZIZ != null) {
            interfaceC1555100qZQLIZIZ.LIZ(new AfS190S0100000_21(this, 25));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.dpm, viewGroup, false);
        C19GS c19gs = null;
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

    @Override // androidx.fragment.app.SAFTikTokFragment, X.InterfaceC214902198i
    public final boolean onResult(int i, int i2, Intent intent) {
        if (i == 10086 && i2 == -1) {
            SAFTikTokFragment sAFTikTokFragmentLIZIZ = C1399730mWp.LIZIZ(this);
            if (sAFTikTokFragmentLIZIZ == null) {
                sAFTikTokFragmentLIZIZ = this;
            }
            C1399730mWp.LIZ(sAFTikTokFragmentLIZIZ, intent);
            finish();
            return true;
        }
        return false;
    }
}
