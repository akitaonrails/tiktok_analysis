package com.ss.android.ugc.aweme.story.inbox;

import X.C2188811AlT;
import X.InterfaceC1598460rhM;
import X.InterfaceC1891350zJl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class SkylightHighlightsDividerItem implements InterfaceC1891350zJl, InterfaceC1598460rhM {
    public static final int $stable = 8;
    public int priority;

    public final SkylightHighlightsDividerItem copy(int i) {
        return new SkylightHighlightsDividerItem(i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SkylightHighlightsDividerItem) && this.priority == ((SkylightHighlightsDividerItem) obj).priority;
    }

    @Override // X.InterfaceC1891350zJl
    public Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    @Override // X.InterfaceC1598460rhM
    public String getItemFilterUid(String str) {
        return str;
    }

    public int hashCode() {
        return this.priority;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SkylightHighlightsDividerItem(priority=");
        sbLIZ.append(this.priority);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int getPriority() {
        return this.priority;
    }

    public SkylightHighlightsDividerItem(int i) {
        this.priority = i;
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

    public final void setPriority(int i) {
        this.priority = i;
    }
}
