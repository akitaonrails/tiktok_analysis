package com.ss.android.ugc.aweme.poi.commonalbum.ui;

import X.C0H7B;
import X.C12ES;
import X.C13LE;
import X.C1546210qL5;
import X.C166W;
import X.C2217381BqS;
import X.C23023090j;
import X.C384050F3z;
import X.C418440Gaw;
import X.C433760Gze;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC23026090m;
import X.InterfaceC420801kM;
import android.content.Context;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS585S0100000_6;
import wh6.AbS688S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class LocalServicePhotoCell extends PowerCell<C0H7B> implements InterfaceC23026090m {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLL;
    public final C166W LL = new C166W(new AwS585S0100000_6(this, 137));
    public InterfaceC420801kM LLILLJJLI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(LocalServicePhotoCell.class, "viewBinding", "getViewBinding()Lcom/ss/android/ugc/tiktok/poi/databinding/PoiPhotoItemLayoutBinding;", 0);
        C13LE.LIZ.getClass();
        LLILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.e60;
    }

    public final C433760Gze I5() {
        C166W c166w = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILLL;
        return (C433760Gze) c166w.LIZ(this);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        View view = this.itemView;
        if (view != null) {
            C786410Ut5.I7(new AbS688S0100000_6(this, 3), view);
        }
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
        C0H7B c0h7b = (C0H7B) interfaceC1891350zJl;
        super.onBindItemView(c0h7b);
        int iLJIIJ = (int) ((C12ES.LJIIJ(this.itemView.getContext()) - (2 * C12ES.LIZJ(1.5f, this.itemView.getContext()))) / 3);
        Size size = new Size(iLJIIJ, iLJIIJ);
        MediaModel mediaModel = c0h7b.LLILLJJLI;
        if (mediaModel != null) {
            C23023090j.LIZ(this, I5().LLILLJJLI, size, mediaModel);
        }
        if (c0h7b.LLILLL) {
            C786410Ut5.LJLLLLLL(4, I5().LLILZ);
            C786410Ut5.fc(I5().LLILLJJLI, 1.1f);
            C786410Ut5.Bc(I5().LLILLJJLI, 1.1f);
        } else {
            C786410Ut5.LJLLLLLL(4, I5().LLILZ);
            C786410Ut5.fc(I5().LLILLJJLI, 1.0f);
            C786410Ut5.Bc(I5().LLILLJJLI, 1.0f);
        }
        if (c0h7b.LLILLL && c0h7b.LLILZ > 0) {
            C786410Ut5.LLLLZLL(I5().LLILLL, 0);
            I5().LLILLL.setText(String.valueOf(c0h7b.LLILZ));
            Context context = this.itemView.getContext();
            if (context != null) {
                TuxTextView tuxTextView = I5().LLILLL;
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(200));
                c384050F3z.LIZIZ = Integer.valueOf(R.attr.a04);
                tuxTextView.setBackground(c384050F3z.LIZ(context));
            }
        } else {
            I5().LLILLL.setText("");
            Context context2 = this.itemView.getContext();
            if (context2 != null) {
                TuxTextView tuxTextView2 = I5().LLILLL;
                C384050F3z c384050F3z2 = new C384050F3z();
                c384050F3z2.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(200));
                c384050F3z2.LIZIZ = Integer.valueOf(R.attr.a1a);
                C1546210qL5 c1546210qL5 = C1546210qL5.LIZ;
                Float fValueOf = Float.valueOf(1.5f);
                c1546210qL5.getClass();
                c384050F3z2.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C1546210qL5.LIZ(fValueOf)));
                c384050F3z2.LJFF = Integer.valueOf(R.attr.zi);
                tuxTextView2.setBackground(c384050F3z2.LIZ(context2));
            }
        }
        if (c0h7b.LLILZIL) {
            C786410Ut5.T4(this.itemView, 0.5f);
        } else {
            C786410Ut5.T4(this.itemView, 1.0f);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return super.onCreateItemView(viewGroup);
    }
}
