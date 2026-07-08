package com.ss.android.ugc.aweme.im.message.content;

import X.C09CT;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes3.dex */
public class SystemContent extends BaseContent {
    public static final Companion Companion = new Companion();
    public static final Regex REGEX = new Regex("\\{\\{(.*?)\\}\\}");

    @C09CT("animation_info")
    public AnimationInfo animationInfo;

    @C09CT("event_extra")
    public Map<String, String> eventExtra;

    @C09CT("fallback_tips")
    public String fallbackTips;

    @C09CT("group_tips")
    public String groupNoticeTips;

    @C09CT("android_filter_max_version")
    public String maxVersion;

    @C09CT("android_filter_min_version")
    public String minVersion;

    @C09CT("msg_dismiss_conditions")
    public List<? extends Map<String, String>> msgDismissConditions;

    @C09CT("new_template")
    public Key[] newTemplate;

    @C09CT("new_tips")
    public String newTips;

    @C09CT("scene_tips")
    public Map<String, String> sceneTips;

    @C09CT("strong_template")
    public Key[] strongTemplate;

    @C09CT("strong_tips")
    public String strongTips;

    @C09CT("template")
    public Key[] template;

    @C09CT("tips")
    public String tips;

    public static final class Companion {
        public final Regex getREGEX() {
            return SystemContent.REGEX;
        }

        public final boolean isSafeWarningLink(Key key) {
            boolean zEquals = false;
            if (key != null) {
                try {
                    Map<String, String> extra = key.getExtra();
                    if (extra != null) {
                        zEquals = TextUtils.equals(extra.get("link_type"), "safe_warning");
                        return zEquals;
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            return zEquals;
        }
    }

    public static final class Key implements Serializable {

        @C09CT("action")
        public int action;

        @C09CT("action_dismiss_conditions")
        public List<? extends Map<String, String>> actionDismissConditions;

        @C09CT("extra")
        public Map<String, String> extra;

        @C09CT("key")
        public String key;

        @C09CT("link")
        public String link;

        @C09CT("name")
        public String name;

        public final int getAction() {
            return this.action;
        }

        public final List<Map<String, String>> getActionDismissConditions() {
            return this.actionDismissConditions;
        }

        public final Map<String, String> getExtra() {
            return this.extra;
        }

        public final String getKey() {
            return this.key;
        }

        public final String getLink() {
            return this.link;
        }

        public final String getName() {
            return this.name;
        }

        public final void setAction(int i) {
            this.action = i;
        }

        public final void setActionDismissConditions(List<? extends Map<String, String>> list) {
            this.actionDismissConditions = list;
        }

        public final void setExtra(Map<String, String> map) {
            this.extra = map;
        }

        public final void setKey(String str) {
            this.key = str;
        }

        public final void setLink(String str) {
            this.link = str;
        }

        public final void setName(String str) {
            this.name = str;
        }
    }

    public final AnimationInfo getAnimationInfo() {
        return this.animationInfo;
    }

    public final Map<String, String> getEventExtra() {
        return this.eventExtra;
    }

    public final String getFallbackTips() {
        return this.fallbackTips;
    }

    public final String getGroupNoticeTips() {
        return this.groupNoticeTips;
    }

    public final String getMaxVersion() {
        return this.maxVersion;
    }

    public final String getMinVersion() {
        return this.minVersion;
    }

    public final List<Map<String, String>> getMsgDismissConditions() {
        return this.msgDismissConditions;
    }

    public final Key[] getNewTemplate() {
        return this.newTemplate;
    }

    public final String getNewTips() {
        return this.newTips;
    }

    public final Map<String, String> getSceneTips() {
        return this.sceneTips;
    }

    public final Key[] getStrongTemplate() {
        return this.strongTemplate;
    }

    public final String getStrongTips() {
        return this.strongTips;
    }

    public final Key[] getTemplate() {
        return this.template;
    }

    public final String getTips() {
        return this.tips;
    }

    public final void setAnimationInfo(AnimationInfo animationInfo) {
        this.animationInfo = animationInfo;
    }

    public final void setEventExtra(Map<String, String> map) {
        this.eventExtra = map;
    }

    public final void setFallbackTips(String str) {
        this.fallbackTips = str;
    }

    public final void setGroupNoticeTips(String str) {
        this.groupNoticeTips = str;
    }

    public final void setMaxVersion(String str) {
        this.maxVersion = str;
    }

    public final void setMinVersion(String str) {
        this.minVersion = str;
    }

    public final void setMsgDismissConditions(List<? extends Map<String, String>> list) {
        this.msgDismissConditions = list;
    }

    public final void setNewTemplate(Key[] keyArr) {
        this.newTemplate = keyArr;
    }

    public final void setNewTips(String str) {
        this.newTips = str;
    }

    public final void setSceneTips(Map<String, String> map) {
        this.sceneTips = map;
    }

    public final void setStrongTemplate(Key[] keyArr) {
        this.strongTemplate = keyArr;
    }

    public final void setStrongTips(String str) {
        this.strongTips = str;
    }

    public final void setTemplate(Key[] keyArr) {
        this.template = keyArr;
    }

    public final void setTips(String str) {
        this.tips = str;
    }
}
