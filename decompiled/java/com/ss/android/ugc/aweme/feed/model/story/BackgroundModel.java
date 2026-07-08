package com.ss.android.ugc.aweme.feed.model.story;

import X.C09CT;
import X.C13BV;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class BackgroundModel implements Serializable {

    @C09CT("background_gecko_id")
    public String backgroundGeckoId;

    @C09CT("background_img_url")
    public String backgroundImgUrl;

    @C09CT("background_type")
    public int backgroundType;

    @C09CT("gradient_img_data")
    public GradientImageData gradientImgData;

    @C09CT("switch_color")
    public String switchColor;

    public BackgroundModel() {
        this(1, null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BackgroundModel)) {
            return false;
        }
        BackgroundModel backgroundModel = (BackgroundModel) obj;
        return this.backgroundType == backgroundModel.backgroundType && Intrinsics.LJFF(this.gradientImgData, backgroundModel.gradientImgData) && Intrinsics.LJFF(this.switchColor, backgroundModel.switchColor) && Intrinsics.LJFF(this.backgroundImgUrl, backgroundModel.backgroundImgUrl) && Intrinsics.LJFF(this.backgroundGeckoId, backgroundModel.backgroundGeckoId);
    }

    public static final class GradientImageData implements Serializable {

        @C09CT("colors")
        public List<String> colors;

        @C09CT("locations")
        public List<Float> locations;

        public GradientImageData() {
            this(null, null, 3, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GradientImageData)) {
                return false;
            }
            GradientImageData gradientImageData = (GradientImageData) obj;
            return Intrinsics.LJFF(this.colors, gradientImageData.colors) && Intrinsics.LJFF(this.locations, gradientImageData.locations);
        }

        public GradientImageData(List<String> list, List<Float> list2) {
            this.colors = list;
            this.locations = list2;
        }

        public GradientImageData(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? C13BV.INSTANCE : list2);
        }
    }

    public BackgroundModel(int i, GradientImageData gradientImageData, String str, String str2, String str3) {
        this.backgroundType = i;
        this.gradientImgData = gradientImageData;
        this.switchColor = str;
        this.backgroundImgUrl = str2;
        this.backgroundGeckoId = str3;
    }
}
