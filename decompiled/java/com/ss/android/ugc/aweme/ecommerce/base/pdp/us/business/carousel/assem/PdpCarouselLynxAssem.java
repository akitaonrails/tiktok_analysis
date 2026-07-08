package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.assem;

import X.C09R3;
import X.C0HHT;
import X.C0QSJ;
import X.C127G;
import X.C13LE;
import X.C1546290qLD;
import X.C1549130qPn;
import X.C1637806bA;
import X.C1761940vx2;
import X.C1776160wJy;
import X.C19719912Dl;
import X.C2097908Jt;
import X.C2217381BqS;
import X.C687700QyG;
import X.C724270Sb3;
import X.C724750Sbp;
import X.C736820SvI;
import X.C737910Sx3;
import X.InterfaceC1146704e9;
import X.InterfaceC1587906Jp;
import X.InterfaceC1731706qJ;
import X.InterfaceC1761990vx7;
import X.InterfaceC1762080vxG;
import X.InterfaceC1762510vxx;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.InterfaceC712990Rxx;
import X.InterfaceC737790Swr;
import Y.AObjectS400S0100000_26;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.lynx.tasm.LynxView;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.CarouselWidget;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.PdpCarouselScope;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.PdpFragmentScope;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: loaded from: classes27.dex */
public final class PdpCarouselLynxAssem extends ReusedUISlotAssem<PdpCarouselLynxAssem> implements InterfaceC712990Rxx<InterfaceC1762080vxG>, InterfaceC1761990vx7, InterfaceC737790Swr, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJZIJLIL;
    public final PdpCarouselLynxAssem LLJJLIIIJLLLLLLLZ = this;
    public final InterfaceC1731706qJ LLJL;
    public C1546290qLD LLJLIL;
    public volatile InterfaceC1762510vxx LLJLILLLLZIIL;
    public C127G LLJLL;
    public InterfaceC665370Q7z LLJLLIL;
    public C0QSJ LLJLLL;
    public C0QSJ LLJZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PdpCarouselLynxAssem.class, "viewHolderVM", "getViewHolderVM()Lcom/ss/android/ugc/aweme/ecommerce/base/pdp/us/business/carousel/assem/PdpCarouselViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(PdpCarouselLynxAssem.class, "pageViewerAbility", "getPageViewerAbility()Lcom/ss/android/ugc/aweme/ecommerce/base/pdp/us/business/carousel/assem/headerabilities/IPagerViewerAbility;", 0);
        c09r3.getClass();
        LLJZIJLIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public PdpCarouselLynxAssem() {
        C0HHT c0hht = C0HHT.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PdpCarouselViewModel.class);
        this.LLJL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0hht, C1637806bA.LIZ, new AwS568S0100000_24(c19719912DlLIZ, 292), null, AFwS268S0000000_26.get$arr$(225));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.arb;
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

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        C1546290qLD c1546290qLD = this.LLJLIL;
        if (c1546290qLD != null) {
            c1546290qLD.LIZ();
        }
        this.LLJLIL = null;
    }

    public final void sp() {
        ViewGroup viewGroup;
        C724270Sb3 c724270Sb3 = this.LLJI;
        InterfaceC1762080vxG interfaceC1762080vxG = (InterfaceC1762080vxG) (c724270Sb3 != null ? c724270Sb3.LL : null);
        if (interfaceC1762080vxG == null) {
            return;
        }
        View contentView = getContentView();
        if (!(contentView instanceof ViewGroup) || (viewGroup = (ViewGroup) contentView) == null) {
            return;
        }
        C1761940vx2 c1761940vx2 = (C1761940vx2) ((AssemViewModel) this.LLJL.getValue(this, LLJZIJLIL[0])).getState();
        String strLIZ = interfaceC1762080vxG.LIZ();
        if (strLIZ == null || strLIZ.length() <= 0) {
            return;
        }
        List<CarouselWidget> listOp = op(c1761940vx2.LLILZLL);
        ArrayList arrayList = new ArrayList();
        Iterator<CarouselWidget> it2 = listOp.iterator();
        while (it2.hasNext()) {
            Map<String, Object> map = it2.next().lynxData;
            if (map != null && (!map.isEmpty())) {
                arrayList.add(map);
            }
        }
        TemplateData templateDataLJII = TemplateData.LJII(C2097908Jt.LIZJ(new Pair("widgets", arrayList)));
        C1546290qLD c1546290qLD = this.LLJLIL;
        if (c1546290qLD == null) {
            c1546290qLD = new C1546290qLD(viewGroup, AFwS268S0000000_26.get$arr$(224));
            this.LLJLIL = c1546290qLD;
        }
        LynxView lynxViewLIZIZ = c1546290qLD.LIZIZ(viewGroup.getContext(), strLIZ, null, viewGroup, templateDataLJII, new C1549130qPn(true, true));
        if (lynxViewLIZIZ == null || lynxViewLIZIZ.getParent() != null) {
            return;
        }
        viewGroup.addView(lynxViewLIZIZ);
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJLL;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJLL;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{PdpCarouselViewModel.class, new AObjectS400S0100000_26(this, 13)}, defaultViewModelProviderFactory);
                    this.LLJLL = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{PdpCarouselScope.class}).unbindAbility(this.LLJJLIIIJLLLLLLLZ, InterfaceC1761990vx7.class);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        AssemViewModel assemViewModel = (AssemViewModel) this.LLJL.getValue(this, LLJZIJLIL[0]);
        selectSubscribe(assemViewModel, new C2217381BqS() { // from class: X.0vxR
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1761940vx2) obj).LL;
            }
        }, new C2217381BqS() { // from class: X.0vxP
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C1761940vx2) obj).LLILZLL);
            }
        }, new C2217381BqS() { // from class: X.0vxQ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1761940vx2) obj).LLILZ);
            }
        }, C736820SvI.LIZIZ(assemViewModel.usedInReusedScene), null, C1776160wJy.get$arr$(0));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.CarouselWidget> op(int r4) {
        /*
            r3 = this;
            X.01GW r0 = X.C268650Afv.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L11
            X.13BV r0 = X.C13BV.INSTANCE
            return r0
        L11:
            X.06qJ r2 = r3.LLJL
            X.1Bqa<java.lang.Object>[] r1 = com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.assem.PdpCarouselLynxAssem.LLJZIJLIL
            r0 = 0
            r0 = r1[r0]
            java.lang.Object r0 = r2.getValue(r3, r0)
            com.bytedance.assem.arch.viewModel.AssemViewModel r0 = (com.bytedance.assem.arch.viewModel.AssemViewModel) r0
            X.002o r2 = r0.getState()
            X.0vx2 r2 = (X.C1761940vx2) r2
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.CarouselElement> r0 = r2.LL
            java.lang.Object r1 = X.C13LP.LJJJLZIJ(r4, r0)
            com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.CarouselElement r1 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.CarouselElement) r1
            if (r1 != 0) goto L31
            X.13BV r0 = X.C13BV.INSTANCE
            return r0
        L31:
            boolean r0 = r2.LLILZ
            if (r0 == 0) goto L5c
            com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.CarouselWidgetKeys r0 = r1.carouselWidgetKeys
            if (r0 == 0) goto L63
            java.util.List<java.lang.String> r0 = r0.pdpCarouselWidgetKeys
        L3b:
            if (r0 == 0) goto L63
            X.07ik r2 = new X.07ik
            r2.<init>(r0)
            kotlin.jvm.internal.AwS605S0100000_26 r1 = new kotlin.jvm.internal.AwS605S0100000_26
            r0 = 226(0xe2, float:3.17E-43)
            r1.<init>(r3, r0)
            X.08QU r1 = X.C09RB.LJIJI(r2, r1)
            r0 = 223(0xdf, float:3.12E-43)
            kotlin.jvm.internal.AFwS268S0000000_26 r0 = kotlin.jvm.internal.AFwS268S0000000_26.get$arr$(r0)
            X.08QU r0 = X.C09RB.LJIIIZ(r1, r0)
            java.util.List r0 = X.C09RB.LJJII(r0)
            return r0
        L5c:
            com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.CarouselWidgetKeys r0 = r1.carouselWidgetKeys
            if (r0 == 0) goto L63
            java.util.List<java.lang.String> r0 = r0.halfPdpCarouselHeaderKeys
            goto L3b
        L63:
            X.13BV r0 = X.C13BV.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.assem.PdpCarouselLynxAssem.op(int):java.util.List");
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{PdpCarouselScope.class}).bindAbility(this.LLJJLIIIJLLLLLLLZ, InterfaceC1761990vx7.class);
    }

    @Override // X.InterfaceC1761990vx7
    public final List<String> r7(int i) {
        List<CarouselWidget> listOp = op(i);
        ArrayList arrayList = new ArrayList();
        Iterator<CarouselWidget> it2 = listOp.iterator();
        while (it2.hasNext()) {
            String str = it2.next().daInfo;
            if (str != null) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void tp(InterfaceC1762080vxG interfaceC1762080vxG) {
        sp();
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(InterfaceC1762080vxG interfaceC1762080vxG) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(InterfaceC1762080vxG interfaceC1762080vxG) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        tp(interfaceC1587906Jp);
    }
}
