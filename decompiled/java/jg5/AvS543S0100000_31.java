package jg5;

import X.AbstractC20611515l3;
import X.C1DRG;
import X.C20734616Bs;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.ui.scene.ImagePublishFullPagePreviewScene;

/* JADX INFO: loaded from: classes32.dex */
public class AvS543S0100000_31 extends AbstractC20611515l3 {
    public final int $t;
    public Object l0;

    /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, java.lang.Object] */
    @Override // X.AbstractC20611515l3
    public final VideoPublishEditModel LIZIZ(C1DRG c1drg) {
        switch (this.$t) {
            case 0:
                return LIZIZ$0(this, c1drg);
            case 1:
                return LIZIZ$1(this, c1drg);
            default:
                return super.LIZIZ(c1drg);
        }
    }

    public AvS543S0100000_31(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object LIZIZ$0(AvS543S0100000_31 avS543S0100000_31, C1DRG c1drg) {
        return ((ImagePublishFullPagePreviewScene) avS543S0100000_31.l0).LLJJL;
    }

    public static final Object LIZIZ$1(AvS543S0100000_31 avS543S0100000_31, C1DRG c1drg) {
        return ((C20734616Bs) avS543S0100000_31.l0).requireActivity();
    }
}
