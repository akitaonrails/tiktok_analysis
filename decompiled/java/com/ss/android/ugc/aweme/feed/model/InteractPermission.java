package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class InteractPermission implements Serializable {

    @C09CT("allow_adding_as_post")
    public InteractionPermission allowAddingCommentAsPost;

    @C09CT("allow_adding_to_story")
    public int allowAddingToStory;

    @C09CT("allow_create_sticker")
    public InteractionPermission allowCreateSticker;

    @C09CT("allow_story_switch_to_post")
    public InteractionPermission allowStorySwitchToPost;

    @C09CT("duet")
    public int duet;

    @C09CT("duet_privacy_setting")
    public int duetPrivacySettingControl;

    @C09CT("stitch")
    public int stitch;

    @C09CT("stitch_privacy_setting")
    public int stitchPrivacySettingControl;

    @C09CT("upvote")
    public int upvote;

    public final InteractionPermission getAllowAddingCommentAsPost() {
        return this.allowAddingCommentAsPost;
    }

    public final int getAllowAddingToStory() {
        return this.allowAddingToStory;
    }

    public final InteractionPermission getAllowCreateSticker() {
        return this.allowCreateSticker;
    }

    public final InteractionPermission getAllowStorySwitchToPost() {
        return this.allowStorySwitchToPost;
    }

    public final int getDuet() {
        return this.duet;
    }

    public final int getDuetPrivacySettingControl() {
        return this.duetPrivacySettingControl;
    }

    public final int getStitch() {
        return this.stitch;
    }

    public final int getStitchPrivacySettingControl() {
        return this.stitchPrivacySettingControl;
    }

    public final int getUpvote() {
        return this.upvote;
    }

    public final void setAllowAddingCommentAsPost(InteractionPermission interactionPermission) {
        this.allowAddingCommentAsPost = interactionPermission;
    }

    public final void setAllowAddingToStory(int i) {
        this.allowAddingToStory = i;
    }

    public final void setAllowCreateSticker(InteractionPermission interactionPermission) {
        this.allowCreateSticker = interactionPermission;
    }

    public final void setAllowStorySwitchToPost(InteractionPermission interactionPermission) {
        this.allowStorySwitchToPost = interactionPermission;
    }

    public final void setDuet(int i) {
        this.duet = i;
    }

    public final void setDuetPrivacySettingControl(int i) {
        this.duetPrivacySettingControl = i;
    }

    public final void setStitch(int i) {
        this.stitch = i;
    }

    public final void setStitchPrivacySettingControl(int i) {
        this.stitchPrivacySettingControl = i;
    }

    public final void setUpvote(int i) {
        this.upvote = i;
    }
}
