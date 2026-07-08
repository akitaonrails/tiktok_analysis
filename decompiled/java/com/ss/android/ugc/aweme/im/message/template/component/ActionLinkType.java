package com.ss.android.ugc.aweme.im.message.template.component;

import X.C08FF;
import X.C2254308sP;
import X.EnumC2244361Css;
import X.InterfaceC2044707zh;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.component.ActionLinkType;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes35.dex */
public final class ActionLinkType implements BaseComponent<EnumC2244361Css> {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ ActionLinkType[] $VALUES;
    public static final ActionLinkType CALLBACK;
    public static final Parcelable.Creator<ActionLinkType> CREATOR;
    public static final ActionLinkType DEEP_LINK;
    public static final ActionLinkType FOLLOW_USER;
    public static final ActionLinkType H5_LINK;
    public static final ActionLinkType INVALID;
    public static final ActionLinkType REFRESH;
    public final int value;

    public static InterfaceC2044707zh<ActionLinkType> getEntries() {
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
        ActionLinkType actionLinkType = new ActionLinkType("INVALID", 0, -1);
        INVALID = actionLinkType;
        ActionLinkType actionLinkType2 = new ActionLinkType("DEEP_LINK", 1, EnumC2244361Css.DeepLink.getValue());
        DEEP_LINK = actionLinkType2;
        ActionLinkType actionLinkType3 = new ActionLinkType("H5_LINK", 2, EnumC2244361Css.H5Link.getValue());
        H5_LINK = actionLinkType3;
        ActionLinkType actionLinkType4 = new ActionLinkType("FOLLOW_USER", 3, EnumC2244361Css.FollowUser.getValue());
        FOLLOW_USER = actionLinkType4;
        ActionLinkType actionLinkType5 = new ActionLinkType("REFRESH", 4, EnumC2244361Css.Refresh.getValue());
        REFRESH = actionLinkType5;
        ActionLinkType actionLinkType6 = new ActionLinkType("CALLBACK", 5, EnumC2244361Css.Callback.getValue());
        CALLBACK = actionLinkType6;
        ActionLinkType[] actionLinkTypeArr = {actionLinkType, actionLinkType2, actionLinkType3, actionLinkType4, actionLinkType5, actionLinkType6};
        $VALUES = actionLinkTypeArr;
        $ENTRIES = new C2254308sP(actionLinkTypeArr);
        CREATOR = new Parcelable.Creator<ActionLinkType>() { // from class: X.1Csu
            @Override // android.os.Parcelable.Creator
            public final ActionLinkType createFromParcel(Parcel parcel) {
                return ActionLinkType.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ActionLinkType[] newArray(int i) {
                return new ActionLinkType[i];
            }
        };
    }

    public static ActionLinkType[] values() {
        return (ActionLinkType[]) $VALUES.clone();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ss.android.ugc.aweme.im.message.template.component.BaseComponent
    public EnumC2244361Css toProto() {
        return EnumC2244361Css.fromValue(this.value);
    }

    public final int getValue() {
        return this.value;
    }

    public static ActionLinkType valueOf(String str) {
        return (ActionLinkType) C08FF.LIZ(ActionLinkType.class, str);
    }

    public ActionLinkType(String str, int i, int i2) {
        this.value = i2;
    }
}
