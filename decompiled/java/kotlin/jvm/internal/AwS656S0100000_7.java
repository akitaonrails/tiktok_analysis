package kotlin.jvm.internal;

import X.C09AY;
import X.C0JD7;
import X.C0K4P;
import X.C1308910kAL;
import X.C1390410mHn;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C1719940urI;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C1954807lC;
import X.C197039127h;
import X.C19EG;
import X.C488130JCh;
import X.C488290JCx;
import X.C499640Jic;
import X.C786410Ut5;
import X.C985403tE;
import X.EnumC488160JCk;
import X.InterfaceC1631620sYq;
import X.InterfaceC499980JjA;
import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.pipo.ttpay.landing.WelcomePageAssem;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.biz.wallet.biz.commonpage.WalletCommonStepDialogFragment;
import com.ss.android.ugc.aweme.component.verify.pin.forgot.PinForgotViewAssem;
import com.ss.android.ugc.aweme.pcs.course.managementpage.uiv2.powerlist.CourseDescCell;
import com.ss.android.ugc.aweme.pcs.course.managementpage.uiv2.powerlist.CourseTitleCell;
import com.ss.android.ugc.aweme.pcs.course.videopublishpage.ui.PcsCoursePublishBottomAssem;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes8.dex */
public class AwS656S0100000_7 extends C09AY implements InterfaceC1631620sYq {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1631620sYq
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            case 2:
                return invoke$2(this, obj, obj2, obj3);
            case 3:
                return invoke$3(this, obj, obj2, obj3);
            case 4:
                return invoke$4(this, obj, obj2, obj3);
            case 5:
                return invoke$5(this, obj, obj2, obj3);
            case 6:
                return invoke$6(this, obj, obj2, obj3);
            case 7:
                return invoke$7(this, obj, obj2, obj3);
            case 8:
                return invoke$8(this, obj, obj2, obj3);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj, obj2, obj3);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj, obj2, obj3);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj, obj2, obj3);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj, obj2, obj3);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this, obj, obj2, obj3);
            case 14:
                return invoke$14(this, obj, obj2, obj3);
            case 15:
                return invoke$15(this, obj, obj2, obj3);
            case 16:
                return invoke$16(this, obj, obj2, obj3);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this, obj, obj2, obj3);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this, obj, obj2, obj3);
            case 19:
                return invoke$19(this, obj, obj2, obj3);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return invoke$20(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS656S0100000_7(InterfaceC499980JjA interfaceC499980JjA, int i) {
        super(3);
        this.$t = i;
        this.l0 = interfaceC499980JjA;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS656S0100000_7(C0K4P c0k4p, int i) {
        super(3);
        this.$t = i;
        this.l0 = c0k4p;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS656S0100000_7(WelcomePageAssem welcomePageAssem, int i) {
        super(3);
        this.$t = i;
        this.l0 = welcomePageAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS656S0100000_7(WalletCommonStepDialogFragment walletCommonStepDialogFragment, int i) {
        super(3);
        this.$t = i;
        this.l0 = walletCommonStepDialogFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS656S0100000_7(PinForgotViewAssem pinForgotViewAssem, int i) {
        super(3);
        this.$t = i;
        this.l0 = pinForgotViewAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS656S0100000_7(CourseDescCell courseDescCell, int i) {
        super(3);
        this.$t = i;
        this.l0 = courseDescCell;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS656S0100000_7(CourseTitleCell courseTitleCell, int i) {
        super(3);
        this.$t = i;
        this.l0 = courseTitleCell;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS656S0100000_7(PcsCoursePublishBottomAssem pcsCoursePublishBottomAssem, int i) {
        super(3);
        this.$t = i;
        this.l0 = pcsCoursePublishBottomAssem;
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AwS656S0100000_7 awS656S0100000_7, Object obj, Object obj2, Object obj3) {
        int i;
        EnumC488160JCk enumC488160JCk = (EnumC488160JCk) obj2;
        String string = (String) obj3;
        if (enumC488160JCk != null && (i = C488130JCh.LIZ[enumC488160JCk.ordinal()]) != -1) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        ((WalletCommonStepDialogFragment) awS656S0100000_7.l0).LLILLJJLI.invoke();
                        C1390410mHn c1390410mHn = ((WalletCommonStepDialogFragment) awS656S0100000_7.l0).LLILZIL;
                        if (c1390410mHn != null) {
                            C786410Ut5.LLLZZIL(c1390410mHn, 4);
                        }
                        ((WalletCommonStepDialogFragment) awS656S0100000_7.l0).dismiss();
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    C1390410mHn c1390410mHn2 = ((WalletCommonStepDialogFragment) awS656S0100000_7.l0).LLILZIL;
                    if (c1390410mHn2 != null) {
                        C786410Ut5.LLLZZIL(c1390410mHn2, 4);
                    }
                    C19EG activity = ((WalletCommonStepDialogFragment) awS656S0100000_7.l0).getActivity();
                    if (activity != null) {
                        WalletCommonStepDialogFragment walletCommonStepDialogFragment = (WalletCommonStepDialogFragment) awS656S0100000_7.l0;
                        C1397580mTM c1397580mTM = new C1397580mTM(activity);
                        if (string == null || string.length() == 0) {
                            string = activity.getString(2131848597);
                        }
                        c1397580mTM.LIZIZ(string);
                        C985403tE.LIZ(c1397580mTM, new AwS373S0200000_7(walletCommonStepDialogFragment, activity, 9));
                        c1397580mTM.LJII = false;
                        new C1397510mTF(c1397580mTM).LIZLLL();
                    }
                }
            } else {
                C1390410mHn c1390410mHn3 = ((WalletCommonStepDialogFragment) awS656S0100000_7.l0).LLILZIL;
                if (c1390410mHn3 != null) {
                    C786410Ut5.LLLZZIL(c1390410mHn3, 0);
                }
                C1390410mHn c1390410mHn4 = ((WalletCommonStepDialogFragment) awS656S0100000_7.l0).LLILZIL;
                if (c1390410mHn4 != null) {
                    c1390410mHn4.LIZJ();
                }
            }
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AwS656S0100000_7 awS656S0100000_7, Object obj, Object obj2, Object obj3) {
        EnumC488160JCk enumC488160JCk = (EnumC488160JCk) obj2;
        String str = (String) obj3;
        if (enumC488160JCk != null) {
            int i = C488290JCx.LIZ[enumC488160JCk.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        C786410Ut5.LLLLZLLLI((TuxNavBar) ((WelcomePageAssem) awS656S0100000_7.l0).LLJILLL.getValue(), 0);
                        C786410Ut5.LL(8, (ConstraintLayout) ((WelcomePageAssem) awS656S0100000_7.l0).LLJILJIL.getValue());
                        C786410Ut5.LLLZLZ((C1749280vcc) ((WelcomePageAssem) awS656S0100000_7.l0).LLJILJILJ.getValue(), 0);
                        C1749280vcc c1749280vcc = (C1749280vcc) ((WelcomePageAssem) awS656S0100000_7.l0).LLJILJILJ.getValue();
                        C1722300uv6 c1722300uv6 = new C1722300uv6();
                        C1719940urI.LIZIZ(c1722300uv6, str, new AwS551S0100000_7((WelcomePageAssem) awS656S0100000_7.l0, 595));
                        c1749280vcc.setStatus(c1722300uv6);
                    }
                } else {
                    C786410Ut5.LLLLZLLLI((TuxNavBar) ((WelcomePageAssem) awS656S0100000_7.l0).LLJILLL.getValue(), 0);
                    C786410Ut5.LL(8, (ConstraintLayout) ((WelcomePageAssem) awS656S0100000_7.l0).LLJILJIL.getValue());
                    C786410Ut5.LLLZLZ((C1749280vcc) ((WelcomePageAssem) awS656S0100000_7.l0).LLJILJILJ.getValue(), 0);
                    ((C1749280vcc) ((WelcomePageAssem) awS656S0100000_7.l0).LLJILJILJ.getValue()).LJ();
                }
            } else {
                ((WelcomePageAssem) awS656S0100000_7.l0).LLJJIII = System.currentTimeMillis();
                C786410Ut5.LLLLZLLLI((TuxNavBar) ((WelcomePageAssem) awS656S0100000_7.l0).LLJILLL.getValue(), 8);
                C786410Ut5.LLLZLZ((C1749280vcc) ((WelcomePageAssem) awS656S0100000_7.l0).LLJILJILJ.getValue(), 8);
                C786410Ut5.LL(0, (ConstraintLayout) ((WelcomePageAssem) awS656S0100000_7.l0).LLJILJIL.getValue());
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS656S0100000_7 awS656S0100000_7, Object obj, Object obj2, Object obj3) {
        C499640Jic c499640Jic = (C499640Jic) obj3;
        InterfaceC499980JjA interfaceC499980JjA = (InterfaceC499980JjA) awS656S0100000_7.l0;
        if (interfaceC499980JjA != null) {
            interfaceC499980JjA.Ol1(c499640Jic.LIZ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS656S0100000_7 awS656S0100000_7, Object obj, Object obj2, Object obj3) {
        C499640Jic c499640Jic = (C499640Jic) obj3;
        InterfaceC499980JjA interfaceC499980JjA = (InterfaceC499980JjA) awS656S0100000_7.l0;
        if (interfaceC499980JjA != null) {
            interfaceC499980JjA.hd0(c499640Jic.LIZ, c499640Jic.LJ, c499640Jic.LIZLLL);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS656S0100000_7 awS656S0100000_7, Object obj, Object obj2, Object obj3) {
        C499640Jic c499640Jic = (C499640Jic) obj3;
        InterfaceC499980JjA interfaceC499980JjA = (InterfaceC499980JjA) awS656S0100000_7.l0;
        if (interfaceC499980JjA != null) {
            interfaceC499980JjA.ww1(c499640Jic.LIZ, c499640Jic.LJFF, c499640Jic.LJ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS656S0100000_7 awS656S0100000_7, Object obj, Object obj2, Object obj3) {
        C499640Jic c499640Jic = (C499640Jic) obj3;
        InterfaceC499980JjA interfaceC499980JjA = (InterfaceC499980JjA) awS656S0100000_7.l0;
        if (interfaceC499980JjA != null) {
            interfaceC499980JjA.Oj1(c499640Jic.LIZ, c499640Jic.LJFF);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$14(AwS656S0100000_7 awS656S0100000_7, Object obj, Object obj2, Object obj3) {
        C499640Jic c499640Jic = (C499640Jic) obj3;
        InterfaceC499980JjA interfaceC499980JjA = (InterfaceC499980JjA) awS656S0100000_7.l0;
        if (interfaceC499980JjA != null) {
            interfaceC499980JjA.qk1(c499640Jic.LIZ, c499640Jic.LJFF);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$15(AwS656S0100000_7 awS656S0100000_7, Object obj, Object obj2, Object obj3) {
        C499640Jic c499640Jic = (C499640Jic) obj3;
        InterfaceC499980JjA interfaceC499980JjA = (InterfaceC499980JjA) awS656S0100000_7.l0;
        if (interfaceC499980JjA != null) {
            interfaceC499980JjA.WN2(c499640Jic.LIZ, c499640Jic.LJFF, c499640Jic.LJ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$16(AwS656S0100000_7 awS656S0100000_7, Object obj, Object obj2, Object obj3) {
        C499640Jic c499640Jic = (C499640Jic) obj3;
        InterfaceC499980JjA interfaceC499980JjA = (InterfaceC499980JjA) awS656S0100000_7.l0;
        if (interfaceC499980JjA != null) {
            interfaceC499980JjA.sh1(c499640Jic.LIZ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$17(AwS656S0100000_7 awS656S0100000_7, Object obj, Object obj2, Object obj3) {
        C499640Jic c499640Jic = (C499640Jic) obj3;
        InterfaceC499980JjA interfaceC499980JjA = (InterfaceC499980JjA) awS656S0100000_7.l0;
        if (interfaceC499980JjA != null) {
            interfaceC499980JjA.CY0(c499640Jic.LIZ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$18(AwS656S0100000_7 awS656S0100000_7, Object obj, Object obj2, Object obj3) {
        C499640Jic c499640Jic = (C499640Jic) obj3;
        InterfaceC499980JjA interfaceC499980JjA = (InterfaceC499980JjA) awS656S0100000_7.l0;
        if (interfaceC499980JjA != null) {
            interfaceC499980JjA.tp0(c499640Jic.LIZ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$19(AwS656S0100000_7 awS656S0100000_7, Object obj, Object obj2, Object obj3) {
        C499640Jic c499640Jic = (C499640Jic) obj3;
        InterfaceC499980JjA interfaceC499980JjA = (InterfaceC499980JjA) awS656S0100000_7.l0;
        if (interfaceC499980JjA != null) {
            interfaceC499980JjA.OZ(c499640Jic.LIZ);
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$2(AwS656S0100000_7 awS656S0100000_7, Object obj, Object obj2, Object obj3) {
        C1749280vcc c1749280vcc;
        C1749280vcc c1749280vcc2;
        Integer numLIZJ;
        UIAssem uIAssem = (UIAssem) obj;
        EnumC488160JCk enumC488160JCk = (EnumC488160JCk) obj2;
        String str = (String) obj3;
        if (enumC488160JCk != null) {
            PinForgotViewAssem pinForgotViewAssem = (PinForgotViewAssem) awS656S0100000_7.l0;
            int i = C0JD7.LIZ[enumC488160JCk.ordinal()];
            C1749280vcc c1749280vcc3 = null;
            if (i != 1) {
                String str2 = "";
                if (i != 2) {
                    if (i == 3) {
                        TuxNavBar tuxNavBarGo = pinForgotViewAssem.Go();
                        if (tuxNavBarGo != null) {
                            C786410Ut5.LLLLZLLLI(tuxNavBarGo, 0);
                        }
                        Context context = uIAssem.getContext();
                        if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a1b, context)) != null) {
                            uIAssem.LJJIJL().setBackgroundColor(numLIZJ.intValue());
                        }
                        if (str != null) {
                            str2 = str;
                        }
                        pinForgotViewAssem.ap(null, "consult", "fail", str2);
                        View viewLJJIJL = uIAssem.LJJIJL();
                        if (viewLJJIJL != null) {
                            c1749280vcc2 = (C1749280vcc) viewLJJIJL.findViewById(R.id.c63);
                        } else {
                            c1749280vcc2 = null;
                        }
                        C786410Ut5.LLLZLZ(c1749280vcc2, 0);
                        View viewLJJIJL2 = uIAssem.LJJIJL();
                        if (viewLJJIJL2 != null) {
                            c1749280vcc3 = (C1749280vcc) viewLJJIJL2.findViewById(R.id.c63);
                        }
                        C1722300uv6 c1722300uv6 = new C1722300uv6();
                        C1719940urI.LIZIZ(c1722300uv6, str, new AwS551S0100000_7(pinForgotViewAssem, 665));
                        c1749280vcc3.setStatus(c1722300uv6);
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    uIAssem.LJJIJL().setBackgroundColor(0);
                    TuxNavBar tuxNavBarGo2 = pinForgotViewAssem.Go();
                    if (tuxNavBarGo2 != null) {
                        C786410Ut5.LLLLZLLLI(tuxNavBarGo2, 8);
                    }
                    pinForgotViewAssem.ap(null, "consult", "success", "");
                    View viewLJJIJL3 = uIAssem.LJJIJL();
                    if (viewLJJIJL3 != null) {
                        c1749280vcc3 = (C1749280vcc) viewLJJIJL3.findViewById(R.id.c63);
                    }
                    C786410Ut5.LLLZLZ(c1749280vcc3, 8);
                }
            } else {
                uIAssem.LJJIJL().setBackgroundColor(0);
                TuxNavBar tuxNavBarGo3 = pinForgotViewAssem.Go();
                if (tuxNavBarGo3 != null) {
                    C786410Ut5.LLLLZLLLI(tuxNavBarGo3, 8);
                }
                View viewLJJIJL4 = uIAssem.LJJIJL();
                if (viewLJJIJL4 != null) {
                    c1749280vcc = (C1749280vcc) viewLJJIJL4.findViewById(R.id.c63);
                } else {
                    c1749280vcc = null;
                }
                C786410Ut5.LLLZLZ(c1749280vcc, 0);
                View viewLJJIJL5 = uIAssem.LJJIJL();
                if (viewLJJIJL5 != null) {
                    c1749280vcc3 = (C1749280vcc) viewLJJIJL5.findViewById(R.id.c63);
                }
                c1749280vcc3.LJ();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$20(AwS656S0100000_7 awS656S0100000_7, Object obj, Object obj2, Object obj3) {
        C499640Jic c499640Jic = (C499640Jic) obj3;
        InterfaceC499980JjA interfaceC499980JjA = (InterfaceC499980JjA) awS656S0100000_7.l0;
        if (interfaceC499980JjA != null) {
            interfaceC499980JjA.ne2(c499640Jic.LIZ, c499640Jic.LIZJ, c499640Jic.LIZLLL, c499640Jic.LJI);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$3(kotlin.jvm.internal.AwS656S0100000_7 r3, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6) {
        /*
            Method dump skipped, instruction units count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS656S0100000_7.invoke$3(kotlin.jvm.internal.AwS656S0100000_7, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$4(kotlin.jvm.internal.AwS656S0100000_7 r5, java.lang.Object r6, java.lang.Object r7, java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS656S0100000_7.invoke$4(kotlin.jvm.internal.AwS656S0100000_7, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$5(AwS656S0100000_7 awS656S0100000_7, Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        PcsCoursePublishBottomAssem pcsCoursePublishBottomAssem = (PcsCoursePublishBottomAssem) awS656S0100000_7.l0;
        boolean z = true;
        if (!(!a0.LJJJIL((String) obj2)) || !zBooleanValue) {
            z = false;
        }
        C197039127h c197039127h = pcsCoursePublishBottomAssem.LLJJJ;
        if (c197039127h != null) {
            c197039127h.setEnabled(z);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS656S0100000_7 awS656S0100000_7, Object obj, Object obj2, Object obj3) {
        ((Number) obj2).intValue();
        ((Number) obj3).intValue();
        ((C0K4P) awS656S0100000_7.l0).LJIJJLI();
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS656S0100000_7 awS656S0100000_7, Object obj, Object obj2, Object obj3) {
        C499640Jic c499640Jic = (C499640Jic) obj3;
        InterfaceC499980JjA interfaceC499980JjA = (InterfaceC499980JjA) awS656S0100000_7.l0;
        if (interfaceC499980JjA != null) {
            interfaceC499980JjA.di0(c499640Jic.LIZ, c499640Jic.LJI);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS656S0100000_7 awS656S0100000_7, Object obj, Object obj2, Object obj3) {
        C499640Jic c499640Jic = (C499640Jic) obj3;
        InterfaceC499980JjA interfaceC499980JjA = (InterfaceC499980JjA) awS656S0100000_7.l0;
        if (interfaceC499980JjA != null) {
            interfaceC499980JjA.ON1(c499640Jic.LIZ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS656S0100000_7 awS656S0100000_7, Object obj, Object obj2, Object obj3) {
        C499640Jic c499640Jic = (C499640Jic) obj3;
        InterfaceC499980JjA interfaceC499980JjA = (InterfaceC499980JjA) awS656S0100000_7.l0;
        if (interfaceC499980JjA != null) {
            interfaceC499980JjA.Wm2(c499640Jic.LIZ, c499640Jic.LIZLLL);
        }
        return Unit.LIZ;
    }
}
