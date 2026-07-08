package com.bytedance.ies.sdk.widgets;

import X.C1083090eI7;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public abstract class GroupHolderConstraintElement implements ConstraintElement {
    public ArrayList<C1083090eI7> groups;
    public final PropertyResolver propertyResolver;

    public boolean checkDetach() {
        return false;
    }

    public String getTag() {
        return null;
    }

    public boolean isAttached() {
        return false;
    }

    @Override // com.bytedance.ies.sdk.widgets.ConstraintElement
    public List<C1083090eI7> getGroups() {
        return this.groups;
    }

    public final PropertyResolver getPropertyResolver() {
        return this.propertyResolver;
    }

    public GroupHolderConstraintElement(PropertyResolver propertyResolver) {
        this.propertyResolver = propertyResolver;
    }

    public final void addGroup(C1083090eI7 c1083090eI7) {
        if (this.groups == null) {
            this.groups = new ArrayList<>();
        }
        ArrayList<C1083090eI7> arrayList = this.groups;
        if (arrayList != null) {
            arrayList.add(c1083090eI7);
        }
    }

    public final void removeGroup(C1083090eI7 c1083090eI7) {
        ArrayList<C1083090eI7> arrayList = this.groups;
        if (arrayList != null) {
            arrayList.remove(c1083090eI7);
        }
    }
}
