package com.bytedance.android.livesdk.broadcast.preview.widget.setting;

import X.C0IJT;
import X.C0UKZ;
import X.C0UTJ;
import X.C0UX6;
import X.C1113800f5e;
import X.C1548820qPI;
import X.C19322110iZ;
import X.C20337914i1;
import X.C262100zr;
import X.C354201Zc;
import X.C464790IKn;
import X.C473410IhP;
import X.C474500IjA;
import X.C500260Jjc;
import X.C748880TZe;
import X.C782710Un7;
import X.C786410Ut5;
import X.EnumC1120860fH2;
import X.EnumC754620Tiu;
import X.InterfaceC1106030et7;
import X.InterfaceC1141530foN;
import Y.ARunnableS112S0100000_12;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.uikit.reddot.RedDotExtensionKt;
import com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget;
import com.bytedance.android.livesdk.broadcast.settingpage.LiveHostSettingFragmentSheet;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.livesetting.LiveLogSampleConfigSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.AnchorPreviewBottomFirstLoadOptABSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveHostSettingsUIConfig;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.HashSet;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public class PreviewSettingWidget extends PreviewToolBaseWidget implements InterfaceC1141530foN {
    public boolean LLIZ;
    public C0UTJ LLIZLLLIL;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public Boolean LLJILJILJ;
    public Boolean LLJILLL;
    public boolean LLJJ;
    public boolean LLJJI;
    public boolean LLJJIII;
    public long LLILZLL = -1;
    public final int LLJ = 2131853493;
    public final int LLJI = R.drawable.ers;

    @Override // X.InterfaceC782830UnJ
    public final boolean LLLII() {
        return false;
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final Integer J1() {
        return Integer.valueOf(this.LLJI);
    }

    public final void a2() {
        LiveMode liveMode;
        LiveMode liveMode2;
        DataChannel dataChannel = this.dataChannel;
        if (C500260Jjc.LJJJI((dataChannel == null || (liveMode2 = (LiveMode) dataChannel.gg0(LiveModeChannel.class)) == null) ? null : Boolean.valueOf(C354201Zc.LIZLLL(liveMode2)))) {
            RedDotExtensionKt.LIZ(C0UX6.LIVE_BROADCAST_PREVIEW_SETTING);
        }
        if (this.LLJIJIL) {
            RedDotExtensionKt.LIZ(C0UX6.RECORD_COMMENTS_GIFTS_IN_SETTING);
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_takepage_settings_click");
        c474500IjALIZ.LJIJJLI(this.dataChannel);
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 == null || (liveMode = (LiveMode) dataChannel2.gg0(LiveModeChannel.class)) == null) {
            liveMode = LiveMode.VIDEO;
        }
        c474500IjALIZ.LJJII(C354201Zc.LIZ(liveMode), "live_type");
        c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(S1())) ? 1 : 0), "have_red_dot");
        c474500IjALIZ.LJJII(Integer.valueOf(PreviewToolBaseWidget.G1(getView())), "index");
        c474500IjALIZ.LJJII(this.LLJILJIL ? "1" : CardStruct.IStatusCode.DEFAULT, "has_ai_bubble");
        c474500IjALIZ.LJJII(this.LLJJ ? "1" : CardStruct.IStatusCode.DEFAULT, "has_highlight_bubble");
        c474500IjALIZ.LIZ();
        this.LLJJ = false;
        C20337914i1<Boolean> c20337914i1 = C0UKZ.LJLJLJ;
        Boolean bool = Boolean.FALSE;
        c20337914i1.LJFF(bool);
        C0UKZ.LLJJ.LJFF(bool);
        C20337914i1<Map<String, Boolean>> c20337914i12 = InterfaceC1106030et7.D4;
        Map<String, Boolean> mapLIZIZ = c20337914i12.LIZIZ();
        mapLIZIZ.put(CardStruct.IStatusCode.DEFAULT, bool);
        c20337914i12.LJFF(mapLIZIZ);
        H1();
        C782710Un7 c782710Un7 = C782710Un7.LIZ;
        C0UX6 c0ux6 = C0UX6.LIVE_AUTO_POST_LIVING_PREVIEW_SETTING_GUIDE_DIRECT;
        c782710Un7.getClass();
        HashSet<C0UX6> hashSet = C782710Un7.LJIILJJIL;
        hashSet.remove(c0ux6);
        hashSet.remove(C0UX6.LIVE_AUTO_POST_LIVING_PREVIEW_SETTING_GUIDE_WITH_POPUP);
        X1(null, false, this.LLJJI);
        this.LLJJI = false;
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void onHide() {
        if (this.LLIZ) {
            C1113800f5e c1113800f5e = C1113800f5e.LIZ;
            C1113800f5e.LIZJ(EnumC1120860fH2.GUIDE_PRACTICE_MODE);
        }
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget
    public void C1() {
        super.C1();
        if (C500260Jjc.LJJJJIZL(getView())) {
            W1();
            if (AnchorPreviewBottomFirstLoadOptABSetting.INSTANCE.enable()) {
                C473410IhP.LIZJ(new ARunnableS112S0100000_12(this, 89), 1000L);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x021f  */
    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E1() {
        /*
            Method dump skipped, instruction units count: 600
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.broadcast.preview.widget.setting.PreviewSettingWidget.E1():void");
    }

    public final void W1() {
        LiveMode liveMode;
        C474500IjA c474500IjALIZIZ = C0IJT.LIZIZ("livesdk_live_takepage_settings_show", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_0()));
        c474500IjALIZIZ.LJIJJLI(this.dataChannel);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel == null || (liveMode = (LiveMode) dataChannel.gg0(LiveModeChannel.class)) == null) {
            liveMode = LiveMode.VIDEO;
        }
        c474500IjALIZIZ.LJJII(C354201Zc.LIZ(liveMode), "live_type");
        c474500IjALIZIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(S1())) ? 1 : 0), "have_red_dot");
        c474500IjALIZIZ.LIZ();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        this.LLIZLLLIL = null;
        C1548820qPI.LJIIIIZZ("ttlive_show_setting_dialog", this);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01fc A[ADDED_TO_REGION] */
    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onShow() {
        /*
            Method dump skipped, instruction units count: 583
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.broadcast.preview.widget.setting.PreviewSettingWidget.onShow():void");
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final int O1() {
        return this.LLJ;
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        if (Intrinsics.LJFF(c262100zr.LIZ, "ttlive_show_setting_dialog")) {
            a2();
        }
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public void onClick(View view) {
        a2();
    }

    public final void X1(String str, boolean z, boolean z2) {
        String str2;
        if (C464790IKn.LIZ.LIZIZ(this.LLILZLL)) {
            return;
        }
        Boolean bool = this.LLJILJILJ;
        Boolean bool2 = Boolean.TRUE;
        if (Intrinsics.LJFF(bool, bool2)) {
            this.LLJILJILJ = Boolean.FALSE;
            str2 = "auto_scroll_item_live_recordings_settings_popup";
        } else if (Intrinsics.LJFF(this.LLJILLL, bool2)) {
            this.LLJILLL = Boolean.FALSE;
            str2 = "auto_scroll_item_live_recordings_settings_red_dot";
        } else {
            str2 = "";
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("scroll_to_record_comments_gifts", z);
        if (str != null) {
            C786410Ut5.LJJJI("enter_from", str, bundle);
        }
        bundle.putBoolean("is_record_comments_gifts_red_dot_show", this.LLJIJIL);
        C786410Ut5.LJJJI("auto_scroll_item", str2, bundle);
        bundle.putBoolean("show_location_high_light", z2);
        if (LiveHostSettingsUIConfig.enable()) {
            FragmentManager fragmentManager = (FragmentManager) this.dataChannel.gg0(C748880TZe.class);
            LiveHostSettingFragmentSheet liveHostSettingFragmentSheet = new LiveHostSettingFragmentSheet(EnumC754620Tiu.LIVE_PREVIEW, this.dataChannel, null);
            liveHostSettingFragmentSheet.setArguments(bundle);
            this.LLILZLL = C19322110iZ.LJ(fragmentManager, liveHostSettingFragmentSheet, null, "base_preview_setting_main", null, 0, bundle);
            return;
        }
        this.LLILZLL = C19322110iZ.LIZLLL((FragmentManager) this.dataChannel.gg0(C748880TZe.class), BasePreviewSettingMainFragmentSheet.class, "base_preview_setting_main", null, bundle);
    }
}
