package com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicesku.assem.sku;

import X.AbstractC1822440xWc;
import X.C019F;
import X.C01GW;
import X.C0IJT;
import X.C0TVI;
import X.C1161920gLG;
import X.C13LE;
import X.C14K9;
import X.C1554960qZC;
import X.C1555840qac;
import X.C1558520qew;
import X.C1558930qfb;
import X.C1637806bA;
import X.C1822010xVv;
import X.C1822400xWY;
import X.C1822410xWZ;
import X.C1822420xWa;
import X.C1823300xY0;
import X.C19719912Dl;
import X.C19EH;
import X.C2217381BqS;
import X.C452501pT;
import X.C474500IjA;
import X.C490590JLt;
import X.C724240Sb0;
import X.C724750Sbp;
import X.InterfaceC1555100qZQ;
import X.InterfaceC1822460xWe;
import X.InterfaceC1822470xWf;
import X.InterfaceC1823410xYB;
import X.InterfaceC1840220xzI;
import X.InterfaceC2217461Bqa;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.livesdk.comp.api.pcs.data.ability.PcsDialogAbility;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicesku.assem.sku.PcsServiceSkuDMAssem;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicesku.viewmodel.PcsServiceSkuVM;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.IHostSubscription;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import u4.q0;

/* JADX INFO: loaded from: classes28.dex */
public final class PcsServiceSkuDMAssem extends PcsServiceSkuAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILLL;
    public final AssemVMLazy LLIZLLLIL;
    public final C01GW LLJ;
    public C1555840qac LLJI;
    public InterfaceC1822470xWf LLJIJIL;
    public boolean LLJILJIL;
    public final C01GW LLJILJILJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PcsServiceSkuDMAssem.class, "vm", "getVm()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/foundation/serviceplus/servicesku/viewmodel/PcsServiceSkuVM;", 0);
        C13LE.LIZ.getClass();
        LLJILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PcsServiceSkuDMAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PcsServiceSkuVM.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new C1558930qfb(c19719912DlLIZ), new C1822410xWZ(), null, true);
        this.LLJ = C452501pT.LIZIZ(new C1822400xWY(this));
        this.LLJILJILJ = C452501pT.LIZIZ(new C1822420xWa());
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        InterfaceC1822470xWf interfaceC1822470xWf = this.LLJIJIL;
        if (interfaceC1822470xWf != null) {
            interfaceC1822470xWf.LLLILZ();
        }
        super.onDestroy();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        String str;
        FragmentManager childFragmentManager;
        FragmentManager childFragmentManager2;
        C19EH c19ehLJIIJ;
        C1822010xVv c1822010xVv;
        C1555840qac c1555840qac;
        super.onViewCreated(view);
        C14K9.LJIJJ(LJJIJL(), new C0TVI() { // from class: X.0xWo
            @Override // X.C0TVI
            public final C20246014Ju onApplyWindowInsets(View view2, C20246014Ju c20246014Ju) {
                C20246414Jy c20246414Jy = new C20246414Jy(c20246014Ju);
                c20246414Jy.LIZ.LIZJ(7, C20244914Jj.LIZIZ(0, 0, 0, 0));
                return q0.LJIIL(view2, c20246414Jy.LIZ());
            }
        });
        PcsDialogAbility pcsDialogAbility = (PcsDialogAbility) this.LLJ.getValue();
        if (pcsDialogAbility != null) {
            pcsDialogAbility.pt0((AbstractC1822440xWc) this.LLJILJILJ.getValue());
        }
        C490590JLt c490590JLt = C490590JLt.LIZ;
        C1823300xY0 c1823300xY0LIZ = null;
        if (this.LLJI == null) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558520qew.LJIIL(this), "source_default_key", C1555840qac.class, null);
            if (interfaceC1555100qZQLIZIZ != null) {
                c1555840qac = (C1555840qac) interfaceC1555100qZQLIZIZ.getSource();
            } else {
                c1555840qac = null;
            }
            this.LLJI = c1555840qac;
        }
        C1555840qac c1555840qac2 = this.LLJI;
        if (c1555840qac2 == null || (c1822010xVv = c1555840qac2.LL) == null || (str = c1822010xVv.LJIIJJI) == null) {
            str = "";
        }
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILLL;
        Map<String, String> mapVQ2 = ((PcsServiceSkuVM) assemVMLazy.getValue()).vQ2();
        c490590JLt.getClass();
        final Fragment fragmentCreateTabletChatRootFragment = ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).createTabletChatRootFragment(C490590JLt.LIZ(str, "biz_event_tracking_extra", mapVQ2));
        if (fragmentCreateTabletChatRootFragment != null) {
            C474500IjA c474500IjALIZJ = C0IJT.LIZJ("chat_panel_show");
            c474500IjALIZJ.LJJII(String.valueOf(1), "is_single_sku");
            c474500IjALIZJ.LIZ();
            Fragment fragmentLJI = C724240Sb0.LJI(this);
            if (fragmentLJI != null && (childFragmentManager2 = fragmentLJI.getChildFragmentManager()) != null && (c19ehLJIIJ = childFragmentManager2.LJIIJ()) != null) {
                c19ehLJIIJ.LJIJ(R.id.vga, fragmentCreateTabletChatRootFragment, null);
                c19ehLJIIJ.LJIIJ();
            }
            Fragment fragmentLJI2 = C724240Sb0.LJI(this);
            if (fragmentLJI2 != null && (childFragmentManager = fragmentLJI2.getChildFragmentManager()) != null) {
                childFragmentManager.LJ(new InterfaceC1840220xzI() { // from class: X.0I0U
                    @Override // X.InterfaceC1840220xzI
                    public final void LIZ(Fragment fragment) {
                        if (Intrinsics.LJFF(fragment, fragmentCreateTabletChatRootFragment)) {
                            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C0I0R(fragment, this, null), 3);
                        }
                    }
                });
            }
        }
        InterfaceC1822460xWe interfaceC1822460xWeNN2 = ((IHostSubscription) C1161920gLG.LIZJ(IHostSubscription.class)).nN2();
        if (interfaceC1822460xWeNN2 != null) {
            c1823300xY0LIZ = interfaceC1822460xWeNN2.LIZ();
        }
        this.LLJIJIL = c1823300xY0LIZ;
        if (c1823300xY0LIZ != null) {
            c1823300xY0LIZ.LIZ(new InterfaceC1823410xYB() { // from class: X.0xWV
                @Override // X.InterfaceC1823410xYB
                public final void LIZIZ() {
                }

                @Override // X.InterfaceC1823410xYB
                public final void LIZLLL() {
                }

                @Override // X.InterfaceC1823410xYB
                public final void LIZ() {
                    PcsServiceSkuDMAssem pcsServiceSkuDMAssem = this.LIZ;
                    if (pcsServiceSkuDMAssem.LLJILJIL) {
                        return;
                    }
                    pcsServiceSkuDMAssem.LLJILJIL = true;
                    C1103300eoi.LIZLLL.LIZLLL(1, "smb_viewer_dm_open_count");
                    C1821950xVp.LIZ(new C788830Uwz(new C788820Uwy(null)));
                }

                @Override // X.InterfaceC1823410xYB
                public final void LIZJ() {
                    this.LIZ.LLJILJIL = false;
                }
            });
        }
    }
}
