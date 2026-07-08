package com.ss.android.ugc.aweme.notification.frequency;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class EventEntry {
    public String LIZ;

    @C09CT("notice_list")
    public List<ReportNotice> noticeList;

    public EventEntry() {
        this(null, new ArrayList());
    }

    public EventEntry(String str, List<ReportNotice> list) {
        this.LIZ = str;
        this.noticeList = list;
    }
}
