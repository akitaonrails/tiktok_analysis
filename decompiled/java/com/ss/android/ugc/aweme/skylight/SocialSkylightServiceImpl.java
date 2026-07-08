package com.ss.android.ugc.aweme.skylight;

import X.C0HCN;
import X.C1256440ini;
import X.C14KQ;
import X.C1605420rsa;
import X.C1607440rvq;
import X.C1608320rxG;
import X.C1608360rxK;
import X.C1608370rxL;
import X.C1608380rxM;
import X.C1608410rxP;
import X.C1610770s1D;
import X.C1618440sDa;
import X.C19727912Gn;
import X.C19736612Jw;
import X.C418440Gaw;
import X.C426750GoL;
import X.C427660Gpo;
import X.C443000HYs;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1606080rte;
import X.InterfaceC1609810rzf;
import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import com.ss.android.ugc.aweme.experiment.FollowingSkylightAbilityExperienceExp;
import com.ss.android.ugc.aweme.story.setting.ui.size.StoryAvatarConfigWrapper;
import java.util.Map;

/* JADX INFO: loaded from: classes25.dex */
public final class SocialSkylightServiceImpl implements ISocialSkylightService {
    public static final /* synthetic */ int LIZ = 0;

    @Override // com.ss.android.ugc.aweme.skylight.ISocialSkylightService
    public final int LIZJ() {
        return C0HCN.LIZ() ? C814420VxA.LIZIZ(C418440Gaw.LIZIZ(139)) : C814420VxA.LIZIZ(C418440Gaw.LIZIZ(151));
    }

    public static int LJIIIIZZ(EnumC1606080rte enumC1606080rte) {
        if (enumC1606080rte != EnumC1606080rte.FOLLOW_SKYLIGHT && enumC1606080rte != EnumC1606080rte.FYP_SKYLIGHT) {
            return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
        }
        return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5));
    }

    public static int LJI(EnumC1606080rte enumC1606080rte, boolean z) {
        if (C1256440ini.LIZ() && enumC1606080rte == EnumC1606080rte.INBOX_TOP_LIST && !z) {
            if (C0HCN.LIZ()) {
                return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
            }
            return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        }
        return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
    }

    public static C1608380rxM LJIIIZ(EnumC1606080rte enumC1606080rte, boolean z) {
        if (C1605420rsa.LIZ == 2) {
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(60));
            int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(76));
            int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(105));
            int iLJII = LJII(enumC1606080rte, false, z);
            int iLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(64));
            int iLIZIZ5 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
            int iLIZIZ6 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(25));
            int iLIZIZ7 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(11));
            int iLIZIZ8 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
            int iLJIIIIZZ = LJIIIIZZ(enumC1606080rte);
            int iLIZIZ9 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3));
            C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
            return new C1608380rxM(iLIZIZ, iLIZIZ2, iLIZIZ3, iLJII, iLIZIZ4, iLIZIZ5, iLIZIZ6, iLIZIZ8, iLIZIZ7, iLIZIZ9, iLJIIIIZZ, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(46)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(53)));
        }
        int iLIZIZ10 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
        int iLIZIZ11 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(64));
        int iLIZIZ12 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(88));
        int iLJII2 = LJII(enumC1606080rte, true, z);
        int iLIZIZ13 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(52));
        int iLIZIZ14 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        int iLIZIZ15 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        int iLIZIZ16 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(9));
        int iLIZIZ17 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
        int iLJIIIIZZ2 = LJIIIIZZ(enumC1606080rte);
        int iLIZIZ18 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
        C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
        return new C1608380rxM(iLIZIZ10, iLIZIZ11, iLIZIZ12, iLJII2, iLIZIZ13, iLIZIZ14, iLIZIZ15, iLIZIZ17, iLIZIZ16, iLIZIZ18, iLJIIIIZZ2, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(38)));
    }

    public static C1608410rxP LJIIJ(EnumC1606080rte enumC1606080rte, boolean z) {
        if (C1605420rsa.LIZ == 2) {
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(78));
            int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(98));
            int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(102));
            int iLJII = LJII(enumC1606080rte, false, z);
            int iLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(15));
            C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
            return new C1608410rxP(iLIZIZ, iLIZIZ2, iLIZIZ3, iLJII, iLIZIZ4, LJIIIIZZ(enumC1606080rte), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(63)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(72)), 3.0f);
        }
        int iLIZIZ5 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(64));
        int iLIZIZ6 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(80));
        int iLIZIZ7 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(88));
        int iLJII2 = LJII(enumC1606080rte, true, z);
        int iLIZIZ8 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        return new C1608410rxP(iLIZIZ5, iLIZIZ6, iLIZIZ7, iLJII2, iLIZIZ8, LJIIIIZZ(enumC1606080rte), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(54)), 2.0f);
    }

    @Override // com.ss.android.ugc.aweme.skylight.ISocialSkylightService
    public final C1608360rxK LJFF(EnumC1606080rte enumC1606080rte, boolean z) {
        int i = C1605420rsa.LIZ;
        if (i != 1) {
            if (i != 2) {
                return new C1608360rxK(64, 88, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(88)), LJII(enumC1606080rte, true, z), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), LJIIIIZZ(enumC1606080rte));
            }
            return new C1608360rxK(78, 92, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(100)), LJII(enumC1606080rte, false, z), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(8.5d))), LJIIIIZZ(enumC1606080rte));
        }
        return new C1608360rxK(72, 86, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(100)), LJII(enumC1606080rte, true, z), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), LJIIIIZZ(enumC1606080rte));
    }

    public static int LJII(EnumC1606080rte enumC1606080rte, boolean z, boolean z2) {
        if (C1256440ini.LIZ() && enumC1606080rte == EnumC1606080rte.INBOX_TOP_LIST && !z2) {
            if (C0HCN.LIZ()) {
                return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(139));
            }
            if (z) {
                return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(146));
            }
            return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(151));
        }
        if (z) {
            return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(122));
        }
        return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(127));
    }

    @Override // com.ss.android.ugc.aweme.skylight.ISocialSkylightService
    public final void LIZ(C1608370rxL c1608370rxL, EnumC1606080rte enumC1606080rte, boolean z) {
        C1608380rxM c1608380rxMLJIIIZ;
        C1610770s1D c1610770s1D;
        C1610770s1D c1610770s1D2;
        EnumC1606080rte enumC1606080rte2 = EnumC1606080rte.FOLLOW_SKYLIGHT;
        if (enumC1606080rte == enumC1606080rte2 && FollowingSkylightAbilityExperienceExp.LIZ()) {
            Context context = c1608370rxL.LIZ.getContext();
            if (((C418440Gaw.LJFF(C14KQ.LJIIIIZZ(context), context) - 4) - 108) / 4.2f > 75.0f) {
                int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(60));
                int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(76));
                int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(105));
                int iLJII = LJII(enumC1606080rte2, false, false);
                int iLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(64));
                int iLIZIZ5 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                int iLIZIZ6 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(25));
                int iLIZIZ7 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(11));
                int iLIZIZ8 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
                int iLJIIIIZZ = LJIIIIZZ(enumC1606080rte2);
                int iLIZIZ9 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3));
                C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
                c1608380rxMLJIIIZ = new C1608380rxM(iLIZIZ, iLIZIZ2, iLIZIZ3, iLJII, iLIZIZ4, iLIZIZ5, iLIZIZ6, iLIZIZ8, iLIZIZ7, iLIZIZ9, iLJIIIIZZ, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(46)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(53)));
            } else {
                int iLIZIZ10 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
                int iLIZIZ11 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(64));
                int iLIZIZ12 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(88));
                int iLJII2 = LJII(enumC1606080rte2, true, false);
                int iLIZIZ13 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(52));
                int iLIZIZ14 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                int iLIZIZ15 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
                int iLIZIZ16 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(9));
                int iLIZIZ17 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
                int iLJIIIIZZ2 = LJIIIIZZ(enumC1606080rte2);
                int iLIZIZ18 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
                C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
                c1608380rxMLJIIIZ = new C1608380rxM(iLIZIZ10, iLIZIZ11, iLIZIZ12, iLJII2, iLIZIZ13, iLIZIZ14, iLIZIZ15, iLIZIZ17, iLIZIZ16, iLIZIZ18, iLJIIIIZZ2, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(38)));
            }
        } else {
            c1608380rxMLJIIIZ = LJIIIZ(enumC1606080rte, z);
        }
        ((TuxTextView) c1608370rxL.LJII).LJJJJI(11.0f);
        ((TuxTextView) c1608370rxL.LJIIIIZZ).LJJJJI(11.0f);
        View view = c1608370rxL.LIZ;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = c1608380rxMLJIIIZ.LIZJ;
            layoutParams.height = c1608380rxMLJIIIZ.LIZLLL;
            C786410Ut5.W5(view, layoutParams);
            View view2 = c1608370rxL.LIZJ;
            ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
            if (layoutParams2 != null) {
                int i = c1608380rxMLJIIIZ.LJ;
                layoutParams2.width = i;
                layoutParams2.height = i;
                C786410Ut5.W5(view2, layoutParams2);
                View view3 = c1608370rxL.LIZLLL;
                ViewGroup.LayoutParams layoutParams3 = view3.getLayoutParams();
                if (layoutParams3 != null) {
                    int i2 = c1608380rxMLJIIIZ.LIZ;
                    layoutParams3.width = i2;
                    layoutParams3.height = i2;
                    C786410Ut5.W5(view3, layoutParams3);
                    View view4 = c1608370rxL.LJFF;
                    ViewGroup.LayoutParams layoutParams4 = view4.getLayoutParams();
                    if (layoutParams4 != null) {
                        int i3 = c1608380rxMLJIIIZ.LJ;
                        layoutParams4.width = i3;
                        layoutParams4.height = i3;
                        C786410Ut5.W5(view4, layoutParams4);
                        View view5 = c1608370rxL.LJI;
                        ViewGroup.LayoutParams layoutParams5 = view5.getLayoutParams();
                        if (layoutParams5 != null) {
                            int i4 = c1608380rxMLJIIIZ.LIZ;
                            layoutParams5.width = i4;
                            layoutParams5.height = i4;
                            C786410Ut5.W5(view5, layoutParams5);
                            View view6 = c1608370rxL.LJIIIZ;
                            if (view6 != null) {
                                C426750GoL.LJIIIZ(view6, 0, Integer.valueOf(c1608380rxMLJIIIZ.LJIIJJI), 0, 0, false, 16);
                            }
                            View view7 = c1608370rxL.LJIIJ;
                            if (view7 != null) {
                                C426750GoL.LJIIIZ(view7, 0, Integer.valueOf(c1608380rxMLJIIIZ.LJIIL), 0, 0, false, 16);
                            }
                            C426750GoL.LJIIL(c1608370rxL.LIZ, 0, Integer.valueOf(LJI(enumC1606080rte, z)), 0, Integer.valueOf(c1608380rxMLJIIIZ.LJIIJ), 16);
                            C426750GoL.LJIIIZ(c1608370rxL.LIZLLL, Integer.valueOf(c1608380rxMLJIIIZ.LJI), Integer.valueOf(c1608380rxMLJIIIZ.LJFF), 0, 0, false, 16);
                            if (enumC1606080rte != enumC1606080rte2 && enumC1606080rte != EnumC1606080rte.FYP_SKYLIGHT) {
                                C426750GoL.LJIIIZ(c1608370rxL.LJI, Integer.valueOf(c1608380rxMLJIIIZ.LJIIIIZZ), Integer.valueOf(c1608380rxMLJIIIZ.LJII), 0, 0, false, 16);
                            } else {
                                C426750GoL.LJIIIZ(c1608370rxL.LJI, Integer.valueOf(c1608380rxMLJIIIZ.LJIIIIZZ), Integer.valueOf(c1608380rxMLJIIIZ.LJII - c1608380rxMLJIIIZ.LJFF), 0, 0, false, 16);
                            }
                            View view8 = c1608370rxL.LIZIZ;
                            if (view8 instanceof C1610770s1D) {
                                c1610770s1D = (C1610770s1D) view8;
                            } else {
                                c1610770s1D = null;
                            }
                            if (c1610770s1D != null) {
                                c1610770s1D.setInnerStrokeWidth(c1608380rxMLJIIIZ.LJIIIZ);
                                C426750GoL.LJIIL(c1610770s1D, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(4.5d)))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(4.5d)))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(4.5d)))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(4.5d)))), 16);
                                ViewGroup.LayoutParams layoutParams6 = c1610770s1D.getLayoutParams();
                                if (layoutParams6 != null) {
                                    int i5 = c1608380rxMLJIIIZ.LIZIZ;
                                    layoutParams6.width = i5;
                                    layoutParams6.height = i5;
                                    C786410Ut5.W5(c1610770s1D, layoutParams6);
                                } else {
                                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                                }
                            }
                            View view9 = c1608370rxL.LJ;
                            if ((view9 instanceof C1610770s1D) && (c1610770s1D2 = (C1610770s1D) view9) != null) {
                                c1610770s1D2.setInnerStrokeWidth(c1608380rxMLJIIIZ.LJIIIZ);
                                C426750GoL.LJIIL(c1610770s1D2, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(4.5d)))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(4.5d)))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(4.5d)))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(4.5d)))), 16);
                                ViewGroup.LayoutParams layoutParams7 = c1610770s1D2.getLayoutParams();
                                if (layoutParams7 != null) {
                                    int i6 = c1608380rxMLJIIIZ.LIZIZ;
                                    layoutParams7.width = i6;
                                    layoutParams7.height = i6;
                                    C786410Ut5.W5(c1610770s1D2, layoutParams7);
                                    return;
                                }
                                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                            }
                            return;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    @Override // com.ss.android.ugc.aweme.skylight.ISocialSkylightService
    public final void LIZIZ(EnumC1606080rte enumC1606080rte, C1608320rxG c1608320rxG, boolean z) {
        C1608360rxK c1608360rxKLJFF;
        Typeface typefaceLIZ;
        View view;
        C427660Gpo c427660Gpo;
        C19727912Gn c19727912Gn;
        View view2 = c1608320rxG.LIZ;
        View view3 = c1608320rxG.LIZIZ;
        View view4 = c1608320rxG.LIZJ;
        View view5 = c1608320rxG.LIZLLL;
        EnumC1606080rte enumC1606080rte2 = EnumC1606080rte.FOLLOW_SKYLIGHT;
        if (enumC1606080rte == enumC1606080rte2 && FollowingSkylightAbilityExperienceExp.LIZ()) {
            Context context = view2.getContext();
            float fLJFF = ((C418440Gaw.LJFF(C14KQ.LJIIIIZZ(context), context) - 4) - 108) / 4.2f;
            if (fLJFF <= 68.0f) {
                c1608360rxKLJFF = new C1608360rxK(64, 88, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(88)), LJII(enumC1606080rte2, true, false), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), LJIIIIZZ(enumC1606080rte2));
            } else if (fLJFF <= 75.0f) {
                c1608360rxKLJFF = new C1608360rxK(72, 86, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(100)), LJII(enumC1606080rte2, true, false), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), LJIIIIZZ(enumC1606080rte2));
            } else {
                c1608360rxKLJFF = new C1608360rxK(78, 92, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(100)), LJII(enumC1606080rte2, false, false), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(8.5d))), LJIIIIZZ(enumC1606080rte2));
            }
        } else {
            c1608360rxKLJFF = LJFF(enumC1606080rte, z);
        }
        if (view5 instanceof TuxTextView) {
            TuxTextView tuxTextView = (TuxTextView) view5;
            tuxTextView.setTuxFont(72);
            tuxTextView.LJJJJI(11.0f);
        } else if (view5 instanceof TextView) {
            TextView textView = (TextView) view5;
            C19736612Jw c19736612Jw = C19736612Jw.LIZ;
            c19736612Jw.getClass();
            InterfaceC1609810rzf interfaceC1609810rzf = (InterfaceC1609810rzf) C19736612Jw.LIZJ.getValue(c19736612Jw, C19736612Jw.LIZIZ[0]);
            if (interfaceC1609810rzf != null && (typefaceLIZ = interfaceC1609810rzf.LIZ(72)) != null) {
                textView.setTypeface(typefaceLIZ);
            }
            textView.setTextSize(0, C418440Gaw.LIZIZ(Float.valueOf(11.0f)));
        }
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = c1608360rxKLJFF.LIZJ;
            layoutParams.height = c1608360rxKLJFF.LIZLLL;
            C786410Ut5.W5(view2, layoutParams);
            if (view3 instanceof AvatarComponentView) {
                ((AvatarComponentView) view3).LJIILJJIL(Integer.valueOf(c1608360rxKLJFF.LIZ), Integer.valueOf(c1608360rxKLJFF.LIZIZ));
            } else {
                if (view3 != null) {
                    ViewGroup.LayoutParams layoutParams2 = view3.getLayoutParams();
                    if (layoutParams2 != null) {
                        layoutParams2.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c1608360rxKLJFF.LIZIZ)));
                        layoutParams2.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c1608360rxKLJFF.LIZIZ)));
                        C786410Ut5.W5(view3, layoutParams2);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    }
                }
                if (view4 != null) {
                    ViewGroup.LayoutParams layoutParams3 = view4.getLayoutParams();
                    if (layoutParams3 != null) {
                        layoutParams3.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c1608360rxKLJFF.LIZ)));
                        layoutParams3.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c1608360rxKLJFF.LIZ)));
                        C786410Ut5.W5(view4, layoutParams3);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    }
                }
                if ((view4 instanceof C427660Gpo) && (c427660Gpo = (C427660Gpo) view4) != null) {
                    c427660Gpo.setSize(c1608360rxKLJFF.LIZ);
                }
                Map<String, View> map = c1608320rxG.LJFF;
                if (map != null && (view = map.get("on_this_day_ring_view")) != null) {
                    ViewGroup.LayoutParams layoutParams4 = view.getLayoutParams();
                    if (layoutParams4 != null) {
                        layoutParams4.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c1608360rxKLJFF.LIZ)));
                        layoutParams4.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c1608360rxKLJFF.LIZ)));
                        C786410Ut5.W5(view, layoutParams4);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    }
                }
            }
            if (view3 != null) {
                C426750GoL.LJIIIZ(view3, 0, Integer.valueOf(LJI(enumC1606080rte, z)), 0, 0, false, 16);
            }
            if (view4 != null) {
                C426750GoL.LJIIIZ(view4, 0, 0, 0, 0, false, 16);
            }
            C426750GoL.LJIIL(view2, null, Integer.valueOf(c1608360rxKLJFF.LJ), null, Integer.valueOf(c1608360rxKLJFF.LJFF), 21);
            StoryAvatarConfigWrapper storyAvatarConfigWrapper = C1618440sDa.LIZIZ.LJJIJLIJ().LIZIZ().LIZ.get("blue_state");
            if (storyAvatarConfigWrapper != null) {
                View view6 = c1608320rxG.LJ;
                if (view6 != null) {
                    ViewGroup.LayoutParams layoutParams5 = view6.getLayoutParams();
                    if (layoutParams5 != null) {
                        int i = storyAvatarConfigWrapper.badgeSize;
                        layoutParams5.width = i;
                        layoutParams5.height = i;
                        C786410Ut5.W5(view6, layoutParams5);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    }
                }
                if ((view6 instanceof C19727912Gn) && (c19727912Gn = (C19727912Gn) view6) != null) {
                    c19727912Gn.setStrokeWidth(storyAvatarConfigWrapper.badgeStrokeWidth);
                    return;
                }
                return;
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    @Override // com.ss.android.ugc.aweme.skylight.ISocialSkylightService
    public final void LIZLLL(C1607440rvq c1607440rvq, EnumC1606080rte enumC1606080rte, boolean z) {
        C1610770s1D c1610770s1D;
        C1608410rxP c1608410rxPLJIIJ;
        View view = c1607440rvq.LIZ;
        View view2 = c1607440rvq.LIZJ;
        View view3 = c1607440rvq.LIZIZ;
        if (view3 instanceof C1610770s1D) {
            c1610770s1D = (C1610770s1D) view3;
        } else {
            c1610770s1D = null;
        }
        TextView textView = c1607440rvq.LIZLLL;
        EnumC1606080rte enumC1606080rte2 = EnumC1606080rte.FOLLOW_SKYLIGHT;
        if (enumC1606080rte == enumC1606080rte2 && FollowingSkylightAbilityExperienceExp.LIZ()) {
            Context context = view.getContext();
            if (((C418440Gaw.LJFF(C14KQ.LJIIIIZZ(context), context) - 4) - 108) / 4.2f > 75.0f) {
                int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(78));
                int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(98));
                int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(102));
                int iLJII = LJII(enumC1606080rte2, false, false);
                int iLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(15));
                C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                c1608410rxPLJIIJ = new C1608410rxP(iLIZIZ, iLIZIZ2, iLIZIZ3, iLJII, iLIZIZ4, LJIIIIZZ(enumC1606080rte2), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(63)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(72)), 3.0f);
            } else {
                int iLIZIZ5 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(64));
                int iLIZIZ6 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(80));
                int iLIZIZ7 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(88));
                int iLJII2 = LJII(enumC1606080rte2, true, false);
                int iLIZIZ8 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                c1608410rxPLJIIJ = new C1608410rxP(iLIZIZ5, iLIZIZ6, iLIZIZ7, iLJII2, iLIZIZ8, LJIIIIZZ(enumC1606080rte2), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(54)), 2.0f);
            }
        } else {
            c1608410rxPLJIIJ = LJIIJ(enumC1606080rte, z);
        }
        ((TuxTextView) textView).LJJJJI(11.0f);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = c1608410rxPLJIIJ.LIZJ;
            layoutParams.height = c1608410rxPLJIIJ.LIZLLL;
            C786410Ut5.W5(view, layoutParams);
            if (c1610770s1D != null) {
                ViewGroup.LayoutParams layoutParams2 = c1610770s1D.getLayoutParams();
                if (layoutParams2 != null) {
                    int i = c1608410rxPLJIIJ.LIZIZ;
                    layoutParams2.width = i;
                    layoutParams2.height = i;
                    C786410Ut5.W5(c1610770s1D, layoutParams2);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
            }
            ViewGroup.LayoutParams layoutParams3 = view2.getLayoutParams();
            if (layoutParams3 != null) {
                int i2 = c1608410rxPLJIIJ.LIZ;
                layoutParams3.width = i2;
                layoutParams3.height = i2;
                C786410Ut5.W5(view2, layoutParams3);
                if (c1610770s1D != null) {
                    C426750GoL.LJIIL(c1610770s1D, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(4.5d)))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(4.5d)))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(4.5d)))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(4.5d)))), 16);
                }
                int i3 = 16;
                C426750GoL.LJIIIZ(view2, 0, Integer.valueOf(c1608410rxPLJIIJ.LJ + LJI(enumC1606080rte, z)), 0, 0, false, 16);
                View view4 = c1607440rvq.LJ;
                if (view4 != null) {
                    i3 = 16;
                    C426750GoL.LJIIIZ(view4, 0, Integer.valueOf(c1608410rxPLJIIJ.LJI), 0, 0, false, 16);
                }
                View view5 = c1607440rvq.LJFF;
                if (view5 != null) {
                    i3 = i3;
                    C426750GoL.LJIIIZ(view5, 0, Integer.valueOf(c1608410rxPLJIIJ.LJII), 0, 0, false, i3);
                }
                C426750GoL.LJIIL(view, 0, 0, 0, Integer.valueOf(c1608410rxPLJIIJ.LJFF), i3);
                if (c1610770s1D != null) {
                    c1610770s1D.setInnerStrokeWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c1608410rxPLJIIJ.LJIIIIZZ))));
                    return;
                }
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    @Override // com.ss.android.ugc.aweme.skylight.ISocialSkylightService
    public final void LJ(EnumC1606080rte enumC1606080rte, C1608320rxG c1608320rxG, boolean z) {
        int iLIZIZ;
        C427660Gpo c427660Gpo;
        TuxTextView tuxTextView;
        View view = c1608320rxG.LIZ;
        View view2 = c1608320rxG.LIZJ;
        View view3 = c1608320rxG.LIZLLL;
        View view4 = c1608320rxG.LJ;
        C1608360rxK c1608360rxKLJFF = LJFF(enumC1606080rte, z);
        if (C426750GoL.LIZLLL(view.getContext())) {
            if (view4 != null) {
                C786410Ut5.Jc(view4, C418440Gaw.LIZIZ(-3));
            }
        } else if (view4 != null) {
            C786410Ut5.Jc(view4, C418440Gaw.LIZIZ(3));
        }
        if ((view3 instanceof TuxTextView) && (tuxTextView = (TuxTextView) view3) != null) {
            tuxTextView.setTuxFont(72);
            tuxTextView.LJJJJI(11.0f);
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = c1608360rxKLJFF.LIZJ;
            layoutParams.height = c1608360rxKLJFF.LIZLLL;
            C786410Ut5.W5(view, layoutParams);
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c1608360rxKLJFF.LIZ)));
                    layoutParams2.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c1608360rxKLJFF.LIZ)));
                    C786410Ut5.W5(view2, layoutParams2);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
            }
            if ((view2 instanceof C427660Gpo) && (c427660Gpo = (C427660Gpo) view2) != null) {
                c427660Gpo.setSize(c1608360rxKLJFF.LIZ);
            }
            if (view2 != null) {
                if (C443000HYs.LIZ()) {
                    iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                } else {
                    iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(9));
                }
                C426750GoL.LJIIIZ(view2, 0, Integer.valueOf(iLIZIZ), 0, 0, false, 16);
            }
            C426750GoL.LJIIL(view, null, Integer.valueOf(c1608360rxKLJFF.LJ), null, Integer.valueOf(c1608360rxKLJFF.LJFF), 21);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }
}
