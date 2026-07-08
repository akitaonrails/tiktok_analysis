package kotlin.jvm.internal;

import X.C09AY;
import X.C0FNV;
import X.C1389890mGx;
import X.C1913480ztS;
import X.C19EG;
import X.C2097608Jq;
import X.C786410Ut5;
import X.DialogC1389620mGW;
import android.os.Bundle;
import android.view.View;
import com.ss.android.ugc.tiktok.pns.privacy.setting.tpsc.account.container.BasePrivacySettingFragmentV2;
import com.ss.android.ugc.tiktok.pns.privacy.setting.tpsc.account.container.PrivacySettingSheetV2;
import com.ss.android.ugc.tiktok.tpsc.core.render.TPSCRenderManager;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes29.dex */
public class AwS13S1500000_28 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;
    public String s0;

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

    public static final Object invoke$0(AwS13S1500000_28 awS13S1500000_28) {
        C0FNV.LIZ((DialogC1389620mGW) awS13S1500000_28.l1);
        BasePrivacySettingFragmentV2 basePrivacySettingFragmentV2 = (BasePrivacySettingFragmentV2) awS13S1500000_28.l2;
        TPSCRenderManager tPSCRenderManager = TPSCRenderManager.LIZ;
        String str = awS13S1500000_28.s0;
        tPSCRenderManager.getClass();
        basePrivacySettingFragmentV2.LLILZIL = TPSCRenderManager.LJ(str);
        if (((BasePrivacySettingFragmentV2) awS13S1500000_28.l2).LLILZIL == null) {
            C1913480ztS.LIZ("pns_tpsc_configurable_exception", C2097608Jq.LJIIIIZZ(new Pair("type", "server_no_config"), new Pair("page_tag", awS13S1500000_28.s0)), null, 12);
            C1389890mGx c1389890mGx = new C1389890mGx((C19EG) awS13S1500000_28.l3);
            c1389890mGx.LJIIIZ(2131848597);
            c1389890mGx.LJIIJJI();
        } else {
            ((Function0) awS13S1500000_28.l4).invoke();
            View view = ((BasePrivacySettingFragmentV2) awS13S1500000_28.l2).getView();
            if (view != null) {
                ((BasePrivacySettingFragmentV2) awS13S1500000_28.l2).SR(view, (Bundle) awS13S1500000_28.l5);
            }
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AwS13S1500000_28 awS13S1500000_28) {
        C786410Ut5.LJIIJ((DialogC1389620mGW) awS13S1500000_28.l1);
        PrivacySettingSheetV2 privacySettingSheetV2 = (PrivacySettingSheetV2) awS13S1500000_28.l2;
        TPSCRenderManager tPSCRenderManager = TPSCRenderManager.LIZ;
        String str = awS13S1500000_28.s0;
        tPSCRenderManager.getClass();
        privacySettingSheetV2.LLILLJJLI = TPSCRenderManager.LJ(str);
        if (((PrivacySettingSheetV2) awS13S1500000_28.l2).LLILLJJLI == null) {
            C1913480ztS.LIZ("pns_tpsc_configurable_exception", C2097608Jq.LJIIIIZZ(new Pair("type", "server_no_config"), new Pair("page_tag", awS13S1500000_28.s0)), null, 12);
            C1389890mGx c1389890mGx = new C1389890mGx((C19EG) awS13S1500000_28.l3);
            c1389890mGx.LJIIIZ(2131848597);
            c1389890mGx.LJIIJJI();
        } else {
            ((Function0) awS13S1500000_28.l4).invoke();
            View view = ((PrivacySettingSheetV2) awS13S1500000_28.l2).getView();
            if (view != null) {
                ((PrivacySettingSheetV2) awS13S1500000_28.l2).NR(view, (Bundle) awS13S1500000_28.l5);
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS13S1500000_28(DialogC1389620mGW dialogC1389620mGW, BasePrivacySettingFragmentV2 basePrivacySettingFragmentV2, String str, C19EG c19eg, AwS429S0200000_28 awS429S0200000_28, Bundle bundle, int i) {
        super(0);
        this.$t = i;
        this.l1 = dialogC1389620mGW;
        this.l2 = basePrivacySettingFragmentV2;
        this.s0 = str;
        this.l3 = c19eg;
        this.l4 = awS429S0200000_28;
        this.l5 = bundle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS13S1500000_28(DialogC1389620mGW dialogC1389620mGW, PrivacySettingSheetV2 privacySettingSheetV2, String str, C19EG c19eg, AwS429S0200000_28 awS429S0200000_28, Bundle bundle, int i) {
        super(0);
        this.$t = i;
        this.l1 = dialogC1389620mGW;
        this.l2 = privacySettingSheetV2;
        this.s0 = str;
        this.l3 = c19eg;
        this.l4 = awS429S0200000_28;
        this.l5 = bundle;
    }
}
