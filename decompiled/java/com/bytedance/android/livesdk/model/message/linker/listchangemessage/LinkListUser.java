package com.bytedance.android.livesdk.model.message.linker.listchangemessage;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;

/* JADX INFO: loaded from: classes.dex */
public final class LinkListUser {
    public int LIZ;
    public long LIZIZ;

    @C09CT("blurred_avatar")
    public ImageModel blurredAvatar;

    @C09CT("fan_ticket")
    public long fanTicket;

    @C09CT("fan_ticket_icon_type")
    public int fanTicketType;

    @C09CT("linkmic_id_str")
    public String linkMicId = "";

    @C09CT("link_type")
    public int linkType;

    @C09CT("link_user_type")
    public int linkUserType;

    @C09CT("modify_time")
    public long modifyTime;

    @C09CT("payed_money")
    public long payedMoney;

    @C09CT("role_type")
    public int roleType;

    @C09CT("user")
    public User user;
}
