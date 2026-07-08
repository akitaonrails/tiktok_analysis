package l2m;

import X.AbstractC1252750ihl;
import X.AbstractC1653180t7c;
import X.C004I;
import X.C01GW;
import X.C0CIU;
import X.C0LCS;
import X.C0URV;
import X.C1170060gYO;
import X.C11DL;
import X.C11E6;
import X.C11EA;
import X.C11EC;
import X.C11EF;
import X.C1447800nmM;
import X.C1634100scq;
import X.C1644460stY;
import X.C1653340t7s;
import X.C1653390t7x;
import X.C1653510t89;
import X.C1654930tAR;
import X.C1654950tAT;
import X.C1654960tAU;
import X.C1654990tAX;
import X.C1655170tAp;
import X.C1655630tBZ;
import X.C1655640tBa;
import X.C1659630tI1;
import X.C1698360uIU;
import X.C1765020w20;
import X.C1AF0;
import X.C1DRG;
import X.C201955140j;
import X.C2188811AlT;
import X.C290640BaI;
import X.C385670FAf;
import X.C452501pT;
import X.C535500KzM;
import X.C786410Ut5;
import X.EnumC545560LaU;
import X.InterfaceC1166920gTK;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1645840svm;
import X.InterfaceC1650230t2r;
import X.InterfaceC1652190t61;
import X.InterfaceC1654970tAV;
import X.InterfaceC1654980tAW;
import X.InterfaceC1655090tAh;
import X.InterfaceC1655100tAi;
import X.InterfaceC1655110tAj;
import X.InterfaceC1655120tAk;
import X.InterfaceC1655140tAm;
import X.InterfaceC1685420txc;
import X.InterfaceC21673219ru;
import X.InterfaceC2217241BqE;
import X.InterfaceC420801kM;
import X.InterfaceC535600KzW;
import X.InterfaceC772580USi;
import X.InterfaceC772590USj;
import X.InterfaceC775450UbP;
import X.InterfaceC874803bO;
import X.InterfaceC960503pD;
import Y.AObjectS246S0100000_25;
import android.app.Activity;
import android.os.Bundle;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.scene.navigation.NavigationScene;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.component.a;
import com.ss.android.ugc.aweme.tools.live.RecordLiveViewModel;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Objects;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.jvm.internal.Intrinsics;
import l2m.b;
import lth.o;

/* JADX INFO: loaded from: classes26.dex */
public final class b extends AbstractC1653180t7c implements InterfaceC1166920gTK {
    public final C1DRG LLJILLL;
    public final C01GW LLJJ = C452501pT.LIZIZ(new AwS569S0100000_25(this, 855));
    public final C01GW LLJJI;
    public volatile boolean LLJJIII;
    public RecordLiveViewModel LLJJIJI;
    public C1654930tAR LLJJIJIIJIL;
    public C1654990tAX LLJJIJIL;
    public C1654950tAT LLJJJ;
    public boolean LLJJJIL;
    public final C1698360uIU LLJJJJ;
    public InterfaceC1655140tAm LLJJJJJIL;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [X.0tAc] */
    /* JADX WARN: Type inference failed for: r0v11, types: [X.0tAY] */
    public final InterfaceC1654970tAV LLLLILI() {
        if (!this.LLJJIII) {
            this.LLJJIII = true;
            final InterfaceC1654970tAV interfaceC1654970tAV = (InterfaceC1654970tAV) this.LLJJI.getValue();
            Activity activity = this.mActivity;
            RecordLiveViewModel recordLiveViewModel = this.LLJJIJI;
            if (recordLiveViewModel == null) {
                recordLiveViewModel = null;
            }
            IRecordingOperationPanel iRecordingOperationPanel = recordLiveViewModel.LL;
            InterfaceC535600KzW interfaceC535600KzWLIZ = C535500KzM.LIZ(this);
            interfaceC1654970tAV.LLLLJI(activity, iRecordingOperationPanel, interfaceC535600KzWLIZ != null ? interfaceC535600KzWLIZ.LLIIZ() : null, this, this.LLJILLL);
            interfaceC1654970tAV.LLLLLIL(new View[0]);
            interfaceC1654970tAV.LLLLL(new InterfaceC775450UbP() { // from class: X.0tAc
                @Override // X.InterfaceC775450UbP
                public final void LIZ() {
                    InterfaceC1655140tAm interfaceC1655140tAm = this.LIZ.LLJJJJJIL;
                    if (interfaceC1655140tAm != null) {
                        interfaceC1655140tAm.LIZ();
                    }
                }

                @Override // X.InterfaceC775450UbP
                public final void LIZIZ() {
                    InterfaceC1655140tAm interfaceC1655140tAm = this.LIZ.LLJJJJJIL;
                    if (interfaceC1655140tAm != null) {
                        interfaceC1655140tAm.LIZIZ();
                    }
                }
            });
            interfaceC1654970tAV.LLLLLILLIL(new InterfaceC21673219ru() { // from class: X.0tAY
                @Override // X.InterfaceC21673219ru
                public final void LIZ() {
                    RecordLiveViewModel recordLiveViewModel2 = this.LIZ.LLJJIJI;
                    if ((recordLiveViewModel2 == null ? null : recordLiveViewModel2).LLILZ != null) {
                        if (recordLiveViewModel2 == null) {
                            recordLiveViewModel2 = null;
                        }
                        if (!(!recordLiveViewModel2.LLILZ.LJJLL()) || interfaceC1654970tAV.LLLLLLJ() == null) {
                            return;
                        }
                        C786410Ut5.LJLLLLLL(8, interfaceC1654970tAV.LLLLLLJ());
                    }
                }

                @Override // X.InterfaceC21673219ru
                public final void LIZIZ() {
                    RecordLiveViewModel recordLiveViewModel2 = this.LIZ.LLJJIJI;
                    if ((recordLiveViewModel2 == null ? null : recordLiveViewModel2).LLILZ != null) {
                        if (recordLiveViewModel2 == null) {
                            recordLiveViewModel2 = null;
                        }
                        if (!(!recordLiveViewModel2.LLILZ.LJJLL()) || interfaceC1654970tAV.LLLLLLJ() == null) {
                            return;
                        }
                        C786410Ut5.LJLLLLLL(0, interfaceC1654970tAV.LLLLLLJ());
                    }
                }
            });
            interfaceC1654970tAV.LLLLLL();
            RecordLiveViewModel recordLiveViewModel2 = this.LLJJIJI;
            InterfaceC1650230t2r interfaceC1650230t2rVQ2 = (recordLiveViewModel2 != null ? recordLiveViewModel2 : null).vQ2();
            InterfaceC1655090tAh interfaceC1655090tAh = o.LJIILL;
            boolean z = interfaceC1650230t2rVQ2.LJLJJLL() == 1;
            interfaceC1655090tAh.getClass();
            ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).P3().LJII(z);
            interfaceC1654970tAV.LLLLLL();
        }
        return (InterfaceC1654970tAV) this.LLJJI.getValue();
    }

    @Override // X.InterfaceC960503pD, X.C11E6
    public final LifecycleOwner getLifecycleOwner() {
        return this;
    }

    @Override // X.C11E9
    public final C11E6 getLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.C11DL
    public final InterfaceC874803bO getReceiver() {
        return this;
    }

    @Override // X.C11E9
    public final C11DL<InterfaceC960503pD> getReceiverHolder() {
        return this;
    }

    @Override // X.AbstractC1653180t7c
    public final String getTag() {
        return "RecordLiveScene";
    }

    @Override // X.C11E9
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    @Override // com.bytedance.scene.Scene
    public final void onDestroyView() {
        C201955140j.LIZLLL(C1655170tAp.LIZIZ, "TTLHReuseCamera", "destroyView unregisterLiveStartListener");
        InterfaceC1655090tAh interfaceC1655090tAh = o.LJIILL;
        C1654930tAR c1654930tAR = this.LLJJIJIIJIL;
        if (c1654930tAR == null) {
            c1654930tAR = null;
        }
        ((C1654960tAU) interfaceC1655090tAh).LJI(c1654930tAR);
        C1654990tAX c1654990tAX = this.LLJJIJIL;
        if (c1654990tAX != null) {
            ((C1654960tAU) o.LJIILL).LJ(c1654990tAX);
        }
        C1654950tAT c1654950tAT = this.LLJJJ;
        if (c1654950tAT != null) {
            ((C1654960tAU) o.LJIILL).LJFF(c1654950tAT);
        }
        C1653340t7s.LIZ = 0;
        C1653340t7s.LIZIZ = "";
        C1653340t7s.LIZJ = false;
        C1653340t7s.LIZLLL = null;
        C1653340t7s.LJ = "camera";
        C1653340t7s.LJFF.clear();
        super.onDestroyView();
    }

    @Override // X.AbstractC1653180t7c
    public final void show() {
        Activity activity;
        FrameLayout frameLayout;
        InterfaceC1652190t61 interfaceC1652190t61;
        C385670FAf<Boolean> c385670FAfL00;
        final C1654950tAT c1654950tAT;
        C1655170tAp c1655170tAp = C1655170tAp.LIZIZ;
        C201955140j.LIZLLL(c1655170tAp, "TTLHReuseCamera", "RecordLiveScene show()");
        if (LLLLJ() && (c1654950tAT = this.LLJJJ) != null) {
            C1654960tAU c1654960tAU = (C1654960tAU) o.LJIILL;
            InterfaceC772590USj interfaceC772590USj = (InterfaceC772590USj) ((HashMap) c1654960tAU.LIZJ).get(c1654950tAT);
            if (interfaceC772590USj == null) {
                interfaceC772590USj = new InterfaceC772590USj() { // from class: X.0tAf
                    @Override // X.InterfaceC772590USj
                    public final void LIZ() {
                        c1654950tAT.LJFF();
                    }
                };
                ((HashMap) c1654960tAU.LIZJ).put(c1654950tAT, interfaceC772590USj);
            }
            ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).startLiveManager().LIZJ(interfaceC772590USj);
        }
        if (!C0CIU.LIZJ() || (interfaceC1652190t61 = (InterfaceC1652190t61) this.LLJJ.getValue()) == null || (c385670FAfL00 = interfaceC1652190t61.L00()) == null || !Intrinsics.LJFF(c385670FAfL00.LIZJ(), Boolean.TRUE)) {
            RecordLiveViewModel recordLiveViewModel = this.LLJJIJI;
            if (recordLiveViewModel == null) {
                recordLiveViewModel = null;
            }
            Bundle bundleLIZ = C1653510t89.LIZ(recordLiveViewModel.LLILZ);
            Integer num = (Integer) ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).q4().B4().LIZJ(0, "overdraw_optimization2");
            if ((num == null || num.intValue() != 0) && LLLLIIIILLL() && (activity = this.mActivity) != null && (frameLayout = (FrameLayout) activity.findViewById(R.id.mg3)) != null) {
                C786410Ut5.LJZ(4, frameLayout);
            }
            LLLLILI().LLLLLLIL(bundleLIZ, (ViewGroup) this.mView);
            RecordLiveViewModel recordLiveViewModel2 = this.LLJJIJI;
            if (recordLiveViewModel2 == null) {
                recordLiveViewModel2 = null;
            }
            ShortVideoContext shortVideoContext = recordLiveViewModel2.LLILZ;
            if (shortVideoContext != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("registerLiveStartListener debug info: ");
                sbLIZ.append(shortVideoContext.cameraComponentModel.mDurings.size());
                C201955140j.LIZLLL(c1655170tAp, "TTLHReuseCamera", C2188811AlT.LIZIZ(sbLIZ));
                if (shortVideoContext.cameraComponentModel.mDurings.isEmpty() || LLLLJ()) {
                    InterfaceC1655090tAh interfaceC1655090tAh = o.LJIILL;
                    C1654930tAR c1654930tAR = this.LLJJIJIIJIL;
                    final C1654930tAR c1654930tAR2 = c1654930tAR != null ? c1654930tAR : null;
                    C1654960tAU c1654960tAU2 = (C1654960tAU) interfaceC1655090tAh;
                    C0URV c0urv = (C0URV) ((HashMap) c1654960tAU2.LIZ).get(c1654930tAR2);
                    if (c0urv == null) {
                        Objects.requireNonNull(c1654930tAR2);
                        c0urv = new C0URV() { // from class: X.0tAg
                            @Override // X.C0URV
                            public final void LIZLLL(boolean z) {
                                c1654930tAR2.LIZLLL(z);
                            }
                        };
                        ((HashMap) c1654960tAU2.LIZ).put(c1654930tAR2, c0urv);
                    }
                    ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).startLiveManager().LJI(c0urv);
                    final C1654990tAX c1654990tAX = this.LLJJIJIL;
                    if (c1654990tAX != null) {
                        C1654960tAU c1654960tAU3 = (C1654960tAU) o.LJIILL;
                        InterfaceC772580USi interfaceC772580USi = (InterfaceC772580USi) ((HashMap) c1654960tAU3.LIZIZ).get(c1654990tAX);
                        if (interfaceC772580USi == null) {
                            interfaceC772580USi = new InterfaceC772580USi() { // from class: X.0tAe
                                @Override // X.InterfaceC772580USi
                                public final void LIZ() {
                                    c1654990tAX.LIZ();
                                }
                            };
                            ((HashMap) c1654960tAU3.LIZIZ).put(c1654990tAX, interfaceC772580USi);
                        }
                        ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).startLiveManager().LJIIIIZZ(interfaceC772580USi);
                    }
                }
            }
            NavigationScene navigationSceneLIZ = C1447800nmM.LIZ(this);
            if (navigationSceneLIZ != null) {
                navigationSceneLIZ.LLLIILIL(this, this.LLJJJJ);
            }
        }
    }

    public static boolean LLLLJ() {
        Integer num = (Integer) ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).B4().LIZJ(0, "ttlh_live_reuse_camera_opt");
        return num != null && num.intValue() == 1;
    }

    @Override // X.AbstractC1653180t7c
    public final boolean LLLLIIIILLL() {
        if (LLLLILI().a()) {
            return true;
        }
        return !LLLLILI().LLLLLLLLLL(this.mActivity);
    }

    @Override // X.AbstractC1653180t7c
    public final void hide() {
        FrameLayout frameLayoutLJLLLL;
        InterfaceC535600KzW interfaceC535600KzWLIZ = C535500KzM.LIZ(this);
        if (interfaceC535600KzWLIZ != null && (frameLayoutLJLLLL = interfaceC535600KzWLIZ.LJLLLL()) != null && frameLayoutLJLLLL.getVisibility() != 0) {
            C786410Ut5.LJZ(0, frameLayoutLJLLLL);
        }
        LLLLILI().LLLLLLL((ViewGroup) this.mView);
        C201955140j.LIZLLL(C1655170tAp.LIZIZ, "TTLHReuseCamera", "hide unregisterLiveStartListener");
        InterfaceC1655090tAh interfaceC1655090tAh = o.LJIILL;
        C1654930tAR c1654930tAR = this.LLJJIJIIJIL;
        if (c1654930tAR == null) {
            c1654930tAR = null;
        }
        ((C1654960tAU) interfaceC1655090tAh).LJI(c1654930tAR);
        C1654990tAX c1654990tAX = this.LLJJIJIL;
        if (c1654990tAX != null) {
            ((C1654960tAU) o.LJIILL).LJ(c1654990tAX);
        }
        C1654950tAT c1654950tAT = this.LLJJJ;
        if (c1654950tAT != null) {
            ((C1654960tAU) o.LJIILL).LJFF(c1654950tAT);
        }
        NavigationScene navigationSceneLIZ = C1447800nmM.LIZ(this);
        if (navigationSceneLIZ != null) {
            navigationSceneLIZ.LLLLLLLZIL(this.LLJJJJ);
        }
    }

    @Override // X.AbstractC1653180t7c
    public final EnumC545560LaU LLLLIL() {
        return EnumC545560LaU.RECORD_LIVE_SCENE;
    }

    public b(C1DRG c1drg) {
        this.LLJILLL = c1drg;
        C1655170tAp c1655170tAp = C1655170tAp.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RecordLiveScene init, current State=");
        sbLIZ.append(getLifecycle().getCurrentState());
        C201955140j.LIZJ(c1655170tAp, C2188811AlT.LIZIZ(sbLIZ));
        if (!Intrinsics.LJFF(Looper.getMainLooper(), Looper.myLooper())) {
            C1AF0.LIZJ("RecordLiveScene init from non main thread");
        }
        this.LLJJI = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(454));
        this.LLJJJJ = new C1698360uIU(this, 5);
    }

    @Override // X.AbstractC1653180t7c
    public final boolean LLLLIILL(C1653390t7x c1653390t7x) {
        this.LLJJJJJIL = c1653390t7x;
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v20, types: [X.0tAT] */
    /* JADX WARN: Type inference failed for: r0v21, types: [X.0tAR] */
    /* JADX WARN: Type inference failed for: r0v22, types: [X.0tAX] */
    @Override // com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        InterfaceC1652190t61 interfaceC1652190t61;
        C385670FAf<Boolean> c385670FAfL00;
        super.onActivityCreated(bundle);
        String str = null;
        ((a) this.LLJILLL.LJII(a.class, null)).LLZIL().LIZ(this, new AObjectS246S0100000_25(this, 707));
        ((InterfaceC1645840svm) this.LLJILLL.LJII(InterfaceC1645840svm.class, null)).fB2().LIZ(this, new AObjectS246S0100000_25(this, 708));
        if (C290640BaI.LIZ()) {
            ((C1655630tBZ) this.LLJILLL.LJII(C1655630tBZ.class, null)).LIZ.LIZ(C1655640tBa.LL).LJIIIZ(this, Lifecycle.State.CREATED, new AwS604S0100000_25(this, 627));
        }
        if (C0CIU.LIZJ() && (interfaceC1652190t61 = (InterfaceC1652190t61) this.LLJJ.getValue()) != null && (c385670FAfL00 = interfaceC1652190t61.L00()) != null) {
            c385670FAfL00.LIZ(this, new AObjectS246S0100000_25(this, 709));
        }
        this.LLJJIJI = (RecordLiveViewModel) C1659630tI1.LJIIIIZZ(this, null, null, 6).get(RecordLiveViewModel.class);
        InterfaceC1654980tAW interfaceC1654980tAWP3 = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).P3();
        RecordLiveViewModel recordLiveViewModel = this.LLJJIJI;
        if (recordLiveViewModel == null) {
            recordLiveViewModel = null;
        }
        ShortVideoContext shortVideoContext = recordLiveViewModel.LLILZ;
        if (shortVideoContext != null) {
            str = shortVideoContext.liveSourceParams;
        }
        interfaceC1654980tAWP3.updateLiveSourceParams(str);
        this.LLJJJ = new InterfaceC1655110tAj() { // from class: X.0tAT
            @Override // X.InterfaceC1655110tAj
            public final void LJFF() {
                InterfaceC2253521DIg interfaceC2253521DIgLJIIZILJ;
                C1655170tAp c1655170tAp = C1655170tAp.LIZIZ;
                C201955140j.LIZLLL(c1655170tAp, "TTLHReuseCamera", "OnLivePreviewListener#OnLivePreview");
                this.LIZ.getClass();
                if (b.LLLLJ()) {
                    b bVar = this.LIZ;
                    RecordLiveViewModel recordLiveViewModel2 = bVar.LLJJIJI;
                    if (recordLiveViewModel2 == null) {
                        recordLiveViewModel2 = null;
                    }
                    C1DKV recordContext = recordLiveViewModel2.vQ2().getRecordContext();
                    UUID uuidTh = recordLiveViewModel2.vQ2().Th((recordContext == null || (interfaceC2253521DIgLJIIZILJ = recordContext.LJIIZILJ()) == null) ? null : interfaceC2253521DIgLJIIZILJ.LIZIZ());
                    C2185991Agv c2185991AgvWr = recordLiveViewModel2.vQ2().wr(bVar.LLLLILI().LLLLLJLJLL(null));
                    RecordLiveViewModel recordLiveViewModel3 = bVar.LLJJIJI;
                    bVar.LLJJJIL = Boolean.valueOf((recordLiveViewModel3 != null ? recordLiveViewModel3 : null).vQ2().Uq()).booleanValue();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("OnLivePreview，isVeCamera1: ");
                    sbLIZ.append(bVar.LLJJJIL);
                    C201955140j.LIZLLL(c1655170tAp, "TTLHReuseCamera", C2188811AlT.LIZIZ(sbLIZ));
                    if (bVar.LLJJJIL) {
                        C201955140j.LIZLLL(c1655170tAp, "TTLHReuseCamera", "OnLivePreview，Camera1 Abort");
                    } else {
                        bVar.LLLLILI().LLLLJ(uuidTh, c2185991AgvWr);
                    }
                }
            }
        };
        this.LLJJIJIIJIL = new InterfaceC1655120tAk() { // from class: X.0tAR
            @Override // X.InterfaceC1655120tAk
            public final void LIZLLL(boolean z) {
                C1655170tAp c1655170tAp = C1655170tAp.LIZIZ;
                C201955140j.LIZLLL(c1655170tAp, "TTLHReuseCamera", "OnLiveStartListener#onStartLive");
                b bVar = this.LIZ;
                RecordLiveViewModel recordLiveViewModel2 = bVar.LLJJIJI;
                if (recordLiveViewModel2 == null) {
                    recordLiveViewModel2 = null;
                }
                InterfaceC1660820tJw audioController = recordLiveViewModel2.vQ2().St2().getAudioController();
                C1DPV c1dpv = C1DPV.LIZIZ;
                C1DPX c1dpx = C1DPX.STOP_AUDIO_SWITCH_TO_LIVE;
                EnumC1641610sox enumC1641610sox = EnumC1641610sox.USER_OPERATION;
                audioController.LJIIIZ(c1dpv.LIZJ(c1dpx, enumC1641610sox), false);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("liveReuseCameraOptEnabled = ");
                sbLIZ.append(b.LLLLJ());
                sbLIZ.append(", supportReuseCamera = ");
                sbLIZ.append(z);
                C201955140j.LIZLLL(c1655170tAp, "TTLHReuseCamera", C2188811AlT.LIZIZ(sbLIZ));
                if (z && b.LLLLJ()) {
                    recordLiveViewModel2.vQ2().sC2();
                    return;
                }
                recordLiveViewModel2.vQ2().aJ0(false, c1dpv.LIZJ(C1DPX.CLOSE_CAMERA_SWITCH_TO_LIVE, enumC1641610sox));
                if (z || !b.LLLLJ()) {
                    return;
                }
                bVar.LLLLILI().LLLLJ(null, null);
            }
        };
        this.LLJJIJIL = new InterfaceC1655100tAi() { // from class: X.0tAX
            @Override // X.InterfaceC1655100tAi
            public final void LIZ() {
                C201955140j.LIZLLL(C1655170tAp.LIZIZ, "TTLHReuseCamera", "OnLiveStartListener#OnLiveCaptureStarted");
                RecordLiveViewModel recordLiveViewModel2 = this.LIZ.LLJJIJI;
                if (recordLiveViewModel2 == null) {
                    recordLiveViewModel2 = null;
                }
                if (b.LLLLJ()) {
                    recordLiveViewModel2.vQ2().Bg1();
                }
            }
        };
    }

    @Override // X.C11E9
    public final <VM1 extends JediViewModel<S1>, S1 extends C004I, R> R withState(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return function1.invoke(vm1.FQ2());
    }

    @Override // X.AbstractC1653180t7c, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.i9b, viewGroup, false);
    }

    @Override // X.C11E9
    public final <S extends C004I> InterfaceC420801kM subscribe(JediViewModel<S> jediViewModel, C1765020w20<S> c1765020w20, Function2<? super InterfaceC960503pD, ? super S, Unit> function2) {
        return C11EA.LJIIJJI(this, jediViewModel, c1765020w20, function2);
    }

    @Override // X.InterfaceC1166920gTK
    public final <S extends C004I, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1765020w20<C11EC<A>> c1765020w20, Function2<? super InterfaceC1166920gTK, ? super A, Unit> function2) {
        C1170060gYO.LIZIZ(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    @Override // X.C11E9
    public final <S extends C004I, A> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1765020w20<C11EC<A>> c1765020w20, Function2<? super InterfaceC960503pD, ? super A, Unit> function2) {
        return C11EA.LJI(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    @Override // X.InterfaceC1166920gTK
    public final <S extends C004I, A> void subscribeEvent(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends C0LCS<? extends A>> interfaceC2217241BqE, C1765020w20<C11EC<C0LCS<A>>> c1765020w20, Function2<? super InterfaceC1166920gTK, ? super A, Unit> function2) {
        C1170060gYO.LIZLLL(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1765020w20<C11EF<A, B>> c1765020w20, InterfaceC1631620sYq<? super InterfaceC960503pD, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C11EA.LJFF(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, c1765020w20, interfaceC1631620sYq);
    }

    @Override // X.C11E9
    public final <S extends C004I, T> InterfaceC420801kM asyncSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends AbstractC1252750ihl<? extends T>> interfaceC2217241BqE, C1765020w20<C11EC<AbstractC1252750ihl<T>>> c1765020w20, Function2<? super InterfaceC960503pD, ? super Throwable, Unit> function2, Function1<? super InterfaceC960503pD, Unit> function1, Function2<? super InterfaceC960503pD, ? super T, Unit> function22) {
        return C11EA.LIZ(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2, function1, function22);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B, C> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1765020w20<C1634100scq<A, B, C>> c1765020w20, InterfaceC1631630sYr<? super InterfaceC960503pD, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C11EA.LJ(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1765020w20, interfaceC1631630sYr);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B, C, D> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1765020w20<C1644460stY<A, B, C, D>> c1765020w20, InterfaceC1685420txc<? super InterfaceC960503pD, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C11EA.LIZLLL(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1765020w20, interfaceC1685420txc);
    }
}
