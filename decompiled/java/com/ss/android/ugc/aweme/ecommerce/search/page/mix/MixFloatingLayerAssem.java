package com.ss.android.ugc.aweme.ecommerce.search.page.mix;

import X.C019F;
import X.C01GW;
import X.C049Q;
import X.C09R3;
import X.C0GYM;
import X.C0HA4;
import X.C0QER;
import X.C0QQZ;
import X.C0XI4;
import X.C12869051v;
import X.C12ES;
import X.C1389880mGw;
import X.C13IQ;
import X.C13LE;
import X.C1537720q7O;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1749280vcc;
import X.C1872780ypo;
import X.C19719912Dl;
import X.C19EG;
import X.C2217381BqS;
import X.C2217401BqU;
import X.C2341109Fh;
import X.C2344009Gk;
import X.C2399609ak;
import X.C259800zU;
import X.C262100zr;
import X.C418440Gaw;
import X.C426750GoL;
import X.C428840Gri;
import X.C452501pT;
import X.C675970QfL;
import X.C677490Qhn;
import X.C679100QkO;
import X.C679260Qke;
import X.C679270Qkf;
import X.C679280Qkg;
import X.C679540Ql6;
import X.C689770R3v;
import X.C723580SZw;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC675750Qez;
import X.InterfaceC1107590evd;
import X.InterfaceC1141530foN;
import X.InterfaceC2217461Bqa;
import X.InterfaceC679310Qkj;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.AObserverS214S0100000_10;
import Y.ARunnableS110S0100000_10;
import Y.ARunnableS17S0201000_10;
import Y.ARunnableS79S0200000_10;
import Y.AsS37S0100000_10;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.google.gson.k;
import com.google.gson.n;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.ecommerce.arch.Inset;
import com.ss.android.ugc.aweme.ecommerce.arch.LogPbBean;
import com.ss.android.ugc.aweme.ecommerce.arch.MixPageViewModel;
import com.ss.android.ugc.aweme.ecommerce.arch.MixStyle;
import com.ss.android.ugc.aweme.ecommerce.arch.SearchBffItem;
import com.ss.android.ugc.aweme.ecommerce.model.CartRefreshEvent;
import com.ss.android.ugc.aweme.ecommerce.search.result.ISearchResultSubPageContextAbility;
import com.ss.android.ugc.aweme.ecommerce.search.result.vertical.assem.VerticalParamsBuildAbility;
import com.ss.android.ugc.aweme.search.ecommerce.entrance.ISearchContainerTypeAbility;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AwS128S0110000_10;
import kotlin.jvm.internal.AwS136S0201000_10;
import kotlin.jvm.internal.AwS376S0200000_10;
import kotlin.jvm.internal.AwS411S0200000_10;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS624S0100000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class MixFloatingLayerAssem extends UIContentAssem implements InterfaceC1141530foN {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJZ;
    public ViewOnAttachStateChangeListenerC20604515jv LLIZLLLIL;
    public C428840Gri LLJ;
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS554S0100000_10(this, 94));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 85));
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 81));
    public final AssemVMLazy LLJILJILJ;
    public SearchResultParam LLJILLL;
    public boolean LLJJ;
    public C679100QkO LLJJI;
    public C1537720q7O LLJJIII;
    public boolean LLJJIJI;
    public boolean LLJJIJIIJIL;
    public ARunnableS79S0200000_10 LLJJIJIL;
    public boolean LLJJJ;
    public boolean LLJJJIL;
    public final C01GW LLJJJJ;
    public final BPEAHandler LLJJJJJIL;
    public final ARunnableS110S0100000_10 LLJJJJLIIL;
    public final Map<Integer, Pair<View, SearchBffItem>> LLJJL;
    public final C679260Qke LLJJLIIIJLLLLLLLZ;
    public final AsS37S0100000_10 LLJL;
    public float LLJLIL;
    public AnimatorSet LLJLILLLLZIIL;
    public Animator LLJLL;
    public ObjectAnimator LLJLLIL;
    public ObjectAnimator LLJLLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MixFloatingLayerAssem.class, "mixShopBizVM", "getMixShopBizVM()Lcom/ss/android/ugc/aweme/ecommerce/search/page/mix/MixShopSearchBizVM;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217401BqU c2217401BqU = new C2217401BqU(MixFloatingLayerAssem.class, "vm", "<v#1>", 0);
        c09r3.getClass();
        C2217401BqU c2217401BqU2 = new C2217401BqU(MixFloatingLayerAssem.class, "vm", "<v#2>", 0);
        c09r3.getClass();
        LLJZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217401BqU, c2217401BqU2};
    }

    public MixFloatingLayerAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MixShopSearchBizVM.class);
        this.LLJILJILJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS554S0100000_10((C13IQ) c19719912DlLIZ, 83), AFwS241S0000000_10.get$arr$(54), null, true);
        this.LLJJJJ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 92));
        this.LLJJJJJIL = new BPEAHandler();
        this.LLJJJJLIIL = new ARunnableS110S0100000_10(this, 18);
        this.LLJJL = new LinkedHashMap();
        this.LLJJLIIIJLLLLLLLZ = new C679260Qke(this);
        this.LLJL = new AsS37S0100000_10(this, 1);
    }

    public final void Jo() {
        View first;
        Pair<? extends View, ? extends SearchBffItem> pair = this.LLJJLIIIJLLLLLLLZ.get(34);
        if (pair == null || (first = pair.getFirst()) == null) {
            return;
        }
        this.LLJJLIIIJLLLLLLLZ.remove(34);
        C786410Ut5.LJJJZ(first, ap());
    }

    public final MixPageViewModel Lo() {
        return (MixPageViewModel) this.LLJJJJ.getValue();
    }

    public final MixShopSearchBizVM No() {
        AssemVMLazy assemVMLazy = this.LLJILJILJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJZ;
        return (MixShopSearchBizVM) assemVMLazy.getValue();
    }

    public final String So() {
        C0QER searchEnterParam;
        String str;
        SearchResultParam searchResultParam = this.LLJILLL;
        if (searchResultParam != null && (searchEnterParam = searchResultParam.getSearchEnterParam()) != null) {
            Object objObtainEcLogData = searchEnterParam.obtainEcLogData("result_search_entrance");
            if (objObtainEcLogData == null && (objObtainEcLogData = searchEnterParam.obtainEcLogData("search_entrance")) == null) {
                objObtainEcLogData = searchEnterParam.getEnterSearchFrom();
            }
            if ((objObtainEcLogData instanceof String) && (str = (String) objObtainEcLogData) != null) {
                return str;
            }
        }
        return "";
    }

    public final FrameLayout ap() {
        return (FrameLayout) this.LLJI.getValue();
    }

    public final C1749280vcc ef0() {
        return (C1749280vcc) this.LLJIJIL.getValue();
    }

    public final void ip() {
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        AFwS196S0000000_10 aFwS196S0000000_10 = AFwS196S0000000_10.get$arr$(93);
        c2341109Fh.getClass();
        C2341109Fh.LIZIZ(aFwS196S0000000_10);
        Pair<? extends View, ? extends SearchBffItem> pair = this.LLJJLIIIJLLLLLLLZ.get(17);
        View first = pair != null ? pair.getFirst() : null;
        if (this.LLJJIJI) {
            if (first == null || first.getVisibility() != 0) {
                C2341109Fh.LIZIZ(new AwS554S0100000_10(first, 87));
                return;
            }
            C2341109Fh.LIZIZ(AFwS196S0000000_10.get$arr$(95));
            C12ES.LJIILL(4, first);
            C2341109Fh.LIZIZ(new AwS554S0100000_10(first, 86));
            return;
        }
        if (first == null) {
            C2341109Fh.LIZIZ(AFwS196S0000000_10.get$arr$(99));
            return;
        }
        C2341109Fh.LIZIZ(new AwS554S0100000_10(first, 89));
        C12ES.LJIILL(0, first);
        if (first.getVisibility() != 0) {
            C786410Ut5.LJLLLLLL(0, first);
            C2341109Fh.LIZIZ(new AwS554S0100000_10(first, 90));
        }
        C2341109Fh.LIZIZ(new AwS554S0100000_10(first, 91));
    }

    public final String Zo() {
        C0QER searchEnterParam;
        String str;
        Map map;
        Map<String, Object> mapZZ0;
        String enterSearchFrom = null;
        VerticalParamsBuildAbility verticalParamsBuildAbility = (VerticalParamsBuildAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), VerticalParamsBuildAbility.class, null);
        Object obj = (verticalParamsBuildAbility == null || (mapZZ0 = verticalParamsBuildAbility.ZZ0(this.LLJILLL)) == null) ? null : mapZZ0.get("ecTrackParams");
        Object obj2 = (!(obj instanceof Map) || (map = (Map) obj) == null) ? null : map.get("vertical_search_scene");
        if ((obj2 instanceof String) && (str = (String) obj2) != null) {
            return str;
        }
        SearchResultParam searchResultParam = this.LLJILLL;
        if (searchResultParam != null && (searchEnterParam = searchResultParam.getSearchEnterParam()) != null) {
            enterSearchFrom = searchEnterParam.getEnterSearchFrom();
        }
        return Intrinsics.LJFF(enterSearchFrom, "product_detail") ? "product_detail_search" : "goods_search";
    }

    public final void hp() {
        C786410Ut5.LLLZLZ(ef0(), 0);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLIZLLLIL;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            C786410Ut5.LLF(8, viewOnAttachStateChangeListenerC20604515jv);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        FrameLayout frameLayout;
        View view;
        super.onDestroy();
        this.LLJJ = false;
        ARunnableS79S0200000_10 aRunnableS79S0200000_10 = this.LLJJIJIL;
        View viewFindViewById = null;
        if (aRunnableS79S0200000_10 != null) {
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLIZLLLIL;
            if (viewOnAttachStateChangeListenerC20604515jv != null) {
                HandlerHook.viewRemoveCallbacks(viewOnAttachStateChangeListenerC20604515jv, aRunnableS79S0200000_10);
            }
            this.LLJJIJIL = null;
        }
        AnimatorSet animatorSet = this.LLJLILLLLZIIL;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.LLJLILLLLZIIL = null;
        Animator animator = this.LLJLL;
        if (animator != null) {
            animator.cancel();
        }
        this.LLJLL = null;
        ObjectAnimator objectAnimator = this.LLJLLIL;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        this.LLJLLIL = null;
        ObjectAnimator objectAnimator2 = this.LLJLLL;
        if (objectAnimator2 != null) {
            objectAnimator2.cancel();
        }
        this.LLJLLL = null;
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null && (view = fragmentLJI.getView()) != null) {
            viewFindViewById = view.findViewById(R.id.v_search_third_layer);
        }
        if ((viewFindViewById instanceof FrameLayout) && (frameLayout = (FrameLayout) viewFindViewById) != null) {
            C786410Ut5.LJJJJIZL(frameLayout);
        }
        this.LLJJLIIIJLLLLLLLZ.clear();
    }

    public final boolean bp(View view) {
        ViewGroup viewGroup;
        View view2;
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        AwS554S0100000_10 awS554S0100000_10 = new AwS554S0100000_10(view, 84);
        c2341109Fh.getClass();
        C2341109Fh.LIZIZ(awS554S0100000_10);
        Rect rect = new Rect();
        boolean globalVisibleRect = view.getGlobalVisibleRect(rect);
        C2341109Fh.LIZIZ(new AwS128S0110000_10(rect, globalVisibleRect, 0));
        if (globalVisibleRect && rect.height() > 0) {
            Fragment fragmentLJI = C724240Sb0.LJI(this);
            if (fragmentLJI != null && (view2 = fragmentLJI.getView()) != null) {
                viewGroup = (ViewGroup) view2.findViewById(R.id.ua7);
            } else {
                viewGroup = null;
            }
            if (viewGroup == null) {
                C2341109Fh.LIZIZ(AFwS196S0000000_10.get$arr$(96));
                return true;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getId() != R.id.w81 && childAt.getId() != R.id.f712gh6 && childAt.getId() != R.id.gg2 && childAt.getId() != R.id.ug7 && childAt.getVisibility() == 0) {
                    Rect rect2 = new Rect();
                    childAt.getGlobalVisibleRect(rect2);
                    C2341109Fh c2341109Fh2 = C2341109Fh.LIZ;
                    AwS136S0201000_10 awS136S0201000_10 = new AwS136S0201000_10(childAt, i, rect2, 2);
                    c2341109Fh2.getClass();
                    C2341109Fh.LIZIZ(awS136S0201000_10);
                    if (Rect.intersects(rect2, rect)) {
                        Rect rect3 = new Rect();
                        rect3.setIntersect(rect2, rect);
                        C2341109Fh.LIZIZ(new AwS554S0100000_10(rect3, 88));
                        if (rect3.width() * rect3.height() >= ((double) (rect.width() * rect.height())) * 1.0d) {
                            C2341109Fh.LIZIZ(AFwS196S0000000_10.get$arr$(97));
                            return false;
                        }
                    } else {
                        continue;
                    }
                }
            }
            C2341109Fh c2341109Fh3 = C2341109Fh.LIZ;
            AFwS196S0000000_10 aFwS196S0000000_10 = AFwS196S0000000_10.get$arr$(98);
            c2341109Fh3.getClass();
            C2341109Fh.LIZIZ(aFwS196S0000000_10);
            return true;
        }
        C2341109Fh.LIZIZ(AFwS196S0000000_10.get$arr$(94));
        return false;
    }

    public final void cp(n nVar) {
        String strLIZJ;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("search_entrance", So());
        c2344009Gk.LJIIIIZZ("enter_from", Zo());
        c2344009Gk.LJIIIIZZ("survey_id", C2399609ak.LIZJ(nVar, "survey_id"));
        c2344009Gk.LJIIIIZZ("submit_id", C2399609ak.LIZJ(nVar, "submit_id"));
        c2344009Gk.LJIIIIZZ("survey_type", "icon");
        n value = No().LLJI.getValue();
        String imprId = null;
        if (value != null) {
            strLIZJ = C2399609ak.LIZJ(value, "search_id");
        } else {
            strLIZJ = null;
        }
        c2344009Gk.LJIIIIZZ("search_id", strLIZJ);
        LogPbBean value2 = No().LLJ.getValue();
        if (value2 != null) {
            imprId = value2.getImprId();
        }
        c2344009Gk.LJIIIIZZ("impr_id", imprId);
        C679270Qkf.LIZIZ("survey_search_doc_click", c2344009Gk.LIZ);
    }

    public final void dp(n nVar) {
        String strLIZJ;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("search_entrance", So());
        c2344009Gk.LJIIIIZZ("enter_from", Zo());
        c2344009Gk.LJIIIIZZ("survey_id", C2399609ak.LIZJ(nVar, "survey_id"));
        c2344009Gk.LJIIIIZZ("submit_id", C2399609ak.LIZJ(nVar, "submit_id"));
        c2344009Gk.LJIIIIZZ("survey_type", "icon");
        n value = No().LLJI.getValue();
        String imprId = null;
        if (value != null) {
            strLIZJ = C2399609ak.LIZJ(value, "search_id");
        } else {
            strLIZJ = null;
        }
        c2344009Gk.LJIIIIZZ("search_id", strLIZJ);
        LogPbBean value2 = No().LLJ.getValue();
        if (value2 != null) {
            imprId = value2.getImprId();
        }
        c2344009Gk.LJIIIIZZ("impr_id", imprId);
        C679270Qkf.LIZIZ("survey_search_doc_show", c2344009Gk.LIZ);
    }

    public final void ep(SearchBffItem searchBffItem) {
        int i;
        Inset inset;
        Inset inset2;
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        AwS554S0100000_10 awS554S0100000_10 = new AwS554S0100000_10(searchBffItem, 75);
        c2341109Fh.getClass();
        C2341109Fh.LIZIZ(awS554S0100000_10);
        C1537720q7O c1537720q7OOo = Oo(searchBffItem, null);
        if (c1537720q7OOo != null) {
            C2341109Fh.LIZIZ(new AwS554S0100000_10(searchBffItem, 77));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 8388693);
            MixStyle mixStyle = searchBffItem.style;
            int i2 = 0;
            if (mixStyle != null && (inset2 = mixStyle.marginInfo) != null) {
                i = (int) inset2.marginRight;
            } else {
                i = 0;
            }
            layoutParams.setMarginEnd(C679280Qkg.LIZ(Math.abs(i)));
            MixStyle mixStyle2 = searchBffItem.style;
            if (mixStyle2 != null && (inset = mixStyle2.marginInfo) != null) {
                i2 = (int) inset.marginBottom;
            }
            layoutParams.bottomMargin = C679280Qkg.LIZ(Math.abs(i2));
            if (searchBffItem.type == 17) {
                C786410Ut5.m2(c1537720q7OOo, 4);
            }
            ap().addView(c1537720q7OOo, layoutParams);
            this.LLJJLIIIJLLLLLLLZ.put(Integer.valueOf(searchBffItem.type), new Pair<>(c1537720q7OOo, searchBffItem));
            C2341109Fh.LIZIZ(new AwS411S0200000_10(searchBffItem, this, 11));
            C2341109Fh.LIZIZ(new AwS554S0100000_10(this, 79));
            if (searchBffItem.type == 17) {
                C2341109Fh.LIZIZ(new AwS554S0100000_10(c1537720q7OOo, 80));
                return;
            }
            return;
        }
        C2341109Fh.LIZIZ(new AwS554S0100000_10(searchBffItem, 82));
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        Integer num;
        C19EG c19egLIZ;
        ViewGroup viewGroup;
        if (Intrinsics.LJFF(c262100zr.LIZ, "ec_cart_refresh")) {
            InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
            View first = null;
            if (interfaceC1107590evd != null) {
                C1872780ypo.LIZ.getClass();
                CartRefreshEvent cartRefreshEventLIZ = C049Q.LIZ(C786410Ut5.J3(C1872780ypo.LIZIZ(interfaceC1107590evd)));
                if (cartRefreshEventLIZ != null && (num = cartRefreshEventLIZ.count) != null) {
                    int iIntValue = num.intValue();
                    Pair<? extends View, ? extends SearchBffItem> pair = this.LLJJLIIIJLLLLLLLZ.get(1008);
                    if (pair != null) {
                        first = pair.getFirst();
                    }
                    if ((first instanceof FrameLayout) && (viewGroup = (ViewGroup) first) != null) {
                        int childCount = viewGroup.getChildCount();
                        int i = 0;
                        while (true) {
                            if (i >= childCount) {
                                break;
                            }
                            View childAt = viewGroup.getChildAt(i);
                            if (childAt instanceof C0GYM) {
                                if (childAt.isAttachedToWindow() && childAt.getContext() != null) {
                                    HandlerHook.viewPost(childAt, new ARunnableS17S0201000_10(iIntValue, childAt, this, 1));
                                } else {
                                    return;
                                }
                            } else {
                                i++;
                            }
                        }
                    }
                    String str = cartRefreshEventLIZ.toast;
                    if (str != null && (c19egLIZ = C724240Sb0.LIZ(this)) != null) {
                        C1389880mGw c1389880mGw = new C1389880mGw(c19egLIZ);
                        c1389880mGw.LJIIIZ(str);
                        c1389880mGw.LJ(R.raw.icon_tick);
                        c1389880mGw.LJFF(-1);
                        c1389880mGw.LJIIJ();
                    }
                }
            }
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        SearchResultParam searchResultParamLIZJ;
        C0HA4 c0ha4LIZIZ;
        C679100QkO c679100QkOLIZ;
        InterfaceC679310Qkj interfaceC679310Qkj;
        InterfaceC679310Qkj interfaceC679310Qkj2;
        InterfaceC679310Qkj interfaceC679310Qkj3;
        super.onViewCreated(view);
        boolean z = true;
        this.LLJJ = true;
        ef0().setLayoutVariant(0);
        C1559260qg8 c1559260qg8 = new C1559260qg8(new C723580SZw(this, C675970QfL.class, "key_mix_shop_assem_page_data"), checkSupervisorPrepared());
        C675970QfL c675970QfL = (C675970QfL) c1559260qg8.getValue();
        Integer numValueOf = null;
        if (c675970QfL != null && (interfaceC679310Qkj3 = c675970QfL.LLILLJJLI) != null) {
            searchResultParamLIZJ = interfaceC679310Qkj3.LIZJ();
        } else {
            searchResultParamLIZJ = null;
        }
        this.LLJILLL = searchResultParamLIZJ;
        C675970QfL c675970QfL2 = (C675970QfL) c1559260qg8.getValue();
        if (c675970QfL2 != null && (interfaceC679310Qkj2 = c675970QfL2.LLILLJJLI) != null) {
            c0ha4LIZIZ = interfaceC679310Qkj2.LIZIZ();
        } else {
            c0ha4LIZIZ = null;
        }
        this.LLIZLLLIL = c0ha4LIZIZ;
        C675970QfL c675970QfL3 = (C675970QfL) c1559260qg8.getValue();
        if (c675970QfL3 != null && (interfaceC679310Qkj = c675970QfL3.LLILLJJLI) != null) {
            c679100QkOLIZ = interfaceC679310Qkj.LIZ();
        } else {
            c679100QkOLIZ = null;
        }
        this.LLJJI = c679100QkOLIZ;
        C675970QfL c675970QfL4 = (C675970QfL) c1559260qg8.getValue();
        if (c675970QfL4 != null && c675970QfL4.LL == EnumC675750Qez.LOADING_STYLE_SKELETON.getValue()) {
            ISearchContainerTypeAbility iSearchContainerTypeAbility = (ISearchContainerTypeAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ISearchContainerTypeAbility.class, null);
            if (iSearchContainerTypeAbility != null) {
                numValueOf = Integer.valueOf(iSearchContainerTypeAbility.getContainerType());
            } else {
                ISearchResultSubPageContextAbility iSearchResultSubPageContextAbility = (ISearchResultSubPageContextAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ISearchResultSubPageContextAbility.class, null);
                if (iSearchResultSubPageContextAbility != null) {
                    numValueOf = Integer.valueOf(iSearchResultSubPageContextAbility.getContainerType());
                }
            }
            Context context = view.getContext();
            int value = C0QQZ.DEFAULT.getValue();
            if (numValueOf == null || numValueOf.intValue() != value) {
                int value2 = C0QQZ.SIMPLE.getValue();
                if (numValueOf == null || numValueOf.intValue() != value2) {
                    z = false;
                }
            }
            C428840Gri c428840Gri = new C428840Gri(context, z);
            this.LLJ = c428840Gri;
            ef0().LIZIZ(c428840Gri);
            if (c428840Gri.getLayoutParams() != null) {
                C426750GoL.LJIIIZ(c428840Gri, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), false, 16);
            }
        }
        No().LLJJIJIL.observe(this, new AObserverS214S0100000_10(this, 7));
        C736680Sv4.LJIIIIZZ(this, Lo(), new C2217381BqS() { // from class: X.0QjF
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C678270Qj3) obj).LL;
            }
        }, null, new AwS624S0100000_10(this, 7), 6);
        No().LLJJ.observe(this, new AObserverS214S0100000_10(this, 8));
        No().LLJJI.observe(this, new AObserverS214S0100000_10(this, 3));
        Lo().LLILZIL.observe(this, new AObserverS214S0100000_10(this, 4));
        No().LLJJIII.observe(this, new AObserverS214S0100000_10(this, 5));
        No().LLJJIJI.observe(this, new AObserverS214S0100000_10(this, 6));
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLIZLLLIL;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            viewOnAttachStateChangeListenerC20604515jv.addOnScrollListener(this.LLJL);
        }
    }

    public static AnimatorSet Vo(View view, float f) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "translationX", view.getTranslationX(), f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new AccelerateInterpolator());
        animatorSet.setDuration(650L);
        animatorSet.playTogether(objectAnimatorOfFloat);
        return animatorSet;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Go(androidx.recyclerview.widget.RecyclerView r10, boolean r11) {
        /*
            Method dump skipped, instruction units count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.search.page.mix.MixFloatingLayerAssem.Go(androidx.recyclerview.widget.RecyclerView, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:170:0x0053 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x011e A[Catch: all -> 0x0126, PHI: r14
      0x011e: PHI (r14v9 java.lang.Integer) = (r14v1 java.lang.Integer), (r14v2 java.lang.Integer) binds: [B:64:0x010d, B:70:0x011c] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #1 {all -> 0x0126, blocks: (B:71:0x011e, B:67:0x0112, B:69:0x0118), top: B:168:0x0112 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Ho(com.ss.android.ugc.aweme.ecommerce.arch.SearchBffItem r18, X.C677890QiR r19) {
        /*
            Method dump skipped, instruction units count: 888
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.search.page.mix.MixFloatingLayerAssem.Ho(com.ss.android.ugc.aweme.ecommerce.arch.SearchBffItem, X.0QiR):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.String] */
    public final C1537720q7O Oo(SearchBffItem searchBffItem, C1537720q7O c1537720q7O) {
        n nVar;
        String strLJFF;
        String strLIZ;
        long jLongValue;
        k kVar = searchBffItem.data;
        if (!(kVar instanceof n) || (nVar = (n) kVar) == null) {
            return c1537720q7O;
        }
        C259800zU c259800zU = new C259800zU();
        String str = "";
        c259800zU.element = "";
        ?? LIZLLL = C12869051v.LIZLLL(nVar, "lynx_card_key");
        if (LIZLLL == 0) {
            strLJFF = "";
            strLIZ = "";
        } else {
            c259800zU.element = LIZLLL;
            strLJFF = C677490Qhn.LIZJ(LIZLLL);
            strLIZ = C677490Qhn.LIZ((String) c259800zU.element);
        }
        String strLIZLLL = C12869051v.LIZLLL(nVar, "raw_data");
        if (strLIZLLL != null) {
            str = strLIZLLL;
        }
        Long lLIZJ = C12869051v.LIZJ(nVar, "height");
        if (lLIZJ != null) {
            jLongValue = lLIZJ.longValue();
        } else {
            jLongValue = 0;
        }
        Long lLIZJ2 = C12869051v.LIZJ(nVar, "width");
        if (lLIZJ2 != null) {
            lLIZJ2.longValue();
        }
        TemplateData templateDataLJIIIIZZ = TemplateData.LJIIIIZZ(str);
        if (strLIZ.length() > 0) {
            strLJFF = new C0XI4(strLJFF).LJFF();
        }
        C679540Ql6 c679540Ql6 = new C679540Ql6(searchBffItem.id, templateDataLJIIIIZZ, Boolean.TRUE, null, Integer.valueOf((int) jLongValue), null, null, null, strLJFF, new AwS376S0200000_10(this, (MixFloatingLayerAssem) c259800zU, (C259800zU<String>) 15), 27092);
        c679540Ql6.LIZLLL = new C689770R3v(searchBffItem, this, 0);
        return Lo().vQ2().LJIILIIL(c679540Ql6, c1537720q7O);
    }
}
