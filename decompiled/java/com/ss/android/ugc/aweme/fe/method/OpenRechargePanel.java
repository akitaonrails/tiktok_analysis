package com.ss.android.ugc.aweme.fe.method;

import X.C11S5;
import X.C1388190mED;
import X.C1701940uOG;
import X.C1803830x2b;
import X.C19EG;
import X.C2080008Cw;
import X.C786410Ut5;
import X.EnumC1063410dmN;
import X.InterfaceC1041760dDS;
import X.InterfaceC1806230x6T;
import X.InterfaceC20673515v3;
import Y.AfS66S0400000_16;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.web.jsbridge.IESJsBridge;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.aweme.fe.method.OpenRechargePanel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import kotlin.jvm.internal.AwS560S0100000_16;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class OpenRechargePanel extends BaseCommonJavaMethod {
    public OpenRechargePanel() {
        super(null);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public OpenRechargePanel(IESJsBridge iESJsBridge) {
        super(iESJsBridge);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, InterfaceC1041760dDS interfaceC1041760dDS) {
        String strOptString;
        long jOptLong;
        Bundle bundle = new Bundle();
        InterfaceC20673515v3 interfaceC20673515v3K4 = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4();
        String strOptString2 = null;
        if (jSONObject != null) {
            String str = (String) ((HashMap) C2080008Cw.LIZ(jSONObject.optJSONObject("track_info"))).get("charge_from");
            if (str == null) {
                str = "";
            }
            strOptString = jSONObject.optString("charge_from", str);
        } else {
            strOptString = null;
        }
        int iOptInt = 0;
        if (jSONObject != null) {
            iOptInt = jSONObject.optInt("key_bundle_charge_source", 0);
        }
        int chargeSourceFromChargeFromHash = interfaceC20673515v3K4.getChargeSourceFromChargeFromHash(strOptString, iOptInt);
        long jOptLong2 = 0;
        if (jSONObject != null) {
            jOptLong = jSONObject.optLong("diamond_count", 0L);
            jOptLong2 = jSONObject.optLong("total_diamond_acount_needed", 0L);
            strOptString2 = jSONObject.optString("charge_reason");
        } else {
            jOptLong = 0;
        }
        bundle.putInt("key_bundle_charge_source", chargeSourceFromChargeFromHash);
        C786410Ut5.LJJJI("key_charge_reason", strOptString2, bundle);
        bundle.putLong("key_bundle_need_coins", jOptLong);
        bundle.putLong("key_bundle_total_coins", jOptLong2);
        boolean zIsRechargeV3CacheAvailable = interfaceC20673515v3K4.isRechargeV3CacheAvailable(chargeSourceFromChargeFromHash);
        if (interfaceC20673515v3K4.canRedirectRechargeV3() && !zIsRechargeV3CacheAvailable) {
            interfaceC20673515v3K4.LLILIL(chargeSourceFromChargeFromHash).LJJJLZIJ(C1701940uOG.LIZIZ()).LJL(C11S5.LIZ()).LJJLL(new AfS66S0400000_16(this, jSONObject, bundle, interfaceC1041760dDS, 0), new AfS66S0400000_16(this, jSONObject, bundle, interfaceC1041760dDS, 1));
        } else {
            LIZ(jSONObject, bundle, interfaceC1041760dDS);
        }
    }

    public final void LIZ(JSONObject jSONObject, Bundle bundle, InterfaceC1041760dDS interfaceC1041760dDS) {
        JSONObject jSONObjectOptJSONObject;
        Context context;
        C19EG c19egLIZIZ;
        if (jSONObject != null) {
            jSONObjectOptJSONObject = jSONObject.optJSONObject("track_info");
        } else {
            jSONObjectOptJSONObject = null;
        }
        WeakReference<Context> weakReference = this.mContextRef;
        if (weakReference != null && (context = weakReference.get()) != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
            InterfaceC20673515v3 interfaceC20673515v3K4 = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4();
            C1803830x2b c1803830x2b = new C1803830x2b();
            c1803830x2b.LIZJ = C2080008Cw.LIZ(jSONObjectOptJSONObject);
            c1803830x2b.LJIJJLI = EnumC1063410dmN.JSB;
            DialogFragment dialogFragmentCreateRechargeDialogFragment = interfaceC20673515v3K4.createRechargeDialogFragment(c19egLIZIZ, new InterfaceC1806230x6T() { // from class: X.0dlE
                @Override // X.InterfaceC1806230x6T
                public final /* synthetic */ void LIZ() {
                }

                @Override // X.InterfaceC1806230x6T
                public final void LIZIZ(int i, int i2, String str) {
                }

                @Override // X.InterfaceC1806230x6T
                public final /* synthetic */ void LIZJ() {
                }

                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // X.InterfaceC1806230x6T
                public final void onFail() throws JSONException {
                    OpenRechargePanel openRechargePanel = this.LIZ;
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("code", 0);
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("error_code", 10001);
                    jSONObject2.put("args", jSONObject3);
                    openRechargePanel.sendEvent("coinsRechargeStatus", jSONObject2, 3);
                }

                @Override // X.InterfaceC1806230x6T
                public final void onSuccess(long j) throws JSONException {
                    OpenRechargePanel openRechargePanel = this.LIZ;
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("code", 1);
                    openRechargePanel.sendEvent("coinsRechargeStatus", jSONObject2, 3);
                }
            }, bundle, c1803830x2b);
            if (interfaceC20673515v3K4.canRedirectRechargeV3()) {
                interfaceC20673515v3K4.LJLLJ(c19egLIZIZ, new AwS560S0100000_16(this, 267));
            }
            if (dialogFragmentCreateRechargeDialogFragment != null) {
                dialogFragmentCreateRechargeDialogFragment.showNow(c19egLIZIZ.getSupportFragmentManager(), "OpenRechargePanel");
            }
            if (interfaceC1041760dDS != null) {
                interfaceC1041760dDS.onSuccess(null);
            }
        }
    }
}
