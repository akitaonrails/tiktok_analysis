package com.ss.android.ugc.aweme.compliance.protection.timelock.ui.assem;

import X.AnonymousClass0956;
import X.C01GW;
import X.C020S;
import X.C05OG;
import X.C0DJW;
import X.C0JBW;
import X.C0OM1;
import X.C0RZ5;
import X.C0TVI;
import X.C1157390gDx;
import X.C1158020gEy;
import X.C1168360gVe;
import X.C1202800hPC;
import X.C1202810hPD;
import X.C1202840hPG;
import X.C1202960hPS;
import X.C1251150ifB;
import X.C1482560ogQ;
import X.C1488130opP;
import X.C1488140opQ;
import X.C14K9;
import X.C1559260qg8;
import X.C1697810uHb;
import X.C197039127h;
import X.C19IB;
import X.C19IC;
import X.C20684815ws;
import X.C2097608Jq;
import X.C23250099c;
import X.C2344009Gk;
import X.C339190DRl;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C452501pT;
import X.C723580SZw;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1163260gNQ;
import X.InterfaceC1483820oiS;
import X.InterfaceC1484830ok5;
import X.InterfaceC497601wk;
import Y.ACListenerS121S0200000_18;
import Y.ACListenerS153S0100000_18;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.status.loading.TuxSpinner;
import com.ss.android.ugc.aweme.compliance.protection.timelock.ui.assem.WhiteNoiseAssem;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AwS16S0000001_18;
import kotlin.jvm.internal.AwS38S1101000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS70S0100100_18;
import kotlin.jvm.internal.AwS87S1000000_2;

/* JADX INFO: loaded from: classes19.dex */
public final class WhiteNoiseAssem extends UIContentAssem {
    public static final Map<EnumC1163260gNQ, C1202800hPC> LLLFFI;
    public static final List<EnumC1163260gNQ> LLLFZ;
    public static final List<C1202840hPG> LLLI;
    public TuxSpinner LLIZLLLIL;
    public FrameLayout LLJ;
    public FrameLayout LLJI;
    public TuxTextView LLJIJIL;
    public LinearLayout LLJILJIL;
    public FrameLayout LLJILJILJ;
    public ViewStub LLJILLL;
    public ViewGroup LLJJ;
    public C197039127h LLJJI;
    public int LLJJIII;
    public long LLJJIJI;
    public long LLJJIJIIJIL;
    public long LLJJIJIL;
    public TuxTextView LLJJJ;
    public TuxTextView LLJJJIL;
    public C19IB LLJJJJ;
    public int LLJLL;
    public boolean LLJLLIL;
    public AnonymousClass0956 LLJLLL;
    public final long LLJJJJJIL = System.currentTimeMillis();
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(93));
    public final C1559260qg8 LLJJL = new C1559260qg8(new C723580SZw(this, C1157390gDx.class, null), checkSupervisorPrepared());
    public EnumC1163260gNQ LLJJLIIIJLLLLLLLZ = EnumC1163260gNQ.DEFAULT;
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 151));
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 154));
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 155));
    public final C01GW LLJZ = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(92));
    public final C01GW LLJZIJLIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 153));
    public final C01GW LLL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 158));
    public final C01GW LLLF = C452501pT.LIZIZ(new AwS562S0100000_18(this, 152));
    public final C01GW LLLFF = C452501pT.LIZIZ(new AwS562S0100000_18(this, 156));

    static {
        EnumC1163260gNQ enumC1163260gNQ = EnumC1163260gNQ.CLASSIC;
        EnumC1163260gNQ enumC1163260gNQ2 = EnumC1163260gNQ.RAIN;
        EnumC1163260gNQ enumC1163260gNQ3 = EnumC1163260gNQ.WAVE;
        LLLFFI = C2097608Jq.LJIIIIZZ(new Pair(enumC1163260gNQ, new C1202800hPC(2131858467, "7224638832557393921", "https://sf16-va.tiktokcdn-us.com/obj/eden-va2/ajbkvyw_zuw/ljhwZthlaukjlkulzlp/wellbeing/white_noise/classic.mp4", "#FFC176", "#ffc85a")), new Pair(enumC1163260gNQ2, new C1202800hPC(2131858468, "6950612348117714946", "https://sf16-va.tiktokcdn-us.com/obj/eden-va2/ajbkvyw_zuw/ljhwZthlaukjlkulzlp/wellbeing/white_noise/rain.mp4", "#5CC5FF", "#599eff")), new Pair(enumC1163260gNQ3, new C1202800hPC(2131858469, "6947648703679170562", "https://sf16-va.tiktokcdn-us.com/obj/eden-va2/ajbkvyw_zuw/ljhwZthlaukjlkulzlp/wellbeing/white_noise/wave.mp4", "#A1A0F8", "#6950ff")));
        LLLFZ = C1697810uHb.LJIIJJI(enumC1163260gNQ2, enumC1163260gNQ3, enumC1163260gNQ);
        LLLI = C1697810uHb.LJIIJJI(new C1202840hPG(5L), new C1202840hPG(10L), new C1202840hPG(15L), new C1202840hPG(20L), new C1202840hPG(25L), new C1202840hPG(30L));
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public final InterfaceC1484830ok5 Go() {
        return (InterfaceC1484830ok5) this.LLJJJJLIIL.getValue();
    }

    public final void Jo() {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("sound_type", this.LLJJLIIIJLLLLLLLZ.getValue());
        c2344009Gk.LJIIIIZZ("page", "whitenoise");
        C20684815ws.LJIILLIIL("wellbeinghub_whitenoise_swipe", c2344009Gk.LIZ);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        AnonymousClass0956 anonymousClass0956 = this.LLJLLL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        Go().stop();
        Go().release();
        C1202960hPS c1202960hPS = C1202960hPS.LIZ;
        String value = this.LLJJLIIIJLLLLLLLZ.getValue();
        c1202960hPS.getClass();
        C1202960hPS.LIZLLL("white_noise", value, "video", "stop", "");
        C1202960hPS.LIZLLL("white_noise", this.LLJJLIIIJLLLLLLLZ.getValue(), "audio", "stop", "");
        C05OG.LIZ.getClass();
        C05OG.LIZIZ();
        long jCurrentTimeMillis = (System.currentTimeMillis() - this.LLJJJJJIL) / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("sound_type", this.LLJJLIIIJLLLLLLLZ.getValue());
        c2344009Gk.LIZLLL(jCurrentTimeMillis, "duration");
        C20684815ws.LJIILLIIL("wellbeinghub_whitenoise_play_duration", c2344009Gk.LIZ);
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        super.onPause();
        AnonymousClass0956 anonymousClass0956 = this.LLJLLL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        Go().pause();
        C05OG.LIZ.getClass();
        C05OG.LIZ();
        C1202960hPS c1202960hPS = C1202960hPS.LIZ;
        String value = this.LLJJLIIIJLLLLLLLZ.getValue();
        c1202960hPS.getClass();
        C1202960hPS.LIZLLL("white_noise", value, "video", "pause", "");
        C1202960hPS.LIZLLL("white_noise", this.LLJJLIIIJLLLLLLLZ.getValue(), "audio", "pause", "");
        Ho("exit_background");
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        Lo("onResume");
    }

    public final void Ho(String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("action", str);
        c2344009Gk.LJIIIIZZ("sound_type", this.LLJJLIIIJLLLLLLLZ.getValue());
        C20684815ws.LJIILLIIL("exit_wellbeinghub_whitenoise", c2344009Gk.LIZ);
    }

    public final void Lo(String str) {
        View view;
        View view2;
        C1202800hPC c1202800hPC = LLLFFI.get(this.LLJJLIIIJLLLLLLLZ);
        if (c1202800hPC == null) {
            return;
        }
        int iIndexOf = LLLFZ.indexOf(this.LLJJLIIIJLLLLLLLZ);
        if (iIndexOf < 0) {
            new C1158020gEy(str, iIndexOf);
            return;
        }
        new AwS38S1101000_18(str, iIndexOf, c1202800hPC, 0);
        TuxTextView tuxTextView = this.LLJIJIL;
        if (tuxTextView != null) {
            tuxTextView.setText(C0JBW.LIZJ(c1202800hPC.LIZ, new Object[0]));
            C339190DRl.LIZLLL(tuxTextView);
        }
        if (iIndexOf != this.LLJLL) {
            LinearLayout linearLayout = this.LLJILJIL;
            ViewGroup.LayoutParams layoutParams = null;
            if (linearLayout != null) {
                int childCount = linearLayout.getChildCount();
                int i = 0;
                view = null;
                view2 = null;
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = linearLayout.getChildAt(i2);
                    if (!(childAt instanceof Space)) {
                        if (i == iIndexOf) {
                            view = childAt;
                        }
                        if (i == this.LLJLL) {
                            view2 = childAt;
                        }
                        i++;
                    }
                }
            } else {
                view = null;
                view2 = null;
            }
            this.LLJLL = iIndexOf;
            if (view != null) {
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(36.0d)));
                    layoutParams2.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(6.0d)));
                } else {
                    layoutParams2 = null;
                }
                C786410Ut5.W5(view, layoutParams2);
                view.setBackgroundResource(R.drawable.bd8);
            }
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams3 = view2.getLayoutParams();
                if (layoutParams3 != null) {
                    layoutParams3.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(6.0d)));
                    layoutParams3.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(6.0d)));
                    layoutParams = layoutParams3;
                }
                C786410Ut5.W5(view2, layoutParams);
                view2.setBackgroundResource(R.drawable.bd9);
            }
            if (view != null) {
                view.requestLayout();
            }
            if (view2 != null) {
                view2.requestLayout();
            }
        }
        String str2 = c1202800hPC.LIZJ;
        new AwS87S1000000_2(str2, 8);
        C1482560ogQ c1482560ogQLIZ = C1488130opP.LIZ(new C1488140opQ(true, Collections.singletonList(str2), 0, str2, 0, 0, true, 48));
        No(true);
        C05OG.LIZ.getClass();
        C05OG.LIZ();
        Go().LJ(c1482560ogQLIZ);
        C1202960hPS c1202960hPS = C1202960hPS.LIZ;
        String value = this.LLJJLIIIJLLLLLLLZ.getValue();
        c1202960hPS.getClass();
        C1202960hPS.LIZLLL("white_noise", value, "video", "play", "beginning");
    }

    public final void No(boolean z) {
        FrameLayout frameLayout;
        if (z) {
            C1202800hPC c1202800hPC = LLLFFI.get(this.LLJJLIIIJLLLLLLLZ);
            if (c1202800hPC != null && (frameLayout = this.LLJ) != null) {
                frameLayout.setBackgroundColor(ColorProtector.parseColor(c1202800hPC.LIZLLL));
            }
            C339190DRl.LIZLLL(this.LLJ);
            C339190DRl.LIZLLL(this.LLIZLLLIL);
            return;
        }
        C339190DRl.LIZIZ(this.LLJ);
        C339190DRl.LIZIZ(this.LLIZLLLIL);
    }

    public final void Oo(long j) {
        String strValueOf;
        String str;
        int i;
        long j2 = ((long) 60) * j * ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        AnonymousClass0956 anonymousClass0956 = this.LLJLLL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        if (j > 0) {
            this.LLJJIJI = System.currentTimeMillis() + j2;
            new AwS70S0100100_18(j2, this, 0);
            if (C0RZ5.LJI()) {
                i = 5;
            } else {
                i = 1;
            }
            this.LLJLLL = C23250099c.LIZLLL((InterfaceC497601wk) this.LLJZ.getValue(), null, null, new C1168360gVe(this, j2 / ((long) i), null), 3);
        } else {
            this.LLJJIJI = 0L;
            this.LLJJIJIIJIL = 0L;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        if (j > 0) {
            strValueOf = String.valueOf(j);
        } else {
            strValueOf = "null";
        }
        c2344009Gk.LJIIIIZZ("current_timer", strValueOf);
        if (j > 0) {
            str = "on";
        } else {
            str = "off";
        }
        c2344009Gk.LJIIIIZZ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str);
        c2344009Gk.LJIIIIZZ("sound_type", this.LLJJLIIIJLLLLLLLZ.getValue());
        C20684815ws.LJIILLIIL("wellbeinghub_whitenoise_timer_set", c2344009Gk.LIZ);
    }

    public final void So(boolean z) {
        String strValueOf;
        C19IB c19ib;
        View viewLJLLLL;
        ViewGroup viewGroup;
        C197039127h c197039127h;
        TuxTextView tuxTextView;
        TuxTextView tuxTextView2;
        C19IB c19ib2;
        if (this.LLJLLIL == z) {
            return;
        }
        this.LLJLLIL = z;
        if (this.LLJJ == null) {
            ViewStub viewStub = this.LLJILLL;
            C19IB c19ib3 = null;
            if (viewStub != null) {
                viewLJLLLL = C786410Ut5.LJLLLL(viewStub);
            } else {
                viewLJLLLL = null;
            }
            if (viewLJLLLL instanceof ViewGroup) {
                viewGroup = (ViewGroup) viewLJLLLL;
            } else {
                viewGroup = null;
            }
            this.LLJJ = viewGroup;
            if (viewGroup != null) {
                viewGroup.setOnTouchListener(new View.OnTouchListener() { // from class: X.0hPE
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        return true;
                    }
                });
            }
            ViewGroup viewGroup2 = this.LLJJ;
            if (viewGroup2 != null && (c197039127h = (C197039127h) viewGroup2.findViewById(R.id.vya)) != null) {
                C786410Ut5.U8(c197039127h, new ACListenerS153S0100000_18(this, 145));
            } else {
                c197039127h = null;
            }
            this.LLJJI = c197039127h;
            ViewGroup viewGroup3 = this.LLJJ;
            if (viewGroup3 != null) {
                tuxTextView = (TuxTextView) viewGroup3.findViewById(R.id.title);
            } else {
                tuxTextView = null;
            }
            this.LLJJJ = tuxTextView;
            ViewGroup viewGroup4 = this.LLJJ;
            if (viewGroup4 != null) {
                tuxTextView2 = (TuxTextView) viewGroup4.findViewById(R.id.wmw);
            } else {
                tuxTextView2 = null;
            }
            this.LLJJJIL = tuxTextView2;
            ViewGroup viewGroup5 = this.LLJJ;
            if (viewGroup5 != null && (c19ib2 = (C19IB) viewGroup5.findViewById(R.id.ujh)) != null) {
                c19ib2.setOnChangeListener(new C19IC() { // from class: X.0hPA
                    @Override // X.C19IC
                    public final void LIZ(C19IB c19ib4, float f) {
                        C1202840hPG c098200Yq;
                        C197039127h c197039127h2;
                        try {
                            c098200Yq = WhiteNoiseAssem.LLLI.get((int) f);
                            C189200o6.m2constructorimpl(c098200Yq);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            c098200Yq = new C098200Yq(th);
                            C189200o6.m2constructorimpl(c098200Yq);
                        }
                        if (C189200o6.m7isFailureimpl(c098200Yq)) {
                            c098200Yq = null;
                        }
                        C1202840hPG c1202840hPG = (C1202840hPG) c098200Yq;
                        if (c1202840hPG == null) {
                            return;
                        }
                        TuxTextView tuxTextView3 = this.LIZ.LLJJJ;
                        if (tuxTextView3 != null) {
                            long j = c1202840hPG.LIZ;
                            tuxTextView3.setText(C0JBW.LIZIZ(2131756067, (int) j, Long.valueOf(j)));
                        }
                        C197039127h c197039127h3 = this.LIZ.LLJJI;
                        if (c197039127h3 != null && !c197039127h3.isEnabled() && (c197039127h2 = this.LIZ.LLJJI) != null) {
                            c197039127h2.setEnabled(true);
                        }
                        if (c19ib4 != null) {
                            c19ib4.setProgressEnable(true);
                        }
                    }

                    @Override // X.C19IC
                    public final void LIZIZ(C19IB c19ib4, float f) {
                        C1202840hPG c098200Yq;
                        Object c098200Yq2;
                        C197039127h c197039127h2;
                        new AwS16S0000001_18(f, 0);
                        try {
                            c098200Yq = WhiteNoiseAssem.LLLI.get((int) f);
                            C189200o6.m2constructorimpl(c098200Yq);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            c098200Yq = new C098200Yq(th);
                            C189200o6.m2constructorimpl(c098200Yq);
                        }
                        Object obj = null;
                        if (C189200o6.m7isFailureimpl(c098200Yq)) {
                            c098200Yq = null;
                        }
                        C1202840hPG c1202840hPG = (C1202840hPG) c098200Yq;
                        if (c1202840hPG == null) {
                            return;
                        }
                        WhiteNoiseAssem whiteNoiseAssem = this.LIZ;
                        whiteNoiseAssem.LLJJIII = (int) f;
                        TuxTextView tuxTextView3 = whiteNoiseAssem.LLJJJ;
                        if (tuxTextView3 != null) {
                            long j = c1202840hPG.LIZ;
                            tuxTextView3.setText(C0JBW.LIZIZ(2131756067, (int) j, Long.valueOf(j)));
                        }
                        C197039127h c197039127h3 = this.LIZ.LLJJI;
                        if (c197039127h3 != null && !c197039127h3.isEnabled() && (c197039127h2 = this.LIZ.LLJJI) != null) {
                            c197039127h2.setEnabled(true);
                        }
                        if (c19ib4 != null) {
                            c19ib4.setProgressEnable(true);
                        }
                        try {
                            c098200Yq2 = String.valueOf(WhiteNoiseAssem.LLLI.get(this.LIZ.LLJJIII).LIZ);
                            C189200o6.m2constructorimpl(c098200Yq2);
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            c098200Yq2 = new C098200Yq(th2);
                            C189200o6.m2constructorimpl(c098200Yq2);
                        }
                        if (!C189200o6.m7isFailureimpl(c098200Yq2)) {
                            obj = c098200Yq2;
                        }
                        String str = (String) obj;
                        if (str == null) {
                            str = "null";
                        }
                        C2344009Gk c2344009Gk = new C2344009Gk();
                        c2344009Gk.LJIIIIZZ("current_timer", str);
                        c2344009Gk.LJIIIIZZ("sound_type", this.LIZ.LLJJLIIIJLLLLLLLZ.getValue());
                        C20684815ws.LJIILLIIL("wellbeinghub_whitenoise_timer_swipe", c2344009Gk.LIZ);
                    }
                });
                c19ib2.setLength(6);
                c19ib2.requestLayout();
                c19ib3 = c19ib2;
            }
            this.LLJJJJ = c19ib3;
        }
        if (z) {
            long jCurrentTimeMillis = (this.LLJJIJI - System.currentTimeMillis()) / ((long) 60);
            long j = LSPassThroughRecordSizeConfig.DEFAULT;
            long j2 = jCurrentTimeMillis / j;
            new C020S((this.LLJJIJIIJIL - System.currentTimeMillis()) / j, 4);
            C1202800hPC c1202800hPC = LLLFFI.get(this.LLJJLIIIJLLLLLLLZ);
            if (c1202800hPC != null && (c19ib = this.LLJJJJ) != null) {
                c19ib.setProgressColor(ColorProtector.parseColor(c1202800hPC.LJ));
            }
            if (j2 > 0) {
                C19IB c19ib4 = this.LLJJJJ;
                if (c19ib4 != null) {
                    c19ib4.setEnabled(false);
                }
                TuxTextView tuxTextView3 = this.LLJJJ;
                if (tuxTextView3 != null) {
                    tuxTextView3.setText(C0JBW.LIZIZ(2131756066, (int) j2, Long.valueOf(j2)));
                }
                TuxTextView tuxTextView4 = this.LLJJJIL;
                if (tuxTextView4 != null) {
                    tuxTextView4.setText(C0JBW.LIZJ(2131858474, new Object[0]));
                }
                C197039127h c197039127h2 = this.LLJJI;
                if (c197039127h2 != null) {
                    c197039127h2.setText(C0JBW.LIZJ(2131858473, new Object[0]));
                }
                C197039127h c197039127h3 = this.LLJJI;
                if (c197039127h3 != null) {
                    c197039127h3.setEnabled(true);
                }
                C19IB c19ib5 = this.LLJJJJ;
                if (c19ib5 != null) {
                    c19ib5.setProgressEnable(true);
                }
            } else {
                C19IB c19ib6 = this.LLJJJJ;
                if (c19ib6 != null) {
                    c19ib6.setEnabled(true);
                }
                this.LLJJIII = 0;
                C19IB c19ib7 = this.LLJJJJ;
                if (c19ib7 != null) {
                    c19ib7.LJFF();
                }
                TuxTextView tuxTextView5 = this.LLJJJ;
                if (tuxTextView5 != null) {
                    tuxTextView5.setText(C0JBW.LIZJ(2131858476, new Object[0]));
                }
                TuxTextView tuxTextView6 = this.LLJJJIL;
                if (tuxTextView6 != null) {
                    tuxTextView6.setText(C0JBW.LIZJ(2131858475, new Object[0]));
                }
                C197039127h c197039127h4 = this.LLJJI;
                if (c197039127h4 != null) {
                    c197039127h4.setText(C0JBW.LIZJ(2131858477, new Object[0]));
                }
                C197039127h c197039127h5 = this.LLJJI;
                if (c197039127h5 != null) {
                    c197039127h5.setEnabled(false);
                }
                C19IB c19ib8 = this.LLJJJJ;
                if (c19ib8 != null) {
                    c19ib8.setProgressEnable(false);
                }
            }
            C2344009Gk c2344009Gk = new C2344009Gk();
            long j3 = this.LLJJIJIL;
            if (j3 > 0) {
                strValueOf = String.valueOf(j3);
            } else {
                strValueOf = "null";
            }
            c2344009Gk.LJIIIIZZ("current_timer", strValueOf);
            c2344009Gk.LJIIIIZZ("sound_type", this.LLJJLIIIJLLLLLLLZ.getValue());
            C20684815ws.LJIILLIIL("wellbeinghub_whitenoise_timer_show", c2344009Gk.LIZ);
            C339190DRl.LIZLLL(this.LLJJ);
            C339190DRl.LIZIZ(this.LLJIJIL);
            C339190DRl.LIZIZ(this.LLJILJIL);
            C339190DRl.LIZIZ(this.LLJILJILJ);
            return;
        }
        C339190DRl.LIZIZ(this.LLJJ);
        C339190DRl.LIZLLL(this.LLJIJIL);
        C339190DRl.LIZLLL(this.LLJILJIL);
        C339190DRl.LIZLLL(this.LLJILJILJ);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        EnumC1163260gNQ enumC1163260gNQ;
        super.onViewCreated(view);
        C1157390gDx c1157390gDx = (C1157390gDx) this.LLJJL.getValue();
        if (c1157390gDx == null || (enumC1163260gNQ = c1157390gDx.LL) == null) {
            enumC1163260gNQ = EnumC1163260gNQ.DEFAULT;
        }
        this.LLJJLIIIJLLLLLLLZ = enumC1163260gNQ;
        this.LLIZLLLIL = (TuxSpinner) view.findViewById(R.id.nl1);
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.nnp);
        ViewStub viewStub = null;
        if (frameLayout != null) {
            frameLayout.setOnTouchListener((View.OnTouchListener) this.LLLFF.getValue());
        } else {
            frameLayout = null;
        }
        this.LLJ = frameLayout;
        this.LLJI = (FrameLayout) view.findViewById(R.id.wq8);
        Go().LIZJ(new InterfaceC1483820oiS() { // from class: X.0hPB
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

            @Override // X.InterfaceC1483820oiS
            public final HashMap getParams() {
                return new HashMap();
            }

            @Override // X.InterfaceC1483820oiS
            public final FrameLayout getPlayViewContainer() {
                return this.LL.LLJI;
            }
        });
        Go().LJIIZILJ((C1202810hPD) this.LLL.getValue());
        FrameLayout frameLayout2 = this.LLJI;
        if (frameLayout2 != null) {
            int childCount = frameLayout2.getChildCount();
            for (int i = 0; i < childCount; i++) {
                frameLayout2.getChildAt(i).setOnTouchListener((View.OnTouchListener) this.LLLFF.getValue());
            }
        }
        this.LLJIJIL = (TuxTextView) view.findViewById(R.id.title);
        FrameLayout frameLayout3 = (FrameLayout) view.findViewById(R.id.d7i);
        C786410Ut5.O7(frameLayout3, new ACListenerS121S0200000_18(this, frameLayout3, 5));
        C0DJW c0djw = new C0TVI() { // from class: X.0DJW
            @Override // X.C0TVI
            public final C20246014Ju onApplyWindowInsets(View view2, C20246014Ju c20246014Ju) {
                view2.setPadding(view2.getPaddingLeft(), view2.getPaddingTop(), view2.getPaddingRight(), c20246014Ju.LIZ(7).LIZLLL + view2.getPaddingBottom());
                return c20246014Ju;
            }
        };
        C14K9.LJIJJ(frameLayout3, c0djw);
        this.LLJILJILJ = frameLayout3;
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.kl2);
        if (linearLayout != null) {
            C14K9.LJIJJ(linearLayout, c0djw);
        } else {
            linearLayout = null;
        }
        this.LLJILJIL = linearLayout;
        ViewStub viewStub2 = (ViewStub) view.findViewById(R.id.white_noise_timer);
        if (viewStub2 != null) {
            C14K9.LJIJJ(viewStub2, c0djw);
            viewStub = viewStub2;
        }
        this.LLJILLL = viewStub;
        TuxNavBar tuxNavBar = (TuxNavBar) view.findViewById(R.id.y08);
        if (tuxNavBar != null) {
            C0OM1 c0om1 = new C0OM1();
            C1251150ifB c1251150ifB = new C1251150ifB();
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_chevron_left_offset_ltr;
            c419910GdJ.LJ = Integer.valueOf(R.attr.zi);
            c1251150ifB.LIZLLL();
            c1251150ifB.LJ = c419910GdJ;
            c1251150ifB.LIZJ(new AwS562S0100000_18(this, 157));
            c0om1.LJ(c1251150ifB);
            tuxNavBar.setNavActions(c0om1);
            tuxNavBar.setNavBackground(0);
        }
        Lo("onViewCreated");
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("sound_type", this.LLJJLIIIJLLLLLLLZ.getValue());
        C20684815ws.LJIILLIIL("enter_wellbeinghub_whitenoise", c2344009Gk.LIZ);
    }
}
