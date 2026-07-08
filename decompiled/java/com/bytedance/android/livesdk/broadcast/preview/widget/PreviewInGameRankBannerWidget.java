package com.bytedance.android.livesdk.broadcast.preview.widget;

import X.C0IZJ;
import X.C0J1N;
import X.C0ULT;
import X.C1161920gLG;
import X.C11PQ;
import X.C11RD;
import X.C13LP;
import X.C1701940uOG;
import X.C20337914i1;
import X.C20441214yg;
import X.C2188811AlT;
import X.C497740JfY;
import X.C500260Jjc;
import X.C753880Thi;
import X.C760180Trs;
import X.C770620UKu;
import X.C786410Ut5;
import X.InterfaceC772390URp;
import Y.AfS181S0100000_12;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.banner.BannerWidget;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.comp.api.game.service.IGameService;
import com.bytedance.android.livesdk.dataChannel.GameRoomCreateInfoChannel;
import com.bytedance.android.livesdk.dataChannel.PreviewPagerSelectedGameItem;
import com.bytedance.android.livesdk.livesetting.game.GameRankMessageSetting;
import com.bytedance.android.livesdk.model.GameTag;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.AwS591S0100000_12;
import webcast.api.game.InGameInfo;
import webcast.api.game.InGameRankSettingResponse;
import wh6.AbS694S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class PreviewInGameRankBannerWidget extends BannerWidget {
    public GameTag LLJI;
    public InGameInfo LLJIJIL;
    public InGameRankSettingResponse.ResponseData LLJILJIL;
    public LiveDialogFragment LLJILJILJ;
    public Integer LLJILLL;
    public final String LLJJ = "live_in_game_rank_banner";

    @Override // com.bytedance.android.live.broadcast.banner.BannerWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void N1() {
        C11PQ<InGameRankSettingResponse.ResponseData> c11pqKl0 = ((IGameService) C1161920gLG.LIZJ(IGameService.class)).kl0(this, false);
        if (c11pqKl0 != null) {
            ((C0J1N) c11pqKl0.LJLIIL(1L).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZJ(C11RD.LJ(this))).LIZJ(new AfS181S0100000_12(this, 66));
        }
    }

    @Override // com.bytedance.android.live.broadcast.banner.BannerWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() throws Exception {
        int iLIZ;
        C20441214yg.LJIIIZ("InGameRankBannerWidget", "show()");
        GameTag gameTag = this.LLJI;
        InGameInfo inGameInfo = this.LLJIJIL;
        InGameRankSettingResponse.ResponseData responseData = this.LLJILJIL;
        if (gameTag == null || inGameInfo == null) {
            return;
        }
        GameRankMessageSetting gameRankMessageSetting = GameRankMessageSetting.INSTANCE;
        if (!gameRankMessageSetting.isDefault()) {
            if (responseData == null) {
                return;
            }
            if (responseData.inGameRankSettingStatus == 1) {
                C20441214yg.LJIIIZ("InGameRankBannerWidget", "in game rank setting is opening");
                return;
            }
        }
        if (C500260Jjc.LJJIFFI(Boolean.valueOf(inGameInfo.showInGameRank))) {
            C20441214yg.LJIIIZ("InGameRankBannerWidget", "it's not in game rank anchor");
            return;
        }
        if (!C13LP.LJJJJ(gameTag.id, inGameInfo.allowGuideGametagIds)) {
            C20441214yg.LJIIIZ("InGameRankBannerWidget", "gameTag not contains");
            return;
        }
        if (gameTag.isNonGameOrOtherGameItem()) {
            C20441214yg.LJIIIZ("InGameRankBannerWidget", "gameTag isNonGameOrOtherGameItem");
            return;
        }
        if (C770620UKu.LIZ(InterfaceC772390URp.f0.LIZIZ().longValue(), System.currentTimeMillis())) {
            C20441214yg.LJIIIZ("InGameRankBannerWidget", "is same day");
            return;
        }
        if (gameRankMessageSetting.isDefault()) {
            if (responseData == null) {
                C20441214yg.LJIIIZ("InGameRankBannerWidget", "in game rank setting is null");
                N1();
                return;
            } else if (responseData.inGameRankSettingStatus == 1) {
                C20441214yg.LJIIIZ("InGameRankBannerWidget", "in game rank setting is opening");
                return;
            }
        }
        Map<String, String> mapLIZIZ = InterfaceC772390URp.f131e0.LIZIZ();
        Long l = gameTag.id;
        String str = mapLIZIZ.get(l != null ? l.toString() : null);
        if (str != null) {
            iLIZ = C0IZJ.LIZ(str);
            if (iLIZ >= 3) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("has show time ");
                sbLIZ.append(iLIZ);
                sbLIZ.append(" id = ");
                sbLIZ.append(gameTag.id);
                C20441214yg.LJIIIZ("InGameRankBannerWidget", C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
        } else {
            iLIZ = 0;
        }
        this.LLJILLL = Integer.valueOf(iLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("show() id = ");
        sbLIZ2.append(gameTag.id);
        C20441214yg.LJIIIZ("InGameRankBannerWidget", C2188811AlT.LIZIZ(sbLIZ2));
        super.show();
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void E1() {
        super.E1();
        Long lLIZIZ = InterfaceC772390URp.f0.LIZIZ();
        if (C770620UKu.LIZ(lLIZIZ.longValue(), System.currentTimeMillis())) {
            return;
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.EQ2(this, PreviewPagerSelectedGameItem.class, new AwS591S0100000_12(this, 272));
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.EQ2(this, GameRoomCreateInfoChannel.class, new AwS591S0100000_12(this, 273));
        }
        if (!GameRankMessageSetting.INSTANCE.isDefault()) {
            N1();
        }
        View view = getView();
        if (view != null) {
            C786410Ut5.I7(new AbS694S0100000_12(this, 12), view);
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return C760180Trs.LJI() ? R.layout.i1c : R.layout.i1b;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        Integer num;
        Long l;
        super.onDestroy();
        if (this.LLJI == null || (num = this.LLJILLL) == null) {
            return;
        }
        int iIntValue = num.intValue();
        GameTag gameTag = this.LLJI;
        String string = (gameTag == null || (l = gameTag.id) == null) ? null : l.toString();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onShow() id = ");
        GameTag gameTag2 = this.LLJI;
        sbLIZ.append(gameTag2 != null ? gameTag2.id : null);
        C20441214yg.LJIIIZ("InGameRankBannerWidget", C2188811AlT.LIZIZ(sbLIZ));
        C20337914i1<Map<String, String>> c20337914i1 = InterfaceC772390URp.f131e0;
        Map<String, String> mapLIZIZ = c20337914i1.LIZIZ();
        mapLIZIZ.put(string, String.valueOf(iIntValue + 1));
        c20337914i1.LJFF(mapLIZIZ);
    }

    @Override // com.bytedance.android.live.broadcast.banner.BannerWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void onShow() {
        C0ULT c0ult;
        super.onShow();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.SX0(C753880Thi.class, Boolean.TRUE);
        }
        if (C760180Trs.LJI()) {
            View view = getView();
            if (!(view instanceof C0ULT) || (c0ult = (C0ULT) view) == null) {
                return;
            }
            c0ult.setTitle(C497740JfY.LJIJI(2131841849));
            c0ult.setSubTitle(C497740JfY.LJIJI(2131853558));
            c0ult.setRightIcon(true);
            c0ult.setLeftIcon(R.raw.icon_ranking);
        }
    }

    @Override // com.bytedance.android.live.broadcast.banner.BannerWidget
    public final String H1() {
        return this.LLJJ;
    }
}
