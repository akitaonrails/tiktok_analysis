package com.ss.android.ugc.gamora.editorpro.capabilities.video.trim;

import X.C0E64;
import X.C19ME;
import X.C1DRF;
import X.C539960LFq;
import X.C786410Ut5;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.gamora.editorpro.framework.panel.ui.scene.BaseCanvasPanelRootScene;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: loaded from: classes6.dex */
public final class SmartTrimRootScene extends BaseCanvasPanelRootScene<C0E64, Unit> {
    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.ui.scene.BaseCanvasPanelRootScene
    public final Function1<C539960LFq, Unit> LLLLL() {
        return new AwS584S0100000_5(this, 658);
    }

    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.ui.scene.BaseCanvasPanelRootScene
    public final Function1<C1DRF, Unit> LLLLLILLIL() {
        return new AwS584S0100000_5(this, 659);
    }

    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.ui.scene.BaseCanvasPanelRootScene, X.AbstractC1447660nm8, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup viewGroup2 = (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.bzr, viewGroup, false);
        View viewFindViewById = viewGroup2.findViewById(R.id.nwk);
        if (viewFindViewById != null) {
            layoutParams = viewFindViewById.getLayoutParams();
        } else {
            layoutParams = null;
        }
        ((C19ME) layoutParams).guideBegin = LLLLLIL();
        C786410Ut5.K7(viewGroup2, new View.OnClickListener() { // from class: X.0Eo9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
            }
        });
        return viewGroup2;
    }

    @Override // X.AbstractC1447660nm8, X.C19A3, com.bytedance.scene.Scene
    public final /* bridge */ /* synthetic */ View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return onCreateView(layoutInflater, viewGroup, bundle);
    }
}
