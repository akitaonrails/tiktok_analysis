package tikcast.api.wallet.tiktok;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public final class RewardFactorItem {

    @C09CT("dynamic_info")
    public FactorItemDynamicInfo dynamicInfo;

    @C09CT("need_progress_bar")
    public boolean needProgressBar;

    @C09CT("progress_bar_display_type")
    public int progressBarDisplayType;

    @C09CT("show_weekly_recap_tip")
    public boolean showWeeklyRecapTip;

    @C09CT("type")
    public int type;

    @C09CT("update_info")
    public FactorItemUpdateInfo updateInfo;

    @C09CT("tiers")
    public List<RewardFactorTier> tiers = new ArrayList();

    @C09CT("title")
    public String title = "";

    @C09CT("currency")
    public String currency = "";

    @C09CT("amount")
    public String amount = "";

    @C09CT("current_value")
    public String currentValue = "";

    @C09CT("current_percentage")
    public String currentPercentage = "";

    @C09CT("top_text")
    public String topText = "";

    @C09CT("bottom_text")
    public String bottomText = "";

    @C09CT("progress_bar_percentage")
    public String progressBarPercentage = "";

    @C09CT("max_percentage")
    public String maxPercentage = "";

    @C09CT("progress_description")
    public String progressDescription = "";

    @C09CT("top_text_links")
    public List<String> topTextLinks = new ArrayList();

    @C09CT("measurement_desc")
    public String measurementDesc = "";

    @C09CT("weekly_recap_tip")
    public String weeklyRecapTip = "";
}
