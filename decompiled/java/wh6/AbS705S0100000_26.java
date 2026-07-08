package wh6;

import X.AbstractC1711120ud4;
import X.AbstractViewOnClickListenerC1637610siV;
import X.C1155650gB9;
import X.C1391190mJ3;
import X.C1507750pL3;
import X.C1508390pM5;
import X.C1708610uZ1;
import X.C1709110uZp;
import X.C1711100ud2;
import X.C1711110ud3;
import X.C1711380udU;
import X.C1752050vh5;
import X.C1752370vhb;
import X.C1765580w2u;
import X.C1765590w2v;
import X.C1765620w2y;
import X.C1765720w38;
import X.C1765730w39;
import X.C724240Sb0;
import X.EnumC1508940pMy;
import X.EnumC1508950pMz;
import X.InterfaceC1709310ua9;
import X.InterfaceC1744490vUt;
import X.InterfaceC1763420vzQ;
import X.InterfaceC1765630w2z;
import X.InterfaceC1765790w3F;
import X.KeyEventCallbackC1765760w3C;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ecommerce.base.address.widget.SearchHelper;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.module.desc.SeaProductDescVideoViewHolder;
import com.ss.android.ugc.aweme.pipo.cashier.cashier.subcashier.SubCashierAssem;
import com.ss.android.ugc.aweme.pipo.cashier.common.autofill.core.AutofillApi;
import com.ss.android.ugc.aweme.pipo.cashier.common.autofill.core.fragment.AutofillAssem;
import com.ss.android.ugc.aweme.pipo.cashier.common.autofill.core.fragment.AutofillFragment;
import com.ss.android.ugc.aweme.pipo.cashier.common.autofill.core.fragment.AutofillSecondaryAssem;
import com.ss.android.ugc.aweme.pipo.cashier.common.autofill.core.fragment.AutofillSecondaryFragment;
import com.ss.android.ugc.aweme.pipo.cashier.common.uicomponent.bottomsheet.PipoCashierBaseFragment;
import com.ss.android.ugc.aweme.pipo.cashier.refund.cashier.RefundCashierAssem;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.lang.ref.Reference;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public class AbS705S0100000_26 extends AbstractViewOnClickListenerC1637610siV {
    public final int $t;
    public Object l0;

    @Override // X.AbstractViewOnClickListenerC1637610siV
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            case 2:
                LIZ$2(this, view);
                break;
            case 3:
                LIZ$3(this, view);
                break;
            case 4:
                LIZ$4(this, view);
                break;
            case 5:
                LIZ$5(this, view);
                break;
            case 6:
                LIZ$6(this, view);
                break;
            case 7:
                LIZ$7(this, view);
                break;
            case 8:
                LIZ$8(this, view);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                LIZ$9(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                LIZ$10(this, view);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                LIZ$11(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                LIZ$12(this, view);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                LIZ$13(this, view);
                break;
            case 14:
                LIZ$14(this, view);
                break;
            case 15:
                LIZ$15(this, view);
                break;
            case 16:
                LIZ$16(this, view);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                LIZ$17(this, view);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                LIZ$18(this, view);
                break;
            case 19:
                LIZ$19(this, view);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                LIZ$20(this, view);
                break;
            case 21:
                LIZ$21(this, view);
                break;
            case 22:
                LIZ$22(this, view);
                break;
            case 23:
                LIZ$23(this, view);
                break;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                LIZ$24(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbS705S0100000_26(Object obj, int i) {
        super(700L);
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZ$0(AbS705S0100000_26 abS705S0100000_26, View view) {
        InterfaceC1744490vUt interfaceC1744490vUt;
        if (view != null) {
            ((SearchHelper) abS705S0100000_26.l0).LIZIZ();
            Reference reference = ((SearchHelper) abS705S0100000_26.l0).LJIIIZ;
            if (reference != null && (interfaceC1744490vUt = (InterfaceC1744490vUt) reference.get()) != null) {
                interfaceC1744490vUt.lD();
            }
        }
    }

    public static final void LIZ$1(AbS705S0100000_26 abS705S0100000_26, View view) {
        View.OnClickListener onClickListener;
        if (view != null) {
            C1752050vh5 middleAction = ((C1765730w39) abS705S0100000_26.l0).getMiddleAction();
            if (middleAction != null && (onClickListener = middleAction.LIZIZ) != null) {
                onClickListener.onClick(view);
                return;
            }
            InterfaceC1765790w3F onPlayerActionBarListener = ((C1765730w39) abS705S0100000_26.l0).getOnPlayerActionBarListener();
            if (onPlayerActionBarListener == null) {
                return;
            }
            onPlayerActionBarListener.LIZLLL();
        }
    }

    public static final void LIZ$10(AbS705S0100000_26 abS705S0100000_26, View view) {
        EnumC1508950pMz enumC1508950pMz;
        if (view != null) {
            C1508390pM5 player = ((C1765590w2v) abS705S0100000_26.l0).getPlayer();
            if (player != null) {
                enumC1508950pMz = player.LJIILLIIL;
            } else {
                enumC1508950pMz = null;
            }
            if (enumC1508950pMz == EnumC1508950pMz.PLAYER_START) {
                C1508390pM5 player2 = ((C1765590w2v) abS705S0100000_26.l0).getPlayer();
                if (player2 != null) {
                    player2.LJIJ = true;
                }
                C1508390pM5 c1508390pM5 = ((C1765590w2v) abS705S0100000_26.l0).LLJJIJIIJIL;
                if (c1508390pM5 != null) {
                    c1508390pM5.pause();
                    return;
                }
                return;
            }
            C1508390pM5 player3 = ((C1765590w2v) abS705S0100000_26.l0).getPlayer();
            if (player3 != null) {
                player3.LJIJ = false;
            }
            InterfaceC1763420vzQ playerLogListener = ((C1765590w2v) abS705S0100000_26.l0).getPlayerLogListener();
            if (playerLogListener != null) {
                playerLogListener.LIZIZ();
            }
            ((C1765590w2v) abS705S0100000_26.l0).LIZLLL(0.0f);
        }
    }

    public static final void LIZ$11(AbS705S0100000_26 abS705S0100000_26, View view) {
        if (view != null) {
            ((Function0) abS705S0100000_26.l0).invoke();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ$12(wh6.AbS705S0100000_26 r5, android.view.View r6) {
        /*
            if (r6 == 0) goto L5c
            X.0uhs r0 = X.C1714100uhs.LIZ
            r0.getClass()
            java.lang.String r0 = "pay_and_send"
            r4 = 0
            X.C1714100uhs.LIZJ(r0, r4)
            java.lang.Object r0 = r5.l0
            com.ss.android.ugc.aweme.giftcard.checkout.GiftCardCheckoutAssem r0 = (com.ss.android.ugc.aweme.giftcard.checkout.GiftCardCheckoutAssem) r0
            X.0h8q r1 = r0.Go()
            if (r1 == 0) goto L75
            r0 = 0
            X.0DEp r2 = r1.LJII(r0)
            if (r2 == 0) goto L76
            X.0uaP r1 = r2.LIZ
        L20:
            X.0uaP r0 = X.EnumC1709470uaP.SUCCESS
            if (r1 != r0) goto L5d
            java.lang.Object r0 = r5.l0
            com.ss.android.ugc.aweme.giftcard.checkout.GiftCardCheckoutAssem r0 = (com.ss.android.ugc.aweme.giftcard.checkout.GiftCardCheckoutAssem) r0
            X.0h8q r3 = r0.Go()
            if (r3 == 0) goto L41
            kotlin.jvm.internal.AwS392S0200000_26 r2 = new kotlin.jvm.internal.AwS392S0200000_26
            java.lang.Object r1 = r5.l0
            com.ss.android.ugc.aweme.giftcard.checkout.GiftCardCheckoutAssem r1 = (com.ss.android.ugc.aweme.giftcard.checkout.GiftCardCheckoutAssem) r1
            r0 = 194(0xc2, float:2.72E-43)
            r2.<init>(r1, r6, r0)
            boolean r0 = r3.LJFF(r2)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
        L41:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r4, r0)
            if (r0 == 0) goto L5c
            java.lang.Object r0 = r5.l0
            com.ss.android.ugc.aweme.giftcard.checkout.GiftCardCheckoutAssem r0 = (com.ss.android.ugc.aweme.giftcard.checkout.GiftCardCheckoutAssem) r0
            android.content.Context r1 = r0.getContext()
            if (r1 == 0) goto L5c
            X.0h8q r0 = r0.Go()
            if (r0 == 0) goto L5c
            r0.LJIIZILJ(r1)
        L5c:
            return
        L5d:
            if (r2 == 0) goto L61
            java.lang.String r4 = r2.LIZIZ
        L61:
            boolean r0 = X.C123100dR.LIZ(r4)
            if (r0 == 0) goto L5c
            X.0mGx r1 = new X.0mGx
            r1.<init>(r6)
            java.lang.String r0 = r2.LIZIZ
            r1.LJIIJ(r0)
            r1.LJIIJJI()
            return
        L75:
            r2 = r4
        L76:
            r1 = r4
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: wh6.AbS705S0100000_26.LIZ$12(wh6.AbS705S0100000_26, android.view.View):void");
    }

    public static final void LIZ$13(AbS705S0100000_26 abS705S0100000_26, View view) {
        if (view != null) {
            SubCashierAssem subCashierAssem = (SubCashierAssem) abS705S0100000_26.l0;
            subCashierAssem.withState(subCashierAssem.Lo(), new AwS605S0100000_26((SubCashierAssem) abS705S0100000_26.l0, 795));
        }
    }

    public static final void LIZ$14(AbS705S0100000_26 abS705S0100000_26, View view) {
        if (view != null && ((C1765580w2u) abS705S0100000_26.l0).getVideoSize() != null) {
            KeyEventCallbackC1765760w3C.LIZIZ(false);
        }
    }

    public static final void LIZ$15(AbS705S0100000_26 abS705S0100000_26, View view) {
        EnumC1508950pMz enumC1508950pMz;
        if (view != null) {
            C1508390pM5 player = ((C1765580w2u) abS705S0100000_26.l0).getPlayer();
            if (player != null) {
                enumC1508950pMz = player.LJIILLIIL;
            } else {
                enumC1508950pMz = null;
            }
            if (enumC1508950pMz == EnumC1508950pMz.PLAYER_START) {
                C1508390pM5 player2 = ((C1765580w2u) abS705S0100000_26.l0).getPlayer();
                if (player2 != null) {
                    player2.LJIJ = true;
                }
                ((C1765580w2u) abS705S0100000_26.l0).LIZJ();
                return;
            }
            C1508390pM5 player3 = ((C1765580w2u) abS705S0100000_26.l0).getPlayer();
            if (player3 != null) {
                player3.LJIJ = false;
            }
            InterfaceC1763420vzQ playerLogListener = ((C1765580w2u) abS705S0100000_26.l0).getPlayerLogListener();
            if (playerLogListener != null) {
                playerLogListener.LIZIZ();
            }
            ((C1765580w2u) abS705S0100000_26.l0).LIZLLL(0.0f);
        }
    }

    public static final void LIZ$16(AbS705S0100000_26 abS705S0100000_26, View view) {
        InterfaceC1765790w3F onPlayerActionBarListener;
        if (view != null && ((C1765730w39) abS705S0100000_26.l0).getNeedShowMask() && (onPlayerActionBarListener = ((C1765730w39) abS705S0100000_26.l0).getOnPlayerActionBarListener()) != null) {
            onPlayerActionBarListener.LIZIZ();
        }
    }

    public static final void LIZ$17(AbS705S0100000_26 abS705S0100000_26, View view) {
        InterfaceC1765790w3F onPlayerActionBarListener;
        if (view != null && ((C1765730w39) abS705S0100000_26.l0).getNeedShowMask() && (onPlayerActionBarListener = ((C1765730w39) abS705S0100000_26.l0).getOnPlayerActionBarListener()) != null) {
            onPlayerActionBarListener.LJII();
        }
    }

    public static final void LIZ$18(AbS705S0100000_26 abS705S0100000_26, View view) {
        InterfaceC1765790w3F onPlayerActionBarListener;
        if (view != null && (onPlayerActionBarListener = ((C1765730w39) abS705S0100000_26.l0).getOnPlayerActionBarListener()) != null) {
            onPlayerActionBarListener.LJFF();
        }
    }

    public static final void LIZ$19(AbS705S0100000_26 abS705S0100000_26, View view) {
        if (view != null && ((C1765720w38) abS705S0100000_26.l0).getVideoSize$player_release() != null) {
            KeyEventCallbackC1765760w3C.LIZIZ(((C1765720w38) abS705S0100000_26.l0).getAutoReleaseImmersionBar());
        }
    }

    public static final void LIZ$2(AbS705S0100000_26 abS705S0100000_26, View view) {
        if (view != null) {
            if (C1507750pL3.LIZ == EnumC1508940pMy.PLAYER_START) {
                C1752370vhb c1752370vhb = ((SeaProductDescVideoViewHolder) abS705S0100000_26.l0).LLJJL;
                if (c1752370vhb != null) {
                    c1752370vhb.LJIIIZ();
                    return;
                }
                return;
            }
            ((SeaProductDescVideoViewHolder) abS705S0100000_26.l0).LLJLIL.LIZIZ();
            C1752370vhb c1752370vhb2 = ((SeaProductDescVideoViewHolder) abS705S0100000_26.l0).LLJJL;
            if (c1752370vhb2 == null) {
                return;
            }
            c1752370vhb2.LJIIJ(0.0f);
        }
    }

    public static final void LIZ$20(AbS705S0100000_26 abS705S0100000_26, View view) {
        if (view != null) {
            if (C1507750pL3.LIZ == EnumC1508940pMy.PLAYER_START) {
                ((C1765720w38) abS705S0100000_26.l0).LJIIIZ();
                return;
            }
            InterfaceC1763420vzQ playerLogListener$player_release = ((C1765720w38) abS705S0100000_26.l0).getPlayerLogListener$player_release();
            if (playerLogListener$player_release != null) {
                playerLogListener$player_release.LIZIZ();
            }
            ((C1765720w38) abS705S0100000_26.l0).LJIIJ(0.0f);
        }
    }

    public static final void LIZ$21(AbS705S0100000_26 abS705S0100000_26, View view) {
        PipoCashierBaseFragment pipoCashierBaseFragment;
        AutofillFragment autofillFragment;
        if (view != null) {
            ((AutofillAssem) abS705S0100000_26.l0).Oo("cardnumber");
            Fragment fragmentLJI = C724240Sb0.LJI((AutofillAssem) abS705S0100000_26.l0);
            if ((fragmentLJI instanceof AutofillFragment) && (pipoCashierBaseFragment = (PipoCashierBaseFragment) fragmentLJI) != null) {
                AutofillSecondaryFragment autofillSecondaryFragment = new AutofillSecondaryFragment();
                autofillSecondaryFragment.LLJJJ = new C1711100ud2(((AutofillAssem) abS705S0100000_26.l0).Jo().LL, ((AutofillAssem) abS705S0100000_26.l0).Jo().LLILLL, ((AutofillAssem) abS705S0100000_26.l0).Jo().LLILZ);
                Fragment fragmentLJI2 = C724240Sb0.LJI((AutofillAssem) abS705S0100000_26.l0);
                if (fragmentLJI2 instanceof AutofillFragment) {
                    autofillFragment = (AutofillFragment) fragmentLJI2;
                } else {
                    autofillFragment = null;
                }
                autofillSecondaryFragment.LLJJJIL = autofillFragment;
                autofillSecondaryFragment.LLIZ = true;
                pipoCashierBaseFragment.LLJJIJIL = "next";
                String str = TuxSheet._pnsPageId;
                C1391190mJ3.LJIJI(pipoCashierBaseFragment, autofillSecondaryFragment, false, null, 12);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034 A[PHI: r1
      0x0034: PHI (r1v5 java.lang.String) = (r1v3 java.lang.String), (r1v6 java.lang.String) binds: [B:11:0x0032, B:9:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ$22(wh6.AbS705S0100000_26 r2, android.view.View r3) {
        /*
            if (r3 == 0) goto L3d
            java.lang.Object r1 = r2.l0
            com.ss.android.ugc.aweme.pipo.cashier.common.autofill.core.fragment.AutofillAssem r1 = (com.ss.android.ugc.aweme.pipo.cashier.common.autofill.core.fragment.AutofillAssem) r1
            java.lang.String r0 = "continue"
            r1.Oo(r0)
            java.lang.Object r0 = r2.l0
            com.ss.android.ugc.aweme.pipo.cashier.common.autofill.core.fragment.AutofillAssem r0 = (com.ss.android.ugc.aweme.pipo.cashier.common.autofill.core.fragment.AutofillAssem) r0
            r1 = 1
            r0.LLJIJIL = r1
            X.127h r0 = r0.Go()
            if (r0 == 0) goto L1b
            r0.setLoading(r1)
        L1b:
            java.lang.Object r0 = r2.l0
            com.ss.android.ugc.aweme.pipo.cashier.common.autofill.core.fragment.AutofillAssem r0 = (com.ss.android.ugc.aweme.pipo.cashier.common.autofill.core.fragment.AutofillAssem) r0
            com.ss.android.ugc.aweme.pipo.cashier.common.autofill.core.fragment.AutofillViewModel r3 = r0.No()
            java.lang.Object r0 = r2.l0
            com.ss.android.ugc.aweme.pipo.cashier.common.autofill.core.fragment.AutofillAssem r0 = (com.ss.android.ugc.aweme.pipo.cashier.common.autofill.core.fragment.AutofillAssem) r0
            com.ss.android.ugc.aweme.pipo.cashier.common.autofill.core.AutofillApi$CardNumberItem r0 = r0.LLJI
            java.lang.String r2 = ""
            if (r0 == 0) goto L31
            java.lang.String r1 = r0.instrumentId
            if (r1 != 0) goto L34
        L31:
            r1 = r2
            if (r0 == 0) goto L39
        L34:
            java.lang.String r0 = r0.pipoUserId
            if (r0 == 0) goto L39
            r2 = r0
        L39:
            r0 = 0
            r3.vQ2(r1, r2, r0)
        L3d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wh6.AbS705S0100000_26.LIZ$22(wh6.AbS705S0100000_26, android.view.View):void");
    }

    public static final void LIZ$23(AbS705S0100000_26 abS705S0100000_26, View view) {
        PipoCashierBaseFragment pipoCashierBaseFragment;
        if (view != null) {
            ((AutofillAssem) abS705S0100000_26.l0).Oo("notnow");
            Fragment fragmentLJI = C724240Sb0.LJI((AutofillAssem) abS705S0100000_26.l0);
            if ((fragmentLJI instanceof AutofillFragment) && (pipoCashierBaseFragment = (PipoCashierBaseFragment) fragmentLJI) != null) {
                pipoCashierBaseFragment.WR("return");
            }
        }
    }

    public static final void LIZ$24(AbS705S0100000_26 abS705S0100000_26, View view) {
        AutofillSecondaryFragment autofillSecondaryFragment;
        C1711380udU c1711380udU;
        if (view != null) {
            Fragment fragmentLJI = C724240Sb0.LJI((AutofillSecondaryAssem) abS705S0100000_26.l0);
            AutofillApi.CardNumberItem cardNumberItem = null;
            if ((fragmentLJI instanceof AutofillSecondaryFragment) && (autofillSecondaryFragment = (AutofillSecondaryFragment) fragmentLJI) != null && (c1711380udU = ((AutofillSecondaryAssem) abS705S0100000_26.l0).LLJIJIL) != null) {
                Iterator<AutofillApi.CardNumberItem> it2 = c1711380udU.LLILLJJLI.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    AutofillApi.CardNumberItem next = it2.next();
                    if (Intrinsics.LJFF(next.instrumentId, c1711380udU.LLILLL)) {
                        cardNumberItem = next;
                        break;
                    }
                }
                AutofillApi.CardNumberItem cardNumberItem2 = cardNumberItem;
                if (cardNumberItem2 != null) {
                    AutofillFragment autofillFragment = autofillSecondaryFragment.LLJJJIL;
                    if (autofillFragment != null) {
                        autofillFragment.LLJJJIL = cardNumberItem2;
                    }
                    autofillSecondaryFragment.iS();
                }
            }
        }
    }

    public static final void LIZ$3(AbS705S0100000_26 abS705S0100000_26, View view) {
        if (view != null && !((RefundCashierAssem) abS705S0100000_26.l0).Jo().LLLII) {
            ((RefundCashierAssem) abS705S0100000_26.l0).bp(false);
        }
    }

    public static final void LIZ$4(AbS705S0100000_26 abS705S0100000_26, View view) {
        C1711110ud3 c1711110ud3;
        String str;
        C1709110uZp c1709110uZp;
        if (view != null) {
            RefundCashierAssem refundCashierAssem = (RefundCashierAssem) abS705S0100000_26.l0;
            AbstractC1711120ud4 abstractC1711120ud4 = refundCashierAssem.LLJJIJIL;
            String str2 = null;
            if ((abstractC1711120ud4 instanceof C1711110ud3) && (c1711110ud3 = (C1711110ud3) abstractC1711120ud4) != null && (str = c1711110ud3.LIZIZ) != null) {
                C1155650gB9 c1155650gB9Lo = refundCashierAssem.Lo();
                if (c1155650gB9Lo != null && (c1709110uZp = c1155650gB9Lo.LL) != null) {
                    str2 = c1709110uZp.LJIIJ;
                }
                InterfaceC1709310ua9 interfaceC1709310ua9LIZIZ = C1708610uZ1.LIZIZ(str2);
                HashMap map = new HashMap();
                map.put("page_name", "select_refund_method");
                map.put("button_name", "contact_us");
                interfaceC1709310ua9LIZIZ.LIZ("tiktokls_button_click", map);
                SmartRouter.buildRoute(((RefundCashierAssem) abS705S0100000_26.l0).getContext(), str).open();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x015b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ$5(wh6.AbS705S0100000_26 r10, android.view.View r11) {
        /*
            Method dump skipped, instruction units count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wh6.AbS705S0100000_26.LIZ$5(wh6.AbS705S0100000_26, android.view.View):void");
    }

    public static final void LIZ$6(AbS705S0100000_26 abS705S0100000_26, View view) {
        InterfaceC1765630w2z onPlayerActionBarListener;
        if (view != null && ((C1765620w2y) abS705S0100000_26.l0).getNeedShowMask() && (onPlayerActionBarListener = ((C1765620w2y) abS705S0100000_26.l0).getOnPlayerActionBarListener()) != null) {
            onPlayerActionBarListener.LIZIZ();
        }
    }

    public static final void LIZ$7(AbS705S0100000_26 abS705S0100000_26, View view) {
        InterfaceC1765630w2z onPlayerActionBarListener;
        if (view != null && ((C1765620w2y) abS705S0100000_26.l0).getNeedShowMask() && (onPlayerActionBarListener = ((C1765620w2y) abS705S0100000_26.l0).getOnPlayerActionBarListener()) != null) {
            onPlayerActionBarListener.LIZLLL();
        }
    }

    public static final void LIZ$8(AbS705S0100000_26 abS705S0100000_26, View view) {
        InterfaceC1765630w2z onPlayerActionBarListener;
        if (view != null && (onPlayerActionBarListener = ((C1765620w2y) abS705S0100000_26.l0).getOnPlayerActionBarListener()) != null) {
            onPlayerActionBarListener.LJFF();
        }
    }

    public static final void LIZ$9(AbS705S0100000_26 abS705S0100000_26, View view) {
        if (view != null && ((C1765590w2v) abS705S0100000_26.l0).getVideoSize() != null) {
            KeyEventCallbackC1765760w3C.LIZIZ(false);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbS705S0100000_26(Object obj, int i, int i2) {
        super(300L);
        this.$t = i;
        this.l0 = obj;
    }
}
