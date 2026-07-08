package com.ss.android.ugc.aweme.minidrama.common.component.topfeed.skylight;

import X.AbstractViewOnClickListenerC1165700gRM;
import X.C1287400jbe;
import X.C1308910kAL;
import X.C1385040m98;
import X.C1565840qqk;
import X.C1568080quM;
import X.C1578770rBb;
import X.C1578910rBp;
import X.C1579610rCx;
import X.C1579900rDQ;
import X.C1579950rDV;
import X.C1579960rDW;
import X.C1580020rDc;
import X.C1592450rXf;
import X.C19RF;
import X.C2217381BqS;
import X.C279260Ax2;
import X.C337180DJs;
import X.C418440Gaw;
import X.C497820Jfg;
import X.C724240Sb0;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1287420jbg;
import X.InterfaceC1578920rBq;
import X.ViewOnLayoutChangeListenerC1620710sHF;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.tiktok.homepage.mainfragment.ability.IMFToolBarAbility;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.top.ITabStrip;
import com.ss.android.ugc.aweme.series.feed.tab.common.ab.SeriesFeedTabConfig;
import com.ss.android.ugc.aweme.series.feed.tab.skylight.SeriesSkyLightAssem;
import com.ss.android.ugc.aweme.series.feed.tab.skylight.SeriesSkyLightVM;
import com.ss.android.ugc.feed.platform.panel.clean.IFeedCleanAbility;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS310S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS638S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public abstract class BaseSkylightAssem extends UIContentAssem {
    public static final int LLJIJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(58));
    public final C1579960rDW LLIZLLLIL = new C1579960rDW();
    public final C1580020rDc LLJ = new Object() { // from class: X.0rDc
    };
    public ViewGroup LLJI;

    public abstract SeriesSkyLightVM Go();

    public final void Ho() {
        int iIntValue;
        Integer numP21;
        ViewGroup viewGroup;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        C1592450rXf c1592450rXfLV0;
        SeriesSkyLightAssem seriesSkyLightAssem = (SeriesSkyLightAssem) this;
        ITabStrip iTabStrip = (ITabStrip) seriesSkyLightAssem.LLJJIJI.getValue();
        if (iTabStrip == null || (c1592450rXfLV0 = iTabStrip.LV0()) == null || c1592450rXfLV0.isShown()) {
            IMFToolBarAbility iMFToolBarAbility = (IMFToolBarAbility) seriesSkyLightAssem.LLJJIII.getValue();
            iIntValue = (iMFToolBarAbility == null || (numP21 = iMFToolBarAbility.P21()) == null) ? LLJIJIL : numP21.intValue();
        } else {
            iIntValue = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        }
        Context context = seriesSkyLightAssem.getContext();
        int iLIZJ = iIntValue + (context != null ? C497820Jfg.LIZJ(context) : 0);
        ViewGroup viewGroup2 = this.LLJI;
        if (viewGroup2 != null) {
            viewGroup2.setPadding(viewGroup2.getPaddingLeft(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)) + iLIZJ, viewGroup2.getPaddingRight(), viewGroup2.getPaddingBottom());
        }
        C1579950rDV c1579950rDV = this.LLIZLLLIL.LIZ;
        if (c1579950rDV == null || (viewGroup = c1579950rDV.LJ) == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = null;
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            marginLayoutParams.topMargin = iLIZJ;
            marginLayoutParams2 = marginLayoutParams;
        }
        C786410Ut5.X5(marginLayoutParams2, viewGroup);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        C19RF c19rf;
        View viewFindViewById;
        View viewTd;
        ViewGroup viewGroup;
        int iIntValue;
        IFeedCleanAbility iFeedCleanAbilityLIZ;
        C1592450rXf c1592450rXfLV0;
        SeriesSkyLightAssem seriesSkyLightAssem = (SeriesSkyLightAssem) this;
        C1579900rDQ c1579900rDQ = SeriesSkyLightAssem.LLJJIJIL;
        SeriesFeedTabConfig.LIZ.getClass();
        if (Intrinsics.LJFF(((SeriesFeedTabConfig.ConfigModel) SeriesFeedTabConfig.LIZJ.getValue()).getUseSkylightShaderBg(), Boolean.TRUE)) {
            C1287400jbe c1287400jbe = (C1287400jbe) view.findViewById(R.id.z12);
            C337180DJs.LIZJ(c1287400jbe);
            EnumC1287420jbg enumC1287420jbg = EnumC1287420jbg.SpinDiffuse;
            SeriesSkyLightAssem.LLJJIJIL.getClass();
            c1287400jbe.LIZ(enumC1287420jbg, C1579900rDQ.LIZ(null, null));
            c1287400jbe.setZOrderMediaOverlay(false);
            c1287400jbe.LIZJ();
            seriesSkyLightAssem.LLJJI = c1287400jbe;
        } else {
            seriesSkyLightAssem.LLJJ = (ViewGroup) view.findViewById(R.id.i6c);
        }
        if (C279260Ax2.LIZ()) {
            c19rf = (C19RF) view.findViewById(R.id.vbg);
        } else {
            c19rf = (C19RF) view.findViewById(R.id.tpg);
        }
        if (C279260Ax2.LIZ()) {
            viewFindViewById = view.findViewById(R.id.huk);
        } else {
            viewFindViewById = view.findViewById(R.id.tpg);
        }
        ITabStrip iTabStrip = (ITabStrip) seriesSkyLightAssem.LLJJIJI.getValue();
        if (iTabStrip != null && (c1592450rXfLV0 = iTabStrip.LV0()) != null) {
            c1592450rXfLV0.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC1620710sHF(seriesSkyLightAssem, 1));
        }
        ViewGroup viewGroup2 = (ViewGroup) view.findViewById(R.id.i_i);
        C1578910rBp c1578910rBp = (C1578910rBp) view.findViewById(R.id.vbg);
        ViewGroup viewGroup3 = (ViewGroup) view.findViewById(R.id.i_j);
        if (viewGroup3 != null) {
            Fragment fragmentLJI = C724240Sb0.LJI(seriesSkyLightAssem);
            if (fragmentLJI != null && (iFeedCleanAbilityLIZ = C1565840qqk.LIZ(fragmentLJI)) != null) {
                iFeedCleanAbilityLIZ.Cp0(viewGroup3);
            }
        } else {
            viewGroup3 = null;
        }
        C1579950rDV c1579950rDV = new C1579950rDV(viewGroup2, c1578910rBp, c19rf, viewFindViewById, viewGroup3);
        if (viewGroup2 != null) {
            C786410Ut5.LJJJJI(viewGroup2);
            if (C279260Ax2.LIZ()) {
                viewTd = C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.f58, viewGroup2, true);
            } else {
                viewTd = C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.f59, viewGroup2, false);
                viewGroup2.addView(viewTd);
            }
            if ((viewTd instanceof ViewGroup) && (viewGroup = (ViewGroup) viewTd) != null) {
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a03, C1385040m98.LIZ(viewGroup.getContext(), true));
                if (numLIZJ != null) {
                    iIntValue = numLIZJ.intValue();
                } else {
                    iIntValue = 0;
                }
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    viewGroup.getChildAt(i).setBackgroundColor(iIntValue);
                }
                this.LLJI = viewGroup;
            }
        }
        C1578910rBp c1578910rBp2 = c1579950rDV.LIZIZ;
        if (c1578910rBp2 != null) {
            c1578910rBp2.setListener(new InterfaceC1578920rBq() { // from class: X.0rCd
                @Override // X.InterfaceC1578920rBq
                public final boolean LIZ(EnumC1578110rAX enumC1578110rAX) {
                    return Intrinsics.LJFF(this.LIZ.Go().zQ2(new C1579600rCw(enumC1578110rAX)), Boolean.TRUE);
                }

                @Override // X.InterfaceC1578920rBq
                public final void LIZIZ(EnumC1578110rAX enumC1578110rAX) {
                    int i2 = C1577990rAL.LIZ[enumC1578110rAX.ordinal()];
                    boolean z = false;
                    if (i2 != 1) {
                        if (i2 != 2 && i2 != 3) {
                            return;
                        }
                        this.LIZ.Go().zQ2(new C1579520rCo(false, EnumC1579440rCg.SIMPLE_TOUCH));
                        return;
                    }
                    C1579620rCy c1579620rCy = this.LIZ.Go().getState().LLILZ;
                    if (c1579620rCy != null) {
                        z = c1579620rCy.LIZ;
                    }
                    this.LIZ.Go().zQ2(new C1579520rCo(!z, EnumC1579440rCg.DRAG_DOWN));
                }
            });
        }
        ViewGroup viewGroup4 = c1579950rDV.LJ;
        if (viewGroup4 != null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(200)));
            gradientDrawable.setColor(C1578770rBb.LIZIZ(viewGroup4.getContext(), R.attr.oj));
            gradientDrawable.setStroke(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(0.5d))), C1578770rBb.LIZIZ(viewGroup4.getContext(), R.attr.dy));
            viewGroup4.setBackground(gradientDrawable);
            C786410Ut5.I7(new AbstractViewOnClickListenerC1165700gRM() { // from class: X.0rCn
                {
                    super(300L);
                }

                @Override // X.AbstractViewOnClickListenerC1165700gRM
                public final void LIZ(View view2) {
                    if (view2 != null) {
                        this.LLILZ.Go().zQ2(C1579980rDY.LIZ);
                    }
                }
            }, viewGroup4);
        }
        C1579960rDW c1579960rDW = this.LLIZLLLIL;
        AwS638S0100000_24 awS638S0100000_24 = new AwS638S0100000_24(this, 0);
        c1579960rDW.LIZ = c1579950rDV;
        c1579960rDW.LIZLLL = awS638S0100000_24;
        Ho();
        SeriesSkyLightVM seriesSkyLightVMGo = seriesSkyLightAssem.Go();
        C736680Sv4.LJIIIIZZ(seriesSkyLightAssem, seriesSkyLightVMGo, new C2217381BqS() { // from class: X.0rD5
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1579450rCh) obj).LLILLL;
            }
        }, null, new AwS638S0100000_24((BaseSkylightAssem) seriesSkyLightAssem, 1), 6);
        C736680Sv4.LJIIIIZZ(seriesSkyLightAssem, seriesSkyLightVMGo, new C2217381BqS() { // from class: X.0rCt
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1579450rCh) obj).LLILZ;
            }
        }, null, new AwS638S0100000_24((BaseSkylightAssem) seriesSkyLightAssem, 2), 6);
        C736680Sv4.LJIIIIZZ(seriesSkyLightAssem, seriesSkyLightVMGo, new C2217381BqS() { // from class: X.0rDA
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1579450rCh) obj).LLILZIL;
            }
        }, null, new AwS638S0100000_24((BaseSkylightAssem) seriesSkyLightAssem, 3), 6);
        SeriesSkyLightVM seriesSkyLightVMGo2 = seriesSkyLightAssem.Go();
        C736680Sv4.LJIIIIZZ(seriesSkyLightAssem, seriesSkyLightVMGo2, new C2217381BqS() { // from class: X.0rD6
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1579450rCh) obj).LLILLJJLI;
            }
        }, null, new AwS638S0100000_24(seriesSkyLightAssem, 121), 6);
        C736680Sv4.LJIIIIZZ(seriesSkyLightAssem, seriesSkyLightVMGo2, new C2217381BqS() { // from class: X.0rCu
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1579450rCh) obj).LLILZ;
            }
        }, null, AFwS310S0000000_24.get$arr$(59), 6);
        C736680Sv4.LJIIIIZZ(seriesSkyLightAssem, seriesSkyLightVMGo2, new C2217381BqS() { // from class: X.0rD7
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1579450rCh) obj).LL;
            }
        }, null, new AwS638S0100000_24(seriesSkyLightAssem, 78), 6);
        seriesSkyLightVMGo2.zQ2(new C1579610rCx(((C1568080quM) seriesSkyLightAssem.LLJILLL.getValue()).LL, new AwS568S0100000_24(seriesSkyLightAssem, 1623)));
    }
}
