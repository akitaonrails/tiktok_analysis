package com.ss.android.ugc.aweme.ui;

import X.AbstractC451120HmY;
import X.C01GW;
import X.C0HWP;
import X.C1378990lzN;
import X.C13LE;
import X.C2217381BqS;
import X.C23250099c;
import X.C418440Gaw;
import X.C452501pT;
import X.C462960IDm;
import X.InterfaceC2217461Bqa;
import android.graphics.drawable.Animatable;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public abstract class StickerItemCell<T extends AbstractC451120HmY> extends PowerCell<T> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZLL;
    public final C462960IDm LL = new C462960IDm(this, 5);
    public final int LLILLJJLI = R.drawable.cc2;
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS550S0100000_6((StickerItemCell) this, 818));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS550S0100000_6((StickerItemCell) this, 819));
    public Animatable LLILZIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(StickerItemCell.class, "control", "getControl()Lcom/ss/android/ugc/aweme/ui/IStickerPageCellControl;", 0);
        C13LE.LIZ.getClass();
        LLILZLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public abstract UrlModel N5(T t);

    public Integer I5() {
        return Integer.valueOf(this.LLILLJJLI);
    }

    public Integer L5() {
        return Integer.valueOf(this.LLILLJJLI);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public void onItemViewCreated() {
        super.onItemViewCreated();
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C0HWP(this, null), 3);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onPause() {
        super.onPause();
        Animatable animatable = this.LLILZIL;
        if (animatable != null) {
            animatable.stop();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0101  */
    /* JADX WARN: Type inference failed for: r0v16, types: [T, com.ss.android.ugc.aweme.base.model.UrlModel] */
    /* JADX WARN: Type inference failed for: r0v8, types: [T, com.ss.android.ugc.aweme.base.model.UrlModel] */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: P5, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onBindItemView(T r9) {
        /*
            Method dump skipped, instruction units count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ui.StickerItemCell.onBindItemView(X.0HmY):void");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View viewInflateItemView$default = PowerCell.inflateItemView$default(this, viewGroup, R.layout.c3l, false, 4, null);
        C1378990lzN.LIZIZ(viewInflateItemView$default, Float.valueOf(C418440Gaw.LIZIZ(12)), null, null, null, null, 30);
        return viewInflateItemView$default;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onResume(boolean z) {
        super.onResume(z);
        Animatable animatable = this.LLILZIL;
        if (animatable != null) {
            animatable.start();
        }
    }
}
