package com.ss.android.ugc.aweme.shortvideo.model;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class SimpleEffect implements Parcelable, Serializable {
    public static final Parcelable.Creator<SimpleEffect> CREATOR = new Creator();

    @C09CT(alternate = {"designer_uid"}, value = "designerUid")
    public final String designerUid;

    @C09CT("effectMessage")
    public String effectMessage;

    @C09CT("extra")
    public final String extra;

    @C09CT(alternate = {"icon_url"}, value = "iconUrl")
    public final UrlModel iconUrl;

    @C09CT("is_busi")
    public boolean isBusinessEffect;

    @C09CT("name")
    public final String name;

    @C09CT("publishTime")
    public final Long publishTime;

    @C09CT(alternate = {"resource_id"}, value = "resourceId")
    public final String resourceId;

    @C09CT("sdk_extra")
    public final String sdkExtra;

    @C09CT("types")
    public final List<String> types;

    public static final class Creator implements Parcelable.Creator<SimpleEffect> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SimpleEffect createFromParcel(Parcel parcel) {
            return new SimpleEffect((UrlModel) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SimpleEffect[] newArray(int i) {
            return new SimpleEffect[i];
        }
    }

    public final SimpleEffect copy(UrlModel urlModel, String str, String str2, String str3, List<String> list, String str4, Long l, String str5, String str6, boolean z) {
        return new SimpleEffect(urlModel, str, str2, str3, list, str4, l, str5, str6, z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SimpleEffect)) {
            return false;
        }
        SimpleEffect simpleEffect = (SimpleEffect) obj;
        return Intrinsics.LJFF(this.iconUrl, simpleEffect.iconUrl) && Intrinsics.LJFF(this.name, simpleEffect.name) && Intrinsics.LJFF(this.extra, simpleEffect.extra) && Intrinsics.LJFF(this.designerUid, simpleEffect.designerUid) && Intrinsics.LJFF(this.types, simpleEffect.types) && Intrinsics.LJFF(this.resourceId, simpleEffect.resourceId) && Intrinsics.LJFF(this.publishTime, simpleEffect.publishTime) && Intrinsics.LJFF(this.sdkExtra, simpleEffect.sdkExtra) && Intrinsics.LJFF(this.effectMessage, simpleEffect.effectMessage) && this.isBusinessEffect == simpleEffect.isBusinessEffect;
    }

    public int hashCode() {
        int iHashCode = ((this.iconUrl.hashCode() * 31) + this.name.hashCode()) * 31;
        String str = this.extra;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.designerUid;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.types;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.resourceId;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l = this.publishTime;
        int iHashCode6 = (iHashCode5 + (l == null ? 0 : l.hashCode())) * 31;
        String str4 = this.sdkExtra;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.effectMessage;
        return ((iHashCode7 + (str5 != null ? str5.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.isBusinessEffect);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SimpleEffect(iconUrl=");
        sbLIZ.append(this.iconUrl);
        sbLIZ.append(", name=");
        sbLIZ.append(this.name);
        sbLIZ.append(", extra=");
        sbLIZ.append(this.extra);
        sbLIZ.append(", designerUid=");
        sbLIZ.append(this.designerUid);
        sbLIZ.append(", types=");
        sbLIZ.append(this.types);
        sbLIZ.append(", resourceId=");
        sbLIZ.append(this.resourceId);
        sbLIZ.append(", publishTime=");
        sbLIZ.append(this.publishTime);
        sbLIZ.append(", sdkExtra=");
        sbLIZ.append(this.sdkExtra);
        sbLIZ.append(", effectMessage=");
        sbLIZ.append(this.effectMessage);
        sbLIZ.append(", isBusinessEffect=");
        sbLIZ.append(this.isBusinessEffect);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.iconUrl);
        parcel.writeString(this.name);
        parcel.writeString(this.extra);
        parcel.writeString(this.designerUid);
        parcel.writeStringList(this.types);
        parcel.writeString(this.resourceId);
        Long l = this.publishTime;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.sdkExtra);
        parcel.writeString(this.effectMessage);
        parcel.writeInt(this.isBusinessEffect ? 1 : 0);
    }

    public final String getDesignerUid() {
        return this.designerUid;
    }

    public final String getEffectMessage() {
        return this.effectMessage;
    }

    public final String getExtra() {
        return this.extra;
    }

    public final UrlModel getIconUrl() {
        return this.iconUrl;
    }

    public final String getName() {
        return this.name;
    }

    public final Long getPublishTime() {
        return this.publishTime;
    }

    public final String getResourceId() {
        return this.resourceId;
    }

    public final String getSdkExtra() {
        return this.sdkExtra;
    }

    public final List<String> getTypes() {
        return this.types;
    }

    public final boolean isBusinessEffect() {
        return this.isBusinessEffect;
    }

    public final void setBusinessEffect(boolean z) {
        this.isBusinessEffect = z;
    }

    public final void setEffectMessage(String str) {
        this.effectMessage = str;
    }

    public SimpleEffect(UrlModel urlModel, String str, String str2, String str3, List<String> list, String str4, Long l, String str5, String str6, boolean z) {
        this.iconUrl = urlModel;
        this.name = str;
        this.extra = str2;
        this.designerUid = str3;
        this.types = list;
        this.resourceId = str4;
        this.publishTime = l;
        this.sdkExtra = str5;
        this.effectMessage = str6;
        this.isBusinessEffect = z;
    }
}
