package com.ss.android.ugc.aweme.discover.model;

import X.C09CT;
import android.text.TextUtils;
import java.io.Serializable;

/* JADX INFO: loaded from: classes28.dex */
public final class EpisodeData implements Serializable {

    @C09CT("album_id")
    public String albumId;

    @C09CT("definition")
    public String definition;

    @C09CT("duration")
    public double duration;

    @C09CT("episode_id")
    public String episodeId;

    @C09CT("name")
    public String name;

    @C09CT("online_time")
    public long onlineTime;

    @C09CT("opening")
    public double opening;

    @C09CT("payment_status")
    public int paymentStatus;

    @C09CT("lvideo_tag")
    public LongVideoTag paymentTag;

    @C09CT("lvideo_tag_light")
    public LongVideoTag paymentTagLight;

    @C09CT("schema_type")
    public int schemaType;

    @C09CT("schema")
    public String scheme;

    @C09CT("seq")
    public int seq;
    public String seqStr;

    @C09CT("sub_title")
    public String subTitle;

    @C09CT("title")
    public String title;

    @C09CT("url")
    public String url;

    @C09CT("vid")
    public String vid;

    public final String getSeqStr() {
        return TextUtils.isEmpty(this.seqStr) ? String.valueOf(this.seq) : this.seqStr;
    }

    public final String getAlbumId() {
        return this.albumId;
    }

    public final String getDefinition() {
        return this.definition;
    }

    public final double getDuration() {
        return this.duration;
    }

    public final String getEpisodeId() {
        return this.episodeId;
    }

    public final String getName() {
        return this.name;
    }

    public final long getOnlineTime() {
        return this.onlineTime;
    }

    public final double getOpening() {
        return this.opening;
    }

    public final int getPaymentStatus() {
        return this.paymentStatus;
    }

    public final LongVideoTag getPaymentTag() {
        return this.paymentTag;
    }

    public final LongVideoTag getPaymentTagLight() {
        return this.paymentTagLight;
    }

    public final int getSchemaType() {
        return this.schemaType;
    }

    public final String getScheme() {
        return this.scheme;
    }

    public final int getSeq() {
        return this.seq;
    }

    public final String getSubTitle() {
        return this.subTitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public final String getVid() {
        return this.vid;
    }

    public final void setAlbumId(String str) {
        this.albumId = str;
    }

    public final void setDefinition(String str) {
        this.definition = str;
    }

    public final void setDuration(double d) {
        this.duration = d;
    }

    public final void setEpisodeId(String str) {
        this.episodeId = str;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setOnlineTime(long j) {
        this.onlineTime = j;
    }

    public final void setOpening(double d) {
        this.opening = d;
    }

    public final void setPaymentStatus(int i) {
        this.paymentStatus = i;
    }

    public final void setPaymentTag(LongVideoTag longVideoTag) {
        this.paymentTag = longVideoTag;
    }

    public final void setPaymentTagLight(LongVideoTag longVideoTag) {
        this.paymentTagLight = longVideoTag;
    }

    public final void setSchemaType(int i) {
        this.schemaType = i;
    }

    public final void setScheme(String str) {
        this.scheme = str;
    }

    public final void setSeq(int i) {
        this.seq = i;
    }

    public final void setSeqStr(String str) {
        this.seqStr = str;
    }

    public final void setSubTitle(String str) {
        this.subTitle = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setUrl(String str) {
        this.url = str;
    }

    public final void setVid(String str) {
        this.vid = str;
    }
}
