package com.ss.android.ugc.aweme.poi.revisit.view;

import X.C01D1;
import X.C1177650gkd;
import X.C1177790gkr;
import X.C11NZ;
import X.C1209020hZE;
import X.C13LE;
import X.C1558520qew;
import X.C1637806bA;
import X.C16G0;
import X.C19719912Dl;
import X.C19EH;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2255108sX;
import X.C724750Sbp;
import X.C736680Sv4;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import X.ViewTreeObserverOnPreDrawListenerC337150DJp;
import Y.ARunnableS78S0200000_9;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.ss.android.ugc.aweme.poi.mapmode.behavior.PoiMapModeSheetBehavior;
import com.ss.android.ugc.aweme.poi.revisit.vm.PoiRevisitViewModel;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS632S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiRevisitSheetAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIL;
    public final AssemVMLazy LLIZLLLIL;
    public Fragment LLJ;
    public C16G0 LLJI;
    public C1177790gkr LLJIJIL;
    public int LLJILJIL;
    public boolean LLJILJILJ;
    public int LLJILLL;
    public boolean LLJJ;
    public boolean LLJJI;
    public PoiMapModeSheetBehavior LLJJIII;
    public TuxNavBar LLJJIJI;
    public View LLJJIJIIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiRevisitSheetAssem.class, "pageVM", "getPageVM()Lcom/ss/android/ugc/aweme/poi/revisit/vm/PoiRevisitViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PoiRevisitSheetAssem() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiRevisitViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, C1637806bA.LIZ, new AwS562S0100000_18(c19719912DlLIZ, 2014), AFwS256S0000000_18.get$arr$(647), null, true);
        this.LLJILJIL = 4;
        this.LLJILLL = 4;
        this.LLJJ = true;
        PoiMapModeSheetBehavior poiMapModeSheetBehavior = new PoiMapModeSheetBehavior();
        poiMapModeSheetBehavior.LIZ = true;
        poiMapModeSheetBehavior.addBottomSheetCallback(new C1177650gkd(this));
        this.LLJJIII = poiMapModeSheetBehavior;
    }

    public final PoiRevisitViewModel Go() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIL;
        return (PoiRevisitViewModel) assemVMLazy.getValue();
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJI = (C16G0) view.findViewById(R.id.rch);
        this.LLJJIJI = (TuxNavBar) view.findViewById(R.id.p15);
        this.LLJJIJIIJIL = view.findViewById(R.id.rcf);
        InterfaceC665370Q7z interfaceC665370Q7z = Go().LLJ;
        if (interfaceC665370Q7z != null) {
            IPoiRevisitSheetAssemAbility iPoiRevisitSheetAssemAbility = new IPoiRevisitSheetAssemAbility() { // from class: com.ss.android.ugc.aweme.poi.revisit.view.PoiRevisitSheetAssem$loadAbility$1
                @Override // com.ss.android.ugc.aweme.poi.revisit.view.IPoiRevisitSheetAssemAbility
                public final C11NZ<Integer> p3() {
                    return C11NZ.LJIJJLI(new C1209020hZE(this.LL, 2));
                }
            };
            InterfaceC494301wD interfaceC494301wDLIZ = C1558520qew.LIZ(interfaceC665370Q7z, IPoiRevisitSheetAssemAbility.class, null);
            if (interfaceC494301wDLIZ == null) {
                C1558520qew.LJII(interfaceC665370Q7z, iPoiRevisitSheetAssemAbility, IPoiRevisitSheetAssemAbility.class, null, null);
            } else {
                try {
                    InvocationHandler invocationHandler = Proxy.getInvocationHandler(interfaceC494301wDLIZ);
                    if (invocationHandler instanceof C2255108sX) {
                        ((C2255108sX) invocationHandler).LL.add(iPoiRevisitSheetAssemAbility);
                    } else {
                        throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
                    }
                } catch (IllegalArgumentException e) {
                    TryCatchGuardChecker.doCheck(e);
                    C2255108sX c2255108sX = new C2255108sX();
                    c2255108sX.LL.add(iPoiRevisitSheetAssemAbility);
                    c2255108sX.LL.add((T) interfaceC494301wDLIZ);
                    Object objNewProxyInstance = Proxy.newProxyInstance(IPoiRevisitSheetAssemAbility.class.getClassLoader(), new Class[]{IPoiRevisitSheetAssemAbility.class}, c2255108sX);
                    if (objNewProxyInstance != null) {
                        C1558520qew.LJII(interfaceC665370Q7z, (InterfaceC494301wD) objNewProxyInstance, IPoiRevisitSheetAssemAbility.class, null, null);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.poi.revisit.view.IPoiRevisitSheetAssemAbility");
                    }
                }
            }
        }
        C16G0 c16g0 = this.LLJI;
        if (c16g0 != null) {
            ViewTreeObserverOnPreDrawListenerC337150DJp.LIZ(c16g0, new ARunnableS78S0200000_9(c16g0, this, 42));
        }
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.0OGn
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C616670OGr) obj).LLILLL;
            }
        }, null, new AwS632S0100000_18(this, 168), 6);
    }

    public final void Jo(final int i, boolean z) {
        boolean z2;
        String str;
        final C16G0 c16g0 = this.LLJI;
        if (c16g0 == null) {
            return;
        }
        final PoiRevisitVerticalListFragment poiRevisitVerticalListFragment = new PoiRevisitVerticalListFragment();
        int i2 = this.LLJILJIL;
        if (i2 < 4 ? !(i >= 4 || i2 != i) : i >= 4) {
            z2 = false;
        } else {
            z2 = true;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Sheet Assem showPoiList: updateList=");
        sbLIZ.append(z);
        sbLIZ.append(",countDiffNeedUpdate=");
        sbLIZ.append(z2);
        sbLIZ.append(", sheet=");
        sbLIZ.append(this.LLJIJIL);
        sbLIZ.append(", listSize=");
        sbLIZ.append(i);
        sbLIZ.append(", lastListSize=");
        sbLIZ.append(this.LLJILJIL);
        C2188811AlT.LIZIZ(sbLIZ);
        if (!z && !z2) {
            if (this.LLJIJIL == null) {
                Ho(c16g0, poiRevisitVerticalListFragment, i);
                return;
            }
            if (!this.LLJJI) {
                if (this.LLJ == null) {
                    str = "INVOKE D";
                } else {
                    return;
                }
            } else {
                str = "INVOKE C";
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Sheet Assem showPoiList ");
            sbLIZ2.append(str);
            C2188811AlT.LIZIZ(sbLIZ2);
            C1177790gkr c1177790gkr = this.LLJIJIL;
            if (c1177790gkr != null) {
                c1177790gkr.LJ(poiRevisitVerticalListFragment);
            }
            this.LLJ = poiRevisitVerticalListFragment;
            this.LLJJI = false;
            return;
        }
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(c16g0, null);
        c16g0.removeAllViews();
        Fragment fragment = this.LLJ;
        if (fragment != null) {
            C19EH c19ehLJIIJ = fragment.getParentFragmentManager().LJIIJ();
            c19ehLJIIJ.LJIIZILJ(fragment);
            c19ehLJIIJ.LJIIL();
        }
        C1177790gkr c1177790gkr2 = this.LLJIJIL;
        if (c1177790gkr2 != null) {
            c1177790gkr2.LJJI = true;
            BottomSheetBehavior<?> bottomSheetBehavior = c1177790gkr2.LJIIIZ;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.setState(5);
            }
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("Sheet Assem showPoiList: sheet=");
        sbLIZ3.append(this.LLJIJIL);
        sbLIZ3.append(", INVOKE A");
        C2188811AlT.LIZIZ(sbLIZ3);
        PoiMapModeSheetBehavior poiMapModeSheetBehavior = new PoiMapModeSheetBehavior();
        poiMapModeSheetBehavior.LIZ = true;
        poiMapModeSheetBehavior.addBottomSheetCallback(new C1177650gkd(this));
        this.LLJJIII = poiMapModeSheetBehavior;
        ViewTreeObserverOnPreDrawListenerC337150DJp.LIZ(c16g0, new Runnable() { // from class: X.0gki
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("PoiRevisitSheetAssem@58b1.showPoiList$$inlined$doOnPreDraw$1");
                try {
                    this.Ho(c16g0, poiRevisitVerticalListFragment, i);
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("PoiRevisitSheetAssem@58b1.showPoiList$$inlined$doOnPreDraw$1");
            }
        });
        this.LLJJI = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Ho(X.C16G0 r8, com.ss.android.ugc.aweme.poi.revisit.view.PoiRevisitVerticalListFragment r9, int r10) {
        /*
            Method dump skipped, instruction units count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.revisit.view.PoiRevisitSheetAssem.Ho(X.16G0, com.ss.android.ugc.aweme.poi.revisit.view.PoiRevisitVerticalListFragment, int):void");
    }
}
