package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import X.AbstractC1835360xrS;
import X.C09CT;
import X.C1CC2;
import X.C2204771BQt;
import X.C389001fE;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes28.dex */
public final class DownloadLiveReplayMethod extends AbstractC1835360xrS<Params, Object> {
    public WeakReference<C2204771BQt> LLILZIL;
    public int LLILZLL;

    public static int LJIIL(int i) {
        if (i == -7) {
            return 4;
        }
        if (i == -6) {
            return 2;
        }
        if (i == -5) {
            return 3;
        }
        if (i == -3) {
            return 2;
        }
        if (i == -2) {
            return 3;
        }
        if (i == -1) {
            return 4;
        }
        if (i != 4) {
            return i != 6 ? 0 : 2;
        }
        return 1;
    }

    @Override // X.AbstractC1835360xrS
    public final void LJIIIZ() {
    }

    @Override // X.AbstractC1835360xrS
    public final void LJIIIIZZ() {
        super.LJIIIIZZ();
    }

    public class Params {

        @C09CT("action")
        public int action;

        @C09CT("demand")
        public String demand;

        @C09CT("event_page")
        public String eventPage;

        @C09CT("size_mb")
        public int fileSize;

        @C09CT("ids")
        public List<String> ids;

        @C09CT("ids_for_event")
        public List<String> idsForEvent;

        @C09CT("ids_from_source")
        public List<String> idsFromSource;

        @C09CT("remux_status")
        public int remuxStatus;

        @C09CT("suffix")
        public String suffix;

        @C09CT("transcode_status")
        public int transcodeStatus;

        @C09CT("type")
        public String type;

        @C09CT("urls")
        public List<String> urls;

        public Params(DownloadLiveReplayMethod downloadLiveReplayMethod) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x014b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJ(com.bytedance.android.livesdk.browser.jsbridge.newmethods.DownloadLiveReplayMethod.Params r18) {
        /*
            Method dump skipped, instruction units count: 454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.browser.jsbridge.newmethods.DownloadLiveReplayMethod.LJIIJ(com.bytedance.android.livesdk.browser.jsbridge.newmethods.DownloadLiveReplayMethod$Params):void");
    }

    public final Unit LJIILIIL(JSONObject jSONObject) {
        WeakReference<C2204771BQt> weakReference = this.LLILZIL;
        if (weakReference != null && weakReference.get() != null) {
            this.LLILZIL.get().LIZ(jSONObject);
        } else {
            C389001fE.LIZ("downloadMediaStatusChange", jSONObject, System.currentTimeMillis(), false);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00de A[SYNTHETIC] */
    @Override // X.AbstractC1835360xrS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJII(com.bytedance.android.livesdk.browser.jsbridge.newmethods.DownloadLiveReplayMethod.Params r23, X.C2204771BQt r24) {
        /*
            Method dump skipped, instruction units count: 466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.browser.jsbridge.newmethods.DownloadLiveReplayMethod.LJII(java.lang.Object, X.1BQt):void");
    }

    public static void LJIIJJI(String str, int i, String str2, int i2, DownloadInfo downloadInfo, Function1 function1) {
        HashMap map = new HashMap();
        map.put("code", 1);
        map.put("download_status", Integer.valueOf(i));
        C1CC2.LJII(0, "ttlive_live_replay_send_js_event", map);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("url", str);
            jSONObject.put("code", 1);
            jSONObject.put("room_id", str2);
            if (i2 != 0) {
                jSONObject.put("fail_reason", i2);
            }
            if (downloadInfo != null && !TextUtils.isEmpty(downloadInfo.getExtra())) {
                jSONObject.put(FollowStatusChangeMethod.PARAM_UID, downloadInfo.getExtra());
            }
            if (downloadInfo != null) {
                jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, i);
                jSONObject.put("percent", ((double) downloadInfo.getDownloadProcess()) / 100.0d);
            } else {
                if (i == 4) {
                    jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, 4);
                } else {
                    jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, 0);
                }
                jSONObject.put("percent", 0.0d);
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            HashMap map2 = new HashMap();
            map2.put("error_msg", 1);
            C1CC2.LJII(1, "ttlive_live_replay_send_js_error", map2);
        }
        function1.invoke(jSONObject);
    }
}
