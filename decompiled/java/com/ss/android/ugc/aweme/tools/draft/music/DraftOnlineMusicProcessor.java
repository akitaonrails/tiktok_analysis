package com.ss.android.ugc.aweme.tools.draft.music;

import X.C0CHQ;
import X.C1403010mc7;
import X.C1458570o3j;
import X.C15O7;
import X.C201955140j;
import X.C571350Maz;
import X.C581190Mqr;
import X.C790050Uyx;
import X.InterfaceC1416880myU;
import X.InterfaceC1631620sYq;
import X.InterfaceC561510M0n;
import Y.ACallableS89S0400000_8;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.creative.model.music.MusicObject;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import kotlin.Unit;
import v7.o;

/* JADX INFO: loaded from: classes9.dex */
public final class DraftOnlineMusicProcessor implements InterfaceC561510M0n, GenericLifecycleObserver {
    public static final /* synthetic */ int LLILLL = 0;
    public final AwemeDraft LL;
    public InterfaceC1631620sYq<? super Boolean, ? super Boolean, ? super String, Unit> LLILLJJLI;

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        this.LLILLJJLI = null;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // X.InterfaceC561510M0n
    public final void LIZ() {
        if (C790050Uyx.LIZ(C0CHQ.LIZ)) {
            AwemeDraft awemeDraft = this.LL;
            AVMusic aVMusic = awemeDraft.LJ;
            if (aVMusic != null) {
                MusicObject musicObject = awemeDraft.LIZ.musicBuzModel.music;
                aVMusic.setMatchedSongInfo(musicObject != null ? musicObject.matchedSongInfo : null);
                MusicObject musicObject2 = this.LL.LIZ.musicBuzModel.music;
                aVMusic.setMatchedPGCSoundInfo(musicObject2 != null ? musicObject2.matchedPGCSoundInfo : null);
            }
            AwemeDraft awemeDraft2 = this.LL;
            o oVar = new o();
            C15O7.LIZJ(new ACallableS89S0400000_8(awemeDraft2, aVMusic, this, oVar, 0));
            oVar.LIZ.LJ(new C581190Mqr(this, 3), C15O7.LJIIIIZZ, null);
            return;
        }
        if (!C571350Maz.LIZ(this.LL.LJ)) {
            C201955140j.LJ("draft_music_process, Network not available, Online music file not exist, draft resume fail");
            InterfaceC1631620sYq<? super Boolean, ? super Boolean, ? super String, Unit> interfaceC1631620sYq = this.LLILLJJLI;
            if (interfaceC1631620sYq != null) {
                Boolean bool = Boolean.FALSE;
                interfaceC1631620sYq.invoke(bool, bool, null);
                return;
            }
            return;
        }
        AwemeDraft awemeDraft3 = this.LL;
        AVMusic aVMusic2 = awemeDraft3.LJ;
        awemeDraft3.LJII = aVMusic2 != null ? C1458570o3j.LIZIZ(aVMusic2) : null;
        C201955140j.LIZ("draft_music_process, Network not available, Online music file exist");
        InterfaceC1631620sYq<? super Boolean, ? super Boolean, ? super String, Unit> interfaceC1631620sYq2 = this.LLILLJJLI;
        if (interfaceC1631620sYq2 != null) {
            Boolean bool2 = Boolean.TRUE;
            interfaceC1631620sYq2.invoke(bool2, bool2, null);
        }
    }

    public DraftOnlineMusicProcessor(AwemeDraft awemeDraft, InterfaceC1631620sYq<? super Boolean, ? super Boolean, ? super String, Unit> interfaceC1631620sYq) {
        this.LL = awemeDraft;
        this.LLILLJJLI = interfaceC1631620sYq;
    }

    public static void LIZIZ(final AwemeDraft awemeDraft, AVMusic aVMusic, final o oVar) {
        C1403010mc7.LIZ.getMusicService().LJ("draft_restore", C0CHQ.LIZ, aVMusic, 0, false, new InterfaceC1416880myU() { // from class: X.0May
            @Override // X.InterfaceC1416880myU
            public final void LIZJ(boolean z) {
            }

            @Override // X.InterfaceC1416880myU
            public final void onProgress(int i) {
            }

            @Override // X.InterfaceC1416880myU
            public final void onStart() {
            }

            @Override // X.InterfaceC1416880myU
            public final void LIZ(Integer num, String str) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("draft_music_process, music download fail, errorCode: ");
                sbLIZ.append(num);
                sbLIZ.append(", errorMsg: ");
                sbLIZ.append(str);
                C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                oVar.LIZJ(null);
            }

            @Override // X.InterfaceC1416880myU
            public final void LIZIZ(String str, MusicWaveBean musicWaveBean) {
                awemeDraft.LJII = str;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("draft_music_process, music download success, music file: ");
                sbLIZ.append(str);
                C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                oVar.LIZJ(null);
            }
        }, false);
    }
}
