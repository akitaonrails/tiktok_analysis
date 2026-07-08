package com.ss.android.ugc.aweme.i18n.abtest;

import X.C09CT;

/* JADX INFO: loaded from: classes11.dex */
public final class JSBAIMigrationSearchSettings {
    public static final JSBAIMigrationSearchModel LIZ = new JSBAIMigrationSearchModel(true, true, true, true, true, true, true, true, true, true, true);

    public static final class JSBAIMigrationSearchModel {

        @C09CT("click_search_card")
        public final boolean click_search_card;

        @C09CT("deleteSearchHistory")
        public final boolean deleteSearchHistory;

        @C09CT("enable")
        public final boolean enable;

        @C09CT("getSearchHistory")
        public final boolean getSearchHistory;

        @C09CT("musicCollectNotice")
        public final boolean musicCollectNotice;

        @C09CT("openAlert")
        public final boolean openAlert;

        @C09CT("openSingleFeedbackSheet")
        public final boolean openSingleFeedbackSheet;

        @C09CT("open_live")
        public final boolean open_live;

        @C09CT("searchEnterLiveFlow")
        public final boolean searchEnterLiveFlow;

        @C09CT("searchLaunchChat")
        public final boolean searchLaunchChat;

        @C09CT("userFollowNotice")
        public final boolean userFollowNotice;

        public JSBAIMigrationSearchModel() {
            this(true, true, true, true, true, true, true, true, true, true, true);
        }

        public JSBAIMigrationSearchModel(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11) {
            this.enable = z;
            this.click_search_card = z2;
            this.deleteSearchHistory = z3;
            this.getSearchHistory = z4;
            this.musicCollectNotice = z5;
            this.openAlert = z6;
            this.open_live = z7;
            this.searchEnterLiveFlow = z8;
            this.searchLaunchChat = z9;
            this.userFollowNotice = z10;
            this.openSingleFeedbackSheet = z11;
        }
    }
}
