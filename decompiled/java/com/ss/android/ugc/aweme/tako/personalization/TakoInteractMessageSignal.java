package com.ss.android.ugc.aweme.tako.personalization;

import X.C09CT;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoInteractMessageSignal {

    @C09CT("is_copy")
    public Boolean isCopy;

    @C09CT("is_delete")
    public Boolean isDelete;

    @C09CT("is_dislike")
    public Boolean isDislike;

    @C09CT("is_like")
    public Boolean isLike;

    @C09CT("is_report")
    public Boolean isReport;

    @C09CT("is_select_text")
    public Boolean isSelectText;

    @C09CT("is_share")
    public Boolean isShare;

    @C09CT("message_id")
    public final String messageId;

    public TakoInteractMessageSignal() {
        this("", null, null, null, null, null, null, null);
    }

    public TakoInteractMessageSignal(String str, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7) {
        this.messageId = str;
        this.isLike = bool;
        this.isDislike = bool2;
        this.isCopy = bool3;
        this.isSelectText = bool4;
        this.isDelete = bool5;
        this.isReport = bool6;
        this.isShare = bool7;
    }
}
