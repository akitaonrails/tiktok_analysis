package com.ss.android.ugc.aweme.shortvideo.ui;

import X.C0MWU;
import X.C0WZX;
import X.C1701330uNH;
import X.C19EG;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C960203pA;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.ss.android.ugc.aweme.adaptation.AbsSceneAdaptationScene;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.ICreativeSAAService;
import com.zhiliaoapp.musically.R;
import java.util.UUID;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS415S0200000_14;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: loaded from: classes15.dex */
public abstract class TikTokPublishGroupScene extends AbsSceneAdaptationScene {
    public final String LLJJIJIL;
    public TikTokPublishGroupSceneFragment LLJJJ;

    public final Fragment LLLLLIL() {
        TikTokPublishGroupSceneFragment tikTokPublishGroupSceneFragment = this.LLJJJ;
        if (tikTokPublishGroupSceneFragment != null) {
            return tikTokPublishGroupSceneFragment;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Scene ");
        sbLIZ.append(this);
        sbLIZ.append(" not attached to a context.");
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public TikTokPublishGroupScene() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TikTokPublishGroupScene#");
        sbLIZ.append(getClass().getName());
        sbLIZ.append('#');
        sbLIZ.append(UUID.randomUUID());
        this.LLJJIJIL = C2188811AlT.LIZIZ(sbLIZ);
        LLLLJ(AFwS248S0000000_14.get$arr$(328));
    }

    @Override // X.AbstractC214814194y, X.AbstractC1447660nm8, com.bytedance.scene.Scene
    public void onDestroyView() {
        super.onDestroyView();
        TikTokPublishGroupSceneFragment tikTokPublishGroupSceneFragment = this.LLJJJ;
        if (tikTokPublishGroupSceneFragment != null) {
            ((ICreativeSAAService) ServiceManager.get().getService(ICreativeSAAService.class)).invokeMethodsSafely(requireActivity(), new AwS415S0200000_14(this, tikTokPublishGroupSceneFragment, 55));
        }
    }

    public final void LLLLLILLIL(Intent intent) throws Throwable {
        C19EG fragmentActivity = getFragmentActivity();
        if (fragmentActivity != null) {
            RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(fragmentActivity, intent, "Context_startActivity_1");
            C1701330uNH.LIZ(intent, fragmentActivity);
            C2204961BRm.LLJJJJ(fragmentActivity, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhicuLvYUWPfXz572uDJcQiMiQRtAFnbYuaz8=", null));
        }
    }

    @Override // com.ss.android.ugc.aweme.adaptation.AbsSceneAdaptationScene, X.AbstractC214814194y, com.bytedance.scene.Scene
    public void onActivityCreated(Bundle bundle) {
        int i;
        super.onActivityCreated(bundle);
        C0MWU c0mwu = this.config;
        if (C960203pA.LIZIZ(requireContext())) {
            i = R.style.y0;
        } else {
            i = R.style.xm;
        }
        c0mwu.LIZJ = i;
        ((ICreativeSAAService) ServiceManager.get().getService(ICreativeSAAService.class)).invokeMethodsSafely(requireActivity(), new AwS558S0100000_14(this, 1113));
    }
}
