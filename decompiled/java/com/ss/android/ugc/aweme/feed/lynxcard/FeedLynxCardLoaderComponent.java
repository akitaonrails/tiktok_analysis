package com.ss.android.ugc.aweme.feed.lynxcard;

import X.C01GW;
import X.C054G;
import X.C09JN;
import X.C0PEM;
import X.C0S78;
import X.C0SR4;
import X.C11JF;
import X.C13LP;
import X.C1559720qgs;
import X.C1559880qh8;
import X.C1566140qrE;
import X.C1784290wX5;
import X.C1867050ygZ;
import X.C1906580ziK;
import X.C20551815bQ;
import X.C20552915bb;
import X.C20553215be;
import X.C20553715bj;
import X.C20554315bp;
import X.C20571615ec;
import X.C20684815ws;
import X.C2095008Iq;
import X.C2188811AlT;
import X.C2296808zG;
import X.C2552509zP;
import X.C299750Boz;
import X.C452501pT;
import X.C628500Oky;
import X.C630740Ooa;
import X.C823050WQl;
import X.EnumC20654715s1;
import X.EnumC452301pR;
import X.InterfaceC1565950qqv;
import X.InterfaceC1616070s9l;
import android.content.Context;
import android.database.DataSetObserver;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.ab.CacheManagerConfig;
import com.ss.android.ugc.aweme.feed.ab.StrategyInfo;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.lynxcard.FeedLynxCardLoaderComponent;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.cardinsert.CardInsertInfo;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS216S0000000_27;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS575S0100000_31;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes32.dex */
public final class FeedLynxCardLoaderComponent extends BasePanelComponent {
    public final C01GW LL;
    public final C630740Ooa LLILLJJLI;
    public int LLILLL;
    public final C054G LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;
    public final C01GW LLIZ;
    public final int LLIZLLLIL;
    public final int LLJ;
    public final int LLJI;
    public C11JF LLJIJIL;

    public final IFeedPanelPlatformAbility bo() {
        return (IFeedPanelPlatformAbility) this.LL.getValue();
    }

    public FeedLynxCardLoaderComponent() {
        C01GW c01gwLIZIZ;
        Map<String, String> map;
        String str;
        Integer numLJIIJJI;
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS568S0100000_24((InterfaceC1565950qqv) this, 417), null);
            C1566140qrE.LIZJ(this, c630740Ooa);
            c01gwLIZIZ = c630740Ooa;
        } else {
            c01gwLIZIZ = C452501pT.LIZIZ(new C1559720qgs(false, this));
        }
        this.LL = c01gwLIZIZ;
        this.LLILLJJLI = C628500Oky.LIZ(new C1559880qh8(this));
        this.LLILZ = C2296808zG.LIZ(C0PEM.LIZJ);
        EnumC452301pR enumC452301pR = EnumC452301pR.NONE;
        this.LLILZIL = C452501pT.LIZ(enumC452301pR, AFwS216S0000000_27.get$arr$(114));
        this.LLILZLL = C452501pT.LIZ(enumC452301pR, AFwS221S0000000_31.get$arr$(188));
        this.LLIZ = C452501pT.LIZ(enumC452301pR, AFwS221S0000000_31.get$arr$(187));
        C01GW c01gw = C1867050ygZ.LIZIZ;
        int iIntValue = ((Number) c01gw.getValue()).intValue();
        this.LLIZLLLIL = iIntValue;
        StrategyInfo strategyInfoLIZJ = C1784290wX5.LIZJ();
        int iMax = Math.max((strategyInfoLIZJ == null || (map = strategyInfoLIZJ.config) == null || (str = map.get("index")) == null || (numLJIIJJI = C2095008Iq.LJIIJJI(str)) == null) ? ((Number) c01gw.getValue()).intValue() : numLJIIJJI.intValue(), ((Number) c01gw.getValue()).intValue());
        this.LLJ = iMax;
        this.LLJI = C1784290wX5.LJFF() ? iMax : iIntValue;
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public final void m198do() {
        List<Aweme> awemeList;
        Context context;
        List<Aweme> awemeList2;
        Aweme aweme;
        CardInsertInfo cardInsertInfo;
        Integer num;
        int iIntValue;
        C20553715bj value;
        Aweme aweme2;
        CardInsertInfo cardInsertInfo2;
        ArrayList<Integer> arrayList;
        try {
            IFeedPanelPlatformAbility iFeedPanelPlatformAbilityBo = bo();
            if (iFeedPanelPlatformAbilityBo == null || (awemeList = iFeedPanelPlatformAbilityBo.getAwemeList()) == null || (context = getContext()) == null) {
                return;
            }
            int iMax = Math.max(0, (this.LLILLL - ((Number) this.LLILZLL.getValue()).intValue()) - ((Number) this.LLIZ.getValue()).intValue());
            boolean z = true;
            int iMin = Math.min(awemeList.size() - 1, this.LLILLL + ((Number) this.LLILZIL.getValue()).intValue() + ((Number) this.LLIZ.getValue()).intValue());
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            C20553215be.LIZ.getClass();
            for (Map.Entry<String, C20553715bj> entry : C20553215be.LIZLLL.entrySet()) {
                C20553715bj value2 = entry.getValue();
                if (value2 != null && (num = value2.LJFF) != null && (((iIntValue = num.intValue()) < iMax || iIntValue > iMin) && (value = entry.getValue()) != null && (aweme2 = value.LJI) != null && (cardInsertInfo2 = aweme2.getCardInsertInfo()) != null)) {
                    int cardType = cardInsertInfo2.getCardType();
                    if (cardType == 0 || ((arrayList = ((CacheManagerConfig) C20552915bb.LIZIZ.getValue()).releaseWhiteList) != null && arrayList.contains(Integer.valueOf(cardType)) == z)) {
                        C20571615ec c20571615ec = C20571615ec.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("lynx_memory_opt: release card error, no cardType or in white list, cardIndex = ");
                        sbLIZ.append(iIntValue);
                        sbLIZ.append(", cardType = ");
                        sbLIZ.append(cardType);
                        sbLIZ.append(", releaseStartIndex = ");
                        sbLIZ.append(iMax);
                        sbLIZ.append(", releaseEndIndex = ");
                        sbLIZ.append(iMin);
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        c20571615ec.getClass();
                        C20571615ec.LIZ(strLIZIZ);
                    } else {
                        C20571615ec c20571615ec2 = C20571615ec.LIZ;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("lynx_memory_opt: release card, cardIndex = ");
                        sbLIZ2.append(iIntValue);
                        sbLIZ2.append(", curIndex = ");
                        sbLIZ2.append(this.LLILLL);
                        sbLIZ2.append(", releaseStartIndex = ");
                        sbLIZ2.append(iMax);
                        sbLIZ2.append(", releaseEndIndex = ");
                        sbLIZ2.append(iMin);
                        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                        c20571615ec2.getClass();
                        C20571615ec.LIZ(strLIZIZ2);
                        linkedHashMap.put(entry.getKey(), Integer.valueOf(cardType));
                    }
                }
                z = true;
            }
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                C20553215be c20553215be = C20553215be.LIZ;
                String str = (String) entry2.getKey();
                c20553215be.getClass();
                if (C20553215be.LJI(str)) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("card_type", ((Number) entry2.getValue()).intValue());
                    jSONObject.put("release_reason", "out_of_index");
                    C20684815ws.LJIJ("rd_feed_lynx_card_release", jSONObject);
                }
            }
            int iMax2 = Math.max(0, this.LLILLL - ((Number) this.LLILZLL.getValue()).intValue());
            int iMin2 = Math.min(awemeList.size() - 1, this.LLILLL + ((Number) this.LLILZIL.getValue()).intValue());
            if (iMax2 > iMin2) {
                return;
            }
            int i = iMax2;
            while (true) {
                IFeedPanelPlatformAbility iFeedPanelPlatformAbilityBo2 = bo();
                if (iFeedPanelPlatformAbilityBo2 != null && (awemeList2 = iFeedPanelPlatformAbilityBo2.getAwemeList()) != null && (aweme = (Aweme) C13LP.LJJJLZIJ(i, awemeList2)) != null && aweme.getAwemeType() == 105 && (cardInsertInfo = aweme.getCardInsertInfo()) != null) {
                    C20553215be c20553215be2 = C20553215be.LIZ;
                    IFeedPanelPlatformAbility iFeedPanelPlatformAbilityBo3 = bo();
                    String strCY1 = iFeedPanelPlatformAbilityBo3 != null ? iFeedPanelPlatformAbilityBo3.cY1() : null;
                    c20553215be2.getClass();
                    if (C20553215be.LIZ(context, strCY1, aweme, null, null)) {
                        C20553215be.LJIIJ(Integer.valueOf(cardInsertInfo.getCardType()), aweme, i);
                        C20571615ec c20571615ec3 = C20571615ec.LIZ;
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("lynx_memory_opt: load card, cardIndex = ");
                        sbLIZ3.append(i);
                        sbLIZ3.append(", curIndex = ");
                        sbLIZ3.append(this.LLILLL);
                        sbLIZ3.append(", preloadStartIndex = ");
                        sbLIZ3.append(iMax2);
                        sbLIZ3.append(", preloadEndIndex = ");
                        sbLIZ3.append(iMin2);
                        String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ3);
                        c20571615ec3.getClass();
                        C20571615ec.LIZ(strLIZIZ3);
                        if (i < this.LLILLL) {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("card_type", cardInsertInfo.getCardType());
                            C20684815ws.LJIJ("rd_feed_lynx_card_reload", jSONObject2);
                        }
                    }
                }
                if (i == iMin2) {
                    return;
                } else {
                    i++;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20571615ec c20571615ec4 = C20571615ec.LIZ;
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("lynx_memory_opt: load lynx card error: ");
            sbLIZ4.append(e.getMessage());
            String strLIZIZ4 = C2188811AlT.LIZIZ(sbLIZ4);
            c20571615ec4.getClass();
            C20571615ec.LIZIZ(strLIZIZ4);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public final void onDestroy() throws JSONException {
        Aweme aweme;
        CardInsertInfo cardInsertInfo;
        int cardType;
        ArrayList<Integer> arrayList;
        super.onDestroy();
        C20551815bQ.LIZ.getClass();
        ((LinkedHashMap) C20551815bQ.LIZIZ).clear();
        C20551815bQ.LIZJ = null;
        C20551815bQ.LIZLLL = null;
        C20551815bQ.LJ = null;
        C20551815bQ.LJI = null;
        ((LinkedHashMap) C20551815bQ.LJII).clear();
        ((ArrayList) C20551815bQ.LJIIIIZZ).clear();
        C20551815bQ.LJIIIZ.clear();
        C20551815bQ.LJIIJ.clear();
        C20554315bp c20554315bp = C20554315bp.LIZIZ;
        EnumC20654715s1 enumC20654715s1 = EnumC20654715s1.SPECIAL_CARD;
        c20554315bp.LIZLLL(enumC20654715s1);
        c20554315bp.LJFF(enumC20654715s1);
        c20554315bp.LIZIZ(enumC20654715s1);
        C11JF c11jf = this.LLJIJIL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        if (((CacheManagerConfig) C20552915bb.LIZIZ.getValue()).releaseAllWhenDestroy) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            C20553215be.LIZ.getClass();
            for (Map.Entry<String, C20553715bj> entry : C20553215be.LIZLLL.entrySet()) {
                C20553715bj value = entry.getValue();
                if (value != null && (aweme = value.LJI) != null && (cardInsertInfo = aweme.getCardInsertInfo()) != null && (cardType = cardInsertInfo.getCardType()) != 0 && ((arrayList = ((CacheManagerConfig) C20552915bb.LIZIZ.getValue()).releaseWhiteList) == null || !arrayList.contains(Integer.valueOf(cardType)))) {
                    linkedHashMap.put(entry.getKey(), Integer.valueOf(cardType));
                }
            }
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                C20553215be c20553215be = C20553215be.LIZ;
                String str = (String) entry2.getKey();
                c20553215be.getClass();
                if (C20553215be.LJI(str)) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("card_type", ((Number) entry2.getValue()).intValue());
                    jSONObject.put("release_reason", "activity_destroy");
                    C20684815ws.LJIJ("rd_feed_lynx_card_release", jSONObject);
                }
            }
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentViewCreated() {
        C0SR4 c0sr4Zv0;
        super.onParentViewCreated();
        IFeedPanelPlatformAbility iFeedPanelPlatformAbilityBo = bo();
        if (iFeedPanelPlatformAbilityBo != null && (c0sr4Zv0 = iFeedPanelPlatformAbilityBo.Zv0()) != null) {
            c0sr4Zv0.LJJII(new DataSetObserver() { // from class: X.15bZ
                @Override // android.database.DataSetObserver
                public final void onChanged() {
                    List<Aweme> awemeList;
                    super.onChanged();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onChanged() ");
                    IFeedPanelPlatformAbility iFeedPanelPlatformAbilityBo2 = this.LIZ.bo();
                    sbLIZ.append((iFeedPanelPlatformAbilityBo2 == null || (awemeList = iFeedPanelPlatformAbilityBo2.getAwemeList()) == null) ? null : Integer.valueOf(awemeList.size()));
                    C2188811AlT.LIZIZ(sbLIZ);
                    if (!((CacheManagerConfig) C20552915bb.LIZIZ.getValue()).enable) {
                        FeedLynxCardLoaderComponent feedLynxCardLoaderComponent = this.LIZ;
                        feedLynxCardLoaderComponent.fo(feedLynxCardLoaderComponent.LLILLL, (feedLynxCardLoaderComponent.LLJI + r1) - 1);
                    } else if (!(!C282070B3t.LIZ)) {
                        this.LIZ.m198do();
                    } else {
                        FeedLynxCardLoaderComponent feedLynxCardLoaderComponent2 = this.LIZ;
                        C23250099c.LIZLLL(feedLynxCardLoaderComponent2.LLILZ, null, null, new C1407980mk8(feedLynxCardLoaderComponent2, null), 3);
                    }
                }
            });
        }
        IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LLILLJJLI.getValue();
        if (iViewPagerComponentAbility != null) {
            iViewPagerComponentAbility.Bv0(new InterfaceC1616070s9l() { // from class: X.15ba
                @Override // X.InterfaceC1616160s9u
                public final /* synthetic */ void onBeforePageChange() {
                }

                @Override // X.InterfaceC1616070s9l, X.InterfaceC469360Ias
                public final void onPageScrollStateChanged(int i) {
                }

                @Override // X.InterfaceC1616070s9l, X.InterfaceC469360Ias
                public final void onPageScrolled(int i, float f, int i2) {
                }

                @Override // X.InterfaceC1616070s9l
                public final void onPageScrolledEnd(int i, float f, int i2) {
                }

                @Override // X.InterfaceC1616070s9l
                public final void onPageUnSelected(C0SZ8 c0sz8) {
                }

                @Override // X.InterfaceC1616160s9u
                public final /* synthetic */ void onScrollToItemStart(int i) {
                }

                @Override // X.InterfaceC1616160s9u
                public final /* synthetic */ void onScrollToItemStart(int i, boolean z) {
                }

                @Override // X.InterfaceC1616070s9l, X.InterfaceC469360Ias
                public final void onPageSelected(int i) {
                    int i2;
                    boolean zLJI = MethodIDManager.LJI(71940);
                    if (C1784290wX5.LJFF()) {
                        i2 = this.LL.LLJ;
                    } else {
                        i2 = this.LL.LLIZLLLIL;
                    }
                    this.LL.LLILLL = i;
                    if (((CacheManagerConfig) C20552915bb.LIZIZ.getValue()).enable) {
                        if (i != 0) {
                            if (!C282070B3t.LIZ) {
                                FeedLynxCardLoaderComponent feedLynxCardLoaderComponent = this.LL;
                                C23250099c.LIZLLL(feedLynxCardLoaderComponent.LLILZ, null, null, new C1407990mk9(feedLynxCardLoaderComponent, null), 3);
                            } else {
                                this.LL.m198do();
                            }
                        }
                    } else if (C1784290wX5.LJ()) {
                        this.LL.fo(i + 2, i + i2);
                    } else {
                        int i3 = i + i2;
                        this.LL.fo(i3, i3);
                    }
                    if (zLJI) {
                        MethodIDManager.LJ();
                    }
                }

                @Override // X.InterfaceC1616070s9l
                public final void onPageSelected(int i, boolean z) {
                    if (MethodIDManager.LJI(71940)) {
                        MethodIDManager.LJ();
                    }
                }
            });
        }
        if (C1784290wX5.LIZLLL()) {
            C823050WQl.LIZJ().execute(new Runnable() { // from class: X.0wYW
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("FeedLynxCardLoaderComponent@5b23.onParentViewCreated$3");
                    try {
                        C20548215aq c20548215aq = C20548215aq.LIZ;
                        StrategyInfo strategyInfoLIZIZ = C1784290wX5.LIZIZ();
                        Map<String, String> map = strategyInfoLIZIZ != null ? strategyInfoLIZIZ.config : null;
                        c20548215aq.getClass();
                        C20548215aq.LIZIZ(map);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("FeedLynxCardLoaderComponent@5b23.onParentViewCreated$3");
                }
            });
        }
        this.LLJIJIL = C1906580ziK.LIZJ().LIZ().LJLLLLLL(new C09JN() { // from class: X.0oqe
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("FeedLynxCardLoaderComponent@5b23.onParentViewCreated$4");
                if (((C606810Nr5) obj).LIZIZ) {
                    C823050WQl.LIZJ().execute(new Runnable() { // from class: X.0oqd
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("FeedLynxCardLoaderComponent@5b23.onParentViewCreated$4$1");
                            try {
                                JSONObject jSONObject = new JSONObject();
                                C20553215be.LIZ.getClass();
                                jSONObject.put("max_count", C20553215be.LJ);
                                C20684815ws.LJIJ("rd_feed_lynx_card_max_count", jSONObject);
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("FeedLynxCardLoaderComponent@5b23.onParentViewCreated$4$1");
                        }
                    });
                }
                C1C7U.LIZIZ("FeedLynxCardLoaderComponent@5b23.onParentViewCreated$4");
            }
        });
        C20551815bQ c20551815bQ = C20551815bQ.LIZ;
        IFeedPanelPlatformAbility iFeedPanelPlatformAbilityBo2 = bo();
        c20551815bQ.getClass();
        if (C2552509zP.LIZ) {
            C0S78.LIZJ(new AwS575S0100000_31(iFeedPanelPlatformAbilityBo2, 1540), true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void fo(int r8, int r9) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.lynxcard.FeedLynxCardLoaderComponent.fo(int, int):void");
    }
}
