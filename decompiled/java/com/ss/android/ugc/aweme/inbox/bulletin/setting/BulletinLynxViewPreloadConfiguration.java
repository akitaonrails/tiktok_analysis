package com.ss.android.ugc.aweme.inbox.bulletin.setting;

import X.C09CT;
import X.C0OU0;
import X.C1697810uHb;
import X.EnumC665490Q8l;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinLynxViewPreloadConfiguration {
    public static final int $stable = 8;

    @C09CT("enable_common_opt")
    public final Integer enableCommonOpt;

    @C09CT("preload_cache_size")
    public final Integer preloadCacheSize;

    @C09CT("preload_card_cache")
    public final List<BulletinLynxCardCacheSizeItem> preloadCardCache;

    @C09CT("preload_method")
    public final Integer preloadMethod;

    @C09CT("preload_search_size")
    public final Integer preloadSearchSize;

    @C09CT("preload_trigger_size")
    public final Integer preloadTriggerSize;

    @C09CT("render_thread_strategy")
    public final Integer renderThreadStrategy;

    public BulletinLynxViewPreloadConfiguration() {
        this(0, Integer.valueOf(EnumC665490Q8l.MOST_ON_TASM.id()), Integer.valueOf(C0OU0.NONE.getId()), 0, 0, 99, C1697810uHb.LJIIJJI(new BulletinLynxCardCacheSizeItem("aweme://roma_redirect/?spark_page=social_inbox_bulletin_live_event_card", 6), new BulletinLynxCardCacheSizeItem("aweme://roma_redirect/?spark_page=social_inbox_bulletin_link_card", 8), new BulletinLynxCardCacheSizeItem("aweme://roma_redirect/?spark_page=social_inbox_bulletin_artist_music_card", 5), new BulletinLynxCardCacheSizeItem("aweme://roma_redirect/?spark_page=social_inbox_bulletin_artist_album_card", 5), new BulletinLynxCardCacheSizeItem("aweme://roma_redirect/?spark_page=social_inbox_bulletin_media_card_video_preview", 5)));
    }

    public BulletinLynxViewPreloadConfiguration(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, List<BulletinLynxCardCacheSizeItem> list) {
        this.enableCommonOpt = num;
        this.renderThreadStrategy = num2;
        this.preloadMethod = num3;
        this.preloadSearchSize = num4;
        this.preloadTriggerSize = num5;
        this.preloadCacheSize = num6;
        this.preloadCardCache = list;
    }
}
