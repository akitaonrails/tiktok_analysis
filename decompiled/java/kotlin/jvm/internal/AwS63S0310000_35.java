package kotlin.jvm.internal;

import X.C09AY;
import X.C20516015Pq;
import android.view.ViewGroup;
import com.bytedance.ies.sdk.widgets.LayeredWidgetManagerV2;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes36.dex */
public class AwS63S0310000_35 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public boolean z3;

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AwS63S0310000_35 awS63S0310000_35) {
        ((LayeredWidgetManagerV2) awS63S0310000_35.l2).generateNewWidgetV2((C20516015Pq) awS63S0310000_35.l0, awS63S0310000_35.z3, (LiveRecyclableWidget) awS63S0310000_35.l1);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AwS63S0310000_35 awS63S0310000_35) {
        if (!((LiveRecyclableWidget) awS63S0310000_35.l1).shouldAttach()) {
            ((LiveRecyclableWidget) awS63S0310000_35.l1).saveSnapShot((ViewGroup) awS63S0310000_35.l0, awS63S0310000_35.z3);
            ((LayeredWidgetManagerV2) awS63S0310000_35.l2).addWidgetAndCallCustomBack((LiveRecyclableWidget) awS63S0310000_35.l1);
        } else {
            ((LayeredWidgetManagerV2) awS63S0310000_35.l2).generateOldWidgetV2((ViewGroup) awS63S0310000_35.l0, awS63S0310000_35.z3, (LiveRecyclableWidget) awS63S0310000_35.l1);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS63S0310000_35(LayeredWidgetManagerV2 layeredWidgetManagerV2, LayeredWidgetManagerV2 layeredWidgetManagerV22, C20516015Pq c20516015Pq, boolean z, T t) {
        super(0);
        this.$t = t;
        this.l2 = layeredWidgetManagerV2;
        this.l0 = layeredWidgetManagerV22;
        this.z3 = c20516015Pq;
        this.l1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS63S0310000_35(LiveRecyclableWidget liveRecyclableWidget, T t, ViewGroup viewGroup, boolean z, LayeredWidgetManagerV2 layeredWidgetManagerV2) {
        super(0);
        this.$t = layeredWidgetManagerV2;
        this.l1 = liveRecyclableWidget;
        this.l0 = t;
        this.z3 = viewGroup;
        this.l2 = z;
    }
}
