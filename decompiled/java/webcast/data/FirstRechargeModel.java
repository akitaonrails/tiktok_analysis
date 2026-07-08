package webcast.data;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.message.common.Text;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class FirstRechargeModel {

    @C09CT("activity_banner")
    public ActivityBanner activityBanner;

    @C09CT("bottom_area")
    public BottomArea bottomArea;

    @C09CT("exchange_banner_list")
    public RechargeBannerListConfig exchangeBannerList;

    @C09CT("exchange_button_text")
    public Text exchangeButtonText;

    @C09CT("exchange_disclaimer")
    public TPText exchangeDisclaimer;

    @C09CT("panel_background")
    public TouchPointBackground panelBackground;

    @C09CT("recharge_banner")
    public RechargeBanner rechargeBanner;

    @C09CT("recharge_banner_list")
    public RechargeBannerListConfig rechargeBannerList;

    @C09CT("recharge_button_text")
    public Text rechargeButtonText;

    @C09CT("recharge_disclaimer")
    public TPText rechargeDisclaimer;

    @C09CT("sub_title")
    public TouchPointTitle subTitle;

    @C09CT("title")
    public TouchPointTitle title;

    @C09CT("recharge_activity_banner_list")
    public List<RechargeActivityBanner> rechargeActivityBannerList = new ArrayList();

    @C09CT("exchange_activity_banner_list")
    public List<RechargeActivityBanner> exchangeActivityBannerList = new ArrayList();

    public static final class ActivityBanner {

        @C09CT("background")
        public TouchPointBackground background;

        @C09CT("border_radius")
        public float borderRadius;
    }

    public static final class BottomArea {

        @C09CT("background")
        public TouchPointBackground background;
    }

    public static final class RechargeActivityBanner {

        @C09CT("icon")
        public ImageModel icon;

        @C09CT("sub_title")
        public Text subTitle;

        @C09CT("title")
        public Text title;
    }

    public static final class RechargeBanner {

        @C09CT("background_color")
        public TouchPointColor backgroundColor;

        @C09CT("border_radius")
        public float borderRadius;

        @C09CT("exchange_sub_title")
        public Text exchangeSubTitle;

        @C09CT("exchange_title")
        public Text exchangeTitle;

        @C09CT("recharge_sub_title")
        public Text rechargeSubTitle;

        @C09CT("recharge_title")
        public Text rechargeTitle;
    }

    /* JADX INFO: loaded from: classes34.dex */
    public static final class RechargeBannerListConfig {

        @C09CT("border_radius")
        public float borderRadius;

        @C09CT("selected_background_color")
        public TouchPointColor selectedBackgroundColor;

        @C09CT("selected_border_color")
        public TouchPointColor selectedBorderColor;

        @C09CT("selected_text_color")
        public TouchPointColor selectedTextColor;
    }
}
