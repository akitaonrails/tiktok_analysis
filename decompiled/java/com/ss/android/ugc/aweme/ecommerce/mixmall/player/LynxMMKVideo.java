package com.ss.android.ugc.aweme.ecommerce.mixmall.player;

import X.AbstractC21340218fI;
import X.C1775300wIa;
import X.InterfaceC1312540kGC;
import android.content.Context;
import android.view.View;
import com.bytedance.ies.xelement.LynxVideoManager;
import kotlin.jvm.internal.AwS493S0200000_32;

/* JADX INFO: loaded from: classes33.dex */
public final class LynxMMKVideo extends LynxVideoManager {
    public LynxMMKVideo() {
        throw null;
    }

    @Override // com.bytedance.ies.xelement.LynxVideoManager
    /* JADX INFO: renamed from: LJJIIZI */
    public final AbstractC21340218fI createView(Context context) {
        if (context != null) {
            C1775300wIa c1775300wIa = new C1775300wIa(context, this.mContext);
            c1775300wIa.setStateChangeReporter(new AwS493S0200000_32(c1775300wIa, this, 1));
            return c1775300wIa;
        }
        "Required context must be non-null".toString();
        throw new IllegalArgumentException("Required context must be non-null");
    }

    @Override // com.bytedance.ies.xelement.LynxVideoManager, com.lynx.tasm.behavior.ui.LynxUI
    public final /* bridge */ /* synthetic */ View createView(Context context) {
        return createView(context);
    }

    @InterfaceC1312540kGC(defaultDouble = 0.0d, name = "duration")
    public final void setDuration(double d) {
        C1775300wIa c1775300wIa;
        T t = this.mView;
        if ((t instanceof C1775300wIa) && (c1775300wIa = (C1775300wIa) t) != null) {
            c1775300wIa.setDuration(Double.valueOf(d));
        }
    }

    @InterfaceC1312540kGC(name = "enterFrom")
    public final void setEnterFrom(String str) {
        C1775300wIa c1775300wIa;
        T t = this.mView;
        if ((t instanceof C1775300wIa) && (c1775300wIa = (C1775300wIa) t) != null) {
            c1775300wIa.setEnterFrom(str);
        }
    }

    @InterfaceC1312540kGC(name = "vodScenes")
    public final void setVodSceneTag(String str) {
        C1775300wIa c1775300wIa;
        T t = this.mView;
        if ((t instanceof C1775300wIa) && (c1775300wIa = (C1775300wIa) t) != null) {
            c1775300wIa.setVodSceneTag(str);
        }
    }

    @InterfaceC1312540kGC(name = "vodTag")
    public final void setVodTag(String str) {
        C1775300wIa c1775300wIa;
        T t = this.mView;
        if ((t instanceof C1775300wIa) && (c1775300wIa = (C1775300wIa) t) != null) {
            c1775300wIa.setVodTag(str);
        }
    }
}
