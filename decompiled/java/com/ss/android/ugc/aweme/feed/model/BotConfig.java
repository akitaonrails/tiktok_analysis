package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import X.C15438062q;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class BotConfig implements Serializable {

    @C09CT("aibot_enabled")
    public Boolean aiBotEnable;

    @C09CT("common_data")
    public Object commonData;

    @C09CT("disclaimer_text")
    public String disclaimerText;

    @C09CT("extra")
    public String extra;

    @C09CT("long_hints")
    public List<CommerceAgentHint> longHints;

    @C09CT("long_questions")
    public List<String> longQuestions;

    @C09CT("welcome_wording")
    public String welcomeWording;

    public BotConfig() {
        this(null, null, null, null, Boolean.FALSE, null, null);
    }

    public final List<CommerceAgentHint> getInitialHints() {
        List<String> list;
        List<CommerceAgentHint> list2 = this.longHints;
        boolean z = true;
        if (list2 != null && !list2.isEmpty()) {
            return this.longHints;
        }
        List<String> list3 = this.longQuestions;
        if (list3 != null && !list3.isEmpty()) {
            z = false;
        }
        ArrayList arrayList = null;
        if (!z && (list = this.longQuestions) != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<String> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(new CommerceAgentHint(it2.next(), 0, null));
            }
        }
        return arrayList;
    }

    public final void setAiBotEnable(Boolean bool) {
        this.aiBotEnable = bool;
    }

    public final void setCommonData(Object obj) {
        this.commonData = obj;
    }

    public final void setDisclaimerText(String str) {
        this.disclaimerText = str;
    }

    public final void setExtra(String str) {
        this.extra = str;
    }

    public final void setLongHints(List<CommerceAgentHint> list) {
        this.longHints = list;
    }

    public final void setLongQuestions(List<String> list) {
        this.longQuestions = list;
    }

    public final void setWelcomeWording(String str) {
        this.welcomeWording = str;
    }

    public BotConfig(String str, List<String> list, List<CommerceAgentHint> list2, String str2, Boolean bool, Object obj, String str3) {
        this.extra = str;
        this.longQuestions = list;
        this.longHints = list2;
        this.welcomeWording = str2;
        this.aiBotEnable = bool;
        this.commonData = obj;
        this.disclaimerText = str3;
    }
}
