package com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model;

import X.AbstractC1905540zge;
import X.C09CT;
import X.C1227904rF;
import X.C2188811AlT;
import X.EnumC047000Ey;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class TakoSugWordCard implements Serializable {
    public static final int $stable = 8;

    @C09CT("sug_card_type")
    public final String sugCardType;

    @C09CT("sug_word_for_tako")
    public final List<String> sugForTako;

    @C09CT("sug_word")
    public final List<String> sugWords;

    @C09CT("tako_sug_word_mob_info")
    public final String takoSugWordMobInfo;

    public TakoSugWordCard() {
        this(new ArrayList(), "", new ArrayList(), null);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoSugWordCard(sugWords=");
        sbLIZ.append(this.sugWords);
        sbLIZ.append(", sugCardType=");
        sbLIZ.append(this.sugCardType);
        sbLIZ.append(", sugForTako=");
        sbLIZ.append(this.sugForTako);
        sbLIZ.append(", takoSugWordMobInfo=");
        sbLIZ.append(this.takoSugWordMobInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final List<Map<String, String>> getSugListMobParams() {
        String str = this.takoSugWordMobInfo;
        if (str == null) {
            return null;
        }
        try {
            C1227904rF c1227904rF = C1227904rF.LIZ;
            Type type = new AbstractC1905540zge<List<? extends Map<String, String>>>() { // from class: X.0PQx
            }.getType();
            c1227904rF.getClass();
            return (List) C1227904rF.LIZJ(str, type);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    public final boolean isAskTakoCard() {
        return Intrinsics.LJFF(this.sugCardType, EnumC047000Ey.ASK_TAKO_CARD.getType());
    }

    public final boolean isTop1SugCard() {
        return Intrinsics.LJFF(this.sugCardType, EnumC047000Ey.TOP1_SUG_CARD.getType());
    }

    public TakoSugWordCard(List<String> list, String str, List<String> list2, String str2) {
        this.sugWords = list;
        this.sugCardType = str;
        this.sugForTako = list2;
        this.takoSugWordMobInfo = str2;
    }
}
