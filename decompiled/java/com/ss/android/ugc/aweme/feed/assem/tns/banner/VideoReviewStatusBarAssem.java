package com.ss.android.ugc.aweme.feed.assem.tns.banner;

import X.C01GW;
import X.C0RP1;
import X.C13LE;
import X.C14EU;
import X.C1637806bA;
import X.C1911700zqa;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C280420Ayu;
import X.C452501pT;
import X.C724240Sb0;
import X.C724270Sb3;
import X.C724750Sbp;
import X.C736820SvI;
import X.C737910Sx3;
import X.C786410Ut5;
import X.EnumC700430Rdh;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.ViewTreeObserverOnGlobalLayoutListenerC19333710kR;
import Y.ARunnableS128S0100000_28;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.IDetailFeedSafService;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.port.in.IReplaceMusicDownloadService;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS271S0000000_28;
import kotlin.jvm.internal.AFwS315S0000000_28;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes29.dex */
public final class VideoReviewStatusBarAssem extends BaseCellSlotComponent<VideoReviewStatusBarAssem> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLFZ;
    public final InterfaceC1731706qJ LLJLLIL;
    public final C01GW LLJLLL;
    public final C01GW LLJZ;
    public final C01GW LLJZIJLIL;
    public final C01GW LLL;
    public final C01GW LLLF;
    public final C01GW LLLFF;
    public boolean LLLFFI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(VideoReviewStatusBarAssem.class, "videoReviewStatusVM", "getVideoReviewStatusVM()Lcom/ss/android/ugc/aweme/feed/assem/tns/banner/VideoReviewStatusVM;", 0);
        C13LE.LIZ.getClass();
        LLLFZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public VideoReviewStatusBarAssem() {
        C0RP1 c0rp1 = C0RP1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(VideoReviewStatusVM.class);
        this.LLJLLIL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0rp1, C1637806bA.LIZ, new AwS572S0100000_28(c19719912DlLIZ, 217), null, AFwS271S0000000_28.get$arr$(102));
        this.LLJLLL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), AFwS271S0000000_28.get$arr$(103));
        this.LLJZ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 216));
        this.LLJZIJLIL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 215));
        this.LLL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 218));
        this.LLLF = C452501pT.LIZIZ(new AwS572S0100000_28(this, 214));
        this.LLLFF = C452501pT.LIZIZ(new AwS572S0100000_28(this, 213));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.bbe;
    }

    public final TuxIconView Bp() {
        return (TuxIconView) this.LLLFF.getValue();
    }

    public final TuxIconView Ep() {
        return (TuxIconView) this.LLLF.getValue();
    }

    public final View Fp() {
        return (View) this.LLJZ.getValue();
    }

    public final VideoReviewStatusVM Gp() {
        return (VideoReviewStatusVM) this.LLJLLIL.getValue(this, LLLFZ[0]);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        EventBus.LIZLLL().LJJI(this);
        if (C280420Ayu.LIZ()) {
            VideoReviewStatusVM videoReviewStatusVMGp = Gp();
            videoReviewStatusVMGp.getClass();
            ((IReplaceMusicDownloadService) ServiceManager.get().getService(IReplaceMusicDownloadService.class)).LJ(videoReviewStatusVMGp.LLIZ);
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem
    public final void so() {
        VideoReviewStatusVM videoReviewStatusVMGp = Gp();
        subscribe(videoReviewStatusVMGp, C736820SvI.LIZIZ(videoReviewStatusVMGp.usedInReusedScene), null, AFwS315S0000000_28.get$arr$(14));
        EventBus.LIZLLL().LJIJJ(this);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onPromoteReplaceMusicEvent(C1911700zqa c1911700zqa) {
        String str;
        Object obj = null;
        if (c1911700zqa != null) {
            str = c1911700zqa.LIZ;
        } else {
            str = null;
        }
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        }
        if (Intrinsics.LJFF(str, ((VideoItemParams) obj).getAweme().getAid())) {
            HandlerHook.viewPost(Fp(), new ARunnableS128S0100000_28(this, 31));
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        Fragment fragmentLIZLLL;
        super.onViewCreated(view);
        setComponentClickStatusExperimental(getContentView(), EnumC700430Rdh.POSITIVE);
        C786410Ut5.LJLLLLLL(8, Fp());
        IDetailFeedSafService iDetailFeedSafService = (IDetailFeedSafService) PluggableExtentionKt.pluggableSpi$default(IDetailFeedSafService.class, false, false, false, 14, null);
        if (iDetailFeedSafService != null) {
            fragmentLIZLLL = iDetailFeedSafService.LIZLLL(C724240Sb0.LJI(this));
        } else {
            fragmentLIZLLL = null;
        }
        ViewTreeObserverOnGlobalLayoutListenerC19333710kR viewTreeObserverOnGlobalLayoutListenerC19333710kR = new ViewTreeObserverOnGlobalLayoutListenerC19333710kR(this, 0);
        if (fragmentLIZLLL != null) {
            SAFExtensionKt.LIZ(viewTreeObserverOnGlobalLayoutListenerC19333710kR, Fp().getViewTreeObserver(), fragmentLIZLLL);
        } else {
            C786410Ut5.x3(Fp().getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC19333710kR);
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(VideoItemParams videoItemParams) {
    }
}
