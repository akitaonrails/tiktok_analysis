package com.ss.android.ugc.aweme.feed.model.live;

import X.C09CT;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class FeedRoomTagList implements Serializable {
    public String allSecondLabel;

    @C09CT("bc_toggle_tag")
    public List<FeedRoomTag> bcToggleTags;

    @C09CT("boost_toggle_tag")
    public List<FeedRoomTag> boostToggleTags;

    @C09CT("bottom_sub_tag")
    public List<FeedRoomTag> bottomSubTags;

    @C09CT("bottom_tag")
    public List<FeedRoomTag> bottomTags;
    public transient HashMap<String, String> firstSubTagDaInfoLocal;

    @C09CT("tag")
    public List<FeedRoomTag> firstTags;

    @C09CT("sub_tag")
    public List<FeedRoomTag> subTags;

    public FeedRoomTagList() {
        this(null, null, null, null, null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.HashMap<java.lang.String, java.lang.String> getFirstSubTagDaInfoLocal() {
        /*
            r3 = this;
            java.util.HashMap<java.lang.String, java.lang.String> r0 = r3.firstSubTagDaInfoLocal
            if (r0 != 0) goto L36
            java.util.List<com.ss.android.ugc.aweme.feed.model.live.FeedRoomTag> r0 = r3.subTags
            if (r0 == 0) goto L2f
            java.lang.Object r0 = X.C13LP.LJJJLL(r0)
            com.ss.android.ugc.aweme.feed.model.live.FeedRoomTag r0 = (com.ss.android.ugc.aweme.feed.model.live.FeedRoomTag) r0
            if (r0 == 0) goto L2f
            java.lang.String r2 = r0.daInfo
            if (r2 == 0) goto L2f
            com.google.gson.Gson r1 = X.C09C2.LIZ()     // Catch: java.lang.Exception -> L28
            com.ss.android.ugc.aweme.feed.model.live.FeedRoomTagList$getFirstSubTagDaInfoLocal$1$1 r0 = new com.ss.android.ugc.aweme.feed.model.live.FeedRoomTagList$getFirstSubTagDaInfoLocal$1$1     // Catch: java.lang.Exception -> L28
            r0.<init>()     // Catch: java.lang.Exception -> L28
            java.lang.reflect.Type r0 = r0.getType()     // Catch: java.lang.Exception -> L28
            java.lang.Object r0 = r1.LJIIIIZZ(r2, r0)     // Catch: java.lang.Exception -> L28
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch: java.lang.Exception -> L28
            goto L2d
        L28:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r0 = 0
        L2d:
            if (r0 != 0) goto L34
        L2f:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
        L34:
            r3.firstSubTagDaInfoLocal = r0
        L36:
            java.util.HashMap<java.lang.String, java.lang.String> r0 = r3.firstSubTagDaInfoLocal
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.model.live.FeedRoomTagList.getFirstSubTagDaInfoLocal():java.util.HashMap");
    }

    public final String getFirstTagsRecommendInfo() {
        List<FeedRoomTag> list = this.firstTags;
        if (list == null) {
            return null;
        }
        Iterator<FeedRoomTag> it2 = list.iterator();
        while (it2.hasNext()) {
            String str = it2.next().recommendInfo;
            if (str != null) {
                return str;
            }
        }
        return null;
    }

    public final void setAllSecondLabel(String str) {
        this.allSecondLabel = str;
    }

    public final void setBcToggleTags(List<FeedRoomTag> list) {
        this.bcToggleTags = list;
    }

    public final void setBoostToggleTags(List<FeedRoomTag> list) {
        this.boostToggleTags = list;
    }

    public final void setBottomSubTags(List<FeedRoomTag> list) {
        this.bottomSubTags = list;
    }

    public final void setBottomTags(List<FeedRoomTag> list) {
        this.bottomTags = list;
    }

    public final void setFirstTags(List<FeedRoomTag> list) {
        this.firstTags = list;
    }

    public final void setSubTags(List<FeedRoomTag> list) {
        this.subTags = list;
    }

    public FeedRoomTagList(List<FeedRoomTag> list, List<FeedRoomTag> list2, List<FeedRoomTag> list3, List<FeedRoomTag> list4, List<FeedRoomTag> list5, List<FeedRoomTag> list6) {
        this.firstTags = list;
        this.subTags = list2;
        this.bcToggleTags = list3;
        this.bottomTags = list4;
        this.bottomSubTags = list5;
        this.boostToggleTags = list6;
    }
}
