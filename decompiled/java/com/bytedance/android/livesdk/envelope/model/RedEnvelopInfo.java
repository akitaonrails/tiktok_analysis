package com.bytedance.android.livesdk.envelope.model;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;

/* JADX INFO: loaded from: classes18.dex */
public final class RedEnvelopInfo {

    @C09CT("business_type")
    public Integer businessType;

    @C09CT("create_at")
    public long createAt;

    @C09CT("diamond_count")
    public Integer diamondCount;

    @C09CT("envelope_id")
    public String envelopeId;

    @C09CT("envelope_idc")
    public String envelopeIdc;

    @C09CT("follow_show_status")
    public int followShowStatus;

    @C09CT("people_count")
    public Integer peopleCount;

    @C09CT("room_id")
    public String roomId;

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

    @C09CT("unpack_at")
    public Integer unpackAt;

    @C09CT("vote_count")
    public int voteCount;

    public RedEnvelopInfo() {
        this(null, null, null, null, null, null, null, null, null, null, 0, 0, 0, null, 0L);
    }

    public RedEnvelopInfo(String str, Integer num, String str2, String str3, Integer num2, Integer num3, Integer num4, String str4, ImageModel imageModel, String str5, int i, int i2, int i3, EnvelopeEnigmaInfo envelopeEnigmaInfo, long j) {
        this.envelopeId = str;
        this.businessType = num;
        this.envelopeIdc = str2;
        this.sendUserName = str3;
        this.diamondCount = num2;
        this.peopleCount = num3;
        this.unpackAt = num4;
        this.sendUserId = str4;
        this.sendUserAvatar = imageModel;
        this.roomId = str5;
        this.followShowStatus = i;
        this.skinId = i2;
        this.voteCount = i3;
        this.senderEnigmaInfo = envelopeEnigmaInfo;
        this.createAt = j;
    }
}
