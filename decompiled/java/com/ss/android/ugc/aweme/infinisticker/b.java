package com.ss.android.ugc.aweme.infinisticker;

import X.AbstractC21664519qV;
import X.C05YF;
import X.C09R3;
import X.C0CHQ;
import X.C0FEA;
import X.C0FFO;
import X.C0FSX;
import X.C0FSZ;
import X.C0FT7;
import X.C0FTB;
import X.C0FTJ;
import X.C0FUG;
import X.C0FUH;
import X.C0FXE;
import X.C13BV;
import X.C13LE;
import X.C1447800nmM;
import X.C1464900oDw;
import X.C1466090oFr;
import X.C1647390syH;
import X.C1662190tM9;
import X.C1662210tMB;
import X.C1662230tMD;
import X.C1663770tOh;
import X.C1664590tQ1;
import X.C1664770tQJ;
import X.C1697810uHb;
import X.C1698360uIU;
import X.C19292410dm;
import X.C19647711tz;
import X.C19774612Ym;
import X.C19A3;
import X.C1DRG;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C385670FAf;
import X.C390390FSj;
import X.C391010FUt;
import X.C573130Mdr;
import X.EnumC1448590nnd;
import X.EnumC1466150oFx;
import X.EnumC356070Dxd;
import X.EnumC391400FWg;
import X.InterfaceC1646220swO;
import X.InterfaceC1647420syK;
import X.InterfaceC1647520syU;
import X.InterfaceC1648020szI;
import X.InterfaceC1648510t05;
import X.InterfaceC1648570t0B;
import X.InterfaceC1650230t2r;
import X.InterfaceC1652190t61;
import X.InterfaceC1653050t7P;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC379610EuV;
import X.InterfaceC386720FEg;
import X.InterfaceC388760FMc;
import Y.AObjectS246S0100000_25;
import Y.ARunnableS112S0100000_12;
import Y.ARunnableS38S0300000_5;
import Y.ARunnableS94S0200000_25;
import android.content.Context;
import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.als.h0;
import com.bytedance.scene.navigation.NavigationScene;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.infinisticker.b;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.component.a;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.chatroom.IGroupChatStickerApi;
import com.ss.android.ugc.aweme.tools.sticker.core.liveevent.service.ILiveEventStickerService;
import ge.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AwS37S0010000_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS573S0100000_29;
import lnn.q;

/* JADX INFO: loaded from: classes26.dex */
public final class b extends i<InterfaceC1647520syU, C1662230tMD, C1662190tM9, C1662210tMB> implements InterfaceC1647520syU, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJZ;
    public static final int LLJZIJLIL;
    public final C19A3 LLJILJILJ;
    public final C1DRG LLJILLL;
    public final Function0<C1662190tM9> LLJJ;
    public final Function0<C1662210tMB> LLJJI;
    public final CopyOnWriteArrayList<Runnable> LLJJIII;
    public final InterfaceC1731706qJ LLJJIJI;
    public final InterfaceC1731706qJ LLJJIJIIJIL;
    public final InterfaceC1731706qJ LLJJIJIL;
    public final InterfaceC1731706qJ LLJJJ;
    public final InterfaceC1731706qJ LLJJJIL;
    public final InterfaceC1731706qJ LLJJJJ;
    public final InterfaceC1731706qJ LLJJJJJIL;
    public final InterfaceC1731706qJ LLJJJJLIIL;
    public final InterfaceC1731706qJ LLJJL;
    public final InterfaceC1731706qJ LLJJLIIIJLLLLLLLZ;
    public final InterfaceC1731706qJ LLJL;
    public final h0<Boolean> LLJLIL;
    public C0FT7 LLJLILLLLZIIL;
    public boolean LLJLL;
    public final Map<EnumC1466150oFx, Function1<StickerModel, Unit>> LLJLLIL;
    public boolean LLJLLL;

    public InterfaceC1647520syU H4() {
        return this;
    }

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(b.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(b.class, "planCUIApiComponent", "getPlanCUIApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/PlanCUIApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(b.class, "gestureApiComponent", "getGestureApiComponent()Lcom/bytedance/creativex/recorder/gesture/api/GestureApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(b.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(b.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(b.class, "recordAddYoursStickerApi", "getRecordAddYoursStickerApi()Lcom/ss/android/ugc/aweme/addyours/RecordAddYoursStickerApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(b.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS8 = new C2217381BqS(b.class, "bottomTabApiComponent", "getBottomTabApiComponent()Lcom/ss/android/ugc/gamora/recorder/bottom/BottomTabApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS9 = new C2217381BqS(b.class, "recordAdapterApi", "getRecordAdapterApi()Lcom/ss/android/ugc/aweme/shortvideo/adapter/RecordAdapterApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS10 = new C2217381BqS(b.class, "changeCameraSpecApiComponent", "getChangeCameraSpecApiComponent()Lcom/ss/android/ugc/aweme/changemode/ChangeCameraSpecApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS11 = new C2217381BqS(b.class, "recordPermissionApi", "getRecordPermissionApi()Lcom/ss/android/ugc/aweme/shortvideo/ui/permissionmanager/RecordPermissionUIApiComponent;", 0);
        c09r3.getClass();
        LLJZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7, c2217381BqS8, c2217381BqS9, c2217381BqS10, c2217381BqS11};
        LLJZIJLIL = 8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final List<C0FFO> F4() {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        C0FFO c0ffo = new C0FFO(EnumC1466150oFx.ADD_YOURS, 0, true, false, false, true, false, null, new Pair(Float.valueOf(0.8f), Float.valueOf(1.2f)), false, false, false, false, false, false, new C0FXE(2), 1828738);
        C0FFO c0ffo2 = new C0FFO(EnumC1466150oFx.MUSIC_STICKER, 0, true, false, false, true, false, null, null, false, false, false, false, false, false, new C19774612Ym(8), 1830786);
        arrayList.add(c0ffo);
        if (getShortVideoContext().creativeModel.initialModel.dmCameraModel.enableTextStickerOnRecord) {
            i = 0;
            arrayList.add(new C0FFO(EnumC1466150oFx.TEXT, 0, true, true, true, false, true, C1697810uHb.LJ(4, 3, 2), new Pair(Float.valueOf(0.4f), Float.valueOf(11.0f)), true, false, true, false, true, true, new C0FXE(3), 1574530));
        }
        arrayList.add(new C0FFO(EnumC1466150oFx.COMMENT, i, i, i, i, i, i, null, null, i, i, i, i, i, i, new C19774612Ym(7), 1830786));
        arrayList.add(c0ffo2);
        arrayList.add(new C0FFO(EnumC1466150oFx.SECRET_REPLIES, i, true, i, i, true, i, null, null, i, i, i, i, i, i, new C19774612Ym(10), 1830786));
        arrayList.add(new C0FFO(EnumC1466150oFx.SECRET_REPLIES_RESPONSE, i, true, i, i, i, i, null, null, i, i, i, i, i, i, new C19774612Ym(9), 1834986));
        arrayList.add(new C0FFO(EnumC1466150oFx.DM_GROUP_CHAT, i, i, i, i, i, i, null, null, i, i, i, i, i, i, new InterfaceC386720FEg() { // from class: X.11oC
            @Override // X.InterfaceC386720FEg
            public final AbstractC388880FMo LIZ(Context context, FrameLayout frameLayout, FrameLayout frameLayout2, LifecycleOwner lifecycleOwner, InterfaceC388760FMc interfaceC388760FMc, C0FTH c0fth, C0FUH c0fuh, C390420FSm c390420FSm) {
                IGroupChatStickerApi iGroupChatStickerApi = (IGroupChatStickerApi) PluggableExtentionKt.pluggableSpi$default(IGroupChatStickerApi.class, false, false, false, 14, null);
                if (iGroupChatStickerApi != null) {
                    return iGroupChatStickerApi.LJII(context, frameLayout, frameLayout2, lifecycleOwner, c390420FSm, new AwS573S0100000_29(this.LIZ, 143));
                }
                return null;
            }
        }, 1830786));
        if (PluggableExtentionKt.pluggableSpi$default(ILiveEventStickerService.class, i, i, true, 2, null) != null) {
            arrayList.add(new C0FFO(EnumC1466150oFx.LIVE_EVENT_COUNTDOWN, i, i, i, i, i, i, null, new Pair(Float.valueOf(0.2f), Float.valueOf(10.0f)), i, i, i, i, i, i, new C19774612Ym(6), 1832878));
        }
        return arrayList;
    }

    private final InterfaceC1646220swO Kp() {
        return (InterfaceC1646220swO) this.LLJJLIIIJLLLLLLLZ.getValue(this, LLJZ[9]);
    }

    private final InterfaceC1652190t61 O4() {
        return (InterfaceC1652190t61) this.LLJL.getValue(this, LLJZ[10]);
    }

    private final InterfaceC1648020szI Op() {
        return (InterfaceC1648020szI) this.LLJJJJLIIL.getValue(this, LLJZ[7]);
    }

    private final C0FTB P4() {
        return new C0FTB() { // from class: X.0tMC
            @Override // X.C0FTB
            public final void LIZIZ(StickerModel stickerModel) {
            }

            @Override // X.C0FTB
            public final void LIZJ(StickerModel stickerModel) {
            }

            @Override // X.C0FTB
            public final void LJFF(StickerModel stickerModel) {
            }

            @Override // X.C0FTB
            public final void LJI(StickerModel stickerModel, boolean z) {
            }

            @Override // X.C0FTB
            public final void LJII() {
            }

            @Override // X.C0FTB
            public final void LJIIIIZZ(StickerModel stickerModel) {
            }

            @Override // X.C0FTB
            public final void LJIIIZ(StickerModel stickerModel) {
            }

            @Override // X.C0FTB
            public final void LJIIL(StickerModel stickerModel, int i) {
            }

            @Override // X.C0FTB
            public final void LJIILJJIL(int i) {
            }

            @Override // X.C0FTB
            public final void LJIILL(StickerModel stickerModel) {
            }

            @Override // X.C0FTB
            public final void LJIILLIIL(int i) {
            }

            @Override // X.C0FTB
            public final void LJIJ(int i) {
            }

            @Override // X.C0FTB
            public final void LJIJI(StickerModel stickerModel) {
            }

            @Override // X.C0FTB
            public final void LJIJJ(StickerModel stickerModel) {
            }

            @Override // X.C0FTB
            public final void LJIJJLI(StickerModel stickerModel) {
            }

            @Override // X.C0FTB
            public final void LJIL() {
            }

            @Override // X.C0FTB
            public final void LJJ(StickerModel stickerModel) {
            }

            @Override // X.C0FTB
            public final void LJJI(StickerModel stickerModel) {
            }

            @Override // X.C0FTB
            public final void LJJIFFI(int i) {
            }

            @Override // X.C0FTB
            public final void LJJII(StickerModel stickerModel, MotionEvent motionEvent) {
            }

            @Override // X.C0FTB
            public final void LJJIII(StickerModel stickerModel) {
            }

            @Override // X.C0FTB
            public final void LJJIIJ(StickerModel stickerModel) {
            }

            @Override // X.C0FTB
            public final void LJJIIJZLJL(StickerModel stickerModel, boolean z, boolean z2) {
            }

            @Override // X.C0FTB
            public final void LJJIIZ() {
            }

            @Override // X.C0FTB
            public final void LJJIIZI(int i) {
            }

            @Override // X.C0FTB
            public final void LJJIJ() {
            }

            @Override // X.C0FTB
            public final void LJJIJIIJI(StickerModel stickerModel) {
            }

            @Override // X.C0FTB
            public final void LJJIJIIJIL(int i) {
            }

            @Override // X.C0FTB
            public final EnumC1466150oFx[] LJJIJIL() {
                return EnumC1466150oFx.values();
            }

            @Override // X.C0FTB
            public final void LIZLLL(StickerModel stickerModel) {
                this.LL.h12(stickerModel);
                C1403880mdW c1403880mdW = C1403880mdW.LIZ;
                ShortVideoContext shortVideoContext = this.LL.getShortVideoContext();
                c1403880mdW.getClass();
                C1403880mdW.LIZJ(null, shortVideoContext, stickerModel, null);
            }

            @Override // X.C0FTB
            public final void LJ(StickerModel stickerModel) {
                this.LL.h12(stickerModel);
                C1403880mdW c1403880mdW = C1403880mdW.LIZ;
                ShortVideoContext shortVideoContext = this.LL.getShortVideoContext();
                c1403880mdW.getClass();
                C1403880mdW.LIZJ(null, shortVideoContext, stickerModel, null);
            }

            @Override // X.C0FTB
            public final void LJIIJJI(StickerModel stickerModel) {
                Function1<StickerModel, Unit> function1 = this.LL.LLJLLIL.get(stickerModel.getStickerType());
                if (function1 != null) {
                    function1.invoke(stickerModel);
                }
            }

            @Override // X.C0FTB
            public final void LJIILIIL(StickerModel stickerModel) {
                this.LL.h12(stickerModel);
            }

            @Override // X.C0FTB
            public final void LJIIZILJ(StickerModel stickerModel) {
                this.LL.h12(stickerModel);
                C1403880mdW c1403880mdW = C1403880mdW.LIZ;
                ShortVideoContext shortVideoContext = this.LL.getShortVideoContext();
                c1403880mdW.getClass();
                C1403880mdW.LIZJ(null, shortVideoContext, stickerModel, null);
            }

            @Override // X.C0FTB
            public final void f4(StickerModel stickerModel) {
                this.LL.h12(stickerModel);
            }

            @Override // X.C0FTB
            public final void LIZ(StickerModel stickerModel, boolean z) {
                this.LL.h12(stickerModel);
            }

            @Override // X.C0FTB
            public final void LJIIJ(StickerModel stickerModel, String str) {
                C1403880mdW c1403880mdW = C1403880mdW.LIZ;
                ShortVideoContext shortVideoContext = this.LL.getShortVideoContext();
                c1403880mdW.getClass();
                C1403880mdW.LJ(null, shortVideoContext, stickerModel, null);
                C1466090oFr.LIZJ(this.LL.getShortVideoContext().creativeModel.stickerModel, stickerModel);
            }
        };
    }

    private final InterfaceC1650230t2r getCameraApiComponent() {
        return (InterfaceC1650230t2r) this.LLJJIJI.getValue(this, LLJZ[0]);
    }

    private final InterfaceC1648510t05 getGestureApiComponent() {
        return (InterfaceC1648510t05) this.LLJJIJIL.getValue(this, LLJZ[2]);
    }

    private final a getPlanCUIApiComponent() {
        return (a) this.LLJJIJIIJIL.getValue(this, LLJZ[1]);
    }

    private final InterfaceC1647420syK getRecordAdapterApi() {
        return (InterfaceC1647420syK) this.LLJJL.getValue(this, LLJZ[8]);
    }

    private final InterfaceC1648570t0B getRecordControlApi() {
        return (InterfaceC1648570t0B) this.LLJJJJJIL.getValue(this, LLJZ[6]);
    }

    public final InterfaceC1653050t7P K4() {
        return (InterfaceC1653050t7P) this.LLJJJJ.getValue(this, LLJZ[5]);
    }

    @Override // X.InterfaceC1647520syU
    public void Qd1() {
        if (this.LLJLILLLLZIIL == null || getShortVideoContext().cameraComponentModel.isRetakeMode || getShortVideoContext().cameraComponentModel.isEditorProRecordMode) {
            return;
        }
        C1466090oFr.LJ(getShortVideoContext().creativeModel.stickerModel);
        C0FT7 c0ft7 = this.LLJLILLLLZIIL;
        if (c0ft7 == null) {
            c0ft7 = null;
        }
        Iterator<StickerModel> it2 = c0ft7.LIZLLL().iterator();
        while (it2.hasNext()) {
            C1466090oFr.LIZIZ(getShortVideoContext().creativeModel.stickerModel, it2.next());
        }
    }

    public final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LLJJJ.getValue(this, LLJZ[3]);
    }

    public final q getStickerApiComponent() {
        return (q) this.LLJJJIL.getValue(this, LLJZ[4]);
    }

    private final void nD1() {
        C385670FAf<Boolean> c385670FAfJG2;
        C385670FAf<C1647390syH> bottomTabIndexChangeEvent;
        C385670FAf<EnumC1448590nnd> c385670FAfDk;
        getRecordControlApi().tQ0().LIZ(this, new AObjectS246S0100000_25(this, 115));
        getPlanCUIApiComponent().VT0(new C391010FUt(this));
        InterfaceC1646220swO interfaceC1646220swOKp = Kp();
        if (interfaceC1646220swOKp != null && (c385670FAfDk = interfaceC1646220swOKp.dk()) != null) {
            c385670FAfDk.LIZ(this, new AObjectS246S0100000_25(this, 116));
        }
        InterfaceC1648020szI interfaceC1648020szIOp = Op();
        if (interfaceC1648020szIOp != null && (bottomTabIndexChangeEvent = interfaceC1648020szIOp.getBottomTabIndexChangeEvent()) != null) {
            bottomTabIndexChangeEvent.LIZ(this, new AObjectS246S0100000_25(this, 117));
        }
        InterfaceC1652190t61 interfaceC1652190t61O4 = O4();
        if (interfaceC1652190t61O4 == null || (c385670FAfJG2 = interfaceC1652190t61O4.jG2()) == null) {
            return;
        }
        c385670FAfJG2.LIZ(this, new AObjectS246S0100000_25(this, 118));
    }

    public final C19647711tz T4() {
        String strLIZJ;
        C19292410dm currentUser = C0CHQ.LIZ().getAccountService().getCurrentUser();
        UrlModel avatarThumb = currentUser != null ? currentUser.getAvatarThumb() : null;
        if (C0FEA.LIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('@');
            C1464900oDw c1464900oDw = C1464900oDw.LIZ;
            C19292410dm currentUser2 = C0CHQ.LIZ().getAccountService().getCurrentUser();
            Resources resources = C1664590tQ1.LJII(this).getResources();
            c1464900oDw.getClass();
            sbLIZ.append(C1464900oDw.LIZJ(currentUser2, resources));
            strLIZJ = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            C1464900oDw c1464900oDw2 = C1464900oDw.LIZ;
            C19292410dm currentUser3 = C0CHQ.LIZ().getAccountService().getCurrentUser();
            Resources resources2 = C1664590tQ1.LJII(this).getResources();
            c1464900oDw2.getClass();
            strLIZJ = C1464900oDw.LIZJ(currentUser3, resources2);
        }
        float f = C0FEA.LIZIZ() ? 17.0f : 15.0f;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("");
        C1464900oDw c1464900oDw3 = C1464900oDw.LIZ;
        Context contextLJIIIZ = C1664590tQ1.LJIIIZ(this);
        C19292410dm currentUser4 = C0CHQ.LIZ().getAccountService().getCurrentUser();
        c1464900oDw3.getClass();
        sbLIZ2.append(C1464900oDw.LIZ(contextLJIIIZ, currentUser4));
        return new C19647711tz(avatarThumb, strLIZJ != null ? strLIZJ : "", f, C2188811AlT.LIZIZ(sbLIZ2), 63);
    }

    @Override // ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        getRecordAdapterApi().DW0(this);
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        this.LLJJIII.clear();
        getRecordAdapterApi().DW0(null);
    }

    @Override // X.InterfaceC1647520syU
    public boolean IT1() {
        return this.LLJLL;
    }

    @Override // X.AbstractC1664470tPp, X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        H4();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILLL;
    }

    public final C19A3 getParentScene() {
        return this.LLJILJILJ;
    }

    @Override // X.InterfaceC1647520syU
    public C385670FAf<Boolean> jQ2() {
        return this.LLJLIL;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C1662190tM9> o2() {
        return this.LLJJ;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C1662210tMB> w2() {
        return this.LLJJI;
    }

    private final void IQ0(AbstractC21664519qV abstractC21664519qV) {
        getGestureApiComponent().AL1(abstractC21664519qV, 6, 50);
    }

    @Override // X.InterfaceC1647520syU
    public void J4(StickerModel stickerModel) {
        C0FT7 c0ft7 = this.LLJLILLLLZIIL;
        if (c0ft7 == null) {
            c0ft7 = null;
        }
        c0ft7.k3(stickerModel, EnumC356070Dxd.COMMIT);
    }

    @Override // X.InterfaceC1647520syU
    public void L2(int i) {
        C0FT7 c0ft7 = this.LLJLILLLLZIIL;
        if (c0ft7 == null) {
            c0ft7 = null;
        }
        c0ft7.LJIIJ(i, null, true, EnumC356070Dxd.COMMIT);
    }

    @Override // X.InterfaceC1647520syU
    public void LJJ(boolean z) {
        i3(new AwS37S0010000_25(z, 3));
    }

    @Override // X.InterfaceC1647520syU
    public void LJJZZI(C0FTB c0ftb) {
        C0FT7 c0ft7 = this.LLJLILLLLZIIL;
        if (c0ft7 != null) {
            c0ft7.LJJZZI(c0ftb);
        } else {
            this.LLJJIII.add(new ARunnableS94S0200000_25(this, c0ftb, 4));
        }
    }

    @Override // X.InterfaceC1647520syU
    public List<StickerModel> LLLILZLLLI(EnumC1466150oFx enumC1466150oFx) {
        C0FT7 c0ft7 = this.LLJLILLLLZIIL;
        if (c0ft7 != null) {
            return c0ft7.LJIIIZ(enumC1466150oFx);
        }
        return C13BV.INSTANCE;
    }

    @Override // X.InterfaceC1647520syU
    public List<C0FTJ<StickerModel>> LLLLLZ(EnumC1466150oFx enumC1466150oFx) {
        C0FT7 c0ft7 = this.LLJLILLLLZIIL;
        if (c0ft7 != null) {
            return c0ft7.LLLLLZ(enumC1466150oFx);
        }
        return C13BV.INSTANCE;
    }

    @Override // X.InterfaceC1647520syU
    public void Rz(boolean z) {
        Qd1();
        if (z) {
            C1466090oFr.LIZLLL(getShortVideoContext().creativeModel.stickerModel, EnumC1466150oFx.COMMENT);
            if (C573130Mdr.LIZ()) {
                return;
            }
        }
        C1466090oFr.LIZLLL(getShortVideoContext().creativeModel.stickerModel, EnumC1466150oFx.ADD_YOURS);
    }

    public final void h12(StickerModel stickerModel) {
        if (this.LLJLILLLLZIIL == null) {
            return;
        }
        if (stickerModel.isNotEmptyModel()) {
            C1466090oFr.LIZIZ(getShortVideoContext().creativeModel.stickerModel, stickerModel);
        } else {
            C1466090oFr.LIZJ(getShortVideoContext().creativeModel.stickerModel, stickerModel);
        }
    }

    public final void m10(boolean z) {
        getCameraApiComponent().Zl0(new C1663770tOh(z, false, false));
        getStickerApiComponent().wC1(z);
        getPlanCUIApiComponent().m10(z);
    }

    @Override // X.InterfaceC1647520syU
    public void mF(Function0<Unit> function0) {
        if (this.LLJLLL) {
            function0.invoke();
        } else {
            this.LLJJIII.add(new ARunnableS112S0100000_12(function0, (Function0<Unit>) 193));
        }
    }

    public b(C19A3 c19a3, C1DRG c1drg) {
        super(c19a3);
        this.LLJILJILJ = c19a3;
        this.LLJILLL = c1drg;
        this.LLJJ = AFwS214S0000000_25.get$arr$(114);
        this.LLJJI = new AwS569S0100000_25(this, 195);
        this.LLJJIII = new CopyOnWriteArrayList<>();
        this.LLJJIJI = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1650230t2r.class, null);
        this.LLJJIJIIJIL = C1664770tQJ.LIZ(getDiContainer(), a.class, null);
        this.LLJJIJIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1648510t05.class, null);
        this.LLJJJ = C1664770tQJ.LIZ(getDiContainer(), ShortVideoContext.class, null);
        this.LLJJJIL = C1664770tQJ.LIZ(getDiContainer(), q.class, null);
        this.LLJJJJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1653050t7P.class, null);
        this.LLJJJJJIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1648570t0B.class, null);
        this.LLJJJJLIIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1648020szI.class, null);
        this.LLJJL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1647420syK.class, null);
        this.LLJJLIIIJLLLLLLLZ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1646220swO.class, null);
        this.LLJL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1652190t61.class, null);
        this.LLJLIL = new h0<>(Boolean.FALSE);
        this.LLJLLIL = new LinkedHashMap();
    }

    @Override // X.InterfaceC1647520syU
    public void JK0(EnumC1466150oFx enumC1466150oFx, Function1<? super StickerModel, Unit> function1) {
        this.LLJLLIL.put(enumC1466150oFx, function1);
    }

    @Override // X.InterfaceC1647520syU
    public void TQ(EnumC1466150oFx enumC1466150oFx, int i) {
        C0FT7 c0ft7 = this.LLJLILLLLZIIL;
        if (c0ft7 != null) {
            c0ft7.LJIIIIZZ(i);
        }
    }

    public final void Z4(FrameLayout frameLayout, FrameLayout frameLayout2) {
        this.LLJLILLLLZIIL = new C390390FSj(C1664590tQ1.LJII(this), frameLayout, frameLayout2, new C0FUH(null, null, 0, null, null, false, false, false, false, F4(), EnumC391400FWg.RECORD, false, false, false, 0, false, 518143), new InterfaceC388760FMc() { // from class: X.11qe
            @Override // X.InterfaceC388760FMc
            public final C0FF8 LIZ() {
                return null;
            }

            @Override // X.InterfaceC388760FMc
            public final InterfaceC19628411qs LIZJ() {
                return null;
            }

            @Override // X.InterfaceC388760FMc
            public final InterfaceC19639511sf LIZLLL() {
                return null;
            }

            @Override // X.InterfaceC388760FMc
            public final C0FEQ LJFF() {
                return null;
            }

            @Override // X.InterfaceC388760FMc
            public final C0FUB LJII() {
                return null;
            }

            @Override // X.InterfaceC388760FMc
            public final InterfaceC19627911qn LJIIIIZZ() {
                return null;
            }

            @Override // X.InterfaceC388760FMc
            public final C0FKH LJIIJ() {
                return null;
            }

            @Override // X.InterfaceC388760FMc
            public final C390610FTf LJIIJJI() {
                return null;
            }

            @Override // X.InterfaceC388760FMc
            public final InterfaceC19604511n1 LJIIL() {
                return null;
            }

            @Override // X.InterfaceC388760FMc
            public final InterfaceC19656311vN LJIILL() {
                return null;
            }

            @Override // X.InterfaceC388760FMc
            public final C0FLH LJIILLIIL() {
                return null;
            }

            @Override // X.InterfaceC388760FMc
            public final InterfaceC19605411nA LJIJ() {
                return null;
            }

            @Override // X.InterfaceC388760FMc
            public final void LJIJI(boolean z) {
            }

            @Override // X.InterfaceC388760FMc
            public final boolean LJIJJ() {
                return false;
            }

            @Override // X.InterfaceC388760FMc
            public final boolean LJIJJLI() {
                return true;
            }

            @Override // X.InterfaceC388760FMc
            public final C0FL9 LJIL() {
                return null;
            }

            @Override // X.InterfaceC388760FMc
            public final void LJJI() {
            }

            @Override // X.InterfaceC388760FMc
            public final void LJJIFFI() {
            }

            @Override // X.InterfaceC388760FMc
            public final void LJJII() {
            }

            @Override // X.InterfaceC388760FMc
            public final int LJJIII() {
                return 0;
            }

            @Override // X.InterfaceC388760FMc
            public final void LJJIIJZLJL() {
            }

            @Override // X.InterfaceC388760FMc
            public final InterfaceC19614111oZ getHashTagService() {
                return null;
            }

            @Override // X.InterfaceC388760FMc
            public final C0FUI w() {
                return null;
            }

            @Override // X.InterfaceC388760FMc
            public final InterfaceC386690FEd LIZIZ() {
                if (this.LIZ.getShortVideoContext().creativeModel.initialModel.dmCameraModel.enterFromDM) {
                    return null;
                }
                C1441900ncq c1441900ncq = new C1441900ncq();
                C823050WQl.LJ();
                C574220Mfc c574220Mfc = new C574220Mfc(c1441900ncq);
                if (c574220Mfc.LJII != null) {
                    return new C386390FCz(c574220Mfc.LJJ());
                }
                return null;
            }

            @Override // X.InterfaceC388760FMc
            public final C19647711tz LJIIIZ() {
                return this.LIZ.T4();
            }

            @Override // X.InterfaceC388760FMc
            public final InterfaceC390170FRn LJIILIIL() {
                InterfaceC1653050t7P interfaceC1653050t7PK4 = this.LIZ.K4();
                if (interfaceC1653050t7PK4 != null) {
                    return interfaceC1653050t7PK4.LJIIJ();
                }
                return null;
            }

            @Override // X.InterfaceC388760FMc
            public final C0FKI LJJ() {
                C1664590tQ1.LJII(this.LIZ);
                return new C0FIG();
            }

            @Override // X.InterfaceC388760FMc
            public final List<MediaModel> getVideoList() {
                return new ArrayList();
            }

            @Override // X.InterfaceC388760FMc
            public final float LJ() {
                if (LIZIZ() != null) {
                    return ((AbstractC386380FCy) r0).LLL();
                }
                return 0.0f;
            }

            @Override // X.InterfaceC388760FMc
            public final float LJI() {
                if (LIZIZ() != null) {
                    return ((AbstractC386380FCy) r0).getDuration();
                }
                return 0.0f;
            }

            @Override // X.InterfaceC388760FMc
            public final List<MediaModel> LJIIZILJ() {
                return C13BV.INSTANCE;
            }

            @Override // X.InterfaceC388760FMc
            public final void LJIILJJIL(int i) {
                b bVar = this.LIZ;
                bVar.LLJLL = false;
                bVar.m10(true);
            }

            @Override // X.InterfaceC388760FMc
            public final void LJJIIJ(int i) {
                b bVar = this.LIZ;
                bVar.LLJLL = true;
                bVar.m10(false);
            }
        }, this);
        IQ0(new AbstractC21664519qV() { // from class: X.0FUN
            @Override // X.AbstractC21664719qX, X.InterfaceC21645719nT
            public final boolean E2(C21645419nQ c21645419nQ) {
                this.LL.LLJLIL.LJII(Boolean.TRUE);
                C0FT7 c0ft7 = this.LL.LLJLILLLLZIIL;
                if (c0ft7 == null) {
                    c0ft7 = null;
                }
                return c0ft7.ac().E2(c21645419nQ);
            }

            @Override // X.AbstractC21664719qX, X.InterfaceC21645719nT
            public final boolean LIZIZ(MotionEvent motionEvent) {
                C0FT7 c0ft7 = this.LL.LLJLILLLLZIIL;
                if (c0ft7 == null) {
                    c0ft7 = null;
                }
                return c0ft7.ac().LIZIZ(motionEvent);
            }

            @Override // X.AbstractC21664719qX, X.InterfaceC21645719nT
            public final void LJFF(zoo.b bVar) {
                this.LL.LLJLIL.LJII(Boolean.FALSE);
                C0FT7 c0ft7 = this.LL.LLJLILLLLZIIL;
                if (c0ft7 == null) {
                    c0ft7 = null;
                }
                c0ft7.ac().LJFF(bVar);
            }

            @Override // X.AbstractC21664719qX, X.InterfaceC21645719nT
            public final boolean LJIIIZ(float f) {
                this.LL.LLJLIL.LJII(Boolean.FALSE);
                C0FT7 c0ft7 = this.LL.LLJLILLLLZIIL;
                if (c0ft7 == null) {
                    c0ft7 = null;
                }
                return c0ft7.ac().LJIIIZ(f);
            }

            @Override // X.AbstractC21664719qX, X.InterfaceC21645719nT
            public final boolean LJJLIIIJLJLI(float f) {
                C0FT7 c0ft7 = this.LL.LLJLILLLLZIIL;
                if (c0ft7 == null) {
                    c0ft7 = null;
                }
                return c0ft7.ac().LJJLIIIJLJLI(f);
            }

            @Override // X.AbstractC21664719qX, X.InterfaceC21645719nT
            public final boolean LLLLJI(float f) {
                this.LL.LLJLIL.LJII(Boolean.FALSE);
                C0FT7 c0ft7 = this.LL.LLJLILLLLZIIL;
                if (c0ft7 == null) {
                    c0ft7 = null;
                }
                return c0ft7.ac().LLLLJI(f);
            }

            @Override // X.AbstractC21664719qX, X.InterfaceC21645719nT
            public final boolean LLLZLZ(zoo.b bVar) {
                C0FT7 c0ft7 = this.LL.LLJLILLLLZIIL;
                if (c0ft7 == null) {
                    c0ft7 = null;
                }
                return c0ft7.ac().LLLZLZ(bVar);
            }

            @Override // X.AbstractC21664719qX, X.InterfaceC21645719nT
            public final boolean onDown(MotionEvent motionEvent) {
                this.LL.LLJLIL.LJII(Boolean.TRUE);
                C0FT7 c0ft7 = this.LL.LLJLILLLLZIIL;
                if (c0ft7 == null) {
                    c0ft7 = null;
                }
                return c0ft7.ac().onDown(motionEvent);
            }

            @Override // X.AbstractC21664719qX, X.InterfaceC21645719nT
            public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
                C0FT7 c0ft7 = this.LL.LLJLILLLLZIIL;
                if (c0ft7 == null) {
                    c0ft7 = null;
                }
                return c0ft7.ac().onScale(scaleGestureDetector);
            }

            @Override // X.AbstractC21664719qX, X.InterfaceC21645719nT
            public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
                this.LL.LLJLIL.LJII(Boolean.TRUE);
                C0FT7 c0ft7 = this.LL.LLJLILLLLZIIL;
                if (c0ft7 == null) {
                    c0ft7 = null;
                }
                return c0ft7.ac().onScaleBegin(scaleGestureDetector);
            }

            @Override // X.AbstractC21664719qX, X.InterfaceC21645719nT
            public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                C0FT7 c0ft7 = this.LL.LLJLILLLLZIIL;
                if (c0ft7 == null) {
                    c0ft7 = null;
                }
                return c0ft7.ac().onSingleTapConfirmed(motionEvent);
            }

            @Override // X.AbstractC21664719qX, X.InterfaceC21645719nT
            public final boolean onUp(MotionEvent motionEvent) {
                this.LL.LLJLIL.LJII(Boolean.FALSE);
                C0FT7 c0ft7 = this.LL.LLJLILLLLZIIL;
                if (c0ft7 == null) {
                    c0ft7 = null;
                }
                return c0ft7.ac().onUp(motionEvent);
            }

            @Override // X.AbstractC21664719qX, X.InterfaceC21645719nT
            public final boolean LLLLLLLLL(zoo.b bVar, float f, float f2) {
                this.LL.LLJLIL.LJII(Boolean.TRUE);
                C0FT7 c0ft7 = this.LL.LLJLILLLLZIIL;
                if (c0ft7 == null) {
                    c0ft7 = null;
                }
                return c0ft7.ac().LLLLLLLLL(bVar, f, f2);
            }

            @Override // X.AbstractC21664719qX, X.InterfaceC21645719nT
            public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                C0FT7 c0ft7 = this.LL.LLJLILLLLZIIL;
                if (c0ft7 == null) {
                    c0ft7 = null;
                }
                return c0ft7.ac().onFling(motionEvent, motionEvent2, f, f);
            }

            @Override // X.AbstractC21664719qX, X.InterfaceC21645719nT
            public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                C0FT7 c0ft7 = this.LL.LLJLILLLLZIIL;
                if (c0ft7 == null) {
                    c0ft7 = null;
                }
                return c0ft7.ac().onScroll(motionEvent, motionEvent2, f, f);
            }
        });
        C0FT7 c0ft7 = this.LLJLILLLLZIIL;
        if (c0ft7 == null) {
            c0ft7 = null;
        }
        c0ft7.initService();
        NavigationScene navigationSceneLIZ = C1447800nmM.LIZ(this.LLJILJILJ);
        if (navigationSceneLIZ != null) {
            navigationSceneLIZ.LLLIILIL(this.LLJILJILJ, new C1698360uIU(this, 0));
        }
        LJJZZI(P4());
        Iterator<Runnable> it2 = this.LLJJIII.iterator();
        while (it2.hasNext()) {
            it2.next().run();
        }
        this.LLJJIII.clear();
        this.LLJLLL = true;
        nD1();
    }

    @Override // X.InterfaceC1647520syU
    public void k2(EnumC1466150oFx enumC1466150oFx, C0FUG c0fug) {
        C0FT7 c0ft7 = this.LLJLILLLLZIIL;
        if (c0ft7 != null) {
            c0ft7.k2(enumC1466150oFx, c0fug);
        } else {
            this.LLJJIII.add(new ARunnableS38S0300000_5(this, enumC1466150oFx, c0fug, 0));
        }
    }

    @Override // X.InterfaceC1647520syU
    public void lJ(StickerModel stickerModel, boolean z) {
        C0FT7 c0ft7 = this.LLJLILLLLZIIL;
        if (c0ft7 != null) {
            c0ft7.f3(stickerModel, EnumC356070Dxd.COMMIT);
        } else {
            this.LLJJIII.add(new ARunnableS94S0200000_25(this, stickerModel, 3));
        }
    }

    @Override // X.InterfaceC1647520syU
    public void Us0(EnumC1466150oFx enumC1466150oFx, C0FTJ<? extends StickerModel> c0ftj, Function1<? super StickerModel, Unit> function1) {
        C0FT7 c0ft7 = this.LLJLILLLLZIIL;
        if (c0ft7 != null) {
            c0ft7.LIZIZ(enumC1466150oFx, c0ftj, null, "", function1);
        }
    }

    @Override // X.InterfaceC1647520syU
    public void mn2(EnumC1466150oFx enumC1466150oFx, String str, Function1<? super StickerModel, Unit> function1) {
        C0FT7 c0ft7 = this.LLJLILLLLZIIL;
        if (c0ft7 != null) {
            c0ft7.LIZIZ(enumC1466150oFx, null, null, str, function1);
        }
    }

    @Override // X.InterfaceC1647520syU
    public void LJ0(boolean z, String str, C0FTJ<? extends StickerModel> c0ftj, Integer num, Integer num2, C0FSZ c0fsz) {
        C0FT7 c0ft7 = this.LLJLILLLLZIIL;
        if (c0ft7 != null) {
            c0ft7.Ja().LLILII(z, str, c0ftj.getStickerId(), C0FSX.BOTTOM, null, null, num, num2, c0fsz);
        }
    }
}
