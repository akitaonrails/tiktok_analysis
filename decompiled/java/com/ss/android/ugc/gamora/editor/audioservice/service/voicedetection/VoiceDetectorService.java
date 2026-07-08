package com.ss.android.ugc.gamora.editor.audioservice.service.voicedetection;

import X.AbstractC2238408pq;
import X.C0C64;
import X.C0CNO;
import X.C0PEM;
import X.C1458840o4A;
import X.C1461030o7h;
import X.C1461130o7r;
import X.C1461170o7v;
import X.C1DFH;
import X.C201955140j;
import X.C201962140q;
import X.C2107308Nj;
import X.C2188811AlT;
import X.C2296808zG;
import X.C23250099c;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.creative.model.music.AudioRatioInfo;
import com.ss.android.ugc.aweme.services.audio.IVoiceDetectorConfig;
import com.ss.android.ugc.aweme.services.audio.IVoiceDetectorService;
import com.ss.android.ugc.aweme.services.audio.IVoiceHandler;
import com.ss.android.ugc.aweme.services.audio.VoiceDetectionListener;
import com.ss.android.ugc.aweme.services.audio.VoiceDetectionParam;
import com.ss.android.ugc.aweme.services.audio.VoiceDetectionResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS266S0300000_22;
import kotlin.jvm.internal.AwS423S0200000_22;

/* JADX INFO: loaded from: classes23.dex */
public final class VoiceDetectorService implements IVoiceDetectorService {
    public final Keva LIZ = Keva.getRepo("speech_detection");
    public final C1461170o7v LIZIZ = new Object() { // from class: X.0o7v
    };
    public final ConcurrentHashMap<Integer, C1461130o7r> LIZJ = new ConcurrentHashMap<>();
    public final CopyOnWriteArrayList<VoiceDetectionListener> LIZLLL = new CopyOnWriteArrayList<>();
    public final CopyOnWriteArrayList<IVoiceHandler> LJ = new CopyOnWriteArrayList<>();

    @Override // com.ss.android.ugc.aweme.services.audio.IVoiceDetectorService
    public final void clearHandler() {
        this.LJ.clear();
    }

    public final C1461130o7r LIZIZ(int i) {
        C1461130o7r c1461130o7r = this.LIZJ.get(Integer.valueOf(i));
        if (c1461130o7r == null) {
            C1461130o7r c1461130o7r2 = new C1461130o7r(0);
            this.LIZJ.put(Integer.valueOf(i), c1461130o7r2);
            return c1461130o7r2;
        }
        return c1461130o7r;
    }

    @Override // com.ss.android.ugc.aweme.services.audio.IVoiceDetectorService
    public final void addHandler(IVoiceHandler iVoiceHandler) {
        if (!this.LJ.contains(iVoiceHandler)) {
            this.LJ.add(iVoiceHandler);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.audio.IVoiceDetectorService
    public final void clearVoiceActivityDetection(Integer num) {
        if (num == null) {
            this.LIZJ.clear();
        } else {
            this.LIZJ.put(num, new C1461130o7r(0));
        }
    }

    @Override // com.ss.android.ugc.aweme.services.audio.IVoiceDetectorService
    public final void removeVoiceDetectionResultListener(VoiceDetectionListener voiceDetectionListener) {
        this.LIZLLL.remove(voiceDetectionListener);
    }

    @Override // com.ss.android.ugc.aweme.services.audio.IVoiceDetectorService
    public final void addVoiceDetectionResultListener(int i, VoiceDetectionListener voiceDetectionListener) {
        this.LIZLLL.add(voiceDetectionListener);
        AudioRatioInfo audioRatioInfo = LIZIZ(i).LIZ;
        if (audioRatioInfo != null) {
            Iterator<VoiceDetectionListener> it2 = this.LIZLLL.iterator();
            while (it2.hasNext()) {
                it2.next().onVoiceActivityDetected(new VoiceDetectionResult(0, null, audioRatioInfo, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0, new ArrayList(), new LinkedHashMap()));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.services.audio.IVoiceDetectorService
    public final void setVoiceDetectionTaskListener(int i, VoiceDetectionListener voiceDetectionListener) {
        C1461130o7r c1461130o7rLIZIZ = LIZIZ(i);
        AudioRatioInfo audioRatioInfo = c1461130o7rLIZIZ.LIZ;
        if (audioRatioInfo != null && voiceDetectionListener != null) {
            voiceDetectionListener.onVoiceActivityDetected(new VoiceDetectionResult(0, null, audioRatioInfo, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0, new ArrayList(), new LinkedHashMap()));
        }
        c1461130o7rLIZIZ.LIZIZ = voiceDetectionListener;
    }

    @Override // com.ss.android.ugc.aweme.services.audio.IVoiceDetectorService
    public final void startDetectVoiceActivity(VoiceDetectionParam voiceDetectionParam, IVoiceDetectorConfig iVoiceDetectorConfig, Function0<Unit> function0) {
        AbstractC2238408pq abstractC2238408pqLLIILII;
        C1461130o7r c1461130o7rLIZIZ = LIZIZ(voiceDetectionParam.sourceType);
        if (voiceDetectionParam.limitDuration) {
            AudioRatioInfo audioRatioInfo = new AudioRatioInfo(0.0f, 0.0f, 0.0f);
            c1461130o7rLIZIZ.LIZ = audioRatioInfo;
            iVoiceDetectorConfig.mobDetectEvent(voiceDetectionParam, new VoiceDetectionResult(-1, "disable recommend music and caption", audioRatioInfo, 0L, 0L, 0L, 0L, 0L, this.LIZ.getLong("last_speech_detection_time", 0L), 0L, 0L, 0L, 0L, 0, new ArrayList(), new LinkedHashMap()));
            this.LIZ.storeLong("last_speech_detection_time", System.currentTimeMillis());
            C0CNO.LIZLLL(0L, new AwS423S0200000_22(c1461130o7rLIZIZ, this, 44));
            if (function0 != null) {
                function0.invoke();
                return;
            }
            return;
        }
        C1458840o4A.LIZ.getClass();
        C1458840o4A.LIZIZ = null;
        C1458840o4A.LIZJ = null;
        boolean z = false;
        C1458840o4A.LIZLLL = false;
        C1458840o4A.LJ = null;
        AudioRatioInfo voiceDetectCacheResult = iVoiceDetectorConfig.getVoiceDetectCacheResult();
        if (voiceDetectCacheResult != null) {
            c1461130o7rLIZIZ.LIZ = voiceDetectCacheResult;
            iVoiceDetectorConfig.mobDetectEvent(voiceDetectionParam, new VoiceDetectionResult(0, "", voiceDetectCacheResult, 0L, 0L, 0L, 0L, 0L, this.LIZ.getLong("last_speech_detection_time", 0L), 0L, 0L, 0L, 0L, 1, new ArrayList(), new LinkedHashMap()));
            this.LIZ.storeLong("last_speech_detection_time", System.currentTimeMillis());
            C0CNO.LIZLLL(0L, new AwS266S0300000_22(c1461130o7rLIZIZ, voiceDetectCacheResult, this, 12));
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("read result from cache, hasPass = ");
            sbLIZ.append(voiceDetectCacheResult);
            sbLIZ.append(", has callback = ");
            if (c1461130o7rLIZIZ.LIZIZ != null) {
                z = true;
            }
            sbLIZ.append(z);
            C2188811AlT.LIZIZ(sbLIZ);
            if (function0 != null) {
                function0.invoke();
                return;
            }
            return;
        }
        if (iVoiceDetectorConfig.disableVoiceDetect()) {
            VoiceDetectionResult voiceDetectionResult = new VoiceDetectionResult(-1, "disable voice detect", null, 0L, 0L, 0L, 0L, 0L, this.LIZ.getLong("last_speech_detection_time", 0L), 0L, 0L, 0L, 0L, 0, new ArrayList(), new LinkedHashMap());
            C201955140j.LJIIIIZZ(C201962140q.LIZIZ, "VoiceActivityDetection", "startDetectVoiceActivity failed caused by disableVoiceDetect");
            iVoiceDetectorConfig.mobDetectEvent(voiceDetectionParam, voiceDetectionResult);
            this.LIZ.storeLong("last_speech_detection_time", System.currentTimeMillis());
            c1461130o7rLIZIZ.LIZ = voiceDetectionResult.audioRatioInfo;
            C0CNO.LIZLLL(0L, new AwS266S0300000_22(c1461130o7rLIZIZ, voiceDetectionResult, this, 13));
            if (function0 != null) {
                function0.invoke();
                return;
            }
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_speech_detection_opt3", true, false)) {
            C1DFH c1dfh = C0PEM.LIZ;
            abstractC2238408pqLLIILII = C2107308Nj.LIZ.LLIILII();
        } else {
            C1DFH c1dfh2 = C0PEM.LIZ;
            abstractC2238408pqLLIILII = C2107308Nj.LIZ;
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(abstractC2238408pqLLIILII), null, null, new C1461030o7h(this, iVoiceDetectorConfig, c1461130o7rLIZIZ, jCurrentTimeMillis, voiceDetectionParam, function0, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.lang.String r46, com.ss.android.ugc.aweme.services.audio.VoiceDetectionParam r47, com.ss.android.ugc.aweme.services.audio.IVoiceDetectorConfig r48, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.services.audio.VoiceDetectionResult> r49) {
        /*
            Method dump skipped, instruction units count: 514
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.audioservice.service.voicedetection.VoiceDetectorService.LIZ(java.lang.String, com.ss.android.ugc.aweme.services.audio.VoiceDetectionParam, com.ss.android.ugc.aweme.services.audio.IVoiceDetectorConfig, X.05Vn):java.lang.Object");
    }
}
