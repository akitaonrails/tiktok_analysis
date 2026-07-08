package com.bytedance.android.livesdk.model.message.redenvelope;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.envelope.model.EnvelopeEnigmaInfo;

/* JADX INFO: loaded from: classes18.dex */
public final class MessageRedEnvelopInfo {

    @C09CT("business_type")
    public Integer businessType;

    @C09CT("create_at")
    public String createTime;

    @C09CT("diamond_count")
    public Integer diamondCount;

    @C09CT("envelope_id")
    public String envelopeId;

    @C09CT("envelope_idc")
    public String envelopeIdc;

    @C09CT("follow_show_status")
    public int followStatusShow;

    @C09CT("people_count")
    public Integer peopleCount;

    @C09CT("send_user_avatar")
    public ImageModel sendUserAvatar;

    @C09CT("send_user_id")
    public String sendUserId;

    @C09CT("send_user_name")
    public String sendUserName;

    @C09CT("sender_enigma_info")
    public EnvelopeEnigmaInfo senderEnigmaInfo;

    @C09CT("skin_id")
    public int skinId;

    @C09CT("super_fan_count")
    public int superFanCount;

    @C09CT("unpack_at")
    public Integer unpackAt;

    @C09CT("vote_count")
    public int voteCount;
}
