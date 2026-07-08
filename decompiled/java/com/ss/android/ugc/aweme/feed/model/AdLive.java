package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import com.ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class AdLive implements Serializable {

    @C09CT("button_bg_color")
    public String buttonBgColor;

    @C09CT("button_text")
    public String buttonText;

    @C09CT("original_room_id")
    public Long originalRoomId;

    @C09CT("redirect_live_author")
    public User redirectLiveAuthor;

    public final String getButtonBgColor() {
        return this.buttonBgColor;
    }

    public final String getButtonText() {
        return this.buttonText;
    }

    public final Long getOriginalRoomId() {
        return this.originalRoomId;
    }

    public final User getRedirectLiveAuthor() {
        return this.redirectLiveAuthor;
    }

    public final void setButtonBgColor(String str) {
        this.buttonBgColor = str;
    }

    public final void setButtonText(String str) {
        this.buttonText = str;
    }

    public final void setOriginalRoomId(Long l) {
        this.originalRoomId = l;
    }

    public final void setRedirectLiveAuthor(User user) {
        this.redirectLiveAuthor = user;
    }
}
