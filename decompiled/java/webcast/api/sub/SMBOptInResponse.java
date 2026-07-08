package webcast.api.sub;

import X.C09CT;
import com.bytedance.android.livesdk.chatroom.api.SMBOptInStep;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public final class SMBOptInResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("enabled_booking")
        public boolean enabledBooking;

        @C09CT("enabled_course")
        public boolean enabledCourse;

        @C09CT("enabled_dm_service_sku")
        public boolean enabledDmServiceSku;

        @C09CT("enabled_form_service_sku")
        public boolean enabledFormServiceSku;

        @C09CT("enabled_sub_service_sku")
        public boolean enabledSubServiceSku;

        @C09CT("has_been_blacklisted")
        public boolean hasBeenBlacklisted;

        @C09CT("is_target_creator")
        public boolean isTargetCreator;

        @C09CT("opt_in_steps")
        public List<SMBOptInStep> optInSteps = new ArrayList();

        @C09CT("skip_form_setup")
        public boolean skipFormSetup;
    }
}
