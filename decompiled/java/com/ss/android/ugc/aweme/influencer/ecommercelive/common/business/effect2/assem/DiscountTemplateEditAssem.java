package com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.assem;

import X.AbstractC1387200mCc;
import X.C019F;
import X.C01D1;
import X.C03DZ;
import X.C07MW;
import X.C09R3;
import X.C0H9I;
import X.C0I7D;
import X.C1252710ihh;
import X.C13LE;
import X.C13LP;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1637906bB;
import X.C1723530ux5;
import X.C1730290v7z;
import X.C1730670v8b;
import X.C1730750v8j;
import X.C1730900v8y;
import X.C1730930v91;
import X.C1730950v93;
import X.C1731050v9D;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C290160BYw;
import X.C418440Gaw;
import X.C426160GnO;
import X.C426750GoL;
import X.C428440Gr4;
import X.C520040KaQ;
import X.C723590SZx;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1728430v4z;
import X.InterfaceC1730790v8n;
import X.InterfaceC2217461Bqa;
import X.InterfaceC459810I1j;
import X.ViewOnFocusChangeListenerC1713080ugE;
import X.ViewOnFocusChangeListenerC1730940v92;
import X.ViewOnFocusChangeListenerC1775860wJU;
import X.ViewOnLayoutChangeListenerC1775800wJO;
import android.content.Context;
import android.graphics.Rect;
import android.text.Editable;
import android.text.InputFilter;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.BillboardRichText;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.BillboardText;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.DiscountTemplateItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.RootData;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateField;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateFieldData;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateFieldPromotionInfo;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateFieldText;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.utils.FixedKeyboardMonitor;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.viewmodel.BillboardGlobalViewModel;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.viewmodel.DiscountTemplateEditViewModel;
import com.zhiliaoapp.musically.R;
import g1c.AjS8S0400000_26;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AFwS310S0000000_24;
import kotlin.jvm.internal.AwS392S0200000_26;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS640S0100000_26;
import kotlin.jvm.internal.AwS76S1000000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class DiscountTemplateEditAssem extends UISlotAssem implements InterfaceC1728430v4z, InterfaceC459810I1j {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJZIJLIL;
    public static final int LLL;
    public C428440Gr4 LLJJI;
    public ViewOnFocusChangeListenerC1730940v92 LLJJIII;
    public TuxTextView LLJJIJI;
    public C0I7D LLJJIJIIJIL;
    public TuxTextView LLJJIJIL;
    public ScrollView LLJJJ;
    public CardView LLJJJIL;
    public CardView LLJJJJ;
    public CardView LLJJJJJIL;
    public C426160GnO LLJJJJLIIL;
    public final C1559260qg8 LLJJL = new C1559260qg8(new C723590SZx(this, C1730750v8j.class, null), checkSupervisorPrepared());
    public final AssemVMLazy LLJJLIIIJLLLLLLLZ;
    public final AssemVMLazy LLJL;
    public final ViewOnFocusChangeListenerC1713080ugE LLJLIL;
    public final ViewOnFocusChangeListenerC1713080ugE LLJLILLLLZIIL;
    public InterfaceC1730790v8n LLJLL;
    public FixedKeyboardMonitor LLJLLIL;
    public C1730950v93 LLJLLL;
    public Map<String, Integer> LLJZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(DiscountTemplateEditAssem.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/influencer/ecommercelive/common/business/effect2/viewmodel/DiscountTemplateEditViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(DiscountTemplateEditAssem.class, "globalViewModel", "getGlobalViewModel()Lcom/ss/android/ugc/aweme/influencer/ecommercelive/common/business/effect2/viewmodel/BillboardGlobalViewModel;", 0);
        c09r3.getClass();
        LLJZIJLIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
        LLL = 8;
    }

    public DiscountTemplateEditAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(DiscountTemplateEditViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJJLIIIJLLLLLLLZ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS568S0100000_24(c19719912DlLIZ, 689), AFwS268S0000000_26.get$arr$(349), null, true);
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(BillboardGlobalViewModel.class);
        this.LLJL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c01d1, c1637906bB, new AwS568S0100000_24(c19719912DlLIZ2, 690), AFwS268S0000000_26.get$arr$(350), null, true);
        this.LLJLIL = new ViewOnFocusChangeListenerC1713080ugE();
        this.LLJLILLLLZIIL = new ViewOnFocusChangeListenerC1713080ugE();
        this.LLJZ = new LinkedHashMap();
    }

    private final void Gp() {
        C736680Sv4.LJIIIIZZ(this, Ep(), new C2217381BqS() { // from class: X.0v99
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1730930v91) obj).LL;
            }
        }, null, AFwS310S0000000_24.get$arr$(23), 6);
        C736680Sv4.LJIIIIZZ(this, Ep(), new C2217381BqS() { // from class: X.0v98
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1730930v91) obj).LLILLJJLI;
            }
        }, null, AFwS310S0000000_24.get$arr$(24), 6);
        C736680Sv4.LJIIIIZZ(this, Ep(), new C2217381BqS() { // from class: X.0v9A
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1730930v91) obj).LLILLL;
            }
        }, C736820SvI.LIZLLL(), new AwS640S0100000_26(this, 42), 4);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public int Co() {
        return R.layout.bun;
    }

    @Override // X.InterfaceC1728430v4z, X.InterfaceC723730SaB
    public /* bridge */ /* synthetic */ String LIZ() {
        return null;
    }

    @Override // X.InterfaceC459810I1j
    public void V3() {
    }

    private final BillboardGlobalViewModel up() {
        AssemVMLazy assemVMLazy = this.LLJL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJZIJLIL;
        return (BillboardGlobalViewModel) assemVMLazy.getValue();
    }

    private final C1730750v8j yp() {
        return (C1730750v8j) this.LLJJL.getValue();
    }

    public final TuxTextView Ap() {
        View viewFindViewById = this.LLJJIJIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.z32) : null;
            this.LLJJIJIL = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final TuxTextView Bp() {
        View viewFindViewById = this.LLJJIJI;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.z7k) : null;
            this.LLJJIJI = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final DiscountTemplateEditViewModel Ep() {
        AssemVMLazy assemVMLazy = this.LLJJLIIIJLLLLLLLZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJZIJLIL;
        return (DiscountTemplateEditViewModel) assemVMLazy.getValue();
    }

    public final void Ip() {
        Rect rect = new Rect();
        if (lp().getLocalVisibleRect(rect)) {
            Ep().wQ2("billboard_title");
        }
        if (kp().getLocalVisibleRect(rect)) {
            Ep().wQ2("billboard_promotion");
        }
        if (ip().getLocalVisibleRect(rect)) {
            Ep().wQ2("billboard_customized_text");
        }
    }

    public final InterfaceC1730790v8n hp() {
        InterfaceC1730790v8n interfaceC1730790v8n = this.LLJLL;
        if (interfaceC1730790v8n != null) {
            return interfaceC1730790v8n;
        }
        InterfaceC1730790v8n interfaceC1730790v8n2 = null;
        try {
            interfaceC1730790v8n2 = (InterfaceC1730790v8n) C1252710ihh.LIZIZ(this, C13LE.LIZ(InterfaceC1730790v8n.class), null);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        this.LLJLL = interfaceC1730790v8n2;
        return interfaceC1730790v8n2;
    }

    public final CardView ip() {
        View viewFindViewById = this.LLJJJJJIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.fej) : null;
            this.LLJJJJJIL = (CardView) viewFindViewById;
        }
        return (CardView) viewFindViewById;
    }

    public final CardView kp() {
        View viewFindViewById = this.LLJJJJ;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.fel) : null;
            this.LLJJJJ = (CardView) viewFindViewById;
        }
        return (CardView) viewFindViewById;
    }

    public final CardView lp() {
        View viewFindViewById = this.LLJJJIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.feo) : null;
            this.LLJJJIL = (CardView) viewFindViewById;
        }
        return (CardView) viewFindViewById;
    }

    public final C0I7D mp() {
        View viewFindViewById = this.LLJJIJIIJIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.hcc) : null;
            this.LLJJIJIIJIL = (C0I7D) viewFindViewById;
        }
        return (C0I7D) viewFindViewById;
    }

    public final ViewOnFocusChangeListenerC1730940v92 op() {
        View viewFindViewById = this.LLJJIII;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.hcs) : null;
            this.LLJJIII = (ViewOnFocusChangeListenerC1730940v92) viewFindViewById;
        }
        return (ViewOnFocusChangeListenerC1730940v92) viewFindViewById;
    }

    public final C428440Gr4 sp() {
        View viewFindViewById = this.LLJJI;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.i24) : null;
            this.LLJJI = (C428440Gr4) viewFindViewById;
        }
        return (C428440Gr4) viewFindViewById;
    }

    public final C426160GnO tp() {
        View viewFindViewById = this.LLJJJJLIIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.i25) : null;
            this.LLJJJJLIIL = (C426160GnO) viewFindViewById;
        }
        return (C426160GnO) viewFindViewById;
    }

    public final ScrollView zp() {
        View viewFindViewById = this.LLJJJ;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.wrm) : null;
            this.LLJJJ = (ScrollView) viewFindViewById;
        }
        return (ScrollView) viewFindViewById;
    }

    @Override // X.InterfaceC1728430v4z
    public TemplateItem Ul() {
        C1730930v91 state = Ep().getState();
        TemplateField templateFieldLIZJ = C1730900v8y.LIZJ((TemplateField) ListProtector.get(state.LLILZIL.fieldList, 0), state.LL);
        TemplateField templateFieldLIZJ2 = C1730900v8y.LIZJ((TemplateField) ListProtector.get(state.LLILZIL.fieldList, 1), state.LLILLJJLI);
        ArrayList arrayList = new ArrayList();
        arrayList.add(templateFieldLIZJ);
        arrayList.add(templateFieldLIZJ2);
        arrayList.addAll(state.LLILLL);
        return DiscountTemplateItem.LIZ(state.LLILZIL, null, arrayList, false, false, false, null, 262015);
    }

    @Override // X.InterfaceC1728430v4z
    public ViewGroup jE() {
        return sp();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public void onDestroy() {
        super.onDestroy();
        ViewOnFocusChangeListenerC1713080ugE viewOnFocusChangeListenerC1713080ugE = this.LLJLIL;
        EditText editText = viewOnFocusChangeListenerC1713080ugE.LL;
        if (editText != null) {
            editText.setOnFocusChangeListener(null);
            editText.removeTextChangedListener(viewOnFocusChangeListenerC1713080ugE);
        }
        ViewOnFocusChangeListenerC1713080ugE viewOnFocusChangeListenerC1713080ugE2 = this.LLJLILLLLZIIL;
        EditText editText2 = viewOnFocusChangeListenerC1713080ugE2.LL;
        if (editText2 != null) {
            editText2.setOnFocusChangeListener(null);
            editText2.removeTextChangedListener(viewOnFocusChangeListenerC1713080ugE2);
        }
        FixedKeyboardMonitor fixedKeyboardMonitor = this.LLJLLIL;
        if (fixedKeyboardMonitor != null) {
            fixedKeyboardMonitor.LIZIZ();
        }
    }

    @Override // X.InterfaceC459810I1j
    public void ub() {
        C1731050v9D.LIZ(op().getEditText());
        C1731050v9D.LIZ(mp());
    }

    private final void Fp(DiscountTemplateItem discountTemplateItem) {
        BillboardRichText billboardRichText;
        boolean z;
        Context context;
        RootData rootData = up().getState().LL;
        Iterator<TemplateField> it2 = discountTemplateItem.fieldList.iterator();
        while (it2.hasNext()) {
            TemplateFieldPromotionInfo templateFieldPromotionInfo = it2.next().fieldData.fieldPromotionInfo;
            if (templateFieldPromotionInfo != null && (billboardRichText = templateFieldPromotionInfo.richText) != null) {
                String str = billboardRichText.templateText;
                if (str != null && str.length() != 0) {
                    z = false;
                } else {
                    z = true;
                }
                String str2 = "";
                if (!z) {
                    StringBuilder sb = new StringBuilder(billboardRichText.templateText);
                    Map<String, BillboardText> map = billboardRichText.arguments;
                    if (map != null) {
                        for (String str3 : map.keySet()) {
                            BillboardText billboardText = map.get(str3);
                            if (billboardText != null) {
                                String str4 = billboardText.text;
                                if (str4 == null) {
                                    str4 = "";
                                }
                                int length = 0;
                                while (true) {
                                    int iIndexOf = sb.indexOf(str3, length);
                                    if (iIndexOf > -1) {
                                        int length2 = str3.length() + iIndexOf;
                                        if (length2 <= sb.length()) {
                                            sb.replace(iIndexOf, length2, str4);
                                            length = iIndexOf + str4.length();
                                        } else {
                                            length = length2;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    String string = sb.toString();
                    if (string != null && (context = getContext()) != null) {
                        C03DZ.LIZJ(kp());
                        C03DZ.LIZJ(tp());
                        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
                        int iGenerateViewId = View.generateViewId();
                        Map<String, Integer> map2 = this.LLJZ;
                        String str5 = templateFieldPromotionInfo.activityId;
                        if (str5 != null) {
                            str2 = str5;
                        }
                        map2.put(str2, Integer.valueOf(iGenerateViewId));
                        tuxTextView.setId(iGenerateViewId);
                        tuxTextView.setTuxFont(41);
                        tuxTextView.setGravity(17);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                        layoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
                        layoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                        C426750GoL.LJIIL(tuxTextView, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), 16);
                        C786410Ut5.R6(tuxTextView, layoutParams);
                        tuxTextView.setText(string);
                        C786410Ut5.I7(new AjS8S0400000_26(rootData, discountTemplateItem, templateFieldPromotionInfo, this, 0), tuxTextView);
                        tp().addView(tuxTextView);
                        C1723530ux5.LJI(tuxTextView, templateFieldPromotionInfo.sort);
                    }
                }
            }
        }
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public Context Eo(Context context) {
        Fragment fragmentLJI;
        AbstractC1387200mCc abstractC1387200mCcLIZIZ;
        Context contextLJIIIIZZ;
        if ((C290160BYw.LIZ() || C07MW.LIZ()) && (fragmentLJI = C724240Sb0.LJI(this)) != null && (abstractC1387200mCcLIZIZ = C520040KaQ.LIZIZ(fragmentLJI)) != null && (contextLJIIIIZZ = abstractC1387200mCcLIZIZ.LJIIIIZZ()) != null) {
            return contextLJIIIIZZ;
        }
        return context;
    }

    public final void Jp(CardView cardView) {
        this.LLJJJJJIL = cardView;
    }

    public final void Qp(CardView cardView) {
        this.LLJJJJ = cardView;
    }

    public final void Tp(CardView cardView) {
        this.LLJJJIL = cardView;
    }

    public final void Up(C0I7D c0i7d) {
        this.LLJJIJIIJIL = c0i7d;
    }

    public final void Vp(ViewOnFocusChangeListenerC1730940v92 viewOnFocusChangeListenerC1730940v92) {
        this.LLJJIII = viewOnFocusChangeListenerC1730940v92;
    }

    public final void Wp(C428440Gr4 c428440Gr4) {
        this.LLJJI = c428440Gr4;
    }

    public final void Xp(C426160GnO c426160GnO) {
        this.LLJJJJLIIL = c426160GnO;
    }

    public final void aq(ScrollView scrollView) {
        this.LLJJJ = scrollView;
    }

    public final void dq(TuxTextView tuxTextView) {
        this.LLJJIJIL = tuxTextView;
    }

    public final void fq(TuxTextView tuxTextView) {
        this.LLJJIJI = tuxTextView;
    }

    public final void iq(List<TemplateField> list) {
        String str;
        C1730950v93 c1730950v93 = this.LLJLLL;
        if (c1730950v93 != null) {
            c1730950v93.LIZLLL(list);
        }
        Iterator<TemplateField> it2 = list.iterator();
        while (it2.hasNext()) {
            TemplateFieldPromotionInfo templateFieldPromotionInfo = it2.next().fieldData.fieldPromotionInfo;
            if (templateFieldPromotionInfo != null && (str = templateFieldPromotionInfo.activityId) != null) {
                Integer num = templateFieldPromotionInfo.sort;
                Integer num2 = this.LLJZ.get(str);
                if (num2 != null) {
                    TuxTextView tuxTextView = (TuxTextView) tp().findViewById(num2.intValue());
                    if (tuxTextView != null) {
                        C1723530ux5.LJI(tuxTextView, num);
                    }
                }
            }
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        TemplateFieldData templateFieldData;
        TemplateFieldText templateFieldText;
        TemplateFieldData templateFieldData2;
        TemplateFieldText templateFieldText2;
        TemplateField next;
        TemplateFieldData templateFieldData3;
        TemplateFieldPromotionInfo templateFieldPromotionInfo;
        String str;
        Integer num;
        super.onViewCreated(view);
        if (!(yp().LL instanceof DiscountTemplateItem)) {
            return;
        }
        DiscountTemplateItem discountTemplateItem = (DiscountTemplateItem) yp().LL;
        C1730950v93 c1730950v93 = new C1730950v93(sp());
        this.LLJLLL = c1730950v93;
        c1730950v93.LIZ(discountTemplateItem);
        Fp(discountTemplateItem);
        Ep().LL = up();
        DiscountTemplateEditViewModel discountTemplateEditViewModelEp = Ep();
        discountTemplateEditViewModelEp.getClass();
        C1730290v7z c1730290v7z = C1730290v7z.LIZ;
        List<TemplateField> list = discountTemplateItem.fieldList;
        c1730290v7z.getClass();
        int iLJ = C1730290v7z.LJ(list);
        ArrayList arrayList = new ArrayList();
        if (1 <= iLJ) {
            int i = 1;
            while (true) {
                Iterator<TemplateField> it2 = discountTemplateItem.fieldList.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        TemplateFieldPromotionInfo templateFieldPromotionInfo2 = next.fieldData.fieldPromotionInfo;
                        if (templateFieldPromotionInfo2 != null && (num = templateFieldPromotionInfo2.sort) != null && num.intValue() == i) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                TemplateField templateField = next;
                if (templateField != null && (templateFieldData3 = templateField.fieldData) != null && (templateFieldPromotionInfo = templateFieldData3.fieldPromotionInfo) != null && (str = templateFieldPromotionInfo.activityId) != null) {
                    arrayList.add(str);
                }
                if (i == iLJ) {
                    break;
                } else {
                    i++;
                }
            }
        }
        discountTemplateEditViewModelEp.setState(new AwS392S0200000_26(discountTemplateItem, (DiscountTemplateItem) arrayList, (List<String>) 147));
        getActualLifecycleOwner();
        FixedKeyboardMonitor fixedKeyboardMonitor = new FixedKeyboardMonitor(this);
        this.LLJLLIL = fixedKeyboardMonitor;
        fixedKeyboardMonitor.LIZ(view, this);
        ViewOnFocusChangeListenerC1730940v92 viewOnFocusChangeListenerC1730940v92Op = op();
        viewOnFocusChangeListenerC1730940v92Op.LLIZ = false;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewOnFocusChangeListenerC1730940v92Op.getIvClearFromXml().getLayoutParams();
        if (viewOnFocusChangeListenerC1730940v92Op.LLIZ) {
            marginLayoutParams.setMarginEnd(C0H9I.LIZ(32.0f));
        } else {
            marginLayoutParams.setMarginEnd(0);
        }
        C786410Ut5.M6(viewOnFocusChangeListenerC1730940v92Op.getIvClearFromXml(), marginLayoutParams);
        op().getEditText().addTextChangedListener(new C1730670v8b() { // from class: X.0v95
            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                String string;
                DiscountTemplateEditViewModel discountTemplateEditViewModelEp2 = this.LL.Ep();
                if (editable == null || (string = editable.toString()) == null) {
                    string = "";
                }
                discountTemplateEditViewModelEp2.getClass();
                discountTemplateEditViewModelEp2.setState(new AwS76S1000000_26(string, 30));
                InterfaceC1730790v8n interfaceC1730790v8nHp = this.LL.hp();
                if (interfaceC1730790v8nHp != null) {
                    interfaceC1730790v8nHp.SK();
                }
            }
        });
        op().getEditText().setOnFocusChangeListener(new ViewOnFocusChangeListenerC1775860wJU(this, 7));
        TemplateField templateField2 = (TemplateField) C13LP.LJJJLZIJ(0, discountTemplateItem.fieldList);
        if (templateField2 != null && (templateFieldData2 = templateField2.fieldData) != null && (templateFieldText2 = templateFieldData2.fieldText) != null) {
            op().setTextLimitLength(templateFieldText2.limit);
            op().setHint(templateFieldText2.defaultContent);
            op().setText(templateFieldText2.content);
            ViewOnFocusChangeListenerC1713080ugE viewOnFocusChangeListenerC1713080ugE = this.LLJLIL;
            C0I7D editText = op().getEditText();
            TuxTextView tuxTextViewBp = Bp();
            int i2 = templateFieldText2.limit;
            viewOnFocusChangeListenerC1713080ugE.getClass();
            viewOnFocusChangeListenerC1713080ugE.LLILZ = editText.getOnFocusChangeListener();
            editText.setOnFocusChangeListener(viewOnFocusChangeListenerC1713080ugE);
            viewOnFocusChangeListenerC1713080ugE.LL = editText;
            viewOnFocusChangeListenerC1713080ugE.LLILLJJLI = tuxTextViewBp;
            viewOnFocusChangeListenerC1713080ugE.LLILLL = i2;
        }
        mp().addTextChangedListener(new C1730670v8b() { // from class: X.0v96
            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                String string;
                DiscountTemplateEditViewModel discountTemplateEditViewModelEp2 = this.LL.Ep();
                if (editable == null || (string = editable.toString()) == null) {
                    string = "";
                }
                discountTemplateEditViewModelEp2.getClass();
                discountTemplateEditViewModelEp2.setState(new AwS76S1000000_26(string, 28));
                InterfaceC1730790v8n interfaceC1730790v8nHp = this.LL.hp();
                if (interfaceC1730790v8nHp != null) {
                    interfaceC1730790v8nHp.SK();
                }
            }
        });
        mp().setOnFocusChangeListener(new ViewOnFocusChangeListenerC1775860wJU(this, 8));
        TemplateField templateField3 = (TemplateField) C13LP.LJJJLZIJ(1, discountTemplateItem.fieldList);
        if (templateField3 != null && (templateFieldData = templateField3.fieldData) != null && (templateFieldText = templateFieldData.fieldText) != null) {
            mp().setText(templateFieldText.content);
            mp().setHint(templateFieldText.defaultContent);
            mp().setFilters(new InputFilter[]{new InputFilter.LengthFilter(templateFieldText.limit)});
            ViewOnFocusChangeListenerC1713080ugE viewOnFocusChangeListenerC1713080ugE2 = this.LLJLILLLLZIIL;
            C0I7D c0i7dMp = mp();
            TuxTextView tuxTextViewAp = Ap();
            int i3 = templateFieldText.limit;
            viewOnFocusChangeListenerC1713080ugE2.getClass();
            viewOnFocusChangeListenerC1713080ugE2.LLILZ = c0i7dMp.getOnFocusChangeListener();
            c0i7dMp.setOnFocusChangeListener(viewOnFocusChangeListenerC1713080ugE2);
            viewOnFocusChangeListenerC1713080ugE2.LL = c0i7dMp;
            viewOnFocusChangeListenerC1713080ugE2.LLILLJJLI = tuxTextViewAp;
            viewOnFocusChangeListenerC1713080ugE2.LLILLL = i3;
        }
        C1731050v9D.LIZIZ(mp());
        zp().addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC1775800wJO(this, 0));
        C786410Ut5.z3(zp().getViewTreeObserver(), new ViewTreeObserver.OnScrollChangedListener() { // from class: X.0v9B
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                this.LL.Ip();
            }
        });
        Gp();
    }
}
