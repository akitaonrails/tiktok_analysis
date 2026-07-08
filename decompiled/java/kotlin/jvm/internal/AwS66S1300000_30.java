package kotlin.jvm.internal;

import X.C05P0;
import X.C05P1;
import X.C09AY;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C13FO;
import X.C13FT;
import X.C20308814dK;
import X.C2188811AlT;
import X.C595410NWx;
import X.C631860OqO;
import X.InterfaceC1693840uBC;
import X.InterfaceC20041513bJ;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Looper;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes31.dex */
public class AwS66S1300000_30 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

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

    public static final Object invoke$0(AwS66S1300000_30 awS66S1300000_30, Object obj) {
        String strLIZIZ;
        AwS274S0300000_30 awS274S0300000_30 = new AwS274S0300000_30((C05P1) awS66S1300000_30.l2, (C05P1<? extends InterfaceC1693840uBC<Object, Object>>) awS66S1300000_30.l3, (C05P1<Object>) awS66S1300000_30.l1, (InterfaceC20041513bJ) 14);
        InterfaceC20041513bJ interfaceC20041513bJ = (InterfaceC20041513bJ) awS66S1300000_30.l1;
        Object objInvoke = awS274S0300000_30.invoke();
        if (objInvoke != null && !interfaceC20041513bJ.LIZ(objInvoke)) {
            if (objInvoke instanceof C13FO) {
                C13FO c13fo = (C13FO) objInvoke;
                if (c13fo.LJFF() != C13FT.LIZ && c13fo.LJFF() != C595410NWx.LIZ && c13fo.LJFF() != C631860OqO.LIZ) {
                    strLIZIZ = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("MutableState containing ");
                    sbLIZ.append(c13fo.getValue());
                    sbLIZ.append(" cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().");
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                }
            } else {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(objInvoke);
                sbLIZ2.append(" cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().");
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            }
            throw new IllegalArgumentException(strLIZIZ);
        }
        return new C20308814dK(((InterfaceC20041513bJ) awS66S1300000_30.l1).LIZIZ(awS66S1300000_30.s0, awS274S0300000_30), 1);
    }

    public static final Object invoke$1(AwS66S1300000_30 awS66S1300000_30, Object obj) throws Throwable {
        LocationManager locationManager = (LocationManager) awS66S1300000_30.l1;
        String str = awS66S1300000_30.s0;
        LocationListener locationListener = (LocationListener) awS66S1300000_30.l2;
        Looper looper = (Looper) awS66S1300000_30.l3;
        C0WZX c0wzx = new C0WZX("dzBzEgAjS8/YVFkiQFyGdpIIcIGkM9tlnBcBz8JrXbqszM7V1P5XLnXap+8RebhdG+Ma", null);
        C0WST c0wst = new C0WST();
        Object[] objArr = {str, locationListener, looper};
        C0WZW c0wzw = new C0WZW(false, "(Ljava/lang/String;Landroid/location/LocationListener;Landroid/os/Looper;)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(100002, "android/location/LocationManager", "requestSingleUpdate", locationManager, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(100002, "android/location/LocationManager", "requestSingleUpdate", null, objArr, locationManager, c0wzw, false);
        } else {
            Object[] objArr2 = c0wsuLIZIZ.LIZJ;
            if (objArr2 != null) {
                Object obj2 = objArr2[0];
                if (obj2 != null) {
                    locationManager = (LocationManager) obj2;
                }
                Object obj3 = objArr2[1];
                if (obj3 != null) {
                    str = (String) obj3;
                }
                Object obj4 = objArr2[2];
                if (obj4 != null) {
                    locationListener = (LocationListener) obj4;
                }
                Object obj5 = objArr2[3];
                if (obj5 != null) {
                    looper = (Looper) obj5;
                }
            }
            locationManager.requestSingleUpdate(str, locationListener, looper);
            c0wst.LIZ(100002, "android/location/LocationManager", "requestSingleUpdate", null, objArr, locationManager, c0wzw, true);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS66S1300000_30(InterfaceC20041513bJ interfaceC20041513bJ, String str, C05P0 c05p0, C05P0 c05p02, int i) {
        super(1);
        this.$t = i;
        this.l1 = interfaceC20041513bJ;
        this.s0 = str;
        this.l2 = c05p0;
        this.l3 = c05p02;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS66S1300000_30(LocationManager locationManager, String str, LocationListener locationListener, Looper looper, int i) {
        super(1);
        this.$t = i;
        this.l1 = locationManager;
        this.s0 = str;
        this.l2 = locationListener;
        this.l3 = looper;
    }
}
