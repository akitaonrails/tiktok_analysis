package com.ss.android.ugc.gamora.editorpro.capabilities.video.crop;

import X.AbstractC214814194y;
import X.C01GW;
import X.C0E1T;
import X.C0E47;
import X.C0E48;
import X.C0EU6;
import X.C0FDF;
import X.C0FXH;
import X.C0TVI;
import X.C1447800nmM;
import X.C14K9;
import X.C1654320t9S;
import X.C1664590tQ1;
import X.C1664600tQ2;
import X.C1DRG;
import X.C20622515mp;
import X.C350870DpF;
import X.C351220Dpo;
import X.C357280Dza;
import X.C357780E0y;
import X.C361680EFy;
import X.C374980En2;
import X.C375080EnC;
import X.C377060EqO;
import X.C418440Gaw;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC375190EnN;
import X.InterfaceC361710EGb;
import X.InterfaceC374530EmJ;
import X.InterfaceC374650EmV;
import X.InterfaceC374920Emw;
import X.InterfaceC374950Emz;
import X.InterfaceC375010En5;
import X.InterfaceC375020En6;
import X.InterfaceC375030En7;
import X.InterfaceC376240Ep4;
import X.ViewTreeObserverOnPreDrawListenerC337150DJp;
import Y.ARunnableS74S0200000_5;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.als.FeatureAlsLogicContainer;
import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.INLEPurePlayer;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEEditorListener;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.scene.navigation.NavigationScene;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editorpro.framework.datastore.EditModelProvider;
import com.ss.ugc.android.editor.components.base.api.IPreviewService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: loaded from: classes6.dex */
public final class VideoCropRootScene extends AbstractC214814194y {
    public InterfaceC374920Emw LLJJIJIL;
    public InterfaceC374950Emz LLJJJ;
    public InterfaceC375020En6 LLJJJIL;
    public InterfaceC375010En5 LLJJJJ;
    public InterfaceC375030En7 LLJJJJJIL;
    public InterfaceC374530EmJ LLJJJJLIIL;
    public C0E48 LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 707));
    public final C374980En2 LLJLIL = new C0FDF() { // from class: X.0En2
        @Override // X.C0FDF
        public final void LIZ(EnumC373600Eko enumC373600Eko) {
            InterfaceC375020En6 interfaceC375020En6 = this.LIZ.LLJJJIL;
            if (interfaceC375020En6 != null) {
                interfaceC375020En6.b5(enumC373600Eko);
            }
        }

        @Override // X.C0FDF
        public final void LIZIZ(long j, boolean z) {
            InterfaceC375010En5 interfaceC375010En5;
            InterfaceC375020En6 interfaceC375020En6 = this.LIZ.LLJJJIL;
            if (interfaceC375020En6 != null) {
                interfaceC375020En6.Y3(j);
            }
            if (!z && (interfaceC375010En5 = this.LIZ.LLJJJJ) != null) {
                interfaceC375010En5.Y3(j);
            }
        }
    };

    public final void LLLLJI() {
        INLEMediaSession iNLEMediaSessionF1;
        ViewGroup viewGroup;
        C0E48 c0e48 = this.LLJJL;
        if (c0e48 == null || (iNLEMediaSessionF1 = c0e48.f1()) == null) {
            return;
        }
        if (!c0e48.sg()) {
            iNLEMediaSessionF1.getPlayerApi().unbindSurfaceView();
        }
        SurfaceView surfaceViewLJIJJLI = LJIJJLI();
        if (surfaceViewLJIJJLI != null) {
            C786410Ut5.LLIIII(surfaceViewLJIJJLI, 8);
            ViewParent parent = surfaceViewLJIJJLI.getParent();
            if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                C786410Ut5.LJJJLZIJ(surfaceViewLJIJJLI, viewGroup);
            }
            if (!c0e48.sg()) {
                INLEPurePlayer.DefaultImpls.bindSurfaceView$default(iNLEMediaSessionF1.getPlayerApi(), surfaceViewLJIJJLI, false, 2, null);
            }
        }
        c0e48.getPlayer().LJJIIJ();
        iNLEMediaSessionF1.updateNLEEditor(c0e48.LLFII().LJI());
        iNLEMediaSessionF1.setDataSource(C350870DpF.LJI(c0e48));
        iNLEMediaSessionF1.getPlayerApi().prepare();
    }

    public final SurfaceView LJIJJLI() {
        InterfaceC361710EGb previewPanelApi;
        IPreviewService iPreviewServiceLIZ = C357280Dza.LIZ();
        if (iPreviewServiceLIZ == null || (previewPanelApi = iPreviewServiceLIZ.getPreviewPanelApi()) == null) {
            return null;
        }
        return previewPanelApi.LJIJJLI();
    }

    @Override // X.AbstractC214814194y, X.C198H
    public final boolean onBackPressed() {
        NavigationScene navigationSceneLIZ = C1447800nmM.LIZ(this);
        if (!((navigationSceneLIZ != null ? navigationSceneLIZ.LLLLIIIILLL() : null) instanceof VideoCropRootScene)) {
            return false;
        }
        exit(true);
        return true;
    }

    @Override // X.AbstractC214814194y, com.bytedance.scene.Scene
    public final void onPause() {
        super.onPause();
        InterfaceC374920Emw interfaceC374920Emw = this.LLJJIJIL;
        if (interfaceC374920Emw != null) {
            interfaceC374920Emw.pause();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void exit(boolean r9) {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editorpro.capabilities.video.crop.VideoCropRootScene.exit(boolean):void");
    }

    @Override // X.AbstractC214814194y, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        Bundle bundle2;
        String string;
        Bundle bundle3;
        Long lValueOf;
        long jLongValue;
        NLEEditor nLEEditorLF2;
        NLEModel model;
        NLETrackSlot slotByIndex;
        int iOrdinal;
        C0E48 c0e48;
        INLEMediaSession iNLEMediaSessionF1;
        NLEEditor nLEEditorLF22;
        NavigationScene navigationSceneLIZ;
        super.onActivityCreated(bundle);
        if (C20622515mp.LJ(this) == null && (navigationSceneLIZ = C1447800nmM.LIZ(this)) != null) {
            navigationSceneLIZ.LLLIILIL(this, new C0FXH(this, 6));
        }
        if (C0E47.LIZ()) {
            C1654320t9S.LIZIZ(this, AFwS234S0000000_5.get$arr$(481));
            C1664590tQ1.LIZLLL(this, "VideoCropRootScene", false, new AwS584S0100000_5(this, 1021), 2);
            C1664600tQ2.LIZ(this, "VideoCropRootScene", new AwS584S0100000_5(this, 1023));
            C1DRG c1drg = ((FeatureAlsLogicContainer) C1664600tQ2.LJ(this)).LLJJI;
            if (c1drg != null) {
                this.LLJJIJIL = (InterfaceC374920Emw) c1drg.LJIIL(null, InterfaceC374920Emw.class);
                this.LLJJJ = (InterfaceC374950Emz) c1drg.LJIIL(null, InterfaceC374950Emz.class);
                this.LLJJJIL = (InterfaceC375020En6) c1drg.LJIIL(null, InterfaceC375020En6.class);
                this.LLJJJJ = (InterfaceC375010En5) c1drg.LJIIL(null, InterfaceC375010En5.class);
                this.LLJJJJJIL = (InterfaceC375030En7) c1drg.LJIIL(null, InterfaceC375030En7.class);
                this.LLJJJJLIIL = (InterfaceC374530EmJ) c1drg.LJIIL(null, InterfaceC374530EmJ.class);
                InterfaceC374920Emw interfaceC374920Emw = this.LLJJIJIL;
                if (interfaceC374920Emw != null && (nLEEditorLF22 = interfaceC374920Emw.LF2()) != null) {
                    nLEEditorLF22.addConsumer(new NLEEditorListener() { // from class: X.0En0
                        @Override // com.bytedance.ies.nle.editor_jni.NLEEditorListener
                        public final void onChanged() {
                            NLEEditor nLEEditorLF23;
                            NLEModel model2;
                            InterfaceC374950Emz interfaceC374950Emz;
                            InterfaceC374920Emw interfaceC374920Emw2 = this.LIZ.LLJJIJIL;
                            if (interfaceC374920Emw2 == null || (nLEEditorLF23 = interfaceC374920Emw2.LF2()) == null || (model2 = nLEEditorLF23.getModel()) == null || (interfaceC374950Emz = this.LIZ.LLJJJ) == null) {
                                return;
                            }
                            interfaceC374950Emz.yc(model2);
                        }
                    });
                }
                if (LJIJJLI() != null && (bundle2 = this.mArguments) != null && (string = bundle2.getString("extra_editor_pro_crop_nle_model")) != null && (bundle3 = this.mArguments) != null) {
                    long j = bundle3.getLong("extra_editor_pro_crop_seek_position");
                    Bundle bundle4 = this.mArguments;
                    if (bundle4 != null) {
                        lValueOf = Long.valueOf(bundle4.getLong("extra_crop_click_time"));
                    } else {
                        lValueOf = null;
                    }
                    C0EU6 c0eu6 = (C0EU6) this.LLJL.getValue();
                    if (lValueOf != null) {
                        jLongValue = lValueOf.longValue();
                    } else {
                        jLongValue = 0;
                    }
                    c0eu6.LJIIIZ = jLongValue;
                    InterfaceC374920Emw interfaceC374920Emw2 = this.LLJJIJIL;
                    if (interfaceC374920Emw2 != null) {
                        C0E48 c0e482 = this.LLJJL;
                        if (c0e482 != null) {
                            iNLEMediaSessionF1 = c0e482.f1();
                        } else {
                            iNLEMediaSessionF1 = null;
                        }
                        interfaceC374920Emw2.gP(iNLEMediaSessionF1, string, j);
                    }
                    InterfaceC374920Emw interfaceC374920Emw3 = this.LLJJIJIL;
                    if (interfaceC374920Emw3 != null) {
                        interfaceC374920Emw3.ib1();
                    }
                    InterfaceC374920Emw interfaceC374920Emw4 = this.LLJJIJIL;
                    if (interfaceC374920Emw4 != null && (nLEEditorLF2 = interfaceC374920Emw4.LF2()) != null && (model = nLEEditorLF2.getModel()) != null && (slotByIndex = model.getMainTrack().getSlotByIndex(0)) != null) {
                        InterfaceC374950Emz interfaceC374950Emz = this.LLJJJ;
                        if (interfaceC374950Emz != null) {
                            interfaceC374950Emz.vL2("VideoCropMaterial", new C375080EnC(c1drg));
                            interfaceC374950Emz.ow0("VideoCropMaterial");
                            interfaceC374950Emz.NA0(model.getMainTrack(), slotByIndex);
                        }
                        InterfaceC374920Emw interfaceC374920Emw5 = this.LLJJIJIL;
                        if (interfaceC374920Emw5 != null) {
                            interfaceC374920Emw5.mS0(this.LLJLIL);
                        }
                        long measuredEndTime = (slotByIndex.getMeasuredEndTime() - slotByIndex.getMeasuredStartTime()) / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
                        InterfaceC375020En6 interfaceC375020En6 = this.LLJJJIL;
                        if (interfaceC375020En6 != null) {
                            interfaceC375020En6.y2(measuredEndTime);
                            interfaceC375020En6.Y3(j);
                        }
                        InterfaceC375010En5 interfaceC375010En5 = this.LLJJJJ;
                        if (interfaceC375010En5 != null) {
                            interfaceC375010En5.y2(measuredEndTime);
                            interfaceC375010En5.lu2(slotByIndex);
                            interfaceC375010En5.Y3(j);
                        }
                        InterfaceC375030En7 interfaceC375030En7 = this.LLJJJJJIL;
                        if (interfaceC375030En7 != null) {
                            interfaceC375030En7.fq2(new InterfaceC376240Ep4() { // from class: X.0Emu
                                @Override // X.InterfaceC376240Ep4
                                public final boolean LIZ(EnumC375190EnN enumC375190EnN, boolean z) {
                                    C0E48 c0e483;
                                    C375080EnC c375080EnC;
                                    InterfaceC374920Emw interfaceC374920Emw6 = this.LIZ.LLJJIJIL;
                                    if (interfaceC374920Emw6 != null) {
                                        interfaceC374920Emw6.pause();
                                    }
                                    InterfaceC374950Emz interfaceC374950Emz2 = this.LIZ.LLJJJ;
                                    if (interfaceC374950Emz2 != null && (c375080EnC = (C375080EnC) interfaceC374950Emz2.kG("VideoCropMaterial")) != null) {
                                        c375080EnC.LJIL(enumC375190EnN);
                                    }
                                    if (z) {
                                        this.LIZ.getClass();
                                        EditModelProvider.Companion.getClass();
                                        VideoPublishEditModel editModel = C0E1T.LIZ().getEditModel();
                                        if (editModel != null && (c0e483 = this.LIZ.LLJJL) != null) {
                                            C361680EFy.LJJJJIZL(enumC375190EnN, editModel, c0e483);
                                            return true;
                                        }
                                        return true;
                                    }
                                    return true;
                                }
                            });
                            EnumC375190EnN[] enumC375190EnNArrValues = EnumC375190EnN.values();
                            Integer numLJJJLZIJ = C351220Dpo.LJJJLZIJ(slotByIndex, "ep_crop_mode", null);
                            if (numLJJJLZIJ != null) {
                                iOrdinal = numLJJJLZIJ.intValue();
                            } else {
                                iOrdinal = EnumC375190EnN.FREE.ordinal();
                            }
                            EnumC375190EnN enumC375190EnN = enumC375190EnNArrValues[iOrdinal];
                            interfaceC375030En7.zy1(enumC375190EnN);
                            EditModelProvider.Companion.getClass();
                            VideoPublishEditModel editModel = C0E1T.LIZ().getEditModel();
                            if (editModel != null && (c0e48 = this.LLJJL) != null) {
                                C361680EFy.LJJJJIZL(enumC375190EnN, editModel, c0e48);
                            }
                        }
                        InterfaceC374530EmJ interfaceC374530EmJ = this.LLJJJJLIIL;
                        if (interfaceC374530EmJ != null) {
                            interfaceC374530EmJ.setTitle(getString(2131833368));
                        }
                        InterfaceC374530EmJ interfaceC374530EmJ2 = this.LLJJJJLIIL;
                        if (interfaceC374530EmJ2 != null && C357780E0y.LIZ()) {
                            interfaceC374530EmJ2.s00(new C377060EqO(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), Integer.valueOf(R.raw.icon_tick), Integer.valueOf(R.raw.icon_arrow_counter_clockwise)));
                        }
                        InterfaceC374530EmJ interfaceC374530EmJ3 = this.LLJJJJLIIL;
                        if (interfaceC374530EmJ3 != null) {
                            interfaceC374530EmJ3.u11(new InterfaceC374650EmV() { // from class: X.0Emv
                                @Override // X.InterfaceC374650EmV
                                public final void LIZ() {
                                    this.LIZ.exit(false);
                                }

                                @Override // X.InterfaceC374650EmV
                                public final void onCancel() {
                                    C375080EnC c375080EnC;
                                    C375140EnI c375140EnI;
                                    C389830FQf c389830FQf;
                                    InterfaceC374920Emw interfaceC374920Emw6 = this.LIZ.LLJJIJIL;
                                    if (interfaceC374920Emw6 != null) {
                                        interfaceC374920Emw6.pause();
                                    }
                                    InterfaceC375030En7 interfaceC375030En72 = this.LIZ.LLJJJJJIL;
                                    if (interfaceC375030En72 != null) {
                                        interfaceC375030En72.zy1(EnumC375190EnN.FREE);
                                    }
                                    InterfaceC374950Emz interfaceC374950Emz2 = this.LIZ.LLJJJ;
                                    if (interfaceC374950Emz2 == null || (c375080EnC = (C375080EnC) interfaceC374950Emz2.kG("VideoCropMaterial")) == null || (c389830FQf = (c375140EnI = c375080EnC.LLJ).LLJILJIL) == null) {
                                        return;
                                    }
                                    c375140EnI.LJJ(c389830FQf.LIZIZ(c389830FQf.LIZJ(EnumC375190EnN.ORIGIN)), EnumC375190EnN.FREE);
                                }
                            });
                        }
                    }
                }
                SurfaceView surfaceViewLJIJJLI = LJIJJLI();
                if (surfaceViewLJIJJLI != null) {
                    C786410Ut5.LLIIII(surfaceViewLJIJJLI, 0);
                    return;
                }
                return;
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        NavigationScene navigationSceneLIZ2 = C1447800nmM.LIZ(this);
        if (navigationSceneLIZ2 == null) {
            return;
        }
        navigationSceneLIZ2.LLLLLL();
    }

    @Override // X.AbstractC214814194y, com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (Build.VERSION.SDK_INT >= 35) {
            C14K9.LJIJJ(view, new C0TVI() { // from class: X.0F75
                @Override // X.C0TVI
                public final C20246014Ju onApplyWindowInsets(View view2, C20246014Ju c20246014Ju) {
                    C20244914Jj c20244914JjLIZ = c20246014Ju.LIZ(7);
                    view2.setPadding(c20244914JjLIZ.LIZ, c20244914JjLIZ.LIZIZ, c20244914JjLIZ.LIZJ, c20244914JjLIZ.LIZLLL);
                    return c20246014Ju;
                }
            });
        }
    }

    @Override // X.AbstractC1447660nm8, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2;
        ConstraintLayout constraintLayout = (ConstraintLayout) C786410Ut5.Td(layoutInflater, R.layout.c0h, viewGroup, false);
        SurfaceView surfaceViewLJIJJLI = LJIJJLI();
        if (surfaceViewLJIJJLI != null) {
            ViewParent parent = surfaceViewLJIJJLI.getParent();
            if ((parent instanceof ViewGroup) && (viewGroup2 = (ViewGroup) parent) != null) {
                C786410Ut5.LJJJLZIJ(surfaceViewLJIJJLI, viewGroup2);
            }
            C786410Ut5.Nb(surfaceViewLJIJJLI, 1.0f);
            C786410Ut5.oc(surfaceViewLJIJJLI, 1.0f);
            C786410Ut5.dd(surfaceViewLJIJJLI, 0.0f);
            ((ViewGroup) constraintLayout.findViewById(R.id.wq9)).addView(surfaceViewLJIJJLI, 0, new FrameLayout.LayoutParams(-1, -1));
            constraintLayout.setOnTouchListener(new View.OnTouchListener() { // from class: X.0ELt
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return true;
                }
            });
            ViewTreeObserverOnPreDrawListenerC337150DJp.LIZ(constraintLayout, new ARunnableS74S0200000_5(constraintLayout, this, 28));
        }
        return constraintLayout;
    }
}
