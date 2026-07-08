package com.bytedance.android.livesdk.comp.impl.decoration;

import X.C1161920gLG;
import X.C1533950q1J;
import X.C261600zm;
import X.C482260Ivg;
import X.C758860Tpk;
import X.EnumC1102750enp;
import android.content.Context;
import android.net.Uri;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.decoration.RoomDonationDecorationsEvent;
import com.bytedance.android.livesdk.chatroom.api.DonationStickerApi;
import com.bytedance.android.livesdk.chatroom.api.SessionCreationReq;
import com.bytedance.android.livesdk.chatroom.viewmodule.DonationStickerWrapperWidget;
import com.bytedance.android.livesdk.comp.api.decoration.IDonationStickerOuterService;
import com.bytedance.android.livesdk.livesetting.decoration.DonationAdaptTopStatusSetting;
import com.bytedance.android.livesdk.model.RoomDecoration;
import com.bytedance.android.livesdkapi.depend.model.live.DonationTokenModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.Event;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class DonationStickerOuterService implements IDonationStickerOuterService {
    @Override // com.bytedance.android.livesdk.comp.api.decoration.IDonationStickerOuterService
    public final DonationStickerWrapperWidget bO2() {
        return new DonationStickerWrapperWidget();
    }

    @Override // com.bytedance.android.livesdk.comp.api.decoration.IDonationStickerOuterService
    public final Class<? extends Event<List<RoomDecoration>>> oV0() {
        return RoomDonationDecorationsEvent.class;
    }

    @Override // com.bytedance.android.livesdk.comp.api.decoration.IDonationStickerOuterService
    public final void LLZZZIL(DataChannel dataChannel) {
        C482260Ivg.LIZLLL(DonationStickerApi.class, new DonationStickerApi() { // from class: X.0JFl
            @Override // com.bytedance.android.livesdk.chatroom.api.DonationStickerApi
            public final C11NZ<DonationTokenModel> createDonateSession(String str, SessionCreationReq sessionCreationReq) {
                return C11NZ.LJJIJLIJ(new C0JFY());
            }

            @Override // com.bytedance.android.livesdk.chatroom.api.DonationStickerApi
            public final C11NZ<C470590Icr<Object>> setDecoration(long j, int i, Map<String, String> map) {
                return C11NZ.LJJIJLIJ(new C0JFY());
            }
        });
    }

    @Override // com.bytedance.android.livesdk.comp.api.decoration.IDonationStickerOuterService
    public final C261600zm v62(DataChannel dataChannel) {
        return new C261600zm(dataChannel, null);
    }

    @Override // com.bytedance.android.livesdk.comp.api.decoration.IDonationStickerOuterService
    public final void vO0(LifecycleOwner lifecycleOwner, DataChannel dataChannel) {
        EnumC1102750enp.DONATION.load(dataChannel, new C758860Tpk(lifecycleOwner));
    }

    @Override // com.bytedance.android.livesdk.comp.api.decoration.IDonationStickerOuterService
    public final void Mo2(Context context, int i, Map<String, String> map) {
        String str;
        if (context != null) {
            Uri.Builder builderAppendQueryParameter = UriProtector.parse("https://inapp.tiktokv.com/tpp/inapp/pns_product_poseidon/donation-creation.html").buildUpon().appendQueryParameter("item_type", "2");
            if (i == 1) {
                str = "camera";
            } else {
                str = "live";
            }
            Uri.Builder builderAppendQueryParameter2 = builderAppendQueryParameter.appendQueryParameter("enter_from", str).appendQueryParameter("live_started", String.valueOf(i));
            String str2 = map.get("organization_id");
            if (C1533950q1J.LJ(str2)) {
                builderAppendQueryParameter2.appendQueryParameter("organization_id", str2);
            }
            String str3 = map.get("enable_simplified_live_donation");
            if (C1533950q1J.LJ(str3)) {
                builderAppendQueryParameter2.appendQueryParameter("enable_simplified_live_donation", str3);
            }
            String str4 = map.get("item_id_str");
            if (C1533950q1J.LJ(str4)) {
                builderAppendQueryParameter2.appendQueryParameter("item_id_str", str4);
                builderAppendQueryParameter2.appendQueryParameter("item_id", str4);
            }
            Uri uriBuild = builderAppendQueryParameter2.build();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Uri.Builder builderBuildUpon = UriProtector.parse("aweme://webview_popup").buildUpon();
            linkedHashMap.put("should_full_screen", "1");
            linkedHashMap.put("allow_webview_gesture", "1");
            linkedHashMap.put("variable_height", "70%");
            linkedHashMap.put("height", "70%");
            linkedHashMap.put("webview_scroll_first_when_expanded", "1");
            linkedHashMap.put("show_mask", "1");
            linkedHashMap.put("mask_bg_color", "00000080");
            if (DonationAdaptTopStatusSetting.getEnable()) {
                linkedHashMap.put("min_margin_top", "40");
            }
            linkedHashMap.put("hide_nav_bar", "1");
            linkedHashMap.put("use_spark", "1");
            linkedHashMap.put("show_loading", "1");
            linkedHashMap.putAll(map);
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
            }
            builderBuildUpon.appendQueryParameter("url", uriBuild.toString());
            ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).YC1(context, builderBuildUpon.build().toString(), null);
        }
    }
}
