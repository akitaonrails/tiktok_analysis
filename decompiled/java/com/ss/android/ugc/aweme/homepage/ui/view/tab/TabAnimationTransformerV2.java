package com.ss.android.ugc.aweme.homepage.ui.view.tab;

import X.C01GW;
import X.C0COX;
import X.C0QSJ;
import X.C1388190mED;
import X.C14LC;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1561720qk6;
import X.C1581510rG1;
import X.C1591450rW3;
import X.C1591960rWs;
import X.C1591980rWu;
import X.C1591990rWv;
import X.C1592080rX4;
import X.C1592450rXf;
import X.C1592480rXi;
import X.C1592670rY1;
import X.C1592680rY2;
import X.C1592690rY3;
import X.C1592700rY4;
import X.C1592710rY5;
import X.C1592720rY6;
import X.C1592730rY7;
import X.C1592740rY8;
import X.C1592750rY9;
import X.C1592770rYB;
import X.C1592780rYC;
import X.C1592840rYI;
import X.C1592850rYJ;
import X.C1593200rYs;
import X.C1601090rlb;
import X.C1619980sG4;
import X.C1620910sHZ;
import X.C19EG;
import X.C1AV2;
import X.C1AV3;
import X.C2188811AlT;
import X.C277790Auf;
import X.C282830B6r;
import X.C296200BjG;
import X.C309690CBz;
import X.C343710Ddh;
import X.C452501pT;
import X.C628500Oky;
import X.C630740Ooa;
import X.C687700QyG;
import X.C786410Ut5;
import X.C817403Hg;
import X.C960203pA;
import X.EnumC1571190qzN;
import X.EnumC1584350rKb;
import X.EnumC452301pR;
import X.InterfaceC1585190rLx;
import X.InterfaceC1592830rYH;
import X.InterfaceC469360Ias;
import X.InterfaceC665370Q7z;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.AAListenerS273S0200000_24;
import Y.ARunnableS93S0200000_24;
import Y.AUListenerS229S0200000_24;
import Y.AUListenerS272S0100000_24;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.immersionbar.ImmersionBar;
import com.bytedance.tiktok.homepage.mainfragment.ability.IMFShopAbility;
import com.bytedance.tiktok.homepage.mainfragment.ability.IMFToolBarAbility;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility;
import com.ss.android.ugc.aweme.experiment.TopTabUiAlignmentConfig;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.TabAnimationTransformerV2;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.top.ITabStrip;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.top.ITabTransformer;
import com.ss.android.ugc.aweme.main.TabChangeManager;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.aweme.story.ability.StoryToolBarIconAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS15S0211000_24;
import kotlin.jvm.internal.AwS233S0300000_24;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.AwS7S0402000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class TabAnimationTransformerV2 implements InterfaceC469360Ias, ITabTransformer {
    public static boolean LLJJIJIL = true;
    public int LL;
    public int LLILLJJLI;
    public C1592450rXf LLILLL;
    public InterfaceC665370Q7z LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;
    public final C01GW LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public final C630740Ooa LLJILJILJ;
    public final C630740Ooa LLJILLL;
    public final C630740Ooa LLJJ;
    public Animator LLJJI;
    public final List<InterfaceC1585190rLx> LLJJIII;
    public float LLJJIJI;
    public C1592740rY8 LLJJIJIIJIL;

    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.top.ITabTransformer
    public final void iP0() {
    }

    public final int LJFF() {
        return ((Number) this.LLIZLLLIL.getValue()).intValue();
    }

    public final int LJI() {
        return ((Number) this.LLIZ.getValue()).intValue();
    }

    public final IMFToolBarAbility LJII() {
        return (IMFToolBarAbility) this.LLJILJILJ.getValue();
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.ability.ITabAnimationAbility
    public final void bA2() {
        C1592450rXf c1592450rXf = this.LLILLL;
        LJIIZILJ(c1592450rXf != null ? c1592450rXf.LJIIL("Drama") : null, true);
    }

    public TabAnimationTransformerV2() {
        EnumC452301pR enumC452301pR = EnumC452301pR.NONE;
        this.LLILZIL = C452501pT.LIZ(enumC452301pR, new C1592850rYJ());
        this.LLILZLL = C452501pT.LIZ(enumC452301pR, new C1592840rYI());
        this.LLIZ = C452501pT.LIZIZ(new C1592720rY6(this));
        this.LLIZLLLIL = C452501pT.LIZIZ(new C1592710rY5(this));
        this.LLJ = C452501pT.LIZIZ(new C1592670rY1(this));
        this.LLJI = C452501pT.LIZIZ(new C1592680rY2(this));
        this.LLJIJIL = C452501pT.LIZIZ(new C1592690rY3(this));
        this.LLJILJIL = C452501pT.LIZIZ(new C1592700rY4(this));
        this.LLJILJILJ = C628500Oky.LIZ(new C1592780rYC(this));
        this.LLJILLL = C628500Oky.LIZ(new C1592770rYB(this));
        this.LLJJ = C628500Oky.LIZ(new C1592750rY9(this));
        this.LLJJIII = new ArrayList();
    }

    public final void LJIIJ(C1592740rY8 c1592740rY8) {
        boolean zLJFF;
        C1591450rW3 c1591450rW3PO0;
        TuxIconView tuxIconView;
        C1591980rWu c1591980rWuLJIILIIL;
        C1591990rWv c1591990rWv;
        C1591980rWu c1591980rWuLJIILIIL2;
        C1591990rWv c1591990rWv2;
        C1592450rXf c1592450rXf = this.LLILLL;
        if (c1592450rXf != null && (c1591980rWuLJIILIIL2 = c1592450rXf.LJIILIIL(c1592740rY8.LIZIZ)) != null && (c1591990rWv2 = c1591980rWuLJIILIIL2.LJI) != null) {
            c1592740rY8.LJ = c1591990rWv2.LIZ;
            c1592740rY8.LJI = c1591990rWv2.LIZIZ;
        }
        C1592450rXf c1592450rXf2 = this.LLILLL;
        if (c1592450rXf2 != null && (c1591980rWuLJIILIIL = c1592450rXf2.LJIILIIL(c1592740rY8.LIZJ)) != null && (c1591990rWv = c1591980rWuLJIILIIL.LJI) != null) {
            c1592740rY8.LJFF = c1591990rWv.LIZ;
            c1592740rY8.LJII = c1591990rWv.LIZIZ;
        }
        InterfaceC1592830rYH interfaceC1592830rYH = (InterfaceC1592830rYH) this.LLJJ.getValue();
        if (interfaceC1592830rYH != null) {
            zLJFF = interfaceC1592830rYH.LJFF();
        } else {
            zLJFF = false;
        }
        c1592740rY8.LJIIIZ = zLJFF;
        C1592740rY8 c1592740rY82 = this.LLJJIJIIJIL;
        EnumC1571190qzN enumC1571190qzN = null;
        if (c1592740rY82 != null) {
            enumC1571190qzN = c1592740rY82.LJIIIIZZ;
        }
        c1592740rY8.LJIIIIZZ = enumC1571190qzN;
        ITabStrip iTabStrip = (ITabStrip) this.LLJILLL.getValue();
        if (iTabStrip != null && (c1591450rW3PO0 = iTabStrip.PO0()) != null && (tuxIconView = c1591450rW3PO0.LJIIIIZZ) != null && tuxIconView.getVisibility() == 0) {
            c1592740rY8.LJIIJ = tuxIconView;
        }
    }

    public final void LJIIJJI(String str) {
        Context context;
        C19EG c19egLIZIZ;
        Fragment fragmentBQ2;
        StoryToolBarIconAbility storyToolBarIconAbility;
        C1AV2 c1av2LIZ = C1AV3.LIZ(1, "Feed", null, "tabanimation");
        C1592450rXf c1592450rXf = this.LLILLL;
        if (c1592450rXf != null && (context = c1592450rXf.getContext()) != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null && (fragmentBQ2 = C343710Ddh.LIZ(c19egLIZIZ).BQ2()) != null && (storyToolBarIconAbility = (StoryToolBarIconAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentBQ2, null), StoryToolBarIconAbility.class, null)) != null) {
            EnumC1584350rKb enumC1584350rKb = EnumC1584350rKb.STORY;
            Integer numMx2 = storyToolBarIconAbility.Mx2(enumC1584350rKb, str);
            if (numMx2 != null) {
                int iIntValue = numMx2.intValue();
                IMFToolBarAbility iMFToolBarAbilityLJII = LJII();
                if (iMFToolBarAbilityLJII != null) {
                    iMFToolBarAbilityLJII.rn0(enumC1584350rKb.getTag(), iIntValue, true, c1av2LIZ);
                }
            }
            EnumC1584350rKb enumC1584350rKb2 = EnumC1584350rKb.STORY_CAMERA;
            Integer numMx22 = storyToolBarIconAbility.Mx2(enumC1584350rKb2, str);
            if (numMx22 != null) {
                int iIntValue2 = numMx22.intValue();
                IMFToolBarAbility iMFToolBarAbilityLJII2 = LJII();
                if (iMFToolBarAbilityLJII2 != null) {
                    iMFToolBarAbilityLJII2.rn0(enumC1584350rKb2.getTag(), iIntValue2, true, c1av2LIZ);
                }
            }
        }
    }

    public final void LJIILIIL(C1592740rY8 c1592740rY8) {
        C1591980rWu c1591980rWuLJIILIIL;
        C1591980rWu c1591980rWuLJIILIIL2;
        C1592080rX4 c1592080rX4;
        TopTabUiAlignmentConfig topTabUiAlignmentConfig;
        int i;
        int iLJFF;
        int iLJFF2;
        TuxIconView tuxIconView;
        C1591450rW3 c1591450rW3PO0;
        TopTabUiAlignmentConfig topTabUiAlignmentConfig2;
        int i2;
        final C1592450rXf c1592450rXf;
        int iLJFF3;
        final int iLJFF4;
        final int iIntValue;
        C1592450rXf c1592450rXf2 = this.LLILLL;
        if (c1592450rXf2 == null || (c1591980rWuLJIILIIL = c1592450rXf2.LJIILIIL(c1592740rY8.LIZIZ)) == null || (c1591980rWuLJIILIIL2 = c1592450rXf2.LJIILIIL(c1592740rY8.LIZJ)) == null) {
            return;
        }
        Animator animator = this.LLJJI;
        if (animator != null && animator.isRunning()) {
            Animator animator2 = this.LLJJI;
            if (animator2 != null) {
                animator2.removeAllListeners();
            }
            Animator animator3 = this.LLJJI;
            if (animator3 != null) {
                animator3.cancel();
            }
        }
        String strLIZIZ = c1591980rWuLJIILIIL.LIZIZ();
        String str = "";
        if (strLIZIZ == null) {
            strLIZIZ = "";
        }
        String strLIZIZ2 = c1591980rWuLJIILIIL2.LIZIZ();
        if (strLIZIZ2 == null) {
            strLIZIZ2 = "";
        }
        Iterator it2 = ((ArrayList) this.LLJJIII).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1585190rLx) it2.next()).p1(strLIZIZ, strLIZIZ2);
        }
        EnumC1571190qzN enumC1571190qzN = c1592740rY8.LJ;
        final EnumC1571190qzN enumC1571190qzN2 = c1592740rY8.LJFF;
        ArrayList arrayList = new ArrayList();
        if (enumC1571190qzN != null && enumC1571190qzN2 != null) {
            C1591980rWu c1591980rWuLJIILIIL3 = c1592450rXf2.LJIILIIL(c1592450rXf2.getSelectedTabPosition());
            if (c1591980rWuLJIILIIL3 != null) {
                c1592080rX4 = c1591980rWuLJIILIIL3.LIZLLL;
            } else {
                c1592080rX4 = null;
            }
            final C1592080rX4 c1592080rX42 = c1591980rWuLJIILIIL2.LIZLLL;
            if (enumC1571190qzN2 != enumC1571190qzN && (topTabUiAlignmentConfig2 = C1581510rG1.LIZ) != null && (i2 = topTabUiAlignmentConfig2.tabTopThemeAnimatorDuration) != 0 && (c1592450rXf = this.LLILLL) != null) {
                EnumC1571190qzN enumC1571190qzN3 = EnumC1571190qzN.LIGHT;
                if (enumC1571190qzN == enumC1571190qzN3) {
                    iLJFF3 = LJI();
                } else {
                    iLJFF3 = LJFF();
                }
                if (enumC1571190qzN2 == enumC1571190qzN3) {
                    iLJFF4 = LJI();
                } else {
                    iLJFF4 = LJFF();
                }
                if (enumC1571190qzN2 == enumC1571190qzN3) {
                    iIntValue = ((Number) this.LLJ.getValue()).intValue();
                } else {
                    iIntValue = ((Number) this.LLJI.getValue()).intValue();
                }
                ValueAnimator valueAnimatorOfArgb = ValueAnimator.ofArgb(iLJFF3, iLJFF4);
                valueAnimatorOfArgb.setInterpolator(C1619980sG4.LJI());
                valueAnimatorOfArgb.setDuration(i2);
                final C1592080rX4 c1592080rX43 = c1592080rX4;
                final C1592080rX4 c1592080rX44 = c1592080rX4;
                valueAnimatorOfArgb.addListener(new Animator.AnimatorListener() { // from class: X.0rWy
                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationCancel(Animator animator4) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationRepeat(Animator animator4) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator4) {
                        Object obj;
                        C1591980rWu tab;
                        c1592450rXf.setSelectedTabIndicatorColor(iLJFF4);
                        C1592450rXf c1592450rXf3 = c1592450rXf;
                        c1592450rXf3.LJJII(new AwS233S0300000_24(enumC1571190qzN2, c1592080rX43, c1592450rXf3, 23));
                        C1592080rX4 c1592080rX45 = c1592080rX42;
                        String str2 = null;
                        if (c1592080rX45 != null && (tab = c1592080rX45.getTab()) != null) {
                            obj = tab.LJ;
                        } else {
                            obj = null;
                        }
                        if (obj instanceof String) {
                            str2 = (String) obj;
                        }
                        if (enumC1571190qzN2 == EnumC1571190qzN.LIGHT) {
                            this.LIZ(enumC1571190qzN2, str2, true);
                        } else {
                            this.LIZ(enumC1571190qzN2, str2, false);
                        }
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationStart(Animator animator4) {
                        boolean z;
                        if (C1591480rW6.LIZ() != 2 && C1591480rW6.LIZ() != 3) {
                            z = false;
                        } else {
                            z = true;
                        }
                        c1592450rXf.LJJII(new AwS15S0211000_24(z, enumC1571190qzN2, c1592080rX44, iIntValue, 1));
                    }
                });
                valueAnimatorOfArgb.addUpdateListener(new AUListenerS272S0100000_24(c1592450rXf, 26));
                arrayList.add(valueAnimatorOfArgb);
            }
            if (enumC1571190qzN2 != enumC1571190qzN && (topTabUiAlignmentConfig = C1581510rG1.LIZ) != null && (i = topTabUiAlignmentConfig.tabTopThemeAnimatorDuration) != 0) {
                EnumC1571190qzN enumC1571190qzN4 = EnumC1571190qzN.LIGHT;
                if (enumC1571190qzN == enumC1571190qzN4) {
                    iLJFF = LJI();
                } else {
                    iLJFF = LJFF();
                }
                if (enumC1571190qzN2 == enumC1571190qzN4) {
                    iLJFF2 = LJI();
                } else {
                    iLJFF2 = LJFF();
                }
                ITabStrip iTabStrip = (ITabStrip) this.LLJILLL.getValue();
                if (iTabStrip != null && (c1591450rW3PO0 = iTabStrip.PO0()) != null) {
                    tuxIconView = c1591450rW3PO0.LJIIIIZZ;
                } else {
                    tuxIconView = null;
                }
                if (!(tuxIconView instanceof TuxIconView)) {
                    tuxIconView = null;
                }
                ValueAnimator valueAnimatorOfArgb2 = ValueAnimator.ofArgb(iLJFF, iLJFF2);
                valueAnimatorOfArgb2.setInterpolator(C1619980sG4.LJI());
                valueAnimatorOfArgb2.setDuration(i);
                valueAnimatorOfArgb2.addListener(new Animator.AnimatorListener() { // from class: X.0rYM
                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationCancel(Animator animator4) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator4) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationRepeat(Animator animator4) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationStart(Animator animator4) {
                    }
                });
                valueAnimatorOfArgb2.addUpdateListener(new AUListenerS229S0200000_24(this, tuxIconView, 2));
                arrayList.add(valueAnimatorOfArgb2);
            }
        }
        if (((Boolean) C282830B6r.LIZ.getValue()).booleanValue()) {
            if (!arrayList.isEmpty()) {
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(arrayList);
                animatorSet.addListener(new AAListenerS273S0200000_24(this, c1591980rWuLJIILIIL2, 2));
                String strLIZIZ3 = c1591980rWuLJIILIIL2.LIZIZ();
                if (strLIZIZ3 != null) {
                    str = strLIZIZ3;
                }
                LJIIJJI(str);
                this.LLJJI = animatorSet;
                animatorSet.start();
                return;
            }
            return;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(arrayList);
        animatorSet2.addListener(new AAListenerS273S0200000_24(this, c1591980rWuLJIILIIL2, 3));
        String strLIZIZ4 = c1591980rWuLJIILIIL2.LIZIZ();
        if (strLIZIZ4 != null) {
            str = strLIZIZ4;
        }
        LJIIJJI(str);
        this.LLJJI = animatorSet2;
        animatorSet2.start();
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.ability.ITabAnimationAbility
    public final void WF0(C1620910sHZ c1620910sHZ) {
        ((ArrayList) this.LLJJIII).add(c1620910sHZ);
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.top.ITabTransformer
    public final void kN0(C1592080rX4 c1592080rX4) {
        CharSequence text;
        if (c1592080rX4 == null) {
            return;
        }
        if (!LLJJIJIL && this.LL != 1) {
            LJIIZILJ(c1592080rX4.getTab(), true);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("transformSelectedTopTab:");
        TextView mCustomTextView$homepage_common_release = c1592080rX4.getMCustomTextView$homepage_common_release();
        if (mCustomTextView$homepage_common_release != null) {
            text = mCustomTextView$homepage_common_release.getText();
        } else {
            text = null;
        }
        sbLIZ.append((Object) text);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageScrollStateChanged(int i) {
        this.LLILLJJLI = i;
        if (i == 1) {
            this.LL = i;
            return;
        }
        if (i != 0) {
            return;
        }
        if (this.LL == 1) {
            C1592450rXf c1592450rXf = this.LLILLL;
            if (c1592450rXf != null) {
                new AwS603S0100000_24(this, 90).invoke(c1592450rXf.LLILLJJLI);
            }
            this.LL = 0;
        }
        this.LLJJIJIIJIL = null;
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageSelected(int i) {
        Integer numValueOf;
        Integer numValueOf2;
        Integer numValueOf3;
        Boolean boolValueOf;
        C1591980rWu c1591980rWuLJIILIIL;
        C1592080rX4 c1592080rX4;
        float f;
        int iIntValue;
        C1591990rWv c1591990rWv;
        C1591980rWu c1591980rWuLJIILIIL2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPageSelected: ");
        sbLIZ.append(i);
        sbLIZ.append(',');
        C1592450rXf c1592450rXf = this.LLILLL;
        EnumC1571190qzN enumC1571190qzN = null;
        if (c1592450rXf != null) {
            numValueOf = Integer.valueOf(c1592450rXf.getSelectedTabPosition());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append("; ");
        C1592740rY8 c1592740rY8 = this.LLJJIJIIJIL;
        if (c1592740rY8 != null) {
            numValueOf2 = Integer.valueOf(c1592740rY8.LIZIZ);
        } else {
            numValueOf2 = null;
        }
        C1592740rY8 c1592740rY82 = this.LLJJIJIIJIL;
        if (c1592740rY82 != null) {
            numValueOf3 = Integer.valueOf(c1592740rY82.LIZJ);
        } else {
            numValueOf3 = null;
        }
        sbLIZ.append(new Pair(numValueOf2, numValueOf3));
        sbLIZ.append(',');
        C1592740rY8 c1592740rY83 = this.LLJJIJIIJIL;
        if (c1592740rY83 != null) {
            boolValueOf = Boolean.valueOf(c1592740rY83.LJIIJJI);
        } else {
            boolValueOf = null;
        }
        sbLIZ.append(boolValueOf);
        C2188811AlT.LIZIZ(sbLIZ);
        C1592740rY8 c1592740rY84 = this.LLJJIJIIJIL;
        if (c1592740rY84 == null) {
            if (!LLJJIJIL) {
                C1592450rXf c1592450rXf2 = this.LLILLL;
                if (c1592450rXf2 != null) {
                    c1591980rWuLJIILIIL2 = c1592450rXf2.LJIILIIL(i);
                } else {
                    c1591980rWuLJIILIIL2 = null;
                }
                LJIIZILJ(c1591980rWuLJIILIIL2, true);
            }
        } else if (i != c1592740rY84.LIZJ) {
            LJIILIIL(LIZIZ(c1592740rY84.LIZIZ, i));
        } else if (!c1592740rY84.LJIIJJI) {
            LJIILIIL(c1592740rY84);
        }
        C1592450rXf c1592450rXf3 = this.LLILLL;
        if (c1592450rXf3 != null && (c1591980rWuLJIILIIL = c1592450rXf3.LJIILIIL(i)) != null && (c1592080rX4 = c1591980rWuLJIILIIL.LIZLLL) != null) {
            C1591980rWu tab = c1592080rX4.getTab();
            if (tab != null && (c1591990rWv = tab.LJI) != null) {
                enumC1571190qzN = c1591990rWv.LIZ;
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
                iIntValue = ((Number) this.LLJ.getValue()).intValue();
            } else {
                iIntValue = ((Number) this.LLJI.getValue()).intValue();
            }
            C1592450rXf c1592450rXf4 = this.LLILLL;
            if (c1592450rXf4 != null) {
                c1592450rXf4.LJJII(new C1592480rXi(c817403Hg, c1592080rX4, enumC1571190qzN, iIntValue));
            }
            C1592450rXf c1592450rXf5 = this.LLILLL;
            if (c1592450rXf5 != null) {
                c1592450rXf5.LLILLL.LJIIJ(c1592080rX4, c1592450rXf5.LLJJJ);
            }
        }
        LLJJIJIL = false;
    }

    public final C1592740rY8 LIZIZ(int i, int i2) {
        boolean z;
        Context context;
        C1592450rXf c1592450rXf = this.LLILLL;
        boolean z2 = true;
        if (c1592450rXf != null && (context = c1592450rXf.getContext()) != null && C960203pA.LIZIZ(context)) {
            z = true;
        } else {
            z = false;
        }
        C1592740rY8 c1592740rY8 = new C1592740rY8(i, z);
        c1592740rY8.LIZIZ = i;
        c1592740rY8.LIZJ = i2;
        if (i2 >= i) {
            z2 = false;
        }
        c1592740rY8.LIZLLL = z2;
        LJIIJ(c1592740rY8);
        this.LLJJIJIIJIL = c1592740rY8;
        return c1592740rY8;
    }

    public final C1592740rY8 LIZLLL(int i, boolean z) {
        boolean z2;
        Context context;
        int i2 = i + 1;
        C1592450rXf c1592450rXf = this.LLILLL;
        if (c1592450rXf != null && (context = c1592450rXf.getContext()) != null && C960203pA.LIZIZ(context)) {
            z2 = true;
        } else {
            z2 = false;
        }
        C1592740rY8 c1592740rY8 = new C1592740rY8(i, z2);
        if (z) {
            c1592740rY8.LIZJ = i;
            c1592740rY8.LIZIZ = i2;
            c1592740rY8.LIZLLL = true;
        } else {
            c1592740rY8.LIZJ = i2;
            c1592740rY8.LIZIZ = i;
            c1592740rY8.LIZLLL = false;
        }
        LJIIJ(c1592740rY8);
        this.LLJJIJIIJIL = c1592740rY8;
        return c1592740rY8;
    }

    public final void LJIIZILJ(C1591980rWu c1591980rWu, boolean z) {
        Boolean boolValueOf;
        Integer numValueOf;
        EnumC1571190qzN enumC1571190qzN;
        Integer numValueOf2;
        CharSequence text;
        C1592080rX4 c1592080rX4;
        TextView mCustomTextView$homepage_common_release;
        C1591990rWv c1591990rWv;
        EnumC1571190qzN enumC1571190qzN2;
        int iLJFF;
        C1591990rWv c1591990rWv2;
        View view;
        EnumC1571190qzN enumC1571190qzN3;
        int iLJFF2;
        int iIntValue;
        float f;
        EnumC1571190qzN enumC1571190qzN4;
        Object obj;
        String str;
        String strLIZIZ;
        View viewYp;
        View viewPr;
        C1592450rXf c1592450rXf;
        Context context;
        C19EG c19egLIZIZ;
        Fragment fragmentZQ2;
        IMFShopAbility iMFShopAbilityLIZLLL;
        C1591990rWv c1591990rWv3;
        C1591990rWv c1591990rWv4;
        C1591990rWv c1591990rWv5;
        EnumC1571190qzN enumC1571190qzN5;
        InterfaceC1592830rYH interfaceC1592830rYH;
        Animator animator;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateThemeImmediately: anim: ");
        Animator animator2 = this.LLJJI;
        if (animator2 != null) {
            boolValueOf = Boolean.valueOf(animator2.isRunning());
        } else {
            boolValueOf = null;
        }
        sbLIZ.append(boolValueOf);
        C2188811AlT.LIZIZ(sbLIZ);
        Animator animator3 = this.LLJJI;
        boolean z2 = true;
        if (animator3 != null && animator3.isRunning() && (animator = this.LLJJI) != null) {
            animator.cancel();
        }
        if (c1591980rWu != null) {
            if (z && (c1591990rWv5 = c1591980rWu.LJI) != null && (enumC1571190qzN5 = c1591990rWv5.LIZIZ) != null && (interfaceC1592830rYH = (InterfaceC1592830rYH) this.LLJJ.getValue()) != null) {
                interfaceC1592830rYH.LJ(enumC1571190qzN5);
            }
            C1592080rX4 c1592080rX42 = c1591980rWu.LIZLLL;
            if (c1592080rX42 != null) {
                C1591980rWu tab = c1592080rX42.getTab();
                if (tab != null && (c1591990rWv4 = tab.LJI) != null) {
                    enumC1571190qzN3 = c1591990rWv4.LIZ;
                } else {
                    enumC1571190qzN3 = null;
                }
                EnumC1571190qzN enumC1571190qzN6 = EnumC1571190qzN.LIGHT;
                if (enumC1571190qzN3 == enumC1571190qzN6) {
                    iLJFF2 = LJI();
                } else {
                    iLJFF2 = LJFF();
                }
                if (enumC1571190qzN3 == enumC1571190qzN6) {
                    iIntValue = ((Number) this.LLJ.getValue()).intValue();
                } else {
                    iIntValue = ((Number) this.LLJI.getValue()).intValue();
                }
                C817403Hg c817403Hg = new C817403Hg();
                if (enumC1571190qzN3 == enumC1571190qzN6) {
                    f = C1592730rY7.LJ;
                } else {
                    f = C1592730rY7.LJFF;
                }
                c817403Hg.element = f;
                C1592450rXf c1592450rXf2 = this.LLILLL;
                if (c1592450rXf2 != null) {
                    c1592450rXf2.LJJII(new AwS7S0402000_24(c817403Hg, c1592080rX42, this, iLJFF2, enumC1571190qzN3, iIntValue, 2));
                }
                C1592450rXf c1592450rXf3 = this.LLILLL;
                if (c1592450rXf3 != null) {
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1592450rXf3);
                    c1592450rXf3.setAlpha(1.0f);
                }
                C1591980rWu tab2 = c1592080rX42.getTab();
                if (tab2 != null && (c1591990rWv3 = tab2.LJI) != null) {
                    enumC1571190qzN4 = c1591990rWv3.LIZ;
                } else {
                    enumC1571190qzN4 = null;
                }
                C1591980rWu tab3 = c1592080rX42.getTab();
                if (tab3 != null) {
                    obj = tab3.LJ;
                } else {
                    obj = null;
                }
                if (obj instanceof String) {
                    str = (String) obj;
                } else {
                    str = null;
                }
                if (enumC1571190qzN4 == enumC1571190qzN6) {
                    IMFToolBarAbility iMFToolBarAbilityLJII = LJII();
                    if (iMFToolBarAbilityLJII != null) {
                        iMFToolBarAbilityLJII.Rt2(str, false);
                    }
                } else {
                    IMFToolBarAbility iMFToolBarAbilityLJII2 = LJII();
                    if (iMFToolBarAbilityLJII2 != null) {
                        iMFToolBarAbilityLJII2.ae0(str, false);
                    }
                }
                C1591980rWu tab4 = c1592080rX42.getTab();
                if (tab4 != null) {
                    strLIZIZ = tab4.LIZIZ();
                } else {
                    strLIZIZ = null;
                }
                if (Intrinsics.LJFF(strLIZIZ, "Shop") && enumC1571190qzN4 != null && (c1592450rXf = this.LLILLL) != null && (context = c1592450rXf.getContext()) != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null && (fragmentZQ2 = C343710Ddh.LIZ(c19egLIZIZ).zQ2("HOME")) != null && (iMFShopAbilityLIZLLL = C1561720qk6.LIZLLL(fragmentZQ2)) != null) {
                    iMFShopAbilityLIZLLL.uy0(enumC1571190qzN4);
                }
                IMFToolBarAbility iMFToolBarAbilityLJII3 = LJII();
                if (iMFToolBarAbilityLJII3 != null && (viewPr = iMFToolBarAbilityLJII3.pr()) != null) {
                    C786410Ut5.T4(viewPr, 1.0f);
                }
                IMFToolBarAbility iMFToolBarAbilityLJII4 = LJII();
                if (iMFToolBarAbilityLJII4 != null && (viewYp = iMFToolBarAbilityLJII4.Yp()) != null) {
                    C786410Ut5.T4(viewYp, 1.0f);
                }
            }
            C1592740rY8 c1592740rY8 = this.LLJJIJIIJIL;
            if (c1592740rY8 != null && (view = c1592740rY8.LJIIJ) != null) {
                C786410Ut5.T4(view, 1.0f);
            }
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("updateThemeImmediately: ");
        if (c1591980rWu != null) {
            numValueOf = Integer.valueOf(c1591980rWu.LIZ);
        } else {
            numValueOf = null;
        }
        sbLIZ2.append(numValueOf);
        sbLIZ2.append(", theme: ");
        if (c1591980rWu != null && (c1591990rWv2 = c1591980rWu.LJI) != null) {
            enumC1571190qzN = c1591990rWv2.LIZ;
        } else {
            enumC1571190qzN = null;
        }
        sbLIZ2.append(enumC1571190qzN);
        sbLIZ2.append(", topThemeColor: ");
        if (c1591980rWu != null && (c1591990rWv = c1591980rWu.LJI) != null && (enumC1571190qzN2 = c1591990rWv.LIZ) != null) {
            if (enumC1571190qzN2 == EnumC1571190qzN.LIGHT) {
                iLJFF = LJI();
            } else {
                iLJFF = LJFF();
            }
            numValueOf2 = Integer.valueOf(iLJFF);
        } else {
            numValueOf2 = null;
        }
        sbLIZ2.append(numValueOf2);
        C2188811AlT.LIZIZ(sbLIZ2);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("reset>>>selectTab:");
        if (c1591980rWu != null && (c1592080rX4 = c1591980rWu.LIZLLL) != null && (mCustomTextView$homepage_common_release = c1592080rX4.getMCustomTextView$homepage_common_release()) != null) {
            text = mCustomTextView$homepage_common_release.getText();
        } else {
            text = null;
        }
        sbLIZ3.append((Object) text);
        sbLIZ3.append(" ,scrollData:");
        if (this.LLJJIJIIJIL == null) {
            z2 = false;
        }
        sbLIZ3.append(z2);
        C2188811AlT.LIZIZ(sbLIZ3);
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.top.ITabTransformer
    public final void SB0(final C19EG c19eg, final C1592450rXf c1592450rXf) {
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
        this.LLILLL = c1592450rXf;
        this.LLILZ = interfaceC665370Q7zLJI;
        c1592450rXf.setTabTransformer(this);
        if (C1601090rlb.LIZ()) {
            LLJJIJIL = false;
        }
        HandlerHook.viewPost(c1592450rXf, new Runnable() { // from class: X.0rXy
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v2, types: [X.0rYF] */
            /* JADX WARN: Type inference failed for: r2v2, types: [X.0rYG] */
            public final void LIZ() {
                IMFToolBarAbility iMFToolBarAbilityLJII = this.LL.LJII();
                if (iMFToolBarAbilityLJII != 0) {
                    final TabAnimationTransformerV2 tabAnimationTransformerV2 = this.LL;
                    iMFToolBarAbilityLJII.E40(new InterfaceC1571310qzZ() { // from class: X.0rYF
                        @Override // X.InterfaceC1571310qzZ
                        public final void LIZ() {
                            IMFToolBarAbility iMFToolBarAbilityLJII2 = tabAnimationTransformerV2.LJII();
                            if (iMFToolBarAbilityLJII2 != null) {
                                iMFToolBarAbilityLJII2.bv(false, false);
                            }
                        }

                        @Override // X.InterfaceC1571310qzZ
                        public final void LIZIZ() {
                            IMFToolBarAbility iMFToolBarAbilityLJII2 = tabAnimationTransformerV2.LJII();
                            if (iMFToolBarAbilityLJII2 != null) {
                                iMFToolBarAbilityLJII2.bv(true, false);
                            }
                        }
                    });
                }
                ITabStrip iTabStrip = (ITabStrip) this.LL.LLJILLL.getValue();
                if (iTabStrip != 0) {
                    final C1592450rXf c1592450rXf2 = c1592450rXf;
                    final TabAnimationTransformerV2 tabAnimationTransformerV22 = this.LL;
                    iTabStrip.HD(new InterfaceC1589890rTX() { // from class: X.0rYG
                        @Override // X.InterfaceC1589890rTX
                        public final void ti(int i) {
                            if (i != c1592450rXf2.getSelectedTabPosition()) {
                                tabAnimationTransformerV22.yw1(c1592450rXf2.getSelectedTabPosition(), i);
                            }
                        }
                    });
                }
                final TabChangeManager tabChangeManagerLIZ = C343710Ddh.LIZ(c19eg);
                final C1592450rXf c1592450rXf3 = c1592450rXf;
                final TabAnimationTransformerV2 tabAnimationTransformerV23 = this.LL;
                tabChangeManagerLIZ.wQ2(new InterfaceC1586360rNq() { // from class: X.0rXz
                    @Override // X.InterfaceC1586360rNq
                    public final void LLLZLZ(String str, String str2, boolean z, boolean z2, Bundle bundle, String str3) {
                        InterfaceC1592830rYH interfaceC1592830rYH;
                        Fragment fragmentBQ2;
                        if (Intrinsics.LJFF(str, "HOME")) {
                            TabChangeManager tabChangeManager = tabChangeManagerLIZ;
                            if (tabChangeManager != null && (fragmentBQ2 = tabChangeManager.BQ2()) != null && fragmentBQ2.isAdded()) {
                                TabAnimationTransformerV2 tabAnimationTransformerV24 = tabAnimationTransformerV23;
                                C1592450rXf c1592450rXf4 = c1592450rXf3;
                                tabAnimationTransformerV24.LJIIZILJ(c1592450rXf4.LJIILIIL(c1592450rXf4.getSelectedTabPosition()), true);
                                return;
                            } else {
                                C1592450rXf c1592450rXf5 = c1592450rXf3;
                                HandlerHook.viewPost(c1592450rXf5, new ARunnableS93S0200000_24(tabAnimationTransformerV23, c1592450rXf5, 13));
                                return;
                            }
                        }
                        if (!Intrinsics.LJFF(str2, "HOME") || !C1593730rZj.LIZIZ.LJJII() || (interfaceC1592830rYH = (InterfaceC1592830rYH) tabAnimationTransformerV23.LLJJ.getValue()) == null) {
                            return;
                        }
                        interfaceC1592830rYH.LJ(EnumC1571190qzN.LIGHT);
                    }
                });
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("TabAnimationTransformerV2@28d6.attach$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("TabAnimationTransformerV2@28d6.attach$1");
            }
        });
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.ability.ITabAnimationAbility
    public final void yw1(int i, int i2) {
        TopTabUiAlignmentConfig topTabUiAlignmentConfig = C1581510rG1.LIZ;
        if (topTabUiAlignmentConfig != null && topTabUiAlignmentConfig.tabClickTransformAnimator > 0) {
            this.LLJJIJIIJIL = LIZIZ(i, i2);
        }
    }

    public final void LIZ(EnumC1571190qzN enumC1571190qzN, String str, boolean z) {
        Context context;
        C19EG c19egLIZIZ;
        boolean z2;
        C1592450rXf c1592450rXf = this.LLILLL;
        if (c1592450rXf != null && (context = c1592450rXf.getContext()) != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
            if (C14LC.LJIILL <= 0 && C0COX.LJI) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (((Number) C277790Auf.LIZ.getValue()).intValue() > 0) {
                C1591960rWs.LIZ(c19egLIZIZ, z2, str, enumC1571190qzN);
                return;
            }
            ImmersionBar immersionBarLJIILJJIL = ImmersionBar.LJIILJJIL(c19egLIZIZ);
            TuxImmersionBar tuxImmersionBar = new TuxImmersionBar(c19egLIZIZ, immersionBarLJIILJJIL);
            if (Intrinsics.LJFF(str, "Nearby")) {
                immersionBarLJIILJJIL.LJIIL();
                tuxImmersionBar.LIZLLL();
                return;
            }
            if (z) {
                tuxImmersionBar.LJIIIIZZ(R.attr.bx);
                tuxImmersionBar.LJ(R.attr.bx);
                tuxImmersionBar.LIZ(true);
                tuxImmersionBar.LIZLLL();
                return;
            }
            if (z2) {
                tuxImmersionBar.LJIIL();
            } else {
                tuxImmersionBar.LJIIIIZZ(R.attr.e1);
            }
            tuxImmersionBar.LJ(R.attr.e1);
            tuxImmersionBar.LIZ(true);
            tuxImmersionBar.LIZLLL();
        }
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageScrolled(int i, float f, int i2) {
        Boolean boolValueOf;
        Boolean boolValueOf2;
        C1592740rY8 c1592740rY8LIZLLL;
        boolean z;
        boolean z2;
        InterfaceC1592830rYH interfaceC1592830rYH;
        EnumC1571190qzN enumC1571190qzN;
        EnumC1571190qzN enumC1571190qzN2;
        boolean z3;
        int iIntValue;
        int iIntValue2;
        boolean z4;
        Integer num;
        boolean z5;
        C1592450rXf c1592450rXf;
        boolean z6;
        Integer numValueOf;
        float f2 = f;
        if (f2 != 0.0f && this.LL == 1) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onPageScrolled: ");
            sbLIZ.append(i);
            sbLIZ.append(", ");
            sbLIZ.append(f2);
            sbLIZ.append(", ");
            sbLIZ.append(this.LLJJIJI);
            sbLIZ.append(", ");
            C1592740rY8 c1592740rY8 = this.LLJJIJIIJIL;
            Float fEvaluate = null;
            if (c1592740rY8 != null) {
                boolValueOf = Boolean.valueOf(c1592740rY8.LJIIJJI);
            } else {
                boolValueOf = null;
            }
            sbLIZ.append(boolValueOf);
            sbLIZ.append(", ");
            Animator animator = this.LLJJI;
            if (animator != null) {
                boolValueOf2 = Boolean.valueOf(animator.isRunning());
            } else {
                boolValueOf2 = null;
            }
            sbLIZ.append(boolValueOf2);
            C2188811AlT.LIZIZ(sbLIZ);
            C1592740rY8 c1592740rY82 = this.LLJJIJIIJIL;
            if (c1592740rY82 != null && c1592740rY82.LIZ != i) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("last:");
                C1592740rY8 c1592740rY83 = this.LLJJIJIIJIL;
                if (c1592740rY83 != null) {
                    numValueOf = Integer.valueOf(c1592740rY83.LIZ);
                } else {
                    numValueOf = null;
                }
                sbLIZ2.append(numValueOf);
                sbLIZ2.append(",position:");
                sbLIZ2.append(i);
                C2188811AlT.LIZIZ(sbLIZ2);
                this.LLJJIJIIJIL = null;
            }
            C1592740rY8 c1592740rY8LIZLLL2 = this.LLJJIJIIJIL;
            if (c1592740rY8LIZLLL2 == null) {
                if (f2 > 0.5f) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                c1592740rY8LIZLLL2 = LIZLLL(i, z6);
            }
            float f3 = i + f2;
            if (f3 > this.LLJJIJI) {
                if (f2 > 0.51f) {
                    if (!c1592740rY8LIZLLL2.LIZLLL) {
                        z = c1592740rY8LIZLLL2.LJIIJJI;
                        z2 = !z;
                        c1592740rY8LIZLLL = c1592740rY8LIZLLL2;
                    }
                } else if (c1592740rY8LIZLLL2.LIZLLL) {
                    c1592740rY8LIZLLL = LIZLLL(i, false);
                    z2 = false;
                }
                z2 = false;
                c1592740rY8LIZLLL = c1592740rY8LIZLLL2;
            } else {
                if (f2 < 0.49f) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("RTL: ");
                    sbLIZ3.append(f2);
                    sbLIZ3.append(", ");
                    sbLIZ3.append(Boolean.valueOf(c1592740rY8LIZLLL2.LIZLLL));
                    C2188811AlT.LIZIZ(sbLIZ3);
                    if (c1592740rY8LIZLLL2.LIZLLL) {
                        z = c1592740rY8LIZLLL2.LJIIJJI;
                        z2 = !z;
                        c1592740rY8LIZLLL = c1592740rY8LIZLLL2;
                    }
                } else if (!c1592740rY8LIZLLL2.LIZLLL) {
                    c1592740rY8LIZLLL = LIZLLL(i, true);
                    z2 = false;
                }
                z2 = false;
                c1592740rY8LIZLLL = c1592740rY8LIZLLL2;
            }
            this.LLJJIJI = f3;
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("last: ");
            sbLIZ4.append(Boolean.valueOf(c1592740rY8LIZLLL2.LIZLLL));
            sbLIZ4.append(", current: ");
            sbLIZ4.append(Boolean.valueOf(c1592740rY8LIZLLL.LIZLLL));
            C2188811AlT.LIZIZ(sbLIZ4);
            if (z2) {
                c1592740rY8LIZLLL.LJIIJJI = true;
                LJIILIIL(c1592740rY8LIZLLL);
            }
            if (f2 != 0.0f && (interfaceC1592830rYH = (InterfaceC1592830rYH) this.LLJJ.getValue()) != null && c1592740rY8LIZLLL.LJIIIZ && (enumC1571190qzN = c1592740rY8LIZLLL.LJII) != (enumC1571190qzN2 = c1592740rY8LIZLLL.LJI)) {
                if (c1592740rY8LIZLLL.LIZLLL) {
                    f2 = 1 - f2;
                }
                if (enumC1571190qzN2 != null && enumC1571190qzN != null) {
                    if (0.0f <= f2 && f2 <= 0.5f) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        if (c1592740rY8LIZLLL.LJIIIIZZ != enumC1571190qzN2) {
                            c1592740rY8LIZLLL.LJIIIIZZ = enumC1571190qzN2;
                            interfaceC1592830rYH.LIZIZ(enumC1571190qzN2);
                        }
                    } else if (0.5f <= f2 && f2 <= 1.0f && c1592740rY8LIZLLL.LJIIIIZZ != enumC1571190qzN) {
                        c1592740rY8LIZLLL.LJIIIIZZ = enumC1571190qzN;
                        interfaceC1592830rYH.LIZIZ(enumC1571190qzN);
                    }
                    boolean z7 = C14LC.LJIIIZ;
                    if (C309690CBz.LIZ.LJFF) {
                        EnumC1571190qzN enumC1571190qzN3 = EnumC1571190qzN.LIGHT;
                        if (enumC1571190qzN2 == enumC1571190qzN3) {
                            iIntValue = ((Number) this.LLJILJIL.getValue()).intValue();
                        } else {
                            iIntValue = ((Number) this.LLJIJIL.getValue()).intValue();
                        }
                        if (enumC1571190qzN == enumC1571190qzN3) {
                            iIntValue2 = ((Number) this.LLJILJIL.getValue()).intValue();
                        } else {
                            iIntValue2 = ((Number) this.LLJIJIL.getValue()).intValue();
                        }
                        if (this.LLILLJJLI == 2 && (c1592450rXf = this.LLILLL) != null && c1592450rXf.getSelectedTabPosition() == c1592740rY8LIZLLL.LIZJ) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (f2 < 0.25f) {
                            interfaceC1592830rYH.LIZ(iIntValue, null);
                            return;
                        }
                        if (0.25f <= f2 && f2 <= 0.75f) {
                            if (z4) {
                                interfaceC1592830rYH.LIZ(iIntValue2, Float.valueOf(1.0f));
                                return;
                            }
                            float f4 = f2 - 0.25f;
                            Object objEvaluate = ((C1593200rYs) this.LLILZIL.getValue()).evaluate(2 * f4, Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2));
                            if (!(objEvaluate instanceof Integer) || (num = (Integer) objEvaluate) == null) {
                                return;
                            }
                            int iIntValue3 = num.intValue();
                            if (0.25f <= f2 && f2 <= 0.5f) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if (z5) {
                                fEvaluate = ((FloatEvaluator) this.LLILZLL.getValue()).evaluate(f4 * 4, (Number) 1, (Number) Float.valueOf(C1592730rY7.LJI));
                            } else if (0.5f <= f2 && f2 <= 0.75f) {
                                fEvaluate = ((FloatEvaluator) this.LLILZLL.getValue()).evaluate((f2 - 0.5f) * 4, (Number) Float.valueOf(C1592730rY7.LJI), (Number) 1);
                            }
                            interfaceC1592830rYH.LIZ(iIntValue3, fEvaluate);
                            return;
                        }
                        if (!z4) {
                            return;
                        }
                        interfaceC1592830rYH.LIZ(iIntValue2, Float.valueOf(1.0f));
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        this.LLJJIJI = i + f2;
    }
}
