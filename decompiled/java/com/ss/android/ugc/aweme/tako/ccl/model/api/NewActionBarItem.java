package com.ss.android.ugc.aweme.tako.ccl.model.api;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public final class NewActionBarItem {

    @C09CT("sug")
    public final TakoSug actionSug;

    @C09CT("ai_image")
    public final NewActionAIImageItem aiImage;

    @C09CT("dark_mode_icon")
    public final String darkIcon;

    @C09CT("display_flag")
    public final Long displayFlag;

    @C09CT("homework_conf")
    public final NewActionBarHomeworkItem homeworkItem;

    @C09CT("icon_height")
    public final Integer iconHeight;

    @C09CT("icon_width")
    public final Integer iconWidth;

    @C09CT("place_holder")
    public final String inputHint;

    @C09CT("light_mode_icon")
    public final String lightIcon;

    @C09CT("message_to_send")
    public final String messageToSend;

    @C09CT("name_text")
    public final String name;

    @C09CT("skill_default_prompt")
    public final String skillDefaultPrompt;

    @C09CT("skill_description")
    public final String skillDescription;

    @C09CT("skill_descriptions")
    public final List<String> skillDescriptions;

    @C09CT("skill_name_text")
    public final String skillNameText;

    @C09CT("standard_ratio")
    public final List<TakoStandardRatio> standardRatio;

    @C09CT("sub_skills")
    public final List<Integer> subSkills;

    @C09CT("unique_type")
    public final int type;

    public NewActionBarItem() {
        this(-1, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public NewActionBarItem(int i, String str, String str2, String str3, Long l, String str4, Integer num, Integer num2, NewActionBarHomeworkItem newActionBarHomeworkItem, NewActionAIImageItem newActionAIImageItem, TakoSug takoSug, String str5, List<TakoStandardRatio> list, List<Integer> list2, String str6, String str7, String str8, List<String> list3) {
        this.type = i;
        this.lightIcon = str;
        this.darkIcon = str2;
        this.name = str3;
        this.displayFlag = l;
        this.inputHint = str4;
        this.iconWidth = num;
        this.iconHeight = num2;
        this.homeworkItem = newActionBarHomeworkItem;
        this.aiImage = newActionAIImageItem;
        this.actionSug = takoSug;
        this.messageToSend = str5;
        this.standardRatio = list;
        this.subSkills = list2;
        this.skillNameText = str6;
        this.skillDescription = str7;
        this.skillDefaultPrompt = str8;
        this.skillDescriptions = list3;
    }
}
