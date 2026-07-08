package com.ss.android.ugc.aweme.search.df.api.cointask.core.spi;

import X.C19EG;
import X.C649950PeT;
import X.C650270Pez;
import X.EnumC642230PGz;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.discover.model.GlobalDoodleConfig;
import com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public interface ISearchBlankPageCoinTaskService {
    public static final C650270Pez LIZ = C650270Pez.LIZ;

    void LIZIZ(View view, C649950PeT c649950PeT);

    int LIZJ();

    View LIZLLL(C19EG c19eg, Fragment fragment);

    void LJ(GlobalDoodleConfig globalDoodleConfig, boolean z, C19EG c19eg, Fragment fragment, boolean z2);

    void LJFF(View view, String str);

    Map<String, String> LJI();

    View LJII(Context context, Fragment fragment);

    void LJIIIIZZ(C19EG c19eg, SearchFragment searchFragment, EnumC642230PGz enumC642230PGz);

    Map<String, String> LJIIIZ();

    void LJIIJ();

    boolean LJIIJJI(SearchFragment searchFragment, C19EG c19eg);

    void LJIIL(View view);

    void LJIILIIL(Fragment fragment, C19EG c19eg);

    void LJIILJJIL(View view);

    boolean LJIILL();

    boolean LJIILLIIL();

    void LJIIZILJ(Fragment fragment, boolean z);

    void LJIJ(View view, String str);

    boolean LJIJI();

    boolean LJIJJ();

    View LJIJJLI(C19EG c19eg, Fragment fragment);

    boolean LJIL();
}
