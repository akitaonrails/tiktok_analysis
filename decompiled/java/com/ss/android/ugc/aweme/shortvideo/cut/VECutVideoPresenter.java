package com.ss.android.ugc.aweme.shortvideo.cut;

import X.C01GW;
import X.C082O;
import X.C0WIY;
import X.C13LP;
import X.C1411560mpu;
import X.C15O7;
import X.C1637890six;
import X.C19733712It;
import X.C19EG;
import X.C201955140j;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2347509Ht;
import X.C290820Baa;
import X.C338630DPh;
import X.C348100Dkm;
import X.C352130DrH;
import X.C452501pT;
import X.C533730KwV;
import X.C536270L1l;
import X.C571570MbL;
import X.C571620MbQ;
import X.C574160MfW;
import X.C574550Mg9;
import X.C574570MgB;
import X.C574580MgC;
import X.C574620MgG;
import X.C574630MgH;
import X.C574730MgR;
import X.C574750MgT;
import X.InterfaceC1452170ntP;
import X.InterfaceC574500Mg4;
import X.InterfaceC574610MgF;
import Y.ACallableS415S0100000_8;
import Y.AObserverS212S0100000_8;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.VEVideoCutterViewModel;
import com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.DiyPropUploadVideoAutoCutConfigure;
import dmt.av.video.VEEditorAutoStartStopArbiter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class VECutVideoPresenter implements GenericLifecycleObserver {
    public final String LL;
    public final InterfaceC574500Mg4 LLILLJJLI;
    public boolean LLILLL;
    public final CreativeInfo LLILZ;
    public long LLIZLLLIL;
    public boolean LLJI;
    public float LLJIJIL;
    public boolean LLJILJILJ;
    public C574620MgG LLJILLL;
    public InterfaceC1452170ntP LLJJ;
    public C574550Mg9 LLJJI;
    public CutMultiVideoViewModel LLJJIII;
    public VEVideoCutterViewModel LLJJIJI;
    public VideoEditViewModel LLJJIJIIJIL;
    public C574580MgC LLJJJIL;
    public boolean LLJJJJ;
    public boolean LLJJJJJIL;
    public long LLJJJJLIIL;
    public long LLJJL;
    public VEEditorAutoStartStopArbiter LLJJLIIIJLLLLLLLZ;
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 174));
    public int LLILZLL = -1;
    public boolean LLIZ = true;
    public final boolean LLJ = true;
    public int LLJILJIL = C19733712It.LIZIZ(true, false, false, false);
    public final C574570MgB LLJJIJIL = new C574570MgB();
    public final C574160MfW LLJJJ = new C574160MfW();

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_RESUME) {
            performInit();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            destroy();
        }
    }

    public final int LIZLLL() {
        VideoEditViewModel videoEditViewModel = this.LLJJIJIIJIL;
        if (videoEditViewModel == null) {
            videoEditViewModel = null;
        }
        if (videoEditViewModel.zQ2().size() == 1) {
            return 1;
        }
        VideoEditViewModel videoEditViewModel2 = this.LLJJIJIIJIL;
        List<VideoSegment> listZQ2 = (videoEditViewModel2 != null ? videoEditViewModel2 : null).zQ2();
        ArrayList arrayList = new ArrayList();
        for (VideoSegment videoSegment : listZQ2) {
            if (!videoSegment.isDeleted) {
                arrayList.add(videoSegment);
            }
        }
        return arrayList.size() > 1 ? 2 : 3;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void destroy() {
        if (this.LLJILJILJ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("VECutVideoPresenter Destroy method stack: \n");
            sbLIZ.append(C082O.LIZ());
            C201955140j.LJIIL(C2188811AlT.LIZIZ(sbLIZ));
            this.LLJILJILJ = false;
            InterfaceC1452170ntP interfaceC1452170ntP = this.LLJJ;
            if (interfaceC1452170ntP != null) {
                interfaceC1452170ntP.destroy();
            }
            this.LLILLJJLI.LJJLIIJ();
            if (this.LLJILLL != null) {
                this.LLJILLL = null;
            }
            this.LLJJIJIL.getClass();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x0251, code lost:
    
        if (r5 != 0) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0271  */
    /* JADX WARN: Type inference failed for: r15v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r15v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r5v69, types: [X.0MgC] */
    /* JADX WARN: Type inference failed for: r5v71, types: [X.0Mg9] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @androidx.lifecycle.OnLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_RESUME)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void performInit() {
        /*
            Method dump skipped, instruction units count: 833
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter.performInit():void");
    }

    public static void LIZIZ(Function0 function0) {
        C15O7.LIZIZ(new ACallableS415S0100000_8(function0, 3), C15O7.LJIIIIZZ, null);
    }

    public static final boolean LJ(VECutVideoPresenter vECutVideoPresenter) {
        int iLJ;
        VideoEditViewModel videoEditViewModel = vECutVideoPresenter.LLJJIJIIJIL;
        if (videoEditViewModel == null) {
            videoEditViewModel = null;
        }
        List<VideoSegment> listZQ2 = videoEditViewModel.zQ2();
        ArrayList arrayList = new ArrayList();
        for (VideoSegment videoSegment : listZQ2) {
            if (true ^ videoSegment.isDeleted) {
                arrayList.add(videoSegment);
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            VideoSegment videoSegment2 = (VideoSegment) ListProtector.get(arrayList, i);
            C533730KwV c533730KwV = C533730KwV.LIZ;
            String strLJFF = videoSegment2.LJFF(false);
            c533730KwV.getClass();
            if (C533730KwV.LJIIJ(strLJFF)) {
                vECutVideoPresenter.LLILZLL = -11009;
                if (C338630DPh.LIZ() && (!C1411560mpu.LIZIZ)) {
                    return true;
                }
                return false;
            }
            int iMin = Math.min(videoSegment2.width, videoSegment2.height);
            int iMax = Math.max(videoSegment2.width, videoSegment2.height);
            try {
                if (C338630DPh.LIZ()) {
                    iLJ = videoSegment2.LJ();
                } else {
                    iLJ = (int) (videoSegment2.LJ() * videoSegment2.LJI());
                }
                Pair pairLIZ = C571570MbL.LIZ(iMin, iMax, iLJ, videoSegment2.LIZJ());
                vECutVideoPresenter.LLILZLL = ((Number) pairLIZ.getFirst()).intValue();
                videoSegment2.fastImportDependHW = ((Boolean) pairLIZ.getSecond()).booleanValue();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C201955140j.LJ(e.getMessage());
            }
            if (vECutVideoPresenter.LLILZLL != 0) {
                return false;
            }
        }
        return true;
    }

    public final void LIZ(C19EG c19eg) {
        String stringExtra;
        this.LLJJIII = (CutMultiVideoViewModel) ViewModelProviders.of(c19eg).get(CutMultiVideoViewModel.class);
        this.LLJJIJI = (VEVideoCutterViewModel) ViewModelProviders.of(c19eg).get(VEVideoCutterViewModel.class);
        this.LLJJIJIIJIL = (VideoEditViewModel) ViewModelProviders.of(c19eg).get(VideoEditViewModel.class);
        VEVideoCutterViewModel vEVideoCutterViewModel = null;
        try {
            stringExtra = c19eg.getIntent().getStringExtra("enter_from");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            stringExtra = null;
        }
        this.LLJJJJ = Intrinsics.LJFF("from_chat", stringExtra);
        this.LLJJJJJIL = c19eg.getIntent().getBooleanExtra("key_is_camera_green_screen_pick_material", false);
        this.LLILLJJLI.LJLZ().getLifecycle().addObserver(this);
        VEVideoCutterViewModel vEVideoCutterViewModel2 = this.LLJJIJI;
        if (vEVideoCutterViewModel2 != null) {
            vEVideoCutterViewModel = vEVideoCutterViewModel2;
        }
        ((LiveData) vEVideoCutterViewModel.LL.getValue()).observe(this.LLILLJJLI.LJLZ(), new AObserverS212S0100000_8(this, 87));
    }

    public final void LJII(C0WIY<Long, Long> c0wiy) {
        long jLongValue;
        long jLJJLIIIJJIZ = this.LLILLJJLI.LJJLIIIJJIZ();
        Long l = c0wiy.LIZ;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        Long l2 = c0wiy.LIZIZ;
        if (l2 != null) {
            jLJJLIIIJJIZ = l2.longValue();
        }
        int i = (int) jLongValue;
        int i2 = (int) jLJJLIIIJJIZ;
        C574730MgR c574730MgR = this.LLJJIJIL.LIZ;
        if (c574730MgR != null) {
            c574730MgR.LIZ.uf(i, i2);
        }
    }

    public VECutVideoPresenter(String str, InterfaceC574500Mg4 interfaceC574500Mg4, boolean z, CreativeInfo creativeInfo) {
        this.LL = str;
        this.LLILLJJLI = interfaceC574500Mg4;
        this.LLILLL = z;
        this.LLILZ = creativeInfo;
    }

    public static void LJFF(int i, long j, long j2, CutVideoCompileSettings cutVideoCompileSettings, int i2, String str) {
        C1637890six.LJ("av_ve_import_compile", i, C2347509Ht.LIZ(C2097608Jq.LJIIIIZZ(new Pair("fps_time", String.valueOf(j)), new Pair("compile_time", String.valueOf(j2)), new Pair("is_hard_encode", String.valueOf(cutVideoCompileSettings.LIZLLL)), new Pair("fps", String.valueOf(cutVideoCompileSettings.LIZJ)), new Pair("errorCode", String.valueOf(i2)), new Pair("error_message", str))));
    }

    public static void LIZJ(final VECutVideoPresenter vECutVideoPresenter, final Workspace workspace, final CutVideoCompileConfigure cutVideoCompileConfigure, boolean z, final InterfaceC574610MgF interfaceC574610MgF, boolean z2, DiyPropUploadVideoAutoCutConfigure diyPropUploadVideoAutoCutConfigure, int i) {
        boolean z3;
        long j;
        boolean z4;
        boolean zLJ;
        VideoSegment videoSegment;
        InterfaceC1452170ntP interfaceC1452170ntP;
        C348100Dkm c348100DkmLIZIZ;
        final DiyPropUploadVideoAutoCutConfigure diyPropUploadVideoAutoCutConfigure2 = diyPropUploadVideoAutoCutConfigure;
        if ((i & 16) != 0) {
            z2 = false;
        }
        if ((i & 64) != 0) {
            diyPropUploadVideoAutoCutConfigure2 = null;
        }
        if (!vECutVideoPresenter.LLJILJILJ) {
            C201955140j.LIZ("VECutVideo,return compile because of editor not init");
            return;
        }
        long jLIZ = 0;
        if (C290820Baa.LIZ() && (interfaceC1452170ntP = vECutVideoPresenter.LLJJ) != null && (c348100DkmLIZIZ = C352130DrH.LIZIZ(interfaceC1452170ntP)) != null) {
            NLETrackSlot nLETrackSlot = (NLETrackSlot) C13LP.LJJJLZIJ(0, c348100DkmLIZIZ.LIZ.getModel().getMainTrack().getSlots());
            if (nLETrackSlot != null) {
                nLETrackSlot.setStartTime(0L);
                nLETrackSlot.setEndTime((vECutVideoPresenter.LLJJL - vECutVideoPresenter.LLJJJJLIIL) * 1000);
                NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
                if (nLESegmentVideoDynamicCast != null) {
                    nLESegmentVideoDynamicCast.setTimeClipStart(vECutVideoPresenter.LLJJJJLIIL * 1000);
                    nLESegmentVideoDynamicCast.setTimeClipEnd(vECutVideoPresenter.LLJJL * 1000);
                }
            }
            c348100DkmLIZIZ.LIZ.commit();
        }
        if (cutVideoCompileConfigure != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        VideoEditViewModel videoEditViewModel = vECutVideoPresenter.LLJJIJIIJIL;
        if (videoEditViewModel == null) {
            videoEditViewModel = null;
        }
        List<VideoSegment> listZQ2 = videoEditViewModel.zQ2();
        if (listZQ2 != null && (videoSegment = (VideoSegment) C13LP.LJJJLZIJ(0, listZQ2)) != null) {
            j = videoSegment.duration;
        } else {
            j = -1;
        }
        CutMultiVideoViewModel cutMultiVideoViewModel = vECutVideoPresenter.LLJJIII;
        if (cutMultiVideoViewModel == null) {
            cutMultiVideoViewModel = null;
        }
        if (j > cutMultiVideoViewModel.LLJILLL) {
            VideoEditViewModel videoEditViewModel2 = vECutVideoPresenter.LLJJIJIIJIL;
            if (videoEditViewModel2 == null) {
                videoEditViewModel2 = null;
            }
            C536270L1l.LIZ(videoEditViewModel2.zQ2());
        }
        C574620MgG c574620MgG = vECutVideoPresenter.LLJILLL;
        if (c574620MgG != null) {
            z4 = c574620MgG.LIZJ().LLILZ;
        } else {
            z4 = false;
        }
        vECutVideoPresenter.LLJI = z4;
        VEVideoCutterViewModel vEVideoCutterViewModel = vECutVideoPresenter.LLJJIJI;
        if (vEVideoCutterViewModel == null) {
            vEVideoCutterViewModel = null;
        }
        vEVideoCutterViewModel.vQ2(new C574630MgH(2, true));
        C574620MgG c574620MgG2 = vECutVideoPresenter.LLJILLL;
        if (c574620MgG2 != null) {
            jLIZ = c574620MgG2.LIZ();
        }
        vECutVideoPresenter.LLIZLLLIL = jLIZ;
        if (z) {
            vECutVideoPresenter.LLILZLL = -11008;
        } else if (!z3) {
            if (vECutVideoPresenter.LLILLJJLI.LJJLIIIJ() == 0) {
                zLJ = LJ(vECutVideoPresenter);
            } else {
                zLJ = LJ(vECutVideoPresenter);
            }
            if (zLJ && !z2) {
                C574750MgT c574750MgT = C574750MgT.LIZ;
                int iLIZLLL = vECutVideoPresenter.LIZLLL();
                String strValueOf = String.valueOf(vECutVideoPresenter.LLILZLL);
                c574750MgT.getClass();
                C574750MgT.LJFF(iLIZLLL, strValueOf, true);
                interfaceC574610MgF.LIZ(true);
                C201955140j.LIZ("VECutVideo,using fastImport strategy");
                interfaceC574610MgF.onCompileDone();
                if (((Boolean) vECutVideoPresenter.LLILZIL.getValue()).booleanValue()) {
                    InterfaceC1452170ntP interfaceC1452170ntP2 = vECutVideoPresenter.LLJJ;
                    if (interfaceC1452170ntP2 != null) {
                        interfaceC1452170ntP2.stop();
                    }
                    InterfaceC1452170ntP interfaceC1452170ntP3 = vECutVideoPresenter.LLJJ;
                    if (interfaceC1452170ntP3 != null) {
                        interfaceC1452170ntP3.releaseResource();
                    }
                    vECutVideoPresenter.LLJILJILJ = false;
                    if (vECutVideoPresenter.LLJILLL == null) {
                        return;
                    }
                    vECutVideoPresenter.LLJILLL = null;
                    if (vECutVideoPresenter.LLJJLIIIJLLLLLLLZ == null) {
                        return;
                    }
                    vECutVideoPresenter.LLILLJJLI.LJLZ().getLifecycle().removeObserver(vECutVideoPresenter.LLJJLIIIJLLLLLLLZ);
                    return;
                }
                vECutVideoPresenter.destroy();
                return;
            }
        }
        interfaceC574610MgF.LIZ(false);
        C201955140j.LIZ("VECutVideo,using normalImport strategy");
        C15O7.LIZJ(new Callable() { // from class: X.0MbT
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:49:0x0178  */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object call() {
                /*
                    Method dump skipped, instruction units count: 503
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.CallableC571650MbT.call():java.lang.Object");
            }
        });
    }

    public static void LJI(VECutVideoPresenter vECutVideoPresenter, int i, float f, float f2, float f3, int i2, int i3, int i4) {
        boolean z;
        NLETrack mainTrack;
        VecNLETrackSlotSPtr sortedSlots;
        NLETimeSpaceNode nLETimeSpaceNode;
        int i5 = i3;
        int i6 = i2;
        float f4 = f2;
        if ((i4 & 4) != 0) {
            z = true;
        } else {
            z = false;
        }
        float f5 = 1.0f;
        if ((i4 & 8) != 0) {
            f4 = 1.0f;
        }
        if ((i4 & 16) == 0) {
            f5 = f3;
        }
        if ((i4 & 32) != 0) {
            i6 = 0;
        }
        if ((i4 & 64) != 0) {
            i5 = 0;
        }
        vECutVideoPresenter.LLJIJIL = f;
        if (z) {
            C574730MgR c574730MgR = vECutVideoPresenter.LLJJIJIL.LIZ;
            if (c574730MgR != null) {
                c574730MgR.LIZ(f, f4, f5, i6, i5);
                return;
            }
            return;
        }
        if (C290820Baa.LIZ()) {
            C574730MgR c574730MgR2 = vECutVideoPresenter.LLJJIJIL.LIZ;
            if (c574730MgR2 != null) {
                c574730MgR2.LIZ(0.0f, 1.0f, 1.0f, 0, 0);
            }
            InterfaceC1452170ntP interfaceC1452170ntP = vECutVideoPresenter.LLJJ;
            if (interfaceC1452170ntP == null) {
                return;
            }
            NLEModel nLEModelLIZ = C352130DrH.LIZ(interfaceC1452170ntP);
            if (nLEModelLIZ != null && (mainTrack = nLEModelLIZ.getMainTrack()) != null && (sortedSlots = mainTrack.getSortedSlots()) != null && (nLETimeSpaceNode = (NLETimeSpaceNode) C13LP.LJJJLZIJ(i, sortedSlots)) != null) {
                nLETimeSpaceNode.setRotation(360 - f);
            }
            interfaceC1452170ntP.jg();
            return;
        }
        C574730MgR c574730MgR3 = vECutVideoPresenter.LLJJIJIL.LIZ;
        if (c574730MgR3 == null) {
            return;
        }
        c574730MgR3.LIZ.Wf(i, C571620MbQ.LIZJ((int) f));
    }
}
