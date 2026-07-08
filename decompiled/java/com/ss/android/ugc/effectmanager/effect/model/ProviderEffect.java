package com.ss.android.ugc.effectmanager.effect.model;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import java.io.Serializable;

/* JADX INFO: loaded from: classes26.dex */
public class ProviderEffect implements Serializable {
    public AuthorBean author;
    public String click_url;
    public Long duration;
    public String extra;
    public String height;
    public String id;
    public boolean isFromTenor;
    public Integer library_material_type;
    public String material_description;
    public String material_mp4_url;
    public String media_source;
    public String path;
    public String preview_webp;
    public StickerBean sticker;
    public StickerBean thumbnail_sticker;
    public String title;
    public String user_name;
    public Video video;
    public String width;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class MaterialType {
        public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
        public static final /* synthetic */ MaterialType[] $VALUES;
        public final int typeOrdinal;
        public static final MaterialType GIPHY_STICKERS = new MaterialType("GIPHY_STICKERS", 0, -1);
        public static final MaterialType GIPHY_GIFS = new MaterialType("GIPHY_GIFS", 1, 0);
        public static final MaterialType VIDEO_CLIP = new MaterialType("VIDEO_CLIP", 2, 1);
        public static final MaterialType GIF = new MaterialType("GIF", 3, 2);

        public static final /* synthetic */ MaterialType[] $values() {
            return new MaterialType[]{GIPHY_STICKERS, GIPHY_GIFS, VIDEO_CLIP, GIF};
        }

        public static InterfaceC2044707zh<MaterialType> getEntries() {
            return $ENTRIES;
        }

        static {
            MaterialType[] materialTypeArr$values = $values();
            $VALUES = materialTypeArr$values;
            $ENTRIES = new C2254308sP(materialTypeArr$values);
        }

        public static MaterialType[] values() {
            return (MaterialType[]) $VALUES.clone();
        }

        public final int getTypeOrdinal() {
            return this.typeOrdinal;
        }

        public static MaterialType valueOf(String str) {
            return (MaterialType) C08FF.LIZ(MaterialType.class, str);
        }

        public MaterialType(String str, int i, int i2) {
            this.typeOrdinal = i2;
        }
    }

    public ProviderEffect() {
        this("", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false);
    }

    /* JADX INFO: loaded from: classes31.dex */
    public static final class Video implements Serializable {
        public String video_1080p_url;
        public String video_360p_url;
        public String video_480p_url;
        public String video_4k_url;
        public String video_720p_url;
        public String video_toptiktok_url;

        public Video() {
            this(null, null, null, null, null, null);
        }

        public final String getVideo_1080p_url() {
            return this.video_1080p_url;
        }

        public final String getVideo_360p_url() {
            return this.video_360p_url;
        }

        public final String getVideo_480p_url() {
            return this.video_480p_url;
        }

        public final String getVideo_4k_url() {
            return this.video_4k_url;
        }

        public final String getVideo_720p_url() {
            return this.video_720p_url;
        }

        public final String getVideo_toptiktok_url() {
            return this.video_toptiktok_url;
        }

        public final void setVideo_1080p_url(String str) {
            this.video_1080p_url = str;
        }

        public final void setVideo_360p_url(String str) {
            this.video_360p_url = str;
        }

        public final void setVideo_480p_url(String str) {
            this.video_480p_url = str;
        }

        public final void setVideo_4k_url(String str) {
            this.video_4k_url = str;
        }

        public final void setVideo_720p_url(String str) {
            this.video_720p_url = str;
        }

        public final void setVideo_toptiktok_url(String str) {
            this.video_toptiktok_url = str;
        }

        public Video(String str, String str2, String str3, String str4, String str5, String str6) {
            this.video_360p_url = str;
            this.video_480p_url = str2;
            this.video_720p_url = str3;
            this.video_1080p_url = str4;
            this.video_4k_url = str5;
            this.video_toptiktok_url = str6;
        }
    }

    public static class AuthorBean implements Serializable {
        public String avatar_url;
        public String display_name;
        public String profile_url;
        public String username;

        public AuthorBean() {
            this(null, null, null, null);
        }

        public final String getAvatar_url() {
            return this.avatar_url;
        }

        public final String getDisplay_name() {
            return this.display_name;
        }

        public final String getProfile_url() {
            return this.profile_url;
        }

        public final String getUsername() {
            return this.username;
        }

        public final void setAvatar_url(String str) {
            this.avatar_url = str;
        }

        public final void setDisplay_name(String str) {
            this.display_name = str;
        }

        public final void setProfile_url(String str) {
            this.profile_url = str;
        }

        public final void setUsername(String str) {
            this.username = str;
        }

        public AuthorBean(String str, String str2, String str3, String str4) {
            this.avatar_url = str;
            this.profile_url = str2;
            this.username = str3;
            this.display_name = str4;
        }
    }

    public static class StickerBean implements Serializable {
        public String height;
        public String size;
        public String url;
        public String width;

        public StickerBean() {
            this(null, null, null, null);
        }

        public final String getHeight() {
            return this.height;
        }

        public final String getSize() {
            return this.size;
        }

        public final String getUrl() {
            return this.url;
        }

        public final String getWidth() {
            return this.width;
        }

        public final void setHeight(String str) {
            this.height = str;
        }

        public final void setSize(String str) {
            this.size = str;
        }

        public final void setUrl(String str) {
            this.url = str;
        }

        public final void setWidth(String str) {
            this.width = str;
        }

        public StickerBean(String str, String str2, String str3, String str4) {
            this.url = str;
            this.width = str2;
            this.height = str3;
            this.size = str4;
        }
    }

    public final AuthorBean getAuthor() {
        return this.author;
    }

    public final String getClickUrl() {
        return this.click_url;
    }

    public final String getClick_url() {
        return this.click_url;
    }

    public final Long getDuration() {
        return this.duration;
    }

    public final String getExtra() {
        return this.extra;
    }

    public final String getHeight() {
        return this.height;
    }

    public final String getId() {
        return this.id;
    }

    public final Integer getLibrary_material_type() {
        return this.library_material_type;
    }

    public final String getMaterial_description() {
        return this.material_description;
    }

    public final String getMaterial_mp4_url() {
        return this.material_mp4_url;
    }

    public final String getMedia_source() {
        return this.media_source;
    }

    public final String getPath() {
        return this.path;
    }

    public final String getPreview_webp() {
        return this.preview_webp;
    }

    public final StickerBean getSticker() {
        return this.sticker;
    }

    public final StickerBean getSticker_info() {
        return this.sticker;
    }

    public final StickerBean getThumbnailSticker() {
        return this.thumbnail_sticker;
    }

    public final StickerBean getThumbnail_sticker() {
        return this.thumbnail_sticker;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUser_name() {
        return this.user_name;
    }

    public final Video getVideo() {
        return this.video;
    }

    public final String getWidth() {
        return this.width;
    }

    public final boolean isFromTenor() {
        return this.isFromTenor;
    }

    public final void setAuthor(AuthorBean authorBean) {
        this.author = authorBean;
    }

    public final void setClickUrl(String str) {
        this.click_url = str;
    }

    public final void setClick_url(String str) {
        this.click_url = str;
    }

    public final void setDuration(Long l) {
        this.duration = l;
    }

    public final void setExtra(String str) {
        this.extra = str;
    }

    public final void setFromTenor(boolean z) {
        this.isFromTenor = z;
    }

    public final void setHeight(String str) {
        this.height = str;
    }

    public final void setId(String str) {
        this.id = str;
    }

    public final void setLibrary_material_type(Integer num) {
        this.library_material_type = num;
    }

    public final void setMaterial_description(String str) {
        this.material_description = str;
    }

    public final void setMaterial_mp4_url(String str) {
        this.material_mp4_url = str;
    }

    public final void setMedia_source(String str) {
        this.media_source = str;
    }

    public final void setPath(String str) {
        this.path = str;
    }

    public final void setPreview_webp(String str) {
        this.preview_webp = str;
    }

    public final void setSticker(StickerBean stickerBean) {
        this.sticker = stickerBean;
    }

    public final void setSticker_info(StickerBean stickerBean) {
        this.sticker = stickerBean;
    }

    public final void setThumbnailSticker(StickerBean stickerBean) {
        this.thumbnail_sticker = stickerBean;
    }

    public final void setThumbnail_sticker(StickerBean stickerBean) {
        this.thumbnail_sticker = stickerBean;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setUser_name(String str) {
        this.user_name = str;
    }

    public final void setVideo(Video video) {
        this.video = video;
    }

    public final void setWidth(String str) {
        this.width = str;
    }

    public ProviderEffect(String str, String str2, String str3, StickerBean stickerBean, StickerBean stickerBean2, String str4, String str5, String str6, String str7, String str8, Integer num, Video video, AuthorBean authorBean, Long l, String str9, String str10, String str11, String str12, boolean z) {
        this.id = str;
        this.title = str2;
        this.user_name = str3;
        this.thumbnail_sticker = stickerBean;
        this.sticker = stickerBean2;
        this.preview_webp = str4;
        this.height = str5;
        this.width = str6;
        this.material_description = str7;
        this.material_mp4_url = str8;
        this.library_material_type = num;
        this.video = video;
        this.author = authorBean;
        this.duration = l;
        this.media_source = str9;
        this.click_url = str10;
        this.path = str11;
        this.extra = str12;
        this.isFromTenor = z;
    }
}
