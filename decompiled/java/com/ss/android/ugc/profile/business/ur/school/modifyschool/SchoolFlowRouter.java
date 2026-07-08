package com.ss.android.ugc.profile.business.ur.school.modifyschool;

import X.AbstractC848400XPy;
import X.C0DN4;
import X.C0DN8;
import X.C0XQ7;
import X.C1245830iWb;
import X.C1245860iWe;
import X.C1388190mED;
import X.C19EG;
import X.C23250099c;
import X.EnumC1231460i9Q;
import X.EnumC338580DPc;
import X.EnumC338600DPe;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.router.route.IRouteAction;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.ur.school.service.SchoolFlowLauncher;
import com.ss.android.ugc.ur.school.service.UserCampusService;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: loaded from: classes5.dex */
public final class SchoolFlowRouter implements IRouteAction {
    @Override // com.bytedance.router.route.IRouteAction
    public final Object open(Context context, String str, Bundle bundle) {
        boolean z;
        String string;
        String string2;
        C19EG c19egLIZIZ;
        EnumC338580DPc enumC338580DPc;
        EnumC338600DPe enumC338600DPe;
        if (bundle != null) {
            String string3 = bundle.getString("enter_from");
            if (bundle != null) {
                z = bundle.getBoolean("skip_fsfp");
                string = bundle.getString("insert_aweme_id");
                string2 = bundle.getString("tab");
            } else {
                z = false;
                string = null;
                string2 = null;
            }
            if (string3 != null && string3.length() != 0) {
                String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
                SchoolFlowLauncher schoolFlowLauncher = (SchoolFlowLauncher) PluggableExtentionKt.pluggableSpi$default(SchoolFlowLauncher.class, false, false, false, 14, null);
                UserCampusService userCampusService = (UserCampusService) PluggableExtentionKt.pluggableSpi$default(UserCampusService.class, false, false, false, 14, null);
                if (userCampusService != null) {
                    userCampusService.LIZLLL(curUserId, userCampusService.LIZIZ(curUserId), C0DN8.INTO_MEMORY);
                }
                if (context != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
                    if (schoolFlowLauncher != null) {
                        if (str != null && u.LJJIIJZLJL(str, "aweme://user/school/edit_school", false)) {
                            enumC338580DPc = EnumC338580DPc.EDIT_SCHOOL;
                        } else {
                            enumC338580DPc = EnumC338580DPc.FIND_SCHOOL_FRIENDS;
                        }
                        if (string2 != null) {
                            EnumC338600DPe[] enumC338600DPeArrValues = EnumC338600DPe.values();
                            int length = enumC338600DPeArrValues.length;
                            for (int i = 0; i < length; i++) {
                                enumC338600DPe = enumC338600DPeArrValues[i];
                                if (Intrinsics.LJFF(enumC338600DPe.getValue(), string2)) {
                                    break;
                                }
                            }
                            enumC338600DPe = null;
                            schoolFlowLauncher.LIZ(c19egLIZIZ, new C1245830iWb(enumC338580DPc, new C1245860iWe(EnumC1231460i9Q.EXTERNAL, string3, null), z, enumC338600DPe, string, null, false, 96));
                        } else {
                            enumC338600DPe = null;
                            schoolFlowLauncher.LIZ(c19egLIZIZ, new C1245830iWb(enumC338580DPc, new C1245860iWe(EnumC1231460i9Q.EXTERNAL, string3, null), z, enumC338600DPe, string, null, false, 96));
                        }
                    }
                    C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(c19egLIZIZ), null, null, new C0DN4(userCampusService, curUserId, null), 3);
                }
                return null;
            }
        }
        throw new IllegalArgumentException("The enter from param must be passed to router");
    }
}
