package com.ss.android.ugc.aweme.tools.sticker.core.hashtag.global;

import X.AbstractC1442160ndG;
import X.C09CT;
import X.C0FKI;
import X.C1440500naa;
import X.C19591311kt;
import X.C2188811AlT;
import X.C786410Ut5;
import X.EnumC1466150oFx;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.sticker.data.HashtagStruct;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.hashtag.global.GlobalHashTagStickerModel;
import java.io.Serializable;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes30.dex */
public final class GlobalHashTagStickerModel implements StickerModel, Parcelable, Serializable {

    @C09CT("base_sticker_model")
    public final BaseStickerModel baseStickerModel;

    @C09CT("clickable")
    public final boolean clickable;

    @C09CT("content_text")
    public final String contentText;

    @C09CT("editable")
    public final boolean editable;

    @C09CT("hashtag_id")
    public final long hashtagId;

    @C09CT("visible")
    public final boolean visible;
    public static final Parcelable.Creator<GlobalHashTagStickerModel> CREATOR = new Parcelable.Creator<GlobalHashTagStickerModel>() { // from class: X.11kj
        @Override // android.os.Parcelable.Creator
        public final GlobalHashTagStickerModel createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            BaseStickerModel baseStickerModelCreateFromParcel = BaseStickerModel.CREATOR.createFromParcel(parcel);
            long j = parcel.readLong();
            String string = parcel.readString();
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
            return new GlobalHashTagStickerModel(baseStickerModelCreateFromParcel, j, string, z, z2, z3);
        }

        @Override // android.os.Parcelable.Creator
        public final GlobalHashTagStickerModel[] newArray(int i) {
            return new GlobalHashTagStickerModel[i];
        }
    };
    public static final int $stable = 8;

    public GlobalHashTagStickerModel() {
        this(new BaseStickerModel(0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -1, 15, null), 0L, "", false, false, true);
    }

    public final GlobalHashTagStickerModel copy(BaseStickerModel baseStickerModel, long j, String str, boolean z, boolean z2, boolean z3) {
        return new GlobalHashTagStickerModel(baseStickerModel, j, str, z, z2, z3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GlobalHashTagStickerModel)) {
            return false;
        }
        GlobalHashTagStickerModel globalHashTagStickerModel = (GlobalHashTagStickerModel) obj;
        return Intrinsics.LJFF(this.baseStickerModel, globalHashTagStickerModel.baseStickerModel) && this.hashtagId == globalHashTagStickerModel.hashtagId && Intrinsics.LJFF(this.contentText, globalHashTagStickerModel.contentText) && this.editable == globalHashTagStickerModel.editable && this.clickable == globalHashTagStickerModel.clickable && this.visible == globalHashTagStickerModel.visible;
    }

    public int hashCode() {
        return (((((((((this.baseStickerModel.hashCode() * 31) + C786410Ut5.Y2(this.hashtagId)) * 31) + this.contentText.hashCode()) * 31) + C786410Ut5.Z2(this.editable)) * 31) + C786410Ut5.Z2(this.clickable)) * 31) + C786410Ut5.Z2(this.visible);
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public boolean isVERenderSticker() {
        return false;
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
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GlobalHashTagStickerModel(baseStickerModel=");
        sbLIZ.append(this.baseStickerModel);
        sbLIZ.append(", hashtagId=");
        sbLIZ.append(this.hashtagId);
        sbLIZ.append(", contentText=");
        sbLIZ.append(this.contentText);
        sbLIZ.append(", editable=");
        sbLIZ.append(this.editable);
        sbLIZ.append(", clickable=");
        sbLIZ.append(this.clickable);
        sbLIZ.append(", visible=");
        sbLIZ.append(this.visible);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public StickerModel updateMediaSize(Pair<Integer, Integer> pair) {
        return this;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.baseStickerModel.writeToParcel(parcel, i);
        parcel.writeLong(this.hashtagId);
        parcel.writeString(this.contentText);
        parcel.writeInt(this.editable ? 1 : 0);
        parcel.writeInt(this.clickable ? 1 : 0);
        parcel.writeInt(this.visible ? 1 : 0);
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public int getId() {
        return this.baseStickerModel.getId();
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public InteractStickerStruct getInteractStickerStruct() {
        C19591311kt.LIZ.getClass();
        InteractStickerStruct interactStickerStructLIZLLL = C19591311kt.LIZLLL(this, false);
        HashtagStruct hashtagStruct = new HashtagStruct();
        hashtagStruct.setHashtagId("test");
        hashtagStruct.setHashtagName(this.contentText);
        interactStickerStructLIZLLL.setHashtagInfo(hashtagStruct);
        return interactStickerStructLIZLLL;
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public EnumC1466150oFx getStickerType() {
        return this.baseStickerModel.getType();
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public boolean isNotEmptyModel() {
        return !a0.LJJJIL(this.contentText);
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public BaseStickerModel getBaseModel() {
        return this.baseStickerModel;
    }

    public final BaseStickerModel getBaseStickerModel() {
        return this.baseStickerModel;
    }

    public final boolean getClickable() {
        return this.clickable;
    }

    public final String getContentText() {
        return this.contentText;
    }

    public final boolean getEditable() {
        return this.editable;
    }

    public final long getHashtagId() {
        return this.hashtagId;
    }

    public final boolean getVisible() {
        return this.visible;
    }

    public GlobalHashTagStickerModel(BaseStickerModel baseStickerModel, long j, String str, boolean z, boolean z2, boolean z3) {
        this.baseStickerModel = baseStickerModel;
        this.hashtagId = j;
        this.contentText = str;
        this.editable = z;
        this.clickable = z2;
        this.visible = z3;
    }
}
