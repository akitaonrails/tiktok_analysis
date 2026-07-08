package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.assem;

import X.C09R3;
import X.C0HHT;
import X.C0QSJ;
import X.C127G;
import X.C13LE;
import X.C1637806bA;
import X.C1762010vx9;
import X.C1762240vxW;
import X.C1770850wBP;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C448330Hi3;
import X.C684570QtD;
import X.C687700QyG;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C737910Sx3;
import X.InterfaceC1146704e9;
import X.InterfaceC1587906Jp;
import X.InterfaceC1731706qJ;
import X.InterfaceC1755020vls;
import X.InterfaceC1761670vwb;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.InterfaceC712990Rxx;
import Y.AObjectS400S0100000_26;
import android.view.View;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.PdpCarouselScope;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.PdpFragmentScope;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AFwS313S0000000_26;
import kotlin.jvm.internal.AFwS348S0000000_26;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: loaded from: classes27.dex */
public final class PdpCarouselFindSimilarLabelAssem extends ReusedUISlotAssem<PdpCarouselFindSimilarLabelAssem> implements InterfaceC712990Rxx<C1762010vx9>, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJZ;
    public C684570QtD LLJJLIIIJLLLLLLLZ;
    public final InterfaceC1731706qJ LLJL;
    public volatile InterfaceC1755020vls LLJLIL;
    public volatile InterfaceC1761670vwb LLJLILLLLZIIL;
    public C127G LLJLL;
    public InterfaceC665370Q7z LLJLLIL;
    public C0QSJ LLJLLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PdpCarouselFindSimilarLabelAssem.class, "configCenter", "getConfigCenter()Lcom/ss/android/ugc/aweme/ecommerce/base/pdp/us/core/page/ability/IPdpConfigurationAbility;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(PdpCarouselFindSimilarLabelAssem.class, "pdpVMAbility", "getPdpVMAbility()Lcom/ss/android/ugc/aweme/ecommerce/base/pdp/us/core/page/ability/IPdpPageViewModelAbility;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(PdpCarouselFindSimilarLabelAssem.class, "viewHolderVM", "getViewHolderVM()Lcom/ss/android/ugc/aweme/ecommerce/base/pdp/us/business/carousel/assem/PdpCarouselViewModel;", 0);
        c09r3.getClass();
        LLJZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    public PdpCarouselFindSimilarLabelAssem() {
        C0HHT c0hht = C0HHT.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PdpCarouselViewModel.class);
        this.LLJL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0hht, C1637806bA.LIZ, new AwS568S0100000_24(c19719912DlLIZ, 290), null, AFwS268S0000000_26.get$arr$(220));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.at5;
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{PdpFragmentScope.class, PdpCarouselScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(PdpFragmentScope.class);
        arrayList.add(PdpCarouselScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final C0QSJ op() {
        C0QSJ c0qsj = this.LLJLLL;
        if (c0qsj != null) {
            return c0qsj;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLJLLIL;
        if (interfaceC665370Q7zLJIIIZ == null) {
            interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
            this.LLJLLIL = interfaceC665370Q7zLJIIIZ;
        }
        C0QSJ c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{PdpFragmentScope.class});
        this.LLJLLL = c0qsjLIZLLL;
        return c0qsjLIZLLL;
    }

    public final InterfaceC1761670vwb sp() {
        InterfaceC1761670vwb interfaceC1761670vwb;
        InterfaceC1761670vwb interfaceC1761670vwb2 = this.LLJLILLLLZIIL;
        if (interfaceC1761670vwb2 == null) {
            synchronized (this) {
                interfaceC1761670vwb2 = this.LLJLILLLLZIIL;
                if (interfaceC1761670vwb2 == null) {
                    C0QSJ c0qsjOp = op();
                    if (c0qsjOp != null) {
                        interfaceC1761670vwb = (InterfaceC1761670vwb) c0qsjOp.getAbility(InterfaceC1761670vwb.class);
                        C687700QyG.LJ(interfaceC1761670vwb, InterfaceC1761670vwb.class);
                    } else {
                        interfaceC1761670vwb = null;
                    }
                    this.LLJLILLLLZIIL = interfaceC1761670vwb;
                    return interfaceC1761670vwb;
                }
            }
        }
        return interfaceC1761670vwb2;
    }

    public final PdpCarouselViewModel tp() {
        return (PdpCarouselViewModel) this.LLJL.getValue(this, LLJZ[2]);
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJLL;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJLL;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{PdpCarouselViewModel.class, new AObjectS400S0100000_26(this, 16)}, defaultViewModelProviderFactory);
                    this.LLJLL = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLJJLIIIJLLLLLLLZ = (C684570QtD) getContentView().findViewById(R.id.tfd);
        C736680Sv4.LJIIIZ(this, tp(), new C2217381BqS() { // from class: X.0vxc
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1761940vx2) obj).LL;
            }
        }, new C2217381BqS() { // from class: X.0HiB
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1761940vx2) obj).LLILLL;
            }
        }, null, AFwS348S0000000_26.get$arr$(9), 12);
        PdpCarouselViewModel pdpCarouselViewModelTp = tp();
        C1762240vxW c1762240vxW = new C2217381BqS() { // from class: X.0vxW
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1761940vx2) obj).LLILZ);
            }
        };
        C1770850wBP c1770850wBP = new C1770850wBP();
        c1770850wBP.LIZ = true;
        c1770850wBP.LIZ(true);
        C736680Sv4.LJIIIIZZ(this, pdpCarouselViewModelTp, c1762240vxW, c1770850wBP, AFwS313S0000000_26.get$arr$(51), 4);
        PdpCarouselViewModel pdpCarouselViewModelTp2 = tp();
        C448330Hi3 c448330Hi3 = new C2217381BqS() { // from class: X.0Hi3
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1761940vx2) obj).LLIZ;
            }
        };
        C1770850wBP c1770850wBP2 = new C1770850wBP();
        c1770850wBP2.LIZ = true;
        c1770850wBP2.LIZ(true);
        C736680Sv4.LJIIIIZZ(this, pdpCarouselViewModelTp2, c448330Hi3, c1770850wBP2, AFwS313S0000000_26.get$arr$(53), 4);
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C1762010vx9 c1762010vx9) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(C1762010vx9 c1762010vx9) {
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C1762010vx9 c1762010vx9) {
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void up(X.C1762010vx9 r6, int r7) {
        /*
            r5 = this;
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.CarouselElement> r0 = r6.LL
            java.lang.Object r1 = X.C13LP.LJJJLZIJ(r7, r0)
            com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.CarouselElement r1 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.CarouselElement) r1
            X.0QtD r0 = r5.LLJJLIIIJLLLLLLLZ
            if (r0 == 0) goto Lf
            r0.setCurrentIndex(r7)
        Lf:
            boolean r0 = r6.LLJILLL
            if (r0 == 0) goto L67
            if (r1 == 0) goto L70
            com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.CarouselWidgetKeys r0 = r1.carouselWidgetKeys
            if (r0 == 0) goto L70
            java.util.List<java.lang.String> r1 = r0.pdpCarouselWidgetKeys
        L1b:
            r4 = 0
            if (r1 == 0) goto L70
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L70
            java.util.Iterator r3 = r1.iterator()
        L28:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L70
            java.lang.Object r1 = r3.next()
            java.util.Map<java.lang.String, com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.CarouselWidget> r0 = r6.LLILZIL
            if (r0 == 0) goto L28
            java.lang.Object r0 = r0.get(r1)
            com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.CarouselWidget r0 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.CarouselWidget) r0
            if (r0 == 0) goto L28
            java.lang.Integer r2 = r0.widgetType
            X.0vxL r0 = X.EnumC1762130vxL.LEGACY_FIND_SIMILAR
            int r1 = r0.getValue()
            if (r2 == 0) goto L28
            int r0 = r2.intValue()
            if (r0 != r1) goto L28
            X.0vwb r0 = r5.sp()
            com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel r2 = r0.lX()
            X.0QtD r0 = r5.LLJJLIIIJLLLLLLLZ
            if (r0 == 0) goto L5d
            X.C12ES.LJIILL(r4, r0)
        L5d:
            X.0QtD r1 = r5.LLJJLIIIJLLLLLLLZ
            if (r1 == 0) goto L66
            boolean r0 = r2.LLJJIJIL
            r1.LIZLLL(r0)
        L66:
            return
        L67:
            if (r1 == 0) goto L70
            com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.CarouselWidgetKeys r0 = r1.carouselWidgetKeys
            if (r0 == 0) goto L70
            java.util.List<java.lang.String> r1 = r0.halfPdpCarouselHeaderKeys
            goto L1b
        L70:
            X.0QtD r0 = r5.LLJJLIIIJLLLLLLLZ
            if (r0 == 0) goto L77
            X.C03DZ.LIZ(r0)
        L77:
            X.0QtD r0 = r5.LLJJLIIIJLLLLLLLZ
            if (r0 == 0) goto L66
            r0.LIZ()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.assem.PdpCarouselFindSimilarLabelAssem.up(X.0vx9, int):void");
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
    }
}
