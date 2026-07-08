package com.ss.android.ugc.aweme.choosemusic.fragment;

import X.AbstractC19994813Le;
import X.AbstractC21673619ry;
import X.AbstractC480470Isn;
import X.C098200Yq;
import X.C0EBE;
import X.C0EM1;
import X.C0RD4;
import X.C0WZX;
import X.C116S;
import X.C11FA;
import X.C11FC;
import X.C11FD;
import X.C11FE;
import X.C120J;
import X.C120K;
import X.C1213480hgQ;
import X.C1260290itv;
import X.C12Y3;
import X.C1411810mqJ;
import X.C14EU;
import X.C14KQ;
import X.C15GL;
import X.C15GM;
import X.C15H0;
import X.C15HB;
import X.C15HD;
import X.C15HE;
import X.C15HO;
import X.C15HP;
import X.C15IG;
import X.C15II;
import X.C15IK;
import X.C15IZ;
import X.C15JP;
import X.C1602160rnK;
import X.C1627000sRO;
import X.C1629670sVh;
import X.C1654360t9W;
import X.C1659630tI1;
import X.C1685300txQ;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C1845940y8W;
import X.C1846060y8i;
import X.C189200o6;
import X.C1911780zqi;
import X.C19633311rf;
import X.C196863120n;
import X.C19EG;
import X.C19GS;
import X.C1BWL;
import X.C20320114f9;
import X.C20320214fA;
import X.C204594153w;
import X.C20491015Ga;
import X.C20493315Gx;
import X.C20494715Hl;
import X.C20496915Ih;
import X.C20499015Jc;
import X.C20510015Ni;
import X.C20684815ws;
import X.C20732616Ay;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C2344009Gk;
import X.C341940Daq;
import X.C419910GdJ;
import X.C580830MqH;
import X.C616540OGe;
import X.C629770On1;
import X.C786410Ut5;
import X.C838410Wul;
import X.InterfaceC1258040iqI;
import X.InterfaceC1260330itz;
import X.InterfaceC20492315Gn;
import X.InterfaceC20494515Hj;
import X.InterfaceC20499515Jh;
import Y.ACListenerS165S0100000_31;
import Y.AObjectS405S0100000_31;
import Y.AObserverS233S0100000_31;
import Y.ARunnableS126S0100000_26;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.arch.widgets.base.WidgetManager;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior;
import com.ss.android.ugc.aweme.challenge.service.IChallengeService;
import com.ss.android.ugc.aweme.choosemusic.activity.ChooseMusicActivity;
import com.ss.android.ugc.aweme.choosemusic.fragment.BaseNewMusicTabFragment;
import com.ss.android.ugc.aweme.choosemusic.model.ChooseMusicWithSceneViewModel;
import com.ss.android.ugc.aweme.choosemusic.utils.ChooseMusicDownloadPlayHelper;
import com.ss.android.ugc.aweme.choosemusic.view.ChooseMusicSelectView;
import com.ss.android.ugc.aweme.choosemusic.viewmodel.SelectedMusicViewModel;
import com.ss.android.ugc.aweme.choosemusic.widgets.MusicBannerWidget;
import com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService;
import com.ss.android.ugc.aweme.commercialize.mission.ICommerceMissionService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.model.IMusicRequestParam;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.performance.OpenMusicPanelPerformanceMonitor;
import com.ss.android.ugc.aweme.performance.PerformanceMonitor;
import com.ss.android.ugc.aweme.search.ISearchService;
import com.ss.android.ugc.aweme.services.ICreativeSAAService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.services.performance.IAVPerformance;
import com.ss.android.ugc.aweme.shortvideo.model.MultiChoose;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes32.dex */
public abstract class BaseNewMusicTabFragment extends AmeBaseFragment implements Observer<C0RD4>, InterfaceC1258040iqI, C15H0, C15GM, InterfaceC20499515Jh, InterfaceC1260330itz, InterfaceC20494515Hj<C15HP> {
    public static final String LLLILZLLLI;
    public C120J LL;
    public C1749280vcc LLILLJJLI;
    public C1846060y8i LLILLL;
    public ViewPager LLILZ;
    public C1260290itv LLILZIL;
    public View LLILZLL;
    public DataCenter LLIZ;
    public WidgetManager LLIZLLLIL;
    public SelectedMusicViewModel LLJ;
    public ChooseMusicWithSceneViewModel LLJI;
    public MusicBannerWidget LLJILJIL;
    public String LLJILJILJ;
    public String LLJILLL;
    public String LLJJ;
    public boolean LLJJI;
    public UrlModel LLJJIII;
    public IMusicRequestParam LLJJIJI;
    public boolean LLJJIJIIJIL;
    public long LLJJIJIL;
    public String LLJJJ;
    public int LLJJJIL;
    public int LLJJJJ;
    public MusicModel LLJJJJJIL;
    public DiscoverMusicFragment LLJJLIIIJLLLLLLLZ;
    public CollectMusicFragment LLJL;
    public ForYouMusicFragment LLJLIL;
    public UnlimitedMusicFragment LLJLILLLLZIIL;
    public LocalMusicTabFragment LLJLL;
    public ChooseMusicDownloadPlayHelper LLJLLIL;
    public C204594153w LLJLLL;
    public Music LLJZ;
    public boolean LLJZIJLIL;
    public boolean LLL;
    public boolean LLLF;
    public boolean LLLFF;
    public int LLLFFI;
    public long LLLFZ;
    public long LLLI;
    public boolean LLLII;
    public UrlModel LLLIIII;
    public int LLLIIIIL;
    public String LLLIIIL;
    public boolean LLLIIL;
    public boolean LLLIILIL;
    public boolean LLLIL;
    public C1629670sVh LLLILZ;
    public final C19633311rf LLLILZJ;
    public C11FA LLJIJIL = C11FA.TAB_TYPE_DISCOVER;
    public final boolean LLJJJJLIIL = true;
    public final String LLJJL = "popular_song";

    @Override // X.InterfaceC20499515Jh
    public final /* synthetic */ void J2(MusicModel musicModel, long j) {
    }

    @Override // X.InterfaceC20499515Jh
    public final /* synthetic */ void LLJILJILJ(MusicModel musicModel, Exception exc) {
    }

    public abstract void SR(Intent intent, MusicModel musicModel);

    public abstract void UR();

    public abstract void ZR(C0RD4 c0rd4);

    @Override // X.InterfaceC20499515Jh
    public final /* synthetic */ void ba(MusicModel musicModel) {
    }

    public abstract void dS(LinearLayout linearLayout);

    public abstract void gS();

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment
    public final boolean isRegisterEventBus() {
        return true;
    }

    @Override // X.InterfaceC20499515Jh
    public final /* synthetic */ void v2() {
    }

    @Override // X.InterfaceC1258040iqI
    public final View LJJLIIIJILLIZJL() {
        switch (C11FC.LIZ[this.LLJIJIL.ordinal()]) {
            case 1:
            case 2:
                return this.LLJJLIIIJLLLLLLLZ.LL;
            case 3:
                return this.LLJLIL.LJJLIIIJILLIZJL();
            case 4:
                return this.LLJL.LJJLIIIJILLIZJL();
            case 5:
                return this.LLJLL.LJJLIIIJILLIZJL();
            case 6:
                return this.LLJLILLLLZIIL.LJJLIIIJILLIZJL();
            default:
                throw new IllegalStateException("Just has three types of View.");
        }
    }

    public final C120J PR() {
        if (this.LL == null) {
            this.LL = new C120J(getContext());
        }
        return this.LL;
    }

    public final AbstractC21673619ry RR() {
        switch (C11FC.LIZ[this.LLJIJIL.ordinal()]) {
            case 1:
            case 2:
                DiscoverMusicFragment discoverMusicFragment = this.LLJJLIIIJLLLLLLLZ;
                if (discoverMusicFragment != null) {
                    return discoverMusicFragment.LLILZIL;
                }
                return null;
            case 3:
                ForYouMusicFragment forYouMusicFragment = this.LLJLIL;
                if (forYouMusicFragment == null) {
                    return null;
                }
                return forYouMusicFragment.NR();
            case 4:
                InterfaceC20492315Gn<T> interfaceC20492315Gn = this.LLJL.LLIZLLLIL;
                if (interfaceC20492315Gn != 0) {
                    return interfaceC20492315Gn.LJJLIIIJL();
                }
                return null;
            case 5:
                return this.LLJLL.NR();
            case 6:
                return this.LLJLILLLLZIIL.NR();
            default:
                throw new IllegalStateException("Just has four types of View.");
        }
    }

    public final Unit aS() {
        Integer num;
        C20320214fA c20320214fA;
        C1749280vcc c1749280vcc = this.LLILLJJLI;
        if (c1749280vcc != null) {
            c1749280vcc.setClickable(false);
            C786410Ut5.l9(this.LLILLJJLI, null);
        }
        NR();
        UnlimitedMusicFragment unlimitedMusicFragment = this.LLJLILLLLZIIL;
        if (unlimitedMusicFragment != null && (num = (Integer) unlimitedMusicFragment.LLILZLL.get("unlimited_music_tab_list_refresh_status", null)) != null && num.intValue() == 1 && (c20320214fA = unlimitedMusicFragment.LLJJIJIL) != null) {
            c20320214fA.LIZ();
        }
        return Unit.LIZ;
    }

    public final void cS() {
        C1260290itv c1260290itv = this.LLILZIL;
        if (c1260290itv == null || c1260290itv.getParent() == null) {
            return;
        }
        int measuredHeight = ((View) this.LLILZIL.getParent()).getMeasuredHeight();
        int curScrollY = (measuredHeight + this.LLILZIL.getCurScrollY()) - this.LLILZIL.getChildAt(0).getMeasuredHeight();
        C15HB c15hb = this.LLJJLIIIJLLLLLLLZ.LLILZIL;
        if (c15hb == null || c15hb.LLJI == curScrollY) {
            return;
        }
        c15hb.LLJI = curScrollY;
        c15hb.LLLI(false);
    }

    static {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("android:switcher:");
        sbLIZ.append(R.id.i64);
        sbLIZ.append(":");
        LLLILZLLLI = C2188811AlT.LIZIZ(sbLIZ);
    }

    public BaseNewMusicTabFragment() {
        Application applicationLIZ = C1BWL.LIZ();
        HashMap<String, C19633311rf> map = C1213480hgQ.LIZ;
        C19633311rf c19633311rf = map.get("add_fav");
        if (c19633311rf == null) {
            c19633311rf = new C19633311rf(applicationLIZ, "add_fav");
            map.put("add_fav", c19633311rf);
        }
        this.LLLILZJ = c19633311rf;
    }

    @Override // X.InterfaceC20499515Jh
    public final Activity LLILLL() {
        return getActivity();
    }

    @Override // X.InterfaceC20499515Jh
    public final boolean LLJLLIL() {
        return isViewValid();
    }

    public final void NR() {
        boolean zLJI = MethodIDManager.LJI(197725);
        this.LLLIL = false;
        C1749280vcc c1749280vcc = this.LLILLJJLI;
        if (c1749280vcc != null) {
            c1749280vcc.LJ();
            C786410Ut5.LLLZLZ(this.LLILLJJLI, 0);
        }
        ((IExternalService) ServiceManager.get().getService(IExternalService.class)).provideAVPerformance().step(OpenMusicPanelPerformanceMonitor.INSTANCE, "fetch_music_data");
        IMusicRequestParam iMusicRequestParam = this.LLJJIJI;
        final Map<String, Object> recommendExtra = iMusicRequestParam != null ? iMusicRequestParam.getRecommendExtra() : null;
        String str = this.LLJILJILJ;
        if (str != null) {
            final C204594153w c204594153w = this.LLJLLL;
            String str2 = this.LLJILLL;
            Music music = this.LLJZ;
            final int i = this.LLLFFI;
            final boolean z = this.LLJJIJIIJIL;
            c204594153w.getClass();
            ((IChallengeService) ServiceManager.get().getService(IChallengeService.class)).LIZIZ(C1911780zqi.LIZJ(z) ? "for_you_tab_challenge_data" : "data_challenge", str, str2, music, new C116S() { // from class: X.1540
                public final /* synthetic */ boolean LIZ = false;

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
                /* JADX WARN: Type inference failed for: r3v0, types: [java.util.ArrayList] */
                /* JADX WARN: Type inference failed for: r3v1 */
                /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
                @Override // X.C116S
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final boolean LIZ(com.ss.android.ugc.aweme.discover.model.Challenge r5, java.lang.String r6) {
                    /*
                        r4 = this;
                        java.util.ArrayList r3 = new java.util.ArrayList
                        r3.<init>()
                        java.util.List r0 = r5.getConnectMusics()
                        java.util.List r2 = X.C15J0.LIZ(r0)
                        com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
                        java.lang.Class<com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService> r0 = com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService.class
                        java.lang.Object r0 = r1.getService(r0)
                        com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService r0 = (com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService) r0
                        boolean r0 = r0.LJIIJ()
                        if (r0 == 0) goto L42
                        r1 = r2
                        java.util.ArrayList r1 = (java.util.ArrayList) r1
                        boolean r0 = r1.isEmpty()
                        if (r0 != 0) goto L42
                        java.util.Iterator r2 = r1.iterator()
                    L2c:
                        boolean r0 = r2.hasNext()
                        if (r0 == 0) goto L43
                        java.lang.Object r1 = r2.next()
                        com.ss.android.ugc.aweme.shortvideo.model.MusicModel r1 = (com.ss.android.ugc.aweme.shortvideo.model.MusicModel) r1
                        boolean r0 = r1.isCommerceMusic()
                        if (r0 == 0) goto L2c
                        r3.add(r1)
                        goto L2c
                    L42:
                        r3 = r2
                    L43:
                        boolean r0 = r3.isEmpty()
                        if (r0 != 0) goto L50
                        X.153w r0 = r2
                        com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r0 = r0.LIZIZ
                        r0.zQ2(r5, r6)
                    L50:
                        X.153w r0 = r2
                        com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r2 = r0.LIZIZ
                        java.lang.String r1 = "is_busi_sticker"
                        java.lang.Boolean r0 = java.lang.Boolean.FALSE
                        java.lang.Object r0 = r2.get(r1, r0)
                        java.lang.Boolean r0 = (java.lang.Boolean) r0
                        boolean r0 = r0.booleanValue()
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1540.LIZ(com.ss.android.ugc.aweme.discover.model.Challenge, java.lang.String):boolean");
                }

                @Override // X.C116S
                public final void LIZIZ(Music music2, String str3, boolean z2) {
                    c204594153w.LIZJ(this.LIZ, str3, music2, z2, i, z, recommendExtra);
                }
            });
        } else {
            this.LLJLLL.LIZJ(false, this.LLJILLL, this.LLJZ, false, this.LLLFFI, this.LLJJIJIIJIL, recommendExtra);
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public final boolean VR() {
        if (getActivity() == null || getActivity().getIntent() == null) {
            return false;
        }
        return getActivity().getIntent().getBooleanExtra("extra_beat_music_sticker", false);
    }

    public final void bS() {
        AbstractC21673619ry abstractC21673619ryRR = RR();
        if (abstractC21673619ryRR == null) {
            return;
        }
        if (abstractC21673619ryRR instanceof C20494715Hl) {
            ((C20494715Hl) abstractC21673619ryRR).LLLIIIIL();
            return;
        }
        if (abstractC21673619ryRR instanceof C15HB) {
            C15HB c15hb = (C15HB) abstractC21673619ryRR;
            if (((Integer) c15hb.LLILLJJLI.get("music_position", -1)).intValue() != -1) {
                C15H0 c15h0 = c15hb.LLILZ;
                if (c15h0 != null) {
                    c15h0.p8(null);
                }
                c15hb.LLILLJJLI.zQ2(-1, "music_position");
                c15hb.LLILLJJLI.zQ2(-1, "music_index");
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        C20499015Jc c20499015Jc;
        super.onDestroyView();
        ChooseMusicDownloadPlayHelper chooseMusicDownloadPlayHelper = this.LLJLLIL;
        if (chooseMusicDownloadPlayHelper != null) {
            chooseMusicDownloadPlayHelper.pause();
            this.LLJLLIL.onDestroy();
        }
        if (PR() != null) {
            PR().dismiss();
        }
        C1629670sVh c1629670sVh = this.LLLILZ;
        if (c1629670sVh != null) {
            c1629670sVh.LIZJ();
        }
        C204594153w c204594153w = this.LLJLLL;
        if (c204594153w != null && (c20499015Jc = c204594153w.LJFF) != null) {
            c20499015Jc.cancel();
            c204594153w.LJFF = null;
        }
        C20499015Jc c20499015Jc2 = C20320114f9.LIZIZ;
        if (c20499015Jc2 != null) {
            c20499015Jc2.cancel();
            C20320114f9.LIZIZ = null;
        }
        C1654360t9W.LJI = 0;
        C1654360t9W.LJFF = 0;
        C1654360t9W.LJ = "";
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        ChooseMusicDownloadPlayHelper chooseMusicDownloadPlayHelper = this.LLJLLIL;
        if (chooseMusicDownloadPlayHelper != null) {
            chooseMusicDownloadPlayHelper.pause();
            this.LLJLLIL.LLJILJILJ = true;
        }
        this.LLIZ.zQ2(-1, "music_position");
        this.LLIZ.zQ2(-1, "music_index");
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(getClass().getName());
        }
        super.onResume();
        ChooseMusicDownloadPlayHelper chooseMusicDownloadPlayHelper = this.LLJLLIL;
        if (chooseMusicDownloadPlayHelper != null) {
            chooseMusicDownloadPlayHelper.LLJILJILJ = false;
        }
    }

    @Override // X.InterfaceC1260330itz
    public final boolean onScrollEnd() {
        ((IExternalService) ServiceManager.get().getService(IExternalService.class)).provideAVPerformance().stopPerformanceMonitor("tool_music_scroll");
        return false;
    }

    @Override // X.InterfaceC20499515Jh
    public final MusicModel LJI() {
        return this.LLJJJJJIL;
    }

    @Override // X.C15H0
    public final void Dl0(C15IZ c15iz) {
        this.LLJLLIL.Tf(c15iz);
    }

    public final void MR(MusicModel musicModel) {
        if (this.LLLII && TextUtils.equals(musicModel.getMusicId(), this.LLLIIIL)) {
            musicModel.setMusicType(2);
            musicModel.setReuseAudioPlayUrl(this.LLLIIII);
            musicModel.setDuration(this.LLLIIIIL);
            musicModel.setShootDuration(Integer.valueOf(this.LLLIIIIL));
        }
    }

    public final CharSequence OR(C11FA c11fa) {
        switch (C11FC.LIZ[c11fa.ordinal()]) {
            case 1:
                return getResources().getString(2131830698);
            case 2:
                return getResources().getString(2131848643);
            case 3:
                return getResources().getString(2131848642);
            case 4:
                return getResources().getString(R.string.lxm);
            case 5:
                return getResources().getString(2131826443);
            case 6:
                return getResources().getString(2131857855);
            default:
                return "";
        }
    }

    @Override // X.InterfaceC20494515Hj
    /* JADX INFO: renamed from: WR, reason: merged with bridge method [inline-methods] */
    public final void LLIIL(C15HP c15hp) {
        String str = c15hp.LIZIZ;
        MusicModel musicModel = c15hp.LIZ;
        if ("follow_type".equals(str)) {
            this.LLJLLL.LIZ(musicModel, musicModel.getMusicId(), 1, c15hp.LIZJ, c15hp.LIZLLL);
        } else {
            if (!"unfollow_type".equals(str)) {
                return;
            }
            this.LLJLLL.LIZ(musicModel, musicModel.getMusicId(), 0, c15hp.LIZJ, c15hp.LIZLLL);
        }
    }

    public final void hS(C11FA c11fa) {
        C20491015Ga c20491015Ga;
        C20491015Ga c20491015Ga2;
        if (this.LLJLLL == null) {
        }
        int[] iArr = C11FC.LIZ;
        switch (iArr[c11fa.ordinal()]) {
            case 1:
                this.LLILZ.setCurrentItem(C11FD.LIZ(c11fa, false, this.LLJJIJIIJIL), false);
                C1260290itv c1260290itv = this.LLILZIL;
                if (c1260290itv != null) {
                    c1260290itv.getHelper().LIZIZ = this.LLJJLIIIJLLLLLLLZ;
                }
                ((ICommerceMediaService) ServiceManager.get().getService(ICommerceMediaService.class)).LJIIIZ(this).DI(C15HD.DISCOVER);
                break;
            case 2:
                this.LLJLLL.LJIIJJI(this.LLLFFI);
                this.LLILZ.setCurrentItem(C11FD.LIZ(c11fa, this.LLLFF, this.LLJJIJIIJIL), false);
                C1260290itv c1260290itv2 = this.LLILZIL;
                if (c1260290itv2 != null) {
                    c1260290itv2.getHelper().LIZIZ = this.LLJJLIIIJLLLLLLLZ;
                }
                ((ICommerceMediaService) ServiceManager.get().getService(ICommerceMediaService.class)).LJIIIZ(this).DI(C15HD.MORE);
                break;
            case 3:
                this.LLILZ.setCurrentItem(C11FD.LIZ(c11fa, false, this.LLJJIJIIJIL), false);
                C1260290itv c1260290itv3 = this.LLILZIL;
                if (c1260290itv3 != null) {
                    c1260290itv3.getHelper().LIZIZ = this.LLJLIL;
                }
                ((ICommerceMediaService) ServiceManager.get().getService(ICommerceMediaService.class)).LJIIIZ(this).DI(C15HD.FOR_YOU);
                break;
            case 4:
                if (this.LLJJIJIIJIL) {
                    C20320114f9.LIZ(this.LLIZ, getContext(), true);
                } else {
                    this.LLJLLL.LJIIL(this.LLLFFI, true);
                }
                this.LLILZ.setCurrentItem(C11FD.LIZ(c11fa, false, this.LLJJIJIIJIL), false);
                C1260290itv c1260290itv4 = this.LLILZIL;
                if (c1260290itv4 != null) {
                    c1260290itv4.getHelper().LIZIZ = this.LLJL;
                }
                ((ICommerceMediaService) ServiceManager.get().getService(ICommerceMediaService.class)).LJIIIZ(this).DI(C15HD.FAVORITES);
                break;
            case 5:
                this.LLILZ.setCurrentItem(C11FD.LIZ(c11fa, false, this.LLJJIJIIJIL), false);
                C1260290itv c1260290itv5 = this.LLILZIL;
                if (c1260290itv5 != null) {
                    c1260290itv5.getHelper().LIZIZ = this.LLJLL;
                }
                ((ICommerceMediaService) ServiceManager.get().getService(ICommerceMediaService.class)).LJIIIZ(this).DI(C15HD.LOCAL_TAB);
                LocalMusicTabFragment localMusicTabFragment = this.LLJLL;
                if (!localMusicTabFragment.LLJJIII) {
                    localMusicTabFragment.ZR(localMusicTabFragment.getContext(), new C196863120n(localMusicTabFragment));
                }
                break;
            case 6:
                this.LLILZ.setCurrentItem(C11FD.LIZ(c11fa, false, this.LLJJIJIIJIL), false);
                C1260290itv c1260290itv6 = this.LLILZIL;
                if (c1260290itv6 != null) {
                    c1260290itv6.getHelper().LIZIZ = this.LLJLILLLLZIIL;
                }
                ((ICommerceMediaService) ServiceManager.get().getService(ICommerceMediaService.class)).LJIIIZ(this).DI(C15HD.UNLIMITED_MUSIC);
                break;
        }
        this.LLJIJIL = c11fa;
        ForYouMusicFragment forYouMusicFragment = this.LLJLIL;
        if (forYouMusicFragment != null && c11fa == C11FA.TAB_TYPE_FOR_YOU) {
            Object obj = forYouMusicFragment.LLIZLLLIL;
            if ((obj instanceof C20491015Ga) && (c20491015Ga2 = (C20491015Ga) obj) != null) {
                c20491015Ga2.LJI();
            }
            forYouMusicFragment.LLJJIJIIJIL.LIZLLL();
        } else {
            UnlimitedMusicFragment unlimitedMusicFragment = this.LLJLILLLLZIIL;
            if (unlimitedMusicFragment != null && c11fa == C11FA.TAB_TYPE_UNLIMITED_MUSIC) {
                Object obj2 = unlimitedMusicFragment.LLIZLLLIL;
                if ((obj2 instanceof C20491015Ga) && (c20491015Ga = (C20491015Ga) obj2) != null) {
                    c20491015Ga.LJI();
                }
                if (C1411810mqJ.LIZIZ.get()) {
                    C1411810mqJ.LIZIZ();
                }
                unlimitedMusicFragment.LLJJIJIIJIL.LIZLLL();
            }
        }
        switch (iArr[this.LLJIJIL.ordinal()]) {
            case 1:
                this.LLJJJJ = 0;
                break;
            case 2:
                this.LLJJJJ = 15;
                break;
            case 3:
                this.LLJJJJ = 14;
                break;
            case 4:
                this.LLJJJJ = 1;
                break;
            case 5:
                this.LLJJJJ = 6;
                break;
            case 6:
                this.LLJJJJ = 23;
                break;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.LLJ = (SelectedMusicViewModel) C1659630tI1.LJ(this).get(SelectedMusicViewModel.class);
        this.LLJI = (ChooseMusicWithSceneViewModel) C1659630tI1.LJ(this).get(ChooseMusicWithSceneViewModel.class);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // androidx.lifecycle.Observer
    public final void onChanged(C0RD4 c0rd4) {
        boolean z;
        MusicModel musicModel;
        ViewModelStoreOwner activity;
        C15II c15ii;
        C15II c15ii2;
        ConstraintLayout constraintLayout;
        C0RD4 c0rd42 = c0rd4;
        if (c0rd42 != null) {
            String str = c0rd42.LIZ;
            str.getClass();
            int i = 2;
            switch (str.hashCode()) {
                case -2080369200:
                    if (str.equals("pick_status")) {
                        Object obj = c0rd42.LIZIZ;
                        SelectedMusicViewModel selectedMusicViewModel = null;
                        if (obj == null) {
                            obj = null;
                        }
                        int i2 = 8;
                        if (((Integer) obj).intValue() == 1) {
                            C1749280vcc c1749280vcc = this.LLILLJJLI;
                            if (c1749280vcc != null) {
                                this.LLLIL = true;
                                Pair<String, String> pairLIZ = C1627000sRO.LIZ(c1749280vcc.getContext());
                                C419910GdJ c419910GdJ = new C419910GdJ();
                                c419910GdJ.LIZ = R.raw.icon_large_refresh;
                                c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
                                C1722300uv6 c1722300uv6 = new C1722300uv6();
                                c1722300uv6.LIZJ = 0;
                                c1722300uv6.LIZIZ = c419910GdJ;
                                int iLIZ = C341940Daq.LIZ(72.0d);
                                int iLIZ2 = C341940Daq.LIZ(72.0d);
                                c1722300uv6.LIZLLL = iLIZ;
                                c1722300uv6.LJ = iLIZ2;
                                c1722300uv6.LJI = pairLIZ.getFirst();
                                c1722300uv6.LJIIIIZZ = pairLIZ.getSecond();
                                C786410Ut5.l9(this.LLILLJJLI, new ACListenerS165S0100000_31(this, 197));
                                if (this.LLLILZ == null) {
                                    this.LLLILZ = new C1629670sVh(new AObjectS405S0100000_31(this, 4), new AObjectS405S0100000_31(this, 5));
                                }
                                this.LLLILZ.LIZ();
                                if (!C20510015Ni.LIZ.LJIIIIZZ()) {
                                    Fragment parentFragment = getParentFragment();
                                    if ((parentFragment instanceof BaseChooseMusicFragment) && (c15ii2 = ((BaseChooseMusicFragment) parentFragment).LLJ) != null && (constraintLayout = c15ii2.LIZIZ) != null) {
                                        C786410Ut5.LL(8, constraintLayout);
                                    }
                                }
                                this.LLILLJJLI.setStatus(c1722300uv6);
                                C786410Ut5.LLLZLZ(this.LLILLJJLI, 0);
                            }
                        } else {
                            C1749280vcc c1749280vcc2 = this.LLILLJJLI;
                            if (c1749280vcc2 != null) {
                                C786410Ut5.LLLZLZ(c1749280vcc2, 8);
                            }
                            if (getArguments() != null && getArguments().getInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", 1) == 2) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (!this.LLLF || !z) {
                                Fragment parentFragment2 = getParentFragment();
                                if (parentFragment2 instanceof ChooseMusicFragment) {
                                    BaseChooseMusicFragment baseChooseMusicFragment = (BaseChooseMusicFragment) parentFragment2;
                                    if (baseChooseMusicFragment.isViewValid() && baseChooseMusicFragment.getActivity() != null && (musicModel = baseChooseMusicFragment.LLJJIII) != null) {
                                        baseChooseMusicFragment.PR();
                                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                                        sbLIZ.append("change_music_page");
                                        sbLIZ.append("_");
                                        sbLIZ.append(C15IK.LIZ.split("_")[1]);
                                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                                        C2344009Gk c2344009Gk = new C2344009Gk();
                                        c2344009Gk.LJIIIIZZ("creation_id", baseChooseMusicFragment.LLJJJJLIIL);
                                        c2344009Gk.LJIIIIZZ("enter_from", strLIZIZ);
                                        c2344009Gk.LJIIIIZZ("music_id", musicModel.getMusicId());
                                        c2344009Gk.LJIIIIZZ("music_selected_from", baseChooseMusicFragment.LLJJIJI);
                                        if (C15IK.LJ().booleanValue()) {
                                            c2344009Gk.LIZJ(1, "is_editor_pro");
                                        } else {
                                            c2344009Gk.LIZJ(0, "is_editor_pro");
                                        }
                                        C20684815ws.LJIILLIIL("music_bar_show", c2344009Gk.LIZ);
                                        ChooseMusicSelectView chooseMusicSelectView = baseChooseMusicFragment.LLLIZZ;
                                        if (chooseMusicSelectView != null) {
                                            boolean z2 = baseChooseMusicFragment.LLJJJJ;
                                            boolean z3 = baseChooseMusicFragment.LLJJJIL;
                                            chooseMusicSelectView.LLJJIJIL = musicModel;
                                            if (!musicModel.isLocalMusic()) {
                                                if (musicModel.isCollected()) {
                                                    i = 0;
                                                } else {
                                                    i = 1;
                                                }
                                            }
                                            SelectedMusicViewModel selectedMusicViewModel2 = chooseMusicSelectView.LLJJ;
                                            if (selectedMusicViewModel2 == null) {
                                                selectedMusicViewModel2 = null;
                                            }
                                            selectedMusicViewModel2.wQ2().postValue(musicModel);
                                            ((LiveData) selectedMusicViewModel2.LLILZ.getValue()).postValue(Boolean.valueOf(z2));
                                            ((LiveData) selectedMusicViewModel2.LLILZIL.getValue()).postValue(Boolean.valueOf(z3));
                                            selectedMusicViewModel2.vQ2().postValue(Integer.valueOf(i));
                                            SelectedMusicViewModel selectedMusicViewModel3 = chooseMusicSelectView.LLJJ;
                                            if (selectedMusicViewModel3 != null) {
                                                selectedMusicViewModel = selectedMusicViewModel3;
                                            }
                                            selectedMusicViewModel.yQ2().postValue(Boolean.TRUE);
                                        }
                                    }
                                }
                            }
                            Fragment parentFragment3 = getParentFragment();
                            if ((parentFragment3 instanceof BaseChooseMusicFragment) && (c15ii = ((BaseChooseMusicFragment) parentFragment3).LLJ) != null) {
                                boolean z4 = !((ISearchService) ServiceManager.get().getService(ISearchService.class)).LLZLI().disableMusicSearch;
                                ConstraintLayout constraintLayout2 = c15ii.LIZIZ;
                                if (constraintLayout2 != null) {
                                    if (z4) {
                                        i2 = 0;
                                    }
                                    C786410Ut5.LL(i2, constraintLayout2);
                                }
                            }
                            C1260290itv c1260290itv = this.LLILZIL;
                            if (c1260290itv != null) {
                                int visibility = c1260290itv.getVisibility();
                                c1260290itv.setVisibility(0);
                                C1602160rnK.LIZIZ(visibility, 0, c1260290itv);
                            }
                            if (C0EBE.LIZ(getView()) != null) {
                                activity = C1659630tI1.LIZ(getView(), requireActivity());
                            } else {
                                activity = getActivity();
                            }
                            MutableLiveData<MusicModel> mutableLiveDataWQ2 = this.LLJ.wQ2();
                            C15IG c15igLJII = ((ICommerceMissionService) ServiceManager.get().getService(ICommerceMissionService.class)).LJII(activity);
                            Objects.requireNonNull(c15igLJII);
                            mutableLiveDataWQ2.observe(this, new AObserverS233S0100000_31(c15igLJII, 44));
                        }
                    }
                    break;
                case -1833731743:
                    if (str.equals("data_banner") && this.LLILZIL != null) {
                        HandlerHook.viewPostDelay(this.LLILZIL, new ARunnableS126S0100000_26(this, 106), 100L);
                        break;
                    }
                    break;
                case -1635157503:
                    if (str.equals("music_collect_status")) {
                        ZR(c0rd42);
                    }
                    break;
                case -1322093457:
                    if (str.equals("play_compeleted") && (RR() instanceof C20494715Hl)) {
                        ((C20494715Hl) RR()).LLLIIIIL();
                        break;
                    }
                    break;
                case 199458657:
                    if (str.equals("music_reset_play_start") && RR() != null && (RR() instanceof C20494715Hl)) {
                        ((C20494715Hl) RR()).LLLILZ((android.util.Pair) this.LLIZ.get("music_reset_play_start"));
                        break;
                    }
                    break;
                case 502104354:
                    if (str.equals("music_loading") && RR() != null && (RR() instanceof C20494715Hl)) {
                        ((C20494715Hl) RR()).LLLII(((Boolean) this.LLIZ.get("music_loading")).booleanValue());
                        break;
                    }
                    break;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        boolean z;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (getArguments() != null && arguments.containsKey("challenge")) {
            this.LLJILJILJ = arguments.getString("challenge");
        }
        this.LLJILLL = arguments.getString("first_sticker_music_ids", null);
        this.LLJJI = arguments.getBoolean("is_busi_sticker", false);
        this.LLJJIII = (UrlModel) arguments.getSerializable("effect_icon_url");
        IMusicRequestParam iMusicRequestParam = (IMusicRequestParam) getArguments().getSerializable("music_request_param");
        this.LLJJIJI = iMusicRequestParam;
        if (iMusicRequestParam != null && iMusicRequestParam.getUnlimitedOnly()) {
            z = true;
        } else {
            z = false;
        }
        this.LLJJIJIIJIL = z;
        IMusicRequestParam iMusicRequestParam2 = this.LLJJIJI;
        if (iMusicRequestParam2 != null) {
            this.LLJJIJIL = iMusicRequestParam2.getMaxMusicDuration();
            C1654360t9W.LIZIZ = this.LLJJIJI.isMusicLoop();
            C1654360t9W.LIZJ = this.LLJJIJI.getMusicMaxLoopDuration();
        } else {
            this.LLJJIJIL = 0L;
            C1654360t9W.LIZIZ = false;
        }
        this.LLJJ = arguments.getString("first_sticker_id", null);
        this.LLJJJIL = arguments.getInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE");
        this.LLJZ = (Music) arguments.getSerializable("sticker_music");
        if (getArguments() != null && arguments.containsKey("shoot_way")) {
            this.LLJJJ = arguments.getString("shoot_way");
        }
        if (getArguments() != null && arguments.containsKey("sound_page_scene")) {
            this.LLLFFI = arguments.getInt("sound_page_scene");
        }
        this.LLLF = arguments.getBoolean("hide_cancel_music_ui");
        this.LLLFF = arguments.getBoolean("should_show_local_music", false);
        if (getArguments() == null) {
            this.LLLFZ = 0L;
            this.LLLI = 0L;
        } else {
            this.LLLFZ = getArguments().getLong("max_video_duration", 0L);
            this.LLLI = getArguments().getLong("shoot_video_length", 0L);
        }
        this.LLLIIIL = arguments.getString("reuse_original_sound_id");
        this.LLLIIIIL = arguments.getInt("reuse_original_sound_length");
        this.LLLIIII = (UrlModel) arguments.getSerializable("reuse_original_sound_url");
        if (!TextUtils.isEmpty(this.LLLIIIL) && this.LLLIIII != null) {
            this.LLLII = true;
        }
        this.LLLIIL = arguments.getBoolean("enable_extend_music");
        this.LLLIILIL = arguments.getBoolean("extra_show_lyric_tag");
    }

    @C14EU(sticky = true)
    public void onMusicCollectEvent(C629770On1 c629770On1) {
        if (this.LLIZ != null && c629770On1 != null && "music_detail".equals(c629770On1.LIZJ)) {
            this.LLIZ.zQ2(new C20493315Gx(0, c629770On1.LIZ, -1, -1, c629770On1.LIZIZ), "music_collect_status");
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("KEY_CURRENT_TAB", C11FD.LIZ(this.LLJIJIL, this.LLLFF, this.LLJJIJIIJIL));
    }

    @Override // X.C15H0
    public final void p8(MusicModel musicModel) {
        ChooseMusicDownloadPlayHelper chooseMusicDownloadPlayHelper = this.LLJLLIL;
        if (chooseMusicDownloadPlayHelper != null) {
            chooseMusicDownloadPlayHelper.pause();
        }
    }

    @Override // X.C15H0
    public final void ru(MusicModel musicModel) {
        if (musicModel.isUnlimitedMusic() && musicModel.getFromCollectionType() == 4) {
            IMusicRequestParam iMusicRequestParam = this.LLJJIJI;
            if (iMusicRequestParam != null && "video_shoot_page".equals(iMusicRequestParam.getEnterFrom())) {
                musicModel.setMusicSelectedFrom("shoot_page_unlimited");
            } else {
                IMusicRequestParam iMusicRequestParam2 = this.LLJJIJI;
                if (iMusicRequestParam2 != null && "video_edit_page".equals(iMusicRequestParam2.getEnterFrom())) {
                    musicModel.setMusicSelectedFrom("edit_page_unlimited");
                }
            }
        }
        this.LLJLLIL.LLJI = this.LLJJL;
        int i = this.LLJJJJ;
        if (musicModel.getMusicItemType() == MusicModel.MusicItemType.RECOMMENDED_FAV_MUSIC) {
            i = 12;
        }
        if (!TextUtils.isEmpty(musicModel.getSearchId())) {
            i = 2;
        }
        if (musicModel.hasExtendMusicList()) {
            ChooseMusicDownloadPlayHelper chooseMusicDownloadPlayHelper = this.LLJLLIL;
            MR(musicModel);
            chooseMusicDownloadPlayHelper.Sf(i, musicModel, true, VR(), false);
        } else {
            ChooseMusicDownloadPlayHelper chooseMusicDownloadPlayHelper2 = this.LLJLLIL;
            MR(musicModel);
            chooseMusicDownloadPlayHelper2.Uf(i, musicModel, true, VR());
        }
    }

    @Override // X.C15H0
    public final void cJ(MusicModel musicModel, C15HO c15ho) {
        MR(musicModel);
        this.LLJJJJJIL = musicModel;
        this.LLIZ.zQ2(Boolean.TRUE, "music_loading");
        int i = this.LLJJJJ;
        if (musicModel.getMusicItemType() == MusicModel.MusicItemType.RECOMMENDED_FAV_MUSIC) {
            i = 12;
        }
        if (this.LLJJJJLIIL) {
            this.LLJLLIL.LLJJL = c15ho;
            if (c15ho != null && c15ho.LJII) {
                this.LLIZ.zQ2(musicModel.getMusicId(), "last_play_music_id");
            }
            ChooseMusicDownloadPlayHelper chooseMusicDownloadPlayHelper = this.LLJLLIL;
            MR(musicModel);
            chooseMusicDownloadPlayHelper.LJIIJ(musicModel, false, i);
            return;
        }
        ChooseMusicDownloadPlayHelper chooseMusicDownloadPlayHelper2 = this.LLJLLIL;
        MR(musicModel);
        chooseMusicDownloadPlayHelper2.Uf(i, musicModel, true, VR());
    }

    @Override // X.InterfaceC1260330itz
    public final void onScroll(int i, int i2) {
        cS();
    }

    @Override // X.InterfaceC1260330itz
    public final void onScrolled(float f, float f2) {
        RecyclerView recyclerView;
        if (AbstractC19994813Le.Default.nextFloat() < 0.1d) {
            ((IExternalService) ServiceManager.get().getService(IExternalService.class)).provideAVPerformance().startPerformanceMonitor("tool_music_scroll", 500, -1L);
        }
        if (isViewValid()) {
            try {
                switch (C11FC.LIZ[this.LLJIJIL.ordinal()]) {
                    case 1:
                        recyclerView = this.LLJJLIIIJLLLLLLLZ.LL;
                        break;
                    case 2:
                        recyclerView = this.LLJJLIIIJLLLLLLLZ.LL;
                        break;
                    case 3:
                        recyclerView = (RecyclerView) this.LLJLIL.LJJLIIIJILLIZJL();
                        break;
                    case 4:
                        recyclerView = (RecyclerView) this.LLJL.LJJLIIIJILLIZJL();
                        break;
                    case 5:
                        recyclerView = (RecyclerView) this.LLJLL.LJJLIIIJILLIZJL();
                        break;
                    case 6:
                        recyclerView = (RecyclerView) this.LLJLILLLLZIIL.LJJLIIIJILLIZJL();
                        break;
                    default:
                        return;
                }
                if (recyclerView != null && this.LLILZIL != null) {
                    int childCount = recyclerView.getChildCount();
                    if (childCount == 0) {
                        C1260290itv c1260290itv = this.LLILZIL;
                        if (c1260290itv.LLJJL != 0) {
                            c1260290itv.scrollTo(0, 0);
                        }
                        this.LLILZIL.setMaxScrollHeight(0);
                        return;
                    }
                    View childAt = recyclerView.getLayoutManager().getChildAt(childCount - 1);
                    int childCount2 = this.LLILZIL.getChildCount();
                    if (childCount2 >= 2 && childAt != null) {
                        this.LLILZIL.setMaxScrollHeight(((recyclerView.getTop() + childAt.getBottom()) + this.LLILZIL.getChildAt(childCount2 - 1).getTop()) - ((View) this.LLILZIL.getParent()).getMeasuredHeight());
                    }
                }
            } catch (NullPointerException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v54, types: [X.15HE] */
    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(final View view, Bundle bundle) {
        ViewPagerBottomSheetBehavior<View> viewPagerBottomSheetBehavior;
        C15II c15ii;
        ConstraintLayout constraintLayout;
        String str;
        boolean z;
        Map<String, Object> recommendExtra;
        Serializable serializable;
        Map<String, Object> recommendExtra2;
        Serializable serializable2;
        super.onViewCreated(view, bundle);
        C1260290itv c1260290itv = this.LLILZIL;
        if (c1260290itv != null) {
            int visibility = c1260290itv.getVisibility();
            c1260290itv.setVisibility(4);
            C1602160rnK.LIZIZ(visibility, 4, c1260290itv);
            this.LLILZIL.setOnScrollListener(this);
        }
        boolean z2 = this.LLLFF;
        if (bundle == null) {
            boolean z3 = this.LLJJIJIIJIL;
            if (z3) {
                this.LLJIJIL = C11FA.TAB_TYPE_UNLIMITED_MUSIC;
            } else {
                this.LLJIJIL = C11FD.LIZIZ(0, z2, z3);
            }
        } else {
            this.LLJIJIL = C11FD.LIZIZ(bundle.getInt("KEY_CURRENT_TAB", 0), z2, this.LLJJIJIIJIL);
        }
        DataCenter dataCenterVQ2 = DataCenter.vQ2(ViewModelProviders.of(this), this);
        this.LLIZ = dataCenterVQ2;
        dataCenterVQ2.yQ2("pick_status", this, false);
        dataCenterVQ2.yQ2("data_banner", this, false);
        dataCenterVQ2.yQ2("play_compeleted", this, false);
        dataCenterVQ2.yQ2("music_collect_status", this, false);
        dataCenterVQ2.yQ2("music_reset_play_start", this, false);
        this.LLIZ.yQ2("music_loading", this, false);
        this.LLIZ.zQ2(Integer.valueOf(this.LLJJJIL), "key_choose_music_type");
        this.LLIZ.zQ2(this.LLJJ, "sticker_id");
        this.LLIZ.zQ2(this.LLJILJILJ, "challenge_id");
        this.LLIZ.zQ2(Boolean.valueOf(this.LLJZIJLIL), "mvtheme_music_type");
        this.LLIZ.zQ2(Boolean.valueOf(this.LLL), "is_photo_mv_type");
        this.LLIZ.zQ2(Boolean.valueOf(this.LLJJI), "is_busi_sticker");
        this.LLIZ.zQ2(this.LLJJIII, "effect_icon_url");
        this.LLIZ.zQ2(this.LLJJIJI, "music_request_param");
        this.LLIZ.zQ2(this.LLJJJ, "shoot_way");
        this.LLIZ.zQ2(Boolean.valueOf(this.LLLIIL), "enable_extend_music");
        this.LLIZ.zQ2(Boolean.valueOf(this.LLLIILIL), "key_show_lyric_tag");
        ((ICreativeSAAService) ServiceManager.get().getService(ICreativeSAAService.class)).invokeMethodsSafely(requireActivity(), new Function0<Unit>() { // from class: X.15HF
            @Override // kotlin.jvm.functions.Function0
            public final Unit invoke() {
                BaseNewMusicTabFragment baseNewMusicTabFragment = this.LLILLJJLI;
                baseNewMusicTabFragment.LLIZLLLIL = WidgetManager.SR(view, baseNewMusicTabFragment);
                return null;
            }
        });
        this.LLIZLLLIL.UR(this.LLIZ);
        this.LLJILJIL = new MusicBannerWidget(this.LLLFFI, this.LLLFZ, this.LLLI);
        this.LLJLLL = new C204594153w(getContext(), this.LLIZ);
        this.LLIZLLLIL.MR(R.id.brx, this.LLJILJIL);
        int iLIZ = C11FD.LIZ(C11FA.TAB_TYPE_DISCOVER, false, this.LLJJIJIIJIL);
        if (C1911780zqi.LIZJ(this.LLJJIJIIJIL)) {
            iLIZ = C11FD.LIZ(C11FA.TAB_TYPE_MORE, this.LLLFF, this.LLJJIJIIJIL);
        }
        FragmentManager childFragmentManager = getChildFragmentManager();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        String str2 = LLLILZLLLI;
        sbLIZ.append(str2);
        sbLIZ.append(iLIZ);
        Fragment fragmentLJJJJZI = childFragmentManager.LJJJJZI(C2188811AlT.LIZIZ(sbLIZ));
        if (fragmentLJJJJZI instanceof DiscoverMusicFragment) {
            this.LLJJLIIIJLLLLLLLZ = (DiscoverMusicFragment) fragmentLJJJJZI;
        }
        if (this.LLJJLIIIJLLLLLLLZ == null) {
            IMusicRequestParam iMusicRequestParam = this.LLJJIJI;
            if (iMusicRequestParam != null) {
                recommendExtra2 = iMusicRequestParam.getRecommendExtra();
            } else {
                recommendExtra2 = null;
            }
            int i = this.LLJJJIL;
            String str3 = this.LLJILJILJ;
            int i2 = this.LLLFFI;
            long j = this.LLLFZ;
            long j2 = this.LLLI;
            boolean z4 = this.LLJJIJIIJIL;
            Bundle bundle2 = new Bundle();
            bundle2.putInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", i);
            if (!TextUtils.isEmpty(str3)) {
                C786410Ut5.LJJJI("challenge", str3, bundle2);
            }
            bundle2.putInt("sound_page_scene", i2);
            bundle2.putLong("max_video_duration", j);
            bundle2.putLong("shoot_video_length", j2);
            bundle2.putBoolean("is_unlimited_only", z4);
            if (recommendExtra2 != null) {
                if (recommendExtra2 instanceof Serializable) {
                    serializable2 = (Serializable) recommendExtra2;
                } else {
                    serializable2 = null;
                }
                C786410Ut5.LJJIZ(bundle2, "recommend_extra", serializable2);
            }
            DiscoverMusicFragment discoverMusicFragment = new DiscoverMusicFragment();
            discoverMusicFragment.setArguments(bundle2);
            this.LLJJLIIIJLLLLLLLZ = discoverMusicFragment;
        }
        DiscoverMusicFragment discoverMusicFragment2 = this.LLJJLIIIJLLLLLLLZ;
        discoverMusicFragment2.LLILLL = this.LLIZ;
        discoverMusicFragment2.LLILZ = this.LLIZLLLIL;
        discoverMusicFragment2.LLJIJIL = this.LLJLLL;
        discoverMusicFragment2.LLIZ = this;
        C15HB c15hb = discoverMusicFragment2.LLILZIL;
        if (c15hb != null) {
            c15hb.LLILZ = this;
        }
        discoverMusicFragment2.LLIZLLLIL = this;
        if (c15hb != null) {
            c15hb.LLILZLL = this;
        }
        discoverMusicFragment2.LLJ = this;
        if (c15hb != null) {
            c15hb.LLJJIJIIJIL = this;
        }
        int iLIZ2 = C11FD.LIZ(C11FA.TAB_TYPE_COLLECT, false, this.LLJJIJIIJIL);
        FragmentManager childFragmentManager2 = getChildFragmentManager();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(str2);
        sbLIZ2.append(iLIZ2);
        Fragment fragmentLJJJJZI2 = childFragmentManager2.LJJJJZI(C2188811AlT.LIZIZ(sbLIZ2));
        if (fragmentLJJJJZI2 instanceof CollectMusicFragment) {
            this.LLJL = (CollectMusicFragment) fragmentLJJJJZI2;
        }
        if (this.LLJL == null) {
            int i3 = this.LLJJJIL;
            String str4 = this.LLJILJILJ;
            int i4 = this.LLLFFI;
            Long lValueOf = Long.valueOf(this.LLLFZ);
            Long lValueOf2 = Long.valueOf(this.LLLI);
            Boolean boolValueOf = Boolean.valueOf(this.LLJJIJIIJIL);
            Long lValueOf3 = Long.valueOf(this.LLJJIJIL);
            Bundle bundle3 = new Bundle();
            bundle3.putInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", i3);
            if (!TextUtils.isEmpty(str4)) {
                C786410Ut5.LJJJI("challenge", str4, bundle3);
            }
            bundle3.putInt("sound_page_scene", i4);
            bundle3.putLong("max_video_duration", lValueOf.longValue());
            bundle3.putLong("shoot_video_length", lValueOf2.longValue());
            bundle3.putBoolean("get_unlimited_music_only", boolValueOf.booleanValue());
            bundle3.putLong("force_max_music_length", lValueOf3.longValue());
            CollectMusicFragment collectMusicFragment = new CollectMusicFragment();
            collectMusicFragment.setArguments(bundle3);
            this.LLJL = collectMusicFragment;
        }
        CollectMusicFragment collectMusicFragment2 = this.LLJL;
        collectMusicFragment2.LLILZLL = this.LLIZ;
        collectMusicFragment2.LLJJIJI = this;
        if (this.LLLFF) {
            int iLIZ3 = C11FD.LIZ(C11FA.TAB_TYPE_LOCAL, true, this.LLJJIJIIJIL);
            FragmentManager childFragmentManager3 = getChildFragmentManager();
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(str2);
            sbLIZ3.append(iLIZ3);
            Fragment fragmentLJJJJZI3 = childFragmentManager3.LJJJJZI(C2188811AlT.LIZIZ(sbLIZ3));
            if (fragmentLJJJJZI3 instanceof LocalMusicTabFragment) {
                this.LLJLL = (LocalMusicTabFragment) fragmentLJJJJZI3;
            }
            if (this.LLJLL == null) {
                int i5 = this.LLJJJIL;
                long j3 = this.LLLFZ;
                long j4 = this.LLLI;
                LocalMusicTabFragment localMusicTabFragment = new LocalMusicTabFragment();
                Bundle bundle4 = new Bundle();
                bundle4.putInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", i5);
                bundle4.putLong("max_video_duration", j3);
                bundle4.putLong("shoot_video_length", j4);
                localMusicTabFragment.setArguments(bundle4);
                this.LLJLL = localMusicTabFragment;
            }
            LocalMusicTabFragment localMusicTabFragment2 = this.LLJLL;
            localMusicTabFragment2.LLJJIJIIJIL = this;
            localMusicTabFragment2.LLILZLL = this.LLIZ;
        }
        if (C1911780zqi.LIZJ(this.LLJJIJIIJIL)) {
            int iLIZ4 = C11FD.LIZ(C11FA.TAB_TYPE_FOR_YOU, false, this.LLJJIJIIJIL);
            FragmentManager childFragmentManager4 = getChildFragmentManager();
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append(str2);
            sbLIZ4.append(iLIZ4);
            Fragment fragmentLJJJJZI4 = childFragmentManager4.LJJJJZI(C2188811AlT.LIZIZ(sbLIZ4));
            if (fragmentLJJJJZI4 instanceof ForYouMusicFragment) {
                this.LLJLIL = (ForYouMusicFragment) fragmentLJJJJZI4;
            }
            if (this.LLJLIL == null) {
                IMusicRequestParam iMusicRequestParam2 = this.LLJJIJI;
                if (iMusicRequestParam2 != null) {
                    recommendExtra = iMusicRequestParam2.getRecommendExtra();
                } else {
                    recommendExtra = null;
                }
                int i6 = this.LLJJJIL;
                String str5 = this.LLJILJILJ;
                int i7 = this.LLLFFI;
                long j5 = this.LLLFZ;
                long j6 = this.LLLI;
                long j7 = this.LLJJIJIL;
                boolean z5 = this.LLJJIJIIJIL;
                Bundle bundle5 = new Bundle();
                bundle5.putInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", i6);
                if (!TextUtils.isEmpty(str5)) {
                    C786410Ut5.LJJJI("challenge", str5, bundle5);
                }
                bundle5.putInt("sound_page_scene", i7);
                bundle5.putLong("max_video_duration", j5);
                bundle5.putLong("shoot_video_length", j6);
                bundle5.putLong("force_max_music_length", j7);
                bundle5.putBoolean("is_unlimited_only", z5);
                if (recommendExtra instanceof Serializable) {
                    serializable = (Serializable) recommendExtra;
                } else {
                    serializable = null;
                }
                C786410Ut5.LJJIZ(bundle5, "recommend_extra", serializable);
                ForYouMusicFragment forYouMusicFragment = new ForYouMusicFragment();
                forYouMusicFragment.setArguments(bundle5);
                this.LLJLIL = forYouMusicFragment;
            }
            ForYouMusicFragment forYouMusicFragment2 = this.LLJLIL;
            forYouMusicFragment2.LLILZLL = this.LLIZ;
            forYouMusicFragment2.LLJJIII = this;
        }
        if (C11FE.LIZIZ(this.LLJJIJIIJIL)) {
            int iLIZ5 = C11FD.LIZ(C11FA.TAB_TYPE_UNLIMITED_MUSIC, false, this.LLJJIJIIJIL);
            FragmentManager childFragmentManager5 = getChildFragmentManager();
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append(str2);
            sbLIZ5.append(iLIZ5);
            Fragment fragmentLJJJJZI5 = childFragmentManager5.LJJJJZI(C2188811AlT.LIZIZ(sbLIZ5));
            if (fragmentLJJJJZI5 instanceof UnlimitedMusicFragment) {
                this.LLJLILLLLZIIL = (UnlimitedMusicFragment) fragmentLJJJJZI5;
            }
            if (this.LLJLILLLLZIIL == null) {
                int i8 = this.LLJJJIL;
                String str6 = this.LLJILJILJ;
                int i9 = this.LLLFFI;
                long j8 = this.LLLFZ;
                long j9 = this.LLLI;
                long j10 = this.LLJJIJIL;
                Bundle bundle6 = new Bundle();
                bundle6.putInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", i8);
                if (!TextUtils.isEmpty(str6)) {
                    C786410Ut5.LJJJI("challenge", str6, bundle6);
                }
                bundle6.putInt("sound_page_scene", i9);
                bundle6.putLong("max_video_duration", j8);
                bundle6.putLong("shoot_video_length", j9);
                bundle6.putLong("force_max_music_length", j10);
                bundle6.putInt("music_discovery_type", 4);
                UnlimitedMusicFragment unlimitedMusicFragment = new UnlimitedMusicFragment();
                unlimitedMusicFragment.setArguments(bundle6);
                this.LLJLILLLLZIIL = unlimitedMusicFragment;
            }
            UnlimitedMusicFragment unlimitedMusicFragment2 = this.LLJLILLLLZIIL;
            unlimitedMusicFragment2.LLILZLL = this.LLIZ;
            unlimitedMusicFragment2.LLJJIII = this;
        }
        ChooseMusicDownloadPlayHelper chooseMusicDownloadPlayHelper = new ChooseMusicDownloadPlayHelper((InterfaceC20499515Jh) this, (C15HE) new C15JP() { // from class: X.15HE
            @Override // X.C15JP
            public final void LIZ() {
                BaseNewMusicTabFragment baseNewMusicTabFragment = this.LIZ;
                MusicModel musicModel = baseNewMusicTabFragment.LLJJJJJIL;
                if (musicModel != null) {
                    baseNewMusicTabFragment.LLIZ.zQ2(musicModel.getMusicId(), "play_error");
                }
            }

            @Override // X.C15JP
            public final void LIZIZ() {
                BaseNewMusicTabFragment baseNewMusicTabFragment = this.LIZ;
                MusicModel musicModel = baseNewMusicTabFragment.LLJJJJJIL;
                if (musicModel != null) {
                    baseNewMusicTabFragment.LLIZ.zQ2(musicModel.getMusicId(), "play_compeleted");
                }
            }
        });
        this.LLJLLIL = chooseMusicDownloadPlayHelper;
        chooseMusicDownloadPlayHelper.Mf();
        this.LLJLLIL.LLILLJJLI = this.LLJJJIL;
        if (!C15GL.LIZ()) {
            PR();
        }
        C11FE c11fe = C11FE.LIZ;
        boolean z6 = this.LLJJIJIIJIL;
        c11fe.getClass();
        int iLIZ6 = C11FE.LIZ(z6);
        if (C1911780zqi.LIZJ(this.LLJJIJIIJIL)) {
            this.LLILZ.setOffscreenPageLimit(iLIZ6 + 3);
        } else {
            this.LLILZ.setOffscreenPageLimit(iLIZ6 + 2);
        }
        final FragmentManager childFragmentManager6 = getChildFragmentManager();
        this.LLILZ.setAdapter(new AbstractC480470Isn(childFragmentManager6) { // from class: X.120k
            @Override // androidx.viewpager.widget.PagerAdapter
            public final int getCount() {
                C11FE c11fe2 = C11FE.LIZ;
                boolean z7 = this.LLIZ.LLJJIJIIJIL;
                c11fe2.getClass();
                int iLIZ7 = C11FE.LIZ(z7);
                BaseNewMusicTabFragment baseNewMusicTabFragment = this.LLIZ;
                return baseNewMusicTabFragment.LLLFF ? C1911780zqi.LIZJ(baseNewMusicTabFragment.LLJJIJIIJIL) ? iLIZ7 + 4 : iLIZ7 + 3 : C1911780zqi.LIZJ(baseNewMusicTabFragment.LLJJIJIIJIL) ? iLIZ7 + 3 : iLIZ7 + 2;
            }

            @Override // androidx.viewpager.widget.PagerAdapter
            public final CharSequence LJIJJLI(int i10) {
                BaseNewMusicTabFragment baseNewMusicTabFragment = this.LLIZ;
                return this.LLIZ.OR(C11FD.LIZIZ(i10, baseNewMusicTabFragment.LLLFF, baseNewMusicTabFragment.LLJJIJIIJIL));
            }

            @Override // X.AbstractC480470Isn
            public final Fragment LJJIJIL(int i10) {
                BaseNewMusicTabFragment baseNewMusicTabFragment = this.LLIZ;
                switch (C11FC.LIZ[C11FD.LIZIZ(i10, baseNewMusicTabFragment.LLLFF, baseNewMusicTabFragment.LLJJIJIIJIL).ordinal()]) {
                    case 1:
                    case 2:
                        return this.LLIZ.LLJJLIIIJLLLLLLLZ;
                    case 3:
                        return this.LLIZ.LLJLIL;
                    case 4:
                        return this.LLIZ.LLJL;
                    case 5:
                        return this.LLIZ.LLJLL;
                    case 6:
                        return this.LLIZ.LLJLILLLLZIIL;
                    default:
                        throw new IllegalStateException("Wrong TabType");
                }
            }
        });
        C1846060y8i c1846060y8i = this.LLILLL;
        if (c1846060y8i != null) {
            c1846060y8i.setupWithViewPager(this.LLILZ);
            dS((LinearLayout) this.LLILLL.getChildAt(0));
            this.LLILLL.LIZ(new C120K(this));
            C1845940y8W c1845940y8WLJII = this.LLILLL.LJII(C11FD.LIZ(this.LLJIJIL, this.LLLFF, this.LLJJIJIIJIL));
            if (c1845940y8WLJII != null) {
                c1845940y8WLJII.LIZ();
            }
        }
        if (this.LLILLL != null) {
            C14KQ.LJIIIIZZ(getContext());
            C341940Daq.LIZ(128.0d);
            this.LLILLL.findViewById(android.R.id.text1);
            int tabCount = this.LLILLL.getTabCount();
            StringBuilder sb = new StringBuilder();
            for (int i10 = 0; i10 < tabCount; i10++) {
                sb.append(OR(C11FD.LIZIZ(i10, this.LLLFF, this.LLJJIJIIJIL)));
            }
        }
        UR();
        hS(this.LLJIJIL);
        C11FA c11fa = this.LLJIJIL;
        C15IK.LJIIZILJ = c11fa;
        if (c11fa == C11FA.TAB_TYPE_LOCAL) {
            C19EG activity = getActivity();
            if (Build.VERSION.SDK_INT >= 33) {
                str = "android.permission.READ_MEDIA_AUDIO";
            } else {
                str = "android.permission.WRITE_EXTERNAL_STORAGE";
            }
            if (C838410Wul.LIZ(activity, str) == 0) {
                z = true;
            } else {
                z = false;
            }
            C15IK.LJIIZILJ(c11fa, z);
        } else {
            C15IK.LJIIZILJ(c11fa, false);
        }
        if (!C20510015Ni.LIZ.LJIIIIZZ()) {
            Fragment parentFragment = getParentFragment();
            if ((parentFragment instanceof BaseChooseMusicFragment) && (c15ii = ((BaseChooseMusicFragment) parentFragment).LLJ) != null && (constraintLayout = c15ii.LIZIZ) != null) {
                C786410Ut5.LL(8, constraintLayout);
            }
        }
        NR();
        C19EG activity2 = getActivity();
        if (activity2 instanceof ChooseMusicActivity) {
            ViewPagerBottomSheetBehavior viewPagerBottomSheetBehavior2 = ((ChooseMusicActivity) activity2).LLILZLL;
            if (viewPagerBottomSheetBehavior2 != null) {
                ViewPager viewPager = this.LLILZ;
                viewPager.addOnPageChangeListener(new C20732616Ay(viewPager, viewPagerBottomSheetBehavior2));
                return;
            }
            return;
        }
        if (!(activity2 instanceof C19EG) || (viewPagerBottomSheetBehavior = ((ChooseMusicWithSceneViewModel) C1659630tI1.LJ(this).get(ChooseMusicWithSceneViewModel.class)).LLILLL) == null) {
            return;
        }
        ViewPager viewPager2 = this.LLILZ;
        viewPager2.addOnPageChangeListener(new C20732616Ay(viewPager2, viewPagerBottomSheetBehavior));
    }

    @Override // X.InterfaceC20499515Jh
    public final void LLJJL(MusicModel musicModel, String str, String str2) throws Throwable {
        C19EG activity = getActivity();
        int i = this.LLJJJIL;
        if (i != 0 && i != 2) {
            String string = getArguments().getString("shoot_way");
            RecordConfig.Builder builder = new RecordConfig.Builder();
            builder.shootWay(string);
            builder.creationId(UUID.randomUUID().toString());
            builder.musicOrigin(str2);
            builder.musicPath(str);
            builder.musicModel(musicModel);
            ((IExternalService) ServiceManager.get().getService(IExternalService.class)).asyncService("NewMusicTab", new C580830MqH(activity, builder, musicModel, 7));
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("path", str);
        intent.putExtra("music_model", musicModel);
        intent.putExtra("music_origin", str2);
        intent.putExtra("music_tab_name", this.LLJIJIL.name());
        intent.putExtra("is_music_loop", C1654360t9W.LIZIZ);
        SR(intent, musicModel);
        if (activity != null) {
            C2204961BRm.LJIIL(-1, activity, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmgbJDd2T/+hJ7f32JIl4WAL/1caAPQ6v3vAx+4VQCgiNWRrHNkfZTlBS79", null));
        }
        if (C0EM1.LIZ(musicModel.getMusicId()) != null) {
            IAVPerformance iAVPerformanceProvideAVPerformance = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).provideAVPerformance();
            PerformanceMonitor performanceMonitorLIZ = C0EM1.LIZ(musicModel.getMusicId());
            Objects.requireNonNull(performanceMonitorLIZ);
            iAVPerformanceProvideAVPerformance.step(performanceMonitorLIZ, "music tab fragment finish activity");
        }
        if (getActivity() != null) {
            ChooseMusicWithSceneViewModel chooseMusicWithSceneViewModel = this.LLJI;
            if (chooseMusicWithSceneViewModel.LL) {
                ((LiveData) chooseMusicWithSceneViewModel.LLILZLL.getValue()).setValue(new C20496915Ih(-1, intent));
                return;
            }
        }
        activity.finish();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == 101) {
            this.LLJLL.onActivityResult(i, i2, intent);
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19GS c19gs;
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.c9_, viewGroup, false);
        this.LLILLJJLI = (C1749280vcc) viewTd.findViewById(R.id.w28);
        this.LLILLL = (C1846060y8i) viewTd.findViewById(R.id.wya);
        this.LLILZ = (ViewPager) viewTd.findViewById(R.id.i64);
        this.LLILZIL = (C1260290itv) viewTd.findViewById(R.id.u30);
        this.LLILZLL = viewTd.findViewById(R.id.fyx);
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

    @Override // X.InterfaceC20499515Jh
    public final void y4(Map<String, String> map, MusicModel musicModel, String str) throws Throwable {
        C19EG activity = getActivity();
        int i = this.LLJJJIL;
        if (i != 0 && i != 2) {
            String string = getArguments().getString("shoot_way");
            RecordConfig.Builder builder = new RecordConfig.Builder();
            builder.shootWay(string);
            builder.creationId(UUID.randomUUID().toString());
            builder.musicOrigin(str);
            builder.musicPath(map.get(0));
            builder.musicModel(musicModel);
            ((IExternalService) ServiceManager.get().getService(IExternalService.class)).asyncService("NewMusicTab", new C12Y3(activity, builder, musicModel, 0));
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("path", map.get(musicModel.getMusicId()));
        intent.putExtra("music_model", musicModel);
        intent.putExtra("music_origin", str);
        intent.putExtra("music_tab_name", this.LLJIJIL.name());
        intent.putExtra("multi_choose", new MultiChoose(musicModel, map));
        SR(intent, musicModel);
        if (activity != null) {
            C2204961BRm.LJIIL(-1, activity, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmgbJDd2T/+hJ7f32JIl4WAL/1caAPQ6v3vAx+4VQCgiNWRrHNkfZTlBS79", null));
        }
        if (C0EM1.LIZ(musicModel.getMusicId()) != null) {
            IAVPerformance iAVPerformanceProvideAVPerformance = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).provideAVPerformance();
            PerformanceMonitor performanceMonitorLIZ = C0EM1.LIZ(musicModel.getMusicId());
            Objects.requireNonNull(performanceMonitorLIZ);
            iAVPerformanceProvideAVPerformance.step(performanceMonitorLIZ, "music tab fragment finish activity");
        }
        if (getActivity() != null) {
            ChooseMusicWithSceneViewModel chooseMusicWithSceneViewModel = this.LLJI;
            if (chooseMusicWithSceneViewModel.LL) {
                ((LiveData) chooseMusicWithSceneViewModel.LLILZLL.getValue()).setValue(new C20496915Ih(-1, intent));
                return;
            }
        }
        activity.finish();
    }
}
