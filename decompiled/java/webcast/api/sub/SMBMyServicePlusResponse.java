package webcast.api.sub;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class SMBMyServicePlusResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("business_overview")
        public BusinessOverViewV2 businessOverview;

        @C09CT("show_moderator_pin_card_entrance")
        public boolean showModeratorPinCardEntrance;

        @C09CT("smb_service_pin_info")
        public SMBServicePinInfo smbServicePinInfo;

        @C09CT("subscription_type")
        public int subscriptionType;

        @C09CT("tips")
        public List<Tip> tips = new ArrayList();
    }

    public static final class Tip {

        @C09CT("icon")
        public ImageModel icon;

        @C09CT("name")
        public String name = "";

        @C09CT("content")
        public String content = "";

        @C09CT("button_text")
        public String buttonText = "";

        @C09CT("schema_url")
        public String schemaUrl = "";
    }
}
