package com.ss.android.ugc.aweme.search.pages.middlepage.voiceentrance;

import X.C01GW;
import X.C0BYH;
import X.C0BYY;
import X.C0PEM;
import X.C0QGY;
import X.C0QOB;
import X.C0QOC;
import X.C0QSJ;
import X.C13LE;
import X.C19EG;
import X.C2217381BqS;
import X.C2296808zG;
import X.C23250099c;
import X.C301180BrI;
import X.C301540Brs;
import X.C314801Jy;
import X.C337180DJs;
import X.C418440Gaw;
import X.C426750GoL;
import X.C452501pT;
import X.C657990PrR;
import X.C667510QGf;
import X.C669990QPt;
import X.C679340Qkm;
import X.C687700QyG;
import X.C724240Sb0;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1146704e9;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.InterfaceC670010QPv;
import Y.ACListenerS145S0100000_10;
import Y.AObserverS214S0100000_10;
import android.view.View;
import android.view.ViewStub;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.tux.widget.RadiusLayout;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.search.middle.SearchResultFragmentScope;
import com.ss.android.ugc.aweme.search.middle.SearchStartViewModel;
import com.ss.android.ugc.aweme.search.pages.middlepage.voiceentrance.VoiceFloatingButtonAssem;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS589S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class VoiceFloatingButtonAssem extends UIContentAssem implements InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLIL;
    public SearchStartViewModel LLJILJILJ;
    public RadiusLayout LLJILLL;
    public float LLJJ;
    public boolean LLJJIJI;
    public boolean LLJJIJIL;
    public boolean LLJJJ;
    public boolean LLJJJIL;
    public boolean LLJJJJJIL;
    public volatile C0QOB LLJJL;
    public InterfaceC665370Q7z LLJJLIIIJLLLLLLLZ;
    public C0QSJ LLJL;
    public final int LLIZLLLIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(46));
    public final int LLJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(80));
    public final int LLJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 393));
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 392));
    public float LLJJI = -1.0f;
    public final C01GW LLJJIII = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(279));
    public int LLJJIJIIJIL = 1;
    public final C01GW LLJJJJ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(280));
    public final C0QOC LLJJJJLIIL = new InterfaceC670010QPv() { // from class: X.0QOC
        @Override // X.InterfaceC670010QPv
        public final void LIZ(C669990QPt c669990QPt) {
            float fGo;
            VoiceFloatingButtonAssem voiceFloatingButtonAssem = this.LIZ;
            voiceFloatingButtonAssem.LLJJJJJIL = false;
            if (!voiceFloatingButtonAssem.Jo()) {
                if (c669990QPt.LIZ) {
                    fGo = this.LIZ.Go() + c669990QPt.LIZIZ;
                } else {
                    fGo = this.LIZ.LLJ;
                }
                RadiusLayout radiusLayout = this.LIZ.LLJILLL;
                if (radiusLayout != null) {
                    C786410Ut5.yd(radiusLayout, -fGo);
                }
            }
            this.LIZ.No();
        }

        @Override // X.InterfaceC670010QPv
        public final void LIZIZ(C669990QPt c669990QPt) {
            int iGo;
            VoiceFloatingButtonAssem voiceFloatingButtonAssem;
            RadiusLayout radiusLayout;
            VoiceFloatingButtonAssem voiceFloatingButtonAssem2;
            RadiusLayout radiusLayout2;
            VoiceFloatingButtonAssem voiceFloatingButtonAssem3 = this.LIZ;
            if (c669990QPt.LIZ) {
                if (voiceFloatingButtonAssem3.Jo() && (radiusLayout2 = (voiceFloatingButtonAssem2 = this.LIZ).LLJILLL) != null) {
                    C786410Ut5.yd(radiusLayout2, -voiceFloatingButtonAssem2.LLJI);
                }
                iGo = this.LIZ.Go() + c669990QPt.LIZIZ;
            } else {
                if (voiceFloatingButtonAssem3.Jo() && (radiusLayout = (voiceFloatingButtonAssem = this.LIZ).LLJILLL) != null) {
                    C786410Ut5.yd(radiusLayout, -voiceFloatingButtonAssem.LLJ);
                }
                iGo = this.LIZ.LLJ;
            }
            voiceFloatingButtonAssem3.LLJJI = iGo;
            VoiceFloatingButtonAssem voiceFloatingButtonAssem4 = this.LIZ;
            voiceFloatingButtonAssem4.LLJJJ = c669990QPt.LIZ;
            voiceFloatingButtonAssem4.LLJJJIL = true;
            voiceFloatingButtonAssem4.No();
        }

        @Override // X.InterfaceC670010QPv
        public final void LIZJ(C669990QPt c669990QPt) {
            float translationY;
            float f;
            RadiusLayout radiusLayout = this.LIZ.LLJILLL;
            if (radiusLayout != null) {
                translationY = radiusLayout.getTranslationY();
            } else {
                translationY = 0.0f;
            }
            VoiceFloatingButtonAssem voiceFloatingButtonAssem = this.LIZ;
            if (c669990QPt.LIZ) {
                f = -translationY;
            } else {
                f = voiceFloatingButtonAssem.LLJ;
            }
            voiceFloatingButtonAssem.LLJJ = f;
        }

        @Override // X.InterfaceC670010QPv
        public final void onProgress(float f) {
            VoiceFloatingButtonAssem voiceFloatingButtonAssem = this.LIZ;
            voiceFloatingButtonAssem.LLJJJJJIL = true;
            if (!voiceFloatingButtonAssem.Jo()) {
                VoiceFloatingButtonAssem voiceFloatingButtonAssem2 = this.LIZ;
                float f2 = (voiceFloatingButtonAssem2.LLJJ * (1 - f)) + (voiceFloatingButtonAssem2.LLJJI * f);
                RadiusLayout radiusLayout = voiceFloatingButtonAssem2.LLJILLL;
                if (radiusLayout != null) {
                    C786410Ut5.yd(radiusLayout, -f2);
                }
            }
        }
    };

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(VoiceFloatingButtonAssem.class, "searchKeyboardMonitorAbility", "getSearchKeyboardMonitorAbility()Lcom/ss/android/ugc/aweme/search/common/keyboard/listener/ability/SearchKeyboardMonitorAbility;", 0);
        C13LE.LIZ.getClass();
        LLJLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{SearchResultFragmentScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SearchResultFragmentScope.class);
        return arrayList;
    }

    public final int Go() {
        return ((Number) this.LLJILJIL.getValue()).intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0029 A[Catch: all -> 0x0035, PHI: r1
      0x0029: PHI (r1v1 X.0QSJ) = (r1v0 X.0QSJ), (r1v3 X.0QSJ) binds: [B:8:0x000b, B:13:0x0025] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {, blocks: (B:5:0x0005, B:7:0x0009, B:9:0x000d, B:11:0x0011, B:12:0x0017, B:16:0x0031, B:17:0x0033, B:15:0x0029), top: B:24:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C0QOB Ho() {
        /*
            r4 = this;
            X.0QOB r0 = r4.LLJJL
            if (r0 != 0) goto L39
            monitor-enter(r4)
            X.0QOB r0 = r4.LLJJL     // Catch: java.lang.Throwable -> L35
            if (r0 != 0) goto L38
            X.0QSJ r1 = r4.LLJL     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L29
            X.0Q7z r3 = r4.LLJJLIIIJLLLLLLLZ     // Catch: java.lang.Throwable -> L35
            if (r3 != 0) goto L17
            X.0Q7z r3 = X.C687700QyG.LJIIIZ(r4)     // Catch: java.lang.Throwable -> L35
            r4.LLJJLIIIJLLLLLLLZ = r3     // Catch: java.lang.Throwable -> L35
        L17:
            r0 = 1
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L35
            java.lang.Class<com.ss.android.ugc.aweme.search.middle.SearchResultFragmentScope> r1 = com.ss.android.ugc.aweme.search.middle.SearchResultFragmentScope.class
            r0 = 0
            r2[r0] = r1     // Catch: java.lang.Throwable -> L35
            X.0QSJ r1 = X.C687700QyG.LIZLLL(r3, r2)     // Catch: java.lang.Throwable -> L35
            r4.LLJL = r1     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L29
            r0 = 0
            goto L31
        L29:
            java.lang.Class<X.0QOB> r0 = X.C0QOB.class
            java.lang.Object r0 = r1.getAbility(r0)     // Catch: java.lang.Throwable -> L35
            X.0QOB r0 = (X.C0QOB) r0     // Catch: java.lang.Throwable -> L35
        L31:
            r4.LLJJL = r0     // Catch: java.lang.Throwable -> L35
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L35
            return r0
        L35:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L38:
            monitor-exit(r4)
        L39:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.middlepage.voiceentrance.VoiceFloatingButtonAssem.Ho():X.0QOB");
    }

    public final boolean Jo() {
        return ((Boolean) this.LLJJJJ.getValue()).booleanValue();
    }

    public final void No() {
        RadiusLayout radiusLayout;
        if (this.LLJJIJIIJIL == 1) {
            int i = C667510QGf.LIZ[((C0QGY) this.LLJJIII.getValue()).ordinal()];
            if (i == 1) {
                if (!C0BYY.LIZ(false) || (radiusLayout = this.LLJILLL) == null) {
                    return;
                }
                Lo(radiusLayout);
                return;
            }
            if (i != 2) {
                RadiusLayout radiusLayout2 = this.LLJILLL;
                if (radiusLayout2 != null) {
                    C337180DJs.LIZ(radiusLayout2);
                    this.LLJJIJI = false;
                    return;
                }
                return;
            }
            if (this.LLJJJ && C0BYY.LIZ(false)) {
                RadiusLayout radiusLayout3 = this.LLJILLL;
                if (radiusLayout3 != null) {
                    Lo(radiusLayout3);
                    return;
                }
                return;
            }
            RadiusLayout radiusLayout4 = this.LLJILLL;
            if (radiusLayout4 != null) {
                C337180DJs.LIZ(radiusLayout4);
                this.LLJJIJI = false;
            }
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C0QOB c0qobHo = Ho();
        if (c0qobHo != null) {
            c0qobHo.S0(this.LLJJJJLIIL);
        }
    }

    public final void Lo(View view) throws Throwable {
        C337180DJs.LIZJ(view);
        if (!this.LLJJIJI || this.LLJJIJIL) {
            AwS554S0100000_10 awS554S0100000_10 = new AwS554S0100000_10(this, 926);
            if (!C301180BrI.LIZ() && !C0BYH.LIZ()) {
                awS554S0100000_10.invoke();
            } else {
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C314801Jy(awS554S0100000_10, null), 3);
            }
            this.LLJJIJIL = false;
        }
        this.LLJJIJI = true;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        View viewLJLLLL;
        C0QOB c0qobHo;
        C669990QPt c669990QPtRf;
        float fGo;
        NextLiveData<Integer> nextLiveDataXQ2;
        ViewStub viewStub;
        super.onViewCreated(view);
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            this.LLJILJILJ = (SearchStartViewModel) C679340Qkm.LIZIZ(C724240Sb0.LJI(this), c19egLIZ).get(SearchStartViewModel.class);
        }
        View viewLJJIJL = LJJIJL();
        RadiusLayout radiusLayout = null;
        if ((viewLJJIJL instanceof ViewStub) && (viewStub = (ViewStub) viewLJJIJL) != null) {
            C657990PrR.LIZJ(viewStub, new AwS589S0100000_10(this, 377));
            viewStub.setLayoutResource(R.layout.eym);
            viewLJLLLL = C786410Ut5.LJLLLL(viewStub);
        } else {
            viewLJLLLL = null;
        }
        if (viewLJLLLL instanceof RadiusLayout) {
            radiusLayout = (RadiusLayout) viewLJLLLL;
        }
        this.LLJILLL = radiusLayout;
        if (radiusLayout != null) {
            radiusLayout.findViewById(R.id.voice_icon);
        }
        RadiusLayout radiusLayout2 = this.LLJILLL;
        if (radiusLayout2 != null) {
            radiusLayout2.setRadius(this.LLIZLLLIL / 2.0f);
            C426750GoL.LJIIIZ(radiusLayout2, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), null, false, 27);
            C786410Ut5.yd(radiusLayout2, -this.LLJ);
        }
        SearchStartViewModel searchStartViewModel = this.LLJILJILJ;
        if (searchStartViewModel != null && (nextLiveDataXQ2 = searchStartViewModel.xQ2()) != null) {
            nextLiveDataXQ2.observe(this, new AObserverS214S0100000_10(this, 88), true);
        }
        RadiusLayout radiusLayout3 = this.LLJILLL;
        if (radiusLayout3 != null) {
            C786410Ut5.p9(radiusLayout3, new ACListenerS145S0100000_10(this, 40));
        }
        if (((Number) C301540Brs.LIZ.getValue()).intValue() > 0 && !this.LLJJJJJIL && (c0qobHo = Ho()) != null && (c669990QPtRf = c0qobHo.Rf()) != null && c669990QPtRf.LIZ && c669990QPtRf.LIZIZ > 0) {
            RadiusLayout radiusLayout4 = this.LLJILLL;
            if (radiusLayout4 != null && radiusLayout4.getVisibility() == 0) {
                return;
            }
            if (!Jo()) {
                if (c669990QPtRf.LIZ) {
                    fGo = Go() + c669990QPtRf.LIZIZ;
                } else {
                    fGo = this.LLJ;
                }
                RadiusLayout radiusLayout5 = this.LLJILLL;
                if (radiusLayout5 != null) {
                    C786410Ut5.yd(radiusLayout5, -fGo);
                }
            }
            No();
        }
    }
}
