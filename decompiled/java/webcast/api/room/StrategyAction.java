package webcast.api.room;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class StrategyAction {

    @C09CT("action_type")
    public int actionType;

    @C09CT("custom_event")
    public CustomEvent customEvent;

    @C09CT("native_recall")
    public boolean nativeRecall;

    @C09CT("trigger_strategies")
    public List<TriggerStrategy> triggerStrategies = new ArrayList();

    @C09CT("write_feature_centor")
    public WriteFeatureCentor writeFeatureCentor;
}
