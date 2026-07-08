package kotlin.jvm.internal;

import X.C06W7;
import X.C09AY;
import X.C0FNT;
import X.C1389890mGx;
import X.C1701450uNT;
import X.C1749760vdO;
import X.C18VB;
import X.C20145813s8;
import X.C20221814Am;
import X.C21290818Tq;
import X.C21300118Xf;
import X.C21320718c9;
import X.C2188811AlT;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.bytedance.android.btm.impl.page.model.PageInfo;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.vmsdk.JsWorkerWrapper;
import com.ss.android.ugc.aweme.ecommerce.vmsdk.VmSdkService;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes33.dex */
public class AwS115S1200000_32 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS115S1200000_32 awS115S1200000_32, Object obj) throws JSONException {
        String pageBtm;
        JSONObject jSONObject = (JSONObject) obj;
        jSONObject.put("keys", (List) awS115S1200000_32.l1);
        jSONObject.put("api", awS115S1200000_32.s0);
        PageInfo pageInfo = (PageInfo) awS115S1200000_32.l2;
        if (pageInfo != null) {
            pageBtm = pageInfo.getPageBtm();
        } else {
            pageBtm = null;
        }
        jSONObject.put("btm_page", pageBtm);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS115S1200000_32 awS115S1200000_32, Object obj) {
        String str;
        JsWorkerWrapper jsWorkerWrapper = (JsWorkerWrapper) obj;
        VmSdkService vmSdkService = (VmSdkService) awS115S1200000_32.l1;
        String str2 = awS115S1200000_32.s0;
        AFwS320S0000000_32 aFwS320S0000000_32 = AFwS320S0000000_32.get$arr$(0);
        C20221814Am c20221814Am = (C20221814Am) awS115S1200000_32.l2;
        vmSdkService.getClass();
        C1701450uNT c1701450uNT = C1701450uNT.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("jsWorker: name: ");
        if (jsWorkerWrapper != null) {
            str = jsWorkerWrapper.LIZIZ;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        sbLIZ.append(" business.js load cdn: ");
        sbLIZ.append(str2);
        C2188811AlT.LIZIZ(sbLIZ);
        C1701450uNT.LIZ(c1701450uNT, "VmSdkService", 4);
        C1749760vdO.LIZLLL("load_service_script");
        vmSdkService.LIZLLL(str2, new C21320718c9(jsWorkerWrapper, c20221814Am, str2, aFwS320S0000000_32));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS115S1200000_32 awS115S1200000_32, Object obj) {
        View view = (View) obj;
        Context context = ((C21300118Xf) awS115S1200000_32.l1).LIZIZ.getContext();
        String str = awS115S1200000_32.s0;
        try {
            if (C06W7.LIZIZ(context)) {
                C20145813s8.LIZ("copy_ai_chat_label", str, context, CertProviderManagerKt.findCert("bpea-visual_poet_copy_to_clipboard", 1476399153));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C21290818Tq.LIZIZ("copy_ai_chat_label", "copyToClipboard", th);
        }
        ((C21300118Xf) awS115S1200000_32.l1).LIZIZ(C18VB.COPY_TEXT);
        ((Function0) awS115S1200000_32.l2).invoke();
        Activity activityLIZ = C0FNT.LIZ(view.getContext());
        if (activityLIZ != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
            c1389890mGx.LJIIIZ(2131832167);
            c1389890mGx.LJIIJJI();
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS115S1200000_32(C21300118Xf c21300118Xf, String str, AwS433S0200000_32 awS433S0200000_32, int i) {
        super(1);
        this.$t = i;
        this.l1 = c21300118Xf;
        this.s0 = str;
        this.l2 = awS433S0200000_32;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS115S1200000_32(PageInfo pageInfo, String str, List list, int i) {
        super(1);
        this.$t = i;
        this.l1 = list;
        this.s0 = str;
        this.l2 = pageInfo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS115S1200000_32(VmSdkService vmSdkService, String str, C20221814Am c20221814Am, int i) {
        super(1);
        this.$t = i;
        this.l1 = vmSdkService;
        this.s0 = str;
        this.l2 = c20221814Am;
    }
}
