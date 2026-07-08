package com.ss.android.ugc.aweme.search.voice.core.config;

import X.C01GW;
import X.C09CT;
import X.C13BV;
import X.C452501pT;
import java.util.List;
import kotlin.jvm.internal.AFwS226S0000000_35;

/* JADX INFO: loaded from: classes36.dex */
public final class VoiceSearchMultiLanguageSettings {
    public static final TiktokVoiceSearchMultiLanguageSettingsModel LIZ = new TiktokVoiceSearchMultiLanguageSettingsModel(C13BV.INSTANCE, "wss://speech.tiktokv.com", "/api/v2/asr", "/api/v1/sauc", "vs_tt_input", "en-US");
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(248));

    /* JADX INFO: loaded from: classes29.dex */
    public static final class Cluster {

        @C09CT("display_full")
        public final String displayFull;

        @C09CT("display_short")
        public final String displayShort;

        @C09CT("region")
        public final List<String> region;

        @C09CT("sauc_language")
        public final String saucLanguage;

        public Cluster(List<String> list, String str, String str2, String str3) {
            this.region = list;
            this.displayFull = str;
            this.displayShort = str2;
            this.saucLanguage = str3;
        }
    }

    public static final class Language {

        @C09CT("clusters")
        public final List<Cluster> clusters;

        /* JADX INFO: renamed from: default, reason: not valid java name */
        @C09CT("default")
        public final String f77default;

        @C09CT("lang")
        public final String lang;

        @C09CT("sauc_language_default")
        public final String saucLanguageDefault;

        public Language(String str, List<Cluster> list, String str2, String str3) {
            this.lang = str;
            this.clusters = list;
            this.f77default = str2;
            this.saucLanguageDefault = str3;
        }
    }

    public static final class TiktokVoiceSearchMultiLanguageSettingsModel {

        @C09CT("address")
        public final String address;

        @C09CT("languages")
        public final List<Language> languages;

        @C09CT("sauc_cluster")
        public final String saucCluster;

        @C09CT("sauc_language_default")
        public final String saucLanguageDefault;

        @C09CT("sauc_uri")
        public final String saucUri;

        @C09CT("uri")
        public final String uri;

        public TiktokVoiceSearchMultiLanguageSettingsModel() {
            this(null, "wss://speech.tiktokv.com", "/api/v2/asr", "/api/v1/sauc", "vs_tt_input", "en-US");
        }

        public TiktokVoiceSearchMultiLanguageSettingsModel(List<Language> list, String str, String str2, String str3, String str4, String str5) {
            this.languages = list;
            this.address = str;
            this.uri = str2;
            this.saucUri = str3;
            this.saucCluster = str4;
            this.saucLanguageDefault = str5;
        }
    }
}
