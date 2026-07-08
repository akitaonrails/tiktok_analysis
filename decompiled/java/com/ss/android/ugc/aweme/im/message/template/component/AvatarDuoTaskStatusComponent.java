package com.ss.android.ugc.aweme.im.message.template.component;

import X.C08FF;
import X.C2254308sP;
import X.EnumC2241111Cnd;
import X.InterfaceC2044707zh;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.component.AvatarDuoTaskStatusComponent;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes35.dex */
public final class AvatarDuoTaskStatusComponent implements BaseComponent<EnumC2241111Cnd> {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ AvatarDuoTaskStatusComponent[] $VALUES;
    public static final AvatarDuoTaskStatusComponent ACCEPT;
    public static final Parcelable.Creator<AvatarDuoTaskStatusComponent> CREATOR;
    public static final AvatarDuoTaskStatusComponent FAILED;
    public static final AvatarDuoTaskStatusComponent INVITE;
    public static final AvatarDuoTaskStatusComponent SUCCESS;
    public static final AvatarDuoTaskStatusComponent UNKNOWN;
    public final int status;

    public static InterfaceC2044707zh<AvatarDuoTaskStatusComponent> getEntries() {
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
        AvatarDuoTaskStatusComponent avatarDuoTaskStatusComponent = new AvatarDuoTaskStatusComponent("UNKNOWN", 0, EnumC2241111Cnd.AVATAR_DUO_TASK_STATUS_UNKNOWN.getValue());
        UNKNOWN = avatarDuoTaskStatusComponent;
        AvatarDuoTaskStatusComponent avatarDuoTaskStatusComponent2 = new AvatarDuoTaskStatusComponent("INVITE", 1, EnumC2241111Cnd.AVATAR_DUO_TASK_STATUS_INVITE.getValue());
        INVITE = avatarDuoTaskStatusComponent2;
        AvatarDuoTaskStatusComponent avatarDuoTaskStatusComponent3 = new AvatarDuoTaskStatusComponent("ACCEPT", 2, EnumC2241111Cnd.AVATAR_DUO_TASK_STATUS_ACCEPT.getValue());
        ACCEPT = avatarDuoTaskStatusComponent3;
        AvatarDuoTaskStatusComponent avatarDuoTaskStatusComponent4 = new AvatarDuoTaskStatusComponent("SUCCESS", 3, EnumC2241111Cnd.AVATAR_DUO_TASK_STATUS_SUCCESS.getValue());
        SUCCESS = avatarDuoTaskStatusComponent4;
        AvatarDuoTaskStatusComponent avatarDuoTaskStatusComponent5 = new AvatarDuoTaskStatusComponent("FAILED", 4, EnumC2241111Cnd.AVATAR_DUO_TASK_STATUS_FAILED.getValue());
        FAILED = avatarDuoTaskStatusComponent5;
        AvatarDuoTaskStatusComponent[] avatarDuoTaskStatusComponentArr = {avatarDuoTaskStatusComponent, avatarDuoTaskStatusComponent2, avatarDuoTaskStatusComponent3, avatarDuoTaskStatusComponent4, avatarDuoTaskStatusComponent5};
        $VALUES = avatarDuoTaskStatusComponentArr;
        $ENTRIES = new C2254308sP(avatarDuoTaskStatusComponentArr);
        CREATOR = new Parcelable.Creator<AvatarDuoTaskStatusComponent>() { // from class: X.1Cnf
            @Override // android.os.Parcelable.Creator
            public final AvatarDuoTaskStatusComponent createFromParcel(Parcel parcel) {
                return AvatarDuoTaskStatusComponent.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final AvatarDuoTaskStatusComponent[] newArray(int i) {
                return new AvatarDuoTaskStatusComponent[i];
            }
        };
    }

    public static AvatarDuoTaskStatusComponent[] values() {
        return (AvatarDuoTaskStatusComponent[]) $VALUES.clone();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ss.android.ugc.aweme.im.message.template.component.BaseComponent
    public EnumC2241111Cnd toProto() {
        return EnumC2241111Cnd.fromValue(this.status);
    }

    public final int getStatus() {
        return this.status;
    }

    public static AvatarDuoTaskStatusComponent valueOf(String str) {
        return (AvatarDuoTaskStatusComponent) C08FF.LIZ(AvatarDuoTaskStatusComponent.class, str);
    }

    public AvatarDuoTaskStatusComponent(String str, int i, int i2) {
        this.status = i2;
    }
}
