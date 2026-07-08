package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes24.dex */
public final class BitrateMetaStruct implements Serializable {

    @C09CT("bitrate")
    public long bitrate;

    @C09CT("codec_type")
    public String codecType;

    @C09CT("definition")
    public String definition;

    @C09CT("encoded_type")
    public String encodedType;

    @C09CT("fid_profile_labels")
    public String fidProfileLabels;

    @C09CT("file_hash")
    public String fileHash;

    @C09CT("file_id")
    public String fileId;

    @C09CT("format")
    public String format;

    @C09CT("fps")
    public long fps;

    @C09CT("height")
    public long height;

    @C09CT("logo_type")
    public String logoType;

    @C09CT("media_type")
    public String mediaType;

    @C09CT("quality")
    public String quality;

    @C09CT("quality_desc")
    public String qualityDesc;

    @C09CT("size")
    public long size;

    @C09CT("sub_info")
    public String subInfo;

    @C09CT("url_list")
    public BitrateUrlStruct urlList;

    @C09CT("width")
    public long width;

    public final long getBitrate() {
        return this.bitrate;
    }

    public final String getCodecType() {
        return this.codecType;
    }

    public final String getDefinition() {
        return this.definition;
    }

    public final String getEncodedType() {
        return this.encodedType;
    }

    public final String getFidProfileLabels() {
        return this.fidProfileLabels;
    }

    public final String getFileHash() {
        return this.fileHash;
    }

    public final String getFileId() {
        return this.fileId;
    }

    public final String getFormat() {
        return this.format;
    }

    public final long getFps() {
        return this.fps;
    }

    public final long getHeight() {
        return this.height;
    }

    public final String getLogoType() {
        return this.logoType;
    }

    public final String getMediaType() {
        return this.mediaType;
    }

    public final String getQuality() {
        return this.quality;
    }

    public final String getQualityDesc() {
        return this.qualityDesc;
    }

    public final long getSize() {
        return this.size;
    }

    public final String getSubInfo() {
        return this.subInfo;
    }

    public final BitrateUrlStruct getUrlList() {
        return this.urlList;
    }

    public final long getWidth() {
        return this.width;
    }

    public final void setBitrate(long j) {
        this.bitrate = j;
    }

    public final void setCodecType(String str) {
        this.codecType = str;
    }

    public final void setDefinition(String str) {
        this.definition = str;
    }

    public final void setEncodedType(String str) {
        this.encodedType = str;
    }

    public final void setFidProfileLabels(String str) {
        this.fidProfileLabels = str;
    }

    public final void setFileHash(String str) {
        this.fileHash = str;
    }

    public final void setFileId(String str) {
        this.fileId = str;
    }

    public final void setFormat(String str) {
        this.format = str;
    }

    public final void setFps(long j) {
        this.fps = j;
    }

    public final void setHeight(long j) {
        this.height = j;
    }

    public final void setLogoType(String str) {
        this.logoType = str;
    }

    public final void setMediaType(String str) {
        this.mediaType = str;
    }

    public final void setQuality(String str) {
        this.quality = str;
    }

    public final void setQualityDesc(String str) {
        this.qualityDesc = str;
    }

    public final void setSize(long j) {
        this.size = j;
    }

    public final void setSubInfo(String str) {
        this.subInfo = str;
    }

    public final void setUrlList(BitrateUrlStruct bitrateUrlStruct) {
        this.urlList = bitrateUrlStruct;
    }

    public final void setWidth(long j) {
        this.width = j;
    }
}
