package com.bytedance.android.livesdk.qa;

import X.C09CT;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public final class QuestionList {

    @C09CT("has_more")
    public boolean hasMore;

    @C09CT("questions")
    public ArrayList<QuestionEx> questionExList;

    @C09CT("rec_req_id")
    public String recReqId;

    public QuestionList() {
        this(new ArrayList(), false, "");
    }

    public QuestionList(ArrayList<QuestionEx> arrayList, boolean z, String str) {
        this.questionExList = arrayList;
        this.hasMore = z;
        this.recReqId = str;
    }
}
