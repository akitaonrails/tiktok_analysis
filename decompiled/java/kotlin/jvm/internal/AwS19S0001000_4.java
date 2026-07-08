package kotlin.jvm.internal;

import X.C098200Yq;
import X.C09AY;
import X.C0DHS;
import X.C1023640ckE;
import X.C1834780xqW;
import X.C189200o6;
import X.C2188811AlT;
import X.C291001Au;
import X.C322320CkI;
import X.C322420CkS;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.feed.assem.tag.AdvertiserFollowerCountLabelAssem;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.a0;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes5.dex */
public class AwS19S0001000_4 extends C09AY implements Function1 {
    public final int $t;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f964i0;

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
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS19S0001000_4(int i, int i2) {
        super(1);
        this.$t = i2;
        this.f964i0 = i;
    }

    public static final Object invoke$0(AwS19S0001000_4 awS19S0001000_4, Object obj) {
        return C322320CkI.LIZ((C322320CkI) obj, null, null, null, new C291001Au(new C322420CkS(false, awS19S0001000_4.f964i0)), null, 23);
    }

    public static final Object invoke$1(AwS19S0001000_4 awS19S0001000_4, Object obj) {
        return C1834780xqW.LIZ((C1834780xqW) obj, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new C291001Au(Integer.valueOf(awS19S0001000_4.f964i0)), null, 393215);
    }

    public static final Object invoke$2(AwS19S0001000_4 awS19S0001000_4, Object obj) {
        return C1834780xqW.LIZ((C1834780xqW) obj, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new C291001Au(Integer.valueOf(awS19S0001000_4.f964i0)), null, null, 458751);
    }

    public static final Object invoke$3(AwS19S0001000_4 awS19S0001000_4, Object obj) {
        C0DHS.LIZ.getClass();
        ((C1023640ckE) obj).withParam(C0DHS.LIZIZ, Integer.valueOf(awS19S0001000_4.f964i0));
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS19S0001000_4 awS19S0001000_4, Object obj) {
        Object c098200Yq;
        String str;
        boolean z;
        String str2;
        double dDoubleValue = ((Number) obj).doubleValue();
        String str3 = "K";
        boolean z2 = true;
        BigDecimal scale = new BigDecimal(String.valueOf(((double) awS19S0001000_4.f964i0) / dDoubleValue)).setScale(1, RoundingMode.FLOOR);
        String strValueOf = String.valueOf(scale);
        try {
            int iLJJJ = a0.LJJJ(strValueOf, e3.d, 0, false, 6);
            int i = iLJJJ + 2;
            if (Intrinsics.LJFF(strValueOf.subSequence(iLJJJ + 1, i), CardStruct.IStatusCode.DEFAULT)) {
                str = (String) strValueOf.subSequence(0, iLJJJ);
            } else {
                str = (String) strValueOf.subSequence(0, i);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            if (dDoubleValue == 1000.0d) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                str2 = "K";
            } else {
                str2 = "M";
            }
            sbLIZ.append(str2);
            c098200Yq = C2188811AlT.LIZIZ(sbLIZ);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(scale);
        if (dDoubleValue != 1000.0d) {
            z2 = false;
        }
        if (!z2) {
            str3 = "M";
        }
        sb.append(str3);
        String string = sb.toString();
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            return string;
        }
        return c098200Yq;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS19S0001000_4(int i, AdvertiserFollowerCountLabelAssem advertiserFollowerCountLabelAssem, int i2) {
        super(1);
        this.$t = i2;
        this.f964i0 = i;
    }
}
