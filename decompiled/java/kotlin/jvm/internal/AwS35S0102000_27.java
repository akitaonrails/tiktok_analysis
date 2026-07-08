package kotlin.jvm.internal;

import X.C09AY;
import X.C1853060yK0;
import X.C291001Au;
import com.ss.android.ugc.aweme.tako.multipletemplate.gallery.PreviewMediaState;
import com.ss.android.ugc.aweme.tako.multipletemplate.gallery.TikTokMediaModel;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes28.dex */
public class AwS35S0102000_27 extends C09AY implements Function1 {
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

    public static final Object invoke$0(AwS35S0102000_27 awS35S0102000_27, Object obj) {
        return C1853060yK0.LIZ((C1853060yK0) obj, new PreviewMediaState((TikTokMediaModel) awS35S0102000_27.l0, awS35S0102000_27.i2), null, false, new C291001Au(Integer.valueOf(awS35S0102000_27.i1)), null, null, null, false, null, null, null, null, null, 0, null, 65526);
    }

    public static final Object invoke$1(AwS35S0102000_27 awS35S0102000_27, Object obj) {
        return C1853060yK0.LIZ((C1853060yK0) obj, new PreviewMediaState((TikTokMediaModel) awS35S0102000_27.l0, awS35S0102000_27.i2), null, false, new C291001Au(Integer.valueOf(awS35S0102000_27.i1)), null, null, null, false, null, null, null, null, null, 0, null, 65526);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS35S0102000_27(int i, TikTokMediaModel tikTokMediaModel, int i2, int i3) {
        super(1);
        this.$t = i3;
        this.i1 = i;
        this.l0 = tikTokMediaModel;
        this.i2 = i2;
    }
}
