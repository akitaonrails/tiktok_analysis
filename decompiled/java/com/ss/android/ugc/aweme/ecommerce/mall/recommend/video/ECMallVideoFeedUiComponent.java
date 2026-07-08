package com.ss.android.ugc.aweme.ecommerce.mall.recommend.video;

import X.C01GW;
import X.C051S;
import X.C0N0Y;
import X.C1018703yb;
import X.C1181304jj;
import X.C1326790kdB;
import X.C1331670kl3;
import X.C1334210kp9;
import X.C1399305dn;
import X.C1480290ocl;
import X.C1480420ocy;
import X.C1480430ocz;
import X.C1481290oeN;
import X.C1566140qrE;
import X.C1620830sHR;
import X.C1768180w76;
import X.C2189821An6;
import X.C299750Boz;
import X.C452501pT;
import X.C583620Mum;
import X.C630740Ooa;
import X.C786410Ut5;
import X.EnumC1338240kve;
import X.EnumC1487070onh;
import X.EnumC1769850w9n;
import X.EnumC2281141EQm;
import X.EnumC452301pR;
import X.InterfaceC1483670oiD;
import X.InterfaceC1565950qqv;
import android.view.View;
import android.view.ViewStub;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;
import com.ss.android.ugc.aweme.detail.platform.DetailPageComponent;
import com.ss.android.ugc.aweme.detail.ui.DetailPageFragment;
import com.ss.android.ugc.aweme.ecommerce.ug.popup.service.IEcUgPopupService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS130S0110000_12;
import kotlin.jvm.internal.AwS40S0100100_2;
import kotlin.jvm.internal.AwS556S0100000_12;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes30.dex */
public final class ECMallVideoFeedUiComponent extends DetailPageComponent implements OnUIPlayListener {
    public RemoteImageView LLLJIL;
    public View LLLJL;
    public boolean LLLL;
    public final C01GW LLLLII;
    public boolean LLLLIIIILLL;

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ OnUIPlayListener getWrapperedListener() {
        return C583620Mum.LIZ(this);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onBrightnessChanged(String str, float f) {
        C583620Mum.LIZIZ(this, str, f);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onBufferedPercent(String str, long j, int i) {
        C583620Mum.LIZJ(this, str, j, i);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onBufferedTimeMs(String str, long j) {
        C583620Mum.LIZLLL(this, str, j);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onBuffering(String str, boolean z) {
        C583620Mum.LJ(this, str, z);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onBuffering(String str, boolean z, C1480430ocz c1480430ocz) {
        C583620Mum.LJFF(this, str, z, c1480430ocz);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onBuffering(boolean z) {
        C583620Mum.LJI(this, z);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onCompleteLoaded(String str, boolean z) {
        C583620Mum.LJII(this, str, z);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onCrosstalkHappened(String str) {
        C583620Mum.LJIIIIZZ(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onCrosstalkHappened(String str, List list) {
        C583620Mum.LJIIIZ(this, str, list);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onDecoderBuffering(String str, boolean z) {
        C583620Mum.LJIIJ(this, str, z);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onDecoderBuffering(String str, boolean z, C1480430ocz c1480430ocz) {
        C583620Mum.LJIIJJI(this, str, z, c1480430ocz);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onDecoderBuffering(boolean z) {
        C583620Mum.LJIIL(this, z);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onFrameAboutToBeRendered(int i, long j, long j2, Map map) {
        C583620Mum.LJIILIIL(this, i, j, j2, map);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onLiveRenderFirstFrame(String str, C1480420ocy c1480420ocy) {
        C583620Mum.LJIILJJIL(this, str, c1480420ocy);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onLoopPlay(String str, int i) {
        C583620Mum.LJIILL(this, str, i);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onMaskInfoCallback(String str, C1480290ocl c1480290ocl) {
        C583620Mum.LJIILLIIL(this, str, c1480290ocl);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPausePlay(String str) {
        C583620Mum.LJIIZILJ(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPausePlay(String str, C1480430ocz c1480430ocz) {
        C583620Mum.LJIJ(this, str, c1480430ocz);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayCompleted(String str) {
        C583620Mum.LJIJI(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayCompleted(String str, int i) {
        C583620Mum.LJIJJ(this, str, i);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayCompletedFirstTime(String str) {
        C583620Mum.LJIJJLI(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayCompletedFirstTime(String str, C1480430ocz c1480430ocz) {
        C583620Mum.LJIL(this, str, c1480430ocz);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayFailed(C1481290oeN c1481290oeN) {
        C583620Mum.LJJIFFI(this, c1481290oeN);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayFailed(String str, C1481290oeN c1481290oeN, C1480430ocz c1480430ocz) {
        C583620Mum.LJJI(this, str, c1481290oeN, c1480430ocz);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayPause(String str) {
        C583620Mum.LJJII(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayPrepare(String str) {
        C583620Mum.LJJIII(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayPrepared(String str) {
        C583620Mum.LJJIIJ(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayProgressChange(float f) {
        C583620Mum.LJJIIJZLJL(this, f);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayProgressChange(String str, long j, long j2) {
        C583620Mum.LJJIIZ(this, str, j, j2);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayRelease(String str) {
        C583620Mum.LJJIIZI(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayStop(String str) {
        C583620Mum.LJJIJ(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayStop(String str, JSONObject jSONObject) {
        C583620Mum.LJJIJIIJI(this, str, jSONObject);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayStop(String str, JSONObject jSONObject, C1480430ocz c1480430ocz) {
        C583620Mum.LJJIJIIJIL(this, str, jSONObject, c1480430ocz);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayStop(String str, boolean z) {
        C583620Mum.LJJIJIL(this, str, z);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayerInternalEvent(String str, int i, JSONObject jSONObject) {
        C583620Mum.LJJIJL(this, str, i, jSONObject);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlaying(String str, C1480430ocz c1480430ocz) {
        C583620Mum.LJJIL(this, str, c1480430ocz);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPreRenderSessionMissed(String str) {
        C583620Mum.LJJIZ(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPreparePlay(String str) {
        C583620Mum.LJJJ(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPreparePlay(String str, C1480430ocz c1480430ocz) {
        C583620Mum.LJJJI(this, str, c1480430ocz);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onRenderFirstFrame(C1480420ocy c1480420ocy) {
        C583620Mum.LJJJJ(this, c1480420ocy);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onRenderFirstFrameFromResume(String str) {
        C583620Mum.LJJJJI(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onRenderReady(C1480430ocz c1480430ocz) {
        C583620Mum.LJJJJIZL(this, c1480430ocz);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onResumePlay(String str) {
        C583620Mum.LJJJJJ(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onResumePlay(String str, C1480430ocz c1480430ocz) {
        C583620Mum.LJJJJJL(this, str, c1480430ocz);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onRetryOnError(C1481290oeN c1481290oeN) {
        C583620Mum.LJJJJLI(this, c1481290oeN);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onRetryOnError(String str, C1481290oeN c1481290oeN) {
        C583620Mum.LJJJJL(this, str, c1481290oeN);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onSeekEnd(String str, boolean z) {
        C583620Mum.LJJJJLL(this, str, z);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onSeekStart(String str, int i, float f) {
        C583620Mum.LJJJJZ(this, str, i, f);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onSpeedChanged(String str, float f) {
        C583620Mum.LJJJJZI(this, str, f);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onStopPlay(String str) {
        C583620Mum.LJJJLIIL(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onVideoBitrateChanged(String str, EnumC2281141EQm enumC2281141EQm, int i) {
        C583620Mum.LJJJLL(this, str, enumC2281141EQm, i);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onVideoSecondFrame(String str) {
        C583620Mum.LJJJLZIJ(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onVideoSizeChanged(String str, int i, int i2) {
        C583620Mum.LJJJZ(this, str, i, i2);
    }

    public final void Ep() {
        if (this.LLLL) {
            return;
        }
        this.LLLL = true;
        IEcUgPopupService iEcUgPopupService = (IEcUgPopupService) PluggableExtentionKt.pluggableSpi$default(IEcUgPopupService.class, false, false, false, 14, null);
        if (iEcUgPopupService != null) {
            iEcUgPopupService.onPopupFragmentRenderCompleted(getActivity(), this.LLJJL.getLogExtra());
        }
    }

    public ECMallVideoFeedUiComponent() {
        C01GW c01gwLIZIZ;
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS556S0100000_12((InterfaceC1565950qqv) this, 418), null);
            C1566140qrE.LIZJ(this, c630740Ooa);
            c01gwLIZIZ = c630740Ooa;
        } else {
            c01gwLIZIZ = C452501pT.LIZIZ(new AwS130S0110000_12(false, (InterfaceC1565950qqv) this, 11));
        }
        this.LLLLII = c01gwLIZIZ;
    }

    public final Map<String, Object> Bp() {
        Fragment fragment = getFragment();
        C2189821An6 c2189821An6 = new C2189821An6();
        if (fragment instanceof DetailPageFragment) {
            c2189821An6 = ((DetailPageFragment) fragment).LLILLJJLI;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String eventType = c2189821An6.getEventType();
        if (eventType == null) {
            eventType = "";
        }
        linkedHashMap.put("enter_from", eventType);
        linkedHashMap.put("page_name", "video");
        linkedHashMap.put("button_name", "back");
        String previousPage = c2189821An6.getPreviousPage();
        if (previousPage == null) {
            previousPage = "h5_video";
        }
        linkedHashMap.put("previous_page", previousPage);
        return linkedHashMap;
    }

    @Override // com.ss.android.ugc.aweme.detail.platform.DetailPageComponent, com.ss.android.ugc.aweme.detail.platform.IDetailLifecycleAbility
    public final void onDestroyView() {
        C0N0Y playerManager;
        InterfaceC1483670oiD interfaceC1483670oiDLJIILL;
        super.onDestroyView();
        IEcUgPopupService iEcUgPopupService = (IEcUgPopupService) PluggableExtentionKt.pluggableSpi$default(IEcUgPopupService.class, false, false, false, 14, null);
        if (iEcUgPopupService != null) {
            iEcUgPopupService.onPopupFragmentOnDestroy(getActivity(), this.LLJJL.getLogExtra());
        }
        DetailFragmentPanel detailFragmentPanel = this.LLJL;
        if (detailFragmentPanel != null && (playerManager = detailFragmentPanel.getPlayerManager()) != null && (interfaceC1483670oiDLJIILL = playerManager.LJIILL()) != null) {
            interfaceC1483670oiDLJIILL.LJIIL(this);
        }
        C1181304jj.LIZIZ = "";
        Fp(EnumC1487070onh.EXIT);
    }

    public final void Fp(EnumC1487070onh enumC1487070onh) {
        if (!this.LLLLIIIILLL) {
            this.LLLLIIIILLL = true;
            long jCurrentTimeMillis = System.currentTimeMillis();
            C1399305dn c1399305dn = C1399305dn.LIZ;
            HashMap<String, String> logExtra = this.LLJJL.getLogExtra();
            AwS40S0100100_2 awS40S0100100_2 = new AwS40S0100100_2(jCurrentTimeMillis, enumC1487070onh, 0);
            c1399305dn.getClass();
            JSONObject jSONObjectLIZ = C1399305dn.LIZ(logExtra, awS40S0100100_2);
            if (jSONObjectLIZ != null) {
                C1768180w76.LIZ("rd_ec_inner_feed_trace", null, C051S.LIZJ(jSONObjectLIZ), false);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlaying(String str) {
        C583620Mum.LJJIJLIJ(this, str);
        View view = this.LLLJL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        Ep();
        Fp(EnumC1487070onh.PLAY);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        DetailFragmentPanel detailFragmentPanel;
        C0N0Y playerManager;
        View viewLJLLLL;
        C0N0Y playerManager2;
        InterfaceC1483670oiD interfaceC1483670oiDLJIILL;
        super.onViewCreated(view);
        IEcUgPopupService iEcUgPopupService = (IEcUgPopupService) PluggableExtentionKt.pluggableSpi$default(IEcUgPopupService.class, false, false, false, 14, null);
        if (iEcUgPopupService != null) {
            iEcUgPopupService.onPopupFragmentOnCreate(getActivity(), "shop_video", this.LLJJL.getLogExtra(), null, "full_screen");
        }
        if (C1181304jj.LIZIZ.length() > 0 && (detailFragmentPanel = this.LLJL) != null && (playerManager = detailFragmentPanel.getPlayerManager()) != null && playerManager.LJIILL() != null) {
            ViewStub viewStub = (ViewStub) view.findViewById(R.id.trr).findViewById(R.id.nx7);
            if (viewStub == null || (viewLJLLLL = C786410Ut5.LJLLLL(viewStub)) == null) {
                return;
            }
            this.LLLJL = viewLJLLLL;
            this.LLLJIL = (RemoteImageView) viewLJLLLL.findViewById(R.id.rma);
            DetailFragmentPanel detailFragmentPanel2 = this.LLJL;
            if (detailFragmentPanel2 != null && (playerManager2 = detailFragmentPanel2.getPlayerManager()) != null && (interfaceC1483670oiDLJIILL = playerManager2.LJIILL()) != null) {
                interfaceC1483670oiDLJIILL.LJJIJIIJIL(this);
            }
            String str = C1181304jj.LIZIZ;
            C1334210kp9.LIZIZ(str, EnumC1769850w9n.SHOP_MALL_VIDEO_INNER, null, null, false, false, null, null);
            C1326790kdB.LIZ.getClass();
            C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(str);
            c1331670kl3LIZLLL.LJJ = EnumC1338240kve.FIT_CENTER;
            c1331670kl3LIZLLL.LJJI(this.LLLJIL);
            C786410Ut5.h3(c1331670kl3LIZLLL);
            IViewPagerComponentAbility iViewPagerComponentAbilityMb = Mb();
            if (iViewPagerComponentAbilityMb != null) {
                iViewPagerComponentAbilityMb.Bv0(new C1620830sHR(this, 1));
            }
        }
        C1018703yb.LJ("tiktokec_button_show", Bp());
        HashMap<String, String> logExtra = this.LLJJL.getLogExtra();
        C1399305dn c1399305dn = C1399305dn.LIZ;
        AFwS229S0000000_2 aFwS229S0000000_2 = AFwS229S0000000_2.get$arr$(164);
        c1399305dn.getClass();
        C1399305dn.LIZ(logExtra, aFwS229S0000000_2);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayFailed(String str, C1481290oeN c1481290oeN) {
        C583620Mum.LJJ(this, str, c1481290oeN);
        View view = this.LLLJL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        Ep();
        Fp(EnumC1487070onh.PLAY_FAIL);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(String str, C1480420ocy c1480420ocy) {
        View view = this.LLLJL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        Ep();
    }

    @Override // com.ss.android.ugc.aweme.detail.platform.DetailPageComponent, com.ss.android.ugc.feed.platform.fragment.IDetailBaseAbility
    public final void yF(int i, String str) {
        super.yF(i, str);
        C1018703yb.LJ("tiktokec_button_click", Bp());
    }
}
