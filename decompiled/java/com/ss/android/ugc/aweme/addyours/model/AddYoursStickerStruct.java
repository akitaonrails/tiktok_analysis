package com.ss.android.ugc.aweme.addyours.model;

import X.C09CT;
import X.C0ODA;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.addyours.model.AddYoursAvatar;
import com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class AddYoursStickerStruct implements Parcelable, Serializable {

    @C09CT("add_yours_invitees")
    public List<Long> addYoursInvitees;

    @C09CT("eoy_campaign")
    public Boolean eoyCampaign;

    @C09CT("eoy_campaign_schema")
    public String eoyCampaignSchema;

    @C09CT("font_size")
    public float fontSize;

    @C09CT("from_item_id")
    public Long fromItemId;

    @C09CT("from_question")
    public Boolean fromQuestion;

    @C09CT("shoot_from")
    public Integer shootFrom;

    @C09CT("text")
    public String text;
    public long timeStamp;

    @C09CT("topic_id")
    public Long topicId;

    @C09CT("topic_type")
    public int topicType;

    @C09CT("user_avatars")
    public List<AddYoursAvatar> userAvatars;

    @C09CT("videos_count")
    public Long videoCount;

    @C09CT("viewer_is_invited")
    public Boolean viewerInvited;
    public static final C0ODA Companion = new Object() { // from class: X.0ODA
    };
    public static final Parcelable.Creator<AddYoursStickerStruct> CREATOR = new Parcelable.Creator<AddYoursStickerStruct>() { // from class: X.02pO
        @Override // android.os.Parcelable.Creator
        public final AddYoursStickerStruct createFromParcel(Parcel parcel) {
            Long lValueOf;
            Long lValueOf2;
            Integer numValueOf;
            ArrayList arrayList;
            Long lValueOf3;
            boolean z;
            Boolean boolValueOf;
            ArrayList arrayList2;
            boolean z2;
            Boolean boolValueOf2;
            Boolean boolValueOf3 = null;
            if (parcel.readInt() == 0) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
            }
            if (parcel.readInt() == 0) {
                lValueOf2 = null;
            } else {
                lValueOf2 = Long.valueOf(parcel.readLong());
            }
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            boolean z3 = false;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(AddYoursAvatar.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                lValueOf3 = null;
            } else {
                lValueOf3 = Long.valueOf(parcel.readLong());
            }
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i3 = parcel.readInt();
                arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(Long.valueOf(parcel.readLong()));
                }
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolValueOf2 = Boolean.valueOf(z2);
            }
            long j = parcel.readLong();
            float f = parcel.readFloat();
            if (parcel.readInt() != 0) {
                if (parcel.readInt() != 0) {
                    z3 = true;
                }
                boolValueOf3 = Boolean.valueOf(z3);
            }
            return new AddYoursStickerStruct(lValueOf, lValueOf2, string, numValueOf, arrayList, lValueOf3, boolValueOf, arrayList2, boolValueOf2, j, f, boolValueOf3, parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final AddYoursStickerStruct[] newArray(int i) {
            return new AddYoursStickerStruct[i];
        }
    };

    public AddYoursStickerStruct() {
        this(null, null, null, 0, null, null, null, null, null, System.currentTimeMillis(), 14.0f, Boolean.FALSE, null, 0);
    }

    public final AddYoursStickerStruct copy(Long l, Long l2, String str, Integer num, List<AddYoursAvatar> list, Long l3, Boolean bool, List<Long> list2, Boolean bool2, long j, float f, Boolean bool3, String str2, int i) {
        return new AddYoursStickerStruct(l, l2, str, num, list, l3, bool, list2, bool2, j, f, bool3, str2, i);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddYoursStickerStruct)) {
            return false;
        }
        AddYoursStickerStruct addYoursStickerStruct = (AddYoursStickerStruct) obj;
        return Intrinsics.LJFF(this.topicId, addYoursStickerStruct.topicId) && Intrinsics.LJFF(this.fromItemId, addYoursStickerStruct.fromItemId) && Intrinsics.LJFF(this.text, addYoursStickerStruct.text) && Intrinsics.LJFF(this.shootFrom, addYoursStickerStruct.shootFrom) && Intrinsics.LJFF(this.userAvatars, addYoursStickerStruct.userAvatars) && Intrinsics.LJFF(this.videoCount, addYoursStickerStruct.videoCount) && Intrinsics.LJFF(this.fromQuestion, addYoursStickerStruct.fromQuestion) && Intrinsics.LJFF(this.addYoursInvitees, addYoursStickerStruct.addYoursInvitees) && Intrinsics.LJFF(this.viewerInvited, addYoursStickerStruct.viewerInvited) && this.timeStamp == addYoursStickerStruct.timeStamp && Float.compare(this.fontSize, addYoursStickerStruct.fontSize) == 0 && Intrinsics.LJFF(this.eoyCampaign, addYoursStickerStruct.eoyCampaign) && Intrinsics.LJFF(this.eoyCampaignSchema, addYoursStickerStruct.eoyCampaignSchema) && this.topicType == addYoursStickerStruct.topicType;
    }

    public String toString() {
        return "AddYoursStickerStruct(topicId=" + this.topicId + ", fromItemId=" + this.fromItemId + ", text=" + this.text + ", shootFrom=" + this.shootFrom + ", userAvatars=" + this.userAvatars + ", videoCount=" + this.videoCount + ", fromQuestion=" + this.fromQuestion + ", addYoursInvitees=" + this.addYoursInvitees + ", viewerInvited=" + this.viewerInvited + ", timeStamp=" + this.timeStamp + ", fontSize=" + this.fontSize + ", eoyCampaign=" + this.eoyCampaign + ", eoyCampaignSchema=" + this.eoyCampaignSchema + ", topicType=" + this.topicType + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Long l = this.topicId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Long l2 = this.fromItemId;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        parcel.writeString(this.text);
        Integer num = this.shootFrom;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        List<AddYoursAvatar> list = this.userAvatars;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<AddYoursAvatar> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        Long l3 = this.videoCount;
        if (l3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l3.longValue());
        }
        Boolean bool = this.fromQuestion;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        List<Long> list2 = this.addYoursInvitees;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            Iterator<Long> it3 = list2.iterator();
            while (it3.hasNext()) {
                parcel.writeLong(it3.next().longValue());
            }
        }
        Boolean bool2 = this.viewerInvited;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        parcel.writeLong(this.timeStamp);
        parcel.writeFloat(this.fontSize);
        Boolean bool3 = this.eoyCampaign;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.eoyCampaignSchema);
        parcel.writeInt(this.topicType);
    }

    public int hashCode() {
        Long l = this.topicId;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.fromItemId;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.text;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.shootFrom;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        List<AddYoursAvatar> list = this.userAvatars;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        Long l3 = this.videoCount;
        int iHashCode6 = (iHashCode5 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Boolean bool = this.fromQuestion;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<Long> list2 = this.addYoursInvitees;
        int iHashCode8 = (iHashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool2 = this.viewerInvited;
        int iHashCode9 = (((((iHashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31) + C786410Ut5.Y2(this.timeStamp)) * 31) + Float.floatToIntBits(this.fontSize)) * 31;
        Boolean bool3 = this.eoyCampaign;
        int iHashCode10 = (iHashCode9 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str2 = this.eoyCampaignSchema;
        return ((iHashCode10 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.topicType;
    }

    public final List<Long> getAddYoursInvitees() {
        return this.addYoursInvitees;
    }

    public final Boolean getEoyCampaign() {
        return this.eoyCampaign;
    }

    public final String getEoyCampaignSchema() {
        return this.eoyCampaignSchema;
    }

    public final float getFontSize() {
        return this.fontSize;
    }

    public final Long getFromItemId() {
        return this.fromItemId;
    }

    public final Boolean getFromQuestion() {
        return this.fromQuestion;
    }

    public final Integer getShootFrom() {
        return this.shootFrom;
    }

    public final String getText() {
        return this.text;
    }

    public final long getTimeStamp() {
        return this.timeStamp;
    }

    public final Long getTopicId() {
        return this.topicId;
    }

    public final int getTopicType() {
        return this.topicType;
    }

    public final List<AddYoursAvatar> getUserAvatars() {
        return this.userAvatars;
    }

    public final Long getVideoCount() {
        return this.videoCount;
    }

    public final Boolean getViewerInvited() {
        return this.viewerInvited;
    }

    public final void setFromItemId(Long l) {
        this.fromItemId = l;
    }

    public final void setFromQuestion(Boolean bool) {
        this.fromQuestion = bool;
    }

    public final void setShootFrom(Integer num) {
        this.shootFrom = num;
    }

    public final void setText(String str) {
        this.text = str;
    }

    public final void setUserAvatars(List<AddYoursAvatar> list) {
        this.userAvatars = list;
    }

    public AddYoursStickerStruct(Long l, Long l2, String str, Integer num, List<AddYoursAvatar> list, Long l3, Boolean bool, List<Long> list2, Boolean bool2, long j, float f, Boolean bool3, String str2, int i) {
        this.topicId = l;
        this.fromItemId = l2;
        this.text = str;
        this.shootFrom = num;
        this.userAvatars = list;
        this.videoCount = l3;
        this.fromQuestion = bool;
        this.addYoursInvitees = list2;
        this.viewerInvited = bool2;
        this.timeStamp = j;
        this.fontSize = f;
        this.eoyCampaign = bool3;
        this.eoyCampaignSchema = str2;
        this.topicType = i;
    }
}
