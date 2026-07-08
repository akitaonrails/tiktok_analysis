package com.ss.android.ugc.aweme.search.pages.result.topsearch.commerce.searchbrand;

import X.AbstractC1585810rMx;
import X.AbstractC21673619ry;
import X.C098200Yq;
import X.C1007860cKm;
import X.C11VU;
import X.C1558520qew;
import X.C189200o6;
import X.C2188811AlT;
import X.C640750PBh;
import X.C650630PfZ;
import X.C655610Pnb;
import X.InterfaceC657510Pqf;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.scope.SearchPlayerScope;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.utils.NestedAutoPlayCardAbility;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbilityDefaultImpl;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.commerce.searchbrand.autoplay.SearchAdBrandZoneNestedAutoplayCardHelper;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS226S0000000_35;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes36.dex */
public final class SearchBrandZoneAutoPlayCardHelper extends AbstractC1585810rMx implements NestedAutoPlayCardAbility {
    public static final int[] LLJILLL = new int[2];
    public final Context LL;
    public final LifecycleOwner LLILLJJLI;
    public final View LLILLL;
    public final View LLILZ;
    public final View LLILZIL;
    public final SearchAdBrandZoneNestedAutoplayCardHelper LLILZLL;
    public final SearchAdBrandZoneNestedAutoplayCardHelper LLIZ;
    public int LLIZLLLIL;
    public int LLJ;
    public boolean LLJI;
    public final int LLJIJIL = DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL;
    public long LLJILJIL;
    public SearchAdBrandZoneNestedAutoplayCardHelper LLJILJILJ;

    public final SearchAdBrandZoneNestedAutoplayCardHelper LJJIJIIJIL() {
        View view = this.LLILZ;
        if (view == null || view.getVisibility() != 0) {
            return this.LLIZ;
        }
        View view2 = this.LLILZIL;
        if (view2 == null || view2.getVisibility() != 0) {
            return this.LLILZLL;
        }
        int iLIZLLL = C11VU.LIZLLL(this.LL) / 2;
        View view3 = this.LLILZIL;
        int[] iArr = LLJILLL;
        view3.getLocationOnScreen(iArr);
        return iArr[1] <= iLIZLLL ? this.LLIZ : this.LLILZLL;
    }

    public final void LJJIL() {
        SearchAdBrandZoneNestedAutoplayCardHelper.AnonymousClass1 anonymousClass1;
        SearchAdBrandZoneNestedAutoplayCardHelper.AnonymousClass1 anonymousClass12;
        C1007860cKm c1007860cKmLJIILIIL;
        C1007860cKm c1007860cKmLJIILIIL2;
        C655610Pnb c655610Pnb = C655610Pnb.LIZIZ;
        InterfaceC657510Pqf interfaceC657510PqfLIZLLL = c655610Pnb.LIZLLL();
        Aweme aweme = (interfaceC657510PqfLIZLLL == null || (c1007860cKmLJIILIIL2 = interfaceC657510PqfLIZLLL.LJIILIIL()) == null) ? null : c1007860cKmLJIILIIL2.LJFF;
        if (aweme != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("tryHandleExitDetailAweme detailExitAweme=");
            sbLIZ.append(aweme);
            sbLIZ.append(", aid=");
            sbLIZ.append(aweme.getAid());
            C2188811AlT.LIZIZ(sbLIZ);
            InterfaceC657510Pqf interfaceC657510PqfLIZLLL2 = c655610Pnb.LIZLLL();
            if (interfaceC657510PqfLIZLLL2 != null && (c1007860cKmLJIILIIL = interfaceC657510PqfLIZLLL2.LJIILIIL()) != null) {
                c1007860cKmLJIILIIL.LJFF = null;
            }
            if (LJJJ(aweme, this.LLILZLL) >= 0 || LJJJ(aweme, this.LLIZ) >= 0) {
                this.LLJI = true;
                this.LLJILJIL = System.currentTimeMillis();
                return;
            }
        }
        if (this.LLJI) {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.LLJILJIL;
            if (jCurrentTimeMillis <= this.LLJIJIL) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("tryHandleExitDetailAweme interval not pass， interval=");
                sbLIZ2.append(jCurrentTimeMillis);
                C2188811AlT.LIZIZ(sbLIZ2);
                return;
            }
            this.LLJI = false;
        }
        SearchAdBrandZoneNestedAutoplayCardHelper searchAdBrandZoneNestedAutoplayCardHelperLJJIJIIJIL = LJJIJIIJIL();
        if (!Intrinsics.LJFF(this.LLJILJILJ, searchAdBrandZoneNestedAutoplayCardHelperLJJIJIIJIL)) {
            SearchAdBrandZoneNestedAutoplayCardHelper searchAdBrandZoneNestedAutoplayCardHelper = this.LLJILJILJ;
            if (searchAdBrandZoneNestedAutoplayCardHelper != null && (anonymousClass12 = searchAdBrandZoneNestedAutoplayCardHelper.LLIZLLLIL) != null) {
                anonymousClass12.LLZZZZ();
            }
            this.LLJILJILJ = searchAdBrandZoneNestedAutoplayCardHelperLJJIJIIJIL;
        }
        SearchAdBrandZoneNestedAutoplayCardHelper searchAdBrandZoneNestedAutoplayCardHelper2 = this.LLJILJILJ;
        if (searchAdBrandZoneNestedAutoplayCardHelper2 == null || (anonymousClass1 = searchAdBrandZoneNestedAutoplayCardHelper2.LLIZLLLIL) == null) {
            return;
        }
        anonymousClass1.J0();
    }

    public final void LJJIZ(View view) {
        view.requestRectangleOnScreen(new Rect(0, 0, view.getWidth(), (C11VU.LIZLLL(view.getContext()) + view.getHeight()) / 2));
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.utils.NestedAutoPlayCardAbility
    public final void Sn2(SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbility) {
        SearchAdBrandZoneNestedAutoplayCardHelper searchAdBrandZoneNestedAutoplayCardHelper = this.LLILZLL;
        if (searchAdBrandZoneNestedAutoplayCardHelper != null) {
            searchAdBrandZoneNestedAutoplayCardHelper.Sn2(searchServiceCenter$AutoPlayAbility);
        }
        SearchAdBrandZoneNestedAutoplayCardHelper searchAdBrandZoneNestedAutoplayCardHelper2 = this.LLIZ;
        if (searchAdBrandZoneNestedAutoplayCardHelper2 != null) {
            searchAdBrandZoneNestedAutoplayCardHelper2.Sn2(searchServiceCenter$AutoPlayAbility);
        }
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.utils.NestedAutoPlayCardAbility
    public final void ms0(SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbility) {
        SearchAdBrandZoneNestedAutoplayCardHelper searchAdBrandZoneNestedAutoplayCardHelper = this.LLILZLL;
        if (searchAdBrandZoneNestedAutoplayCardHelper != null) {
            searchAdBrandZoneNestedAutoplayCardHelper.ms0(searchServiceCenter$AutoPlayAbility);
        }
        SearchAdBrandZoneNestedAutoplayCardHelper searchAdBrandZoneNestedAutoplayCardHelper2 = this.LLIZ;
        if (searchAdBrandZoneNestedAutoplayCardHelper2 != null) {
            searchAdBrandZoneNestedAutoplayCardHelper2.ms0(searchServiceCenter$AutoPlayAbility);
        }
    }

    public final int LJJJ(Aweme aweme, SearchAdBrandZoneNestedAutoplayCardHelper searchAdBrandZoneNestedAutoplayCardHelper) {
        int iIndexOf;
        if (searchAdBrandZoneNestedAutoplayCardHelper != null) {
            AbstractC21673619ry adapter = searchAdBrandZoneNestedAutoplayCardHelper.LL.getAdapter();
            if (adapter != null && adapter.getItemCount() > 0 && !searchAdBrandZoneNestedAutoplayCardHelper.LLILZ.isEmpty()) {
                iIndexOf = searchAdBrandZoneNestedAutoplayCardHelper.LLILZ.indexOf(aweme);
            } else {
                iIndexOf = -1;
                if (searchAdBrandZoneNestedAutoplayCardHelper != null) {
                }
            }
            SearchAdBrandZoneNestedAutoplayCardHelper.AnonymousClass1 anonymousClass1 = searchAdBrandZoneNestedAutoplayCardHelper.LLIZLLLIL;
            if (anonymousClass1 == null || iIndexOf < 0) {
                return -1;
            }
            LJJIZ(SearchAdBrandZoneNestedAutoplayCardHelper.this.LLILLJJLI);
            anonymousClass1.Ot0(new C640750PBh(iIndexOf, null, false, 0, 8), AFwS226S0000000_35.get$arr$(246));
            anonymousClass1.J0();
            return iIndexOf;
        }
        return -1;
    }

    @Override // X.AbstractC1585810rMx
    public final void LJJIIZI(RecyclerView recyclerView, int i, int i2) {
        SearchAdBrandZoneNestedAutoplayCardHelper.AnonymousClass1 anonymousClass1;
        SearchAdBrandZoneNestedAutoplayCardHelper searchAdBrandZoneNestedAutoplayCardHelper = this.LLJILJILJ;
        if (searchAdBrandZoneNestedAutoplayCardHelper != null && (anonymousClass1 = searchAdBrandZoneNestedAutoplayCardHelper.LLIZLLLIL) != null && anonymousClass1.isPlaying()) {
            int i3 = this.LLIZLLLIL + i2;
            this.LLIZLLLIL = i3;
            int iAbs = Math.abs(i3 - this.LLJ);
            if (iAbs <= 30) {
                return;
            }
            this.LLJ = this.LLIZLLLIL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onScrolled called diff = ");
            sbLIZ.append(iAbs);
            C2188811AlT.LIZIZ(sbLIZ);
            LJJIL();
        }
    }

    public SearchBrandZoneAutoPlayCardHelper(Context context, LifecycleOwner lifecycleOwner, View view, View view2, View view3, SearchAdBrandZoneNestedAutoplayCardHelper searchAdBrandZoneNestedAutoplayCardHelper, SearchAdBrandZoneNestedAutoplayCardHelper searchAdBrandZoneNestedAutoplayCardHelper2) {
        this.LL = context;
        this.LLILLJJLI = lifecycleOwner;
        this.LLILLL = view;
        this.LLILZ = view2;
        this.LLILZIL = view3;
        this.LLILZLL = searchAdBrandZoneNestedAutoplayCardHelper;
        this.LLIZ = searchAdBrandZoneNestedAutoplayCardHelper2;
        this.LLJILJILJ = searchAdBrandZoneNestedAutoplayCardHelper;
        if (view2 != null || view3 != null) {
            try {
                C1558520qew.LJI(lifecycleOwner, SearchPlayerScope.class, new SearchServiceCenter$AutoPlayAbilityDefaultImpl() { // from class: com.ss.android.ugc.aweme.search.pages.result.topsearch.commerce.searchbrand.SearchBrandZoneAutoPlayCardHelper.1
                    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
                    public final void Mu(C650630PfZ c650630PfZ) {
                    }

                    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
                    public final void wp(C650630PfZ c650630PfZ) {
                    }

                    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbilityDefaultImpl, com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
                    public final void J0() {
                        SearchBrandZoneAutoPlayCardHelper.this.LJJIL();
                    }

                    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbilityDefaultImpl, com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
                    public final void LLZZZZ() {
                        SearchAdBrandZoneNestedAutoplayCardHelper.AnonymousClass1 anonymousClass1;
                        SearchAdBrandZoneNestedAutoplayCardHelper searchAdBrandZoneNestedAutoplayCardHelper3 = SearchBrandZoneAutoPlayCardHelper.this.LLJILJILJ;
                        if (searchAdBrandZoneNestedAutoplayCardHelper3 == null || (anonymousClass1 = searchAdBrandZoneNestedAutoplayCardHelper3.LLIZLLLIL) == null) {
                            return;
                        }
                        anonymousClass1.LLZZZZ();
                    }

                    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
                    public final boolean N1() {
                        SearchAdBrandZoneNestedAutoplayCardHelper.AnonymousClass1 anonymousClass1;
                        SearchBrandZoneAutoPlayCardHelper searchBrandZoneAutoPlayCardHelper = SearchBrandZoneAutoPlayCardHelper.this;
                        if (searchBrandZoneAutoPlayCardHelper.LLJILJILJ == null) {
                            searchBrandZoneAutoPlayCardHelper.LLJILJILJ = searchBrandZoneAutoPlayCardHelper.LJJIJIIJIL();
                        }
                        SearchAdBrandZoneNestedAutoplayCardHelper searchAdBrandZoneNestedAutoplayCardHelper3 = SearchBrandZoneAutoPlayCardHelper.this.LLJILJILJ;
                        return (searchAdBrandZoneNestedAutoplayCardHelper3 == null || (anonymousClass1 = searchAdBrandZoneNestedAutoplayCardHelper3.LLIZLLLIL) == null || !anonymousClass1.N1()) ? false : true;
                    }

                    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
                    public final View getDetectView() {
                        return SearchBrandZoneAutoPlayCardHelper.this.LLILLL;
                    }

                    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
                    public final boolean isPlaying() {
                        SearchAdBrandZoneNestedAutoplayCardHelper.AnonymousClass1 anonymousClass1;
                        SearchAdBrandZoneNestedAutoplayCardHelper searchAdBrandZoneNestedAutoplayCardHelper3 = SearchBrandZoneAutoPlayCardHelper.this.LLJILJILJ;
                        return (searchAdBrandZoneNestedAutoplayCardHelper3 == null || (anonymousClass1 = searchAdBrandZoneNestedAutoplayCardHelper3.LLIZLLLIL) == null || !anonymousClass1.isPlaying()) ? false : true;
                    }

                    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbilityDefaultImpl, com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
                    public final void kC0(int i) {
                        SearchAdBrandZoneNestedAutoplayCardHelper.AnonymousClass1 anonymousClass1;
                        SearchBrandZoneAutoPlayCardHelper searchBrandZoneAutoPlayCardHelper = SearchBrandZoneAutoPlayCardHelper.this;
                        if (searchBrandZoneAutoPlayCardHelper.LLJILJILJ == null) {
                            searchBrandZoneAutoPlayCardHelper.LLJILJILJ = searchBrandZoneAutoPlayCardHelper.LJJIJIIJIL();
                        }
                        SearchAdBrandZoneNestedAutoplayCardHelper searchAdBrandZoneNestedAutoplayCardHelper3 = SearchBrandZoneAutoPlayCardHelper.this.LLJILJILJ;
                        if (searchAdBrandZoneNestedAutoplayCardHelper3 != null && (anonymousClass1 = searchAdBrandZoneNestedAutoplayCardHelper3.LLIZLLLIL) != null) {
                            anonymousClass1.kC0(i);
                        }
                    }

                    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbilityDefaultImpl, com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
                    public final void Ot0(C640750PBh c640750PBh, Function0<Unit> function0) {
                        SearchAdBrandZoneNestedAutoplayCardHelper.AnonymousClass1 anonymousClass1;
                        SearchAdBrandZoneNestedAutoplayCardHelper.AnonymousClass1 anonymousClass12;
                        SearchAdBrandZoneNestedAutoplayCardHelper.AnonymousClass1 anonymousClass13;
                        SearchAdBrandZoneNestedAutoplayCardHelper.AnonymousClass1 anonymousClass14;
                        AbstractC21673619ry adapter;
                        SearchAdBrandZoneNestedAutoplayCardHelper searchAdBrandZoneNestedAutoplayCardHelper3 = SearchBrandZoneAutoPlayCardHelper.this.LLILZLL;
                        int itemCount = 0;
                        if (searchAdBrandZoneNestedAutoplayCardHelper3 != null && (adapter = searchAdBrandZoneNestedAutoplayCardHelper3.LL.getAdapter()) != null) {
                            itemCount = adapter.getItemCount();
                        }
                        int i = c640750PBh.LIZ;
                        if (i < itemCount) {
                            SearchBrandZoneAutoPlayCardHelper searchBrandZoneAutoPlayCardHelper = SearchBrandZoneAutoPlayCardHelper.this;
                            SearchAdBrandZoneNestedAutoplayCardHelper searchAdBrandZoneNestedAutoplayCardHelper4 = searchBrandZoneAutoPlayCardHelper.LLILZLL;
                            if (searchAdBrandZoneNestedAutoplayCardHelper4 != null && (anonymousClass14 = searchAdBrandZoneNestedAutoplayCardHelper4.LLIZLLLIL) != null) {
                                searchBrandZoneAutoPlayCardHelper.LJJIZ(SearchAdBrandZoneNestedAutoplayCardHelper.this.LLILLJJLI);
                            }
                            SearchAdBrandZoneNestedAutoplayCardHelper searchAdBrandZoneNestedAutoplayCardHelper5 = SearchBrandZoneAutoPlayCardHelper.this.LLILZLL;
                            if (searchAdBrandZoneNestedAutoplayCardHelper5 != null && (anonymousClass13 = searchAdBrandZoneNestedAutoplayCardHelper5.LLIZLLLIL) != null) {
                                anonymousClass13.Ot0(c640750PBh, function0);
                                return;
                            }
                            return;
                        }
                        C640750PBh c640750PBh2 = new C640750PBh(i - itemCount, c640750PBh.LIZIZ, c640750PBh.LIZJ, 0, 8);
                        SearchBrandZoneAutoPlayCardHelper searchBrandZoneAutoPlayCardHelper2 = SearchBrandZoneAutoPlayCardHelper.this;
                        SearchAdBrandZoneNestedAutoplayCardHelper searchAdBrandZoneNestedAutoplayCardHelper6 = searchBrandZoneAutoPlayCardHelper2.LLIZ;
                        if (searchAdBrandZoneNestedAutoplayCardHelper6 != null && (anonymousClass12 = searchAdBrandZoneNestedAutoplayCardHelper6.LLIZLLLIL) != null) {
                            searchBrandZoneAutoPlayCardHelper2.LJJIZ(SearchAdBrandZoneNestedAutoplayCardHelper.this.LLILLJJLI);
                        }
                        SearchAdBrandZoneNestedAutoplayCardHelper searchAdBrandZoneNestedAutoplayCardHelper7 = SearchBrandZoneAutoPlayCardHelper.this.LLIZ;
                        if (searchAdBrandZoneNestedAutoplayCardHelper7 == null || (anonymousClass1 = searchAdBrandZoneNestedAutoplayCardHelper7.LLIZLLLIL) == null) {
                            return;
                        }
                        anonymousClass1.Ot0(c640750PBh2, function0);
                    }
                }, SearchServiceCenter$AutoPlayAbility.class, null, null);
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
            try {
                C1558520qew.LJI(this.LLILLJJLI, SearchPlayerScope.class, new SearchServiceCenter$AutoPlayAbility.DeferredLoadNotifierAbility() { // from class: com.ss.android.ugc.aweme.search.pages.result.topsearch.commerce.searchbrand.SearchBrandZoneAutoPlayCardHelper.2
                    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility.DeferredLoadNotifierAbility
                    public final void Vy0(View view4) {
                        SearchAdBrandZoneNestedAutoplayCardHelper searchAdBrandZoneNestedAutoplayCardHelper3;
                        SearchAdBrandZoneNestedAutoplayCardHelper.AnonymousClass2.AnonymousClass1 anonymousClass1;
                        View view5;
                        SearchAdBrandZoneNestedAutoplayCardHelper.AnonymousClass1 anonymousClass12;
                        SearchAdBrandZoneNestedAutoplayCardHelper searchAdBrandZoneNestedAutoplayCardHelper4;
                        SearchAdBrandZoneNestedAutoplayCardHelper.AnonymousClass2.AnonymousClass1 anonymousClass13;
                        View view6;
                        SearchAdBrandZoneNestedAutoplayCardHelper searchAdBrandZoneNestedAutoplayCardHelper5 = SearchBrandZoneAutoPlayCardHelper.this.LLILZLL;
                        if (searchAdBrandZoneNestedAutoplayCardHelper5 != null && (((anonymousClass12 = searchAdBrandZoneNestedAutoplayCardHelper5.LLIZLLLIL) == null || (view6 = SearchAdBrandZoneNestedAutoplayCardHelper.this.LLILLJJLI) == null || !view6.isAttachedToWindow()) && (searchAdBrandZoneNestedAutoplayCardHelper4 = SearchBrandZoneAutoPlayCardHelper.this.LLILZLL) != null && (anonymousClass13 = searchAdBrandZoneNestedAutoplayCardHelper4.LLJ) != null)) {
                            anonymousClass13.Vy0(view4);
                        }
                        SearchAdBrandZoneNestedAutoplayCardHelper searchAdBrandZoneNestedAutoplayCardHelper6 = SearchBrandZoneAutoPlayCardHelper.this.LLIZ;
                        if (searchAdBrandZoneNestedAutoplayCardHelper6 != null) {
                            SearchAdBrandZoneNestedAutoplayCardHelper.AnonymousClass1 anonymousClass14 = searchAdBrandZoneNestedAutoplayCardHelper6.LLIZLLLIL;
                            if ((anonymousClass14 != null && (view5 = SearchAdBrandZoneNestedAutoplayCardHelper.this.LLILLJJLI) != null && view5.isAttachedToWindow()) || (searchAdBrandZoneNestedAutoplayCardHelper3 = SearchBrandZoneAutoPlayCardHelper.this.LLIZ) == null || (anonymousClass1 = searchAdBrandZoneNestedAutoplayCardHelper3.LLJ) == null) {
                                return;
                            }
                            anonymousClass1.Vy0(view4);
                        }
                    }
                }, SearchServiceCenter$AutoPlayAbility.DeferredLoadNotifierAbility.class, null, null);
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                C189200o6.m2constructorimpl(new C098200Yq(th2));
            }
        }
    }
}
