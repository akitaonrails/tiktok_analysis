package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.assem.selection;

import X.C03DW;
import X.C04FN;
import X.C0H9H;
import X.C0HHT;
import X.C0QSJ;
import X.C127G;
import X.C13LE;
import X.C13LP;
import X.C1405970mgt;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C673150Qan;
import X.C687700QyG;
import X.C723830SaL;
import X.C724750Sbp;
import X.C737910Sx3;
import X.C814420VxA;
import X.InterfaceC1407210mit;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.InterfaceC687730QyJ;
import X.InterfaceC737790Swr;
import Y.AObjectS400S0100000_26;
import android.view.View;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.goda.v2.model.dto.GodaV2Style;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.assem.shared.SkuPropTitleActionScope;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.PdpFragmentScope;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.module.PdpBodyListCardReusedAssem;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS605S0100000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class SkuPropSelectionReusedAssem extends PdpBodyListCardReusedAssem<SkuPropSelectionReusedAssem, C1405970mgt> implements InterfaceC737790Swr, C0QSJ {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLFF;
    public final InterfaceC1731706qJ LLJLL;
    public View LLJLLIL;
    public C127G LLJLLL;
    public C03DW LLJZ;
    public InterfaceC1407210mit LLJZIJLIL;
    public InterfaceC665370Q7z LLL;
    public C0QSJ LLLF;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SkuPropSelectionReusedAssem.class, "viewHolderVM", "getViewHolderVM()Lcom/ss/android/ugc/aweme/ecommerce/base/pdp/us/business/sku/assem/selection/PdpSkuPropSelectionViewModel;", 0);
        C13LE.LIZ.getClass();
        LLLFF = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public SkuPropSelectionReusedAssem() {
        C0HHT c0hht = C0HHT.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PdpSkuPropSelectionViewModel.class);
        this.LLJLL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0hht, C1637806bA.LIZ, new AwS563S0100000_19(c19719912DlLIZ, 1386), null, AFwS268S0000000_26.get$arr$(242));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.az_;
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        if (cls == C03DW.class) {
            this.LLJZ = (C03DW) obj;
        } else if (cls == InterfaceC1407210mit.class) {
            this.LLJZIJLIL = (InterfaceC1407210mit) obj;
        }
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.module.PdpBodyListCardReusedAssem, X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{PdpFragmentScope.class, SkuPropTitleActionScope.class, SkuPropValueSelectionActionScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        if (cls == C03DW.class) {
            return this.LLJZ;
        }
        if (cls == InterfaceC1407210mit.class) {
            return this.LLJZIJLIL;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.module.PdpBodyListCardReusedAssem, X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList(super.getParentScopes());
        arrayList.add(PdpFragmentScope.class);
        arrayList.add(SkuPropTitleActionScope.class);
        arrayList.add(SkuPropValueSelectionActionScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SkuPropTitleActionScope.class);
        arrayList.add(SkuPropValueSelectionActionScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        if (cls == C03DW.class) {
            this.LLJZ = null;
        } else if (cls == InterfaceC1407210mit.class) {
            this.LLJZIJLIL = null;
        }
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    public final C0QSJ yp() {
        C0QSJ c0qsj = this.LLLF;
        if (c0qsj != null) {
            return c0qsj;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLL;
        if (interfaceC665370Q7zLJIIIZ == null) {
            interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
            this.LLL = interfaceC665370Q7zLJIIIZ;
        }
        C0QSJ c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{PdpFragmentScope.class});
        this.LLLF = c0qsjLIZLLL;
        return c0qsjLIZLLL;
    }

    public final PdpSkuPropSelectionViewModel zp() {
        return (PdpSkuPropSelectionViewModel) this.LLJLL.getValue(this, LLLFF[0]);
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJLLL;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJLLL;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{PdpSkuPropSelectionViewModel.class, new AObjectS400S0100000_26(this, 25)}, defaultViewModelProviderFactory);
                    this.LLJLLL = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{SkuPropTitleActionScope.class}).unbindAbility(zp(), C03DW.class);
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{SkuPropValueSelectionActionScope.class}).unbindAbility(zp(), InterfaceC1407210mit.class);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLJLLIL = view.findViewById(R.id.vhv);
        C723830SaL.LIZ(this, null, new AwS605S0100000_26(this, 239));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.module.PdpBodyListCardReusedAssem
    public final void op(C1405970mgt c1405970mgt) {
        ArrayList<Float> arrayList;
        float fFloatValue;
        Float f;
        Float f2;
        GodaV2Style godaV2Style;
        C1405970mgt c1405970mgt2 = c1405970mgt;
        C04FN c04fn = c1405970mgt2.LLJIJIL;
        if (c04fn != null && (godaV2Style = c04fn.LJIILLIIL) != null) {
            arrayList = godaV2Style.padding;
        } else {
            arrayList = null;
        }
        float fFloatValue2 = 0.0f;
        if (arrayList != null && (f2 = (Float) C13LP.LJJJLZIJ(3, arrayList)) != null) {
            fFloatValue = f2.floatValue();
        } else {
            fFloatValue = 0.0f;
        }
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(fFloatValue)));
        if (arrayList != null && (f = (Float) C13LP.LJJJLZIJ(1, arrayList)) != null) {
            fFloatValue2 = f.floatValue();
        }
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(fFloatValue2)));
        View view = this.LLJLLIL;
        if (view != null) {
            C0H9H.LJFF(-iLIZIZ, view);
        }
        View view2 = this.LLJLLIL;
        if (view2 != null) {
            C0H9H.LIZLLL(-iLIZIZ2, view2);
        }
        super.op(c1405970mgt2);
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{SkuPropTitleActionScope.class}).bindAbility(zp(), C03DW.class);
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{SkuPropValueSelectionActionScope.class}).bindAbility(zp(), InterfaceC1407210mit.class);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.module.PdpBodyListCardReusedAssem
    public final /* bridge */ /* synthetic */ void tp(C1405970mgt c1405970mgt) {
    }
}
