package l9b;

import X.AbstractC1076404Iw;
import X.C03E8;
import X.C1308910kAL;
import X.C1326790kdB;
import X.C1331670kl3;
import X.C1842040y2E;
import X.C418440Gaw;
import X.C426750GoL;
import X.C786410Ut5;
import X.C814420VxA;
import X.C834903Nz;
import android.content.Context;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.ViewDataBinding;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRightDesc;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRightDescBlock;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRightDetail;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.zhiliaoapp.musically.R;
import j0b.a;
import java.util.Iterator;
import java.util.List;
import p8b.c;

/* JADX INFO: loaded from: classes2.dex */
public final class t0 extends ConstraintLayout implements c {
    public TuxTextView LL;
    public TuxTextView LLILLJJLI;
    public LinearLayout LLILLL;
    public TuxIconView LLILZ;
    public final j0b.c LLILZIL;
    public final AbstractC1076404Iw LLILZLL;

    @Override // p8b.c
    public String getViewName() {
        return "PdpPoliciesItemView";
    }

    public final LinearLayout getDescContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.fmu);
            this.LLILLL = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final TuxTextView getDescFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.desc);
            this.LLILLJJLI = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxIconView getIconFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.jxe);
            this.LLILZ = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final TuxTextView getTitleFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.title);
            this.LL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final AbstractC1076404Iw getBinding() {
        return this.LLILZLL;
    }

    public final j0b.c getStyle() {
        return this.LLILZIL;
    }

    public final void setDesc(UserRightDetail userRightDetail) {
        List<UserRightDesc> list = userRightDetail.userRightDesc;
        if (list != null) {
            Iterator<UserRightDesc> it2 = list.iterator();
            while (it2.hasNext()) {
                List<UserRightDescBlock> list2 = it2.next().block_list;
                if (list2 != null) {
                    C03E8 c03e8 = C03E8.LIZ;
                    LinearLayout descContainerFromXml = getDescContainerFromXml();
                    j0b.c cVar = this.LLILZIL;
                    c03e8.getClass();
                    C03E8.LIZIZ(descContainerFromXml, list2, cVar);
                }
            }
        }
    }

    public final void setDescContainerFromXml(LinearLayout linearLayout) {
        this.LLILLL = linearLayout;
    }

    public final void setDescFromXml(TuxTextView tuxTextView) {
        this.LLILLJJLI = tuxTextView;
    }

    public final void setIcon(Image image) {
        int i;
        TuxIconView iconFromXml = getIconFromXml();
        if (image != null) {
            this.LLILZIL.LJJZZI();
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, iconFromXml);
        if (getIconFromXml().getVisibility() == 0) {
            C1326790kdB.LIZ.getClass();
            C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(image);
            c1331670kl3LIZLLL.LJJIIZI(C1308910kAL.LJ(R.attr.c7, getContext()));
            c1331670kl3LIZLLL.LJJI(getIconFromXml());
            C786410Ut5.h3(c1331670kl3LIZLLL);
        }
    }

    public final void setIconFromXml(TuxIconView tuxIconView) {
        this.LLILZ = tuxIconView;
    }

    public final void setTitle(String str) {
        if (str != null) {
            getTitleFromXml().setText(str);
            C426750GoL.LJIIIZ(getTitleFromXml(), Integer.valueOf(this.LLILZIL.LJJL()), null, null, null, false, 30);
        }
    }

    public final void setTitleFromXml(TuxTextView tuxTextView) {
        this.LL = tuxTextView;
    }

    public final void setDesc(String str) {
        if (str != null) {
            C786410Ut5.LJLLLLLL(0, getDescFromXml());
            getDescFromXml().setText(str);
        }
    }

    public t0(Context context, Integer num) {
        super(context, null, 0);
        LayoutInflater layoutInflaterNe = C786410Ut5.ne(context);
        DataBinderMapperImpl dataBinderMapperImpl = C1842040y2E.LIZ;
        AbstractC1076404Iw abstractC1076404Iw = (AbstractC1076404Iw) C1842040y2E.LIZ(layoutInflaterNe, R.layout.aso, this, true, ViewDataBinding.LIZJ(null));
        this.LLILZLL = abstractC1076404Iw;
        j0b.c aVar = (j0b.c) C834903Nz.LIZ(this, "product_detail", num, null, 12);
        aVar = aVar == null ? new a() : aVar;
        this.LLILZIL = aVar;
        abstractC1076404Iw.LJIILLIIL(aVar);
        setPadding(aVar.LJJJIL(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)), aVar.LJJJIL(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
    }
}
