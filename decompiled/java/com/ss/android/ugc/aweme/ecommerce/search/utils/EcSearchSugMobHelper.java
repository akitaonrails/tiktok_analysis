package com.ss.android.ugc.aweme.ecommerce.search.utils;

import X.C0QTA;
import X.C0QTF;
import X.C669740QOu;
import X.InterfaceC1294060jmO;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;

/* JADX INFO: loaded from: classes11.dex */
@InterfaceC1294060jmO
public final class EcSearchSugMobHelper extends ViewModel {
    public static void vQ2(String str, Integer num, String str2, SearchSugEntity searchSugEntity) {
        C0QTF c0qtf = new C0QTF();
        String id = null;
        c0qtf.LIZLLL = null;
        c0qtf.LJIILLIIL("enter_from", null);
        c0qtf.LJIILLIIL("enter_method", "sug");
        c0qtf.LJIILLIIL("search_type", C0QTA.LIZ(C669740QOu.LJ()));
        c0qtf.LJIILLIIL("words_type", str);
        c0qtf.LJIILLIIL("action_type", str2);
        c0qtf.LJIILLIIL("input_keyword", null);
        c0qtf.LJIILLIIL("search_keyword", searchSugEntity.content);
        Word word = searchSugEntity.mWord;
        if (word != null) {
            id = word.getId();
        }
        c0qtf.LJIILLIIL("group_id", id);
        c0qtf.LJIILLIIL("order", String.valueOf(num));
        c0qtf.LJIILJJIL();
    }
}
