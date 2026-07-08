package kotlin.jvm.internal;

import X.C09AY;
import X.C0VSJ;
import X.C1211030hcT;
import X.C19532411bO;
import X.C19549211e6;
import X.C19684811zy;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.feed.model.im.MixStickerInfo;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes30.dex */
public class AwS91S1300000_29 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS91S1300000_29 awS91S1300000_29) {
        if (Intrinsics.LJFF(awS91S1300000_29.s0, "DownloadMemeSong")) {
            C19532411bO c19532411bO = (C19532411bO) awS91S1300000_29.l1;
            if (!c19532411bO.LIZ) {
                c19532411bO.LIZ = true;
                ((C1211030hcT) awS91S1300000_29.l2).LIZ(60, 99, Mp4ScreenVideoLoadTimeout.CONTROL, new AwS608S0100000_29((C19549211e6) awS91S1300000_29.l3, 1));
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS91S1300000_29 awS91S1300000_29) {
        ((C19684811zy) awS91S1300000_29.l1).w2((File) awS91S1300000_29.l2, awS91S1300000_29.s0, (MixStickerInfo) awS91S1300000_29.l3);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS91S1300000_29(C19684811zy c19684811zy, C0VSJ c0vsj, String str, MixStickerInfo mixStickerInfo, int i) {
        super(0);
        this.$t = i;
        this.l1 = c19684811zy;
        this.l2 = c0vsj;
        this.s0 = str;
        this.l3 = mixStickerInfo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS91S1300000_29(String str, C19532411bO c19532411bO, C1211030hcT c1211030hcT, C19549211e6 c19549211e6, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = c19532411bO;
        this.l2 = c1211030hcT;
        this.l3 = c19549211e6;
    }
}
