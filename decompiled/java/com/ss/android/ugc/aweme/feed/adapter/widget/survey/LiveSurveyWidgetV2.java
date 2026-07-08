package com.ss.android.ugc.aweme.feed.adapter.widget.survey;

import X.AbstractC484810Izn;
import X.C01GW;
import X.C077V;
import X.C0HCN;
import X.C0J4Y;
import X.C0SUL;
import X.C0SUT;
import X.C0UO0;
import X.C11JF;
import X.C1388190mED;
import X.C13LE;
import X.C13LP;
import X.C14LC;
import X.C19719912Dl;
import X.C1ABT;
import X.C1AC7;
import X.C1ACA;
import X.C1AKK;
import X.C20441214yg;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C309690CBz;
import X.C354710DvR;
import X.C452501pT;
import X.C469620IbI;
import X.C473250Ih9;
import X.C480460Ism;
import X.C483240IxG;
import X.C483250IxH;
import X.C483340IxQ;
import X.C484830Izp;
import X.C484860Izs;
import X.C484920Izy;
import X.C497740JfY;
import X.C497820Jfg;
import X.C500260Jjc;
import X.C786410Ut5;
import X.EnumC484820Izo;
import X.EnumC484840Izq;
import X.EnumC494740Jai;
import X.InterfaceC483200IxC;
import X.InterfaceC483310IxN;
import X.InterfaceC483370IxT;
import X.InterfaceC484900Izw;
import Y.AObserverS211S0100000_7;
import Y.ARunnableS10S0210000_7;
import Y.AfS176S0100000_7;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.livesdk.internal.Live;
import com.bytedance.android.livesdk.survey.api.SurveyApi;
import com.bytedance.android.livesdk.survey.model.SurveyData;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.NextLiveData;
import com.bytedance.ies.sdk.widgets.WidgetViewModelLazyKt;
import com.bytedance.ies.sdk.widgets.WidgetWithoutSyncConfig;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.ss.android.ugc.aweme.feed.adapter.viewholdervm.FeedLiveViewHolderVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.bottom.AbsLivePreviewBottomCardWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.bottom.LivePreviewBottomCardVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.guide.LivePreviewGuideEnterVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.openlive.GoLiveGuideVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.player.LivePreviewPlayerVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.room.PreviewGoLiveAnchorPoint;
import webcast.api.room.ShowMode;
import webcast.api.room.StrategyData;
import webcast.api.room.StrategyFilter;
import webcast.api.room.SurveyConfig;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveSurveyWidgetV2 extends AbsLivePreviewBottomCardWidget {
    public final C0SUL LLJIJIL;
    public final FrameLayout LLJILJIL;
    public final View LLJILJILJ;
    public final View LLJILLL;
    public InterfaceC484900Izw LLJJIII;
    public C484860Izs LLJJIJI;
    public AbstractC484810Izn LLJJJ;
    public C484920Izy LLJJJJ;
    public InterfaceC483200IxC LLJJJJJIL;
    public final C01GW LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public final C01GW LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public Animator LLJLL;
    public final C01GW LLJJ = C452501pT.LIZIZ(new AwS551S0100000_7(this, 163));
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS551S0100000_7(this, 164));
    public EnumC484820Izo LLJJIJIIJIL = EnumC484820Izo.NORMAL;
    public final C01GW LLJJIJIL = C452501pT.LIZIZ(new AwS551S0100000_7(this, 166));
    public final C01GW LLJJJIL = C452501pT.LIZIZ(new AwS551S0100000_7(this, 165));
    public EnumC484840Izq LLJJJJLIIL = EnumC484840Izq.NULL;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dhz;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.widget.bottom.AbsLivePreviewBottomCardWidget, com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
    }

    public final FeedLiveViewHolderVM P1() {
        return (FeedLiveViewHolderVM) this.LLJJL.getValue();
    }

    public final C0SUT Q1() {
        return (C0SUT) this.LLJJI.getValue();
    }

    public final FrameLayout R1() {
        return (FrameLayout) this.LLJJJIL.getValue();
    }

    public final PreviewSurveyViewModel S1() {
        return (PreviewSurveyViewModel) this.LLJLIL.getValue();
    }

    public final FrameLayout T1() {
        return (FrameLayout) this.LLJJIJIL.getValue();
    }

    public final void W1() {
        View viewFindViewById;
        View viewFindViewById2;
        Activity activityLIZ = C1388190mED.LIZ(this.context);
        int iLIZJ = (activityLIZ == null || (viewFindViewById2 = activityLIZ.findViewById(R.id.ydi)) == null) ? C497820Jfg.LIZJ(this.context) : viewFindViewById2.getMeasuredHeight();
        Activity activityLIZ2 = C1388190mED.LIZ(this.context);
        int iLIZIZ = (activityLIZ2 == null || (viewFindViewById = activityLIZ2.findViewById(R.id.tpm)) == null) ? (int) C497740JfY.LIZIZ(58) : viewFindViewById.getMeasuredHeight();
        boolean z = C14LC.LJIIIZ;
        int dimensionPixelSize = C309690CBz.LIZ.LJFF ? 0 : this.context.getResources().getDimensionPixelSize(R.dimen.ai3);
        int iLIZJ2 = (C497820Jfg.LIZJ(this.context) + iLIZIZ) - iLIZJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tryDoAdaptation: topSpace=");
        sbLIZ.append(iLIZJ);
        sbLIZ.append(", tabHeight=");
        sbLIZ.append(iLIZIZ);
        sbLIZ.append(", statusBarHeight=");
        sbLIZ.append(C497820Jfg.LIZJ(this.context));
        sbLIZ.append(", topMargin=");
        sbLIZ.append(iLIZJ2);
        sbLIZ.append(", bottomMargin=");
        sbLIZ.append(dimensionPixelSize);
        C20441214yg.LIZIZ("LiveSurveyWidgetV2", C2188811AlT.LIZIZ(sbLIZ));
        View view = this.contentView;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) (view != null ? view.getLayoutParams() : null);
        marginLayoutParams.topMargin = iLIZJ2;
        marginLayoutParams.bottomMargin = dimensionPixelSize;
        View view2 = this.contentView;
        if (view2 != null) {
            C786410Ut5.W5(view2, marginLayoutParams);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void B1() {
        C1ACA c1acaZ1;
        PreviewSurveyViewModel previewSurveyViewModelS1;
        Aweme aweme;
        SurveyData surveyData;
        Pair<String, Integer> pair;
        String str;
        String str2;
        ShowMode showMode;
        SurveyConfig surveyConfig;
        List<String> list;
        C1AKK liteService;
        InterfaceC483370IxT interfaceC483370IxTKu;
        Map<String, Object> mapLJII;
        ShowMode showMode2;
        SurveyConfig surveyConfig2;
        List<String> list2;
        ShowMode showMode3;
        SurveyConfig surveyConfig3;
        ShowMode showMode4;
        SurveyConfig surveyConfig4;
        InterfaceC483310IxN interfaceC483310IxNLb;
        SurveyData surveyData2;
        LiveRoomStruct liveRoomStruct;
        LiveRoomStruct liveRoomStruct2;
        C1ACA c1acaZ12 = z1();
        if (c1acaZ12 == null || !c1acaZ12.LJFF || (c1acaZ1 = z1()) == null || c1acaZ1.LLFFF || (previewSurveyViewModelS1 = S1()) == null) {
            return;
        }
        boolean zLJI = MethodIDManager.LJI(137260);
        C1ACA c1acaJQ2 = previewSurveyViewModelS1.JQ2();
        if (c1acaJQ2 == null || !TextUtils.equals(c1acaJQ2.LIZLLL, "homepage_hot")) {
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        C1ACA c1acaJQ22 = previewSurveyViewModelS1.JQ2();
        if (c1acaJQ22 != null && c1acaJQ22.LJIILIIL) {
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        C1ACA c1acaJQ23 = previewSurveyViewModelS1.JQ2();
        long j = 0;
        previewSurveyViewModelS1.LLJ = (c1acaJQ23 == null || (liveRoomStruct2 = c1acaJQ23.LIZJ) == null) ? 0L : liveRoomStruct2.id;
        C1ACA c1acaJQ24 = previewSurveyViewModelS1.JQ2();
        if (c1acaJQ24 != null && (liveRoomStruct = c1acaJQ24.LIZJ) != null) {
            j = liveRoomStruct.ownerUserId;
        }
        previewSurveyViewModelS1.LLJI = j;
        C1ACA c1acaJQ25 = previewSurveyViewModelS1.JQ2();
        previewSurveyViewModelS1.LLJLLIL = c1acaJQ25 != null ? c1acaJQ25.LJIIIIZZ : -1;
        C20441214yg.LIZIZ("PreviewSurveyViewModel", "requestSurveyData: roomId=" + previewSurveyViewModelS1.LLJ + ", anchorId=" + previewSurveyViewModelS1.LLJI + ", positionInFeed=" + previewSurveyViewModelS1.LLJLLIL);
        C1ACA c1acaJQ26 = previewSurveyViewModelS1.JQ2();
        if (c1acaJQ26 != null && (aweme = c1acaJQ26.LIZIZ) != null) {
            if (((Boolean) C077V.LIZ.getValue()).booleanValue()) {
                String aid = aweme.getAid();
                if (aid == null) {
                    aid = "";
                }
                String uniqueId = AwemeSaaSExtKt.getUniqueId(aweme);
                if (uniqueId == null) {
                    uniqueId = "";
                }
                C483340IxQ c483340IxQ = new C483340IxQ(aid, uniqueId);
                for (C483340IxQ c483340IxQ2 : ((LinkedHashMap) PreviewSurveyViewModel.LLLFFI).keySet()) {
                    if (Intrinsics.LJFF(c483340IxQ.LIZ, c483340IxQ2.LIZ) && !Intrinsics.LJFF(c483340IxQ, c483340IxQ2)) {
                        previewSurveyViewModelS1.LLJLL = true;
                    }
                }
                Map<C483340IxQ, C483250IxH> map = PreviewSurveyViewModel.LLLFFI;
                C483250IxH c483250IxH = (C483250IxH) ((LinkedHashMap) map).get(c483340IxQ);
                if (c483250IxH != null && (surveyData2 = c483250IxH.LIZ) != null) {
                    previewSurveyViewModelS1.LLJLIL = c483250IxH;
                    previewSurveyViewModelS1.SQ2(surveyData2);
                    if (zLJI) {
                        MethodIDManager.LJ();
                        return;
                    }
                    return;
                }
                map.put(c483340IxQ, previewSurveyViewModelS1.LLJLIL);
            } else {
                for (Aweme aweme2 : ((LinkedHashMap) PreviewSurveyViewModel.LLLFF).keySet()) {
                    if (Intrinsics.LJFF(aweme.getAid(), aweme2.getAid()) && !Intrinsics.LJFF(aweme, aweme2)) {
                        previewSurveyViewModelS1.LLJLL = true;
                    }
                }
                Map<Aweme, C483250IxH> map2 = PreviewSurveyViewModel.LLLFF;
                C483250IxH c483250IxH2 = (C483250IxH) ((LinkedHashMap) map2).get(aweme);
                if (c483250IxH2 != null && (surveyData = c483250IxH2.LIZ) != null) {
                    previewSurveyViewModelS1.LLJLIL = c483250IxH2;
                    previewSurveyViewModelS1.SQ2(surveyData);
                    if (zLJI) {
                        MethodIDManager.LJ();
                        return;
                    }
                    return;
                }
                map2.put(aweme, previewSurveyViewModelS1.LLJLIL);
            }
            HashMap map3 = new HashMap();
            map3.put("room_id", Long.valueOf(previewSurveyViewModelS1.LLJ));
            map3.put(Scene.SCENE_SERVICE, 2);
            map3.put("anchor_id", Long.valueOf(previewSurveyViewModelS1.LLJI));
            map3.put("available_survey_ids_str", "");
            String strLJII = C0J4Y.LJII(aweme, "chandler_ttlive_survey_show_map");
            if (strLJII == null) {
                strLJII = "";
            }
            map3.put("live_survey_rec_info", strLJII);
            C0J4Y.LJI(aweme);
            C1AKK liteService2 = Live.getLiteService();
            if (liteService2 == null || (interfaceC483310IxNLb = liteService2.Lb()) == null || (pair = interfaceC483310IxNLb.LIZIZ(2)) == null) {
                pair = new Pair<>("", 0);
            }
            String first = pair.getFirst();
            Integer second = pair.getSecond();
            C20441214yg.LIZIZ("PreviewSurveyViewModel", "requestSurveyData availableSurveys=" + first);
            if (first.length() == 0) {
                C1AC7 c1ac7 = C1AC7.LIZ;
                C1ACA c1acaJQ27 = previewSurveyViewModelS1.JQ2();
                c1ac7.getClass();
                C1AC7.LJIILLIIL(c1acaJQ27, 1, null, second, null);
                if (zLJI) {
                    MethodIDManager.LJ();
                    return;
                }
                return;
            }
            C469620IbI.LIZ.getClass();
            StrategyData strategyDataLIZIZ = C469620IbI.LIZIZ(2, null, true, true, false);
            StringBuilder sb = new StringBuilder("requestSurveyData filterNeedFeatureKeys=");
            sb.append((strategyDataLIZIZ == null || (showMode4 = strategyDataLIZIZ.showMode) == null || (surveyConfig4 = showMode4.surveyConfig) == null) ? null : surveyConfig4.filterNeedFeatureKeys);
            C20441214yg.LIZIZ("PreviewSurveyViewModel", sb.toString());
            StringBuilder sb2 = new StringBuilder("requestSurveyData serverNeedFeatureKeys=");
            sb2.append((strategyDataLIZIZ == null || (showMode3 = strategyDataLIZIZ.showMode) == null || (surveyConfig3 = showMode3.surveyConfig) == null) ? null : surveyConfig3.serverNeedFeatureKeys);
            C20441214yg.LIZIZ("PreviewSurveyViewModel", sb2.toString());
            if (strategyDataLIZIZ != null && (showMode2 = strategyDataLIZIZ.showMode) != null && (surveyConfig2 = showMode2.surveyConfig) != null && (list2 = surveyConfig2.filterNeedFeatureKeys) != null && (!list2.isEmpty())) {
                StrategyFilter strategyFilter = (StrategyFilter) C13LP.LJJJLL(strategyDataLIZIZ.filter);
                if (!previewSurveyViewModelS1.IQ2(strategyFilter != null ? strategyFilter.filterExpression : null, true, list2)) {
                    C1AC7 c1ac72 = C1AC7.LIZ;
                    C1ACA c1acaJQ28 = previewSurveyViewModelS1.JQ2();
                    c1ac72.getClass();
                    C1AC7.LJIILLIIL(c1acaJQ28, 1, null, second, null);
                    if (zLJI) {
                        MethodIDManager.LJ();
                        return;
                    }
                    return;
                }
            }
            HashMap map4 = new HashMap();
            map4.put("room_id", Long.valueOf(previewSurveyViewModelS1.LLJ));
            map4.put(Scene.SCENE_SERVICE, 2);
            map4.put("anchor_id", Long.valueOf(previewSurveyViewModelS1.LLJI));
            map4.put("available_survey_ids_str", first);
            String strLJII2 = C0J4Y.LJII(aweme, "chandler_ttlive_survey_show_map");
            if (strLJII2 == null) {
                strLJII2 = "";
            }
            map4.put("live_survey_rec_info", strLJII2);
            LiveRoomStruct liveRoomStructLJI = C0J4Y.LJI(aweme);
            if (liveRoomStructLJI == null || (str = liveRoomStructLJI.debugSurveyId) == null) {
                str = "";
            }
            map4.put("preview_survey_id_str", str);
            LiveRoomStruct liveRoomStructLJI2 = C0J4Y.LJI(aweme);
            if (liveRoomStructLJI2 == null || (str2 = liveRoomStructLJI2.debugSurveyLan) == null) {
                str2 = "";
            }
            map4.put("language", str2);
            if (strategyDataLIZIZ != null && (showMode = strategyDataLIZIZ.showMode) != null && (surveyConfig = showMode.surveyConfig) != null && (list = surveyConfig.serverNeedFeatureKeys) != null && (!list.isEmpty()) && (liteService = Live.getLiteService()) != null && (interfaceC483370IxTKu = liteService.ku()) != null && (mapLJII = interfaceC483370IxTKu.LJII(list, new AwS586S0100000_7(previewSurveyViewModelS1, 453))) != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(mapLJII.size()));
                Iterator<T> it2 = mapLJII.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    linkedHashMap.put(entry.getKey(), entry.getValue().toString());
                }
                map4.put("feature_map", linkedHashMap);
            }
            C480460Ism.LIZ().getClass();
            previewSurveyViewModelS1.LLJJLIIIJLLLLLLLZ = (C11JF) ((SurveyApi) C480460Ism.LIZLLL(SurveyApi.class)).listV2(map4).LJIILIIL(new C0UO0()).LJJLL(new AfS176S0100000_7(previewSurveyViewModelS1, 234), new AfS176S0100000_7(previewSurveyViewModelS1, 235));
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void H1() {
        View view;
        ViewGroup viewGroup;
        C483250IxH c483250IxH;
        SurveyData surveyData;
        PreviewSurveyViewModel previewSurveyViewModelS1 = S1();
        Long lValueOf = (previewSurveyViewModelS1 == null || (surveyData = previewSurveyViewModelS1.LL) == null) ? null : Long.valueOf(surveyData.surveyVersion);
        if (lValueOf != null) {
            if (lValueOf.longValue() == 2 || lValueOf.longValue() == 3) {
                C484860Izs c484860Izs = this.LLJJIJI;
                if (c484860Izs != null) {
                    c484860Izs.LJIJI = false;
                    c484860Izs.LJIJJLI = false;
                    c484860Izs.LJIIIZ(0.0f);
                    View view2 = c484860Izs.LJIJ;
                    if (view2 != null) {
                        view2.setClickable(false);
                    }
                }
                ViewGroup viewGroup2 = (ViewGroup) this.LLJJ.getValue();
                RemoveViewCausedNPEChecker.recordViewRemovedPoint(viewGroup2, null);
                viewGroup2.removeAllViewsInLayout();
                C786410Ut5.V(Q1(), 8);
                Object obj = this.LLJJIII;
                if ((obj instanceof View) && (view = (View) obj) != null) {
                    ViewParent parent = view.getParent();
                    if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                        RemoveViewCausedNPEChecker.recordViewRemovedPoint(viewGroup, null);
                        viewGroup.removeAllViewsInLayout();
                    }
                    C786410Ut5.LJLLLLLL(8, view);
                }
                this.LLJJIII = null;
            } else if (lValueOf.longValue() == 4 || lValueOf.longValue() == 5) {
                C786410Ut5.LJJJLL(T1());
                C786410Ut5.LJZ(8, T1());
                C786410Ut5.LJJJLL(R1());
                C786410Ut5.LJZ(8, R1());
                PreviewSurveyViewModel previewSurveyViewModelS12 = S1();
                if (previewSurveyViewModelS12 != null && (c483250IxH = previewSurveyViewModelS12.LLJLIL) != null) {
                    c483250IxH.LIZLLL = false;
                }
            }
        }
        PreviewSurveyViewModel previewSurveyViewModelS13 = S1();
        if (previewSurveyViewModelS13 != null) {
            previewSurveyViewModelS13.reset();
        }
        C1ACA c1acaZ1 = z1();
        if (c1acaZ1 != null) {
            c1acaZ1.LJL = false;
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void L1() {
        SurveyData surveyData;
        Long lValueOf;
        PreviewSurveyViewModel previewSurveyViewModelS1;
        PreviewSurveyViewModel previewSurveyViewModelS12;
        C483250IxH c483250IxH;
        SurveyData surveyData2;
        PreviewSurveyViewModel previewSurveyViewModelS13 = S1();
        if (previewSurveyViewModelS13 != null && (surveyData2 = previewSurveyViewModelS13.LL) != null && (surveyData2.surveyVersion == 4 || surveyData2.surveyVersion == 5)) {
            previewSurveyViewModelS13.TQ2("gbl_survey_did_leave_fyp_live_card");
        }
        PreviewSurveyViewModel previewSurveyViewModelS14 = S1();
        if (previewSurveyViewModelS14 != null && (surveyData = previewSurveyViewModelS14.LL) != null && (lValueOf = Long.valueOf(surveyData.surveyVersion)) != null) {
            if (lValueOf.longValue() == 2 || lValueOf.longValue() == 3) {
                PreviewSurveyViewModel previewSurveyViewModelS15 = S1();
                if (previewSurveyViewModelS15 != null && previewSurveyViewModelS15.LLIZLLLIL) {
                    C484860Izs c484860Izs = this.LLJJIJI;
                    if (c484860Izs != null) {
                        c484860Izs.LJIJI = false;
                        c484860Izs.LJIJJLI = false;
                        c484860Izs.LJIIIZ(0.0f);
                        View view = c484860Izs.LJIJ;
                        if (view != null) {
                            view.setClickable(false);
                        }
                    }
                } else if (C500260Jjc.LJJJJIZL(Q1()) && (previewSurveyViewModelS1 = S1()) != null) {
                    previewSurveyViewModelS1.QQ2("swipe");
                }
            } else if ((lValueOf.longValue() == 4 || lValueOf.longValue() == 5) && this.LLJJJJLIIL != EnumC484840Izq.NULL) {
                PreviewSurveyViewModel previewSurveyViewModelS16 = S1();
                if (previewSurveyViewModelS16 != null) {
                    previewSurveyViewModelS16.EQ2();
                }
                PreviewSurveyViewModel previewSurveyViewModelS17 = S1();
                if (previewSurveyViewModelS17 != null && (c483250IxH = previewSurveyViewModelS17.LLJLIL) != null) {
                    c483250IxH.LIZLLL = false;
                }
                Animator animator = this.LLJLL;
                if (animator != null) {
                    animator.cancel();
                }
                C786410Ut5.LJJJLL(T1());
                C786410Ut5.fd(T1(), 0.0f);
                C786410Ut5.LJZ(8, T1());
                AbstractC484810Izn abstractC484810Izn = this.LLJJJ;
                if (abstractC484810Izn != null) {
                    abstractC484810Izn.reset();
                }
                C786410Ut5.LJJJLL(R1());
                C786410Ut5.fd(R1(), 0.0f);
                C786410Ut5.LJZ(8, R1());
                C484920Izy c484920Izy = this.LLJJJJ;
                if (c484920Izy != null) {
                    c484920Izy.reset();
                }
                InterfaceC483200IxC interfaceC483200IxC = this.LLJJJJJIL;
                if (interfaceC483200IxC != null) {
                    interfaceC483200IxC.yx(C2097908Jt.LIZJ(new Pair("exit_method", "leave")));
                }
                ViewGroup viewGroup = (ViewGroup) this.LLJILJILJ.findViewById(R.id.nc5);
                C786410Ut5.bd(0.0f, viewGroup);
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt.getId() != R.id.chm) {
                        C786410Ut5.T4(childAt, 1.0f);
                    }
                }
                int i2 = C484830Izp.LIZIZ[this.LLJJJJLIIL.ordinal()];
                if (i2 == 1) {
                    PreviewSurveyViewModel previewSurveyViewModelS18 = S1();
                    if (previewSurveyViewModelS18 != null) {
                        previewSurveyViewModelS18.MQ2(C2097908Jt.LIZJ(new Pair("exit_method", "leave")));
                    }
                } else if (i2 == 2 && (previewSurveyViewModelS12 = S1()) != null) {
                    previewSurveyViewModelS12.NQ2(C2097908Jt.LIZJ(new Pair("exit_method", "3")));
                }
                this.LLJJJJLIIL = EnumC484840Izq.NULL;
            }
        }
        C1ACA c1acaZ1 = z1();
        if (c1acaZ1 != null) {
            c1acaZ1.LJL = false;
        }
    }

    public final void N1() {
        float fLIZIZ;
        float fLIZIZ2;
        EnumC484820Izo enumC484820Izo;
        EnumC484820Izo enumC484820Izo2;
        ViewGroup.LayoutParams layoutParams;
        if (C0HCN.LIZ() && this.LLJJIJIIJIL == EnumC484820Izo.NORMAL) {
            this.LLJJIJIIJIL = EnumC484820Izo.SMALLER;
        }
        View viewFindViewById = Q1().findViewById(R.id.video_cover);
        View viewFindViewById2 = Q1().findViewById(R.id.ior);
        View viewFindViewById3 = Q1().findViewById(R.id.cb9);
        int i = C484830Izp.LIZ[this.LLJJIJIIJIL.ordinal()];
        if (i == 1) {
            fLIZIZ = C497740JfY.LIZIZ(100);
            fLIZIZ2 = C497740JfY.LIZIZ(130);
        } else if (i != 2) {
            fLIZIZ = C497740JfY.LIZIZ(68);
            fLIZIZ2 = C497740JfY.LIZIZ(91);
        } else {
            fLIZIZ = C497740JfY.LIZIZ(80);
            fLIZIZ2 = C497740JfY.LIZIZ(108);
        }
        if (viewFindViewById != null && (layoutParams = viewFindViewById.getLayoutParams()) != null) {
            layoutParams.width = (int) fLIZIZ;
            layoutParams.height = (int) fLIZIZ2;
        }
        EnumC484820Izo enumC484820Izo3 = this.LLJJIJIIJIL;
        EnumC484820Izo enumC484820Izo4 = EnumC484820Izo.NORMAL;
        float fLIZIZ3 = C497740JfY.LIZIZ(enumC484820Izo3 == enumC484820Izo4 ? 24 : 16);
        int i2 = (int) fLIZIZ3;
        C500260Jjc.LJLJL(i2, viewFindViewById2);
        C500260Jjc.LJJLJ(i2, viewFindViewById3);
        float f = 2;
        float height = (((((this.contentView.getHeight() - fLIZIZ2) - viewFindViewById2.getHeight()) - viewFindViewById3.getHeight()) - (fLIZIZ3 * f)) / f) + C497740JfY.LIZIZ(f);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("computeTargetCenterY: fullScreenScalingMode=");
        sbLIZ.append(this.LLJJIJIIJIL);
        sbLIZ.append(" scaleVideoHeight=");
        sbLIZ.append(fLIZIZ2);
        sbLIZ.append(" gapSize=");
        sbLIZ.append(fLIZIZ3);
        sbLIZ.append(" topSpaceHeight=");
        sbLIZ.append(height);
        C20441214yg.LIZIZ("LiveSurveyWidgetV2", C2188811AlT.LIZIZ(sbLIZ));
        float f2 = 12;
        if (height <= C497740JfY.LIZIZ(f2) && (enumC484820Izo = this.LLJJIJIIJIL) != (enumC484820Izo2 = EnumC484820Izo.SMALLEST)) {
            if (enumC484820Izo == enumC484820Izo4) {
                enumC484820Izo2 = EnumC484820Izo.SMALLER;
            }
            this.LLJJIJIIJIL = enumC484820Izo2;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("computeTargetCenterY: smaller than ");
            sbLIZ2.append(C497740JfY.LIZIZ(f2));
            sbLIZ2.append(" change to ");
            sbLIZ2.append(this.LLJJIJIIJIL);
            sbLIZ2.append(" and try again");
            C20441214yg.LJIIL("LiveSurveyWidgetV2", C2188811AlT.LIZIZ(sbLIZ2));
            N1();
            return;
        }
        float top = this.contentView.getTop() + height + (fLIZIZ2 / f);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("computeTargetCenterY: scaleVideoWidth=");
        sbLIZ3.append(fLIZIZ);
        sbLIZ3.append(" scaleVideoHeight=");
        sbLIZ3.append(fLIZIZ2);
        sbLIZ3.append(" coverCenterY=");
        sbLIZ3.append(top);
        C20441214yg.LJIIL("LiveSurveyWidgetV2", C2188811AlT.LIZIZ(sbLIZ3));
        C484860Izs c484860Izs = this.LLJJIJI;
        if (c484860Izs != null) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("setTargetVideoSize[150]: width=");
            sbLIZ4.append(fLIZIZ);
            sbLIZ4.append(" height=");
            sbLIZ4.append(fLIZIZ2);
            C20441214yg.LIZIZ("LiveTouchScalingV2", C2188811AlT.LIZIZ(sbLIZ4));
            c484860Izs.LIZ = fLIZIZ;
            c484860Izs.LIZIZ = fLIZIZ2;
        }
        C484860Izs c484860Izs2 = this.LLJJIJI;
        if (c484860Izs2 != null) {
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("setTargetVideoCenter: centerY=");
            sbLIZ5.append(top);
            C20441214yg.LIZIZ("LiveTouchScalingV2", C2188811AlT.LIZIZ(sbLIZ5));
            c484860Izs2.LIZJ = top;
            FrameLayout frameLayout = c484860Izs2.LJIILLIIL;
            if (frameLayout != null) {
                HandlerHook.viewPost(frameLayout, new ARunnableS10S0210000_7(frameLayout, c484860Izs2, true, 1));
            }
        }
        InterfaceC484900Izw interfaceC484900Izw = this.LLJJIII;
        if (interfaceC484900Izw != null) {
            interfaceC484900Izw.setSmallSize(this.LLJJIJIIJIL != enumC484820Izo4);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void G1() {
        W1();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void LJJIJIIJIL(int i) {
        String strLJIJ;
        Boolean boolValueOf;
        C1AKK liteService;
        InterfaceC483370IxT interfaceC483370IxTKu;
        String aid;
        InterfaceC483370IxT interfaceC483370IxTKu2;
        String strLJIJ2;
        Long lValueOf;
        String str;
        PreviewSurveyViewModel previewSurveyViewModelS1 = S1();
        if (previewSurveyViewModelS1 != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onViewHolderSelected uniqueKey=");
            C1ACA c1acaJQ2 = previewSurveyViewModelS1.JQ2();
            if (c1acaJQ2 != null) {
                strLJIJ = C1ABT.LJIJ(c1acaJQ2);
            } else {
                strLJIJ = null;
            }
            sbLIZ.append(strLJIJ);
            sbLIZ.append(" liveAlive=");
            C1ACA c1acaJQ22 = previewSurveyViewModelS1.JQ2();
            if (c1acaJQ22 != null) {
                boolValueOf = Boolean.valueOf(c1acaJQ22.LJFF);
            } else {
                boolValueOf = null;
            }
            sbLIZ.append(boolValueOf);
            C20441214yg.LIZIZ("PreviewSurveyViewModel", C2188811AlT.LIZIZ(sbLIZ));
            SurveyData surveyData = previewSurveyViewModelS1.LL;
            if (surveyData != null && (surveyData.surveyVersion == 4 || surveyData.surveyVersion == 5)) {
                previewSurveyViewModelS1.TQ2("gbl_survey_did_enter_fyp_live_card");
            }
            C354710DvR c354710DvR = new C354710DvR(2L, 3L);
            SurveyData surveyData2 = previewSurveyViewModelS1.LL;
            if (surveyData2 != null && (lValueOf = Long.valueOf(surveyData2.surveyVersion)) != null && c354710DvR.LJIIIIZZ(lValueOf.longValue()) && previewSurveyViewModelS1.LLJLIL.LIZIZ) {
                C1AC7 c1ac7 = C1AC7.LIZ;
                C1ACA c1acaJQ23 = previewSurveyViewModelS1.JQ2();
                SurveyData surveyData3 = previewSurveyViewModelS1.LL;
                if (surveyData3 != null) {
                    str = surveyData3.surveyId;
                } else {
                    str = null;
                }
                c1ac7.getClass();
                C1AC7.LJIILLIIL(c1acaJQ23, 10, str, null, "repeat");
                previewSurveyViewModelS1.LLJILJIL = SystemClock.elapsedRealtime();
            }
            C1AKK liteService2 = Live.getLiteService();
            String str2 = "";
            if (liteService2 != null && (interfaceC483370IxTKu2 = liteService2.ku()) != null) {
                C1ACA c1acaJQ24 = previewSurveyViewModelS1.JQ2();
                if (c1acaJQ24 == null || (strLJIJ2 = C1ABT.LJIJ(c1acaJQ24)) == null) {
                    strLJIJ2 = "";
                }
                interfaceC483370IxTKu2.LJ(strLJIJ2);
            }
            C1ACA c1acaJQ25 = previewSurveyViewModelS1.JQ2();
            if (c1acaJQ25 != null && TextUtils.equals(c1acaJQ25.LIZLLL, "homepage_hot") && (liteService = Live.getLiteService()) != null && (interfaceC483370IxTKu = liteService.ku()) != null) {
                Aweme aweme = c1acaJQ25.LIZIZ;
                if (aweme != null && (aid = aweme.getAid()) != null) {
                    str2 = aid;
                }
                interfaceC483370IxTKu.LIZLLL(str2);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        MutableLiveData<Boolean> mutableLiveData;
        MutableLiveData<Boolean> mutableLiveData2;
        NextLiveData<PreviewGoLiveAnchorPoint> nextLiveData;
        MutableLiveData<Integer> mutableLiveData3;
        MutableLiveData<Integer> mutableLiveData4;
        MutableLiveData<C473250Ih9> mutableLiveData5;
        NextLiveData<Integer> nextLiveData2;
        NextLiveData<Boolean> nextLiveData3;
        MutableLiveData<C483240IxG> mutableLiveData6;
        MutableLiveData<Boolean> mutableLiveData7;
        super.onLoad(objArr);
        PreviewSurveyViewModel previewSurveyViewModelS1 = S1();
        if (previewSurveyViewModelS1 != null && (mutableLiveData7 = previewSurveyViewModelS1.LLJZ) != null) {
            mutableLiveData7.observe(this, new AObserverS211S0100000_7(this, 18));
        }
        PreviewSurveyViewModel previewSurveyViewModelS12 = S1();
        if (previewSurveyViewModelS12 != null && (mutableLiveData6 = previewSurveyViewModelS12.LLJLLL) != null) {
            mutableLiveData6.observe(this, new AObserverS211S0100000_7(this, 19));
        }
        FeedLiveViewHolderVM feedLiveViewHolderVMP1 = P1();
        if (feedLiveViewHolderVMP1 != null && (nextLiveData3 = feedLiveViewHolderVMP1.LLJLILLLLZIIL) != null) {
            nextLiveData3.observe(this, new AObserverS211S0100000_7(this, 20));
        }
        FeedLiveViewHolderVM feedLiveViewHolderVMP12 = P1();
        if (feedLiveViewHolderVMP12 != null && (nextLiveData2 = feedLiveViewHolderVMP12.LLJJJJJIL) != null) {
            nextLiveData2.observe(this, new AObserverS211S0100000_7(this, 21));
        }
        LivePreviewPlayerVM livePreviewPlayerVM = (LivePreviewPlayerVM) this.LLJL.getValue();
        if (livePreviewPlayerVM != null && (mutableLiveData5 = livePreviewPlayerVM.LLILLJJLI) != null) {
            mutableLiveData5.observe(this, new AObserverS211S0100000_7(this, 22));
        }
        FeedLiveViewHolderVM feedLiveViewHolderVMP13 = P1();
        if (feedLiveViewHolderVMP13 != null && (mutableLiveData4 = feedLiveViewHolderVMP13.LLJLLIL) != null) {
            mutableLiveData4.observe(this, new AObserverS211S0100000_7(this, 23));
        }
        FeedLiveViewHolderVM feedLiveViewHolderVMP14 = P1();
        if (feedLiveViewHolderVMP14 != null && (mutableLiveData3 = feedLiveViewHolderVMP14.LLJLLL) != null) {
            mutableLiveData3.observe(this, new AObserverS211S0100000_7(this, 24));
        }
        GoLiveGuideVM goLiveGuideVM = (GoLiveGuideVM) this.LLJLILLLLZIIL.getValue();
        if (goLiveGuideVM != null && (nextLiveData = goLiveGuideVM.LLILLJJLI) != null) {
            nextLiveData.observe(this, new AObserverS211S0100000_7(this, 25));
        }
        FeedLiveViewHolderVM feedLiveViewHolderVMP15 = P1();
        if (feedLiveViewHolderVMP15 != null && (mutableLiveData2 = feedLiveViewHolderVMP15.LLJZ) != null) {
            mutableLiveData2.observe(this, new AObserverS211S0100000_7(this, 26));
        }
        LivePreviewGuideEnterVM livePreviewGuideEnterVM = (LivePreviewGuideEnterVM) this.LLJJLIIIJLLLLLLLZ.getValue();
        if (livePreviewGuideEnterVM != null && (mutableLiveData = livePreviewGuideEnterVM.LLILZIL) != null) {
            mutableLiveData.observe(this, new AObserverS211S0100000_7(this, 17));
        }
        W1();
    }

    public static void U1(LiveSurveyWidgetV2 liveSurveyWidgetV2, Map map) {
        InterfaceC483200IxC interfaceC483200IxC;
        EnumC484840Izq enumC484840Izq = liveSurveyWidgetV2.LLJJJJLIIL;
        EnumC484840Izq enumC484840Izq2 = EnumC484840Izq.NULL;
        if (enumC484840Izq != enumC484840Izq2) {
            int i = C484830Izp.LIZIZ[enumC484840Izq.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3 && (interfaceC483200IxC = liveSurveyWidgetV2.LLJJJJJIL) != null) {
                        interfaceC483200IxC.yx(map);
                    }
                } else {
                    liveSurveyWidgetV2.V1(EnumC484840Izq.ROUTE, true);
                    PreviewSurveyViewModel previewSurveyViewModelS1 = liveSurveyWidgetV2.S1();
                    if (previewSurveyViewModelS1 != null) {
                        previewSurveyViewModelS1.NQ2(map);
                    }
                }
            } else {
                liveSurveyWidgetV2.V1(EnumC484840Izq.QUESTION, true);
                PreviewSurveyViewModel previewSurveyViewModelS12 = liveSurveyWidgetV2.S1();
                if (previewSurveyViewModelS12 != null) {
                    previewSurveyViewModelS12.MQ2(map);
                }
            }
            liveSurveyWidgetV2.LLJJJJLIIL = enumC484840Izq2;
        }
    }

    public final void O1(String str, String str2) {
        int i = C484830Izp.LIZIZ[this.LLJJJJLIIL.ordinal()];
        if (i != 1) {
            if (i == 2) {
                U1(this, C2097908Jt.LIZJ(new Pair("exit_method", str2)));
                PreviewSurveyViewModel previewSurveyViewModelS1 = S1();
                if (previewSurveyViewModelS1 != null) {
                    previewSurveyViewModelS1.EQ2();
                    return;
                }
                return;
            }
            return;
        }
        U1(this, C2097908Jt.LIZJ(new Pair("exit_method", str)));
        PreviewSurveyViewModel previewSurveyViewModelS12 = S1();
        if (previewSurveyViewModelS12 == null) {
            return;
        }
        previewSurveyViewModelS12.EQ2();
    }

    public final void V1(EnumC484840Izq enumC484840Izq, final boolean z) {
        final FrameLayout frameLayoutT1;
        C483250IxH c483250IxH;
        int i = C484830Izp.LIZIZ[enumC484840Izq.ordinal()];
        if (i != 1) {
            if (i == 2) {
                frameLayoutT1 = R1();
            } else {
                return;
            }
        } else {
            frameLayoutT1 = T1();
        }
        if (frameLayoutT1 != null) {
            PreviewSurveyViewModel previewSurveyViewModelS1 = S1();
            if (previewSurveyViewModelS1 != null && (c483250IxH = previewSurveyViewModelS1.LLJLIL) != null) {
                c483250IxH.LIZLLL = false;
            }
            final ViewGroup viewGroup = (ViewGroup) this.LLJILJILJ.findViewById(R.id.nc5);
            final int measuredHeight = frameLayoutT1.getMeasuredHeight();
            final float translationY = viewGroup.getTranslationY();
            Animator animator = this.LLJLL;
            if (animator != null) {
                animator.cancel();
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.setDuration(300L);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0IxS
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    C786410Ut5.bd(translationY * (1 - fFloatValue), viewGroup);
                    C786410Ut5.fd(frameLayoutT1, measuredHeight * fFloatValue);
                    int childCount = viewGroup.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        View childAt = viewGroup.getChildAt(i2);
                        if (childAt.getId() != R.id.chm && z) {
                            C786410Ut5.T4(childAt, fFloatValue);
                        }
                    }
                }
            });
            valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: X.0Izl
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator2) {
                    NextLiveData<Boolean> nextLiveData;
                    C786410Ut5.LJZ(8, frameLayoutT1);
                    C786410Ut5.bd(0.0f, viewGroup);
                    C786410Ut5.fd(frameLayoutT1, 0.0f);
                    int childCount = viewGroup.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        View childAt = viewGroup.getChildAt(i2);
                        if (childAt.getId() != R.id.chm && z) {
                            C786410Ut5.T4(childAt, 1.0f);
                        }
                    }
                    LivePreviewBottomCardVM livePreviewBottomCardVMM1 = this.M1();
                    if (livePreviewBottomCardVMM1 != null && (nextLiveData = livePreviewBottomCardVMM1.LLILZLL) != null) {
                        nextLiveData.setValue(Boolean.TRUE);
                    }
                }
            });
            valueAnimatorOfFloat.start();
            this.LLJLL = valueAnimatorOfFloat;
        }
    }

    public LiveSurveyWidgetV2(C0SUL c0sul, FrameLayout frameLayout, View view, View view2) {
        this.LLJIJIL = c0sul;
        this.LLJILJIL = frameLayout;
        this.LLJILJILJ = view;
        this.LLJILLL = view2;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(FeedLiveViewHolderVM.class);
        AwS551S0100000_7 awS551S0100000_7 = new AwS551S0100000_7(c19719912DlLIZ, 167);
        WidgetWithoutSyncConfig widgetWithoutSyncConfig = WidgetWithoutSyncConfig.INSTANCE;
        boolean initVmWithoutSync = widgetWithoutSyncConfig.getInitVmWithoutSync();
        EnumC494740Jai enumC494740Jai = EnumC494740Jai.WIDGET;
        this.LLJJL = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ, enumC494740Jai, awS551S0100000_7, WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), initVmWithoutSync);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(LivePreviewGuideEnterVM.class);
        this.LLJJLIIIJLLLLLLLZ = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ2, enumC494740Jai, new AwS551S0100000_7(c19719912DlLIZ2, 168), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(LivePreviewPlayerVM.class);
        this.LLJL = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ3, enumC494740Jai, new AwS551S0100000_7(c19719912DlLIZ3, 169), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
        C19719912Dl c19719912DlLIZ4 = C13LE.LIZ(PreviewSurveyViewModel.class);
        this.LLJLIL = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ4, enumC494740Jai, new AwS551S0100000_7(c19719912DlLIZ4, 170), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
        C19719912Dl c19719912DlLIZ5 = C13LE.LIZ(GoLiveGuideVM.class);
        this.LLJLILLLLZIIL = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ5, enumC494740Jai, new AwS551S0100000_7(c19719912DlLIZ5, 171), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
    }
}
