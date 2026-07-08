package com.ss.android.ugc.aweme.live;

import X.AbstractC1538680q8w;
import X.AbstractC1608810ry3;
import X.C0CJP;
import X.C0CW1;
import X.C0J4W;
import X.C0J5C;
import X.C0J5O;
import X.C0J7X;
import X.C0J8Z;
import X.C0J9A;
import X.C0K77;
import X.C0PSA;
import X.C0QBB;
import X.C0TGX;
import X.C10E1;
import X.C1167730gUd;
import X.C11NZ;
import X.C1311670kEn;
import X.C13IQ;
import X.C145E;
import X.C1602280rnW;
import X.C19EG;
import X.C1ACD;
import X.C2175581ACm;
import X.EnumC1913520ztW;
import X.EnumC482480Iw2;
import X.EnumC752540TfY;
import X.InterfaceC1012330cRz;
import X.InterfaceC1101550elt;
import X.InterfaceC1120520fGU;
import X.InterfaceC1217040hmA;
import X.InterfaceC1233550iCn;
import X.InterfaceC1264870j1J;
import X.InterfaceC1363540laS;
import X.InterfaceC1488720oqM;
import X.InterfaceC1492160ovu;
import X.InterfaceC1564100qnw;
import X.InterfaceC1564370qoN;
import X.InterfaceC1572350r1F;
import X.InterfaceC1589460rSq;
import X.InterfaceC1596830rej;
import X.InterfaceC1601140rlg;
import X.InterfaceC1601520rmI;
import X.InterfaceC1602300rnY;
import X.InterfaceC1606880ruw;
import X.InterfaceC1654970tAV;
import X.InterfaceC1654980tAW;
import X.InterfaceC1655010tAZ;
import X.InterfaceC1655020tAa;
import X.InterfaceC1730620v8W;
import X.InterfaceC1733080vCU;
import X.InterfaceC20311214di;
import X.InterfaceC20313714e7;
import X.InterfaceC20314214eC;
import X.InterfaceC20315114eL;
import X.InterfaceC20318714ev;
import X.InterfaceC20320414fC;
import X.InterfaceC20673515v3;
import X.InterfaceC2175541ACi;
import X.InterfaceC2183451Acp;
import X.InterfaceC345370DgN;
import X.InterfaceC426680GoE;
import X.InterfaceC468170IXn;
import X.InterfaceC473370IhL;
import X.InterfaceC473820Ii4;
import X.InterfaceC486260J5c;
import X.InterfaceC486570J6h;
import X.InterfaceC486620J6m;
import X.InterfaceC487230J8v;
import X.InterfaceC493540JXc;
import X.InterfaceC519500KYy;
import X.InterfaceC594210NSh;
import X.InterfaceC712730RxX;
import X.InterfaceC713870RzN;
import X.InterfaceC713880RzO;
import X.InterfaceC756430Tlp;
import X.InterfaceC756790TmP;
import X.InterfaceC757210Tn5;
import X.InterfaceC759900TrQ;
import X.InterfaceC827870Wdl;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.android.livesdk.comp.api.performance.IPerformanceService;
import com.bytedance.android.livesdk.model.ItemTab;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.model.LivePreloadHighlightVideoModel;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.hybrid.spark.SparkContext;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.live.FeedStrategyPlatformFeatures;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStatesTag;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.inbox.IInboxLiveService;
import com.ss.android.ugc.aweme.liveevent.ILiveEventOuterService;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AwS651S0100000_2;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes32.dex */
public interface ILiveOuterService {
    void A3();

    InterfaceC712730RxX A4();

    void A5(Long l, InterfaceC759900TrQ interfaceC759900TrQ);

    void Ai();

    int B3(Aweme aweme);

    InterfaceC20318714ev B4();

    InterfaceC1233550iCn B5();

    C0K77 C3();

    C0J4W C4();

    String C5(String str);

    boolean D3();

    void D4(String str);

    String D5();

    void E3();

    InterfaceC1363540laS E4();

    boolean E5(Activity activity);

    boolean F3();

    InterfaceC1012330cRz F4();

    InterfaceC1589460rSq F5();

    boolean Fi();

    InterfaceC20320414fC G3();

    int G4();

    InterfaceC487230J8v G5();

    int H3(Aweme aweme);

    void H4(Map<String, List<LiveRoomStatesTag>> map);

    boolean H5();

    InterfaceC20313714e7 I3();

    void I4();

    void I5(String str);

    InterfaceC1655020tAa J3();

    InterfaceC713880RzO J4();

    void J5(int i, String str);

    InterfaceC757210Tn5 K3();

    C1ACD K4(C2175581ACm c2175581ACm);

    ILiveEventOuterService K5();

    ILiveBDXBridgeService L3();

    void L4(Map<String, Map<String, String>> map);

    int L5(Aweme aweme);

    String LIZ();

    void LIZIZ(String str);

    Object LIZJ(Object obj, String str);

    InterfaceC473370IhL LIZLLL();

    String LJ();

    boolean LLZZ();

    List<String> LLZZJLIL();

    void LLZZLLIL(int i, List<Long> list);

    Map<String, String> LLZZZIL();

    void LLZZZZ(Activity activity, int i, Uri uri);

    boolean M3();

    C10E1 M4();

    InterfaceC1733080vCU M5();

    void N3(Context context);

    boolean N4(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Long l, Integer num);

    void N5(boolean z);

    void Ng();

    InterfaceC1120520fGU O3();

    InterfaceC519500KYy O4(boolean z);

    C0QBB O5();

    InterfaceC1654980tAW P3();

    void P4(Context context, String str, ArrayList arrayList, String str2, String str3, ViewModelStoreOwner viewModelStoreOwner, AwS651S0100000_2 awS651S0100000_2);

    void P5(EnumC482480Iw2 enumC482480Iw2, Boolean bool);

    Map<String, Object> Pe();

    C0PSA Q3();

    boolean Q4();

    void Q5();

    void R3(Context context, Aweme aweme);

    void R4(List<Aweme> list);

    void R5(String str, String str2);

    IPerformanceService Rs();

    InterfaceC1601520rmI S3();

    void S4();

    DialogFragment S5(EnumC752540TfY enumC752540TfY);

    void T3();

    InterfaceC1217040hmA T4();

    void T5();

    AbstractC1608810ry3<? extends InterfaceC1606880ruw, ? extends InterfaceC426680GoE> U3();

    InterfaceC1596830rej U4();

    boolean U5();

    Bitmap V3(boolean z);

    InterfaceC827870Wdl V4();

    ILiveGeckoLoaderService V5();

    void W3(Context context, String str, Function1<SparkContext, Unit> function1);

    InterfaceC20315114eL W4();

    void W5();

    InterfaceC2183451Acp X3();

    DialogFragment X4(EnumC752540TfY enumC752540TfY);

    void X5();

    void Xm(List<ItemTab> list);

    void Y3(UrlModel urlModel, UrlModel urlModel2);

    void Y4();

    void Y5(Map<String, String> map);

    boolean Z3();

    void Z4();

    void Z5(String str, String str2);

    boolean a();

    String a4(Uri uri);

    boolean a5();

    int a6();

    void b(Fragment fragment, int i, Uri uri);

    void b4(ViewGroup viewGroup, C0TGX c0tgx);

    void b5(Context context, JSONObject jSONObject);

    String b6();

    void c4(long j, boolean z, boolean z2);

    InterfaceC1564370qoN c5();

    boolean c6();

    void d3(int i, JSONObject jSONObject);

    boolean d4();

    InterfaceC1654970tAV d5();

    InterfaceC473820Ii4 d6(String str, String str2);

    List<C1311670kEn> e3();

    InterfaceC20314214eC e4();

    void e5(Map<String, FeedStrategyPlatformFeatures> map);

    boolean e6();

    void ed(boolean z, boolean z2);

    void ef();

    InterfaceC1730620v8W f3();

    boolean f4();

    List<String> f5();

    InterfaceC493540JXc f6();

    void g3(Context context, String str);

    Object g4(String str, String str2, String str3);

    InterfaceC1602300rnY g5();

    String g6();

    C1ACD generateLivePlayHelper(InterfaceC2175541ACi interfaceC2175541ACi, EnumC1913520ztW enumC1913520ztW);

    C0CJP getLiveGlobalConfig();

    InterfaceC468170IXn getLivePreloadService();

    <T> T getService(Class<T> cls);

    ArrayList<InterfaceC345370DgN> getStorageList();

    void h3();

    InterfaceC486260J5c h4(C19EG c19eg, View view, String str, Integer num);

    boolean h5();

    boolean h6(String str);

    void hasLopBubbleForLog(int i);

    void hasLopEnterBubbleForLog(int i);

    JSONObject hj();

    void i3(C0CW1 c0cw1);

    InterfaceC486620J6m i4();

    boolean i5();

    InterfaceC1572350r1F i6();

    void isBroadcastSmoothGoLive();

    boolean isInitedLiveSDK();

    C0J8Z j3();

    String j4(LiveRoomStruct liveRoomStruct);

    void j5(C145E c145e);

    InterfaceC756790TmP j6();

    void jumpLiveSquareWithLogin(Context context, String str, String str2, InterfaceC20311214di interfaceC20311214di);

    C0J7X k3();

    InterfaceC20673515v3 k4();

    void k5(String str);

    IInboxLiveService k6();

    List<String> l3();

    boolean l4(Context context);

    void l5();

    void l6(long j, List list);

    boolean lj();

    boolean m3();

    boolean m4();

    InterfaceC594210NSh m5();

    void m6();

    boolean n3();

    InterfaceC1492160ovu n4();

    void n5(List<Long> list);

    int n6(Aweme aweme);

    InterfaceC756430Tlp o3();

    void o4();

    void o5();

    boolean o6();

    void onAppLogEvent(String str, JSONObject jSONObject, String str2);

    boolean p3();

    boolean p4();

    InterfaceC1601140rlg p5();

    void p6(Context context, boolean z, String str, boolean z2);

    void preloadLiveHighlightVideo(List<LivePreloadHighlightVideoModel> list);

    void preloadLiveLibrary();

    List<IMContact> q3();

    ILiveOuterService q4();

    boolean q5();

    String q6();

    void qj();

    InterfaceC486570J6h r3();

    void r4();

    void r5();

    void r6(Fragment fragment);

    boolean r8();

    void registerSubSparkPlugin(AbstractC1538680q8w abstractC1538680q8w);

    InterfaceC1564100qnw s3(C1602280rnW c1602280rnW);

    Boolean s4();

    void s5(String str, List list, C1167730gUd c1167730gUd);

    C0J5C s6(View view, C19EG c19eg);

    void showCppUnlockGuideDialogV2(String str, String str2, Boolean bool, FragmentManager fragmentManager);

    InterfaceC1655010tAZ startLiveManager();

    C13IQ<? extends UIContentAssem> t3();

    boolean t4();

    boolean t5();

    Room t6(LiveRoomStruct liveRoomStruct);

    List<String> u3();

    InterfaceC713870RzN u4();

    void u5(Long l, String str, String str2, String str3, String str4, Integer num);

    void u6(long j);

    void updateReferrerHostFromKeva(Context context);

    C0J9A v3();

    void v4(Context context, AFwS187S0000000_2 aFwS187S0000000_2, String str, Bundle bundle, C11NZ c11nz);

    void v5();

    void v6();

    boolean w3();

    InterfaceC1488720oqM w4();

    void w5();

    InterfaceC1101550elt w6();

    InterfaceC1264870j1J x3();

    void x4(TokenCert tokenCert);

    boolean x5(String str);

    boolean y3();

    void y4(C19EG c19eg, Map map);

    boolean y5();

    void z3(Context context);

    void z4(JSONObject jSONObject);

    C0J5O z5();
}
