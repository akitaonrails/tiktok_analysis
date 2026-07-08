package wh6;

import X.AbstractViewOnClickListenerC1637610siV;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C1421930n6d;
import X.C1421950n6f;
import X.C1427180nF6;
import X.C2097608Jq;
import X.C593260NOq;
import X.C637380OzI;
import X.C985403tE;
import android.content.Context;
import android.view.View;
import com.bytedance.router.SmartRouter;
import java.util.Map;
import kotlin.jvm.internal.AwS388S0200000_22;

/* JADX INFO: loaded from: classes23.dex */
public class AbS702S0100000_22 extends AbstractViewOnClickListenerC1637610siV {
    public final int $t;
    public Object l0;

    @Override // X.AbstractViewOnClickListenerC1637610siV
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbS702S0100000_22(Object obj, int i) {
        super(300L);
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZ$0(AbS702S0100000_22 abS702S0100000_22, View view) {
        C1427180nF6 c1427180nF6;
        Context sceneContext;
        if (view != null && (sceneContext = (c1427180nF6 = (C1427180nF6) abS702S0100000_22.l0).getSceneContext()) != null) {
            C1397580mTM c1397580mTM = new C1397580mTM(sceneContext);
            c1397580mTM.LJI(sceneContext.getString(2131834079));
            c1397580mTM.LJII = false;
            c1397580mTM.LIZIZ(sceneContext.getString(2131834078));
            C985403tE.LIZ(c1397580mTM, new AwS388S0200000_22(sceneContext, c1427180nF6, 6));
            new C1397510mTF(c1397580mTM).LIZLLL();
        }
    }

    public static final void LIZ$1(AbS702S0100000_22 abS702S0100000_22, View view) {
        Map<String, String> mapLJ;
        if (view != null) {
            ((C1421930n6d) abS702S0100000_22.l0).I5();
            C1421950n6f c1421950n6f = ((C1421930n6d) abS702S0100000_22.l0).LLILLJJLI;
            if (c1421950n6f == null || (mapLJ = c1421950n6f.LLIZ) == null) {
                mapLJ = C2097608Jq.LJ();
            }
            C593260NOq.LIZ("click_close", mapLJ);
            C637380OzI.LIZ.getClass();
            C637380OzI.LIZIZ("recommend_create_group_guide", null, false);
        }
    }

    public static final void LIZ$2(AbS702S0100000_22 abS702S0100000_22, View view) {
        String str;
        Map<String, String> mapLJ;
        if (view != null) {
            Context context = ((C1421930n6d) abS702S0100000_22.l0).LL.getContext();
            C1421950n6f c1421950n6f = ((C1421930n6d) abS702S0100000_22.l0).LLILLJJLI;
            if (c1421950n6f != null) {
                str = c1421950n6f.LLILLL;
            } else {
                str = null;
            }
            SmartRouter.buildRoute(context, str).open();
            ((C1421930n6d) abS702S0100000_22.l0).I5();
            C1421950n6f c1421950n6f2 = ((C1421930n6d) abS702S0100000_22.l0).LLILLJJLI;
            if (c1421950n6f2 == null || (mapLJ = c1421950n6f2.LLIZ) == null) {
                mapLJ = C2097608Jq.LJ();
            }
            C593260NOq.LIZ("click", mapLJ);
            C637380OzI.LIZ.getClass();
            C637380OzI.LIZIZ("recommend_create_group_guide", null, false);
        }
    }
}
