package com.ss.android.ugc.aweme.im.message.template.component;

import X.C08FF;
import X.C2243011Cqh;
import X.C2254308sP;
import X.EnumC2242941Cqa;
import X.InterfaceC2044707zh;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.component.CommentTypeComponent;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes35.dex */
public final class CommentTypeComponent implements BaseComponent<EnumC2242941Cqa> {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ CommentTypeComponent[] $VALUES;
    public static final Parcelable.Creator<CommentTypeComponent> CREATOR;
    public static final C2243011Cqh Companion;
    public static final CommentTypeComponent TYPE_PICTURE;
    public static final CommentTypeComponent TYPE_STICKER;
    public static final CommentTypeComponent TYPE_TEXT;
    public final int value;

    public static InterfaceC2044707zh<CommentTypeComponent> getEntries() {
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

    /* JADX WARN: Type inference failed for: r0v8, types: [X.1Cqh] */
    static {
        CommentTypeComponent commentTypeComponent = new CommentTypeComponent("TYPE_TEXT", 0, EnumC2242941Cqa.TYPE_TEXT.getValue());
        TYPE_TEXT = commentTypeComponent;
        CommentTypeComponent commentTypeComponent2 = new CommentTypeComponent("TYPE_STICKER", 1, EnumC2242941Cqa.TYPE_STICKER.getValue());
        TYPE_STICKER = commentTypeComponent2;
        CommentTypeComponent commentTypeComponent3 = new CommentTypeComponent("TYPE_PICTURE", 2, EnumC2242941Cqa.TYPE_PICTURE.getValue());
        TYPE_PICTURE = commentTypeComponent3;
        CommentTypeComponent[] commentTypeComponentArr = {commentTypeComponent, commentTypeComponent2, commentTypeComponent3};
        $VALUES = commentTypeComponentArr;
        $ENTRIES = new C2254308sP(commentTypeComponentArr);
        Companion = new Object() { // from class: X.1Cqh
        };
        CREATOR = new Parcelable.Creator<CommentTypeComponent>() { // from class: X.1Cqd
            @Override // android.os.Parcelable.Creator
            public final CommentTypeComponent createFromParcel(Parcel parcel) {
                return CommentTypeComponent.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final CommentTypeComponent[] newArray(int i) {
                return new CommentTypeComponent[i];
            }
        };
    }

    public static CommentTypeComponent[] values() {
        return (CommentTypeComponent[]) $VALUES.clone();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ss.android.ugc.aweme.im.message.template.component.BaseComponent
    public EnumC2242941Cqa toProto() {
        return EnumC2242941Cqa.fromValue(this.value);
    }

    public final int getValue() {
        return this.value;
    }

    public static CommentTypeComponent valueOf(String str) {
        return (CommentTypeComponent) C08FF.LIZ(CommentTypeComponent.class, str);
    }

    public CommentTypeComponent(String str, int i, int i2) {
        this.value = i2;
    }
}
