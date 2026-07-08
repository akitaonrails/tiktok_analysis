package kotlin.jvm.internal;

import X.C08JS;
import X.C09AY;
import X.C13Z4;
import X.C14XN;
import X.C1669670tYD;
import X.C20696015yg;
import X.EnumC1427810nG7;
import X.InterfaceC1680500tpg;
import androidx.compose.ui.platform.ComposeView;
import com.ss.android.ugc.aweme.feed.model.survey.Question;
import com.ss.android.ugc.aweme.setting.serverpush.compose.login.PushSettingsCommonComposeSubFragment;
import com.ss.android.ugc.aweme.setting.serverpush.compose.login.PushSettingsLoginVM;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettingDynamicUI;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes31.dex */
public class AwS160S1200000_30 extends C09AY implements Function2 {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS160S1200000_30 awS160S1200000_30, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            String str = awS160S1200000_30.s0;
            if (str != null) {
                PushSettingsCommonComposeSubFragment pushSettingsCommonComposeSubFragment = (PushSettingsCommonComposeSubFragment) awS160S1200000_30.l1;
                ComposeView composeView = (ComposeView) awS160S1200000_30.l2;
                PushSettingDynamicUI pushSettingDynamicUI = (PushSettingDynamicUI) C08JS.LIZ(str, PushSettingDynamicUI.class);
                interfaceC1680500tpg.LJJIIJZLJL(-1589888158);
                if (pushSettingDynamicUI != null) {
                    pushSettingsCommonComposeSubFragment.bS().setState(new AwS609S0100000_30(PushSettingsLoginVM.BQ2(pushSettingDynamicUI, true, pushSettingDynamicUI.pageLabel), (List<C20696015yg>) 341));
                    C1669670tYD.LJ(composeView, EnumC1427810nG7.Auto, C13Z4.LIZJ(882198045, new AwS465S0200000_30(pushSettingsCommonComposeSubFragment, pushSettingDynamicUI, 7), interfaceC1680500tpg));
                }
                interfaceC1680500tpg.LJ();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS160S1200000_30 awS160S1200000_30, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            C14XN c14xn = (C14XN) awS160S1200000_30.l1;
            c14xn.LJJIII(awS160S1200000_30.s0, c14xn.LLILZIL, (Question) awS160S1200000_30.l2, interfaceC1680500tpg, 0);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS160S1200000_30(C14XN c14xn, String str, Question question, int i) {
        super(2);
        this.$t = i;
        this.l1 = c14xn;
        this.s0 = str;
        this.l2 = question;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS160S1200000_30(String str, PushSettingsCommonComposeSubFragment pushSettingsCommonComposeSubFragment, ComposeView composeView, int i) {
        super(2);
        this.$t = i;
        this.s0 = str;
        this.l1 = pushSettingsCommonComposeSubFragment;
        this.l2 = composeView;
    }
}
