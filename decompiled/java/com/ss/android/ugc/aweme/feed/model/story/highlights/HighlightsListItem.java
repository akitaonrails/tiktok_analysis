package com.ss.android.ugc.aweme.feed.model.story.highlights;

import X.C2188811AlT;
import X.C786410Ut5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public abstract class HighlightsListItem {

    public static final class NewListItem extends HighlightsListItem {
        public static final NewListItem INSTANCE = new NewListItem();
    }

    public static final class CollectionListItem extends HighlightsListItem {
        public final boolean isSelected;
        public final StoryHighlightCollection storyHighlightCollection;

        public final CollectionListItem copy(StoryHighlightCollection storyHighlightCollection, boolean z) {
            return new CollectionListItem(storyHighlightCollection, z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CollectionListItem)) {
                return false;
            }
            CollectionListItem collectionListItem = (CollectionListItem) obj;
            return Intrinsics.LJFF(this.storyHighlightCollection, collectionListItem.storyHighlightCollection) && this.isSelected == collectionListItem.isSelected;
        }

        public int hashCode() {
            return (this.storyHighlightCollection.hashCode() * 31) + C786410Ut5.Z2(this.isSelected);
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("CollectionListItem(storyHighlightCollection=");
            sbLIZ.append(this.storyHighlightCollection);
            sbLIZ.append(", isSelected=");
            sbLIZ.append(this.isSelected);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public final StoryHighlightCollection getStoryHighlightCollection() {
            return this.storyHighlightCollection;
        }

        public final boolean isSelected() {
            return this.isSelected;
        }

        public CollectionListItem(StoryHighlightCollection storyHighlightCollection, boolean z) {
            this.storyHighlightCollection = storyHighlightCollection;
            this.isSelected = z;
        }
    }
}
