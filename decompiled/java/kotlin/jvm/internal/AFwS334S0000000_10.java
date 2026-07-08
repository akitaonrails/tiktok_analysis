package kotlin.jvm.internal;

import X.C09AY;
import X.C1537480q70;
import X.C1537720q7O;
import X.C1537820q7Y;
import X.C655390PnF;
import X.InterfaceC1531560pxS;
import X.InterfaceC1541990qEH;
import X.InterfaceC1631620sYq;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.view.View;
import com.bytedance.lynx.hybrid.param.HybridSchemaParam;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
public class AFwS334S0000000_10 extends C09AY implements InterfaceC1631620sYq {
    public static final /* synthetic */ AtomicReferenceArray arr$ = new AtomicReferenceArray(5);
    public final int $t;

    public static AFwS334S0000000_10 get$arr$(int i) {
        AFwS334S0000000_10 aFwS334S0000000_10 = (AFwS334S0000000_10) arr$.get(i);
        if (aFwS334S0000000_10 != null) {
            return aFwS334S0000000_10;
        }
        arr$.compareAndSet(i, null, new AFwS334S0000000_10(i));
        return (AFwS334S0000000_10) arr$.get(i);
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            case 2:
                return invoke$2(this, obj, obj2, obj3);
            case 3:
                return invoke$3(this, obj, obj2, obj3);
            case 4:
                return invoke$4(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFwS334S0000000_10(int i) {
        super(3);
        this.$t = i;
    }

    public static final Object invoke$0(AFwS334S0000000_10 aFwS334S0000000_10, Object obj, Object obj2, Object obj3) {
        C655390PnF.LJ((Aweme) obj, (String) obj2, (View) obj3, null);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AFwS334S0000000_10 aFwS334S0000000_10, Object obj, Object obj2, Object obj3) {
        C655390PnF.LJ((Aweme) obj, (String) obj2, (View) obj3, null);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AFwS334S0000000_10 aFwS334S0000000_10, Object obj, Object obj2, Object obj3) {
        C655390PnF.LJ((Aweme) obj, (String) obj2, (View) obj3, null);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AFwS334S0000000_10 aFwS334S0000000_10, Object obj, Object obj2, Object obj3) {
        C655390PnF.LJ((Aweme) obj, (String) obj2, (View) obj3, null);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AFwS334S0000000_10 aFwS334S0000000_10, Object obj, Object obj2, Object obj3) {
        InterfaceC1541990qEH interfaceC1541990qEHLIZIZ;
        InterfaceC1531560pxS interfaceC1531560pxS;
        HybridSchemaParam hybridSchemaParamLIZJ;
        Context context = (Context) obj;
        C1537480q70 c1537480q70 = (C1537480q70) obj3;
        if (c1537480q70 != null && (interfaceC1531560pxS = c1537480q70.hybridParams) != null && (hybridSchemaParamLIZJ = interfaceC1531560pxS.LIZJ()) != null) {
            interfaceC1541990qEHLIZIZ = C1537820q7Y.LIZIZ(hybridSchemaParamLIZJ, c1537480q70, new MutableContextWrapper(context), null);
        } else {
            interfaceC1541990qEHLIZIZ = null;
        }
        if (!(interfaceC1541990qEHLIZIZ instanceof C1537720q7O)) {
            return null;
        }
        return interfaceC1541990qEHLIZIZ;
    }
}
