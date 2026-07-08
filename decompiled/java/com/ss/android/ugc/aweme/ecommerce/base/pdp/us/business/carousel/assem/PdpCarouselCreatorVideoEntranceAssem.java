package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.assem;

import X.C0HHT;
import X.C0QSJ;
import X.C127G;
import X.C13LE;
import X.C1637806bA;
import X.C1762010vx9;
import X.C1762210vxT;
import X.C1763800w02;
import X.C1770850wBP;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C448310Hi1;
import X.C687700QyG;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C737910Sx3;
import X.InterfaceC1146704e9;
import X.InterfaceC1587906Jp;
import X.InterfaceC1731706qJ;
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
public final class PdpCarouselCreatorVideoEntranceAssem extends ReusedUISlotAssem<PdpCarouselCreatorVideoEntranceAssem> implements InterfaceC712990Rxx<C1762010vx9>, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLLIL;
    public C1763800w02 LLJJLIIIJLLLLLLLZ;
    public final InterfaceC1731706qJ LLJL;
    public C127G LLJLIL;
    public InterfaceC665370Q7z LLJLILLLLZIIL;
    public C0QSJ LLJLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PdpCarouselCreatorVideoEntranceAssem.class, "viewHolderVM", "getViewHolderVM()Lcom/ss/android/ugc/aweme/ecommerce/base/pdp/us/business/carousel/assem/PdpCarouselViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJLLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PdpCarouselCreatorVideoEntranceAssem() {
        C0HHT c0hht = C0HHT.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PdpCarouselViewModel.class);
        this.LLJL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0hht, C1637806bA.LIZ, new AwS568S0100000_24(c19719912DlLIZ, 289), null, AFwS268S0000000_26.get$arr$(219));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.at4;
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

    public final PdpCarouselViewModel op() {
        return (PdpCarouselViewModel) this.LLJL.getValue(this, LLJLLIL[0]);
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJLIL;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJLIL;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{PdpCarouselViewModel.class, new AObjectS400S0100000_26(this, 12)}, defaultViewModelProviderFactory);
                    this.LLJLIL = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLJJLIIIJLLLLLLLZ = (C1763800w02) getContentView().findViewById(R.id.tfc);
        C736680Sv4.LJIIIZ(this, op(), new C2217381BqS() { // from class: X.0vxa
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1761940vx2) obj).LL;
            }
        }, new C2217381BqS() { // from class: X.0Hi8
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1761940vx2) obj).LLILLL;
            }
        }, null, AFwS348S0000000_26.get$arr$(6), 12);
        PdpCarouselViewModel pdpCarouselViewModelOp = op();
        C1762210vxT c1762210vxT = new C2217381BqS() { // from class: X.0vxT
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1761940vx2) obj).LLILZ);
            }
        };
        C1770850wBP c1770850wBP = new C1770850wBP();
        c1770850wBP.LIZ = true;
        c1770850wBP.LIZ(true);
        C736680Sv4.LJIIIIZZ(this, pdpCarouselViewModelOp, c1762210vxT, c1770850wBP, AFwS313S0000000_26.get$arr$(46), 4);
        PdpCarouselViewModel pdpCarouselViewModelOp2 = op();
        C448310Hi1 c448310Hi1 = new C2217381BqS() { // from class: X.0Hi1
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1761940vx2) obj).LLIZ;
            }
        };
        C1770850wBP c1770850wBP2 = new C1770850wBP();
        c1770850wBP2.LIZ = true;
        c1770850wBP2.LIZ(true);
        C736680Sv4.LJIIIIZZ(this, pdpCarouselViewModelOp2, c448310Hi1, c1770850wBP2, AFwS313S0000000_26.get$arr$(48), 4);
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

    /* JADX WARN: Removed duplicated region for block: B:14:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void sp(X.C1762010vx9 r5, int r6) {
        /*
            r4 = this;
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.CarouselElement> r0 = r5.LL
            java.lang.Object r1 = X.C13LP.LJJJLZIJ(r6, r0)
            com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.CarouselElement r1 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.CarouselElement) r1
            boolean r0 = r5.LLJILLL
            if (r0 == 0) goto L4e
            if (r1 == 0) goto L57
            com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.CarouselWidgetKeys r0 = r1.carouselWidgetKeys
            if (r0 == 0) goto L57
            java.util.List<java.lang.String> r1 = r0.pdpCarouselWidgetKeys
        L14:
            if (r1 == 0) goto L57
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L57
            java.util.Iterator r3 = r1.iterator()
        L20:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L57
            java.lang.Object r1 = r3.next()
            java.util.Map<java.lang.String, com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.CarouselWidget> r0 = r5.LLILZIL
            if (r0 == 0) goto L20
            java.lang.Object r0 = r0.get(r1)
            com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.CarouselWidget r0 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.CarouselWidget) r0
            if (r0 == 0) goto L20
            java.lang.Integer r2 = r0.widgetType
            X.0vxL r0 = X.EnumC1762130vxL.LEGACY_CREATOR_VIDEO_ANCHOR
            int r1 = r0.getValue()
            if (r2 == 0) goto L20
            int r0 = r2.intValue()
            if (r0 != r1) goto L20
            X.0w02 r0 = r4.LLJJLIIIJLLLLLLLZ
            if (r0 == 0) goto L4d
            r0.LIZ()
        L4d:
            return
        L4e:
            if (r1 == 0) goto L57
            com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.CarouselWidgetKeys r0 = r1.carouselWidgetKeys
            if (r0 == 0) goto L57
            java.util.List<java.lang.String> r1 = r0.halfPdpCarouselHeaderKeys
            goto L14
        L57:
            X.0w02 r0 = r4.LLJJLIIIJLLLLLLLZ
            if (r0 == 0) goto L4d
            r0.LIZIZ()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.assem.PdpCarouselCreatorVideoEntranceAssem.sp(X.0vx9, int):void");
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
    }
}
