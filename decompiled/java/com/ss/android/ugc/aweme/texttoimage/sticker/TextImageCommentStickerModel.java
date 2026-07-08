package com.ss.android.ugc.aweme.texttoimage.sticker;

import X.AbstractC1442160ndG;
import X.C09CT;
import X.C0FKI;
import X.C1440500naa;
import X.C19591311kt;
import X.C2188811AlT;
import X.EnumC1466150oFx;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.texttoimage.sticker.TextImageCommentStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import java.io.Serializable;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class TextImageCommentStickerModel implements StickerModel, Parcelable, Serializable {

    @C09CT("base_sticker_model")
    public final BaseStickerModel baseStickerModel;
    public static final Parcelable.Creator<TextImageCommentStickerModel> CREATOR = new Parcelable.Creator<TextImageCommentStickerModel>() { // from class: X.0FMd
        @Override // android.os.Parcelable.Creator
        public final TextImageCommentStickerModel createFromParcel(Parcel parcel) {
            return new TextImageCommentStickerModel((BaseStickerModel) parcel.readParcelable(TextImageCommentStickerModel.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final TextImageCommentStickerModel[] newArray(int i) {
            return new TextImageCommentStickerModel[i];
        }
    };
    public static final int $stable = BaseStickerModel.$stable;

    /* JADX WARN: Multi-variable type inference failed */
    public TextImageCommentStickerModel() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ TextImageCommentStickerModel copy$default(TextImageCommentStickerModel textImageCommentStickerModel, BaseStickerModel baseStickerModel, int i, Object obj) {
        if ((i & 1) != 0) {
            baseStickerModel = textImageCommentStickerModel.baseStickerModel;
        }
        return textImageCommentStickerModel.copy(baseStickerModel);
    }

    public final TextImageCommentStickerModel copy(BaseStickerModel baseStickerModel) {
        return new TextImageCommentStickerModel(baseStickerModel);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TextImageCommentStickerModel) && Intrinsics.LJFF(this.baseStickerModel, ((TextImageCommentStickerModel) obj).baseStickerModel);
    }

    public int hashCode() {
        return this.baseStickerModel.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public boolean isNotEmptyModel() {
        return true;
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
        sbLIZ.append("TextImageCommentStickerModel(baseStickerModel=");
        sbLIZ.append(this.baseStickerModel);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public StickerModel updateMediaSize(Pair<Integer, Integer> pair) {
        return this;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.baseStickerModel, i);
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public int getId() {
        return this.baseStickerModel.getId();
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public InteractStickerStruct getInteractStickerStruct() {
        C19591311kt.LIZ.getClass();
        InteractStickerStruct interactStickerStructLIZLLL = C19591311kt.LIZLLL(this, false);
        interactStickerStructLIZLLL.setType(getStickerType().getType());
        return interactStickerStructLIZLLL;
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public BaseStickerModel getBaseModel() {
        return this.baseStickerModel;
    }

    public final BaseStickerModel getBaseStickerModel() {
        return this.baseStickerModel;
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public EnumC1466150oFx getStickerType() {
        return EnumC1466150oFx.TEXT_IMAGE_COMMENT;
    }

    public TextImageCommentStickerModel(BaseStickerModel baseStickerModel) {
        this.baseStickerModel = baseStickerModel;
    }

    public /* synthetic */ TextImageCommentStickerModel(BaseStickerModel baseStickerModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new BaseStickerModel(0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -1, 15, null) : baseStickerModel);
    }
}
