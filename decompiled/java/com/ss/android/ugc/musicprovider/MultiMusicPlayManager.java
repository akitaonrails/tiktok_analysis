package com.ss.android.ugc.musicprovider;

import X.C0C64;
import X.C0PDN;
import X.C0VSJ;
import X.C0WZX;
import X.C123100dR;
import X.C1458340o3M;
import X.C1458350o3N;
import X.C1485020okO;
import X.C1485060okS;
import X.C1490520otG;
import X.C15IZ;
import X.C15JY;
import X.C1C7U;
import X.C20501115Jx;
import X.C2204961BRm;
import X.C2354709Kn;
import X.C786410Ut5;
import X.InterfaceC1475840oVa;
import X.InterfaceC1485080okU;
import X.InterfaceC1485090okV;
import X.InterfaceC1485100okW;
import X.InterfaceC1485110okX;
import X.InterfaceC1485120okY;
import X.InterfaceC20499215Je;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.musicprovider.MultiMusicPlayManager;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes32.dex */
public final class MultiMusicPlayManager implements InterfaceC20499215Je {
    public final InterfaceC20499215Je LL;
    public final CopyOnWriteArrayList<InterfaceC1485100okW> LLILLJJLI = new CopyOnWriteArrayList<>();
    public final CopyOnWriteArrayList<InterfaceC1485120okY> LLILLL = new CopyOnWriteArrayList<>();
    public final CopyOnWriteArrayList<InterfaceC1485110okX> LLILZ = new CopyOnWriteArrayList<>();
    public final CopyOnWriteArrayList<C15IZ> LLILZIL = new CopyOnWriteArrayList<>();
    public final C15JY LLILZLL = new C15JY(this);
    public final MultiMusicPlayManager$handler$1 LLIZ;
    public MusicModel LLIZLLLIL;
    public boolean LLJ;
    public volatile int LLJI;

    @Override // X.InterfaceC20499215Je
    public final int K2() {
        return this.LL.K2();
    }

    @Override // X.InterfaceC20499215Je
    public final void LIZIZ(C1485060okS c1485060okS) {
        this.LL.LIZIZ(c1485060okS);
    }

    @Override // X.InterfaceC20499215Je
    public final void LIZLLL(C0PDN c0pdn) {
        this.LL.LIZLLL(c0pdn);
    }

    @Override // X.InterfaceC20499215Je
    public final void LJFF(String str, String str2, InterfaceC1475840oVa interfaceC1475840oVa) {
        this.LL.LJFF(str, str2, interfaceC1475840oVa);
    }

    @Override // X.InterfaceC20499215Je
    public final int LJI() {
        return this.LL.LJI();
    }

    @Override // X.InterfaceC20499215Je
    public final void LJIILLIIL(float f, float f2) {
        this.LL.LJIILLIIL(f, f2);
    }

    @Override // X.InterfaceC20499215Je
    public final void Nf(int i, InterfaceC1485090okV interfaceC1485090okV) {
        this.LL.Nf(i, interfaceC1485090okV);
    }

    @Override // X.InterfaceC20499215Je
    public final void Of(InterfaceC1485080okU interfaceC1485080okU) {
        this.LL.Of(interfaceC1485080okU);
    }

    @Override // X.InterfaceC20499215Je
    public final boolean isPlaying() {
        return this.LL.isPlaying();
    }

    @Override // X.InterfaceC20499215Je
    public final void pause() {
        this.LL.pause();
    }

    @Override // X.InterfaceC20499215Je
    public final void release() {
        this.LL.release();
    }

    @Override // X.InterfaceC20499215Je
    public final void resume() {
        this.LL.resume();
    }

    @Override // X.InterfaceC20499215Je
    public final void stop() {
        this.LL.stop();
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.ss.android.ugc.musicprovider.MultiMusicPlayManager$handler$1] */
    public MultiMusicPlayManager(InterfaceC20499215Je interfaceC20499215Je) {
        this.LL = interfaceC20499215Je;
        final Looper mainLooper = Looper.getMainLooper();
        this.LLIZ = new BPEAHandler(mainLooper) { // from class: com.ss.android.ugc.musicprovider.MultiMusicPlayManager$handler$1
            @Override // android.os.Handler
            public final void handleMessage(Message message) throws Throwable {
                C1C7U.LIZ("MultiMusicPlayManager@12f8.handler$1");
                int i = message.what;
                if (i != 2 && i == 1) {
                    this.LL.LJII(((C20501115Jx) HandlerHook.getMessageObj(message.obj)).LIZ);
                }
                C1C7U.LIZIZ("MultiMusicPlayManager@12f8.handler$1");
            }
        };
        interfaceC20499215Je.LIZ(new InterfaceC1485100okW() { // from class: X.15Jd
            @Override // X.InterfaceC1485100okW
            public final void LIZIZ() {
                List<MusicModel> mergedMusicList;
                MusicModel musicModel = this.LIZ.LLIZLLLIL;
                if (musicModel == null || (mergedMusicList = musicModel.getMergedMusicList()) == null) {
                    return;
                }
                MultiMusicPlayManager multiMusicPlayManager = this.LIZ;
                multiMusicPlayManager.LLJI++;
                if (multiMusicPlayManager.LLJI < mergedMusicList.size()) {
                    C20501115Jx c20501115Jx = new C20501115Jx((MusicModel) ListProtector.get(mergedMusicList, multiMusicPlayManager.LLJI));
                    Message messageObtain = Message.obtain();
                    messageObtain.what = 1;
                    messageObtain.obj = c20501115Jx;
                    multiMusicPlayManager.LLIZ.sendMessage(messageObtain);
                    return;
                }
                if (!multiMusicPlayManager.LLJ) {
                    Iterator<InterfaceC1485100okW> it2 = multiMusicPlayManager.LLILLJJLI.iterator();
                    while (it2.hasNext()) {
                        it2.next().LIZIZ();
                    }
                } else {
                    multiMusicPlayManager.LLJI = 0;
                    C20501115Jx c20501115Jx2 = new C20501115Jx((MusicModel) ListProtector.get(mergedMusicList, 0));
                    Message messageObtain2 = Message.obtain();
                    messageObtain2.what = 1;
                    messageObtain2.obj = c20501115Jx2;
                    multiMusicPlayManager.LLIZ.sendMessage(messageObtain2);
                }
            }
        });
        interfaceC20499215Je.LJ(new InterfaceC1485120okY() { // from class: X.15Jj
            @Override // X.InterfaceC1485120okY
            public final void LIZ(int i, int i2) {
                if (this.LIZ.LLJI == 0) {
                    Iterator<InterfaceC1485120okY> it2 = this.LIZ.LLILLL.iterator();
                    while (it2.hasNext()) {
                        it2.next().LIZ(i, i2);
                    }
                    this.LIZ.LLILZLL.LIZ();
                }
            }
        });
        interfaceC20499215Je.LIZJ(new InterfaceC1485110okX() { // from class: X.15Jo
            @Override // X.InterfaceC1485110okX
            public final void LIZ(int i, int i2) {
                Iterator<InterfaceC1485110okX> it2 = this.LIZ.LLILZ.iterator();
                while (it2.hasNext()) {
                    it2.next().LIZ(i, i2);
                }
            }
        });
    }

    @Override // X.InterfaceC20499215Je
    public final void LIZ(InterfaceC1485100okW interfaceC1485100okW) {
        this.LLILLJJLI.add(interfaceC1485100okW);
    }

    @Override // X.InterfaceC20499215Je
    public final void LIZJ(InterfaceC1485110okX interfaceC1485110okX) {
        this.LLILZ.add(interfaceC1485110okX);
    }

    @Override // X.InterfaceC20499215Je
    public final void LJ(InterfaceC1485120okY interfaceC1485120okY) {
        this.LLILLL.add(interfaceC1485120okY);
    }

    public final void LJII(MusicModel musicModel) throws Throwable {
        String str;
        this.LL.stop();
        String localPath = musicModel.getLocalPath();
        C1485060okS c1485060okS = new C1485060okS();
        if (musicModel.getMusicType() != 1 && musicModel.getMusicType() != 2) {
            if (musicModel.isLocalMusic()) {
                c1485060okS.LJFF = musicModel.getMusicId();
                c1485060okS.LIZ = musicModel.getLocalPath();
                c1485060okS.LJII = 0;
                c1485060okS.LJIIIIZZ = -1;
                this.LL.LIZIZ(c1485060okS);
                return;
            }
            return;
        }
        c1485060okS.LJFF = musicModel.getMusicId();
        c1485060okS.LJIIIZ = 0;
        c1485060okS.LJII = 0;
        c1485060okS.LJIIIIZZ = -1;
        if (C1458350o3N.LIZ()) {
            if (C123100dR.LIZ(musicModel.getMusicVolumeInfo())) {
                float f = C1458340o3M.LIZ;
                if (C1485020okO.LIZLLL(Float.valueOf(f))) {
                    c1485060okS.LJIIJJI = musicModel.getMusicVolumeInfo();
                    c1485060okS.LJIIL = f;
                    musicModel.getMusicVolumeInfo();
                    musicModel.getMusicId();
                } else {
                    musicModel.getMusicVolumeInfo();
                    musicModel.getMusicId();
                }
            } else {
                musicModel.getMusicVolumeInfo();
                musicModel.getMusicId();
            }
        }
        if (musicModel.getMusicType() == 2) {
            c1485060okS.LIZIZ = musicModel.getReuseAudioPlayUrl().getUrlList();
            c1485060okS.LIZLLL = musicModel.getDuration();
            str = (String) ListProtector.get(musicModel.getReuseAudioPlayUrl().getUrlList(), 0);
        } else {
            c1485060okS.LIZIZ = musicModel.getUrl().getUrlList();
            c1485060okS.LIZLLL = musicModel.getRealAuditionDuration();
            str = (String) ListProtector.get(musicModel.getUrl().getUrlList(), 0);
        }
        c1485060okS.LIZJ = 4;
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "enable_play_local_cache_music_file", true, true) && localPath == null) {
            localPath = str;
        }
        String strLIZIZ = C1490520otG.LJFF().LIZIZ(localPath);
        if (!TextUtils.isEmpty(strLIZIZ) && C2354709Kn.LIZIZ(strLIZIZ) && new C0VSJ(strLIZIZ).length() > 0) {
            c1485060okS.LIZ = strLIZIZ;
            this.LL.LIZIZ(c1485060okS);
            this.LLILZLL.LIZ();
        } else {
            if (musicModel.isNeedSetCookie()) {
                String strLLIZ = C2204961BRm.LLIZ(C786410Ut5.A2(), str, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3Usb24wdvindZbK2SC/RXl7pewDd5b7prqjGi4Jzm+/EB2H", null));
                HashMap<String, String> map = new HashMap<>();
                map.put("cookie", strLLIZ);
                c1485060okS.LJ = map;
            }
            this.LL.LIZIZ(c1485060okS);
        }
    }
}
