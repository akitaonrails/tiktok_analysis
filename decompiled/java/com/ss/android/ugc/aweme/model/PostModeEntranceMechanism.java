package com.ss.android.ugc.aweme.model;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.model.PostModeEntranceMechanism;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class PostModeEntranceMechanism implements Parcelable {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ PostModeEntranceMechanism[] $VALUES;
    public static final PostModeEntranceMechanism CLICK_TITLE;
    public static final Parcelable.Creator<PostModeEntranceMechanism> CREATOR;
    public static final PostModeEntranceMechanism EXPLORE_CARD;
    public static final PostModeEntranceMechanism NEARBY_CARD;
    public static final PostModeEntranceMechanism PINCH;
    public static final PostModeEntranceMechanism RED_BUBBLE;
    public static final PostModeEntranceMechanism SCHOOL_CARD;
    public static final PostModeEntranceMechanism SEARCH_TAB_CARD;
    public static final PostModeEntranceMechanism SEARCH_TAB_CARD_GENERAL;
    public static final PostModeEntranceMechanism SEE_MORE_BTN;
    public static final PostModeEntranceMechanism SLIDE_LEFT;
    public static final PostModeEntranceMechanism SWIPE_LEFT_LAST_IMAGE;
    public static final PostModeEntranceMechanism TAP_PHOTO;
    public static final PostModeEntranceMechanism TAP_TEXT;
    public final String value;

    public static InterfaceC2044707zh<PostModeEntranceMechanism> getEntries() {
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
        PostModeEntranceMechanism postModeEntranceMechanism = new PostModeEntranceMechanism("SEE_MORE_BTN", 0, "click_see_more");
        SEE_MORE_BTN = postModeEntranceMechanism;
        PostModeEntranceMechanism postModeEntranceMechanism2 = new PostModeEntranceMechanism("RED_BUBBLE", 1, "click_red_bubble");
        RED_BUBBLE = postModeEntranceMechanism2;
        PostModeEntranceMechanism postModeEntranceMechanism3 = new PostModeEntranceMechanism("EXPLORE_CARD", 2, "click_explore_card");
        EXPLORE_CARD = postModeEntranceMechanism3;
        PostModeEntranceMechanism postModeEntranceMechanism4 = new PostModeEntranceMechanism("SCHOOL_CARD", 3, "click_school_card");
        SCHOOL_CARD = postModeEntranceMechanism4;
        PostModeEntranceMechanism postModeEntranceMechanism5 = new PostModeEntranceMechanism("NEARBY_CARD", 4, "click_nearby_card");
        NEARBY_CARD = postModeEntranceMechanism5;
        PostModeEntranceMechanism postModeEntranceMechanism6 = new PostModeEntranceMechanism("SEARCH_TAB_CARD", 5, "search_result_click");
        SEARCH_TAB_CARD = postModeEntranceMechanism6;
        PostModeEntranceMechanism postModeEntranceMechanism7 = new PostModeEntranceMechanism("SEARCH_TAB_CARD_GENERAL", 6, "search_result_click_general");
        SEARCH_TAB_CARD_GENERAL = postModeEntranceMechanism7;
        PostModeEntranceMechanism postModeEntranceMechanism8 = new PostModeEntranceMechanism("TAP_TEXT", 7, "tap_text");
        TAP_TEXT = postModeEntranceMechanism8;
        PostModeEntranceMechanism postModeEntranceMechanism9 = new PostModeEntranceMechanism("CLICK_TITLE", 8, "click_title");
        CLICK_TITLE = postModeEntranceMechanism9;
        PostModeEntranceMechanism postModeEntranceMechanism10 = new PostModeEntranceMechanism("TAP_PHOTO", 9, "tap_photo");
        TAP_PHOTO = postModeEntranceMechanism10;
        PostModeEntranceMechanism postModeEntranceMechanism11 = new PostModeEntranceMechanism("SLIDE_LEFT", 10, "slide_left");
        SLIDE_LEFT = postModeEntranceMechanism11;
        PostModeEntranceMechanism postModeEntranceMechanism12 = new PostModeEntranceMechanism("PINCH", 11, "pinch");
        PINCH = postModeEntranceMechanism12;
        PostModeEntranceMechanism postModeEntranceMechanism13 = new PostModeEntranceMechanism("SWIPE_LEFT_LAST_IMAGE", 12, "swipe_left_last_image");
        SWIPE_LEFT_LAST_IMAGE = postModeEntranceMechanism13;
        PostModeEntranceMechanism[] postModeEntranceMechanismArr = {postModeEntranceMechanism, postModeEntranceMechanism2, postModeEntranceMechanism3, postModeEntranceMechanism4, postModeEntranceMechanism5, postModeEntranceMechanism6, postModeEntranceMechanism7, postModeEntranceMechanism8, postModeEntranceMechanism9, postModeEntranceMechanism10, postModeEntranceMechanism11, postModeEntranceMechanism12, postModeEntranceMechanism13};
        $VALUES = postModeEntranceMechanismArr;
        $ENTRIES = new C2254308sP(postModeEntranceMechanismArr);
        CREATOR = new Parcelable.Creator<PostModeEntranceMechanism>() { // from class: X.0SB4
            @Override // android.os.Parcelable.Creator
            public final PostModeEntranceMechanism createFromParcel(Parcel parcel) {
                return PostModeEntranceMechanism.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final PostModeEntranceMechanism[] newArray(int i) {
                return new PostModeEntranceMechanism[i];
            }
        };
    }

    public static PostModeEntranceMechanism[] values() {
        return (PostModeEntranceMechanism[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public static PostModeEntranceMechanism valueOf(String str) {
        return (PostModeEntranceMechanism) C08FF.LIZ(PostModeEntranceMechanism.class, str);
    }

    public PostModeEntranceMechanism(String str, int i, String str2) {
        this.value = str2;
    }
}
