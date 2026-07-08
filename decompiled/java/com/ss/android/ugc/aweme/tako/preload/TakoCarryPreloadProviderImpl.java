package com.ss.android.ugc.aweme.tako.preload;

import X.AnonymousClass0956;
import X.C054G;
import X.C098200Yq;
import X.C09A1;
import X.C0PEM;
import X.C0R2Q;
import X.C13BV;
import X.C13LP;
import X.C15438062q;
import X.C1818307Af;
import X.C1859570yUV;
import X.C1859580yUW;
import X.C1859590yUX;
import X.C1859600yUY;
import X.C1859710yUj;
import X.C1859730yUl;
import X.C1859740yUm;
import X.C1860390yVp;
import X.C189200o6;
import X.C19719512Dh;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2273971DzX;
import X.C2296808zG;
import X.C2296908zH;
import X.C23250099c;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.search.pages.result.common.reflist.core.model.ReferenceItemBridge;
import com.ss.android.ugc.aweme.search.pages.result.common.reflist.core.model.ReferenceLinkItemBridge;
import com.ss.android.ugc.aweme.search.pages.result.common.reflist.core.model.ReferenceVideoItemBridge;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseImage;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBlockInfo;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoCertInfo;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoClientExt;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoFollowInfo;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoLinkItem;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoPlaceholderSource;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoPrivateInfo;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoRelationInfo;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoSearchInfo;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoSourceItem;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoUserItem;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoVideoItem;
import com.ss.android.ugc.aweme.tako.entrance.ITakoCarryPreloadProvider;
import com.ss.android.ugc.aweme.tako.model.Link;
import com.ss.android.ugc.aweme.tako.model.SearchBingItem;
import com.ss.android.ugc.aweme.tako.model.SmartSearchItem;
import com.ss.android.ugc.aweme.tako.model.TakoEventTracker;
import com.ss.android.ugc.aweme.tako.model.TakoImageItem;
import com.ss.android.ugc.aweme.tako.model.TakoSearchCarryInItem;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS141S1100000_27;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoCarryPreloadProviderImpl implements ITakoCarryPreloadProvider {
    public final C054G LIZ = C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C0PEM.LIZJ));
    public AnonymousClass0956 LIZIZ;

    @Override // com.ss.android.ugc.aweme.tako.entrance.ITakoCarryPreloadProvider
    public final void LIZ() {
        AnonymousClass0956 anonymousClass0956 = this.LIZIZ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LIZIZ = null;
        C1859740yUm.LIZ.clear();
        C1859600yUY.LIZ.clear();
        C1859570yUV.LIZ.clear();
        C1859580yUW.LIZ.clear();
        C1859590yUX.LIZ.clear();
    }

    @Override // com.ss.android.ugc.aweme.tako.entrance.ITakoCarryPreloadProvider
    public final boolean LIZLLL() {
        return ((Boolean) C2273971DzX.LIZLLL.getValue()).booleanValue();
    }

    public static TakoSearchCarryInItem LJI(Function0 function0) {
        Object c098200Yq;
        String str;
        try {
            c098200Yq = (TakoSearchCarryInItem) function0.invoke();
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        TakoSearchCarryInItem takoSearchCarryInItem = (TakoSearchCarryInItem) c098200Yq;
        if (takoSearchCarryInItem == null || (str = takoSearchCarryInItem.text) == null || a0.LJJJIL(str)) {
            return null;
        }
        return takoSearchCarryInItem;
    }

    @Override // com.ss.android.ugc.aweme.tako.entrance.ITakoCarryPreloadProvider
    public final void LIZJ(String str) {
        if (str.length() == 0) {
            return;
        }
        C19719512Dh.LIZJ(C1859740yUm.LIZ).remove(str);
    }

    @Override // com.ss.android.ugc.aweme.tako.entrance.ITakoCarryPreloadProvider
    public final void LJ(String str, String str2, SmartSearchItem smartSearchItem) {
        if (str.length() != 0 && str2.length() != 0) {
            AwS141S1100000_27 awS141S1100000_27 = new AwS141S1100000_27(str, smartSearchItem, 6);
            TakoMixFeed takoMixFeedLJI = C1860390yVp.LJI(str2);
            awS141S1100000_27.invoke(takoMixFeedLJI);
            if (str.length() != 0) {
                C1859740yUm.LIZ.put(str, takoMixFeedLJI);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List<com.ss.android.ugc.aweme.tako.ccl.model.api.TakoVideoItem>] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v6, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.util.List<com.ss.android.ugc.aweme.tako.ccl.model.api.BaseImage>] */
    /* JADX WARN: Type inference failed for: r17v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r18v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r18v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r19v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v11, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.util.List<com.ss.android.ugc.aweme.tako.ccl.model.api.TakoSourceItem>] */
    /* JADX WARN: Type inference failed for: r1v22, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r20v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r20v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r21v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r23v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r24v1, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r24v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r25v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r25v2, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r26v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r26v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r27v1, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r27v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r28v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r28v2, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r29v1, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r29v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r30v1, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r30v2, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r31v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r31v2, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r32v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r34v1, types: [com.ss.android.ugc.aweme.tako.ccl.model.api.ImageExtraInfo] */
    /* JADX WARN: Type inference failed for: r35v2, types: [com.ss.android.ugc.aweme.tako.ccl.model.api.ImageExtraInfo] */
    /* JADX WARN: Type inference failed for: r36v1, types: [kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r37v1, types: [kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r76v1, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r77v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r79v0, types: [com.ss.android.ugc.aweme.tako.ccl.model.api.TakoLinkItem] */
    /* JADX WARN: Type inference failed for: r79v1, types: [com.ss.android.ugc.aweme.feed.model.Aweme] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v2, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.util.List<com.ss.android.ugc.aweme.tako.ccl.model.api.TakoLinkItem>] */
    /* JADX WARN: Type inference failed for: r80v0 */
    /* JADX WARN: Type inference failed for: r80v1, types: [com.ss.android.ugc.aweme.tako.ccl.model.api.ProductAnchor, com.ss.android.ugc.aweme.tako.ccl.model.api.TakoVideoItem, java.util.List] */
    /* JADX WARN: Type inference failed for: r80v2 */
    /* JADX WARN: Type inference failed for: r80v3 */
    /* JADX WARN: Type inference failed for: r80v4 */
    /* JADX WARN: Type inference failed for: r81v0, types: [com.ss.android.ugc.aweme.tako.ccl.model.api.TakoUserItem] */
    /* JADX WARN: Type inference failed for: r82v0, types: [com.ss.android.ugc.aweme.tako.ccl.model.api.TakoProductItem] */
    /* JADX WARN: Type inference failed for: r82v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r85v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r86v0, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r87v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r88v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r89v0, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r90v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r91v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r92v0, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r93v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r96v0, types: [com.ss.android.ugc.aweme.tako.ccl.model.api.ImageExtraInfo] */
    /* JADX WARN: Type inference failed for: r98v1, types: [kotlin.jvm.internal.DefaultConstructorMarker] */
    public static TakoMixFeed LJFF(String str, TakoSearchCarryInItem takoSearchCarryInItem, String str2, TakoEventTracker takoEventTracker, String str3, String str4) {
        String strLJJIII;
        ?? arrayList;
        String str5;
        String str6;
        String str7;
        String str8;
        String string;
        ?? arrayList2;
        ?? arrayList3;
        ?? arrayList4;
        int iIntValue;
        Integer num;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        Long lValueOf;
        List list;
        String str15;
        List<String> list2;
        long diggCount;
        List<String> urlList;
        UrlModel cover;
        String str16 = str4;
        String str17 = str3;
        ?? r80 = 0;
        r80 = 0;
        TakoMixFeed takoMixFeed = new TakoMixFeed(null, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 0, null, -1, 1023, null);
        String str18 = takoSearchCarryInItem.text;
        if (str18 == null || (strLJJIII = u.LJJIII(str18, "\n", "", false)) == null) {
            strLJJIII = "";
        }
        takoMixFeed.text = strLJJIII;
        List<Aweme> list3 = takoSearchCarryInItem.videos;
        if (list3 != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(list3, 10));
            for (Aweme aweme : list3) {
                String aid = aweme.getAid();
                if (aid == null) {
                    aid = "";
                }
                AwemeStatistics statistics = aweme.getStatistics();
                if (statistics != null) {
                    diggCount = statistics.getDiggCount();
                } else {
                    diggCount = 0;
                }
                Video video = aweme.getVideo();
                if (video == null || (cover = video.getCover()) == null || (urlList = cover.getUrlList()) == null) {
                    urlList = C13BV.INSTANCE;
                }
                r80 = 0;
                arrayList.add(new TakoVideoItem(aid, diggCount, new BaseImage(null, null, urlList, null, 0, 0, null, null, null, null, null, null, null, null, null, 0, 0, null, 262139, null), new TakoUserItem(0L, "", "", new BaseImage(null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, 0, 0, null, 262143, null), "", new TakoCertInfo(false, ""), new TakoRelationInfo(new TakoBlockInfo(false, false), new TakoFollowInfo(-1, -1, 0)), new TakoPrivateInfo(false)), "", 0L, null, null, new LinkedHashMap(), null, null));
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        takoMixFeed.videoList = arrayList;
        if (takoEventTracker == null || (str5 = takoEventTracker.logId) == null) {
            str5 = "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("-1");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        Pair[] pairArr = new Pair[6];
        if (str17 == null) {
            str17 = "";
        }
        pairArr[0] = new Pair("universal_rank", str17);
        if (takoEventTracker == null || (str6 = takoEventTracker.messageType) == null) {
            str6 = "";
        }
        pairArr[1] = new Pair("message_type", str6);
        if (takoEventTracker == null || (str7 = takoEventTracker.logId) == null) {
            str7 = "";
        }
        pairArr[2] = new Pair("log_id", str7);
        if (takoEventTracker == null || (str8 = takoEventTracker.idList) == null) {
            str8 = "";
        }
        pairArr[3] = new Pair("id_list", str8);
        if (takoEventTracker == null || (string = Integer.valueOf(takoEventTracker.isQuoteVideo()).toString()) == null) {
            string = "";
        }
        pairArr[4] = new Pair("is_quote_video", string);
        if (str16 == null) {
            str16 = "";
        }
        pairArr[5] = new Pair("abase_id", str16);
        takoMixFeed.clientExt = new TakoClientExt(strLIZIZ, str5, true, C2097608Jq.LJIIIIZZ(pairArr));
        List<SearchBingItem> list4 = takoSearchCarryInItem.bings;
        if (list4 != null) {
            arrayList2 = new ArrayList(C15438062q.LJIJJ(list4, 10));
            for (SearchBingItem searchBingItem : list4) {
                Link link = searchBingItem.link;
                if (link == null || (list2 = link.urlLink) == null || (str15 = (String) C13LP.LJJJLL(list2)) == null) {
                    str15 = "";
                }
                arrayList2.add(new TakoLinkItem(str15, searchBingItem.name, "", "", ""));
            }
        } else {
            arrayList2 = C13BV.INSTANCE;
        }
        takoMixFeed.linkList = arrayList2;
        List<TakoImageItem> list5 = takoSearchCarryInItem.images;
        if (list5 != null) {
            arrayList3 = new ArrayList(C15438062q.LJIJJ(list5, 10));
            for (TakoImageItem takoImageItem : list5) {
                arrayList3.add(new BaseImage(takoImageItem.imageId, r80, takoImageItem.urlList, r80, takoImageItem.width, takoImageItem.height, r80, r80, r80, r80, r80, r80, r80, r80, r80, 0, 0, r80, 262090, r80));
            }
        } else {
            arrayList3 = C13BV.INSTANCE;
        }
        takoMixFeed.images = arrayList3;
        List<ReferenceItemBridge> list6 = takoSearchCarryInItem.references;
        if (list6 != null) {
            arrayList4 = new ArrayList(C15438062q.LJIJJ(list6, 10));
            for (ReferenceItemBridge referenceItemBridge : list6) {
                TakoSourceItem takoSourceItem = new TakoSourceItem(referenceItemBridge.rank, referenceItemBridge.type, r80, r80, r80, r80);
                int i = referenceItemBridge.type;
                if (i != 0) {
                    if (i == 1) {
                        ReferenceVideoItemBridge referenceVideoItemBridge = referenceItemBridge.video;
                        if (referenceVideoItemBridge == null || (str14 = referenceVideoItemBridge.awemeId) == null) {
                            str14 = "";
                        }
                        if (referenceVideoItemBridge != null) {
                            lValueOf = Long.valueOf(referenceVideoItemBridge.diggCount);
                        } else {
                            lValueOf = null;
                        }
                        long jLIZIZ = C0R2Q.LIZIZ(lValueOf);
                        ReferenceVideoItemBridge referenceVideoItemBridge2 = referenceItemBridge.video;
                        if (referenceVideoItemBridge2 == null || (list = referenceVideoItemBridge2.coverUrlList) == null) {
                            list = C13BV.INSTANCE;
                        }
                        takoSourceItem.video = new TakoVideoItem(str14, jLIZIZ, new BaseImage(r80, r80, list, r80, 0, 0, r80, r80, r80, r80, r80, r80, r80, r80, r80, 0, 0, r80, 262139, r80), new TakoUserItem(0L, "", "", new BaseImage(r80, r80, r80, r80, 0, 0, r80, r80, r80, r80, r80, r80, r80, r80, r80, 0, 0, r80, 262143, r80), "", new TakoCertInfo(false, ""), new TakoRelationInfo(new TakoBlockInfo(false, false), new TakoFollowInfo(-1, -1, 0)), new TakoPrivateInfo(false)), "", 0L, r80, r80, new LinkedHashMap(), r80, r80);
                    }
                } else {
                    ReferenceLinkItemBridge referenceLinkItemBridge = referenceItemBridge.link;
                    if (referenceLinkItemBridge == null || (str9 = referenceLinkItemBridge.link) == null) {
                        str9 = "";
                    }
                    if (referenceLinkItemBridge == null || (str10 = referenceLinkItemBridge.name) == null) {
                        str10 = "";
                    }
                    if (referenceLinkItemBridge == null || (str11 = referenceLinkItemBridge.title) == null) {
                        str11 = "";
                    }
                    if (referenceLinkItemBridge == null || (str12 = referenceLinkItemBridge.snippet) == null) {
                        str12 = "";
                    }
                    if (referenceLinkItemBridge == null || (str13 = referenceLinkItemBridge.icon) == null) {
                        str13 = "";
                    }
                    takoSourceItem.link = new TakoLinkItem(str9, str10, str11, str12, str13);
                }
                arrayList4.add(takoSourceItem);
            }
        } else {
            arrayList4 = C13BV.INSTANCE;
        }
        takoMixFeed.sources = arrayList4;
        if (str2.length() > 0) {
            takoMixFeed.searchInfo = new TakoSearchInfo(str2);
        }
        HashMap<String, String> map = takoSearchCarryInItem.placeholderSources;
        if (!map.isEmpty()) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                TakoPlaceholderSource takoPlaceholderSourceLJ = C1860390yVp.LJ(entry.getValue());
                if (takoPlaceholderSourceLJ != null) {
                    takoMixFeed.placeholderSources.put(entry.getKey(), takoPlaceholderSourceLJ);
                }
            }
        }
        if (takoEventTracker != null && (num = takoEventTracker.cardType) != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 201;
        }
        takoMixFeed.cardType = iIntValue;
        return takoMixFeed;
    }

    @Override // com.ss.android.ugc.aweme.tako.entrance.ITakoCarryPreloadProvider
    public final void LIZIZ(Context context, String str, Function0<TakoSearchCarryInItem> function0, String str2, Function1<? super TakoSearchCarryInItem, TakoEventTracker> function1, String str3, String str4) {
        C1859730yUl c1859730yUl;
        TakoEventTracker c098200Yq;
        if (!((Boolean) C2273971DzX.LIZLLL.getValue()).booleanValue() || str.length() == 0) {
            return;
        }
        if (((Boolean) C1818307Af.LIZ.getValue()).booleanValue()) {
            TakoSearchCarryInItem takoSearchCarryInItemLJI = LJI(function0);
            if (takoSearchCarryInItemLJI == null) {
                return;
            }
            try {
                c098200Yq = function1.invoke(takoSearchCarryInItemLJI);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            c1859730yUl = new C1859730yUl(takoSearchCarryInItemLJI, (TakoEventTracker) c098200Yq);
        } else {
            c1859730yUl = null;
        }
        AnonymousClass0956 anonymousClass0956 = this.LIZIZ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LIZIZ = C23250099c.LIZLLL(this.LIZ, null, null, new C1859710yUj(c1859730yUl, this, function0, str, function1, str2, str3, str4, context, null), 3);
    }
}
