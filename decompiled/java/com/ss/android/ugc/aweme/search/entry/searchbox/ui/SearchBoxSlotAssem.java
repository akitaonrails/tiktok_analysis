package com.ss.android.ugc.aweme.search.entry.searchbox.ui;

import X.AbstractViewOnClickListenerC1637610siV;
import X.C019F;
import X.C01GW;
import X.C06RN;
import X.C09R3;
import X.C0QKO;
import X.C0QSJ;
import X.C123100dR;
import X.C1308910kAL;
import X.C13IQ;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C1A5L;
import X.C1ER1;
import X.C2217381BqS;
import X.C2271381DvM;
import X.C2271391DvN;
import X.C337180DJs;
import X.C418440Gaw;
import X.C426750GoL;
import X.C452501pT;
import X.C497820Jfg;
import X.C657990PrR;
import X.C668400QJq;
import X.C687700QyG;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1146704e9;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import Y.ATListenerS444S0100000_10;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.services.familypairing.IFamilyPairingService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.search.entry.searchbox.communication.SearchBoxComponentScope;
import com.ss.android.ugc.aweme.search.entry.searchbox.repo.SearchBoxTimeData;
import com.ss.android.ugc.aweme.search.entry.searchbox.ui.SearchBoxSlotAssem;
import com.ss.android.ugc.aweme.search.entry.searchbox.viewmodel.SearchBoxFYPViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AwS25S0001000_10;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS616S0100000_2;
import kotlin.jvm.internal.AwS624S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchBoxSlotAssem extends UISlotAssem implements InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJL;
    public final AssemVMLazy LLJJI;
    public long LLJJIII;
    public boolean LLJJIJI;
    public String LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final C01GW LLJJJ;
    public final C01GW LLJJJIL;
    public final C01GW LLJJJJ;
    public final C01GW LLJJJJJIL;
    public volatile C06RN LLJJJJLIIL;
    public InterfaceC665370Q7z LLJJL;
    public C0QSJ LLJJLIIIJLLLLLLLZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SearchBoxSlotAssem.class, "searchBoxComponentAbility", "getSearchBoxComponentAbility()Lcom/ss/android/ugc/aweme/search/entry/searchbox/communication/SearchBoxComponentAbility;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(SearchBoxSlotAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/search/entry/searchbox/viewmodel/SearchBoxFYPViewModel;", 0);
        c09r3.getClass();
        LLJL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public SearchBoxSlotAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SearchBoxFYPViewModel.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS554S0100000_10((C13IQ) c19719912DlLIZ, 314), AFwS241S0000000_10.get$arr$(178), null, true);
        this.LLJJIJIIJIL = "";
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 315));
        this.LLJJJ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 312));
        this.LLJJJIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 313));
        this.LLJJJJ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 317));
        this.LLJJJJJIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 316));
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.exn;
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{SearchBoxComponentScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SearchBoxComponentScope.class);
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0029 A[Catch: all -> 0x0035, PHI: r1
      0x0029: PHI (r1v1 X.0QSJ) = (r1v0 X.0QSJ), (r1v3 X.0QSJ) binds: [B:8:0x000b, B:13:0x0025] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {, blocks: (B:5:0x0005, B:7:0x0009, B:9:0x000d, B:11:0x0011, B:12:0x0017, B:16:0x0031, B:17:0x0033, B:15:0x0029), top: B:24:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C06RN hp() {
        /*
            r4 = this;
            X.06RN r0 = r4.LLJJJJLIIL
            if (r0 != 0) goto L39
            monitor-enter(r4)
            X.06RN r0 = r4.LLJJJJLIIL     // Catch: java.lang.Throwable -> L35
            if (r0 != 0) goto L38
            X.0QSJ r1 = r4.LLJJLIIIJLLLLLLLZ     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L29
            X.0Q7z r3 = r4.LLJJL     // Catch: java.lang.Throwable -> L35
            if (r3 != 0) goto L17
            X.0Q7z r3 = X.C687700QyG.LJIIIZ(r4)     // Catch: java.lang.Throwable -> L35
            r4.LLJJL = r3     // Catch: java.lang.Throwable -> L35
        L17:
            r0 = 1
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L35
            java.lang.Class<com.ss.android.ugc.aweme.search.entry.searchbox.communication.SearchBoxComponentScope> r1 = com.ss.android.ugc.aweme.search.entry.searchbox.communication.SearchBoxComponentScope.class
            r0 = 0
            r2[r0] = r1     // Catch: java.lang.Throwable -> L35
            X.0QSJ r1 = X.C687700QyG.LIZLLL(r3, r2)     // Catch: java.lang.Throwable -> L35
            r4.LLJJLIIIJLLLLLLLZ = r1     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L29
            r0 = 0
            goto L31
        L29:
            java.lang.Class<X.06RN> r0 = X.C06RN.class
            java.lang.Object r0 = r1.getAbility(r0)     // Catch: java.lang.Throwable -> L35
            X.06RN r0 = (X.C06RN) r0     // Catch: java.lang.Throwable -> L35
        L31:
            r4.LLJJJJLIIL = r0     // Catch: java.lang.Throwable -> L35
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L35
            return r0
        L35:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L38:
            monitor-exit(r4)
        L39:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.entry.searchbox.ui.SearchBoxSlotAssem.hp():X.06RN");
    }

    public final LinearLayout ip() {
        return (LinearLayout) this.LLJJJ.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        int iLIZIZ;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i;
        int iIntValue;
        String string;
        Integer numLIZJ;
        Integer numLIZJ2;
        super.onViewCreated(view);
        C337180DJs.LIZ(getContentView());
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJL;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0QKQ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0QKV) obj).LL;
            }
        }, null, new AwS616S0100000_2(this, 62), 6);
        C736680Sv4.LJIIIIZZ(this, this.LLJJI.getValue(), new C2217381BqS() { // from class: X.0QKR
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0QKV) obj).LLILLJJLI;
            }
        }, C736820SvI.LIZLLL(), new AwS624S0100000_10(this, 26), 4);
        Context context = getContext();
        if (context != null) {
            iLIZIZ = C497820Jfg.LIZJ(context);
        } else {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(35));
        }
        C657990PrR.LIZJ((View) this.LLJJIJIL.getValue(), new AwS25S0001000_10(iLIZIZ, 6));
        ViewGroup.LayoutParams layoutParams = ip().getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = null;
        }
        if (marginLayoutParams != null) {
            i = marginLayoutParams.topMargin;
        } else {
            i = 0;
        }
        C426750GoL.LJIIIZ(ip(), null, Integer.valueOf(i + iLIZIZ), null, null, false, 29);
        ip().getBackground().setAutoMirrored(true);
        ((TuxIconView) this.LLJJJIL.getValue()).LIZJ(true);
        TextView textView = (TextView) this.LLJJJJ.getValue();
        Context context2 = getContext();
        int iIntValue2 = -16777216;
        if (context2 != null && (numLIZJ2 = C1308910kAL.LIZJ(R.attr.za, context2)) != null) {
            iIntValue = numLIZJ2.intValue();
        } else {
            iIntValue = -16777216;
        }
        textView.setShadowLayer(1.0f, 0.0f, 1.0f, iIntValue);
        C786410Ut5.B5((TuxTextView) this.LLJJJJ.getValue(), 0.75f);
        TextView textView2 = (TextView) this.LLJJJJJIL.getValue();
        Context context3 = getContext();
        if (context3 != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.za, context3)) != null) {
            iIntValue2 = numLIZJ.intValue();
        }
        textView2.setShadowLayer(1.0f, 0.0f, 1.0f, iIntValue2);
        if (C0QKO.LIZ().wordShowInSearchBox == 1) {
            String strLLILL = C1ER1.LIZIZ.LLILL();
            if (C123100dR.LIZ(strLLILL) && getContext() != null) {
                this.LLJJIJIIJIL = strLLILL;
                TextView textView3 = (TextView) this.LLJJJJ.getValue();
                Context context4 = getContext();
                if (context4 == null || (string = context4.getString(2131847109, strLLILL)) == null) {
                    string = "";
                }
                textView3.setText(string);
                this.LLJJIJI = true;
                C668400QJq.LIZ.getClass();
                C668400QJq.LIZ(strLLILL);
            }
        }
        C2271391DvN.LIZ(ip(), (C1A5L) C2271381DvM.LJJLIIIJILLIZJL.getValue());
        C786410Ut5.I7(new AbstractViewOnClickListenerC1637610siV() { // from class: X.0QFG
            {
                super(300L);
            }

            @Override // X.AbstractViewOnClickListenerC1637610siV
            public final void LIZ(View view2) {
                String aid;
                boolean zIsLike;
                boolean zIsCollected;
                boolean zIsCommentClicked;
                boolean zIsForwardClicked;
                if (view2 != null) {
                    AssemVMLazy assemVMLazy2 = this.LLILZ.LLJJI;
                    InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = SearchBoxSlotAssem.LLJL;
                    SearchBoxFYPViewModel searchBoxFYPViewModel = (SearchBoxFYPViewModel) assemVMLazy2.getValue();
                    SearchBoxSlotAssem searchBoxSlotAssem = this.LLILZ;
                    boolean z = searchBoxSlotAssem.LLJJIJI;
                    String str = searchBoxSlotAssem.LLJJIJIIJIL;
                    C1594400rao.LIZ.getClass();
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LJIIIIZZ("position", "homepage_hot");
                    c2344009Gk.LIZJ(z ? 1 : 0, "is_interest_point_query");
                    c2344009Gk.LJIIIIZZ("search_keyword", str);
                    C20684815ws.LJIILLIIL("feed_search_box_click", c2344009Gk.LIZ);
                    int i2 = C04SL.LIZ;
                    ((Keva) C0QFI.LIZ.getValue()).storeString("showed_time", GsonProtectorUtils.toJson((Gson) C0QFI.LIZIZ.getValue(), new SearchBoxTimeData(C0QFI.LIZ().showedTime, System.currentTimeMillis())));
                    C0QFJ c0qfj = new Object() { // from class: X.0QFJ
                    };
                    Aweme aweme = searchBoxFYPViewModel.LL;
                    c0qfj.getClass();
                    Context context5 = view2.getContext();
                    String aid2 = null;
                    if (context5 != null && !C0SHX.LIZ(context5, null).LJI() && !C0SHX.LIZ(context5, null).LIZLLL()) {
                        IFamilyPairingService iFamilyPairingServiceLJIIL = ComplianceServiceProvider.LJIIL();
                        if (iFamilyPairingServiceLJIIL != null && iFamilyPairingServiceLJIIL.LJIIIZ()) {
                            C1389890mGx c1389890mGx = new C1389890mGx(view2);
                            c1389890mGx.LJIIIZ(2131834392);
                            c1389890mGx.LJIIJJI();
                            return;
                        }
                        Context context6 = view2.getContext();
                        if (context6 == null) {
                            return;
                        }
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("search box open search router, aid: ");
                        if (aweme != null) {
                            aid2 = aweme.getAid();
                        }
                        sbLIZ.append(aid2);
                        C2188811AlT.LIZIZ(sbLIZ);
                        String strLLJLILLLLZIIL = C1ER1.LIZIZ.LLJLILLLLZIIL();
                        if (C1203504nJ.LIZ()) {
                            InterfaceC651090PgJ interfaceC651090PgJ = new InterfaceC651090PgJ(z) { // from class: X.0Q3i
                                public final boolean LIZ;

                                @Override // X.InterfaceC651090PgJ
                                public final void LIZJ(Bundle bundle) {
                                }

                                {
                                    this.LIZ = z;
                                }

                                @Override // X.InterfaceC651090PgJ
                                public final void LIZ(C0PXF c0pxf) {
                                    c0pxf.LIZ = "homepage_hot";
                                    c0pxf.LIZIZ = "homepage_hot";
                                    c0pxf.LIZJ = "click_feed_searchbox";
                                }

                                @Override // X.InterfaceC651090PgJ
                                public final void LIZIZ(C0Q2Q<?> c0q2q) {
                                    if ((c0q2q instanceof C664180Q3k) && c0q2q != null) {
                                        c0q2q.LJIJJ("homepage_hot");
                                        c0q2q.LJ("enter_type", "click_feed_searchbox");
                                        c0q2q.LIZLLL(this.LIZ ? 1 : 0, "is_interest_point_query");
                                        c0q2q.LJIILJJIL();
                                    }
                                }
                            };
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            if (strLLJLILLLLZIIL != null) {
                                linkedHashMap.put("enter_blank_page_id", strLLJLILLLLZIIL);
                            }
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                            if (strLLJLILLLLZIIL != null) {
                                linkedHashMap2.put("blankpage_id", strLLJLILLLLZIIL);
                            }
                            C651080PgI c651080PgI = new C651080PgI(context6, new InterfaceC651110PgL(aweme, linkedHashMap, linkedHashMap2) { // from class: X.0Q3h
                                public final Aweme LIZ;
                                public final Map<String, String> LIZIZ;
                                public final Map<String, String> LIZJ;

                                @Override // X.InterfaceC651110PgL
                                public final Bundle LIZ() {
                                    String aid3;
                                    Bundle bundle = new Bundle();
                                    Aweme aweme2 = this.LIZ;
                                    if (aweme2 == null || (aid3 = aweme2.getAid()) == null) {
                                        aid3 = "";
                                    }
                                    C786410Ut5.LJJJI("group_id", aid3, bundle);
                                    bundle.putBoolean("in_single_stack", true);
                                    C786410Ut5.LJJJI("search_from", "", bundle);
                                    C786410Ut5.LJJJI("enter_from", "", bundle);
                                    C786410Ut5.LJJJI("enter_method", "", bundle);
                                    bundle.putBoolean("set_hint_by_sug_word", false);
                                    bundle.putInt("back_flag", 1);
                                    C786410Ut5.LJJJI("blankpage_enter_from", "homepage_hot", bundle);
                                    C786410Ut5.LJJJI("blankpage_enter_method", "enter", bundle);
                                    C786410Ut5.LJJJI("search_type", "general", bundle);
                                    Aweme aweme3 = this.LIZ;
                                    bundle.putBoolean("is_feed_liked", aweme3 != null ? aweme3.isLike() : false);
                                    Aweme aweme4 = this.LIZ;
                                    bundle.putBoolean("is_feed_collected", aweme4 != null ? AwemeExtKt.isCollected(aweme4) : false);
                                    Aweme aweme5 = this.LIZ;
                                    bundle.putBoolean("is_feed_comment_clicked", aweme5 != null ? AwemeBizExtKt.isCommentClicked(aweme5) : false);
                                    Aweme aweme6 = this.LIZ;
                                    bundle.putBoolean("is_feed_forward_clicked", aweme6 != null ? AwemeBizExtKt.isForwardClicked(aweme6) : false);
                                    Map<String, String> map = this.LIZIZ;
                                    if (map != null) {
                                        for (Map.Entry<String, String> entry : map.entrySet()) {
                                            C786410Ut5.LJJJI(entry.getKey(), entry.getValue(), bundle);
                                        }
                                    }
                                    return bundle;
                                }

                                @Override // X.InterfaceC651110PgL
                                public final C0Q2Q LIZIZ() {
                                    C664180Q3k c664180Q3k = new C664180Q3k();
                                    c664180Q3k.LJIJJLI("enter");
                                    Map<String, String> map = this.LIZJ;
                                    if (map != null) {
                                        for (Map.Entry<String, String> entry : map.entrySet()) {
                                            c664180Q3k.LJ(entry.getKey(), entry.getValue());
                                        }
                                    }
                                    return c664180Q3k;
                                }

                                {
                                    this.LIZ = aweme;
                                    this.LIZIZ = linkedHashMap;
                                    this.LIZJ = linkedHashMap2;
                                }
                            }, interfaceC651090PgJ);
                            c651080PgI.LIZLLL = C0PXG.SCENE_FEED_BOX;
                            c651080PgI.LIZ();
                            return;
                        }
                        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                        if (strLLJLILLLLZIIL != null) {
                            linkedHashMap3.put("blankpage_id", strLLJLILLLLZIIL);
                        }
                        C664180Q3k c664180Q3k = new C664180Q3k();
                        c664180Q3k.LJIJJ("homepage_hot");
                        c664180Q3k.LJIIZILJ("enter_method", "enter");
                        c664180Q3k.LJFF("enter_type", "click_feed_searchbox", InterfaceC1210900hcG.LIZ);
                        c664180Q3k.LIZLLL(z ? 1 : 0, "is_interest_point_query");
                        for (Map.Entry entry : linkedHashMap3.entrySet()) {
                            c664180Q3k.LJ((String) entry.getKey(), (String) entry.getValue());
                        }
                        c664180Q3k.LJIILJJIL();
                        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context6, "//search");
                        if (aweme == null || (aid = aweme.getAid()) == null) {
                            aid = "";
                        }
                        smartRouteBuildRoute.withParam("group_id", aid);
                        smartRouteBuildRoute.withParam("in_single_stack", true);
                        smartRouteBuildRoute.withParam("enter_from", "homepage_hot");
                        smartRouteBuildRoute.withParam("search_from", "homepage_hot");
                        smartRouteBuildRoute.withParam("enter_method", "click_feed_searchbox");
                        smartRouteBuildRoute.withParam("set_hint_by_sug_word", false);
                        smartRouteBuildRoute.withParam("blankpage_enter_from", "homepage_hot");
                        smartRouteBuildRoute.withParam("blankpage_enter_method", "enter");
                        if (aweme != null) {
                            zIsLike = aweme.isLike();
                        } else {
                            zIsLike = false;
                        }
                        smartRouteBuildRoute.withParam("is_feed_liked", zIsLike);
                        if (aweme != null) {
                            zIsCollected = AwemeExtKt.isCollected(aweme);
                        } else {
                            zIsCollected = false;
                        }
                        smartRouteBuildRoute.withParam("is_feed_collected", zIsCollected);
                        if (aweme != null) {
                            zIsCommentClicked = AwemeBizExtKt.isCommentClicked(aweme);
                        } else {
                            zIsCommentClicked = false;
                        }
                        smartRouteBuildRoute.withParam("is_feed_comment_clicked", zIsCommentClicked);
                        if (aweme != null) {
                            zIsForwardClicked = AwemeBizExtKt.isForwardClicked(aweme);
                        } else {
                            zIsForwardClicked = false;
                        }
                        smartRouteBuildRoute.withParam("is_feed_forward_clicked", zIsForwardClicked);
                        if (strLLJLILLLLZIIL != null) {
                            smartRouteBuildRoute.withParam("enter_blank_page_id", strLLJLILLLLZIIL);
                        }
                        smartRouteBuildRoute.open();
                    }
                }
            }
        }, ip());
        ip().setOnTouchListener(new ATListenerS444S0100000_10(this, 10));
    }
}
