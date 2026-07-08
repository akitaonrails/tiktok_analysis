package com.ss.android.ugc.aweme.creative.model.aigc;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.aigc.AIGCSocialModel;
import com.ss.android.ugc.aweme.creative.model.common.InputBlock;
import com.ss.android.ugc.aweme.creative.model.common.MentionDataItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class AIGCSocialModel implements Parcelable {
    public static final Parcelable.Creator<AIGCSocialModel> CREATOR = new Parcelable.Creator<AIGCSocialModel>() { // from class: X.0Ldx
        @Override // android.os.Parcelable.Creator
        public final AIGCSocialModel createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            boolean z;
            Boolean boolValueOf;
            ArrayList arrayList3;
            ArrayList arrayList4 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(MentionDataItem.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i3 = parcel.readInt();
                arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(MentionDataItem.CREATOR.createFromParcel(parcel));
                }
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
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int i5 = parcel.readInt();
                arrayList3 = new ArrayList(i5);
                for (int i6 = 0; i6 != i5; i6++) {
                    arrayList3.add(MentionDataItem.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() != 0) {
                int i7 = parcel.readInt();
                arrayList4 = new ArrayList(i7);
                for (int i8 = 0; i8 != i7; i8++) {
                    arrayList4.add(InputBlock.CREATOR.createFromParcel(parcel));
                }
            }
            return new AIGCSocialModel(arrayList, arrayList2, boolValueOf, string, string2, arrayList3, arrayList4, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AIGCSocialModel[] newArray(int i) {
            return new AIGCSocialModel[i];
        }
    };

    @C09CT("conversation_id")
    public final String conversationId;

    @C09CT("conversation_short_id")
    public final String conversationShortId;

    @C09CT("creation_id")
    public final String creationId;

    @C09CT("is_from_group_chat")
    public final Boolean isGroupChat;

    @C09CT("participant_cameo_info")
    public List<MentionDataItem> participantCameoInfo;

    @C09CT("peer_cameo_info")
    public final List<MentionDataItem> peerCameoInfo;

    @C09CT("prompt_blocks")
    public List<InputBlock> promptBlocks;

    @C09CT("self_cameo_info")
    public final List<MentionDataItem> selfCameoInfo;

    @C09CT("client_task_id")
    public final String taskId;

    public AIGCSocialModel() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIGCSocialModel)) {
            return false;
        }
        AIGCSocialModel aIGCSocialModel = (AIGCSocialModel) obj;
        return Intrinsics.LJFF(this.selfCameoInfo, aIGCSocialModel.selfCameoInfo) && Intrinsics.LJFF(this.peerCameoInfo, aIGCSocialModel.peerCameoInfo) && Intrinsics.LJFF(this.isGroupChat, aIGCSocialModel.isGroupChat) && Intrinsics.LJFF(this.conversationId, aIGCSocialModel.conversationId) && Intrinsics.LJFF(this.conversationShortId, aIGCSocialModel.conversationShortId) && Intrinsics.LJFF(this.participantCameoInfo, aIGCSocialModel.participantCameoInfo) && Intrinsics.LJFF(this.promptBlocks, aIGCSocialModel.promptBlocks) && Intrinsics.LJFF(this.taskId, aIGCSocialModel.taskId) && Intrinsics.LJFF(this.creationId, aIGCSocialModel.creationId);
    }

    public final int hashCode() {
        List<MentionDataItem> list = this.selfCameoInfo;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<MentionDataItem> list2 = this.peerCameoInfo;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool = this.isGroupChat;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.conversationId;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.conversationShortId;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<MentionDataItem> list3 = this.participantCameoInfo;
        int iHashCode6 = (iHashCode5 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<InputBlock> list4 = this.promptBlocks;
        int iHashCode7 = (iHashCode6 + (list4 == null ? 0 : list4.hashCode())) * 31;
        String str3 = this.taskId;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.creationId;
        return iHashCode8 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIGCSocialModel(selfCameoInfo=");
        sbLIZ.append(this.selfCameoInfo);
        sbLIZ.append(", peerCameoInfo=");
        sbLIZ.append(this.peerCameoInfo);
        sbLIZ.append(", isGroupChat=");
        sbLIZ.append(this.isGroupChat);
        sbLIZ.append(", conversationId=");
        sbLIZ.append(this.conversationId);
        sbLIZ.append(", conversationShortId=");
        sbLIZ.append(this.conversationShortId);
        sbLIZ.append(", participantCameoInfo=");
        sbLIZ.append(this.participantCameoInfo);
        sbLIZ.append(", promptBlocks=");
        sbLIZ.append(this.promptBlocks);
        sbLIZ.append(", taskId=");
        sbLIZ.append(this.taskId);
        sbLIZ.append(", creationId=");
        sbLIZ.append(this.creationId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<MentionDataItem> list = this.selfCameoInfo;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<MentionDataItem> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        List<MentionDataItem> list2 = this.peerCameoInfo;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            Iterator<MentionDataItem> it3 = list2.iterator();
            while (it3.hasNext()) {
                it3.next().writeToParcel(parcel, i);
            }
        }
        Boolean bool = this.isGroupChat;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.conversationId);
        parcel.writeString(this.conversationShortId);
        List<MentionDataItem> list3 = this.participantCameoInfo;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list3.size());
            Iterator<MentionDataItem> it4 = list3.iterator();
            while (it4.hasNext()) {
                it4.next().writeToParcel(parcel, i);
            }
        }
        List<InputBlock> list4 = this.promptBlocks;
        if (list4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list4.size());
            Iterator<InputBlock> it5 = list4.iterator();
            while (it5.hasNext()) {
                it5.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.taskId);
        parcel.writeString(this.creationId);
    }

    public static AIGCSocialModel LIZ(AIGCSocialModel aIGCSocialModel, List list, List list2, List list3, String str, String str2, int i) {
        Boolean bool;
        String str3;
        String str4;
        List list4 = list;
        String str5 = str;
        List list5 = list3;
        List list6 = list2;
        String str6 = str2;
        if ((i & 1) != 0) {
            list4 = aIGCSocialModel.selfCameoInfo;
        }
        if ((i & 2) != 0) {
            list6 = aIGCSocialModel.peerCameoInfo;
        }
        List<MentionDataItem> list7 = null;
        if ((i & 4) != 0) {
            bool = aIGCSocialModel.isGroupChat;
        } else {
            bool = null;
        }
        if ((i & 8) != 0) {
            str3 = aIGCSocialModel.conversationId;
        } else {
            str3 = null;
        }
        if ((i & 16) != 0) {
            str4 = aIGCSocialModel.conversationShortId;
        } else {
            str4 = null;
        }
        if ((i & 32) != 0) {
            list7 = aIGCSocialModel.participantCameoInfo;
        }
        if ((i & 64) != 0) {
            list5 = aIGCSocialModel.promptBlocks;
        }
        if ((i & 128) != 0) {
            str5 = aIGCSocialModel.taskId;
        }
        if ((i & 256) != 0) {
            str6 = aIGCSocialModel.creationId;
        }
        aIGCSocialModel.getClass();
        return new AIGCSocialModel(list4, list6, bool, str3, str4, list7, list5, str5, str6);
    }

    public AIGCSocialModel(List<MentionDataItem> list, List<MentionDataItem> list2, Boolean bool, String str, String str2, List<MentionDataItem> list3, List<InputBlock> list4, String str3, String str4) {
        this.selfCameoInfo = list;
        this.peerCameoInfo = list2;
        this.isGroupChat = bool;
        this.conversationId = str;
        this.conversationShortId = str2;
        this.participantCameoInfo = list3;
        this.promptBlocks = list4;
        this.taskId = str3;
        this.creationId = str4;
    }

    public AIGCSocialModel(List list, List list2, Boolean bool, String str, String str2, List list3, List list4, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? C13BV.INSTANCE : list2, (i & 4) != 0 ? Boolean.FALSE : bool, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? C13BV.INSTANCE : list3, (i & 64) != 0 ? C13BV.INSTANCE : list4, (i & 128) != 0 ? null : str3, (i & 256) == 0 ? str4 : null);
    }
}
