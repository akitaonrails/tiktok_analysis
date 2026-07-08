package com.ss.android.ugc.aweme.tako.camera.record.pageui;

import X.C01D1;
import X.C09R3;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C20740416Dy;
import X.C2217381BqS;
import X.C687700QyG;
import X.C723850SaN;
import X.C724750Sbp;
import X.InterfaceC1146704e9;
import X.InterfaceC2217461Bqa;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.tako.camera.record.TakoSurfaceScope;
import com.ss.android.ugc.aweme.tako.vm.TakoRecordFragmentViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS603S0100000_24;

/* JADX INFO: loaded from: classes32.dex */
public final class TakoSurfaceAssem extends UISlotAssem implements InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJI;
    public final AssemVMLazy LLJJI;
    public volatile C20740416Dy LLJJIII;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TakoSurfaceAssem.class, "surfaceViewManager", "getSurfaceViewManager()Lcom/ss/android/ugc/aweme/tako/camera/base/ITakoCameraSurfaceViewManager;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(TakoSurfaceAssem.class, "recordFragmentVM", "getRecordFragmentVM()Lcom/ss/android/ugc/aweme/tako/vm/TakoRecordFragmentViewModel;", 0);
        c09r3.getClass();
        LLJJIJI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public TakoSurfaceAssem() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TakoRecordFragmentViewModel.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 855), AFwS276S0000000_31.get$arr$(231), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.fqy;
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{TakoSurfaceScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(TakoSurfaceScope.class);
        return arrayList;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJI;
        TakoRecordFragmentViewModel takoRecordFragmentViewModel = (TakoRecordFragmentViewModel) assemVMLazy.getValue();
        C20740416Dy c20740416Dy = this.LLJJIII;
        if (c20740416Dy == null) {
            synchronized (this) {
                c20740416Dy = this.LLJJIII;
                if (c20740416Dy == null) {
                    c20740416Dy = new C20740416Dy();
                    this.LLJJIII = c20740416Dy;
                }
            }
        }
        takoRecordFragmentViewModel.LLILLL = c20740416Dy;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        SurfaceView surfaceView = (SurfaceView) view.findViewById(R.id.wq8);
        if (surfaceView != null) {
            C20740416Dy c20740416Dy = this.LLJJIII;
            if (c20740416Dy == null) {
                synchronized (this) {
                    c20740416Dy = this.LLJJIII;
                    if (c20740416Dy == null) {
                        c20740416Dy = new C20740416Dy();
                        this.LLJJIII = c20740416Dy;
                    }
                }
            }
            FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.wq9);
            c20740416Dy.LL = surfaceView;
            c20740416Dy.LLILLJJLI = frameLayout;
            surfaceView.getHolder().addCallback(c20740416Dy);
        }
        C723850SaN.LIZLLL(this, new AwS603S0100000_24(this, 475));
    }
}
