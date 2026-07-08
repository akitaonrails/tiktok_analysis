package com.ss.android.ugc.aweme.aigc;

import X.C13BV;
import X.C15438062q;
import X.C1895707bf;
import X.C546230LbZ;
import X.C546300Lbg;
import X.C547860LeC;
import X.C547940LeK;
import X.C547950LeL;
import X.C547960LeM;
import com.ss.android.ugc.aweme.aikit.api.camera.ability.PublishService;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.aigc.AICrtInfo;
import com.ss.android.ugc.aweme.creative.model.common.InputBlock;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS306S0000000_22;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class PublishServiceImpl implements PublishService {
    @Override // com.ss.android.ugc.aweme.aikit.api.camera.ability.PublishService
    public final boolean LIZ(CreativeModel creativeModel) {
        Boolean boolInvoke;
        C1895707bf c1895707bf;
        Function1<CreativeModel, Boolean> function1;
        if (creativeModel == null) {
            return false;
        }
        Iterator<C546230LbZ> it2 = C546300Lbg.LIZIZ(creativeModel, false).iterator();
        while (it2.hasNext()) {
            C547940LeK c547940LeKLJFF = it2.next().LJFF();
            if (c547940LeKLJFF != null && (c1895707bf = c547940LeKLJFF.LJIIJJI) != null && (function1 = c1895707bf.LIZ) != null) {
                boolInvoke = function1.invoke(creativeModel);
            } else {
                boolInvoke = null;
            }
            if (Intrinsics.LJFF(boolInvoke, Boolean.TRUE)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.aikit.api.camera.ability.PublishService
    public final List<C547950LeL> LIZIZ(List<String> list) {
        C547950LeL c547950LeL;
        C547860LeC.LIZ.getClass();
        List<C546230LbZ> listLJFF = C547860LeC.LIZIZ().LJFF(true);
        if (listLJFF != null) {
            ArrayList arrayList = new ArrayList();
            for (C546230LbZ c546230LbZ : listLJFF) {
                if (list.contains(c546230LbZ.LIZ.getTag())) {
                    arrayList.add(c546230LbZ);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C547940LeK c547940LeKLJFF = ((C546230LbZ) it2.next()).LJFF();
                if (c547940LeKLJFF != null && (c547950LeL = c547940LeKLJFF.LJIIIZ) != null) {
                    arrayList2.add(c547950LeL);
                }
            }
            return arrayList2;
        }
        return C13BV.INSTANCE;
    }

    @Override // com.ss.android.ugc.aweme.aikit.api.camera.ability.PublishService
    public final void LIZJ(CreativeModel creativeModel) {
        Function1<CreativeModel, Unit> function1;
        Iterator<C546230LbZ> it2 = C546300Lbg.LIZIZ(creativeModel, false).iterator();
        while (it2.hasNext()) {
            C547940LeK c547940LeKLJFF = it2.next().LJFF();
            if (c547940LeKLJFF != null && (function1 = c547940LeKLJFF.LJIIL) != null) {
                function1.invoke(creativeModel);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.aikit.api.camera.ability.PublishService
    public final boolean LJ(CreativeModel creativeModel) {
        Function1<CreativeModel, Boolean> function1;
        Iterator<C546230LbZ> it2 = C546300Lbg.LIZIZ(creativeModel, false).iterator();
        while (it2.hasNext()) {
            C547940LeK c547940LeKLJFF = it2.next().LJFF();
            if (c547940LeKLJFF != null && (function1 = c547940LeKLJFF.LIZLLL) != null && function1.invoke(creativeModel).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.aikit.api.camera.ability.PublishService
    public final List<String> LJFF(CreativeModel creativeModel) {
        C547950LeL c547950LeL;
        List<C546230LbZ> listLIZIZ = C546300Lbg.LIZIZ(creativeModel, false);
        ArrayList arrayList = new ArrayList();
        for (C546230LbZ c546230LbZ : listLIZIZ) {
            C547940LeK c547940LeKLJFF = c546230LbZ.LJFF();
            if (c547940LeKLJFF != null && (c547950LeL = c547940LeKLJFF.LJIIIZ) != null && c547950LeL.LIZIZ) {
                arrayList.add(c546230LbZ);
            }
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((C546230LbZ) it2.next()).LIZ.getTag());
        }
        return arrayList2;
    }

    @Override // com.ss.android.ugc.aweme.aikit.api.camera.ability.PublishService
    public final List<AICrtInfo> LJI(CreativeModel creativeModel) {
        Function1<CreativeModel, List<AICrtInfo>> function1;
        List<AICrtInfo> listInvoke;
        ArrayList arrayList = new ArrayList();
        Iterator<C546230LbZ> it2 = C546300Lbg.LIZIZ(creativeModel, false).iterator();
        while (it2.hasNext()) {
            C547940LeK c547940LeKLJFF = it2.next().LJFF();
            if (c547940LeKLJFF != null && (function1 = c547940LeKLJFF.LJI) != null && (listInvoke = function1.invoke(creativeModel)) != null) {
                arrayList.addAll(listInvoke);
            }
        }
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.aikit.api.camera.ability.PublishService
    public final boolean LJII(Aweme aweme) {
        Boolean boolInvoke;
        C1895707bf c1895707bf;
        Function1<Aweme, Boolean> function1;
        if (aweme == null) {
            return false;
        }
        C547860LeC.LIZ.getClass();
        List<C546230LbZ> listLJFF = C547860LeC.LIZIZ().LJFF(false);
        if (listLJFF != null) {
            Iterator<C546230LbZ> it2 = listLJFF.iterator();
            while (it2.hasNext()) {
                C547940LeK c547940LeKLJFF = it2.next().LJFF();
                if (c547940LeKLJFF != null && (c1895707bf = c547940LeKLJFF.LJIIJJI) != null && (function1 = c1895707bf.LIZIZ) != null) {
                    boolInvoke = function1.invoke(aweme);
                } else {
                    boolInvoke = null;
                }
                if (Intrinsics.LJFF(boolInvoke, Boolean.TRUE)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.aikit.api.camera.ability.PublishService
    public final List<String> LJIIIZ(CreativeModel creativeModel) {
        Function1<CreativeModel, String> function1;
        String strInvoke;
        ArrayList arrayList = new ArrayList();
        Iterator<C546230LbZ> it2 = C546300Lbg.LIZIZ(creativeModel, false).iterator();
        while (it2.hasNext()) {
            C547940LeK c547940LeKLJFF = it2.next().LJFF();
            if (c547940LeKLJFF != null && (function1 = c547940LeKLJFF.LJ) != null && (strInvoke = function1.invoke(creativeModel)) != null && strInvoke.length() > 0) {
                arrayList.add(strInvoke);
            }
        }
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.aikit.api.camera.ability.PublishService
    public final List<String> LJIIJ(Aweme aweme) {
        C547950LeL c547950LeL;
        Function1<Aweme, Boolean> function1;
        C547860LeC.LIZ.getClass();
        List<C546230LbZ> listLJFF = C547860LeC.LIZIZ().LJFF(true);
        if (listLJFF != null) {
            ArrayList arrayList = new ArrayList();
            for (C546230LbZ c546230LbZ : listLJFF) {
                C547940LeK c547940LeKLJFF = c546230LbZ.LJFF();
                if (c547940LeKLJFF != null && (c547950LeL = c547940LeKLJFF.LJIIIZ) != null && (function1 = c547950LeL.LIZLLL) != null && function1.invoke(aweme).booleanValue()) {
                    arrayList.add(c546230LbZ);
                }
            }
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((C546230LbZ) it2.next()).LIZ.getTag());
            }
            return arrayList2;
        }
        return C13BV.INSTANCE;
    }

    @Override // com.ss.android.ugc.aweme.aikit.api.camera.ability.PublishService
    public final Map<String, String> LJIIJJI(CreativeModel creativeModel) {
        Function1<CreativeModel, Map<String, String>> function1;
        Map<String, String> mapInvoke;
        HashMap map = new HashMap();
        Iterator<C546230LbZ> it2 = C546300Lbg.LIZIZ(creativeModel, false).iterator();
        while (it2.hasNext()) {
            C547940LeK c547940LeKLJFF = it2.next().LJFF();
            if (c547940LeKLJFF != null && (function1 = c547940LeKLJFF.LJFF) != null && (mapInvoke = function1.invoke(creativeModel)) != null) {
                map.putAll(mapInvoke);
            }
        }
        return map;
    }

    @Override // com.ss.android.ugc.aweme.aikit.api.camera.ability.PublishService
    public final List<InputBlock> LJIIL(CreativeModel creativeModel) {
        List<InputBlock> listInvoke;
        C547940LeK c547940LeKLJFF;
        Function1<CreativeModel, List<InputBlock>> function1;
        Iterator<C546230LbZ> it2 = C546300Lbg.LIZIZ(creativeModel, false).iterator();
        while (true) {
            listInvoke = null;
            if (!it2.hasNext() || ((c547940LeKLJFF = it2.next().LJFF()) != null && (function1 = c547940LeKLJFF.LIZJ) != null && (listInvoke = function1.invoke(creativeModel)) != null && !listInvoke.isEmpty())) {
                break;
            }
        }
        return listInvoke;
    }

    @Override // com.ss.android.ugc.aweme.aikit.api.camera.ability.PublishService
    public final boolean LJIILIIL(CreativeModel creativeModel) {
        Iterator<C546230LbZ> it2 = C546300Lbg.LIZIZ(creativeModel, false).iterator();
        while (it2.hasNext()) {
            C547940LeK c547940LeKLJFF = it2.next().LJFF();
            if (c547940LeKLJFF != null && !c547940LeKLJFF.LIZ) {
                return false;
            }
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.aikit.api.camera.ability.PublishService
    public final boolean LJIILJJIL(CreativeModel creativeModel) {
        C547950LeL c547950LeL;
        List<C546230LbZ> listLIZIZ = C546300Lbg.LIZIZ(creativeModel, false);
        ArrayList<C547950LeL> arrayList = new ArrayList();
        Iterator<C546230LbZ> it2 = listLIZIZ.iterator();
        while (it2.hasNext()) {
            C547940LeK c547940LeKLJFF = it2.next().LJFF();
            if (c547940LeKLJFF != null && (c547950LeL = c547940LeKLJFF.LJIIIZ) != null) {
                arrayList.add(c547950LeL);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        for (C547950LeL c547950LeL2 : arrayList) {
            if (c547950LeL2.LIZ && c547950LeL2.LIZIZ) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.aikit.api.camera.ability.PublishService
    public final void LIZLLL(CreativeModel creativeModel, int i) {
        Function2<CreativeModel, Integer, Unit> function2;
        Iterator<C546230LbZ> it2 = C546300Lbg.LIZIZ(creativeModel, false).iterator();
        while (it2.hasNext()) {
            C547940LeK c547940LeKLJFF = it2.next().LJFF();
            if (c547940LeKLJFF != null && (function2 = c547940LeKLJFF.LJIIIIZZ) != null) {
                function2.invoke(creativeModel, Integer.valueOf(i));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.aikit.api.camera.ability.PublishService
    public final List LJIIIIZZ(CreativeModel creativeModel, AFwS306S0000000_22 aFwS306S0000000_22) {
        CreateAnchorInfo createAnchorInfoInvoke;
        C547960LeM c547960LeM;
        List<C546230LbZ> listLIZIZ = C546300Lbg.LIZIZ(creativeModel, false);
        ArrayList<C547960LeM> arrayList = new ArrayList();
        Iterator<C546230LbZ> it2 = listLIZIZ.iterator();
        while (it2.hasNext()) {
            C547940LeK c547940LeKLJFF = it2.next().LJFF();
            if (c547940LeKLJFF != null && (c547960LeM = c547940LeKLJFF.LJIIJ) != null) {
                arrayList.add(c547960LeM);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (C547960LeM c547960LeM2 : arrayList) {
            Function2<CreativeModel, String, CreateAnchorInfo> function2 = c547960LeM2.LIZJ;
            if (function2 != null && (createAnchorInfoInvoke = function2.invoke(creativeModel, (String) aFwS306S0000000_22.invoke(c547960LeM2.LIZ, c547960LeM2.LIZIZ))) != null) {
                arrayList2.add(createAnchorInfoInvoke);
            }
        }
        return arrayList2;
    }
}
