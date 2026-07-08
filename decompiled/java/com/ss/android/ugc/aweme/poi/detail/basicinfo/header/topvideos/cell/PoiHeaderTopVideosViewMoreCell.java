package com.ss.android.ugc.aweme.poi.detail.basicinfo.header.topvideos.cell;

import X.C1183810guZ;
import X.C1189060h32;
import X.C1558360qeg;
import X.C1558520qew;
import X.C2211631BhB;
import X.C418440Gaw;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1891350zJl;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.topvideos.assem.IPoiHeaderTopVideosAbility;
import com.zhiliaoapp.musically.R;
import irm.AkS87S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiHeaderTopVideosViewMoreCell extends PowerCell<C1183810guZ> {
    public TuxIconView LL;
    public TuxTextView LLILLJJLI;
    public View LLILLL;
    public Drawable LLILZ;
    public boolean LLILZIL;
    public int LLILZLL;
    public float LLIZ = 0.85f;
    public int LLIZLLLIL;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        IPoiHeaderTopVideosAbility iPoiHeaderTopVideosAbility;
        super.onItemViewCreated();
        this.LL = (TuxIconView) this.itemView.findViewById(R.id.lr0);
        this.LLILLJJLI = (TuxTextView) this.itemView.findViewById(R.id.tv_view_all);
        View viewFindViewById = this.itemView.findViewById(R.id.ett);
        this.LLILLL = viewFindViewById;
        this.LLILZ = viewFindViewById != null ? viewFindViewById.getBackground() : null;
        TuxTextView tuxTextView = this.LLILLJJLI;
        if (tuxTextView != null) {
            tuxTextView.setMaxWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(88)) - (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)) * 2));
        }
        Fragment fragmentLJIIJ = C1189060h32.LJIIJ(this);
        if (fragmentLJIIJ != null && (iPoiHeaderTopVideosAbility = (IPoiHeaderTopVideosAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJIIJ, null), IPoiHeaderTopVideosAbility.class, null)) != null) {
            iPoiHeaderTopVideosAbility.tx2(this);
        }
        C2211631BhB.LJ(this.itemView, new AwS597S0100000_18(this, 309));
        C786410Ut5.I7(new AkS87S0100000_18(this, 29), this.itemView);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        ViewGroup.LayoutParams layoutParams;
        C1183810guZ c1183810guZ = (C1183810guZ) interfaceC1891350zJl;
        super.onBindItemView(c1183810guZ);
        if (c1183810guZ.LLILZIL > 0) {
            ViewGroup.LayoutParams layoutParams2 = this.itemView.getLayoutParams();
            if ((layoutParams2 != null && layoutParams2.height == c1183810guZ.LLILZIL) || (layoutParams = this.itemView.getLayoutParams()) == null) {
                return;
            }
            layoutParams.height = c1183810guZ.LLILZIL;
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.e1p, viewGroup, false);
    }
}
