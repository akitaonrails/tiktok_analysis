package com.bytedance.android.livesdk.broadcast.preview.widget;

import X.C0IJT;
import X.C0ULZ;
import X.C0UPY;
import X.C0UPZ;
import X.C0UQX;
import X.C13LE;
import X.C354201Zc;
import X.C474500IjA;
import X.C500260Jjc;
import X.C760180Trs;
import X.C770220UJg;
import X.C771740UPc;
import X.C786410Ut5;
import Y.ACListenerS79S0300000_12;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.preview.PreviewWidget;
import com.bytedance.android.livesdk.broadcast.PreviewBlockInfoChannel;
import com.bytedance.android.livesdk.dataChannel.AccessRecallVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.LiveAccessTipsShowChannel;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class LiveAccessRecallWidget extends PreviewWidget {
    public LiveMode LLILZ = LiveMode.VIDEO;
    public final Map<LiveMode, C0UPZ> LLILZIL = new LinkedHashMap();
    public final Map<LiveMode, Boolean> LLILZLL = new LinkedHashMap();
    public C0UPZ LLIZ;

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void D1() {
        this.LLILLL = false;
        this.dataChannel.zW(LiveAccessTipsShowChannel.class, Boolean.FALSE);
        C770220UJg c770220UJg = C770220UJg.LIZ;
        C770220UJg.LJ(C13LE.LIZ(AccessRecallVisibilityChannel.class));
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.i11;
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final boolean G1() {
        Boolean bool = (Boolean) this.dataChannel.gg0(LiveAccessTipsShowChannel.class);
        return (((LinkedHashMap) this.LLILZIL).get(this.LLILZ) == null || (bool != null ? bool.booleanValue() : false)) ? false : true;
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void C1() {
        super.C1();
        LiveMode liveMode = (LiveMode) this.dataChannel.gg0(LiveModeChannel.class);
        if (liveMode == null) {
            liveMode = LiveMode.VIDEO;
        }
        this.LLILZ = liveMode;
        H1();
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void E1() {
        super.E1();
        hide();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.EQ2(this, RoomCreateInfoChannel.class, new AwS591S0100000_12(this, 1047));
            dataChannel.EQ2(this, PreviewBlockInfoChannel.class, new AwS591S0100000_12(this, 1048));
        }
    }

    public final void H1() {
        ViewGroup viewGroup;
        C771740UPc c771740UPc;
        View view;
        C771740UPc c771740UPc2;
        ViewGroup viewGroup2;
        boolean zG1 = G1();
        if (zG1) {
            C0UPZ c0upz = (C0UPZ) ((LinkedHashMap) this.LLILZIL).get(this.LLILZ);
            this.LLIZ = c0upz;
            View view2 = getView();
            String str = null;
            if ((view2 instanceof ViewGroup) && (viewGroup2 = (ViewGroup) view2) != null) {
                C786410Ut5.LJJJJI(viewGroup2);
            }
            View view3 = getView();
            if ((view3 instanceof ViewGroup) && (viewGroup = (ViewGroup) view3) != null) {
                DataChannel dataChannel = this.dataChannel;
                Object objGg0 = dataChannel != null ? dataChannel.gg0(LiveModeChannel.class) : null;
                if (C760180Trs.LJI() && (objGg0 == LiveMode.SCREEN_RECORD || objGg0 == LiveMode.THIRD_PARTY)) {
                    C0ULZ c0ulz = new C0ULZ(getContext());
                    c0ulz.setTag(c0upz != null ? c0upz.LIZ : null);
                    c0ulz.setTitle(c0upz != null ? c0upz.LIZIZ : null);
                    c0ulz.setSubTitle(c0upz != null ? c0upz.LIZJ : null);
                    c0ulz.LIZ();
                    if (c0upz != null && (c771740UPc2 = c0upz.LIZLLL) != null) {
                        str = c771740UPc2.LIZJ;
                    }
                    if (C500260Jjc.LJJIIZ(str)) {
                        c0ulz.setRightIcon(true);
                        C786410Ut5.Xa(c0ulz, new ACListenerS79S0300000_12(this, c0ulz, c0upz, 1));
                        view = c0ulz;
                    } else {
                        c0ulz.setRightIcon(false);
                        view = c0ulz;
                    }
                } else {
                    C0UPY c0upy = new C0UPY(getContext());
                    c0upy.setTag(c0upz != null ? c0upz.LIZ : null);
                    c0upy.setTitle(c0upz != null ? c0upz.LIZIZ : null);
                    c0upy.setSubTitle(c0upz != null ? c0upz.LIZJ : null);
                    if (c0upz != null && (c771740UPc = c0upz.LIZLLL) != null) {
                        str = c771740UPc.LIZJ;
                    }
                    if (C500260Jjc.LJJIIZ(str)) {
                        c0upy.setRightIcon(true);
                        C786410Ut5.E7(c0upy, new ACListenerS79S0300000_12(this, c0upy, c0upz, 2));
                        view = c0upy;
                    } else {
                        c0upy.setRightIcon(false);
                        view = c0upy;
                    }
                }
                viewGroup.addView(view);
            }
        }
        I1(zG1);
    }

    public final void I1(boolean z) {
        String str;
        C0UPZ c0upz;
        String str2;
        String str3;
        String str4;
        Long l;
        if (z) {
            if (this.dataChannel.gg0(PreviewBlockInfoChannel.class) != null) {
                hide();
                this.dataChannel.zW(LiveAccessTipsShowChannel.class, Boolean.FALSE);
                C770220UJg c770220UJg = C770220UJg.LIZ;
                C770220UJg.LJ(C13LE.LIZ(AccessRecallVisibilityChannel.class));
                return;
            }
            show();
            if (Intrinsics.LJFF(((LinkedHashMap) this.LLILZLL).get(this.LLILZ), Boolean.FALSE) && (c0upz = this.LLIZ) != null) {
                DataChannel dataChannel = this.dataChannel;
                C771740UPc c771740UPc = c0upz.LIZLLL;
                String str5 = null;
                if (c771740UPc != null) {
                    str2 = c771740UPc.LIZLLL;
                    str3 = c771740UPc.LJ;
                    str4 = c771740UPc.LJFF;
                    l = c771740UPc.LJI;
                } else {
                    str2 = null;
                    str3 = null;
                    str4 = null;
                    l = null;
                }
                C0UQX.LJJIIZI(dataChannel, str2, str3, str4, l);
                this.LLILZLL.put(this.LLILZ, Boolean.TRUE);
                C771740UPc c771740UPc2 = c0upz.LIZLLL;
                if (c771740UPc2 != null) {
                    str5 = c771740UPc2.LIZJ;
                }
                if (C500260Jjc.LJJIIZ(str5)) {
                    ((LinkedHashMap) this.LLILZLL).clear();
                }
            }
            C0UQX.LJIIIIZZ(this.dataChannel, "show", "access_revoke_banner", this.LLILZ.logStreamingType);
            this.dataChannel.zW(LiveAccessTipsShowChannel.class, Boolean.TRUE);
            C770220UJg c770220UJg2 = C770220UJg.LIZ;
            C770220UJg.LIZLLL(C13LE.LIZ(AccessRecallVisibilityChannel.class));
            DataChannel dataChannel2 = this.dataChannel;
            LiveMode liveMode = this.LLILZ;
            if (C354201Zc.LJ(liveMode)) {
                str = "livesdk_obs_revoke_remind";
            } else {
                str = "livesdk_takepage_access_revoke_remind";
            }
            C474500IjA c474500IjALIZ = C0IJT.LIZ(str);
            c474500IjALIZ.LJIJJLI(dataChannel2);
            c474500IjALIZ.LJJ(liveMode.logStreamingType);
            c474500IjALIZ.LIZ();
            return;
        }
        hide();
        this.dataChannel.zW(LiveAccessTipsShowChannel.class, Boolean.FALSE);
        C770220UJg c770220UJg3 = C770220UJg.LIZ;
        C770220UJg.LJ(C13LE.LIZ(AccessRecallVisibilityChannel.class));
    }
}
