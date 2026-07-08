package com.ss.android.ugc.aweme.ecommerce.search.snapshot;

import X.C01GW;
import X.C098200Yq;
import X.C1507790pL7;
import X.C1685300txQ;
import X.C1740600vOc;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C20673215v0;
import X.C673030Qab;
import X.C683900Qs8;
import X.C786410Ut5;
import Y.ACListenerS145S0100000_10;
import Y.ARunnableS110S0100000_10;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.SAFTikTokFragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.ss.android.ugc.aweme.ab.MiddleSnapShotConfig;
import com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceMallService;
import com.ss.android.ugc.aweme.ecommerce.mall.service.searchentrance.ECMiddleEntranceData;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS241S0000000_10;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class ECSearchMiddleSnapShotSAFFragment extends SAFTikTokFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLGEgLSQ+Kid9HELIOSOystOTw7JzFiDAwALSQ+KiceISEoJSoAJiQ8Gic8PBYNDwkhKSIhLCEn";
    public final C01GW LLJILLL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS241S0000000_10.get$arr$(76), "ecMiddleEntranceData", ECMiddleEntranceData.class);
    public ImageView LLJJ;
    public ARunnableS110S0100000_10 LLJJI;

    @Override // androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        ARunnableS110S0100000_10 aRunnableS110S0100000_10;
        ImageView imageView = this.LLJJ;
        if (imageView != null && (aRunnableS110S0100000_10 = this.LLJJI) != null) {
            HandlerHook.viewRemoveCallbacks(imageView, aRunnableS110S0100000_10);
        }
        this.LLJJI = null;
        this.LLJJ = null;
        try {
            C683900Qs8.LIZ.getClass();
            Bitmap bitmap = C683900Qs8.LIZIZ;
            if (bitmap != null && !bitmap.isRecycled()) {
                bitmap.recycle();
                BitmapCrashChecker.recordBitmapRecyclePoint(bitmap);
            }
            C683900Qs8.LIZIZ = null;
            C683900Qs8.LIZLLL = null;
            C683900Qs8.LJ = 0L;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewLIZLLL = C20673215v0.LIZLLL(R.layout.bp3, requireActivity(), viewGroup, false);
        this.LLJJ = (ImageView) viewLIZLLL.findViewById(R.id.kb6);
        ImageView imageView = this.LLJJ;
        C19GS c19gs = null;
        if (imageView != null) {
            C786410Ut5.Q7(imageView, new ACListenerS145S0100000_10(this, 9));
            C683900Qs8.LIZ.getClass();
            C1740600vOc c1740600vOc = C683900Qs8.LIZLLL;
            Bitmap bitmap = C683900Qs8.LIZIZ;
            long jMax = 0;
            if (bitmap != null && !bitmap.isRecycled() && bitmap.getWidth() != 0 && bitmap.getHeight() != 0) {
                imageView.setImageBitmap(bitmap);
                try {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    long j = C683900Qs8.LJ;
                    if (j > 0) {
                        jMax = Math.max(0L, jCurrentTimeMillis - j);
                    }
                    C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("page_name", "search_transfer_snap_shot");
                    jSONObject.put("start_to_now", jMax);
                    jSONObject.put("previous_page", "ecom_search_8");
                    c1507790pL7.getClass();
                    C1507790pL7.LIZLLL("rd_tiktokec_meaningful_rendered", jSONObject);
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
                IECommerceMallService iECommerceMallService = (IECommerceMallService) PluggableExtentionKt.pluggableSpi$default(IECommerceMallService.class, false, false, false, 14, null);
                if (iECommerceMallService != null) {
                    iECommerceMallService.LJJ(imageView.getContext(), (ECMiddleEntranceData) this.LLJILLL.getValue(), c1740600vOc);
                }
                C683900Qs8.LIZ.getClass();
                C683900Qs8.LIZLLL = null;
                ARunnableS110S0100000_10 aRunnableS110S0100000_10 = this.LLJJI;
                if (aRunnableS110S0100000_10 != null) {
                    HandlerHook.viewRemoveCallbacks(imageView, aRunnableS110S0100000_10);
                }
                ARunnableS110S0100000_10 aRunnableS110S0100000_102 = new ARunnableS110S0100000_10(this, 2);
                this.LLJJI = aRunnableS110S0100000_102;
                C673030Qab.LIZ.getClass();
                HandlerHook.viewPostDelay(imageView, aRunnableS110S0100000_102, ((MiddleSnapShotConfig) C673030Qab.LIZJ.getValue()).timeOutShowImage);
            } else {
                IECommerceMallService iECommerceMallService2 = (IECommerceMallService) PluggableExtentionKt.pluggableSpi$default(IECommerceMallService.class, false, false, false, 14, null);
                if (iECommerceMallService2 != null) {
                    iECommerceMallService2.LJJ(imageView.getContext(), (ECMiddleEntranceData) this.LLJILLL.getValue(), c1740600vOc);
                }
                C683900Qs8.LIZIZ = null;
                C683900Qs8.LIZLLL = null;
                C683900Qs8.LJ = 0L;
                finish();
            }
        }
        try {
            ViewTreeLifecycleOwner.set(viewLIZLLL, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(viewLIZLLL, this);
            viewLIZLLL.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return viewLIZLLL;
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C189200o6.m2constructorimpl(new C098200Yq(th2));
            return viewLIZLLL;
        }
    }
}
