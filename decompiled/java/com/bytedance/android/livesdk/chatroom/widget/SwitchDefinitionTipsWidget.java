package com.bytedance.android.livesdk.chatroom.widget;

import X.C0TZM;
import X.C1125430fOP;
import X.C1161920gLG;
import X.C1338270kvh;
import X.C1388190mED;
import X.C1954807lC;
import X.C20441214yg;
import X.C2188811AlT;
import X.C354201Zc;
import X.C500260Jjc;
import X.C751340Tdc;
import X.C786410Ut5;
import Y.ACListenerS142S0100000_7;
import Y.ARunnableS107S0100000_7;
import android.app.Activity;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.TranslateAnimation;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.definition.IDefinitionService;
import com.bytedance.android.livesdk.dataChannel.AudienceDefinitionSwitchTipsChannel;
import com.bytedance.android.livesdk.dataChannel.AudienceLastSelectDefinitionInfo;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class SwitchDefinitionTipsWidget extends LiveWidget {
    public static long LLIZ;
    public final boolean LL;
    public final BPEAHandler LLILLJJLI = new BPEAHandler(Looper.getMainLooper());
    public boolean LLILLL = true;
    public final ARunnableS107S0100000_7 LLILZ = new ARunnableS107S0100000_7(this, 71);
    public TranslateAnimation LLILZIL;
    public TranslateAnimation LLILZLL;

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        if (this.LL) {
            return R.layout.i2p;
        }
        Activity activityLIZ = C1388190mED.LIZ(this.context);
        return (activityLIZ == null || !C500260Jjc.LJJII(activityLIZ.getRequestedOrientation())) ? R.layout.i2o : R.layout.i2q;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        String string;
        String str;
        LiveMode liveMode;
        Long l;
        super.show();
        C20441214yg.LJIIIZ("SwitchDefinitionTipsWidget", "show");
        DataChannel dataChannel = this.dataChannel;
        String strLIZ = "";
        if (dataChannel == null || (l = (Long) dataChannel.gg0(C751340Tdc.class)) == null || (string = l.toString()) == null) {
            string = "";
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null && (liveMode = (LiveMode) dataChannel2.gg0(LiveModeChannel.class)) != null) {
            strLIZ = C354201Zc.LIZ(liveMode);
        }
        boolean z = this.LLILLL;
        if (z) {
            str = CardStruct.IStatusCode.DEFAULT;
        } else {
            if (z) {
                throw new C1954807lC();
            }
            str = "1";
        }
        IDefinitionService iDefinitionService = (IDefinitionService) C1161920gLG.LIZJ(IDefinitionService.class);
        if (iDefinitionService != null) {
            iDefinitionService.vQ(string, strLIZ, str);
        }
        LLIZ = System.currentTimeMillis();
        DataChannel dataChannel3 = this.dataChannel;
        if (dataChannel3 != null) {
            dataChannel3.zW(AudienceDefinitionSwitchTipsChannel.class, Boolean.TRUE);
        }
        this.LLILZIL = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.25f, 1, 0.0f);
        this.LLILZLL = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 0.25f);
        TranslateAnimation translateAnimation = this.LLILZIL;
        if (translateAnimation != null) {
            translateAnimation.setDuration(500L);
        }
        TranslateAnimation translateAnimation2 = this.LLILZLL;
        if (translateAnimation2 != null) {
            translateAnimation2.setDuration(500L);
        }
        TranslateAnimation translateAnimation3 = this.LLILZIL;
        if (translateAnimation3 != null) {
            translateAnimation3.setInterpolator(new C1125430fOP());
        }
        TranslateAnimation translateAnimation4 = this.LLILZLL;
        if (translateAnimation4 != null) {
            translateAnimation4.setInterpolator(new C1125430fOP());
        }
        View view = getView();
        if (view != null) {
            view.startAnimation(this.LLILZIL);
        }
        C786410Ut5.LJLIIL(Mp4ScreenVideoLoadTimeout.CONTROL, this.LLILLJJLI, this.LLILZ);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void hide() {
        super.hide();
        C20441214yg.LJIIIZ("SwitchDefinitionTipsWidget", "hide");
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.zW(AudienceDefinitionSwitchTipsChannel.class, Boolean.FALSE);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        Boolean bool;
        View view;
        ViewGroup viewGroup;
        super.onCreate();
        C20441214yg.LJIIIZ("SwitchDefinitionTipsWidget", "onCreate");
        View viewFindViewById = findViewById(this.LL ? R.id.f687cvk : R.id.cvj);
        boolean zBooleanValue = true;
        viewFindViewById.setClickable(true);
        View view2 = getView();
        if (view2 != null) {
            view2.setClickable(true);
        }
        if ((viewFindViewById instanceof ViewGroup) && (viewGroup = (ViewGroup) viewFindViewById) != null) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                childAt.setFocusable(false);
                childAt.setClickable(false);
            }
        }
        C786410Ut5.I7(new ACListenerS142S0100000_7(this, 38), viewFindViewById);
        if (this.LL && (view = getView()) != null) {
            C786410Ut5.I7(new ACListenerS142S0100000_7(viewFindViewById, 39), view);
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (bool = (Boolean) dataChannel.gg0(C0TZM.class)) != null) {
            zBooleanValue = bool.booleanValue();
        }
        this.LLILLL = zBooleanValue;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        C20441214yg.LJIIIZ("SwitchDefinitionTipsWidget", "onDestroy");
        this.LLILLJJLI.removeCallbacksAndMessages(null);
        this.LLILLJJLI.removeCallbacks(this.LLILZ);
    }

    public SwitchDefinitionTipsWidget(boolean z) {
        this.LL = z;
    }

    public final void x1(int i, String str) {
        Object objGg0;
        String strLIZ;
        String str2;
        String str3;
        String strValueOf;
        Map map;
        Map map2;
        LiveMode liveMode;
        Map<String, Object> map3 = C1338270kvh.LIZ;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            objGg0 = dataChannel.gg0(C751340Tdc.class);
        } else {
            objGg0 = null;
        }
        String strValueOf2 = String.valueOf(objGg0);
        DataChannel dataChannel2 = this.dataChannel;
        String str4 = "";
        if (dataChannel2 == null || (liveMode = (LiveMode) dataChannel2.gg0(LiveModeChannel.class)) == null) {
            strLIZ = "";
        } else {
            strLIZ = C354201Zc.LIZ(liveMode);
        }
        boolean z = this.LLILLL;
        String strValueOf3 = CardStruct.IStatusCode.DEFAULT;
        if (z) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        } else if (!z) {
            str2 = "1";
        } else {
            throw new C1954807lC();
        }
        DataChannel dataChannel3 = this.dataChannel;
        if (dataChannel3 == null || (map2 = (Map) dataChannel3.gg0(AudienceLastSelectDefinitionInfo.class)) == null || (str3 = (String) map2.get("sdk_key")) == null) {
            str3 = "";
        }
        try {
            DataChannel dataChannel4 = this.dataChannel;
            if (dataChannel4 == null || (map = (Map) dataChannel4.gg0(AudienceLastSelectDefinitionInfo.class)) == null || (strValueOf = (String) map.get("start_time")) == null) {
                strValueOf = String.valueOf(System.currentTimeMillis());
            }
            strValueOf3 = String.valueOf((System.currentTimeMillis() - CastLongProtector.parseLong(strValueOf)) / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("reportSwitchAction. catch exception=");
            sbLIZ.append(e);
            C20441214yg.LJIIIZ("SwitchDefinitionTipsWidget", C2188811AlT.LIZIZ(sbLIZ));
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("lastSdkKey");
        sbLIZ2.append(str3);
        sbLIZ2.append(".  duration:");
        sbLIZ2.append(strValueOf3);
        C20441214yg.LJIIIZ("SwitchDefinitionTipsWidget", C2188811AlT.LIZIZ(sbLIZ2));
        if (i != -1) {
            if (i != 0) {
                if (i == 1) {
                    str4 = "pool_connection";
                }
            } else {
                str4 = "click";
            }
        } else {
            str4 = "pool_connection_failed";
        }
        IDefinitionService iDefinitionService = (IDefinitionService) C1161920gLG.LIZJ(IDefinitionService.class);
        if (iDefinitionService != null) {
            iDefinitionService.Cx(strValueOf2, strLIZ, str2, strValueOf3, str3, str4, str);
        }
    }
}
