package com.ss.android.ugc.aweme.tools.sticker.core.aicaption;

import X.AbstractC1442160ndG;
import X.C09CT;
import X.C0FKI;
import X.C1440500naa;
import X.C2188811AlT;
import X.C786410Ut5;
import X.EnumC1466150oFx;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.aicaption.AICaptionTagStickerModel;
import java.io.Serializable;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class AICaptionTagStickerModel implements StickerModel, Parcelable, Serializable {

    @C09CT("alpha")
    public final float alpha;

    @C09CT("base_sticker_model")
    public final BaseStickerModel baseStickerModel;

    @C09CT("is_edited")
    public final boolean isEdited;

    @C09CT("is_meme_audio")
    public final boolean isMemeAudio;

    @C09CT("solid_space")
    public final boolean solidSpace;

    @C09CT("visible")
    public final boolean visible;
    public static final Parcelable.Creator<AICaptionTagStickerModel> CREATOR = new Parcelable.Creator<AICaptionTagStickerModel>() { // from class: X.0FRY
        @Override // android.os.Parcelable.Creator
        public final AICaptionTagStickerModel createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            BaseStickerModel baseStickerModelCreateFromParcel = BaseStickerModel.CREATOR.createFromParcel(parcel);
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
            float f = parcel.readFloat();
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
            return new AICaptionTagStickerModel(baseStickerModelCreateFromParcel, z, z2, f, z3, z4);
        }

        @Override // android.os.Parcelable.Creator
        public final AICaptionTagStickerModel[] newArray(int i) {
            return new AICaptionTagStickerModel[i];
        }
    };
    public static final int $stable = 8;

    public AICaptionTagStickerModel() {
        this(new BaseStickerModel(0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -1, 15, null), false, true, 1.0f, false, false);
    }

    public static /* synthetic */ AICaptionTagStickerModel copy$default(AICaptionTagStickerModel aICaptionTagStickerModel, BaseStickerModel baseStickerModel, boolean z, boolean z2, float f, boolean z3, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            baseStickerModel = aICaptionTagStickerModel.baseStickerModel;
        }
        if ((i & 2) != 0) {
            z = aICaptionTagStickerModel.isEdited;
        }
        if ((i & 4) != 0) {
            z2 = aICaptionTagStickerModel.visible;
        }
        if ((i & 8) != 0) {
            f = aICaptionTagStickerModel.alpha;
        }
        if ((i & 16) != 0) {
            z3 = aICaptionTagStickerModel.solidSpace;
        }
        if ((i & 32) != 0) {
            z4 = aICaptionTagStickerModel.isMemeAudio;
        }
        return aICaptionTagStickerModel.copy(baseStickerModel, z, z2, f, z3, z4);
    }

    public final AICaptionTagStickerModel copy(BaseStickerModel baseStickerModel, boolean z, boolean z2, float f, boolean z3, boolean z4) {
        return new AICaptionTagStickerModel(baseStickerModel, z, z2, f, z3, z4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AICaptionTagStickerModel)) {
            return false;
        }
        AICaptionTagStickerModel aICaptionTagStickerModel = (AICaptionTagStickerModel) obj;
        return Intrinsics.LJFF(this.baseStickerModel, aICaptionTagStickerModel.baseStickerModel) && this.isEdited == aICaptionTagStickerModel.isEdited && this.visible == aICaptionTagStickerModel.visible && Float.compare(this.alpha, aICaptionTagStickerModel.alpha) == 0 && this.solidSpace == aICaptionTagStickerModel.solidSpace && this.isMemeAudio == aICaptionTagStickerModel.isMemeAudio;
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
        return true;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AICaptionTagStickerModel(baseStickerModel=");
        sbLIZ.append(this.baseStickerModel);
        sbLIZ.append(", isEdited=");
        sbLIZ.append(this.isEdited);
        sbLIZ.append(", visible=");
        sbLIZ.append(this.visible);
        sbLIZ.append(", alpha=");
        sbLIZ.append(this.alpha);
        sbLIZ.append(", solidSpace=");
        sbLIZ.append(this.solidSpace);
        sbLIZ.append(", isMemeAudio=");
        sbLIZ.append(this.isMemeAudio);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.baseStickerModel.writeToParcel(parcel, i);
        parcel.writeInt(this.isEdited ? 1 : 0);
        parcel.writeInt(this.visible ? 1 : 0);
        parcel.writeFloat(this.alpha);
        parcel.writeInt(this.solidSpace ? 1 : 0);
        parcel.writeInt(this.isMemeAudio ? 1 : 0);
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public int getId() {
        return this.baseStickerModel.getId();
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public InteractStickerStruct getInteractStickerStruct() {
        InteractStickerStruct interactStickerStruct = new InteractStickerStruct();
        interactStickerStruct.setType(102);
        return interactStickerStruct;
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public EnumC1466150oFx getStickerType() {
        return this.baseStickerModel.getType();
    }

    public int hashCode() {
        return (((((((((this.baseStickerModel.hashCode() * 31) + C786410Ut5.Z2(this.isEdited)) * 31) + C786410Ut5.Z2(this.visible)) * 31) + Float.floatToIntBits(this.alpha)) * 31) + C786410Ut5.Z2(this.solidSpace)) * 31) + C786410Ut5.Z2(this.isMemeAudio);
    }

    public final float getAlpha() {
        return this.alpha;
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public BaseStickerModel getBaseModel() {
        return this.baseStickerModel;
    }

    public final BaseStickerModel getBaseStickerModel() {
        return this.baseStickerModel;
    }

    public final boolean getSolidSpace() {
        return this.solidSpace;
    }

    public final boolean getVisible() {
        return this.visible;
    }

    public final boolean isEdited() {
        return this.isEdited;
    }

    public final boolean isMemeAudio() {
        return this.isMemeAudio;
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public StickerModel updateMediaSize(Pair<Integer, Integer> pair) {
        return copy$default(this, BaseStickerModel.copy$default(this.baseStickerModel, 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, pair.getFirst().intValue(), pair.getSecond().intValue(), false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -24577, 15, null), false, false, 0.0f, false, false, 62, null);
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public AbstractC1442160ndG<?> stickerCompileComponent(final Context context, final String str, final C1440500naa c1440500naa, C0FKI c0fki, String str2) {
        return new AbstractC1442160ndG<AICaptionTagStickerModel>(context, str, c1440500naa) { // from class: X.0FRb
            public final Context LIZJ;
            public final String LIZLLL;

            @Override // X.AbstractC1442160ndG
            public final EnumC1466150oFx LIZJ() {
                return EnumC1466150oFx.AI_CAPTION_TAG;
            }

            @Override // X.AbstractC1442160ndG
            public final String LIZ(StickerModel stickerModel) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(this.LIZLLL);
                sbLIZ.append("/ai_caption_sticker/");
                sbLIZ.append(((AICaptionTagStickerModel) stickerModel).getId());
                sbLIZ.append(".png");
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // X.AbstractC1442160ndG
            public final View LIZIZ(StickerModel stickerModel) {
                C1884640z8w c1884640z8w = new C1884640z8w(this.LIZJ);
                c1884640z8w.LIZIZ(((AICaptionTagStickerModel) stickerModel).isEdited(), true);
                return c1884640z8w;
            }

            {
                super(context, c1440500naa);
                this.LIZJ = context;
                this.LIZLLL = str;
            }

            @Override // X.AbstractC1442160ndG
            public final StickerModel LIZLLL(StickerModel stickerModel, int i, int i2) {
                AICaptionTagStickerModel aICaptionTagStickerModel = (AICaptionTagStickerModel) stickerModel;
                return AICaptionTagStickerModel.copy$default(aICaptionTagStickerModel, BaseStickerModel.copy$default(aICaptionTagStickerModel.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, i, i2, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -385, 15, null), false, false, 0.0f, false, false, 62, null);
            }
        };
    }

    public AICaptionTagStickerModel(BaseStickerModel baseStickerModel, boolean z, boolean z2, float f, boolean z3, boolean z4) {
        this.baseStickerModel = baseStickerModel;
        this.isEdited = z;
        this.visible = z2;
        this.alpha = f;
        this.solidSpace = z3;
        this.isMemeAudio = z4;
    }
}
