package com.ss.android.ugc.aweme.im.chatroom.common.titlebar.api;

import X.AbstractC738140SxQ;
import X.C0RTL;
import X.C0RUV;
import X.C0SZ4;
import X.C0SZ5;
import X.C1163440gNi;
import X.C1383370m6R;
import X.C13DA;
import X.C2188811AlT;
import X.C725010ScF;
import X.C913300ZsG;
import X.EnumC20623015mu;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes32.dex */
public abstract class BaseIMTitleBarAssem extends UISlotAssem {
    public static final Map<String, Integer> LLJJI;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.cqd;
    }

    public abstract void hp();

    static {
        C13DA c13da = new C13DA();
        c13da.put("SLOT_LEFT", Integer.valueOf(R.id.mjp));
        c13da.put("SLOT_CENTER", Integer.valueOf(R.id.dma));
        c13da.put("SLOT_RIGHT", Integer.valueOf(R.id.tks));
        LLJJI = c13da.build();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    /* JADX INFO: renamed from: do */
    public final void mo127do() {
        C0SZ4 c0sz4;
        String str;
        hp();
        for (C0RUV<? extends AbstractC738140SxQ> c0ruv : getConfig().LLIZ) {
            if ((c0ruv instanceof C0SZ4) && (str = (c0sz4 = (C0SZ4) c0ruv).LLILLJJLI) != null) {
                Integer num = LLJJI.get(str);
                if (num == null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(c0sz4.LLILLJJLI);
                    sbLIZ.append(" is not a valid ID");
                    throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
                }
                c0sz4.LLIZLLLIL = num.intValue();
            }
        }
        super.mo127do();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        super.onViewCreated(view);
        if (!C913300ZsG.LIZ.LIZ()) {
            view.setBackgroundColor(C1383370m6R.LJFF(R.attr.zm));
        }
    }

    public final void ip(EnumC20623015mu enumC20623015mu, Function1<? super C725010ScF, Unit> function1) {
        C725010ScF c725010ScF = new C725010ScF();
        function1.invoke(c725010ScF);
        if (((ArrayList) c725010ScF.LIZ).isEmpty()) {
            return;
        }
        List<C0RUV<? extends AbstractC738140SxQ>> list = getConfig().LLIZ;
        List<C0RTL> list2 = c725010ScF.LIZ;
        ArrayList arrayList = new ArrayList();
        for (Object obj : (ArrayList) list2) {
            if (obj instanceof C0SZ5) {
                C0SZ4 c0sz4 = (C0SZ4) obj;
                c0sz4.LLILLJJLI = enumC20623015mu.name();
                c0sz4.LLJIJIL = C1163440gNi.LIZJ;
                arrayList.add(c0sz4);
            }
        }
        list.addAll(arrayList);
    }
}
