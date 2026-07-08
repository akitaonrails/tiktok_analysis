package com.ss.android.ugc.aweme.search.pages.result.topsearch.commerce.searchbrand;

import X.C01GW;
import X.C07E5;
import X.C0P9G;
import X.C0PN8;
import X.C0Q9J;
import X.C0R12;
import X.C0R45;
import X.C1558520qew;
import X.C1AF0;
import X.C1ER1;
import X.C452501pT;
import X.C641490PEd;
import X.C657990PrR;
import X.C682910QqX;
import X.C682930QqZ;
import X.C683220Qr2;
import X.C684120QsU;
import X.C723830SaL;
import X.C946803n0;
import X.EnumC682590Qq1;
import X.InterfaceC1587906Jp;
import X.InterfaceC494301wD;
import X.InterfaceC682870QqT;
import X.InterfaceC683010Qqh;
import X.InterfaceC712990Rxx;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.ies.ugc.aweme.commercialize.search.brandzone.data.BrandZoneCard;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.ability.CustomBgGradientAbility;
import com.ss.android.ugc.aweme.discover.model.SearchActivityCardBgData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.ad.AdBrandZone;
import com.ss.android.ugc.aweme.feed.model.commercialize.MultiCTAInfo;
import com.ss.android.ugc.aweme.feed.model.commercialize.ProductCard;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.entrycard.ISearchEntryCardAbility;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.entrycard.viewmodel.SearchEntranceVM;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$CardCommonAbility;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.commerce.hybrid.logger.BshCardVisibilityManager;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.commerce.searchbrand.api.IAdBrandZoneLoggerAbility;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.ui.jedi.SearchJediMixFeedFragment;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS589S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchAdBrandZoneContentAssem extends ReusedUISlotAssem<SearchAdBrandZoneContentAssem> implements InterfaceC712990Rxx<C641490PEd>, CustomBgGradientAbility, IAdBrandZoneLoggerAbility, InterfaceC683010Qqh {
    public View LLJJLIIIJLLLLLLLZ;
    public ViewGroup LLJL;
    public ViewGroup LLJLIL;
    public TuxTextView LLJLILLLLZIIL;
    public TuxIconView LLJLL;
    public ViewGroup LLJLLIL;
    public ViewGroup LLJLLL;
    public ViewGroup LLJZ;
    public TuxTextView LLJZIJLIL;
    public ViewGroup LLL;
    public BrandZoneCard LLLF;
    public SearchMixFeed LLLFF;
    public Aweme LLLFFI;
    public SearchEntranceVM LLLFZ;
    public InterfaceC682870QqT LLLI;
    public SearchBrandZoneAutoPlayCardHelper LLLIILIL;
    public long LLLIL;
    public BshCardVisibilityManager LLLILZ;
    public long LLLILZJ;
    public boolean LLLILZLLLI;
    public boolean LLLIZZ;
    public final C01GW LLLII = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(305));
    public final C01GW LLLIIII = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(306));
    public final C01GW LLLIIIIL = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(304));
    public final C01GW LLLIIIL = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(307));
    public final C01GW LLLIIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 701));
    public final C01GW LLLJ = C452501pT.LIZIZ(new AwS554S0100000_10(this, OppoPermissionPopupMaskDelayExp.DEFAULT));

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.et7;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
        this.LLLILZ = null;
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.ss.android.ugc.aweme.commercialize.ability.CustomBgGradientAbility
    public final int Td0() {
        View view = this.LLJJLIIIJLLLLLLLZ;
        if (view == null) {
            return 0;
        }
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return rect.bottom;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        this.LLLII.getValue().getClass();
        C682910QqX c682910QqX = (C682910QqX) this.LLLIIII.getValue();
        c682910QqX.LIZJ = null;
        c682910QqX.LIZLLL = null;
        C682930QqZ c682930QqZ = (C682930QqZ) this.LLLIIIIL.getValue();
        c682930QqZ.LIZLLL = null;
        c682930QqZ.LJ = null;
        SearchBrandZoneAutoPlayCardHelper searchBrandZoneAutoPlayCardHelper = this.LLLIILIL;
        if (searchBrandZoneAutoPlayCardHelper != null) {
            searchBrandZoneAutoPlayCardHelper.LLJILJILJ = null;
        }
        this.LLLIILIL = null;
    }

    @Override // X.InterfaceC683010Qqh
    public final void h7() {
        InterfaceC682870QqT interfaceC682870QqT = this.LLLI;
        if (interfaceC682870QqT != null) {
            interfaceC682870QqT.LJIIJ();
        }
    }

    public final int op() {
        AwemeRawAd rawAdData;
        AdBrandZone brandZone;
        MultiCTAInfo multiCTAInfo;
        BrandZoneCard brandZoneCard = this.LLLF;
        List<ProductCard> list = (brandZoneCard == null || (rawAdData = brandZoneCard.getRawAdData()) == null || (brandZone = rawAdData.getBrandZone()) == null || (multiCTAInfo = brandZone.getMultiCTAInfo()) == null) ? null : multiCTAInfo.productCards;
        return (list == null || list.isEmpty()) ? 1 : 2;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final Context So(Context context) {
        if (C07E5.LIZ()) {
            return LJJIJL().getContext();
        }
        return context;
    }

    @Override // X.InterfaceC683010Qqh
    public final void e0(String str) {
        Aweme aweme = this.LLLFFI;
        if (aweme == null) {
            return;
        }
        C0R12.LIZIZ.LJ(getContext(), aweme, "product_view_all", "result_ad", 2, "general_search_brandhub", str);
        InterfaceC682870QqT interfaceC682870QqT = this.LLLI;
        if (interfaceC682870QqT != null) {
            interfaceC682870QqT.LJIILIIL();
        }
    }

    @Override // X.InterfaceC683010Qqh
    public final void l(int i) {
        InterfaceC682870QqT interfaceC682870QqT = this.LLLI;
        if (interfaceC682870QqT != null) {
            interfaceC682870QqT.l(i);
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        TuxTextView tuxTextView;
        TuxIconView tuxIconView;
        this.LLJJLIIIJLLLLLLLZ = getContentView().findViewById(R.id.ynd);
        this.LLJL = (ViewGroup) getContentView().findViewById(R.id.yn_);
        ViewGroup viewGroup = (ViewGroup) getContentView().findViewById(R.id.ynb);
        this.LLJLIL = viewGroup;
        if (viewGroup != null) {
            tuxTextView = (TuxTextView) viewGroup.findViewById(R.id.ync);
        } else {
            tuxTextView = null;
        }
        this.LLJLILLLLZIIL = tuxTextView;
        ViewGroup viewGroup2 = this.LLJLIL;
        if (viewGroup2 != null) {
            tuxIconView = (TuxIconView) viewGroup2.findViewById(R.id.yna);
        } else {
            tuxIconView = null;
        }
        this.LLJLL = tuxIconView;
        this.LLJLLIL = (ViewGroup) getContentView().findViewById(R.id.yng);
        this.LLJZ = (ViewGroup) getContentView().findViewById(R.id.yne);
        this.LLL = (ViewGroup) getContentView().findViewById(R.id.ynl);
        this.LLJZIJLIL = (TuxTextView) getContentView().findViewById(R.id.yn1);
        this.LLJLLL = (ViewGroup) getContentView().findViewById(R.id.yn5);
        ((SearchServiceCenter$CardCommonAbility) C1558520qew.LIZJ(C1558520qew.LJIIL(this), SearchServiceCenter$CardCommonAbility.class)).A12(new C0R45(this, 21));
        C723830SaL.LIZ(this, null, new AwS589S0100000_10(this, 282));
    }

    @Override // com.ss.android.ugc.aweme.commercialize.ability.CustomBgGradientAbility
    public final void pL0(InterfaceC494301wD interfaceC494301wD) {
        if (interfaceC494301wD instanceof ISearchEntryCardAbility) {
            this.LLLFZ = ((ISearchEntryCardAbility) interfaceC494301wD).vm();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0261 A[PHI: r5
      0x0261: PHI (r5v23 com.ss.android.ugc.aweme.feed.model.AwemeRawAd) = (r5v0 com.ss.android.ugc.aweme.feed.model.AwemeRawAd), (r5v31 com.ss.android.ugc.aweme.feed.model.AwemeRawAd) binds: [B:143:0x025d, B:95:0x0186] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x04be  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x04dd  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x050c  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x056e  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x07d2  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x07d5  */
    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void up(X.C641490PEd r35) {
        /*
            Method dump skipped, instruction units count: 2233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.result.topsearch.commerce.searchbrand.SearchAdBrandZoneContentAssem.up(java.lang.Object):void");
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C641490PEd c641490PEd) {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.ability.CustomBgGradientAbility
    public final int xI1(SearchActivityCardBgData searchActivityCardBgData) {
        View view = this.LLJJLIIIJLLLLLLLZ;
        if (view != null) {
            return view.getMeasuredHeight();
        }
        return 0;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C641490PEd c641490PEd) {
    }

    @Override // X.InterfaceC683010Qqh
    public final void n3(int i, ProductCard productCard) {
        String str;
        Aweme aweme = this.LLLFFI;
        if (aweme != null && (str = productCard.jumpModel) != null && str.length() != 0) {
            C0R12.LIZIZ.LJ(getContext(), aweme, "product_card", "result_ad", 2, "general_search_brandhub", str);
            InterfaceC682870QqT interfaceC682870QqT = this.LLLI;
            if (interfaceC682870QqT != null) {
                interfaceC682870QqT.LJIJI(i);
            }
        }
    }

    public final void sp(String str, boolean z) {
        AwemeRawAd rawAdData;
        int feedType;
        int rank;
        String enterMethod;
        String str2;
        String strPS;
        SearchJediMixFeedFragment searchJediMixFeedFragment;
        String prefetchId;
        String str3;
        BrandZoneCard brandZoneCard = this.LLLF;
        String requestId = null;
        if (brandZoneCard != null) {
            rawAdData = brandZoneCard.getRawAdData();
        } else {
            rawAdData = null;
        }
        SearchMixFeed searchMixFeed = this.LLLFF;
        if (searchMixFeed != null) {
            requestId = searchMixFeed.getRequestId();
        }
        SearchMixFeed searchMixFeed2 = this.LLLFF;
        if (searchMixFeed2 != null) {
            feedType = searchMixFeed2.getFeedType();
        } else {
            feedType = -1;
        }
        SearchMixFeed searchMixFeed3 = this.LLLFF;
        if (searchMixFeed3 != null) {
            rank = searchMixFeed3.getRank();
        } else {
            rank = -1;
        }
        String str4 = "";
        if (C657990PrR.LIZ(LJJIJL()) == null) {
            enterMethod = "";
            str2 = "";
        } else {
            Fragment fragmentLIZ = C946803n0.LIZ(LJJIJL());
            if (!(fragmentLIZ instanceof SearchJediMixFeedFragment) || (searchJediMixFeedFragment = (SearchJediMixFeedFragment) fragmentLIZ) == null) {
                strPS = "";
                enterMethod = "";
            } else {
                strPS = searchJediMixFeedFragment.PS();
                SearchResultParam searchResultParam = searchJediMixFeedFragment.LLJIJIL;
                if (searchResultParam == null || (enterMethod = searchResultParam.getEnterMethod()) == null) {
                    enterMethod = "";
                }
                SearchResultParam searchResultParam2 = searchJediMixFeedFragment.LLJIJIL;
                if (searchResultParam2 == null || (prefetchId = searchResultParam2.getPrefetchId()) == null) {
                    prefetchId = "";
                }
                SearchResultParam searchResultParam3 = searchJediMixFeedFragment.LLJIJIL;
                if (searchResultParam3 != null) {
                    searchResultParam3.getKeyword();
                }
                if (requestId == null || requestId.length() == 0) {
                    C0PN8 c0pn8HU = searchJediMixFeedFragment.HU(false);
                    if (c0pn8HU != null && (str3 = c0pn8HU.LLJILJILJ) != null) {
                        str4 = str3;
                    }
                    requestId = str4;
                }
                str4 = prefetchId;
            }
            str2 = str4;
            str4 = strPS;
        }
        if (z) {
            C0P9G.LJI(C0P9G.LIZ, rawAdData, str4, enterMethod, str2, requestId, requestId, feedType, rank);
        } else {
            C0P9G.LJFF(C0P9G.LIZ, rawAdData, str4, enterMethod, str2, requestId, requestId, feedType, rank, str);
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }

    @Override // X.InterfaceC683010Qqh
    public final void Yk(View view, UrlModel urlModel, String str) {
        try {
            EnumC682590Qq1 enumC682590Qq1 = EnumC682590Qq1.ADS;
            C683220Qr2 c683220Qr2 = new C683220Qr2(enumC682590Qq1.getValue(), null, null, null, null, null, null, null, false, false, false, false, null, null, null, 524286);
            c683220Qr2.LIZIZ = urlModel;
            c683220Qr2.LIZJ = str;
            try {
                c683220Qr2.LJIILIIL = this.LLLFFI;
                c683220Qr2.LIZLLL = C1ER1.LIZIZ.N(enumC682590Qq1.getValue());
                c683220Qr2.LJIILL = true;
                HashMap map = new HashMap();
                map.put("is_ad", "1");
                c683220Qr2.LJ = map;
                boolean z = C0Q9J.LIZ;
                C684120QsU.LIZIZ(view, c683220Qr2, false, null, null, 28);
            } catch (Throwable th) {
                th = th;
                TryCatchGuardChecker.doCheck(th);
                C1AF0.LIZJ("product card feed back crash");
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.topsearch.commerce.searchbrand.api.IAdBrandZoneLoggerAbility
    public final void ws1(Aweme aweme, String str, boolean z) {
        InterfaceC682870QqT interfaceC682870QqT;
        if (aweme != null && (interfaceC682870QqT = this.LLLI) != null) {
            interfaceC682870QqT.LIZLLL(aweme, str, z);
        }
    }
}
