package com.ss.android.ugc.aweme.story.feed.immersive.component;

import X.InterfaceC1891350zJl;
import X.InterfaceC714040Rze;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: loaded from: classes12.dex */
public interface StoryImmersiveFeedItem extends InterfaceC1891350zJl, InterfaceC714040Rze {
    @Override // X.InterfaceC1891350zJl
    boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl);

    @Override // X.InterfaceC1891350zJl
    boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl);

    @Override // X.InterfaceC1891350zJl
    /* synthetic */ Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl);

    /* synthetic */ Aweme getSocialItem();

    /* synthetic */ Aweme getStoryCollection();

    /* synthetic */ boolean hasUnreadStory();
}
