package com.ss.android.ugc.aweme.ecommerce.search.result;

import X.C675650Qep;
import X.EnumC669620QOi;
import X.InterfaceC494301wD;
import android.view.View;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.ecommerce.search.page.state.IPageSearchSubPageAbility;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;

/* JADX INFO: loaded from: classes11.dex */
public interface ISearchResultSubPageAbility extends InterfaceC494301wD, IPageSearchSubPageAbility {
    NextLiveData<Integer> F6();

    void GO0(boolean z);

    View Gu();

    void Hb2(int i);

    View Le();

    View Lu();

    void MP1(int i);

    EnumC669620QOi P1();

    EnumC669620QOi SU0();

    SearchResultParam Tb();

    void Tm0();

    void Vq0(int i);

    View Wu();

    void Xd1(EnumC669620QOi enumC669620QOi);

    boolean bx(EnumC669620QOi enumC669620QOi);

    int dx0();

    String getTabNameByIndex(int i);

    void he0(EnumC669620QOi enumC669620QOi);

    void in2(int i);

    boolean nN();

    int q4();

    Integer qQ();

    void setMaxWidth(int i);

    C675650Qep tk2();

    Integer wz();

    EnumC669620QOi yC0();
}
