package com.bytedance.android.livesdk.chatroom.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class CommentSafetyStatusData {

    @C09CT("safety_list")
    public List<CommentSafetyStatus> safetyList = new ArrayList();

    public static final class CommentSafetyStatus {

        @C09CT("checked")
        public boolean checked;

        @C09CT("key")
        public String key = "";
    }
}
