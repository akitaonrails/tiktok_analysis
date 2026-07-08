package com.bytedance.android.livesdk.gift.model;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.Gift;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class MusicGiftListResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("mood_id")
        public long moodId;

        @C09CT("tabs")
        public List<Tab> tabs = new ArrayList();

        public static final class Tab {

            @C09CT("has_more")
            public boolean hasMore;

            @C09CT("tab_icon")
            public ImageModel tabIcon;

            @C09CT("tab_id")
            public long tabId;

            @C09CT("gifts")
            public List<MusicGift> gifts = new ArrayList();

            @C09CT("tab_name")
            public String tabName = "";

            @C09CT("pagination_token")
            public String paginationToken = "";

            public static final class MusicGift {

                @C09CT("album_cover")
                public ImageModel albumCover;

                @C09CT("artist")
                public Artist artist;

                @C09CT("audio_resource")
                public Gift.MusicGiftInfo.AudioResource audioResource;

                @C09CT("cover_image")
                public ImageModel coverImage;

                @C09CT("gift_id")
                public long giftId;

                @C09CT("gift_price")
                public long giftPrice;

                @C09CT("outer_disc")
                public ImageModel outerDisc;

                @C09CT("pinned")
                public boolean pinned;

                @C09CT("top_left_label_icon")
                public ImageModel topLeftLabelIcon;

                @C09CT("song_name")
                public String songName = "";

                @C09CT("lyrics_text")
                public String lyricsText = "";

                public static final class Artist {

                    @C09CT("avatar")
                    public ImageModel avatar;

                    @C09CT("name")
                    public String name = "";

                    @C09CT("user_id")
                    public long userId;
                }
            }
        }
    }
}
