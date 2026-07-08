package com.bytedance.android.livesdk.chatroom.widget;

import X.C01GW;
import X.C1203370hQ7;
import X.C16F5;
import X.C2188811AlT;
import X.C452501pT;
import X.C786410Ut5;
import Y.ACListenerS142S0100000_7;
import Y.AObjectS309S0200000_7;
import Y.ARunnableS107S0100000_7;
import android.os.Handler;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.livesetting.watchlive.LightSurveyDelayConfig;
import com.bytedance.android.livesdk.survey.fullscreenstyle.InnerSurveyViewModel;
import com.bytedance.android.livesdk.survey.model.SurveyData;
import com.bytedance.android.livesdk.survey.model.SurveyOption;
import com.bytedance.android.livesdk.survey.model.SurveyQuestion;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.AFwS193S0000000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class RealTimeSurveyStarCardWidget extends RealTimeSurveyCardParentWidget {
    public C16F5 LLJ;
    public LiveIconView LLJI;
    public C1203370hQ7 LLJIJIL;
    public boolean LLJILJILJ;
    public boolean LLJILLL;
    public final C01GW LLJILJIL = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(40));
    public final ARunnableS107S0100000_7 LLJJ = new ARunnableS107S0100000_7(this, 70);
    public final ARunnableS107S0100000_7 LLJJI = new ARunnableS107S0100000_7(this, 69);

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.hkk;
    }

    @Override // com.bytedance.android.livesdk.chatroom.widget.RealTimeSurveyCardParentWidget, com.bytedance.android.livesdk.chatroom.widget.survey.widget.LightSurveyAvoidWidget, com.bytedance.ies.sdk.widgets.AnimatableRecyclableWidget, com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final long E1() {
        SurveyData surveyData;
        Long lValueOf;
        InnerSurveyViewModel innerSurveyViewModel = this.LLILZIL;
        if (innerSurveyViewModel == null || (surveyData = innerSurveyViewModel.LL) == null || (lValueOf = Long.valueOf(surveyData.surveyVersion)) == null) {
            return 0L;
        }
        if (lValueOf.longValue() == 4) {
            return 1000L;
        }
        if (lValueOf.longValue() == 5) {
            return LightSurveyDelayConfig.INSTANCE.delay();
        }
        return 0L;
    }

    @Override // com.bytedance.android.livesdk.chatroom.widget.RealTimeSurveyCardParentWidget
    public final void z1() {
        SurveyQuestion surveyQuestion;
        Map<Long, String> map;
        InnerSurveyViewModel innerSurveyViewModel = this.LLILZIL;
        if (innerSurveyViewModel == null || (surveyQuestion = innerSurveyViewModel.LLILLJJLI) == null) {
            return;
        }
        int size = surveyQuestion.optionList.size();
        for (int i = 0; i < size; i++) {
            SurveyOption surveyOption = (SurveyOption) ListProtector.get(surveyQuestion.optionList, i);
            if (surveyOption != null) {
                int i2 = i + 1;
                surveyOption.LIZ = i2;
                InnerSurveyViewModel innerSurveyViewModel2 = this.LLILZIL;
                if (innerSurveyViewModel2 != null && (map = innerSurveyViewModel2.LLJJJJLIIL) != null) {
                    Long lValueOf = Long.valueOf(surveyOption.optionId);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append('[');
                    sbLIZ.append(i2);
                    sbLIZ.append(']');
                    map.put(lValueOf, C2188811AlT.LIZIZ(sbLIZ));
                }
            }
        }
        C16F5 c16f5 = this.LLJ;
        if (c16f5 != null) {
            c16f5.setText(surveyQuestion.title);
        }
        LiveIconView liveIconView = this.LLJI;
        if (liveIconView != null) {
            C786410Ut5.g8(liveIconView, new ACListenerS142S0100000_7(this, 189));
        }
        C1203370hQ7 c1203370hQ7 = this.LLJIJIL;
        if (c1203370hQ7 != null) {
            c1203370hQ7.setValue(0);
        }
        C1203370hQ7 c1203370hQ72 = this.LLJIJIL;
        if (c1203370hQ72 != null) {
            c1203370hQ72.setOnValueSelectedListener(new AObjectS309S0200000_7(surveyQuestion, this, 6));
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.widget.RealTimeSurveyCardParentWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void hide() {
        if (isShowing()) {
            if (this.LLJILJILJ) {
                this.LLILZ = "submit";
                D1();
            }
            if (this.LLJILLL) {
                this.LLILZ = "submit";
                A1();
            }
            ((Handler) this.LLJILJIL.getValue()).removeCallbacksAndMessages(null);
            this.LLJILJILJ = false;
            this.LLJILLL = false;
            super.hide();
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.widget.RealTimeSurveyCardParentWidget
    public final void initView() {
        this.LLJ = (C16F5) findViewById(R.id.wqw);
        this.LLJI = (LiveIconView) findViewById(R.id.e26);
        this.LLJIJIL = (C1203370hQ7) findViewById(R.id.srx);
    }
}
