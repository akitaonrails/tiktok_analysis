package g1c;

import X.AbstractViewOnClickListenerC420730Ged;
import X.AnonymousClass0317;
import X.C034S;
import X.C03GO;
import X.C03O0;
import X.C03S8;
import X.C03WH;
import X.C03Z4;
import X.C03ZB;
import X.C03ZC;
import X.C0I7D;
import X.C0WZX;
import X.C1120604Zw;
import X.C1388190mED;
import X.C1391600mJi;
import X.C1537900q7g;
import X.C1541950qED;
import X.C1745060vVo;
import X.C1748470vbJ;
import X.C19EG;
import X.C19GS;
import X.C1AQS;
import X.C2204961BRm;
import X.C450720Hlu;
import X.C842603Qy;
import X.C882703cf;
import X.C903203fy;
import X.EnumC1235690iGF;
import X.EnumC865603Zu;
import android.content.Context;
import android.os.SystemClock;
import android.text.Editable;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.sea.summary.OSPHybridBottomSheetDialogFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.view.SparkNavigationFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.subpage.USAggregationShopMessageEditFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.subpage.USHalfPageMessageEditPanelFragment;
import com.ss.android.ugc.aweme.ecommerce.dependency.location.LocationDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.location.ILocationDependencyService;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.Collections;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import oqa.h;

/* JADX INFO: loaded from: classes2.dex */
public class AjS2S1100000_1 extends AbstractViewOnClickListenerC420730Ged {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // X.AbstractViewOnClickListenerC420730Ged
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
            default:
                super.LIZ(view);
                break;
        }
    }

    public static final void LIZ$0(AjS2S1100000_1 ajS2S1100000_1, View view) {
        if (view != null) {
            ((C03ZB) ajS2S1100000_1.l1).getOnNoticeClickListener().invoke(ajS2S1100000_1.s0);
        }
    }

    public static final void LIZ$1(AjS2S1100000_1 ajS2S1100000_1, View view) {
        C0I7D editText;
        Editable editableLLLLJI;
        if (view != null) {
            C03O0.LJJJJLL(C03O0.LIZ, "save", "confirm", ((USAggregationShopMessageEditFragment) ajS2S1100000_1.l1).cS().hi1(false), "message", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, -16, 8388607);
            C1748470vbJ c1748470vbJ = ((USAggregationShopMessageEditFragment) ajS2S1100000_1.l1).LLJJ;
            if (c1748470vbJ != null && (editText = c1748470vbJ.getEditText()) != null && (editableLLLLJI = C2204961BRm.LLLLJI(editText, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnumb/RY5KwLk70vyKsyLEUKHiVfLTn+Ld01UiNft+7fQiIS022cwd76dnURYAdr67N2c79fjg==", null))) != null) {
                ((USAggregationShopMessageEditFragment) ajS2S1100000_1.l1).cS().LLL.put(ajS2S1100000_1.s0, editableLLLLJI.toString());
                ((USAggregationShopMessageEditFragment) ajS2S1100000_1.l1).LLJJI = editableLLLLJI.toString();
            }
            ((USAggregationShopMessageEditFragment) ajS2S1100000_1.l1).dismissAllowingStateLoss();
        }
    }

    public static final void LIZ$10(AjS2S1100000_1 ajS2S1100000_1, View view) {
        C19EG c19eg;
        if (view != null) {
            Object objLIZIZ = C1745060vVo.LIZIZ(((C03GO) ajS2S1100000_1.l1).getContext());
            if ((objLIZIZ instanceof C19GS) && (c19eg = (C19EG) objLIZIZ) != null) {
                new OSPHybridBottomSheetDialogFragment(((C03GO) ajS2S1100000_1.l1).getTitleText(), ajS2S1100000_1.s0).show(c19eg.getSupportFragmentManager(), "");
            }
        }
    }

    public static final void LIZ$11(AjS2S1100000_1 ajS2S1100000_1, View view) {
        AnonymousClass0317 anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin;
        FragmentManager supportFragmentManager;
        String str;
        boolean z;
        String name;
        C03WH paymentLogger;
        if (view != null) {
            PaymentMethod paymentMethod = ((h) ajS2S1100000_1.l1).getPaymentMethod();
            if (paymentMethod != null && (paymentLogger = ((h) ajS2S1100000_1.l1).getPaymentLogger()) != null) {
                paymentLogger.LJIIIIZZ(paymentMethod);
            }
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin = LocationDependencyService.createILocationDependencyServicebyMonsterPlugin(false);
                if (anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin != null) {
                    z = true;
                } else {
                    z = false;
                }
                String name2 = ILocationDependencyService.class.getName();
                if (anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin != null) {
                    name = anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin.getClass().getName();
                } else {
                    name = null;
                }
                C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
            } else {
                C1120604Zw.LIZ.LIZ();
                anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILocationDependencyService.class);
            }
            if (Intrinsics.LJFF(((ILocationDependencyService) anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin).getCurrentRegionCode().toUpperCase(Locale.ROOT), "SA")) {
                C1537900q7g c1537900q7g = C1541950qED.LIZJ;
                Context context = ((h) ajS2S1100000_1.l1).getContext();
                SparkContext sparkContext = new SparkContext();
                sparkContext.LJJLIIJ(C03S8.LJJIJIIJIL(ajS2S1100000_1.s0));
                c1537900q7g.getClass();
                new C1541950qED(context, sparkContext).LIZIZ();
                return;
            }
            C19EG c19egLIZIZ = C1388190mED.LIZIZ(((h) ajS2S1100000_1.l1).getContext());
            if (c19egLIZIZ == null || (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) == null) {
                return;
            }
            Context context2 = ((h) ajS2S1100000_1.l1).getContext();
            Object[] objArr = new Object[1];
            PaymentMethod paymentMethod2 = ((h) ajS2S1100000_1.l1).getPaymentMethod();
            if (paymentMethod2 == null || (str = paymentMethod2.displayName) == null) {
                str = "";
            }
            objArr[0] = str;
            String string = context2.getString(2131832756, objArr);
            SparkNavigationFragment sparkNavigationFragment = new SparkNavigationFragment();
            sparkNavigationFragment.LLILLL = C03S8.LJJIJIIJIL(ajS2S1100000_1.s0);
            sparkNavigationFragment.LLILZ = string;
            C882703cf.LIZ(supportFragmentManager, sparkNavigationFragment, null, null, false, 28);
        }
    }

    public static final void LIZ$2(AjS2S1100000_1 ajS2S1100000_1, View view) {
        C0I7D editText;
        Editable editableLLLLJI;
        String str;
        if (view != null) {
            C03O0.LJJJJLL(C03O0.LIZ, "save", "confirm", ((USHalfPageMessageEditPanelFragment) ajS2S1100000_1.l1).gS().hi1(false), "message", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, -16, 8388607);
            C1748470vbJ c1748470vbJ = ((USHalfPageMessageEditPanelFragment) ajS2S1100000_1.l1).LLJJIJIL;
            if (c1748470vbJ != null && (editText = c1748470vbJ.getEditText()) != null && (editableLLLLJI = C2204961BRm.LLLLJI(editText, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnumb/RY5KwLk70vyKsyLEUKHiVfJD/1OegzVDJ7vaN+UoQEmwU7Ec1znr5V+ZL+fiAEIao=", null))) != null && (str = ajS2S1100000_1.s0) != null) {
                ((USHalfPageMessageEditPanelFragment) ajS2S1100000_1.l1).gS().eT2(new C842603Qy(Collections.singletonList(str), editableLLLLJI.toString()));
            }
            ((USHalfPageMessageEditPanelFragment) ajS2S1100000_1.l1).dismissAllowingStateLoss();
        }
    }

    public static final void LIZ$3(AjS2S1100000_1 ajS2S1100000_1, View view) {
        AnonymousClass0317 anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin;
        FragmentManager supportFragmentManager;
        String str;
        boolean z;
        String name;
        if (view != null) {
            PaymentMethod paymentMethod = ((C03ZC) ajS2S1100000_1.l1).getPaymentMethod();
            if (paymentMethod != null) {
                C03O0.LIZ.getClass();
                C03O0.LJJJJ(paymentMethod);
            }
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin = LocationDependencyService.createILocationDependencyServicebyMonsterPlugin(false);
                if (anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin != null) {
                    z = true;
                } else {
                    z = false;
                }
                String name2 = ILocationDependencyService.class.getName();
                if (anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin != null) {
                    name = anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin.getClass().getName();
                } else {
                    name = null;
                }
                C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
            } else {
                C1120604Zw.LIZ.LIZ();
                anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILocationDependencyService.class);
            }
            if (Intrinsics.LJFF(((ILocationDependencyService) anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin).getCurrentRegionCode().toUpperCase(Locale.ROOT), "SA")) {
                C1537900q7g c1537900q7g = C1541950qED.LIZJ;
                Context context = ((C03ZC) ajS2S1100000_1.l1).getContext();
                SparkContext sparkContext = new SparkContext();
                sparkContext.LJJLIIJ(C03S8.LJJIJIIJIL(ajS2S1100000_1.s0));
                c1537900q7g.getClass();
                new C1541950qED(context, sparkContext).LIZIZ();
                return;
            }
            C19EG c19egLIZIZ = C1388190mED.LIZIZ(((C03ZC) ajS2S1100000_1.l1).getContext());
            if (c19egLIZIZ == null || (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) == null) {
                return;
            }
            Context context2 = ((C03ZC) ajS2S1100000_1.l1).getContext();
            Object[] objArr = new Object[1];
            PaymentMethod paymentMethod2 = ((C03ZC) ajS2S1100000_1.l1).getPaymentMethod();
            if (paymentMethod2 == null || (str = paymentMethod2.displayName) == null) {
                str = "";
            }
            objArr[0] = str;
            String string = context2.getString(2131832756, objArr);
            SparkNavigationFragment sparkNavigationFragment = new SparkNavigationFragment();
            sparkNavigationFragment.LLILLL = C03S8.LJJIJIIJIL(ajS2S1100000_1.s0);
            sparkNavigationFragment.LLILZ = string;
            C882703cf.LIZ(supportFragmentManager, sparkNavigationFragment, null, null, false, 28);
        }
    }

    public static final void LIZ$4(AjS2S1100000_1 ajS2S1100000_1, View view) {
        if (view != null) {
            C450720Hlu c450720Hlu = new C450720Hlu(((C03ZC) ajS2S1100000_1.l1).getContext());
            c450720Hlu.LLILZ = ajS2S1100000_1.s0;
            TuxIconView icNoticeFromXml = ((C03ZC) ajS2S1100000_1.l1).getIcNoticeFromXml();
            C1391600mJi c1391600mJi = c450720Hlu.LLILLJJLI;
            c1391600mJi.LIZIZ = icNoticeFromXml;
            c1391600mJi.LIZLLL = EnumC1235690iGF.BOTTOM;
            c1391600mJi.LJII = -1001L;
            c1391600mJi.LJIJJ = true;
            c450720Hlu.LIZIZ().show();
        }
    }

    public static final void LIZ$5(AjS2S1100000_1 ajS2S1100000_1, View view) {
        FragmentManager supportFragmentManager;
        String str;
        EnumC865603Zu enumC865603Zu;
        C03WH paymentLogger;
        if (view != null) {
            PaymentMethod paymentMethod = ((C03Z4) ajS2S1100000_1.l1).getPaymentMethod();
            if (paymentMethod != null && (paymentLogger = ((C03Z4) ajS2S1100000_1.l1).getPaymentLogger()) != null) {
                paymentLogger.LJIIIIZZ(paymentMethod);
            }
            C19EG c19egLIZIZ = C1388190mED.LIZIZ(((C03Z4) ajS2S1100000_1.l1).getContext());
            if (c19egLIZIZ != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null) {
                Context context = ((C03Z4) ajS2S1100000_1.l1).getContext();
                Object[] objArr = new Object[1];
                PaymentMethod paymentMethod2 = ((C03Z4) ajS2S1100000_1.l1).getPaymentMethod();
                if (paymentMethod2 == null || (str = paymentMethod2.displayName) == null) {
                    str = "";
                }
                objArr[0] = str;
                String string = context.getString(2131832756, objArr);
                SparkNavigationFragment sparkNavigationFragment = new SparkNavigationFragment();
                sparkNavigationFragment.LLILLL = ajS2S1100000_1.s0;
                sparkNavigationFragment.LLILZ = string;
                PaymentViewModel paymentViewModel = ((C03Z4) ajS2S1100000_1.l1).getPaymentViewModel();
                if (paymentViewModel != null && paymentViewModel.LLJILJIL) {
                    enumC865603Zu = EnumC865603Zu.HEIGHT_73;
                } else {
                    enumC865603Zu = null;
                }
                C882703cf.LIZ(supportFragmentManager, sparkNavigationFragment, null, enumC865603Zu, false, 20);
            }
        }
    }

    public static final void LIZ$6(AjS2S1100000_1 ajS2S1100000_1, View view) {
        if (view != null) {
            C450720Hlu c450720Hlu = new C450720Hlu(((C03Z4) ajS2S1100000_1.l1).getContext());
            c450720Hlu.LLILZ = ajS2S1100000_1.s0;
            TuxIconView icNoticeFromXml = ((C03Z4) ajS2S1100000_1.l1).getIcNoticeFromXml();
            C1391600mJi c1391600mJi = c450720Hlu.LLILLJJLI;
            c1391600mJi.LIZIZ = icNoticeFromXml;
            c1391600mJi.LIZLLL = EnumC1235690iGF.BOTTOM;
            c1391600mJi.LJII = -1001L;
            c1391600mJi.LJIJJ = true;
            c450720Hlu.LIZIZ().show();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ$7(g1c.AjS2S1100000_1 r44, android.view.View r45) {
        /*
            Method dump skipped, instruction units count: 1513
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g1c.AjS2S1100000_1.LIZ$7(g1c.AjS2S1100000_1, android.view.View):void");
    }

    public static final void LIZ$8(AjS2S1100000_1 ajS2S1100000_1, View view) {
        Function1<String, Unit> onPromotionClickListener;
        if (view != null && (onPromotionClickListener = ((C903203fy) ajS2S1100000_1.l1).getOnPromotionClickListener()) != null) {
            onPromotionClickListener.invoke(ajS2S1100000_1.s0);
        }
    }

    public static final void LIZ$9(AjS2S1100000_1 ajS2S1100000_1, View view) {
        if (view != null) {
            ((Function1) ajS2S1100000_1.l1).invoke(ajS2S1100000_1.s0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AjS2S1100000_1(Object obj, String str, int i) {
        super(700L);
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
