package kotlin.jvm.internal;

import X.C09AY;
import X.C1155510gAv;
import X.C1189060h32;
import X.C1196140hES;
import X.C123100dR;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes19.dex */
public class AwS5S1010000_18 extends C09AY implements Function1 {
    public final int $t;
    public String s0;
    public boolean z1;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS5S1010000_18(String str, int i) {
        super(1);
        this.$t = i;
        this.z1 = true;
        this.s0 = str;
    }

    public static final Object invoke$0(AwS5S1010000_18 awS5S1010000_18, Object obj) {
        C1196140hES c1196140hES = (C1196140hES) obj;
        c1196140hES.LIZ(C1189060h32.LJJIIZ(Boolean.valueOf(awS5S1010000_18.z1)), "is request success");
        if (awS5S1010000_18.z1) {
            c1196140hES.LIZIZ(C1189060h32.LJJIIZ(Boolean.valueOf(C123100dR.LIZ(awS5S1010000_18.s0))), "is preload slash");
            String str = awS5S1010000_18.s0;
            if (str == null) {
                str = "default";
            }
            c1196140hES.LJ("preload scene [click,feed_ctr,on_device_ml]", str);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS5S1010000_18 awS5S1010000_18, Object obj) {
        String str = awS5S1010000_18.s0;
        boolean z = awS5S1010000_18.z1;
        obj.getClass();
        return new C1155510gAv(str, z);
    }

    public static final Object invoke$2(AwS5S1010000_18 awS5S1010000_18, Object obj) {
        C1196140hES c1196140hES = (C1196140hES) obj;
        c1196140hES.LIZ(C1189060h32.LJJIIZ(Boolean.valueOf(awS5S1010000_18.z1)), "need_refactor");
        c1196140hES.LJ("request_scene", awS5S1010000_18.s0);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS5S1010000_18(String str, boolean z, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS5S1010000_18(boolean z, String str, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.s0 = str;
    }
}
