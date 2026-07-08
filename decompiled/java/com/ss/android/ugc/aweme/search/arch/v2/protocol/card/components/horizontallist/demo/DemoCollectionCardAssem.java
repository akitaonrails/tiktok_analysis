package com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.horizontallist.demo;

import X.C0QSJ;
import X.C673150Qan;
import X.C687700QyG;
import X.InterfaceC1146704e9;
import X.InterfaceC652300PiG;
import X.InterfaceC652810Pj5;
import X.InterfaceC687730QyJ;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.horizontallist.communication.SearchHorizontalListScope;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class DemoCollectionCardAssem extends ReusedUISlotAssem<DemoCollectionCardAssem> implements C0QSJ, InterfaceC1146704e9 {
    public InterfaceC652300PiG LLJJLIIIJLLLLLLLZ;
    public InterfaceC652810Pj5 LLJL;
    public List<InterfaceC687730QyJ> LLJLIL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.f1h;
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        if (cls == InterfaceC652300PiG.class) {
            this.LLJJLIIIJLLLLLLLZ = (InterfaceC652300PiG) obj;
        } else if (cls == InterfaceC652810Pj5.class) {
            this.LLJL = (InterfaceC652810Pj5) obj;
            C687700QyG.LJFF(this, this.LLJLIL, obj, cls);
        }
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{SearchHorizontalListScope.class, SearchHorizontalListScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        if (cls == InterfaceC652300PiG.class) {
            return this.LLJJLIIIJLLLLLLLZ;
        }
        if (cls == InterfaceC652810Pj5.class) {
            return this.LLJL;
        }
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SearchHorizontalListScope.class);
        arrayList.add(SearchHorizontalListScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SearchHorizontalListScope.class);
        return arrayList;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        if (cls == InterfaceC652300PiG.class) {
            this.LLJJLIIIJLLLLLLLZ = null;
        } else if (cls == InterfaceC652810Pj5.class) {
            this.LLJL = null;
        }
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
        List<InterfaceC687730QyJ> list = this.LLJLIL;
        if (list == null) {
            return;
        }
        ((ArrayList) list).remove(interfaceC687730QyJ);
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
        if (this.LLJLIL == null) {
            this.LLJLIL = new ArrayList();
        }
        ((ArrayList) this.LLJLIL).add(interfaceC687730QyJ);
    }
}
