package com.ss.android.ugc.aweme.tools.sticker.core.secretreplies;

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
import com.ss.android.ugc.aweme.secretreplies.model.SecretRepliesStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.secretreplies.SecretRepliesStickerModel;
import java.io.Serializable;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public final class SecretRepliesStickerModel implements StickerModel, Parcelable, Serializable {

    @C09CT("base_sticker_model")
    public final BaseStickerModel baseStickerModel;

    @C09CT("editable")
    public final boolean editable;

    @C09CT("question_text")
    public final String questionText;

    @C09CT("visible")
    public final boolean visible;
    public static final Parcelable.Creator<SecretRepliesStickerModel> CREATOR = new Parcelable.Creator<SecretRepliesStickerModel>() { // from class: X.11CC
        @Override // android.os.Parcelable.Creator
        public final SecretRepliesStickerModel createFromParcel(Parcel parcel) {
            boolean z;
            BaseStickerModel baseStickerModelCreateFromParcel = BaseStickerModel.CREATOR.createFromParcel(parcel);
            boolean z2 = true;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                z2 = false;
            }
            return new SecretRepliesStickerModel(baseStickerModelCreateFromParcel, z, string, z2);
        }

        @Override // android.os.Parcelable.Creator
        public final SecretRepliesStickerModel[] newArray(int i) {
            return new SecretRepliesStickerModel[i];
        }
    };
    public static final int $stable = 8;

    public SecretRepliesStickerModel() {
        this(new BaseStickerModel(0, 0, EnumC1466150oFx.SECRET_REPLIES, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -5, 15, null), true, null, false);
    }

    public final SecretRepliesStickerModel copy(BaseStickerModel baseStickerModel, boolean z, String str, boolean z2) {
        return new SecretRepliesStickerModel(baseStickerModel, z, str, z2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SecretRepliesStickerModel)) {
            return false;
        }
        SecretRepliesStickerModel secretRepliesStickerModel = (SecretRepliesStickerModel) obj;
        return Intrinsics.LJFF(this.baseStickerModel, secretRepliesStickerModel.baseStickerModel) && this.visible == secretRepliesStickerModel.visible && Intrinsics.LJFF(this.questionText, secretRepliesStickerModel.questionText) && this.editable == secretRepliesStickerModel.editable;
    }

    public int hashCode() {
        int iHashCode = ((this.baseStickerModel.hashCode() * 31) + C786410Ut5.Z2(this.visible)) * 31;
        String str = this.questionText;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Z2(this.editable);
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
        sbLIZ.append("SecretRepliesStickerModel(baseStickerModel=");
        sbLIZ.append(this.baseStickerModel);
        sbLIZ.append(", visible=");
        sbLIZ.append(this.visible);
        sbLIZ.append(", questionText=");
        sbLIZ.append(this.questionText);
        sbLIZ.append(", editable=");
        sbLIZ.append(this.editable);
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
        parcel.writeInt(this.visible ? 1 : 0);
        parcel.writeString(this.questionText);
        parcel.writeInt(this.editable ? 1 : 0);
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public int getId() {
        return this.baseStickerModel.getId();
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public InteractStickerStruct getInteractStickerStruct() {
        C19591311kt.LIZ.getClass();
        InteractStickerStruct interactStickerStructLIZLLL = C19591311kt.LIZLLL(this, true);
        interactStickerStructLIZLLL.setType(getStickerType().getType());
        interactStickerStructLIZLLL.setSecretRepliesStickerStruct(new SecretRepliesStickerStruct(this.questionText));
        return interactStickerStructLIZLLL;
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public EnumC1466150oFx getStickerType() {
        return this.baseStickerModel.getType();
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public boolean isNotEmptyModel() {
        String str = this.questionText;
        return !(str == null || str.length() == 0);
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public BaseStickerModel getBaseModel() {
        return this.baseStickerModel;
    }

    public final BaseStickerModel getBaseStickerModel() {
        return this.baseStickerModel;
    }

    public final boolean getEditable() {
        return this.editable;
    }

    public final String getQuestionText() {
        return this.questionText;
    }

    public final boolean getVisible() {
        return this.visible;
    }

    public SecretRepliesStickerModel(BaseStickerModel baseStickerModel, boolean z, String str, boolean z2) {
        this.baseStickerModel = baseStickerModel;
        this.visible = z;
        this.questionText = str;
        this.editable = z2;
    }
}
