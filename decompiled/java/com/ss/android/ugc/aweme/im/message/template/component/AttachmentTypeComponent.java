package com.ss.android.ugc.aweme.im.message.template.component;

import X.C08FF;
import X.C2254308sP;
import X.C462070IAb;
import X.EnumC2244491Ct5;
import X.InterfaceC2044707zh;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentTypeComponent;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes35.dex */
public final class AttachmentTypeComponent implements BaseComponent<EnumC2244491Ct5> {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ AttachmentTypeComponent[] $VALUES;
    public static final AttachmentTypeComponent ATTACHMENT_TYPE_DEFAULT;
    public static final AttachmentTypeComponent ATTACHMENT_TYPE_GAME_CHALLENGE_GAMEPLAY;
    public static final AttachmentTypeComponent ATTACHMENT_TYPE_NUDGE_FAVOURITE;
    public static final AttachmentTypeComponent ATTACHMENT_TYPE_NUDGE_LIKE;
    public static final AttachmentTypeComponent ATTACHMENT_TYPE_NUDGE_REPOST;
    public static final AttachmentTypeComponent ATTACHMENT_TYPE_RECENT_ACTIVITY_REPLY_POST;
    public static final AttachmentTypeComponent ATTACHMENT_TYPE_RECENT_ACTIVITY_REPLY_REPOST;
    public static final AttachmentTypeComponent ATTACHMENT_TYPE_REPLY_REPOST;
    public static final AttachmentTypeComponent ATTACHMENT_TYPE_SHARED_FEED;
    public static final AttachmentTypeComponent ATTACHMENT_TYPE_SHARED_FEED_LIKE_HISTORY;
    public static final AttachmentTypeComponent ATTACHMENT_TYPE_SHARED_REPOST;
    public static final AttachmentTypeComponent ATTACHMENT_TYPE_SHARE_COMMENT_MENTION;
    public static final AttachmentTypeComponent ATTACHMENT_TYPE_STORY;
    public static final AttachmentTypeComponent ATTACHMENT_TYPE_STORY_REPLY;
    public static final AttachmentTypeComponent ATTACHMENT_TYPE_THOUGHT;
    public static final Parcelable.Creator<AttachmentTypeComponent> CREATOR;
    public static final C462070IAb Companion;
    public final int value;

    public static InterfaceC2044707zh<AttachmentTypeComponent> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }

    static {
        AttachmentTypeComponent attachmentTypeComponent = new AttachmentTypeComponent("ATTACHMENT_TYPE_DEFAULT", 0, EnumC2244491Ct5.ATTACHMENT_TYPE_DEFAULT.getValue());
        ATTACHMENT_TYPE_DEFAULT = attachmentTypeComponent;
        AttachmentTypeComponent attachmentTypeComponent2 = new AttachmentTypeComponent("ATTACHMENT_TYPE_STORY", 1, EnumC2244491Ct5.ATTACHMENT_TYPE_STORY.getValue());
        ATTACHMENT_TYPE_STORY = attachmentTypeComponent2;
        AttachmentTypeComponent attachmentTypeComponent3 = new AttachmentTypeComponent("ATTACHMENT_TYPE_NUDGE_LIKE", 2, EnumC2244491Ct5.ATTACHMENT_TYPE_NUDGE_LIKE.getValue());
        ATTACHMENT_TYPE_NUDGE_LIKE = attachmentTypeComponent3;
        AttachmentTypeComponent attachmentTypeComponent4 = new AttachmentTypeComponent("ATTACHMENT_TYPE_NUDGE_FAVOURITE", 3, EnumC2244491Ct5.ATTACHMENT_TYPE_NUDGE_FAVOURITE.getValue());
        ATTACHMENT_TYPE_NUDGE_FAVOURITE = attachmentTypeComponent4;
        AttachmentTypeComponent attachmentTypeComponent5 = new AttachmentTypeComponent("ATTACHMENT_TYPE_NUDGE_REPOST", 4, EnumC2244491Ct5.ATTACHMENT_TYPE_NUDGE_REPOST.getValue());
        ATTACHMENT_TYPE_NUDGE_REPOST = attachmentTypeComponent5;
        AttachmentTypeComponent attachmentTypeComponent6 = new AttachmentTypeComponent("ATTACHMENT_TYPE_SHARE_COMMENT_MENTION", 5, EnumC2244491Ct5.ATTACHMENT_TYPE_SHARE_COMMENT_MENTION.getValue());
        ATTACHMENT_TYPE_SHARE_COMMENT_MENTION = attachmentTypeComponent6;
        AttachmentTypeComponent attachmentTypeComponent7 = new AttachmentTypeComponent("ATTACHMENT_TYPE_REPLY_REPOST", 6, EnumC2244491Ct5.ATTACHMENT_TYPE_REPLY_REPOST.getValue());
        ATTACHMENT_TYPE_REPLY_REPOST = attachmentTypeComponent7;
        AttachmentTypeComponent attachmentTypeComponent8 = new AttachmentTypeComponent("ATTACHMENT_TYPE_RECENT_ACTIVITY_REPLY_POST", 7, EnumC2244491Ct5.ATTACHMENT_TYPE_RECENT_ACTIVITY_REPLY_POST.getValue());
        ATTACHMENT_TYPE_RECENT_ACTIVITY_REPLY_POST = attachmentTypeComponent8;
        AttachmentTypeComponent attachmentTypeComponent9 = new AttachmentTypeComponent("ATTACHMENT_TYPE_RECENT_ACTIVITY_REPLY_REPOST", 8, EnumC2244491Ct5.ATTACHMENT_TYPE_RECENT_ACTIVITY_REPLY_REPOST.getValue());
        ATTACHMENT_TYPE_RECENT_ACTIVITY_REPLY_REPOST = attachmentTypeComponent9;
        AttachmentTypeComponent attachmentTypeComponent10 = new AttachmentTypeComponent("ATTACHMENT_TYPE_STORY_REPLY", 9, EnumC2244491Ct5.ATTACHMENT_TYPE_STORY_REPLY.getValue());
        ATTACHMENT_TYPE_STORY_REPLY = attachmentTypeComponent10;
        AttachmentTypeComponent attachmentTypeComponent11 = new AttachmentTypeComponent("ATTACHMENT_TYPE_GAME_CHALLENGE_GAMEPLAY", 10, EnumC2244491Ct5.ATTACHMENT_TYPE_GAME_CHALLENGE_GAMEPLAY.getValue());
        ATTACHMENT_TYPE_GAME_CHALLENGE_GAMEPLAY = attachmentTypeComponent11;
        AttachmentTypeComponent attachmentTypeComponent12 = new AttachmentTypeComponent("ATTACHMENT_TYPE_SHARED_FEED", 11, EnumC2244491Ct5.ATTACHMENT_TYPE_SHARED_FEED.getValue());
        ATTACHMENT_TYPE_SHARED_FEED = attachmentTypeComponent12;
        AttachmentTypeComponent attachmentTypeComponent13 = new AttachmentTypeComponent("ATTACHMENT_TYPE_SHARED_FEED_LIKE_HISTORY", 12, EnumC2244491Ct5.ATTACHMENT_TYPE_SHARED_FEED_LIKE_HISTORY.getValue());
        ATTACHMENT_TYPE_SHARED_FEED_LIKE_HISTORY = attachmentTypeComponent13;
        AttachmentTypeComponent attachmentTypeComponent14 = new AttachmentTypeComponent("ATTACHMENT_TYPE_SHARED_REPOST", 13, EnumC2244491Ct5.ATTACHMENT_TYPE_SHARED_REPOST.getValue());
        ATTACHMENT_TYPE_SHARED_REPOST = attachmentTypeComponent14;
        AttachmentTypeComponent attachmentTypeComponent15 = new AttachmentTypeComponent("ATTACHMENT_TYPE_THOUGHT", 14, EnumC2244491Ct5.ATTACHMENT_TYPE_THOUGHT.getValue());
        ATTACHMENT_TYPE_THOUGHT = attachmentTypeComponent15;
        AttachmentTypeComponent[] attachmentTypeComponentArr = {attachmentTypeComponent, attachmentTypeComponent2, attachmentTypeComponent3, attachmentTypeComponent4, attachmentTypeComponent5, attachmentTypeComponent6, attachmentTypeComponent7, attachmentTypeComponent8, attachmentTypeComponent9, attachmentTypeComponent10, attachmentTypeComponent11, attachmentTypeComponent12, attachmentTypeComponent13, attachmentTypeComponent14, attachmentTypeComponent15};
        $VALUES = attachmentTypeComponentArr;
        $ENTRIES = new C2254308sP(attachmentTypeComponentArr);
        Companion = new C462070IAb();
        CREATOR = new Parcelable.Creator<AttachmentTypeComponent>() { // from class: X.0IAf
            @Override // android.os.Parcelable.Creator
            public final AttachmentTypeComponent createFromParcel(Parcel parcel) {
                return AttachmentTypeComponent.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final AttachmentTypeComponent[] newArray(int i) {
                return new AttachmentTypeComponent[i];
            }
        };
    }

    public static AttachmentTypeComponent[] values() {
        return (AttachmentTypeComponent[]) $VALUES.clone();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ss.android.ugc.aweme.im.message.template.component.BaseComponent
    public EnumC2244491Ct5 toProto() {
        return EnumC2244491Ct5.fromValue(this.value);
    }

    public final int getValue() {
        return this.value;
    }

    public static AttachmentTypeComponent valueOf(String str) {
        return (AttachmentTypeComponent) C08FF.LIZ(AttachmentTypeComponent.class, str);
    }

    public AttachmentTypeComponent(String str, int i, int i2) {
        this.value = i2;
    }
}
