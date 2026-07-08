package com.bytedance.pumbaa.common.business.pl;

import X.C0W9R;
import X.C13LP;
import X.C796440VMc;
import X.C813160Vv8;
import android.os.Looper;
import com.bytedance.bpea.transmit.IRegister;

/* JADX INFO: loaded from: classes14.dex */
public final class CrossStackPageStack {
    public static boolean LIZLLL;
    public static PageStackConfig LIZ = C0W9R.LIZ;
    public static int LIZIZ = -1;
    public static int LIZJ = -1;
    public static final Thread LJ = Looper.getMainLooper().getThread();

    public static final class PageStackRegister implements IRegister {
        @Override // com.bytedance.bpea.transmit.IRegister
        public final boolean enable() {
            PageStackConfig pageStackConfig = CrossStackPageStack.LIZ;
            return CrossStackPageStack.LIZ.enable;
        }

        @Override // com.bytedance.bpea.transmit.IRegister
        public final void LIZ(int i) {
            CrossStackPageStack.LIZIZ = i;
        }
    }

    public static final class SampleRegister implements IRegister {
        @Override // com.bytedance.bpea.transmit.IRegister
        public final boolean enable() {
            PageStackConfig pageStackConfig = CrossStackPageStack.LIZ;
            return CrossStackPageStack.LIZ.enable;
        }

        @Override // com.bytedance.bpea.transmit.IRegister
        public final void LIZ(int i) {
            CrossStackPageStack.LIZJ = i;
        }
    }

    public static Object LIZ() {
        PageStackConfig pageStackConfig = LIZ;
        if (pageStackConfig.pageType != 0) {
            return pageStackConfig.enablePageMap ? C813160Vv8.LJ : C813160Vv8.LIZLLL;
        }
        if (pageStackConfig.enablePageMap) {
            return C13LP.LLIIII(C813160Vv8.LIZJ);
        }
        C796440VMc<String> c796440VMc = C813160Vv8.LIZIZ;
        if (c796440VMc != null) {
            return C13LP.LLIIII(c796440VMc);
        }
        return null;
    }
}
