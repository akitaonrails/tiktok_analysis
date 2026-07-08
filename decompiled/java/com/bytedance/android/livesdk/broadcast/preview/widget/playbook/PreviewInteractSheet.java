package com.bytedance.android.livesdk.broadcast.preview.widget.playbook;

import X.C01C3;
import X.C0UKZ;
import X.C0UX6;
import X.C1119170fEJ;
import X.C1161920gLG;
import X.C1AI0;
import X.C1AI1;
import X.C1AI2;
import X.C20736316Cj;
import X.C475510Ikn;
import X.C497740JfY;
import X.C500260Jjc;
import X.C781270Ukn;
import X.C786410Ut5;
import X.C978370bZD;
import X.InterfaceC774000UXu;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.uikit.reddot.RedDotExtensionKt;
import com.bytedance.android.livesdk.broadcast.GiftFeatureChannel;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel;
import com.bytedance.android.livesdk.livesetting.gift.ViewerWishesConfig;
import com.bytedance.android.livesdk.livesetting.linkmic.PlaybookEditorUgcSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS245S0000000_12;
import kotlin.jvm.internal.AwS378S0200000_12;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class PreviewInteractSheet extends LiveSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KjcjKCswKTY4Zz8hHELIOSLTMlLDh9PywoLionZjUgKDYxJyonZx8hLTMlLDgaJjEpOy4wPBYkLCon";
    public int LLJLLL;
    public boolean LLJZ;
    public boolean LLJZIJLIL;
    public boolean LLL;
    public boolean LLLF;

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C1119170fEJ gS() {
        C1119170fEJ c1119170fEJ = new C1119170fEJ();
        c1119170fEJ.LIZ(C497740JfY.LJIJI(2131842196));
        c1119170fEJ.LJI = false;
        return c1119170fEJ;
    }

    public final boolean uS() {
        return this.LLL && this.LLLF && ViewerWishesConfig.INSTANCE.getGetValue().anchorEnabled;
    }

    public final Map<String, String> wS() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = CardStruct.IStatusCode.DEFAULT;
        linkedHashMap.put("is_in_live", CardStruct.IStatusCode.DEFAULT);
        linkedHashMap.put("live_status", "not_live");
        if (C781270Ukn.LJIILJJIL().yK2(C475510Ikn.LJ(this)) != null) {
            str = "1";
        }
        linkedHashMap.put("is_in_playbook", str);
        return linkedHashMap;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final int QM(Context context) {
        return C20736316Cj.LIZIZ(R.attr.ezn, context);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.LIZ(0, null);
        return sheetOptions;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int i;
        boolean z;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        boolean z2 = false;
        if (arguments != null) {
            i = arguments.getInt("index");
        } else {
            i = 0;
        }
        this.LLJLLL = i;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            z = arguments2.getBoolean("has_bubble");
        } else {
            z = false;
        }
        this.LLJZ = z;
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            z2 = arguments3.getBoolean("has_poll");
        }
        this.LLJZIJLIL = z2;
    }

    public final void yS(View view) {
        View viewFindViewById = view.findViewById(R.id.viewer_wishes);
        View viewFindViewById2 = view.findViewById(R.id.t16);
        if (Intrinsics.LJFF(C0UKZ.LJLJJLL.LIZIZ(), Boolean.FALSE)) {
            RedDotExtensionKt.LJI(viewFindViewById2, this, null, C0UX6.LIVE_VIEWER_WISHES_PREVIEW_GUIDE, null);
        }
        C500260Jjc.LLFFF(viewFindViewById);
        if (C500260Jjc.LJJJJIZL(viewFindViewById2)) {
            C1AI2 c1ai2 = new C1AI2("show", null, "go_live_page", null, null, null, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, null, null, 0, null, 0L, -6, 2097151);
            C1AI1.LIZ(c1ai2, C475510Ikn.LJ(this), true);
            C1AI0.LJIIZILJ(c1ai2);
        }
        C1AI2 c1ai22 = new C1AI2("show", null, "go_live_page", null, null, null, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, null, null, 0, null, 0L, -6, 2097151);
        C1AI1.LIZ(c1ai22, C475510Ikn.LJ(this), true);
        C1AI0.LJIILIIL(c1ai22);
        C500260Jjc.LJLIIIL(500L, viewFindViewById, new AwS378S0200000_12(viewFindViewById2, this, 26));
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (this.LLJZIJLIL) {
            C01C3.LJ(C475510Ikn.LJ(this), "go_live_interaction_panel", "video_live", false, this.LLJZ, true);
            View viewFindViewById = view.findViewById(R.id.xpk);
            C500260Jjc.LLFFF(viewFindViewById);
            C500260Jjc.LJLIIIL(500L, viewFindViewById, new AwS586S0100000_7(this, 52));
        }
        if (((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).JF0()) {
            View viewFindViewById2 = view.findViewById(R.id.qof);
            View viewFindViewById3 = view.findViewById(R.id.qsw);
            C500260Jjc.LLFFF(viewFindViewById2);
            C500260Jjc.LJLIIIL(500L, viewFindViewById2, new AwS591S0100000_12(this, 373));
            if (PlaybookEditorUgcSetting.INSTANCE.isUgcEnable()) {
                RedDotExtensionKt.LJI(viewFindViewById3, this, null, C0UX6.PLAYBOOK_UGC_ENTRANCE_DIRECT, AFwS245S0000000_12.get$arr$(43));
            }
            InterfaceC774000UXu interfaceC774000UXuG20 = C781270Ukn.LJIILL().G20("livesdk_anchor_playbook_entrance_show");
            if (interfaceC774000UXuG20 != null) {
                C978370bZD c978370bZDLIZLLL = interfaceC774000UXuG20.LIZLLL(C475510Ikn.LJ(this));
                c978370bZDLIZLLL.LIZIZ.LJJII("go_live_interaction_panel", "enter_from");
                c978370bZDLIZLLL.LIZIZ.LJJII("go_live", "entrance");
                c978370bZDLIZLLL.LIZJ.putAll(wS());
                c978370bZDLIZLLL.LIZ();
            }
        }
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        if (dataChannelLJ != null) {
            dataChannelLJ.EQ2(getViewLifecycleOwner(), RoomCreateInfoChannel.class, new AwS378S0200000_12(view, this, 24));
            dataChannelLJ.EQ2(getViewLifecycleOwner(), GiftFeatureChannel.class, new AwS378S0200000_12(view, this, 25));
        }
        if (uS()) {
            yS(view);
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.hhk, viewGroup, false);
    }
}
