package com.bytedance.android.livesdk.broadcast.preview.widget;

import X.C168D;
import X.C1697810uHb;
import X.C2188811AlT;
import X.C426160GnO;
import X.C497740JfY;
import X.C500260Jjc;
import X.C810670Vr7;
import X.C814420VxA;
import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.model.LivePermissionApplyResponse;
import com.bytedance.android.live.broadcast.preview.PreviewWidget;
import com.bytedance.android.livesdk.broadcast.BannerNotifyEvent;
import com.bytedance.android.livesdk.broadcast.PermissionApplyInfoChannel;
import com.bytedance.android.livesdk.dataChannel.LiveAccessTipsShowChannel;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.user.ApplyLivePermission;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class PreviewApplyWidget extends PreviewWidget {
    public Integer LLILZIL;
    public boolean LLILZLL;
    public C426160GnO LLJ;
    public final ApplyLivePermission LLILZ = (ApplyLivePermission) DataChannelGlobal.LLILZ.gg0(C168D.class);
    public final Map<String, Boolean> LLIZ = new LinkedHashMap();
    public final List<String> LLIZLLLIL = C1697810uHb.LJIIJJI("live", "live_by_record", "computer");

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.i0x;
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final LiveMode G1() {
        LiveMode liveMode;
        DataChannel dataChannel = this.dataChannel;
        return (dataChannel == null || (liveMode = (LiveMode) dataChannel.gg0(LiveModeChannel.class)) == null) ? LiveMode.VIDEO : liveMode;
    }

    public final void I1() {
        Integer num;
        TextView textView;
        Map map;
        LivePermissionApplyResponse.PermissionApplyInfo permissionApplyInfo;
        Map map2;
        LivePermissionApplyResponse.PermissionApplyInfo permissionApplyInfo2;
        Map map3;
        LivePermissionApplyResponse.PermissionApplyInfo permissionApplyInfo3;
        Integer num2;
        SharedPreferences sharedPreferencesLIZJ;
        SharedPreferences.Editor editorEdit;
        TextView textView2;
        List<String> list = this.LLIZLLLIL;
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (true ^ Intrinsics.LJFF(str, H1())) {
                arrayList.add(str);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            this.LLIZ.put((String) it2.next(), Boolean.FALSE);
        }
        if (J1() && (num2 = this.LLILZIL) != null && num2.intValue() == 0 && !this.LLILZLL) {
            View view = getView();
            if ((view instanceof TextView) && (textView2 = (TextView) view) != null) {
                textView2.setText(C497740JfY.LJIJI(2131842663));
            }
            Context context = this.context;
            String strName = G1().name();
            String strValueOf = String.valueOf(UserService.getInstance().user().getCurrentUserId());
            if (context != null && (sharedPreferencesLIZJ = C810670Vr7.LIZJ(context, 0, "Congrats")) != null && (editorEdit = sharedPreferencesLIZJ.edit()) != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(strValueOf);
                sbLIZ.append(strName);
                sbLIZ.append("ever_show_congrats");
                editorEdit.putBoolean(C2188811AlT.LIZIZ(sbLIZ), true);
                editorEdit.apply();
            }
            this.LLIZ.put(H1(), Boolean.TRUE);
            show();
        } else if (L1() && (num = this.LLILZIL) != null && num.intValue() == 0) {
            DataChannel dataChannel = this.dataChannel;
            int i = (dataChannel == null || (map3 = (Map) dataChannel.gg0(PermissionApplyInfoChannel.class)) == null || (permissionApplyInfo3 = (LivePermissionApplyResponse.PermissionApplyInfo) map3.get(H1())) == null) ? 0 : permissionApplyInfo3.mNeedLiveTime;
            DataChannel dataChannel2 = this.dataChannel;
            if ((dataChannel2 == null || (map2 = (Map) dataChannel2.gg0(PermissionApplyInfoChannel.class)) == null || (permissionApplyInfo2 = (LivePermissionApplyResponse.PermissionApplyInfo) map2.get(H1())) == null || permissionApplyInfo2.mApplySource == 0) && i > 0) {
                float fLIZIZ = C814420VxA.LIZIZ(((float) (((double) i) / 3600.0d)) * r1) / 10;
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
                DataChannel dataChannel3 = this.dataChannel;
                int i2 = (dataChannel3 == null || (map = (Map) dataChannel3.gg0(PermissionApplyInfoChannel.class)) == null || (permissionApplyInfo = (LivePermissionApplyResponse.PermissionApplyInfo) map.get(H1())) == null) ? 0 : permissionApplyInfo.mApplyInvalidTime;
                View view2 = getView();
                if ((view2 instanceof TextView) && (textView = (TextView) view2) != null) {
                    textView.setText(C497740JfY.LJIIL(2131755561, i, String.valueOf(fLIZIZ), simpleDateFormat.format(Long.valueOf(((long) i2) * 1000))));
                }
                show();
            }
        } else {
            hide();
        }
        C426160GnO c426160GnO = this.LLJ;
        if (c426160GnO != null) {
            C500260Jjc.LJJLJ((int) C497740JfY.LIZIZ(isShowing() ? 24.0f : 16.0f), c426160GnO);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean J1() {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.broadcast.preview.widget.PreviewApplyWidget.J1():boolean");
    }

    public final boolean L1() {
        Map map;
        LivePermissionApplyResponse.PermissionApplyInfo permissionApplyInfo;
        DataChannel dataChannel = this.dataChannel;
        boolean z = (dataChannel == null || (map = (Map) dataChannel.gg0(PermissionApplyInfoChannel.class)) == null || (permissionApplyInfo = (LivePermissionApplyResponse.PermissionApplyInfo) map.get(H1())) == null || permissionApplyInfo.mApplyStatus != 1) ? false : true;
        Boolean bool = (Boolean) this.dataChannel.gg0(LiveAccessTipsShowChannel.class);
        return z && !(bool != null ? bool.booleanValue() : false);
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        Integer num = this.LLILZIL;
        if (num == null || num.intValue() != 0 || this.LLILZLL) {
            return;
        }
        if (J1() || L1()) {
            super.show();
        }
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void C1() {
        super.C1();
        I1();
        C426160GnO c426160GnO = this.LLJ;
        if (c426160GnO != null) {
            C500260Jjc.LJJLJ((int) C497740JfY.LIZIZ(isShowing() ? 24.0f : 16.0f), c426160GnO);
        }
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void E1() {
        super.E1();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.EQ2(this, PermissionApplyInfoChannel.class, new AwS591S0100000_12(this, 247));
            dataChannel.EQ2(this, LiveAccessTipsShowChannel.class, new AwS591S0100000_12(this, 248));
            dataChannel.EQ2(this, RoomCreateInfoChannel.class, new AwS591S0100000_12(this, 249));
            dataChannel.EQ2(this, BannerNotifyEvent.class, new AwS591S0100000_12(this, 250));
        }
    }

    public final String H1() {
        return G1().getModeFromServer();
    }
}
