package com.ss.bytertc.engine.avclient;

import X.C1276320jJm;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.ttnet.TTNetInit;
import java.util.ArrayList;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: loaded from: classes21.dex */
public final class LyraxAVClientUtil {
    public static final Companion Companion = new Companion();

    public static final class Companion {
        public final ArrayList<String> buildAccessHosts() {
            ArrayList<String> arrayList = new ArrayList<>();
            try {
                arrayList.add(TTNetInit.ttUrlDispatch("https://rtcpc-access-sg.tiktokv.com/").LIZIZ);
                arrayList.add(TTNetInit.ttUrlDispatch("https://rtc-access-sg.tiktokv.com/").LIZIZ);
                return arrayList;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return arrayList;
            }
        }

        public final String buildLogSdkWebsocketUrl() {
            String strDealUrl = "";
            try {
                C1276320jJm c1276320jJmTtUrlDispatch = TTNetInit.ttUrlDispatch("https://rtc-logger-va.tiktokv.com/");
                if (TextUtils.isEmpty(c1276320jJmTtUrlDispatch.LIZIZ)) {
                    return "";
                }
                strDealUrl = dealUrl(c1276320jJmTtUrlDispatch.LIZIZ);
                return strDealUrl;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return strDealUrl;
            }
        }

        public final String buildResourceDownloadUrl() {
            String str = "https://rtc-sg.tiktokv.com";
            try {
                C1276320jJm c1276320jJmTtUrlDispatch = TTNetInit.ttUrlDispatch("https://rtc-sg.tiktokv.com");
                if (TextUtils.isEmpty(c1276320jJmTtUrlDispatch.LIZIZ)) {
                    return "https://rtc-sg.tiktokv.com";
                }
                str = c1276320jJmTtUrlDispatch.LIZIZ;
                return str;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return str;
            }
        }

        private final String dealUrl(String str) {
            if (!TextUtils.isEmpty(str)) {
                if (a0.LJJIIZI(str, "http://", false)) {
                    return u.LJJIFFI(str, "http", "wss", false);
                }
                if (!a0.LJJIIZI(str, "https://", false)) {
                    return str;
                }
                return u.LJJIFFI(str, "https", "wss", false);
            }
            return str;
        }
    }
}
