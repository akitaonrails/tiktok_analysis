package com.ss.android.ugc.aweme.ad.feed.idelpreload;

import X.C1001420cAO;
import X.EnumC1001380cAK;
import X.EnumC599900Nfw;
import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public interface ICommerceIDLEPreloadService {
    boolean LIZ(EnumC1001380cAK enumC1001380cAK);

    boolean LIZIZ();

    void LIZJ(Aweme aweme, String str);

    void LIZLLL(EnumC599900Nfw enumC599900Nfw);

    void LJ(Context context, Aweme aweme, String str);

    boolean LJFF(String str, EnumC1001380cAK enumC1001380cAK, EnumC599900Nfw enumC599900Nfw);

    void LJI(C1001420cAO c1001420cAO);

    void LJII(Context context, EnumC599900Nfw enumC599900Nfw, int i, List<? extends Aweme> list, EnumC1001380cAK enumC1001380cAK);

    C1001420cAO LJIIIIZZ(String str, EnumC1001380cAK enumC1001380cAK, EnumC599900Nfw enumC599900Nfw);
}
