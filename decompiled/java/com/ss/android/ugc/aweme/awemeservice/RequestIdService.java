package com.ss.android.ugc.aweme.awemeservice;

import X.C0SDA;
import X.C2188811AlT;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.PlayListInfo;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class RequestIdService implements IRequestIdService {
    public final Map<String, C0SDA> LIZ = new ConcurrentHashMap();

    @Override // com.ss.android.ugc.aweme.awemeservice.api.IRequestIdService
    public final C0SDA LIZLLL(String str) {
        C0SDA c0sda = (C0SDA) ((ConcurrentHashMap) this.LIZ).get(str);
        if (c0sda == null) {
            return new C0SDA();
        }
        return c0sda;
    }

    @Override // com.ss.android.ugc.aweme.awemeservice.api.IRequestIdService
    public final String LIZ(int i, Aweme aweme) {
        if (aweme == null) {
            return "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(aweme.getAid());
        sbLIZ.append(i);
        String str = LIZLLL(C2188811AlT.LIZIZ(sbLIZ)).LIZ;
        if (str == null) {
            return "";
        }
        return str;
    }

    @Override // com.ss.android.ugc.aweme.awemeservice.api.IRequestIdService
    public final JSONObject LIZJ(int i, Aweme aweme) {
        String str;
        if (aweme == null) {
            return new JSONObject();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(aweme.getAid());
        sbLIZ.append(i);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        JSONObject jSONObject = new JSONObject();
        try {
            C0SDA c0sdaLIZLLL = LIZLLL(strLIZIZ);
            String str2 = c0sdaLIZLLL.LIZ;
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("request_id", str2);
            }
            Integer num = c0sdaLIZLLL.LIZIZ;
            if (num != null) {
                jSONObject.put("order", num);
            }
            if (AwemeExtKt.isImage(aweme)) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            jSONObject.put("is_photo", str);
            PlayListInfo playListInfo = aweme.playlist_info;
            if (playListInfo != null && !TextUtils.isEmpty(playListInfo.getMixId())) {
                jSONObject.put("playlist_id", aweme.playlist_info.getMixId());
                return jSONObject;
            }
            return jSONObject;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return new JSONObject();
        }
    }

    @Override // com.ss.android.ugc.aweme.awemeservice.api.IRequestIdService
    public final void LIZIZ(int i, String str, String str2) {
        if (str != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && ((ConcurrentHashMap) this.LIZ).get(str) == null) {
            ((ConcurrentHashMap) this.LIZ).put(str, new C0SDA(str2, i));
        }
    }
}
