package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.promotion;

import X.C01GW;
import X.C04GD;
import X.C10515049h;
import X.C1071004Gu;
import X.C1076804Ja;
import X.C1076904Jb;
import X.C12ES;
import X.C1308910kAL;
import X.C1326790kdB;
import X.C1331670kl3;
import X.C1331730kl9;
import X.C1331750klB;
import X.C13LE;
import X.C1748720vbi;
import X.C1755600vmo;
import X.C19719912Dl;
import X.C19MB;
import X.C418440Gaw;
import X.C452501pT;
import X.C786410Ut5;
import X.EnumC1338240kve;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.EntranceBannerInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.EntranceButtonInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.zhiliaoapp.musically.R;
import g1c.AjS60S0100000_1;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS185S0000000_1;
import kotlin.jvm.internal.AwS115S1100000_1;
import kotlin.jvm.internal.AwS270S0300000_26;

/* JADX INFO: loaded from: classes2.dex */
public final class SeaPdpPromotionEntranceInfoViewHolder extends AbsFullSpanVH<C04GD> {
    public final Context LLJJIJIL;
    public final C01GW LLJJJ;
    public View LLJJJIL;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SeaPdpPromotionEntranceInfoViewHolder(ViewGroup viewGroup) {
        C1755600vmo c1755600vmo = C1755600vmo.LIZ;
        Context context = viewGroup.getContext();
        c1755600vmo.getClass();
        super(C1755600vmo.LIZ(R.layout.aww, context, viewGroup, false, true));
        this.LLJJIJIL = this.itemView.getContext();
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SeaPdpViewModel.class);
        this.LLJJJ = C452501pT.LIZIZ(new AwS270S0300000_26(this, c19719912DlLIZ, c19719912DlLIZ, 65));
    }

    public final void d6(View view) {
        if (view.getTag() == null) {
            return;
        }
        C786410Ut5.I7(new AjS60S0100000_1(this, 28), view);
        if (view instanceof ViewGroup) {
            Iterator it2 = new C1076804Ja((ViewGroup) view, 11).iterator();
            while (true) {
                C1076904Jb c1076904Jb = (C1076904Jb) it2;
                if (c1076904Jb.hasNext()) {
                    d6((View) c1076904Jb.next());
                } else {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void rr(Object obj) {
        ViewGroup viewGroup;
        String str;
        String str2;
        EntranceButtonInfo entranceButtonInfo;
        List<Image> list;
        int i;
        int i2;
        View view;
        TuxTextView tuxTextView;
        C04GD c04gd = (C04GD) obj;
        this.LLJJJ.getValue();
        View view2 = this.itemView;
        ConstraintLayout constraintLayout = null;
        if (view2 instanceof ViewGroup) {
            viewGroup = (ViewGroup) view2;
        } else {
            viewGroup = null;
        }
        int i3 = 8;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                C786410Ut5.LJLLLLLL(8, viewGroup.getChildAt(i4));
            }
        }
        Integer num = c04gd.LIZ;
        if (num != null && num.intValue() == 6) {
            C12ES.LJIILL(0, this.itemView.findViewById(R.id.uop));
            this.LLJJJIL = this.itemView.findViewById(R.id.uop);
            if (C1071004Gu.LIZIZ().LIZ() && (view = this.LLJJJIL) != null && (tuxTextView = (TuxTextView) view.findViewById(R.id.uov)) != null) {
                tuxTextView.setTuxFont(62);
            }
            View view3 = this.LLJJJIL;
            if (view3 != null) {
                Integer num2 = ((C04GD) this.LLILLJJLI).LIZ;
                if (num2 != null && num2.intValue() == 6) {
                    str = "promotion";
                } else {
                    str = "unKnown";
                }
                C1748720vbi.LJFF(this.itemView, new C10515049h(), AFwS185S0000000_1.get$arr$(307), new AwS115S1100000_1(this, str, 34));
                TextView textView = (TextView) view3.findViewById(R.id.uov);
                EntranceBannerInfo entranceBannerInfo = ((C04GD) this.LLILLJJLI).LIZJ;
                if (entranceBannerInfo != null) {
                    str2 = entranceBannerInfo.title;
                } else {
                    str2 = null;
                }
                textView.setText(str2);
                d6(view3);
                EntranceBannerInfo entranceBannerInfo2 = ((C04GD) this.LLILLJJLI).LIZJ;
                if (entranceBannerInfo2 != null && (entranceButtonInfo = entranceBannerInfo2.buttonInfo) != null && (list = entranceButtonInfo.buttonImgList) != null) {
                    if (view3 instanceof ConstraintLayout) {
                        constraintLayout = (ConstraintLayout) view3;
                    }
                    if (constraintLayout != null) {
                        C19MB c19mb = new C19MB();
                        c19mb.LJII(constraintLayout);
                        if (list.size() >= 2) {
                            i2 = R.id.uou;
                        } else {
                            i2 = R.id.uot;
                        }
                        c19mb.LJIIIIZZ(R.id.uor, 6, i2, 7);
                        c19mb.LIZIZ(constraintLayout);
                    }
                    View viewFindViewById = view3.findViewById(R.id.uot);
                    if (!list.isEmpty()) {
                        i = 0;
                    } else {
                        i = 8;
                    }
                    C786410Ut5.LJLLLLLL(i, viewFindViewById);
                    View viewFindViewById2 = view3.findViewById(R.id.uou);
                    if (list.size() >= 2) {
                        i3 = 0;
                    }
                    C786410Ut5.LJLLLLLL(i3, viewFindViewById2);
                    if (!list.isEmpty()) {
                        c6((SmartImageView) view3.findViewById(R.id.uot), (Image) ListProtector.get(list, 0));
                        if (list.size() >= 2) {
                            c6((SmartImageView) view3.findViewById(R.id.uou), (Image) ListProtector.get(list, 1));
                        }
                    }
                }
            }
        }
    }

    public final void c6(SmartImageView smartImageView, Image image) {
        int iIntValue;
        C1326790kdB.LIZ.getClass();
        C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(image);
        c1331670kl3LIZLLL.LJJ = EnumC1338240kve.CENTER_CROP;
        c1331670kl3LIZLLL.LJJIIZI(C1308910kAL.LJ(R.attr.ni, this.LLJJIJIL));
        C1331750klB c1331750klB = new C1331750klB();
        c1331750klB.LJ = C418440Gaw.LIZIZ(2);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ni, this.LLJJIJIL);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        float fLIZIZ = C418440Gaw.LIZIZ(Float.valueOf(0.5f));
        c1331750klB.LIZJ = iIntValue;
        c1331750klB.LIZIZ = fLIZIZ;
        c1331670kl3LIZLLL.LJJI = new C1331730kl9(c1331750klB);
        c1331670kl3LIZLLL.LJJ(smartImageView);
        c1331670kl3LIZLLL.LJIIJJI();
    }
}
