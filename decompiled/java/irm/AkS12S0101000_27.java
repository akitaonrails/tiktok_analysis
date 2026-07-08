package irm;

import X.AbstractViewOnClickListenerC1173120gdK;
import android.view.View;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.replaylist.ui.LiveReplayCell;

/* JADX INFO: loaded from: classes28.dex */
public class AkS12S0101000_27 extends AbstractViewOnClickListenerC1173120gdK {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // X.AbstractViewOnClickListenerC1173120gdK
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            case 2:
                LIZ$2(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    public static final void LIZ$0(AkS12S0101000_27 akS12S0101000_27, View view) {
        ((LiveReplayCell) akS12S0101000_27.l0).N5(akS12S0101000_27.i1, "highlight_cover");
    }

    public static final void LIZ$1(AkS12S0101000_27 akS12S0101000_27, View view) {
        ((LiveReplayCell) akS12S0101000_27.l0).L5(akS12S0101000_27.i1, "mix_cover", "mix_cover");
    }

    public static final void LIZ$2(AkS12S0101000_27 akS12S0101000_27, View view) {
        ((LiveReplayCell) akS12S0101000_27.l0).L5(akS12S0101000_27.i1, "post", "post");
    }

    public AkS12S0101000_27(LiveReplayCell liveReplayCell, int i, int i2) {
        this.$t = i2;
        this.l0 = liveReplayCell;
        this.i1 = i;
    }
}
