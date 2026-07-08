package com.ss.lyrax.room;

import com.ss.lyrax.subscriber.ILyraxSubscriberListenerFactory;
import com.ss.lyrax.subscriber.ILyraxSubscriberVideoSinkFactory;

/* JADX INFO: loaded from: classes21.dex */
public class LyraxRoomConfig {
    public boolean autoPublish;
    public boolean autoSubscribeAudio;
    public boolean autoSubscribeVideo;
    public LyraxRoomProfileType profile;
    public ILyraxSubscriberListenerFactory subscriberListenerFactory;
    public ILyraxSubscriberVideoSinkFactory videoSinkFactory;

    public boolean getAutoPublish() {
        return this.autoPublish;
    }

    public boolean getAutoSubscribeAudio() {
        return this.autoSubscribeAudio;
    }

    public boolean getAutoSubscribeVideo() {
        return this.autoSubscribeVideo;
    }

    public LyraxRoomProfileType getProfile() {
        return this.profile;
    }

    public ILyraxSubscriberListenerFactory getSubscriberListenerFactory() {
        return this.subscriberListenerFactory;
    }

    public ILyraxSubscriberVideoSinkFactory getVideoSinkFactory() {
        return this.videoSinkFactory;
    }

    public LyraxRoomConfig(LyraxRoomProfileType lyraxRoomProfileType, boolean z, boolean z2, boolean z3, ILyraxSubscriberListenerFactory iLyraxSubscriberListenerFactory, ILyraxSubscriberVideoSinkFactory iLyraxSubscriberVideoSinkFactory) {
        this.profile = lyraxRoomProfileType;
        this.autoPublish = z;
        this.autoSubscribeAudio = z2;
        this.autoSubscribeVideo = z3;
        this.subscriberListenerFactory = iLyraxSubscriberListenerFactory;
        this.videoSinkFactory = iLyraxSubscriberVideoSinkFactory;
    }
}
