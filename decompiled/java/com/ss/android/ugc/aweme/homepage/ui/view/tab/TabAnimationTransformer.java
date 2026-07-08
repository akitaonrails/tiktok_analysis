package com.ss.android.ugc.aweme.homepage.ui.view.tab;

import X.C01GW;
import X.C0QSJ;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1591980rWu;
import X.C1591990rWv;
import X.C1592080rX4;
import X.C1592450rXf;
import X.C1592660rY0;
import X.C1592730rY7;
import X.C1620910sHZ;
import X.C19EG;
import X.C2188811AlT;
import X.C296200BjG;
import X.C452501pT;
import X.C628500Oky;
import X.C630740Ooa;
import X.C687700QyG;
import X.C786410Ut5;
import X.C817403Hg;
import X.EnumC1571190qzN;
import X.InterfaceC1592830rYH;
import X.InterfaceC469360Ias;
import X.InterfaceC665370Q7z;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.animation.FloatEvaluator;
import android.view.View;
import android.widget.TextView;
import com.bytedance.tiktok.homepage.mainfragment.ability.IMFToolBarAbility;
import com.bytedance.tiktok.homepage.mainfragment.ability.ITabAnimationAbility;
import com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.top.ITabTransformer;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AwS48S0301000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.AwS7S0402000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class TabAnimationTransformer implements InterfaceC469360Ias, ITabAnimationAbility, ITabTransformer {
    public int LL;
    public C1592450rXf LLILLJJLI;
    public InterfaceC665370Q7z LLILLL;
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(191));
    public final C01GW LLILZIL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(190));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 579));
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 578));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 575));
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 576));
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS568S0100000_24(this, 572));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 573));
    public final C630740Ooa LLJILJIL = C628500Oky.LIZ(new AwS568S0100000_24(this, 580));
    public final C630740Ooa LLJILJILJ = C628500Oky.LIZ(new AwS568S0100000_24(this, 577));
    public final C630740Ooa LLJILLL = C628500Oky.LIZ(new AwS568S0100000_24(this, 574));
    public boolean LLJJ = true;
    public C1592660rY0 LLJJI;

    @Override // com.bytedance.tiktok.homepage.mainfragment.ability.ITabAnimationAbility
    public final void WF0(C1620910sHZ c1620910sHZ) {
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.ability.ITabAnimationAbility
    public final void bA2() {
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.top.ITabTransformer
    public final void iP0() {
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.ability.ITabAnimationAbility
    public final void yw1(int i, int i2) {
    }

    public final FloatEvaluator LIZ() {
        return (FloatEvaluator) this.LLILZIL.getValue();
    }

    public final InterfaceC1592830rYH LIZLLL() {
        return (InterfaceC1592830rYH) this.LLJILLL.getValue();
    }

    public final IMFToolBarAbility LJFF() {
        return (IMFToolBarAbility) this.LLJILJIL.getValue();
    }

    public final int LIZIZ(EnumC1571190qzN enumC1571190qzN) {
        if (enumC1571190qzN == EnumC1571190qzN.LIGHT) {
            return ((Number) this.LLJIJIL.getValue()).intValue();
        }
        return ((Number) this.LLJI.getValue()).intValue();
    }

    public final int LJI(EnumC1571190qzN enumC1571190qzN) {
        if (enumC1571190qzN == EnumC1571190qzN.LIGHT) {
            return ((Number) this.LLILZLL.getValue()).intValue();
        }
        return ((Number) this.LLIZ.getValue()).intValue();
    }

    public final void LJII(EnumC1571190qzN enumC1571190qzN) {
        if (enumC1571190qzN == EnumC1571190qzN.LIGHT) {
            IMFToolBarAbility iMFToolBarAbilityLJFF = LJFF();
            if (iMFToolBarAbilityLJFF != null) {
                iMFToolBarAbilityLJFF.Rt2(null, false);
                return;
            }
            return;
        }
        IMFToolBarAbility iMFToolBarAbilityLJFF2 = LJFF();
        if (iMFToolBarAbilityLJFF2 == null) {
            return;
        }
        iMFToolBarAbilityLJFF2.ae0(null, false);
    }

    public final void LJIIJ(C1592080rX4 c1592080rX4) {
        EnumC1571190qzN enumC1571190qzN;
        View viewYp;
        View viewPr;
        C1591990rWv c1591990rWv;
        C1591980rWu tab = c1592080rX4.getTab();
        if (tab != null && (c1591990rWv = tab.LJI) != null) {
            enumC1571190qzN = c1591990rWv.LIZ;
        } else {
            enumC1571190qzN = null;
        }
        LJII(enumC1571190qzN);
        IMFToolBarAbility iMFToolBarAbilityLJFF = LJFF();
        if (iMFToolBarAbilityLJFF != null && (viewPr = iMFToolBarAbilityLJFF.pr()) != null) {
            C786410Ut5.T4(viewPr, 1.0f);
        }
        IMFToolBarAbility iMFToolBarAbilityLJFF2 = LJFF();
        if (iMFToolBarAbilityLJFF2 != null && (viewYp = iMFToolBarAbilityLJFF2.Yp()) != null) {
            C786410Ut5.T4(viewYp, 1.0f);
        }
    }

    public final void LJIIJJI(C1592080rX4 c1592080rX4) {
        EnumC1571190qzN enumC1571190qzN;
        float f;
        int iIntValue;
        C1591990rWv c1591990rWv;
        C1591980rWu tab = c1592080rX4.getTab();
        if (tab != null && (c1591990rWv = tab.LJI) != null) {
            enumC1571190qzN = c1591990rWv.LIZ;
        } else {
            enumC1571190qzN = null;
        }
        C817403Hg c817403Hg = new C817403Hg();
        EnumC1571190qzN enumC1571190qzN2 = EnumC1571190qzN.LIGHT;
        if (enumC1571190qzN == enumC1571190qzN2) {
            f = C1592730rY7.LJ;
        } else {
            f = C1592730rY7.LJFF;
        }
        c817403Hg.element = f;
        if (enumC1571190qzN == enumC1571190qzN2) {
            iIntValue = ((Number) this.LLIZLLLIL.getValue()).intValue();
        } else {
            iIntValue = ((Number) this.LLJ.getValue()).intValue();
        }
        C1592450rXf c1592450rXf = this.LLILLJJLI;
        if (c1592450rXf != null) {
            c1592450rXf.LJJII(new AwS48S0301000_24(c817403Hg, c1592080rX4, enumC1571190qzN, iIntValue, 1));
        }
        C1592450rXf c1592450rXf2 = this.LLILLJJLI;
        if (c1592450rXf2 != null) {
            c1592450rXf2.LLILLL.LJIIJ(c1592080rX4, c1592450rXf2.LLJJJ);
        }
    }

    public final void LJIILIIL(C1592080rX4 c1592080rX4) {
        EnumC1571190qzN enumC1571190qzN;
        float f;
        int iIntValue;
        C1591990rWv c1591990rWv;
        C1591980rWu tab = c1592080rX4.getTab();
        if (tab != null && (c1591990rWv = tab.LJI) != null) {
            enumC1571190qzN = c1591990rWv.LIZ;
        } else {
            enumC1571190qzN = null;
        }
        int iLJI = LJI(enumC1571190qzN);
        C817403Hg c817403Hg = new C817403Hg();
        EnumC1571190qzN enumC1571190qzN2 = EnumC1571190qzN.LIGHT;
        if (enumC1571190qzN == enumC1571190qzN2) {
            f = C1592730rY7.LJ;
        } else {
            f = C1592730rY7.LJFF;
        }
        c817403Hg.element = f;
        if (enumC1571190qzN == enumC1571190qzN2) {
            iIntValue = ((Number) this.LLIZLLLIL.getValue()).intValue();
        } else {
            iIntValue = ((Number) this.LLJ.getValue()).intValue();
        }
        C1592450rXf c1592450rXf = this.LLILLJJLI;
        if (c1592450rXf != null) {
            c1592450rXf.LJJII(new AwS7S0402000_24(c817403Hg, c1592080rX4, this, iLJI, enumC1571190qzN, iIntValue, 0));
        }
        C1592450rXf c1592450rXf2 = this.LLILLJJLI;
        if (c1592450rXf2 != null) {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1592450rXf2);
            c1592450rXf2.setAlpha(1.0f);
        }
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.top.ITabTransformer
    public final void kN0(C1592080rX4 c1592080rX4) {
        CharSequence text;
        C1592080rX4 c1592080rX42;
        TextView mCustomTextView$homepage_common_release;
        EnumC1571190qzN enumC1571190qzN;
        InterfaceC1592830rYH interfaceC1592830rYHLIZLLL;
        if (c1592080rX4 == null) {
            return;
        }
        CharSequence text2 = null;
        boolean z = true;
        if (this.LL != 1) {
            LJIILIIL(c1592080rX4);
            if (!this.LLJJ) {
                C1591980rWu tab = c1592080rX4.getTab();
                if (tab != null) {
                    C1591990rWv c1591990rWv = tab.LJI;
                    if (c1591990rWv != null && (enumC1571190qzN = c1591990rWv.LIZIZ) != null && (interfaceC1592830rYHLIZLLL = LIZLLL()) != null) {
                        interfaceC1592830rYHLIZLLL.LJ(enumC1571190qzN);
                    }
                    C1592080rX4 c1592080rX43 = tab.LIZLLL;
                    if (c1592080rX43 != null) {
                        LJIILIIL(c1592080rX43);
                        LJIIJ(c1592080rX43);
                    }
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("reset>>>selectTab:");
                if (tab != null && (c1592080rX42 = tab.LIZLLL) != null && (mCustomTextView$homepage_common_release = c1592080rX42.getMCustomTextView$homepage_common_release()) != null) {
                    text = mCustomTextView$homepage_common_release.getText();
                } else {
                    text = null;
                }
                sbLIZ.append((Object) text);
                sbLIZ.append(" ,scrollData:");
                if (this.LLJJI == null) {
                    z = false;
                }
                sbLIZ.append(z);
                C2188811AlT.LIZIZ(sbLIZ);
            }
        }
        this.LLJJ = false;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("transformSelectedTopTab:");
        TextView mCustomTextView$homepage_common_release2 = c1592080rX4.getMCustomTextView$homepage_common_release();
        if (mCustomTextView$homepage_common_release2 != null) {
            text2 = mCustomTextView$homepage_common_release2.getText();
        }
        sbLIZ2.append((Object) text2);
        C2188811AlT.LIZIZ(sbLIZ2);
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageScrollStateChanged(int i) {
        if (i == 1) {
            this.LL = i;
            return;
        }
        if (i != 0) {
            return;
        }
        if (this.LL == 1) {
            C1592450rXf c1592450rXf = this.LLILLJJLI;
            if (c1592450rXf != null) {
                new AwS603S0100000_24(this, 89).invoke(c1592450rXf.LLILLJJLI);
            }
            this.LL = 0;
        }
        this.LLJJI = null;
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageSelected(int i) {
        C1591980rWu c1591980rWuLJIILIIL;
        C1592080rX4 c1592080rX4;
        C1592450rXf c1592450rXf = this.LLILLJJLI;
        if (c1592450rXf != null && (c1591980rWuLJIILIIL = c1592450rXf.LJIILIIL(i)) != null && (c1592080rX4 = c1591980rWuLJIILIIL.LIZLLL) != null) {
            LJIIJJI(c1592080rX4);
        }
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.top.ITabTransformer
    public final void SB0(C19EG c19eg, C1592450rXf c1592450rXf) {
        HomeViewPagerAbility homeViewPagerAbility;
        Object ability;
        Object obj = null;
        InterfaceC665370Q7z interfaceC665370Q7zLJI = C1558360qeg.LJI(c19eg, null);
        if (C296200BjG.LIZ()) {
            C0QSJ c0qsjLIZJ = C687700QyG.LIZJ(interfaceC665370Q7zLJI, MainActivityScope.class);
            if (c0qsjLIZJ != null) {
                ability = c0qsjLIZJ.getAbility(HomeViewPagerAbility.class);
            } else {
                ability = null;
            }
            if (ability instanceof HomeViewPagerAbility) {
                obj = ability;
            }
            homeViewPagerAbility = (HomeViewPagerAbility) obj;
        } else {
            homeViewPagerAbility = (HomeViewPagerAbility) C1558520qew.LIZ(interfaceC665370Q7zLJI, HomeViewPagerAbility.class, null);
        }
        if (homeViewPagerAbility != null) {
            homeViewPagerAbility.LLJJI(this);
        }
        this.LLILLJJLI = c1592450rXf;
        this.LLILLL = interfaceC665370Q7zLJI;
        c1592450rXf.setTabTransformer(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0280  */
    @Override // X.InterfaceC469360Ias
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onPageScrolled(int r14, float r15, int r16) {
        /*
            Method dump skipped, instruction units count: 833
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.homepage.ui.view.tab.TabAnimationTransformer.onPageScrolled(int, float, int):void");
    }
}
