package kotlin.jvm.internal;

import X.C09AY;
import X.C1009990cOD;
import X.C1023640ckE;
import X.C1040780dBs;
import X.C1043500dGG;
import X.C1047070dM1;
import X.C1068610dul;
import X.C1069810dwh;
import X.C1074840e4o;
import X.C2265551Dlx;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.auth.model.RegisteredContactUser;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes17.dex */
public class AwS7S1001000_16 extends C09AY implements Function1 {
    public final int $t;
    public int i1;
    public String s0;

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
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS7S1001000_16 awS7S1001000_16, Object obj) {
        List<RegisteredContactUser> list;
        C1069810dwh c1069810dwh = (C1069810dwh) obj;
        C1074840e4o c1074840e4oLIZ = c1069810dwh.LLILLJJLI.LIZ();
        if (c1074840e4oLIZ != null && (list = c1074840e4oLIZ.registerItemList) != null) {
            String str = awS7S1001000_16.s0;
            int i = awS7S1001000_16.i1;
            for (RegisteredContactUser registeredContactUser : list) {
                if (Intrinsics.LJFF(registeredContactUser.getUid(), str)) {
                    registeredContactUser.setFollowStatus(i);
                }
            }
        }
        List<User> listLIZ = c1069810dwh.LLILLL.LIZ();
        if (listLIZ != null) {
            String str2 = awS7S1001000_16.s0;
            int i2 = awS7S1001000_16.i1;
            for (User user : listLIZ) {
                if (Intrinsics.LJFF(user.getUid(), str2)) {
                    user.setFollowStatus(i2);
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS7S1001000_16 awS7S1001000_16, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C1043500dGG.LIZ.getClass();
        c1023640ckE.withParam(C1043500dGG.LLLI, awS7S1001000_16.s0);
        c1023640ckE.withParam(C1043500dGG.LLLII, Integer.valueOf(awS7S1001000_16.i1));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS7S1001000_16 awS7S1001000_16, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C1043500dGG.LIZ.getClass();
        c1023640ckE.withParam(C1043500dGG.LLLI, awS7S1001000_16.s0);
        c1023640ckE.withParam(C1043500dGG.LLLII, Integer.valueOf(awS7S1001000_16.i1));
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS7S1001000_16 awS7S1001000_16, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C1009990cOD.LIZ.getClass();
        c1023640ckE.withParam(C1009990cOD.LJJIL, String.valueOf(awS7S1001000_16.i1));
        c1023640ckE.withParam(C1009990cOD.LJJI, awS7S1001000_16.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS7S1001000_16 awS7S1001000_16, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C2265551Dlx.LIZ.getClass();
        c1023640ckE.withParam(C2265551Dlx.LIZIZ, String.valueOf(awS7S1001000_16.i1));
        c1023640ckE.withParam(C2265551Dlx.LIZJ, awS7S1001000_16.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS7S1001000_16 awS7S1001000_16, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C1068610dul.LIZ.getClass();
        c1023640ckE.withParam(C1068610dul.LIZLLL, awS7S1001000_16.s0);
        c1023640ckE.withParam(C1068610dul.LJII, String.valueOf(awS7S1001000_16.i1));
        c1023640ckE.withParam(C1068610dul.LJIIIIZZ, 2L);
        c1023640ckE.withParam(C1068610dul.LJIIIZ, 0L);
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS7S1001000_16 awS7S1001000_16, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C1043500dGG.LIZ.getClass();
        c1023640ckE.withParam(C1043500dGG.LJIILJJIL, Integer.valueOf(C1047070dM1.LJIIJJI));
        c1023640ckE.withParam(C1043500dGG.LJIILLIIL, C1047070dM1.LJIILL);
        C1040780dBs.LIZ.getClass();
        c1023640ckE.withParam(C1040780dBs.LJI, 1);
        c1023640ckE.withParam(C1043500dGG.LJIIZILJ, Long.valueOf(System.currentTimeMillis() - C1047070dM1.LJIIZILJ));
        c1023640ckE.withParam(C1043500dGG.LJJIJIIJI, Integer.valueOf(awS7S1001000_16.i1));
        c1023640ckE.withParam(C1043500dGG.LJJIJ, awS7S1001000_16.s0);
        c1023640ckE.withParam(C1043500dGG.LJIL, Long.valueOf(System.currentTimeMillis() - C1047070dM1.LJIIL));
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS7S1001000_16 awS7S1001000_16, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C1068610dul.LIZ.getClass();
        c1023640ckE.withParam(C1068610dul.LJIIIIZZ, Long.valueOf(awS7S1001000_16.i1));
        c1023640ckE.withParam(C1068610dul.LJIIIZ, 1L);
        c1023640ckE.withParam(C1068610dul.LJJIJLIJ, awS7S1001000_16.s0);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS7S1001000_16(int i, String str, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS7S1001000_16(String str, int i, int i2) {
        super(1);
        this.$t = i2;
        this.s0 = str;
        this.i1 = i;
    }
}
