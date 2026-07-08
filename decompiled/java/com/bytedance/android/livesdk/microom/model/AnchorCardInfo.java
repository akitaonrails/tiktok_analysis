package com.bytedance.android.livesdk.microom.model;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import java.io.Serializable;

/* JADX INFO: loaded from: classes8.dex */
public final class AnchorCardInfo implements Serializable {

    @C09CT("bg_image")
    public ImageModel bgImage;

    @C09CT("current_user")
    public User currentUser;

    @C09CT("show_end_timestamp")
    public String showEndTimestamp;

    @C09CT("show_start_timestamp")
    public String showStartTimestamp;

    public AnchorCardInfo() {
        this(null, null, null, null);
    }

    public final void setBgImage(ImageModel imageModel) {
        this.bgImage = imageModel;
    }

    public final void setCurrentUser(User user) {
        this.currentUser = user;
    }

    public final void setShowEndTimestamp(String str) {
        this.showEndTimestamp = str;
    }

    public final void setShowStartTimestamp(String str) {
        this.showStartTimestamp = str;
    }

    public AnchorCardInfo(String str, String str2, ImageModel imageModel, User user) {
        this.showStartTimestamp = str;
        this.showEndTimestamp = str2;
        this.bgImage = imageModel;
        this.currentUser = user;
    }
}
