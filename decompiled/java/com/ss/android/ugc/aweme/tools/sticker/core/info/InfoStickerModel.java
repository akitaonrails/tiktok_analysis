package com.ss.android.ugc.aweme.tools.sticker.core.info;

import X.AbstractC1442160ndG;
import X.C09CT;
import X.C0EKQ;
import X.C0FKI;
import X.C123100dR;
import X.C1440500naa;
import X.C364020EOy;
import X.C786410Ut5;
import X.EnumC1466150oFx;
import X.EnumC356160Dxm;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.info.ImageStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.info.InfoStickerModel;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes6.dex */
public final class InfoStickerModel implements StickerModel, Parcelable {

    @C09CT("base_sticker_model")
    public final BaseStickerModel baseStickerModel;

    @C09CT("effect_type")
    public final int effectType;

    @C09CT("enable")
    public boolean enable;

    @C09CT("enable_gesture")
    public final boolean enableGesture;

    @C09CT("extra")
    public final String extra;

    @C09CT("icon_path")
    public final String iconPath;

    @C09CT("image_sticker_model")
    public ImageStickerModel imageStickerModel;

    @C09CT("is_from_pugc_template")
    public boolean isFromPUGCTemplate;

    @C09CT("is_image_sticker")
    public final boolean isImageSticker;

    @C09CT("is_pin")
    public boolean isPinning;

    @C09CT("panel")
    public final String panel;

    @C09CT("path")
    public final String path;

    @C09CT("res_id")
    public final String resId;

    @C09CT("source")
    public int sourceType;

    @C09CT("sticker_id")
    public final String stickerId;

    @C09CT("sticker_type")
    public String stickerType;

    @C09CT("type")
    public final int type;

    @C09CT("uuid")
    public String uuid;

    @C09CT("visible")
    public boolean visible;
    public static final C364020EOy Companion = new Object() { // from class: X.0EOy
    };
    public static final Parcelable.Creator<InfoStickerModel> CREATOR = new Parcelable.Creator<InfoStickerModel>() { // from class: X.0EKU
        @Override // android.os.Parcelable.Creator
        public final InfoStickerModel createFromParcel(Parcel parcel) {
            ImageStickerModel imageStickerModelCreateFromParcel;
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            boolean z6;
            BaseStickerModel baseStickerModelCreateFromParcel = BaseStickerModel.CREATOR.createFromParcel(parcel);
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            if (parcel.readInt() == 0) {
                imageStickerModelCreateFromParcel = null;
            } else {
                imageStickerModelCreateFromParcel = ImageStickerModel.CREATOR.createFromParcel(parcel);
            }
            ImageStickerModel imageStickerModel = imageStickerModelCreateFromParcel;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (parcel.readInt() != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (parcel.readInt() != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            int i3 = parcel.readInt();
            String string8 = parcel.readString();
            if (parcel.readInt() != 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            return new InfoStickerModel(baseStickerModelCreateFromParcel, string, string2, string3, string4, string5, i, i2, string6, string7, imageStickerModel, z, z2, z3, z4, z5, i3, string8, z6);
        }

        @Override // android.os.Parcelable.Creator
        public final InfoStickerModel[] newArray(int i) {
            return new InfoStickerModel[i];
        }
    };
    public static final int $stable = 8;

    public InfoStickerModel() {
        this(new BaseStickerModel(0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -1, 15, null), null, "", "", "", "", 0, 0, null, null, null, false, true, true, true, false, C0EKQ.EDITOR_PRO.getValue(), EnumC356160Dxm.NORMAL.toString(), false);
    }

    public final InfoStickerModel copy(BaseStickerModel baseStickerModel, String str, String str2, String str3, String str4, String str5, int i, int i2, String str6, String str7, ImageStickerModel imageStickerModel, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i3, String str8, boolean z6) {
        return new InfoStickerModel(baseStickerModel, str, str2, str3, str4, str5, i, i2, str6, str7, imageStickerModel, z, z2, z3, z4, z5, i3, str8, z6);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InfoStickerModel)) {
            return false;
        }
        InfoStickerModel infoStickerModel = (InfoStickerModel) obj;
        return Intrinsics.LJFF(this.baseStickerModel, infoStickerModel.baseStickerModel) && Intrinsics.LJFF(this.uuid, infoStickerModel.uuid) && Intrinsics.LJFF(this.path, infoStickerModel.path) && Intrinsics.LJFF(this.iconPath, infoStickerModel.iconPath) && Intrinsics.LJFF(this.stickerId, infoStickerModel.stickerId) && Intrinsics.LJFF(this.resId, infoStickerModel.resId) && this.effectType == infoStickerModel.effectType && this.type == infoStickerModel.type && Intrinsics.LJFF(this.extra, infoStickerModel.extra) && Intrinsics.LJFF(this.panel, infoStickerModel.panel) && Intrinsics.LJFF(this.imageStickerModel, infoStickerModel.imageStickerModel) && this.isImageSticker == infoStickerModel.isImageSticker && this.enableGesture == infoStickerModel.enableGesture && this.visible == infoStickerModel.visible && this.enable == infoStickerModel.enable && this.isPinning == infoStickerModel.isPinning && this.sourceType == infoStickerModel.sourceType && Intrinsics.LJFF(this.stickerType, infoStickerModel.stickerType) && this.isFromPUGCTemplate == infoStickerModel.isFromPUGCTemplate;
    }

    public int hashCode() {
        int iHashCode = this.baseStickerModel.hashCode() * 31;
        String str = this.uuid;
        int iHashCode2 = (((((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.path.hashCode()) * 31) + this.iconPath.hashCode()) * 31) + this.stickerId.hashCode()) * 31) + this.resId.hashCode()) * 31) + this.effectType) * 31) + this.type) * 31;
        String str2 = this.extra;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.panel;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ImageStickerModel imageStickerModel = this.imageStickerModel;
        return ((((((((((((((((iHashCode4 + (imageStickerModel != null ? imageStickerModel.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.isImageSticker)) * 31) + C786410Ut5.Z2(this.enableGesture)) * 31) + C786410Ut5.Z2(this.visible)) * 31) + C786410Ut5.Z2(this.enable)) * 31) + C786410Ut5.Z2(this.isPinning)) * 31) + this.sourceType) * 31) + this.stickerType.hashCode()) * 31) + C786410Ut5.Z2(this.isFromPUGCTemplate);
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public boolean isVERenderSticker() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public boolean needCompile() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public AbstractC1442160ndG<?> stickerCompileComponent(Context context, String str, C1440500naa c1440500naa, C0FKI c0fki, String str2) {
        return null;
    }

    public String toString() {
        return "InfoStickerModel(baseStickerModel=" + this.baseStickerModel + ", uuid=" + this.uuid + ", path=" + this.path + ", iconPath=" + this.iconPath + ", stickerId=" + this.stickerId + ", resId=" + this.resId + ", effectType=" + this.effectType + ", type=" + this.type + ", extra=" + this.extra + ", panel=" + this.panel + ", imageStickerModel=" + this.imageStickerModel + ", isImageSticker=" + this.isImageSticker + ", enableGesture=" + this.enableGesture + ", visible=" + this.visible + ", enable=" + this.enable + ", isPinning=" + this.isPinning + ", sourceType=" + this.sourceType + ", stickerType=" + this.stickerType + ", isFromPUGCTemplate=" + this.isFromPUGCTemplate + ')';
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public StickerModel updateMediaSize(Pair<Integer, Integer> pair) {
        return this;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.baseStickerModel.writeToParcel(parcel, i);
        parcel.writeString(this.uuid);
        parcel.writeString(this.path);
        parcel.writeString(this.iconPath);
        parcel.writeString(this.stickerId);
        parcel.writeString(this.resId);
        parcel.writeInt(this.effectType);
        parcel.writeInt(this.type);
        parcel.writeString(this.extra);
        parcel.writeString(this.panel);
        ImageStickerModel imageStickerModel = this.imageStickerModel;
        if (imageStickerModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            imageStickerModel.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.isImageSticker ? 1 : 0);
        parcel.writeInt(this.enableGesture ? 1 : 0);
        parcel.writeInt(this.visible ? 1 : 0);
        parcel.writeInt(this.enable ? 1 : 0);
        parcel.writeInt(this.isPinning ? 1 : 0);
        parcel.writeInt(this.sourceType);
        parcel.writeString(this.stickerType);
        parcel.writeInt(this.isFromPUGCTemplate ? 1 : 0);
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public int getId() {
        return this.baseStickerModel.getId();
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public InteractStickerStruct getInteractStickerStruct() {
        return new InteractStickerStruct();
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public EnumC1466150oFx getStickerType() {
        return this.baseStickerModel.getType();
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public boolean isNotEmptyModel() {
        return C123100dR.LIZ(this.path) && (a0.LJJJIL(this.path) ^ true);
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public BaseStickerModel getBaseModel() {
        return this.baseStickerModel;
    }

    public final BaseStickerModel getBaseStickerModel() {
        return this.baseStickerModel;
    }

    public final int getEffectType() {
        return this.effectType;
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final boolean getEnableGesture() {
        return this.enableGesture;
    }

    public final String getExtra() {
        return this.extra;
    }

    public final String getIconPath() {
        return this.iconPath;
    }

    public final ImageStickerModel getImageStickerModel() {
        return this.imageStickerModel;
    }

    public final String getPanel() {
        return this.panel;
    }

    public final String getPath() {
        return this.path;
    }

    public final String getResId() {
        return this.resId;
    }

    public final int getSourceType() {
        return this.sourceType;
    }

    public final String getStickerId() {
        return this.stickerId;
    }

    public final int getType() {
        return this.type;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public final boolean getVisible() {
        return this.visible;
    }

    public final boolean isFromPUGCTemplate() {
        return this.isFromPUGCTemplate;
    }

    public final boolean isImageSticker() {
        return this.isImageSticker;
    }

    public final boolean isPinning() {
        return this.isPinning;
    }

    /* JADX INFO: renamed from: getStickerType, reason: collision with other method in class */
    public final String m329getStickerType() {
        return this.stickerType;
    }

    public final void setEnable(boolean z) {
        this.enable = z;
    }

    public final void setFromPUGCTemplate(boolean z) {
        this.isFromPUGCTemplate = z;
    }

    public final void setImageStickerModel(ImageStickerModel imageStickerModel) {
        this.imageStickerModel = imageStickerModel;
    }

    public final void setPinning(boolean z) {
        this.isPinning = z;
    }

    public final void setSourceType(int i) {
        this.sourceType = i;
    }

    public final void setStickerType(String str) {
        this.stickerType = str;
    }

    public final void setUuid(String str) {
        this.uuid = str;
    }

    public final void setVisible(boolean z) {
        this.visible = z;
    }

    public InfoStickerModel(BaseStickerModel baseStickerModel, String str, String str2, String str3, String str4, String str5, int i, int i2, String str6, String str7, ImageStickerModel imageStickerModel, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i3, String str8, boolean z6) {
        this.baseStickerModel = baseStickerModel;
        this.uuid = str;
        this.path = str2;
        this.iconPath = str3;
        this.stickerId = str4;
        this.resId = str5;
        this.effectType = i;
        this.type = i2;
        this.extra = str6;
        this.panel = str7;
        this.imageStickerModel = imageStickerModel;
        this.isImageSticker = z;
        this.enableGesture = z2;
        this.visible = z3;
        this.enable = z4;
        this.isPinning = z5;
        this.sourceType = i3;
        this.stickerType = str8;
        this.isFromPUGCTemplate = z6;
    }
}
