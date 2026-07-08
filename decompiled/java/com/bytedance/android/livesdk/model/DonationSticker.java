package com.bytedance.android.livesdk.model;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class DonationSticker {

    @C09CT("content")
    public OrganizationModel content;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public long id;

    @C09CT("image")
    public ImageModel image;

    @C09CT("kind")
    public long kind;

    @C09CT("max_length")
    public long maxLength;

    @C09CT("h")
    public int screenHeight;

    @C09CT("w")
    public int screenWidth;

    @C09CT("sit_rect")
    public List<Double> sit_rect;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public long status;

    @C09CT("sub_type")
    public Long subType;

    @C09CT("text_color")
    public String textColor;

    @C09CT("text_size")
    public int textSize;

    @C09CT("type")
    public int type;

    @C09CT("input_rect")
    public List<Long> inputRect = new ArrayList();

    @C09CT("x")
    public int x = -1;

    @C09CT("y")
    public int y = -1;

    public final RoomDecoration LIZ() {
        RoomDecoration roomDecoration = new RoomDecoration(null, 0L, new ArrayList(), 0L, 0L, null);
        roomDecoration.image = this.image;
        roomDecoration.textColor = this.textColor;
        roomDecoration.textSize = this.textSize;
        roomDecoration.content = this.content != null ? GsonProtectorUtils.toJson(new Gson(), this.content) : "";
        roomDecoration.maxLength = this.maxLength;
        roomDecoration.inputRect = this.inputRect;
        roomDecoration.type = this.type;
        roomDecoration.id = this.id;
        roomDecoration.xPosition = this.x;
        roomDecoration.yPosition = this.y;
        roomDecoration.screenWidth = this.screenWidth;
        roomDecoration.screenHeight = this.screenHeight;
        roomDecoration.status = this.status;
        roomDecoration.kind = this.kind;
        roomDecoration.sit_rect = this.sit_rect;
        return roomDecoration;
    }
}
