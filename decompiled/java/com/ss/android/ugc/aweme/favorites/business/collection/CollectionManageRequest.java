package com.ss.android.ugc.aweme.favorites.business.collection;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class CollectionManageRequest {

    @C09CT("add_ids")
    public final List<String> addIds;

    @C09CT("collaborative_uids")
    public final List<String> collaborativeUids;

    @C09CT("item_archive_id")
    public final String collectionId;

    @C09CT("item_archive_name")
    public final String collectionName;

    @C09CT("is_immediate_add_after_create")
    public final Integer isImmediateAddAfterCreate;

    @C09CT("item_archive_id_from")
    public final String moveFromCollectionId;

    @C09CT("move_ids")
    public final List<String> moveIds;

    @C09CT("item_archive_id_to")
    public final String moveToCollectionId;

    @C09CT("operation")
    public final int operation;

    @C09CT("remove_ids")
    public final List<String> removeIds;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final Integer status;

    @C09CT("biz_type")
    public final Integer type;

    public CollectionManageRequest(int i, String str, String str2, String str3, String str4, List<String> list, List<String> list2, List<String> list3, Integer num, List<String> list4, Integer num2, Integer num3) {
        this.operation = i;
        this.collectionId = str;
        this.collectionName = str2;
        this.moveFromCollectionId = str3;
        this.moveToCollectionId = str4;
        this.addIds = list;
        this.removeIds = list2;
        this.moveIds = list3;
        this.status = num;
        this.collaborativeUids = list4;
        this.type = num2;
        this.isImmediateAddAfterCreate = num3;
    }
}
