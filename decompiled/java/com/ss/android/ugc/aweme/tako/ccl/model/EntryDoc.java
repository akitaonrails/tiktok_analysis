package com.ss.android.ugc.aweme.tako.ccl.model;

import X.C09CT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.tako.ccl.model.api.UpSyncMessage;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class EntryDoc {
    public final transient String LIZ;
    public final transient ActionEntryDoc LIZIZ;
    public final transient Map<String, String> LIZJ;

    @C09CT("ask_msg_id")
    public String askMsgId;

    @C09CT("enter_from")
    public final String enterFrom;

    @C09CT("enter_method")
    public final String enterMethod;

    @C09CT("feed_bar")
    public final String feedBar;

    @C09CT("feed_consume_infos")
    public final String feedConsumeInfos;

    @C09CT("first_reply_read_status")
    public final String firstReplyStatus;

    @C09CT("gid")
    public final String gid;

    @C09CT("location")
    public String location;

    @C09CT("pred")
    public final Map<String, Float> pred;

    @C09CT("sar_info")
    public final String sarInfo;

    @C09CT("search_id")
    public final String searchId;

    @C09CT("sub_enter_method")
    public final String subEnterMethod;

    @C09CT("text_factor")
    public final float textFactor;

    @C09CT("view_duration")
    public final long viewDuration;

    @C09CT("messages")
    public List<UpSyncMessage> visualSearchContextMessages;

    public EntryDoc() {
        this("", new ActionEntryDoc(null, 1, null), "", new HashMap(), 0.0f, 0L, "", "", "", "", "", "", "", null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EntryDoc)) {
            return false;
        }
        EntryDoc entryDoc = (EntryDoc) obj;
        return Intrinsics.LJFF(this.LIZ, entryDoc.LIZ) && Intrinsics.LJFF(this.LIZIZ, entryDoc.LIZIZ) && Intrinsics.LJFF(this.gid, entryDoc.gid) && Intrinsics.LJFF(this.pred, entryDoc.pred) && Float.compare(this.textFactor, entryDoc.textFactor) == 0 && this.viewDuration == entryDoc.viewDuration && Intrinsics.LJFF(this.feedBar, entryDoc.feedBar) && Intrinsics.LJFF(this.enterFrom, entryDoc.enterFrom) && Intrinsics.LJFF(this.enterMethod, entryDoc.enterMethod) && Intrinsics.LJFF(this.subEnterMethod, entryDoc.subEnterMethod) && Intrinsics.LJFF(this.firstReplyStatus, entryDoc.firstReplyStatus) && Intrinsics.LJFF(this.searchId, entryDoc.searchId) && Intrinsics.LJFF(this.feedConsumeInfos, entryDoc.feedConsumeInfos) && Intrinsics.LJFF(this.sarInfo, entryDoc.sarInfo) && Intrinsics.LJFF(this.location, entryDoc.location) && Intrinsics.LJFF(this.visualSearchContextMessages, entryDoc.visualSearchContextMessages) && Intrinsics.LJFF(this.askMsgId, entryDoc.askMsgId) && Intrinsics.LJFF(this.LIZJ, entryDoc.LIZJ);
    }

    public final String toString() {
        return "EntryDoc(uid=" + this.LIZ + ", actionEntryDoc=" + this.LIZIZ + ", gid=" + this.gid + ", pred=" + this.pred + ", textFactor=" + this.textFactor + ", viewDuration=" + this.viewDuration + ", feedBar=" + this.feedBar + ", enterFrom=" + this.enterFrom + ", enterMethod=" + this.enterMethod + ", subEnterMethod=" + this.subEnterMethod + ", firstReplyStatus=" + this.firstReplyStatus + ", searchId=" + this.searchId + ", feedConsumeInfos=" + this.feedConsumeInfos + ", sarInfo=" + this.sarInfo + ", location=" + this.location + ", visualSearchContextMessages=" + this.visualSearchContextMessages + ", askMsgId=" + this.askMsgId + ", customParams=" + this.LIZJ + ')';
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((((((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.gid.hashCode()) * 31) + this.pred.hashCode()) * 31) + Float.floatToIntBits(this.textFactor)) * 31) + C786410Ut5.Y2(this.viewDuration)) * 31) + this.feedBar.hashCode()) * 31) + this.enterFrom.hashCode()) * 31) + this.enterMethod.hashCode()) * 31) + this.subEnterMethod.hashCode()) * 31) + this.firstReplyStatus.hashCode()) * 31) + this.searchId.hashCode()) * 31) + this.feedConsumeInfos.hashCode()) * 31;
        String str = this.sarInfo;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.location;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<UpSyncMessage> list = this.visualSearchContextMessages;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.askMsgId;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Map<String, String> map = this.LIZJ;
        return iHashCode5 + (map != null ? map.hashCode() : 0);
    }

    public EntryDoc(String str, ActionEntryDoc actionEntryDoc, String str2, Map<String, Float> map, float f, long j, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List<UpSyncMessage> list, String str12, Map<String, String> map2) {
        this.LIZ = str;
        this.LIZIZ = actionEntryDoc;
        this.gid = str2;
        this.pred = map;
        this.textFactor = f;
        this.viewDuration = j;
        this.feedBar = str3;
        this.enterFrom = str4;
        this.enterMethod = str5;
        this.subEnterMethod = str6;
        this.firstReplyStatus = str7;
        this.searchId = str8;
        this.feedConsumeInfos = str9;
        this.sarInfo = str10;
        this.location = str11;
        this.visualSearchContextMessages = list;
        this.askMsgId = str12;
        this.LIZJ = map2;
    }
}
