package kotlin.jvm.internal;

import X.AbstractRunnableC820240WFq;
import X.C09AY;
import X.C0WG5;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C0XL0;
import X.C20144713rx;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C814390Vx7;
import X.C820210WFn;
import X.C820360WGc;
import X.C820370WGd;
import X.C825920Wac;
import android.view.MotionEvent;
import com.bytedance.bpea.basics.Cert;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes14.dex */
public class AwS131S0110000_13 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS131S0110000_13 awS131S0110000_13) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("dispatchTouchEvent:ev:");
        sbLIZ.append(((MotionEvent) awS131S0110000_13.l0).getAction());
        sbLIZ.append(", handled=");
        sbLIZ.append(awS131S0110000_13.z1);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(AwS131S0110000_13 awS131S0110000_13) {
        Integer numValueOf;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("dispatchTouchEvent:ev:");
        MotionEvent motionEvent = (MotionEvent) awS131S0110000_13.l0;
        if (motionEvent != null) {
            numValueOf = Integer.valueOf(motionEvent.getAction());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(", handled=");
        sbLIZ.append(awS131S0110000_13.z1);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$2(AwS131S0110000_13 awS131S0110000_13) throws Throwable {
        FirebaseAnalytics firebaseAnalytics = ((C0WG5) awS131S0110000_13.l0).LIZ;
        boolean zBooleanValue = awS131S0110000_13.z1;
        C0WZX c0wzx = new C0WZX("dzBzEgAjS8/YVFkiQFyQdp1HqHmhUw2mMY/0359FB66bZtQZRElSwVrkXl8Q+gfSDKB5vNaXndutmOfs", null);
        C0WST c0wst = new C0WST();
        Object[] objArr = {Boolean.valueOf(zBooleanValue)};
        C0WZW c0wzw = new C0WZW(false, "(Z)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11036, "com/google/firebase/analytics/FirebaseAnalytics", "setAnalyticsCollectionEnabled", firebaseAnalytics, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11036, "com/google/firebase/analytics/FirebaseAnalytics", "setAnalyticsCollectionEnabled", null, objArr, firebaseAnalytics, c0wzw, false);
        } else {
            Object[] objArr2 = c0wsuLIZIZ.LIZJ;
            if (objArr2 != null) {
                Object obj = objArr2[0];
                if (obj != null) {
                    firebaseAnalytics = (FirebaseAnalytics) obj;
                }
                Object obj2 = objArr2[1];
                if (obj2 != null) {
                    zBooleanValue = ((Boolean) obj2).booleanValue();
                }
            }
            final C820210WFn c820210WFn = firebaseAnalytics.LIZ;
            final Boolean boolValueOf = Boolean.valueOf(zBooleanValue);
            c820210WFn.getClass();
            c820210WFn.LIZIZ(new AbstractRunnableC820240WFq(c820210WFn, boolValueOf) { // from class: X.0WFv
                public final /* synthetic */ Boolean LLILZIL;
                public final /* synthetic */ C820210WFn LLILZLL;

                @Override // X.AbstractRunnableC820240WFq
                public final void LIZ() {
                    if (this.LLILZIL != null) {
                        InterfaceC820490WGp interfaceC820490WGp = this.LLILZLL.LJI;
                        C0W3J.LJIIIIZZ(interfaceC820490WGp);
                        interfaceC820490WGp.setMeasurementEnabled(this.LLILZIL.booleanValue(), this.LL);
                    } else {
                        InterfaceC820490WGp interfaceC820490WGp2 = this.LLILZLL.LJI;
                        C0W3J.LJIIIIZZ(interfaceC820490WGp2);
                        interfaceC820490WGp2.clearMeasurementEnabled(this.LL);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(c820210WFn, true);
                    this.LLILZIL = boolValueOf;
                    this.LLILZLL = c820210WFn;
                }
            });
            c0wst.LIZ(11036, "com/google/firebase/analytics/FirebaseAnalytics", "setAnalyticsCollectionEnabled", null, objArr, firebaseAnalytics, c0wzw, true);
        }
        return C814390Vx7.LIZ(Unit.LIZ);
    }

    public static final Object invoke$3(AwS131S0110000_13 awS131S0110000_13) {
        C820360WGc c820360WGc = new C820360WGc();
        c820360WGc.LIZ = "Firebase";
        c820360WGc.LIZIZ = "setDeliveryMetricsExportToBigQuery";
        c820360WGc.LIZJ = C2097908Jt.LIZJ(new Pair("enable", Boolean.valueOf(awS131S0110000_13.z1)));
        c820360WGc.LIZ(C825920Wac.LIZ((Cert) awS131S0110000_13.l0));
        return C0XL0.LIZ(new C820370WGd(c820360WGc), new AwS56S0010000_13(awS131S0110000_13.z1, 6));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS131S0110000_13(C20144713rx c20144713rx, int i) {
        super(0);
        this.$t = i;
        this.z1 = true;
        this.l0 = c20144713rx;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS131S0110000_13(C0WG5 c0wg5, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = c0wg5;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS131S0110000_13(MotionEvent motionEvent, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = motionEvent;
        this.z1 = z;
    }
}
