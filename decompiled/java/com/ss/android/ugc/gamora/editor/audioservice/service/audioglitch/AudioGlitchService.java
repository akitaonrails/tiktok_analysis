package com.ss.android.ugc.gamora.editor.audioservice.service.audioglitch;

import X.C04TD;
import X.C1461230o81;
import X.C1461270o85;
import X.C2484209oO;
import X.C291380BbU;
import com.ss.android.ttve.nativePort.TEBundle;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.services.audio.IAudioGlitchService;
import com.ss.android.vesdk.VEAudioCapture;
import com.ss.android.vesdk.VERecorder;
import com.ss.android.vesdk.k;

/* JADX INFO: loaded from: classes23.dex */
public final class AudioGlitchService implements IAudioGlitchService {
    @Override // com.ss.android.ugc.aweme.services.audio.IAudioGlitchService
    public final void enableRecordGlitchInShootScene(VEAudioCapture vEAudioCapture, boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.services.audio.IAudioGlitchService
    public final void getRecordGlitchAndReportInShootScene(VEAudioCapture vEAudioCapture) {
    }

    public static IAudioGlitchService LIZ() {
        Object objLIZ = C04TD.LIZ(IAudioGlitchService.class, false);
        if (objLIZ != null) {
            return (IAudioGlitchService) objLIZ;
        }
        if (C04TD.m6 == null) {
            synchronized (IAudioGlitchService.class) {
                if (C04TD.m6 == null) {
                    C04TD.m6 = new AudioGlitchService();
                }
            }
        }
        return C04TD.m6;
    }

    @Override // com.ss.android.ugc.aweme.services.audio.IAudioGlitchService
    public final void startDevicesChangedListener() {
        C1461230o81.LIZ.getClass();
        C1461230o81.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.services.audio.IAudioGlitchService
    public final void stopDevicesChangedListener() {
        C1461230o81.LIZ.getClass();
        C1461230o81.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.services.audio.IAudioGlitchService
    public final void enablePlayGlitchInShootScene(VERecorder vERecorder, boolean z) {
        C1461230o81.LIZ.getClass();
        if (C291380BbU.LIZ()) {
            k kVar = vERecorder.LIZIZ;
            kVar.getClass();
            C1461270o85 c1461270o85 = new C1461270o85();
            kVar.LLFFF = c1461270o85;
            c1461270o85.LIZLLL = System.currentTimeMillis();
            TEBundle tEBundleObtain = TEBundle.obtain();
            tEBundleObtain.setBool("enableAudioGlitchMetrics", z);
            kVar.LJJJ.LJIL("enableAudioGlitchMetrics", tEBundleObtain);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.audio.IAudioGlitchService
    public final void getPlayGlitchAndReportInShootScene(CreativeModel creativeModel, VERecorder vERecorder, boolean z, String str) {
        C1461270o85 c1461270o85;
        int i;
        C1461230o81.LIZ.getClass();
        if (C291380BbU.LIZ()) {
            k kVar = vERecorder.LIZIZ;
            C1461270o85 c1461270o852 = kVar.LLFFF;
            if (c1461270o852 == null) {
                C2484209oO.LIZJ("TERecorder", "can not get glitch info, please enable glitch metrics");
                c1461270o85 = null;
            } else {
                long jCurrentTimeMillis = System.currentTimeMillis();
                c1461270o85 = kVar.LLFFF;
                c1461270o852.LIZLLL = jCurrentTimeMillis - c1461270o85.LIZLLL;
            }
            if (c1461270o85 == null) {
                c1461270o85 = new C1461270o85();
                c1461270o85.LIZ = 0;
            }
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            if (z) {
                i = 2;
            } else {
                i = 1;
            }
            C1461270o85 c1461270o853 = new C1461270o85();
            c1461270o853.LIZ = 0;
            C1461230o81.LIZIZ(i, jCurrentTimeMillis2, str, c1461270o85, c1461270o853, creativeModel, -1, "", "", "");
        }
    }
}
