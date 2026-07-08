package com.ss.android.ugc.aweme.shortvideo.edit;

import X.AbstractC1453750nvx;
import X.C1202330hOR;
import X.C1431840nMc;
import X.C1655600tBW;
import X.C201955140j;
import X.C20622315mn;
import X.C545820Lau;
import X.C786410Ut5;
import X.C960203pA;
import X.InterfaceC1444130ngR;
import X.InterfaceC1674890tgd;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS278S0000000_32;
import nv7.c0;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes23.dex */
public abstract class VideoPublishEditContainerScene extends BaseScreenAdaptScene {
    public AbstractC1453750nvx LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public InterfaceC1444130ngR LLJL;

    @Override // X.AbstractC214814194y
    public final boolean LLLLIILL() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.adaptation.AbsSceneAdaptationScene
    public final String LLLLL() {
        return "video_edit_page";
    }

    public void LLLLLLIL(int i) {
    }

    @Override // com.ss.android.ugc.aweme.adaptation.AbsSceneAdaptationScene
    public final C1202330hOR LLLLJI() {
        C1202330hOR c1202330hOR = C1655600tBW.LIZ;
        return C1655600tBW.LIZ;
    }

    @Override // X.AbstractC1447660nm8
    public final Bundle requireArgumentsSafely() {
        Bundle bundle = this.mArguments;
        if (bundle != null) {
            return bundle;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public VideoPublishEditContainerScene() {
        LLLLJ(AFwS278S0000000_32.get$arr$(93));
    }

    @Override // com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene, X.AbstractC214814194y, X.AbstractC1447660nm8, com.bytedance.scene.Scene
    public void onDestroyView() {
        super.onDestroyView();
        if (C20622315mn.LIZ()) {
            EventBus.LIZLLL().LJIJJLI(C1431840nMc.class);
        }
    }

    @Override // com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene, X.AbstractC214814194y, com.bytedance.scene.Scene
    public void onStart() {
        AbstractC1453750nvx abstractC1453750nvx;
        boolean zLJI = MethodIDManager.LJI(71974);
        super.onStart();
        if (!this.LLJJLIIIJLLLLLLLZ && (abstractC1453750nvx = this.LLJJL) != null) {
            add(R.id.grf, abstractC1453750nvx, "EditRootScene");
            this.LLJJLIIIJLLLLLLLZ = true;
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene
    public final InterfaceC1674890tgd LLLLLILLIL() {
        return c0.LIZ;
    }

    public final void LLLLLL(AbstractC1453750nvx abstractC1453750nvx) {
        AbstractC1453750nvx abstractC1453750nvx2;
        C201955140j.LIZIZ("EditorLoadUiAfterSurfaceCreated", "try to load EditRootScene. ");
        this.LLJJL = abstractC1453750nvx;
        if (getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED) && (abstractC1453750nvx2 = this.LLJJL) != null) {
            add(R.id.grf, abstractC1453750nvx2, "EditRootScene");
            this.LLJJLIIIJLLLLLLLZ = true;
        }
    }

    @Override // com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene, com.ss.android.ugc.aweme.adaptation.AbsSceneAdaptationScene, X.AbstractC214814194y, com.bytedance.scene.Scene
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    @Override // X.AbstractC1447660nm8, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        Context contextLIZIZ = C545820Lau.LIZIZ(this);
        if (contextLIZIZ != null && C960203pA.LIZIZ(contextLIZIZ)) {
            i = R.style.y0;
        } else {
            i = R.style.b8;
        }
        setTheme(i);
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.es2, viewGroup, false);
    }
}
