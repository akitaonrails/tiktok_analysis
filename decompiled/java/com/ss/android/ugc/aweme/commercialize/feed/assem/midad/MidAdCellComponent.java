package com.ss.android.ugc.aweme.commercialize.feed.assem.midad;

import X.C01GW;
import X.C0N6Z;
import X.C0SXP;
import X.C0T2H;
import X.C1022620cia;
import X.C1022820ciu;
import X.C12ES;
import X.C1308910kAL;
import X.C1388190mED;
import X.C13LE;
import X.C1558520qew;
import X.C1618220sDE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C19EG;
import X.C2184171Adz;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2245741Cv6;
import X.C2245821CvE;
import X.C2245901CvM;
import X.C2245931CvP;
import X.C2344009Gk;
import X.C339190DRl;
import X.C421750GgH;
import X.C452501pT;
import X.C520680KbS;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C737910Sx3;
import X.C786410Ut5;
import X.EnumC584570MwJ;
import X.InterfaceC1483670oiD;
import X.InterfaceC1554640qYg;
import X.InterfaceC1601020rlU;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC588420N6a;
import X.InterfaceC736180SuG;
import X.InterfaceC990700bt6;
import X.ViewTreeObserverOnGlobalLayoutListenerC738830SyX;
import Y.ACListenerS168S0100000_34;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ad.feed.IFeedAdService;
import com.ss.android.ugc.aweme.ad.feed.midad.IMidAdCellAbility;
import com.ss.android.ugc.aweme.commercialize.feed.assem.FeedAdViewModel;
import com.ss.android.ugc.aweme.commercialize.feed.assem.midad.MidAdCellComponent;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.longvideo.edgespeedup.EdgeSpeedupAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.ui.seekbar.VideoSeekBarMaskView;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.ss.android.ugc.feed.platform.cell.component.progress.IVideoPlayProgressAbility;
import com.ss.android.ugc.feed.platform.panel.autoscroll.IAutoAScrollAbility;
import com.ss.android.ugc.feed.platform.panel.midad.IMidAdAbility;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AFwS225S0000000_34;
import kotlin.jvm.internal.AFwS281S0000000_34;
import kotlin.jvm.internal.AFwS308S0000000_23;
import kotlin.jvm.internal.AFwS323S0000000_34;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes35.dex */
public final class MidAdCellComponent extends BaseCellSlotComponent<MidAdCellComponent> implements IMidAdCellAbility, InterfaceC1554640qYg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLLILI;
    public final String LLJLLIL;
    public final InterfaceC1731706qJ LLJLLL;
    public final C01GW LLJZ;
    public final C01GW LLJZIJLIL;
    public final C01GW LLL;
    public final C01GW LLLF;
    public final C01GW LLLFF;
    public final C01GW LLLFFI;
    public final C01GW LLLFZ;
    public final C01GW LLLI;
    public final C01GW LLLII;
    public final C2245931CvP LLLIIII;
    public final C01GW LLLIIIIL;
    public final C01GW LLLIIIL;
    public final C01GW LLLIIL;
    public VideoSeekBarMaskView LLLIILIL;
    public boolean LLLIL;
    public final C2245821CvE LLLILZ;
    public boolean LLLILZJ;
    public boolean LLLILZLLLI;
    public boolean LLLIZZ;
    public InterfaceC1483670oiD LLLJ;
    public boolean LLLJIL;
    public final C01GW LLLJL;
    public final C01GW LLLL;
    public final C01GW LLLLII;
    public final C01GW LLLLIIIILLL;
    public final C01GW LLLLIIL;
    public final C01GW LLLLIILL;
    public final C01GW LLLLIILLL;
    public final C2245901CvM LLLLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MidAdCellComponent.class, "midAdViewModel", "getMidAdViewModel()Lcom/ss/android/ugc/aweme/commercialize/feed/assem/midad/MidAdVM;", 0);
        C13LE.LIZ.getClass();
        LLLLILI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    /* JADX WARN: Type inference failed for: r0v31, types: [X.1CvP] */
    /* JADX WARN: Type inference failed for: r0v59, types: [X.1CvM] */
    public MidAdCellComponent() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MidAdCellComponent@");
        sbLIZ.append(hashCode());
        this.LLJLLIL = C2188811AlT.LIZIZ(sbLIZ);
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MidAdVM.class);
        this.LLJLLL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), null, C1637806bA.LIZ, new AwS555S0100000_11(c19719912DlLIZ, 107), null, AFwS281S0000000_34.get$arr$(9));
        this.LLJZ = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), AFwS281S0000000_34.get$arr$(10));
        this.LLJZIJLIL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoPlayViewModel.class), AFwS281S0000000_34.get$arr$(11));
        this.LLL = C737910Sx3.LIZJ(this, C13LE.LIZ(FeedAdViewModel.class), AFwS281S0000000_34.get$arr$(8));
        this.LLLF = C452501pT.LIZIZ(new AwS568S0100000_24(this, 237));
        this.LLLFF = C452501pT.LIZIZ(new AwS555S0100000_11(this, 105));
        this.LLLFFI = C452501pT.LIZIZ(new AwS568S0100000_24(this, 236));
        this.LLLFZ = C452501pT.LIZIZ(new AwS555S0100000_11(this, 100));
        this.LLLI = C452501pT.LIZIZ(new AwS555S0100000_11(this, 106));
        this.LLLII = C452501pT.LIZIZ(new AwS568S0100000_24(this, 238));
        this.LLLIIII = new InterfaceC736180SuG() { // from class: X.1CvP
            @Override // X.InterfaceC736180SuG
            public final void LIZ(boolean z) {
                if (this.LIZ.Jp()) {
                    this.LIZ.LLLILZ.LJIIIIZZ = z;
                }
            }
        };
        this.LLLIIIIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 102));
        this.LLLIIIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 104));
        this.LLLIIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 103));
        this.LLLILZ = new C2245821CvE();
        this.LLLJL = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(46));
        this.LLLL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(57));
        this.LLLLII = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(43));
        this.LLLLIIIILLL = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(42));
        this.LLLLIIL = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(45));
        this.LLLLIILL = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(44));
        this.LLLLIILLL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 101));
        this.LLLLIL = new InterfaceC588420N6a() { // from class: X.1CvM
            @Override // X.InterfaceC588420N6a
            public final void LIZ(Aweme aweme) {
                if (this.LIZ.Ep(aweme)) {
                    C1618220sDE c1618220sDE = C1618220sDE.LIZ;
                    String aid = aweme.getAid();
                    c1618220sDE.getClass();
                    if (aid != null) {
                        C1618220sDE.LIZJ(new C2344009Gk(), aid, "midroll_ads_long_video_show");
                    }
                }
            }

            @Override // X.InterfaceC588420N6a
            public final void LIZIZ(String str) {
                String aid;
                String aid2;
                String aid3 = null;
                if (this.LIZ.Up()) {
                    Aweme aweme = this.LIZ.Tp().LL;
                    if (aweme != null) {
                        aid2 = aweme.getAid();
                    } else {
                        aid2 = null;
                    }
                    if (Intrinsics.LJFF(str, aid2)) {
                        String str2 = this.LIZ.LLJLLIL;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("[onPostRollSlideAway] aid=");
                        sbLIZ2.append(str);
                        sbLIZ2.append(", component.id=");
                        Aweme aweme2 = this.LIZ.Tp().LL;
                        if (aweme2 != null) {
                            aid3 = aweme2.getAid();
                        }
                        sbLIZ2.append(aid3);
                        C1022620cia.LIZ(str2, C2188811AlT.LIZIZ(sbLIZ2));
                        MidAdCellComponent midAdCellComponent = this.LIZ;
                        midAdCellComponent.Xp(midAdCellComponent.Tp().LL, false);
                        Aweme aweme3 = this.LIZ.Tp().LL;
                        if (aweme3 != null) {
                            MidAdCellComponent midAdCellComponent2 = this.LIZ;
                            midAdCellComponent2.Wp(aweme3, Long.valueOf(((Number) midAdCellComponent2.LLLLIIL.getValue()).longValue()));
                        }
                        C0N6Z.LJIIIZ = false;
                        return;
                    }
                }
                if (this.LIZ.Up()) {
                    return;
                }
                Aweme aweme4 = this.LIZ.Tp().LL;
                if (aweme4 != null) {
                    aid = aweme4.getAid();
                } else {
                    aid = null;
                }
                if (!Intrinsics.LJFF(str, aid)) {
                    return;
                }
                C1483410ohn.LJLJJI().LJJI();
                MidAdCellComponent midAdCellComponent3 = this.LIZ;
                InterfaceC1483670oiD interfaceC1483670oiD = midAdCellComponent3.LLLJ;
                if (interfaceC1483670oiD != null) {
                    interfaceC1483670oiD.setSurface(null);
                }
                InterfaceC1483670oiD interfaceC1483670oiD2 = midAdCellComponent3.LLLJ;
                if (interfaceC1483670oiD2 != null) {
                    interfaceC1483670oiD2.release();
                }
                midAdCellComponent3.LLLJ = null;
            }

            @Override // X.InterfaceC588420N6a
            public final void LIZJ(String str) {
                String aid;
                if (this.LIZ.Up()) {
                    Aweme aweme = this.LIZ.Tp().LL;
                    String aid2 = null;
                    if (aweme != null) {
                        aid = aweme.getAid();
                    } else {
                        aid = null;
                    }
                    if (Intrinsics.LJFF(str, aid)) {
                        String str2 = this.LIZ.LLJLLIL;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("[onLongVideoToPostRoll] longAid=");
                        sbLIZ2.append(str);
                        sbLIZ2.append(", component.id=");
                        Aweme aweme2 = this.LIZ.Tp().LL;
                        if (aweme2 != null) {
                            aid2 = aweme2.getAid();
                        }
                        sbLIZ2.append(aid2);
                        C1022620cia.LIZ(str2, C2188811AlT.LIZIZ(sbLIZ2));
                        MidAdCellComponent midAdCellComponent = this.LIZ;
                        midAdCellComponent.Xp(midAdCellComponent.Tp().LL, false);
                    }
                }
            }

            @Override // X.InterfaceC588420N6a
            public final void LIZLLL(String str) {
                String aid;
                if (this.LIZ.Up()) {
                    Aweme aweme = this.LIZ.Tp().LL;
                    String aid2 = null;
                    if (aweme != null) {
                        aid = aweme.getAid();
                    } else {
                        aid = null;
                    }
                    if (Intrinsics.LJFF(str, aid)) {
                        String str2 = this.LIZ.LLJLLIL;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("[onPostRollToLongVideo] longAid=");
                        sbLIZ2.append(str);
                        sbLIZ2.append(", component.id=");
                        Aweme aweme2 = this.LIZ.Tp().LL;
                        if (aweme2 != null) {
                            aid2 = aweme2.getAid();
                        }
                        sbLIZ2.append(aid2);
                        C1022620cia.LIZ(str2, C2188811AlT.LIZIZ(sbLIZ2));
                        MidAdCellComponent midAdCellComponent = this.LIZ;
                        midAdCellComponent.Xp(midAdCellComponent.Tp().LL, false);
                    }
                }
            }

            @Override // X.InterfaceC588420N6a
            public final void LJ(String str) {
                String aid;
                if (this.LIZ.Up()) {
                    Aweme aweme = this.LIZ.Tp().LL;
                    String aid2 = null;
                    if (aweme != null) {
                        aid = aweme.getAid();
                    } else {
                        aid = null;
                    }
                    if (Intrinsics.LJFF(str, aid)) {
                        String str2 = this.LIZ.LLJLLIL;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("[onLongVideoSlideAway] aid=");
                        sbLIZ2.append(str);
                        sbLIZ2.append(", component.id=");
                        Aweme aweme2 = this.LIZ.Tp().LL;
                        if (aweme2 != null) {
                            aid2 = aweme2.getAid();
                        }
                        sbLIZ2.append(aid2);
                        C1022620cia.LIZ(str2, C2188811AlT.LIZIZ(sbLIZ2));
                        MidAdCellComponent midAdCellComponent = this.LIZ;
                        midAdCellComponent.Xp(midAdCellComponent.Tp().LL, false);
                    }
                }
            }
        };
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.b4x;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 1138953562) {
            return null;
        }
        return this;
    }

    public final void Bp() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(C12ES.LIZJ(14.0f, Fp().getContext()));
        ViewGroup viewGroupFp = Fp();
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.e5, Fp().getContext());
        int iIntValue = numLIZJ != null ? numLIZJ.intValue() : 0;
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.e3, Fp().getContext());
        C421750GgH.LIZJ(viewGroupFp, gradientDrawable, iIntValue, numLIZJ2 != null ? numLIZJ2.intValue() : 0, 300L, null);
    }

    public final ViewGroup Fp() {
        return (ViewGroup) this.LLLIIIIL.getValue();
    }

    public final TuxTextView Gp() {
        return (TuxTextView) this.LLLIIL.getValue();
    }

    public final TuxTextView Ip() {
        return (TuxTextView) this.LLLIIIL.getValue();
    }

    public final boolean Jp() {
        return ((Boolean) this.LLLL.getValue()).booleanValue();
    }

    public final IMidAdAbility Qp() {
        return (IMidAdAbility) this.LLLF.getValue();
    }

    public final MidAdVM Tp() {
        return (MidAdVM) this.LLJLLL.getValue(this, LLLLILI[0]);
    }

    public final boolean Up() {
        return ((Boolean) this.LLLLIIIILLL.getValue()).booleanValue();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        EdgeSpeedupAbility edgeSpeedupAbility;
        C1022620cia.LIZ(this.LLJLLIL, "[onHostDestroy]");
        HashMap<String, Aweme> map = C0N6Z.LIZ;
        C0N6Z.LJIILLIIL.remove(this.LLLLIL);
        if (C2245741Cv6.LIZIZ(Tp().LL)) {
            Tp().IQ2((IVideoPlayProgressAbility) this.LLLII.getValue());
        }
        if (!Jp() || (edgeSpeedupAbility = (EdgeSpeedupAbility) this.LLLFF.getValue()) == null) {
            return;
        }
        edgeSpeedupAbility.VK1(this.LLLIIII);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC712990Rxx
    public final void unBind() {
        EdgeSpeedupAbility edgeSpeedupAbility;
        C1022620cia.LIZ(this.LLJLLIL, "[unBind]");
        Tp().resetState();
        this.LLLIL = false;
        this.LLLILZLLLI = false;
        this.LLLIZZ = false;
        C2245821CvE c2245821CvE = this.LLLILZ;
        c2245821CvE.LIZ = false;
        c2245821CvE.LIZIZ = false;
        c2245821CvE.LIZJ = false;
        c2245821CvE.LIZLLL = false;
        c2245821CvE.LJ = false;
        c2245821CvE.LJFF = false;
        c2245821CvE.LJI = false;
        c2245821CvE.LJII = false;
        c2245821CvE.LJIIIIZZ = false;
        C0N6Z.LJIIIIZZ = null;
        C2245901CvM c2245901CvM = this.LLLLIL;
        CopyOnWriteArrayList<InterfaceC588420N6a> copyOnWriteArrayList = C0N6Z.LJIILLIIL;
        copyOnWriteArrayList.remove(c2245901CvM);
        if (C2245741Cv6.LIZIZ(Tp().LL)) {
            Tp().IQ2((IVideoPlayProgressAbility) this.LLLII.getValue());
        }
        String str = this.LLJLLIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[removeListener] listener.size=");
        sbLIZ.append(copyOnWriteArrayList.size());
        C1022620cia.LIZ(str, C2188811AlT.LIZIZ(sbLIZ));
        if (!Jp() || (edgeSpeedupAbility = (EdgeSpeedupAbility) this.LLLFF.getValue()) == null) {
            return;
        }
        edgeSpeedupAbility.VK1(this.LLLIIII);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.midad.IMidAdCellAbility
    public final void QX1() {
        String aid;
        AwemeRawAd awemeRawAd;
        if (C2245741Cv6.LIZJ(Tp().LL)) {
            HashMap<String, Aweme> map = C0N6Z.LIZ;
            Aweme aweme = Tp().LL;
            Aweme awemeLIZ = C0N6Z.LIZ((aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null) ? null : awemeRawAd.getCreativeIdStr());
            String str = this.LLJLLIL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[onDislikeClicked] longVideoAweme=");
            sbLIZ.append(awemeLIZ != null ? awemeLIZ.getAid() : null);
            C1022620cia.LIZ(str, C2188811AlT.LIZIZ(sbLIZ));
            if (awemeLIZ != null && (aid = awemeLIZ.getAid()) != null) {
                C0N6Z.LJII.put(aid, Boolean.TRUE);
            }
            if (Up()) {
                MidAdVM midAdVMTp = Tp();
                midAdVMTp.getClass();
                midAdVMTp.setState(AFwS281S0000000_34.get$arr$(62));
            } else {
                IMidAdAbility iMidAdAbilityQp = Qp();
                if (iMidAdAbilityQp != null) {
                    iMidAdAbilityQp.LJJIII();
                }
            }
        }
    }

    public final void Vp() {
        ViewGroup rootView;
        View viewLIZ;
        IMidAdAbility iMidAdAbilityQp = Qp();
        if (iMidAdAbilityQp == null || (rootView = iMidAdAbilityQp.getRootView()) == null || (viewLIZ = C520680KbS.LIZ(R.id.a_e, rootView)) == null) {
            return;
        }
        C786410Ut5.LJJJLZIJ(viewLIZ, rootView);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean Ep(com.ss.android.ugc.aweme.feed.model.Aweme r6) {
        /*
            r5 = this;
            X.01GW r0 = r5.LLLJL
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r4 = 1
            r3 = 0
            r2 = 0
            if (r0 == 0) goto L76
            boolean r0 = X.C2245741Cv6.LIZJ(r6)
            if (r0 == 0) goto L18
            return r4
        L18:
            java.util.HashMap<java.lang.String, com.ss.android.ugc.aweme.feed.model.Aweme> r0 = X.C0N6Z.LIZ
            if (r6 == 0) goto L53
            java.lang.String r1 = r6.getAid()
            if (r1 == 0) goto L33
            java.util.HashMap<java.lang.String, java.lang.Boolean> r0 = X.C0N6Z.LJI
            java.lang.Object r0 = r0.get(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L33
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L33
            return r3
        L33:
            if (r6 == 0) goto L53
            java.lang.String r1 = r6.getAid()
            if (r1 == 0) goto L4c
            java.util.HashMap<java.lang.String, java.lang.Boolean> r0 = X.C0N6Z.LJII
            java.lang.Object r0 = r0.get(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L4c
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L4c
            return r3
        L4c:
            if (r6 == 0) goto L53
            java.lang.String r0 = r6.getAid()
            goto L54
        L53:
            r0 = r2
        L54:
            boolean r0 = X.C0N6Z.LIZJ(r0)
            if (r0 == 0) goto L68
            if (r6 == 0) goto L60
            java.lang.String r2 = r6.getAid()
        L60:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = X.C0N6Z.LIZIZ(r2)
            if (r0 != 0) goto L67
            r4 = 0
        L67:
            return r4
        L68:
            if (r6 == 0) goto L6e
            java.lang.String r2 = r6.getAid()
        L6e:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = X.C0N6Z.LIZIZ(r2)
            if (r0 == 0) goto L75
            r4 = 0
        L75:
            return r4
        L76:
            java.util.HashMap<java.lang.String, com.ss.android.ugc.aweme.feed.model.Aweme> r0 = X.C0N6Z.LIZ
            if (r6 == 0) goto L86
            java.lang.String r1 = r6.getAid()
            if (r1 == 0) goto L86
            java.util.HashSet<java.lang.String> r0 = X.C0N6Z.LJ
            boolean r3 = r0.contains(r1)
        L86:
            r0 = r3 ^ 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.feed.assem.midad.MidAdCellComponent.Ep(com.ss.android.ugc.aweme.feed.model.Aweme):boolean");
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.midad.IMidAdCellAbility
    public final void Se0(boolean z) {
        this.LLLILZ.LIZ = z;
        aq(z, false);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.midad.IMidAdCellAbility
    public final void Wx0(boolean z) {
        this.LLLILZ.LIZJ = z;
        aq(z, true);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.midad.IMidAdCellAbility
    public final void Xy0(boolean z) {
        if (z && !this.LLLIZZ) {
            if (!Jp() || !C2245741Cv6.LIZIZ(Tp().LL)) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) Fp().getLayoutParams();
                layoutParams.topMargin += (int) C12ES.LIZJ(40.0f, getContext());
                C786410Ut5.X5(layoutParams, Fp());
            }
            this.LLLIZZ = true;
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.midad.IMidAdCellAbility
    public final void c81(boolean z) {
        if (C2245741Cv6.LIZIZ(Tp().LL) && Ep(Tp().LL)) {
            this.LLLILZ.LJFF = z;
            aq(z, true);
        }
    }

    public final void dq(int i) {
        boolean z;
        if (C2245741Cv6.LIZIZ(Tp().LL) && Jp()) {
            C786410Ut5.LJLLLLLL(0, LJJIJL());
            ViewGroup.LayoutParams layoutParams = LJJIJL().getLayoutParams();
            if (layoutParams.height == 0 && i == 0) {
                if (LJJIJL().getX() == 0.0f) {
                    z = true;
                } else {
                    z = false;
                }
                ViewGroup.LayoutParams layoutParams2 = LJJIJL().getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) Fp().getLayoutParams();
                C786410Ut5.LJLZ(0, Fp());
                if (z) {
                    marginLayoutParams.bottomMargin = -((int) C12ES.LIZJ(28.0f, getContext()));
                    C786410Ut5.X5(marginLayoutParams, Fp());
                    layoutParams2.height = -2;
                    C786410Ut5.W5(LJJIJL(), layoutParams2);
                    C421750GgH.LIZIZ(Fp(), marginLayoutParams.bottomMargin, 0, 150).start();
                } else {
                    marginLayoutParams.bottomMargin = 0;
                    C786410Ut5.X5(marginLayoutParams, Fp());
                    layoutParams2.height = -2;
                    C786410Ut5.W5(LJJIJL(), layoutParams2);
                    C786410Ut5.T4(LJJIJL(), 0.0f);
                    LJJIJL().animate().alpha(1.0f).setDuration(150L).start();
                }
            } else {
                layoutParams.height = 0;
            }
            C786410Ut5.W5(LJJIJL(), layoutParams);
            return;
        }
        C786410Ut5.LJLLLLLL(i, LJJIJL());
    }

    public final void fq(boolean z) {
        ViewGroup.LayoutParams layoutParams = Fp().getLayoutParams();
        if (z) {
            Fp().setBackgroundResource(R.drawable.akc);
            C339190DRl.LIZIZ(Ip());
            C339190DRl.LIZLLL(Gp());
            layoutParams.height = (int) C12ES.LIZJ(16.0f, getContext());
            if (layoutParams instanceof FrameLayout.LayoutParams) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams2.gravity = 16;
                layoutParams2.bottomMargin = 0;
            }
            int iIntValue = 82;
            if (C0SXP.LIZIZ().enable) {
                TuxTextView tuxTextViewGp = Gp();
                Integer numLJFF = C0SXP.LJFF();
                if (numLJFF != null) {
                    iIntValue = numLJFF.intValue();
                }
                tuxTextViewGp.setTuxFont(iIntValue);
                Gp().setPadding(0, 0, 0, 0);
                C0SXP.LIZ(Fp());
                Integer numLJ = C0SXP.LJ(Gp().getContext());
                if (numLJ != null) {
                    Gp().setTextColor(numLJ.intValue());
                }
            } else {
                Fp().setBackgroundResource(R.drawable.akc);
                float f = 4;
                Gp().setPadding((int) C339190DRl.LIZ(f), 0, (int) C339190DRl.LIZ(f), 0);
                Gp().setTuxFont(82);
                Gp().setTextColorRes(R.attr.ee);
            }
        } else {
            Fp().setBackgroundResource(R.drawable.b9x);
            C339190DRl.LIZLLL(Ip());
            C339190DRl.LIZIZ(Gp());
            layoutParams.height = (int) C12ES.LIZJ(28.0f, getContext());
            if (layoutParams instanceof FrameLayout.LayoutParams) {
                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams3.gravity = 0;
                layoutParams3.bottomMargin = 0;
            }
        }
        C786410Ut5.X5(layoutParams, Fp());
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.midad.IMidAdCellAbility
    public final void kg1(boolean z) {
        this.LLLILZ.LJ = z;
        aq(z, false);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        VideoSeekBarMaskView videoSeekBarMaskView;
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            videoSeekBarMaskView = (VideoSeekBarMaskView) c19egLIZ.findViewById(R.id.nwj);
        } else {
            videoSeekBarMaskView = null;
        }
        this.LLLIILIL = videoSeekBarMaskView;
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJZ.getValue(), new C2217381BqS() { // from class: X.0Nz1
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILLL;
            }
        }, C736820SvI.LJ(), AFwS323S0000000_34.get$arr$(28), 4);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJZ.getValue(), new C2217381BqS() { // from class: X.0Rss
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILZIL;
            }
        }, C736820SvI.LJ(), AFwS323S0000000_34.get$arr$(34), 4);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJZIJLIL.getValue(), new C2217381BqS() { // from class: X.0R8W
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0RFV) obj).LLJ;
            }
        }, C736820SvI.LJ(), AFwS323S0000000_34.get$arr$(36), 4);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJZIJLIL.getValue(), new C2217381BqS() { // from class: X.0SHd
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0RFV) obj).LLJJJJ;
            }
        }, C736820SvI.LJ(), AFwS323S0000000_34.get$arr$(37), 4);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJZIJLIL.getValue(), new C2217381BqS() { // from class: X.0RSm
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0RFV) obj).LLJJIJI;
            }
        }, C736820SvI.LJ(), AFwS323S0000000_34.get$arr$(31), 4);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJZIJLIL.getValue(), new C2217381BqS() { // from class: X.0S9A
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0RFV) obj).LLJJL;
            }
        }, C736820SvI.LJ(), AFwS323S0000000_34.get$arr$(33), 4);
        C736680Sv4.LJIIIIZZ(this, Tp(), new C2217381BqS() { // from class: X.1CvF
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C2245781CvA) obj).LLILZLL;
            }
        }, C736820SvI.LJ(), AFwS323S0000000_34.get$arr$(35), 4);
        C736680Sv4.LJIIIIZZ(this, Tp(), new C2217381BqS() { // from class: X.1CvG
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C2245781CvA) obj).LL;
            }
        }, C736820SvI.LJ(), AFwS308S0000000_23.get$arr$(22), 4);
        C736680Sv4.LJIIIIZZ(this, Tp(), new C2217381BqS() { // from class: X.1CvH
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C2245781CvA) obj).LLILLJJLI;
            }
        }, C736820SvI.LJ(), AFwS323S0000000_34.get$arr$(38), 4);
        C736680Sv4.LJIIIIZZ(this, Tp(), new C2217381BqS() { // from class: X.1CvI
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C2245781CvA) obj).LLILZ;
            }
        }, C736820SvI.LJ(), AFwS323S0000000_34.get$arr$(39), 4);
        C736680Sv4.LJIIIIZZ(this, Tp(), new C2217381BqS() { // from class: X.1CvJ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C2245781CvA) obj).LLILZIL;
            }
        }, C736820SvI.LJ(), AFwS323S0000000_34.get$arr$(40), 4);
        C736680Sv4.LJIIIIZZ(this, Tp(), new C2217381BqS() { // from class: X.1CvK
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C2245781CvA) obj).LLIZ;
            }
        }, C736820SvI.LJ(), AFwS323S0000000_34.get$arr$(41), 4);
        C736680Sv4.LJIIIIZZ(this, Tp(), new C2217381BqS() { // from class: X.1CvL
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C2245781CvA) obj).LLILLL;
            }
        }, C736820SvI.LJ(), AFwS323S0000000_34.get$arr$(42), 4);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLL.getValue(), new C2217381BqS() { // from class: X.0c2g
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C996560c2Y) obj).LLJILJILJ;
            }
        }, C736820SvI.LJ(), AFwS323S0000000_34.get$arr$(43), 4);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLL.getValue(), new C2217381BqS() { // from class: X.0c2e
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C996560c2Y) obj).LLJILLL;
            }
        }, C736820SvI.LJ(), AFwS323S0000000_34.get$arr$(29), 4);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLL.getValue(), new C2217381BqS() { // from class: X.0c2f
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C996560c2Y) obj).LLJJI;
            }
        }, C736820SvI.LJ(), AFwS323S0000000_34.get$arr$(30), 4);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLL.getValue(), new C2217381BqS() { // from class: X.0c2n
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C996560c2Y) obj).LLJILJIL;
            }
        }, C736820SvI.LJ(), AFwS323S0000000_34.get$arr$(32), 4);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent
    /* JADX INFO: renamed from: op */
    public final boolean ur(VideoItemParams videoItemParams) {
        if (Jp()) {
            boolean z = true;
            if (C2245741Cv6.LIZIZ(videoItemParams.getAweme())) {
                if (this.LLLLIILLL.getValue() == null) {
                    z = false;
                }
                String str = this.LLJLLIL;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("[isActive] aid=");
                sbLIZ.append(videoItemParams.getAweme().getAid());
                sbLIZ.append(", isActive=");
                sbLIZ.append(z);
                C1022620cia.LIZ(str, C2188811AlT.LIZIZ(sbLIZ));
                return z;
            }
            if (C2245741Cv6.LIZJ(videoItemParams.getAweme())) {
                if (this.LLLLIILLL.getValue() != null) {
                    z = false;
                }
                String str2 = this.LLJLLIL;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("[isActive] aid=");
                sbLIZ2.append(videoItemParams.getAweme().getAid());
                sbLIZ2.append(", isActive=");
                sbLIZ2.append(z);
                C1022620cia.LIZ(str2, C2188811AlT.LIZIZ(sbLIZ2));
                return z;
            }
        }
        String str3 = this.LLJLLIL;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("[isActive] 2 aid=");
        sbLIZ3.append(videoItemParams.getAweme().getAid());
        sbLIZ3.append(", isActive=");
        sbLIZ3.append(super.ur(videoItemParams));
        C1022620cia.LIZ(str3, C2188811AlT.LIZIZ(sbLIZ3));
        return super.ur(videoItemParams);
    }

    @Override // X.InterfaceC712990Rxx
    public final void rr(VideoItemParams videoItemParams) {
        EdgeSpeedupAbility edgeSpeedupAbility;
        VideoItemParams videoItemParams2 = videoItemParams;
        String str = this.LLJLLIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[onBind] isLong=");
        sbLIZ.append(C2245741Cv6.LIZIZ(videoItemParams2.getAweme()));
        sbLIZ.append(", isMidRoll=");
        sbLIZ.append(C2245741Cv6.LIZJ(videoItemParams2.getAweme()));
        C1022620cia.LIZ(str, C2188811AlT.LIZIZ(sbLIZ));
        Tp().vQ2(videoItemParams2.getAweme());
        Xp(videoItemParams2.getAweme(), true);
        this.LLLJIL = false;
        HashMap<String, Aweme> map = C0N6Z.LIZ;
        C0N6Z.LJIIIIZZ = new WeakReference<>(this);
        this.LLLJ = C0N6Z.LJIIJ;
        C0N6Z.LJIIJ = null;
        C2245901CvM c2245901CvM = this.LLLLIL;
        CopyOnWriteArrayList<InterfaceC588420N6a> copyOnWriteArrayList = C0N6Z.LJIILLIIL;
        if (!copyOnWriteArrayList.contains(c2245901CvM)) {
            copyOnWriteArrayList.add(c2245901CvM);
        }
        String str2 = this.LLJLLIL;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("[addListener] listener.size=");
        sbLIZ2.append(copyOnWriteArrayList.size());
        C1022620cia.LIZ(str2, C2188811AlT.LIZIZ(sbLIZ2));
        if (Jp() && (edgeSpeedupAbility = (EdgeSpeedupAbility) this.LLLFF.getValue()) != null) {
            edgeSpeedupAbility.E51(this.LLLIIII);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(Object obj) {
        return ur((VideoItemParams) obj);
    }

    public final void Wp(Aweme aweme, Long l) {
        String aid;
        String str = this.LLJLLIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[replaceAweme] current=");
        sbLIZ.append(aweme.getAid());
        sbLIZ.append(", replace=");
        Aweme aweme2 = Tp().LLILLJJLI;
        if (aweme2 != null) {
            aid = aweme2.getAid();
        } else {
            aid = null;
        }
        sbLIZ.append(aid);
        C1022620cia.LIZ(str, C2188811AlT.LIZIZ(sbLIZ));
        this.LLLJIL = true;
        MidAdVM midAdVMTp = Tp();
        Context context = getContext();
        midAdVMTp.getClass();
        Iterator<InterfaceC990700bt6> it2 = ((IFeedAdService) ServiceManager.get().getService(IFeedAdService.class)).LJJIIJ().iterator();
        while (it2.hasNext()) {
            it2.next().LJIIZILJ(aweme.getAid());
        }
        for (C0T2H c0t2h : ((IFeedAdService) ServiceManager.get().getService(IFeedAdService.class)).LIZLLL()) {
            if (context != null) {
                c0t2h.LIZIZ(context, aweme);
            }
        }
        IMidAdAbility iMidAdAbilityQp = Qp();
        if (iMidAdAbilityQp != null) {
            iMidAdAbilityQp.JH0(aweme, Tp().LLILLJJLI, this.LLLJ, new InterfaceC1601020rlU() { // from class: X.1CvN
                @Override // X.InterfaceC1601020rlU
                public final void LJJI() {
                    C1483410ohn.LJLJJI().LJJI();
                    MidAdCellComponent midAdCellComponent = this.LIZ;
                    InterfaceC1483670oiD interfaceC1483670oiD = midAdCellComponent.LLLJ;
                    if (interfaceC1483670oiD != null) {
                        interfaceC1483670oiD.setSurface(null);
                    }
                    InterfaceC1483670oiD interfaceC1483670oiD2 = midAdCellComponent.LLLJ;
                    if (interfaceC1483670oiD2 != null) {
                        interfaceC1483670oiD2.release();
                    }
                    midAdCellComponent.LLLJ = null;
                }
            }, l, ((Boolean) this.LLLLIILL.getValue()).booleanValue());
        }
    }

    public final void Xp(Aweme aweme, boolean z) {
        String aid;
        AwemeRawAd awemeRawAd;
        EnumC584570MwJ enumC584570MwJXo1;
        Activity activityLIZ;
        View viewFindViewById;
        Activity activityLIZ2;
        View viewFindViewById2;
        EnumC584570MwJ enumC584570MwJXo12;
        Activity activityLIZ3;
        String str = this.LLJLLIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[resetCountDown] aweme=");
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        sbLIZ.append(aid);
        sbLIZ.append(", isBind=");
        sbLIZ.append(z);
        C1022620cia.LIZ(str, C2188811AlT.LIZIZ(sbLIZ));
        if (z) {
            if (Jp() && C2245741Cv6.LIZIZ(Tp().LL)) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) Fp().getLayoutParams();
                Context context = getContext();
                if (context != null && (activityLIZ3 = C1388190mED.LIZ(context)) != null && activityLIZ3.findViewById(R.id.tpm) != null) {
                    layoutParams.topMargin = 0;
                    layoutParams.rightMargin = 0;
                }
                C786410Ut5.X5(layoutParams, Fp());
                fq(true);
                IAutoAScrollAbility iAutoAScrollAbility = (IAutoAScrollAbility) this.LLLFZ.getValue();
                if (iAutoAScrollAbility != null) {
                    enumC584570MwJXo12 = iAutoAScrollAbility.xo1();
                } else {
                    enumC584570MwJXo12 = null;
                }
                if (enumC584570MwJXo12 == EnumC584570MwJ.AUTO_SCROLL_STATE_START) {
                    this.LLLIZZ = true;
                }
            } else {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) Fp().getLayoutParams();
                Context context2 = getContext();
                if (context2 != null && (activityLIZ2 = C1388190mED.LIZ(context2)) != null && (viewFindViewById2 = activityLIZ2.findViewById(R.id.tpm)) != null) {
                    Rect rect = new Rect();
                    viewFindViewById2.getGlobalVisibleRect(rect);
                    layoutParams2.topMargin = rect.bottom + ((int) C12ES.LIZJ(16.0f, getContext()));
                    layoutParams2.rightMargin = 0;
                }
                IAutoAScrollAbility iAutoAScrollAbility2 = (IAutoAScrollAbility) this.LLLFZ.getValue();
                if (iAutoAScrollAbility2 != null) {
                    enumC584570MwJXo1 = iAutoAScrollAbility2.xo1();
                } else {
                    enumC584570MwJXo1 = null;
                }
                if (enumC584570MwJXo1 == EnumC584570MwJ.AUTO_SCROLL_STATE_START) {
                    Context context3 = getContext();
                    if (context3 != null && (activityLIZ = C1388190mED.LIZ(context3)) != null && (viewFindViewById = activityLIZ.findViewById(R.id.bei)) != null) {
                        layoutParams2.topMargin += viewFindViewById.getHeight() + ((int) C12ES.LIZJ(8.0f, getContext()));
                    }
                    this.LLLIZZ = true;
                }
                C786410Ut5.X5(layoutParams2, Fp());
                fq(false);
            }
        }
        if (C2245741Cv6.LIZJ(aweme)) {
            if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
                int skipAdTime = awemeRawAd.getSkipAdTime();
                if (((Boolean) this.LLLLII.getValue()).booleanValue()) {
                    C1022620cia.LIZ(this.LLJLLIL, "[resetCountDown] container gone");
                    dq(8);
                    return;
                }
                TuxTextView tuxTextViewIp = Ip();
                if (skipAdTime == -1) {
                    tuxTextViewIp.setText(tuxTextViewIp.getContext().getString(2131834546));
                    C786410Ut5.K7(Fp(), new ACListenerS168S0100000_34(this, 10));
                } else {
                    tuxTextViewIp.setText(C786410Ut5.j4(tuxTextViewIp.getContext().getString(2131834547), Arrays.copyOf(new Object[]{String.valueOf(skipAdTime / LSPassThroughRecordSizeConfig.DEFAULT)}, 1)));
                    C786410Ut5.K7(Fp(), null);
                }
                C786410Ut5.x3(tuxTextViewIp.getViewTreeObserver(), new ViewTreeObserverOnGlobalLayoutListenerC738830SyX(this, 0));
                C786410Ut5.LJLLLLLL(0, LJJIJL());
                C339190DRl.LIZLLL(Fp());
                C1022620cia.LIZ(this.LLJLLIL, "[resetCountDown] containerView.visibility=0");
                return;
            }
            return;
        }
        final String strJ4 = C786410Ut5.j4(Ip().getContext().getString(2131834548), Arrays.copyOf(new Object[]{"5"}, 1));
        Ip().setText(strJ4);
        Gp().setText(strJ4);
        C786410Ut5.x3(Ip().getViewTreeObserver(), new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.0RrL
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                ViewTreeObserver viewTreeObserver = this.LL.Ip().getViewTreeObserver();
                float fMeasureText = this.LL.Ip().getPaint().measureText(strJ4);
                C786410Ut5.C3(viewTreeObserver, this);
                TuxTextView tuxTextViewIp2 = this.LL.Ip();
                ViewGroup.LayoutParams layoutParams3 = this.LL.Ip().getLayoutParams();
                layoutParams3.width = ((int) fMeasureText) + 5;
                C786410Ut5.R6(tuxTextViewIp2, layoutParams3);
                this.LL.Ip().setGravity(8388611);
            }
        });
        dq(8);
        this.LLLILZJ = false;
        if (z) {
            Vp();
        }
    }

    public final void aq(boolean z, boolean z2) {
        String aid;
        if (this.LLLILZJ && z && C2245741Cv6.LIZIZ(Tp().LL)) {
            Ip().setText(C786410Ut5.j4(Ip().getContext().getString(2131834548), Arrays.copyOf(new Object[]{"5"}, 1)));
            Gp().setText(C786410Ut5.j4(Ip().getContext().getString(2131834548), Arrays.copyOf(new Object[]{"5"}, 1)));
            dq(8);
            this.LLLILZJ = false;
            Tp().LLILZ = false;
            AwemeRawAd awemeRawAd = null;
            if (this.LLLILZ.LIZJ()) {
                C1618220sDE c1618220sDE = C1618220sDE.LIZ;
                Aweme aweme = Tp().LL;
                if (aweme != null) {
                    aid = aweme.getAid();
                } else {
                    aid = null;
                }
                String strLIZ = this.LLLILZ.LIZ();
                c1618220sDE.getClass();
                if (aid != null && strLIZ != null) {
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LJFF("fail_reason", strLIZ);
                    C1618220sDE.LIZJ(c2344009Gk, aid, "midroll_ads_show_failed");
                }
                String str = this.LLJLLIL;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("[resetCountDownState] isRealBlock=true, reason=");
                sbLIZ.append(this.LLLILZ.LIZ());
                sbLIZ.append(", needReport=");
                sbLIZ.append(z2);
                C1022620cia.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ));
                Tp().LLJILJIL = true;
            }
            if (z2) {
                Aweme aweme2 = Tp().LLILLJJLI;
                if (aweme2 != null) {
                    awemeRawAd = aweme2.getAwemeRawAd();
                }
                C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "show_fail", awemeRawAd);
                c1022820ciuLIZLLL.LIZIZ(this.LLLILZ.LIZ(), "fail_reason");
                c1022820ciuLIZLLL.LJII();
            }
        }
    }
}
