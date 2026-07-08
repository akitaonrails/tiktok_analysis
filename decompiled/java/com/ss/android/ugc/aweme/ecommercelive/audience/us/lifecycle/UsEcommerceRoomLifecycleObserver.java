package com.ss.android.ugc.aweme.ecommercelive.audience.us.lifecycle;

import X.AnonymousClass0956;
import X.C099V;
import X.C0IIF;
import X.C1120604Zw;
import X.C1121904a9;
import X.C123100dR;
import X.C1279204zW;
import X.C13LE;
import X.C1421105hJ;
import X.C1511870pRh;
import X.C1733990vDx;
import X.C1741890vQh;
import X.C20340514iR;
import X.C20684815ws;
import X.C21165517sD;
import X.C21182717uz;
import X.C21188317vt;
import X.C21188517vv;
import X.C21188617vw;
import X.C21190617wG;
import X.C21194717wv;
import X.C21194917wx;
import X.C21196317xB;
import X.C21197617xO;
import X.C21199917xl;
import X.C21213217zu;
import X.C212391189t;
import X.C2126308Ur;
import X.C2188811AlT;
import X.C2296808zG;
import X.C23250099c;
import X.C23271099x;
import X.C2341109Fh;
import X.C2371409Qy;
import X.C504901xv;
import X.C598360NdS;
import X.C598410NdX;
import X.C598650Ndv;
import X.C786410Ut5;
import X.EnumC21189117w1;
import X.InterfaceC20685415wy;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment;
import com.bytedance.android.livesdkapi.depend.model.live.CommerceStruct;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.event.monitor.IPageNodeMonitorService;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.business.audience.api.data.PreviewData;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.business.audience.api.data.PreviewHighlightData;
import com.ss.android.ugc.aweme.ecommercelive.audience.us.lifecycle.UsEcommerceRoomLifecycleObserver;
import com.ss.android.ugc.aweme.ecommercelive.common.container.lifecycle.IEcommerceRoomLifecycle;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.EnterRoomPrompt;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.OecInitData;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.framework.annotation.EcommerceRegion;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes33.dex */
@EcommerceRegion(region = EnumC21189117w1.US)
public final class UsEcommerceRoomLifecycleObserver implements IEcommerceRoomLifecycle {
    public C598650Ndv LIZ;
    public AnonymousClass0956 LIZJ;
    public String LIZLLL;
    public long LIZIZ = System.currentTimeMillis();
    public final C1279204zW LJ = new InterfaceC20685415wy() { // from class: X.04zW
        @Override // X.InterfaceC20685415wy
        public void onEvent(String str) {
        }

        @Override // X.InterfaceC20685415wy
        public final void LIZ(String str, Map<String, String> map) {
            this.LIZ.getClass();
            UsEcommerceRoomLifecycleObserver.LIZJ(str, map);
        }

        @Override // X.InterfaceC20685415wy
        public final void onEvent(String str, JSONObject jSONObject) {
            Map<String, Object> mapLJ;
            if (jSONObject != null) {
                mapLJ = C08HX.LJ(jSONObject);
            } else {
                mapLJ = null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (mapLJ != null) {
                for (Map.Entry<String, Object> entry : mapLJ.entrySet()) {
                    linkedHashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
                }
            }
            this.LIZ.getClass();
            UsEcommerceRoomLifecycleObserver.LIZJ(str, linkedHashMap);
        }
    };

    @Override // com.ss.android.ugc.aweme.ecommercelive.common.container.lifecycle.IEcommerceRoomLifecycle
    public final void LIZ(Room room) throws JSONException {
        Long lValueOf;
        Long lValueOf2;
        long id;
        Object objValueOf;
        CommerceStruct commerceStruct;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onExitRoom:");
        String idStr = null;
        if (room != null) {
            lValueOf = Long.valueOf(room.getId());
        } else {
            lValueOf = null;
        }
        sbLIZ.append(lValueOf);
        C2188811AlT.LIZIZ(sbLIZ);
        String str = this.LIZLLL;
        if (str == null) {
            str = "";
        }
        C21188517vv c21188517vvLIZ = C21188617vw.LIZ(str);
        synchronized (C21188517vv.LJFF) {
            try {
                HashMap<String, C21188517vv> map = C21188517vv.LJ;
                if (map.containsKey(c21188517vvLIZ.LIZ)) {
                    Room room2 = c21188517vvLIZ.LIZIZ;
                    if (room2 != null && (commerceStruct = room2.getCommerceStruct()) != null && commerceStruct.commercePermission == 1) {
                        c21188517vvLIZ.LIZLLL.put("duration", String.valueOf(System.currentTimeMillis() - c21188517vvLIZ.LIZJ));
                        C1421105hJ.LIZJ("livesdk_tiktokec_live_watch_duration", c21188517vvLIZ.LIZLLL);
                    }
                    map.remove(c21188517vvLIZ.LIZ);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        C21196317xB c21196317xB = C21196317xB.LIZ;
        if (room != null) {
            lValueOf2 = Long.valueOf(room.getId());
        } else {
            lValueOf2 = null;
        }
        c21196317xB.getClass();
        C21196317xB.LIZJ(lValueOf2);
        if (room != null) {
            idStr = room.getIdStr();
        }
        if (C123100dR.LIZ(idStr)) {
            HashMap<String, Map<String, Object>> map2 = C21190617wG.LIZJ;
            if (map2.containsKey(idStr)) {
                map2.remove(idStr);
                C212391189t.LIZ.getClass();
                C212391189t.LIZIZ("shop_bag", idStr, "");
                C212391189t.LIZIZ("prerender_bag_assemble", idStr, "");
                C212391189t.LIZIZ("lru_mix_shop_bag", idStr, "");
                C212391189t.LIZIZ("product_update", idStr, "");
            }
        }
        if (room != null) {
            id = room.getId();
        } else {
            id = 0;
        }
        C1511870pRh.LIZJ.remove(Long.valueOf(id));
        if (room != null) {
            long id2 = room.getId();
            C1733990vDx.LIZIZ(id2);
            String strValueOf = String.valueOf(id2);
            C598410NdX.LIZLLL().remove(strValueOf);
            ((Map) C598410NdX.LIZIZ.getValue()).remove(strValueOf);
            C598360NdS.LIZ(strValueOf);
            C21182717uz c21182717uz = C21182717uz.LIZ;
            String strValueOf2 = String.valueOf(id2);
            c21182717uz.getClass();
            C2341109Fh c2341109Fh = C2341109Fh.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("ECLiveMessageCenter: leave room: ");
            sbLIZ2.append(strValueOf2);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            c2341109Fh.getClass();
            C2341109Fh.LJ(strLIZIZ);
            ((ConcurrentHashMap) C21182717uz.LIZIZ.getValue()).remove(strValueOf2);
            C21182717uz.LIZ().remove(strValueOf2);
            ((ConcurrentHashMap) C21182717uz.LIZLLL.getValue()).remove(strValueOf2);
            C20340514iR.LIZ(String.valueOf(id2));
        }
        C21213217zu.LIZJ(room);
        C21199917xl.LIZIZ(room);
        IEventCenter iEventCenter = (IEventCenter) ServiceManager.get().getService(IEventCenter.class);
        JSONObject jSONObject = new JSONObject();
        if (room != null) {
            objValueOf = Long.valueOf(room.getId());
        } else {
            objValueOf = "";
        }
        jSONObject.put("room_id", objValueOf);
        iEventCenter.LIZ("ec_live_shop_widget_on_destroy", C786410Ut5.J3(jSONObject));
        C20684815ws.LJIJJLI(this.LJ);
    }

    public static void LIZJ(String str, Map map) {
        if ((Intrinsics.LJFF(str, "livesdk_follow") || Intrinsics.LJFF(str, "livesdk_unfollow")) && map != null) {
            map.put("enter_from", "live");
            Object obj = map.get("to_user_id");
            Object obj2 = "";
            if (obj == null) {
                obj = "";
            }
            map.put("author_id", obj);
            map.put("page_name", "live");
            Object obj3 = map.get("enter_from_merge");
            if (obj3 != null) {
                obj2 = obj3;
            }
            map.put("previous_page", obj2);
            if (Intrinsics.LJFF(map.get("click_user_position"), "follow_icon")) {
                map.put("enter_method", "live_head");
            } else if (Intrinsics.LJFF(map.get("click_user_position"), "profile_card")) {
                map.put("enter_method", "profile_button_click");
            }
            if (Intrinsics.LJFF(str, "livesdk_follow")) {
                map.put("event_name", "follow");
                C1421105hJ.LIZJ("follow", map);
            } else {
                map.put("event_name", "follow_cancel");
                C1421105hJ.LIZJ("follow_cancel", map);
            }
        }
    }

    public final void LIZLLL(Fragment fragment, String str) {
        Type type;
        PreviewHighlightData previewHighlightData;
        EnterRoomPrompt enterRoomPrompt = null;
        if (str != null) {
            try {
                Gson gsonLJFF = C1741890vQh.LJFF();
                C1120604Zw.LIZ.getClass();
                C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                    type = C2371409Qy.LIZJ(C13LE.LJII(PreviewData.class));
                } else {
                    type = new TypeToken<PreviewData>() { // from class: X.0vRW
                    }.getType();
                }
                Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, str, type);
                if (!(objFromJson instanceof PreviewData)) {
                    objFromJson = null;
                }
                PreviewData previewData = (PreviewData) objFromJson;
                if (previewData != null && (previewHighlightData = previewData.highlightData) != null) {
                    enterRoomPrompt = previewHighlightData.toastInfo;
                }
            } catch (s e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        LJ(enterRoomPrompt, fragment);
    }

    public final void LJ(EnterRoomPrompt enterRoomPrompt, Fragment fragment) {
        if (enterRoomPrompt != null && enterRoomPrompt.needPrompt) {
            AnonymousClass0956 anonymousClass0956LIZLLL = C23250099c.LIZLLL(C2296808zG.LIZ(C2126308Ur.LJFF), null, null, new C504901xv(fragment, enterRoomPrompt, null), 3);
            this.LIZJ = anonymousClass0956LIZLLL;
            anonymousClass0956LIZLLL.start();
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommercelive.common.container.lifecycle.IEcommerceRoomLifecycle
    public final void LIZIZ(LivePlayFragment livePlayFragment, Room room, long j, String str, boolean z, String str2, C0IIF c0iif, HashMap map) throws JSONException {
        boolean z2;
        String str3;
        OecInitData oecInitData;
        Boolean boolValueOf;
        int i;
        String str4;
        Type type;
        String currentUserID;
        String idStr = room.getIdStr();
        this.LIZLLL = idStr;
        String str5 = "";
        if (idStr == null) {
            idStr = "";
        }
        C21188517vv c21188517vvLIZ = C21188617vw.LIZ(idStr);
        c21188517vvLIZ.LIZIZ = room;
        c21188517vvLIZ.LIZJ = System.currentTimeMillis();
        c21188517vvLIZ.LIZ("author_id", String.valueOf(room.getOwnerUserId()));
        IUserService iUserService = (IUserService) PluggableExtentionKt.pluggableSpi$default(IUserService.class, false, false, false, 14, null);
        if (iUserService != null && (currentUserID = iUserService.getCurrentUserID()) != null) {
            str5 = currentUserID;
        }
        c21188517vvLIZ.LIZ("user_id", str5);
        c21188517vvLIZ.LIZ("room_is_pin_coupon", CardStruct.IStatusCode.DEFAULT);
        C21194917wx.LJIIIZ = System.currentTimeMillis();
        C21196317xB.LIZ.getClass();
        C21196317xB.LIZIZ(livePlayFragment, room);
        C598650Ndv c598650Ndv = this.LIZ;
        if (c598650Ndv != null) {
            C2341109Fh.LIZ.getClass();
            C2341109Fh.LJ("destroy");
            c598650Ndv.LIZ.set(true);
        }
        this.LIZ = new C598650Ndv();
        C21197617xO.LIZ = 0;
        C21197617xO.LIZIZ = String.valueOf(room.getId());
        AnonymousClass0956 anonymousClass0956 = this.LIZJ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        C20684815ws.LJIJJLI(this.LJ);
        this.LIZIZ = System.currentTimeMillis();
        CommerceStruct commerceStruct = room.getCommerceStruct();
        if (commerceStruct != null && commerceStruct.commercePermission == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        CommerceStruct commerceStruct2 = room.getCommerceStruct();
        if (commerceStruct2 != null) {
            str3 = commerceStruct2.oecInitDataString;
        } else {
            str3 = null;
        }
        try {
            Gson gsonLJFF = C1741890vQh.LJFF();
            C1120604Zw.LIZ.getClass();
            C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
            if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                type = C2371409Qy.LIZJ(C13LE.LJII(OecInitData.class));
            } else {
                type = new TypeToken<OecInitData>() { // from class: X.17vY
                }.getType();
            }
            Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, str3, type);
            if (!(objFromJson instanceof OecInitData)) {
                objFromJson = null;
            }
            oecInitData = (OecInitData) objFromJson;
        } catch (s e) {
            TryCatchGuardChecker.doCheck(e);
            C21197617xO.LIZ(String.valueOf(room.getId()), e.getMessage());
            oecInitData = null;
        }
        if (!z2) {
            C21213217zu.LIZLLL = null;
        }
        C20684815ws.LIZ(this.LJ);
        if (oecInitData == null) {
            if (z2) {
                CommerceStruct commerceStruct3 = room.getCommerceStruct();
                if (commerceStruct3 != null && (str4 = commerceStruct3.oecInitDataString) != null && str4.length() != 0) {
                    i = 0;
                } else {
                    i = 1;
                }
                C1421105hJ.LIZLLL("rd_tiktokec_on_enter_room", new Pair("room_id", Long.valueOf(room.getId())), new Pair("is_oec_data_empty", Integer.valueOf(i)), new Pair("is_oec_data_decode_failed", Integer.valueOf(i ^ 1)));
                return;
            }
            return;
        }
        if (z2) {
            C1421105hJ.LIZLLL("rd_tiktokec_on_enter_room", new Pair("room_id", Long.valueOf(room.getId())), new Pair("is_oec_data_empty", 0), new Pair("is_oec_data_decode_failed", 0));
        }
        C1733990vDx.LIZ.put(Long.valueOf(room.getId()), oecInitData);
        CommerceStruct commerceStruct4 = room.getCommerceStruct();
        if (commerceStruct4 != null) {
            boolValueOf = Boolean.valueOf(commerceStruct4.asyncLoad);
        } else {
            boolValueOf = null;
        }
        boolean zLIZ = C21194717wv.LIZ(oecInitData, boolValueOf);
        if (oecInitData.productNum > 0 && oecInitData.displayProductNum > 0) {
            ((IPageNodeMonitorService) ServiceManager.get().getService(IPageNodeMonitorService.class)).LJIIIIZZ("shop_bag_icon", null, Long.valueOf(j), null, null);
        } else {
            C21213217zu.LIZLLL = null;
        }
        if (zLIZ) {
            ((IPageNodeMonitorService) ServiceManager.get().getService(IPageNodeMonitorService.class)).LJIIIIZZ("pop_card", null, Long.valueOf(j), null, null);
        }
        C21190617wG.LJFF(room.getIdStr(), c0iif.LIZ);
        C23250099c.LIZJ(LifecycleOwnerKt.getLifecycleScope(livePlayFragment), C23271099x.INSTANCE, C099V.DEFAULT, new C21165517sD(new C21188317vt(oecInitData, room, this, map, str, z, str2, livePlayFragment), oecInitData, Long.valueOf(room.getId()), z2, null));
    }
}
