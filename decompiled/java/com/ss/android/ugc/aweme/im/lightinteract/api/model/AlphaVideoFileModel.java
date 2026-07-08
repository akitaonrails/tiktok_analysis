package com.ss.android.ugc.aweme.im.lightinteract.api.model;

import X.C09CT;
import com.ss.android.ugc.aweme.live.alphaplayer.model.DataSource;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes35.dex */
public final class AlphaVideoFileModel {

    @C09CT("landscape")
    public final Item landscape;

    @C09CT("portrait")
    public final Item portrait;

    public static final class LayerModel {

        @C09CT("alphaFrame")
        public int[] alphaArea;

        @C09CT("enableContentRTL")
        public boolean enableContentRTL;

        @C09CT("enableLayoutRTL")
        public boolean enableLayoutRTL;

        @C09CT("enableTap")
        public boolean enableTap;

        @C09CT("maskContainer")
        public MaskContainerModel maskContainer;

        @C09CT("name")
        public String name;

        @C09CT("offsetX")
        public String offsetX;

        @C09CT("offsetY")
        public String offsetY;

        @C09CT("rgbFrame")
        public int[] rgbArea;

        @C09CT("type")
        public int type;
    }

    public static final class MaskContainerModel {

        @C09CT("alignType")
        public int alignType;

        @C09CT("alphaFrame")
        public int[] alphaArea;

        @C09CT("anchorPoint")
        public int[] anchorPoint;

        @C09CT("type")
        public int containerType;

        @C09CT("contentPadding")
        public int[] contentPadding;

        @C09CT("disableFlexX")
        public boolean disableFlexX;

        @C09CT("disableFlexY")
        public boolean disableFlexY;

        @C09CT("enableContentRTL")
        public boolean enableContentRTL;

        @C09CT("fallbackLayer")
        public String fallbackLayer;

        @C09CT("flexPadding")
        public int[] flexPadding;

        @C09CT("rgbFrame")
        public int[] rgbArea;
    }

    public AlphaVideoFileModel() {
        this(null, null);
    }

    public AlphaVideoFileModel(Item item, Item item2) {
        this.portrait = item;
        this.landscape = item2;
    }

    public static final class Item {

        @C09CT("h")
        public final int actualHeight;

        @C09CT("w")
        public final int actualWidth;

        @C09CT("align")
        public final int align;

        @C09CT("aFrame")
        public final int[] alphaFrame;

        @C09CT("layers")
        public final List<LayerModel> layersModel;

        @C09CT("masks")
        public final Map<String, Map<String, DataSource.Element>> masks;

        @C09CT("path")
        public final String path;

        @C09CT("rgbFrame")
        public final int[] rgbFrame;

        @C09CT("f")
        public final int totalFrame;

        @C09CT("v")
        public final int version;

        @C09CT("videoH")
        public final int videoHeight;

        @C09CT("videoW")
        public final int videoWidth;

        public Item() {
            this(null, 0, 0, 0, 0, 0, 0, 0, null, null, null, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Item(String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int[] iArr, int[] iArr2, Map<String, ? extends Map<String, DataSource.Element>> map, List<LayerModel> list) {
            this.path = str;
            this.align = i;
            this.version = i2;
            this.totalFrame = i3;
            this.actualWidth = i4;
            this.actualHeight = i5;
            this.videoWidth = i6;
            this.videoHeight = i7;
            this.alphaFrame = iArr;
            this.rgbFrame = iArr2;
            this.masks = map;
            this.layersModel = list;
        }
    }
}
