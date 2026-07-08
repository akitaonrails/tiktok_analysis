package com.ss.android.ugc.aweme.socialavatar.network;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.socialavatar.network.SocialAvatarCreationRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SocialAvatarCreationRequest implements Parcelable {

    @C09CT("conversation_id")
    public final String conversationId;

    @C09CT("conversation_type")
    public final Integer conversationType;

    @C09CT("image_info")
    public final List<SocialAvatarImageInfo> imageInfo;

    @C09CT("regenerate")
    public final Boolean regenerate;

    @C09CT("source")
    public final Integer source;

    @C09CT("story_id")
    public final Long storyId;
    public static final Parcelable.Creator<SocialAvatarCreationRequest> CREATOR = new Parcelable.Creator<SocialAvatarCreationRequest>() { // from class: X.02yn
        @Override // android.os.Parcelable.Creator
        public final SocialAvatarCreationRequest createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Integer numValueOf;
            Integer numValueOf2;
            Long lValueOf;
            boolean z = false;
            Boolean boolValueOf = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readSerializable());
                }
            }
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf2 = null;
            } else {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
            }
            if (parcel.readInt() != 0) {
                if (parcel.readInt() != 0) {
                    z = true;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            return new SocialAvatarCreationRequest(arrayList, numValueOf, string, numValueOf2, lValueOf, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final SocialAvatarCreationRequest[] newArray(int i) {
            return new SocialAvatarCreationRequest[i];
        }
    };
    public static final int $stable = 8;

    public final SocialAvatarCreationRequest copy(List<SocialAvatarImageInfo> list, Integer num, String str, Integer num2, Long l, Boolean bool) {
        return new SocialAvatarCreationRequest(list, num, str, num2, l, bool);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SocialAvatarCreationRequest)) {
            return false;
        }
        SocialAvatarCreationRequest socialAvatarCreationRequest = (SocialAvatarCreationRequest) obj;
        return Intrinsics.LJFF(this.imageInfo, socialAvatarCreationRequest.imageInfo) && Intrinsics.LJFF(this.source, socialAvatarCreationRequest.source) && Intrinsics.LJFF(this.conversationId, socialAvatarCreationRequest.conversationId) && Intrinsics.LJFF(this.conversationType, socialAvatarCreationRequest.conversationType) && Intrinsics.LJFF(this.storyId, socialAvatarCreationRequest.storyId) && Intrinsics.LJFF(this.regenerate, socialAvatarCreationRequest.regenerate);
    }

    public int hashCode() {
        List<SocialAvatarImageInfo> list = this.imageInfo;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.source;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.conversationId;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.conversationType;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l = this.storyId;
        int iHashCode5 = (iHashCode4 + (l == null ? 0 : l.hashCode())) * 31;
        Boolean bool = this.regenerate;
        return iHashCode5 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SocialAvatarCreationRequest(imageInfo=");
        sbLIZ.append(this.imageInfo);
        sbLIZ.append(", source=");
        sbLIZ.append(this.source);
        sbLIZ.append(", conversationId=");
        sbLIZ.append(this.conversationId);
        sbLIZ.append(", conversationType=");
        sbLIZ.append(this.conversationType);
        sbLIZ.append(", storyId=");
        sbLIZ.append(this.storyId);
        sbLIZ.append(", regenerate=");
        sbLIZ.append(this.regenerate);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<SocialAvatarImageInfo> list = this.imageInfo;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<SocialAvatarImageInfo> it2 = list.iterator();
            while (it2.hasNext()) {
                parcel.writeSerializable(it2.next());
            }
        }
        Integer num = this.source;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.conversationId);
        Integer num2 = this.conversationType;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Long l = this.storyId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Boolean bool = this.regenerate;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
    }

    public final String getConversationId() {
        return this.conversationId;
    }

    public final Integer getConversationType() {
        return this.conversationType;
    }

    public final List<SocialAvatarImageInfo> getImageInfo() {
        return this.imageInfo;
    }

    public final Boolean getRegenerate() {
        return this.regenerate;
    }

    public final Integer getSource() {
        return this.source;
    }

    public final Long getStoryId() {
        return this.storyId;
    }

    public SocialAvatarCreationRequest(List<SocialAvatarImageInfo> list, Integer num, String str, Integer num2, Long l, Boolean bool) {
        this.imageInfo = list;
        this.source = num;
        this.conversationId = str;
        this.conversationType = num2;
        this.storyId = l;
        this.regenerate = bool;
    }
}
