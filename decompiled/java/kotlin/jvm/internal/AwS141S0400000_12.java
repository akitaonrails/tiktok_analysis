package kotlin.jvm.internal;

import X.1JLc;
import X.C013C;
import X.C09AY;
import X.C0TEO;
import X.C0TN5;
import X.C0TUL;
import X.C0TVK;
import X.C0UOO;
import X.C0UP6;
import X.C0UPF;
import X.C0UQL;
import X.C0UTJ;
import X.C12FB;
import X.C1388190mED;
import X.C1389890mGx;
import X.C20441214yg;
import X.C20684815ws;
import X.C2344009Gk;
import X.C259800zU;
import X.C915190ZvJ;
import X.EnumC20429314wl;
import X.InterfaceC665370Q7z;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.DialogFragment;
import com.byted.cast.common.config.Config;
import com.byted.cast.common.config.IInitListener;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.account.security.SecurityCheckUpViewModel;
import com.ss.android.ugc.aweme.tako.botpage.components.action.multiple.TakoMultipleSelectVM;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes13.dex */
public class AwS141S0400000_12 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS141S0400000_12 awS141S0400000_12) {
        ((C0UTJ) awS141S0400000_12.l0).LJJIFFI(((C0UPF) awS141S0400000_12.l1).LIZIZ((C0UP6) awS141S0400000_12.l2, (DataChannel) awS141S0400000_12.l3), "fyp_go_live_button", new C915190ZvJ("fyp_go_live_button", false, 6), EnumC20429314wl.INTERACT, false);
        C20441214yg.LIZIZ("PlayBookViewModel", "showPlayBook, show playbook dialog");
        C0UOO.LIZ(C0UQL.PLAYBOOK);
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$1(AwS141S0400000_12 awS141S0400000_12) {
        1JLc r3 = ((C0TEO) awS141S0400000_12.l0).LIZJ;
        if (r3 != null) {
            r3.LJFF((Context) awS141S0400000_12.l1, (Config) awS141S0400000_12.l2, (IInitListener) awS141S0400000_12.l3);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$2(AwS141S0400000_12 awS141S0400000_12) {
        SecurityCheckUpViewModel securityCheckUpViewModel = (SecurityCheckUpViewModel) awS141S0400000_12.l0;
        C0TVK c0tvk = C0TVK.DEVICE;
        securityCheckUpViewModel.LLILZIL = c0tvk;
        C0TN5 c0tn5 = C0TN5.LIZ;
        String str = securityCheckUpViewModel.vQ2().LLILLJJLI;
        boolean z = !((C013C) awS141S0400000_12.l1).element;
        c0tn5.getClass();
        C0TN5.LIZ(c0tvk, str, z);
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute((Context) awS141S0400000_12.l2, "aweme://webview/");
        smartRouteBuildRoute.withParam("url", UriProtector.parse((String) ((C259800zU) awS141S0400000_12.l3).element).buildUpon().appendQueryParameter("url", (String) ((C259800zU) awS141S0400000_12.l3).element).appendQueryParameter("use_spark", "1").appendQueryParameter("hide_nav_bar", "1").build().toString());
        smartRouteBuildRoute.open();
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS141S0400000_12 awS141S0400000_12) {
        TakoMultipleSelectVM takoMultipleSelectVM = (TakoMultipleSelectVM) awS141S0400000_12.l0;
        if (takoMultipleSelectVM != null) {
            takoMultipleSelectVM.BQ2((InterfaceC665370Q7z) awS141S0400000_12.l1, new AwS378S0200000_12((View) awS141S0400000_12.l3, takoMultipleSelectVM, 99));
        }
        C12FB.LIZJ("save", (Map) awS141S0400000_12.l2);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS141S0400000_12 awS141S0400000_12) {
        TakoMultipleSelectVM takoMultipleSelectVM = (TakoMultipleSelectVM) awS141S0400000_12.l0;
        if (takoMultipleSelectVM != null) {
            InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) awS141S0400000_12.l1;
            takoMultipleSelectVM.BQ2(interfaceC665370Q7z, new AwS212S0300000_3((View) awS141S0400000_12.l3, interfaceC665370Q7z, takoMultipleSelectVM, 11));
        }
        C12FB.LIZJ("post", (Map) awS141S0400000_12.l2);
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$5(AwS141S0400000_12 awS141S0400000_12) {
        Activity activityLIZ = C1388190mED.LIZ((Context) awS141S0400000_12.l0);
        if (activityLIZ != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
            c1389890mGx.LJIIIZ(2131829102);
            c1389890mGx.LJIIJJI();
        }
        C0TUL c0tul = (C0TUL) awS141S0400000_12.l1;
        if (c0tul != null) {
            c0tul.LIZLLL(4);
        }
        DialogFragment dialogFragment = (DialogFragment) ((C259800zU) awS141S0400000_12.l2).element;
        if (dialogFragment != null) {
            dialogFragment.dismiss();
        }
        C20684815ws.LJIILLIIL("comment_rethink_mistake_ck", ((C2344009Gk) awS141S0400000_12.l3).LIZ);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS141S0400000_12(C0TEO c0teo, Context context, Config config, IInitListener iInitListener, int i) {
        super(0);
        this.$t = i;
        this.l0 = c0teo;
        this.l1 = context;
        this.l2 = config;
        this.l3 = iInitListener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS141S0400000_12(C0UTJ c0utj, C0UPF c0upf, C0UP6 c0up6, DataChannel dataChannel, int i) {
        super(0);
        this.$t = i;
        this.l0 = c0utj;
        this.l1 = c0upf;
        this.l2 = c0up6;
        this.l3 = dataChannel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS141S0400000_12(Context context, Context context2, C0TUL c0tul, C259800zU<TuxSheet> c259800zU, C2344009Gk c2344009Gk) {
        super(0);
        this.$t = c2344009Gk;
        this.l0 = context;
        this.l1 = context2;
        this.l2 = c0tul;
        this.l3 = c259800zU;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS141S0400000_12(SecurityCheckUpViewModel securityCheckUpViewModel, SecurityCheckUpViewModel securityCheckUpViewModel2, C013C c013c, Context context, C259800zU<String> c259800zU) {
        super(0);
        this.$t = c259800zU;
        this.l0 = securityCheckUpViewModel;
        this.l1 = securityCheckUpViewModel2;
        this.l2 = c013c;
        this.l3 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS141S0400000_12(TakoMultipleSelectVM takoMultipleSelectVM, TakoMultipleSelectVM takoMultipleSelectVM2, InterfaceC665370Q7z interfaceC665370Q7z, Map<String, String> map, View view) {
        super(0);
        this.$t = view;
        this.l0 = takoMultipleSelectVM;
        this.l1 = takoMultipleSelectVM2;
        this.l2 = interfaceC665370Q7z;
        this.l3 = map;
    }
}
