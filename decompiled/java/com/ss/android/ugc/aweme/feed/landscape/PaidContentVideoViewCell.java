package com.ss.android.ugc.aweme.feed.landscape;

import X.C0RF0;
import X.C0SFC;
import X.C0XQ7;
import X.C11NJ;
import X.C11S5;
import X.C1336100ksC;
import X.C1440005kM;
import X.C1593870rZx;
import X.C1701940uOG;
import X.C19EG;
import X.C2344809Gs;
import X.C516901zr;
import X.C583620Mum;
import X.C673150Qan;
import X.C687700QyG;
import X.C694540RMe;
import X.C694550RMf;
import X.C786410Ut5;
import X.InterfaceC448830Hir;
import X.InterfaceC704110Rjd;
import Y.ARunnableS109S0100000_9;
import Y.AfS133S0000000_9;
import android.os.Looper;
import android.view.Window;
import androidx.fragment.app.Fragment;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ability.BottomSlideIndicatorAbility;
import com.ss.android.ugc.aweme.ability.IPhotoModeAbility;
import com.ss.android.ugc.aweme.ability.IPhotoSlidesAbility;
import com.ss.android.ugc.aweme.ability.IPhotoSlidesEventDispatchAbility;
import com.ss.android.ugc.aweme.ability.ISlideIndicatorAbility;
import com.ss.android.ugc.aweme.ad.feed.photomode.ICommercePhotoSlideAbility;
import com.ss.android.ugc.aweme.ad.feed.translation.ability.ICarouselComponentTranslationAbility;
import com.ss.android.ugc.aweme.feed.assem.ability.PauseTimeAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PaidContentInfo;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.search.passive.feedbar.ability.FeedBarSearchAbility;
import com.ss.android.ugc.aweme.service.IPaidContentService;
import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.FcpMetaTagAbility;
import com.ss.android.ugc.feed.platform.container.scope.VideoCellScope;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: loaded from: classes12.dex */
public final class PaidContentVideoViewCell extends LandscapeVideoViewCell {
    public long LLZ;
    public long LLZIL;
    public final C11NJ LLZILL;
    public final String LLZL;
    public BottomSlideIndicatorAbility LLZLI;
    public IPhotoModeAbility LLZLL;
    public IPhotoSlidesAbility LLZLLIL;
    public IPhotoSlidesEventDispatchAbility LLZLLLL;
    public ISlideIndicatorAbility LLZZ;
    public ICommercePhotoSlideAbility LLZZJLIL;
    public ICarouselComponentTranslationAbility LLZZLLIL;
    public PauseTimeAbility LLZZZIL;
    public FeedBarSearchAbility LLZZZZ;
    public InterfaceC448830Hir a;
    public InterfaceC704110Rjd b;
    public FcpMetaTagAbility c;

    @Override // com.ss.android.ugc.aweme.feed.landscape.LandscapeVideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell
    public final int LLLIIL() {
        return 27;
    }

    @Override // com.ss.android.ugc.aweme.feed.landscape.LandscapeVideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        super.bindAbility(obj, cls);
        if (cls == BottomSlideIndicatorAbility.class) {
            this.LLZLI = (BottomSlideIndicatorAbility) obj;
        } else if (cls == IPhotoModeAbility.class) {
            this.LLZLL = (IPhotoModeAbility) obj;
        } else if (cls == IPhotoSlidesAbility.class) {
            this.LLZLLIL = (IPhotoSlidesAbility) obj;
        } else if (cls == IPhotoSlidesEventDispatchAbility.class) {
            this.LLZLLLL = (IPhotoSlidesEventDispatchAbility) obj;
        } else if (cls == ISlideIndicatorAbility.class) {
            this.LLZZ = (ISlideIndicatorAbility) obj;
        } else if (cls == ICommercePhotoSlideAbility.class) {
            this.LLZZJLIL = (ICommercePhotoSlideAbility) obj;
        } else if (cls == ICarouselComponentTranslationAbility.class) {
            this.LLZZLLIL = (ICarouselComponentTranslationAbility) obj;
        } else if (cls == PauseTimeAbility.class) {
            this.LLZZZIL = (PauseTimeAbility) obj;
        } else if (cls == FeedBarSearchAbility.class) {
            this.LLZZZZ = (FeedBarSearchAbility) obj;
            C687700QyG.LJFF(this, this.LLLZZ, obj, cls);
        } else if (cls == InterfaceC448830Hir.class) {
            this.a = (InterfaceC448830Hir) obj;
        } else if (cls == InterfaceC704110Rjd.class) {
            this.b = (InterfaceC704110Rjd) obj;
        } else if (cls == FcpMetaTagAbility.class) {
            this.c = (FcpMetaTagAbility) obj;
        }
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // com.ss.android.ugc.aweme.feed.landscape.LandscapeVideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{VideoCellScope.class});
    }

    @Override // com.ss.android.ugc.aweme.feed.landscape.LandscapeVideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C0QSJ
    public final Object getAbility(Class cls) {
        return cls == BottomSlideIndicatorAbility.class ? this.LLZLI : cls == IPhotoModeAbility.class ? this.LLZLL : cls == IPhotoSlidesAbility.class ? this.LLZLLIL : cls == IPhotoSlidesEventDispatchAbility.class ? this.LLZLLLL : cls == ISlideIndicatorAbility.class ? this.LLZZ : cls == ICommercePhotoSlideAbility.class ? this.LLZZJLIL : cls == ICarouselComponentTranslationAbility.class ? this.LLZZLLIL : cls == PauseTimeAbility.class ? this.LLZZZIL : cls == FeedBarSearchAbility.class ? this.LLZZZZ : cls == InterfaceC448830Hir.class ? this.a : cls == InterfaceC704110Rjd.class ? this.b : cls == FcpMetaTagAbility.class ? this.c : super.getAbility(cls);
    }

    @Override // com.ss.android.ugc.aweme.feed.landscape.LandscapeVideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList(super.getParentScopes());
        arrayList.add(VideoCellScope.class);
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.feed.landscape.LandscapeVideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList(super.getScopes());
        arrayList.add(VideoCellScope.class);
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.feed.landscape.LandscapeVideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        super.unbindAbility(obj, cls);
        if (cls == BottomSlideIndicatorAbility.class) {
            this.LLZLI = null;
        } else if (cls == IPhotoModeAbility.class) {
            this.LLZLL = null;
        } else if (cls == IPhotoSlidesAbility.class) {
            this.LLZLLIL = null;
        } else if (cls == IPhotoSlidesEventDispatchAbility.class) {
            this.LLZLLLL = null;
        } else if (cls == ISlideIndicatorAbility.class) {
            this.LLZZ = null;
        } else if (cls == ICommercePhotoSlideAbility.class) {
            this.LLZZJLIL = null;
        } else if (cls == ICarouselComponentTranslationAbility.class) {
            this.LLZZLLIL = null;
        } else if (cls == PauseTimeAbility.class) {
            this.LLZZZIL = null;
        } else if (cls == FeedBarSearchAbility.class) {
            this.LLZZZZ = null;
        } else if (cls == InterfaceC448830Hir.class) {
            this.a = null;
        } else if (cls == InterfaceC704110Rjd.class) {
            this.b = null;
        } else if (cls == FcpMetaTagAbility.class) {
            this.c = null;
        }
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C0SZ8
    public final void LJLLILLLL() {
        Fragment fragment = this.LLJJIII;
        if (fragment == null || !fragment.getUserVisibleHint()) {
            return;
        }
        LLLLZLLLI();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C0SZ8
    public final void LLFF() {
        Fragment fragment = this.LLJJIII;
        if (fragment == null || !fragment.getUserVisibleHint()) {
            return;
        }
        LLLLZLLLI();
    }

    public final void LLLLZLLLI() {
        C19EG activity;
        C694550RMf.LIZ.getClass();
        SettingsManager.LIZLLL().getClass();
        if (!SettingsManager.LIZ("paid_content_prevent_screen_recording", true) || (activity = getActivity()) == null) {
            return;
        }
        C1336100ksC.LJFF(activity);
        C2344809Gs.LIZLLL(4, "PaidContent", "disable screen capture");
    }

    public final void LLZILL() {
        Window window;
        C694550RMf.LIZ.getClass();
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("paid_content_prevent_screen_recording", true)) {
            C19EG activity = getActivity();
            if (activity != null && (window = activity.getWindow()) != null) {
                window.clearFlags(8192);
            }
            C2344809Gs.LIZLLL(4, "PaidContent", "enable screen capture");
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.landscape.LandscapeVideoViewCell, X.C0SZ8
    public final void onDestroyView() {
        super.onDestroyView();
        C786410Ut5.LJLIIL(8000L, new BPEAHandler(Looper.getMainLooper()), new ARunnableS109S0100000_9(this, 76));
    }

    public PaidContentVideoViewCell(C0RF0 c0rf0) {
        super(c0rf0);
        this.LLZILL = new C11NJ();
        this.LLZL = C0XQ7.LJFF().getCurUserId();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C0SZ8
    public final void LJI(Aweme aweme) {
        this.LLZIL = 0L;
        Ft2(null);
    }

    @Override // com.ss.android.ugc.aweme.feed.landscape.LandscapeVideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C0SZ8
    public final void LJJIJIIJIL(int i) {
        super.LJJIJIIJIL(i);
        this.LLZIL = 0L;
        this.LLZ = 0L;
        LLLLZLLLI();
    }

    @Override // com.ss.android.ugc.aweme.feed.landscape.LandscapeVideoViewCell, X.C0SZ8
    public final void LJLIIIL(int i) {
        LLZZLLIL(2, this.LLZIL, this.LLZ);
        LLZILL();
    }

    @Override // com.ss.android.ugc.aweme.feed.landscape.LandscapeVideoViewCell, X.C0SZ8
    public final void LLLI(int i) {
        Fragment fragment = this.LLJJIII;
        if (fragment != null && fragment.getUserVisibleHint()) {
            LLLLZLLLI();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.landscape.LandscapeVideoViewCell, X.C0SZ8
    public final void h(boolean z) {
        super.h(z);
        LLZZLLIL(1, this.LLZIL, this.LLZ);
        this.LLZIL = 0L;
        this.LLZ = 0L;
        LLZILL();
    }

    @Override // com.ss.android.ugc.aweme.feed.landscape.LandscapeVideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPausePlay(String str) {
        String aid;
        super.onPausePlay(str);
        Aweme aweme = this.LLJJ;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        if (u.LJIJI(aid, str, false)) {
            LLZZLLIL(0, this.LLZIL, this.LLZ);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.landscape.LandscapeVideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str) {
        long duration;
        PaidContentInfo paidContentInfo;
        Video video;
        super.onPlayCompleted(str);
        long j = this.LLZIL;
        Aweme aweme = this.LLJJ;
        if (aweme != null && (video = aweme.getVideo()) != null) {
            duration = video.getDuration();
        } else {
            duration = 0;
        }
        LLZZLLIL(4, j, duration);
        this.LLZIL = 0L;
        this.LLZ = 0L;
        Aweme aweme2 = this.LLJJ;
        if (aweme2 != null && (paidContentInfo = aweme2.mPaidContentInfo) != null) {
            if (paidContentInfo.getEnableSingleVideoPurchase()) {
                if (paidContentInfo.isVideoPurchased() || !paidContentInfo.isPartialPreview()) {
                    return;
                }
            } else if (!paidContentInfo.getShouldShowPreview()) {
                return;
            }
            C19EG activity = getActivity();
            if (activity != null) {
                activity.onBackPressed();
            }
            C1440005kM.LIZIZ(C694540RMe.LIZ);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayPrepare(String str) {
        String aid;
        C583620Mum.LJJIII(this, str);
        IPaidContentService iPaidContentService = (IPaidContentService) ServiceManager.get().getService(IPaidContentService.class);
        Aweme aweme = this.LLJJ;
        if (aweme == null || (aid = aweme.getAid()) == null) {
            aid = "";
        }
        iPaidContentService.LIZIZ(aid);
    }

    @Override // com.ss.android.ugc.aweme.feed.landscape.LandscapeVideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPreparePlay(String str) {
        String aid;
        super.onPreparePlay(str);
        IPaidContentService iPaidContentService = (IPaidContentService) ServiceManager.get().getService(IPaidContentService.class);
        Aweme aweme = this.LLJJ;
        if (aweme == null || (aid = aweme.getAid()) == null) {
            aid = "";
        }
        iPaidContentService.LIZIZ(aid);
    }

    @Override // com.ss.android.ugc.aweme.feed.landscape.LandscapeVideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onResumePlay(String str) {
        String aid;
        Fragment fragment;
        super.onResumePlay(str);
        Aweme aweme = this.LLJJ;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        if (Intrinsics.LJFF(str, aid) && (fragment = this.LLJJIII) != null && fragment.getUserVisibleHint()) {
            LLLLZLLLI();
        }
    }

    public final void LLZZLLIL(int i, long j, long j2) {
        long j3;
        int i2;
        boolean zLJFF;
        PaidContentInfo paidContentInfo;
        String aid;
        if (j == j2) {
            return;
        }
        long j4 = LSPassThroughRecordSizeConfig.DEFAULT;
        if (j / j4 == j2 / j4 || C0SFC.LIZIZ.LJIIIIZZ(this.LLJJ)) {
            return;
        }
        this.LLZIL = j2;
        try {
            Aweme aweme = this.LLJJ;
            if (aweme != null && (aid = aweme.getAid()) != null) {
                j3 = CastLongProtector.parseLong(aid);
            } else {
                j3 = 0;
            }
            long j5 = CastLongProtector.parseLong(this.LLZL);
            IPaidContentService iPaidContentService = (IPaidContentService) ServiceManager.get().getService(IPaidContentService.class);
            float f = j;
            float f2 = j2;
            if (Intrinsics.LJFF(this.LLJILJILJ.LJIIIZ, "paid_series_detail_page")) {
                i2 = 1;
            } else {
                i2 = 2;
            }
            Aweme aweme2 = this.LLJJ;
            if (aweme2 != null && (paidContentInfo = aweme2.mPaidContentInfo) != null) {
                zLJFF = Intrinsics.LJFF(paidContentInfo.isInnerFeedRecommend(), Boolean.TRUE);
            } else {
                zLJFF = false;
            }
            this.LLZILL.LIZ(iPaidContentService.LJIIZILJ(j3, j5, f, f2, i, i2, zLJFF).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C516901zr(18), new AfS133S0000000_9(this, 2)));
            C1593870rZx.LIZIZ.LIZJ(j, j2);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            e.getMessage();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.landscape.LandscapeVideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayProgressChange(String str, long j, long j2) {
        String aid;
        super.onPlayProgressChange(str, j, j2);
        Aweme aweme = this.LLJJ;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        if (u.LJIJI(aid, str, false)) {
            this.LLZ = j;
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.landscape.LandscapeVideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onSeekStart(String str, int i, float f) {
        super.onSeekStart(str, i, f);
        LLZZLLIL(3, this.LLZIL, this.LLZ);
        long j = i;
        this.LLZIL = j;
        this.LLZ = j;
    }
}
