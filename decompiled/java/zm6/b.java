package zm6;

import X.C0W7K;
import X.C0W7O;
import X.C0W7P;
import X.C0W7Q;
import X.C0WV6;
import X.C1BJO;
import X.C786410Ut5;
import X.C807660VmG;
import X.C810670Vr7;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class b {
    public static final /* synthetic */ int LIZJ = 0;
    public JSONObject LIZ;
    public Bundle LIZIZ;

    public interface a {
        void LIZ(b bVar);
    }

    public static b LIZ(String str) {
        if (str == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("version");
            if (jSONObject.getJSONObject("bridge_args").getString("method").equals("applink") && string.equals("2")) {
                b bVar = new b();
                JSONObject jSONObject2 = jSONObject.getJSONObject("method_args");
                bVar.LIZ = jSONObject2;
                if (jSONObject2.has("ref")) {
                    bVar.LIZ.getString("ref");
                } else if (bVar.LIZ.has("referer_data")) {
                    JSONObject jSONObject3 = bVar.LIZ.getJSONObject("referer_data");
                    if (jSONObject3.has("fb_ref")) {
                        jSONObject3.getString("fb_ref");
                    }
                }
                if (bVar.LIZ.has("target_url")) {
                    LIZJ(Uri.parse(bVar.LIZ.getString("target_url")));
                }
                if (bVar.LIZ.has("extras")) {
                    JSONObject jSONObject4 = bVar.LIZ.getJSONObject("extras");
                    if (jSONObject4.has("deeplink_context")) {
                        JSONObject jSONObject5 = jSONObject4.getJSONObject("deeplink_context");
                        if (jSONObject5.has("promo_code")) {
                            jSONObject5.getString("promo_code");
                        }
                    }
                }
                bVar.LIZIZ = LIZLLL(bVar.LIZ);
                return bVar;
            }
        } catch (C1BJO e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        } catch (JSONException e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        return null;
    }

    public static void LIZJ(Uri uri) {
        if (C807660VmG.LIZ(b.class) || uri == null) {
            return;
        }
        try {
            String queryParameter = uri.getQueryParameter("al_applink_data");
            if (queryParameter == null) {
                return;
            }
            try {
                new JSONObject(queryParameter);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static Bundle LIZLLL(JSONObject jSONObject) throws JSONException {
        Bundle bundle = new Bundle();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONObject) {
                C786410Ut5.LJJIIZI(bundle, LIZLLL((JSONObject) obj), next);
            } else if (obj instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) obj;
                int i = 0;
                if (jSONArray.length() == 0) {
                    bundle.putStringArray(next, new String[0]);
                } else {
                    Object obj2 = jSONArray.get(0);
                    if (obj2 instanceof JSONObject) {
                        Bundle[] bundleArr = new Bundle[jSONArray.length()];
                        while (i < jSONArray.length()) {
                            bundleArr[i] = LIZLLL(jSONArray.getJSONObject(i));
                            i++;
                        }
                        C786410Ut5.LJJIJLIJ(bundle, next, bundleArr);
                    } else if (!(obj2 instanceof JSONArray)) {
                        String[] strArr = new String[jSONArray.length()];
                        while (i < jSONArray.length()) {
                            strArr[i] = jSONArray.get(i).toString();
                            i++;
                        }
                        bundle.putStringArray(next, strArr);
                    } else {
                        throw new C1BJO("Nested arrays are not supported.");
                    }
                }
            } else {
                C786410Ut5.LJJJI(next, obj.toString(), bundle);
            }
        }
        return bundle;
    }

    public static void LIZIZ(Context context, String str, a aVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("event", "DEFERRED_APP_LINK");
            C0W7P c0w7pLIZ = C0W7O.LIZ(context);
            C0W7K.LJFF();
            C0W7Q.LJIJJLI(jSONObject, c0w7pLIZ, C810670Vr7.LIZJ(context, 0, "com.facebook.sdk.appEventPreferences").getBoolean("limitEventUsage", false), context);
            C0W7Q.LJIL(FacebookSdk.LIZJ(), jSONObject);
            jSONObject.put("application_package_name", context.getPackageName());
            b bVarLIZ = null;
            try {
                GraphRequest graphRequest = new GraphRequest(null, C786410Ut5.j4("%s/activities", new Object[]{str}), null, C0WV6.POST, null, 32);
                graphRequest.LIZJ = jSONObject;
                JSONObject jSONObject2 = graphRequest.LIZJ().LIZIZ;
                if (jSONObject2 != null) {
                    String strOptString = jSONObject2.optString("applink_args");
                    long jOptLong = jSONObject2.optLong("click_time", -1L);
                    String strOptString2 = jSONObject2.optString("applink_class");
                    String strOptString3 = jSONObject2.optString("applink_url");
                    if (!TextUtils.isEmpty(strOptString) && (bVarLIZ = LIZ(strOptString)) != null) {
                        if (jOptLong != -1) {
                            try {
                                JSONObject jSONObject3 = bVarLIZ.LIZ;
                                if (jSONObject3 != null) {
                                    jSONObject3.put("com.facebook.platform.APPLINK_TAP_TIME_UTC", jOptLong);
                                }
                                Bundle bundle = bVarLIZ.LIZIZ;
                                if (bundle != null) {
                                    C786410Ut5.LJJJI("com.facebook.platform.APPLINK_TAP_TIME_UTC", Long.toString(jOptLong), bundle);
                                }
                            } catch (JSONException e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                        }
                        if (strOptString2 != null) {
                            try {
                                JSONObject jSONObject4 = bVarLIZ.LIZ;
                                if (jSONObject4 != null) {
                                    jSONObject4.put("com.facebook.platform.APPLINK_NATIVE_CLASS", strOptString2);
                                }
                                Bundle bundle2 = bVarLIZ.LIZIZ;
                                if (bundle2 != null) {
                                    C786410Ut5.LJJJI("com.facebook.platform.APPLINK_NATIVE_CLASS", strOptString2, bundle2);
                                }
                            } catch (JSONException e2) {
                                TryCatchGuardChecker.doCheck(e2);
                            }
                        }
                        if (strOptString3 != null) {
                            try {
                                JSONObject jSONObject5 = bVarLIZ.LIZ;
                                if (jSONObject5 != null) {
                                    jSONObject5.put("com.facebook.platform.APPLINK_NATIVE_URL", strOptString3);
                                }
                                Bundle bundle3 = bVarLIZ.LIZIZ;
                                if (bundle3 != null) {
                                    C786410Ut5.LJJJI("com.facebook.platform.APPLINK_NATIVE_URL", strOptString3, bundle3);
                                }
                            } catch (JSONException e3) {
                                TryCatchGuardChecker.doCheck(e3);
                            }
                        }
                    }
                }
            } catch (Exception e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
            aVar.LIZ(bVarLIZ);
        } catch (JSONException e5) {
            TryCatchGuardChecker.doCheck(e5);
            throw new C1BJO("An error occurred while preparing deferred app link", e5);
        }
    }
}
