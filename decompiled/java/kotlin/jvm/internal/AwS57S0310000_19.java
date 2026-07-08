package kotlin.jvm.internal;

import X.C06MM;
import X.C09AY;
import X.C0C64;
import X.C0I0B;
import X.C1229030i5V;
import X.C1244170iTv;
import X.C1244210iTz;
import X.C1244220iU0;
import X.C1383370m6R;
import X.C1389890mGx;
import X.C19EH;
import X.C824420WVs;
import android.app.Activity;
import android.content.Context;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.comment.poll.PollCreateFragment;
import com.ss.android.ugc.aweme.commentv2.keyboard.inboxquickcomment.SingleKeyboardFragment;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.bulletinboard.BulletinBoardFeature;
import com.ss.android.ugc.aweme.setting.serverpush.compose.login.PushSettingsLoginVM;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes20.dex */
public class AwS57S0310000_19 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public boolean z3;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS57S0310000_19 awS57S0310000_19) throws Throwable {
        if (((SingleKeyboardFragment) awS57S0310000_19.l0).isViewValid() && !((SingleKeyboardFragment) awS57S0310000_19.l0).getChildFragmentManager().LJLJJI()) {
            C19EH c19ehLJIIJ = ((SingleKeyboardFragment) awS57S0310000_19.l0).getChildFragmentManager().LJIIJ();
            c19ehLJIIJ.LJIIZILJ((PollCreateFragment) awS57S0310000_19.l1);
            c19ehLJIIJ.LJIIL();
            ((SingleKeyboardFragment) awS57S0310000_19.l0).NR(awS57S0310000_19.z3);
        } else {
            ((SingleKeyboardFragment) awS57S0310000_19.l0).NR(awS57S0310000_19.z3);
        }
        Function0 function0 = (Function0) awS57S0310000_19.l2;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS57S0310000_19 awS57S0310000_19) {
        boolean z;
        C1229030i5V.LIZJ.LJ((List) awS57S0310000_19.l0, "bulletin_board", C0I0B.LJFF.LIZIZ());
        if (awS57S0310000_19.z3) {
            Activity activityLIZ = C06MM.LIZ((Context) awS57S0310000_19.l1);
            if (activityLIZ != null) {
                TuxIconView tuxIconView = (TuxIconView) awS57S0310000_19.l2;
                BulletinBoardFeature bulletinBoardFeatureLIZ = BulletinBoardFeature.LIZ.LIZ();
                if (bulletinBoardFeatureLIZ != null) {
                    bulletinBoardFeatureLIZ.LLILL(activityLIZ, tuxIconView, "create_group_menu", null);
                }
            }
            z = true;
        } else {
            C1389890mGx c1389890mGx = new C1389890mGx((TuxIconView) awS57S0310000_19.l2);
            c1389890mGx.LJIIJ(C1383370m6R.LJIIJ(2131828091));
            c1389890mGx.LJIIJJI();
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$2(AwS57S0310000_19 awS57S0310000_19) {
        if (awS57S0310000_19.z3 || !((C1244220iU0) awS57S0310000_19.l0).LLJJI.LIZ() || C824420WVs.LIZIZ((Context) awS57S0310000_19.l1, "click_email_push_cell")) {
            if (C0C64.LJIILLIIL().LJIIIZ(31744, "edm_setting_binding_popup", true, false)) {
                ((PushSettingsLoginVM) awS57S0310000_19.l2).AQ2(C1244210iTz.LIZ);
            } else {
                C1244170iTv.LIZ.getClass();
                C1244170iTv.LIZIZ();
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS57S0310000_19(SingleKeyboardFragment singleKeyboardFragment, SingleKeyboardFragment singleKeyboardFragment2, boolean z, PollCreateFragment pollCreateFragment, Function0<Unit> function0) {
        super(0);
        this.$t = function0;
        this.l0 = singleKeyboardFragment;
        this.z3 = singleKeyboardFragment2;
        this.l1 = z;
        this.l2 = pollCreateFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS57S0310000_19(List list, List<String> list2, boolean z, Context context, TuxIconView tuxIconView) {
        super(0);
        this.$t = tuxIconView;
        this.l0 = list;
        this.z3 = list2;
        this.l1 = z;
        this.l2 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS57S0310000_19(boolean z, C1244220iU0 c1244220iU0, Context context, PushSettingsLoginVM pushSettingsLoginVM, int i) {
        super(0);
        this.$t = i;
        this.z3 = z;
        this.l0 = c1244220iU0;
        this.l1 = context;
        this.l2 = pushSettingsLoginVM;
    }
}
