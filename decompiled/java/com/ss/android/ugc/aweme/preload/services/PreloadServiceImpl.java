package com.ss.android.ugc.aweme.preload.services;

import X.C0B1S;
import X.C1019560cde;
import X.C1498600p6I;
import X.C20574115f1;
import X.C2239731ClP;
import X.C2239781ClU;
import X.C2239861Clc;
import X.C2239881Cle;
import X.C2239901Clg;
import X.C2239941Clk;
import X.C2487409ou;
import X.C262290APr;
import X.C281500B1o;
import X.RunnableC514501zT;
import Y.ARunnableS20S1200000_16;
import Y.ARunnableS2S1210000_16;
import androidx.fragment.app.Fragment;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.preload.IPreloadService;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AwS35S1110000_16;

/* JADX INFO: loaded from: classes35.dex */
public final class PreloadServiceImpl implements IPreloadService {
    public static void LIZIZ(Fragment fragment, String str) {
        Aweme.canReplacePhotoData = false;
        if (!fragment.isDetached()) {
            BPEAHandler bPEAHandler = C1498600p6I.LIZ;
            C1498600p6I.LIZ(fragment, new C2239781ClU(), str);
        }
        if (C281500B1o.LIZIZ && C0B1S.LIZIZ) {
            BPEAHandler bPEAHandler2 = C1498600p6I.LIZ;
            C1498600p6I.LIZ(fragment, new C20574115f1(), str);
        }
    }

    public static void LIZJ(Fragment fragment, String str, boolean z) {
        if (C2239941Clk.LIZ().enable) {
            Aweme.canReplacePhotoData = false;
            if (!fragment.isDetached()) {
                if (z) {
                    BPEAHandler bPEAHandler = C1498600p6I.LIZ;
                    C1498600p6I.LIZ(fragment, new C2239901Clg(), str);
                } else if (C2239941Clk.LIZ().useSplitLoad) {
                    if (C2239941Clk.LIZ().taskTriggerType == 3) {
                        BPEAHandler bPEAHandler2 = C1498600p6I.LIZ;
                        C1498600p6I.LIZ(fragment, new C2239881Cle(), str);
                    } else {
                        BPEAHandler bPEAHandler3 = C1498600p6I.LIZ;
                        C1498600p6I.LIZ(fragment, new C2239731ClP(), str);
                    }
                } else {
                    BPEAHandler bPEAHandler4 = C1498600p6I.LIZ;
                    C1498600p6I.LIZ(fragment, new C2239861Clc(), str);
                }
            }
        }
        if (C281500B1o.LIZIZ && C0B1S.LIZIZ) {
            BPEAHandler bPEAHandler5 = C1498600p6I.LIZ;
            C1498600p6I.LIZ(fragment, new C20574115f1(), str);
        }
    }

    @Override // com.ss.android.ugc.aweme.preload.IPreloadService
    public final void LIZ(Fragment fragment, String str, boolean z) {
        if (z) {
            if (!((Boolean) C262290APr.LIZ.getValue()).booleanValue()) {
                C2487409ou.LIZLLL(8000L, new ARunnableS20S1200000_16(this, fragment, str, 6));
                return;
            }
            RunnableC514501zT runnableC514501zT = new RunnableC514501zT(new WeakReference(fragment), new C1019560cde(this, str), 24);
            fragment.getLifecycle().addObserver(new PreloadServiceImpl$postDelayedWithLifecycle$1(runnableC514501zT));
            C2487409ou.LIZLLL(8000L, runnableC514501zT);
            return;
        }
        if (!((Boolean) C262290APr.LIZ.getValue()).booleanValue()) {
            C2487409ou.LIZLLL(Mp4ScreenVideoLoadTimeout.CONTROL, new ARunnableS2S1210000_16(this, fragment, z, str, 1));
            return;
        }
        RunnableC514501zT runnableC514501zT2 = new RunnableC514501zT(new WeakReference(fragment), new AwS35S1110000_16(this, z, str, 2), 24);
        fragment.getLifecycle().addObserver(new PreloadServiceImpl$postDelayedWithLifecycle$1(runnableC514501zT2));
        C2487409ou.LIZLLL(Mp4ScreenVideoLoadTimeout.CONTROL, runnableC514501zT2);
    }
}
