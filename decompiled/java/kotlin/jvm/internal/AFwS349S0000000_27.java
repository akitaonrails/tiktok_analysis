package kotlin.jvm.internal;

import X.C09AY;
import X.C1836200xso;
import X.InterfaceC1631620sYq;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.replaylistv2.tabs.highlight.HighLightItemAssem;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Unit;

/* JADX INFO: loaded from: classes28.dex */
public class AFwS349S0000000_27 extends C09AY implements InterfaceC1631620sYq {
    public static final /* synthetic */ AtomicReferenceArray arr$ = new AtomicReferenceArray(3);
    public final int $t;

    public static AFwS349S0000000_27 get$arr$(int i) {
        AFwS349S0000000_27 aFwS349S0000000_27 = (AFwS349S0000000_27) arr$.get(i);
        if (aFwS349S0000000_27 != null) {
            return aFwS349S0000000_27;
        }
        arr$.compareAndSet(i, null, new AFwS349S0000000_27(i));
        return (AFwS349S0000000_27) arr$.get(i);
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
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFwS349S0000000_27(int i) {
        super(3);
        this.$t = i;
    }

    public static final Object invoke$0(AFwS349S0000000_27 aFwS349S0000000_27, Object obj, Object obj2, Object obj3) {
        HighLightItemAssem highLightItemAssem = (HighLightItemAssem) obj;
        int iIntValue = ((Number) obj2).intValue();
        int iIntValue2 = ((Number) obj3).intValue();
        if (highLightItemAssem.yp()) {
            highLightItemAssem.op(iIntValue, iIntValue2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AFwS349S0000000_27 aFwS349S0000000_27, Object obj, Object obj2, Object obj3) {
        ((Number) obj).intValue();
        int iLongValue = (int) (((r6.LJFF + r6.LJI) + (((C1836200xso) obj2).LJIIJ * (((Number) obj3).longValue() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)))) - r6.LIZ);
        if (iLongValue < 0) {
            iLongValue = 0;
        }
        return Integer.valueOf(iLongValue);
    }

    public static final Object invoke$2(AFwS349S0000000_27 aFwS349S0000000_27, Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        return -1;
    }
}
