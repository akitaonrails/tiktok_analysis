package com.ss.android.ugc.gamora.recorder.bottom;

import X.AbstractC1653130t7X;
import X.AbstractC1653180t7c;
import X.AbstractC1653290t7n;
import X.AbstractC21664519qV;
import X.C01GW;
import X.C05YF;
import X.C0C64;
import X.C0CHS;
import X.C12WG;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C1397620mTQ;
import X.C13LE;
import X.C13LP;
import X.C1402840mbq;
import X.C1439190nYT;
import X.C1443960ngA;
import X.C1446240njq;
import X.C1622510sK9;
import X.C1624010sMZ;
import X.C1624550sNR;
import X.C1633080sbC;
import X.C1646700sxA;
import X.C1647390syH;
import X.C1648150szV;
import X.C1649450t1b;
import X.C1649780t28;
import X.C1653090t7T;
import X.C1653170t7b;
import X.C1653210t7f;
import X.C1653220t7g;
import X.C1653240t7i;
import X.C1653320t7q;
import X.C1653330t7r;
import X.C1656550tD3;
import X.C1658150tFd;
import X.C1664770tQJ;
import X.C1697810uHb;
import X.C19A3;
import X.C1DRG;
import X.C201955140j;
import X.C2217381BqS;
import X.C294760Bgw;
import X.C330830Cy1;
import X.C385670FAf;
import X.C452501pT;
import X.C539900LFk;
import X.C560380LyO;
import X.C560470LyX;
import X.C560530Lyd;
import X.C565600MGg;
import X.C579450Mo3;
import X.C786410Ut5;
import X.EnumC1647570syZ;
import X.EnumC452301pR;
import X.EnumC560450LyV;
import X.InterfaceC1621970sJH;
import X.InterfaceC1624480sNK;
import X.InterfaceC1626180sQ4;
import X.InterfaceC1627350sRx;
import X.InterfaceC1638550sk1;
import X.InterfaceC1645840svm;
import X.InterfaceC1647420syK;
import X.InterfaceC1648020szI;
import X.InterfaceC1648510t05;
import X.InterfaceC1648570t0B;
import X.InterfaceC1649550t1l;
import X.InterfaceC1652190t61;
import X.InterfaceC1653190t7d;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC579050MnP;
import Y.AObjectS246S0100000_25;
import Y.ARunnableS58S0300000_25;
import android.text.TextUtils;
import android.view.MotionEvent;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.als.LiveEvent;
import com.bytedance.als.h0;
import com.bytedance.keva.Keva;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.component.a;
import com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene;
import com.ss.android.ugc.aweme.shortvideo.widget.TabHost;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.bottom.f0;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AwS139S1100000_25;
import kotlin.jvm.internal.AwS426S0200000_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.Intrinsics;
import lnn.q;
import mn3.e0;

/* JADX INFO: loaded from: classes26.dex */
public final class f0 extends AbstractC1653130t7X {
    public static final C1653220t7g LLLJIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLJL;
    public static final int LLLL;
    public final List<InterfaceC1653190t7d> LLJJJIL;
    public final boolean LLJJJJ;
    public final InterfaceC1648020szI LLJJJJJIL;
    public final a LLJJJJLIIL;
    public final InterfaceC1731706qJ LLJJL;
    public final InterfaceC1731706qJ LLJJLIIIJLLLLLLLZ;
    public final InterfaceC1731706qJ LLJL;
    public final InterfaceC1731706qJ LLJLIL;
    public final InterfaceC1731706qJ LLJLILLLLZIIL;
    public final InterfaceC1731706qJ LLJLL;
    public final InterfaceC1731706qJ LLJLLIL;
    public final InterfaceC1731706qJ LLJLLL;
    public final InterfaceC1731706qJ LLJZ;
    public final InterfaceC1731706qJ LLJZIJLIL;
    public final InterfaceC1731706qJ LLL;
    public final C560530Lyd<String> LLLF;
    public final LiveEvent<String> LLLFF;
    public final h0<Integer> LLLFFI;
    public final C1653210t7f LLLFZ;
    public final C1653170t7b LLLI;
    public final C01GW LLLII;
    public final C01GW LLLIIII;
    public final Keva LLLIIIIL;
    public final C01GW LLLIIIL;
    public boolean LLLIIL;
    public boolean LLLIILIL;
    public volatile boolean LLLIL;
    public final C01GW LLLILZ;
    public final C01GW LLLILZJ;
    public boolean LLLILZLLLI;
    public boolean LLLIZZ;
    public final C01GW LLLJ;

    public final void onStartRecord() {
        showBottomTab(false);
        if (!this.LLJJJJ) {
            C5(false);
        }
        this.LLLI.LIZJ(false);
        if (!this.LLJJJJ) {
            z4().LIZJ(false);
        }
        ShortVideoContext shortVideoContext = getShortVideoContext();
        int i = shortVideoContext.shootedShootMode;
        int i2 = shortVideoContext.shootMode;
        if (i != i2) {
            shortVideoContext.shootedShootMode = i2;
            C1439190nYT.LJIIIZ(i2);
        }
    }

    /* JADX WARN: Type inference failed for: r0v22, types: [X.0t7g] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(f0.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/TikTokCameraApiComponent;", 0);
        C13LE.LIZ.getClass();
        LLLJL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(f0.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0), new C2217381BqS(f0.class, "recordModeApi", "getRecordModeApi()Lcom/ss/android/ugc/aweme/shortvideo/ui/component/RecordModeApiComponent;", 0), new C2217381BqS(f0.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0), new C2217381BqS(f0.class, "recordPermissionApiComponent", "getRecordPermissionApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/ui/permissionmanager/RecordPermissionUIApiComponent;", 0), new C2217381BqS(f0.class, "gestureApiComponent", "getGestureApiComponent()Lcom/bytedance/creativex/recorder/gesture/api/GestureApiComponent;", 0), new C2217381BqS(f0.class, "rootScene", "getRootScene()Lcom/ss/android/ugc/aweme/shortvideo/ui/TikTokCameraBaseGroupScene;", 0), new C2217381BqS(f0.class, "recordAdapterApi", "getRecordAdapterApi()Lcom/ss/android/ugc/aweme/shortvideo/adapter/RecordAdapterApi;", 0), new C2217381BqS(f0.class, "stickerPanelComponent", "getStickerPanelComponent()Lcom/bytedance/creativex/recorder/sticker/api/StickerPanelApiComponent;", 0), new C2217381BqS(f0.class, "liveApiComponent", "getLiveApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/live/LiveApiComponent;", 0), new C2217381BqS(f0.class, "componentizationConfig", "getComponentizationConfig()Lcom/ss/android/ugc/aweme/shortvideo/ui/RecordContainerComponentizationConfig;", 0)};
        LLLJIL = new Object() { // from class: X.0t7g
        };
        LLLL = 8;
    }

    private final InterfaceC579050MnP Gp() {
        return (InterfaceC579050MnP) this.LLJZ.getValue(this, LLLJL[8]);
    }

    private final AbstractC21664519qV K4() {
        return new AbstractC21664519qV() { // from class: X.0t7Z
            @Override // X.AbstractC21664719qX, X.InterfaceC21645719nT
            public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                Integer numLIZJ;
                if (this.LL.getCameraApiComponent().St2().I4() || this.LL.getCameraApiComponent().yC() || this.LL.LLJJJJLIIL.HF1() || (numLIZJ = this.LL.LLLFFI.LIZJ()) == null || numLIZJ.intValue() != 0) {
                    return false;
                }
                if (motionEvent != null && motionEvent2 != null) {
                    if (this.LL.getShortVideoContext().LJII() != 0) {
                        return false;
                    }
                    AbstractC21664519qV abstractC21664519qVZk1 = this.LL.getGestureApiComponent().zk1(1);
                    if (abstractC21664519qVZk1 != null && abstractC21664519qVZk1.onFling(motionEvent, motionEvent2, f, f2)) {
                        return true;
                    }
                    AbstractC21664519qV abstractC21664519qVZk12 = this.LL.getGestureApiComponent().zk1(6);
                    if (abstractC21664519qVZk12 != null && abstractC21664519qVZk12.onFling(motionEvent, motionEvent2, f, f2)) {
                        return true;
                    }
                    f0 f0Var = this.LL;
                    if (!f0Var.LLJJJJ) {
                        TabHost tabHost = f0Var.F4().LLJJIII;
                        if (tabHost == null) {
                            tabHost = null;
                        }
                        C444960Hcc.LIZJ(this.LL.getActivity());
                        if (motionEvent2.getX() > motionEvent.getX() && Math.abs(motionEvent.getX() - motionEvent2.getX()) > Math.abs(motionEvent.getY() - motionEvent2.getY())) {
                            this.LL.Q3(tabHost);
                            return true;
                        }
                        if (motionEvent.getX() > motionEvent2.getX() && Math.abs(motionEvent2.getX() - motionEvent.getX()) > Math.abs(motionEvent.getY() - motionEvent2.getY())) {
                            this.LL.Z4(tabHost);
                            return true;
                        }
                    }
                    return false;
                }
                return this instanceof r1k.a;
            }

            @Override // X.AbstractC21664719qX, X.InterfaceC21645719nT
            public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                Integer numLIZJ;
                if (this.LL.getCameraApiComponent().St2().I4() || this.LL.getCameraApiComponent().yC() || this.LL.LLJJJJLIIL.HF1() || (numLIZJ = this.LL.LLLFFI.LIZJ()) == null || numLIZJ.intValue() != 0 || motionEvent == null || motionEvent2 == null || this.LL.getShortVideoContext().LJII() != 0) {
                    return false;
                }
                AbstractC21664519qV abstractC21664519qVZk1 = this.LL.getGestureApiComponent().zk1(1);
                if (abstractC21664519qVZk1 != null && abstractC21664519qVZk1.onScroll(motionEvent, motionEvent2, f, f2)) {
                    return true;
                }
                AbstractC21664519qV abstractC21664519qVZk12 = this.LL.getGestureApiComponent().zk1(6);
                if ((abstractC21664519qVZk12 == null || !abstractC21664519qVZk12.onScroll(motionEvent, motionEvent2, f, f2)) && Math.abs(motionEvent.getX() - motionEvent2.getX()) <= Math.abs(motionEvent.getY() - motionEvent2.getY())) {
                    return false;
                }
                return true;
            }
        };
    }

    private final C1653240t7i O4() {
        return (C1653240t7i) this.LLLILZ.getValue();
    }

    private final TuxTextView P4() {
        return (TuxTextView) this.LLLIIIL.getValue();
    }

    private final C565600MGg getComponentizationConfig() {
        return (C565600MGg) this.LLL.getValue(this, LLLJL[10]);
    }

    private final InterfaceC1645840svm getLiveApiComponent() {
        return (InterfaceC1645840svm) this.LLJZIJLIL.getValue(this, LLLJL[9]);
    }

    private final InterfaceC1647420syK getRecordAdapterApi() {
        return (InterfaceC1647420syK) this.LLJLLL.getValue(this, LLLJL[7]);
    }

    private final InterfaceC1648570t0B getRecordControlApi() {
        return (InterfaceC1648570t0B) this.LLJJLIIIJLLLLLLLZ.getValue(this, LLLJL[1]);
    }

    private final InterfaceC1621970sJH getRecordModeApi() {
        return (InterfaceC1621970sJH) this.LLJL.getValue(this, LLLJL[2]);
    }

    private final TikTokCameraBaseGroupScene getRootScene() {
        return (TikTokCameraBaseGroupScene) this.LLJLLIL.getValue(this, LLLJL[6]);
    }

    private final C1649450t1b getSwitchDurationConfigFactory() {
        return (C1649450t1b) this.LLLJ.getValue();
    }

    private final void handleBackFromTextMode() {
        if (Intrinsics.LJFF(this.LLLI.LJI(), "RecordLighteningText")) {
            String strDefaultBottomTab = defaultBottomTab();
            if (strDefaultBottomTab != null) {
                r0 r0VarO2 = o2();
                TabHost tabHost = r0VarO2.LLJILLL;
                if (tabHost == null) {
                    tabHost = null;
                }
                tabHost.LJ(true, r0VarO2.LLLIIIIL(strDefaultBottomTab), 7, true);
            } else {
                o2().LLLLIILL();
            }
        }
        if (this.LLJJJJ || !Intrinsics.LJFF(z4().LJI(), "RecordLighteningText")) {
            return;
        }
        switchToPreviousTab();
    }

    @Override // X.AbstractC1653130t7X
    public boolean E3() {
        return onlyShowLiveTab(this.LLILLJJLI);
    }

    public final C1646700sxA F4() {
        return (C1646700sxA) this.LLLIIII.getValue();
    }

    public final InterfaceC1649550t1l T4() {
        return (InterfaceC1649550t1l) this.LLLILZJ.getValue();
    }

    public final e0 getCameraApiComponent() {
        return (e0) this.LLJJL.getValue(this, LLLJL[0]);
    }

    public final InterfaceC1648510t05 getGestureApiComponent() {
        return (InterfaceC1648510t05) this.LLJLL.getValue(this, LLLJL[5]);
    }

    public final InterfaceC1652190t61 getRecordPermissionApiComponent() {
        return (InterfaceC1652190t61) this.LLJLILLLLZIIL.getValue(this, LLLJL[4]);
    }

    public final q getStickerApiComponent() {
        return (q) this.LLJLIL.getValue(this, LLLJL[3]);
    }

    @Override // X.InterfaceC1648020szI
    public void selectDefaultSubTab() {
        if (this.LLJJJJ) {
            return;
        }
        x5(this.LLILLJJLI, z4().LIZLLL);
    }

    @Override // X.InterfaceC1648020szI
    public void showAllTabsAndExitDuetMode() {
        this.LLLI.LJIIL("DUET_MODE_CAMERA_RECORD");
        int i = 0;
        for (Object obj : (ArrayList) this.LLLI.LIZLLL) {
            int i2 = i + 1;
            if (i < 0) {
                C1697810uHb.LJIJI();
                throw null;
            }
            this.LLLI.LIZIZ(i, (C1653090t7T) obj);
            i = i2;
        }
        setCurrentTab("record_mode_duet", true, 6, false);
    }

    @Override // X.InterfaceC1648020szI
    public void switchToPreviousTab() {
        if (this.LLJJJJ) {
            return;
        }
        TabHost tabHost = F4().LLJJIII;
        if (tabHost == null) {
            tabHost = null;
        }
        TabHost tabHost2 = F4().LLJJIII;
        tabHost.LIZLLL((tabHost2 != null ? tabHost2 : null).getLastIndex(), 7, true);
    }

    @Override // X.AbstractC1653130t7X
    public C385670FAf<Boolean> va() {
        return this.LLJJJJLIIL.va();
    }

    public final C1653170t7b z4() {
        return (C1653170t7b) this.LLLII.getValue();
    }

    private final EnumC560450LyV getCurrentBottomTab() {
        String currentBottomTag = getCurrentBottomTag();
        return (isRecordTab(currentBottomTag) || isStoryOrPhotoTab(currentBottomTag)) ? EnumC560450LyV.RECORD : Intrinsics.LJFF(currentBottomTag, "record_mode_editor_tab") ? EnumC560450LyV.CREATE : EnumC560450LyV.OTHERS;
    }

    private final void refreshStickerCategoriesForEffectTemplate() {
        InterfaceC1624480sNK interfaceC1624480sNKC0;
        InterfaceC1627350sRx stickerRepository;
        if (C0CHS.LIZ() || C1656550tD3.LIZ()) {
            List<String> list = C579450Mo3.LIZ;
            if (C579450Mo3.LIZ(getShortVideoContext())) {
                return;
            }
            C1633080sbC c1633080sbC = new C1633080sbC(null, false, false, 1023);
            c1633080sbC.LJIIJ = C0C64.LJIILLIIL().LJIIIZ(31744, "creative_tools_redundant_network_calls_removal", true, false);
            q stickerApiComponent = getStickerApiComponent();
            if (stickerApiComponent == null || (interfaceC1624480sNKC0 = stickerApiComponent.C0()) == null || (stickerRepository = interfaceC1624480sNKC0.getStickerRepository()) == null) {
                return;
            }
            stickerRepository.LJIIIZ(c1633080sbC);
        }
    }

    private final void v5() {
        getRecordControlApi().EP().LIZ(this, new AObjectS246S0100000_25(this, 333));
        getRecordControlApi().rr0().LIZ(this, new AObjectS246S0100000_25(this, 334));
    }

    @Override // X.InterfaceC1647930sz9
    public boolean couldShowToolbar() {
        return (TextUtils.equals(getCurrentBottomTag(), "record_mode_duet") || TextUtils.equals(getCurrentBottomTag(), "record_mode_live") || TextUtils.equals(getCurrentBottomTag(), "record_mode_mv") || TextUtils.equals(getCurrentBottomTag(), "record_mode_editor_tab") || TextUtils.equals(getCurrentBottomTag(), "AISelf")) ? false : true;
    }

    @Override // X.AbstractC1653130t7X, X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return getApiComponent();
    }

    @Override // X.AbstractC1653130t7X, X.AbstractC2255721DQs
    public void onCreate() {
        C385670FAf<Boolean> c385670FAfCP1;
        super.onCreate();
        getRecordAdapterApi().eH1(this);
        if (this.LLJJJJ) {
            Iterator<InterfaceC1653190t7d> it2 = this.LLJJJIL.iterator();
            while (it2.hasNext()) {
                it2.next().initialize(G2());
            }
        } else {
            z4().LJIIIZ(G2(), this.LLJJJIL, this.LLJ, m3());
        }
        if (E3()) {
            return;
        }
        r0 r0VarO2 = o2();
        boolean zLIZIZ = C539900LFk.LIZIZ(getShortVideoContext());
        TabHost tabHost = r0VarO2.LLJILLL;
        if (tabHost == null) {
            tabHost = null;
        }
        tabHost.setTabHostDisableParentScroll(zLIZIZ);
        if (!this.LLJJJJ) {
            ArrayList<C1653090t7T> arrayList = (ArrayList) z4().LIZLLL;
            for (C1653090t7T c1653090t7T : arrayList) {
                if (c1653090t7T.LIZIZ != null && v3(this.LLILLJJLI, c1653090t7T)) {
                    C19A3 c19a3 = this.LLILLJJLI;
                    AbstractC1653180t7c abstractC1653180t7c = c1653090t7T.LIZIZ;
                    C1658150tFd.LIZ(c19a3, R.id.sz5, abstractC1653180t7c, abstractC1653180t7c.getTag());
                }
            }
            this.LLILLJJLI.add(R.id.sz5, F4(), "ComplexLighteningTabScene");
            d5(this.LLILLJJLI, arrayList);
        }
        if (C1443960ngA.LJIIIZ(getShortVideoContext())) {
            showBottomTab(false);
        }
        this.LLLFF.LIZ(this, new AObjectS246S0100000_25(this, 340));
        getBottomTabIndexChangeEvent().LIZ(this, new AObjectS246S0100000_25(this, 341));
        getRecordControlApi().xk1().LJ(this, new AObjectS246S0100000_25(this, 342));
        getRecordControlApi().cJ0().LIZ(this, new AObjectS246S0100000_25(this, 343));
        getRecordControlApi().pU1().LIZ(this, new AObjectS246S0100000_25(this, 344));
        getRecordControlApi().xM2().LIZ(this, new AObjectS246S0100000_25(this, 345));
        getRecordControlApi().zx2().LIZ(this, new AObjectS246S0100000_25(this, 346));
        InterfaceC1621970sJH recordModeApi = getRecordModeApi();
        if (recordModeApi != null && (c385670FAfCP1 = recordModeApi.CP1()) != null) {
            c385670FAfCP1.LIZ(this, new AObjectS246S0100000_25(this, 335));
        }
        getCameraApiComponent().bu2().LIZ(this, new AObjectS246S0100000_25(this, 336));
        getCameraApiComponent().Dm2().LIZ(this, new AObjectS246S0100000_25(this, 337));
        getRecordAdapterApi().fJ0().LIZ(this, new AObjectS246S0100000_25(this, 338));
        if (((IAVServiceProxy) ServiceManager.get().getService(IAVServiceProxy.class)).getStoryService().LJI()) {
            getGestureApiComponent().AL1(K4(), 4, 200);
        }
        o2().LLJILJILJ.LIZ(this, new AObjectS246S0100000_25(this, 339));
        v5();
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        getRecordAdapterApi().eH1(null);
    }

    @Override // X.AbstractC2255721DQs
    public void onPause() {
        super.onPause();
        C201955140j.LIZIZ("CreativeToolStayTimeMonitor", "LighteningBottomTabComponent onPause");
        C560380LyO.LJIIZILJ = getCurrentBottomTab();
    }

    @Override // X.AbstractC2255721DQs
    public void onResume() {
        super.onResume();
        C201955140j.LIZIZ("CreativeToolStayTimeMonitor", "LighteningBottomTabComponent onResume");
        EnumC560450LyV currentBottomTab = getCurrentBottomTab();
        C560380LyO.LJIIZILJ(currentBottomTab, getShortVideoContext(), null);
        C560380LyO.LJIILLIIL(new C560470LyX(currentBottomTab, System.currentTimeMillis()));
    }

    @Override // X.AbstractC1653130t7X, X.AbstractC2255721DQs
    public void onStart() {
        super.onStart();
        handleBackFromTextMode();
    }

    private final h0<Integer> H4() {
        return this.LLLFFI;
    }

    @Override // X.AbstractC1653130t7X
    public /* bridge */ /* synthetic */ AbstractC1653290t7n Z1() {
        return this.LLLI;
    }

    @Override // X.AbstractC1653130t7X
    public C560530Lyd<String> m3() {
        return this.LLLF;
    }

    public C1653170t7b o4() {
        return this.LLLI;
    }

    @Override // X.AbstractC1653130t7X, X.AbstractC2255721DQs
    public InterfaceC1648020szI getApiComponent() {
        return this.LLJJJJJIL;
    }

    private final void mobDefaultBottomTabChange(String str) {
        InterfaceC1638550sk1 interfaceC1638550sk1 = (InterfaceC1638550sk1) getDiContainer().LJIIL(null, InterfaceC1638550sk1.class);
        if (interfaceC1638550sk1 != null && interfaceC1638550sk1.hy()) {
            return;
        }
        Integer numLIZJ = this.LLLFFI.LIZJ();
        if (numLIZJ != null && numLIZJ.intValue() == 0) {
            return;
        }
        t5(new C1647390syH("by_default", str, 0, false, false, false, null, false, false, 504));
    }

    private final boolean onlyShowLiveTab(C19A3 c19a3) {
        C1653090t7T next;
        List<C1653090t7T> list = this.LLLI.LIZLLL;
        if (!getShortVideoContext().onlyShowLiveTab) {
            return false;
        }
        Iterator<C1653090t7T> it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.LIZ.LIZIZ, "record_mode_live")) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C1653090t7T c1653090t7T = next;
        if (c1653090t7T == null) {
            return false;
        }
        observeBottomTabVisibility(c19a3, c1653090t7T);
        AbstractC1653180t7c abstractC1653180t7c = c1653090t7T.LIZIZ;
        if (abstractC1653180t7c != null) {
            C1658150tFd.LIZ(c19a3, R.id.sz5, o2(), "RecordBottomTabScene");
            c19a3.add(R.id.sz5, abstractC1653180t7c, abstractC1653180t7c.getTag());
        }
        changeToDefaultTab(c19a3, c1653090t7T, false);
        this.LLLI.LJIILJJIL(c1653090t7T);
        mobDefaultBottomTabChange(c1653090t7T.LIZ.LIZIZ);
        return true;
    }

    @Override // X.AbstractC1653130t7X
    public void B3(boolean z) {
        if (z) {
            C565600MGg componentizationConfig = getComponentizationConfig();
            if (componentizationConfig != null && componentizationConfig.LIZ) {
                InterfaceC1645840svm liveApiComponent = getLiveApiComponent();
                if (liveApiComponent != null) {
                    liveApiComponent.YC2(true, false);
                    return;
                }
                return;
            }
            getRootScene().LLLLLZ(true, false);
            return;
        }
        C565600MGg componentizationConfig2 = getComponentizationConfig();
        if (componentizationConfig2 != null && componentizationConfig2.LIZ) {
            InterfaceC1645840svm liveApiComponent2 = getLiveApiComponent();
            if (liveApiComponent2 == null) {
                return;
            }
            liveApiComponent2.YC2(false, true);
            return;
        }
        getRootScene().LLLLLZ(false, true);
    }

    public final void C5(boolean z) {
        if (Intrinsics.LJFF(getCurrentBottomTag(), "RecordLightening") || (Intrinsics.LJFF(getCurrentBottomTag(), "RecordBottomDMCamera") && C294760Bgw.LIZ())) {
            F4().LLLILZ(z);
        }
    }

    public final void Q3(TabHost tabHost) {
        if (tabHost.getCurrentIndex() > 0) {
            tabHost.LIZLLL(tabHost.getCurrentIndex() - 1, 3, true);
        }
    }

    public final void Z4(TabHost tabHost) {
        if (tabHost.getCurrentIndex() < tabHost.getTabCount() - 1) {
            tabHost.LIZLLL(tabHost.getCurrentIndex() + 1, 3, true);
        }
    }

    @Override // X.InterfaceC1648020szI
    public void configSwitchDuration(C1648150szV c1648150szV) {
        getSwitchDurationConfigFactory().onEvent(c1648150szV);
    }

    public final void e4(boolean z) {
        if (((IAVServiceProxy) ServiceManager.get().getService(IAVServiceProxy.class)).getStoryService().LJI()) {
            if (!z) {
                if (!this.LLLIL) {
                    getGestureApiComponent().WL(O4());
                    this.LLLIL = true;
                    return;
                }
                return;
            }
            if (!this.LLLIL) {
                return;
            }
            getGestureApiComponent().eL2(O4());
            this.LLLIL = false;
        }
    }

    public final void handleBottomTabChangedEvent(C1647390syH c1647390syH) {
        String string;
        C565600MGg componentizationConfig = getComponentizationConfig();
        if (componentizationConfig != null && componentizationConfig.LIZ) {
            String string2 = c1647390syH.LIZIZ.toString();
            boolean zIsRecordTab = isRecordTab(string2);
            q stickerApiComponent = getStickerApiComponent();
            if (stickerApiComponent != null) {
                C1622510sK9.LIZ(stickerApiComponent, zIsRecordTab);
            }
            Object obj = c1647390syH.LIZ;
            if (obj != null) {
                string = obj.toString();
            } else {
                string = null;
            }
            if (isStoryOrPhotoTab(string) || isStoryOrPhotoTab(string2)) {
                getShortVideoContext().isStoryOrPhotoTab = isStoryOrPhotoTab(string2);
                refreshStickerCategoriesForEffectTemplate();
            }
        }
    }

    public final void handleLeaveSharedARSession(String str) {
        InterfaceC1626180sQ4 interfaceC1626180sQ4BG0;
        q stickerApiComponent = getStickerApiComponent();
        if (stickerApiComponent != null) {
            C1624010sMZ.LJII(stickerApiComponent, null);
        }
        q stickerApiComponent2 = getStickerApiComponent();
        if (stickerApiComponent2 != null && (interfaceC1626180sQ4BG0 = stickerApiComponent2.bG0()) != null) {
            interfaceC1626180sQ4BG0.LIZIZ();
        }
        getShortVideoContext().LJJLIIIJL(false);
        this.LLJJJJLIIL.m10(true);
        getRecordControlApi().xP1(true, false, true);
        this.LLJJJJLIIL.oL1();
    }

    public final boolean isRecordTab(String str) {
        if (!Intrinsics.LJFF(str, "RecordShoot15s") && !Intrinsics.LJFF(str, "RecordShoot60s") && !Intrinsics.LJFF(str, "RecordShoot180s") && !Intrinsics.LJFF(str, "RecordShoot600s") && !Intrinsics.LJFF(str, "RecordNow") && !Intrinsics.LJFF(str, "record_mode_combine") && !Intrinsics.LJFF(str, "record_mode_shoot")) {
            return false;
        }
        return true;
    }

    public final boolean isStoryOrPhotoTab(String str) {
        return C13LP.LJJJJ(str, C1697810uHb.LJIIJJI(getActivity().getString(2131845852), getActivity().getString(2131845854), getActivity().getString(2131845851), getActivity().getString(2131845850), getActivity().getString(2131845859), getActivity().getString(2131845861), "RecordBottomStory", "RecordBottomDMCamera"));
    }

    public final boolean n5(C1647390syH c1647390syH) {
        if (C330830Cy1.LIZ() && TextUtils.equals("AISelf", String.valueOf(c1647390syH.LIZ))) {
            return c1647390syH.LJ;
        }
        return true;
    }

    @Override // X.InterfaceC1648020szI
    public void showBottomTab(boolean z) {
        C1402840mbq c1402840mbq;
        q stickerApiComponent;
        q stickerApiComponent2;
        Effect effectLLILIL;
        LiveEvent<Boolean> liveEventDN1;
        this.LLLIILIL = z;
        if ((getShortVideoContext().LJJJJZ() && !getShortVideoContext().LJJIJIIJI()) || getShortVideoContext().LJJJ() || getShortVideoContext().creativeModel.editorProAIGCInfoModel.aiPlaygroundCameraModel.fromAiPlayground || (((c1402840mbq = getShortVideoContext().shareContext) != null && c1402840mbq.isLinkShare) || getShortVideoContext().LJJIIJZLJL() || (((stickerApiComponent = getStickerApiComponent()) != null && (liveEventDN1 = stickerApiComponent.dN1()) != null && Intrinsics.LJFF(liveEventDN1.LJI(), Boolean.TRUE)) || this.LLLIIL || getShortVideoContext().LJJIJ() || getShortVideoContext().creativeModel.aigcOfflineModel.isOfflineAIGCEffectGenerating || C539900LFk.LJI(getShortVideoContext()) || ((Intrinsics.LJFF(this.LLJJJJLIIL.RS().LIZJ(), Boolean.FALSE) && (stickerApiComponent2 = getStickerApiComponent()) != null && (effectLLILIL = stickerApiComponent2.C0().LLILIL()) != null && C1624550sNR.LIZIZ(effectLLILIL)) || C1649780t28.LIZ(getShortVideoContext()) || C1649780t28.LIZIZ(getShortVideoContext()))))) {
            this.LLJILLL.LJIIJ(Boolean.FALSE);
            return;
        }
        TuxTextView tuxTextViewP4 = P4();
        if (tuxTextViewP4 != null) {
            C786410Ut5.LLLLZLL(tuxTextViewP4, 8);
        }
        this.LLJILLL.LJIIJ(Boolean.valueOf(z));
    }

    @Override // X.InterfaceC1648020szI
    public void showComplexTab(boolean z) {
        if (!this.LLJJJJ) {
            F4().LLLILZ(z);
        }
    }

    public final void showExitSharedARSessionDialog(String str) {
        C1397620mTQ c1397620mTQ = new C1397620mTQ(getActivity());
        c1397620mTQ.LJFF(2131848040, new AwS139S1100000_25(this, str, 4));
        c1397620mTQ.LJII(2131830038, AFwS266S0000000_25.get$arr$(279));
        C1397580mTM c1397580mTM = new C1397580mTM(getActivity());
        c1397580mTM.LJFF(2131848042);
        c1397580mTM.LIZ(2131848041);
        c1397580mTM.LJIIL = c1397620mTQ;
        c1397580mTM.LJII = false;
        new C1397510mTF(c1397580mTM).LIZLLL();
    }

    public final boolean skipPermissionCheck(C1647390syH c1647390syH) {
        if (c1647390syH.LIZ == null) {
            if (Intrinsics.LJFF("template_schema", getShortVideoContext().creativeModel.templateSchemaData.schemaTag) || Intrinsics.LJFF("editor_tab", getShortVideoContext().creativeModel.landingModel.landingTab)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void t5(C1647390syH c1647390syH) {
        Object next;
        C1653330t7r c1653330t7r;
        String str;
        C1653330t7r c1653330t7r2;
        C1653330t7r c1653330t7r3;
        if (c1647390syH.LIZLLL) {
            if (c1647390syH.LJII && c1647390syH.LIZ != null) {
                return;
            }
            Object obj = null;
            if (this.LLJJJJ) {
                Iterator it2 = ((ArrayList) this.LLLI.LIZLLL).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next2 = it2.next();
                    if (Intrinsics.LJFF(((C1653090t7T) next2).LIZ.LIZIZ, c1647390syH.LIZIZ)) {
                        obj = next2;
                        break;
                    }
                }
                C1653090t7T c1653090t7T = (C1653090t7T) obj;
                if (c1653090t7T == null || (c1653330t7r3 = c1653090t7T.LIZ) == null || (str = c1653330t7r3.LIZJ) == null) {
                    return;
                }
            } else {
                Iterator it3 = ((ArrayList) z4().LIZLLL).iterator();
                while (true) {
                    if (it3.hasNext()) {
                        next = it3.next();
                        if (Intrinsics.LJFF(((C1653090t7T) next).LIZ.LIZIZ, c1647390syH.LIZIZ)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                C1653090t7T c1653090t7T2 = (C1653090t7T) next;
                if (c1653090t7T2 == null || (c1653330t7r2 = c1653090t7T2.LIZ) == null || (str = c1653330t7r2.LIZJ) == null) {
                    Iterator it4 = ((ArrayList) this.LLLI.LIZLLL).iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            break;
                        }
                        Object next3 = it4.next();
                        if (Intrinsics.LJFF(((C1653090t7T) next3).LIZ.LIZIZ, c1647390syH.LIZIZ)) {
                            obj = next3;
                            break;
                        }
                    }
                    C1653090t7T c1653090t7T3 = (C1653090t7T) obj;
                    if (c1653090t7T3 == null || (c1653330t7r = c1653090t7T3.LIZ) == null) {
                        return;
                    } else {
                        str = c1653330t7r.LIZJ;
                    }
                }
            }
            C1446240njq c1446240njq = C1446240njq.LIZ;
            ShortVideoContext shortVideoContext = getShortVideoContext();
            int i = c1647390syH.LIZJ;
            boolean z = c1647390syH.LJII;
            c1446240njq.getClass();
            C1446240njq.LIZJ(shortVideoContext, i, str, z);
        }
    }

    private final void d5(C19A3 c19a3, List<C1653090t7T> list) {
        Iterator<C1653090t7T> it2 = list.iterator();
        while (it2.hasNext()) {
            observeBottomTabVisibility(c19a3, it2.next());
        }
    }

    private final void x5(C19A3 c19a3, List<C1653090t7T> list) {
        C1653090t7T next;
        if (this.LLLIZZ) {
            return;
        }
        this.LLLIZZ = true;
        Iterator<C1653090t7T> it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.LIZ.LIZLLL) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C1653090t7T c1653090t7T = next;
        if (c1653090t7T != null) {
            changeToDefaultTab(c19a3, c1653090t7T, false);
            z4().LJIILJJIL(c1653090t7T);
        }
    }

    @Override // X.InterfaceC1648020szI
    public void showComplexTab(int i, C1647390syH c1647390syH) {
        if (!this.LLJJJJ) {
            F4().LLJJIJIL = c1647390syH;
            this.LLLFFI.LJII(Integer.valueOf(i));
        }
    }

    private final void k5(int i, InterfaceC1653190t7d interfaceC1653190t7d, int i2) {
        C19A3 c19a3 = this.LLILLJJLI;
        Iterator it2 = ((ArrayList) this.LLLI.LIZLLL).iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (Intrinsics.LJFF(((C1653090t7T) next).LIZ.LIZIZ, EnumC1647570syZ.LIVE.getTag())) {
                if (next != null) {
                    C1653320t7q.LIZ.getClass();
                    C1653320t7q.LIZ(211, "addLiveBottomTab");
                    return;
                }
            }
        }
        C1653090t7T c1653090t7TLIZ = this.LLLI.LIZ(G2(), i, interfaceC1653190t7d);
        observeBottomTabVisibility(c19a3, c1653090t7TLIZ);
        AbstractC1653180t7c abstractC1653180t7c = c1653090t7TLIZ.LIZIZ;
        if (abstractC1653180t7c != null) {
            C1658150tFd.LIZ(c19a3, R.id.sz6, abstractC1653180t7c, abstractC1653180t7c.getTag());
        }
        if (c1653090t7TLIZ.LIZ.LIZLLL) {
            C12WG.LIZLLL(c19a3, new ARunnableS58S0300000_25(this, c19a3, c1653090t7TLIZ, 5), 500L);
        }
    }

    @Override // X.InterfaceC1648020szI
    public void addLiveBottomTab(int i, InterfaceC1653190t7d interfaceC1653190t7d, int i2) {
        k5(i, interfaceC1653190t7d, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f0(C19A3 c19a3, C1DRG c1drg, List<? extends InterfaceC1653190t7d> list, List<? extends InterfaceC1653190t7d> list2, boolean z) {
        super(c19a3, c1drg, list);
        this.LLJJJIL = list2;
        this.LLJJJJ = z;
        this.LLJJJJJIL = this;
        this.LLJJJJLIIL = (a) c1drg.LJII(a.class, null);
        this.LLJJL = C1664770tQJ.LIZ(getDiContainer(), e0.class, null);
        this.LLJJLIIIJLLLLLLLZ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1648570t0B.class, null);
        this.LLJL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1621970sJH.class, null);
        this.LLJLIL = C1664770tQJ.LIZIZ(getDiContainer(), q.class, null);
        this.LLJLILLLLZIIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1652190t61.class, null);
        this.LLJLL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1648510t05.class, null);
        this.LLJLLIL = C1664770tQJ.LIZ(getDiContainer(), TikTokCameraBaseGroupScene.class, null);
        this.LLJLLL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1647420syK.class, null);
        this.LLJZ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC579050MnP.class, null);
        this.LLJZIJLIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1645840svm.class, null);
        this.LLL = C1664770tQJ.LIZIZ(getDiContainer(), C565600MGg.class, null);
        this.LLLF = new C560530Lyd<>();
        this.LLLFF = m3();
        this.LLLFFI = new h0<>(8);
        this.LLLFZ = new C1653210t7f(0);
        this.LLLI = new C1653170t7b(getCameraApiComponent(), LifecycleOwnerKt.getLifecycleScope(c19a3));
        this.LLLII = C452501pT.LIZIZ(new AwS426S0200000_25(this, c19a3, 89));
        this.LLLIIII = C452501pT.LIZIZ(new AwS569S0100000_25(this, 515));
        this.LLLIIIIL = Keva.getRepo("repo_story_show_guide_hint");
        this.LLLIIIL = C452501pT.LIZIZ(new AwS569S0100000_25(c19a3, 516));
        this.LLLIILIL = true;
        this.LLLILZ = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(270));
        this.LLLILZJ = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(271));
        this.LLLJ = C452501pT.LIZ(EnumC452301pR.NONE, new AwS426S0200000_25(this, c1drg, 90));
    }
}
