package com.ss.android.ugc.aweme.effect;

import X.C2188811AlT;
import X.C391580FWy;
import X.InterfaceC2270908v5;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.io.Serializable;

/* JADX INFO: loaded from: classes6.dex */
public class EffectPointModel implements Serializable, Parcelable, Cloneable {
    public static final Parcelable.Creator<EffectPointModel> CREATOR = new C391580FWy(3);
    public String adjustParams;
    public String category;
    public String challenge;
    public String designerEncryptedId;
    public String designerId;
    public int duration;
    public int endPoint;
    public String entrancePoint;
    public String extra;
    public String fileUrl;
    public boolean fromMixMaterialPanel;
    public String iconUrl;
    public int index;
    public Boolean isFromEditPro;
    public boolean isFromEnd;
    public boolean isMagic;
    public Boolean isNewEngineEffect;
    public boolean isVideoAnim;
    public String key;
    public String musicId;
    public String name;
    public int originalEndTime;
    public int originalStartTime;

    @InterfaceC2270908v5
    public String resDir;
    public String resourceId;
    public EffectSearchModel searchModel;
    public String selectFrom;
    public int selectedColor;
    public int source;
    public int startPoint;
    public int type;
    public int uiEndPoint;
    public int uiStartPoint;
    public String uuid;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getKey() {
        String str = this.key;
        return str == null ? "" : str;
    }

    public EffectPointModel() {
        this.selectFrom = "";
        this.entrancePoint = "";
        this.key = CardStruct.IStatusCode.DEFAULT;
        this.category = "filter";
        Boolean bool = Boolean.FALSE;
        this.isNewEngineEffect = bool;
        this.isFromEditPro = bool;
        this.resourceId = "";
        this.challenge = "";
        this.iconUrl = "";
        this.fromMixMaterialPanel = false;
        this.musicId = "";
        this.fileUrl = "";
        this.source = 0;
        this.designerId = "";
        this.designerEncryptedId = "";
        this.searchModel = null;
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public EffectPointModel m190clone() {
        try {
            return (EffectPointModel) super.clone();
        } catch (CloneNotSupportedException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new AssertionError();
        }
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EffectPointModel{index=");
        sbLIZ.append(this.index);
        sbLIZ.append(", startPoint=");
        sbLIZ.append(this.startPoint);
        sbLIZ.append(", endPoint=");
        sbLIZ.append(this.endPoint);
        sbLIZ.append(", uiStartPoint=");
        sbLIZ.append(this.uiStartPoint);
        sbLIZ.append(", uiEndPoint=");
        sbLIZ.append(this.uiEndPoint);
        sbLIZ.append(", selectedColor=");
        sbLIZ.append(this.selectedColor);
        sbLIZ.append(", key='");
        sbLIZ.append(this.key);
        sbLIZ.append('\'');
        sbLIZ.append(", select_from='");
        sbLIZ.append(this.selectFrom);
        sbLIZ.append('\'');
        sbLIZ.append(", entrance_point='");
        sbLIZ.append(this.entrancePoint);
        sbLIZ.append('\'');
        sbLIZ.append(", type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", isFromEnd=");
        sbLIZ.append(this.isFromEnd);
        sbLIZ.append(", resDir='");
        sbLIZ.append(this.resDir);
        sbLIZ.append('\'');
        sbLIZ.append(", name='");
        sbLIZ.append(this.name);
        sbLIZ.append('\'');
        sbLIZ.append(", duration=");
        sbLIZ.append(this.duration);
        sbLIZ.append(", category='");
        sbLIZ.append(this.category);
        sbLIZ.append('\'');
        sbLIZ.append(", extra='");
        sbLIZ.append(this.extra);
        sbLIZ.append('\'');
        sbLIZ.append(", challenge='");
        sbLIZ.append(this.challenge);
        sbLIZ.append('\'');
        sbLIZ.append(", isfromEditPro='");
        sbLIZ.append(this.isFromEditPro);
        sbLIZ.append('\'');
        sbLIZ.append(", iconUrl='");
        sbLIZ.append(this.iconUrl);
        sbLIZ.append('\'');
        sbLIZ.append(", searchModel=");
        sbLIZ.append(this.searchModel);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public String getAdjustParams() {
        return this.adjustParams;
    }

    public String getCategory() {
        return this.category;
    }

    public String getChallenge() {
        return this.challenge;
    }

    public int getDuration() {
        return this.duration;
    }

    public int getEndPoint() {
        return this.endPoint;
    }

    public String getEntrancePoint() {
        return this.entrancePoint;
    }

    public String getExtra() {
        return this.extra;
    }

    public String getIconUrl() {
        return this.iconUrl;
    }

    public int getIndex() {
        return this.index;
    }

    public Boolean getIsFromEditPro() {
        return this.isFromEditPro;
    }

    public Boolean getIsNewEngineEffect() {
        return this.isNewEngineEffect;
    }

    public String getName() {
        return this.name;
    }

    public int getOriginalEndTime() {
        return this.originalEndTime;
    }

    public int getOriginalStartTime() {
        return this.originalStartTime;
    }

    public String getResDir() {
        return this.resDir;
    }

    public String getResourceId() {
        return this.resourceId;
    }

    public String getSelectFrom() {
        return this.selectFrom;
    }

    public int getSelectedColor() {
        return this.selectedColor;
    }

    public int getStartPoint() {
        return this.startPoint;
    }

    public int getType() {
        return this.type;
    }

    public int getUiEndPoint() {
        return this.uiEndPoint;
    }

    public int getUiStartPoint() {
        return this.uiStartPoint;
    }

    public String getUuid() {
        return this.uuid;
    }

    public boolean isFromEnd() {
        return this.isFromEnd;
    }

    public boolean isMagic() {
        return this.isMagic;
    }

    public boolean isVideoAnim() {
        return this.isVideoAnim;
    }

    public EffectPointModel(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        this.selectFrom = "";
        this.entrancePoint = "";
        this.key = CardStruct.IStatusCode.DEFAULT;
        this.category = "filter";
        Boolean bool = Boolean.FALSE;
        this.isNewEngineEffect = bool;
        this.isFromEditPro = bool;
        this.resourceId = "";
        this.challenge = "";
        this.iconUrl = "";
        this.fromMixMaterialPanel = false;
        this.musicId = "";
        this.fileUrl = "";
        this.source = 0;
        this.designerId = "";
        this.designerEncryptedId = "";
        this.searchModel = null;
        this.startPoint = parcel.readInt();
        this.endPoint = parcel.readInt();
        this.uiStartPoint = parcel.readInt();
        this.uiEndPoint = parcel.readInt();
        this.selectedColor = parcel.readInt();
        this.key = parcel.readString();
        this.selectFrom = parcel.readString();
        this.entrancePoint = parcel.readString();
        this.type = parcel.readInt();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.isFromEnd = z;
        this.resDir = parcel.readString();
        this.name = parcel.readString();
        this.category = parcel.readString();
        this.duration = parcel.readInt();
        this.extra = parcel.readString();
        this.adjustParams = parcel.readString();
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.isNewEngineEffect = Boolean.valueOf(z2);
        this.uuid = parcel.readString();
        this.resourceId = parcel.readString();
        this.challenge = parcel.readString();
        this.index = parcel.readInt();
        if (parcel.readByte() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.isFromEditPro = Boolean.valueOf(z3);
        if (parcel.readByte() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.isMagic = z4;
        this.iconUrl = parcel.readString();
        this.isVideoAnim = parcel.readByte() != 0;
        this.musicId = parcel.readString();
        this.source = parcel.readInt();
        this.designerId = parcel.readString();
        this.designerEncryptedId = parcel.readString();
        this.searchModel = (EffectSearchModel) parcel.readParcelable(EffectSearchModel.class.getClassLoader());
    }

    public void setAdjustParams(String str) {
        this.adjustParams = str;
    }

    public void setCategory(String str) {
        this.category = str;
    }

    public void setChallenge(String str) {
        this.challenge = str;
    }

    public void setDuration(int i) {
        this.duration = i;
    }

    public void setEndPoint(int i) {
        this.endPoint = i;
    }

    public void setEntrancePoint(String str) {
        this.entrancePoint = str;
    }

    public void setExtra(String str) {
        this.extra = str;
    }

    public void setFromEnd(boolean z) {
        this.isFromEnd = z;
    }

    public void setIconUrl(String str) {
        this.iconUrl = str;
    }

    public EffectPointModel setIndex(int i) {
        this.index = i;
        return this;
    }

    public void setIsFromEditPro(Boolean bool) {
        this.isFromEditPro = bool;
    }

    public void setIsNewEngineEffect(Boolean bool) {
        this.isNewEngineEffect = bool;
    }

    public void setIsVideoAnim(boolean z) {
        this.isVideoAnim = z;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setMagic(boolean z) {
        this.isMagic = z;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setOriginalEndTime(int i) {
        this.originalEndTime = i;
    }

    public void setOriginalStartTime(int i) {
        this.originalStartTime = i;
    }

    public void setResDir(String str) {
        this.resDir = str;
    }

    public void setResourceId(String str) {
        this.resourceId = str;
    }

    public void setSelectFrom(String str) {
        this.selectFrom = str;
    }

    public void setSelectedColor(int i) {
        this.selectedColor = i;
    }

    public void setStartPoint(int i) {
        this.startPoint = i;
    }

    public void setType(int i) {
        this.type = i;
    }

    public void setUiEndPoint(int i) {
        this.uiEndPoint = i;
    }

    public void setUiStartPoint(int i) {
        this.uiStartPoint = i;
    }

    public void setUuid(String str) {
        this.uuid = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.startPoint);
        parcel.writeInt(this.endPoint);
        parcel.writeInt(this.uiStartPoint);
        parcel.writeInt(this.uiEndPoint);
        parcel.writeInt(this.selectedColor);
        parcel.writeString(this.key);
        parcel.writeString(this.selectFrom);
        parcel.writeString(this.entrancePoint);
        parcel.writeInt(this.type);
        parcel.writeByte(this.isFromEnd ? (byte) 1 : (byte) 0);
        parcel.writeString(this.resDir);
        parcel.writeString(this.name);
        parcel.writeString(this.category);
        parcel.writeInt(this.duration);
        parcel.writeString(this.extra);
        parcel.writeString(this.adjustParams);
        parcel.writeByte(this.isNewEngineEffect.booleanValue() ? (byte) 1 : (byte) 0);
        parcel.writeString(this.uuid);
        parcel.writeString(this.resourceId);
        parcel.writeString(this.challenge);
        parcel.writeInt(this.index);
        parcel.writeByte(this.isFromEditPro.booleanValue() ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isMagic ? (byte) 1 : (byte) 0);
        parcel.writeString(this.iconUrl);
        parcel.writeByte(this.isVideoAnim ? (byte) 1 : (byte) 0);
        parcel.writeString(this.musicId);
        parcel.writeInt(this.source);
        parcel.writeString(this.designerId);
        parcel.writeString(this.designerEncryptedId);
        parcel.writeParcelable(this.searchModel, i);
    }
}
