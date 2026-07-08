package com.ss.android.ugc.mediabox;

import X.AbstractC714940S2q;
import X.C0NAP;
import X.C0R7Q;
import X.C0R7U;
import X.C0R7W;
import X.C0R7X;
import X.C1487370ooB;
import X.C20546083c;
import X.C21146717pB;
import X.C421550Gfx;
import X.C714860S2i;
import X.C714930S2p;
import X.C715000S2w;
import X.C786410Ut5;
import X.InterfaceC690370R6d;
import Y.AObjectS287S0200000_11;
import Y.AObjectS386S0100000_11;
import Y.AObserverS215S0100000_11;
import android.content.Context;
import android.content.res.Resources;
import android.os.Looper;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class MediaBoxUIService implements C0R7W {
    @Override // X.C0R7W
    public final C0NAP LIZJ() {
        return C0NAP.LJIIJJI.getValue();
    }

    @Override // X.C0R7W
    public final void LIZLLL() {
        C1487370ooB c1487370ooB = C1487370ooB.LIZ;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [X.0R6d, X.0S2i] */
    @Override // X.C0R7W
    public final C714860S2i LIZ(ViewGroup viewGroup, final C0R7Q c0r7q) {
        boolean z;
        boolean z2;
        AbstractC714940S2q abstractC714940S2q;
        AbstractC714940S2q abstractC714940S2q2;
        AbstractC714940S2q abstractC714940S2q3;
        AbstractC714940S2q abstractC714940S2q4;
        AbstractC714940S2q abstractC714940S2q5;
        C715000S2w c715000S2w = new C715000S2w(viewGroup);
        Fragment fragment = c0r7q.LIZIZ;
        View view = null;
        if (!(fragment instanceof LifecycleOwner)) {
            fragment = null;
        }
        c715000S2w.LIZIZ = fragment;
        final C714930S2p c714930S2p = new C714930S2p(c715000S2w);
        ?? r4 = new InterfaceC690370R6d(c0r7q, c714930S2p) { // from class: X.0S2i
            public final C714930S2p LIZ;
            public final C0R5Z LIZIZ = new C0R5Z();
            public final C714880S2k LIZJ;

            @Override // X.InterfaceC690370R6d
            public final void LIZ() {
                AbstractC714940S2q abstractC714940S2q6;
                C714930S2p c714930S2p2 = this.LIZ;
                if (!c714930S2p2.LIZIZ || (abstractC714940S2q6 = c714930S2p2.LJFF.get(C0S13.class)) == null) {
                    return;
                }
                C714930S2p.LJIIL(abstractC714940S2q6);
            }

            @Override // X.InterfaceC690370R6d
            public final C714880S2k LIZIZ() {
                return this.LIZJ;
            }

            @Override // X.InterfaceC690370R6d
            public final C0R5Z LIZLLL() {
                return this.LIZIZ;
            }

            @Override // X.InterfaceC690370R6d
            public final void LIZJ(C690380R6e c690380R6e) {
                AbstractC714940S2q abstractC714940S2q6;
                C714930S2p c714930S2p2 = this.LIZ;
                if (c714930S2p2.LIZIZ && (abstractC714940S2q6 = c714930S2p2.LJFF.get(C0S13.class)) != null) {
                    c714930S2p2.LIZJ(abstractC714940S2q6, c690380R6e);
                    c714930S2p2.LJIILIIL(abstractC714940S2q6, c690380R6e, false, false);
                    c714930S2p2.LIZIZ(abstractC714940S2q6, c690380R6e);
                }
            }

            {
                this.LIZ = c714930S2p;
                this.LIZJ = new C714880S2k(c0r7q.LIZLLL, c714930S2p);
            }
        };
        c715000S2w.LIZLLL = r4;
        C0R7U c0r7u = c0r7q.LJ;
        if (c0r7u != null && c0r7u.LIZ) {
            z = true;
        } else {
            z = false;
        }
        c714930S2p.LJIIIZ = z;
        if (c0r7u != null && c0r7u.LIZIZ) {
            z2 = true;
        } else {
            z2 = false;
        }
        c714930S2p.LJIIJ = z2;
        AbstractC714940S2q abstractC714940S2q6 = new AbstractC714940S2q(c0r7q) { // from class: X.0S13
            public final C0R7Q LJIIJJI;
            public final List<? extends AbstractC714940S2q> LJIIL;
            public final C714900S2m LJIILIIL;

            @Override // X.AbstractC714940S2q
            public final InterfaceC714910S2n LIZJ() {
                return this.LJIILIIL;
            }

            @Override // X.AbstractC714940S2q
            public final List<AbstractC714940S2q> LIZLLL() {
                return this.LJIIL;
            }

            /* JADX WARN: Multi-variable type inference failed */
            {
                super(-1, null);
                this.LJIIJJI = c0r7q;
                ArrayList arrayList = new ArrayList();
                arrayList.addAll((Collection) c0r7q.LIZ.getValue());
                C0R7R c0r7r = c0r7q.LIZJ;
                C0R7S c0r7s = c0r7r.LIZ;
                if (c0r7s != null && c0r7s.LIZ) {
                    C0S16 c0s16 = c0r7r.LIZIZ;
                    final C0S16 c0s162 = c0s16 == null ? new Object() { // from class: X.0S16
                    } : c0s16;
                    arrayList.add(new AbstractC714940S2q(c0s162) { // from class: X.0S14
                        public final int LJIIJJI;
                        public final C0S16 LJIIL;

                        @Override // X.AbstractC714940S2q
                        public final InterfaceC714910S2n LIZJ() {
                            final C0S16 c0s163 = this.LJIIL;
                            return new C0S34(c0s163) { // from class: X.0S33
                                public final C0S16 LJI;
                                public final C0S3G LJII = new InterfaceC1482530ogN() { // from class: X.0S3G
                                    @Override // X.InterfaceC1482530ogN
                                    public final /* synthetic */ void Au(Surface surface) {
                                    }

                                    @Override // X.InterfaceC1482530ogN
                                    public final /* synthetic */ void Gk1(C1284720jXK c1284720jXK) {
                                    }

                                    @Override // X.InterfaceC1482530ogN
                                    public final /* synthetic */ void LLZZLLIL(C1281010jRL c1281010jRL) {
                                    }

                                    @Override // X.InterfaceC1482530ogN
                                    public final /* synthetic */ void Qe2(C1700490uLv c1700490uLv) {
                                    }

                                    @Override // X.InterfaceC1482530ogN
                                    public final /* synthetic */ void VK() {
                                    }

                                    @Override // X.InterfaceC1482530ogN
                                    public final /* synthetic */ void W1(String str) {
                                    }

                                    @Override // X.InterfaceC1482530ogN
                                    public final /* synthetic */ void onBrightnessChanged(String str, float f) {
                                    }

                                    @Override // X.InterfaceC1482530ogN
                                    public final /* synthetic */ void onBufferedPercent(String str, long j, int i) {
                                    }

                                    @Override // X.InterfaceC1482530ogN
                                    public final /* synthetic */ void onBufferedTimeMs(String str, long j) {
                                    }

                                    @Override // X.InterfaceC1482530ogN
                                    public final /* synthetic */ void onBuffering(String str, boolean z3, C1480430ocz c1480430ocz) {
                                    }

                                    @Override // X.InterfaceC1482530ogN
                                    public final /* synthetic */ void onCompleteLoaded(String str, boolean z3) {
                                    }

                                    @Override // X.InterfaceC1482530ogN
                                    public final /* synthetic */ void onCrosstalkHappened(String str, List list) {
                                    }

                                    @Override // X.InterfaceC1482530ogN
                                    public final /* synthetic */ void onDecoderBuffering(String str, boolean z3, C1480430ocz c1480430ocz) {
                                    }

                                    @Override // X.InterfaceC1482530ogN
                                    public final /* synthetic */ void onFrameAboutToBeRendered(int i, long j, long j2, Map map) {
                                    }

                                    @Override // X.InterfaceC1482530ogN
                                    public final /* synthetic */ void onLiveRenderFirstFrame(String str, C1480420ocy c1480420ocy) {
                                    }

                                    @Override // X.InterfaceC1482530ogN
                                    public final /* synthetic */ void onLoopPlay(String str, int i) {
                                    }

                                    @Override // X.InterfaceC1482530ogN
                                    public final /* synthetic */ void onMaskInfoCallback(String str, C1480290ocl c1480290ocl) {
                                    }

                                    @Override // X.InterfaceC1482530ogN
                                    public final /* synthetic */ void onPausePlay(String str, C1480430ocz c1480430ocz) {
                                    }

                                    @Override // X.InterfaceC1482530ogN
                                    public final /* synthetic */ void onPlayCompleted(String str, int i) {
                                    }

                                    @Override // X.InterfaceC1482530ogN
                                    public final /* synthetic */ void onPlayCompletedFirstTime(String str, C1480430ocz c1480430ocz) {
                                    }

                                    @Override // X.InterfaceC1482530ogN
                                    public final /* synthetic */ void onPlayFailed(String str, C1481290oeN c1481290oeN, C1480430ocz c1480430ocz) {
                                    }

                                    @Override // X.InterfaceC1482530ogN
                                    public final /* synthetic */ void onPlayPause(String str) {
                                    }

                                    @Override // X.InterfaceC1482530ogN
                                    public final /* synthetic */ void onPlayPrepare(String str) {
                                    }

                                    @Override // X.InterfaceC1482530ogN
                                    public final /* synthetic */ void onPlayPrepared(String str) {
                                    }

                                    @Override // X.InterfaceC1482530ogN
                                    public final /* synthetic */ void onPlayProgressChange(String str, long j, long j2) {
                                    }

                                    @Override // X.InterfaceC1482530ogN
                                    public final /* synthetic */ void onPlayRelease(String str) {
                                    }

                                    @Override // X.InterfaceC1482530ogN
                                    public final /* synthetic */ void onPlayStop(String str, JSONObject jSONObject, C1480430ocz c1480430ocz) {
                                    }

                                    @Override // X.InterfaceC1482530ogN
                                    public final /* synthetic */ void onPlayerInternalEvent(String str, int i, JSONObject jSONObject) {
                                    }

                                    @Override // X.InterfaceC1482530ogN
                                    public final /* synthetic */ void onPlaying(String str, C1480430ocz c1480430ocz) {
                                    }

                                    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnPreRenderListener
                                    public final /* synthetic */ void onPreRenderReady(String str) {
                                        C490850JMt.LIZ(this, str);
                                    }

                                    @Override // X.InterfaceC1482530ogN
                                    public final /* synthetic */ void onPreRenderSessionMissed(String str) {
                                    }

                                    @Override // X.InterfaceC1482530ogN
                                    public final /* synthetic */ void onPreparePlay(String str, C1480430ocz c1480430ocz) {
                                    }

                                    @Override // X.InterfaceC1482530ogN
                                    public final /* synthetic */ void onRenderFirstFrame(String str, C1480420ocy c1480420ocy) {
                                    }

                                    @Override // X.InterfaceC1482530ogN
                                    public final /* synthetic */ void onResumePlay(String str, C1480430ocz c1480430ocz) {
                                    }

                                    @Override // X.InterfaceC1482530ogN
                                    public final /* synthetic */ void onRetryOnError(String str, C1481290oeN c1481290oeN) {
                                    }

                                    @Override // X.InterfaceC1482530ogN
                                    public final /* synthetic */ void onSeekEnd(String str, boolean z3) {
                                    }

                                    @Override // X.InterfaceC1482530ogN
                                    public final /* synthetic */ void onSeekStart(String str, int i, float f) {
                                    }

                                    @Override // X.InterfaceC1482530ogN
                                    public final /* synthetic */ void onSpeedChanged(String str, float f) {
                                    }

                                    @Override // X.InterfaceC1482530ogN
                                    public final /* synthetic */ void onStopPlay(String str) {
                                    }

                                    @Override // X.InterfaceC1482530ogN
                                    public final /* synthetic */ void onVideoBitrateChanged(String str, EnumC2281141EQm enumC2281141EQm, int i) {
                                    }

                                    @Override // X.InterfaceC1482530ogN
                                    public final /* synthetic */ void onVideoSecondFrame(String str) {
                                    }

                                    @Override // X.InterfaceC1482530ogN
                                    public final /* synthetic */ void tc(String str, JSONObject jSONObject) {
                                    }

                                    @Override // X.InterfaceC1482530ogN
                                    public final /* synthetic */ void uv(JSONObject jSONObject) {
                                    }

                                    @Override // X.InterfaceC1482530ogN
                                    public final void onVideoSizeChanged(String str, int i, int i2) {
                                        if (i > 0 && i2 > 0) {
                                            getClass();
                                            getClass();
                                        }
                                    }
                                };
                                public final C01GW LJIIIIZZ = C452501pT.LIZ(EnumC452301pR.NONE, new AObjectS386S0100000_11(this, 27));

                                @Override // X.C0S34, X.C0S3C
                                public final void LJII() {
                                    C714880S2k c714880S2kLIZIZ;
                                    InterfaceC1484830ok5 player;
                                    InterfaceC690370R6d interfaceC690370R6d = this.LJ;
                                    if (interfaceC690370R6d == null || (c714880S2kLIZIZ = interfaceC690370R6d.LIZIZ()) == null || (player = c714880S2kLIZIZ.getPlayer()) == null) {
                                        return;
                                    }
                                    player.LJJIIZ(this.LJII);
                                }

                                /* JADX WARN: Type inference failed for: r0v0, types: [X.0S3G] */
                                {
                                    this.LJI = c0s163;
                                }

                                @Override // X.C0S34, X.C0S3C
                                public final void LJI(InterfaceC690390R6f interfaceC690390R6f) {
                                    C714880S2k c714880S2kLIZIZ;
                                    InterfaceC1484830ok5 player;
                                    C0S3E c0s3e;
                                    super.LJI(interfaceC690390R6f);
                                    InterfaceC690370R6d interfaceC690370R6d = this.LJ;
                                    if (interfaceC690370R6d != null) {
                                        interfaceC690370R6d.LIZLLL();
                                    }
                                    if ((interfaceC690390R6f instanceof C0S3E) && (c0s3e = (C0S3E) interfaceC690390R6f) != null) {
                                        c0s3e.LIZIZ();
                                    }
                                    InterfaceC690370R6d interfaceC690370R6d2 = this.LJ;
                                    if (interfaceC690370R6d2 != null && (c714880S2kLIZIZ = interfaceC690370R6d2.LIZIZ()) != null && (player = c714880S2kLIZIZ.getPlayer()) != null) {
                                        player.LJIIZILJ(this.LJII);
                                    }
                                }
                            };
                        }

                        {
                            super(0);
                            this.LJIIJJI = R.id.qtp;
                            this.LJIIL = c0s162;
                        }

                        @Override // X.AbstractC714940S2q
                        public final View LIZIZ(Context context, ViewGroup viewGroup2) {
                            View viewFindViewById;
                            if (viewGroup2 == null || (viewFindViewById = viewGroup2.findViewById(this.LJIIJJI)) == null) {
                                return new FrameLayout(context);
                            }
                            return viewFindViewById;
                        }
                    });
                }
                C0R7S c0r7s2 = c0r7q.LIZJ.LIZ;
                if (c0r7s2 != null && c0r7s2.LIZIZ) {
                    arrayList.add(new AbstractC714940S2q() { // from class: X.0S17
                        @Override // X.AbstractC714940S2q
                        public final InterfaceC714910S2n LIZJ() {
                            return new C0S32();
                        }

                        @Override // X.AbstractC714940S2q
                        public final View LIZIZ(Context context, ViewGroup viewGroup2) {
                            C0S19 c0s19 = new C0S19(context);
                            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
                            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0s19);
                            c0s19.setLayoutParams(layoutParams);
                            return c0s19;
                        }
                    });
                }
                C0R7S c0r7s3 = c0r7q.LIZJ.LIZ;
                if (c0r7s3 != null && c0r7s3.LIZLLL) {
                    arrayList.add(new AbstractC714940S2q() { // from class: X.0S18
                        @Override // X.AbstractC714940S2q
                        public final InterfaceC714910S2n LIZJ() {
                            return new C0S3B();
                        }

                        @Override // X.AbstractC714940S2q
                        public final View LIZIZ(Context context, ViewGroup viewGroup2) {
                            ImageView imageView = new ImageView(context);
                            imageView.setId(R.id.qmw);
                            imageView.setClickable(false);
                            int iLIZ = C1618190sDB.LIZ(60);
                            int iLIZ2 = C1618190sDB.LIZ(60);
                            imageView.setImageResource(R.drawable.c5k);
                            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iLIZ, iLIZ2);
                            layoutParams.gravity = 17;
                            C786410Ut5.c6(imageView, layoutParams);
                            return imageView;
                        }
                    });
                }
                C0R7R c0r7r2 = c0r7q.LIZJ;
                C0R7S c0r7s4 = c0r7r2.LIZ;
                if (c0r7s4 != null && c0r7s4.LIZJ) {
                    final C0S3T c0s3t = c0r7r2.LIZLLL;
                    arrayList.add(new AbstractC714940S2q(c0s3t) { // from class: X.1DZ8
                        public final C0S3T LJIIJJI;

                        @Override // X.AbstractC714940S2q
                        public final boolean LIZ() {
                            return true;
                        }

                        @Override // X.AbstractC714940S2q
                        public final InterfaceC714910S2n LIZJ() {
                            return null;
                        }

                        @Override // X.AbstractC714940S2q
                        public final List<AbstractC714940S2q> LIZLLL() {
                            C0S3P c0s3p;
                            ArrayList arrayList2 = new ArrayList();
                            if (this.LJIIJJI != null) {
                                C1DZO c1dzo = new C1DZO();
                                C0S3T c0s3t2 = this.LJIIJJI;
                                c1dzo.LIZ = c0s3t2;
                                c0s3p = new C0S3P(c1dzo.LIZIZ, c0s3t2, c0s3t2.LIZLLL, c0s3t2.LIZJ) { // from class: X.0S3N
                                    public final List<AbstractC714940S2q> LJIILIIL;
                                    public final C714900S2m LJIILJJIL;

                                    @Override // X.C0S3P
                                    public final int LJFF() {
                                        this.LJIIJJI.getClass();
                                        return R.layout.emg;
                                    }

                                    @Override // X.AbstractC714940S2q
                                    public final List<AbstractC714940S2q> LIZLLL() {
                                        return this.LJIILIIL;
                                    }

                                    @Override // X.C0S3P
                                    public final InterfaceC714910S2n LJI() {
                                        return this.LJIILJJIL;
                                    }

                                    @Override // X.C0S3P, X.AbstractC714940S2q
                                    public final View LIZIZ(Context context, ViewGroup viewGroup2) {
                                        LayoutInflater layoutInflaterNe = C786410Ut5.ne(context);
                                        LJFF();
                                        View viewTd = C786410Ut5.Td(layoutInflaterNe, R.layout.emg, viewGroup2, false);
                                        ViewGroup.LayoutParams layoutParams = viewTd.getLayoutParams();
                                        if ((layoutParams instanceof ViewGroup.LayoutParams) && layoutParams != null) {
                                            layoutParams.width = -1;
                                            layoutParams.height = -1;
                                            C786410Ut5.W5(viewTd, layoutParams);
                                        }
                                        return viewTd;
                                    }

                                    {
                                        final ViewGroup.LayoutParams layoutParams = null;
                                        ArrayList arrayList3 = new ArrayList();
                                        final int i = R.id.u0k;
                                        arrayList3.add(new C0S3P(i, layoutParams, c0s3t2) { // from class: X.0S3O
                                            public final List<AbstractC714940S2q> LJIILIIL;
                                            public final C714900S2m LJIILJJIL;

                                            @Override // X.C0S3P
                                            public final int LJFF() {
                                                this.LJIIJJI.LIZ.getClass();
                                                return R.layout.emf;
                                            }

                                            @Override // X.AbstractC714940S2q
                                            public final List<AbstractC714940S2q> LIZLLL() {
                                                return this.LJIILIIL;
                                            }

                                            @Override // X.C0S3P
                                            public final InterfaceC714910S2n LJI() {
                                                return this.LJIILJJIL;
                                            }

                                            @Override // X.C0S3P, X.AbstractC714940S2q
                                            public final View LIZIZ(Context context, ViewGroup viewGroup2) {
                                                this.LJIIJJI.getClass();
                                                return super.LIZIZ(context, viewGroup2);
                                            }

                                            {
                                                ArrayList arrayList4 = new ArrayList();
                                                Iterator it2 = ((ArrayList) c0s3t2.LIZ.LJFF).iterator();
                                                while (it2.hasNext()) {
                                                    arrayList4.add(it2.next());
                                                }
                                                this.LJIILIIL = arrayList4;
                                                C714900S2m c714900S2m = new C714900S2m();
                                                c714900S2m.LJFF(new C715050S3b());
                                                c714900S2m.LJFF(new C0S3V(c0s3t2));
                                                Iterator it3 = ((ArrayList) c0s3t2.LIZ.LJ).iterator();
                                                while (it3.hasNext()) {
                                                    c714900S2m.LJFF((InterfaceC714910S2n) it3.next());
                                                }
                                                this.LJIILJJIL = c714900S2m;
                                            }
                                        });
                                        arrayList3.add(new C0S3P(c0s3t2) { // from class: X.0S3M
                                            @Override // X.AbstractC714940S2q
                                            public final void LJ() {
                                                getClass();
                                            }

                                            @Override // X.C0S3P
                                            public final int LJFF() {
                                                getClass();
                                                return R.layout.emh;
                                            }

                                            @Override // X.C0S3P
                                            public final InterfaceC714910S2n LJI() {
                                                return new C0S3L(this.LJIIJJI);
                                            }
                                        });
                                        if (list != null) {
                                            Iterator it2 = ((ArrayList) list).iterator();
                                            while (it2.hasNext()) {
                                                arrayList3.add(it2.next());
                                            }
                                        }
                                        this.LJIILIIL = arrayList3;
                                        C714900S2m c714900S2m = new C714900S2m();
                                        c714900S2m.LJFF(new C715050S3b());
                                        c714900S2m.LJFF(new C0S3F() { // from class: X.0S3c
                                            {
                                                new AObserverS215S0100000_11(this, 34);
                                            }
                                        });
                                        if (list != null) {
                                            Iterator it3 = ((ArrayList) list).iterator();
                                            while (it3.hasNext()) {
                                                c714900S2m.LJFF((InterfaceC714910S2n) it3.next());
                                            }
                                        }
                                        this.LJIILJJIL = c714900S2m;
                                    }
                                };
                            } else {
                                C1DZO c1dzo2 = new C1DZO();
                                c1dzo2.LIZIZ = R.id.qti;
                                float f = 6;
                                c1dzo2.LIZ.LIZ.LIZJ.LJFF = C814420VxA.LIZIZ(TypedValue.applyDimension(1, f, Resources.getSystem().getDisplayMetrics()));
                                c1dzo2.LIZ.LIZ.LIZJ.LIZJ.LIZIZ = C1618190sDB.LIZIZ(R.color.cb);
                                c1dzo2.LIZ.LIZ.LIZJ.LJIIIIZZ = C814420VxA.LIZIZ(TypedValue.applyDimension(1, f, Resources.getSystem().getDisplayMetrics()));
                                c1dzo2.LIZ.LIZ.LIZJ.LJIIIZ = C814420VxA.LIZIZ(TypedValue.applyDimension(1, f, Resources.getSystem().getDisplayMetrics()));
                                float f2 = 12;
                                int iLIZIZ = C814420VxA.LIZIZ(TypedValue.applyDimension(1, f2, Resources.getSystem().getDisplayMetrics()));
                                int iLIZIZ2 = C814420VxA.LIZIZ(TypedValue.applyDimension(1, f2, Resources.getSystem().getDisplayMetrics()));
                                C1DZE c1dze = c1dzo2.LIZ.LIZ.LIZJ.LIZLLL;
                                c1dze.LIZ = iLIZIZ;
                                c1dze.LIZIZ = iLIZIZ2;
                                c1dzo2.LIZ.LIZ.LIZJ.LIZLLL.LIZJ = C814420VxA.LIZIZ(TypedValue.applyDimension(1, f, Resources.getSystem().getDisplayMetrics()));
                                c1dzo2.LIZ.LIZ.LIZJ.LIZLLL.LJ = ColorProtector.parseColor("#FFFFFFFF");
                                int iLIZIZ3 = C1618190sDB.LIZIZ(R.color.ca);
                                C1DZA c1dza = c1dzo2.LIZ.LIZ.LIZJ;
                                c1dza.LIZ.LIZIZ = iLIZIZ3;
                                c1dza.LIZIZ.LIZ = 127;
                                float f3 = 4;
                                c1dzo2.LIZ.LIZ.LIZIZ.LJFF = C814420VxA.LIZIZ(TypedValue.applyDimension(1, f3, Resources.getSystem().getDisplayMetrics()));
                                c1dzo2.LIZ.LIZ.LIZIZ.LIZJ.LIZIZ = C1618190sDB.LIZIZ(R.color.cb);
                                c1dzo2.LIZ.LIZ.LIZIZ.LJIIIIZZ = C814420VxA.LIZIZ(TypedValue.applyDimension(1, f, Resources.getSystem().getDisplayMetrics()));
                                c1dzo2.LIZ.LIZ.LIZIZ.LJIIIZ = C814420VxA.LIZIZ(TypedValue.applyDimension(1, f, Resources.getSystem().getDisplayMetrics()));
                                float f4 = 8;
                                int iLIZIZ4 = C814420VxA.LIZIZ(TypedValue.applyDimension(1, f4, Resources.getSystem().getDisplayMetrics()));
                                int iLIZIZ5 = C814420VxA.LIZIZ(TypedValue.applyDimension(1, f4, Resources.getSystem().getDisplayMetrics()));
                                C1DZE c1dze2 = c1dzo2.LIZ.LIZ.LIZIZ.LIZLLL;
                                c1dze2.LIZ = iLIZIZ4;
                                c1dze2.LIZIZ = iLIZIZ5;
                                c1dzo2.LIZ.LIZ.LIZIZ.LIZLLL.LIZJ = C814420VxA.LIZIZ(TypedValue.applyDimension(1, f3, Resources.getSystem().getDisplayMetrics()));
                                int color = ColorProtector.parseColor("#FFFFFFFF");
                                C1DZA c1dza2 = c1dzo2.LIZ.LIZ.LIZIZ;
                                c1dza2.LIZLLL.LJ = color;
                                c1dza2.LIZIZ.LIZ = 127;
                                c1dzo2.LIZ.LIZ.LIZIZ.LIZ.LIZIZ = C1618190sDB.LIZIZ(R.color.ca);
                                c1dzo2.LIZ.LIZ.LIZ.LJFF = C814420VxA.LIZIZ(TypedValue.applyDimension(1, f3, Resources.getSystem().getDisplayMetrics()));
                                c1dzo2.LIZ.LIZ.LIZ.LIZJ.LIZIZ = C1618190sDB.LIZIZ(R.color.cb);
                                c1dzo2.LIZ.LIZ.LIZ.LJIIIIZZ = C814420VxA.LIZIZ(TypedValue.applyDimension(1, f, Resources.getSystem().getDisplayMetrics()));
                                c1dzo2.LIZ.LIZ.LIZ.LJIIIZ = C814420VxA.LIZIZ(TypedValue.applyDimension(1, f, Resources.getSystem().getDisplayMetrics()));
                                int iLIZIZ6 = C814420VxA.LIZIZ(TypedValue.applyDimension(1, f4, Resources.getSystem().getDisplayMetrics()));
                                int iLIZIZ7 = C814420VxA.LIZIZ(TypedValue.applyDimension(1, f4, Resources.getSystem().getDisplayMetrics()));
                                C1DZE c1dze3 = c1dzo2.LIZ.LIZ.LIZ.LIZLLL;
                                c1dze3.LIZ = iLIZIZ6;
                                c1dze3.LIZIZ = iLIZIZ7;
                                c1dzo2.LIZ.LIZ.LIZ.LIZLLL.LIZJ = C814420VxA.LIZIZ(TypedValue.applyDimension(1, f3, Resources.getSystem().getDisplayMetrics()));
                                int color2 = ColorProtector.parseColor("#FFFFFFFF");
                                C1DZA c1dza3 = c1dzo2.LIZ.LIZ.LIZ;
                                c1dza3.LIZLLL.LJ = color2;
                                c1dza3.LIZIZ.LIZ = 127;
                                int iLIZIZ8 = C1618190sDB.LIZIZ(R.color.ca);
                                C0S3T c0s3t3 = c1dzo2.LIZ;
                                C1DZF c1dzf = c0s3t3.LIZ;
                                c1dzf.LIZ.LIZ.LIZIZ = iLIZIZ8;
                                c1dzf.getClass();
                                c1dzf.getClass();
                                c1dzf.getClass();
                                c1dzf.LJI = true;
                                c0s3p = new C0S3P(c1dzo2.LIZIZ, c0s3t3, c0s3t3.LIZLLL, c0s3t3.LIZJ) { // from class: X.0S3N
                                    public final List<AbstractC714940S2q> LJIILIIL;
                                    public final C714900S2m LJIILJJIL;

                                    @Override // X.C0S3P
                                    public final int LJFF() {
                                        this.LJIIJJI.getClass();
                                        return R.layout.emg;
                                    }

                                    @Override // X.AbstractC714940S2q
                                    public final List<AbstractC714940S2q> LIZLLL() {
                                        return this.LJIILIIL;
                                    }

                                    @Override // X.C0S3P
                                    public final InterfaceC714910S2n LJI() {
                                        return this.LJIILJJIL;
                                    }

                                    @Override // X.C0S3P, X.AbstractC714940S2q
                                    public final View LIZIZ(Context context, ViewGroup viewGroup2) {
                                        LayoutInflater layoutInflaterNe = C786410Ut5.ne(context);
                                        LJFF();
                                        View viewTd = C786410Ut5.Td(layoutInflaterNe, R.layout.emg, viewGroup2, false);
                                        ViewGroup.LayoutParams layoutParams = viewTd.getLayoutParams();
                                        if ((layoutParams instanceof ViewGroup.LayoutParams) && layoutParams != null) {
                                            layoutParams.width = -1;
                                            layoutParams.height = -1;
                                            C786410Ut5.W5(viewTd, layoutParams);
                                        }
                                        return viewTd;
                                    }

                                    {
                                        final ViewGroup.LayoutParams layoutParams = null;
                                        ArrayList arrayList3 = new ArrayList();
                                        final int i = R.id.u0k;
                                        arrayList3.add(new C0S3P(i, layoutParams, c0s3t3) { // from class: X.0S3O
                                            public final List<AbstractC714940S2q> LJIILIIL;
                                            public final C714900S2m LJIILJJIL;

                                            @Override // X.C0S3P
                                            public final int LJFF() {
                                                this.LJIIJJI.LIZ.getClass();
                                                return R.layout.emf;
                                            }

                                            @Override // X.AbstractC714940S2q
                                            public final List<AbstractC714940S2q> LIZLLL() {
                                                return this.LJIILIIL;
                                            }

                                            @Override // X.C0S3P
                                            public final InterfaceC714910S2n LJI() {
                                                return this.LJIILJJIL;
                                            }

                                            @Override // X.C0S3P, X.AbstractC714940S2q
                                            public final View LIZIZ(Context context, ViewGroup viewGroup2) {
                                                this.LJIIJJI.getClass();
                                                return super.LIZIZ(context, viewGroup2);
                                            }

                                            {
                                                ArrayList arrayList4 = new ArrayList();
                                                Iterator it2 = ((ArrayList) c0s3t3.LIZ.LJFF).iterator();
                                                while (it2.hasNext()) {
                                                    arrayList4.add(it2.next());
                                                }
                                                this.LJIILIIL = arrayList4;
                                                C714900S2m c714900S2m = new C714900S2m();
                                                c714900S2m.LJFF(new C715050S3b());
                                                c714900S2m.LJFF(new C0S3V(c0s3t3));
                                                Iterator it3 = ((ArrayList) c0s3t3.LIZ.LJ).iterator();
                                                while (it3.hasNext()) {
                                                    c714900S2m.LJFF((InterfaceC714910S2n) it3.next());
                                                }
                                                this.LJIILJJIL = c714900S2m;
                                            }
                                        });
                                        arrayList3.add(new C0S3P(c0s3t3) { // from class: X.0S3M
                                            @Override // X.AbstractC714940S2q
                                            public final void LJ() {
                                                getClass();
                                            }

                                            @Override // X.C0S3P
                                            public final int LJFF() {
                                                getClass();
                                                return R.layout.emh;
                                            }

                                            @Override // X.C0S3P
                                            public final InterfaceC714910S2n LJI() {
                                                return new C0S3L(this.LJIIJJI);
                                            }
                                        });
                                        if (list != null) {
                                            Iterator it2 = ((ArrayList) list).iterator();
                                            while (it2.hasNext()) {
                                                arrayList3.add(it2.next());
                                            }
                                        }
                                        this.LJIILIIL = arrayList3;
                                        C714900S2m c714900S2m = new C714900S2m();
                                        c714900S2m.LJFF(new C715050S3b());
                                        c714900S2m.LJFF(new C0S3F() { // from class: X.0S3c
                                            {
                                                new AObserverS215S0100000_11(this, 34);
                                            }
                                        });
                                        if (list != null) {
                                            Iterator it3 = ((ArrayList) list).iterator();
                                            while (it3.hasNext()) {
                                                c714900S2m.LJFF((InterfaceC714910S2n) it3.next());
                                            }
                                        }
                                        this.LJIILJJIL = c714900S2m;
                                    }
                                };
                            }
                            arrayList2.add(c0s3p);
                            return arrayList2;
                        }

                        {
                            super(R.id.qth, null);
                            this.LJIIJJI = c0s3t;
                        }

                        @Override // X.AbstractC714940S2q
                        public final View LIZIZ(Context context, ViewGroup viewGroup2) {
                            FrameLayout frameLayout = new FrameLayout(context);
                            frameLayout.setId(R.id.qti);
                            C786410Ut5.a6(frameLayout, new FrameLayout.LayoutParams(-1, -2, 80));
                            return frameLayout;
                        }
                    });
                }
                if (c0r7q.LIZJ.LIZ != null) {
                    final FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams.gravity = 17;
                    final C21385918mf c21385918mf = c0r7q.LIZJ.LIZJ;
                    arrayList.add(new AbstractC714940S2q(c21385918mf, layoutParams) { // from class: X.18me
                        public final C21385918mf LJIIJJI;

                        @Override // X.AbstractC714940S2q
                        public final boolean LIZ() {
                            return true;
                        }

                        @Override // X.AbstractC714940S2q
                        public final InterfaceC714910S2n LIZJ() {
                            C21385918mf c21385918mf2 = this.LJIIJJI;
                            return (c21385918mf2 == null || !c21385918mf2.LIZ) ? new C21386118mh(this.LJIIJJI) : new C21386018mg(this.LJIIJJI);
                        }

                        {
                            super(R.id.qt2, layoutParams);
                            this.LJIIJJI = c21385918mf;
                        }

                        @Override // X.AbstractC714940S2q
                        public final View LIZIZ(Context context, ViewGroup viewGroup2) {
                            boolean z3;
                            C21385918mf c21385918mf2 = this.LJIIJJI;
                            boolean z4 = true;
                            if (c21385918mf2 != null && c21385918mf2.LIZJ) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (z3) {
                                RelativeLayout relativeLayout = new RelativeLayout(context);
                                C786410Ut5.e6(relativeLayout, new ViewGroup.LayoutParams(-1, -1));
                                SmartImageView smartImageView = new SmartImageView(context);
                                smartImageView.setId(R.id.qtd);
                                smartImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
                                layoutParams2.addRule(13);
                                C786410Ut5.G6(smartImageView, layoutParams2);
                                smartImageView.setBackgroundResource(R.drawable.cly);
                                relativeLayout.addView(smartImageView);
                                C21385918mf c21385918mf3 = this.LJIIJJI;
                                if (c21385918mf3 != null && c21385918mf3.LJ) {
                                    ImageView imageView = new ImageView(context);
                                    imageView.setId(R.id.c4n);
                                    imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                                    RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
                                    layoutParams3.addRule(13);
                                    C786410Ut5.c6(imageView, layoutParams3);
                                    relativeLayout.addView(imageView);
                                    C786410Ut5.LJZI(8, imageView);
                                }
                                return relativeLayout;
                            }
                            if (c21385918mf2 == null || !c21385918mf2.LIZLLL) {
                                z4 = false;
                            }
                            if (z4) {
                                return C21146717pB.LIZ(context, R.layout.dl8, null);
                            }
                            View viewSd = C786410Ut5.Sd(R.layout.dl8, C786410Ut5.ne(context), null);
                            if (viewSd == null) {
                                SmartImageView smartImageView2 = new SmartImageView(context);
                                smartImageView2.setId(R.id.qtc);
                                smartImageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
                                C786410Ut5.G6(smartImageView2, new ViewGroup.LayoutParams(-1, -1));
                                C786410Ut5.LLFF(8, smartImageView2);
                                return smartImageView2;
                            }
                            return viewSd;
                        }
                    });
                }
                this.LJIIL = arrayList;
                C714900S2m c714900S2m = new C714900S2m();
                c714900S2m.LJFF(new C714870S2j(c0r7q));
                c0r7q.LIZJ.getClass();
                this.LJIILIIL = c714900S2m;
            }

            @Override // X.AbstractC714940S2q
            public final View LIZIZ(Context context, ViewGroup viewGroup2) {
                this.LJIIJJI.getClass();
                ConstraintLayout constraintLayout = new ConstraintLayout(context);
                constraintLayout.setId(R.id.qts);
                this.LJIIJJI.getClass();
                C786410Ut5.m6(constraintLayout, new ViewGroup.LayoutParams(-1, -1));
                C0R7S c0r7s = this.LJIIJJI.LIZJ.LIZ;
                if (c0r7s != null && c0r7s.LIZ) {
                    View frameLayout = new FrameLayout(context);
                    frameLayout.setId(R.id.qtp);
                    C19ME c19me = new C19ME(-1, -1);
                    c19me.leftToLeft = 0;
                    c19me.rightToRight = 0;
                    c19me.topToTop = 0;
                    c19me.bottomToBottom = 0;
                    constraintLayout.addView(frameLayout, c19me);
                }
                C0R7S c0r7s2 = this.LJIIJJI.LIZJ.LIZ;
                if (c0r7s2 != null && (c0r7s2.LIZIZ || c0r7s2.LIZLLL)) {
                    View frameLayout2 = new FrameLayout(context);
                    frameLayout2.setId(R.id.qt5);
                    constraintLayout.addView(frameLayout2, new C19ME(-1, -1));
                }
                C0R7S c0r7s3 = this.LJIIJJI.LIZJ.LIZ;
                if (c0r7s3 != null && c0r7s3.LIZJ) {
                    FrameLayout frameLayout3 = new FrameLayout(context);
                    frameLayout3.setId(R.id.qtb);
                    C19ME c19me2 = new C19ME(-1, -1);
                    c19me2.leftToLeft = 0;
                    c19me2.rightToRight = 0;
                    c19me2.topToTop = 0;
                    c19me2.bottomToBottom = 0;
                    constraintLayout.addView(frameLayout3, c19me2);
                    C0R7S c0r7s4 = this.LJIIJJI.LIZJ.LIZ;
                    if (c0r7s4 != null && c0r7s4.LIZJ) {
                        FrameLayout frameLayout4 = new FrameLayout(context);
                        frameLayout4.setId(R.id.qth);
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                        layoutParams.gravity = 81;
                        frameLayout3.addView(frameLayout4, layoutParams);
                    }
                }
                if (this.LJIIJJI.LIZJ.LIZ != null) {
                    View frameLayout5 = new FrameLayout(context);
                    frameLayout5.setId(R.id.qt2);
                    constraintLayout.addView(frameLayout5, new C19ME(-1, -1));
                }
                return constraintLayout;
            }
        };
        final Context context = viewGroup.getContext();
        if (c714930S2p.LJIIJ) {
            c714930S2p.LJI = new C421550Gfx(new BPEAHandler(), true);
            c714930S2p.LJII = new C421550Gfx(new BPEAHandler(), true);
        } else {
            C20546083c c20546083c = C20546083c.LIZ;
            c714930S2p.LJI = new C421550Gfx(C20546083c.LIZJ, false);
            c714930S2p.LJII = new C421550Gfx(c20546083c.LIZ(), false);
        }
        c714930S2p.LIZJ = abstractC714940S2q6;
        abstractC714940S2q6.LJIIIIZZ = null;
        abstractC714940S2q6.LIZLLL = abstractC714940S2q6.LIZJ();
        abstractC714940S2q6.LJIIIZ = abstractC714940S2q6.LIZLLL();
        AbstractC714940S2q abstractC714940S2q7 = c714930S2p.LIZJ;
        if (abstractC714940S2q7 == null) {
            abstractC714940S2q = null;
            abstractC714940S2q7 = null;
        } else {
            abstractC714940S2q = abstractC714940S2q7;
        }
        abstractC714940S2q.LJII = abstractC714940S2q7.LIZIZ(context, null);
        AbstractC714940S2q abstractC714940S2q8 = c714930S2p.LIZJ;
        if (abstractC714940S2q8 == null) {
            abstractC714940S2q2 = null;
        } else {
            abstractC714940S2q2 = abstractC714940S2q8;
        }
        c714930S2p.LIZLLL = abstractC714940S2q2.LJII;
        if (abstractC714940S2q8 == null) {
            abstractC714940S2q3 = null;
        } else {
            abstractC714940S2q3 = abstractC714940S2q8;
        }
        View view2 = abstractC714940S2q3.LJII;
        if (abstractC714940S2q8 == null) {
            abstractC714940S2q8 = null;
        }
        abstractC714940S2q8.LJ();
        C786410Ut5.LJLLLLLL(0, view2);
        AbstractC714940S2q abstractC714940S2q9 = c714930S2p.LIZJ;
        if (abstractC714940S2q9 == null) {
            abstractC714940S2q4 = null;
        } else {
            abstractC714940S2q4 = abstractC714940S2q9;
        }
        abstractC714940S2q4.LJFF = true;
        if (abstractC714940S2q9 == null) {
            abstractC714940S2q9 = null;
        }
        abstractC714940S2q9.getClass();
        HashMap<Class<?>, AbstractC714940S2q> map = c714930S2p.LJFF;
        AbstractC714940S2q abstractC714940S2q10 = c714930S2p.LIZJ;
        if (abstractC714940S2q10 == null) {
            abstractC714940S2q10 = null;
        }
        Class<?> cls = abstractC714940S2q10.getClass();
        AbstractC714940S2q abstractC714940S2q11 = c714930S2p.LIZJ;
        if (abstractC714940S2q11 == null) {
            abstractC714940S2q11 = null;
        }
        map.put(cls, abstractC714940S2q11);
        AbstractC714940S2q abstractC714940S2q12 = c714930S2p.LIZJ;
        if (abstractC714940S2q12 == null) {
            abstractC714940S2q5 = null;
        } else {
            abstractC714940S2q5 = abstractC714940S2q12;
        }
        if (abstractC714940S2q5.LJIIIZ != null) {
            if (abstractC714940S2q12 == null) {
                abstractC714940S2q12 = null;
            }
            for (final AbstractC714940S2q abstractC714940S2q13 : abstractC714940S2q12.LJIIIZ) {
                AbstractC714940S2q abstractC714940S2q14 = c714930S2p.LIZJ;
                if (abstractC714940S2q14 == null) {
                    abstractC714940S2q14 = null;
                }
                c714930S2p.LJII(abstractC714940S2q13, abstractC714940S2q14);
                if (c714930S2p.LJIIIZ) {
                    if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
                        c714930S2p.LIZLLL(abstractC714940S2q13);
                    } else {
                        C421550Gfx c421550Gfx = c714930S2p.LJI;
                        if (c421550Gfx == null) {
                            c421550Gfx = null;
                        }
                        c421550Gfx.LIZ(new AObjectS287S0200000_11(c714930S2p, abstractC714940S2q13, context, 3));
                    }
                } else {
                    C421550Gfx c421550Gfx2 = c714930S2p.LJII;
                    if (c421550Gfx2 == null) {
                        c421550Gfx2 = null;
                    }
                    c421550Gfx2.LIZ(new Function0() { // from class: X.0S2u
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            C714930S2p c714930S2p2 = c714930S2p;
                            AbstractC714940S2q abstractC714940S2q15 = abstractC714940S2q13;
                            Context context2 = context;
                            C421550Gfx c421550Gfx3 = c714930S2p2.LJI;
                            if (c421550Gfx3 == null) {
                                c421550Gfx3 = null;
                            }
                            c421550Gfx3.LIZ(new AObjectS287S0200000_11(c714930S2p2, abstractC714940S2q15, context2, 4));
                            return Unit.LIZ;
                        }
                    });
                }
            }
        }
        c714930S2p.LIZIZ = true;
        View view3 = c714930S2p.LIZLLL;
        if (view3 != null) {
            view = view3;
        }
        viewGroup.addView(view);
        return r4;
    }

    @Override // X.C0R7W
    public final void LIZIZ(C0R7X c0r7x, Context context) {
        if (c0r7x.LIZ) {
            C21146717pB.LIZJ(context, R.layout.dl8);
        }
    }
}
