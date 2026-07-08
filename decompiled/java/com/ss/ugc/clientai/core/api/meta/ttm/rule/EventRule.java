package com.ss.ugc.clientai.core.api.meta.ttm.rule;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes36.dex */
public final class EventRule {

    @C09CT("aggregatedParam")
    public final String aggregatedParam;

    @C09CT("alias")
    public final String alias;

    @C09CT("er")
    public final EliminationRule er;

    @C09CT("eventName")
    public final String eventName;

    @C09CT("fileds")
    public final List<FiledRule> fileds;

    public final int hashCode() {
        int iHashCode = this.eventName.hashCode() * 31;
        List<FiledRule> list = this.fileds;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.aggregatedParam;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.alias;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        EliminationRule eliminationRule = this.er;
        return iHashCode4 + (eliminationRule != null ? eliminationRule.hashCode() : 0);
    }

    public EventRule(String str, List<FiledRule> list, String str2, String str3, EliminationRule eliminationRule) {
        this.eventName = str;
        this.fileds = list;
        this.aggregatedParam = str2;
        this.alias = str3;
        this.er = eliminationRule;
    }
}
