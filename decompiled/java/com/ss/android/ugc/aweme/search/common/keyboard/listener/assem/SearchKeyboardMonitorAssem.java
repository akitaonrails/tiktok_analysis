package com.ss.android.ugc.aweme.search.common.keyboard.listener.assem;

import X.AbstractC738140SxQ;
import X.C0QOB;
import X.C14JJ;
import X.C14K4;
import X.C19EG;
import X.C20246014Ju;
import X.C669990QPt;
import X.C687700QyG;
import X.C724240Sb0;
import X.InterfaceC1146704e9;
import X.InterfaceC665370Q7z;
import X.InterfaceC670010QPv;
import X.InterfaceC737790Swr;
import android.view.View;
import android.view.Window;
import com.ss.android.ugc.aweme.search.common.keyboard.listener.assem.SearchKeyboardMonitorAssem;
import com.ss.android.ugc.aweme.search.middle.SearchResultFragmentScope;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import u4.q0;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchKeyboardMonitorAssem extends AbstractC738140SxQ implements C0QOB, InterfaceC737790Swr, InterfaceC1146704e9 {
    public final SearchKeyboardMonitorAssem LL = this;
    public final CopyOnWriteArrayList<InterfaceC670010QPv> LLILLJJLI = new CopyOnWriteArrayList<>();
    public Integer LLILLL;

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{SearchResultFragmentScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SearchResultFragmentScope.class);
        return arrayList;
    }

    @Override // X.C0QOB
    public final C669990QPt Rf() {
        Window window;
        View decorView;
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        return (c19egLIZ == null || (window = c19egLIZ.getWindow()) == null || (decorView = window.getDecorView()) == null) ? new C669990QPt(false, 0) : bo(decorView);
    }

    @Override // X.AbstractC738140SxQ
    public final void onCreate() {
        Window window;
        final View decorView;
        super.onCreate();
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ == null || (window = c19egLIZ.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        q0.LJJII(decorView, new C14JJ() { // from class: X.0QPu
            @Override // X.C14JJ
            public final void LIZ(C14JM c14jm) {
                SearchKeyboardMonitorAssem searchKeyboardMonitorAssem = this.LLILLL;
                View view = decorView;
                searchKeyboardMonitorAssem.getClass();
                C669990QPt c669990QPtBo = SearchKeyboardMonitorAssem.bo(view);
                if (c669990QPtBo.LIZ) {
                    this.LLILLL.LLILLL = Integer.valueOf(c669990QPtBo.LIZIZ);
                    if (((Boolean) C304290BwJ.LIZJ.getValue()).booleanValue()) {
                        C1970307nh.LIZ(1.0f);
                    }
                }
                Iterator<InterfaceC670010QPv> it2 = this.LLILLL.LLILLJJLI.iterator();
                while (it2.hasNext()) {
                    it2.next().LIZ(c669990QPtBo);
                }
            }

            @Override // X.C14JJ
            public final void LIZIZ(C14JM c14jm) {
                SearchKeyboardMonitorAssem searchKeyboardMonitorAssem = this.LLILLL;
                View view = decorView;
                searchKeyboardMonitorAssem.getClass();
                C669990QPt c669990QPtBo = SearchKeyboardMonitorAssem.bo(view);
                Iterator<InterfaceC670010QPv> it2 = this.LLILLL.LLILLJJLI.iterator();
                while (it2.hasNext()) {
                    it2.next().LIZJ(c669990QPtBo);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // X.C14JJ
            public final C20246014Ju LIZJ(C20246014Ju c20246014Ju, List<C14JM> list) {
                C14JM next;
                Iterator<C14JM> it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if ((next.LIZ() & 8) != 0) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                C14JM c14jm = next;
                if (c14jm == null) {
                    return c20246014Ju;
                }
                float fLIZJ = c14jm.LIZ.LIZJ();
                Iterator<InterfaceC670010QPv> it3 = this.LLILLL.LLILLJJLI.iterator();
                while (it3.hasNext()) {
                    it3.next().onProgress(fLIZJ);
                }
                return c20246014Ju;
            }

            @Override // X.C14JJ
            public final C14JL LIZLLL(C14JM c14jm, C14JL c14jl) {
                SearchKeyboardMonitorAssem searchKeyboardMonitorAssem = this.LLILLL;
                View view = decorView;
                searchKeyboardMonitorAssem.getClass();
                C669990QPt c669990QPtBo = SearchKeyboardMonitorAssem.bo(view);
                if (((Boolean) C304290BwJ.LIZJ.getValue()).booleanValue() && c669990QPtBo.LIZ) {
                    C1970307nh.LIZ(((Number) C07J0.LIZIZ.getValue()).floatValue());
                }
                Iterator<InterfaceC670010QPv> it2 = this.LLILLL.LLILLJJLI.iterator();
                while (it2.hasNext()) {
                    it2.next().LIZIZ(c669990QPtBo);
                }
                return c14jl;
            }
        });
    }

    @Override // X.AbstractC738140SxQ
    public final void onDestroy() {
        Window window;
        View decorView;
        super.onDestroy();
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null && (window = c19egLIZ.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            q0.LJJII(decorView, null);
        }
        this.LLILLJJLI.clear();
    }

    @Override // X.C0QOB
    public final Integer LLZ() {
        return this.LLILLL;
    }

    public static C669990QPt bo(View view) {
        C20246014Ju c20246014JuLIZ = C14K4.LIZ(view);
        if (c20246014JuLIZ != null) {
            return new C669990QPt(c20246014JuLIZ.LJIIIIZZ(8), c20246014JuLIZ.LIZ(8).LIZLLL);
        }
        return new C669990QPt(false, 0);
    }

    @Override // X.C0QOB
    public final void S0(InterfaceC670010QPv interfaceC670010QPv) {
        this.LLILLJJLI.add(interfaceC670010QPv);
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{SearchResultFragmentScope.class}).unbindAbility(this.LL, C0QOB.class);
    }

    @Override // X.C0QOB
    public final void cb(InterfaceC670010QPv interfaceC670010QPv) {
        this.LLILLJJLI.remove(interfaceC670010QPv);
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{SearchResultFragmentScope.class}).bindAbility(this.LL, C0QOB.class);
    }
}
