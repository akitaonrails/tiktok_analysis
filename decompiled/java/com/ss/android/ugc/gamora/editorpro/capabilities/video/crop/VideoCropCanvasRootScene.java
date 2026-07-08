package com.ss.android.ugc.gamora.editorpro.capabilities.video.crop;

import X.AbstractC214793194d;
import X.C0EGL;
import X.C0ES3;
import X.C0JAI;
import X.C1308910kAL;
import X.C19ME;
import X.C1DRF;
import X.C21392618nk;
import X.C357280Dza;
import X.C360050E9r;
import X.C363110ELl;
import X.C539960LFq;
import X.C786410Ut5;
import X.InterfaceC361710EGb;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.gamora.editorpro.framework.panel.ui.scene.BaseCanvasPanelRootScene;
import com.ss.ugc.android.editor.components.base.api.IPreviewService;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: loaded from: classes6.dex */
public final class VideoCropCanvasRootScene extends BaseCanvasPanelRootScene<C360050E9r, C363110ELl> {
    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.ui.scene.BaseCanvasPanelRootScene
    public final AbstractC214793194d LLLLJI() {
        return new C21392618nk();
    }

    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.ui.scene.BaseCanvasPanelRootScene
    public final Function1<C539960LFq, Unit> LLLLL() {
        return new AwS584S0100000_5(this, 606);
    }

    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.ui.scene.BaseCanvasPanelRootScene
    public final Function1<C1DRF, Unit> LLLLLILLIL() {
        return AFwS234S0000000_5.get$arr$(307);
    }

    @Override // X.AbstractC214814194y, com.bytedance.scene.Scene
    public final void onStop() {
        View viewFindViewById;
        View viewFindViewById2;
        super.onStop();
        Activity activity = this.mActivity;
        if (activity != null && (viewFindViewById2 = activity.findViewById(R.id.gcu)) != null) {
            C786410Ut5.LJLLLLLL(0, viewFindViewById2);
        }
        Activity activity2 = this.mActivity;
        if (activity2 == null || (viewFindViewById = activity2.findViewById(R.id.ygy)) == null) {
            return;
        }
        C786410Ut5.LJLLLLLL(0, viewFindViewById);
    }

    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.ui.scene.BaseCanvasPanelRootScene, X.AbstractC214814194y, com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        View viewFindViewById;
        View viewFindViewById2;
        Integer numLIZJ;
        super.onViewCreated(view, bundle);
        int iLIZ = C0EGL.LIZ();
        Context context = getContext();
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(iLIZ, context)) != null) {
            int iIntValue = numLIZJ.intValue();
            requireViewById(R.id.rpz).setBackgroundColor(iIntValue);
            requireViewById(R.id.pom).setBackgroundColor(iIntValue);
            requireViewById(R.id.w0z).setBackgroundColor(iIntValue);
        }
        Activity activity = this.mActivity;
        if (activity != null && (viewFindViewById2 = activity.findViewById(R.id.gcu)) != null) {
            C786410Ut5.LJLLLLLL(4, viewFindViewById2);
        }
        Activity activity2 = this.mActivity;
        if (activity2 != null && (viewFindViewById = activity2.findViewById(R.id.ygy)) != null) {
            C786410Ut5.LJLLLLLL(4, viewFindViewById);
        }
    }

    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.ui.scene.BaseCanvasPanelRootScene, X.AbstractC1447660nm8, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        C19ME c19me;
        SurfaceView surfaceViewLJIJJLI;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        InterfaceC361710EGb previewPanelApi;
        C19ME c19me2;
        int i = 0;
        ViewGroup viewGroup2 = (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.bzs, viewGroup, false);
        View viewFindViewById = viewGroup2.findViewById(R.id.nwk);
        ViewGroup.LayoutParams layoutParams3 = null;
        if (viewFindViewById != null) {
            layoutParams = viewFindViewById.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if ((layoutParams instanceof C19ME) && (c19me2 = (C19ME) layoutParams) != null) {
            int iLIZIZ = C0JAI.LIZIZ(viewGroup.getContext()) - C0ES3.LIZ();
            int iLLLLLIL = LLLLLIL();
            if (iLLLLLIL > iLIZIZ) {
                iLIZIZ = iLLLLLIL;
            }
            c19me2.guideBegin = iLIZIZ;
        }
        View viewFindViewById2 = viewGroup2.findViewById(R.id.valid_preview_area_top_guideline);
        if (viewFindViewById2 != null) {
            layoutParams2 = viewFindViewById2.getLayoutParams();
        } else {
            layoutParams2 = null;
        }
        if ((layoutParams2 instanceof C19ME) && (c19me = (C19ME) layoutParams2) != null) {
            IPreviewService iPreviewServiceLIZ = C357280Dza.LIZ();
            if (iPreviewServiceLIZ != null && (previewPanelApi = iPreviewServiceLIZ.getPreviewPanelApi()) != null) {
                surfaceViewLJIJJLI = previewPanelApi.LJIJJLI();
            } else {
                surfaceViewLJIJJLI = null;
            }
            int[] iArr = new int[2];
            if (surfaceViewLJIJJLI != null) {
                surfaceViewLJIJJLI.getLocationInWindow(iArr);
                layoutParams3 = surfaceViewLJIJJLI.getLayoutParams();
            }
            if ((layoutParams3 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3) != null) {
                i = marginLayoutParams.topMargin;
            }
            c19me.guideBegin = i;
        }
        C786410Ut5.K7(viewGroup2, new View.OnClickListener() { // from class: X.0Eo8
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
