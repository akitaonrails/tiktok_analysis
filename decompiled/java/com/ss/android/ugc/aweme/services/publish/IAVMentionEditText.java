package com.ss.android.ugc.aweme.services.publish;

/* JADX INFO: loaded from: classes22.dex */
public interface IAVMentionEditText {
    void addHashTag(String str);

    void addMentionUser(int i, String str, String str2, String str3);

    void addNormalHashTag(String str);

    void removeHashTag();

    void removeMentionUser(String str);

    void removeNormalHashTag(String str);
}
