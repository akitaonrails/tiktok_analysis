package com.ss.android.ugc.aweme.search.pages.result.common.searchlemon8photo.core.ui.assem;

import X.C07E5;
import X.C0H07;
import X.C0H09;
import X.C0H0A;
import X.C0H62;
import X.C0IDR;
import X.C0PEM;
import X.C13LP;
import X.C1558520qew;
import X.C1DFH;
import X.C2107308Nj;
import X.C23250099c;
import X.C435520H5y;
import X.InterfaceC1587906Jp;
import X.InterfaceC435460H5s;
import X.InterfaceC712990Rxx;
import android.content.Context;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.view.View;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$CardCommonAbility;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class Lemon8ImageAssem extends ReusedUISlotAssem<Lemon8ImageAssem> implements InterfaceC712990Rxx<InterfaceC435460H5s> {
    public Aweme LLJJLIIIJLLLLLLLZ;
    public PhotoModeImageUrlModel LLJL;
    public SmartImageView LLJLIL;
    public UrlModel LLJLILLLLZIIL;
    public final C0H09 LLJLL = new C0H0A() { // from class: X.0H09
        @Override // X.C0H0A, X.InterfaceC427850Gq7
        public final void Bh(Uri uri, View view) {
            if (view != null) {
                view.setBackgroundColor(0);
            }
        }

        @Override // X.C0H0A, X.InterfaceC427850Gq7
        public final void Ad(Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
            Integer numValueOf;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("lemon8 image load success wxh = ");
            Integer numValueOf2 = null;
            if (c428600GrK != null) {
                numValueOf = Integer.valueOf(c428600GrK.LIZ);
            } else {
                numValueOf = null;
            }
            sbLIZ.append(numValueOf);
            sbLIZ.append(' ');
            if (c428600GrK != null) {
                numValueOf2 = Integer.valueOf(c428600GrK.LIZIZ);
            }
            sbLIZ.append(numValueOf2);
            C2188811AlT.LIZIZ(sbLIZ);
            if (view != null) {
                view.setBackgroundColor(-16777216);
            }
        }
    };
    public final C435520H5y LLJLLIL = new C0H62() { // from class: X.0H5y
        @Override // X.C0H62
        public final void onChange(C0O0L c0o0l, C0O0L c0o0l2) {
            PhotoModeImageUrlModel photoModeImageUrlModel;
            if (c0o0l2 != null && C435530H5z.LIZ[c0o0l2.ordinal()] == 1 && c0o0l != C0O0L.AVAILABLE && (photoModeImageUrlModel = this.LL.LLJL) != null && !photoModeImageUrlModel.isCoverLoadSuccess()) {
                this.LL.op();
            }
        }
    };

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.eui;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final void op() {
        UrlModel urlModel;
        List<String> urlList;
        if (this.LLJLIL == null || (urlModel = this.LLJLILLLLZIIL) == null || (urlList = urlModel.getUrlList()) == null) {
            return;
        }
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C0H07(this, urlList, null), 2);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final Context So(Context context) {
        if (C07E5.LIZ()) {
            return LJJIJL().getContext();
        }
        return context;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLJLIL = (SmartImageView) view.findViewById(R.id.qe7);
        ((SearchServiceCenter$CardCommonAbility) C1558520qew.LIZJ(C1558520qew.LJIIL(this), SearchServiceCenter$CardCommonAbility.class)).A12(new C0IDR(this, 7));
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(InterfaceC435460H5s interfaceC435460H5s) {
        PhotoModeImageUrlModel photoModeImageUrlModel;
        PhotoModeImageInfo photoModeImageInfo;
        List<PhotoModeImageUrlModel> imageList;
        PhotoModeImageInfo photoModeImageInfo2;
        List<PhotoModeImageUrlModel> imageList2;
        Aweme aweme = interfaceC435460H5s.getAweme();
        this.LLJJLIIIJLLLLLLLZ = aweme;
        if (aweme != null && (photoModeImageInfo2 = aweme.getPhotoModeImageInfo()) != null && (imageList2 = photoModeImageInfo2.getImageList()) != null) {
            photoModeImageUrlModel = (PhotoModeImageUrlModel) C13LP.LJJJLZIJ(0, imageList2);
        } else {
            photoModeImageUrlModel = null;
        }
        this.LLJL = photoModeImageUrlModel;
        Aweme aweme2 = this.LLJJLIIIJLLLLLLLZ;
        if (aweme2 != null && (photoModeImageInfo = aweme2.getPhotoModeImageInfo()) != null && (imageList = photoModeImageInfo.getImageList()) != null) {
            C13LP.LJJJLZIJ(0, imageList);
        }
        this.LLJLILLLLZIIL = null;
        PhotoModeImageUrlModel photoModeImageUrlModel2 = this.LLJL;
        if (photoModeImageUrlModel2 != null) {
            this.LLJLILLLLZIIL = photoModeImageUrlModel2.displayImageNoWatermark;
        }
        op();
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(InterfaceC435460H5s interfaceC435460H5s) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(InterfaceC435460H5s interfaceC435460H5s) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
