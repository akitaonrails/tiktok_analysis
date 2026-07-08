package kotlin.jvm.internal;

import X.C09AY;
import X.C2188811AlT;
import android.widget.TextView;
import com.ss.android.ugc.aweme.inbox.bulletin.assem.poll.PollCreateContentAssem;
import com.ss.android.ugc.aweme.livephoto.vh.LivePhotoViewHolder;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes10.dex */
public class AwS35S1101000_9 extends C09AY implements Function0 {
    public final int $t;
    public int i2;
    public Object l1;
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

    public static final Object invoke$0(AwS35S1101000_9 awS35S1101000_9) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(((LivePhotoViewHolder) awS35S1101000_9.l1).hashCode());
        sbLIZ.append(" onPlayCompleted sourceId: ");
        sbLIZ.append(awS35S1101000_9.s0);
        sbLIZ.append(" playCount: ");
        sbLIZ.append(awS35S1101000_9.i2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(AwS35S1101000_9 awS35S1101000_9) {
        PollCreateContentAssem pollCreateContentAssem = (PollCreateContentAssem) awS35S1101000_9.l1;
        int i = awS35S1101000_9.i2;
        String str = awS35S1101000_9.s0;
        pollCreateContentAssem.kp().LLILZ = i;
        ((TextView) pollCreateContentAssem.getContentView().findViewById(R.id.d2v)).setText(str);
        return Boolean.TRUE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS35S1101000_9(PollCreateContentAssem pollCreateContentAssem, int i, String str, int i2) {
        super(0);
        this.$t = i2;
        this.l1 = pollCreateContentAssem;
        this.i2 = i;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS35S1101000_9(LivePhotoViewHolder livePhotoViewHolder, String str, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l1 = livePhotoViewHolder;
        this.s0 = str;
        this.i2 = i;
    }
}
