package com.ss.android.ugc.aweme.fe.method;

import X.C086F;
import X.C1061360dj4;
import X.InterfaceC1041760dDS;
import X.InterfaceC1061480djG;
import Y.ARunnableS85S0200000_16;
import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.ies.web.jsbridge.IESJsBridge;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public class JsAppDownloadMethod extends BaseCommonJavaMethod implements InterfaceC1061480djG {
    public C1061360dj4 LLILLL;

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
        if (event == Lifecycle.Event.ON_RESUME) {
            onResume();
        } else if (event == Lifecycle.Event.ON_PAUSE) {
            onPause();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        WeakReference<Context> weakReference;
        if (this.LLILLL == null || (weakReference = this.mContextRef) == null || weakReference.get() == null) {
            return;
        }
        this.LLILLL.getClass();
        this.LLILLL = null;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause() {
        C1061360dj4 c1061360dj4 = this.LLILLL;
        if (c1061360dj4 != null) {
            c1061360dj4.getClass();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume() {
        WeakReference<Context> weakReference;
        if (this.LLILLL == null || (weakReference = this.mContextRef) == null || weakReference.get() == null) {
            return;
        }
        C1061360dj4 c1061360dj4 = this.LLILLL;
        this.mContextRef.get();
        c1061360dj4.getClass();
    }

    public JsAppDownloadMethod(IESJsBridge iESJsBridge) {
        super(iESJsBridge);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final BaseCommonJavaMethod attach(WeakReference<Context> weakReference) {
        Context context = weakReference.get();
        if (context instanceof LifecycleOwner) {
            C086F c086f = C086F.LIZ;
            ARunnableS85S0200000_16 aRunnableS85S0200000_16 = new ARunnableS85S0200000_16(this, context, 13);
            c086f.getClass();
            C086F.LJII(aRunnableS85S0200000_16);
        }
        super.attach(weakReference);
        return this;
    }

    /* JADX WARN: Type inference failed for: r0v21, types: [X.0dZE] */
    /* JADX WARN: Type inference failed for: r0v23, types: [X.0dZE] */
    /* JADX WARN: Type inference failed for: r0v26, types: [X.0dZE] */
    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, InterfaceC1041760dDS interfaceC1041760dDS) {
        WeakReference<Context> weakReference = this.mContextRef;
        if (weakReference != null && weakReference.get() != null) {
            if (this.LLILLL == null) {
                this.mContextRef.get();
                this.LLILLL = new C1061360dj4(this);
            }
            String strOptString = jSONObject.optString("func");
            if (TextUtils.equals("subscribe_app_ad", strOptString)) {
                C1061360dj4 c1061360dj4 = this.LLILLL;
                Context context = this.mContextRef.get();
                c1061360dj4.getClass();
                if (context != null) {
                    new Object() { // from class: X.0dZE
                        public final List<String> LIZ = new LinkedList();

                        public final void LIZ(JSONObject jSONObject2) {
                            Object obj;
                            if (jSONObject2 == null) {
                                return;
                            }
                            jSONObject2.optString(FollowStatusChangeMethod.PARAM_UID, null);
                            jSONObject2.optString("source", null);
                            jSONObject2.optString("card_type", null);
                            jSONObject2.optString("pkg_name", null);
                            jSONObject2.optString("name", null);
                            jSONObject2.optString("download_url", null);
                            jSONObject2.optInt("is_ad", 0);
                            jSONObject2.optString("log_extra", null);
                            jSONObject2.optString("event_tag", "game_room_app_ad");
                            jSONObject2.optString("event_refer", null);
                            jSONObject2.optJSONObject("extra");
                            jSONObject2.optInt("support_multiple", 0);
                            jSONObject2.optString("group_id", null);
                            jSONObject2.optString("quick_app_url", "");
                            jSONObject2.optInt("download_mode", 0);
                            jSONObject2.optString("open_url", null);
                            jSONObject2.optString("source_avatar", null);
                            jSONObject2.optInt("auto_open", 0);
                            jSONObject2.optInt("is_landing_page_ad", 0);
                            jSONObject2.optInt("disable_download_dialog", 1);
                            jSONObject2.optInt("download_scene", 0);
                            JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("click_track_url_list");
                            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                                    try {
                                        obj = jSONArrayOptJSONArray.get(i);
                                    } catch (Exception e) {
                                        TryCatchGuardChecker.doCheck(e);
                                        obj = null;
                                    }
                                    if (obj instanceof String) {
                                        ((LinkedList) this.LIZ).add(obj);
                                    }
                                }
                            }
                        }
                    }.LIZ(jSONObject.optJSONObject("data"));
                    return;
                }
                return;
            }
            if (TextUtils.equals("unsubscribe_app_ad", strOptString)) {
                if (this.LLILLL == null) {
                    return;
                }
                new Object() { // from class: X.0dZE
                    public final List<String> LIZ = new LinkedList();

                    public final void LIZ(JSONObject jSONObject2) {
                        Object obj;
                        if (jSONObject2 == null) {
                            return;
                        }
                        jSONObject2.optString(FollowStatusChangeMethod.PARAM_UID, null);
                        jSONObject2.optString("source", null);
                        jSONObject2.optString("card_type", null);
                        jSONObject2.optString("pkg_name", null);
                        jSONObject2.optString("name", null);
                        jSONObject2.optString("download_url", null);
                        jSONObject2.optInt("is_ad", 0);
                        jSONObject2.optString("log_extra", null);
                        jSONObject2.optString("event_tag", "game_room_app_ad");
                        jSONObject2.optString("event_refer", null);
                        jSONObject2.optJSONObject("extra");
                        jSONObject2.optInt("support_multiple", 0);
                        jSONObject2.optString("group_id", null);
                        jSONObject2.optString("quick_app_url", "");
                        jSONObject2.optInt("download_mode", 0);
                        jSONObject2.optString("open_url", null);
                        jSONObject2.optString("source_avatar", null);
                        jSONObject2.optInt("auto_open", 0);
                        jSONObject2.optInt("is_landing_page_ad", 0);
                        jSONObject2.optInt("disable_download_dialog", 1);
                        jSONObject2.optInt("download_scene", 0);
                        JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("click_track_url_list");
                        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                                try {
                                    obj = jSONArrayOptJSONArray.get(i);
                                } catch (Exception e) {
                                    TryCatchGuardChecker.doCheck(e);
                                    obj = null;
                                }
                                if (obj instanceof String) {
                                    ((LinkedList) this.LIZ).add(obj);
                                }
                            }
                        }
                    }
                }.LIZ(jSONObject.optJSONObject("data"));
                return;
            }
            if (TextUtils.equals("cancel_download_app_ad", strOptString)) {
                C1061360dj4 c1061360dj42 = this.LLILLL;
                if (c1061360dj42 == null || c1061360dj42.LIZ == null) {
                    return;
                }
                new Object() { // from class: X.0dZE
                    public final List<String> LIZ = new LinkedList();

                    public final void LIZ(JSONObject jSONObject2) {
                        Object obj;
                        if (jSONObject2 == null) {
                            return;
                        }
                        jSONObject2.optString(FollowStatusChangeMethod.PARAM_UID, null);
                        jSONObject2.optString("source", null);
                        jSONObject2.optString("card_type", null);
                        jSONObject2.optString("pkg_name", null);
                        jSONObject2.optString("name", null);
                        jSONObject2.optString("download_url", null);
                        jSONObject2.optInt("is_ad", 0);
                        jSONObject2.optString("log_extra", null);
                        jSONObject2.optString("event_tag", "game_room_app_ad");
                        jSONObject2.optString("event_refer", null);
                        jSONObject2.optJSONObject("extra");
                        jSONObject2.optInt("support_multiple", 0);
                        jSONObject2.optString("group_id", null);
                        jSONObject2.optString("quick_app_url", "");
                        jSONObject2.optInt("download_mode", 0);
                        jSONObject2.optString("open_url", null);
                        jSONObject2.optString("source_avatar", null);
                        jSONObject2.optInt("auto_open", 0);
                        jSONObject2.optInt("is_landing_page_ad", 0);
                        jSONObject2.optInt("disable_download_dialog", 1);
                        jSONObject2.optInt("download_scene", 0);
                        JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("click_track_url_list");
                        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                                try {
                                    obj = jSONArrayOptJSONArray.get(i);
                                } catch (Exception e) {
                                    TryCatchGuardChecker.doCheck(e);
                                    obj = null;
                                }
                                if (obj instanceof String) {
                                    ((LinkedList) this.LIZ).add(obj);
                                }
                            }
                        }
                    }
                }.LIZ(jSONObject.optJSONObject("data"));
                return;
            }
            if (TextUtils.equals("get_download_pause_task", strOptString) || TextUtils.equals("get_downloading_task", strOptString) || !TextUtils.equals("get_install_status", strOptString) || this.LLILLL == null || jSONObject.length() == 0) {
                return;
            }
            jSONObject.optJSONArray("task_list");
        }
    }
}
