package wh6;

import X.AbstractViewOnClickListenerC1637610siV;
import X.C1161920gLG;
import X.C1850820yGO;
import X.C1850830yGP;
import android.content.Context;
import android.view.View;
import com.bytedance.android.live.browser.IHybridContainerService;

/* JADX INFO: loaded from: classes28.dex */
public class AbS207S1100000_27 extends AbstractViewOnClickListenerC1637610siV {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // X.AbstractViewOnClickListenerC1637610siV
    public final void LIZ(View view) {
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

    public static final void LIZ$0(AbS207S1100000_27 abS207S1100000_27, View view) {
        Context context;
        if (view != null) {
            String str = abS207S1100000_27.s0;
            if (str != null && str.length() > 0 && (context = ((C1850830yGP) abS207S1100000_27.l1).getContext()) != null) {
                ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).YC1(context, str, null);
            }
            ((C1850830yGP) abS207S1100000_27.l1).LIZJ(-1, "click_head_image");
            ((C1850830yGP) abS207S1100000_27.l1).getClass();
            C1850830yGP.LIZ();
        }
    }

    public static final void LIZ$1(AbS207S1100000_27 abS207S1100000_27, View view) {
        Context context;
        if (view != null) {
            String str = abS207S1100000_27.s0;
            if (str != null && str.length() > 0 && (context = ((C1850820yGO) abS207S1100000_27.l1).getContext()) != null) {
                ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).YC1(context, str, null);
            }
            ((C1850820yGO) abS207S1100000_27.l1).LIZ(-1, "click_head_image");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbS207S1100000_27(String str, Object obj, int i) {
        super(300L);
        this.$t = i;
        this.s0 = str;
        this.l1 = obj;
    }
}
