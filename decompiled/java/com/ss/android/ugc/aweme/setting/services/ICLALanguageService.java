package com.ss.android.ugc.aweme.setting.services;

import X.C20700015zK;
import X.C20700915zT;
import android.content.Context;
import com.bytedance.router.SmartRoute;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.setting.serverpush.model.ClaCombineSettings;
import com.ss.android.ugc.aweme.setting.serverpush.model.ContentLanguage;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;
import com.ss.android.ugc.trill.setting.DoNotTranslateSettingPageV2;
import com.ss.android.ugc.trill.setting.TranslationLanguageSettingPage;
import java.util.List;

/* JADX INFO: loaded from: classes32.dex */
public interface ICLALanguageService {
    void LIZ(ClaCombineSettings claCombineSettings);

    SmartRoute LIZIZ(Context context, Aweme aweme, String str);

    C20700915zT LIZJ(C20700015zK c20700015zK);

    SmartRoute LIZLLL(Context context, Aweme aweme, String str, String str2, List list);

    SmartRoute LJ(Context context, PushSettings pushSettings, String str, Aweme aweme);

    SmartRoute LJFF(Context context, List<? extends ContentLanguage> list, List<String> list2, String str, Aweme aweme);

    SmartRoute LJI(Context context, PushSettings pushSettings, String str, Aweme aweme);

    DoNotTranslateSettingPageV2 LJII(PushSettings pushSettings, String str, String str2, Aweme aweme);

    TranslationLanguageSettingPage LJIIIIZZ(List list, String str, Aweme aweme);
}
