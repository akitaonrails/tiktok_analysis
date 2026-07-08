package com.bytedance.android.livesdk.broadcast.preview.widget.setting;

import X.C0IJT;
import X.C0UNN;
import X.C1161920gLG;
import X.C13BV;
import X.C19EH;
import X.C20632315oP;
import X.C20736316Cj;
import X.C474500IjA;
import X.C494680Jac;
import X.C497740JfY;
import X.C758220Toi;
import X.C758260Tom;
import X.C758270Ton;
import X.C758320Tos;
import X.C785850UsB;
import X.C786410Ut5;
import X.InterfaceC1225900i0S;
import Y.AfS107S0300000_12;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.livesdk.api.BroadcastRoomApi;
import com.bytedance.android.livesdk.chatroom.model.UpsertRoomVisibleScopeRequest;
import com.bytedance.android.livesdk.dataChannel.VisibleScopeSelectedChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.BroadcastVisibleScopeMaxNumSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.BroadcastVisibleScopeMinNumSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.RoomVisibleScope;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class LiveVisibleScopeContactSelectorSheet extends LiveSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KjcjKCswKTY4Zz8hLTMlLDh9PyHELIOSwoLionZjYpPTs6JiJiBSYlLRMlOiYxJCAfKiAjLQYjJzsyKzEfLCM2KzEjOxw7LSA4";
    public DataChannel LLJLLL;
    public Long LLJZ;
    public Function0<Unit> LLJZIJLIL;
    public Fragment LLL;
    public boolean LLLF = true;

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        View view;
        super.onResume();
        if (this.LLLF) {
            this.LLLF = false;
            Fragment fragment = this.LLL;
            if (fragment != null && (view = fragment.getView()) != null) {
                view.setFitsSystemWindows(false);
            }
            Fragment fragment2 = this.LLL;
            C20632315oP c20632315oPWS = wS(fragment2 != null ? fragment2.getView() : null);
            if (c20632315oPWS != null) {
                c20632315oPWS.LIZIZ(new C785850UsB(this, 1));
            }
        }
    }

    public static final C20632315oP wS(View view) {
        if (view instanceof C20632315oP) {
            return (C20632315oP) view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                C20632315oP c20632315oPWS = wS(viewGroup.getChildAt(i));
                if (c20632315oPWS != null) {
                    return c20632315oPWS;
                }
            }
            return null;
        }
        return null;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final int QM(Context context) {
        return C20736316Cj.LIZIZ(R.attr.exe, context);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.LIZ(1, null);
        DataChannel dataChannel = this.LLJLLL;
        if (dataChannel != null && Intrinsics.LJFF(dataChannel.gg0(C758260Tom.class), Boolean.FALSE)) {
            sheetOptions.cornerRadius = (int) C497740JfY.LIZIZ(26.0f);
            return sheetOptions;
        }
        sheetOptions.dimBehindType = 2;
        return sheetOptions;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C758320Tos c758320Tos;
        C758220Toi c758220Toi;
        Window window;
        super.onViewCreated(view, bundle);
        Dialog dialog = this.LLJJIJIL.LIZLLL.getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setSoftInputMode(48);
        }
        DataChannel dataChannel = this.LLJLLL;
        boolean zIsPrivateAccount = ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).isPrivateAccount();
        final C758270Ton c758270Ton = new C758270Ton(dataChannel, zIsPrivateAccount);
        Context context = view.getContext();
        final AwS591S0100000_12 awS591S0100000_12 = new AwS591S0100000_12(this, 408);
        final AwS591S0100000_12 awS591S0100000_122 = new AwS591S0100000_12(this, 409);
        IHostAction iHostAction = (IHostAction) C1161920gLG.LIZJ(IHostAction.class);
        int value = BroadcastVisibleScopeMaxNumSetting.INSTANCE.getValue();
        int value2 = BroadcastVisibleScopeMinNumSetting.INSTANCE.getValue();
        if (dataChannel != null && (c758220Toi = (C758220Toi) dataChannel.gg0(VisibleScopeSelectedChannel.class)) != null) {
            List list = c758220Toi.LIZIZ;
            if (list == null) {
                list = C13BV.INSTANCE;
            }
            List list2 = c758220Toi.LIZJ;
            if (list2 == null) {
                list2 = C13BV.INSTANCE;
            }
            List list3 = c758220Toi.LIZLLL;
            if (list3 == null) {
                list3 = C13BV.INSTANCE;
            }
            List list4 = c758220Toi.LJ;
            if (list4 == null) {
                list4 = C13BV.INSTANCE;
            }
            c758320Tos = new C758320Tos(list, list2, list3, list4);
        } else {
            c758320Tos = null;
        }
        Fragment fragmentOpenContactorSelectorForVisibleScope = iHostAction.openContactorSelectorForVisibleScope(context, value, value2, zIsPrivateAccount, c758320Tos, new InterfaceC1225900i0S() { // from class: X.0Toq
            @Override // X.InterfaceC1225900i0S
            public final void LIZ(boolean z) {
                awS591S0100000_122.invoke(Boolean.valueOf(z));
            }

            @Override // X.InterfaceC1225900i0S
            public final void LIZIZ(C758320Tos c758320Tos2) {
                C480460Ism.LIZ().getClass();
                BroadcastRoomApi broadcastRoomApi = (BroadcastRoomApi) C480460Ism.LIZLLL(BroadcastRoomApi.class);
                UpsertRoomVisibleScopeRequest upsertRoomVisibleScopeRequest = new UpsertRoomVisibleScopeRequest();
                RoomVisibleScope roomVisibleScope = new RoomVisibleScope();
                roomVisibleScope.visibleScopeType = 2;
                roomVisibleScope.visibleUserIdList = new ArrayList(c758320Tos2.LIZ);
                roomVisibleScope.visibleChatIdList = new ArrayList(c758320Tos2.LIZJ);
                upsertRoomVisibleScopeRequest.visibleScope = roomVisibleScope;
                broadcastRoomApi.upsertRoomVisibleScope(upsertRoomVisibleScopeRequest).LJIILIIL(new C0UO0()).LJJLL(new AfS107S0300000_12(c758270Ton, c758320Tos2, awS591S0100000_12, 2), new C09JN() { // from class: X.0Tor
                    @Override // X.C09JN
                    public final void accept(Object obj) {
                        C1C7U.LIZ("LiveVisibleScopeHelper@97dd.openContactorSelector$2$onSelectedConfirm$disposable$3");
                        C766270U4b.LIZLLL(2131851936);
                        C1C7U.LIZIZ("LiveVisibleScopeHelper@97dd.openContactorSelector$2$onSelectedConfirm$disposable$3");
                    }
                });
            }
        });
        if (fragmentOpenContactorSelectorForVisibleScope != null) {
            this.LLL = fragmentOpenContactorSelectorForVisibleScope;
            C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
            c19ehLJIIJ.LIZIZ(R.id.ywg, fragmentOpenContactorSelectorForVisibleScope);
            c19ehLJIIJ.LJIIJJI();
        }
        uS(null, "show");
    }

    public final void uS(Integer num, String str) {
        String str2;
        Object objGg0;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_multi_anchor_distribution_scope_select_people_panel");
        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "anchor_id");
        c474500IjALIZ.LJJII(str, "event_action_type");
        if (C494680Jac.LIZJ()) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(str2, "is_sub_only_live");
        DataChannel dataChannel = this.LLJLLL;
        if (dataChannel != null) {
            objGg0 = dataChannel.gg0(C0UNN.class);
        } else {
            objGg0 = null;
        }
        c474500IjALIZ.LJJII(objGg0, "enter_from");
        if (num != null) {
            c474500IjALIZ.LJJII(Integer.valueOf(num.intValue()), "selected_ucnt");
        }
        c474500IjALIZ.LIZ();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final void OR(int i, int i2, boolean z) {
        super.OR(i, i2, false);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.hx8, viewGroup, false);
    }
}
