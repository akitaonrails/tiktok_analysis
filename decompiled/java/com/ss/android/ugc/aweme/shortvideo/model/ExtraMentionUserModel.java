package com.ss.android.ugc.aweme.shortvideo.model;

import android.text.TextUtils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes9.dex */
public final class ExtraMentionUserModel implements Serializable {
    public static final Companion Companion = new Companion();
    public List<Pair<String, String>> userList = new ArrayList();

    public final List<Pair<String, String>> getUserList() {
        return this.userList;
    }

    public static final class Companion {
        public final ExtraMentionUserModel newInstance(String str, String str2) {
            ExtraMentionUserModel extraMentionUserModel = new ExtraMentionUserModel();
            extraMentionUserModel.addMentionUser(str, str2);
            return extraMentionUserModel;
        }
    }

    public final void addMentionUser(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.userList.add(new Pair<>(str, str2));
        }
    }
}
