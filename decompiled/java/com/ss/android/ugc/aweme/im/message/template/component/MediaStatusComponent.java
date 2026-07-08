package com.ss.android.ugc.aweme.im.message.template.component;

import X.C08FF;
import X.C2254308sP;
import X.EnumC2240311CmL;
import X.InterfaceC2044707zh;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.component.MediaStatusComponent;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes35.dex */
public final class MediaStatusComponent implements BaseComponent<EnumC2240311CmL> {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ MediaStatusComponent[] $VALUES;
    public static final Parcelable.Creator<MediaStatusComponent> CREATOR;
    public static final MediaStatusComponent FAILED;
    public static final MediaStatusComponent PROCESSING;
    public static final MediaStatusComponent READY;
    public static final MediaStatusComponent UNKNOWN;
    public final int value;

    public static InterfaceC2044707zh<MediaStatusComponent> getEntries() {
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
        MediaStatusComponent mediaStatusComponent = new MediaStatusComponent("UNKNOWN", 0, EnumC2240311CmL.MEDIA_STATUS_UNKNOWN.getValue());
        UNKNOWN = mediaStatusComponent;
        MediaStatusComponent mediaStatusComponent2 = new MediaStatusComponent("READY", 1, EnumC2240311CmL.MEDIA_STATUS_READY.getValue());
        READY = mediaStatusComponent2;
        MediaStatusComponent mediaStatusComponent3 = new MediaStatusComponent("PROCESSING", 2, EnumC2240311CmL.MEDIA_STATUS_PROCESSING.getValue());
        PROCESSING = mediaStatusComponent3;
        MediaStatusComponent mediaStatusComponent4 = new MediaStatusComponent("FAILED", 3, EnumC2240311CmL.MEDIA_STATUS_FAILED.getValue());
        FAILED = mediaStatusComponent4;
        MediaStatusComponent[] mediaStatusComponentArr = {mediaStatusComponent, mediaStatusComponent2, mediaStatusComponent3, mediaStatusComponent4};
        $VALUES = mediaStatusComponentArr;
        $ENTRIES = new C2254308sP(mediaStatusComponentArr);
        CREATOR = new Parcelable.Creator<MediaStatusComponent>() { // from class: X.1CmM
            @Override // android.os.Parcelable.Creator
            public final MediaStatusComponent createFromParcel(Parcel parcel) {
                return MediaStatusComponent.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final MediaStatusComponent[] newArray(int i) {
                return new MediaStatusComponent[i];
            }
        };
    }

    public static MediaStatusComponent[] values() {
        return (MediaStatusComponent[]) $VALUES.clone();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ss.android.ugc.aweme.im.message.template.component.BaseComponent
    public EnumC2240311CmL toProto() {
        return EnumC2240311CmL.fromValue(this.value);
    }

    public final int getValue() {
        return this.value;
    }

    public static MediaStatusComponent valueOf(String str) {
        return (MediaStatusComponent) C08FF.LIZ(MediaStatusComponent.class, str);
    }

    public MediaStatusComponent(String str, int i, int i2) {
        this.value = i2;
    }
}
