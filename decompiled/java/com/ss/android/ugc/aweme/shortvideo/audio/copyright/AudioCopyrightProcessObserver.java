package com.ss.android.ugc.aweme.shortvideo.audio.copyright;

import X.AbstractC855890Xhr;
import X.AbstractC855920Xhu;
import X.AbstractC857240Xk2;
import X.C855930Xhv;
import X.C895680ZBu;
import X.EnumC856470Xin;
import X.InterfaceC856150XiH;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes15.dex */
public final class AudioCopyrightProcessObserver extends AbstractC857240Xk2<Unit> implements GenericLifecycleObserver {
    public final VideoPublishEditModel LLILZ;
    public final LifecycleOwner LLILZIL;
    public final AbstractC855920Xhu LLILZLL;
    public final Runnable LLIZ;
    public C855930Xhv LLIZLLLIL;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_CREATE) {
            onCreate();
            return;
        }
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        } else if (event == Lifecycle.Event.ON_RESUME) {
            onResume();
        } else if (event == Lifecycle.Event.ON_PAUSE) {
            onPause();
        }
    }

    @Override // X.AbstractC857240Xk2
    public final String LIZJ() {
        return EnumC856470Xin.AUDIO_COPYRIGHT_CHECK.getValue().getSecond();
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0Xhv] */
    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public final void onCreate() {
        if (this.LLIZLLLIL == null) {
            this.LLIZLLLIL = new InterfaceC856150XiH() { // from class: X.0Xhv
                /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
                /* JADX WARN: Removed duplicated region for block: B:21:0x009d  */
                @Override // X.InterfaceC856150XiH
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void LIZ(int r11, java.util.Map r12, int r13, int r14) {
                    /*
                        r10 = this;
                        java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
                        java.lang.String r0 = "audioCopyrightDetectInPublish -> AudioCopyrightDetect result: result = "
                        r1.append(r0)
                        r1.append(r11)
                        java.lang.String r0 = ", code = "
                        r1.append(r0)
                        r1.append(r13)
                        java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
                        X.C201955140j.LIZ(r0)
                        com.ss.android.ugc.aweme.shortvideo.audio.copyright.AudioCopyrightProcessObserver r0 = r10.LIZ
                        X.0Xhu r5 = r0.LLILZLL
                        X.0Xhr r8 = r5.LIZ()
                        if (r8 == 0) goto L89
                        int r7 = r8.LIZIZ()
                        r0 = 1
                        if (r11 != r0) goto L8a
                        kotlin.jvm.internal.AwS558S0100000_14 r1 = new kotlin.jvm.internal.AwS558S0100000_14
                        r0 = 1647(0x66f, float:2.308E-42)
                        r1.<init>(r5, r0)
                        X.C01TT.LIZLLL(r1)
                    L36:
                        r0 = 0
                        r8.LIZ(r0)
                    L3a:
                        kotlin.jvm.internal.AwS558S0100000_14 r1 = new kotlin.jvm.internal.AwS558S0100000_14
                        r0 = 1648(0x670, float:2.31E-42)
                        r1.<init>(r5, r0)
                        X.C01TT.LIZLLL(r1)
                        r0 = 102(0x66, float:1.43E-43)
                        if (r13 == r0) goto L9d
                        r0 = 103(0x67, float:1.44E-43)
                        if (r13 != r0) goto L89
                        X.0WiJ r2 = X.C830690WiJ.LIZIZ
                        java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
                        java.lang.String r0 = "BasePublishAudioCopyrightHandler"
                        r1.append(r0)
                        java.lang.String r0 = " -> AudioCopyrightDetect -> CODE_DETECT_COMPLETE"
                        r1.append(r0)
                        java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
                        X.C201955140j.LIZJ(r2, r0)
                        com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r5.LIZJ()
                        com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r0.creativeModel
                        com.ss.android.ugc.aweme.creative.model.AudioCopyrightDetectModel r4 = r0.audioCopyrightDetectModel
                        long r0 = java.lang.System.currentTimeMillis()
                        com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r2 = r5.LIZJ()
                        com.ss.android.ugc.aweme.creative.model.CreativeModel r2 = r2.creativeModel
                        com.ss.android.ugc.aweme.creative.model.AudioCopyrightDetectModel r2 = r2.audioCopyrightDetectModel
                        long r2 = r2.getDetectStart()
                        long r0 = r0 - r2
                        r4.setDetectDuration(r0)
                        kotlin.jvm.internal.AwS72S0301000_14 r4 = new kotlin.jvm.internal.AwS72S0301000_14
                        r9 = 2
                        r6 = r12
                        r4.<init>(r5, r6, r7, r8, r9)
                        X.C01TT.LIZLLL(r4)
                    L89:
                        return
                    L8a:
                        if (r11 == r0) goto L36
                        r0 = 2
                        if (r11 == r0) goto L36
                        r0 = 3
                        if (r11 != r0) goto L3a
                        kotlin.jvm.internal.AwS415S0200000_14 r1 = new kotlin.jvm.internal.AwS415S0200000_14
                        r0 = 126(0x7e, float:1.77E-43)
                        r1.<init>(r8, r5, r0)
                        X.C01TT.LIZLLL(r1)
                        return
                    L9d:
                        kotlin.jvm.internal.AwS415S0200000_14 r1 = new kotlin.jvm.internal.AwS415S0200000_14
                        r0 = 127(0x7f, float:1.78E-43)
                        r1.<init>(r8, r5, r0)
                        X.C01TT.LIZLLL(r1)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C855930Xhv.LIZ(int, java.util.Map, int, int):void");
                }
            };
            C895680ZBu.LJ(this.LLILZ.getCreationId(), this.LLIZLLLIL);
        }
        this.LLILZLL.LJI(this.LLILZ.creativeModel.audioCopyrightDetectModel.getDetectResults());
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        if (this.LLIZLLLIL != null) {
            String creationId = this.LLILZ.getCreationId();
            C855930Xhv c855930Xhv = this.LLIZLLLIL;
            List list = (List) ((LinkedHashMap) C895680ZBu.LIZJ).get(creationId);
            if (list != null) {
                list.remove(c855930Xhv);
            }
            this.LLIZLLLIL = null;
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onPause() {
        Iterator<AbstractC855890Xhr> it2 = this.LLILZLL.LIZLLL().iterator();
        while (it2.hasNext()) {
            it2.next().LJIIIIZZ = false;
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        Iterator<AbstractC855890Xhr> it2 = this.LLILZLL.LIZLLL().iterator();
        while (it2.hasNext()) {
            it2.next().LJIIIIZZ = true;
        }
        AbstractC855890Xhr abstractC855890XhrLIZ = this.LLILZLL.LIZ();
        if (abstractC855890XhrLIZ != null) {
            abstractC855890XhrLIZ.LJI();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x016f  */
    @Override // X.AbstractC857240Xk2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(X.C857220Xk0 r20) {
        /*
            Method dump skipped, instruction units count: 435
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.audio.copyright.AudioCopyrightProcessObserver.LIZ(X.0Xk0):void");
    }

    public AudioCopyrightProcessObserver(VideoPublishEditModel videoPublishEditModel, LifecycleOwner lifecycleOwner, AbstractC855920Xhu abstractC855920Xhu, Runnable runnable) {
        this.LLILZ = videoPublishEditModel;
        this.LLILZIL = lifecycleOwner;
        this.LLILZLL = abstractC855920Xhu;
        this.LLIZ = runnable;
        lifecycleOwner.getLifecycle().addObserver(this);
    }
}
