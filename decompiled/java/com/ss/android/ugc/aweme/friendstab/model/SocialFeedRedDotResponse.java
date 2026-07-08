package com.ss.android.ugc.aweme.friendstab.model;

import X.C09CT;
import X.C1586660rOK;
import com.ss.android.ugc.aweme.friendstab.model.UserNewContent;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes25.dex */
public abstract class SocialFeedRedDotResponse<T extends UserNewContent> {
    public static final C1586660rOK Companion = new Object() { // from class: X.0rOK
    };

    @C09CT("new_content_count")
    public int redDotCount;
    public int source;

    @C09CT("status_code")
    public final int statusCode;

    @C09CT("status_msg")
    public final String statusMessage = "";

    @C09CT("new_content_gids")
    public ArrayList<String> redDotList = new ArrayList<>();

    public abstract ArrayList<T> getAvatarList();

    public final boolean checkResponseValid() {
        return this.statusCode == 0;
    }

    public final List<T> getDistinctAvatarList() {
        ArrayList<T> avatarList = getAvatarList();
        if (avatarList == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (T t : avatarList) {
            FriendsRedDotUser user = t.getUser();
            if (hashSet.add(user != null ? user.uid : null)) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    public final int getRedDotCount() {
        return this.redDotCount;
    }

    public final ArrayList<String> getRedDotList() {
        return this.redDotList;
    }

    public final int getSource() {
        return this.source;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusMessage() {
        return this.statusMessage;
    }

    public final void setRedDotCount(int i) {
        this.redDotCount = i;
    }

    public final void setRedDotList(ArrayList<String> arrayList) {
        this.redDotList = arrayList;
    }

    public final void setSource(int i) {
        this.source = i;
    }
}
