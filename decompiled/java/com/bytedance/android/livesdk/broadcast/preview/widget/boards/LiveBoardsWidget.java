package com.bytedance.android.livesdk.broadcast.preview.widget.boards;

import X.AnonymousClass0956;
import X.AnonymousClass1687;
import X.C01QL;
import X.C054G;
import X.C0IJT;
import X.C0JJO;
import X.C0KPJ;
import X.C0PEM;
import X.C0UOP;
import X.C0UX6;
import X.C1083940eJU;
import X.C1113800f5e;
import X.C1161920gLG;
import X.C1790620whI;
import X.C1826730xdX;
import X.C20441214yg;
import X.C2296808zG;
import X.C23250099c;
import X.C473410IhP;
import X.C474500IjA;
import X.C497740JfY;
import X.C500260Jjc;
import X.C504670Jqj;
import X.C517530KRj;
import X.C5183020f;
import X.C748880TZe;
import X.C758370Tox;
import X.C758400Tp0;
import X.C758410Tp1;
import X.C758470Tp7;
import X.C760180Trs;
import X.C766270U4b;
import X.C771670UOv;
import X.EnumC1120860fH2;
import X.EnumC1815680xLi;
import X.EnumC586000Myc;
import X.InterfaceC390601fU;
import X.InterfaceC513260KAy;
import X.InterfaceC758420Tp2;
import Y.ARunnableS112S0100000_12;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.BroadcastLiveBoardEvent;
import com.bytedance.android.live.broadcast.api.SMBDecorationBoardsPermissionChannel;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.effect.api.PreviewRevisionOpenBoardEvent;
import com.bytedance.android.live.uikit.reddot.RedDotExtensionKt;
import com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget;
import com.bytedance.android.livesdk.comp.api.pcs.IPcsService;
import com.bytedance.android.livesdk.comp.api.pcs.data.setting.SmbGoLivePageUnifyEnable;
import com.bytedance.android.livesdk.comp.api.pcs.ui.decoration.ExitBoardManagement;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiguestNoticeboardV2Setting;
import com.bytedance.android.livesdk.rank.api.BoardsPermissionChannel;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS123S1000000_12;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public class LiveBoardsWidget extends PreviewToolBaseWidget {
    public AnonymousClass0956 LLJ;
    public final Boolean LLJILJIL;
    public boolean LLJILJILJ;
    public final List<EnumC1815680xLi> LLJILLL;
    public Bundle LLJJ;
    public String LLJJI;
    public boolean LLJJIII;
    public boolean LLJJIJI;
    public InterfaceC758420Tp2 LLJJIJIIJIL;
    public final int LLILZLL = 2131851416;
    public final int LLIZ = R.drawable.enb;
    public final C054G LLIZLLLIL = C2296808zG.LIZ(C0PEM.LIZ);
    public final long LLJI = 20000;
    public boolean LLJIJIL = true;

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
        return Integer.valueOf(this.LLIZ);
    }

    public final void Y1() {
        InterfaceC758420Tp2 interfaceC758420Tp2 = this.LLJJIJIIJIL;
        if (interfaceC758420Tp2 != null) {
            interfaceC758420Tp2.LIZ(EnumC586000Myc.OPEN_BOARDS);
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_decoration_entrance");
        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "anchor_id");
        c474500IjALIZ.LJJII(String.valueOf(C500260Jjc.LJJLIIIJ(this.dataChannel)), "room_id");
        c474500IjALIZ.LJJII(this.LLJJI, "decoration_entrance");
        c474500IjALIZ.LJJII((this.LLJILJIL.booleanValue() || !C0KPJ.of.LIZIZ().booleanValue()) ? CardStruct.IStatusCode.DEFAULT : "1", "has_bubble");
        c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(RedDotExtensionKt.LJIILLIIL(C0UX6.LIVE_BROADCAST_PREVIEW_GUIDE_BOARD_INTELLIGENT_NEW_BATCH) || RedDotExtensionKt.LJIILLIIL(C0UX6.LIVE_BROADCAST_PREVIEW_DECORATION_ENTRANCE))) ? 1 : 0), "has_red_dot");
        c474500IjALIZ.LJJII("click", "action_type");
        DataChannel dataChannel = this.dataChannel;
        c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(C1083940eJU.LIZIZ(dataChannel != null ? C500260Jjc.LJJLIIIIJ(dataChannel) : null))) ? 1 : 0), "is_smb_creator");
        c474500IjALIZ.LIZ();
        if (MultiguestNoticeboardV2Setting.INSTANCE.isPreviewEnable()) {
            b2(this.LLJJI);
        } else {
            a2(this.LLJJI);
        }
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void onShow() {
        InterfaceC513260KAy interfaceC513260KAyLIZIZ;
        C0UOP c0uop;
        Boolean bool;
        DataChannel dataChannel = this.dataChannel;
        if ((dataChannel == null || (bool = (Boolean) dataChannel.gg0(C758400Tp0.class)) == null || !bool.booleanValue()) && !this.LLJIJIL) {
            if (!this.LLJJIII && (interfaceC513260KAyLIZIZ = C1826730xdX.LIZIZ()) != null) {
                int iHashCode = hashCode();
                String str = this.LLJJI;
                long jCurrentTimeMillis = System.currentTimeMillis();
                DataChannel dataChannel2 = this.dataChannel;
                interfaceC513260KAyLIZIZ.LIZLLL("BoardEntranceBeforeLive", new C517530KRj(iHashCode, 40, jCurrentTimeMillis - ((dataChannel2 == null || (c0uop = (C0UOP) dataChannel2.gg0(C758410Tp1.class)) == null) ? 0L : c0uop.LIZ), str, null));
            }
            if (!this.LLJJIII) {
                C473410IhP.LIZJ(new ARunnableS112S0100000_12(new AwS556S0100000_12(this, 897), 82), Mp4ScreenVideoLoadTimeout.CONTROL);
            }
            this.LLJIJIL = true;
        }
    }

    public LiveBoardsWidget() {
        C0KPJ.hf.LIZIZ();
        this.LLJILJIL = C0KPJ.of.LIZIZ();
        this.LLJILLL = new ArrayList();
        this.LLJJI = "live_take_page";
        this.LLJJIII = true;
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void C1() {
        super.C1();
        if (C500260Jjc.LJJJJIZL(getView())) {
            C760180Trs.LJIIJJI(this.dataChannel, "boards");
        }
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void E1() {
        super.E1();
        if (SmbGoLivePageUnifyEnable.INSTANCE.getValue()) {
            this.dataChannel.EQ2(this, SMBDecorationBoardsPermissionChannel.class, new C5183020f(this, 94));
        } else {
            C20441214yg.LIZIZ("GoLivePageApi", "LiveBoardsWidget.requestCombinePermissionAPI");
            C23250099c.LIZLLL(this.LLIZLLLIL, C0PEM.LIZJ, null, new C01QL(this, null), 2);
        }
        hide();
        this.LLJIJIL = false;
        DataChannelGlobal.LLILZ.EQ2(this, this, BroadcastLiveBoardEvent.class, new AwS591S0100000_12(this, 339));
        this.dataChannel.EQ2(this, BoardsPermissionChannel.class, new AwS591S0100000_12(this, 340));
        this.dataChannel.BQ2(this, ExitBoardManagement.class, new C5183020f(this, 95));
        this.dataChannel.BQ2(this, PreviewRevisionOpenBoardEvent.class, new AwS591S0100000_12(this, 341));
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        ((IPcsService) C1161920gLG.LIZJ(IPcsService.class)).ei().LJIIIIZZ();
        C1790620whI.LJIIJ();
        if (this.LLJIJIL && !this.LLJJIII) {
            new AwS556S0100000_12(this, 897).invoke();
        }
        C2296808zG.LIZJ(this.LLIZLLLIL, null);
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final int O1() {
        return this.LLILZLL;
    }

    public final void W1(boolean z) {
        if (z) {
            ((ArrayList) this.LLJILLL).add(EnumC1815680xLi.GENERAL);
        }
        if (MultiguestNoticeboardV2Setting.INSTANCE.isPreviewEnable()) {
            ((ArrayList) this.LLJILLL).add(EnumC1815680xLi.MULTI_GUEST);
        }
        if ((!((ArrayList) this.LLJILLL).isEmpty()) && !this.LLJJIII) {
            show();
        } else {
            hide();
        }
        Bundle bundle = this.LLJJ;
        if (bundle != null) {
            String string = bundle.getString("show_entrance");
            if (string == null) {
                string = "preview";
            }
            this.LLJJI = string;
            if (C504670Jqj.LIZ(bundle.getString("enter_edit", CardStruct.IStatusCode.DEFAULT), "1")) {
                C500260Jjc.LJJLIIIJJIZ(new AwS556S0100000_12(this, 183));
            } else if (!((ArrayList) this.LLJILLL).isEmpty()) {
                a2(this.LLJJI);
            } else {
                C766270U4b.LJIIIZ(this.context, C497740JfY.LJIJI(2131851568));
            }
            this.LLJJ = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x016b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void X1(X.C470590Icr<webcast.api.smb.SMBGoLivePageResponse.Data> r14) {
        /*
            Method dump skipped, instruction units count: 503
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.broadcast.preview.widget.boards.LiveBoardsWidget.X1(X.0Icr):void");
    }

    public final void a2(String str) {
        InterfaceC390601fU effectBoardService = ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getEffectBoardService("anchor", "");
        if (effectBoardService != null) {
            effectBoardService.LJIIL(this, null);
        }
        b2(str);
        C1113800f5e c1113800f5e = C1113800f5e.LIZ;
        C1113800f5e.LIZJ(EnumC1120860fH2.GUIDE_BOARD_INTELLIGENCE);
    }

    public final void b2(String str) {
        boolean z;
        Long l;
        if (this.dataChannel.gg0(C748880TZe.class) != null) {
            C758470Tp7 c758470Tp7LIZ = C771670UOv.LIZ();
            if (c758470Tp7LIZ != null && c758470Tp7LIZ.LJFF) {
                z = true;
            } else {
                z = false;
            }
            if (C758370Tox.LIZ() && C758370Tox.LIZJ()) {
                C758370Tox.LIZIZ(this.dataChannel, new AwS123S1000000_12(str, 0));
                return;
            }
            C758470Tp7 c758470Tp7LIZ2 = C771670UOv.LIZ();
            if (c758470Tp7LIZ2 != null && c758470Tp7LIZ2.LIZJ && (((l = (Long) DataChannelGlobal.LLILZ.gg0(AnonymousClass1687.class)) == null || l.longValue() <= 0) && z)) {
                ((IPcsService) C1161920gLG.LIZJ(IPcsService.class)).xf().LJII(C0KPJ.nf.LIZIZ().longValue(), this.dataChannel, str);
                return;
            }
            C0JJO c0jjoXf = ((IPcsService) C1161920gLG.LIZJ(IPcsService.class)).xf();
            DataChannel dataChannel = this.dataChannel;
            Bundle bundle = this.LLJJ;
            if (bundle == null) {
                bundle = new Bundle();
            }
            c0jjoXf.LIZJ(str, null, dataChannel, bundle, null);
        }
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public void onClick(View view) {
        this.LLJJI = "live_take_page";
        Y1();
        RedDotExtensionKt.LIZ(C0UX6.LIVE_BROADCAST_PREVIEW_DECORATION_ENTRANCE);
        C758470Tp7 c758470Tp7LIZ = C771670UOv.LIZ();
        if (c758470Tp7LIZ != null && c758470Tp7LIZ.LIZJ) {
            RedDotExtensionKt.LIZ(C0UX6.LIVE_BROADCAST_PREVIEW_GUIDE_BOARD_INTELLIGENT_NEW_BATCH);
        }
    }
}
