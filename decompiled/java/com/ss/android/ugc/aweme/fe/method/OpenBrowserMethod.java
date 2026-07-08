package com.ss.android.ugc.aweme.fe.method;

import X.C01GW;
import X.C0WZX;
import X.C1020020ceO;
import X.C1020030ceP;
import X.C1029220ctE;
import X.C1059900dgi;
import X.C1440005kM;
import X.C1701330uNH;
import X.C2184171Adz;
import X.C2204961BRm;
import X.C2429209fW;
import X.C294500BgW;
import X.C452501pT;
import X.C997880c4g;
import X.InterfaceC1041760dDS;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.web.jsbridge.IESJsBridge;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.ICommercializeFromMainOutService;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Locale;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.text.u;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class OpenBrowserMethod extends BaseCommonJavaMethod {
    public final C01GW LLILLL;

    public OpenBrowserMethod() {
        this(null);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public OpenBrowserMethod(IESJsBridge iESJsBridge) {
        super(iESJsBridge);
        this.LLILLL = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(172));
    }

    public final void LIZ(JSONObject jSONObject) throws JSONException {
        Context context = this.mContextRef.get();
        String string = JSONObjectProtectorUtils.getString(jSONObject, "url");
        if (context != null && jSONObject.optBoolean("use_external_browser", false)) {
            Intent intent = new Intent("android.intent.action.VIEW", UriProtector.parse(string));
            intent.addFlags(268435456);
            intent.addCategory("android.intent.category.BROWSABLE");
            ResolveInfo resolveInfoResolveActivity = context.getPackageManager().resolveActivity(intent, 65536);
            if (resolveInfoResolveActivity != null) {
                ActivityInfo activityInfo = resolveInfoResolveActivity.activityInfo;
                intent.setClassName(activityInfo.packageName, activityInfo.name);
                C2429209fW.LIZ().appendDataFlowId(intent, 1207969294);
                RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
                C1701330uNH.LIZ(intent, context);
                C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOytLZLLyDqfCkR0Tfg0ejtJe+RlY7X6fNBiUw==", null));
                return;
            }
        }
        jSONObject.put("type", "webview");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("url", string);
        jSONObject.put("args", jSONObject2);
        C1059900dgi.LIZIZ(context, jSONObject);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, InterfaceC1041760dDS interfaceC1041760dDS) {
        ICommercializeFromMainOutService iCommercializeFromMainOutService;
        ICommercializeFromMainOutService iCommercializeFromMainOutService2;
        Context context = this.mContextRef.get();
        try {
            String string = JSONObjectProtectorUtils.getString(jSONObject, "url");
            if (!TextUtils.isEmpty(string)) {
                String lowerCase = string.toLowerCase(Locale.ROOT);
                if (!u.LJJIIJZLJL(lowerCase, "http://", false) && !u.LJJIIJZLJL(lowerCase, "https://", false)) {
                    if (context != null && (iCommercializeFromMainOutService = (ICommercializeFromMainOutService) this.LLILLL.getValue()) != null && iCommercializeFromMainOutService.LIZ(context, string)) {
                        if (C294500BgW.LIZ() && (iCommercializeFromMainOutService2 = (ICommercializeFromMainOutService) this.LLILLL.getValue()) != null) {
                            iCommercializeFromMainOutService2.LJ(new C1029220ctE(null, CardStruct.IStatusCode.DEFAULT, "", CardStruct.IStatusCode.DEFAULT), string, context);
                        }
                        C1020020ceO c1020020ceOLIZ = C1020030ceP.LIZ();
                        c1020020ceOLIZ.LIZ = "draw_ad";
                        c1020020ceOLIZ.LIZIZ = "open_url_app";
                        c1020020ceOLIZ.LJIIJ(context);
                        C2184171Adz.LJ("draw_ad", "open_url_app", CardStruct.IStatusCode.DEFAULT, "", CardStruct.IStatusCode.DEFAULT).LJIIIIZZ();
                        ICommercializeFromMainOutService iCommercializeFromMainOutService3 = (ICommercializeFromMainOutService) this.LLILLL.getValue();
                        if (iCommercializeFromMainOutService3 != null) {
                            iCommercializeFromMainOutService3.pendingDeepLinkLog(new AwS588S0100000_9(context, 86));
                        }
                    }
                } else {
                    LIZ(jSONObject);
                }
                C1440005kM.LIZ(new C997880c4g());
                interfaceC1041760dDS.onSuccess("");
                return;
            }
            interfaceC1041760dDS.LIZ(0, "");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            interfaceC1041760dDS.LIZ(0, "");
        }
    }
}
