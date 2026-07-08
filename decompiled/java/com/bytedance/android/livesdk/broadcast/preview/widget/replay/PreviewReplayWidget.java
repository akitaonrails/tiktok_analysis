package com.bytedance.android.livesdk.broadcast.preview.widget.replay;

import X.C01GW;
import X.C0IJT;
import X.C0JT6;
import X.C0UKZ;
import X.C13LE;
import X.C1697810uHb;
import X.C1CC2;
import X.C20736316Cj;
import X.C2188811AlT;
import X.C452501pT;
import X.C474500IjA;
import X.C497740JfY;
import X.C760180Trs;
import X.C770220UJg;
import X.C785810Us7;
import X.C786410Ut5;
import X.InterfaceC772190UQv;
import Y.ACListenerS147S0100000_12;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.banner.BannerWidget;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.dataChannel.ReplayInfluenceBannerChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveReplayAvailableDaysSetting;
import com.bytedance.android.livesdk.livesetting.game.LiveIsReplayBannerFluencyDownNumber;
import com.bytedance.android.livesdk.livesetting.game.LiveIsReplayBannerShowTenTimesRegionSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes13.dex */
public final class PreviewReplayWidget extends BannerWidget {
    public final C01GW LLJI;
    public final String LLJIJIL;

    @Override // com.bytedance.android.live.broadcast.banner.BannerWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.banner.BannerWidget
    public final void J1() {
        if (this.LLIZLLLIL) {
            C1CC2.LJII(0, "ttlive_live_replay_faq_show_all", new HashMap());
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_takepage_replay_banner_show");
            c474500IjALIZ.LJJ(this.LLILZIL);
            c474500IjALIZ.LJII((String) this.LLJI.getValue());
            c474500IjALIZ.LIZ();
        }
    }

    public final boolean N1() {
        DataChannel dataChannel = this.dataChannel;
        Object objGg0 = dataChannel != null ? dataChannel.gg0(LiveModeChannel.class) : null;
        if (C760180Trs.LJI()) {
            return objGg0 == LiveMode.SCREEN_RECORD || objGg0 == LiveMode.THIRD_PARTY;
        }
        return false;
    }

    public final boolean Q1() {
        return LiveIsReplayBannerShowTenTimesRegionSetting.INSTANCE.getValue() || O1();
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void onHide() {
        C770220UJg c770220UJg = C770220UJg.LIZ;
        C770220UJg.LJ(C13LE.LIZ(ReplayInfluenceBannerChannel.class));
    }

    public PreviewReplayWidget() {
        this.LLILZLL = O1() ? Integer.MAX_VALUE : LiveIsReplayBannerShowTenTimesRegionSetting.INSTANCE.getValue() ? LiveIsReplayBannerFluencyDownNumber.INSTANCE.getValue() : 1;
        this.LLJI = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(71));
        this.LLJIJIL = "replay_banner";
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void E1() {
        TextView textView;
        ImageView imageView;
        super.E1();
        View view = getView();
        if (view != null && (imageView = (ImageView) view.findViewById(R.id.pfm)) != null) {
            C786410Ut5.Q7(imageView, new ACListenerS147S0100000_12(this, 158));
        }
        String strLJIJI = C497740JfY.LJIJI(2131842403);
        String strLJIJI2 = C497740JfY.LJIJI(2131844059);
        String strLJIJI3 = C497740JfY.LJIJI(2131841533);
        if (strLJIJI3 == null) {
            strLJIJI3 = "";
        }
        String strLJIJI4 = C497740JfY.LJIJI(2131841534);
        if (strLJIJI4 == null) {
            strLJIJI4 = "";
        }
        String strLJIJI5 = C497740JfY.LJIJI(2131841535);
        String str = strLJIJI5 != null ? strLJIJI5 : "";
        int value = LiveReplayAvailableDaysSetting.INSTANCE.getValue();
        String strLJIJJ = Q1() ? C497740JfY.LJIJJ(2131843971, strLJIJI3, strLJIJI4, Integer.valueOf(value), str) : C497740JfY.LJIJJ(2131843972, Integer.valueOf(value), strLJIJI2);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strLJIJJ);
        sbLIZ.append(' ');
        sbLIZ.append(strLJIJI);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C2188811AlT.LIZIZ(sbLIZ));
        int length = strLJIJJ != null ? strLJIJJ.length() : 0;
        if (N1()) {
            C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(C20736316Cj.LIZIZ(R.attr.c9k, this.context)), 0, length, 33);
        }
        C786410Ut5.q2(spannableStringBuilder, new C785810Us7(this, 0), length + 1, spannableStringBuilder.length(), 33);
        C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(-1), length, spannableStringBuilder.length(), 33);
        if (!N1()) {
            if (Q1()) {
                for (String str2 : C1697810uHb.LJIIJJI(strLJIJI3, strLJIJI4, str)) {
                    Integer numValueOf = Integer.valueOf(a0.LJJJ(strLJIJJ, str2, 0, false, 6));
                    if (numValueOf.intValue() > 0) {
                        int iIntValue = numValueOf.intValue();
                        C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(-1), iIntValue, str2.length() + iIntValue, 17);
                    }
                }
            } else {
                int iLJJJ = a0.LJJJ(strLJIJJ, strLJIJI2, 0, false, 6);
                if (iLJJJ == -1) {
                    return;
                } else {
                    C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(-1), iLJJJ, strLJIJI2.length() + iLJJJ, 33);
                }
            }
        }
        View view2 = getView();
        if (view2 == null || (textView = (TextView) view2.findViewById(R.id.pfs)) == null) {
            return;
        }
        textView.setText(spannableStringBuilder);
        textView.setLinksClickable(true);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public final boolean O1() {
        return UserService.getInstance().user().getCurrentUser().getSecret() == 1;
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return N1() ? R.layout.gjd : R.layout.gjc;
    }

    @Override // com.bytedance.android.live.broadcast.banner.BannerWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void onShow() throws Exception {
        super.onShow();
        if (this.LLJ == LiveMode.VIDEO) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LLILZIL);
            sbLIZ.append(this.LLJIJIL);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            C0JT6<String> c0jt6 = InterfaceC772190UQv.D3;
            String strLIZIZ2 = c0jt6.LIZIZ(strLIZIZ);
            if (strLIZIZ2 == null) {
                strLIZIZ2 = CardStruct.IStatusCode.DEFAULT;
            }
            c0jt6.LIZLLL(String.valueOf(CastIntegerProtector.parseInt(strLIZIZ2) + 1), strLIZIZ);
        }
        C770220UJg c770220UJg = C770220UJg.LIZ;
        C770220UJg.LIZLLL(C13LE.LIZ(ReplayInfluenceBannerChannel.class));
        if (this.LLIZLLLIL) {
            return;
        }
        C1CC2.LJII(0, "ttlive_live_replay_faq_show_all", new HashMap());
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_takepage_replay_banner_show");
        c474500IjALIZ.LJJ(this.LLILZIL);
        c474500IjALIZ.LJII((String) this.LLJI.getValue());
        c474500IjALIZ.LIZ();
    }

    @Override // com.bytedance.android.live.broadcast.banner.BannerWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() throws Exception {
        if (O1()) {
            C0JT6<Boolean> c0jt6 = C0UKZ.LLJI;
            Boolean boolLIZIZ = c0jt6.LIZIZ(LiveMode.SCREEN_RECORD.logStreamingType);
            if (boolLIZIZ != null && !boolLIZIZ.booleanValue()) {
                return;
            }
            Boolean boolLIZIZ2 = c0jt6.LIZIZ(LiveMode.VIDEO.logStreamingType);
            if (boolLIZIZ2 != null && !boolLIZIZ2.booleanValue()) {
                return;
            }
            Boolean boolLIZIZ3 = c0jt6.LIZIZ(LiveMode.THIRD_PARTY.logStreamingType);
            if (boolLIZIZ3 != null && !boolLIZIZ3.booleanValue()) {
                return;
            }
        } else {
            C0JT6<Boolean> c0jt62 = C0UKZ.LLJ;
            Boolean boolLIZIZ4 = c0jt62.LIZIZ(LiveMode.SCREEN_RECORD.logStreamingType);
            if (boolLIZIZ4 != null && !boolLIZIZ4.booleanValue()) {
                return;
            }
            Boolean boolLIZIZ5 = c0jt62.LIZIZ(LiveMode.VIDEO.logStreamingType);
            if (boolLIZIZ5 != null && !boolLIZIZ5.booleanValue()) {
                return;
            }
            Boolean boolLIZIZ6 = c0jt62.LIZIZ(LiveMode.THIRD_PARTY.logStreamingType);
            if (boolLIZIZ6 != null && !boolLIZIZ6.booleanValue()) {
                return;
            }
        }
        C0JT6<String> c0jt63 = InterfaceC772190UQv.D3;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LiveMode.THIRD_PARTY.logStreamingType);
        sbLIZ.append(this.LLJIJIL);
        String strLIZIZ = c0jt63.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
        String str = CardStruct.IStatusCode.DEFAULT;
        if (strLIZIZ == null) {
            strLIZIZ = CardStruct.IStatusCode.DEFAULT;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(LiveMode.SCREEN_RECORD.logStreamingType);
        sbLIZ2.append(this.LLJIJIL);
        String strLIZIZ2 = c0jt63.LIZIZ(C2188811AlT.LIZIZ(sbLIZ2));
        if (strLIZIZ2 == null) {
            strLIZIZ2 = CardStruct.IStatusCode.DEFAULT;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(LiveMode.VIDEO.logStreamingType);
        sbLIZ3.append(this.LLJIJIL);
        String strLIZIZ3 = c0jt63.LIZIZ(C2188811AlT.LIZIZ(sbLIZ3));
        if (strLIZIZ3 != null) {
            str = strLIZIZ3;
        }
        if (this.LLILZLL > CastIntegerProtector.parseInt(strLIZIZ) + CastIntegerProtector.parseInt(strLIZIZ2) + CastIntegerProtector.parseInt(str)) {
            super.show();
        }
    }

    @Override // com.bytedance.android.live.broadcast.banner.BannerWidget
    public final String H1() {
        return this.LLJIJIL;
    }

    public final void P1(String str) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_takepage_replay_banner_click");
        c474500IjALIZ.LJJ(this.LLILZIL);
        c474500IjALIZ.LJII((String) this.LLJI.getValue());
        c474500IjALIZ.LJJII(str, "click_position");
        c474500IjALIZ.LIZ();
    }
}
