package com.ss.android.ugc.aweme.search.df.api.incentivetask.spi;

import X.C19EG;
import X.C641960PFy;
import X.C649950PeT;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.discover.model.GlobalDoodleConfig;
import com.ss.android.ugc.aweme.search.df.api.incentivetask.model.IncentiveDetailInfo;
import com.ss.android.ugc.aweme.search.df.api.incentivetask.model.SearchIncentiveTaskScene;
import com.ss.android.ugc.aweme.search.df.api.incentivetask.model.SearchIncentiveTaskType;
import com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment;

/* JADX INFO: loaded from: classes11.dex */
public interface ISearchIncentiveTaskBridgeService {
    public static final C641960PFy LIZ = C641960PFy.LIZ;

    boolean LIZ();

    void LIZIZ(View view, C649950PeT c649950PeT);

    void LIZJ(int i);

    void LIZLLL(SearchIncentiveTaskScene searchIncentiveTaskScene);

    IncentiveDetailInfo LJ();

    boolean LJFF(GlobalDoodleConfig globalDoodleConfig, Fragment fragment, SearchIncentiveTaskScene searchIncentiveTaskScene);

    boolean LJI(String str);

    boolean LJII();

    void LJIIIIZZ(Fragment fragment, boolean z, C19EG c19eg);

    void LJIIIZ(View view, String str);

    boolean LJIIJ();

    void LJIIJJI(View view, String str);

    void LJIIL(View view);

    View LJIILIIL(C19EG c19eg, Fragment fragment);

    View LJIILJJIL(Context context, Fragment fragment);

    boolean LJIILL();

    void LJIILLIIL(GlobalDoodleConfig globalDoodleConfig, boolean z, SearchIncentiveTaskType searchIncentiveTaskType, C19EG c19eg, Fragment fragment, boolean z2, String str);

    void LJIIZILJ(SearchFragment searchFragment, C19EG c19eg);

    int LJIJ();

    boolean canShowBanner();

    SearchIncentiveTaskType getTaskType();
}
