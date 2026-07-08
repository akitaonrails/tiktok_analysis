package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import com.ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes22.dex */
public final class LiveEvent implements Serializable {

    @C09CT("bulletinAccountInfo")
    public Map<String, ? extends Object> bulletinAccountInfo;

    @C09CT("bulletinSharePolicy")
    public Integer bulletinSharePolicy;

    @C09CT("customActionItems")
    public List<String> customActionItems;

    @C09CT("eventID")
    public String eventID;

    @C09CT("internalURL")
    public String internalURL;

    @C09CT("isAnchor")
    public String isAnchor;

    @C09CT("isPopup")
    public Boolean isPopup;

    @C09CT("organizer")
    public User organizer;

    @C09CT("shareURL")
    public String shareURL;

    @C09CT("showsIMForActivity")
    public Boolean showsIMForActivity = Boolean.TRUE;

    @C09CT("startTime")
    public String startTime;

    @C09CT("title")
    public String title;

    @C09CT("track_info")
    public String trackInfo;

    public final Map<String, Object> getBulletinAccountInfo() {
        return this.bulletinAccountInfo;
    }

    public final Integer getBulletinSharePolicy() {
        return this.bulletinSharePolicy;
    }

    public final List<String> getCustomActionItems() {
        return this.customActionItems;
    }

    public final String getEventID() {
        return this.eventID;
    }

    public final String getInternalURL() {
        return this.internalURL;
    }

    public final User getOrganizer() {
        return this.organizer;
    }

    public final String getShareURL() {
        return this.shareURL;
    }

    public final Boolean getShowsIMForActivity() {
        return this.showsIMForActivity;
    }

    public final String getStartTime() {
        return this.startTime;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTrackInfo() {
        return this.trackInfo;
    }

    public final String isAnchor() {
        return this.isAnchor;
    }

    public final Boolean isPopup() {
        return this.isPopup;
    }

    public final void setAnchor(String str) {
        this.isAnchor = str;
    }

    public final void setBulletinAccountInfo(Map<String, ? extends Object> map) {
        this.bulletinAccountInfo = map;
    }

    public final void setBulletinSharePolicy(Integer num) {
        this.bulletinSharePolicy = num;
    }

    public final void setCustomActionItems(List<String> list) {
        this.customActionItems = list;
    }

    public final void setEventID(String str) {
        this.eventID = str;
    }

    public final void setInternalURL(String str) {
        this.internalURL = str;
    }

    public final void setOrganizer(User user) {
        this.organizer = user;
    }

    public final void setPopup(Boolean bool) {
        this.isPopup = bool;
    }

    public final void setShareURL(String str) {
        this.shareURL = str;
    }

    public final void setShowsIMForActivity(Boolean bool) {
        this.showsIMForActivity = bool;
    }

    public final void setStartTime(String str) {
        this.startTime = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setTrackInfo(String str) {
        this.trackInfo = str;
    }
}
