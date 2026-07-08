package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinEmbeddedPublishContent {

    @C09CT("text_inspirational_content_list")
    public final List<String> textHintList;

    public BulletinEmbeddedPublishContent() {
        this(null);
    }

    public BulletinEmbeddedPublishContent(List<String> list) {
        this.textHintList = list;
    }
}
