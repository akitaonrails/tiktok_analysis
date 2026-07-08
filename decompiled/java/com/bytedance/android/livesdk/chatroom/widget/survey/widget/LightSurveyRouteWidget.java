package com.bytedance.android.livesdk.chatroom.widget.survey.widget;

import X.C0IJT;
import X.C0IK2;
import X.C13LQ;
import X.C1954807lC;
import X.C2097908Jt;
import X.C474500IjA;
import X.C786410Ut5;
import X.CountDownTimerC521500Kcm;
import Y.ACListenerS142S0100000_7;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.android.livesdk.chatroom.widget.survey.event.LightSurveyRouteEvent;
import com.bytedance.android.livesdk.chatroom.widget.survey.feedback.LightSurveyFeedbackSheet;
import com.bytedance.android.livesdk.survey.fullscreenstyle.InnerSurveyViewModel;
import com.bytedance.android.livesdk.survey.model.SurveyData;
import com.bytedance.android.livesdk.survey.model.SurveyQuestion;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.RecycleSource;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class LightSurveyRouteWidget extends LightSurveyAvoidWidget {
    public InnerSurveyViewModel LLILLL;
    public CountDownTimerC521500Kcm LLILZ;
    public long LLILZIL;
    public boolean LLILZLL;
    public LightSurveyFeedbackSheet LLIZ;
    public boolean LLIZLLLIL;
    public int LLJ;
    public TuxTextView LLJI;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.h62;
    }

    @Override // com.bytedance.android.livesdk.chatroom.widget.survey.widget.LightSurveyAvoidWidget, com.bytedance.ies.sdk.widgets.AnimatableRecyclableWidget, com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void hide() {
        if (isShowing()) {
            CountDownTimerC521500Kcm countDownTimerC521500Kcm = this.LLILZ;
            if (countDownTimerC521500Kcm != null) {
                countDownTimerC521500Kcm.cancel();
            }
            this.LLILZLL = false;
            cancelShowAnimation();
            cancelHideAnimation();
            animateHide();
            this.LLIZLLLIL = false;
            InnerSurveyViewModel innerSurveyViewModel = this.LLILLL;
            if (innerSurveyViewModel != null) {
                Map mapLIZJ = C2097908Jt.LIZJ(new Pair("exit_method", String.valueOf(this.LLJ)));
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_survey_submit_toast_notify");
                innerSurveyViewModel.GQ2(c474500IjALIZ);
                c474500IjALIZ.LJIIIIZZ();
                c474500IjALIZ.LJJIIZI(mapLIZJ);
                c474500IjALIZ.LIZ();
            }
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        if (isShowing()) {
            return;
        }
        CountDownTimerC521500Kcm countDownTimerC521500Kcm = this.LLILZ;
        if (countDownTimerC521500Kcm != null) {
            countDownTimerC521500Kcm.cancel();
        }
        this.LLILZLL = false;
        cancelShowAnimation();
        cancelHideAnimation();
        animateShow();
    }

    public final void z1() {
        SurveyData surveyData;
        Boolean boolX1 = x1();
        if (Intrinsics.LJFF(boolX1, Boolean.TRUE)) {
            if (isShowing()) {
                this.LLJ = 4;
                hide();
                DataChannel dataChannel = this.dataChannel;
                InnerSurveyViewModel innerSurveyViewModel = this.LLILLL;
                C0IK2.LIZ(dataChannel, 11, (innerSurveyViewModel == null || (surveyData = innerSurveyViewModel.LL) == null) ? null : surveyData.surveyId, null, null);
                return;
            }
            return;
        }
        if (Intrinsics.LJFF(boolX1, Boolean.FALSE)) {
            CountDownTimerC521500Kcm countDownTimerC521500Kcm = this.LLILZ;
            if (countDownTimerC521500Kcm != null) {
                countDownTimerC521500Kcm.cancel();
            }
            this.LLILZLL = false;
            return;
        }
        if (boolX1 != null) {
            throw new C1954807lC();
        }
        if (this.LLIZLLLIL) {
            show();
            if (this.LLILZLL) {
                return;
            }
            CountDownTimerC521500Kcm countDownTimerC521500Kcm2 = new CountDownTimerC521500Kcm(this.LLILZIL, this, 2);
            this.LLILZ = countDownTimerC521500Kcm2;
            countDownTimerC521500Kcm2.start();
            this.LLILZLL = true;
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        this.LLJI = (TuxTextView) findViewById(R.id.sd2);
    }

    @Override // com.bytedance.android.livesdk.chatroom.widget.survey.widget.LightSurveyAvoidWidget, com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget
    public final void onUnload(RecycleSource recycleSource) {
        super.onUnload(recycleSource);
        this.LLJ = 3;
        hide();
        LightSurveyFeedbackSheet lightSurveyFeedbackSheet = this.LLIZ;
        if (lightSurveyFeedbackSheet != null) {
            lightSurveyFeedbackSheet.yx(C2097908Jt.LIZJ(new Pair("exit_method", "leave")));
        }
        this.LLJ = 0;
        this.LLIZLLLIL = false;
    }

    @Override // com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget
    public final void onLoad(RecycleSource recycleSource, Object[] objArr) {
        SurveyData surveyData;
        List<SurveyQuestion> list;
        Object objLJJIFFI = null;
        if (objArr != null) {
            objLJJIFFI = C13LQ.LJJIFFI(objArr);
        }
        if ((objLJJIFFI instanceof SurveyData) && (surveyData = (SurveyData) objLJJIFFI) != null && (list = surveyData.questionList) != null && !list.isEmpty()) {
            InnerSurveyViewModel innerSurveyViewModel = (InnerSurveyViewModel) new ViewModelProvider(this.widgetCallback.getFragment()).get(InnerSurveyViewModel.class);
            DataChannel dataChannel = this.dataChannel;
            SurveyQuestion surveyQuestionLIZ = surveyData.LIZ();
            DataChannel dataChannel2 = innerSurveyViewModel.getDataChannel();
            if (dataChannel2 != null) {
                dataChannel = dataChannel2;
            }
            innerSurveyViewModel.setDataChannel(dataChannel);
            SurveyData surveyData2 = innerSurveyViewModel.LL;
            if (surveyData2 != null) {
                surveyData = surveyData2;
            }
            innerSurveyViewModel.LL = surveyData;
            SurveyQuestion surveyQuestion = innerSurveyViewModel.LLILLJJLI;
            if (surveyQuestion != null) {
                surveyQuestionLIZ = surveyQuestion;
            }
            innerSurveyViewModel.LLILLJJLI = surveyQuestionLIZ;
            this.LLILLL = innerSurveyViewModel;
            this.LLILZIL = Mp4ScreenVideoLoadTimeout.CONTROL;
            TuxTextView tuxTextView = this.LLJI;
            if (tuxTextView != null) {
                tuxTextView.setText(surveyData.toastText);
            }
            View view = getView();
            if (view != null) {
                C786410Ut5.I7(new ACListenerS142S0100000_7(this, 49), view);
            }
            this.dataChannel.BQ2(this, LightSurveyRouteEvent.class, new AwS586S0100000_7(this, 95));
            y1(new AwS551S0100000_7(this, 45));
        }
    }
}
