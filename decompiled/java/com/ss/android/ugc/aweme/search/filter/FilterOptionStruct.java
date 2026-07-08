package com.ss.android.ugc.aweme.search.filter;

import X.C09CT;
import X.C13LP;
import X.C1697810uHb;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class FilterOptionStruct implements Serializable {

    @C09CT("collapsed")
    public String collapsed;

    @C09CT("option_list")
    public List<SubFilterOptionStruct> optionStructList;

    @C09CT("title")
    public String title;

    @C09CT("type")
    public String type;

    public final SubFilterOptionStruct getDefaultOption() {
        List<SubFilterOptionStruct> list = this.optionStructList;
        if (list != null) {
            return (SubFilterOptionStruct) C13LP.LJJJLL(list);
        }
        return null;
    }

    public final List<SubFilterOptionStruct> getOptionStuct() {
        List<SubFilterOptionStruct> list = this.optionStructList;
        if (list != null) {
            Iterator<SubFilterOptionStruct> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().setFilterOptionStruct(this);
            }
        }
        return this.optionStructList;
    }

    public final SubFilterOptionStruct getSelectOption() {
        List<SubFilterOptionStruct> list = this.optionStructList;
        SubFilterOptionStruct subFilterOptionStruct = null;
        if (list == null) {
            return null;
        }
        Iterator<SubFilterOptionStruct> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            SubFilterOptionStruct next = it2.next();
            if (next.isSelected()) {
                subFilterOptionStruct = next;
                break;
            }
        }
        return subFilterOptionStruct;
    }

    public final List<SubFilterOptionStruct> getSelectedOptions() {
        List<SubFilterOptionStruct> list = this.optionStructList;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (SubFilterOptionStruct subFilterOptionStruct : list) {
            if (subFilterOptionStruct.isSelected()) {
                arrayList.add(subFilterOptionStruct);
            }
        }
        return arrayList;
    }

    public final boolean isEmpty() {
        List<SubFilterOptionStruct> list = this.optionStructList;
        return list == null || list.isEmpty();
    }

    public final void reset() {
        List<SubFilterOptionStruct> list = this.optionStructList;
        if (list != null) {
            int i = 0;
            for (SubFilterOptionStruct subFilterOptionStruct : list) {
                int i2 = i + 1;
                if (i < 0) {
                    C1697810uHb.LJIJI();
                    throw null;
                }
                SubFilterOptionStruct subFilterOptionStruct2 = subFilterOptionStruct;
                if (subFilterOptionStruct2 != null) {
                    subFilterOptionStruct2.setSelected(i == 0);
                    subFilterOptionStruct2.setDefaultOption(i == 0);
                }
                i = i2;
            }
        }
    }

    public final String getCollapsed() {
        return this.collapsed;
    }

    public final List<SubFilterOptionStruct> getOptionStructList() {
        return this.optionStructList;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getType() {
        return this.type;
    }

    public final void selectOption(SubFilterOptionStruct subFilterOptionStruct) {
        List<SubFilterOptionStruct> list;
        if (subFilterOptionStruct != null && (list = this.optionStructList) != null) {
            int i = 0;
            for (SubFilterOptionStruct subFilterOptionStruct2 : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    SubFilterOptionStruct subFilterOptionStruct3 = subFilterOptionStruct2;
                    if (subFilterOptionStruct3 != null) {
                        subFilterOptionStruct3.setSelected(Intrinsics.LJFF(subFilterOptionStruct3, subFilterOptionStruct));
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
    }

    public final void selectOptions(List<SubFilterOptionStruct> list) {
        boolean z;
        List<SubFilterOptionStruct> list2 = this.optionStructList;
        if (list2 != null) {
            int i = 0;
            for (SubFilterOptionStruct subFilterOptionStruct : list2) {
                int i2 = i + 1;
                if (i >= 0) {
                    SubFilterOptionStruct subFilterOptionStruct2 = subFilterOptionStruct;
                    if ((list instanceof Collection) && list.isEmpty()) {
                        z = false;
                    } else {
                        Iterator<SubFilterOptionStruct> it2 = list.iterator();
                        while (it2.hasNext()) {
                            if (Intrinsics.LJFF(subFilterOptionStruct2, it2.next())) {
                                z = true;
                                break;
                            }
                        }
                        z = false;
                    }
                    subFilterOptionStruct2.setSelected(z);
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
    }

    public final void setCollapsed(String str) {
        this.collapsed = str;
    }

    public final void setOptionStructList(List<SubFilterOptionStruct> list) {
        this.optionStructList = list;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setType(String str) {
        this.type = str;
    }
}
