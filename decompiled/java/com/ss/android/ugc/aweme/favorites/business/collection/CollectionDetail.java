package com.ss.android.ugc.aweme.favorites.business.collection;

import X.C09CT;
import X.C2188811AlT;
import X.InterfaceC111300bX;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class CollectionDetail implements InterfaceC111300bX {

    @C09CT("collaborative_user_list")
    public final List<CollaborativeUser> collaborativeUserList;

    @C09CT("covers")
    public final List<UrlModel> covers;

    @C09CT("creator_name")
    public String creatorName;

    @C09CT("extra")
    public final String extra;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    @C09CT("name")
    public String name;

    @C09CT("share_info")
    public final ShareStruct shareInfo;

    @C09CT("statistic")
    public Statistic statistic;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final Status status;

    @C09CT("item_archive_biz_type")
    public final Integer type;

    @C09CT("uid")
    public String uid;

    public CollectionDetail() {
        this(null, null, null, null, null, null, null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CollectionDetail)) {
            return false;
        }
        CollectionDetail collectionDetail = (CollectionDetail) obj;
        return Intrinsics.LJFF(this.id, collectionDetail.id) && Intrinsics.LJFF(this.name, collectionDetail.name) && Intrinsics.LJFF(this.covers, collectionDetail.covers) && Intrinsics.LJFF(this.status, collectionDetail.status) && Intrinsics.LJFF(this.statistic, collectionDetail.statistic) && Intrinsics.LJFF(this.uid, collectionDetail.uid) && Intrinsics.LJFF(this.shareInfo, collectionDetail.shareInfo) && Intrinsics.LJFF(this.creatorName, collectionDetail.creatorName) && Intrinsics.LJFF(this.extra, collectionDetail.extra) && Intrinsics.LJFF(this.collaborativeUserList, collectionDetail.collaborativeUserList) && Intrinsics.LJFF(this.type, collectionDetail.type);
    }

    public final int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<UrlModel> list = this.covers;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Status status = this.status;
        int iHashCode4 = (iHashCode3 + (status == null ? 0 : status.hashCode())) * 31;
        Statistic statistic = this.statistic;
        int iHashCode5 = (iHashCode4 + (statistic == null ? 0 : statistic.hashCode())) * 31;
        String str3 = this.uid;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ShareStruct shareStruct = this.shareInfo;
        int iHashCode7 = (iHashCode6 + (shareStruct == null ? 0 : shareStruct.hashCode())) * 31;
        String str4 = this.creatorName;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.extra;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List<CollaborativeUser> list2 = this.collaborativeUserList;
        int iHashCode10 = (iHashCode9 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num = this.type;
        return iHashCode10 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "CollectionDetail(id=" + this.id + ", name=" + this.name + ", covers=" + this.covers + ", status=" + this.status + ", statistic=" + this.statistic + ", uid=" + this.uid + ", shareInfo=" + this.shareInfo + ", creatorName=" + this.creatorName + ", extra=" + this.extra + ", collaborativeUserList=" + this.collaborativeUserList + ", type=" + this.type + ')';
    }

    public static final class Status {

        @C09CT("state")
        public Integer state;

        public Status() {
            this(null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Status) && Intrinsics.LJFF(this.state, ((Status) obj).state);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Status(state=");
            sbLIZ.append(this.state);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public Status(Integer num) {
            this.state = num;
        }
    }

    public static final class Statistic {

        @C09CT("has_videos")
        public final boolean hasVideos;

        @C09CT("total")
        public Long total;

        public Statistic() {
            this(null, false);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Statistic)) {
                return false;
            }
            Statistic statistic = (Statistic) obj;
            return Intrinsics.LJFF(this.total, statistic.total) && this.hasVideos == statistic.hasVideos;
        }

        public Statistic(Long l, boolean z) {
            this.total = l;
            this.hasVideos = z;
        }
    }

    public static final class ShareStruct {

        @C09CT("share_desc")
        public final String desc;

        @C09CT("share_desc_info")
        public final String descInfo;

        @C09CT("share_title")
        public final String title;

        @C09CT("share_url")
        public final String url;

        public ShareStruct() {
            this(null, null, null, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShareStruct)) {
                return false;
            }
            ShareStruct shareStruct = (ShareStruct) obj;
            return Intrinsics.LJFF(this.url, shareStruct.url) && Intrinsics.LJFF(this.desc, shareStruct.desc) && Intrinsics.LJFF(this.title, shareStruct.title) && Intrinsics.LJFF(this.descInfo, shareStruct.descInfo);
        }

        public ShareStruct(String str, String str2, String str3, String str4) {
            this.url = str;
            this.desc = str2;
            this.title = str3;
            this.descInfo = str4;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CollectionDetail(String str, String str2, List<? extends UrlModel> list, Status status, Statistic statistic, String str3, ShareStruct shareStruct, String str4, String str5, List<CollaborativeUser> list2, Integer num) {
        this.id = str;
        this.name = str2;
        this.covers = list;
        this.status = status;
        this.statistic = statistic;
        this.uid = str3;
        this.shareInfo = shareStruct;
        this.creatorName = str4;
        this.extra = str5;
        this.collaborativeUserList = list2;
        this.type = num;
    }
}
