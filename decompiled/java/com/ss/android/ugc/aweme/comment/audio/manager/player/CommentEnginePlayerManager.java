package com.ss.android.ugc.aweme.comment.audio.manager.player;

import X.C01GW;
import X.C0VSJ;
import X.C123100dR;
import X.C1341490l0t;
import X.C1341700l1E;
import X.C1348320lBu;
import X.C1351770lHT;
import X.C1351800lHW;
import X.C1383370m6R;
import X.C1470240oMY;
import X.C1C7U;
import X.C2188811AlT;
import X.C452501pT;
import X.InterfaceC1469360oL8;
import X.InterfaceC787410Uuh;
import android.os.Looper;
import android.os.Message;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.comment.audio.manager.player.CommentEnginePlayerManager;
import com.ss.android.ugc.aweme.comment.audio.util.CommentAudioVolumeListener;
import com.ss.android.ugc.aweme.comment.model.AudioCommentModel;
import com.ss.ttvideoengine.TTVideoEngine;
import defpackage.d2;
import fyo.e;
import java.util.Map;
import kotlin.jvm.internal.AFwS200S0000000_13;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentEnginePlayerManager implements d2 {
    public static long LJ;
    public static long LJFF;
    public static final TTVideoEngine LJII;
    public static final MutableLiveData<d2.a> LJIIIIZZ;
    public static final MutableLiveData LJIIIZ;
    public static final MainHandler LJIIJ;
    public static final MutableLiveData<C1341490l0t> LJIIJJI;
    public static final MutableLiveData LJIIL;
    public static final C1341700l1E LJIILIIL;
    public static final CommentEnginePlayerManager LIZ = new CommentEnginePlayerManager();
    public static String LIZIZ = "";
    public static String LIZJ = "";
    public static String LIZLLL = "";
    public static final C01GW LJI = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(103));

    /* JADX INFO: loaded from: classes13.dex */
    public static final class MainHandler extends BPEAHandler {
        public MainHandler() {
            super(Looper.getMainLooper());
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            String str;
            C1C7U.LIZ("CommentEnginePlayerManager$MainHandler@1e95.handleMessage");
            super.handleMessage(message);
            if (message.what == 1001) {
                Object messageObj = HandlerHook.getMessageObj(message.obj);
                if (!(messageObj instanceof String) || (str = (String) messageObj) == null) {
                    str = "";
                }
                if (Intrinsics.LJFF(CommentEnginePlayerManager.LIZIZ, str) && str.length() > 0 && !CommentEnginePlayerManager.LJII.LJJZZIII()) {
                    CommentEnginePlayerManager.LJIIIIZZ.setValue(new d2.a.b(CommentEnginePlayerManager.LIZIZ));
                }
            }
            C1C7U.LIZIZ("CommentEnginePlayerManager$MainHandler@1e95.handleMessage");
        }
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [X.0l1E] */
    static {
        TTVideoEngine tTVideoEngine = new TTVideoEngine(C1383370m6R.LIZ, 0);
        tTVideoEngine.LIZJ(480, 1);
        tTVideoEngine.LIZJ(7, 1);
        tTVideoEngine.LIZJ(0, 1);
        tTVideoEngine.LLJILLL(new InterfaceC1469360oL8() { // from class: X.0lHb
            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LIZIZ(TTVideoEngine tTVideoEngine2) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJ(TTVideoEngine tTVideoEngine2) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJFF(int i, EnumC2281151EQn enumC2281151EQn) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJIIIIZZ(TTVideoEngine tTVideoEngine2) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJIIIZ(TTVideoEngine tTVideoEngine2) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJIIJJI(TTVideoEngine tTVideoEngine2, int i, int i2) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJIIL(TTVideoEngine tTVideoEngine2, int i) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJIILIIL(TTVideoEngine tTVideoEngine2) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJIJI(TTVideoEngine tTVideoEngine2, int i) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJIJJ(int i) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJIJJLI(int i) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJIL(TTVideoEngine tTVideoEngine2, int i) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJJII(int i, int i2) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJJIIJ(int i, int i2) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJJIJ(Map map) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJJJJJL(TTVideoEngine tTVideoEngine2, int i, long j, long j2, Map map) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJJJJLL(TTVideoEngine tTVideoEngine2) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJJJLIIL(int i, int i2, int i3) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJJJLZIJ(TTVideoEngine tTVideoEngine2, int i, C1467860oIi c1467860oIi) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJJL(e eVar, String str) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJJLIIIIJ(int i) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJJLIIIJJIZ(TTVideoEngine tTVideoEngine2) {
            }

            @Override // X.InterfaceC1469360oL8
            public final void LJI(e eVar) {
                int i;
                Fragment fragmentLIZLLL;
                CommentEnginePlayerManager commentEnginePlayerManager = CommentEnginePlayerManager.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onError, error= ");
                sbLIZ.append(eVar);
                sbLIZ.append(" playId = ");
                sbLIZ.append(CommentEnginePlayerManager.LIZIZ);
                C1344030l4z.LIZ("CommentPlayerManger", C2188811AlT.LIZIZ(sbLIZ));
                MutableLiveData<d2.a> mutableLiveData = CommentEnginePlayerManager.LJIIIIZZ;
                String str = CommentEnginePlayerManager.LIZIZ;
                if (eVar != null) {
                    i = eVar.LIZ;
                } else {
                    i = 0;
                }
                mutableLiveData.setValue(new d2.a.d(str, i));
                CommentEnginePlayerManager.LIZIZ = "";
                AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
                if (abstractC1387200mCcLIZIZ != null && (fragmentLIZLLL = abstractC1387200mCcLIZIZ.LIZLLL()) != null) {
                    C1389880mGw c1389880mGw = new C1389880mGw(fragmentLIZLLL);
                    c1389880mGw.LJIIIIZZ(2131826736);
                    c1389880mGw.LJIIJ();
                }
                CommentEnginePlayerManager.LJIIJ.removeMessages(1001);
                CommentEnginePlayerManager.LIZ.LJIIL().LIZIZ();
            }

            @Override // X.InterfaceC1469360oL8
            public final void LJIILL(TTVideoEngine tTVideoEngine2) {
                CommentEnginePlayerManager commentEnginePlayerManager = CommentEnginePlayerManager.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onCompletion playId = ");
                sbLIZ.append(CommentEnginePlayerManager.LIZIZ);
                C2188811AlT.LIZIZ(sbLIZ);
                CommentEnginePlayerManager.LJIIJ.removeMessages(1001);
                if (CommentEnginePlayerManager.LIZIZ.length() == 0) {
                    return;
                }
                CommentEnginePlayerManager.LJIIIIZZ.setValue(new d2.a.c(CommentEnginePlayerManager.LIZIZ, CommentEnginePlayerManager.LIZLLL, Long.valueOf(System.currentTimeMillis() - CommentEnginePlayerManager.LJ)));
                CommentEnginePlayerManager.LIZIZ = "";
                CommentEnginePlayerManager.LIZJ = "";
                CommentEnginePlayerManager.LJFF = 0L;
                CommentEnginePlayerManager.LIZ.LJIIL().LIZIZ();
            }

            @Override // X.InterfaceC1469360oL8
            public final void LIZJ(TTVideoEngine tTVideoEngine2, int i) {
                long jCurrentTimeMillis;
                int iLJJJIL;
                CommentEnginePlayerManager commentEnginePlayerManager = CommentEnginePlayerManager.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onPlaybackStateChanged -> ");
                sbLIZ.append(i);
                sbLIZ.append(" playId = ");
                sbLIZ.append(CommentEnginePlayerManager.LIZIZ);
                C2188811AlT.LIZIZ(sbLIZ);
                CommentEnginePlayerManager.LJIIJ.removeMessages(1001);
                int iLJJJJL = 0;
                if (CommentEnginePlayerManager.LIZIZ.length() == 0) {
                    return;
                }
                if (i != 1) {
                    if (i == 2) {
                        MutableLiveData<d2.a> mutableLiveData = CommentEnginePlayerManager.LJIIIIZZ;
                        String str = CommentEnginePlayerManager.LIZIZ;
                        if (tTVideoEngine2 != null) {
                            iLJJJIL = tTVideoEngine2.LJJJIL();
                            iLJJJJL = tTVideoEngine2.LJJJJL();
                        } else {
                            iLJJJIL = 0;
                        }
                        mutableLiveData.setValue(new d2.a.f(iLJJJIL, iLJJJJL, Long.valueOf(System.currentTimeMillis() - CommentEnginePlayerManager.LJ), str, CommentEnginePlayerManager.LIZJ, CommentEnginePlayerManager.LIZLLL));
                    }
                } else {
                    CommentEnginePlayerManager.LJ = System.currentTimeMillis();
                    if (CommentEnginePlayerManager.LJFF != 0) {
                        jCurrentTimeMillis = System.currentTimeMillis() - CommentEnginePlayerManager.LJFF;
                    } else {
                        jCurrentTimeMillis = 0;
                    }
                    MutableLiveData<d2.a> mutableLiveData2 = CommentEnginePlayerManager.LJIIIIZZ;
                    String str2 = CommentEnginePlayerManager.LIZIZ;
                    long j = CommentEnginePlayerManager.LJ;
                    if (tTVideoEngine2 != null) {
                        iLJJJJL = tTVideoEngine2.LJJJJL();
                    }
                    mutableLiveData2.setValue(new d2.a.g(iLJJJJL, j, jCurrentTimeMillis, str2));
                }
                CommentEnginePlayerManager.LIZJ = "";
                CommentEnginePlayerManager.LJFF = 0L;
            }

            @Override // X.InterfaceC1469360oL8
            public final void LJIJ(TTVideoEngine tTVideoEngine2, int i) {
                CommentEnginePlayerManager commentEnginePlayerManager = CommentEnginePlayerManager.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onLoadStateChanged, loadState= ");
                sbLIZ.append(i);
                sbLIZ.append(" playId = ");
                sbLIZ.append(CommentEnginePlayerManager.LIZIZ);
                C2188811AlT.LIZIZ(sbLIZ);
                CommentEnginePlayerManager.LJIIJ.removeMessages(1001);
                if (CommentEnginePlayerManager.LIZIZ.length() == 0) {
                    return;
                }
                if (i != 1) {
                    if (i == 2) {
                        CommentEnginePlayerManager.LJIIIIZZ.setValue(new d2.a.b(CommentEnginePlayerManager.LIZIZ));
                        return;
                    }
                    return;
                }
                CommentEnginePlayerManager.LJIIIIZZ.setValue(new d2.a.C0035a(CommentEnginePlayerManager.LIZIZ));
            }

            @Override // X.InterfaceC1469360oL8
            public final void LJJJJJ(TTVideoEngine tTVideoEngine2, int i) {
                CommentEnginePlayerManager commentEnginePlayerManager = CommentEnginePlayerManager.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onCurrentPlaybackTimeUpdate: currentPlaybackTime -> ");
                sbLIZ.append(i);
                sbLIZ.append(" playId = ");
                sbLIZ.append(CommentEnginePlayerManager.LIZIZ);
                C2188811AlT.LIZIZ(sbLIZ);
            }
        });
        LJII = tTVideoEngine;
        MutableLiveData<d2.a> mutableLiveData = new MutableLiveData<>(d2.a.e.LIZ);
        LJIIIIZZ = mutableLiveData;
        LJIIIZ = mutableLiveData;
        LJIIJ = new MainHandler();
        MutableLiveData<C1341490l0t> mutableLiveData2 = new MutableLiveData<>();
        LJIIJJI = mutableLiveData2;
        LJIIL = mutableLiveData2;
        LJIILIIL = new InterfaceC787410Uuh() { // from class: X.0l1E
            @Override // X.InterfaceC787410Uuh
            public final void LIZ(int i, boolean z) {
                CommentEnginePlayerManager commentEnginePlayerManager = CommentEnginePlayerManager.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("isTurnUp = ");
                sbLIZ.append(z);
                sbLIZ.append(", currentVolume = ");
                sbLIZ.append(i);
                C2188811AlT.LIZIZ(sbLIZ);
                CommentEnginePlayerManager.LJIIJJI.setValue(new C1341490l0t(z, i, CommentEnginePlayerManager.LIZIZ));
            }
        };
    }

    @Override // defpackage.d2
    public final boolean LIZJ() {
        d2.a value = LJIIIIZZ.getValue();
        return (value instanceof d2.a.g) || (value instanceof d2.a.h) || (value instanceof d2.a.b) || (value instanceof d2.a.C0035a);
    }

    @Override // defpackage.d2
    public final int LJFF() {
        TTVideoEngine tTVideoEngine = LJII;
        if (tTVideoEngine.LJJZZIII()) {
            return tTVideoEngine.LJJJIL();
        }
        return 0;
    }

    public final CommentAudioVolumeListener LJIIL() {
        return (CommentAudioVolumeListener) LJI.getValue();
    }

    @Override // defpackage.d2
    public final LiveData<d2.a> LIZLLL() {
        return LJIIIZ;
    }

    @Override // defpackage.d2
    public final float LIZ(String str) {
        if (!LJII.LIZ.LJJIIJ) {
            return 0.0f;
        }
        if (!Intrinsics.LJFF(str, LIZIZ)) {
            return 1.0f;
        }
        return LJFF() / r2.LJJJJL();
    }

    @Override // defpackage.d2
    public final void LIZIZ(String str) {
        LIZJ = str;
        LJII.pause();
        LJIIL().LIZIZ();
    }

    @Override // defpackage.d2
    public final void LJ(String str) {
        if (!Intrinsics.LJFF(str, LIZIZ)) {
            return;
        }
        LIZLLL = "resume";
        CommentAudioVolumeListener.LIZ(LJIIL(), LJIILIIL);
        LJII.start();
    }

    @Override // defpackage.d2
    public final void LJII(String str) {
        long jCurrentTimeMillis;
        if (C123100dR.LIZ(LIZIZ)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("stopAudio but isNot prepared playId = ");
            sbLIZ.append(LIZIZ);
            C2188811AlT.LIZIZ(sbLIZ);
            LJIIJ.removeMessages(1001);
            if (LIZJ()) {
                jCurrentTimeMillis = System.currentTimeMillis() - LJ;
            } else {
                jCurrentTimeMillis = 0;
            }
            MutableLiveData<d2.a> mutableLiveData = LJIIIIZZ;
            mutableLiveData.setValue(new d2.a.i(LIZIZ, str, LIZLLL, Long.valueOf(jCurrentTimeMillis), Boolean.valueOf(mutableLiveData.getValue() instanceof d2.a.f)));
            LIZIZ = "";
        }
        LJII.stop();
        LJIIL().LIZIZ();
    }

    @Override // defpackage.d2
    public final boolean LJIIJ(String str) {
        return Intrinsics.LJFF(LIZIZ, str);
    }

    @Override // defpackage.d2
    public final int LJIIJJI(String str) {
        TTVideoEngine tTVideoEngine = LJII;
        if (!tTVideoEngine.LJJZZIII() || !Intrinsics.LJFF(str, LIZIZ)) {
            return -1;
        }
        return tTVideoEngine.LJJJJL();
    }

    @Override // defpackage.d2
    public final void LJI(String str, String str2) {
        if (!Intrinsics.LJFF(str, LIZIZ)) {
            return;
        }
        LIZJ = str2;
        LJII.pause();
        LJIIL().LIZIZ();
    }

    @Override // defpackage.d2
    public final void LJIIIIZZ(String str, String str2) {
        long jCurrentTimeMillis;
        if (Intrinsics.LJFF(str, LIZIZ) && LIZIZ.length() != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("stopAudio but isNot prepared playId = ");
            sbLIZ.append(LIZIZ);
            C2188811AlT.LIZIZ(sbLIZ);
            LJIIJ.removeMessages(1001);
            if (LIZJ()) {
                jCurrentTimeMillis = System.currentTimeMillis() - LJ;
            } else {
                jCurrentTimeMillis = 0;
            }
            MutableLiveData<d2.a> mutableLiveData = LJIIIIZZ;
            mutableLiveData.setValue(new d2.a.i(LIZIZ, str2, LIZLLL, Long.valueOf(jCurrentTimeMillis), Boolean.valueOf(mutableLiveData.getValue() instanceof d2.a.f)));
            LIZIZ = "";
            LJII.stop();
            LJIIL().LIZIZ();
        }
    }

    @Override // defpackage.d2
    public final void LJIIIZ(String str, AudioCommentModel audioCommentModel) {
        String str2;
        if (!C1351800lHW.LIZIZ) {
            C1351800lHW.LIZIZ = true;
            C1348320lBu.LIZ.LIZLLL().observeForever(C1351770lHT.LL);
        }
        boolean zLIZ = C123100dR.LIZ(LIZIZ);
        if (zLIZ) {
            str2 = "play_another_audio";
        } else {
            str2 = null;
        }
        LJII(str2);
        LIZIZ = str;
        LIZLLL = "start";
        LJFF = System.currentTimeMillis();
        if (new C0VSJ(audioCommentModel.audioFilePath).exists()) {
            LJII.LJIJ(audioCommentModel.audioFilePath);
        } else if (C123100dR.LIZ(audioCommentModel.videoModelStr)) {
            try {
                TTVideoEngine tTVideoEngine = LJII;
                C1470240oMY c1470240oMY = new C1470240oMY();
                c1470240oMY.LJJIJIIJIL(new JSONObject(audioCommentModel.videoModelStr));
                tTVideoEngine.LLJJIJI(c1470240oMY);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        } else if (C123100dR.LIZ(audioCommentModel.vid)) {
            LJII.LJJIIZ(audioCommentModel.vid);
        }
        LJIIIIZZ.setValue(new d2.a.h(LIZIZ, zLIZ));
        TTVideoEngine tTVideoEngine2 = LJII;
        tTVideoEngine2.LLILII(0);
        tTVideoEngine2.play();
        tTVideoEngine2.LIZJ(329, 0);
        CommentAudioVolumeListener.LIZ(LJIIL(), LJIILIIL);
        MainHandler mainHandler = LJIIJ;
        mainHandler.removeMessages(1001);
        Message messageObtain = Message.obtain();
        messageObtain.what = 1001;
        messageObtain.obj = str;
        mainHandler.sendMessageDelayed(messageObtain, 1300L);
    }
}
