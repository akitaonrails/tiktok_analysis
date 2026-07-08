package com.bytedance.android.livesdk.impl.revenue.strategy.guide;

import X.C098200Yq;
import X.C158B;
import X.C1697810uHb;
import X.C183100n7;
import X.C189200o6;
import X.C2095008Iq;
import X.C443120HZe;
import X.C930940aKi;
import com.bytedance.android.live.ai.api.pitaya.GiftGuideTriggerResultChannel;
import com.bytedance.android.live.ai.api.pitaya.LivePitayaEnv;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.message.GiftGuideMessage;
import com.bytedance.android.livesdk.model.message.GuidePageResource;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.pitaya.api.PTYMessageHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.text.a0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class LiveGiftGuideBubbleMessageHandler implements PTYMessageHandler {
    public static final LiveGiftGuideBubbleMessageHandler INSTANCE = new LiveGiftGuideBubbleMessageHandler();
    public static final AtomicBoolean registered = new AtomicBoolean(false);
    public static final int $stable = 8;

    public final void register() {
        if (registered.compareAndSet(false, true)) {
            LivePitayaEnv.LJIIL().registerMessageHandler("live_bubble_msg_send", this);
        }
    }

    public final void unregister() {
        if (registered.compareAndSet(true, false)) {
            LivePitayaEnv.LJIIL().removeMessageHandler("live_bubble_msg_send");
        }
    }

    @Override // com.bytedance.pitaya.api.PTYMessageHandler
    public JSONObject onMessage(JSONObject jSONObject) throws JSONException {
        long id;
        Object c098200Yq;
        String string;
        long jLongValue;
        Long lLJIILIIL;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            id = room.getId();
        } else {
            id = 0;
        }
        if (id <= 0) {
            return null;
        }
        C183100n7.LIZ("live_bubble_msg_send", jSONObject);
        String strLIZJ = C183100n7.LIZJ("guide_type", jSONObject);
        try {
            Object objOpt = jSONObject.opt("gift_id");
            if (objOpt instanceof Number) {
                jLongValue = ((Number) objOpt).longValue();
            } else if ((objOpt instanceof String) && (lLJIILIIL = C2095008Iq.LJIILIIL((String) objOpt)) != null) {
                jLongValue = lLJIILIIL.longValue();
            } else {
                jLongValue = 0;
            }
            c098200Yq = Long.valueOf(jLongValue);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = 0L;
        }
        long jLongValue2 = ((Number) c098200Yq).longValue();
        String strLIZJ2 = C183100n7.LIZJ("trigger_name", jSONObject);
        String strLIZJ3 = C183100n7.LIZJ("text_key", jSONObject);
        String strLIZJ4 = C183100n7.LIZJ("image_uri", jSONObject);
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("image_url_list");
        if (jSONArrayOptJSONArray != null) {
            int length = jSONArrayOptJSONArray.length();
            for (int i = 0; i < length; i++) {
                Object objOpt2 = jSONArrayOptJSONArray.opt(i);
                if (objOpt2 != null) {
                    if (objOpt2 instanceof String) {
                        string = (String) objOpt2;
                    } else {
                        string = objOpt2.toString();
                    }
                    if (string != null && (!a0.LJJJIL(string))) {
                        arrayList.add(string);
                    }
                }
            }
        }
        if (!a0.LJJJIL(strLIZJ) && jLongValue2 > 0 && !a0.LJJJIL(strLIZJ2) && !a0.LJJJIL(strLIZJ3)) {
            if (a0.LJJJIL(strLIZJ4) && arrayList.isEmpty()) {
                return null;
            }
            GuidePageResource guidePageResource = new GuidePageResource();
            if (!a0.LJJJIL(strLIZJ3)) {
                List<Text> list = guidePageResource.texts;
                Text text = new Text();
                text.key = strLIZJ3;
                list.add(text);
            }
            if ((!a0.LJJJIL(strLIZJ4)) || (!arrayList.isEmpty())) {
                List<ImageModel> list2 = guidePageResource.icons;
                ImageModel imageModel = new ImageModel();
                if (!a0.LJJJIL(strLIZJ4)) {
                    imageModel.setUri(strLIZJ4);
                }
                if (!arrayList.isEmpty()) {
                    imageModel.setUrls(arrayList);
                }
                list2.add(imageModel);
            }
            GiftGuideMessage giftGuideMessage = new GiftGuideMessage();
            CommonMessageData commonMessageData = new CommonMessageData();
            commonMessageData.roomId = id;
            commonMessageData.messageId = C158B.LIZ();
            commonMessageData.showMsg = true;
            commonMessageData.method = "live_bubble_msg_send";
            giftGuideMessage.baseMessage = commonMessageData;
            giftGuideMessage.giftId = jLongValue2;
            giftGuideMessage.guideType = strLIZJ;
            giftGuideMessage.triggerName = strLIZJ2;
            if ((!guidePageResource.texts.isEmpty()) || (!guidePageResource.icons.isEmpty())) {
                giftGuideMessage.guidePageResources = C1697810uHb.LJIILJJIL(guidePageResource);
            }
            DataChannelGlobal.LLILZ.HQ2(GiftGuideTriggerResultChannel.class, new C443120HZe(giftGuideMessage, Long.valueOf(id), null));
            return null;
        }
        return null;
    }
}
