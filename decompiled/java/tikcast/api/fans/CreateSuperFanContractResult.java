package tikcast.api.fans;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.envelope.model.EnvelopeEnigmaInfo;
import webcast.data.RechargeCustomError;

/* JADX INFO: loaded from: classes8.dex */
public final class CreateSuperFanContractResult {

    @C09CT("customErr")
    public RechargeCustomError customerr;

    @C09CT("envelope_info")
    public SuperFanEnvelopeInfo envelopeInfo;

    @C09CT("sub_circle")
    public int subCircle;

    @C09CT("super_fan_pay_channel")
    public int superFanPayChannel;

    @C09CT("super_fan_status")
    public int superFanStatus;

    @C09CT("super_fan_tpl_type")
    public int superFanTplType;

    @C09CT("tpl_id")
    public String tplId = "";

    @C09CT("biz_content")
    public String bizContent = "";

    @C09CT("contract_id")
    public String contractId = "";

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
