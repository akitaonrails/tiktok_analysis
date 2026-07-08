package com.ss.android.ugc.aweme.tako.ccl.model.api;

import X.C09CS;
import X.C09CT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.tako.ccl.utils.JsonArrayOrStringDeserializer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class MessageExt {

    @C09CT("active_action_bar")
    public int activeActionBar;

    @C09CT("active_ai_image_sub_bar")
    public int activeAiImageSubBar;

    @C09CT("aigc_type")
    public final Integer activeTemplateType;

    @C09CT("aigc_std_ratio")
    public Integer aigcStandardRatio;

    @C09CT("force_up_screen")
    public final int forceUpScreen;

    @C09CT("post_hashtag")
    public final String hashTags;

    @C09CT("image_shortcut_key")
    public String imageShortcutKey;

    @C09CT("image_style_name")
    public String imageStyleName;

    @C09CT("image_tab_id")
    public String imageTabId;

    @C09CT("image_template_id")
    public String imageTemplateId;

    @C09CT("image_template_info")
    @C09CS(JsonArrayOrStringDeserializer.class)
    public String imageTemplateInfo;

    @C09CT("image_template_tab")
    public String imageTemplateTab;

    @C09CT("input_skill_mode")
    public String inputSkillMode;

    @C09CT("is_unchanged_tako_template")
    public boolean isUnchangedTakoTemplate;

    @C09CT("template_info")
    @C09CS(JsonArrayOrStringDeserializer.class)
    public String legacyTemplateInfo;

    @C09CT("log")
    public final long log;

    @C09CT("mode_source")
    public String modeSource;

    public MessageExt() {
        this(0L, 0, 0, "", "", "", "", "", null, null, "", 0, null, "", false, "", "");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessageExt)) {
            return false;
        }
        MessageExt messageExt = (MessageExt) obj;
        return this.log == messageExt.log && this.activeActionBar == messageExt.activeActionBar && this.activeAiImageSubBar == messageExt.activeAiImageSubBar && Intrinsics.LJFF(this.imageShortcutKey, messageExt.imageShortcutKey) && Intrinsics.LJFF(this.modeSource, messageExt.modeSource) && Intrinsics.LJFF(this.imageTemplateId, messageExt.imageTemplateId) && Intrinsics.LJFF(this.imageTabId, messageExt.imageTabId) && Intrinsics.LJFF(this.imageTemplateTab, messageExt.imageTemplateTab) && Intrinsics.LJFF(this.aigcStandardRatio, messageExt.aigcStandardRatio) && Intrinsics.LJFF(this.inputSkillMode, messageExt.inputSkillMode) && Intrinsics.LJFF(this.imageStyleName, messageExt.imageStyleName) && this.forceUpScreen == messageExt.forceUpScreen && Intrinsics.LJFF(this.activeTemplateType, messageExt.activeTemplateType) && Intrinsics.LJFF(this.hashTags, messageExt.hashTags) && this.isUnchangedTakoTemplate == messageExt.isUnchangedTakoTemplate && Intrinsics.LJFF(this.imageTemplateInfo, messageExt.imageTemplateInfo) && Intrinsics.LJFF(this.legacyTemplateInfo, messageExt.legacyTemplateInfo);
    }

    public final int hashCode() {
        int iY2 = ((((((((((((((C786410Ut5.Y2(this.log) * 31) + this.activeActionBar) * 31) + this.activeAiImageSubBar) * 31) + this.imageShortcutKey.hashCode()) * 31) + this.modeSource.hashCode()) * 31) + this.imageTemplateId.hashCode()) * 31) + this.imageTabId.hashCode()) * 31) + this.imageTemplateTab.hashCode()) * 31;
        Integer num = this.aigcStandardRatio;
        int iHashCode = (iY2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.inputSkillMode;
        int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.imageStyleName.hashCode()) * 31) + this.forceUpScreen) * 31;
        Integer num2 = this.activeTemplateType;
        return ((((((((iHashCode2 + (num2 != null ? num2.hashCode() : 0)) * 31) + this.hashTags.hashCode()) * 31) + C786410Ut5.Z2(this.isUnchangedTakoTemplate)) * 31) + this.imageTemplateInfo.hashCode()) * 31) + this.legacyTemplateInfo.hashCode();
    }

    public final String toString() {
        return "MessageExt(log=" + this.log + ", activeActionBar=" + this.activeActionBar + ", activeAiImageSubBar=" + this.activeAiImageSubBar + ", imageShortcutKey=" + this.imageShortcutKey + ", modeSource=" + this.modeSource + ", imageTemplateId=" + this.imageTemplateId + ", imageTabId=" + this.imageTabId + ", imageTemplateTab=" + this.imageTemplateTab + ", aigcStandardRatio=" + this.aigcStandardRatio + ", inputSkillMode=" + this.inputSkillMode + ", imageStyleName=" + this.imageStyleName + ", forceUpScreen=" + this.forceUpScreen + ", activeTemplateType=" + this.activeTemplateType + ", hashTags=" + this.hashTags + ", isUnchangedTakoTemplate=" + this.isUnchangedTakoTemplate + ", imageTemplateInfo=" + this.imageTemplateInfo + ", legacyTemplateInfo=" + this.legacyTemplateInfo + ')';
    }

    public MessageExt(long j, int i, int i2, String str, String str2, String str3, String str4, String str5, Integer num, String str6, String str7, int i3, Integer num2, String str8, boolean z, String str9, String str10) {
        this.log = j;
        this.activeActionBar = i;
        this.activeAiImageSubBar = i2;
        this.imageShortcutKey = str;
        this.modeSource = str2;
        this.imageTemplateId = str3;
        this.imageTabId = str4;
        this.imageTemplateTab = str5;
        this.aigcStandardRatio = num;
        this.inputSkillMode = str6;
        this.imageStyleName = str7;
        this.forceUpScreen = i3;
        this.activeTemplateType = num2;
        this.hashTags = str8;
        this.isUnchangedTakoTemplate = z;
        this.imageTemplateInfo = str9;
        this.legacyTemplateInfo = str10;
    }
}
