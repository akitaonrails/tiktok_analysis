package com.bytedance.android.livesdk.comp.impl.pcs.business.growth.onestopshop;

import X.C019F;
import X.C1138104cl;
import X.C1144504dn;
import X.C1217720hnG;
import X.C1217760hnK;
import X.C12957055f;
import X.C13LE;
import X.C1548820qPI;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1637806bA;
import X.C1734960vFW;
import X.C1766560w4U;
import X.C1820820xU0;
import X.C1820830xU1;
import X.C1821290xUl;
import X.C19719912Dl;
import X.C20736316Cj;
import X.C2217381BqS;
import X.C262100zr;
import X.C475510Ikn;
import X.C489600JHy;
import X.C723850SaN;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C772050UQh;
import X.C960203pA;
import X.InterfaceC1141530foN;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.comp.api.pcs.data.event.SMBOneStopShopEnableDMEvent;
import com.bytedance.android.livesdk.comp.api.pcs.ui.loading.IPcsLoadingAbility;
import com.bytedance.android.livesdk.comp.api.pcs.ui.loading.PcsGenericLoadingVM;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.onestopshop.vm.IPcsOneStopShopVmAbility;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.onestopshop.vm.OneStopPageVM;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tux.system.TuxImmersionBar;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class OneStopMainAssem extends UISlotAssem implements InterfaceC1141530foN {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIII;
    public final AssemVMLazy LLJJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(OneStopMainAssem.class, "vm", "getVm()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/growth/onestopshop/vm/OneStopPageVM;", 0);
        C13LE.LIZ.getClass();
        LLJJIII = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public OneStopMainAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(OneStopPageVM.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new C12957055f(c19719912DlLIZ), new C1820820xU0(), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.fyx;
    }

    public final OneStopPageVM hp() {
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIII;
        return (OneStopPageVM) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJIIJJI(C1558360qeg.LJFF(fragmentLJI, null), IPcsOneStopShopVmAbility.class, null);
        }
        if (Intrinsics.LJFF(hp().getState().LLILZIL, Boolean.TRUE)) {
            DataChannelGlobal.LLILZ.GQ2(SMBOneStopShopEnableDMEvent.class);
        }
        C1548820qPI.LJIIIIZZ("close_one_stop_shop_sheet_stack", this);
        C1548820qPI.LJIIIIZZ("service_plus_reward_claimed", this);
        C1548820qPI.LJIIIIZZ("service_plus_challenge_go_live", this);
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        String str = c262100zr.LIZ;
        int iHashCode = str.hashCode();
        if (iHashCode != -1544904852) {
            if (iHashCode != 1947307398) {
                if (iHashCode != 2098628060 || !str.equals("close_one_stop_shop_sheet_stack")) {
                    return;
                }
            } else {
                if (!str.equals("service_plus_reward_claimed")) {
                    return;
                }
                hp().vQ2(false);
                return;
            }
        } else if (!str.equals("service_plus_challenge_go_live")) {
            return;
        }
        hp().setState(new C1820830xU1());
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        boolean z;
        DataChannel dataChannelLJ;
        IPcsLoadingAbility iPcsLoadingAbility;
        super.onViewCreated(view);
        int iLIZIZ = C20736316Cj.LIZIZ(R.attr.exw, getContext());
        Context context = getContext();
        if (context != null && C960203pA.LIZIZ(context)) {
            z = true;
        } else {
            z = false;
        }
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            TuxImmersionBar tuxImmersionBarLIZLLL = C1766560w4U.LIZLLL(fragmentLJI);
            tuxImmersionBarLIZLLL.LJIIIZ(iLIZIZ);
            tuxImmersionBarLIZLLL.LIZ(true);
            tuxImmersionBarLIZLLL.LIZLLL();
        }
        view.setBackgroundColor(iLIZIZ);
        hp().LLILZ = z;
        Fragment fragmentLJI2 = C724240Sb0.LJI(this);
        PcsGenericLoadingVM pcsGenericLoadingVMDj1 = null;
        if (fragmentLJI2 != null) {
            C1558520qew.LJII(C1558360qeg.LJFF(fragmentLJI2, null), hp(), IPcsOneStopShopVmAbility.class, null, null);
        }
        C723850SaN.LIZLLL(this, new C1217720hnG(this));
        C723850SaN.LIZLLL(this, new C1217760hnK(this));
        C723850SaN.LIZLLL(this, new C1138104cl(this));
        C723850SaN.LIZLLL(this, new C1144504dn(this));
        C736680Sv4.LJIIIIZZ(this, hp(), new C2217381BqS() { // from class: X.0xTz
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1820790xTx) obj).LLIZ;
            }
        }, null, new C1821290xUl(), 6);
        Fragment fragmentLJI3 = C724240Sb0.LJI(this);
        if (fragmentLJI3 != null && (iPcsLoadingAbility = (IPcsLoadingAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI3, null), IPcsLoadingAbility.class, null)) != null) {
            pcsGenericLoadingVMDj1 = iPcsLoadingAbility.dj1(C489600JHy.LIZ, false);
        }
        C736680Sv4.LJIIIIZZ(this, hp(), new C2217381BqS() { // from class: X.0xTt
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1820790xTx) obj).LL;
            }
        }, null, new C1734960vFW(pcsGenericLoadingVMDj1, this), 6);
        hp().vQ2(true);
        hp().yQ2(0, 2);
        Fragment fragmentLJI4 = C724240Sb0.LJI(this);
        if (fragmentLJI4 != null && (dataChannelLJ = C475510Ikn.LJ(fragmentLJI4)) != null) {
            dataChannelLJ.SX0(C772050UQh.class, "service_one_stop_shop");
        }
        C1548820qPI.LIZLLL("close_one_stop_shop_sheet_stack", this);
        C1548820qPI.LIZLLL("service_plus_reward_claimed", this);
        C1548820qPI.LIZLLL("service_plus_challenge_go_live", this);
    }
}
