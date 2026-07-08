package kotlin.jvm.internal;

import X.C04BX;
import X.C04DL;
import X.C09AY;
import X.C1054004Ag;
import X.C19EG;
import X.C20691715xz;
import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.header.PdpHeadNavBarWidget;
import com.ss.android.ugc.aweme.ecommerce.base.sku.assem.SkuBottomAssem;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public class AwS141S0101000_1 extends C09AY implements Function0 {
    public final int $t;
    public int i1;
    public Object l0;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS141S0101000_1 awS141S0101000_1) {
        LinearLayoutManager linearLayoutManager;
        RecyclerView.LayoutManager layoutManager = ((C20691715xz) awS141S0101000_1.l0).getLayoutManager();
        if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
            linearLayoutManager.scrollToPositionWithOffset(awS141S0101000_1.i1, 0);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS141S0101000_1 awS141S0101000_1) {
        C04BX c04bxLIZ;
        String str;
        C04DL c04dl = (C04DL) awS141S0101000_1.l0;
        if (c04dl == null || (c04bxLIZ = c04dl.LIZ()) == null || (str = c04bxLIZ.LIZ) == null) {
            return String.valueOf(awS141S0101000_1.i1);
        }
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$2(kotlin.jvm.internal.AwS141S0101000_1 r18) {
        /*
            Method dump skipped, instruction units count: 499
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS141S0101000_1.invoke$2(kotlin.jvm.internal.AwS141S0101000_1):java.lang.Object");
    }

    public static final Object invoke$3(AwS141S0101000_1 awS141S0101000_1) {
        final Context context = (Context) awS141S0101000_1.l0;
        final int i = awS141S0101000_1.i1;
        return new LinearLayout(context, i) { // from class: X.03Eh
            {
                super(context, null, 0);
                setOrientation(1);
                C786410Ut5.LJLLJ(context, R.layout.a1a, this);
                if (i == 323) {
                    TextView textView = (TextView) findViewById(R.id.i0q);
                    if (textView != null) {
                        textView.setText(context.getString(2131824818));
                    }
                    TextView textView2 = (TextView) findViewById(R.id.uhp);
                    if (textView2 != null) {
                        textView2.setText(context.getString(2131824819));
                    }
                }
            }
        };
    }

    public static final Object invoke$4(AwS141S0101000_1 awS141S0101000_1) {
        C1054004Ag c1054004Ag = ((PdpHeadNavBarWidget) awS141S0101000_1.l0).LJIJI().LLJLILLLLZIIL;
        if (c1054004Ag != null) {
            C1054004Ag.LJIILL(c1054004Ag, ((PdpHeadNavBarWidget) awS141S0101000_1.l0).LJIJI().LLJIJIL, awS141S0101000_1.i1, "icon", ((PdpHeadNavBarWidget) awS141S0101000_1.l0).LJIJI().LLILZIL.LJ("c35259.d6786"));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS141S0101000_1(int i, C04DL c04dl, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c04dl;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS141S0101000_1(C20691715xz c20691715xz, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c20691715xz;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS141S0101000_1(C19EG c19eg, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c19eg;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS141S0101000_1(PdpHeadNavBarWidget pdpHeadNavBarWidget, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = pdpHeadNavBarWidget;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS141S0101000_1(SkuBottomAssem skuBottomAssem, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = skuBottomAssem;
        this.i1 = i;
    }
}
