package kotlin.jvm.internal;

import X.AnonymousClass0317;
import X.C034S;
import X.C039N;
import X.C039P;
import X.C03EF;
import X.C03J5;
import X.C03JB;
import X.C03JC;
import X.C03O0;
import X.C03O1;
import X.C03U4;
import X.C03ZA;
import X.C03ZB;
import X.C03ZC;
import X.C03ZW;
import X.C049X;
import X.C04E4;
import X.C04HH;
import X.C09AY;
import X.C1018703yb;
import X.C10329042d;
import X.C10503048v;
import X.C10513049f;
import X.C1054004Ag;
import X.C1054104Ah;
import X.C1063604Dy;
import X.C1120604Zw;
import X.C118300cf;
import X.C1388190mED;
import X.C1389890mGx;
import X.C1741890vQh;
import X.C1748720vbi;
import X.C19EG;
import X.C1AQS;
import X.C714302qb;
import X.C726802sc;
import X.C755502xF;
import X.C770702zh;
import X.C7768031q;
import X.C867003a8;
import X.C873203b8;
import X.C875203bS;
import X.C877103bl;
import X.C877303bn;
import X.C899503fN;
import X.C960603pE;
import X.EnumC865103Zp;
import X.InterfaceC866403a2;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.ecommerce.api.model.ButtonAction;
import com.ss.android.ugc.aweme.ecommerce.api.model.ButtonActionInfo;
import com.ss.android.ugc.aweme.ecommerce.api.model.DialogButton;
import com.ss.android.ugc.aweme.ecommerce.api.model.DialogContent;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.cart.repository.dto.BundleAddItemsToCartData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.payment.MiniOspPaymentInfoCell2;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.payment.PaymentInfoCell2;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.payment.PaymentInfoViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.sea.payment.MiniOspPaymentInfoViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.payment.USPaymentInfoCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.BindInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.RetainInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.UnfoldStrategy;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.view.viewholder.PaymentMethodViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.Summary;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.MiniOspViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.payment.viewholder.cashier.BackupPaymentEntryVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BannerComponent;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BannerCountdown;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ReminderButton;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.dependency.compliance.ComplianceDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.compliance.IComplianceDependencyService;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ola.j;
import oqa.h;

/* JADX INFO: loaded from: classes2.dex */
public class AwS130S0400000_1 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this);
            case 14:
                return invoke$14(this);
            case 15:
                return invoke$15(this);
            case 16:
                return invoke$16(this);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS130S0400000_1 awS130S0400000_1) {
        String string;
        String str;
        ButtonActionInfo buttonActionInfo;
        String str2;
        String strLJIIIIZZ;
        ButtonAction buttonAction = ((DialogButton) awS130S0400000_1.l0).buttonAction;
        HashMap<String, Object> mapLJIIJ = null;
        if (buttonAction != null && (buttonActionInfo = buttonAction.buttonActionInfo) != null && (str2 = buttonActionInfo.schema) != null) {
            Address address = (Address) awS130S0400000_1.l3;
            Uri.Builder builderBuildUpon = UriProtector.parse(str2).buildUpon();
            if (address != null) {
                strLJIIIIZZ = C1741890vQh.LJIIIIZZ(address);
            } else {
                strLJIIIIZZ = null;
            }
            string = builderBuildUpon.appendQueryParameter("shipping_address", strLJIIIIZZ).build().toString();
        } else {
            string = null;
        }
        SmartRouter.buildRoute((Context) awS130S0400000_1.l1, string).open();
        C03O0 c03o0 = C03O0.LIZ;
        DialogContent dialogContent = (DialogContent) awS130S0400000_1.l2;
        if (dialogContent != null && (str = dialogContent.daInfo) != null) {
            mapLJIIJ = C1741890vQh.LJIIJ(str);
        }
        c03o0.getClass();
        C03O0.LJJJI("edit", mapLJIIJ);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS130S0400000_1 awS130S0400000_1) {
        String string;
        String str;
        ButtonActionInfo buttonActionInfo;
        String str2;
        String strLJIIIIZZ;
        ButtonAction buttonAction = ((DialogButton) awS130S0400000_1.l0).buttonAction;
        HashMap<String, Object> mapLJIIJ = null;
        if (buttonAction != null && (buttonActionInfo = buttonAction.buttonActionInfo) != null && (str2 = buttonActionInfo.schema) != null) {
            Address address = (Address) awS130S0400000_1.l3;
            Uri.Builder builderBuildUpon = UriProtector.parse(str2).buildUpon();
            if (address != null) {
                strLJIIIIZZ = C1741890vQh.LJIIIIZZ(address);
            } else {
                strLJIIIIZZ = null;
            }
            string = builderBuildUpon.appendQueryParameter("shipping_address", strLJIIIIZZ).build().toString();
        } else {
            string = null;
        }
        SmartRouter.buildRoute((Context) awS130S0400000_1.l1, string).open();
        C03O0 c03o0 = C03O0.LIZ;
        DialogContent dialogContent = (DialogContent) awS130S0400000_1.l2;
        if (dialogContent != null && (str = dialogContent.daInfo) != null) {
            mapLJIIJ = C1741890vQh.LJIIJ(str);
        }
        c03o0.getClass();
        C03O0.LJJJI("edit", mapLJIIJ);
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS130S0400000_1 awS130S0400000_1) {
        C1748720vbi.LJFF((C03EF) awS130S0400000_1.l0, new C049X(), new AwS402S0200000_1((C03J5) awS130S0400000_1.l2, (C118300cf) awS130S0400000_1.l1, 48), new AwS367S0200000_1((C03J5) awS130S0400000_1.l2, (C03JC) awS130S0400000_1.l3, 185));
        ((C118300cf) awS130S0400000_1.l1).element++;
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS130S0400000_1 awS130S0400000_1) {
        C1748720vbi.LJFF((C03EF) awS130S0400000_1.l0, new C049X(), new AwS402S0200000_1((C03J5) awS130S0400000_1.l2, (C118300cf) awS130S0400000_1.l1, 50), new AwS367S0200000_1((C03J5) awS130S0400000_1.l2, (C03JB) awS130S0400000_1.l3, 186));
        ((C118300cf) awS130S0400000_1.l1).element++;
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$12(AwS130S0400000_1 awS130S0400000_1) {
        BundleAddItemsToCartData bundleAddItemsToCartData;
        Function1 function1 = (Function1) awS130S0400000_1.l0;
        if (function1 == null || !((Boolean) function1.invoke((C04HH) awS130S0400000_1.l1)).booleanValue()) {
            C04HH c04hh = (C04HH) awS130S0400000_1.l1;
            T t = c04hh.data;
            if ((t instanceof BundleAddItemsToCartData) && (bundleAddItemsToCartData = (BundleAddItemsToCartData) t) != null) {
                View view = (View) awS130S0400000_1.l2;
                Function2 function2 = (Function2) awS130S0400000_1.l3;
                C03U4 c03u4 = C03U4.LIZ;
                ExceptionUX exceptionUX = bundleAddItemsToCartData.exceptionUX;
                AFwS185S0000000_1 aFwS185S0000000_1 = AFwS185S0000000_1.get$arr$(164);
                AFwS185S0000000_1 aFwS185S0000000_12 = AFwS185S0000000_1.get$arr$(165);
                AwS367S0200000_1 awS367S0200000_1 = new AwS367S0200000_1(function2, (Function2<? super C04HH, ? super ButtonAction, Boolean>) c04hh, (C04HH) 192);
                c03u4.getClass();
                C03U4.LIZ(view, exceptionUX, aFwS185S0000000_1, aFwS185S0000000_12, null, awS367S0200000_1);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS130S0400000_1 awS130S0400000_1) {
        C877103bl.LIZJ((C867003a8) awS130S0400000_1.l0, (C877303bn) awS130S0400000_1.l1);
        C875203bS c875203bS = C875203bS.LIZ;
        Context context = ((BackupPaymentEntryVH) awS130S0400000_1.l2).itemView.getContext();
        FragmentManager fragmentManager = (FragmentManager) awS130S0400000_1.l3;
        BackupPaymentEntryVH backupPaymentEntryVH = (BackupPaymentEntryVH) awS130S0400000_1.l2;
        LifecycleOwner lifecycleOwner = backupPaymentEntryVH.LLJILJIL;
        PaymentViewModel paymentViewModelW5 = backupPaymentEntryVH.W5();
        C867003a8 c867003a8 = (C867003a8) awS130S0400000_1.l0;
        C877303bn c877303bn = (C877303bn) awS130S0400000_1.l1;
        c875203bS.getClass();
        C875203bS.LJFF(C875203bS.LIZIZ(context, fragmentManager, lifecycleOwner, paymentViewModelW5, c867003a8, null, c877303bn, null));
        return Unit.LIZ;
    }

    public static final Object invoke$14(AwS130S0400000_1 awS130S0400000_1) {
        long j;
        String str;
        boolean zAddSystemCalendarEvent;
        AnonymousClass0317 anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin;
        boolean z;
        String name;
        ReminderButton reminderButton;
        BannerCountdown bannerCountdown;
        BannerCountdown bannerCountdown2;
        C726802sc c726802sc = ((PdpViewModel) awS130S0400000_1.l0).LLLLLIL;
        Context context = (Context) awS130S0400000_1.l1;
        BannerComponent bannerComponent = (BannerComponent) awS130S0400000_1.l2;
        long j2 = 0;
        if (bannerComponent != null && (bannerCountdown2 = bannerComponent.bannerCountdown) != null) {
            j = bannerCountdown2.startTime;
        } else {
            j = 0;
        }
        long j3 = LSPassThroughRecordSizeConfig.DEFAULT;
        long j4 = j * j3;
        if (bannerComponent != null && (bannerCountdown = bannerComponent.bannerCountdown) != null) {
            j2 = bannerCountdown.endTime;
        }
        long j5 = j2 * j3;
        if (bannerComponent == null || (reminderButton = bannerComponent.reminderButton) == null || (str = reminderButton.eventName) == null) {
            str = "";
        }
        C10329042d c10329042d = (C10329042d) awS130S0400000_1.l3;
        c726802sc.getClass();
        Activity activityLIZ = C1388190mED.LIZ(context);
        if (activityLIZ != null) {
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin = ComplianceDependencyService.createIComplianceDependencyServicebyMonsterPlugin(false);
                if (anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin != null) {
                    z = true;
                } else {
                    z = false;
                }
                String name2 = IComplianceDependencyService.class.getName();
                if (anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin != null) {
                    name = anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin.getClass().getName();
                } else {
                    name = null;
                }
                C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
            } else {
                C1120604Zw.LIZ.LIZ();
                anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IComplianceDependencyService.class);
            }
            zAddSystemCalendarEvent = ((IComplianceDependencyService) anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin).addSystemCalendarEvent(activityLIZ, j4, j5, str);
        } else {
            zAddSystemCalendarEvent = false;
        }
        if (zAddSystemCalendarEvent) {
            C1054004Ag c1054004Ag = c726802sc.LIZ.LLJLILLLLZIIL;
            if (c1054004Ag != null) {
                c1054004Ag.LJIJ("system_registration", true);
            }
            C1389890mGx c1389890mGx = new C1389890mGx(c10329042d);
            c1389890mGx.LJIIIZ(2131857268);
            c1389890mGx.LIZLLL(1000L);
            c1389890mGx.LJIIJJI();
        } else {
            C1054004Ag c1054004Ag2 = c726802sc.LIZ.LLJLILLLLZIIL;
            if (c1054004Ag2 != null) {
                c1054004Ag2.LJIJ("system_registration", false);
            }
            C1389890mGx c1389890mGx2 = new C1389890mGx(c10329042d);
            c1389890mGx2.LJIIIZ(2131857267);
            c1389890mGx2.LIZLLL(1000L);
            c1389890mGx2.LJIIJJI();
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:341:0x0300, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0593  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0598  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x03e0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$15(kotlin.jvm.internal.AwS130S0400000_1 r75) {
        /*
            Method dump skipped, instruction units count: 1802
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS130S0400000_1.invoke$15(kotlin.jvm.internal.AwS130S0400000_1):java.lang.Object");
    }

    public static final Object invoke$16(AwS130S0400000_1 awS130S0400000_1) {
        String str;
        String str2;
        SeaPdpViewModel seaPdpViewModel = (SeaPdpViewModel) awS130S0400000_1.l0;
        C10503048v c10503048v = (C10503048v) awS130S0400000_1.l1;
        Map map = (Map) awS130S0400000_1.l2;
        Object obj = ((C1063604Dy) awS130S0400000_1.l3).LLILZ.get("previous_page");
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        Object obj2 = ((C1063604Dy) awS130S0400000_1.l3).LLILZ.get("page_name");
        if (obj2 instanceof String) {
            str2 = (String) obj2;
        } else {
            str2 = null;
        }
        SeaPdpViewModel.tS2(seaPdpViewModel, c10503048v, null, map, str, str2, (Map) awS130S0400000_1.l2, ((C1063604Dy) awS130S0400000_1.l3).LLILLL.LIZ("c3256.d2546", null), 28);
        SeaPdpViewModel seaPdpViewModel2 = (SeaPdpViewModel) awS130S0400000_1.l0;
        C1054104Ah c1054104Ah = seaPdpViewModel2.LLJLIL;
        if (c1054104Ah != null) {
            C1063604Dy c1063604Dy = (C1063604Dy) awS130S0400000_1.l3;
            c1063604Dy.getClass();
            C1054104Ah.LJIIJJI(c1054104Ah, (String) c1063604Dy.withState(seaPdpViewModel2, AFwS228S0000000_1.get$arr$(797)), ((C1063604Dy) awS130S0400000_1.l3).LJI((SeaPdpViewModel) awS130S0400000_1.l0, true, true, ((C10503048v) awS130S0400000_1.l1).LIZIZ()), (Map) awS130S0400000_1.l2, ((C1063604Dy) awS130S0400000_1.l3).LLILZ, 12);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$17(AwS130S0400000_1 awS130S0400000_1) {
        String str;
        String str2;
        SeaPdpViewModel seaPdpViewModel = (SeaPdpViewModel) awS130S0400000_1.l0;
        View view = (View) awS130S0400000_1.l1;
        Object obj = ((C1063604Dy) awS130S0400000_1.l2).LLILZ.get("previous_page");
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        Object obj2 = ((C1063604Dy) awS130S0400000_1.l2).LLILZ.get("page_name");
        if (obj2 instanceof String) {
            str2 = (String) obj2;
        } else {
            str2 = null;
        }
        SeaPdpViewModel.kR2(seaPdpViewModel, view, view, null, null, str, str2, (Map) awS130S0400000_1.l3, ((C1063604Dy) awS130S0400000_1.l2).LLILLL.LIZ("c3256.d6034", null), new AwS615S0100000_1((View) awS130S0400000_1.l1, 209), 120);
        SeaPdpViewModel seaPdpViewModel2 = (SeaPdpViewModel) awS130S0400000_1.l0;
        C1054104Ah c1054104Ah = seaPdpViewModel2.LLJLIL;
        if (c1054104Ah != null) {
            C1054104Ah.LJIIJJI(c1054104Ah, "add_to_cart", C1063604Dy.LJ((C1063604Dy) awS130S0400000_1.l2, seaPdpViewModel2, false, true, 2), (Map) awS130S0400000_1.l3, ((C1063604Dy) awS130S0400000_1.l2).LLILZ, 12);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS130S0400000_1 awS130S0400000_1) {
        InterfaceC866403a2 interfaceC866403a2;
        PaymentMethod paymentMethod;
        List<RetainInfo> list;
        PaymentMethodsData paymentMethodsData;
        PaymentInfoViewModel paymentInfoViewModelT5 = ((PaymentInfoCell2) awS130S0400000_1.l0).T5();
        SettingsManager.LIZLLL().getClass();
        AwS545S0100000_1 awS545S0100000_1 = null;
        if (SettingsManager.LIZ("ec_payment_bnpl_switch_promotion", false) && (interfaceC866403a2 = paymentInfoViewModelT5.LLILLL) != null) {
            Context context = ((C03ZB) awS130S0400000_1.l1).getContext();
            PaymentInfo paymentInfo = ((PaymentInfoCell2) awS130S0400000_1.l0).V5().LLJJJ;
            if (paymentInfo != null) {
                paymentMethod = paymentInfo.paymentMethod;
            } else {
                paymentMethod = null;
            }
            PaymentMethod paymentMethod2 = (PaymentMethod) awS130S0400000_1.l2;
            BillInfoData billInfoData = ((PaymentInfoCell2) awS130S0400000_1.l0).V5().LLJJI;
            if (billInfoData != null && (paymentMethodsData = billInfoData.paymentMethods) != null) {
                list = paymentMethodsData.retainInfos;
            } else {
                list = null;
            }
            AwS545S0100000_1 awS545S0100000_12 = new AwS545S0100000_1((Function0) awS130S0400000_1.l3, (Function0<Unit>) 32);
            if (((PaymentInfoCell2) awS130S0400000_1.l0).U5() != null) {
                awS545S0100000_1 = new AwS545S0100000_1((PaymentInfoCell2) awS130S0400000_1.l0, 33);
            }
            ((PaymentInfoCell2) awS130S0400000_1.l0).getClass();
            interfaceC866403a2.LIZ(context, paymentMethod, paymentMethod2, list, awS545S0100000_12, null, awS545S0100000_1, new C03ZW());
        } else {
            ((Function0) awS130S0400000_1.l3).invoke();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS130S0400000_1 awS130S0400000_1) {
        InterfaceC866403a2 interfaceC866403a2;
        PaymentMethod paymentMethod;
        PaymentMethodsData paymentMethodsData;
        PaymentInfoViewModel paymentInfoViewModelT5 = ((PaymentInfoCell2) awS130S0400000_1.l0).T5();
        SettingsManager.LIZLLL().getClass();
        List<RetainInfo> list = null;
        if (SettingsManager.LIZ("ec_payment_bnpl_switch_promotion", false) && (interfaceC866403a2 = paymentInfoViewModelT5.LLILLL) != null) {
            Context context = ((C03ZB) awS130S0400000_1.l1).getContext();
            PaymentInfo paymentInfo = ((PaymentInfoCell2) awS130S0400000_1.l0).V5().LLJJJ;
            if (paymentInfo != null) {
                paymentMethod = paymentInfo.paymentMethod;
            } else {
                paymentMethod = null;
            }
            PaymentMethod paymentMethod2 = (PaymentMethod) awS130S0400000_1.l2;
            BillInfoData billInfoData = ((PaymentInfoCell2) awS130S0400000_1.l0).V5().LLJJI;
            if (billInfoData != null && (paymentMethodsData = billInfoData.paymentMethods) != null) {
                list = paymentMethodsData.retainInfos;
            }
            AwS545S0100000_1 awS545S0100000_1 = new AwS545S0100000_1((Function0) awS130S0400000_1.l3, (Function0<Unit>) 34);
            ((PaymentInfoCell2) awS130S0400000_1.l0).getClass();
            interfaceC866403a2.LIZ(context, paymentMethod, paymentMethod2, list, awS545S0100000_1, null, null, new C03ZW());
        } else {
            ((Function0) awS130S0400000_1.l3).invoke();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS130S0400000_1 awS130S0400000_1) {
        String str;
        Object next;
        PaymentMethod paymentMethod = (PaymentMethod) awS130S0400000_1.l0;
        FragmentManager supportFragmentManager = null;
        if (paymentMethod.unfoldStrategy == UnfoldStrategy.SUB_PAYMENT_FOLD_SEPARATE) {
            Iterator it2 = ((List) awS130S0400000_1.l1).iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (C899503fN.LIZIZ((PaymentMethod) next, paymentMethod)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            PaymentMethod paymentMethod2 = (PaymentMethod) next;
            if (paymentMethod2 != null) {
                PaymentInfoCell2 paymentInfoCell2 = (PaymentInfoCell2) awS130S0400000_1.l3;
                C03ZB c03zb = (C03ZB) awS130S0400000_1.l2;
                PaymentInfoViewModel paymentInfoViewModelT5 = paymentInfoCell2.T5();
                Context context = c03zb.getContext();
                C19EG c19egLIZIZ = C1388190mED.LIZIZ(c03zb.getContext());
                if (c19egLIZIZ != null) {
                    supportFragmentManager = c19egLIZIZ.getSupportFragmentManager();
                }
                PaymentInfoViewModel.BQ2(paymentInfoViewModelT5, context, paymentMethod2, supportFragmentManager, paymentInfoCell2.V5(), null, null, null, 224);
            } else {
                C03ZB c03zb2 = (C03ZB) awS130S0400000_1.l2;
                PaymentInfoCell2 paymentInfoCell22 = (PaymentInfoCell2) awS130S0400000_1.l3;
                PaymentMethod paymentMethod3 = (PaymentMethod) awS130S0400000_1.l0;
                PaymentInfoViewModel paymentInfoViewModelT52 = paymentInfoCell22.T5();
                Context context2 = c03zb2.getContext();
                C19EG c19egLIZIZ2 = C1388190mED.LIZIZ(c03zb2.getContext());
                if (c19egLIZIZ2 != null) {
                    supportFragmentManager = c19egLIZIZ2.getSupportFragmentManager();
                }
                PaymentInfoViewModel.BQ2(paymentInfoViewModelT52, context2, paymentMethod3, supportFragmentManager, paymentInfoCell22.V5(), null, null, null, 224);
            }
        } else {
            SettingsManager.LIZLLL().getClass();
            if (SettingsManager.LIZ("ec_sub_payment_select_optimize", false) && ((PaymentMethod) awS130S0400000_1.l0).unfoldStrategy == UnfoldStrategy.SUB_PAYMENT_FOLD_BELOW) {
                C03ZB c03zb3 = (C03ZB) awS130S0400000_1.l2;
                PaymentMethod paymentMethod4 = c03zb3.LLLLLLL;
                if (paymentMethod4 != null) {
                    paymentMethod4.LJJ = true;
                }
                c03zb3.LJIILJJIL(true);
                c03zb3.LJIIZILJ();
            } else {
                PaymentInfoCell2.W5((PaymentInfoCell2) awS130S0400000_1.l3, ((C03ZB) awS130S0400000_1.l2).getContext(), ((PaymentInfoCell2) awS130S0400000_1.l3).itemView, false, 12);
            }
        }
        C03O0 c03o0 = C03O0.LIZ;
        PaymentMethod paymentMethod5 = (PaymentMethod) awS130S0400000_1.l0;
        c03o0.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(C03O0.LIZIZ);
        BindInfo bindInfo = paymentMethod5.bindInfo;
        if (bindInfo != null && (str = bindInfo.bindStatus) != null && str.length() != 0) {
            linkedHashMap.put("pay_bind_status", str);
        }
        linkedHashMap.put("is_option_discounted", Integer.valueOf(C770702zh.LIZ(paymentMethod5.extraInfo) ? 1 : 0));
        String strLJIJJ = paymentMethod5.LJIJJ(false);
        linkedHashMap.put("is_payment_promoted", Integer.valueOf(C770702zh.LIZ(strLJIJJ) ? 1 : 0));
        String str2 = "";
        if (strLJIJJ == null) {
            strLJIJJ = "";
        }
        linkedHashMap.put("promotion_info", strLJIJJ);
        String strLJIJ = paymentMethod5.LJIJ();
        if (strLJIJ != null) {
            str2 = strLJIJ;
        }
        linkedHashMap.put("marketing_batch_id", str2);
        linkedHashMap.put("payment_option", paymentMethod5.LJJIIZ());
        linkedHashMap.put("button_name", "view_more");
        C03O0.LLF("tiktokec_button_click", linkedHashMap);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS130S0400000_1 awS130S0400000_1) {
        String str;
        PaymentMethod next;
        PaymentMethod paymentMethod = (PaymentMethod) awS130S0400000_1.l0;
        FragmentManager supportFragmentManager = null;
        if (paymentMethod.unfoldStrategy == UnfoldStrategy.SUB_PAYMENT_FOLD_SEPARATE) {
            Iterator<PaymentMethod> it2 = ((C7768031q) awS130S0400000_1.l1).LLJJJIL.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (C899503fN.LIZIZ(next, paymentMethod)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            PaymentMethod paymentMethod2 = next;
            if (paymentMethod2 != null) {
                MiniOspPaymentInfoCell2 miniOspPaymentInfoCell2 = (MiniOspPaymentInfoCell2) awS130S0400000_1.l3;
                C03ZB c03zb = (C03ZB) awS130S0400000_1.l2;
                MiniOspPaymentInfoViewModel miniOspPaymentInfoViewModelR5 = miniOspPaymentInfoCell2.R5();
                Context context = c03zb.getContext();
                C19EG c19egLIZIZ = C1388190mED.LIZIZ(c03zb.getContext());
                if (c19egLIZIZ != null) {
                    supportFragmentManager = c19egLIZIZ.getSupportFragmentManager();
                }
                PaymentInfoViewModel.BQ2(miniOspPaymentInfoViewModelR5, context, paymentMethod2, supportFragmentManager, null, null, null, miniOspPaymentInfoCell2.P5(), 96);
            } else {
                C03ZB c03zb2 = (C03ZB) awS130S0400000_1.l2;
                MiniOspPaymentInfoCell2 miniOspPaymentInfoCell22 = (MiniOspPaymentInfoCell2) awS130S0400000_1.l3;
                PaymentMethod paymentMethod3 = (PaymentMethod) awS130S0400000_1.l0;
                MiniOspPaymentInfoViewModel miniOspPaymentInfoViewModelR52 = miniOspPaymentInfoCell22.R5();
                Context context2 = c03zb2.getContext();
                C19EG c19egLIZIZ2 = C1388190mED.LIZIZ(c03zb2.getContext());
                if (c19egLIZIZ2 != null) {
                    supportFragmentManager = c19egLIZIZ2.getSupportFragmentManager();
                }
                PaymentInfoViewModel.BQ2(miniOspPaymentInfoViewModelR52, context2, paymentMethod3, supportFragmentManager, null, null, null, miniOspPaymentInfoCell22.P5(), 96);
            }
        } else {
            SettingsManager.LIZLLL().getClass();
            if (SettingsManager.LIZ("ec_sub_payment_select_optimize", false) && ((PaymentMethod) awS130S0400000_1.l0).unfoldStrategy == UnfoldStrategy.SUB_PAYMENT_FOLD_BELOW) {
                C03ZB c03zb3 = (C03ZB) awS130S0400000_1.l2;
                PaymentMethod paymentMethod4 = c03zb3.LLLLLLL;
                if (paymentMethod4 != null) {
                    paymentMethod4.LJJ = true;
                }
                c03zb3.LJIILJJIL(true);
                c03zb3.LJIIZILJ();
            } else {
                MiniOspViewModel.cR2(((MiniOspPaymentInfoCell2) awS130S0400000_1.l3).P5(), ((C03ZB) awS130S0400000_1.l2).getContext(), C960603pE.LIZLLL(((MiniOspPaymentInfoCell2) awS130S0400000_1.l3).itemView), false, null, 120);
            }
        }
        C03O1 c03o1 = ((MiniOspPaymentInfoCell2) awS130S0400000_1.l3).P5().LLILZLL;
        PaymentMethod paymentMethod5 = (PaymentMethod) awS130S0400000_1.l0;
        c03o1.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(c03o1.LIZ);
        BindInfo bindInfo = paymentMethod5.bindInfo;
        if (bindInfo != null && (str = bindInfo.bindStatus) != null && str.length() != 0) {
            linkedHashMap.put("pay_bind_status", str);
        }
        linkedHashMap.put("is_option_discounted", Integer.valueOf(C770702zh.LIZ(paymentMethod5.extraInfo) ? 1 : 0));
        String strLJIJJ = paymentMethod5.LJIJJ(false);
        linkedHashMap.put("is_payment_promoted", Integer.valueOf(C770702zh.LIZ(strLJIJJ) ? 1 : 0));
        String str2 = "";
        if (strLJIJJ == null) {
            strLJIJJ = "";
        }
        linkedHashMap.put("promotion_info", strLJIJJ);
        String strLJIJ = paymentMethod5.LJIJ();
        if (strLJIJ != null) {
            str2 = strLJIJ;
        }
        linkedHashMap.put("marketing_batch_id", str2);
        linkedHashMap.put("payment_option", paymentMethod5.LJJIIZ());
        linkedHashMap.put("button_name", "view_more");
        C1018703yb.LIZIZ("tiktokec_button_click", linkedHashMap);
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS130S0400000_1 awS130S0400000_1) {
        FragmentManager supportFragmentManager;
        C19EG c19eg = (C19EG) awS130S0400000_1.l0;
        if (c19eg != null && (supportFragmentManager = c19eg.getSupportFragmentManager()) != null) {
            C877103bl.LIZJ((C867003a8) awS130S0400000_1.l1, (C877303bn) awS130S0400000_1.l2);
            C875203bS c875203bS = C875203bS.LIZ;
            Context context = ((USPaymentInfoCell) awS130S0400000_1.l3).itemView.getContext();
            OrderSubmitAssemViewModel orderSubmitAssemViewModelT5 = ((USPaymentInfoCell) awS130S0400000_1.l3).T5();
            PaymentInfoViewModel paymentInfoViewModelS5 = ((USPaymentInfoCell) awS130S0400000_1.l3).S5();
            C867003a8 c867003a8 = (C867003a8) awS130S0400000_1.l1;
            C877303bn c877303bn = (C877303bn) awS130S0400000_1.l2;
            c875203bS.getClass();
            C875203bS.LJFF(C875203bS.LIZJ(context, supportFragmentManager, orderSubmitAssemViewModelT5, paymentInfoViewModelS5, c867003a8, null, c877303bn, null));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS130S0400000_1 awS130S0400000_1) {
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(((C03ZC) awS130S0400000_1.l0).getContext());
        if (c19egLIZIZ != null) {
            USPaymentInfoCell uSPaymentInfoCell = (USPaymentInfoCell) awS130S0400000_1.l1;
            PaymentMethod paymentMethod = (PaymentMethod) awS130S0400000_1.l2;
            C03ZC c03zc = (C03ZC) awS130S0400000_1.l0;
            PaymentInfoViewModel.zQ2(uSPaymentInfoCell.S5(), c19egLIZIZ.getSupportFragmentManager(), paymentMethod, c03zc.getPaymentInfo(), uSPaymentInfoCell.T5(), EnumC865103Zp.SELECT_INSTALLMENT_PLAN, null, (InstallmentPlan) awS130S0400000_1.l3, null, false, 416);
            return Unit.LIZ;
        }
        return null;
    }

    public static final Object invoke$8(AwS130S0400000_1 awS130S0400000_1) {
        C1748720vbi.LIZLLL(((C039N) awS130S0400000_1.l0).LLILLJJLI, new C10513049f(), new AwS210S0300000_1((Map) awS130S0400000_1.l1, (Map<String, Object>) awS130S0400000_1.l2, (C714302qb) awS130S0400000_1.l3, (C039P) 22));
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS130S0400000_1 awS130S0400000_1) {
        C873203b8.LIZ(false, (FragmentManager) awS130S0400000_1.l0, (View) awS130S0400000_1.l1, (Summary) awS130S0400000_1.l2, (C755502xF) awS130S0400000_1.l3);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS130S0400000_1(C039N c039n, C039N c039n2, Map<String, Object> map, C714302qb c714302qb, C039P c039p) {
        super(0);
        this.$t = c039p;
        this.l0 = c039n;
        this.l1 = c039n2;
        this.l2 = map;
        this.l3 = c714302qb;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS130S0400000_1(C03EF c03ef, C118300cf c118300cf, C03J5 c03j5, C03JB c03jb, int i) {
        super(0);
        this.$t = i;
        this.l0 = c03ef;
        this.l1 = c118300cf;
        this.l2 = c03j5;
        this.l3 = c03jb;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS130S0400000_1(C03EF c03ef, C118300cf c118300cf, C03J5 c03j5, C03JC c03jc, int i) {
        super(0);
        this.$t = i;
        this.l0 = c03ef;
        this.l1 = c118300cf;
        this.l2 = c03j5;
        this.l3 = c03jc;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS130S0400000_1(C03ZA c03za, h hVar, PaymentMethodViewHolder paymentMethodViewHolder, j jVar, int i) {
        super(0);
        this.$t = i;
        this.l0 = c03za;
        this.l1 = hVar;
        this.l2 = paymentMethodViewHolder;
        this.l3 = jVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS130S0400000_1(C03ZC c03zc, USPaymentInfoCell uSPaymentInfoCell, PaymentMethod paymentMethod, InstallmentPlan installmentPlan, int i) {
        super(0);
        this.$t = i;
        this.l0 = c03zc;
        this.l1 = uSPaymentInfoCell;
        this.l2 = paymentMethod;
        this.l3 = installmentPlan;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS130S0400000_1(C867003a8 c867003a8, C877303bn c877303bn, BackupPaymentEntryVH backupPaymentEntryVH, FragmentManager fragmentManager, int i) {
        super(0);
        this.$t = i;
        this.l0 = c867003a8;
        this.l1 = c877303bn;
        this.l2 = backupPaymentEntryVH;
        this.l3 = fragmentManager;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS130S0400000_1(C19EG c19eg, C867003a8 c867003a8, C877303bn c877303bn, USPaymentInfoCell uSPaymentInfoCell, int i) {
        super(0);
        this.$t = i;
        this.l0 = c19eg;
        this.l1 = c867003a8;
        this.l2 = c877303bn;
        this.l3 = uSPaymentInfoCell;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS130S0400000_1(FragmentManager fragmentManager, View view, Summary summary, C755502xF c755502xF, int i) {
        super(0);
        this.$t = i;
        this.l0 = fragmentManager;
        this.l1 = view;
        this.l2 = summary;
        this.l3 = c755502xF;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS130S0400000_1(DialogButton dialogButton, Context context, DialogContent dialogContent, Address address, int i) {
        super(0);
        this.$t = i;
        this.l0 = dialogButton;
        this.l1 = context;
        this.l2 = dialogContent;
        this.l3 = address;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS130S0400000_1(PaymentInfoCell2 paymentInfoCell2, C03ZB c03zb, PaymentMethod paymentMethod, AwS19S0401000_1 awS19S0401000_1, int i) {
        super(0);
        this.$t = i;
        this.l0 = paymentInfoCell2;
        this.l1 = c03zb;
        this.l2 = paymentMethod;
        this.l3 = awS19S0401000_1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS130S0400000_1(PaymentInfoCell2 paymentInfoCell2, C03ZB c03zb, PaymentMethod paymentMethod, AwS245S0300000_1 awS245S0300000_1, int i) {
        super(0);
        this.$t = i;
        this.l0 = paymentInfoCell2;
        this.l1 = c03zb;
        this.l2 = paymentMethod;
        this.l3 = awS245S0300000_1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS130S0400000_1(PaymentMethod paymentMethod, C7768031q c7768031q, C03ZB c03zb, MiniOspPaymentInfoCell2 miniOspPaymentInfoCell2, int i) {
        super(0);
        this.$t = i;
        this.l0 = paymentMethod;
        this.l1 = c7768031q;
        this.l2 = c03zb;
        this.l3 = miniOspPaymentInfoCell2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS130S0400000_1(PaymentMethod paymentMethod, PaymentMethod paymentMethod2, List<PaymentMethod> list, C03ZB c03zb, PaymentInfoCell2 paymentInfoCell2) {
        super(0);
        this.$t = paymentInfoCell2;
        this.l0 = paymentMethod;
        this.l1 = paymentMethod2;
        this.l2 = list;
        this.l3 = c03zb;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS130S0400000_1(SeaPdpViewModel seaPdpViewModel, SeaPdpViewModel seaPdpViewModel2, C10503048v c10503048v, Map<String, ? extends Object> map, C1063604Dy c1063604Dy) {
        super(0);
        this.$t = c1063604Dy;
        this.l0 = seaPdpViewModel;
        this.l1 = seaPdpViewModel2;
        this.l2 = c10503048v;
        this.l3 = map;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS130S0400000_1(SeaPdpViewModel seaPdpViewModel, C04E4 c04e4, C1063604Dy c1063604Dy, Map map, int i) {
        super(0);
        this.$t = i;
        this.l0 = seaPdpViewModel;
        this.l1 = c04e4;
        this.l2 = c1063604Dy;
        this.l3 = map;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS130S0400000_1(PdpViewModel pdpViewModel, Context context, BannerComponent bannerComponent, C10329042d c10329042d, int i) {
        super(0);
        this.$t = i;
        this.l0 = pdpViewModel;
        this.l1 = context;
        this.l2 = bannerComponent;
        this.l3 = c10329042d;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS130S0400000_1(Function1 function1, Function1<? super C04HH, Boolean> function12, C04HH c04hh, View view, Function2<? super C04HH, ? super ButtonAction, Boolean> function2) {
        super(0);
        this.$t = function2;
        this.l0 = function1;
        this.l1 = function12;
        this.l2 = c04hh;
        this.l3 = view;
    }
}
