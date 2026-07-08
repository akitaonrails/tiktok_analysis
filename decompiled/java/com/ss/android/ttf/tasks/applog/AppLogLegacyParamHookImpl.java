package com.ss.android.ttf.tasks.applog;

import X.C1389320mG2;
import X.C1389330mG3;
import X.C1389340mG4;
import X.C1389350mG5;
import X.C786410Ut5;
import android.os.Bundle;
import com.tiktok.ttf.applog.init.IAppLogLegacyParamHook;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
public final class AppLogLegacyParamHookImpl implements IAppLogLegacyParamHook {
    @Override // com.tiktok.ttf.applog.init.IAppLogLegacyParamHook
    public final void LIZ(Bundle bundle) {
        String str;
        String str2;
        if (bundle != null) {
            C1389350mG5 c1389350mG5LIZIZ = C1389340mG4.LIZIZ();
            if (c1389350mG5LIZIZ.LJFF) {
                str = "3";
            } else {
                str = "1";
            }
            C786410Ut5.LJJJI("pad_interface_orientation", str, bundle);
            if (c1389350mG5LIZIZ.LJI) {
                if (c1389350mG5LIZIZ.LJII) {
                    str2 = "pic_in_pic";
                } else {
                    str2 = "multi_mode";
                }
                C786410Ut5.LJJJI("screen_multi_mode", str2, bundle);
                C786410Ut5.LJJJI("screen_on_multi_win_width_dp", String.valueOf(c1389350mG5LIZIZ.LIZIZ()), bundle);
                C786410Ut5.LJJJI("screen_on_multi_win_height_dp", String.valueOf(c1389350mG5LIZIZ.LIZ()), bundle);
            }
        }
    }

    @Override // com.tiktok.ttf.applog.init.IAppLogLegacyParamHook
    public final void LIZJ(Map<String, Object> map) {
        String str;
        String str2;
        if (map != null) {
            C1389350mG5 c1389350mG5LIZIZ = C1389340mG4.LIZIZ();
            if (c1389350mG5LIZIZ.LJFF) {
                str = "3";
            } else {
                str = "1";
            }
            map.put("pad_interface_orientation", str);
            if (c1389350mG5LIZIZ.LJI) {
                if (c1389350mG5LIZIZ.LJII) {
                    str2 = "pic_in_pic";
                } else {
                    str2 = "multi_mode";
                }
                map.put("screen_multi_mode", str2);
                map.put("screen_on_multi_win_width_dp", String.valueOf(c1389350mG5LIZIZ.LIZIZ()));
                map.put("screen_on_multi_win_height_dp", String.valueOf(c1389350mG5LIZIZ.LIZ()));
            }
        }
    }

    @Override // com.tiktok.ttf.applog.init.IAppLogLegacyParamHook
    public final JSONObject LIZIZ(String str, JSONObject jSONObject) throws JSONException {
        if (Intrinsics.LJFF(str, "play_session_events") && jSONObject != null) {
            jSONObject.put("is_comment_open", String.valueOf(C1389330mG3.LIZ));
        }
        C1389320mG2.LIZ(jSONObject);
        return jSONObject;
    }
}
