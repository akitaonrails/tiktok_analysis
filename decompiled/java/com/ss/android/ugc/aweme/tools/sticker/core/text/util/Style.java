package com.ss.android.ugc.aweme.tools.sticker.core.text.util;

import X.C09CT;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes6.dex */
public final class Style {

    @C09CT("background")
    public Background background;

    @C09CT("bloom")
    public Bloom bloom;

    @C09CT("bold")
    public Boolean bold;

    @C09CT("effectStyle")
    public EffectStyle effectStyle;

    @C09CT("fill")
    public Fill fill;

    @C09CT("font")
    public Font font;

    @C09CT("inner_shadows")
    public List<Shadow> innerShadows;

    @C09CT("italic")
    public Boolean italic;

    @C09CT("range")
    public List<Integer> range;

    @C09CT("select")
    public Boolean select;

    @C09CT("shadows")
    public List<Shadow> shadows;

    @C09CT("size")
    public Float size;

    @C09CT("strokes")
    public List<Stroke> strokes;

    @C09CT("underline")
    public Boolean underline;

    @C09CT("useLetterColor")
    public Boolean useLetterColor;

    @C09CT("version")
    public String version;

    /* JADX WARN: Multi-variable type inference failed */
    public Style() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 65535, 0 == true ? 1 : 0);
    }

    public Style(Background background, Bloom bloom, Boolean bool, EffectStyle effectStyle, Fill fill, Font font, Boolean bool2, List<Integer> list, Boolean bool3, List<Shadow> list2, List<Shadow> list3, Float f, List<Stroke> list4, Boolean bool4, Boolean bool5, String str) {
        this.background = background;
        this.bloom = bloom;
        this.bold = bool;
        this.effectStyle = effectStyle;
        this.fill = fill;
        this.font = font;
        this.italic = bool2;
        this.range = list;
        this.select = bool3;
        this.shadows = list2;
        this.innerShadows = list3;
        this.size = f;
        this.strokes = list4;
        this.underline = bool4;
        this.useLetterColor = bool5;
        this.version = str;
    }

    public /* synthetic */ Style(Background background, Bloom bloom, Boolean bool, EffectStyle effectStyle, Fill fill, Font font, Boolean bool2, List list, Boolean bool3, List list2, List list3, Float f, List list4, Boolean bool4, Boolean bool5, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : background, (i & 2) != 0 ? null : bloom, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : effectStyle, (i & 16) != 0 ? null : fill, (i & 32) != 0 ? null : font, (i & 64) != 0 ? null : bool2, (i & 128) != 0 ? null : list, (i & 256) != 0 ? null : bool3, (i & 512) != 0 ? null : list2, (i & 1024) != 0 ? null : list3, (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : f, (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : list4, (i & 8192) != 0 ? null : bool4, (i & 16384) != 0 ? null : bool5, (i & 32768) != 0 ? null : str);
    }
}
