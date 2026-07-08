package com.bytedance.android.livesdk.comment.emoji;

import X.C08KC;
import X.C09CT;
import X.C1143680frq;
import X.C19748512Ol;
import X.C20441214yg;
import X.C2107108Nh;
import X.C2188811AlT;
import X.C603820NmG;
import android.graphics.Bitmap;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes18.dex */
public final class OnlineDrawableEmojiResourceManager {
    public final String LIZ;
    public final String LIZIZ;
    public final Map<String, String> LIZJ;
    public final String LIZLLL;
    public final ReentrantLock LJ;
    public final C603820NmG<String, Bitmap> LJFF;

    public static final class EmojiInfoBean {

        @C09CT("key")
        public final String key = "";

        @C09CT("value")
        public final String value = "";
    }

    public final Map<String, String> LIZIZ() {
        Map<String, String> map;
        if (!this.LIZJ.isEmpty()) {
            return this.LIZJ;
        }
        try {
            try {
                this.LJ.lock();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LJFF("OnlineSmallEmojiResourceManager", "loadInfoMap failed", e);
            }
            if (!this.LIZJ.isEmpty()) {
                map = this.LIZJ;
            } else if (LiveCommentEmojiSwitchSettingSetting.INSTANCE.getValue()) {
                for (Map.Entry<String, String> entry : LiveCommentDefaultEmojiInfoSetting.INSTANCE.getValue().entrySet()) {
                    this.LIZJ.put(entry.getKey(), entry.getValue());
                }
                map = this.LIZJ;
            } else {
                InputStream inputStreamLIZIZ = C1143680frq.LIZIZ(this.LIZLLL, this.LIZ);
                if (inputStreamLIZIZ == null) {
                    C20441214yg.LIZIZ("OnlineSmallEmojiResourceManager", "loadInfoMap inputStream is null");
                    this.LJ.unlock();
                    return null;
                }
                C20441214yg.LIZIZ("OnlineSmallEmojiResourceManager", "loadInfoMap from disk or net");
                try {
                    Reader inputStreamReader = new InputStreamReader(inputStreamLIZIZ, Charsets.UTF_8);
                    BufferedReader bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
                    try {
                        String strLIZJ = C08KC.LIZJ(bufferedReader);
                        C2107108Nh.LIZ(bufferedReader, null);
                        List<EmojiInfoBean> list = (List) C19748512Ol.LIZJ.LJIIIIZZ(strLIZJ, new TypeToken<List<? extends EmojiInfoBean>>() { // from class: X.0CVu
                        }.getType());
                        if (list != null) {
                            for (EmojiInfoBean emojiInfoBean : list) {
                                this.LIZJ.put(emojiInfoBean.key, emojiInfoBean.value);
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        try {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                th = th2;
                                TryCatchGuardChecker.doCheck(th);
                                C2107108Nh.LIZ(bufferedReader, th);
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            th = null;
                            TryCatchGuardChecker.doCheck(th);
                            C2107108Nh.LIZ(bufferedReader, th);
                            throw th;
                        }
                    }
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    C20441214yg.LJFF("OnlineSmallEmojiResourceManager", "loadInfoMap from disk or net failed", e2);
                }
                map = this.LIZJ;
            }
            this.LJ.unlock();
            return map;
        } finally {
            TryCatchGuardChecker.doCheck(th);
            this.LJ.unlock();
        }
    }

    public OnlineDrawableEmojiResourceManager() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("live_emoji");
        String str = File.separator;
        sbLIZ.append(str);
        sbLIZ.append("info.json");
        this.LIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("live_emoji");
        sbLIZ2.append(str);
        this.LIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        this.LIZJ = Collections.synchronizedMap(new LinkedHashMap());
        this.LIZLLL = "tiktok_live_interaction_normal_2";
        this.LJ = new ReentrantLock();
        this.LJFF = new C603820NmG<>(LiveSmallEmojiResCacheSizeSetting.INSTANCE.getValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00db  */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00b0 -> B:29:0x00b1). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.drawable.Drawable LIZ(java.lang.String r10) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comment.emoji.OnlineDrawableEmojiResourceManager.LIZ(java.lang.String):android.graphics.drawable.Drawable");
    }
}
