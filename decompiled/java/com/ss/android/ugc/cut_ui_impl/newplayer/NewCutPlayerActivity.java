package com.ss.android.ugc.cut_ui_impl.newplayer;

import X.AbstractActivityC559670LxF;
import X.AbstractBinderC539770LEx;
import X.AbstractC21673619ry;
import X.C0LE9;
import X.C0LEA;
import X.C1697810uHb;
import X.C2107808No;
import X.C23250099c;
import X.C559780LxQ;
import X.C559790LxR;
import X.C559810LxT;
import X.C559820LxU;
import X.C559920Lxe;
import X.C786410Ut5;
import X.DialogInterfaceOnClickListenerC580870MqL;
import X.ProgressDialogC1397780mTg;
import X.ServiceConnectionC20016413Tm;
import Y.ARunnableS108S0100000_8;
import Y.ARunnableS14S0100100_8;
import Y.ARunnableS27S0110000_8;
import Y.ARunnableS87S0000000_8;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.SurfaceView;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.cut_ui.CutResultData;
import com.ss.android.ugc.cut_ui.MediaItem;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class NewCutPlayerActivity extends AbstractActivityC559670LxF {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiY5PRAmIRolJD8/ZiHELIOSspPj8/KTwpO2EdLTIPPDsDJCQ1LD0SKzElPyYnMQ==";
    public C559790LxR LLJL;
    public boolean LLJLIL;
    public final C559920Lxe LLJLILLLLZIIL = new C559920Lxe();
    public ProgressDialogC1397780mTg LLJLL;

    @Override // X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.cut_ui_impl.newplayer.NewCutPlayerActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.cut_ui_impl.newplayer.NewCutPlayerActivity", "onStart", false);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.cut_ui_impl.newplayer.NewCutPlayerActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.AbstractActivityC559670LxF
    public final void LLZLI() {
        runOnUiThread(new ARunnableS108S0100000_8(this, 118));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        this.LLJLILLLLZIIL.getClass();
        this.LLJLILLLLZIIL.getClass();
        if (Intrinsics.LJFF(this.LLJJJJJIL, this.LLJJJIL)) {
            AbstractBinderC539770LEx abstractBinderC539770LEx = this.LLILLJJLI;
            if (abstractBinderC539770LEx != null) {
                abstractBinderC539770LEx.report(1022, CardStruct.IStatusCode.DEFAULT, null, null, null, null, null);
            }
            super.onBackPressed();
            return;
        }
        if (isFinishing()) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(getApplication().getString(2131830062));
        builder.setMessage(getApplication().getString(2131830061));
        builder.setPositiveButton("OK", new DialogInterfaceOnClickListenerC580870MqL(1));
        builder.setNegativeButton("Cancel", new DialogInterfaceOnClickListenerC580870MqL(1));
    }

    @Override // X.AbstractActivityC559670LxF, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() throws Throwable {
        ActivityAgent.onTrace("com.ss.android.ugc.cut_ui_impl.newplayer.NewCutPlayerActivity", "onResume", true);
        super.onResume();
        View viewFindViewById = findViewById(R.id.p8k);
        if (viewFindViewById != null) {
            viewFindViewById.setEnabled(true);
        }
        ActivityAgent.onTrace("com.ss.android.ugc.cut_ui_impl.newplayer.NewCutPlayerActivity", "onResume", false);
    }

    @Override // X.AbstractActivityC559670LxF
    public final SurfaceView LLLLZIL() {
        return (SurfaceView) findViewById(R.id.videoSurface);
    }

    @Override // X.AbstractActivityC559670LxF
    public final void LLLZLZ() {
        super.LLLZLZ();
        C23250099c.LIZLLL(this, C2107808No.LIZ, null, new C559810LxT(this, null), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0072  */
    @Override // X.AbstractActivityC559670LxF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLZ() {
        /*
            Method dump skipped, instruction units count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.cut_ui_impl.newplayer.NewCutPlayerActivity.LLZ():void");
    }

    @Override // X.AbstractActivityC559670LxF
    public final void LLZZ() {
        super.LLZZ();
        runOnUiThread(new ARunnableS108S0100000_8(this, 119));
    }

    @Override // X.AbstractActivityC559670LxF
    public final void f() {
        super.f();
        runOnUiThread(new ARunnableS87S0000000_8(4));
    }

    @Override // android.app.Activity
    public final void finish() {
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.videoSurfaceCover);
        if (recyclerView != null) {
            C786410Ut5.LLIZLLLIL(recyclerView, 0);
        }
        super.finish();
    }

    @Override // X.AbstractActivityC559670LxF, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        C559790LxR c559790LxR = this.LLJL;
        if (c559790LxR != null) {
            ServiceConnectionC20016413Tm<INTERFACE> serviceConnectionC20016413Tm = c559790LxR.LLILZIL;
            if (serviceConnectionC20016413Tm != 0) {
                c559790LxR.LL.unbindService(serviceConnectionC20016413Tm);
                serviceConnectionC20016413Tm.LL.setValue(null);
            }
            c559790LxR.LLILZIL = null;
        }
        this.LLJLILLLLZIIL.getClass();
    }

    @Override // X.AbstractActivityC559670LxF, X.C19GS, X.C19EG, android.app.Activity
    public final void onStop() {
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        try {
            getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
    }

    @Override // X.AbstractActivityC559670LxF
    public final void LLLZIL(float f) {
        C23250099c.LIZLLL(this, C2107808No.LIZ, null, new C0LEA(this, f, null), 2);
    }

    @Override // X.AbstractActivityC559670LxF
    public final Intent LLLZZIL(String str) {
        Intent intentLLLZZIL = super.LLLZZIL(str);
        C23250099c.LIZLLL(this, C2107808No.LIZ, null, new C0LE9(this, null), 2);
        CutResultData cutResultData = new CutResultData(str, CardStruct.IStatusCode.DEFAULT, null, null, null);
        this.LLJLILLLLZIIL.getClass();
        CutResultData cutResultDataLIZ = CutResultData.LIZ(cutResultData, null, 27);
        this.LLJLILLLLZIIL.getClass();
        CutResultData cutResultDataLIZ2 = CutResultData.LIZ(cutResultDataLIZ, null, 23);
        ArrayList<MediaItem> arrayList = this.LLJJJIL;
        if (arrayList != null) {
            cutResultDataLIZ2 = CutResultData.LIZ(cutResultDataLIZ2, new ArrayList(arrayList), 15);
        }
        intentLLLZZIL.putExtra("compile_data", cutResultDataLIZ2);
        intentLLLZZIL.putExtra("compile_file", str);
        return intentLLLZZIL;
    }

    @Override // X.AbstractActivityC559670LxF
    public final void LLZZLLIL(MediaItem mediaItem) {
        AbstractC21673619ry adapter;
        super.LLZZLLIL(mediaItem);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.video_list_view);
        if (recyclerView != null && (adapter = recyclerView.getAdapter()) != null) {
            C559780LxQ c559780LxQ = (C559780LxQ) adapter;
            int i = 0;
            for (Object obj : (ArrayList) c559780LxQ.LLILLL) {
                int i2 = i + 1;
                if (i >= 0) {
                    if (Intrinsics.LJFF(((MediaItem) obj).materialId, mediaItem.materialId)) {
                        ListProtector.set(c559780LxQ.LLILLL, i, mediaItem);
                        c559780LxQ.notifyItemChanged(i);
                        return;
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
    }

    @Override // X.AbstractActivityC559670LxF
    public final void LLZZZIL(boolean z) {
        super.LLZZZIL(z);
        runOnUiThread(new ARunnableS27S0110000_8(this, z, 6));
    }

    @Override // X.AbstractActivityC559670LxF
    public final void g(long j) {
        runOnUiThread(new ARunnableS14S0100100_8(this, j, 0));
    }

    @Override // X.AbstractActivityC559670LxF, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) throws Throwable {
        ActivityAgent.onTrace("com.ss.android.ugc.cut_ui_impl.newplayer.NewCutPlayerActivity", "onCreate", true);
        C559790LxR c559790LxR = new C559790LxR(this);
        c559790LxR.LIZIZ(null);
        this.LLJL = c559790LxR;
        super.onCreate(bundle);
        getWindow().getDecorView().setBackgroundColor(ColorProtector.parseColor("#000000"));
        ActivityAgent.onTrace("com.ss.android.ugc.cut_ui_impl.newplayer.NewCutPlayerActivity", "onCreate", false);
    }

    @Override // X.AbstractActivityC559670LxF
    public final void LLLZ(int i, String str) {
        super.LLLZ(i, str);
        C23250099c.LIZLLL(this, C2107808No.LIZ, null, new C559820LxU(this, null), 2);
    }

    @Override // X.AbstractActivityC559670LxF
    public final void LLZLLLL(int i, String str) {
        super.LLZLLLL(i, str);
        runOnUiThread(new ARunnableS108S0100000_8(this, 120));
    }
}
