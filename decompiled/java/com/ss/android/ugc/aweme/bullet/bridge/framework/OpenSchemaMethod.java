package com.ss.android.ugc.aweme.bullet.bridge.framework;

import X.C1051660dTQ;
import X.C1065660dq0;
import X.C1554300qY8;
import X.C1886207a8;
import X.C1ER1;
import X.C828330WeV;
import X.EnumC1051570dTH;
import X.InterfaceC828360WeY;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.hybrid.spark.security.ThirdPartyBizCert;
import com.bytedance.hybrid.spark.third.router.SparkThirdContext;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.commercialize.ICommercializeFromMainOutService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.settings.PnsOpenThirdWebModel;
import j27.o;
import j27.s;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AwS165S1100000_16;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class OpenSchemaMethod extends BaseBridgeMethod {
    public static final C1065660dq0 Companion = new Object() { // from class: X.0dq0
    };
    public EnumC1051570dTH access;
    public final String name;

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.AbstractC1051750dTZ, X.InterfaceC1051460dT6
    public EnumC1051570dTH getAccess() {
        return this.access;
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, com.bytedance.ies.bullet.ui.common.bridge.ContainerBridgeMethod, X.InterfaceC1051460dT6
    public String getName() {
        return this.name;
    }

    public OpenSchemaMethod(C1051660dTQ c1051660dTQ) {
        super(c1051660dTQ);
        this.name = "openSchema";
        this.access = EnumC1051570dTH.PROTECT;
    }

    private final Map<String, String> jsonObjToMap(JSONObject jSONObject) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            linkedHashMap.put(next, JSONObjectProtectorUtils.getString(jSONObject, next));
        }
        return linkedHashMap;
    }

    private final void openSchema(String str) {
        String strLJJIFFI;
        Context context = getContext();
        if (context instanceof s) {
            context = ((o) context).LIZ();
        }
        SAFHelper.LIZ.getClass();
        Context contextLJ = SAFHelper.LJ(context);
        AFwS252S0000000_16 aFwS252S0000000_16 = AFwS252S0000000_16.get$arr$(97);
        if (contextLJ instanceof Activity) {
            if (!((Boolean) aFwS252S0000000_16.invoke(((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).O5().LIZLLL(contextLJ, str))).booleanValue() && !((Boolean) aFwS252S0000000_16.invoke(Boolean.valueOf(openSchemaByRouter(contextLJ, str)))).booleanValue()) {
                if (str != null) {
                    strLJJIFFI = u.LJJIFFI(str, "aweme", "sslocal", false);
                } else {
                    strLJJIFFI = null;
                }
                Object objPluggableSpi$default = PluggableExtentionKt.pluggableSpi$default(ICommercializeFromMainOutService.class, false, false, false, 14, null);
                if (objPluggableSpi$default != null) {
                    aFwS252S0000000_16.invoke(Boolean.valueOf(((ICommercializeFromMainOutService) objPluggableSpi$default).LJFF(contextLJ, strLJJIFFI, null, false)));
                    return;
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
            return;
        }
        aFwS252S0000000_16.invoke(Boolean.valueOf(openSchemaByRouter(null, str)));
    }

    private final void putExtraData(JSONObject jSONObject) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("log");
        if (jSONObjectOptJSONObject != null) {
            linkedHashMap.putAll(jsonObjToMap(jSONObjectOptJSONObject));
            if (!linkedHashMap.isEmpty()) {
                C1ER1.LIZIZ.K0(linkedHashMap);
            }
        }
    }

    @Override // X.AbstractC1051750dTZ
    public void setAccess(EnumC1051570dTH enumC1051570dTH) {
        this.access = enumC1051570dTH;
    }

    private final boolean openSchemaByRouter(Context context, String str) {
        String scheme;
        String scheme2;
        if (str == null || str.length() == 0) {
            return false;
        }
        final AwS165S1100000_16 awS165S1100000_16 = new AwS165S1100000_16(context, str, 7);
        if (!u.LJJIIJZLJL(str, "aweme://lynxview", false)) {
            Uri uri = UriProtector.parse(str);
            if (uri != null) {
                scheme = uri.getScheme();
            } else {
                scheme = null;
            }
            if (!Intrinsics.LJFF(scheme, "http")) {
                if (uri != null) {
                    scheme2 = uri.getScheme();
                } else {
                    scheme2 = null;
                }
                if (!Intrinsics.LJFF(scheme2, "https")) {
                    uri = (uri == null || UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "url") == null) ? null : UriProtector.parse(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "url"));
                }
            }
            if (context != null && uri != null) {
                SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
                PnsOpenThirdWebModel pnsOpenThirdWebModel = C1886207a8.LIZ;
                PnsOpenThirdWebModel pnsOpenThirdWebModel2 = (PnsOpenThirdWebModel) settingsManagerLIZLLL.LJIIIIZZ("pns_openthirdweb", PnsOpenThirdWebModel.class, pnsOpenThirdWebModel);
                if (pnsOpenThirdWebModel2 == null) {
                    pnsOpenThirdWebModel2 = pnsOpenThirdWebModel;
                }
                if (C1886207a8.LIZ(uri, pnsOpenThirdWebModel2.sysDomainList)) {
                    new C828330WeV(new ThirdPartyBizCert(0)).LIZIZ(context, uri.toString(), new InterfaceC828360WeY() { // from class: X.0dpu
                        @Override // X.InterfaceC828360WeY
                        public final void LIZ(Context context2, String str2) {
                            awS165S1100000_16.invoke();
                        }
                    }, null);
                    return true;
                }
                PnsOpenThirdWebModel pnsOpenThirdWebModel3 = (PnsOpenThirdWebModel) SettingsManager.LIZLLL().LJIIIIZZ("pns_openthirdweb", PnsOpenThirdWebModel.class, pnsOpenThirdWebModel);
                if (pnsOpenThirdWebModel3 != null) {
                    pnsOpenThirdWebModel = pnsOpenThirdWebModel3;
                }
                if (C1886207a8.LIZ(uri, pnsOpenThirdWebModel.iabDomainList)) {
                    SparkThirdContext sparkThirdContext = new SparkThirdContext();
                    sparkThirdContext.url = uri.toString();
                    sparkThirdContext.bizCert = new ThirdPartyBizCert(0);
                    C1554300qY8.LIZIZ(context, sparkThirdContext);
                    return true;
                }
            }
        }
        return ((Boolean) awS165S1100000_16.invoke()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007b  */
    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void handle(org.json.JSONObject r19, X.InterfaceC1019840ce6 r20) {
        /*
            Method dump skipped, instruction units count: 524
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.bullet.bridge.framework.OpenSchemaMethod.handle(org.json.JSONObject, X.0ce6):void");
    }
}
