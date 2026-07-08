package com.ss.android.ugc.aweme.creative.model.template;

import X.C09CT;
import X.C2188811AlT;
import X.C531630Kt7;
import X.C531640Kt8;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.template.VideoTemplateSlot;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
public class VideoTemplateSlot implements Parcelable, Serializable {

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
    public static final C531640Kt8 Companion = new Object() { // from class: X.0Kt8
    };
    public static final Parcelable.Creator<VideoTemplateSlot> CREATOR = new Parcelable.Creator<VideoTemplateSlot>() { // from class: X.0Kra
        @Override // android.os.Parcelable.Creator
        public final VideoTemplateSlot createFromParcel(Parcel parcel) {
            boolean z;
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
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            return new VideoTemplateSlot(d, d2, d3, d4, string, string2, string3, string4, string5, i, strArrCreateStringArray, string6, string7, string8, string9, string10, boolValueOf, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoTemplateSlot[] newArray(int i) {
            return new VideoTemplateSlot[i];
        }
    };
    public static final String MATERIAL_TYPE_VIDEO = "video";
    public static final String MATERIAL_TYPE_IMG = "image";

    public VideoTemplateSlot() {
        this(0.0d, 0.0d, 0.0d, 0.0d, null, null, null, null, null, 0, null, null, null, null, null, null, null, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [int] */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.os.Parcel] */
    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
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

    public double getDuration() {
        return getClipEnd() - getClipStart();
    }

    public final double getSlotEndTTime() {
        return getEndTime() < 0.0d ? C531630Kt7.LIZJ(this) + (getClipEnd() - getClipStart()) : getEndTime();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TemplateSlot(startTime=");
        sbLIZ.append(getStartTime());
        sbLIZ.append(", endTime=");
        sbLIZ.append(getEndTime());
        sbLIZ.append(", slotStartTime=");
        sbLIZ.append(C531630Kt7.LIZJ(this));
        sbLIZ.append(", slotEndTime=");
        sbLIZ.append(getSlotEndTTime());
        sbLIZ.append(", clipStart=");
        sbLIZ.append(getClipStart());
        sbLIZ.append(", clipEnd=");
        sbLIZ.append(getClipEnd());
        sbLIZ.append(", source=");
        sbLIZ.append(getSource());
        sbLIZ.append(", type=");
        sbLIZ.append(getType());
        sbLIZ.append(", isReverse=");
        sbLIZ.append(isReverseVideo());
        sbLIZ.append(", freezeGroup=");
        sbLIZ.append(getFreezeGroup());
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public double getClipEnd() {
        return this.clipEnd;
    }

    public double getClipStart() {
        return this.clipStart;
    }

    public String getDescription() {
        return this.description;
    }

    public double getEndTime() {
        return this.endTime;
    }

    public String getFreezeFromUUID() {
        return this.freezeFromUUID;
    }

    public String getFreezeGroup() {
        return this.freezeGroup;
    }

    public String getFreezeRefVideoUUID() {
        return this.freezeRefVideoUUID;
    }

    public String getGameplaySource() {
        return this.gameplaySource;
    }

    public final int getLimitMaterialType() {
        return this.limitMaterialType;
    }

    public String getMagicSupportType() {
        return this.magicSupportType;
    }

    public String getOriginMaterialType() {
        return this.originMaterialType;
    }

    public String[] getProcessor() {
        return this.processor;
    }

    public String getSameAssetGroup() {
        return this.sameAssetGroup;
    }

    public String getSource() {
        return this.source;
    }

    public double getStartTime() {
        return this.startTime;
    }

    public String getType() {
        return this.type;
    }

    public String getUuid() {
        return this.uuid;
    }

    public Boolean isReverseVideo() {
        return this.isReverseVideo;
    }

    public boolean hasCross(VideoTemplateSlot videoTemplateSlot) {
        double dLIZJ = C531630Kt7.LIZJ(this);
        double slotEndTTime = getSlotEndTTime();
        double dLIZJ2 = C531630Kt7.LIZJ(videoTemplateSlot);
        double slotEndTTime2 = videoTemplateSlot.getSlotEndTTime();
        double d = dLIZJ - dLIZJ2;
        if ((1.0E-6d < d && 1.0E-6d < slotEndTTime2 - dLIZJ) || (((1.0E-6d <= dLIZJ2 - dLIZJ || dLIZJ2 == dLIZJ) && (1.0E-6d <= slotEndTTime - slotEndTTime2 || slotEndTTime == slotEndTTime2)) || ((1.0E-6d <= d || dLIZJ == dLIZJ2) && (1.0E-6d <= slotEndTTime2 - slotEndTTime || slotEndTTime2 == slotEndTTime)))) {
            return true;
        }
        if (1.0E-6d < slotEndTTime - dLIZJ2 && 1.0E-6d < slotEndTTime2 - slotEndTTime) {
            return true;
        }
        return false;
    }

    public void setClipEnd(double d) {
        this.clipEnd = d;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setFreezeFromUUID(String str) {
        this.freezeFromUUID = str;
    }

    public void setFreezeGroup(String str) {
        this.freezeGroup = str;
    }

    public void setFreezeRefVideoUUID(String str) {
        this.freezeRefVideoUUID = str;
    }

    public void setGameplaySource(String str) {
        this.gameplaySource = str;
    }

    public final void setLimitMaterialType(int i) {
        this.limitMaterialType = i;
    }

    public void setMagicSupportType(String str) {
        this.magicSupportType = str;
    }

    public void setOriginMaterialType(String str) {
        this.originMaterialType = str;
    }

    public void setReverseVideo(Boolean bool) {
        this.isReverseVideo = bool;
    }

    public void setSameAssetGroup(String str) {
        this.sameAssetGroup = str;
    }

    public VideoTemplateSlot(double d, double d2, double d3, double d4, String str, String str2, String str3, String str4, String str5, int i, String[] strArr, String str6, String str7, String str8, String str9, String str10, Boolean bool, String str11) {
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
