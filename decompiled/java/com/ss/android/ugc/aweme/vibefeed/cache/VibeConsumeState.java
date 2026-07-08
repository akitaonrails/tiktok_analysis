package com.ss.android.ugc.aweme.vibefeed.cache;

import X.C09CT;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class VibeConsumeState {

    @C09CT("feed_id")
    public final String feedId;

    @C09CT("filtered_ids")
    public final Set<String> filteredIds;

    @C09CT("interact_record")
    public final VibeInteractRecord interactRecord;

    @C09CT("item_records")
    public final List<VibeConsumedRecord> itemRecords;

    @C09CT("last_consumed")
    public String lastConsumed;

    @C09CT("sorted_ids")
    public final List<String> sortedIds;

    @C09CT("visit_finished_uids")
    public final List<String> visitFinishedUids;

    public VibeConsumeState() {
        this("", "", new ArrayList(), new ArrayList(), new ArrayList(), new VibeInteractRecord(0, 0, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE), new LinkedHashSet());
    }

    public VibeConsumeState(String str, String str2, List<String> list, List<VibeConsumedRecord> list2, List<String> list3, VibeInteractRecord vibeInteractRecord, Set<String> set) {
        this.feedId = str;
        this.lastConsumed = str2;
        this.sortedIds = list;
        this.itemRecords = list2;
        this.visitFinishedUids = list3;
        this.interactRecord = vibeInteractRecord;
        this.filteredIds = set;
    }
}
