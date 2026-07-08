package com.ss.android.ugc.aweme.search.pages.sevensplitscreen.assem;

import X.AbstractC677220QhM;
import X.C01GW;
import X.C0HXV;
import X.C0R4F;
import X.C12ES;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1559260qg8;
import X.C16BC;
import X.C16G1;
import X.C1744700vVE;
import X.C2187701Ajg;
import X.C452501pT;
import X.C679370Qkp;
import X.C723580SZw;
import X.C724240Sb0;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.tux.widget.RadiusLayout;
import com.ss.android.ugc.aweme.search.pages.sevensplitscreen.ability.ISearchSevenSplitScreenRootFragmentAbility;
import com.ss.android.ugc.aweme.search.pages.sevensplitscreen.ability.ISearchSplitSheetBehaviorAbility;
import com.ss.android.ugc.aweme.search.pages.sevensplitscreen.ui.SearchSevenSplitScreenBehavior;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS589S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchSevenSplitScreenBehaviorAssem extends UIContentAssem implements ISearchSplitSheetBehaviorAbility, InterfaceC1554640qYg {
    public SearchSevenSplitScreenBehavior<?> LLJILJIL;
    public boolean LLJILJILJ;
    public boolean LLJILLL;
    public Animator LLJJ;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 842));
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 841));
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS554S0100000_10(this, 840));
    public final C1559260qg8 LLJIJIL = new C1559260qg8(new C723580SZw(this, C679370Qkp.class, "SearchSevenScreenHierarchyData"), checkSupervisorPrepared());
    public int LLJJI = -1;
    public final C01GW LLJJIII = C452501pT.LIZIZ(new AwS554S0100000_10(this, 839));
    public final C01GW LLJJIJI = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(342));

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -643621361) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.sevensplitscreen.ability.ISearchSplitSheetBehaviorAbility
    public final Integer E1() {
        SearchSevenSplitScreenBehavior<?> searchSevenSplitScreenBehavior = this.LLJILJIL;
        if (searchSevenSplitScreenBehavior != null) {
            return Integer.valueOf(searchSevenSplitScreenBehavior.LJIILJJIL);
        }
        return null;
    }

    public final int Go() {
        return ((Number) this.LLJJIII.getValue()).intValue();
    }

    public final RadiusLayout Ho() {
        return (RadiusLayout) this.LLJI.getValue();
    }

    public final boolean Lo() {
        C679370Qkp c679370Qkp = (C679370Qkp) this.LLJIJIL.getValue();
        if (c679370Qkp != null && c679370Qkp.LL) {
            return true;
        }
        C679370Qkp c679370Qkp2 = (C679370Qkp) this.LLJIJIL.getValue();
        return c679370Qkp2 != null && c679370Qkp2.LLILLJJLI;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.sevensplitscreen.ability.ISearchSplitSheetBehaviorAbility
    public final void j1() {
        SearchSevenSplitScreenBehavior<?> searchSevenSplitScreenBehavior = this.LLJILJIL;
        if (searchSevenSplitScreenBehavior != null) {
            searchSevenSplitScreenBehavior.LJJIJ = true;
        }
    }

    public final void Jo() {
        RadiusLayout radiusLayoutHo;
        if (getContext() == null) {
            return;
        }
        int iGo = Go() - ((Number) this.LLJJIJI.getValue()).intValue();
        int iLJIIIIZZ = C12ES.LJIIIIZZ(getContext());
        if (iLJIIIIZZ >= iGo) {
            iGo = iLJIIIIZZ;
        }
        int i = (int) (iGo * 0.68f);
        int iGo2 = Go() - i;
        View view = (View) this.LLJ.getValue();
        if (view != null) {
            C1744700vVE.LJIIIIZZ(iGo2, view);
        }
        C679370Qkp c679370Qkp = (C679370Qkp) this.LLJIJIL.getValue();
        if (c679370Qkp != null && c679370Qkp.LL && (radiusLayoutHo = Ho()) != null) {
            C1744700vVE.LJIIIIZZ(i, radiusLayoutHo);
            C0HXV.LJII(iGo2, radiusLayoutHo);
        }
        SearchSevenSplitScreenBehavior<?> searchSevenSplitScreenBehavior = this.LLJILJIL;
        if (searchSevenSplitScreenBehavior != null) {
            searchSevenSplitScreenBehavior.LJJIJIIJI = false;
            searchSevenSplitScreenBehavior.LJJIIJZLJL = Go();
            searchSevenSplitScreenBehavior.LJJIZ = iGo2;
            searchSevenSplitScreenBehavior.LJJIIZI = iGo2;
            searchSevenSplitScreenBehavior.LJJIIZ = 0;
            searchSevenSplitScreenBehavior.LJIIJ = true;
            searchSevenSplitScreenBehavior.LJIILIIL = false;
            searchSevenSplitScreenBehavior.LJJIJ = false;
            searchSevenSplitScreenBehavior.LJJJ = new AwS589S0100000_10(this, 357);
            searchSevenSplitScreenBehavior.setState(5);
            searchSevenSplitScreenBehavior.LJJIJIIJIL = true;
        }
        SearchSevenSplitScreenBehavior<?> searchSevenSplitScreenBehavior2 = this.LLJILJIL;
        if (searchSevenSplitScreenBehavior2 != null) {
            searchSevenSplitScreenBehavior2.LIZ(new AbstractC677220QhM() { // from class: X.0QhL
                @Override // X.AbstractC677220QhM
                public final void LIZ(float f) {
                    ISearchSevenSplitScreenRootFragmentAbility iSearchSevenSplitScreenRootFragmentAbility;
                    Fragment fragmentLJI = C724240Sb0.LJI(this.LIZ);
                    if (fragmentLJI != null && (iSearchSevenSplitScreenRootFragmentAbility = (ISearchSevenSplitScreenRootFragmentAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI, null), ISearchSevenSplitScreenRootFragmentAbility.class, null)) != null) {
                        iSearchSevenSplitScreenRootFragmentAbility.LJJJI(f);
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
                /* JADX WARN: Removed duplicated region for block: B:32:0x0062  */
                @Override // X.AbstractC677220QhM
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void LIZIZ(int r7) {
                    /*
                        r6 = this;
                        r5 = 5
                        r0 = 0
                        java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
                        r4 = 1
                        r3 = 0
                        if (r7 == r4) goto L6b
                        r0 = 4
                        if (r7 == r0) goto L75
                        if (r7 == r5) goto L71
                        r0 = 6
                        if (r7 == r0) goto L75
                    L12:
                        com.ss.android.ugc.aweme.search.pages.sevensplitscreen.assem.SearchSevenSplitScreenBehaviorAssem r1 = r6.LIZ
                        boolean r0 = r1.LLJILLL
                        if (r0 != 0) goto L2f
                        androidx.fragment.app.Fragment r0 = X.C724240Sb0.LJI(r1)
                        if (r0 == 0) goto L2f
                        X.0Q7z r1 = X.C1558360qeg.LJFF(r0, r3)
                        java.lang.Class<com.ss.android.ugc.aweme.search.pages.sevensplitscreen.ability.ISearchSevenSplitScreenRootFragmentAbility> r0 = com.ss.android.ugc.aweme.search.pages.sevensplitscreen.ability.ISearchSevenSplitScreenRootFragmentAbility.class
                        X.01wD r0 = X.C1558520qew.LIZ(r1, r0, r3)
                        com.ss.android.ugc.aweme.search.pages.sevensplitscreen.ability.ISearchSevenSplitScreenRootFragmentAbility r0 = (com.ss.android.ugc.aweme.search.pages.sevensplitscreen.ability.ISearchSevenSplitScreenRootFragmentAbility) r0
                        if (r0 == 0) goto L2f
                        r0.sV0(r7)
                    L2f:
                        if (r7 == r4) goto L62
                        r0 = 3
                        if (r7 == r0) goto L5d
                        if (r7 != r5) goto L57
                        com.ss.android.ugc.aweme.search.pages.sevensplitscreen.assem.SearchSevenSplitScreenBehaviorAssem r1 = r6.LIZ
                        com.ss.android.ugc.aweme.search.pages.sevensplitscreen.ui.SearchSevenSplitScreenBehavior<?> r0 = r1.LLJILJIL
                        if (r0 == 0) goto L57
                        boolean r0 = r0.LJJIJ
                        if (r0 != r4) goto L57
                        androidx.fragment.app.Fragment r0 = X.C724240Sb0.LJI(r1)
                        if (r0 == 0) goto L57
                        X.0Q7z r1 = X.C1558360qeg.LJFF(r0, r3)
                        java.lang.Class<com.ss.android.ugc.aweme.search.pages.sevensplitscreen.ability.ISearchSevenSplitScreenRootFragmentAbility> r0 = com.ss.android.ugc.aweme.search.pages.sevensplitscreen.ability.ISearchSevenSplitScreenRootFragmentAbility.class
                        X.01wD r0 = X.C1558520qew.LIZ(r1, r0, r3)
                        com.ss.android.ugc.aweme.search.pages.sevensplitscreen.ability.ISearchSevenSplitScreenRootFragmentAbility r0 = (com.ss.android.ugc.aweme.search.pages.sevensplitscreen.ability.ISearchSevenSplitScreenRootFragmentAbility) r0
                        if (r0 == 0) goto L57
                        r0.s3()
                    L57:
                        com.ss.android.ugc.aweme.search.pages.sevensplitscreen.assem.SearchSevenSplitScreenBehaviorAssem r0 = r6.LIZ
                        r0.getClass()
                        return
                    L5d:
                        com.ss.android.ugc.aweme.search.pages.sevensplitscreen.assem.SearchSevenSplitScreenBehaviorAssem r0 = r6.LIZ
                        r0.LLJILLL = r4
                        goto L57
                    L62:
                        com.ss.android.ugc.aweme.search.pages.sevensplitscreen.assem.SearchSevenSplitScreenBehaviorAssem r1 = r6.LIZ
                        boolean r0 = r1.LLJILJILJ
                        if (r0 != 0) goto L57
                        r1.LLJILJILJ = r4
                        goto L57
                    L6b:
                        r0 = 2
                        java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
                        goto L75
                    L71:
                        java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
                    L75:
                        if (r1 == 0) goto L12
                        com.ss.android.ugc.aweme.search.pages.sevensplitscreen.assem.SearchSevenSplitScreenBehaviorAssem r0 = r6.LIZ
                        int r2 = r1.intValue()
                        androidx.fragment.app.Fragment r0 = X.C724240Sb0.LJI(r0)
                        if (r0 == 0) goto L12
                        X.0Q7z r1 = X.C1558360qeg.LJFF(r0, r3)
                        java.lang.Class<com.ss.android.ugc.aweme.search.pages.sevensplitscreen.ability.ISearchSevenSplitScreenRootFragmentAbility> r0 = com.ss.android.ugc.aweme.search.pages.sevensplitscreen.ability.ISearchSevenSplitScreenRootFragmentAbility.class
                        X.01wD r0 = X.C1558520qew.LIZ(r1, r0, r3)
                        com.ss.android.ugc.aweme.search.pages.sevensplitscreen.ability.ISearchSevenSplitScreenRootFragmentAbility r0 = (com.ss.android.ugc.aweme.search.pages.sevensplitscreen.ability.ISearchSevenSplitScreenRootFragmentAbility) r0
                        if (r0 == 0) goto L12
                        r0.id(r2)
                        goto L12
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C677210QhL.LIZIZ(int):void");
                }
            });
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        Animator animator;
        super.onDestroy();
        Animator animator2 = this.LLJJ;
        if (animator2 == null || !animator2.isRunning() || (animator = this.LLJJ) == null) {
            return;
        }
        animator.cancel();
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentViewCreated() {
        ISearchSevenSplitScreenRootFragmentAbility iSearchSevenSplitScreenRootFragmentAbility;
        super.onParentViewCreated();
        View view = (View) this.LLIZLLLIL.getValue();
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (!(layoutParams instanceof C16G1)) {
                "The view is not a child of CoordinatorLayout".toString();
                throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
            }
            C16BC c16bc = ((C16G1) layoutParams).LIZ;
            if (!(c16bc instanceof SearchSevenSplitScreenBehavior)) {
                "The view is not associated with ViewPagerBottomSheetBehavior".toString();
                throw new IllegalArgumentException("The view is not associated with ViewPagerBottomSheetBehavior");
            }
            SearchSevenSplitScreenBehavior<?> searchSevenSplitScreenBehavior = (SearchSevenSplitScreenBehavior) c16bc;
            this.LLJILJIL = searchSevenSplitScreenBehavior;
            searchSevenSplitScreenBehavior.LJJIL = 0.08f;
        }
        View viewLJJIJL = LJJIJL();
        if (getContext() != null) {
            SearchSevenSplitScreenBehavior<?> searchSevenSplitScreenBehavior2 = this.LLJILJIL;
            if (searchSevenSplitScreenBehavior2 != null) {
                searchSevenSplitScreenBehavior2.setPeekHeight((int) (Go() * 0.1f));
            }
            ViewTreeObserver viewTreeObserver = viewLJJIJL.getViewTreeObserver();
            if (viewTreeObserver != null) {
                C0R4F c0r4f = new C0R4F(this, viewLJJIJL, 10);
                viewTreeObserver.addOnGlobalLayoutListener(c0r4f);
                C2187701Ajg.LIZ(viewTreeObserver, c0r4f, ViewTreeObserver.OnGlobalLayoutListener.class);
            } else {
                Jo();
                Fragment fragmentLJI = C724240Sb0.LJI(this);
                if (fragmentLJI == null || (iSearchSevenSplitScreenRootFragmentAbility = (ISearchSevenSplitScreenRootFragmentAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI, null), ISearchSevenSplitScreenRootFragmentAbility.class, null)) == null) {
                    return;
                }
                iSearchSevenSplitScreenRootFragmentAbility.v0();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.search.pages.sevensplitscreen.ability.ISearchSplitSheetBehaviorAbility
    public final void c(int i) {
        SearchSevenSplitScreenBehavior<?> searchSevenSplitScreenBehavior = this.LLJILJIL;
        if (searchSevenSplitScreenBehavior != null) {
            searchSevenSplitScreenBehavior.setState(i);
        }
    }
}
