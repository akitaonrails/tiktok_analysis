package com.ss.android.ugc.aweme.search.df.api.cointask.core.spi.dummyspi;

import com.ss.android.ugc.aweme.search.df.api.cointask.core.spi.ISearchCoinTaskProvider;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class DummySearchCoinTaskProvider implements ISearchCoinTaskProvider {
    @Override // com.ss.android.ugc.aweme.search.df.api.cointask.core.spi.ISearchCoinTaskProvider
    public final void LIZ(int i, int i2, String str, String str2, Function1<? super Map<String, String>, Unit> function1) {
        function1.invoke(null);
    }
}
