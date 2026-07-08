package com.ss.android.ugc.aweme;

import X.C1007900cKq;
import X.C1008160cLG;
import X.C1009340cNA;
import X.C1009520cNS;
import X.C1014660cVk;
import X.C1015460cX2;
import X.C1016430cYb;
import X.C1016460cYe;
import X.InterfaceC1007910cKr;
import X.InterfaceC1016480cYg;
import android.content.Context;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.Set;

/* JADX INFO: loaded from: classes17.dex */
public interface IAnoleService {
    boolean LIZ(C1009340cNA c1009340cNA, String str, String str2);

    C1014660cVk LIZIZ(AwemeRawAd awemeRawAd, AnoleComponentModel anoleComponentModel);

    Integer LIZJ(String str, String str2);

    void LIZLLL(C1009340cNA c1009340cNA, C1016430cYb c1016430cYb);

    C1015460cX2 LJ();

    void LJFF(C1009340cNA c1009340cNA);

    C1007900cKq LJI(Context context, Set set, C1009340cNA c1009340cNA, InterfaceC1007910cKr interfaceC1007910cKr, C1008160cLG c1008160cLG);

    C1009520cNS LJII();

    void LJIIIIZZ(C1016460cYe c1016460cYe, AwemeRawAd awemeRawAd, InterfaceC1016480cYg interfaceC1016480cYg);
}
