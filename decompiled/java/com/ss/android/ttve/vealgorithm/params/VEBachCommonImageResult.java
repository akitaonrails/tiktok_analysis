package com.ss.android.ttve.vealgorithm.params;

import com.ss.android.vesdk.VERect;
import com.ss.android.vesdk.VERectF;
import java.util.HashMap;

/* JADX INFO: loaded from: classes28.dex */
public class VEBachCommonImageResult extends VEAlgorithmResult {
    public float[] classificationConfidence;
    public byte[] classificationExceedThresh;
    public String[] classificationLabel;
    public float[] classificationThresh;
    public int[][] findCountorX;
    public int[][] findCountorY;
    public HashMap<String, Integer> imageScores;
    public MattingContent mattingContent;
    public ReframeContent[] reframeContents;
    public float[] vectorResult;

    public static class MattingContent {
        public VERect box;
        public boolean isValid;
        public short[] mattingRgbaBuffer;
        public String outputPath;
    }

    public static class ReframeContent {
        public VERectF box;
        public boolean isValid;
    }

    public VEBachCommonImageResult() {
        this.type = VEAlgorithmType.VEAlgorithmTypeBachCommonImage;
    }
}
