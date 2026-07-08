package com.ss.android.ugc.aweme.spark;

import X.AbstractC1063600dmg;
import X.C0X6P;
import X.C1018780ccO;
import X.C1047030dLx;
import X.C1059860dge;
import X.C1063220dm4;
import X.C1063590dmf;
import X.C1168160gVK;
import X.C1168200gVO;
import X.C12O2;
import X.C1311670kEn;
import X.C1530310pvR;
import X.C1535740q4C;
import X.C1535830q4L;
import X.C1537480q70;
import X.C1538580q8m;
import X.C1539050q9X;
import X.C1540150qBJ;
import X.C1544380qI8;
import X.C1546070qKr;
import X.C1546080qKs;
import X.C1749280vcc;
import X.C1BM4;
import X.C1BME;
import X.C1BRZ;
import X.C2203511BLx;
import X.C2280808wg;
import X.C843080X5m;
import X.C854820Xg8;
import X.InterfaceC1051760dTa;
import X.InterfaceC1063710dmr;
import X.InterfaceC1541990qEH;
import X.InterfaceC2211711BhJ;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.ies.web.jsbridge.IESJsBridge;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.view.UISimpleView;
import com.ss.android.ugc.aweme.gecko.GeckoXNetImpl;
import com.ss.android.ugc.aweme.pgc.hybrid.ui.LynxCreatorTextAreaView;
import com.ss.android.ugc.aweme.poi.textarea.LocalServiceTextArea;
import com.ss.android.ugc.aweme.poi.textarea.LocalServiceTextAreaNew;
import j27.s;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AwS602S0100000_23;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public interface ISparkHostApi {
    String LIZ();

    void LIZIZ(Context context);

    boolean LIZJ(Context context, String str);

    LynxUI<?> LIZLLL(s sVar);

    LynxUI<?> LJ(s sVar);

    LynxUI<?> LJFF(s sVar);

    Long LJI();

    void LJII(int i, JSONObject jSONObject);

    UISimpleView LJIIIIZZ(s sVar, boolean z);

    void LJIIIZ(Fragment fragment, String str);

    void LJIIJ(Map<String, String> map);

    String LJIIJJI();

    ShadowNode LJIIL();

    Map LJIILIIL(Context context, C1537480q70 c1537480q70);

    ShadowNode LJIILJJIL();

    LynxUI<?> LJIILL(s sVar);

    String LJIILLIIL();

    void LJIIZILJ(Context context);

    LynxUI<?> LJIJ(s sVar);

    LynxUI<?> LJIJI(s sVar);

    void LJIJJ();

    String LJIJJLI();

    void LJIL();

    String LJJ(String str);

    void LJJI();

    List<C1311670kEn> LJJIFFI();

    List<C1311670kEn> LJJII();

    LynxUI<?> LJJIII(s sVar);

    C1540150qBJ LJJIIJ();

    void LJJIIJZLJL();

    boolean LJJIIZ();

    void LJJIIZI(C2203511BLx c2203511BLx, C1BME c1bme);

    String LJJIJ();

    C1546070qKr LJJIJIIJI();

    WebResourceResponse LJJIJIIJIL(WebView webView, boolean z, String str, Uri uri, Map map);

    void LJJIJIL();

    void LJJIJL(long j, C0X6P c0x6p);

    int LJJIJLIJ();

    SparkHostApiImpl LJJIL();

    boolean LJJIZ(String str);

    void LJJJ();

    String LJJJI(Fragment fragment);

    SparkHostApiImpl LJJJIL();

    String LJJJJ(String str);

    void LJJJJI();

    List<Class<? extends InterfaceC1063710dmr>> LJJJJIZL();

    Map<String, Class<? extends InterfaceC1063710dmr>> LJJJJJL();

    LocalServiceTextArea LJJJJL(s sVar);

    boolean LJJJJLI();

    List<String> LJJJJLL();

    List<String> LJJJJZ();

    void LJJJJZI(SparkContext sparkContext);

    InterfaceC2211711BhJ LJJJLIIL(Object obj, String str);

    void LJJJLL();

    boolean LJJJLZIJ();

    boolean LJJJZ(String str);

    C1063590dmf LJJL(C1059860dge c1059860dge, Class cls);

    boolean LJJLI();

    List<AbstractC1063600dmg> LJJLIIIIJ();

    boolean LJJLIIIJ();

    LynxCreatorTextAreaView LJJLIIIJILLIZJL(s sVar);

    void LJJLIIIJJI();

    CharSequence LJJLIIIJJIZ(C1749280vcc c1749280vcc, String str, String str2);

    C1535830q4L LJJLIIIJL();

    boolean LJJLIIIJLJLI(C1537480q70 c1537480q70);

    boolean LJJLIIIJLLLLLLLZ();

    boolean LJJLIIJ();

    void LJJLIL(WebView webView);

    boolean LJJLJ(Context context, String str, String str2);

    Class<? extends Fragment> LJJLJLI();

    void LJJLL(LifecycleOwner lifecycleOwner, Observer<Integer> observer);

    boolean LJJZ();

    Map<String, Object> LJJZZI(String str);

    void LJJZZIII();

    boolean LJL(AwS602S0100000_23 awS602S0100000_23);

    void LJLIIIL(C1539050q9X c1539050q9X);

    boolean LJLIIL();

    C1047030dLx LJLIL();

    boolean LJLILLLLZI();

    String LJLJI();

    boolean LJLJJI(String str);

    InterfaceC1051760dTa LJLJJL(Context context, String str, C1537480q70 c1537480q70);

    C1018780ccO LJLJJLL(InterfaceC1541990qEH interfaceC1541990qEH);

    C1546080qKs LJLJL();

    String LJLJLJ();

    void LJLJLLL(SparkActivity sparkActivity);

    int LJLL();

    void LJLLI(Activity activity);

    void LJLLILLLL(boolean z);

    C12O2 LJLLJ();

    C1530310pvR LJLLL(WebKitView webKitView, boolean z, String str, Uri uri, Map map);

    boolean LJLLLL();

    void LJLLLLLL(C1537480q70 c1537480q70, WebView webView, IESJsBridge iESJsBridge, Object obj, Object obj2, Object obj3, Object obj4);

    C1544380qI8 LJLZ(String str, String str2, String str3, String str4);

    C1BRZ LJZ(Object obj);

    C1063220dm4 LJZI(InterfaceC1541990qEH interfaceC1541990qEH);

    SparkHostApiImpl LJZL();

    boolean LL(Context context);

    void LLD(C2280808wg c2280808wg);

    boolean LLF(Context context);

    int LLFF();

    C1BM4 LLFFF(Context context);

    void LLFII();

    List<C1168160gVK> LLI(List<C1168200gVO> list);

    List<Class<? extends InterfaceC1063710dmr>> LLIFFJFJJ();

    List LLII(List list);

    void LLIIII(Activity activity);

    boolean LLIIIILZ();

    SparkHostApiImpl LLIIIJ();

    void LLIIIL(C843080X5m c843080X5m);

    SparkHostApiImpl LLIIJI();

    String LLIIJLIL(String str);

    boolean LLIIL();

    boolean LLIILII();

    void LLIILZL(InterfaceC1051760dTa interfaceC1051760dTa, Context context);

    boolean LLIIZ();

    SparkHostApiImpl LLIL();

    C1535740q4C LLILII();

    GeckoXNetImpl LLILIL(Context context);

    boolean LLILL(AwS602S0100000_23 awS602S0100000_23);

    void LLILLIZIL();

    String LLILLJJLI();

    boolean LLILLL();

    boolean LLILZ();

    void LLILZIL(SparkContext sparkContext);

    boolean LLILZLL(Context context);

    SparkHostApiImpl LLIZ();

    void LLJ(String str);

    String LLJI(Context context, Uri uri);

    IESJsBridge LLJIJIL(C1537480q70 c1537480q70);

    boolean LLJILJIL();

    void LLJILJILJ();

    int LLJILLL(String str, String str2, String str3, List list);

    boolean LLJJ();

    String LLJJI(String str);

    Class<? extends Activity> LLJJIII();

    LocalServiceTextAreaNew LLJJIJI(s sVar);

    void LLJJIJIIJIL(C854820Xg8 c854820Xg8);

    void LLJJJ(long j);

    Pair LLJJJIL(InterfaceC1541990qEH interfaceC1541990qEH);

    Set<String> LLJJJJ();

    void LLJJJJJIL();

    void LLJJJJLIIL(C1538580q8m c1538580q8m);

    void LLJJL();

    void LLJJLIIIJLLLLLLLZ(Context context);

    SparkHostApiImpl LLJL();

    Map<String, String> LLZZZIL();

    boolean checkPluginInstalled(String str);

    List<C1311670kEn> e3();

    String getAppLanguage();

    int getEffectiveConnectionType();

    LynxUI<?> getLynxAudioLiveView(s sVar);

    String getNetworkType();

    String getTheme(int i);

    boolean isFirstInstallAndFirstLaunch();

    void onEventV3(String str, JSONObject jSONObject);

    void splitCompatInstall(Context context);
}
