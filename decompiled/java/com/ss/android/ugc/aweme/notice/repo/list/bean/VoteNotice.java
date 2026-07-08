package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.RelationDynamicLabel;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class VoteNotice {

    @C09CT("image_url")
    public UrlModel imageUrl;

    @C09CT("merge_count")
    public int mergeCount;

    @C09CT("option_text")
    public String optionText;

    @C09CT("ref_type")
    public int refType;

    @C09CT("relation_label")
    public RelationDynamicLabel relationLabel;

    @C09CT("schema_url")
    public String schemaUrl;

    @C09CT("from_user")
    public List<? extends User> userList;
}
