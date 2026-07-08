package com.ss.android.ugc.aweme.tools.sticker.core.addyours;

import X.AbstractC1442160ndG;
import X.C09CT;
import X.C0FKI;
import X.C123100dR;
import X.C1440500naa;
import X.C19591311kt;
import X.C786410Ut5;
import X.EnumC1466150oFx;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.addyours.AddYoursStickerModel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes30.dex */
public final class AddYoursStickerModel implements StickerModel, Parcelable, Serializable {

    @C09CT("add_yours_enter_method")
    public String addYoursEnterMethod;

    @C09CT("add_yours_invitees")
    public List<Long> addYoursInvitees;

    @C09CT("base_sticker_model")
    public final BaseStickerModel baseStickerModel;

    @C09CT("clickable")
    public final boolean clickable;

    @C09CT("editable")
    public final boolean editable;

    @C09CT("follow_topic_id")
    public Long followTopicId;

    @C09CT("follow_topic_text")
    public String followTopicText;

    @C09CT("font_size")
    public final float fontSize;

    @C09CT("initial_recommend_topic_by_content")
    public String initialRecommendTopicByContent;

    @C09CT("is_candidate_state")
    public boolean isCandidateState;

    @C09CT("is_edited")
    public boolean isEdited;

    @C09CT("is_operation_set")
    public Integer isOperationSet;

    @C09CT("is_selected_add_yours")
    public boolean isSelectedAddYours;

    @C09CT("need_remind_user_can_change_topic")
    public boolean needRemindUserCanChangeTopic;

    @C09CT("recommend_ay_initial_scale")
    public Float recommendAyInitialScale;

    @C09CT("source_of_trends_add_yours_in_video")
    public Integer sourceOfTrendsAddYoursInVideo;

    @C09CT("topic_id")
    public Long topicID;

    @C09CT("topic_text")
    public final String topicText;

    @C09CT("topic_text_from_recommend_topic_list")
    public final String topicTextFromRecommendTopicList;

    @C09CT("topic_type")
    public final int topicType;

    @C09CT("video_count")
    public Long videoCount;

    @C09CT("visible")
    public final boolean visible;
    public static final Parcelable.Creator<AddYoursStickerModel> CREATOR = new Parcelable.Creator<AddYoursStickerModel>() { // from class: X.0FPP
        @Override // android.os.Parcelable.Creator
        public final AddYoursStickerModel createFromParcel(Parcel parcel) {
            Long lValueOf;
            boolean z;
            boolean z2;
            boolean z3;
            ArrayList arrayList;
            Integer numValueOf;
            Long lValueOf2;
            boolean z4;
            boolean z5;
            Integer numValueOf2;
            boolean z6;
            Long lValueOf3;
            boolean z7;
            BaseStickerModel baseStickerModelCreateFromParcel = BaseStickerModel.CREATOR.createFromParcel(parcel);
            Float fValueOf = null;
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
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(Long.valueOf(parcel.readLong()));
                }
            }
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            float f = parcel.readFloat();
            int i3 = parcel.readInt();
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                lValueOf2 = null;
            } else {
                lValueOf2 = Long.valueOf(parcel.readLong());
            }
            if (parcel.readInt() != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (parcel.readInt() != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (parcel.readInt() == 0) {
                numValueOf2 = null;
            } else {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() != 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            String string5 = parcel.readString();
            if (parcel.readInt() == 0) {
                lValueOf3 = null;
            } else {
                lValueOf3 = Long.valueOf(parcel.readLong());
            }
            if (parcel.readInt() != 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (parcel.readInt() != 0) {
                fValueOf = Float.valueOf(parcel.readFloat());
            }
            return new AddYoursStickerModel(baseStickerModelCreateFromParcel, lValueOf, string, string2, z, z2, z3, arrayList, string3, numValueOf, f, i3, string4, lValueOf2, z4, z5, numValueOf2, z6, string5, lValueOf3, z7, fValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final AddYoursStickerModel[] newArray(int i) {
            return new AddYoursStickerModel[i];
        }
    };
    public static final int $stable = 8;

    public final AddYoursStickerModel copy(BaseStickerModel baseStickerModel, Long l, String str, String str2, boolean z, boolean z2, boolean z3, List<Long> list, String str3, Integer num, float f, int i, String str4, Long l2, boolean z4, boolean z5, Integer num2, boolean z6, String str5, Long l3, boolean z7, Float f2) {
        return new AddYoursStickerModel(baseStickerModel, l, str, str2, z, z2, z3, list, str3, num, f, i, str4, l2, z4, z5, num2, z6, str5, l3, z7, f2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddYoursStickerModel)) {
            return false;
        }
        AddYoursStickerModel addYoursStickerModel = (AddYoursStickerModel) obj;
        return Intrinsics.LJFF(this.baseStickerModel, addYoursStickerModel.baseStickerModel) && Intrinsics.LJFF(this.topicID, addYoursStickerModel.topicID) && Intrinsics.LJFF(this.topicText, addYoursStickerModel.topicText) && Intrinsics.LJFF(this.topicTextFromRecommendTopicList, addYoursStickerModel.topicTextFromRecommendTopicList) && this.visible == addYoursStickerModel.visible && this.editable == addYoursStickerModel.editable && this.clickable == addYoursStickerModel.clickable && Intrinsics.LJFF(this.addYoursInvitees, addYoursStickerModel.addYoursInvitees) && Intrinsics.LJFF(this.addYoursEnterMethod, addYoursStickerModel.addYoursEnterMethod) && Intrinsics.LJFF(this.isOperationSet, addYoursStickerModel.isOperationSet) && Float.compare(this.fontSize, addYoursStickerModel.fontSize) == 0 && this.topicType == addYoursStickerModel.topicType && Intrinsics.LJFF(this.followTopicText, addYoursStickerModel.followTopicText) && Intrinsics.LJFF(this.followTopicId, addYoursStickerModel.followTopicId) && this.needRemindUserCanChangeTopic == addYoursStickerModel.needRemindUserCanChangeTopic && this.isEdited == addYoursStickerModel.isEdited && Intrinsics.LJFF(this.sourceOfTrendsAddYoursInVideo, addYoursStickerModel.sourceOfTrendsAddYoursInVideo) && this.isCandidateState == addYoursStickerModel.isCandidateState && Intrinsics.LJFF(this.initialRecommendTopicByContent, addYoursStickerModel.initialRecommendTopicByContent) && Intrinsics.LJFF(this.videoCount, addYoursStickerModel.videoCount) && this.isSelectedAddYours == addYoursStickerModel.isSelectedAddYours && Intrinsics.LJFF(this.recommendAyInitialScale, addYoursStickerModel.recommendAyInitialScale);
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
        return "AddYoursStickerModel(baseStickerModel=" + this.baseStickerModel + ", topicID=" + this.topicID + ", topicText=" + this.topicText + ", topicTextFromRecommendTopicList=" + this.topicTextFromRecommendTopicList + ", visible=" + this.visible + ", editable=" + this.editable + ", clickable=" + this.clickable + ", addYoursInvitees=" + this.addYoursInvitees + ", addYoursEnterMethod=" + this.addYoursEnterMethod + ", isOperationSet=" + this.isOperationSet + ", fontSize=" + this.fontSize + ", topicType=" + this.topicType + ", followTopicText=" + this.followTopicText + ", followTopicId=" + this.followTopicId + ", needRemindUserCanChangeTopic=" + this.needRemindUserCanChangeTopic + ", isEdited=" + this.isEdited + ", sourceOfTrendsAddYoursInVideo=" + this.sourceOfTrendsAddYoursInVideo + ", isCandidateState=" + this.isCandidateState + ", initialRecommendTopicByContent=" + this.initialRecommendTopicByContent + ", videoCount=" + this.videoCount + ", isSelectedAddYours=" + this.isSelectedAddYours + ", recommendAyInitialScale=" + this.recommendAyInitialScale + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.baseStickerModel.writeToParcel(parcel, i);
        Long l = this.topicID;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.topicText);
        parcel.writeString(this.topicTextFromRecommendTopicList);
        parcel.writeInt(this.visible ? 1 : 0);
        parcel.writeInt(this.editable ? 1 : 0);
        parcel.writeInt(this.clickable ? 1 : 0);
        List<Long> list = this.addYoursInvitees;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<Long> it2 = list.iterator();
            while (it2.hasNext()) {
                parcel.writeLong(it2.next().longValue());
            }
        }
        parcel.writeString(this.addYoursEnterMethod);
        Integer num = this.isOperationSet;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeFloat(this.fontSize);
        parcel.writeInt(this.topicType);
        parcel.writeString(this.followTopicText);
        Long l2 = this.followTopicId;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        parcel.writeInt(this.needRemindUserCanChangeTopic ? 1 : 0);
        parcel.writeInt(this.isEdited ? 1 : 0);
        Integer num2 = this.sourceOfTrendsAddYoursInVideo;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeInt(this.isCandidateState ? 1 : 0);
        parcel.writeString(this.initialRecommendTopicByContent);
        Long l3 = this.videoCount;
        if (l3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l3.longValue());
        }
        parcel.writeInt(this.isSelectedAddYours ? 1 : 0);
        Float f = this.recommendAyInitialScale;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f.floatValue());
        }
    }

    public AddYoursStickerModel() {
        this(new BaseStickerModel(0, 0, EnumC1466150oFx.ADD_YOURS, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -5, 15, null), null, null, null, true, false, false, null, null, 0, 14.0f, 0, null, null, false, false, null, false, null, null, true, null);
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public int getId() {
        return this.baseStickerModel.getId();
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public InteractStickerStruct getInteractStickerStruct() {
        C19591311kt.LIZ.getClass();
        int i = 1;
        InteractStickerStruct interactStickerStructLIZLLL = C19591311kt.LIZLLL(this, true);
        if (!Intrinsics.LJFF(getAddYoursEnterMethod(), "shoot_page_entrance") && !Intrinsics.LJFF(getAddYoursEnterMethod(), "edit_page_entrance") && !Intrinsics.LJFF(getAddYoursEnterMethod(), "edit_page_sticker")) {
            i = 2;
        }
        interactStickerStructLIZLLL.setAddYoursStickerStruct(new AddYoursStickerStruct(getTopicID(), null, getTopicText(), Integer.valueOf(i), null, null, null, getAddYoursInvitees(), null, System.currentTimeMillis(), getFontSize(), Boolean.FALSE, null, getTopicType()));
        interactStickerStructLIZLLL.setType(getStickerType().getType());
        return interactStickerStructLIZLLL;
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public EnumC1466150oFx getStickerType() {
        return this.baseStickerModel.getType();
    }

    public int hashCode() {
        int iHashCode = this.baseStickerModel.hashCode() * 31;
        Long l = this.topicID;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.topicText;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.topicTextFromRecommendTopicList;
        int iHashCode4 = (((((((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + C786410Ut5.Z2(this.visible)) * 31) + C786410Ut5.Z2(this.editable)) * 31) + C786410Ut5.Z2(this.clickable)) * 31;
        List<Long> list = this.addYoursInvitees;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.addYoursEnterMethod;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.isOperationSet;
        int iHashCode7 = (((((iHashCode6 + (num == null ? 0 : num.hashCode())) * 31) + Float.floatToIntBits(this.fontSize)) * 31) + this.topicType) * 31;
        String str4 = this.followTopicText;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l2 = this.followTopicId;
        int iHashCode9 = (((((iHashCode8 + (l2 == null ? 0 : l2.hashCode())) * 31) + C786410Ut5.Z2(this.needRemindUserCanChangeTopic)) * 31) + C786410Ut5.Z2(this.isEdited)) * 31;
        Integer num2 = this.sourceOfTrendsAddYoursInVideo;
        int iHashCode10 = (((iHashCode9 + (num2 == null ? 0 : num2.hashCode())) * 31) + C786410Ut5.Z2(this.isCandidateState)) * 31;
        String str5 = this.initialRecommendTopicByContent;
        int iHashCode11 = (iHashCode10 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Long l3 = this.videoCount;
        int iHashCode12 = (((iHashCode11 + (l3 == null ? 0 : l3.hashCode())) * 31) + C786410Ut5.Z2(this.isSelectedAddYours)) * 31;
        Float f = this.recommendAyInitialScale;
        return iHashCode12 + (f != null ? f.hashCode() : 0);
    }

    public final boolean isFollowAndModifyTopic() {
        String str = this.followTopicText;
        return (str == null || Intrinsics.LJFF(str, this.topicText)) ? false : true;
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public boolean isNotEmptyModel() {
        return C123100dR.LIZ(this.topicText) && (a0.LJJJIL(this.topicText) ^ true) && this.isSelectedAddYours;
    }

    public final String getAddYoursEnterMethod() {
        return this.addYoursEnterMethod;
    }

    public final List<Long> getAddYoursInvitees() {
        return this.addYoursInvitees;
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

    public final boolean getEditable() {
        return this.editable;
    }

    public final Long getFollowTopicId() {
        return this.followTopicId;
    }

    public final String getFollowTopicText() {
        return this.followTopicText;
    }

    public final float getFontSize() {
        return this.fontSize;
    }

    public final String getInitialRecommendTopicByContent() {
        return this.initialRecommendTopicByContent;
    }

    public final boolean getNeedRemindUserCanChangeTopic() {
        return this.needRemindUserCanChangeTopic;
    }

    public final Float getRecommendAyInitialScale() {
        return this.recommendAyInitialScale;
    }

    public final Integer getSourceOfTrendsAddYoursInVideo() {
        return this.sourceOfTrendsAddYoursInVideo;
    }

    public final Long getTopicID() {
        return this.topicID;
    }

    public final String getTopicText() {
        return this.topicText;
    }

    public final String getTopicTextFromRecommendTopicList() {
        return this.topicTextFromRecommendTopicList;
    }

    public final int getTopicType() {
        return this.topicType;
    }

    public final Long getVideoCount() {
        return this.videoCount;
    }

    public final boolean getVisible() {
        return this.visible;
    }

    public final boolean isCandidateState() {
        return this.isCandidateState;
    }

    public final boolean isEdited() {
        return this.isEdited;
    }

    public final Integer isOperationSet() {
        return this.isOperationSet;
    }

    public final boolean isSelectedAddYours() {
        return this.isSelectedAddYours;
    }

    public final void setAddYoursEnterMethod(String str) {
        this.addYoursEnterMethod = str;
    }

    public final void setAddYoursInvitees(List<Long> list) {
        this.addYoursInvitees = list;
    }

    public final void setCandidateState(boolean z) {
        this.isCandidateState = z;
    }

    public final void setEdited(boolean z) {
        this.isEdited = z;
    }

    public final void setFollowTopicId(Long l) {
        this.followTopicId = l;
    }

    public final void setFollowTopicText(String str) {
        this.followTopicText = str;
    }

    public final void setInitialRecommendTopicByContent(String str) {
        this.initialRecommendTopicByContent = str;
    }

    public final void setNeedRemindUserCanChangeTopic(boolean z) {
        this.needRemindUserCanChangeTopic = z;
    }

    public final void setOperationSet(Integer num) {
        this.isOperationSet = num;
    }

    public final void setRecommendAyInitialScale(Float f) {
        this.recommendAyInitialScale = f;
    }

    public final void setSelectedAddYours(boolean z) {
        this.isSelectedAddYours = z;
    }

    public final void setSourceOfTrendsAddYoursInVideo(Integer num) {
        this.sourceOfTrendsAddYoursInVideo = num;
    }

    public final void setTopicID(Long l) {
        this.topicID = l;
    }

    public final void setVideoCount(Long l) {
        this.videoCount = l;
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public StickerModel updateMediaSize(Pair<Integer, Integer> pair) {
        return copy(BaseStickerModel.copy$default(this.baseStickerModel, 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, pair.getFirst().intValue(), pair.getSecond().intValue(), false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -24577, 15, null), this.topicID, this.topicText, this.topicTextFromRecommendTopicList, this.visible, this.editable, this.clickable, this.addYoursInvitees, this.addYoursEnterMethod, this.isOperationSet, this.fontSize, this.topicType, this.followTopicText, this.followTopicId, this.needRemindUserCanChangeTopic, this.isEdited, this.sourceOfTrendsAddYoursInVideo, this.isCandidateState, this.initialRecommendTopicByContent, this.videoCount, this.isSelectedAddYours, this.recommendAyInitialScale);
    }

    public AddYoursStickerModel(BaseStickerModel baseStickerModel, Long l, String str, String str2, boolean z, boolean z2, boolean z3, List<Long> list, String str3, Integer num, float f, int i, String str4, Long l2, boolean z4, boolean z5, Integer num2, boolean z6, String str5, Long l3, boolean z7, Float f2) {
        this.baseStickerModel = baseStickerModel;
        this.topicID = l;
        this.topicText = str;
        this.topicTextFromRecommendTopicList = str2;
        this.visible = z;
        this.editable = z2;
        this.clickable = z3;
        this.addYoursInvitees = list;
        this.addYoursEnterMethod = str3;
        this.isOperationSet = num;
        this.fontSize = f;
        this.topicType = i;
        this.followTopicText = str4;
        this.followTopicId = l2;
        this.needRemindUserCanChangeTopic = z4;
        this.isEdited = z5;
        this.sourceOfTrendsAddYoursInVideo = num2;
        this.isCandidateState = z6;
        this.initialRecommendTopicByContent = str5;
        this.videoCount = l3;
        this.isSelectedAddYours = z7;
        this.recommendAyInitialScale = f2;
    }
}
