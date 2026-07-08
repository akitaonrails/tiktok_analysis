package com.ss.android.ugc.aweme.settingsrequest.api;

import X.C0CG1;
import X.C10FJ;
import X.C310720CFy;
import X.C313070COz;
import X.InterfaceC800080Va2;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.fragment.app.Fragment;
import com.google.gson.n;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public interface ISettingsRequestService {
    void LIZ(Context context);

    void LIZIZ(n nVar);

    void LIZJ(Activity activity, Fragment fragment);

    C310720CFy LIZLLL();

    C310720CFy LJ(SharedPreferences.Editor editor, IESSettingsProxy iESSettingsProxy);

    void LJFF(C0CG1 c0cg1);

    List<C10FJ> LJI();

    void LJII(PushSettings pushSettings);

    void LJIIIIZZ(JSONObject jSONObject);

    void LJIIIZ();

    void LJIIJ();

    void LJIIJJI(Map<String, String> map);

    JSONObject LJIIL(String str);

    void LJIILIIL(String str);

    InterfaceC800080Va2 LJIILJJIL();

    void LJIILL(C313070COz c313070COz);

    boolean shouldUseRecyclerPartialUpdate();
}
