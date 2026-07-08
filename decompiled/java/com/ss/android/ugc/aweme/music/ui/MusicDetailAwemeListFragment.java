package com.ss.android.ugc.aweme.music.ui;

import X.AbstractC1255880imo;
import X.AbstractC1386140mAu;
import X.AbstractC1387200mCc;
import X.AbstractC1399690mWl;
import X.AbstractC1620180sGO;
import X.AbstractC654930PmV;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C0BMO;
import X.C0C0Z;
import X.C0C64;
import X.C0CHQ;
import X.C0CNO;
import X.C0DXR;
import X.C0FNV;
import X.C0XQ7;
import X.C1165540gR6;
import X.C11NJ;
import X.C123100dR;
import X.C1247510iZJ;
import X.C1255910imr;
import X.C1255920ims;
import X.C1386170mAx;
import X.C1386180mAy;
import X.C1386190mAz;
import X.C1388190mED;
import X.C1389890mGx;
import X.C1390850mIV;
import X.C1398280mUU;
import X.C1398410mUh;
import X.C1398500mUq;
import X.C1399330mWB;
import X.C1399380mWG;
import X.C13LE;
import X.C1400650mYJ;
import X.C1400660mYK;
import X.C1400680mYM;
import X.C1400770mYV;
import X.C1400860mYe;
import X.C1400940mYm;
import X.C1400960mYo;
import X.C1401000mYs;
import X.C1401030mYv;
import X.C1401160mZ8;
import X.C1401320mZO;
import X.C1401790ma9;
import X.C1483410ohn;
import X.C14EU;
import X.C1558360qeg;
import X.C1558520qew;
import X.C15O7;
import X.C1622206Wu;
import X.C1850180yFM;
import X.C1850190yFN;
import X.C1906580ziK;
import X.C19252910Tv;
import X.C19719912Dl;
import X.C199494133s;
import X.C19EG;
import X.C1ER1;
import X.C20684815ws;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2255108sX;
import X.C2344009Gk;
import X.C280060AyK;
import X.C291001Au;
import X.C294100Bfs;
import X.C294780Bgy;
import X.C306580C0a;
import X.C338490DOt;
import X.C418440Gaw;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C452501pT;
import X.C485430J1x;
import X.C584710MwX;
import X.C616540OGe;
import X.C629430OmT;
import X.C629480OmY;
import X.C632130Oqp;
import X.C635890Owt;
import X.C636090OxD;
import X.C636120OxG;
import X.C724750Sbp;
import X.C730120SkU;
import X.C786410Ut5;
import X.C814420VxA;
import X.C987103tV;
import X.ExecutorC1592406Li;
import X.InterfaceC1401150mZ7;
import X.InterfaceC1401240mZG;
import X.InterfaceC1401310mZN;
import X.InterfaceC214897198d;
import X.InterfaceC214902198i;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC494301wD;
import X.InterfaceC584700MwW;
import X.InterfaceC655270Pn3;
import X.InterfaceC665370Q7z;
import X.ProgressDialogC1399760mWs;
import Y.ACListenerS13S1110000_9;
import Y.ARunnableS121S0100000_21;
import Y.ARunnableS54S0300000_21;
import Y.AsS36S0100000_9;
import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.router.SmartRoute;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment;
import com.ss.android.ugc.aweme.commercialize.media.api.logging.ICommerceMusicLogger;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.TtsVoiceInfo;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.model.MatchedSoundInfo;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicAwemeList;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import com.ss.android.ugc.aweme.music.model.MusicDetailCommonModel;
import com.ss.android.ugc.aweme.music.model.MusicOwnerInfo;
import com.ss.android.ugc.aweme.music.model.MusicStickerStruct;
import com.ss.android.ugc.aweme.music.ui.MusicDetailAwemeListFragment;
import com.ss.android.ugc.aweme.music.ui.widget.MusicDetailAutoPlayManager;
import com.ss.android.ugc.aweme.music.v2.assem.MusicShootAssem;
import com.ss.android.ugc.aweme.music.v2.viewmodel.IMDPAutoPlayAbility;
import com.ss.android.ugc.aweme.music.v2.viewmodel.IMDPAwemeListAbility;
import com.ss.android.ugc.aweme.music.v2.viewmodel.IMDPMusicPlayAbility;
import com.ss.android.ugc.aweme.music.v2.viewmodel.MusicDetailViewModel;
import com.ss.android.ugc.aweme.music.v2.viewmodel.SharedMusicAwemeListViewModel;
import com.ss.android.ugc.aweme.music.v2.viewmodel.SharedMusicDetailViewModel;
import com.ss.android.ugc.aweme.service.ISocPubStatusRepoService;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.services.optimization.ILayoutPreloadService;
import com.ss.android.ugc.aweme.shortvideo.model.ShootExtraData;
import com.ss.android.ugc.aweme.views.WrapGridLayoutManager;
import java.io.Serializable;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS33S0001000_19;
import kotlin.jvm.internal.AwS34S0001000_21;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.AwS600S0100000_21;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes22.dex */
public final class MusicDetailAwemeListFragment extends DetailAwemeListFragment {
    public static final C629430OmT LLLLZI;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLLZIL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2Zig5OiYwZjHELIOSAlZwImOywvDSonKSwgCDg2JSAAIDwnDjctLiI2JjE=";
    public C1400660mYK LLLILZLLLI;
    public Music LLLIZZ;
    public MusicStickerStruct LLLJ;
    public boolean LLLJL;
    public final AssemVMLazy LLLLII;
    public final AssemVMLazy LLLLIIIILLL;
    public final ICommerceMusicLogger LLLLIIL;
    public MusicDetail LLLLIILL;
    public boolean LLLLIILLL;
    public TtsVoiceInfo LLLLIL;
    public View LLLLILI;
    public String LLLLJ;
    public String LLLLJI;
    public ProgressDialogC1399760mWs LLLLL;
    public MusicAwemeList LLLLLIL;
    public boolean LLLLLILLIL;
    public boolean LLLLLJIL;
    public MusicDetailAutoPlayManager LLLLLJLJLL;
    public C1401160mZ8 LLLLLL;
    public final int LLLLLLIL;
    public boolean LLLLLLJ;
    public View LLLLLLL;
    public MusicDetailViewModel LLLLLLLLL;
    public final C1400960mYo LLLLLLLLLL;
    public final C1401030mYv LLLLLLLZIL;
    public String LLLLLLZ;
    public boolean LLLLLLZZ;
    public boolean LLLLLZ;
    public final C01GW LLLLLZIL;
    public final ConcurrentHashMap<Integer, Long> LLLLLZL;
    public C1401000mYs LLLLZ;
    public boolean LLLJIL = true;
    public final C199494133s<MusicDetail> LLLL = new C199494133s<>();

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0OmT] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MusicDetailAwemeListFragment.class, "musicDetailVm", "getMusicDetailVm()Lcom/ss/android/ugc/aweme/music/v2/viewmodel/SharedMusicDetailViewModel;", 0);
        C13LE.LIZ.getClass();
        LLLLZIL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(MusicDetailAwemeListFragment.class, "musicAwemeListVm", "getMusicAwemeListVm()Lcom/ss/android/ugc/aweme/music/v2/viewmodel/SharedMusicAwemeListViewModel;", 0)};
        LLLLZI = new Object() { // from class: X.0OmT
        };
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment, X.InterfaceC1260110itd
    public final void NN() {
    }

    public MusicDetailAwemeListFragment() {
        AssemVMLazy assemVMLazy;
        boolean z;
        AssemVMLazy assemVMLazy2;
        Object obj = C629480OmY.LIZIZ(this) ? C485430J1x.LIZ : C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SharedMusicDetailViewModel.class);
        AwS553S0100000_9 awS553S0100000_9 = new AwS553S0100000_9(c19719912DlLIZ, 1189);
        AFwS259S0000000_21 aFwS259S0000000_21 = AFwS259S0000000_21.get$arr$(199);
        C01D1 c01d1 = C01D1.LIZ;
        if (Intrinsics.LJFF(obj, c01d1)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS553S0100000_9, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS565S0100000_21((HasDefaultViewModelProviderFactory) this, 710), aFwS259S0000000_21, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
            z = false;
        } else if (obj instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) obj, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS553S0100000_9, new AwS565S0100000_21((Fragment) this, 711), aFwS259S0000000_21, null, null, null);
            z = false;
        } else {
            if (!Intrinsics.LJFF(obj, C019F.LIZ)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            z = false;
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS553S0100000_9, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS565S0100000_21((HasDefaultViewModelProviderFactory) this, 712), aFwS259S0000000_21, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLLLII = assemVMLazy;
        Object obj2 = C629480OmY.LIZIZ(this) ? C485430J1x.LIZ : c01d1;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(SharedMusicAwemeListViewModel.class);
        AwS553S0100000_9 awS553S0100000_92 = new AwS553S0100000_9(c19719912DlLIZ2, 1190);
        AFwS259S0000000_21 aFwS259S0000000_212 = AFwS259S0000000_21.get$arr$(200);
        if (Intrinsics.LJFF(obj2, c01d1)) {
            assemVMLazy2 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ2), awS553S0100000_92, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS565S0100000_21((HasDefaultViewModelProviderFactory) this, 713), aFwS259S0000000_212, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (obj2 instanceof InterfaceC451590HnJ) {
            assemVMLazy2 = C451650HnP.LIZ(this, (InterfaceC451590HnJ) obj2, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), awS553S0100000_92, new AwS565S0100000_21((Fragment) this, 714), aFwS259S0000000_212, null, null, null);
        } else {
            if (!Intrinsics.LJFF(obj2, C019F.LIZ)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy2 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ2), awS553S0100000_92, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS565S0100000_21((HasDefaultViewModelProviderFactory) this, 709), aFwS259S0000000_212, new C451460Hn6(this, z), new C451620HnM(this, z), new C987103tV(this, z));
        }
        this.LLLLIIIILLL = assemVMLazy2;
        this.LLLLIIL = (ICommerceMusicLogger) ServiceManager.get().getService(ICommerceMusicLogger.class);
        this.LLLLIILLL = true;
        this.LLLLLLIL = 60;
        this.LLLLLLLLLL = new C1400960mYo();
        this.LLLLLLLZIL = new C1401030mYv();
        this.LLLLLLZ = "";
        this.LLLLLZ = true;
        this.LLLLLZIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 708));
        this.LLLLLZL = new ConcurrentHashMap<>();
        this.LLLLZ = new C1401000mYs("none");
    }

    public static int yS() {
        return C19252910Tv.LIZIZ.LIZLLL().LJI().LLLIZZ(3, 0);
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment, X.InterfaceC683650Qrj
    public final boolean LJIIJJI() {
        Music music;
        MusicDetail musicDetail = this.LLLLIILL;
        Integer numValueOf = null;
        Music music2 = musicDetail != null ? musicDetail.music : null;
        MusicAwemeList musicAwemeList = this.LLLLLIL;
        List<Aweme> list = musicAwemeList != null ? musicAwemeList.items : null;
        if (musicDetail != null && (music = musicDetail.music) != null) {
            numValueOf = Integer.valueOf(music.getUserCount());
        }
        if (!C1400680mYM.LIZJ(music2, list, numValueOf, true)) {
            return super.LJIIJJI();
        }
        MusicAwemeList musicAwemeList2 = this.LLLLLIL;
        return (musicAwemeList2 == null || !musicAwemeList2.containSquareData) ? super.LJIIJJI() : musicAwemeList2.getHasMore("square") == 1;
    }

    public final void LJIIL() {
        ProgressDialogC1399760mWs progressDialogC1399760mWs = this.LLLLL;
        if (progressDialogC1399760mWs != null) {
            C0FNV.LIZ(progressDialogC1399760mWs);
            C1399330mWB.LIZ.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis() - C1399330mWB.LIZJ;
            if (jCurrentTimeMillis > 0) {
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LIZLLL(jCurrentTimeMillis, "lazy_load_user_waited");
                C20684815ws.LJIILLIIL("tool_performance_music_detail_tracker", c2344009Gk.LIZ);
            }
        }
        this.LLLLL = null;
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment
    public final boolean UR() {
        Music music;
        T t = this.LLILZ.LL;
        if (this.LLLLLLLZIL.LIZ) {
            return true;
        }
        if (!(t instanceof C1401320mZO)) {
            return false;
        }
        MusicDetail musicDetail = this.LLLLIILL;
        Integer numValueOf = null;
        Music music2 = musicDetail != null ? musicDetail.music : null;
        MusicAwemeList musicAwemeList = this.LLLLLIL;
        List<Aweme> list = musicAwemeList != null ? musicAwemeList.items : null;
        if (musicDetail != null && (music = musicDetail.music) != null) {
            numValueOf = Integer.valueOf(music.getUserCount());
        }
        if (!C1400680mYM.LIZJ(music2, list, numValueOf, true)) {
            return false;
        }
        C1401320mZO c1401320mZO = (C1401320mZO) t;
        return c1401320mZO.getData() != null && c1401320mZO.getData().requestingSquareData;
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment
    public final AbstractC1255880imo<?, ?> ZR() {
        MusicAwemeList musicAwemeList;
        List<Aweme> list;
        Music music;
        MusicDetail musicDetail = this.LLLLIILL;
        Integer numValueOf = null;
        Music music2 = musicDetail != null ? musicDetail.music : null;
        MusicAwemeList musicAwemeList2 = this.LLLLLIL;
        List<Aweme> list2 = musicAwemeList2 != null ? musicAwemeList2.items : null;
        if (musicDetail != null && (music = musicDetail.music) != null) {
            numValueOf = Integer.valueOf(music.getUserCount());
        }
        if (C1400680mYM.LIZJ(music2, list2, numValueOf, true) && (musicAwemeList = this.LLLLLIL) != null && (list = musicAwemeList.foldAidItems) != null && (!list.isEmpty())) {
            T t = this.LLILZ.LL;
            if (t instanceof C1401320mZO) {
                return new C1255910imr((C1401320mZO) t);
            }
        }
        return super.ZR();
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        C1401320mZO c1401320mZO;
        C11NJ c11nj;
        C1255920ims<AbstractC1255880imo> c1255920ims = this.LLILZ;
        AbstractC1255880imo abstractC1255880imo = c1255920ims != null ? (AbstractC1255880imo) c1255920ims.LL : null;
        if ((abstractC1255880imo instanceof C1401320mZO) && (c1401320mZO = (C1401320mZO) abstractC1255880imo) != null && (c11nj = c1401320mZO.LLJJIJIL) != null) {
            c11nj.dispose();
        }
        super.onDestroyView();
        MusicDetailAutoPlayManager musicDetailAutoPlayManager = this.LLLLLJLJLL;
        if (musicDetailAutoPlayManager != null) {
            musicDetailAutoPlayManager.LIZ();
        }
        LIZ(false);
        this.LLLLILI = null;
        this.LLLLJ = null;
        this.LLLLJI = null;
        if (C0C0Z.LIZ() && C306580C0a.LIZ()) {
            C0CHQ.LIZ().LJI().LIZ().unregisterListener((C1400940mYm) this.LLLLLZIL.getValue());
        }
        C584710MwX.LIZ.clear();
        C584710MwX.LIZJ = "";
    }

    public final SharedMusicAwemeListViewModel uS() {
        AssemVMLazy assemVMLazy = this.LLLLIIIILLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLLZIL;
        return (SharedMusicAwemeListViewModel) assemVMLazy.getValue();
    }

    public final SharedMusicDetailViewModel wS() {
        AssemVMLazy assemVMLazy = this.LLLLII;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLLZIL;
        return (SharedMusicDetailViewModel) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment
    public final int bS() {
        return C636090OxD.LIZ() ? this.LLLLLLIL : super.bS();
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        ISocPubStatusRepoService iSocPubStatusRepoService = (ISocPubStatusRepoService) PluggableExtentionKt.pluggableSpi$default(ISocPubStatusRepoService.class, false, false, false, 14, null);
        if (iSocPubStatusRepoService != null) {
            iSocPubStatusRepoService.LIZ(hashCode());
        }
        C1398500mUq.LIZ.getClass();
        ((ConcurrentHashMap) C1398500mUq.LIZIZ).clear();
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        MusicDetailAutoPlayManager musicDetailAutoPlayManager;
        C1483410ohn c1483410ohn;
        C1483410ohn c1483410ohn2;
        super.onPause();
        this.LLLLLLJ = true;
        if (C636090OxD.LIZ()) {
            MusicDetailAutoPlayManager musicDetailAutoPlayManager2 = this.LLLLLJLJLL;
            boolean z = false;
            if ((musicDetailAutoPlayManager2 != null && (c1483410ohn2 = musicDetailAutoPlayManager2.LL) != null && c1483410ohn2.isPlaying()) || ((musicDetailAutoPlayManager = this.LLLLLJLJLL) != null && musicDetailAutoPlayManager.LLILZIL)) {
                z = true;
            }
            this.LLLLLLZZ = z;
            MusicDetailAutoPlayManager musicDetailAutoPlayManager3 = this.LLLLLJLJLL;
            this.LLLLLZ = (musicDetailAutoPlayManager3 == null || (c1483410ohn = musicDetailAutoPlayManager3.LL) == null) ? true : c1483410ohn.isMute();
            C584710MwX.LIZJ = "";
            C1401160mZ8 c1401160mZ8 = this.LLLLLL;
            if (c1401160mZ8 != null) {
                c1401160mZ8.LJIIL = true;
            }
            MusicDetailAutoPlayManager musicDetailAutoPlayManager4 = this.LLLLLJLJLL;
            if (musicDetailAutoPlayManager4 != null) {
                Aweme aweme = musicDetailAutoPlayManager4.LLILLL;
                musicDetailAutoPlayManager4.CO1(null);
                if (aweme != null) {
                    MusicDetailAutoPlayManager musicDetailAutoPlayManager5 = this.LLLLLJLJLL;
                    C584710MwX.LIZIZ(Integer.valueOf((int) (musicDetailAutoPlayManager5 != null ? musicDetailAutoPlayManager5.getCurrentPosition() : 0L)), aweme.getAid(), "video");
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(MusicDetailAwemeListFragment.class.getName());
        }
        super.onResume();
        this.LLLLLLJ = false;
        if (this.LLLJIL && C294100Bfs.LIZJ) {
            this.LLLJIL = false;
            ExecutorC1592406Li.LLILLJJLI.execute(new ARunnableS121S0100000_21(this, 81));
        }
        try {
            if (!this.LLLLLLJ && this.LLLLLILLIL) {
                this.LLLLLILLIL = false;
                C0CNO.LIZ(C15O7.LJI, new AwS565S0100000_21(this, 1479));
            }
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (C636090OxD.LIZ()) {
            C1401160mZ8 c1401160mZ8 = this.LLLLLL;
            if (c1401160mZ8 != null) {
                c1401160mZ8.LJIIL = false;
            }
            String str = C584710MwX.LIZJ;
            MusicDetailAutoPlayManager musicDetailAutoPlayManager = this.LLLLLJLJLL;
            Aweme aweme = musicDetailAutoPlayManager != null ? musicDetailAutoPlayManager.LLILLL : null;
            if (this.LLLLLLZZ && C123100dR.LIZ(str)) {
                if (Intrinsics.LJFF(str, aweme != null ? aweme.getAid() : null)) {
                    int iLIZ = C584710MwX.LIZ(str, "video");
                    MusicDetailAutoPlayManager musicDetailAutoPlayManager2 = this.LLLLLJLJLL;
                    if (musicDetailAutoPlayManager2 != null) {
                        musicDetailAutoPlayManager2.LIZIZ(aweme, iLIZ, this.LLLLLZ);
                    }
                    C584710MwX.LIZJ = "";
                    return;
                }
                return;
            }
            if (this.LLLLLLZZ) {
                if (aweme != null) {
                    int iLIZ2 = C584710MwX.LIZ(aweme.getAid(), "video");
                    MusicDetailAutoPlayManager musicDetailAutoPlayManager3 = this.LLLLLJLJLL;
                    if (musicDetailAutoPlayManager3 != null) {
                        musicDetailAutoPlayManager3.LIZIZ(aweme, iLIZ2, this.LLLLLZ);
                    }
                }
                this.LLLLLLZZ = false;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        Activity activityLIZIZ;
        Activity activityLIZ;
        super.onStop();
        C636120OxG.LIZ.getClass();
        if (C636120OxG.LJFF) {
            C636120OxG.LJFF = false;
            long jCurrentTimeMillis = System.currentTimeMillis() - C636120OxG.LJ;
            for (String str : ((LinkedHashMap) C636120OxG.LIZIZ).keySet()) {
                Long l = (Long) ((LinkedHashMap) C636120OxG.LIZIZ).get(str);
                C2344009Gk c2344009Gk = C636120OxG.LIZLLL;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("request_duration_");
                sbLIZ.append(str);
                c2344009Gk.LJ(l, C2188811AlT.LIZIZ(sbLIZ));
                if (l == null || jCurrentTimeMillis >= l.longValue()) {
                    C2344009Gk c2344009Gk2 = C636120OxG.LIZLLL;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("loading_");
                    sbLIZ2.append(str);
                    c2344009Gk2.LJ(Boolean.FALSE, C2188811AlT.LIZIZ(sbLIZ2));
                } else {
                    C2344009Gk c2344009Gk3 = C636120OxG.LIZLLL;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("loading_");
                    sbLIZ3.append(str);
                    c2344009Gk3.LJ(Boolean.TRUE, C2188811AlT.LIZIZ(sbLIZ3));
                }
            }
            for (String str2 : ((LinkedHashMap) C636120OxG.LIZJ).keySet()) {
                C2344009Gk c2344009Gk4 = C636120OxG.LIZLLL;
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("request_state_");
                sbLIZ4.append(str2);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ4);
                LinkedHashMap linkedHashMap = (LinkedHashMap) C636120OxG.LIZJ;
                Pair pair = (Pair) linkedHashMap.get(str2);
                c2344009Gk4.LJ(pair != null ? pair.getFirst() : null, strLIZIZ);
                C2344009Gk c2344009Gk5 = C636120OxG.LIZLLL;
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("request_msg_");
                sbLIZ5.append(str2);
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ5);
                Pair pair2 = (Pair) linkedHashMap.get(str2);
                c2344009Gk5.LJFF(strLIZIZ2, pair2 != null ? (String) pair2.getSecond() : null);
            }
            C636120OxG.LIZLLL.LIZLLL(jCurrentTimeMillis, "stay_duration");
            AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
            if (abstractC1387200mCcLJ != null && (activityLIZIZ = abstractC1387200mCcLJ.LIZIZ()) != null && (activityLIZ = C1388190mED.LIZ(activityLIZIZ)) != null) {
                C636120OxG.LIZLLL.LJFF("to_activity", activityLIZ.getClass().getSimpleName());
            }
            C20684815ws.LJIILLIIL("mdp_metrics_event", C636120OxG.LIZLLL.LIZ);
            ((LinkedHashMap) C636120OxG.LIZIZ).clear();
            ((LinkedHashMap) C636120OxG.LIZJ).clear();
            C636120OxG.LJ = 0L;
            C636120OxG.LJFF = false;
            C636120OxG.LIZLLL = new C2344009Gk();
        }
        C635890Owt.LIZ.getClass();
        C635890Owt.LIZIZ.set(null);
        C635890Owt.LIZJ.set(null);
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment
    public final void sS() {
        C1401320mZO c1401320mZO;
        super.sS();
        if (C636090OxD.LIZ()) {
            C1255920ims<AbstractC1255880imo> c1255920ims = this.LLILZ;
            AbstractC1255880imo abstractC1255880imo = c1255920ims != null ? (AbstractC1255880imo) c1255920ims.LL : null;
            if (!(abstractC1255880imo instanceof C1401320mZO) || (c1401320mZO = (C1401320mZO) abstractC1255880imo) == null) {
                return;
            }
            c1401320mZO.LLJJJ = new C1400860mYe(this);
        }
    }

    public final int zS() {
        List<MusicOwnerInfo> musicOwnerInfos;
        String curSecUserId = C0XQ7.LJFF().getCurSecUserId();
        Music music = this.LLLIZZ;
        int i = 0;
        if (music != null && (musicOwnerInfos = music.getMusicOwnerInfos()) != null && (!musicOwnerInfos.isEmpty())) {
            Iterator<MusicOwnerInfo> it2 = this.LLLIZZ.getMusicOwnerInfos().iterator();
            while (it2.hasNext()) {
                if (TextUtils.equals(curSecUserId, it2.next().getSecUid())) {
                    i = 1;
                }
            }
        }
        return i;
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment, X.InterfaceC1260110itd
    public final void GA(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        Music music = this.LLLIZZ;
        if (music != null) {
            music.setIsFriendTagVisible(Boolean.valueOf(zBooleanValue));
        }
        C1ER1.LIZIZ.LJJIIJZLJL().LJJ(zBooleanValue);
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment, X.InterfaceC645470PTl
    public final /* bridge */ /* synthetic */ void Tr(RecyclerView.ViewHolder viewHolder) {
        Tr((AbstractC1620180sGO) viewHolder);
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment
    public final C0DXR VR(int i) {
        if (C636090OxD.LIZ()) {
            final int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1));
            final int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
            final int iYS = yS();
            return new C0DXR(iLIZIZ, iLIZIZ2, iYS) { // from class: X.0DXY
                public final int LL;
                public final int LLILLJJLI;
                public final int LLILLL;

                {
                    this.LL = iLIZIZ;
                    this.LLILLJJLI = iLIZIZ2;
                    this.LLILLL = iYS;
                }

                @Override // X.C0DXR
                public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                    GridLayoutManager gridLayoutManager;
                    AbstractC214823195h abstractC214823195h;
                    RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                    if (!(layoutManager instanceof GridLayoutManager) || (gridLayoutManager = (GridLayoutManager) layoutManager) == null || (abstractC214823195h = gridLayoutManager.LLIZ) == null) {
                        return;
                    }
                    int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
                    int iLJ = abstractC214823195h.LJ(childAdapterPosition, gridLayoutManager.LLILLJJLI);
                    int iLIZLLL = abstractC214823195h.LIZLLL(childAdapterPosition, gridLayoutManager.LLILLJJLI);
                    int iLJFF = abstractC214823195h.LJFF(childAdapterPosition);
                    int i2 = gridLayoutManager.LLILLJJLI;
                    if (iLJFF == i2 / this.LLILLL) {
                        int i3 = this.LL;
                        float f = i2;
                        rect.left = (int) ((iLJ * i3) / f);
                        rect.right = (int) (i3 - (((iLJ + 1) * i3) / f));
                        if (iLIZLLL > 0) {
                            rect.top = i3;
                            return;
                        }
                        return;
                    }
                    int iLJFF2 = abstractC214823195h.LJFF(childAdapterPosition);
                    int i4 = gridLayoutManager.LLILLJJLI / 2;
                    if (iLJFF2 != i4) {
                        return;
                    }
                    if (iLJ < i4) {
                        rect.left = 0;
                        rect.right = this.LLILLJJLI / 2;
                    } else {
                        rect.left = this.LLILLJJLI / 2;
                        rect.right = 0;
                    }
                    if (iLIZLLL <= 0) {
                        return;
                    }
                    rect.top = this.LLILLJJLI;
                }
            };
        }
        final int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1));
        return new C0DXR(iLIZIZ3) { // from class: X.0DXV
            public final int LL;
            public Integer LLILLJJLI;
            public Integer LLILLL;

            {
                this.LL = iLIZIZ3;
            }

            public static int LJ(int i2, GridLayoutManager gridLayoutManager, AbstractC21673619ry abstractC21673619ry) {
                AbstractC214823195h abstractC214823195h = gridLayoutManager.LLIZ;
                int i3 = gridLayoutManager.LLILLJJLI;
                int iLIZLLL = abstractC214823195h.LIZLLL(i2, i3);
                int i4 = i2;
                while (true) {
                    int i5 = i4 - 1;
                    if (i5 < 0 || abstractC214823195h.LIZLLL(i5, i3) != iLIZLLL) {
                        break;
                    }
                    i4 = i5;
                }
                int itemCount = abstractC21673619ry.getItemCount();
                while (true) {
                    int i6 = i2 + 1;
                    if (i6 >= itemCount || abstractC214823195h.LIZLLL(i6, i3) != iLIZLLL) {
                        break;
                    }
                    i2 = i6;
                }
                return (i2 - i4) + 1;
            }

            @Override // X.C0DXR
            public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                GridLayoutManager gridLayoutManager;
                AbstractC21673619ry adapter;
                AbstractC214823195h abstractC214823195h;
                RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                if (!(layoutManager instanceof GridLayoutManager) || (gridLayoutManager = (GridLayoutManager) layoutManager) == null || (adapter = recyclerView.getAdapter()) == null || (abstractC214823195h = gridLayoutManager.LLIZ) == null) {
                    return;
                }
                int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
                int iLJ = abstractC214823195h.LJ(childAdapterPosition, gridLayoutManager.LLILLJJLI);
                int iLIZLLL = abstractC214823195h.LIZLLL(childAdapterPosition, gridLayoutManager.LLILLJJLI);
                if (abstractC214823195h.LJFF(childAdapterPosition) == 2) {
                    int iLJ2 = LJ(childAdapterPosition, gridLayoutManager, adapter);
                    this.LLILLJJLI = Integer.valueOf(childAdapterPosition);
                    this.LLILLL = Integer.valueOf(iLIZLLL);
                    int i2 = this.LL;
                    float f = iLJ2;
                    rect.left = (int) ((iLJ * i2) / f);
                    rect.right = (int) (i2 - (((iLJ + 1) * i2) / f));
                } else if (abstractC214823195h.LJFF(childAdapterPosition) == 1) {
                    Integer num = this.LLILLL;
                    if (num != null && num.intValue() == iLIZLLL) {
                        int iLJ3 = LJ(childAdapterPosition, gridLayoutManager, adapter);
                        Integer num2 = this.LLILLJJLI;
                        if (num2 != null && childAdapterPosition > num2.intValue()) {
                            int i3 = this.LL;
                            float f2 = iLJ3;
                            rect.left = (int) (((iLJ - 1) * i3) / f2);
                            rect.right = (int) (i3 - ((iLJ * i3) / f2));
                        } else {
                            int i4 = this.LL;
                            float f3 = iLJ3;
                            rect.left = (int) ((iLJ * i4) / f3);
                            rect.right = (int) (i4 - (((iLJ + 1) * i4) / f3));
                        }
                    } else {
                        int i5 = gridLayoutManager.LLILLJJLI;
                        int i6 = this.LL;
                        float f4 = i5;
                        rect.left = (int) ((iLJ * i6) / f4);
                        rect.right = (int) (i6 - (((iLJ + 1) * i6) / f4));
                    }
                }
                if (iLIZLLL > 0) {
                    rect.top = this.LL;
                }
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment, X.InterfaceC1260110itd
    public final void fx(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        Music music = this.LLLIZZ;
        if (music != null) {
            music.setIsFollowerTagVisible(Boolean.valueOf(zBooleanValue));
        }
        C1ER1.LIZIZ.LJJIIJZLJL().LJIILL(zBooleanValue);
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment
    public final void gS(C1398410mUh c1398410mUh) {
        MusicAwemeList musicAwemeList;
        if (c1398410mUh != null) {
            Bundle bundle = new Bundle();
            C1399380mWG c1399380mWG = MusicShootAssem.LLZ;
            C291001Au<MusicAwemeList> c291001Au = uS().getState().LL;
            if (c291001Au != null) {
                musicAwemeList = c291001Au.LIZ;
            } else {
                musicAwemeList = null;
            }
            wS().getState().LL.LIZ();
            c1399380mWG.getClass();
            C786410Ut5.LJJJI("is_same_music_supply_detail_page", C1399380mWG.LIZIZ(musicAwemeList), bundle);
            C786410Ut5.LJJJI("play_page_name", wS().getState().LLIZLLLIL, bundle);
            c1398410mUh.LJI = bundle;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x03fa  */
    /* JADX WARN: Type inference failed for: r0v74, types: [T extends X.0QAu, X.0QAu] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22, types: [androidx.lifecycle.LifecycleOwner, androidx.lifecycle.ViewModelStoreOwner] */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25, types: [androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r1v65 */
    /* JADX WARN: Type inference failed for: r1v66 */
    /* JADX WARN: Type inference failed for: r1v67 */
    /* JADX WARN: Type inference failed for: r1v68 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [androidx.lifecycle.LifecycleOwner, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.0mZ8] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List hS(final java.util.List r18) {
        /*
            Method dump skipped, instruction units count: 1049
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.music.ui.MusicDetailAwemeListFragment.hS(java.util.List):java.util.List");
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment
    public final boolean iS(int i) {
        MusicDetailViewModel musicDetailViewModel = this.LLLLLLLLL;
        if (musicDetailViewModel == null) {
            return super.iS(i);
        }
        if (musicDetailViewModel.LLJJJJ && !musicDetailViewModel.LLJJJJJIL) {
            return false;
        }
        return super.iS(i);
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment
    public final void initArguments(Bundle bundle) {
        String id;
        MusicStickerStruct musicStickerStruct;
        MatchedSoundInfo matchedSongInfo;
        super.initArguments(bundle);
        Music music = (Music) bundle.getSerializable("detail_music_data");
        this.LLLIZZ = music;
        if (music == null || (matchedSongInfo = music.getMatchedSongInfo()) == null || (id = matchedSongInfo.getId()) == null) {
            id = this.LLILLL;
        }
        this.LLLF = id;
        Serializable serializable = bundle.getSerializable("music_sticker_struct");
        if (serializable instanceof MusicStickerStruct) {
            musicStickerStruct = (MusicStickerStruct) serializable;
        } else {
            musicStickerStruct = null;
        }
        this.LLLJ = musicStickerStruct;
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment
    /* JADX INFO: renamed from: nS */
    public final void Tr(AbstractC1620180sGO<?> abstractC1620180sGO) {
        Aweme aweme;
        long jLongValue;
        int i;
        String logExtra;
        Music music;
        super.Tr(abstractC1620180sGO);
        if (abstractC1620180sGO != null && (aweme = abstractC1620180sGO.LL) != null) {
            int adapterPosition = abstractC1620180sGO.getAdapterPosition();
            if ((!C636090OxD.LIZ() || !AwemeExtKt.isMDPSquareType(aweme)) && adapterPosition >= 0) {
                adapterPosition++;
            }
            Long l = this.LLLLLZL.get(Integer.valueOf(adapterPosition));
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            if (System.currentTimeMillis() - jLongValue <= 300) {
                return;
            }
            this.LLLLLZL.put(Integer.valueOf(adapterPosition), Long.valueOf(System.currentTimeMillis()));
            Music music2 = aweme.getMusic();
            if (music2 != null) {
                MusicDetail musicDetail = this.LLLLIILL;
                if (musicDetail != null && (music = musicDetail.music) != null) {
                    logExtra = music.getLogExtra();
                } else {
                    logExtra = null;
                }
                music2.setLogExtra(logExtra);
            }
            if (AwemeBizExtKt.getBehindTheSongVideoType(aweme) != 0) {
                wS().setState(new AwS34S0001000_21(AwemeBizExtKt.getBehindTheSongVideoType(aweme), 9));
            } else {
                if (aweme.isPinnedByArtist()) {
                    wS().setState(new AwS34S0001000_21(8));
                    C1398280mUU.LJIIJ(1, zS(), this.LLILLL, aweme.getAid());
                    i = 1;
                }
                C1398280mUU.LJIJI(getContext(), aweme, this.LLILLL, this.LLJILJIL, adapterPosition, i, AwemeBizExtKt.getBehindTheSongVideoType(aweme), this.LLLLLIL, C1558360qeg.LJFF(this, null), abstractC1620180sGO.getItemViewType());
            }
            i = 0;
            C1398280mUU.LJIJI(getContext(), aweme, this.LLILLL, this.LLJILJIL, adapterPosition, i, AwemeBizExtKt.getBehindTheSongVideoType(aweme), this.LLLLLIL, C1558360qeg.LJFF(this, null), abstractC1620180sGO.getItemViewType());
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C636120OxG.LIZ.getClass();
        C636120OxG.LJFF = true;
        C636120OxG.LIZLLL = new C2344009Gk();
        C636120OxG.LJ = System.currentTimeMillis();
        if (C280060AyK.LIZ() && ((Number) C0BMO.LIZ.getValue()).intValue() == 1) {
            this.LLJJLIIIJLLLLLLLZ = new InterfaceC1401310mZN() { // from class: X.0mYy
                @Override // X.InterfaceC1401310mZN
                public final void LIZ(boolean z) {
                    if (z) {
                        ((ILayoutPreloadService) ServiceManager.get().getService(ILayoutPreloadService.class)).preloadLayoutFiles();
                    }
                }
            };
        }
        ((ArrayList) this.LLJLIL).add(new InterfaceC1401240mZG() { // from class: X.0Omb
            public C629520Omc LIZ;

            @Override // X.InterfaceC1401240mZG
            public final void LIZ() {
            }

            @Override // X.InterfaceC1401240mZG
            public final void LIZIZ() {
                long jUptimeMillis = SystemClock.uptimeMillis();
                C629520Omc c629520Omc = this.LIZ;
                if (c629520Omc != null) {
                    MusicDetailAwemeListFragment musicDetailAwemeListFragment = this.LIZIZ;
                    long j = jUptimeMillis - c629520Omc.LIZIZ;
                    musicDetailAwemeListFragment.LLLLIIL.LJIILLIIL(c629520Omc.LIZJ, j, c629520Omc.LIZ);
                }
                this.LIZ = null;
            }

            @Override // X.InterfaceC1401240mZG
            public final void LIZJ(int i, C737030Svd c737030Svd, Aweme aweme) {
                String aid;
                MusicDetailAutoPlayManager musicDetailAutoPlayManager;
                String aid2;
                Aweme aweme2;
                String aid3;
                C629520Omc c629520Omc = this.LIZ;
                if (c629520Omc != null) {
                    Aweme aweme3 = c629520Omc.LIZ;
                    if (aweme3 != null) {
                        aid3 = aweme3.getAid();
                    } else {
                        aid3 = null;
                    }
                    if (Intrinsics.LJFF(aid3, aweme.getAid())) {
                        return;
                    }
                }
                MusicDetailAutoPlayManager musicDetailAutoPlayManager2 = this.LIZIZ.LLLLLJLJLL;
                if (musicDetailAutoPlayManager2 != null && (aweme2 = musicDetailAutoPlayManager2.LLILLL) != null) {
                    aid = aweme2.getAid();
                } else {
                    aid = null;
                }
                if (!Intrinsics.LJFF(aid, aweme.getAid()) && c737030Svd.LIZ == 21 && (musicDetailAutoPlayManager = this.LIZIZ.LLLLLJLJLL) != null) {
                    C1483410ohn c1483410ohn = musicDetailAutoPlayManager.LL;
                    if (c1483410ohn != null) {
                        c1483410ohn.LJJLI(false);
                    }
                    for (InterfaceC584700MwW interfaceC584700MwW : musicDetailAutoPlayManager.LLILZ) {
                        Aweme aweme4 = musicDetailAutoPlayManager.LLILLL;
                        if (aweme4 != null) {
                            aid2 = aweme4.getAid();
                        } else {
                            aid2 = null;
                        }
                        interfaceC584700MwW.onPause(aid2);
                    }
                    musicDetailAutoPlayManager.LLILLL = null;
                }
                long jUptimeMillis = SystemClock.uptimeMillis();
                C629520Omc c629520Omc2 = this.LIZ;
                if (c629520Omc2 != null) {
                    this.LIZIZ.LLLLIIL.LJIILLIIL(c629520Omc2.LIZJ, jUptimeMillis - c629520Omc2.LIZIZ, c629520Omc2.LIZ);
                }
                this.LIZ = new C629520Omc(i, SystemClock.uptimeMillis(), aweme);
            }
        });
        this.LLJL = new C1400650mYJ(this);
        ISocPubStatusRepoService iSocPubStatusRepoService = (ISocPubStatusRepoService) PluggableExtentionKt.pluggableSpi$default(ISocPubStatusRepoService.class, false, false, false, 14, null);
        if (iSocPubStatusRepoService != null) {
            iSocPubStatusRepoService.LJIIJJI(hashCode());
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJFF = C629480OmY.LJFF(this);
        if (interfaceC665370Q7zLJFF != null) {
            SharedMusicAwemeListViewModel sharedMusicAwemeListViewModelUS = uS();
            InterfaceC494301wD interfaceC494301wDLIZ = C1558520qew.LIZ(interfaceC665370Q7zLJFF, IMDPAwemeListAbility.class, null);
            if (interfaceC494301wDLIZ == null) {
                C1558520qew.LJII(interfaceC665370Q7zLJFF, sharedMusicAwemeListViewModelUS, IMDPAwemeListAbility.class, null, null);
            } else {
                try {
                    InvocationHandler invocationHandler = Proxy.getInvocationHandler(interfaceC494301wDLIZ);
                    if (invocationHandler instanceof C2255108sX) {
                        ((C2255108sX) invocationHandler).LL.add(sharedMusicAwemeListViewModelUS);
                    } else {
                        throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
                    }
                } catch (IllegalArgumentException e) {
                    TryCatchGuardChecker.doCheck(e);
                    C2255108sX c2255108sX = new C2255108sX();
                    c2255108sX.LL.add(sharedMusicAwemeListViewModelUS);
                    c2255108sX.LL.add((T) interfaceC494301wDLIZ);
                    Object objNewProxyInstance = Proxy.newProxyInstance(IMDPAwemeListAbility.class.getClassLoader(), new Class[]{IMDPAwemeListAbility.class}, c2255108sX);
                    if (objNewProxyInstance != null) {
                        C1558520qew.LJII(interfaceC665370Q7zLJFF, (InterfaceC494301wD) objNewProxyInstance, IMDPAwemeListAbility.class, null, null);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.music.v2.viewmodel.IMDPAwemeListAbility");
                    }
                }
            }
        }
        if (C636090OxD.LIZ() && !C0C64.LJIILLIIL().LJIIIZ(31744, "studio_mdp_square_init_later", true, false)) {
            MusicDetailAutoPlayManager musicDetailAutoPlayManager = this.LLLLLJLJLL;
            if (musicDetailAutoPlayManager != null) {
                musicDetailAutoPlayManager.LIZ();
                this.LLLLLJLJLL = null;
            }
            MusicDetailAutoPlayManager musicDetailAutoPlayManager2 = new MusicDetailAutoPlayManager();
            this.LLLLLJLJLL = musicDetailAutoPlayManager2;
            InterfaceC665370Q7z interfaceC665370Q7zLJFF2 = C629480OmY.LJFF(this);
            if (interfaceC665370Q7zLJFF2 != null) {
                InterfaceC494301wD interfaceC494301wDLIZ2 = C1558520qew.LIZ(interfaceC665370Q7zLJFF2, IMDPAutoPlayAbility.class, null);
                if (interfaceC494301wDLIZ2 == null) {
                    C1558520qew.LJII(interfaceC665370Q7zLJFF2, musicDetailAutoPlayManager2, IMDPAutoPlayAbility.class, null, null);
                } else {
                    try {
                        InvocationHandler invocationHandler2 = Proxy.getInvocationHandler(interfaceC494301wDLIZ2);
                        if (invocationHandler2 instanceof C2255108sX) {
                            ((C2255108sX) invocationHandler2).LL.add(musicDetailAutoPlayManager2);
                        } else {
                            throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
                        }
                    } catch (IllegalArgumentException e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        C2255108sX c2255108sX2 = new C2255108sX();
                        c2255108sX2.LL.add(musicDetailAutoPlayManager2);
                        c2255108sX2.LL.add((T) interfaceC494301wDLIZ2);
                        Object objNewProxyInstance2 = Proxy.newProxyInstance(IMDPAutoPlayAbility.class.getClassLoader(), new Class[]{IMDPAutoPlayAbility.class}, c2255108sX2);
                        if (objNewProxyInstance2 != null) {
                            C1558520qew.LJII(interfaceC665370Q7zLJFF2, (InterfaceC494301wD) objNewProxyInstance2, IMDPAutoPlayAbility.class, null, null);
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.music.v2.viewmodel.IMDPAutoPlayAbility");
                        }
                    }
                }
            }
            MusicDetailAutoPlayManager musicDetailAutoPlayManager3 = this.LLLLLJLJLL;
            if (musicDetailAutoPlayManager3 != null) {
                musicDetailAutoPlayManager3.p91(new InterfaceC584700MwW() { // from class: X.0mYf
                    @Override // X.InterfaceC584700MwW
                    public final void LIZ() {
                    }

                    @Override // X.InterfaceC584700MwW
                    public final void onFailed() {
                    }

                    @Override // X.InterfaceC584700MwW
                    public final void onRelease() {
                    }

                    @Override // X.InterfaceC584700MwW
                    public final void LJJIJIIJI(String str) {
                        this.LIZ.BS(str, "video_play");
                    }

                    @Override // X.InterfaceC584700MwW
                    public final void m0(boolean z) {
                        IMDPMusicPlayAbility iMDPMusicPlayAbility;
                        if (!z && (iMDPMusicPlayAbility = (IMDPMusicPlayAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this.LIZ, null), IMDPMusicPlayAbility.class, null)) != null) {
                            iMDPMusicPlayAbility.xb0();
                        }
                    }

                    @Override // X.InterfaceC584700MwW
                    public final void onPause(String str) {
                        if (str != null) {
                            MusicDetailAwemeListFragment musicDetailAwemeListFragment = this.LIZ;
                            if (!Intrinsics.LJFF(str, musicDetailAwemeListFragment.LLLLLLZ)) {
                                musicDetailAwemeListFragment.LLLLLLZ = str;
                                musicDetailAwemeListFragment.BS(str, "play_time");
                            }
                        }
                    }

                    @Override // X.InterfaceC584700MwW
                    public final void LIZIZ(String str, boolean z) {
                        IMDPMusicPlayAbility iMDPMusicPlayAbility;
                        if (!z && (iMDPMusicPlayAbility = (IMDPMusicPlayAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this.LIZ, null), IMDPMusicPlayAbility.class, null)) != null) {
                            iMDPMusicPlayAbility.xb0();
                        }
                    }

                    @Override // X.InterfaceC584700MwW
                    public final void onPlayCompleted(String str, int i) {
                        if (i == 1) {
                            this.LIZ.BS(str, "video_play_finish");
                        }
                    }
                });
            }
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onSyncLikeStateEvent(C730120SkU c730120SkU) {
        C632130Oqp.LIZ.getClass();
        C632130Oqp.LIZ();
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onUpdateFeaturedAwemeEvent(C1165540gR6 c1165540gR6) {
        if (c1165540gR6.LIZIZ) {
            if (c1165540gR6.LIZJ) {
                C1389890mGx c1389890mGx = new C1389890mGx(this);
                c1389890mGx.LJIIIZ(2131834516);
                c1389890mGx.LJIIJJI();
            }
            cb(false, false);
            return;
        }
        C1389890mGx c1389890mGx2 = new C1389890mGx(this);
        c1389890mGx2.LJIIIZ(2131837962);
        c1389890mGx2.LJIIJJI();
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment
    public final void rS(RecyclerView.LayoutManager layoutManager) {
        if (C636090OxD.LIZ()) {
            if (layoutManager instanceof WrapGridLayoutManager) {
                ((GridLayoutManager) layoutManager).LLIZ = new C1401790ma9(this, 0);
                return;
            }
            return;
        }
        if (!(layoutManager instanceof WrapGridLayoutManager)) {
            return;
        }
        ((GridLayoutManager) layoutManager).LLIZ = new C1401790ma9(this, 1);
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment, X.InterfaceC645470PTl
    public final void zt(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder instanceof C1400770mYV) {
            C1398280mUU.LJIIJ(0, zS(), this.LLILLL, "");
        }
    }

    public final void BS(String str, String str2) {
        MusicAwemeList musicAwemeList;
        List<Aweme> list;
        Aweme next;
        Integer numValueOf;
        String strCarryMetaSongId;
        AbstractC1386140mAu abstractC1386140mAu;
        List<Aweme> list2;
        C19EG activity = getActivity();
        if (activity == null) {
            return;
        }
        String idStr = null;
        IMDPMobAbility iMDPMobAbility = (IMDPMobAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), IMDPMobAbility.class, null);
        if (iMDPMobAbility != null && (musicAwemeList = this.LLLLLIL) != null && (list = musicAwemeList.items) != null) {
            Iterator<Aweme> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.getAid(), str)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            Aweme aweme = next;
            if (aweme == null || !AwemeExtKt.isMDPSquareType(aweme)) {
                return;
            }
            MusicAwemeList musicAwemeList2 = this.LLLLLIL;
            if (musicAwemeList2 != null && (list2 = musicAwemeList2.squareItems) != null) {
                Iterator<Aweme> it3 = list2.iterator();
                int i = 0;
                while (true) {
                    if (it3.hasNext()) {
                        if (Intrinsics.LJFF(it3.next().getAid(), str)) {
                            break;
                        } else {
                            i++;
                        }
                    } else {
                        i = -1;
                        break;
                    }
                }
                numValueOf = Integer.valueOf(i + 1);
            } else {
                numValueOf = null;
            }
            Music music = aweme.getMusic();
            if (music == null || (strCarryMetaSongId = music.carryMetaSongId()) == null) {
                strCarryMetaSongId = "";
            }
            String strCurSquareActionPosition = MusicDetailCommonModel.curSquareActionPosition(aweme, activity.getIntent());
            String strYq0 = iMDPMobAbility.yq0(aweme);
            String strTW0 = iMDPMobAbility.TW0(activity, aweme);
            if (Intrinsics.LJFF(str2, "video_play_finish")) {
                C1386170mAx c1386170mAx = new C1386170mAx() { // from class: X.0mB6
                };
                c1386170mAx.LJLL = strCarryMetaSongId;
                Music music2 = aweme.getMusic();
                if (music2 != null) {
                    idStr = music2.getIdStr();
                }
                c1386170mAx.LJLJLLL = idStr;
                c1386170mAx.LIZLLL = "single_song";
                abstractC1386140mAu = c1386170mAx;
                if (numValueOf != null) {
                    numValueOf.intValue();
                    c1386170mAx.LIZLLL(numValueOf.intValue(), "followup_square_video_rank");
                    abstractC1386140mAu = c1386170mAx;
                }
            } else if (Intrinsics.LJFF(str2, "play_time")) {
                C1386180mAy c1386180mAy = new C1386180mAy() { // from class: X.0mB7
                };
                c1386180mAy.LJLLILLLL = strCarryMetaSongId;
                Music music3 = aweme.getMusic();
                if (music3 != null) {
                    idStr = music3.getIdStr();
                }
                c1386180mAy.LJLLI = idStr;
                c1386180mAy.LIZLLL = "single_song";
                abstractC1386140mAu = c1386180mAy;
            } else {
                C1386190mAz c1386190mAz = new C1386190mAz() { // from class: X.0mZ3
                };
                c1386190mAz.LL = strCarryMetaSongId;
                Music music4 = aweme.getMusic();
                if (music4 != null) {
                    idStr = music4.getIdStr();
                }
                c1386190mAz.LJZL = idStr;
                c1386190mAz.LIZLLL = "single_song";
                c1386190mAz.LJ("followup_square_rec_type", strYq0);
                c1386190mAz.LJ("followup_square_rec_reason", strTW0);
                abstractC1386140mAu = c1386190mAz;
                if (numValueOf != null) {
                    numValueOf.intValue();
                    c1386190mAz.LIZLLL(numValueOf.intValue(), "followup_square_video_rank");
                    abstractC1386140mAu = c1386190mAz;
                }
            }
            abstractC1386140mAu.LJIJI(aweme);
            abstractC1386140mAu.LJ("followup_square_action_position", strCurSquareActionPosition);
            abstractC1386140mAu.LJ("is_from_followup_square_original_video", CardStruct.IStatusCode.DEFAULT);
            abstractC1386140mAu.LJ("followup_square_recommend_type", strYq0);
            abstractC1386140mAu.LJ("followup_square_recommend_reason", strTW0);
            abstractC1386140mAu.LJ("enter_play_method", "manul_play");
            if (C123100dR.LIZ(strCurSquareActionPosition)) {
                abstractC1386140mAu.LJ("followup_square_video_play_method", "auto");
            }
            abstractC1386140mAu.LJIILJJIL();
        }
    }

    public final void ES(Aweme aweme, boolean z) {
        String aid = aweme.getAid();
        C1398280mUU.LIZ(1, this.LLILLL, aid);
        C1390850mIV c1390850mIV = new C1390850mIV();
        C1247510iZJ c1247510iZJ = new C1247510iZJ();
        c1247510iZJ.LIZ = getString(2131834502);
        c1247510iZJ.LJ = new ACListenerS13S1110000_9(z, this, aid, 0);
        C1247510iZJ c1247510iZJ2 = new C1247510iZJ();
        c1247510iZJ2.LIZ = getString(2131834503);
        c1247510iZJ2.LJ = new ACListenerS13S1110000_9(z, this, aid, 1);
        c1390850mIV.LIZIZ(c1247510iZJ, c1247510iZJ2);
        c1390850mIV.LIZJ().show(getFragmentManager(), "edit_featured_video");
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment, X.InterfaceC1260110itd
    public final void LD(TuxTextView tuxTextView, Aweme aweme) {
        if (this.LLLJL) {
            ES(aweme, true);
            this.LLLJL = false;
        }
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment
    public final void MR(SmartRoute smartRoute, Aweme aweme) {
        Integer numValueOf;
        Long l;
        MusicDetail musicDetail = this.LLLLIILL;
        if (musicDetail != null && (l = musicDetail.suggestionId) != null) {
            long jLongValue = l.longValue();
            if (smartRoute != null) {
                C1850190yFN.LIZ.getClass();
                smartRoute.withParam(C1850190yFN.LJI.LIZ, jLongValue);
            }
        }
        Serializable serializable = this.LLLLIL;
        if (serializable != null) {
            if (smartRoute != null) {
                smartRoute.withParam("tts_voice_info", serializable);
            } else {
                return;
            }
        } else if (smartRoute == null) {
            return;
        }
        C1850180yFM c1850180yFM = C1850180yFM.LIZ;
        if (aweme != null) {
            numValueOf = Integer.valueOf(aweme.getAwemeType());
        } else {
            numValueOf = null;
        }
        ShootExtraData shootExtraData = new ShootExtraData(null, null, null, null, null, null, null, null, null, null, null, numValueOf, null, null, null, null, null, null, null, null, null, null, null, null, 16775167, null);
        ICommerceMusicLogger iCommerceMusicLogger = this.LLLLIIL;
        c1850180yFM.getClass();
        C1850180yFM.LIZJ(shootExtraData, iCommerceMusicLogger.getParams(C1850180yFM.LJIILIIL.LIZIZ, new AwS595S0100000_16(aweme, 349)));
        smartRoute.withParam("extra_shoot_data", (Parcelable) shootExtraData);
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment
    public final SmartRoute NR(C1398410mUh c1398410mUh, Aweme aweme) {
        Intent intent;
        int intExtra;
        SmartRoute smartRouteNR = super.NR(c1398410mUh, aweme);
        Music music = this.LLLIZZ;
        if (music != null) {
            smartRouteNR.withParam("feed_data_music", music);
            smartRouteNR.withParam("music_data_from_cache", this.LLLLIILLL);
        }
        MusicStickerStruct musicStickerStruct = this.LLLJ;
        if (musicStickerStruct != null) {
            smartRouteNR.withParam("music_sticker_struct", musicStickerStruct);
        }
        C19EG activity = getActivity();
        if (activity != null && (intent = activity.getIntent()) != null && (intExtra = intent.getIntExtra("is_favourite_music", 0)) == 1) {
            smartRouteNR.withParam("is_favourite_music", intExtra);
        }
        smartRouteNR.withParam("feed_data_author_id", AwemeExtKt.getAuthorUid(aweme));
        smartRouteNR.withParam("feed_data_is_ad", aweme.isAd());
        HashMap map = new HashMap();
        map.put("enter_position", "video_cover");
        smartRouteNR.withParam("feed_param_extra", map);
        return smartRouteNR;
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment, X.InterfaceC1260110itd
    public final void ZF(Aweme aweme, View view) {
        ES(aweme, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v27, types: [X.0mYK] */
    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Object objRequireActivity;
        ComponentCallbacks2 componentCallbacks2LJFF;
        Fragment fragment;
        final InterfaceC655270Pn3 interfaceC655270Pn3;
        ComponentCallbacks2 componentCallbacks2LJFF2;
        super.onViewCreated(view, bundle);
        this.LLLLLLL = view;
        Object obj = null;
        if (C629480OmY.LIZIZ(this)) {
            Context context = getContext();
            if (context != null) {
                componentCallbacks2LJFF2 = SAFExtensionKt.LJFF(context);
            } else {
                componentCallbacks2LJFF2 = null;
            }
            if (!C294780Bgy.LIZ() ? !(componentCallbacks2LJFF2 instanceof InterfaceC214897198d) || !((InterfaceC214897198d) componentCallbacks2LJFF2).getEnableSAF() : !(componentCallbacks2LJFF2 instanceof InterfaceC214897198d)) {
                objRequireActivity = null;
                break;
            }
            Fragment parentFragment = this;
            while (!(parentFragment instanceof InterfaceC214902198i)) {
                parentFragment = parentFragment.getParentFragment();
                if (parentFragment == 0) {
                    objRequireActivity = null;
                    break;
                }
            }
            objRequireActivity = (InterfaceC214902198i) parentFragment;
        } else {
            objRequireActivity = requireActivity();
        }
        if ((objRequireActivity instanceof InterfaceC655270Pn3) && (interfaceC655270Pn3 = (InterfaceC655270Pn3) objRequireActivity) != null) {
            this.LLLILZLLLI = new AbstractC1399690mWl(interfaceC655270Pn3) { // from class: X.0mYK
                @Override // X.InterfaceC1399350mWD
                public final boolean onKeyDown(int i, KeyEvent keyEvent) {
                    return false;
                }
            };
        }
        C1400660mYK c1400660mYK = this.LLLILZLLLI;
        if (c1400660mYK != null) {
            c1400660mYK.LIZ(true);
        }
        AssemViewModel.asyncSubscribe$default(wS(), new C2217381BqS() { // from class: X.0Omw
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C629660Omq) obj2).LL;
            }
        }, this, null, null, null, new AwS600S0100000_21(this, 154), 28, null);
        this.LLJJIJIIJIL.addOnScrollListener(new AsS36S0100000_9(this, 6));
        if (C0C0Z.LIZ() && C306580C0a.LIZ()) {
            C0CHQ.LIZ().LJI().LIZ().registerListener((C1400940mYm) this.LLLLLZIL.getValue());
        }
        if (C636090OxD.LIZ() && !C0C64.LJIILLIIL().LJIIIZ(31744, "studio_mdp_square_init_later", true, false)) {
            C1401160mZ8 c1401160mZ8 = new C1401160mZ8();
            this.LLLLLL = c1401160mZ8;
            if (C629480OmY.LIZIZ(this)) {
                Context context2 = getContext();
                if (context2 != null) {
                    componentCallbacks2LJFF = SAFExtensionKt.LJFF(context2);
                } else {
                    componentCallbacks2LJFF = null;
                }
                if (!C294780Bgy.LIZ() ? !(!(componentCallbacks2LJFF instanceof InterfaceC214897198d) || !((InterfaceC214897198d) componentCallbacks2LJFF).getEnableSAF()) : (componentCallbacks2LJFF instanceof InterfaceC214897198d)) {
                    Fragment parentFragment2 = this;
                    while (true) {
                        if (parentFragment2 instanceof InterfaceC214902198i) {
                            obj = (InterfaceC214902198i) parentFragment2;
                            break;
                        } else {
                            parentFragment2 = parentFragment2.getParentFragment();
                            if (parentFragment2 == null) {
                                break;
                            }
                        }
                    }
                }
                if ((obj instanceof Fragment) && (fragment = (Fragment) obj) != null) {
                    c1401160mZ8.LIZ(fragment, fragment, this.LLJJIJIIJIL);
                }
            } else {
                C19EG activity = getActivity();
                if (activity != null) {
                    c1401160mZ8.LIZ(activity, activity, this.LLJJIJIIJIL);
                }
            }
            C1401160mZ8 c1401160mZ82 = this.LLLLLL;
            if (c1401160mZ82 != null) {
                c1401160mZ82.LJIIJ = new InterfaceC1401150mZ7() { // from class: X.0mYp
                    @Override // X.InterfaceC1401150mZ7
                    public final void LIZ(int i) {
                        SharedMusicAwemeListViewModel sharedMusicAwemeListViewModelUS = this.LIZ.uS();
                        if (!C0C64.LJIILLIIL().LJIIIZ(31744, "mdp_square_disable_shoot_animation", true, false)) {
                            sharedMusicAwemeListViewModelUS.setState(new AwS33S0001000_19(i, 18));
                        }
                    }
                };
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment
    public final void qS(AbstractC654930PmV abstractC654930PmV, List<Aweme> list) {
        RecyclerView recyclerView = this.LLJJIJIIJIL;
        if (recyclerView != null) {
            HandlerHook.viewPost(recyclerView, new ARunnableS54S0300000_21(list, this, abstractC654930PmV, 8));
        }
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment
    public final void kS(int i, boolean z, List list) {
        mS(i, z, list);
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x007e, code lost:
    
        if (((X.C1401320mZO) r4).LLJJIII != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0080, code lost:
    
        X.C1399330mWB.LIZ.getClass();
        X.C1399330mWB.LIZJ = java.lang.System.currentTimeMillis();
        r2 = getContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x008f, code lost:
    
        if (r2 == null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0091, code lost:
    
        r10.LLLLL = X.C1399150mVt.LIZIZ(r2, X.EnumC1399740mWq.VISIBLE, new X.C1401050mYx(r10));
        r1 = r2.getString(2131829862);
        r0 = r10.LLLLL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a7, code lost:
    
        if (r0 == null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a9, code lost:
    
        r0.setMessage(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ac, code lost:
    
        r10.LLLLILI = r11;
        r10.LLLLJ = r12.getAid();
        r10.LLLLJI = r13;
        r0 = r10.LLILZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b8, code lost:
    
        if (r0 == null) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ba, code lost:
    
        r3 = r0.LL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00bc, code lost:
    
        if (r3 == 0) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c0, code lost:
    
        if ((r3 instanceof X.C1401320mZO) == false) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00c2, code lost:
    
        ((X.C1401320mZO) r3).LLJJ.LJIIJJI(new Y.ARunnableS78S0200000_9(r10, r3, 94), X.EnumC2272608vM.LL);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d3, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00da, code lost:
    
        if (r6 == false) goto L60;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01d0 A[PHI: r4
      0x01d0: PHI (r4v8 com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct) = 
      (r4v4 com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct)
      (r4v11 com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct)
     binds: [B:101:0x01ce, B:92:0x01a7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f3 A[PHI: r9
      0x00f3: PHI (r9v1 boolean) = 
      (r9v0 boolean)
      (r9v3 boolean)
      (r9v3 boolean)
      (r9v3 boolean)
      (r9v3 boolean)
      (r9v3 boolean)
      (r9v3 boolean)
      (r9v3 boolean)
      (r9v3 boolean)
     binds: [B:64:0x00ef, B:14:0x002a, B:16:0x0030, B:18:0x0034, B:25:0x0053, B:27:0x0059, B:29:0x005f, B:31:0x0065, B:33:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01a9  */
    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment, X.InterfaceC1260110itd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void xe(android.view.View r11, com.ss.android.ugc.aweme.feed.model.Aweme r12, java.lang.String r13, int r14) {
        /*
            Method dump skipped, instruction units count: 587
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.music.ui.MusicDetailAwemeListFragment.xe(android.view.View, com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, int):void");
    }
}
