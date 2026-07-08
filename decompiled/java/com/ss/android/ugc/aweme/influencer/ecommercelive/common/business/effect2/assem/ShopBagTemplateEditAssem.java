package com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.assem;

import X.AbstractC1387200mCc;
import X.C019F;
import X.C07MW;
import X.C0I7D;
import X.C1252710ihh;
import X.C13LE;
import X.C13LP;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1697810uHb;
import X.C1730670v8b;
import X.C1730750v8j;
import X.C1730900v8y;
import X.C1731050v9D;
import X.C1731240v9W;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C290160BYw;
import X.C428440Gr4;
import X.C520040KaQ;
import X.C723590SZx;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.InterfaceC1728430v4z;
import X.InterfaceC1730790v8n;
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
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.ShopBagTemplateItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateField;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateFieldData;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateFieldText;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.utils.FixedKeyboardMonitor;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.viewmodel.ShopBagTemplateEditViewModel;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AFwS310S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.AwS76S1000000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class ShopBagTemplateEditAssem extends UISlotAssem implements InterfaceC1728430v4z, InterfaceC459810I1j {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJ;
    public static final int LLJJJJJIL;
    public C428440Gr4 LLJJI;
    public C0I7D LLJJIII;
    public TuxTextView LLJJIJI;
    public final C1559260qg8 LLJJIJIIJIL = new C1559260qg8(new C723590SZx(this, C1730750v8j.class, null), checkSupervisorPrepared());
    public final AssemVMLazy LLJJIJIL;
    public InterfaceC1730790v8n LLJJJ;
    public FixedKeyboardMonitor LLJJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ShopBagTemplateEditAssem.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/influencer/ecommercelive/common/business/effect2/viewmodel/ShopBagTemplateEditViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJJJJIL = 8;
    }

    public ShopBagTemplateEditAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ShopBagTemplateEditViewModel.class);
        this.LLJJIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS568S0100000_24(c19719912DlLIZ, OppoPermissionPopupMaskDelayExp.DEFAULT), AFwS268S0000000_26.get$arr$(359), null, true);
    }

    private final void sp() {
        C736680Sv4.LJIIIIZZ(this, op(), new C2217381BqS() { // from class: X.0v9G
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C995960c1a) obj).LL;
            }
        }, null, AFwS310S0000000_24.get$arr$(34), 6);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public int Co() {
        return R.layout.bus;
    }

    @Override // X.InterfaceC1728430v4z, X.InterfaceC723730SaB
    public /* bridge */ /* synthetic */ String LIZ() {
        return null;
    }

    @Override // X.InterfaceC459810I1j
    public void V3() {
    }

    private final C1730750v8j lp() {
        return (C1730750v8j) this.LLJJIJIIJIL.getValue();
    }

    public final InterfaceC1730790v8n hp() {
        InterfaceC1730790v8n interfaceC1730790v8n = this.LLJJJ;
        if (interfaceC1730790v8n != null) {
            return interfaceC1730790v8n;
        }
        InterfaceC1730790v8n interfaceC1730790v8n2 = null;
        try {
            interfaceC1730790v8n2 = (InterfaceC1730790v8n) C1252710ihh.LIZIZ(this, C13LE.LIZ(InterfaceC1730790v8n.class), null);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        this.LLJJJ = interfaceC1730790v8n2;
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

    public final TuxTextView mp() {
        View viewFindViewById = this.LLJJIJI;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.z4j) : null;
            this.LLJJIJI = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final ShopBagTemplateEditViewModel op() {
        AssemVMLazy assemVMLazy = this.LLJJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJ;
        return (ShopBagTemplateEditViewModel) assemVMLazy.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1728430v4z
    public TemplateItem Ul() {
        ShopBagTemplateEditViewModel shopBagTemplateEditViewModelOp = op();
        ShopBagTemplateItem shopBagTemplateItem = shopBagTemplateEditViewModelOp.LL;
        return ShopBagTemplateItem.LIZ(shopBagTemplateItem, null, C1697810uHb.LJ(C1730900v8y.LIZJ((TemplateField) ListProtector.get(shopBagTemplateItem.fieldList, 0), shopBagTemplateEditViewModelOp.getState().LL), ListProtector.get(shopBagTemplateItem.fieldList, 1)), false, false, false, null, 262015);
    }

    @Override // X.InterfaceC1728430v4z
    public ViewGroup jE() {
        return kp();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public void onDestroy() {
        super.onDestroy();
        FixedKeyboardMonitor fixedKeyboardMonitor = this.LLJJJIL;
        if (fixedKeyboardMonitor != null) {
            fixedKeyboardMonitor.LIZIZ();
        }
    }

    @Override // X.InterfaceC459810I1j
    public void ub() {
        C1731050v9D.LIZ(ip());
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

    @Override // com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        TemplateFieldData templateFieldData;
        TemplateFieldText templateFieldText;
        super.onViewCreated(view);
        if (!(lp().LL instanceof ShopBagTemplateItem)) {
            return;
        }
        ShopBagTemplateItem shopBagTemplateItem = (ShopBagTemplateItem) lp().LL;
        new C1731240v9W(kp()).LIZ(shopBagTemplateItem);
        ShopBagTemplateEditViewModel shopBagTemplateEditViewModelOp = op();
        shopBagTemplateEditViewModelOp.LL = shopBagTemplateItem;
        shopBagTemplateEditViewModelOp.setState(new AwS605S0100000_26(shopBagTemplateItem, 639));
        getActualLifecycleOwner();
        FixedKeyboardMonitor fixedKeyboardMonitor = new FixedKeyboardMonitor(this);
        this.LLJJJIL = fixedKeyboardMonitor;
        fixedKeyboardMonitor.LIZ(view, this);
        TemplateField templateField = (TemplateField) C13LP.LJJJLZIJ(0, shopBagTemplateItem.fieldList);
        if (templateField != null && (templateFieldData = templateField.fieldData) != null && (templateFieldText = templateFieldData.fieldText) != null) {
            ip().setText(templateFieldText.content);
            ip().setHint(templateFieldText.defaultContent);
            ip().setFilters(new InputFilter[]{new InputFilter.LengthFilter(templateFieldText.limit)});
        }
        ip().addTextChangedListener(new C1730670v8b() { // from class: X.0v9F
            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                String string;
                if (editable == null || (string = editable.toString()) == null) {
                    string = "";
                }
                ShopBagTemplateEditViewModel shopBagTemplateEditViewModelOp2 = this.LL.op();
                shopBagTemplateEditViewModelOp2.getClass();
                shopBagTemplateEditViewModelOp2.setState(new AwS76S1000000_26(string, 38));
                if (string.length() == 0) {
                    C0H1U.LIZIZ(this.LL.mp());
                    this.LL.mp().setText("");
                } else {
                    C12ES.LJIILL(0, this.LL.mp());
                    TuxTextView tuxTextViewMp = this.LL.mp();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(string.length());
                    sbLIZ.append('/');
                    sbLIZ.append(((InputFilter.LengthFilter) this.LL.ip().getFilters()[0]).getMax());
                    tuxTextViewMp.setText(C2188811AlT.LIZIZ(sbLIZ));
                }
                InterfaceC1730790v8n interfaceC1730790v8nHp = this.LL.hp();
                if (interfaceC1730790v8nHp != null) {
                    interfaceC1730790v8nHp.SK();
                }
            }
        });
        C1731050v9D.LIZIZ(ip());
        sp();
    }

    public final void tp(C0I7D c0i7d) {
        this.LLJJIII = c0i7d;
    }

    public final void up(C428440Gr4 c428440Gr4) {
        this.LLJJI = c428440Gr4;
    }

    public final void yp(TuxTextView tuxTextView) {
        this.LLJJIJI = tuxTextView;
    }
}
