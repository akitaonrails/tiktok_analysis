package kotlin.jvm.internal;

import X.C09AY;
import X.C1557550qdN;
import X.C2023107wD;
import X.C2188811AlT;
import X.C2191641Aq2;
import X.C665240Q7m;
import X.C665320Q7u;
import X.RunnableC2191761AqE;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS404S0200000_3;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class AwS130S0201000_3 extends C09AY implements Function0 {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

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

    public static final Object invoke$0(AwS130S0201000_3 awS130S0201000_3) {
        Lifecycle lifecycle = ((LifecycleOwner) awS130S0201000_3.l0).getLifecycle();
        final C665320Q7u c665320Q7u = (C665320Q7u) awS130S0201000_3.l1;
        final int i = awS130S0201000_3.i2;
        final LifecycleOwner lifecycleOwner = (LifecycleOwner) awS130S0201000_3.l0;
        lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.bytedance.track.TrackerChain$attachBTM$1$runDestroyForLifecycle$1$1$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                if (C2023107wD.LIZ[event.ordinal()] == 1) {
                    C1557550qdN.LIZ("vprovider_vscope", new AwS404S0200000_3(lifecycleOwner2, lifecycleOwner, 1));
                    C665240Q7m.LIZIZ(c665320Q7u, i);
                }
            }
        });
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS130S0201000_3 awS130S0201000_3) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append((RunnableC2191761AqE) awS130S0201000_3.l0);
        sbLIZ.append(" handle missed group: ");
        sbLIZ.append(awS130S0201000_3.i2);
        sbLIZ.append(" with ");
        sbLIZ.append(((HashMap) awS130S0201000_3.l1).size());
        sbLIZ.append(" events...");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS130S0201000_3(int i, LifecycleOwner lifecycleOwner, C665320Q7u c665320Q7u, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = lifecycleOwner;
        this.l1 = c665320Q7u;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS130S0201000_3(RunnableC2191761AqE runnableC2191761AqE, RunnableC2191761AqE runnableC2191761AqE2, int i, HashMap<C2191641Aq2, JSONObject> map) {
        super(0);
        this.$t = map;
        this.l0 = runnableC2191761AqE;
        this.i2 = runnableC2191761AqE2;
        this.l1 = i;
    }
}
