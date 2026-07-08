package com.ss.android.ugc.effectmanager.effect.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes26.dex */
public class ProviderEffectModel implements Serializable {
    public int cursor;
    public String cursor_id;
    public String extra;
    public String feed_session_id;
    public boolean has_more;
    public String impression_id;
    public Integer last_clip_cursor;
    public Integer last_gif_cursor;
    public List<? extends ProviderEffect> library_list;
    public String media_source;
    public String search_tips;
    public List<? extends ProviderEffect> sticker_list;
    public String subtitle;

    public ProviderEffectModel() {
        this(null, 0, false, new ArrayList(), null, null, null, null, null, null, null, null, null);
    }

    public final boolean hasMore() {
        return getHasMore();
    }

    public final int getCursor() {
        return this.cursor;
    }

    public final String getCursorId() {
        return this.cursor_id;
    }

    public final String getCursor_id() {
        return this.cursor_id;
    }

    public final String getExtra() {
        return this.extra;
    }

    public final String getFeed_session_id() {
        return this.feed_session_id;
    }

    public final boolean getHasMore() {
        return this.has_more;
    }

    public final boolean getHas_more() {
        return this.has_more;
    }

    public final String getImpression_id() {
        return this.impression_id;
    }

    public final Integer getLast_clip_cursor() {
        return this.last_clip_cursor;
    }

    public final Integer getLast_gif_cursor() {
        return this.last_gif_cursor;
    }

    public final List<ProviderEffect> getLibrary_list() {
        return this.library_list;
    }

    public final String getMedia_source() {
        return this.media_source;
    }

    public final String getSearchTips() {
        return this.search_tips;
    }

    public final String getSearch_tips() {
        return this.search_tips;
    }

    public final List<ProviderEffect> getStickerList() {
        return this.sticker_list;
    }

    public final List<ProviderEffect> getSticker_list() {
        return this.sticker_list;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final void setCursor(int i) {
        this.cursor = i;
    }

    public final void setCursorId(String str) {
        this.cursor_id = str;
    }

    public final void setCursor_id(String str) {
        this.cursor_id = str;
    }

    public final void setExtra(String str) {
        this.extra = str;
    }

    public final void setFeed_session_id(String str) {
        this.feed_session_id = str;
    }

    public final void setHasMore(boolean z) {
        this.has_more = z;
    }

    public final void setHas_more(boolean z) {
        this.has_more = z;
    }

    public final void setImpression_id(String str) {
        this.impression_id = str;
    }

    public final void setLast_clip_cursor(Integer num) {
        this.last_clip_cursor = num;
    }

    public final void setLast_gif_cursor(Integer num) {
        this.last_gif_cursor = num;
    }

    public final void setLibrary_list(List<? extends ProviderEffect> list) {
        this.library_list = list;
    }

    public final void setMedia_source(String str) {
        this.media_source = str;
    }

    public final void setSearchTips(String str) {
        this.search_tips = str;
    }

    public final void setSearch_tips(String str) {
        this.search_tips = str;
    }

    public final void setStickerList(List<? extends ProviderEffect> list) {
        this.sticker_list = list;
    }

    public final void setSticker_list(List<? extends ProviderEffect> list) {
        this.sticker_list = list;
    }

    public final void setSubtitle(String str) {
        this.subtitle = str;
    }

    public ProviderEffectModel(String str, int i, boolean z, List<? extends ProviderEffect> list, String str2, String str3, String str4, Integer num, Integer num2, List<? extends ProviderEffect> list2, String str5, String str6, String str7) {
        this.search_tips = str;
        this.cursor = i;
        this.has_more = z;
        this.sticker_list = list;
        this.subtitle = str2;
        this.extra = str3;
        this.impression_id = str4;
        this.last_clip_cursor = num;
        this.last_gif_cursor = num2;
        this.library_list = list2;
        this.media_source = str5;
        this.feed_session_id = str6;
        this.cursor_id = str7;
    }
}
