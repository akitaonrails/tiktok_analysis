package com.bytedance.live.render.engine.alphaplayer.model;

import X.C09CT;
import X.C2246581CwS;
import X.C2246591CwT;
import X.C2246601CwU;
import X.C2247381Cxk;
import com.ss.android.ugc.aweme.live.alphaplayer.model.DataSource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes35.dex */
public final class VideoFileModelKotlin {

    @C09CT("landscape")
    public Item landscape;

    @C09CT("portrait")
    public Item portrait;

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

        public final List<C2246591CwT> LIZ() {
            C2246581CwS c2246581CwS;
            int[] iArr;
            if (this.layersModel == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (LayerModel layerModel : this.layersModel) {
                layerModel.getClass();
                C2246591CwT c2246591CwT = new C2246591CwT();
                c2246591CwT.LIZ = layerModel.name;
                int i = layerModel.type;
                c2246591CwT.LIZIZ = i;
                if (i == 0 || i == 1) {
                    c2246591CwT.LJII = layerModel.enableContentRTL;
                    c2246591CwT.LJI = layerModel.enableLayoutRTL;
                } else if (i == 2) {
                    c2246591CwT.LIZLLL = new C2247381Cxk(layerModel.alphaArea);
                    c2246591CwT.LIZJ = new C2247381Cxk(layerModel.rgbArea);
                    c2246591CwT.LJ = layerModel.offsetX;
                    c2246591CwT.LJFF = layerModel.offsetY;
                    c2246591CwT.LJII = layerModel.enableContentRTL;
                    c2246591CwT.LJI = layerModel.enableLayoutRTL;
                }
                MaskContainerModel maskContainerModel = layerModel.maskContainer;
                if (maskContainerModel != null) {
                    boolean z = layerModel.enableLayoutRTL;
                    int[] iArr2 = maskContainerModel.alphaArea;
                    if (iArr2 == null || maskContainerModel.rgbArea == null) {
                        c2246581CwS = null;
                    } else {
                        c2246581CwS = new C2246581CwS();
                        c2246581CwS.LIZ = maskContainerModel.containerType;
                        c2246581CwS.LIZIZ = maskContainerModel.alignType;
                        c2246581CwS.LIZLLL = new C2247381Cxk(iArr2);
                        c2246581CwS.LIZJ = new C2247381Cxk(maskContainerModel.rgbArea);
                        int[] iArr3 = maskContainerModel.contentPadding;
                        c2246581CwS.LJ = (iArr3 == null || iArr3.length != 4) ? null : new C2246601CwU(iArr3[1], iArr3[3], iArr3[0], iArr3[2]);
                        int[] iArr4 = maskContainerModel.flexPadding;
                        if (iArr4 != null && (iArr = maskContainerModel.anchorPoint) != null) {
                            c2246581CwS.LJFF = iArr4.length != 4 ? null : new C2246601CwU(iArr4[1], iArr4[3], iArr4[0], iArr4[2]);
                            c2246581CwS.LJIIJ = new int[]{iArr[0], iArr[1]};
                            c2246581CwS.LJI = maskContainerModel.disableFlexX;
                            c2246581CwS.LJII = maskContainerModel.disableFlexY;
                        }
                        c2246581CwS.LJIIJJI = maskContainerModel.fallbackLayer;
                        c2246581CwS.LJIIIZ = maskContainerModel.enableContentRTL;
                        c2246581CwS.LJIIIIZZ = z;
                    }
                    c2246591CwT.LJIIIIZZ = c2246581CwS;
                }
                arrayList.add(c2246591CwT);
            }
            return arrayList;
        }
    }

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
}
