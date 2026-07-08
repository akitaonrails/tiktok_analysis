package com.ss.android.ugc.aweme.choosemusic.utils;

import X.C036E;
import X.C07N9;
import X.C142I;
import X.C15HE;
import X.C15HO;
import X.C15IK;
import X.C15IY;
import X.C15IZ;
import X.C15JP;
import X.C15JS;
import X.C19FO;
import X.C1C7U;
import X.C786410Ut5;
import X.CountDownTimerC20747916Gv;
import X.InterfaceC1485090okV;
import X.InterfaceC1485100okW;
import X.InterfaceC1485110okX;
import X.InterfaceC1485120okY;
import X.InterfaceC20499215Je;
import X.InterfaceC20499515Jh;
import Y.ARunnableS105S0100000_5;
import android.app.Activity;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.SafeHandler;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.choosemusic.utils.ChooseMusicDownloadPlayHelper;
import com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.musicprovider.MultiMusicPlayManager;
import java.util.List;

/* JADX INFO: loaded from: classes32.dex */
public class ChooseMusicDownloadPlayHelper extends MusicDownloadPlayHelper {
    public Handler LLJJJJLIIL;
    public C15HO LLJJL;
    public C15JP LLJJLIIIJLLLLLLLZ;
    public C15IY LLJL;

    @Override // com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper
    public final void LJIIIZ() {
        CountDownTimer countDownTimer = this.LLJJI;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        if (this.LLJJJJLIIL != null) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 2;
            C786410Ut5.LJLJJL(this.LLJJJJLIIL, messageObtain);
        } else {
            InterfaceC20499215Je interfaceC20499215Je = this.LLILZ;
            if (interfaceC20499215Je != null) {
                interfaceC20499215Je.pause();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper, X.InterfaceC20500415Jq
    public final void Mf() {
        this.LLILZ.LJ(new InterfaceC1485120okY() { // from class: X.15IX
            @Override // X.InterfaceC1485120okY
            public final void LIZ(int i, int i2) {
                ChooseMusicDownloadPlayHelper chooseMusicDownloadPlayHelper = this.LIZ;
                MusicModel musicModel = chooseMusicDownloadPlayHelper.LLJILLL;
                if (musicModel != null) {
                    chooseMusicDownloadPlayHelper.LJIILLIIL(musicModel);
                }
                C15IK.LJIIJ(chooseMusicDownloadPlayHelper.LLJJL, chooseMusicDownloadPlayHelper.LLJILLL, false);
                String musicId = chooseMusicDownloadPlayHelper.LLJILLL.getMusicId();
                if (C15IK.LJIJ == null) {
                    C15IK.LJIJ = new C15IM();
                }
                C15IM c15im = C15IK.LJIJ;
                c15im.LIZ = musicId;
                c15im.LIZJ = 0L;
                c15im.LIZIZ = System.currentTimeMillis();
                c15im.LIZLLL = i2;
                String musicId2 = chooseMusicDownloadPlayHelper.LLJILLL.getMusicId();
                C15IY c15iy = chooseMusicDownloadPlayHelper.LLJL;
                if (c15iy != null && TextUtils.equals(musicId2, c15iy.LIZ)) {
                    long jCurrentTimeMillis = System.currentTimeMillis() - chooseMusicDownloadPlayHelper.LLJL.LIZIZ;
                    new C15M8().LJIIJJI(jCurrentTimeMillis);
                    C2241008qG c2241008qG = new C2241008qG();
                    c2241008qG.LIZ.put("duration", Long.valueOf(jCurrentTimeMillis));
                    C793770VBv.LJ("time_from_click_music_to_start_play", c2241008qG.LJ());
                }
                if (chooseMusicDownloadPlayHelper.LLJILJILJ && chooseMusicDownloadPlayHelper.LLILZ != null) {
                    chooseMusicDownloadPlayHelper.LJIIIZ();
                }
                InterfaceC20499515Jh interfaceC20499515Jh = chooseMusicDownloadPlayHelper.LL;
                if (interfaceC20499515Jh != null && interfaceC20499515Jh.LJI() != null && i2 != 0) {
                    chooseMusicDownloadPlayHelper.LL.LJI().setDuration(i2);
                }
                C15IZ c15iz = chooseMusicDownloadPlayHelper.LLILZLL;
                if (c15iz != null) {
                    c15iz.LIZ();
                }
            }
        });
        this.LLILZ.LIZ(new InterfaceC1485100okW() { // from class: X.15JO
            @Override // X.InterfaceC1485100okW
            public final void LIZIZ() {
                C15JP c15jp = this.LIZ.LLJJLIIIJLLLLLLLZ;
                if (c15jp != null) {
                    c15jp.LIZIZ();
                }
                ChooseMusicDownloadPlayHelper chooseMusicDownloadPlayHelper = this.LIZ;
                if (chooseMusicDownloadPlayHelper.LLJJL.LJII) {
                    C15IK.LJFF(chooseMusicDownloadPlayHelper.LLJILLL.getMusicId());
                    String musicId = this.LIZ.LLJILLL.getMusicId();
                    ChooseMusicDownloadPlayHelper chooseMusicDownloadPlayHelper2 = this.LIZ;
                    C15HO c15ho = chooseMusicDownloadPlayHelper2.LLJJL;
                    MusicModel musicModel = chooseMusicDownloadPlayHelper2.LLJILLL;
                    C15IK.LJIIJJI(musicId, c15ho, musicModel, MusicDownloadPlayHelper.LJ(chooseMusicDownloadPlayHelper2.LLJJ, chooseMusicDownloadPlayHelper2.LLILLJJLI, musicModel.getFromCollectionType(), this.LIZ.LLJILLL.getMusicType()));
                }
            }
        });
        this.LLILZ.LIZJ(new InterfaceC1485110okX() { // from class: X.15JR
            @Override // X.InterfaceC1485110okX
            public final void LIZ(int i, int i2) {
                C15JP c15jp = this.LIZ.LLJJLIIIJLLLLLLLZ;
                if (c15jp != null) {
                    c15jp.LIZ();
                }
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper, X.InterfaceC20500415Jq
    public final void onDestroy() {
        super.onDestroy();
        Handler handler = this.LLJJJJLIIL;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.LLJJJJLIIL = null;
        }
        InterfaceC20499215Je interfaceC20499215Je = this.LLILZ;
        if (interfaceC20499215Je != null) {
            interfaceC20499215Je.LIZ(null);
            this.LLILZ.LIZJ(null);
            this.LLILZ.LJ(null);
            this.LLILZ.release();
        }
        this.LLJJLIIIJLLLLLLLZ = null;
    }

    @Override // com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper, X.InterfaceC20500415Jq
    public final void pause() {
        LJIIIZ();
        MusicModel musicModel = this.LLJILLL;
        if (musicModel == null || this.LLJJL == null) {
            return;
        }
        C15IK.LJFF(musicModel.getMusicId());
        String musicId = this.LLJILLL.getMusicId();
        C15HO c15ho = this.LLJJL;
        MusicModel musicModel2 = this.LLJILLL;
        C15IK.LJIIJJI(musicId, c15ho, musicModel2, MusicDownloadPlayHelper.LJ(this.LLJJ, this.LLILLJJLI, musicModel2.getFromCollectionType(), this.LLJILLL.getMusicType()));
    }

    public final void LJIILLIIL(MusicModel musicModel) {
        if (this.LLILZ instanceof MultiMusicPlayManager) {
            return;
        }
        CountDownTimer countDownTimer = this.LLJJI;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        if (musicModel.getDuration() == musicModel.getAuditionDuration().intValue()) {
            return;
        }
        CountDownTimerC20747916Gv countDownTimerC20747916Gv = new CountDownTimerC20747916Gv(this, musicModel.getRealAuditionDuration(), 0);
        this.LLJJI = countDownTimerC20747916Gv;
        countDownTimerC20747916Gv.start();
    }

    @Override // com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper, X.InterfaceC20500415Jq
    public final void Tf(C15IZ c15iz) {
        InterfaceC20499215Je interfaceC20499215Je = this.LLILZ;
        if (interfaceC20499215Je instanceof MultiMusicPlayManager) {
            ((MultiMusicPlayManager) interfaceC20499215Je).LLILZIL.add(c15iz);
        } else {
            this.LLILZLL = c15iz;
        }
    }

    public ChooseMusicDownloadPlayHelper(InterfaceC20499515Jh interfaceC20499515Jh, C15HE c15he) {
        super(interfaceC20499515Jh, "video_shoot_page");
        if (C07N9.LIZ()) {
            this.LLILZ = new MultiMusicPlayManager(this.LLILZ);
        }
        this.LLJJLIIIJLLLLLLLZ = c15he;
    }

    @Override // com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper, X.InterfaceC20500415Jq
    public final void Nf(int i, InterfaceC1485090okV interfaceC1485090okV) {
        this.LLILZ.Nf(i, new InterfaceC1485090okV() { // from class: X.15JQ
            public final /* synthetic */ InterfaceC1485090okV LIZ = null;

            @Override // X.InterfaceC1485090okV
            public final void LJII(boolean z) {
                InterfaceC1485090okV interfaceC1485090okV2 = this.LIZ;
                if (interfaceC1485090okV2 != null) {
                    interfaceC1485090okV2.LJII(z);
                }
                if (z) {
                    ChooseMusicDownloadPlayHelper chooseMusicDownloadPlayHelper = this.LIZIZ;
                    chooseMusicDownloadPlayHelper.LJIILLIIL(chooseMusicDownloadPlayHelper.LLJILLL);
                }
            }
        });
    }

    public ChooseMusicDownloadPlayHelper(InterfaceC20499515Jh interfaceC20499515Jh, C15JP c15jp) {
        super(interfaceC20499515Jh);
        if (C07N9.LIZ()) {
            this.LLILZ = new MultiMusicPlayManager(this.LLILZ);
        }
        this.LLJJLIIIJLLLLLLLZ = c15jp;
    }

    @Override // com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper
    public final void LJIIJ(MusicModel musicModel, boolean z, int i) {
        Zf(musicModel, i, z, 0, -1);
    }

    @Override // com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper, X.InterfaceC20500415Jq
    public final void Zf(MusicModel musicModel, int i, boolean z, final int i2, final int i3) {
        UrlModel url;
        if (musicModel.getMusicType() == 2) {
            url = musicModel.getReuseAudioPlayUrl();
        } else {
            url = musicModel.getUrl();
        }
        if ((url == null || url.getUrlList() == null || url.getUrlList().isEmpty()) && !musicModel.isLocalMusic()) {
            return;
        }
        C15JS c15js = new C15JS(musicModel, z, i);
        this.LLJL = new C15IY(musicModel.getMusicId(), System.currentTimeMillis());
        this.LLJJJJLIIL = new BPEAHandler(Looper.getMainLooper()) { // from class: com.ss.android.ugc.aweme.choosemusic.utils.ChooseMusicDownloadPlayHelper.1
            @Override // android.os.Handler
            public final void handleMessage(Message message) throws Throwable {
                InterfaceC20499515Jh interfaceC20499515Jh;
                Activity activityLLILLL;
                C1C7U.LIZ("ChooseMusicDownloadPlayHelper@f680.play$1");
                int i4 = message.what;
                if (i4 == 2) {
                    InterfaceC20499215Je interfaceC20499215Je = ChooseMusicDownloadPlayHelper.this.LLILZ;
                    if (interfaceC20499215Je != null) {
                        interfaceC20499215Je.pause();
                    }
                } else if (i4 == 1) {
                    C15JS c15js2 = (C15JS) HandlerHook.getMessageObj(message.obj);
                    ChooseMusicDownloadPlayHelper chooseMusicDownloadPlayHelper = ChooseMusicDownloadPlayHelper.this;
                    if (chooseMusicDownloadPlayHelper.LLILZ instanceof MultiMusicPlayManager) {
                        MusicModel musicModel2 = c15js2.LIZ;
                        int i5 = c15js2.LIZIZ;
                        boolean z2 = c15js2.LIZJ;
                        chooseMusicDownloadPlayHelper.LLJJJ = SystemClock.elapsedRealtime();
                        if (musicModel2 != null && (interfaceC20499515Jh = chooseMusicDownloadPlayHelper.LL) != null && (activityLLILLL = interfaceC20499515Jh.LLILLL()) != null) {
                            try {
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                            if (C036E.LIZ.LIZIZ()) {
                                chooseMusicDownloadPlayHelper.LLJJ = i5;
                                if (C142I.LIZ(musicModel2, activityLLILLL, true)) {
                                    chooseMusicDownloadPlayHelper.LLJILLL = musicModel2;
                                    MultiMusicPlayManager multiMusicPlayManager = (MultiMusicPlayManager) chooseMusicDownloadPlayHelper.LLILZ;
                                    multiMusicPlayManager.LLIZLLLIL = musicModel2;
                                    multiMusicPlayManager.getClass();
                                    multiMusicPlayManager.LLJ = z2;
                                    multiMusicPlayManager.LLJI = 0;
                                    List<MusicModel> mergedMusicList = musicModel2.getMergedMusicList();
                                    if (mergedMusicList != null) {
                                        multiMusicPlayManager.LJII((MusicModel) ListProtector.get(mergedMusicList, 0));
                                    }
                                }
                            } else {
                                C19FO c19fo = (C19FO) chooseMusicDownloadPlayHelper.LL.LLILLL();
                                if (c19fo != null) {
                                    new SafeHandler(c19fo).post(new ARunnableS105S0100000_5(activityLLILLL, 0));
                                }
                            }
                        }
                    } else {
                        ChooseMusicDownloadPlayHelper.super.Zf(c15js2.LIZ, c15js2.LIZIZ, c15js2.LIZJ, i2, i3);
                    }
                }
                C1C7U.LIZIZ("ChooseMusicDownloadPlayHelper@f680.play$1");
            }
        };
        Message messageObtain = Message.obtain();
        messageObtain.what = 1;
        messageObtain.obj = c15js;
        C786410Ut5.LJLJJL(this.LLJJJJLIIL, messageObtain);
    }
}
