package wh6;

import X.AbstractViewOnClickListenerC1637610siV;
import X.C1323820kYO;
import X.C1548820qPI;
import X.C1558520qew;
import X.C397901gf;
import X.ViewOnTouchListenerC473590Ihh;
import android.view.View;
import com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment;
import com.bytedance.android.livesdk.chatroom.ui.widgetload.InternalWindowAdapterUserManualMuteSetting;
import com.bytedance.provider.impl.GScope;
import com.ss.android.ugc.aweme.pcs.course.api.ui.IPcsCourseActivityAbility;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public class AbS360S0000000_7 extends AbstractViewOnClickListenerC1637610siV {
    public final int $t;

    public static final void LIZ$3(AbS360S0000000_7 abS360S0000000_7, View view) {
    }

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
            case 3:
                LIZ$3(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbS360S0000000_7(int i) {
        super(300L);
        this.$t = i;
    }

    public static final void LIZ$0(AbS360S0000000_7 abS360S0000000_7, View view) {
        if (view != null) {
            ViewOnTouchListenerC473590Ihh.LJI(false);
        }
    }

    public static final void LIZ$1(AbS360S0000000_7 abS360S0000000_7, View view) {
        String str;
        if (view != null) {
            ViewOnTouchListenerC473590Ihh.LLILZ = !view.isSelected();
            if (InternalWindowAdapterUserManualMuteSetting.INSTANCE.getValue()) {
                ViewOnTouchListenerC473590Ihh.LL.getClass();
                if (Intrinsics.LJFF(ViewOnTouchListenerC473590Ihh.LLJL, Boolean.TRUE)) {
                    ViewOnTouchListenerC473590Ihh.LLILZIL = !view.isSelected();
                }
            }
            ViewOnTouchListenerC473590Ihh.LL.getClass();
            LivePlayFragment livePlayFragmentLJIIIZ = ViewOnTouchListenerC473590Ihh.LJIIIZ();
            if (livePlayFragmentLJIIIZ != null) {
                livePlayFragmentLJIIIZ.cD("internal window user set", ViewOnTouchListenerC473590Ihh.LLILZ);
            }
            C1548820qPI.LIZIZ(new C397901gf(System.currentTimeMillis(), new C1323820kYO(ViewOnTouchListenerC473590Ihh.LJIIL(null)), "small_window_status_change"));
            ViewOnTouchListenerC473590Ihh.LJJI();
            Pair[] pairArr = new Pair[1];
            if (ViewOnTouchListenerC473590Ihh.LLILZ) {
                str = "mute";
            } else {
                str = "unmute";
            }
            pairArr[0] = new Pair("action_type", str);
            ViewOnTouchListenerC473590Ihh.LJIJI("livesdk_tiktokec_mini_window_mute", pairArr);
        }
    }

    public static final void LIZ$2(AbS360S0000000_7 abS360S0000000_7, View view) {
        IPcsCourseActivityAbility iPcsCourseActivityAbility;
        if (view != null && (iPcsCourseActivityAbility = (IPcsCourseActivityAbility) C1558520qew.LIZ(GScope.LL, IPcsCourseActivityAbility.class, null)) != null) {
            iPcsCourseActivityAbility.L70();
        }
    }
}
