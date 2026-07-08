package com.ss.android.ugc.aweme.aigc;

import X.C15438062q;
import X.C546230LbZ;
import X.C546300Lbg;
import X.C546310Lbh;
import X.C547860LeC;
import X.InterfaceC1631620sYq;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.ss.android.ugc.aweme.aikit.api.camera.ability.EditService;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public final class EditServiceImpl implements EditService<VideoPublishEditModel, AwemeDraft, NLEEditor> {
    @Override // com.ss.android.ugc.aweme.aikit.api.camera.ability.EditService
    public final Integer LIZIZ(CreativeModel creativeModel) {
        Integer numValueOf;
        List<C546230LbZ> listLIZIZ = C546300Lbg.LIZIZ(creativeModel, false);
        ArrayList arrayList = new ArrayList();
        Iterator<C546230LbZ> it2 = listLIZIZ.iterator();
        while (it2.hasNext()) {
            C546310Lbh c546310LbhLIZLLL = it2.next().LIZLLL();
            if (c546310LbhLIZLLL != null && (numValueOf = Integer.valueOf(c546310LbhLIZLLL.LIZ)) != null) {
                arrayList.add(numValueOf);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        if (!arrayList.isEmpty()) {
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                if (((Number) it3.next()).intValue() == 0) {
                    return 0;
                }
            }
        }
        if (!arrayList.isEmpty()) {
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                if (((Number) it4.next()).intValue() == 2) {
                    return 2;
                }
            }
        }
        return 1;
    }

    @Override // com.ss.android.ugc.aweme.aikit.api.camera.ability.EditService
    public final Map<String, String> LIZJ(CreativeModel creativeModel) {
        Function1<CreativeModel, Map<String, String>> function1;
        Map<String, String> mapInvoke;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<C546230LbZ> listLIZIZ = C546300Lbg.LIZIZ(creativeModel, false);
        ArrayList<C546310Lbh> arrayList = new ArrayList(C15438062q.LJIJJ(listLIZIZ, 10));
        Iterator<C546230LbZ> it2 = listLIZIZ.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().LIZLLL());
        }
        for (C546310Lbh c546310Lbh : arrayList) {
            if (c546310Lbh != null && (function1 = c546310Lbh.LJFF) != null && (mapInvoke = function1.invoke(creativeModel)) != null) {
                linkedHashMap.putAll(mapInvoke);
            }
        }
        return linkedHashMap;
    }

    @Override // com.ss.android.ugc.aweme.aikit.api.camera.ability.EditService
    public final boolean LIZLLL(CreativeModel creativeModel) {
        List<C546230LbZ> listLIZIZ = C546300Lbg.LIZIZ(creativeModel, false);
        ArrayList<C546310Lbh> arrayList = new ArrayList(C15438062q.LJIJJ(listLIZIZ, 10));
        Iterator<C546230LbZ> it2 = listLIZIZ.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().LIZLLL());
        }
        for (C546310Lbh c546310Lbh : arrayList) {
            if (c546310Lbh != null && c546310Lbh.LJ) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.aikit.api.camera.ability.EditService
    public final boolean LJ(CreativeModel creativeModel) {
        List<C546230LbZ> listLIZIZ = C546300Lbg.LIZIZ(creativeModel, false);
        ArrayList<C546310Lbh> arrayList = new ArrayList(C15438062q.LJIJJ(listLIZIZ, 10));
        Iterator<C546230LbZ> it2 = listLIZIZ.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().LIZLLL());
        }
        for (C546310Lbh c546310Lbh : arrayList) {
            if (c546310Lbh != null && !c546310Lbh.LIZJ) {
                return false;
            }
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.aikit.api.camera.ability.EditService
    public final boolean LJI(CreativeModel creativeModel) {
        List<C546230LbZ> listLIZIZ = C546300Lbg.LIZIZ(creativeModel, false);
        ArrayList<C546310Lbh> arrayList = new ArrayList(C15438062q.LJIJJ(listLIZIZ, 10));
        Iterator<C546230LbZ> it2 = listLIZIZ.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().LIZLLL());
        }
        for (C546310Lbh c546310Lbh : arrayList) {
            if (c546310Lbh != null && c546310Lbh.LIZLLL) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.aikit.api.camera.ability.EditService
    public final boolean LJII(CreativeModel creativeModel) {
        Function1<CreativeModel, Boolean> function1;
        C547860LeC.LIZ.getClass();
        List<C546230LbZ> listLJFF = C547860LeC.LIZIZ().LJFF(false);
        ArrayList<C546310Lbh> arrayList = new ArrayList(C15438062q.LJIJJ(listLJFF, 10));
        Iterator<C546230LbZ> it2 = listLJFF.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().LIZLLL());
        }
        for (C546310Lbh c546310Lbh : arrayList) {
            if (c546310Lbh != null && (function1 = c546310Lbh.LJII) != null && function1.invoke(creativeModel).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.aikit.api.camera.ability.EditService
    public final boolean LJIIIIZZ(CreativeModel creativeModel) {
        Function1<CreativeModel, Boolean> function1;
        C547860LeC.LIZ.getClass();
        List<C546230LbZ> listLJFF = C547860LeC.LIZIZ().LJFF(false);
        ArrayList<C546310Lbh> arrayList = new ArrayList(C15438062q.LJIJJ(listLJFF, 10));
        Iterator<C546230LbZ> it2 = listLJFF.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().LIZLLL());
        }
        for (C546310Lbh c546310Lbh : arrayList) {
            if (c546310Lbh != null && (function1 = c546310Lbh.LJIIIIZZ) != null && function1.invoke(creativeModel).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.aikit.api.camera.ability.EditService
    public final boolean LJIIIZ(CreativeModel creativeModel) {
        Function1<CreativeModel, Boolean> function1;
        List<C546230LbZ> listLIZIZ = C546300Lbg.LIZIZ(creativeModel, false);
        ArrayList<C546310Lbh> arrayList = new ArrayList(C15438062q.LJIJJ(listLIZIZ, 10));
        Iterator<C546230LbZ> it2 = listLIZIZ.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().LIZLLL());
        }
        for (C546310Lbh c546310Lbh : arrayList) {
            if (c546310Lbh != null && (function1 = c546310Lbh.LJI) != null && !function1.invoke(creativeModel).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.aikit.api.camera.ability.EditService
    public final boolean LJIIJ(CreativeModel creativeModel) {
        List<C546230LbZ> listLIZIZ = C546300Lbg.LIZIZ(creativeModel, false);
        ArrayList<C546310Lbh> arrayList = new ArrayList(C15438062q.LJIJJ(listLIZIZ, 10));
        Iterator<C546230LbZ> it2 = listLIZIZ.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().LIZLLL());
        }
        for (C546310Lbh c546310Lbh : arrayList) {
            if (c546310Lbh != null && !c546310Lbh.LIZIZ) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x0226  */
    @Override // com.ss.android.ugc.aweme.aikit.api.camera.ability.EditService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(com.ss.android.ugc.aweme.draft.model.AwemeDraft r37, com.bytedance.ies.nle.editor_jni.NLEEditor r38, java.util.List r39) {
        /*
            Method dump skipped, instruction units count: 633
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.aigc.EditServiceImpl.LIZ(com.ss.android.ugc.aweme.draft.model.AwemeDraft, com.bytedance.ies.nle.editor_jni.NLEEditor, java.util.List):void");
    }

    @Override // com.ss.android.ugc.aweme.aikit.api.camera.ability.EditService
    public final void LJFF(CreativeModel creativeModel, int i, String str) {
        InterfaceC1631620sYq<CreativeModel, Integer, String, Unit> interfaceC1631620sYq;
        List<C546230LbZ> listLIZIZ = C546300Lbg.LIZIZ(creativeModel, false);
        ArrayList<C546310Lbh> arrayList = new ArrayList(C15438062q.LJIJJ(listLIZIZ, 10));
        Iterator<C546230LbZ> it2 = listLIZIZ.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().LIZLLL());
        }
        for (C546310Lbh c546310Lbh : arrayList) {
            if (c546310Lbh != null && (interfaceC1631620sYq = c546310Lbh.LJIIIZ) != null) {
                interfaceC1631620sYq.invoke(creativeModel, Integer.valueOf(i), str);
            }
        }
    }
}
