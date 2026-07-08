package com.ss.android.ugc.aweme.im.creative.edit.impl.filter;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C09R3;
import X.C0QSJ;
import X.C127G;
import X.C13LE;
import X.C19719912Dl;
import X.C2174131A6x;
import X.C2217381BqS;
import X.C452070Ho5;
import X.C452501pT;
import X.C687700QyG;
import X.C723690Sa7;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C786410Ut5;
import X.InterfaceC1146704e9;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import Y.ACListenerS158S0100000_24;
import Y.AObjectS398S0100000_24;
import android.view.View;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.im.creative.edit.impl.ui.IMEditPageScope;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class IMEditFilterAssem extends UIContentAssem implements InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILLL;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 592));
    public final AssemVMLazy LLJ;
    public volatile C2174131A6x LLJI;
    public C127G LLJIJIL;
    public InterfaceC665370Q7z LLJILJIL;
    public C0QSJ LLJILJILJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(IMEditFilterAssem.class, "featureGraph", "getFeatureGraph()Lcom/ss/android/ugc/aweme/im/creative/edit/impl/di/IMEditFeatureGraph;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(IMEditFilterAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/im/creative/edit/impl/filter/IMEditFilterToolVM;", 0);
        c09r3.getClass();
        LLJILLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{IMEditPageScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(IMEditPageScope.class);
        return arrayList;
    }

    public final C2174131A6x Go() throws IllegalAccessException {
        C0QSJ c0qsjLIZLLL = this.LLJILJILJ;
        if (c0qsjLIZLLL == null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLJILJIL;
            if (interfaceC665370Q7zLJIIIZ == null) {
                interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
                this.LLJILJIL = interfaceC665370Q7zLJIIIZ;
            }
            c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{IMEditPageScope.class});
            this.LLJILJILJ = c0qsjLIZLLL;
            if (c0qsjLIZLLL == null) {
                return null;
            }
        }
        C2174131A6x c2174131A6x = (C2174131A6x) c0qsjLIZLLL.getAbility(C2174131A6x.class);
        C687700QyG.LJ(c2174131A6x, C2174131A6x.class);
        return c2174131A6x;
    }

    public IMEditFilterAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(IMEditFilterToolVM.class);
        AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24(c19719912DlLIZ, 593);
        AFwS264S0000000_24 aFwS264S0000000_24 = AFwS264S0000000_24.get$arr$(176);
        Function0 function0LJIIJ = C724750Sbp.LJIIJ(this, c19719912DlLIZ);
        AssemVMLazy assemVMLazy = new AssemVMLazy(function0LJIIJ, awS568S0100000_24, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS568S0100000_24((AbstractC738140SxQ) this, 594), aFwS264S0000000_24, new AwS546S0100000_2((AbstractC738140SxQ) this, 1111), new C723690Sa7(this), new C723700Sa8(this));
        C724750Sbp.LIZIZ(this, function0LJIIJ, assemVMLazy);
        this.LLJ = assemVMLazy;
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJIJIL;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJIJIL;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{IMEditFilterToolVM.class, new AObjectS398S0100000_24(this, 6)}, defaultViewModelProviderFactory);
                    this.LLJIJIL = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C786410Ut5.I7(new ACListenerS158S0100000_24(this, 20), view);
    }
}
