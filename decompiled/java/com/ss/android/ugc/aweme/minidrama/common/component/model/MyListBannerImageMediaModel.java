package com.ss.android.ugc.aweme.minidrama.common.component.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class MyListBannerImageMediaModel implements Serializable {

    @C09CT("expire_time")
    public final Long expireTime;

    @C09CT("ladder_infos")
    public final List<Object> ladderInfos;

    @C09CT("original_meta_info")
    public final MyListBannerMetaInfo originalMetaInfo;

    @C09CT("original_uri")
    public final String originalUri;

    @C09CT("pack_source_info")
    public final MyListBannerPackSourceInfo packSourceInfo;

    public MyListBannerImageMediaModel() {
        this(null, null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MyListBannerImageMediaModel)) {
            return false;
        }
        MyListBannerImageMediaModel myListBannerImageMediaModel = (MyListBannerImageMediaModel) obj;
        return Intrinsics.LJFF(this.originalUri, myListBannerImageMediaModel.originalUri) && Intrinsics.LJFF(this.originalMetaInfo, myListBannerImageMediaModel.originalMetaInfo) && Intrinsics.LJFF(this.ladderInfos, myListBannerImageMediaModel.ladderInfos) && Intrinsics.LJFF(this.expireTime, myListBannerImageMediaModel.expireTime) && Intrinsics.LJFF(this.packSourceInfo, myListBannerImageMediaModel.packSourceInfo);
    }

    public int hashCode() {
        String str = this.originalUri;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        MyListBannerMetaInfo myListBannerMetaInfo = this.originalMetaInfo;
        int iHashCode2 = (iHashCode + (myListBannerMetaInfo == null ? 0 : myListBannerMetaInfo.hashCode())) * 31;
        List<Object> list = this.ladderInfos;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Long l = this.expireTime;
        int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        MyListBannerPackSourceInfo myListBannerPackSourceInfo = this.packSourceInfo;
        return iHashCode4 + (myListBannerPackSourceInfo != null ? myListBannerPackSourceInfo.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MyListBannerImageMediaModel(originalUri=");
        sbLIZ.append(this.originalUri);
        sbLIZ.append(", originalMetaInfo=");
        sbLIZ.append(this.originalMetaInfo);
        sbLIZ.append(", ladderInfos=");
        sbLIZ.append(this.ladderInfos);
        sbLIZ.append(", expireTime=");
        sbLIZ.append(this.expireTime);
        sbLIZ.append(", packSourceInfo=");
        sbLIZ.append(this.packSourceInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public MyListBannerImageMediaModel(String str, MyListBannerMetaInfo myListBannerMetaInfo, List<Object> list, Long l, MyListBannerPackSourceInfo myListBannerPackSourceInfo) {
        this.originalUri = str;
        this.originalMetaInfo = myListBannerMetaInfo;
        this.ladderInfos = list;
        this.expireTime = l;
        this.packSourceInfo = myListBannerPackSourceInfo;
    }
}
