package com.ss.android.ugc.aweme.feed.adapter;

import X.C0N5G;
import X.C0PEM;
import X.C0PSR;
import X.C0RSR;
import X.C0RW4;
import X.C0SYN;
import X.C1022640cic;
import X.C1209980ham;
import X.C1219900hqm;
import X.C1365870leD;
import X.C1434905jX;
import X.C14EU;
import X.C1DFH;
import X.C1ELP;
import X.C1ELV;
import X.C1ELW;
import X.C2038507yh;
import X.C2107308Nj;
import X.C2248751Czx;
import X.C23250099c;
import X.C264740AZc;
import X.C327020Crs;
import X.C479910Irt;
import X.C486890J7n;
import X.C506101y7;
import X.C581630MrZ;
import X.C586100Mym;
import X.C608290NtT;
import X.C608360Nta;
import X.C608750NuD;
import X.C609850Nvz;
import X.C609900Nw4;
import X.C634020Ots;
import X.C688620Qzk;
import X.C723240SYo;
import X.C730120SkU;
import X.C731170SmB;
import X.C731710Sn3;
import X.C734360SrK;
import X.C734370SrL;
import X.C737030Svd;
import X.C739360SzO;
import X.C739480Sza;
import X.C739860T0m;
import X.C740360T2k;
import X.C888460YtI;
import X.C988880bqA;
import X.C996690c2l;
import X.InterfaceC0148002o;
import X.InterfaceC497601wk;
import Y.AObjectS354S0100000_11;
import Y.ARunnableS111S0100000_11;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseHolderViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.InteractionTagInfoEvent;
import com.ss.android.ugc.aweme.feed.model.InteractionTagLabelEvent;
import com.ss.android.ugc.aweme.profile.model.UserInfoUpdateEvent;
import kotlin.jvm.internal.AwS614S0100000_35;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes36.dex */
public final class VideoEventDispatchViewModel extends FeedBaseHolderViewModel<C1ELP> {
    public static final /* synthetic */ int LLIZ = 0;
    public final boolean LLILZ;
    public AObjectS354S0100000_11 LLILZIL;
    public C0RW4 LLILZLL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1ELP(0);
    }

    public VideoEventDispatchViewModel() {
        if (!((Boolean) C264740AZc.LIZ.getValue()).booleanValue()) {
            EventBus.LIZLLL().LJIJJ(this);
        }
        this.LLILZ = true;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        if (EventBus.LIZLLL().LJIIJ(this)) {
            EventBus.LIZLLL().LJJI(this);
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        if (((Boolean) C264740AZc.LIZ.getValue()).booleanValue() && !EventBus.LIZLLL().LJIIJ(this)) {
            EventBus.LIZLLL().LJIJJ(this);
        }
        InterfaceC497601wk assemVMScope = getAssemVMScope();
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(assemVMScope, C2107308Nj.LIZ, null, new C327020Crs(this, null), 2);
        C506101y7.LIZ(getLifecycle(), new ARunnableS111S0100000_11(this, 12));
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.FeedBaseHolderViewModel, com.bytedance.assem.arch.viewModel.AssemViewModel
    public final boolean isHolderVM() {
        return this.LLILZ;
    }

    @C14EU(threadMode = ThreadMode.BACKGROUND)
    public final void onAdCardShowEvent(C988880bqA c988880bqA) {
        setState(new AwS614S0100000_35(c988880bqA, 50));
    }

    @C14EU(threadMode = ThreadMode.BACKGROUND)
    public final void onAdClickEvent(C1022640cic c1022640cic) {
        setState(new AwS614S0100000_35(c1022640cic, 52));
    }

    @C14EU(threadMode = ThreadMode.BACKGROUND)
    public final void onAwesomeSplashEvent(C740360T2k c740360T2k) {
        setState(new AwS614S0100000_35(c740360T2k, 54));
    }

    @C14EU(threadMode = ThreadMode.BACKGROUND)
    public final void onBlockUserEvent(C888460YtI c888460YtI) {
        setState(new AwS614S0100000_35(c888460YtI, 56));
    }

    @C14EU(threadMode = ThreadMode.BACKGROUND)
    public final void onClickFavoriteEvent(C609850Nvz c609850Nvz) {
        setState(new AwS614S0100000_35(c609850Nvz, 58));
    }

    @C14EU(threadMode = ThreadMode.BACKGROUND)
    public final void onClickMusicCoverEvent(C996690c2l c996690c2l) {
        setState(new AwS614S0100000_35(c996690c2l, 60));
    }

    @C14EU(threadMode = ThreadMode.BACKGROUND)
    public final void onCollectAwemeFakeEvent(C731710Sn3 c731710Sn3) {
        setState(new AwS614S0100000_35(c731710Sn3, 62));
    }

    @C14EU(threadMode = ThreadMode.BACKGROUND)
    public final void onCommentEvent(C1209980ham c1209980ham) {
        setState(new AwS614S0100000_35(c1209980ham, 64));
    }

    @C14EU(threadMode = ThreadMode.BACKGROUND)
    public final void onDiggLocalEvent(C586100Mym c586100Mym) {
        setState(new AwS614S0100000_35(c586100Mym, 66));
    }

    @C14EU(threadMode = ThreadMode.BACKGROUND)
    public final void onDislikeStateEvent(C2038507yh c2038507yh) {
        setState(new AwS614S0100000_35(c2038507yh, 68));
    }

    @C14EU(threadMode = ThreadMode.BACKGROUND)
    public final void onEventDiggCountUpdate(C730120SkU c730120SkU) {
        String aid;
        String str = c730120SkU.LIZ;
        Aweme aweme = this.LLILLJJLI;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        if (!Intrinsics.LJFF(str, aid)) {
            return;
        }
        setState(new AwS614S0100000_35(c730120SkU, 70));
    }

    @C14EU(threadMode = ThreadMode.BACKGROUND)
    public final void onEventDiggStart(C734370SrL c734370SrL) {
        setState(new AwS614S0100000_35(c734370SrL, 72));
    }

    @C14EU(threadMode = ThreadMode.BACKGROUND)
    public final void onEventDiggUpdate(C0SYN c0syn) {
        setState(new AwS614S0100000_35(c0syn, 74));
    }

    @C14EU(threadMode = ThreadMode.BACKGROUND)
    public final void onFavoriteAndCollectionEvent(C609900Nw4 c609900Nw4) {
        setState(new AwS614S0100000_35(c609900Nw4, 76));
    }

    @C14EU(threadMode = ThreadMode.BACKGROUND)
    public final void onFrontierStatusEvent(C723240SYo c723240SYo) {
        setState(new AwS614S0100000_35(c723240SYo, 77));
    }

    @C14EU(threadMode = ThreadMode.BACKGROUND)
    public final void onInteractionTagInfo(InteractionTagInfoEvent interactionTagInfoEvent) {
        Aweme aweme;
        AObjectS354S0100000_11 aObjectS354S0100000_11;
        setState(new AwS614S0100000_35(interactionTagInfoEvent, 78));
        if (interactionTagInfoEvent != null && (aweme = interactionTagInfoEvent.aweme) != null && (aObjectS354S0100000_11 = this.LLILZIL) != null) {
            aObjectS354S0100000_11.invoke(aweme);
        }
    }

    @C14EU(threadMode = ThreadMode.BACKGROUND)
    public final void onInteractionTagLabel(InteractionTagLabelEvent interactionTagLabelEvent) {
        Aweme aweme;
        C0RW4 c0rw4;
        if (interactionTagLabelEvent != null && (aweme = interactionTagLabelEvent.aweme) != null && (c0rw4 = this.LLILZLL) != null) {
            c0rw4.invoke(aweme);
        }
    }

    @C14EU(threadMode = ThreadMode.BACKGROUND)
    public final void onLikeEffectDiggEvent(C734360SrK c734360SrK) {
        setState(new AwS614S0100000_35(c734360SrK, 79));
    }

    @C14EU(threadMode = ThreadMode.BACKGROUND)
    public final void onLiveStatusEvent(C479910Irt c479910Irt) {
        setState(new AwS614S0100000_35(c479910Irt, 80));
    }

    @C14EU(threadMode = ThreadMode.BACKGROUND)
    public final void onLongPressDiggEvent(C731170SmB c731170SmB) {
        setState(new AwS614S0100000_35(c731170SmB, 81));
    }

    @C14EU(threadMode = ThreadMode.BACKGROUND)
    public final void onLongPressEvent(C739480Sza c739480Sza) {
        setState(new AwS614S0100000_35(c739480Sza, 82));
    }

    @C14EU(threadMode = ThreadMode.BACKGROUND)
    public final void onPlayerControllerVideoPlayProgressEvent(C2248751Czx c2248751Czx) {
        setState(new C1ELW(c2248751Czx));
    }

    @C14EU(threadMode = ThreadMode.BACKGROUND)
    public final void onProfileFollowEvent(C0PSR c0psr) {
        setState(new AwS614S0100000_35(c0psr, 83));
    }

    @C14EU(threadMode = ThreadMode.BACKGROUND)
    public final void onQuickCommentEvent(C0RSR c0rsr) {
        setState(new AwS614S0100000_35(c0rsr, 84));
    }

    @C14EU(threadMode = ThreadMode.BACKGROUND)
    public final void onReceiveAnchorUpdateEvent(C1219900hqm c1219900hqm) {
        setState(new AwS614S0100000_35(c1219900hqm, 48));
    }

    @C14EU(threadMode = ThreadMode.BACKGROUND)
    public final void onReceiveMusic2DspAuthEvent(C608360Nta c608360Nta) {
        setState(new AwS614S0100000_35(c608360Nta, 49));
    }

    @C14EU(threadMode = ThreadMode.BACKGROUND)
    public final void onReceiveMusic2DspLinkChangeEvent(C634020Ots c634020Ots) {
        setState(new AwS614S0100000_35(c634020Ots, 51));
    }

    @C14EU(threadMode = ThreadMode.BACKGROUND)
    public final void onReceiveMusic2DspPreCheckedEvent(C608290NtT c608290NtT) {
        setState(new AwS614S0100000_35(c608290NtT, 53));
    }

    @C14EU(threadMode = ThreadMode.BACKGROUND)
    public final void onReceiveUserInfoUpdateEvent(UserInfoUpdateEvent userInfoUpdateEvent) {
        setState(new AwS614S0100000_35(userInfoUpdateEvent, 55));
    }

    @C14EU(threadMode = ThreadMode.BACKGROUND)
    public final void onShareAwemeEvent(C688620Qzk c688620Qzk) {
        setState(new AwS614S0100000_35(c688620Qzk, 57));
    }

    @C14EU(threadMode = ThreadMode.BACKGROUND)
    public final void onShareEndEvent(C739860T0m c739860T0m) {
        setState(new AwS614S0100000_35(c739860T0m, 59));
    }

    @C14EU(threadMode = ThreadMode.BACKGROUND)
    public final void onShareStartEvent(C608750NuD c608750NuD) {
        setState(new AwS614S0100000_35(c608750NuD, 63));
    }

    @C14EU(threadMode = ThreadMode.BACKGROUND)
    public final void onShareStartEventNew(C0N5G c0n5g) {
        setState(new AwS614S0100000_35(c0n5g, 65));
    }

    @C14EU(threadMode = ThreadMode.BACKGROUND)
    public final void onTopViewLiveEndEvent(C739360SzO c739360SzO) {
        setState(new AwS614S0100000_35(c739360SzO, 67));
    }

    @C14EU(threadMode = ThreadMode.BACKGROUND)
    public final void onUnBlockUserEvent(C486890J7n c486890J7n) {
        setState(new AwS614S0100000_35(c486890J7n, 69));
    }

    @C14EU(threadMode = ThreadMode.BACKGROUND)
    public final void onUserUpdateEvent(C1434905jX c1434905jX) {
        setState(new AwS614S0100000_35(c1434905jX, 71));
    }

    @C14EU(threadMode = ThreadMode.BACKGROUND)
    public final void onVideoEvent(C737030Svd c737030Svd) {
        if (c737030Svd != null && c737030Svd.LIZ == 106) {
            setState(new AwS614S0100000_35(c737030Svd, 73));
        } else {
            setState(new AwS614S0100000_35(c737030Svd, 75));
        }
    }

    @C14EU(threadMode = ThreadMode.BACKGROUND)
    public final void onVideoPlayerEvent(C581630MrZ c581630MrZ) {
        setState(new C1ELV(c581630MrZ));
    }

    @C14EU(threadMode = ThreadMode.BACKGROUND)
    public final void onShareStartEvent(C1365870leD c1365870leD) {
        setState(new AwS614S0100000_35(c1365870leD, 61));
    }
}
