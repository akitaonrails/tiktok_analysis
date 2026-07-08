package kotlin.jvm.internal;

import X.C09AY;
import X.C1023640ckE;
import X.C2249261D1w;
import X.C443120HZe;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.ftc.components.cutmusic.FTCEditMusicCutState;
import com.ss.android.ugc.aweme.shortvideo.AVMusicWaveBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes36.dex */
public class AwS37S0102000_35 extends C09AY implements Function1 {
    public final int $t;
    public int i1;
    public int i2;
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

    public static final Object invoke$0(AwS37S0102000_35 awS37S0102000_35, Object obj) {
        FTCEditMusicCutState fTCEditMusicCutState = (FTCEditMusicCutState) obj;
        return fTCEditMusicCutState.copy(new C443120HZe<>((AVMusicWaveBean) awS37S0102000_35.l0, Integer.valueOf(awS37S0102000_35.i1), Integer.valueOf(awS37S0102000_35.i2)), fTCEditMusicCutState.videoLength, fTCEditMusicCutState.ui);
    }

    public static final Object invoke$1(AwS37S0102000_35 awS37S0102000_35, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        c1023640ckE.withContext((Aweme) awS37S0102000_35.l0);
        C2249261D1w.LIZ.getClass();
        c1023640ckE.withParam(C2249261D1w.LIZJ, Integer.valueOf(awS37S0102000_35.i1));
        c1023640ckE.withParam(C2249261D1w.LIZLLL, Integer.valueOf(awS37S0102000_35.i2));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS37S0102000_35(int i, int i2, Aweme aweme, int i3) {
        super(1);
        this.$t = i3;
        this.l0 = aweme;
        this.i1 = i;
        this.i2 = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS37S0102000_35(AVMusicWaveBean aVMusicWaveBean, int i, int i2, int i3) {
        super(1);
        this.$t = i3;
        this.l0 = aVMusicWaveBean;
        this.i1 = i;
        this.i2 = i2;
    }
}
