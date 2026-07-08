package com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.photo.ui;

import X.C01GW;
import X.C0S7E;
import X.C1196320hEk;
import X.C1206504nn;
import X.C1261804wi;
import X.C1386160mAw;
import X.C1888107aR;
import X.C21694819vO;
import X.C21696019va;
import X.C418440Gaw;
import X.C452501pT;
import X.C628500Oky;
import X.C705700RmC;
import X.C714800S2c;
import X.C814420VxA;
import X.EnumC714820S2e;
import X.InterfaceC1891350zJl;
import X.InterfaceC665370Q7z;
import X.InterfaceC713360RyY;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImage;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AwS577S0100000_33;

/* JADX INFO: loaded from: classes34.dex */
public final class PhotoModeCell extends PowerCell<C21694819vO> implements InterfaceC713360RyY {
    public final C01GW LL = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(325));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2217));
    public C21696019va LLILLL = (C21696019va) this.itemView.findViewById(R.id.qe7);

    @Override // X.InterfaceC713360RyY
    public final ViewModelStoreOwner LLIIIILZ() {
        return (ViewModelStoreOwner) this.LLILLJJLI.getValue();
    }

    public PhotoModeCell() {
        C628500Oky.LIZ(new AwS577S0100000_33(this, 2215));
        C628500Oky.LIZ(new AwS577S0100000_33(this, 2216));
    }

    @Override // X.InterfaceC713360RyY
    public final InterfaceC665370Q7z k0() {
        return C1196320hEk.LIZ(this);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        View view = this.itemView;
        this.LLILLL = view != null ? (C21696019va) view.findViewById(R.id.qe7) : null;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        int iLIZIZ;
        int iLIZIZ2;
        Float f;
        boolean z;
        boolean z2;
        boolean z3;
        int iLIZ;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        C21694819vO c21694819vO = (C21694819vO) interfaceC1891350zJl;
        super.onBindItemView(c21694819vO);
        if (c21694819vO.LLILLJJLI == 0) {
            iLIZIZ = 0;
        } else {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3));
        }
        if (c21694819vO.LLILLJJLI == C0S7E.LIZ(c21694819vO.LLILLL) - 1) {
            iLIZIZ2 = 0;
        } else {
            iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3));
        }
        int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(200));
        PhotoModeImage photoModeImage = c21694819vO.LL;
        ViewGroup.LayoutParams layoutParams = null;
        if (photoModeImage != null) {
            f = photoModeImage.aspectRatio;
        } else {
            f = null;
        }
        int iIntValue = ((Number) C714800S2c.LIZ(f, iLIZIZ3, EnumC714820S2e.MULTI).getFirst()).intValue();
        View view = this.itemView;
        if (view != null) {
            layoutParams = view.getLayoutParams();
        }
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            marginLayoutParams.setMargins(iLIZIZ, 0, iLIZIZ2, 0);
        }
        if (C1206504nn.LIZ() && C1386160mAw.LJ(c21694819vO.LLILLL)) {
            z = true;
        } else {
            z = false;
        }
        if (C1206504nn.LIZ() && c21694819vO.LLILZIL && c21694819vO.LLILLJJLI == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        C21696019va c21696019va = this.LLILLL;
        if (c21696019va != null) {
            PhotoModeImage photoModeImage2 = c21694819vO.LL;
            int i = c21694819vO.LLILLJJLI;
            Pair pair = new Pair(Integer.valueOf(iIntValue), Integer.valueOf(iLIZIZ3));
            Aweme aweme = c21694819vO.LLILLL;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            boolean z4 = c21694819vO.LLILZIL;
            if ((!z || c21694819vO.LLILLJJLI != 0) && !z2) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (z) {
                iLIZ = C0S7E.LIZ(aweme);
            } else {
                iLIZ = 0;
            }
            C21696019va.LIZJ(c21696019va, photoModeImage2, i, pair, aweme, scaleType, z4, this, z3, iLIZ, false, z2, 512);
        }
        this.itemView.setTransitionName(C1888107aR.LIZIZ(Integer.valueOf(c21694819vO.LLILLJJLI), c21694819vO.LLILLL.getAid()));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        if (C1261804wi.LIZ()) {
            return C705700RmC.LIZIZ(viewGroup.getContext(), R.layout.cb8, viewGroup, false, false, 52);
        }
        return PowerCell.inflateItemView$default(this, viewGroup, R.layout.cb8, false, 4, null);
    }
}
