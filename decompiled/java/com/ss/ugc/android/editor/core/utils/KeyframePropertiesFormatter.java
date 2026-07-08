package com.ss.ugc.android.editor.core.utils;

import com.bytedance.ies.nle.editor_jni.NLEMatrix;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLESegmentChromaChannel;
import com.bytedance.ies.nle.editor_jni.NLESegmentFilter;
import com.bytedance.ies.nle.editor_jni.NLESegmentMask;
import com.bytedance.ies.nle.editor_jni.NLESegmentSticker;
import com.bytedance.ies.nle.editor_jni.NLESegmentTextSticker;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class KeyframePropertiesFormatter {
    public static final KeyframePropertiesFormatter INSTANCE = new KeyframePropertiesFormatter();

    public final String format(NLESegment nLESegment, NLETrackSlot nLETrackSlot, String str, Gson gson, NLEMatrix nLEMatrix) {
        NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLESegment);
        if (nLESegmentVideoDynamicCast != null) {
            if (Intrinsics.LJFF(str, "canvas blend")) {
                return GsonProtectorUtils.toJson(gson, new VideoProperty(nLESegmentVideoDynamicCast, nLETrackSlot, nLEMatrix));
            }
            if (Intrinsics.LJFF(str, "audio volume filter")) {
                return GsonProtectorUtils.toJson(gson, new VideoVolumeProperty(nLESegmentVideoDynamicCast, nLETrackSlot, nLEMatrix));
            }
        }
        NLESegmentAudio nLESegmentAudioDynamicCast = NLESegmentAudio.dynamicCast(nLESegment);
        if (nLESegmentAudioDynamicCast != null && Intrinsics.LJFF(str, "audio volume filter")) {
            return GsonProtectorUtils.toJson(gson, new VideoVolumeProperty(nLESegmentAudioDynamicCast, nLETrackSlot, nLEMatrix));
        }
        NLESegmentSticker nLESegmentStickerDynamicCast = NLESegmentSticker.dynamicCast(nLESegment);
        if (nLESegmentStickerDynamicCast != null) {
            if (Intrinsics.LJFF(str, "sticker_text")) {
                NLESegmentTextSticker nLESegmentTextStickerDynamicCast = NLESegmentTextSticker.dynamicCast((NLENode) nLESegment);
                if (nLESegmentTextStickerDynamicCast != null) {
                    return GsonProtectorUtils.toJson(gson, new TextProperty(nLESegmentTextStickerDynamicCast, nLETrackSlot, nLEMatrix));
                }
            } else {
                return GsonProtectorUtils.toJson(gson, new StickerProperty(nLESegmentStickerDynamicCast, nLETrackSlot, nLEMatrix));
            }
        }
        NLESegmentFilter nLESegmentFilterDynamicCast = NLESegmentFilter.dynamicCast(nLESegment);
        if (nLESegmentFilterDynamicCast != null) {
            return GsonProtectorUtils.toJson(gson, new IntensityProperty(nLESegmentFilterDynamicCast, nLETrackSlot, nLEMatrix));
        }
        NLESegmentMask nLESegmentMaskDynamicCast = NLESegmentMask.dynamicCast(nLESegment);
        if (nLESegmentMaskDynamicCast != null) {
            return GsonProtectorUtils.toJson(gson, new MaskProperty(nLESegmentMaskDynamicCast, nLETrackSlot, nLEMatrix));
        }
        NLESegmentChromaChannel nLESegmentChromaChannelDynamicCast = NLESegmentChromaChannel.dynamicCast(nLESegment);
        if (nLESegmentChromaChannelDynamicCast != null) {
            return GsonProtectorUtils.toJson(gson, new ChromaProperty(nLESegmentChromaChannelDynamicCast, nLETrackSlot, nLEMatrix));
        }
        return "";
    }
}
