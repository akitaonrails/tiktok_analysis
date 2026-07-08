package com.ss.android.ugc.aweme.frequency.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class RuleHitState implements Serializable {

    @C09CT("create_time")
    public final long createTime;

    @C09CT("hit_rule_id")
    public final List<String> hitRuleIds;

    @C09CT("is_hit")
    public final Boolean isHit;

    @C09CT("outreach_key")
    public final String outreachKey;

    @C09CT("rule_strategy")
    public final String ruleStrategy;

    @C09CT("unique_key")
    public final String uniqueKey;

    public RuleHitState() {
        this(null, null, null, null, null, System.currentTimeMillis());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RuleHitState)) {
            return false;
        }
        RuleHitState ruleHitState = (RuleHitState) obj;
        return Intrinsics.LJFF(this.uniqueKey, ruleHitState.uniqueKey) && Intrinsics.LJFF(this.outreachKey, ruleHitState.outreachKey) && Intrinsics.LJFF(this.isHit, ruleHitState.isHit) && Intrinsics.LJFF(this.hitRuleIds, ruleHitState.hitRuleIds) && Intrinsics.LJFF(this.ruleStrategy, ruleHitState.ruleStrategy) && this.createTime == ruleHitState.createTime;
    }

    public final Boolean isHit() {
        return this.isHit;
    }

    public RuleHitState(String str, String str2, Boolean bool, List<String> list, String str3, long j) {
        this.uniqueKey = str;
        this.outreachKey = str2;
        this.isHit = bool;
        this.hitRuleIds = list;
        this.ruleStrategy = str3;
        this.createTime = j;
    }
}
