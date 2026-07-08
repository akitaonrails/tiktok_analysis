package kotlin.jvm.internal;

import X.C09AY;
import X.C0P7A;
import X.C0PCX;
import X.C0PHT;
import X.C0PHZ;
import X.C0PN8;
import X.C0PSG;
import X.C0RTA;
import X.C13LE;
import X.C1537480q70;
import X.C1537830q7Z;
import X.C1619980sG4;
import X.C20684815ws;
import X.C2344009Gk;
import X.C238400w2;
import X.C259800zU;
import X.C430890Gv1;
import X.C640160P9a;
import X.C640970PCd;
import X.C642240PHa;
import X.C642350PHl;
import X.C642440PHu;
import X.C647380PaK;
import X.C647810Pb1;
import X.C654040Pl4;
import X.C654050Pl5;
import X.C654080Pl8;
import X.C654210PlL;
import X.C654290PlT;
import X.C656610PpD;
import X.C786410Ut5;
import X.EnumC654440Pli;
import X.InterfaceC1541990qEH;
import X.InterfaceC655050Pmh;
import X.InterfaceC676430Qg5;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelKt;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.core.Assembler;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.discover.model.GlobalDoodleConfig;
import com.ss.android.ugc.aweme.ecommerce.search.vision.EComPhotoSearchServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.topbar.hub.viewmodel.SearchHubNativeViewModel;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.parser.SearchBuiltInFeedbackAssem;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.parser.SearchSingleCardTemplateAssem;
import com.ss.android.ugc.aweme.search.pages.common.theme.activitybg.SearchActivityCardBgController;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.EntityCardTitle;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.GameInfo;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.viewmodel.SearchRefreshPredictMobCanShowVM;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes11.dex */
public class AwS108S0400000_10 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS108S0400000_10 awS108S0400000_10, Object obj) {
        C0RTA c0rta = (C0RTA) obj;
        Assembler assembler = (Assembler) awS108S0400000_10.l0;
        SearchSingleCardTemplateAssem searchSingleCardTemplateAssem = (SearchSingleCardTemplateAssem) awS108S0400000_10.l1;
        assembler.EQ2(searchSingleCardTemplateAssem, new AwS376S0200000_10((C656610PpD) awS108S0400000_10.l3, (C656610PpD<InterfaceC655050Pmh>) searchSingleCardTemplateAssem, (SearchSingleCardTemplateAssem<InterfaceC655050Pmh>) 31));
        c0rta.LLILLL = C13LE.LIZ(SearchBuiltInFeedbackAssem.class);
        c0rta.LLJILJIL = (View) awS108S0400000_10.l2;
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS108S0400000_10 awS108S0400000_10, Object obj) {
        int iIntValue = ((Number) obj).intValue();
        ((SearchActivityCardBgController) awS108S0400000_10.l0).LIZLLL((C640160P9a) awS108S0400000_10.l1, (GlobalDoodleConfig) awS108S0400000_10.l2, (RecyclerView) awS108S0400000_10.l3);
        C640160P9a value = ((SearchActivityCardBgController) awS108S0400000_10.l0).LIZ().xQ2().getValue();
        if (value != null) {
            new C640160P9a(value.LIZIZ, value.LIZJ, value.LIZLLL, value.LIZ);
            ((LiveData) ((SearchActivityCardBgController) awS108S0400000_10.l0).LIZ().LLJIJIL.getValue()).postValue(Integer.valueOf(iIntValue));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS108S0400000_10 awS108S0400000_10, Object obj) {
        Function0 function0 = (Function0) awS108S0400000_10.l0;
        if (function0 != null) {
            function0.invoke();
        }
        ((EComPhotoSearchServiceImpl) awS108S0400000_10.l1).LJII((Context) awS108S0400000_10.l2, (InterfaceC676430Qg5) awS108S0400000_10.l3);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS108S0400000_10 awS108S0400000_10, Object obj) {
        boolean z;
        boolean z2;
        Set<Integer> set;
        C642440PHu c642440PHu = (C642440PHu) obj;
        c642440PHu.LIZLLL = String.valueOf(((SearchMixFeed) awS108S0400000_10.l0).retrieveIncrementalId());
        Iterator it2 = ((ArrayList) C0PN8.LJJI(Collections.singletonList((SearchMixFeed) awS108S0400000_10.l0))).iterator();
        while (it2.hasNext()) {
            c642440PHu.LIZLLL(new AwS589S0100000_10((Aweme) it2.next(), 434));
        }
        Object obj2 = (SearchMixFeed) awS108S0400000_10.l0;
        if (obj2 instanceof C642240PHa) {
            c642440PHu.LJFF = (C642240PHa) obj2;
        }
        C0P7A c0p7a = c642440PHu.LIZIZ.LJIIIZ;
        String str = c642440PHu.LIZLLL;
        C640970PCd c640970PCd = c0p7a.LIZ.get(C13LE.LIZ(SearchMixFeed.class));
        if (c640970PCd == null) {
            c640970PCd = new C640970PCd();
            c0p7a.LIZ.put(C13LE.LIZ(SearchMixFeed.class), c640970PCd);
        }
        HashMap<String, Object> map = c640970PCd.LIZ;
        if (map != null) {
            map.put(str, obj2);
        }
        if (((SearchMixFeed) awS108S0400000_10.l0).getFeedType() == 65280) {
            z = true;
        } else {
            z = false;
        }
        C642350PHl c642350PHl = C642350PHl.LIZ;
        SearchMixFeed searchMixFeed = (SearchMixFeed) awS108S0400000_10.l0;
        c642350PHl.getClass();
        if (searchMixFeed.getFeedType() != 65280) {
            z2 = true;
        } else {
            z2 = false;
        }
        c642440PHu.LIZJ(new C0PHZ((SearchMixFeed) awS108S0400000_10.l0, (C0PSG) awS108S0400000_10.l2, (C0PHT) awS108S0400000_10.l3, z, z2));
        C0PCX c0pcx = (C0PCX) awS108S0400000_10.l1;
        if (c0pcx != null && (set = c0pcx.LL) != null) {
            c642440PHu.LJI = Boolean.valueOf(set.contains(Integer.valueOf(((SearchMixFeed) awS108S0400000_10.l0).retrieveIncrementalId())));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* bridge */ /* synthetic */ Object invoke$4(AwS108S0400000_10 awS108S0400000_10, Object obj) {
        SearchMixFeed searchMixFeed;
        C654080Pl8 c654080Pl8LIZ;
        String str;
        int i;
        C654080Pl8 c654080Pl8TryGetMobParams;
        Integer num;
        SearchMixFeed searchMixFeed2;
        if (!((C654210PlL) awS108S0400000_10.l0).LLJILJIL) {
            C654080Pl8 c654080Pl8LIZ2 = null;
            GameInfo gameInfo = null;
            num = null;
            Integer num2 = null;
            if (((C430890Gv1) awS108S0400000_10.l1).LLJZIJLIL && !C654290PlT.LIZ()) {
                C430890Gv1 c430890Gv1 = (C430890Gv1) awS108S0400000_10.l1;
                final boolean z = c430890Gv1.LLJLLL;
                final int height = c430890Gv1.getHeight();
                EntityCardTitle entityCardTitle = (EntityCardTitle) ((C259800zU) awS108S0400000_10.l2).element;
                if (entityCardTitle != null && (c654080Pl8TryGetMobParams = entityCardTitle.tryGetMobParams()) != null) {
                    SearchHubNativeViewModel searchHubNativeViewModel = ((C654210PlL) awS108S0400000_10.l0).LLILZIL;
                    if (searchHubNativeViewModel != null && (searchMixFeed2 = searchHubNativeViewModel.LLIZ) != null) {
                        num = searchMixFeed2.universalRank;
                    } else {
                        num = null;
                    }
                    gameInfo = null;
                    c654080Pl8LIZ = C654080Pl8.LIZ(c654080Pl8TryGetMobParams, null, num, null, null, null, 3839);
                } else {
                    c654080Pl8LIZ = null;
                }
                C654050Pl5 c654050Pl5 = C654050Pl5.LIZ;
                EntityCardTitle entityCardTitle2 = (EntityCardTitle) ((C259800zU) awS108S0400000_10.l2).element;
                if (entityCardTitle2 != null) {
                    gameInfo = entityCardTitle2.gameInfo;
                }
                if (z) {
                    str = "click_abstract_less";
                } else {
                    str = "click_abstract_more";
                }
                C654050Pl5.LJ(c654050Pl5, c654080Pl8LIZ, gameInfo, str, null, null, 52);
                if (z) {
                    i = ((C654210PlL) awS108S0400000_10.l0).LLJILJILJ;
                } else {
                    ((C654210PlL) awS108S0400000_10.l0).LJIIIZ();
                    i = ((C654210PlL) awS108S0400000_10.l0).LLJILLL;
                    if (i <= 0) {
                        ((C430890Gv1) awS108S0400000_10.l1).measure(View.MeasureSpec.makeMeasureSpec(((C430890Gv1) awS108S0400000_10.l1).getWidth(), 1073741824), 0);
                        ((C654210PlL) awS108S0400000_10.l0).LLJILLL = ((C430890Gv1) awS108S0400000_10.l1).getMeasuredHeight();
                        i = ((C654210PlL) awS108S0400000_10.l0).LLJILLL;
                    }
                }
                C430890Gv1 c430890Gv12 = (C430890Gv1) awS108S0400000_10.l1;
                ViewGroup.LayoutParams layoutParams = c430890Gv12.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = height;
                    C786410Ut5.W5(c430890Gv12, layoutParams);
                    C654210PlL c654210PlL = (C654210PlL) awS108S0400000_10.l0;
                    ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(height, i);
                    final C430890Gv1 c430890Gv13 = (C430890Gv1) awS108S0400000_10.l1;
                    final C654210PlL c654210PlL2 = (C654210PlL) awS108S0400000_10.l0;
                    valueAnimatorOfInt.setDuration(200L);
                    valueAnimatorOfInt.setInterpolator(C1619980sG4.LJI());
                    valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0PlR
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            int iIntValue;
                            Integer num3;
                            Object animatedValue = valueAnimator.getAnimatedValue();
                            if ((animatedValue instanceof Integer) && (num3 = (Integer) animatedValue) != null) {
                                iIntValue = num3.intValue();
                            } else {
                                iIntValue = height;
                            }
                            C430890Gv1 c430890Gv14 = c430890Gv13;
                            ViewGroup.LayoutParams layoutParams2 = c430890Gv14.getLayoutParams();
                            if (layoutParams2 != null) {
                                layoutParams2.height = iIntValue;
                                C786410Ut5.W5(c430890Gv14, layoutParams2);
                                return;
                            }
                            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                        }
                    });
                    valueAnimatorOfInt.addListener(new Animator.AnimatorListener() { // from class: X.0PlS
                        @Override // android.animation.Animator.AnimatorListener
                        public final void onAnimationRepeat(Animator animator) {
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public final void onAnimationCancel(Animator animator) {
                            C654210PlL c654210PlL3 = c654210PlL2;
                            c654210PlL3.LLJILJIL = false;
                            if (z) {
                                c654210PlL3.LJIIIZ();
                            }
                            C430890Gv1 c430890Gv14 = c430890Gv13;
                            ViewGroup.LayoutParams layoutParams2 = c430890Gv14.getLayoutParams();
                            if (layoutParams2 != null) {
                                layoutParams2.height = -2;
                                C786410Ut5.W5(c430890Gv14, layoutParams2);
                                return;
                            }
                            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public final void onAnimationEnd(Animator animator) {
                            C654210PlL c654210PlL3 = c654210PlL2;
                            c654210PlL3.LLJILJIL = false;
                            if (z) {
                                c654210PlL3.LJIIIZ();
                            }
                            C430890Gv1 c430890Gv14 = c430890Gv13;
                            ViewGroup.LayoutParams layoutParams2 = c430890Gv14.getLayoutParams();
                            if (layoutParams2 != null) {
                                layoutParams2.height = -2;
                                C786410Ut5.W5(c430890Gv14, layoutParams2);
                                return;
                            }
                            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public final void onAnimationStart(Animator animator) {
                            c654210PlL2.LLJILJIL = true;
                        }
                    });
                    c654210PlL.LLJIJIL = valueAnimatorOfInt;
                    ValueAnimator valueAnimator = ((C654210PlL) awS108S0400000_10.l0).LLJIJIL;
                    if (valueAnimator != null) {
                        valueAnimator.start();
                    }
                    C654210PlL.LJIIL((C654210PlL) awS108S0400000_10.l0);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
            } else {
                EntityCardTitle entityCardTitle3 = (EntityCardTitle) ((C259800zU) awS108S0400000_10.l2).element;
                if (entityCardTitle3 != null) {
                    C654210PlL c654210PlL3 = (C654210PlL) awS108S0400000_10.l0;
                    Context context = (Context) awS108S0400000_10.l3;
                    C654080Pl8 c654080Pl8TryGetMobParams2 = entityCardTitle3.tryGetMobParams();
                    if (c654080Pl8TryGetMobParams2 != null) {
                        SearchHubNativeViewModel searchHubNativeViewModel2 = c654210PlL3.LLILZIL;
                        if (searchHubNativeViewModel2 != null && (searchMixFeed = searchHubNativeViewModel2.LLIZ) != null) {
                            num2 = searchMixFeed.universalRank;
                        }
                        c654080Pl8LIZ2 = C654080Pl8.LIZ(c654080Pl8TryGetMobParams2, null, num2, null, null, null, 3839);
                    }
                    C654050Pl5.LJ(C654050Pl5.LIZ, c654080Pl8LIZ2, entityCardTitle3.gameInfo, "click_info_abstract", null, null, 52);
                    SearchHubNativeViewModel searchHubNativeViewModel3 = c654210PlL3.LLILZIL;
                    if (searchHubNativeViewModel3 != null) {
                        EnumC654440Pli enumC654440Pli = EnumC654440Pli.COMMON;
                        ViewModelKt.getViewModelScope(searchHubNativeViewModel3);
                        C654040Pl4.LIZIZ(context, enumC654440Pli, entityCardTitle3);
                    }
                }
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$5(AwS108S0400000_10 awS108S0400000_10, Object obj) {
        T t;
        ((Number) obj).longValue();
        if (((C238400w2) awS108S0400000_10.l0).element > 0) {
            long jCurrentTimeMillis = System.currentTimeMillis() - ((C238400w2) awS108S0400000_10.l0).element;
            if (jCurrentTimeMillis > 0 && ((t = ((C259800zU) awS108S0400000_10.l1).element) == 0 || ((SearchRefreshPredictMobCanShowVM) t).a32())) {
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LIZLLL(jCurrentTimeMillis, "duration");
                c2344009Gk.LJII((Map) ((Function0) awS108S0400000_10.l2).invoke());
                c2344009Gk.LJII((Map) ((Function0) awS108S0400000_10.l3).invoke());
                C20684815ws.LJIILLIIL("search_card_stay_duration", c2344009Gk.LIZ);
                ((C238400w2) awS108S0400000_10.l0).element = -1L;
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS108S0400000_10 awS108S0400000_10, Object obj) {
        C647380PaK c647380PaK = C647380PaK.LJIIIIZZ;
        DynamicPatch dynamicPatch = (DynamicPatch) awS108S0400000_10.l0;
        C1537480q70 hybridContext = ((InterfaceC1541990qEH) awS108S0400000_10.l1).getHybridContext();
        c647380PaK.getClass();
        TemplateData templateDataLIZIZ = C647380PaK.LIZIZ(dynamicPatch, (Map) obj, hybridContext);
        templateDataLIZIZ.LJIILIIL("lynxRealLoadUpdateTime", String.valueOf(System.currentTimeMillis()));
        ((C647810Pb1) awS108S0400000_10.l2).LL.LJJ = String.valueOf(System.currentTimeMillis());
        C1537830q7Z c1537830q7Z = (C1537830q7Z) awS108S0400000_10.l3;
        if (c1537830q7Z != null) {
            c1537830q7Z.LJIJJ = templateDataLIZIZ;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS108S0400000_10(C238400w2 c238400w2, C238400w2 c238400w22, C259800zU<SearchRefreshPredictMobCanShowVM> c259800zU, Function0<? extends Map<String, String>> function0, Function0<? extends Map<String, String>> function02) {
        super(1);
        this.$t = function02;
        this.l0 = c238400w2;
        this.l1 = c238400w22;
        this.l2 = c259800zU;
        this.l3 = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS108S0400000_10(C654210PlL c654210PlL, C654210PlL c654210PlL2, C430890Gv1 c430890Gv1, C259800zU<EntityCardTitle> c259800zU, Context context) {
        super(1);
        this.$t = context;
        this.l0 = c654210PlL;
        this.l1 = c654210PlL2;
        this.l2 = c430890Gv1;
        this.l3 = c259800zU;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS108S0400000_10(RecyclerView recyclerView, GlobalDoodleConfig globalDoodleConfig, SearchActivityCardBgController searchActivityCardBgController, C640160P9a c640160P9a, int i) {
        super(1);
        this.$t = i;
        this.l0 = searchActivityCardBgController;
        this.l1 = c640160P9a;
        this.l2 = globalDoodleConfig;
        this.l3 = recyclerView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS108S0400000_10(Assembler assembler, Assembler assembler2, SearchSingleCardTemplateAssem<InterfaceC655050Pmh> searchSingleCardTemplateAssem, View view, C656610PpD<InterfaceC655050Pmh> c656610PpD) {
        super(1);
        this.$t = c656610PpD;
        this.l0 = assembler;
        this.l1 = assembler2;
        this.l2 = searchSingleCardTemplateAssem;
        this.l3 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS108S0400000_10(DynamicPatch dynamicPatch, InterfaceC1541990qEH interfaceC1541990qEH, C647810Pb1 c647810Pb1, C1537830q7Z c1537830q7Z, int i) {
        super(1);
        this.$t = i;
        this.l0 = dynamicPatch;
        this.l1 = interfaceC1541990qEH;
        this.l2 = c647810Pb1;
        this.l3 = c1537830q7Z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS108S0400000_10(SearchMixFeed searchMixFeed, C0PCX c0pcx, C0PSG c0psg, C0PHT c0pht, int i) {
        super(1);
        this.$t = i;
        this.l0 = searchMixFeed;
        this.l1 = c0pcx;
        this.l2 = c0psg;
        this.l3 = c0pht;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS108S0400000_10(Function0 function0, Function0<Unit> function02, EComPhotoSearchServiceImpl eComPhotoSearchServiceImpl, Context context, InterfaceC676430Qg5 interfaceC676430Qg5) {
        super(1);
        this.$t = interfaceC676430Qg5;
        this.l0 = function0;
        this.l1 = function02;
        this.l2 = eComPhotoSearchServiceImpl;
        this.l3 = context;
    }
}
