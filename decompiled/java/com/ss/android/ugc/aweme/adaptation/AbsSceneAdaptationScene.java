package com.ss.android.ugc.aweme.adaptation;

import X.AbstractC214814194y;
import X.C1192870h9B;
import X.C1202330hOR;
import X.C1308910kAL;
import X.C19659811vw;
import X.InterfaceC2077908Cb;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import bsj.a5;
import com.ss.android.ugc.aweme.adaptation.analysis.Analysis;
import com.ss.android.ugc.aweme.adaptation.analysis.AnalysisActivityComponent;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.ICreativeSAAService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS33S0202000_32;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: loaded from: classes33.dex */
public abstract class AbsSceneAdaptationScene extends AbstractC214814194y implements InterfaceC2077908Cb {
    public String LLLLL() {
        return null;
    }

    public String getCreationId() {
        return null;
    }

    public C1202330hOR LLLLJI() {
        C1192870h9B.LIZ.getClass();
        return C1192870h9B.LJFF;
    }

    @Override // X.InterfaceC2077908Cb
    public Analysis getAnalysis() {
        String strLLLLL = LLLLL();
        if (strLLLLL == null || strLLLLL.length() <= 0) {
            return null;
        }
        Analysis analysis = new Analysis();
        analysis.setLabelName(LLLLL());
        analysis.setCreationId(getCreationId());
        return analysis;
    }

    @Override // X.AbstractC214814194y, com.bytedance.scene.Scene
    public void onActivityCreated(Bundle bundle) {
        Window window;
        int iIntValue;
        super.onActivityCreated(bundle);
        if (this.config.LJFF) {
            C1202330hOR c1202330hORLLLLJI = LLLLJI();
            Integer numLIZJ = C1308910kAL.LIZJ(c1202330hORLLLLJI.LJFF, requireSceneContext());
            int iIntValue2 = 0;
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = 0;
            }
            Integer numLIZJ2 = C1308910kAL.LIZJ(c1202330hORLLLLJI.LJI, requireSceneContext());
            if (numLIZJ2 != null) {
                iIntValue2 = numLIZJ2.intValue();
            }
            ((ICreativeSAAService) ServiceManager.get().getService(ICreativeSAAService.class)).invokeMethodsSafely(requireActivity(), new AwS33S0202000_32(this, c1202330hORLLLLJI, iIntValue, iIntValue2, 1));
            Window window2 = requireActivity().getWindow();
            window2.addFlags(Integer.MIN_VALUE);
            window2.getDecorView().setSystemUiVisibility(window2.getDecorView().getSystemUiVisibility() | 1024);
            ((C19659811vw) requireViewById(R.id.u1a)).setStatusBarBackgroundColor(iIntValue);
        } else {
            ((ICreativeSAAService) ServiceManager.get().getService(ICreativeSAAService.class)).invokeMethodsSafely(requireActivity(), new AwS576S0100000_32(this, 75));
        }
        if (a5.LIZ() && (window = getWindow()) != null) {
            window.addFlags(128);
        }
        getLifecycle().addObserver(new AnalysisActivityComponent(this, this));
    }

    @Override // X.AbstractC214814194y, com.bytedance.scene.Scene
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
    }
}
