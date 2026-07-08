package com.bytedance.ies.sdk.widgets;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes18.dex */
public class GroupableElementSpecImpl extends ElementSpecImpl implements GroupableElementSpec {
    public final Set<Integer> bindingGroup;

    @Override // com.bytedance.ies.sdk.widgets.GroupableElementSpec
    public Set<Integer> getGroupIds() {
        return this.bindingGroup;
    }

    public GroupableElementSpecImpl(int i) {
        super(i);
        this.bindingGroup = new LinkedHashSet();
    }

    public final GroupableElementSpecImpl bindGroup(int i) {
        this.bindingGroup.add(Integer.valueOf(i));
        return this;
    }

    public final GroupableElementSpecImpl bindGroups(List<Integer> list) {
        this.bindingGroup.addAll(list);
        return this;
    }

    public final GroupableElementSpecImpl removeGroup(int i) {
        this.bindingGroup.remove(Integer.valueOf(i));
        return this;
    }

    public GroupableElementSpecImpl(int i, List<Integer> list) {
        this(i);
        this.bindingGroup.addAll(list);
    }
}
