package com.ss.android.ugc.aweme.audiomode.vopclone.experiment;

import X.C09CT;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes30.dex */
public final class InstantCloneTextConfig {

    @C09CT("audition_text_chinese")
    public final String auditionChinese;

    @C09CT("audition_default_language")
    public final String auditionDefaultLanguage;

    @C09CT("audition_text_english")
    public final String auditionEnglish;

    @C09CT("audition_text_indonesian")
    public final String auditionIndonesian;

    @C09CT("audition_text_japanese")
    public final String auditionJpanese;

    @C09CT("audition_text_portuguese")
    public final String auditionPortuguese;

    @C09CT("audition_text_spanish")
    public final String auditionSpanish;

    @C09CT("consumption_jump_creation_default_text")
    public final String creationDefaultText;

    @C09CT("cut_off_length")
    public final float cutOffLength;

    @C09CT("enable_clone_stream_tts")
    public final int enableStreamTTS;

    @C09CT("agreement_intro_v2")
    public final int isAgreementIntroV2;

    @C09CT("snr_threshold")
    public final float snrThreshold;

    @C09CT("audition_support_language")
    public final ArrayList<String> supportLanguageList;

    @C09CT("vop_server_url")
    public final String vopServerUrl;

    public InstantCloneTextConfig() {
        this(new ArrayList(), "", "", "", "", "", "", "", "", 0.3f, 5.0f, "https://sami.tiktokv.com/internal", 0, 0);
    }

    public InstantCloneTextConfig(ArrayList<String> arrayList, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, float f, float f2, String str9, int i, int i2) {
        this.supportLanguageList = arrayList;
        this.auditionDefaultLanguage = str;
        this.creationDefaultText = str2;
        this.auditionChinese = str3;
        this.auditionEnglish = str4;
        this.auditionJpanese = str5;
        this.auditionSpanish = str6;
        this.auditionPortuguese = str7;
        this.auditionIndonesian = str8;
        this.cutOffLength = f;
        this.snrThreshold = f2;
        this.vopServerUrl = str9;
        this.enableStreamTTS = i;
        this.isAgreementIntroV2 = i2;
    }
}
