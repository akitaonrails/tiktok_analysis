package com.bytedance.android.livesdk.gift.base.platform.business.panel.viewmodel;

import X.C09JN;
import X.C0UO0;
import X.C1094360eaI;
import X.C1143680frq;
import X.C1161920gLG;
import X.C480460Ism;
import X.C497740JfY;
import X.C498240JgM;
import X.C498310JgT;
import X.EnumC496820Je4;
import X.InterfaceC1631620sYq;
import Y.AfS143S0200000_7;
import android.content.Context;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.livesdk.api.revenue.level.IUserLevelService;
import com.bytedance.android.livesdk.api.revenue.privilege.api.PrivilegeApi;
import com.bytedance.android.livesdk.api.revenue.privilege.model.PrivilegeCenterConfig;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final class GiftPrivilegeCenterViewModel extends ViewModel {
    public final MutableLiveData<PrivilegeCenterConfig> LL = new MutableLiveData<>();
    public final MutableLiveData<Boolean> LLILLJJLI = new MutableLiveData<>();
    public final MutableLiveData<Boolean> LLILLL = new MutableLiveData<>();

    public static void xQ2() {
        C1094360eaI c1094360eaIHP;
        IUserLevelService iUserLevelService = (IUserLevelService) C1161920gLG.LIZJ(IUserLevelService.class);
        if (iUserLevelService == null || (c1094360eaIHP = iUserLevelService.HP()) == null || c1094360eaIHP.LIZ < 25) {
            return;
        }
        C1143680frq.LJJIIJ("tiktok_live_interaction_demand_23", "ReemKufi-Medium.ttf");
        C1143680frq.LJJII("tiktok_live_revenue_enigma_subscription", "enigma_paywall_dialog_top.png");
        C1143680frq.LJJII("tiktok_live_revenue_enigma_subscription", "enigma_paywall_weekly_header_short.png");
        C1143680frq.LJJII("tiktok_live_revenue_enigma_subscription", "enigma_paywall_weekly_header.png");
        C1143680frq.LJJII("tiktok_live_revenue_enigma_subscription", "ttlive_enigma_features_mask.png");
        C1143680frq.LJJII("tiktok_live_revenue_enigma_subscription", "ttlive_enigma_features_whisper.png");
        C1143680frq.LJJII("tiktok_live_revenue_enigma_subscription", "ttlive_enigma_features_hide_match_points.png");
        C1143680frq.LJJII("tiktok_live_revenue_enigma_subscription", "ttlive_enigma_features_id.png");
        C1143680frq.LJJII("tiktok_live_revenue_enigma_subscription", "enigma_paywal_lower_corner.png");
        C1143680frq.LJJIIJ("tiktok_live_revenue_enigma_subscription", "enigma_tick_animation");
        boolean zLJJ = C497740JfY.LJJ();
        C1143680frq.LJJIIJ("tiktok_live_revenue_enigma_subscription", C498310JgT.LIZ() ? zLJJ ? "enigma_subscription_montly_short_rtl" : "enigma_subscription_montly_short" : zLJJ ? "enigma_subscription_montly_rtl" : "enigma_subscription_montly");
    }

    public final void vQ2(PrivilegeCenterConfig privilegeCenterConfig, Room room) {
        Long lValueOf;
        C480460Ism.LIZ().getClass();
        PrivilegeApi privilegeApi = (PrivilegeApi) C480460Ism.LIZLLL(PrivilegeApi.class);
        Long lValueOf2 = null;
        if (room != null) {
            lValueOf = Long.valueOf(room.getId());
        } else {
            lValueOf = null;
        }
        String strValueOf = String.valueOf(lValueOf);
        if (room != null) {
            lValueOf2 = Long.valueOf(room.getOwnerUserId());
        }
        privilegeApi.getPrivilegeCenterEntranceInfo(strValueOf, String.valueOf(lValueOf2), EnumC496820Je4.REQUEST_FROM_SCENE_GIFT_PANEL.getType()).LJIILIIL(new C0UO0()).LJJLL(new AfS143S0200000_7((Object) privilegeCenterConfig, (EmoteModel) this, (InterfaceC1631620sYq<? super EmoteModel, ? super String, ? super Integer, Unit>) 42), new C09JN() { // from class: X.00Mj
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("GiftPrivilegeCenterViewModel@f83b.initPrivilegeCenterEntrance$2");
                C1C7U.LIZIZ("GiftPrivilegeCenterViewModel@f83b.initPrivilegeCenterEntrance$2");
            }
        });
    }

    public static void wQ2(Context context, Room room, PrivilegeCenterConfig privilegeCenterConfig, boolean z) {
        ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).YC1(context, C498240JgM.LIZLLL("gift_panel", context, room, privilegeCenterConfig, z), null);
        xQ2();
    }
}
