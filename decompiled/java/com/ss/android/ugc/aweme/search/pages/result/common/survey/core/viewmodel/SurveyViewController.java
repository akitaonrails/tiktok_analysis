package com.ss.android.ugc.aweme.search.pages.result.common.survey.core.viewmodel;

import X.C01GW;
import X.C0GY9;
import X.C0R4M;
import X.C1295960jpS;
import X.C15O7;
import X.C19EG;
import X.C1C7U;
import X.C325901Of;
import X.C452501pT;
import X.C665510Q8n;
import X.C786410Ut5;
import X.InterfaceC665500Q8m;
import Y.ALAdapterS7S0100000_10;
import Y.ARunnableS79S0200000_10;
import Y.AUListenerS260S0100000_10;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.Looper;
import android.os.Message;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.discover.model.SearchSurveyConfig;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.search.pages.result.common.feedback.core.viewmodel.FeedbackHelper;
import com.ss.android.ugc.aweme.search.pages.result.common.survey.core.repo.SurveyDetailResponse;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AwS554S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SurveyViewController implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public static final /* synthetic */ int LLJJJ = 0;
    public ViewStub LL;
    public C19EG LLILLJJLI;
    public Fragment LLILLL;
    public View LLILZ;
    public View LLILZIL;
    public TextView LLILZLL;
    public ViewGroup LLIZ;
    public List<TuxIconView> LLIZLLLIL;
    public TextView LLJ;
    public View LLJI;
    public C1295960jpS LLJIJIL;
    public SearchSurveyConfig LLJILJIL = new SearchSurveyConfig();
    public SurveyDetailResponse.Data LLJILJILJ = new SurveyDetailResponse.Data(null, null);
    public final C01GW LLJILLL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 549));
    public final C01GW LLJJ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 553));
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS554S0100000_10(this, 552));
    public final C01GW LLJJIII = C452501pT.LIZIZ(new AwS554S0100000_10(this, 551));
    public final C01GW LLJJIJI = C452501pT.LIZIZ(new AwS554S0100000_10(this, 550));
    public boolean LLJJIJIIJIL;
    public int LLJJIJIL;

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(LifecycleOwner lifecycleOwner) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(LifecycleOwner lifecycleOwner) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(LifecycleOwner lifecycleOwner) {
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    public final ActionHandler LIZ() {
        return (ActionHandler) this.LLJILLL.getValue();
    }

    public final boolean LIZIZ() {
        View view = this.LLILZ;
        if (view == null) {
            return false;
        }
        if (view.getVisibility() != 0) {
            return false;
        }
        View view2 = this.LLILZ;
        return (view2 != null ? view2 : null).getAlpha() == 1.0f;
    }

    public final void LIZLLL() {
        View view = this.LLILZ;
        if (view != null) {
            if (view == null) {
                view = null;
            }
            C786410Ut5.LJLLLLLL(8, view);
        }
        SAFHelper sAFHelper = SAFHelper.LIZ;
        Fragment fragment = this.LLILLL;
        C19EG c19eg = this.LLILLJJLI;
        if (c19eg == null) {
            c19eg = null;
        }
        sAFHelper.getClass();
        LifecycleOwner lifecycleOwnerLJIJJ = SAFHelper.LJIJJ(fragment, c19eg);
        this.LLJJIJIIJIL = false;
        this.LLJJIJIL = 0;
        LIZ().removeCallbacksAndMessages(null);
        LIZ().post(new ARunnableS79S0200000_10(lifecycleOwnerLJIJJ, (SurveyViewModel) this.LLJJ.getValue(), 30));
        Fragment fragment2 = this.LLILLL;
        C19EG c19eg2 = this.LLILLJJLI;
        C19EG c19eg3 = c19eg2 != null ? c19eg2 : null;
        sAFHelper.getClass();
        C325901Of.LJ(SAFHelper.LJIJJ(fragment2, c19eg3), this);
    }

    public static final class ActionHandler extends BPEAHandler {
        public final WeakReference<SurveyViewController> LL;

        public ActionHandler(SurveyViewController surveyViewController) {
            super(Looper.getMainLooper());
            this.LL = new WeakReference<>(surveyViewController);
        }

        public final void LJ(int i) {
            SearchSurveyConfig searchSurveyConfig;
            SurveyViewController surveyViewController = this.LL.get();
            if (surveyViewController != null && (searchSurveyConfig = surveyViewController.LLJILJIL) != null) {
                long submitResultDelay = searchSurveyConfig.getSubmitResultDelay();
                removeMessages(2);
                removeMessages(3);
                sendMessageDelayed(obtainMessage(3, Integer.valueOf(i)), TimeUnit.SECONDS.toMillis(submitResultDelay));
            }
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            SurveyViewController surveyViewController;
            C1C7U.LIZ("SurveyViewController$ActionHandler@723.handleMessage");
            int i = message.what;
            Integer num = null;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4 && (surveyViewController = this.LL.get()) != null) {
                            int iIntValue = ((Integer) HandlerHook.getMessageObj(message.obj)).intValue();
                            FeedbackHelper feedbackHelper = FeedbackHelper.LIZ;
                            C19EG c19eg = surveyViewController.LLILLJJLI;
                            if (c19eg == null) {
                                c19eg = null;
                            }
                            View view = surveyViewController.LLILZ;
                            if (view == null) {
                                view = null;
                            }
                            feedbackHelper.getClass();
                            if (!FeedbackHelper.LIZ(c19eg, view, null, true, null, "survey")) {
                                surveyViewController.LIZ().LJ(iIntValue);
                            }
                        }
                    } else {
                        Object messageObj = HandlerHook.getMessageObj(message.obj);
                        if (messageObj instanceof Integer) {
                            num = (Integer) messageObj;
                        }
                        SurveyViewController surveyViewController2 = this.LL.get();
                        if (surveyViewController2 != null) {
                            surveyViewController2.LJ(num);
                            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            valueAnimatorOfFloat.setDuration(300L);
                            valueAnimatorOfFloat.setInterpolator(C0GY9.LIZIZ(0.25f, 1.0f, 0.25f, 1.0f));
                            valueAnimatorOfFloat.addUpdateListener(new AUListenerS260S0100000_10(surveyViewController2, 5));
                            valueAnimatorOfFloat.addListener(new ALAdapterS7S0100000_10(surveyViewController2, 6));
                            valueAnimatorOfFloat.start();
                        }
                    }
                } else {
                    SurveyViewController surveyViewController3 = this.LL.get();
                    if (surveyViewController3 != null) {
                        surveyViewController3.LIZJ(0L);
                    }
                }
            } else {
                SurveyViewController surveyViewController4 = this.LL.get();
                if (surveyViewController4 != null) {
                    String surveyId = surveyViewController4.LLJILJIL.getSurveyId();
                    if (surveyId == null) {
                        surveyId = "";
                    }
                    ((InterfaceC665500Q8m) C665510Q8n.LIZ.getValue()).LIZIZ(surveyId).LJ(new C0R4M(surveyViewController4, 2), C15O7.LJIIIIZZ, null);
                }
            }
            C1C7U.LIZIZ("SurveyViewController$ActionHandler@723.handleMessage");
        }
    }

    public final void LIZJ(long j) {
        if (!LIZIZ()) {
            LIZLLL();
            return;
        }
        View view = this.LLILZ;
        View view2 = null;
        if (view == null) {
            view = null;
        }
        float height = view.getHeight();
        View view3 = this.LLILZ;
        if (view3 == null) {
            view3 = null;
        }
        float f = height + ((ViewGroup.MarginLayoutParams) view3.getLayoutParams()).bottomMargin;
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setStartDelay(j);
        animatorSet.setDuration(300L);
        animatorSet.setInterpolator(C0GY9.LIZIZ(0.25f, 1.0f, 0.25f, 1.0f));
        Animator[] animatorArr = new Animator[2];
        View view4 = this.LLILZ;
        if (view4 == null) {
            view4 = null;
        }
        animatorArr[0] = ObjectAnimator.ofFloat(view4, (Property<View, Float>) View.TRANSLATION_Y, 0.0f, f);
        View view5 = this.LLILZ;
        if (view5 != null) {
            view2 = view5;
        }
        animatorArr[1] = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f);
        animatorSet.playTogether(animatorArr);
        animatorSet.addListener(new ALAdapterS7S0100000_10(this, 2));
        animatorSet.start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0061 A[PHI: r1
      0x0061: PHI (r1v18 java.lang.String) = (r1v1 java.lang.String), (r1v19 java.lang.String) binds: [B:23:0x005f, B:21:0x005c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0139  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(java.lang.Integer r9) {
        /*
            Method dump skipped, instruction units count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.result.common.survey.core.viewmodel.SurveyViewController.LJ(java.lang.Integer):void");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner lifecycleOwner) {
        if (this.LLJJIJIIJIL && LIZIZ()) {
            this.LLJJIJIIJIL = false;
            LIZ().LJ(this.LLJJIJIL);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(LifecycleOwner lifecycleOwner) {
        View view = this.LLILZ;
        if (view == null) {
            view = null;
        }
        if (view.getVisibility() == 0) {
            LIZ().removeCallbacksAndMessages(null);
            this.LLJJIJIIJIL = true;
        }
    }
}
