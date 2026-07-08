package com.ss.android.ugc.aweme.feed.assem.ability;

import X.C0SUL;
import X.InterfaceC1294060jmO;
import X.InterfaceC494301wD;
import X.InterfaceC583650Mup;
import X.InterfaceC689860R4e;
import X.InterfaceC690460R6m;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.feed.platform.cell.RootCellCommonAbility;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public interface IVideoCellAbility extends InterfaceC494301wD {
    void Es(boolean z);

    void H8(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener);

    @InterfaceC1294060jmO
    Integer Ia();

    InterfaceC689860R4e K9();

    boolean Mg();

    void Q5(String str);

    void R();

    void Uc();

    List<Aweme> VA1();

    void Vu();

    View Vy1();

    InterfaceC690460R6m Wn0();

    int Yf2();

    @InterfaceC1294060jmO
    Integer br();

    View by1();

    void ek(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener);

    RootCellCommonAbility gI();

    Fragment getFragment();

    View getVideoView();

    void ii(boolean z);

    Aweme im();

    BaseFeedPageParams nJ2();

    void nO1();

    C0SUL om();

    void td(HashMap<String, String> map);

    InterfaceC583650Mup x3();

    boolean yE0();

    View yy0();
}
