package com.ss.android.ugc.aweme.model.api.data;

import X.C09CT;
import X.C19423210ys;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes30.dex */
public final class ProfileNaviDataModel implements Serializable {

    @C09CT("animated_gifs")
    public List<ProfileNaviAnimatedGifDataModel> animationList;

    @C09CT("background_color")
    public String background_color;

    @C09CT("category")
    public int category;

    @C09CT("features")
    public List<ProfileNaviFeatureDataModel> features;

    @C09CT("navi_id")
    public String navi_id;

    @C09CT("staticImage")
    public List<ProfileNaviStaticImageDataModel> staticImage;

    @C09CT("user_id")
    public String user_id;

    public ProfileNaviDataModel() {
        this(null, null, null, null, null, null, 0, 127, null);
    }

    public final void setAnimationList(List<ProfileNaviAnimatedGifDataModel> list) {
        this.animationList = list;
    }

    public final void setBackground_color(String str) {
        this.background_color = str;
    }

    public final void setCategory(int i) {
        this.category = i;
    }

    public final void setFeatures(List<ProfileNaviFeatureDataModel> list) {
        this.features = list;
    }

    public final void setNavi_id(String str) {
        this.navi_id = str;
    }

    public final void setStaticImage(List<ProfileNaviStaticImageDataModel> list) {
        this.staticImage = list;
    }

    public final void setUser_id(String str) {
        this.user_id = str;
    }

    public ProfileNaviDataModel(String str, String str2, String str3, List<ProfileNaviAnimatedGifDataModel> list, List<ProfileNaviFeatureDataModel> list2, List<ProfileNaviStaticImageDataModel> list3, int i) {
        this.navi_id = str;
        this.user_id = str2;
        this.background_color = str3;
        this.animationList = list;
        this.features = list2;
        this.staticImage = list3;
        this.category = i;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [int] */
    /* JADX WARN: Type inference failed for: r7v3 */
    public ProfileNaviDataModel(String str, String str2, String str3, List list, List list2, List list3, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        ?? r7 = i;
        List list4 = list2;
        List list5 = list;
        String str4 = str3;
        String str5 = str2;
        String str6 = (i2 & 1) != 0 ? null : str;
        str5 = (i2 & 2) != 0 ? null : str5;
        str4 = (i2 & 4) != 0 ? "#A5E6FF" : str4;
        list5 = (i2 & 8) != 0 ? null : list5;
        list4 = (i2 & 16) != 0 ? null : list4;
        List list6 = (i2 & 32) == 0 ? list3 : null;
        if ((i2 & 64) != 0) {
            C19423210ys.LIZ.getClass();
            r7 = C19423210ys.LIZJ;
        }
        this(str6, str5, str4, list5, list4, list6, r7);
    }
}
