package com.ss.android.ugc.aweme.shortvideo.model;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class TemplateSlot implements Parcelable, Serializable {

    @C09CT("clip_end")
    public double clipEnd;

    @C09CT("clip_start")
    public final double clipStart;

    @C09CT("description")
    public String description;

    @C09CT("endtime")
    public final double endTime;

    @C09CT("freeze_from_uuid")
    public String freezeFromUUID;

    @C09CT("freeze_group")
    public String freezeGroup;

    @C09CT("freeze_ref_video_uuid")
    public String freezeRefVideoUUID;

    @C09CT("gameplay_source")
    public String gameplaySource;

    @C09CT("is_reverse_video")
    public Boolean isReverseVideo;

    @C09CT("limit_material_type")
    public int limitMaterialType;

    @C09CT("magic_support_type")
    public String magicSupportType;

    @C09CT("origin_material_type")
    public String originMaterialType;

    @C09CT("processor")
    public final String[] processor;

    @C09CT("same_asset_group")
    public String sameAssetGroup;

    @C09CT("source")
    public final String source;

    @C09CT("starttime")
    public final double startTime;

    @C09CT("type")
    public final String type;

    @C09CT("uuid")
    public final String uuid;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<TemplateSlot> CREATOR = new Creator();
    public static final String MATERIAL_TYPE_VIDEO = "video";
    public static final String MATERIAL_TYPE_IMG = "image";

    public static final class Creator implements Parcelable.Creator<TemplateSlot> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TemplateSlot createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            double d = parcel.readDouble();
            double d2 = parcel.readDouble();
            double d3 = parcel.readDouble();
            double d4 = parcel.readDouble();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            int i = parcel.readInt();
            String[] strArrCreateStringArray = parcel.createStringArray();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new TemplateSlot(d, d2, d3, d4, string, string2, string3, string4, string5, i, strArrCreateStringArray, string6, string7, string8, string9, string10, boolValueOf, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TemplateSlot[] newArray(int i) {
            return new TemplateSlot[i];
        }
    }

    public TemplateSlot() {
        this(0.0d, 0.0d, 0.0d, 0.0d, null, null, null, null, null, 0, null, null, null, null, null, null, null, null);
    }

    public final TemplateSlot copy(double d, double d2, double d3, double d4, String str, String str2, String str3, String str4, String str5, int i, String[] strArr, String str6, String str7, String str8, String str9, String str10, Boolean bool, String str11) {
        return new TemplateSlot(d, d2, d3, d4, str, str2, str3, str4, str5, i, strArr, str6, str7, str8, str9, str10, bool, str11);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TemplateSlot)) {
            return false;
        }
        TemplateSlot templateSlot = (TemplateSlot) obj;
        return Double.compare(this.startTime, templateSlot.startTime) == 0 && Double.compare(this.endTime, templateSlot.endTime) == 0 && Double.compare(this.clipStart, templateSlot.clipStart) == 0 && Double.compare(this.clipEnd, templateSlot.clipEnd) == 0 && Intrinsics.LJFF(this.source, templateSlot.source) && Intrinsics.LJFF(this.type, templateSlot.type) && Intrinsics.LJFF(this.uuid, templateSlot.uuid) && Intrinsics.LJFF(this.description, templateSlot.description) && Intrinsics.LJFF(this.magicSupportType, templateSlot.magicSupportType) && this.limitMaterialType == templateSlot.limitMaterialType && Intrinsics.LJFF(this.processor, templateSlot.processor) && Intrinsics.LJFF(this.gameplaySource, templateSlot.gameplaySource) && Intrinsics.LJFF(this.sameAssetGroup, templateSlot.sameAssetGroup) && Intrinsics.LJFF(this.freezeGroup, templateSlot.freezeGroup) && Intrinsics.LJFF(this.freezeFromUUID, templateSlot.freezeFromUUID) && Intrinsics.LJFF(this.freezeRefVideoUUID, templateSlot.freezeRefVideoUUID) && Intrinsics.LJFF(this.isReverseVideo, templateSlot.isReverseVideo) && Intrinsics.LJFF(this.originMaterialType, templateSlot.originMaterialType);
    }

    public int hashCode() {
        int iX2 = ((((((C786410Ut5.X2(this.startTime) * 31) + C786410Ut5.X2(this.endTime)) * 31) + C786410Ut5.X2(this.clipStart)) * 31) + C786410Ut5.X2(this.clipEnd)) * 31;
        String str = this.source;
        int iHashCode = (iX2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.type;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.uuid;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.description;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.magicSupportType;
        int iHashCode5 = (((iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.limitMaterialType) * 31;
        String[] strArr = this.processor;
        int iHashCode6 = (iHashCode5 + (strArr == null ? 0 : Arrays.hashCode(strArr))) * 31;
        String str6 = this.gameplaySource;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.sameAssetGroup;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.freezeGroup;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.freezeFromUUID;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.freezeRefVideoUUID;
        int iHashCode11 = (iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Boolean bool = this.isReverseVideo;
        int iHashCode12 = (iHashCode11 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str11 = this.originMaterialType;
        return iHashCode12 + (str11 != null ? str11.hashCode() : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [int] */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.os.Parcel] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ?? BooleanValue;
        parcel.writeDouble(this.startTime);
        parcel.writeDouble(this.endTime);
        parcel.writeDouble(this.clipStart);
        parcel.writeDouble(this.clipEnd);
        parcel.writeString(this.source);
        parcel.writeString(this.type);
        parcel.writeString(this.uuid);
        parcel.writeString(this.description);
        parcel.writeString(this.magicSupportType);
        parcel.writeInt(this.limitMaterialType);
        parcel.writeStringArray(this.processor);
        parcel.writeString(this.gameplaySource);
        parcel.writeString(this.sameAssetGroup);
        parcel.writeString(this.freezeGroup);
        parcel.writeString(this.freezeFromUUID);
        parcel.writeString(this.freezeRefVideoUUID);
        Boolean bool = this.isReverseVideo;
        if (bool == null) {
            BooleanValue = 0;
        } else {
            parcel.writeInt(1);
            BooleanValue = bool.booleanValue();
        }
        parcel.writeInt(BooleanValue);
        parcel.writeString(this.originMaterialType);
    }

    public final double getDuration() {
        return this.clipEnd - this.clipStart;
    }

    public final double getSlotEndTTime() {
        double d = this.clipEnd - this.clipStart;
        double d2 = this.endTime;
        return d2 < 0.0d ? getSlotStartTime() + d : d2;
    }

    public final double getSlotStartTime() {
        double d = this.startTime;
        if (d < 0.0d) {
            return 0.0d;
        }
        return d;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TemplateSlot(startTime=");
        sbLIZ.append(this.startTime);
        sbLIZ.append(", endTime=");
        sbLIZ.append(this.endTime);
        sbLIZ.append(", slotStartTime=");
        sbLIZ.append(getSlotStartTime());
        sbLIZ.append(", slotEndTime=");
        sbLIZ.append(getSlotEndTTime());
        sbLIZ.append(", clipStart=");
        sbLIZ.append(this.clipStart);
        sbLIZ.append(", clipEnd=");
        sbLIZ.append(this.clipEnd);
        sbLIZ.append(", source=");
        sbLIZ.append(this.source);
        sbLIZ.append(", type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", isReverse=");
        sbLIZ.append(this.isReverseVideo);
        sbLIZ.append(", freezeGroup=");
        sbLIZ.append(this.freezeGroup);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final class Companion {
        public final String getMATERIAL_TYPE_IMG() {
            return TemplateSlot.MATERIAL_TYPE_IMG;
        }

        public final String getMATERIAL_TYPE_VIDEO() {
            return TemplateSlot.MATERIAL_TYPE_VIDEO;
        }
    }

    public final double getClipEnd() {
        return this.clipEnd;
    }

    public final double getClipStart() {
        return this.clipStart;
    }

    public final String getDescription() {
        return this.description;
    }

    public final double getEndTime() {
        return this.endTime;
    }

    public final String getFreezeFromUUID() {
        return this.freezeFromUUID;
    }

    public final String getFreezeGroup() {
        return this.freezeGroup;
    }

    public final String getFreezeRefVideoUUID() {
        return this.freezeRefVideoUUID;
    }

    public final String getGameplaySource() {
        return this.gameplaySource;
    }

    public final int getLimitMaterialType() {
        return this.limitMaterialType;
    }

    public final String getMagicSupportType() {
        return this.magicSupportType;
    }

    public final String getOriginMaterialType() {
        return this.originMaterialType;
    }

    public final String[] getProcessor() {
        return this.processor;
    }

    public final String getSameAssetGroup() {
        return this.sameAssetGroup;
    }

    public final String getSource() {
        return this.source;
    }

    public final double getStartTime() {
        return this.startTime;
    }

    public final String getType() {
        return this.type;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public final Boolean isReverseVideo() {
        return this.isReverseVideo;
    }

    public final boolean hasCross(TemplateSlot templateSlot) {
        double slotStartTime = getSlotStartTime();
        double slotEndTTime = getSlotEndTTime();
        double slotStartTime2 = templateSlot.getSlotStartTime();
        double slotEndTTime2 = templateSlot.getSlotEndTTime();
        double d = slotStartTime - slotStartTime2;
        if ((1.0E-6d < d && 1.0E-6d < slotEndTTime2 - slotStartTime) || (((1.0E-6d <= slotStartTime2 - slotStartTime || slotStartTime2 == slotStartTime) && (1.0E-6d <= slotEndTTime - slotEndTTime2 || slotEndTTime == slotEndTTime2)) || ((1.0E-6d <= d || slotStartTime == slotStartTime2) && (1.0E-6d <= slotEndTTime2 - slotEndTTime || slotEndTTime2 == slotEndTTime)))) {
            return true;
        }
        if (1.0E-6d < slotEndTTime - slotStartTime2 && 1.0E-6d < slotEndTTime2 - slotEndTTime) {
            return true;
        }
        return false;
    }

    public final void setClipEnd(double d) {
        this.clipEnd = d;
    }

    public final void setDescription(String str) {
        this.description = str;
    }

    public final void setFreezeFromUUID(String str) {
        this.freezeFromUUID = str;
    }

    public final void setFreezeGroup(String str) {
        this.freezeGroup = str;
    }

    public final void setFreezeRefVideoUUID(String str) {
        this.freezeRefVideoUUID = str;
    }

    public final void setGameplaySource(String str) {
        this.gameplaySource = str;
    }

    public final void setLimitMaterialType(int i) {
        this.limitMaterialType = i;
    }

    public final void setMagicSupportType(String str) {
        this.magicSupportType = str;
    }

    public final void setOriginMaterialType(String str) {
        this.originMaterialType = str;
    }

    public final void setReverseVideo(Boolean bool) {
        this.isReverseVideo = bool;
    }

    public final void setSameAssetGroup(String str) {
        this.sameAssetGroup = str;
    }

    public TemplateSlot(double d, double d2, double d3, double d4, String str, String str2, String str3, String str4, String str5, int i, String[] strArr, String str6, String str7, String str8, String str9, String str10, Boolean bool, String str11) {
        this.startTime = d;
        this.endTime = d2;
        this.clipStart = d3;
        this.clipEnd = d4;
        this.source = str;
        this.type = str2;
        this.uuid = str3;
        this.description = str4;
        this.magicSupportType = str5;
        this.limitMaterialType = i;
        this.processor = strArr;
        this.gameplaySource = str6;
        this.sameAssetGroup = str7;
        this.freezeGroup = str8;
        this.freezeFromUUID = str9;
        this.freezeRefVideoUUID = str10;
        this.isReverseVideo = bool;
        this.originMaterialType = str11;
    }
}
