package com.ss.android.ugc.aweme.tako.router.model;

import X.C09CT;
import X.EnumC1854550yMP;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoInteractGuideData implements Serializable {
    public static final int $stable = 8;

    @C09CT("answer_inner_anchor")
    public AnswerInnerAnchor answerInnerAnchor;

    @C09CT("attached_landing_page")
    public TakoAttachedLandingPage attachedLandingPage;

    @C09CT("auto_open_gallery")
    public boolean autoOpenGallery;

    @C09CT("sug_title_cover")
    public EnterAwemeData enterAwemeData;

    @C09CT("entrance_passthrough_params")
    public Map<String, ? extends Object> entrancePassthroughParams;

    @C09CT("first_round_sug_source")
    public String firstRoundSugSource;

    @C09CT("input_image_urls")
    public List<? extends List<String>> inputImageUrls;

    @C09CT("input_skill_label")
    public EnumC1854550yMP inputSkillLabel;

    @C09CT("input_text_content")
    public String inputTextContent;

    @C09CT("last_message_info")
    public LastMessageInfo lastMessageInfo;

    @C09CT("request_show_keyboard")
    public Boolean requestShowKeyboard;

    @C09CT("template_info")
    public TakoTemplateInfo templateInfo;

    @C09CT("voice_talk_directly")
    public boolean voiceTalkDirectly;

    public TakoInteractGuideData() {
        this(null, null, null, null, null, null, false, null, null, false, null, null, null);
    }

    public String toString() {
        return "TakoInteractGuideData(firstRoundSugSource=" + this.firstRoundSugSource + ", enterAwemeData=" + this.enterAwemeData + ", inputTextContent=" + this.inputTextContent + ", inputImageUrls=" + this.inputImageUrls + ", inputSkillLabel=" + this.inputSkillLabel + ", templateInfo=" + this.templateInfo + ", autoOpenGallery=" + this.autoOpenGallery + ", requestShowKeyboard=" + this.requestShowKeyboard + ", attachedLandingPage=" + this.attachedLandingPage + ", voiceTalkDirectly=" + this.voiceTalkDirectly + ", lastMessageInfo=" + this.lastMessageInfo + ", answerInnerAnchor=" + this.answerInnerAnchor + ", entrancePassthroughParams=" + this.entrancePassthroughParams + ')';
    }

    public final void setAnswerInnerAnchor(AnswerInnerAnchor answerInnerAnchor) {
        this.answerInnerAnchor = answerInnerAnchor;
    }

    public final void setAttachedLandingPage(TakoAttachedLandingPage takoAttachedLandingPage) {
        this.attachedLandingPage = takoAttachedLandingPage;
    }

    public final void setAutoOpenGallery(boolean z) {
        this.autoOpenGallery = z;
    }

    public final void setEnterAwemeData(EnterAwemeData enterAwemeData) {
        this.enterAwemeData = enterAwemeData;
    }

    public final void setEntrancePassthroughParams(Map<String, ? extends Object> map) {
        this.entrancePassthroughParams = map;
    }

    public final void setFirstRoundSugSource(String str) {
        this.firstRoundSugSource = str;
    }

    public final void setInputImageUrls(List<? extends List<String>> list) {
        this.inputImageUrls = list;
    }

    public final void setInputSkillLabel(EnumC1854550yMP enumC1854550yMP) {
        this.inputSkillLabel = enumC1854550yMP;
    }

    public final void setInputTextContent(String str) {
        this.inputTextContent = str;
    }

    public final void setLastMessageInfo(LastMessageInfo lastMessageInfo) {
        this.lastMessageInfo = lastMessageInfo;
    }

    public final void setRequestShowKeyboard(Boolean bool) {
        this.requestShowKeyboard = bool;
    }

    public final void setTemplateInfo(TakoTemplateInfo takoTemplateInfo) {
        this.templateInfo = takoTemplateInfo;
    }

    public final void setVoiceTalkDirectly(boolean z) {
        this.voiceTalkDirectly = z;
    }

    public TakoInteractGuideData(String str, EnterAwemeData enterAwemeData, String str2, List<? extends List<String>> list, EnumC1854550yMP enumC1854550yMP, TakoTemplateInfo takoTemplateInfo, boolean z, Boolean bool, TakoAttachedLandingPage takoAttachedLandingPage, boolean z2, LastMessageInfo lastMessageInfo, AnswerInnerAnchor answerInnerAnchor, Map<String, ? extends Object> map) {
        this.firstRoundSugSource = str;
        this.enterAwemeData = enterAwemeData;
        this.inputTextContent = str2;
        this.inputImageUrls = list;
        this.inputSkillLabel = enumC1854550yMP;
        this.templateInfo = takoTemplateInfo;
        this.autoOpenGallery = z;
        this.requestShowKeyboard = bool;
        this.attachedLandingPage = takoAttachedLandingPage;
        this.voiceTalkDirectly = z2;
        this.lastMessageInfo = lastMessageInfo;
        this.answerInnerAnchor = answerInnerAnchor;
        this.entrancePassthroughParams = map;
    }
}
