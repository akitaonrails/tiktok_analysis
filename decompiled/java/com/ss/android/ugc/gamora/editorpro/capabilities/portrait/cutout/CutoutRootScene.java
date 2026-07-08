package com.ss.android.ugc.gamora.editorpro.capabilities.portrait.cutout;

import X.AbstractC214793194d;
import X.C1664600tQ2;
import X.C19ME;
import X.C1DRF;
import X.C1DRG;
import X.C214798194i;
import X.C357270DzZ;
import X.C539960LFq;
import X.C786410Ut5;
import X.InterfaceC374660EmW;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.gamora.editorpro.framework.panel.ui.scene.BaseCanvasPanelRootScene;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: loaded from: classes6.dex */
public final class CutoutRootScene extends BaseCanvasPanelRootScene<C357270DzZ, Unit> {
    public InterfaceC374660EmW LLJJJJLIIL;
    public final C214798194i LLJJL = new C214798194i();

    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.ui.scene.BaseCanvasPanelRootScene
    public final Function1<C539960LFq, Unit> LLLLL() {
        return new AwS584S0100000_5(this, 425);
    }

    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.ui.scene.BaseCanvasPanelRootScene
    public final Function1<C1DRF, Unit> LLLLLILLIL() {
        return new AwS584S0100000_5(this, 426);
    }

    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.ui.scene.BaseCanvasPanelRootScene, X.AbstractC214814194y, X.C198H
    public final boolean onBackPressed() {
        InterfaceC374660EmW interfaceC374660EmW = this.LLJJJJLIIL;
        if (interfaceC374660EmW == null || !interfaceC374660EmW.onBackPressed()) {
            return super.onBackPressed();
        }
        return true;
    }

    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.ui.scene.BaseCanvasPanelRootScene
    public final AbstractC214793194d LLLLJI() {
        return this.LLJJL;
    }

    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.ui.scene.BaseCanvasPanelRootScene, X.AbstractC214814194y, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        C1DRG c1drgLJFF = C1664600tQ2.LJ(this).LJFF();
        if (c1drgLJFF != null) {
            this.LLJJJJLIIL = (InterfaceC374660EmW) c1drgLJFF.LJIIL(null, InterfaceC374660EmW.class);
        } else {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.ui.scene.BaseCanvasPanelRootScene, X.AbstractC214814194y, com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        view.setClickable(false);
    }

    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.ui.scene.BaseCanvasPanelRootScene, X.AbstractC1447660nm8, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup viewGroup2 = (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.c0m, viewGroup, false);
        View viewFindViewById = viewGroup2.findViewById(R.id.nwk);
        if (viewFindViewById != null) {
            layoutParams = viewFindViewById.getLayoutParams();
        } else {
            layoutParams = null;
        }
        ((C19ME) layoutParams).guideBegin = LLLLLIL();
        C786410Ut5.K7(viewGroup2, new View.OnClickListener() { // from class: X.0Eo7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
            }
        });
        View viewFindViewById2 = viewGroup2.findViewById(R.id.pom);
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnTouchListener(new View.OnTouchListener() { // from class: X.0Eo4
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return true;
                }
            });
        }
        return viewGroup2;
    }

    @Override // X.AbstractC1447660nm8, X.C19A3, com.bytedance.scene.Scene
    public final /* bridge */ /* synthetic */ View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return onCreateView(layoutInflater, viewGroup, bundle);
    }
}
