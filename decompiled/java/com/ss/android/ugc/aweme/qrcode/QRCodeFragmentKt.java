package com.ss.android.ugc.aweme.qrcode;

import X.C13LE;
import X.C20696615ym;
import X.C2217381BqS;
import X.InterfaceC20696715yn;
import X.InterfaceC2217461Bqa;
import com.bytedance.ies.foundation.fragment.BaseFragment;

/* JADX INFO: loaded from: classes32.dex */
public abstract class QRCodeFragmentKt extends BaseFragment implements InterfaceC20696715yn {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZLLLIL;
    public volatile C20696615ym LLIZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(QRCodeFragmentKt.class, "saveImagePresenter", "getSaveImagePresenter()Lcom/ss/android/ugc/aweme/qrcode/presenter/impl/SaveImagePresenter;", 0);
        C13LE.LIZ.getClass();
        LLIZLLLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public final C20696615ym SR() {
        C20696615ym c20696615ym = this.LLIZ;
        if (c20696615ym == null) {
            synchronized (this) {
                c20696615ym = this.LLIZ;
                if (c20696615ym == null) {
                    C20696615ym c20696615ym2 = new C20696615ym((QRCodeFragment) this, getActivity());
                    this.LLIZ = c20696615ym2;
                    return c20696615ym2;
                }
            }
        }
        return c20696615ym;
    }
}
