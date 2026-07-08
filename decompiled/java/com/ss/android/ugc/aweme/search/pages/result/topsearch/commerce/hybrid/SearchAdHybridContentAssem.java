package com.ss.android.ugc.aweme.search.pages.result.topsearch.commerce.hybrid;

import X.AbstractC655400PnG;
import X.C01GW;
import X.C07E5;
import X.C098200Yq;
import X.C0PK8;
import X.C0PL1;
import X.C0PN8;
import X.C0POT;
import X.C0PP8;
import X.C0PP9;
import X.C0PPA;
import X.C0PPC;
import X.C0PPD;
import X.C0Q18;
import X.C0Q4Z;
import X.C0R45;
import X.C0R4E;
import X.C1007860cKm;
import X.C11VU;
import X.C14EU;
import X.C1558420qem;
import X.C1558520qew;
import X.C189200o6;
import X.C19EG;
import X.C2041507zB;
import X.C2187701Ajg;
import X.C2188811AlT;
import X.C256520A3m;
import X.C294780Bgy;
import X.C452501pT;
import X.C488650JEh;
import X.C631370Opb;
import X.C640210P9f;
import X.C640750PBh;
import X.C641060PCm;
import X.C641500PEe;
import X.C650630PfZ;
import X.C655390PnF;
import X.C655610Pnb;
import X.C657990PrR;
import X.C679340Qkm;
import X.C686710Qwf;
import X.C786410Ut5;
import X.C946803n0;
import X.EnumC656000PoE;
import X.EnumC658110Prd;
import X.InterfaceC1009900cO4;
import X.InterfaceC1587906Jp;
import X.InterfaceC214897198d;
import X.InterfaceC214902198i;
import X.InterfaceC494301wD;
import X.InterfaceC657510Pqf;
import X.InterfaceC665370Q7z;
import X.InterfaceC686700Qwe;
import X.InterfaceC712990Rxx;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.commercialize.ability.CustomBgGradientAbility;
import com.ss.android.ugc.aweme.discover.model.SearchActivityCardBgData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.parser.SearchCardViewHolder;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.scope.SearchPlayerScope;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AdapterControlAbility;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$CardCommonAbility;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.common.theme.activitybg.ActivityCardThemeViewModel;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.commerce.hybrid.logger.BshCardVisibilityManager;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.ui.jedi.SearchJediMixFeedFragment;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.AwS411S0200000_10;
import kotlin.jvm.internal.AwS554S0100000_10;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchAdHybridContentAssem extends ReusedUISlotAssem<SearchAdHybridContentAssem> implements InterfaceC712990Rxx<C641500PEe>, CustomBgGradientAbility, InterfaceC1009900cO4 {
    public final C0PK8 LLJJLIIIJLLLLLLLZ;
    public C0PP8 LLJL;
    public Aweme LLJLIL;
    public SearchMixFeed LLJLILLLLZIIL;
    public C0PPD LLJZIJLIL;
    public boolean LLL;
    public List<? extends Aweme> LLLFFI;
    public BshCardVisibilityManager LLLI;
    public C0PPC LLLII;
    public final C01GW LLJLL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 679));
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 683));
    public final C01GW LLJLLL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 681));
    public final C01GW LLJZ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 682));
    public final C01GW LLLF = C452501pT.LIZIZ(new AwS554S0100000_10(this, 680));
    public final C01GW LLLFF = C452501pT.LIZIZ(new AwS554S0100000_10(this, 684));
    public final C01GW LLLFZ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL));

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.esq;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.ability.CustomBgGradientAbility
    public final int Td0() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.ability.CustomBgGradientAbility
    public final void pL0(InterfaceC494301wD interfaceC494301wD) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        C0PP8 c0pp8 = this.LLJL;
        if (c0pp8 != null) {
            c0pp8.onDestroy();
        }
    }

    public final C641060PCm op() {
        return (C641060PCm) this.LLLF.getValue();
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
        ViewTreeObserver viewTreeObserver;
        C641060PCm c641060PCmOp = op();
        c641060PCmOp.LLILLJJLI = -1;
        c641060PCmOp.LLILZ = null;
        c641060PCmOp.LLILLL.clear();
        ViewGroup viewGroup = c641060PCmOp.LL;
        if (viewGroup != null && (viewTreeObserver = viewGroup.getViewTreeObserver()) != null) {
            C0R4E c0r4e = c641060PCmOp.LLILZLL;
            viewTreeObserver.removeOnGlobalLayoutListener(c0r4e);
            C2187701Ajg.LIZIZ(viewTreeObserver, c0r4e, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
        C0PPA c0ppa = (C0PPA) this.LLLFZ.getValue();
        c0ppa.LIZ = -1;
        c0ppa.LIZIZ = -1;
        EventBus.LIZLLL().LJJI(this);
    }

    public SearchAdHybridContentAssem(C0PK8 c0pk8) {
        this.LLJJLIIIJLLLLLLLZ = c0pk8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1009900cO4
    public final void O8(int i) {
        Object objLIZLLL;
        C19EG activity;
        ActivityCardThemeViewModel activityCardThemeViewModel;
        if (this.LLJJLIIIJLLLLLLLZ == C0PK8.BRAND_HYBRID_AD) {
            C641060PCm c641060PCmOp = op();
            c641060PCmOp.getClass();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onSearchAdBrandStatusChange, brandStatus = ");
            sbLIZ.append(i);
            C2188811AlT.LIZIZ(sbLIZ);
            ViewGroup viewGroup = c641060PCmOp.LL;
            if (viewGroup != null && viewGroup.getVisibility() == 0) {
                ViewGroup viewGroup2 = c641060PCmOp.LL;
                C488650JEh c488650JEhLJII = SAFExtensionKt.LJII(viewGroup2.getContext());
                boolean z = false;
                ComponentCallbacks2 componentCallbacks2LJFF = null;
                if (c488650JEhLJII == null || (objLIZLLL = c488650JEhLJII.LIZLLL()) == null) {
                    if (SAFExtensionKt.LJFF(viewGroup2.getContext()) != null) {
                        ComponentCallbacks2 componentCallbacks2LJFF2 = SAFExtensionKt.LJFF(viewGroup2.getContext());
                        if (C294780Bgy.LIZ()) {
                            if (!(componentCallbacks2LJFF2 instanceof InterfaceC214897198d)) {
                                return;
                            }
                        } else if (!(componentCallbacks2LJFF2 instanceof InterfaceC214897198d) || !((InterfaceC214897198d) componentCallbacks2LJFF2).getEnableSAF()) {
                            return;
                        }
                    }
                    Fragment fragmentLIZ = C946803n0.LIZ(viewGroup2);
                    if (fragmentLIZ == 0) {
                        return;
                    }
                    Context context = fragmentLIZ.getContext();
                    if (context != null) {
                        componentCallbacks2LJFF = SAFExtensionKt.LJFF(context);
                    }
                    if (C294780Bgy.LIZ()) {
                        if (!(componentCallbacks2LJFF instanceof InterfaceC214897198d)) {
                            return;
                        }
                    } else if (!(componentCallbacks2LJFF instanceof InterfaceC214897198d) || !((InterfaceC214897198d) componentCallbacks2LJFF).getEnableSAF()) {
                        return;
                    }
                    while (!(fragmentLIZ instanceof InterfaceC214902198i)) {
                        fragmentLIZ = fragmentLIZ.getParentFragment();
                        if (fragmentLIZ == 0) {
                            return;
                        }
                    }
                    objLIZLLL = (InterfaceC214902198i) fragmentLIZ;
                    if (objLIZLLL == null) {
                        return;
                    }
                }
                Fragment fragment = (Fragment) objLIZLLL;
                if (fragment != null && (activity = fragment.getActivity()) != null && (activityCardThemeViewModel = (ActivityCardThemeViewModel) C679340Qkm.LIZIZ(fragment, activity).get(ActivityCardThemeViewModel.class)) != null) {
                    if (i == 1) {
                        z = true;
                    }
                    activityCardThemeViewModel.yQ2().postValue(Boolean.valueOf(z));
                }
            }
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final Context So(Context context) {
        if (C07E5.LIZ()) {
            return LJJIJL().getContext();
        }
        return context;
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onReceiveBrandZoneAwemeListMerge(C2041507zB c2041507zB) {
        this.LLLFFI = c2041507zB.LIZIZ;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        ((SearchServiceCenter$CardCommonAbility) C1558520qew.LIZJ(C1558520qew.LJIIL(this), SearchServiceCenter$CardCommonAbility.class)).A12(new C0R45(this, 17));
        if (this.LLJJLIIIJLLLLLLLZ == C0PK8.BRAND_HYBRID_AD) {
            try {
                C1558520qew.LJI(this, SearchPlayerScope.class, new SearchServiceCenter$AutoPlayAbility() { // from class: com.ss.android.ugc.aweme.search.pages.result.topsearch.commerce.hybrid.SearchAdHybridContentAssem.onViewCreated.2
                    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
                    public final void LJJLIIIJLLLLLLLZ() {
                    }

                    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
                    public final void Mu(C650630PfZ c650630PfZ) {
                    }

                    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
                    public final boolean N1() {
                        return true;
                    }

                    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
                    public final View Vt() {
                        return null;
                    }

                    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
                    public final void kC0(int i) {
                    }

                    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
                    public final boolean mm() {
                        return true;
                    }

                    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
                    public final void wp(C650630PfZ c650630PfZ) {
                    }

                    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
                    public final void J0() {
                        SearchAdHybridContentAssem.this.op().LJJIZ();
                    }

                    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
                    public final void LLZZZZ() {
                        SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbility;
                        C641060PCm c641060PCmOp = SearchAdHybridContentAssem.this.op();
                        c641060PCmOp.getClass();
                        if (c641060PCmOp.LLILLL == null || !(!r0.isEmpty()) || (searchServiceCenter$AutoPlayAbility = c641060PCmOp.LLILZ) == null) {
                            return;
                        }
                        searchServiceCenter$AutoPlayAbility.LLZZZZ();
                    }

                    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
                    public final View getDetectView() {
                        return SearchAdHybridContentAssem.this.LJJIJL();
                    }

                    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
                    public final boolean isPlaying() {
                        SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbility = SearchAdHybridContentAssem.this.op().LLILZ;
                        boolean zIsPlaying = searchServiceCenter$AutoPlayAbility != null ? searchServiceCenter$AutoPlayAbility.isPlaying() : false;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("isPlaying: ");
                        sbLIZ.append(zIsPlaying);
                        C2188811AlT.LIZIZ(sbLIZ);
                        return zIsPlaying;
                    }

                    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
                    public final void Ot0(C640750PBh c640750PBh, Function0<Unit> function0) {
                        C641060PCm c641060PCmOp = SearchAdHybridContentAssem.this.op();
                        c641060PCmOp.getClass();
                        int i = c640750PBh.LIZ;
                        if (i >= 0 && i < c641060PCmOp.LLILLL.size()) {
                            View view2 = (View) ListProtector.get(c641060PCmOp.LLILLL, i);
                            view2.requestRectangleOnScreen(new Rect(0, 0, view2.getWidth(), (C11VU.LIZLLL(view2.getContext()) + view2.getHeight()) / 2));
                            SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbilityLJJIJIIJIL = C641060PCm.LJJIJIIJIL(view2);
                            C640750PBh c640750PBh2 = c640750PBh.LIZIZ;
                            if (searchServiceCenter$AutoPlayAbilityLJJIJIIJIL != null && c640750PBh2 != null) {
                                c641060PCmOp.LLILZIL = true;
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("requstToLocate and locate to item: ");
                                sbLIZ.append(searchServiceCenter$AutoPlayAbilityLJJIJIIJIL);
                                sbLIZ.append('.');
                                C2188811AlT.LIZIZ(sbLIZ);
                                searchServiceCenter$AutoPlayAbilityLJJIJIIJIL.LLZZZZ();
                                searchServiceCenter$AutoPlayAbilityLJJIJIIJIL.Ot0(c640750PBh2, new AwS411S0200000_10(searchServiceCenter$AutoPlayAbilityLJJIJIIJIL, c641060PCmOp, 95));
                            }
                        }
                        function0.invoke();
                    }
                }, SearchServiceCenter$AutoPlayAbility.class, null, null);
                C189200o6.m2constructorimpl(Unit.LIZ);
                return;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return;
            }
        }
        if (C256520A3m.LIZIZ) {
            try {
                C1558520qew.LJI(this, SearchPlayerScope.class, new SearchServiceCenter$AutoPlayAbility() { // from class: com.ss.android.ugc.aweme.search.pages.result.topsearch.commerce.hybrid.SearchAdHybridContentAssem.onViewCreated.3
                    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
                    public final void LJJLIIIJLLLLLLLZ() {
                    }

                    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
                    public final void Mu(C650630PfZ c650630PfZ) {
                    }

                    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
                    public final boolean N1() {
                        return true;
                    }

                    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
                    public final View Vt() {
                        return null;
                    }

                    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
                    public final void kC0(int i) {
                    }

                    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
                    public final boolean mm() {
                        return false;
                    }

                    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
                    public final void wp(C650630PfZ c650630PfZ) {
                    }

                    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
                    public final void J0() {
                        SearchAdHybridContentAssem.this.LLL = true;
                    }

                    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
                    public final void LLZZZZ() {
                        SearchAdHybridContentAssem.this.LLL = false;
                    }

                    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
                    public final View getDetectView() {
                        return SearchAdHybridContentAssem.this.LJJIJL();
                    }

                    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
                    public final boolean isPlaying() {
                        return SearchAdHybridContentAssem.this.LLL;
                    }

                    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
                    public final void Ot0(C640750PBh c640750PBh, Function0<Unit> function0) {
                        function0.invoke();
                    }
                }, SearchServiceCenter$AutoPlayAbility.class, null, null);
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                C189200o6.m2constructorimpl(new C098200Yq(th2));
            }
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C641500PEe c641500PEe) {
        String strLIZIZ;
        C0PP8 c0pp8LJIILL;
        C0Q4Z currentState;
        C0PPD c0ppdLIZIZ;
        C0POT c0potLIZLLL;
        InterfaceC686700Qwe interfaceC686700Qwe;
        Aweme awemeLJIIIIZZ;
        RecyclerView.ViewHolder viewHolderK4;
        String strPS;
        String enterMethod;
        String keyword;
        SearchJediMixFeedFragment searchJediMixFeedFragment;
        String prefetchId;
        String str;
        C0Q18 c0q18LIZ;
        SearchCardViewHolder searchCardViewHolder;
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ;
        C0Q18 c0q18LIZ2;
        ViewGroup viewGroup;
        boolean z;
        C1007860cKm c1007860cKmLJIILIIL;
        String str2;
        C641500PEe c641500PEe2 = c641500PEe;
        SearchMixFeed searchMixFeed = c641500PEe2.LL;
        this.LLJLILLLLZIIL = searchMixFeed;
        C686710Qwf c686710Qwf = null;
        if (searchMixFeed != null) {
            strLIZIZ = C655390PnF.LIZIZ(searchMixFeed, this.LLJJLIIIJLLLLLLLZ);
        } else {
            strLIZIZ = null;
        }
        C655610Pnb c655610Pnb = C655610Pnb.LIZIZ;
        InterfaceC657510Pqf interfaceC657510PqfLIZLLL = c655610Pnb.LIZLLL();
        String str3 = "";
        if (interfaceC657510PqfLIZLLL != null) {
            if (strLIZIZ == null) {
                str2 = "";
            } else {
                str2 = strLIZIZ;
            }
            c0pp8LJIILL = interfaceC657510PqfLIZLLL.LJIILL(str2, false);
        } else {
            c0pp8LJIILL = null;
        }
        this.LLJL = c0pp8LJIILL;
        if (c0pp8LJIILL != null) {
            currentState = c0pp8LJIILL.getCurrentState();
        } else {
            currentState = null;
        }
        if (currentState == C0Q4Z.SHOW_FAILED) {
            C786410Ut5.LJLLLLLL(8, getContentView());
            sp(c641500PEe2);
            this.LLJL = null;
            return;
        }
        InterfaceC657510Pqf interfaceC657510PqfLIZLLL2 = c655610Pnb.LIZLLL();
        if (interfaceC657510PqfLIZLLL2 != null && (c1007860cKmLJIILIIL = interfaceC657510PqfLIZLLL2.LJIILIIL()) != null) {
            c0ppdLIZIZ = c1007860cKmLJIILIIL.LIZIZ(null, strLIZIZ);
        } else {
            c0ppdLIZIZ = null;
        }
        this.LLJZIJLIL = c0ppdLIZIZ;
        if (c0ppdLIZIZ != null) {
            c0ppdLIZIZ.LJFF(null, EnumC658110Prd.HYBRID_AD, strLIZIZ);
        }
        if (C631370Opb.LIZIZ(this) == 0) {
            View view = (View) this.LLJZ.getValue();
            if (view != null) {
                C786410Ut5.LJLLLLLL(8, view);
            }
        } else {
            View view2 = (View) this.LLJZ.getValue();
            if (view2 != null) {
                C786410Ut5.LJLLLLLL(0, view2);
            }
        }
        C0PP8 c0pp8 = this.LLJL;
        if (c0pp8 == null || c0pp8.LJIIIIZZ() == null) {
            C0PP8 c0pp82 = this.LLJL;
            if (c0pp82 != null) {
                c0potLIZLLL = c0pp82.LIZLLL(this.LLJJLIIIJLLLLLLLZ);
            } else {
                c0potLIZLLL = null;
            }
            AbstractC655400PnG abstractC655400PnGLIZ = C655390PnF.LIZ(c641500PEe2.LL, this.LLJJLIIIJLLLLLLLZ);
            C0PP8 c0pp83 = this.LLJL;
            if (c0pp83 != null) {
                if (c0potLIZLLL != null) {
                    interfaceC686700Qwe = c0potLIZLLL.LIZ;
                } else {
                    interfaceC686700Qwe = null;
                }
                c0pp83.LJIILL(abstractC655400PnGLIZ, interfaceC686700Qwe);
            }
        }
        C0PP8 c0pp84 = this.LLJL;
        if (c0pp84 != null) {
            awemeLJIIIIZZ = c0pp84.LJIIIIZZ();
        } else {
            awemeLJIIIIZZ = null;
        }
        this.LLJLIL = awemeLJIIIIZZ;
        C0PP8 c0pp85 = this.LLJL;
        if (c0pp85 != null) {
            Context context = getContext();
            SmartImageView smartImageView = (SmartImageView) this.LLJLLL.getValue();
            ViewGroup viewGroup2 = (ViewGroup) this.LLJLLIL.getValue();
            View viewLJJIJL = LJJIJL();
            if (viewLJJIJL instanceof ViewGroup) {
                viewGroup = (ViewGroup) viewLJJIJL;
            } else {
                viewGroup = null;
            }
            if (C631370Opb.LIZIZ(this) != 0) {
                z = true;
            } else {
                z = false;
            }
            c0pp85.LJIILIIL(new C0PP9(context, smartImageView, viewGroup2, viewGroup, z, new AwS411S0200000_10(this, c641500PEe2, 90)));
        }
        C0PP8 c0pp86 = this.LLJL;
        if (c0pp86 != null) {
            c0pp86.bind();
        }
        C0PP8 c0pp87 = this.LLJL;
        if (c0pp87 != null && (c0q18LIZ2 = c0pp87.LIZ()) != null) {
            c0q18LIZ2.Xq2(EnumC656000PoE.SEARCH_AD_HYBRID_CARD.getValue(), (ViewGroup) this.LLJLL.getValue());
        }
        C0PPD c0ppd = this.LLJZIJLIL;
        if (c0ppd != null) {
            c0ppd.LIZ();
        }
        SearchServiceCenter$CardCommonAbility searchServiceCenter$CardCommonAbility = (SearchServiceCenter$CardCommonAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), SearchServiceCenter$CardCommonAbility.class, null);
        if (searchServiceCenter$CardCommonAbility != null) {
            viewHolderK4 = searchServiceCenter$CardCommonAbility.k4();
        } else {
            viewHolderK4 = null;
        }
        if ((viewHolderK4 instanceof SearchCardViewHolder) && (searchCardViewHolder = (SearchCardViewHolder) viewHolderK4) != null && (interfaceC665370Q7zLIZIZ = C1558420qem.LIZIZ(searchCardViewHolder)) != null) {
            C1558520qew.LJII(interfaceC665370Q7zLIZIZ, this, CustomBgGradientAbility.class, null, null);
        }
        EventBus.LIZLLL().LJIJJ(this);
        C0PP8 c0pp88 = this.LLJL;
        if (c0pp88 != null && (c0q18LIZ = c0pp88.LIZ()) != null) {
            c0q18LIZ.FH2(this);
        }
        C0PP8 c0pp89 = this.LLJL;
        if (c0pp89 != null) {
            SearchMixFeed searchMixFeed2 = this.LLJLILLLLZIIL;
            if (searchMixFeed2 != null && this.LLJLIL != null) {
                int rank = searchMixFeed2.getRank();
                String requestId = searchMixFeed2.getRequestId();
                if (requestId == null) {
                    requestId = "";
                }
                int feedType = searchMixFeed2.getFeedType();
                if (C657990PrR.LIZ(LJJIJL()) == null) {
                    strPS = "";
                    enterMethod = "";
                    keyword = "";
                } else {
                    Fragment fragmentLIZ = C946803n0.LIZ(LJJIJL());
                    if (!(fragmentLIZ instanceof SearchJediMixFeedFragment) || (searchJediMixFeedFragment = (SearchJediMixFeedFragment) fragmentLIZ) == null) {
                        strPS = "";
                        enterMethod = "";
                        keyword = "";
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
                        if (searchResultParam3 == null || (keyword = searchResultParam3.getKeyword()) == null) {
                            keyword = "";
                        }
                        if (requestId.length() == 0) {
                            C0PN8 c0pn8HU = searchJediMixFeedFragment.HU(false);
                            if (c0pn8HU != null && (str = c0pn8HU.LLJILJILJ) != null) {
                                str3 = str;
                            }
                            requestId = str3;
                        }
                        str3 = prefetchId;
                    }
                }
                c686710Qwf = new C686710Qwf(requestId, feedType, rank, strPS, enterMethod, keyword, str3);
            }
            c0pp89.LJIIJJI(c686710Qwf);
        }
        C0PP8 c0pp810 = this.LLJL;
        if (c0pp810 == null) {
            return;
        }
        c0pp810.LJIJ();
    }

    public final void sp(C641500PEe c641500PEe) {
        SearchServiceCenter$AdapterControlAbility searchServiceCenter$AdapterControlAbility = (SearchServiceCenter$AdapterControlAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), SearchServiceCenter$AdapterControlAbility.class, null);
        if (searchServiceCenter$AdapterControlAbility != null) {
            searchServiceCenter$AdapterControlAbility.vb(c641500PEe, C0PL1.UNDEFINED);
        }
        View view = (View) this.LLJZ.getValue();
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C641500PEe c641500PEe) {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.ability.CustomBgGradientAbility
    public final int xI1(SearchActivityCardBgData searchActivityCardBgData) {
        int measuredHeight;
        int i;
        C0PPA c0ppa = (C0PPA) this.LLLFZ.getValue();
        View viewLJJIJL = LJJIJL();
        c0ppa.getClass();
        if (searchActivityCardBgData != null && C640210P9f.LIZIZ(searchActivityCardBgData)) {
            int measuredHeight2 = viewLJJIJL.getMeasuredHeight();
            if (measuredHeight2 == c0ppa.LIZ && (i = c0ppa.LIZIZ) > 0) {
                return i;
            }
            c0ppa.LIZ = measuredHeight2;
            Integer numLIZ = C640210P9f.LIZ(viewLJJIJL);
            if (numLIZ != null) {
                measuredHeight = numLIZ.intValue();
            } else {
                measuredHeight = viewLJJIJL.getMeasuredHeight();
            }
            c0ppa.LIZIZ = measuredHeight;
            return measuredHeight;
        }
        return viewLJJIJL.getMeasuredHeight();
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C641500PEe c641500PEe) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
