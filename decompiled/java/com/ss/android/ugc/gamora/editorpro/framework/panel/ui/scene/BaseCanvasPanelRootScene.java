package com.ss.android.ugc.gamora.editorpro.framework.panel.ui.scene;

import X.AbstractC214793194d;
import X.AbstractC214814194y;
import X.C0E47;
import X.C0EGL;
import X.C0FXH;
import X.C1308910kAL;
import X.C1447800nmM;
import X.C1654320t9S;
import X.C1664590tQ1;
import X.C1664600tQ2;
import X.C19A3;
import X.C19ME;
import X.C1DRF;
import X.C1DRG;
import X.C360050E9r;
import X.C375740EoG;
import X.C539960LFq;
import X.C786410Ut5;
import X.InterfaceC374710Emb;
import X.ViewTreeObserverOnPreDrawListenerC337150DJp;
import Y.ARunnableS74S0200000_5;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.als.FeatureAlsLogicContainer;
import com.bytedance.scene.navigation.NavigationScene;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public abstract class BaseCanvasPanelRootScene<I extends C360050E9r, O> extends AbstractC214814194y {
    public final C375740EoG LLJJIJIL;
    public InterfaceC374710Emb LLJJJ;
    public NavigationScene LLJJJIL;
    public C19A3 LLJJJJ;
    public I LLJJJJJIL;

    public abstract Function1<C539960LFq, Unit> LLLLL();

    public abstract Function1<C1DRF, Unit> LLLLLILLIL();

    public final int LLLLLIL() {
        View viewFindViewById;
        Activity activity = this.mActivity;
        if (activity == null || (viewFindViewById = activity.findViewById(R.id.gcu)) == null) {
            return 0;
        }
        int[] iArr = new int[2];
        viewFindViewById.getLocationInWindow(iArr);
        return iArr[1];
    }

    @Override // X.AbstractC214814194y, X.C198H
    public boolean onBackPressed() {
        InterfaceC374710Emb interfaceC374710Emb;
        NavigationScene navigationScene = this.LLJJJIL;
        if (!Intrinsics.LJFF(navigationScene != null ? navigationScene.LLLLIIIILLL() : null, this) || (interfaceC374710Emb = this.LLJJJ) == null) {
            return false;
        }
        interfaceC374710Emb.exit(false);
        return true;
    }

    public BaseCanvasPanelRootScene() {
        LLLLJ(AFwS234S0000000_5.get$arr$(348));
        disableSceneRestore();
        this.LLJJIJIL = new C375740EoG();
    }

    public AbstractC214793194d LLLLJI() {
        return this.LLJJIJIL;
    }

    @Override // X.AbstractC214814194y, com.bytedance.scene.Scene
    public void onActivityCreated(Bundle bundle) {
        NavigationScene navigationSceneLIZ;
        super.onActivityCreated(bundle);
        C19A3 c19a3 = this.LLJJJJ;
        if (c19a3 != null && (navigationSceneLIZ = C1447800nmM.LIZ(c19a3)) != null) {
            navigationSceneLIZ.LLLIILIL(this, new C0FXH(this, 7));
        }
        if (C0E47.LIZ()) {
            C1654320t9S.LIZIZ(this, AFwS234S0000000_5.get$arr$(418));
            C1664590tQ1.LIZ(this, getClass().getSimpleName(), true, new AwS584S0100000_5(this, (BaseCanvasPanelRootScene<C360050E9r, Object>) 876));
            C1664600tQ2.LIZ(this, getClass().getSimpleName(), new AwS584S0100000_5(this, (BaseCanvasPanelRootScene<C360050E9r, Object>) 877));
            C1DRG c1drg = ((FeatureAlsLogicContainer) C1664600tQ2.LJ(this)).LLJJI;
            if (c1drg != null) {
                this.LLJJJ = (InterfaceC374710Emb) c1drg.LJIIL(null, InterfaceC374710Emb.class);
                return;
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        NavigationScene navigationScene = this.LLJJJIL;
        if (navigationScene == null) {
            return;
        }
        navigationScene.LLLLLL();
    }

    @Override // X.AbstractC214814194y, com.bytedance.scene.Scene
    public void onViewCreated(View view, Bundle bundle) {
        Integer numLIZJ;
        super.onViewCreated(view, bundle);
        int iLIZ = C0EGL.LIZ();
        Context context = getContext();
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(iLIZ, context)) != null) {
            int iIntValue = numLIZJ.intValue();
            View viewFindViewById = findViewById(R.id.pom);
            if (viewFindViewById != null) {
                viewFindViewById.setBackgroundColor(iIntValue);
            }
        }
        ViewTreeObserverOnPreDrawListenerC337150DJp.LIZ(view, new ARunnableS74S0200000_5(view, this, 32));
    }

    @Override // X.AbstractC1447660nm8, X.C19A3, com.bytedance.scene.Scene
    public ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup viewGroup2 = (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.bzq, viewGroup, false);
        View viewFindViewById = viewGroup2.findViewById(R.id.nwk);
        if (viewFindViewById != null) {
            layoutParams = viewFindViewById.getLayoutParams();
        } else {
            layoutParams = null;
        }
        ((C19ME) layoutParams).guideBegin = LLLLLIL();
        C786410Ut5.K7(viewGroup2, new View.OnClickListener() { // from class: X.0Eo6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
            }
        });
        return viewGroup2;
    }
}
