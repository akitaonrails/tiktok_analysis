package com.ss.android.ugc.aweme.settingsrequest;

import X.C01GW;
import X.C08JS;
import X.C0C76;
import X.C0C77;
import X.C0C7O;
import X.C0C7T;
import X.C0CG1;
import X.C0CJ2;
import X.C10FG;
import X.C10FJ;
import X.C1259804wO;
import X.C1772006wo;
import X.C274620ApY;
import X.C279100Awm;
import X.C296760BkA;
import X.C308420C7c;
import X.C308430C7d;
import X.C310720CFy;
import X.C313070COz;
import X.C786410Ut5;
import X.InterfaceC1944307jV;
import X.InterfaceC800080Va2;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;
import com.ss.android.ugc.aweme.settingsrequest.api.FetchABTestCommonChunkTask;
import com.ss.android.ugc.aweme.settingsrequest.api.FetchABTestCommonRequest;
import com.ss.android.ugc.aweme.settingsrequest.api.FetchABTestCommonTask;
import com.ss.android.ugc.aweme.settingsrequest.api.ISettingsRequestService;
import com.ss.android.ugc.aweme.settingsrequest.api.optimized.FetchABTestCommonOptimizedChunkTask;
import com.ss.android.ugc.aweme.settingsrequest.api.optimized.FetchABTestCommonOptimizedRequest;
import com.ss.android.ugc.aweme.settingsrequest.api.optimized.FetchABTestCommonOptimizedTask;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class SettingsRequestServiceImpl implements ISettingsRequestService {
    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsRequestService
    public final void LJIIIZ() {
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsRequestService
    public final void LJIIJ() {
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsRequestService
    public final C310720CFy LIZLLL() {
        return C308420C7c.LIZIZ.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsRequestService
    public final List<C10FJ> LJI() {
        return C308420C7c.LIZIZ.LJI();
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsRequestService
    public final InterfaceC800080Va2 LJIILJJIL() {
        ((Boolean) C0C77.LIZ.getValue()).booleanValue();
        boolean zBooleanValue = ((Boolean) C274620ApY.LIZ.getValue()).booleanValue();
        if (C0C76.LIZ() != null) {
            C0C76.LIZ().isOpen();
        }
        if (zBooleanValue) {
            return C279100Awm.LIZ() ? new FetchABTestCommonOptimizedChunkTask(0, new C0C7T()) : C296760BkA.LIZIZ() ? new FetchABTestCommonOptimizedTask(0, new C0C7T()) : new FetchABTestCommonOptimizedRequest(0, new C0C7T());
        }
        return (C0CJ2.LJ() && C1259804wO.LIZ() == 2) ? new FetchABTestCommonChunkTask(0) : C279100Awm.LIZ() ? new FetchABTestCommonChunkTask(0) : C296760BkA.LIZIZ() ? new FetchABTestCommonTask(0) : new FetchABTestCommonRequest(0);
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsRequestService
    public final boolean shouldUseRecyclerPartialUpdate() {
        return C308420C7c.LIZIZ.shouldUseRecyclerPartialUpdate();
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsRequestService
    public final void LIZ(Context context) {
        C308420C7c.LIZIZ.LIZ(context);
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsRequestService
    public final void LIZIZ(n nVar) {
        C308420C7c.LIZIZ.LIZIZ(nVar);
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsRequestService
    public final void LJFF(C0CG1 c0cg1) {
        C308420C7c.LIZIZ.LJFF(c0cg1);
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsRequestService
    public final void LJII(PushSettings pushSettings) {
        C10FG.LIZ.getClass();
        C10FG.LIZIZ(pushSettings);
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsRequestService
    public final void LJIIIIZZ(JSONObject jSONObject) {
        InterfaceC1944307jV interfaceC1944307jV;
        C01GW c01gw = C1772006wo.LIZ;
        if (jSONObject != null && !TextUtils.isEmpty(C786410Ut5.J3(jSONObject)) && (interfaceC1944307jV = (InterfaceC1944307jV) C1772006wo.LIZ.getValue()) != null) {
            interfaceC1944307jV.LIZ(C786410Ut5.J3(jSONObject));
        }
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsRequestService
    public final void LJIIJJI(Map<String, String> map) {
        C308430C7d.LIZ.getClass();
        if (map != null) {
            C308430C7d.LIZLLL.putAll(map);
        }
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsRequestService
    public final JSONObject LJIIL(String str) {
        if (str != null && !str.isEmpty()) {
            JSONObject jSONObject = new JSONObject();
            String[] strArrSplit = Uri.decode(str).split(",");
            try {
                SettingsManager.LIZLLL().getClass();
                int i = 0;
                if (SettingsManager.LIZ("hybrid_ab_params_map", true)) {
                    HashMap map = new HashMap();
                    int length = strArrSplit.length;
                    while (i < length) {
                        String str2 = strArrSplit[i];
                        map.put(str2, C0C7O.LIZ(str2));
                        i++;
                    }
                    return new JSONObject(C08JS.LIZLLL(map));
                }
                n nVar = new n();
                int length2 = strArrSplit.length;
                while (i < length2) {
                    String str3 = strArrSplit[i];
                    C0C7O.LIZLLL(nVar, C0C7O.LIZ(str3), str3);
                    i++;
                }
                return new JSONObject(nVar.toString());
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                return jSONObject;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0108 A[Catch: all -> 0x0111, TryCatch #0 {all -> 0x0111, blocks: (B:48:0x00c1, B:51:0x00cd, B:53:0x00d1, B:54:0x00e2, B:56:0x00e8, B:58:0x0100, B:59:0x0104, B:61:0x010b, B:60:0x0108), top: B:102:0x00c1, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0123 A[Catch: Exception -> 0x0138, TryCatch #3 {Exception -> 0x0138, blocks: (B:14:0x003a, B:16:0x003e, B:18:0x0044, B:19:0x0048, B:21:0x004e, B:23:0x0058, B:25:0x006c, B:47:0x00b9, B:64:0x011d, B:66:0x0123, B:67:0x0126, B:63:0x0112, B:44:0x00b2, B:38:0x009e, B:48:0x00c1, B:51:0x00cd, B:53:0x00d1, B:54:0x00e2, B:56:0x00e8, B:58:0x0100, B:59:0x0104, B:61:0x010b, B:60:0x0108), top: B:108:0x003a, inners: #0 }] */
    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsRequestService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILIIL(java.lang.String r24) {
        /*
            Method dump skipped, instruction units count: 522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.settingsrequest.SettingsRequestServiceImpl.LJIILIIL(java.lang.String):void");
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsRequestService
    public final void LJIILL(C313070COz c313070COz) {
        C10FG.LIZ.getClass();
        C10FG.LIZLLL(c313070COz, false);
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsRequestService
    public final void LIZJ(Activity activity, Fragment fragment) {
        C308420C7c.LIZIZ.LIZJ(activity, fragment);
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsRequestService
    public final C310720CFy LJ(SharedPreferences.Editor editor, IESSettingsProxy iESSettingsProxy) {
        return C308420C7c.LIZIZ.LJ(editor, iESSettingsProxy);
    }
}
