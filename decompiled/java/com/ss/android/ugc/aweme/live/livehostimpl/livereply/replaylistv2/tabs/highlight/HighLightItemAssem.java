package com.ss.android.ugc.aweme.live.livehostimpl.livereply.replaylistv2.tabs.highlight;

import X.AbstractViewOnClickListenerC1231770i9v;
import X.C019F;
import X.C09R3;
import X.C0H9F;
import X.C1005830cHV;
import X.C1058540deW;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C13LE;
import X.C1479570obb;
import X.C1482570ogR;
import X.C1482580ogS;
import X.C1484680ojq;
import X.C1637806bA;
import X.C1637906bB;
import X.C1697810uHb;
import X.C1782920wUs;
import X.C1835580xro;
import X.C1835700xs0;
import X.C1838100xvs;
import X.C1864450ycN;
import X.C1954807lC;
import X.C19719912Dl;
import X.C20441214yg;
import X.C2188811AlT;
import X.C2213981Bky;
import X.C2217381BqS;
import X.C337180DJs;
import X.C497740JfY;
import X.C631370Opb;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.InterfaceC1320380kSq;
import X.InterfaceC1473950oSX;
import X.InterfaceC1483820oiS;
import X.InterfaceC1484830ok5;
import X.InterfaceC1488100opM;
import X.InterfaceC1587906Jp;
import X.InterfaceC2217461Bqa;
import X.InterfaceC712990Rxx;
import Y.ACListenerS161S0100000_27;
import android.content.Context;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.replaylistv2.tabs.highlight.HighLightItemAssem;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.replaylistv2.tabs.highlight.vm.HighlightMuteVM;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.replaylistv2.tabs.highlight.vm.HighlightPlayControlVM;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.replaylistv2.tabs.highlight.vm.SharedPlayerVM;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.AFwS314S0000000_27;
import kotlin.jvm.internal.AFwS349S0000000_27;
import kotlin.jvm.internal.AwS2S0001100_27;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.Intrinsics;
import tikcast.api.anchor.AiClipWidget;

/* JADX INFO: loaded from: classes28.dex */
public final class HighLightItemAssem extends ReusedUISlotAssem<HighLightItemAssem> implements InterfaceC712990Rxx<C1835580xro>, InterfaceC1483820oiS {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLIIIIL;
    public static final List<Integer> LLLIIIL;
    public ConstraintLayout LLJJLIIIJLLLLLLLZ;
    public FrameLayout LLJL;
    public SmartImageView LLJLIL;
    public View LLJLILLLLZIIL;
    public TuxIconView LLJLL;
    public TuxIconView LLJLLIL;
    public LinearLayout LLJLLL;
    public SmartImageView LLJZ;
    public TextView LLJZIJLIL;
    public TuxTextView LLL;
    public TuxTextView LLLF;
    public TuxTextView LLLFF;
    public C1835580xro LLLFFI;
    public boolean LLLFZ;
    public final AssemVMLazy LLLI;
    public final AssemVMLazy LLLII;
    public final AssemVMLazy LLLIIII;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(HighLightItemAssem.class, "playControlVM", "getPlayControlVM()Lcom/ss/android/ugc/aweme/live/livehostimpl/livereply/replaylistv2/tabs/highlight/vm/HighlightPlayControlVM;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(HighLightItemAssem.class, "sharedPlayerVM", "getSharedPlayerVM()Lcom/ss/android/ugc/aweme/live/livehostimpl/livereply/replaylistv2/tabs/highlight/vm/SharedPlayerVM;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(HighLightItemAssem.class, "muteVM", "getMuteVM()Lcom/ss/android/ugc/aweme/live/livehostimpl/livereply/replaylistv2/tabs/highlight/vm/HighlightMuteVM;", 0);
        c09r3.getClass();
        LLLIIIIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
        LLLIIIL = C1697810uHb.LJIIJJI(200, 201, 202, 203);
    }

    public HighLightItemAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(HighlightPlayControlVM.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLLI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS571S0100000_27(c19719912DlLIZ, 512), AFwS269S0000000_27.get$arr$(111), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(SharedPlayerVM.class);
        this.LLLII = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS571S0100000_27(c19719912DlLIZ2, 513), AFwS269S0000000_27.get$arr$(112), null, true);
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(HighlightMuteVM.class);
        this.LLLIIII = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c019f, c1637906bB, new AwS571S0100000_27(c19719912DlLIZ3, 514), AFwS269S0000000_27.get$arr$(113), null, true);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.dgu;
    }

    @Override // X.InterfaceC1483820oiS
    public final /* synthetic */ boolean bn() {
        return true;
    }

    @Override // X.InterfaceC1483820oiS
    public final /* synthetic */ InterfaceC1473950oSX getCustomSurfaceLifecycleListener() {
        return null;
    }

    @Override // X.InterfaceC1483820oiS
    public final /* synthetic */ Surface getSurface() {
        return null;
    }

    @Override // X.InterfaceC1483820oiS
    public final /* synthetic */ void hj() {
    }

    @Override // X.InterfaceC1483820oiS
    public final /* synthetic */ void pe() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // X.InterfaceC1483820oiS
    public final HashMap getParams() {
        return new HashMap();
    }

    public final HighlightMuteVM tp() {
        AssemVMLazy assemVMLazy = this.LLLIIII;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLIIIIL;
        return (HighlightMuteVM) assemVMLazy.getValue();
    }

    public final SharedPlayerVM up() {
        AssemVMLazy assemVMLazy = this.LLLII;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLIIIIL;
        return (SharedPlayerVM) assemVMLazy.getValue();
    }

    public final boolean yp() {
        C1835580xro c1835580xro = this.LLLFFI;
        if (c1835580xro == null) {
            return false;
        }
        long j = c1835580xro.LL;
        Long l = up().getState().LL;
        return l != null && l.longValue() == j;
    }

    public final void zp() {
        View view;
        SmartImageView smartImageView = this.LLJLIL;
        if (smartImageView != null) {
            C337180DJs.LIZJ(smartImageView);
        }
        if (this.LLLFZ && (view = this.LLJLILLLLZIIL) != null) {
            C337180DJs.LIZJ(view);
        }
        TuxIconView tuxIconView = this.LLJLL;
        if (tuxIconView != null) {
            C337180DJs.LIZ(tuxIconView);
        }
        TuxIconView tuxIconView2 = this.LLJLLIL;
        if (tuxIconView2 != null) {
            C337180DJs.LIZ(tuxIconView2);
        }
    }

    public final void Bp() {
        String str;
        if (!yp()) {
            TuxTextView tuxTextView = this.LLLFF;
            if (tuxTextView != null) {
                C337180DJs.LIZ(tuxTextView);
                return;
            }
            return;
        }
        C1835700xs0 state = up().getState();
        int i = C1782920wUs.LIZ[state.LLILLL.ordinal()];
        if (i == 1 || i == 2) {
            str = "playing";
        } else if (i == 3) {
            str = "pause";
        } else if (i == 4) {
            str = "buffering";
        } else {
            if (i != 5) {
                throw new C1954807lC();
            }
            str = "stop";
        }
        TuxTextView tuxTextView2 = this.LLLFF;
        if (tuxTextView2 != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('[');
            sbLIZ.append(str);
            sbLIZ.append("] ");
            sbLIZ.append(sp(state.LLILZ));
            sbLIZ.append('/');
            sbLIZ.append(sp(state.LLILZIL));
            tuxTextView2.setText(C2188811AlT.LIZIZ(sbLIZ));
        }
        TuxTextView tuxTextView3 = this.LLLFF;
        if (tuxTextView3 != null) {
            C337180DJs.LIZJ(tuxTextView3);
        }
    }

    public final void LJJL() {
        zp();
        SharedPlayerVM sharedPlayerVMUp = up();
        if (sharedPlayerVMUp.xQ2(this)) {
            InterfaceC1484830ok5 interfaceC1484830ok5WQ2 = sharedPlayerVMUp.wQ2();
            if (interfaceC1484830ok5WQ2 != null) {
                interfaceC1484830ok5WQ2.stop();
                interfaceC1484830ok5WQ2.LJJIIZ(sharedPlayerVMUp);
                interfaceC1484830ok5WQ2.LJIIJJI(this);
            }
            sharedPlayerVMUp.LLILLJJLI = null;
            sharedPlayerVMUp.setState(AFwS269S0000000_27.get$arr$(385));
            C20441214yg.LIZIZ("LiveRecordingV2", "stop");
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
        LJJL();
        this.LLLFFI = null;
        this.LLLFZ = false;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        LJJL();
    }

    @Override // X.InterfaceC1483820oiS
    public final FrameLayout getPlayViewContainer() {
        return this.LLJL;
    }

    public final void Ap(Long l) {
        C1835580xro c1835580xro;
        InterfaceC1483820oiS interfaceC1483820oiS;
        C1835580xro c1835580xro2 = this.LLLFFI;
        if (c1835580xro2 == null) {
            return;
        }
        if (l != null && c1835580xro2.LL == l.longValue()) {
            if (!up().xQ2(this) && (c1835580xro = this.LLLFFI) != null) {
                SharedPlayerVM sharedPlayerVMUp = up();
                String strValueOf = String.valueOf(c1835580xro.LL);
                String str = c1835580xro.LLILLJJLI;
                long j = c1835580xro.LL;
                int iLIZIZ = C631370Opb.LIZIZ(this);
                boolean z = tp().getState().LL;
                if (!sharedPlayerVMUp.xQ2(this)) {
                    WeakReference<InterfaceC1483820oiS> weakReference = sharedPlayerVMUp.LLILLJJLI;
                    if (weakReference != null && (interfaceC1483820oiS = weakReference.get()) != null) {
                        InterfaceC1484830ok5 interfaceC1484830ok5WQ2 = sharedPlayerVMUp.wQ2();
                        if (interfaceC1484830ok5WQ2 != null) {
                            interfaceC1484830ok5WQ2.LJJIIZ(sharedPlayerVMUp);
                            interfaceC1484830ok5WQ2.LJIIJJI(interfaceC1483820oiS);
                        }
                        sharedPlayerVMUp.LLILLJJLI = null;
                    }
                    sharedPlayerVMUp.LLILLL = z;
                    InterfaceC1484830ok5 interfaceC1484830ok5WQ22 = sharedPlayerVMUp.wQ2();
                    if (interfaceC1484830ok5WQ22 != null) {
                        interfaceC1484830ok5WQ22.LIZJ(this);
                        sharedPlayerVMUp.LLILLJJLI = new WeakReference<>(this);
                        InterfaceC1488100opM interfaceC1488100opMLJIILIIL = interfaceC1484830ok5WQ22.LJIILIIL();
                        if (z) {
                            if (interfaceC1488100opMLJIILIIL != null) {
                                interfaceC1488100opMLJIILIIL.mute();
                            }
                        } else if (interfaceC1488100opMLJIILIIL != null) {
                            interfaceC1488100opMLJIILIIL.unmute();
                        }
                        C1482580ogS c1482580ogS = new C1482580ogS();
                        c1482580ogS.LIZ = strValueOf;
                        C1058540deW c1058540deW = new C1058540deW(c1482580ogS);
                        c1058540deW.LIZIZ(str);
                        C1482570ogR c1482570ogRLIZ = c1058540deW.LIZ().LIZ();
                        C1479570obb c1479570obb = c1482570ogRLIZ.LIZIZ;
                        c1479570obb.LJIILL = "live_recording_v2";
                        c1479570obb.LJIILLIIL = "live_recording_v2";
                        C1482580ogS c1482580ogS2 = c1482570ogRLIZ.LIZ;
                        c1482580ogS2.LJ = c1482570ogRLIZ;
                        interfaceC1484830ok5WQ22.LJ(new C1484680ojq(c1482580ogS2).LIZ());
                        interfaceC1484830ok5WQ22.LJIIZILJ(sharedPlayerVMUp);
                    }
                    sharedPlayerVMUp.setState(new AwS2S0001100_27(j, iLIZIZ, 3));
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("play: index=");
                    sbLIZ.append(iLIZIZ);
                    sbLIZ.append(" mute=");
                    sbLIZ.append(z);
                    C20441214yg.LIZIZ("LiveRecordingV2", C2188811AlT.LIZIZ(sbLIZ));
                    sharedPlayerVMUp.LLILZIL = (Float) ((LinkedHashMap) sharedPlayerVMUp.LLILZ).get(Long.valueOf(j));
                }
                op(c1835580xro.LLJIJIL, c1835580xro.LLJILJIL);
                return;
            }
            return;
        }
        LJJL();
    }

    public final void Ep(boolean z) {
        if (z) {
            TuxIconView tuxIconView = this.LLJLLIL;
            if (tuxIconView != null) {
                C337180DJs.LIZJ(tuxIconView);
            }
            TuxIconView tuxIconView2 = this.LLJLL;
            if (tuxIconView2 != null) {
                C337180DJs.LIZ(tuxIconView2);
                return;
            }
            return;
        }
        TuxIconView tuxIconView3 = this.LLJLL;
        if (tuxIconView3 != null) {
            C337180DJs.LIZJ(tuxIconView3);
        }
        TuxIconView tuxIconView4 = this.LLJLLIL;
        if (tuxIconView4 == null) {
            return;
        }
        C337180DJs.LIZ(tuxIconView4);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLJJLIIIJLLLLLLLZ = (ConstraintLayout) view.findViewById(R.id.f4y);
        this.LLJL = (FrameLayout) view.findViewById(R.id.video_container);
        this.LLJLIL = (SmartImageView) view.findViewById(R.id.f59);
        SmartImageView smartImageView = this.LLJLIL;
        if (smartImageView != null) {
            C0H9F.LIZ(smartImageView);
        }
        this.LLJLILLLLZIIL = view.findViewById(R.id.j4c);
        this.LLJLL = (TuxIconView) view.findViewById(R.id.k3z);
        this.LLJLLIL = (TuxIconView) view.findViewById(R.id.k40);
        this.LLJLLL = (LinearLayout) view.findViewById(R.id.an7);
        this.LLJZ = (SmartImageView) view.findViewById(R.id.an5);
        this.LLJZIJLIL = (TextView) view.findViewById(R.id.an6);
        this.LLL = (TuxTextView) view.findViewById(R.id.title);
        this.LLLF = (TuxTextView) view.findViewById(R.id.time);
        if (C2213981Bky.LIZIZ.isDebug()) {
            TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.fgk);
            this.LLLFF = tuxTextView;
            C337180DJs.LIZJ(tuxTextView);
        }
        ConstraintLayout constraintLayout = this.LLJJLIIIJLLLLLLLZ;
        if (constraintLayout != null) {
            float fLJIIZILJ = (C497740JfY.LJIIZILJ() - (3 * C497740JfY.LIZIZ(6))) / 2;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) constraintLayout.getLayoutParams();
            layoutParams.width = (int) fLJIIZILJ;
            layoutParams.height = (int) (((double) fLJIIZILJ) / 0.61d);
            C786410Ut5.m6(constraintLayout, layoutParams);
        }
        AssemVMLazy assemVMLazy = this.LLLI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLIIIIL;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0xrx
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1005830cHV) obj).LL;
            }
        }, null, AFwS314S0000000_27.get$arr$(9), 6);
        C736680Sv4.LJIIIIZZ(this, up(), new C2217381BqS() { // from class: X.0xsB
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1835700xs0) obj).LLILLL;
            }
        }, null, AFwS314S0000000_27.get$arr$(10), 6);
        C736680Sv4.LJIIIZ(this, up(), new C2217381BqS() { // from class: X.0xs1
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C1835700xs0) obj).LLILZLL);
            }
        }, new C2217381BqS() { // from class: X.0xs2
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C1835700xs0) obj).LLIZ);
            }
        }, null, AFwS349S0000000_27.get$arr$(0), 12);
        C736680Sv4.LJIIIIZZ(this, tp(), new C2217381BqS() { // from class: X.0xs9
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C995720c1C) obj).LL);
            }
        }, null, AFwS314S0000000_27.get$arr$(6), 6);
        TuxIconView tuxIconView = this.LLJLL;
        if (tuxIconView != null) {
            C786410Ut5.a9(tuxIconView, new ACListenerS161S0100000_27(this, 45));
        }
        TuxIconView tuxIconView2 = this.LLJLLIL;
        if (tuxIconView2 != null) {
            C786410Ut5.a9(tuxIconView2, new ACListenerS161S0100000_27(this, 46));
        }
        if (this.LLLFF != null) {
            C736680Sv4.LJIIIIZZ(this, up(), new C2217381BqS() { // from class: X.0xs3
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Long.valueOf(((C1835700xs0) obj).LLILZ);
                }
            }, null, AFwS314S0000000_27.get$arr$(7), 6);
            C736680Sv4.LJIIIIZZ(this, up(), new C2217381BqS() { // from class: X.0xsA
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1835700xs0) obj).LLILLL;
                }
            }, null, AFwS314S0000000_27.get$arr$(8), 6);
        }
        C786410Ut5.I7(new AbstractViewOnClickListenerC1231770i9v() { // from class: X.0xrn
            {
                super(300L);
            }

            @Override // X.AbstractViewOnClickListenerC1231770i9v
            public final void LIZ(View view2) {
                HighLightItemAssem highLightItemAssem;
                C1835580xro c1835580xro;
                boolean z;
                float fFloatValue;
                EnumC1782300wTs enumC1782300wTs;
                if (view2 != null && (c1835580xro = (highLightItemAssem = this.LLILZ).LLLFFI) != null) {
                    C1835440xra c1835440xra = C1835440xra.LIZ;
                    long j = c1835580xro.LL;
                    String str = c1835580xro.LLIZ;
                    int iLIZIZ = C631370Opb.LIZIZ(highLightItemAssem);
                    int i = c1835580xro.LLJI;
                    int i2 = c1835580xro.LLJ;
                    C1835580xro c1835580xro2 = this.LLILZ.LLLFFI;
                    if (c1835580xro2 != null && c1835580xro2.LLILZLL != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    c1835440xra.getClass();
                    C1835440xra.LIZJ(iLIZIZ, "click", z, str, i, j, i2);
                    Float f = (Float) ((LinkedHashMap) this.LLILZ.up().LLILZ).get(Long.valueOf(c1835580xro.LL));
                    if (f != null) {
                        fFloatValue = f.floatValue();
                    } else {
                        fFloatValue = 0.0f;
                    }
                    C1834140xpU c1834140xpU = C1834140xpU.LIZ;
                    Context context = this.LLILZ.getContext();
                    String strValueOf = String.valueOf(c1835580xro.LL);
                    String str2 = c1835580xro.LLIZ;
                    String str3 = c1835580xro.LLIZLLLIL;
                    if (HighLightItemAssem.LLLIIIL.contains(Integer.valueOf(c1835580xro.LLJ))) {
                        enumC1782300wTs = EnumC1782300wTs.AUTOCUT;
                    } else {
                        enumC1782300wTs = EnumC1782300wTs.HIGHLIGHT;
                    }
                    boolean z2 = c1835580xro.LLJILJILJ;
                    boolean z3 = c1835580xro.LLJILLL;
                    String str4 = c1835580xro.LLJJ;
                    c1834140xpU.getClass();
                    C1834140xpU.LIZ(context, strValueOf, str2, str3, fFloatValue, "two_column_highlight", enumC1782300wTs, "live_replay", z2, z3, str4);
                }
            }
        }, view);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C1835580xro c1835580xro) {
        boolean z;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int iLIZIZ;
        InterfaceC1320380kSq interfaceC1320380kSq;
        int i;
        LinearLayout.LayoutParams layoutParams;
        int i2;
        C1835580xro c1835580xro2 = c1835580xro;
        this.LLLFFI = c1835580xro2;
        AiClipWidget aiClipWidget = c1835580xro2.LLILZLL;
        if (aiClipWidget == null) {
            C337180DJs.LIZ(this.LLJLLL);
        } else {
            C337180DJs.LIZJ(this.LLJLLL);
            if (aiClipWidget.iconUrl.length() > 0) {
                z = true;
                SmartImageView smartImageView = this.LLJZ;
                if (smartImageView != null) {
                    C337180DJs.LIZJ(smartImageView);
                }
                SmartImageView smartImageView2 = this.LLJZ;
                if (smartImageView2 != null) {
                    C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(aiClipWidget.iconUrl);
                    c1331670kl3LJIIIZ.LJJ(smartImageView2);
                    C786410Ut5.h3(c1331670kl3LJIIIZ);
                }
            } else {
                z = false;
                C337180DJs.LIZ(this.LLJZ);
            }
            TextView textView = this.LLJZIJLIL;
            if (textView != null) {
                textView.setText(aiClipWidget.text);
            }
            TextView textView2 = this.LLJZIJLIL;
            if (textView2 != null) {
                ViewGroup.LayoutParams layoutParams2 = textView2.getLayoutParams();
                if ((layoutParams2 instanceof LinearLayout.LayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                    if (z) {
                        iLIZIZ = (int) C497740JfY.LIZIZ(3);
                    } else {
                        iLIZIZ = 0;
                    }
                    if (marginLayoutParams.getMarginStart() != iLIZIZ) {
                        marginLayoutParams.setMarginStart(iLIZIZ);
                        C786410Ut5.g6(textView2, marginLayoutParams);
                    }
                }
            }
        }
        String str = c1835580xro2.LLILZIL;
        if (str != null && str.length() != 0) {
            C337180DJs.LIZJ(this.LLL);
            TuxTextView tuxTextView = this.LLL;
            if (tuxTextView != null) {
                tuxTextView.setText(c1835580xro2.LLILZIL);
            }
        } else {
            C337180DJs.LIZ(this.LLL);
        }
        TuxTextView tuxTextView2 = this.LLL;
        if (tuxTextView2 != null) {
            ViewGroup.LayoutParams layoutParams3 = tuxTextView2.getLayoutParams();
            if ((layoutParams3 instanceof LinearLayout.LayoutParams) && (layoutParams = (LinearLayout.LayoutParams) layoutParams3) != null) {
                if (aiClipWidget != null) {
                    i2 = 4;
                } else {
                    i2 = 6;
                }
                int iLIZIZ2 = (int) C497740JfY.LIZIZ(i2);
                if (layoutParams.topMargin != iLIZIZ2) {
                    layoutParams.topMargin = iLIZIZ2;
                    C786410Ut5.R6(tuxTextView2, layoutParams);
                }
            }
        }
        TuxTextView tuxTextView3 = this.LLLF;
        if (tuxTextView3 != null) {
            tuxTextView3.setText(C1838100xvs.LIZ(c1835580xro2.LLILZ));
        }
        this.LLLFZ = false;
        View view = this.LLJLILLLLZIIL;
        if (view != null) {
            C337180DJs.LIZ(view);
        }
        SmartImageView smartImageView3 = this.LLJLIL;
        if (smartImageView3 != null) {
            int i3 = c1835580xro2.LLJIJIL;
            if (i3 <= 0 || (i = c1835580xro2.LLJILJIL) <= 0 || i / i3 > 1.0f) {
                interfaceC1320380kSq = InterfaceC1320380kSq.LJI;
            } else {
                interfaceC1320380kSq = InterfaceC1320380kSq.LIZJ;
            }
            if (!Intrinsics.LJFF(smartImageView3.getHierarchy().LJIIJJI(), interfaceC1320380kSq)) {
                smartImageView3.getHierarchy().LJIIZILJ(interfaceC1320380kSq);
            }
        }
        SmartImageView smartImageView4 = this.LLJLIL;
        if (smartImageView4 != null) {
            C1331670kl3 c1331670kl3LJIIIZ2 = C1331660kl2.LJIIIZ(c1835580xro2.LLILLL);
            c1331670kl3LJIIIZ2.LJJ(smartImageView4);
            c1331670kl3LJIIIZ2.LJIIJ(new C1864450ycN(this, c1835580xro2, 1));
            C337180DJs.LIZJ(smartImageView4);
        }
        TuxIconView tuxIconView = this.LLJLL;
        if (tuxIconView != null) {
            C337180DJs.LIZ(tuxIconView);
        }
        TuxIconView tuxIconView2 = this.LLJLLIL;
        if (tuxIconView2 != null) {
            C337180DJs.LIZ(tuxIconView2);
        }
        FrameLayout frameLayout = this.LLJL;
        if (frameLayout != null) {
            C337180DJs.LIZJ(frameLayout);
        }
        TuxTextView tuxTextView4 = this.LLLFF;
        if (tuxTextView4 != null) {
            C337180DJs.LIZ(tuxTextView4);
        }
        AssemVMLazy assemVMLazy = this.LLLI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLIIIIL;
        Ap(((C1005830cHV) assemVMLazy.getValue().getState()).LL);
    }

    public final String sp(long j) {
        int i = (int) (j / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
        return C786410Ut5.j4("%d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i / 60), Integer.valueOf(i % 60)}, 2));
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C1835580xro c1835580xro) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C1835580xro c1835580xro) {
    }

    public final void op(int i, int i2) {
        FrameLayout frameLayout;
        FrameLayout.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        if (i <= 0 || i2 <= 0 || (frameLayout = this.LLJL) == null) {
            return;
        }
        Integer numValueOf = Integer.valueOf(frameLayout.getWidth());
        if (numValueOf.intValue() <= 0) {
            ConstraintLayout constraintLayout = this.LLJJLIIIJLLLLLLLZ;
            if (constraintLayout != null && (layoutParams2 = constraintLayout.getLayoutParams()) != null) {
                numValueOf = Integer.valueOf(layoutParams2.width);
                if (numValueOf.intValue() <= 0) {
                    return;
                }
            } else {
                return;
            }
        }
        int iIntValue = numValueOf.intValue();
        int i3 = (int) ((iIntValue * i2) / i);
        if (i3 > 0) {
            Pair pair = new Pair(Integer.valueOf(iIntValue), Integer.valueOf(i3));
            int iIntValue2 = ((Number) pair.getFirst()).intValue();
            int iIntValue3 = ((Number) pair.getSecond()).intValue();
            View childAt = frameLayout.getChildAt(0);
            if (childAt != null) {
                ViewGroup.LayoutParams layoutParams3 = childAt.getLayoutParams();
                if ((layoutParams3 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams3) != null) {
                    if (layoutParams.width == iIntValue2 && layoutParams.height == iIntValue3 && layoutParams.gravity == 17) {
                        return;
                    }
                    layoutParams.width = iIntValue2;
                    layoutParams.height = iIntValue3;
                    layoutParams.gravity = 17;
                    C786410Ut5.W5(childAt, layoutParams);
                    int right = frameLayout.getRight() - frameLayout.getLeft();
                    int bottom = frameLayout.getBottom() - frameLayout.getTop();
                    if (right > 0 && bottom > 0) {
                        frameLayout.measure(View.MeasureSpec.makeMeasureSpec(right, 1073741824), View.MeasureSpec.makeMeasureSpec(bottom, 1073741824));
                        frameLayout.layout(frameLayout.getLeft(), frameLayout.getTop(), frameLayout.getRight(), frameLayout.getBottom());
                        frameLayout.invalidate();
                        return;
                    }
                    frameLayout.requestLayout();
                }
            }
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
