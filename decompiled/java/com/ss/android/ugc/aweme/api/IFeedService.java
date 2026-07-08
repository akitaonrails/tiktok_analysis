package com.ss.android.ugc.aweme.api;

import X.C19EG;
import X.InterfaceC1002070cBR;
import X.InterfaceC1008930cMV;
import X.InterfaceC1017820caq;
import android.content.Context;
import com.ss.android.ugc.aweme.api.series.ICommerceFeedSeriesService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public interface IFeedService {
    void LIZ(Context context, String str);

    void LIZIZ(int i, C19EG c19eg, String str, List list);

    InterfaceC1008930cMV LIZJ(Context context, Aweme aweme, String str, boolean z);

    void LIZLLL(Context context, Aweme aweme);

    InterfaceC1008930cMV LJ();

    InterfaceC1002070cBR LJFF();

    void LJI(int i, Context context, String str, List list);

    void LJII(Context context, Aweme aweme, String str);

    void LJIIIIZZ(Context context, Aweme aweme, String str);

    ICommerceFeedSeriesService LJIIIZ();

    void LJIIJ(Context context, Aweme aweme, String str);

    String LJIIJJI(int i);

    void LJIIL(int i, Context context, String str, List list);

    InterfaceC1017820caq LJIILIIL();
}
