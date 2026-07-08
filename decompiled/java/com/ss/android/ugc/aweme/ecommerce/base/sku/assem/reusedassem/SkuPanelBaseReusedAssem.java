package com.ss.android.ugc.aweme.ecommerce.base.sku.assem.reusedassem;

import X.AnonymousClass0446;
import X.C019F;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C724240Sb0;
import X.C724750Sbp;
import X.InterfaceC1587906Jp;
import X.InterfaceC2217461Bqa;
import X.InterfaceC712990Rxx;
import X.InterfaceC874703bN;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.ecommerce.base.sku.BaseSkuFragment;
import com.ss.android.ugc.aweme.ecommerce.base.sku.assem.reusedassem.SkuPanelBaseReusedAssem;
import com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuPanelAssemVM;
import java.util.List;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: loaded from: classes27.dex */
public abstract class SkuPanelBaseReusedAssem<T extends SkuPanelBaseReusedAssem<T, I>, I> extends ReusedUISlotAssem<T> implements InterfaceC712990Rxx<I>, InterfaceC874703bN {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJL;
    public final AssemVMLazy LLJJLIIIJLLLLLLLZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SkuPanelBaseReusedAssem.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/sku/vm/SkuPanelAssemVM;", 0);
        C13LE.LIZ.getClass();
        LLJL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public SkuPanelBaseReusedAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SkuPanelAssemVM.class);
        this.LLJJLIIIJLLLLLLLZ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS568S0100000_24(c19719912DlLIZ, 329), AFwS268S0000000_26.get$arr$(252), null, true);
    }

    public void Ap() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final boolean ur(I i) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final void vr(I i) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public void zp() {
    }

    @Override // X.InterfaceC874703bN
    /* JADX INFO: renamed from: yp, reason: merged with bridge method [inline-methods] */
    public final SkuPanelAssemVM getViewModel() {
        AssemVMLazy assemVMLazy = this.LLJJLIIIJLLLLLLLZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJL;
        return (SkuPanelAssemVM) assemVMLazy.getValue();
    }

    @Override // X.InterfaceC874703bN
    public final View n9() {
        return getContentView();
    }

    public final Context sp() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        "Required value was null.".toString();
        throw new IllegalStateException("Required value was null.");
    }

    public final BaseSkuFragment<?> tp() {
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            return (BaseSkuFragment) fragmentLJI;
        }
        "Required value was null.".toString();
        throw new IllegalStateException("Required value was null.");
    }

    public final AnonymousClass0446 up() {
        return getViewModel().Zf2();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        Ap();
        zp();
    }

    /* JADX WARN: Incorrect return type in method signature: <T:Landroid/view/View;>(I)TT; */
    public final View op(int i) {
        return getContentView().findViewById(i);
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
