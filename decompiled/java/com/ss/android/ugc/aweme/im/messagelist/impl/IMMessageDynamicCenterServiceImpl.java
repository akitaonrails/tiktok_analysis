package com.ss.android.ugc.aweme.im.messagelist.impl;

import X.C09EF;
import X.C0Z2Z;
import X.C0ZDX;
import X.C0ZT0;
import X.C0ZT1;
import X.C2188811AlT;
import X.C869590Y9l;
import X.C900150ZSz;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.im.message.template.card.DynamicCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.dynamic.DynamicCardClientInfoComponent;
import com.ss.android.ugc.aweme.im.message.template.card.dynamic.DynamicInfoComponent;
import com.ss.android.ugc.aweme.im.messagelist.api.dynamic.IIMMessageDynamicCenterService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class IMMessageDynamicCenterServiceImpl implements IIMMessageDynamicCenterService {
    @Override // com.ss.android.ugc.aweme.im.messagelist.api.dynamic.IIMMessageDynamicCenterService
    public final void LIZ(C869590Y9l c869590Y9l) {
        DynamicCardTemplate dynamicCardTemplate;
        DynamicInfoComponent dynamicInfoComponent;
        DynamicCardClientInfoComponent dynamicCardClientInfoComponent;
        String str;
        long jLongValue;
        if (!C0ZDX.LJJIIZ(c869590Y9l) || (dynamicCardTemplate = (DynamicCardTemplate) C0Z2Z.LIZ(c869590Y9l, DynamicCardTemplate.class)) == null || (dynamicInfoComponent = dynamicCardTemplate.dynamicInfo) == null || (dynamicCardClientInfoComponent = dynamicInfoComponent.dynamicCardClientInfo) == null || (str = dynamicCardClientInfoComponent.resourceId) == null) {
            return;
        }
        if (Intrinsics.LJFF(dynamicCardClientInfoComponent.hideCard, Boolean.TRUE)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("hideCard is true, resourceId: ");
            sbLIZ.append(str);
            sbLIZ.append(' ');
            sbLIZ.append(c869590Y9l.getIndex());
            C2188811AlT.LIZIZ(sbLIZ);
            return;
        }
        C0ZT1 c0zt1LIZ = C0ZT0.LIZ(dynamicCardClientInfoComponent.resourceType);
        if (c0zt1LIZ != null) {
            long index = c869590Y9l.getIndex();
            C900150ZSz c900150ZSz = c0zt1LIZ.LIZ;
            Long l = c900150ZSz.LIZLLL.get(str);
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            if (jLongValue < index) {
                c900150ZSz.LIZLLL.put(str, Long.valueOf(index));
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("updateIndex: taskId ");
                sbLIZ2.append(str);
                sbLIZ2.append(" , index ");
                sbLIZ2.append(index);
                C2188811AlT.LIZIZ(sbLIZ2);
                Keva keva = c900150ZSz.LIZ;
                String str2 = c900150ZSz.LIZIZ;
                Gson gson = C09EF.LIZ;
                keva.storeString(str2, GsonProtectorUtils.toJson(gson, c900150ZSz.LIZLLL));
                if (!c900150ZSz.LJ.contains(str)) {
                    c900150ZSz.LJ.put(str, Long.valueOf(System.currentTimeMillis()));
                    c900150ZSz.LIZ.storeString(c900150ZSz.LIZJ, GsonProtectorUtils.toJson(gson, c900150ZSz.LJ));
                }
            }
        }
    }
}
