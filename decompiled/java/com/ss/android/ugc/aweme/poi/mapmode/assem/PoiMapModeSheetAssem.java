package com.ss.android.ugc.aweme.poi.mapmode.assem;

import X.C01D1;
import X.C1177790gkr;
import X.C11NZ;
import X.C1209020hZE;
import X.C13LE;
import X.C1558520qew;
import X.C1637806bA;
import X.C16G0;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C2255108sX;
import X.C724750Sbp;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import X.ViewTreeObserverOnPreDrawListenerC337150DJp;
import Y.ARunnableS87S0200000_18;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.poi.mapmode.PoiMapModeVerticalListFragment;
import com.ss.android.ugc.aweme.poi.mapmode.behavior.PoiMapModeSheetBehavior;
import com.ss.android.ugc.aweme.poi.mapmode.viewmodel.PoiMapModePageVM;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiMapModeSheetAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJ;
    public final AssemVMLazy LLIZLLLIL;
    public Fragment LLJ;
    public C16G0 LLJI;
    public C1177790gkr LLJIJIL;
    public final PoiMapModeSheetBehavior LLJILJIL;
    public TuxNavBar LLJILJILJ;
    public View LLJILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiMapModeSheetAssem.class, "pageVM", "getPageVM()Lcom/ss/android/ugc/aweme/poi/mapmode/viewmodel/PoiMapModePageVM;", 0);
        C13LE.LIZ.getClass();
        LLJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PoiMapModeSheetAssem() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiMapModePageVM.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, C1637806bA.LIZ, new AwS562S0100000_18(c19719912DlLIZ, 1464), AFwS256S0000000_18.get$arr$(512), null, true);
        this.LLJILJIL = new PoiMapModeSheetBehavior();
    }

    public final PoiMapModePageVM Go() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJ;
        return (PoiMapModePageVM) assemVMLazy.getValue();
    }

    public final void Jo() {
        C16G0 c16g0 = this.LLJI;
        if (c16g0 == null || (this.LLJ instanceof PoiMapModeVerticalListFragment)) {
            return;
        }
        PoiMapModeVerticalListFragment poiMapModeVerticalListFragment = new PoiMapModeVerticalListFragment();
        C1177790gkr c1177790gkr = this.LLJIJIL;
        if (c1177790gkr == null) {
            Ho(c16g0, poiMapModeVerticalListFragment);
        } else {
            c1177790gkr.LJ(poiMapModeVerticalListFragment);
            this.LLJ = poiMapModeVerticalListFragment;
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C16G0 c16g0 = (C16G0) view.findViewById(R.id.v4l);
        if (c16g0 == null) {
            return;
        }
        this.LLJI = c16g0;
        TuxNavBar tuxNavBar = (TuxNavBar) view.findViewById(R.id.p15);
        if (tuxNavBar == null) {
            return;
        }
        this.LLJILJILJ = tuxNavBar;
        View viewFindViewById = view.findViewById(R.id.p2a);
        if (viewFindViewById == null) {
            return;
        }
        this.LLJILLL = viewFindViewById;
        InterfaceC665370Q7z interfaceC665370Q7z = Go().LLIZ;
        if (interfaceC665370Q7z != null) {
            IPoiMapModeSheetAssemAbility iPoiMapModeSheetAssemAbility = new IPoiMapModeSheetAssemAbility() { // from class: com.ss.android.ugc.aweme.poi.mapmode.assem.PoiMapModeSheetAssem$loadAbility$1
                @Override // com.ss.android.ugc.aweme.poi.mapmode.assem.IPoiMapModeSheetAssemAbility
                public final C11NZ<Integer> p3() {
                    return C11NZ.LJIJJLI(new C1209020hZE(this.LL, 1));
                }
            };
            InterfaceC494301wD interfaceC494301wDLIZ = C1558520qew.LIZ(interfaceC665370Q7z, IPoiMapModeSheetAssemAbility.class, null);
            if (interfaceC494301wDLIZ == null) {
                C1558520qew.LJII(interfaceC665370Q7z, iPoiMapModeSheetAssemAbility, IPoiMapModeSheetAssemAbility.class, null, null);
            } else {
                try {
                    InvocationHandler invocationHandler = Proxy.getInvocationHandler(interfaceC494301wDLIZ);
                    if (invocationHandler instanceof C2255108sX) {
                        ((C2255108sX) invocationHandler).LL.add(iPoiMapModeSheetAssemAbility);
                    } else {
                        throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
                    }
                } catch (IllegalArgumentException e) {
                    TryCatchGuardChecker.doCheck(e);
                    C2255108sX c2255108sX = new C2255108sX();
                    c2255108sX.LL.add(iPoiMapModeSheetAssemAbility);
                    c2255108sX.LL.add((T) interfaceC494301wDLIZ);
                    Object objNewProxyInstance = Proxy.newProxyInstance(IPoiMapModeSheetAssemAbility.class.getClassLoader(), new Class[]{IPoiMapModeSheetAssemAbility.class}, c2255108sX);
                    if (objNewProxyInstance != null) {
                        C1558520qew.LJII(interfaceC665370Q7z, (InterfaceC494301wD) objNewProxyInstance, IPoiMapModeSheetAssemAbility.class, null, null);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.poi.mapmode.assem.IPoiMapModeSheetAssemAbility");
                    }
                }
            }
        }
        C16G0 c16g02 = this.LLJI;
        if (c16g02 != null) {
            ViewTreeObserverOnPreDrawListenerC337150DJp.LIZ(c16g02, new ARunnableS87S0200000_18(c16g02, this, 25));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Ho(X.C16G0 r8, androidx.fragment.app.Fragment r9) {
        /*
            r7 = this;
            com.bytedance.tux.navigation.TuxNavBar r0 = r7.LLJILJILJ
            if (r0 == 0) goto L9d
            int r0 = r0.getHeight()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r1.intValue()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = X.C08A4.LIZ(r0)
            if (r0 == 0) goto L9d
            int r6 = r1.intValue()
        L1e:
            android.view.View r0 = r7.LLJILLL
            if (r0 == 0) goto L8e
            int r0 = r0.getHeight()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r1.intValue()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = X.C08A4.LIZ(r0)
            if (r0 == 0) goto L8e
            int r5 = r1.intValue()
        L3c:
            androidx.fragment.app.Fragment r4 = X.C724240Sb0.LJI(r7)
            if (r4 == 0) goto L8d
            X.0gfu r3 = new X.0gfu
            r3.<init>()
            X.0gkr r2 = r3.LIZ
            r2.LIZ = r8
            r0 = 0
            r2.LIZIZ = r0
            r0 = 1
            r2.LJI = r0
            r0 = 4599075939470750515(0x3fd3333333333333, double:0.3)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r2.LJFF = r0
            int r2 = r8.getHeight()
            int r2 = r2 - r6
            int r2 = r2 - r5
            int r0 = X.C1174710gft.LIZ()
            int r2 = r2 + r0
            X.0gkr r1 = r3.LIZ
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r1.LIZJ = r0
            com.ss.android.ugc.aweme.poi.mapmode.behavior.PoiMapModeSheetBehavior r1 = r7.LLJILJIL
            X.0gkr r0 = r3.LIZ
            r0.LJIIIZ = r1
            androidx.fragment.app.FragmentManager r0 = r4.getParentFragmentManager()
            X.0gkr r1 = r3.LIZ
            r1.LJII = r9
            r1.LJIIIIZZ = r0
            X.0gfj r0 = new X.0gfj
            r0.<init>()
            r1.LJIIJ = r0
            r1.LIZLLL()
            r7.LLJIJIL = r1
            r7.LLJ = r9
        L8d:
            return
        L8e:
            r0 = 48
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            float r0 = X.C418440Gaw.LIZIZ(r0)
            int r5 = X.C814420VxA.LIZIZ(r0)
            goto L3c
        L9d:
            r0 = 52
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            float r0 = X.C418440Gaw.LIZIZ(r0)
            int r6 = X.C814420VxA.LIZIZ(r0)
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.mapmode.assem.PoiMapModeSheetAssem.Ho(X.16G0, androidx.fragment.app.Fragment):void");
    }
}
