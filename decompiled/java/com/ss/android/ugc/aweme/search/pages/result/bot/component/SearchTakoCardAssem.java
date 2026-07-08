package com.ss.android.ugc.aweme.search.pages.result.bot.component;

import X.AbstractC21673619ry;
import X.C01GW;
import X.C0BQH;
import X.C0DXR;
import X.C0HXV;
import X.C0P97;
import X.C0PCY;
import X.C0PRC;
import X.C0Q0I;
import X.C0Q0J;
import X.C0Q3E;
import X.C0Q4Y;
import X.C0Q7D;
import X.C0Q7H;
import X.C0R45;
import X.C13IQ;
import X.C13LE;
import X.C1440005kM;
import X.C14TF;
import X.C1558520qew;
import X.C1591860rWi;
import X.C1606420ruC;
import X.C1637806bA;
import X.C1833207Fy;
import X.C19719912Dl;
import X.C1DWH;
import X.C2097608Jq;
import X.C21565319aV;
import X.C2188811AlT;
import X.C2211631BhB;
import X.C2217381BqS;
import X.C301530Brr;
import X.C339190DRl;
import X.C342880DcM;
import X.C418440Gaw;
import X.C426160GnO;
import X.C426750GoL;
import X.C452501pT;
import X.C640320P9q;
import X.C646370PWx;
import X.C651970Phj;
import X.C651980Phk;
import X.C652430PiT;
import X.C652590Pij;
import X.C653450Pk7;
import X.C661350Pwr;
import X.C661490Px5;
import X.C661510Px7;
import X.C665130Q7b;
import X.C688640Qzm;
import X.C723830SaL;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C7818033o;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC2217461Bqa;
import X.InterfaceC724760Sbq;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.AObserverS214S0100000_10;
import Y.AsS37S0100000_10;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.SmartRoute;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchAggregatedCardAssem;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.parser.SearchCardScope;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.search.pages.result.bot.component.SearchTakoCardAssem;
import com.ss.android.ugc.aweme.search.pages.result.bot.component.viewmodel.SearchTakoCardUIVM;
import com.ss.android.ugc.aweme.search.pages.result.bot.model.TakoInfo;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.ability.SearchTopFragmentAbility;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import com.ss.android.ugc.aweme.tako.model.SearchBingItem;
import com.ss.android.ugc.aweme.tako.model.TakoEventTracker;
import com.ss.android.ugc.aweme.tako.model.TakoSearchCarryInItem;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.AwS624S0100000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchTakoCardAssem extends SearchAggregatedCardAssem<C652590Pij> implements SearchTakoCardAbility {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLLJ;
    public LinearLayoutCompat LLJZ;
    public LinearLayoutCompat LLJZIJLIL;
    public SmartImageView LLL;
    public TextView LLLF;
    public C688640Qzm LLLFF;
    public TuxTextView LLLFFI;
    public C426160GnO LLLFZ;
    public ViewOnAttachStateChangeListenerC20604515jv LLLI;
    public View LLLII;
    public ViewOnAttachStateChangeListenerC20604515jv LLLIIII;
    public TuxTextView LLLIIIIL;
    public long LLLIIIL;
    public final AssemVMLazy LLLILZJ;
    public final C01GW LLLILZLLLI;
    public C652590Pij LLLIZZ;
    public C653450Pk7<Aweme> LLLJ;
    public String LLLJIL;
    public final Map<Integer, Boolean> LLLJL;
    public boolean LLLL;
    public boolean LLLLII;
    public boolean LLLLIIIILLL;
    public final AtomicBoolean LLLLIIL;
    public final C0R45 LLLLIILL;
    public final SearchTakoCardAssem$lifeCycleListener$1 LLLLIILLL;
    public final AsS37S0100000_10 LLLLIL;
    public final AObserverS214S0100000_10 LLLLILI;
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 404));
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 400));
    public final C01GW LLJLL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 398));
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 402));
    public final C01GW LLJLLL = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(283));
    public final C01GW LLLIIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 405));
    public final C0Q7H LLLIILIL = new C0Q7H();
    public final C01GW LLLIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 399));
    public final C01GW LLLILZ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 397));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SearchTakoCardAssem.class, "takoCardUIVM", "getTakoCardUIVM()Lcom/ss/android/ugc/aweme/search/pages/result/bot/component/viewmodel/SearchTakoCardUIVM;", 0);
        C13LE.LIZ.getClass();
        LLLLJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public SearchTakoCardAssem() {
        SAFHelper.LIZ.getClass();
        InterfaceC724760Sbq interfaceC724760SbqLJJJIL = SAFHelper.LJJJIL();
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SearchTakoCardUIVM.class);
        this.LLLILZJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), interfaceC724760SbqLJJJIL, C1637806bA.LIZ, new AwS554S0100000_10((C13IQ) c19719912DlLIZ, 403), AFwS241S0000000_10.get$arr$(202), null, true);
        this.LLLILZLLLI = C452501pT.LIZIZ(new AwS554S0100000_10(this, 401));
        this.LLLJL = new LinkedHashMap();
        this.LLLLIIL = new AtomicBoolean(false);
        this.LLLLIILL = new C0R45(this, 7);
        this.LLLLIILLL = new SearchTakoCardAssem$lifeCycleListener$1(this);
        this.LLLLIL = new AsS37S0100000_10(this, 5);
        this.LLLLILI = new AObserverS214S0100000_10(this, 39);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.f1k;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchAggregatedCardAssem
    public final int up() {
        return R.id.tuj;
    }

    public final SearchTakoCardUIVM Ap() {
        AssemVMLazy assemVMLazy = this.LLLILZJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLLJ;
        return (SearchTakoCardUIVM) assemVMLazy.getValue();
    }

    public final C646370PWx Bp() {
        C0PCY<C646370PWx> c0pcyWO2;
        ISearchContextAbility iSearchContextAbility = (ISearchContextAbility) this.LLJLILLLLZIIL.getValue();
        if (iSearchContextAbility == null || (c0pcyWO2 = iSearchContextAbility.wO2()) == null) {
            return null;
        }
        return (C646370PWx) c0pcyWO2.LIZJ();
    }

    public final RecyclerView Gp() {
        SearchTopFragmentAbility searchTopFragmentAbility = (SearchTopFragmentAbility) this.LLJLIL.getValue();
        if (searchTopFragmentAbility != null) {
            return searchTopFragmentAbility.LLII();
        }
        return null;
    }

    public final Map<String, String> getCommonParams() {
        String str;
        HashMap map = new HashMap();
        C646370PWx c646370PWxBp = Bp();
        C0PRC c0prcZp = zp();
        map.put("search_id", c0prcZp != null ? c0prcZp.LLILLL : null);
        map.put("search_result_id", c646370PWxBp != null ? c646370PWxBp.LLJ : null);
        map.put("enter_from", c646370PWxBp != null ? c646370PWxBp.LLILLL : null);
        map.put("token_type", "tikbot");
        map.put("rank", String.valueOf(c646370PWxBp != null ? Integer.valueOf(c646370PWxBp.LLILZLL) : null));
        map.put("universal_rank", String.valueOf(c646370PWxBp != null ? c646370PWxBp.LLJILJIL : null));
        if (c646370PWxBp == null || (str = c646370PWxBp.LLJILJILJ) == null) {
            str = "";
        }
        map.put("insert_type", str);
        map.put("search_keyword", c0prcZp != null ? c0prcZp.LLIZLLLIL : null);
        return map;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchAggregatedCardAssem
    public final C0DXR sp() {
        return new C0DXR() { // from class: X.0Dau
            public static final /* synthetic */ int LL = 0;

            @Override // X.C0DXR
            public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                Object first;
                Object second;
                Pair pairLIZ = C1914107ed.LIZ(recyclerView.getChildAdapterPosition(view), c21673919s1.LIZIZ());
                if (C444960Hcc.LIZIZ()) {
                    first = pairLIZ.getSecond();
                } else {
                    first = pairLIZ.getFirst();
                }
                rect.left = ((Number) first).intValue();
                if (C444960Hcc.LIZIZ()) {
                    second = pairLIZ.getFirst();
                } else {
                    second = pairLIZ.getSecond();
                }
                rect.right = ((Number) second).intValue();
            }
        };
    }

    public final C0PRC zp() {
        C0PCY<C0PRC> c0pcyPh1;
        ISearchContextAbility iSearchContextAbility = (ISearchContextAbility) this.LLJLILLLLZIIL.getValue();
        if (iSearchContextAbility == null || (c0pcyPh1 = iSearchContextAbility.Ph1()) == null) {
            return null;
        }
        return (C0PRC) c0pcyPh1.LIZJ();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        LJJIJL().removeOnAttachStateChangeListener(this.LLLLIILL);
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchAggregatedCardAssem
    public final View getDetectView() {
        return LJJIJL();
    }

    public final void yp() {
        RecyclerView recyclerViewGp = Gp();
        if (recyclerViewGp == null) {
            Ap().vQ2(2);
            ((C640320P9q) Ap().LL.getValue()).LIZJ(Boolean.FALSE);
            return;
        }
        int iComputeVerticalScrollOffset = recyclerViewGp.computeVerticalScrollOffset();
        C688640Qzm c688640Qzm = this.LLLFF;
        if (c688640Qzm == null) {
            c688640Qzm = null;
        }
        boolean z = false;
        boolean z2 = c688640Qzm.getMeasuredHeight() - iComputeVerticalScrollOffset < C814420VxA.LIZIZ(C418440Gaw.LIZIZ(69));
        boolean z3 = iComputeVerticalScrollOffset > C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("pautoplay textBelow:");
        sbLIZ.append(z2);
        sbLIZ.append(" height = ");
        C688640Qzm c688640Qzm2 = this.LLLFF;
        sbLIZ.append((c688640Qzm2 != null ? c688640Qzm2 : null).getMeasuredHeight());
        C2188811AlT.LIZIZ(sbLIZ);
        boolean z4 = !(z2 || z3) || this.LLLLII;
        ((C640320P9q) Ap().LL.getValue()).LIZJ(Boolean.valueOf(z4));
        this.LLLLIIIILLL = z4;
        boolean z5 = ((float) 1) - (((float) iComputeVerticalScrollOffset) / ((float) LJJIJL().getMeasuredHeight())) >= 0.6f;
        Ap().vQ2(z5 ? 1 : 2);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("pautoplay textBelow:");
        sbLIZ2.append(z2);
        sbLIZ2.append(" titleAbove:");
        sbLIZ2.append(z3);
        sbLIZ2.append(" aboveThreshold:");
        sbLIZ2.append(z5);
        sbLIZ2.append(", blockplay = ");
        if (!z2 && !z3) {
            z = true;
        }
        sbLIZ2.append(z);
        C2188811AlT.LIZIZ(sbLIZ2);
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchAggregatedCardAssem
    public final C1DWH op() {
        return this.LLLIILIL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:264:0x04ee  */
    /* JADX WARN: Type inference failed for: r14v0, types: [X.0H8f] */
    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchAggregatedCardAssem
    /* JADX INFO: renamed from: Ep, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void tp(X.C652590Pij r31) {
        /*
            Method dump skipped, instruction units count: 1312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.result.bot.component.SearchTakoCardAssem.tp(X.0Pij):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Fp(boolean r5) {
        /*
            r4 = this;
            com.bytedance.lighten.loader.SmartImageView r1 = r4.LLL
            r3 = 0
            if (r1 != 0) goto L6
            r1 = r3
        L6:
            r2 = 8
            if (r5 == 0) goto L3f
            r0 = 0
        Lb:
            X.C786410Ut5.LJLLLLLL(r0, r1)
            X.15jv r1 = r4.LLLIIII
            if (r1 != 0) goto L13
            r1 = r3
        L13:
            if (r5 == 0) goto L3c
            X.14TF r0 = X.C14TF.LIZIZ
            X.0lFt r0 = r0.LJIILL()
            boolean r0 = r0.LJIILIIL()
            if (r0 == 0) goto L3c
            r0 = 0
        L22:
            X.C786410Ut5.LJLLLLLL(r0, r1)
            androidx.appcompat.widget.LinearLayoutCompat r1 = r4.LLJZ
            if (r1 != 0) goto L2a
            r1 = r3
        L2a:
            if (r5 != 0) goto L37
            android.widget.TextView r0 = r4.LLLF
            if (r0 == 0) goto L31
            r3 = r0
        L31:
            int r0 = r3.getVisibility()
            if (r0 != 0) goto L38
        L37:
            r2 = 0
        L38:
            X.C786410Ut5.LJLLLLLL(r2, r1)
            return
        L3c:
            r0 = 8
            goto L22
        L3f:
            r0 = 8
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.result.bot.component.SearchTakoCardAssem.Fp(boolean):void");
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.bot.component.SearchTakoCardAbility
    public final void I40(C0Q0I c0q0i) {
        Object obj = ((LinkedHashMap) this.LLLJL).get(Integer.valueOf(c0q0i.LL.LL));
        Boolean bool = Boolean.TRUE;
        if (!Intrinsics.LJFF(obj, bool)) {
            C0Q7D c0q7d = C0Q7D.LIZ;
            Map<String, String> commonParams = getCommonParams();
            C0Q0J c0q0j = c0q0i.LL;
            int i = c0q0j.LL;
            String str = c0q0j.LLILLJJLI;
            c0q7d.getClass();
            C0Q7D.LIZIZ(i, str, commonParams, true);
            this.LLLJL.put(Integer.valueOf(c0q0i.LL.LL), bool);
        }
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.bot.component.SearchTakoCardAbility
    public final void O51(C0Q0I c0q0i) {
        String str;
        String str2;
        String str3;
        String str4;
        String messageKey;
        String message;
        List<Aweme> awemeList;
        List<String> sugList;
        List<SearchBingItem> webDocList;
        SearchMixFeed searchMixFeed;
        TakoInfo bot;
        SearchMixFeed searchMixFeed2;
        TakoInfo bot2;
        SearchMixFeed searchMixFeed3;
        TakoInfo bot3;
        SearchMixFeed searchMixFeed4;
        TakoInfo bot4;
        SearchMixFeed searchMixFeed5;
        TakoInfo bot5;
        SearchMixFeed searchMixFeed6;
        TakoInfo bot6;
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z = c0q0i.LL.LLILLL;
        if (z) {
            str = "click_ask_more";
        } else {
            str = "click_recommend_word";
        }
        C0Q7D c0q7d = C0Q7D.LIZ;
        Map<String, String> commonParams = getCommonParams();
        c0q7d.getClass();
        TakoEventTracker eventTracker = null;
        C0Q7D.LIZLLL(null, str, commonParams);
        if (!z) {
            Map<String, String> commonParams2 = getCommonParams();
            C0Q0J c0q0j = c0q0i.LL;
            C0Q7D.LIZIZ(c0q0j.LL, c0q0j.LLILLJJLI, commonParams2, false);
        }
        C14TF c14tf = C14TF.LIZIZ;
        Context context = getContext();
        String strLJJJLIIL = c14tf.LJJJLIIL();
        C0PRC c0prcZp = zp();
        if (c0prcZp != null) {
            str2 = c0prcZp.LLILLL;
        } else {
            str2 = null;
        }
        C0PRC c0prcZp2 = zp();
        if (c0prcZp2 != null) {
            str3 = c0prcZp2.LLIZLLLIL;
        } else {
            str3 = null;
        }
        if (z) {
            str4 = null;
        } else {
            str4 = c0q0i.LL.LLILLJJLI;
        }
        C652590Pij c652590Pij = this.LLLIZZ;
        if (c652590Pij != null && (searchMixFeed6 = c652590Pij.LL) != null && (bot6 = searchMixFeed6.getBot()) != null) {
            messageKey = bot6.getMessageKey();
        } else {
            messageKey = null;
        }
        C652590Pij c652590Pij2 = this.LLLIZZ;
        if (c652590Pij2 != null && (searchMixFeed5 = c652590Pij2.LL) != null && (bot5 = searchMixFeed5.getBot()) != null) {
            message = bot5.getMessage();
        } else {
            message = null;
        }
        C652590Pij c652590Pij3 = this.LLLIZZ;
        if (c652590Pij3 != null && (searchMixFeed4 = c652590Pij3.LL) != null && (bot4 = searchMixFeed4.getBot()) != null) {
            awemeList = bot4.getAwemeList();
        } else {
            awemeList = null;
        }
        C652590Pij c652590Pij4 = this.LLLIZZ;
        if (c652590Pij4 != null && (searchMixFeed3 = c652590Pij4.LL) != null && (bot3 = searchMixFeed3.getBot()) != null) {
            sugList = bot3.getSugList();
        } else {
            sugList = null;
        }
        C652590Pij c652590Pij5 = this.LLLIZZ;
        if (c652590Pij5 != null && (searchMixFeed2 = c652590Pij5.LL) != null && (bot2 = searchMixFeed2.getBot()) != null) {
            webDocList = bot2.getWebDocList();
        } else {
            webDocList = null;
        }
        C652590Pij c652590Pij6 = this.LLLIZZ;
        if (c652590Pij6 != null && (searchMixFeed = c652590Pij6.LL) != null && (bot = searchMixFeed.getBot()) != null) {
            eventTracker = bot.getEventTracker();
        }
        C665130Q7b.LIZ(c14tf, context, strLJJJLIIL, str, jCurrentTimeMillis, str2, str3, str4, messageKey, "search_chat_sug", message, awemeList, sugList, webDocList, null, null, null, null, eventTracker, null, "tikbot", null, "text", null, null, null, null, null, null, -168883456, 2047);
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchAggregatedCardAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        int marginStart;
        int marginEnd;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        super.onViewCreated(view);
        this.LLJZ = (LinearLayoutCompat) view.findViewById(R.id.nab);
        this.LLJZIJLIL = (LinearLayoutCompat) view.findViewById(R.id.naa);
        this.LLLF = (TextView) view.findViewById(R.id.z7a);
        this.LLL = (SmartImageView) view.findViewById(R.id.l7p);
        this.LLLFF = (C688640Qzm) view.findViewById(R.id.z79);
        this.LLLFFI = (TuxTextView) view.findViewById(R.id.z7_);
        this.LLLFZ = (C426160GnO) view.findViewById(R.id.c1m);
        this.LLLII = view.findViewById(R.id.c1n);
        this.LLLI = (ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(R.id.tuj);
        this.LLLIIII = (ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(R.id.tui);
        this.LLLIIIIL = (TuxTextView) view.findViewById(R.id.xco);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLLI;
        LinearLayoutCompat linearLayoutCompat = null;
        if (viewOnAttachStateChangeListenerC20604515jv == null) {
            viewOnAttachStateChangeListenerC20604515jv = null;
        }
        int i = 0;
        C1591860rWi.LJFF(0, viewOnAttachStateChangeListenerC20604515jv);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LLLI;
        if (viewOnAttachStateChangeListenerC20604515jv2 == null) {
            viewOnAttachStateChangeListenerC20604515jv2 = null;
        }
        AbstractC21673619ry adapter = viewOnAttachStateChangeListenerC20604515jv2.getAdapter();
        if (adapter != null) {
            this.LLLJ = new C653450Pk7<>(adapter);
        }
        LinearLayoutCompat linearLayoutCompat2 = this.LLJZIJLIL;
        if (linearLayoutCompat2 == null) {
            linearLayoutCompat2 = null;
        }
        C786410Ut5.W7(linearLayoutCompat2, new View.OnClickListener() { // from class: X.0Q7C
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i2;
                int i3;
                String str;
                List<Aweme> list;
                String str2;
                SearchTakoCardAssem searchTakoCardAssem = this.LL;
                boolean zBooleanValue = ((Boolean) ((C13FE) searchTakoCardAssem.Ap().LLILLJJLI).getValue()).booleanValue();
                boolean zBooleanValue2 = ((Boolean) ((C13FE) searchTakoCardAssem.Ap().LLILLL).getValue()).booleanValue();
                C426160GnO c426160GnO = searchTakoCardAssem.LLLFZ;
                if (c426160GnO == null) {
                    c426160GnO = null;
                }
                if (zBooleanValue) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                C786410Ut5.LJLLLLLL(i2, c426160GnO);
                View view3 = searchTakoCardAssem.LLLII;
                if (view3 == null) {
                    view3 = null;
                }
                if (zBooleanValue && zBooleanValue2) {
                    i3 = 0;
                } else {
                    i3 = 8;
                }
                C786410Ut5.LJLLLLLL(i3, view3);
                if (zBooleanValue) {
                    C688640Qzm c688640Qzm = searchTakoCardAssem.LLLFF;
                    if (c688640Qzm == null) {
                        c688640Qzm = null;
                    }
                    if (c688640Qzm.LLJLILLLLZIIL && !c688640Qzm.LLJJLIIIJLLLLLLLZ) {
                        c688640Qzm.LLJL = false;
                        c688640Qzm.setText(c688640Qzm.LLJJJJJIL);
                    }
                    TuxTextView tuxTextView = searchTakoCardAssem.LLLFFI;
                    if (tuxTextView == null) {
                        tuxTextView = null;
                    }
                    C786410Ut5.LJLLLLLL(8, tuxTextView);
                    int i4 = 0;
                    for (Object obj : ((LinkedHashMap) searchTakoCardAssem.Ap().LLILZ).entrySet()) {
                        int i5 = i4 + 1;
                        if (i4 >= 0) {
                            Map.Entry entry = (Map.Entry) obj;
                            C0Q7D c0q7d = C0Q7D.LIZ;
                            C0PRC c0prcZp = searchTakoCardAssem.zp();
                            if (c0prcZp != null) {
                                str2 = c0prcZp.LLILLL;
                            } else {
                                str2 = null;
                            }
                            String str3 = (String) entry.getKey();
                            String str4 = (String) entry.getValue();
                            Integer numValueOf = Integer.valueOf(i4);
                            c0q7d.getClass();
                            C0Q7D.LJFF(0, numValueOf, str2, str3, str4);
                            i4 = i5;
                        } else {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                    }
                } else {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (C07EH.LIZ() && C14TF.LIZIZ.LJIILL().LJIILIIL()) {
                        C0PRC c0prcZp2 = searchTakoCardAssem.zp();
                        if (c0prcZp2 != null) {
                            String str5 = c0prcZp2.LLILLL;
                            String strLJIILLIIL = C644560PPy.LJIILLIIL(c0prcZp2.LL);
                            C0Q0K.LIZ.getClass();
                            TakoSearchCarryInItem takoSearchCarryInItemLIZ = C0Q0K.LIZ(str5, strLJIILLIIL, "default_doc_id");
                            if (takoSearchCarryInItemLIZ != null) {
                                try {
                                    if (C1833207Fy.LIZ() && (list = takoSearchCarryInItemLIZ.placeholderAwemes) != null) {
                                        ArrayList arrayList = new ArrayList();
                                        for (Aweme aweme : list) {
                                            if (aweme.getVideo() != null) {
                                                arrayList.add(aweme);
                                            }
                                        }
                                        if (!arrayList.isEmpty()) {
                                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                                            sbLIZ.append("top1_tako_click:");
                                            sbLIZ.append(str5);
                                            C600250NgV.LIZ(new C0N6M(C2188811AlT.LIZIZ(sbLIZ), C0N6L.SEARCH_TOP1_TAKO_CARD, arrayList), EnumC600270NgX.CLICK);
                                        }
                                    }
                                    C189200o6.m2constructorimpl(Unit.LIZ);
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    C189200o6.m2constructorimpl(new C098200Yq(th));
                                }
                                C14TF c14tf = C14TF.LIZIZ;
                                C665130Q7b.LIZ(c14tf, searchTakoCardAssem.getContext(), c14tf.LJJJLIIL(), "click_info", jCurrentTimeMillis, str5, c0prcZp2.LLIZLLLIL, null, null, null, takoSearchCarryInItemLIZ.text, takoSearchCarryInItemLIZ.videos, takoSearchCarryInItemLIZ.sugs, takoSearchCarryInItemLIZ.bings, takoSearchCarryInItemLIZ.images, null, null, null, takoSearchCarryInItemLIZ.eventTracker, strLJIILLIIL, null, null, null, null, null, null, null, null, null, -17952832, 2047);
                            }
                        }
                        str = "click_info";
                        C0Q7D c0q7d2 = C0Q7D.LIZ;
                        Map<String, String> commonParams = searchTakoCardAssem.getCommonParams();
                        c0q7d2.getClass();
                        C0Q7D.LIZLLL(null, str, commonParams);
                        searchTakoCardAssem.yp();
                    }
                    C688640Qzm c688640Qzm2 = searchTakoCardAssem.LLLFF;
                    if (c688640Qzm2 == null) {
                        c688640Qzm2 = null;
                    }
                    AwS589S0100000_10 awS589S0100000_10 = new AwS589S0100000_10(searchTakoCardAssem, 651);
                    if (c688640Qzm2.LLJLILLLLZIIL) {
                        if (c688640Qzm2.LLJJLIIIJLLLLLLLZ) {
                            c688640Qzm2.LLJL = true;
                            c688640Qzm2.setText(c688640Qzm2.LLJJJJJIL);
                            awS589S0100000_10.invoke(Boolean.FALSE);
                        } else {
                            c688640Qzm2.LLJL = false;
                            c688640Qzm2.setText(c688640Qzm2.LLJJJJJIL);
                            awS589S0100000_10.invoke(Boolean.TRUE);
                        }
                    }
                }
                str = "click_words";
                C0Q7D c0q7d22 = C0Q7D.LIZ;
                Map<String, String> commonParams2 = searchTakoCardAssem.getCommonParams();
                c0q7d22.getClass();
                C0Q7D.LIZLLL(null, str, commonParams2);
                searchTakoCardAssem.yp();
            }
        });
        LinearLayoutCompat linearLayoutCompat3 = this.LLJZ;
        if (linearLayoutCompat3 == null) {
            linearLayoutCompat3 = null;
        }
        C21565319aV.LIZIZ(linearLayoutCompat3, Float.valueOf(C418440Gaw.LIZIZ(2)), null, null, null, null, 30);
        C736680Sv4.LJIIIIZZ(this, Ap(), new C2217381BqS() { // from class: X.0Q7L
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C0Q7K) obj).LL);
            }
        }, null, new AwS624S0100000_10(this, 43), 6);
        C0BQH.LIZ();
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv3 = this.LLLIIII;
        if (viewOnAttachStateChangeListenerC20604515jv3 == null) {
            viewOnAttachStateChangeListenerC20604515jv3 = null;
        }
        C342880DcM.LIZIZ(viewOnAttachStateChangeListenerC20604515jv3, viewOnAttachStateChangeListenerC20604515jv3.getContext(), this.LLLIIIIL);
        viewOnAttachStateChangeListenerC20604515jv3.setTag(R.id.rnd, C1558520qew.LJIIL(this));
        viewOnAttachStateChangeListenerC20604515jv3.getState().LIZLLL = C0Q4Y.BUFFER;
        viewOnAttachStateChangeListenerC20604515jv3.LJIILJJIL(SearchTakoSugCell.class);
        viewOnAttachStateChangeListenerC20604515jv3.setAnimation(null);
        viewOnAttachStateChangeListenerC20604515jv3.setItemAnimator(null);
        LJJIJL().addOnAttachStateChangeListener(this.LLLLIILL);
        C1558520qew.LJI(this, SearchCardScope.class, this, SearchTakoCardAbility.class, null, null);
        if (C0BQH.LIZ()) {
            FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.p5x);
            if (frameLayout != null) {
                C786410Ut5.LJZ(0, frameLayout);
            }
            View viewFindViewById = view.findViewById(R.id.y87);
            if (viewFindViewById != null) {
                C661350Pwr.LIZJ(viewFindViewById);
            }
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv4 = this.LLLIIII;
            if (viewOnAttachStateChangeListenerC20604515jv4 == null) {
                viewOnAttachStateChangeListenerC20604515jv4 = null;
            }
            C339190DRl.LIZLLL(viewOnAttachStateChangeListenerC20604515jv4);
            C723830SaL.LIZ(this, null, new AwS589S0100000_10(this, 648));
            LinearLayoutCompat linearLayoutCompat4 = this.LLJZ;
            if (linearLayoutCompat4 == null) {
                linearLayoutCompat4 = null;
            }
            C786410Ut5.LLILLIZIL(linearLayoutCompat4, 8);
            View viewFindViewById2 = view.findViewById(R.id.u7w);
            if (viewFindViewById2 != null) {
                C0HXV.LJFF(0, viewFindViewById2);
            }
            C688640Qzm c688640Qzm = this.LLLFF;
            if (c688640Qzm == null) {
                c688640Qzm = null;
            }
            if (c688640Qzm.getParent() != null) {
                C688640Qzm c688640Qzm2 = this.LLLFF;
                if (c688640Qzm2 == null) {
                    c688640Qzm2 = null;
                }
                ViewGroup.LayoutParams layoutParams = c688640Qzm2.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    marginStart = ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart();
                } else {
                    marginStart = 0;
                }
                Integer numValueOf = Integer.valueOf(marginStart);
                ViewGroup.LayoutParams layoutParams2 = c688640Qzm2.getLayoutParams();
                if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                    marginEnd = ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginEnd();
                } else {
                    marginEnd = 0;
                }
                Integer numValueOf2 = Integer.valueOf(marginEnd);
                ViewGroup.LayoutParams layoutParams3 = c688640Qzm2.getLayoutParams();
                if ((layoutParams3 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3) != null) {
                    i = marginLayoutParams.bottomMargin;
                }
                C426750GoL.LJIIIZ(c688640Qzm2, numValueOf, 0, numValueOf2, Integer.valueOf(i), false, 16);
            }
        }
        C2211631BhB.LJ(view, new AwS589S0100000_10(this, 650));
        if (C1833207Fy.LIZIZ()) {
            LinearLayoutCompat linearLayoutCompat5 = this.LLJZIJLIL;
            if (linearLayoutCompat5 != null) {
                linearLayoutCompat = linearLayoutCompat5;
            }
            linearLayoutCompat.addOnAttachStateChangeListener(new C0R45(this, 50));
        }
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.bot.component.SearchTakoCardAbility
    public final void R21(C652430PiT c652430PiT, C661490Px5 c661490Px5, C1606420ruC c1606420ruC) {
        SearchMixFeed searchMixFeed;
        TakoInfo bot;
        List<Aweme> awemeList;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        C652590Pij c652590Pij = this.LLLIZZ;
        if (c652590Pij != null && (searchMixFeed = c652590Pij.LL) != null && (bot = searchMixFeed.getBot()) != null && (awemeList = bot.getAwemeList()) != null) {
            Aweme aweme = c652430PiT.LLILLJJLI;
            C1440005kM.LIZ(new C7818033o(awemeList, aweme.getAid()));
            if (c661490Px5 != null) {
                C661510Px7.LIZ.getClass();
                C661510Px7.LIZ(c661490Px5, true, false);
            }
            Iterator<Aweme> it2 = awemeList.iterator();
            while (it2.hasNext()) {
                C0Q3E.LIZJ(it2.next()).Y30().LIZ(new C0P97(this.LLLLIIIILLL));
            }
            Bundle bundle = new Bundle();
            C786410Ut5.LJJJI(FollowStatusChangeMethod.PARAM_UID, aweme.getAid(), bundle);
            C786410Ut5.LJJJI("enter_from", "general_search", bundle);
            C0PRC c0prcZp = zp();
            String str7 = null;
            if (c0prcZp != null) {
                str = c0prcZp.LLIZLLLIL;
            } else {
                str = null;
            }
            C786410Ut5.LJJJI("search_keyword", str, bundle);
            bundle.putInt("com.ss.android.ugc.aweme.intent.extra.FEED_TYPE", 35);
            C0PRC c0prcZp2 = zp();
            if (c0prcZp2 != null) {
                str2 = c0prcZp2.LLILLL;
            } else {
                str2 = null;
            }
            C786410Ut5.LJJJI("search_id", str2, bundle);
            C786410Ut5.LJJJI("list_item_id", aweme.getAid(), bundle);
            C646370PWx c646370PWxBp = Bp();
            if (c646370PWxBp != null) {
                str3 = c646370PWxBp.LLJ;
            } else {
                str3 = null;
            }
            C786410Ut5.LJJJI("search_result_id", str3, bundle);
            C0PRC c0prcZp3 = zp();
            if (c0prcZp3 != null) {
                str7 = c0prcZp3.LLILLJJLI;
            }
            C786410Ut5.LJJJI("key_search_type", str7, bundle);
            SmartRoute smartRoute = new SmartRoute(getContext());
            smartRoute.withUrl("//aweme/detail");
            smartRoute.withParam(bundle);
            smartRoute.withParam("outer_aweme_id", aweme.getAid());
            smartRoute.withParam("video_from", "from_search_mix");
            smartRoute.withParam("previous_page", "general_search");
            smartRoute.withParam("search_detail", C301530Brr.LIZ());
            smartRoute.withBundleAnimation(c1606420ruC.LJFF());
            smartRoute.withParam("activity_has_activity_options", true);
            smartRoute.open();
            C651980Phk c651980Phk = C651970Phj.LLILLL;
            Pair[] pairArr = new Pair[13];
            pairArr[0] = new Pair("token_type", "tikbot");
            pairArr[1] = new Pair("search_result_id", aweme.getAid());
            pairArr[2] = new Pair("rank", String.valueOf(AwemeBizExtKt.getRank(aweme)));
            pairArr[3] = new Pair("is_search_scene", "1");
            C0PRC c0prcZp4 = zp();
            String str8 = "";
            if (c0prcZp4 == null || (str4 = c0prcZp4.LLIZLLLIL) == null) {
                str4 = "";
            }
            pairArr[4] = new Pair("search_keyword", str4);
            pairArr[5] = new Pair("search_type", "general");
            C0PRC c0prcZp5 = zp();
            if (c0prcZp5 == null || (str5 = c0prcZp5.LLILLL) == null) {
                str5 = "";
            }
            pairArr[6] = new Pair("search_id", str5);
            pairArr[7] = new Pair("list_item_id", aweme.getAid());
            String requestId = aweme.getRequestId();
            if (requestId != null) {
                str8 = requestId;
            }
            pairArr[8] = new Pair("request_id", str8);
            if (AwemeSaaSExtKt.isLive(aweme)) {
                str6 = "live_cover";
            } else {
                str6 = "video_cell";
            }
            pairArr[9] = new Pair("enter_method", str6);
            pairArr[10] = new Pair("group_id", aweme.getAid());
            pairArr[11] = new Pair("search_enter_method", ((C0PRC) C0Q3E.LJ(this).Ph1().LIZJ()).LLJLL);
            pairArr[12] = new Pair("fullscreen_enter_doc_id", aweme.getAid());
            Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
            c651980Phk.getClass();
            C651980Phk.LJFF(mapLJIIIIZZ, false);
        }
    }
}
