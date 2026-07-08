package com.ss.android.ugc.aweme.live.spi.dummy;

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
import X.C13IQ;
import X.C145E;
import X.C1602280rnW;
import X.C1865590yeD;
import X.C1905640zgo;
import X.C19EG;
import X.C1ACD;
import X.C1ACQ;
import X.C20315614eQ;
import X.C2097608Jq;
import X.C2175581ACm;
import X.C480460Ism;
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
import Y.ARunnableS107S0100000_7;
import Y.ARunnableS2S1000000_4;
import Y.AfS140S0200000_4;
import Y.AfS27S0301000_7;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Message;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.LiveSurveyState;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.InteractServiceDummy;
import com.bytedance.android.livesdk.comp.api.performance.IPerformanceService;
import com.bytedance.android.livesdk.model.ItemTab;
import com.bytedance.android.livesdk.tunnel.BroadcastTunnelVM;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.SlimRoom;
import com.bytedance.android.livesdkapi.model.LivePreloadHighlightVideoModel;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.subscribe.subonlyvideo.SubOnlyVideoOpenParams;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.sheet.BaseSheet;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.LiveAwemeData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.cardinsert.CardInsertResultInfo;
import com.ss.android.ugc.aweme.feed.model.live.FeedStrategyPlatformFeatures;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStatesTag;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.NewLiveRoomStruct;
import com.ss.android.ugc.aweme.follow.presenter.FollowFeed;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.inbox.IInboxLiveService;
import com.ss.android.ugc.aweme.inbox.response.InboxLiveNotice;
import com.ss.android.ugc.aweme.live.ILiveBDXBridgeService;
import com.ss.android.ugc.aweme.live.ILiveGeckoLoaderService;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.notification.NotificationLiveStatus;
import com.ss.android.ugc.aweme.live.settings.LiveSDKSettingResponse;
import com.ss.android.ugc.aweme.live.settings.LiveSDKSettingResponseV2;
import com.ss.android.ugc.aweme.liveevent.ILiveEventOuterService;
import com.ss.android.ugc.aweme.profile.ListLiveCircleItemVM;
import com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel;
import com.ss.android.ugc.feed.platform.cardinsert.data.CardTypeRequest;
import com.ss.android.ugc.feed.platform.cardinsert.data.FeedCardInsertData;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.AwS651S0100000_2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import webcast.api.room.PreviewTimeReportResponse;
import webcast.api.sub.SubPriceChangeConfirmRequest;

/* JADX INFO: loaded from: classes32.dex */
public class LiveDummyOuterService implements ILiveOuterService {
    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void A3() {
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void Ai() {
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final int B3(Aweme aweme) {
        return -1;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC1233550iCn B5() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final String C5(String str) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final boolean D3() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void D4(String str) {
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final String D5() {
        return CardStruct.IStatusCode.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void E3() {
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final boolean E5(Activity activity) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final boolean F3() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC1012330cRz F4() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final boolean Fi() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final int G4() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final int H3(Aweme aweme) {
        return -1;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void H4(Map<String, List<LiveRoomStatesTag>> map) {
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final boolean H5() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void I4() {
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void I5(String str) {
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC1655020tAa J3() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC713880RzO J4() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void J5(int i, String str) {
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final ILiveBDXBridgeService L3() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void L4(Map<String, Map<String, String>> map) {
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final int L5(Aweme aweme) {
        return 45;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final String LIZ() {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void LIZIZ(String str) {
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final Object LIZJ(Object obj, String str) {
        return obj;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC473370IhL LIZLLL() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final String LJ() {
        return CardStruct.IStatusCode.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final boolean LLZZ() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final /* synthetic */ void LLZZLLIL(int i, List list) {
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void LLZZZZ(Activity activity, int i, Uri uri) {
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final boolean M3() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC1733080vCU M5() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void N3(Context context) {
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void N5(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void Ng() {
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void P4(Context context, String str, ArrayList arrayList, String str2, String str3, ViewModelStoreOwner viewModelStoreOwner, AwS651S0100000_2 awS651S0100000_2) {
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final boolean Q4() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void Q5() {
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void R3(Context context, Aweme aweme) {
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void R4(List<Aweme> list) {
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void R5(String str, String str2) {
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void S4() {
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void T3() {
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC1217040hmA T4() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void T5() {
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final AbstractC1608810ry3<? extends InterfaceC1606880ruw, ? extends InterfaceC426680GoE> U3() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final boolean U5() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final Bitmap V3(boolean z) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final ILiveGeckoLoaderService V5() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void W3(Context context, String str, Function1<? super SparkContext, Unit> function1) {
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void W5() {
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void X5() {
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void Xm(List<ItemTab> list) {
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void Y3(UrlModel urlModel, UrlModel urlModel2) {
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void Y4() {
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void Y5(Map<String, String> map) {
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final boolean Z3() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void Z4() {
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void Z5(String str, String str2) {
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final boolean a() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final String a4(Uri uri) {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final boolean a5() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final int a6() {
        return 30;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void b(Fragment fragment, int i, Uri uri) {
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void b4(ViewGroup viewGroup, C0TGX c0tgx) {
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void b5(Context context, JSONObject jSONObject) {
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final String b6() {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void c4(long j, boolean z, boolean z2) {
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final boolean c6() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void d3(int i, JSONObject jSONObject) {
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final boolean d4() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC473820Ii4 d6(String str, String str2) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void e5(Map<String, FeedStrategyPlatformFeatures> map) {
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final boolean e6() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void ed(boolean z, boolean z2) {
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void ef() {
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final boolean f4() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC493540JXc f6() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void g3(Context context, String str) {
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final Object g4(String str, String str2, String str3) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final String g6() {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final C0CJP getLiveGlobalConfig() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC468170IXn getLivePreloadService() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final ArrayList<InterfaceC345370DgN> getStorageList() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void h3() {
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final boolean h5() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final boolean h6(String str) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void hasLopBubbleForLog(int i) {
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void hasLopEnterBubbleForLog(int i) {
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final JSONObject hj() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void i3(C0CW1 c0cw1) {
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final boolean i5() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void isBroadcastSmoothGoLive() {
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final boolean isInitedLiveSDK() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final String j4(LiveRoomStruct liveRoomStruct) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void j5(C145E c145e) {
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void jumpLiveSquareWithLogin(Context context, String str, String str2, InterfaceC20311214di interfaceC20311214di) {
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void k5(String str) {
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final boolean l4(Context context) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void l5() {
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void l6(long j, List list) {
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final boolean lj() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final boolean m3() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final boolean m4() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void m6() {
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final boolean n3() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void n5(List<Long> list) {
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final int n6(Aweme aweme) {
        return 45;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void o4() {
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void o5() {
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final boolean o6() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void onAppLogEvent(String str, JSONObject jSONObject, String str2) {
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final boolean p3() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final boolean p4() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void p6(Context context, boolean z, String str, boolean z2) {
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void preloadLiveHighlightVideo(List<LivePreloadHighlightVideoModel> list) {
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void preloadLiveLibrary() {
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final ILiveOuterService q4() {
        return this;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final boolean q5() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final String q6() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void qj() {
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void r4() {
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void r5() {
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final /* synthetic */ void r6(Fragment fragment) {
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final boolean r8() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void registerSubSparkPlugin(AbstractC1538680q8w abstractC1538680q8w) {
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void s5(String str, List list, C1167730gUd c1167730gUd) {
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final C0J5C s6(View view, C19EG c19eg) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void showCppUnlockGuideDialogV2(String str, String str2, Boolean bool, FragmentManager fragmentManager) {
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final C13IQ<? extends UIContentAssem> t3() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final boolean t4() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final boolean t5() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final Room t6(LiveRoomStruct liveRoomStruct) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC713870RzN u4() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void u6(long j) {
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void updateReferrerHostFromKeva(Context context) {
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void v4(Context context, AFwS187S0000000_2 aFwS187S0000000_2, String str, Bundle bundle, C11NZ c11nz) {
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void v5() {
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void v6() {
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final boolean w3() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void w5() {
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC1101550elt w6() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void x4(TokenCert tokenCert) {
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final boolean x5(String str) {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final boolean y3() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void y4(C19EG c19eg, Map map) {
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final boolean y5() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void z3(Context context) {
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void z4(JSONObject jSONObject) {
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC712730RxX A4() {
        return new InterfaceC712730RxX() { // from class: X.14eK
            @Override // X.InterfaceC712730RxX
            public final Object LIZJ(InterfaceC691450RAh interfaceC691450RAh) {
                return null;
            }

            @Override // X.InterfaceC712730RxX
            public final C0TRR LIZ() {
                return new C0TRR() { // from class: X.14eo
                    @Override // X.C0TRR
                    public final int LIZIZ() {
                        return 0;
                    }

                    @Override // X.C0TRR
                    public final List<CardTypeRequest> LIZJ(C0TRR c0trr, FeedCardInsertData feedCardInsertData, List<CardInsertResultInfo> list) {
                        return null;
                    }
                };
            }

            @Override // X.InterfaceC712730RxX
            public final View LIZIZ(Context context) {
                return new View(context);
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC20318714ev B4() {
        return new InterfaceC20318714ev() { // from class: X.14es
            @Override // X.InterfaceC20318714ev
            public final Object LIZJ(Object obj, String str) {
                return obj;
            }

            @Override // X.InterfaceC20318714ev
            public final boolean LIZLLL(double d, String str) {
                return false;
            }

            @Override // X.InterfaceC20318714ev
            public final void LJ(LiveSDKSettingResponseV2 liveSDKSettingResponseV2, ARunnableS2S1000000_4 aRunnableS2S1000000_4) {
            }

            @Override // X.InterfaceC20318714ev
            public final boolean LJFF(double d, String str) {
                return false;
            }

            @Override // X.InterfaceC20318714ev
            public final boolean LJII() {
                return true;
            }

            @Override // X.InterfaceC20318714ev
            public final boolean LJIIIIZZ() {
                return false;
            }

            @Override // X.InterfaceC20318714ev
            public final void LJIIJ(LiveSDKSettingResponse liveSDKSettingResponse) {
            }

            @Override // X.InterfaceC20318714ev
            public final boolean LJIIJJI() {
                return false;
            }

            @Override // X.InterfaceC20318714ev
            public final void LJIIL() {
            }

            @Override // X.InterfaceC20318714ev
            public final boolean LJIILIIL(String str) {
                return false;
            }

            @Override // X.InterfaceC20318714ev
            public final C0CPK LJI() {
                return new C0CPK() { // from class: X.14et
                    @Override // X.C0CPK
                    public final void LIZ(Context context) {
                    }

                    @Override // X.C0CPK
                    public final void LIZIZ(Context context, C0CPQ c0cpq) {
                    }

                    @Override // X.C0CPK
                    public final void LIZJ(String str) {
                    }
                };
            }

            @Override // X.InterfaceC20318714ev
            public final C0J97 LJIIIZ() {
                return new C0J97(0, 0);
            }

            @Override // X.InterfaceC20318714ev
            public final InterfaceC313350CQb LIZIZ() {
                return new InterfaceC313350CQb() { // from class: X.14eu
                    @Override // X.InterfaceC313350CQb
                    public final void LIZ(boolean z) {
                    }
                };
            }

            @Override // X.InterfaceC20318714ev
            public final Map<String, Object> LIZ(List<String> list) {
                return new HashMap();
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final C0K77 C3() {
        return new C0K77() { // from class: X.0K78
            @Override // X.C0K77
            public final boolean LIZ() {
                return false;
            }

            @Override // X.C0K77
            public final void LIZIZ(int i, String str, HashMap<String, Object> map) {
            }

            @Override // X.C0K77
            public final C13IQ<? extends AbstractC738140SxQ> LIZJ() {
                return null;
            }

            @Override // X.C0K77
            public final void LIZLLL(HashMap<String, Object> map) {
            }

            @Override // X.C0K77
            public final void LJ() {
            }

            @Override // X.C0K77
            public final boolean LJFF(C19EG c19eg, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, C0K75 c0k75) {
                return false;
            }

            @Override // X.C0K77
            public final void LJI(View view, List list, User user, Function0 function0, Function1 function1, boolean z) {
            }

            @Override // X.C0K77
            public final boolean LJII(JSONObject jSONObject) {
                return false;
            }

            @Override // X.C0K77
            public final String LJIIIIZZ(String str) {
                return null;
            }

            @Override // X.C0K77
            public final boolean LJIIIZ(Context context, String str, boolean z, Integer num) {
                return false;
            }

            @Override // X.C0K77
            public final boolean LJIIJJI() {
                return false;
            }

            @Override // X.C0K77
            public final void LJIIL(AFwS193S0000000_7 aFwS193S0000000_7) {
            }

            @Override // X.C0K77
            public final void LJIILIIL(Context context, String str, long j, String str2) {
            }

            @Override // X.C0K77
            public final boolean LJIILL(Aweme aweme) {
                return false;
            }

            @Override // X.C0K77
            public final void LJIILLIIL(int i, View view) {
            }

            @Override // X.C0K77
            public final void LJIIZILJ(String str) {
            }

            @Override // X.C0K77
            public final String LJIJ(Integer num) {
                return null;
            }

            @Override // X.C0K77
            public final View LJIJI(Context context, AttributeSet attributeSet, int i) {
                return null;
            }

            @Override // X.C0K77
            public final boolean LJIJJ(Aweme aweme) {
                return false;
            }

            @Override // X.C0K77
            public final void LJIJJLI(HashMap<String, Object> map) {
            }

            @Override // X.C0K77
            public final boolean LJIL(Aweme aweme) {
                return false;
            }

            @Override // X.C0K77
            public final boolean LJJ() {
                return false;
            }

            @Override // X.C0K77
            public final boolean LJJI(com.ss.android.ugc.aweme.profile.model.User user) {
                return false;
            }

            @Override // X.C0K77
            public final void LJJIFFI(AFwS193S0000000_7 aFwS193S0000000_7) {
            }

            @Override // X.C0K77
            public final void LJJII(C512220K6y c512220K6y) {
            }

            @Override // X.C0K77
            public final void LJJIII(View view, Boolean bool) {
            }

            @Override // X.C0K77
            public final void LJJIIJ(int i, long j, String str, String str2) {
            }

            @Override // X.C0K77
            public final Drawable LJJIIJZLJL(String str) {
                return null;
            }

            @Override // X.C0K77
            public final String LJJIIZ(String str, byte[] bArr) {
                return null;
            }

            @Override // X.C0K77
            public final boolean LJJIIZI(Aweme aweme) {
                return false;
            }

            @Override // X.C0K77
            public final void LJJIJ(long j) {
            }

            @Override // X.C0K77
            public final void LJJIJIIJI(Object obj, InterfaceC1631630sYr<? super String, ? super String, ? super Boolean, ? super Map<String, String>, Unit> interfaceC1631630sYr) {
            }

            @Override // X.C0K77
            public final boolean LJJIJIIJIL(Aweme aweme) {
                return false;
            }

            @Override // X.C0K77
            public final void LJJIJIL(LifecycleOwner lifecycleOwner, Function0<Unit> function0) {
            }

            @Override // X.C0K77
            public final void LJJIJL(Object obj) {
            }

            @Override // X.C0K77
            public final boolean LJJIL(View view, String str, String str2, ImageView.ScaleType scaleType, InterfaceC511480K4c interfaceC511480K4c) {
                return false;
            }

            @Override // X.C0K77
            public final void LJJJ(LifecycleOwner lifecycleOwner) {
            }

            @Override // X.C0K77
            public final boolean LJJJI(String str) {
                return false;
            }

            @Override // X.C0K77
            public final void LJJJIL(View view) {
            }

            @Override // X.C0K77
            public final boolean LJJJJ(View view, String str, InterfaceC511480K4c interfaceC511480K4c, boolean z) {
                return false;
            }

            @Override // X.C0K77
            public final String LJJJJI() {
                return "tiktok_live_basic_resource";
            }

            @Override // X.C0K77
            public final long LJJJJIZL(View view, String str, String str2, boolean z, boolean z2, int i, Function1<? super Animatable, Unit> function1) {
                return 0L;
            }

            @Override // X.C0K77
            public final boolean LJJJJJ(View view, Object obj, List list, Integer num, Integer num2, ImageView.ScaleType scaleType, Boolean bool, Boolean bool2, Float f, boolean z, C0K42 c0k42) {
                return false;
            }

            @Override // X.C0K77
            public final Fragment LJJJJJL(Context context, boolean z, String str, String str2, String str3, String str4, String str5, String str6, String str7, Function0<Unit> function0, Function0<Unit> function02, SubPriceChangeConfirmRequest subPriceChangeConfirmRequest, String str8) {
                return null;
            }

            @Override // X.C0K77
            public final void LJJJJL(String str) {
            }

            @Override // X.C0K77
            public final boolean LJJJJLI(Aweme aweme) {
                return false;
            }

            @Override // X.C0K77
            public final boolean LJJJJLL(Aweme aweme) {
                return false;
            }

            @Override // X.C0K77
            public final String LJJJJZ(String str) {
                return null;
            }

            @Override // X.C0K77
            public final boolean LJJJJZI(Aweme aweme) {
                return false;
            }

            @Override // X.C0K77
            public final boolean Xs() {
                return false;
            }

            @Override // X.C0K77
            public final boolean ch(Fragment fragment, String str) {
                return false;
            }

            @Override // X.C0K77
            public final String getWebcastLanguage() {
                return "en";
            }

            @Override // X.C0K77
            public final AnonymousClass0951 LJIIJ() {
                return C09IC.LIZIZ(C1BNE.LIZ(C08CX.INSTANCE));
            }

            @Override // X.C0K77
            public final MutableLiveData LJIILJJIL() {
                return new MutableLiveData(C13BV.INSTANCE);
            }

            @Override // X.C0K77
            public final String LJJIJLIJ(String str, String str2) {
                if (str2.length() > 0) {
                    return str2;
                }
                return str;
            }

            @Override // X.C0K77
            public final Fragment LJJIZ(boolean z, long j, String str, Boolean bool, AFwS237S0000000_7 aFwS237S0000000_7, SubOnlyVideoOpenParams subOnlyVideoOpenParams, Function0 function0) {
                return new Fragment();
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final C0J4W C4() {
        return new C0J4W() { // from class: X.14dy
            @Override // X.C0J4W
            public final boolean LIZ() {
                return false;
            }

            @Override // X.C0J4W
            public final boolean LIZIZ() {
                return false;
            }

            @Override // X.C0J4W
            public final boolean LIZJ() {
                return false;
            }

            @Override // X.C0J4W
            public final boolean LIZLLL() {
                return false;
            }

            @Override // X.C0J4W
            public final boolean enable() {
                return false;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC1363540laS E4() {
        return new InterfaceC1363540laS() { // from class: X.0y2Q
            @Override // X.InterfaceC1363540laS
            public final void LIZ(long j, InterfaceC1842140y2O interfaceC1842140y2O, Map map) {
            }

            @Override // X.InterfaceC1363540laS
            public final int LIZIZ() {
                return 0;
            }

            @Override // X.InterfaceC1363540laS
            public final boolean LIZJ() {
                return false;
            }

            @Override // X.InterfaceC1363540laS
            public final int LIZLLL() {
                return 0;
            }

            @Override // X.InterfaceC1363540laS
            public final void LJ() {
            }

            @Override // X.InterfaceC1363540laS
            public final int LJFF() {
                return 0;
            }

            @Override // X.InterfaceC1363540laS
            public final void LJI(FragmentManager fragmentManager, long j, Map<String, String> map, InterfaceC1842140y2O interfaceC1842140y2O, Function0<Unit> function0) {
            }

            @Override // X.InterfaceC1363540laS
            public final void LJII(long j, InterfaceC1842140y2O interfaceC1842140y2O, String str, Map map) {
            }

            @Override // X.InterfaceC1363540laS
            public final int LJIIIIZZ(String str) {
                return 0;
            }

            @Override // X.InterfaceC1363540laS
            public final boolean LJIIIZ() {
                return false;
            }

            @Override // X.InterfaceC1363540laS
            public final boolean LJIIJ() {
                return false;
            }

            @Override // X.InterfaceC1363540laS
            public final void LJIIJJI(long j, InterfaceC1842140y2O interfaceC1842140y2O, Map map) {
            }

            @Override // X.InterfaceC1363540laS
            public final boolean containEmoji(String str) {
                return false;
            }

            @Override // X.InterfaceC1363540laS
            public final int getRepostIconRes() {
                return 0;
            }

            @Override // X.InterfaceC1363540laS
            public final boolean onlyEmoji(String str) {
                return false;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC1589460rSq F5() {
        return new InterfaceC1589460rSq() { // from class: X.14ds
            @Override // X.InterfaceC1589460rSq
            public final void LIZ() {
            }

            @Override // X.InterfaceC1589460rSq
            public final void LIZIZ(String str) {
            }

            @Override // X.InterfaceC1589460rSq
            public final void LIZJ(int i, Aweme aweme, String str) {
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC20320414fC G3() {
        return new InterfaceC20320414fC() { // from class: X.14eD
            @Override // X.InterfaceC20320414fC
            public final C11NZ<String> LIZ(JSONObject jSONObject) {
                return null;
            }

            @Override // X.InterfaceC20320414fC
            public final boolean LIZIZ() {
                return false;
            }

            @Override // X.InterfaceC20320414fC
            public final void LIZJ(LifecycleRegistry lifecycleRegistry, Context context, Map map) {
            }

            @Override // X.InterfaceC20320414fC
            public final int LIZLLL() {
                return 0;
            }

            @Override // X.InterfaceC20320414fC
            public final Object LJ() {
                return null;
            }

            @Override // X.InterfaceC20320414fC
            public final boolean LJFF(String str) {
                return true;
            }

            @Override // X.InterfaceC20320414fC
            public final void LJI(Context context, String str, Map map) {
            }

            @Override // X.InterfaceC20320414fC
            public final boolean LJII() {
                return false;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC487230J8v G5() {
        return new InterfaceC487230J8v() { // from class: X.14e3
            @Override // X.InterfaceC487230J8v
            public final void LIZ() {
            }

            @Override // X.InterfaceC487230J8v
            public final void LIZIZ(String str) {
            }

            @Override // X.InterfaceC487230J8v
            public final void LIZJ(String str, String str2) {
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC20313714e7 I3() {
        return new InterfaceC20313714e7() { // from class: X.14du
            @Override // X.InterfaceC20313714e7
            public final void LIZ(EnumC495860JcW enumC495860JcW, C20313914e9 c20313914e9) {
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC757210Tn5 K3() {
        return new InterfaceC757210Tn5() { // from class: X.14dp
            @Override // X.InterfaceC757210Tn5
            public final BroadcastTunnelVM LIZIZ(Context context) {
                return null;
            }

            @Override // X.InterfaceC757210Tn5
            public final BroadcastTunnelVM LIZ(C19EG c19eg) {
                return new BroadcastTunnelVM();
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final ILiveEventOuterService K5() {
        return new ILiveEventOuterService() { // from class: X.0inC
            @Override // com.ss.android.ugc.aweme.liveevent.ILiveEventOuterService
            public final Bitmap createTopBottomGradientBitmap(int i, int i2) {
                return null;
            }

            @Override // com.ss.android.ugc.aweme.liveevent.ILiveEventOuterService
            public final boolean enableAnchorPeriodicLiveEvent() {
                return false;
            }

            @Override // com.ss.android.ugc.aweme.liveevent.ILiveEventOuterService
            public final boolean enableCreateLiveEventInGroupChat() {
                return false;
            }

            @Override // com.ss.android.ugc.aweme.liveevent.ILiveEventOuterService
            public final boolean getAnchorManagerABConfigIfFullRollout() {
                return false;
            }

            @Override // com.ss.android.ugc.aweme.liveevent.ILiveEventOuterService
            public final boolean getAnchorManagerABConfigWithSubParam(String str) {
                return false;
            }

            @Override // com.ss.android.ugc.aweme.liveevent.ILiveEventOuterService
            public final String getLiveEventCreateSchema() {
                return "";
            }

            @Override // com.ss.android.ugc.aweme.liveevent.ILiveEventOuterService
            public final String getLiveEventListSchema() {
                return "";
            }

            @Override // com.ss.android.ugc.aweme.liveevent.ILiveEventOuterService
            public final /* bridge */ /* synthetic */ String getLiveEventSchemaInGroupChat() {
                return null;
            }

            @Override // com.ss.android.ugc.aweme.liveevent.ILiveEventOuterService
            public final boolean getLiveEventShieldConfirmValue() {
                return false;
            }

            @Override // com.ss.android.ugc.aweme.liveevent.ILiveEventOuterService
            public final boolean getLiveEventSimplifyCreateEnable() {
                return false;
            }

            @Override // com.ss.android.ugc.aweme.liveevent.ILiveEventOuterService
            public final void getLiveEventUser(Context context, long j, LifecycleOwner lifecycleOwner, Function1<? super Pair<? extends List<Long>, ? extends List<String>>, Unit> function1, Function0<Unit> function0) {
            }

            @Override // com.ss.android.ugc.aweme.liveevent.ILiveEventOuterService
            public final boolean getPublishPageCreationEnable() {
                return false;
            }

            @Override // com.ss.android.ugc.aweme.liveevent.ILiveEventOuterService
            public final Object getStoryStickerBgColor(ImageModel imageModel, InterfaceC1364105Vn<? super Pair<Integer, Integer>> interfaceC1364105Vn) {
                return null;
            }

            @Override // com.ss.android.ugc.aweme.liveevent.ILiveEventOuterService
            public final void inviteLiveEventUser(Context context, long j, List<Long> list, LifecycleOwner lifecycleOwner, Function0<Unit> function0, Function0<Unit> function02) {
            }

            @Override // com.ss.android.ugc.aweme.liveevent.ILiveEventOuterService
            public final void openLiveEventBgMaskSparkContainer(Context context, String str, String str2) {
            }

            @Override // com.ss.android.ugc.aweme.liveevent.ILiveEventOuterService
            public final void openLiveEventSparkContainer(Context context, String str, String str2) {
            }

            @Override // com.ss.android.ugc.aweme.liveevent.ILiveEventOuterService
            public final void reportLinkMicRelatedEvent(String str, Map<String, String> map) {
            }

            @Override // com.ss.android.ugc.aweme.liveevent.ILiveEventOuterService
            public final C11NZ<C470590Icr<PreviewTimeReportResponse.ResponseData>> reportPaidEventPreviewTime(long j, long j2) {
                return null;
            }

            @Override // com.ss.android.ugc.aweme.liveevent.ILiveEventOuterService
            public final void setLiveEventShieldConfirmValue(boolean z) {
            }

            @Override // com.ss.android.ugc.aweme.liveevent.ILiveEventOuterService
            public final void showLiveEventSelectionDialog(Context context, String str, boolean z, float f, int i, Function2<? super BaseSheet, ? super Integer, Unit> function2, Function2<? super BaseSheet, ? super Integer, Unit> function22, Function2<? super BaseSheet, ? super Integer, Unit> function23, Function1<? super BaseSheet, Unit> function1) {
            }

            @Override // com.ss.android.ugc.aweme.liveevent.ILiveEventOuterService
            public final void startStoryEditFromLiveEvent(Context context, String str, String str2, Number number, String str3) {
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final C10E1 M4() {
        return new C10E1() { // from class: X.10E8
            @Override // X.C10E1
            public final void LIZ(boolean z) {
            }

            @Override // X.C10E1
            public final void LIZIZ(Context context, com.ss.android.ugc.aweme.profile.model.User user) {
            }

            @Override // X.C10E1
            public final boolean LIZJ() {
                return false;
            }

            @Override // X.C10E1
            public final void LIZLLL(Context context) {
            }

            @Override // X.C10E1
            public final C11NZ LJ(int i, String str) {
                return null;
            }

            @Override // X.C10E1
            public final void LJFF(Context context) {
            }

            @Override // X.C10E1
            public final void LJI(Context context) {
            }

            @Override // X.C10E1
            public final void LJII(boolean z) {
            }

            @Override // X.C10E1
            public final void LJIIIIZZ(Context context, com.ss.android.ugc.aweme.profile.model.User user) {
            }

            @Override // X.C10E1
            public final boolean LJIIIZ() {
                return false;
            }

            @Override // X.C10E1
            public final void LJIIJ(Context context) {
            }

            @Override // X.C10E1
            public final C11NZ<C1641660sp2<NotificationLiveStatus>> LJIIJJI(String str) {
                return null;
            }

            @Override // X.C10E1
            public final boolean LJIIL() {
                return false;
            }

            @Override // X.C10E1
            public final boolean LJIILIIL() {
                return false;
            }

            @Override // X.C10E1
            public final void LJIILJJIL(String str) {
            }

            @Override // X.C10E1
            public final void LJIILL(C10ET c10et) {
            }

            @Override // X.C10E1
            public final void LJIILLIIL(boolean z) {
            }

            @Override // X.C10E1
            public final boolean getPushLiveState() {
                return false;
            }

            @Override // X.C10E1
            public final void hideNotificationTipDialog(Context context) {
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC1120520fGU O3() {
        return new InterfaceC1120520fGU() { // from class: X.0f9A
            @Override // X.InterfaceC1120520fGU
            public final boolean Iq() {
                return false;
            }

            @Override // X.InterfaceC1120520fGU
            public final void LIZ(EnumC1115870f8z enumC1115870f8z, C21211417zc c21211417zc) {
            }

            @Override // X.InterfaceC1120520fGU
            public final boolean Ot() {
                return false;
            }

            @Override // X.InterfaceC1120520fGU
            public final EnumC1115870f8z hc() {
                return null;
            }

            @Override // X.InterfaceC1120520fGU
            public final boolean isAvailable() {
                return false;
            }

            @Override // X.InterfaceC1120520fGU
            public final C1115970f99 t5(EnumC1115870f8z enumC1115870f8z, C1115940f96 c1115940f96, long j) {
                return new C1115970f99(false, null);
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final C0QBB O5() {
        return new C0QBB() { // from class: X.0ydh
            @Override // X.C0QBB
            public final boolean LIZ(String str) {
                return false;
            }

            @Override // X.C0QBB
            public final boolean LIZIZ(Context context, Uri uri, Bundle bundle) {
                return false;
            }

            @Override // X.C0QBB
            public final String LIZJ(Context context, String str) {
                return "";
            }

            @Override // X.C0QBB
            public final Boolean LIZLLL(Context context, String str) {
                return Boolean.FALSE;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC1654980tAW P3() {
        return new InterfaceC1654980tAW() { // from class: X.0UpB
            @Override // X.InterfaceC1654980tAW
            public final boolean LIZ() {
                return false;
            }

            @Override // X.InterfaceC1654980tAW
            public final void LIZIZ() {
            }

            @Override // X.InterfaceC1654980tAW
            public final void LIZJ(boolean z) {
            }

            @Override // X.InterfaceC1654980tAW
            public final boolean LIZLLL() {
                return false;
            }

            @Override // X.InterfaceC1654980tAW
            public final String LJ(String str) {
                return "";
            }

            @Override // X.InterfaceC1654980tAW
            public final void LJFF() {
            }

            @Override // X.InterfaceC1654980tAW
            public final boolean LJI() {
                return false;
            }

            @Override // X.InterfaceC1654980tAW
            public final void LJII(boolean z) {
            }

            @Override // X.InterfaceC1654980tAW
            public final void LJIIIIZZ() {
            }

            @Override // X.InterfaceC1654980tAW
            public final boolean LJIIIZ() {
                return false;
            }

            @Override // X.InterfaceC1654980tAW
            public final void LJIIJ() {
            }

            @Override // X.InterfaceC1654980tAW
            public final void LJIIJJI(String str, boolean z, C783970Up9 c783970Up9) {
            }

            @Override // X.InterfaceC1654980tAW
            public final void LJIIL() {
            }

            @Override // X.InterfaceC1654980tAW
            public final void LJIILIIL(InterfaceC472150IfN interfaceC472150IfN, String str, String str2, Map<String, String> map) {
            }

            @Override // X.InterfaceC1654980tAW
            public final <T> T getService(Class<T> cls) {
                return null;
            }

            @Override // X.InterfaceC1654980tAW
            public final boolean hasLivePermission() {
                return false;
            }

            @Override // X.InterfaceC1654980tAW
            public final void preloadLiveTabLegacy(Context context) {
            }

            @Override // X.InterfaceC1654980tAW
            public final void updateLiveSourceParams(String str) {
            }

            @Override // X.InterfaceC1654980tAW
            public final Map<String, String> getLopLogParams() {
                return new LinkedHashMap();
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final C0PSA Q3() {
        return new C0PSA() { // from class: X.14do
            @Override // X.C0PSA
            public final void LIZ() {
            }

            @Override // X.C0PSA
            public final void LIZIZ(String str, String str2, String str3, String str4, String str5, boolean z) {
            }

            @Override // X.C0PSA
            public final void LIZJ() {
            }

            @Override // X.C0PSA
            public final void LIZLLL(int i, String str) {
            }

            @Override // X.C0PSA
            public final Fragment LJ() {
                return null;
            }

            @Override // X.C0PSA
            public final void LJFF() {
            }

            @Override // X.C0PSA
            public final void LJI(int i, String str) {
            }

            @Override // X.C0PSA
            public final boolean LJII(int i, String str, String str2, boolean z, boolean z2, boolean z3) {
                return true;
            }

            @Override // X.C0PSA
            public final View LJIIIIZZ(Context context, Fragment fragment, ViewGroup viewGroup, AwS589S0100000_10 awS589S0100000_10) {
                return null;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final IPerformanceService Rs() {
        return (IPerformanceService) Proxy.newProxyInstance(IPerformanceService.class.getClassLoader(), new Class[]{IPerformanceService.class}, new InvocationHandler() { // from class: X.0Wel
            public static final /* synthetic */ int LL = 0;

            @Override // java.lang.reflect.InvocationHandler
            public final Object invoke(Object obj, Method method, Object[] objArr) {
                Class<?> returnType = method.getReturnType();
                if (returnType.isAssignableFrom(Void.class) || Intrinsics.LJFF(returnType.getName(), "void")) {
                    return null;
                }
                Class<?> cls = Integer.TYPE;
                if (!returnType.isAssignableFrom(cls) && !returnType.isAssignableFrom(cls)) {
                    if (!returnType.isAssignableFrom(Boolean.class) && !Intrinsics.LJFF(returnType.getName(), "java.lang.Boolean") && !returnType.isAssignableFrom(Boolean.TYPE)) {
                        if (!returnType.isAssignableFrom(String.class) && !Intrinsics.LJFF(returnType.getName(), "java.lang.String")) {
                            Class<?> cls2 = Float.TYPE;
                            if (!returnType.isAssignableFrom(cls2) && !returnType.isAssignableFrom(cls2) && !Intrinsics.LJFF(returnType.getName(), "java.lang.Float")) {
                                Class<?> cls3 = Long.TYPE;
                                if (!returnType.isAssignableFrom(cls3) && !returnType.isAssignableFrom(cls3) && !Intrinsics.LJFF(returnType.getName(), "java.lang.Long")) {
                                    if (!returnType.isInterface()) {
                                        return null;
                                    }
                                    return Proxy.newProxyInstance(returnType.getClassLoader(), new Class[]{returnType}, this);
                                }
                                return 0L;
                            }
                            return Float.valueOf(0.0f);
                        }
                        return "";
                    }
                    return Boolean.FALSE;
                }
                return 0;
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC1601520rmI S3() {
        return new InterfaceC1601520rmI() { // from class: X.0J8M
            @Override // X.InterfaceC1601520rmI
            public final void LIZ(boolean z) {
            }

            @Override // X.InterfaceC1601520rmI
            public final void LIZIZ(C0J8D c0j8d) {
            }

            @Override // X.InterfaceC1601520rmI
            public final void LIZJ(List list) {
            }

            @Override // X.InterfaceC1601520rmI
            public final void LIZLLL(int i, List<? extends Aweme> list) {
            }

            @Override // X.InterfaceC1601520rmI
            public final void LJ(Set<String> set) {
            }

            @Override // X.InterfaceC1601520rmI
            public final void LJFF(boolean z, boolean z2, boolean z3) {
            }

            @Override // X.InterfaceC1601520rmI
            public final Aweme LJI() {
                return null;
            }

            @Override // X.InterfaceC1601520rmI
            public final void LJII(boolean z) {
            }

            @Override // X.InterfaceC1601520rmI
            public final boolean LJIIIIZZ() {
                return false;
            }

            @Override // X.InterfaceC1601520rmI
            public final void LJIIIZ(C1601490rmF c1601490rmF) {
            }

            @Override // X.InterfaceC1601520rmI
            public final void LJIIJ() {
            }

            @Override // X.InterfaceC1601520rmI
            public final void LJIIJJI(long j, List list) {
            }

            @Override // X.InterfaceC1601520rmI
            public final C11NZ<Object> LJIILIIL(String str) {
                return null;
            }

            @Override // X.InterfaceC1601520rmI
            public final void LJIILJJIL(Message message) {
            }

            @Override // X.InterfaceC1601520rmI
            public final void remove(String str) {
            }

            @Override // X.InterfaceC1601520rmI
            public final C11NZ LJIIL(int i, String str, String str2, Map map) {
                return C11NZ.LJIJJLI(new InterfaceC1478005qU() { // from class: X.087X
                    @Override // X.InterfaceC1478005qU
                    public final void subscribe(C09AJ<LiveAwemeData> c09aj) {
                        C1C7U.LIZ("LiveDummyOuterService@548.getLivePreviewService$1$requestHotUpdate$1");
                        C1C7U.LIZIZ("LiveDummyOuterService@548.getLivePreviewService$1$requestHotUpdate$1");
                    }
                });
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC20315114eL W4() {
        return new InterfaceC20315114eL() { // from class: X.14dw
            @Override // X.InterfaceC20315114eL
            public final InterfaceC1590960rVG LIZ() {
                return null;
            }

            @Override // X.InterfaceC20315114eL
            public final void LIZIZ(C1602200rnO c1602200rnO, C1602200rnO c1602200rnO2) {
            }

            @Override // X.InterfaceC20315114eL
            public final void LIZJ(byte[] bArr) {
            }

            @Override // X.InterfaceC20315114eL
            public final void LIZLLL(boolean z) {
            }

            @Override // X.InterfaceC20315114eL
            public final boolean LJ() {
                return false;
            }

            @Override // X.InterfaceC20315114eL
            public final void onBootFinish() {
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC2183451Acp X3() {
        return new InteractServiceDummy();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC1564370qoN c5() {
        return new InterfaceC1564370qoN() { // from class: X.14dx
            @Override // X.InterfaceC1564370qoN
            public final void init() {
            }

            @Override // X.InterfaceC1564370qoN
            public final void release() {
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC1654970tAV d5() {
        return new InterfaceC1654970tAV() { // from class: X.0tAd
            @Override // X.InterfaceC1654970tAV
            public final void LIZIZ() {
            }

            @Override // X.InterfaceC1654970tAV
            public final /* synthetic */ void LLLLJ(UUID uuid, C2185991Agv c2185991Agv) {
            }

            @Override // X.InterfaceC1654970tAV
            public final void LLLLJI(Context context, IRecordingOperationPanel iRecordingOperationPanel, FrameLayout frameLayout, C19A3 c19a3, C1DRG c1drg) {
            }

            @Override // X.InterfaceC1654970tAV
            public final void LLLLL(C1655040tAc c1655040tAc) {
            }

            @Override // X.InterfaceC1654970tAV
            public final void LLLLLIL(View... viewArr) {
            }

            @Override // X.InterfaceC1654970tAV
            public final void LLLLLILLIL(C1655000tAY c1655000tAY) {
            }

            @Override // X.InterfaceC1654970tAV
            public final void LLLLLJIL() {
            }

            @Override // X.InterfaceC1654970tAV
            public final /* synthetic */ int[] LLLLLJLJLL(int[] iArr) {
                return null;
            }

            @Override // X.InterfaceC1654970tAV
            public final void LLLLLL() {
            }

            @Override // X.InterfaceC1654970tAV
            public final void LLLLLLIL(Bundle bundle, ViewGroup viewGroup) {
            }

            @Override // X.InterfaceC1654970tAV
            public final View LLLLLLJ() {
                return null;
            }

            @Override // X.InterfaceC1654970tAV
            public final void LLLLLLL(ViewGroup viewGroup) {
            }

            @Override // X.InterfaceC1654970tAV
            public final /* synthetic */ C2185991Agv LLLLLLLLL(int[] iArr) {
                return null;
            }

            @Override // X.InterfaceC1654970tAV
            public final boolean LLLLLLLLLL(Context context) {
                return false;
            }

            @Override // X.InterfaceC1654970tAV
            public final boolean a() {
                return false;
            }

            @Override // X.InterfaceC1654970tAV
            public final void againHandlerBundle(JSONObject jSONObject) {
            }

            @Override // X.InterfaceC1654970tAV
            public final void notifyCloseAllLynxDialog() {
            }

            @Override // X.InterfaceC1654970tAV
            public final boolean onBackPressed() {
                return false;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final List e3() {
        return new ArrayList();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC20314214eC e4() {
        return new InterfaceC20314214eC() { // from class: X.14eA
            @Override // X.InterfaceC20314214eC
            public final void LIZIZ() {
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final List<String> f5() {
        return new ArrayList();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC1602300rnY g5() {
        return new InterfaceC1602300rnY() { // from class: X.0J5z
            @Override // X.InterfaceC1602300rnY
            public final void LIZ(long j, String str) {
            }

            @Override // X.InterfaceC1602300rnY
            public final boolean LIZJ() {
                return false;
            }

            @Override // X.InterfaceC1602300rnY
            public final void LIZLLL(InterfaceC481880Iv4 interfaceC481880Iv4, String str) {
            }

            @Override // X.InterfaceC1602300rnY
            public final void LJ(Set set, C018E c018e) {
            }

            @Override // X.InterfaceC1602300rnY
            public final boolean LJFF() {
                return false;
            }

            @Override // X.InterfaceC1602300rnY
            public final void LJI(Set set, Set set2, C1602340rnc c1602340rnc) {
            }

            @Override // X.InterfaceC1602300rnY
            public final void LJIIIIZZ() {
            }

            @Override // X.InterfaceC1602300rnY
            public final void LJIIIZ(long j, long j2, long j3, C0J7N c0j7n) {
            }

            @Override // X.InterfaceC1602300rnY
            public final void LJIIJ(String str, long j, long j2, String str2, long j3, Function1<? super String, Unit> function1) {
            }

            @Override // X.InterfaceC1602300rnY
            public final void LJIIJJI(String str) {
            }

            @Override // X.InterfaceC1602300rnY
            public final boolean LJIIL(String str) {
                return false;
            }

            @Override // X.InterfaceC1602300rnY
            public final void LJIILIIL(InterfaceC481880Iv4 interfaceC481880Iv4, String str) {
            }

            @Override // X.InterfaceC1602300rnY
            public final void LJIILJJIL(InterfaceC481880Iv4 interfaceC481880Iv4, String str) {
            }

            @Override // X.InterfaceC1602300rnY
            public final void LJIILL() {
            }

            @Override // X.InterfaceC1602300rnY
            public final void LJIILLIIL(String str) {
            }

            @Override // X.InterfaceC1602300rnY
            public final void LJIIZILJ(boolean z) {
            }

            @Override // X.InterfaceC1602300rnY
            public final void LJIJ(int i, String str, Set set, boolean z) {
            }

            @Override // X.InterfaceC1602300rnY
            public final void LJIJI(int i, String str, Set set, boolean z) {
            }

            @Override // X.InterfaceC1602300rnY
            public final C486450J5v LIZIZ() {
                return new C486450J5v();
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC1572350r1F i6() {
        return new InterfaceC1572350r1F() { // from class: X.0rk0
            @Override // X.InterfaceC1572350r1F
            public final void LIZ() {
            }

            @Override // X.InterfaceC1572350r1F
            public final void LIZIZ(String str) {
            }

            @Override // X.InterfaceC1572350r1F
            public final boolean LIZLLL() {
                return false;
            }

            @Override // X.InterfaceC1572350r1F
            public final boolean LJ() {
                return false;
            }

            @Override // X.InterfaceC1572350r1F
            public final List<LiveSurveyState> LIZJ() {
                return C13BV.INSTANCE;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final C0J8Z j3() {
        return new C0J8Z() { // from class: X.0J7c
            @Override // X.C0J8Z
            public final boolean LIZ(String str) {
                return false;
            }

            @Override // X.C0J8Z
            public final void LIZIZ(long j) {
            }

            @Override // X.C0J8Z
            public final boolean LIZJ() {
                return false;
            }

            @Override // X.C0J8Z
            public final void LIZLLL(com.ss.android.ugc.aweme.profile.model.User user, C09JN c09jn, String str) {
            }

            @Override // X.C0J8Z
            public final void LJ(Runnable runnable, String str) {
            }

            @Override // X.C0J8Z
            public final void LJFF(List<Aweme> list) {
            }

            @Override // X.C0J8Z
            public final void LJI(List<FollowFeed> list) {
            }

            @Override // X.C0J8Z
            public final boolean LJII(Aweme aweme, com.ss.android.ugc.aweme.profile.model.User user) {
                return false;
            }

            @Override // X.C0J8Z
            public final void LJIIIIZZ(com.ss.android.ugc.aweme.profile.model.User user, List list, AfS27S0301000_7 afS27S0301000_7, String str) {
            }

            @Override // X.C0J8Z
            public final void LJIIIZ(List list, AfS140S0200000_4 afS140S0200000_4, String str) {
            }

            @Override // X.C0J8Z
            public final void LJIIJ(List list, Map map, ARunnableS107S0100000_7 aRunnableS107S0100000_7, String str) {
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC756790TmP j6() {
        return new InterfaceC756790TmP() { // from class: X.14e8
            @Override // X.InterfaceC756790TmP
            public final void registerAggregateSlot(InterfaceC756730TmJ interfaceC756730TmJ) {
            }

            @Override // X.InterfaceC756790TmP
            public final void registerSlot(InterfaceC1123960fM2 interfaceC1123960fM2) {
            }

            @Override // X.InterfaceC756790TmP
            public final Rect getIconSlotLocation(Context context, EnumC756810TmR enumC756810TmR) {
                return new Rect(0, 0, 0, 0);
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final C0J7X k3() {
        return new C0J7X() { // from class: X.0J7W
            @Override // X.C0J7X
            public final void LIZ(String str, Observer<Pair<Long, SlimRoom>> observer) {
            }

            @Override // X.C0J7X
            public final void LIZIZ(C19EG c19eg, Lifecycle.State state) {
            }

            @Override // X.C0J7X
            public final void LIZJ(String str, LifecycleOwner lifecycleOwner, Observer<Pair<Long, SlimRoom>> observer) {
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC20673515v3 k4() {
        return new DummyILive();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final IInboxLiveService k6() {
        return new IInboxLiveService() { // from class: X.0rjE
            @Override // com.ss.android.ugc.aweme.inbox.IInboxLiveService
            public final void callPauseAnimation(RecyclerView.ViewHolder viewHolder, EnumC1598770rhr enumC1598770rhr) {
            }

            @Override // com.ss.android.ugc.aweme.inbox.IInboxLiveService
            public final void callResumeAnimation(RecyclerView.ViewHolder viewHolder, EnumC1598770rhr enumC1598770rhr) {
            }

            @Override // com.ss.android.ugc.aweme.inbox.IInboxLiveService
            public final void compensateLiveShow(RecyclerView.ViewHolder viewHolder) {
            }

            @Override // com.ss.android.ugc.aweme.inbox.IInboxLiveService
            public final Set<Long> getInboxCellMobSet() {
                return null;
            }

            @Override // com.ss.android.ugc.aweme.inbox.IInboxLiveService
            public final int getInboxSkyLightListScrollState() {
                return 0;
            }

            @Override // com.ss.android.ugc.aweme.inbox.IInboxLiveService
            public final Class<? extends PowerCell<? extends AbstractC1598130rgp>>[] getLiveCells() {
                return new Class[0];
            }

            @Override // com.ss.android.ugc.aweme.inbox.IInboxLiveService
            public final void realPauseAnimation(RecyclerView.ViewHolder viewHolder) {
            }

            @Override // com.ss.android.ugc.aweme.inbox.IInboxLiveService
            public final void recordRoomInfoList(List<InboxLiveNotice> list) {
            }

            @Override // com.ss.android.ugc.aweme.inbox.IInboxLiveService
            public final void updateInboxListScrollState(int i) {
            }

            @Override // com.ss.android.ugc.aweme.inbox.IInboxLiveService
            public final void watchLive(Context context, InboxLiveNotice inboxLiveNotice, int i) {
            }

            @Override // com.ss.android.ugc.aweme.inbox.IInboxLiveService
            public final AbstractC1598130rgp mapLiveItem(InboxLiveNotice inboxLiveNotice, boolean z, int i) {
                return new C1598180rgu(null, false);
            }

            @Override // com.ss.android.ugc.aweme.inbox.IInboxLiveService
            public final List<AbstractC1598130rgp> mapLiveItems(List<InboxLiveNotice> list, boolean z, boolean z2) {
                return new ArrayList();
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final List<String> l3() {
        return new ArrayList();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC594210NSh m5() {
        return new InterfaceC594210NSh() { // from class: X.0y2R
            @Override // X.InterfaceC594210NSh
            public final void LIZ(Context context, JSONObject jSONObject, InterfaceC594650NTz interfaceC594650NTz) {
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC1492160ovu n4() {
        return new InterfaceC1492160ovu() { // from class: X.14e2
            @Override // X.InterfaceC1492160ovu
            public final boolean LIZ() {
                return true;
            }

            @Override // X.InterfaceC1492160ovu
            public final boolean LIZIZ() {
                return false;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC756430Tlp o3() {
        return new InterfaceC756430Tlp() { // from class: X.0TmC
            @Override // X.InterfaceC756430Tlp
            public final void LIZ(EnumC1107860ew4 enumC1107860ew4, C756470Tlt c756470Tlt, C1107970ewF c1107970ewF, long j, Map map) {
            }

            @Override // X.InterfaceC756430Tlp
            public final void LIZIZ(EnumC1107860ew4 enumC1107860ew4, C756540Tm0 c756540Tm0) {
            }

            @Override // X.InterfaceC756430Tlp
            public final boolean Qi(EnumC1107860ew4 enumC1107860ew4) {
                return false;
            }

            @Override // X.InterfaceC756430Tlp
            public final void Rg(EnumC1107860ew4 enumC1107860ew4, EnumC1108010ewJ enumC1108010ewJ, Map<String, ? extends Object> map) {
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC1601140rlg p5() {
        return new InterfaceC1601140rlg() { // from class: X.14dn
            @Override // X.InterfaceC1601140rlg
            public final void LIZ() {
            }

            @Override // X.InterfaceC1601140rlg
            public final void LIZIZ(int i, Context context, List list) {
            }

            @Override // X.InterfaceC1601140rlg
            public final void LIZJ(int i, Aweme aweme) {
            }

            @Override // X.InterfaceC1601140rlg
            public final void LIZLLL(C19EG c19eg) {
            }

            @Override // X.InterfaceC1601140rlg
            public final InterfaceC475410Ikd LJ() {
                return null;
            }

            @Override // X.InterfaceC1601140rlg
            public final void LJFF(C1602240rnS c1602240rnS) {
            }

            @Override // X.InterfaceC1601140rlg
            public final void LJI(boolean z, int i, String str) {
            }

            @Override // X.InterfaceC1601140rlg
            public final void LJII(Fragment fragment) {
            }

            @Override // X.InterfaceC1601140rlg
            public final void LJIIIIZZ(Context context, List list) {
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final List<IMContact> q3() {
        return new ArrayList();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC486570J6h r3() {
        return new InterfaceC486570J6h() { // from class: X.14e4
            @Override // X.InterfaceC486570J6h
            public final void LIZ(int i, String str, Map map) {
            }

            @Override // X.InterfaceC486570J6h
            public final void LIZIZ(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC1655010tAZ startLiveManager() {
        return new InterfaceC1655010tAZ() { // from class: X.14dz
            @Override // X.InterfaceC1655010tAZ
            public final void LIZIZ(InterfaceC772590USj interfaceC772590USj) {
            }

            @Override // X.InterfaceC1655010tAZ
            public final void LIZJ(InterfaceC772590USj interfaceC772590USj) {
            }

            @Override // X.InterfaceC1655010tAZ
            public final void LJ(C0URV c0urv) {
            }

            @Override // X.InterfaceC1655010tAZ
            public final void LJI(C0URV c0urv) {
            }

            @Override // X.InterfaceC1655010tAZ
            public final void LJII(InterfaceC772580USi interfaceC772580USi) {
            }

            @Override // X.InterfaceC1655010tAZ
            public final void LJIIIIZZ(InterfaceC772580USi interfaceC772580USi) {
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final List<String> u3() {
        return new ArrayList();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final C0J9A v3() {
        return new C0J9A() { // from class: X.0J94
            @Override // X.C0J9A
            public final boolean LIZ() {
                return false;
            }

            @Override // X.C0J9A
            public final void LIZIZ(String str) {
            }

            @Override // X.C0J9A
            public final String LIZJ() {
                return "";
            }

            @Override // X.C0J9A
            public final void LJ() {
            }

            @Override // X.C0J9A
            public final void LJFF(View view, String str) {
            }

            @Override // X.C0J9A
            public final void LJI() {
            }

            @Override // X.C0J9A
            public final String LJII(String str) {
                return "";
            }

            @Override // X.C0J9A
            public final InterfaceC1590940rVE LJIIIIZZ(InterfaceC19244510Qp interfaceC19244510Qp, WeakReference<Context> weakReference) {
                return null;
            }

            @Override // X.C0J9A
            public final void LJIIIZ(String str) {
            }

            @Override // X.C0J9A
            public final boolean LJIIJ() {
                return false;
            }

            @Override // X.C0J9A
            public final boolean LJIIJJI() {
                return false;
            }

            @Override // X.C0J9A
            public final void LJIIL(ArrayList arrayList, int i) {
            }

            @Override // X.C0J9A
            public final C0J6Q LJIILIIL() {
                return null;
            }

            @Override // X.C0J9A
            public final C0J6Q LJIILJJIL() {
                return null;
            }

            @Override // X.C0J9A
            public final boolean LJIILL() {
                return false;
            }

            @Override // X.C0J9A
            public final void LJIILLIIL() {
            }

            @Override // X.C0J9A
            public final void LJIIZILJ(C19EG c19eg, Intent intent) {
            }

            @Override // X.C0J9A
            public final void LJIJ() {
            }

            @Override // X.C0J9A
            public final boolean LJIJI() {
                return false;
            }

            @Override // X.C0J9A
            public final long LJIJJ() {
                return 0L;
            }

            @Override // X.C0J9A
            public final InterfaceC662550Pyn LJIJJLI(C1322110kVd c1322110kVd) {
                return null;
            }

            @Override // X.C0J9A
            public final void LJIL(int i, long j, String str) {
            }

            @Override // X.C0J9A
            public final void LJJ(HashSet<String> hashSet) {
            }

            @Override // X.C0J9A
            public final void LJJI() {
            }

            @Override // X.C0J9A
            public final boolean LJJII(boolean z) {
                return false;
            }

            @Override // X.C0J9A
            public final InterfaceC19244510Qp LJJIII(WeakReference<View> weakReference, C0J97 c0j97, WeakReference<C0J6Q> weakReference2, boolean z) {
                return null;
            }

            @Override // X.C0J9A
            public final void LJJIIJ(int i, Context context, List list) {
            }

            @Override // X.C0J9A
            public final Pair LJJIIJZLJL() {
                return null;
            }

            @Override // X.C0J9A
            public final void LJJIIZ(int i) {
            }

            @Override // X.C0J9A
            public final void LJJIJ(boolean z) {
            }

            @Override // X.C0J9A
            public final InterfaceC662550Pyn LJJIJIIJI(C1322110kVd c1322110kVd, boolean z) {
                return null;
            }

            @Override // X.C0J9A
            public final boolean Na() {
                return false;
            }

            @Override // X.C0J9A
            public final int getAnchorPosition() {
                return 0;
            }

            @Override // X.C0J9A
            public final boolean getIsFollowWidgetExp() {
                return false;
            }

            @Override // X.C0J9A
            public final int getWidgetAnchorNum() {
                return 0;
            }

            @Override // X.C0J9A
            public final boolean re() {
                return false;
            }

            @Override // X.C0J9A
            public final HashSet<String> LIZLLL() {
                return new HashSet<>();
            }

            @Override // X.C0J9A
            public final C0J90 LJJIIZI() {
                return new C0J90();
            }

            @Override // X.C0J9A
            public final String LJJIFFI(long j) {
                return C786410Ut5.J3(new JSONObject());
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC1488720oqM w4() {
        return new InterfaceC1488720oqM() { // from class: X.14dq
            @Override // X.InterfaceC1488720oqM
            public final boolean LIZ(String str) {
                return false;
            }

            @Override // X.InterfaceC1488720oqM
            public final void LIZIZ(boolean z) {
            }

            @Override // X.InterfaceC1488720oqM
            public final int Yc() {
                return 0;
            }

            @Override // X.InterfaceC1488720oqM
            public final void setCurrentPlayerMute(boolean z) {
            }

            @Override // X.InterfaceC1488720oqM
            public final Boolean isPlaying() {
                return Boolean.FALSE;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC1264870j1J x3() {
        return new InterfaceC1264870j1J() { // from class: X.14dr
            @Override // X.InterfaceC1264870j1J
            public final ListLiveCircleItemVM LIZ(int i, C19EG c19eg) {
                return null;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final C0J5O z5() {
        return new C0J5O() { // from class: X.0J4s
            @Override // X.C0J5O
            public final void LIZ(Context context, Map map, String str, List list, int i, C1A58 c1a58) {
            }

            @Override // X.C0J5O
            public final void LIZIZ(Context context, NewLiveRoomStruct newLiveRoomStruct, EnterRoomConfig enterRoomConfig) {
            }

            @Override // X.C0J5O
            public final void LIZJ(Context context, com.ss.android.ugc.aweme.profile.model.User user, NewLiveRoomStruct newLiveRoomStruct, Bundle bundle) {
            }

            @Override // X.C0J5O
            public final void LIZLLL(Context context, LiveRoomStruct liveRoomStruct, EnterRoomConfig enterRoomConfig) {
            }

            @Override // X.C0J5O
            public final /* synthetic */ void LJ(Context context, SlimRoom slimRoom, String str) {
            }

            @Override // X.C0J5O
            public final void LJFF(Context context, com.ss.android.ugc.aweme.profile.model.User user, boolean z, String str, SlimRoom slimRoom, String str2, String str3) {
            }

            @Override // X.C0J5O
            public final void LJI(Context context, EnterRoomConfig enterRoomConfig, LiveRoomStruct liveRoomStruct, List<Long> list, Map<String, String> map) {
            }

            @Override // X.C0J5O
            public final void LJII(EnterRoomConfig enterRoomConfig, String str) {
            }

            @Override // X.C0J5O
            public final boolean LJIIIIZZ(Context context, com.ss.android.ugc.aweme.profile.model.User user, EnterRoomConfig enterRoomConfig) {
                return false;
            }

            @Override // X.C0J5O
            public final void LJIIIZ(Boolean bool, Integer num, String str, List list) {
            }

            @Override // X.C0J5O
            public final void LJIIJ(Context context, EnterRoomConfig enterRoomConfig, Aweme aweme, List<Aweme> list, InterfaceC486070J4j interfaceC486070J4j, InterfaceC486120J4o interfaceC486120J4o) {
            }

            @Override // X.C0J5O
            public final void LJIIJJI(Context context, EnterRoomConfig enterRoomConfig, LiveRoomStruct liveRoomStruct, List<LiveRoomStruct> list, InterfaceC486070J4j interfaceC486070J4j, InterfaceC486120J4o interfaceC486120J4o) {
            }

            @Override // X.C0J5O
            public final void LJIIL(Context context, long j, EnterRoomConfig enterRoomConfig, String str, ArrayList<Long> arrayList, String str2) {
            }

            @Override // X.C0J5O
            public final void watchLive(Context context, EnterRoomConfig enterRoomConfig) {
            }

            @Override // X.C0J5O
            public final boolean watchLive(Context context, EnterRoomConfig enterRoomConfig, String str) {
                return false;
            }

            @Override // X.C0J5O
            public final DialogFragment xd() {
                return new DialogFragment();
            }

            @Override // X.C0J5O
            public final C0IOU getSearchComponent(String str) {
                return new C0IOU() { // from class: X.0J4t
                    @Override // X.C0IOU
                    public final boolean LJIIJJI() {
                        return false;
                    }

                    @Override // X.C0IOU
                    public final void LJIIL(long j) {
                    }

                    @Override // X.C0IOU
                    public final void LJIILIIL(long j) {
                    }

                    @Override // X.C0IOU
                    public final void LJIILL(int i, C0IOT c0iot) {
                    }

                    @Override // X.C0IOU
                    public final void LJIILLIIL(Map<String, String> map) {
                    }

                    @Override // X.C0IOU
                    public final void release() {
                    }

                    @Override // X.C0IOU
                    public final List<EnterRoomConfig> LJIILJJIL() {
                        return new ArrayList();
                    }
                };
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final List LLZZJLIL() {
        return Collections.emptyList();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final Map<String, String> LLZZZIL() {
        return C2097608Jq.LJ();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final Map<String, Object> Pe() {
        return Collections.emptyMap();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC1596830rej U4() {
        return new C20315614eQ() { // from class: X.14eB
        };
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC827870Wdl V4() {
        return new InterfaceC827870Wdl() { // from class: X.14dt
            @Override // X.InterfaceC827870Wdl
            public final String getLiveCoreVersion() {
                return "";
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC1730620v8W f3() {
        return new InterfaceC1730620v8W() { // from class: X.14e6
            @Override // X.InterfaceC1730620v8W
            public final void LIZ(int i, InterfaceC969820bLQ interfaceC969820bLQ) {
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC486620J6m i4() {
        return new C1865590yeD() { // from class: X.0yeE
        };
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final Boolean s4() {
        return Boolean.TRUE;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final C1ACD K4(C2175581ACm c2175581ACm) {
        return new C1ACQ();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC519500KYy O4(boolean z) {
        return new C1905640zgo() { // from class: X.0zgq
        };
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final DialogFragment S5(EnumC752540TfY enumC752540TfY) {
        return new DialogFragment();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final DialogFragment X4(EnumC752540TfY enumC752540TfY) {
        return new DialogFragment();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final <T> T getService(Class<T> cls) {
        C480460Ism.LIZ().getClass();
        return (T) C480460Ism.LIZLLL(cls);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC1564100qnw s3(C1602280rnW c1602280rnW) {
        return new InterfaceC1564100qnw() { // from class: X.0qnx
            @Override // X.InterfaceC1564100qnw
            public final void init() {
            }

            @Override // X.InterfaceC1564100qnw
            public final boolean isInit() {
                return false;
            }

            @Override // X.InterfaceC1564100qnw
            public final void onEvent(String str, JSONObject jSONObject, Function2<? super Boolean, ? super String, Unit> function2) {
            }

            @Override // X.InterfaceC1564100qnw
            public final boolean onEvent(String str, JSONObject jSONObject) {
                return false;
            }

            @Override // X.InterfaceC1564100qnw
            public final void release() {
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final /* bridge */ /* synthetic */ void A5(Long l, InterfaceC759900TrQ interfaceC759900TrQ) {
        l.longValue();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final /* bridge */ /* synthetic */ void P5(EnumC482480Iw2 enumC482480Iw2, Boolean bool) {
        bool.booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final C1ACD generateLivePlayHelper(InterfaceC2175541ACi interfaceC2175541ACi, EnumC1913520ztW enumC1913520ztW) {
        return new C1ACQ();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final /* bridge */ /* synthetic */ InterfaceC486260J5c h4(C19EG c19eg, View view, String str, Integer num) {
        num.intValue();
        return null;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final /* bridge */ /* synthetic */ void u5(Long l, String str, String str2, String str3, String str4, Integer num) {
        num.intValue();
        l.longValue();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final /* bridge */ /* synthetic */ boolean N4(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Long l, Integer num) {
        num.intValue();
        l.longValue();
        return false;
    }
}
