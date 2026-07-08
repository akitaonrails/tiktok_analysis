package com.ss.android.ugc.gamora.recorder.choosemusic;

import X.C01GW;
import X.C0CHQ;
import X.C1399580mWa;
import X.C1458200o38;
import X.C1459090o4Z;
import X.C1624010sMZ;
import X.C1624200sMs;
import X.C19A3;
import X.C19EG;
import X.C1DRG;
import X.C389120FNm;
import X.C452501pT;
import X.EnumC1654750tA9;
import X.EnumC545560LaU;
import X.InterfaceC1453610nvj;
import X.InterfaceC1459070o4X;
import X.InterfaceC1624370sN9;
import X.InterfaceC1624480sNK;
import X.InterfaceC1628590sTx;
import X.InterfaceC1650230t2r;
import X.InterfaceC1652370t6J;
import X.InterfaceC20499515Jh;
import X.InterfaceC21363518j3;
import X.InterfaceC2183551Acz;
import android.app.Activity;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.scene.Scene;
import com.bytedance.scene.navigation.NavigationScene;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS569S0100000_25;
import lnn.q;
import mn3.e0;

/* JADX INFO: loaded from: classes26.dex */
public final class RecordChooseMusicController implements InterfaceC20499515Jh {
    public final C1DRG LL;
    public final Scene LLILLJJLI;
    public final C19EG LLILLL;
    public final InterfaceC1650230t2r LLILZ;
    public final q LLILZIL;
    public final InterfaceC1628590sTx LLILZLL;
    public final ShortVideoContext LLIZ;
    public final NavigationScene LLIZLLLIL;
    public final InterfaceC1453610nvj LLJ;
    public final InterfaceC1652370t6J LLJI;
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 547));
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 546));
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new AwS569S0100000_25(this, 544));
    public final C01GW LLJILLL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 545));
    public final C01GW LLJJ = C452501pT.LIZIZ(new AwS569S0100000_25(this, 548));
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS569S0100000_25(this, 536));
    public final C01GW LLJJIII = C452501pT.LIZIZ(new AwS569S0100000_25(this, 537));
    public boolean LLJJIJI;
    public InterfaceC1459070o4X LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public boolean LLJJJ;
    public boolean LLJJJIL;
    public boolean LLJJJJ;
    public String LLJJJJJIL;
    public List<Integer> LLJJJJLIIL;
    public ArrayList<String> LLJJL;
    public final C1458200o38 LLJJLIIIJLLLLLLLZ;
    public AVMusic LLJL;
    public boolean LLJLIL;

    @Override // X.InterfaceC20499515Jh
    public final /* synthetic */ void J2(MusicModel musicModel, long j) {
    }

    @Override // X.InterfaceC20499515Jh
    public final /* synthetic */ void LLJILJILJ(MusicModel musicModel, Exception exc) {
    }

    @Override // X.InterfaceC20499515Jh
    public final void LLJJL(MusicModel musicModel, String str, String str2) {
    }

    @Override // X.InterfaceC20499515Jh
    public final boolean LLJLLIL() {
        return true;
    }

    @Override // X.InterfaceC20499515Jh
    public final /* synthetic */ void ba(MusicModel musicModel) {
    }

    @Override // X.InterfaceC20499515Jh
    public final /* synthetic */ void v2() {
    }

    @Override // X.InterfaceC20499515Jh
    public final /* synthetic */ void y4(Map map, MusicModel musicModel, String str) {
    }

    public final MusicDownloadPlayHelper LIZ() {
        return (MusicDownloadPlayHelper) this.LLJILLL.getValue();
    }

    public final InterfaceC1624370sN9 LIZIZ() {
        return (InterfaceC1624370sN9) this.LLJIJIL.getValue();
    }

    @Override // X.InterfaceC20499515Jh
    public final MusicModel LJI() {
        AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(this.LLIZ.creativeModel.musicBuzModel);
        if (aVMusicExtractAVMusic != null) {
            return C389120FNm.LIZ(aVMusicExtractAVMusic);
        }
        return null;
    }

    public final void LJII() {
        MusicModel musicModelLJI;
        MusicModel musicModelLJI2;
        MusicModel musicModelLJI3;
        if (this.LLJJIJI || !this.LLJJIJIL || this.LLJJJ) {
            return;
        }
        int musicEndTime = (!C1399580mWa.LIZ() || (musicModelLJI = LJI()) == null || !C1459090o4Z.LIZIZ(musicModelLJI) || (musicModelLJI2 = LJI()) == null || musicModelLJI2.getMusicEndTime() <= 0 || (musicModelLJI3 = LJI()) == null) ? -1 : musicModelLJI3.getMusicEndTime();
        AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(this.LLIZ.creativeModel.musicBuzModel);
        if (aVMusicExtractAVMusic != null) {
            MusicDownloadPlayHelper musicDownloadPlayHelperLIZ = LIZ();
            MusicModel musicModelLIZ = C389120FNm.LIZ(aVMusicExtractAVMusic);
            musicModelLIZ.playRepeatFromEndTime = musicEndTime > 0;
            MusicModel musicModelLJI4 = LJI();
            musicDownloadPlayHelperLIZ.Zf(musicModelLIZ, 19, true, musicModelLJI4 != null ? musicModelLJI4.getMusicStart() : 0, musicEndTime);
            this.LLJJJ = true;
        }
    }

    public final void LJIIIIZZ() {
        InterfaceC1624480sNK interfaceC1624480sNKC0;
        q qVar = this.LLILZIL;
        if (C1624200sMs.LJIILIIL((qVar == null || (interfaceC1624480sNKC0 = qVar.C0()) == null) ? null : interfaceC1624480sNKC0.LLILIL())) {
            this.LLILZLL.mQ0(true);
        }
    }

    @Override // X.InterfaceC20499515Jh
    public final Activity LLILLL() {
        return this.LLILLL;
    }

    public final void LIZJ(boolean z) {
        q qVar = this.LLILZIL;
        if (qVar != null && qVar.C0().LLILIL() != null) {
            this.LLILZLL.oV(new Pair<>(C1624010sMZ.LIZIZ(this.LLILZIL), Boolean.valueOf(z)));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0165 A[PHI: r7
      0x0165: PHI (r7v9 java.io.Serializable) = (r7v8 java.io.Serializable), (r7v5 java.io.Serializable) binds: [B:53:0x0163, B:47:0x014f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(boolean r50) {
        /*
            Method dump skipped, instruction units count: 792
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.recorder.choosemusic.RecordChooseMusicController.LIZLLL(boolean):void");
    }

    public final void LJ(Cert cert) {
        q qVar;
        InterfaceC21363518j3 interfaceC21363518j3Wt2;
        C0CHQ.LIZ().LJJJJI().sceneReport("click_music_shoot");
        if (this.LLIZ.cameraComponentModel.curBackgroundVideo != null && (qVar = this.LLILZIL) != null && (interfaceC21363518j3Wt2 = qVar.wt2()) != null) {
            interfaceC21363518j3Wt2.LJ();
        }
        this.LLILZ.c11(new InterfaceC2183551Acz() { // from class: X.0t6H
            /* JADX WARN: Removed duplicated region for block: B:173:0x03f6  */
            /* JADX WARN: Removed duplicated region for block: B:213:0x04b1  */
            /* JADX WARN: Removed duplicated region for block: B:219:0x04d4  */
            /* JADX WARN: Removed duplicated region for block: B:228:0x04f6 A[PHI: r12
              0x04f6: PHI (r12v1 java.util.List) = (r12v12 java.util.List), (r12v13 java.util.List) binds: [B:220:0x04d8, B:227:0x04f3] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:230:0x04fc  */
            /* JADX WARN: Removed duplicated region for block: B:240:0x0551  */
            /* JADX WARN: Removed duplicated region for block: B:57:0x017b  */
            /* JADX WARN: Removed duplicated region for block: B:59:0x0181 A[PHI: r7
              0x0181: PHI (r7v1 java.io.Serializable) = (r7v0 java.io.Serializable), (r7v7 java.io.Serializable), (r7v7 java.io.Serializable) binds: [B:46:0x0153, B:48:0x015b, B:58:0x017f] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // X.InterfaceC2183551Acz
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onDone(int r31) {
                /*
                    Method dump skipped, instruction units count: 1444
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1652350t6H.onDone(int):void");
            }
        });
        C0CHQ.LIZ().LJIIL().updateCurrentScene("music_panel_show", true);
        this.LLILZ.IU1().LIZLLL(EnumC545560LaU.CHOOSE_MUSIC_SCENE, cert);
    }

    public final void LJFF(Cert cert) {
        q qVar;
        InterfaceC21363518j3 interfaceC21363518j3Wt2;
        this.LLILZ.aD1();
        if (this.LLIZ.cameraComponentModel.curBackgroundVideo != null && (qVar = this.LLILZIL) != null && (interfaceC21363518j3Wt2 = qVar.wt2()) != null) {
            interfaceC21363518j3Wt2.LJIIIIZZ();
        }
        C0CHQ.LIZ().LJIIL().updateCurrentScene("music_panel_show", false);
        this.LLILZ.IU1().LIZIZ(EnumC545560LaU.CHOOSE_MUSIC_SCENE, cert, Boolean.FALSE);
    }

    public RecordChooseMusicController(C1DRG c1drg, C19A3 c19a3, C19EG c19eg, e0 e0Var, q qVar, InterfaceC1628590sTx interfaceC1628590sTx, ShortVideoContext shortVideoContext, NavigationScene navigationScene, InterfaceC1453610nvj interfaceC1453610nvj, InterfaceC1652370t6J interfaceC1652370t6J) {
        this.LL = c1drg;
        this.LLILLJJLI = c19a3;
        this.LLILLL = c19eg;
        this.LLILZ = e0Var;
        this.LLILZIL = qVar;
        this.LLILZLL = interfaceC1628590sTx;
        this.LLIZ = shortVideoContext;
        this.LLIZLLLIL = navigationScene;
        this.LLJ = interfaceC1453610nvj;
        this.LLJI = interfaceC1652370t6J;
        EnumC1654750tA9.TAB_AI.getStringValue();
        this.LLJJLIIIJLLLLLLLZ = new C1458200o38(shortVideoContext);
    }
}
