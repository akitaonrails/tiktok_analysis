package com.bytedance.lobby.internal;

import X.C1ATS;
import X.C1AWP;
import X.C2188811AlT;
import X.C2277811EDr;
import X.C833690Wn9;
import android.app.Application;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes34.dex */
public abstract class BaseProvider<T> extends BaseViewModel<T> implements C1ATS {
    public final AtomicBoolean LLILLJJLI;
    public final C2277811EDr LLILLL;

    @Override // X.C1ATS
    public final void nB1() {
    }

    public abstract void onCreate();

    @Override // X.C1ATS
    public final void init() {
        if (this.LLILLJJLI.compareAndSet(false, true)) {
            if (C833690Wn9.LIZ) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Initializing ");
                sbLIZ.append(this.LLILLL.LIZIZ);
                sbLIZ.append(" (lazy)");
                C2188811AlT.LIZIZ(sbLIZ);
            }
            onCreate();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public boolean isAvailable() {
        String str = this.LLILLL.LIZIZ;
        str.getClass();
        switch (str.hashCode()) {
            case -1240244679:
                if (str.equals("google")) {
                    return C1AWP.LIZ;
                }
                return false;
            case 3321844:
                if (str.equals("line")) {
                    return C1AWP.LIZJ;
                }
                return false;
            case 486515695:
                if (str.equals("kakaotalk")) {
                    return C1AWP.LIZLLL;
                }
                return false;
            case 497130182:
                if (str.equals("facebook")) {
                    return C1AWP.LIZIZ;
                }
                return false;
            default:
                return false;
        }
    }

    @Override // X.C1ATS
    public final C2277811EDr getConfig() {
        return this.LLILLL;
    }

    public BaseProvider(Application application, C2277811EDr c2277811EDr) {
        super(application);
        this.LLILLJJLI = new AtomicBoolean();
        this.LLILLL = c2277811EDr;
    }
}
