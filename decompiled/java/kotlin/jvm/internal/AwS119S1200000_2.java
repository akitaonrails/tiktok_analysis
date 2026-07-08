package kotlin.jvm.internal;

import X.AbstractC2252651DEx;
import X.AnonymousClass0956;
import X.C05P0;
import X.C065B;
import X.C065D;
import X.C065E;
import X.C065H;
import X.C065M;
import X.C065Q;
import X.C09AY;
import X.C0PEM;
import X.C0WT9;
import X.C0ZE8;
import X.C1161000gJm;
import X.C13017057n;
import X.C1336705Kz;
import X.C1388190mED;
import X.C1389890mGx;
import X.C1397505dV;
import X.C1397605dW;
import X.C13BV;
import X.C13IQ;
import X.C13LP;
import X.C1422405hW;
import X.C1438005k2;
import X.C1438105k3;
import X.C1490105sR;
import X.C1567806Bw;
import X.C1590906Kt;
import X.C1720006oQ;
import X.C1AF0;
import X.C2188811AlT;
import X.C23250099c;
import X.C23271099x;
import X.C467701rv;
import X.C817503Hh;
import X.C897370ZIh;
import X.EnumC1643306c3;
import X.InterfaceC1482905rH;
import X.InterfaceC1491305sd;
import X.InterfaceC497601wk;
import X.InterfaceC879010Ye3;
import X.InterfaceC897380ZIi;
import android.app.Activity;
import android.content.Context;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.hybrid.spark.raven.page.RavenFragment;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.autofill.settings.AdBrowserSettingsActivity;
import com.ss.android.ugc.aweme.base.share.QuickShareAIInfo;
import com.ss.android.ugc.aweme.base.share.QuickShareCandidate;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.StoryNoteDataCollection;
import com.ss.android.ugc.aweme.im.streak.api.StreakData;
import com.ss.android.ugc.aweme.im.streak.impl.utils.StreakLocalExtHelper;
import com.ss.android.ugc.aweme.internalshare.impl.feedquickshare.v2.QuickShareRecord;
import com.ss.android.ugc.aweme.poi.anchor.PoiAnchorMakerDelegate;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.story.note.StoryNoteStatusChangeCallback;
import com.ss.android.ugc.aweme.story.note.StoryThoughtMyDataManagerImpl;
import com.ss.android.ugc.tiktok.tools.performance.services.UtilServiceImpl$doOnDestroy$$inlined$doOnDestroy$1$1;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class AwS119S1200000_2 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS119S1200000_2 awS119S1200000_2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("flushDeferredInserts source=");
        sbLIZ.append(awS119S1200000_2.s0);
        sbLIZ.append(" replay=");
        sbLIZ.append(((List) awS119S1200000_2.l1).size());
        sbLIZ.append(' ');
        sbLIZ.append(((RavenFragment) awS119S1200000_2.l2).fT(null));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(AwS119S1200000_2 awS119S1200000_2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[StoreMergeStart] check=store_received_incremental_sections updateId=");
        sbLIZ.append(awS119S1200000_2.s0);
        sbLIZ.append(" incoming=");
        sbLIZ.append(C1397605dW.LIZIZ((C1422405hW) awS119S1200000_2.l1));
        sbLIZ.append(" currentSections=");
        sbLIZ.append(C1397605dW.LJFF(10, ((C1397505dV) awS119S1200000_2.l2).LIZ));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$10(AwS119S1200000_2 awS119S1200000_2) {
        StoryThoughtMyDataManagerImpl storyThoughtMyDataManagerImpl = (StoryThoughtMyDataManagerImpl) awS119S1200000_2.l1;
        ConcurrentHashMap<StoryNoteStatusChangeCallback, String> concurrentHashMap = storyThoughtMyDataManagerImpl.LLILLJJLI;
        String str = awS119S1200000_2.s0;
        StoryNoteDataCollection storyNoteDataCollection = (StoryNoteDataCollection) awS119S1200000_2.l2;
        Iterator<Map.Entry<StoryNoteStatusChangeCallback, String>> it2 = concurrentHashMap.entrySet().iterator();
        while (it2.hasNext()) {
            it2.next().getKey().onStoryNotePublishFinished(str, storyNoteDataCollection, storyThoughtMyDataManagerImpl.LLILZ);
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$11(AwS119S1200000_2 awS119S1200000_2) {
        ((LifecycleOwner) awS119S1200000_2.l1).getLifecycle().addObserver(new UtilServiceImpl$doOnDestroy$$inlined$doOnDestroy$1$1(awS119S1200000_2.s0, (Function0) awS119S1200000_2.l2));
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS119S1200000_2 awS119S1200000_2) {
        C0WT9 c0wt9 = C0WT9.LIZ;
        Activity activity = (Activity) awS119S1200000_2.l1;
        c0wt9.getClass();
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C1336705Kz(jCurrentTimeMillis, null), 2);
            WebView webView = new WebView(activity);
            webView.clearCache(true);
            webView.destroy();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("clearCookieDone, cost: ");
            sbLIZ.append(System.currentTimeMillis() - jCurrentTimeMillis);
            C2188811AlT.LIZIZ(sbLIZ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJFF(e, "iab_clear_cookie");
        }
        C0WT9.LIZ.getClass();
        Keva.getRepo("IABClearCookieManager").storeLong("iab_clear_cookie_time", System.currentTimeMillis());
        C0WT9.LJ("iab_clear_cookie_click", "dialog_confirm", awS119S1200000_2.s0);
        ((Function0) awS119S1200000_2.l2).invoke();
        C1389890mGx c1389890mGx = new C1389890mGx((Activity) awS119S1200000_2.l1);
        c1389890mGx.LJFF(R.raw.icon_tick_circle_fill);
        c1389890mGx.LJII(R.attr.zi);
        c1389890mGx.LJIIJ(((Activity) awS119S1200000_2.l1).getString(2131828851));
        c1389890mGx.LJIIJJI();
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS119S1200000_2 awS119S1200000_2) {
        Set<InterfaceC1491305sd> set;
        List<? extends InterfaceC1491305sd> listLLIIII;
        Map<String, Set<InterfaceC1491305sd>> map = ((C1490105sR) awS119S1200000_2.l1).LJJIFFI().get((InterfaceC879010Ye3) awS119S1200000_2.l2);
        if (map != null && (set = map.get(awS119S1200000_2.s0)) != null && (listLLIIII = C13LP.LLIIII(set)) != null && !listLLIIII.isEmpty()) {
            CopyOnWriteArrayList<InterfaceC1482905rH> copyOnWriteArrayListLJJII = ((C1490105sR) awS119S1200000_2.l1).LJJII();
            InterfaceC879010Ye3 interfaceC879010Ye3 = (InterfaceC879010Ye3) awS119S1200000_2.l2;
            C1490105sR c1490105sR = (C1490105sR) awS119S1200000_2.l1;
            Iterator<InterfaceC1482905rH> it2 = copyOnWriteArrayListLJJII.iterator();
            while (it2.hasNext()) {
                it2.next().LIZ(interfaceC879010Ye3, listLLIIII, c1490105sR.LIZIZ(), c1490105sR.LLILLJJLI);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS119S1200000_2 awS119S1200000_2) {
        Activity activityLIZ;
        Context context = (Context) awS119S1200000_2.l1;
        if (context != null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
            c1389890mGx.LJIIIZ(2131827458);
            c1389890mGx.LJIIJJI();
        }
        InterfaceC897380ZIi.LIZIZ.getClass();
        C897370ZIh.LIZ().LJIIJJI();
        C0ZE8.LJIIIIZZ(awS119S1200000_2.s0, (EnumC1643306c3) awS119S1200000_2.l2, EnumC1643306c3.PUBLIC);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS119S1200000_2 awS119S1200000_2) {
        long jLIZ = C1567806Bw.LIZ((StreakData) awS119S1200000_2.l1);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("streak_anim_");
        sbLIZ.append((Integer) awS119S1200000_2.l2);
        sbLIZ.append('-');
        sbLIZ.append(jLIZ);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StreakLocalExtHelper streakLocalExtHelper = StreakLocalExtHelper.LIZ;
        String str = awS119S1200000_2.s0;
        streakLocalExtHelper.getClass();
        boolean zLIZLLL = StreakLocalExtHelper.LIZLLL(str, "streak_unlock_anim", strLIZIZ);
        boolean z = C1590906Kt.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("StreakLocalExtHelper: addOrUpdateStreakAnimName, convId=");
        sbLIZ2.append(awS119S1200000_2.s0);
        sbLIZ2.append(", animInfo=");
        sbLIZ2.append(strLIZIZ);
        sbLIZ2.append(", result=");
        sbLIZ2.append(zLIZLLL);
        C1590906Kt.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v4, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r6v5, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v8, types: [X.13BV] */
    public static final Object invoke$4(AwS119S1200000_2 awS119S1200000_2) {
        List<QuickShareCandidate> list;
        QuickShareCandidate quickShareCandidate;
        QuickShareAIInfo quickShareAIInfo;
        String str;
        Float f;
        double dFloatValue;
        QuickShareCandidate next;
        double dDoubleValue;
        double dDoubleValue2;
        Pair pair;
        Float f2;
        ?? arrayList;
        Double d;
        String strOptString = null;
        if (C065D.LIZ()) {
            Object obj = C065B.LIZ;
            String str2 = awS119S1200000_2.s0;
            QuickShareAIInfo quickShareAIInfo2 = (QuickShareAIInfo) awS119S1200000_2.l1;
            if (str2.length() != 0 && (f2 = quickShareAIInfo2.shareRate) != null) {
                double dFloatValue2 = f2.floatValue();
                if (dFloatValue2 > 0.0d) {
                    Double dValueOf = Double.valueOf(dFloatValue2);
                    if (!Intrinsics.LJFF(quickShareAIInfo2.showByCandidateScore, "1")) {
                        arrayList = C13BV.INSTANCE;
                    } else {
                        List list2 = quickShareAIInfo2.candidateList;
                        if (list2 == null) {
                            list2 = C13BV.INSTANCE;
                        }
                        if (list2.isEmpty()) {
                            arrayList = C13BV.INSTANCE;
                        } else {
                            arrayList = new ArrayList();
                            Iterator it2 = list2.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                QuickShareCandidate quickShareCandidate2 = (QuickShareCandidate) it2.next();
                                String str3 = quickShareCandidate2.extraInfo;
                                if (str3 != null && str3.length() != 0) {
                                    try {
                                        strOptString = new JSONObject(str3).optString("strategy_type", strOptString);
                                    } catch (Exception e) {
                                        TryCatchGuardChecker.doCheck(e);
                                    }
                                }
                                if (C065Q.LIZ(strOptString)) {
                                    arrayList = C13BV.INSTANCE;
                                    break;
                                }
                                Double d2 = quickShareCandidate2.rateScore;
                                if (d2 != null) {
                                    double dDoubleValue3 = d2.doubleValue();
                                    if (dDoubleValue3 > 0.0d) {
                                        arrayList.add(new QuickShareRecord.Candidate(quickShareCandidate2.candidateId, Long.valueOf(quickShareCandidate2.type), Double.valueOf(dDoubleValue3)));
                                    }
                                }
                                strOptString = null;
                            }
                        }
                    }
                    QuickShareRecord quickShareRecord = new QuickShareRecord(str2, dValueOf, arrayList, Long.valueOf(System.currentTimeMillis()));
                    synchronized (C065B.LIZ) {
                        try {
                            if (C065B.LIZIZ()) {
                                C1438105k3 c1438105k3 = C065B.LIZIZ;
                                if (c1438105k3 != null) {
                                    String str4 = quickShareRecord.itemID;
                                    if (str4 != null && str4.length() != 0 && (d = quickShareRecord.shareRate) != null && d.doubleValue() > 0.0d) {
                                        ((ArrayList) c1438105k3.LIZIZ).add(quickShareRecord);
                                        int iLIZ = C065E.LIZ() + 10;
                                        while (((ArrayList) c1438105k3.LIZIZ).size() > iLIZ) {
                                            ListProtector.remove(c1438105k3.LIZIZ, 0);
                                        }
                                    }
                                    C1438105k3 c1438105k32 = new C1438105k3();
                                    c1438105k32.LIZ = c1438105k3.LIZ;
                                    ((ArrayList) c1438105k32.LIZIZ).addAll(c1438105k3.LIZIZ);
                                    AnonymousClass0956 anonymousClass0956 = C065B.LIZLLL;
                                    if (anonymousClass0956 != null) {
                                        anonymousClass0956.LIZIZ(null);
                                    }
                                    C065B.LIZLLL = C23250099c.LIZLLL(C065B.LIZJ, null, null, new C1438005k2(c1438105k32, null), 3);
                                }
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("saveFirstFrameData v2: recorded itemId=");
            sbLIZ.append(awS119S1200000_2.s0);
            C2188811AlT.LIZIZ(sbLIZ);
        } else {
            try {
                pair = (Pair) C23250099c.LJ(C23271099x.INSTANCE, new C467701rv((Aweme) awS119S1200000_2.l2, null));
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                C1720006oQ.LIZJ("QuickShareManager", "saveFirstFrameData: intersectCandidateList failed", e2);
                list = ((QuickShareAIInfo) awS119S1200000_2.l1).candidateList;
            }
            if (pair != null) {
                list = (List) pair.getFirst();
                if (list != null) {
                    Iterator<QuickShareCandidate> it3 = list.iterator();
                    if (!it3.hasNext()) {
                        next = null;
                    } else {
                        next = it3.next();
                        if (it3.hasNext()) {
                            Double d3 = next.rateScore;
                            if (d3 != null) {
                                dDoubleValue = d3.doubleValue();
                            } else {
                                dDoubleValue = 0.0d;
                            }
                            do {
                                QuickShareCandidate next2 = it3.next();
                                Double d4 = next2.rateScore;
                                if (d4 != null) {
                                    dDoubleValue2 = d4.doubleValue();
                                } else {
                                    dDoubleValue2 = 0.0d;
                                }
                                if (Double.compare(dDoubleValue, dDoubleValue2) < 0) {
                                    next = next2;
                                    dDoubleValue = dDoubleValue2;
                                }
                            } while (it3.hasNext());
                        }
                    }
                    quickShareCandidate = next;
                }
                AbstractC2252651DEx abstractC2252651DEx = C065M.LIZ;
                quickShareAIInfo = (QuickShareAIInfo) awS119S1200000_2.l1;
                str = awS119S1200000_2.s0;
                if (quickShareAIInfo != null && (f = quickShareAIInfo.shareRate) != null) {
                    dFloatValue = f.floatValue();
                    if (str != null && str.length() != 0) {
                        C23250099c.LIZLLL(C065M.LIZJ, C065M.LIZ, null, new C065H(str, dFloatValue, quickShareCandidate, quickShareAIInfo, null), 2);
                    }
                }
            }
            quickShareCandidate = null;
            AbstractC2252651DEx abstractC2252651DEx2 = C065M.LIZ;
            quickShareAIInfo = (QuickShareAIInfo) awS119S1200000_2.l1;
            str = awS119S1200000_2.s0;
            if (quickShareAIInfo != null) {
                dFloatValue = f.floatValue();
                if (str != null) {
                    C23250099c.LIZLLL(C065M.LIZJ, C065M.LIZ, null, new C065H(str, dFloatValue, quickShareCandidate, quickShareAIInfo, null), 2);
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS119S1200000_2 awS119S1200000_2) {
        C23250099c.LIZLLL((InterfaceC497601wk) ((PoiAnchorMakerDelegate) awS119S1200000_2.l1).LL.getValue(), null, null, new C13017057n((Aweme) awS119S1200000_2.l2, awS119S1200000_2.s0, null), 3);
        return null;
    }

    public static final Object invoke$6(AwS119S1200000_2 awS119S1200000_2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assembleSectionItem instanceId:");
        sbLIZ.append(awS119S1200000_2.s0);
        sbLIZ.append(", assem:");
        sbLIZ.append((C13IQ) awS119S1200000_2.l1);
        sbLIZ.append(", viewId:");
        sbLIZ.append(((FrameLayout) awS119S1200000_2.l2).getId());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$7(AwS119S1200000_2 awS119S1200000_2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assemble uiSlotAssem instanceId:");
        sbLIZ.append(awS119S1200000_2.s0);
        sbLIZ.append(", assem:");
        sbLIZ.append((C13IQ) awS119S1200000_2.l1);
        sbLIZ.append(", viewId:");
        sbLIZ.append(((FrameLayout) awS119S1200000_2.l2).getId());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$8(AwS119S1200000_2 awS119S1200000_2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assemble UIContentAssem instanceId:");
        sbLIZ.append(awS119S1200000_2.s0);
        sbLIZ.append(", assem:");
        sbLIZ.append((C13IQ) awS119S1200000_2.l1);
        sbLIZ.append(", viewId:");
        sbLIZ.append(((FrameLayout) awS119S1200000_2.l2).getId());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$9(AwS119S1200000_2 awS119S1200000_2) {
        ((Function1) awS119S1200000_2.l1).invoke(awS119S1200000_2.s0);
        ((C05P0) awS119S1200000_2.l2).setValue(Boolean.FALSE);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS119S1200000_2(C05P0 c05p0, String str, Function1 function1, int i) {
        super(0);
        this.$t = i;
        this.l1 = function1;
        this.s0 = str;
        this.l2 = c05p0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS119S1200000_2(C1490105sR c1490105sR, InterfaceC879010Ye3 interfaceC879010Ye3, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c1490105sR;
        this.l2 = interfaceC879010Ye3;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS119S1200000_2(Context context, String str, EnumC1643306c3 enumC1643306c3, int i) {
        super(0);
        this.$t = i;
        this.l1 = context;
        this.s0 = str;
        this.l2 = enumC1643306c3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS119S1200000_2(FrameLayout frameLayout, String str, C13IQ c13iq, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = c13iq;
        this.l2 = frameLayout;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS119S1200000_2(LifecycleOwner lifecycleOwner, String str, Function0 function0, int i) {
        super(0);
        this.$t = i;
        this.l1 = lifecycleOwner;
        this.s0 = str;
        this.l2 = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS119S1200000_2(StreakData streakData, Integer num, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = streakData;
        this.l2 = num;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS119S1200000_2(PoiAnchorMakerDelegate poiAnchorMakerDelegate, String str, Aweme aweme, int i) {
        super(0);
        this.$t = i;
        this.l1 = poiAnchorMakerDelegate;
        this.s0 = str;
        this.l2 = aweme;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS119S1200000_2(StoryThoughtMyDataManagerImpl storyThoughtMyDataManagerImpl, String str, StoryNoteDataCollection storyNoteDataCollection, int i) {
        super(0);
        this.$t = i;
        this.l1 = storyThoughtMyDataManagerImpl;
        this.s0 = str;
        this.l2 = storyNoteDataCollection;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS119S1200000_2(String str, C1422405hW c1422405hW, C1397505dV c1397505dV, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = c1422405hW;
        this.l2 = c1397505dV;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS119S1200000_2(String str, QuickShareAIInfo quickShareAIInfo, Aweme aweme, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = quickShareAIInfo;
        this.l2 = aweme;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS119S1200000_2(String str, String str2, List<C1161000gJm> list, RavenFragment<CONTEXT> ravenFragment) {
        super(0);
        this.$t = ravenFragment;
        this.s0 = str;
        this.l1 = str2;
        this.l2 = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS119S1200000_2(AwS546S0100000_2 awS546S0100000_2, AdBrowserSettingsActivity adBrowserSettingsActivity, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = adBrowserSettingsActivity;
        this.s0 = str;
        this.l2 = awS546S0100000_2;
    }
}
