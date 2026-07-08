package kotlin.jvm.internal;

import X.C09AY;
import X.C0EJ9;
import X.C0EVI;
import X.C0EVK;
import X.C1662160tM6;
import X.C201955140j;
import X.C2217061Bpw;
import X.C361980EHc;
import X.C370320EfW;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import java.util.concurrent.TimeoutException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;

/* JADX INFO: loaded from: classes6.dex */
public class AwS17S1210000_5 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;
    public boolean z3;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS17S1210000_5 awS17S1210000_5) throws JSONException {
        ((C2217061Bpw) awS17S1210000_5.l1).LJJ.cancel();
        ((C2217061Bpw) awS17S1210000_5.l1).LJIL.setValue(0);
        C2217061Bpw c2217061Bpw = (C2217061Bpw) awS17S1210000_5.l1;
        Throwable th = (Throwable) awS17S1210000_5.l2;
        boolean z = awS17S1210000_5.z3;
        String str = awS17S1210000_5.s0;
        if (str == null) {
            str = "asr";
        }
        c2217061Bpw.getClass();
        C201955140j.LJIIJ(C1662160tM6.LIZIZ, "processErrorResult", th);
        if (th instanceof TimeoutException) {
            VideoPublishEditModel videoPublishEditModel = c2217061Bpw.LIZ;
            long j = c2217061Bpw.LJIJI;
            boolean z2 = c2217061Bpw.LJFF;
            String str2 = c2217061Bpw.LJJI;
            u4.LJJJLZIJ(videoPublishEditModel, j, "exceed", z2 ? 1 : 0, str2, Boolean.valueOf(Intrinsics.LJFF(str2, "auto_language")), z, str);
            c2217061Bpw.LJIILLIIL(2);
            VideoPublishEditModel videoPublishEditModel2 = c2217061Bpw.LIZ;
            long j2 = c2217061Bpw.LJIJI;
            String str3 = c2217061Bpw.LJIILJJIL.LJIJ;
            boolean z3 = c2217061Bpw.LJFF;
            u4.LJJLIIIJILLIZJL(videoPublishEditModel2, j2, "fail", str3, z3 ? 1 : 0, c2217061Bpw.LJJI, 24);
            C0EVI c0evi = c2217061Bpw.LJIIJ;
            if (c0evi != null) {
                c0evi.AD();
            }
        } else if (th instanceof C0EVK) {
            C0EVK c0evk = (C0EVK) th;
            if (c0evk.getStep() == 50 && c0evk.getErrorCode() == 2172) {
                C0EVI c0evi2 = c2217061Bpw.LJIIJ;
                if (c0evi2 != null) {
                    c0evi2.cH();
                }
            } else {
                C0EVI c0evi3 = c2217061Bpw.LJIIJ;
                if (c0evi3 != null) {
                    c0evi3.AD();
                }
            }
            VideoPublishEditModel videoPublishEditModel3 = c2217061Bpw.LIZ;
            long j3 = c2217061Bpw.LJIJI;
            boolean z4 = c2217061Bpw.LJFF;
            String str4 = c2217061Bpw.LJJI;
            u4.LJJJLZIJ(videoPublishEditModel3, j3, "error", z4 ? 1 : 0, str4, Boolean.valueOf(Intrinsics.LJFF(str4, "auto_language")), z, str);
            VideoPublishEditModel videoPublishEditModel4 = c2217061Bpw.LIZ;
            long j4 = c2217061Bpw.LJIJI;
            String str5 = c2217061Bpw.LJIILJJIL.LJIJ;
            boolean z5 = c2217061Bpw.LJFF;
            u4.LJJLIIIJILLIZJL(videoPublishEditModel4, j4, "fail", str5, z5 ? 1 : 0, c2217061Bpw.LJJI, 24);
            c2217061Bpw.LJIILLIIL(1);
        } else {
            VideoPublishEditModel videoPublishEditModel5 = c2217061Bpw.LIZ;
            long j5 = c2217061Bpw.LJIJI;
            boolean z6 = c2217061Bpw.LJFF;
            String str6 = c2217061Bpw.LJJI;
            u4.LJJJLZIJ(videoPublishEditModel5, j5, "error", z6 ? 1 : 0, str6, Boolean.valueOf(Intrinsics.LJFF(str6, "auto_language")), z, str);
            VideoPublishEditModel videoPublishEditModel6 = c2217061Bpw.LIZ;
            long j6 = c2217061Bpw.LJIJI;
            String str7 = c2217061Bpw.LJIILJJIL.LJIJ;
            boolean z7 = c2217061Bpw.LJFF;
            u4.LJJLIIIJILLIZJL(videoPublishEditModel6, j6, "fail", str7, z7 ? 1 : 0, c2217061Bpw.LJJI, 24);
            c2217061Bpw.LJIILLIIL(1);
            C0EVI c0evi4 = c2217061Bpw.LJIIJ;
            if (c0evi4 != null) {
                c0evi4.AD();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS17S1210000_5 awS17S1210000_5) {
        C370320EfW c370320EfW = ((C0EJ9) awS17S1210000_5.l1).LLLF;
        if (c370320EfW != null) {
            c370320EfW.LLLII(awS17S1210000_5.s0, (C361980EHc) awS17S1210000_5.l2, awS17S1210000_5.z3);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS17S1210000_5 awS17S1210000_5) {
        C370320EfW c370320EfW = ((C0EJ9) awS17S1210000_5.l1).LLL;
        if (c370320EfW != null) {
            c370320EfW.LLLII(awS17S1210000_5.s0, (C361980EHc) awS17S1210000_5.l2, awS17S1210000_5.z3);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS17S1210000_5(C0EJ9 c0ej9, String str, C361980EHc c361980EHc, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l1 = c0ej9;
        this.s0 = str;
        this.l2 = c361980EHc;
        this.z3 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS17S1210000_5(C2217061Bpw c2217061Bpw, Throwable th, boolean z, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c2217061Bpw;
        this.l2 = th;
        this.z3 = z;
        this.s0 = str;
    }
}
