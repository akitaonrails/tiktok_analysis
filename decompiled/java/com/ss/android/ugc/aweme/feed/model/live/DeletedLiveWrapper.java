package com.ss.android.ugc.aweme.feed.model.live;

/* JADX INFO: loaded from: classes36.dex */
public final class DeletedLiveWrapper {
    public int deletedRoomCount;
    public int minDeletedReverseIndex;
    public int minUnreadReverseIndex;
    public int unreadRoomCount;

    public DeletedLiveWrapper() {
        this(0, 0, 0, 0);
    }

    public final int getDeletedRoomCount() {
        return this.deletedRoomCount;
    }

    public final int getMinDeletedReverseIndex() {
        return this.minDeletedReverseIndex;
    }

    public final int getMinUnreadReverseIndex() {
        return this.minUnreadReverseIndex;
    }

    public final int getUnreadRoomCount() {
        return this.unreadRoomCount;
    }

    public final void setDeletedRoomCount(int i) {
        this.deletedRoomCount = i;
    }

    public final void setMinDeletedReverseIndex(int i) {
        this.minDeletedReverseIndex = i;
    }

    public final void setMinUnreadReverseIndex(int i) {
        this.minUnreadReverseIndex = i;
    }

    public final void setUnreadRoomCount(int i) {
        this.unreadRoomCount = i;
    }

    public DeletedLiveWrapper(int i, int i2, int i3, int i4) {
        this.deletedRoomCount = i;
        this.minDeletedReverseIndex = i2;
        this.unreadRoomCount = i3;
        this.minUnreadReverseIndex = i4;
    }
}
