package com.ss.android.ugc.aweme.im.message.template.component;

import X.C08FF;
import X.C2243001Cqg;
import X.C2254308sP;
import X.EnumC2242921CqY;
import X.InterfaceC2044707zh;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.component.CommentFallbackStatusComponent;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes35.dex */
public final class CommentFallbackStatusComponent implements BaseComponent<EnumC2242921CqY> {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ CommentFallbackStatusComponent[] $VALUES;
    public static final Parcelable.Creator<CommentFallbackStatusComponent> CREATOR;
    public static final C2243001Cqg Companion;
    public static final CommentFallbackStatusComponent STATUS_COMMENT_DELETED;
    public static final CommentFallbackStatusComponent STATUS_COMMENT_NO_VISIBLE;
    public static final CommentFallbackStatusComponent STATUS_COMMENT_VISIBLE;
    public static final CommentFallbackStatusComponent STATUS_VIDEO_FOLLOWER_VISIBLE;
    public static final CommentFallbackStatusComponent STATUS_VIDEO_FRIEND_VISIBLE;
    public static final CommentFallbackStatusComponent STATUS_VIDEO_NO_VISIBLE;
    public static final CommentFallbackStatusComponent STATUS_VIDEO_SELF_VISIBLE;
    public final int value;

    public static InterfaceC2044707zh<CommentFallbackStatusComponent> getEntries() {
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

    /* JADX WARN: Type inference failed for: r0v8, types: [X.1Cqg] */
    static {
        CommentFallbackStatusComponent commentFallbackStatusComponent = new CommentFallbackStatusComponent("STATUS_COMMENT_VISIBLE", 0, 1);
        STATUS_COMMENT_VISIBLE = commentFallbackStatusComponent;
        CommentFallbackStatusComponent commentFallbackStatusComponent2 = new CommentFallbackStatusComponent("STATUS_VIDEO_SELF_VISIBLE", 1, 2);
        STATUS_VIDEO_SELF_VISIBLE = commentFallbackStatusComponent2;
        CommentFallbackStatusComponent commentFallbackStatusComponent3 = new CommentFallbackStatusComponent("STATUS_VIDEO_FRIEND_VISIBLE", 2, 3);
        STATUS_VIDEO_FRIEND_VISIBLE = commentFallbackStatusComponent3;
        CommentFallbackStatusComponent commentFallbackStatusComponent4 = new CommentFallbackStatusComponent("STATUS_VIDEO_FOLLOWER_VISIBLE", 3, 4);
        STATUS_VIDEO_FOLLOWER_VISIBLE = commentFallbackStatusComponent4;
        CommentFallbackStatusComponent commentFallbackStatusComponent5 = new CommentFallbackStatusComponent("STATUS_VIDEO_NO_VISIBLE", 4, 5);
        STATUS_VIDEO_NO_VISIBLE = commentFallbackStatusComponent5;
        CommentFallbackStatusComponent commentFallbackStatusComponent6 = new CommentFallbackStatusComponent("STATUS_COMMENT_DELETED", 5, 6);
        STATUS_COMMENT_DELETED = commentFallbackStatusComponent6;
        CommentFallbackStatusComponent commentFallbackStatusComponent7 = new CommentFallbackStatusComponent("STATUS_COMMENT_NO_VISIBLE", 6, 7);
        STATUS_COMMENT_NO_VISIBLE = commentFallbackStatusComponent7;
        CommentFallbackStatusComponent[] commentFallbackStatusComponentArr = {commentFallbackStatusComponent, commentFallbackStatusComponent2, commentFallbackStatusComponent3, commentFallbackStatusComponent4, commentFallbackStatusComponent5, commentFallbackStatusComponent6, commentFallbackStatusComponent7};
        $VALUES = commentFallbackStatusComponentArr;
        $ENTRIES = new C2254308sP(commentFallbackStatusComponentArr);
        Companion = new Object() { // from class: X.1Cqg
        };
        CREATOR = new Parcelable.Creator<CommentFallbackStatusComponent>() { // from class: X.1Cqc
            @Override // android.os.Parcelable.Creator
            public final CommentFallbackStatusComponent createFromParcel(Parcel parcel) {
                return CommentFallbackStatusComponent.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final CommentFallbackStatusComponent[] newArray(int i) {
                return new CommentFallbackStatusComponent[i];
            }
        };
    }

    public static CommentFallbackStatusComponent[] values() {
        return (CommentFallbackStatusComponent[]) $VALUES.clone();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ss.android.ugc.aweme.im.message.template.component.BaseComponent
    public EnumC2242921CqY toProto() {
        return EnumC2242921CqY.fromValue(this.value);
    }

    public final int getValue() {
        return this.value;
    }

    public static CommentFallbackStatusComponent valueOf(String str) {
        return (CommentFallbackStatusComponent) C08FF.LIZ(CommentFallbackStatusComponent.class, str);
    }

    public CommentFallbackStatusComponent(String str, int i, int i2) {
        this.value = i2;
    }
}
