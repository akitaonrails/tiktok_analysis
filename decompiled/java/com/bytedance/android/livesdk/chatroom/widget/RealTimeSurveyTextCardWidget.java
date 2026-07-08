package com.bytedance.android.livesdk.chatroom.widget;

import X.C16F5;
import X.C786410Ut5;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.survey.fullscreenstyle.InnerSurveyViewModel;
import com.bytedance.android.livesdk.survey.model.SurveyData;
import com.bytedance.android.livesdk.survey.model.SurveyOption;
import com.bytedance.android.livesdk.survey.model.SurveyQuestion;
import com.bytedance.android.livesdk.survey.model.SurveySecondQuestion;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class RealTimeSurveyTextCardWidget extends RealTimeSurveyCardParentWidget implements View.OnClickListener {
    public C16F5 LLJ;
    public LiveIconView LLJI;
    public ViewGroup LLJIJIL;
    public C16F5 LLJILJIL;
    public ViewGroup LLJILJILJ;
    public C16F5 LLJILLL;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.hkl;
    }

    @Override // com.bytedance.android.livesdk.chatroom.widget.RealTimeSurveyCardParentWidget, com.bytedance.android.livesdk.chatroom.widget.survey.widget.LightSurveyAvoidWidget, com.bytedance.ies.sdk.widgets.AnimatableRecyclableWidget, com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.livesdk.chatroom.widget.RealTimeSurveyCardParentWidget
    public final void z1() {
        SurveyQuestion surveyQuestion;
        List<SurveyOption> list;
        SurveyQuestion surveyQuestion2;
        List<SurveyOption> list2;
        SurveyOption surveyOption;
        Map<Long, String> map;
        SurveyQuestion surveyQuestion3;
        List<SurveyOption> list3;
        SurveyOption surveyOption2;
        Map<Long, String> map2;
        SurveyQuestion surveyQuestion4;
        C16F5 c16f5 = this.LLJ;
        if (c16f5 != null) {
            InnerSurveyViewModel innerSurveyViewModel = this.LLILZIL;
            c16f5.setText((innerSurveyViewModel == null || (surveyQuestion4 = innerSurveyViewModel.LLILLJJLI) == null) ? null : surveyQuestion4.title);
        }
        InnerSurveyViewModel innerSurveyViewModel2 = this.LLILZIL;
        if (innerSurveyViewModel2 == null || (surveyQuestion = innerSurveyViewModel2.LLILLJJLI) == null || (list = surveyQuestion.optionList) == null || list.size() < 2) {
            return;
        }
        InnerSurveyViewModel innerSurveyViewModel3 = this.LLILZIL;
        if (innerSurveyViewModel3 != null && (surveyQuestion3 = innerSurveyViewModel3.LLILLJJLI) != null && (list3 = surveyQuestion3.optionList) != null && (surveyOption2 = (SurveyOption) ListProtector.get(list3, 0)) != null) {
            C16F5 c16f52 = this.LLJILJIL;
            if (c16f52 != null) {
                c16f52.setText(surveyOption2.content);
            }
            surveyOption2.LIZ = 1;
            InnerSurveyViewModel innerSurveyViewModel4 = this.LLILZIL;
            if (innerSurveyViewModel4 != null && (map2 = innerSurveyViewModel4.LLJJJJLIIL) != null) {
                map2.put(Long.valueOf(surveyOption2.optionId), "[1]");
            }
        }
        InnerSurveyViewModel innerSurveyViewModel5 = this.LLILZIL;
        if (innerSurveyViewModel5 == null || (surveyQuestion2 = innerSurveyViewModel5.LLILLJJLI) == null || (list2 = surveyQuestion2.optionList) == null || (surveyOption = (SurveyOption) ListProtector.get(list2, 1)) == null) {
            return;
        }
        C16F5 c16f53 = this.LLJILLL;
        if (c16f53 != null) {
            c16f53.setText(surveyOption.content);
        }
        surveyOption.LIZ = 2;
        InnerSurveyViewModel innerSurveyViewModel6 = this.LLILZIL;
        if (innerSurveyViewModel6 == null || (map = innerSurveyViewModel6.LLJJJJLIIL) == null) {
            return;
        }
        map.put(Long.valueOf(surveyOption.optionId), "[2]");
    }

    @Override // com.bytedance.android.livesdk.chatroom.widget.RealTimeSurveyCardParentWidget
    public final void initView() {
        this.LLJ = (C16F5) findViewById(R.id.wqw);
        this.LLJI = (LiveIconView) findViewById(R.id.e26);
        this.LLJIJIL = (ViewGroup) findViewById(R.id.mjc);
        this.LLJILJIL = (C16F5) findViewById(R.id.mjb);
        this.LLJILJILJ = (ViewGroup) findViewById(R.id.tk5);
        this.LLJILLL = (C16F5) findViewById(R.id.tk4);
        LiveIconView liveIconView = this.LLJI;
        if (liveIconView != null) {
            C786410Ut5.g8(liveIconView, this);
        }
        ViewGroup viewGroup = this.LLJIJIL;
        if (viewGroup != null) {
            C786410Ut5.K7(viewGroup, this);
        }
        ViewGroup viewGroup2 = this.LLJILJILJ;
        if (viewGroup2 != null) {
            C786410Ut5.K7(viewGroup2, this);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Integer numValueOf;
        SurveyQuestion surveyQuestion;
        List<SurveyOption> list;
        SurveyOption surveyOption;
        InnerSurveyViewModel innerSurveyViewModel;
        SurveyData surveyData;
        SurveyQuestion surveyQuestion2;
        List<SurveyOption> list2;
        SurveyOption surveyOption2;
        InnerSurveyViewModel innerSurveyViewModel2;
        SurveyData surveyData2;
        if (view != null) {
            numValueOf = Integer.valueOf(view.getId());
            if (numValueOf != null && numValueOf.intValue() == R.id.e26) {
                this.LLILZ = "user_close";
                hide();
                return;
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf == null) {
            return;
        }
        if (numValueOf.intValue() == R.id.mjc) {
            this.LLILZ = "submit";
            InnerSurveyViewModel innerSurveyViewModel3 = this.LLILZIL;
            if (innerSurveyViewModel3 != null && (surveyQuestion2 = innerSurveyViewModel3.LLILLJJLI) != null && (list2 = surveyQuestion2.optionList) != null && (surveyOption2 = (SurveyOption) ListProtector.get(list2, 0)) != null) {
                InnerSurveyViewModel innerSurveyViewModel4 = this.LLILZIL;
                if (innerSurveyViewModel4 != null) {
                    innerSurveyViewModel4.LLILLL = surveyOption2;
                    Set<SurveyOption> set = innerSurveyViewModel4.LLILZ;
                    if (set != null) {
                        set.add(surveyOption2);
                    }
                }
                List<SurveySecondQuestion> list3 = surveyOption2.secondList;
                if (list3 != null && !list3.isEmpty() && (innerSurveyViewModel2 = this.LLILZIL) != null && (surveyData2 = innerSurveyViewModel2.LL) != null && surveyData2.surveyVersion == 5) {
                    A1();
                } else {
                    D1();
                }
                hide();
                return;
            }
            return;
        }
        if (numValueOf.intValue() != R.id.tk5) {
            return;
        }
        this.LLILZ = "submit";
        InnerSurveyViewModel innerSurveyViewModel5 = this.LLILZIL;
        if (innerSurveyViewModel5 == null || (surveyQuestion = innerSurveyViewModel5.LLILLJJLI) == null || (list = surveyQuestion.optionList) == null || (surveyOption = (SurveyOption) ListProtector.get(list, 1)) == null) {
            return;
        }
        InnerSurveyViewModel innerSurveyViewModel6 = this.LLILZIL;
        if (innerSurveyViewModel6 != null) {
            innerSurveyViewModel6.LLILLL = surveyOption;
            Set<SurveyOption> set2 = innerSurveyViewModel6.LLILZ;
            if (set2 != null) {
                set2.add(surveyOption);
            }
        }
        List<SurveySecondQuestion> list4 = surveyOption.secondList;
        if (list4 != null && !list4.isEmpty() && (innerSurveyViewModel = this.LLILZIL) != null && (surveyData = innerSurveyViewModel.LL) != null && surveyData.surveyVersion == 5) {
            A1();
        } else {
            D1();
        }
        hide();
    }
}
