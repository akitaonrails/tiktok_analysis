package com.bytedance.android.livesdk.chatroom.widget;

import X.C0IJT;
import X.C0IK2;
import X.C13LP;
import X.C15438062q;
import X.C1954807lC;
import X.C2097908Jt;
import X.C474500IjA;
import X.C483240IxG;
import X.CountDownTimerC521500Kcm;
import X.EnumC484840Izq;
import android.os.SystemClock;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.chatroom.widget.survey.event.LightSurveyRouteEvent;
import com.bytedance.android.livesdk.chatroom.widget.survey.widget.LightSurveyAvoidWidget;
import com.bytedance.android.livesdk.survey.fullscreenstyle.InnerSurveyViewModel;
import com.bytedance.android.livesdk.survey.model.SurveyData;
import com.bytedance.android.livesdk.survey.model.SurveyOption;
import com.bytedance.android.livesdk.survey.model.SurveySecondQuestion;
import com.bytedance.android.livesdk.survey.model.SurveyShowMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.RecycleSource;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public abstract class RealTimeSurveyCardParentWidget extends LightSurveyAvoidWidget {
    public boolean LLILLL;
    public String LLILZ = "";
    public InnerSurveyViewModel LLILZIL;
    public CountDownTimerC521500Kcm LLILZLL;
    public long LLIZ;
    public boolean LLIZLLLIL;

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public void hide() {
        SurveyShowMode surveyShowMode;
        SurveyShowMode surveyShowMode2;
        if (isShowing()) {
            C1();
            cancelShowAnimation();
            cancelHideAnimation();
            animateHide();
            this.LLILLL = false;
            InnerSurveyViewModel innerSurveyViewModel = this.LLILZIL;
            if (innerSurveyViewModel != null) {
                Map mapLIZJ = C2097908Jt.LIZJ(new Pair("exit_method", this.LLILZ));
                if (innerSurveyViewModel.LLJJIJI > 0) {
                    innerSurveyViewModel.LLJJIJIIJIL = SystemClock.elapsedRealtime() - innerSurveyViewModel.LLJJIJI;
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_exit_survey");
                    innerSurveyViewModel.GQ2(c474500IjALIZ);
                    c474500IjALIZ.LJIIIIZZ();
                    c474500IjALIZ.LJJIIZI(mapLIZJ);
                    c474500IjALIZ.LJJII("primary", "survey_page");
                    SurveyData surveyData = innerSurveyViewModel.LL;
                    c474500IjALIZ.LJJII(Long.valueOf((surveyData == null || (surveyShowMode2 = surveyData.showMode) == null) ? 0L : surveyShowMode2.showDurationMs), "setting_time");
                    c474500IjALIZ.LJJII(Long.valueOf(innerSurveyViewModel.LLJJIJIIJIL), "primary_stay_time");
                    c474500IjALIZ.LJJII(Long.valueOf(innerSurveyViewModel.LLJJIJIIJIL + innerSurveyViewModel.LLJJJ), "stay_time");
                    SurveyOption surveyOption = innerSurveyViewModel.LLILLL;
                    c474500IjALIZ.LJJII(surveyOption != null ? Long.valueOf(surveyOption.optionId) : null, "option_id");
                    Set<SurveySecondQuestion> set = innerSurveyViewModel.LLILZIL;
                    ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(set, 10));
                    Iterator<SurveySecondQuestion> it2 = set.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(Long.valueOf(it2.next().optionId));
                    }
                    c474500IjALIZ.LJJII(C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62), "result");
                    SurveyOption surveyOption2 = innerSurveyViewModel.LLILLL;
                    c474500IjALIZ.LJJII(surveyOption2 != null ? Integer.valueOf(surveyOption2.LIZ) : null, "position_id_submit_option");
                    SurveyData surveyData2 = innerSurveyViewModel.LL;
                    c474500IjALIZ.LJJII((surveyData2 == null || (surveyShowMode = surveyData2.showMode) == null || surveyShowMode.style != 4) ? CardStruct.IStatusCode.DEFAULT : "1", "is_emoji");
                    c474500IjALIZ.LIZ();
                    innerSurveyViewModel.HQ2();
                    innerSurveyViewModel.LLJJIJI = 0L;
                }
            }
        }
    }

    public abstract void initView();

    @Override // com.bytedance.android.livesdk.chatroom.widget.survey.widget.LightSurveyAvoidWidget, com.bytedance.ies.sdk.widgets.AnimatableRecyclableWidget, com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public abstract void z1();

    public final void A1() {
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.LC0(LightSurveyRouteEvent.class, new C483240IxG(EnumC484840Izq.ROUTE, null, 6));
        }
    }

    public final void C1() {
        CountDownTimerC521500Kcm countDownTimerC521500Kcm = this.LLILZLL;
        if (countDownTimerC521500Kcm != null) {
            countDownTimerC521500Kcm.cancel();
        }
        this.LLIZLLLIL = false;
    }

    public final void D1() {
        InnerSurveyViewModel innerSurveyViewModel = this.LLILZIL;
        if (innerSurveyViewModel != null) {
            innerSurveyViewModel.EQ2();
        }
    }

    public final void B1() {
        SurveyData surveyData;
        SurveyData surveyData2;
        Boolean boolX1 = x1();
        if (Intrinsics.LJFF(boolX1, Boolean.TRUE)) {
            if (isShowing()) {
                this.LLILZ = "conflict_close";
                hide();
                DataChannel dataChannel = this.dataChannel;
                InnerSurveyViewModel innerSurveyViewModel = this.LLILZIL;
                C0IK2.LIZ(dataChannel, 11, (innerSurveyViewModel == null || (surveyData2 = innerSurveyViewModel.LL) == null) ? null : surveyData2.surveyId, null, null);
                return;
            }
            return;
        }
        if (Intrinsics.LJFF(boolX1, Boolean.FALSE)) {
            C1();
            return;
        }
        if (boolX1 != null) {
            throw new C1954807lC();
        }
        if (this.LLILLL) {
            show();
            InnerSurveyViewModel innerSurveyViewModel2 = this.LLILZIL;
            if ((innerSurveyViewModel2 == null || (surveyData = innerSurveyViewModel2.LL) == null || !surveyData.isReverse) && !this.LLIZLLLIL) {
                CountDownTimerC521500Kcm countDownTimerC521500Kcm = new CountDownTimerC521500Kcm(this.LLIZ, this, 1);
                this.LLILZLL = countDownTimerC521500Kcm;
                countDownTimerC521500Kcm.start();
                this.LLIZLLLIL = true;
            }
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        SurveyData surveyData;
        if (isShowing()) {
            return;
        }
        InnerSurveyViewModel innerSurveyViewModel = this.LLILZIL;
        if ((innerSurveyViewModel == null || (surveyData = innerSurveyViewModel.LL) == null || !surveyData.isReverse) ? false : true) {
            if (innerSurveyViewModel != null) {
                innerSurveyViewModel.yQ2(null, false);
                return;
            }
            return;
        }
        C1();
        cancelShowAnimation();
        cancelHideAnimation();
        animateShow();
        InnerSurveyViewModel innerSurveyViewModel2 = this.LLILZIL;
        if (innerSurveyViewModel2 != null) {
            innerSurveyViewModel2.yQ2(null, true);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        initView();
    }

    @Override // com.bytedance.android.livesdk.chatroom.widget.survey.widget.LightSurveyAvoidWidget, com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget
    public void onUnload(RecycleSource recycleSource) {
        super.onUnload(recycleSource);
        D1();
        this.LLILZ = "leave";
        hide();
        InnerSurveyViewModel innerSurveyViewModel = this.LLILZIL;
        if (innerSurveyViewModel != null) {
            innerSurveyViewModel.reset();
        }
        this.LLILZ = "";
        this.LLILLL = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0104  */
    @Override // com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLoad(com.bytedance.ies.sdk.widgets.RecycleSource r12, java.lang.Object[] r13) {
        /*
            Method dump skipped, instruction units count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.widget.RealTimeSurveyCardParentWidget.onLoad(com.bytedance.ies.sdk.widgets.RecycleSource, java.lang.Object[]):void");
    }
}
