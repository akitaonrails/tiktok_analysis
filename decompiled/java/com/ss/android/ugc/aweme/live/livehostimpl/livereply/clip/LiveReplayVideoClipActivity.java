package com.ss.android.ugc.aweme.live.livehostimpl.livereply.clip;

import X.AbstractActivityC484150Iyj;
import X.AbstractC848400XPy;
import X.C0IK5;
import X.C0TZ2;
import X.C0TZ3;
import X.C0XQ7;
import X.C1113800f5e;
import X.C1119700fFA;
import X.C1161920gLG;
import X.C1290330jgN;
import X.C1300480jwk;
import X.C1305320k4Y;
import X.C1308910kAL;
import X.C13LP;
import X.C1488060opI;
import X.C1697810uHb;
import X.C1765690w35;
import X.C1833990xpF;
import X.C1834240xpe;
import X.C1834730xqR;
import X.C1835950xsP;
import X.C1835970xsR;
import X.C1836130xsh;
import X.C1836140xsi;
import X.C1836150xsj;
import X.C1836160xsk;
import X.C1836170xsl;
import X.C1836200xso;
import X.C1836210xsp;
import X.C1836280xsw;
import X.C1836290xsx;
import X.C1836300xsy;
import X.C1836330xt1;
import X.C1EOY;
import X.C20441214yg;
import X.C20684815ws;
import X.C2095008Iq;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C2409809cO;
import X.C299020Bno;
import X.C335910DEv;
import X.C389001fE;
import X.C465520INi;
import X.C473410IhP;
import X.C494720Jag;
import X.C494730Jah;
import X.C497740JfY;
import X.C755620TkW;
import X.C755630TkX;
import X.C766270U4b;
import X.C782110Um9;
import X.C785230UrB;
import X.C785270UrF;
import X.C785410UrT;
import X.C786410Ut5;
import X.DialogC1390150mHN;
import X.EnumC335920DEw;
import X.EnumC743810TFr;
import X.InterfaceC1488080opK;
import X.InterfaceC1836050xsZ;
import X.InterfaceC1836340xt2;
import X.InterfaceC1836350xt3;
import X.InterfaceC2217461Bqa;
import X.InterfaceC743640TFa;
import Y.ARunnableS112S0100000_12;
import Y.ARunnableS127S0100000_27;
import Y.AcS498S0100000_27;
import Y.AfS10S0100100_27;
import Y.AfS181S0100000_12;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.Window;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.browser.IHybridLegacyStorageService;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.settings.LiveHostReplayEnableOptQueryThumbnails;
import com.bytedance.android.live.settings.LiveHostReplayUISettings;
import com.bytedance.android.livesdk.livesetting.highlight.LiveReplayKeepScreenOnEnableSetting;
import com.bytedance.android.livesdk.livesetting.highlight.LiveReplayVideoPreloadSetting;
import com.bytedance.android.livesdkapi.host.IHostSubscription;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.scene.Scene;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.live.livehostimpl.LiveHostPerformanceMonitor;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.clip.wsmessage.LiveReplyClipFinishedMessage;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.clip.wsmessage.LiveReplySocketMessage;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.clip.wsmessage.LiveReplySpriteMessage;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.video.local.LocalVideoUrlModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS110S1200000_27;
import kotlin.jvm.internal.AwS378S0200000_12;
import kotlin.jvm.internal.AwS393S0200000_27;
import kotlin.jvm.internal.AwS413S0200000_12;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.AwS606S0100000_27;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import tikcast.api.anchor.AnchorLiveFragmentEditResponse;
import tikcast.api.anchor.FrameInfo;

/* JADX INFO: loaded from: classes28.dex */
public final class LiveReplayVideoClipActivity extends AbstractActivityC484150Iyj implements InterfaceC1488080opK, InterfaceC1836350xt3 {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiklPyp9JCw6LCc8OzElJD8/ZiHELIOSklPyohLTUgMGEwJCw8ZwM6PiAeLD8/KTwaICs2JwYgID8SKzElPyYnMQ==";
    public C1835970xsR LL;
    public View LLILLJJLI;
    public C1488060opI LLILLL;
    public C1836290xsx LLILZ;
    public long LLIZLLLIL;
    public int LLJJI;
    public int LLJJIII;
    public int LLJJIJI;
    public C1836330xt1 LLJJIJIL;
    public boolean LLJJJ;
    public TuxTextView LLJJJIL;
    public C1836150xsj LLJJJJ;
    public DialogC1390150mHN LLJJJJJIL;
    public float LLJJJJLIIL;
    public C1836160xsk LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public long LLJLILLLLZIIL;
    public long LLL;
    public long LLLF;
    public long LLLFF;
    public int LLLFFI;
    public String LLLFZ;
    public boolean LLLI;
    public String LLILZIL = "";
    public String LLILZLL = "";
    public String LLIZ = "";
    public long LLJ = LiveHostReplayUISettings.getValue().initialSelectedZoneWithSeconds * 1000;
    public long LLJI = LiveHostReplayUISettings.getValue().screenWithTotalSeconds;
    public final C1836130xsh<Long> LLJIJIL = new C1836130xsh<>(0L);
    public String LLJILJIL = "";
    public String LLJILJILJ = "";
    public String LLJILLL = "";
    public String LLJJ = "";
    public String LLJJIJIIJIL = "replay_clip";
    public final ARunnableS127S0100000_27 LLJJL = new ARunnableS127S0100000_27(this, 19);
    public final List<IHostSubscription.SpriteImage> LLJLIL = new ArrayList();
    public final C1836130xsh<Boolean> LLJLL = new C1836130xsh<>(Boolean.FALSE);
    public final AwS571S0100000_27 LLJLLIL = new AwS571S0100000_27(this, 307);
    public final AwS556S0100000_12 LLJLLL = new AwS556S0100000_12(this, 502);
    public final Map<Pair<Long, Long>, Long> LLJZ = new LinkedHashMap();
    public final Map<Pair<Long, Long>, Long> LLJZIJLIL = new LinkedHashMap();
    public final AwS571S0100000_27 LLLII = new AwS571S0100000_27(this, 304);
    public final AwS571S0100000_27 LLLIIII = new AwS571S0100000_27(this, 305);
    public final AwS591S0100000_12 LLLIIIIL = new AwS591S0100000_12(this, 616);

    @Override // X.InterfaceC1488080opK
    public final void LJII(float f, int i) {
    }

    @Override // X.InterfaceC1488080opK
    public final void LL(String str) {
    }

    @Override // X.InterfaceC1488080opK
    public final void onBufferedPercent(String str, long j, int i) {
    }

    @Override // X.InterfaceC1488080opK
    public final void onPausePlay(String str) {
    }

    @Override // X.InterfaceC1488080opK
    public final void onPlayProgressChange(float f) {
    }

    @Override // X.InterfaceC1488080opK
    public final void onResumePlay(String str) {
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.livehostimpl.livereply.clip.LiveReplayVideoClipActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.livehostimpl.livereply.clip.LiveReplayVideoClipActivity", "onStart", false);
    }

    @Override // X.InterfaceC1488080opK
    public final void onVideoSizeChanged(String str, int i, int i2) {
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.livehostimpl.livereply.clip.LiveReplayVideoClipActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final C2344009Gk LLLLZLLIL() {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("anchor_id", this.LLLFZ);
        c2344009Gk.LJIIIIZZ("room_id", this.LLIZ);
        c2344009Gk.LJIIIIZZ("enter_from_page", this.LLJILJIL);
        c2344009Gk.LJIIIIZZ("enter_from", this.LLJILJILJ);
        c2344009Gk.LJIIIIZZ("last_page", this.LLJILLL);
        c2344009Gk.LJIIIIZZ("event_page", "replay_clip");
        c2344009Gk.LJIIIIZZ(Scene.SCENE_SERVICE, "replay_edit");
        c2344009Gk.LJIIIIZZ("replay_type", this.LLJJI == 1 ? "highlight" : "normal");
        c2344009Gk.LIZLLL(this.LLJIJIL.LIZIZ.longValue(), "video_duration");
        c2344009Gk.LIZJ((int) (this.LLJIJIL.LIZIZ.longValue() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)), "total_duration");
        c2344009Gk.LJIIIIZZ("click_position", this.LLJJ);
        c2344009Gk.LJIIIIZZ("access_identity", C1834240xpe.LIZJ(this.LLLFFI));
        if (this.LLLFFI != 0) {
            c2344009Gk.LJFF("viewer_user_id", ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        }
        return c2344009Gk;
    }

    public final void LLLLZLLLI() {
        String strLIZIZ;
        Video video = new Video();
        if (!LiveReplayVideoPreloadSetting.INSTANCE.isEnable() || this.LLILZLL.length() <= 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("live_replay_video_");
            sbLIZ.append(this.LLILZIL);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            strLIZIZ = this.LLILZLL;
        }
        LocalVideoUrlModel localVideoUrlModel = new LocalVideoUrlModel();
        localVideoUrlModel.setSourceId(strLIZIZ);
        localVideoUrlModel.setUrlKey(strLIZIZ);
        localVideoUrlModel.setUrlList(new ArrayList());
        localVideoUrlModel.getUrlList().add(this.LLILZIL);
        video.setPlayAddr(localVideoUrlModel);
        C1488060opI c1488060opI = this.LLILLL;
        (c1488060opI == null ? null : c1488060opI).LIZLLL = video;
        (c1488060opI == null ? null : c1488060opI).LJ = "replay_video";
        if (c1488060opI == null) {
            c1488060opI = null;
        }
        ((ArrayList) c1488060opI.LJIILJJIL).add(this);
        new C1834730xqR();
        C1834730xqR c1834730xqR = new C1834730xqR();
        C1488060opI c1488060opI2 = this.LLILLL;
        if (c1488060opI2 == null) {
            c1488060opI2 = null;
        }
        c1834730xqR.LIZ = c1488060opI2;
        c1834730xqR.LIZIZ = getWindow();
        c1834730xqR.LIZJ = this.LLJIJIL.LIZIZ;
        C1835970xsR c1835970xsR = this.LL;
        if (c1835970xsR == null) {
            c1835970xsR = null;
        }
        c1835970xsR.setParams(c1834730xqR);
        C1835970xsR c1835970xsR2 = this.LL;
        (c1835970xsR2 != null ? c1835970xsR2 : null).LJIIIZ(0.0f, true);
        C20684815ws.LJIILLIIL("livesdk_video_request", LLLLZLLIL().LIZ);
        this.LLJLILLLLZIIL = System.currentTimeMillis();
    }

    @Override // X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        this.LLJLLIL.invoke();
    }

    @Override // X.AbstractActivityC484150Iyj, com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.livehostimpl.livereply.clip.LiveReplayVideoClipActivity", "onResume", true);
        super.onResume();
        if (this.LLLI) {
            C1EOY c1eoy = C1EOY.LIZ;
            c1eoy.LJJI();
            C1EOY.LJIILJJIL = "replay_video_edit_period";
            c1eoy.LJIILLIIL();
        }
        C465520INi.LIZ.o41("replay_clip");
        C1833990xpF.LIZLLL("replay_clip");
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.livehostimpl.livereply.clip.LiveReplayVideoClipActivity", "onResume", false);
    }

    @Override // X.AbstractActivityC484150Iyj, com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        Window window;
        super.onDestroy();
        C465520INi.LIZ.qu1();
        C1833990xpF.LIZIZ(this.LLIZ, "replay_clip");
        if (!this.LLJJJ) {
            C2344009Gk c2344009GkLLLLZLLIL = LLLLZLLIL();
            c2344009GkLLLLZLLIL.LJIIIIZZ("cancel_type", "leave_page");
            C20684815ws.LJIILLIIL("livesdk_video_play_cancel", c2344009GkLLLLZLLIL.LIZ);
        }
        C389001fE.LIZ("onLiveReplayVideoClipActivityDestroy", new JSONObject(), System.currentTimeMillis(), false);
        DialogC1390150mHN dialogC1390150mHN = this.LLJJJJJIL;
        if (dialogC1390150mHN != null) {
            dialogC1390150mHN.dismiss();
            C785410UrT.LIZ(dialogC1390150mHN);
        }
        C0IK5.LIZLLL(this.LLJJL);
        this.LLJJJJLIIL = 0.0f;
        this.LLJJJJJIL = null;
        if (LiveReplayKeepScreenOnEnableSetting.INSTANCE.enable() && (window = getWindow()) != null) {
            window.clearFlags(128);
        }
        C1836300xsy.LIZ().LIZ.LJ(this);
        C1836150xsj c1836150xsj = this.LLJJJJ;
        C1836150xsj c1836150xsj2 = c1836150xsj != null ? c1836150xsj : null;
        c1836150xsj2.LJIJ.removeCallbacks(new ARunnableS112S0100000_12(c1836150xsj2.LJJIIZ, 205));
        ((LinkedHashMap) c1836150xsj2.LJJ).clear();
        C1290330jgN c1290330jgN = c1836150xsj2.LJIILIIL;
        if (c1290330jgN != null) {
            c1290330jgN.LJI.evictAll();
        }
    }

    @Override // X.AbstractActivityC484150Iyj, com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onPause() {
        super.onPause();
        C1833990xpF.LIZJ("replay_clip");
        C473410IhP.LJ(new ARunnableS112S0100000_12(this, 200));
        if (!this.LLLI) {
            C1EOY c1eoy = C1EOY.LIZ;
            C1300480jwk c1300480jwkLIZIZ = c1eoy.LIZIZ("replay_video_edit_enter");
            if (c1300480jwkLIZIZ != null) {
                c1300480jwkLIZIZ.stop();
            }
            c1eoy.LJJI();
            C1EOY.LJIILJJIL = "replay_video_edit_period";
            c1eoy.LJIILLIIL();
        }
        this.LLLI = true;
        C1EOY.LIZ.LJII();
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStop() {
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

    @Override // X.InterfaceC1836350xt3
    public final void LLLFFI(LiveReplySocketMessage liveReplySocketMessage) {
        DialogC1390150mHN dialogC1390150mHN;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onReceiveMsg:");
        sbLIZ.append(liveReplySocketMessage);
        C20441214yg.LIZIZ("LiveReplayVideoClip", C2188811AlT.LIZIZ(sbLIZ));
        if (liveReplySocketMessage instanceof LiveReplySpriteMessage) {
            C1836150xsj c1836150xsj = this.LLJJJJ;
            if (c1836150xsj == null) {
                c1836150xsj = null;
            }
            LiveReplySpriteMessage liveReplySpriteMessage = (LiveReplySpriteMessage) liveReplySocketMessage;
            long startTime = liveReplySpriteMessage.getStartTime();
            long endTime = liveReplySpriteMessage.getEndTime();
            List<FrameInfo> frameList = liveReplySpriteMessage.getFrameList();
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C1836150xsj.LJJJJ;
            c1836150xsj.LJ(frameList, startTime, endTime, true);
            return;
        }
        if (!(liveReplySocketMessage instanceof LiveReplyClipFinishedMessage)) {
            return;
        }
        Iterator it2 = ((LinkedHashMap) this.LLJZ).entrySet().iterator();
        while (it2.hasNext()) {
            if (((Number) ((Map.Entry) it2.next()).getValue()).longValue() == ((LiveReplyClipFinishedMessage) liveReplySocketMessage).getFragmentId()) {
                return;
            }
        }
        Iterator it3 = ((LinkedHashMap) this.LLJZIJLIL).entrySet().iterator();
        while (it3.hasNext()) {
            LiveReplyClipFinishedMessage liveReplyClipFinishedMessage = (LiveReplyClipFinishedMessage) liveReplySocketMessage;
            if (((Number) ((Map.Entry) it3.next()).getValue()).longValue() == liveReplyClipFinishedMessage.getFragmentId()) {
                if (this.LLJJJJLIIL < 20.0f && (dialogC1390150mHN = this.LLJJJJJIL) != null) {
                    dialogC1390150mHN.LJJLL(20.0f, false);
                }
                this.LLJJJJLIIL = 0.0f;
                C0IK5.LIZLLL(this.LLJJL);
                long fragmentId = liveReplyClipFinishedMessage.getFragmentId();
                ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).getLiveReplayFragment(fragmentId).LJJLL(new C1836140xsi(this, fragmentId), new AfS10S0100100_27(this, fragmentId, 5));
                return;
            }
        }
    }

    public final void LLLLZIL(long j) {
        long j2 = this.LLJ;
        long j3 = LSPassThroughRecordSizeConfig.DEFAULT;
        long jMax = Math.max(j2 / j3, this.LLJI);
        this.LLJI = jMax;
        long jMin = Math.min(j / j3, jMax);
        this.LLJI = jMin;
        if (jMin < LiveHostReplayUISettings.getValue().minScreenWithTotalSeconds) {
            this.LLJI = ((long) Math.ceil((this.LLJI / LiveHostReplayUISettings.getValue().picNumInScreen) / 5)) * ((long) 5) * ((long) LiveHostReplayUISettings.getValue().picNumInScreen);
        }
    }

    public final void LLLZ(long j) {
        long jLongValue;
        C20441214yg.LIZIZ("LiveReplayVideoClip", "postingRecord key removed");
        this.LLJL = false;
        C1835970xsR c1835970xsR = this.LL;
        String str = null;
        if (c1835970xsR == null) {
            c1835970xsR = null;
        }
        c1835970xsR.LIZLLL();
        if (!((Boolean) this.LLJLLL.invoke()).booleanValue() && this.LLLFFI == 0) {
            C1836170xsl c1836170xsl = C1836170xsl.LIZ;
            AwS571S0100000_27 awS571S0100000_27 = new AwS571S0100000_27(this, 306);
            c1836170xsl.getClass();
            C782110Um9 c782110Um9 = new C782110Um9(this);
            c782110Um9.LJIIIZ(C497740JfY.LJIJI(2131843962));
            C494720Jag c494720Jag = new C494720Jag();
            C755620TkW c755620TkW = new C755620TkW();
            c755620TkW.LIZ = C497740JfY.LJIJI(2131843969);
            c755620TkW.LIZJ = new AcS498S0100000_27(awS571S0100000_27, 11);
            c494720Jag.LIZ(new C0TZ2(c755620TkW));
            C755630TkX c755630TkX = new C755630TkX();
            c755630TkX.LIZ = C497740JfY.LJIJI(2131843936);
            c755630TkX.LIZJ = new InterfaceC743640TFa() { // from class: X.0xt0
                @Override // X.InterfaceC743640TFa
                public final void LIZ(LiveDialog liveDialog) {
                    liveDialog.dismiss();
                }
            };
            c494720Jag.LIZ(new C0TZ3(c755630TkX));
            c494720Jag.LIZIZ = 2;
            c782110Um9.LIZJ(new C494730Jah(c494720Jag));
            c782110Um9.LJIILLIIL = false;
            c782110Um9.LJIILL = false;
            C786410Ut5.E4(c782110Um9.LIZ());
        } else {
            LLZLI("1", "1");
        }
        if ((!this.LLJZIJLIL.isEmpty()) && this.LLJZIJLIL.size() == 1) {
            jLongValue = ((Number) C13LP.LJJJJZ(((LinkedHashMap) this.LLJZIJLIL).values())).longValue();
        } else {
            jLongValue = 0;
        }
        C1836170xsl c1836170xsl2 = C1836170xsl.LIZ;
        String strValueOf = String.valueOf(jLongValue);
        C1836330xt1 c1836330xt1 = this.LLJJIJIL;
        if (c1836330xt1 != null) {
            str = c1836330xt1.LIZ;
        }
        c1836170xsl2.getClass();
        C1836170xsl.LIZIZ(-1, "termination", "cancel", strValueOf, str);
        C2344009Gk c2344009GkLLLLZLLIL = LLLLZLLIL();
        c2344009GkLLLLZLLIL.LIZLLL(j, "duration");
        c2344009GkLLLLZLLIL.LIZLLL(jLongValue, "clip_id");
        C20684815ws.LJIILLIIL("livesdk_live_replay_clip_post_cancel", c2344009GkLLLLZLLIL.LIZ);
        ((LinkedHashMap) this.LLJZIJLIL).clear();
    }

    public final void LLLZIL(EnumC743810TFr enumC743810TFr) {
        String str;
        Pair<Long, Long> pair = (Pair) this.LLLIIII.invoke();
        long jLongValue = pair.getFirst().longValue();
        long jLongValue2 = pair.getSecond().longValue();
        if (enumC743810TFr != EnumC743810TFr.SAVE) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        if (((Boolean) this.LLJLLL.invoke()).booleanValue()) {
            LLZLI("1", str);
            C766270U4b.LJIIJJI(getString(2131843961));
        } else {
            this.LLJZ.put(pair, 0L);
            LLLLZLL(jLongValue, jLongValue2, 1, new AwS110S1200000_27(this, (LiveReplayVideoClipActivity) pair, (Pair<Long, Long>) str, (String) 2), new AwS393S0200000_27(this, (LiveReplayVideoClipActivity) pair, (Pair<Long, Long>) 33));
        }
    }

    public final AwS571S0100000_27 LLLZLZ(String str) {
        String str2;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("anchor_id", this.LLLFZ);
        c2344009Gk.LJIIIIZZ("room_id", this.LLIZ);
        c2344009Gk.LJIIIIZZ("action_type", str);
        if (this.LLJJI == 1) {
            str2 = "highlight_clip";
        } else {
            str2 = "clip";
        }
        c2344009Gk.LJIIIIZZ("popup_type", str2);
        return new AwS571S0100000_27(c2344009Gk, 1121);
    }

    public final AwS571S0100000_27 LLLZZIL(String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("room_id", this.LLIZ);
        c2344009Gk.LJIIIIZZ("anchor_id", this.LLLFZ);
        c2344009Gk.LJIIIIZZ("action_type", str);
        return new AwS571S0100000_27(c2344009Gk.LIZ, (Map<String, String>) 1122);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LLZ(String str) {
        Pair pair = (Pair) this.LLLIIII.invoke();
        long jLongValue = ((Number) pair.getFirst()).longValue();
        long jLongValue2 = ((Number) pair.getSecond()).longValue();
        C2344009Gk c2344009GkLLLLZLLIL = LLLLZLLIL();
        c2344009GkLLLLZLLIL.LIZLLL(jLongValue2 - jLongValue, "duration");
        C1836150xsj c1836150xsj = this.LLJJJJ;
        C1836150xsj c1836150xsj2 = null;
        if (c1836150xsj == null) {
            c1836150xsj = null;
        }
        C1836130xsh c1836130xsh = c1836150xsj.LJJIJL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C1836150xsj.LJJJJ;
        c2344009GkLLLLZLLIL.LIZJ(((Number) c1836130xsh.LIZIZ).intValue(), "block_cnt");
        C1836160xsk c1836160xsk = this.LLJJLIIIJLLLLLLLZ;
        if (c1836160xsk == null) {
            c1836160xsk = null;
        }
        c2344009GkLLLLZLLIL.LIZJ(c1836160xsk.getHandleCount(), "handle_cnt");
        C1836150xsj c1836150xsj3 = this.LLJJJJ;
        if (c1836150xsj3 != null) {
            c1836150xsj2 = c1836150xsj3;
        }
        c2344009GkLLLLZLLIL.LIZJ(((Number) c1836150xsj2.LJJIL.LIZIZ).intValue(), "move_cnt");
        c2344009GkLLLLZLLIL.LJIIIIZZ("exit_type", str);
        C20684815ws.LJIILLIIL("livesdk_live_replay_clip_drag", c2344009GkLLLLZLLIL.LIZ);
    }

    @Override // X.InterfaceC1488080opK
    public final void onBuffering(boolean z) {
        if (z) {
            this.LLLF = System.currentTimeMillis();
            return;
        }
        C2344009Gk c2344009GkLLLLZLLIL = LLLLZLLIL();
        c2344009GkLLLLZLLIL.LIZLLL(System.currentTimeMillis() - this.LLLF, "duration");
        c2344009GkLLLLZLLIL.LIZJ(1, "block_type");
        C20684815ws.LJIILLIIL("livesdk_video_block", c2344009GkLLLLZLLIL.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:152:0x0598  */
    @Override // X.AbstractActivityC484150Iyj, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r32) {
        /*
            Method dump skipped, instruction units count: 1515
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.live.livehostimpl.livereply.clip.LiveReplayVideoClipActivity.onCreate(android.os.Bundle):void");
    }

    @Override // X.InterfaceC1488080opK
    public final void onDecoderBuffering(boolean z) {
        if (z) {
            this.LLLFF = System.currentTimeMillis();
            return;
        }
        C2344009Gk c2344009GkLLLLZLLIL = LLLLZLLIL();
        c2344009GkLLLLZLLIL.LIZLLL(System.currentTimeMillis() - this.LLLFF, "duration");
        c2344009GkLLLLZLLIL.LIZJ(2, "block_type");
        C20684815ws.LJIILLIIL("livesdk_video_block", c2344009GkLLLLZLLIL.LIZ);
    }

    @Override // X.InterfaceC1488080opK
    public final void onPlayCompleted(String str) {
        C20684815ws.LJIILLIIL("livesdk_video_play_end", LLLLZLLIL().LIZ);
    }

    @Override // X.InterfaceC1488080opK
    public final void onPreparePlay(String str) {
        C2344009Gk c2344009GkLLLLZLLIL = LLLLZLLIL();
        c2344009GkLLLLZLLIL.LIZLLL(System.currentTimeMillis() - this.LLJLILLLLZIIL, "duration");
        C20684815ws.LJIILLIIL("livesdk_video_prepare", c2344009GkLLLLZLLIL.LIZ);
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

    public final void tryShowBubbleView(View view) {
        if (!Intrinsics.LJFF(((IHybridLegacyStorageService) C1161920gLG.LIZJ(IHybridLegacyStorageService.class)).M41(view.getContext(), "show_capcut_guidance_tip"), "1")) {
            ((IHybridLegacyStorageService) C1161920gLG.LIZJ(IHybridLegacyStorageService.class)).au0(view.getContext(), "show_capcut_guidance_tip");
            C785230UrB c785230UrB = new C785230UrB(view);
            c785230UrB.LIZLLL(2131852049);
            C785270UrF c785270UrF = new C785270UrF(c785230UrB);
            C1113800f5e c1113800f5e = C1113800f5e.LIZ;
            C1119700fFA.LIZIZ(c785270UrF);
        }
    }

    public static String LLLLZI(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // X.InterfaceC1488080opK
    public final void LLJJIJIL(int i, String str) {
        C2344009Gk c2344009GkLLLLZLLIL = LLLLZLLIL();
        c2344009GkLLLLZLLIL.LIZJ(i, "errorCode");
        c2344009GkLLLLZLLIL.LJIIIIZZ("errorDomain", str);
        C20684815ws.LJIILLIIL("livesdk_video_play_failed", c2344009GkLLLLZLLIL.LIZ);
    }

    public final void LLZLI(String str, String str2) {
        Pair pair = (Pair) this.LLLIIII.invoke();
        long jLongValue = ((Number) pair.getFirst()).longValue();
        long jLongValue2 = ((Number) pair.getSecond()).longValue();
        C2344009Gk c2344009GkLLLLZLLIL = LLLLZLLIL();
        c2344009GkLLLLZLLIL.LIZLLL(jLongValue, "start_time");
        c2344009GkLLLLZLLIL.LIZLLL(jLongValue2 - jLongValue, "duration");
        c2344009GkLLLLZLLIL.LJIIIIZZ("is_same_clip", str);
        c2344009GkLLLLZLLIL.LJIIIIZZ("is_post_cancel", str2);
        C20684815ws.LJIILLIIL("livesdk_live_replay_clip_save_click", c2344009GkLLLLZLLIL.LIZ);
    }

    @Override // X.InterfaceC1488080opK
    public final void LLLIZZ(int i, int i2, long j) {
        boolean z;
        C1836150xsj c1836150xsj;
        C1836150xsj c1836150xsj2;
        this.LLJJJ = true;
        long jLongValue = this.LLJIJIL.LIZIZ.longValue();
        this.LLJIJIL.LIZJ(Long.valueOf(j));
        this.LLJ = getIntent().getLongExtra("initialDurationMS", LiveHostReplayUISettings.getValue().initialSelectedZoneWithSeconds * 1000);
        TuxTextView tuxTextView = this.LLJJJIL;
        Float fValueOf = null;
        if (tuxTextView == null) {
            tuxTextView = null;
        }
        tuxTextView.setText(C1765690w35.LIZ((int) (j / 1000.0f)));
        if (this.LLIZLLLIL + this.LLJ > j) {
            this.LLJ = this.LLJIJIL.LIZIZ.longValue() - this.LLIZLLLIL;
        }
        if (jLongValue != j) {
            this.LLJI = LiveHostReplayUISettings.getValue().screenWithTotalSeconds;
        }
        LLLLZIL(j);
        C1835970xsR c1835970xsR = this.LL;
        if (c1835970xsR == null) {
            c1835970xsR = null;
        }
        c1835970xsR.setVideoLength$live_release(j);
        boolean zBooleanValue = this.LLJLL.LIZIZ.booleanValue();
        C1836130xsh<Boolean> c1836130xsh = this.LLJLL;
        if (i > i2) {
            z = true;
        } else {
            z = false;
        }
        c1836130xsh.LIZJ(Boolean.valueOf(z));
        if (zBooleanValue == this.LLJLL.LIZIZ.booleanValue()) {
            this.LLJLL.LIZ();
        }
        C1836160xsk c1836160xsk = this.LLJJLIIIJLLLLLLLZ;
        if (c1836160xsk == null) {
            c1836160xsk = null;
        }
        c1836160xsk.setStart(true);
        C1836290xsx c1836290xsx = this.LLILZ;
        if (c1836290xsx == null) {
            c1836290xsx = null;
        }
        c1836290xsx.setStart(true);
        C1836150xsj c1836150xsj3 = this.LLJJJJ;
        if (c1836150xsj3 == null) {
            c1836150xsj = null;
        } else {
            c1836150xsj = c1836150xsj3;
        }
        c1836150xsj.LJ = this.LLJ;
        if (c1836150xsj3 == null) {
            c1836150xsj3 = null;
        }
        c1836150xsj3.LJFF = (int) this.LLJI;
        this.LLJLL.LIZ();
        final C1836150xsj c1836150xsj4 = this.LLJJJJ;
        if (c1836150xsj4 == null) {
            c1836150xsj2 = null;
        } else {
            c1836150xsj2 = c1836150xsj4;
        }
        c1836150xsj2.LJIIIIZZ = true;
        if (c1836150xsj4 == null) {
            c1836150xsj4 = null;
        }
        c1836150xsj4.LIZ();
        c1836150xsj4.LJFF();
        C1836280xsw.LIZIZ(c1836150xsj4.LJIILLIIL, new AwS606S0100000_27(c1836150xsj4, 601));
        C1836290xsx c1836290xsx2 = c1836150xsj4.LJIIL;
        if (c1836290xsx2 == null) {
            c1836290xsx2 = null;
        }
        c1836290xsx2.setMotionEventMoveListener(new InterfaceC1836340xt2() { // from class: X.0xsn
            @Override // X.InterfaceC1836340xt2
            public final void LIZ(float f) {
                if (c1836150xsj4.LJIJJ.LIZIZ.intValue() <= 0) {
                    return;
                }
                if (!C1835950xsP.LIZIZ(c1836150xsj4.LIZ)) {
                    f = 1 - f;
                }
                C1836150xsj c1836150xsj5 = c1836150xsj4;
                float fFloatValue = (f - c1836150xsj5.LJJIJLIJ) * c1836150xsj5.LJIJJ.LIZIZ.floatValue();
                C1836160xsk c1836160xsk2 = c1836150xsj4.LJJIFFI;
                RecyclerView recyclerView = null;
                if (c1836160xsk2 == null) {
                    c1836160xsk2 = null;
                }
                c1836160xsk2.getPlayHeadCenterX().LIZ();
                c1836150xsj4.LJJIJIL.invoke(Float.valueOf(f));
                if (Math.abs(fFloatValue) > 0.4f) {
                    RecyclerView recyclerView2 = c1836150xsj4.LJJII;
                    if (recyclerView2 != null) {
                        recyclerView = recyclerView2;
                    }
                    int iLIZIZ = C814420VxA.LIZIZ(fFloatValue);
                    if (!C1835950xsP.LIZIZ(c1836150xsj4.LIZ)) {
                        iLIZIZ = -iLIZIZ;
                    }
                    recyclerView.scrollBy(iLIZIZ, 0);
                }
            }
        });
        C1836290xsx c1836290xsx3 = c1836150xsj4.LJIIL;
        if (c1836290xsx3 == null) {
            c1836290xsx3 = null;
        }
        C1836280xsw.LIZIZ(c1836290xsx3.getScrolling(), new AwS606S0100000_27(c1836150xsj4, 598));
        if (c1836150xsj4.LIZIZ() || LiveHostReplayEnableOptQueryThumbnails.getValue()) {
            c1836150xsj4.LIZJ();
        } else {
            C1836200xso c1836200xso = c1836150xsj4.LJIJI.LIZIZ;
            int i3 = c1836200xso.LIZJ / c1836200xso.LIZLLL;
            int size = c1836150xsj4.LJIJJLI.LIZIZ.size();
            if (i3 != 0 && size % i3 > 0) {
                size++;
            }
            boolean[] zArr = new boolean[size];
            for (int i4 = 0; i4 < size; i4++) {
                zArr[i4] = true;
            }
            AwS413S0200000_12 awS413S0200000_12 = new AwS413S0200000_12(c1836150xsj4, zArr, 70);
            awS413S0200000_12.invoke();
            C1836210xsp c1836210xsp = c1836150xsj4.LJJI;
            if (c1836210xsp == null) {
                c1836210xsp = null;
            }
            C1836280xsw.LIZIZ(c1836210xsp.LL, new AwS378S0200000_12(c1836150xsj4, awS413S0200000_12, 102));
        }
        C1836210xsp c1836210xsp2 = c1836150xsj4.LJJI;
        if (c1836210xsp2 == null) {
            c1836210xsp2 = null;
        }
        C1836280xsw.LIZIZ(c1836210xsp2.LL, new AwS606S0100000_27(c1836150xsj4, 600));
        C1836210xsp c1836210xsp3 = c1836150xsj4.LJJI;
        if (c1836210xsp3 == null) {
            c1836210xsp3 = null;
        }
        C1836280xsw.LIZIZ(c1836210xsp3.LLILZ, new AwS393S0200000_27(c1836210xsp3, c1836150xsj4, 142));
        c1836150xsj4.LJI();
        if (c1836150xsj4.LIZLLL != 0) {
            long jLongValue2 = c1836150xsj4.LIZIZ.LIZIZ.longValue();
            long j2 = LSPassThroughRecordSizeConfig.DEFAULT;
            long j3 = jLongValue2 / j2;
            long j4 = c1836150xsj4.LIZLLL / j2;
            C1836200xso c1836200xso2 = c1836150xsj4.LJIJI.LIZIZ;
            RecyclerView recyclerView = c1836150xsj4.LJJII;
            if (recyclerView == null) {
                recyclerView = null;
            }
            float f = j4;
            float f2 = c1836200xso2.LJIIJ * f;
            if (!C1835950xsP.LIZIZ(c1836150xsj4.LIZ)) {
                f2 = -f2;
            }
            recyclerView.scrollBy((int) f2, 0);
            C1836160xsk c1836160xsk2 = c1836150xsj4.LJJIFFI;
            if (c1836160xsk2 == null) {
                c1836160xsk2 = null;
            }
            c1836160xsk2.getPlayHeadToStart().invoke();
            long j5 = c1836200xso2.LIZJ;
            if (j3 < j5) {
                C1836160xsk c1836160xsk3 = c1836150xsj4.LJJIFFI;
                if (c1836160xsk3 == null) {
                    c1836160xsk3 = null;
                }
                c1836160xsk3.LIZIZ(c1836200xso2.LJIIJ * f);
                C1836160xsk c1836160xsk4 = c1836150xsj4.LJJIFFI;
                if (c1836160xsk4 == null) {
                    c1836160xsk4 = null;
                }
                c1836160xsk4.LIZJ(c1836200xso2.LJIIJ * f);
            } else {
                long j6 = j3 - j5;
                if (j4 > j6) {
                    long j7 = j4 - j6;
                    C1836160xsk c1836160xsk5 = c1836150xsj4.LJJIFFI;
                    if (c1836160xsk5 == null) {
                        c1836160xsk5 = null;
                    }
                    c1836160xsk5.LIZIZ(j7 * c1836200xso2.LJIIJ);
                    long j8 = c1836200xso2.LIZJ - c1836200xso2.LJII;
                    if (j7 > j8) {
                        long j9 = j7 - j8;
                        if (j9 > 0) {
                            C1836160xsk c1836160xsk6 = c1836150xsj4.LJJIFFI;
                            if (c1836160xsk6 == null) {
                                c1836160xsk6 = null;
                            }
                            c1836160xsk6.LIZJ(j9 * c1836200xso2.LJIIJ);
                        }
                    }
                }
            }
            c1836150xsj4.LJJIJIIJIL.invoke();
            if (c1836150xsj4.LJIJJ.LIZIZ.intValue() > 0) {
                c1836150xsj4.LJJIJIL.invoke(Float.valueOf((f * c1836200xso2.LJIIJ) / c1836150xsj4.LJIJJ.LIZIZ.intValue()));
            }
        }
        C1836160xsk c1836160xsk7 = c1836150xsj4.LJJIFFI;
        if (c1836160xsk7 == null) {
            c1836160xsk7 = null;
        }
        C1836280xsw.LIZIZ(c1836160xsk7.getPlayHeadCenterX(), new AwS606S0100000_27(c1836150xsj4, 599));
        C2344009Gk c2344009GkLLLLZLLIL = LLLLZLLIL();
        C1835970xsR c1835970xsR2 = this.LL;
        if (c1835970xsR2 == null) {
            c1835970xsR2 = null;
        }
        InterfaceC1836050xsZ player$live_release = c1835970xsR2.getPlayer$live_release();
        if (player$live_release != null) {
            fValueOf = Float.valueOf(player$live_release.getBitrate());
        }
        c2344009GkLLLLZLLIL.LJ(fValueOf, "play_bitrate");
        c2344009GkLLLLZLLIL.LIZLLL(System.currentTimeMillis() - this.LLL, "duration");
        c2344009GkLLLLZLLIL.LIZ(((Number) C2097608Jq.LJFF("cpu_speed", new LiveHostPerformanceMonitor().getCpuRate())).doubleValue(), "cpu_speed");
        Context applicationContext = getApplicationContext();
        if (C2409809cO.LIZIZ && applicationContext == null) {
            applicationContext = C2409809cO.LIZ;
        }
        c2344009GkLLLLZLLIL.LIZJ(C1305320k4Y.LJ(applicationContext), "cpu_cores");
        C20684815ws.LJIILLIIL("livesdk_video_play_quality", c2344009GkLLLLZLLIL.LIZ);
    }

    public final void LLLLZLL(long j, long j2, int i, Function1<? super AnchorLiveFragmentEditResponse, Unit> function1, Function1<? super Throwable, Unit> function12) {
        Long lLJIILIIL = C2095008Iq.LJIILIIL(this.LLIZ);
        if (lLJIILIIL != null) {
            long jLongValue = lLJIILIIL.longValue();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("clipOrSaveLiveReplayFragment, roomId:");
            sbLIZ.append(jLongValue);
            C20441214yg.LIZIZ("LiveReplayVideoClip", C2188811AlT.LIZIZ(sbLIZ));
            ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).clipOrSaveLiveReplayFragment(jLongValue, j, j2, i).LJJLL(new AfS181S0100000_12(function1, 130), new AfS181S0100000_12(function12, 131));
        }
    }
}
