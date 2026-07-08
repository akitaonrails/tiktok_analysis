package com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.assem;

import X.C01D1;
import X.C09R3;
import X.C0WZX;
import X.C13LE;
import X.C1637806bA;
import X.C1637906bB;
import X.C1723530ux5;
import X.C1729530v6l;
import X.C1749280vcc;
import X.C197039127h;
import X.C19719912Dl;
import X.C19EG;
import X.C2126308Ur;
import X.C2204961BRm;
import X.C2217381BqS;
import X.C23250099c;
import X.C723850SaN;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.InterfaceC1637930sj1;
import X.InterfaceC2217461Bqa;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.viewmodel.BillboardGlobalViewModel;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.viewmodel.ImageListViewModel;
import com.ss.android.ugc.aweme.sticker.IStickerViewService;
import com.zhiliaoapp.musically.R;
import g1c.AjS70S0100000_26;
import java.util.List;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS600S0100000_21;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.AwS640S0100000_26;
import kotlin.text.u;

/* JADX INFO: loaded from: classes27.dex */
public final class BillboardImagesAssem extends UIContentAssem implements InterfaceC1637930sj1 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJI;
    public LinearLayout LLIZLLLIL;
    public C197039127h LLJ;
    public C1749280vcc LLJI;
    public FrameLayout LLJIJIL;
    public final AssemVMLazy LLJILJIL;
    public final AssemVMLazy LLJILJILJ;
    public LayoutInflater LLJILLL;
    public View LLJJ;
    public AwS605S0100000_26 LLJJI;
    public AwS605S0100000_26 LLJJIII;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BillboardImagesAssem.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/influencer/ecommercelive/common/business/effect2/viewmodel/ImageListViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(BillboardImagesAssem.class, "globalViewModel", "getGlobalViewModel()Lcom/ss/android/ugc/aweme/influencer/ecommercelive/common/business/effect2/viewmodel/BillboardGlobalViewModel;", 0);
        c09r3.getClass();
        LLJJIJI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public BillboardImagesAssem() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ImageListViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJILJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, c1637906bB, new AwS568S0100000_24(c19719912DlLIZ, 687), AFwS268S0000000_26.get$arr$(346), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(BillboardGlobalViewModel.class);
        this.LLJILJILJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c01d1, c1637906bB, new AwS568S0100000_24(c19719912DlLIZ2, 688), AFwS268S0000000_26.get$arr$(347), null, true);
    }

    @Override // X.InterfaceC1637930sj1
    public final void LLLLLLLLL(String str, String str2, String str3) {
    }

    @Override // X.InterfaceC1637930sj1
    public final void f(List<String> list) {
    }

    public final C197039127h Go() {
        View viewFindViewById = this.LLJ;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.cmi) : null;
            this.LLJ = (C197039127h) viewFindViewById;
        }
        return (C197039127h) viewFindViewById;
    }

    public final FrameLayout Ho() {
        View viewFindViewById = this.LLJIJIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.n_d) : null;
            this.LLJIJIL = (FrameLayout) viewFindViewById;
        }
        return (FrameLayout) viewFindViewById;
    }

    public final C1749280vcc Jo() {
        View viewFindViewById = this.LLJI;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.yly) : null;
            this.LLJI = (C1749280vcc) viewFindViewById;
        }
        return (C1749280vcc) viewFindViewById;
    }

    public final ImageListViewModel Lo() {
        AssemVMLazy assemVMLazy = this.LLJILJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJI;
        return (ImageListViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        ((IStickerViewService) ServiceManager.get().getService(IStickerViewService.class)).removeScanPhotoListListener(this);
    }

    @Override // X.InterfaceC1637930sj1
    public final void LLZLI(String str) throws Throwable {
        if (str != null && str.length() != 0) {
            if (u.LJJIIJZLJL(str, "content://", false)) {
                ContentResolver contentResolver = LJJIJL().getContext().getContentResolver();
                Uri uri = UriProtector.parse(str);
                Cursor cursorLJJJ = C2204961BRm.LJJJ(contentResolver, uri, null, null, null, null, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOOmZZPb2TzaSm6ItPsk1vIiKahyiP6OhAurIPQT2gRDgJVHDt7yAflBbyFbBZHjObXzmT6dg9zX/mJK785yPffW3Qpu8vXIXbEpHg==", null));
                if (cursorLJJJ == null) {
                    str = String.valueOf(uri.getPath());
                } else {
                    cursorLJJJ.moveToFirst();
                    str = cursorLJJJ.getString(cursorLJJJ.getColumnIndex("_data"));
                    cursorLJJJ.close();
                }
            }
            ImageListViewModel imageListViewModelLo = Lo();
            imageListViewModelLo.setState(AFwS268S0000000_26.get$arr$(603));
            imageListViewModelLo.LLIZ = C23250099c.LIZLLL(ViewModelKt.getViewModelScope(imageListViewModelLo), C2126308Ur.LIZIZ, null, new C1729530v6l(imageListViewModelLo, str, null), 2);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        Context context = view.getContext();
        if (context == null) {
            context = getContext();
        }
        View[] viewArr = new View[1];
        View viewFindViewById = this.LLIZLLLIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            if (viewLJJIJL != null) {
                viewFindViewById = viewLJJIJL.findViewById(R.id.n9y);
            } else {
                viewFindViewById = null;
            }
            this.LLIZLLLIL = (LinearLayout) viewFindViewById;
        }
        viewArr[0] = viewFindViewById;
        C1723530ux5.LIZIZ(context, viewArr);
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ == null) {
            return;
        }
        ((IStickerViewService) ServiceManager.get().getService(IStickerViewService.class)).initGalleryModule(c19egLIZ, this);
        this.LLJILLL = C786410Ut5.ne(view.getContext());
        C723850SaN.LIZLLL(this, new AwS600S0100000_21(this, 134));
        Go().setButtonVariant(1);
        AwS605S0100000_26 awS605S0100000_26 = new AwS605S0100000_26(this, 312);
        this.LLJJI = awS605S0100000_26;
        C786410Ut5.I7(new AjS70S0100000_26(awS605S0100000_26, 26), Go());
        C736680Sv4.LJIIIIZZ(this, Lo(), new C2217381BqS() { // from class: X.0v7L
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1729860v7I) obj).LLILLJJLI;
            }
        }, null, new AwS640S0100000_26(this, 46), 6);
        Lo().asyncSubscribe(new C2217381BqS() { // from class: X.0v7K
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1729860v7I) obj).LL;
            }
        }, this, C736820SvI.LIZJ(), new AwS605S0100000_26(this, 321), new AwS570S0100000_26(this, 785), new AwS605S0100000_26(this, 322));
        Lo().asyncSubscribe(new C2217381BqS() { // from class: X.0v6z
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1729860v7I) obj).LLILZLL;
            }
        }, this, C736820SvI.LIZJ(), new AwS605S0100000_26(this, 323), AFwS215S0000000_26.get$arr$(201), new AwS605S0100000_26(this, 320));
    }
}
