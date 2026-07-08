package com.ss.android.ugc.aweme.item;

import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import com.ss.android.ugc.aweme.bean.MixRankSkylightResponse;
import com.ss.android.ugc.aweme.story.inbox.StoryGetFeedByPageResponse;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public abstract class StoryCacheData implements Serializable {
    public final StoryCacheExtra extra;

    public static final class MixRankResponseCache extends StoryCacheData {
        public final StoryCacheExtra extra;
        public final MixRankSkylightResponse responseData;

        public final MixRankResponseCache copy(MixRankSkylightResponse mixRankSkylightResponse, StoryCacheExtra storyCacheExtra) {
            return new MixRankResponseCache(mixRankSkylightResponse, storyCacheExtra);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MixRankResponseCache)) {
                return false;
            }
            MixRankResponseCache mixRankResponseCache = (MixRankResponseCache) obj;
            return Intrinsics.LJFF(this.responseData, mixRankResponseCache.responseData) && Intrinsics.LJFF(this.extra, mixRankResponseCache.extra);
        }

        public int hashCode() {
            return (this.responseData.hashCode() * 31) + this.extra.hashCode();
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("MixRankResponseCache(responseData=");
            sbLIZ.append(this.responseData);
            sbLIZ.append(", extra=");
            sbLIZ.append(this.extra);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        @Override // com.ss.android.ugc.aweme.item.StoryCacheData
        public StoryCacheExtra getExtra() {
            return this.extra;
        }

        public final MixRankSkylightResponse getResponseData() {
            return this.responseData;
        }

        public MixRankResponseCache(MixRankSkylightResponse mixRankSkylightResponse, StoryCacheExtra storyCacheExtra) {
            super(storyCacheExtra);
            this.responseData = mixRankSkylightResponse;
            this.extra = storyCacheExtra;
        }
    }

    public static final class PowerItemCache extends StoryCacheData {
        public final StoryCacheExtra extra;
        public final boolean isIncrementalAppend;
        public final boolean isLastChunk;
        public final boolean isPagedRead;
        public final List<InterfaceC1891350zJl> powerItems;
        public final boolean waitingForDiskCache;

        public final PowerItemCache copy(List<? extends InterfaceC1891350zJl> list, boolean z, StoryCacheExtra storyCacheExtra, boolean z2, boolean z3, boolean z4) {
            return new PowerItemCache(list, z, storyCacheExtra, z2, z3, z4);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PowerItemCache)) {
                return false;
            }
            PowerItemCache powerItemCache = (PowerItemCache) obj;
            return Intrinsics.LJFF(this.powerItems, powerItemCache.powerItems) && this.waitingForDiskCache == powerItemCache.waitingForDiskCache && Intrinsics.LJFF(this.extra, powerItemCache.extra) && this.isPagedRead == powerItemCache.isPagedRead && this.isIncrementalAppend == powerItemCache.isIncrementalAppend && this.isLastChunk == powerItemCache.isLastChunk;
        }

        public int hashCode() {
            return (((((((((this.powerItems.hashCode() * 31) + C786410Ut5.Z2(this.waitingForDiskCache)) * 31) + this.extra.hashCode()) * 31) + C786410Ut5.Z2(this.isPagedRead)) * 31) + C786410Ut5.Z2(this.isIncrementalAppend)) * 31) + C786410Ut5.Z2(this.isLastChunk);
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PowerItemCache(powerItems=");
            sbLIZ.append(this.powerItems);
            sbLIZ.append(", waitingForDiskCache=");
            sbLIZ.append(this.waitingForDiskCache);
            sbLIZ.append(", extra=");
            sbLIZ.append(this.extra);
            sbLIZ.append(", isPagedRead=");
            sbLIZ.append(this.isPagedRead);
            sbLIZ.append(", isIncrementalAppend=");
            sbLIZ.append(this.isIncrementalAppend);
            sbLIZ.append(", isLastChunk=");
            sbLIZ.append(this.isLastChunk);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        @Override // com.ss.android.ugc.aweme.item.StoryCacheData
        public StoryCacheExtra getExtra() {
            return this.extra;
        }

        public final List<InterfaceC1891350zJl> getPowerItems() {
            return this.powerItems;
        }

        public final boolean getWaitingForDiskCache() {
            return this.waitingForDiskCache;
        }

        public final boolean isIncrementalAppend() {
            return this.isIncrementalAppend;
        }

        public final boolean isLastChunk() {
            return this.isLastChunk;
        }

        public final boolean isPagedRead() {
            return this.isPagedRead;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public PowerItemCache(List<? extends InterfaceC1891350zJl> list, boolean z, StoryCacheExtra storyCacheExtra, boolean z2, boolean z3, boolean z4) {
            super(storyCacheExtra);
            this.powerItems = list;
            this.waitingForDiskCache = z;
            this.extra = storyCacheExtra;
            this.isPagedRead = z2;
            this.isIncrementalAppend = z3;
            this.isLastChunk = z4;
        }
    }

    public static final class ResponseCache extends StoryCacheData {
        public final StoryCacheExtra extra;
        public final StoryGetFeedByPageResponse responseData;

        public final ResponseCache copy(StoryGetFeedByPageResponse storyGetFeedByPageResponse, StoryCacheExtra storyCacheExtra) {
            return new ResponseCache(storyGetFeedByPageResponse, storyCacheExtra);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ResponseCache)) {
                return false;
            }
            ResponseCache responseCache = (ResponseCache) obj;
            return Intrinsics.LJFF(this.responseData, responseCache.responseData) && Intrinsics.LJFF(this.extra, responseCache.extra);
        }

        public int hashCode() {
            return (this.responseData.hashCode() * 31) + this.extra.hashCode();
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ResponseCache(responseData=");
            sbLIZ.append(this.responseData);
            sbLIZ.append(", extra=");
            sbLIZ.append(this.extra);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        @Override // com.ss.android.ugc.aweme.item.StoryCacheData
        public StoryCacheExtra getExtra() {
            return this.extra;
        }

        public final StoryGetFeedByPageResponse getResponseData() {
            return this.responseData;
        }

        public ResponseCache(StoryGetFeedByPageResponse storyGetFeedByPageResponse, StoryCacheExtra storyCacheExtra) {
            super(storyCacheExtra);
            this.responseData = storyGetFeedByPageResponse;
            this.extra = storyCacheExtra;
        }
    }

    public StoryCacheExtra getExtra() {
        return this.extra;
    }

    public StoryCacheData(StoryCacheExtra storyCacheExtra) {
        this.extra = storyCacheExtra;
    }
}
