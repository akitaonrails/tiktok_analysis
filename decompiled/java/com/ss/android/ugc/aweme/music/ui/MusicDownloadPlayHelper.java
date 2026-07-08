package com.ss.android.ugc.aweme.music.ui;

import X.AbstractC1661070tKL;
import X.C01GW;
import X.C036E;
import X.C04TP;
import X.C0BM2;
import X.C0C64;
import X.C0EM1;
import X.C0VSJ;
import X.C0WZX;
import X.C1233040iBy;
import X.C1390380mHk;
import X.C1399150mVt;
import X.C1403010mc7;
import X.C142I;
import X.C1458340o3M;
import X.C1458350o3N;
import X.C1485020okO;
import X.C1485060okS;
import X.C1487190ont;
import X.C1490520otG;
import X.C15I0;
import X.C15IZ;
import X.C15O7;
import X.C1622290sJn;
import X.C1655250tAx;
import X.C1661020tKG;
import X.C1661180tKW;
import X.C19EG;
import X.C19FO;
import X.C201955140j;
import X.C202025143b;
import X.C202033143j;
import X.C202035143l;
import X.C202045143v;
import X.C20498815Ja;
import X.C20500915Jv;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C2344009Gk;
import X.C2344809Gs;
import X.C2354709Kn;
import X.C298090BmJ;
import X.C736480Suk;
import X.C785410UrT;
import X.C786410Ut5;
import X.C823050WQl;
import X.C830490Whz;
import X.EnumC1399740mWq;
import X.InterfaceC1399770mWt;
import X.InterfaceC1485080okU;
import X.InterfaceC1485090okV;
import X.InterfaceC1485100okW;
import X.InterfaceC1485120okY;
import X.InterfaceC1603190roz;
import X.InterfaceC1662290tMJ;
import X.InterfaceC202028143e;
import X.InterfaceC202048143y;
import X.InterfaceC20499215Je;
import X.InterfaceC20499515Jh;
import X.InterfaceC20500115Jn;
import X.InterfaceC20500415Jq;
import X.InterfaceC2385309Wh;
import X.ProgressDialogC1399760mWs;
import Y.ACallableS416S0100000_9;
import Y.ARunnableS105S0100000_5;
import Y.ARunnableS42S0101000_31;
import android.app.Activity;
import android.content.Context;
import android.os.CountDownTimer;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.SafeHandler;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.model.MusicCategory;
import com.ss.android.ugc.aweme.music.service.IMusicExternalService;
import com.ss.android.ugc.aweme.music.service.IMusicService;
import com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper;
import com.ss.android.ugc.aweme.performance.PerformanceMonitor;
import com.ss.android.ugc.aweme.services.ICreativeSAAService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.ability.IAVInfoService;
import com.ss.android.ugc.aweme.services.performance.IAVPerformance;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.tiktok.tools.performance.api.settings.MusicStreamConfig;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public class MusicDownloadPlayHelper implements InterfaceC20500415Jq, GenericLifecycleObserver {
    public InterfaceC20499515Jh LL;
    public int LLILLJJLI;
    public ProgressDialogC1399760mWs LLILLL;
    public InterfaceC20499215Je LLILZ;
    public InterfaceC20500115Jn LLILZIL;
    public C15IZ LLILZLL;
    public Context LLIZ;
    public long LLIZLLLIL;
    public String LLJ;
    public String LLJI;
    public MusicCategory LLJIJIL;
    public int LLJILJIL;
    public boolean LLJILJILJ;
    public MusicModel LLJILLL;
    public int LLJJ;
    public CountDownTimer LLJJI;
    public MusicStreamConfig LLJJIII;
    public boolean LLJJIJI;
    public final BPEAHandler LLJJIJIIJIL;
    public final C830490Whz<String, Boolean> LLJJIJIL;
    public long LLJJJ;
    public boolean LLJJJIL;
    public InterfaceC1485100okW LLJJJJ;
    public String LLJJJJJIL;

    @Override // X.InterfaceC20500415Jq
    public final void Qf() {
    }

    @Override // X.InterfaceC20500415Jq
    public final void Wf() {
    }

    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            dismissDialog();
        }
    }

    public final void LJFF() {
        MusicModel musicModel = this.LLJILLL;
        if (musicModel == null || !musicModel.playRepeatFromEndTime) {
            return;
        }
        this.LLJJIJIIJIL.removeCallbacksAndMessages(null);
        C786410Ut5.LJLIIL(this.LLJILLL.getMusicEndTime() - this.LLJILLL.getMusicStart(), this.LLJJIJIIJIL, new ARunnableS42S0101000_31(this.LLJILLL.getMusicStart(), this, 11));
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJII() {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper.LJII():void");
    }

    public void LJIIIZ() {
        CountDownTimer countDownTimer = this.LLJJI;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.LLILZ.pause();
        this.LLJJIJIIJIL.removeCallbacksAndMessages(null);
    }

    @Override // X.InterfaceC20500415Jq
    public void Mf() {
        this.LLILZ.LJ(new InterfaceC1485120okY() { // from class: X.15JU
            @Override // X.InterfaceC1485120okY
            public final void LIZ(int i, int i2) {
                MusicDownloadPlayHelper musicDownloadPlayHelper = this.LIZ;
                MusicModel musicModel = musicDownloadPlayHelper.LLJILLL;
                if (musicModel != null) {
                    musicDownloadPlayHelper.LJIIL(musicModel, musicDownloadPlayHelper.LLJJIJI, musicDownloadPlayHelper.LLJJ);
                }
                MusicDownloadPlayHelper musicDownloadPlayHelper2 = this.LIZ;
                if (musicDownloadPlayHelper2.LLJJJIL) {
                    musicDownloadPlayHelper2.LJII();
                }
                MusicDownloadPlayHelper musicDownloadPlayHelper3 = this.LIZ;
                if (musicDownloadPlayHelper3.LLJILJILJ && musicDownloadPlayHelper3.LLILZ != null) {
                    musicDownloadPlayHelper3.LJIIIZ();
                }
                InterfaceC20499515Jh interfaceC20499515Jh = this.LIZ.LL;
                if (interfaceC20499515Jh == null) {
                    return;
                }
                if (interfaceC20499515Jh.LJI() != null && i2 != 0) {
                    this.LIZ.LL.LJI().setDuration(i2);
                }
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                MusicDownloadPlayHelper musicDownloadPlayHelper4 = this.LIZ;
                musicDownloadPlayHelper4.LL.J2(musicDownloadPlayHelper4.LLJILLL, jElapsedRealtime - musicDownloadPlayHelper4.LLJJJ);
                C15IZ c15iz = this.LIZ.LLILZLL;
                if (c15iz != null) {
                    c15iz.LIZ();
                }
            }
        });
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void dismissDialog() {
        ProgressDialogC1399760mWs progressDialogC1399760mWs = this.LLILLL;
        if (progressDialogC1399760mWs != null) {
            progressDialogC1399760mWs.dismiss();
            C785410UrT.LIZ(progressDialogC1399760mWs);
            this.LLILLL = null;
        }
    }

    @Override // X.InterfaceC20500415Jq
    public final int getDuration() {
        return this.LLILZ.K2();
    }

    @Override // X.InterfaceC20500415Jq
    public final boolean isPlaying() {
        return this.LLILZ.isPlaying();
    }

    @Override // X.InterfaceC20500415Jq
    public void onDestroy() {
        this.LLJJIJIL.clear();
        CountDownTimer countDownTimer = this.LLJJI;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        if (this.LL != null) {
            this.LL = null;
        }
        if (this.LLILZLL != null) {
            this.LLILZLL = null;
        }
        this.LLIZ = null;
        this.LLILZIL.release();
        this.LLILZ.release();
        this.LLJJIJIIJIL.removeCallbacksAndMessages(null);
    }

    @Override // X.InterfaceC20500415Jq
    public void pause() {
        LJIIIZ();
    }

    @Override // X.InterfaceC20500415Jq
    public final void stop() {
        LJIIIZ();
    }

    public MusicDownloadPlayHelper(InterfaceC20499515Jh interfaceC20499515Jh) {
        this(interfaceC20499515Jh, "music_choose_page");
    }

    @Override // X.InterfaceC20500415Jq
    public final void Of(InterfaceC1485080okU interfaceC1485080okU) {
        InterfaceC20499215Je interfaceC20499215Je = this.LLILZ;
        if (interfaceC20499215Je == null) {
            return;
        }
        interfaceC20499215Je.Of(interfaceC1485080okU);
    }

    @Override // X.InterfaceC20500415Jq
    public final void Rf(InterfaceC1485100okW interfaceC1485100okW) {
        this.LLJJJJ = interfaceC1485100okW;
        this.LLILZ.LIZ(interfaceC1485100okW);
    }

    @Override // X.InterfaceC20500415Jq
    public void Tf(C15IZ c15iz) {
        this.LLILZLL = c15iz;
    }

    @Override // X.InterfaceC20500415Jq
    public final void Vf(MusicStreamConfig musicStreamConfig) {
        this.LLJJIII = musicStreamConfig;
    }

    @Override // X.InterfaceC20500415Jq
    public final void Yf(MusicModel musicModel) {
        LJIIJ(musicModel, false, 24);
    }

    @Override // X.InterfaceC20500415Jq
    public final void setCreationId(String str) {
        this.LLJ = str;
    }

    public MusicDownloadPlayHelper(InterfaceC20499515Jh interfaceC20499515Jh, String str) {
        this.LLJ = "";
        this.LLJJIJIIJIL = new BPEAHandler(Looper.getMainLooper());
        this.LLJJIJIL = new C830490Whz<>();
        this.LLJJJ = -1L;
        this.LLJJJIL = true;
        this.LLJJJJJIL = "";
        this.LL = interfaceC20499515Jh;
        this.LLIZ = interfaceC20499515Jh.LLILLL();
        this.LLILZ = new C20498815Ja(str);
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "creative_tools_open_download_music", true, false) && (TextUtils.equals(str, "video_shoot_page") || TextUtils.equals(str, "music_choose_page"))) {
            this.LLILZIL = new C202025143b(this.LLILZ, this.LL.LLILLL(), str);
        } else {
            this.LLILZIL = new C202033143j(this.LL.LLILLL(), str, true, true);
        }
        this.LLJJJJJIL = str;
        this.LLILZIL.LIZJ(1);
        C01GW c01gw = C20500915Jv.LIZIZ;
        if (((MusicStreamConfig) c01gw.getValue()).isEnable) {
            this.LLJJIII = (MusicStreamConfig) c01gw.getValue();
        }
    }

    public boolean LIZ(Context context, MusicModel musicModel) {
        return C142I.LIZ(musicModel, context, true);
    }

    public final void LIZJ(C202035143l c202035143l, MusicModel musicModel) {
        int errorCode;
        dismissDialog();
        if (C0BM2.LIZ() && c202035143l != null && ((errorCode = c202035143l.getErrorCode()) == 4 || errorCode == 6 || errorCode == 7)) {
            C1233040iBy c1233040iBy = new C1233040iBy(this.LLIZ);
            c1233040iBy.LIZIZ(2131837756);
            c1233040iBy.LIZLLL();
        }
        InterfaceC20499515Jh interfaceC20499515Jh = this.LL;
        if (interfaceC20499515Jh != null && interfaceC20499515Jh.LLJLLIL() && this.LLIZ != null) {
            this.LL.LLJILJILJ(musicModel, c202035143l);
            LJIIIIZZ(musicModel, this.LLJ, "fail");
            MobClick mobClickObtain = MobClick.obtain();
            mobClickObtain.setEventName("music_download_end");
            mobClickObtain.setLabelName("perf_monitor");
            mobClickObtain.setExtValueString(musicModel.getMusicId());
            C736480Suk c736480Suk = new C736480Suk();
            c736480Suk.LIZ("is_success", String.valueOf(0));
            c736480Suk.LIZ("sdk_type", String.valueOf(((IMusicService) ServiceManager.get().getService(IMusicService.class)).LJIIJJI()));
            mobClickObtain.setJsonObject(c736480Suk.LIZIZ());
            C20684815ws.onEvent(mobClickObtain);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(com.ss.android.ugc.aweme.shortvideo.model.MusicModel r14, int r15) {
        /*
            Method dump skipped, instruction units count: 568
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper.LJI(com.ss.android.ugc.aweme.shortvideo.model.MusicModel, int):void");
    }

    @Override // X.InterfaceC20500415Jq
    public void Nf(int i, InterfaceC1485090okV interfaceC1485090okV) {
        this.LLILZ.Nf(i, new InterfaceC1485090okV() { // from class: X.15JW
            public final /* synthetic */ InterfaceC1485090okV LIZ = null;

            @Override // X.InterfaceC1485090okV
            public final void LJII(boolean z) {
                InterfaceC1485090okV interfaceC1485090okV2 = this.LIZ;
                if (interfaceC1485090okV2 != null) {
                    interfaceC1485090okV2.LJII(z);
                }
                if (z) {
                    MusicDownloadPlayHelper musicDownloadPlayHelper = this.LIZIZ;
                    musicDownloadPlayHelper.LJIIL(musicDownloadPlayHelper.LLJILLL, musicDownloadPlayHelper.LLJJIJI, musicDownloadPlayHelper.LLJJ);
                }
            }
        });
    }

    @Override // X.InterfaceC20500415Jq
    public final void Pf(MusicModel musicModel, int i) {
        Uf(i, musicModel, true, false);
    }

    public MusicDownloadPlayHelper(Context context, String str) {
        C1661020tKG c1661020tKG = new InterfaceC20499515Jh() { // from class: X.0tKG
            @Override // X.InterfaceC20499515Jh
            public final /* synthetic */ void J2(MusicModel musicModel, long j) {
            }

            @Override // X.InterfaceC20499515Jh
            public final MusicModel LJI() {
                return null;
            }

            @Override // X.InterfaceC20499515Jh
            public final Activity LLILLL() {
                return null;
            }

            @Override // X.InterfaceC20499515Jh
            public final boolean LLJLLIL() {
                return true;
            }

            @Override // X.InterfaceC20499515Jh
            public final /* synthetic */ void y4(Map map, MusicModel musicModel, String str2) {
            }

            @Override // X.InterfaceC20499515Jh
            public final void v2() {
                C1661190tKX.LIZ.getClass();
                C201955140j.LIZLLL(C201962140q.LIZIZ, "MusicPlayHelperBackgroundDownloader", "download onCancel");
                C1661190tKX.LIZ(C1661010tKF.LIZ);
            }

            @Override // X.InterfaceC20499515Jh
            public final void ba(MusicModel musicModel) {
                C1661190tKX.LIZ.getClass();
                C201955140j.LIZLLL(C201962140q.LIZIZ, "MusicPlayHelperBackgroundDownloader", "download onSkipDownload");
                C1661190tKX.LIZ(C1661000tKE.LIZ);
            }

            @Override // X.InterfaceC20499515Jh
            public final void LLJILJILJ(MusicModel musicModel, Exception exc) {
                C1661190tKX.LIZ.getClass();
                C201955140j.LIZLLL(C201962140q.LIZIZ, "MusicPlayHelperBackgroundDownloader", "download onFailed");
                C1661190tKX.LIZ(C1661000tKE.LIZ);
            }

            @Override // X.InterfaceC20499515Jh
            public final void LLJJL(MusicModel musicModel, String str2, String str3) {
                C1661190tKX c1661190tKX = C1661190tKX.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("download onSuccess, file=");
                sbLIZ.append(str2);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                c1661190tKX.getClass();
                C201955140j.LIZLLL(C201962140q.LIZIZ, "MusicPlayHelperBackgroundDownloader", strLIZIZ);
                if (str2 != null && str2.length() != 0) {
                    C1661190tKX.LIZ(new C1652560t6c(str2));
                } else {
                    C1661190tKX.LIZ(C1661000tKE.LIZ);
                }
            }
        };
        this.LLJ = "";
        this.LLJJIJIIJIL = new BPEAHandler(Looper.getMainLooper());
        this.LLJJIJIL = new C830490Whz<>();
        this.LLJJJ = -1L;
        this.LLJJJIL = true;
        this.LLJJJJJIL = "";
        this.LL = c1661020tKG;
        this.LLIZ = context;
        this.LLILZ = new C20498815Ja(str);
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "creative_tools_open_download_music", true, false) && (TextUtils.equals(str, "video_shoot_page") || TextUtils.equals(str, "music_choose_page"))) {
            this.LLILZIL = new C202025143b(this.LLILZ, context, str);
        } else {
            this.LLILZIL = new C202033143j(context, str, true, true);
        }
        this.LLJJJJJIL = str;
        this.LLILZIL.LIZJ(1);
        C01GW c01gw = C20500915Jv.LIZIZ;
        if (((MusicStreamConfig) c01gw.getValue()).isEnable) {
            this.LLJJIII = (MusicStreamConfig) c01gw.getValue();
        }
    }

    public final void LJIIIIZZ(MusicModel musicModel, String str, String str2) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("creation_id", str);
        c2344009Gk.LJIIIIZZ("music_id", musicModel.getMusicId());
        c2344009Gk.LIZLLL(System.currentTimeMillis() - this.LLIZLLLIL, "loading_time");
        c2344009Gk.LJIIIIZZ("to_status", str2);
        C20684815ws.LJIILLIIL("music_loading_end", c2344009Gk.LIZ);
    }

    public void LJIIJ(MusicModel musicModel, boolean z, int i) {
        Zf(musicModel, i, z, 0, -1);
    }

    public final void LJIIL(final MusicModel musicModel, final boolean z, final int i) {
        CountDownTimer countDownTimer = this.LLJJI;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        if (musicModel.getDuration() == musicModel.getAuditionDuration().intValue()) {
            return;
        }
        final long realAuditionDuration = musicModel.getRealAuditionDuration();
        if (realAuditionDuration <= 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("MusicDownloadPlayHelper: audition_duration is zero, music id: ");
            sbLIZ.append(musicModel.getMusicId());
            C2344809Gs.LJ(C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        CountDownTimer countDownTimer2 = new CountDownTimer(realAuditionDuration) { // from class: X.15Jm
            @Override // android.os.CountDownTimer
            public final void onTick(long j) {
            }

            @Override // android.os.CountDownTimer
            public final void onFinish() {
                this.LIZLLL.LLILZ.pause();
                InterfaceC1485100okW interfaceC1485100okW = this.LIZLLL.LLJJJJ;
                if (interfaceC1485100okW != null) {
                    interfaceC1485100okW.LIZIZ();
                }
                if (z) {
                    this.LIZLLL.LJIIJ(musicModel, true, i);
                }
            }
        };
        this.LLJJI = countDownTimer2;
        countDownTimer2.start();
    }

    public final void LJIILJJIL(MusicModel musicModel, String str, String str2) {
        if (this.LL == null) {
            return;
        }
        this.LLJILJILJ = true;
        if (this.LLIZ == null) {
            return;
        }
        InterfaceC1662290tMJ interfaceC1662290tMJLIZJ = ((IMusicExternalService) ServiceManager.get().getService(IMusicExternalService.class)).LIZJ();
        if (interfaceC1662290tMJLIZJ != null) {
            interfaceC1662290tMJLIZJ.LJIIJ(this.LLIZLLLIL, str, musicModel.getMusicId(), false);
        }
        LJIIIZ();
        C15I0.LIZ().pause();
        ProgressDialogC1399760mWs progressDialogC1399760mWs = this.LLILLL;
        if (progressDialogC1399760mWs != null) {
            progressDialogC1399760mWs.dismiss();
            C785410UrT.LIZ(progressDialogC1399760mWs);
        }
        this.LL.LLJJL(musicModel, str, str2);
    }

    public static String LJ(int i, int i2, int i3, int i4) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MusicDownloadPlayHelper getMusicOrigin-->musicOriginType:");
        sbLIZ.append(i);
        sbLIZ.append(" mMusicChooseType:");
        sbLIZ.append(i2);
        sbLIZ.append(" fromCollectionType:");
        sbLIZ.append(i3);
        sbLIZ.append(" musicType:");
        sbLIZ.append(i4);
        C201955140j.LJIILIIL("Music", C2188811AlT.LIZIZ(sbLIZ));
        if (i2 != 0) {
            if (i2 != 2) {
                return "";
            }
            switch (i) {
                case 0:
                case 15:
                    if (i3 == 2) {
                        return "shoot_page_unfolded_category";
                    }
                    if (i3 == 3) {
                        return "shoot_page_folded_category";
                    }
                    return "shoot_page_list";
                case 1:
                    return "shoot_page_favourite";
                case 2:
                    return "shoot_page_search";
                case 3:
                    if (i3 == 2) {
                        return "shoot_page_unfolded_category";
                    }
                    if (i3 == 3) {
                        return "shoot_page_folded_category";
                    }
                    return "shoot_page_banner";
                case 4:
                case 7:
                case 16:
                case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                case 19:
                case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                default:
                    return "";
                case 5:
                    return "shoot_page_local";
                case 6:
                    if (i4 == 0) {
                        return "shoot_page_upload_from_device";
                    }
                    if (i4 == 3) {
                        return "shoot_page_upload_from_video";
                    }
                    return "shoot_page_upload";
                case 8:
                    return "shoot_page_fm";
                case BdTuring.TYPE_ECAF /* 9 */:
                    return "sticker_rec";
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                    return "challenge_rec";
                case BdTuring.TYPE_EMAIL /* 11 */:
                    return "music_chart_list";
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                    return "shoot_page_favourite_recommend";
                case BdTuring.TYPE_SMS_VOICE /* 13 */:
                    return "profile_favorite_recommend";
                case 14:
                    return "shoot_page_list";
                case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                    return "wwa_campaign_music";
                case 21:
                    return "my_music";
                case 22:
                    return "campaign_add_to_story";
                case 23:
                    return "shoot_page_unlimited";
                case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                    return "similar_music";
                case 25:
                    return "spotlight_video_play";
            }
        }
        switch (i) {
            case 0:
            case 15:
                if (i3 == 2) {
                    return "edit_page_unfolded_category";
                }
                if (i3 == 3) {
                    return "edit_page_folded_category";
                }
                return "edit_page_list";
            case 1:
                return "edit_page_favourite";
            case 2:
                return "edit_page_search";
            case 3:
                if (i3 == 2) {
                    return "edit_page_unfolded_category";
                }
                if (i3 == 3) {
                    return "edit_page_folded_category";
                }
                return "edit_page_banner";
            case 4:
            case 16:
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
            case 19:
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
            default:
                return "";
            case 5:
                return "edit_page_local";
            case 6:
                if (i4 == 0) {
                    return "edit_page_upload_from_device";
                }
                if (i4 == 3) {
                    return "edit_page_upload_from_video";
                }
                return "edit_page_upload";
            case 7:
                return "single_song";
            case 8:
                return "edit_page_fm";
            case BdTuring.TYPE_ECAF /* 9 */:
                return "sticker_rec";
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return "challenge_rec";
            case BdTuring.TYPE_EMAIL /* 11 */:
                return "music_chart_list";
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return "edit_page_favourite_recommend";
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return "profile_favorite_recommend";
            case 14:
                return "edit_page_list";
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return "wwa_campaign_music";
            case 21:
                return "my_music";
            case 22:
                return "campaign_add_to_story";
            case 23:
                return "edit_page_unlimited";
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return "similar_music";
            case 25:
                return "spotlight_video_play";
        }
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [X.143e, X.15JZ] */
    public final void LJIILIIL(final MusicModel musicModel, final String str, final boolean z, final boolean z2) {
        String musicId;
        MusicModel musicModel2;
        if (C0EM1.LIZ(musicModel.getMusicId()) != null) {
            IAVPerformance iAVPerformanceProvideAVPerformance = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).provideAVPerformance();
            PerformanceMonitor performanceMonitorLIZ = C0EM1.LIZ(musicModel.getMusicId());
            Objects.requireNonNull(performanceMonitorLIZ);
            iAVPerformanceProvideAVPerformance.step(performanceMonitorLIZ, "start download music");
        }
        final ?? r6 = new InterfaceC202028143e() { // from class: X.15JZ
            @Override // X.InterfaceC202028143e
            public final void onCancel() {
            }

            @Override // X.InterfaceC202028143e
            public final void onProgress(int i) {
            }

            @Override // X.InterfaceC202028143e
            public final void onStart() {
            }

            @Override // X.InterfaceC202028143e
            public final void LIZJ(C202035143l c202035143l) {
                this.LIZJ.LIZJ(c202035143l, musicModel);
            }

            @Override // X.InterfaceC202028143e
            public final void LIZIZ(Map map, Map map2) {
                for (MusicModel musicModel3 : musicModel.getMergedMusicList()) {
                    musicModel3.setMusicWaveBean((MusicWaveBean) map2.get(musicModel3.getMusicId()));
                }
                if (C0EM1.LIZ(musicModel.getMusicId()) != null) {
                    IAVPerformance iAVPerformanceProvideAVPerformance2 = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).provideAVPerformance();
                    PerformanceMonitor performanceMonitorLIZ2 = C0EM1.LIZ(musicModel.getMusicId());
                    Objects.requireNonNull(performanceMonitorLIZ2);
                    iAVPerformanceProvideAVPerformance2.step(performanceMonitorLIZ2, "music download success");
                }
                MusicDownloadPlayHelper musicDownloadPlayHelper = this.LIZJ;
                MusicModel musicModel4 = musicModel;
                String str2 = str;
                if (musicDownloadPlayHelper.LL != null) {
                    musicDownloadPlayHelper.LLJILJILJ = true;
                    if (musicDownloadPlayHelper.LLIZ != null) {
                        musicDownloadPlayHelper.LJIIIZ();
                        C15I0.LIZ().pause();
                        ProgressDialogC1399760mWs progressDialogC1399760mWs = musicDownloadPlayHelper.LLILLL;
                        if (progressDialogC1399760mWs != null) {
                            progressDialogC1399760mWs.dismiss();
                            C785410UrT.LIZ(progressDialogC1399760mWs);
                        }
                        musicDownloadPlayHelper.getClass();
                        musicDownloadPlayHelper.LL.y4(map, musicModel4, str2);
                    }
                }
                MusicDownloadPlayHelper musicDownloadPlayHelper2 = this.LIZJ;
                musicDownloadPlayHelper2.LJIIIIZZ(musicModel, musicDownloadPlayHelper2.LLJ, "success");
                MobClick mobClickObtain = MobClick.obtain();
                mobClickObtain.setEventName("music_download_end");
                mobClickObtain.setLabelName("perf_monitor");
                mobClickObtain.setExtValueString(musicModel.getMusicId());
                C736480Suk c736480Suk = new C736480Suk();
                c736480Suk.LIZ("is_success", String.valueOf(1));
                c736480Suk.LIZ("downloadStrategy", String.valueOf(((IMusicService) ServiceManager.get().getService(IMusicService.class)).LJIIJJI()));
                mobClickObtain.setJsonObject(c736480Suk.LIZIZ());
                C20684815ws.onEvent(mobClickObtain);
            }

            @Override // X.InterfaceC202028143e
            public final void LIZ(String str2, MusicWaveBean musicWaveBean, Boolean bool) {
                this.LIZJ.LIZIZ(str2, musicWaveBean, bool, false, musicModel, str);
            }
        };
        if (C298090BmJ.LIZ() && !musicModel.hasExtendMusicList() && musicModel.shouldUseMDPDownloader) {
            C1661180tKW.LIZ.getClass();
            if (C1661180tKW.LIZJ.LIZJ() instanceof C1655250tAx) {
                AbstractC1661070tKL abstractC1661070tKL = C1661180tKW.LIZIZ;
                if (abstractC1661070tKL != null && (musicModel2 = abstractC1661070tKL.LIZJ) != null) {
                    musicId = musicModel2.getMusicId();
                } else {
                    musicId = null;
                }
                if (Intrinsics.LJFF(musicId, musicModel.getMusicId())) {
                    C1661180tKW.LJ("continue download");
                    C1661180tKW.LIZLLL = r6;
                    return;
                }
            }
            Pair pairLIZLLL = C1661180tKW.LIZLLL(musicModel, null, null);
            String str2 = (String) pairLIZLLL.getFirst();
            if (((Boolean) pairLIZLLL.getSecond()).booleanValue()) {
                C1661180tKW.LJ("continue download success by cache");
                if (str2 != null) {
                    r6.LIZ(str2, null, Boolean.TRUE);
                    return;
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
        }
        Callable callable = new Callable() { // from class: X.15Jk
            @Override // java.util.concurrent.Callable
            public final Object call() {
                MusicDownloadPlayHelper musicDownloadPlayHelper = this.LL;
                MusicModel musicModel3 = musicModel;
                InterfaceC202028143e interfaceC202028143e = r6;
                boolean z3 = z;
                boolean z4 = z2;
                musicDownloadPlayHelper.getClass();
                C1C7U.LIZ("MusicDownloadPlayHelper@f063.toDownloadMusic$1L");
                if (!musicModel3.hasExtendMusicList() || musicModel3.isLoopMusic()) {
                    musicDownloadPlayHelper.LLILZIL.LIZIZ(musicModel3, interfaceC202028143e, true, z3, z4);
                } else {
                    musicDownloadPlayHelper.LLILZIL.LIZ(musicModel3.getMergedMusicList(), interfaceC202028143e, z3, z4);
                }
                C1C7U.LIZIZ("MusicDownloadPlayHelper@f063.toDownloadMusic$1L");
                return null;
            }
        };
        if (((Boolean) C04TP.LIZ.getValue()).booleanValue()) {
            C15O7.LIZIZ(callable, C823050WQl.LIZLLL(), null);
        } else {
            C15O7.LIZJ(callable);
        }
    }

    @Override // X.InterfaceC20500415Jq
    public final void Uf(int i, MusicModel musicModel, boolean z, boolean z2) {
        ag(i, musicModel, z, z2, false);
    }

    @Override // X.InterfaceC20500415Jq
    public final void Sf(int i, MusicModel musicModel, boolean z, boolean z2, boolean z3) {
        if (this.LL != null && this.LLIZ != null && musicModel != null) {
            this.LLJILLL = musicModel;
            this.LLJILJILJ = false;
            LJI(musicModel, i);
            this.LLIZLLLIL = System.currentTimeMillis();
            LJIIIZ();
            Activity activityLLILLL = this.LL.LLILLL();
            if (activityLLILLL == null) {
                throw new NullPointerException("getString");
            }
            Iterator<MusicModel> it2 = musicModel.getMergedMusicList().iterator();
            while (it2.hasNext()) {
                if (!LIZ(activityLLILLL, it2.next())) {
                    this.LL.LLJILJILJ(musicModel, new Exception(activityLLILLL.getString(2131837770)));
                    return;
                }
            }
            if (musicModel.getMusicType() == 1 || musicModel.getMusicType() == 2) {
                if (z) {
                    final ArrayList arrayList = new ArrayList();
                    Iterator<MusicModel> it3 = musicModel.getMergedMusicList().iterator();
                    while (it3.hasNext()) {
                        arrayList.add(it3.next().getMusicId());
                    }
                    InterfaceC20499515Jh interfaceC20499515Jh = this.LL;
                    if (interfaceC20499515Jh != null) {
                        C19FO c19fo = (C19FO) interfaceC20499515Jh.LLILLL();
                        this.LLILLL = C1399150mVt.LIZIZ(c19fo, EnumC1399740mWq.VISIBLE_AFTER_5S, new InterfaceC1399770mWt() { // from class: X.15Jf
                            /* JADX WARN: Type inference fix 'apply assigned field type' failed
                            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                             */
                            @Override // X.InterfaceC1399770mWt
                            public final void LIZ() {
                                MusicDownloadPlayHelper musicDownloadPlayHelper = this.LIZ;
                                List<String> list = arrayList;
                                musicDownloadPlayHelper.LLJJIJIL.put(list.isEmpty() ? "" : ListProtector.get(list, 0), Boolean.FALSE);
                                CountDownTimer countDownTimer = musicDownloadPlayHelper.LLJJI;
                                if (countDownTimer != null) {
                                    countDownTimer.cancel();
                                }
                                musicDownloadPlayHelper.LLILZIL.LIZLLL(list);
                                InterfaceC20499515Jh interfaceC20499515Jh2 = musicDownloadPlayHelper.LL;
                                if (interfaceC20499515Jh2 != null) {
                                    interfaceC20499515Jh2.v2();
                                }
                            }
                        });
                        c19fo.getLifecycle().addObserver(this);
                    }
                }
                this.LLJJIJIL.put(musicModel.getMusicId(), Boolean.TRUE);
                LIZLLL(musicModel, LJ(i, this.LLILLJJLI, musicModel.getFromCollectionType(), musicModel.getMusicType()), z2, z3, false, false);
            }
        }
    }

    @Override // X.InterfaceC20500415Jq
    public void Zf(MusicModel musicModel, int i, boolean z, int i2, int i3) {
        InterfaceC20499515Jh interfaceC20499515Jh;
        Activity activityLLILLL;
        String str;
        String urlKey;
        this.LLJJJ = SystemClock.elapsedRealtime();
        if (musicModel != null && (interfaceC20499515Jh = this.LL) != null && (activityLLILLL = interfaceC20499515Jh.LLILLL()) != null) {
            try {
                if (C036E.LIZ.LIZIZ()) {
                    this.LLJJ = i;
                    if (!LIZ(activityLLILLL, musicModel)) {
                        return;
                    }
                    this.LLJILLL = musicModel;
                    this.LLJJIJI = z;
                    this.LLILZ.stop();
                    String localPath = musicModel.getLocalPath();
                    C1485060okS c1485060okS = new C1485060okS();
                    if (C1458350o3N.LIZ()) {
                        if (musicModel.getMusicVolumeInfo() != null && !musicModel.getMusicVolumeInfo().isEmpty()) {
                            Float fValueOf = Float.valueOf(C1458340o3M.LIZ);
                            if (C1485020okO.LIZLLL(fValueOf)) {
                                c1485060okS.LJIIJJI = musicModel.getMusicVolumeInfo();
                                c1485060okS.LJIIL = fValueOf.floatValue();
                                fValueOf.floatValue();
                                musicModel.getMusicVolumeInfo();
                                musicModel.getMusicId();
                            } else {
                                fValueOf.floatValue();
                                musicModel.getMusicVolumeInfo();
                                musicModel.getMusicId();
                            }
                        } else {
                            musicModel.getMusicVolumeInfo();
                            musicModel.getMusicId();
                        }
                    }
                    if (musicModel.getMusicType() != 1 && musicModel.getMusicType() != 2) {
                        if (musicModel.isLocalMusic()) {
                            c1485060okS.LJFF = musicModel.getMusicId();
                            c1485060okS.LIZ = musicModel.getLocalPath();
                            c1485060okS.LJI = z;
                            c1485060okS.LJII = i2;
                            c1485060okS.LJIIIIZZ = i3;
                            c1485060okS.LIZLLL = musicModel.getDuration();
                            c1485060okS.LJIIIZ = i2;
                            this.LLILZ.LIZIZ(c1485060okS);
                            return;
                        }
                        return;
                    }
                    c1485060okS.LJFF = musicModel.getMusicId();
                    c1485060okS.LJI = z;
                    c1485060okS.LJIIIZ = i2;
                    c1485060okS.LJII = i2;
                    c1485060okS.LJIIIIZZ = i3;
                    if (musicModel.getMusicType() == 2) {
                        if (musicModel.getReuseAudioPlayUrl() == null) {
                            return;
                        }
                        c1485060okS.LIZIZ = musicModel.getReuseAudioPlayUrl().getUrlList();
                        c1485060okS.LIZLLL = musicModel.getDuration();
                        str = (String) ListProtector.get(musicModel.getReuseAudioPlayUrl().getUrlList(), 0);
                        urlKey = musicModel.getReuseAudioPlayUrl().getUrlKey();
                        c1485060okS.LJIIJ = urlKey;
                    } else {
                        if (musicModel.getUrl() == null) {
                            return;
                        }
                        c1485060okS.LIZIZ = musicModel.getUrl().getUrlList();
                        c1485060okS.LIZLLL = musicModel.getRealAuditionDuration();
                        str = (String) ListProtector.get(musicModel.getUrl().getUrlList(), 0);
                        urlKey = musicModel.getUrl().getUrlKey();
                        c1485060okS.LJIIJ = urlKey;
                    }
                    c1485060okS.LIZJ = 4;
                    if (C0C64.LJIILLIIL().LJIIIZ(31744, "enable_play_local_cache_music_file", true, true) && localPath == null) {
                        localPath = str;
                    } else {
                        urlKey = null;
                    }
                    String strLIZJ = C1490520otG.LJFF().LIZJ(localPath, urlKey);
                    if (!TextUtils.isEmpty(strLIZJ) && C2354709Kn.LIZIZ(strLIZJ) && new C0VSJ(strLIZJ).length() > 0) {
                        c1485060okS.LIZ = strLIZJ;
                        this.LLILZ.LIZIZ(c1485060okS);
                        C15IZ c15iz = this.LLILZLL;
                        if (c15iz != null) {
                            c15iz.LIZ();
                        }
                        LJFF();
                        return;
                    }
                    if (musicModel.isNeedSetCookie()) {
                        String strLLIZ = C2204961BRm.LLIZ(C786410Ut5.A2(), str, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOe9cJbNkicrValdse6ieMEN2JIQW5L6Wu/1t3UDYuUG", null));
                        HashMap<String, String> map = new HashMap<>();
                        map.put("cookie", strLLIZ);
                        c1485060okS.LJ = map;
                    }
                    this.LLILZ.LIZIZ(c1485060okS);
                    LJFF();
                    return;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            C19FO c19fo = (C19FO) this.LL.LLILLL();
            if (c19fo == null) {
                return;
            }
            new SafeHandler(c19fo).post(new ARunnableS105S0100000_5(activityLLILLL, 125));
        }
    }

    @Override // X.InterfaceC20500415Jq
    public final void ag(int i, MusicModel musicModel, boolean z, boolean z2, boolean z3) {
        Xf(musicModel, i, z, z2, z3, false, false);
    }

    public final void LIZIZ(String str, MusicWaveBean musicWaveBean, Boolean bool, boolean z, MusicModel musicModel, String str2) {
        musicModel.setMusicWaveBean(musicWaveBean);
        if (C0EM1.LIZ(musicModel.getMusicId()) != null) {
            IAVPerformance iAVPerformanceProvideAVPerformance = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).provideAVPerformance();
            PerformanceMonitor performanceMonitorLIZ = C0EM1.LIZ(musicModel.getMusicId());
            Objects.requireNonNull(performanceMonitorLIZ);
            iAVPerformanceProvideAVPerformance.step(performanceMonitorLIZ, "music download success");
        }
        if (musicModel.getFullSongDetail() != null && musicModel.isFullSong && !bool.booleanValue() && !z) {
            musicModel.setMusicStart((int) (musicModel.getPreviewStartTime() * 1000.0f));
            musicModel.setMusicStartFromCut((int) (musicModel.getPreviewStartTime() * 1000.0f));
            musicModel.setClipShootDuration(musicModel.getShootDuration().intValue());
            musicModel.setShootDuration(Integer.valueOf(musicModel.getFullSongShootDuration()));
            musicModel.setDuration((int) (musicModel.getFullSongDetail().getFullSongShootDurationPrecision().floatValue() * 1000.0f));
        }
        LJIILJJIL(musicModel, str, str2);
        LJIIIIZZ(musicModel, this.LLJ, "success");
        MobClick mobClickObtain = MobClick.obtain();
        mobClickObtain.setEventName("music_download_end");
        mobClickObtain.setLabelName("perf_monitor");
        mobClickObtain.setExtValueString(musicModel.getMusicId());
        C736480Suk c736480Suk = new C736480Suk();
        c736480Suk.LIZ("is_success", String.valueOf(1));
        c736480Suk.LIZ("downloadStrategy", String.valueOf(((IMusicService) ServiceManager.get().getService(IMusicService.class)).LJIIJJI()));
        mobClickObtain.setJsonObject(c736480Suk.LIZIZ());
        C20684815ws.onEvent(mobClickObtain);
    }

    public final void LIZLLL(final MusicModel musicModel, final String str, final boolean z, final boolean z2, final boolean z3, final boolean z4) {
        C15O7 c15o7LIZJ;
        IExternalService iExternalService = (IExternalService) ServiceManager.get().getService(IExternalService.class);
        iExternalService.provideAVPerformance().start("av_music_download", "MusicDownloadPlayHelper start");
        if (C0EM1.LIZ(musicModel.getMusicId()) != null) {
            IAVPerformance iAVPerformanceProvideAVPerformance = iExternalService.provideAVPerformance();
            PerformanceMonitor performanceMonitorLIZ = C0EM1.LIZ(musicModel.getMusicId());
            Objects.requireNonNull(performanceMonitorLIZ);
            iAVPerformanceProvideAVPerformance.step(performanceMonitorLIZ, "start download music");
        }
        if (!TextUtils.isEmpty(musicModel.getBindChallengeId()) && !TextUtils.equals(musicModel.getBindChallengeId(), CardStruct.IStatusCode.DEFAULT)) {
            ACallableS416S0100000_9 aCallableS416S0100000_9 = new ACallableS416S0100000_9(musicModel, 11);
            if (((Boolean) C04TP.LIZ.getValue()).booleanValue()) {
                c15o7LIZJ = C15O7.LIZIZ(aCallableS416S0100000_9, C823050WQl.LIZLLL(), null);
            } else {
                c15o7LIZJ = C15O7.LIZJ(aCallableS416S0100000_9);
            }
            c15o7LIZJ.LJ(new InterfaceC2385309Wh() { // from class: X.15Jg
                public final /* synthetic */ boolean LJ = false;

                @Override // X.InterfaceC2385309Wh
                public final Object then(C15O7 c15o7) {
                    MusicDownloadPlayHelper musicDownloadPlayHelper = this.LIZ;
                    MusicModel musicModel2 = musicModel;
                    String str2 = str;
                    boolean z5 = z;
                    boolean z6 = this.LJ;
                    boolean z7 = z2;
                    boolean z8 = z3;
                    boolean z9 = z4;
                    musicDownloadPlayHelper.getClass();
                    C1C7U.LIZ("MusicDownloadPlayHelper@f063.getDownload$2L");
                    if (musicDownloadPlayHelper.LLJJIJIL.get(musicModel2.getMusicId()).booleanValue()) {
                        if (!c15o7.LJIILIIL() && !c15o7.LJIILL()) {
                            musicDownloadPlayHelper.LJIIJJI(musicModel2, str2, z5, z6, z7, z8, z9);
                        } else {
                            musicDownloadPlayHelper.dismissDialog();
                        }
                    }
                    C1C7U.LIZIZ("MusicDownloadPlayHelper@f063.getDownload$2L");
                    return null;
                }
            }, C15O7.LJIIIIZZ, null);
            return;
        }
        LJIIJJI(musicModel, str, z, false, z2, z3, z4);
    }

    public final void LJIIJJI(final MusicModel musicModel, final String str, final boolean z, boolean z2, final boolean z3, boolean z4, boolean z5) {
        float f;
        int i;
        Activity activityLLILLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MusicDownloadPlayHelper startMusicDownload: useVeStream: ");
        sbLIZ.append(z4);
        sbLIZ.append("usePlayerStream ");
        sbLIZ.append(z5);
        sbLIZ.append("enterFrom ");
        sbLIZ.append(this.LLJJJJJIL);
        C201955140j.LIZIZ("MusicStreamDownload", C2188811AlT.LIZIZ(sbLIZ));
        if (z2) {
            InterfaceC20499515Jh interfaceC20499515Jh = this.LL;
            if (interfaceC20499515Jh != null) {
                this.LLJILJILJ = true;
                if (interfaceC20499515Jh.LLILLL() != null) {
                    LJIIIZ();
                    C15I0.LIZ().pause();
                    ProgressDialogC1399760mWs progressDialogC1399760mWs = this.LLILLL;
                    if (progressDialogC1399760mWs != null) {
                        progressDialogC1399760mWs.dismiss();
                        C785410UrT.LIZ(progressDialogC1399760mWs);
                    }
                    this.LL.ba(musicModel);
                    return;
                }
                return;
            }
            return;
        }
        if (z5) {
            InterfaceC20499515Jh interfaceC20499515Jh2 = this.LL;
            if (interfaceC20499515Jh2 != null) {
                activityLLILLL = interfaceC20499515Jh2.LLILLL();
            } else {
                activityLLILLL = null;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            String strLIZIZ = C202045143v.LIZIZ(musicModel.getDownloadUrl(), musicModel.getMusicId(), musicModel.getDownloadUrlKey());
            if (strLIZIZ != null) {
                LIZIZ(strLIZIZ, null, Boolean.TRUE, false, musicModel, str);
                return;
            }
            String strLIZ = C1403010mc7.LIZ.getMusicService().LIZ(musicModel);
            if (C1487190ont.LIZ(strLIZ)) {
                LIZIZ(strLIZ, null, Boolean.FALSE, false, musicModel, str);
                return;
            }
            String downloadUrl = musicModel.getDownloadUrl();
            if (downloadUrl == null) {
                LIZJ(new C202035143l(4, ""), musicModel);
                return;
            }
            if (activityLLILLL != null) {
                try {
                    if (C036E.LIZ.LIZIZ()) {
                        C201955140j.LIZIZ("ImageModeMusicStream", "music panel use url stream play");
                        LIZIZ(downloadUrl, null, Boolean.FALSE, true, musicModel, str);
                        C202045143v.LIZLLL(jCurrentTimeMillis, this.LLJJJJJIL, true, false);
                        return;
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                creativeToastBuilder.message(activityLLILLL.getString(2131837962));
                creativeToastBuilder.isTuxToast(true);
                C1390380mHk.LIZJ(activityLLILLL, 6001, creativeToastBuilder);
            }
            LIZJ(new C202035143l(1001, ""), musicModel);
            C202045143v.LIZLLL(jCurrentTimeMillis, this.LLJJJJJIL, false, false);
            return;
        }
        if (z4) {
            C1622290sJn c1622290sJn = new C1622290sJn(this.LLJJJJJIL);
            InterfaceC202048143y interfaceC202048143y = new InterfaceC202048143y() { // from class: X.15Jl
                @Override // X.InterfaceC202048143y
                public final void LJJJLIIL(String str2) {
                }

                @Override // X.InterfaceC202048143y
                public final void LIZIZ() {
                    this.LJ.LJIILIIL(musicModel, str, z, z3);
                }

                @Override // X.InterfaceC202048143y
                public final void LIZ(int i2, String str2) {
                    this.LJ.LIZJ(new C202035143l(i2, str2), musicModel);
                }

                @Override // X.InterfaceC202048143y
                public final void LIZJ(String str2, boolean z6) {
                    this.LJ.LIZIZ(str2, null, Boolean.FALSE, true, musicModel, str);
                }
            };
            MusicStreamConfig musicStreamConfig = this.LLJJIII;
            if (musicStreamConfig != null) {
                f = musicStreamConfig.startPlayProgress;
            } else {
                f = 1000.0f;
            }
            if (musicStreamConfig != null) {
                i = musicStreamConfig.netLevelThreshold;
            } else {
                i = 100;
            }
            C202045143v.LJ(musicModel, z3, true, c1622290sJn, interfaceC202048143y, f, i);
            return;
        }
        LJIILIIL(musicModel, str, z, z3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC20500415Jq
    public final void Xf(final MusicModel musicModel, final int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        String string;
        boolean z6;
        LifecycleOwner creativeLifecycleOwner;
        boolean z7;
        if (this.LL == null || this.LLIZ == null || musicModel == null) {
            return;
        }
        this.LLJILLL = musicModel;
        this.LLJILJILJ = false;
        LJI(musicModel, i);
        this.LLIZLLLIL = System.currentTimeMillis();
        if (musicModel.getMusicType() == 0 && !TextUtils.isEmpty(musicModel.getLocalPath())) {
            final PerformanceMonitor performanceMonitorLIZ = C0EM1.LIZ(CardStruct.IStatusCode.DEFAULT);
            if (performanceMonitorLIZ != null) {
                ((IExternalService) ServiceManager.get().getService(IExternalService.class)).provideAVPerformance().step(performanceMonitorLIZ, "start check local music legal");
            }
            if (C1487190ont.LIZ(musicModel.getLocalPath())) {
                LJIILJJIL(musicModel, musicModel.getLocalPath(), LJ(i, this.LLILLJJLI, musicModel.getFromCollectionType(), musicModel.getMusicType()));
                return;
            } else {
                ((IExternalService) ServiceManager.get().getService(IExternalService.class)).abilityService().infoService().mp3Legal(this.LLIZ, musicModel.getLocalPath(), new IAVInfoService.IGetInfoCallback<Integer>() { // from class: X.15Jb
                    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVInfoService.IGetInfoCallback
                    public final void finish(Integer num) {
                        if (num.intValue() == 0) {
                            MusicDownloadPlayHelper musicDownloadPlayHelper = this.LIZLLL;
                            String localPath = musicModel.getLocalPath();
                            MusicModel musicModel2 = musicModel;
                            musicDownloadPlayHelper.LJIILJJIL(musicModel2, localPath, MusicDownloadPlayHelper.LJ(i, this.LIZLLL.LLILLJJLI, musicModel2.getFromCollectionType(), musicModel.getMusicType()));
                            if (performanceMonitorLIZ != null) {
                                ((IExternalService) ServiceManager.get().getService(IExternalService.class)).provideAVPerformance().step(performanceMonitorLIZ, "check local music legal success");
                                return;
                            }
                            return;
                        }
                        Activity activityLLILLL = this.LIZLLL.LL.LLILLL();
                        if (activityLLILLL == null) {
                            return;
                        }
                        C1233040iBy c1233040iBy = new C1233040iBy(activityLLILLL);
                        c1233040iBy.LIZIZ(2131836773);
                        c1233040iBy.LIZLLL();
                        this.LIZLLL.LL.LLJILJILJ(musicModel, new Exception(activityLLILLL.getString(2131837770)));
                    }
                });
                return;
            }
        }
        if ((musicModel.getMusicType() == 3 || musicModel.getMusicType() == 6) && !TextUtils.isEmpty(musicModel.getLocalPath()) && new C0VSJ(musicModel.getLocalPath()).exists()) {
            LJIILJJIL(musicModel, musicModel.getLocalPath(), LJ(i, this.LLILLJJLI, musicModel.getFromCollectionType(), musicModel.getMusicType()));
            return;
        }
        LJIIIZ();
        Context context = this.LLIZ;
        if (context != null) {
            if (!LIZ(context, musicModel)) {
                string = context.getString(2131837770);
            } else {
                if (musicModel.getMusicType() == 1 || musicModel.getMusicType() == 2) {
                    if (z5) {
                        z6 = true;
                    } else {
                        z6 = false;
                        if (z) {
                            final String musicId = musicModel.getMusicId();
                            InterfaceC20499515Jh interfaceC20499515Jh = this.LL;
                            if (interfaceC20499515Jh != null) {
                                C19EG c19eg = (C19EG) interfaceC20499515Jh.LLILLL();
                                this.LLILLL = C1399150mVt.LIZIZ(c19eg, EnumC1399740mWq.VISIBLE_AFTER_5S, new InterfaceC1399770mWt() { // from class: X.15Ji
                                    @Override // X.InterfaceC1399770mWt
                                    public final void LIZ() {
                                        MusicDownloadPlayHelper musicDownloadPlayHelper = this.LIZ;
                                        String str = musicId;
                                        musicDownloadPlayHelper.LLJJIJIL.put(str, Boolean.FALSE);
                                        CountDownTimer countDownTimer = musicDownloadPlayHelper.LLJJI;
                                        if (countDownTimer != null) {
                                            countDownTimer.cancel();
                                        }
                                        musicDownloadPlayHelper.LLILZIL.LJJIIJ(str);
                                        InterfaceC20499515Jh interfaceC20499515Jh2 = musicDownloadPlayHelper.LL;
                                        if (interfaceC20499515Jh2 != null) {
                                            interfaceC20499515Jh2.v2();
                                        }
                                    }
                                });
                                if (c19eg instanceof InterfaceC1603190roz) {
                                    ICreativeSAAService iCreativeSAAService = (ICreativeSAAService) PluggableExtentionKt.pluggableSpi(ICreativeSAAService.class);
                                    if (iCreativeSAAService != null && (creativeLifecycleOwner = iCreativeSAAService.getCreativeLifecycleOwner(c19eg)) != null) {
                                        creativeLifecycleOwner.getLifecycle().addObserver(this);
                                    } else {
                                        Fragment curFragment = ((InterfaceC1603190roz) c19eg).getCurFragment();
                                        if (curFragment != null) {
                                            curFragment.getLifecycle().addObserver(this);
                                        }
                                    }
                                } else {
                                    c19eg.getLifecycle().addObserver(this);
                                }
                            }
                        }
                    }
                    this.LLJJIJIL.put(musicModel.getMusicId(), Boolean.TRUE);
                    String strLJ = LJ(i, this.LLILLJJLI, musicModel.getFromCollectionType(), musicModel.getMusicType());
                    MusicStreamConfig musicStreamConfig = this.LLJJIII;
                    if ((musicStreamConfig != null && musicStreamConfig.isEnable) || z4) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    LIZLLL(musicModel, strLJ, z2, z3, z7, z6);
                    return;
                }
                return;
            }
        } else {
            string = "";
        }
        this.LL.LLJILJILJ(musicModel, new Exception(string));
    }
}
