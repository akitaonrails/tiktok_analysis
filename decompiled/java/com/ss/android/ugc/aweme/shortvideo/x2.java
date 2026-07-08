package com.ss.android.ugc.aweme.shortvideo;

import X.AbstractC1650170t2l;
import X.C0MWZ;
import X.C1664600tQ2;
import X.C1DRG;
import X.C201955140j;
import X.C524780Ki4;
import X.C530750Krh;
import X.C857540XkW;
import X.EnumC19367310pr;
import X.InterfaceC1642910sr3;
import X.InterfaceC1650230t2r;
import X.InterfaceC484050IyZ;
import X.InterfaceC524950KiL;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.optimization.ILayoutPreloadService;
import com.ss.android.ugc.aweme.shortvideo.component.a;
import com.ss.android.ugc.aweme.shortvideo.ui.task.RecordTaskManager;
import com.ss.android.ugc.aweme.shortvideo.util.performance.VideoRecordFirstFramePerformanceMonitor;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes26.dex */
public class x2 extends AbstractC1650170t2l implements InterfaceC484050IyZ {
    public final InterfaceC1650230t2r LLJJI;
    public View LLJJIII;
    public final ShortVideoContext LLJJIJI;
    public C1DRG LLJJIJIIJIL;
    public final InterfaceC1642910sr3 LLJJIJIL;
    public final C1DRG LLJJJ;
    public boolean LLJJJIL;

    @Override // X.AbstractC1650170t2l, com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public final LifecycleOwner getLifecycleOwner() {
        return this;
    }

    @Override // X.AbstractC1650170t2l
    public final C1DRG getDiContainer() {
        if (this.mActivity == null) {
            return null;
        }
        if (this.LLJJIJIIJIL == null) {
            this.LLJJIJIIJIL = C1664600tQ2.LJIIIZ(this);
        }
        return this.LLJJIJIIJIL;
    }

    public final a LLLLILI() {
        C1DRG diContainer = getDiContainer();
        if (diContainer != null) {
            return (a) diContainer.LJIIL(null, a.class);
        }
        return null;
    }

    @Override // com.bytedance.scene.Scene
    public final void onAttach() {
        super.onAttach();
        C201955140j.LJIIL("planC onAttach");
        C530750Krh.LIZIZ(requireApplicationContext());
    }

    @Override // com.bytedance.scene.Scene
    public final void onDestroy() {
        super.onDestroy();
        InterfaceC524950KiL interfaceC524950KiLLIZ = C0MWZ.LIZ(this);
        if (interfaceC524950KiLLIZ != null) {
            interfaceC524950KiLLIZ.T4(this);
        }
        C201955140j.LJIIL("planC onDestroy");
    }

    @Override // com.bytedance.scene.Scene
    public final void onResume() {
        super.onResume();
        C201955140j.LJIIL("planC onResume");
        C524780Ki4.LIZ.end(VideoRecordFirstFramePerformanceMonitor.INSTANCE, "PlanC onResume");
        if (!this.LLJJJIL) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            ShortVideoContext shortVideoContext = this.LLJJIJI;
            CreativeModel creativeModel = shortVideoContext.creativeModel;
            long j = jCurrentTimeMillis - creativeModel.conversionRateTime;
            creativeModel.conversionRateTime = jCurrentTimeMillis;
            C857540XkW.LIZ(j, shortVideoContext.shootWay, shortVideoContext.getCreationId(), "ui_visible", this.LLJJIJI.enterFrom);
            this.LLJJJIL = true;
        }
        RecordTaskManager.LIZIZ(EnumC19367310pr.RECORD_ON_UI_SHOW);
    }

    @Override // com.bytedance.scene.Scene
    public final void onStart() {
        super.onStart();
        C201955140j.LJIIL("planC onStart");
    }

    @Override // X.AbstractC1650170t2l
    public final C1DRG LLLLIIIILLL() {
        return this.LLJJJ;
    }

    @Override // com.bytedance.scene.Scene
    public final void onDestroyView() {
        super.onDestroyView();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0155  */
    @Override // com.bytedance.scene.Scene
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onActivityCreated(android.os.Bundle r11) {
        /*
            Method dump skipped, instruction units count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.x2.onActivityCreated(android.os.Bundle):void");
    }

    @Override // X.InterfaceC484050IyZ
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        a aVarLLLLILI = LLLLILI();
        if (aVarLLLLILI != null) {
            aVarLLLLILI.onActivityResult(i, i2, intent);
            return false;
        }
        return false;
    }

    @Override // X.AbstractC1650170t2l, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C201955140j.LIZ("planC => onCreateView start");
        ViewGroup viewGroup2 = (ViewGroup) ((ILayoutPreloadService) ServiceManager.get().getService(ILayoutPreloadService.class)).loadLayoutFiles("planC", getSceneContext(), layoutInflater, R.layout.c9n, viewGroup, false);
        this.LLJJIII = viewGroup2.findViewById(R.id.tsc);
        InterfaceC524950KiL interfaceC524950KiLLIZ = C0MWZ.LIZ(this);
        if (interfaceC524950KiLLIZ != null) {
            interfaceC524950KiLLIZ.Qh(this);
        }
        C524780Ki4.LIZ.step("av_video_record_init", "PlanC onCreateView");
        C201955140j.LIZ("planC => onCreateView end");
        return viewGroup2;
    }

    public x2(ShortVideoContext shortVideoContext, Bundle bundle, C1DRG c1drg, InterfaceC1642910sr3 interfaceC1642910sr3) {
        this.LLJJIJI = shortVideoContext;
        this.LLJJI = (InterfaceC1650230t2r) c1drg.LJII(InterfaceC1650230t2r.class, null);
        this.LLJJJ = c1drg;
        this.LLJJIJIL = interfaceC1642910sr3;
        if (bundle != null) {
            this.mArguments = bundle;
        }
    }
}
