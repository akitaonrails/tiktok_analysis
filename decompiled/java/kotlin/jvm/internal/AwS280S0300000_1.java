package kotlin.jvm.internal;

import X.C03DZ;
import X.C03PI;
import X.C03SY;
import X.C03XW;
import X.C03ZB;
import X.C03ZD;
import X.C042X;
import X.C042Y;
import X.C04EM;
import X.C04EP;
import X.C04HS;
import X.C04HT;
import X.C04HW;
import X.C04HY;
import X.C09AY;
import X.C0HTI;
import X.C0HZQ;
import X.C0PEM;
import X.C1003103w5;
import X.C118300cf;
import X.C13LP;
import X.C1697810uHb;
import X.C197039127h;
import X.C19EG;
import X.C1AF0;
import X.C1DFH;
import X.C2107308Nj;
import X.C2188811AlT;
import X.C23250099c;
import X.C2371709Rb;
import X.C259800zU;
import X.C731902tR;
import X.C786410Ut5;
import X.C843803Rk;
import X.C844203Ro;
import X.C844303Rp;
import X.C862603Yq;
import X.C873103b7;
import X.C939703lr;
import X.C948003nC;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ARunnableS4S0301000_1;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModel;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.osp.bottom.MiniOspBottomWidget;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.combinesku.mainorder.USCombinedSkuMainOrderCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.discount.PlatformDiscountsCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.payment.MiniOspPaymentInfoCell2;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.payment.PaymentInfoCell2;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.payment.PaymentInfoViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.page.OrderSubmitFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.CCDCAddCardHalfFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.CCDCAddCardViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.cci.viewholder.InstallmentInfosViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.view.viewholder.InstallmentPlanListElementViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PromotionCouponModule;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.StarlingKeyValue;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.MiniOspViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import com.ss.android.ugc.aweme.ecommerce.core.module.ModuleManager;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import g1c.AjS60S0100000_1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class AwS280S0300000_1 extends C09AY implements Function2 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            case 4:
                return invoke$4(this, obj, obj2);
            case 5:
                return invoke$5(this, obj, obj2);
            case 6:
                return invoke$6(this, obj, obj2);
            case 7:
                return invoke$7(this, obj, obj2);
            case 8:
                return invoke$8(this, obj, obj2);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj, obj2);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj, obj2);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj, obj2);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj, obj2);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this, obj, obj2);
            case 14:
                return invoke$14(this, obj, obj2);
            case 15:
                return invoke$15(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$0(kotlin.jvm.internal.AwS280S0300000_1 r10, java.lang.Object r11, java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS280S0300000_1.invoke$0(kotlin.jvm.internal.AwS280S0300000_1, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$1(AwS280S0300000_1 awS280S0300000_1, Object obj, Object obj2) {
        String str;
        StarlingKeyValue starlingKeyValue;
        UIAssem uIAssem = (UIAssem) obj;
        if (((Boolean) obj2).booleanValue()) {
            ((MiniOspBottomWidget) awS280S0300000_1.l0).lp((View) awS280S0300000_1.l1);
            ModuleManager moduleManager = ((MiniOspBottomWidget) awS280S0300000_1.l0).kp().LLLFFI;
            if (moduleManager != null) {
                moduleManager.LJIIL("bottom_widget_done", false);
            }
            C197039127h c197039127hIp = ((MiniOspBottomWidget) awS280S0300000_1.l0).ip();
            if (c197039127hIp != null && c197039127hIp.LLLII) {
                ModuleManager moduleManager2 = ((MiniOspBottomWidget) awS280S0300000_1.l0).kp().LLLFFI;
                if (moduleManager2 != null) {
                    moduleManager2.LJ(true);
                }
            } else {
                ModuleManager moduleManager3 = ((MiniOspBottomWidget) awS280S0300000_1.l0).kp().LLLFFI;
                if (moduleManager3 != null) {
                    moduleManager3.LJ(false);
                }
            }
            MiniOspBottomWidget miniOspBottomWidget = (MiniOspBottomWidget) awS280S0300000_1.l0;
            miniOspBottomWidget.withState(miniOspBottomWidget.kp(), new AwS367S0200000_1(miniOspBottomWidget, (View) awS280S0300000_1.l2, 255));
            BillInfoData billInfoData = ((MiniOspBottomWidget) awS280S0300000_1.l0).kp().LLIZ;
            if (billInfoData != null && (starlingKeyValue = billInfoData.placeOrderButtonText) != null) {
                str = starlingKeyValue.key;
            } else {
                str = null;
            }
            uIAssem.withState(((MiniOspBottomWidget) awS280S0300000_1.l0).kp(), new AwS115S1100000_1((MiniOspBottomWidget) awS280S0300000_1.l0, C2371709Rb.LIZLLL(str, false), 9));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$10(AwS280S0300000_1 awS280S0300000_1, Object obj, Object obj2) {
        String str;
        C04HY c04hy;
        C04HW c04hw;
        boolean z;
        boolean z2;
        int iIntValue = ((Number) obj).intValue();
        C042Y c042y = (C042Y) obj2;
        T t = ((C259800zU) awS280S0300000_1.l0).element;
        C04EM c04em = (C04EM) awS280S0300000_1.l1;
        List list = (List) awS280S0300000_1.l2;
        String[] strArr = (String[]) t;
        if (c042y == null || (str = c042y.LL) == null) {
            str = "";
        }
        strArr[iIntValue] = str;
        int i = 0;
        for (ViewGroup viewGroup : c04em.LLJJI) {
            int i2 = i + 1;
            ArrayList arrayList = null;
            if (i >= 0) {
                ViewGroup viewGroup2 = viewGroup;
                if (i != iIntValue) {
                    if (viewGroup2 instanceof C04HS) {
                        C04HS c04hs = (C04HS) viewGroup2;
                        c04hs.getClass();
                        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
                        try {
                            int i3 = 0;
                            for (Object obj3 : (ArrayList) c04hs.LLJ) {
                                int i4 = i3 + 1;
                                if (i3 >= 0) {
                                    View view = (View) obj3;
                                    List<C042Y> list2 = c04hs.LL;
                                    if (list2 == null) {
                                        list2 = null;
                                    }
                                    C042Y c042y2 = (C042Y) C13LP.LJJJLZIJ(i3, list2);
                                    if (c042y2 != null) {
                                        strArr2[c04hs.LLILZ] = c042y2.LL;
                                        if (C731902tR.LIZ(list, strArr2) > 0) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        c042y2.LLIZLLLIL = z2;
                                        c04hs.LIZJ(view, c042y2);
                                    }
                                    i3 = i4;
                                } else {
                                    C1697810uHb.LJIJI();
                                    throw null;
                                }
                            }
                        } catch (ArrayIndexOutOfBoundsException e) {
                            TryCatchGuardChecker.doCheck(e);
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("index out of bounds, tempIdArray size: ");
                            sbLIZ.append(strArr2.length);
                            sbLIZ.append(", groupIndex: ");
                            sbLIZ.append(c04hs.LLILZ);
                            C1AF0.LJFF(e, C2188811AlT.LIZIZ(sbLIZ));
                        }
                    } else if (viewGroup2 instanceof C04HT) {
                        C04HT c04ht = (C04HT) viewGroup2;
                        c04ht.getClass();
                        String[] strArr3 = (String[]) Arrays.copyOf(strArr, strArr.length);
                        List<C042Y> list3 = c04ht.LLILLJJLI;
                        if (list3 != null) {
                            arrayList = new ArrayList(list3);
                            int i5 = 0;
                            for (Object obj4 : arrayList) {
                                int i6 = i5 + 1;
                                if (i5 >= 0) {
                                    C042Y c042y3 = (C042Y) obj4;
                                    strArr3[c04ht.LL] = c042y3.LL;
                                    if (C731902tR.LIZ(list, strArr3) > 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if (c042y3.LLIZLLLIL != z) {
                                        C042Y c042yLIZ = C042X.LIZ(c042y3);
                                        c042yLIZ.LLIZLLLIL = z;
                                        ListProtector.set(arrayList, i5, c042yLIZ);
                                    }
                                    i5 = i6;
                                } else {
                                    C1697810uHb.LJIJI();
                                    throw null;
                                }
                            }
                        }
                        c04ht.LLILLJJLI = arrayList;
                        if (arrayList != null && (c04hy = c04ht.LLILLL) != null && (c04hw = c04hy.LL) != null) {
                            c04hw.LLLI(arrayList);
                        }
                    } else {
                        continue;
                    }
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        C04EP c04ep = c04em.LLJJIII;
        if (c04ep != null) {
            c04ep.LIZ(strArr);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x017e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$11(kotlin.jvm.internal.AwS280S0300000_1 r10, java.lang.Object r11, java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS280S0300000_1.invoke$11(kotlin.jvm.internal.AwS280S0300000_1, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$12(kotlin.jvm.internal.AwS280S0300000_1 r6, java.lang.Object r7, java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS280S0300000_1.invoke$12(kotlin.jvm.internal.AwS280S0300000_1, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$13(AwS280S0300000_1 awS280S0300000_1, Object obj, Object obj2) {
        int iIntValue = ((Number) obj2).intValue();
        C1003103w5 c1003103w5 = (C1003103w5) awS280S0300000_1.l0;
        C19EG c19eg = (C19EG) awS280S0300000_1.l1;
        AwS402S0200000_1 awS402S0200000_1 = new AwS402S0200000_1((ViewModel) awS280S0300000_1.l2, c19eg, 99);
        c1003103w5.getClass();
        if (iIntValue == 4) {
            View viewFindViewById = c19eg.findViewById(R.id.w0t);
            if (viewFindViewById != null) {
                C786410Ut5.LJLLLLLL(8, viewFindViewById);
            }
            View viewFindViewById2 = c19eg.findViewById(R.id.yxc);
            if (viewFindViewById2 != null) {
                C786410Ut5.LJLLLLLL(0, viewFindViewById2);
            }
            C0HTI c0hti = new C0HTI();
            c0hti.LIZ = R.drawable.uw;
            Drawable drawableLIZ = c0hti.LIZ(c19eg);
            View viewFindViewById3 = c19eg.findViewById(R.id.msf);
            if (viewFindViewById3 != null) {
                viewFindViewById3.setBackground(drawableLIZ);
            }
            View viewFindViewById4 = c19eg.findViewById(R.id.yxb);
            if (viewFindViewById4 != null) {
                C786410Ut5.I7(new AjS60S0100000_1((Object) awS402S0200000_1, 126), viewFindViewById4);
            }
        } else {
            View viewFindViewById5 = c19eg.findViewById(R.id.yxc);
            if (viewFindViewById5 != null) {
                C786410Ut5.LJLLLLLL(8, viewFindViewById5);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$14(AwS280S0300000_1 awS280S0300000_1, Object obj, Object obj2) {
        String strOptString;
        JSONObject jSONObject = (JSONObject) obj2;
        if (obj == C03XW.ON_CLOSE) {
            if (jSONObject != null) {
                strOptString = jSONObject.optString("action_type");
            } else {
                strOptString = null;
            }
            if (Intrinsics.LJFF(strOptString, "refresh")) {
                OrderSubmitAssemViewModel.AQ2(((OrderSubmitFragment) awS280S0300000_1.l0).ZR(), ((OrderSubmitFragment) awS280S0300000_1.l0).getContext(), (Boolean) awS280S0300000_1.l1, (Integer) awS280S0300000_1.l2, Boolean.TRUE, 2);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$15(AwS280S0300000_1 awS280S0300000_1, Object obj, Object obj2) {
        String strOptString;
        JSONObject jSONObject = (JSONObject) obj2;
        if (obj == C03XW.ON_CLOSE) {
            if (jSONObject != null) {
                strOptString = jSONObject.optString("action_type");
            } else {
                strOptString = null;
            }
            if (Intrinsics.LJFF(strOptString, "refresh")) {
                OrderSubmitAssemViewModel.AQ2(((OrderSubmitFragment) awS280S0300000_1.l0).ZR(), ((OrderSubmitFragment) awS280S0300000_1.l0).getContext(), (Boolean) awS280S0300000_1.l1, (Integer) awS280S0300000_1.l2, Boolean.TRUE, 2);
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$2(AwS280S0300000_1 awS280S0300000_1, Object obj, Object obj2) {
        C948003nC c948003nC = (C948003nC) obj2;
        boolean z = true;
        if (c948003nC != null && ((Boolean) c948003nC.LIZ).booleanValue()) {
            C0HZQ c0hzq = (C0HZQ) awS280S0300000_1.l0;
            if (c0hzq != null) {
                c0hzq.setChecked(((PlatformDiscountsCell) awS280S0300000_1.l1).LLJILLL);
            }
            PlatformDiscountsCell platformDiscountsCell = (PlatformDiscountsCell) awS280S0300000_1.l1;
            boolean z2 = platformDiscountsCell.LLJILLL;
            String str = ((PromotionCouponModule) awS280S0300000_1.l2).bannerText;
            if (str != null && !a0.LJJJIL(str)) {
                z = false;
            }
            platformDiscountsCell.W5(z2, z);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS280S0300000_1 awS280S0300000_1, Object obj, Object obj2) {
        String str;
        PaymentInfo paymentInfoJQ2;
        PaymentMethodInfo paymentMethodInfo;
        InstallmentPlan installmentPlan = (InstallmentPlan) obj;
        ((Boolean) obj2).booleanValue();
        ((MiniOspPaymentInfoCell2) awS280S0300000_1.l0).getClass();
        C03SY c03sy = C03SY.LIZ;
        PaymentInfo paymentInfo = ((C03ZB) awS280S0300000_1.l1).getPaymentInfo();
        if (paymentInfo != null && (paymentMethodInfo = paymentInfo.paymentMethodInfo) != null) {
            str = paymentMethodInfo.id;
        } else {
            str = null;
        }
        c03sy.getClass();
        if (C03SY.LJIJ(str)) {
            ((MiniOspPaymentInfoCell2) awS280S0300000_1.l0).R5();
            paymentInfoJQ2 = PaymentInfoViewModel.CQ2(installmentPlan, ((C03ZB) awS280S0300000_1.l1).getPaymentInfo());
        } else {
            paymentInfoJQ2 = MiniOspViewModel.JQ2(((MiniOspPaymentInfoCell2) awS280S0300000_1.l0).P5(), (PaymentMethod) awS280S0300000_1.l2, installmentPlan, null, "installment click", null, 20);
        }
        PaymentInfo paymentInfo2 = ((MiniOspPaymentInfoCell2) awS280S0300000_1.l0).P5().LLJIJIL;
        if (paymentInfo2 != null && paymentInfo2.LJI()) {
            paymentInfoJQ2 = ((MiniOspPaymentInfoCell2) awS280S0300000_1.l0).P5().SQ2(paymentInfoJQ2, true, paymentInfo2);
        }
        if (((PaymentMethod) awS280S0300000_1.l2).LJJJJL()) {
            MiniOspViewModel.yQ2(((MiniOspPaymentInfoCell2) awS280S0300000_1.l0).P5(), paymentInfoJQ2, true, null, null, 12);
        } else {
            MiniOspViewModel.kR2(((MiniOspPaymentInfoCell2) awS280S0300000_1.l0).P5(), paymentInfoJQ2, false, "installment click", 6);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS280S0300000_1 awS280S0300000_1, Object obj, Object obj2) {
        String strOptString;
        LifecycleOwner lifecycleOwnerLIZ;
        LifecycleCoroutineScope lifecycleScope;
        JSONObject jSONObject = (JSONObject) obj2;
        if (obj == C03XW.ON_CLOSE) {
            if (jSONObject != null) {
                strOptString = jSONObject.optString("action_type");
            } else {
                strOptString = null;
            }
            if (Intrinsics.LJFF(strOptString, "refresh") && (lifecycleOwnerLIZ = C843803Rk.LIZ(((C03PI) awS280S0300000_1.l0).LIZ)) != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwnerLIZ)) != null) {
                C1DFH c1dfh = C0PEM.LIZ;
                C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C844203Ro((Function1) awS280S0300000_1.l1, (PaymentInfo) awS280S0300000_1.l2, null), 2);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS280S0300000_1 awS280S0300000_1, Object obj, Object obj2) {
        String strOptString;
        LifecycleOwner lifecycleOwnerLIZ;
        LifecycleCoroutineScope lifecycleScope;
        JSONObject jSONObject = (JSONObject) obj2;
        if (obj == C03XW.ON_CLOSE) {
            if (jSONObject != null) {
                strOptString = jSONObject.optString("action_type");
            } else {
                strOptString = null;
            }
            if (Intrinsics.LJFF(strOptString, "refresh") && (lifecycleOwnerLIZ = C843803Rk.LIZ(((C03PI) awS280S0300000_1.l0).LIZ)) != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwnerLIZ)) != null) {
                C1DFH c1dfh = C0PEM.LIZ;
                C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C844303Rp((Function1) awS280S0300000_1.l1, (PaymentInfo) awS280S0300000_1.l2, null), 2);
            }
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$6(AwS280S0300000_1 awS280S0300000_1, Object obj, Object obj2) {
        int paddingLeft;
        int paddingTop;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int iIntValue = ((Number) obj2).intValue();
        int paddingRight = 0;
        if (zBooleanValue) {
            C118300cf c118300cf = (C118300cf) awS280S0300000_1.l0;
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvIS = ((CCDCAddCardHalfFragment) awS280S0300000_1.l1).iS();
            if (viewOnAttachStateChangeListenerC20604515jvIS != null) {
                paddingRight = viewOnAttachStateChangeListenerC20604515jvIS.getPaddingBottom();
            }
            c118300cf.element = paddingRight;
            C03DZ.LIZJ((View) awS280S0300000_1.l2);
            View view = (View) awS280S0300000_1.l2;
            HandlerHook.viewPost(view, new ARunnableS4S0301000_1(view, iIntValue, (CCDCAddCardHalfFragment) awS280S0300000_1.l1, (C118300cf) awS280S0300000_1.l0, 2));
        } else {
            C786410Ut5.ed((View) awS280S0300000_1.l2, 0.0f);
            C03DZ.LIZ((View) awS280S0300000_1.l2);
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvIS2 = ((CCDCAddCardHalfFragment) awS280S0300000_1.l1).iS();
            if (viewOnAttachStateChangeListenerC20604515jvIS2 != null) {
                ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvIS3 = ((CCDCAddCardHalfFragment) awS280S0300000_1.l1).iS();
                if (viewOnAttachStateChangeListenerC20604515jvIS3 != null) {
                    paddingLeft = viewOnAttachStateChangeListenerC20604515jvIS3.getPaddingLeft();
                } else {
                    paddingLeft = 0;
                }
                ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvIS4 = ((CCDCAddCardHalfFragment) awS280S0300000_1.l1).iS();
                if (viewOnAttachStateChangeListenerC20604515jvIS4 != null) {
                    paddingTop = viewOnAttachStateChangeListenerC20604515jvIS4.getPaddingTop();
                } else {
                    paddingTop = 0;
                }
                ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvIS5 = ((CCDCAddCardHalfFragment) awS280S0300000_1.l1).iS();
                if (viewOnAttachStateChangeListenerC20604515jvIS5 != null) {
                    paddingRight = viewOnAttachStateChangeListenerC20604515jvIS5.getPaddingRight();
                }
                viewOnAttachStateChangeListenerC20604515jvIS2.setPadding(paddingLeft, paddingTop, paddingRight, ((C118300cf) awS280S0300000_1.l0).element);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS280S0300000_1 awS280S0300000_1, Object obj, Object obj2) {
        ((Boolean) obj).booleanValue();
        CCDCAddCardViewModel cCDCAddCardViewModel = (CCDCAddCardViewModel) awS280S0300000_1.l0;
        cCDCAddCardViewModel.VQ2((PaymentInfo) awS280S0300000_1.l1, cCDCAddCardViewModel.JQ2(), (List) awS280S0300000_1.l2, false);
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$8(kotlin.jvm.internal.AwS280S0300000_1 r7, java.lang.Object r8, java.lang.Object r9) {
        /*
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r6 = r8.booleanValue()
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r0 = r7.l0
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo r0 = (com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo) r0
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r1 = r0.paymentMethod
            if (r1 == 0) goto L16
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            r1.LJIIJ = r0
        L16:
            java.lang.Object r0 = r7.l0
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo r0 = (com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo) r0
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r1 = r0.paymentMethod
            if (r1 == 0) goto L24
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            r1.LJIJJLI = r0
        L24:
            com.bytedance.ies.abmock.SettingsManager r0 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()
            r0.getClass()
            java.lang.String r1 = "ec_payment_cci_bank_code_replace"
            r0 = 1
            boolean r0 = com.bytedance.ies.abmock.SettingsManager.LIZ(r1, r0)
            r4 = 0
            if (r0 == 0) goto L53
            java.lang.Object r0 = r7.l0
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo r0 = (com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo) r0
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r1 = r0.paymentMethod
            if (r1 == 0) goto L84
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentInfo r0 = r1.installmentInfo
            if (r0 == 0) goto L7f
            if (r1 == 0) goto L49
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentInfo r0 = r1.installmentInfo
            if (r0 == 0) goto L49
            r0.bankCode = r9
        L49:
            java.lang.Object r0 = r7.l0
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo r0 = (com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo) r0
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r0 = r0.paymentMethod
            if (r0 == 0) goto L53
            r0.LJIILJJIL = r9
        L53:
            java.lang.Object r2 = r7.l1
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.CCDCAddCardViewModel r2 = (com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.CCDCAddCardViewModel) r2
            java.lang.Object r1 = r7.l0
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo r1 = (com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo) r1
            r2.LLJLLIL = r1
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r0 = r1.paymentMethod
            if (r0 == 0) goto L63
            java.lang.String r4 = r0.id
        L63:
            boolean r0 = X.C03S8.LJIJJ(r4)
            kotlin.jvm.internal.AwS49S0310000_1 r3 = new kotlin.jvm.internal.AwS49S0310000_1
            java.lang.Object r4 = r7.l1
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.CCDCAddCardViewModel r4 = (com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.CCDCAddCardViewModel) r4
            java.lang.Object r5 = r7.l2
            kotlin.jvm.functions.Function2 r5 = (kotlin.jvm.functions.Function2) r5
            java.lang.Object r7 = r7.l0
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo r7 = (com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo) r7
            r8 = 2
            r3.<init>(r4, r5, r6, r7, r8)
            r2.WQ2(r1, r0, r3)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L7f:
            if (r1 == 0) goto L84
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentInfo> r0 = r1.installmentInfoList
            goto L85
        L84:
            r0 = r4
        L85:
            boolean r0 = X.C756302xN.LIZ(r0)
            if (r0 == 0) goto L49
            java.lang.Object r0 = r7.l0
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo r0 = (com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo) r0
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r3 = r0.paymentMethod
            if (r3 == 0) goto L49
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentInfo> r0 = r3.installmentInfoList
            if (r0 == 0) goto Lb7
            java.util.Iterator r2 = r0.iterator()
        L9b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto Lb5
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentInfo r0 = (com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentInfo) r0
            java.lang.String r0 = r0.bankCode
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r9)
            if (r0 == 0) goto L9b
        Lb0:
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentInfo r1 = (com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentInfo) r1
        Lb2:
            r3.installmentInfo = r1
            goto L49
        Lb5:
            r1 = r4
            goto Lb0
        Lb7:
            r1 = r4
            goto Lb2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS280S0300000_1.invoke$8(kotlin.jvm.internal.AwS280S0300000_1, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$9(AwS280S0300000_1 awS280S0300000_1, Object obj, Object obj2) {
        View currentFocus;
        C19EG activity;
        Window window;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int iIntValue = ((Number) obj2).intValue();
        EditText input = ((C939703lr) awS280S0300000_1.l0).getInput();
        Fragment fragment = (Fragment) awS280S0300000_1.l1;
        if (fragment != null && (activity = fragment.getActivity()) != null && (window = activity.getWindow()) != null) {
            currentFocus = window.getCurrentFocus();
        } else {
            currentFocus = null;
        }
        if (Intrinsics.LJFF(input, currentFocus)) {
            int[] iArr = new int[2];
            ((C939703lr) awS280S0300000_1.l0).getLocationInWindow(iArr);
            if (zBooleanValue && iIntValue < iArr[1] + ((C939703lr) awS280S0300000_1.l0).getMeasuredHeight()) {
                ((USCombinedSkuMainOrderCell) awS280S0300000_1.l2).T5().dT2((iArr[1] + ((C939703lr) awS280S0300000_1.l0).getMeasuredHeight()) - iIntValue);
            } else {
                ((USCombinedSkuMainOrderCell) awS280S0300000_1.l2).T5().dT2(0);
            }
        }
        ((USCombinedSkuMainOrderCell) awS280S0300000_1.l2).T5().LLJZIJLIL = zBooleanValue;
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS280S0300000_1(C118300cf c118300cf, CCDCAddCardHalfFragment cCDCAddCardHalfFragment, View view, int i) {
        super(2);
        this.$t = i;
        this.l0 = c118300cf;
        this.l1 = cCDCAddCardHalfFragment;
        this.l2 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS280S0300000_1(C259800zU c259800zU, C259800zU<String[]> c259800zU2, C04EM c04em, List<SkuItem> list) {
        super(2);
        this.$t = list;
        this.l0 = c259800zU;
        this.l1 = c259800zU2;
        this.l2 = c04em;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS280S0300000_1(C03PI c03pi, AwS12S0401000_1 awS12S0401000_1, PaymentInfo paymentInfo, int i) {
        super(2);
        this.$t = i;
        this.l0 = c03pi;
        this.l1 = awS12S0401000_1;
        this.l2 = paymentInfo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS280S0300000_1(C03ZB c03zb, PaymentInfoCell2 paymentInfoCell2, PaymentMethod paymentMethod, int i) {
        super(2);
        this.$t = i;
        this.l0 = c03zb;
        this.l1 = paymentInfoCell2;
        this.l2 = paymentMethod;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS280S0300000_1(C03ZD c03zd, InstallmentPlanListElementViewHolder installmentPlanListElementViewHolder, C862603Yq c862603Yq, int i) {
        super(2);
        this.$t = i;
        this.l0 = installmentPlanListElementViewHolder;
        this.l1 = c862603Yq;
        this.l2 = c03zd;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS280S0300000_1(C939703lr c939703lr, Fragment fragment, USCombinedSkuMainOrderCell uSCombinedSkuMainOrderCell, int i) {
        super(2);
        this.$t = i;
        this.l0 = c939703lr;
        this.l1 = fragment;
        this.l2 = uSCombinedSkuMainOrderCell;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS280S0300000_1(C1003103w5 c1003103w5, C19EG c19eg, ViewModel viewModel, int i) {
        super(2);
        this.$t = i;
        this.l0 = c1003103w5;
        this.l1 = c19eg;
        this.l2 = viewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS280S0300000_1(C0HZQ c0hzq, PlatformDiscountsCell platformDiscountsCell, PromotionCouponModule promotionCouponModule, int i) {
        super(2);
        this.$t = i;
        this.l0 = c0hzq;
        this.l1 = platformDiscountsCell;
        this.l2 = promotionCouponModule;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS280S0300000_1(MiniOspBottomWidget miniOspBottomWidget, View view, View view2, int i) {
        super(2);
        this.$t = i;
        this.l0 = miniOspBottomWidget;
        this.l1 = view;
        this.l2 = view2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS280S0300000_1(MiniOspPaymentInfoCell2 miniOspPaymentInfoCell2, C03ZB c03zb, PaymentMethod paymentMethod, int i) {
        super(2);
        this.$t = i;
        this.l0 = miniOspPaymentInfoCell2;
        this.l1 = c03zb;
        this.l2 = paymentMethod;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS280S0300000_1(OrderSubmitFragment orderSubmitFragment, Boolean bool, Integer num, int i) {
        super(2);
        this.$t = i;
        this.l0 = orderSubmitFragment;
        this.l1 = bool;
        this.l2 = num;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS280S0300000_1(CCDCAddCardViewModel cCDCAddCardViewModel, CCDCAddCardViewModel cCDCAddCardViewModel2, PaymentInfo paymentInfo, List<PaymentElement> list) {
        super(2);
        this.$t = list;
        this.l0 = cCDCAddCardViewModel;
        this.l1 = cCDCAddCardViewModel2;
        this.l2 = paymentInfo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS280S0300000_1(InstallmentInfosViewHolder installmentInfosViewHolder, C873103b7 c873103b7, C03ZD c03zd, int i) {
        super(2);
        this.$t = i;
        this.l0 = installmentInfosViewHolder;
        this.l1 = c03zd;
        this.l2 = c873103b7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS280S0300000_1(PaymentInfo paymentInfo, PaymentInfo paymentInfo2, CCDCAddCardViewModel cCDCAddCardViewModel, Function2<? super Boolean, ? super PaymentInfo, Unit> function2) {
        super(2);
        this.$t = function2;
        this.l0 = paymentInfo;
        this.l1 = paymentInfo2;
        this.l2 = cCDCAddCardViewModel;
    }
}
