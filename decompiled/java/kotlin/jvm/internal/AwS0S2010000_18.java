package kotlin.jvm.internal;

import X.C09AY;
import X.C1168510gVt;
import X.C1189060h32;
import X.C1196140hES;
import X.C291001Au;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes19.dex */
public class AwS0S2010000_18 extends C09AY implements Function1 {
    public final int $t;
    public String s0;
    public String s1;
    public boolean z2;

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

    public static final Object invoke$0(AwS0S2010000_18 awS0S2010000_18, Object obj) {
        C1196140hES c1196140hES = (C1196140hES) obj;
        c1196140hES.LIZ(C1189060h32.LJJIIZ(Boolean.valueOf(awS0S2010000_18.z2)), "is_success");
        String str = awS0S2010000_18.s0;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        c1196140hES.LJIIIIZZ("creation_id", str);
        String str3 = awS0S2010000_18.s1;
        if (str3 != null) {
            str2 = str3;
        }
        c1196140hES.LJ("content_type", str2);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS0S2010000_18 awS0S2010000_18, Object obj) {
        return C1168510gVt.LIZ((C1168510gVt) obj, awS0S2010000_18.s0, awS0S2010000_18.s1, new C291001Au(Boolean.valueOf(awS0S2010000_18.z2)), null, false, null, null, 120);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS0S2010000_18(String str, String str2, boolean z, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
        this.z2 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS0S2010000_18(boolean z, String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.z2 = z;
        this.s0 = str;
        this.s1 = str2;
    }
}
