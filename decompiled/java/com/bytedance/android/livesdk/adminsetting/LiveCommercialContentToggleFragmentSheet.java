package com.bytedance.android.livesdk.adminsetting;

import X.C01GW;
import X.C0UO0;
import X.C1119170fEJ;
import X.C16FS;
import X.C20743716Ff;
import X.C20744116Fj;
import X.C23250099c;
import X.C292401Bi;
import X.C474500IjA;
import X.C480460Ism;
import X.C497740JfY;
import X.C500260Jjc;
import X.C752580Tfc;
import X.C758170Tod;
import X.C758920Tpq;
import X.C759160TqE;
import X.C772130UQp;
import X.C786410Ut5;
import X.C817503Hh;
import Y.ACListenerS147S0100000_12;
import Y.AfS148S0200000_12;
import Y.AfS181S0100000_12;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.live.adminsetting.CommercialContentToggleApi;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.live.slot.model.ECBcToggleChannel;
import com.bytedance.android.livesdk.chatroom.model.ContentDisclosureSettings;
import com.bytedance.android.livesdkapi.depend.model.live.CommercialContentToggle;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.google.gson.n;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class LiveCommercialContentToggleFragmentSheet extends LiveSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KSEhICEgLTE4ICE0HELIOSZgklPyoQJyghLD0wISQgCiA9PCAiPRs8LyIgLAkhKSIhLCEnGy0pLDs=";
    public ConstraintLayout LLJLLL;
    public LiveIconView LLJZ;
    public C20743716Ff LLJZIJLIL;
    public C20744116Fj LLL;
    public C20744116Fj LLLF;
    public C16FS LLLFF;
    public View LLLFFI;
    public View LLLFZ;
    public View LLLI;
    public FrameLayout LLLII;
    public ConstraintLayout LLLIIII;
    public ConstraintLayout LLLIIIIL;
    public boolean LLLIIL;
    public boolean LLLIILIL;
    public boolean LLLIL;
    public boolean LLLILZ;
    public LiveMode LLLILZJ;
    public boolean LLLILZLLLI;
    public boolean LLLJ;
    public boolean LLLJIL;
    public boolean LLLJL;
    public boolean LLLL;
    public CommercialContentToggle LLLLIIL;
    public final C01GW LLLIIIL = C292401Bi.LIZ(new AwS556S0100000_12(this, 123));
    public final C758920Tpq LLLIZZ = (C758920Tpq) DataChannelGlobal.LLILZ.gg0(ECBcToggleChannel.class);
    public boolean LLLLII = true;
    public int LLLLIIIILLL = 3;

    public final C20744116Fj BS() {
        View viewFindViewById = this.LLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.cjg) : null;
            this.LLL = (C20744116Fj) viewFindViewById;
        }
        return (C20744116Fj) viewFindViewById;
    }

    public final View ES() {
        View viewFindViewById = this.LLLFFI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.cjh) : null;
            this.LLLFFI = viewFindViewById;
        }
        return viewFindViewById;
    }

    public final C16FS FS() {
        View viewFindViewById = this.LLLFF;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.cuk) : null;
            this.LLLFF = (C16FS) viewFindViewById;
        }
        return (C16FS) viewFindViewById;
    }

    public final C20743716Ff GS() {
        View viewFindViewById = this.LLJZIJLIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.ek6) : null;
            this.LLJZIJLIL = (C20743716Ff) viewFindViewById;
        }
        return (C20743716Ff) viewFindViewById;
    }

    public final View HS() {
        View viewFindViewById = this.LLLI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.ek8) : null;
            this.LLLI = viewFindViewById;
        }
        return viewFindViewById;
    }

    public final void NS() {
        if (this.LLLIIL || !this.LLLIILIL || GS().isChecked()) {
            return;
        }
        GS().setChecked(true);
        wS(GS().isChecked());
    }

    public final void QS() {
        ContentDisclosureSettings contentDisclosureSettings = new ContentDisclosureSettings();
        C20743716Ff c20743716FfGS = GS();
        contentDisclosureSettings.openCommercialContentToggle = C500260Jjc.LJJJI(c20743716FfGS != null ? Boolean.valueOf(c20743716FfGS.isChecked()) : null) ? 1 : 2;
        C20744116Fj c20744116FjBS = BS();
        contentDisclosureSettings.promoteMyself = C500260Jjc.LJJJI(c20744116FjBS != null ? Boolean.valueOf(c20744116FjBS.isChecked()) : null) ? 1 : 2;
        C20744116Fj c20744116FjYS = yS();
        contentDisclosureSettings.promoteThirdParty = C500260Jjc.LJJJI(c20744116FjYS != null ? Boolean.valueOf(c20744116FjYS.isChecked()) : null) ? 1 : 2;
        C23250099c.LIZLLL(C817503Hh.LL, null, null, new C752580Tfc(this, contentDisclosureSettings, null), 3);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C1119170fEJ gS() {
        C758170Tod c758170TodVR;
        C1119170fEJ c1119170fEJ = new C1119170fEJ();
        c1119170fEJ.LIZ(C497740JfY.LJIJI(2131841068));
        ArrayList arrayList = new ArrayList();
        if (this.LLLIL && (c758170TodVR = VR()) != null) {
            arrayList.add(c758170TodVR);
        }
        c1119170fEJ.LJ = arrayList;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new C758170Tod(R.attr.ea_, new ACListenerS147S0100000_12(this, 94)));
        c1119170fEJ.LJFF = arrayList2;
        return c1119170fEJ;
    }

    public final C20744116Fj yS() {
        View viewFindViewById = this.LLLF;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.cj0) : null;
            this.LLLF = (C20744116Fj) viewFindViewById;
        }
        return (C20744116Fj) viewFindViewById;
    }

    public final View zS() {
        View viewFindViewById = this.LLLFZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.cj1) : null;
            this.LLLFZ = viewFindViewById;
        }
        return viewFindViewById;
    }

    public final void PS() {
        if (GS().isChecked()) {
            C786410Ut5.LJLLLLLL(0, HS());
            C786410Ut5.LJLLLLLL(0, ES());
            C786410Ut5.LJLLLLLL(0, zS());
        } else {
            C786410Ut5.LJLLLLLL(8, HS());
            C786410Ut5.LJLLLLLL(8, ES());
            C786410Ut5.LJLLLLLL(8, zS());
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        DataChannelGlobal.LLILZ.zQ2(this);
        this.LLJLLL = null;
        this.LLJZ = null;
        this.LLJZIJLIL = null;
        this.LLL = null;
        this.LLLF = null;
        this.LLLFF = null;
        this.LLLFFI = null;
        this.LLLFZ = null;
        this.LLLI = null;
        this.LLLII = null;
        this.LLLIIII = null;
        this.LLLIIIIL = null;
    }

    public final void uS() {
        if (!GS().isChecked() || BS().isChecked() || yS().isChecked()) {
            FS().setClickable(true);
            C786410Ut5.j5(FS(), 1.0f);
            return;
        }
        FS().setClickable(false);
        C786410Ut5.j5(FS(), 0.4f);
        View viewFindViewById = this.LLLII;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.cum) : null;
            this.LLLII = (FrameLayout) viewFindViewById;
        }
        C786410Ut5.O7((FrameLayout) viewFindViewById, new View.OnClickListener() { // from class: X.0TqF
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131841066));
            }
        });
    }

    public final void JS(C474500IjA c474500IjA) {
        if (this.LLLIIL) {
            c474500IjA.LJJII(C772130UQp.LIZ(this.LLLILZ, this.LLLILZLLLI), "anchor_type");
        }
    }

    public final void RS(CommercialContentToggle commercialContentToggle) {
        long id;
        this.LLLLIIL = commercialContentToggle;
        n nVar = new n();
        Room room = (Room) this.LLLIIIL.getValue();
        if (room != null) {
            id = room.getId();
        } else {
            id = 0;
        }
        nVar.LJJIII(Long.valueOf(id), "room_id");
        n nVar2 = new n();
        nVar2.LJJII(Boolean.valueOf(commercialContentToggle.openCommercialContentToggle), "open_commercial_content_toggle");
        nVar2.LJJII(Boolean.valueOf(commercialContentToggle.promoteMyself), "promote_myself");
        nVar2.LJJII(Boolean.valueOf(commercialContentToggle.promoteThirdParty), "promote_third_party");
        nVar.LJJIFFI("data", nVar2);
        C480460Ism.LIZ().getClass();
        ((CommercialContentToggleApi) C480460Ism.LIZLLL(CommercialContentToggleApi.class)).updateCommercialContentToggle(nVar).LJIILIIL(new C0UO0()).LJJLL(new AfS148S0200000_12(commercialContentToggle, this, 22), new AfS181S0100000_12(this, 48));
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.LIZ(2, null);
        return sheetOptions;
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        getActivity();
        return layoutInflaterOnGetLayoutInflater;
    }

    public final void wS(boolean z) {
        View viewFindViewById = null;
        if (z) {
            View viewFindViewById2 = this.LLLIIII;
            if (viewFindViewById2 == null) {
                View view = getView();
                if (view != null) {
                    viewFindViewById2 = view.findViewById(R.id.cjf);
                } else {
                    viewFindViewById2 = null;
                }
                this.LLLIIII = (ConstraintLayout) viewFindViewById2;
            }
            C786410Ut5.LL(0, (ConstraintLayout) viewFindViewById2);
            View view2 = this.LLLIIIIL;
            if (view2 == null) {
                View view3 = getView();
                if (view3 != null) {
                    viewFindViewById = view3.findViewById(R.id.ciz);
                }
                this.LLLIIIIL = (ConstraintLayout) viewFindViewById;
                view2 = viewFindViewById;
            }
            C786410Ut5.LL(0, (ConstraintLayout) view2);
            return;
        }
        View viewFindViewById3 = this.LLLIIII;
        if (viewFindViewById3 == null) {
            View view4 = getView();
            if (view4 != null) {
                viewFindViewById3 = view4.findViewById(R.id.cjf);
            } else {
                viewFindViewById3 = null;
            }
            this.LLLIIII = (ConstraintLayout) viewFindViewById3;
        }
        C786410Ut5.LL(8, (ConstraintLayout) viewFindViewById3);
        View view5 = this.LLLIIIIL;
        if (view5 == null) {
            View view6 = getView();
            if (view6 != null) {
                viewFindViewById = view6.findViewById(R.id.ciz);
            }
            this.LLLIIIIL = (ConstraintLayout) viewFindViewById;
            view5 = viewFindViewById;
        }
        C786410Ut5.LL(8, (ConstraintLayout) view5);
        BS().setChecked(false);
        yS().setChecked(false);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C759160TqE(this, null), 3);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.g54, viewGroup, false);
    }
}
