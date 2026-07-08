package com.ss.android.ugc.aweme.search.pages.choosemusic.result.core.ui;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C087R;
import X.C098200Yq;
import X.C0OGJ;
import X.C0Q3E;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1388190mED;
import X.C13IQ;
import X.C13LE;
import X.C1458070o2v;
import X.C14EU;
import X.C15HO;
import X.C15IK;
import X.C15IZ;
import X.C15JP;
import X.C1622206Wu;
import X.C1654360t9W;
import X.C1659630tI1;
import X.C1685300txQ;
import X.C189200o6;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C1ER1;
import X.C20496915Ih;
import X.C20684815ws;
import X.C2204961BRm;
import X.C2217381BqS;
import X.C2344009Gk;
import X.C301880BsQ;
import X.C338490DOt;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C452501pT;
import X.C580830MqH;
import X.C640060P8q;
import X.C646000PVm;
import X.C649290PdP;
import X.C650950Pg5;
import X.C650960Pg6;
import X.C664030Q2v;
import X.C679990Qlp;
import X.C681160Qni;
import X.C681170Qnj;
import X.C681180Qnk;
import X.C681190Qnl;
import X.C681210Qnn;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C7740030o;
import X.C786410Ut5;
import X.C987103tV;
import X.EnumC648990Pcv;
import X.InterfaceC20499515Jh;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC680000Qlq;
import X.InterfaceC681200Qnm;
import X.InterfaceC724760Sbq;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.k;
import com.google.gson.n;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.choosemusic.fragment.BaseChooseMusicFragment;
import com.ss.android.ugc.aweme.choosemusic.model.ChooseMusicWithSceneViewModel;
import com.ss.android.ugc.aweme.choosemusic.utils.ChooseMusicDownloadPlayHelper;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.service.IMusicService;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.search.lynx.core.config.SearchResultConfig;
import com.ss.android.ugc.aweme.search.middle.SearchStartViewModel;
import com.ss.android.ugc.aweme.search.pages.choosemusic.core.ui.SearchMusicBaseFragment;
import com.ss.android.ugc.aweme.search.pages.choosemusic.result.core.viewmodel.DynamicSearchMusicResultViewModel;
import com.ss.android.ugc.aweme.search.pages.choosemusic.result.core.viewmodel.SearchMusicPlayViewModel;
import com.ss.android.ugc.aweme.search.pages.choosemusic.sug.core.viewmodel.ChooseSearchMusicViewModel;
import com.ss.android.ugc.aweme.search.player.core.viewmodel.MusicPlayHelper;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.AwS624S0100000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class DynamicSearchMusicResultFragment extends SearchMusicBaseFragment implements InterfaceC680000Qlq, InterfaceC20499515Jh {
    public static final C681180Qnk LLJJIJIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJ;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYpKD0wIGs8KCg2O2svISA8OyAhPDw6K2HELIOSs+LDwmJDFiKiAhLWs5IGEXMSstJCYwGyAtOyw7BTA/ICwBLTY5JTsVOiQrJCo9PA==";
    public MusicPlayHelper LLILLL;
    public int LLILZ;
    public long LLILZIL;
    public boolean LLILZLL;
    public long LLIZ;
    public String LLIZLLLIL;
    public InterfaceC681200Qnm LLJ;
    public LogPbBean LLJIJIL;
    public C649290PdP LLJILJILJ;
    public ViewGroup LLJILLL;
    public C679990Qlp LLJJ;
    public final AssemVMLazy LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public int LLJI = -1;
    public String LLJILJIL = "";
    public final Gson LLJJI = C7740030o.LIZ().getGson();
    public final C01GW LLJJIII = C452501pT.LIZIZ(new AwS554S0100000_10(this, 375));

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0Qnk] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(DynamicSearchMusicResultFragment.class, "musicPlayViewModel", "getMusicPlayViewModel()Lcom/ss/android/ugc/aweme/search/pages/choosemusic/result/core/viewmodel/SearchMusicPlayViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJIJIL = new Object() { // from class: X.0Qnk
        };
    }

    @Override // X.InterfaceC20499515Jh
    public final /* synthetic */ void J2(MusicModel musicModel, long j) {
    }

    @Override // X.InterfaceC20499515Jh
    public final MusicModel LJI() {
        return null;
    }

    @Override // X.InterfaceC20499515Jh
    public final /* synthetic */ void LLJILJILJ(MusicModel musicModel, Exception exc) {
    }

    @Override // com.ss.android.ugc.aweme.search.pages.choosemusic.core.ui.SearchMusicBaseFragment
    public final void MR(String str) {
    }

    @Override // X.InterfaceC20499515Jh
    public final /* synthetic */ void ba(MusicModel musicModel) {
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment
    public final boolean isRegisterEventBus() {
        return true;
    }

    @Override // X.InterfaceC20499515Jh
    public final /* synthetic */ void v2() {
    }

    @Override // X.InterfaceC20499515Jh
    public final /* synthetic */ void y4(Map map, MusicModel musicModel, String str) {
    }

    public DynamicSearchMusicResultFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SearchMusicPlayViewModel.class);
        AwS554S0100000_10 awS554S0100000_10 = new AwS554S0100000_10((C13IQ) c19719912DlLIZ, 376);
        AFwS241S0000000_10 aFwS241S0000000_10 = AFwS241S0000000_10.get$arr$(190);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS554S0100000_10, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS554S0100000_10((HasDefaultViewModelProviderFactory) this, 377), aFwS241S0000000_10, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS554S0100000_10, new AwS554S0100000_10((Fragment) this, 378), aFwS241S0000000_10, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS554S0100000_10, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS554S0100000_10((HasDefaultViewModelProviderFactory) this, 379), aFwS241S0000000_10, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJJIJI = assemVMLazy;
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 380));
    }

    public final SearchMusicPlayViewModel NR() {
        AssemVMLazy assemVMLazy = this.LLJJIJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJ;
        return (SearchMusicPlayViewModel) assemVMLazy.getValue();
    }

    public final DynamicSearchMusicResultViewModel OR() {
        return (DynamicSearchMusicResultViewModel) this.LLJJIJIIJIL.getValue();
    }

    public final void RR() {
        String strLJIL;
        C664030Q2v c664030Q2v;
        String str;
        n nVar;
        k kVarLJJIIZ;
        C649290PdP c649290PdP = this.LLJILJILJ;
        if (c649290PdP == null) {
            c649290PdP = null;
        }
        c649290PdP.LJIIIZ(C0Q3E.LIZIZ(this));
        String str2 = this.LL;
        try {
            SearchResultConfig searchResultConfigLIZ = C301880BsQ.LIZ();
            if (searchResultConfigLIZ == null || (nVar = searchResultConfigLIZ.musicCreateResults) == null || (kVarLJJIIZ = nVar.LJJIIZ("schema")) == null || (strLJIL = kVarLJJIIZ.LJIL()) == null) {
                strLJIL = "aweme://lynxview/?channel=fe_search_vertical_lynx&bundle=music-create-results/template.js&dynamic=1&surl=https://lf16-gecko-source.tiktokcdn.com/obj/byte-gurd-source-sg/8/gecko/resource/fe_search_vertical_lynx/music-create-results/template.js&ab_params=search_video_mask_gradual_opt,optimize_search_preload_cover,search_create_page_lynx";
            }
            Uri.Builder builderBuildUpon = UriProtector.parse(strLJIL).buildUpon();
            String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            Uri.Builder builderAppendQueryParameter = builderBuildUpon.appendQueryParameter("keyword", str2);
            C650950Pg5.Companion.getClass();
            C650960Pg6 c650960Pg6LJII = C646000PVm.LJII(this, this);
            if (c650960Pg6LJII != null && (c664030Q2v = c650960Pg6LJII.searchVideoModel) != null && (str = c664030Q2v.groupId) != null) {
                str3 = str;
            }
            builderAppendQueryParameter.appendQueryParameter("lastFromGroupId", str3);
            DynamicPatch dynamicPatch = new DynamicPatch();
            dynamicPatch.schema = builderBuildUpon.toString();
            C649290PdP c649290PdP2 = this.LLJILJILJ;
            if (c649290PdP2 == null) {
                c649290PdP2 = null;
            }
            c649290PdP2.LJFF(dynamicPatch, null, true, false, false, null);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    @Override // X.InterfaceC20499515Jh
    public final Activity LLILLL() {
        return getActivity();
    }

    public final void SR() {
        SearchMusicPlayViewModel searchMusicPlayViewModelNR = NR();
        searchMusicPlayViewModelNR.withState(new AwS589S0100000_10(searchMusicPlayViewModelNR, 467));
        searchMusicPlayViewModelNR.p8(null);
        NR();
        C1ER1.LIZIZ.LJLIIIL();
        MusicPlayHelper musicPlayHelper = this.LLILLL;
        if (musicPlayHelper != null) {
            musicPlayHelper.BQ2(null, false);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        super.onDestroyView();
        SearchMusicPlayViewModel searchMusicPlayViewModelNR = NR();
        searchMusicPlayViewModelNR.LL = null;
        searchMusicPlayViewModelNR.LLILZ = null;
        C649290PdP c649290PdP = this.LLJILJILJ;
        if (c649290PdP == null) {
            c649290PdP = null;
        }
        View viewLIZIZ = c649290PdP.LIZIZ();
        if ((viewLIZIZ instanceof SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) && (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = (SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) viewLIZIZ) != null) {
            boolean z = SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLLILZJ;
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJJ(true);
        }
        SAFHelper sAFHelper = SAFHelper.LIZ;
        Context context = getContext();
        C19EG c19egLIZIZ = context != null ? C1388190mED.LIZIZ(context) : null;
        sAFHelper.getClass();
        C640060P8q.LIZ.LIZIZ(Integer.valueOf(SAFHelper.LJIILL(this, c19egLIZIZ)));
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        SR();
    }

    @Override // X.InterfaceC20499515Jh
    public final boolean LLJLLIL() {
        return this.mStatusViewValid;
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b5  */
    @Override // X.InterfaceC680000Qlq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void JN(com.google.gson.n r14) {
        /*
            Method dump skipped, instruction units count: 848
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.choosemusic.result.core.ui.DynamicSearchMusicResultFragment.JN(com.google.gson.n):void");
    }

    public final void PR(Context context) {
        ViewGroup viewGroup;
        try {
            C649290PdP c649290PdP = new C649290PdP(this, context, this, (EnumC648990Pcv) null, 24);
            this.LLJILJILJ = c649290PdP;
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = c649290PdP.LJIILIIL;
            ViewParent parent = null;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
                parent = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getParent();
            }
            if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                C786410Ut5.LJJJJI(viewGroup);
            }
            RR();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @C14EU
    public final void onCollectMusicEvent(C0OGJ c0ogj) {
        C087R.LIZ.getClass();
        C087R.LIZJ();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10501, "com/ss/android/ugc/aweme/search/pages/choosemusic/result/core/ui/DynamicSearchMusicResultFragment", "onHiddenChanged", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmtYo3N1HzhDDRLpI7nb2pWYPuNWKQF85SqQy3J62JvXlVmQxzq16HofFDGUld+gxZrOz71WsRxQoQS+MIT5ag9xIoBnsz35A==", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        super.onHiddenChanged(z);
        if (z) {
            SR();
        }
    }

    @C14EU
    public final void onShootSearchMusicEvent(C681170Qnj c681170Qnj) {
        NR().ru(c681170Qnj.LIZ.convertToMusicModel());
    }

    @C14EU
    public final void onTrimMusicEvent(C681160Qni c681160Qni) {
        DynamicSearchMusicResultViewModel dynamicSearchMusicResultViewModelOR;
        SR();
        if (isAdded() && (dynamicSearchMusicResultViewModelOR = OR()) != null) {
            C681190Qnl c681190Qnl = new Object() { // from class: X.0Qnl
            };
            MusicModel musicModel = c681160Qni.LIZ;
            C15HO c15ho = dynamicSearchMusicResultViewModelOR.LL;
            String str = dynamicSearchMusicResultViewModelOR.LLILZIL;
            String str2 = "";
            if (str == null) {
                str = "";
            }
            String str3 = c681160Qni.LIZIZ;
            String str4 = c681160Qni.LIZJ;
            c681190Qnl.getClass();
            C15HO c15hoClone = c15ho.clone();
            musicModel.setSearchId(str);
            c15hoClone.LJIIIZ = str;
            c15hoClone.LIZ = "search_music";
            c15hoClone.LIZJ = "change_music_video";
            String str5 = C15IK.LIZ;
            if (Intrinsics.LJFF(str5, "video_shoot_page")) {
                str2 = "shoot_page_search";
            } else if (Intrinsics.LJFF(str5, "video_edit_page")) {
                str2 = "edit_page_search";
            }
            c15hoClone.LJIIJ = str2;
            c15hoClone.LJIILL = str3;
            c15hoClone.LJIILJJIL = str4;
            ((IMusicService) ServiceManager.get().getService(IMusicService.class)).LJJJ(this, musicModel, c15hoClone);
        }
    }

    @Override // com.ss.android.ugc.aweme.search.pages.choosemusic.core.ui.SearchMusicBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        NextLiveData<Boolean> nextLiveDataVQ2;
        boolean booleanExtra;
        Intent intent;
        super.onViewCreated(view, bundle);
        if (getActivity() == null) {
            return;
        }
        if (isAdded()) {
            this.LLILLL = (MusicPlayHelper) C1659630tI1.LJII(view, getActivity(), 4).get(MusicPlayHelper.class);
        }
        C1ER1.LIZIZ.LLILLIZIL(hashCode());
        DataCenter dataCenterVQ2 = DataCenter.vQ2(ViewModelProviders.of(this), this);
        final SearchMusicPlayViewModel searchMusicPlayViewModelNR = NR();
        ChooseMusicDownloadPlayHelper chooseMusicDownloadPlayHelper = new ChooseMusicDownloadPlayHelper(this, new C15JP() { // from class: X.0Qng
            @Override // X.C15JP
            public final void LIZ() {
                C201955140j.LJ("play music error");
            }

            @Override // X.C15JP
            public final void LIZIZ() {
                SearchMusicPlayViewModel searchMusicPlayViewModel = searchMusicPlayViewModelNR;
                searchMusicPlayViewModel.getClass();
                searchMusicPlayViewModel.withState(new AwS589S0100000_10(searchMusicPlayViewModel, 467));
                searchMusicPlayViewModel.p8(null);
            }
        });
        searchMusicPlayViewModelNR.LLILZ = chooseMusicDownloadPlayHelper;
        chooseMusicDownloadPlayHelper.Mf();
        ChooseMusicDownloadPlayHelper chooseMusicDownloadPlayHelper2 = searchMusicPlayViewModelNR.LLILZ;
        if (chooseMusicDownloadPlayHelper2 != null) {
            chooseMusicDownloadPlayHelper2.Tf(new C15IZ() { // from class: X.0Qnh
                @Override // X.C15IZ
                public final void LIZ() {
                    DataCenter dataCenter = searchMusicPlayViewModelNR.LL;
                    if (dataCenter != null) {
                        dataCenter.zQ2(Boolean.FALSE, "music_loading");
                    }
                }
            });
        }
        searchMusicPlayViewModelNR.LL = dataCenterVQ2;
        dataCenterVQ2.yQ2("music_loading", searchMusicPlayViewModelNR, false);
        if (this.LLJILJILJ == null) {
            PR(requireContext());
        }
        C649290PdP c649290PdP = this.LLJILJILJ;
        ViewGroup viewGroup = null;
        if (c649290PdP == null) {
            c649290PdP = null;
        }
        View viewLIZIZ = c649290PdP.LIZIZ();
        ViewGroup viewGroup2 = this.LLJILLL;
        if (viewGroup2 != null) {
            viewGroup2.addView(viewLIZIZ, new ViewGroup.LayoutParams(-1, -1));
            ViewGroup viewGroup3 = this.LLJILLL;
            if (viewGroup3 != null) {
                viewGroup = viewGroup3;
            }
            C786410Ut5.LJLZ(0, viewGroup);
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.LLILZ = arguments.getInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", 0);
            SearchMusicPlayViewModel searchMusicPlayViewModelNR2 = NR();
            int i = this.LLILZ;
            ChooseMusicDownloadPlayHelper chooseMusicDownloadPlayHelper3 = searchMusicPlayViewModelNR2.LLILZ;
            if (chooseMusicDownloadPlayHelper3 != null) {
                chooseMusicDownloadPlayHelper3.LLILLJJLI = i;
            }
            this.LLIZLLLIL = arguments.getString("creation_id");
            SearchMusicPlayViewModel searchMusicPlayViewModelNR3 = NR();
            C19EG activity = getActivity();
            if (activity != null && (intent = activity.getIntent()) != null) {
                booleanExtra = intent.getBooleanExtra("extra_beat_music_sticker", false);
            } else {
                booleanExtra = false;
            }
            searchMusicPlayViewModelNR3.LLILLJJLI = booleanExtra;
            this.LLILZIL = arguments.getLong("max_video_duration", 0L);
            DynamicSearchMusicResultViewModel dynamicSearchMusicResultViewModelOR = OR();
            if (dynamicSearchMusicResultViewModelOR != null) {
                long j = this.LLILZIL;
                dynamicSearchMusicResultViewModelOR.LLIZ = j;
                dynamicSearchMusicResultViewModelOR.LL.LJIIJJI = j;
            }
            this.LLILZLL = arguments.getBoolean("get_unlimited_music_only", false);
            DynamicSearchMusicResultViewModel dynamicSearchMusicResultViewModelOR2 = OR();
            if (dynamicSearchMusicResultViewModelOR2 != null) {
                dynamicSearchMusicResultViewModelOR2.LLILLL = this.LLILZLL;
            }
        }
        DynamicSearchMusicResultViewModel dynamicSearchMusicResultViewModelOR3 = OR();
        if (dynamicSearchMusicResultViewModelOR3 != null) {
            dynamicSearchMusicResultViewModelOR3.getClass();
        }
        DynamicSearchMusicResultViewModel dynamicSearchMusicResultViewModelOR4 = OR();
        if (dynamicSearchMusicResultViewModelOR4 != null) {
            dynamicSearchMusicResultViewModelOR4.LLILZLL = this;
        }
        ChooseSearchMusicViewModel chooseSearchMusicViewModel = this.LLILLJJLI;
        if (chooseSearchMusicViewModel != null) {
            C736680Sv4.LJIIIIZZ(this, chooseSearchMusicViewModel, new C2217381BqS() { // from class: X.0QnU
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C681100Qnc) obj).LLILLL;
                }
            }, null, new AwS624S0100000_10(this, 40), 6);
        }
        SearchStartViewModel searchStartViewModel = (SearchStartViewModel) this.LLJJIII.getValue();
        if (searchStartViewModel != null && (nextLiveDataVQ2 = searchStartViewModel.vQ2()) != null) {
            nextLiveDataVQ2.setValue(Boolean.TRUE);
        }
    }

    @Override // X.InterfaceC20499515Jh
    public final void LLJJL(MusicModel musicModel, String str, String str2) throws Throwable {
        String str3;
        C679990Qlp c679990Qlp;
        if (musicModel != null && str2 != null && str != null) {
            DynamicSearchMusicResultViewModel dynamicSearchMusicResultViewModelOR = OR();
            if (dynamicSearchMusicResultViewModelOR == null || (c679990Qlp = dynamicSearchMusicResultViewModelOR.LLILLJJLI) == null || (str3 = c679990Qlp.LJIIIIZZ) == null) {
                str3 = "other";
            }
            InterfaceC681200Qnm interfaceC681200Qnm = this.LLJ;
            if (interfaceC681200Qnm != null) {
                BaseChooseMusicFragment baseChooseMusicFragment = ((C681210Qnn) interfaceC681200Qnm).LIZ;
                int i = baseChooseMusicFragment.LLILLL;
                C19EG activity = baseChooseMusicFragment.getActivity();
                if (activity != null) {
                    C15IK.LJIIIIZZ = str2;
                    if (i != 0 && i != 2) {
                        C2344009Gk c2344009Gk = new C2344009Gk();
                        c2344009Gk.LJIIIIZZ("shoot_way", "search_result");
                        C20684815ws.LJIILLIIL("shoot", c2344009Gk.LIZ);
                        RecordConfig.Builder builder = new RecordConfig.Builder();
                        builder.shootWay("search_result");
                        builder.musicPath(str);
                        builder.musicModel(musicModel);
                        builder.musicOrigin(str2);
                        ((IExternalService) ServiceManager.get().getService(IExternalService.class)).asyncService("ChooseMusic", new C580830MqH(activity, builder, musicModel, 5));
                        return;
                    }
                    Intent intent = new Intent();
                    intent.putExtra("path", str);
                    intent.putExtra("music_model", musicModel);
                    intent.putExtra("music_origin", str2);
                    if (C1458070o2v.LJFF()) {
                        intent.putExtra("is_music_loop", C1654360t9W.LIZIZ);
                    }
                    HashMap map = new HashMap();
                    map.put("music_shoot_from_search", "search_music");
                    map.put("music_enter_method", "click_music_publish");
                    map.put("music_enter_position", musicModel.getEnterPosition());
                    map.put("words_horder", str3);
                    if (musicModel.getLogPb() != null && !TextUtils.isEmpty(musicModel.getLogPb().getImprId())) {
                        map.put("music_search_id", musicModel.getLogPb().getImprId());
                    }
                    if (!TextUtils.isEmpty(musicModel.getSearchResultId())) {
                        map.put("music_search_result_id", musicModel.getSearchResultId());
                    } else if (!TextUtils.isEmpty(musicModel.getMusicId())) {
                        map.put("music_search_result_id", musicModel.getMusicId());
                    }
                    if (!TextUtils.isEmpty(musicModel.getListItemId())) {
                        map.put("music_list_item_id", musicModel.getListItemId());
                    }
                    intent.putExtra("extra_log_params", map);
                    C2204961BRm.LJIIL(-1, activity, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmgbJDd2T/+hJ7f32JIl4WAL/1caAPQ6v3iDgeaUxaEnvKZrXNkfUKMyld6", null));
                    ChooseMusicWithSceneViewModel chooseMusicWithSceneViewModel = baseChooseMusicFragment.LLLFFI;
                    if (chooseMusicWithSceneViewModel.LL) {
                        ((LiveData) chooseMusicWithSceneViewModel.LLILZLL.getValue()).setValue(new C20496915Ih(-1, intent));
                    } else {
                        activity.finish();
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19GS c19gs;
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.exa, viewGroup, false);
        this.LLJILLL = (ViewGroup) viewTd.findViewById(R.id.tq1);
        try {
            ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(viewTd, this);
            viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            } else {
                c19gs = null;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return viewTd;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return viewTd;
        }
    }
}
