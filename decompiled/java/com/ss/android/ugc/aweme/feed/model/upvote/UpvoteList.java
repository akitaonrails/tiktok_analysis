package com.ss.android.ugc.aweme.feed.model.upvote;

import X.C09CT;
import X.C13BV;
import X.C2097608Jq;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes22.dex */
public final class UpvoteList implements Serializable {

    @C09CT("carrier_upvotes")
    public final Map<String, List<UpvoteStruct>> carrierUpvotes;

    @C09CT("cursor")
    public final long cursor;

    @C09CT("emoji_list")
    public final List<String> emojis;
    public final List<String> forceInsertRepostUids;

    @C09CT("has_more")
    public final boolean hasMore;
    public final String insertUid;

    @C09CT("item_id")
    public final String itemId;
    public final List<UpvoteStruct> mafUpvotes;

    @C09CT("repost_count")
    public final long repostCount;
    public long timestamp;

    @C09CT("total")
    public final long total;

    @C09CT("upvotes")
    public final List<UpvoteStruct> upvotes;

    public UpvoteList() {
        this(null, 0L, false, 0L, null, null, 0L, null, null, null, null, 0L, 4095, null);
    }

    public final UpvoteList copy(List<UpvoteStruct> list, long j, boolean z, long j2, String str, List<String> list2, long j3, Map<String, ? extends List<UpvoteStruct>> map, List<UpvoteStruct> list3, String str2, List<String> list4, long j4) {
        return new UpvoteList(list, j, z, j2, str, list2, j3, map, list3, str2, list4, j4);
    }

    public String toString() {
        return "UpvoteList(upvotes=" + this.upvotes + ", cursor=" + this.cursor + ", hasMore=" + this.hasMore + ", total=" + this.total + ", itemId=" + this.itemId + ", emojis=" + this.emojis + ", repostCount=" + this.repostCount + ", carrierUpvotes=" + this.carrierUpvotes + ", mafUpvotes=" + this.mafUpvotes + ", insertUid=" + this.insertUid + ", forceInsertRepostUids=" + this.forceInsertRepostUids + ", timestamp=" + this.timestamp + ')';
    }

    public final List<UpvoteStruct> getCommentUpvotes() {
        List<UpvoteStruct> list = this.carrierUpvotes.get(String.valueOf(CarrierType.COMMENT.getValue()));
        return list == null ? C13BV.INSTANCE : list;
    }

    public final void setTimestamp(long j) {
        this.timestamp = j;
    }

    public final UpvoteList withCommentUpvotes(List<UpvoteStruct> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(this.carrierUpvotes);
        linkedHashMap.put(String.valueOf(CarrierType.COMMENT.getValue()), list);
        return copy(this.upvotes, this.cursor, this.hasMore, this.total, this.itemId, this.emojis, this.repostCount, linkedHashMap, this.mafUpvotes, this.insertUid, this.forceInsertRepostUids, this.timestamp);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UpvoteList(List<UpvoteStruct> list, long j, boolean z, long j2, String str, List<String> list2, long j3, Map<String, ? extends List<UpvoteStruct>> map, List<UpvoteStruct> list3, String str2, List<String> list4, long j4) {
        this.upvotes = list;
        this.cursor = j;
        this.hasMore = z;
        this.total = j2;
        this.itemId = str;
        this.emojis = list2;
        this.repostCount = j3;
        this.carrierUpvotes = map;
        this.mafUpvotes = list3;
        this.insertUid = str2;
        this.forceInsertRepostUids = list4;
        this.timestamp = j4;
    }

    public UpvoteList(List list, long j, boolean z, long j2, String str, List list2, long j3, Map map, List list3, String str2, List list4, long j4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? false : z, (i & 8) != 0 ? 0L : j2, (i & 16) != 0 ? "" : str, (i & 32) != 0 ? C13BV.INSTANCE : list2, (i & 64) == 0 ? j3 : 0L, (i & 128) != 0 ? C2097608Jq.LJ() : map, (i & 256) != 0 ? null : list3, (i & 512) != 0 ? null : str2, (i & 1024) == 0 ? list4 : null, (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? System.currentTimeMillis() : j4);
    }
}
