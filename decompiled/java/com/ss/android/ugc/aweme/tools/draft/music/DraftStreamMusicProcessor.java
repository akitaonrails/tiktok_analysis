package com.ss.android.ugc.aweme.tools.draft.music;

import X.C0CHQ;
import X.C15O7;
import X.C2093608Ic;
import X.C543670LTx;
import X.C790050Uyx;
import X.C793770VBv;
import X.C794240VDq;
import X.InterfaceC1631620sYq;
import X.InterfaceC561510M0n;
import Y.ACallableS176S0300000_8;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.draft.model.AVDraftExtras;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.AwS552S0100000_8;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class DraftStreamMusicProcessor implements InterfaceC561510M0n, GenericLifecycleObserver {
    public final AwemeDraft LL;
    public InterfaceC1631620sYq<? super Boolean, ? super Boolean, ? super String, Unit> LLILLJJLI;
    public boolean LLILLL = true;
    public String LLILZ;

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

    @Override // X.InterfaceC561510M0n
    public final void LIZ() {
        AwS552S0100000_8 awS552S0100000_8 = new AwS552S0100000_8(this, 1009);
        AVMusic aVMusic = this.LL.LJ;
        if (!C0CHQ.LIZ().getAccountService().LIZ() && C2093608Ic.LJ(this.LL.LJJIZ)) {
            AVDraftExtras aVDraftExtras = this.LL.LJJJJIZL;
            if (aVDraftExtras.stitchParams == null && !aVDraftExtras.isStickPointMode && C790050Uyx.LIZ(C0CHQ.LIZ) && aVMusic != null) {
                C15O7.LIZJ(new ACallableS176S0300000_8(this, aVMusic, awS552S0100000_8, 5));
                return;
            }
        }
        awS552S0100000_8.invoke();
    }

    public DraftStreamMusicProcessor(AwemeDraft awemeDraft, InterfaceC1631620sYq<? super Boolean, ? super Boolean, ? super String, Unit> interfaceC1631620sYq) {
        this.LL = awemeDraft;
        this.LLILLJJLI = interfaceC1631620sYq;
    }

    public static void LIZIZ(int i, String str, String str2) {
        C543670LTx c543670LTx = new C543670LTx();
        c543670LTx.LIZ.put("errorDesc", str);
        c543670LTx.LIZ.put("music_id", str2);
        JSONObject jSONObjectLJ = c543670LTx.LJ();
        CopyOnWriteArrayList<Runnable> copyOnWriteArrayList = C794240VDq.LIZ;
        C793770VBv.LJIIJJI("draft_music_permission_check_rate", i, jSONObjectLJ);
    }
}
