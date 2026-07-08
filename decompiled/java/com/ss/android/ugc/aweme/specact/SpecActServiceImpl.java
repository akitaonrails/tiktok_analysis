package com.ss.android.ugc.aweme.specact;

import X.C01GW;
import X.C01U6;
import X.C098200Yq;
import X.C0A45;
import X.C0A46;
import X.C0BS9;
import X.C0T3N;
import X.C0T3O;
import X.C0W42;
import X.C10UR;
import X.C1253204vK;
import X.C13BV;
import X.C13LE;
import X.C13LP;
import X.C1412905fz;
import X.C1529590puH;
import X.C1537060q6K;
import X.C1546500qLY;
import X.C1546510qLZ;
import X.C1546560qLe;
import X.C1581680rGI;
import X.C1619720sFe;
import X.C1700670uMD;
import X.C1868970yjf;
import X.C189200o6;
import X.C1893440zN8;
import X.C1893580zNM;
import X.C1893650zNT;
import X.C1893680zNW;
import X.C1893780zNg;
import X.C1894330zOZ;
import X.C1894450zOl;
import X.C1895410zQJ;
import X.C1895450zQN;
import X.C1895590zQb;
import X.C1895610zQd;
import X.C1895620zQe;
import X.C1895640zQg;
import X.C1895670zQj;
import X.C1895680zQk;
import X.C1895710zQn;
import X.C1896150zRV;
import X.C1896160zRW;
import X.C1896230zRd;
import X.C1896710zSP;
import X.C1896720zSQ;
import X.C1898260zUu;
import X.C1898700zVc;
import X.C1906000zhO;
import X.C1910707e5;
import X.C1930707hJ;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2189821An6;
import X.C304430BwX;
import X.C305900Byu;
import X.C452501pT;
import X.C612910O2f;
import X.C716790S9t;
import X.C813040Vuw;
import X.C815390Vyj;
import X.EnumC1895270zQ5;
import X.InterfaceC1896860zSe;
import X.InterfaceC1897260zTI;
import X.InterfaceC1904907d9;
import X.InterfaceC1910807e6;
import X.InterfaceC20660615sy;
import X.RunnableC1894440zOk;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.touchpoint.core.pendant.feed.FeedTimerPendantManger;
import com.bytedance.touchpoint.core.pendant.manager.SpecActPendantManager;
import com.bytedance.touchpoint.ui.pendant.SpecActWidget;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.assem.SpecActAssem;
import com.ss.android.ugc.aweme.base.share.ShareOperationInfo;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import com.ss.android.ugc.aweme.feed.IFeedSpecActService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.specact.ab.SparkOptimizationModel;
import com.ss.android.ugc.aweme.specact.ab.SparkPreloadModel;
import com.ss.android.ugc.aweme.specact.ab.SparkReUseModel;
import com.ss.android.ugc.aweme.specact.api.ISpecActService;
import com.ss.android.ugc.aweme.specact.touchpoints.interceptor.M2InstallHeaderInterceptor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS112S1000000_28;
import kotlin.jvm.internal.AwS12S3100000_28;
import kotlin.jvm.internal.AwS156S0400000_28;
import kotlin.jvm.internal.AwS177S1100000_28;
import kotlin.jvm.internal.AwS31S1201000_28;
import kotlin.jvm.internal.AwS35S2200000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.AwS625S0100000_11;
import kotlin.jvm.internal.AwS626S0100000_12;
import kotlin.jvm.internal.AwS64S0010000_28;
import kotlin.jvm.internal.AwS66S2100000_28;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes29.dex */
public class SpecActServiceImpl implements ISpecActService, IFeedSpecActService {
    public boolean LIZJ;
    public Aweme LJ;
    public boolean LJFF;
    public final RunnableC1894440zOk LIZIZ = new RunnableC1894440zOk(this);
    public boolean LIZLLL = true;
    public final C01GW LJI = C452501pT.LIZIZ(new C1412905fz());

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public void LJIJ() {
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final void LJJIII() {
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final void LJJIIZI() {
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final C19719912Dl LJJJJLL() {
        return C13LE.LIZ(SpecActAssem.class);
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public String LJJJZ() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final void LJJL() {
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final void LJJLIIIJ() {
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final void LJJLIIIJL() {
        this.LJFF = false;
        C1546500qLY c1546500qLY = C1546560qLe.LIZ;
        String str = C1868970yjf.LIZ().biz;
        c1546500qLY.getClass();
        C1546500qLY.LJIIIIZZ(str);
        LJJI();
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public Bundle LJJLIIIJLLLLLLLZ() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final void LJJLJ() {
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public Aweme LJJLL() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final void LJLI() {
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final void LJLIIIL() {
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final void LJLIIL() {
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final void LIZ() {
        C01U6.LIZIZ(new AwS572S0100000_28(this, 565));
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final void LIZJ() {
        C01U6.LIZ(0L, new AwS572S0100000_28(EnumC1895270zQ5.TYPE_LOGIN, 711));
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final InterfaceC1904907d9 LIZLLL() {
        return C1893780zNg.LIZIZ.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final void LJ() {
        C01U6.LIZ(0L, new AwS572S0100000_28(EnumC1895270zQ5.TYPE_LOGOUT, 711));
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final List<InterfaceC1904907d9> LJFF() {
        return C1893780zNg.LIZIZ.LJFF();
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final void LJII() {
        C01U6.LIZIZ(new C1895450zQN(this));
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final void LJIIIZ() {
        C01U6.LIZ(0L, new AwS572S0100000_28(EnumC1895270zQ5.TYPE_SWITCH, 711));
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final boolean LJIIJ() {
        return ((Keva) C1906000zhO.LIZIZ.getValue().LIZ.getValue()).getBoolean("use_local_time", false);
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final boolean LJIILIIL() {
        return ((Boolean) C01U6.LJ(AFwS217S0000000_28.get$arr$(387), Boolean.FALSE)).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final void LJIILJJIL() {
        C01U6.LIZIZ(new AwS572S0100000_28(this, 566));
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final M2InstallHeaderInterceptor LJIILLIIL() {
        if (((Boolean) C1930707hJ.LIZ.getValue()).booleanValue()) {
            return new M2InstallHeaderInterceptor();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final void LJIJJ() {
        String str;
        String str2;
        SparkPreloadModel sparkPreloadModel;
        C1537060q6K c1537060q6K = C1529590puH.LIZ;
        SparkOptimizationModel sparkOptimizationModel = (SparkOptimizationModel) C305900Byu.LIZIZ.getValue();
        if (sparkOptimizationModel == null || (sparkPreloadModel = sparkOptimizationModel.sparkPreloadModel) == null || (str = sparkPreloadModel.biz) == null) {
            str = "spark_default_preload_biz";
        }
        C1537060q6K.LJIILL(str);
        C1546500qLY c1546500qLY = C1546560qLe.LIZ;
        SparkReUseModel sparkReUseModelLIZ = C305900Byu.LIZ();
        if (sparkReUseModelLIZ == null || (str2 = sparkReUseModelLIZ.biz) == null) {
            str2 = "spark_default_reuse_biz";
        }
        c1546500qLY.getClass();
        C1546500qLY.LJIIIIZZ(str2);
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final Map<String, String> LJJ() {
        return (Map) C01U6.LJ(AFwS217S0000000_28.get$arr$(383), null);
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final void LJJI() {
        boolean zLIZ;
        String str;
        Collection collection;
        List<String> list;
        SparkReUseModel sparkReUseModelLIZ;
        Boolean boolValueOf;
        if (this.LJFF) {
            return;
        }
        this.LJFF = true;
        boolean z = false;
        if (C1253204vK.LIZ() && Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).contains("incentive_preload_flag") && (boolValueOf = Boolean.valueOf(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getBoolean("incentive_preload_flag", false))) != null) {
            zLIZ = boolValueOf.booleanValue();
        } else {
            SettingsManager.LIZLLL().getClass();
            zLIZ = SettingsManager.LIZ("incentive_preload_flag", false);
        }
        if (zLIZ && (sparkReUseModelLIZ = C305900Byu.LIZ()) != null && sparkReUseModelLIZ.enable) {
            z = true;
        }
        InterfaceC1910807e6.LIZ.getClass();
        InterfaceC1910807e6 interfaceC1910807e6LIZ = C1910707e5.LIZ();
        boolean zLIZ2 = interfaceC1910807e6LIZ != null ? interfaceC1910807e6LIZ.LIZ() : true;
        if (z && zLIZ2) {
            C1546500qLY c1546500qLY = C1546560qLe.LIZ;
            C1546510qLZ c1546510qLZ = new C1546510qLZ();
            c1546510qLZ.LIZ = true;
            SparkReUseModel sparkReUseModelLIZ2 = C305900Byu.LIZ();
            c1546510qLZ.LIZLLL = sparkReUseModelLIZ2 != null ? sparkReUseModelLIZ2.volumn : Integer.MAX_VALUE;
            SparkReUseModel sparkReUseModelLIZ3 = C305900Byu.LIZ();
            if (sparkReUseModelLIZ3 == null || (str = sparkReUseModelLIZ3.biz) == null) {
                str = "spark_default_reuse_biz";
            }
            c1546510qLZ.LJFF = str;
            SparkReUseModel sparkReUseModelLIZ4 = C305900Byu.LIZ();
            c1546510qLZ.LJI = sparkReUseModelLIZ4 != null ? sparkReUseModelLIZ4.expiredTimeInSeconds : -1;
            c1546510qLZ.LJIIIZ = new AwS626S0100000_12(this, 43);
            SparkReUseModel sparkReUseModelLIZ5 = C305900Byu.LIZ();
            if (sparkReUseModelLIZ5 == null || (collection = sparkReUseModelLIZ5.allowSchemaList) == null) {
                collection = C13BV.INSTANCE;
            }
            C304430BwX.LIZ.getClass();
            c1546510qLZ.LJIIL = C13LP.LJLJI(collection, C304430BwX.LIZ());
            SparkReUseModel sparkReUseModelLIZ6 = C305900Byu.LIZ();
            if (sparkReUseModelLIZ6 == null || (list = sparkReUseModelLIZ6.denySchemaList) == null) {
                list = C13BV.INSTANCE;
            }
            c1546510qLZ.LJIILIIL = list;
            c1546510qLZ.LJIIJ = AFwS229S0000000_2.get$arr$(626);
            Boolean bool = Boolean.FALSE;
            c1546500qLY.getClass();
            C1546500qLY.LJI(c1546510qLZ, bool);
        }
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final boolean LJJIFFI() {
        return ((Number) C0A45.LIZ.getValue()).intValue() == 1;
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final void LJJIIJ() {
        C01U6.LIZIZ(AFwS215S0000000_26.get$arr$(265));
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final void LJJIIZ() {
        C01U6.LIZIZ(AFwS217S0000000_28.get$arr$(386));
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final void LJJIJ() {
        C01U6.LIZIZ(AFwS217S0000000_28.get$arr$(384));
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final C0T3O LJJIJIIJIL() {
        C0T3N.LIZ.getClass();
        return C0T3N.LJIIJ;
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final boolean LJJIJLIJ() {
        C01GW<SpecActPendantManager> c01gw = SpecActPendantManager.LLJJIJIIJIL;
        if (C1894330zOZ.LIZ().LJIIJJI().isPendantShowing()) {
            return true;
        }
        C01GW<FeedTimerPendantManger> c01gw2 = FeedTimerPendantManger.LLJL;
        return C1893440zN8.LIZ().LJJJJJ();
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final void LJJIZ() {
        C01U6.LIZIZ(AFwS217S0000000_28.get$arr$(388));
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final Rect LJJJIL() {
        SpecActWidget specActWidget;
        View currentView;
        C01GW<SpecActPendantManager> c01gw = SpecActPendantManager.LLJJIJIIJIL;
        SpecActPendantManager specActPendantManagerLIZ = C1894330zOZ.LIZ();
        specActPendantManagerLIZ.getClass();
        Rect rect = new Rect();
        InterfaceC1896860zSe interfaceC1896860zSeLJIIJJI = specActPendantManagerLIZ.LJIIJJI();
        if (!(interfaceC1896860zSeLJIIJJI instanceof SpecActWidget) || (specActWidget = (SpecActWidget) interfaceC1896860zSeLJIIJJI) == null || (currentView = specActWidget.getCurrentView()) == null) {
            return null;
        }
        currentView.getGlobalVisibleRect(rect);
        if (rect.isEmpty()) {
            return null;
        }
        return rect;
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final void LJJJJI() {
        C01U6.LIZIZ(new C1894450zOl());
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final void LJJJJJ() {
        C01U6.LIZIZ(AFwS217S0000000_28.get$arr$(389));
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final void LJJJJZI() {
        C01U6.LIZIZ(AFwS217S0000000_28.get$arr$(385));
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final void LJJJLL() {
        C01U6.LIZIZ(new C1895640zQg());
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final boolean LJJLI() {
        C01GW c01gw = C0BS9.LIZ;
        return Intrinsics.LJFF(c01gw.getValue(), "on") || Intrinsics.LJFF(c01gw.getValue(), "always_on");
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final boolean LJJLIIIJILLIZJL() {
        return ((Number) C0A46.LIZ.getValue()).intValue() == 1;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0Vuw] */
    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final C813040Vuw LJJLIIIJJIZ() {
        return new BroadcastReceiver() { // from class: X.0Vuw
            public static void LIZ(Intent intent) {
                String stringExtra;
                if (Build.VERSION.SDK_INT <= 30 && TextUtils.equals(intent.getAction(), "android.intent.action.CLOSE_SYSTEM_DIALOGS")) {
                    try {
                        stringExtra = intent.getStringExtra("reason");
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        stringExtra = null;
                    }
                    if (Intrinsics.LJFF("homekey", stringExtra)) {
                        C813060Vuy c813060VuyLIZ = C813060Vuy.LIZ();
                        AbstractC813050Vux abstractC813050Vux = (AbstractC813050Vux) ((HashMap) c813060VuyLIZ.LIZ).get("attract_user_without_login_home");
                        if (abstractC813050Vux != null) {
                            if (c813060VuyLIZ.LIZIZ == null) {
                                try {
                                    if (C813030Vuv.LIZIZ == null) {
                                        synchronized (C813030Vuv.class) {
                                            try {
                                                if (C813030Vuv.LIZIZ == null) {
                                                    C813030Vuv.LIZIZ = new C813030Vuv();
                                                }
                                            } finally {
                                                TryCatchGuardChecker.doCheck(th);
                                            }
                                        }
                                    }
                                    C813030Vuv c813030Vuv = C813030Vuv.LIZIZ;
                                    C844470XAv.LIZ.getClass();
                                    c813060VuyLIZ.LIZIZ = new JSONObject((String) c813030Vuv.LIZLLL(C844470XAv.LIZ(), String.class, "ab_test_model"));
                                } catch (Exception th) {
                                    return;
                                }
                            }
                            Object objOpt = c813060VuyLIZ.LIZIZ.opt("attract_user_without_login_home");
                            if (objOpt == null) {
                                objOpt = abstractC813050Vux.LIZIZ();
                            }
                            abstractC813050Vux.LIZ(objOpt);
                        }
                    }
                }
            }

            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context, Intent intent) {
                if (!C2214201BlK.LJIIJJI && intent != null) {
                    if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                        C2188191AkT.LIZIZ();
                    }
                }
                if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                    LIZ(intent);
                } else {
                    C2408409cA.LIZ();
                    LIZ(intent);
                }
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final void LJJLIIJ() {
        C01U6.LIZIZ(new C0W42());
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final void LJJZ() {
        C01U6.LIZ(1000L, new C1896150zRV());
        if (this.LIZLLL) {
            this.LIZLLL = false;
        } else {
            C01U6.LIZIZ(new AwS572S0100000_28(this, 567));
            C01U6.LIZJ(AFwS189S0000000_3.get$arr$(551));
        }
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final boolean LJJZZI() {
        return Intrinsics.LJFF(C0BS9.LIZ.getValue(), "always_on");
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final void LJJZZIII() {
        C01U6.LIZIZ(new C1895590zQb());
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final boolean LJL() {
        AccountUserService accountUserServiceLJIIJ;
        C612910O2f.LIZ.getClass();
        IAccountService iAccountService = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null);
        String curUserId = (iAccountService == null || (accountUserServiceLJIIJ = iAccountService.LJIIJ()) == null) ? null : accountUserServiceLJIIJ.getCurUserId();
        Keva keva = C612910O2f.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("key_stem_status");
        sbLIZ.append(curUserId);
        return keva.getBoolean(C2188811AlT.LIZIZ(sbLIZ), true);
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final Rect LJLIL() {
        C01GW<FeedTimerPendantManger> c01gw = FeedTimerPendantManger.LLJL;
        FeedTimerPendantManger feedTimerPendantMangerLIZ = C1893440zN8.LIZ();
        if (feedTimerPendantMangerLIZ.LLIZ != null) {
            Rect rect = new Rect();
            C1898700zVc c1898700zVc = feedTimerPendantMangerLIZ.LLIZ;
            if (c1898700zVc != null) {
                c1898700zVc.getGlobalVisibleRect(rect);
            }
            if (!rect.isEmpty()) {
                return rect;
            }
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final boolean LJJJJLI() {
        try {
            SettingsManager.LIZLLL().getClass();
            return SettingsManager.LIZ("need_call_user_agreement_and_ugc_popup", true);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final void LJIILL() {
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final void LJIJJLI() {
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final void LJJII() {
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final void LJJIJIIJI() {
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final C1898260zUu LJJLIIIJLJLI() {
        return C1898260zUu.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final void LJLILLLLZI() {
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final void LJIIIIZZ(Aweme aweme) {
        C01U6.LIZIZ(new AwS572S0100000_28(aweme, 568));
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final void LJIIZILJ(AwS568S0100000_24 awS568S0100000_24) {
        C01U6.LIZIZ(new AwS572S0100000_28(awS568S0100000_24, 710));
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final void LJIJI(Aweme aweme) {
        C01U6.LIZIZ(new C1896160zRW(this, aweme));
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final void LJJIJL(String str) {
        C01U6.LIZIZ(new AwS177S1100000_28(str, this, 6));
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final void LJJJLIIL(boolean z) {
        C01U6.LIZIZ(new AwS64S0010000_28(z, 1));
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final void LJJJLZIJ(C1581680rGI c1581680rGI) {
        C01U6.LIZIZ(new C1700670uMD(c1581680rGI));
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final void LJJLIIIIJ(String str) {
        try {
            C1896230zRd.LIZ("Facebook Ads", new JSONObject(str).get("campaign_group_name").toString(), "fb", "", AFwS217S0000000_28.get$arr$(382));
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final boolean LJJLIIIJJI(String str) {
        int i = C1895670zQj.LIZ;
        return C1895680zQk.LIZ.getBoolean(str, false);
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final void LJJLJLI(Context context) {
        C01U6.LIZIZ(new C815390Vyj(context));
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final void LIZIZ(String str, String str2) {
        C01U6.LIZIZ(new C1895620zQe());
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final void LJIIJJI(ViewGroup viewGroup, Fragment fragment) {
        C01U6.LIZIZ(new C1895410zQJ(fragment, viewGroup, this));
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final boolean LJIL(Aweme aweme, String str) {
        String str2;
        String cid;
        ArrayList arrayList = new ArrayList();
        List<TextExtraStruct> textExtra = aweme.getTextExtra();
        if (textExtra != null) {
            for (TextExtraStruct textExtraStruct : textExtra) {
                if (textExtraStruct != null && (cid = textExtraStruct.getCid()) != null) {
                    arrayList.add(cid);
                }
            }
        }
        HashMap map = new HashMap();
        ShareOperationInfo shareOperationInfo = aweme.getShareOperationInfo();
        HashMap map2 = null;
        if (shareOperationInfo != null) {
            str2 = shareOperationInfo.incentiveOperationType;
        } else {
            str2 = null;
        }
        if (Intrinsics.LJFF("1", str2)) {
            map.put("incentive_share_text_link_operation_type", "1");
            map2 = map;
        }
        return ((Boolean) C01U6.LJ(new C1893650zNT(str, aweme, arrayList, map2), Boolean.FALSE)).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final void LJJIIJZLJL(String str, String str2) {
        C01U6.LIZIZ(new C1895610zQd());
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final void LJJIJIL(String str, String str2) {
        C1893680zNW.LIZ.getClass();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("url", str);
            jSONObject.put("reason", str2);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        InterfaceC1897260zTI interfaceC1897260zTILIZIZ = C1619720sFe.LIZ.LIZIZ();
        if (interfaceC1897260zTILIZIZ != null) {
            interfaceC1897260zTILIZIZ.LIZIZ("incentive_roma_transition_err", jSONObject);
        }
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final void LJJIL(String str, String str2) {
        C01U6.LIZIZ(new C1895710zQn(this, str, str2));
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final void LJJJJZ(String str, String str2) {
        C01U6.LIZIZ(new AwS112S1000000_28(str, str2, 3));
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final String LJIIL(String str, Integer num, String str2) {
        C1893580zNM.LIZ.getClass();
        return C1893580zNM.LIZLLL(num, str, str2, null, null);
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final void LJJJ(Context context, String str, String str2) {
        C01U6.LIZIZ(new AwS35S2200000_24(context, str, str2, 1));
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final void LJJJJIZL(Uri uri, String str, String str2) {
        C01U6.LIZIZ(new AwS66S2100000_28(uri, str, str2, 1));
    }

    @Override // com.ss.android.ugc.aweme.feed.IFeedSpecActService
    public final void LJI(Context context, Aweme aweme, AwS590S0100000_11 awS590S0100000_11, AwS625S0100000_11 awS625S0100000_11) {
        C01U6.LIZIZ(new AwS156S0400000_28(context, aweme, awS590S0100000_11, awS625S0100000_11, 12));
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final void LJJJI(InterfaceC20660615sy interfaceC20660615sy, String str, int i, boolean z) {
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("close_dynamic_popup_settings", true)) {
            return;
        }
        C01U6.LIZIZ(new C716790S9t(interfaceC20660615sy, str, i, z));
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final void LJJJJJL(int i, Aweme aweme, C2189821An6 c2189821An6, String str) {
        C01U6.LIZIZ(new AwS31S1201000_28(i, aweme, c2189821An6, str, 1));
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final void LJJLIL(int i, Aweme aweme, C2189821An6 c2189821An6, String str) {
        C01U6.LIZIZ(new C1896720zSQ(this, aweme, str, c2189821An6, i));
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final void LJJJJ(String str, String str2, String str3, C10UR c10ur, boolean z) {
        if (z) {
            C01U6.LIZIZ(c10ur);
        } else {
            C01U6.LIZIZ(new AwS12S3100000_28(str, c10ur, str2, str3, 0));
        }
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final void LJJJJL(Aweme aweme, String str, C2189821An6 c2189821An6, int i, int i2) {
        C01U6.LIZIZ(new C1896710zSP(aweme, str, c2189821An6, i, i2));
    }
}
