package com.ss.android.ugc.aweme.bullet.bridge.ad;

import X.C1051660dTQ;
import X.C1803830x2b;
import X.C19EG;
import X.C2080008Cw;
import X.C2188811AlT;
import X.C259800zU;
import X.C786410Ut5;
import X.EnumC1063410dmN;
import X.InterfaceC1019840ce6;
import X.InterfaceC1149850g1n;
import X.InterfaceC1806230x6T;
import X.InterfaceC20673515v3;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.bullet.bridge.ad.OpenRechargePanel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class OpenRechargePanel extends BaseBridgeMethod {
    public static final int $stable = 8;

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, com.bytedance.ies.bullet.ui.common.bridge.ContainerBridgeMethod, X.InterfaceC1051460dT6
    public String getName() {
        return "openRechargePanel";
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public OpenRechargePanel(C1051660dTQ c1051660dTQ) {
        super(c1051660dTQ);
    }

    private final C19EG asFragmentActivity(Context context) {
        ContextWrapper contextWrapper;
        Context baseContext;
        if (context instanceof C19EG) {
            return (C19EG) context;
        }
        if (!(context instanceof ContextWrapper) || (contextWrapper = (ContextWrapper) context) == null || (baseContext = contextWrapper.getBaseContext()) == null) {
            return null;
        }
        return asFragmentActivity(baseContext);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [T, java.util.HashMap] */
    private final InterfaceC1806230x6T getRechargeListener(final int i) {
        final C259800zU c259800zU = new C259800zU();
        c259800zU.element = new HashMap();
        return new InterfaceC1806230x6T() { // from class: X.0dNi
            @Override // X.InterfaceC1806230x6T
            public final /* synthetic */ void LIZ() {
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
                if (i != 5) {
                    c259800zU.element.put("code", CardStruct.IStatusCode.DEFAULT);
                    c259800zU.element.put("error_code", 10001);
                    long jCurrentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
                    new C1061730djf();
                    C1548820qPI.LIZIZ(new C397901gf(jCurrentThreadTimeMillis, C1061730djf.LIZLLL(c259800zU.element), "coinsRechargeStatus"));
                    return;
                }
                OpenRechargePanel openRechargePanel = this;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("code", 0);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("error_code", 10001);
                jSONObject.put("args", jSONObject2);
                openRechargePanel.sendEvent("coinsRechargeStatus", jSONObject);
            }

            @Override // X.InterfaceC1806230x6T
            public final void onSuccess(long j) throws JSONException {
                if (i == 5) {
                    OpenRechargePanel openRechargePanel = this;
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("code", 1);
                    openRechargePanel.sendEvent("coinsRechargeStatus", jSONObject);
                    return;
                }
                c259800zU.element.put("code", "1");
                long jCurrentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
                new C1061730djf();
                C1548820qPI.LIZIZ(new C397901gf(jCurrentThreadTimeMillis, C1061730djf.LIZLLL(c259800zU.element), "coinsRechargeStatus"));
            }

            @Override // X.InterfaceC1806230x6T
            public final void LIZIZ(int i2, int i3, String str) throws JSONException {
                if (i == 5) {
                    if (i2 != 0) {
                        if (i2 == 1) {
                            CopyOnWriteArrayList<Runnable> copyOnWriteArrayList = C794240VDq.LIZ;
                            Integer numValueOf = null;
                            C793770VBv.LJIIJJI("promote_iap_charge_show", 0, null);
                            C2344009Gk c2344009Gk = new C2344009Gk();
                            C988570bpf.LIZ.getClass();
                            if (C1041070dCL.LIZ() != null) {
                                numValueOf = Integer.valueOf(C1028210crb.LJFF());
                            }
                            c2344009Gk.LJ(numValueOf, "user_account_type");
                            C20684815ws.LJIILLIIL("promote_iap_recharge_panel_show", c2344009Gk.LIZ);
                            return;
                        }
                        return;
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("error_status_code ", i3);
                    jSONObject.put("error_message", str);
                    CopyOnWriteArrayList<Runnable> copyOnWriteArrayList2 = C794240VDq.LIZ;
                    C793770VBv.LJIIJJI("promote_iap_charge_show", 1, jSONObject);
                }
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public void handle(JSONObject jSONObject, InterfaceC1019840ce6 interfaceC1019840ce6) {
        Integer numValueOf;
        FragmentManager supportFragmentManager;
        FragmentManager supportFragmentManager2;
        Bundle bundle = new Bundle();
        InterfaceC20673515v3 interfaceC20673515v3K4 = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4();
        Map<String, String> mapLIZ = C2080008Cw.LIZ(jSONObject.optJSONObject("track_info"));
        String str = (String) ((HashMap) mapLIZ).get("charge_from");
        if (str == null) {
            str = "";
        }
        int chargeSourceFromChargeFromHash = interfaceC20673515v3K4.getChargeSourceFromChargeFromHash(jSONObject.optString("charge_from", str), jSONObject.optInt("key_bundle_charge_source", 0));
        long jOptLong = jSONObject.optLong("diamond_count", 0L);
        long jOptLong2 = jSONObject.optLong("total_diamond_acount_needed", 0L);
        String strOptString = jSONObject.optString("charge_reason");
        boolean zOptBoolean = jSONObject.optBoolean("is_from_switch", false);
        boolean zOptBoolean2 = jSONObject.optBoolean("skip_exchange_precheck", false);
        String strOptString2 = jSONObject.optString("gift_enter_from");
        String strOptString3 = jSONObject.optString("campaign_info");
        if (jSONObject.has("vault_gift_id")) {
            numValueOf = Integer.valueOf(jSONObject.optInt("vault_gift_id", 0));
        } else {
            numValueOf = null;
        }
        if (strOptString != null && strOptString.equals("redpacket")) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strOptString);
            sbLIZ.append("_new");
            strOptString = C2188811AlT.LIZIZ(sbLIZ);
        }
        bundle.putInt("key_bundle_charge_source", chargeSourceFromChargeFromHash);
        C786410Ut5.LJJJI("key_charge_reason", strOptString, bundle);
        bundle.putLong("key_bundle_need_coins", jOptLong);
        bundle.putLong("key_bundle_total_coins", jOptLong2);
        bundle.putBoolean("key_bundle_is_from_switch", zOptBoolean);
        C786410Ut5.LJJJI("key_bundle_gift_from", strOptString2, bundle);
        C786410Ut5.LJJJI("key_bundle_campaign_info", strOptString3, bundle);
        if (numValueOf != null) {
            bundle.putInt("key_bundle_vault_gift_id", numValueOf.intValue());
        }
        Context context = getContext();
        if (context == null) {
            interfaceC1019840ce6.LIZ(-1, "context is null");
            return;
        }
        C1803830x2b c1803830x2b = new C1803830x2b();
        c1803830x2b.LIZJ = mapLIZ;
        c1803830x2b.LJIJJ = zOptBoolean;
        c1803830x2b.LJIJJLI = EnumC1063410dmN.JSB;
        DialogFragment dialogFragmentCreateRechargeDialogFragment = interfaceC20673515v3K4.createRechargeDialogFragment(context, getRechargeListener(chargeSourceFromChargeFromHash), bundle, c1803830x2b);
        C19EG c19egAsFragmentActivity = asFragmentActivity(context);
        if (c19egAsFragmentActivity != null) {
            supportFragmentManager = c19egAsFragmentActivity.getSupportFragmentManager();
        } else {
            supportFragmentManager = null;
        }
        InterfaceC1149850g1n exchangeListener = getExchangeListener(dialogFragmentCreateRechargeDialogFragment, strOptString, jSONObject, context, supportFragmentManager);
        if (zOptBoolean2 || ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4().LJJLIIIJL(context, dialogFragmentCreateRechargeDialogFragment, bundle, exchangeListener) == 0) {
            C19EG c19egAsFragmentActivity2 = asFragmentActivity(context);
            if (c19egAsFragmentActivity2 != null) {
                supportFragmentManager2 = c19egAsFragmentActivity2.getSupportFragmentManager();
            } else {
                supportFragmentManager2 = null;
            }
            showRechargeDialog(jSONObject, dialogFragmentCreateRechargeDialogFragment, context, supportFragmentManager2);
        }
        interfaceC1019840ce6.onSuccess(null);
    }

    public final void showRechargeDialog(JSONObject jSONObject, DialogFragment dialogFragment, Context context, FragmentManager fragmentManager) {
        ILiveOuterService iLiveOuterService;
        InterfaceC20673515v3 interfaceC20673515v3K4;
        String strOptString = jSONObject.optString("charge_reason");
        if (strOptString != null && strOptString.equals("redpacket")) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strOptString);
            sbLIZ.append("_new");
            strOptString = C2188811AlT.LIZIZ(sbLIZ);
        }
        if ((Intrinsics.LJFF(strOptString, "redpacket_new") || Intrinsics.LJFF(strOptString, "portal")) && (iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null)) != null && (interfaceC20673515v3K4 = iLiveOuterService.k4()) != null && (interfaceC20673515v3K4.isFirstRecharge() || interfaceC20673515v3K4.LLJILJIL() || iLiveOuterService.W4().LJ())) {
            interfaceC20673515v3K4.LJJLJ(context, strOptString);
        } else if (fragmentManager != null && dialogFragment != null) {
            dialogFragment.showNow(fragmentManager, "OpenRechargePanel");
        }
    }

    private final InterfaceC1149850g1n getExchangeListener(final DialogFragment dialogFragment, final String str, final JSONObject jSONObject, final Context context, final FragmentManager fragmentManager) {
        final HashMap map = new HashMap();
        return new InterfaceC1149850g1n() { // from class: X.0dbE
            @Override // X.InterfaceC1149850g1n
            public final void LIZ(int i) {
            }

            @Override // X.InterfaceC1149850g1n
            public final void LJ(int i, boolean z) {
            }

            @Override // X.InterfaceC1149850g1n
            public final void onShow() {
            }

            @Override // X.InterfaceC1149850g1n
            public final void LIZJ() {
                this.LIZ.showRechargeDialog(jSONObject, dialogFragment, context, fragmentManager);
            }

            @Override // X.InterfaceC1149850g1n
            public final void LIZLLL() {
                this.LIZ.showRechargeDialog(jSONObject, dialogFragment, context, fragmentManager);
            }

            @Override // X.InterfaceC1149850g1n
            public final void LJFF() {
                this.LIZ.showRechargeDialog(jSONObject, dialogFragment, context, fragmentManager);
            }

            @Override // X.InterfaceC1149850g1n
            public final void LIZIZ(int i, long j, boolean z, boolean z2, int i2, Boolean bool) {
                String str2;
                map.put("code", "1");
                map.put("exchangeType", Integer.valueOf(i));
                map.put("trackParams", C2097608Jq.LJIIIIZZ(new Pair("exchangeType", Integer.valueOf(i)), new Pair("isAutoExchange", Boolean.valueOf(z)), new Pair("source", str), new Pair("coins", Long.valueOf(j))));
                Map<String, Object> map2 = map;
                C1537480q70 c1537480q70 = this.LIZ.contextProviderFactory.LIZIZ;
                if (c1537480q70 == null || (str2 = c1537480q70.containerId) == null) {
                    str2 = "";
                }
                map2.put("container_id", str2);
                long jCurrentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
                new C1061730djf();
                C1548820qPI.LIZIZ(new C397901gf(jCurrentThreadTimeMillis, C1061730djf.LIZLLL(map), "coinsExchangeStatus"));
            }
        };
    }
}
