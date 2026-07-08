package com.ss.android.ugc.aweme.choosemusic.fragment;

import X.C098200Yq;
import X.C0EBE;
import X.C1125404ai;
import X.C1233040iBy;
import X.C1457560o26;
import X.C14EU;
import X.C15HO;
import X.C15IC;
import X.C15IF;
import X.C15IG;
import X.C15II;
import X.C15IK;
import X.C15JB;
import X.C1659630tI1;
import X.C1685300txQ;
import X.C1776540wKa;
import X.C189200o6;
import X.C19EG;
import X.C19EH;
import X.C19GS;
import X.C681220Qno;
import X.C681430Qo9;
import X.C681620QoS;
import X.C786410Ut5;
import X.EnumC681490QoF;
import X.InterfaceC21506019Ek;
import X.InterfaceC362610EJn;
import X.InterfaceC681980Qp2;
import X.InterfaceC682070QpB;
import X.InterfaceC682120QpG;
import Y.AObserverS231S0100000_29;
import Y.ARunnableS110S0100000_10;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior;
import com.ss.android.ugc.aweme.choosemusic.activity.ChooseMusicActivity;
import com.ss.android.ugc.aweme.choosemusic.activity.MusicBottomSheetBehavior;
import com.ss.android.ugc.aweme.choosemusic.cutmusic.ChooseMusicCutViewModel;
import com.ss.android.ugc.aweme.choosemusic.model.ChooseMusicWithSceneViewModel;
import com.ss.android.ugc.aweme.choosemusic.view.ChooseMusicSelectView;
import com.ss.android.ugc.aweme.choosemusic.viewmodel.SelectedMusicViewModel;
import com.ss.android.ugc.aweme.commerce.tools.mission.Mission;
import com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService;
import com.ss.android.ugc.aweme.commercialize.mission.ICommerceMissionService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.model.IMusicRequestParam;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.search.ISearchService;
import com.ss.android.ugc.aweme.services.external.ICommerceToolsService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes32.dex */
public abstract class BaseChooseMusicFragment extends AmeBaseFragment implements View.OnClickListener, InterfaceC362610EJn, InterfaceC21506019Ek {
    public static final BPEAHandler LLLLIIL = new BPEAHandler(Looper.getMainLooper());
    public InterfaceC682070QpB LL;
    public InterfaceC681980Qp2 LLILLJJLI;
    public int LLILLL;
    public String LLILZ;
    public NewMusicTabFragment LLILZIL;
    public boolean LLILZLL;
    public String LLIZ;
    public Boolean LLIZLLLIL;
    public C15II LLJ;
    public C15JB LLJI;
    public Music LLJIJIL;
    public String LLJILJIL;
    public UrlModel LLJILJILJ;
    public IMusicRequestParam LLJILLL;
    public String LLJJ;
    public boolean LLJJI;
    public MusicModel LLJJIII;
    public String LLJJIJI;
    public String LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public boolean LLJJJ;
    public boolean LLJJJIL;
    public boolean LLJJJJ;
    public boolean LLJJJJJIL;
    public String LLJJJJLIIL;
    public String LLJJL;
    public String LLJJLIIIJLLLLLLLZ;
    public String LLJL;
    public long LLJLIL;
    public long LLJLILLLLZIIL;
    public boolean LLJLL;
    public boolean LLJLLIL;
    public boolean LLJLLL;
    public UrlModel LLJZ;
    public int LLJZIJLIL;
    public String LLL;
    public boolean LLLF;
    public boolean LLLFF;
    public ChooseMusicWithSceneViewModel LLLFFI;
    public int LLLFZ;
    public View LLLI;
    public View LLLII;
    public View LLLIIII;
    public View LLLIIIIL;
    public View LLLIIIL;
    public TuxTextView LLLIIL;
    public View LLLIILIL;
    public FrameLayout LLLIL;
    public View LLLILZ;
    public ViewStub LLLILZJ;
    public View LLLILZLLLI;
    public ChooseMusicSelectView LLLIZZ;
    public Mission LLLJ;
    public int LLLJIL = -1;
    public final List<String> LLLJL = C1125404ai.LIZ();
    public int LLLL = -1;
    public List<String> LLLLII = Collections.emptyList();
    public final ARunnableS110S0100000_10 LLLLIIIILLL = new ARunnableS110S0100000_10(this, 10);

    public void MR(int i) {
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment
    public final boolean isRegisterEventBus() {
        return true;
    }

    @Override // X.InterfaceC21506019Ek
    public final /* synthetic */ void onBackStackChangeCancelled() {
    }

    @Override // X.InterfaceC21506019Ek
    public final /* synthetic */ void onBackStackChangeCommitted(Fragment fragment, boolean z) {
    }

    @Override // X.InterfaceC21506019Ek
    public final /* synthetic */ void onBackStackChangeProgressed(C1776540wKa c1776540wKa) {
    }

    @Override // X.InterfaceC21506019Ek
    public final /* synthetic */ void onBackStackChangeStarted(Fragment fragment, boolean z) {
    }

    @Override // X.InterfaceC21506019Ek
    public final void onBackStackChanged() {
    }

    public final void NR() {
        this.LLILLJJLI.setLastSearchSoundPage(EnumC681490QoF.DISCOVER_PAGE);
        ((ISearchService) ServiceManager.get().getService(ISearchService.class)).LLIILZL().LIZ(getFragmentManager());
        FragmentManager childFragmentManager = getChildFragmentManager();
        Fragment fragmentLJJJJZ = childFragmentManager.LJJJJZ(R.id.iiy);
        if (fragmentLJJJJZ != null && fragmentLJJJJZ.isAdded()) {
            C19EH c19ehLJIIJ = childFragmentManager.LJIIJ();
            c19ehLJIIJ.LJIIZILJ(fragmentLJJJJZ);
            c19ehLJIIJ.LJIIJ();
        }
        View view = this.LLLIIIL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        View view2 = this.LLLIILIL;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(0, view2);
        }
        MR(0);
        this.LLILZLL = false;
    }

    public final void PR() {
        if (this.LLLILZ == null || getActivity() == null || this.LLLILZJ.getParent() == null) {
            return;
        }
        if (!this.LLJLLL || this.LLJILLL.isReplaceMusic()) {
            this.LLLILZJ.setLayoutResource(R.layout.cy9);
            ChooseMusicSelectView chooseMusicSelectView = new ChooseMusicSelectView(C786410Ut5.LJLLLL(this.LLLILZJ), getActivity(), this, C1659630tI1.LJ(this));
            this.LLLIZZ = chooseMusicSelectView;
            String str = C15IK.LIZ;
            C15HO c15ho = new C15HO(str, null, null, str);
            C15HO c15hoLIZ = c15ho.clone();
            chooseMusicSelectView.LLJJJ = c15hoLIZ;
            String str2 = c15ho.LIZ;
            c15hoLIZ.LJIIJ = (str2 == null || !a0.LJJIIZI(str2, "shoot", false)) ? "edit_selected_music" : "shoot_selected_music";
            ChooseMusicSelectView chooseMusicSelectView2 = this.LLLIZZ;
            int i = (int) this.LLJLILLLLZIIL;
            int i2 = (int) this.LLJLIL;
            chooseMusicSelectView2.LLJJIJI = i;
            chooseMusicSelectView2.LLJJIJIIJIL = i2;
            chooseMusicSelectView2.LLJILLL = new C15IC(this);
        }
    }

    public final void RR() {
        C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS110S0100000_10(this, 166));
    }

    public BaseChooseMusicFragment() {
        new TextWatcher() { // from class: X.15IH
            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        };
    }

    public final MusicBottomSheetBehavior OR() {
        C19EG activity = getActivity();
        if (activity instanceof ChooseMusicActivity) {
            ViewPagerBottomSheetBehavior viewPagerBottomSheetBehavior = ((ChooseMusicActivity) activity).LLILZLL;
            if (viewPagerBottomSheetBehavior == null || !(viewPagerBottomSheetBehavior instanceof MusicBottomSheetBehavior)) {
                return null;
            }
            return (MusicBottomSheetBehavior) viewPagerBottomSheetBehavior;
        }
        if (activity == null) {
            return null;
        }
        ViewPagerBottomSheetBehavior<View> viewPagerBottomSheetBehavior2 = this.LLLFFI.LLILLL;
        if (viewPagerBottomSheetBehavior2 instanceof MusicBottomSheetBehavior) {
            return (MusicBottomSheetBehavior) viewPagerBottomSheetBehavior2;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        getChildFragmentManager().LLD(this);
        C15JB c15jb = this.LLJI;
        if (c15jb != null) {
            c15jb.LJIIL();
        }
        ChooseMusicSelectView chooseMusicSelectView = this.LLLIZZ;
        if (chooseMusicSelectView != null) {
            chooseMusicSelectView.LIZ();
        }
        LLLLIIL.removeCallbacks(this.LLLLIIIILLL);
        super.onDestroyView();
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c4 A[PHI: r2
      0x00c4: PHI (r2v2 androidx.fragment.app.Fragment) = (r2v1 androidx.fragment.app.Fragment), (r2v5 androidx.fragment.app.Fragment) binds: [B:26:0x008d, B:35:0x00c2] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void SR(X.C665460Q8i r6) {
        /*
            Method dump skipped, instruction units count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.choosemusic.fragment.BaseChooseMusicFragment.SR(X.0Q8i):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        C1659630tI1.LJ(this).get(ChooseMusicCutViewModel.class);
        C1659630tI1.LJ(this).get(SelectedMusicViewModel.class);
        this.LLLFFI = (ChooseMusicWithSceneViewModel) C1659630tI1.LJ(this).get(ChooseMusicWithSceneViewModel.class);
        C1457560o26.LIZ.getClass();
        C1457560o26.LIZJ(0, "music_choose_page");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C19EG activity;
        if (view.getId() == R.id.tpb) {
            this.LLILLJJLI.setLastSearchSoundPage(EnumC681490QoF.SEARCH_SUG_PAGE);
            RR();
            return;
        }
        if (view.getId() != R.id.uce && view.getId() != R.id.eps) {
            if (view.getId() != R.id.bn2 || (activity = getActivity()) == null) {
                return;
            }
            activity.onBackPressed();
            return;
        }
        if (C681430Qo9.LIZ()) {
            if (!isAdded()) {
                return;
            }
            if (((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().LIZ()) {
                C1233040iBy c1233040iBy = new C1233040iBy(getContext());
                c1233040iBy.LIZIZ(2131828626);
                c1233040iBy.LIZLLL();
                return;
            }
            RR();
            Fragment fragmentLJJJJZ = getChildFragmentManager().LJJJJZ(R.id.iiy);
            if (fragmentLJJJJZ == 0 || !fragmentLJJJJZ.isAdded() || !(fragmentLJJJJZ instanceof InterfaceC682120QpG)) {
                return;
            }
            ((InterfaceC682120QpG) fragmentLJJJJZ).wH();
            return;
        }
        NR();
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        boolean z;
        super.onCreate(bundle);
        if (getArguments() != null) {
            boolean z2 = true;
            this.LLILLL = getArguments().getInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", 1);
            this.LLLFZ = getArguments().getInt("sound_page_scene", 0);
            this.LLILZ = getArguments().getString("challenge");
            this.LLJJJJLIIL = getArguments().getString("creation_id");
            this.LLJJL = getArguments().getString("content_source");
            this.LLJJLIIIJLLLLLLLZ = getArguments().getString("content_type");
            this.LLJL = getArguments().getString("shoot_way");
            getArguments().getSerializable("music_style");
            this.LLJIJIL = (Music) getArguments().getSerializable("sticker_music");
            this.LLJILJIL = getArguments().getString("first_sticker_music_ids", null);
            this.LLJILJILJ = (UrlModel) getArguments().getSerializable("effect_icon_url");
            IMusicRequestParam iMusicRequestParam = (IMusicRequestParam) getArguments().getSerializable("music_request_param");
            this.LLJILLL = iMusicRequestParam;
            if (iMusicRequestParam != null && iMusicRequestParam.getUnlimitedOnly()) {
                z = true;
            } else {
                z = false;
            }
            this.LLJLLL = z;
            this.LLJJI = getArguments().getBoolean("is_busi_sticker", false);
            this.LLJJ = getArguments().getString("first_sticker_id", null);
            this.LLJJIII = (MusicModel) getArguments().getSerializable("music_model");
            this.LLJJIJI = getArguments().getString("music_selected_from");
            this.LLJJIJIIJIL = getArguments().getString("music_selected_method");
            this.LLJJIJIL = getArguments().getBoolean("is_use_editor_pro_template", false);
            this.LLJJJ = getArguments().getBoolean("is_mv_theme_music");
            this.LLJJJIL = getArguments().getBoolean("music_allow_clear", false);
            this.LLJJJJ = getArguments().getBoolean("music_allow_cut", false);
            this.LLJJJJJIL = getArguments().getBoolean("music_is_photomv", false);
            getArguments().getBoolean("extra_beat_music_sticker", false);
            this.LLJLL = getArguments().getBoolean("hide_cancel_music_ui", false);
            boolean z3 = getArguments().getBoolean("should_show_local_music", false);
            this.LLJLLIL = z3;
            if (!z3 || this.LLJLLL) {
                z2 = false;
            }
            this.LLJLLIL = z2;
            this.LLIZ = getArguments().getString("music_default_query", "");
            this.LLIZLLLIL = Boolean.valueOf(getArguments().getBoolean("music_initial_load", false));
            this.LLL = getArguments().getString("reuse_original_sound_id");
            this.LLJZ = (UrlModel) getArguments().getSerializable("reuse_original_sound_url");
            this.LLJZIJLIL = getArguments().getInt("reuse_original_sound_length");
            this.LLLF = getArguments().getBoolean("enable_extend_music");
            this.LLLFF = getArguments().getBoolean("extra_show_lyric_tag", false);
            if (getArguments().getStringArrayList("music_suggested_queries") != null && !getArguments().getStringArrayList("music_suggested_queries").isEmpty()) {
                this.LLLLII = getArguments().getStringArrayList("music_suggested_queries");
                this.LLLL = -1;
            }
            if (this.LLJJJJ) {
                this.LLJLIL = getArguments().getLong("max_video_duration", 0L);
                this.LLJLILLLLZIIL = getArguments().getLong("shoot_video_length", 0L);
            } else {
                this.LLJLIL = 0L;
                this.LLJLILLLLZIIL = 0L;
            }
            C15IK.LJIILIIL = this.LLJJIJIL;
            long j = this.LLJLILLLLZIIL;
            if (j == 0) {
                j = this.LLJLIL;
            }
            C15IK.LJIIL = (int) j;
            this.LLLJ = Mission.newInstanceForMusic(getArguments().getString("mission_id"), getArguments().getString("mission_music_id"), null);
        }
        this.LL = ((ISearchService) ServiceManager.get().getService(ISearchService.class)).LLIILZL();
        this.LLILLJJLI = ((ICommerceToolsService) ServiceManager.get().getService(ICommerceToolsService.class)).getMusicContext();
        ((ICommerceMediaService) ServiceManager.get().getService(ICommerceMediaService.class)).LJIIL(this).o01();
    }

    @C14EU
    public void onSearchMusicPageStateEvent(C681220Qno c681220Qno) {
        if (c681220Qno == null) {
            return;
        }
        if (c681220Qno.LIZ == 0 || ((C681430Qo9.LIZ() && c681220Qno.LIZ == -1) || ((C681620QoS.LJI() || C681620QoS.LIZJ()) && !C681430Qo9.LIZ() && c681220Qno.LIZ == 1))) {
            C786410Ut5.LJLLLLLL(0, this.LLLIIII);
            C786410Ut5.LJLLLLLL(0, this.LLLIIIIL);
            C786410Ut5.LJLLLLLL(8, this.LLLI);
            C786410Ut5.LJLLLLLL(8, this.LLLII);
        } else {
            C786410Ut5.LJLLLLLL(8, this.LLLIIII);
            C786410Ut5.LJLLLLLL(8, this.LLLIIIIL);
            C786410Ut5.LJLLLLLL(0, this.LLLI);
            C786410Ut5.LJLLLLLL(0, this.LLLII);
        }
        if (c681220Qno.LIZ == -1) {
            View view = this.LLLIILIL;
            if (view != null) {
                C786410Ut5.LJLLLLLL(0, view);
            }
            MR(0);
            View view2 = this.LLLIIIL;
            if (view2 != null) {
                C786410Ut5.LJLLLLLL(8, view2);
            }
        }
    }

    @Override // X.InterfaceC362610EJn
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        View view;
        if (i == 4 && (view = this.LLLIIII) != null && view.getVisibility() == 0) {
            this.LLLIIII.performClick();
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x01ca  */
    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onViewCreated(android.view.View r27, android.os.Bundle r28) {
        /*
            Method dump skipped, instruction units count: 734
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.choosemusic.fragment.BaseChooseMusicFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Iterator<Fragment> it2 = getChildFragmentManager().LJJLIIIJL().iterator();
        while (it2.hasNext()) {
            it2.next().onActivityResult(i, i2, intent);
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [X.15II] */
    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewModelStoreOwner activity;
        View decorView;
        if (C0EBE.LIZ(viewGroup) != null) {
            activity = C1659630tI1.LIZ(viewGroup, requireActivity());
        } else {
            activity = getActivity();
        }
        C15IG c15igLJII = ((ICommerceMissionService) ServiceManager.get().getService(ICommerceMissionService.class)).LJII(activity);
        Mission mission = this.LLLJ;
        if (mission != null) {
            c15igLJII.qu0(mission);
        }
        LifecycleOwner lifecycleOwnerLIZ = C0EBE.LIZ(viewGroup);
        if (lifecycleOwnerLIZ == null) {
            lifecycleOwnerLIZ = requireActivity();
        }
        c15igLJII.Ms2().observe(lifecycleOwnerLIZ, new AObserverS231S0100000_29(this, 248));
        final View viewTd = C786410Ut5.Td(layoutInflater, R.layout.c9c, viewGroup, false);
        this.LLLILZ = viewTd;
        C15IK.LJIIJJI = this.LLJL;
        C15IK.LJ = this.LLJJJJLIIL;
        C15IK.LJIIIZ = this.LLJJL;
        C15IK.LJIIJ = this.LLJJLIIIJLLLLLLLZ;
        C15IK.LJFF = this.LLLFF;
        final int i = this.LLILLL;
        this.LLJ = new C15IF(viewTd, this, i) { // from class: X.15II
        };
        this.LLLILZLLLI = this.LLLILZ.findViewById(R.id.dsy);
        this.LLLILZJ = (ViewStub) this.LLLILZ.findViewById(R.id.dsx);
        Window window = getActivity().getWindow();
        if (window != null && (decorView = window.getDecorView()) != null) {
            this.LLLI = decorView.findViewById(R.id.y6_);
            this.LLLII = decorView.findViewById(R.id.epv);
            this.LLLIIII = decorView.findViewById(R.id.uce);
            this.LLLIIIIL = decorView.findViewById(R.id.eps);
            C786410Ut5.I7(this, this.LLLIIII);
            C786410Ut5.I7(this, this.LLLIIIIL);
            if (C681430Qo9.LIZ()) {
                C786410Ut5.LJLLLLLL(0, this.LLLIIII);
                C786410Ut5.LJLLLLLL(0, this.LLLIIIIL);
                C786410Ut5.LJLLLLLL(8, this.LLLI);
                C786410Ut5.LJLLLLLL(8, this.LLLII);
            } else {
                C786410Ut5.LJLLLLLL(8, this.LLLIIII);
                C786410Ut5.LJLLLLLL(8, this.LLLIIIIL);
                C786410Ut5.LJLLLLLL(0, this.LLLI);
                C786410Ut5.LJLLLLLL(0, this.LLLII);
            }
        }
        this.LLLIIIL = this.LLLILZ.findViewById(R.id.iiy);
        this.LLLIIL = (TuxTextView) this.LLLILZ.findViewById(R.id.uci);
        this.LLLIILIL = this.LLLILZ.findViewById(R.id.ndk);
        this.LLLIL = (FrameLayout) this.LLLILZ.findViewById(R.id.osw);
        getActivity();
        this.LLJI = new C15JB(this, layoutInflater, viewGroup);
        ((ICommerceMissionService) ServiceManager.get().getService(ICommerceMissionService.class)).LJII(activity).mf2(this.LLLIL, layoutInflater);
        View view = this.LLLILZ;
        C19GS c19gs = null;
        if (!(view instanceof View)) {
            view = null;
        }
        if (view != null) {
            try {
                ViewTreeLifecycleOwner.set(view, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(view, this);
                view.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity2 = getActivity();
                if (activity2 instanceof C19GS) {
                    c19gs = (C19GS) activity2;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return view;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return view;
    }
}
