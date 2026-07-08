package com.ss.android.ugc.aweme.shortvideo.album;

import X.C01GW;
import X.C0BTN;
import X.C0LE3;
import X.C0MGE;
import X.C0MWS;
import X.C13LP;
import X.C1447800nmM;
import X.C1664600tQ2;
import X.C1DRG;
import X.C20622515mp;
import X.C2217381BqS;
import X.C258760ACc;
import X.C452501pT;
import X.C569770MWh;
import X.C786410Ut5;
import X.InterfaceC1452360nti;
import X.InterfaceC20597015ii;
import X.InterfaceC362610EJn;
import X.InterfaceC484050IyZ;
import X.InterfaceC524950KiL;
import X.InterfaceC531200KsQ;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.als.FeatureAlsLogicContainer;
import com.bytedance.jedi.arch.BaseJediViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.adaptation.saa.SAAStandardModeActivity;
import com.ss.android.ugc.aweme.adaptation.saa.SAAStandardModeSceneWrapperActivity;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaState;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AwS587S0100000_8;

/* JADX INFO: loaded from: classes9.dex */
public class SelectMaterialScene extends MvChoosePhotoScene implements C0MGE, InterfaceC524950KiL, C0MWS, InterfaceC531200KsQ {
    public final ArrayList<InterfaceC484050IyZ> H0 = new ArrayList<>();
    public final ArrayList<InterfaceC362610EJn> I0 = new ArrayList<>();
    public final C01GW J0 = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(123));

    public SelectMaterialScene() {
        disableSupportRestore();
    }

    @Override // X.InterfaceC531200KsQ
    public final void LJZ() {
        View viewFindViewById = findViewById(R.id.tsc);
        if (viewFindViewById != null) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene, X.AbstractC214814194y, com.bytedance.scene.Scene
    public final void onStart() {
        super.onStart();
        View viewFindViewById = findViewById(R.id.tsc);
        if (viewFindViewById != null) {
            C786410Ut5.LJLLLLLL(0, viewFindViewById);
        }
    }

    @Override // X.C0MWS
    public final C0LE3 getType() {
        return C0LE3.SELECT_MATERIAL;
    }

    @Override // X.InterfaceC524950KiL
    public final void AH(InterfaceC362610EJn interfaceC362610EJn) {
        ListProtector.add(this.I0, 0, interfaceC362610EJn);
    }

    @Override // X.C0MWS
    public final void LJLL(boolean z) {
        View viewFindViewById;
        if (((Boolean) this.J0.getValue()).booleanValue() && (viewFindViewById = findViewById(R.id.tsc)) != null) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById);
        }
    }

    @Override // X.InterfaceC524950KiL
    public final void Qh(InterfaceC484050IyZ interfaceC484050IyZ) {
        this.H0.add(interfaceC484050IyZ);
    }

    @Override // X.InterfaceC524950KiL
    public final void T4(InterfaceC484050IyZ interfaceC484050IyZ) {
        this.H0.remove(interfaceC484050IyZ);
    }

    @Override // X.InterfaceC524950KiL
    public final void b8(InterfaceC362610EJn interfaceC362610EJn) {
        this.I0.remove(interfaceC362610EJn);
    }

    @Override // X.InterfaceC524950KiL
    public final void kF(InterfaceC362610EJn interfaceC362610EJn) {
        this.I0.add(interfaceC362610EJn);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene, X.AbstractC214814194y, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (((Boolean) C258760ACc.LIZ.getValue()).booleanValue()) {
            Activity activity = this.mActivity;
            if (((activity instanceof SAAStandardModeSceneWrapperActivity) || (activity instanceof SAAStandardModeActivity)) && activity != null) {
                C569770MWh.LIZLLL(getStartAnimationType(), activity);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene, X.AbstractC214814194y
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ArrayList<InterfaceC362610EJn> arrayList = this.I0;
        if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
            Iterator<InterfaceC362610EJn> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (it2.next().onKeyDown(i, keyEvent)) {
                    return true;
                }
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene, X.AbstractC214814194y, com.bytedance.scene.Scene
    public void onViewCreated(View view, Bundle bundle) {
        C1DRG c1drg;
        InterfaceC1452360nti interfaceC1452360nti;
        SurfaceView surfaceViewLJIJJLI;
        super.onViewCreated(view, bundle);
        if (C0BTN.LIZ()) {
            List<Scene> sceneList = C1447800nmM.LIZIZ(this).getSceneList();
            if (((ArrayList) sceneList).size() == 1 && (C13LP.LJJJLZIJ(0, sceneList) instanceof SelectMaterialScene) && (c1drg = ((FeatureAlsLogicContainer) C1664600tQ2.LJ(this)).LLJJI) != null && (interfaceC1452360nti = (InterfaceC1452360nti) c1drg.LJIIL(null, InterfaceC1452360nti.class)) != null && (surfaceViewLJIJJLI = interfaceC1452360nti.LJIJJLI()) != null) {
                C786410Ut5.LLIIII(surfaceViewLJIJJLI, 8);
            }
        }
        ChooseMediaViewModel chooseMediaViewModel = this.chooseMediaViewModel;
        if (chooseMediaViewModel != null) {
            BaseJediViewModel.iR2(chooseMediaViewModel, this, new C2217381BqS() { // from class: X.0Kp4
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((ChooseMediaState) obj).getMobReEnterUploadPage();
                }
            }, new AwS587S0100000_8(this, 91));
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene, X.AbstractC1447660nm8, X.C19A3, com.bytedance.scene.Scene
    public ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LLLLJ(new AwS587S0100000_8(this, 90));
        InterfaceC20597015ii interfaceC20597015iiLJ = C20622515mp.LJ(this);
        if (interfaceC20597015iiLJ != null) {
            interfaceC20597015iiLJ.ac(this);
        }
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // X.AbstractC214814194y
    public final boolean onInterceptActivityResult(int i, int i2, Intent intent) {
        Iterator<InterfaceC484050IyZ> it2 = this.H0.iterator();
        while (it2.hasNext()) {
            if (it2.next().onActivityResult(i, i2, intent)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene, X.AbstractC1447660nm8, X.C19A3, com.bytedance.scene.Scene
    public /* bridge */ /* synthetic */ View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return onCreateView(layoutInflater, viewGroup, bundle);
    }
}
