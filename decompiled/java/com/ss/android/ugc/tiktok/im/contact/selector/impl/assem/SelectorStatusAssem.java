package com.ss.android.ugc.tiktok.im.contact.selector.impl.assem;

import X.C019F;
import X.C01GW;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C23250099c;
import X.C452501pT;
import X.C687700QyG;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.C861390Xqj;
import X.InterfaceC1146704e9;
import X.InterfaceC1223270hwD;
import X.InterfaceC2217461Bqa;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.tiktok.im.contact.selector.api.scope.ContactSelectorFragmentScope;
import com.ss.android.ugc.tiktok.im.contact.selector.impl.vm.SelectorStatusVM;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS633S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class SelectorStatusAssem extends UIContentAssem implements InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public final AssemVMLazy LLIZLLLIL;
    public final C01GW LLJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SelectorStatusAssem.class, "selectorStatusVM", "getSelectorStatusVM()Lcom/ss/android/ugc/tiktok/im/contact/selector/impl/vm/SelectorStatusVM;", 0);
        C13LE.LIZ.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public SelectorStatusAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SelectorStatusVM.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS563S0100000_19(c19719912DlLIZ, 2630), AFwS257S0000000_19.get$arr$(523), null, true);
        this.LLJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2629));
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{ContactSelectorFragmentScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ContactSelectorFragmentScope.class);
        return arrayList;
    }

    public final InterfaceC1223270hwD Go() {
        return (InterfaceC1223270hwD) this.LLJ.getValue();
    }

    public final void Ho(View view) {
        ViewGroup viewGroup;
        if (view != null) {
            View viewLJJIJL = LJJIJL();
            if ((viewLJJIJL instanceof ViewGroup) && (viewGroup = (ViewGroup) viewLJJIJL) != null) {
                C786410Ut5.LJJJJI(viewGroup);
                viewGroup.addView(view);
            }
            C786410Ut5.LJLLLLLL(0, LJJIJL());
            return;
        }
        C786410Ut5.LJLLLLLL(8, LJJIJL());
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJI;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0hwE
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1223260hwC) obj).LL;
            }
        }, C736820SvI.LIZLLL(), new AwS633S0100000_19(this, 205), 4);
        if (Go().LIZIZ()) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C861390Xqj(this, null), 3);
        }
    }
}
