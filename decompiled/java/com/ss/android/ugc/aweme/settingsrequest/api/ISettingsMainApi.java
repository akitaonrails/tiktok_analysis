package com.ss.android.ugc.aweme.settingsrequest.api;

import X.C0CG1;
import X.C10FJ;
import X.C310720CFy;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.fragment.app.Fragment;
import com.google.gson.n;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public interface ISettingsMainApi {
    void LIZ(Context context);

    void LIZIZ(n nVar);

    void LIZJ(Activity activity, Fragment fragment);

    C310720CFy LIZLLL();

    C310720CFy LJ(SharedPreferences.Editor editor, IESSettingsProxy iESSettingsProxy);

    void LJFF(C0CG1 c0cg1);

    List<C10FJ> LJI();

    boolean shouldUseRecyclerPartialUpdate();
}
