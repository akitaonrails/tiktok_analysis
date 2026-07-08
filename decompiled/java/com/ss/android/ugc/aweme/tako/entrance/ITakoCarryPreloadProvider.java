package com.ss.android.ugc.aweme.tako.entrance;

import android.content.Context;
import com.ss.android.ugc.aweme.tako.model.SmartSearchItem;
import com.ss.android.ugc.aweme.tako.model.TakoEventTracker;
import com.ss.android.ugc.aweme.tako.model.TakoSearchCarryInItem;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes11.dex */
public interface ITakoCarryPreloadProvider {
    void LIZ();

    void LIZIZ(Context context, String str, Function0<TakoSearchCarryInItem> function0, String str2, Function1<? super TakoSearchCarryInItem, TakoEventTracker> function1, String str3, String str4);

    void LIZJ(String str);

    boolean LIZLLL();

    void LJ(String str, String str2, SmartSearchItem smartSearchItem);
}
