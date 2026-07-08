package webcast.api.room;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class BizStrategy {

    @C09CT("engine_type")
    public int engineType;

    @C09CT("opt_type")
    public int optType;

    @C09CT("run_mode")
    public int runMode;

    @C09CT("ticker_interval")
    public float tickerInterval;

    @C09CT("time_out")
    public long timeOut;

    @C09CT("strategy_name")
    public String strategyName = "";

    @C09CT("run_package_name")
    public String runPackageName = "";

    @C09CT("input_params_key")
    public String inputParamsKey = "";

    @C09CT("trigger_event")
    public List<StrategyTriggerEvent> triggerEvent = new ArrayList();

    @C09CT("tranto_final_key")
    public String trantoFinalKey = "";

    @C09CT("action")
    public List<StrategyAction> action = new ArrayList();

    @C09CT("md5")
    public String md5 = "";

    @C09CT("ticker_event_name")
    public String tickerEventName = "";
}
