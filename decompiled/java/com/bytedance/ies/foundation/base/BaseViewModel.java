package com.bytedance.ies.foundation.base;

import X.C01GW;
import X.C04TD;
import X.C06W2;
import X.C06W3;
import X.C06W4;
import X.C13BV;
import X.C19D8;
import X.C19D9;
import X.C19DE;
import X.C21152317q5;
import X.C21172317tJ;
import X.C452501pT;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.utils.BaseConfigConverter;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes33.dex */
public class BaseViewModel extends ViewModel implements C06W2 {
    public final C01GW LL = C452501pT.LIZIZ(new C19D9());
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new C19D8());
    public volatile boolean LLILLL;

    public final void init() {
        if (!this.LLILLL) {
            List<C19DE> listXQ2 = xQ2();
            ((List) vQ2().LIZ.getValue()).addAll(listXQ2);
            Iterator<C19DE> it2 = listXQ2.iterator();
            while (it2.hasNext()) {
                it2.next().LL = vQ2();
            }
            this.LLILLL = true;
        }
    }

    public final C21152317q5 vQ2() {
        return (C21152317q5) this.LLILLJJLI.getValue();
    }

    public final C21172317tJ wQ2() {
        return (C21172317tJ) this.LL.getValue();
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        C21152317q5 c21152317q5VQ2 = vQ2();
        c21152317q5VQ2.LIZ().clear();
        ((List) c21152317q5VQ2.LIZ.getValue()).clear();
    }

    public List<C19DE> xQ2() {
        return C13BV.INSTANCE;
    }

    @Override // X.C06W2
    public final void Dw2(Function0<? extends C06W4> function0) {
        IBaseConfigConverter iBaseConfigConverter;
        C06W3 c06w3LIZ;
        C06W4 c06w4Invoke = function0.invoke();
        if (c06w4Invoke instanceof C06W3) {
            c06w3LIZ = (C06W3) c06w4Invoke;
        } else {
            Object objLIZ = C04TD.LIZ(IBaseConfigConverter.class, false);
            if (objLIZ != null) {
                iBaseConfigConverter = (IBaseConfigConverter) objLIZ;
            } else {
                if (C04TD.T5 == null) {
                    synchronized (IBaseConfigConverter.class) {
                        if (C04TD.T5 == null) {
                            C04TD.T5 = new BaseConfigConverter();
                        }
                    }
                }
                iBaseConfigConverter = C04TD.T5;
            }
            c06w3LIZ = iBaseConfigConverter.LIZ(c06w4Invoke);
        }
        if (c06w3LIZ != null) {
            vQ2().LIZIZ(c06w3LIZ);
        }
    }
}
