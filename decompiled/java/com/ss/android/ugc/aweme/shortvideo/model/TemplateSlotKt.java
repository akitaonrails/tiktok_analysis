package com.ss.android.ugc.aweme.shortvideo.model;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class TemplateSlotKt {
    public static final boolean getHasMaterialTypeConstraints(List<TemplateSlot> list) {
        if (list == null || list.isEmpty()) {
            return false;
        }
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<TemplateSlot> it2 = list.iterator();
        while (it2.hasNext()) {
            if (getHasMaterialTypeConstraints(it2.next())) {
                return true;
            }
        }
        return false;
    }

    public static final String getMaterialType(TemplateSlot templateSlot) {
        if (Intrinsics.LJFF(templateSlot.isReverseVideo(), Boolean.TRUE)) {
            return TemplateSlot.Companion.getMATERIAL_TYPE_VIDEO();
        }
        if (isUsingMagic(templateSlot)) {
            String magicSupportType = templateSlot.getMagicSupportType();
            if (Intrinsics.LJFF(magicSupportType, "1")) {
                return TemplateSlot.Companion.getMATERIAL_TYPE_IMG();
            }
            if (Intrinsics.LJFF(magicSupportType, "2")) {
                return TemplateSlot.Companion.getMATERIAL_TYPE_VIDEO();
            }
            return templateSlot.getMagicSupportType();
        }
        int limitMaterialType = templateSlot.getLimitMaterialType();
        if (limitMaterialType != 1) {
            if (limitMaterialType != 2) {
                return templateSlot.getOriginMaterialType();
            }
            return TemplateSlot.Companion.getMATERIAL_TYPE_VIDEO();
        }
        return TemplateSlot.Companion.getMATERIAL_TYPE_IMG();
    }

    public static final boolean isUsingFreeze(TemplateSlot templateSlot) {
        boolean z;
        String freezeGroup = templateSlot.getFreezeGroup();
        if (freezeGroup != null && freezeGroup.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        return !z;
    }

    public static final boolean isUsingMagic(List<TemplateSlot> list) {
        if (list == null || list.isEmpty()) {
            return false;
        }
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<TemplateSlot> it2 = list.iterator();
        while (it2.hasNext()) {
            if (isUsingMagic(it2.next())) {
                return true;
            }
        }
        return false;
    }

    public static final boolean isUsingReverse(List<TemplateSlot> list) {
        if (list == null || list.isEmpty()) {
            return false;
        }
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<TemplateSlot> it2 = list.iterator();
        while (it2.hasNext()) {
            if (Intrinsics.LJFF(it2.next().isReverseVideo(), Boolean.TRUE)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean getHasMaterialTypeConstraints(TemplateSlot templateSlot) {
        if (!isUsingFreeze(templateSlot) && !isUsingMagic(templateSlot) && !Intrinsics.LJFF(templateSlot.isReverseVideo(), Boolean.TRUE) && templateSlot.getLimitMaterialType() == 0) {
            return false;
        }
        return true;
    }

    public static final boolean isUsingMagic(TemplateSlot templateSlot) {
        if (Intrinsics.LJFF(templateSlot.getGameplaySource(), "magic")) {
            return true;
        }
        String magicSupportType = templateSlot.getMagicSupportType();
        if (magicSupportType != null && magicSupportType.length() != 0) {
            return true;
        }
        return false;
    }
}
