package com.ss.android.ugc.aweme.feed.model;

import X.C08JS;
import X.C1601740rme;
import X.C1601750rmf;
import X.C1AF0;
import X.C2095008Iq;
import X.C2188811AlT;
import X.EnumC1260920iuw;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.s;
import com.ss.android.ugc.aweme.feed.model.friends.FriendsFeed;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class FeedInsertRelationManager {
    public static final FeedInsertRelationManager INSTANCE = new FeedInsertRelationManager();
    public static final Map<String, InsertRelation> insertRelations = new LinkedHashMap();
    public static final int $stable = 8;

    public final String consume() {
        return consume(true);
    }

    public static final List<C1601740rme> toInsertRelationV2List(String str) {
        if (str == null) {
            return null;
        }
        try {
            List<InsertRelation> listLJ = C08JS.LJ(InsertRelation[].class, str);
            ArrayList arrayList = new ArrayList();
            for (InsertRelation insertRelation : listLJ) {
                C1601750rmf c1601750rmf = new C1601750rmf();
                c1601750rmf.LIZLLL = insertRelation.awemeId;
                c1601750rmf.LJ = Integer.valueOf(insertRelation.followStatus);
                arrayList.add(c1601750rmf.build());
            }
            return arrayList;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public final String consume(boolean z) {
        Map<String, InsertRelation> map = insertRelations;
        ArrayList arrayList = new ArrayList(map.values());
        if (z) {
            map.clear();
        }
        return C08JS.LIZLLL(arrayList);
    }

    public final int consume(String str) {
        Map<String, InsertRelation> map = insertRelations;
        InsertRelation insertRelation = map.get(str);
        if (insertRelation != null) {
            int i = insertRelation.followStatus;
            map.clear();
            return i;
        }
        return 0;
    }

    public final void appendMobParam(List<FriendsFeed> list, String str) {
        String str2 = "unknown";
        if (list == null || str == null) {
            return;
        }
        try {
            for (InsertRelation insertRelation : C08JS.LJ(InsertRelation[].class, str)) {
                for (FriendsFeed friendsFeed : list) {
                    Aweme aweme = friendsFeed.getAweme();
                    if (aweme != null && Intrinsics.LJFF(aweme.aid, insertRelation.awemeId)) {
                        Aweme aweme2 = friendsFeed.getAweme();
                        if (aweme2 != null) {
                            AwemeExtKt.appendMobParam(aweme2, "scene_type", EnumC1260920iuw.PUSH.getType());
                        }
                        Aweme aweme3 = friendsFeed.getAweme();
                        if (aweme3 != null) {
                            AwemeExtKt.appendMobParam(aweme3, "previous_page", EnumC1260920iuw.PUSH.getType());
                        }
                    }
                }
            }
        } catch (s e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("appendMobParam for 2tab fail JsonSyntaxException: ");
            String message = e.getMessage();
            if (message != null) {
                str2 = message;
            }
            sbLIZ.append(str2);
            C2188811AlT.LIZIZ(sbLIZ);
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C1AF0.LJ(e2);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("appendMobParam for 2tab fail exception: ");
            String message2 = e2.getMessage();
            if (message2 != null) {
                str2 = message2;
            }
            sbLIZ2.append(str2);
            C2188811AlT.LIZIZ(sbLIZ2);
        }
    }

    public final void put(ArrayList<String> arrayList, String str) {
        Iterator<String> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            INSTANCE.put(it2.next(), str);
        }
    }

    public final void appendMobParam(FeedItemList feedItemList, String str) {
        List<Aweme> list;
        String str2 = "unknown";
        if (str == null) {
            return;
        }
        try {
            for (InsertRelation insertRelation : C08JS.LJ(InsertRelation[].class, str)) {
                if (feedItemList != null && (list = feedItemList.items) != null) {
                    for (Aweme aweme : list) {
                        if (Intrinsics.LJFF(aweme.aid, insertRelation.awemeId)) {
                            EnumC1260920iuw enumC1260920iuw = EnumC1260920iuw.PUSH;
                            AwemeExtKt.appendMobParam(aweme, "scene_type", enumC1260920iuw.getType());
                            AwemeExtKt.appendMobParam(aweme, "previous_page", enumC1260920iuw.getType());
                        }
                    }
                }
            }
        } catch (s e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("appendMobParam for FYP fail JsonSyntaxException: ");
            String message = e.getMessage();
            if (message != null) {
                str2 = message;
            }
            sbLIZ.append(str2);
            C2188811AlT.LIZIZ(sbLIZ);
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C1AF0.LJ(e2);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("appendMobParam for FYP fail exception: ");
            String message2 = e2.getMessage();
            if (message2 != null) {
                str2 = message2;
            }
            sbLIZ2.append(str2);
            C2188811AlT.LIZIZ(sbLIZ2);
        }
    }

    public final void put(String str, String str2) {
        Integer numLJIIJJI = C2095008Iq.LJIIJJI(str2);
        if (numLJIIJJI != null) {
            insertRelations.put(str, new InsertRelation(str, numLJIIJJI.intValue()));
        }
    }

    public final Aweme appendMobParam(Aweme aweme, int i) {
        if (i == 3 && aweme != null) {
            AwemeExtKt.appendMobParam(aweme, "scene_type", EnumC1260920iuw.PUSH.getType());
            AwemeExtKt.appendMobParam(aweme, "previous_page", EnumC1260920iuw.PUSH.getType());
        }
        return aweme;
    }
}
