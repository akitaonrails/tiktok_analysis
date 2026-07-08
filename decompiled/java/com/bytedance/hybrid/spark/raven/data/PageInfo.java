package com.bytedance.hybrid.spark.raven.data;

import X.C09CT;
import X.C1161260gKC;
import com.google.gson.k;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class PageInfo implements Serializable {
    public static final C1161260gKC Companion = new Object() { // from class: X.0gKC
    };

    @C09CT("current_has_more")
    public final Boolean currentHasMore;

    @C09CT("data")
    public final k data;

    @C09CT("delete")
    public final DeleteInfo delete;

    @C09CT("insert")
    public final InsertInfo insert;

    @C09CT("load_more")
    public final List<String> loadMore;

    @C09CT("log_pb")
    public final k log_pb;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String pageId;

    @C09CT("protocol_version")
    public final Integer protocolVersion;

    @C09CT("refresh_body_only")
    public final Boolean refreshBodyOnly;

    @C09CT("response_type")
    public final Integer responseType;

    public PageInfo() {
        this(null, 0, null, null, null, null, null, null, null, null);
    }

    public final PageInfo copy(String str, Integer num, k kVar, k kVar2, Integer num2, Boolean bool, List<String> list, InsertInfo insertInfo, DeleteInfo deleteInfo, Boolean bool2) {
        return new PageInfo(str, num, kVar, kVar2, num2, bool, list, insertInfo, deleteInfo, bool2);
    }

    public PageInfo(String str, Integer num, k kVar, k kVar2, Integer num2, Boolean bool, List<String> list, InsertInfo insertInfo, DeleteInfo deleteInfo, Boolean bool2) {
        this.pageId = str;
        this.responseType = num;
        this.data = kVar;
        this.log_pb = kVar2;
        this.protocolVersion = num2;
        this.refreshBodyOnly = bool;
        this.loadMore = list;
        this.insert = insertInfo;
        this.delete = deleteInfo;
        this.currentHasMore = bool2;
    }
}
