package com.ss.android.ugc.aweme.search.lynx.core.config;

import X.C09CT;
import X.C13BV;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class AutoConcurrencyConfig {

    @C09CT("use_auto_concurrency")
    public boolean enable;

    @C09CT("white_listed_cards")
    public List<String> whiteListedCards = C13BV.INSTANCE;
}
