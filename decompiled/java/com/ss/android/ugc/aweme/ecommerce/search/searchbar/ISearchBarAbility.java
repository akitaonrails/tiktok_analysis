package com.ss.android.ugc.aweme.ecommerce.search.searchbar;

import X.C0QPH;
import X.C19U1;
import X.EnumC671640QWc;
import X.EnumC671670QWf;
import X.InterfaceC1294060jmO;
import X.InterfaceC494301wD;
import android.widget.EditText;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;

/* JADX INFO: loaded from: classes11.dex */
public interface ISearchBarAbility extends InterfaceC494301wD, C0QPH {
    void O6(String str);

    C19U1 R01();

    @InterfaceC1294060jmO
    EditText Xv();

    boolean dv();

    void f7();

    void fc(Long l);

    void gw(EnumC671640QWc enumC671640QWc);

    MutableLiveData h02();

    void kA0(EnumC671670QWf enumC671670QWf);

    void pD0(EnumC671670QWf enumC671670QWf);

    void rc2(boolean z, boolean z2);

    void sJ1(Word word);

    NextLiveData<Boolean> uO();
}
