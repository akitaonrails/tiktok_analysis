package kotlin.jvm.internal;

import X.C09AY;
import X.C2238181Ciu;
import X.C786410Ut5;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.profilebanner.data.ProfileBannerInfoModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes35.dex */
public class AwS48S0310000_34 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public boolean z3;

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

    public static final Object invoke$0(AwS48S0310000_34 awS48S0310000_34, Object obj) {
        C2238181Ciu c2238181Ciu = (C2238181Ciu) awS48S0310000_34.l0;
        Context context = (Context) awS48S0310000_34.l1;
        UrlModel urlModel = ((ProfileBannerInfoModel) awS48S0310000_34.l2).iconUrl;
        boolean z = awS48S0310000_34.z3;
        c2238181Ciu.getClass();
        C2238181Ciu.LIZJ(context, (FrameLayout) obj, urlModel, z);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AwS48S0310000_34 awS48S0310000_34, Object obj) {
        FrameLayout frameLayout = (FrameLayout) obj;
        C786410Ut5.LJJJJIZL(frameLayout);
        C2238181Ciu c2238181Ciu = (C2238181Ciu) awS48S0310000_34.l0;
        Context context = ((View) awS48S0310000_34.l1).getContext();
        UrlModel urlModel = ((ProfileBannerInfoModel) awS48S0310000_34.l2).iconUrl;
        boolean z = awS48S0310000_34.z3;
        c2238181Ciu.getClass();
        C2238181Ciu.LIZJ(context, frameLayout, urlModel, z);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS48S0310000_34(C2238181Ciu c2238181Ciu, Context context, ProfileBannerInfoModel profileBannerInfoModel, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = c2238181Ciu;
        this.l1 = context;
        this.l2 = profileBannerInfoModel;
        this.z3 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS48S0310000_34(C2238181Ciu c2238181Ciu, View view, ProfileBannerInfoModel profileBannerInfoModel, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = c2238181Ciu;
        this.l1 = view;
        this.l2 = profileBannerInfoModel;
        this.z3 = z;
    }
}
