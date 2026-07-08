package com.ss.android.ugc.aweme.feed.model.im;

import X.C13BV;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class AIGroupShotResultModel {
    public final List<AIGroupShotMentionInfoModel> mentionInfo;
    public final Pair<Integer, Integer> resolution;
    public final String secretKey;
    public final String uri;
    public final List<String> urlList;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIGroupShotResultModel)) {
            return false;
        }
        AIGroupShotResultModel aIGroupShotResultModel = (AIGroupShotResultModel) obj;
        return Intrinsics.LJFF(this.resolution, aIGroupShotResultModel.resolution) && Intrinsics.LJFF(this.urlList, aIGroupShotResultModel.urlList) && Intrinsics.LJFF(this.uri, aIGroupShotResultModel.uri) && Intrinsics.LJFF(this.secretKey, aIGroupShotResultModel.secretKey) && Intrinsics.LJFF(this.mentionInfo, aIGroupShotResultModel.mentionInfo);
    }

    public int hashCode() {
        return (((((((this.resolution.hashCode() * 31) + this.urlList.hashCode()) * 31) + this.uri.hashCode()) * 31) + this.secretKey.hashCode()) * 31) + this.mentionInfo.hashCode();
    }

    public AIGroupShotResultModel(Pair<Integer, Integer> pair, List<String> list, String str, String str2, List<AIGroupShotMentionInfoModel> list2) {
        this.resolution = pair;
        this.urlList = list;
        this.uri = str;
        this.secretKey = str2;
        this.mentionInfo = list2;
    }

    public AIGroupShotResultModel(Pair pair, List list, String str, String str2, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(pair, list, str, str2, (i & 16) != 0 ? C13BV.INSTANCE : list2);
    }
}
