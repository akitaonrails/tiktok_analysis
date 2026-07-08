package com.ss.android.ugc.aweme.music.v2;

import X.C019F;
import X.C01D1;
import X.C098200Yq;
import X.C0C64;
import X.C0XKC;
import X.C127G;
import X.C1389890mGx;
import X.C13LE;
import X.C14EU;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C189200o6;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C20684815ws;
import X.C2217381BqS;
import X.C2344009Gk;
import X.C294780Bgy;
import X.C327850CtD;
import X.C338490DOt;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C484220Iyq;
import X.C485430J1x;
import X.C486890J7n;
import X.C629480OmY;
import X.C629790On3;
import X.C629800On4;
import X.C630970Oox;
import X.C631000Op0;
import X.C632130Oqp;
import X.C633020OsG;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C888460YtI;
import X.C987103tV;
import X.InterfaceC1401270mZJ;
import X.InterfaceC214897198d;
import X.InterfaceC214902198i;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724760Sbq;
import Y.AObjectS62S0000000_9;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.SAFTikTokFragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.detail.base.DetailBaseFragment;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import com.ss.android.ugc.aweme.music.model.MusicOwnerInfo;
import com.ss.android.ugc.aweme.music.v2.assem.MusicPgcMetaInfoAssem;
import com.ss.android.ugc.aweme.music.v2.assem.MusicPgcMetaInfoWithArtistAssem;
import com.ss.android.ugc.aweme.music.v2.assem.story.IStoryMusicCoverEntranceViewModel;
import com.ss.android.ugc.aweme.music.v2.viewmodel.MusicCollectViewModel;
import com.ss.android.ugc.aweme.music.v2.viewmodel.MusicDetailViewModel;
import com.ss.android.ugc.aweme.music.v2.viewmodel.MusicDraftVM;
import com.ss.android.ugc.aweme.music.v2.viewmodel.MusicPlayViewModel;
import com.ss.android.ugc.aweme.music.v2.viewmodel.SharedMusicDetailViewModel;
import com.ss.android.ugc.aweme.prefab.ability.RefreshAbility;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class MusicDetailFragment extends DetailBaseFragment implements RefreshAbility, InterfaceC1401270mZJ {
    public static final C629800On4 LLJJI;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIII;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2Zig5HELIOSOiYwZjN+ZwImOywvDSonKSwgDz0yLygpJzs=";
    public final AssemVMLazy LLIZ;
    public final AssemVMLazy LLIZLLLIL;
    public final AssemVMLazy LLJ;
    public final AssemVMLazy LLJI;
    public final AssemVMLazy LLJIJIL;
    public final AssemVMLazy LLJILJIL;
    public boolean LLJILJILJ;
    public long LLJILLL;
    public C127G LLJJ;

    /* JADX WARN: Type inference failed for: r0v13, types: [X.0On4] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MusicDetailFragment.class, "musicDetailVM", "getMusicDetailVM()Lcom/ss/android/ugc/aweme/music/v2/viewmodel/MusicDetailViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIII = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(MusicDetailFragment.class, "musicCollectVM", "getMusicCollectVM()Lcom/ss/android/ugc/aweme/music/v2/viewmodel/MusicCollectViewModel;", 0), new C2217381BqS(MusicDetailFragment.class, "musicPlayViewModel", "getMusicPlayViewModel()Lcom/ss/android/ugc/aweme/music/v2/viewmodel/MusicPlayViewModel;", 0), new C2217381BqS(MusicDetailFragment.class, "musicDraftVM", "getMusicDraftVM()Lcom/ss/android/ugc/aweme/music/v2/viewmodel/MusicDraftVM;", 0), new C2217381BqS(MusicDetailFragment.class, "storyMusicCoverEntranceVM", "getStoryMusicCoverEntranceVM()Lcom/ss/android/ugc/aweme/music/v2/assem/story/IStoryMusicCoverEntranceViewModel;", 0), new C2217381BqS(MusicDetailFragment.class, "sharedMusicDetailVM", "getSharedMusicDetailVM()Lcom/ss/android/ugc/aweme/music/v2/viewmodel/SharedMusicDetailViewModel;", 0)};
        LLJJI = new Object() { // from class: X.0On4
        };
    }

    @Override // X.InterfaceC1401270mZJ
    public final void LJFF() {
    }

    @Override // com.ss.android.ugc.aweme.detail.prefab.ability.DetailPageNameAbility
    public final String MP() {
        return "single_song";
    }

    public MusicDetailFragment() {
        AssemVMLazy assemVMLazy;
        boolean z;
        AssemVMLazy assemVMLazy2;
        boolean z2;
        AssemVMLazy assemVMLazy3;
        boolean z3;
        AssemVMLazy assemVMLazy4;
        boolean z4;
        AssemVMLazy assemVMLazy5;
        boolean z5;
        boolean z6;
        AssemVMLazy assemVMLazy6;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MusicDetailViewModel.class);
        AwS553S0100000_9 awS553S0100000_9 = new AwS553S0100000_9(c19719912DlLIZ, 1214);
        AFwS240S0000000_9 aFwS240S0000000_9 = AFwS240S0000000_9.get$arr$(513);
        C01D1 c01d1 = C01D1.LIZ;
        if (Intrinsics.LJFF(interfaceC724760Sbq, c01d1)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS553S0100000_9, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS553S0100000_9((HasDefaultViewModelProviderFactory) this, 1198), aFwS240S0000000_9, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
            z = true;
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS553S0100000_9, new AwS553S0100000_9((Fragment) this, 1200), aFwS240S0000000_9, null, null, null);
            z = true;
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            z = true;
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS553S0100000_9, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS553S0100000_9((HasDefaultViewModelProviderFactory) this, 1202), aFwS240S0000000_9, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLIZ = assemVMLazy;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(MusicCollectViewModel.class);
        AwS553S0100000_9 awS553S0100000_92 = new AwS553S0100000_9(c19719912DlLIZ2, 1203);
        AFwS240S0000000_9 aFwS240S0000000_92 = AFwS240S0000000_9.get$arr$(514);
        if (Intrinsics.LJFF(interfaceC724760Sbq, c01d1)) {
            assemVMLazy2 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ2), awS553S0100000_92, new C452070Ho5(), new C1622206Wu(this, z), new C338490DOt(this, z), new AwS553S0100000_9((HasDefaultViewModelProviderFactory) this, 1206), aFwS240S0000000_92, new C451460Hn6(this, z), new C451620HnM(this, z), new C987103tV(this, z));
            z2 = true;
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy2 = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), awS553S0100000_92, new AwS553S0100000_9((Fragment) this, 1207), aFwS240S0000000_92, null, null, null);
            z2 = true;
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            z2 = true;
            assemVMLazy2 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ2), awS553S0100000_92, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS553S0100000_9((HasDefaultViewModelProviderFactory) this, 1204), aFwS240S0000000_92, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLIZLLLIL = assemVMLazy2;
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(MusicPlayViewModel.class);
        AwS553S0100000_9 awS553S0100000_93 = new AwS553S0100000_9(c19719912DlLIZ3, 1205);
        AFwS240S0000000_9 aFwS240S0000000_93 = AFwS240S0000000_9.get$arr$(515);
        if (Intrinsics.LJFF(interfaceC724760Sbq, c01d1)) {
            assemVMLazy3 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ3), awS553S0100000_93, new C452070Ho5(), new C1622206Wu(this, z2), new C338490DOt(this, z2), new AwS553S0100000_9((HasDefaultViewModelProviderFactory) this, 1208), aFwS240S0000000_93, new C451460Hn6(this, z2), new C451620HnM(this, z2), new C987103tV(this, z2));
            z3 = true;
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy3 = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), awS553S0100000_93, new AwS553S0100000_9((Fragment) this, 1209), aFwS240S0000000_93, null, null, null);
            z3 = true;
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            z3 = true;
            assemVMLazy3 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ3), awS553S0100000_93, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS553S0100000_9((HasDefaultViewModelProviderFactory) this, 1210), aFwS240S0000000_93, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJ = assemVMLazy3;
        C19719912Dl c19719912DlLIZ4 = C13LE.LIZ(MusicDraftVM.class);
        AwS553S0100000_9 awS553S0100000_94 = new AwS553S0100000_9(c19719912DlLIZ4, 1211);
        AFwS240S0000000_9 aFwS240S0000000_94 = AFwS240S0000000_9.get$arr$(516);
        if (Intrinsics.LJFF(interfaceC724760Sbq, c01d1)) {
            assemVMLazy4 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ4), awS553S0100000_94, new C452070Ho5(), new C1622206Wu(this, z3), new C338490DOt(this, z3), new AwS553S0100000_9((HasDefaultViewModelProviderFactory) this, 1212), aFwS240S0000000_94, new C451460Hn6(this, z3), new C451620HnM(this, z3), new C987103tV(this, z3));
            z4 = true;
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy4 = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ4), awS553S0100000_94, new AwS553S0100000_9((Fragment) this, 1213), aFwS240S0000000_94, null, null, null);
            z4 = true;
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            z4 = true;
            assemVMLazy4 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ4), awS553S0100000_94, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS553S0100000_9((HasDefaultViewModelProviderFactory) this, 1215), aFwS240S0000000_94, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJI = assemVMLazy4;
        C19719912Dl c19719912DlLIZ5 = C13LE.LIZ(IStoryMusicCoverEntranceViewModel.class);
        AwS553S0100000_9 awS553S0100000_95 = new AwS553S0100000_9(c19719912DlLIZ5, 1216);
        AFwS240S0000000_9 aFwS240S0000000_95 = AFwS240S0000000_9.get$arr$(517);
        if (Intrinsics.LJFF(interfaceC724760Sbq, c01d1)) {
            assemVMLazy5 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ5), awS553S0100000_95, new C452070Ho5(), new C1622206Wu(this, z4), new C338490DOt(this, z4), new AwS553S0100000_9((HasDefaultViewModelProviderFactory) this, 1217), aFwS240S0000000_95, new C451460Hn6(this, z4), new C451620HnM(this, z4), new C987103tV(this, z4));
            z6 = true;
            z5 = false;
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy5 = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ5), awS553S0100000_95, new AwS553S0100000_9((Fragment) this, 1218), aFwS240S0000000_95, null, null, null);
            z5 = false;
            z6 = true;
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            z5 = false;
            z6 = true;
            assemVMLazy5 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ5), awS553S0100000_95, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS553S0100000_9((HasDefaultViewModelProviderFactory) this, 1219), aFwS240S0000000_95, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJIJIL = assemVMLazy5;
        Object obj = C629480OmY.LIZIZ(this) ? C485430J1x.LIZ : c01d1;
        C19719912Dl c19719912DlLIZ6 = C13LE.LIZ(SharedMusicDetailViewModel.class);
        AwS553S0100000_9 awS553S0100000_96 = new AwS553S0100000_9(c19719912DlLIZ6, 1193);
        AFwS240S0000000_9 aFwS240S0000000_96 = AFwS240S0000000_9.get$arr$(512);
        if (Intrinsics.LJFF(obj, c01d1)) {
            assemVMLazy6 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ6), awS553S0100000_96, new C452070Ho5(), new C1622206Wu(this, z6), new C338490DOt(this, z6), new AwS553S0100000_9((HasDefaultViewModelProviderFactory) this, 1194), aFwS240S0000000_96, new C451460Hn6(this, z6), new C451620HnM(this, z6), new C987103tV(this, z6));
        } else if (obj instanceof InterfaceC451590HnJ) {
            assemVMLazy6 = C451650HnP.LIZ(this, (InterfaceC451590HnJ) obj, C724750Sbp.LJIIJ(this, c19719912DlLIZ6), awS553S0100000_96, new AwS553S0100000_9((Fragment) this, 1195), aFwS240S0000000_96, null, null, null);
        } else {
            if (!Intrinsics.LJFF(obj, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy6 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ6), awS553S0100000_96, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS553S0100000_9((HasDefaultViewModelProviderFactory) this, 1197), aFwS240S0000000_96, new C451460Hn6(this, z5), new C451620HnM(this, z5), new C987103tV(this, z5));
        }
        this.LLJILJIL = assemVMLazy6;
    }

    @Override // X.InterfaceC1401270mZJ
    public final void V() {
        if (!this.LLJILJILJ) {
            this.LLJILJILJ = true;
            Bundle arguments = getArguments();
            String string = arguments != null ? arguments.getString(FollowStatusChangeMethod.PARAM_UID) : null;
            Bundle arguments2 = getArguments();
            String string2 = arguments2 != null ? arguments2.getString("process_id") : null;
            Bundle arguments3 = getArguments();
            String string3 = arguments3 != null ? arguments3.getString("aweme_id") : null;
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.LLJILLL;
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", "single_song");
            c2344009Gk.LJIIIIZZ("music_id", string);
            c2344009Gk.LJIIIIZZ("process_id", string2);
            c2344009Gk.LJIIIIZZ("group_id", string3);
            c2344009Gk.LIZLLL(jElapsedRealtime, "ttl_duration");
            c2344009Gk.LIZLLL(0L, "more_sounds_duration");
            C20684815ws.LJIILLIIL("music_detail_load_time", c2344009Gk.LIZ);
        }
        C327850CtD.LIZ("detail_content_visible", "single_song");
        C327850CtD.LIZ("detail_content_render", "single_song");
    }

    public final MusicDetailViewModel VR() {
        AssemVMLazy assemVMLazy = this.LLIZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIII;
        return (MusicDetailViewModel) assemVMLazy.getValue();
    }

    public final MusicPlayViewModel WR() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIII;
        return (MusicPlayViewModel) assemVMLazy.getValue();
    }

    public final IStoryMusicCoverEntranceViewModel aS() {
        AssemVMLazy assemVMLazy = this.LLJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIII;
        return (IStoryMusicCoverEntranceViewModel) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.prefab.ability.RefreshAbility
    public final void refresh() {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "single_song");
        C20684815ws.LJIILLIIL("refresh_page", c2344009Gk.LIZ);
        VR().vQ2(getContext(), true, true);
        aS().vQ2(2, VR().LLILZIL);
    }

    public final boolean UR() {
        return C0C64.LJIILLIIL().LJIIIZ(31744, "mdp_disable_pull_to_refresh", true, false) || VR().LLJJJJ;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJJ;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJJ;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{IStoryMusicCoverEntranceViewModel.class, new AObjectS62S0000000_9(this, 14)}, defaultViewModelProviderFactory);
                    this.LLJJ = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        EventBus.LIZLLL().LJJI(this);
        C632130Oqp.LIZ.getClass();
        C632130Oqp.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.detail.base.DetailBaseFragment
    public final void SR() {
        C629480OmY.LJI(this);
    }

    public static C19719912Dl ZR(MusicDetail musicDetail) {
        Pair<Boolean, List<MusicOwnerInfo>> pairLIZ;
        Class cls;
        Music music = musicDetail.music;
        if (music != null) {
            pairLIZ = C630970Oox.LIZ(music);
        } else {
            pairLIZ = null;
        }
        if ((C0C64.LJIILLIIL().LJIJ(31744, 1, "show_pgc_artist_info", true) == 1 || C0C64.LJIILLIIL().LJIJ(31744, 1, "show_pgc_artist_info", true) == 2) && pairLIZ != null && pairLIZ.getFirst().booleanValue()) {
            cls = MusicPgcMetaInfoWithArtistAssem.class;
        } else {
            cls = MusicPgcMetaInfoAssem.class;
        }
        return C13LE.LIZ(cls);
    }

    @C14EU
    public final void onAntiCrawlerEvent(C0XKC c0xkc) {
        String str = c0xkc.LIZ;
        if (str != null && a0.LJJIIZI(str, "/aweme/v1/music/detail/?", false)) {
            EventBus.LIZLLL().LIZIZ(c0xkc);
            refresh();
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onBlockUserEvent(C888460YtI c888460YtI) {
        User user;
        Music music;
        List<MusicOwnerInfo> songWriter;
        if (c888460YtI != null && (user = c888460YtI.LIZ) != null) {
            MusicDetail musicDetailLIZ = VR().getState().LL.LIZ();
            if (musicDetailLIZ != null && (music = musicDetailLIZ.music) != null && (songWriter = music.getSongWriter()) != null) {
                C631000Op0.LIZ(user, songWriter);
            }
            aS().vQ2(3, VR().LLILZIL);
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.base.DetailBaseFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        this.LLJILLL = SystemClock.elapsedRealtime();
        C327850CtD.LIZIZ("single_song");
        super.onCreate(bundle);
        EventBus.LIZLLL().LJIJJ(this);
        NR(new AwS588S0100000_9(this, 311));
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onJsBroadCastEvent(C484220Iyq c484220Iyq) {
        C19EG activity;
        ComponentCallbacks2 componentCallbacks2LJFF;
        SAFTikTokFragment sAFTikTokFragment;
        JSONObject jSONObject = c484220Iyq.LIZ;
        if (jSONObject != null && Intrinsics.LJFF("remove_original_sound_success", jSONObject.optString("eventName"))) {
            if (C629480OmY.LIZIZ(this)) {
                Context context = getContext();
                InterfaceC214902198i interfaceC214902198i = null;
                if (context != null) {
                    componentCallbacks2LJFF = SAFExtensionKt.LJFF(context);
                } else {
                    componentCallbacks2LJFF = null;
                }
                if (!C294780Bgy.LIZ() ? !(!(componentCallbacks2LJFF instanceof InterfaceC214897198d) || !((InterfaceC214897198d) componentCallbacks2LJFF).getEnableSAF()) : (componentCallbacks2LJFF instanceof InterfaceC214897198d)) {
                    Fragment parentFragment = this;
                    while (true) {
                        if (parentFragment instanceof InterfaceC214902198i) {
                            interfaceC214902198i = (InterfaceC214902198i) parentFragment;
                            break;
                        } else {
                            parentFragment = parentFragment.getParentFragment();
                            if (parentFragment == null) {
                                break;
                            }
                        }
                    }
                }
                if ((interfaceC214902198i instanceof SAFTikTokFragment) && (sAFTikTokFragment = (SAFTikTokFragment) interfaceC214902198i) != null) {
                    sAFTikTokFragment.finish();
                    return;
                }
                return;
            }
            if (getActivity() == null || (activity = getActivity()) == null) {
                return;
            }
            activity.finish();
        }
    }

    @C14EU
    public final void onMusicFeedBackEvent(C629790On3 c629790On3) {
        C1389890mGx c1389890mGx = new C1389890mGx(this);
        c1389890mGx.LJIIIZ(2131848647);
        c1389890mGx.LJIIJJI();
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onUnBlockUserEvent(C486890J7n c486890J7n) {
        User user;
        Music music;
        List<MusicOwnerInfo> songWriter;
        if (c486890J7n != null && (user = c486890J7n.LIZ) != null) {
            MusicDetail musicDetailLIZ = VR().getState().LL.LIZ();
            if (musicDetailLIZ != null && (music = musicDetailLIZ.music) != null && (songWriter = music.getSongWriter()) != null) {
                C631000Op0.LIZJ(user, songWriter);
            }
            aS().vQ2(3, VR().LLILZIL);
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to com.ss.android.ugc.aweme.music.v2.MusicDetailFragment for r17v4 'this'  java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(android.view.View r18, android.os.Bundle r19) {
        /*
            Method dump skipped, instruction units count: 1373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.music.v2.MusicDetailFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // com.ss.android.ugc.aweme.detail.base.DetailBaseFragment, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (!C633020OsG.LIZIZ.LJII(getActivity(), this, i, i2, intent, null)) {
            super.onActivityResult(i, i2, intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19GS c19gs;
        FrameLayout frameLayout = new FrameLayout(requireContext());
        frameLayout.setFitsSystemWindows(false);
        FrameLayout frameLayout2 = new FrameLayout(requireContext());
        C786410Ut5.a6(frameLayout2, new ViewGroup.LayoutParams(-1, -2));
        frameLayout2.setId(R.id.evm);
        frameLayout.addView(frameLayout2);
        LinearLayout linearLayout = new LinearLayout(requireContext());
        linearLayout.setOrientation(1);
        Space space = new Space(requireContext());
        space.setId(R.id.w0u);
        linearLayout.addView(space);
        FrameLayout frameLayout3 = new FrameLayout(requireContext());
        frameLayout3.setFitsSystemWindows(true);
        frameLayout3.setId(R.id.ex3);
        linearLayout.addView(frameLayout3);
        frameLayout.addView(linearLayout);
        FrameLayout frameLayout4 = new FrameLayout(requireContext());
        C786410Ut5.a6(frameLayout4, new ViewGroup.LayoutParams(-1, -1));
        frameLayout4.setId(R.id.ge9);
        frameLayout.addView(frameLayout4);
        try {
            ViewTreeLifecycleOwner.set(frameLayout, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(frameLayout, this);
            frameLayout.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            } else {
                c19gs = null;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return frameLayout;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return frameLayout;
        }
    }
}
