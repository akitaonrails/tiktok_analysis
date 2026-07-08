package wh6;

import X.AbstractViewOnClickListenerC1637610siV;
import X.C10R3;
import X.C13LP;
import X.C191784101e;
import X.C19245410Qy;
import X.C19719612Di;
import X.InterfaceC722440SVm;
import android.view.View;
import com.ss.android.ugc.aweme.plugin.journey.NewUserInterestStruct;
import kotlin.jvm.internal.AwS394S0200000_28;
import kotlin.jvm.internal.AwS607S0100000_28;

/* JADX INFO: loaded from: classes29.dex */
public class AbS513S0200000_28 extends AbstractViewOnClickListenerC1637610siV {
    public final int $t;
    public Object l0;
    public Object l1;

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

    public static final void LIZ$0(AbS513S0200000_28 abS513S0200000_28, View view) {
        NewUserInterestStruct newUserInterestStruct;
        if (view != null && (newUserInterestStruct = (NewUserInterestStruct) C13LP.LJJJLZIJ(((C10R3) abS513S0200000_28.l0).L5(), ((C19245410Qy) abS513S0200000_28.l1).LLILLL)) != null) {
            boolean zLLLIL = ((C19245410Qy) abS513S0200000_28.l1).LLLIL(newUserInterestStruct);
            if (zLLLIL) {
                C19719612Di.LJJIII(((C19245410Qy) abS513S0200000_28.l1).LLIZ, new AwS607S0100000_28(newUserInterestStruct, 4), true);
            } else {
                ((C19245410Qy) abS513S0200000_28.l1).LLIZ.add(newUserInterestStruct);
            }
            ((C10R3) abS513S0200000_28.l0).P5(newUserInterestStruct.text, !zLLLIL);
            C19245410Qy c19245410Qy = (C19245410Qy) abS513S0200000_28.l1;
            c19245410Qy.LLILZ.invoke(Integer.valueOf(c19245410Qy.LLIZ.size()));
        }
    }

    public static final void LIZ$1(AbS513S0200000_28 abS513S0200000_28, View view) {
        if (view == null) {
            return;
        }
        new AwS394S0200000_28((C191784101e) abS513S0200000_28.l0, (C191784101e) abS513S0200000_28.l1, (InterfaceC722440SVm<?>) 75).invoke(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbS513S0200000_28(Object obj, Object obj2, int i) {
        super(300L);
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
