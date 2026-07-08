package com.ss.android.ugc.gamora.recorder.greenscreen;

import X.AbstractC1632340sa0;
import X.AbstractC1652960t7G;
import X.C01GW;
import X.C05YF;
import X.C0LAB;
import X.C0MFK;
import X.C1390380mHk;
import X.C13LE;
import X.C13LP;
import X.C1403460mcq;
import X.C1408090mkJ;
import X.C1413400mss;
import X.C1631660sYu;
import X.C1651500t4u;
import X.C1652920t7C;
import X.C1652930t7D;
import X.C1652940t7E;
import X.C1652970t7H;
import X.C1652990t7J;
import X.C1653000t7K;
import X.C1654400t9a;
import X.C1662100tM0;
import X.C1664590tQ1;
import X.C1664770tQJ;
import X.C1954807lC;
import X.C19576911iZ;
import X.C19A3;
import X.C1DRG;
import X.C20684815ws;
import X.C2217381BqS;
import X.C23250099c;
import X.C287470BOn;
import X.C296510Bjl;
import X.C375830EoP;
import X.C385670FAf;
import X.C452501pT;
import X.C538770LBb;
import X.C560970LzL;
import X.C577560Ml0;
import X.EnumC1647570syZ;
import X.EnumC1651770t5L;
import X.EnumC1651790t5N;
import X.EnumC1654620t9w;
import X.EnumC993090bwx;
import X.EnumC993110bwz;
import X.InterfaceC1420200n3q;
import X.InterfaceC1632360sa2;
import X.InterfaceC1638550sk1;
import X.InterfaceC1648570t0B;
import X.InterfaceC1651080t4E;
import X.InterfaceC1651490t4t;
import X.InterfaceC1654640t9y;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC379610EuV;
import Y.AObjectS238S0100000_2;
import Y.AObjectS245S0100000_22;
import Y.AObjectS246S0100000_25;
import Y.AObjectS305S0200000_22;
import Y.AObjectS306S0200000_25;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.als.LiveStateTransformationsKt;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialog;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialogBuilder;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.texttoimage.ITextToImageService;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import com.zhiliaoapp.musically.R;
import ge.i;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.jvm.internal.Intrinsics;
import lnn.q;

/* JADX INFO: loaded from: classes26.dex */
public final class e0 extends i<InterfaceC1632360sa2, C1652940t7E, C1652930t7D, C1652920t7C> implements InterfaceC1632360sa2, InterfaceC1654640t9y, InterfaceC379610EuV {
    public static final C1631660sYu LLJZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJZIJLIL;
    public static final int LLL;
    public final C19A3 LLJILJILJ;
    public final C1DRG LLJILLL;
    public final InterfaceC1731706qJ LLJJ;
    public final InterfaceC1731706qJ LLJJI;
    public final C538770LBb<Boolean> LLJJIII;
    public final C538770LBb<Pair<Boolean, EnumC993110bwz>> LLJJIJI;
    public final C538770LBb<Boolean> LLJJIJIIJIL;
    public final C538770LBb<Boolean> LLJJIJIL;
    public final C538770LBb<Boolean> LLJJJ;
    public final InterfaceC1731706qJ LLJJJIL;
    public final InterfaceC1731706qJ LLJJJJ;
    public final ConcurrentHashSet<EnumC993110bwz> LLJJJJJIL;
    public final InterfaceC1731706qJ LLJJJJLIIL;
    public final InterfaceC1731706qJ LLJJL;
    public final InterfaceC1731706qJ LLJJLIIIJLLLLLLLZ;
    public CreativeLoadingDialog LLJL;
    public C375830EoP<Unit> LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public final Function0<C1652930t7D> LLJLL;
    public final Function0<C1652920t7C> LLJLLIL;
    public final EnumC1654620t9w LLJLLL;

    /* JADX WARN: Type inference failed for: r0v15, types: [X.0sYu] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(e0.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0);
        C13LE.LIZ.getClass();
        LLJZIJLIL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(e0.class, "splitShootComponent", "getSplitShootComponent()Lcom/ss/android/ugc/gamora/recorder/splitshoot/SplitShootApiComponent;", 0), new C2217381BqS(e0.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/TikTokCameraApiComponent;", 0), new C2217381BqS(e0.class, "stickerApi", "getStickerApi()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0), new C2217381BqS(e0.class, "toolbarApi", "getToolbarApi()Lcom/ss/android/ugc/gamora/recorder/toolbar/refactory/ToolbarApiComponent;", 0), new C2217381BqS(e0.class, "greenScreenCoreApi", "getGreenScreenCoreApi()Lcom/ss/android/ugc/gamora/recorder/greenscreen/RecordGreenScreenLogicApi;", 0), new C2217381BqS(e0.class, "recordTooltipComponent", "getRecordTooltipComponent()Lcom/ss/android/ugc/gamora/recorder/tooltip/RecordTooltipApiComponent;", 0)};
        LLJZ = new Object() { // from class: X.0sYu
        };
        LLL = 8;
    }

    public final void I4() {
        InterfaceC1638550sk1 interfaceC1638550sk1K5;
        if (this.LLJJIII.LIZJ().booleanValue()) {
            return;
        }
        boolean z = false;
        if (!C287470BOn.LIZ() && (interfaceC1638550sk1K5 = k5()) != null && interfaceC1638550sk1K5.QA1(EnumC1647570syZ.RECORD_LIGHTENING_TEXT.getTag())) {
            getShortVideoContext();
            if (((ITextToImageService) ServiceManager.get().getService(ITextToImageService.class)).LJJIFFI()) {
                return;
            }
        }
        InterfaceC1651080t4E toolbarApi = getToolbarApi();
        if (toolbarApi == null || !toolbarApi.Nq()) {
            C01GW c01gw = C1652970t7H.LIZ;
            boolean z2 = ((Keva) c01gw.getValue()).getBoolean("record_toolbar_green_screen_show_key", false);
            C375830EoP<Unit> c375830EoP = this.LLJLIL;
            if (c375830EoP != null && c375830EoP.LIZ() != null) {
                z = true;
            }
            if (!z2 || z) {
                boolean z3 = !z2;
                x5(this, EnumC1651790t5N.GREEN_SCREEN, z3, C1664590tQ1.LJIIIZ(this).getString(2131828247), z3, Mp4ScreenVideoLoadTimeout.CONTROL);
                ((Keva) c01gw.getValue()).storeBoolean("record_toolbar_green_screen_show_key", true);
                if (z) {
                    x5(this, EnumC1651790t5N.PORTRAIT, false, C1664590tQ1.LJIIIZ(this).getString(2131828251), false, Mp4ScreenVideoLoadTimeout.CONTROL);
                }
            }
        }
    }

    public InterfaceC1632360sa2 P4() {
        return this;
    }

    @Override // X.InterfaceC1654640t9y
    public void z0() {
    }

    private final C1413400mss Z4() {
        return (C1413400mss) this.LLJLILLLLZIIL.getValue();
    }

    private final C0MFK d5() {
        return (C0MFK) this.LLJJLIIIJLLLLLLLZ.getValue(this, LLJZIJLIL[6]);
    }

    private final mn3.e0 getCameraApiComponent() {
        return (mn3.e0) this.LLJJJIL.getValue(this, LLJZIJLIL[2]);
    }

    private final q getStickerApi() {
        return (q) this.LLJJJJ.getValue(this, LLJZIJLIL[3]);
    }

    private final InterfaceC1638550sk1 k5() {
        return (InterfaceC1638550sk1) this.LLJJI.getValue(this, LLJZIJLIL[1]);
    }

    public final void K4() {
        InterfaceC1420200n3q interfaceC1420200n3qT4;
        C1403460mcq c1403460mcq = C1403460mcq.LIZ;
        ShortVideoContext shortVideoContext = getShortVideoContext();
        c1403460mcq.getClass();
        C1403460mcq.LIZJ("on", shortVideoContext, "click");
        if (C560970LzL.LIZ(C1664590tQ1.LJIIIZ(this)) || ((interfaceC1420200n3qT4 = T4()) != null && interfaceC1420200n3qT4.x62())) {
            this.LLJJIJIIJIL.LJII(Boolean.TRUE);
        } else {
            JC();
        }
    }

    @Override // X.InterfaceC1654640t9y
    public boolean LJJLIL() {
        InterfaceC1651080t4E toolbarApi;
        return !this.LLJJIII.LIZJ().booleanValue() && (!((Keva) C1652970t7H.LIZ.getValue()).getBoolean("record_toolbar_green_screen_show_key", false) || Y71()) && ((toolbarApi = getToolbarApi()) == null || !toolbarApi.Nq());
    }

    @Override // X.InterfaceC1632360sa2
    public void My1() {
        boolean z = !this.LLJJJ.LIZJ().booleanValue();
        this.LLJJJ.LJII(Boolean.valueOf(z));
        C1403460mcq c1403460mcq = C1403460mcq.LIZ;
        ShortVideoContext shortVideoContext = getShortVideoContext();
        String str = z ? "on" : "off";
        c1403460mcq.getClass();
        if (C296510Bjl.LIZ()) {
            C0LAB c0labLIZLLL = C1403460mcq.LIZLLL(shortVideoContext);
            c0labLIZLLL.LJ("to_status", str);
            C20684815ws.LJIILLIIL("green_screen_portrait_icon_click", c0labLIZLLL.LIZ);
        }
        if (this.LLJJIJIL.LIZJ().booleanValue()) {
            Context contextLJIIIZ = C1664590tQ1.LJIIIZ(this);
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            creativeToastBuilder.message(z ? C1664590tQ1.LJIIIZ(this).getResources().getString(2131828253) : C1664590tQ1.LJIIIZ(this).getResources().getString(2131828252));
            creativeToastBuilder.duration(1000L);
            C1390380mHk.LIZJ(contextLJIIIZ, 8011, creativeToastBuilder);
        }
    }

    public final InterfaceC1420200n3q T4() {
        return (InterfaceC1420200n3q) this.LLJJL.getValue(this, LLJZIJLIL[5]);
    }

    @Override // X.InterfaceC1632360sa2
    public boolean Y71() {
        return (this.LLJLIL == null || Unit.LIZ == null) ? false : true;
    }

    public final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LLJJ.getValue(this, LLJZIJLIL[0]);
    }

    public final InterfaceC1651080t4E getToolbarApi() {
        return (InterfaceC1651080t4E) this.LLJJJJLIIL.getValue(this, LLJZIJLIL[4]);
    }

    @Override // X.InterfaceC1632360sa2
    public void u00() {
        this.LLJJIJIL.LJII(Boolean.TRUE);
    }

    @Override // X.InterfaceC1632360sa2
    public C385670FAf<Boolean> ut1() {
        return LiveStateTransformationsKt.LIZ(this.LLJJIJI, AFwS266S0000000_25.get$arr$(292));
    }

    private final void F4() {
        q stickerApi = getStickerApi();
        if (stickerApi != null) {
            stickerApi.Aj2(Z4());
        }
    }

    private final void H4() {
        if (getShortVideoContext().creativeModel.newGreenScreenEffectModel.getNeedAutoSwitchMob()) {
            this.LLJLIL = new C375830EoP<>(Unit.LIZ);
        }
    }

    private final void Xi() {
        C385670FAf<AbstractC1632340sa0> c385670FAfWo1;
        mn3.e0 cameraApiComponent;
        C385670FAf<Boolean> c385670FAfA31;
        if (!C287470BOn.LIZ() && (cameraApiComponent = getCameraApiComponent()) != null && (c385670FAfA31 = cameraApiComponent.A31()) != null) {
            c385670FAfA31.LIZ(this, new AObjectS238S0100000_2(this, 2));
        }
        InterfaceC1651080t4E toolbarApi = getToolbarApi();
        if (toolbarApi != null) {
            InterfaceC1651490t4t interfaceC1651490t4tKY1 = toolbarApi.KY1();
            if (!(!(interfaceC1651490t4tKY1 instanceof C1651500t4u))) {
                interfaceC1651490t4tKY1 = null;
            }
            this.LLJJIJI.LIZ(this, new AObjectS246S0100000_25(this, 455));
            this.LLJJJ.LIZ(this, new AObjectS306S0200000_25((Object) interfaceC1651490t4tKY1, (Object) this, (InterfaceC1648570t0B) 15));
            this.LLJJIJIL.LIZ(this, new AObjectS305S0200000_22(interfaceC1651490t4tKY1, this, 18));
            this.LLJJIJIIJIL.LIZ(this, new AObjectS245S0100000_22(this, 258));
            InterfaceC1420200n3q interfaceC1420200n3qT4 = T4();
            if (interfaceC1420200n3qT4 == null || (c385670FAfWo1 = interfaceC1420200n3qT4.wo1()) == null) {
                return;
            }
            c385670FAfWo1.LIZ(this, new AObjectS245S0100000_22(this, 259));
        }
    }

    @Override // X.InterfaceC1632360sa2
    public void JC() {
        Context contextLJIIIZ = C1664590tQ1.LJIIIZ(this);
        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
        creativeToastBuilder.message(C1664590tQ1.LJIIIZ(this).getString(2131838915));
        creativeToastBuilder.duration(1000L);
        C1390380mHk.LIZJ(contextLJIIIZ, 8010, creativeToastBuilder);
    }

    @Override // ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        C0MFK c0mfkD5 = d5();
        if (c0mfkD5 != null) {
            c0mfkD5.ig(this);
        }
        H4();
        Xi();
        F4();
    }

    public final void v5() {
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C1408090mkJ(this, null), 3);
    }

    @Override // X.InterfaceC1654640t9y
    public void H() {
        I4();
    }

    @Override // X.InterfaceC1654640t9y
    public EnumC1654620t9w LJJI() {
        return this.LLJLLL;
    }

    @Override // X.InterfaceC1632360sa2
    public C385670FAf<Boolean> QH1() {
        return this.LLJJIII;
    }

    @Override // X.InterfaceC1632360sa2
    public C385670FAf<Boolean> Ry2() {
        return this.LLJJIJIIJIL;
    }

    @Override // X.InterfaceC1632360sa2
    public C385670FAf<Boolean> Tk0() {
        return this.LLJJJ;
    }

    @Override // X.AbstractC1664470tPp, X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        P4();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILLL;
    }

    public final C19A3 getParentScene() {
        return this.LLJILJILJ;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C1652930t7D> o2() {
        return this.LLJLL;
    }

    @Override // X.InterfaceC1632360sa2
    public C385670FAf<Boolean> rK0() {
        return this.LLJJIJIL;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C1652920t7C> w2() {
        return this.LLJLLIL;
    }

    @Override // X.InterfaceC1632360sa2
    public void CG0(EnumC993090bwx enumC993090bwx) {
        C538770LBb<Boolean> c538770LBb = this.LLJJIJIL;
        Boolean bool = Boolean.FALSE;
        c538770LBb.LJII(bool);
        this.LLJJIJIIJIL.LJII(bool);
        this.LLJJJ.LJII(Boolean.TRUE);
        C1403460mcq c1403460mcq = C1403460mcq.LIZ;
        ShortVideoContext shortVideoContext = getShortVideoContext();
        String mob = enumC993090bwx.getMob();
        c1403460mcq.getClass();
        C1403460mcq.LIZJ("off", shortVideoContext, mob);
    }

    public final CreativeLoadingDialog O4(Function0<Unit> function0) {
        C19576911iZ c19576911iZ = C19576911iZ.LIZ;
        Context contextLJIIIZ = C1664590tQ1.LJIIIZ(this);
        CreativeLoadingDialogBuilder creativeLoadingDialogBuilder = new CreativeLoadingDialogBuilder();
        creativeLoadingDialogBuilder.showProgress(false);
        creativeLoadingDialogBuilder.backCanCancel(true);
        creativeLoadingDialogBuilder.cancelViewVisibleType(CreativeLoadingDialogBuilder.CancelType.VISIBLE);
        creativeLoadingDialogBuilder.loadingMessage(C1664590tQ1.LJIIIZ(this).getString(R.string.txr));
        creativeLoadingDialogBuilder.clickCancelListener(new AwS601S0100000_22(function0, (Function0<Unit>) 618));
        return c19576911iZ.createLoadingDialog(contextLJIIIZ, 1126, creativeLoadingDialogBuilder);
    }

    @Override // X.InterfaceC1632360sa2
    public void bu0(EnumC993110bwz enumC993110bwz) {
        this.LLJJIJI.LJII(new Pair<>(Boolean.TRUE, enumC993110bwz));
    }

    public final void n5(AbstractC1652960t7G abstractC1652960t7G) {
        AwS569S0100000_25 awS569S0100000_25 = new AwS569S0100000_25(this, 578);
        AwS569S0100000_25 awS569S0100000_252 = new AwS569S0100000_25(this, 579);
        abstractC1652960t7G.getClass();
        if (Intrinsics.LJFF(abstractC1652960t7G, C1653000t7K.LIZIZ)) {
            awS569S0100000_25.invoke();
        } else {
            if (Intrinsics.LJFF(abstractC1652960t7G, C1652990t7J.LIZIZ)) {
                awS569S0100000_252.invoke();
                return;
            }
            throw new C1954807lC();
        }
    }

    @Override // X.InterfaceC1632360sa2
    public void su0(EnumC993110bwz enumC993110bwz) {
        this.LLJJIJI.LJII(new Pair<>(Boolean.FALSE, enumC993110bwz));
    }

    public final void t5(boolean z) {
        this.LLJJIII.LJII(Boolean.valueOf(z));
        InterfaceC1651080t4E toolbarApi = getToolbarApi();
        if (toolbarApi != null) {
            InterfaceC1651490t4t interfaceC1651490t4tKY1 = toolbarApi.KY1();
            if ((!(interfaceC1651490t4tKY1 instanceof C1651500t4u)) && interfaceC1651490t4tKY1 != null) {
                interfaceC1651490t4tKY1.LJI(C577560Ml0.LIZ, Boolean.valueOf(z));
            }
        }
    }

    public e0(C19A3 c19a3, C1DRG c1drg) {
        super(c19a3);
        this.LLJILJILJ = c19a3;
        this.LLJILLL = c1drg;
        this.LLJJ = C1664770tQJ.LIZ(getDiContainer(), ShortVideoContext.class, null);
        this.LLJJI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1638550sk1.class, null);
        Boolean bool = Boolean.FALSE;
        this.LLJJIII = new C538770LBb<>(bool);
        this.LLJJIJI = new C538770LBb<>(new Pair(Boolean.TRUE, EnumC993110bwz.NONE));
        this.LLJJIJIIJIL = new C538770LBb<>(Boolean.valueOf(getShortVideoContext().creativeModel.newGreenScreenEffectModel.getOpenGreenScreenMode()));
        this.LLJJIJIL = new C538770LBb<>(bool);
        this.LLJJJ = new C538770LBb<>(Boolean.valueOf(getShortVideoContext().creativeModel.newGreenScreenEffectModel.getOpenPortraitMode()));
        this.LLJJJIL = C1664770tQJ.LIZIZ(getDiContainer(), mn3.e0.class, null);
        this.LLJJJJ = C1664770tQJ.LIZIZ(getDiContainer(), q.class, null);
        this.LLJJJJJIL = new ConcurrentHashSet<>();
        this.LLJJJJLIIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1651080t4E.class, null);
        this.LLJJL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1420200n3q.class, null);
        this.LLJJLIIIJLLLLLLLZ = C1664770tQJ.LIZIZ(getDiContainer(), C0MFK.class, null);
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 799));
        this.LLJLL = new AwS569S0100000_25(this, 577);
        this.LLJLLIL = new AwS569S0100000_25(this, 580);
        this.LLJLLL = EnumC1654620t9w.GREEN_SCREEN;
    }

    @Override // X.InterfaceC1632360sa2
    public void wn0(boolean z, boolean z2) {
        C1654400t9a c1654400t9aZu0;
        View view;
        int hintTextRes;
        String str;
        InterfaceC1651080t4E toolbarApi = getToolbarApi();
        if (toolbarApi != null && (c1654400t9aZu0 = toolbarApi.Zu0(EnumC1651770t5L.GREEN_SCREEN)) != null && (view = c1654400t9aZu0.LIZJ) != null) {
            if (z2) {
                show();
                i3(new AwS604S0100000_25(view, 361));
            } else {
                EnumC993110bwz enumC993110bwz = (EnumC993110bwz) C13LP.LJJJLIIL(this.LLJJJJJIL);
                if (enumC993110bwz != null && (hintTextRes = enumC993110bwz.getHintTextRes()) > 0) {
                    Context contextLJIIIZ = C1664590tQ1.LJIIIZ(this);
                    CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                    creativeToastBuilder.message(C1664590tQ1.LJIIIZ(this).getResources().getString(hintTextRes));
                    creativeToastBuilder.duration(1000L);
                    C1390380mHk.LIZJ(contextLJIIIZ, 8010, creativeToastBuilder);
                }
            }
            C1403460mcq c1403460mcq = C1403460mcq.LIZ;
            ShortVideoContext shortVideoContext = getShortVideoContext();
            if (z) {
                str = "on";
            } else {
                str = "off";
            }
            c1403460mcq.getClass();
            if (C296510Bjl.LIZ()) {
                C0LAB c0labLIZLLL = C1403460mcq.LIZLLL(shortVideoContext);
                c0labLIZLLL.LIZ(z2 ? 1 : 0, "is_clickable");
                c0labLIZLLL.LJ("green_screen_status", str);
                C20684815ws.LJIILLIIL("green_screen_icon_click", c0labLIZLLL.LIZ);
            }
        }
    }

    public static final void x5(e0 e0Var, EnumC1651790t5N enumC1651790t5N, boolean z, String str, boolean z2, long j) {
        String string;
        InterfaceC1651080t4E toolbarApi = e0Var.getToolbarApi();
        if (toolbarApi != null) {
            if (z) {
                string = C1664590tQ1.LJIIIZ(e0Var).getString(2131828248);
            } else {
                string = "";
            }
            toolbarApi.Nh(new C1662100tM0(enumC1651790t5N, string, str, z2, j, null, null, null, null, null, null, null, null, 8160));
        }
    }
}
