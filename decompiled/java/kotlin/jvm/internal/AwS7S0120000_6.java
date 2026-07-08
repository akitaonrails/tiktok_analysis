package kotlin.jvm.internal;

import X.C09AY;
import X.C1163440gNi;
import X.C13LE;
import X.C628830OlV;
import com.ss.android.ugc.aweme.detail.prefab.DetailHeaderAssem;
import com.ss.android.ugc.aweme.detail.prefab.HeaderBasicInfoAssem;
import com.ss.android.ugc.aweme.template.TemplateDetailFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public class AwS7S0120000_6 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public boolean z1;
    public boolean z2;

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

    public static final Object invoke$0(AwS7S0120000_6 awS7S0120000_6, Object obj) {
        C628830OlV c628830OlV = (C628830OlV) obj;
        c628830OlV.LL = C13LE.LIZ(HeaderBasicInfoAssem.class);
        c628830OlV.LLJIJIL = C1163440gNi.LIZJ;
        c628830OlV.LJ(Boolean.FALSE, "is_image_right");
        c628830OlV.LJII("cover", new AwS97S0110000_9((TemplateDetailFragment) awS7S0120000_6.l0, awS7S0120000_6.z1, 7));
        c628830OlV.LJII("desc", new AwS21S0010000_6(awS7S0120000_6.z2, 5));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS7S0120000_6 awS7S0120000_6, Object obj) {
        C628830OlV c628830OlV = (C628830OlV) obj;
        c628830OlV.LL = C13LE.LIZ(DetailHeaderAssem.class);
        c628830OlV.LLJIJIL = C1163440gNi.LIZJ;
        c628830OlV.LJII("basic_info", new AwS7S0120000_6((TemplateDetailFragment) awS7S0120000_6.l0, awS7S0120000_6.z1, awS7S0120000_6.z2, 0));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS7S0120000_6(TemplateDetailFragment templateDetailFragment, boolean z, boolean z2, int i) {
        super(1);
        this.$t = i;
        this.l0 = templateDetailFragment;
        this.z1 = z;
        this.z2 = z2;
    }
}
