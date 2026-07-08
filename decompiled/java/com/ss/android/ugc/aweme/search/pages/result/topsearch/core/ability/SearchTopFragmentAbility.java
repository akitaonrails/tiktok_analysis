package com.ss.android.ugc.aweme.search.pages.result.topsearch.core.ability;

import X.C0PC8;
import X.C639320P5u;
import X.InterfaceC494301wD;
import X.InterfaceC639200P5i;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes11.dex */
public interface SearchTopFragmentAbility extends ISearchExposureAbility, InterfaceC494301wD {
    MutableLiveData BA();

    String CO();

    InterfaceC639200P5i Di2();

    void Ev2(int i, int i2);

    int IZ1();

    RecyclerView LLII();

    RecyclerView.ViewHolder LU(View view);

    C639320P5u Lw1();

    void bH0(boolean z);

    void cy(int i);

    int iL(Function1<? super SearchMixFeed, Boolean> function1);

    void k01();

    C0PC8 nL2(RecyclerView recyclerView);

    int ni1();

    float nj2();

    void oR(float f);

    boolean sI(int i, String str);

    boolean vp1();

    void w40(String str);

    void yp1();
}
