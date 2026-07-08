package com.ss.android.ugc.aweme.deeplink;

import X.C1962707mT;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Map;

/* JADX INFO: loaded from: classes29.dex */
public interface IDeepLinkService {
    String LJJ(String str);

    boolean LJJI(String str);

    boolean LJJIFFI();

    boolean LJJII(Context context);

    long LJJIII();

    boolean LJJIIJ();

    boolean LJJIIJZLJL(Activity activity);

    String LJJIIZ(Context context);

    boolean LJJIIZI(String str);

    void LJJIJ();

    String LJJIJIIJI(Uri uri);

    boolean LJJIJIIJIL(Aweme aweme, String str);

    void LJJIJIL(Activity activity, String str, C1962707mT c1962707mT);

    boolean LJJIJL();

    Map<String, String> LJJIJLIJ(String str);

    void LJJIL();

    boolean LJJIZ(String str);

    boolean LJJJ(Context context, Intent intent, String str);

    void LJJJI(BaseActivity baseActivity);

    boolean LJJJIL(String str, String str2);

    void LJJJJ();

    boolean LJJJJI();

    void LJJJJIZL(Intent intent);

    String LJJJJJ();

    boolean LJJJJJL();

    boolean LJJJJL(Aweme aweme);

    boolean LJJJJLI();

    boolean LJJJJLL();

    void LJJJJZ(int i, Uri uri, String str);

    void LJJJJZI(String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2);

    long LJJJLIIL();

    boolean LJJJLL();

    boolean LJJJLZIJ();

    boolean LJJJZ(String str);

    boolean LJJL(boolean z, Uri uri);

    void LJJLI(int i, String str, String str2);

    String LJJLIIIIJ(String str);

    boolean LJJLIIIJ(Context context, String str, String str2);

    boolean LJJLIIIJILLIZJL();

    void LJJLIIIJJI();

    String LJJLIIIJJIZ();

    int LJJLIIIJL();

    boolean LJJLIIIJLJLI(Uri uri);

    boolean LJJLIIIJLLLLLLLZ();

    Class<? extends Activity> LJJLIIJ();

    boolean LJJLIL(String str, String str2);

    boolean LJJLJ(Activity activity, C1962707mT c1962707mT);

    boolean LJJLJLI();

    boolean LJJLL();

    boolean LJJZ();

    boolean LJJZZI(Uri uri);

    String LJJZZIII(String str, Map map);

    boolean LJL();

    void LJLI(String str);

    boolean LJLIIIL(Activity activity);

    String LJLIIL(String str);

    int LJLIL();

    void LJLILLLLZI(String str, String str2);

    Uri LJLJI(Uri uri);

    Class<? extends Activity> LJLJJI(String str);

    String getCustomScheme();

    boolean isAppHot();
}
