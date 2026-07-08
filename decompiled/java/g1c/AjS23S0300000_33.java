package g1c;

import X.AbstractViewOnClickListenerC420730Ged;
import X.C1A0V;
import X.C719302rP;
import X.InterfaceC2217461Bqa;
import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.combinesku.sku.view.OspExpandableSpecCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.combinesku.sku.view.OspImageSpecCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.combinesku.sku.view.OspImageWithTextSpecCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.combinesku.sku.view.OspTextSpecCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.aggregation.USAggregationOrderCell;

/* JADX INFO: loaded from: classes34.dex */
public class AjS23S0300000_33 extends AbstractViewOnClickListenerC420730Ged {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

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

    public static final void LIZ$0(AjS23S0300000_33 ajS23S0300000_33, View view) {
        if (view != null) {
            USAggregationOrderCell uSAggregationOrderCell = (USAggregationOrderCell) ajS23S0300000_33.l0;
            View view2 = (View) ajS23S0300000_33.l1;
            C719302rP c719302rP = (C719302rP) ajS23S0300000_33.l2;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = USAggregationOrderCell.LLJJI;
            uSAggregationOrderCell.P5(view2, c719302rP, "x_items");
        }
    }

    public static final void LIZ$1(AjS23S0300000_33 ajS23S0300000_33, View view) {
        if (view != null) {
            USAggregationOrderCell uSAggregationOrderCell = (USAggregationOrderCell) ajS23S0300000_33.l0;
            View view2 = (View) ajS23S0300000_33.l1;
            C719302rP c719302rP = (C719302rP) ajS23S0300000_33.l2;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = USAggregationOrderCell.LLJJI;
            uSAggregationOrderCell.P5(view2, c719302rP, "x_items");
        }
    }

    public static final void LIZ$2(AjS23S0300000_33 ajS23S0300000_33, View view) {
        C1A0V c1a0v;
        if (view != null && (c1a0v = (C1A0V) ajS23S0300000_33.l0) != null) {
            c1a0v.LJJIFFI(((OspExpandableSpecCell) ajS23S0300000_33.l1).getLayoutPosition(), ajS23S0300000_33.l2);
        }
    }

    public static final void LIZ$3(AjS23S0300000_33 ajS23S0300000_33, View view) {
        C1A0V c1a0v;
        if (view != null && (c1a0v = (C1A0V) ajS23S0300000_33.l0) != null) {
            c1a0v.LJJIFFI(((OspImageSpecCell) ajS23S0300000_33.l1).getLayoutPosition(), ajS23S0300000_33.l2);
        }
    }

    public static final void LIZ$4(AjS23S0300000_33 ajS23S0300000_33, View view) {
        C1A0V c1a0v;
        if (view != null && (c1a0v = (C1A0V) ajS23S0300000_33.l0) != null) {
            c1a0v.LJJIFFI(((OspImageWithTextSpecCell) ajS23S0300000_33.l1).getLayoutPosition(), ajS23S0300000_33.l2);
        }
    }

    public static final void LIZ$5(AjS23S0300000_33 ajS23S0300000_33, View view) {
        C1A0V c1a0v;
        if (view != null && (c1a0v = (C1A0V) ajS23S0300000_33.l0) != null) {
            c1a0v.LJJIFFI(((OspTextSpecCell) ajS23S0300000_33.l1).getLayoutPosition(), ajS23S0300000_33.l2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AjS23S0300000_33(Object obj, Object obj2, Object obj3, int i) {
        super(700L);
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
