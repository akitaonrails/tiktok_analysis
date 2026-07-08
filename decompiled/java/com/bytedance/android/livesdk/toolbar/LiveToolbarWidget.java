package com.bytedance.android.livesdk.toolbar;

import X.C0TZM;
import X.C1161920gLG;
import X.C497740JfY;
import X.C780690Ujr;
import X.C786410Ut5;
import X.EnumC1088870eRR;
import X.EnumC1088900eRU;
import X.EnumC1102750enp;
import Y.AObjectS360S0100000_17;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.gift.DutyGiftChangedEvent;
import com.bytedance.android.live.toolbar.IToolbarService;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.livesetting.other.ToolBarButtonWithTextExperiment;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class LiveToolbarWidget extends LiveRecyclableWidget {
    public static final int LLIZ = (int) C497740JfY.LIZIZ(8.0f);
    public static final int LLIZLLLIL = (int) C497740JfY.LIZIZ(4.0f);
    public List<EnumC1102750enp> LL = new ArrayList();
    public LinearLayout LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;
    public EnumC1088900eRU LLILZLL;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.ht0;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        this.LL.clear();
        ((IToolbarService) C1161920gLG.LIZJ(IToolbarService.class)).Mn1(this.dataChannel).releaseAll();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object... objArr) {
        this.LLILLL = ((Boolean) this.dataChannel.gg0(UserIsAnchorChannel.class)).booleanValue();
        this.LLILZ = ((Boolean) this.dataChannel.gg0(C0TZM.class)).booleanValue();
        this.LLILLJJLI = (LinearLayout) getView();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object... objArr) {
        this.LLILLL = ((Boolean) this.dataChannel.gg0(UserIsAnchorChannel.class)).booleanValue();
        this.LLILZ = ((Boolean) this.dataChannel.gg0(C0TZM.class)).booleanValue();
        boolean zEquals = Boolean.TRUE.equals(this.dataChannel.gg0(C780690Ujr.class));
        this.LLILZIL = zEquals;
        if (zEquals) {
            this.LLILZLL = EnumC1088900eRU.ICON_WITH_TEXT;
        } else {
            this.LLILZLL = EnumC1088900eRU.ICON;
        }
        this.dataChannel.EQ2(this, DutyGiftChangedEvent.class, new AObjectS360S0100000_17(this, 153));
        int i = 0;
        if (objArr != null && objArr.length > 0) {
            Object obj = objArr[0];
            if (obj instanceof List) {
                this.LL = (List) obj;
                if (C497740JfY.LJJ()) {
                    Collections.reverse(this.LL);
                }
            }
        }
        EnumC1088870eRR.RIGHT.createHolder(this.dataChannel, this.LLILLJJLI, this.LL, this.LLILZLL);
        if (this.context != null && !this.LLILLL && getView() != null && (getView().getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getView().getLayoutParams();
            if (!this.LLILZ && C497740JfY.LJJ()) {
                marginLayoutParams.leftMargin = LLIZ;
                if (this.LLILZIL) {
                    i = LLIZLLLIL;
                }
                marginLayoutParams.rightMargin = i;
            } else {
                marginLayoutParams.rightMargin = LLIZ;
                if (this.LLILZIL) {
                    i = LLIZLLLIL;
                }
                marginLayoutParams.leftMargin = i;
            }
            C786410Ut5.W5(getView(), marginLayoutParams);
        }
        if (!ToolBarButtonWithTextExperiment.hasText() && this.context != null && this.LLILLL && getView() != null && (getView().getLayoutParams() instanceof ViewGroup.MarginLayoutParams) && C497740JfY.LJJ()) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) getView().getLayoutParams();
            if (this.LLILZ) {
                marginLayoutParams2.leftMargin = LLIZ;
            }
            C786410Ut5.W5(getView(), marginLayoutParams2);
        }
    }
}
