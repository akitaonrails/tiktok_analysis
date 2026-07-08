package com.ss.android.ugc.aweme.comment.model;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public final class RecCardControlInfo {

    @C09CT("ids_insert_rec_card")
    public final List<String> idsInsertRecCard;

    @C09CT("insert_interval")
    public final int insertInterval;

    @C09CT("show_at_bottom")
    public final boolean showAtBottom;

    public RecCardControlInfo(List<String> list, boolean z, int i) {
        this.idsInsertRecCard = list;
        this.showAtBottom = z;
        this.insertInterval = i;
    }
}
