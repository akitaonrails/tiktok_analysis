package kotlin.jvm.internal;

import X.C09AY;
import X.C0ND6;
import X.C0NEU;
import X.C0NEW;
import X.C0VSJ;
import X.C2188811AlT;
import X.C590420NDs;
import X.C797930VRv;
import com.ss.android.ugc.aweme.music.cache.CacheManager;
import defpackage.x0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes10.dex */
public class AwS94S1000000_9 extends C09AY implements Function0 {
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
            case 4:
                return this.s0;
            case 5:
                return invoke$5(this);
            case 6:
                return this.s0;
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS94S1000000_9 awS94S1000000_9) {
        String strLJIIJ;
        int i;
        C0VSJ c0vsjLIZIZ;
        x0 x0Var = x0.LIZ;
        x0Var.LJII(C0ND6.LIZIZ, awS94S1000000_9.s0);
        int i2 = C0ND6.LIZIZ;
        C0NEW c0new = C0NEW.DB;
        if (i2 != c0new.getValue()) {
            x0Var.LJII(c0new.getValue(), awS94S1000000_9.s0);
        }
        if (C0ND6.LIZIZ != c0new.getValue()) {
            int i3 = C0ND6.LIZIZ;
            C0NEW c0new2 = C0NEW.ORIGIN;
            if (i3 == c0new2.getValue()) {
                C590420NDs.LIZ.getClass();
                strLJIIJ = C590420NDs.LJIIJ();
            } else {
                strLJIIJ = "";
            }
            if (strLJIIJ.length() == 0 && (i = C0ND6.LIZIZ) == c0new2.getValue() && (c0vsjLIZIZ = C0NEU.LIZIZ()) != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("KeepUnusedVideoWrapper deleteFeedFile, curVersion:");
                sbLIZ.append(i);
                C797930VRv.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
                c0vsjLIZIZ.delete();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS94S1000000_9 awS94S1000000_9) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("checkTryInsertCache by ");
        sbLIZ.append(awS94S1000000_9.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$2(AwS94S1000000_9 awS94S1000000_9) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPlayStop. sourceId=");
        sbLIZ.append(awS94S1000000_9.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$3(AwS94S1000000_9 awS94S1000000_9) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("not contains ");
        sbLIZ.append(awS94S1000000_9.s0);
        sbLIZ.append(" in cache");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$5(AwS94S1000000_9 awS94S1000000_9) {
        CacheManager.LIZ.getClass();
        CacheManager.LIZ().erase(awS94S1000000_9.s0);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS94S1000000_9(String str, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
    }
}
