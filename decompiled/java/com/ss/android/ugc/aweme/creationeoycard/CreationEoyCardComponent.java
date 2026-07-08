package com.ss.android.ugc.aweme.creationeoycard;

import X.C01GW;
import X.C03IT;
import X.C098200Yq;
import X.C0CTF;
import X.C0LAB;
import X.C1058540deW;
import X.C1227904rF;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1394770mOp;
import X.C1398350mUb;
import X.C13LP;
import X.C1482570ogR;
import X.C1482580ogS;
import X.C1484680ojq;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1578630rBN;
import X.C1697810uHb;
import X.C189200o6;
import X.C201955140j;
import X.C339190DRl;
import X.C425050Glb;
import X.C452501pT;
import X.C582130MsN;
import X.C724270Sb3;
import X.C786410Ut5;
import X.EnumC1338240kve;
import X.InterfaceC1482530ogN;
import X.InterfaceC1483820oiS;
import X.InterfaceC1484830ok5;
import Y.ARunnableS119S0100000_19;
import Y.ARunnableS74S0200000_5;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.cardinsert.CardInsertInfo;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.interfaces.ITemplateMobService;
import com.ss.android.ugc.aweme.services.story.forward.CelebrationRenderVideoInfo;
import com.ss.android.ugc.aweme.services.story.forward.ICelebrationCreateService;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS575S0100000_31;
import org.json.JSONObject;
import wh6.AbS710S0100000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class CreationEoyCardComponent extends BaseCellContentComponent<CreationEoyCardComponent> implements CreationEoyAdaptionProtocol {
    public InterfaceC1484830ok5 LLL;
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 355));
    public final C01GW LLJJL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 366));
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS575S0100000_31(this, 359));
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 364));
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 361));
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 358));
    public final C01GW LLJLL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 360));
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 362));
    public final C01GW LLJLLL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 356));
    public final C01GW LLJZ = C452501pT.LIZIZ(new AwS575S0100000_31(this, 357));
    public final C01GW LLJZIJLIL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 365));
    public final C1394770mOp LLLF = new InterfaceC1482530ogN() { // from class: X.0mOp
        @Override // X.InterfaceC1482530ogN
        public final /* synthetic */ void Au(Surface surface) {
        }

        @Override // X.InterfaceC1482530ogN
        public final /* synthetic */ void Gk1(C1284720jXK c1284720jXK) {
        }

        @Override // X.InterfaceC1482530ogN
        public final /* synthetic */ void LLZZLLIL(C1281010jRL c1281010jRL) {
        }

        @Override // X.InterfaceC1482530ogN
        public final /* synthetic */ void Qe2(C1700490uLv c1700490uLv) {
        }

        @Override // X.InterfaceC1482530ogN
        public final /* synthetic */ void VK() {
        }

        @Override // X.InterfaceC1482530ogN
        public final /* synthetic */ void W1(String str) {
        }

        @Override // X.InterfaceC1482530ogN
        public final /* synthetic */ void onBrightnessChanged(String str, float f) {
        }

        @Override // X.InterfaceC1482530ogN
        public final /* synthetic */ void onBufferedPercent(String str, long j, int i) {
        }

        @Override // X.InterfaceC1482530ogN
        public final /* synthetic */ void onBufferedTimeMs(String str, long j) {
        }

        @Override // X.InterfaceC1482530ogN
        public final /* synthetic */ void onBuffering(String str, boolean z, C1480430ocz c1480430ocz) {
        }

        @Override // X.InterfaceC1482530ogN
        public final /* synthetic */ void onCompleteLoaded(String str, boolean z) {
        }

        @Override // X.InterfaceC1482530ogN
        public final /* synthetic */ void onCrosstalkHappened(String str, List list) {
        }

        @Override // X.InterfaceC1482530ogN
        public final /* synthetic */ void onDecoderBuffering(String str, boolean z, C1480430ocz c1480430ocz) {
        }

        @Override // X.InterfaceC1482530ogN
        public final /* synthetic */ void onFrameAboutToBeRendered(int i, long j, long j2, Map map) {
        }

        @Override // X.InterfaceC1482530ogN
        public final /* synthetic */ void onLiveRenderFirstFrame(String str, C1480420ocy c1480420ocy) {
        }

        @Override // X.InterfaceC1482530ogN
        public final /* synthetic */ void onLoopPlay(String str, int i) {
        }

        @Override // X.InterfaceC1482530ogN
        public final /* synthetic */ void onMaskInfoCallback(String str, C1480290ocl c1480290ocl) {
        }

        @Override // X.InterfaceC1482530ogN
        public final /* synthetic */ void onPausePlay(String str, C1480430ocz c1480430ocz) {
        }

        @Override // X.InterfaceC1482530ogN
        public final /* synthetic */ void onPlayCompleted(String str, int i) {
        }

        @Override // X.InterfaceC1482530ogN
        public final /* synthetic */ void onPlayCompletedFirstTime(String str, C1480430ocz c1480430ocz) {
        }

        @Override // X.InterfaceC1482530ogN
        public final /* synthetic */ void onPlayPause(String str) {
        }

        @Override // X.InterfaceC1482530ogN
        public final /* synthetic */ void onPlayPrepare(String str) {
        }

        @Override // X.InterfaceC1482530ogN
        public final /* synthetic */ void onPlayPrepared(String str) {
        }

        @Override // X.InterfaceC1482530ogN
        public final /* synthetic */ void onPlayProgressChange(String str, long j, long j2) {
        }

        @Override // X.InterfaceC1482530ogN
        public final /* synthetic */ void onPlayRelease(String str) {
        }

        @Override // X.InterfaceC1482530ogN
        public final /* synthetic */ void onPlayStop(String str, JSONObject jSONObject, C1480430ocz c1480430ocz) {
        }

        @Override // X.InterfaceC1482530ogN
        public final /* synthetic */ void onPlayerInternalEvent(String str, int i, JSONObject jSONObject) {
        }

        @Override // X.InterfaceC1482530ogN
        public final /* synthetic */ void onPlaying(String str, C1480430ocz c1480430ocz) {
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnPreRenderListener
        public final /* synthetic */ void onPreRenderReady(String str) {
            C490850JMt.LIZ(this, str);
        }

        @Override // X.InterfaceC1482530ogN
        public final /* synthetic */ void onPreRenderSessionMissed(String str) {
        }

        @Override // X.InterfaceC1482530ogN
        public final /* synthetic */ void onPreparePlay(String str, C1480430ocz c1480430ocz) {
        }

        @Override // X.InterfaceC1482530ogN
        public final /* synthetic */ void onResumePlay(String str, C1480430ocz c1480430ocz) {
        }

        @Override // X.InterfaceC1482530ogN
        public final /* synthetic */ void onRetryOnError(String str, C1481290oeN c1481290oeN) {
        }

        @Override // X.InterfaceC1482530ogN
        public final /* synthetic */ void onSeekEnd(String str, boolean z) {
        }

        @Override // X.InterfaceC1482530ogN
        public final /* synthetic */ void onSeekStart(String str, int i, float f) {
        }

        @Override // X.InterfaceC1482530ogN
        public final /* synthetic */ void onSpeedChanged(String str, float f) {
        }

        @Override // X.InterfaceC1482530ogN
        public final /* synthetic */ void onStopPlay(String str) {
        }

        @Override // X.InterfaceC1482530ogN
        public final /* synthetic */ void onVideoBitrateChanged(String str, EnumC2281141EQm enumC2281141EQm, int i) {
        }

        @Override // X.InterfaceC1482530ogN
        public final /* synthetic */ void onVideoSecondFrame(String str) {
        }

        @Override // X.InterfaceC1482530ogN
        public final /* synthetic */ void onVideoSizeChanged(String str, int i, int i2) {
        }

        @Override // X.InterfaceC1482530ogN
        public final /* synthetic */ void tc(String str, JSONObject jSONObject) {
        }

        @Override // X.InterfaceC1482530ogN
        public final /* synthetic */ void uv(JSONObject jSONObject) {
        }

        @Override // X.InterfaceC1482530ogN
        public final void onRenderFirstFrame(String str, C1480420ocy c1480420ocy) {
            C339190DRl.LIZIZ((View) this.LL.LLJJL.getValue());
        }

        @Override // X.InterfaceC1482530ogN
        public final void onPlayFailed(String str, C1481290oeN c1481290oeN, C1480430ocz c1480430ocz) {
            C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onPlayFailed, error = ");
            sbLIZ.append(c1481290oeN);
            C201955140j.LIZLLL(c1398350mUb, "msg-log", C2188811AlT.LIZIZ(sbLIZ));
        }
    };
    public final C01GW LLLFF = C452501pT.LIZIZ(new AwS575S0100000_31(this, 363));

    public static CelebrationRenderVideoInfo ip() {
        ICelebrationCreateService iCelebrationCreateService = (ICelebrationCreateService) PluggableExtentionKt.pluggableSpi$default(ICelebrationCreateService.class, false, false, false, 14, null);
        if (iCelebrationCreateService == null) {
            return null;
        }
        Object objMo315getRenderVideoInfoIoAF18A = iCelebrationCreateService.mo315getRenderVideoInfoIoAF18A(2);
        return (CelebrationRenderVideoInfo) (C189200o6.m7isFailureimpl(objMo315getRenderVideoInfoIoAF18A) ? null : objMo315getRenderVideoInfoIoAF18A);
    }

    @Override // com.ss.android.ugc.aweme.creationeoycard.CreationEoyAdaptionProtocol
    public final void LJJIJLIJ() {
        C1578630rBN.LJIIJJI(this, new C0CTF(this, null));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void LJL() {
        InterfaceC1484830ok5 interfaceC1484830ok5 = this.LLL;
        if (interfaceC1484830ok5 != null) {
            interfaceC1484830ok5.stop();
        }
        C201955140j.LIZLLL(C1398350mUb.LIZIZ, "msg-log", "onHolderUnselected");
    }

    @Override // com.ss.android.ugc.aweme.creationeoycard.CreationEoyAdaptionProtocol
    public final void LJLLILLLL() {
        InterfaceC1484830ok5 interfaceC1484830ok5 = this.LLL;
        if (interfaceC1484830ok5 != null) {
            interfaceC1484830ok5.resume();
        }
        C201955140j.LIZLLL(C1398350mUb.LIZIZ, "msg-log", "onPanelHandlePageResume");
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void LJLLLL() {
        InterfaceC1484830ok5 interfaceC1484830ok5 = this.LLL;
        if (interfaceC1484830ok5 != null) {
            interfaceC1484830ok5.LJJIIZ(this.LLLF);
        }
        InterfaceC1484830ok5 interfaceC1484830ok52 = this.LLL;
        if (interfaceC1484830ok52 != null) {
            interfaceC1484830ok52.release();
        }
        this.LLL = null;
        C201955140j.LIZLLL(C1398350mUb.LIZIZ, "msg-log", "onHolderUnbind");
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void Zo() {
        InterfaceC1484830ok5 interfaceC1484830ok5 = this.LLL;
        if (interfaceC1484830ok5 != null) {
            interfaceC1484830ok5.pause();
        }
        C201955140j.LIZLLL(C1398350mUb.LIZIZ, "msg-log", "onHostPause");
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void ap() {
        C201955140j.LIZLLL(C1398350mUb.LIZIZ, "msg-log", "onHostResume");
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x046e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ep() {
        /*
            Method dump skipped, instruction units count: 1505
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.creationeoycard.CreationEoyCardComponent.ep():void");
    }

    public final CreationEoyCardData hp() {
        Object c098200Yq;
        String cardInsertStatus;
        try {
            C724270Sb3 c724270Sb3 = this.LLJI;
            CardInsertInfo cardInsertInfo = ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme().getCardInsertInfo();
            if (cardInsertInfo == null || (cardInsertStatus = cardInsertInfo.getCardInsertStatus()) == null) {
                cardInsertStatus = "";
            }
            C1227904rF.LIZ.getClass();
            c098200Yq = (CreationEoyCardData) C1227904rF.LIZIZ(cardInsertStatus, CreationEoyCardData.class);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            c098200Yq = new CreationEoyCardData(null, null, null, null, null, null, null, null, null);
        }
        return (CreationEoyCardData) c098200Yq;
    }

    public final FrameLayout kp() {
        return (FrameLayout) this.LLJZIJLIL.getValue();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC712990Rxx
    public final void unBind() {
        C201955140j.LIZLLL(C1398350mUb.LIZIZ, "msg-log", "unBind");
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void Vo() {
        C1554610qYd.LIZLLL(C1558520qew.LJIIL(this), CreationEoyAdaptionProtocol.class, this);
        C201955140j.LIZLLL(C1398350mUb.LIZIZ, "msg-log", "onHostDestroy");
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.AbstractC738140SxQ
    public final void onParentSet() {
        super.onParentSet();
        C1554610qYd.LIZJ(C1558520qew.LJIIL(this), CreationEoyAdaptionProtocol.class, C1697810uHb.LJIILJJIL(this));
        C201955140j.LIZLLL(C1398350mUb.LIZIZ, "msg-log", "onParentSet");
    }

    public final void op() {
        FrameLayout.LayoutParams layoutParams;
        FrameLayout frameLayoutKp = kp();
        int childCount = frameLayoutKp.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = frameLayoutKp.getChildAt(i);
            if ((childAt instanceof TextureView) || (childAt instanceof SurfaceView)) {
                if (childAt != null) {
                    CelebrationRenderVideoInfo celebrationRenderVideoInfoIp = ip();
                    int i2 = celebrationRenderVideoInfoIp != null ? celebrationRenderVideoInfoIp.videoWidth : 0;
                    CelebrationRenderVideoInfo celebrationRenderVideoInfoIp2 = ip();
                    int i3 = celebrationRenderVideoInfoIp2 != null ? celebrationRenderVideoInfoIp2.videoHeight : 0;
                    if (i2 <= 0 || i3 <= 0) {
                        return;
                    }
                    ViewGroup.LayoutParams layoutParams2 = childAt.getLayoutParams();
                    if (!(layoutParams2 instanceof FrameLayout.LayoutParams) || (layoutParams = (FrameLayout.LayoutParams) layoutParams2) == null) {
                        return;
                    }
                    Pair pairLIZ = C425050Glb.LIZ(i2, i3, kp().getWidth(), kp().getHeight());
                    layoutParams.width = ((Number) pairLIZ.getFirst()).intValue();
                    layoutParams.height = ((Number) pairLIZ.getSecond()).intValue();
                    layoutParams.gravity = 17;
                    C786410Ut5.W5(childAt, layoutParams);
                    return;
                }
                return;
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void LJLIIIL(int i) {
        InterfaceC1484830ok5 interfaceC1484830ok5 = this.LLL;
        if (interfaceC1484830ok5 != null) {
            interfaceC1484830ok5.pause();
        }
        C201955140j.LIZLLL(C1398350mUb.LIZIZ, "msg-log", "onHolderPause");
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void LLLI(int i) {
        InterfaceC1484830ok5 interfaceC1484830ok5 = this.LLL;
        if (interfaceC1484830ok5 != null) {
            interfaceC1484830ok5.resume();
        }
        C201955140j.LIZLLL(C1398350mUb.LIZIZ, "msg-log", "onHolderResume");
    }

    public final void lp(Context context) {
        int size;
        List<Long> list;
        SmartRouter.buildRoute(context, hp().schema).open();
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("eoy_entrance_type", "feed_card");
        CelebrationRenderVideoInfo celebrationRenderVideoInfoIp = ip();
        if (celebrationRenderVideoInfoIp != null && (list = celebrationRenderVideoInfoIp.originalItemIds) != null) {
            size = list.size();
        } else {
            size = 0;
        }
        c0lab.LIZ(size, "recall_publish_cnt");
        ITemplateMobService iTemplateMobService = (ITemplateMobService) PluggableExtentionKt.pluggableSpi$default(ITemplateMobService.class, false, false, false, 14, null);
        if (iTemplateMobService != null) {
            iTemplateMobService.LIZLLL("eoy_entrance_click", c0lab.LIZ);
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        ep();
        C786410Ut5.I7(new AbS710S0100000_31(this, 5), (View) this.LLJLLL.getValue());
        C786410Ut5.I7(new AbS710S0100000_31(this, 6), (View) this.LLJZ.getValue());
        C786410Ut5.I7(new AbS710S0100000_31(this, 7), kp());
        C201955140j.LIZLLL(C1398350mUb.LIZIZ, "msg-log", "onViewCreated");
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        String str;
        String str2;
        Object c098200Yq;
        C201955140j.LIZLLL(C1398350mUb.LIZIZ, "msg-log", "onBind");
        String str3 = hp().backGroundImageUrl;
        if (str3 != null && str3.length() > 0) {
            C1331670kl3 c1331670kl3LJIIJ = C1331660kl2.LJIIJ(new C03IT(Collections.singletonList(str3)));
            c1331670kl3LJIIJ.LJIILJJIL = 0;
            c1331670kl3LJIIJ.LJIL = Bitmap.Config.ARGB_8888;
            c1331670kl3LJIIJ.LJJ = EnumC1338240kve.FIT_XY;
            c1331670kl3LJIIJ.LJJ((SmartImageView) this.LLJJJJLIIL.getValue());
            C786410Ut5.h3(c1331670kl3LJIIJ);
        }
        C339190DRl.LIZLLL((View) this.LLJJL.getValue());
        CelebrationRenderVideoInfo celebrationRenderVideoInfoIp = ip();
        if ((celebrationRenderVideoInfoIp != null && (str = celebrationRenderVideoInfoIp.coverUrl) != null && str.length() > 0) || ((str = hp().coverImageUrl) != null && str.length() > 0)) {
            C1331670kl3 c1331670kl3LJIIJ2 = C1331660kl2.LJIIJ(new C03IT(Collections.singletonList(str)));
            c1331670kl3LJIIJ2.LJIILJJIL = 0;
            c1331670kl3LJIIJ2.LJIL = Bitmap.Config.ARGB_8888;
            c1331670kl3LJIIJ2.LJJ = EnumC1338240kve.CENTER_CROP;
            c1331670kl3LJIIJ2.LJJ((SmartImageView) this.LLJJL.getValue());
            C786410Ut5.h3(c1331670kl3LJIIJ2);
        }
        ((TextView) this.LLJZ.getValue()).setText(hp().actionButtonHint);
        ((TextView) this.LLJJLIIIJLLLLLLLZ.getValue()).setText(hp().title);
        ((TextView) this.LLJL.getValue()).setText(hp().privacyHint);
        mp((TuxTextView) this.LLJJLIIIJLLLLLLLZ.getValue(), hp().titleColorList);
        mp((TuxTextView) this.LLJL.getValue(), hp().privacyHintColorList);
        List<String> list = hp().iconColorList;
        if (list != null && (str2 = (String) C13LP.LJJJLZIJ(0, list)) != null) {
            try {
                ((TuxIconView) this.LLJLIL.getValue()).setTintColor(Color.parseColor(str2));
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            C189200o6.m1boximpl(c098200Yq);
        }
        InterfaceC1484830ok5 interfaceC1484830ok5LIZJ = C582130MsN.LIZ().LIZJ(null);
        this.LLL = interfaceC1484830ok5LIZJ;
        if (interfaceC1484830ok5LIZJ != null) {
            interfaceC1484830ok5LIZJ.LIZJ(new InterfaceC1483820oiS() { // from class: X.0if1
                @Override // X.InterfaceC1483820oiS
                public final /* synthetic */ boolean bn() {
                    return true;
                }

                @Override // X.InterfaceC1483820oiS
                public final /* synthetic */ InterfaceC1473950oSX getCustomSurfaceLifecycleListener() {
                    return null;
                }

                @Override // X.InterfaceC1483820oiS
                public final /* synthetic */ Surface getSurface() {
                    return null;
                }

                @Override // X.InterfaceC1483820oiS
                public final /* synthetic */ void hj() {
                }

                @Override // X.InterfaceC1483820oiS
                public final /* synthetic */ void pe() {
                }

                @Override // X.InterfaceC1483820oiS
                public final HashMap getParams() {
                    return new HashMap();
                }

                @Override // X.InterfaceC1483820oiS
                public final FrameLayout getPlayViewContainer() {
                    return this.LL.kp();
                }
            });
        }
        InterfaceC1484830ok5 interfaceC1484830ok5 = this.LLL;
        if (interfaceC1484830ok5 != null) {
            interfaceC1484830ok5.LJIIZILJ(this.LLLF);
        }
        if (kp().getWidth() == 0) {
            HandlerHook.viewPost(kp(), new ARunnableS119S0100000_19(this, 160));
        } else {
            op();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void J1(int i, Aweme aweme) {
        List<Long> list;
        String str;
        CelebrationRenderVideoInfo celebrationRenderVideoInfoIp = ip();
        int size = 0;
        if (celebrationRenderVideoInfoIp != null && (str = celebrationRenderVideoInfoIp.localPath) != null && str.length() > 0) {
            Object obj = null;
            if (1 != 0) {
                InterfaceC1484830ok5 interfaceC1484830ok5 = this.LLL;
                if (interfaceC1484830ok5 != null) {
                    C724270Sb3 c724270Sb3 = this.LLJI;
                    if (c724270Sb3 != null) {
                        obj = c724270Sb3.LL;
                    }
                    String aid = ((VideoItemParams) obj).getAweme().getAid();
                    C1482580ogS c1482580ogS = new C1482580ogS();
                    c1482580ogS.LIZ = aid;
                    C1058540deW c1058540deW = new C1058540deW(c1482580ogS);
                    c1058540deW.LIZIZ(str);
                    c1058540deW.LIZJ = 0;
                    C1482570ogR c1482570ogRLIZ = c1058540deW.LIZ().LIZ();
                    c1482570ogRLIZ.LIZIZ.LJJIIZ = "mp4";
                    C1482580ogS c1482580ogS2 = c1482570ogRLIZ.LIZ;
                    c1482580ogS2.LJ = c1482570ogRLIZ;
                    interfaceC1484830ok5.LJ(new C1484680ojq(c1482580ogS2).LIZ());
                }
                C201955140j.LIZLLL(C1398350mUb.LIZIZ, "msg-log", "onHolderSelected");
            }
        }
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("eoy_entrance_type", "feed_card");
        CelebrationRenderVideoInfo celebrationRenderVideoInfoIp2 = ip();
        if (celebrationRenderVideoInfoIp2 != null && (list = celebrationRenderVideoInfoIp2.originalItemIds) != null) {
            size = list.size();
        }
        c0lab.LIZ(size, "recall_publish_cnt");
        ITemplateMobService iTemplateMobService = (ITemplateMobService) PluggableExtentionKt.pluggableSpi$default(ITemplateMobService.class, false, false, false, 14, null);
        if (iTemplateMobService != null) {
            iTemplateMobService.LIZLLL("eoy_entrance_show", c0lab.LIZ);
        }
    }

    public final void mp(TuxTextView tuxTextView, List<String> list) {
        String str;
        Object c098200Yq;
        if (list != null) {
            int size = list.size();
            if (size != 1) {
                if (size == 2) {
                    HandlerHook.viewPost(tuxTextView, new ARunnableS74S0200000_5(tuxTextView, this, list, 4));
                }
            } else {
                if (list == null || (str = (String) C13LP.LJJJLZIJ(0, list)) == null) {
                    return;
                }
                try {
                    tuxTextView.setTextColor(Color.parseColor(str));
                    c098200Yq = Unit.LIZ;
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                C189200o6.m1boximpl(c098200Yq);
            }
        }
    }
}
