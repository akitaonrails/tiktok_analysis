package kotlin.jvm.internal;

import X.C09AY;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.livephoto.vh.LivePhotoViewHolder;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes10.dex */
public class AwS17S1110000_9 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
    public String s0;
    public boolean z2;

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

    public static final Object invoke$0(AwS17S1110000_9 awS17S1110000_9) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(((LivePhotoViewHolder) awS17S1110000_9.l1).hashCode());
        sbLIZ.append(" onBuffering sourceId ");
        sbLIZ.append(awS17S1110000_9.s0);
        sbLIZ.append(" start: ");
        sbLIZ.append(awS17S1110000_9.z2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(AwS17S1110000_9 awS17S1110000_9) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(((LivePhotoViewHolder) awS17S1110000_9.l1).hashCode());
        sbLIZ.append(" onSeekEnd sourceId: ");
        sbLIZ.append(awS17S1110000_9.s0);
        sbLIZ.append(" success: ");
        sbLIZ.append(awS17S1110000_9.z2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS17S1110000_9(LivePhotoViewHolder livePhotoViewHolder, String str, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l1 = livePhotoViewHolder;
        this.s0 = str;
        this.z2 = z;
    }
}
