package com.bytedance.android.livesdk.viewer_picks.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class MUpsertGiftPickResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("gift_pick_list")
        public List<GiftPickWithStatus> giftPickList = new ArrayList();

        @C09CT("profile_extra")
        public ProfileExtra profileExtra;

        @C09CT("settings")
        public ViewerPicksUserSettings settings;
    }
}
