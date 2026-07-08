package com.ss.android.ugc.aweme.mvtheme;

import X.C09CT;
import X.C13LP;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class BirthdayBlessMvParam implements Serializable {

    @C09CT("template_items")
    public final List<BirthdayEffectTemplate> templateItems;

    public final int getTemplateCount() {
        return this.templateItems.size();
    }

    public BirthdayBlessMvParam(List<BirthdayEffectTemplate> list) {
        this.templateItems = list;
    }

    public final BirthdayEffectTemplate getCurrentTemplate(String str) {
        BirthdayEffectTemplate next;
        Iterator<BirthdayEffectTemplate> it2 = this.templateItems.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.effectId, str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        return next;
    }

    public final BirthdayEffectTemplate getNextTemplate(String str) {
        int iNextIndex;
        List<BirthdayEffectTemplate> list = this.templateItems;
        ListIterator<BirthdayEffectTemplate> listIterator = list.listIterator(list.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                if (Intrinsics.LJFF(listIterator.previous().effectId, str)) {
                    iNextIndex = listIterator.nextIndex();
                    break;
                }
            } else {
                iNextIndex = -1;
                break;
            }
        }
        BirthdayEffectTemplate birthdayEffectTemplate = (BirthdayEffectTemplate) C13LP.LJJJLZIJ(iNextIndex + 1, this.templateItems);
        if (birthdayEffectTemplate == null) {
            return (BirthdayEffectTemplate) C13LP.LJJJLL(this.templateItems);
        }
        return birthdayEffectTemplate;
    }
}
