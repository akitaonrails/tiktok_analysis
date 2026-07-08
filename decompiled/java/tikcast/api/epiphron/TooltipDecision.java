package tikcast.api.epiphron;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.message.common.Text;

/* JADX INFO: loaded from: classes18.dex */
public final class TooltipDecision {

    @C09CT("icon")
    public ImageModel icon;

    @C09CT("icon_style")
    public long iconStyle;

    @C09CT("share_guide_biz")
    public ShareGuideBiz shareGuideBiz;

    @C09CT("show_duration_ms")
    public long showDurationMs;

    @C09CT("show_tooltip")
    public boolean showTooltip;

    @C09CT("tooltip_text")
    public Text tooltipText;

    @C09CT("trigger_name")
    public String triggerName = "";
}
