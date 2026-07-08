package com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.assem;

import X.AbstractC1387200mCc;
import X.C019F;
import X.C01D1;
import X.C07MW;
import X.C09R3;
import X.C0I7D;
import X.C123100dR;
import X.C1252710ihh;
import X.C13LE;
import X.C13LP;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1637906bB;
import X.C1730670v8b;
import X.C1730750v8j;
import X.C1730860v8u;
import X.C1730880v8w;
import X.C1731050v9D;
import X.C1731280v9a;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C290160BYw;
import X.C428440Gr4;
import X.C520040KaQ;
import X.C723590SZx;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.InterfaceC1728430v4z;
import X.InterfaceC1730790v8n;
import X.InterfaceC1730890v8x;
import X.InterfaceC2217461Bqa;
import X.InterfaceC459810I1j;
import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.ProductTemplateItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateField;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateFieldData;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateFieldProduct;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateFieldText;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.utils.FixedKeyboardMonitor;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.viewmodel.BillboardGlobalViewModel;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.viewmodel.ProductTemplateEditViewModel;
import com.zhiliaoapp.musically.R;
import g1c.AjS44S0200000_26;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AFwS310S0000000_24;
import kotlin.jvm.internal.AFwS313S0000000_26;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.AwS76S1000000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class ProductTemplateEditAssem extends UISlotAssem implements InterfaceC1728430v4z, InterfaceC1730890v8x, InterfaceC459810I1j {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJLIIL;
    public static final int LLJJL;
    public C428440Gr4 LLJJI;
    public C0I7D LLJJIII;
    public TuxTextView LLJJIJI;
    public TuxTextView LLJJIJIIJIL;
    public final C1559260qg8 LLJJIJIL = new C1559260qg8(new C723590SZx(this, C1730750v8j.class, null), checkSupervisorPrepared());
    public final AssemVMLazy LLJJJ;
    public final AssemVMLazy LLJJJIL;
    public InterfaceC1730790v8n LLJJJJ;
    public FixedKeyboardMonitor LLJJJJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ProductTemplateEditAssem.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/influencer/ecommercelive/common/business/effect2/viewmodel/ProductTemplateEditViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(ProductTemplateEditAssem.class, "globalViewModel", "getGlobalViewModel()Lcom/ss/android/ugc/aweme/influencer/ecommercelive/common/business/effect2/viewmodel/BillboardGlobalViewModel;", 0);
        c09r3.getClass();
        LLJJJJLIIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
        LLJJL = 8;
    }

    public ProductTemplateEditAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ProductTemplateEditViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJJJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS568S0100000_24(c19719912DlLIZ, 698), AFwS268S0000000_26.get$arr$(357), null, true);
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(BillboardGlobalViewModel.class);
        this.LLJJJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c01d1, c1637906bB, new AwS568S0100000_24(c19719912DlLIZ2, 699), AFwS268S0000000_26.get$arr$(358), null, true);
    }

    private final void up() {
        C736680Sv4.LJIIIIZZ(this, tp(), new C2217381BqS() { // from class: X.0v8v
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1730830v8r) obj).LLILLJJLI;
            }
        }, null, AFwS310S0000000_24.get$arr$(33), 6);
        C736680Sv4.LJIIIIZZ(this, tp(), new C2217381BqS() { // from class: X.0v8t
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1730830v8r) obj).LL;
            }
        }, null, AFwS313S0000000_26.get$arr$(15), 6);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public int Co() {
        return R.layout.bur;
    }

    @Override // X.InterfaceC1728430v4z, X.InterfaceC723730SaB
    public /* bridge */ /* synthetic */ String LIZ() {
        return null;
    }

    @Override // X.InterfaceC459810I1j
    public void V3() {
    }

    private final C1730750v8j mp() {
        return (C1730750v8j) this.LLJJIJIL.getValue();
    }

    public final InterfaceC1730790v8n hp() {
        InterfaceC1730790v8n interfaceC1730790v8n = this.LLJJJJ;
        if (interfaceC1730790v8n != null) {
            return interfaceC1730790v8n;
        }
        InterfaceC1730790v8n interfaceC1730790v8n2 = null;
        try {
            interfaceC1730790v8n2 = (InterfaceC1730790v8n) C1252710ihh.LIZIZ(this, C13LE.LIZ(InterfaceC1730790v8n.class), null);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        this.LLJJJJ = interfaceC1730790v8n2;
        return interfaceC1730790v8n2;
    }

    public final C0I7D ip() {
        View viewFindViewById = this.LLJJIII;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.hcc) : null;
            this.LLJJIII = (C0I7D) viewFindViewById;
        }
        return (C0I7D) viewFindViewById;
    }

    public final C428440Gr4 kp() {
        View viewFindViewById = this.LLJJI;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.i24) : null;
            this.LLJJI = (C428440Gr4) viewFindViewById;
        }
        return (C428440Gr4) viewFindViewById;
    }

    public final BillboardGlobalViewModel lp() {
        AssemVMLazy assemVMLazy = this.LLJJJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJLIIL;
        return (BillboardGlobalViewModel) assemVMLazy.getValue();
    }

    public final TuxTextView op() {
        View viewFindViewById = this.LLJJIJI;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.z4j) : null;
            this.LLJJIJI = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final TuxTextView sp() {
        View viewFindViewById = this.LLJJIJIIJIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.z6p) : null;
            this.LLJJIJIIJIL = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final ProductTemplateEditViewModel tp() {
        AssemVMLazy assemVMLazy = this.LLJJJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJLIIL;
        return (ProductTemplateEditViewModel) assemVMLazy.getValue();
    }

    @Override // X.InterfaceC1730890v8x
    public boolean Ff() {
        TemplateFieldProduct templateFieldProduct = tp().getState().LL;
        if (templateFieldProduct != null) {
            return C123100dR.LIZ(templateFieldProduct.productImage);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0031 A[PHI: r2
      0x0031: PHI (r2v1 java.lang.String) = (r2v0 java.lang.String), (r2v5 java.lang.String), (r2v5 java.lang.String) binds: [B:8:0x0021, B:13:0x002b, B:15:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.InterfaceC1728430v4z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateItem Ul() {
        /*
            r15 = this;
            com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.viewmodel.ProductTemplateEditViewModel r0 = r15.tp()
            com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.ProductTemplateItem r7 = r0.LL
            X.002o r6 = r0.getState()
            X.0v8r r6 = (X.C1730830v8r) r6
            java.util.List<com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateField> r0 = r7.fieldList
            r5 = 0
            java.lang.Object r4 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r5)
            com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateField r4 = (com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateField) r4
            com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateFieldProduct r3 = r6.LL
            java.lang.String r2 = ""
            if (r3 == 0) goto L1f
            java.lang.String r1 = r3.productId
            if (r1 != 0) goto L20
        L1f:
            r1 = r2
        L20:
            r8 = 0
            if (r3 == 0) goto L31
            java.lang.String r0 = r3.productOriginImage
            if (r0 != 0) goto L66
            java.lang.String r0 = r3.productImage
            if (r0 != 0) goto L66
        L2b:
            if (r3 == 0) goto L31
            java.lang.String r0 = r3.productIndex
            if (r0 != 0) goto L33
        L31:
            java.lang.String r0 = "0"
        L33:
            com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateField r4 = X.C1730900v8y.LIZ(r4, r1, r2, r0, r8)
            java.util.List<com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateField> r0 = r7.fieldList
            r3 = 1
            java.lang.Object r1 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r3)
            com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateField r1 = (com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateField) r1
            java.lang.String r0 = r6.LLILLJJLI
            com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateField r1 = X.C1730900v8y.LIZJ(r1, r0)
            r0 = 3
            com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateField[] r2 = new com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateField[r0]
            r2[r5] = r4
            r2[r3] = r1
            java.util.List<com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateField> r0 = r7.fieldList
            r1 = 2
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r1)
            r2[r1] = r0
            java.util.ArrayList r9 = X.C1697810uHb.LJ(r2)
            r10 = 0
            r14 = 262015(0x3ff7f, float:3.67161E-40)
            r11 = r10
            r12 = r10
            r13 = r8
            com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.ProductTemplateItem r0 = com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.ProductTemplateItem.LIZ(r7, r8, r9, r10, r11, r12, r13, r14)
            return r0
        L66:
            r2 = r0
            goto L2b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.assem.ProductTemplateEditAssem.Ul():com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateItem");
    }

    @Override // X.InterfaceC1728430v4z
    public ViewGroup jE() {
        return kp();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public void onDestroy() {
        super.onDestroy();
        FixedKeyboardMonitor fixedKeyboardMonitor = this.LLJJJJJIL;
        if (fixedKeyboardMonitor != null) {
            fixedKeyboardMonitor.LIZIZ();
        }
    }

    @Override // X.InterfaceC459810I1j
    public void ub() {
        C1731050v9D.LIZ(ip());
    }

    public final void Ap(TuxTextView tuxTextView) {
        this.LLJJIJI = tuxTextView;
    }

    public final void Bp(TuxTextView tuxTextView) {
        this.LLJJIJIIJIL = tuxTextView;
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

    public final void Ep(C1730880v8w c1730880v8w) {
        InterfaceC1730790v8n interfaceC1730790v8nHp;
        ProductTemplateEditViewModel productTemplateEditViewModelTp = tp();
        String str = c1730880v8w.LIZ;
        String str2 = c1730880v8w.LIZJ;
        String str3 = c1730880v8w.LIZIZ;
        int i = c1730880v8w.LIZLLL;
        productTemplateEditViewModelTp.getClass();
        productTemplateEditViewModelTp.setState(new C1730860v8u(i, str2, str, str3));
        if (productTemplateEditViewModelTp.getState().LLILLJJLI.length() > 0 && (interfaceC1730790v8nHp = hp()) != null) {
            interfaceC1730790v8nHp.SK();
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        TemplateFieldData templateFieldData;
        TemplateFieldText templateFieldText;
        super.onViewCreated(view);
        if (!(mp().LL instanceof ProductTemplateItem)) {
            return;
        }
        ProductTemplateItem productTemplateItem = (ProductTemplateItem) mp().LL;
        new C1731280v9a(kp()).LIZ(productTemplateItem);
        ProductTemplateEditViewModel productTemplateEditViewModelTp = tp();
        productTemplateEditViewModelTp.LL = productTemplateItem;
        productTemplateEditViewModelTp.setState(new AwS605S0100000_26(productTemplateItem, 632));
        getActualLifecycleOwner();
        FixedKeyboardMonitor fixedKeyboardMonitor = new FixedKeyboardMonitor(this);
        this.LLJJJJJIL = fixedKeyboardMonitor;
        fixedKeyboardMonitor.LIZ(view, this);
        TemplateField templateField = (TemplateField) C13LP.LJJJLZIJ(1, productTemplateItem.fieldList);
        if (templateField != null && (templateFieldData = templateField.fieldData) != null && (templateFieldText = templateFieldData.fieldText) != null) {
            ip().setText(templateFieldText.content);
            ip().setHint(templateFieldText.defaultContent);
            ip().setFilters(new InputFilter[]{new InputFilter.LengthFilter(templateFieldText.limit)});
        }
        ip().addTextChangedListener(new C1730670v8b() { // from class: X.0v8q
            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                String string;
                InterfaceC1730790v8n interfaceC1730790v8nHp;
                if (editable == null || (string = editable.toString()) == null) {
                    string = "";
                }
                ProductTemplateEditViewModel productTemplateEditViewModelTp2 = this.LL.tp();
                productTemplateEditViewModelTp2.getClass();
                productTemplateEditViewModelTp2.setState(new AwS76S1000000_26(string, 37));
                if (string.length() == 0) {
                    C0H1U.LIZIZ(this.LL.op());
                    this.LL.op().setText("");
                } else {
                    C12ES.LJIILL(0, this.LL.op());
                    TuxTextView tuxTextViewOp = this.LL.op();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(string.length());
                    sbLIZ.append('/');
                    sbLIZ.append(((InputFilter.LengthFilter) this.LL.ip().getFilters()[0]).getMax());
                    tuxTextViewOp.setText(C2188811AlT.LIZIZ(sbLIZ));
                }
                if (this.LL.Ff() && (interfaceC1730790v8nHp = this.LL.hp()) != null) {
                    interfaceC1730790v8nHp.SK();
                }
            }
        });
        C1731050v9D.LIZIZ(ip());
        C786410Ut5.I7(new AjS44S0200000_26(this, productTemplateItem, 11), sp());
        up();
    }

    public final void yp(C0I7D c0i7d) {
        this.LLJJIII = c0i7d;
    }

    public final void zp(C428440Gr4 c428440Gr4) {
        this.LLJJI = c428440Gr4;
    }
}
