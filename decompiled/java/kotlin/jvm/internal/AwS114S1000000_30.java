package kotlin.jvm.internal;

import X.C09AY;
import X.C0E21;
import X.C0VSJ;
import X.C14ZY;
import X.C1720106oR;
import X.C20137613qo;
import X.C20144413ru;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C2354709Kn;
import android.media.MediaMetadataRetriever;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.vesdk.VEUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes31.dex */
public class AwS114S1000000_30 extends C09AY implements Function0 {
    public final int $t;
    public String s0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS114S1000000_30 awS114S1000000_30) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("tracker", awS114S1000000_30.s0);
        c2344009Gk.LIZJ(C14ZY.LIZ, "cold_launch_count");
        return c2344009Gk.LIZ;
    }

    public static final Object invoke$1(AwS114S1000000_30 awS114S1000000_30) {
        C2354709Kn.LJIJJLI(awS114S1000000_30.s0);
        int i = C2187451AjH.LIZ;
        C1720106oR.LIZ("minis-GuidanceLottie", "Load Fail");
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS114S1000000_30 awS114S1000000_30) {
        C0E21 c0e21;
        int i;
        int[] iArr = new int[10];
        int audioFileInfo = VEUtils.getAudioFileInfo(awS114S1000000_30.s0, iArr);
        int i2 = 0;
        if (awS114S1000000_30.s0.length() != 0 && new C0VSJ(awS114S1000000_30.s0).exists()) {
            if (audioFileInfo == 0 && (i = iArr[3]) > 0) {
                c0e21 = new C0E21(i);
            } else {
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                try {
                    mediaMetadataRetriever.setDataSource(awS114S1000000_30.s0);
                    String strLIZJ = C20144413ru.LIZJ(mediaMetadataRetriever);
                    if (strLIZJ != null) {
                        i2 = CastIntegerProtector.parseInt(strLIZJ);
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                c0e21 = new C0E21(i2);
            }
        } else {
            c0e21 = new C0E21(0);
        }
        C20137613qo.LIZJ.put(awS114S1000000_30.s0, c0e21);
        return c0e21;
    }

    public static final Object invoke$3(AwS114S1000000_30 awS114S1000000_30) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoWs send: ");
        sbLIZ.append(awS114S1000000_30.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS114S1000000_30(String str, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
    }
}
