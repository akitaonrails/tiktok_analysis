package kotlin.jvm.internal;

import X.C09AY;
import X.C0VSJ;
import X.C0WZX;
import X.C118300cf;
import X.C1306060k5k;
import X.C1306250k63;
import X.C1306400k6I;
import X.C1306480k6Q;
import X.C1306800k6w;
import X.C1335950krx;
import X.C2188811AlT;
import X.C2204961BRm;
import X.EnumC1323320kXa;
import X.InterfaceC427850Gq7;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.ss.android.ugc.aweme.ecommerce.ui.EcomFlattenUIImage;
import com.ss.android.ugc.aweme.utils.FeedForestFetchRequestController;
import java.io.File;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes21.dex */
public class AwS229S0300000_20 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS229S0300000_20 awS229S0300000_20, Object obj) {
        ((ConcurrentHashMap) ((C1306250k63) awS229S0300000_20.l0).LIZJ.getValue()).put(((C1306400k6I) awS229S0300000_20.l1).LIZ, obj);
        ((Function1) awS229S0300000_20.l2).invoke(obj);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS229S0300000_20 awS229S0300000_20, Object obj) {
        int length;
        obj.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ensureProcessSweep done: root=");
        sbLIZ.append(((File) awS229S0300000_20.l0).getAbsolutePath());
        sbLIZ.append(", sweptCount=");
        sbLIZ.append(((C118300cf) awS229S0300000_20.l1).element);
        sbLIZ.append(", total=");
        File[] fileArr = (File[]) awS229S0300000_20.l2;
        if (fileArr != null) {
            length = fileArr.length;
        } else {
            length = 0;
        }
        sbLIZ.append(length);
        C2188811AlT.LIZIZ(sbLIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS229S0300000_20 awS229S0300000_20, Object obj) {
        ((Boolean) obj).booleanValue();
        ((C1306800k6w) awS229S0300000_20.l0).LIZ = C1306480k6Q.LIZ(((C1306400k6I) awS229S0300000_20.l1).LIZ).registerStrategyCallback((C1306400k6I) awS229S0300000_20.l1, (Function1) awS229S0300000_20.l2);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS229S0300000_20 awS229S0300000_20, Object obj) {
        ((C1335950krx) awS229S0300000_20.l0).LJJIZ((File) obj, (InterfaceC427850Gq7) awS229S0300000_20.l1, (FeedForestFetchRequestController) awS229S0300000_20.l2);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS229S0300000_20 awS229S0300000_20, Object obj) {
        String strName;
        Map map = (Map) obj;
        EnumC1323320kXa enumC1323320kXa = (EnumC1323320kXa) awS229S0300000_20.l0;
        if (enumC1323320kXa != null && (strName = enumC1323320kXa.name()) != null) {
            map.put("pre_network", strName);
        }
        map.put("network", ((EnumC1323320kXa) awS229S0300000_20.l1).name());
        String str = ((EcomFlattenUIImage) awS229S0300000_20.l2).LLJILJIL;
        if (str != null) {
            map.put("image_url", str);
        }
        String str2 = ((EcomFlattenUIImage) awS229S0300000_20.l2).LL;
        if (str2 != null) {
            map.put("page_name", str2);
        }
        map.put("height", Integer.valueOf(((EcomFlattenUIImage) awS229S0300000_20.l2).getHeight()));
        map.put("width", Integer.valueOf(((EcomFlattenUIImage) awS229S0300000_20.l2).getWidth()));
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS229S0300000_20 awS229S0300000_20, Object obj) throws Throwable {
        C2204961BRm.LJJLIIIJILLIZJL((SensorManager) awS229S0300000_20.l0, (SensorEventListener) awS229S0300000_20.l1, (Sensor) awS229S0300000_20.l2, new C0WZX("dzBzEgAjS8/YVFkiQFyGdpIIcIGkM9tlnBcBz8J0V7e9qgMGxsaWRQe4rC+V3hU=", null));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS229S0300000_20(C0VSJ c0vsj, C118300cf c118300cf, File[] fileArr, int i) {
        super(1);
        this.$t = i;
        this.l0 = c0vsj;
        this.l1 = c118300cf;
        this.l2 = fileArr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS229S0300000_20(C1306250k63 c1306250k63, C1306250k63 c1306250k632, C1306400k6I c1306400k6I, Function1<? super C1306060k5k, Unit> function1) {
        super(1);
        this.$t = function1;
        this.l0 = c1306250k63;
        this.l1 = c1306250k632;
        this.l2 = c1306400k6I;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS229S0300000_20(C1306800k6w c1306800k6w, C1306800k6w c1306800k6w2, C1306400k6I c1306400k6I, Function1<? super C1306060k5k, Unit> function1) {
        super(1);
        this.$t = function1;
        this.l0 = c1306800k6w;
        this.l1 = c1306800k6w2;
        this.l2 = c1306400k6I;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS229S0300000_20(EnumC1323320kXa enumC1323320kXa, EnumC1323320kXa enumC1323320kXa2, EcomFlattenUIImage ecomFlattenUIImage, int i) {
        super(1);
        this.$t = i;
        this.l0 = enumC1323320kXa;
        this.l1 = enumC1323320kXa2;
        this.l2 = ecomFlattenUIImage;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS229S0300000_20(C1335950krx c1335950krx, InterfaceC427850Gq7 interfaceC427850Gq7, FeedForestFetchRequestController feedForestFetchRequestController, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1335950krx;
        this.l1 = interfaceC427850Gq7;
        this.l2 = feedForestFetchRequestController;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS229S0300000_20(SensorManager sensorManager, SensorEventListener sensorEventListener, Sensor sensor, int i) {
        super(1);
        this.$t = i;
        this.l0 = sensorManager;
        this.l1 = sensorEventListener;
        this.l2 = sensor;
    }
}
