package com.ss.android.ugc.feed.platform.popup.component;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes13.dex */
public final class FeedPopupAbilityWrapper implements IFeedPopupAbility {
    public static final FeedPopupAbilityWrapper LL = new FeedPopupAbilityWrapper();
    public static WeakReference<IFeedPopupAbility> LLILLJJLI;

    @Override // com.ss.android.ugc.feed.platform.popup.component.IFeedPopupAbility
    public final void LJJLIIJ() {
        IFeedPopupAbility iFeedPopupAbility;
        WeakReference<IFeedPopupAbility> weakReference = LLILLJJLI;
        if (weakReference == null || (iFeedPopupAbility = weakReference.get()) == null) {
            return;
        }
        iFeedPopupAbility.LJJLIIJ();
    }

    @Override // com.ss.android.ugc.feed.platform.popup.component.IFeedPopupAbility
    public final void pauseVideo() {
        IFeedPopupAbility iFeedPopupAbility;
        WeakReference<IFeedPopupAbility> weakReference = LLILLJJLI;
        if (weakReference == null || (iFeedPopupAbility = weakReference.get()) == null) {
            return;
        }
        iFeedPopupAbility.pauseVideo();
    }
}
