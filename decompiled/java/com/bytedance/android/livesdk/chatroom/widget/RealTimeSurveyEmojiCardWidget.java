package com.bytedance.android.livesdk.chatroom.widget;

import X.C01GW;
import X.C16F5;
import X.C2188811AlT;
import X.C439101nJ;
import X.C452501pT;
import X.C500260Jjc;
import X.C786410Ut5;
import Y.ACListenerS142S0100000_7;
import Y.ARunnableS107S0100000_7;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.chatroom.widget.RealTimeSurveyEmojiCardWidget;
import com.bytedance.android.livesdk.livesetting.watchlive.LightSurveyDelayConfig;
import com.bytedance.android.livesdk.survey.fullscreenstyle.InnerSurveyViewModel;
import com.bytedance.android.livesdk.survey.model.SurveyData;
import com.bytedance.android.livesdk.survey.model.SurveyOption;
import com.bytedance.android.livesdk.survey.model.SurveyQuestion;
import com.bytedance.android.livesdk.survey.model.SurveySecondQuestion;
import com.bytedance.android.livesdk.survey.model.SurveyShowMode;
import com.bytedance.ies.sdk.widgets.RecycleSource;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class RealTimeSurveyEmojiCardWidget extends RealTimeSurveyCardParentWidget {
    public LiveIconView LLJ;
    public C16F5 LLJI;
    public ViewGroup LLJIJIL;
    public LiveIconView LLJILJIL;
    public C16F5 LLJILJILJ;
    public ViewGroup LLJILLL;
    public LiveIconView LLJJ;
    public C16F5 LLJJI;
    public ViewGroup LLJJIII;
    public LiveIconView LLJJIJI;
    public C16F5 LLJJIJIIJIL;
    public ViewGroup LLJJIJIL;
    public LiveIconView LLJJJ;
    public boolean LLJJJJ;
    public boolean LLJJJJJIL;
    public final C01GW LLJJJIL = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(39));
    public final ARunnableS107S0100000_7 LLJJJJLIIL = new ARunnableS107S0100000_7(this, 68);
    public final ARunnableS107S0100000_7 LLJJL = new ARunnableS107S0100000_7(this, 67);

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.hkj;
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
        C16F5 c16f5 = this.LLJI;
        if (c16f5 != null) {
            InnerSurveyViewModel innerSurveyViewModel = this.LLILZIL;
            c16f5.setText((innerSurveyViewModel == null || (surveyQuestion = innerSurveyViewModel.LLILLJJLI) == null) ? null : surveyQuestion.title);
        }
        LiveIconView liveIconView = this.LLJ;
        if (liveIconView != null) {
            C786410Ut5.g8(liveIconView, new ACListenerS142S0100000_7(this, 188));
        }
        G1(this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, 0);
        G1(this.LLJILLL, this.LLJJ, this.LLJJI, 1);
        G1(this.LLJJIII, this.LLJJIJI, this.LLJJIJIIJIL, 2);
    }

    @Override // com.bytedance.android.livesdk.chatroom.widget.RealTimeSurveyCardParentWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void hide() {
        if (isShowing()) {
            if (this.LLJJJJ) {
                this.LLILZ = "submit";
                D1();
            }
            if (this.LLJJJJJIL) {
                this.LLILZ = "submit";
                A1();
            }
            ((Handler) this.LLJJJIL.getValue()).removeCallbacksAndMessages(null);
            this.LLJJJJ = false;
            this.LLJJJJJIL = false;
            super.hide();
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.widget.RealTimeSurveyCardParentWidget
    public final void initView() {
        this.LLJ = (LiveIconView) findViewById(R.id.e26);
        this.LLJI = (C16F5) findViewById(R.id.wqw);
        this.LLJIJIL = (ViewGroup) findViewById(R.id.gz3);
        this.LLJILJIL = (LiveIconView) findViewById(R.id.gz2);
        this.LLJILJILJ = (C16F5) findViewById(R.id.gz4);
        this.LLJILLL = (ViewGroup) findViewById(R.id.gz6);
        this.LLJJ = (LiveIconView) findViewById(R.id.gz5);
        this.LLJJI = (C16F5) findViewById(R.id.gz7);
        this.LLJJIII = (ViewGroup) findViewById(R.id.gz9);
        this.LLJJIJI = (LiveIconView) findViewById(R.id.gz8);
        this.LLJJIJIIJIL = (C16F5) findViewById(R.id.gz_);
    }

    @Override // com.bytedance.android.livesdk.chatroom.widget.RealTimeSurveyCardParentWidget, com.bytedance.android.livesdk.chatroom.widget.survey.widget.LightSurveyAvoidWidget, com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget
    public final void onUnload(RecycleSource recycleSource) {
        super.onUnload(recycleSource);
        this.LLJJIJIL = null;
        this.LLJJJ = null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final int F1(String str, boolean z) {
        if (str == null) {
            return 0;
        }
        switch (str.hashCode()) {
            case -712059990:
                if (!str.equals("unsatisfy")) {
                    return 0;
                }
                if (z) {
                    return R.raw.icon_bitmap_big_moji_bad;
                }
                return R.raw.icon_bitmap_big_moji_bad_gray;
            case -224567701:
                if (!str.equals("satisfy_wink")) {
                    return 0;
                }
                if (z) {
                    return R.raw.icon_bitmap_big_moji_good;
                }
                return R.raw.icon_bitmap_big_moji_good_gray;
            case 1844321735:
                if (!str.equals("neutral")) {
                    return 0;
                }
                if (z) {
                    return R.raw.icon_bitmap_big_moji_neutral;
                }
                return R.raw.icon_bitmap_big_moji_neutral_gray;
            case 1871106147:
                if (!str.equals("satisfy")) {
                    return 0;
                }
                if (z) {
                    return R.raw.icon_bitmap_big_moji_very_good;
                }
                return R.raw.icon_bitmap_big_moji_very_good_gray;
            default:
                return 0;
        }
    }

    public final void G1(final ViewGroup viewGroup, final LiveIconView liveIconView, C16F5 c16f5, int i) {
        InnerSurveyViewModel innerSurveyViewModel;
        SurveyQuestion surveyQuestion;
        List<SurveyOption> list;
        final SurveyOption surveyOption;
        final boolean z;
        final int i2;
        final int i3;
        int iF1;
        SurveyData surveyData;
        SurveyShowMode surveyShowMode;
        Map<Long, String> map;
        if (viewGroup != null && liveIconView != null && (innerSurveyViewModel = this.LLILZIL) != null && (surveyQuestion = innerSurveyViewModel.LLILLJJLI) != null && (list = surveyQuestion.optionList) != null && (surveyOption = (SurveyOption) ListProtector.get(list, i)) != null) {
            int i4 = i + 1;
            surveyOption.LIZ = i4;
            InnerSurveyViewModel innerSurveyViewModel2 = this.LLILZIL;
            if (innerSurveyViewModel2 != null && (map = innerSurveyViewModel2.LLJJJJLIIL) != null) {
                Long lValueOf = Long.valueOf(surveyOption.optionId);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append('[');
                sbLIZ.append(i4);
                sbLIZ.append(']');
                map.put(lValueOf, C2188811AlT.LIZIZ(sbLIZ));
            }
            if (c16f5 != null) {
                if (surveyOption.content.length() > 0) {
                    C500260Jjc.LLFFF(c16f5);
                    c16f5.setText(surveyOption.content);
                } else {
                    C500260Jjc.LJIILIIL(c16f5);
                }
            }
            InnerSurveyViewModel innerSurveyViewModel3 = this.LLILZIL;
            if (innerSurveyViewModel3 != null && (surveyData = innerSurveyViewModel3.LL) != null && (surveyShowMode = surveyData.showMode) != null && surveyShowMode.lightSurveyEmojiStyle == 1) {
                z = true;
                i2 = R.drawable.f_8;
            } else {
                z = false;
                i2 = R.drawable.f_7;
            }
            if (z) {
                i3 = R.drawable.f_6;
            } else {
                i3 = R.drawable.f_5;
            }
            String str = surveyOption.emojiId;
            if (z) {
                iF1 = F1(str, true);
                if (i != 0) {
                    if (i == 2) {
                        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                        if (layoutParams != null) {
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                            marginLayoutParams.setMarginEnd(C439101nJ.LIZ(12));
                            C786410Ut5.W5(viewGroup, marginLayoutParams);
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        }
                    }
                } else {
                    ViewGroup.LayoutParams layoutParams2 = viewGroup.getLayoutParams();
                    if (layoutParams2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                        marginLayoutParams2.setMarginStart(C439101nJ.LIZ(12));
                        C786410Ut5.W5(viewGroup, marginLayoutParams2);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                }
                viewGroup.setBackgroundResource(i2);
            } else {
                iF1 = F1(str, false);
            }
            liveIconView.setIcon(iF1);
            C786410Ut5.K7(viewGroup, new View.OnClickListener() { // from class: X.0IxR
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SurveyOption surveyOption2;
                    boolean z2;
                    RealTimeSurveyEmojiCardWidget realTimeSurveyEmojiCardWidget;
                    InnerSurveyViewModel innerSurveyViewModel4;
                    SurveyData surveyData2;
                    String str2;
                    SurveyOption surveyOption3;
                    InnerSurveyViewModel innerSurveyViewModel5 = this.LL.LLILZIL;
                    if (innerSurveyViewModel5 != null) {
                        surveyOption2 = innerSurveyViewModel5.LLILLL;
                    } else {
                        surveyOption2 = null;
                    }
                    if (Intrinsics.LJFF(surveyOption2, surveyOption)) {
                        return;
                    }
                    try {
                        ViewGroup viewGroup2 = this.LL.LLJJIJIL;
                        if (viewGroup2 != null) {
                            viewGroup2.setBackgroundResource(i2);
                        }
                        RealTimeSurveyEmojiCardWidget realTimeSurveyEmojiCardWidget2 = this.LL;
                        ViewGroup viewGroup3 = viewGroup;
                        realTimeSurveyEmojiCardWidget2.LLJJIJIL = viewGroup3;
                        viewGroup3.setBackgroundResource(i3);
                        if (z) {
                            this.LL.LLJJJ = liveIconView;
                        } else {
                            RealTimeSurveyEmojiCardWidget realTimeSurveyEmojiCardWidget3 = this.LL;
                            LiveIconView liveIconView2 = realTimeSurveyEmojiCardWidget3.LLJJJ;
                            if (liveIconView2 != null) {
                                InnerSurveyViewModel innerSurveyViewModel6 = realTimeSurveyEmojiCardWidget3.LLILZIL;
                                if (innerSurveyViewModel6 != null && (surveyOption3 = innerSurveyViewModel6.LLILLL) != null) {
                                    str2 = surveyOption3.emojiId;
                                } else {
                                    str2 = null;
                                }
                                liveIconView2.setIcon(realTimeSurveyEmojiCardWidget3.F1(str2, false));
                            }
                            RealTimeSurveyEmojiCardWidget realTimeSurveyEmojiCardWidget4 = this.LL;
                            LiveIconView liveIconView3 = liveIconView;
                            realTimeSurveyEmojiCardWidget4.LLJJJ = liveIconView3;
                            liveIconView3.setIcon(realTimeSurveyEmojiCardWidget4.F1(surveyOption.emojiId, true));
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    InnerSurveyViewModel innerSurveyViewModel7 = this.LL.LLILZIL;
                    if (innerSurveyViewModel7 != null) {
                        innerSurveyViewModel7.LLILLL = surveyOption;
                        Set<SurveyOption> set = innerSurveyViewModel7.LLILZ;
                        if (set != null) {
                            set.add(surveyOption);
                        }
                    }
                    List<SurveySecondQuestion> list2 = surveyOption.secondList;
                    if (list2 != null && !list2.isEmpty()) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (!z2 && (innerSurveyViewModel4 = (realTimeSurveyEmojiCardWidget = this.LL).LLILZIL) != null && (surveyData2 = innerSurveyViewModel4.LL) != null && surveyData2.surveyVersion == 5) {
                        realTimeSurveyEmojiCardWidget.LLJJJJJIL = true;
                        long jE1 = realTimeSurveyEmojiCardWidget.E1();
                        if (jE1 > 0) {
                            realTimeSurveyEmojiCardWidget.C1();
                            ((Handler) realTimeSurveyEmojiCardWidget.LLJJJIL.getValue()).removeCallbacksAndMessages(null);
                            C786410Ut5.LJLIIL(jE1, (Handler) realTimeSurveyEmojiCardWidget.LLJJJIL.getValue(), realTimeSurveyEmojiCardWidget.LLJJL);
                            return;
                        }
                        realTimeSurveyEmojiCardWidget.LLJJL.run();
                        return;
                    }
                    RealTimeSurveyEmojiCardWidget realTimeSurveyEmojiCardWidget5 = this.LL;
                    realTimeSurveyEmojiCardWidget5.LLJJJJ = true;
                    long jE12 = realTimeSurveyEmojiCardWidget5.E1();
                    if (jE12 > 0) {
                        realTimeSurveyEmojiCardWidget5.C1();
                        ((Handler) realTimeSurveyEmojiCardWidget5.LLJJJIL.getValue()).removeCallbacksAndMessages(null);
                        C786410Ut5.LJLIIL(jE12, (Handler) realTimeSurveyEmojiCardWidget5.LLJJJIL.getValue(), realTimeSurveyEmojiCardWidget5.LLJJJJLIIL);
                        return;
                    }
                    realTimeSurveyEmojiCardWidget5.LLJJJJLIIL.run();
                }
            });
        }
    }
}
