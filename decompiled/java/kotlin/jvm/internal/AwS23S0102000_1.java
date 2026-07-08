package kotlin.jvm.internal;

import X.C09AY;
import X.C0TQK;
import X.C418440Gaw;
import X.C814420VxA;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public class AwS23S0102000_1 extends C09AY implements Function1 {
    public final int $t;
    public int i1;
    public int i2;
    public Object l0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS23S0102000_1(C0TQK c0tqk, int i) {
        super(1);
        this.$t = i;
        this.l0 = c0tqk;
        this.i1 = 2131824746;
        this.i2 = R.raw.icon_chevron_right_offset_small_ltr;
    }

    public static final Object invoke$0(AwS23S0102000_1 awS23S0102000_1, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("rank", Integer.valueOf(awS23S0102000_1.i1));
        laneParams.plusAssign("group_rank", Integer.valueOf(awS23S0102000_1.i2));
        laneParams.plusAssign("is_default", "1");
        HashMap map = (HashMap) awS23S0102000_1.l0;
        if (map != null) {
            laneParams.withParamsGroup(map);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS23S0102000_1 awS23S0102000_1, Object obj) {
        LinearLayout linearLayout = new LinearLayout((C0TQK) awS23S0102000_1.l0);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        TuxTextView tuxTextView = new TuxTextView((C0TQK) awS23S0102000_1.l0, null, 6, 0);
        C0TQK c0tqk = (C0TQK) awS23S0102000_1.l0;
        int i = awS23S0102000_1.i1;
        tuxTextView.setGravity(17);
        tuxTextView.setText(c0tqk.getString(i));
        linearLayout.addView(tuxTextView);
        TuxIconView tuxIconView = new TuxIconView((C0TQK) awS23S0102000_1.l0, null, 0, 6, null);
        tuxIconView.setIconRes(awS23S0102000_1.i2);
        tuxIconView.setIconWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
        tuxIconView.setIconHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
        linearLayout.addView(tuxIconView);
        ((ViewGroup) obj).addView(linearLayout);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS23S0102000_1(HashMap map, int i, int i2, int i3) {
        super(1);
        this.$t = i3;
        this.i1 = i;
        this.i2 = i2;
        this.l0 = map;
    }
}
