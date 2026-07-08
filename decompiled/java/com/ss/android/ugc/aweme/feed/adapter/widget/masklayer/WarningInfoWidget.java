package com.ss.android.ugc.aweme.feed.adapter.widget.masklayer;

import X.C0GYO;
import X.C0IJT;
import X.C0IUA;
import X.C1602160rnK;
import X.C1ACA;
import X.C474500IjA;
import X.C488810JEx;
import X.InterfaceC20673515v3;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.Text;
import com.ss.android.ugc.aweme.feed.model.live.WarningTag;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;

/* JADX INFO: loaded from: classes8.dex */
public final class WarningInfoWidget extends LiveWatchPreviewWidget {
    public C0GYO LLJ;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.df4;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
    }

    public final void M1() {
        LiveRoomStruct liveRoomStruct;
        WarningTag warningTag;
        String str;
        String str2;
        LiveRoomStruct liveRoomStruct2;
        C1ACA c1acaZ1 = z1();
        WarningTag warningTag2 = (c1acaZ1 == null || (liveRoomStruct2 = c1acaZ1.LIZJ) == null) ? null : liveRoomStruct2.warningTag;
        C0GYO c0gyo = this.LLJ;
        if (c0gyo != null) {
            int visibility = c0gyo.getVisibility();
            c0gyo.setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, c0gyo);
        }
        C488810JEx c488810JEx = C488810JEx.LIZ;
        C0GYO c0gyo2 = this.LLJ;
        Text text = warningTag2 != null ? warningTag2.text : null;
        c488810JEx.getClass();
        if (c0gyo2 != null && text != null) {
            com.bytedance.android.livesdk.model.message.common.Text text2 = new com.bytedance.android.livesdk.model.message.common.Text();
            String str3 = text.key;
            text2.key = str3;
            String str4 = text.defaultPattern;
            text2.defaultPattern = str4;
            String strLJJLI = TextUtils.isEmpty(str3) ? null : ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4().LJJLI(text2.key);
            InterfaceC20673515v3 interfaceC20673515v3K4 = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4();
            if (!TextUtils.isEmpty(strLJJLI)) {
                str4 = strLJJLI;
            }
            c0gyo2.setInfoText(interfaceC20673515v3K4.LJJI(text2, str4));
        }
        C1ACA c1acaZ12 = z1();
        if (c1acaZ12 == null || (liveRoomStruct = c1acaZ12.LIZJ) == null || (warningTag = liveRoomStruct.warningTag) == null) {
            return;
        }
        long j = liveRoomStruct.id;
        long anchorId = liveRoomStruct.getAnchorId();
        C0IUA.LIZLLL = j;
        C0IUA.LJFF = anchorId;
        HashMap map = new HashMap();
        Text text3 = warningTag.text;
        if (text3 == null || (str = text3.key) == null) {
            str = "";
        }
        map.put("warning_reason", str);
        map.put("user_type", "user");
        C1ACA c1acaZ13 = z1();
        if (c1acaZ13 == null || (str2 = c1acaZ13.LIZLLL) == null) {
            str2 = "homepage_hot";
        }
        map.put("enter_from_merge", str2);
        map.put("enter_method", "live_cell");
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_bottom_message_show");
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LJJII("show", "action_type");
        c474500IjALIZ.LJJII(3, "message_type");
        c474500IjALIZ.LIZ();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        this.LLJ = (C0GYO) findViewById(R.id.warning_info);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        super.onLoad(objArr);
        M1();
    }
}
