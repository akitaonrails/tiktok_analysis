package kotlin.jvm.internal;

import X.C09AY;
import X.InterfaceC2272941Dxs;
import android.view.View;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public class AwS2S0000001_4 extends C09AY implements Function1 {
    public final int $t;
    public float f0;

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
    public AwS2S0000001_4(float f, int i) {
        super(1);
        this.$t = i;
        this.f0 = f;
    }

    public static final Object invoke$0(AwS2S0000001_4 awS2S0000001_4, Object obj) {
        InterfaceC2272941Dxs interfaceC2272941Dxs = (InterfaceC2272941Dxs) obj;
        View itemView = interfaceC2272941Dxs.getItemView();
        if (itemView == null) {
            return null;
        }
        int height = itemView.getHeight();
        itemView.getLocationOnScreen(new int[2]);
        return new Pair(interfaceC2272941Dxs, Float.valueOf(Math.abs((r1[1] + (height / 2.0f)) - awS2S0000001_4.f0)));
    }

    public static final Object invoke$1(AwS2S0000001_4 awS2S0000001_4, Object obj) {
        InterfaceC2272941Dxs interfaceC2272941Dxs = (InterfaceC2272941Dxs) obj;
        View itemView = interfaceC2272941Dxs.getItemView();
        if (itemView == null) {
            return null;
        }
        int height = itemView.getHeight();
        itemView.getLocationOnScreen(new int[2]);
        return new Pair(interfaceC2272941Dxs, Float.valueOf(Math.abs((r1[1] + (height / 2.0f)) - awS2S0000001_4.f0)));
    }
}
