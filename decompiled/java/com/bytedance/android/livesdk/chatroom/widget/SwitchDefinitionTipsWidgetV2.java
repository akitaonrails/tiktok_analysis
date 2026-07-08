package com.bytedance.android.livesdk.chatroom.widget;

import X.C0TZM;
import X.C1125430fOP;
import X.C1161920gLG;
import X.C1954807lC;
import X.C20441214yg;
import X.C354201Zc;
import X.C751340Tdc;
import X.C786410Ut5;
import Y.ACListenerS142S0100000_7;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.TranslateAnimation;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.definition.IDefinitionService;
import com.bytedance.android.livesdk.dataChannel.AudienceDefinitionSwitchTipsChannel;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
public class SwitchDefinitionTipsWidgetV2 extends LiveRecyclableWidget {
    public boolean LL;
    public boolean LLILLJJLI;
    public TranslateAnimation LLILLL;
    public TranslateAnimation LLILZ;

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.widget.Widget
    public int getLayoutId() {
        return this.LL ? R.layout.i2p : R.layout.i2o;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.zW(AudienceDefinitionSwitchTipsChannel.class, Boolean.FALSE);
        }
        this.LLILLJJLI = true;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        String string;
        String str;
        LiveMode liveMode;
        Long l;
        super.show();
        DataChannel dataChannel = this.dataChannel;
        String strLIZ = "";
        if (dataChannel == null || (l = (Long) dataChannel.gg0(C751340Tdc.class)) == null || (string = l.toString()) == null) {
            string = "";
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null && (liveMode = (LiveMode) dataChannel2.gg0(LiveModeChannel.class)) != null) {
            strLIZ = C354201Zc.LIZ(liveMode);
        }
        boolean z = this.LLILLJJLI;
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
        System.currentTimeMillis();
        DataChannel dataChannel3 = this.dataChannel;
        if (dataChannel3 != null) {
            dataChannel3.zW(AudienceDefinitionSwitchTipsChannel.class, Boolean.TRUE);
        }
        this.LLILLL = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.25f, 1, 0.0f);
        this.LLILZ = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 0.25f);
        TranslateAnimation translateAnimation = this.LLILLL;
        if (translateAnimation != null) {
            translateAnimation.setDuration(500L);
        }
        TranslateAnimation translateAnimation2 = this.LLILZ;
        if (translateAnimation2 != null) {
            translateAnimation2.setDuration(500L);
        }
        TranslateAnimation translateAnimation3 = this.LLILLL;
        if (translateAnimation3 != null) {
            translateAnimation3.setInterpolator(new C1125430fOP());
        }
        TranslateAnimation translateAnimation4 = this.LLILZ;
        if (translateAnimation4 != null) {
            translateAnimation4.setInterpolator(new C1125430fOP());
        }
        View view = getView();
        if (view != null) {
            view.startAnimation(this.LLILLL);
        }
        C786410Ut5.LJLIIL(Mp4ScreenVideoLoadTimeout.CONTROL, null, null);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void hide() {
        super.hide();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.zW(AudienceDefinitionSwitchTipsChannel.class, Boolean.FALSE);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void initConstructor(Object... objArr) {
        super.initConstructor(Arrays.copyOf(objArr, objArr.length));
        this.LL = ((Boolean) objArr[0]).booleanValue();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        int i;
        Boolean bool;
        View view;
        ViewGroup viewGroup;
        C20441214yg.LJIIIZ("SwitchDefinitionTipsWidgetV2", "onCreate");
        if (this.LL) {
            i = R.id.f687cvk;
        } else {
            i = R.id.cvj;
        }
        View viewFindViewById = findViewById(i);
        boolean zBooleanValue = true;
        viewFindViewById.setClickable(true);
        View view2 = getView();
        if (view2 != null) {
            view2.setClickable(true);
        }
        if ((viewFindViewById instanceof ViewGroup) && (viewGroup = (ViewGroup) viewFindViewById) != null) {
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                childAt.setFocusable(false);
                childAt.setClickable(false);
            }
        }
        C786410Ut5.I7(new ACListenerS142S0100000_7(this, 40), viewFindViewById);
        if (this.LL && (view = getView()) != null) {
            C786410Ut5.I7(new ACListenerS142S0100000_7(viewFindViewById, 41), view);
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (bool = (Boolean) dataChannel.gg0(C0TZM.class)) != null) {
            zBooleanValue = bool.booleanValue();
        }
        this.LLILLJJLI = zBooleanValue;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        boolean zBooleanValue;
        Boolean bool;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (bool = (Boolean) dataChannel.gg0(C0TZM.class)) != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = true;
        }
        this.LLILLJJLI = zBooleanValue;
    }
}
