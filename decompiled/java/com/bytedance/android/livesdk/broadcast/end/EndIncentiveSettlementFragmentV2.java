package com.bytedance.android.livesdk.broadcast.end;

import X.AbstractC1321260kUG;
import X.AbstractC447090Hg3;
import X.C01GW;
import X.C098200Yq;
import X.C099M;
import X.C099Q;
import X.C099R;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1119920fFW;
import X.C1295960jpS;
import X.C1300730jx9;
import X.C1322200kVm;
import X.C1325700kbQ;
import X.C15CR;
import X.C15CV;
import X.C15CW;
import X.C15CY;
import X.C15D6;
import X.C1619980sG4;
import X.C1685300txQ;
import X.C1697580uHE;
import X.C1697810uHb;
import X.C16F5;
import X.C16HK;
import X.C1836710xtd;
import X.C189200o6;
import X.C19263510Xx;
import X.C19EG;
import X.C19GS;
import X.C19ME;
import X.C20441214yg;
import X.C20480815Cc;
import X.C20481515Cj;
import X.C20481615Ck;
import X.C20481815Cm;
import X.C20482915Cx;
import X.C20533215Wg;
import X.C2187701Ajg;
import X.C2188811AlT;
import X.C2200821BBo;
import X.C2252611DEt;
import X.C445940HeC;
import X.C452501pT;
import X.C497740JfY;
import X.C786410Ut5;
import X.C822690WPb;
import X.EnumC1321560kUk;
import X.InterfaceC20481115Cf;
import X.InterfaceC20482115Cp;
import Y.ALAdapterS5S0000000_31;
import Y.ARunnableS131S0100000_31;
import Y.ARunnableS13S0301000_20;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.livesdk.broadcast.end.EndIncentiveSettlementFragmentV2;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS137S0101000_31;
import kotlin.jvm.internal.AwS610S0100000_31;
import kotlin.text.a0;
import tikcast.api.anchor_data.FinishEncourageContainer;
import tikcast.api.anchor_data.FinishEncourageStrongerContainer;

/* JADX INFO: loaded from: classes32.dex */
public final class EndIncentiveSettlementFragmentV2 extends BaseFragment implements C15D6, InterfaceC20481115Cf, InterfaceC20482115Cp {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KjcjKCswKTY4HELIOSZyo9LGsJJysaJiYpJzs6PiAfLDsnJCAhLCEnDjctLiI2JjEaew==";
    public C16F5 LL;
    public C1295960jpS LLILLJJLI;
    public C1295960jpS LLILLL;
    public FrameLayout LLILZ;
    public C16F5 LLILZIL;
    public LinearLayout LLILZLL;
    public FrameLayout LLIZ;
    public C16F5 LLIZLLLIL;
    public C1295960jpS LLJ;
    public C1295960jpS LLJI;
    public ConstraintLayout LLJIJIL;
    public C1836710xtd LLJILJIL;
    public ScrollView LLJJ;
    public C20481515Cj LLJJI;
    public FinishEncourageContainer LLJJIJI;
    public int LLJJIJIIJIL;
    public C15CR LLJJIJIL;
    public AnimatorSet LLJJJJJIL;
    public AnimatorSet LLJJJJLIIL;
    public boolean LLJL;
    public long LLJLIL;
    public boolean LLJLILLLLZIIL;
    public boolean LLJLLIL;
    public C20481815Cm LLJLLL;
    public C20480815Cc LLJZIJLIL;
    public AwS137S0101000_31 LLL;
    public long LLLFF;
    public final List<C1295960jpS> LLJILJILJ = new ArrayList();
    public final List<C1295960jpS> LLJILLL = new ArrayList();
    public C15CV LLJJIII = C15CV.STRONG_CONTAINER;
    public final int LLJJJ = 1;
    public final int LLJJJIL = 2;
    public int LLJJJJ = 0;
    public float LLJJL = 40.0f;
    public boolean LLJJLIIIJLLLLLLLZ = true;
    public final ArrayList<C20481615Ck> LLJLL = new ArrayList<>();
    public final C01GW LLJZ = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(85));
    public final List<Pair<View, Runnable>> LLLF = new ArrayList();
    public final C20482915Cx LLLFFI = new C20482915Cx(new AwS610S0100000_31(this, 94));

    @Override // X.InterfaceC20481115Cf
    public final void KL() {
    }

    @Override // X.InterfaceC20481115Cf
    public final Fragment getFragment() {
        return this;
    }

    @Override // X.InterfaceC20481115Cf
    public final void jh() {
    }

    @Override // X.InterfaceC20481115Cf
    public final void release() {
        FinishEncourageStrongerContainer finishEncourageStrongerContainer;
        int i = 0;
        for (C1295960jpS c1295960jpS : C1697810uHb.LJIIJJI(this.LLILLJJLI, this.LLILLL, this.LLJ, this.LLJI)) {
            if (c1295960jpS != null) {
                c1295960jpS.cancelAnimation();
            }
        }
        if (!this.LLJLILLLLZIIL && this.LLJJIII == C15CV.STRONG_CONTAINER) {
            FinishEncourageContainer finishEncourageContainer = this.LLJJIJI;
            Integer numValueOf = (finishEncourageContainer == null || (finishEncourageStrongerContainer = finishEncourageContainer.strongerContainer) == null) ? null : Integer.valueOf(finishEncourageStrongerContainer.type);
            PR();
            long jUptimeMillis = SystemClock.uptimeMillis() - this.LLJLIL;
            int i2 = this.LLJJIJIIJIL + 1;
            C15CY.LJIIL(finishEncourageContainer, numValueOf, jUptimeMillis, "others", i2, i2);
            this.LLJLILLLLZIIL = true;
        }
        AnimatorSet[] animatorSetArr = {null, null, this.LLJJJJJIL, this.LLJJJJLIIL};
        do {
            AnimatorSet animatorSet = animatorSetArr[i];
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            i++;
        } while (i < 4);
        this.LLJJJJJIL = null;
        this.LLJJJJLIIL = null;
        Iterator<C20481615Ck> it2 = this.LLJLL.iterator();
        while (it2.hasNext()) {
            it2.next().cancel();
        }
        this.LLJLL.clear();
        ((Handler) this.LLJZ.getValue()).removeCallbacksAndMessages(null);
        for (Pair pair : (ArrayList) this.LLLF) {
            HandlerHook.viewRemoveCallbacks((View) pair.getFirst(), (Runnable) pair.getSecond());
        }
        ((ArrayList) this.LLLF).clear();
        for (C1295960jpS c1295960jpS2 : (ArrayList) this.LLJILJILJ) {
            c1295960jpS2.cancelAnimation();
            FrameLayout frameLayoutUR = UR();
            if (frameLayoutUR != null) {
                C786410Ut5.LJJJZ(c1295960jpS2, frameLayoutUR);
            }
        }
        ((ArrayList) this.LLJILJILJ).clear();
        for (C1295960jpS c1295960jpS3 : (ArrayList) this.LLJILLL) {
            c1295960jpS3.cancelAnimation();
            FrameLayout frameLayoutUR2 = UR();
            if (frameLayoutUR2 != null) {
                C786410Ut5.LJJJZ(c1295960jpS3, frameLayoutUR2);
            }
        }
        this.LLIZ = null;
        ((ArrayList) this.LLJILLL).clear();
        C1836710xtd c1836710xtd = this.LLJILJIL;
        if (c1836710xtd != null) {
            ValueAnimator valueAnimator = c1836710xtd.LLILZIL;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            c1836710xtd.LLILZIL = null;
            AnimatorSet animatorSet2 = c1836710xtd.LLILZLL;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            c1836710xtd.LLILZLL = null;
        }
    }

    @Override // X.InterfaceC20482115Cp
    public final void LJJLIIIJLJLI() {
        if (this.LLJLIL != 0) {
            return;
        }
        this.LLJLIL = SystemClock.uptimeMillis();
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x014b A[PHI: r9 r10
      0x014b: PHI (r9v17 tikcast.api.anchor_data.FinishEncourageLOP) = 
      (r9v16 tikcast.api.anchor_data.FinishEncourageLOP)
      (r9v19 tikcast.api.anchor_data.FinishEncourageLOP)
      (r9v19 tikcast.api.anchor_data.FinishEncourageLOP)
     binds: [B:106:0x0148, B:80:0x0108, B:82:0x010e] A[DONT_GENERATE, DONT_INLINE]
      0x014b: PHI (r10v16 int) = (r10v15 int), (r10v18 int), (r10v18 int) binds: [B:106:0x0148, B:80:0x0108, B:82:0x010e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01cf A[PHI: r9 r10
      0x01cf: PHI (r9v12 tikcast.api.anchor_data.FinishEncourageLiveGoal) = 
      (r9v11 tikcast.api.anchor_data.FinishEncourageLiveGoal)
      (r9v14 tikcast.api.anchor_data.FinishEncourageLiveGoal)
      (r9v14 tikcast.api.anchor_data.FinishEncourageLiveGoal)
     binds: [B:156:0x01cc, B:130:0x018b, B:132:0x0191] A[DONT_GENERATE, DONT_INLINE]
      0x01cf: PHI (r10v11 int) = (r10v10 int), (r10v13 int), (r10v13 int) binds: [B:156:0x01cc, B:130:0x018b, B:132:0x0191] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0234 A[PHI: r9 r10
      0x0234: PHI (r9v7 tikcast.api.anchor_data.FinishEncourageLiveAchievement) = 
      (r9v6 tikcast.api.anchor_data.FinishEncourageLiveAchievement)
      (r9v9 tikcast.api.anchor_data.FinishEncourageLiveAchievement)
      (r9v9 tikcast.api.anchor_data.FinishEncourageLiveAchievement)
     binds: [B:198:0x0231, B:172:0x01f0, B:174:0x01f6] A[DONT_GENERATE, DONT_INLINE]
      0x0234: PHI (r10v6 int) = (r10v5 int), (r10v8 int), (r10v8 int) binds: [B:198:0x0231, B:172:0x01f0, B:174:0x01f6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:236:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0297 A[PHI: r9 r10
      0x0297: PHI (r9v2 tikcast.api.anchor_data.FinishEncourageDecoupling) = 
      (r9v1 tikcast.api.anchor_data.FinishEncourageDecoupling)
      (r9v4 tikcast.api.anchor_data.FinishEncourageDecoupling)
      (r9v4 tikcast.api.anchor_data.FinishEncourageDecoupling)
     binds: [B:239:0x0294, B:213:0x0253, B:215:0x0259] A[DONT_GENERATE, DONT_INLINE]
      0x0297: PHI (r10v1 int) = (r10v0 int), (r10v3 int), (r10v3 int) binds: [B:239:0x0294, B:213:0x0253, B:215:0x0259] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00dd A[PHI: r1 r8
      0x00dd: PHI (r1v21 long) = (r1v10 long), (r1v12 long), (r1v14 long), (r1v16 long), (r1v22 long) binds: [B:234:0x028b, B:193:0x0228, B:151:0x01c3, B:101:0x0140, B:58:0x00db] A[DONT_GENERATE, DONT_INLINE]
      0x00dd: PHI (r8v6 long) = (r8v1 long), (r8v2 long), (r8v3 long), (r8v4 long), (r8v7 long) binds: [B:234:0x028b, B:193:0x0228, B:151:0x01c3, B:101:0x0140, B:58:0x00db] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ea A[PHI: r9 r10
      0x00ea: PHI (r9v22 tikcast.api.anchor_data.FinishEncourageLiveJourney) = 
      (r9v21 tikcast.api.anchor_data.FinishEncourageLiveJourney)
      (r9v24 tikcast.api.anchor_data.FinishEncourageLiveJourney)
      (r9v24 tikcast.api.anchor_data.FinishEncourageLiveJourney)
     binds: [B:65:0x00e7, B:37:0x00a3, B:39:0x00a9] A[DONT_GENERATE, DONT_INLINE]
      0x00ea: PHI (r10v21 int) = (r10v20 int), (r10v23 int), (r10v23 int) binds: [B:65:0x00e7, B:37:0x00a3, B:39:0x00a9] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long PR() {
        /*
            Method dump skipped, instruction units count: 685
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.broadcast.end.EndIncentiveSettlementFragmentV2.PR():long");
    }

    public final FrameLayout UR() {
        View viewFindViewById = this.LLIZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.nrf) : null;
            this.LLIZ = (FrameLayout) viewFindViewById;
        }
        return (FrameLayout) viewFindViewById;
    }

    public final void ZR() {
        if (C15CW.LIZ[this.LLJJIII.ordinal()] == 1) {
            if (this.LLJLIL == 0) {
                this.LLJLIL = SystemClock.uptimeMillis();
            }
            C1295960jpS c1295960jpS = this.LLILLJJLI;
            if (c1295960jpS != null) {
                c1295960jpS.playAnimation();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x02cb A[PHI: r7
      0x02cb: PHI (r7v29 boolean) = (r7v28 boolean), (r7v34 boolean) binds: [B:133:0x02c9, B:116:0x0286] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02cd A[PHI: r7
      0x02cd: PHI (r7v30 boolean) = (r7v28 boolean), (r7v29 boolean), (r7v34 boolean) binds: [B:133:0x02c9, B:134:0x02cb, B:117:0x0288] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x04be  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x04c4  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x04c7 A[PHI: r2
      0x04c7: PHI (r2v48 boolean) = (r2v44 boolean), (r2v43 boolean) binds: [B:249:0x04c5, B:186:0x037c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:251:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x04db A[PHI: r2
      0x04db: PHI (r2v45 boolean) = (r2v44 boolean), (r2v43 boolean) binds: [B:249:0x04c5, B:185:0x037a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:254:0x04dd  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x04e0 A[PHI: r2
      0x04e0: PHI (r2v46 boolean) = (r2v45 boolean), (r2v48 boolean) binds: [B:253:0x04db, B:250:0x04c7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:256:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0535  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0555  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0569  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x057d  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0595  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0599  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x059b  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x059d  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x05b3  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x05c7  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x05cf  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x05d2  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x05d5  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x05e4  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x05f2  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x0643  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0645  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x0717  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x0726  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x0733  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x0749  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x074d  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x0750 A[PHI: r9
      0x0750: PHI (r9v3 boolean) = (r9v2 boolean), (r9v7 boolean) binds: [B:414:0x074e, B:394:0x0703] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:416:0x0752 A[PHI: r9
      0x0752: PHI (r9v4 boolean) = (r9v2 boolean), (r9v3 boolean), (r9v7 boolean) binds: [B:414:0x074e, B:415:0x0750, B:395:0x0705] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:423:0x0768  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x076a  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x077a  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x07ab  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x07fc  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x0808  */
    /* JADX WARN: Removed duplicated region for block: B:525:0x08fa  */
    /* JADX WARN: Removed duplicated region for block: B:562:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:569:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void bS() {
        /*
            Method dump skipped, instruction units count: 2348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.broadcast.end.EndIncentiveSettlementFragmentV2.bS():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c8 A[LOOP:2: B:53:0x00c2->B:55:0x00c8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0118 A[LOOP:3: B:85:0x0112->B:87:0x0118, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OR() {
        /*
            Method dump skipped, instruction units count: 773
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.broadcast.end.EndIncentiveSettlementFragmentV2.OR():void");
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILZ = null;
        this.LLILZIL = null;
        C20481515Cj c20481515Cj = this.LLJJI;
        if (c20481515Cj != null) {
            C20441214yg.LIZIZ("WeakContainerAnimationManager", "Releasing WeakContainerAnimationManager");
            c20481515Cj.LJFF.removeCallbacksAndMessages(null);
            c20481515Cj.LIZ();
            c20481515Cj.LJIIIIZZ = EnumC1321560kUk.CANCELLED;
            c20481515Cj.LJIIIZ = null;
            c20481515Cj.LIZIZ(false);
        }
        this.LLJJI = null;
        this.LLJJ = null;
        release();
    }

    @Override // X.InterfaceC20481115Cf
    public final boolean wt() {
        return this.LLJLILLLLZIIL;
    }

    @Override // X.InterfaceC20482115Cp
    public final void OC(Long l) {
        long jLongValue;
        Integer numValueOf;
        FinishEncourageStrongerContainer finishEncourageStrongerContainer;
        this.LLJLILLLLZIIL = true;
        Handler handler = (Handler) this.LLJZ.getValue();
        ARunnableS131S0100000_31 aRunnableS131S0100000_31 = new ARunnableS131S0100000_31(this, 31);
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 340;
        }
        C786410Ut5.LJLIIL(jLongValue, handler, aRunnableS131S0100000_31);
        C20441214yg.LIZIZ("EndIncentiveSettlementFragmentV2", "playAnimationEnd");
        if (!this.LLJLLIL) {
            FinishEncourageContainer finishEncourageContainer = this.LLJJIJI;
            if (finishEncourageContainer != null && (finishEncourageStrongerContainer = finishEncourageContainer.strongerContainer) != null) {
                numValueOf = Integer.valueOf(finishEncourageStrongerContainer.type);
            } else {
                numValueOf = null;
            }
            PR();
            long jUptimeMillis = SystemClock.uptimeMillis() - this.LLJLIL;
            int i = this.LLJJIJIIJIL + 1;
            C15CY.LJIIL(finishEncourageContainer, numValueOf, jUptimeMillis, "auto", i, i);
            this.LLJLLIL = true;
        }
    }

    public final boolean VR(View view) {
        LifecycleOwner lifecycleOwner;
        Lifecycle lifecycle;
        Lifecycle.State currentState;
        if (!isAdded() || view == null || (lifecycleOwner = ViewTreeLifecycleOwner.get(view)) == null || (lifecycle = lifecycleOwner.getLifecycle()) == null || (currentState = lifecycle.getCurrentState()) == null || !currentState.isAtLeast(Lifecycle.State.STARTED) || !view.isAttachedToWindow()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x006b A[PHI: r6
      0x006b: PHI (r6v1 boolean) = (r6v0 boolean), (r6v4 boolean) binds: [B:39:0x0069, B:22:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006d A[PHI: r6
      0x006d: PHI (r6v2 boolean) = (r6v0 boolean), (r6v1 boolean), (r6v4 boolean) binds: [B:39:0x0069, B:40:0x006b, B:23:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void WR(final tikcast.api.anchor_data.FinishEncourageLiveAchievement r11) {
        /*
            r10 = this;
            r9 = r11
            if (r9 == 0) goto L89
            java.lang.String r0 = r9.progressTitle
        L5:
            r1 = 1
            if (r0 == 0) goto L87
            boolean r0 = kotlin.text.a0.LJJJIL(r0)
            if (r0 != 0) goto L87
            r0 = 0
        Lf:
            r7 = r0 ^ 1
            if (r9 == 0) goto L85
            java.lang.String r0 = r9.finishTitle
            if (r0 == 0) goto L85
            boolean r0 = kotlin.text.a0.LJJJIL(r0)
            if (r0 != 0) goto L85
            r0 = 0
        L1e:
            r8 = r0 ^ 1
            r5 = r10
            if (r9 == 0) goto L68
            boolean r0 = r9.isLevelUp
            if (r0 != r1) goto L68
            r6 = 1
            if (r7 == 0) goto L6b
            if (r8 == 0) goto L6d
            X.16F5 r1 = r5.LL
            if (r9 == 0) goto L66
            java.lang.String r0 = r9.progressTitle
        L32:
            r5.Fx(r1, r0)
            X.16F5 r0 = r5.LL
            r5.sf(r0)
        L3a:
            if (r9 == 0) goto L64
            java.util.List<tikcast.api.anchor_data.FinishEncourageTask> r1 = r9.taskList
        L3e:
            X.15Cs r0 = X.EnumC20482415Cs.NUMBER
            r5.Z7(r1, r0)
            java.util.ArrayList<X.15Ck> r0 = r5.LLJLL
            java.util.Iterator r2 = r0.iterator()
            r4 = 0
        L4a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L91
            java.lang.Object r1 = r2.next()
            int r0 = r4 + 1
            if (r4 < 0) goto L8c
            X.15Ck r1 = (X.C20481615Ck) r1
            X.15Cq r3 = new X.15Cq
            r3.<init>()
            r1.setOnAnimationEndListener(r3)
            r4 = r0
            goto L4a
        L64:
            r1 = 0
            goto L3e
        L66:
            r0 = 0
            goto L32
        L68:
            r6 = 0
            if (r7 != 0) goto L6d
        L6b:
            if (r8 == 0) goto L3a
        L6d:
            X.16F5 r1 = r5.LLILZIL
            if (r8 == 0) goto L7e
            if (r9 == 0) goto L83
            java.lang.String r0 = r9.finishTitle
        L75:
            r5.Fx(r1, r0)
            X.16F5 r0 = r5.LLILZIL
            r5.sf(r0)
            goto L3a
        L7e:
            if (r9 == 0) goto L83
            java.lang.String r0 = r9.progressTitle
            goto L75
        L83:
            r0 = 0
            goto L75
        L85:
            r0 = 1
            goto L1e
        L87:
            r0 = 1
            goto Lf
        L89:
            r0 = 0
            goto L5
        L8c:
            X.C1697810uHb.LJIJI()
            r0 = 0
            throw r0
        L91:
            X.0jpS r4 = r5.LLILLJJLI
            if (r4 == 0) goto Lb1
            r3 = 0
            r4.loop(r3)
            Y.AUListenerS278S0100000_31 r1 = new Y.AUListenerS278S0100000_31
            r0 = 6
            r1.<init>(r5, r0)
            r4.addAnimatorUpdateListener(r1)
            java.lang.String r2 = X.C15CY.LJI(r9, r3)
            X.16Hn r1 = new X.16Hn
            r0 = 0
            r1.<init>(r5, r4, r9, r0)
            java.lang.String r0 = "tiktok_live_broadcast_demand_12"
            X.C1143680frq.LJIILL(r4, r0, r2, r3, r1)
        Lb1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.broadcast.end.EndIncentiveSettlementFragmentV2.WR(tikcast.api.anchor_data.FinishEncourageLiveAchievement):void");
    }

    @Override // X.InterfaceC20482115Cp
    public final void Ws(C1295960jpS c1295960jpS) {
        C1300730jx9 c1300730jx9;
        try {
            if (getContext() != null) {
                c1300730jx9 = new C1300730jx9();
            } else {
                c1300730jx9 = null;
            }
            c1295960jpS.setFontAssetDelegate(c1300730jx9);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void aS(boolean z) {
        C786410Ut5.LJLIIL(330L, (Handler) this.LLJZ.getValue(), new ARunnableS131S0100000_31(this, 138));
    }

    @Override // X.InterfaceC20482115Cp
    public final AnimatorSet ni(C16F5 c16f5) {
        if (c16f5 == null) {
            return null;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(c16f5, (Property<C16F5, Float>) View.ALPHA, 1.0f, 0.0f);
        objectAnimatorOfFloat.setDuration(100L);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(c16f5, (Property<C16F5, Float>) View.SCALE_X, 1.0f, 2.7f);
        objectAnimatorOfFloat2.setDuration(100L);
        objectAnimatorOfFloat2.setInterpolator(C1619980sG4.LJI());
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(c16f5, (Property<C16F5, Float>) View.SCALE_Y, 1.0f, 2.7f);
        objectAnimatorOfFloat3.setDuration(100L);
        objectAnimatorOfFloat3.setInterpolator(C1619980sG4.LJI());
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3);
        this.LLJJJJLIIL = animatorSet;
        animatorSet.start();
        return this.LLJJJJLIIL;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10502, "com/bytedance/android/livesdk/broadcast/end/EndIncentiveSettlementFragmentV2", "setUserVisibleHint", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6Thf6sjOPGmeD/kIl75NdxSKr2Dipy6sQFI7O4WOtUd0+pcuNblvSIzmDdG7OA==", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        super.setUserVisibleHint(z);
        if (z && !this.LLJJLIIIJLLLLLLLZ && !this.LLJL) {
            this.LLJL = true;
            this.LLJJJJ = this.LLJJJ;
            this.LLLFFI.LIZIZ = false;
            C786410Ut5.LJLIIL(200L, (Handler) this.LLJZ.getValue(), new ARunnableS131S0100000_31(this, 32));
        }
        C2200821BBo.LIZ.getClass();
        if (!C2200821BBo.LIZ() && C2200821BBo.LJI && z) {
            C20533215Wg.LIZ(EndIncentiveSettlementFragmentV2.class);
        }
    }

    @Override // X.InterfaceC20482115Cp
    public final void sf(C16F5 c16f5) {
        if (c16f5 == null) {
            return;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(c16f5, (Property<C16F5, Float>) View.ALPHA, 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(170L);
        objectAnimatorOfFloat.setInterpolator(C1619980sG4.LJI());
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(c16f5, (Property<C16F5, Float>) View.SCALE_X, 0.2f, 1.2f);
        objectAnimatorOfFloat2.setDuration(170L);
        objectAnimatorOfFloat2.setInterpolator(C1619980sG4.LJI());
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(c16f5, (Property<C16F5, Float>) View.SCALE_Y, 0.2f, 1.2f);
        objectAnimatorOfFloat3.setDuration(170L);
        objectAnimatorOfFloat3.setInterpolator(C1619980sG4.LJI());
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(c16f5, (Property<C16F5, Float>) View.SCALE_X, 1.2f, 1.0f);
        objectAnimatorOfFloat4.setDuration(170L);
        objectAnimatorOfFloat4.setStartDelay(170L);
        objectAnimatorOfFloat4.setInterpolator(C1619980sG4.LJI());
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(c16f5, (Property<C16F5, Float>) View.SCALE_Y, 1.2f, 1.0f);
        objectAnimatorOfFloat5.setDuration(170L);
        objectAnimatorOfFloat5.setStartDelay(170L);
        objectAnimatorOfFloat5.setInterpolator(C1619980sG4.LJI());
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3, objectAnimatorOfFloat4, objectAnimatorOfFloat5);
        animatorSet.addListener(new ALAdapterS5S0000000_31(2));
        this.LLJJJJJIL = animatorSet;
        animatorSet.start();
    }

    @Override // X.InterfaceC20482115Cp
    public final void Fx(C16F5 c16f5, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (a0.LJJIIZI(C19263510Xx.LIZ(getContext()).toString(), "en", false)) {
            if (c16f5 != null) {
                c16f5.setTextSize(1, 46.0f);
            }
            Typeface typefaceLIZIZ = C1697580uHE.LIZIZ(0.0f, 900, 12.0f, 1.0f, null, -6.0f, 100, null, 144);
            if (c16f5 != null) {
                c16f5.setTypeface(typefaceLIZIZ);
                c16f5.setText(str);
            }
            View viewFindViewById = this.LLILZ;
            if (viewFindViewById == null) {
                View view = getView();
                if (view != null) {
                    viewFindViewById = view.findViewById(R.id.v52);
                } else {
                    viewFindViewById = null;
                }
                this.LLILZ = (FrameLayout) viewFindViewById;
            }
            FrameLayout frameLayout = (FrameLayout) viewFindViewById;
            if (frameLayout != null) {
                C786410Ut5.Bb(frameLayout, -3.0f);
            }
            if (c16f5 == null) {
                return;
            }
        } else {
            SpannableString spannableString = new SpannableString(str);
            C1119920fFW.LJIIIIZZ(spannableString, 0, spannableString.length(), 17, OppoPermissionPopupMaskDelayExp.DEFAULT);
            if (c16f5 == null) {
                return;
            } else {
                c16f5.setText(spannableString);
            }
        }
        ViewTreeObserver viewTreeObserver = c16f5.getViewTreeObserver();
        if (viewTreeObserver != null) {
            ViewTreeObserver.OnPreDrawListener c16hk = new C16HK(c16f5, this, 1);
            viewTreeObserver.addOnPreDrawListener(c16hk);
            C2187701Ajg.LIZ(viewTreeObserver, c16hk, ViewTreeObserver.OnPreDrawListener.class);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x016c  */
    @Override // X.InterfaceC20482115Cp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Z7(java.util.List<tikcast.api.anchor_data.FinishEncourageTask> r25, X.EnumC20482415Cs r26) {
        /*
            Method dump skipped, instruction units count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.broadcast.end.EndIncentiveSettlementFragmentV2.Z7(java.util.List, X.15Cs):void");
    }

    @Override // X.C15D6
    public final void le(int i, View view) {
        FrameLayout frameLayoutUR;
        FinishEncourageStrongerContainer finishEncourageStrongerContainer;
        Integer numValueOf;
        C1295960jpS c1295960jpS;
        if (i == -1 || (frameLayoutUR = UR()) == null) {
            return;
        }
        FinishEncourageContainer finishEncourageContainer = this.LLJJIJI;
        if (finishEncourageContainer != null && (finishEncourageStrongerContainer = finishEncourageContainer.strongerContainer) != null && (numValueOf = Integer.valueOf(finishEncourageStrongerContainer.type)) != null && numValueOf.intValue() == 3 && (c1295960jpS = this.LLILLL) != null) {
            c1295960jpS.playAnimation();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("playTaskLottieV2 called with index: ");
        sbLIZ.append(i);
        C20441214yg.LIZIZ("EndIncentiveSettlementFragmentV2", C2188811AlT.LIZIZ(sbLIZ));
        while (((ArrayList) this.LLJILJILJ).size() <= i) {
            C1295960jpS c1295960jpS2 = new C1295960jpS(getContext());
            int i2 = (int) (((double) c1295960jpS2.getResources().getDisplayMetrics().widthPixels) * 0.92d);
            C786410Ut5.s6(c1295960jpS2, new FrameLayout.LayoutParams(i2, i2 / 6));
            frameLayoutUR.addView(c1295960jpS2);
            ((ArrayList) this.LLJILJILJ).add(c1295960jpS2);
            C1295960jpS c1295960jpS3 = new C1295960jpS(getContext());
            C786410Ut5.s6(c1295960jpS3, new FrameLayout.LayoutParams(c1295960jpS3.getResources().getDisplayMetrics().widthPixels / 2, (int) ((r3 * 95) / 196)));
            frameLayoutUR.addView(c1295960jpS3);
            ((ArrayList) this.LLJILLL).add(c1295960jpS3);
        }
        ARunnableS13S0301000_20 aRunnableS13S0301000_20 = new ARunnableS13S0301000_20(i, this, view, frameLayoutUR, 6);
        HandlerHook.viewPost(view, aRunnableS13S0301000_20);
        ((ArrayList) this.LLLF).add(new Pair(view, aRunnableS13S0301000_20));
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ScrollView scrollView;
        super.onViewCreated(view, bundle);
        this.LLIZLLLIL = (C16F5) view.findViewById(R.id.nws);
        this.LL = (C16F5) view.findViewById(R.id.wh1);
        this.LLILZIL = (C16F5) view.findViewById(R.id.y3b);
        this.LLILLJJLI = (C1295960jpS) view.findViewById(R.id.nwt);
        this.LLILLL = (C1295960jpS) view.findViewById(R.id.wf2);
        this.LLJ = (C1295960jpS) view.findViewById(R.id.xui);
        this.LLJI = (C1295960jpS) view.findViewById(R.id.iif);
        this.LLILZLL = (LinearLayout) view.findViewById(R.id.s92);
        this.LLJIJIL = (ConstraintLayout) view.findViewById(R.id.trb);
        this.LLJILJIL = (C1836710xtd) view.findViewById(R.id.fhw);
        boolean z = false;
        this.LLJJJJ = 0;
        if (this.LLJJIII == C15CV.WEAK_CONTAINER) {
            ScrollView scrollView2 = (ScrollView) view.findViewById(R.id.weak_container_scroll_view);
            this.LLJJ = scrollView2;
            if (scrollView2 != null) {
                scrollView2.setClipToPadding(true);
            }
            ScrollView scrollView3 = this.LLJJ;
            if (scrollView3 != null) {
                scrollView3.setClipChildren(true);
            }
            LinearLayout linearLayout = new LinearLayout(requireContext());
            C786410Ut5.d6(linearLayout, new LinearLayout.LayoutParams(-1, -2));
            linearLayout.setOrientation(1);
            ScrollView scrollView4 = this.LLJJ;
            if (scrollView4 != null) {
                RemoveViewCausedNPEChecker.recordViewRemovedPoint(scrollView4, null);
                scrollView4.removeAllViews();
                scrollView4.addView(linearLayout);
            }
            Context context = getContext();
            if (context != null && (scrollView = this.LLJJ) != null) {
                this.LLJJI = new C20481515Cj(context, this, scrollView, linearLayout, this.LLJZIJLIL);
            }
            ConstraintLayout constraintLayout = this.LLJIJIL;
            if (constraintLayout != null) {
                constraintLayout.setClipChildren(true);
            }
            ConstraintLayout constraintLayout2 = this.LLJIJIL;
            if (constraintLayout2 != null) {
                constraintLayout2.setClipToPadding(true);
            }
        } else {
            ConstraintLayout constraintLayout3 = this.LLJIJIL;
            if (constraintLayout3 != null) {
                constraintLayout3.setClipChildren(false);
            }
            ConstraintLayout constraintLayout4 = this.LLJIJIL;
            if (constraintLayout4 != null) {
                constraintLayout4.setClipToPadding(false);
            }
            this.LLJLLL = new C20481815Cm(this.LLILZIL, this.LL, this.LLILLJJLI, this.LLILLL, this.LLIZLLLIL, this.LLJLL, this);
        }
        if (this.LLJJLIIIJLLLLLLLZ) {
            this.LLJJJJ = this.LLJJJ;
            this.LLLFFI.LIZIZ = false;
            this.LLLFF = PR();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[duration-check] first page totalAnimationDurationMs=");
            sbLIZ.append(this.LLLFF);
            C20441214yg.LIZIZ("EndIncentiveSettlementFragmentV2", C2188811AlT.LIZIZ(sbLIZ));
            bS();
            C15CR c15cr = this.LLJJIJIL;
            if (c15cr != null) {
                long j = this.LLLFF;
                if (this.LLJJJJ == this.LLJJJIL) {
                    z = true;
                }
                c15cr.p(j, true, z);
            }
        }
    }

    public static Bitmap NR(int i, int i2, Bitmap bitmap) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        float f = i;
        float f2 = i2;
        float fMax = Math.max(f / bitmap.getWidth(), f2 / bitmap.getHeight());
        Matrix matrix = new Matrix();
        matrix.setScale(fMax, fMax);
        matrix.postTranslate((f - (bitmap.getWidth() * fMax)) / 2.0f, (f2 - (bitmap.getHeight() * fMax)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        Paint paint = new Paint(1);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f / 2.0f, f2 / 2.0f, Math.min(i, i2) / 2.0f, paint);
        return bitmapCreateBitmap;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.ghm, viewGroup, false);
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }

    public final Object SR(final int i, final int i2, String str, C445940HeC c445940HeC) {
        boolean z = true;
        final C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(c445940HeC));
        c2252611DEt.LJIJJ();
        if (str != null && !a0.LJJJIL(str)) {
            z = false;
        }
        if (z) {
            c2252611DEt.LJJIFFI(AFwS276S0000000_31.get$arr$(278), null);
        } else {
            ((AbstractC1321260kUG) C1322200kVm.LIZ().LJI(C1325700kbQ.LIZLLL(UriProtector.parse(str)).LIZ(), null)).LIZJ(new AbstractC447090Hg3() { // from class: X.15Qf
                @Override // X.C0HWE
                public final void LJ(InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> interfaceC1320200kSY) {
                    c2252611DEt.LJJIFFI(AFwS276S0000000_31.get$arr$(279), null);
                }

                @Override // X.AbstractC447090Hg3
                public final void LJI(Bitmap bitmap) {
                    Bitmap bitmapNR;
                    if (bitmap != null) {
                        try {
                            EndIncentiveSettlementFragmentV2 endIncentiveSettlementFragmentV2 = this;
                            int i3 = i;
                            int i4 = i2;
                            endIncentiveSettlementFragmentV2.getClass();
                            bitmapNR = EndIncentiveSettlementFragmentV2.NR(i3, i4, bitmap);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            bitmapNR = null;
                        }
                    } else {
                        bitmapNR = null;
                    }
                    c2252611DEt.LJJIFFI(AFwS276S0000000_31.get$arr$(280), bitmapNR);
                }
            }, C822690WPb.LIZ());
        }
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(c445940HeC);
        }
        return objLJIJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object RR(android.content.Context r7, java.lang.String r8, int r9, int r10, X.InterfaceC1364105Vn r11) {
        /*
            r6 = this;
            boolean r0 = r11 instanceof X.C445940HeC
            if (r0 == 0) goto L29
            r5 = r11
            X.0HeC r5 = (X.C445940HeC) r5
            int r2 = r5.LLILZLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L29
            int r2 = r2 - r1
            r5.LLILZLL = r2
        L12:
            java.lang.Object r4 = r5.LLILZ
            java.lang.Object r3 = X.C099R.LJFF()
            int r1 = r5.LLILZLL
            r0 = 1
            r2 = 0
            if (r1 == 0) goto L37
            if (r1 != r0) goto L2f
            int r10 = r5.LLILLL
            int r9 = r5.LLILLJJLI
            java.lang.Object r7 = r5.LL
            android.content.Context r7 = (android.content.Context) r7
            goto L49
        L29:
            X.0HeC r5 = new X.0HeC
            r5.<init>(r6, r11)
            goto L12
        L2f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L37:
            X.C155000ia.LIZIZ(r4)
            r5.LL = r7     // Catch: java.lang.Throwable -> L4f
            r5.LLILLJJLI = r9     // Catch: java.lang.Throwable -> L4f
            r5.LLILLL = r10     // Catch: java.lang.Throwable -> L4f
            r5.LLILZLL = r0     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r4 = r6.SR(r9, r10, r8, r5)     // Catch: java.lang.Throwable -> L4f
            if (r4 != r3) goto L4c
            return r3
        L49:
            X.C155000ia.LIZIZ(r4)     // Catch: java.lang.Throwable -> L4f
        L4c:
            android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4     // Catch: java.lang.Throwable -> L4f
            goto L54
        L4f:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r4 = r2
        L54:
            if (r4 == 0) goto L5d
            boolean r0 = r4.isRecycled()
            if (r0 != 0) goto L5d
            return r4
        L5d:
            android.content.res.Resources r1 = r7.getResources()     // Catch: java.lang.Throwable -> L69
            r0 = 2130974001(0x7f041531, float:1.7556813E38)
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeResource(r1, r0)     // Catch: java.lang.Throwable -> L69
            goto L6e
        L69:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r0 = r2
        L6e:
            if (r0 == 0) goto L74
            android.graphics.Bitmap r2 = NR(r9, r10, r0)
        L74:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.broadcast.end.EndIncentiveSettlementFragmentV2.RR(android.content.Context, java.lang.String, int, int, X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC20482115Cp
    public final void fi(C1295960jpS c1295960jpS, float f, float f2, float f3, float f4, float f5, boolean z, boolean z2) {
        float f6;
        float fMin;
        int i;
        int i2;
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        float f7 = displayMetrics.widthPixels;
        float f8 = displayMetrics.density;
        float f9 = f7 / f8;
        float f10 = displayMetrics.heightPixels / f8;
        if (f5 > 0.0f) {
            f6 = f10 * f5;
        } else {
            f6 = 0.0f;
        }
        if (z) {
            fMin = Math.min(f9, f2);
        } else if (f3 > 0.0f) {
            fMin = f9 - f3;
        } else if (f > 0.0f) {
            fMin = f9 * f;
            if (f2 > 0.0f) {
                fMin = Math.min(fMin, f2);
            }
        } else {
            fMin = 0.0f;
        }
        if (fMin > 0.0f) {
            i = (int) (fMin * displayMetrics.density);
        } else {
            i = 0;
        }
        if (f6 > 0.0f) {
            i2 = (int) (f6 * displayMetrics.density);
        } else {
            i2 = 0;
        }
        C19ME c19me = (C19ME) c1295960jpS.getLayoutParams();
        if (z || i > 0) {
            ((ViewGroup.MarginLayoutParams) c19me).width = i;
            ((ViewGroup.MarginLayoutParams) c19me).height = i;
        } else if (i2 > 0) {
            ((ViewGroup.MarginLayoutParams) c19me).width = -1;
            ((ViewGroup.MarginLayoutParams) c19me).height = i2;
        } else {
            ((ViewGroup.MarginLayoutParams) c19me).width = -1;
            ((ViewGroup.MarginLayoutParams) c19me).height = -2;
        }
        if (f4 > 0.0f) {
            if (z2) {
                c19me.topToTop = R.id.q2u;
                C786410Ut5.ld(c1295960jpS, (int) C497740JfY.LIZIZ(f4));
            } else {
                c19me.topToTop = -1;
                c19me.topToBottom = R.id.v52;
                ((ViewGroup.MarginLayoutParams) c19me).topMargin = (int) C497740JfY.LIZIZ(f4);
            }
        } else if (f4 < 0.0f) {
            c19me.topToTop = -1;
            c19me.topToBottom = R.id.v52;
            C786410Ut5.ld(c1295960jpS, (int) C497740JfY.LIZIZ(f4));
        } else {
            c19me.topToTop = R.id.q2u;
            ((ViewGroup.MarginLayoutParams) c19me).topMargin = 0;
        }
        C786410Ut5.s6(c1295960jpS, c19me);
        c1295960jpS.requestLayout();
    }
}
