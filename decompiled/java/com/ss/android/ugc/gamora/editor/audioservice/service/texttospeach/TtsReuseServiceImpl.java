package com.ss.android.ugc.gamora.editor.audioservice.service.texttospeach;

import X.C01GW;
import X.C04TD;
import X.C058Z;
import X.C05WR;
import X.C05WS;
import X.C099R;
import X.C0PEM;
import X.C0VSJ;
import X.C1364905Vv;
import X.C1366905Wp;
import X.C2279608wU;
import X.C2296808zG;
import X.C23250099c;
import X.C452501pT;
import X.InterfaceC1364105Vn;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.feed.model.TtsReuseModel;
import com.ss.android.ugc.aweme.services.audio.ITTSService;
import com.ss.android.ugc.aweme.services.audio.ITtsReuseService;
import java.io.File;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class TtsReuseServiceImpl implements ITtsReuseService {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(718));
    public final C01GW LIZIZ = C452501pT.LIZIZ(new AwS546S0100000_2(this, 876));
    public boolean LIZJ;

    public static ITtsReuseService LJ() {
        Object objLIZ = C04TD.LIZ(ITtsReuseService.class, false);
        if (objLIZ != null) {
            return (ITtsReuseService) objLIZ;
        }
        if (C04TD.o6 == null) {
            synchronized (ITtsReuseService.class) {
                if (C04TD.o6 == null) {
                    C04TD.o6 = new TtsReuseServiceImpl();
                }
            }
        }
        return C04TD.o6;
    }

    @Override // com.ss.android.ugc.aweme.services.audio.ITtsReuseService
    public final void destroyAudioSDKHandler() {
        ITTSService iTTSService;
        if (C1366905Wp.LIZ()) {
            if (!this.LIZJ || (iTTSService = (ITTSService) this.LIZIZ.getValue()) == null) {
                return;
            }
            iTTSService.destroyAudioSDKHandler();
            return;
        }
        ITTSService iTTSService2 = (ITTSService) this.LIZIZ.getValue();
        if (iTTSService2 != null) {
            iTTSService2.destroyAudioSDKHandler();
        }
    }

    @Override // com.ss.android.ugc.aweme.services.audio.ITtsReuseService
    public final void initAudioSDKHandler() {
        File parentFile = new C0VSJ(C2279608wU.LIZ()).getParentFile();
        String absolutePath = parentFile != null ? parentFile.getAbsolutePath() : null;
        ITTSService iTTSService = (ITTSService) this.LIZIZ.getValue();
        if (iTTSService != null) {
            iTTSService.initAudioSDKHandler(absolutePath);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.audio.ITtsReuseService
    public final void fetchBatchTtsAudio(List<TtsReuseModel> list) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1364905Vv(list, this, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.services.audio.ITtsReuseService
    public final void fetchEffectModel(List<TtsReuseModel> list) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C05WR(list, this, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.services.audio.ITtsReuseService
    public final void initAudioSDKHandler(CreativeInfo creativeInfo) {
        ITTSService iTTSService = (ITTSService) this.LIZIZ.getValue();
        if (iTTSService != null) {
            iTTSService.initAudioSDKHandler(creativeInfo);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.audio.ITtsReuseService
    public final void fetchSingleTtsAudio(String str, String str2, String str3, boolean z) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C058Z(this, str, str2, str3, null, z), 3);
    }

    @Override // com.ss.android.ugc.aweme.services.audio.ITtsReuseService
    public final Object fetchTtsAudioFile(String str, String str2, String str3, boolean z, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) throws Throwable {
        Object objLJI = C23250099c.LJI(interfaceC1364105Vn, C0PEM.LIZJ, new C05WS(this, str3, str2, str, null, z));
        if (objLJI == C099R.LJFF()) {
            return objLJI;
        }
        return Unit.LIZ;
    }
}
