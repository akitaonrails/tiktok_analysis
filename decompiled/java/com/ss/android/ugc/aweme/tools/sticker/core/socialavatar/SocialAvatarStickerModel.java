package com.ss.android.ugc.aweme.tools.sticker.core.socialavatar;

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
import com.ss.android.ugc.aweme.socialavatar.model.SocialAvatarStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.socialavatar.SocialAvatarStickerModel;
import java.io.Serializable;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public final class SocialAvatarStickerModel implements StickerModel, Serializable {

    @C09CT("base_sticker_model")
    public final BaseStickerModel baseStickerModel;

    @C09CT("expressions")
    public final List<String> expressions;

    @C09CT("high_resolution_url")
    public final List<String> highResolutionUrl;

    @C09CT("sticker_id")
    public final Long id;

    @C09CT("low_resolution_url")
    public final List<String> lowResolutionUrl;

    @C09CT("mid_resolution_url")
    public final List<String> midResolutionUrl;
    public static final Parcelable.Creator<SocialAvatarStickerModel> CREATOR = new Parcelable.Creator<SocialAvatarStickerModel>() { // from class: X.11mA
        @Override // android.os.Parcelable.Creator
        public final SocialAvatarStickerModel createFromParcel(Parcel parcel) {
            Long lValueOf;
            BaseStickerModel baseStickerModelCreateFromParcel = BaseStickerModel.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
            }
            return new SocialAvatarStickerModel(baseStickerModelCreateFromParcel, lValueOf, parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final SocialAvatarStickerModel[] newArray(int i) {
            return new SocialAvatarStickerModel[i];
        }
    };
    public static final int $stable = 8;

    public final SocialAvatarStickerModel copy(BaseStickerModel baseStickerModel, Long l, List<String> list, List<String> list2, List<String> list3, List<String> list4) {
        return new SocialAvatarStickerModel(baseStickerModel, l, list, list2, list3, list4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SocialAvatarStickerModel)) {
            return false;
        }
        SocialAvatarStickerModel socialAvatarStickerModel = (SocialAvatarStickerModel) obj;
        return Intrinsics.LJFF(this.baseStickerModel, socialAvatarStickerModel.baseStickerModel) && Intrinsics.LJFF(this.id, socialAvatarStickerModel.id) && Intrinsics.LJFF(this.expressions, socialAvatarStickerModel.expressions) && Intrinsics.LJFF(this.lowResolutionUrl, socialAvatarStickerModel.lowResolutionUrl) && Intrinsics.LJFF(this.midResolutionUrl, socialAvatarStickerModel.midResolutionUrl) && Intrinsics.LJFF(this.highResolutionUrl, socialAvatarStickerModel.highResolutionUrl);
    }

    public int hashCode() {
        int iHashCode = this.baseStickerModel.hashCode() * 31;
        Long l = this.id;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        List<String> list = this.expressions;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.lowResolutionUrl;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<String> list3 = this.midResolutionUrl;
        int iHashCode5 = (iHashCode4 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<String> list4 = this.highResolutionUrl;
        return iHashCode5 + (list4 != null ? list4.hashCode() : 0);
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
        sbLIZ.append("SocialAvatarStickerModel(baseStickerModel=");
        sbLIZ.append(this.baseStickerModel);
        sbLIZ.append(", id=");
        sbLIZ.append(this.id);
        sbLIZ.append(", expressions=");
        sbLIZ.append(this.expressions);
        sbLIZ.append(", lowResolutionUrl=");
        sbLIZ.append(this.lowResolutionUrl);
        sbLIZ.append(", midResolutionUrl=");
        sbLIZ.append(this.midResolutionUrl);
        sbLIZ.append(", highResolutionUrl=");
        sbLIZ.append(this.highResolutionUrl);
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
        Long l = this.id;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeStringList(this.expressions);
        parcel.writeStringList(this.lowResolutionUrl);
        parcel.writeStringList(this.midResolutionUrl);
        parcel.writeStringList(this.highResolutionUrl);
    }

    public SocialAvatarStickerModel() {
        this(new BaseStickerModel(0, 0, EnumC1466150oFx.SOCIAL_AVATAR, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -5, 15, null), null, null, null, null, null);
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public int getId() {
        return this.baseStickerModel.getId();
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public InteractStickerStruct getInteractStickerStruct() {
        C19591311kt.LIZ.getClass();
        InteractStickerStruct interactStickerStructLIZLLL = C19591311kt.LIZLLL(this, true);
        interactStickerStructLIZLLL.setSocialAvatarStickerStruct(new SocialAvatarStickerStruct(this.id, this.expressions, this.lowResolutionUrl, this.midResolutionUrl, this.highResolutionUrl));
        return interactStickerStructLIZLLL;
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public EnumC1466150oFx getStickerType() {
        return this.baseStickerModel.getType();
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public BaseStickerModel getBaseModel() {
        return this.baseStickerModel;
    }

    public final BaseStickerModel getBaseStickerModel() {
        return this.baseStickerModel;
    }

    public final List<String> getExpressions() {
        return this.expressions;
    }

    public final List<String> getHighResolutionUrl() {
        return this.highResolutionUrl;
    }

    public final List<String> getLowResolutionUrl() {
        return this.lowResolutionUrl;
    }

    public final List<String> getMidResolutionUrl() {
        return this.midResolutionUrl;
    }

    /* JADX INFO: renamed from: getId, reason: collision with other method in class */
    public final Long m330getId() {
        return this.id;
    }

    public SocialAvatarStickerModel(BaseStickerModel baseStickerModel, Long l, List<String> list, List<String> list2, List<String> list3, List<String> list4) {
        this.baseStickerModel = baseStickerModel;
        this.id = l;
        this.expressions = list;
        this.lowResolutionUrl = list2;
        this.midResolutionUrl = list3;
        this.highResolutionUrl = list4;
    }
}
