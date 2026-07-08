package com.ss.android.ugc.aweme.search.filter;

import X.C09CT;
import X.C1697810uHb;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.text.u;

/* JADX INFO: loaded from: classes11.dex */
public final class ActivityOptionStruct implements Serializable {

    @C09CT("option_list")
    public List<SubSwitchStruct> optionStructList;

    @C09CT("title")
    public String title;

    public final List<SubSwitchStruct> getDefaultOptionStruct() {
        ArrayList arrayList = new ArrayList();
        List<SubSwitchStruct> list = this.optionStructList;
        if (list != null) {
            for (SubSwitchStruct subSwitchStruct : list) {
                SubSwitchStruct subSwitchStruct2 = new SubSwitchStruct();
                subSwitchStruct2.setDescription(subSwitchStruct.getDescription());
                subSwitchStruct2.setActivityOptionStruct(subSwitchStruct.getActivityOptionStruct());
                subSwitchStruct2.setSelected(false);
                subSwitchStruct2.setLogInfo(subSwitchStruct.getLogInfo());
                subSwitchStruct2.setName(subSwitchStruct.getName());
                subSwitchStruct2.setRequestKey(subSwitchStruct.getRequestKey());
                arrayList.add(subSwitchStruct2);
            }
        }
        return arrayList;
    }

    public final List<SubSwitchStruct> getOptionStuct() {
        List<SubSwitchStruct> list = this.optionStructList;
        if (list != null) {
            Iterator<SubSwitchStruct> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().setActivityOptionStruct(this);
            }
        }
        return this.optionStructList;
    }

    public final boolean isDefault() {
        List<SubSwitchStruct> list = this.optionStructList;
        if (list == null) {
            return false;
        }
        Iterator<SubSwitchStruct> it2 = list.iterator();
        while (it2.hasNext()) {
            if (it2.next().isSelected()) {
                return false;
            }
        }
        return true;
    }

    public final boolean isEmpty() {
        List<SubSwitchStruct> list = this.optionStructList;
        return list == null || list.isEmpty();
    }

    public final void reset() {
        List<SubSwitchStruct> list = this.optionStructList;
        if (list != null) {
            int i = 0;
            for (SubSwitchStruct subSwitchStruct : list) {
                int i2 = i + 1;
                if (i < 0) {
                    C1697810uHb.LJIJI();
                    throw null;
                }
                SubSwitchStruct subSwitchStruct2 = subSwitchStruct;
                if (subSwitchStruct2 != null) {
                    subSwitchStruct2.setSelected(false);
                }
                i = i2;
            }
        }
    }

    public final List<SubSwitchStruct> getActivitySelectOption() {
        return this.optionStructList;
    }

    public final List<SubSwitchStruct> getOptionStructList() {
        return this.optionStructList;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setLastOptionData(List<SubSwitchStruct> list) {
        SubSwitchStruct subSwitchStruct;
        if (list != null) {
            int i = 0;
            for (SubSwitchStruct subSwitchStruct2 : list) {
                int i2 = i + 1;
                String requestKey = null;
                if (i >= 0) {
                    SubSwitchStruct subSwitchStruct3 = subSwitchStruct2;
                    String requestKey2 = subSwitchStruct3.getRequestKey();
                    List<SubSwitchStruct> list2 = this.optionStructList;
                    if (list2 != null && (subSwitchStruct = (SubSwitchStruct) ListProtector.get(list2, i)) != null) {
                        requestKey = subSwitchStruct.getRequestKey();
                    }
                    if (u.LJIJI(requestKey2, requestKey, false)) {
                        ((SubSwitchStruct) ListProtector.get(this.optionStructList, i)).setSelected(subSwitchStruct3.isSelected());
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
    }

    public final void setOptionStructList(List<SubSwitchStruct> list) {
        this.optionStructList = list;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void selectOption(SubSwitchStruct subSwitchStruct, boolean z) {
        List<SubSwitchStruct> list;
        if (subSwitchStruct != null && (list = this.optionStructList) != null) {
            for (SubSwitchStruct subSwitchStruct2 : list) {
                if (u.LJIJI(subSwitchStruct2.getRequestKey(), subSwitchStruct.getRequestKey(), false)) {
                    subSwitchStruct2.setSelected(z);
                    return;
                }
            }
        }
    }
}
