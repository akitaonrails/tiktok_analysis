package kotlin.jvm.internal;

import X.AnonymousClass0956;
import X.C09AY;
import X.C150D;
import X.C15438062q;
import X.C158Y;
import X.C158Z;
import X.C15SM;
import X.C15SN;
import X.C15T7;
import X.C15T8;
import X.C15TA;
import X.C15V2;
import X.C1623706Xj;
import X.C1867990yi5;
import X.C20425414w8;
import X.C20425514w9;
import X.C20426114wF;
import X.C20426214wG;
import X.C20441214yg;
import X.C204708158g;
import X.C20486515Eh;
import X.C20487315Ep;
import X.C20521215Rq;
import X.C20523715Sp;
import X.C20526015Tm;
import X.C20532515Vz;
import X.C20611415l2;
import X.C2153908cD;
import X.C2188811AlT;
import X.C291001Au;
import X.C725930Sdj;
import android.os.SystemClock;
import com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.SymphonyEngine;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.explore.data.ExploreTopicAwemeListResponse;
import com.ss.android.ugc.aweme.explore.vm.ExploreFeedListViewModel;
import com.ss.android.ugc.aweme.explore.vm.ExploreTopicGeneralFeedListViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tag.viewmodel.VideoTagFriendsListViewModel;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes32.dex */
public class AwS145S1100000_31 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS145S1100000_31 awS145S1100000_31, Object obj) throws JSONException {
        JSONObject jSONObject = (JSONObject) obj;
        jSONObject.put("previous_page", "video_edit_page");
        jSONObject.put("to_user_id", ((C20611415l2) awS145S1100000_31.l1).LIZ);
        jSONObject.put("user_type", awS145S1100000_31.s0);
        jSONObject.put("search_keyword", "");
        jSONObject.put("function", "mention");
        jSONObject.put("is_valid", String.valueOf(((C20611415l2) awS145S1100000_31.l1).LJIJJ.LIZ ? 1 : 0));
        jSONObject.put("click_type", "choose");
        jSONObject.put("enter_from", "video_post_page");
        jSONObject.put(Scene.SCENE_SERVICE, "publish_mention");
        jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, 1);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS145S1100000_31 awS145S1100000_31, Object obj) throws JSONException {
        JSONObject jSONObject = (JSONObject) obj;
        jSONObject.put("enter_from", "video_post_page");
        jSONObject.put("previous_page", "video_edit_page");
        jSONObject.put("to_user_id", ((C20611415l2) awS145S1100000_31.l1).LIZ);
        jSONObject.put("user_type", awS145S1100000_31.s0);
        jSONObject.put("search_keyword", "");
        jSONObject.put("function", "mention");
        jSONObject.put(Scene.SCENE_SERVICE, "publish_mention");
        jSONObject.put("is_valid", String.valueOf(((C20611415l2) awS145S1100000_31.l1).LJIJJ.LIZ ? 1 : 0));
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS145S1100000_31 awS145S1100000_31, Object obj) throws JSONException {
        JSONObject jSONObject = (JSONObject) obj;
        jSONObject.put("previous_page", ((VideoTagFriendsListViewModel) awS145S1100000_31.l1).vQ2().getEnterFrom());
        jSONObject.put("tag_num", ((VideoTagFriendsListViewModel) awS145S1100000_31.l1).xQ2().size());
        jSONObject.put("function", "tag");
        jSONObject.put("close_type", awS145S1100000_31.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS145S1100000_31 awS145S1100000_31, Object obj) throws JSONException {
        JSONObject jSONObject = (JSONObject) obj;
        jSONObject.put("previous_page", ((VideoTagFriendsListViewModel) awS145S1100000_31.l1).vQ2().getEnterFrom());
        jSONObject.put("tag_num", ((VideoTagFriendsListViewModel) awS145S1100000_31.l1).xQ2().size());
        jSONObject.put("function", "tag");
        jSONObject.put("close_type", awS145S1100000_31.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS145S1100000_31 awS145S1100000_31, Object obj) {
        return C204708158g.LIZ((C204708158g) obj, null, null, new C291001Au(new C158Z((C158Y) awS145S1100000_31.l1, awS145S1100000_31.s0)), null, null, null, null, null, null, null, 1019);
    }

    public static final Object invoke$3(AwS145S1100000_31 awS145S1100000_31, Object obj) {
        Long l;
        String str;
        C20521215Rq c20521215Rq;
        C15V2 c15v2;
        C15V2 c15v22;
        C15SM c15sm = (C15SM) obj;
        c15sm.getClass();
        if (!(c15sm.getListState().LL instanceof C1623706Xj)) {
            String str2 = null;
            if (((ExploreFeedListViewModel) awS145S1100000_31.l1).LLJJLIIIJLLLLLLLZ.get()) {
                ((ExploreFeedListViewModel) awS145S1100000_31.l1).LLJJLIIIJLLLLLLLZ.set(false);
                AnonymousClass0956 anonymousClass0956 = ((ExploreFeedListViewModel) awS145S1100000_31.l1).LLJJJJ;
                if (anonymousClass0956 != null) {
                    anonymousClass0956.LIZIZ(null);
                }
                ((ExploreFeedListViewModel) awS145S1100000_31.l1).LLJJJJ = null;
            }
            ((ExploreFeedListViewModel) awS145S1100000_31.l1).LLJLLIL = c15sm.getListState().LL;
            if (Intrinsics.LJFF(awS145S1100000_31.s0, "init")) {
                C15TA.LIZ.getClass();
                C20523715Sp.LIZ.getClass();
                C20523715Sp.LIZJ = SystemClock.elapsedRealtime();
                ((ExploreFeedListViewModel) awS145S1100000_31.l1).LLILZIL = true;
            } else if (((ExploreFeedListViewModel) awS145S1100000_31.l1).LLJLILLLLZIIL) {
                C15TA.LIZ.getClass();
                C20523715Sp.LIZ.getClass();
                C20523715Sp.LIZJ = SystemClock.elapsedRealtime();
                ExploreFeedListViewModel exploreFeedListViewModel = (ExploreFeedListViewModel) awS145S1100000_31.l1;
                exploreFeedListViewModel.LLJLILLLLZIIL = false;
                exploreFeedListViewModel.LLILZIL = true;
            }
            C15TA c15ta = C15TA.LIZ;
            String str3 = awS145S1100000_31.s0;
            C15T7 c15t7ZQ2 = ((ExploreFeedListViewModel) awS145S1100000_31.l1).zQ2();
            if (c15t7ZQ2 != null && (c15v22 = c15t7ZQ2.LL) != null) {
                l = c15v22.LIZIZ;
            } else {
                l = null;
            }
            C15T7 c15t7ZQ22 = ((ExploreFeedListViewModel) awS145S1100000_31.l1).zQ2();
            if (c15t7ZQ22 != null && (c15v2 = c15t7ZQ22.LL) != null) {
                str = c15v2.LIZ;
            } else {
                str = null;
            }
            C15T7 c15t7ZQ23 = ((ExploreFeedListViewModel) awS145S1100000_31.l1).zQ2();
            if (c15t7ZQ23 != null && (c20521215Rq = c15t7ZQ23.LLILLJJLI) != null) {
                str2 = c20521215Rq.LIZ;
            }
            c15ta.getClass();
            if (!Intrinsics.LJFF(str3, "init")) {
                if (Intrinsics.LJFF(str3, "publish_landing")) {
                    str3 = "after_upload_succeed";
                }
                C20532515Vz.LIZ(new C725930Sdj(l, str3, str, str2));
            }
            ((ExploreFeedListViewModel) awS145S1100000_31.l1).manualListRefresh();
            if (Intrinsics.LJFF(awS145S1100000_31.s0, "click_button_icon") || Intrinsics.LJFF(awS145S1100000_31.s0, "click_top_icon") || Intrinsics.LJFF(awS145S1100000_31.s0, "publish_landing") || Intrinsics.LJFF(awS145S1100000_31.s0, "click_subtab_button") || Intrinsics.LJFF(awS145S1100000_31.s0, "lynx_schema_jump")) {
                ((ExploreFeedListViewModel) awS145S1100000_31.l1).setState(AFwS276S0000000_31.get$arr$(116));
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS145S1100000_31 awS145S1100000_31, Object obj) {
        C20526015Tm c20526015Tm;
        Object aid;
        C15SM c15sm = (C15SM) obj;
        List<C150D> list = c15sm.LLILZ.LLILZ;
        if (list != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            for (C150D c150d : list) {
                if (c150d instanceof C20526015Tm) {
                    aid = ((C20526015Tm) c150d).LL.getAid();
                } else {
                    aid = -1;
                }
                arrayList.add(aid);
            }
            int iIndexOf = arrayList.indexOf(awS145S1100000_31.s0);
            if (iIndexOf >= 0) {
                List<C150D> list2 = c15sm.LLILZ.LLILZ;
                C150D c150d2 = null;
                if (list2 != null) {
                    c150d2 = (C150D) ListProtector.get(list2, iIndexOf);
                }
                if ((c150d2 instanceof C20526015Tm) && (c20526015Tm = (C20526015Tm) c150d2) != null) {
                    ExploreFeedListViewModel exploreFeedListViewModel = (ExploreFeedListViewModel) awS145S1100000_31.l1;
                    Aweme aweme = c20526015Tm.LL;
                    exploreFeedListViewModel.listSetItemAt(iIndexOf, C20526015Tm.LIZ(c20526015Tm, aweme, aweme.isLike(), 131068));
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS145S1100000_31 awS145S1100000_31, Object obj) {
        List<C20526015Tm> list;
        C20526015Tm c20526015Tm;
        C15SN c15sn = (C15SN) obj;
        List<C20526015Tm> list2 = c15sn.LL.LLILZ;
        if (list2 != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
            Iterator<C20526015Tm> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().LL.getAid());
            }
            int iIndexOf = arrayList.indexOf(awS145S1100000_31.s0);
            if (iIndexOf >= 0 && (list = c15sn.LL.LLILZ) != null && (c20526015Tm = (C20526015Tm) ListProtector.get(list, iIndexOf)) != null) {
                ExploreTopicGeneralFeedListViewModel exploreTopicGeneralFeedListViewModel = (ExploreTopicGeneralFeedListViewModel) awS145S1100000_31.l1;
                Aweme aweme = c20526015Tm.LL;
                exploreTopicGeneralFeedListViewModel.listSetItemAt(iIndexOf, C20526015Tm.LIZ(c20526015Tm, aweme, aweme.isLike(), 131068));
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0101  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$6(kotlin.jvm.internal.AwS145S1100000_31 r7, java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS145S1100000_31.invoke$6(kotlin.jvm.internal.AwS145S1100000_31, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$7(AwS145S1100000_31 awS145S1100000_31, Object obj) {
        Object aid;
        Long l;
        List<Aweme> list;
        List<Aweme> list2;
        Aweme next;
        ExploreTopicAwemeListResponse exploreTopicAwemeListResponse;
        List<Aweme> list3;
        C15V2 c15v2;
        Aweme aweme;
        List<C20526015Tm> list4 = ((C15SN) obj).LL.LLILZ;
        if (list4 != null) {
            ArrayList arrayList = new ArrayList();
            int size = list4.size();
            int i = 0;
            while (true) {
                aid = null;
                if (i >= size) {
                    break;
                }
                C20526015Tm c20526015Tm = (C20526015Tm) ListProtector.get(list4, i);
                if (c20526015Tm != null && (aweme = c20526015Tm.LL) != null) {
                    aid = aweme.getAid();
                }
                if (Intrinsics.LJFF(aid, awS145S1100000_31.s0)) {
                    ListProtector.add(arrayList, 0, Integer.valueOf(i));
                }
                i++;
            }
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((ExploreTopicGeneralFeedListViewModel) awS145S1100000_31.l1).listRemoveItemAt(((Number) ListProtector.get(arrayList, i2)).intValue());
            }
            C15T8 c15t8 = C15T8.LL;
            C15T7 c15t7AQ2 = ((ExploreTopicGeneralFeedListViewModel) awS145S1100000_31.l1).AQ2();
            if (c15t7AQ2 != null && (c15v2 = c15t7AQ2.LL) != null) {
                l = c15v2.LIZIZ;
            } else {
                l = null;
            }
            String str = awS145S1100000_31.s0;
            c15t8.getClass();
            if (str != null && l != null) {
                l.longValue();
                try {
                    Map<Long, ExploreTopicAwemeListResponse> map = C15T8.LLILLL;
                    synchronized (map) {
                        try {
                            ExploreTopicAwemeListResponse exploreTopicAwemeListResponse2 = (ExploreTopicAwemeListResponse) ((LinkedHashMap) map).get(l);
                            if (exploreTopicAwemeListResponse2 != null && (list2 = exploreTopicAwemeListResponse2.items) != null) {
                                Iterator<Aweme> it2 = list2.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        next = it2.next();
                                        if (Intrinsics.LJFF(next.getAid(), str)) {
                                            break;
                                        }
                                    } else {
                                        next = null;
                                        break;
                                    }
                                }
                                Aweme aweme2 = next;
                                if (aweme2 != null && (exploreTopicAwemeListResponse = (ExploreTopicAwemeListResponse) ((LinkedHashMap) C15T8.LLILLL).get(l)) != null && (list3 = exploreTopicAwemeListResponse.items) != null) {
                                    list3.remove(aweme2);
                                }
                            }
                        } finally {
                        }
                    }
                    ExploreTopicAwemeListResponse exploreTopicAwemeListResponse3 = C15T8.LLILZ.get(l);
                    if (exploreTopicAwemeListResponse3 != null && (list = exploreTopicAwemeListResponse3.items) != null) {
                        synchronized (list) {
                            try {
                                Iterator<Aweme> it3 = list.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        break;
                                    }
                                    Aweme next2 = it3.next();
                                    if (Intrinsics.LJFF(next2.getAid(), str)) {
                                        aid = next2;
                                        break;
                                    }
                                }
                                Aweme aweme3 = (Aweme) aid;
                                if (aweme3 != null) {
                                    list.remove(aweme3);
                                }
                            } finally {
                            }
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C2153908cD c2153908cD = C2153908cD.LIZ;
                    String message = th.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    c2153908cD.getClass();
                    C2153908cD.LIZJ(6, message, "explore_feed_cache");
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS145S1100000_31 awS145S1100000_31, Object obj) {
        return C20487315Ep.LIZ((C20487315Ep) obj, (C20486515Eh) awS145S1100000_31.l1, false, new C1867990yi5(null, awS145S1100000_31.s0), 0L, false, null, 40);
    }

    public static final Object invoke$9(AwS145S1100000_31 awS145S1100000_31, Object obj) {
        boolean z;
        C20426214wG c20426214wGLIZ;
        SymphonyEngine symphonyEngine = (SymphonyEngine) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startEdit, flowJson=");
        sbLIZ.append(awS145S1100000_31.s0);
        C20441214yg.LIZIZ("SymphonyEngineInstance", C2188811AlT.LIZIZ(sbLIZ));
        if (awS145S1100000_31.s0.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            c20426214wGLIZ = symphonyEngine.LJIJJLI();
        } else {
            C20426114wF c20426114wFLJIIJJI = ((C20425514w9) awS145S1100000_31.l1).LJIIJJI(awS145S1100000_31.s0);
            if (c20426114wFLJIIJJI != null) {
                c20426214wGLIZ = C20425414w8.LIZ(c20426114wFLJIIJJI);
            }
            return null;
        }
        if (c20426214wGLIZ != null) {
            symphonyEngine.LJJJJ(c20426214wGLIZ);
            ((C20425514w9) awS145S1100000_31.l1).LIZLLL = c20426214wGLIZ;
            return c20426214wGLIZ;
        }
        return null;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS145S1100000_31(com.ss.android.ugc.aweme.explore.vm.ExploreTopicGeneralFeedListViewModel r3, java.lang.String r4, int r5) {
        /*
            r2 = this;
            r2.$t = r5
            switch(r5) {
                case 5: goto Lf;
                case 6: goto L5;
                case 7: goto Lf;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l1 = r3
            r1.s0 = r4
            r0 = 1
        Lb:
            r1.<init>(r0)
            return
        Lf:
            r1 = r2
            r1.s0 = r4
            r1.l1 = r3
            r0 = 1
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS145S1100000_31.<init>(com.ss.android.ugc.aweme.explore.vm.ExploreTopicGeneralFeedListViewModel, java.lang.String, int):void");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS145S1100000_31(com.ss.android.ugc.aweme.explore.vm.ExploreFeedListViewModel r3, java.lang.String r4, int r5) {
        /*
            r2 = this;
            r2.$t = r5
            int r5 = 3 - r5
            if (r5 == 0) goto L10
            r1 = r2
            r1.s0 = r4
            r1.l1 = r3
            r0 = 1
        Lc:
            r1.<init>(r0)
            return
        L10:
            r1 = r2
            r1.l1 = r3
            r1.s0 = r4
            r0 = 1
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS145S1100000_31.<init>(com.ss.android.ugc.aweme.explore.vm.ExploreFeedListViewModel, java.lang.String, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS145S1100000_31(C158Y c158y, String str, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = c158y;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS145S1100000_31(C20486515Eh c20486515Eh, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c20486515Eh;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS145S1100000_31(C20611415l2 c20611415l2, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c20611415l2;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS145S1100000_31(VideoTagFriendsListViewModel videoTagFriendsListViewModel, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = videoTagFriendsListViewModel;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS145S1100000_31(String str, C20425514w9 c20425514w9, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = c20425514w9;
    }
}
