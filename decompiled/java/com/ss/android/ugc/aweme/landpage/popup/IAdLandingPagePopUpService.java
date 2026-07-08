package com.ss.android.ugc.aweme.landpage.popup;

import X.AbstractC343940De4;
import X.C1025720cna;
import X.C1026310coX;
import X.C1036140d4O;
import X.C1036170d4R;
import X.C1036300d4e;
import X.C1036360d4k;
import X.C1036540d52;
import X.C19EG;
import X.EnumC1030360cv4;
import X.EnumC1036160d4Q;
import X.InterfaceC1036270d4b;
import X.InterfaceC1036350d4j;
import Y.ARunnableS116S0100000_16;
import android.os.Bundle;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.ad.QuickActionModel;

/* JADX INFO: loaded from: classes17.dex */
public interface IAdLandingPagePopUpService {
    void LIZ(boolean z);

    void LIZIZ(Bundle bundle, AwemeRawAd awemeRawAd);

    void LIZJ(C19EG c19eg, ARunnableS116S0100000_16 aRunnableS116S0100000_16);

    boolean LIZLLL(C1026310coX c1026310coX);

    void LJ(boolean z);

    void LJFF(boolean z);

    boolean LJI();

    boolean LJII();

    void LJIIIIZZ(C1026310coX c1026310coX);

    C1026310coX LJIIIZ(Aweme aweme, AwemeRawAd awemeRawAd);

    boolean LJIIJ(int i, C19EG c19eg, InterfaceC1036270d4b interfaceC1036270d4b, C1026310coX c1026310coX, String str);

    boolean LJIIJJI(C1026310coX c1026310coX, Boolean bool);

    C1036540d52 LJIIL(C19EG c19eg, Fragment fragment, InterfaceC1036350d4j interfaceC1036350d4j, C1036360d4k c1036360d4k);

    void LJIILIIL();

    boolean LJIILJJIL(C19EG c19eg, C1026310coX c1026310coX, QuickActionModel quickActionModel, Aweme aweme, int i, String str);

    boolean LJIILL();

    void LJIILLIIL(C19EG c19eg, C1026310coX c1026310coX, EnumC1036160d4Q enumC1036160d4Q);

    C1036300d4e LJIIZILJ(C1036140d4O c1036140d4O);

    void LJIJ();

    boolean LJIJI();

    C1036170d4R LJIJJ(C19EG c19eg, Fragment fragment, C1036360d4k c1036360d4k);

    void LJIJJLI(C19EG c19eg, C1026310coX c1026310coX, EnumC1036160d4Q enumC1036160d4Q, EnumC1030360cv4 enumC1030360cv4);

    void LJIL(C19EG c19eg, FrameLayout frameLayout, C1026310coX c1026310coX);

    void LJJ(C19EG c19eg, AwemeRawAd awemeRawAd, AbstractC343940De4 abstractC343940De4, boolean z, C1025720cna c1025720cna);

    void LJJI(C19EG c19eg, FrameLayout frameLayout, String str, Aweme aweme, int i, int i2, boolean z);
}
