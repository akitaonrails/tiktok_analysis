package com.ss.android.ugc.aweme.feed.ui;

import X.C01GW;
import X.C10R5;
import X.C10RS;
import X.C1308910kAL;
import X.C1386170mAx;
import X.C1386190mAz;
import X.C1473870oSP;
import X.C1480290ocl;
import X.C1480420ocy;
import X.C1480430ocz;
import X.C1481290oeN;
import X.C1482640ogY;
import X.C1602160rnK;
import X.C1697810uHb;
import X.C2188811AlT;
import X.C2277711EDh;
import X.C299020Bno;
import X.C335910DEv;
import X.C452501pT;
import X.C583620Mum;
import X.C786410Ut5;
import X.EnumC2281141EQm;
import X.EnumC335920DEw;
import X.InterfaceC1473950oSX;
import Y.ACListenerS163S0100000_29;
import android.content.Intent;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IMandatoryLoginService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.feed.ui.VideoPlayActivity;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.playerkit.videoview.VideoViewComponent;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes30.dex */
public final class VideoPlayActivity extends BaseActivity implements OnUIPlayListener {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiHELIOSMpLCt9PSxiHyY3LSocJS4qCSY4IDk6PDw=";
    public C1473870oSP LL;
    public View LLILLJJLI;
    public ImageView LLILLL;
    public ImageButton LLILZ;
    public Video LLILZLL;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public float LLJJ;
    public final C01GW LLILZIL = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(81));
    public String LLIZ = "";
    public String LLIZLLLIL = "";
    public String LLJ = "";
    public boolean LLJI = true;
    public String LLJILJILJ = "";
    public String LLJILLL = "";
    public String LLJJI = "";

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
    public final void onBuffering(boolean z) {
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
    public final void onDecoderBuffering(boolean z) {
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
    public final void onPausePlay(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPausePlay(String str, C1480430ocz c1480430ocz) {
        C583620Mum.LJIJ(this, str, c1480430ocz);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayCompleted(String str, int i) {
        C583620Mum.LJIJJ(this, str, i);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayCompletedFirstTime(String str, C1480430ocz c1480430ocz) {
        C583620Mum.LJIL(this, str, c1480430ocz);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayFailed(String str, C1481290oeN c1481290oeN) {
        C583620Mum.LJJ(this, str, c1481290oeN);
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
    public final void onPlayProgressChange(float f) {
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
    public final /* synthetic */ void onPlaying(String str) {
        C583620Mum.LJJIJLIJ(this, str);
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
    public final void onPreparePlay(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPreparePlay(String str, C1480430ocz c1480430ocz) {
        C583620Mum.LJJJI(this, str, c1480430ocz);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onRenderFirstFrame(String str, C1480420ocy c1480420ocy) {
        C583620Mum.LJJJIL(this, str, c1480420ocy);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onRenderFirstFrameFromResume(String str) {
        C583620Mum.LJJJJI(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderReady(C1480430ocz c1480430ocz) {
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.feed.ui.VideoPlayActivity", "onResume", true);
        super.onResume();
        if (!LLLLZI().LJFF() && this.LLILZLL != null && !this.LLJILJIL) {
            LLLLZIL(false);
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.feed.ui.VideoPlayActivity", "onResume", false);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onResumePlay(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onResumePlay(String str, C1480430ocz c1480430ocz) {
        C583620Mum.LJJJJJL(this, str, c1480430ocz);
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

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.feed.ui.VideoPlayActivity", "onStart", true);
        super.onStart();
        if (C2277711EDh.LIZIZ.LIZ() || !((IMandatoryLoginService) ServiceManager.get().getService(IMandatoryLoginService.class)).shouldShowForcedLogin(false)) {
            C10R5 c10r5 = C10R5.LJIIIIZZ;
            String strLJI = C10RS.LIZ().LJI();
            C1386190mAz c1386190mAz = new C1386190mAz();
            c1386190mAz.LIZLLL = this.LLJILJILJ;
            c1386190mAz.LJLILLLLZI = this.LLJILLL;
            c1386190mAz.LLII = this.LLJJI;
            c1386190mAz.LJLJI = strLJI;
            c1386190mAz.LJIILJJIL();
            C10R5 c10r5LIZ = C10RS.LIZ();
            if (c10r5LIZ.LJ) {
                C10R5.LJIIJ.storeBoolean("first_video", false);
                c10r5LIZ.LJ = false;
            }
        }
        LLLLZI().LJIILJJIL(this.LL);
        LLLLZI().LIZ(this);
        C1482640ogY.LJIIIIZZ(this.LL).Dn(new InterfaceC1473950oSX() { // from class: X.11CM
            @Override // X.InterfaceC1473950oSX
            public final void LIZ() {
            }

            @Override // X.InterfaceC1473950oSX
            public final void LLF(int i, int i2) {
            }

            @Override // X.InterfaceC1473950oSX
            public final /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            }

            @Override // X.InterfaceC1473950oSX
            public final void LLILLIZIL(int i, int i2) {
                C1473870oSP c1473870oSP;
                VideoPlayActivity videoPlayActivity = this.LL;
                if (videoPlayActivity.LLILZLL == null) {
                    Video video = new Video();
                    VideoUrlModel videoUrlModel = new VideoUrlModel();
                    videoUrlModel.setCodecType(0);
                    ArrayList arrayList = new ArrayList();
                    C19719612Di.LJJIFFI(arrayList, a0.LJJLIIIJJI(videoPlayActivity.LLIZ, new String[]{","}));
                    videoUrlModel.setUrlList(arrayList);
                    videoUrlModel.setSourceId(videoPlayActivity.LLJ);
                    videoUrlModel.setUrlKey(videoPlayActivity.LLJ);
                    if (videoUrlModel.getUrlList().size() == 1) {
                        videoUrlModel.setUri((String) C13LP.LJJJJZI(videoUrlModel.getUrlList()));
                    }
                    video.setPlayAddr(videoUrlModel);
                    if (!a0.LJJJIL(videoPlayActivity.LLIZLLLIL)) {
                        UrlModel urlModel = new UrlModel();
                        ArrayList arrayList2 = new ArrayList();
                        C19719612Di.LJJIFFI(arrayList2, a0.LJJLIIIJJI(videoPlayActivity.LLIZLLLIL, new String[]{","}));
                        urlModel.setUri((String) C13LP.LJJJLL(arrayList2));
                        urlModel.setUrlList(arrayList2);
                        video.setCover(urlModel);
                    }
                    video.setSourceId(videoPlayActivity.LLJ);
                    videoPlayActivity.LLILZLL = video;
                }
                videoPlayActivity.LLLLZI().LJIIL(videoPlayActivity.LLILZLL);
                if (videoPlayActivity.LLJJ > 0.0f && (c1473870oSP = videoPlayActivity.LL) != null) {
                    C786410Ut5.Q5(c1473870oSP, 0.0f);
                }
            }
        });
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.feed.ui.VideoPlayActivity", "onStart", false);
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

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.feed.ui.VideoPlayActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final VideoViewComponent LLLLZI() {
        return (VideoViewComponent) this.LLILZIL.getValue();
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onPause() {
        if (LLLLZI().LJFF()) {
            LLLLZIL(false);
        }
        super.onPause();
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStop() {
        LLLLZI().H1(this);
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        try {
            getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
    }

    public final void LLLLZIL(boolean z) {
        if (this.LLJIJIL) {
            if (!LLLLZI().LJFF() && this.LLILZLL != null) {
                LLLLZI().LJIIL(this.LLILZLL);
                ImageButton imageButton = this.LLILZ;
                if (imageButton != null) {
                    int visibility = imageButton.getVisibility();
                    imageButton.setVisibility(8);
                    C1602160rnK.LIZIZ(visibility, 8, imageButton);
                }
                this.LLJIJIL = false;
                this.LLJILJIL = false;
                return;
            }
            return;
        }
        if (!LLLLZI().LJFF()) {
            return;
        }
        LLLLZI().pause();
        ImageButton imageButton2 = this.LLILZ;
        if (imageButton2 != null) {
            int visibility2 = imageButton2.getVisibility();
            imageButton2.setVisibility(0);
            C1602160rnK.LIZIZ(visibility2, 0, imageButton2);
        }
        this.LLJIJIL = true;
        if (!z) {
            return;
        }
        this.LLJILJIL = true;
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.feed.ui.VideoPlayActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.bkf);
        this.LL = (C1473870oSP) findViewById(R.id.video_view);
        this.LLILLJJLI = findViewById(R.id.nnp);
        this.LLILLL = (ImageView) findViewById(R.id.e1v);
        this.LLILZ = (ImageButton) findViewById(R.id.q3p);
        ImageView imageView = this.LLILLL;
        if (imageView != null) {
            C786410Ut5.Q7(imageView, new ACListenerS163S0100000_29(this, 312));
        }
        C1473870oSP c1473870oSP = this.LL;
        if (c1473870oSP != null) {
            C786410Ut5.Qa(c1473870oSP, new ACListenerS163S0100000_29(this, 313));
        }
        ImageButton imageButton = this.LLILZ;
        if (imageButton != null) {
            C786410Ut5.P7(imageButton, new ACListenerS163S0100000_29(this, 314));
        }
        String strLLLLLZL = LLLLLZL(getIntent(), "play_addr_string");
        String str = "";
        if (strLLLLLZL == null) {
            strLLLLLZL = "";
        }
        this.LLIZ = strLLLLLZL;
        String strLLLLLZL2 = LLLLLZL(getIntent(), "cover_image_string");
        if (strLLLLLZL2 == null) {
            strLLLLLZL2 = "";
        }
        this.LLIZLLLIL = strLLLLLZL2;
        this.LLJI = getIntent().getBooleanExtra("loop", true);
        String strLLLLLZL3 = LLLLLZL(getIntent(), "video_id");
        if (strLLLLLZL3 == null) {
            strLLLLLZL3 = "";
        }
        this.LLJ = strLLLLLZL3;
        LLLLLZL(getIntent(), "video_md5");
        String strLLLLLZL4 = LLLLLZL(getIntent(), "enter_from");
        if (strLLLLLZL4 == null) {
            strLLLLLZL4 = "";
        }
        this.LLJILJILJ = strLLLLLZL4;
        String strLLLLLZL5 = LLLLLZL(getIntent(), "video_type");
        if (strLLLLLZL5 == null) {
            strLLLLLZL5 = "";
        }
        this.LLJILLL = strLLLLLZL5;
        String strLLLLLZL6 = LLLLLZL(getIntent(), "tag_line");
        if (strLLLLLZL6 != null) {
            str = strLLLLLZL6;
        }
        this.LLJJI = str;
        this.LLJJ = getIntent().getFloatExtra("progress", 0.0f);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.feed.ui.VideoPlayActivity", "onCreate", false);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompletedFirstTime(String str) {
        C1386170mAx c1386170mAx = new C1386170mAx();
        c1386170mAx.LIZLLL = this.LLJILJILJ;
        c1386170mAx.LJJLJLI = this.LLJILLL;
        c1386170mAx.LJIILJJIL();
        if (!this.LLJI) {
            finish();
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayFailed(C1481290oeN c1481290oeN) {
        String string;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("error_code = ");
        if (c1481290oeN != null) {
            string = c1481290oeN.toString();
        } else {
            string = null;
        }
        sbLIZ.append(string);
        C2188811AlT.LIZIZ(sbLIZ);
        View view = this.LLILLJJLI;
        if (view != null) {
            C786410Ut5.LJLLLLLL(0, view);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(C1480420ocy c1480420ocy) {
        View view = this.LLILLJJLI;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        if (this.LLJJ > 0.0f) {
            C1473870oSP c1473870oSP = this.LL;
            if (c1473870oSP != null) {
                C786410Ut5.Q5(c1473870oSP, 1.0f);
            }
            LLLLZI().LJIIIZ(this.LLJJ);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRetryOnError(C1481290oeN c1481290oeN) {
        Integer numValueOf;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("error_code = ");
        if (c1481290oeN != null) {
            numValueOf = Integer.valueOf(c1481290oeN.LJ);
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        boolean z;
        super.setTheme(i);
        if (C299020Bno.LIZ() != 0) {
            boolean z2 = false;
            if (!C1697810uHb.LJIIJJI(Integer.valueOf(R.style.a9t), Integer.valueOf(R.style.a9u), Integer.valueOf(R.style.a9v), Integer.valueOf(R.style.a9s)).contains(Integer.valueOf(i))) {
                Integer numLIZ = C1308910kAL.LIZ(R.attr.g0c, this);
                if (numLIZ != null && numLIZ.intValue() == -1) {
                    z = true;
                } else {
                    z = false;
                }
                Integer numLIZ2 = C1308910kAL.LIZ(R.attr.g0d, this);
                if (numLIZ2 == null || numLIZ2.intValue() != 0) {
                    z2 = true;
                }
                if (z) {
                    getTheme().applyStyle(R.style.a9u, true);
                } else {
                    getTheme().applyStyle(R.style.a9t, true);
                }
                if (z2) {
                    getTheme().applyStyle(R.style.a9v, true);
                } else {
                    getTheme().applyStyle(R.style.a9s, true);
                }
            }
        }
        EnumC335920DEw enumC335920DEwLIZ = C335910DEv.LIZ();
        if (enumC335920DEwLIZ == EnumC335920DEw.V1) {
            getTheme().applyStyle(R.style.a9x, true);
        } else {
            if (enumC335920DEwLIZ != EnumC335920DEw.V2) {
                return;
            }
            getTheme().applyStyle(R.style.a9y, true);
        }
    }

    public static String LLLLLZL(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
