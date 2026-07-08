package com.ss.android.ugc.aweme;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.Locale;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public interface ICrossPlatformLegacyService {
    String LIZ();

    void LIZIZ(Activity activity, Uri.Builder builder);

    boolean LIZJ(Uri uri);

    boolean LIZLLL(Context context);

    boolean LJ(Context context, Uri uri);

    String LJFF();

    JSONObject LJI();

    Locale LJII();

    boolean LJIIIIZZ();

    void LJIIIZ(BaseActivity baseActivity, View view, float f, String... strArr);

    void LJIIJ();

    void LJIIJJI(Activity activity, String str);

    void LJIIL(Context context, AwemeRawAd awemeRawAd, String str, Boolean bool, String str2);

    boolean LJIILIIL(Context context, Uri uri);

    boolean LJIILJJIL(Context context, String str);

    boolean hasAppByHttp(Context context, Uri uri);
}
