package com.ss.android.ugc.aweme.poi.commonalbum.ui;

import X.C0H7C;
import X.C0ID9;
import X.C13LE;
import X.C166W;
import X.C2217381BqS;
import X.C23023090j;
import X.C339190DRl;
import X.C384050F3z;
import X.C418440Gaw;
import X.C425360Gm6;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC23026090m;
import X.InterfaceC420801kM;
import android.content.Context;
import android.util.Size;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.zhiliaoapp.musically.R;
import irm.AkS78S0100000_6;
import kotlin.jvm.internal.AwS585S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class LocalServiceHorizontalPhotoCell extends PowerCell<C0H7C> implements InterfaceC23026090m {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLL;
    public final C166W LL = new C166W(new AwS585S0100000_6(this, 135));
    public InterfaceC420801kM LLILLJJLI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(LocalServiceHorizontalPhotoCell.class, "viewBinding", "getViewBinding()Lcom/ss/android/ugc/tiktok/poi/databinding/PoiAlbumBottomPhotoLayoutBinding;", 0);
        C13LE.LIZ.getClass();
        LLILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.dxy;
    }

    public final C425360Gm6 I5() {
        C166W c166w = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILLL;
        return (C425360Gm6) c166w.LIZ(this);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        TuxIconView tuxIconView;
        SmartImageView smartImageView;
        super.onItemViewCreated();
        C425360Gm6 c425360Gm6I5 = I5();
        if (c425360Gm6I5 != null && (smartImageView = c425360Gm6I5.LLILLJJLI) != null) {
            smartImageView.setClipToOutline(true);
            smartImageView.setOutlineProvider(new C0ID9(7));
        }
        C425360Gm6 c425360Gm6I52 = I5();
        if (c425360Gm6I52 == null || (tuxIconView = c425360Gm6I52.LLILLL) == null) {
            return;
        }
        Context context = tuxIconView.getContext();
        if (context != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(200));
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.zg);
            tuxIconView.setBackground(c384050F3z.LIZ(context));
        }
        C786410Ut5.I7(new AkS78S0100000_6(this, 2), tuxIconView);
    }

    @Override // X.InterfaceC23026090m
    public final InterfaceC420801kM a() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC23026090m
    public final void LLJILJILJ(InterfaceC420801kM interfaceC420801kM) {
        this.LLILLJJLI = interfaceC420801kM;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C0H7C c0h7c = (C0H7C) interfaceC1891350zJl;
        super.onBindItemView(c0h7c);
        MediaModel mediaModel = c0h7c.LL;
        if (mediaModel != null) {
            C339190DRl.LIZLLL(I5().LLILLJJLI);
            C23023090j.LIZ(this, I5().LLILLJJLI, new Size(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(64)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(64))), mediaModel);
        } else {
            C339190DRl.LIZIZ(I5().LLILLJJLI);
        }
    }
}
