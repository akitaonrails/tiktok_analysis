package com.ss.android.ugc.aweme.web.service;

import X.C1026310coX;
import X.C1035690d3f;
import X.C1035740d3k;
import X.C1035880d3y;
import X.C1069080dvW;
import X.C19EG;
import X.EnumC1027220cq0;
import X.EnumC1036160d4Q;
import X.InterfaceC1034470d1h;
import X.InterfaceC1036270d4b;
import X.InterfaceC1541990qEH;
import Y.ARunnableS109S0100000_9;
import Y.ARunnableS116S0100000_16;
import android.app.Activity;
import android.content.Context;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.hybrid.spark.SparkContext;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.web.model.NonAdWebModel;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.FinalJumpTargetPageConfig;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public interface IAdWebUtils {
    void Ou(SparkContext sparkContext, Context context);

    void Pu(InterfaceC1034470d1h interfaceC1034470d1h);

    void Qu(WebView webView, AwemeRawAd awemeRawAd, String str);

    C1035880d3y Ru(AwemeRawAd awemeRawAd, C1035740d3k c1035740d3k);

    boolean Su(Aweme aweme, String str);

    boolean Tu(Aweme aweme, String str, String str2);

    FinalJumpTargetPageConfig Uu(AwemeRawAd awemeRawAd, String str);

    FinalJumpTargetPageConfig Vu(AwemeRawAd awemeRawAd, String str, String str2);

    boolean Wu(AwemeRawAd awemeRawAd);

    String Xu(C1026310coX c1026310coX);

    void Yu();

    void Zu();

    boolean av(SparkContext sparkContext, C1035880d3y c1035880d3y, InterfaceC1541990qEH interfaceC1541990qEH, String str);

    boolean bv(Aweme aweme, String str, String str2, boolean z);

    String cv(String str);

    String dp();

    Fragment dv(Context context, C1035880d3y c1035880d3y, String str, String str2, ARunnableS116S0100000_16 aRunnableS116S0100000_16);

    void ev();

    Fragment fv(Context context, Aweme aweme, C1035740d3k c1035740d3k, EnumC1027220cq0 enumC1027220cq0, ARunnableS109S0100000_9 aRunnableS109S0100000_9);

    String gv(String str, AwemeRawAd awemeRawAd, Map<String, String> map);

    void hv(AwemeRawAd awemeRawAd);

    boolean iv(Aweme aweme, String str);

    Fragment jv(C19EG c19eg, Aweme aweme);

    void kv(Activity activity, C1035880d3y c1035880d3y, Function1 function1);

    C1035690d3f lv(Context context, C1035880d3y c1035880d3y);

    Fragment mv(C19EG c19eg, C1026310coX c1026310coX, boolean z, EnumC1036160d4Q enumC1036160d4Q, int i, InterfaceC1036270d4b interfaceC1036270d4b, boolean z2);

    boolean nr(C1035880d3y c1035880d3y);

    boolean nv(String str);

    C1035880d3y ov(Aweme aweme, AnchorCommonStruct anchorCommonStruct, C1035740d3k c1035740d3k, NonAdWebModel nonAdWebModel);

    String p0(String str, String str2);

    void pv(boolean z, Activity activity, Fragment fragment, Boolean bool, FrameLayout frameLayout, int i, boolean z2, boolean z3, boolean z4, Function1 function1, Function1 function12);

    boolean q0(String str, String str2);

    C1069080dvW qv(Context context, boolean z, String str, boolean z2);

    JSONObject rv(AwemeRawAd awemeRawAd, String str, JSONObject jSONObject);

    String sv(AwemeRawAd awemeRawAd, String str, String str2, int i);

    String tv(WebView webView);

    void uv(C1035880d3y c1035880d3y);

    String vv(C1035880d3y c1035880d3y, String str);

    C1035880d3y wv(int i, C1026310coX c1026310coX);
}
