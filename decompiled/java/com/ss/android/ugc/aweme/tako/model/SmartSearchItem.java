package com.ss.android.ugc.aweme.tako.model;

import X.C09CT;
import java.io.Serializable;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes28.dex */
public final class SmartSearchItem implements Serializable {
    public static final int $stable = 8;

    @C09CT("info_content")
    public final String infoContent;

    @C09CT("info_title")
    public final String infoTitle;

    @C09CT("is_photo")
    public final Integer isPhoto;

    @C09CT("message_type")
    public final String messageType;
    public final transient Function1<Boolean, Unit> onSheetCallback;

    @C09CT("panel_impl_id")
    public final String panelImplId;

    @C09CT("sug_mob_params")
    public final Map<String, String> sugMobParams;

    @C09CT("sug_word_content")
    public final String wordContent;

    @C09CT("sug_words_id")
    public final String wordId;

    @C09CT("sug_impr_id")
    public final String wordImprId;

    public SmartSearchItem() {
        this(null, null, null, null, null, null, null, null, null, null);
    }

    public final Integer isPhoto() {
        return this.isPhoto;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SmartSearchItem(String str, String str2, String str3, String str4, String str5, String str6, Map<String, String> map, Integer num, String str7, Function1<? super Boolean, Unit> function1) {
        this.panelImplId = str;
        this.infoTitle = str2;
        this.infoContent = str3;
        this.wordImprId = str4;
        this.wordId = str5;
        this.wordContent = str6;
        this.sugMobParams = map;
        this.isPhoto = num;
        this.messageType = str7;
        this.onSheetCallback = function1;
    }
}
