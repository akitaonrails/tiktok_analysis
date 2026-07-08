package com.ss.android.ugc.aweme.im.service.utils;

import X.C0IE6;
import X.C1322110kVd;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import u4.q0;

/* JADX INFO: loaded from: classes7.dex */
public final class AccessibilityUtils implements IAccessibilityUtils {
    @Override // com.ss.android.ugc.aweme.im.service.utils.IAccessibilityUtils
    public final void LIZ(C1322110kVd c1322110kVd, IMContact iMContact) {
        if (c1322110kVd != null && iMContact != null) {
            q0.LJIJ(c1322110kVd, new C0IE6(iMContact, 3));
        }
    }
}
