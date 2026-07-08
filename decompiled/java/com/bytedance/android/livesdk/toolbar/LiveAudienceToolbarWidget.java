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
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.gift.DutyGiftChangedEvent;
import com.bytedance.android.live.toolbar.IToolbarService;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.ies.sdk.widgets.RecycleSource;
import com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class LiveAudienceToolbarWidget extends RoomRecycleWidget {
    public static final int LLIZ = (int) C497740JfY.LIZIZ(8.0f);
    public static final int LLIZLLLIL = (int) C497740JfY.LIZIZ(4.0f);
    public View LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public EnumC1088900eRU LLILZLL;
    public List<EnumC1102750enp> LL = new ArrayList();
    public boolean LLILZIL = false;

    @Override // com.bytedance.android.widget.Widget
    public int getLayoutId() {
        return R.layout.ht0;
    }

    @Override // com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget, com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object... objArr) {
        this.LLILLJJLI = getView();
    }

    @Override // com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget, com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget
    public final void onUnload(RecycleSource recycleSource) {
        super.onUnload(recycleSource);
        this.LL.clear();
        ((IToolbarService) C1161920gLG.LIZJ(IToolbarService.class)).Mn1(this.dataChannel).Ok(this.dataChannel);
    }

    public EnumC1088900eRU y1(boolean z) {
        if (z) {
            return EnumC1088900eRU.ICON_WITH_TEXT;
        }
        return EnumC1088900eRU.ICON;
    }

    @Override // com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget, com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget
    public final void onLoad(RecycleSource recycleSource, Object... objArr) {
        View view;
        super.onLoad(recycleSource, objArr);
        this.LLILLL = ((Boolean) this.dataChannel.gg0(UserIsAnchorChannel.class)).booleanValue();
        this.LLILZ = ((Boolean) this.dataChannel.gg0(C0TZM.class)).booleanValue();
        View view2 = getView();
        this.LLILLJJLI = view2;
        int i = 0;
        view2.setLayoutDirection(0);
        this.LLILLL = ((Boolean) this.dataChannel.gg0(UserIsAnchorChannel.class)).booleanValue();
        this.LLILZ = ((Boolean) this.dataChannel.gg0(C0TZM.class)).booleanValue();
        boolean zEquals = Boolean.TRUE.equals(this.dataChannel.gg0(C780690Ujr.class));
        this.LLILZIL = zEquals;
        this.LLILZLL = y1(zEquals);
        this.dataChannel.EQ2(this, DutyGiftChangedEvent.class, new AObjectS360S0100000_17(this, 152));
        if (objArr != null && objArr.length > 0) {
            Object obj = objArr[0];
            if (obj instanceof List) {
                this.LL = (List) obj;
            }
        }
        if (C497740JfY.LJJ()) {
            Collections.reverse(this.LL);
        }
        x1(this.LL, this.LLILZLL);
        if (this.context != null && !this.LLILLL && (view = this.contentView) != null && (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.contentView.getLayoutParams();
            if (!this.LLILZ && C497740JfY.LJJ()) {
                marginLayoutParams.leftMargin = LLIZ;
                if (this.LLILZIL) {
                    i = LLIZLLLIL;
                }
                marginLayoutParams.rightMargin = i;
            }
            C786410Ut5.W5(this.contentView, marginLayoutParams);
        }
    }

    public void x1(List<EnumC1102750enp> list, EnumC1088900eRU enumC1088900eRU) {
        if (this.LLILLJJLI instanceof ViewGroup) {
            ((IToolbarService) C1161920gLG.LIZJ(IToolbarService.class)).Mn1(this.dataChannel).LJII(this.dataChannel, EnumC1088870eRR.RIGHT, (ViewGroup) this.LLILLJJLI);
        }
    }
}
