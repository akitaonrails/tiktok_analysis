package webcast.data;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class InteractiveEffectTriggerCondition {

    @C09CT("filter_keyword")
    public List<String> filterKeyword = new ArrayList();

    @C09CT("phase")
    public String phase = "";

    @C09CT("trigger_interval")
    public long triggerInterval;

    @C09CT("trigger_threshold")
    public long triggerThreshold;

    @C09CT("trigger_type")
    public int triggerType;
}
