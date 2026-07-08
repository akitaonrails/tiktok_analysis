package com.ss.android.ugc.aweme.poi.commonalbum.ui;

import X.C13LE;
import X.C13LP;
import X.C166W;
import X.C2217381BqS;
import X.C23023090j;
import X.C339190DRl;
import X.C418440Gaw;
import X.C433740Gzc;
import X.C433750Gzd;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC23026090m;
import X.InterfaceC420801kM;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS585S0100000_6;
import wh6.AbS688S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class LocalServiceAlbumCell extends PowerCell<C433740Gzc> implements InterfaceC23026090m {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLL;
    public final C166W LL = new C166W(new AwS585S0100000_6(this, 134));
    public InterfaceC420801kM LLILLJJLI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(LocalServiceAlbumCell.class, "viewBinding", "getViewBinding()Lcom/ss/android/ugc/tiktok/poi/databinding/PoiAlbumItemLayoutBinding;", 0);
        C13LE.LIZ.getClass();
        LLILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.dy5;
    }

    public final C433750Gzd I5() {
        C166W c166w = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILLL;
        return (C433750Gzd) c166w.LIZ(this);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        View view = this.itemView;
        if (view != null) {
            C786410Ut5.I7(new AbS688S0100000_6(this, 2), view);
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
        boolean z;
        MediaModel mediaModel;
        C433740Gzc c433740Gzc = (C433740Gzc) interfaceC1891350zJl;
        super.onBindItemView(c433740Gzc);
        List<MediaModel> list = c433740Gzc.LLILLJJLI;
        if (list != null && (mediaModel = (MediaModel) C13LP.LJJJLL(list)) != null) {
            C339190DRl.LIZLLL(I5().LLILZ);
            C23023090j.LIZ(this, I5().LLILZ, new Size(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(72)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(72))), mediaModel);
        } else {
            C339190DRl.LIZIZ(I5().LLILZ);
        }
        String str = c433740Gzc.LL;
        if (str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            I5().LLILLL.setText(str);
        }
        List<MediaModel> list2 = c433740Gzc.LLILLJJLI;
        if (list2 != null) {
            Integer numValueOf = Integer.valueOf(list2.size());
            if (numValueOf.intValue() > 0) {
                I5().LLILLJJLI.setText(String.valueOf(numValueOf.intValue()));
            }
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return super.onCreateItemView(viewGroup);
    }
}
