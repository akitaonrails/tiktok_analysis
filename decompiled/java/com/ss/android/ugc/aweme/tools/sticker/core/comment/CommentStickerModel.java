package com.ss.android.ugc.aweme.tools.sticker.core.comment;

import X.AbstractC1442160ndG;
import X.C09CT;
import X.C0FKI;
import X.C1440500naa;
import X.C19591311kt;
import X.C19598511m3;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C786410Ut5;
import X.EnumC1466150oFx;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.comment.CommentStickerModel;
import java.io.Serializable;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class CommentStickerModel implements StickerModel, Parcelable, Serializable {

    @C09CT("alpha")
    public final float alpha;

    @C09CT("base_sticker_model")
    public final BaseStickerModel baseStickerModel;

    @C09CT("comment_sticker_model")
    public final CommentVideoModel commentStickerModel;

    @C09CT("is_comment_deleted")
    public boolean isCommentDeleted;

    @C09CT("visible")
    public final boolean visible;
    public static final Parcelable.Creator<CommentStickerModel> CREATOR = new Parcelable.Creator<CommentStickerModel>() { // from class: X.0oGB
        @Override // android.os.Parcelable.Creator
        public final CommentStickerModel createFromParcel(Parcel parcel) {
            boolean z;
            BaseStickerModel baseStickerModelCreateFromParcel = BaseStickerModel.CREATOR.createFromParcel(parcel);
            CommentVideoModel commentVideoModel = (CommentVideoModel) parcel.readSerializable();
            float f = parcel.readFloat();
            boolean z2 = false;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            }
            return new CommentStickerModel(baseStickerModelCreateFromParcel, commentVideoModel, f, z, z2);
        }

        @Override // android.os.Parcelable.Creator
        public final CommentStickerModel[] newArray(int i) {
            return new CommentStickerModel[i];
        }
    };
    public static final int $stable = 8;

    public final CommentStickerModel copy(BaseStickerModel baseStickerModel, CommentVideoModel commentVideoModel, float f, boolean z, boolean z2) {
        return new CommentStickerModel(baseStickerModel, commentVideoModel, f, z, z2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommentStickerModel)) {
            return false;
        }
        CommentStickerModel commentStickerModel = (CommentStickerModel) obj;
        return Intrinsics.LJFF(this.baseStickerModel, commentStickerModel.baseStickerModel) && Intrinsics.LJFF(this.commentStickerModel, commentStickerModel.commentStickerModel) && Float.compare(this.alpha, commentStickerModel.alpha) == 0 && this.visible == commentStickerModel.visible && this.isCommentDeleted == commentStickerModel.isCommentDeleted;
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
        sbLIZ.append("CommentStickerModel(baseStickerModel=");
        sbLIZ.append(this.baseStickerModel);
        sbLIZ.append(", commentStickerModel=");
        sbLIZ.append(this.commentStickerModel);
        sbLIZ.append(", alpha=");
        sbLIZ.append(this.alpha);
        sbLIZ.append(", visible=");
        sbLIZ.append(this.visible);
        sbLIZ.append(", isCommentDeleted=");
        sbLIZ.append(this.isCommentDeleted);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.baseStickerModel.writeToParcel(parcel, i);
        parcel.writeSerializable(this.commentStickerModel);
        parcel.writeFloat(this.alpha);
        parcel.writeInt(this.visible ? 1 : 0);
        parcel.writeInt(this.isCommentDeleted ? 1 : 0);
    }

    public CommentStickerModel() {
        this(new BaseStickerModel(0, 0, EnumC1466150oFx.COMMENT, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -5, 15, null), null, 1.0f, true, false);
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public int getId() {
        return this.baseStickerModel.getId();
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public InteractStickerStruct getInteractStickerStruct() {
        C19591311kt.LIZ.getClass();
        InteractStickerStruct interactStickerStructLIZLLL = C19591311kt.LIZLLL(this, true);
        interactStickerStructLIZLLL.setAttr(GsonProtectorUtils.toJson(C19598511m3.LIZ(), C2097908Jt.LIZJ(new Pair("comment_sticker_id", CardStruct.IStatusCode.DEFAULT))));
        return interactStickerStructLIZLLL;
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public EnumC1466150oFx getStickerType() {
        return this.baseStickerModel.getType();
    }

    public int hashCode() {
        int iHashCode = this.baseStickerModel.hashCode() * 31;
        CommentVideoModel commentVideoModel = this.commentStickerModel;
        return ((((((iHashCode + (commentVideoModel == null ? 0 : commentVideoModel.hashCode())) * 31) + Float.floatToIntBits(this.alpha)) * 31) + C786410Ut5.Z2(this.visible)) * 31) + C786410Ut5.Z2(this.isCommentDeleted);
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public boolean isNotEmptyModel() {
        return this.commentStickerModel != null;
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

    public final CommentVideoModel getCommentStickerModel() {
        return this.commentStickerModel;
    }

    public final boolean getVisible() {
        return this.visible;
    }

    public final boolean isCommentDeleted() {
        return this.isCommentDeleted;
    }

    public final void setCommentDeleted(boolean z) {
        this.isCommentDeleted = z;
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public StickerModel updateMediaSize(Pair<Integer, Integer> pair) {
        return copy(BaseStickerModel.copy$default(this.baseStickerModel, 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, pair.getFirst().intValue(), pair.getSecond().intValue(), false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -24577, 15, null), this.commentStickerModel, this.alpha, this.visible, this.isCommentDeleted);
    }

    public CommentStickerModel(BaseStickerModel baseStickerModel, CommentVideoModel commentVideoModel, float f, boolean z, boolean z2) {
        this.baseStickerModel = baseStickerModel;
        this.commentStickerModel = commentVideoModel;
        this.alpha = f;
        this.visible = z;
        this.isCommentDeleted = z2;
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public AbstractC1442160ndG<?> stickerCompileComponent(final Context context, final String str, final C1440500naa c1440500naa, C0FKI c0fki, String str2) {
        return new AbstractC1442160ndG<CommentStickerModel>(context, str, c1440500naa) { // from class: X.0oGF
            public final Context LIZJ;
            public final String LIZLLL;

            @Override // X.AbstractC1442160ndG
            public final EnumC1466150oFx LIZJ() {
                return EnumC1466150oFx.COMMENT;
            }

            @Override // X.AbstractC1442160ndG
            public final String LIZ(StickerModel stickerModel) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(this.LIZLLL);
                sbLIZ.append("/comment_sticker/");
                sbLIZ.append(((CommentStickerModel) stickerModel).getId());
                sbLIZ.append(".png");
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // X.AbstractC1442160ndG
            public final View LIZIZ(StickerModel stickerModel) throws Throwable {
                C19611011o4 c19611011o4 = new C19611011o4(this.LIZJ);
                CommentVideoModel commentStickerModel = ((CommentStickerModel) stickerModel).getCommentStickerModel();
                if (commentStickerModel != null) {
                    c19611011o4.LIZIZ(commentStickerModel);
                    C23250099c.LJ(C23271099x.INSTANCE, new C2351009Jc(commentStickerModel, c19611011o4, null));
                }
                return c19611011o4;
            }

            {
                super(context, c1440500naa);
                this.LIZJ = context;
                this.LIZLLL = str;
            }

            @Override // X.AbstractC1442160ndG
            public final StickerModel LIZLLL(StickerModel stickerModel, int i, int i2) {
                CommentStickerModel commentStickerModel = (CommentStickerModel) stickerModel;
                return commentStickerModel.copy(BaseStickerModel.copy$default(commentStickerModel.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, i, i2, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -385, 15, null), commentStickerModel.commentStickerModel, commentStickerModel.alpha, commentStickerModel.visible, commentStickerModel.isCommentDeleted);
            }
        };
    }
}
