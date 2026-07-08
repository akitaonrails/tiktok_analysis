package com.ss.android.ugc.nearby.locationpermission;

import X.C1189060h32;
import X.C1204570hS3;
import X.C1204810hSR;
import X.C1209080hZK;
import X.C1220000hqw;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C13LE;
import X.C1558360qeg;
import X.C1558520qew;
import X.C197039127h;
import X.C2188811AlT;
import X.C2211751BhN;
import X.C452070Ho5;
import X.C724750Sbp;
import X.C736950SvV;
import X.C786410Ut5;
import X.C960203pA;
import X.InterfaceC1891350zJl;
import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.nearby.container.ability.IFeedContentAbility;
import com.ss.android.ugc.nearby.feedcard.vm.NearbyFeedSharedViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS32S0001000_18;
import wh6.AbS699S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class NearbyFeedAskLocationChangeCell extends PowerCell<C1204810hSR> {
    public TuxTextView LL;
    public C197039127h LLILLJJLI;
    public C197039127h LLILLL;
    public SmartImageView LLILZ;
    public TuxIconView LLILZIL;
    public View LLILZLL;
    public final C736950SvV LLIZ;

    public NearbyFeedAskLocationChangeCell() {
        AFwS206S0000000_18 aFwS206S0000000_18 = AFwS206S0000000_18.get$arr$(633);
        this.LLIZ = new C736950SvV(C13LE.LIZ(NearbyFeedSharedViewModel.class), aFwS206S0000000_18, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS256S0000000_18.get$arr$(802), null, null, null);
    }

    public final int I5() {
        IFeedContentAbility iFeedContentAbility;
        int bindingAdapterPosition = getBindingAdapterPosition();
        Fragment fragmentLJIIJ = C1189060h32.LJIIJ(this);
        return bindingAdapterPosition - ((fragmentLJIIJ == null || (iFeedContentAbility = (IFeedContentAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJIIJ, null), IFeedContentAbility.class, null)) == null) ? 0 : iFeedContentAbility.hq1());
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        boolean z;
        Context context;
        View view = this.LLILZLL;
        if (view != null && (context = view.getContext()) != null && true == C960203pA.LIZIZ(context)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            TypedValue typedValue = new TypedValue();
            this.itemView.getContext().getTheme().resolveAttribute(R.attr.a1d, typedValue, true);
            int i = typedValue.data;
            C197039127h c197039127h = this.LLILLJJLI;
            if (c197039127h != null) {
                c197039127h.LJJJJL(new AwS32S0001000_18(i, 9));
            }
            C197039127h c197039127h2 = this.LLILLL;
            if (c197039127h2 != null) {
                c197039127h2.LJJJJL(new AwS32S0001000_18(i, 9));
            }
            C1331670kl3 c1331670kl3LJFF = C1331660kl2.LJFF(R.drawable.cp8);
            c1331670kl3LJFF.LIZLLL("nearby_location_background");
            c1331670kl3LJFF.LJJ(this.LLILZ);
            C786410Ut5.h3(c1331670kl3LJFF);
        } else {
            TypedValue typedValue2 = new TypedValue();
            this.itemView.getContext().getTheme().resolveAttribute(R.attr.a0o, typedValue2, true);
            int i2 = typedValue2.data;
            C197039127h c197039127h3 = this.LLILLJJLI;
            if (c197039127h3 != null) {
                c197039127h3.LJJJJL(new AwS32S0001000_18(i2, 9));
            }
            C197039127h c197039127h4 = this.LLILLL;
            if (c197039127h4 != null) {
                c197039127h4.LJJJJL(new AwS32S0001000_18(i2, 9));
            }
            C1331670kl3 c1331670kl3LJFF2 = C1331660kl2.LJFF(R.drawable.cp9);
            c1331670kl3LJFF2.LIZLLL("nearby_location_background");
            c1331670kl3LJFF2.LJJ(this.LLILZ);
            C786410Ut5.h3(c1331670kl3LJFF2);
        }
        Context context2 = this.itemView.getContext();
        C1204570hS3.LIZIZ.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LocationChangeCard get() enterNearbyTimeLastTime = ");
        sbLIZ.append(C1204570hS3.LIZJ);
        C2188811AlT.LIZIZ(sbLIZ);
        int i3 = 7;
        if (((int) ((((System.currentTimeMillis() - C1204570hS3.LIZJ) + 86400000) - 1) / 86400000)) > 7) {
            i3 = 30;
        }
        String string = context2.getString(2131837908, context2.getResources().getQuantityString(2131755428, i3, Integer.valueOf(i3)));
        TuxTextView tuxTextView = this.LL;
        if (tuxTextView != null) {
            tuxTextView.setText(string);
        }
        TuxIconView tuxIconView = this.LLILZIL;
        if (tuxIconView != null) {
            C786410Ut5.I7(new AbS699S0100000_18(this, 57, 42), tuxIconView);
        }
        C197039127h c197039127h5 = this.LLILLJJLI;
        if (c197039127h5 != null) {
            C786410Ut5.I7(new AbS699S0100000_18(this, 58, 42), c197039127h5);
        }
        C197039127h c197039127h6 = this.LLILLL;
        if (c197039127h6 != null) {
            C786410Ut5.I7(new AbS699S0100000_18(this, 59, 42), c197039127h6);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.drz, viewGroup, false);
        this.LLILZLL = viewTd;
        C1204570hS3.LIZIZ.LJIIIIZZ(true);
        viewTd.findViewById(R.id.p4a);
        this.LLILLJJLI = (C197039127h) viewTd.findViewById(R.id.cqx);
        this.LLILLL = (C197039127h) viewTd.findViewById(R.id.cqy);
        this.LLILZ = (SmartImageView) viewTd.findViewById(R.id.dri);
        this.LL = (TuxTextView) viewTd.findViewById(R.id.tv_permission_desc);
        this.LLILZIL = (TuxIconView) viewTd.findViewById(R.id.e2j);
        View view = this.LLILZLL;
        if (view != null) {
            C2211751BhN.LIZ(view, new C1209080hZK(this, 7));
        }
        return viewTd;
    }
}
