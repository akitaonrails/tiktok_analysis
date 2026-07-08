package g1c;

import X.AbstractViewOnClickListenerC420730Ged;
import X.AnonymousClass0376;
import X.C03I0;
import X.C03JR;
import X.C049Y;
import X.C049Z;
import X.C10516049i;
import X.C1533950q1J;
import X.C1748720vbi;
import X.C714302qb;
import X.C7969039j;
import X.C7976039q;
import X.C7977039r;
import X.C7979039t;
import X.C808003Dq;
import X.C913103hZ;
import X.InterfaceC1631620sYq;
import X.InterfaceC497601wk;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.address.OspAddressCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.combinesku.mainorder.USCombinedSkuMainOrderCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillItem;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.IdentityInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.RecipientIdentityInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRightDetail;
import com.ss.android.ugc.aweme.ecommerce.base.sku.BaseSkuFragment;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS245S0300000_1;
import kotlin.jvm.internal.AwS367S0200000_1;
import kotlin.jvm.internal.AwS471S0200000_1;
import kotlin.jvm.internal.AwS56S0210000_1;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes2.dex */
public class AjS1S0500000_1 extends AbstractViewOnClickListenerC420730Ged {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

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

    public static final void LIZ$0(AjS1S0500000_1 ajS1S0500000_1, View view) {
        if (view != null) {
            C03JR c03jr = (C03JR) ajS1S0500000_1.l0;
            if (!c03jr.LLJJIII) {
                if (c03jr.getNoPudoAddress()) {
                    InterfaceC1631620sYq interfaceC1631620sYq = (InterfaceC1631620sYq) ajS1S0500000_1.l1;
                    if (interfaceC1631620sYq != null) {
                        interfaceC1631620sYq.invoke(((C03JR) ajS1S0500000_1.l0).getTitleContainer(), ((AnonymousClass0376) ajS1S0500000_1.l2).LLLII, null);
                        return;
                    }
                    return;
                }
                ((C03JR) ajS1S0500000_1.l0).h0((AnonymousClass0376) ajS1S0500000_1.l2, (OrderSubmitAssemViewModel) ajS1S0500000_1.l3, "select", Boolean.FALSE);
                Function1 function1 = (Function1) ajS1S0500000_1.l4;
                if (function1 == null) {
                    return;
                }
                function1.invoke(Boolean.valueOf(((C03JR) ajS1S0500000_1.l0).LLJJIII));
            }
        }
    }

    public static final void LIZ$1(AjS1S0500000_1 ajS1S0500000_1, View view) {
        if (view != null && ((Context) ajS1S0500000_1.l0) != null) {
            Context context = (Context) ajS1S0500000_1.l0;
            if (((FragmentManager) ajS1S0500000_1.l1) != null) {
                ((Function1) ajS1S0500000_1.l4).invoke(C913103hZ.LIZJ(context, (FragmentManager) ajS1S0500000_1.l1, (TuxSheet) ajS1S0500000_1.l2, (InterfaceC497601wk) ajS1S0500000_1.l3));
            }
        }
    }

    public static final void LIZ$2(AjS1S0500000_1 ajS1S0500000_1, View view) {
        String identityInfoCollectionPageSchema;
        if (view != null) {
            C03I0 c03i0 = C03I0.LIZ;
            IdentityInfo identityInfo = (IdentityInfo) ajS1S0500000_1.l0;
            ((OspAddressCell) ajS1S0500000_1.l1).L5();
            Context context = ((View) ajS1S0500000_1.l2).getContext();
            LinearLayout linearLayout = (LinearLayout) ajS1S0500000_1.l3;
            HashMap map = (HashMap) ajS1S0500000_1.l4;
            c03i0.getClass();
            RecipientIdentityInfo recipientIdentityInfo = identityInfo.getRecipientIdentityInfo();
            if (recipientIdentityInfo != null && (identityInfoCollectionPageSchema = recipientIdentityInfo.getIdentityInfoCollectionPageSchema()) != null && C1533950q1J.LJ(identityInfoCollectionPageSchema) && !a0.LJJJIL(identityInfoCollectionPageSchema)) {
                SmartRouter.buildRoute(context, identityInfoCollectionPageSchema).open();
            }
            C1748720vbi.LIZLLL(linearLayout, new C10516049i(), new AwS580S0100000_1(map, (Map<Integer, String>) 442));
        }
    }

    public static final void LIZ$3(AjS1S0500000_1 ajS1S0500000_1, View view) {
        int i;
        List<BillItem> list;
        if (view != null) {
            C7969039j c7969039j = C7969039j.LIZ;
            c7969039j.getClass();
            Map<Integer, Boolean> map = C7969039j.LIZIZ;
            Boolean bool = (Boolean) ((LinkedHashMap) map).get(((C714302qb) ajS1S0500000_1.l0).LJIIIIZZ);
            if (bool != null) {
                boolean zBooleanValue = bool.booleanValue();
                C1748720vbi.LIZLLL(((C7977039r) ajS1S0500000_1.l1).LLIZ, new C049Y(), new AwS56S0210000_1((Map) ajS1S0500000_1.l4, (Map<String, Object>) zBooleanValue, (boolean) ajS1S0500000_1.l3, (C7976039q) 10));
                if (!zBooleanValue) {
                    list = ((C714302qb) ajS1S0500000_1.l0).LJIIJ;
                    i = R.raw.icon_chevron_up;
                } else {
                    i = R.raw.icon_chevron_down;
                    list = null;
                }
                ((C7977039r) ajS1S0500000_1.l2).LLILZLL.setIconRes(i);
                C7977039r c7977039r = (C7977039r) ajS1S0500000_1.l1;
                LinearLayout linearLayout = c7977039r.LLILZ;
                View view2 = c7977039r.LLILZIL;
                C7976039q c7976039q = (C7976039q) ajS1S0500000_1.l3;
                BaseSkuFragment<?> baseSkuFragment = c7976039q.LLILZ;
                String str = c7976039q.LLILZLL;
                c7969039j.getClass();
                C7969039j.LIZIZ(linearLayout, view2, list, null, baseSkuFragment, str, null);
                map.put(((C714302qb) ajS1S0500000_1.l0).LJIIIIZZ, Boolean.valueOf(!zBooleanValue));
            }
        }
    }

    public static final void LIZ$4(AjS1S0500000_1 ajS1S0500000_1, View view) {
        FragmentManager fragmentManager;
        if (view != null) {
            View view2 = ((C7976039q) ajS1S0500000_1.l0).LLILLL;
            if (view2 != null) {
                C1748720vbi.LIZLLL(view2, new C049Y(), new AwS367S0200000_1((Map) ajS1S0500000_1.l1, (Map<String, Object>) ajS1S0500000_1.l0, (C7976039q) 228));
            }
            BaseSkuFragment<?> baseSkuFragment = ((C7976039q) ajS1S0500000_1.l0).LLILZ;
            if (baseSkuFragment != null && (fragmentManager = baseSkuFragment.getFragmentManager()) != null) {
                C808003Dq.LJFF(C808003Dq.LIZLLL(C808003Dq.LIZJ(((C7977039r) ajS1S0500000_1.l2).itemView.getContext(), (C7979039t) ajS1S0500000_1.l3), ((C714302qb) ajS1S0500000_1.l4).LIZ, false, null, 60), fragmentManager, null, new AwS245S0300000_1((C7977039r) ajS1S0500000_1.l2, (C714302qb) ajS1S0500000_1.l4, (C7976039q) ajS1S0500000_1.l0, 27), 4);
            }
        }
    }

    public static final void LIZ$5(AjS1S0500000_1 ajS1S0500000_1, View view) {
        if (view != null) {
            C1748720vbi.LIZLLL((View) ajS1S0500000_1.l0, new C049Y(), new AwS580S0100000_1((UserRightDetail) ajS1S0500000_1.l2, 631));
            FragmentManager fragmentManager = ((Fragment) ajS1S0500000_1.l1).getFragmentManager();
            if (fragmentManager != null) {
                USCombinedSkuMainOrderCell uSCombinedSkuMainOrderCell = (USCombinedSkuMainOrderCell) ajS1S0500000_1.l3;
                UserRightDetail userRightDetail = (UserRightDetail) ajS1S0500000_1.l2;
                HashMap map = (HashMap) ajS1S0500000_1.l4;
                TuxTextView tuxTextViewLJ = C808003Dq.LJ(uSCombinedSkuMainOrderCell.itemView.getContext(), R.attr.a1h, 51, userRightDetail.description);
                String str = userRightDetail.name;
                if (str == null) {
                    str = "";
                }
                C808003Dq.LJFF(C808003Dq.LIZLLL(tuxTextViewLJ, str, false, new AwS471S0200000_1(uSCombinedSkuMainOrderCell, (USCombinedSkuMainOrderCell) map, (HashMap<String, Object>) 18), 28), fragmentManager, "tag_free_return", null, 8);
                C1748720vbi.LIZLLL((View) ajS1S0500000_1.l0, new C049Z(), new AwS580S0100000_1((HashMap) ajS1S0500000_1.l4, (HashMap<String, Object>) 632));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AjS1S0500000_1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        super(700L);
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
        this.l4 = obj5;
    }
}
