package com.bytedance.android.livesdk.broadcast.preview;

import X.C0IJT;
import X.C13LE;
import X.C1533950q1J;
import X.C16F5;
import X.C16FV;
import X.C2188811AlT;
import X.C474500IjA;
import X.C5183020f;
import X.C770220UJg;
import X.InterfaceC1106030et7;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.model.UnifiedBannerData;
import com.bytedance.android.live.broadcast.preview.PreviewWidget;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.dataChannel.LiveJourney2BannerChannel;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class PreviewLiveJourneyBannerWidget extends PreviewWidget {
    public String LLILZ;
    public C16F5 LLILZIL;
    public C16FV LLILZLL;
    public LiveIconView LLIZ;
    public final Map<String, String> LLIZLLLIL = new LinkedHashMap();
    public UnifiedBannerData LLJ;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.hhn;
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void onHide() {
        C770220UJg c770220UJg = C770220UJg.LIZ;
        C770220UJg.LJ(C13LE.LIZ(LiveJourney2BannerChannel.class));
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void onShow() {
        C770220UJg c770220UJg = C770220UJg.LIZ;
        C770220UJg.LIZLLL(C13LE.LIZ(LiveJourney2BannerChannel.class));
        UnifiedBannerData unifiedBannerData = this.LLJ;
        if (unifiedBannerData != null) {
            H1(unifiedBannerData, null);
        }
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void C1() {
        super.C1();
        hide();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.EQ2(this, RoomCreateInfoChannel.class, new C5183020f(this, 87));
        }
    }

    public final void G1(String str, Map<String, String> map) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ(str);
        if (map != null && (!map.isEmpty())) {
            c474500IjALIZ.LJJIIZI(map);
        }
        c474500IjALIZ.LIZ();
    }

    public final void H1(UnifiedBannerData unifiedBannerData, String str) {
        int i;
        String str2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(unifiedBannerData.frequencyKey);
        sbLIZ.append('_');
        sbLIZ.append(UserService.getInstance().user().getCurrentUserId());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        String strValueOf = "200";
        if (C1533950q1J.LJ(str)) {
            Map<String, String> map = this.LLIZLLLIL;
            if (str == null) {
                str = "200";
            }
            map.put(strLIZIZ, str);
        } else if (this.LLIZLLLIL.containsKey(strLIZIZ)) {
            try {
                str2 = (String) ((LinkedHashMap) this.LLIZLLLIL).get(strLIZIZ);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (str2 != null) {
                i = CastIntegerProtector.parseInt(str2);
            } else {
                i = 0;
            }
            Map<String, String> map2 = this.LLIZLLLIL;
            if (i < 2) {
                strValueOf = String.valueOf(i + 1);
            }
            map2.put(strLIZIZ, strValueOf);
        } else {
            this.LLIZLLLIL.put(strLIZIZ, "1");
        }
        InterfaceC1106030et7.C7.LJFF(this.LLIZLLLIL);
    }
}
