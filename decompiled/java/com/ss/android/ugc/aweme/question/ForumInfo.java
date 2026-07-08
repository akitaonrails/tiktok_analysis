package com.ss.android.ugc.aweme.question;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.question.ForumInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ForumInfo implements Parcelable {
    public static final Parcelable.Creator<ForumInfo> CREATOR = new Parcelable.Creator<ForumInfo>() { // from class: X.02mu
        @Override // android.os.Parcelable.Creator
        public final ForumInfo createFromParcel(Parcel parcel) {
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            int i3 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                arrayList.add(Long.valueOf(parcel.readLong()));
            }
            return new ForumInfo(i, i2, arrayList, parcel.readInt(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final ForumInfo[] newArray(int i) {
            return new ForumInfo[i];
        }
    };

    @C09CT("forum_status")
    public final int forumStatus;

    @C09CT("forum_type")
    public final int forumType;

    @C09CT("invited_users")
    public final List<Long> inviteUserList;

    @C09CT("question_from")
    public final int questionFrom;

    @C09CT("user_selected_categories")
    public final List<String> userSelectedCategories;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ForumInfo)) {
            return false;
        }
        ForumInfo forumInfo = (ForumInfo) obj;
        return this.forumType == forumInfo.forumType && this.forumStatus == forumInfo.forumStatus && Intrinsics.LJFF(this.inviteUserList, forumInfo.inviteUserList) && this.questionFrom == forumInfo.questionFrom && Intrinsics.LJFF(this.userSelectedCategories, forumInfo.userSelectedCategories);
    }

    public final int hashCode() {
        return (((((((this.forumType * 31) + this.forumStatus) * 31) + this.inviteUserList.hashCode()) * 31) + this.questionFrom) * 31) + this.userSelectedCategories.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ForumInfo(forumType=");
        sbLIZ.append(this.forumType);
        sbLIZ.append(", forumStatus=");
        sbLIZ.append(this.forumStatus);
        sbLIZ.append(", inviteUserList=");
        sbLIZ.append(this.inviteUserList);
        sbLIZ.append(", questionFrom=");
        sbLIZ.append(this.questionFrom);
        sbLIZ.append(", userSelectedCategories=");
        sbLIZ.append(this.userSelectedCategories);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.forumType);
        parcel.writeInt(this.forumStatus);
        List<Long> list = this.inviteUserList;
        parcel.writeInt(list.size());
        Iterator<Long> it2 = list.iterator();
        while (it2.hasNext()) {
            parcel.writeLong(it2.next().longValue());
        }
        parcel.writeInt(this.questionFrom);
        parcel.writeStringList(this.userSelectedCategories);
    }

    public ForumInfo(int i, int i2, List<Long> list, int i3, List<String> list2) {
        this.forumType = i;
        this.forumStatus = i2;
        this.inviteUserList = list;
        this.questionFrom = i3;
        this.userSelectedCategories = list2;
    }

    public ForumInfo(int i, int i2, List list, int i3, List list2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i4 & 2) != 0 ? 2 : i2, (i4 & 4) != 0 ? C13BV.INSTANCE : list, (i4 & 8) != 0 ? 0 : i3, (i4 & 16) != 0 ? C13BV.INSTANCE : list2);
    }
}
