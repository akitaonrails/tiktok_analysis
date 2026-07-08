package com.ss.android.ugc.aweme.story.inbox;

import X.C0ZB9;
import X.C1595950rdJ;
import X.C1598110rgn;
import X.C1600110rk1;
import X.C1600120rk2;
import X.C2188811AlT;
import X.C729510SjV;
import X.InterfaceC1595240rcA;
import X.InterfaceC1598460rhM;
import X.InterfaceC1890700zIi;
import X.InterfaceC1891350zJl;
import X.InterfaceC712200Rwg;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.highlights.SkylightHighlightAwemeInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class SkylightHighlightsItem implements InterfaceC1891350zJl, InterfaceC712200Rwg, InterfaceC1890700zIi, InterfaceC1598460rhM, InterfaceC1595240rcA {
    public static final int $stable = 8;
    public int dataFrom;
    public final Aweme highlightCollection;
    public int priority;
    public final List<SkylightHighlightAwemeInfo> userHighlights;
    public final boolean isSingleUser = true;
    public int storyStatusForInbox = -1;

    public final SkylightHighlightsItem copy(Aweme aweme, List<SkylightHighlightAwemeInfo> list, int i, int i2) {
        return new SkylightHighlightsItem(aweme, list, i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SkylightHighlightsItem)) {
            return false;
        }
        SkylightHighlightsItem skylightHighlightsItem = (SkylightHighlightsItem) obj;
        return Intrinsics.LJFF(this.highlightCollection, skylightHighlightsItem.highlightCollection) && Intrinsics.LJFF(this.userHighlights, skylightHighlightsItem.userHighlights) && this.priority == skylightHighlightsItem.priority && this.dataFrom == skylightHighlightsItem.dataFrom;
    }

    @Override // X.InterfaceC1595240rcA
    public String getCellType() {
        return "story_highlight";
    }

    @Override // X.InterfaceC1891350zJl
    public Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    @Override // X.InterfaceC1598460rhM
    public String getItemFilterUid(String str) {
        return str;
    }

    @Override // X.InterfaceC1595240rcA
    public int getReRankSequence() {
        return -1;
    }

    @Override // X.InterfaceC1595240rcA
    public Integer getReRankType() {
        return -1;
    }

    public int hashCode() {
        return (((((this.highlightCollection.hashCode() * 31) + this.userHighlights.hashCode()) * 31) + this.priority) * 31) + this.dataFrom;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SkylightHighlightsItem(highlightCollection=");
        sbLIZ.append(this.highlightCollection);
        sbLIZ.append(", userHighlights=");
        sbLIZ.append(this.userHighlights);
        sbLIZ.append(", priority=");
        sbLIZ.append(this.priority);
        sbLIZ.append(", dataFrom=");
        sbLIZ.append(this.dataFrom);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public Aweme getSocialItem() {
        return getHighlightCollection();
    }

    @Override // X.InterfaceC1595240rcA
    public String getUid() {
        return C1595950rdJ.LIZ(this);
    }

    @Override // X.InterfaceC1595240rcA
    public User getUser() {
        Aweme highlightCollection = getHighlightCollection();
        if (highlightCollection != null) {
            return highlightCollection.getAuthor();
        }
        return null;
    }

    @Override // X.InterfaceC1595240rcA
    public boolean isUnfollow() {
        return C1595950rdJ.LIZIZ(this);
    }

    @Override // X.InterfaceC1890700zIi
    public String itemUniqueId() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("skylight_highlight_");
        sbLIZ.append(C729510SjV.LJIIIZ(getHighlightCollection()));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1890700zIi
    public C0ZB9 biz() {
        return C1598110rgn.LIZIZ;
    }

    public final int getDataFrom() {
        return this.dataFrom;
    }

    @Override // X.InterfaceC712200Rwg
    public Aweme getHighlightCollection() {
        return this.highlightCollection;
    }

    public final int getPriority() {
        return this.priority;
    }

    public int getStoryStatusForInbox() {
        return this.storyStatusForInbox;
    }

    public final List<SkylightHighlightAwemeInfo> getUserHighlights() {
        return this.userHighlights;
    }

    @Override // X.InterfaceC1595240rcA
    public boolean isSingleUser() {
        return this.isSingleUser;
    }

    @Override // X.InterfaceC1891350zJl
    public boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1598460rhM
    public int getItemPriority(int i) {
        return this.priority;
    }

    @Override // X.InterfaceC1890700zIi
    public C1600120rk2 isItemChanged(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof SkylightHighlightsItem)) {
            return C1600110rk1.LIZ("unknown");
        }
        return C1600110rk1.LIZJ();
    }

    public final void setDataFrom(int i) {
        this.dataFrom = i;
    }

    public final void setPriority(int i) {
        this.priority = i;
    }

    public void setStoryStatusForInbox(int i) {
        this.storyStatusForInbox = i;
    }

    public SkylightHighlightsItem(Aweme aweme, List<SkylightHighlightAwemeInfo> list, int i, int i2) {
        this.highlightCollection = aweme;
        this.userHighlights = list;
        this.priority = i;
        this.dataFrom = i2;
    }
}
