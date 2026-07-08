package kotlin.jvm.internal;

import X.C013C;
import X.C09AY;
import X.C0U3F;
import X.C0UFN;
import X.C1529880puk;
import X.C1852920yJm;
import X.C1894200zOM;
import X.C19EG;
import X.C20441214yg;
import X.C2188811AlT;
import X.C703302op;
import X.InterfaceC1059280dfi;
import X.InterfaceC1541990qEH;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import android.net.Uri;
import android.view.View;
import android.widget.TextView;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.tako.experiment.TakoInfoModel;
import com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingAPIService;
import com.ss.android.ugc.tiktok.pns.props.RemoveOffProps;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public class AwS128S1200000_12 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

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
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS128S1200000_12 awS128S1200000_12) {
        ((C0UFN) awS128S1200000_12.l1).LIZ(awS128S1200000_12.s0);
        ((Function0) awS128S1200000_12.l2).invoke();
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS128S1200000_12 awS128S1200000_12) throws JSONException {
        ((C013C) awS128S1200000_12.l1).element = true;
        SparkActivity sparkActivity = (SparkActivity) awS128S1200000_12.l2;
        if (sparkActivity != null) {
            if (!sparkActivity.isFinishing() && !sparkActivity.isDestroyed()) {
                sparkActivity.finish();
            }
        } else {
            String str = awS128S1200000_12.s0;
            if (str != null) {
                SparkContext.Companion.getClass();
                InterfaceC1059280dfi interfaceC1059280dfiLIZ = C1529880puk.LIZ(str);
                if (interfaceC1059280dfiLIZ != null) {
                    interfaceC1059280dfiLIZ.close();
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS128S1200000_12 awS128S1200000_12) {
        TakoInfoModel takoInfoModel = C1852920yJm.LIZ;
        if (C703302op.LIZ(takoInfoModel.helpPageUrl)) {
            Uri.Builder builderBuildUpon = UriProtector.parse("aweme://webview/").buildUpon();
            String str = awS128S1200000_12.s0;
            if (str == null) {
                str = takoInfoModel.helpPageUrl;
            }
            SmartRouter.buildRoute(((TextView) awS128S1200000_12.l1).getContext(), builderBuildUpon.appendQueryParameter("url", UriProtector.parse(str).buildUpon().appendQueryParameter("bot_name", takoInfoModel.botName).build().toString()).build().toString()).open();
        }
        Function0 function0 = (Function0) awS128S1200000_12.l2;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS128S1200000_12 awS128S1200000_12) throws JSONException {
        ((C013C) awS128S1200000_12.l1).element = true;
        SparkActivity sparkActivity = (SparkActivity) awS128S1200000_12.l2;
        if (sparkActivity != null) {
            if (!sparkActivity.isFinishing() && !sparkActivity.isDestroyed()) {
                sparkActivity.finish();
            }
        } else {
            String str = awS128S1200000_12.s0;
            if (str != null) {
                SparkContext.Companion.getClass();
                InterfaceC1059280dfi interfaceC1059280dfiLIZ = C1529880puk.LIZ(str);
                if (interfaceC1059280dfiLIZ != null) {
                    interfaceC1059280dfiLIZ.close();
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS128S1200000_12 awS128S1200000_12) throws JSONException {
        InterfaceC1541990qEH kitView;
        JSONObject jSONObject = new JSONObject();
        Map map = (Map) awS128S1200000_12.l2;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                jSONObject.put((String) entry.getKey(), entry.getValue());
            }
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = ((C1894200zOM) awS128S1200000_12.l1).LLJILJIL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null && (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getKitView()) != null) {
            kitView.LIZ(awS128S1200000_12.s0, jSONObject);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS128S1200000_12 awS128S1200000_12) {
        IPrivacySettingAPIService iPrivacySettingAPIService = (IPrivacySettingAPIService) PluggableExtentionKt.pluggableSpi$default(IPrivacySettingAPIService.class, false, false, false, 14, null);
        if (iPrivacySettingAPIService != null) {
            iPrivacySettingAPIService.LJI((C19EG) awS128S1200000_12.l1, (RemoveOffProps) awS128S1200000_12.l2, awS128S1200000_12.s0);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS128S1200000_12 awS128S1200000_12) {
        C0U3F c0u3f = (C0U3F) awS128S1200000_12.l1;
        View view = (View) awS128S1200000_12.l2;
        c0u3f.getClass();
        C0U3F.LIZIZ(view);
        ((C0U3F) awS128S1200000_12.l1).LJ = null;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(awS128S1200000_12.s0);
        sbLIZ.append(": animation1 cancel.");
        C20441214yg.LIZIZ("PlayAnimationHandler", C2188811AlT.LIZIZ(sbLIZ));
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS128S1200000_12 awS128S1200000_12) {
        C0U3F c0u3f = (C0U3F) awS128S1200000_12.l1;
        View view = (View) awS128S1200000_12.l2;
        c0u3f.getClass();
        C0U3F.LIZIZ(view);
        ((C0U3F) awS128S1200000_12.l1).LJFF = null;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(awS128S1200000_12.s0);
        sbLIZ.append(": animation2 cancel.");
        C20441214yg.LIZIZ("PlayAnimationHandler", C2188811AlT.LIZIZ(sbLIZ));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS128S1200000_12(C013C c013c, SparkActivity sparkActivity, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c013c;
        this.l2 = sparkActivity;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS128S1200000_12(C0U3F c0u3f, View view, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c0u3f;
        this.l2 = view;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS128S1200000_12(C0UFN c0ufn, String str, AwS413S0200000_12 awS413S0200000_12, int i) {
        super(0);
        this.$t = i;
        this.l1 = c0ufn;
        this.s0 = str;
        this.l2 = awS413S0200000_12;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS128S1200000_12(C1894200zOM c1894200zOM, C1894200zOM c1894200zOM2, String str, Map<String, ? extends Object> map) {
        super(0);
        this.$t = map;
        this.l1 = c1894200zOM;
        this.s0 = c1894200zOM2;
        this.l2 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS128S1200000_12(C19EG c19eg, RemoveOffProps removeOffProps, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c19eg;
        this.l2 = removeOffProps;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS128S1200000_12(String str, TuxTextView tuxTextView, Function0 function0, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = tuxTextView;
        this.l2 = function0;
    }
}
