package tikcast.api.fans;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.envelope.model.EnvelopeEnigmaInfo;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import webcast.data.FansLevelInfo;
import webcast.data.SuperFanPackage;

/* JADX INFO: loaded from: classes8.dex */
public final class PolingSuperFanContractStatusResult {

    @C09CT("create_contract_intent")
    public int createContractIntent;

    @C09CT("envelop_info")
    public SuperFanEnvelopeInfo envelopInfo;

    @C09CT("fans_count")
    public long fansCount;

    @C09CT("fans_level_info")
    public FansLevelInfo fansLevelInfo;

    @C09CT("room_id")
    public long roomId;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;

    @C09CT("super_fan_package")
    public SuperFanPackage superFanPackage;

    @C09CT("super_fan_pay_channel")
    public int superFanPayChannel;

    @C09CT("super_fan_sub_circle")
    public int superFanSubCircle;

    @C09CT("super_fan_tpl_type")
    public int superFanTplType;

    @C09CT("toast")
    public String toast = "";

    /* JADX INFO: loaded from: classes18.dex */
    public static final class SuperFanEnvelopeInfo {

        @C09CT("business_type")
        public int businessType;

        @C09CT("diamond_count")
        public int diamondCount;

        @C09CT("follow_show_status")
        public int followShowStatus;

        @C09CT("people_count")
        public int peopleCount;

        @C09CT("send_user_avatar")
        public ImageModel sendUserAvatar;

        @C09CT("sender_enigma_info")
        public EnvelopeEnigmaInfo senderEnigmaInfo;

        @C09CT("skin_id")
        public int skinId;

        @C09CT("unpack_at")
        public int unpackAt;

        @C09CT("vote_count")
        public int voteCount;

        @C09CT("envelope_id")
        public String envelopeId = "";

        @C09CT("envelope_idc")
        public String envelopeIdc = "";

        @C09CT("send_user_name")
        public String sendUserName = "";

        @C09CT("send_user_id")
        public String sendUserId = "";

        @C09CT("room_id")
        public String roomId = "";
    }
}
