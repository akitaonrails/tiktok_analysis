package webcast.api.room;

import X.C09CT;

/* JADX INFO: loaded from: classes8.dex */
public final class StrategyTrigger {

    @C09CT("delay")
    public long delay;

    @C09CT("delay_type")
    public int delayType;

    @C09CT("random_delay_lower")
    public long randomDelayLower;

    @C09CT("random_delay_upper")
    public long randomDelayUpper;

    @C09CT("trigger_by_cep")
    public boolean triggerByCep;

    @C09CT("trigger_type")
    public int triggerType;

    @C09CT("cep_expression")
    public String cepExpression = "";

    @C09CT("cep_rule_name")
    public String cepRuleName = "";

    @C09CT("trigger_scene")
    public String triggerScene = "";

    @C09CT("trigger_id")
    public String triggerId = "";

    @C09CT("trigger_params")
    public String triggerParams = "";
}
