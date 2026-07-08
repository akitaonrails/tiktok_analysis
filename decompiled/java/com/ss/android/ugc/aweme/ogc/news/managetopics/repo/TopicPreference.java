package com.ss.android.ugc.aweme.ogc.news.managetopics.repo;

import X.C09CT;

/* JADX INFO: loaded from: classes19.dex */
public final class TopicPreference {

    @C09CT("description")
    public String description;

    @C09CT("name")
    public String name;

    @C09CT("strength")
    public Integer strength;

    @C09CT("topic")
    public Integer topic;

    public TopicPreference() {
        this(null, null, "", "");
    }

    public TopicPreference(Integer num, Integer num2, String str, String str2) {
        this.strength = num;
        this.topic = num2;
        this.name = str;
        this.description = str2;
    }
}
