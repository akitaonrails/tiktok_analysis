package kotlin.jvm.internal;

import X.C09AY;
import X.C09UZ;
import X.C0QGB;
import X.C0QNF;
import X.C123100dR;
import X.C1391190mJ3;
import X.C13LQ;
import X.C19719612Di;
import X.C21415018rM;
import X.C343970De7;
import X.C444830HcP;
import X.C649290PdP;
import X.C649490Pdj;
import X.C650520PfO;
import X.C652390PiP;
import X.C652890PjD;
import X.C653070PjV;
import X.C669090QMh;
import X.C672200QYg;
import X.C683820Qs0;
import X.C689760R3u;
import X.C786410Ut5;
import X.EnumC684990Qtt;
import X.InterfaceC1541990qEH;
import X.InterfaceC641090PCp;
import X.InterfaceC652950PjJ;
import X.InterfaceC683840Qs2;
import X.InterfaceC685100Qu4;
import Y.ARunnableS7S0500000_10;
import android.content.Context;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import com.bytedance.keva.Keva;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.lynx.tasm.LynxView;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.ecommerce.search.suggest.feedback.EcommerceSearchMiddleFeedback;
import com.ss.android.ugc.aweme.ecommerce.search.utils.EcIntermediatePreload;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import com.ss.android.ugc.aweme.search.pages.result.nimble.ui.component.base.SearchNimbleBaseAssem;
import com.ss.android.ugc.aweme.search.pages.result.nimble.v2.component.Top1NimbleBaseAssem;
import com.ss.android.ugc.aweme.search.pages.result.pov.ISearchPovCardAbility;
import com.ss.android.ugc.aweme.search.performance.metrics.SearchMiddleMonitor;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes11.dex */
public class AwS139S0400000_10 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS139S0400000_10 awS139S0400000_10) {
        ISearchPovCardAbility iSearchPovCardAbility;
        String str;
        if (!((SearchNimbleBaseAssem) awS139S0400000_10.l0).Ap()) {
            SearchNimbleBaseAssem searchNimbleBaseAssem = (SearchNimbleBaseAssem) awS139S0400000_10.l0;
            if (searchNimbleBaseAssem.op(searchNimbleBaseAssem.tp()) && (iSearchPovCardAbility = (ISearchPovCardAbility) ((SearchNimbleBaseAssem) awS139S0400000_10.l0).LLJLL.getValue()) != null) {
                EnumC684990Qtt enumC684990Qtt = (EnumC684990Qtt) awS139S0400000_10.l1;
                Function0 function0 = (Function0) awS139S0400000_10.l2;
                Map<String, ? extends Object> map = null;
                if (function0 != null) {
                    str = (String) function0.invoke();
                } else {
                    str = null;
                }
                Function0 function02 = (Function0) awS139S0400000_10.l3;
                if (function02 != null) {
                    map = (Map) function02.invoke();
                }
                iSearchPovCardAbility.Ty1(enumC684990Qtt, str, map);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS139S0400000_10 awS139S0400000_10) {
        C683820Qs0 c683820Qs0 = (C683820Qs0) awS139S0400000_10.l0;
        String type = ((EcommerceSearchMiddleFeedback.FeedbackQuestion) awS139S0400000_10.l1).getType();
        c683820Qs0.getClass();
        boolean zLJFF = Intrinsics.LJFF(type, "image");
        String wordContent = ((InterfaceC683840Qs2) awS139S0400000_10.l2).getWordContent();
        String productId = ((InterfaceC683840Qs2) awS139S0400000_10.l2).getProductId();
        if (zLJFF && C123100dR.LIZ(productId)) {
            List listLJLI = C13LQ.LJLI(Keva.getRepo("ecommerce_search_repo").getStringArray("ec_search_middle_feedback_products", new String[0]));
            ArrayList arrayList = (ArrayList) listLJLI;
            if (arrayList.size() >= 10) {
                C19719612Di.LJJIIZ(listLJLI);
            }
            arrayList.add(productId);
            Keva.getRepo("ecommerce_search_repo").storeStringArray("ec_search_middle_feedback_products", (String[]) arrayList.toArray(new String[0]));
        } else {
            List listLJLI2 = C13LQ.LJLI(Keva.getRepo("ecommerce_search_repo").getStringArray("ec_search_middle_feedback_words", new String[0]));
            ArrayList arrayList2 = (ArrayList) listLJLI2;
            if (arrayList2.size() >= 10) {
                C19719612Di.LJJIIZ(listLJLI2);
            }
            arrayList2.add(wordContent);
            Keva.getRepo("ecommerce_search_repo").storeStringArray("ec_search_middle_feedback_words", (String[]) arrayList2.toArray(new String[0]));
        }
        C672200QYg.LIZ = null;
        C672200QYg.LIZJ.clear();
        EcIntermediatePreload.Companion.getClass();
        EcIntermediatePreload.suggestPreResponseStr = null;
        Keva.getRepo("ecommerce_search_repo").storeStringArray("ecommerce_suggest_words", new String[0]);
        String str = TuxSheet._pnsPageId;
        C1391190mJ3.LJ((LinearLayout) awS139S0400000_10.l3, C343970De7.LIZ);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$2(AwS139S0400000_10 awS139S0400000_10) {
        C786410Ut5.LJJJJI(((C653070PjV) awS139S0400000_10.l0).LLJIJIL);
        ViewGroup viewGroup = (ViewGroup) ((View) awS139S0400000_10.l1);
        InterfaceC641090PCp interfaceC641090PCp = (InterfaceC641090PCp) awS139S0400000_10.l2;
        InterfaceC652950PjJ interfaceC652950PjJ = (InterfaceC652950PjJ) awS139S0400000_10.l3;
        C650520PfO.LIZ.getClass();
        C652390PiP c652390PiP = new C652390PiP(C650520PfO.LIZ(R.layout.f903f17, viewGroup));
        C652890PjD c652890PjD = new C652890PjD(c652390PiP, interfaceC641090PCp, interfaceC652950PjJ);
        ((C653070PjV) awS139S0400000_10.l0).LLJIJIL.addView(c652390PiP.itemView);
        ((C653070PjV) awS139S0400000_10.l0).Lw(c652890PjD);
        c652890PjD.LJIIIZ().LLJIJIL = (C653070PjV) awS139S0400000_10.l0;
        return c652890PjD;
    }

    public static final Object invoke$3(AwS139S0400000_10 awS139S0400000_10) {
        CharSequence charSequenceLIZIZ = C0QNF.LIZIZ((SearchSugEntity) awS139S0400000_10.l0, ((C21415018rM) awS139S0400000_10.l1).getContext());
        CharSequence charSequenceLIZ = C0QNF.LIZ((SearchSugEntity) awS139S0400000_10.l0, ((C21415018rM) awS139S0400000_10.l1).getContext());
        if (((SpannableStringBuilder) charSequenceLIZIZ).length() > 0) {
            C444830HcP c444830HcP = new C444830HcP();
            c444830HcP.LJIILIIL(charSequenceLIZIZ);
            c444830HcP.LIZLLL = false;
            Layout layoutLIZIZ = c444830HcP.LIZIZ();
            C669090QMh c669090QMh = C669090QMh.LIZ;
            SearchSugEntity searchSugEntity = (SearchSugEntity) awS139S0400000_10.l0;
            Context context = ((C21415018rM) awS139S0400000_10.l1).getContext();
            c669090QMh.getClass();
            int iLJFF = C669090QMh.LJFF(searchSugEntity, context) - layoutLIZIZ.getWidth();
            SearchSugEntity searchSugEntity2 = (SearchSugEntity) awS139S0400000_10.l0;
            Context context2 = ((C21415018rM) awS139S0400000_10.l1).getContext();
            c669090QMh.getClass();
            SpannableStringBuilder spannableStringBuilderAppend = new SpannableStringBuilder().append(C669090QMh.LIZJ(searchSugEntity2, charSequenceLIZ, context2, iLJFF, false).getText()).append(charSequenceLIZIZ);
            SearchSugEntity searchSugEntity3 = (SearchSugEntity) awS139S0400000_10.l0;
            Context context3 = ((C21415018rM) awS139S0400000_10.l1).getContext();
            c669090QMh.getClass();
            C09UZ.LIZJ(new ARunnableS7S0500000_10((LinearLayout) awS139S0400000_10.l2, (C21415018rM) awS139S0400000_10.l1, C669090QMh.LIZJ(searchSugEntity3, spannableStringBuilderAppend, context3, -1, false), C669090QMh.LJ((SearchSugEntity) awS139S0400000_10.l0, ((C21415018rM) awS139S0400000_10.l1).getContext(), iLJFF), (C21415018rM) awS139S0400000_10.l3, 2));
        } else {
            C669090QMh c669090QMh2 = C669090QMh.LIZ;
            SearchSugEntity searchSugEntity4 = (SearchSugEntity) awS139S0400000_10.l0;
            Context context4 = ((C21415018rM) awS139S0400000_10.l1).getContext();
            c669090QMh2.getClass();
            C09UZ.LIZJ(new ARunnableS7S0500000_10((LinearLayout) awS139S0400000_10.l2, (C21415018rM) awS139S0400000_10.l1, C669090QMh.LIZJ(searchSugEntity4, charSequenceLIZ, context4, -1, false), C669090QMh.LJ((SearchSugEntity) awS139S0400000_10.l0, ((C21415018rM) awS139S0400000_10.l1).getContext(), -1), (C21415018rM) awS139S0400000_10.l3, 3));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS139S0400000_10 awS139S0400000_10) {
        ISearchPovCardAbility iSearchPovCardAbility;
        String str;
        if (!((Top1NimbleBaseAssem) awS139S0400000_10.l0).zp()) {
            Top1NimbleBaseAssem top1NimbleBaseAssem = (Top1NimbleBaseAssem) awS139S0400000_10.l0;
            if (top1NimbleBaseAssem.op(top1NimbleBaseAssem.tp()) && (iSearchPovCardAbility = (ISearchPovCardAbility) ((Top1NimbleBaseAssem) awS139S0400000_10.l0).LLJLIL.getValue()) != null) {
                EnumC684990Qtt enumC684990Qtt = (EnumC684990Qtt) awS139S0400000_10.l1;
                Function0 function0 = (Function0) awS139S0400000_10.l2;
                Map<String, ? extends Object> map = null;
                if (function0 != null) {
                    str = (String) function0.invoke();
                } else {
                    str = null;
                }
                Function0 function02 = (Function0) awS139S0400000_10.l3;
                if (function02 != null) {
                    map = (Map) function02.invoke();
                }
                iSearchPovCardAbility.Ty1(enumC684990Qtt, str, map);
            }
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$5(AwS139S0400000_10 awS139S0400000_10) {
        C649290PdP c649290PdP;
        C689760R3u c689760R3u;
        C649290PdP c649290PdP2 = (C649290PdP) awS139S0400000_10.l0;
        if ((c649290PdP2 != null && c649290PdP2.LJIILLIIL && C649490Pdj.LIZ()) || !C649490Pdj.LIZ()) {
            ViewParent parent = ((View) ((InterfaceC1541990qEH) awS139S0400000_10.l1)).getParent();
            if (parent instanceof ViewGroup) {
                C786410Ut5.LJJJJI((ViewGroup) parent);
            }
            ViewGroup viewGroup = (ViewGroup) awS139S0400000_10.l2;
            if (viewGroup != null) {
                C786410Ut5.LJJJJI(viewGroup);
            }
        }
        C649490Pdj.LIZ.getClass();
        if (C649490Pdj.LIZIZ().enableRepostLoadSuccess == 1 && (c649290PdP = (C649290PdP) awS139S0400000_10.l0) != null && (c689760R3u = c649290PdP.LJIJJLI) != null) {
            c689760R3u.LJIILJJIL();
        }
        C649290PdP c649290PdP3 = (C649290PdP) awS139S0400000_10.l0;
        if (c649290PdP3 != null) {
            c649290PdP3.LJIILLIIL = true;
            c649290PdP3.LJIILL = true;
        }
        ViewGroup viewGroup2 = (ViewGroup) awS139S0400000_10.l2;
        if (viewGroup2 != null) {
            viewGroup2.addView((View) ((InterfaceC1541990qEH) awS139S0400000_10.l1), new ViewGroup.LayoutParams(-1, -1));
        }
        if (((InterfaceC1541990qEH) awS139S0400000_10.l1) instanceof LynxView) {
            SearchMiddleMonitor.INSTANCE.updateRecommend();
            ArrayList<TemplateData> arrayList = ((C0QGB) awS139S0400000_10.l3).LLILLL;
            Object obj = (InterfaceC1541990qEH) awS139S0400000_10.l1;
            for (TemplateData templateData : arrayList) {
                if (templateData != null) {
                    ((LynxView) obj).updateData(templateData);
                }
            }
            SearchMiddleMonitor.INSTANCE.updateRecommendEnd();
            C0QGB c0qgb = (C0QGB) awS139S0400000_10.l3;
            c0qgb.LLILLJJLI = null;
            c0qgb.LLILLL.clear();
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS139S0400000_10(C649290PdP c649290PdP, InterfaceC1541990qEH interfaceC1541990qEH, ViewGroup viewGroup, C0QGB c0qgb, int i) {
        super(0);
        this.$t = i;
        this.l0 = c649290PdP;
        this.l1 = interfaceC1541990qEH;
        this.l2 = viewGroup;
        this.l3 = c0qgb;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS139S0400000_10(C653070PjV c653070PjV, View view, InterfaceC641090PCp interfaceC641090PCp, InterfaceC652950PjJ interfaceC652950PjJ, int i) {
        super(0);
        this.$t = i;
        this.l0 = c653070PjV;
        this.l1 = view;
        this.l2 = interfaceC641090PCp;
        this.l3 = interfaceC652950PjJ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS139S0400000_10(C683820Qs0 c683820Qs0, EcommerceSearchMiddleFeedback.FeedbackQuestion feedbackQuestion, InterfaceC683840Qs2 interfaceC683840Qs2, LinearLayout linearLayout, int i) {
        super(0);
        this.$t = i;
        this.l0 = c683820Qs0;
        this.l1 = feedbackQuestion;
        this.l2 = interfaceC683840Qs2;
        this.l3 = linearLayout;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS139S0400000_10(LinearLayout linearLayout, C21415018rM c21415018rM, C21415018rM c21415018rM2, SearchSugEntity searchSugEntity, int i) {
        super(0);
        this.$t = i;
        this.l0 = searchSugEntity;
        this.l1 = c21415018rM;
        this.l2 = linearLayout;
        this.l3 = c21415018rM2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS139S0400000_10(SearchNimbleBaseAssem searchNimbleBaseAssem, SearchNimbleBaseAssem<Object> searchNimbleBaseAssem2, EnumC684990Qtt enumC684990Qtt, Function0<String> function0, Function0<? extends Map<String, ? extends Object>> function02) {
        super(0);
        this.$t = function02;
        this.l0 = searchNimbleBaseAssem;
        this.l1 = searchNimbleBaseAssem2;
        this.l2 = enumC684990Qtt;
        this.l3 = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS139S0400000_10(Top1NimbleBaseAssem top1NimbleBaseAssem, Top1NimbleBaseAssem<InterfaceC685100Qu4> top1NimbleBaseAssem2, EnumC684990Qtt enumC684990Qtt, Function0<String> function0, Function0<? extends Map<String, ? extends Object>> function02) {
        super(0);
        this.$t = function02;
        this.l0 = top1NimbleBaseAssem;
        this.l1 = top1NimbleBaseAssem2;
        this.l2 = enumC684990Qtt;
        this.l3 = function0;
    }
}
