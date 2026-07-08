package com.ss.android.ugc.aweme.live;

import X.C011Z;
import X.C0JBU;
import X.C1107670evl;
import X.C1124870fNV;
import X.C1161920gLG;
import X.C1338270kvh;
import X.C13LP;
import X.C13SZ;
import X.C14CD;
import X.C1551940qUK;
import X.C1553010qW3;
import X.C1554340qYC;
import X.C19EG;
import X.C19EH;
import X.C20338414i6;
import X.C20622515mp;
import X.C2188811AlT;
import X.C2450709iz;
import X.C290160BYw;
import X.C294080Bfq;
import X.C487020J8a;
import X.C783810Uot;
import X.InterfaceC20573715ex;
import X.InterfaceC20596815ig;
import X.InterfaceC20597015ii;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.SAFTikTokFragment;
import com.bytedance.android.livesdk.livesetting.broadcast.GeckoDownloadZipObserverABSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveHostFixPortraitCheck;
import com.bytedance.android.livesdk.livesetting.performance.LiveBroadcastSAARecordHostActivity;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.livehostimpl.LiveHostActivityRecorder$startRecord$1;
import com.ss.android.ugc.aweme.live.smoothhost.LiveMultiTabWrapperActivity;
import com.ss.android.ugc.aweme.ttlive.settings.LiveBrightnessConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes32.dex */
public class BaseLiveSdkSceneFragment extends SAFTikTokFragment implements InterfaceC20573715ex, InterfaceC20596815ig {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiklHELIOSPyp9CiQ/LAM6PiAfLSQAKyAiLAkhKSIhLCEn";
    public boolean LLJILLL = true;
    public final boolean LLJJ = true;
    public Integer LLJJI;

    @Override // X.InterfaceC20573715ex
    public final void E4() {
    }

    @Override // X.InterfaceC20596815ig
    public boolean JL() {
        return false;
    }

    @Override // X.InterfaceC20573715ex
    public final boolean K6() {
        return false;
    }

    public int getPageType() {
        return -1;
    }

    @Override // X.InterfaceC20573715ex
    public final boolean wy() {
        return false;
    }

    static {
        C20338414i6.LIZIZ("BaseLiveSdkActivity");
    }

    public final void hS() {
        LiveMultiTabWrapperActivity liveMultiTabWrapperActivity;
        if (this.LLJILLL) {
            this.LLJILLL = false;
            InterfaceC20597015ii interfaceC20597015iiLIZJ = C20622515mp.LIZJ(getActivity());
            if (interfaceC20597015iiLIZJ != null) {
                interfaceC20597015iiLIZJ.ac(null);
            }
            C19EG activity = getActivity();
            if (!(activity instanceof LiveMultiTabWrapperActivity) || (liveMultiTabWrapperActivity = (LiveMultiTabWrapperActivity) activity) == null) {
                return;
            }
            liveMultiTabWrapperActivity.LLLJIL();
        }
    }

    @Override // androidx.fragment.app.SAFTikTokFragment
    public final boolean WR() {
        if (C294080Bfq.LIZ()) {
            return false;
        }
        return super.WR();
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        Integer num;
        super.onDestroy();
        C1107670evl.LIZ = null;
        C1107670evl.LIZIZ = 0;
        C1124870fNV.LIZJ().getClass();
        C1124870fNV.LJ();
        C1553010qW3.LIZ.getClass();
        C1553010qW3.LIZ();
        if (!LiveHostFixPortraitCheck.getEnable() || (num = this.LLJJI) == null) {
            return;
        }
        int iIntValue = num.intValue();
        C19EG activity = getActivity();
        if (activity != null) {
            activity.setRequestedOrientation(iIntValue);
        }
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        IHostAction iHostAction = (IHostAction) C1161920gLG.LIZJ(IHostAction.class);
        if (iHostAction != null) {
            iHostAction.setCurrentPage(-1);
        }
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public void onResume() {
        try {
            super.onResume();
            IHostAction iHostAction = (IHostAction) C1161920gLG.LIZJ(IHostAction.class);
            if (iHostAction != null) {
                iHostAction.setCurrentPage(getPageType());
            }
            if (((LiveBrightnessConfig) C14CD.LIZIZ.getValue()).enable) {
                C19EG activity = getActivity();
                new LiveBrightnessManager(this, activity != null ? activity.getWindow() : null, new BPEAHandler(Looper.getMainLooper())).LIZ();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObjectLIZIZ = C487020J8a.LIZIZ(SAFExtensionKt.LJIIJJI(this), arrayList);
            C2450709iz.LJ(arrayList, jSONObjectLIZIZ);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("fragments extra info: ");
            sbLIZ.append(jSONObjectLIZIZ);
            C13SZ.LIZ(e, new Exception(C2188811AlT.LIZIZ(sbLIZ)));
        }
    }

    public final void vQ() {
        List<Fragment> listLJJLIIIJL;
        List listLLIIII;
        FragmentManager fragmentManagerLJIIJJI = SAFExtensionKt.LJIIJJI(this);
        if (fragmentManagerLJIIJJI == null || (listLJJLIIIJL = fragmentManagerLJIIJJI.LJJLIIIJL()) == null || (listLLIIII = C13LP.LLIIII(listLJJLIIIJL)) == null || listLLIIII.isEmpty()) {
            return;
        }
        C19EH c19ehLJIIJ = fragmentManagerLJIIJJI.LJIIJ();
        Iterator it2 = listLLIIII.iterator();
        while (it2.hasNext()) {
            c19ehLJIIJ.LJIIZILJ((Fragment) it2.next());
        }
        c19ehLJIIJ.LJIIL();
    }

    public boolean iS() {
        return this.LLJJ;
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, X.InterfaceC214902198i
    public void LLLLIILLL(Bundle bundle) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this);
        sbLIZ.append(", onNewIntent");
        C2188811AlT.LIZIZ(sbLIZ);
        this.LLJILLL = true;
        if (iS()) {
            hS();
        }
        super.LLLLIILLL(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (iS()) {
            hS();
        }
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        Resources.Theme theme;
        Window window;
        Integer numValueOf;
        Map<String, Object> map = C1338270kvh.LIZ;
        LiveEndFragmentObserver.LIZ = false;
        Class<?> cls = null;
        if (LiveHostFixPortraitCheck.getEnable()) {
            C19EG activity = getActivity();
            if (activity != null) {
                numValueOf = Integer.valueOf(activity.getRequestedOrientation());
            } else {
                numValueOf = null;
            }
            this.LLJJI = numValueOf;
            C19EG activity2 = getActivity();
            if (activity2 != null) {
                activity2.setRequestedOrientation(1);
            }
        }
        if (LiveBroadcastSAARecordHostActivity.getEnable()) {
            C19EG activity3 = getActivity();
            if (activity3 != null) {
                cls = activity3.getClass();
            }
            getLifecycle().addObserver(new LiveHostActivityRecorder$startRecord$1(cls));
        }
        ((ILiveHostOuterService) ServiceManager.get().getService(ILiveHostOuterService.class)).LIZ();
        this.LLJILLL = true;
        super.onCreate(bundle);
        if (C290160BYw.LIZ()) {
            Context context = getContext();
            if (context != null) {
                context.setTheme(C011Z.LIZ.LJIIIZ());
            }
        } else {
            Context context2 = getContext();
            if (context2 != null && (theme = context2.getTheme()) != null) {
                theme.applyStyle(C011Z.LIZ.LJIIIZ(), false);
            }
        }
        C0JBU.LIZ();
        C19EG activity4 = getActivity();
        if (activity4 != null && (window = activity4.getWindow()) != null) {
            window.getDecorView().setSystemUiVisibility(256);
            window.addFlags(Integer.MIN_VALUE);
            window.setNavigationBarColor(-16777216);
        }
        C783810Uot.LIZLLL.LIZIZ = true;
        C1553010qW3.LIZ.getClass();
        if (GeckoDownloadZipObserverABSetting.INSTANCE.isMatch()) {
            C1554340qYC c1554340qYC = new C1554340qYC(1);
            C1553010qW3.LIZIZ = c1554340qYC;
            C1551940qUK.LJIIL(c1554340qYC);
        }
    }
}
