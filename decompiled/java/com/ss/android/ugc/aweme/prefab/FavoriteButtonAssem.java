package com.ss.android.ugc.aweme.prefab;

import X.C1558360qeg;
import X.C1558520qew;
import X.C197039127h;
import X.C418440Gaw;
import X.C426750GoL;
import X.C724240Sb0;
import X.C786410Ut5;
import X.C814420VxA;
import Y.ACListenerS113S0200000_9;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.dynamic.DynamicAssem;
import com.ss.android.ugc.aweme.prefab.ability.FavoriteAbility;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS36S2100000_9;

/* JADX INFO: loaded from: classes10.dex */
public class FavoriteButtonAssem extends DynamicAssem {
    public static final /* synthetic */ int LLJJIII = 0;
    public C197039127h LLJJI;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return 0;
    }

    public final C197039127h lp() {
        C197039127h c197039127h = this.LLJJI;
        if (c197039127h != null) {
            return c197039127h;
        }
        return null;
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem, com.bytedance.assem.arch.core.UIAssem
    public void xo() {
        Context context = getContext();
        if (context == null) {
            return;
        }
        C197039127h c197039127h = new C197039127h(context, null, 6, 0);
        C786410Ut5.J6(c197039127h, new ViewGroup.LayoutParams(-1, -2));
        C426750GoL.LJIIL(c197039127h, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), 0, 16);
        c197039127h.setMaxWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(200)));
        c197039127h.setText(R.string.cpa);
        c197039127h.LJJJJLI(true);
        c197039127h.setButtonSize(2);
        c197039127h.setButtonVariant(1);
        c197039127h.LJJJLZIJ(Integer.valueOf(R.raw.icon_bookmark), null);
        Zo(c197039127h);
        super.xo();
    }

    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        String string;
        String string2;
        FavoriteAbility favoriteAbility;
        mo127do();
        C197039127h c197039127h = (C197039127h) view;
        this.LLJJI = c197039127h;
        Object obj = getConfig().LLILZ.get("prop_favorite_string");
        if (!(obj instanceof String) || (string = (String) obj) == null) {
            string = c197039127h.getContext().getString(R.string.cpa);
        }
        Object obj2 = getConfig().LLILZ.get("prop_unfavorite_string");
        if (!(obj2 instanceof String) || (string2 = (String) obj2) == null) {
            string2 = c197039127h.getContext().getString(R.string.cpj);
        }
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null && (favoriteAbility = (FavoriteAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI, null), FavoriteAbility.class, null)) != null) {
            favoriteAbility.H30(new AwS36S2100000_9(this, string2, string, 0));
            C786410Ut5.U8(lp(), new ACListenerS113S0200000_9(this, favoriteAbility, 23));
        }
    }
}
