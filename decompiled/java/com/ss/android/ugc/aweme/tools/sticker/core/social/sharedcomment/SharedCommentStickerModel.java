package com.ss.android.ugc.aweme.tools.sticker.core.social.sharedcomment;

import X.AbstractC1442160ndG;
import X.C09CT;
import X.C0FKI;
import X.C13LP;
import X.C1440500naa;
import X.C19591311kt;
import X.C19610111nv;
import X.C2188811AlT;
import X.EnumC1466150oFx;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.model.SharedCommentStickerStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.social.sharedcomment.SharedCommentStickerModel;
import java.io.Serializable;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public final class SharedCommentStickerModel implements StickerModel, Parcelable, Serializable {

    @C09CT("base_sticker_model")
    public final BaseStickerModel baseStickerModel;

    @C09CT("comment_model")
    public final CommentVideoModel commentModel;
    public static final C19610111nv Companion = new Object() { // from class: X.11nv
    };
    public static final Parcelable.Creator<SharedCommentStickerModel> CREATOR = new Parcelable.Creator<SharedCommentStickerModel>() { // from class: X.11ns
        @Override // android.os.Parcelable.Creator
        public final SharedCommentStickerModel createFromParcel(Parcel parcel) {
            return new SharedCommentStickerModel(BaseStickerModel.CREATOR.createFromParcel(parcel), (CommentVideoModel) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final SharedCommentStickerModel[] newArray(int i) {
            return new SharedCommentStickerModel[i];
        }
    };
    public static final int $stable = 8;

    public SharedCommentStickerModel() {
        this(new BaseStickerModel(0, 0, EnumC1466150oFx.SHARED_COMMENT, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -5, 15, null), null);
    }

    public final SharedCommentStickerModel copy(BaseStickerModel baseStickerModel, CommentVideoModel commentVideoModel) {
        return new SharedCommentStickerModel(baseStickerModel, commentVideoModel);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SharedCommentStickerModel)) {
            return false;
        }
        SharedCommentStickerModel sharedCommentStickerModel = (SharedCommentStickerModel) obj;
        return Intrinsics.LJFF(this.baseStickerModel, sharedCommentStickerModel.baseStickerModel) && Intrinsics.LJFF(this.commentModel, sharedCommentStickerModel.commentModel);
    }

    public int hashCode() {
        int iHashCode = this.baseStickerModel.hashCode() * 31;
        CommentVideoModel commentVideoModel = this.commentModel;
        return iHashCode + (commentVideoModel == null ? 0 : commentVideoModel.hashCode());
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
        sbLIZ.append("SharedCommentStickerModel(baseStickerModel=");
        sbLIZ.append(this.baseStickerModel);
        sbLIZ.append(", commentModel=");
        sbLIZ.append(this.commentModel);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.baseStickerModel.writeToParcel(parcel, i);
        parcel.writeSerializable(this.commentModel);
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public int getId() {
        return this.baseStickerModel.getId();
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public InteractStickerStruct getInteractStickerStruct() {
        String uri;
        String commentId;
        String userId;
        List<UrlModel> imageList;
        UrlModel urlModel;
        List<String> urlList;
        CommentVideoModel commentVideoModel = this.commentModel;
        if (commentVideoModel == null || (imageList = commentVideoModel.getImageList()) == null || (urlModel = (UrlModel) C13LP.LJJJLL(imageList)) == null || ((((urlList = urlModel.getUrlList()) == null || (uri = (String) C13LP.LJJJLL(urlList)) == null) && (uri = urlModel.getUri()) == null) || uri.length() <= 0)) {
            uri = null;
        }
        C19591311kt.LIZ.getClass();
        InteractStickerStruct interactStickerStructLIZLLL = C19591311kt.LIZLLL(this, false);
        CommentVideoModel commentVideoModel2 = this.commentModel;
        String str = "";
        if (commentVideoModel2 == null || (commentId = commentVideoModel2.getCommentId()) == null) {
            commentId = "";
        }
        CommentVideoModel commentVideoModel3 = this.commentModel;
        if (commentVideoModel3 != null && (userId = commentVideoModel3.getUserId()) != null) {
            str = userId;
        }
        interactStickerStructLIZLLL.setSharedCommentStickerStruct(new SharedCommentStickerStruct(commentId, str, uri));
        return interactStickerStructLIZLLL;
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public EnumC1466150oFx getStickerType() {
        return this.baseStickerModel.getType();
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public boolean isNotEmptyModel() {
        return this.commentModel != null;
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public BaseStickerModel getBaseModel() {
        return this.baseStickerModel;
    }

    public final BaseStickerModel getBaseStickerModel() {
        return this.baseStickerModel;
    }

    public final CommentVideoModel getCommentModel() {
        return this.commentModel;
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public StickerModel updateMediaSize(Pair<Integer, Integer> pair) {
        return copy(BaseStickerModel.copy$default(this.baseStickerModel, 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, pair.getFirst().intValue(), pair.getSecond().intValue(), false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -24577, 15, null), this.commentModel);
    }

    public SharedCommentStickerModel(BaseStickerModel baseStickerModel, CommentVideoModel commentVideoModel) {
        this.baseStickerModel = baseStickerModel;
        this.commentModel = commentVideoModel;
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public AbstractC1442160ndG<?> stickerCompileComponent(Context context, String str, C1440500naa c1440500naa, C0FKI c0fki, String str2) {
        ISharedCommentStickerComponentProvider iSharedCommentStickerComponentProvider = (ISharedCommentStickerComponentProvider) PluggableExtentionKt.pluggableSpi$default(ISharedCommentStickerComponentProvider.class, false, false, false, 14, null);
        if (iSharedCommentStickerComponentProvider != null) {
            return iSharedCommentStickerComponentProvider.LIZJ(context, str, c1440500naa);
        }
        return null;
    }
}
