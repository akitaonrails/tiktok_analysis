package com.ss.android.ugc.aweme.live.liveevent;

import X.C0L4G;
import X.C0PEM;
import X.C0UO0;
import X.C1161920gLG;
import X.C11NZ;
import X.C1850780yGK;
import X.C19748512Ol;
import X.C2296808zG;
import X.C23250099c;
import X.C470590Icr;
import X.C480460Ism;
import X.C5183020f;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC2183451Acp;
import android.content.Context;
import android.graphics.Bitmap;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.liveevent.LiveEventApi;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.comp.api.event.ILiveEventService;
import com.bytedance.android.livesdk.comp.api.event.api.data.LiveEventModule;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveEventPageLynxUrl;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveEventSimplifyCreateSetting;
import com.bytedance.android.livesdk.livesetting.liveevent.LiveEventCreateFromGroupEnableSetting;
import com.bytedance.android.livesdk.livesetting.liveevent.LiveEventPeriodicAnchorSetting;
import com.bytedance.android.livesdk.livesetting.liveevent.LiveEventPublishPageCreationEnableSetting;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.BaseSheet;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.feed.model.EventStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.liveevent.ILiveEventOuterService;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.shortvideo.publish.CreateAwemeResponse;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.aweme.story.publish.ISocialPublishBridgeService;
import com.ss.android.ugc.aweme.story.publish.SocialPublishCallback;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import com.ss.android.ugc.aweme.tools.sticker.core.liveeventstory.LiveEventStoryStickerModel;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS261S0000000_22;
import kotlin.jvm.internal.AwS24S2000000_27;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;
import tikcast.api.anchor.GetAnchorManagerABResponse;
import webcast.api.room.PreviewTimeReportResponse;

/* JADX INFO: loaded from: classes28.dex */
public final class LiveEventOuterService implements ILiveEventOuterService {
    public static final LiveEventOuterService LIZ = new LiveEventOuterService();
    public static final Map<String, Boolean> LIZIZ;

    public interface AnchorManagerABConfigApi {
        @InterfaceC1501160pAQ("/webcast/anchor/manager/ab/config")
        ListenableFuture<GetAnchorManagerABResponse> getAnchorManagerABConfig(@InterfaceC1501070pAH("sub_ab_param") String str, @InterfaceC1501070pAH("need_sub_ab_param") boolean z);
    }

    static {
        final AFwS261S0000000_22 aFwS261S0000000_22 = AFwS261S0000000_22.get$arr$(80);
        ((ISocialPublishBridgeService) ServiceManager.get().getService(ISocialPublishBridgeService.class)).Kg(new SocialPublishCallback() { // from class: X.0oFu
            @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
            public final void onPublishCanceled(PublishModel publishModel, AbstractC1433460nPE abstractC1433460nPE, Object obj) {
            }

            @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
            public final void onPublishProgress(int i, C1434900nRY c1434900nRY) {
            }

            @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
            public final void onReadyToCreateAweme(PublishModel publishModel) {
            }

            @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
            public final void onReportPublish() {
            }

            @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
            public final void onSynthesisSuccess(PublishModel publishModel, String str) {
            }

            @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
            public final void onPublishStart(PublishModel publishModel) throws JSONException {
                Long lValueOf;
                if (publishModel == null) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                LiveEventStoryStickerModel liveEventStoryStickerModelInvoke = aFwS261S0000000_22.invoke(publishModel);
                if (liveEventStoryStickerModelInvoke != null) {
                    lValueOf = Long.valueOf(liveEventStoryStickerModelInvoke.getEventId());
                } else {
                    lValueOf = null;
                }
                jSONObject.put("event_id", lValueOf);
                C389001fE.LIZ("live_event_card_story_start", jSONObject, System.currentTimeMillis(), false);
            }

            @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
            public final void onPublishSuccess(PublishModel publishModel, CreateAwemeResponse createAwemeResponse) throws JSONException {
                Long lValueOf;
                if (publishModel == null) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                LiveEventStoryStickerModel liveEventStoryStickerModelInvoke = aFwS261S0000000_22.invoke(publishModel);
                if (liveEventStoryStickerModelInvoke != null) {
                    lValueOf = Long.valueOf(liveEventStoryStickerModelInvoke.getEventId());
                } else {
                    lValueOf = null;
                }
                jSONObject.put("event_id", lValueOf);
                jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, 1);
                C389001fE.LIZ("live_event_card_story_finish", jSONObject, System.currentTimeMillis(), false);
            }

            @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
            public final void onPublishFailed(PublishModel publishModel, C1434650nR9 c1434650nR9, String str) throws JSONException {
                Long lValueOf;
                if (publishModel == null) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                LiveEventStoryStickerModel liveEventStoryStickerModelInvoke = aFwS261S0000000_22.invoke(publishModel);
                if (liveEventStoryStickerModelInvoke != null) {
                    lValueOf = Long.valueOf(liveEventStoryStickerModelInvoke.getEventId());
                } else {
                    lValueOf = null;
                }
                jSONObject.put("event_id", lValueOf);
                jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, 0);
                C389001fE.LIZ("live_event_card_story_finish", jSONObject, System.currentTimeMillis(), false);
            }
        }, new AwS601S0100000_22(aFwS261S0000000_22, 137));
        LIZIZ = new LinkedHashMap();
    }

    @Override // com.ss.android.ugc.aweme.liveevent.ILiveEventOuterService
    public final boolean enableAnchorPeriodicLiveEvent() {
        return LiveEventPeriodicAnchorSetting.INSTANCE.enable();
    }

    @Override // com.ss.android.ugc.aweme.liveevent.ILiveEventOuterService
    public final boolean enableCreateLiveEventInGroupChat() {
        return LiveEventCreateFromGroupEnableSetting.INSTANCE.getValue();
    }

    @Override // com.ss.android.ugc.aweme.liveevent.ILiveEventOuterService
    public final boolean getAnchorManagerABConfigIfFullRollout() {
        Map<String, Boolean> map = LIZIZ;
        if (map.containsKey("anchor_management_parent_switch") && map.containsKey("anchor_management_son_switch")) {
            LinkedHashMap linkedHashMap = (LinkedHashMap) map;
            Object obj = linkedHashMap.get("anchor_management_parent_switch");
            Boolean bool = Boolean.FALSE;
            return (Intrinsics.LJFF(obj, bool) && Intrinsics.LJFF(linkedHashMap.get("anchor_management_son_switch"), bool)) ? false : true;
        }
        if (map.containsKey("anchor_management_parent_switch")) {
            Boolean bool2 = (Boolean) ((LinkedHashMap) map).get("anchor_management_parent_switch");
            if (bool2 != null) {
                return bool2.booleanValue();
            }
            return false;
        }
        if (map.containsKey("anchor_management_son_switch")) {
            Boolean bool3 = (Boolean) ((LinkedHashMap) map).get("anchor_management_son_switch");
            if (bool3 != null) {
                return bool3.booleanValue();
            }
            return false;
        }
        try {
            C480460Ism.LIZ().getClass();
            GetAnchorManagerABResponse.Data data = ((AnchorManagerABConfigApi) C480460Ism.LIZLLL(AnchorManagerABConfigApi.class)).getAnchorManagerABConfig(null, false).get().data;
            if (data != null) {
                Map<String, Long> map2 = data.abConfigMap;
                if (map2 != null) {
                    if (map2.containsKey("anchor_management_parent_switch")) {
                        Long l = map2.get("anchor_management_parent_switch");
                        LIZIZ.put("anchor_management_parent_switch", Boolean.valueOf(l != null && l.longValue() == 1));
                    } else if (map2 != null) {
                    }
                    if (map2.containsKey("anchor_management_son_switch")) {
                        Long l2 = map2.get("anchor_management_son_switch");
                        LIZIZ.put("anchor_management_son_switch", Boolean.valueOf(l2 != null && l2.longValue() == 1));
                    }
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) LIZIZ;
        Object obj2 = linkedHashMap2.get("anchor_management_parent_switch");
        Boolean bool4 = Boolean.FALSE;
        return (Intrinsics.LJFF(obj2, bool4) && Intrinsics.LJFF(linkedHashMap2.get("anchor_management_son_switch"), bool4)) ? false : true;
    }

    @Override // com.ss.android.ugc.aweme.liveevent.ILiveEventOuterService
    public final String getLiveEventCreateSchema() {
        return LiveEventPageLynxUrl.INSTANCE.getLiveEventTimePickerSchema();
    }

    @Override // com.ss.android.ugc.aweme.liveevent.ILiveEventOuterService
    public final String getLiveEventListSchema() {
        return LiveEventPageLynxUrl.INSTANCE.getLiveEventListLynxSchema();
    }

    @Override // com.ss.android.ugc.aweme.liveevent.ILiveEventOuterService
    public final String getLiveEventSchemaInGroupChat() {
        return LiveEventPageLynxUrl.INSTANCE.getLiveEventSchemaInGroupChat();
    }

    @Override // com.ss.android.ugc.aweme.liveevent.ILiveEventOuterService
    public final boolean getLiveEventShieldConfirmValue() {
        return ((InterfaceC2183451Acp) C1161920gLG.LIZJ(IInteractService.class)).getLiveEventShieldConfirmValue();
    }

    @Override // com.ss.android.ugc.aweme.liveevent.ILiveEventOuterService
    public final boolean getLiveEventSimplifyCreateEnable() {
        return LiveEventSimplifyCreateSetting.INSTANCE.enable();
    }

    @Override // com.ss.android.ugc.aweme.liveevent.ILiveEventOuterService
    public final boolean getPublishPageCreationEnable() {
        return LiveEventPublishPageCreationEnableSetting.INSTANCE.getValue();
    }

    @Override // com.ss.android.ugc.aweme.liveevent.ILiveEventOuterService
    public final boolean getAnchorManagerABConfigWithSubParam(String str) {
        Map<String, Long> map;
        Long l;
        Map<String, Boolean> map2 = LIZIZ;
        boolean z = false;
        if (map2.containsKey(str)) {
            Boolean bool = (Boolean) ((LinkedHashMap) map2).get(str);
            if (bool == null) {
                return false;
            }
            return bool.booleanValue();
        }
        try {
            C480460Ism.LIZ().getClass();
            GetAnchorManagerABResponse.Data data = ((AnchorManagerABConfigApi) C480460Ism.LIZLLL(AnchorManagerABConfigApi.class)).getAnchorManagerABConfig(str, true).get().data;
            if (data != null && (map = data.abConfigMap) != null && (l = map.get(str)) != null) {
                if (l.longValue() == 1) {
                    z = true;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZIZ.put(str, Boolean.valueOf(z));
        return z;
    }

    @Override // com.ss.android.ugc.aweme.liveevent.ILiveEventOuterService
    public final void setLiveEventShieldConfirmValue(boolean z) {
        ((InterfaceC2183451Acp) C1161920gLG.LIZJ(IInteractService.class)).setLiveEventShieldConfirmValue(z);
    }

    @Override // com.ss.android.ugc.aweme.liveevent.ILiveEventOuterService
    public final Bitmap createTopBottomGradientBitmap(int i, int i2) {
        return ((ILiveEventService) C1161920gLG.LIZJ(ILiveEventService.class)).createTopBottomGradientBitmap(i, i2);
    }

    @Override // com.ss.android.ugc.aweme.liveevent.ILiveEventOuterService
    public final Object getStoryStickerBgColor(ImageModel imageModel, InterfaceC1364105Vn<? super Pair<Integer, Integer>> interfaceC1364105Vn) {
        return ((ILiveEventService) C1161920gLG.LIZJ(ILiveEventService.class)).getStoryStickerBgColor(imageModel, interfaceC1364105Vn);
    }

    @Override // com.ss.android.ugc.aweme.liveevent.ILiveEventOuterService
    public final void reportLinkMicRelatedEvent(String str, Map<String, String> map) {
        ((InterfaceC2183451Acp) C1161920gLG.LIZJ(IInteractService.class)).reportLinkMicRelatedEvent(str, map);
    }

    @Override // com.ss.android.ugc.aweme.liveevent.ILiveEventOuterService
    public final C11NZ<C470590Icr<PreviewTimeReportResponse.ResponseData>> reportPaidEventPreviewTime(long j, long j2) {
        C480460Ism.LIZ().getClass();
        return ((LiveEventApi) C480460Ism.LIZLLL(LiveEventApi.class)).reportSubscribePreviewTime(j, j2, 1).LJIILIIL(new C0UO0());
    }

    @Override // com.ss.android.ugc.aweme.liveevent.ILiveEventOuterService
    public final void openLiveEventBgMaskSparkContainer(Context context, String str, String str2) {
        String liveEvent60PercentBgMaskSchema = LiveEventPageLynxUrl.INSTANCE.getLiveEvent60PercentBgMaskSchema();
        if (context != null && liveEvent60PercentBgMaskSchema.length() != 0 && str != null && !a0.LJJJIL(str)) {
            ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).YC1(context, liveEvent60PercentBgMaskSchema, new AwS24S2000000_27(str, str2, 0));
        }
    }

    @Override // com.ss.android.ugc.aweme.liveevent.ILiveEventOuterService
    public final void openLiveEventSparkContainer(Context context, String str, String str2) {
        String liveEvent60PercentSchema = LiveEventPageLynxUrl.INSTANCE.getLiveEvent60PercentSchema();
        if (context != null && liveEvent60PercentSchema.length() != 0 && str != null && !a0.LJJJIL(str)) {
            ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).YC1(context, liveEvent60PercentSchema, new AwS24S2000000_27(str, str2, 1));
        }
    }

    @Override // com.ss.android.ugc.aweme.liveevent.ILiveEventOuterService
    public final void getLiveEventUser(Context context, long j, LifecycleOwner lifecycleOwner, Function1<? super Pair<? extends List<Long>, ? extends List<String>>, Unit> function1, Function0<Unit> function0) {
        ((InterfaceC2183451Acp) C1161920gLG.LIZJ(IInteractService.class)).LJIJ(context, j, lifecycleOwner, new C5183020f((Function1) function1, (Function1<? super Long, Object>) 138), function0);
    }

    @Override // com.ss.android.ugc.aweme.liveevent.ILiveEventOuterService
    public final void startStoryEditFromLiveEvent(Context context, String str, String str2, Number number, String str3) {
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
        if (creativeToolsPluginService == null || !creativeToolsPluginService.LIZJ(context, "live_event", true) || str == null) {
            return;
        }
        try {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0L4G((EventStruct) C19748512Ol.LIZIZ.LJII(str, EventStruct.class), context, null), 3);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // com.ss.android.ugc.aweme.liveevent.ILiveEventOuterService
    public final void inviteLiveEventUser(Context context, long j, List<Long> list, LifecycleOwner lifecycleOwner, Function0<Unit> function0, Function0<Unit> function02) {
        ((InterfaceC2183451Acp) C1161920gLG.LIZJ(IInteractService.class)).inviteLiveEventUser(context, j, list, lifecycleOwner, function0, function02);
    }

    @Override // com.ss.android.ugc.aweme.liveevent.ILiveEventOuterService
    public final void showLiveEventSelectionDialog(Context context, String str, boolean z, float f, int i, Function2<? super BaseSheet, ? super Integer, Unit> function2, Function2<? super BaseSheet, ? super Integer, Unit> function22, Function2<? super BaseSheet, ? super Integer, Unit> function23, Function1<? super BaseSheet, Unit> function1) {
        if (context == null) {
            return;
        }
        C1850780yGK.LIZ(context, (List) GsonProtectorUtils.fromJson(C19748512Ol.LIZIZ, str, new TypeToken<List<? extends LiveEventModule>>() { // from class: X.00Wt
        }.getType()), z, f, i, function2, function22, function23, function1);
    }
}
