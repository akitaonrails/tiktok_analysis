package com.ss.android.ugc.aweme.inbox.bulletin.setting;

import X.C09CT;
import X.C1697810uHb;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinLynxShortLinkListItem {

    @C09CT("enable_custom_short_link_cache")
    public final Boolean enableCustomShortLinkCache;

    @C09CT("bulletin_lynx_short_link_list")
    public final List<String> lynxShortLinkList;

    public BulletinLynxShortLinkListItem() {
        this(C1697810uHb.LJIIJJI("aweme://roma_redirect/?spark_page=social_inbox_bulletin_live_event_card", "aweme://roma_redirect/?spark_page=social_inbox_bulletin_link_card", "aweme://roma_redirect/?spark_page=social_inbox_bulletin_mob_page", "aweme://roma_redirect/?spark_page=social_inbox_bulletin_artist_music_card", "aweme://roma_redirect/?spark_page=social_inbox_bulletin_artist_album_card", "aweme://roma_redirect/?spark_page=bulletin_inspiration_card", "aweme://roma_redirect/?spark_page=social_inbox_bulletin_media_card"), Boolean.TRUE);
    }

    public BulletinLynxShortLinkListItem(List<String> list, Boolean bool) {
        this.lynxShortLinkList = list;
        this.enableCustomShortLinkCache = bool;
    }
}
