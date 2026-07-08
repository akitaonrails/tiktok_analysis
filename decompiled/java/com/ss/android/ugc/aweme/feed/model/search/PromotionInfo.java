package com.ss.android.ugc.aweme.feed.model.search;

import X.C098200Yq;
import X.C09CT;
import X.C189200o6;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class PromotionInfo implements Serializable {
    public static final Companion Companion = new Companion();

    @C09CT("bcm_standard_track")
    public BcmStandardTrackData bcmStandardTrack;

    @C09CT("promotion_icon")
    public Image promotionIcon;

    @C09CT("promotion_style")
    public long promotionStyle;

    @C09CT("promotion_text_style")
    public PromotionTextStyle promotionTextStyle;

    @C09CT("promotion_type")
    public int promotionType;
    public Map<String, String> trackParams;

    @C09CT("promotion_text")
    public String promotionText = "";

    @C09CT("query_promotion_priority")
    public Integer promotionPriority = 0;

    public final Map<String, String> getTrackParams() {
        if (this.trackParams == null) {
            Companion companion = Companion;
            BcmStandardTrackData bcmStandardTrackData = this.bcmStandardTrack;
            this.trackParams = companion.convertJsonStringToMap(bcmStandardTrackData != null ? bcmStandardTrackData.getTrackParam() : null);
        }
        return this.trackParams;
    }

    public final boolean isMarketingLabel() {
        return Companion.isMarketingLabel(this.promotionType);
    }

    public final boolean isPromotionLabel() {
        return Companion.isPromotionLabel(this.promotionType);
    }

    public final String miconState() {
        String str;
        Map<String, String> trackParams = getTrackParams();
        if (trackParams != null && (str = trackParams.get("micon_state")) != null) {
            return str;
        }
        if (Intrinsics.LJFF(wordState(), "marketing")) {
            return Companion.type2MIconState(this.promotionType);
        }
        return null;
    }

    public final String wordState() {
        String str;
        Map<String, String> trackParams = getTrackParams();
        if (trackParams != null && (str = trackParams.get("word_state")) != null) {
            return str;
        }
        Companion companion = Companion;
        if (companion.isMarketingLabel(this.promotionType)) {
            return "marketing";
        }
        if (companion.isPromotionLabel(this.promotionType)) {
            return "promotion";
        }
        return null;
    }

    public final BcmStandardTrackData getBcmStandardTrack() {
        return this.bcmStandardTrack;
    }

    public final Image getPromotionIcon() {
        return this.promotionIcon;
    }

    public final Integer getPromotionPriority() {
        return this.promotionPriority;
    }

    public final long getPromotionStyle() {
        return this.promotionStyle;
    }

    public final String getPromotionText() {
        return this.promotionText;
    }

    public final PromotionTextStyle getPromotionTextStyle() {
        return this.promotionTextStyle;
    }

    public final int getPromotionType() {
        return this.promotionType;
    }

    public static final class Companion {
        public final boolean isPromotionLabel(int i) {
            return i == 3;
        }

        public final Map<String, String> convertJsonStringToMap(String str) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (str == null) {
                return linkedHashMap;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    String strOptString = jSONObject.optString(next);
                    if (strOptString != null) {
                        linkedHashMap.put(next, strOptString);
                    }
                }
                C189200o6.m2constructorimpl(Unit.LIZ);
                return linkedHashMap;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return linkedHashMap;
            }
        }

        public final boolean isMarketingLabel(int i) {
            if (!isPromotionLabel(i) && i != 0) {
                return true;
            }
            return false;
        }

        public final String type2MIconState(int i) {
            return String.valueOf(i);
        }
    }

    public final void setPromotionIcon(Image image) {
        this.promotionIcon = image;
    }

    public final void setPromotionPriority(Integer num) {
        this.promotionPriority = num;
    }

    public final void setPromotionStyle(long j) {
        this.promotionStyle = j;
    }

    public final void setPromotionText(String str) {
        this.promotionText = str;
    }

    public final void setPromotionTextStyle(PromotionTextStyle promotionTextStyle) {
        this.promotionTextStyle = promotionTextStyle;
    }

    public final void setPromotionType(int i) {
        this.promotionType = i;
    }
}
