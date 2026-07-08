package com.ss.android.ugc.aweme.theater.model;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.theater.model.CameoData;
import com.ss.android.ugc.aweme.theater.model.CameoDraftInfo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class CameoData implements Parcelable, Serializable {
    public static final Parcelable.Creator<CameoData> CREATOR = new Parcelable.Creator<CameoData>() { // from class: X.02vJ
        @Override // android.os.Parcelable.Creator
        public final CameoData createFromParcel(Parcel parcel) {
            CameoDraftInfo cameoDraftInfoCreateFromParcel;
            boolean z;
            ArrayList arrayList = null;
            if (parcel.readInt() == 0) {
                cameoDraftInfoCreateFromParcel = null;
            } else {
                cameoDraftInfoCreateFromParcel = CameoDraftInfo.CREATOR.createFromParcel(parcel);
            }
            CameoDraftInfo cameoDraftInfo = cameoDraftInfoCreateFromParcel;
            if (parcel.readInt() != 0) {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readSerializable());
                }
            }
            long j = parcel.readLong();
            int i3 = parcel.readInt();
            int i4 = parcel.readInt();
            int i5 = parcel.readInt();
            int i6 = parcel.readInt();
            int i7 = parcel.readInt();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new CameoData(cameoDraftInfo, arrayList, j, i3, i4, i5, i6, i7, z, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CameoData[] newArray(int i) {
            return new CameoData[i];
        }
    };

    @C09CT("ai_portrait_item_cnt")
    public final int aiPortraitDraftCnt;

    @C09CT("ai_cast_item_cnt")
    public final int aicastDraftCnt;

    @C09CT("ai_remix_item_cnt")
    public final int airemixDraftCnt;

    @C09CT("latest_draft_data")
    public final CameoDraftInfo cameoDraftInfo;

    @C09CT("cameo_id")
    public final String cameoId;

    @C09CT("cursor")
    public final long cursor;

    @C09CT("has_more")
    public final int hasMore;

    @C09CT("have_ai_self")
    public final boolean haveAiSelf;

    @C09CT("post_list")
    public final List<Aweme> postList;

    @C09CT("total_count")
    public final int totalCount;

    public CameoData() {
        this(null, new ArrayList(), 0L, 0, 0, 0, 0, 0, false, null);
    }

    public final CameoData copy(CameoDraftInfo cameoDraftInfo, List<Aweme> list, long j, int i, int i2, int i3, int i4, int i5, boolean z, String str) {
        return new CameoData(cameoDraftInfo, list, j, i, i2, i3, i4, i5, z, str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameoData)) {
            return false;
        }
        CameoData cameoData = (CameoData) obj;
        return Intrinsics.LJFF(this.cameoDraftInfo, cameoData.cameoDraftInfo) && Intrinsics.LJFF(this.postList, cameoData.postList) && this.cursor == cameoData.cursor && this.hasMore == cameoData.hasMore && this.totalCount == cameoData.totalCount && this.aicastDraftCnt == cameoData.aicastDraftCnt && this.airemixDraftCnt == cameoData.airemixDraftCnt && this.aiPortraitDraftCnt == cameoData.aiPortraitDraftCnt && this.haveAiSelf == cameoData.haveAiSelf && Intrinsics.LJFF(this.cameoId, cameoData.cameoId);
    }

    public int hashCode() {
        CameoDraftInfo cameoDraftInfo = this.cameoDraftInfo;
        int iHashCode = (cameoDraftInfo == null ? 0 : cameoDraftInfo.hashCode()) * 31;
        List<Aweme> list = this.postList;
        int iHashCode2 = (((((((((((((((iHashCode + (list == null ? 0 : list.hashCode())) * 31) + C786410Ut5.Y2(this.cursor)) * 31) + this.hasMore) * 31) + this.totalCount) * 31) + this.aicastDraftCnt) * 31) + this.airemixDraftCnt) * 31) + this.aiPortraitDraftCnt) * 31) + C786410Ut5.Z2(this.haveAiSelf)) * 31;
        String str = this.cameoId;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CameoData(cameoDraftInfo=");
        sbLIZ.append(this.cameoDraftInfo);
        sbLIZ.append(", postList=");
        sbLIZ.append(this.postList);
        sbLIZ.append(", cursor=");
        sbLIZ.append(this.cursor);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.hasMore);
        sbLIZ.append(", totalCount=");
        sbLIZ.append(this.totalCount);
        sbLIZ.append(", aicastDraftCnt=");
        sbLIZ.append(this.aicastDraftCnt);
        sbLIZ.append(", airemixDraftCnt=");
        sbLIZ.append(this.airemixDraftCnt);
        sbLIZ.append(", aiPortraitDraftCnt=");
        sbLIZ.append(this.aiPortraitDraftCnt);
        sbLIZ.append(", haveAiSelf=");
        sbLIZ.append(this.haveAiSelf);
        sbLIZ.append(", cameoId=");
        sbLIZ.append(this.cameoId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        CameoDraftInfo cameoDraftInfo = this.cameoDraftInfo;
        if (cameoDraftInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cameoDraftInfo.writeToParcel(parcel, i);
        }
        List<Aweme> list = this.postList;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<Aweme> it2 = list.iterator();
            while (it2.hasNext()) {
                parcel.writeSerializable(it2.next());
            }
        }
        parcel.writeLong(this.cursor);
        parcel.writeInt(this.hasMore);
        parcel.writeInt(this.totalCount);
        parcel.writeInt(this.aicastDraftCnt);
        parcel.writeInt(this.airemixDraftCnt);
        parcel.writeInt(this.aiPortraitDraftCnt);
        parcel.writeInt(this.haveAiSelf ? 1 : 0);
        parcel.writeString(this.cameoId);
    }

    public final boolean canCast() {
        String str = this.cameoId;
        return !(str == null || str.length() == 0);
    }

    public final boolean hasOnlyOldAISelf() {
        return !canCast() && this.haveAiSelf;
    }

    public final int getAiPortraitDraftCnt() {
        return this.aiPortraitDraftCnt;
    }

    public final int getAicastDraftCnt() {
        return this.aicastDraftCnt;
    }

    public final int getAiremixDraftCnt() {
        return this.airemixDraftCnt;
    }

    public final CameoDraftInfo getCameoDraftInfo() {
        return this.cameoDraftInfo;
    }

    public final String getCameoId() {
        return this.cameoId;
    }

    public final long getCursor() {
        return this.cursor;
    }

    public final int getHasMore() {
        return this.hasMore;
    }

    public final boolean getHaveAiSelf() {
        return this.haveAiSelf;
    }

    public final List<Aweme> getPostList() {
        return this.postList;
    }

    public final int getTotalCount() {
        return this.totalCount;
    }

    public final void updatePostList(List<? extends Aweme> list) {
        List<Aweme> list2 = this.postList;
        if (list2 != null) {
            list2.clear();
        }
        List<Aweme> list3 = this.postList;
        if (list3 != null) {
            if (list == null) {
                list = C13BV.INSTANCE;
            }
            list3.addAll(list);
        }
    }

    public CameoData(CameoDraftInfo cameoDraftInfo, List<Aweme> list, long j, int i, int i2, int i3, int i4, int i5, boolean z, String str) {
        this.cameoDraftInfo = cameoDraftInfo;
        this.postList = list;
        this.cursor = j;
        this.hasMore = i;
        this.totalCount = i2;
        this.aicastDraftCnt = i3;
        this.airemixDraftCnt = i4;
        this.aiPortraitDraftCnt = i5;
        this.haveAiSelf = z;
        this.cameoId = str;
    }
}
