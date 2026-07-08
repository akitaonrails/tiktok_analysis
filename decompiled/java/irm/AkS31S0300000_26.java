package irm;

import X.AbstractViewOnClickListenerC1173120gdK;
import X.C04AS;
import X.C1763850w07;
import android.view.View;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.TryOnData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import java.util.Map;

/* JADX INFO: loaded from: classes27.dex */
public class AkS31S0300000_26 extends AbstractViewOnClickListenerC1173120gdK {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.AbstractViewOnClickListenerC1173120gdK
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
            default:
                super.LIZ(view);
                break;
        }
    }

    public static final void LIZ$0(AkS31S0300000_26 akS31S0300000_26, View view) {
        C1763850w07 c1763850w07 = (C1763850w07) akS31S0300000_26.l0;
        TryOnData tryOnData = c1763850w07.LIZ;
        PdpViewModel pdpViewModel = c1763850w07.LIZIZ;
        C04AS c04as = new C04AS(tryOnData, pdpViewModel.LLJJ, pdpViewModel, pdpViewModel.LLILZIL, null, "c2087.d49471", ((FrameLayout) akS31S0300000_26.l1).getContext(), null, ((C1763850w07) akS31S0300000_26.l0).LIZJ, "last_image_click_to_change_color", null, null, null, 7312);
        c04as.LIZLLL("1");
        C04AS.LJ(c04as, (Map) akS31S0300000_26.l2, "main_pic");
    }

    public static final void LIZ$1(AkS31S0300000_26 akS31S0300000_26, View view) {
        C1763850w07 c1763850w07 = (C1763850w07) akS31S0300000_26.l0;
        TryOnData tryOnData = c1763850w07.LIZ;
        PdpViewModel pdpViewModel = c1763850w07.LIZIZ;
        C04AS c04as = new C04AS(tryOnData, pdpViewModel.LLJJ, pdpViewModel, pdpViewModel.LLILZIL, null, "c2087.d49471", ((FrameLayout) akS31S0300000_26.l1).getContext(), null, ((C1763850w07) akS31S0300000_26.l0).LIZJ, "last_image_blank", null, null, null, 7312);
        c04as.LIZLLL(null);
        C04AS.LJ(c04as, (Map) akS31S0300000_26.l2, "main_pic");
    }

    public static final void LIZ$2(AkS31S0300000_26 akS31S0300000_26, View view) {
        C1763850w07 c1763850w07 = (C1763850w07) akS31S0300000_26.l0;
        TryOnData tryOnData = c1763850w07.LIZ;
        PdpViewModel pdpViewModel = c1763850w07.LIZIZ;
        C04AS c04as = new C04AS(tryOnData, pdpViewModel.LLJJ, pdpViewModel, pdpViewModel.LLILZIL, null, "c2087.d49471", ((FrameLayout) akS31S0300000_26.l1).getContext(), null, ((C1763850w07) akS31S0300000_26.l0).LIZJ, "last_image_try_your_photo", null, null, null, 7312);
        c04as.LIZLLL("2");
        C04AS.LJ(c04as, (Map) akS31S0300000_26.l2, "main_pic");
    }

    public AkS31S0300000_26(C1763850w07 c1763850w07, FrameLayout frameLayout, Map map, int i) {
        this.$t = i;
        this.l0 = c1763850w07;
        this.l1 = frameLayout;
        this.l2 = map;
    }
}
