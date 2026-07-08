package com.ss.android.ugc.aweme.ecommercelive.audience.common.business.audience.bagicon;

import X.C07MH;
import X.C11XZ;
import X.C1388190mED;
import X.C13LP;
import X.C1507790pL7;
import X.C15438062q;
import X.C1733990vDx;
import X.C19378910rj;
import X.C19411510wz;
import X.C19516311Xd;
import X.C19516411Xe;
import X.C19516911Xj;
import X.C19517011Xk;
import X.C19719512Dh;
import X.C1E62;
import X.C20340514iR;
import X.C2097608Jq;
import X.C212161180x;
import X.C212162180y;
import X.C2126308Ur;
import X.C2188811AlT;
import X.C23271099x;
import X.C445501oL;
import X.C445601oM;
import X.C679280Qkg;
import X.C785040Uqs;
import X.C785100Uqy;
import X.C844470XAv;
import X.C948503nH;
import X.EnumC1769850w9n;
import X.InterfaceC21213517zx;
import X.InterfaceC21213717zz;
import X.InterfaceC756140TlM;
import X.InterfaceC784990Uqn;
import X.InterfaceC785110Uqz;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.keva.Keva;
import com.bytedance.pitaya.api.PTYMessageHandler;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.business.audience.bagicon.BagGuideTooltipController;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.business.settings.EcShopBagAfterPinCardGuide;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.business.settings.EcShopBagCommonBubbleConfig;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.business.settings.EcShopBagTooltipConfig;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.AnimImage;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.LiveBagIconAnimation;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.OecInitData;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS144S1200000_29;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes33.dex */
public final class BagGuideTooltipController implements InterfaceC21213517zx, PTYMessageHandler {
    public static final C212162180y Companion = new Object() { // from class: X.180y
    };
    public final WeakReference<Context> context;
    public boolean hasShown;
    public boolean hasShownFYPShoppingBagCard;
    public final Function0<Integer> productNumGetter;
    public Room room;
    public IIconSlot.SlotViewModel viewModel;
    public long tooltipShowTime = -1;
    public String eventParamNoticeType = "shopping_bag_bubble_guide";

    @Override // X.InterfaceC21213517zx
    public void onAudiencePermissionChanged(boolean z) {
    }

    @Override // X.InterfaceC21213517zx
    public void onClick(long j, String str, Map<String, ? extends Object> map, String str2) {
    }

    @Override // X.InterfaceC21213517zx
    public void onCreate(Bundle bundle) {
    }

    @Override // X.InterfaceC21213517zx
    public void onDispose() {
    }

    @Override // X.InterfaceC21213517zx
    public void onExposure(String str) {
    }

    @Override // X.InterfaceC21213517zx
    public void onPause() {
    }

    @Override // X.InterfaceC21213517zx
    public void onProductNumChange(int i) {
    }

    @Override // X.InterfaceC21213517zx
    public void onResume() {
    }

    @Override // X.InterfaceC21213517zx
    public void onShopBagIconDrawableLoaded() {
    }

    @Override // X.InterfaceC21213517zx
    public void onStart() {
    }

    @Override // X.InterfaceC21213517zx
    public void onStop() {
    }

    public final void debugShowTooltipV2() {
        showTooltipV2("pdp_close", "find more products from tts test shop 0000000000000000", Collections.singletonList("https://p16-oec-ttp.tiktokcdn-us.com/tos-useast5-i-omjb5zjo8w-tx/b4c846b0bfdf44b685305e2b05a096b4~tplv-omjb5zjo8w-resize-webp:800:800.webp?dr=10507&t=555f072d&ps=933b5bde&shp=cc6bf678&shcp=9b759fb9&idc=useast5&from=3429627512"), null);
    }

    public final Map<String, String> getShowParams() {
        if (!this.hasShown) {
            return C2097608Jq.LJ();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("minimum_interval", String.valueOf(SystemClock.elapsedRealtime() - this.tooltipShowTime));
        linkedHashMap.put("notice_type", this.eventParamNoticeType);
        return linkedHashMap;
    }

    @Override // X.InterfaceC21213517zx
    public void onDestroy() {
        Set set;
        if (!C1E62.LIZJ || (set = (Set) ((LinkedHashMap) C07MH.LIZ).get("gecc_live_shop_bag_icon_guide")) == null) {
            return;
        }
        set.remove(this);
    }

    public final void reportModuleShow() {
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("EVENT_ORIGIN_FEATURE", "TEMAI"), new Pair("source_page_type", "live"), new Pair("page_name", "live"), new Pair("module_name", this.eventParamNoticeType));
        c1507790pL7.getClass();
        C1507790pL7.LIZJ("tiktokec_module_show", mapLJIIIIZZ);
    }

    public final void showTooltip() {
        MutableLiveData<C785100Uqy> mutableLiveData;
        MutableLiveData<C785040Uqs> mutableLiveData2;
        Context context = this.context.get();
        if (context == null) {
            return;
        }
        if (this.productNumGetter.invoke().intValue() < 2) {
            debugToast("receive pitaya message, but productNum < 2");
            return;
        }
        if (C20340514iR.LJFF()) {
            debugToast("receive pitaya message, new promotion container is showing");
            return;
        }
        EcShopBagAfterPinCardGuide ecShopBagAfterPinCardGuide = (EcShopBagAfterPinCardGuide) C212161180x.LIZIZ.getValue();
        if (ecShopBagAfterPinCardGuide.enabled) {
            C19516311Xd.LIZ.getClass();
            int i = C19516311Xd.LIZIZ.getInt("shown_count", 0);
            if (i >= ecShopBagAfterPinCardGuide.frequencyLimit) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("receive pitaya message, but bubble reaches frequency limit:");
                sbLIZ.append(ecShopBagAfterPinCardGuide.frequencyLimit);
                debugToast(C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
            IIconSlot.SlotViewModel slotViewModel = this.viewModel;
            if (slotViewModel != null) {
                slotViewModel.LLJLIL = ecShopBagAfterPinCardGuide.showTime;
                slotViewModel.LLL = new InterfaceC784990Uqn() { // from class: X.180r
                    @Override // X.InterfaceC784990Uqn
                    public final void LIZ() {
                        String idStr;
                        this.LIZ.tooltipShowTime = SystemClock.elapsedRealtime();
                        Room room = this.LIZ.room;
                        if (room == null || (idStr = room.getIdStr()) == null) {
                            idStr = "";
                        }
                        C19378910rj.LIZLLL(2, idStr, null, "SLOT_SHOP_BAG_GUIDE_BUBBLE");
                        BagGuideTooltipController bagGuideTooltipController = this.LIZ;
                        bagGuideTooltipController.hasShown = true;
                        bagGuideTooltipController.reportModuleShow();
                        C19516311Xd.LIZ.getClass();
                        Keva keva = C19516311Xd.LIZIZ;
                        keva.storeInt("shown_count", keva.getInt("shown_count", 0) + 1);
                    }
                };
                slotViewModel.LLLF = new InterfaceC785110Uqz() { // from class: X.180u
                    @Override // X.InterfaceC785110Uqz
                    public final void LIZ(int i2) {
                        String idStr;
                        Room room = this.LIZ.room;
                        if (room == null || (idStr = room.getIdStr()) == null) {
                            idStr = "";
                        }
                        C19378910rj.LIZLLL(3, idStr, null, "SLOT_SHOP_BAG_GUIDE_BUBBLE");
                    }
                };
            }
            String string = context.getString(2131836701);
            if (!ecShopBagAfterPinCardGuide.showImage) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("receive pitaya message,try to show bubble:");
                sbLIZ2.append(i + 1);
                sbLIZ2.append("th");
                debugToast(C2188811AlT.LIZIZ(sbLIZ2));
                IIconSlot.SlotViewModel slotViewModel2 = this.viewModel;
                if (slotViewModel2 == null || (mutableLiveData = slotViewModel2.LLJJI) == null) {
                    return;
                }
                C785100Uqy c785100Uqy = new C785100Uqy("ECOM_SHOP_BAG_GUIDE", string);
                c785100Uqy.LIZLLL = C679280Qkg.LIZ(4);
                mutableLiveData.postValue(c785100Uqy);
                return;
            }
            String str = C19516311Xd.LIZJ;
            if (str == null || str.length() <= 0) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(C19411510wz.LIZLLL(str, 90, 90, EnumC1769850w9n.LIVE_GUIDANCE_BUBBLE_IMAGE));
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("receive pitaya message,try to show bubble with image:");
            sbLIZ3.append(i + 1);
            sbLIZ3.append("th");
            debugToast(C2188811AlT.LIZIZ(sbLIZ3));
            IIconSlot.SlotViewModel slotViewModel3 = this.viewModel;
            if (slotViewModel3 == null || (mutableLiveData2 = slotViewModel3.LLJJIII) == null) {
                return;
            }
            C785040Uqs c785040Uqs = new C785040Uqs("ECOM_SHOP_BAG_GUIDE_WITH_IMAGE", arrayList, string);
            c785040Uqs.LJ = C679280Qkg.LIZ(4);
            mutableLiveData2.postValue(c785040Uqs);
        }
    }

    public final void debugToast(String str) {
        Context context;
        Activity activityLIZ;
        IIconSlot.SlotViewModel slotViewModel;
        C844470XAv.LIZ.getClass();
        if (Intrinsics.LJFF(C844470XAv.LJIILL, "local_test") && (context = this.context.get()) != null && (activityLIZ = C1388190mED.LIZ(context)) != null && (slotViewModel = this.viewModel) != null) {
            C948503nH.LJFF(slotViewModel, C2126308Ur.LJFF, new C445501oL(activityLIZ, str, null));
        }
    }

    public final void handleLiveBagIconAnimationInfos(List<LiveBagIconAnimation> list) {
        int iIntValue;
        LiveBagIconAnimation next;
        if (list != null) {
            Iterator<LiveBagIconAnimation> it2 = list.iterator();
            while (true) {
                iIntValue = 0;
                if (it2.hasNext()) {
                    next = it2.next();
                    if (next.animationType != null) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            LiveBagIconAnimation liveBagIconAnimation = next;
            if (liveBagIconAnimation != null) {
                Integer num = liveBagIconAnimation.animationType;
                if (num != null) {
                    iIntValue = num.intValue();
                }
                showTooltipV3(iIntValue, liveBagIconAnimation);
            }
        }
    }

    @Override // com.bytedance.pitaya.api.PTYMessageHandler
    public JSONObject onMessage(JSONObject jSONObject) {
        long jElapsedRealtime;
        Map<String, LiveBagIconAnimation> map;
        LiveBagIconAnimation liveBagIconAnimation;
        String string;
        String strOptString = jSONObject.optString("business_name");
        String strOptString2 = jSONObject.optString("type");
        boolean zOptBoolean = jSONObject.optBoolean("package_output");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("request_params");
        int iOptInt = jSONObject.optInt("display_threshold_min", -1);
        int iOptInt2 = jSONObject.optInt("display_threshold_max", -1);
        C19516311Xd.LIZ.getClass();
        if (C19516311Xd.LIZLLL <= 0) {
            jElapsedRealtime = 0;
        } else {
            jElapsedRealtime = SystemClock.elapsedRealtime() - C19516311Xd.LIZLLL;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("package_call_cost", String.valueOf(jElapsedRealtime));
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objOpt = jSONObject.opt(next);
            if (objOpt == null || (string = objOpt.toString()) == null) {
                string = "";
            }
            linkedHashMap.put(next, string);
        }
        C1507790pL7.LIZ.getClass();
        C1507790pL7.LIZJ("tiktokec_rd_client_ai", linkedHashMap);
        if (!Intrinsics.LJFF(strOptString, "gecc_live_shop_bag_icon_guide")) {
            return null;
        }
        if (!zOptBoolean) {
            debugToast("receive pitaya message, but packageOutput is false");
            return null;
        }
        EcShopBagTooltipConfig ecShopBagTooltipConfigLIZ = C19517011Xk.LIZ(strOptString2);
        if (ecShopBagTooltipConfigLIZ != null) {
            if (ecShopBagTooltipConfigLIZ.needRequest) {
                IIconSlot.SlotViewModel slotViewModel = this.viewModel;
                if (slotViewModel != null) {
                    C948503nH.LJFF(slotViewModel, C2126308Ur.LIZIZ, new C19516911Xj(this, ecShopBagTooltipConfigLIZ, jSONObjectOptJSONObject, iOptInt, iOptInt2, strOptString2, null));
                }
            } else {
                OecInitData oecInitDataLIZ = C1733990vDx.LIZ(this.room);
                if (oecInitDataLIZ != null && (map = oecInitDataLIZ.commonGuideBubble) != null && (liveBagIconAnimation = map.get(strOptString2)) != null) {
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                    C19516311Xd.LIZ.getClass();
                    nowOrDelay(jElapsedRealtime2 - C19516311Xd.LIZLLL, iOptInt, iOptInt2, new AwS144S1200000_29(this, strOptString2, liveBagIconAnimation, 3));
                    return null;
                }
            }
            return null;
        }
        nowOrDelay(jElapsedRealtime, iOptInt, iOptInt2, new AwS576S0100000_32(this, 172));
        return null;
    }

    public BagGuideTooltipController(WeakReference<Context> weakReference, Function0<Integer> function0) {
        this.context = weakReference;
        this.productNumGetter = function0;
    }

    private final void showTooltipV3(int i, LiveBagIconAnimation liveBagIconAnimation) {
        String str;
        IIconSlot.SlotViewModel slotViewModel;
        AnimImage animImage;
        List<String> list = liveBagIconAnimation.animationTextList;
        String str2 = null;
        if (list != null) {
            str = (String) C13LP.LJJJLL(list);
        } else {
            str = null;
        }
        List<AnimImage> list2 = liveBagIconAnimation.animationImgList;
        if (list2 != null && (animImage = (AnimImage) C13LP.LJJJLL(list2)) != null) {
            str2 = animImage.url;
        }
        if (str != null && str.length() > 0 && (slotViewModel = this.viewModel) != null) {
            C948503nH.LJFF(slotViewModel, C2126308Ur.LJFF, new C19516411Xe(this, i, str, str2, null));
        }
    }

    @Override // X.InterfaceC21213517zx
    public void onSlotCreated(IIconSlot.SlotViewModel slotViewModel, InterfaceC21213717zz interfaceC21213717zz) {
        this.viewModel = slotViewModel;
        C19516311Xd.LIZ.getClass();
        C19516311Xd.LIZLLL = 0L;
        if (C1E62.LIZJ) {
            Map<String, Set<PTYMessageHandler>> map = C07MH.LIZ;
            LinkedHashMap linkedHashMap = (LinkedHashMap) map;
            if (linkedHashMap.get("gecc_live_shop_bag_icon_guide") == null) {
                map.put("gecc_live_shop_bag_icon_guide", new LinkedHashSet());
            }
            Set set = (Set) linkedHashMap.get("gecc_live_shop_bag_icon_guide");
            if (set != null) {
                set.add(this);
            }
        }
    }

    @Override // X.InterfaceC21213517zx
    public void prepareToShow(Map<String, ? extends Object> map, InterfaceC756140TlM interfaceC756140TlM) {
        Room room;
        boolean zBooleanValue;
        Map map2;
        String str;
        Boolean boolLJLI;
        Object obj = map.get("param_room");
        if (obj instanceof Room) {
            room = (Room) obj;
        } else {
            room = null;
        }
        this.room = room;
        Object obj2 = map.get("param_extra_ec_common_extra_param");
        if (C19719512Dh.LJII(obj2) && (map2 = (Map) obj2) != null && (str = (String) map2.get("has_shown_ec_feed_shopping_bag_card")) != null && (boolLJLI = a0.LJLI(str)) != null) {
            zBooleanValue = boolLJLI.booleanValue();
        } else {
            zBooleanValue = false;
        }
        this.hasShownFYPShoppingBagCard = zBooleanValue;
    }

    public final void showTooltipV2(String str, LiveBagIconAnimation liveBagIconAnimation) {
        String str2;
        String str3;
        AnimImage animImage;
        List<String> list = liveBagIconAnimation.animationTextList;
        List<String> listSingletonList = null;
        if (list != null) {
            str2 = (String) C13LP.LJJJLL(list);
        } else {
            str2 = null;
        }
        List<AnimImage> list2 = liveBagIconAnimation.animationImgList;
        if (list2 != null && (animImage = (AnimImage) C13LP.LJJJLL(list2)) != null) {
            str3 = animImage.url;
        } else {
            str3 = null;
        }
        if (str2 != null && str2.length() > 0) {
            if (str3 != null && str3.length() != 0) {
                listSingletonList = Collections.singletonList(str3);
            }
            showTooltipV2(str, str2, listSingletonList, null);
        }
    }

    private final void showTooltipV2(final String str, String str2, List<String> list, String str3) {
        MutableLiveData<C785100Uqy> mutableLiveData;
        String upperCase;
        MutableLiveData<C785040Uqs> mutableLiveData2;
        String upperCase2;
        if (this.productNumGetter.invoke().intValue() < 2) {
            debugToast("receive pitaya message, but productNum < 2");
            return;
        }
        if (C20340514iR.LJFF()) {
            debugToast("receive pitaya message, new promotion container is showing");
            return;
        }
        EcShopBagTooltipConfig ecShopBagTooltipConfigLIZ = C19517011Xk.LIZ(str);
        if (ecShopBagTooltipConfigLIZ == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("receive pitaya message, but libra config of type:");
            sbLIZ.append(str);
            sbLIZ.append(" is null");
            debugToast(C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        C19516311Xd.LIZ.getClass();
        int i = C19516311Xd.LIZIZ.getInt(C19516311Xd.LIZ(str), 0);
        if (i >= ecShopBagTooltipConfigLIZ.frequencyLimit) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("receive pitaya message, but bubble reaches frequency limit:");
            sbLIZ2.append(ecShopBagTooltipConfigLIZ.frequencyLimit);
            debugToast(C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        IIconSlot.SlotViewModel slotViewModel = this.viewModel;
        if (slotViewModel != null) {
            slotViewModel.LLJLIL = ecShopBagTooltipConfigLIZ.showTime;
            slotViewModel.LLL = new InterfaceC784990Uqn() { // from class: X.180q
                @Override // X.InterfaceC784990Uqn
                public final void LIZ() {
                    String idStr;
                    this.LIZ.tooltipShowTime = SystemClock.elapsedRealtime();
                    Room room = this.LIZ.room;
                    if (room == null || (idStr = room.getIdStr()) == null) {
                        idStr = "";
                    }
                    C19378910rj.LIZLLL(2, idStr, null, "SLOT_SHOP_BAG_GUIDE_BUBBLE");
                    BagGuideTooltipController bagGuideTooltipController = this.LIZ;
                    bagGuideTooltipController.hasShown = true;
                    bagGuideTooltipController.reportModuleShow();
                    C19516311Xd c19516311Xd = C19516311Xd.LIZ;
                    String str4 = str;
                    c19516311Xd.getClass();
                    Keva keva = C19516311Xd.LIZIZ;
                    keva.storeInt(C19516311Xd.LIZ(str4), keva.getInt(C19516311Xd.LIZ(str4), 0) + 1);
                }
            };
            slotViewModel.LLLF = new InterfaceC785110Uqz() { // from class: X.180v
                @Override // X.InterfaceC785110Uqz
                public final void LIZ(int i2) {
                    String idStr;
                    Room room = this.LIZ.room;
                    if (room == null || (idStr = room.getIdStr()) == null) {
                        idStr = "";
                    }
                    C19378910rj.LIZLLL(3, idStr, null, "SLOT_SHOP_BAG_GUIDE_BUBBLE");
                }
            };
        }
        if (ecShopBagTooltipConfigLIZ.showImage) {
            if (list != null && !list.isEmpty()) {
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator<String> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(C19411510wz.LIZLLL(it2.next(), 90, 90, EnumC1769850w9n.LIVE_GUIDANCE_BUBBLE_IMAGE));
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("receive pitaya message,try to show bubble with image:");
                sbLIZ3.append(i + 1);
                sbLIZ3.append("th");
                debugToast(C2188811AlT.LIZIZ(sbLIZ3));
                IIconSlot.SlotViewModel slotViewModel2 = this.viewModel;
                if (slotViewModel2 != null && (mutableLiveData2 = slotViewModel2.LLJJIII) != null) {
                    if (str3 == null || (upperCase2 = str3.toUpperCase(Locale.ROOT)) == null) {
                        upperCase2 = "ECOM_SHOP_BAG_GUIDE_WITH_IMAGE";
                    }
                    C785040Uqs c785040Uqs = new C785040Uqs(upperCase2, arrayList, str2);
                    c785040Uqs.LIZLLL = 2;
                    c785040Uqs.LJ = C679280Qkg.LIZ(4);
                    mutableLiveData2.postValue(c785040Uqs);
                    return;
                }
                return;
            }
            return;
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("receive pitaya message,try to show bubble:");
        sbLIZ4.append(i + 1);
        sbLIZ4.append("th");
        debugToast(C2188811AlT.LIZIZ(sbLIZ4));
        IIconSlot.SlotViewModel slotViewModel3 = this.viewModel;
        if (slotViewModel3 != null && (mutableLiveData = slotViewModel3.LLJJI) != null) {
            if (str3 == null || (upperCase = str3.toUpperCase(Locale.ROOT)) == null) {
                upperCase = "ECOM_SHOP_BAG_GUIDE";
            }
            C785100Uqy c785100Uqy = new C785100Uqy(upperCase, str2);
            c785100Uqy.LIZJ = 2;
            c785100Uqy.LIZLLL = C679280Qkg.LIZ(4);
            mutableLiveData.postValue(c785100Uqy);
        }
    }

    public final void nowOrDelay(long j, long j2, long j3, Function0<Unit> function0) {
        if (j3 > 0 && j > j3) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("receive pitaya message, but ");
            sbLIZ.append(j);
            sbLIZ.append(" exceed max threshold ");
            sbLIZ.append(j3);
            debugToast(C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        if (j2 < 0) {
            function0.invoke();
            return;
        }
        if (j < j2) {
            long j4 = j2 - j;
            if (j4 > 0) {
                IIconSlot.SlotViewModel slotViewModel = this.viewModel;
                if (slotViewModel != null) {
                    C948503nH.LJFF(slotViewModel, C23271099x.INSTANCE, new C445601oM(j4, function0, null));
                    return;
                }
                return;
            }
        }
        function0.invoke();
    }

    public final void showTooltipV3(final int i, String str, List<String> list, final String str2) {
        Boolean boolValueOf;
        MutableLiveData<C785100Uqy> mutableLiveData;
        String upperCase;
        MutableLiveData<C785040Uqs> mutableLiveData2;
        String upperCase2;
        String idStr;
        if (C20340514iR.LJFF()) {
            debugToast("receive pitaya message, new promotion container is showing");
            return;
        }
        EcShopBagCommonBubbleConfig ecShopBagCommonBubbleConfigLIZ = C11XZ.LIZ(i);
        if (ecShopBagCommonBubbleConfigLIZ == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("receive pitaya message, but libra config of type:");
            sbLIZ.append(i);
            sbLIZ.append(" is null");
            debugToast(C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        Room room = this.room;
        if (room != null && (idStr = room.getIdStr()) != null && 2 == C19378910rj.LIZ(idStr, "SLOT_LIVE_BOTTOM_POP_L2_AUDIENCE")) {
            return;
        }
        IIconSlot.SlotViewModel slotViewModel = this.viewModel;
        if (slotViewModel != null) {
            slotViewModel.LLJLIL = ecShopBagCommonBubbleConfigLIZ.showTime;
            slotViewModel.LLL = new InterfaceC784990Uqn() { // from class: X.180p
                @Override // X.InterfaceC784990Uqn
                public final void LIZ() {
                    String idStr2;
                    String str3;
                    this.LIZ.tooltipShowTime = SystemClock.elapsedRealtime();
                    Room room2 = this.LIZ.room;
                    if (room2 == null || (idStr2 = room2.getIdStr()) == null) {
                        idStr2 = "";
                    }
                    C19378910rj.LIZLLL(2, idStr2, null, "SLOT_SHOP_BAG_GUIDE_BUBBLE");
                    EcShopBagCommonBubbleConfig ecShopBagCommonBubbleConfigLIZ2 = C11XZ.LIZ(i);
                    if (ecShopBagCommonBubbleConfigLIZ2 != null && (str3 = ecShopBagCommonBubbleConfigLIZ2.noticeType) != null) {
                        this.LIZ.eventParamNoticeType = str3;
                    }
                    BagGuideTooltipController bagGuideTooltipController = this.LIZ;
                    bagGuideTooltipController.hasShown = true;
                    bagGuideTooltipController.reportModuleShow();
                    C19516311Xd c19516311Xd = C19516311Xd.LIZ;
                    String str4 = str2;
                    String str5 = str4 != null ? str4 : "";
                    c19516311Xd.getClass();
                    Keva keva = C19516311Xd.LIZIZ;
                    keva.storeInt(C19516311Xd.LIZ(str5), keva.getInt(C19516311Xd.LIZ(str5), 0) + 1);
                }
            };
            slotViewModel.LLLF = new InterfaceC785110Uqz() { // from class: X.180w
                @Override // X.InterfaceC785110Uqz
                public final void LIZ(int i2) {
                    String idStr2;
                    Room room2 = this.LIZ.room;
                    if (room2 == null || (idStr2 = room2.getIdStr()) == null) {
                        idStr2 = "";
                    }
                    C19378910rj.LIZLLL(3, idStr2, null, "SLOT_SHOP_BAG_GUIDE_BUBBLE");
                }
            };
        }
        EcShopBagCommonBubbleConfig ecShopBagCommonBubbleConfigLIZ2 = C11XZ.LIZ(i);
        if (ecShopBagCommonBubbleConfigLIZ2 != null) {
            boolValueOf = Boolean.valueOf(ecShopBagCommonBubbleConfigLIZ2.showImage);
        } else {
            boolValueOf = null;
        }
        String str3 = "";
        if (Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
            if (list != null && !list.isEmpty()) {
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator<String> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(C19411510wz.LIZLLL(it2.next(), 90, 90, EnumC1769850w9n.LIVE_GUIDANCE_BUBBLE_IMAGE));
                }
                IIconSlot.SlotViewModel slotViewModel2 = this.viewModel;
                if (slotViewModel2 != null && (mutableLiveData2 = slotViewModel2.LLJJIII) != null) {
                    if (str2 != null && (upperCase2 = str2.toUpperCase(Locale.ROOT)) != null) {
                        str3 = upperCase2;
                    }
                    C785040Uqs c785040Uqs = new C785040Uqs(str3, arrayList, str);
                    c785040Uqs.LIZLLL = 2;
                    c785040Uqs.LJ = C679280Qkg.LIZ(4);
                    mutableLiveData2.postValue(c785040Uqs);
                    return;
                }
                return;
            }
            return;
        }
        IIconSlot.SlotViewModel slotViewModel3 = this.viewModel;
        if (slotViewModel3 != null && (mutableLiveData = slotViewModel3.LLJJI) != null) {
            if (str2 != null && (upperCase = str2.toUpperCase(Locale.ROOT)) != null) {
                str3 = upperCase;
            }
            C785100Uqy c785100Uqy = new C785100Uqy(str3, str);
            c785100Uqy.LIZJ = 2;
            c785100Uqy.LIZLLL = C679280Qkg.LIZ(4);
            mutableLiveData.postValue(c785100Uqy);
        }
    }
}
