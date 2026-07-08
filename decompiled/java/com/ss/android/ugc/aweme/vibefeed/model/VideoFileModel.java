package com.ss.android.ugc.aweme.vibefeed.model;

import X.C09CT;
import com.ss.android.ugc.aweme.live.alphaplayer.model.DataSource;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes30.dex */
public final class VideoFileModel {

    @C09CT("landscape")
    public Item landscape;

    @C09CT("portrait")
    public Item portrait;

    /* JADX INFO: loaded from: classes35.dex */
    public static final class Item {

        @C09CT("h")
        public int actualHeight;

        @C09CT("w")
        public int actualWidth;

        @C09CT("align")
        public int align;

        @C09CT("aFrame")
        public int[] alphaFrame;

        @C09CT("layers")
        public final List<LayerModel> layersModel;

        @C09CT("masks")
        public Map<String, Map<String, DataSource.Element>> masks;

        @C09CT("path")
        public String path;

        @C09CT("rgbFrame")
        public int[] rgbFrame;

        @C09CT("f")
        public int totalFrame;

        @C09CT("v")
        public int version;

        @C09CT("videoH")
        public int videoHeight;

        @C09CT("videoW")
        public int videoWidth;

        /* JADX WARN: Removed duplicated region for block: B:36:0x00e1  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.util.List<X.C2246591CwT> LIZ() {
            /*
                Method dump skipped, instruction units count: 238
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.vibefeed.model.VideoFileModel.Item.LIZ():java.util.List");
        }
    }

    /* JADX INFO: loaded from: classes35.dex */
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

    /* JADX INFO: loaded from: classes35.dex */
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
}
