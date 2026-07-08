package g1c;

import X.AbstractViewOnClickListenerC420730Ged;
import X.C049H;
import X.C1006203wa;
import X.C1010003xC;
import X.C1018503yZ;
import X.C1054104Ah;
import X.C1073204Hq;
import X.C1748720vbi;
import X.C719202rO;
import X.C7819033p;
import X.C7928037u;
import X.C812803Fm;
import X.C815203Gk;
import X.C877103bl;
import X.C877303bn;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.backup.BackupPaymentListFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRightDetail;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.review.impression.SeaPdpReviewFilterViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.userright.v3.SeaPdpRichText;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.productinterlink.ProductInterlinkItemVO;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewFilterStruct;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS367S0200000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public class AjS4S0201000_1 extends AbstractViewOnClickListenerC420730Ged {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

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
            default:
                super.LIZ(view);
                break;
        }
    }

    public static final void LIZ$0(AjS4S0201000_1 ajS4S0201000_1, View view) {
        if (view != null && Intrinsics.LJFF(((C719202rO) ajS4S0201000_1.l0).LLJ, Boolean.TRUE)) {
            C7928037u c7928037u = C7928037u.LIZ;
            C719202rO c719202rO = (C719202rO) ajS4S0201000_1.l0;
            int i = ajS4S0201000_1.i2;
            OrderSubmitAssemViewModel orderSubmitAssemViewModel = ((C815203Gk) ajS4S0201000_1.l1).LLILLJJLI;
            c7928037u.getClass();
            C7928037u.LIZIZ(view, c719202rO, i, orderSubmitAssemViewModel, "item_details");
        }
    }

    public static final void LIZ$1(AjS4S0201000_1 ajS4S0201000_1, View view) {
        if (view != null) {
            BackupPaymentListFragment backupPaymentListFragment = (BackupPaymentListFragment) ajS4S0201000_1.l0;
            backupPaymentListFragment.LLJ = "next";
            C877303bn c877303bn = backupPaymentListFragment.LLILZLL;
            PaymentMethod paymentMethod = (PaymentMethod) ajS4S0201000_1.l1;
            int i = ajS4S0201000_1.i2;
            LinkedHashMap linkedHashMapLIZ = C877103bl.LIZ(c877303bn);
            linkedHashMapLIZ.put("page_name", "add_a_backup_payment");
            linkedHashMapLIZ.put("previous_page", c877303bn.LIZ);
            linkedHashMapLIZ.put("option_type", "payment_type");
            linkedHashMapLIZ.put("option_name", paymentMethod.LJJIIZ());
            linkedHashMapLIZ.put("rank", Integer.valueOf(i));
            String str = paymentMethod.id;
            if (str == null) {
                str = "";
            }
            linkedHashMapLIZ.put("payment_method_id", str);
            C1018503yZ.LIZIZ("tiktokec_select_option", linkedHashMapLIZ, true);
            C877303bn c877303bn2 = ((BackupPaymentListFragment) ajS4S0201000_1.l0).LLILZLL;
            LinkedHashMap linkedHashMapLIZ2 = C877103bl.LIZ(c877303bn2);
            linkedHashMapLIZ2.put("page_name", "add_a_backup_payment");
            linkedHashMapLIZ2.put("previous_page", c877303bn2.LIZ);
            linkedHashMapLIZ2.put("button_name", "enable_backup_payment");
            linkedHashMapLIZ2.put("button_type", "backup_payment");
            C1018503yZ.LIZIZ("tiktokec_button_click", linkedHashMapLIZ2, true);
            BackupPaymentListFragment backupPaymentListFragment2 = (BackupPaymentListFragment) ajS4S0201000_1.l0;
            Function2<? super PaymentMethod, ? super BackupPaymentListFragment, Unit> function2 = backupPaymentListFragment2.LLIZ;
            if (function2 != null) {
                function2.invoke((PaymentMethod) ajS4S0201000_1.l1, backupPaymentListFragment2);
            }
        }
    }

    public static final void LIZ$2(AjS4S0201000_1 ajS4S0201000_1, View view) {
        if (view != null) {
            ((C1006203wa) ajS4S0201000_1.l0).LLILLJJLI.invoke(Integer.valueOf(ajS4S0201000_1.i2), (SeaPdpRichText) ajS4S0201000_1.l1);
        }
    }

    public static final void LIZ$3(AjS4S0201000_1 ajS4S0201000_1, View view) {
        String string;
        if (view != null && !((SeaPdpReviewFilterViewHolder) ajS4S0201000_1.l0).c6().LLLLLJLJLL.LIZ()) {
            C1073204Hq c1073204Hq = ((SeaPdpReviewFilterViewHolder) ajS4S0201000_1.l0).c6().LLLLLJLJLL;
            ReviewFilterStruct reviewFilterStruct = (ReviewFilterStruct) ajS4S0201000_1.l1;
            String str = reviewFilterStruct.filterId;
            String str2 = reviewFilterStruct.nameEng;
            Integer num = reviewFilterStruct.type;
            if (num != null) {
                string = num.toString();
            } else {
                string = null;
            }
            C1073204Hq.LIZJ(c1073204Hq, view, "review_entrance", "impression_tag", null, str, str2, string, ((ReviewFilterStruct) ajS4S0201000_1.l1).count, 1, ((SeaPdpReviewFilterViewHolder) ajS4S0201000_1.l0).c6().LLLLL.LJIIIZ(), null, 7168);
            C1054104Ah c1054104Ah = ((SeaPdpReviewFilterViewHolder) ajS4S0201000_1.l0).c6().LLJLIL;
            if (c1054104Ah != null) {
                c1054104Ah.LJIJJ(ajS4S0201000_1.i2, (ReviewFilterStruct) ajS4S0201000_1.l1, "review_entrance");
            }
        }
    }

    public static final void LIZ$4(AjS4S0201000_1 ajS4S0201000_1, View view) {
        if (view != null) {
            ((C1010003xC) ajS4S0201000_1.l0).LLILLJJLI.j4(ajS4S0201000_1.i2, (ProductInterlinkItemVO) ajS4S0201000_1.l1);
        }
    }

    public static final void LIZ$5(AjS4S0201000_1 ajS4S0201000_1, View view) {
        if (view != null) {
            String str = ((UserRightDetail) ListProtector.get(((C812803Fm) ajS4S0201000_1.l0).LLILLJJLI, ajS4S0201000_1.i2)).schema;
            HashMap<String, Object> map = ((C812803Fm) ajS4S0201000_1.l0).LLILZ;
            if (str != null && map != null) {
                C7819033p c7819033p = C7819033p.LIZ;
                Context context = ((ViewGroup) ajS4S0201000_1.l1).getContext();
                c7819033p.getClass();
                C7819033p.LIZIZ(context, str, map);
            }
            C812803Fm c812803Fm = (C812803Fm) ajS4S0201000_1.l0;
            C1748720vbi.LIZLLL((ViewGroup) ajS4S0201000_1.l1, new C049H(), new AwS367S0200000_1(c812803Fm, (UserRightDetail) ListProtector.get(c812803Fm.LLILLJJLI, ajS4S0201000_1.i2), 380));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AjS4S0201000_1(Object obj, Object obj2, int i, int i2) {
        super(700L);
        this.$t = i2;
        this.l0 = obj;
        this.l1 = obj2;
        this.i2 = i;
    }
}
