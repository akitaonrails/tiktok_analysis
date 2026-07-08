package com.ss.android.ugc.aweme.setting.serverpush.model;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class PushOffReasonsData {

    @C09CT("desc")
    public final String description;

    @C09CT("frequency")
    public final int interval;

    @C09CT("reason")
    public final List<PushOffReason> reasonsList;

    @C09CT("title")
    public final String title;

    public PushOffReasonsData(int i, String str, String str2, List<PushOffReason> list) {
        this.interval = i;
        this.title = str;
        this.description = str2;
        this.reasonsList = list;
    }
}
