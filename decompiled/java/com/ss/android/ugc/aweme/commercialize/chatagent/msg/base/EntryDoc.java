package com.ss.android.ugc.aweme.commercialize.chatagent.msg.base;

import X.C09CT;
import X.C786410Ut5;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class EntryDoc {
    public final transient String LIZ;
    public final transient ActionEntryDoc LIZIZ;

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
    public List<Object> visualSearchContextMessages;

    public EntryDoc() {
        this("", new ActionEntryDoc(null, 1, null), "", new HashMap(), 0.0f, 0L, "", "", "", "", "", "", "", null, null, null);
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((((((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.gid.hashCode()) * 31) + this.pred.hashCode()) * 31) + Float.floatToIntBits(this.textFactor)) * 31) + C786410Ut5.Y2(this.viewDuration)) * 31) + this.feedBar.hashCode()) * 31) + this.enterFrom.hashCode()) * 31) + this.enterMethod.hashCode()) * 31) + this.subEnterMethod.hashCode()) * 31) + this.firstReplyStatus.hashCode()) * 31) + this.searchId.hashCode()) * 31) + this.feedConsumeInfos.hashCode()) * 31;
        String str = this.sarInfo;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.location;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<Object> list = this.visualSearchContextMessages;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public EntryDoc(String str, ActionEntryDoc actionEntryDoc, String str2, Map<String, Float> map, float f, long j, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List<Object> list) {
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
    }
}
