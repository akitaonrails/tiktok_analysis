package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.assem;

import X.AnonymousClass0956;
import X.C09R3;
import X.C0HHT;
import X.C0QSJ;
import X.C127G;
import X.C13LE;
import X.C1637806bA;
import X.C1762010vx9;
import X.C1770850wBP;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C424040Gjy;
import X.C448300Hi0;
import X.C687700QyG;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C737910Sx3;
import X.InterfaceC1146704e9;
import X.InterfaceC1587906Jp;
import X.InterfaceC1731706qJ;
import X.InterfaceC1762510vxx;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.InterfaceC712990Rxx;
import Y.AObjectS381S0100000_6;
import android.view.View;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.PdpCarouselScope;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.PdpFragmentScope;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AFwS289S0000000_6;
import kotlin.jvm.internal.AFwS331S0000000_6;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class PdpCarouselInnerIndicatorAssem extends ReusedUISlotAssem<PdpCarouselInnerIndicatorAssem> implements InterfaceC712990Rxx<C1762010vx9>, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJZIJLIL;
    public final InterfaceC1731706qJ LLJJLIIIJLLLLLLLZ;
    public C424040Gjy LLJL;
    public AnonymousClass0956 LLJLIL;
    public volatile InterfaceC1762510vxx LLJLILLLLZIIL;
    public C127G LLJLL;
    public InterfaceC665370Q7z LLJLLIL;
    public C0QSJ LLJLLL;
    public C0QSJ LLJZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PdpCarouselInnerIndicatorAssem.class, "pageViewerAbility", "getPageViewerAbility()Lcom/ss/android/ugc/aweme/ecommerce/base/pdp/us/business/carousel/assem/headerabilities/IPagerViewerAbility;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(PdpCarouselInnerIndicatorAssem.class, "viewHolderVM", "getViewHolderVM()Lcom/ss/android/ugc/aweme/ecommerce/base/pdp/us/business/carousel/assem/PdpCarouselViewModel;", 0);
        c09r3.getClass();
        LLJZIJLIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public PdpCarouselInnerIndicatorAssem() {
        C0HHT c0hht = C0HHT.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PdpCarouselViewModel.class);
        this.LLJJLIIIJLLLLLLLZ = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0hht, C1637806bA.LIZ, new AwS550S0100000_6(c19719912DlLIZ, 70), null, AFwS236S0000000_6.get$arr$(57));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.at7;
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

    /* JADX WARN: Removed duplicated region for block: B:15:0x0029 A[Catch: all -> 0x0035, PHI: r1
      0x0029: PHI (r1v1 X.0QSJ) = (r1v0 X.0QSJ), (r1v3 X.0QSJ) binds: [B:8:0x000b, B:13:0x0025] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {, blocks: (B:5:0x0005, B:7:0x0009, B:9:0x000d, B:11:0x0011, B:12:0x0017, B:16:0x0031, B:17:0x0033, B:15:0x0029), top: B:24:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC1762510vxx op() {
        /*
            r4 = this;
            X.0vxx r0 = r4.LLJLILLLLZIIL
            if (r0 != 0) goto L39
            monitor-enter(r4)
            X.0vxx r0 = r4.LLJLILLLLZIIL     // Catch: java.lang.Throwable -> L35
            if (r0 != 0) goto L38
            X.0QSJ r1 = r4.LLJLLL     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L29
            X.0Q7z r3 = r4.LLJLLIL     // Catch: java.lang.Throwable -> L35
            if (r3 != 0) goto L17
            X.0Q7z r3 = X.C687700QyG.LJIIIZ(r4)     // Catch: java.lang.Throwable -> L35
            r4.LLJLLIL = r3     // Catch: java.lang.Throwable -> L35
        L17:
            r0 = 1
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L35
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.PdpCarouselScope> r1 = com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.PdpCarouselScope.class
            r0 = 0
            r2[r0] = r1     // Catch: java.lang.Throwable -> L35
            X.0QSJ r1 = X.C687700QyG.LIZLLL(r3, r2)     // Catch: java.lang.Throwable -> L35
            r4.LLJLLL = r1     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L29
            r0 = 0
            goto L31
        L29:
            java.lang.Class<X.0vxx> r0 = X.InterfaceC1762510vxx.class
            java.lang.Object r0 = r1.getAbility(r0)     // Catch: java.lang.Throwable -> L35
            X.0vxx r0 = (X.InterfaceC1762510vxx) r0     // Catch: java.lang.Throwable -> L35
        L31:
            r4.LLJLILLLLZIIL = r0     // Catch: java.lang.Throwable -> L35
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L35
            return r0
        L35:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L38:
            monitor-exit(r4)
        L39:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.assem.PdpCarouselInnerIndicatorAssem.op():X.0vxx");
    }

    public final PdpCarouselViewModel sp() {
        return (PdpCarouselViewModel) this.LLJJLIIIJLLLLLLLZ.getValue(this, LLJZIJLIL[1]);
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJLL;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJLL;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{PdpCarouselViewModel.class, new AObjectS381S0100000_6(this, 8)}, defaultViewModelProviderFactory);
                    this.LLJLL = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLJL = (C424040Gjy) getContentView().findViewById(R.id.knz);
        C736680Sv4.LJIIIZ(this, sp(), new C2217381BqS() { // from class: X.0vx6
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1761940vx2) obj).LL;
            }
        }, new C2217381BqS() { // from class: X.0Hi4
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1761940vx2) obj).LLILLL;
            }
        }, null, AFwS331S0000000_6.get$arr$(1), 12);
        PdpCarouselViewModel pdpCarouselViewModelSp = sp();
        C448300Hi0 c448300Hi0 = new C2217381BqS() { // from class: X.0Hi0
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1761940vx2) obj).LLIZ;
            }
        };
        C1770850wBP c1770850wBP = new C1770850wBP();
        c1770850wBP.LIZ = true;
        c1770850wBP.LIZ(true);
        C736680Sv4.LJIIIIZZ(this, pdpCarouselViewModelSp, c448300Hi0, c1770850wBP, AFwS289S0000000_6.get$arr$(58), 4);
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

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
    }
}
