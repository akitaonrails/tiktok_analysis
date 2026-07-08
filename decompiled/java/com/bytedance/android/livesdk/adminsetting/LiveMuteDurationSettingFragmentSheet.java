package com.bytedance.android.livesdk.adminsetting;

import X.C01GW;
import X.C0TVI;
import X.C1119170fEJ;
import X.C1161920gLG;
import X.C14K9;
import X.C16FZ;
import X.C20097313kJ;
import X.C292401Bi;
import X.C497740JfY;
import X.C500260Jjc;
import X.C745220TLc;
import X.C745260TLg;
import X.C758170Tod;
import X.C786410Ut5;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.adminsetting.IAdminSettingService;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.live.usermanage.IUserManageService;
import com.bytedance.android.livesdk.userservice.UserService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AwS378S0200000_12;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class LiveMuteDurationSettingFragmentSheet extends LiveSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KSEhICEgLTE4ICHELIOSE0ZgklPyoePTEpDTohKTElJiEALTE4ICE0DjctLiI2JjEfISo2PA==";
    public C16FZ LLJLLL;
    public RecyclerView LLJZ;
    public C745220TLc LLJZIJLIL;
    public C745220TLc LLL;
    public final C01GW LLLF = C292401Bi.LIZ(new AwS556S0100000_12(this, 126));

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C1119170fEJ gS() {
        C1119170fEJ c1119170fEJ = new C1119170fEJ();
        c1119170fEJ.LIZ(C497740JfY.LJIJI(2131842783));
        ArrayList arrayList = new ArrayList();
        C758170Tod c758170TodVR = VR();
        if (c758170TodVR != null) {
            arrayList.add(c758170TodVR);
        }
        c1119170fEJ.LJ = arrayList;
        return c1119170fEJ;
    }

    public final C16FZ getLoadingViewFromXml() {
        View viewFindViewById = this.LLJLLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.nnp) : null;
            this.LLJLLL = (C16FZ) viewFindViewById;
        }
        return (C16FZ) viewFindViewById;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        C745220TLc c745220TLc = this.LLJZIJLIL;
        if (c745220TLc != null) {
            ((IAdminSettingService) C1161920gLG.LIZJ(IAdminSettingService.class)).VI2("anchor", c745220TLc, "live_take_page", UserService.getInstance().user().getCurrentUserId(), null);
            this.LLJZIJLIL = null;
        }
        super.onDestroy();
    }

    public final RecyclerView uS() {
        View viewFindViewById = this.LLJZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.gci) : null;
            this.LLJZ = (RecyclerView) viewFindViewById;
        }
        return (RecyclerView) viewFindViewById;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLJLLL = null;
        this.LLJZ = null;
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

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C500260Jjc.LLFFF(getLoadingViewFromXml());
        uS().setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        Context context = getContext();
        if (context != null) {
            C745260TLg c745260TLg = new C745260TLg(context, true);
            c745260TLg.LLILZLL = new AwS378S0200000_12(this, c745260TLg, 16);
            uS().setAdapter(c745260TLg);
            ((IUserManageService) C1161920gLG.LIZJ(IUserManageService.class)).OP1(new AwS378S0200000_12(this, c745260TLg, 17));
        }
        C14K9.LJIJJ(uS(), new C0TVI() { // from class: X.0TYH
            @Override // X.C0TVI
            public final C20246014Ju onApplyWindowInsets(View view2, C20246014Ju c20246014Ju) {
                float fLIZIZ;
                if (c20246014Ju.LIZ.LJIIJ().LIZLLL > 0) {
                    fLIZIZ = C497740JfY.LIZIZ(12.0f);
                } else {
                    fLIZIZ = C497740JfY.LIZIZ(28.0f);
                }
                view2.setPadding(view2.getPaddingLeft(), view2.getPaddingTop(), view2.getPaddingRight(), (int) fLIZIZ);
                return c20246014Ju;
            }
        });
        C20097313kJ.LIZJ(uS());
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.gah, viewGroup, false);
    }
}
