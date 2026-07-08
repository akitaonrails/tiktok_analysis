package com.ss.android.ugc.aweme.tools.sticker.core.hashtag.embed;

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
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.sticker.data.HashtagStruct;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.hashtag.embed.EmbedHashTagStickerModel;
import java.io.Serializable;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes30.dex */
public final class EmbedHashTagStickerModel implements StickerModel, Parcelable, Serializable {

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
    public static final Parcelable.Creator<EmbedHashTagStickerModel> CREATOR = new Parcelable.Creator<EmbedHashTagStickerModel>() { // from class: X.11ki
        @Override // android.os.Parcelable.Creator
        public final EmbedHashTagStickerModel createFromParcel(Parcel parcel) {
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
            return new EmbedHashTagStickerModel(baseStickerModelCreateFromParcel, j, string, z, z2, z3);
        }

        @Override // android.os.Parcelable.Creator
        public final EmbedHashTagStickerModel[] newArray(int i) {
            return new EmbedHashTagStickerModel[i];
        }
    };
    public static final int $stable = 8;

    public EmbedHashTagStickerModel() {
        this(new BaseStickerModel(0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -1, 15, null), 0L, "", false, false, true);
    }

    public final EmbedHashTagStickerModel copy(BaseStickerModel baseStickerModel, long j, String str, boolean z, boolean z2, boolean z3) {
        return new EmbedHashTagStickerModel(baseStickerModel, j, str, z, z2, z3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EmbedHashTagStickerModel)) {
            return false;
        }
        EmbedHashTagStickerModel embedHashTagStickerModel = (EmbedHashTagStickerModel) obj;
        return Intrinsics.LJFF(this.baseStickerModel, embedHashTagStickerModel.baseStickerModel) && this.hashtagId == embedHashTagStickerModel.hashtagId && Intrinsics.LJFF(this.contentText, embedHashTagStickerModel.contentText) && this.editable == embedHashTagStickerModel.editable && this.clickable == embedHashTagStickerModel.clickable && this.visible == embedHashTagStickerModel.visible;
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
        return true;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EmbedHashTagStickerModel(baseStickerModel=");
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
        interactStickerStructLIZLLL.setNoGlobal(true);
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

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public AbstractC1442160ndG<?> stickerCompileComponent(final Context context, String str, final C1440500naa c1440500naa, C0FKI c0fki, String str2) {
        return new AbstractC1442160ndG<EmbedHashTagStickerModel>(context, c1440500naa) { // from class: X.11kk
            public final Context LIZJ;

            @Override // X.AbstractC1442160ndG
            public final EnumC1466150oFx LIZJ() {
                return EnumC1466150oFx.PICTURE_HASHTAG_EMBED;
            }

            @Override // X.AbstractC1442160ndG
            public final String LIZ(StickerModel stickerModel) {
                return ((EmbedHashTagStickerModel) stickerModel).getBaseStickerModel().getCompilePath();
            }

            @Override // X.AbstractC1442160ndG
            public final View LIZIZ(StickerModel stickerModel) {
                if (this.LIZJ instanceof C19EG) {
                    C19584311jl c19584311jl = new C19584311jl(14, this.LIZJ, null);
                    c19584311jl.LIZIZ((LifecycleOwner) this.LIZJ, new C1664680tQA(stickerModel));
                    return c19584311jl;
                }
                return new View(this.LIZJ);
            }

            {
                super(context, c1440500naa);
                this.LIZJ = context;
            }

            @Override // X.AbstractC1442160ndG
            public final StickerModel LIZLLL(StickerModel stickerModel, int i, int i2) {
                EmbedHashTagStickerModel embedHashTagStickerModel = (EmbedHashTagStickerModel) stickerModel;
                return embedHashTagStickerModel.copy(BaseStickerModel.copy$default(embedHashTagStickerModel.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, i, i2, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -385, 15, null), embedHashTagStickerModel.hashtagId, embedHashTagStickerModel.contentText, embedHashTagStickerModel.editable, embedHashTagStickerModel.clickable, embedHashTagStickerModel.visible);
            }
        };
    }

    public EmbedHashTagStickerModel(BaseStickerModel baseStickerModel, long j, String str, boolean z, boolean z2, boolean z3) {
        this.baseStickerModel = baseStickerModel;
        this.hashtagId = j;
        this.contentText = str;
        this.editable = z;
        this.clickable = z2;
        this.visible = z3;
    }
}
