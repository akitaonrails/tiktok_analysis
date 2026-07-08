package kotlin.jvm.internal;

import X.C05P0;
import X.C09AY;
import X.C1277760jM6;
import X.C1278910jNx;
import X.C1306510k6T;
import X.C1322200kVm;
import X.C1325540kbA;
import X.C1328130kfL;
import X.C1335950krx;
import X.C1684420tw0;
import X.C2188811AlT;
import X.C487160J8o;
import X.C786410Ut5;
import X.InterfaceC1680500tpg;
import android.content.Context;
import android.widget.Toast;
import com.bytedance.android.starship.strategy.repository.StrategiesData;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.pusher.core.engine.AdaptiveController;
import com.ss.pusher.core.utils.AVLog;
import java.lang.ref.WeakReference;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes21.dex */
public class AwS634S0100000_20 extends C09AY implements Function2 {
    public final int $t;
    public Object l0;

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
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
            case 6:
                return invoke$6(this, obj, obj2);
            case 7:
                return invoke$7(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS634S0100000_20(C05P0 c05p0, C05P0<Pair<Integer, Integer>> c05p02) {
        super(2);
        this.$t = c05p02;
        this.l0 = c05p0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS634S0100000_20(C487160J8o c487160J8o, int i) {
        super(2);
        this.$t = i;
        this.l0 = c487160J8o;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS634S0100000_20(C1277760jM6 c1277760jM6, int i) {
        super(2);
        this.$t = i;
        this.l0 = c1277760jM6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS634S0100000_20(C1335950krx c1335950krx, int i) {
        super(2);
        this.$t = i;
        this.l0 = c1335950krx;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS634S0100000_20(Context context, int i) {
        super(2);
        this.$t = i;
        this.l0 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS634S0100000_20(Function0 function0, Function0<Unit> function02) {
        super(2);
        this.$t = function02;
        this.l0 = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS634S0100000_20(Function1 function1, Function1<? super String, Unit> function12) {
        super(2);
        this.$t = function12;
        this.l0 = function1;
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AwS634S0100000_20 awS634S0100000_20, Object obj, Object obj2) {
        C1325540kbA c1325540kbALIZ = C1322200kVm.LIZ();
        c1325540kbALIZ.LIZIZ();
        c1325540kbALIZ.LIZ();
        C1325540kbA c1325540kbALJIIL = C1328130kfL.LJIILIIL().LJIIL();
        c1325540kbALJIIL.LIZIZ();
        c1325540kbALJIIL.LIZ();
        C786410Ut5.re(Toast.makeText((Context) awS634S0100000_20.l0, "clear picture cache success", 0));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS634S0100000_20 awS634S0100000_20, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            C1684420tw0.LJFF((Function0) awS634S0100000_20.l0, interfaceC1680500tpg, 0);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$2(kotlin.jvm.internal.AwS634S0100000_20 r1, java.lang.Object r2, java.lang.Object r3) {
        /*
            java.lang.Object r3 = r1.l0
            X.0krx r3 = (X.C1335950krx) r3
            java.lang.ref.WeakReference<android.widget.ImageView> r0 = r3.LJL
            java.lang.Object r2 = r0.get()
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            java.lang.ref.WeakReference<X.0kpH> r0 = r3.LJLI
            java.lang.Object r1 = r0.get()
            X.0kpH r1 = (X.InterfaceC1334290kpH) r1
            if (r2 == 0) goto L28
            android.graphics.drawable.Drawable r0 = r3.LJLIIIL
            if (r0 == 0) goto L20
            r2.setImageDrawable(r0)
        L1d:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L20:
            int r0 = r3.LJLIIL
            if (r0 == 0) goto L28
            r2.setImageResource(r0)
            goto L1d
        L28:
            if (r1 == 0) goto L1d
            android.graphics.drawable.Drawable r0 = r3.LJLIIIL
            if (r0 == 0) goto L3a
            X.0kry r1 = r1.getSmartHierarchy()
            if (r1 == 0) goto L1d
            android.graphics.drawable.Drawable r0 = r3.LJLIIIL
            r1.setPlaceholderImage(r0)
            goto L1d
        L3a:
            int r0 = r3.LJLIIL
            if (r0 == 0) goto L1d
            X.0kry r1 = r1.getSmartHierarchy()
            if (r1 == 0) goto L1d
            int r0 = r3.LJLIIL
            r1.setPlaceholderImage(r0)
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS634S0100000_20.invoke$2(kotlin.jvm.internal.AwS634S0100000_20, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$3(AwS634S0100000_20 awS634S0100000_20, Object obj, Object obj2) {
        ((C05P0) awS634S0100000_20.l0).setValue(new Pair(Integer.valueOf(((Number) obj).intValue()), Integer.valueOf(((Number) obj2).intValue())));
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS634S0100000_20 awS634S0100000_20, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
            return Unit.LIZ;
        }
        ((C487160J8o) awS634S0100000_20.l0).getClass();
        throw null;
    }

    public static final Object invoke$5(AwS634S0100000_20 awS634S0100000_20, Object obj, Object obj2) {
        String targetFilePath;
        DownloadInfo downloadInfo = (DownloadInfo) obj;
        if (downloadInfo != null && (targetFilePath = downloadInfo.getTargetFilePath()) != null) {
            ((Function1) awS634S0100000_20.l0).invoke(targetFilePath);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS634S0100000_20 awS634S0100000_20, Object obj, Object obj2) {
        C1277760jM6 c1277760jM6 = (C1277760jM6) awS634S0100000_20.l0;
        c1277760jM6.LJIIIIZZ = new AdaptiveController(c1277760jM6.LIZLLL, (String) obj2, c1277760jM6.LJFF);
        C1277760jM6 c1277760jM62 = (C1277760jM6) awS634S0100000_20.l0;
        AdaptiveController adaptiveController = c1277760jM62.LJIIIIZZ;
        if (adaptiveController != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("registerObserver: ");
            sbLIZ.append(c1277760jM62);
            AVLog.iod("AdaptiveController", C2188811AlT.LIZIZ(sbLIZ));
            adaptiveController.LIZ = c1277760jM62;
        }
        C1277760jM6 c1277760jM63 = (C1277760jM6) awS634S0100000_20.l0;
        C1278910jNx c1278910jNx = c1277760jM63.LIZLLL;
        AdaptiveController adaptiveController2 = c1277760jM63.LJIIIIZZ;
        c1278910jNx.getClass();
        c1278910jNx.LJIJ = new WeakReference<>(adaptiveController2);
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS634S0100000_20 awS634S0100000_20, Object obj, Object obj2) {
        boolean z;
        StrategiesData strategiesData = (StrategiesData) obj2;
        C1306510k6T.LIZ.getClass();
        C1306510k6T.LIZLLL(strategiesData);
        Function1 function1 = (Function1) awS634S0100000_20.l0;
        if (function1 != null) {
            if (strategiesData != null) {
                z = true;
            } else {
                z = false;
            }
            function1.invoke(Boolean.valueOf(z));
        }
        return Unit.LIZ;
    }
}
