package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.lazyload;

import X.AbstractC738140SxQ;
import X.AnonymousClass0956;
import X.C09R3;
import X.C0QSJ;
import X.C127G;
import X.C13LE;
import X.C1546290qLD;
import X.C1755400vmU;
import X.C1755580vmm;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C23250099c;
import X.C452070Ho5;
import X.C687700QyG;
import X.C723690Sa7;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736680Sv4;
import X.InterfaceC1761670vwb;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import Y.AObjectS400S0100000_26;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.PdpFragmentScope;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.module.PdpBodyListCardReusedAssem;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AFwS313S0000000_26;
import kotlin.jvm.internal.AwS392S0200000_26;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS605S0100000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class PdpLynxReusedAssem extends PdpBodyListCardReusedAssem<PdpLynxReusedAssem, C1755400vmU> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLF;
    public final AssemVMLazy LLJLL;
    public C1546290qLD LLJLLIL;
    public volatile InterfaceC1761670vwb LLJLLL;
    public C127G LLJZ;
    public InterfaceC665370Q7z LLJZIJLIL;
    public C0QSJ LLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PdpLynxReusedAssem.class, "itemVM", "getItemVM()Lcom/ss/android/ugc/aweme/ecommerce/base/pdp/us/core/lazyload/PdpLynxItemVM;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(PdpLynxReusedAssem.class, "pdpPageVMAbility", "getPdpPageVMAbility()Lcom/ss/android/ugc/aweme/ecommerce/base/pdp/us/core/page/ability/IPdpPageViewModelAbility;", 0);
        c09r3.getClass();
        LLLF = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.asf;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.module.PdpBodyListCardReusedAssem, X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{PdpFragmentScope.class});
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.module.PdpBodyListCardReusedAssem, X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList(super.getParentScopes());
        arrayList.add(PdpFragmentScope.class);
        return arrayList;
    }

    public final C0QSJ yp() {
        C0QSJ c0qsj = this.LLL;
        if (c0qsj != null) {
            return c0qsj;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLJZIJLIL;
        if (interfaceC665370Q7zLJIIIZ == null) {
            interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
            this.LLJZIJLIL = interfaceC665370Q7zLJIIIZ;
        }
        C0QSJ c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{PdpFragmentScope.class});
        this.LLL = c0qsjLIZLLL;
        return c0qsjLIZLLL;
    }

    public PdpLynxReusedAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PdpLynxItemVM.class);
        AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24(c19719912DlLIZ, 299);
        AFwS268S0000000_26 aFwS268S0000000_26 = AFwS268S0000000_26.get$arr$(245);
        Function0 function0LJIIJ = C724750Sbp.LJIIJ(this, c19719912DlLIZ);
        AssemVMLazy assemVMLazy = new AssemVMLazy(function0LJIIJ, awS568S0100000_24, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS568S0100000_24((AbstractC738140SxQ) this, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL), aFwS268S0000000_26, new AwS546S0100000_2((AbstractC738140SxQ) this, 1111), new C723690Sa7(this), new C723700Sa8(this));
        C724750Sbp.LIZIZ(this, function0LJIIJ, assemVMLazy);
        this.LLJLL = assemVMLazy;
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJZ;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJZ;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{PdpLynxItemVM.class, new AObjectS400S0100000_26(this, 1)}, defaultViewModelProviderFactory);
                    this.LLJZ = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        ViewGroup viewGroup;
        if (this.LLJLLIL == null) {
            View contentView = getContentView();
            if ((contentView instanceof ViewGroup) && (viewGroup = (ViewGroup) contentView) != null) {
                this.LLJLLIL = new C1546290qLD(viewGroup, new AwS392S0200000_26(viewGroup, this, 44));
            }
        }
        AssemVMLazy assemVMLazy = this.LLJLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLF;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0vmn
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1755560vmk) obj).LL;
            }
        }, null, AFwS313S0000000_26.get$arr$(7), 6);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.module.PdpBodyListCardReusedAssem
    public final void tp(C1755400vmU c1755400vmU) {
        C1755400vmU c1755400vmU2 = c1755400vmU;
        AssemVMLazy assemVMLazy = this.LLJLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLF;
        PdpLynxItemVM pdpLynxItemVM = (PdpLynxItemVM) assemVMLazy.getValue();
        String str = c1755400vmU2.LLIZLLLIL;
        pdpLynxItemVM.LLILLL = str;
        pdpLynxItemVM.setState(new AwS605S0100000_26(c1755400vmU2, 242));
        AnonymousClass0956 anonymousClass0956 = pdpLynxItemVM.LLILLJJLI;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        String str2 = c1755400vmU2.LLILZLL;
        if (str2.length() > 0) {
            pdpLynxItemVM.LLILLJJLI = C23250099c.LIZLLL(pdpLynxItemVM.getAssemVMScope(), null, null, new C1755580vmm(pdpLynxItemVM, str2, str, c1755400vmU2, null), 3);
        }
    }
}
