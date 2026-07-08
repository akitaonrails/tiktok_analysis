package com.ss.android.ugc.aweme;

import X.C09CT;
import X.C13BV;
import X.C19EG;
import X.C2188811AlT;
import X.EnumC1237860iJk;
import X.InterfaceC1237760iJa;
import android.app.Activity;
import android.content.Context;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public interface IForceBindingAccountService {

    public static final class FrequencyConfigCache {

        @C09CT("last_show_time")
        public final long lastShowTime;

        @C09CT("show_count")
        public final int showCount;

        public FrequencyConfigCache() {
            this(-1L, 0);
        }

        public FrequencyConfigCache(long j, int i) {
            this.lastShowTime = j;
            this.showCount = i;
        }
    }

    /* JADX INFO: loaded from: classes10.dex */
    public static final class FrequencyGroup {

        @C09CT(FollowStatusChangeMethod.PARAM_UID)
        public final String id;

        @C09CT("interval")
        public final int interval;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FrequencyGroup)) {
                return false;
            }
            FrequencyGroup frequencyGroup = (FrequencyGroup) obj;
            return Intrinsics.LJFF(this.id, frequencyGroup.id) && this.interval == frequencyGroup.interval;
        }

        public final int hashCode() {
            return (this.id.hashCode() * 31) + this.interval;
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("FrequencyGroup(id=");
            sbLIZ.append(this.id);
            sbLIZ.append(", interval=");
            sbLIZ.append(this.interval);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public FrequencyGroup() {
            this("", Integer.MAX_VALUE);
        }

        public FrequencyGroup(String str, int i) {
            this.id = str;
            this.interval = i;
        }
    }

    public static final class NextPrompt implements Serializable {

        @C09CT("conflict_email_binding_3p_outage_mitigation")
        public final PromptDetail conflictEmailBinding3pOutageMitigation;

        @C09CT("deprecate_facebook_no_verified_1p_add_email_in_sheet")
        public final PromptDetail deprecateFacebookNoVerified1pAddEmailInSheet;

        @C09CT("email_binding_3p_outage_mitigation")
        public final PromptDetail emailBinding3pOutageMitigation;

        public NextPrompt() {
            this(new PromptDetail("", "", false), new PromptDetail("", "", false), new PromptDetail("", "", false));
        }

        public NextPrompt(PromptDetail promptDetail, PromptDetail promptDetail2, PromptDetail promptDetail3) {
            this.emailBinding3pOutageMitigation = promptDetail;
            this.conflictEmailBinding3pOutageMitigation = promptDetail2;
            this.deprecateFacebookNoVerified1pAddEmailInSheet = promptDetail3;
        }
    }

    public static final class PromptDetail implements Serializable {

        @C09CT("description_string")
        public final String descriptionString;

        @C09CT("show_learn_more")
        public final boolean shouldShowLearnMore;

        @C09CT("title_string")
        public final String titleString;

        public PromptDetail() {
            this("", "", false);
        }

        public PromptDetail(String str, String str2, boolean z) {
            this.titleString = str;
            this.descriptionString = str2;
            this.shouldShowLearnMore = z;
        }
    }

    void clearCurrentCacheConfig();

    BindPromptConfig getCacheOrDefaultConfig(Context context);

    EnumC1237860iJk getCurrentLoginUser3pPlatform();

    boolean hasBindPhoneNumber();

    boolean isCurrentLoginUser3pPlatformDisable();

    boolean isEmailForceBinded();

    boolean isFBDeprecationTransitionExpired();

    void setIsEmailForceBinded(boolean z);

    boolean shouldShow3PDialog(C19EG c19eg, String str, String str2, BindPromptConfig bindPromptConfig, boolean z);

    void showDialog(Activity activity, BindPromptConfig bindPromptConfig, String str, String str2, Integer num, Function0<Unit> function0, InterfaceC1237760iJa interfaceC1237760iJa);

    void showDialogAsColdStartPopupTask(C19EG c19eg, BindPromptConfig bindPromptConfig);

    void showDialogAsPopupTask(C19EG c19eg, String str, String str2, BindPromptConfig bindPromptConfig);

    void updateFrequencyGroupCacheAfterShow(String str);

    public static final class FrequencyControl {

        @C09CT("interval")
        public final int interval;

        @C09CT("max_count")
        public final int maxCount;

        public FrequencyControl() {
            this(Integer.MAX_VALUE, Integer.MAX_VALUE);
        }

        public FrequencyControl(int i, int i2) {
            this.interval = i;
            this.maxCount = i2;
        }
    }

    public static final class TextFieldData {

        @C09CT("keyboard_auto_raise")
        public final boolean keyBoardAutoRaise;

        @C09CT("type")
        public final String type;

        public TextFieldData(String str, boolean z) {
            this.type = str;
            this.keyBoardAutoRaise = z;
        }
    }

    public static final class BindPromptButtonConfig {

        @C09CT("action_type")
        public final String actionType;

        @C09CT("btn_string")
        public final String btnString;

        @C09CT("deeplink_url")
        public final String deeplinkUrl;

        @C09CT("style_type")
        public final String styleType;

        @C09CT("text_type")
        public final String textType;

        public BindPromptButtonConfig() {
            this("", "", "", "", null);
        }

        public BindPromptButtonConfig(String str, String str2, String str3, String str4, String str5) {
            this.btnString = str;
            this.actionType = str2;
            this.styleType = str3;
            this.textType = str4;
            this.deeplinkUrl = str5;
        }
    }

    public static final class BindPromptConfig {

        @C09CT("buttons")
        public final List<BindPromptButtonConfig> buttons;

        @C09CT("description_string")
        public final String descriptionString;

        @C09CT("disclaimer_type")
        public final int disclaimerType;

        @C09CT("freq_control_max_count_behavior")
        public final String freqControlMaxCountBehavior;

        @C09CT("frequency_control")
        public final FrequencyControl frequencyControl;

        @C09CT("frequency_group")
        public final FrequencyGroup frequencyGroup;

        @C09CT("group_id")
        public final int groupId;

        @C09CT("is_skippable")
        public final boolean isSkippable;

        @C09CT("masked_account")
        public final String maskedAccount;

        @C09CT("next_prompt")
        public final NextPrompt nextPrompt;

        @C09CT("non1p_binding_type")
        public final Integer non1PBindingType;

        @C09CT("pages")
        public final List<String> pages;

        @C09CT("project_id")
        public final Integer projectId;

        @C09CT("project_tag")
        public final String projectTag;

        @C09CT("show_learn_more")
        public final boolean shouldShowLearnMore;

        @C09CT("show_close_button")
        public final boolean showCloseBtn;

        @C09CT("style")
        public final String style;

        @C09CT("text_fields")
        public final List<TextFieldData> textFields;

        @C09CT("title_string")
        public final String titleString;

        public BindPromptConfig() {
            this(0, null, null, null, null, null, null, false, null, null, null, null, false, 0, null, null, false, null, null, 524287, null);
        }

        public BindPromptConfig(int i, Integer num, FrequencyGroup frequencyGroup, String str, String str2, List<TextFieldData> list, List<BindPromptButtonConfig> list2, boolean z, FrequencyControl frequencyControl, List<String> list3, String str3, Integer num2, boolean z2, int i2, String str4, String str5, boolean z3, NextPrompt nextPrompt, String str6) {
            this.groupId = i;
            this.projectId = num;
            this.frequencyGroup = frequencyGroup;
            this.titleString = str;
            this.descriptionString = str2;
            this.textFields = list;
            this.buttons = list2;
            this.isSkippable = z;
            this.frequencyControl = frequencyControl;
            this.pages = list3;
            this.maskedAccount = str3;
            this.non1PBindingType = num2;
            this.showCloseBtn = z2;
            this.disclaimerType = i2;
            this.style = str4;
            this.freqControlMaxCountBehavior = str5;
            this.shouldShowLearnMore = z3;
            this.nextPrompt = nextPrompt;
            this.projectTag = str6;
        }

        public BindPromptConfig(int i, Integer num, FrequencyGroup frequencyGroup, String str, String str2, List list, List list2, boolean z, FrequencyControl frequencyControl, List list3, String str3, Integer num2, boolean z2, int i2, String str4, String str5, boolean z3, NextPrompt nextPrompt, String str6, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? -1 : i, (i3 & 2) != 0 ? null : num, (i3 & 4) != 0 ? null : frequencyGroup, (i3 & 8) != 0 ? "" : str, (i3 & 16) != 0 ? "" : str2, (i3 & 32) != 0 ? null : list, (i3 & 64) != 0 ? C13BV.INSTANCE : list2, (i3 & 128) != 0 ? true : z, (i3 & 256) != 0 ? null : frequencyControl, (i3 & 512) != 0 ? null : list3, (i3 & 1024) != 0 ? null : str3, (i3 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : num2, (i3 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? false : z2, (i3 & 8192) != 0 ? 1 : i2, (i3 & 16384) != 0 ? "dialog" : str4, (32768 & i3) != 0 ? null : str5, (65536 & i3) == 0 ? z3 : false, (131072 & i3) != 0 ? new NextPrompt(new PromptDetail("", "", false), new PromptDetail("", "", false), new PromptDetail("", "", false)) : nextPrompt, (i3 & 262144) == 0 ? str6 : "");
        }
    }
}
