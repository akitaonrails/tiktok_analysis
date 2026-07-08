package com.bytedance.android.livesdk.livesetting.linkmic.match;

import X.C20441214yg;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("tiktok_live_lynx_match_url_list")
public final class MatchItemCardLynxUrlSetting {
    public static final String DEFAULT = "";
    public static final MatchItemCardLynxUrlSetting INSTANCE;
    public static final String matchFaq;
    public static final String matchItemsGuide;
    public static final String matchItemsPanel;
    public static final String matchItemsShortTouch;

    static {
        MatchItemCardLynxUrlSetting matchItemCardLynxUrlSetting = new MatchItemCardLynxUrlSetting();
        INSTANCE = matchItemCardLynxUrlSetting;
        matchFaq = matchItemCardLynxUrlSetting.getValue().optString("match_faq", "");
        matchItemsGuide = matchItemCardLynxUrlSetting.getValue().optString("match_items_guide", "");
        matchItemsPanel = matchItemCardLynxUrlSetting.getValue().optString("match_items_panel", "");
        matchItemsShortTouch = matchItemCardLynxUrlSetting.getValue().optString("match_items_short_touch", "");
    }

    public final JSONObject getValue() {
        JSONObject jSONObject = new JSONObject();
        try {
            String stringValue = SettingsManager.INSTANCE.getStringValue("tiktok_live_lynx_match_url_list", DEFAULT);
            if (!a0.LJJJIL(stringValue)) {
                return new JSONObject(stringValue);
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJI("ItemCardLynxSetting", e);
        }
        return jSONObject;
    }

    public final String getMatchFaq() {
        return matchFaq;
    }

    public final String getMatchItemsGuide() {
        return matchItemsGuide;
    }

    public final String getMatchItemsPanel() {
        return matchItemsPanel;
    }

    public final String getMatchItemsShortTouch() {
        return matchItemsShortTouch;
    }
}
