package com.ss.android.ugc.aweme.feed.model;

import X.C0N0Y;
import X.C1563370qml;
import X.C19EG;
import X.EnumC682280QpW;
import androidx.lifecycle.ViewModel;

/* JADX INFO: loaded from: classes12.dex */
public final class FeedSharePlayerViewModel extends ViewModel {
    public static final Companion Companion = new Companion();
    public boolean hasBindCover;
    public C0N0Y player;

    public static final C0N0Y getPlayerManager(C19EG c19eg) {
        return Companion.getPlayerManager(c19eg);
    }

    public static final FeedSharePlayerViewModel getViewModel(C19EG c19eg) {
        return Companion.getViewModel(c19eg);
    }

    public final boolean getHasBindCover() {
        return this.hasBindCover;
    }

    public final C0N0Y getPlayer() {
        return this.player;
    }

    public static final class Companion {
        public final C0N0Y getPlayerManager(C19EG c19eg) {
            return getViewModel(c19eg).player;
        }

        public final FeedSharePlayerViewModel getViewModel(C19EG c19eg) {
            return (FeedSharePlayerViewModel) C1563370qml.LIZ(c19eg, EnumC682280QpW.MAIN, new FeedSharePlayerViewModel$Companion$getViewModel$1(c19eg));
        }
    }

    public final void setHasBindCover(boolean z) {
        this.hasBindCover = z;
    }

    public final void setPlayer(C0N0Y c0n0y) {
        this.player = c0n0y;
    }
}
