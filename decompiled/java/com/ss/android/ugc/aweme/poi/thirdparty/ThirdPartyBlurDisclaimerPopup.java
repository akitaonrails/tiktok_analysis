package com.ss.android.ugc.aweme.poi.thirdparty;

import X.C098200Yq;
import X.C0DRA;
import X.C1077550e9B;
import X.C1537900q7g;
import X.C1541950qED;
import X.C1548820qPI;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C262100zr;
import X.C786410Ut5;
import X.InterfaceC1141530foN;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.ss.android.ugc.aweme.tux.business.base.GlobalHookDialogFragment;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class ThirdPartyBlurDisclaimerPopup extends GlobalHookDialogFragment implements InterfaceC1141530foN {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjUjIGEnICw+LTHELIOS8yOjE1Zxs7ITcoGS4hPDwOJTohDCw/KiMyISgpOx88ODA8";
    public SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LL;
    public String LLILLJJLI;

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            boolean z = SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLLILZJ;
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJJ(true);
        }
        C1548820qPI.LJIIIIZZ("ttls_disclaimer_close_page", this);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        View decorView;
        Window window2;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null && (window2 = dialog.getWindow()) != null) {
            C0DRA.LIZ(window2, false);
            window2.setLayout(-1, -1);
        }
        C19EG activity = getActivity();
        if (activity != null) {
            View rootView = activity.getWindow().getDecorView().getRootView();
            try {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(rootView.getWidth(), rootView.getHeight(), Bitmap.Config.ARGB_8888);
                rootView.draw(new Canvas(bitmapCreateBitmap));
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmapCreateBitmap);
                RenderScript renderScriptCreate = RenderScript.create(getContext());
                ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
                Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateBitmap);
                Allocation allocationCreateFromBitmap2 = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateBitmap2);
                scriptIntrinsicBlurCreate.setRadius(25.0f);
                scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
                scriptIntrinsicBlurCreate.forEach(allocationCreateFromBitmap2);
                allocationCreateFromBitmap2.copyTo(bitmapCreateBitmap2);
                bitmapCreateBitmap.recycle();
                BitmapCrashChecker.recordBitmapRecyclePoint(bitmapCreateBitmap);
                renderScriptCreate.destroy();
                scriptIntrinsicBlurCreate.destroy();
                allocationCreateFromBitmap.destroy();
                allocationCreateFromBitmap2.destroy();
                BitmapDrawable bitmapDrawable = new BitmapDrawable(getResources(), bitmapCreateBitmap2);
                View view = getView();
                if (view != null) {
                    view.setBackground(bitmapDrawable);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        Dialog dialog2 = getDialog();
        if (dialog2 == null || (window = dialog2.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        ViewTreeLifecycleOwner.set(decorView, this);
        ViewTreeViewModelStoreOwner.set(decorView, this);
        decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        if (Intrinsics.LJFF(c262100zr.LIZ, "ttls_disclaimer_close_page")) {
            dismiss();
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, R.style.lv);
        C1548820qPI.LIZLLL("ttls_disclaimer_close_page", this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2;
        String str;
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.ft4, viewGroup, false);
        C19GS c19gs = null;
        if (viewTd instanceof ViewGroup) {
            viewGroup2 = (ViewGroup) viewTd;
        } else {
            viewGroup2 = null;
        }
        if (viewGroup2 != null && (str = this.LLILLJJLI) != null) {
            C1537900q7g c1537900q7g = C1541950qED.LIZJ;
            Context context = viewGroup2.getContext();
            SparkContext sparkContext = new SparkContext();
            sparkContext.LJJLIIJ(str);
            sparkContext.LJJJJZI(new C1077550e9B(this, 5));
            c1537900q7g.getClass();
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ = new C1541950qED(context, sparkContext).LIZ(false);
            this.LL = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ;
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ.LJIIIIZZ();
            viewGroup2.addView(this.LL, new ViewGroup.LayoutParams(-1, -1));
        }
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }
}
