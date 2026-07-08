package kotlin.jvm.internal;

import X.C09AY;
import X.C0N0Y;
import X.C14TT;
import X.C14TU;
import X.C2097608Jq;
import X.C586940N0i;
import Y.ARunnableS109S0100000_9;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes27.dex */
public class AwS17S0111000_26 extends C09AY implements Function0 {
    public final int $t;
    public int i2;
    public Object l0;
    public boolean z1;

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

    public static final Object invoke$0(AwS17S0111000_26 awS17S0111000_26) {
        int duration;
        Video video;
        C586940N0i mVideoControl = ((C14TT) awS17S0111000_26.l0).getMVideoControl();
        if (mVideoControl != null) {
            int i = awS17S0111000_26.i2;
            C14TT c14tt = (C14TT) awS17S0111000_26.l0;
            boolean z = awS17S0111000_26.z1;
            float f = i;
            Aweme aweme = c14tt.LLILZ;
            if (aweme != null && (video = aweme.getVideo()) != null) {
                duration = video.getDuration();
            } else {
                duration = 100;
            }
            float f2 = (f / duration) * 100;
            C0N0Y c0n0y = mVideoControl.LIZIZ;
            if (c0n0y != null) {
                c0n0y.seek(f2);
            }
            c14tt.LJIIL("onSeeked", C2097608Jq.LJI(new Pair("progress", Integer.valueOf(i))));
            if (!z) {
                HandlerHook.viewPostDelay(c14tt, new ARunnableS109S0100000_9(mVideoControl, 29), 500L);
            }
        }
        ((C14TT) awS17S0111000_26.l0).LLJJL = true ^ awS17S0111000_26.z1;
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS17S0111000_26 awS17S0111000_26) {
        int duration;
        Video video;
        C586940N0i videoControl = ((C14TU) awS17S0111000_26.l0).getVideoControl();
        if (videoControl != null) {
            int i = awS17S0111000_26.i2;
            C14TU c14tu = (C14TU) awS17S0111000_26.l0;
            boolean z = awS17S0111000_26.z1;
            float f = i;
            Aweme aweme = c14tu.getAweme();
            if (aweme != null && (video = aweme.getVideo()) != null) {
                duration = video.getDuration();
            } else {
                duration = 100;
            }
            float f2 = (f / duration) * 100;
            C0N0Y c0n0y = videoControl.LIZIZ;
            if (c0n0y != null) {
                c0n0y.seek(f2);
            }
            c14tu.LJII("onSeeked", C2097608Jq.LJI(new Pair("progress", Integer.valueOf(i))));
            if (!z) {
                HandlerHook.viewPostDelay(c14tu, new ARunnableS109S0100000_9(videoControl, 146), 500L);
            }
        }
        ((C14TU) awS17S0111000_26.l0).LLJJJJJIL = true ^ awS17S0111000_26.z1;
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS17S0111000_26(C14TT c14tt, boolean z, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c14tt;
        this.z1 = z;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS17S0111000_26(C14TU c14tu, boolean z, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c14tu;
        this.z1 = z;
        this.i2 = i;
    }
}
