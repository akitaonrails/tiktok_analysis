package kotlin.jvm.internal;

import X.C09AY;
import X.C1196140hES;
import X.C418440Gaw;
import X.C814420VxA;
import X.EnumC1201640hNK;
import X.InterfaceC1177250gjz;
import com.ss.android.ugc.aweme.poi.mapdetail.assem.PoiMapDetailMapAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes19.dex */
public class AwS5S0103000_18 extends C09AY implements Function1 {
    public final int $t;
    public int i1;
    public int i2;
    public int i3;
    public Object l0;

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

    public static final Object invoke$0(AwS5S0103000_18 awS5S0103000_18, Object obj) {
        InterfaceC1177250gjz interfaceC1177250gjz = ((PoiMapDetailMapAssem) awS5S0103000_18.l0).LLJILJILJ;
        if (interfaceC1177250gjz != null) {
            interfaceC1177250gjz.LJIJ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), awS5S0103000_18.i1 - awS5S0103000_18.i2, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), awS5S0103000_18.i3);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS5S0103000_18 awS5S0103000_18, Object obj) {
        C1196140hES c1196140hES = (C1196140hES) obj;
        c1196140hES.LIZ(((EnumC1201640hNK) awS5S0103000_18.l0).getType(), "revamp response status");
        c1196140hES.LIZIZ(awS5S0103000_18.i1, "revamp response server error_code");
        c1196140hES.LIZJ(awS5S0103000_18.i2, "aweme list size of response");
        c1196140hES.LIZLLL(awS5S0103000_18.i3, "chunk index");
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS5S0103000_18(EnumC1201640hNK enumC1201640hNK, int i, int i2, int i3, int i4) {
        super(1);
        this.$t = i4;
        this.l0 = enumC1201640hNK;
        this.i1 = i;
        this.i2 = i2;
        this.i3 = i3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS5S0103000_18(PoiMapDetailMapAssem poiMapDetailMapAssem, int i, int i2, int i3, int i4) {
        super(1);
        this.$t = i4;
        this.l0 = poiMapDetailMapAssem;
        this.i1 = i;
        this.i2 = i2;
        this.i3 = i3;
    }
}
