package com.bytedance.ies.xelement.alphavideo;

import X.C09CT;
import com.ss.android.ugc.aweme.live.alphaplayer.model.DataSource;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public class VideoFileModel {

    @C09CT("landscape")
    public Item landscape;

    @C09CT("portrait")
    public Item portrait;

    public static class Item {

        @C09CT("h")
        public int actualHeight;

        @C09CT("w")
        public int actualWidth;

        @C09CT("align")
        public int align;

        @C09CT("aFrame")
        public int[] alphaFrame;

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
    }
}
