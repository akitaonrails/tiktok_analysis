package com.ss.android.ugc.tiktok.im.contact.selector.impl.assem;

import X.C019F;
import X.C01GW;
import X.C0QSJ;
import X.C1223620hwm;
import X.C127G;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452501pT;
import X.C687700QyG;
import X.C723850SaN;
import X.C724750Sbp;
import X.InterfaceC1146704e9;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import Y.AObjectS393S0100000_19;
import android.view.View;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.ss.android.ugc.tiktok.im.contact.selector.api.scope.ContactSelectorFragmentScope;
import com.ss.android.ugc.tiktok.im.contact.selector.impl.vm.SelectorContainerVM;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS598S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class SelectorSearchPageContainerAssem extends UISlotAssem implements InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJIL;
    public final C01GW LLJJI = C1223620hwm.LIZLLL(this);
    public final C01GW LLJJIII = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2624));
    public final C01GW LLJJIJI;
    public C127G LLJJIJIIJIL;
    public InterfaceC665370Q7z LLJJIJIL;
    public C0QSJ LLJJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SelectorSearchPageContainerAssem.class, "selectorContainerVM", "getSelectorContainerVM()Lcom/ss/android/ugc/tiktok/im/contact/selector/impl/vm/SelectorContainerVM;", 0);
        C13LE.LIZ.getClass();
        LLJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public SelectorSearchPageContainerAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SelectorContainerVM.class);
        C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS563S0100000_19(c19719912DlLIZ, 2625), AFwS257S0000000_19.get$arr$(521), null, true);
        this.LLJJIJI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2623));
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.cga;
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

    public final C0QSJ hp() throws IllegalAccessException {
        C0QSJ c0qsj = this.LLJJJ;
        if (c0qsj != null) {
            return c0qsj;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLJJIJIL;
        if (interfaceC665370Q7zLJIIIZ == null) {
            interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
            this.LLJJIJIL = interfaceC665370Q7zLJIIIZ;
        }
        C0QSJ c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{ContactSelectorFragmentScope.class});
        this.LLJJJ = c0qsjLIZLLL;
        return c0qsjLIZLLL;
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJJIJIIJIL;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJJIJIIJIL;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{SelectorContainerVM.class, new AObjectS393S0100000_19(this, 8)}, defaultViewModelProviderFactory);
                    this.LLJJIJIIJIL = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        C723850SaN.LIZLLL(this, new AwS598S0100000_19(this, 502));
    }
}
