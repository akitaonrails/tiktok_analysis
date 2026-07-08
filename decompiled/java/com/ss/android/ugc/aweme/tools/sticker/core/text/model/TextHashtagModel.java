package com.ss.android.ugc.aweme.tools.sticker.core.text.model;

import X.C09CT;
import X.C19591311kt;
import X.C19598511m3;
import X.C2188811AlT;
import X.EnumC1466150oFx;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.sticker.data.HashtagStruct;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextHashtagModel;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class TextHashtagModel implements Serializable, Parcelable {

    @C09CT("base_sticker_model")
    public BaseStickerModel baseStickerModel;

    @C09CT("bottom")
    public final int bottom;

    @C09CT("end_index")
    public final int endIndex;

    @C09CT("hashtag_id")
    public String hashtagId;

    @C09CT("left")
    public final int left;

    @C09CT("right")
    public final int right;

    @C09CT("start_index")
    public final int startIndex;

    @C09CT("text")
    public final String text;

    @C09CT("top")
    public final int top;
    public static final Parcelable.Creator<TextHashtagModel> CREATOR = new Parcelable.Creator<TextHashtagModel>() { // from class: X.0FLS
        @Override // android.os.Parcelable.Creator
        public final TextHashtagModel createFromParcel(Parcel parcel) {
            BaseStickerModel baseStickerModelCreateFromParcel;
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            int i3 = parcel.readInt();
            int i4 = parcel.readInt();
            int i5 = parcel.readInt();
            int i6 = parcel.readInt();
            if (parcel.readInt() == 0) {
                baseStickerModelCreateFromParcel = null;
            } else {
                baseStickerModelCreateFromParcel = BaseStickerModel.CREATOR.createFromParcel(parcel);
            }
            return new TextHashtagModel(string, string2, i, i2, i3, i4, i5, i6, baseStickerModelCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final TextHashtagModel[] newArray(int i) {
            return new TextHashtagModel[i];
        }
    };
    public static final int $stable = 8;

    public TextHashtagModel() {
        this(null, "", 0, 0, 0, 0, 0, 0, null);
    }

    public final TextHashtagModel copy(String str, String str2, int i, int i2, int i3, int i4, int i5, int i6, BaseStickerModel baseStickerModel) {
        return new TextHashtagModel(str, str2, i, i2, i3, i4, i5, i6, baseStickerModel);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextHashtagModel)) {
            return false;
        }
        TextHashtagModel textHashtagModel = (TextHashtagModel) obj;
        return Intrinsics.LJFF(this.text, textHashtagModel.text) && Intrinsics.LJFF(this.hashtagId, textHashtagModel.hashtagId) && this.left == textHashtagModel.left && this.top == textHashtagModel.top && this.right == textHashtagModel.right && this.bottom == textHashtagModel.bottom && this.startIndex == textHashtagModel.startIndex && this.endIndex == textHashtagModel.endIndex && Intrinsics.LJFF(this.baseStickerModel, textHashtagModel.baseStickerModel);
    }

    public int hashCode() {
        String str = this.text;
        int iHashCode = (((((((((((((((str == null ? 0 : str.hashCode()) * 31) + this.hashtagId.hashCode()) * 31) + this.left) * 31) + this.top) * 31) + this.right) * 31) + this.bottom) * 31) + this.startIndex) * 31) + this.endIndex) * 31;
        BaseStickerModel baseStickerModel = this.baseStickerModel;
        return iHashCode + (baseStickerModel != null ? baseStickerModel.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TextHashtagModel(text=");
        sbLIZ.append(this.text);
        sbLIZ.append(", hashtagId=");
        sbLIZ.append(this.hashtagId);
        sbLIZ.append(", left=");
        sbLIZ.append(this.left);
        sbLIZ.append(", top=");
        sbLIZ.append(this.top);
        sbLIZ.append(", right=");
        sbLIZ.append(this.right);
        sbLIZ.append(", bottom=");
        sbLIZ.append(this.bottom);
        sbLIZ.append(", startIndex=");
        sbLIZ.append(this.startIndex);
        sbLIZ.append(", endIndex=");
        sbLIZ.append(this.endIndex);
        sbLIZ.append(", baseStickerModel=");
        sbLIZ.append(this.baseStickerModel);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.text);
        parcel.writeString(this.hashtagId);
        parcel.writeInt(this.left);
        parcel.writeInt(this.top);
        parcel.writeInt(this.right);
        parcel.writeInt(this.bottom);
        parcel.writeInt(this.startIndex);
        parcel.writeInt(this.endIndex);
        BaseStickerModel baseStickerModel = this.baseStickerModel;
        if (baseStickerModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseStickerModel.writeToParcel(parcel, i);
        }
    }

    public final BaseStickerModel getBaseModel() {
        BaseStickerModel baseStickerModel = this.baseStickerModel;
        return baseStickerModel == null ? new BaseStickerModel(0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -1, 15, null) : baseStickerModel;
    }

    public final InteractStickerStruct getInteractStickerStruct() {
        C19591311kt c19591311kt = C19591311kt.LIZ;
        int type = EnumC1466150oFx.HASH_TAG.getType();
        BaseStickerModel baseModel = getBaseModel();
        c19591311kt.getClass();
        InteractStickerStruct interactStickerStructLIZJ = C19591311kt.LIZJ(type, baseModel, true);
        interactStickerStructLIZJ.setNoGlobal(true);
        interactStickerStructLIZJ.setHashtagInfo(new HashtagStruct(this.hashtagId, this.text));
        interactStickerStructLIZJ.setIndex(getBaseModel().getZIndex());
        HashMap map = new HashMap();
        map.put("is_text_hashtag", "true");
        interactStickerStructLIZJ.setAttr(GsonProtectorUtils.toJson(C19598511m3.LIZ(), map));
        return interactStickerStructLIZJ;
    }

    public final BaseStickerModel getBaseStickerModel() {
        return this.baseStickerModel;
    }

    public final int getBottom() {
        return this.bottom;
    }

    public final int getEndIndex() {
        return this.endIndex;
    }

    public final String getHashtagId() {
        return this.hashtagId;
    }

    public final int getLeft() {
        return this.left;
    }

    public final int getRight() {
        return this.right;
    }

    public final int getStartIndex() {
        return this.startIndex;
    }

    public final String getText() {
        return this.text;
    }

    public final int getTop() {
        return this.top;
    }

    public final void setBaseSticker(BaseStickerModel baseStickerModel) {
        float width = (((this.left + this.right) / 2.0f) - (baseStickerModel.getWidth() / 2)) * baseStickerModel.getScale();
        float height = (((this.top + this.bottom) / 2.0f) - (baseStickerModel.getHeight() / 2)) * baseStickerModel.getScale();
        double radians = Math.toRadians(baseStickerModel.getRotation());
        double d = width;
        double d2 = height;
        this.baseStickerModel = new BaseStickerModel(0, 0, EnumC1466150oFx.MENTION, 0, 0, 0.0f, 0.0f, this.right - this.left, this.bottom - this.top, 0, 0, 0, 0, baseStickerModel.getMediaWidth(), baseStickerModel.getMediaHeight(), false, null, 0.0f, 0.0f, 0.0f, 0.0f, (float) (((double) baseStickerModel.getTranslateX()) + ((Math.cos(radians) * d) - (Math.sin(radians) * d2))), (float) (((double) baseStickerModel.getTranslateY()) + (d * Math.sin(radians)) + (d2 * Math.cos(radians))), baseStickerModel.getScale(), baseStickerModel.getRotation(), baseStickerModel.getStartTime(), baseStickerModel.getEndTime(), false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -132145541, 15, null);
    }

    public final void setBaseStickerModel(BaseStickerModel baseStickerModel) {
        this.baseStickerModel = baseStickerModel;
    }

    public final void setHashtagId(String str) {
        this.hashtagId = str;
    }

    public TextHashtagModel(String str, String str2, int i, int i2, int i3, int i4, int i5, int i6, BaseStickerModel baseStickerModel) {
        this.text = str;
        this.hashtagId = str2;
        this.left = i;
        this.top = i2;
        this.right = i3;
        this.bottom = i4;
        this.startIndex = i5;
        this.endIndex = i6;
        this.baseStickerModel = baseStickerModel;
    }
}
