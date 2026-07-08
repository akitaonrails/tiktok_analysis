package com.bytedance.android.livesdk.microom.model;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import java.io.Serializable;

/* JADX INFO: loaded from: classes8.dex */
public final class MicRoomDialogOfficialInfo implements Serializable {

    @C09CT("anchor_card_info")
    public AnchorCardInfo anchorCardInfo;

    @C09CT("event_info")
    public MicRoomEventInfo eventInfo;

    @C09CT("official_card_bg_image")
    public ImageModel officialCardImage;

    @C09CT("official_user")
    public User officialUser;

    public MicRoomDialogOfficialInfo() {
        this(null, null, null, null);
    }

    public final void setAnchorCardInfo(AnchorCardInfo anchorCardInfo) {
        this.anchorCardInfo = anchorCardInfo;
    }

    public final void setEventInfo(MicRoomEventInfo micRoomEventInfo) {
        this.eventInfo = micRoomEventInfo;
    }

    public final void setOfficialCardImage(ImageModel imageModel) {
        this.officialCardImage = imageModel;
    }

    public final void setOfficialUser(User user) {
        this.officialUser = user;
    }

    public MicRoomDialogOfficialInfo(User user, MicRoomEventInfo micRoomEventInfo, AnchorCardInfo anchorCardInfo, ImageModel imageModel) {
        this.officialUser = user;
        this.eventInfo = micRoomEventInfo;
        this.anchorCardInfo = anchorCardInfo;
        this.officialCardImage = imageModel;
    }
}
