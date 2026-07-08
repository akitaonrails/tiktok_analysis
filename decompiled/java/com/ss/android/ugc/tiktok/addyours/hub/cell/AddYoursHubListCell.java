package com.ss.android.ugc.tiktok.addyours.hub.cell;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C0OEI;
import X.C13LE;
import X.C19719912Dl;
import X.C20742916Ex;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452080Ho6;
import X.C452501pT;
import X.C737910Sx3;
import X.InterfaceC20631915oL;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC665370Q7z;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.AssemPowerCell;
import com.ss.android.ugc.tiktok.addyours.hub.assem.AddYoursHubListAssem;
import com.ss.android.ugc.tiktok.addyours.hub.viewmodel.AddYoursHubTabViewModel;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS434S0200000_33;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class AddYoursHubListCell extends AssemPowerCell<AddYoursHubListAssem, C0OEI> implements InterfaceC20631915oL {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJ;
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS577S0100000_33(this, 3756));
    public final AssemVMLazy LLIZLLLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AddYoursHubListCell.class, "hubTabViewModel", "getHubTabViewModel()Lcom/ss/android/ugc/tiktok/addyours/hub/viewmodel/AddYoursHubTabViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC20631915oL
    public final void Z4() {
    }

    public AddYoursHubListCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(AddYoursHubTabViewModel.class);
        AwS577S0100000_33 awS577S0100000_33 = new AwS577S0100000_33(c19719912DlLIZ, 3771);
        AFwS279S0000000_33 aFwS279S0000000_33 = AFwS279S0000000_33.get$arr$(265);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 3782), awS577S0100000_33, AFwS224S0000000_33.get$arr$(531), new AwS577S0100000_33((C03K6) this, 3757), new AwS577S0100000_33((C03K6) this, 3759), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 3761), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 3763), null, new AwS577S0100000_33((C03K6) this, 3764));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS577S0100000_33 awS577S0100000_332 = new AwS577S0100000_33((C03K6) this, 3758);
            AwS577S0100000_33 awS577S0100000_333 = new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 3760);
            AwS577S0100000_33 awS577S0100000_334 = new AwS577S0100000_33(c19719912DlLIZ, 3762);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS434S0200000_33((InterfaceC451590HnJ) obj, awS577S0100000_332, 147));
            AwS577S0100000_33 awS577S0100000_335 = new AwS577S0100000_33(c01gwLIZIZ, 3765);
            AwS577S0100000_33 awS577S0100000_336 = new AwS577S0100000_33(c01gwLIZIZ, 3766);
            AwS577S0100000_33 awS577S0100000_337 = new AwS577S0100000_33(c01gwLIZIZ, 3767);
            AwS577S0100000_33 awS577S0100000_338 = new AwS577S0100000_33(c01gwLIZIZ, 3768);
            AwS577S0100000_33 awS577S0100000_339 = new AwS577S0100000_33(c01gwLIZIZ, 3769);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS577S0100000_334, awS577S0100000_33, new C452080Ho6(), awS577S0100000_335, awS577S0100000_336, awS577S0100000_333, aFwS279S0000000_33, awS577S0100000_337, awS577S0100000_338, awS577S0100000_339);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 3770), awS577S0100000_33, AFwS224S0000000_33.get$arr$(532), new AwS577S0100000_33((C03K6) this, 3772), new AwS577S0100000_33((C03K6) this, 3773), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 3774), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 3775), null, new AwS577S0100000_33((C03K6) this, 3776));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 3777), awS577S0100000_33, AFwS224S0000000_33.get$arr$(533), new AwS577S0100000_33((C03K6) this, 3778), new AwS577S0100000_33((C03K6) this, 3779), new AwS577S0100000_33((C03K6) this, 3780), aFwS279S0000000_33, null, null, new AwS577S0100000_33((C03K6) this, 3781));
        }
        this.LLIZLLLIL = assemVMLazy;
    }

    @Override // com.bytedance.ext_power_list.AssemPowerCell
    public final ReusedUISlotAssem I5() {
        return new AddYoursHubListAssem();
    }

    @Override // com.bytedance.ext_power_list.AssemPowerCell, X.InterfaceC713360RyY
    public final InterfaceC665370Q7z k0() {
        return (InterfaceC665370Q7z) this.LLIZ.getValue();
    }

    @Override // com.bytedance.ext_power_list.AssemPowerCell, com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        this.LL = C20742916Ex.LIZ(viewGroup.getContext(), ((ReusedUISlotAssem) NG1()).Oo(), viewGroup, false, -1);
        Sl0(LJJIJL(), this);
        return LJJIJL();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC20631915oL
    public final void onPageSelected(int i) {
        Integer numValueOf;
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJ;
        AssemViewModel value = assemVMLazy.getValue();
        C0OEI c0oei = (C0OEI) getItem();
        if (c0oei != null && (numValueOf = Integer.valueOf(c0oei.LL)) != null) {
            numValueOf.intValue();
            value.setState(new AwS588S0100000_9(numValueOf, 604));
        }
    }
}
