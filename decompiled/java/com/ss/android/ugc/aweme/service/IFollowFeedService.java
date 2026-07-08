package com.ss.android.ugc.aweme.service;

import X.AbstractC738140SxQ;
import X.C059B;
import X.C0CCZ;
import X.C0WHU;
import X.C13IQ;
import X.C19EG;
import X.C737030Svd;
import X.InterfaceC1569400qwU;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.module.FollowingInterestUser;
import com.ss.android.ugc.aweme.follow.presenter.FollowFeed;
import java.util.List;

/* JADX INFO: loaded from: classes25.dex */
public interface IFollowFeedService {
    void E1();

    void LIZ(Context context, List<FollowingInterestUser> list);

    C0WHU LIZIZ();

    void LIZJ(Context context);

    void LIZLLL();

    void LJ(String str);

    InterfaceC1569400qwU LJFF(C19EG c19eg);

    void LJI(String str, C059B c059b);

    C13IQ<? extends AbstractC738140SxQ> LJII();

    C0CCZ LJIIIIZZ(Context context);

    boolean LJIIIZ();

    void LJIIJ();

    Fragment LJIIJJI();

    C13IQ<? extends AbstractC738140SxQ> LJIIL();

    boolean LJIILIIL(C737030Svd c737030Svd);

    void LJIILJJIL(long j);

    void LJIILL(String str, boolean z);

    void LJIILLIIL(int i, int i2);

    List<Aweme> LJIIZILJ(List<? extends FollowFeed> list);

    int LJIJ();

    C13IQ<? extends UIContentAssem> LJIJI();

    long LJIJJ();

    int LJIJJLI(Fragment fragment);

    void S1();

    boolean T1();

    void refreshComment(Fragment fragment);
}
