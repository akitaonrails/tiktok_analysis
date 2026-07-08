package com.ss.android.ugc.aweme.search.pages.result.nimble.model;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class NimbleCardInfo implements Serializable {

    @C09CT("aweme_list")
    public final List<Aweme> awemeList;

    @C09CT("card_raw_data")
    public final Map<String, Object> cardRawData;
    public transient Map<Object, Map<String, Object>> dataToMap;

    @C09CT("nimble_card_type")
    public final Integer nimbleCardType;

    @C09CT("scene_type")
    public final Integer sceneType;

    public NimbleCardInfo() {
        this(null, null, null, null);
    }

    public final NimbleCardInfo copy(Integer num, Integer num2, List<? extends Aweme> list, Map<String, ? extends Object> map) {
        return new NimbleCardInfo(num, num2, list, map);
    }

    public int hashCode() {
        Integer num = this.sceneType;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.nimbleCardType;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<Aweme> list = this.awemeList;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Map<String, Object> map = this.cardRawData;
        return iHashCode3 + (map != null ? map.hashCode() : 0);
    }

    public final void setDataToMap(Map<Object, Map<String, Object>> map) {
        this.dataToMap = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NimbleCardInfo(Integer num, Integer num2, List<? extends Aweme> list, Map<String, ? extends Object> map) {
        this.sceneType = num;
        this.nimbleCardType = num2;
        this.awemeList = list;
        this.cardRawData = map;
        this.dataToMap = new LinkedHashMap();
    }
}
