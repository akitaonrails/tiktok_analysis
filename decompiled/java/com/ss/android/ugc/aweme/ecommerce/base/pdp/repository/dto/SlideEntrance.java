package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;

/* JADX INFO: loaded from: classes27.dex */
public final class SlideEntrance {

    @C09CT("btm_code")
    public final String btmCode;

    @C09CT("da_info")
    public final String daInfo;

    @C09CT("display_text")
    public final ECRichText displayText;

    @C09CT("jump_schema")
    public final String jumpSchema;

    @C09CT("jump_schema_track_params")
    public final String jumpSchemaTrackParams;

    @C09CT("show_entry")
    public final Boolean showEntry;

    @C09CT("triggered_event_variants")
    public final TriggeredEventVariants triggeredEventVariants;

    public SlideEntrance(ECRichText eCRichText, String str, String str2, Boolean bool, String str3, TriggeredEventVariants triggeredEventVariants, String str4) {
        this.displayText = eCRichText;
        this.jumpSchema = str;
        this.btmCode = str2;
        this.showEntry = bool;
        this.daInfo = str3;
        this.triggeredEventVariants = triggeredEventVariants;
        this.jumpSchemaTrackParams = str4;
    }
}
