package com.ss.android.ugc.aweme.service;

import X.C634800Ov8;
import X.InterfaceC634810Ov9;
import X.InterfaceC634840OvC;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class AnchorAutoSelectionServiceImpl implements IAnchorAutoSelectionService {
    @Override // com.ss.android.ugc.aweme.service.IAnchorAutoSelectionService
    public final void anchorAutoSelection(final Context context, JSONObject jSONObject) {
        InterfaceC634810Ov9 interfaceC634810Ov9;
        C634800Ov8 c634800Ov8 = new C634800Ov8();
        try {
            final Integer numValueOf = Integer.valueOf(jSONObject.optInt("action_type"));
            final String strOptString = jSONObject.optString("client_key");
            if (strOptString == null) {
                strOptString = "";
            }
            final String strOptString2 = jSONObject.optString("anchor_source_type");
            if (strOptString2 == null) {
                strOptString2 = "";
            }
            final String strOptString3 = jSONObject.optString("extra");
            if (strOptString3 == null) {
                strOptString3 = "";
            }
            final String strOptString4 = jSONObject.optString("enter_from");
            if (strOptString4 == null) {
                strOptString4 = "";
            }
            final String strOptString5 = jSONObject.optString("enter_method");
            if (strOptString5 == null) {
                strOptString5 = "";
            }
            interfaceC634810Ov9 = new InterfaceC634810Ov9(numValueOf, strOptString, strOptString2, strOptString3, strOptString4, strOptString5) { // from class: X.0NCJ
                public final Number LIZ;
                public final String LIZIZ;
                public final String LIZJ;
                public final String LIZLLL;
                public final String LJ;
                public final String LJFF;

                @Override // com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel
                public final Map<String, Object> convert() {
                    return C2097608Jq.LJIIIIZZ(new Pair("action_type", this.LIZ), new Pair("client_key", this.LIZIZ), new Pair("anchor_source_type", this.LIZJ), new Pair("extra", this.LIZLLL), new Pair("enter_from", this.LJ), new Pair("enter_method", this.LJFF));
                }

                @Override // com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel
                public final JSONObject toJSON() throws JSONException {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("action_type", this.LIZ);
                    jSONObject2.put("client_key", this.LIZIZ);
                    jSONObject2.put("anchor_source_type", this.LIZJ);
                    jSONObject2.put("extra", this.LIZLLL);
                    jSONObject2.put("enter_from", this.LJ);
                    jSONObject2.put("enter_method", this.LJFF);
                    return jSONObject2;
                }

                @Override // X.InterfaceC634810Ov9
                public final Number getActionType() {
                    return this.LIZ;
                }

                @Override // X.InterfaceC634810Ov9
                public final String getAnchorSourceType() {
                    return this.LIZJ;
                }

                @Override // X.InterfaceC634810Ov9
                public final String getClientKey() {
                    return this.LIZIZ;
                }

                @Override // X.InterfaceC634810Ov9
                public final String getEnterFrom() {
                    return this.LJ;
                }

                @Override // X.InterfaceC634810Ov9
                public final String getEnterMethod() {
                    return this.LJFF;
                }

                @Override // X.InterfaceC634810Ov9
                public final String getExtra() {
                    return this.LIZLLL;
                }

                @Override // com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel
                public final List<String> provideParamList() {
                    return C13BV.INSTANCE;
                }

                {
                    this.LIZ = numValueOf;
                    this.LIZIZ = strOptString;
                    this.LIZJ = strOptString2;
                    this.LIZLLL = strOptString3;
                    this.LJ = strOptString4;
                    this.LJFF = strOptString5;
                }
            };
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            interfaceC634810Ov9 = null;
        }
        c634800Ov8.setBridgeContext(new InterfaceC634840OvC() { // from class: X.0OvA
            @Override // X.InterfaceC634840OvC
            public final <T> T LIZIZ(Class<T> cls) {
                return null;
            }

            @Override // X.InterfaceC634840OvC
            public final C1543410qGZ LIZJ() {
                return null;
            }

            @Override // X.InterfaceC634840OvC
            public final Activity LIZLLL() {
                return null;
            }

            @Override // X.InterfaceC634840OvC
            public final String getContainerID() {
                return "";
            }

            @Override // X.InterfaceC634840OvC
            public final View getView() {
                return null;
            }

            @Override // X.InterfaceC634840OvC
            public final void sendEvent(String str, JSONObject jSONObject2) {
            }

            @Override // X.InterfaceC634840OvC
            public final Context getContext() {
                return context;
            }
        });
        if (interfaceC634810Ov9 == null) {
            return;
        }
        c634800Ov8.LIZLLL(interfaceC634810Ov9);
    }
}
