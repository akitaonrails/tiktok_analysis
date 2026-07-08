package com.ss.android.ugc.aweme.ecommerce.ug.trending.list.card.video.view;

import X.C1309620kBU;
import X.C1326790kdB;
import X.C1331670kl3;
import X.C13LP;
import X.C1484770ojz;
import X.C1742820vSC;
import X.C1742870vSH;
import X.C1742910vSL;
import X.C1748170vap;
import X.C1748180vaq;
import X.C1748200vas;
import X.C1748250vax;
import X.C1748720vbi;
import X.C1748730vbj;
import X.C1776220wK4;
import X.C2188811AlT;
import X.C2211751BhN;
import X.C426200GnS;
import X.C429820GtI;
import X.C626070Oh3;
import X.C626080Oh4;
import X.C631370Opb;
import X.C723830SaL;
import X.C786410Ut5;
import X.InterfaceC1482530ogN;
import X.InterfaceC1483820oiS;
import X.InterfaceC1484830ok5;
import X.InterfaceC1748860vbw;
import Y.ACListenerS128S0200000_26;
import Y.ACListenerS160S0100000_26;
import Y.ARunnableS104S0100000_4;
import Y.ARunnableS92S0200000_23;
import android.os.SystemClock;
import android.view.Surface;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.ecommerce.ug.trending.list.card.common.ECTrendingBaseReusedAssem;
import com.ss.android.ugc.aweme.ecommerce.ug.trending.settings.EcTrendingOptBean;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes27.dex */
public final class ECTrendingVideoAssem extends ECTrendingBaseReusedAssem<ECTrendingVideoAssem, C1742870vSH> {
    public C1742870vSH LLJLIL;
    public C1748200vas LLJLILLLLZIIL;
    public FrameLayout LLJLL;
    public C426200GnS LLJLLIL;
    public SmartImageView LLJLLL;
    public C429820GtI LLJZ;
    public C626070Oh3 LLJZIJLIL;
    public View LLL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.bt5;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        SmartImageView smartImageView = this.LLJLLL;
        if (smartImageView != null) {
            C786410Ut5.LLFF(0, smartImageView);
        }
        op().wQ2().pause();
    }

    @Override // X.InterfaceC1742830vSD
    public final void LJIILLIIL() {
        op().wQ2().resume();
        C626070Oh3 c626070Oh3 = this.LLJZIJLIL;
        if (c626070Oh3 != null) {
            c626070Oh3.setMuteIconVisible(true);
        }
        C1748720vbi.LIZLLL(LJJIJL(), new C1748180vaq(), new AwS605S0100000_26(this, 294));
    }

    @Override // X.InterfaceC1742830vSD
    public final void pause() {
        op().wQ2().pause();
        C1742870vSH c1742870vSH = this.LLJLIL;
        if (c1742870vSH != null) {
            tp(c1742870vSH);
        }
        C626070Oh3 c626070Oh3 = this.LLJZIJLIL;
        if (c626070Oh3 != null) {
            c626070Oh3.setMuteIconVisible(false);
        }
        C1748720vbi.LIZLLL(LJJIJL(), new C1748170vap(), new AwS605S0100000_26(this, 289));
    }

    @Override // X.InterfaceC1742830vSD
    public final void play() {
        Aweme aweme;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("video play： ");
        sbLIZ.append(C631370Opb.LIZIZ(this));
        C2188811AlT.LIZIZ(sbLIZ);
        C1309620kBU.LIZ("ECTrendingVideoAssem");
        C626070Oh3 c626070Oh3 = this.LLJZIJLIL;
        if (c626070Oh3 != null) {
            c626070Oh3.setMuteIconVisible(true);
        }
        InterfaceC1483820oiS interfaceC1483820oiS = new InterfaceC1483820oiS() { // from class: X.0vau
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
            public final boolean bn() {
                if (!Intrinsics.LJFF(((EcTrendingOptBean) C1748250vax.LIZIZ.getValue()).enableTextureViewDegrade, Boolean.TRUE)) {
                    return false;
                }
                SettingsManager.LIZLLL().getClass();
                return !SettingsManager.LIZ("trending_player_surface_view", true);
            }

            @Override // X.InterfaceC1483820oiS
            public final HashMap getParams() {
                return new HashMap();
            }

            @Override // X.InterfaceC1483820oiS
            public final FrameLayout getPlayViewContainer() {
                FrameLayout frameLayout = this.LL.LLJLL;
                return frameLayout == null ? new FrameLayout(this.LL.getContentView().getContext()) : frameLayout;
            }
        };
        InterfaceC1484830ok5 interfaceC1484830ok5WQ2 = op().wQ2();
        interfaceC1484830ok5WQ2.LIZJ(interfaceC1483820oiS);
        C1742870vSH c1742870vSH = this.LLJLIL;
        if (c1742870vSH != null && (aweme = c1742870vSH.LLILLJJLI) != null) {
            interfaceC1484830ok5WQ2.LJ(C1484770ojz.LIZ(aweme, C626080Oh4.LIZIZ, op()));
        }
        interfaceC1484830ok5WQ2.LJIIZILJ(new InterfaceC1482530ogN() { // from class: X.0var
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
            public final /* synthetic */ void onPlayCompletedFirstTime(String str, C1480430ocz c1480430ocz) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onPlayFailed(String str, C1481290oeN c1481290oeN, C1480430ocz c1480430ocz) {
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
            public final void onPlayCompleted(String str, int i) {
                C1748720vbi.LIZLLL(this.LL.LJJIJL(), new C1748150van(), new AwS605S0100000_26(this.LL, 290));
                C1748720vbi.LIZLLL(this.LL.LJJIJL(), new C1748180vaq(), new AwS605S0100000_26(this.LL, 291));
                C1748720vbi.LIZLLL(this.LL.LJJIJL(), new C1748170vap(), new AwS605S0100000_26(this.LL, 292));
                C1748200vas c1748200vas = this.LL.LLJLILLLLZIIL;
                if (c1748200vas != null) {
                    c1748200vas.LLILZIL = SystemClock.elapsedRealtime();
                }
            }

            @Override // X.InterfaceC1482530ogN
            public final void onRenderFirstFrame(String str, C1480420ocy c1480420ocy) {
                String aid;
                SmartImageView smartImageView;
                Aweme aweme2;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("onRenderFirstFrame： ");
                sbLIZ2.append(C631370Opb.LIZIZ(this.LL));
                C2188811AlT.LIZIZ(sbLIZ2);
                C1309620kBU.LIZ("ECTrendingVideoAssem");
                C1742740vS4.LIZ();
                C1742870vSH c1742870vSH2 = this.LL.LLJLIL;
                if (c1742870vSH2 != null && (aweme2 = c1742870vSH2.LLILLJJLI) != null) {
                    aid = aweme2.getAid();
                } else {
                    aid = null;
                }
                if (Intrinsics.LJFF(aid, str) && (smartImageView = this.LL.LLJLLL) != null) {
                    C786410Ut5.LLFF(8, smartImageView);
                }
            }
        });
        C1748720vbi.LIZLLL(LJJIJL(), new C1748180vaq(), new AwS605S0100000_26(this, 293));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLL = view;
        C1748200vas c1748200vas = (C1748200vas) view.findViewById(R.id.ghp);
        this.LLJLILLLLZIIL = c1748200vas;
        if (c1748200vas != null) {
            c1748200vas.LLILZ = this;
        }
        this.LLJLLIL = (C426200GnS) view.findViewById(R.id.yjx);
        this.LLJLLL = (SmartImageView) view.findViewById(R.id.yjt);
        this.LLJZ = (C429820GtI) view.findViewById(R.id.yke);
        this.LLJZIJLIL = (C626070Oh3) view.findViewById(R.id.ykn);
        this.LLJLL = (FrameLayout) view.findViewById(R.id.ykp);
        C723830SaL.LIZ(this, null, new AwS603S0100000_24(this, 66));
        C1748730vbj.LJ(LJJIJL(), new InterfaceC1748860vbw() { // from class: X.0vaw
            @Override // X.InterfaceC1748860vbw
            public final void Q3(C1748770vbn c1748770vbn) {
                C1748780vbo.LIZIZ(c1748770vbn, "lib_track_builtin_lane_business", new AwS605S0100000_26(this.LL, 287));
            }
        });
        C2211751BhN.LIZ(view, new C1776220wK4(this, 1));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.trending.list.card.common.ECTrendingBaseReusedAssem
    public final void sp(C1742910vSL c1742910vSL) {
        String str;
        C426200GnS c426200GnS;
        String nickname;
        UrlModel avatarThumb;
        Long lValueOf;
        long playCount;
        AwemeStatistics statistics;
        C1742870vSH c1742870vSH = (C1742870vSH) c1742910vSL;
        this.LLJLIL = c1742870vSH;
        View view = this.LLL;
        if (view != null) {
            HandlerHook.viewPost(view, new ARunnableS104S0100000_4(this, 136));
        }
        C626070Oh3 c626070Oh3 = this.LLJZIJLIL;
        boolean z = true;
        if (c626070Oh3 != null) {
            Aweme aweme = c1742870vSH.LLILLJJLI;
            if (aweme != null && (statistics = aweme.getStatistics()) != null) {
                playCount = statistics.getPlayCount();
            } else {
                playCount = 0;
            }
            c626070Oh3.LIZ(playCount, true);
        }
        tp(c1742870vSH);
        Aweme aweme2 = c1742870vSH.LLILLJJLI;
        String str2 = null;
        if (aweme2 != null && (c426200GnS = this.LLJLLIL) != null) {
            String desc = aweme2.getDesc();
            User author = aweme2.getAuthor();
            if (author != null) {
                nickname = author.getNickname();
            } else {
                nickname = null;
            }
            User author2 = aweme2.getAuthor();
            if (author2 != null) {
                avatarThumb = author2.getAvatarThumb();
            } else {
                avatarThumb = null;
            }
            AwemeStatistics statistics2 = aweme2.getStatistics();
            if (statistics2 != null) {
                lValueOf = Long.valueOf(statistics2.getDiggCount());
            } else {
                lValueOf = null;
            }
            if (aweme2.getUserDigg() != 1) {
                z = false;
            }
            c426200GnS.e0(desc, nickname, avatarThumb, lValueOf, z);
        }
        C1748200vas c1748200vas = this.LLJLILLLLZIIL;
        if (c1748200vas != null) {
            C786410Ut5.R9(c1748200vas, new ACListenerS128S0200000_26(this, c1742870vSH, 30));
        }
        C429820GtI c429820GtI = this.LLJZ;
        if (c429820GtI != null) {
            C1742820vSC c1742820vSC = op().LL;
            if (c1742820vSC != null) {
                str = c1742820vSC.LJII;
            } else {
                str = null;
            }
            c429820GtI.setSourceModule(str);
        }
        C429820GtI c429820GtI2 = this.LLJZ;
        if (c429820GtI2 != null) {
            C1742820vSC c1742820vSC2 = op().LL;
            if (c1742820vSC2 != null) {
                str2 = c1742820vSC2.LJIIIIZZ;
            }
            c429820GtI2.setPageName(str2);
        }
        C429820GtI c429820GtI3 = this.LLJZ;
        if (c429820GtI3 != null) {
            c429820GtI3.LIZ(c1742870vSH.LLILZ, c1742870vSH.LLILLJJLI, new ACListenerS160S0100000_26(this, 74));
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("bind position： ");
        sbLIZ.append(C631370Opb.LIZIZ(this));
        C2188811AlT.LIZIZ(sbLIZ);
        C1309620kBU.LIZ("bindData");
    }

    public final void tp(C1742870vSH c1742870vSH) {
        FrameLayout frameLayout;
        Object objLJJJLL;
        Video video;
        UrlModel cover;
        List<String> urlList;
        SmartImageView smartImageView = this.LLJLLL;
        if (smartImageView != null) {
            C786410Ut5.LLFF(0, smartImageView);
        }
        SmartImageView smartImageView2 = this.LLJLLL;
        if (smartImageView2 != null) {
            C1326790kdB c1326790kdB = C1326790kdB.LIZ;
            Aweme aweme = c1742870vSH.LLILLJJLI;
            if (aweme != null && (video = aweme.getVideo()) != null && (cover = video.getCover()) != null && (urlList = cover.getUrlList()) != null) {
                objLJJJLL = C13LP.LJJJLL(urlList);
            } else {
                objLJJJLL = null;
            }
            c1326790kdB.getClass();
            C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(objLJJJLL);
            c1331670kl3LIZLLL.LJJIJL(getContext());
            c1331670kl3LIZLLL.LIZLLL("ec_trending_cover_image");
            smartImageView2.LIZ(c1331670kl3LIZLLL.LIZJ());
        }
        if (Intrinsics.LJFF(((EcTrendingOptBean) C1748250vax.LIZIZ.getValue()).enableResize, Boolean.TRUE) && (frameLayout = this.LLJLL) != null) {
            HandlerHook.viewPost(frameLayout, new ARunnableS92S0200000_23(this, c1742870vSH, 23));
        }
    }
}
