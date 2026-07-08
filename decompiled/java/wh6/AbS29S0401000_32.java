package wh6;

import X.AbstractViewOnClickListenerC1637610siV;
import X.C18MZ;
import X.C21271018Ma;
import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfoModel;
import org.json.JSONException;

/* JADX INFO: loaded from: classes33.dex */
public class AbS29S0401000_32 extends AbstractViewOnClickListenerC1637610siV {
    public final int $t;
    public int i4;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // X.AbstractViewOnClickListenerC1637610siV
    public final void LIZ(View view) throws JSONException {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    public static final void LIZ$0(AbS29S0401000_32 abS29S0401000_32, View view) throws JSONException {
        ((C18MZ) abS29S0401000_32.l0).LLLIIIIL().LIZ((View) abS29S0401000_32.l1, abS29S0401000_32.i4, (AnchorProductInfoModel) abS29S0401000_32.l2, (C21271018Ma) abS29S0401000_32.l3, "see_more_detail_button");
    }

    public static final void LIZ$1(AbS29S0401000_32 abS29S0401000_32, View view) throws JSONException {
        ((C18MZ) abS29S0401000_32.l0).LLLIIIIL().LIZ((View) abS29S0401000_32.l1, abS29S0401000_32.i4, (AnchorProductInfoModel) abS29S0401000_32.l2, (C21271018Ma) abS29S0401000_32.l3, "see_more_detail_link");
    }

    public AbS29S0401000_32(C18MZ c18mz, View view, int i, AnchorProductInfoModel anchorProductInfoModel, C21271018Ma c21271018Ma, int i2) {
        this.$t = i2;
        this.l0 = c18mz;
        this.l1 = view;
        this.i4 = i;
        this.l2 = anchorProductInfoModel;
        this.l3 = c21271018Ma;
    }
}
