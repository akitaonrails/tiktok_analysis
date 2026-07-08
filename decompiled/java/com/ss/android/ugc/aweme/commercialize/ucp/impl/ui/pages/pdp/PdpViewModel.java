package com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.pdp;

import X.AbstractC332980D3o;
import X.AnonymousClass0950;
import X.AnonymousClass0951;
import X.AnonymousClass0956;
import X.C09IC;
import X.C09IR;
import X.C0D21;
import X.C0D23;
import X.C0D27;
import X.C0D2Y;
import X.C0D3K;
import X.C0D3N;
import X.C0D3P;
import X.C0D3V;
import X.C0D3Z;
import X.C0DHO;
import X.C15438062q;
import X.C1BNE;
import X.C2097608Jq;
import X.C2252321DDq;
import X.C2252331DDr;
import X.C331730CzT;
import X.C332130D0h;
import X.C332470D1p;
import X.C332690D2l;
import X.C332710D2n;
import X.C332840D3a;
import X.C332860D3c;
import X.C332870D3d;
import X.C332910D3h;
import X.C333000D3q;
import X.C333020D3s;
import X.InterfaceC332260D0u;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.commercialize.ucp.api.model.PdpSupplementData;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.ReviewsDto;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.recommend.model.UcpRecommendationItem;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS548S0100000_4;
import kotlin.jvm.internal.AwS583S0100000_4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class PdpViewModel extends ViewModel {
    public final C2252321DDq LL;
    public final AnonymousClass0951 LLILLJJLI;
    public final AnonymousClass0950 LLILLL;
    public final C2252331DDr LLILZ;
    public final AnonymousClass0950 LLILZIL;
    public C332690D2l LLILZLL;
    public PdpSupplementData LLIZ;
    public String LLIZLLLIL;
    public Map<String, String> LLJ;
    public C332710D2n LLJI;
    public final C0D2Y LLJIJIL;
    public final C0D3P LLJILJIL;
    public final C332130D0h LLJILJILJ;

    public final void wQ2() {
        Object value;
        Object c0d21;
        C2252321DDq c2252321DDq = this.LL;
        do {
            value = c2252321DDq.getValue();
            AbstractC332980D3o abstractC332980D3o = (AbstractC332980D3o) value;
            boolean z = abstractC332980D3o instanceof C0D21;
            c0d21 = abstractC332980D3o;
            if (z) {
                C0D21 c0d212 = (C0D21) abstractC332980D3o;
                C332470D1p c332470D1p = c0d212.getPageData().reviewInfo;
                c0d21 = c0d212;
                if (c332470D1p != null) {
                    C332870D3d c332870D3d = c332470D1p.aiOverview;
                    c0d21 = c0d212;
                    if (c332870D3d != null) {
                        C332470D1p c332470D1pCopy = c332470D1p.copy(c332470D1p.ratingHeader, c332870D3d.copy(c332870D3d.summary, c332870D3d.sentiment, c332870D3d.tags, c332870D3d.sourceCountText, c332870D3d.avatarUrls, !c332870D3d.isExpanded()), c332470D1p.reviewList, c332470D1p.apiState);
                        C0D3K pageData = c0d212.getPageData();
                        c0d21 = new C0D21(pageData.copy(pageData.productId, pageData.entrySpuImageUrls, pageData.shopHeader, pageData.productMedia, pageData.priceInfo, pageData.titleRating, pageData.skuSelection, pageData.descriptionInfo, pageData.logisticsInfo, pageData.dealsInfo, c332470D1pCopy, pageData.moreFromShop, pageData.bottomBar));
                    }
                }
            }
        } while (!c2252321DDq.compareAndSet(value, c0d21));
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        C0D27<C0D3K> c0d27 = this.LLJILJILJ.LJFF;
        if (c0d27 != null) {
            c0d27.LIZ();
        }
        C0D2Y c0d2y = this.LLJIJIL;
        AnonymousClass0956 anonymousClass0956 = c0d2y.LJIIIIZZ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        c0d2y.LJIIIIZZ = null;
        c0d2y.LJIIIZ.LIZ();
        C0D27<List<UcpRecommendationItem>> c0d272 = c0d2y.LJI;
        if (c0d272 != null) {
            c0d272.LIZ();
        }
        C0D27<ReviewsDto> c0d273 = c0d2y.LJII;
        if (c0d273 != null) {
            c0d273.LIZ();
        }
        AnonymousClass0956 anonymousClass09562 = this.LLJILJIL.LJIIJJI;
        if (anonymousClass09562 != null) {
            anonymousClass09562.LIZIZ(null);
        }
    }

    public PdpViewModel(C331730CzT c331730CzT) {
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(new C0D23(null));
        this.LL = c2252321DDqLIZ;
        this.LLILLJJLI = C09IC.LIZIZ(c2252321DDqLIZ);
        C2252331DDr c2252331DDrLIZIZ = C09IR.LIZIZ(0, 1, null, 5);
        this.LLILLL = C09IC.LIZ(c2252331DDrLIZIZ);
        C2252331DDr c2252331DDrLIZIZ2 = C09IR.LIZIZ(0, 1, null, 5);
        this.LLILZ = c2252331DDrLIZIZ2;
        this.LLILZIL = C09IC.LIZ(c2252331DDrLIZIZ2);
        this.LLJ = new LinkedHashMap();
        this.LLJI = new C332710D2n(C0DHO.STANDARD, null, null, null);
        this.LLJIJIL = new C0D2Y(c331730CzT, ViewModelKt.getViewModelScope(this), c2252321DDqLIZ, new AwS548S0100000_4(this, 99), new AwS548S0100000_4(this, 100), new AwS548S0100000_4(this, 101));
        this.LLJILJIL = new C0D3P(c331730CzT, ViewModelKt.getViewModelScope(this), c2252321DDqLIZ, c2252331DDrLIZIZ, new AwS548S0100000_4(this, 102), new AwS548S0100000_4(this, 103), new AwS583S0100000_4(this, 55), null, 384);
        this.LLJILJILJ = new C332130D0h(c331730CzT, ViewModelKt.getViewModelScope(this), new AwS583S0100000_4(this, 56), new AwS583S0100000_4(this, 57), new AwS583S0100000_4(this, 58));
    }

    public final void vQ2(int i) {
        C0D21 c0d21;
        AbstractC332980D3o value;
        AbstractC332980D3o c0d212;
        C332840D3a c332840D3aCopy;
        AbstractC332980D3o value2;
        AbstractC332980D3o c0d213;
        Map<String, String> mapLJ;
        C332840D3a c332840D3aCopy2;
        C0D3P c0d3p = this.LLJILJIL;
        AbstractC332980D3o value3 = c0d3p.LIZJ.getValue();
        if ((value3 instanceof C0D21) && (c0d21 = (C0D21) value3) != null) {
            C0D3V c0d3v = c0d21.getPageData().skuSelection;
            C332910D3h c332910D3hLIZIZ = C0D3Z.LIZIZ(c0d3v);
            if (c332910D3hLIZIZ.LJFF && !c332910D3hLIZIZ.LIZJ) {
                if (!c332910D3hLIZIZ.LIZ() || (c0d3v != null && c0d3v.isVariantLoading())) {
                    c0d3p.LJIILIIL = Integer.valueOf(i);
                    InterfaceC332260D0u<AbstractC332980D3o> interfaceC332260D0u = c0d3p.LIZJ;
                    do {
                        value2 = interfaceC332260D0u.getValue();
                        c0d213 = value2;
                        if (c0d213 instanceof C0D21) {
                            C0D21 c0d214 = (C0D21) c0d213;
                            C0D3K pageData = c0d214.getPageData();
                            C332840D3a c332840D3a = c0d214.getPageData().bottomBar;
                            if (c332840D3a != null) {
                                c332840D3aCopy2 = c332840D3a.copy(c332840D3a.visible, c332840D3a.showVisitWebsiteButton, c332840D3a.buyNowButtonLabel, c332840D3a.buyNowButtonTextType, c332840D3a.buyNowButtonBgColor, c332840D3a.buyNowButtonTextColor, c332840D3a.disclaimerText, c332840D3a.showDisclaimerInfoIcon, C333000D3q.INSTANCE);
                            } else {
                                c332840D3aCopy2 = null;
                            }
                            c0d213 = new C0D21(pageData.copy(pageData.productId, pageData.entrySpuImageUrls, pageData.shopHeader, pageData.productMedia, pageData.priceInfo, pageData.titleRating, pageData.skuSelection, pageData.descriptionInfo, pageData.logisticsInfo, pageData.dealsInfo, pageData.reviewInfo, pageData.moreFromShop, c332840D3aCopy2));
                        }
                    } while (!interfaceC332260D0u.compareAndSet(value2, c0d213));
                    if (c0d3v != null && c0d3v.isVariantLoading()) {
                        return;
                    }
                    String str = c0d3p.LJIILLIIL;
                    String str2 = c0d21.getPageData().productId;
                    if (c0d3v == null || (mapLJ = c0d3v.selectedSkuOptions) == null) {
                        mapLJ = C2097608Jq.LJ();
                    }
                    c0d3p.LJII(str, str2, c0d3p.LIZLLL(mapLJ));
                    return;
                }
                c0d3p.LIZLLL.LIZJ(Integer.valueOf(i));
                return;
            }
            InterfaceC332260D0u<AbstractC332980D3o> interfaceC332260D0u2 = c0d3p.LIZJ;
            do {
                value = interfaceC332260D0u2.getValue();
                c0d212 = value;
                if (c0d212 instanceof C0D21) {
                    C0D21 c0d215 = (C0D21) c0d212;
                    C0D3K pageData2 = c0d215.getPageData();
                    C332840D3a c332840D3a2 = c0d215.getPageData().bottomBar;
                    if (c332840D3a2 != null) {
                        c332840D3aCopy = c332840D3a2.copy(c332840D3a2.visible, c332840D3a2.showVisitWebsiteButton, c332840D3a2.buyNowButtonLabel, c332840D3a2.buyNowButtonTextType, c332840D3a2.buyNowButtonBgColor, c332840D3a2.buyNowButtonTextColor, c332840D3a2.disclaimerText, c332840D3a2.showDisclaimerInfoIcon, C333020D3s.INSTANCE);
                    } else {
                        c332840D3aCopy = null;
                    }
                    c0d212 = new C0D21(pageData2.copy(pageData2.productId, pageData2.entrySpuImageUrls, pageData2.shopHeader, pageData2.productMedia, pageData2.priceInfo, pageData2.titleRating, pageData2.skuSelection, pageData2.descriptionInfo, pageData2.logisticsInfo, pageData2.dealsInfo, pageData2.reviewInfo, pageData2.moreFromShop, c332840D3aCopy));
                }
            } while (!interfaceC332260D0u2.compareAndSet(value, c0d212));
        }
    }

    public final void xQ2(String str) {
        Object value;
        Object c0d21;
        C2252321DDq c2252321DDq = this.LL;
        do {
            value = c2252321DDq.getValue();
            AbstractC332980D3o abstractC332980D3o = (AbstractC332980D3o) value;
            boolean z = abstractC332980D3o instanceof C0D21;
            c0d21 = abstractC332980D3o;
            if (z) {
                C0D21 c0d212 = (C0D21) abstractC332980D3o;
                C0D3N c0d3n = c0d212.getPageData().dealsInfo;
                c0d21 = c0d212;
                if (c0d3n != null) {
                    List<C332860D3c> list = c0d3n.deals;
                    ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                    for (C332860D3c c332860D3cCopy : list) {
                        if (Intrinsics.LJFF(c332860D3cCopy.id, str)) {
                            c332860D3cCopy = c332860D3cCopy.copy(c332860D3cCopy.id, c332860D3cCopy.code, c332860D3cCopy.title, c332860D3cCopy.description, c332860D3cCopy.type, c332860D3cCopy.isClaimed, !c332860D3cCopy.isExpanded());
                        }
                        arrayList.add(c332860D3cCopy);
                    }
                    C0D3K pageData = c0d212.getPageData();
                    c0d21 = new C0D21(pageData.copy(pageData.productId, pageData.entrySpuImageUrls, pageData.shopHeader, pageData.productMedia, pageData.priceInfo, pageData.titleRating, pageData.skuSelection, pageData.descriptionInfo, pageData.logisticsInfo, c0d3n.copy(arrayList), pageData.reviewInfo, pageData.moreFromShop, pageData.bottomBar));
                }
            }
        } while (!c2252321DDq.compareAndSet(value, c0d21));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01e2 A[EDGE_INSN: B:105:0x01e2->B:72:0x01e2 BREAK  A[LOOP:6: B:68:0x01d0->B:106:?]] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x021a  */
    /* JADX WARN: Type inference failed for: r14v0, types: [X.0D3V] */
    /* JADX WARN: Type inference failed for: r17v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.HashMap, java.util.LinkedHashMap, java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.util.Map] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void yQ2(boolean r35) {
        /*
            Method dump skipped, instruction units count: 556
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.pdp.PdpViewModel.yQ2(boolean):void");
    }
}
