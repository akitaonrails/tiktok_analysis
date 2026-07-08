package com.ss.android.ugc.aweme.base.component;

import X.C08DG;
import X.C1386470mBR;
import X.C15O7;
import X.C20684815ws;
import X.InterfaceC744180THc;
import android.app.Activity;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.android.ugc.aweme.analysis.Analysis;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.base.component.AnalysisActivityComponent;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
public class AnalysisActivityComponent implements GenericLifecycleObserver {
    public long LL;
    public final WeakReference<InterfaceC744180THc> LLILLJJLI;
    public final Activity LLILLL;

    public AnalysisActivityComponent(Fragment fragment) {
        this.LLILLL = fragment.getActivity();
        if (fragment instanceof InterfaceC744180THc) {
            this.LLILLJJLI = new WeakReference<>(fragment);
        }
    }

    public final void LIZIZ(final String str) {
        if (this.LL != -1) {
            final long jCurrentTimeMillis = System.currentTimeMillis() - this.LL;
            if (jCurrentTimeMillis > 0) {
                C15O7.LIZIZ(new Callable() { // from class: X.0mWA
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        InterfaceC744180THc interfaceC744180THc;
                        Analysis analysis;
                        AnalysisActivityComponent analysisActivityComponent = this.LL;
                        long j = jCurrentTimeMillis;
                        String str2 = str;
                        analysisActivityComponent.getClass();
                        C1C7U.LIZ("AnalysisActivityComponent@7e70.onPause$1L");
                        WeakReference<InterfaceC744180THc> weakReference = analysisActivityComponent.LLILLJJLI;
                        if (weakReference != null && (interfaceC744180THc = weakReference.get()) != null && (analysis = interfaceC744180THc.getAnalysis()) != null && !TextUtils.isEmpty(analysis.getLabelName())) {
                            C810650Vr5.LIZIZ(analysisActivityComponent.LLILLL, "event_v1", "stay_time", analysis.getLabelName(), j, analysis.getExt_value(), null);
                            C1386470mBR c1386470mBR = new C1386470mBR();
                            c1386470mBR.LJJLIIIJ = String.valueOf(j);
                            c1386470mBR.LJJIJL(analysis.getLabelName());
                            c1386470mBR.LJIJI(((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).LLILZ(String.valueOf(analysis.getValue())));
                            JSONObject ext_json = analysis.getExt_json();
                            if (ext_json != null) {
                                c1386470mBR.LJJLIIIJLLLLLLLZ = ext_json.has("process_id") ? JSONObjectProtectorUtils.getString(ext_json, "process_id") : "";
                                c1386470mBR.LJJLIIJ = ext_json.has("challenge_id") ? JSONObjectProtectorUtils.getString(ext_json, "challenge_id") : "";
                                String string = ext_json.has("page_model") ? JSONObjectProtectorUtils.getString(ext_json, "page_model") : "";
                                C2082308Dt c2082308Dt = InterfaceC1210900hcG.LIZ;
                                c1386470mBR.LJFF("page_model", string, c2082308Dt);
                                c1386470mBR.LJFF("music_id", ext_json.has("music_id") ? JSONObjectProtectorUtils.getString(ext_json, "music_id") : "", c2082308Dt);
                                c1386470mBR.LJFF("single_song_shoot_previous_page", ext_json.has("single_song_shoot_previous_page") ? JSONObjectProtectorUtils.getString(ext_json, "single_song_shoot_previous_page") : "", c2082308Dt);
                                c1386470mBR.LJFF("single_song_shoot_previous_enter_method", ext_json.has("single_song_shoot_previous_enter_method") ? JSONObjectProtectorUtils.getString(ext_json, "single_song_shoot_previous_enter_method") : "", c2082308Dt);
                                c1386470mBR.LJ("previous_search_query", ext_json.has("previous_search_query") ? JSONObjectProtectorUtils.getString(ext_json, "previous_search_query") : "");
                            }
                            if ("chat".equalsIgnoreCase(analysis.getLabelName())) {
                                c1386470mBR.LJ("chat_type", analysis.getCategory());
                                if (ext_json != null) {
                                    AnalysisActivityComponent.LIZ(c1386470mBR, ext_json, "chat_process_id");
                                    AnalysisActivityComponent.LIZ(c1386470mBR, ext_json, "conversation_id");
                                    AnalysisActivityComponent.LIZ(c1386470mBR, ext_json, "enter_method");
                                    AnalysisActivityComponent.LIZ(c1386470mBR, ext_json, "conv_entrance_log");
                                    AnalysisActivityComponent.LIZ(c1386470mBR, ext_json, "is_send_msg");
                                }
                            }
                            if (!C830060WhI.LIZ(str2)) {
                                c1386470mBR.LJ("page_name", str2);
                            }
                            c1386470mBR.LJIILJJIL();
                        }
                        C1C7U.LIZIZ("AnalysisActivityComponent@7e70.onPause$1L");
                        return null;
                    }
                }, C20684815ws.LJFF(), null);
            }
            this.LL = -1L;
        }
    }

    public AnalysisActivityComponent(Activity activity) {
        this.LLILLL = activity;
        if (activity instanceof InterfaceC744180THc) {
            this.LLILLJJLI = new WeakReference<>(activity);
        }
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        int i = C08DG.LIZ[event.ordinal()];
        if (i != 1) {
            if (i == 2) {
                LIZIZ(null);
                return;
            }
            return;
        }
        this.LL = System.currentTimeMillis();
    }

    public static void LIZ(C1386470mBR c1386470mBR, JSONObject jSONObject, String str) {
        String strOptString;
        if (jSONObject.has(str)) {
            strOptString = jSONObject.optString(str);
        } else {
            strOptString = "";
        }
        c1386470mBR.LJ(str, strOptString);
    }
}
