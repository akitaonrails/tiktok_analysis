package com.ss.android.ugc.aweme.live;

import X.AbstractC1538680q8w;
import X.AbstractC1608810ry3;
import X.C0CJP;
import X.C0CW1;
import X.C0J4W;
import X.C0J58;
import X.C0J5C;
import X.C0J5O;
import X.C0J7R;
import X.C0J7X;
import X.C0J88;
import X.C0J8Z;
import X.C0J93;
import X.C0J9A;
import X.C0K77;
import X.C0K8K;
import X.C0PSA;
import X.C0QBB;
import X.C0TGX;
import X.C10E1;
import X.C10JX;
import X.C1101540els;
import X.C1109510eyj;
import X.C1115890f91;
import X.C1152540g68;
import X.C1152570g6B;
import X.C1167730gUd;
import X.C11NZ;
import X.C1311670kEn;
import X.C1338270kvh;
import X.C1378280lyE;
import X.C1385260m9U;
import X.C13BV;
import X.C13IQ;
import X.C13LQ;
import X.C145E;
import X.C1502370pCN;
import X.C152C;
import X.C1547760qNa;
import X.C1602280rnW;
import X.C1602320rna;
import X.C1608480rxW;
import X.C170300l3;
import X.C1808160x9a;
import X.C1812030xFp;
import X.C1834150xpV;
import X.C1840100xz6;
import X.C19EG;
import X.C1ACD;
import X.C20309414dQ;
import X.C20309714dT;
import X.C20310314dZ;
import X.C20310414da;
import X.C20310514db;
import X.C20310714dd;
import X.C20310814de;
import X.C20310914df;
import X.C20311014dg;
import X.C20311414dk;
import X.C20312514dv;
import X.C20322014fS;
import X.C20329714gh;
import X.C20337714hz;
import X.C2175581ACm;
import X.C473360IhK;
import X.C476240Ily;
import X.C483380IxU;
import X.C486390J5p;
import X.C500260Jjc;
import X.C781610UlL;
import X.C783820Uou;
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
import com.bytedance.android.live.liveinteract.InteractServiceDel;
import com.bytedance.android.livesdk.comp.api.performance.IPerformanceService;
import com.bytedance.android.livesdk.internal.Live;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTabBusinessInterceptorAllowListSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTabBusinessInterceptorBlockListSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveBroadcastHostUseTTLH;
import com.bytedance.android.livesdk.model.ItemTab;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.model.LivePreloadHighlightVideoModel;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.live.FeedStrategyPlatformFeatures;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStatesTag;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.util.LiveHotReloadCepManager;
import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.inbox.IInboxLiveService;
import com.ss.android.ugc.aweme.live.liveevent.LiveEventOuterService;
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
public final class LiveOuterServiceWrapper implements ILiveOuterService {
    public final C20309414dQ LIZ = new C20309414dQ();

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final boolean e6() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final boolean q5() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final /* synthetic */ void r6(Fragment fragment) {
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void A3() {
        this.LIZ.getClass();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC712730RxX A4() {
        return this.LIZ.A4();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void Ai() {
        this.LIZ.Ai();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC20318714ev B4() {
        return this.LIZ.B4();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC1233550iCn B5() {
        this.LIZ.getClass();
        return C1378280lyE.LIZJ;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final C0K77 C3() {
        this.LIZ.getClass();
        return C0K8K.LJ;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final C0J4W C4() {
        this.LIZ.getClass();
        return new C1152570g6B();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final boolean D3() {
        this.LIZ.getClass();
        return true;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final String D5() {
        return this.LIZ.D5();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void E3() {
        this.LIZ.E3();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC1363540laS E4() {
        return this.LIZ.E4();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final boolean F3() {
        return this.LIZ.F3();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC1012330cRz F4() {
        return this.LIZ.F4();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC1589460rSq F5() {
        this.LIZ.getClass();
        return C1602320rna.LJ;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final boolean Fi() {
        return this.LIZ.Fi();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC20320414fC G3() {
        this.LIZ.getClass();
        return C10JX.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final int G4() {
        this.LIZ.getClass();
        return C1152540g68.LJIIIIZZ(true);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC487230J8v G5() {
        this.LIZ.getClass();
        return C170300l3.LIZJ;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final boolean H5() {
        this.LIZ.getClass();
        return C500260Jjc.LJJIJLIJ();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC20313714e7 I3() {
        this.LIZ.getClass();
        return C20312514dv.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void I4() {
        this.LIZ.getClass();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC1655020tAa J3() {
        this.LIZ.getClass();
        return new C20322014fS();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC713880RzO J4() {
        this.LIZ.getClass();
        return new C20310814de();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC757210Tn5 K3() {
        return this.LIZ.K3();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final ILiveEventOuterService K5() {
        this.LIZ.getClass();
        return LiveEventOuterService.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final ILiveBDXBridgeService L3() {
        this.LIZ.getClass();
        return C1808160x9a.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final String LIZ() {
        return this.LIZ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC473370IhL LIZLLL() {
        this.LIZ.getClass();
        return C473360IhK.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final String LJ() {
        return this.LIZ.LJ();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final boolean LLZZ() {
        return this.LIZ.LLZZ();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final List<String> LLZZJLIL() {
        List<String> listLLZZJLIL;
        this.LIZ.getClass();
        InteractServiceDel interactServiceDel = InteractServiceDel.LLILLJJLI;
        return (interactServiceDel == null || (listLLZZJLIL = interactServiceDel.LLZZJLIL()) == null) ? C13BV.INSTANCE : listLLZZJLIL;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final Map<String, String> LLZZZIL() {
        return this.LIZ.LLZZZIL();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final boolean M3() {
        this.LIZ.getClass();
        return true;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final C10E1 M4() {
        return this.LIZ.M4();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC1733080vCU M5() {
        this.LIZ.getClass();
        return C20311014dg.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void Ng() {
        this.LIZ.Ng();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC1120520fGU O3() {
        this.LIZ.getClass();
        return C1115890f91.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final C0QBB O5() {
        return this.LIZ.O5();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC1654980tAW P3() {
        return this.LIZ.P3();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final Map<String, Object> Pe() {
        return this.LIZ.Pe();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final C0PSA Q3() {
        this.LIZ.getClass();
        return C152C.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final boolean Q4() {
        return this.LIZ.Q4();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void Q5() {
        this.LIZ.getClass();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final IPerformanceService Rs() {
        return this.LIZ.Rs();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC1601520rmI S3() {
        this.LIZ.getClass();
        return C0J88.LJ;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void S4() {
        this.LIZ.S4();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void T3() {
        this.LIZ.T3();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC1217040hmA T4() {
        this.LIZ.getClass();
        return C20310914df.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void T5() {
        this.LIZ.T5();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final AbstractC1608810ry3<? extends InterfaceC1606880ruw, ? extends InterfaceC426680GoE> U3() {
        this.LIZ.getClass();
        return new C1608480rxW();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC1596830rej U4() {
        return this.LIZ.U4();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final boolean U5() {
        this.LIZ.getClass();
        return true;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC827870Wdl V4() {
        this.LIZ.getClass();
        return C20310314dZ.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final ILiveGeckoLoaderService V5() {
        this.LIZ.getClass();
        return C20329714gh.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC20315114eL W4() {
        this.LIZ.getClass();
        return C1840100xz6.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void W5() {
        this.LIZ.getClass();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC2183451Acp X3() {
        this.LIZ.getClass();
        return InteractServiceDel.LLILLJJLI;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void X5() {
        this.LIZ.getClass();
        C1547760qNa.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void Y4() {
        this.LIZ.Y4();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final boolean Z3() {
        return this.LIZ.Z3();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void Z4() {
        this.LIZ.Z4();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final boolean a() {
        this.LIZ.getClass();
        return LiveBroadcastHostUseTTLH.getEnable();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final boolean a5() {
        this.LIZ.getClass();
        return Live.hasTTLiveSDKInitFinish();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final int a6() {
        return this.LIZ.a6();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final String b6() {
        return this.LIZ.b6();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC1564370qoN c5() {
        this.LIZ.getClass();
        return LivePreviewCTASmartDisplayManager.INSTANCE;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final boolean c6() {
        return this.LIZ.c6();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final boolean d4() {
        return this.LIZ.d4();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC1654970tAV d5() {
        return this.LIZ.d5();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final List<C1311670kEn> e3() {
        return this.LIZ.e3();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC20314214eC e4() {
        this.LIZ.getClass();
        return new C20309714dT();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void ef() {
        this.LIZ.ef();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC1730620v8W f3() {
        return this.LIZ.f3();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final boolean f4() {
        return this.LIZ.f4();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final List<String> f5() {
        return this.LIZ.f5();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC493540JXc f6() {
        return this.LIZ.f6();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC1602300rnY g5() {
        this.LIZ.getClass();
        return C486390J5p.LLJI;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final String g6() {
        String strG6 = this.LIZ.g6();
        return strG6 == null ? "" : strG6;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final C0CJP getLiveGlobalConfig() {
        this.LIZ.getClass();
        return new C1502370pCN();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC468170IXn getLivePreloadService() {
        return this.LIZ.getLivePreloadService();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final ArrayList<InterfaceC345370DgN> getStorageList() {
        return this.LIZ.getStorageList();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void h3() {
        this.LIZ.h3();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final boolean h5() {
        return this.LIZ.h5();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final JSONObject hj() {
        return this.LIZ.hj();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC486620J6m i4() {
        this.LIZ.i4();
        return C20310514db.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final boolean i5() {
        return this.LIZ.i5();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC1572350r1F i6() {
        this.LIZ.getClass();
        return C483380IxU.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void isBroadcastSmoothGoLive() {
        this.LIZ.getClass();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final boolean isInitedLiveSDK() {
        this.LIZ.getClass();
        return Live.isInitedLiveSDK();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final C0J8Z j3() {
        return this.LIZ.j3();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC756790TmP j6() {
        this.LIZ.j6();
        return C781610UlL.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final C0J7X k3() {
        this.LIZ.getClass();
        return new C0J7R();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC20673515v3 k4() {
        return this.LIZ.k4();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final IInboxLiveService k6() {
        return this.LIZ.k6();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final List<String> l3() {
        return this.LIZ.l3();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void l5() {
        this.LIZ.l5();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final boolean lj() {
        return this.LIZ.lj();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final boolean m3() {
        this.LIZ.getClass();
        return true;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final boolean m4() {
        return this.LIZ.m4();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC594210NSh m5() {
        this.LIZ.getClass();
        return C1812030xFp.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void m6() {
        C20337714hz.LIZJ.getClass();
        C20337714hz.LIZLLL.clear();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final boolean n3() {
        return this.LIZ.n3();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC1492160ovu n4() {
        this.LIZ.n4();
        return C20310414da.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC756430Tlp o3() {
        return this.LIZ.o3();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void o4() {
        this.LIZ.o4();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void o5() {
        this.LIZ.getClass();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final boolean o6() {
        return this.LIZ.o6();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final boolean p3() {
        return this.LIZ.p3();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final boolean p4() {
        return this.LIZ.p4();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC1601140rlg p5() {
        return this.LIZ.p5();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void preloadLiveLibrary() {
        this.LIZ.preloadLiveLibrary();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final List<IMContact> q3() {
        this.LIZ.getClass();
        return C1385260m9U.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final ILiveOuterService q4() {
        return this.LIZ.q4();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final String q6() {
        return this.LIZ.q6();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void qj() {
        this.LIZ.qj();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC486570J6h r3() {
        this.LIZ.getClass();
        return C476240Ily.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void r4() {
        this.LIZ.getClass();
        C783820Uou.LJIIIZ("cert", null);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void r5() {
        this.LIZ.getClass();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final boolean r8() {
        return this.LIZ.r8();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final Boolean s4() {
        return this.LIZ.s4();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC1655010tAZ startLiveManager() {
        return this.LIZ.startLiveManager();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final C13IQ<? extends UIContentAssem> t3() {
        return this.LIZ.t3();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final boolean t4() {
        return this.LIZ.t4();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final boolean t5() {
        return this.LIZ.t5();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final List<String> u3() {
        return this.LIZ.u3();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC713870RzN u4() {
        this.LIZ.getClass();
        return new C20310714dd();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final C0J9A v3() {
        this.LIZ.getClass();
        return C0J93.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void v5() {
        this.LIZ.getClass();
        Live.initDesignManager();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void v6() {
        this.LIZ.getClass();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final boolean w3() {
        return this.LIZ.w3();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC1488720oqM w4() {
        return this.LIZ.w4();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void w5() {
        this.LIZ.getClass();
        C1109510eyj.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC1101550elt w6() {
        this.LIZ.getClass();
        return new C1101540els();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC1264870j1J x3() {
        return this.LIZ.x3();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final boolean y3() {
        this.LIZ.getClass();
        return C20311414dk.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final boolean y5() {
        return this.LIZ.y5();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final C0J5O z5() {
        return this.LIZ.z5();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final int B3(Aweme aweme) {
        return this.LIZ.B3(aweme);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final String C5(String str) {
        return this.LIZ.C5(str);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void D4(String str) {
        this.LIZ.D4(str);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final boolean E5(Activity activity) {
        this.LIZ.getClass();
        return activity instanceof LivePlayActivity;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final int H3(Aweme aweme) {
        return this.LIZ.H3(aweme);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void H4(Map<String, List<LiveRoomStatesTag>> map) {
        this.LIZ.H4(map);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void I5(String str) {
        boolean zLJI = MethodIDManager.LJI(72000);
        boolean zLJI2 = MethodIDManager.LJI(196635);
        this.LIZ.I5(str);
        if (zLJI2) {
            MethodIDManager.LJ();
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final C1ACD K4(C2175581ACm c2175581ACm) {
        return this.LIZ.K4(c2175581ACm);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void L4(Map<String, Map<String, String>> map) {
        this.LIZ.L4(map);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final int L5(Aweme aweme) {
        return this.LIZ.L5(aweme);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void LIZIZ(String str) {
        this.LIZ.LIZIZ(str);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void N3(Context context) {
        this.LIZ.N3(context);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void N5(boolean z) {
        this.LIZ.N5(z);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC519500KYy O4(boolean z) {
        return this.LIZ.O4(z);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void R4(List<Aweme> list) {
        this.LIZ.R4(list);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final DialogFragment S5(EnumC752540TfY enumC752540TfY) {
        return this.LIZ.S5(enumC752540TfY);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final Bitmap V3(boolean z) {
        return this.LIZ.V3(z);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final DialogFragment X4(EnumC752540TfY enumC752540TfY) {
        return this.LIZ.X4(enumC752540TfY);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void Xm(List<ItemTab> list) {
        this.LIZ.Xm(list);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void Y5(Map<String, String> map) {
        this.LIZ.Y5(map);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final String a4(Uri uri) {
        this.LIZ.getClass();
        return C1547760qNa.LIZ(uri);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void e5(Map<String, FeedStrategyPlatformFeatures> map) {
        this.LIZ.e5(map);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final <T> T getService(Class<T> cls) {
        return (T) this.LIZ.getService(cls);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final boolean h6(String str) {
        return C13LQ.LJIILLIIL(str, LiveTabBusinessInterceptorAllowListSetting.INSTANCE.getValue());
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void hasLopBubbleForLog(int i) {
        this.LIZ.hasLopBubbleForLog(i);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void hasLopEnterBubbleForLog(int i) {
        this.LIZ.hasLopEnterBubbleForLog(i);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void i3(C0CW1 c0cw1) {
        this.LIZ.i3(c0cw1);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final String j4(LiveRoomStruct liveRoomStruct) {
        return this.LIZ.j4(liveRoomStruct);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void j5(C145E c145e) {
        this.LIZ.j5(c145e);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void k5(String str) {
        this.LIZ.k5(str);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final boolean l4(Context context) {
        this.LIZ.getClass();
        return C1834150xpV.LJFF(context);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void n5(List<Long> list) {
        this.LIZ.n5(list);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final int n6(Aweme aweme) {
        return this.LIZ.n6(aweme);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void preloadLiveHighlightVideo(List<LivePreloadHighlightVideoModel> list) {
        this.LIZ.preloadLiveHighlightVideo(list);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void registerSubSparkPlugin(AbstractC1538680q8w abstractC1538680q8w) {
        this.LIZ.registerSubSparkPlugin(abstractC1538680q8w);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC1564100qnw s3(C1602280rnW c1602280rnW) {
        this.LIZ.getClass();
        return new LiveHotReloadCepManager(c1602280rnW);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final Room t6(LiveRoomStruct liveRoomStruct) {
        return this.LIZ.t6(liveRoomStruct);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void u6(long j) {
        this.LIZ.u6(j);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void updateReferrerHostFromKeva(Context context) {
        this.LIZ.updateReferrerHostFromKeva(context);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void x4(TokenCert tokenCert) {
        this.LIZ.x4(tokenCert);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final boolean x5(String str) {
        return !C13LQ.LJIILLIIL(str, LiveTabBusinessInterceptorBlockListSetting.INSTANCE.getValue());
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void z3(Context context) {
        this.LIZ.z3(context);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void z4(JSONObject jSONObject) {
        this.LIZ.z4(jSONObject);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void A5(Long l, InterfaceC759900TrQ interfaceC759900TrQ) {
        this.LIZ.A5(Long.valueOf(l.longValue()), interfaceC759900TrQ);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void J5(int i, String str) {
        this.LIZ.J5(i, str);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final Object LIZJ(Object obj, String str) {
        this.LIZ.getClass();
        return C1338270kvh.LIZ(obj, str);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void LLZZLLIL(int i, List<Long> list) {
        this.LIZ.getClass();
        InteractServiceDel interactServiceDel = InteractServiceDel.LLILLJJLI;
        if (interactServiceDel != null) {
            interactServiceDel.LLZZLLIL(i, list);
        }
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void P5(EnumC482480Iw2 enumC482480Iw2, Boolean bool) {
        this.LIZ.P5(enumC482480Iw2, Boolean.valueOf(bool.booleanValue()));
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void R3(Context context, Aweme aweme) {
        this.LIZ.R3(context, aweme);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void R5(String str, String str2) {
        this.LIZ.R5(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void Y3(UrlModel urlModel, UrlModel urlModel2) {
        this.LIZ.Y3(urlModel, urlModel2);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void Z5(String str, String str2) {
        this.LIZ.Z5(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void b4(ViewGroup viewGroup, C0TGX c0tgx) {
        this.LIZ.b4(viewGroup, c0tgx);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void b5(Context context, JSONObject jSONObject) {
        this.LIZ.b5(context, jSONObject);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void d3(int i, JSONObject jSONObject) {
        this.LIZ.d3(i, jSONObject);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC473820Ii4 d6(String str, String str2) {
        return this.LIZ.d6(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void ed(boolean z, boolean z2) {
        this.LIZ.ed(z, z2);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void g3(Context context, String str) {
        this.LIZ.g3(context, str);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final C1ACD generateLivePlayHelper(InterfaceC2175541ACi interfaceC2175541ACi, EnumC1913520ztW enumC1913520ztW) {
        return this.LIZ.generateLivePlayHelper(interfaceC2175541ACi, enumC1913520ztW);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void l6(long j, List list) {
        this.LIZ.l6(j, list);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final C0J5C s6(View view, C19EG c19eg) {
        this.LIZ.getClass();
        return new C0J58(view, c19eg);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void y4(C19EG c19eg, Map map) {
        this.LIZ.y4(c19eg, map);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void LLZZZZ(Activity activity, int i, Uri uri) throws Throwable {
        this.LIZ.LLZZZZ(activity, i, uri);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void W3(Context context, String str, Function1<? super SparkContext, Unit> function1) {
        this.LIZ.W3(context, str, function1);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void b(Fragment fragment, int i, Uri uri) throws Throwable {
        this.LIZ.b(fragment, i, uri);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void c4(long j, boolean z, boolean z2) {
        this.LIZ.c4(j, z, z2);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final Object g4(String str, String str2, String str3) {
        return this.LIZ.g4(str, str2, str3);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void onAppLogEvent(String str, JSONObject jSONObject, String str2) {
        this.LIZ.onAppLogEvent(str, jSONObject, str2);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void s5(String str, List list, C1167730gUd c1167730gUd) {
        this.LIZ.s5(str, list, c1167730gUd);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC486260J5c h4(C19EG c19eg, View view, String str, Integer num) {
        return this.LIZ.h4(c19eg, view, str, Integer.valueOf(num.intValue()));
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void jumpLiveSquareWithLogin(Context context, String str, String str2, InterfaceC20311214di interfaceC20311214di) {
        this.LIZ.jumpLiveSquareWithLogin(context, str, str2, interfaceC20311214di);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void p6(Context context, boolean z, String str, boolean z2) {
        this.LIZ.p6(context, z, str, z2);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void showCppUnlockGuideDialogV2(String str, String str2, Boolean bool, FragmentManager fragmentManager) {
        this.LIZ.showCppUnlockGuideDialogV2(str, str2, bool, fragmentManager);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void v4(Context context, AFwS187S0000000_2 aFwS187S0000000_2, String str, Bundle bundle, C11NZ c11nz) {
        this.LIZ.v4(context, aFwS187S0000000_2, str, bundle, c11nz);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void u5(Long l, String str, String str2, String str3, String str4, Integer num) {
        int iIntValue = num.intValue();
        long jLongValue = l.longValue();
        this.LIZ.u5(Long.valueOf(jLongValue), str, str2, str3, str4, Integer.valueOf(iIntValue));
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void P4(Context context, String str, ArrayList arrayList, String str2, String str3, ViewModelStoreOwner viewModelStoreOwner, AwS651S0100000_2 awS651S0100000_2) {
        this.LIZ.P4(context, str, arrayList, str2, str3, viewModelStoreOwner, awS651S0100000_2);
    }

    public final boolean LJFF(String str, String str2, String str3, long j, String str4, int i, String str5, String str6, String str7, String str8) {
        return this.LIZ.N4(str, str2, str3, str4, str5, str6, str7, str8, Long.valueOf(j), Integer.valueOf(i));
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final /* bridge */ /* synthetic */ boolean N4(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Long l, Integer num) {
        return LJFF(str, str2, str3, l.longValue(), str4, num.intValue(), str5, str6, str7, str8);
    }
}
