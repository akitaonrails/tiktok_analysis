package com.ss.android.ugc.aweme.minis.page.main.fragment;

import X.AnonymousClass1520;
import X.AnonymousClass1521;
import X.C0N6N;
import X.C0WXF;
import X.C0WXM;
import X.C0WXN;
import X.C1153280g7K;
import X.C1227904rF;
import X.C123100dR;
import X.C1370970lmR;
import X.C1385460m9o;
import X.C1385540m9w;
import X.C1385550m9x;
import X.C1388940mFQ;
import X.C1389400mGA;
import X.C1389410mGB;
import X.C1389420mGC;
import X.C1389860mGu;
import X.C1395310mPh;
import X.C1397370mT1;
import X.C1397400mT4;
import X.C14M6;
import X.C1504540pFs;
import X.C1504580pFw;
import X.C1504590pFx;
import X.C1528810pt1;
import X.C1529600puI;
import X.C1543490qGh;
import X.C1547430qN3;
import X.C1547450qN5;
import X.C16D3;
import X.C16DL;
import X.C16H2;
import X.C1720106oR;
import X.C1799190wv7;
import X.C1801010wy3;
import X.C1801790wzJ;
import X.C1873320yqg;
import X.C1876970ywZ;
import X.C1876990ywb;
import X.C18RL;
import X.C19378810ri;
import X.C1954807lC;
import X.C19EG;
import X.C1A6Y;
import X.C20226314Cf;
import X.C20335414hc;
import X.C204575153d;
import X.C204579153h;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2190031AnR;
import X.C2192691Arj;
import X.C2194311AuL;
import X.C2194621Auq;
import X.C2194701Auy;
import X.C2194801Av8;
import X.C2194841AvC;
import X.C2195191Avl;
import X.C2195221Avo;
import X.C2195291Avv;
import X.C2195311Avx;
import X.C2195371Aw3;
import X.C2195541AwK;
import X.C2195641AwU;
import X.C2195731Awd;
import X.C2195751Awf;
import X.C2195761Awg;
import X.C2196191AxN;
import X.C2196211AxP;
import X.C2196371Axf;
import X.C2196441Axm;
import X.C2196611Ay3;
import X.C2196981Aye;
import X.C2197011Ayh;
import X.C2197221Az2;
import X.C297050Bkd;
import X.C571330Max;
import X.C602220Njg;
import X.C723850SaN;
import X.C743820TFs;
import X.C786410Ut5;
import X.EnumC1154300g8y;
import X.EnumC1364450lbv;
import X.EnumC1386450mBP;
import X.EnumC2192681Ari;
import X.EnumC2192711Arl;
import X.EnumC2194261AuG;
import X.EnumC2196421Axk;
import X.EnumC992080bvK;
import X.EnumC993920byI;
import X.EnumC993930byJ;
import X.InterfaceC1177504j7;
import X.InterfaceC1214530hi7;
import X.InterfaceC1364710lcL;
import X.InterfaceC1547420qN2;
import X.InterfaceC1549100qPk;
import X.InterfaceC1877250yx1;
import X.InterfaceC204573153b;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import Y.AObserverS236S0100000_34;
import Y.ARunnableS121S0100000_21;
import Y.ARunnableS131S0100000_31;
import Y.ARunnableS134S0100000_34;
import Y.ARunnableS18S1100000_13;
import Y.ARunnableS29S0400000_21;
import Y.ARunnableS54S0300000_21;
import Y.ARunnableS90S0200000_21;
import Y.ARunnableS97S0200000_28;
import android.R;
import android.app.Activity;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import android.view.Window;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateNextRoomPlayer;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.internalshare.api.IInternalShareApi;
import com.ss.android.ugc.aweme.minis.common.SchemaParserData;
import com.ss.android.ugc.aweme.minis.model.MinisMetaResp;
import com.ss.android.ugc.aweme.minis.model.NetworkResponse;
import com.ss.android.ugc.aweme.minis.model.SafeArea;
import com.ss.android.ugc.aweme.minis.page.debug.MiniGameDebugViewModel;
import com.ss.android.ugc.aweme.minis.page.debug.MinisDebugViewModel;
import com.ss.android.ugc.aweme.minis.page.main.fragment.MiniDramaFragment;
import com.ss.android.ugc.aweme.minis.settings.MinisConfigSettings;
import com.ss.android.ugc.aweme.minis.viewmodel.MinisViewModel;
import com.ss.android.ugc.aweme.minis.viewmodel.SingleLiveEvent;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;
import java.lang.ref.WeakReference;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AFwS281S0000000_34;
import kotlin.jvm.internal.AwS422S0200000_21;
import kotlin.jvm.internal.AwS578S0100000_34;
import kotlin.jvm.internal.AwS612S0100000_33;
import kotlin.jvm.internal.AwS613S0100000_34;
import kotlin.jvm.internal.AwS635S0100000_21;
import kotlin.jvm.internal.AwS637S0100000_23;
import kotlin.jvm.internal.AwS641S0100000_27;
import kotlin.jvm.internal.AwS642S0100000_28;
import kotlin.jvm.internal.AwS645S0100000_31;
import kotlin.jvm.internal.AwS648S0100000_34;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes35.dex */
public final class MiniDramaFragment extends MinisFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiglJyYgZjUtLiHELIOSp9JSQlJ2E1OiQrJCo9PGsBICE6DDctJC4VOiQrJCo9PA==";
    public boolean LLLLLLLLLL;
    public PthreadTimer LLLLLLLZIL;
    public TextView LLLLLLZ;
    public TextView LLLLLLZZ;
    public TextView LLLLLZ;
    public C0WXF LLLLZIL;
    public C204579153h LLLLZLL;
    public C16D3 LLLLZLLIL;
    public JSONArray LLLLZLLLI;
    public int LLLZ;
    public AnonymousClass1520 LLLZIL;
    public AnonymousClass1521 LLLZL;
    public final C1395310mPh LLLLLLLLL = new InterfaceC1549100qPk() { // from class: X.0mPh
        /* JADX WARN: Type inference failed for: r5v0, types: [T, com.ss.android.ugc.aweme.minis.model.NetworkResponse] */
        @Override // X.InterfaceC1549100qPk
        public final void LIZ(EnumC1874010yrn enumC1874010yrn, Map map) {
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("h5EventCallback, isSuccess:");
            sbLIZ.append(true);
            sbLIZ.append(", event:");
            sbLIZ.append(enumC1874010yrn);
            C2188811AlT.LIZIZ(sbLIZ);
            if (enumC1874010yrn != null) {
                try {
                    if (C1395320mPi.LIZ[enumC1874010yrn.ordinal()] == 1 && map != null) {
                        MiniDramaFragment miniDramaFragment = this.LIZ;
                        C1227904rF c1227904rF = C1227904rF.LIZ;
                        String strJ3 = C786410Ut5.J3(C2348609Ie.LIZLLL(map));
                        c1227904rF.getClass();
                        MinisMetaResp minisMetaResp = (MinisMetaResp) C1227904rF.LIZIZ(strJ3, MinisMetaResp.class);
                        C259800zU c259800zU = new C259800zU();
                        c259800zU.element = new NetworkResponse(minisMetaResp, 0, false, null, true, null, null);
                        miniDramaFragment.LLJZIJLIL.LIZJ((C19EG) miniDramaFragment.hS(), minisMetaResp.config);
                        C2450909j1.LIZJ(new AwS422S0200000_21(miniDramaFragment, (MiniDramaFragment) c259800zU, (C259800zU<NetworkResponse<MinisMetaResp>>) 44));
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    int i2 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("h5EventCallback, error:");
                    sbLIZ2.append(e);
                    C1720106oR.LIZ("minis-MiniDramaFragment", C2188811AlT.LIZIZ(sbLIZ2));
                }
            }
        }
    };
    public final C1389860mGu LLLLLZIL = new InterfaceC1877250yx1() { // from class: X.0mGu
        @Override // X.InterfaceC1877250yx1
        public final void LIZ() {
        }

        @Override // X.InterfaceC1877250yx1
        public final void LIZIZ() {
        }

        @Override // X.InterfaceC1877250yx1
        public final void LIZJ() {
        }

        @Override // X.InterfaceC1877250yx1
        public final void LIZLLL() {
        }

        @Override // X.InterfaceC1877250yx1
        public final void LJI() {
        }

        @Override // X.InterfaceC1877250yx1
        public final String LJII() {
            return "TikTok-Minis";
        }

        @Override // X.InterfaceC1877250yx1
        public final void LJIIIIZZ() {
        }

        @Override // X.InterfaceC1877250yx1
        public final String LJ() {
            SingleLiveEvent<NetworkResponse<MinisMetaResp>> singleLiveEvent;
            NetworkResponse<MinisMetaResp> value;
            MinisMetaResp minisMetaResp;
            MinisViewModel minisViewModel = this.LIZ.LLJLILLLLZIIL;
            if (minisViewModel == null || (singleLiveEvent = minisViewModel.LLILLJJLI) == null || (value = singleLiveEvent.getValue()) == null || (minisMetaResp = value.data) == null) {
                return null;
            }
            return minisMetaResp.minisUrl;
        }

        @Override // X.InterfaceC1877250yx1
        public final Map<String, String> LJFF() {
            SchemaParserData schemaParserData = this.LIZ.LLJJL;
            if (schemaParserData != null) {
                return schemaParserData.LIZLLL();
            }
            return null;
        }

        @Override // X.InterfaceC1877250yx1
        public final String getTtoclid() {
            SchemaParserData schemaParserData = this.LIZ.LLJJL;
            if (schemaParserData != null) {
                return schemaParserData.LJIIIZ();
            }
            return null;
        }
    };
    public final C2196611Ay3 LLLLLZL = new InterfaceC1547420qN2() { // from class: X.1Ay3
        @Override // X.InterfaceC1547420qN2
        public final void LIZ(InterfaceC1541990qEH interfaceC1541990qEH) {
            String url;
            Activity activityHS;
            Window window;
            View decorView;
            View viewFindViewById;
            SparkContext sparkContext;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("sparkViewCallback, onLoadFinish, isWebEntryPageLoadFinished:");
            sbLIZ.append(this.LIZ.LLLF);
            sbLIZ.append(", spark url:");
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LIZ.LLJ;
            String strLJIJI = null;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
                url = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getUrl();
            } else {
                url = null;
            }
            sbLIZ.append(url);
            sbLIZ.append(", httpurl:");
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 = this.LIZ.LLJ;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 != null && (sparkContext = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2.LLILZLL) != null) {
                strLJIJI = sparkContext.LJIJI();
            }
            sbLIZ.append(strLJIJI);
            C2188811AlT.LIZIZ(sbLIZ);
            if (this.LIZ.hS() == null) {
                int i = C2187451AjH.LIZ;
                return;
            }
            C2196401Axi.LIZ(this.LIZ.LLJL);
            boolean z = interfaceC1541990qEH instanceof WebKitView;
            this.LIZ.zS(false);
            MiniDramaFragment miniDramaFragment = this.LIZ;
            if (!miniDramaFragment.LLLF && miniDramaFragment.LLJLLIL == null) {
                C786410Ut5.LJLIIL(200L, new BPEAHandler(Looper.getMainLooper()), new ARunnableS134S0100000_34(this.LIZ, 21));
                this.LIZ.LLLF = true;
            }
            MiniDramaFragment miniDramaFragment2 = this.LIZ;
            if (miniDramaFragment2.LLLFZ && miniDramaFragment2.LLJLLIL == null) {
                miniDramaFragment2.VR();
                this.LIZ.LLLFZ = false;
            }
            if (((this.LIZ.hS() instanceof InterfaceC2196591Ay1) || this.LIZ.LLLIIL) && (activityHS = this.LIZ.hS()) != null && (window = activityHS.getWindow()) != null && (decorView = window.getDecorView()) != null && (viewFindViewById = decorView.findViewById(R.id.navigationBarBackground)) != null) {
                C786410Ut5.LJLLLLLL(8, viewFindViewById);
            }
        }

        @Override // X.InterfaceC1547420qN2
        public final void LIZIZ(String str) {
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("sparkViewCallback, onPageFinished, url:");
            sbLIZ.append(str);
            C2188811AlT.LIZIZ(sbLIZ);
            this.LIZ.hS();
        }

        @Override // X.InterfaceC1547420qN2
        public final void LIZJ(String str) {
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("sparkViewCallback, onPageStarted, url:");
            sbLIZ.append(str);
            C2188811AlT.LIZIZ(sbLIZ);
        }

        @Override // X.InterfaceC1547420qN2
        public final void LIZLLL(String str) {
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onReceivedTitle, title:");
            sbLIZ.append(str);
            C2188811AlT.LIZIZ(sbLIZ);
            if (this.LIZ.hS() == null) {
                return;
            }
            this.LIZ.VS(str);
        }

        @Override // X.InterfaceC1547420qN2
        public final void LJ(InterfaceC1541990qEH interfaceC1541990qEH, String str) {
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("sparkViewCallback, onLoadStart, url:");
            sbLIZ.append(str);
            C2188811AlT.LIZIZ(sbLIZ);
            if (this.LIZ.hS() == null) {
                return;
            }
            MiniDramaFragment miniDramaFragment = this.LIZ;
            miniDramaFragment.LLLF = false;
            miniDramaFragment.LLLIIIL = System.currentTimeMillis();
        }

        @Override // X.InterfaceC1547420qN2
        public final void LJFF(String str, C1542120qEU c1542120qEU) {
            String str2;
            SingleLiveEvent<NetworkResponse<MinisMetaResp>> singleLiveEvent;
            NetworkResponse<MinisMetaResp> value;
            MinisMetaResp minisMetaResp;
            String strLIZ;
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("sparkViewCallback, onLoadFailed, url:");
            sbLIZ.append(str);
            C2188811AlT.LIZIZ(sbLIZ);
            if (this.LIZ.hS() == null) {
                return;
            }
            MiniDramaFragment miniDramaFragment = this.LIZ;
            EnumC1386450mBP enumC1386450mBP = EnumC1386450mBP.ERROR_CANNOT_OPEN_MINIS;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            MiniDramaFragment miniDramaFragment2 = this.LIZ;
            SchemaParserData schemaParserData = miniDramaFragment2.LLJJL;
            String str3 = "";
            if (schemaParserData == null || (str2 = schemaParserData.clientKey) == null) {
                str2 = "";
            }
            linkedHashMap.put("client_key", str2);
            MinisViewModel minisViewModel = miniDramaFragment2.LLJLILLLLZIIL;
            if (minisViewModel != null && (singleLiveEvent = minisViewModel.LLILLJJLI) != null && (value = singleLiveEvent.getValue()) != null && (minisMetaResp = value.data) != null && (strLIZ = minisMetaResp.LIZ()) != null) {
                str3 = strLIZ;
            }
            linkedHashMap.put("log_id", str3);
            linkedHashMap.put("error_code", String.valueOf(c1542120qEU.LIZ));
            linkedHashMap.put("error_reason", String.valueOf(c1542120qEU.LIZIZ));
            linkedHashMap.put("origin_code", String.valueOf(c1542120qEU.LIZJ));
            linkedHashMap.put("origin_reason", String.valueOf(c1542120qEU.LIZLLL));
            miniDramaFragment.uA(enumC1386450mBP, 301, linkedHashMap);
        }

        @Override // X.InterfaceC1547420qN2
        public final void onProgressChanged(WebView webView, int i) {
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("sparkViewCallback, onProgressChanged, newProgress:");
            sbLIZ.append(i);
            C2188811AlT.LIZIZ(sbLIZ);
            if (this.LIZ.hS() != null && i == 100) {
                this.LIZ.ES(webView);
            }
        }
    };
    public int LLLLZ = 2999;
    public int LLLLZI = LivePreCreateNextRoomPlayer.ENABLE;
    public final Map<String, C20335414hc> LLLZI = new LinkedHashMap();
    public final AwS645S0100000_31 LLLZIIL = new AwS645S0100000_31(this, 51);

    @Override // X.InterfaceC2197061Aym
    public final Boolean Fy() {
        return null;
    }

    @Override // X.InterfaceC2197061Aym
    public final boolean Ie() {
        return false;
    }

    @Override // X.InterfaceC2197061Aym
    public final void f6() {
    }

    @Override // X.InterfaceC2197061Aym
    public final boolean gO() {
        return false;
    }

    public final void jT() {
        BS(false);
        if (this.LLLLZ > 50000) {
            return;
        }
        C204579153h c204579153h = new C204579153h(this.LLLLZ, AFwS276S0000000_31.get$arr$(159), new AwS578S0100000_34(this, 41), new AwS613S0100000_34(this, 31), new AwS645S0100000_31(this, 50), AFwS276S0000000_31.get$arr$(251));
        this.LLLLZLL = c204579153h;
        try {
            c204579153h.LJJJI();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // X.InterfaceC2197061Aym
    public final boolean jt() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.minis.page.main.fragment.MinisFragment
    public final void UR() throws JSONException {
        SingleLiveEvent<NetworkResponse<MinisMetaResp>> singleLiveEvent;
        C2196441Axm stage;
        int i = C2187451AjH.LIZ;
        Activity activityHS = hS();
        if (activityHS == null) {
            return;
        }
        this.LLLJIL = false;
        View view = getView();
        if (view != null) {
            C1A6Y.LIZJ(view, this.LLLJIL);
        }
        JS();
        C19EG c19eg = (C19EG) activityHS;
        C18RL c18rl = new C18RL(c19eg);
        this.LLL = c18rl;
        c18rl.LIZ();
        C2195221Avo.LJIIIIZZ(activityHS);
        C2195221Avo.LJIIJ(this);
        SchemaParserData schemaParserDataFS = FS();
        this.LLJJL = schemaParserDataFS;
        this.LLJJLIIIJLLLLLLLZ = schemaParserDataFS;
        if (((Number) C297050Bkd.LIZ.getValue()).intValue() > 0) {
            C1529600puI c1529600puI = C1529600puI.LIZ;
            EnumC992080bvK enumC992080bvK = EnumC992080bvK.ENTER_MINIS;
            SchemaParserData schemaParserData = this.LLJJL;
            String enterFrom = schemaParserData != null ? schemaParserData.getEnterFrom() : "";
            c1529600puI.getClass();
            C1529600puI.LIZIZ(enumC992080bvK, enterFrom);
            C1528810pt1.LIZ();
        }
        C2195221Avo.LJIILIIL(this.LLJJL);
        C2195221Avo.LJIIL(this.LLJL);
        SchemaParserData schemaParserData2 = this.LLJJL;
        if ((schemaParserData2 != null ? schemaParserData2.minisStage : null) != EnumC2192711Arl.MINIS_STAGE_DEBUG) {
            this.LLJLILLLLZIIL = (MinisViewModel) ViewModelProviders.of(this).get(MinisViewModel.class);
        } else {
            if (C2197221Az2.LIZ(schemaParserData2 != null ? schemaParserData2.clientKey : null)) {
                this.LLJLILLLLZIIL = (MinisViewModel) ViewModelProviders.of(this).get(MiniGameDebugViewModel.class);
            } else {
                this.LLJLILLLLZIIL = (MinisViewModel) ViewModelProviders.of(this).get(MinisDebugViewModel.class);
            }
        }
        MinisViewModel minisViewModel = this.LLJLILLLLZIIL;
        if (minisViewModel != null) {
            minisViewModel.BQ2(this.LLJLIL);
        }
        C2196371Axf c2196371Axf = this.LLJL;
        if (c2196371Axf != null && (stage = c2196371Axf.getStage(EnumC2196421Axk.ACTIVITY_CREATE)) != null) {
            stage.setEndTime(System.currentTimeMillis());
            stage.setSuccess(true);
            C2196371Axf c2196371Axf2 = this.LLJL;
            if (c2196371Axf2 != null) {
                c2196371Axf2.recordStage(stage);
            }
        }
        uS();
        C2190031AnR c2190031AnRSS = sS();
        C2195221Avo.LJIIJJI(this.LLJ);
        this.LLJLLL.LIZ(this.LLJ, this.LLJILLL, new InterfaceC1214530hi7() { // from class: X.1Axx
            @Override // X.InterfaceC1214530hi7
            public final void LIZ(SafeArea safeArea) {
                MiniDramaFragment miniDramaFragment = this.LIZ;
                miniDramaFragment.LLJZ = safeArea;
                miniDramaFragment.He(safeArea);
            }
        });
        C2195221Avo.LJIIJJI(this.LLJ);
        kT();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("bindViewModel, minisViewModel:");
        sbLIZ.append(this.LLJLILLLLZIIL);
        C2188811AlT.LIZIZ(sbLIZ);
        MinisViewModel minisViewModel2 = this.LLJLILLLLZIIL;
        if (minisViewModel2 != null && (singleLiveEvent = minisViewModel2.LLILLJJLI) != null) {
            singleLiveEvent.observe(getViewLifecycleOwner(), new AObserverS236S0100000_34(this, 34));
        }
        SchemaParserData schemaParserData3 = this.LLJJL;
        if ((schemaParserData3 != null ? schemaParserData3.minisStage : null) == EnumC2192711Arl.MINIS_STAGE_MINIS_DEBUG) {
            jT();
        } else {
            qS(c2190031AnRSS);
            SchemaParserData schemaParserData4 = this.LLJJL;
            String strLJIIIZ = schemaParserData4 != null ? schemaParserData4.LJIIIZ() : null;
            if (c2190031AnRSS.LIZ) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("ttoclid", strLJIIIZ);
                jSONObject.put("isHotLoad", true);
                C20226314Cf.LIZ(this.LLJ, jSONObject);
            }
            EnumC2192681Ari enumC2192681Ari = c2190031AnRSS.LIZIZ;
            if (enumC2192681Ari == EnumC2192681Ari.HOT_LOAD || enumC2192681Ari == EnumC2192681Ari.MAIN_FRAME_PRELOAD) {
                C1547430qN3 c1547430qN3 = C1547430qN3.LIZ;
                SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLJ;
                c1547430qN3.getClass();
                C1547430qN3.LJIJI(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB);
            }
            C2196211AxP c2196211AxP = this.LLLIILIL;
            SchemaParserData schemaParserData5 = this.LLJJL;
            c2196211AxP.getClass();
            if (!C2196211AxP.LIZIZ(schemaParserData5)) {
                uA(EnumC1386450mBP.ERROR_CANNOT_OPEN_MINIS, 102, null);
            }
            if (this.LLJLLIL == null) {
                C14M6.LIZJ(c19eg, c19eg);
            }
        }
        super.UR();
    }

    public final void iT() {
        Activity activityHS;
        String str;
        String str2;
        JSONArray jSONArray;
        Map<String, String> map;
        String str3;
        Map<String, String> map2;
        Map<String, String> map3;
        Activity activity;
        if (this.LLLLZI <= 50000 && (activityHS = hS()) != null) {
            C0WXF c0wxf = new C0WXF(this.LLLLZI, (C19EG) activityHS, C0WXM.MINIS_SERVER, new C0WXN() { // from class: X.0mGv
                @Override // X.C0WXN
                public final String LIZ(int i, String str4, String str5) {
                    return "";
                }

                @Override // X.C0WXN
                public final void LIZIZ(String str4) {
                }

                @Override // X.C0WXN
                public final String LJ() {
                    return "";
                }

                @Override // X.C0WXN
                public final void LJFF(byte[] bArr, Function1<? super byte[], Unit> function1) {
                }

                /* JADX WARN: Type inference failed for: r0v4, types: [T, java.lang.Object] */
                @Override // X.C0WXN
                public final void LIZLLL(String str4) {
                    if (C123100dR.LIZ(str4)) {
                        C259800zU c259800zU = new C259800zU();
                        C1227904rF.LIZ.getClass();
                        c259800zU.element = C1227904rF.LIZIZ(str4, MinisMetaResp.class);
                        Activity activityHS2 = this.LIZ.hS();
                        if (activityHS2 != null) {
                            activityHS2.runOnUiThread(new ARunnableS90S0200000_21(c259800zU, this.LIZ, 17));
                        }
                    }
                    Activity activityHS3 = this.LIZ.hS();
                    if (activityHS3 != null) {
                        activityHS3.runOnUiThread(new ARunnableS121S0100000_21(this.LIZ, 77));
                    }
                }

                @Override // X.C0WXN
                public final void LIZJ(String str4, C0WXR c0wxr) {
                    if (Intrinsics.LJFF(str4, "start")) {
                        c0wxr.LIZ();
                    }
                }
            });
            this.LLLLZIL = c0wxf;
            try {
                c0wxf.LJ();
                try {
                    List listLIZ = C743820TFs.LIZ();
                    String string = ((ArrayList) listLIZ).size() == 1 ? (String) ListProtector.get(listLIZ, 0) : listLIZ.toString();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("IP: ");
                    sbLIZ.append(string);
                    sbLIZ.append(" \nPort 1: ");
                    sbLIZ.append(this.LLLLZI);
                    sbLIZ.append(" \nPort 2: ");
                    sbLIZ.append(this.LLLLZ);
                    sbLIZ.append(" \n");
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    C2196981Aye c2196981Aye = this.LLJJJ;
                    if (c2196981Aye != null && (activity = c2196981Aye.LIZ) != null) {
                        activity.runOnUiThread(new ARunnableS18S1100000_13(c2196981Aye, strLIZIZ, 17));
                    }
                    this.LLLLZLLLI = null;
                    this.LLLZ = 0;
                    SchemaParserData schemaParserData = this.LLJJL;
                    String str4 = "";
                    if (schemaParserData == null || (map3 = schemaParserData.paramsMap) == null || (str = map3.get("host")) == null) {
                        str = "";
                    }
                    SchemaParserData schemaParserData2 = this.LLJJL;
                    if (schemaParserData2 == null || (map2 = schemaParserData2.paramsMap) == null || (str2 = map2.get("host_list")) == null) {
                        str2 = "";
                    }
                    if (str2.length() > 0) {
                        this.LLLLZLLLI = new JSONArray(str2);
                    }
                    SchemaParserData schemaParserData3 = this.LLJJL;
                    if (schemaParserData3 != null && (map = schemaParserData3.paramsMap) != null && (str3 = map.get("port")) != null) {
                        str4 = str3;
                    }
                    if (this.LLLLZLLLI == null) {
                        if (C123100dR.LIZ(str)) {
                            hT(str, str4);
                            return;
                        }
                        return;
                    }
                    if (C123100dR.LIZ(str) && (jSONArray = this.LLLLZLLLI) != null) {
                        jSONArray.put(str);
                    }
                    JSONArray jSONArray2 = this.LLLLZLLLI;
                    if (jSONArray2 != null) {
                        int length = jSONArray2.length();
                        int i = this.LLLZ;
                        if (length > i) {
                            Object obj = jSONArray2.get(i);
                            this.LLLZ++;
                            hT(obj.toString(), str4);
                        }
                    }
                } catch (URISyntaxException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                this.LLLLZI += 100;
                iT();
            }
        }
    }

    @Override // X.InterfaceC2197061Aym
    public final void j5() {
        MinisConfigSettings.Debug debug;
        SchemaParserData schemaParserData = this.LLJJL;
        if ((schemaParserData != null ? schemaParserData.minisStage : null) == EnumC2192711Arl.MINIS_STAGE_DEBUG && (debug = MinisConfigSettings.LIZ().debug) != null && debug.fetchMetaWithDebugMetaUpdateJsb) {
            WeakReference<InterfaceC1549100qPk> weakReference = C1873320yqg.LLILLL;
            C1873320yqg.LLILLL = new WeakReference<>(this.LLLLLLLLL);
        }
    }

    public final void kT() {
        MinisConfigSettings.Debug debug;
        this.LLLIILIL.getClass();
        C2196211AxP.LJI();
        C1543490qGh.LIZIZ(C1876990ywb.class, null, 6);
        C1543490qGh.LIZIZ(C1876970ywZ.class, null, 6);
        C1543490qGh.LIZIZ(C1504540pFs.class, null, 6);
        C1543490qGh.LIZIZ(C2194311AuL.class, null, 6);
        C1543490qGh.LIZIZ(C1397370mT1.class, null, 6);
        C1543490qGh.LIZIZ(C2196191AxN.class, null, 6);
        C1543490qGh.LIZIZ(C2195291Avv.class, null, 6);
        C1543490qGh.LIZIZ(C602220Njg.class, null, 6);
        C1543490qGh.LIZIZ(C1799190wv7.class, null, 6);
        SchemaParserData schemaParserData = this.LLJJL;
        if ((schemaParserData != null ? schemaParserData.minisStage : null) == EnumC2192711Arl.MINIS_STAGE_DEBUG && (debug = MinisConfigSettings.LIZ().debug) != null && debug.fetchMetaWithDebugMetaUpdateJsb) {
            WeakReference<InterfaceC1549100qPk> weakReference = C1873320yqg.LLILLL;
            C1873320yqg.LLILLL = new WeakReference<>(this.LLLLLLLLL);
            C1543490qGh.LIZIZ(C1873320yqg.class, null, 6);
        }
    }

    @Override // X.InterfaceC2197061Aym
    public final String qc() {
        WebView webView;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLJ;
        Object kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null ? sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getKitView() : null;
        if (!(kitView instanceof WebKitView) || (webView = (WebView) kitView) == null) {
            return null;
        }
        return webView.getUrl();
    }

    @Override // X.InterfaceC1378810lz5
    public final void Kr() {
        Activity activityHS = hS();
        if (activityHS != null) {
            C204575153d.LJFF((C19EG) activityHS, new InterfaceC204573153b() { // from class: X.1Axy
                @Override // X.InterfaceC204573153b
                public final void LIZIZ(boolean z) {
                }

                @Override // X.InterfaceC204573153b
                public final void f0() {
                }

                @Override // X.InterfaceC204573153b
                public final boolean LIZJ() {
                    return this.LIZ.LLLLLLLLLL;
                }

                @Override // X.InterfaceC204573153b
                public final void LIZ(boolean z) {
                    this.LIZ.lT(z);
                }
            });
        }
    }

    @Override // com.ss.android.ugc.aweme.minis.page.main.fragment.MinisFragment
    public final void oS() throws JSONException {
        SingleLiveEvent<NetworkResponse<MinisMetaResp>> singleLiveEvent;
        NetworkResponse<MinisMetaResp> value;
        super.oS();
        C1153280g7K c1153280g7KLIZJ = this.LLLIILIL.LIZJ(qc());
        MinisViewModel minisViewModel = this.LLJLILLLLZIIL;
        NetworkResponse networkResponse = (minisViewModel == null || (singleLiveEvent = minisViewModel.LLILLJJLI) == null || (value = singleLiveEvent.getValue()) == null) ? null : (NetworkResponse) C571330Max.LIZ(value);
        C1547430qN3 c1547430qN3 = C1547430qN3.LIZ;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLJ;
        c1547430qN3.getClass();
        C1547430qN3.LJIIIIZZ(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, networkResponse, c1153280g7KLIZJ);
        qS(new C2190031AnR(true, EnumC2192681Ari.HOT_LOAD));
        SchemaParserData schemaParserData = this.LLJJL;
        String strLJIIIZ = schemaParserData != null ? schemaParserData.LJIIIZ() : null;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("ttoclid", strLJIIIZ);
        jSONObject.put("isHotLoad", true);
        C20226314Cf.LIZ(this.LLJ, jSONObject);
    }

    @Override // com.ss.android.ugc.aweme.minis.page.main.fragment.MinisFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        PthreadTimer pthreadTimer = this.LLLLLLLZIL;
        if (pthreadTimer != null) {
            pthreadTimer.cancel();
        }
        PthreadTimer pthreadTimer2 = this.LLLLLLLZIL;
        if (pthreadTimer2 != null) {
            pthreadTimer2.purge();
        }
        this.LLLLLLLZIL = null;
        try {
            C0WXF c0wxf = this.LLLLZIL;
            if (c0wxf != null) {
                c0wxf.LJFF();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            int i = C2187451AjH.LIZ;
            C1720106oR.LIZIZ("minis-MiniDramaFragment", "stopDebugServers, stop httpServer failed", e);
        }
        this.LLLLZIL = null;
        try {
            C204579153h c204579153h = this.LLLLZLL;
            if (c204579153h != null) {
                c204579153h.LJJJIL(0, "");
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            int i2 = C2187451AjH.LIZ;
            C1720106oR.LIZIZ("minis-MiniDramaFragment", "stopDebugServers, stop webSocketServer failed", e2);
        }
        this.LLLLZLL = null;
        try {
            C16D3 c16d3 = this.LLLLZLLIL;
            if (c16d3 != null) {
                c16d3.close();
            }
        } catch (Exception e3) {
            TryCatchGuardChecker.doCheck(e3);
            int i3 = C2187451AjH.LIZ;
            C1720106oR.LIZIZ("minis-MiniDramaFragment", "stopDebugServers, close webSocketSender failed", e3);
        }
        this.LLLLZLLIL = null;
        this.LLLZIL = null;
        this.LLLZL = null;
        this.LLLLZ = 2999;
        this.LLLLZI = LivePreCreateNextRoomPlayer.ENABLE;
    }

    @Override // X.InterfaceC2197061Aym
    public final InterfaceC1547420qN2 Rz() {
        return this.LLLLLZL;
    }

    @Override // X.InterfaceC2197061Aym
    public final InterfaceC1877250yx1 SM() {
        return this.LLLLLZIL;
    }

    @Override // X.InterfaceC2197061Aym
    public final void He(SafeArea safeArea) {
        int i = C2187451AjH.LIZ;
        if (this.LLJZIJLIL.LIZLLL == EnumC993920byI.CUSTOM && MinisConfigSettings.LIZ().supportedGlobalProps.contains("capsuleButtonLayout") && safeArea != null) {
            C1227904rF.LIZ.getClass();
            try {
                JSONObject jSONObject = new JSONObject(C1227904rF.LJI(safeArea));
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("capsuleButtonLayout", jSONObject);
                C1547430qN3 c1547430qN3 = C1547430qN3.LIZ;
                SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLJ;
                c1547430qN3.getClass();
                C1547430qN3.LJIILLIIL(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, linkedHashMap);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    @Override // X.InterfaceC2197061Aym
    public final C1547450qN5 RP(MinisViewModel minisViewModel) {
        SingleLiveEvent<NetworkResponse<MinisMetaResp>> singleLiveEvent;
        if (minisViewModel != null) {
            singleLiveEvent = minisViewModel.LLILLJJLI;
        } else {
            singleLiveEvent = null;
        }
        return new C1547450qN5(singleLiveEvent);
    }

    public final void lT(boolean z) {
        FrameLayout frameLayout;
        SingleLiveEvent<NetworkResponse<MinisMetaResp>> singleLiveEvent;
        NetworkResponse<MinisMetaResp> value;
        MinisMetaResp minisMetaResp;
        View view = this.LLLIL;
        if (view != null) {
            frameLayout = (FrameLayout) view.findViewById(com.zhiliaoapp.musically.R.id.oeh);
        } else {
            frameLayout = null;
        }
        if (z) {
            if (frameLayout != null) {
                C786410Ut5.LJZ(0, frameLayout);
            }
            this.LLLLLLLLLL = true;
            if (this.LLLLLLLZIL == null) {
                PthreadTimer pthreadTimer = new PthreadTimer("MinisDramaDebugInfoTimer", true);
                this.LLLLLLLZIL = pthreadTimer;
                pthreadTimer.schedule(new C16H2(this, 1), 0L, 1000L);
            }
        } else {
            if (frameLayout != null) {
                C786410Ut5.LJZ(8, frameLayout);
            }
            this.LLLLLLLLLL = false;
            PthreadTimer pthreadTimer2 = this.LLLLLLLZIL;
            if (pthreadTimer2 != null) {
                pthreadTimer2.cancel();
            }
            PthreadTimer pthreadTimer3 = this.LLLLLLLZIL;
            if (pthreadTimer3 != null) {
                pthreadTimer3.purge();
            }
            this.LLLLLLLZIL = null;
        }
        MinisViewModel minisViewModel = this.LLJLILLLLZIIL;
        if (minisViewModel != null && (singleLiveEvent = minisViewModel.LLILLJJLI) != null && (value = singleLiveEvent.getValue()) != null && (minisMetaResp = value.data) != null) {
            Integer num = minisMetaResp.clientKeyType;
            int iOrdinal = EnumC1154300g8y.CLIENT_KEY_TYPE_SANDBOX.ordinal();
            if (num != null && num.intValue() == iOrdinal) {
                C2197011Ayh.LIZ.getClass();
                C2197011Ayh.LIZLLL().storeBoolean("IS_NATIVE_GAME_DEBUG_ENABLE_STATISTICS_LAYER", z);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.minis.page.main.fragment.MinisFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C723850SaN.LIZ(this, false, null, new AwS612S0100000_33(this, 87), 3);
    }

    @Override // com.ss.android.ugc.aweme.minis.page.main.fragment.MinisFragment
    public final void qS(C2190031AnR c2190031AnR) {
        LinkedHashMap<String, String> linkedHashMap;
        String str;
        C19378810ri c19378810ri = C19378810ri.LIZ;
        C0N6N c0n6n = C0N6N.MINIS_AD_PLACEMENT_INTERSTITIAL;
        c19378810ri.getClass();
        C19378810ri.LIZLLL(c0n6n);
        C19378810ri.LIZLLL(C0N6N.MINIS_AD_PLACEMENT_REWARD);
        C2196371Axf c2196371Axf = C2195221Avo.LJIIIZ;
        if (c2196371Axf != null) {
            c2196371Axf.setActivityCreateTime(0L);
            c2196371Axf.setActivityHideTimestamp(0L);
        }
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("initMetaData, sparkView instance sparkViewSource:");
        sbLIZ.append(c2190031AnR);
        C2188811AlT.LIZIZ(sbLIZ);
        String str2 = null;
        C2195191Avl c2195191Avl = new C2195191Avl(EnumC2196421Axk.META_LOAD, false);
        SchemaParserData schemaParserData = C2195221Avo.LJII;
        if (schemaParserData != null) {
            Map<String, String> mapLIZLLL = schemaParserData.LIZLLL();
            linkedHashMap = new LinkedHashMap<>();
            linkedHashMap.putAll(mapLIZLLL);
        } else {
            linkedHashMap = null;
        }
        RS(null, false);
        SchemaParserData schemaParserData2 = this.LLJJL;
        if (schemaParserData2 != null) {
            str = schemaParserData2.clientKey;
        } else {
            str = null;
        }
        IInternalShareApi.LIZ.getClass();
        InterfaceC1364710lcL interfaceC1364710lcLLIZIZ = C1370970lmR.LIZ().LIZIZ();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("minis_client_key:");
        sbLIZ2.append(str);
        interfaceC1364710lcLLIZIZ.LJIJI(C2188811AlT.LIZIZ(sbLIZ2), EnumC1364450lbv.SOURCE_ACTION_MINIS_PANEL.getValue(), null);
        C1547430qN3 c1547430qN3 = C1547430qN3.LIZ;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLJ;
        c1547430qN3.getClass();
        C1547430qN3.LIZJ(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, c2190031AnR);
        int i2 = C2192691Arj.LIZ[c2190031AnR.LIZIZ.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    BS(true);
                    c2195191Avl.setStartTime(System.currentTimeMillis());
                    C2196371Axf c2196371Axf2 = this.LLJL;
                    if (c2196371Axf2 != null) {
                        c2196371Axf2.recordStage(c2195191Avl);
                    }
                    bS(linkedHashMap);
                    return;
                }
                throw new C1954807lC();
            }
            SchemaParserData schemaParserData3 = this.LLJJL;
            if (schemaParserData3 != null) {
                str2 = schemaParserData3.clientKey;
            }
            if (C2197221Az2.LIZ(str2)) {
                RS(EnumC2194261AuG.MAINFRAME_LOAD_SUCCESS, false);
            } else {
                RS(EnumC2194261AuG.LOAD_START, false);
            }
            MinisViewModel minisViewModel = this.LLJLILLLLZIIL;
            if (minisViewModel != null) {
                minisViewModel.yQ2(this.LLJJL, this, linkedHashMap, AFwS281S0000000_34.get$arr$(56));
            }
            c2195191Avl.setStartTime(System.currentTimeMillis());
            C2196371Axf c2196371Axf3 = this.LLJL;
            if (c2196371Axf3 != null) {
                c2196371Axf3.recordStage(c2195191Avl);
            }
            C1547430qN3.LIZ(this.LLJ, this.LLJLILLLLZIIL);
            return;
        }
        BS(false);
        c2195191Avl.setStartTime(System.currentTimeMillis());
        C2196371Axf c2196371Axf4 = this.LLJL;
        if (c2196371Axf4 != null) {
            c2196371Axf4.recordStage(c2195191Avl);
        }
        bS(linkedHashMap);
    }

    @Override // X.InterfaceC2197061Aym
    public final boolean YB(int i, boolean z) {
        return gS(i);
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [X.0m9o, X.0pFx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v13, types: [X.0mFQ, X.0pFx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14, types: [X.0mGB, X.0pFx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15, types: [X.0mGC, X.0pFx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v21, types: [X.0m9w, X.0pFx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v22, types: [X.1520] */
    /* JADX WARN: Type inference failed for: r2v9, types: [X.0mGA, X.0pFx, java.lang.Object] */
    public final void hT(String str, final String str2) {
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ws://");
            sbLIZ.append(str);
            sbLIZ.append(':');
            sbLIZ.append(str2);
            this.LLLLZLLIL = new C16D3(C2188811AlT.LIZIZ(sbLIZ));
            final C204579153h c204579153h = this.LLLLZLL;
            final AwS645S0100000_31 awS645S0100000_31 = this.LLLZIIL;
            this.LLLZIL = new InterfaceC1177504j7(c204579153h, awS645S0100000_31) { // from class: X.1520
                public final C204579153h LIZ;
                public final Function2<? super String, ? super C20335414hc, Boolean> LIZIZ;

                {
                    this.LIZ = c204579153h;
                    this.LIZIZ = awS645S0100000_31;
                }

                @Override // X.InterfaceC1177504j7
                public final void LIZ(String str3, Number number, JSONObject jSONObject) throws JSONException {
                    JSONObject jSONObject2;
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("result");
                    if (jSONObjectOptJSONObject == null || (jSONObject2 = jSONObjectOptJSONObject.optJSONObject("data")) == null) {
                        jSONObject2 = new JSONObject();
                    }
                    int iOptInt = jSONObject.optInt("code");
                    C204579153h c204579153h2 = this.LIZ;
                    if (c204579153h2 != null) {
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("method", str3);
                        JSONObject jSONObject4 = new JSONObject();
                        jSONObject4.put("result", jSONObject2);
                        jSONObject4.put("code", iOptInt);
                        jSONObject3.put("payload", jSONObject4);
                        jSONObject3.put("callbackId", number);
                        jSONObject3.put("timestamp", System.currentTimeMillis());
                        c204579153h2.LJJJJ(C786410Ut5.J3(jSONObject3));
                    }
                }

                @Override // X.InterfaceC1177504j7
                public final void registerJSAPI(String str3, Function2<? super JSONObject, ? super Integer, ? extends JSONObject> function2, Object obj) {
                    this.LIZIZ.invoke(str3, new C20335414hc(function2, obj));
                }
            };
            this.LLLZL = new AnonymousClass1521(c204579153h);
            AnonymousClass1521 anonymousClass1521 = this.LLLZL;
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onMinisDebugRuntimeInstanceCreated, minisDebugRuntime:");
            sbLIZ2.append(anonymousClass1521);
            C2188811AlT.LIZIZ(sbLIZ2);
            C2195221Avo.LJFF = new WeakReference<>(anonymousClass1521);
            C16D3 c16d3 = this.LLLLZLLIL;
            if (c16d3 != null) {
                c16d3.LLJJIJIL = new C16DL() { // from class: X.1Axt
                    @Override // X.C16DL
                    public final void LIZIZ() {
                    }

                    @Override // X.C16DL
                    public final void LIZLLL() {
                    }

                    @Override // X.C16DL
                    public final void LIZ() throws JSONException {
                        if (this.LIZ.hS() != null) {
                            MiniDramaFragment miniDramaFragment = this.LIZ;
                            List listLIZ = C743820TFs.LIZ();
                            if (((ArrayList) listLIZ).isEmpty()) {
                                return;
                            }
                            Object objLJJJJZI = C13LP.LJJJJZI(listLIZ);
                            C16D3 c16d32 = miniDramaFragment.LLLLZLLIL;
                            if (c16d32 != null) {
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("method", "shareDevParams");
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put("host", objLJJJJZI);
                                jSONObject2.put("port", miniDramaFragment.LLLLZI);
                                jSONObject2.put("wsPort", miniDramaFragment.LLLLZ);
                                jSONObject.put("payload", jSONObject2);
                                c16d32.LJJIIZI(C786410Ut5.J3(jSONObject));
                            }
                        }
                    }

                    @Override // X.C16DL
                    public final void LIZJ() throws JSONException {
                        JSONArray jSONArray = this.LIZ.LLLLZLLLI;
                        if (jSONArray != null) {
                            MiniDramaFragment miniDramaFragment = this.LIZ;
                            String str3 = str2;
                            int length = jSONArray.length();
                            int i2 = miniDramaFragment.LLLZ;
                            if (length > i2) {
                                Object obj = jSONArray.get(i2);
                                miniDramaFragment.LLLZ++;
                                miniDramaFragment.hT(obj.toString(), str3);
                            }
                        }
                    }
                };
                c16d3.LJJI();
            }
            Activity activityHS = hS();
            if (activityHS != null) {
                activityHS.runOnUiThread(new ARunnableS121S0100000_21(this, 76));
            }
        } catch (URISyntaxException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        WeakReference weakReference = new WeakReference(this.LLLLLZIL);
        new WeakReference(this);
        Activity activityHS2 = hS();
        if (activityHS2 != null) {
            final WeakReference weakReference2 = new WeakReference(activityHS2);
            final AnonymousClass1520 anonymousClass1520 = this.LLLZIL;
            if (anonymousClass1520 != null) {
                C2195641AwU c2195641AwU = new C2195641AwU(weakReference2, anonymousClass1520, weakReference, false);
                c2195641AwU.LJI("jumpOpenAuthPage", new AwS648S0100000_34(c2195641AwU, 32), c2195641AwU);
                C1385550m9x c1385550m9x = new C1385550m9x(weakReference2, anonymousClass1520);
                c1385550m9x.LJI("minis.sendLog", new AwS635S0100000_21(c1385550m9x, 184), c1385550m9x);
                C2195371Aw3 c2195371Aw3 = new C2195371Aw3(weakReference2, anonymousClass1520, false);
                c2195371Aw3.LJI("minis.pay", new AwS648S0100000_34(c2195371Aw3, 12), c2195371Aw3);
                C2195541AwK c2195541AwK = new C2195541AwK(weakReference2, anonymousClass1520);
                c2195541AwK.LJI("minis.checkBalance", new AwS648S0100000_34(c2195541AwK, 14), c2195541AwK);
                C1801790wzJ c1801790wzJ = new C1801790wzJ(weakReference2, anonymousClass1520, false);
                c1801790wzJ.LJI("minis.openBalance", new AwS641S0100000_27(c1801790wzJ, 92), c1801790wzJ);
                C2195311Avx c2195311Avx = new C2195311Avx(weakReference2, anonymousClass1520, false);
                c2195311Avx.LJI("minis.recharge", new AwS648S0100000_34(c2195311Avx, 13), c2195311Avx);
                C2195751Awf c2195751Awf = new C2195751Awf(weakReference2, anonymousClass1520);
                c2195751Awf.LJI("minis.subscriptionCreate", new AwS642S0100000_28(c2195751Awf, 64), c2195751Awf);
                C2195731Awd c2195731Awd = new C2195731Awd(weakReference2, anonymousClass1520);
                c2195731Awd.LJI("minis.subscriptionChange", new AwS642S0100000_28(c2195731Awd, 66), c2195731Awd);
                C2195761Awg c2195761Awg = new C2195761Awg(weakReference2, anonymousClass1520);
                c2195761Awg.LJI("minis.subscriptionReactive", new AwS642S0100000_28(c2195761Awg, 65), c2195761Awg);
                ?? r2 = new C1504590pFx(weakReference2, anonymousClass1520) { // from class: X.0mGA
                    public final WeakReference<Activity> LIZJ;

                    {
                        super(anonymousClass1520);
                        this.LIZJ = weakReference2;
                    }

                    @Override // X.C1504590pFx
                    public final JSONObject LIZLLL(Number number, JSONObject jSONObject) {
                        super.LIZLLL(number, jSONObject);
                        Activity activity = this.LIZJ.get();
                        if (activity == null) {
                            return C1504590pFx.LIZ(-1, null, "activity is null", new JSONObject());
                        }
                        activity.runOnUiThread(new ARunnableS90S0200000_21(this, jSONObject, number, 42));
                        return C1504590pFx.LIZJ(new JSONObject());
                    }
                };
                r2.LJI("minis.hideRibbon", new AwS635S0100000_21((C1389400mGA) r2, 121), r2);
                C1397400mT4 c1397400mT4 = new C1397400mT4(weakReference2, anonymousClass1520);
                c1397400mT4.LJI("minis.showSurfaceCoupon", new AwS635S0100000_21(c1397400mT4, 120), c1397400mT4);
                C1504580pFw c1504580pFw = new C1504580pFw(weakReference2, anonymousClass1520);
                c1504580pFw.LJI("minis.prefetch", new AwS637S0100000_23(c1504580pFw, 19), c1504580pFw);
                ?? r22 = new C1504590pFx(weakReference2, anonymousClass1520) { // from class: X.0m9o
                    public final WeakReference<Activity> LIZJ;

                    {
                        super(anonymousClass1520);
                        this.LIZJ = weakReference2;
                    }

                    @Override // X.C1504590pFx
                    public final JSONObject LIZLLL(Number number, JSONObject jSONObject) {
                        super.LIZLLL(number, jSONObject);
                        if (jSONObject == null) {
                            return C1504590pFx.LIZ(-1, null, "params is null", new JSONObject());
                        }
                        Activity activity = this.LIZJ.get();
                        if (activity == null) {
                            return C1504590pFx.LIZ(-1, null, "activity is null", new JSONObject());
                        }
                        activity.runOnUiThread(new ARunnableS54S0300000_21(jSONObject, this, number, 17));
                        return C1504590pFx.LIZJ(new JSONObject());
                    }
                };
                r22.LJI("minis.share", new AwS635S0100000_21((C1385460m9o) r22, 189), r22);
                ?? r23 = new C1504590pFx(weakReference2, anonymousClass1520) { // from class: X.0mFQ
                    public final WeakReference<Activity> LIZJ;

                    {
                        super(anonymousClass1520);
                        this.LIZJ = weakReference2;
                    }

                    @Override // X.C1504590pFx
                    public final JSONObject LIZLLL(Number number, JSONObject jSONObject) {
                        super.LIZLLL(number, jSONObject);
                        if (jSONObject == null) {
                            return C1504590pFx.LIZ(-1, null, "params is null", new JSONObject());
                        }
                        Activity activity = this.LIZJ.get();
                        if (activity == null) {
                            return C1504590pFx.LIZ(-1, null, "activity is null", new JSONObject());
                        }
                        activity.runOnUiThread(new ARunnableS29S0400000_21(activity, this, jSONObject, number, 1));
                        return C1504590pFx.LIZJ(new JSONObject());
                    }
                };
                r23.LJI("minis.setNavigationBarColor", new AwS635S0100000_21((C1388940mFQ) r23, 107), r23);
                ?? r24 = new C1504590pFx(weakReference2, anonymousClass1520) { // from class: X.0mGB
                    public final WeakReference<Activity> LIZJ;

                    {
                        super(anonymousClass1520);
                        this.LIZJ = weakReference2;
                    }

                    @Override // X.C1504590pFx
                    public final JSONObject LIZLLL(Number number, JSONObject jSONObject) {
                        super.LIZLLL(number, jSONObject);
                        Activity activity = this.LIZJ.get();
                        if (activity == null) {
                            return C1504590pFx.LIZ(-1, null, "activity is null", new JSONObject());
                        }
                        activity.runOnUiThread(new ARunnableS97S0200000_28(this, jSONObject, number, 42));
                        return C1504590pFx.LIZJ(new JSONObject());
                    }
                };
                r24.LJI("minis.enableCapture", new AwS635S0100000_21((C1389410mGB) r24, 182), r24);
                ?? r25 = new C1504590pFx(weakReference2, anonymousClass1520) { // from class: X.0mGC
                    public final WeakReference<Activity> LIZJ;

                    {
                        super(anonymousClass1520);
                        this.LIZJ = weakReference2;
                    }

                    @Override // X.C1504590pFx
                    public final JSONObject LIZLLL(Number number, JSONObject jSONObject) {
                        super.LIZLLL(number, jSONObject);
                        Activity activity = this.LIZJ.get();
                        if (activity == null) {
                            return C1504590pFx.LIZ(-1, null, "activity is null", new JSONObject());
                        }
                        activity.runOnUiThread(new ARunnableS97S0200000_28(this, jSONObject, number, 43));
                        return C1504590pFx.LIZJ(new JSONObject());
                    }
                };
                r25.LJI("minis.disableCapture", new AwS635S0100000_21((C1389420mGC) r25, 191), r25);
                C2194801Av8 c2194801Av8 = new C2194801Av8(weakReference2, anonymousClass1520, false);
                c2194801Av8.LJI("minis.createRewardedVideoAd", new AwS648S0100000_34(c2194801Av8, 1), c2194801Av8);
                C2194841AvC c2194841AvC = new C2194841AvC(weakReference2, anonymousClass1520, false);
                c2194841AvC.LJI("minis.rewardedVideoAdShow", new AwS648S0100000_34(c2194841AvC, 3), c2194841AvC);
                C2194701Auy c2194701Auy = new C2194701Auy(weakReference2, anonymousClass1520, false);
                int i2 = C2187451AjH.LIZ;
                c2194701Auy.LJI("minis.createInterstitialAd", new AwS648S0100000_34(c2194701Auy, 0), c2194701Auy);
                C2194621Auq c2194621Auq = new C2194621Auq(weakReference2, anonymousClass1520, false);
                int i3 = C2187451AjH.LIZ;
                c2194621Auq.LJI("minis.interstitialAdShow", new AwS648S0100000_34(c2194621Auq, 2), c2194621Auq);
                C1801010wy3 c1801010wy3 = new C1801010wy3(anonymousClass1520);
                c1801010wy3.LJI("minis.getDramaInfo", new AwS641S0100000_27(c1801010wy3, 164), c1801010wy3);
                ?? r26 = new C1504590pFx(anonymousClass1520) { // from class: X.0m9w
                    @Override // X.C1504590pFx
                    public final JSONObject LIZLLL(Number number, JSONObject jSONObject) throws JSONException {
                        super.LIZLLL(number, jSONObject);
                        if (jSONObject == null) {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("error_code", -1);
                            jSONObject2.put("error_msg", "params is null");
                            LJ(number, jSONObject2);
                            return C1504590pFx.LIZ(-1, null, "params is null", new JSONObject());
                        }
                        String strOptString = jSONObject.optString("eventName");
                        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("params");
                        if (strOptString.length() == 0) {
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put("error_code", -1);
                            jSONObject3.put("error_msg", "event name is empty");
                            LJ(number, jSONObject3);
                            return C1504590pFx.LIZ(-1, null, "event name is empty", new JSONObject());
                        }
                        if (jSONObjectOptJSONObject == null) {
                            JSONObject jSONObject4 = new JSONObject();
                            jSONObject4.put("error_code", -1);
                            jSONObject4.put("error_msg", "params is null");
                            LJ(number, jSONObject4);
                            return C1504590pFx.LIZ(-1, null, "params is null", new JSONObject());
                        }
                        C20684815ws.LJIJ(strOptString, jSONObjectOptJSONObject);
                        LJFF(number, new JSONObject());
                        return C1504590pFx.LIZJ(new JSONObject());
                    }
                };
                r26.LJI("x.reportAppLog", new AwS635S0100000_21((C1385540m9w) r26, 106), r26);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.minis.page.main.fragment.MinisFragment
    public final void yS(Fragment fragment, boolean z) {
        Activity activityHS;
        Window window;
        View decorView;
        View viewFindViewById;
        Activity activityHS2;
        Window window2;
        View decorView2;
        View viewFindViewById2;
        super.yS(fragment, z);
        if (z) {
            if (this.LLJZIJLIL.LIZLLL == EnumC993920byI.CUSTOM) {
                this.LLLJIL = true;
                View view = getView();
                if (view != null) {
                    C1A6Y.LIZIZ(view, this.LLLJIL);
                }
                Activity activityHS3 = hS();
                if (activityHS3 != null) {
                    activityHS3.runOnUiThread(new ARunnableS131S0100000_31(this, 211));
                }
            }
            if (this.LLLJIL) {
                TuxNavBar tuxNavBar = this.LLJILJIL;
                if (tuxNavBar != null) {
                    C786410Ut5.LLLLZLLLI(tuxNavBar, 8);
                }
            } else {
                TuxNavBar tuxNavBar2 = this.LLJILJIL;
                if (tuxNavBar2 != null) {
                    C786410Ut5.LLLLZLLLI(tuxNavBar2, 0);
                }
            }
            EnumC2194261AuG enumC2194261AuG = this.LLLIIII;
            if ((enumC2194261AuG == EnumC2194261AuG.LOAD_SUCCESS || enumC2194261AuG == EnumC2194261AuG.LOAD_FAILED) && (activityHS2 = hS()) != null && (window2 = activityHS2.getWindow()) != null && (decorView2 = window2.getDecorView()) != null && (viewFindViewById2 = decorView2.findViewById(R.id.navigationBarBackground)) != null) {
                C786410Ut5.LJLLLLLL(8, viewFindViewById2);
                return;
            }
            return;
        }
        EnumC2194261AuG enumC2194261AuG2 = this.LLLIIII;
        if ((enumC2194261AuG2 != EnumC2194261AuG.LOAD_SUCCESS && enumC2194261AuG2 != EnumC2194261AuG.LOAD_FAILED) || (activityHS = hS()) == null || (window = activityHS.getWindow()) == null || (decorView = window.getDecorView()) == null || (viewFindViewById = decorView.findViewById(R.id.navigationBarBackground)) == null) {
            return;
        }
        C786410Ut5.LJLLLLLL(0, viewFindViewById);
    }

    @Override // X.InterfaceC2197061Aym
    public final int Gw(EnumC993930byJ enumC993930byJ, boolean z, boolean z2) {
        if (enumC993930byJ == EnumC993930byJ.DEFAULT) {
            if (!z) {
                return com.zhiliaoapp.musically.R.drawable.cr3;
            }
            return com.zhiliaoapp.musically.R.drawable.cr2;
        }
        if (!z2) {
            return com.zhiliaoapp.musically.R.drawable.cr1;
        }
        return com.zhiliaoapp.musically.R.drawable.cr2;
    }
}
