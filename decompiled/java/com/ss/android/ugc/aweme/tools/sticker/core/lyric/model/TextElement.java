package com.ss.android.ugc.aweme.tools.sticker.core.lyric.model;

import X.C09CT;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.AtomAnimation;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.StickerAnimation;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TimeRange;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TransformAnchor;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class TextElement {

    @C09CT("anchor")
    public final TransformAnchor anchor;

    @C09CT("animation")
    public final StickerAnimation animation;

    @C09CT("atomAnimations")
    public final List<AtomAnimation> atomAnimations;

    @C09CT("fallbackFontPathList")
    public final List<String> fallbackFontPathList;

    @C09CT("keyframes")
    public final List<Keyframe> keyframes;

    @C09CT("richcontent")
    public final String richContent;

    @C09CT("rotation")
    public final Float rotation;

    @C09CT("scale_xy")
    public final ScaleXYElement scaleXy;

    @C09CT("subtitles")
    public final List<Subtitle> subtitles;

    @C09CT("timerange")
    public final TimeRange timerange;

    @C09CT("transform")
    public final TransformElement transform;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextElement)) {
            return false;
        }
        TextElement textElement = (TextElement) obj;
        return Intrinsics.LJFF(this.transform, textElement.transform) && Intrinsics.LJFF(this.scaleXy, textElement.scaleXy) && Intrinsics.LJFF(this.rotation, textElement.rotation) && Intrinsics.LJFF(this.timerange, textElement.timerange) && Intrinsics.LJFF(this.richContent, textElement.richContent) && Intrinsics.LJFF(this.subtitles, textElement.subtitles) && Intrinsics.LJFF(this.anchor, textElement.anchor) && Intrinsics.LJFF(this.animation, textElement.animation) && Intrinsics.LJFF(this.atomAnimations, textElement.atomAnimations) && Intrinsics.LJFF(this.fallbackFontPathList, textElement.fallbackFontPathList) && Intrinsics.LJFF(this.keyframes, textElement.keyframes);
    }

    public final int hashCode() {
        TransformElement transformElement = this.transform;
        int iHashCode = (transformElement == null ? 0 : transformElement.hashCode()) * 31;
        ScaleXYElement scaleXYElement = this.scaleXy;
        int iHashCode2 = (iHashCode + (scaleXYElement == null ? 0 : scaleXYElement.hashCode())) * 31;
        Float f = this.rotation;
        int iHashCode3 = (iHashCode2 + (f == null ? 0 : f.hashCode())) * 31;
        TimeRange timeRange = this.timerange;
        int iHashCode4 = (iHashCode3 + (timeRange == null ? 0 : timeRange.hashCode())) * 31;
        String str = this.richContent;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        List<Subtitle> list = this.subtitles;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        TransformAnchor transformAnchor = this.anchor;
        int iHashCode7 = (iHashCode6 + (transformAnchor == null ? 0 : transformAnchor.hashCode())) * 31;
        StickerAnimation stickerAnimation = this.animation;
        int iHashCode8 = (iHashCode7 + (stickerAnimation == null ? 0 : stickerAnimation.hashCode())) * 31;
        List<AtomAnimation> list2 = this.atomAnimations;
        int iHashCode9 = (iHashCode8 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<String> list3 = this.fallbackFontPathList;
        int iHashCode10 = (iHashCode9 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<Keyframe> list4 = this.keyframes;
        return iHashCode10 + (list4 != null ? list4.hashCode() : 0);
    }

    public final String toString() {
        return "TextElement(transform=" + this.transform + ", scaleXy=" + this.scaleXy + ", rotation=" + this.rotation + ", timerange=" + this.timerange + ", richContent=" + this.richContent + ", subtitles=" + this.subtitles + ", anchor=" + this.anchor + ", animation=" + this.animation + ", atomAnimations=" + this.atomAnimations + ", fallbackFontPathList=" + this.fallbackFontPathList + ", keyframes=" + this.keyframes + ')';
    }

    public TextElement(TransformElement transformElement, ScaleXYElement scaleXYElement, Float f, TimeRange timeRange, String str, List<Subtitle> list, TransformAnchor transformAnchor, StickerAnimation stickerAnimation, List<AtomAnimation> list2, List<String> list3, List<Keyframe> list4) {
        this.transform = transformElement;
        this.scaleXy = scaleXYElement;
        this.rotation = f;
        this.timerange = timeRange;
        this.richContent = str;
        this.subtitles = list;
        this.anchor = transformAnchor;
        this.animation = stickerAnimation;
        this.atomAnimations = list2;
        this.fallbackFontPathList = list3;
        this.keyframes = list4;
    }
}
