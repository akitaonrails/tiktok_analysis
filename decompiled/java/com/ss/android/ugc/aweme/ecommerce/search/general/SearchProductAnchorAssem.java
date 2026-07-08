package com.ss.android.ugc.aweme.ecommerce.search.general;

import X.C0BT5;
import X.C0PLQ;
import X.C0PPQ;
import X.C0PQ2;
import X.C0PRC;
import X.C0Q29;
import X.C0QAU;
import X.C0QAX;
import X.C0QAZ;
import X.C1558520qew;
import X.C293650Bf9;
import X.C486180J4u;
import X.C646370PWx;
import X.C653660PkS;
import X.C654590Plx;
import X.C655440PnK;
import X.C786410Ut5;
import X.EnumC657940PrM;
import X.InterfaceC1587906Jp;
import X.InterfaceC583720Muw;
import X.InterfaceC655260Pn2;
import X.InterfaceC662740Pz6;
import X.InterfaceC712990Rxx;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.android.bcm.api.model.BcmParams;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.ecommerce.search.general.SearchProductAnchorAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.model.SearchMixFeedBase;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter$Player$PlayerControlAbility;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$CardCommonAbility;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$MobAbility;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$NavigateAbility;
import com.ss.android.ugc.aweme.search.ecom.data.Product;
import com.ss.android.ugc.aweme.search.ecommerce.live.IExtendedTopLiveProductView;
import com.ss.android.ugc.aweme.search.ecommerce.live.ITopLiveProductView;
import com.ss.android.ugc.aweme.search.pages.result.common.core.model.SearchCardInfo;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SingleLive;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public class SearchProductAnchorAssem extends ReusedUISlotAssem<SearchProductAnchorAssem> implements InterfaceC712990Rxx<InterfaceC655260Pn2> {
    public FrameLayout LLJJLIIIJLLLLLLLZ;
    public ITopLiveProductView LLJL;
    public boolean LLJLIL;
    public SearchMixFeedBase LLJLILLLLZIIL;
    public volatile boolean LLJLL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.brp;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final FrameLayout op() {
        View viewFindViewById = this.LLJJLIIIJLLLLLLLZ;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.rx3) : null;
            this.LLJJLIIIJLLLLLLLZ = (FrameLayout) viewFindViewById;
        }
        return (FrameLayout) viewFindViewById;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.view.View, com.ss.android.ugc.aweme.search.ecommerce.live.ITopLiveProductView] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v0, types: [android.view.ViewGroup, android.widget.FrameLayout] */
    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public void onViewCreated(View view) {
        ?? c0qau;
        if (!C0BT5.LIZ()) {
            return;
        }
        AwS554S0100000_10 awS554S0100000_10 = new AwS554S0100000_10(this, 27);
        ?? Op = op();
        if (Op != 0) {
            int iLIZ = C293650Bf9.LIZ();
            if (iLIZ != 4 && iLIZ != 5) {
                if (iLIZ == 6) {
                    c0qau = new C0QAX(view.getContext(), awS554S0100000_10);
                } else if (iLIZ == 7) {
                    c0qau = 0;
                } else if (iLIZ == 8) {
                    c0qau = new C0Q29(view.getContext(), awS554S0100000_10, 6);
                } else {
                    c0qau = new C0QAZ(view.getContext(), C293650Bf9.LIZ(), awS554S0100000_10, 6);
                }
            } else {
                c0qau = new C0QAU(view.getContext(), C293650Bf9.LIZ(), awS554S0100000_10);
            }
            this.LLJL = c0qau;
            if (c0qau != 0) {
                Op.addView(c0qau);
            }
        }
        ((SearchComponentCenter$Player$PlayerControlAbility) C1558520qew.LIZJ(C1558520qew.LJIIL(this), SearchComponentCenter$Player$PlayerControlAbility.class)).Im2(new InterfaceC583720Muw() { // from class: X.0Pmz
            @Override // X.InterfaceC583720Muw
            public final void LIZ() {
            }

            @Override // X.InterfaceC583720Muw
            public final void LIZJ() {
            }

            @Override // X.InterfaceC583720Muw
            public final void LIZLLL() {
            }

            @Override // X.InterfaceC583720Muw
            public final void onBuffering(boolean z) {
            }

            @Override // X.InterfaceC583720Muw
            public final void onLoading() {
            }

            @Override // X.InterfaceC583720Muw
            public final void LJII() {
                ITopLiveProductView iTopLiveProductView = this.LIZ.LLJL;
                if (iTopLiveProductView != null) {
                    iTopLiveProductView.resumeDisplay();
                }
            }

            @Override // X.InterfaceC583720Muw
            public final void LJJZ() {
                ITopLiveProductView iTopLiveProductView = this.LIZ.LLJL;
                if (iTopLiveProductView != null) {
                    iTopLiveProductView.resumeDisplay();
                }
            }

            @Override // X.InterfaceC583720Muw
            public final void onPause() {
                ITopLiveProductView iTopLiveProductView = this.LIZ.LLJL;
                if (iTopLiveProductView != null) {
                    iTopLiveProductView.pauseDisplay();
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(InterfaceC655260Pn2 interfaceC655260Pn2) {
        final Aweme aweme;
        int size;
        IExtendedTopLiveProductView iExtendedTopLiveProductView;
        IExtendedTopLiveProductView iExtendedTopLiveProductView2;
        String strValueOf;
        HashMap<String, String> searchExtraParams;
        IExtendedTopLiveProductView iExtendedTopLiveProductView3;
        InterfaceC655260Pn2 interfaceC655260Pn22 = interfaceC655260Pn2;
        FrameLayout frameLayoutOp = op();
        if (frameLayoutOp != null) {
            C786410Ut5.LJZ(8, frameLayoutOp);
        }
        SingleLive singleLive = interfaceC655260Pn22.LJJIIZ().singleLive;
        if (singleLive == null || (aweme = singleLive.aweme) == null) {
            aweme = new Aweme();
        }
        C0PQ2.LIZ.getClass();
        SearchCardInfo searchCardInfo = null;
        Object[] objArr = 0;
        if (C0PQ2.LIZ(aweme).LIZ == C0PLQ.CARD_BOTTOM) {
            this.LLJLIL = false;
            ITopLiveProductView iTopLiveProductView = this.LLJL;
            if ((iTopLiveProductView instanceof IExtendedTopLiveProductView) && (iExtendedTopLiveProductView3 = (IExtendedTopLiveProductView) iTopLiveProductView) != null) {
                iExtendedTopLiveProductView3.setLiveProductSearchAbility(null);
                return;
            }
            return;
        }
        this.LLJLILLLLZIIL = interfaceC655260Pn22.LJJIIZ();
        List<Product> productsInfo = aweme.getProductsInfo();
        if (productsInfo != null) {
            size = productsInfo.size();
        } else {
            size = 0;
        }
        if (size > 0 && !aweme.isAd() && this.LLJL != null) {
            FrameLayout frameLayoutOp2 = op();
            if (frameLayoutOp2 != null) {
                C786410Ut5.LJZ(0, frameLayoutOp2);
            }
            ITopLiveProductView iTopLiveProductView2 = this.LLJL;
            if (iTopLiveProductView2 instanceof IExtendedTopLiveProductView) {
                IExtendedTopLiveProductView iExtendedTopLiveProductView4 = (IExtendedTopLiveProductView) iTopLiveProductView2;
                if (iExtendedTopLiveProductView4 != null) {
                    iExtendedTopLiveProductView4.setLiveProductSearchAbility(new InterfaceC662740Pz6() { // from class: X.0Pmp
                        @Override // X.InterfaceC662740Pz6
                        public final void LIZLLL(Aweme aweme2, C653660PkS c653660PkS, SearchCardInfo searchCardInfo2) {
                        }

                        @Override // X.InterfaceC662740Pz6
                        public final String LIZ() {
                            return ((C0Q39) ((ISearchContextAbility) C1558520qew.LIZJ(C1558520qew.LJIIL(this.LIZ), ISearchContextAbility.class)).P70().LIZJ()).LLILLJJLI;
                        }

                        @Override // X.InterfaceC662740Pz6
                        public final void LIZJ(Aweme aweme2, C654590Plx c654590Plx) {
                            String str;
                            Map<String, String> mapXE0;
                            SearchProductAnchorAssem searchProductAnchorAssem = this.LIZ;
                            searchProductAnchorAssem.getClass();
                            SearchMixFeedBase searchMixFeedBase = searchProductAnchorAssem.LLJLILLLLZIIL;
                            String str2 = null;
                            if (searchMixFeedBase != null) {
                                str = searchMixFeedBase.feedbackType;
                            } else {
                                str = null;
                            }
                            C683220Qr2 c683220Qr2 = new C683220Qr2(str, null, null, null, null, null, null, null, false, false, false, false, null, null, null, 524286);
                            c683220Qr2.LIZIZ = aweme2.getAuthor().roomCover;
                            c683220Qr2.LIZJ = aweme2.getAuthor().getRoomTitle();
                            C1ER1 c1er1 = C1ER1.LIZIZ;
                            SearchMixFeedBase searchMixFeedBase2 = searchProductAnchorAssem.LLJLILLLLZIIL;
                            if (searchMixFeedBase2 != null) {
                                str2 = searchMixFeedBase2.feedbackType;
                            }
                            c683220Qr2.LIZLLL = c1er1.N(str2);
                            SearchServiceCenter$MobAbility searchServiceCenter$MobAbility = (SearchServiceCenter$MobAbility) C1558520qew.LIZ(C1558520qew.LJIIL(searchProductAnchorAssem), SearchServiceCenter$MobAbility.class, null);
                            if (searchServiceCenter$MobAbility != null && (mapXE0 = searchServiceCenter$MobAbility.XE0()) != null) {
                                Pair[] pairArr = new Pair[9];
                                pairArr[0] = new Pair("enter_from", "general_search");
                                String str3 = mapXE0.get("search_result_id");
                                String str4 = "";
                                if (str3 == null) {
                                    str3 = "";
                                }
                                pairArr[1] = new Pair("search_result_id", str3);
                                pairArr[2] = new Pair("search_keyword", ((C0PRC) ((ISearchContextAbility) C1558520qew.LIZJ(C1558520qew.LJIIL(searchProductAnchorAssem), ISearchContextAbility.class)).Ph1().LIZJ()).LLIZLLLIL);
                                String str5 = mapXE0.get("token_type");
                                if (str5 == null) {
                                    str5 = "";
                                }
                                pairArr[3] = new Pair("token_type", str5);
                                String str6 = mapXE0.get("is_ad");
                                if (str6 == null) {
                                    str6 = "";
                                }
                                pairArr[4] = new Pair("is_ad", str6);
                                String str7 = mapXE0.get("is_ecom");
                                if (str7 == null) {
                                    str7 = "";
                                }
                                pairArr[5] = new Pair("is_ecom", str7);
                                pairArr[6] = new Pair("rank", String.valueOf(((SearchServiceCenter$CardCommonAbility) C1558520qew.LIZJ(C1558520qew.LJIIL(searchProductAnchorAssem), SearchServiceCenter$CardCommonAbility.class)).k4().getBindingAdapterPosition()));
                                String str8 = mapXE0.get("is_aladdin");
                                if (str8 == null) {
                                    str8 = "";
                                }
                                pairArr[7] = new Pair("is_aladdin", str8);
                                String str9 = mapXE0.get("search_result_id");
                                if (str9 != null) {
                                    str4 = str9;
                                }
                                pairArr[8] = new Pair("search_id", str4);
                                c683220Qr2.LJ = C2097608Jq.LJIIJ(pairArr);
                            }
                            c1er1.I0((View) this.LIZ.LLJL, c683220Qr2);
                        }

                        @Override // X.InterfaceC662740Pz6
                        public final void LIZIZ(Aweme aweme2, C654590Plx c654590Plx, EnterRoomConfig enterRoomConfig, String str) {
                            String str2;
                            Map<String, String> mapXE0;
                            String str3;
                            Map<String, String> mapXE02;
                            SearchServiceCenter$NavigateAbility searchServiceCenter$NavigateAbility = (SearchServiceCenter$NavigateAbility) C1558520qew.LIZJ(C1558520qew.LJIIL(this.LIZ), SearchServiceCenter$NavigateAbility.class);
                            C1ER1 c1er1 = C1ER1.LIZIZ;
                            View viewLJJIJL = this.LIZ.LJJIJL();
                            Context context = this.LIZ.getContext();
                            if (context == null) {
                                return;
                            }
                            AwS589S0100000_10 awS589S0100000_10 = new AwS589S0100000_10(c1er1.LLLLJ(aweme2, c654590Plx, enterRoomConfig, str, viewLJJIJL, context), 444);
                            BtmSDK btmSDK = BtmSDK.INSTANCE;
                            PageFinder pageFinderVia = PageFinder.via((View) this.LIZ.op());
                            C212367188v c212367188v = BcmParams.Companion;
                            Pair[] pairArr = new Pair[2];
                            SearchServiceCenter$MobAbility searchServiceCenter$MobAbility = (SearchServiceCenter$MobAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this.LIZ), SearchServiceCenter$MobAbility.class, null);
                            String str4 = "";
                            if (searchServiceCenter$MobAbility == null || (mapXE02 = searchServiceCenter$MobAbility.XE0()) == null || (str2 = mapXE02.get("search_id")) == null) {
                                str2 = "";
                            }
                            pairArr[0] = new Pair("search_id", str2);
                            SearchServiceCenter$MobAbility searchServiceCenter$MobAbility2 = (SearchServiceCenter$MobAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this.LIZ), SearchServiceCenter$MobAbility.class, null);
                            if (searchServiceCenter$MobAbility2 != null && (mapXE0 = searchServiceCenter$MobAbility2.XE0()) != null && (str3 = mapXE0.get("search_result_id")) != null) {
                                str4 = str3;
                            }
                            pairArr[1] = new Pair("search_result_id", str4);
                            Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
                            c212367188v.getClass();
                            String strCreateJumpSourceBtmToken = btmSDK.createJumpSourceBtmToken("c6710.d47166", pageFinderVia, C212367188v.LIZJ(mapLJIIIIZZ));
                            enterRoomConfig.mLogData.sourceBtmToken = strCreateJumpSourceBtmToken;
                            C0Q3E.LIZJ(aweme2).fe(new C655220Pmy(awS589S0100000_10));
                            InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this.LIZ);
                            Aweme aweme3 = aweme;
                            AwemeBizExtKt.setSourceBtmToken(aweme3, strCreateJumpSourceBtmToken);
                            searchServiceCenter$NavigateAbility.GV0(interfaceC665370Q7zLJIIL, aweme3, new InterfaceC645880PVa(aweme) { // from class: X.0PmO
                                public final C650430PfF LL;
                                public final boolean LLILLJJLI = true;

                                @Override // X.InterfaceC1891350zJl
                                public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
                                    return null;
                                }

                                @Override // X.InterfaceC645880PVa
                                public final C650430PfF LLIZLLLIL() {
                                    return this.LL;
                                }

                                @Override // X.InterfaceC645880PVa
                                public final boolean LLJJJIL() {
                                    return this.LLILLJJLI;
                                }

                                {
                                    this.LL = new C650430PfF(new AwS589S0100000_10(aweme, 443));
                                }

                                @Override // X.InterfaceC1891350zJl
                                public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
                                    return Intrinsics.LJFF(interfaceC1891350zJl, this);
                                }

                                @Override // X.InterfaceC1891350zJl
                                public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
                                    return Intrinsics.LJFF(interfaceC1891350zJl, this);
                                }
                            }, false, null, null);
                        }
                    });
                }
                ITopLiveProductView iTopLiveProductView3 = this.LLJL;
                if ((iTopLiveProductView3 instanceof IExtendedTopLiveProductView) && (iExtendedTopLiveProductView2 = (IExtendedTopLiveProductView) iTopLiveProductView3) != null) {
                    C653660PkS c653660PkS = new C653660PkS();
                    String str = ((C646370PWx) ((ISearchContextAbility) C1558520qew.LIZJ(C1558520qew.LJIIL(this), ISearchContextAbility.class)).wO2().LIZJ()).LL;
                    if (str == null) {
                        str = "";
                    }
                    c653660PkS.LJIIJJI = str;
                    c653660PkS.LJIIJ = ((C0PRC) ((ISearchContextAbility) C1558520qew.LIZJ(C1558520qew.LJIIL(this), ISearchContextAbility.class)).Ph1().LIZJ()).LLILLL;
                    c653660PkS.LJIIIIZZ = ((C646370PWx) ((ISearchContextAbility) C1558520qew.LIZJ(C1558520qew.LJIIL(this), ISearchContextAbility.class)).wO2().LIZJ()).LLILLL;
                    if (!C0PPQ.LIZ() || !Intrinsics.LJFF(AwemeBizExtKt.getSearchFeedType(aweme), "searchMixLiveCard") || (searchExtraParams = AwemeBizExtKt.getSearchExtraParams(aweme)) == null || (strValueOf = searchExtraParams.get("search_result_id")) == null) {
                        strValueOf = String.valueOf(C486180J4u.LIZ(aweme.getAuthor()));
                        if (strValueOf != null) {
                        }
                        iExtendedTopLiveProductView2.bindExtraProductData(new C654590Plx(searchCardInfo, c653660PkS, (List) (objArr == true ? 1 : 0), 0L, 29), null, "a2270.b6880.c6710.d47166");
                    }
                    c653660PkS.LJIJI = strValueOf;
                    iExtendedTopLiveProductView2.bindExtraProductData(new C654590Plx(searchCardInfo, c653660PkS, (List) (objArr == true ? 1 : 0), 0L, 29), null, "a2270.b6880.c6710.d47166");
                }
            }
            this.LLJLIL = true;
        } else {
            FrameLayout frameLayoutOp3 = op();
            if (frameLayoutOp3 != null) {
                C786410Ut5.LJZ(8, frameLayoutOp3);
            }
            this.LLJLIL = false;
            ITopLiveProductView iTopLiveProductView4 = this.LLJL;
            if ((iTopLiveProductView4 instanceof IExtendedTopLiveProductView) && (iExtendedTopLiveProductView = (IExtendedTopLiveProductView) iTopLiveProductView4) != null) {
                iExtendedTopLiveProductView.setLiveProductSearchAbility(null);
            }
        }
        if (this.LLJLIL && !this.LLJLL) {
            this.LLJLL = true;
        }
        ITopLiveProductView iTopLiveProductView5 = this.LLJL;
        if (iTopLiveProductView5 == null) {
            return;
        }
        iTopLiveProductView5.bindProductData(new C655440PnK(aweme), EnumC657940PrM.LIVE_CHILD_CARD);
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(InterfaceC655260Pn2 interfaceC655260Pn2) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(InterfaceC655260Pn2 interfaceC655260Pn2) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
