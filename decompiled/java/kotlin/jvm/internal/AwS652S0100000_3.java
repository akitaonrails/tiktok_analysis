package kotlin.jvm.internal;

import X.AbstractC1931807hU;
import X.C09AY;
import X.C1673840tew;
import X.C189200o6;
import X.C201955140j;
import X.C20539082v;
import X.C2130208We;
import X.C2188811AlT;
import X.C2252611DEt;
import X.InterfaceC1631620sYq;
import X.InterfaceC20236714Gf;
import java.security.MessageDigest;
import java.util.List;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public class AwS652S0100000_3 extends C09AY implements InterfaceC1631620sYq {
    public final int $t;
    public Object l0;

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
    public AwS652S0100000_3(C2130208We c2130208We, int i) {
        super(3);
        this.$t = i;
        this.l0 = c2130208We;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS652S0100000_3(C2252611DEt c2252611DEt, int i) {
        super(3);
        this.$t = i;
        this.l0 = c2252611DEt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS652S0100000_3(Integer num, int i) {
        super(3);
        this.$t = i;
        this.l0 = num;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS652S0100000_3(MessageDigest messageDigest, int i) {
        super(3);
        this.$t = i;
        this.l0 = messageDigest;
    }

    public static final Object invoke$0(AwS652S0100000_3 awS652S0100000_3, Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj2).intValue();
        int iIntValue2 = ((Number) obj3).intValue();
        ((MessageDigest) awS652S0100000_3.l0).update((byte[]) obj, iIntValue, iIntValue2);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS652S0100000_3 awS652S0100000_3, Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj2).intValue();
        int iIntValue2 = ((Number) obj3).intValue();
        ((MessageDigest) awS652S0100000_3.l0).update((byte[]) obj, iIntValue, iIntValue2);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS652S0100000_3 awS652S0100000_3, Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj2).intValue();
        int iIntValue2 = ((Number) obj3).intValue();
        ((MessageDigest) awS652S0100000_3.l0).update((byte[]) obj, iIntValue, iIntValue2);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS652S0100000_3 awS652S0100000_3, Object obj, Object obj2, Object obj3) {
        if (((Boolean) obj).booleanValue()) {
            C20539082v.LIZ = ((Integer) awS652S0100000_3.l0).intValue();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS652S0100000_3 awS652S0100000_3, Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj).intValue();
        C1673840tew c1673840tew = C1673840tew.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LocalEmbScanTask onFinish code=");
        sbLIZ.append(iIntValue);
        sbLIZ.append(", scanned=");
        sbLIZ.append(((List) obj2).size());
        sbLIZ.append(", failed=");
        sbLIZ.append(((Map) obj3).size());
        C201955140j.LJIILJJIL(c1673840tew, C2188811AlT.LIZIZ(sbLIZ));
        if (((InterfaceC20236714Gf) awS652S0100000_3.l0).isActive()) {
            InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) awS652S0100000_3.l0;
            Unit unit = Unit.LIZ;
            C189200o6.m2constructorimpl(unit);
            interfaceC20236714Gf.resumeWith(unit);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS652S0100000_3 awS652S0100000_3, Object obj, Object obj2, Object obj3) {
        Map<String, ? extends Object> map = (Map) obj2;
        String str = (String) obj3;
        C2130208We c2130208We = (C2130208We) awS652S0100000_3.l0;
        for (AbstractC1931807hU abstractC1931807hU : (List) obj) {
            synchronized (c2130208We) {
                c2130208We.LJ(abstractC1931807hU, map, str);
            }
        }
        return Unit.LIZ;
    }
}
