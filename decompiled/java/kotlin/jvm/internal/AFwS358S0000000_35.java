package kotlin.jvm.internal;

import X.C09AY;
import X.C1435510nSX;
import X.C2256591DUb;
import X.C2256651DUh;
import X.C2267061DoO;
import X.C2267431Doz;
import X.EnumC1435490nSV;
import X.EnumC1671200tag;
import X.EnumC2267251Doh;
import X.InterfaceC1631620sYq;
import com.ss.android.ugc.aweme.performance.MediaUploadPerformanceMonitor;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Unit;

/* JADX INFO: loaded from: classes36.dex */
public class AFwS358S0000000_35 extends C09AY implements InterfaceC1631620sYq {
    public static final /* synthetic */ AtomicReferenceArray arr$ = new AtomicReferenceArray(6);
    public final int $t;

    public static AFwS358S0000000_35 get$arr$(int i) {
        AFwS358S0000000_35 aFwS358S0000000_35 = (AFwS358S0000000_35) arr$.get(i);
        if (aFwS358S0000000_35 != null) {
            return aFwS358S0000000_35;
        }
        arr$.compareAndSet(i, null, new AFwS358S0000000_35(i));
        return (AFwS358S0000000_35) arr$.get(i);
    }

    public static final /* bridge */ /* synthetic */ Object invoke$5(AFwS358S0000000_35 aFwS358S0000000_35, Object obj, Object obj2, Object obj3) {
        return null;
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
            case 5:
                return invoke$5(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFwS358S0000000_35(int i) {
        super(3);
        this.$t = i;
    }

    public static final Object invoke$0(AFwS358S0000000_35 aFwS358S0000000_35, Object obj, Object obj2, Object obj3) {
        String str = (String) obj;
        int iIntValue = ((Number) obj2).intValue();
        Throwable th = (Throwable) obj3;
        C1435510nSX c1435510nSX = C2256591DUb.LIZIZ;
        if (c1435510nSX != null) {
            c1435510nSX.LIZ();
        }
        C2256651DUh c2256651DUh = (C2256651DUh) MediaUploadPerformanceMonitor.LIZIZ.LIZ(str);
        c2256651DUh.LJ(false);
        c2256651DUh.LJIIJJI(EnumC1435490nSV.UPLOAD);
        c2256651DUh.LIZJ(iIntValue);
        c2256651DUh.LJIIIZ(th.toString());
        c2256651DUh.LIZ();
        return Unit.LIZ;
    }

    public static final Object invoke$1(AFwS358S0000000_35 aFwS358S0000000_35, Object obj, Object obj2, Object obj3) {
        C2267061DoO c2267061DoO = (C2267061DoO) obj;
        C2267431Doz.LIZ(c2267061DoO, (EnumC1671200tag) obj3);
        c2267061DoO.LJJJJL = EnumC2267251Doh.LEFT_TO_LEFT;
        c2267061DoO.LJJIJ = obj2;
        return c2267061DoO;
    }

    public static final Object invoke$2(AFwS358S0000000_35 aFwS358S0000000_35, Object obj, Object obj2, Object obj3) {
        C2267061DoO c2267061DoO = (C2267061DoO) obj;
        C2267431Doz.LIZ(c2267061DoO, (EnumC1671200tag) obj3);
        c2267061DoO.LJJJJL = EnumC2267251Doh.LEFT_TO_RIGHT;
        c2267061DoO.LJJIJIIJI = obj2;
        return c2267061DoO;
    }

    public static final Object invoke$3(AFwS358S0000000_35 aFwS358S0000000_35, Object obj, Object obj2, Object obj3) {
        C2267061DoO c2267061DoO = (C2267061DoO) obj;
        C2267431Doz.LIZIZ(c2267061DoO, (EnumC1671200tag) obj3);
        c2267061DoO.LJJJJL = EnumC2267251Doh.RIGHT_TO_LEFT;
        c2267061DoO.LJJIJIIJIL = obj2;
        return c2267061DoO;
    }

    public static final Object invoke$4(AFwS358S0000000_35 aFwS358S0000000_35, Object obj, Object obj2, Object obj3) {
        C2267061DoO c2267061DoO = (C2267061DoO) obj;
        C2267431Doz.LIZIZ(c2267061DoO, (EnumC1671200tag) obj3);
        c2267061DoO.LJJJJL = EnumC2267251Doh.RIGHT_TO_RIGHT;
        c2267061DoO.LJJIJIL = obj2;
        return c2267061DoO;
    }
}
