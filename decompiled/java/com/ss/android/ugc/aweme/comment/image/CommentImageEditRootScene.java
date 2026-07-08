package com.ss.android.ugc.aweme.comment.image;

import X.AbstractC214814194y;
import X.C01GW;
import X.C09N5;
import X.C11Z4;
import X.C1346420l8q;
import X.C1354660lM8;
import X.C13LP;
import X.C1439810nZT;
import X.C1450590nqr;
import X.C1450600nqs;
import X.C1451800nso;
import X.C1664590tQ1;
import X.C1664600tQ2;
import X.C19571411hg;
import X.C19684111zr;
import X.C19740512Lj;
import X.C1DRG;
import X.C452501pT;
import X.C703302op;
import X.C786410Ut5;
import X.C844470XAv;
import X.InterfaceC1450620nqu;
import X.InterfaceC1451590nsT;
import X.InterfaceC1451690nsd;
import X.InterfaceC1451870nsv;
import X.InterfaceC1451890nsx;
import X.InterfaceC1452360nti;
import X.InterfaceC362610EJn;
import X.InterfaceC484050IyZ;
import X.InterfaceC524950KiL;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.bytedance.als.FeatureAlsLogicContainer;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.comment.model.CommentImageModel;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS601S0100000_22;

/* JADX INFO: loaded from: classes23.dex */
public final class CommentImageEditRootScene extends AbstractC214814194y implements InterfaceC524950KiL {
    public InterfaceC1451590nsT LLJJIJIL;
    public InterfaceC1451690nsd LLJJJ;
    public InterfaceC1451870nsv LLJJJIL;
    public InterfaceC1450620nqu LLJJJJ;
    public InterfaceC1452360nti LLJJJJJIL;
    public InterfaceC1451890nsx LLJJL;
    public C1439810nZT LLJJLIIIJLLLLLLLZ;
    public ImageAlbumData LLJL;
    public C19571411hg LLJLILLLLZIIL;
    public C19740512Lj LLJLL;
    public C1450600nqs LLJLLIL;
    public FrameLayout LLJLLL;
    public boolean LLJZ;
    public boolean LLJZIJLIL;
    public final ArrayList<InterfaceC362610EJn> LLJJJJLIIL = new ArrayList<>();
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 42));

    @Override // X.InterfaceC524950KiL
    public final void Qh(InterfaceC484050IyZ interfaceC484050IyZ) {
    }

    @Override // X.InterfaceC524950KiL
    public final void T4(InterfaceC484050IyZ interfaceC484050IyZ) {
    }

    @Override // X.AbstractC214814194y, X.C198H
    public final boolean onBackPressed() {
        ArrayList<InterfaceC362610EJn> arrayList = this.LLJJJJLIIL;
        if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
            Iterator<InterfaceC362610EJn> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (it2.next().onKeyDown(4, null)) {
                    return true;
                }
            }
        }
        return super.onBackPressed();
    }

    public static String LLLLJI(CommentImageModel commentImageModel) {
        String str;
        if (C703302op.LIZ(commentImageModel.getEditedImagePath())) {
            return commentImageModel.getEditedImagePath();
        }
        List<String> urlList = commentImageModel.getUrlList();
        if (urlList != null && (str = (String) C13LP.LJJJLZIJ(0, urlList)) != null) {
            C844470XAv.LIZ.getClass();
            return C09N5.LIZ(C844470XAv.LIZ(), UriProtector.parse(str));
        }
        return null;
    }

    @Override // X.InterfaceC524950KiL
    public final void AH(InterfaceC362610EJn interfaceC362610EJn) {
        ListProtector.add(this.LLJJJJLIIL, 0, interfaceC362610EJn);
    }

    @Override // X.InterfaceC524950KiL
    public final void b8(InterfaceC362610EJn interfaceC362610EJn) {
        this.LLJJJJLIIL.remove(interfaceC362610EJn);
    }

    @Override // X.InterfaceC524950KiL
    public final void kF(InterfaceC362610EJn interfaceC362610EJn) {
        this.LLJJJJLIIL.add(interfaceC362610EJn);
    }

    @Override // X.AbstractC214814194y, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        Boolean boolValueOf;
        Aweme aweme;
        super.onActivityCreated(bundle);
        C1664590tQ1.LIZLLL(this, "CommentImageEditRootScene", false, new AwS601S0100000_22(this, 659), 2);
        C1664600tQ2.LIZ(this, "CommentImageEditRootScene", new AwS601S0100000_22(this, 660));
        C1DRG c1drg = ((FeatureAlsLogicContainer) C1664600tQ2.LJ(this)).LLJJI;
        if (c1drg != null) {
            c1drg.LJII(C11Z4.class, null);
            this.LLJJIJIL = (InterfaceC1451590nsT) c1drg.LJII(InterfaceC1451590nsT.class, null);
            this.LLJJJ = (InterfaceC1451690nsd) c1drg.LJII(InterfaceC1451690nsd.class, null);
            this.LLJJJJJIL = (InterfaceC1452360nti) c1drg.LJII(InterfaceC1452360nti.class, null);
            this.LLJJL = (InterfaceC1451890nsx) c1drg.LJII(InterfaceC1451890nsx.class, null);
            C1450600nqs c1450600nqs = this.LLJLLIL;
            if (c1450600nqs != null && (aweme = c1450600nqs.aweme) != null) {
                boolValueOf = Boolean.valueOf(C1354660lM8.LIZJ(aweme));
            } else {
                boolValueOf = null;
            }
            if (C1346420l8q.LIZJ(boolValueOf)) {
                c1drg.LJII(C1450590nqr.class, null);
            }
            if (!this.LLJZ) {
                c1drg.LJII(C19684111zr.class, null);
                this.LLJJJIL = (InterfaceC1451870nsv) c1drg.LJII(InterfaceC1451870nsv.class, null);
                this.LLJJJJ = (InterfaceC1450620nqu) c1drg.LJII(InterfaceC1450620nqu.class, null);
            }
            this.LLJLL = C1451800nso.LIZ(requireSceneContext(), (ViewGroup) requireViewById(R.id.gpu), 0, 12);
            ViewStub viewStub = (ViewStub) requireViewById(R.id.view_stub_item_edit_sticker_container_new_engine_higher_layer);
            viewStub.setLayoutResource(R.layout.fac);
            this.LLJLLL = (FrameLayout) C786410Ut5.LJLLLL(viewStub);
            Keva.getRepo("edite_image_view_bubble").storeBoolean("edit_image_view_bubble_has_enter_edit", true);
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // X.AbstractC214814194y, X.C19A3, com.bytedance.scene.Scene
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // X.AbstractC214814194y, com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
    }

    @Override // X.AbstractC1447660nm8, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.en6, viewGroup, false);
    }
}
