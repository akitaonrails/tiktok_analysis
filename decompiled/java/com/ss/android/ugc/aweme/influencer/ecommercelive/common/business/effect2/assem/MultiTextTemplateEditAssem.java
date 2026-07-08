package com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.assem;

import X.AbstractC1387200mCc;
import X.C019F;
import X.C07MW;
import X.C1252710ihh;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1697810uHb;
import X.C1730670v8b;
import X.C1730750v8j;
import X.C1730900v8y;
import X.C1731050v9D;
import X.C1731110v9J;
import X.C1731250v9X;
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
import X.ViewOnFocusChangeListenerC1730940v92;
import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.MultiTextTemplateItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateField;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateFieldText;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.utils.FixedKeyboardMonitor;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.viewmodel.MultiTextTemplateEditViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AFwS310S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.AwS76S1000000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class MultiTextTemplateEditAssem extends UISlotAssem implements InterfaceC1728430v4z, InterfaceC459810I1j {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJLIIL;
    public static final int LLJJL;
    public C428440Gr4 LLJJI;
    public ViewOnFocusChangeListenerC1730940v92 LLJJIII;
    public ViewOnFocusChangeListenerC1730940v92 LLJJIJI;
    public ViewOnFocusChangeListenerC1730940v92 LLJJIJIIJIL;
    public ViewOnFocusChangeListenerC1730940v92 LLJJIJIL;
    public final C1559260qg8 LLJJJ = new C1559260qg8(new C723590SZx(this, C1730750v8j.class, null), checkSupervisorPrepared());
    public final AssemVMLazy LLJJJIL;
    public InterfaceC1730790v8n LLJJJJ;
    public FixedKeyboardMonitor LLJJJJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MultiTextTemplateEditAssem.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/influencer/ecommercelive/common/business/effect2/viewmodel/MultiTextTemplateEditViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJJLIIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJL = 8;
    }

    public MultiTextTemplateEditAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MultiTextTemplateEditViewModel.class);
        this.LLJJJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS568S0100000_24(c19719912DlLIZ, 697), AFwS268S0000000_26.get$arr$(356), null, true);
    }

    private final void up() {
        C736680Sv4.LJIIIIZZ(this, tp(), new C2217381BqS() { // from class: X.0v9O
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1731110v9J) obj).LL;
            }
        }, null, AFwS310S0000000_24.get$arr$(29), 6);
        C736680Sv4.LJIIIIZZ(this, tp(), new C2217381BqS() { // from class: X.0v9P
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1731110v9J) obj).LLILLJJLI;
            }
        }, null, AFwS310S0000000_24.get$arr$(30), 6);
        C736680Sv4.LJIIIIZZ(this, tp(), new C2217381BqS() { // from class: X.0v9Q
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1731110v9J) obj).LLILLL;
            }
        }, null, AFwS310S0000000_24.get$arr$(31), 6);
        C736680Sv4.LJIIIIZZ(this, tp(), new C2217381BqS() { // from class: X.0v9R
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1731110v9J) obj).LLILZ;
            }
        }, null, AFwS310S0000000_24.get$arr$(32), 6);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public int Co() {
        return R.layout.buq;
    }

    @Override // X.InterfaceC1728430v4z, X.InterfaceC723730SaB
    public /* bridge */ /* synthetic */ String LIZ() {
        return null;
    }

    @Override // X.InterfaceC459810I1j
    public void V3() {
    }

    private final C1730750v8j sp() {
        return (C1730750v8j) this.LLJJJ.getValue();
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

    public final ViewOnFocusChangeListenerC1730940v92 ip() {
        View viewFindViewById = this.LLJJIJI;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.hcp) : null;
            this.LLJJIJI = (ViewOnFocusChangeListenerC1730940v92) viewFindViewById;
        }
        return (ViewOnFocusChangeListenerC1730940v92) viewFindViewById;
    }

    public final ViewOnFocusChangeListenerC1730940v92 kp() {
        View viewFindViewById = this.LLJJIJIIJIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.hcq) : null;
            this.LLJJIJIIJIL = (ViewOnFocusChangeListenerC1730940v92) viewFindViewById;
        }
        return (ViewOnFocusChangeListenerC1730940v92) viewFindViewById;
    }

    public final ViewOnFocusChangeListenerC1730940v92 lp() {
        View viewFindViewById = this.LLJJIJIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.hcr) : null;
            this.LLJJIJIL = (ViewOnFocusChangeListenerC1730940v92) viewFindViewById;
        }
        return (ViewOnFocusChangeListenerC1730940v92) viewFindViewById;
    }

    public final ViewOnFocusChangeListenerC1730940v92 mp() {
        View viewFindViewById = this.LLJJIII;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.hcs) : null;
            this.LLJJIII = (ViewOnFocusChangeListenerC1730940v92) viewFindViewById;
        }
        return (ViewOnFocusChangeListenerC1730940v92) viewFindViewById;
    }

    public final C428440Gr4 op() {
        View viewFindViewById = this.LLJJI;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.i24) : null;
            this.LLJJI = (C428440Gr4) viewFindViewById;
        }
        return (C428440Gr4) viewFindViewById;
    }

    public final MultiTextTemplateEditViewModel tp() {
        AssemVMLazy assemVMLazy = this.LLJJJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJLIIL;
        return (MultiTextTemplateEditViewModel) assemVMLazy.getValue();
    }

    @Override // X.InterfaceC1728430v4z
    public TemplateItem Ul() {
        MultiTextTemplateEditViewModel multiTextTemplateEditViewModelTp = tp();
        MultiTextTemplateItem multiTextTemplateItem = multiTextTemplateEditViewModelTp.LL;
        C1731110v9J state = multiTextTemplateEditViewModelTp.getState();
        return MultiTextTemplateItem.LIZ(multiTextTemplateItem, null, C1697810uHb.LJ(C1730900v8y.LIZJ((TemplateField) ListProtector.get(multiTextTemplateItem.fieldList, 0), state.LL), C1730900v8y.LIZJ((TemplateField) ListProtector.get(multiTextTemplateItem.fieldList, 1), state.LLILLJJLI), C1730900v8y.LIZJ((TemplateField) ListProtector.get(multiTextTemplateItem.fieldList, 2), state.LLILLL), C1730900v8y.LIZJ((TemplateField) ListProtector.get(multiTextTemplateItem.fieldList, 3), state.LLILZ)), false, false, false, null, 262015);
    }

    @Override // X.InterfaceC1728430v4z
    public ViewGroup jE() {
        return op();
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
        C1731050v9D.LIZ(mp().getEditText());
        C1731050v9D.LIZ(ip().getEditText());
        C1731050v9D.LIZ(kp().getEditText());
        C1731050v9D.LIZ(lp().getEditText());
    }

    public final void Ap(ViewOnFocusChangeListenerC1730940v92 viewOnFocusChangeListenerC1730940v92) {
        this.LLJJIJIL = viewOnFocusChangeListenerC1730940v92;
    }

    public final void Bp(ViewOnFocusChangeListenerC1730940v92 viewOnFocusChangeListenerC1730940v92) {
        this.LLJJIII = viewOnFocusChangeListenerC1730940v92;
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

    public final void Ep(C428440Gr4 c428440Gr4) {
        this.LLJJI = c428440Gr4;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        super.onViewCreated(view);
        if (!(sp().LL instanceof MultiTextTemplateItem)) {
            return;
        }
        MultiTextTemplateItem multiTextTemplateItem = (MultiTextTemplateItem) sp().LL;
        new C1731250v9X(op()).LIZ(multiTextTemplateItem);
        MultiTextTemplateEditViewModel multiTextTemplateEditViewModelTp = tp();
        multiTextTemplateEditViewModelTp.LL = multiTextTemplateItem;
        multiTextTemplateEditViewModelTp.setState(new AwS605S0100000_26(multiTextTemplateItem, 622));
        getActualLifecycleOwner();
        FixedKeyboardMonitor fixedKeyboardMonitor = new FixedKeyboardMonitor(this);
        this.LLJJJJJIL = fixedKeyboardMonitor;
        fixedKeyboardMonitor.LIZ(view, this);
        TemplateFieldText templateFieldText = ((TemplateField) ListProtector.get(multiTextTemplateItem.fieldList, 0)).fieldData.fieldText;
        if (templateFieldText != null) {
            mp().setText(templateFieldText.content);
            mp().setHint(templateFieldText.defaultContent);
            mp().setTextLimitLength(templateFieldText.limit);
        }
        mp().setTextWatcher(new C1730670v8b() { // from class: X.0v9K
            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                String string;
                MultiTextTemplateEditViewModel multiTextTemplateEditViewModelTp2 = this.LL.tp();
                if (editable == null || (string = editable.toString()) == null) {
                    string = "";
                }
                multiTextTemplateEditViewModelTp2.getClass();
                multiTextTemplateEditViewModelTp2.setState(new AwS76S1000000_26(string, 36));
                InterfaceC1730790v8n interfaceC1730790v8nHp = this.LL.hp();
                if (interfaceC1730790v8nHp != null) {
                    interfaceC1730790v8nHp.SK();
                }
            }
        });
        TemplateFieldText templateFieldText2 = ((TemplateField) ListProtector.get(multiTextTemplateItem.fieldList, 1)).fieldData.fieldText;
        if (templateFieldText2 != null) {
            ip().setText(templateFieldText2.content);
            ip().setHint(templateFieldText2.defaultContent);
            ip().setTextLimitLength(templateFieldText2.limit);
        }
        ip().setTextWatcher(new C1730670v8b() { // from class: X.0v9L
            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                String string;
                MultiTextTemplateEditViewModel multiTextTemplateEditViewModelTp2 = this.LL.tp();
                if (editable == null || (string = editable.toString()) == null) {
                    string = "";
                }
                multiTextTemplateEditViewModelTp2.getClass();
                multiTextTemplateEditViewModelTp2.setState(new AwS76S1000000_26(string, 32));
                InterfaceC1730790v8n interfaceC1730790v8nHp = this.LL.hp();
                if (interfaceC1730790v8nHp != null) {
                    interfaceC1730790v8nHp.SK();
                }
            }
        });
        TemplateFieldText templateFieldText3 = ((TemplateField) ListProtector.get(multiTextTemplateItem.fieldList, 2)).fieldData.fieldText;
        if (templateFieldText3 != null) {
            kp().setText(templateFieldText3.content);
            kp().setHint(templateFieldText3.defaultContent);
            kp().setTextLimitLength(templateFieldText3.limit);
        }
        kp().setTextWatcher(new C1730670v8b() { // from class: X.0v9M
            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                String string;
                MultiTextTemplateEditViewModel multiTextTemplateEditViewModelTp2 = this.LL.tp();
                if (editable == null || (string = editable.toString()) == null) {
                    string = "";
                }
                multiTextTemplateEditViewModelTp2.getClass();
                multiTextTemplateEditViewModelTp2.setState(new AwS76S1000000_26(string, 34));
                InterfaceC1730790v8n interfaceC1730790v8nHp = this.LL.hp();
                if (interfaceC1730790v8nHp != null) {
                    interfaceC1730790v8nHp.SK();
                }
            }
        });
        TemplateFieldText templateFieldText4 = ((TemplateField) ListProtector.get(multiTextTemplateItem.fieldList, 3)).fieldData.fieldText;
        if (templateFieldText4 != null) {
            lp().setText(templateFieldText4.content);
            lp().setHint(templateFieldText4.defaultContent);
            lp().setTextLimitLength(templateFieldText4.limit);
        }
        lp().setTextWatcher(new C1730670v8b() { // from class: X.0v9N
            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                String string;
                MultiTextTemplateEditViewModel multiTextTemplateEditViewModelTp2 = this.LL.tp();
                if (editable == null || (string = editable.toString()) == null) {
                    string = "";
                }
                multiTextTemplateEditViewModelTp2.getClass();
                multiTextTemplateEditViewModelTp2.setState(new AwS76S1000000_26(string, 35));
                InterfaceC1730790v8n interfaceC1730790v8nHp = this.LL.hp();
                if (interfaceC1730790v8nHp != null) {
                    interfaceC1730790v8nHp.SK();
                }
            }
        });
        up();
    }

    public final void yp(ViewOnFocusChangeListenerC1730940v92 viewOnFocusChangeListenerC1730940v92) {
        this.LLJJIJI = viewOnFocusChangeListenerC1730940v92;
    }

    public final void zp(ViewOnFocusChangeListenerC1730940v92 viewOnFocusChangeListenerC1730940v92) {
        this.LLJJIJIIJIL = viewOnFocusChangeListenerC1730940v92;
    }
}
