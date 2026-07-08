package kotlin.jvm.internal;

import X.C093Y;
import X.C09AY;
import X.C1AF0;
import X.C2239881Cle;
import X.C341440Da2;
import X.C636280OxW;
import X.C636330Oxb;
import X.InterfaceC1680500tpg;
import X.InterfaceC636240OxS;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.HashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes10.dex */
public class AwS7S0203000_9 extends C09AY implements Function2 {
    public final int $t;
    public int i2;
    public int i3;
    public int i4;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS7S0203000_9 awS7S0203000_9, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C636280OxW.LIZ((C636330Oxb) awS7S0203000_9.l0, (InterfaceC636240OxS) awS7S0203000_9.l1, awS7S0203000_9.i2, awS7S0203000_9.i3, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS7S0203000_9.i4 | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS7S0203000_9 awS7S0203000_9, Object obj, Object obj2) {
        int i;
        if (obj2 != null && (i = awS7S0203000_9.i2) < 3) {
            ((C2239881Cle) awS7S0203000_9.l0).LIZLLL(awS7S0203000_9.i3, awS7S0203000_9.i4, i + 1, (Aweme) awS7S0203000_9.l1);
        } else if (obj != null) {
            try {
                HashSet<Integer> hashSet = ((C2239881Cle) awS7S0203000_9.l0).LIZLLL.get(((Aweme) awS7S0203000_9.l1).getAid());
                if (hashSet != null) {
                    hashSet.add(Integer.valueOf(awS7S0203000_9.i4));
                } else {
                    ((C2239881Cle) awS7S0203000_9.l0).LIZLLL.put(((Aweme) awS7S0203000_9.l1).getAid(), C093Y.LIZJ(Integer.valueOf(awS7S0203000_9.i4)));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1AF0.LJ(th);
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS7S0203000_9(int i, C2239881Cle c2239881Cle, Aweme aweme, int i2, int i3, int i4) {
        super(2);
        this.$t = i4;
        this.i2 = i;
        this.l0 = c2239881Cle;
        this.l1 = aweme;
        this.i3 = i2;
        this.i4 = i3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS7S0203000_9(C636330Oxb c636330Oxb, C636330Oxb c636330Oxb2, InterfaceC636240OxS<T> interfaceC636240OxS, int i, int i2, int i3) {
        super(2);
        this.$t = i3;
        this.l0 = c636330Oxb;
        this.l1 = c636330Oxb2;
        this.i2 = interfaceC636240OxS;
        this.i3 = i;
        this.i4 = i2;
    }
}
