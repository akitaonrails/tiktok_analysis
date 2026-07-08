package com.ss.android.ugc.aweme.search.pages.result.effectlist.core.viewmodel;

import X.C0CJN;
import X.C0R4L;
import X.C15O7;
import X.C844470XAv;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.search.pages.result.core.repo.SearchApi;
import com.ss.android.ugc.aweme.search.pages.result.effectlist.core.ui.SearchEffectPropsList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchEffectListViewModel extends ViewModel {
    public final MutableLiveData<SearchEffectPropsList> LL = new MutableLiveData<>();

    public final void vQ2(int i, String str, String str2, String str3, Function1 function1) {
        String str4 = str3;
        SearchApi.LIZ.getClass();
        SearchApi.RealApi realApiLIZ = SearchApi.LIZ();
        C844470XAv.LIZ.getClass();
        int i2 = C844470XAv.LJIIJ;
        if (str4 == null) {
            str4 = "";
        }
        C0CJN.LIZ.getClass();
        realApiLIZ.LIZ(str, str2, "click_more_general_list", i, 15, i2, str4, C0CJN.LIZ(), 1).LJ(new C0R4L(this, function1, 0), C15O7.LJIIIIZZ, null);
    }
}
