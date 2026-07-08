package com.ss.android.ugc.aweme.ecommerce.image.adapt;

import X.C09CT;
import com.bytedance.scene.Scene;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes29.dex */
public final class EcomImageAdaptSizeConfigModel {

    @C09CT("adapt_strategy")
    public final String adaptStrategy;

    @C09CT("adapt_template")
    public final Map<String, EcomImageXConfigAdaptTemplate> adaptTemplate;

    @C09CT("image_adapt_type")
    public final String adaptType;

    @C09CT("config_screen_stages")
    public final List<Integer> configScreenWidthStages;

    @C09CT("keys")
    public final List<String> keys;

    @C09CT(Scene.SCENE_SERVICE)
    public final String scene;

    @C09CT("scenes")
    public final List<String> scenes;

    @C09CT("screen_adapt_type")
    public final String screenAdaptType;

    @C09CT("screen_stages")
    public final List<Integer> screenWidthStages;

    @C09CT("width")
    public final String width;

    @C09CT("width_grade")
    public final List<Integer> widthStages;

    public EcomImageAdaptSizeConfigModel() {
        this(null, null, null, null, null, null, null, null, null, null, null);
    }

    public final int hashCode() {
        List<String> list = this.keys;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.scene;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list2 = this.scenes;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Map<String, EcomImageXConfigAdaptTemplate> map = this.adaptTemplate;
        int iHashCode4 = (iHashCode3 + (map == null ? 0 : map.hashCode())) * 31;
        String str2 = this.width;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<Integer> list3 = this.widthStages;
        int iHashCode6 = (iHashCode5 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str3 = this.adaptType;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.screenAdaptType;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<Integer> list4 = this.screenWidthStages;
        int iHashCode9 = (iHashCode8 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<Integer> list5 = this.configScreenWidthStages;
        int iHashCode10 = (iHashCode9 + (list5 == null ? 0 : list5.hashCode())) * 31;
        String str5 = this.adaptStrategy;
        return iHashCode10 + (str5 != null ? str5.hashCode() : 0);
    }

    public EcomImageAdaptSizeConfigModel(List<String> list, String str, List<String> list2, Map<String, EcomImageXConfigAdaptTemplate> map, String str2, List<Integer> list3, String str3, String str4, List<Integer> list4, List<Integer> list5, String str5) {
        this.keys = list;
        this.scene = str;
        this.scenes = list2;
        this.adaptTemplate = map;
        this.width = str2;
        this.widthStages = list3;
        this.adaptType = str3;
        this.screenAdaptType = str4;
        this.screenWidthStages = list4;
        this.configScreenWidthStages = list5;
        this.adaptStrategy = str5;
    }
}
