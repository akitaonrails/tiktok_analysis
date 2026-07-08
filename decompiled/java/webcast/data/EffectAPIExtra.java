package webcast.data;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class EffectAPIExtra {

    @C09CT("trade_change")
    public int tradeChange;

    @C09CT("rec_id")
    public String recId = "";

    @C09CT("effect_recommend")
    public String effectRecommend = "";

    @C09CT("ab_params")
    public String abParams = "";

    @C09CT("filtered_effects")
    public List<FilteredEffect> filteredEffects = new ArrayList();
}
