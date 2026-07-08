package webcast.data;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.message.common.Text;

/* JADX INFO: loaded from: classes18.dex */
public final class RechargeBannerModel {

    @C09CT("icon")
    public ImageModel icon;

    @C09CT("need_dismiss_dialog")
    public boolean needDismissDialog;

    @C09CT("panel_background")
    public TouchPointBackground panelBackground;

    @C09CT("recharge_disclaimer")
    public TPText rechargeDisclaimer;

    @C09CT("show_bonus_coins")
    public boolean showBonusCoins;

    @C09CT("sub_title")
    public Text subTitle;

    @C09CT("title")
    public Text title;

    @C09CT("tp_title")
    public TPText tpTitle;

    @C09CT("recharge_succ_display_data")
    public String rechargeSuccDisplayData = "";

    @C09CT("countdown_ts")
    public String countdownTs = "";
}
