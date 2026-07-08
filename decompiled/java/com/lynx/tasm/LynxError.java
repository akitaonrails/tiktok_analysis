package com.lynx.tasm;

import X.C1300120jwA;
import X.C2188811AlT;
import X.C786410Ut5;
import X.EnumC1300100jw8;
import X.EnumC1300110jw9;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import com.lynx.react.bridge.JavaOnlyMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class LynxError extends c0 {
    public boolean LIZ;
    public final boolean LIZIZ;
    public final int LIZJ;
    public final String LIZLLL;
    public JSONObject LJ;
    public final int LJFF;
    public String LJI;
    public final String LJII;
    public String LJIIIIZZ;
    public final String LJIIIZ;
    public String LJIIJ;
    public final List<EnumC1300110jw9> LJIIJJI;
    public final String LJIIL;
    public String LJIILIIL;
    public String LJIILJJIL;
    public Map<String, Object> LJIILL;

    public final int LIZIZ() {
        return this.LIZIZ ? this.LIZJ / 100 : this.LIZJ;
    }

    public final String LIZJ() {
        String strJ3;
        if (!TextUtils.isEmpty(this.LJI)) {
            return this.LJI;
        }
        if (TextUtils.isEmpty(this.LJII)) {
            String str = this.LIZLLL;
            if (str != null) {
                this.LJI = str;
            }
        } else {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("error_code", LIZIZ());
                jSONObject.put("sub_code", this.LIZJ);
                LJI("url", this.LJIIIIZZ, jSONObject);
                LJI("error", this.LJII, jSONObject);
                LJI("card_version", this.LJIIJ, jSONObject);
                LJI("sdk", LynxEnv.inst().getLynxVersion(), jSONObject);
                LJI("level", this.LJIIIZ, jSONObject);
                jSONObject.put("consumers", new JSONArray((Collection) this.LJIIJJI));
                LJI("fix_suggestion", this.LJIIL, jSONObject);
                LJI("error_stack", this.LJIILIIL, jSONObject);
                LJI("root_cause", this.LJIILJJIL, jSONObject);
                LJFF(jSONObject, this.LJIILL);
                JSONObject jSONObject2 = this.LJ;
                if (jSONObject2 != null && jSONObject2.length() > 0) {
                    jSONObject.put("user_define_info", this.LJ);
                }
                strJ3 = C786410Ut5.J3(jSONObject);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                LynxLog.e("LynxError", e.getMessage());
                strJ3 = null;
            }
            if (strJ3 == null) {
                strJ3 = "";
            }
            this.LJI = strJ3;
        }
        String str2 = this.LJI;
        return str2 != null ? str2 : "";
    }

    public final String LIZLLL() {
        String str = this.LJIILJJIL;
        return str == null ? "" : str;
    }

    public final String LJ() {
        String str = this.LJII;
        return str == null ? "" : str;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("{\"code\": ");
        sbLIZ.append(LIZIZ());
        sbLIZ.append(",\"msg\":");
        sbLIZ.append(LIZJ());
        sbLIZ.append("}");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LJII(String str) {
        this.LJI = null;
        this.LJIILIIL = str;
    }

    public final void LJIIIIZZ(String str) {
        this.LJI = null;
        this.LJIILJJIL = str;
    }

    public LynxError(String str, int i) {
        this.LIZLLL = "";
        this.LIZJ = i;
        this.LIZLLL = str;
    }

    public static void LJFF(JSONObject jSONObject, Map<String, Object> map) throws JSONException {
        if (map != null && !map.isEmpty()) {
            JSONObject jSONObject2 = new JSONObject();
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                if (entry.getKey().startsWith("lynx_context_")) {
                    jSONObject2.put(entry.getKey(), entry.getValue());
                } else {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
            }
            if (jSONObject2.length() > 0) {
                jSONObject.put("context", jSONObject2);
            }
        }
    }

    public final void LIZ(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.LJI = null;
            if (this.LJIILL == null) {
                this.LJIILL = new HashMap();
            }
            this.LJIILL.put(str, str2);
        }
    }

    public LynxError(int i, String str) {
        this(i, str, "", "error");
    }

    public static void LJI(String str, String str2, JSONObject jSONObject) throws JSONException {
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
            jSONObject.put(str, str2);
        }
    }

    public LynxError(int i, String str, String str2, String str3) {
        this(i, -3, str, str2, str3);
    }

    public LynxError(int i, int i2, String str, String str2, String str3) {
        this(i, i2, str, str2, str3, null, false);
    }

    public static LynxError createLynxError(int i, String str, String str2, String str3, JavaOnlyMap javaOnlyMap, boolean z) {
        return new LynxError(i, -1, str, str2, str3, javaOnlyMap, z);
    }

    public LynxError(int i, int i2, String str, String str2, String str3, Map map, boolean z) {
        C1300120jwA c1300120jwA;
        this.LIZLLL = "";
        this.LIZJ = i;
        this.LJII = str;
        this.LJFF = i2;
        this.LJIILL = map;
        this.LIZ = z;
        if (i != 0) {
            if (i != 30301) {
                if (i != 30302) {
                    switch (i) {
                        case 10299:
                            c1300120jwA = new C1300120jwA(EnumC1300100jw8.FATAL, "", Arrays.asList(new EnumC1300110jw9[0]));
                            break;
                        case 10501:
                            c1300120jwA = new C1300120jwA(EnumC1300100jw8.ERROR, "Please `loadTemplate` before `reloadTemplate`", Arrays.asList(EnumC1300110jw9.CLIENT));
                            break;
                        case 10701:
                            c1300120jwA = new C1300120jwA(EnumC1300100jw8.FATAL, "Please check if the app bundle has been signed correctly", Arrays.asList(new EnumC1300110jw9[0]));
                            break;
                        case 20201:
                            c1300120jwA = new C1300120jwA(EnumC1300100jw8.WARN, "Please throttle related calls.", Arrays.asList(new EnumC1300110jw9[0]));
                            break;
                        case 20301:
                            c1300120jwA = new C1300120jwA(EnumC1300100jw8.ERROR, "Please see error info.", Arrays.asList(new EnumC1300110jw9[0]));
                            break;
                        case 20401:
                            c1300120jwA = new C1300120jwA(EnumC1300100jw8.WARN, "Please throttle related calls.", Arrays.asList(new EnumC1300110jw9[0]));
                            break;
                        case 30196:
                            c1300120jwA = new C1300120jwA(EnumC1300100jw8.ERROR, "Please investigate the corresponding image download workflow for potential issues.", Arrays.asList(new EnumC1300110jw9[0]));
                            break;
                        case 30400:
                            c1300120jwA = new C1300120jwA(EnumC1300100jw8.ERROR, "", Arrays.asList(new EnumC1300110jw9[0]));
                            break;
                        case 39800:
                            c1300120jwA = new C1300120jwA(EnumC1300100jw8.ERROR, "This is unexpected. Please file an issue to Lynx to help address it.", Arrays.asList(new EnumC1300110jw9[0]));
                            break;
                        case 39900:
                            c1300120jwA = new C1300120jwA(EnumC1300100jw8.ERROR, "This is unexpected. Please file an issue to Lynx to help address it.", Arrays.asList(new EnumC1300110jw9[0]));
                            break;
                        case 40199:
                            c1300120jwA = new C1300120jwA(EnumC1300100jw8.ERROR, "", Arrays.asList(new EnumC1300110jw9[0]));
                            break;
                        case 50201:
                            c1300120jwA = new C1300120jwA(EnumC1300100jw8.FATAL, "", Arrays.asList(new EnumC1300110jw9[0]));
                            break;
                        case 60100:
                            c1300120jwA = new C1300120jwA(EnumC1300100jw8.ERROR, "Lynx internal error. Please check whether the creating of corresponding ShadowNode failed", Arrays.asList(new EnumC1300110jw9[0]));
                            break;
                        case 60201:
                            c1300120jwA = new C1300120jwA(EnumC1300100jw8.ERROR, "Infinite loop of layout happens. It usually happens when the front-end decides the content size based on the viewport size, while the client is deciding the viewport size based on the content size.", Arrays.asList(EnumC1300110jw9.FRONT_END));
                            break;
                        case 60301:
                            c1300120jwA = new C1300120jwA(EnumC1300100jw8.ERROR, "This is an internal error of Lynx. LynxUI has not been created or the creation failed while updating.", Arrays.asList(new EnumC1300110jw9[0]));
                            break;
                        case 60401:
                            c1300120jwA = new C1300120jwA(EnumC1300100jw8.ERROR, "This is an internal error of Lynx, which usually occurs when multiple threads access ShadowNode at the same time.", Arrays.asList(new EnumC1300110jw9[0]));
                            break;
                        case 90801:
                            c1300120jwA = new C1300120jwA(EnumC1300100jw8.ERROR, "Check if the server's response body is correct; Check if client unexpectedly consumes http response body using network request interceptor; You can use request's url and log id to track down the problem.", Arrays.asList(EnumC1300110jw9.FRONT_END));
                            break;
                        case 99800:
                            c1300120jwA = new C1300120jwA(EnumC1300100jw8.ERROR, "This error is explicitly defined by the native module implementation. Please refer to the module error handling guide or contact the module maintainer with complete error context.", Arrays.asList(EnumC1300110jw9.CLIENT));
                            break;
                        case 99900:
                            c1300120jwA = new C1300120jwA(EnumC1300100jw8.ERROR, "This error indicates an unhandled runtime exception within the native module implementation. Please refer to the module error handling guide or contact the module maintainer with complete error context.", Arrays.asList(EnumC1300110jw9.CLIENT));
                            break;
                        case 109900:
                            c1300120jwA = new C1300120jwA(EnumC1300100jw8.ERROR, "This error is caught by the Lynx Engine. Please file an issue to Lynx to help address it.", Arrays.asList(EnumC1300110jw9.LYNX));
                            break;
                        case 110100:
                            c1300120jwA = new C1300120jwA(EnumC1300100jw8.UNDECIDED, "", Arrays.asList(new EnumC1300110jw9[0]));
                            break;
                        case 130300:
                            c1300120jwA = new C1300120jwA(EnumC1300100jw8.ERROR, "Please use values following the property definitions. You can get the definitions at the official website.", Arrays.asList(new EnumC1300110jw9[0]));
                            break;
                        case 140201:
                            c1300120jwA = new C1300120jwA(EnumC1300100jw8.ERROR, "", Arrays.asList(new EnumC1300110jw9[0]));
                            break;
                        case 140401:
                            c1300120jwA = new C1300120jwA(EnumC1300100jw8.ERROR, "The used app bundle and injected data to hydrate the SSR page should be the same as ones used to render on the server side", Arrays.asList(new EnumC1300110jw9[0]));
                            break;
                        case 190100:
                            c1300120jwA = new C1300120jwA(EnumC1300100jw8.ERROR, "", Arrays.asList(new EnumC1300110jw9[0]));
                            break;
                        case 190200:
                            c1300120jwA = new C1300120jwA(EnumC1300100jw8.ERROR, "Calling requestAnimationFrame failed. This is usually caused by an error in the callback function. Please ensure that the callback function executes without errors.", Arrays.asList(new EnumC1300110jw9[0]));
                            break;
                        case 190300:
                            c1300120jwA = new C1300120jwA(EnumC1300100jw8.ERROR, "Make sure you have imported worklet file correctly.", Arrays.asList(new EnumC1300110jw9[0]));
                            break;
                        case 200101:
                            c1300120jwA = new C1300120jwA(EnumC1300100jw8.ERROR, "", Arrays.asList(new EnumC1300110jw9[0]));
                            break;
                        case 220101:
                            c1300120jwA = new C1300120jwA(EnumC1300100jw8.ERROR, "", Arrays.asList(EnumC1300110jw9.FRONT_END));
                            break;
                        case 220301:
                            c1300120jwA = new C1300120jwA(EnumC1300100jw8.ERROR, "This may be due to platform-specific limitations or system restrictions. If blur-radius is not supported on this platform, consider using CSS filter: blur() as an alternative.", Arrays.asList(new EnumC1300110jw9[0]));
                            break;
                        case 229800:
                            c1300120jwA = new C1300120jwA(EnumC1300100jw8.ERROR, "", Arrays.asList(new EnumC1300110jw9[0]));
                            break;
                        case 990100:
                            c1300120jwA = new C1300120jwA(EnumC1300100jw8.ERROR, "This error is caught by Lynx engine. Please file an issue to Lynx for help.", Arrays.asList(new EnumC1300110jw9[0]));
                            break;
                        case 990200:
                            c1300120jwA = new C1300120jwA(EnumC1300100jw8.ERROR, "This error is caught by Lynx engine. Please file an issue to Lynx for help.", Arrays.asList(new EnumC1300110jw9[0]));
                            break;
                        default:
                            switch (i) {
                                case 90101:
                                    c1300120jwA = new C1300120jwA(EnumC1300100jw8.ERROR, "Please verify that the invoked native module name matches the registered name and confirm module registration status.", Arrays.asList(EnumC1300110jw9.CLIENT));
                                    break;
                                case 90102:
                                    c1300120jwA = new C1300120jwA(EnumC1300100jw8.ERROR, "Please verify proper method registration using platform-specific annotations on Android or static method declarations on iOS (For details, refer to the native module documentation). Additionally, ensure that the invoked method name exactly matches the registered name in the native module implementation.", Arrays.asList(EnumC1300110jw9.CLIENT));
                                    break;
                                case 90103:
                                    c1300120jwA = new C1300120jwA(EnumC1300100jw8.ERROR, "Please ensure that the number of parameters passed to the native method exactly matches the declared parameters in the native module implementation.", Arrays.asList(EnumC1300110jw9.FRONT_END));
                                    break;
                                case 90104:
                                    c1300120jwA = new C1300120jwA(EnumC1300100jw8.ERROR, "Please verify that the parameter types in the method call exactly match the native module implementation. Ensure type compatibility across all parameters and validate the parameter order corresponds to the native method signature. You can check the native module documentation for expected data types.", Arrays.asList(EnumC1300110jw9.FRONT_END));
                                    break;
                                case 90105:
                                    c1300120jwA = new C1300120jwA(EnumC1300100jw8.ERROR, "Please file an issue to Lynx to help address it.", Arrays.asList(new EnumC1300110jw9[0]));
                                    break;
                                case 90106:
                                    c1300120jwA = new C1300120jwA(EnumC1300100jw8.ERROR, "Please file an issue to Lynx to help address it.", Arrays.asList(new EnumC1300110jw9[0]));
                                    break;
                                case 90107:
                                    c1300120jwA = new C1300120jwA(EnumC1300100jw8.ERROR, "Please file an issue to Lynx to help address it.", Arrays.asList(new EnumC1300110jw9[0]));
                                    break;
                                case 90108:
                                    c1300120jwA = new C1300120jwA(EnumC1300100jw8.WARN, "Please migrate deprecated api as soon as possible.", Arrays.asList(new EnumC1300110jw9[0]));
                                    break;
                                default:
                                    switch (i) {
                                        case 120201:
                                            c1300120jwA = new C1300120jwA(EnumC1300100jw8.ERROR, "", Arrays.asList(new EnumC1300110jw9[0]));
                                            break;
                                        case 120202:
                                            c1300120jwA = new C1300120jwA(EnumC1300100jw8.ERROR, "", Arrays.asList(new EnumC1300110jw9[0]));
                                            break;
                                        default:
                                            switch (i) {
                                                case 130100:
                                                    c1300120jwA = new C1300120jwA(EnumC1300100jw8.UNDECIDED, "", Arrays.asList(new EnumC1300110jw9[0]));
                                                    break;
                                                case 130101:
                                                    c1300120jwA = new C1300120jwA(EnumC1300100jw8.UNDECIDED, "", Arrays.asList(new EnumC1300110jw9[0]));
                                                    break;
                                                case 130102:
                                                    c1300120jwA = new C1300120jwA(EnumC1300100jw8.UNDECIDED, "Please check your value for the property follow the detailed message.", Arrays.asList(new EnumC1300110jw9[0]));
                                                    break;
                                                default:
                                                    switch (i) {
                                                        case 130201:
                                                            c1300120jwA = new C1300120jwA(EnumC1300100jw8.ERROR, "Ignore it or raise an issue on github to let us know. This error is unexpected, which might be caused by internal pipeline fault", Arrays.asList(new EnumC1300110jw9[0]));
                                                            break;
                                                        case 130202:
                                                            c1300120jwA = new C1300120jwA(EnumC1300100jw8.ERROR, "Ignore it or raise an issue on github to let us know. This error is unexpected, which might be caused by internal pipeline fault.", Arrays.asList(new EnumC1300110jw9[0]));
                                                            break;
                                                        case 130203:
                                                            c1300120jwA = new C1300120jwA(EnumC1300100jw8.ERROR, "Remove property name from inheritance list.", Arrays.asList(new EnumC1300110jw9[0]));
                                                            break;
                                                        default:
                                                            switch (i) {
                                                                case 140100:
                                                                    c1300120jwA = new C1300120jwA(EnumC1300100jw8.ERROR, "Please check if the data used to render the page is the same data generated from the SSR server runtime. Or check if SSR is correctly implemented.", Arrays.asList(new EnumC1300110jw9[0]));
                                                                    break;
                                                                case 140101:
                                                                    c1300120jwA = new C1300120jwA(EnumC1300100jw8.ERROR, "Please limit the client version to the ones that support the SSR data sent from the server side.", Arrays.asList(new EnumC1300110jw9[0]));
                                                                    break;
                                                                case 140102:
                                                                    c1300120jwA = new C1300120jwA(EnumC1300100jw8.ERROR, "Check the syntax of the script which is attached with SSR data.", Arrays.asList(new EnumC1300110jw9[0]));
                                                                    break;
                                                                default:
                                                                    switch (i) {
                                                                        case 160101:
                                                                            c1300120jwA = new C1300120jwA(EnumC1300100jw8.ERROR, "Please check whether the url of the lazy bundle is available", Arrays.asList(new EnumC1300110jw9[0]));
                                                                            break;
                                                                        case 160102:
                                                                            c1300120jwA = new C1300120jwA(EnumC1300100jw8.ERROR, "Please check whether the lazy bundle file is empty", Arrays.asList(new EnumC1300110jw9[0]));
                                                                            break;
                                                                        case 160103:
                                                                            c1300120jwA = new C1300120jwA(EnumC1300100jw8.ERROR, "Please check whether the lazy bundle file is broken or it is compatible with the host page", Arrays.asList(new EnumC1300110jw9[0]));
                                                                            break;
                                                                        case 160104:
                                                                            c1300120jwA = new C1300120jwA(EnumC1300100jw8.ERROR, "Please check the error message of the bundle", Arrays.asList(new EnumC1300110jw9[0]));
                                                                            break;
                                                                        default:
                                                                            switch (i) {
                                                                                case 220201:
                                                                                    c1300120jwA = new C1300120jwA(EnumC1300100jw8.ERROR, "Please check the legality of the item-key.", Arrays.asList(new EnumC1300110jw9[0]));
                                                                                    break;
                                                                                case 220202:
                                                                                    c1300120jwA = new C1300120jwA(EnumC1300100jw8.ERROR, "We have encountered a system-level error. Please file an issue to Lynx to help resolve this problem.", Arrays.asList(new EnumC1300110jw9[0]));
                                                                                    break;
                                                                                case 220203:
                                                                                    c1300120jwA = new C1300120jwA(EnumC1300100jw8.ERROR, "We have encountered a system-level error. Please file an issue to Lynx to help resolve this problem.", Arrays.asList(new EnumC1300110jw9[0]));
                                                                                    break;
                                                                                case 220204:
                                                                                    c1300120jwA = new C1300120jwA(EnumC1300100jw8.ERROR, "Please do not change the value of `vertical-orientation` dynamically.", Arrays.asList(new EnumC1300110jw9[0]));
                                                                                    break;
                                                                                case 220205:
                                                                                    c1300120jwA = new C1300120jwA(EnumC1300100jw8.ERROR, "For parameter usage, please check documentation of list component.", Arrays.asList(new EnumC1300110jw9[0]));
                                                                                    break;
                                                                                case 220206:
                                                                                    c1300120jwA = new C1300120jwA(EnumC1300100jw8.ERROR, "The internal state of the engine has become inconsistent.  Please file an issue to Lynx for help resolving this problem.", Arrays.asList(new EnumC1300110jw9[0]));
                                                                                    break;
                                                                                case 220207:
                                                                                    c1300120jwA = new C1300120jwA(EnumC1300100jw8.ERROR, "Please set the attribute enable-async-list of <list /> to true.", Arrays.asList(new EnumC1300110jw9[0]));
                                                                                    break;
                                                                                case 220208:
                                                                                    c1300120jwA = new C1300120jwA(EnumC1300100jw8.ERROR, "Please check the legality of the item-key.", Arrays.asList(new EnumC1300110jw9[0]));
                                                                                    break;
                                                                                default:
                                                                                    switch (i) {
                                                                                        case 10201:
                                                                                            c1300120jwA = new C1300120jwA(EnumC1300100jw8.FATAL, "Should not call `loadTemplate` while the rendering pipeline of app bundle has not finished", Arrays.asList(new EnumC1300110jw9[0]));
                                                                                            break;
                                                                                        case 10202:
                                                                                            c1300120jwA = new C1300120jwA(EnumC1300100jw8.FATAL, "Please call the initialization method of LynxEnv before loadTemplate.", Arrays.asList(EnumC1300110jw9.CLIENT));
                                                                                            break;
                                                                                        case 10203:
                                                                                            c1300120jwA = new C1300120jwA(EnumC1300100jw8.FATAL, "Please check if the app bundle is available", Arrays.asList(new EnumC1300110jw9[0]));
                                                                                            break;
                                                                                        case 10204:
                                                                                            c1300120jwA = new C1300120jwA(EnumC1300100jw8.FATAL, "Please check that 1. the provided bundle is an app bundle, 2. the engine version of the bundle is compatible with that of Lynx engine, 3. the bundle file is not broken.", Arrays.asList(new EnumC1300110jw9[0]));
                                                                                            break;
                                                                                        case 10205:
                                                                                            c1300120jwA = new C1300120jwA(EnumC1300100jw8.FATAL, "Please check the error message of the bundle.", Arrays.asList(new EnumC1300110jw9[0]));
                                                                                            break;
                                                                                        default:
                                                                                            switch (i) {
                                                                                                case 20100:
                                                                                                    c1300120jwA = new C1300120jwA(EnumC1300100jw8.UNDECIDED, "", Arrays.asList(new EnumC1300110jw9[0]));
                                                                                                    break;
                                                                                                case 20101:
                                                                                                    c1300120jwA = new C1300120jwA(EnumC1300100jw8.FATAL, "Please check the error message and fix the script.", Arrays.asList(new EnumC1300110jw9[0]));
                                                                                                    break;
                                                                                                case 20102:
                                                                                                    c1300120jwA = new C1300120jwA(EnumC1300100jw8.FATAL, "Please check the error message and fix the script.", Arrays.asList(new EnumC1300110jw9[0]));
                                                                                                    break;
                                                                                                case 20103:
                                                                                                    c1300120jwA = new C1300120jwA(EnumC1300100jw8.ERROR, "Please check the error message and fix binding API call.", Arrays.asList(new EnumC1300110jw9[0]));
                                                                                                    break;
                                                                                                case 20104:
                                                                                                    c1300120jwA = new C1300120jwA(EnumC1300100jw8.WARN, "Please check the error message and fix the script.", Arrays.asList(new EnumC1300110jw9[0]));
                                                                                                    break;
                                                                                                default:
                                                                                                    switch (i) {
                                                                                                        case 30101:
                                                                                                            c1300120jwA = new C1300120jwA(EnumC1300100jw8.ERROR, "Please resize the image to appropriate dimensions or enable downsampling.", Arrays.asList(new EnumC1300110jw9[0]));
                                                                                                            break;
                                                                                                        case 30102:
                                                                                                            c1300120jwA = new C1300120jwA(EnumC1300100jw8.ERROR, "Possibly due to an unsupported image format or a corrupted file. Please verify the integrity of the image file.", Arrays.asList(new EnumC1300110jw9[0]));
                                                                                                            break;
                                                                                                        case 30103:
                                                                                                            c1300120jwA = new C1300120jwA(EnumC1300100jw8.ERROR, "In most cases, the issue arises from a canceled image request or an unavailable network connection.", Arrays.asList(new EnumC1300110jw9[0]));
                                                                                                            break;
                                                                                                        default:
                                                                                                            switch (i) {
                                                                                                                case 30199:
                                                                                                                    c1300120jwA = new C1300120jwA(EnumC1300100jw8.ERROR, "An unidentified exception occurred that cannot be attributed to a specific cause. Please investigate further based on the available details.", Arrays.asList(new EnumC1300110jw9[0]));
                                                                                                                    break;
                                                                                                                case 30200:
                                                                                                                    c1300120jwA = new C1300120jwA(EnumC1300100jw8.ERROR, "", Arrays.asList(new EnumC1300110jw9[0]));
                                                                                                                    break;
                                                                                                                case 30201:
                                                                                                                    c1300120jwA = new C1300120jwA(EnumC1300100jw8.ERROR, "Please check the font-face format.", Arrays.asList(new EnumC1300110jw9[0]));
                                                                                                                    break;
                                                                                                                case 30202:
                                                                                                                    c1300120jwA = new C1300120jwA(EnumC1300100jw8.ERROR, "Please check whether font resource is available.", Arrays.asList(new EnumC1300110jw9[0]));
                                                                                                                    break;
                                                                                                                case 30203:
                                                                                                                    c1300120jwA = new C1300120jwA(EnumC1300100jw8.ERROR, "Please check whether the base64 resource is available.", Arrays.asList(new EnumC1300110jw9[0]));
                                                                                                                    break;
                                                                                                                case 30204:
                                                                                                                    c1300120jwA = new C1300120jwA(EnumC1300100jw8.ERROR, "Please use a font file in ttf or otf format.", Arrays.asList(new EnumC1300110jw9[0]));
                                                                                                                    break;
                                                                                                                case 30205:
                                                                                                                    c1300120jwA = new C1300120jwA(EnumC1300100jw8.UNDECIDED, "If the font is displayed correctly, there is no need to deal with it.", Arrays.asList(new EnumC1300110jw9[0]));
                                                                                                                    break;
                                                                                                                default:
                                                                                                                    switch (i) {
                                                                                                                        case 32101:
                                                                                                                            c1300120jwA = new C1300120jwA(EnumC1300100jw8.ERROR, "Please refer to the parameter descriptions of this API in documentation and check the parameters used in the call.", Arrays.asList(EnumC1300110jw9.FRONT_END));
                                                                                                                            break;
                                                                                                                        case 32102:
                                                                                                                            c1300120jwA = new C1300120jwA(EnumC1300100jw8.ERROR, "Please refer to the official documentation to integrate LynxImageService into your app.", Arrays.asList(EnumC1300110jw9.CLIENT));
                                                                                                                            break;
                                                                                                                        case 32103:
                                                                                                                            c1300120jwA = new C1300120jwA(EnumC1300100jw8.ERROR, "Please refer to the official documentation to implement the ILynxResourceService and integrate it into your app.", Arrays.asList(EnumC1300110jw9.CLIENT));
                                                                                                                            break;
                                                                                                                        case 32104:
                                                                                                                            c1300120jwA = new C1300120jwA(EnumC1300100jw8.ERROR, "Please check the network status or increase the timeout value.", Arrays.asList(EnumC1300110jw9.FRONT_END));
                                                                                                                            break;
                                                                                                                        default:
                                                                                                                            switch (i) {
                                                                                                                                case 40101:
                                                                                                                                    c1300120jwA = new C1300120jwA(EnumC1300100jw8.ERROR, "Should not call `getDerivedStateFromProps`, `getDerivedStateFromError`, `shouldComponentUpdate` as data processor.", Arrays.asList(new EnumC1300110jw9[0]));
                                                                                                                                    break;
                                                                                                                                case 40102:
                                                                                                                                    c1300120jwA = new C1300120jwA(EnumC1300100jw8.ERROR, "Target string data should be enabled to be parsed into a table.", Arrays.asList(new EnumC1300110jw9[0]));
                                                                                                                                    break;
                                                                                                                                default:
                                                                                                                                    switch (i) {
                                                                                                                                        case 50101:
                                                                                                                                            c1300120jwA = new C1300120jwA(EnumC1300100jw8.FATAL, "", Arrays.asList(new EnumC1300110jw9[0]));
                                                                                                                                            break;
                                                                                                                                        case 50102:
                                                                                                                                            c1300120jwA = new C1300120jwA(EnumC1300100jw8.ERROR, "", Arrays.asList(new EnumC1300110jw9[0]));
                                                                                                                                            break;
                                                                                                                                        default:
                                                                                                                                            switch (i) {
                                                                                                                                                case 111101:
                                                                                                                                                    c1300120jwA = new C1300120jwA(EnumC1300100jw8.FATAL, "", Arrays.asList(new EnumC1300110jw9[0]));
                                                                                                                                                    break;
                                                                                                                                                case 111102:
                                                                                                                                                    c1300120jwA = new C1300120jwA(EnumC1300100jw8.ERROR, "", Arrays.asList(new EnumC1300110jw9[0]));
                                                                                                                                                    break;
                                                                                                                                                default:
                                                                                                                                                    this.LJIIIZ = str3;
                                                                                                                                                    this.LJIIL = str2;
                                                                                                                                                    this.LJIIJJI = Collections.emptyList();
                                                                                                                                                    return;
                                                                                                                                            }
                                                                                                                                            break;
                                                                                                                                    }
                                                                                                                                    break;
                                                                                                                            }
                                                                                                                            break;
                                                                                                                    }
                                                                                                                    break;
                                                                                                            }
                                                                                                            break;
                                                                                                    }
                                                                                                    break;
                                                                                            }
                                                                                            break;
                                                                                    }
                                                                                    break;
                                                                            }
                                                                            break;
                                                                    }
                                                                    break;
                                                            }
                                                            break;
                                                    }
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                } else {
                    c1300120jwA = new C1300120jwA(EnumC1300100jw8.ERROR, "Please check whether the local external resource is available", Arrays.asList(new EnumC1300110jw9[0]));
                }
            } else {
                c1300120jwA = new C1300120jwA(EnumC1300100jw8.ERROR, "Please check whether the url of the external resource is available", Arrays.asList(new EnumC1300110jw9[0]));
            }
        } else {
            c1300120jwA = new C1300120jwA(EnumC1300100jw8.ERROR, "", Arrays.asList(new EnumC1300110jw9[0]));
        }
        EnumC1300100jw8 enumC1300100jw8 = c1300120jwA.LIZ;
        this.LJIIIZ = enumC1300100jw8 != EnumC1300100jw8.UNDECIDED ? enumC1300100jw8.LL : str3;
        this.LJIIL = c1300120jwA.LIZIZ.isEmpty() ? str2 : c1300120jwA.LIZIZ;
        this.LJIIJJI = c1300120jwA.LIZJ;
        this.LIZIZ = true;
    }
}
