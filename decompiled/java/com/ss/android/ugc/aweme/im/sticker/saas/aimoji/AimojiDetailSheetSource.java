package com.ss.android.ugc.aweme.im.sticker.saas.aimoji;

import X.C0HK0;
import X.C0IBD;
import X.C2097908Jt;
import X.C441280HSc;
import X.C454730HsN;
import X.C461720I8s;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.common.model.StickerBase;
import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import com.ss.android.ugc.aweme.im.common.model.StickerVariant;
import com.ss.android.ugc.aweme.im.message.template.card.StickerTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.AvatarDuoInfoComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import com.ss.android.ugc.aweme.im.message.template.component.MixStudioComponent;
import com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi;
import com.ss.android.ugc.aweme.im.sticker.saas.aimoji.AimojiDetailSheetSource;
import com.ss.android.ugc.aweme.model.IMSocialAvatarStatus;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class AimojiDetailSheetSource implements Parcelable {
    public final long aimojiId;
    public final AvatarDuoInfoComponent avatarDuoComponent;
    public final int createScene;
    public final String expression;
    public final boolean isAnimated;
    public final MixStudioComponent mixStudioInfo;
    public final Long originalSetId;
    public final Long originalStickerId;
    public final long ownerId;
    public final String senderUid;
    public final String typingRecommendationId;
    public final String uri;
    public final List<String> urlList;
    public static final C454730HsN Companion = new Object() { // from class: X.0HsN
        public static AimojiDetailSheetSource LIZ(StickerTemplate stickerTemplate, String str) {
            long jLongValue;
            boolean z;
            Long lValueOf;
            Long lValueOf2;
            long j;
            Long lLJIILIIL;
            C454640HsE c454640HsE = IMStickerApi.LIZ;
            C454740HsO c454740HsOLIZIZ = c454640HsE.LIZIZ().getImStickerMessageService().LIZIZ(stickerTemplate);
            Long lLJIJ = c454640HsE.LIZIZ().getImStickerMessageService().LJIJ(stickerTemplate);
            long jLongValue2 = 0;
            if (lLJIJ != null) {
                jLongValue = lLJIJ.longValue();
            } else {
                jLongValue = 0;
            }
            int i = stickerTemplate.stickerVariant;
            StickerVariant.Companion.getClass();
            if (i == 2) {
                z = true;
            } else {
                z = false;
            }
            ImageComponent imageComponent = stickerTemplate.imageComponent;
            List<String> list = imageComponent.urls;
            String str2 = imageComponent.id;
            String str3 = stickerTemplate.baseRequestComponent.queryData.extras.get("a:sticker_creator_user_id");
            if (str3 != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str3)) != null) {
                jLongValue2 = lLJIILIIL.longValue();
            }
            String str4 = stickerTemplate.baseRequestComponent.queryData.extras.get("a:avatar_expression");
            String str5 = null;
            if (c454740HsOLIZIZ != null) {
                lValueOf = Long.valueOf(c454740HsOLIZIZ.LIZIZ);
                j = c454740HsOLIZIZ.LIZ;
            } else {
                lValueOf = null;
                MixStudioComponent mixStudioComponent = stickerTemplate.mixStudioInfoComponent;
                if (mixStudioComponent != null) {
                    j = mixStudioComponent.materialStickerId;
                } else {
                    lValueOf2 = null;
                    return new AimojiDetailSheetSource(jLongValue, list, str2, jLongValue2, z, stickerTemplate.stickerCreateScene, str4, lValueOf, lValueOf2, str5, stickerTemplate.mixStudioInfoComponent, stickerTemplate.avatarDuoInfoComponent, str);
                }
            }
            lValueOf2 = Long.valueOf(j);
            if (c454740HsOLIZIZ != null) {
                str5 = c454740HsOLIZIZ.LIZJ;
            }
            return new AimojiDetailSheetSource(jLongValue, list, str2, jLongValue2, z, stickerTemplate.stickerCreateScene, str4, lValueOf, lValueOf2, str5, stickerTemplate.mixStudioInfoComponent, stickerTemplate.avatarDuoInfoComponent, str);
        }
    };
    public static final Parcelable.Creator<AimojiDetailSheetSource> CREATOR = new Parcelable.Creator<AimojiDetailSheetSource>() { // from class: X.0HsP
        @Override // android.os.Parcelable.Creator
        public final AimojiDetailSheetSource createFromParcel(Parcel parcel) {
            boolean z;
            Long lValueOf;
            long j = parcel.readLong();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            String string = parcel.readString();
            long j2 = parcel.readLong();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            int i = parcel.readInt();
            String string2 = parcel.readString();
            Long lValueOf2 = null;
            if (parcel.readInt() == 0) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
            }
            if (parcel.readInt() != 0) {
                lValueOf2 = Long.valueOf(parcel.readLong());
            }
            return new AimojiDetailSheetSource(j, arrayListCreateStringArrayList, string, j2, z, i, string2, lValueOf, lValueOf2, parcel.readString(), (MixStudioComponent) parcel.readParcelable(AimojiDetailSheetSource.class.getClassLoader()), (AvatarDuoInfoComponent) parcel.readParcelable(AimojiDetailSheetSource.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AimojiDetailSheetSource[] newArray(int i) {
            return new AimojiDetailSheetSource[i];
        }
    };

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AimojiDetailSheetSource)) {
            return false;
        }
        AimojiDetailSheetSource aimojiDetailSheetSource = (AimojiDetailSheetSource) obj;
        return this.aimojiId == aimojiDetailSheetSource.aimojiId && Intrinsics.LJFF(this.urlList, aimojiDetailSheetSource.urlList) && Intrinsics.LJFF(this.uri, aimojiDetailSheetSource.uri) && this.ownerId == aimojiDetailSheetSource.ownerId && this.isAnimated == aimojiDetailSheetSource.isAnimated && this.createScene == aimojiDetailSheetSource.createScene && Intrinsics.LJFF(this.expression, aimojiDetailSheetSource.expression) && Intrinsics.LJFF(this.originalSetId, aimojiDetailSheetSource.originalSetId) && Intrinsics.LJFF(this.originalStickerId, aimojiDetailSheetSource.originalStickerId) && Intrinsics.LJFF(this.typingRecommendationId, aimojiDetailSheetSource.typingRecommendationId) && Intrinsics.LJFF(this.mixStudioInfo, aimojiDetailSheetSource.mixStudioInfo) && Intrinsics.LJFF(this.avatarDuoComponent, aimojiDetailSheetSource.avatarDuoComponent) && Intrinsics.LJFF(this.senderUid, aimojiDetailSheetSource.senderUid);
    }

    public final int hashCode() {
        int iY2 = ((C786410Ut5.Y2(this.aimojiId) * 31) + this.urlList.hashCode()) * 31;
        String str = this.uri;
        int iHashCode = (((((((iY2 + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Y2(this.ownerId)) * 31) + C786410Ut5.Z2(this.isAnimated)) * 31) + this.createScene) * 31;
        String str2 = this.expression;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.originalSetId;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.originalStickerId;
        int iHashCode4 = (iHashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str3 = this.typingRecommendationId;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        MixStudioComponent mixStudioComponent = this.mixStudioInfo;
        int iHashCode6 = (iHashCode5 + (mixStudioComponent == null ? 0 : mixStudioComponent.hashCode())) * 31;
        AvatarDuoInfoComponent avatarDuoInfoComponent = this.avatarDuoComponent;
        int iHashCode7 = (iHashCode6 + (avatarDuoInfoComponent == null ? 0 : avatarDuoInfoComponent.hashCode())) * 31;
        String str4 = this.senderUid;
        return iHashCode7 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        return "AimojiDetailSheetSource(aimojiId=" + this.aimojiId + ", urlList=" + this.urlList + ", uri=" + this.uri + ", ownerId=" + this.ownerId + ", isAnimated=" + this.isAnimated + ", createScene=" + this.createScene + ", expression=" + this.expression + ", originalSetId=" + this.originalSetId + ", originalStickerId=" + this.originalStickerId + ", typingRecommendationId=" + this.typingRecommendationId + ", mixStudioInfo=" + this.mixStudioInfo + ", avatarDuoComponent=" + this.avatarDuoComponent + ", senderUid=" + this.senderUid + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.aimojiId);
        parcel.writeStringList(this.urlList);
        parcel.writeString(this.uri);
        parcel.writeLong(this.ownerId);
        parcel.writeInt(this.isAnimated ? 1 : 0);
        parcel.writeInt(this.createScene);
        parcel.writeString(this.expression);
        Long l = this.originalSetId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Long l2 = this.originalStickerId;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        parcel.writeString(this.typingRecommendationId);
        parcel.writeParcelable(this.mixStudioInfo, i);
        parcel.writeParcelable(this.avatarDuoComponent, i);
        parcel.writeString(this.senderUid);
    }

    public final boolean LIZIZ() {
        return this.createScene == C0IBD.StickerCreateScene_AvatarDUO.getValue();
    }

    public final Map<String, String> LIZ() {
        return C2097908Jt.LIZJ(new Pair("is_studio_generated", (C441280HSc.LIZ() && this.createScene == C0IBD.StickerCreateScene_ImagineStudio.getValue()) ? "1" : CardStruct.IStatusCode.DEFAULT));
    }

    public final boolean LIZJ() {
        List<Long> list;
        if (!LIZIZ()) {
            return this.ownerId == C461720I8s.LIZJ();
        }
        AvatarDuoInfoComponent avatarDuoInfoComponent = this.avatarDuoComponent;
        return (avatarDuoInfoComponent == null || (list = avatarDuoInfoComponent.userIdList) == null || !list.contains(Long.valueOf(C461720I8s.LIZJ()))) ? false : true;
    }

    public final StickerItem LIZLLL(String str) {
        C0HK0 c0hk0;
        IMSocialAvatarStatus value = IMStickerApi.LIZ.LIZIZ().getImSocialAvatarService().LJJLI(str, false).getValue();
        StickerItem stickerItem = null;
        if (!(value instanceof C0HK0) || (c0hk0 = (C0HK0) value) == null) {
            return null;
        }
        Iterator<StickerItem> it2 = c0hk0.getStickers().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            StickerItem next = it2.next();
            StickerBase stickerBase = next.stickerBase;
            if (stickerBase != null) {
                Long l = stickerBase.id;
                long j = this.aimojiId;
                if (l != null && l.longValue() == j) {
                    stickerItem = next;
                    break;
                }
            }
        }
        return stickerItem;
    }

    public AimojiDetailSheetSource(long j, List<String> list, String str, long j2, boolean z, int i, String str2, Long l, Long l2, String str3, MixStudioComponent mixStudioComponent, AvatarDuoInfoComponent avatarDuoInfoComponent, String str4) {
        this.aimojiId = j;
        this.urlList = list;
        this.uri = str;
        this.ownerId = j2;
        this.isAnimated = z;
        this.createScene = i;
        this.expression = str2;
        this.originalSetId = l;
        this.originalStickerId = l2;
        this.typingRecommendationId = str3;
        this.mixStudioInfo = mixStudioComponent;
        this.avatarDuoComponent = avatarDuoInfoComponent;
        this.senderUid = str4;
    }
}
