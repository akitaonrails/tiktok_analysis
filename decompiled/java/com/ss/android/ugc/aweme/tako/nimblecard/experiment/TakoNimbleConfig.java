package com.ss.android.ugc.aweme.tako.nimblecard.experiment;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class TakoNimbleConfig {

    @C09CT("card_type")
    public final List<Integer> cardType;

    @C09CT("template_key")
    public final String templateKey;

    public TakoNimbleConfig(List<Integer> list, String str) {
        this.cardType = list;
        this.templateKey = str;
    }
}
