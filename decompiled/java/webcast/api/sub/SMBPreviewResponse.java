package webcast.api.sub;

import X.C09CT;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.api.SMBBasicInfo;
import com.bytedance.android.livesdk.chatroom.api.SMBCourse;
import com.bytedance.android.livesdk.chatroom.api.SMBVerificationInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class SMBPreviewResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("anchor_basic_info")
        public SMBBasicInfo anchorBasicInfo;

        @C09CT("anchor_data")
        public User anchorData;

        @C09CT("display_header_dm_btn")
        public boolean displayHeaderDmBtn;

        @C09CT("display_switch")
        public PreviewDisplay displaySwitch;

        @C09CT("dm_info")
        public DMInfo dmInfo;

        @C09CT("form_info")
        public FormInfo formInfo;

        @C09CT("smb_service_pin_info")
        public SMBServicePinInfo smbServicePinInfo;

        @C09CT("subscription_type")
        public int subscriptionType;

        @C09CT("third_party_link_info")
        public ThirdPartyLinkDisplayInfo thirdPartyLinkInfo;

        @C09CT("verification_info")
        public SMBVerificationInfo verificationInfo;

        @C09CT("sub_info")
        public List<SubInfo> subInfo = new ArrayList();

        @C09CT("form_info_list")
        public List<FormInfo> formInfoList = new ArrayList();

        @C09CT("sku_order")
        public List<Long> skuOrder = new ArrayList();

        @C09CT("course_list")
        public List<SMBCourse> courseList = new ArrayList();

        @C09CT("booking_info_list")
        public List<BookingInfo> bookingInfoList = new ArrayList();
    }

    public static final class SubInfo {

        @C09CT("package_id")
        public String packageId = "";

        @C09CT("service_info")
        public ServiceInfo serviceInfo;

        @C09CT("sku_id")
        public long skuId;
    }
}
