package com.bytedance.android.livesdk.broadcast.preview.widget.partnership;

import X.C01GU;
import X.C0IJT;
import X.C1119920fFW;
import X.C1161920gLG;
import X.C1548820qPI;
import X.C1871910yoP;
import X.C1CC2;
import X.C20337914i1;
import X.C20441214yg;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C262100zr;
import X.C354201Zc;
import X.C474500IjA;
import X.C497740JfY;
import X.C5183020f;
import X.C760180Trs;
import X.C773650UWl;
import X.C786410Ut5;
import X.InterfaceC1107590evd;
import X.InterfaceC1141530foN;
import X.InterfaceC772390URp;
import X.ViewOnClickListenerC512201z6;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.api.GamePartnershipNoticeChannel;
import com.bytedance.android.live.broadcast.banner.BannerWidget;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.broadcast.PartnershipEventPermissionChannel;
import com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.dataChannel.PreviewPagerSelectedGameItem;
import com.bytedance.android.livesdk.game.model.PartnershipGameEvent;
import com.bytedance.android.livesdk.model.GameTag;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class GameEventPreviewBanner extends BannerWidget implements InterfaceC1141530foN {
    public boolean LLJIJIL;
    public List<PartnershipGameEvent> LLJILJIL;
    public boolean LLJILJILJ;
    public PartnershipGameEvent LLJILLL;
    public boolean LLJI = true;
    public final String LLJJ = "game_partnership_event_banner";

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.hyy;
    }

    @Override // com.bytedance.android.live.broadcast.banner.BannerWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.banner.BannerWidget
    public final void J1() {
        String str;
        C20337914i1<Map<Long, Integer>> c20337914i1 = InterfaceC772390URp.R;
        Map<Long, Integer> mapLIZIZ = c20337914i1.LIZIZ();
        PartnershipGameEvent partnershipGameEvent = this.LLJILLL;
        Long lValueOf = partnershipGameEvent != null ? Long.valueOf(partnershipGameEvent.gameTagId) : null;
        Map<Long, Integer> mapLIZIZ2 = c20337914i1.LIZIZ();
        PartnershipGameEvent partnershipGameEvent2 = this.LLJILLL;
        Integer num = mapLIZIZ2.get(partnershipGameEvent2 != null ? Long.valueOf(partnershipGameEvent2.gameTagId) : null);
        mapLIZIZ.put(lValueOf, num != null ? Integer.valueOf(num.intValue() + 1) : null);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_gamepad_btn_show");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII("live_start", "page_name");
        c474500IjALIZ.LJJII(this.LLILZIL, "live_type");
        c474500IjALIZ.LJJII("activity_banner", "btn_name");
        PartnershipGameEvent partnershipGameEvent3 = this.LLJILLL;
        if (partnershipGameEvent3 == null || (str = partnershipGameEvent3.gameName) == null) {
            str = "";
        }
        c474500IjALIZ.LJJII(str, "game_name");
        PartnershipGameEvent partnershipGameEvent4 = this.LLJILLL;
        c474500IjALIZ.LJJII(Long.valueOf(O1(partnershipGameEvent4 != null ? partnershipGameEvent4.gameIdStr : null)), "game_id");
        PartnershipGameEvent partnershipGameEvent5 = this.LLJILLL;
        c474500IjALIZ.LJJII(Long.valueOf(O1(partnershipGameEvent5 != null ? partnershipGameEvent5.taskIdStr : null)), "game_task_id");
        c474500IjALIZ.LIZ();
    }

    public final void N1() {
        this.dataChannel.SX0(C773650UWl.class, this.LLJILJIL);
        DataChannel dataChannel = this.dataChannel;
        PartnershipGameEvent partnershipGameEvent = null;
        GameTag gameTag = dataChannel != null ? (GameTag) dataChannel.gg0(PreviewPagerSelectedGameItem.class) : null;
        List<PartnershipGameEvent> list = this.LLJILJIL;
        if (list != null) {
            Iterator<PartnershipGameEvent> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                PartnershipGameEvent next = it2.next();
                PartnershipGameEvent partnershipGameEvent2 = next;
                if (gameTag != null) {
                    long j = partnershipGameEvent2.gameTagId;
                    Long l = gameTag.id;
                    if (l != null && j == l.longValue()) {
                        partnershipGameEvent = next;
                        break;
                    }
                }
            }
            PartnershipGameEvent partnershipGameEvent3 = partnershipGameEvent;
            if (partnershipGameEvent3 != null) {
                this.LLJILLL = partnershipGameEvent3;
                if (!this.LLJIJIL && this.LLJI && !partnershipGameEvent3.anchorHasJoined) {
                    this.LLJIJIL = true;
                    show();
                }
                this.LLJI = false;
            }
        }
    }

    @Override // com.bytedance.android.live.broadcast.banner.BannerWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() throws Exception {
        if (this.LLJIJIL) {
            C20337914i1<Map<Long, Integer>> c20337914i1 = InterfaceC772390URp.R;
            Map<Long, Integer> mapLIZIZ = c20337914i1.LIZIZ();
            PartnershipGameEvent partnershipGameEvent = this.LLJILLL;
            Integer num = mapLIZIZ.get(partnershipGameEvent != null ? Long.valueOf(partnershipGameEvent.gameTagId) : null);
            if (num == null) {
                num = 0;
                Map<Long, Integer> mapLIZIZ2 = c20337914i1.LIZIZ();
                PartnershipGameEvent partnershipGameEvent2 = this.LLJILLL;
                mapLIZIZ2.put(partnershipGameEvent2 != null ? Long.valueOf(partnershipGameEvent2.gameTagId) : null, num);
            }
            Map<Long, Boolean> mapLIZIZ3 = InterfaceC772390URp.S.LIZIZ();
            PartnershipGameEvent partnershipGameEvent3 = this.LLJILLL;
            if (Intrinsics.LJFF(mapLIZIZ3.get(partnershipGameEvent3 != null ? Long.valueOf(partnershipGameEvent3.gameTagId) : null), Boolean.TRUE) || num.intValue() < 2) {
                if (!C760180Trs.LJI()) {
                    super.show();
                    return;
                }
                DataChannel dataChannel = this.dataChannel;
                if (dataChannel != null) {
                    dataChannel.zW(GamePartnershipNoticeChannel.class, this.LLJILLL);
                }
            }
        }
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void E1() {
        LiveIconView liveIconView;
        TextView textView;
        super.E1();
        hide();
        View view = getView();
        if (view != null && (textView = (TextView) view.findViewById(R.id.heg)) != null) {
            String strLJIJI = C497740JfY.LJIJI(2131841821);
            String strLJIJI2 = C497740JfY.LJIJI(2131841822);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('\n');
            sbLIZ.append(strLJIJI2);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C786410Ut5.j4(strLJIJI, Arrays.copyOf(new Object[]{C2188811AlT.LIZIZ(sbLIZ)}, 1)));
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(-1);
            try {
                C1119920fFW.LJ(this.context, spannableStringBuilder, spannableStringBuilder.length() - strLJIJI2.length(), spannableStringBuilder.length(), 33, 9, 500);
                C786410Ut5.q2(spannableStringBuilder, foregroundColorSpan, spannableStringBuilder.length() - strLJIJI2.length(), spannableStringBuilder.length(), 33);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("index error: ");
                sbLIZ2.append(e);
                C20441214yg.LIZLLL(C2188811AlT.LIZIZ(sbLIZ2));
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("index error: ");
                sbLIZ3.append(e);
                C1CC2.LIZ(C2188811AlT.LIZIZ(sbLIZ3), e);
            }
            textView.setText(spannableStringBuilder);
        }
        View view2 = getView();
        if (view2 != null) {
            C786410Ut5.I7(new ViewOnClickListenerC512201z6(this, 26), view2);
        }
        View view3 = getView();
        if (view3 != null && (liveIconView = (LiveIconView) view3.findViewById(R.id.hes)) != null) {
            C786410Ut5.g8(liveIconView, new ViewOnClickListenerC512201z6(this, 27));
        }
        this.dataChannel.EQ2(this, PartnershipEventPermissionChannel.class, new C5183020f(this, 97));
        C1548820qPI.LIZLLL("signInPartnershipEvent", this);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        C1548820qPI.LJIIIIZZ("signInPartnershipEvent", this);
    }

    @Override // com.bytedance.android.live.broadcast.banner.BannerWidget
    public final String H1() {
        return this.LLJJ;
    }

    public final long O1(String str) {
        Long lValueOf = -1L;
        if (str == null) {
            return -1L;
        }
        try {
            lValueOf = Long.valueOf(CastLongProtector.parseLong(str));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("gameId is not number, e:");
            sbLIZ.append(e);
            C20441214yg.LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
        }
        if (lValueOf == null) {
            return -1L;
        }
        return lValueOf.longValue();
    }

    public final void P1(String str) {
        String str2;
        String str3;
        String str4;
        LiveMode liveMode;
        PartnershipGameEvent partnershipGameEvent = this.LLJILLL;
        String strLIZ = "";
        if (partnershipGameEvent == null || (str2 = partnershipGameEvent.eventDetailUrl) == null) {
            str2 = "";
        }
        String strEncode = URLEncoder.encode(str2, "UTF-8");
        Pair[] pairArr = new Pair[5];
        PartnershipGameEvent partnershipGameEvent2 = this.LLJILLL;
        if (partnershipGameEvent2 == null || (str3 = partnershipGameEvent2.eventIdStr) == null) {
            str3 = "";
        }
        pairArr[0] = new Pair("event_id", str3);
        pairArr[1] = new Pair("event_detail_url", strEncode);
        PartnershipGameEvent partnershipGameEvent3 = this.LLJILLL;
        if (partnershipGameEvent3 == null || (str4 = partnershipGameEvent3.gameIdStr) == null) {
            str4 = "";
        }
        pairArr[2] = new Pair("game_id", str4);
        pairArr[3] = new Pair("page_from", str);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (liveMode = (LiveMode) dataChannel.gg0(LiveModeChannel.class)) != null) {
            strLIZ = C354201Zc.LIZ(liveMode);
        }
        pairArr[4] = new Pair("live_type", strLIZ);
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
        if (this.context != null && ((IGamePartnershipService) C1161920gLG.LIZJ(IGamePartnershipService.class)).oK0() != null) {
            C01GU.LJII(C786410Ut5.N3(this.context), mapLJIIIIZZ);
        }
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        String str;
        String strLJFF;
        if (Intrinsics.LJFF(c262100zr.LIZ, "signInPartnershipEvent")) {
            InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
            String str2 = "";
            if (interfaceC1107590evd != null && (strLJFF = C1871910yoP.LJFF(interfaceC1107590evd, "eventID", "")) != null) {
                str2 = strLJFF;
            }
            PartnershipGameEvent partnershipGameEvent = this.LLJILLL;
            if (partnershipGameEvent != null) {
                str = partnershipGameEvent.eventIdStr;
            } else {
                str = null;
            }
            if (Intrinsics.LJFF(str2, str)) {
                hide();
                this.LLJIJIL = false;
            }
        }
    }
}
