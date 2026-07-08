package kotlin.jvm.internal;

import X.C09AY;
import X.C0NOR;
import X.C1066210dqt;
import X.C1274200jGM;
import X.C1274210jGN;
import X.C1306480k6Q;
import X.C1306510k6T;
import X.C1946707jt;
import android.net.Uri;
import com.bytedance.android.starship.strategy.repository.StrategiesData;
import com.ss.bytertc.engine.type.SourceWantedData;
import com.ss.lyrax.video.LyraxVideoSourceWantedData;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes21.dex */
public class AFwS304S0000000_20 extends C09AY implements Function2 {
    public static final /* synthetic */ AtomicReferenceArray arr$ = new AtomicReferenceArray(6);
    public final int $t;

    public static AFwS304S0000000_20 get$arr$(int i) {
        AFwS304S0000000_20 aFwS304S0000000_20 = (AFwS304S0000000_20) arr$.get(i);
        if (aFwS304S0000000_20 != null) {
            return aFwS304S0000000_20;
        }
        arr$.compareAndSet(i, null, new AFwS304S0000000_20(i));
        return (AFwS304S0000000_20) arr$.get(i);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            case 4:
                return invoke$4(this, obj, obj2);
            case 5:
                return invoke$5(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFwS304S0000000_20(int i) {
        super(2);
        this.$t = i;
    }

    public static final Object invoke$0(AFwS304S0000000_20 aFwS304S0000000_20, Object obj, Object obj2) {
        if (obj == null) {
            C1274210jGN.LIZ = null;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AFwS304S0000000_20 aFwS304S0000000_20, Object obj, Object obj2) {
        if (obj == null) {
            C1274200jGM.LIZIZ = null;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AFwS304S0000000_20 aFwS304S0000000_20, Object obj, Object obj2) {
        boolean z;
        SourceWantedData sourceWantedData = (SourceWantedData) obj;
        SourceWantedData sourceWantedData2 = (SourceWantedData) obj2;
        if (sourceWantedData.height == sourceWantedData2.height && sourceWantedData.width == sourceWantedData2.width && sourceWantedData.frameRate == sourceWantedData2.frameRate) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$3(AFwS304S0000000_20 aFwS304S0000000_20, Object obj, Object obj2) {
        boolean z;
        LyraxVideoSourceWantedData lyraxVideoSourceWantedData = (LyraxVideoSourceWantedData) obj;
        LyraxVideoSourceWantedData lyraxVideoSourceWantedData2 = (LyraxVideoSourceWantedData) obj2;
        if (lyraxVideoSourceWantedData.height == lyraxVideoSourceWantedData2.height && lyraxVideoSourceWantedData.width == lyraxVideoSourceWantedData2.width && lyraxVideoSourceWantedData.frameRate == lyraxVideoSourceWantedData2.frameRate) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$4(AFwS304S0000000_20 aFwS304S0000000_20, Object obj, Object obj2) {
        StrategiesData strategiesData = (StrategiesData) obj;
        StrategiesData strategiesData2 = (StrategiesData) obj2;
        C0NOR.LIZJ("starship_strategy_init_trace", null);
        C1306510k6T c1306510k6T = C1306510k6T.LIZ;
        c1306510k6T.getClass();
        if (C1306480k6Q.LIZLLL) {
            C1306510k6T.LIZLLL(strategiesData2);
        } else if (strategiesData != null) {
            c1306510k6T.LIZ(strategiesData);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AFwS304S0000000_20 aFwS304S0000000_20, Object obj, Object obj2) {
        Uri uri = (Uri) obj;
        String str = (String) obj2;
        Object objLIZ = C1066210dqt.LIZ(uri.toString(), str);
        if (objLIZ == null) {
            return C1946707jt.LIZ(uri, str);
        }
        return objLIZ;
    }
}
