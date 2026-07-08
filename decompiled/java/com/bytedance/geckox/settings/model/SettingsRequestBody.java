package com.bytedance.geckox.settings.model;

import X.C09CT;
import com.bytedance.geckox.model.Common;
import java.util.Map;

/* JADX INFO: loaded from: classes24.dex */
public class SettingsRequestBody {

    @C09CT("common")
    public Common common;

    @C09CT("custom")
    public Map<String, Map<String, Object>> custom;

    @C09CT("settings")
    public Settings settings;

    public static class Settings {

        @C09CT("env")
        public int env;

        @C09CT("ng_version")
        public int ngVersion;

        @C09CT("version")
        public int version;

        public int getEnv() {
            return this.env;
        }

        public int getVersion() {
            return this.version;
        }

        public Settings(int i, int i2) {
            this.version = i;
            this.env = i2;
        }

        public Settings(int i, int i2, int i3) {
            this.version = i;
            this.env = i2;
            this.ngVersion = i3;
        }
    }

    public Common getCommon() {
        return this.common;
    }

    public Map<String, Map<String, Object>> getCustom() {
        return this.custom;
    }

    public Settings getSettings() {
        return this.settings;
    }

    public void setCommon(Common common) {
        this.common = common;
    }

    public void setCustom(Map<String, Map<String, Object>> map) {
        this.custom = map;
    }

    public void setSettings(Settings settings) {
        this.settings = settings;
    }
}
