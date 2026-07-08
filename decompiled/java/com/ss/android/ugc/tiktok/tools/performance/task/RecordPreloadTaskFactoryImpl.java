package com.ss.android.ugc.tiktok.tools.performance.task;

import X.AbstractC1449530np9;
import X.AbstractC1658190tFh;
import X.AbstractC1658200tFi;
import X.AbstractC1658210tFj;
import X.AbstractC1658220tFk;
import X.C0MWE;
import X.C0MWF;
import X.C1449520np8;
import X.C1658160tFe;
import X.C1658170tFf;
import X.C1658180tFg;
import X.C1658230tFl;
import X.C19EG;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.portrait.service.IAIPortraitFeatureService;
import com.ss.android.ugc.aweme.services.optimization.IRequestMusicPreloadService;
import com.ss.android.ugc.aweme.services.upload.IServiceMusicResDownListener;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.theater.service.IAITheaterFeatureService;
import com.ss.android.ugc.tiktok.tools.performance.api.task.IRecordPreloadTaskFactory;
import java.util.Map;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.AFwS261S0000000_22;
import kotlin.jvm.internal.AFwS266S0000000_25;

/* JADX INFO: loaded from: classes26.dex */
public final class RecordPreloadTaskFactoryImpl implements IRecordPreloadTaskFactory {
    /* JADX WARN: Type inference failed for: r0v0, types: [X.0tFf] */
    @Override // com.ss.android.ugc.tiktok.tools.performance.api.task.IRecordPreloadTaskFactory
    public final C1658170tFf LIZ() {
        return new AbstractC1658190tFh() { // from class: X.0tFf
            @Override // X.AbstractRunnableC21377818lM
            public final void LJII() {
                C1435570nSd.LIZ.getClass();
                C1435570nSd.LIZIZ();
                LJIIJ();
            }

            {
                LJ(AFwS266S0000000_25.get$arr$(377));
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0tFe] */
    @Override // com.ss.android.ugc.tiktok.tools.performance.api.task.IRecordPreloadTaskFactory
    public final C1658160tFe LIZIZ() {
        return new AbstractC1658210tFj() { // from class: X.0tFe
            @Override // X.AbstractRunnableC21377818lM
            public final void LJII() {
                C197010126e.LIZ.getClass();
                C197010126e.LIZIZ();
                LJIIJ();
            }

            {
                LJ(AFwS266S0000000_25.get$arr$(380));
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0tFg] */
    @Override // com.ss.android.ugc.tiktok.tools.performance.api.task.IRecordPreloadTaskFactory
    public final C1658180tFg LIZJ() {
        return new AbstractC1658200tFi() { // from class: X.0tFg
            @Override // X.AbstractRunnableC21377818lM
            public final void LJII() {
                C0MW8 c0mw8LJ;
                IAITheaterFeatureService.LIZ.getClass();
                IAITheaterFeatureService iAITheaterFeatureServiceLIZ = C549720LhC.LIZ();
                if (iAITheaterFeatureServiceLIZ != null && (c0mw8LJ = iAITheaterFeatureServiceLIZ.LJ()) != null) {
                    c0mw8LJ.LIZIZ();
                }
                LJIIJ();
            }

            {
                LJ(AFwS266S0000000_25.get$arr$(378));
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0MWE] */
    @Override // com.ss.android.ugc.tiktok.tools.performance.api.task.IRecordPreloadTaskFactory
    public final C0MWE LIZLLL() {
        return new C0MWF() { // from class: X.0MWE
            @Override // X.AbstractRunnableC21377818lM
            public final void LJII() {
                InterfaceC548110Leb interfaceC548110LebLJ;
                IAIPortraitFeatureService.LIZ.getClass();
                IAIPortraitFeatureService iAIPortraitFeatureServiceLIZ = C547790Le5.LIZ();
                if (iAIPortraitFeatureServiceLIZ != null && (interfaceC548110LebLJ = iAIPortraitFeatureServiceLIZ.LJ()) != null) {
                    interfaceC548110LebLJ.LIZIZ();
                }
                LJIIJ();
            }

            {
                LJ(AFwS239S0000000_8.get$arr$(251));
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0np8] */
    @Override // com.ss.android.ugc.tiktok.tools.performance.api.task.IRecordPreloadTaskFactory
    public final C1449520np8 LJ() {
        return new AbstractC1449530np9() { // from class: X.0np8
            @Override // X.AbstractRunnableC21377818lM
            public final void LJII() {
                C526890KlT.LIZIZ.getClass();
                C0XED.LIZLLL();
                C0XED.LJI();
                LJIIJ();
            }

            {
                LJ(AFwS261S0000000_22.get$arr$(267));
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0tFl] */
    @Override // com.ss.android.ugc.tiktok.tools.performance.api.task.IRecordPreloadTaskFactory
    public final C1658230tFl LJFF(C19EG c19eg, String str) {
        return new AbstractC1658220tFk(c19eg, str) { // from class: X.0tFl
            public final C19EG LLIZLLLIL;
            public final String LLJ;

            @Override // X.AbstractRunnableC21377818lM
            public final void LJII() {
                IRequestMusicPreloadService iRequestMusicPreloadService = (IRequestMusicPreloadService) PluggableExtentionKt.pluggableSpi$default(IRequestMusicPreloadService.class, false, false, false, 14, null);
                if (iRequestMusicPreloadService != null) {
                    iRequestMusicPreloadService.preDownloadMusic(this.LLIZLLLIL, null, new IServiceMusicResDownListener() { // from class: X.0tFm
                        @Override // com.ss.android.ugc.aweme.services.upload.IServiceMusicResDownListener
                        public final Map<String, Object> getMusicRecommendExtra() {
                            return C0XED.LJ(C526890KlT.LIZIZ);
                        }

                        @Override // com.ss.android.ugc.aweme.services.upload.IServiceMusicResDownListener
                        public final void onFailed() {
                            LJIIJ();
                        }

                        @Override // com.ss.android.ugc.aweme.services.upload.IServiceMusicResDownListener
                        public final void onSuccess(MusicModel musicModel, String str2) {
                            LJIIJ();
                        }
                    }, this.LLJ);
                }
            }

            {
                this.LLIZLLLIL = c19eg;
                this.LLJ = str;
                LJ(AFwS266S0000000_25.get$arr$(379));
            }
        };
    }
}
