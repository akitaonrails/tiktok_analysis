package kotlin.jvm.internal;

import X.C03DZ;
import X.C03PI;
import X.C09AY;
import X.C1002803w2;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C1763620vzk;
import X.C19EG;
import X.C419910GdJ;
import X.C430120Gtm;
import X.C867003a8;
import X.C875203bS;
import X.C875803bY;
import X.C877103bl;
import X.C877303bn;
import X.C953803o8;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.payment.PaymentInfoViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.seaonestep.productinfo.SeaOneStepProductInfoAssem;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.payment.USPaymentInfoCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentHalfFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.payment.viewholder.cashier.BackupPaymentEntryVH;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public class AwS162S0400000_1 extends C09AY implements Function2 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS162S0400000_1 awS162S0400000_1, Object obj, Object obj2) {
        View viewFindViewById;
        C1749280vcc c1749280vcc;
        View view;
        int iIntValue = ((Number) obj2).intValue();
        C1002803w2 c1002803w2 = (C1002803w2) awS162S0400000_1.l0;
        Fragment fragment = (Fragment) awS162S0400000_1.l1;
        C19EG c19eg = (C19EG) awS162S0400000_1.l2;
        AwS402S0200000_1 awS402S0200000_1 = new AwS402S0200000_1((ViewModel) awS162S0400000_1.l3, c19eg, 8);
        c1002803w2.getClass();
        if (iIntValue == 4) {
            if (fragment == null || (view = fragment.getView()) == null || (viewFindViewById = view.findViewById(R.id.w0t)) == null) {
                viewFindViewById = c19eg.findViewById(R.id.w0t);
            }
            if ((viewFindViewById instanceof C1749280vcc) && (c1749280vcc = (C1749280vcc) viewFindViewById) != null) {
                C1722300uv6 c1722300uv6 = new C1722300uv6();
                c1722300uv6.LJI = c19eg.getString(2131848086);
                c1722300uv6.LJIIIIZZ = c19eg.getString(2131848085);
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = R.raw.icon_large_unavailable_region;
                c419910GdJ.LJ = Integer.valueOf(R.attr.a1p);
                c1722300uv6.LIZJ = 0;
                c1722300uv6.LIZIZ = c419910GdJ;
                c1722300uv6.LJIIIZ = new AwS580S0100000_1(awS402S0200000_1, 533);
                c1749280vcc.setStatus(c1722300uv6);
                C03DZ.LIZJ(c1749280vcc);
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(kotlin.jvm.internal.AwS162S0400000_1 r19, java.lang.Object r20, java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS162S0400000_1.invoke$1(kotlin.jvm.internal.AwS162S0400000_1, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$2(AwS162S0400000_1 awS162S0400000_1, Object obj, Object obj2) {
        FragmentManager supportFragmentManager;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        Function1 function1 = (Function1) obj2;
        C19EG c19eg = (C19EG) awS162S0400000_1.l0;
        if (c19eg != null && (supportFragmentManager = c19eg.getSupportFragmentManager()) != null) {
            C877103bl.LIZJ(C867003a8.LIZ((C867003a8) awS162S0400000_1.l1, zBooleanValue, null, 119), (C877303bn) awS162S0400000_1.l2);
            C875203bS c875203bS = C875203bS.LIZ;
            Context context = ((USPaymentInfoCell) awS162S0400000_1.l3).itemView.getContext();
            OrderSubmitAssemViewModel orderSubmitAssemViewModelT5 = ((USPaymentInfoCell) awS162S0400000_1.l3).T5();
            PaymentInfoViewModel paymentInfoViewModelS5 = ((USPaymentInfoCell) awS162S0400000_1.l3).S5();
            C867003a8 c867003a8 = (C867003a8) awS162S0400000_1.l1;
            Boolean boolValueOf = Boolean.valueOf(zBooleanValue);
            C877303bn c877303bn = (C877303bn) awS162S0400000_1.l2;
            c875203bS.getClass();
            C875203bS.LJFF(C875203bS.LIZJ(context, supportFragmentManager, orderSubmitAssemViewModelT5, paymentInfoViewModelS5, c867003a8, boolValueOf, c877303bn, function1));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS162S0400000_1 awS162S0400000_1, Object obj, Object obj2) {
        String string;
        if (((Boolean) obj).booleanValue()) {
            ((C03PI) awS162S0400000_1.l0).LJII((PaymentInfo) awS162S0400000_1.l1, null, (Boolean) awS162S0400000_1.l2, ((PaymentHalfFragment) awS162S0400000_1.l3).getView(), new AwS545S0100000_1((PaymentHalfFragment) awS162S0400000_1.l3, 937));
        } else {
            C03PI c03pi = (C03PI) awS162S0400000_1.l0;
            Resources resources = c03pi.LIZ.getResources();
            if (resources != null) {
                string = resources.getString(2131832779);
            } else {
                string = null;
            }
            c03pi.LJIIJ(string);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS162S0400000_1 awS162S0400000_1, Object obj, Object obj2) {
        PaymentMethod paymentMethod = (PaymentMethod) obj;
        C875203bS c875203bS = C875203bS.LIZ;
        Context contextRequireContext = ((Fragment) obj2).requireContext();
        AwS245S0300000_1 awS245S0300000_1 = new AwS245S0300000_1((PaymentViewModel) awS162S0400000_1.l1, paymentMethod, (LifecycleOwner) awS162S0400000_1.l2, 17);
        AwS402S0200000_1 awS402S0200000_1 = new AwS402S0200000_1((PaymentViewModel) awS162S0400000_1.l1, (Context) awS162S0400000_1.l3, paymentMethod, 43);
        C875803bY c875803bY = (C875803bY) awS162S0400000_1.l0;
        c875203bS.getClass();
        C875203bS.LIZ(contextRequireContext, paymentMethod, awS245S0300000_1, awS402S0200000_1, c875803bY);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS162S0400000_1 awS162S0400000_1, Object obj, Object obj2) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        C877103bl.LIZJ((C867003a8) awS162S0400000_1.l0, (C877303bn) awS162S0400000_1.l1);
        C875203bS c875203bS = C875203bS.LIZ;
        Context context = ((BackupPaymentEntryVH) awS162S0400000_1.l2).itemView.getContext();
        FragmentManager fragmentManager = (FragmentManager) awS162S0400000_1.l3;
        BackupPaymentEntryVH backupPaymentEntryVH = (BackupPaymentEntryVH) awS162S0400000_1.l2;
        LifecycleOwner lifecycleOwner = backupPaymentEntryVH.LLJILJIL;
        PaymentViewModel paymentViewModelW5 = backupPaymentEntryVH.W5();
        C867003a8 c867003a8 = (C867003a8) awS162S0400000_1.l0;
        Boolean boolValueOf = Boolean.valueOf(zBooleanValue);
        C877303bn c877303bn = (C877303bn) awS162S0400000_1.l1;
        c875203bS.getClass();
        C875203bS.LJFF(C875203bS.LIZIZ(context, fragmentManager, lifecycleOwner, paymentViewModelW5, c867003a8, boolValueOf, c877303bn, (Function1) obj2));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS162S0400000_1(C03PI c03pi, PaymentInfo paymentInfo, Boolean bool, PaymentHalfFragment paymentHalfFragment, int i) {
        super(2);
        this.$t = i;
        this.l0 = c03pi;
        this.l1 = paymentInfo;
        this.l2 = bool;
        this.l3 = paymentHalfFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS162S0400000_1(C867003a8 c867003a8, C877303bn c877303bn, BackupPaymentEntryVH backupPaymentEntryVH, FragmentManager fragmentManager, int i) {
        super(2);
        this.$t = i;
        this.l0 = c867003a8;
        this.l1 = c877303bn;
        this.l2 = backupPaymentEntryVH;
        this.l3 = fragmentManager;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS162S0400000_1(C875803bY c875803bY, PaymentViewModel paymentViewModel, LifecycleOwner lifecycleOwner, Context context, int i) {
        super(2);
        this.$t = i;
        this.l0 = c875803bY;
        this.l1 = paymentViewModel;
        this.l2 = lifecycleOwner;
        this.l3 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS162S0400000_1(C1002803w2 c1002803w2, Fragment fragment, C19EG c19eg, ViewModel viewModel, int i) {
        super(2);
        this.$t = i;
        this.l0 = c1002803w2;
        this.l1 = fragment;
        this.l2 = c19eg;
        this.l3 = viewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS162S0400000_1(C19EG c19eg, C867003a8 c867003a8, C877303bn c877303bn, USPaymentInfoCell uSPaymentInfoCell, int i) {
        super(2);
        this.$t = i;
        this.l0 = c19eg;
        this.l1 = c867003a8;
        this.l2 = c877303bn;
        this.l3 = uSPaymentInfoCell;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS162S0400000_1(SeaOneStepProductInfoAssem seaOneStepProductInfoAssem, C1763620vzk c1763620vzk, C953803o8 c953803o8, C430120Gtm c430120Gtm, int i) {
        super(2);
        this.$t = i;
        this.l0 = seaOneStepProductInfoAssem;
        this.l1 = c1763620vzk;
        this.l2 = c953803o8;
        this.l3 = c430120Gtm;
    }
}
