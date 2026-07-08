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
import com.ss.android.ugc.aweme.secretreplies.model.SecretRepliesResponseStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.secretreplies.SecretRepliesResponseStickerModel;
import java.io.Serializable;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public final class SecretRepliesResponseStickerModel implements StickerModel, Parcelable, Serializable {

    @C09CT("original_aweme_id")
    public final Long baseAwemeId;

    @C09CT("base_sticker_model")
    public final BaseStickerModel baseStickerModel;

    @C09CT("question_text")
    public final String questionText;

    @C09CT("response_text")
    public final String responseText;

    @C09CT("visible")
    public final boolean visible;
    public static final Parcelable.Creator<SecretRepliesResponseStickerModel> CREATOR = new Parcelable.Creator<SecretRepliesResponseStickerModel>() { // from class: X.0oGD
        @Override // android.os.Parcelable.Creator
        public final SecretRepliesResponseStickerModel createFromParcel(Parcel parcel) {
            Long lValueOf;
            boolean z;
            BaseStickerModel baseStickerModelCreateFromParcel = BaseStickerModel.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
            }
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new SecretRepliesResponseStickerModel(baseStickerModelCreateFromParcel, lValueOf, string, string2, z);
        }

        @Override // android.os.Parcelable.Creator
        public final SecretRepliesResponseStickerModel[] newArray(int i) {
            return new SecretRepliesResponseStickerModel[i];
        }
    };
    public static final int $stable = 8;

    public final SecretRepliesResponseStickerModel copy(BaseStickerModel baseStickerModel, Long l, String str, String str2, boolean z) {
        return new SecretRepliesResponseStickerModel(baseStickerModel, l, str, str2, z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SecretRepliesResponseStickerModel)) {
            return false;
        }
        SecretRepliesResponseStickerModel secretRepliesResponseStickerModel = (SecretRepliesResponseStickerModel) obj;
        return Intrinsics.LJFF(this.baseStickerModel, secretRepliesResponseStickerModel.baseStickerModel) && Intrinsics.LJFF(this.baseAwemeId, secretRepliesResponseStickerModel.baseAwemeId) && Intrinsics.LJFF(this.questionText, secretRepliesResponseStickerModel.questionText) && Intrinsics.LJFF(this.responseText, secretRepliesResponseStickerModel.responseText) && this.visible == secretRepliesResponseStickerModel.visible;
    }

    public int hashCode() {
        int iHashCode = this.baseStickerModel.hashCode() * 31;
        Long l = this.baseAwemeId;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.questionText;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.responseText;
        return ((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.visible);
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
        sbLIZ.append("SecretRepliesResponseStickerModel(baseStickerModel=");
        sbLIZ.append(this.baseStickerModel);
        sbLIZ.append(", baseAwemeId=");
        sbLIZ.append(this.baseAwemeId);
        sbLIZ.append(", questionText=");
        sbLIZ.append(this.questionText);
        sbLIZ.append(", responseText=");
        sbLIZ.append(this.responseText);
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
        Long l = this.baseAwemeId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.questionText);
        parcel.writeString(this.responseText);
        parcel.writeInt(this.visible ? 1 : 0);
    }

    public SecretRepliesResponseStickerModel() {
        this(new BaseStickerModel(0, 0, EnumC1466150oFx.SECRET_REPLIES_RESPONSE, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -5, 15, null), null, null, null, true);
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
        interactStickerStructLIZLLL.setSecretRepliesResponseStickerStruct(new SecretRepliesResponseStickerStruct(this.baseAwemeId, this.questionText, this.responseText));
        return interactStickerStructLIZLLL;
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public EnumC1466150oFx getStickerType() {
        return this.baseStickerModel.getType();
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public boolean isNotEmptyModel() {
        String str;
        String str2 = this.questionText;
        return (str2 == null || str2.length() == 0 || (str = this.responseText) == null || str.length() == 0) ? false : true;
    }

    public final Long getBaseAwemeId() {
        return this.baseAwemeId;
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public BaseStickerModel getBaseModel() {
        return this.baseStickerModel;
    }

    public final BaseStickerModel getBaseStickerModel() {
        return this.baseStickerModel;
    }

    public final String getQuestionText() {
        return this.questionText;
    }

    public final String getResponseText() {
        return this.responseText;
    }

    public final boolean getVisible() {
        return this.visible;
    }

    public SecretRepliesResponseStickerModel(BaseStickerModel baseStickerModel, Long l, String str, String str2, boolean z) {
        this.baseStickerModel = baseStickerModel;
        this.baseAwemeId = l;
        this.questionText = str;
        this.responseText = str2;
        this.visible = z;
    }
}
