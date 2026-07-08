package kotlin.jvm.internal;

import X.C013C;
import X.C09AY;
import X.C0U9B;
import X.C1389890mGx;
import X.C20684815ws;
import X.C2344009Gk;
import android.view.View;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.ss.android.ugc.aweme.detail.component.biz.TrashBinBottomComponent;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes13.dex */
public class AwS53S0310000_12 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public boolean z3;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS53S0310000_12 awS53S0310000_12) {
        String str;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "recently_deleted_page");
        c2344009Gk.LJIIIIZZ("group_id", ((Aweme) awS53S0310000_12.l0).getAid());
        TrashBinBottomComponent trashBinBottomComponent = (TrashBinBottomComponent) awS53S0310000_12.l1;
        Aweme aweme = (Aweme) awS53S0310000_12.l0;
        trashBinBottomComponent.getClass();
        c2344009Gk.LIZLLL(TrashBinBottomComponent.bo(aweme), "days_of_deleted");
        c2344009Gk.LJIIIIZZ("action_type", "click");
        c2344009Gk.LJIIIIZZ("click_type", "delete");
        c2344009Gk.LJIIIIZZ("restore_result", "fail");
        if (awS53S0310000_12.z3) {
            str = "au_u16";
        } else {
            str = "normal";
        }
        c2344009Gk.LJIIIIZZ("popup_version", str);
        C20684815ws.LJIILLIIL("confirm_restore_video_pop_up", c2344009Gk.LIZ);
        C1389890mGx c1389890mGx = new C1389890mGx((View) awS53S0310000_12.l2);
        c1389890mGx.LJIIIZ(2131844945);
        c1389890mGx.LJIIJJI();
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS53S0310000_12 awS53S0310000_12) {
        ((C013C) awS53S0310000_12.l0).element = true;
        ((C0U9B) awS53S0310000_12.l1).LLZ((LiveEffect) awS53S0310000_12.l2, awS53S0310000_12.z3);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS53S0310000_12(C013C c013c, C0U9B c0u9b, LiveEffect liveEffect, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = c013c;
        this.l1 = c0u9b;
        this.l2 = liveEffect;
        this.z3 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS53S0310000_12(Aweme aweme, TrashBinBottomComponent trashBinBottomComponent, boolean z, View view, int i) {
        super(0);
        this.$t = i;
        this.l0 = aweme;
        this.l1 = trashBinBottomComponent;
        this.z3 = z;
        this.l2 = view;
    }
}
