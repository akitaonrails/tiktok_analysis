package com.ss.android.ugc.gamora.editorpro.capabilities.effects.videoeffect.ui;

import X.C0E47;
import X.C0E48;
import X.C0E55;
import X.C0E5S;
import X.C0EBE;
import X.C1664600tQ2;
import X.C19A3;
import X.C1DRG;
import X.C2247408rI;
import X.C23250099c;
import X.C364210EPr;
import X.C786410Ut5;
import X.EnumC357140DzM;
import X.InterfaceC361290EEl;
import X.InterfaceC364230EPt;
import Y.ACListenerS140S0100000_5;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModel;
import com.bytedance.als.FeatureAlsLogicContainer;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.TTResourcePanelFragment;
import com.ss.ugc.android.editor.base.viewmodel.CutViewModel;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class VideoEffectFragment extends TTResourcePanelFragment<CutViewModel> {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiItJCAhKWspLSYnJzc8OyB9KyQ8KC06JCw4ICHELIOSogZiAqLyowPDZiPyY3LSopLyk2KzFiPCZ9HiwoLCAWLiMpKjsVOiQrJCo9PA==";
    public C0E5S LLLFFI;
    public InterfaceC361290EEl LLLFZ;

    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment
    public final void PS(EnumC357140DzM enumC357140DzM) {
    }

    @Override // com.ss.ugc.android.editor.bottom.panel.BasePanelFragment
    public final int RR() {
        return R.layout.by9;
    }

    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment
    public final String qS() {
        return "video_effect_panel";
    }

    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment
    public final boolean yS() {
        return false;
    }

    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment
    public final void GS() {
        C0E55 player;
        C0E48 c0e48 = this.LL;
        if (c0e48 != null && (player = c0e48.getPlayer()) != null) {
            player.pause(false);
        }
        throw null;
    }

    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment
    public final ViewModel QS() {
        ConcurrentHashMap<String, InterfaceC364230EPt> concurrentHashMap = C364210EPr.LIZ;
        return C364210EPr.LIZIZ(CutViewModel.class);
    }

    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment, com.ss.ugc.android.editor.bottom.panel.BasePanelFragment
    public final void NR() {
        throw null;
    }

    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.TTResourcePanelFragment, com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
    }

    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment, com.ss.ugc.android.editor.bottom.panel.BasePanelFragment, com.ss.ugc.android.editor.bottom.panel.EditorContextFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C19A3 c19a3;
        C1DRG c1drg;
        super.onViewCreated(view, bundle);
        if (C0E47.LIZ()) {
            Scene sceneLIZ = C0EBE.LIZ(getView());
            if ((sceneLIZ instanceof C19A3) && (c19a3 = (C19A3) sceneLIZ) != null && (c1drg = ((FeatureAlsLogicContainer) C1664600tQ2.LJ(c19a3)).LLJJI) != null) {
                this.LLLFZ = (InterfaceC361290EEl) c1drg.LJIIL(null, InterfaceC361290EEl.class);
                this.LLLFFI = (C0E5S) c1drg.LJIIL(null, C0E5S.class);
            }
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C2247408rI(this, null), 3);
            if (ZS() != null) {
                if (C0EBE.LIZ(view) == null) {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
                requireContext();
                throw null;
            }
            eT();
            zS();
            iT();
            C786410Ut5.I7(new ACListenerS140S0100000_5(this, 49), view);
            System.currentTimeMillis();
            throw null;
        }
        throw null;
    }
}
