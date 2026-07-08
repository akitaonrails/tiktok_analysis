package com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.newui.assem;

import X.AbstractC1585810rMx;
import X.C019F;
import X.C01GW;
import X.C09R3;
import X.C1097400efC;
import X.C1147800fyU;
import X.C1149604ec;
import X.C13LE;
import X.C1554960qZC;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1637906bB;
import X.C16F5;
import X.C1822280xWM;
import X.C1822330xWR;
import X.C1822360xWU;
import X.C1822520xWk;
import X.C1822730xX5;
import X.C1822870xXJ;
import X.C1822880xXK;
import X.C1823080xXe;
import X.C1823100xXg;
import X.C1823290xXz;
import X.C1823360xY6;
import X.C1823370xY7;
import X.C19719912Dl;
import X.C20441214yg;
import X.C20603715jn;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452501pT;
import X.C497740JfY;
import X.C500260Jjc;
import X.C723590SZx;
import X.C723850SaN;
import X.C724750Sbp;
import X.C736680Sv4;
import X.EnumC1123040fKY;
import X.InterfaceC1555100qZQ;
import X.InterfaceC1785270wYf;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.comp.api.pcs.data.ability.PcsDialogAbility;
import com.bytedance.android.livesdk.comp.api.pcs.data.event.PcsCoursePurchaseSuccess;
import com.bytedance.android.livesdk.comp.api.pcs.data.setting.LivePcsServiceBioRevampOptSetting;
import com.bytedance.android.livesdk.comp.api.pcs.ui.loading.IPcsLoadingAbility;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.common.assem.infoheader.PcsServiceInfoHeaderVM;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.newui.assem.PcsServiceBioContentAssemV2;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.newui.powerlist.cells.ServiceBioActionCell;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.newui.powerlist.cells.ServiceBioCalendarCell;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.newui.powerlist.cells.ServiceBioCalendarSectionCell;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.newui.powerlist.cells.ServiceBioCourseCell;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.newui.powerlist.cells.ServiceBioCourseSectionCell;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.newui.powerlist.cells.ServiceBioDMCell;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.newui.powerlist.cells.ServiceBioFormCell;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.newui.powerlist.cells.ServiceBioFormSectionCell;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.newui.powerlist.cells.ServiceBioProfileHeaderCell;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.newui.powerlist.cells.ServiceBioSectionHeaderCell;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.newui.powerlist.cells.ServiceBioThirdPartyLinkCell;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.newui.viewmodel.PcsServiceBioVMV2;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.page.config.OptimizeAbility;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes28.dex */
public final class PcsServiceBioContentAssemV2 extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLF;
    public final C1559260qg8 LLJJI = new C1559260qg8(new C723590SZx(this, C1823290xXz.class, null), checkSupervisorPrepared());
    public final AssemVMLazy LLJJIII;
    public final AssemVMLazy LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public C1822330xWR LLJJJ;
    public C1147800fyU LLJJJIL;
    public ValueAnimator LLJJJJ;
    public ValueAnimator LLJJJJJIL;
    public ViewGroup LLJJJJLIIL;
    public View LLJJL;
    public ViewOnAttachStateChangeListenerC20604515jv LLJJLIIIJLLLLLLLZ;
    public ViewGroup LLJL;
    public ViewGroup LLJLIL;
    public C16F5 LLJLILLLLZIIL;
    public View LLJLL;
    public ViewGroup LLJLLIL;
    public View LLJLLL;
    public View LLJZ;
    public ViewGroup LLJZIJLIL;
    public C16F5 LLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PcsServiceBioContentAssemV2.class, "vm", "getVm()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/foundation/serviceplus/servicebio/newui/viewmodel/PcsServiceBioVMV2;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(PcsServiceBioContentAssemV2.class, "headerVM", "getHeaderVM()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/foundation/serviceplus/common/assem/infoheader/PcsServiceInfoHeaderVM;", 0);
        c09r3.getClass();
        LLLF = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public PcsServiceBioContentAssemV2() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PcsServiceBioVMV2.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJJIII = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new C1822870xXJ(c19719912DlLIZ), new C1823360xY6(), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(PcsServiceInfoHeaderVM.class);
        this.LLJJIJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new C1822880xXK(c19719912DlLIZ2), new C1823370xY7(), null, true);
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new C1823080xXe(this));
        this.LLJJIJIL = C452501pT.LIZIZ(new C1823100xXg(this));
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.fz0;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        this.LLJJLIIIJLLLLLLLZ = null;
        C1147800fyU c1147800fyU = this.LLJJJIL;
        if (c1147800fyU != null) {
            C1097400efC.LIZJ(c1147800fyU);
        }
        super.onDestroy();
    }

    public final ViewOnAttachStateChangeListenerC20604515jv getPowerList() {
        View viewFindViewById = this.LLJJLIIIJLLLLLLLZ;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.rn0) : null;
            this.LLJJLIIIJLLLLLLLZ = (ViewOnAttachStateChangeListenerC20604515jv) viewFindViewById;
        }
        return (ViewOnAttachStateChangeListenerC20604515jv) viewFindViewById;
    }

    public final ViewGroup hp() {
        View viewFindViewById = this.LLJL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.opu) : null;
            this.LLJL = (ViewGroup) viewFindViewById;
        }
        return (ViewGroup) viewFindViewById;
    }

    public final ViewGroup ip() {
        View viewFindViewById = this.LLJLLIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.vcm) : null;
            this.LLJLLIL = (ViewGroup) viewFindViewById;
        }
        return (ViewGroup) viewFindViewById;
    }

    public final C1822330xWR kp() {
        if (this.LLJJJ == null) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558520qew.LJIIL(this), "source_default_key", C1822330xWR.class, null);
            this.LLJJJ = interfaceC1555100qZQLIZIZ != null ? (C1822330xWR) interfaceC1555100qZQLIZIZ.getSource() : null;
        }
        return this.LLJJJ;
    }

    public final PcsServiceBioVMV2 lp() {
        AssemVMLazy assemVMLazy = this.LLJJIII;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLF;
        return (PcsServiceBioVMV2) assemVMLazy.getValue();
    }

    public final void op() {
        IPcsLoadingAbility iPcsLoadingAbility = (IPcsLoadingAbility) this.LLJJIJIL.getValue();
        if (iPcsLoadingAbility != null) {
            iPcsLoadingAbility.LJJJJL();
        }
        PcsDialogAbility pcsDialogAbility = (PcsDialogAbility) this.LLJJIJIIJIL.getValue();
        if (pcsDialogAbility != null) {
            pcsDialogAbility.dY1();
        }
        C500260Jjc.LLFFF(getContentView());
        ViewGroup viewGroup = this.LLJJJJLIIL;
        if (viewGroup != null) {
            C500260Jjc.LLFFF(viewGroup);
        }
    }

    public static String mp(InterfaceC1785270wYf interfaceC1785270wYf) {
        String strLJ = interfaceC1785270wYf.LJ();
        if (strLJ != null && strLJ.length() > 0) {
            return strLJ;
        }
        Integer numLIZLLL = interfaceC1785270wYf.LIZLLL();
        if (numLIZLLL == null) {
            return null;
        }
        return C497740JfY.LJIJI(numLIZLLL.intValue());
    }

    @Override // X.AbstractC738140SxQ
    public final void onPreload(boolean z) {
        super.onPreload(z);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPreload isPreload:");
        sbLIZ.append(z);
        C20441214yg.LIZIZ("PcsServiceBioContentAssemV2", C2188811AlT.LIZIZ(sbLIZ));
        C723850SaN.LIZLLL(this, new C1149604ec(this));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C20441214yg.LIZIZ("PcsServiceBioContentAssemV2", "onViewCreated");
        attachPreload();
        LivePcsServiceBioRevampOptSetting livePcsServiceBioRevampOptSetting = LivePcsServiceBioRevampOptSetting.INSTANCE;
        if (livePcsServiceBioRevampOptSetting.enableOpeningAnimationOpt()) {
            C500260Jjc.LJIILLIIL(getContentView());
        }
        final ViewOnAttachStateChangeListenerC20604515jv powerList = getPowerList();
        if (powerList != null) {
            int i = 4;
            int i2 = 1;
            char c = 1;
            if (livePcsServiceBioRevampOptSetting.enablePreloadUI()) {
                C20603715jn c20603715jn = new C20603715jn();
                c20603715jn.LJIIIIZZ = new OptimizeAbility(i2, c == true ? 1 : 0, null, i);
                c20603715jn.LJIJ = true;
                powerList.setListConfig(c20603715jn);
            }
            powerList.LJIILJJIL(ServiceBioProfileHeaderCell.class, ServiceBioSectionHeaderCell.class, ServiceBioCourseCell.class, ServiceBioFormCell.class, ServiceBioCalendarCell.class, ServiceBioDMCell.class, ServiceBioCourseSectionCell.class, ServiceBioFormSectionCell.class, ServiceBioCalendarSectionCell.class, ServiceBioActionCell.class, ServiceBioThirdPartyLinkCell.class);
            powerList.setLayoutManager(new LinearLayoutManager(powerList.getContext(), 1, false));
            powerList.addOnScrollListener(new AbstractC1585810rMx() { // from class: X.0xXF
                public boolean LL = true;

                @Override // X.AbstractC1585810rMx
                public final void LJJIIJ(RecyclerView recyclerView, int i3) {
                    PcsServiceBioContentAssemV2 pcsServiceBioContentAssemV2;
                    ViewGroup viewGroupHp;
                    float fFloatValue;
                    Float f;
                    if (!this.LL) {
                        return;
                    }
                    if (!powerList.canScrollVertically(1) && !powerList.canScrollVertically(-1)) {
                        this.LL = false;
                        return;
                    }
                    if (i3 != 0) {
                        if ((i3 != 1 && i3 != 2) || (viewGroupHp = (pcsServiceBioContentAssemV2 = this).hp()) == null) {
                            return;
                        }
                        ValueAnimator valueAnimator = pcsServiceBioContentAssemV2.LLJJJJ;
                        if ((valueAnimator != null && valueAnimator.isStarted()) || viewGroupHp.getAlpha() == 0.0f || !C500260Jjc.LJJJJIZL(viewGroupHp)) {
                            return;
                        }
                        ValueAnimator valueAnimator2 = pcsServiceBioContentAssemV2.LLJJJJJIL;
                        if (valueAnimator2 != null) {
                            valueAnimator2.cancel();
                        }
                        ValueAnimator valueAnimator3 = pcsServiceBioContentAssemV2.LLJJJJJIL;
                        Object animatedValue = null;
                        if (valueAnimator3 != null) {
                            animatedValue = valueAnimator3.getAnimatedValue();
                        }
                        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
                            fFloatValue = f.floatValue();
                        } else {
                            fFloatValue = 1.0f;
                        }
                        ValueAnimator valueAnimatorLIZ = C740310T2f.LIZ(viewGroupHp, fFloatValue, 0.0f, 0L, new C1823500xYK());
                        valueAnimatorLIZ.start();
                        pcsServiceBioContentAssemV2.LLJJJJ = valueAnimatorLIZ;
                        return;
                    }
                    PcsServiceBioContentAssemV2 pcsServiceBioContentAssemV22 = this;
                    ViewGroup viewGroupHp2 = pcsServiceBioContentAssemV22.hp();
                    if (viewGroupHp2 == null) {
                        return;
                    }
                    ValueAnimator valueAnimator4 = pcsServiceBioContentAssemV22.LLJJJJJIL;
                    if (valueAnimator4 != null && valueAnimator4.isStarted()) {
                        return;
                    }
                    ValueAnimator valueAnimatorLIZ2 = C740310T2f.LIZ(viewGroupHp2, 0.0f, 1.0f, 400L, new C1823330xY3(pcsServiceBioContentAssemV22));
                    valueAnimatorLIZ2.start();
                    pcsServiceBioContentAssemV22.LLJJJJJIL = valueAnimatorLIZ2;
                }
            });
        }
        ((C1823290xXz) this.LLJJI.getValue()).LLILLJJLI = new C1822520xWk(this);
        C736680Sv4.LJIIIIZZ(this, lp(), new C2217381BqS() { // from class: X.0Kcj
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1156510gCX) obj).LL;
            }
        }, null, new C1822280xWM(this), 6);
        DataChannelGlobal.LLILZ.BQ2(this, this, PcsCoursePurchaseSuccess.class, new C1822360xWU(this));
        C1822730xX5.LJ(EnumC1123040fKY.SERVICE_PLUS, kp());
    }
}
