package com.ss.android.ugc.aweme.friendstab.api;

import X.C09CT;
import X.C0X12;
import X.C13LP;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC20550615bE;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.feed.model.cardinsert.CardInsertResultInfo;
import com.ss.android.ugc.aweme.feed.model.friends.FriendsFeed;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class FriendsFeedResponse extends BaseResponse implements Cloneable, C0X12, InterfaceC20550615bE {
    public String LL;

    @C09CT("card_insert_results")
    public List<CardInsertResultInfo> cardInsertResults;

    @C09CT("friend_feed_data")
    public List<FriendsFeed> friendFeedData;

    @C09CT("has_more")
    public boolean hasMore;

    @C09CT("inserted_results")
    public List<InsertResultCode> insertedResults;

    @C09CT("last_view_item_id")
    public String lastViewItemId;

    @C09CT("log_pb")
    public LogPbBean logPb;

    @C09CT("page_token")
    public String pageToken;

    @C09CT("preload")
    public int preload;

    @C09CT("source")
    public int source;

    public FriendsFeedResponse() {
        this(0, false, null, "", "", null, 0, null, null, "");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FriendsFeedResponse)) {
            return false;
        }
        FriendsFeedResponse friendsFeedResponse = (FriendsFeedResponse) obj;
        return this.source == friendsFeedResponse.source && this.hasMore == friendsFeedResponse.hasMore && Intrinsics.LJFF(this.friendFeedData, friendsFeedResponse.friendFeedData) && Intrinsics.LJFF(this.lastViewItemId, friendsFeedResponse.lastViewItemId) && Intrinsics.LJFF(this.pageToken, friendsFeedResponse.pageToken) && Intrinsics.LJFF(this.logPb, friendsFeedResponse.logPb) && this.preload == friendsFeedResponse.preload && Intrinsics.LJFF(this.cardInsertResults, friendsFeedResponse.cardInsertResults) && Intrinsics.LJFF(this.insertedResults, friendsFeedResponse.insertedResults) && Intrinsics.LJFF(this.LL, friendsFeedResponse.LL);
    }

    public final int hashCode() {
        int iZ2 = ((this.source * 31) + C786410Ut5.Z2(this.hasMore)) * 31;
        List<FriendsFeed> list = this.friendFeedData;
        int iHashCode = (iZ2 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.lastViewItemId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.pageToken;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        LogPbBean logPbBean = this.logPb;
        int iHashCode4 = (((iHashCode3 + (logPbBean == null ? 0 : logPbBean.hashCode())) * 31) + this.preload) * 31;
        List<CardInsertResultInfo> list2 = this.cardInsertResults;
        int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<InsertResultCode> list3 = this.insertedResults;
        int iHashCode6 = (iHashCode5 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str3 = this.LL;
        return iHashCode6 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FriendsFeedResponse(source=");
        sbLIZ.append(this.source);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.hasMore);
        sbLIZ.append(", friendFeedData=");
        sbLIZ.append(this.friendFeedData);
        sbLIZ.append(", lastViewItemId=");
        sbLIZ.append(this.lastViewItemId);
        sbLIZ.append(", pageToken=");
        sbLIZ.append(this.pageToken);
        sbLIZ.append(", logPb=");
        sbLIZ.append(this.logPb);
        sbLIZ.append(", preload=");
        sbLIZ.append(this.preload);
        sbLIZ.append(", cardInsertResults=");
        sbLIZ.append(this.cardInsertResults);
        sbLIZ.append(", insertedResults=");
        sbLIZ.append(this.insertedResults);
        sbLIZ.append(", requestId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC20550615bE
    public final List<Aweme> getAwemeList() {
        List<FriendsFeed> list = this.friendFeedData;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<FriendsFeed> it2 = list.iterator();
        while (it2.hasNext()) {
            Aweme aweme = it2.next().getAweme();
            if (aweme != null) {
                arrayList.add(aweme);
            }
        }
        return arrayList;
    }

    @Override // X.InterfaceC20550615bE
    public final List<CardInsertResultInfo> getInsertResults() {
        List<CardInsertResultInfo> list = this.cardInsertResults;
        if (list != null) {
            return C13LP.LJJJJLI(list);
        }
        return null;
    }

    /* JADX INFO: renamed from: LJ, reason: merged with bridge method [inline-methods] */
    public final FriendsFeedResponse clone() {
        try {
            return (FriendsFeedResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            TryCatchGuardChecker.doCheck(e);
            return new FriendsFeedResponse(this.source, this.hasMore, this.friendFeedData, this.lastViewItemId, this.pageToken, this.logPb, this.preload, this.cardInsertResults, this.insertedResults, this.LL);
        }
    }

    @Override // X.InterfaceC20550615bE
    public final String getLogId() {
        return this.LL;
    }

    @Override // X.C0X12
    public final String getRequestId() {
        return this.LL;
    }

    @Override // X.C0X12
    public final void setRequestId(String str) {
        this.LL = str;
    }

    public static FriendsFeedResponse LJI(FriendsFeedResponse friendsFeedResponse, List list, int i) {
        int i2;
        boolean z;
        String str;
        String str2;
        LogPbBean logPbBean;
        List<CardInsertResultInfo> list2;
        List<InsertResultCode> list3;
        List list4 = list;
        int i3 = 0;
        if ((i & 1) != 0) {
            i2 = friendsFeedResponse.source;
        } else {
            i2 = 0;
        }
        if ((i & 2) != 0) {
            z = friendsFeedResponse.hasMore;
        } else {
            z = false;
        }
        if ((i & 4) != 0) {
            list4 = friendsFeedResponse.friendFeedData;
        }
        String str3 = null;
        if ((i & 8) != 0) {
            str = friendsFeedResponse.lastViewItemId;
        } else {
            str = null;
        }
        if ((i & 16) != 0) {
            str2 = friendsFeedResponse.pageToken;
        } else {
            str2 = null;
        }
        if ((i & 32) != 0) {
            logPbBean = friendsFeedResponse.logPb;
        } else {
            logPbBean = null;
        }
        if ((i & 64) != 0) {
            i3 = friendsFeedResponse.preload;
        }
        if ((i & 128) != 0) {
            list2 = friendsFeedResponse.cardInsertResults;
        } else {
            list2 = null;
        }
        if ((i & 256) != 0) {
            list3 = friendsFeedResponse.insertedResults;
        } else {
            list3 = null;
        }
        if ((i & 512) != 0) {
            str3 = friendsFeedResponse.LL;
        }
        return new FriendsFeedResponse(i2, z, list4, str, str2, logPbBean, i3, list2, list3, str3);
    }

    public FriendsFeedResponse(int i, boolean z, List<FriendsFeed> list, String str, String str2, LogPbBean logPbBean, int i2, List<CardInsertResultInfo> list2, List<InsertResultCode> list3, String str3) {
        this.source = i;
        this.hasMore = z;
        this.friendFeedData = list;
        this.lastViewItemId = str;
        this.pageToken = str2;
        this.logPb = logPbBean;
        this.preload = i2;
        this.cardInsertResults = list2;
        this.insertedResults = list3;
        this.LL = str3;
    }
}
