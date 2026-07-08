package com.ss.android.ugc.aweme.simreporterdt.report;

import X.C1481340oeS;
import X.C1481560oeo;
import X.C1481580oeq;
import X.C1481690of1;
import X.C1481720of4;
import X.C1481840ofG;
import X.C1481850ofH;
import X.C1482260ofw;
import com.ss.android.ugc.aweme.playereventreporter.VideoInfo;
import com.ss.android.ugc.aweme.simreporter.callback.UpdateCallback;

/* JADX INFO: loaded from: classes24.dex */
public interface IPlayerEventReporter {
    void LIZ();

    void LIZIZ(UpdateCallback updateCallback);

    void LIZJ(int i, VideoInfo videoInfo, C1482260ofw c1482260ofw);

    void LIZLLL();

    void LJ();

    void LJFF();

    void LJI();

    void LJII(C1481720of4 c1481720of4, VideoInfo videoInfo);

    void LJIIIIZZ(String str, VideoInfo videoInfo, C1481340oeS c1481340oeS);

    void LJIIIZ();

    void LJIIJ();

    void LJIIJJI(C1481580oeq c1481580oeq);

    void LJIIL(C1481840ofG c1481840ofG, VideoInfo videoInfo);

    void LJIILIIL(VideoInfo videoInfo, C1481690of1 c1481690of1, long j, String str, boolean z);

    void LJIILJJIL(C1481560oeo c1481560oeo, VideoInfo videoInfo);

    void LJIILL(C1481850ofH c1481850ofH, VideoInfo videoInfo);

    void init();

    void release();
}
