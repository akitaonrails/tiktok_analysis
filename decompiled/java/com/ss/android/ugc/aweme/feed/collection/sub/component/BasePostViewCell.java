package com.ss.android.ugc.aweme.feed.collection.sub.component;

import X.C01GW;
import X.C0BMF;
import X.C0R93;
import X.C0R9P;
import X.C0RAF;
import X.C0RF0;
import X.C0RGM;
import X.C0SP6;
import X.C0SUL;
import X.C0SZL;
import X.C13LE;
import X.C1440005kM;
import X.C1480420ocy;
import X.C1480430ocz;
import X.C1481290oeN;
import X.C1483410ohn;
import X.C1558420qem;
import X.C1558520qew;
import X.C1591220rVg;
import X.C19719912Dl;
import X.C19EG;
import X.C328640CuU;
import X.C328650CuV;
import X.C452501pT;
import X.C583620Mum;
import X.C628500Oky;
import X.C630740Ooa;
import X.C690180R5k;
import X.C690610R7b;
import X.C690620R7c;
import X.C690630R7d;
import X.C690640R7e;
import X.C690650R7f;
import X.C690660R7g;
import X.C737910Sx3;
import X.EnumC452301pR;
import X.InterfaceC1294060jmO;
import X.InterfaceC386401eo;
import X.InterfaceC583650Mup;
import X.InterfaceC665370Q7z;
import X.InterfaceC689860R4e;
import X.InterfaceC690460R6m;
import X.InterfaceC713360RyY;
import Y.ARunnableS78S0200000_9;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.google.android.gms.common.ConnectionResult;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.adapter.playerview.BaseFeedPlayerView;
import com.ss.android.ugc.aweme.feed.assem.ability.IPlayerProgressAbility;
import com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility;
import com.ss.android.ugc.aweme.feed.assem.ability.PauseTimeAbility;
import com.ss.android.ugc.aweme.feed.collection.common.ability.CommonCellAbility;
import com.ss.android.ugc.aweme.feed.collection.common.ability.FeedPlayerViewInitAbility;
import com.ss.android.ugc.aweme.feed.collection.sub.BaseSubCell;
import com.ss.android.ugc.aweme.feed.collection.sub.ability.CommonAdapterAbility;
import com.ss.android.ugc.aweme.feed.collection.sub.ability.SubCellAbility;
import com.ss.android.ugc.aweme.feed.collection.sub.ability.TouchEventInterceptAbility;
import com.ss.android.ugc.aweme.feed.collection.sub.ability.VideoAccessibilityAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.RootCellCommonAbility;
import com.ss.android.ugc.feed.platform.cell.component.cover.VideoCoverAbility;
import com.ss.android.ugc.feed.platform.cell.component.stickermanager.CellStickerComponentAbility;
import com.ss.android.ugc.feed.platform.cell.pinch.PinchAbility;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS0S1000001_11;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS62S1000000_11;

/* JADX INFO: loaded from: classes12.dex */
public abstract class BasePostViewCell extends BaseSubCell<BasePostViewCell, VideoItemParams> implements SubCellAbility, IVideoCellAbility, IPlayerProgressAbility, InterfaceC386401eo, C0RGM, CommonCellAbility, FeedPlayerViewInitAbility {
    public final C0RF0 LLLFFI;
    public ARunnableS78S0200000_9 LLLFZ;
    public BaseFeedPlayerView LLLI;
    public final C01GW LLLII;
    public long LLLIIII;
    public long LLLIIIIL;
    public long LLLIIIL;
    public final MutableLiveData<Integer> LLLIIL;
    public boolean LLLIILIL;
    public final C630740Ooa LLLIL;
    public final C630740Ooa LLLILZ;
    public final C630740Ooa LLLILZJ;
    public final C630740Ooa LLLILZLLLI;
    public final C01GW LLLIZZ;
    public final C630740Ooa LLLJ;
    public final C630740Ooa LLLJIL;
    public final C01GW LLLJL;
    public final C01GW LLLL;

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.ability.SubCellAbility
    public final BasePostViewCell BV0() {
        return this;
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final void Es(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.common.ability.CommonCellAbility
    public final InterfaceC713360RyY Fz2() {
        return this;
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final void H8(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    @InterfaceC1294060jmO
    public final Integer Ia() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public final InterfaceC689860R4e K9() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.ability.SubCellAbility
    public final void KF1() {
        this.LLLIILIL = false;
    }

    public boolean LLLLJI() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final void Q5(String str) {
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final void R() {
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final void Uc() {
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final void Vu() {
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final InterfaceC690460R6m Wn0() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public int Yf2() {
        return 3;
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0RGJ, X.InterfaceC583650Mup
    public void Z1() {
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    @InterfaceC1294060jmO
    public final Integer br() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final View by1() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final void ek(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final RootCellCommonAbility gI() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final void ii(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final Aweme im() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final void nO1() {
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public C0SUL om() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0RGJ, X.InterfaceC583650Mup
    public void sc() {
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final void td(HashMap<String, String> map) {
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0RGJ, X.C0SZ8
    public final InterfaceC583650Mup x3() {
        return this;
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final boolean yE0() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0RGJ, X.InterfaceC583650Mup
    public final void ys(int i) {
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final View yy0() {
        return null;
    }

    private final void LLLLLZ() {
        long jDM0;
        if (this.LLLILZ.getValue() != null) {
            PauseTimeAbility pauseTimeAbility = (PauseTimeAbility) this.LLLILZ.getValue();
            if (pauseTimeAbility == null) {
                return;
            } else {
                jDM0 = pauseTimeAbility.dM0();
            }
        } else {
            jDM0 = this.LLLIIIIL;
        }
        if (jDM0 != -1) {
            C0SP6 c0sp6 = C0SP6.LIZ;
            String str = this.LLLFFI.LJ.eventType;
            Aweme aweme = this.LLJJIJIIJIL;
            Long lValueOf = Long.valueOf(TimeUnit.NANOSECONDS.toMillis(System.nanoTime()) - jDM0);
            String from = this.LLLFFI.LJ.param.getFrom();
            C19EG c19eg = this.LLJILLL;
            c0sp6.getClass();
            C0SP6.LIZ(str, aweme, lValueOf, "", from, c19eg, null);
            PauseTimeAbility pauseTimeAbility2 = (PauseTimeAbility) this.LLLILZ.getValue();
            if (pauseTimeAbility2 != null) {
                pauseTimeAbility2.l20(-1L);
            }
            this.LLLIIIIL = -1L;
        }
    }

    private final String getEventType() {
        return this.LLLFFI.LJ.eventType;
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0RGJ, X.C0SZ8
    public final void G() {
        VideoCoverAbility videoCoverAbility = (VideoCoverAbility) this.LLLIL.getValue();
        if (videoCoverAbility != null) {
            videoCoverAbility.qa1("hideCoverView");
        }
    }

    @Override // X.C0RGM
    public final void LLI() {
        CommonAdapterAbility commonAdapterAbility = (CommonAdapterAbility) this.LLLILZLLLI.getValue();
        if (commonAdapterAbility != null) {
            commonAdapterAbility.LJJIJLIJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public final void LLLLIIL() {
        VideoCoverAbility videoCoverAbility;
        if (!((Boolean) C0BMF.LIZ.getValue()).booleanValue() || (videoCoverAbility = (VideoCoverAbility) this.LLLIL.getValue()) == null) {
            return;
        }
        videoCoverAbility.qa1("preRenderReady");
    }

    public final VideoViewModel LLLLLLLLL() {
        return (VideoViewModel) this.LLLL.getValue();
    }

    public final VideoPlayViewModel LLLLLLZZ() {
        return (VideoPlayViewModel) this.LLLJL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final List<Aweme> VA1() {
        return new ArrayList();
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final View Vy1() {
        VideoCoverAbility videoCoverAbility = (VideoCoverAbility) this.LLLIL.getValue();
        if (videoCoverAbility != null) {
            return videoCoverAbility.getVideoCover();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final Fragment getFragment() {
        return this.LLLFFI.LIZJ;
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final BaseFeedPageParams nJ2() {
        BaseFeedPageParams baseFeedPageParams = this.LLLFFI.LJ;
        baseFeedPageParams.param.setCellType(gq());
        return baseFeedPageParams;
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0RGJ, X.InterfaceC739930T0t
    public final void no() {
        CellStickerComponentAbility cellStickerComponentAbility = (CellStickerComponentAbility) this.LLLIZZ.getValue();
        if (cellStickerComponentAbility != null) {
            cellStickerComponentAbility.PQ();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public BaseFeedPlayerView E() {
        return LLLLLLL();
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public final void LLJLL() {
        PinchAbility pinchAbility;
        if (LLLLJI() && (pinchAbility = (PinchAbility) this.LLLJ.getValue()) != null) {
            pinchAbility.x90(LLLIILIL(this.LLJJIJIIJIL, false));
        }
    }

    @Override // X.InterfaceC386401eo
    public final long LLL() {
        return C1483410ohn.LJLJJI().getCurrentPosition();
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.InterfaceC583650Mup
    public final View getVideoView() {
        BaseFeedPlayerView baseFeedPlayerViewE = E();
        if (baseFeedPlayerViewE != null) {
            return baseFeedPlayerViewE.getVideoView();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0RGJ, X.C0SZ8
    public void onDestroyView() {
        BaseFeedPlayerView baseFeedPlayerViewLLLLLLL;
        super.onDestroyView();
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ = C1558420qem.LIZIZ(this);
        C1558520qew.LJIIJJI(interfaceC665370Q7zLIZIZ, SubCellAbility.class, null);
        C1558520qew.LJIIJJI(interfaceC665370Q7zLIZIZ, IVideoCellAbility.class, null);
        C1558520qew.LJIIJJI(interfaceC665370Q7zLIZIZ, IPlayerProgressAbility.class, null);
        C1558520qew.LJIIJJI(interfaceC665370Q7zLIZIZ, CommonCellAbility.class, null);
        C1558520qew.LJIIJJI(interfaceC665370Q7zLIZIZ, FeedPlayerViewInitAbility.class, null);
        if (C1591220rVg.LIZLLL() && (baseFeedPlayerViewLLLLLLL = LLLLLLL()) != null) {
            baseFeedPlayerViewLLLLLLL.s5(this);
        }
        ((Handler) this.LLLII.getValue()).removeCallbacksAndMessages(null);
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public final View.OnTouchListener q5() {
        PinchAbility pinchAbility;
        if (LLLLJI() && (pinchAbility = (PinchAbility) this.LLLJ.getValue()) != null) {
            return pinchAbility.q5();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0RGJ, X.InterfaceC739930T0t
    public final void Fm() {
        no();
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IPlayerProgressAbility
    public final LiveData<Integer> Hw() {
        return this.LLLIIL;
    }

    public BaseFeedPlayerView LLLLLLL() {
        return this.LLLI;
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.ability.SubCellAbility
    public final int ZV() {
        return this.LLJJIJIL;
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0RGJ, X.C0SZ8
    public final void onPause() {
        no();
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public final void K8(View.OnTouchListener onTouchListener) {
        TouchEventInterceptAbility touchEventInterceptAbility;
        if (LLLLJI() && (touchEventInterceptAbility = (TouchEventInterceptAbility) this.LLLJIL.getValue()) != null) {
            touchEventInterceptAbility.K8(onTouchListener);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public final void LJI(Aweme aweme) {
        super.LJI(aweme);
        this.LLLIILIL = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00bb  */
    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void LJJIJIIJIL(int r7) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.collection.sub.component.BasePostViewCell.LJJIJIIJIL(int):void");
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public final void LLIIII(boolean z) {
        VideoCoverAbility videoCoverAbility;
        super.LLIIII(z);
        if (Mg() && (videoCoverAbility = (VideoCoverAbility) this.LLLIL.getValue()) != null) {
            videoCoverAbility.lD2(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public final void LLJLIL(Long l) {
        long jLongValue = l.longValue();
        PauseTimeAbility pauseTimeAbility = (PauseTimeAbility) this.LLLILZ.getValue();
        if (pauseTimeAbility != null) {
            pauseTimeAbility.l20(jLongValue);
        }
        this.LLLIIIIL = jLongValue;
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0RGJ, X.InterfaceC583650Mup
    public void LLLLIL(Aweme aweme) {
        VideoPlayViewModel videoPlayViewModelLLLLLLZZ = LLLLLLZZ();
        videoPlayViewModelLLLLLLZZ.getClass();
        videoPlayViewModelLLLLLLZZ.setState(new C690640R7e(aweme));
    }

    public void LLLLZ(BaseFeedPlayerView baseFeedPlayerView) {
        this.LLLI = baseFeedPlayerView;
    }

    public void Wo0(BaseFeedPlayerView baseFeedPlayerView) {
        LLLLZ(baseFeedPlayerView);
        baseFeedPlayerView.Dn(this);
        CommonAdapterAbility commonAdapterAbility = (CommonAdapterAbility) this.LLLILZLLLI.getValue();
        if (commonAdapterAbility != null) {
            commonAdapterAbility.Ds1();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public final void g1(int i) {
        if (E() == null || !this.LLJJJIL) {
            return;
        }
        for (Fragment parentFragment = this.LLLFFI.LIZJ; parentFragment != null; parentFragment = parentFragment.getParentFragment()) {
            if (parentFragment.hashCode() == i) {
                VideoCoverAbility videoCoverAbility = (VideoCoverAbility) this.LLLIL.getValue();
                if (videoCoverAbility != null) {
                    videoCoverAbility.Er1("onTopPageChanged");
                    return;
                }
                return;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public void h(boolean z) {
        String aid;
        Aweme aweme;
        super.h(z);
        Aweme aweme2 = this.LLJJIJIIJIL;
        if (aweme2 != null) {
            aweme2.getAid();
        }
        C1440005kM.LIZ(new C690180R5k());
        LLLLLZ();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = this.LLLIIIL;
        if (j > 0) {
            this.LLLIIII += jCurrentTimeMillis - j;
            this.LLLIIIL = 0L;
        }
        VideoViewModel videoViewModelLLLLLLLLL = LLLLLLLLL();
        Aweme aweme3 = this.LLJJIJIIJIL;
        String aid2 = null;
        if (aweme3 != null) {
            aid = aweme3.getAid();
        } else {
            aid = null;
        }
        videoViewModelLLLLLLLLL.CQ2(aid, z);
        long j2 = this.LLLIIII;
        this.LLLIIII = 0L;
        if (j2 > 0 && j2 < 2000 && this.LLLIILIL && !TextUtils.isEmpty(this.LLLFFI.LJ.eventType) && (aweme = this.LLJJIJIIJIL) != null && !TextUtils.isEmpty(aweme.getAid())) {
            Aweme aweme4 = this.LLJJIJIIJIL;
            if (aweme4 != null) {
                aid2 = aweme4.getAid();
            }
            String str = "";
            if (aid2 == null) {
                aid2 = "";
            }
            String str2 = this.LLLFFI.LJ.eventType;
            if (str2 != null) {
                str = str2;
            }
            C328640CuU.LIZ(new C328650CuV(2, aid2, jCurrentTimeMillis, str));
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBuffering(boolean z) {
        C583620Mum.LJI(this, z);
        boolean zLIZLLL = C0R93.LIZLLL(getEventType());
        boolean zLIZIZ = C0R93.LIZIZ(getEventType());
        boolean zLIZ = C0R93.LIZ(getEventType());
        if (zLIZLLL || zLIZIZ || zLIZ) {
            if (z) {
                this.LLLFZ = new ARunnableS78S0200000_9(this, this.LLJJIJIIJIL, 5);
                C0R9P c0r9p = C0R9P.LIZ;
                AwS553S0100000_9 awS553S0100000_9 = new AwS553S0100000_9(this, 133);
                c0r9p.getClass();
                C0R9P.LJ(awS553S0100000_9);
                VideoAccessibilityAbility videoAccessibilityAbility = (VideoAccessibilityAbility) this.LLLILZJ.getValue();
                if (videoAccessibilityAbility != null) {
                    videoAccessibilityAbility.fw2(false);
                    return;
                }
                return;
            }
            ARunnableS78S0200000_9 aRunnableS78S0200000_9 = this.LLLFZ;
            if (aRunnableS78S0200000_9 == null) {
                return;
            }
            ((Handler) this.LLLII.getValue()).removeCallbacks(aRunnableS78S0200000_9);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPausePlay(String str) {
        C583620Mum.LJIIZILJ(this, str);
        LLLLLLZZ().onPausePlay(str);
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = this.LLLIIIL;
        if (j > 0) {
            this.LLLIIII += jCurrentTimeMillis - j;
            this.LLLIIIL = 0L;
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str) {
        C583620Mum.LJIJI(this, str);
        LLLLLLZZ().onPlayCompleted(str);
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompletedFirstTime(String str) {
        C583620Mum.LJIJJLI(this, str);
        LLLLLLZZ().wQ2();
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayStop(String str) {
        C583620Mum.LJJIJ(this, str);
        VideoPlayViewModel videoPlayViewModelLLLLLLZZ = LLLLLLZZ();
        videoPlayViewModelLLLLLLZZ.getClass();
        videoPlayViewModelLLLLLLZZ.setState(new AwS62S1000000_11(str, 14));
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPreparePlay(String str) {
        C583620Mum.LJJJ(this, str);
        LLLLLLZZ().onPreparePlay(str);
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onRenderFirstFrame(C1480420ocy c1480420ocy) {
        String sourceId;
        C583620Mum.LJJJJ(this, c1480420ocy);
        VideoPlayViewModel videoPlayViewModelLLLLLLZZ = LLLLLLZZ();
        if (c1480420ocy != null) {
            sourceId = c1480420ocy.getSourceId();
        } else {
            sourceId = null;
        }
        videoPlayViewModelLLLLLLZZ.LJJIJIIJI(sourceId);
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onRenderReady(C1480430ocz c1480430ocz) {
        VideoPlayViewModel videoPlayViewModelLLLLLLZZ = LLLLLLZZ();
        videoPlayViewModelLLLLLLZZ.getClass();
        videoPlayViewModelLLLLLLZZ.setState(new C690650R7f());
        this.LLLIIII = 0L;
        this.LLLIIIL = System.currentTimeMillis();
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onResumePlay(String str) {
        C583620Mum.LJJJJJ(this, str);
        LLLLLZ();
        LLLLLLZZ().onResumePlay(str);
        this.LLLIIIL = System.currentTimeMillis();
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRetryOnError(C1481290oeN c1481290oeN) {
        C583620Mum.LJJJJLI(this, c1481290oeN);
    }

    public BasePostViewCell(C0RF0 c0rf0, C0SZL c0szl) {
        super(c0rf0, c0szl);
        this.LLLFFI = c0rf0;
        this.LLLII = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(497));
        this.LLLIIIIL = -1L;
        this.LLLIIL = new MutableLiveData<>(0);
        this.LLLIILIL = true;
        this.LLLIL = C628500Oky.LIZ(new AwS555S0100000_11(this, 1505));
        this.LLLILZ = C628500Oky.LIZ(new AwS555S0100000_11(this, 1501));
        this.LLLILZJ = C628500Oky.LIZ(new AwS555S0100000_11(this, 1499));
        this.LLLILZLLLI = C628500Oky.LIZ(new AwS555S0100000_11(this, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED));
        this.LLLIZZ = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1503));
        this.LLLJ = C628500Oky.LIZ(new AwS555S0100000_11(this, 1502));
        this.LLLJIL = C628500Oky.LIZ(new AwS555S0100000_11(this, 1504));
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(VideoPlayViewModel.class);
        AFwS243S0000000_11 aFwS243S0000000_11 = AFwS243S0000000_11.get$arr$(680);
        EnumC452301pR enumC452301pR = EnumC452301pR.SYNCHRONIZED;
        this.LLLJL = C737910Sx3.LIZLLL(this, c19719912DlLIZ, aFwS243S0000000_11, enumC452301pR);
        this.LLLL = C737910Sx3.LIZLLL(this, C13LE.LIZ(VideoViewModel.class), AFwS243S0000000_11.get$arr$(681), enumC452301pR);
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ = C1558420qem.LIZIZ(this);
        C1558520qew.LJII(interfaceC665370Q7zLIZIZ, this, SubCellAbility.class, null, null);
        C1558520qew.LJII(interfaceC665370Q7zLIZIZ, this, IVideoCellAbility.class, null, null);
        C1558520qew.LJII(interfaceC665370Q7zLIZIZ, this, IPlayerProgressAbility.class, null, null);
        C1558520qew.LJII(interfaceC665370Q7zLIZIZ, this, CommonCellAbility.class, null, null);
        C1558520qew.LJII(interfaceC665370Q7zLIZIZ, this, FeedPlayerViewInitAbility.class, null, null);
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.InterfaceC1473950oSX
    public final void LLILLIZIL(int i, int i2) {
        super.LLILLIZIL(i, i2);
        VideoPlayViewModel videoPlayViewModelLLLLLLZZ = LLLLLLZZ();
        videoPlayViewModelLLLLLLZZ.getClass();
        videoPlayViewModelLLLLLLZZ.setState(new C690660R7g());
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder
    /* JADX INFO: renamed from: LLLLILI, reason: merged with bridge method [inline-methods] */
    public VideoItemParams LLLIILIL(Aweme aweme, boolean z) {
        VideoItemParams videoItemParamsLIZ = C0RAF.LIZ(this.LLLFFI);
        videoItemParamsLIZ.setAweme(aweme);
        videoItemParamsLIZ.currentPosition = this.LLJJIJIL;
        return videoItemParamsLIZ;
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onSeekEnd(String str, boolean z) {
        C583620Mum.LJJJJLL(this, str, z);
        if (z) {
            VideoPlayViewModel videoPlayViewModelLLLLLLZZ = LLLLLLZZ();
            videoPlayViewModelLLLLLLZZ.getClass();
            videoPlayViewModelLLLLLLZZ.setState(new AwS62S1000000_11(str, 15));
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onSpeedChanged(String str, float f) {
        C583620Mum.LJJJJZI(this, str, f);
        VideoPlayViewModel videoPlayViewModelLLLLLLZZ = LLLLLLZZ();
        videoPlayViewModelLLLLLLZZ.getClass();
        videoPlayViewModelLLLLLLZZ.setState(new AwS0S1000001_11(str, f, 1));
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayProgressChange(String str, long j, long j2) {
        float f;
        C583620Mum.LJJIIZ(this, str, j, j2);
        VideoPlayViewModel videoPlayViewModelLLLLLLZZ = LLLLLLZZ();
        videoPlayViewModelLLLLLLZZ.getClass();
        videoPlayViewModelLLLLLLZZ.setState(new C690620R7c(j));
        if (j2 == 0) {
            f = 0.0f;
        } else {
            f = (j * 100.0f) / j2;
        }
        VideoPlayViewModel videoPlayViewModelLLLLLLZZ2 = LLLLLLZZ();
        videoPlayViewModelLLLLLLZZ2.getClass();
        videoPlayViewModelLLLLLLZZ2.setState(new C690610R7b(f));
        VideoPlayViewModel videoPlayViewModelLLLLLLZZ3 = LLLLLLZZ();
        videoPlayViewModelLLLLLLZZ3.getClass();
        videoPlayViewModelLLLLLLZZ3.setState(new C690630R7d(j / 1000.0f));
        this.LLLIIL.setValue(Integer.valueOf((int) j));
    }
}
