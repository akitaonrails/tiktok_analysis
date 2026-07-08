package com.ss.android.ugc.aweme;

import X.AbstractC848400XPy;
import X.C01GW;
import X.C0CAU;
import X.C0P0T;
import X.C0RQB;
import X.C0SXF;
import X.C0XPD;
import X.C0XQ7;
import X.C1164270gP3;
import X.C1164280gP4;
import X.C1361150lWb;
import X.C1383760m74;
import X.C1383870m7F;
import X.C1384090m7b;
import X.C1384170m7j;
import X.C1384300m7w;
import X.C1384340m80;
import X.C1384360m82;
import X.C1384410m87;
import X.C1384440m8A;
import X.C1384500m8G;
import X.C1384680m8Y;
import X.C1384750m8f;
import X.C1384830m8n;
import X.C1384840m8o;
import X.C1384860m8q;
import X.C1385060m9A;
import X.C13LE;
import X.C1402290max;
import X.C14EU;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1602160rnK;
import X.C1637806bA;
import X.C1697810uHb;
import X.C19719912Dl;
import X.C19EG;
import X.C2217381BqS;
import X.C274960Aq6;
import X.C293760BfK;
import X.C418440Gaw;
import X.C444960Hcc;
import X.C452501pT;
import X.C622680Oba;
import X.C724240Sb0;
import X.C724270Sb3;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C814420VxA;
import X.EnumC1361130lWZ;
import X.EnumC255700yp;
import X.InterfaceC1066480drK;
import X.InterfaceC1384330m7z;
import X.InterfaceC1385050m99;
import X.InterfaceC1554640qYg;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import Y.ARunnableS121S0100000_21;
import android.animation.Animator;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.DanmakuCompatibleReportAndLoginViewModel;
import com.ss.android.ugc.aweme.DanmakuLandscapePresentAssem;
import com.ss.android.ugc.aweme.core.DanmakuViewModel;
import com.ss.android.ugc.aweme.eventtrack.eventfiles.ClickDanmakuEvent;
import com.ss.android.ugc.aweme.feed.adapter.VideoEventDispatchViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.landscape.LandscapeFeedDanmakuPresentAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.model.IDanmakuData;
import com.ss.android.ugc.aweme.service.DanmakuProtocol;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AFwS294S0000000_11;
import kotlin.jvm.internal.AFwS305S0000000_21;
import kotlin.jvm.internal.AwS387S0200000_21;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.AwS9S0000001_21;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes22.dex */
public final class DanmakuLandscapePresentAssem extends BaseCellSlotComponent<DanmakuLandscapePresentAssem> implements DanmakuProtocol, LandscapeFeedDanmakuPresentAbility, InterfaceC1554640qYg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLLII;
    public final InterfaceC1731706qJ LLJLLIL;
    public final C01GW LLJLLL;
    public final C01GW LLJZ;
    public final C01GW LLJZIJLIL;
    public final C01GW LLL;
    public final C01GW LLLF;
    public final C01GW LLLFF;
    public final C1384500m8G LLLFFI;
    public C1385060m9A LLLFZ;
    public InterfaceC1384330m7z LLLI;
    public final AwS565S0100000_21 LLLII;
    public C1384340m80 LLLIIII;
    public final List<IDanmakuData> LLLIIIIL;
    public IDanmakuData LLLIIIL;
    public boolean LLLIIL;
    public boolean LLLIILIL;
    public boolean LLLIL;
    public double LLLILZ;
    public boolean LLLILZJ;
    public C0P0T LLLILZLLLI;
    public final C1384170m7j LLLIZZ;
    public final int LLLJ;
    public final C1384090m7b LLLJIL;
    public final C01GW LLLJL;
    public final ARunnableS121S0100000_21 LLLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(DanmakuLandscapePresentAssem.class, "danmakuVM", "getDanmakuVM()Lcom/ss/android/ugc/aweme/core/DanmakuViewModel;", 0);
        C13LE.LIZ.getClass();
        LLLLII = new InterfaceC2217461Bqa[]{c2217381BqS};
        C1384750m8f.LJIIJJI = ((Boolean) C274960Aq6.LIZ.getValue()).booleanValue();
        if (C1384840m8o.LIZ) {
            C1384750m8f.LJIILL = true;
        }
        if (C1384860m8q.LIZ) {
            C1384750m8f.LJIIL = false;
            C1384750m8f.LJIILIIL = false;
            C1384750m8f.LJIILJJIL = false;
        }
    }

    /* JADX WARN: Type inference failed for: r0v29, types: [X.0m7j] */
    /* JADX WARN: Type inference failed for: r0v33, types: [X.0m7b] */
    public DanmakuLandscapePresentAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(DanmakuViewModel.class);
        this.LLJLLIL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), null, C1637806bA.LIZ, new AwS565S0100000_21(c19719912DlLIZ, 84), null, AFwS259S0000000_21.get$arr$(37));
        this.LLJLLL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), AFwS259S0000000_21.get$arr$(38));
        this.LLJZ = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoPlayViewModel.class), AFwS259S0000000_21.get$arr$(39));
        this.LLJZIJLIL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoEventDispatchViewModel.class), AFwS259S0000000_21.get$arr$(40));
        this.LLL = C737910Sx3.LIZJ(this, C13LE.LIZ(LandscapePanelStateViewModel.class), AFwS259S0000000_21.get$arr$(41));
        this.LLLF = C452501pT.LIZIZ(new AwS565S0100000_21(this, 81));
        this.LLLFF = C452501pT.LIZIZ(new AwS565S0100000_21(this, 80));
        this.LLLFFI = new C1384500m8G();
        this.LLLII = new AwS565S0100000_21(this, 82);
        this.LLLIIII = C1384440m8A.LIZ(null, true, 1);
        this.LLLIIIIL = new ArrayList();
        this.LLLIILIL = true;
        this.LLLIL = true;
        this.LLLILZ = -1.0d;
        this.LLLIZZ = new InterfaceC1066480drK() { // from class: X.0m7j
            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC1066480drK
            public final void LIZ(AbstractC1384320m7y abstractC1384320m7y, RectF rectF, PointF pointF, int i) {
                final IDanmakuData iDanmakuData;
                Context context;
                String str;
                PopupWindow popupWindow;
                Object obj = null;
                if ((abstractC1384320m7y instanceof IDanmakuData) && (iDanmakuData = (IDanmakuData) abstractC1384320m7y) != null) {
                    int i2 = C1384160m7i.LIZ[iDanmakuData.getType().ordinal()];
                    if (i2 != 1) {
                        if (i2 == 2) {
                            final DanmakuLandscapePresentAssem danmakuLandscapePresentAssem = this.LIZ;
                            danmakuLandscapePresentAssem.getClass();
                            if (C293660BfA.LIZ() && i == 1) {
                                danmakuLandscapePresentAssem.Ip(iDanmakuData);
                                return;
                            }
                            C0P0T c0p0t = danmakuLandscapePresentAssem.LLLILZLLLI;
                            if ((c0p0t != null && c0p0t.isShowing()) || (context = danmakuLandscapePresentAssem.getContext()) == null) {
                                return;
                            }
                            int[] iArr = new int[2];
                            danmakuLandscapePresentAssem.LJJIJL().getLocationInWindow(iArr);
                            C450860Hm8 c450860Hm8 = new C450860Hm8(context);
                            c450860Hm8.LJI(C960203pA.LIZ(R.attr.uj, context));
                            c450860Hm8.LJIIJ(new AwS387S0200000_21(danmakuLandscapePresentAssem, iDanmakuData, 37));
                            c450860Hm8.LJ(new AwS565S0100000_21(danmakuLandscapePresentAssem, 1069));
                            c450860Hm8.LIZJ(new AwS387S0200000_21(danmakuLandscapePresentAssem, iDanmakuData, 43));
                            c450860Hm8.LLILLJJLI.LIZLLL = EnumC1235690iGF.BOTTOM;
                            c450860Hm8.LIZ((int) pointF.x, ((int) rectF.bottom) + iArr[1]);
                            c450860Hm8.LLILLJJLI.LJII = 3000L;
                            C0P0T c0p0tLIZIZ = c450860Hm8.LIZIZ();
                            danmakuLandscapePresentAssem.LLLILZLLLI = c0p0tLIZIZ;
                            if ((c0p0tLIZIZ instanceof PopupWindow) && (popupWindow = (PopupWindow) c0p0tLIZIZ) != null) {
                                popupWindow.setTouchable(true);
                                popupWindow.setFocusable(true);
                            }
                            C0P0T c0p0t2 = danmakuLandscapePresentAssem.LLLILZLLLI;
                            if (c0p0t2 != null) {
                                c0p0t2.show();
                            }
                            if (C1384230m7p.LIZ) {
                                DanmakuViewModel danmakuViewModelFp = danmakuLandscapePresentAssem.Fp();
                                C1384240m7q c1384240m7q = new C1384240m7q() { // from class: X.0m7o
                                    @Override // android.animation.Animator.AnimatorListener
                                    public final void onAnimationEnd(Animator animator) {
                                        DanmakuLandscapePresentAssem.Up(danmakuLandscapePresentAssem, iDanmakuData);
                                    }

                                    @Override // android.animation.Animator.AnimatorListener
                                    public final void onAnimationStart(Animator animator) {
                                        iDanmakuData.LIZ(true);
                                    }
                                };
                                danmakuViewModelFp.getClass();
                                DanmakuViewModel.JQ2(iDanmakuData, c1384240m7q);
                            } else {
                                DanmakuLandscapePresentAssem.Up(danmakuLandscapePresentAssem, iDanmakuData);
                            }
                            C1361150lWb c1361150lWb = C1361150lWb.LIZ;
                            C724270Sb3 c724270Sb3 = danmakuLandscapePresentAssem.LLJI;
                            if (c724270Sb3 != null) {
                                obj = c724270Sb3.LL;
                            }
                            Aweme aweme = ((VideoItemParams) obj).getAweme();
                            VideoItemParams item = danmakuLandscapePresentAssem.Fp().getItem();
                            String str2 = "";
                            if (item == null || (str = item.mEventType) == null) {
                                str = "";
                            }
                            String strX1 = iDanmakuData.x1();
                            if (strX1 != null) {
                                str2 = strX1;
                            }
                            boolean zLJFF = Intrinsics.LJFF(iDanmakuData.v1(), ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
                            String value = EnumC1361130lWZ.VIDEO_PLAYBACK.getValue();
                            EnumC255700yp enumC255700ypQp = danmakuLandscapePresentAssem.Qp();
                            c1361150lWb.getClass();
                            C1361150lWb.LJI(new ClickDanmakuEvent(), Collections.singletonList(new C00I8(str2, zLJFF ? 1 : 0, value, enumC255700ypQp.getValue())), aweme, C0SXF.LJJIFFI(null, Boolean.FALSE, str));
                            return;
                        }
                        throw new C1954807lC();
                    }
                    C1361050lWR c1361050lWR = C1361050lWR.LIZ;
                    C19EG c19egLIZ = C724240Sb0.LIZ(this.LIZ);
                    DanmakuViewModel danmakuViewModelFp2 = this.LIZ.Fp();
                    InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this.LIZ);
                    EnumC1361130lWZ enumC1361130lWZ = EnumC1361130lWZ.IS_INTRO_SHOW;
                    EnumC255700yp enumC255700ypQp2 = this.LIZ.Qp();
                    DanmakuCompatibleReportAndLoginViewModel danmakuCompatibleReportAndLoginViewModel = (DanmakuCompatibleReportAndLoginViewModel) this.LIZ.LLLFF.getValue();
                    c1361050lWR.getClass();
                    C1361050lWR.LIZLLL(c19egLIZ, danmakuViewModelFp2, interfaceC665370Q7zLJIIL, enumC1361130lWZ, enumC255700ypQp2, danmakuCompatibleReportAndLoginViewModel);
                }
            }
        };
        this.LLLJ = C0RQB.AUTO_PLAY_NEXT.getValue() | C0RQB.SHOW_INTRO.getValue();
        this.LLLJIL = new InterfaceC1385050m99() { // from class: X.0m7b
            @Override // X.InterfaceC1385050m99
            public void onEvent(C1385110m9F c1385110m9F) {
                IDanmakuData iDanmakuData;
                String str;
                DanmakuLandscapePresentAssem danmakuLandscapePresentAssem = this.LIZ;
                if (!danmakuLandscapePresentAssem.LLLIL) {
                    return;
                }
                C724270Sb3 c724270Sb3 = danmakuLandscapePresentAssem.LLJI;
                Object obj = null;
                if (c724270Sb3 != null) {
                    obj = c724270Sb3.LL;
                }
                if (((VideoItemParams) obj).getAweme() != null && c1385110m9F.LIZ == 1000) {
                    Object obj2 = c1385110m9F.LIZIZ;
                    if ((obj2 instanceof IDanmakuData) && (iDanmakuData = (IDanmakuData) obj2) != null) {
                        DanmakuLandscapePresentAssem danmakuLandscapePresentAssem2 = this.LIZ;
                        int i = C1384120m7e.LIZ[iDanmakuData.getType().ordinal()];
                        if (i != 1) {
                            if (i == 2) {
                                C1361160lWc.LIZIZ().storeBoolean("has_show_education_danmaku", true);
                                C1361150lWb c1361150lWb = C1361150lWb.LIZ;
                                Aweme aweme = ((VideoItemParams) C631370Opb.LIZ(danmakuLandscapePresentAssem2)).getAweme();
                                VideoItemParams item = danmakuLandscapePresentAssem2.Fp().getItem();
                                if (item == null || (str = item.mEventType) == null) {
                                    str = "";
                                }
                                EnumC1361140lWa enumC1361140lWa = EnumC1361140lWa.ADD;
                                EnumC1361130lWZ enumC1361130lWZ = EnumC1361130lWZ.IS_INTRO_SHOW;
                                EnumC255700yp enumC255700ypQp = danmakuLandscapePresentAssem2.Qp();
                                c1361150lWb.getClass();
                                C1361150lWb.LJIIIIZZ(aweme, str, enumC1361140lWa, enumC1361130lWZ, enumC255700ypQp);
                                return;
                            }
                            throw new C1954807lC();
                        }
                        danmakuLandscapePresentAssem2.Fp().FQ2(iDanmakuData);
                    }
                }
            }
        };
        this.LLLJL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 83));
        this.LLLL = new ARunnableS121S0100000_21(this, 17);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.bj8;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 1530587428) {
            return null;
        }
        return this;
    }

    public final DanmakuViewModel Fp() {
        return (DanmakuViewModel) this.LLJLLIL.getValue(this, LLLLII[0]);
    }

    public final VideoPlayViewModel Gp() {
        return (VideoPlayViewModel) this.LLJZ.getValue();
    }

    public final EnumC255700yp Qp() {
        C724270Sb3 c724270Sb3 = this.LLJI;
        return C0SXF.LJIJ(((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme()) ? EnumC255700yp.IS_FAKE_LANDSCAPE : EnumC255700yp.IS_LANDSCAPE;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        boolean z = C1384830m8n.LIZ;
        if (C1384830m8n.LIZ) {
            C622680Oba.LIZLLL(this);
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void dp() {
        C0CAU.LIZIZ(new ARunnableS121S0100000_21(this, 18));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC712990Rxx
    public final void unBind() {
        InterfaceC1384330m7z interfaceC1384330m7z = this.LLLI;
        if (interfaceC1384330m7z != null) {
            interfaceC1384330m7z.stop();
        }
        ((Handler) this.LLLJL.getValue()).removeCallbacks(this.LLLL);
        if (C1384830m8n.LIZ) {
            return;
        }
        C622680Oba.LIZLLL(this);
    }

    public final void Jp() {
        FrameLayout.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2 = LJJIJL().getLayoutParams();
        if (!(layoutParams2 instanceof FrameLayout.LayoutParams) || (layoutParams = (FrameLayout.LayoutParams) layoutParams2) == null) {
            return;
        }
        layoutParams.height = (int) ((this.LLLIIII.LJIIJ() * 3) + (this.LLLIIII.LJIIJJI() * 2) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem, com.bytedance.assem.arch.reused.ReusedAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        boolean z = C1384830m8n.LIZ;
        if (C1384830m8n.LIZ) {
            C622680Oba.LIZJ(this);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1554610qYd.LIZJ(C1558520qew.LJIIL(this), DanmakuProtocol.class, C1697810uHb.LJIILJJIL(this));
        C1558520qew.LIZLLL(this);
    }

    public final void Bp(C1384300m7w c1384300m7w) {
        c1384300m7w.LJIILL = true;
        InterfaceC1384330m7z interfaceC1384330m7z = this.LLLI;
        if (interfaceC1384330m7z != null && !interfaceC1384330m7z.isPlaying()) {
            ((ArrayList) this.LLLIIIIL).add(c1384300m7w);
            return;
        }
        InterfaceC1384330m7z interfaceC1384330m7z2 = this.LLLI;
        if (interfaceC1384330m7z2 != null) {
            interfaceC1384330m7z2.LJJIFFI(c1384300m7w);
        }
        InterfaceC1384330m7z interfaceC1384330m7z3 = this.LLLI;
        if (interfaceC1384330m7z3 == null) {
            return;
        }
        interfaceC1384330m7z3.LJJIIZI();
    }

    public final void Ip(IDanmakuData iDanmakuData) {
        String str;
        String str2;
        if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            DanmakuCompatibleReportAndLoginViewModel danmakuCompatibleReportAndLoginViewModel = (DanmakuCompatibleReportAndLoginViewModel) this.LLLFF.getValue();
            String str3 = "";
            if (danmakuCompatibleReportAndLoginViewModel != null) {
                danmakuCompatibleReportAndLoginViewModel.LLILLL = true;
                VideoItemParams item = Fp().getItem();
                if (item != null && (str2 = item.mEventType) != null) {
                    str3 = str2;
                }
                danmakuCompatibleReportAndLoginViewModel.LLILZLL = str3;
                danmakuCompatibleReportAndLoginViewModel.LLIZ = "like_danmaku";
                danmakuCompatibleReportAndLoginViewModel.LLIZLLLIL = null;
                Vp(iDanmakuData, false);
                C19EG c19egLIZ = C724240Sb0.LIZ(this);
                if (c19egLIZ != null) {
                    c19egLIZ.finish();
                    return;
                }
                return;
            }
            C19EG c19egLIZ2 = C724240Sb0.LIZ(this);
            VideoItemParams item2 = Fp().getItem();
            if (item2 != null && (str = item2.mEventType) != null) {
                str3 = str;
            }
            C0XPD.LIZIZ(c19egLIZ2, str3, "like_danmaku", null, new C1402290max(this, iDanmakuData, 0));
            return;
        }
        Ep(this, iDanmakuData);
    }

    public final void Tp(C1384680m8Y c1384680m8Y) {
        if (c1384680m8Y.LIZIZ) {
            InterfaceC1384330m7z interfaceC1384330m7z = this.LLLI;
            if (interfaceC1384330m7z != null) {
                interfaceC1384330m7z.LJJIJ(LSPassThroughRecordSizeConfig.DEFAULT, null);
            }
            InterfaceC1384330m7z interfaceC1384330m7z2 = this.LLLI;
            if (interfaceC1384330m7z2 != null) {
                interfaceC1384330m7z2.LJIJI(LSPassThroughRecordSizeConfig.DEFAULT);
            }
            ((ArrayList) this.LLLIIIIL).clear();
        }
        C1385060m9A c1385060m9A = this.LLLFZ;
        if (c1385060m9A != null && c1385060m9A.getVisibility() != 0) {
        }
        switch (C1384360m82.LIZ[c1384680m8Y.LIZ.ordinal()]) {
            case 1:
                Fp().BQ2(c1384680m8Y.LIZJ, true);
                InterfaceC1384330m7z interfaceC1384330m7z3 = this.LLLI;
                if (interfaceC1384330m7z3 != null && interfaceC1384330m7z3.isPlaying()) {
                    InterfaceC1384330m7z interfaceC1384330m7z4 = this.LLLI;
                    if (interfaceC1384330m7z4 != null) {
                        interfaceC1384330m7z4.LJIIJ(c1384680m8Y.LIZJ);
                    }
                } else {
                    InterfaceC1384330m7z interfaceC1384330m7z5 = this.LLLI;
                    if (interfaceC1384330m7z5 != null) {
                        interfaceC1384330m7z5.LJIIJJI(c1384680m8Y.LIZJ);
                    }
                }
                if (!((ArrayList) this.LLLIIIIL).isEmpty()) {
                    for (IDanmakuData iDanmakuData : (ArrayList) this.LLLIIIIL) {
                        InterfaceC1384330m7z interfaceC1384330m7z6 = this.LLLI;
                        if (interfaceC1384330m7z6 != null) {
                            interfaceC1384330m7z6.LJJIFFI(iDanmakuData.getData());
                        }
                    }
                    ((ArrayList) this.LLLIIIIL).clear();
                    InterfaceC1384330m7z interfaceC1384330m7z7 = this.LLLI;
                    if (interfaceC1384330m7z7 != null) {
                        interfaceC1384330m7z7.LJJIIZI();
                    }
                }
                IDanmakuData iDanmakuData2 = this.LLLIIIL;
                if (iDanmakuData2 != null) {
                    InterfaceC1384330m7z interfaceC1384330m7z8 = this.LLLI;
                    if (interfaceC1384330m7z8 != null) {
                        interfaceC1384330m7z8.LJIIIZ(iDanmakuData2.getData());
                    }
                    InterfaceC1384330m7z interfaceC1384330m7z9 = this.LLLI;
                    if (interfaceC1384330m7z9 != null) {
                        interfaceC1384330m7z9.LJJIIZI();
                    }
                }
                break;
            case 2:
                if (!this.LLLIIL || !C293760BfK.LIZ()) {
                    Fp().BQ2(c1384680m8Y.LIZJ, false);
                    InterfaceC1384330m7z interfaceC1384330m7z10 = this.LLLI;
                    if (interfaceC1384330m7z10 != null) {
                        interfaceC1384330m7z10.LJIIJJI(c1384680m8Y.LIZJ);
                    }
                    Fp().LQ2(c1384680m8Y.LIZJ);
                    IDanmakuData iDanmakuData3 = this.LLLIIIL;
                    if (iDanmakuData3 != null) {
                        InterfaceC1384330m7z interfaceC1384330m7z11 = this.LLLI;
                        if (interfaceC1384330m7z11 != null) {
                            interfaceC1384330m7z11.LJIIIZ(iDanmakuData3.getData());
                        }
                        InterfaceC1384330m7z interfaceC1384330m7z12 = this.LLLI;
                        if (interfaceC1384330m7z12 != null) {
                            interfaceC1384330m7z12.LJJIIZI();
                        }
                    }
                }
                break;
            case 3:
                InterfaceC1384330m7z interfaceC1384330m7z13 = this.LLLI;
                if (interfaceC1384330m7z13 != null) {
                    interfaceC1384330m7z13.pause();
                }
                break;
            case 4:
                Fp().BQ2(c1384680m8Y.LIZJ, true);
                InterfaceC1384330m7z interfaceC1384330m7z14 = this.LLLI;
                if (interfaceC1384330m7z14 != null) {
                    interfaceC1384330m7z14.LJIIJ(0L);
                }
                InterfaceC1384330m7z interfaceC1384330m7z15 = this.LLLI;
                if (interfaceC1384330m7z15 != null) {
                    interfaceC1384330m7z15.LJJIIZI();
                }
                break;
            case 5:
                InterfaceC1384330m7z interfaceC1384330m7z16 = this.LLLI;
                if (interfaceC1384330m7z16 != null) {
                    interfaceC1384330m7z16.pause();
                }
                this.LLLFFI.LJ.LIZ(1.0f);
                break;
            case 6:
                Fp().BQ2(c1384680m8Y.LIZJ, true);
                InterfaceC1384330m7z interfaceC1384330m7z17 = this.LLLI;
                if (interfaceC1384330m7z17 != null) {
                    interfaceC1384330m7z17.LJIIJ(c1384680m8Y.LIZJ);
                }
                InterfaceC1384330m7z interfaceC1384330m7z18 = this.LLLI;
                if (interfaceC1384330m7z18 != null) {
                    interfaceC1384330m7z18.LJJIIZI();
                }
                break;
            case 7:
                C1384410m87 c1384410m87 = this.LLLFFI.LJ;
                float f = c1384410m87.LIZJ;
                float f2 = c1384680m8Y.LIZLLL;
                if (f != f2 && f2 > 0.0f && f > 0.0f) {
                    c1384410m87.LIZ(f2);
                    break;
                }
                break;
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onDanmakuItemDelete(C1164270gP3 c1164270gP3) {
        IDanmakuData iDanmakuDataZQ2;
        String strX1 = c1164270gP3.LIZ.x1();
        if (strX1 != null && (iDanmakuDataZQ2 = Fp().zQ2(strX1)) != null) {
            InterfaceC1384330m7z interfaceC1384330m7z = this.LLLI;
            if (interfaceC1384330m7z != null) {
                interfaceC1384330m7z.LJJIJIIJIL(1004, iDanmakuDataZQ2.getData(), null);
            }
            C1383870m7F c1383870m7F = Fp().LLILLJJLI;
            if (c1383870m7F != null) {
                c1383870m7F.LIZLLL(iDanmakuDataZQ2);
            }
            iDanmakuDataZQ2.LIZ(false);
            C1385060m9A c1385060m9A = this.LLLFZ;
            if (c1385060m9A != null) {
                c1385060m9A.invalidate();
            }
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onDanmakuItemDigg(C1164280gP4 c1164280gP4) {
        String strX1 = c1164280gP4.LIZ.x1();
        if (strX1 == null) {
            return;
        }
        Fp().zQ2(strX1);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLLFZ = (C1385060m9A) view.findViewById(R.id.ffe);
        C0CAU.LIZIZ(new ARunnableS121S0100000_21(this, 19));
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLL.getValue(), new C2217381BqS() { // from class: X.0SHE
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C692820RFo) obj).LL;
            }
        }, null, AFwS294S0000000_11.get$arr$(20), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJLLL.getValue(), new C2217381BqS() { // from class: X.0Seg
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLJJJJJIL;
            }
        }, null, AFwS305S0000000_21.get$arr$(50), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJLLL.getValue(), new C2217381BqS() { // from class: X.0SEa
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLJJJJLIIL;
            }
        }, null, AFwS305S0000000_21.get$arr$(54), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJLLL.getValue(), new C2217381BqS() { // from class: X.0Nyt
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILLL;
            }
        }, null, AFwS305S0000000_21.get$arr$(57), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJLLL.getValue(), new C2217381BqS() { // from class: X.0Nkm
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILZ;
            }
        }, null, AFwS305S0000000_21.get$arr$(30), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJLLL.getValue(), new C2217381BqS() { // from class: X.0S6t
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILZLL;
            }
        }, null, AFwS305S0000000_21.get$arr$(34), 6);
        C736680Sv4.LJIIIIZZ(this, Fp(), new C2217381BqS() { // from class: X.0m8R
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1361170lWd) obj).LL;
            }
        }, null, AFwS305S0000000_21.get$arr$(37), 6);
        C736680Sv4.LJIIIIZZ(this, Fp(), new C2217381BqS() { // from class: X.0m8S
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1361170lWd) obj).LLILLJJLI;
            }
        }, null, AFwS305S0000000_21.get$arr$(40), 6);
        C736680Sv4.LJIIIIZZ(this, Fp(), new C2217381BqS() { // from class: X.0m8T
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1361170lWd) obj).LLIZLLLIL;
            }
        }, null, AFwS305S0000000_21.get$arr$(42), 6);
        C736680Sv4.LJIIIIZZ(this, Fp(), new C2217381BqS() { // from class: X.0m8U
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1361170lWd) obj).LLILZIL;
            }
        }, null, AFwS305S0000000_21.get$arr$(46), 6);
        C736680Sv4.LJIIIIZZ(this, Fp(), new C2217381BqS() { // from class: X.0m8W
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1361170lWd) obj).LLILZLL;
            }
        }, null, AFwS305S0000000_21.get$arr$(49), 6);
        C736680Sv4.LJIIIIZZ(this, Fp(), new C2217381BqS() { // from class: X.0m8X
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1361170lWd) obj).LLIZ;
            }
        }, null, AFwS305S0000000_21.get$arr$(53), 6);
        C736680Sv4.LJIIIIZZ(this, Gp(), new C2217381BqS() { // from class: X.0R8U
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0RFV) obj).LLJ;
            }
        }, null, AFwS305S0000000_21.get$arr$(56), 6);
        C736680Sv4.LJIILL(this, (AssemViewModel) this.LLJZIJLIL.getValue(), new C2217381BqS() { // from class: X.0SFr
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1ELP) obj).LLJJ;
            }
        }, null, AFwS305S0000000_21.get$arr$(59), 6);
        C736680Sv4.LJIIIIZZ(this, Gp(), new C2217381BqS() { // from class: X.0R8V
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0RFV) obj).LLJILLL;
            }
        }, null, AFwS305S0000000_21.get$arr$(24), 6);
        C736680Sv4.LJIIIIZZ(this, Gp(), new C2217381BqS() { // from class: X.0RCA
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0RFV) obj).LLJILJILJ;
            }
        }, null, AFwS305S0000000_21.get$arr$(29), 6);
        C736680Sv4.LJIIIIZZ(this, Gp(), new C2217381BqS() { // from class: X.0R7w
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0RFV) obj).LLJLIL;
            }
        }, null, AFwS305S0000000_21.get$arr$(31), 6);
        C736680Sv4.LJIIIIZZ(this, Gp(), new C2217381BqS() { // from class: X.0m8a
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0RFV) obj).LLJJJJLIIL;
            }
        }, null, AFwS305S0000000_21.get$arr$(35), 6);
        C736680Sv4.LJIIIIZZ(this, Gp(), new C2217381BqS() { // from class: X.0S98
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0RFV) obj).LLJJL;
            }
        }, null, AFwS305S0000000_21.get$arr$(38), 6);
        C736680Sv4.LJIIIIZZ(this, Gp(), new C2217381BqS() { // from class: X.0S96
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0RFV) obj).LLJJLIIIJLLLLLLLZ;
            }
        }, null, AFwS305S0000000_21.get$arr$(43), 6);
        C736680Sv4.LJIIIIZZ(this, Gp(), new C2217381BqS() { // from class: X.0SHc
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0RFV) obj).LLJJJJ;
            }
        }, null, AFwS305S0000000_21.get$arr$(44), 6);
        C736680Sv4.LJIIIIZZ(this, Fp(), new C2217381BqS() { // from class: X.0m8V
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1361170lWd) obj).LLILLL;
            }
        }, null, AFwS305S0000000_21.get$arr$(47), 6);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        InterfaceC1384330m7z currentDanmakuController;
        VideoItemParams videoItemParams2 = videoItemParams;
        this.LLLILZ = -1.0d;
        C1385060m9A c1385060m9A = this.LLLFZ;
        if (c1385060m9A != null && (currentDanmakuController = c1385060m9A.getCurrentDanmakuController()) != null) {
            this.LLLI = currentDanmakuController;
            this.LLLFFI.LIZ(currentDanmakuController, true);
            this.LLLFFI.LIZJ.LIZJ(C444960Hcc.LIZIZ());
        }
        C1383760m74 c1383760m74 = C1383760m74.LIZIZ;
        this.LLLIILIL = c1383760m74.LJJIFFI(videoItemParams2.getAweme());
        this.LLLIL = c1383760m74.LJJIIJZLJL(videoItemParams2.getAweme());
        if (!C1384830m8n.LIZ) {
            C622680Oba.LIZJ(this);
        }
        this.LLLIIII = C1384440m8A.LIZ(C724240Sb0.LIZ(this), false, 2);
    }

    @Override // com.ss.android.ugc.aweme.feed.landscape.LandscapeFeedDanmakuPresentAbility
    public final void setFocusable(boolean z) {
        float f;
        C1384410m87 c1384410m87 = this.LLLFFI.LJ;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.4f;
        }
        c1384410m87.LIZLLL = f;
        c1384410m87.LJ.LIZIZ(new AwS9S0000001_21(f, 3));
        InterfaceC1384330m7z interfaceC1384330m7z = this.LLLI;
        if (interfaceC1384330m7z != null) {
            interfaceC1384330m7z.LJJIJIIJIL(LSPassThroughRecordSizeConfig.DEFAULT, null, Boolean.valueOf(z));
        }
    }

    @Override // com.ss.android.ugc.aweme.service.DanmakuProtocol
    public final void xn1(boolean z) {
        int i;
        this.LLLIL = z;
        C1385060m9A c1385060m9A = this.LLLFZ;
        if (c1385060m9A != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            int visibility = c1385060m9A.getVisibility();
            c1385060m9A.setVisibility(i);
            C1602160rnK.LIZIZ(visibility, i, c1385060m9A);
        }
        if (!z) {
            InterfaceC1384330m7z interfaceC1384330m7z = this.LLLI;
            if (interfaceC1384330m7z != null) {
                interfaceC1384330m7z.stop();
            }
            Fp().reset();
            ((ArrayList) this.LLLIIIIL).clear();
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [X.09AY, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r1v6, types: [X.09AY, kotlin.jvm.functions.Function1] */
    public static void Ep(DanmakuLandscapePresentAssem danmakuLandscapePresentAssem, IDanmakuData iDanmakuData) {
        String str;
        String str2;
        danmakuLandscapePresentAssem.getClass();
        iDanmakuData.A1(!iDanmakuData.u1());
        Object obj = null;
        String str3 = "";
        if (iDanmakuData.u1()) {
            iDanmakuData.s1(iDanmakuData.r1() + 1);
            WeakReference weakReference = new WeakReference(danmakuLandscapePresentAssem);
            DanmakuViewModel danmakuViewModelFp = danmakuLandscapePresentAssem.Fp();
            AwS565S0100000_21 awS565S0100000_21 = new AwS565S0100000_21(weakReference, (WeakReference<DanmakuPresentAssem>) 733);
            danmakuViewModelFp.getClass();
            if (iDanmakuData instanceof C1384300m7w) {
                C1384300m7w c1384300m7w = (C1384300m7w) iDanmakuData;
                c1384300m7w.LJJIIJ = awS565S0100000_21;
                ?? r1 = c1384300m7w.LJJIIJZLJL;
                if (r1 != 0) {
                    r1.invoke(Boolean.TRUE);
                }
            }
            C1361150lWb c1361150lWb = C1361150lWb.LIZ;
            C724270Sb3 c724270Sb3 = danmakuLandscapePresentAssem.LLJI;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            }
            Aweme aweme = ((VideoItemParams) obj).getAweme();
            VideoItemParams item = danmakuLandscapePresentAssem.Fp().getItem();
            if (item == null || (str2 = item.mEventType) == null) {
                str2 = "";
            }
            String strX1 = iDanmakuData.x1();
            if (strX1 != null) {
                str3 = strX1;
            }
            boolean zLJFF = Intrinsics.LJFF(iDanmakuData.v1(), ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
            String value = EnumC1361130lWZ.VIDEO_PLAYBACK.getValue();
            EnumC255700yp enumC255700ypQp = danmakuLandscapePresentAssem.Qp();
            c1361150lWb.getClass();
            C1361150lWb.LIZ(aweme, str2, str3, zLJFF, true, value, enumC255700ypQp);
            if (danmakuLandscapePresentAssem.Fp().LLILLJJLI != null) {
                C1383870m7F.LIZ(iDanmakuData);
                return;
            }
            return;
        }
        WeakReference weakReference2 = new WeakReference(danmakuLandscapePresentAssem);
        if (iDanmakuData.r1() > 0) {
            iDanmakuData.s1(iDanmakuData.r1() - 1);
        }
        DanmakuViewModel danmakuViewModelFp2 = danmakuLandscapePresentAssem.Fp();
        AwS565S0100000_21 awS565S0100000_212 = new AwS565S0100000_21(weakReference2, (WeakReference<DanmakuPresentAssem>) 741);
        danmakuViewModelFp2.getClass();
        if (iDanmakuData instanceof C1384300m7w) {
            C1384300m7w c1384300m7w2 = (C1384300m7w) iDanmakuData;
            c1384300m7w2.LJJIIJ = awS565S0100000_212;
            ?? r12 = c1384300m7w2.LJJIIJZLJL;
            if (r12 != 0) {
                r12.invoke(Boolean.FALSE);
            }
        }
        C1361150lWb c1361150lWb2 = C1361150lWb.LIZ;
        C724270Sb3 c724270Sb32 = danmakuLandscapePresentAssem.LLJI;
        if (c724270Sb32 != null) {
            obj = c724270Sb32.LL;
        }
        Aweme aweme2 = ((VideoItemParams) obj).getAweme();
        VideoItemParams item2 = danmakuLandscapePresentAssem.Fp().getItem();
        if (item2 == null || (str = item2.mEventType) == null) {
            str = "";
        }
        String strX12 = iDanmakuData.x1();
        if (strX12 != null) {
            str3 = strX12;
        }
        boolean zLJFF2 = Intrinsics.LJFF(iDanmakuData.v1(), ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        String value2 = EnumC1361130lWZ.VIDEO_PLAYBACK.getValue();
        EnumC255700yp enumC255700ypQp2 = danmakuLandscapePresentAssem.Qp();
        c1361150lWb2.getClass();
        C1361150lWb.LIZ(aweme2, str, str3, zLJFF2, false, value2, enumC255700ypQp2);
        if (danmakuLandscapePresentAssem.Fp().LLILLJJLI == null) {
            return;
        }
        C1383870m7F.LIZ(iDanmakuData);
    }

    public static void Up(DanmakuLandscapePresentAssem danmakuLandscapePresentAssem, IDanmakuData iDanmakuData) {
        danmakuLandscapePresentAssem.getClass();
        iDanmakuData.LIZ(true);
        InterfaceC1384330m7z interfaceC1384330m7z = danmakuLandscapePresentAssem.LLLI;
        if (interfaceC1384330m7z != null) {
            interfaceC1384330m7z.LJJIJIIJIL(1001, iDanmakuData.getData(), null);
        }
        C1385060m9A c1385060m9A = danmakuLandscapePresentAssem.LLLFZ;
        if (c1385060m9A != null) {
            c1385060m9A.invalidate();
        }
    }

    public final void Vp(IDanmakuData iDanmakuData, boolean z) {
        iDanmakuData.LIZ(z);
        InterfaceC1384330m7z interfaceC1384330m7z = this.LLLI;
        if (interfaceC1384330m7z != null) {
            interfaceC1384330m7z.LJJIJIIJIL(1002, iDanmakuData.getData(), null);
        }
        C1385060m9A c1385060m9A = this.LLLFZ;
        if (c1385060m9A != null) {
            c1385060m9A.invalidate();
        }
    }
}
