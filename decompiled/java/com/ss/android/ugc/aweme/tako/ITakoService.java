package com.ss.android.ugc.aweme.tako;

import X.C03H5;
import X.C06KX;
import X.C0Q7N;
import X.C1166904hP;
import X.C1214550hi9;
import X.C1363660lae;
import X.C1367050lg7;
import X.C1388100mE4;
import X.C13IQ;
import X.C14EH;
import X.C14F8;
import X.C14F9;
import X.C14FB;
import X.C14FC;
import X.C19EG;
import X.C1DD4;
import X.C2189821An6;
import X.C665120Q7a;
import X.EnumC1373490lqV;
import X.InterfaceC1294060jmO;
import X.InterfaceC1350790lFt;
import X.InterfaceC1364105Vn;
import X.InterfaceC1606670rub;
import X.InterfaceC1859860yUy;
import X.InterfaceC1864030ybh;
import X.InterfaceC19395910uT;
import X.InterfaceC19396010uU;
import X.InterfaceC430910Gv3;
import X.InterfaceC446860Hfg;
import X.InterfaceC665370Q7z;
import X.InterfaceC666720QDe;
import X.InterfaceC684380Qsu;
import X.InterfaceC685580Quq;
import X.InterfaceC815880VzW;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.method.BaseMovementMethod;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.common.reflist.core.model.ReferenceItemBridge;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.ss.android.ugc.aweme.tako.detail.model.TakoKeyFramePoint;
import com.ss.android.ugc.aweme.tako.mob.ITakoMob;
import com.ss.android.ugc.aweme.tako.model.AIBotInfo;
import com.ss.android.ugc.aweme.tako.model.FeedIconBubbleInfo;
import com.ss.android.ugc.aweme.tako.model.FeedbarDrawCreateInfo;
import com.ss.android.ugc.aweme.tako.model.NimbleParams;
import com.ss.android.ugc.aweme.tako.model.SearchBingItem;
import com.ss.android.ugc.aweme.tako.model.SmartSearchItem;
import com.ss.android.ugc.aweme.tako.model.SuggestionWordInfo;
import com.ss.android.ugc.aweme.tako.model.TakoActionItem;
import com.ss.android.ugc.aweme.tako.model.TakoEnterParams;
import com.ss.android.ugc.aweme.tako.model.TakoEntranceRequestInfo;
import com.ss.android.ugc.aweme.tako.model.TakoEventTracker;
import com.ss.android.ugc.aweme.tako.model.TakoImageItem;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS265S0300000_21;
import org.json.JSONObject;
import tiktok.compose.assem.UiComposableAssem;

/* JADX INFO: loaded from: classes31.dex */
public interface ITakoService {
    void LIZ();

    void LIZIZ(String str, JSONObject jSONObject);

    void LIZJ(String str, Map<String, String> map);

    InterfaceC446860Hfg LIZLLL(RecyclerView recyclerView);

    String LJ();

    void LJFF(boolean z);

    InterfaceC684380Qsu LJI();

    Object LJII(InterfaceC1364105Vn<? super String> interfaceC1364105Vn);

    boolean LJIIIIZZ(Context context, C2189821An6 c2189821An6, String str, String str2);

    boolean LJIIIZ();

    int LJIIJ();

    int LJIIJJI();

    C0Q7N LJIIL();

    int LJIILIIL();

    Integer LJIILJJIL();

    InterfaceC1350790lFt LJIILL();

    boolean LJIILLIIL();

    boolean LJIIZILJ(SharePackage sharePackage);

    String LJIJ(C19EG c19eg);

    C1363660lae LJIJI();

    boolean LJIJJ(Aweme aweme);

    String LJIJJLI(String str);

    Map<String, String> LJIL(Aweme aweme, C2189821An6 c2189821An6);

    String LJJ(Context context, Bitmap bitmap, String str);

    InterfaceC815880VzW LJJI();

    @InterfaceC1294060jmO
    TakoEnterParams LJJIFFI(String str, long j, String str2, String str3, String str4, List list, String str5, String str6, String str7, String str8, Long l, String str9, List list2, List list3, List list4, List list5, List list6, Map map, TakoEventTracker takoEventTracker, TakoActionItem takoActionItem, boolean z, Aweme aweme, FeedbarDrawCreateInfo feedbarDrawCreateInfo, String str10, String str11, AIBotInfo aIBotInfo, String str12, String str13, Integer num, boolean z2, String str14, String str15, String str16, boolean z3, FeedIconBubbleInfo feedIconBubbleInfo, SuggestionWordInfo suggestionWordInfo, TakoEntranceRequestInfo takoEntranceRequestInfo, String str17, String str18, String str19, String str20, String str21, SmartSearchItem smartSearchItem, boolean z4, boolean z5, boolean z6, String str22, String str23, Integer num2, NimbleParams nimbleParams, C665120Q7a c665120Q7a, String str24);

    void LJJII(Context context);

    C1367050lg7 LJJIII();

    void LJJIIJ(String str, Fragment fragment, C14FB c14fb);

    void LJJIIJZLJL(Map<String, String> map);

    String LJJIIZ();

    void LJJIIZI(String str);

    boolean LJJIJ(Context context);

    boolean LJJIJIIJI(Context context);

    boolean LJJIJIIJIL();

    void LJJIJIL();

    void LJJIJL(int i, String str);

    Object LJJIJLIJ(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn);

    C1DD4 LJJIL();

    Object LJJIZ(int i, long j, InterfaceC1364105Vn interfaceC1364105Vn);

    void LJJJ();

    String LJJJI(long j, Boolean bool, String str, String str2, String str3, boolean z);

    void LJJJIL(Context context, boolean z, String str, boolean z2);

    int LJJJJ();

    InterfaceC1606670rub LJJJJI();

    boolean LJJJJIZL(String str);

    void LJJJJJ(Context context, String str, EnumC1373490lqV enumC1373490lqV);

    C14FC LJJJJJL();

    void LJJJJL(Fragment fragment, List<TakoImageItem> list, int i, String str, List<String> list2, Map<String, String> map, boolean z);

    void LJJJJLI(boolean z);

    boolean LJJJJLL(SharePackage sharePackage, String str);

    void LJJJJZ(SharePackage sharePackage, String str, String str2, Function1<? super Boolean, Unit> function1);

    void LJJJJZI(boolean z);

    String LJJJLIIL();

    ITakoMob LJJJLL();

    void LJJJLZIJ(int i, Activity activity, String str, Map map, Function1 function1, boolean z, boolean z2);

    BaseMovementMethod LJJJZ();

    int LJJL();

    void LJJLI(int i, Activity activity, Function1 function1);

    boolean LJJLIIIIJ();

    InterfaceC685580Quq LJJLIIIJ();

    boolean LJJLIIIJILLIZJL();

    void LJJLIIIJJI(long j, String str);

    void LJJLIIIJJIZ(Context context, String str, String str2);

    void LJJLIIIJL(C2189821An6 c2189821An6, LifecycleOwner lifecycleOwner, View view, Aweme aweme, Function0<Boolean> function0, Function1<? super Boolean, Unit> function1, Function1<? super String, Unit> function12);

    void LJJLIIIJLJLI(int i);

    String LJJLIIIJLLLLLLLZ();

    void LJJLIIJ(int i);

    InterfaceC430910Gv3 LJJLIL(Drawable drawable, int i, int i2, boolean z, boolean z2);

    InterfaceC1864030ybh LJJLJ();

    void LJJLJLI(C1388100mE4 c1388100mE4);

    View LJJLL(Context context, Aweme aweme, String str, String str2, String str3, AwS265S0300000_21 awS265S0300000_21);

    @InterfaceC1294060jmO
    void LJJZ(Context context, TakoEnterParams takoEnterParams, View view, List<? extends Aweme> list, boolean z, InterfaceC19396010uU interfaceC19396010uU, InterfaceC19395910uT interfaceC19395910uT);

    C14EH LJJZZI();

    void LJJZZIII(View view, Integer num);

    boolean LJL(Context context);

    Object LJLI(InterfaceC1364105Vn<? super String> interfaceC1364105Vn);

    C13IQ<? extends ReusedUIAssem<? extends C03H5>> LJLIIIL();

    boolean LJLIIL(Aweme aweme);

    void LJLIL(C14F9 c14f9);

    InterfaceC666720QDe LJLILLLLZI();

    C13IQ<? extends UiComposableAssem<C1214550hi9>> LJLJI();

    boolean LJLJJI();

    C06KX LJLJJL(InterfaceC665370Q7z interfaceC665370Q7z);

    ReusedUIAssem<? extends C03H5> LJLJJLL(C2189821An6 c2189821An6);

    void LJLJL(String str, String str2, Bundle bundle);

    void LJLJLJ(LifecycleOwner lifecycleOwner, C19EG c19eg, C2189821An6 c2189821An6);

    void LJLJLLL(C14F8 c14f8);

    C1166904hP LJLL();

    void LJLLI(Aweme aweme, String str, String str2);

    void LJLLILLLL(View view, Integer num);

    void LJLLJ(long j, String str);

    void LJLLL(Bundle bundle, String str);

    @InterfaceC1294060jmO
    void LJLLLL(Context context, String str, String str2, long j, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Long l, String str10, List<? extends Aweme> list, List<String> list2, List<SearchBingItem> list3, List<TakoImageItem> list4, List<ReferenceItemBridge> list5, Map<String, String> map, List<? extends Aweme> list6, TakoEventTracker takoEventTracker, TakoActionItem takoActionItem, boolean z, Aweme aweme, String str11, String str12, AIBotInfo aIBotInfo, String str13, String str14, SuggestionWordInfo suggestionWordInfo, String str15, TakoEntranceRequestInfo takoEntranceRequestInfo, String str16, String str17, String str18, String str19, String str20, String str21, String str22, Integer num, NimbleParams nimbleParams, C665120Q7a c665120Q7a, String str23);

    void LJLLLLLL();

    List<InterfaceC1859860yUy> LJLZ();

    Map<String, List<TakoKeyFramePoint>> LJZ(C19EG c19eg);

    void LJZI(Context context, String str, String str2, String str3, boolean z, String str4, String str5, String str6);
}
