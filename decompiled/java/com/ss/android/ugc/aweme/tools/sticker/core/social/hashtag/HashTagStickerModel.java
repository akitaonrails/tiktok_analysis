package com.ss.android.ugc.aweme.tools.sticker.core.social.hashtag;

import X.AbstractC1442160ndG;
import X.C09CT;
import X.C0FKI;
import X.C123100dR;
import X.C1440500naa;
import X.C19591311kt;
import X.C2188811AlT;
import X.C786410Ut5;
import X.EnumC1466150oFx;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.widget.EditText;
import com.ss.android.ugc.aweme.sticker.data.HashtagStruct;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.social.hashtag.HashTagStickerModel;
import java.io.Serializable;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public final class HashTagStickerModel implements StickerModel, Parcelable, Serializable {

    @C09CT("base_sticker_model")
    public final BaseStickerModel baseStickerModel;

    @C09CT("editable")
    public boolean editable;

    @C09CT("hashtag_name")
    public String hashtagName;

    @C09CT("use_capsule_style")
    public final boolean useCapsuleStyle;

    @C09CT("visible")
    public final boolean visible;
    public static final Parcelable.Creator<HashTagStickerModel> CREATOR = new Parcelable.Creator<HashTagStickerModel>() { // from class: X.11no
        @Override // android.os.Parcelable.Creator
        public final HashTagStickerModel createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            BaseStickerModel baseStickerModelCreateFromParcel = BaseStickerModel.CREATOR.createFromParcel(parcel);
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
            return new HashTagStickerModel(baseStickerModelCreateFromParcel, string, z, z2, z3);
        }

        @Override // android.os.Parcelable.Creator
        public final HashTagStickerModel[] newArray(int i) {
            return new HashTagStickerModel[i];
        }
    };
    public static final int $stable = 8;

    public HashTagStickerModel() {
        this(new BaseStickerModel(0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -1, 15, null), null, false, true, false);
    }

    public final HashTagStickerModel copy(BaseStickerModel baseStickerModel, String str, boolean z, boolean z2, boolean z3) {
        return new HashTagStickerModel(baseStickerModel, str, z, z2, z3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HashTagStickerModel)) {
            return false;
        }
        HashTagStickerModel hashTagStickerModel = (HashTagStickerModel) obj;
        return Intrinsics.LJFF(this.baseStickerModel, hashTagStickerModel.baseStickerModel) && Intrinsics.LJFF(this.hashtagName, hashTagStickerModel.hashtagName) && this.editable == hashTagStickerModel.editable && this.visible == hashTagStickerModel.visible && this.useCapsuleStyle == hashTagStickerModel.useCapsuleStyle;
    }

    public int hashCode() {
        int iHashCode = this.baseStickerModel.hashCode() * 31;
        String str = this.hashtagName;
        return ((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Z2(this.editable)) * 31) + C786410Ut5.Z2(this.visible)) * 31) + C786410Ut5.Z2(this.useCapsuleStyle);
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public boolean isVERenderSticker() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public boolean needCompile() {
        return true;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HashTagStickerModel(baseStickerModel=");
        sbLIZ.append(this.baseStickerModel);
        sbLIZ.append(", hashtagName=");
        sbLIZ.append(this.hashtagName);
        sbLIZ.append(", editable=");
        sbLIZ.append(this.editable);
        sbLIZ.append(", visible=");
        sbLIZ.append(this.visible);
        sbLIZ.append(", useCapsuleStyle=");
        sbLIZ.append(this.useCapsuleStyle);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.baseStickerModel.writeToParcel(parcel, i);
        parcel.writeString(this.hashtagName);
        parcel.writeInt(this.editable ? 1 : 0);
        parcel.writeInt(this.visible ? 1 : 0);
        parcel.writeInt(this.useCapsuleStyle ? 1 : 0);
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public int getId() {
        return this.baseStickerModel.getId();
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public InteractStickerStruct getInteractStickerStruct() {
        C19591311kt.LIZ.getClass();
        InteractStickerStruct interactStickerStructLIZLLL = C19591311kt.LIZLLL(this, true);
        HashtagStruct hashtagStruct = new HashtagStruct();
        hashtagStruct.setHashtagName(this.hashtagName);
        interactStickerStructLIZLLL.setHashtagInfo(hashtagStruct);
        interactStickerStructLIZLLL.setType(getStickerType().getType());
        return interactStickerStructLIZLLL;
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public boolean isNotEmptyModel() {
        return C123100dR.LIZ(this.hashtagName);
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

    public final String getHashtagName() {
        return this.hashtagName;
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public EnumC1466150oFx getStickerType() {
        return EnumC1466150oFx.HASH_TAG;
    }

    public final boolean getUseCapsuleStyle() {
        return this.useCapsuleStyle;
    }

    public final boolean getVisible() {
        return this.visible;
    }

    public final void setEditable(boolean z) {
        this.editable = z;
    }

    public final void setHashtagName(String str) {
        this.hashtagName = str;
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public StickerModel updateMediaSize(Pair<Integer, Integer> pair) {
        return copy(BaseStickerModel.copy$default(this.baseStickerModel, 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, pair.getFirst().intValue(), pair.getSecond().intValue(), false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -24577, 15, null), this.hashtagName, this.editable, this.visible, this.useCapsuleStyle);
    }

    public HashTagStickerModel(BaseStickerModel baseStickerModel, String str, boolean z, boolean z2, boolean z3) {
        this.baseStickerModel = baseStickerModel;
        this.hashtagName = str;
        this.editable = z;
        this.visible = z2;
        this.useCapsuleStyle = z3;
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public AbstractC1442160ndG<?> stickerCompileComponent(final Context context, final String str, final C1440500naa c1440500naa, final C0FKI c0fki, String str2) {
        return new AbstractC1442160ndG<HashTagStickerModel>(context, c1440500naa, c0fki, str) { // from class: X.11ny
            public final Context LIZJ;
            public final String LIZLLL;
            public final C0FKI LJ;

            @Override // X.AbstractC1442160ndG
            public final EnumC1466150oFx LIZJ() {
                return EnumC1466150oFx.HASH_TAG;
            }

            @Override // X.AbstractC1442160ndG
            public final String LIZ(StickerModel stickerModel) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(this.LIZLLL);
                sbLIZ.append("/hash_tag_sticker/");
                sbLIZ.append(((HashTagStickerModel) stickerModel).getId());
                sbLIZ.append(".png");
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // X.AbstractC1442160ndG
            public final View LIZIZ(StickerModel stickerModel) {
                Typeface typefaceByFontName;
                EditText titleEditText;
                HashTagStickerModel hashTagStickerModel = (HashTagStickerModel) stickerModel;
                C19630611rE c19630611rE = new C19630611rE(this.LIZJ);
                c19630611rE.LLJI = hashTagStickerModel.getUseCapsuleStyle();
                c19630611rE.LJII(hashTagStickerModel);
                if (!hashTagStickerModel.getUseCapsuleStyle() && (typefaceByFontName = this.LJ.getTypefaceByFontName("Neon")) != null && (titleEditText = c19630611rE.getTitleEditText()) != null) {
                    titleEditText.setTypeface(typefaceByFontName);
                }
                return c19630611rE;
            }

            @Override // X.AbstractC1442160ndG
            public final StickerModel LIZLLL(StickerModel stickerModel, int i, int i2) {
                HashTagStickerModel hashTagStickerModel = (HashTagStickerModel) stickerModel;
                return hashTagStickerModel.copy(BaseStickerModel.copy$default(hashTagStickerModel.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, i, i2, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -385, 15, null), hashTagStickerModel.hashtagName, hashTagStickerModel.editable, hashTagStickerModel.visible, hashTagStickerModel.useCapsuleStyle);
            }

            {
                super(context, c1440500naa);
                this.LIZJ = context;
                this.LIZLLL = str;
                this.LJ = c0fki;
            }
        };
    }
}
