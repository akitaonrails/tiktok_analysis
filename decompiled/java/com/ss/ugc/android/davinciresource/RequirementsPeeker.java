package com.ss.ugc.android.davinciresource;

import com.bef.effectsdk.RequirementResourceMapper;
import com.ss.ugc.android.davinciresource.jni.IRequirementsPeeker;
import com.ss.ugc.android.davinciresource.jni.VecString;
import java.util.Iterator;

/* JADX INFO: loaded from: classes35.dex */
public final class RequirementsPeeker extends IRequirementsPeeker {
    @Override // com.ss.ugc.android.davinciresource.jni.IRequirementsPeeker
    public VecString peekRequirements(VecString vecString) {
        int i = 0;
        if (vecString != null && !vecString.isEmpty()) {
            String[] strArr = new String[vecString.size()];
            Iterator<String> it2 = vecString.iterator();
            while (it2.hasNext()) {
                strArr[i] = it2.next();
                i++;
            }
            return new VecString(RequirementResourceMapper.nativePeekResourcesNeededByRequirements(strArr));
        }
        return new VecString();
    }
}
