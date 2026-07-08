package kotlin.jvm.internal;

import X.C09AY;
import X.C0CHQ;
import X.C1163440gNi;
import X.C13LE;
import X.C19292410dm;
import X.C627500OjM;
import X.C628830OlV;
import X.C713240RyM;
import com.ss.android.ugc.aweme.detail.prefab.DetailPageContainerAssem;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.template.TemplateAnchorConfig;
import com.ss.android.ugc.aweme.template.TemplateDetailFragment;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes10.dex */
public class AwS8S0120000_9 extends C09AY implements Function1 {
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

    public static final Object invoke$0(AwS8S0120000_9 awS8S0120000_9, Object obj) {
        boolean z;
        C628830OlV c628830OlV = (C628830OlV) obj;
        c628830OlV.LL = C13LE.LIZ(DetailPageContainerAssem.class);
        c628830OlV.LLJIJIL = C1163440gNi.LIZJ;
        c628830OlV.LLIZLLLIL = R.id.ex3;
        c628830OlV.LJ(Boolean.TRUE, "prop_disable_refresh");
        c628830OlV.LJII("navbar", AFwS236S0000000_6.get$arr$(366));
        c628830OlV.LJII(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, new AwS588S0100000_9((TemplateDetailFragment) awS8S0120000_9.l0, 391));
        TemplateDetailFragment templateDetailFragment = (TemplateDetailFragment) awS8S0120000_9.l0;
        boolean z2 = awS8S0120000_9.z1;
        boolean z3 = awS8S0120000_9.z2;
        templateDetailFragment.getClass();
        if (C627500OjM.LIZ()) {
            c628830OlV.LJII("header", new AwS7S0120000_6(templateDetailFragment, z3, z2, 1));
            C19292410dm currentUser = C0CHQ.LIZ().getAccountService().getCurrentUser();
            if (currentUser != null && currentUser.LIZLLL() == 3) {
                z = true;
            } else {
                z = false;
            }
            TemplateAnchorConfig templateAnchorConfig = templateDetailFragment.LLJI;
            if (templateAnchorConfig == null || !Intrinsics.LJFF(templateAnchorConfig.isCommerceMusic(), Boolean.FALSE) || !z) {
                c628830OlV.LJII("record", AFwS240S0000000_9.get$arr$(621));
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS8S0120000_9 awS8S0120000_9, Object obj) {
        TemplateDetailFragment templateDetailFragment = (TemplateDetailFragment) awS8S0120000_9.l0;
        C713240RyM.LIZ(templateDetailFragment, new AwS8S0120000_9(templateDetailFragment, awS8S0120000_9.z1, awS8S0120000_9.z2, 0));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS8S0120000_9(TemplateDetailFragment templateDetailFragment, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = templateDetailFragment;
        this.z1 = true;
        this.z2 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS8S0120000_9(TemplateDetailFragment templateDetailFragment, boolean z, boolean z2, int i) {
        super(1);
        this.$t = i;
        this.l0 = templateDetailFragment;
        this.z1 = z;
        this.z2 = z2;
    }
}
