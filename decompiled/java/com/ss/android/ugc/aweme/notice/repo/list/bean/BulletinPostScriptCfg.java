package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinPostScriptCfg {

    @C09CT("card_type")
    public final Long cardType;

    @C09CT("item_type")
    public final Integer itemType;

    @C09CT("post_scripts")
    public final List<String> postScripts;

    public BulletinPostScriptCfg() {
        this(null, null, null);
    }

    public BulletinPostScriptCfg(Integer num, Long l, List<String> list) {
        this.itemType = num;
        this.cardType = l;
        this.postScripts = list;
    }
}
