package com.ss.android.ugc.aweme.aigc.asynctask;

import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class Source {

    @C09CT("AIGC_OFFLINE_PROCESSING")
    public static final Source AIGC_OFFLINE_PROCESSING;

    @C09CT("AI_PORTRAIT")
    public static final Source AI_PORTRAIT;

    @C09CT("AI_REMIX")
    public static final Source AI_REMIX;

    @C09CT("AI_THEATER")
    public static final Source AI_THEATER;

    @C09CT("AI_THEATER_CAMEO_RECORD")
    public static final Source AI_THEATER_CAMEO_RECORD;

    @C09CT("ame")
    public static final Source AME;

    @C09CT("auto_cut_agent")
    public static final Source AUTO_CUT_AGENT;

    @C09CT("editor_pro")
    public static final Source EDITOR_PRO;

    @C09CT("EDITOR_PRO_AIGC_T2I")
    public static final Source EDITOR_PRO_AIGC_T2I;

    @C09CT("EDITOR_PRO_AIGC_T2V")
    public static final Source EDITOR_PRO_AIGC_T2V;

    @C09CT("EDIT_AI_LIVE_PHOTO")
    public static final Source EDIT_AI_LIVE_PHOTO;

    @C09CT("EDIT_AI_PLAYGROUND")
    public static final Source EDIT_AI_PLAYGROUND;

    @C09CT("EFFECT_AIGC")
    public static final Source EFFECT_AIGC;
    public static final /* synthetic */ Source[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;

    @C09CT("SHOOTING_I2V")
    public static final Source SHOOTING_I2V;

    @C09CT("template")
    public static final Source TEMPLATE;

    @C09CT("text_to_image")
    public static final Source TEXT_TO_IMAGE;
    public final String LL;

    public static InterfaceC2044707zh<Source> getEntries() {
        return LLILLL;
    }

    static {
        Source source = new Source("TEXT_TO_IMAGE", 0, "text_to_image");
        TEXT_TO_IMAGE = source;
        Source source2 = new Source("EDITOR_PRO", 1, "editor_pro");
        EDITOR_PRO = source2;
        Source source3 = new Source("AUTO_CUT_AGENT", 2, "auto_cut_agent");
        AUTO_CUT_AGENT = source3;
        Source source4 = new Source("TEMPLATE", 3, "template");
        TEMPLATE = source4;
        Source source5 = new Source("EDITOR_PRO_AIGC_T2I", 4, "EDITOR_PRO_AIGC_T2I");
        EDITOR_PRO_AIGC_T2I = source5;
        Source source6 = new Source("EDITOR_PRO_AIGC_T2V", 5, "EDITOR_PRO_AIGC_T2V");
        EDITOR_PRO_AIGC_T2V = source6;
        Source source7 = new Source("EDIT_AI_PLAYGROUND", 6, "edit_ai_playground");
        EDIT_AI_PLAYGROUND = source7;
        Source source8 = new Source("EDIT_AI_LIVE_PHOTO", 7, "edit_ai_live_photo");
        EDIT_AI_LIVE_PHOTO = source8;
        Source source9 = new Source("SHOOTING_I2V", 8, "shooting_i2v");
        SHOOTING_I2V = source9;
        Source source10 = new Source("EFFECT_AIGC", 9, "effect_aigc");
        EFFECT_AIGC = source10;
        Source source11 = new Source("AME", 10, "ame");
        AME = source11;
        Source source12 = new Source("AIGC_OFFLINE_PROCESSING", 11, "aigc_offline_processing");
        AIGC_OFFLINE_PROCESSING = source12;
        Source source13 = new Source("AI_THEATER", 12, "ai_theater");
        AI_THEATER = source13;
        Source source14 = new Source("AI_REMIX", 13, "ai_remix");
        AI_REMIX = source14;
        Source source15 = new Source("AI_THEATER_CAMEO_RECORD", 14, "ai_theater_cameo_record");
        AI_THEATER_CAMEO_RECORD = source15;
        Source source16 = new Source("AI_PORTRAIT", 15, "ai_portrait");
        AI_PORTRAIT = source16;
        Source[] sourceArr = {source, source2, source3, source4, source5, source6, source7, source8, source9, source10, source11, source12, source13, source14, source15, source16};
        LLILLJJLI = sourceArr;
        LLILLL = new C2254308sP(sourceArr);
    }

    public static Source[] values() {
        return (Source[]) LLILLJJLI.clone();
    }

    public final String getSource() {
        return this.LL;
    }

    public static Source valueOf(String str) {
        return (Source) C08FF.LIZ(Source.class, str);
    }

    public Source(String str, int i, String str2) {
        this.LL = str2;
    }
}
