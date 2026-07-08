package kotlin.jvm.internal;

import X.C09AY;
import X.C09K7;
import X.C0PEM;
import X.C1322110kVd;
import X.C1418905gx;
import X.C1428520nHG;
import X.C1443990ngD;
import X.C19EG;
import X.C2296808zG;
import X.C23250099c;
import X.C259800zU;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public class AwS39S0500000_3 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

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

    public static final Object invoke$0(AwS39S0500000_3 awS39S0500000_3, Object obj) {
        C09K7 c09k7;
        ((Boolean) obj).booleanValue();
        C1443990ngD c1443990ngD = C1443990ngD.LIZ;
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) awS39S0500000_3.l0;
        C1322110kVd c1322110kVd = (C1322110kVd) awS39S0500000_3.l1;
        C19EG c19eg = (C19EG) awS39S0500000_3.l2;
        c1443990ngD.getClass();
        if (((Boolean) C1443990ngD.LIZIZ.getValue()).booleanValue()) {
            c09k7 = (C09K7) awS39S0500000_3.l3;
        } else {
            c09k7 = null;
        }
        C1443990ngD.LJIIJJI(videoPublishEditModel, c1322110kVd, c19eg, c09k7, (LifecycleOwner) awS39S0500000_3.l4);
        return Unit.LIZ;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [T, java.lang.Object] */
    public static final Object invoke$1(AwS39S0500000_3 awS39S0500000_3, Object obj) {
        ((Boolean) obj).booleanValue();
        if (((C19EG) awS39S0500000_3.l0) != null) {
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) awS39S0500000_3.l1;
            C1322110kVd c1322110kVd = (C1322110kVd) awS39S0500000_3.l2;
            AwS369S0200000_3 awS369S0200000_3 = new AwS369S0200000_3((Function0) awS39S0500000_3.l3, (Function0<Unit>) awS39S0500000_3.l4, (C09K7) 20);
            C259800zU c259800zU = new C259800zU();
            Pair<String, Integer> pairLJJIIJZLJL = C1428520nHG.LJJIIJZLJL(videoPublishEditModel, false, null, false, 2);
            if (pairLJJIIJZLJL != null) {
                c259800zU.element = pairLJJIIJZLJL.getFirst();
            }
            CharSequence charSequence = (CharSequence) c259800zU.element;
            if (charSequence != null && charSequence.length() != 0) {
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1418905gx(c259800zU, c1322110kVd, awS369S0200000_3, videoPublishEditModel, null), 3);
            } else {
                awS369S0200000_3.invoke(null);
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS39S0500000_3(C19EG c19eg, VideoPublishEditModel videoPublishEditModel, C1322110kVd c1322110kVd, AwS75S0500000_14 awS75S0500000_14, C09K7 c09k7, int i) {
        super(1);
        this.$t = i;
        this.l0 = c19eg;
        this.l1 = videoPublishEditModel;
        this.l2 = c1322110kVd;
        this.l3 = awS75S0500000_14;
        this.l4 = c09k7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS39S0500000_3(VideoPublishEditModel videoPublishEditModel, C1322110kVd c1322110kVd, C19EG c19eg, C09K7 c09k7, LifecycleOwner lifecycleOwner, int i) {
        super(1);
        this.$t = i;
        this.l0 = videoPublishEditModel;
        this.l1 = c1322110kVd;
        this.l2 = c19eg;
        this.l3 = c09k7;
        this.l4 = lifecycleOwner;
    }
}
