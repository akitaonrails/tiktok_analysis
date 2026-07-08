package com.bytedance.android.livesdk.broadcast.preview.onetap.entrance;

import X.C1119170fEJ;
import X.C19EH;
import X.C20736316Cj;
import X.C20743716Ff;
import X.C497740JfY;
import X.C758170Tod;
import X.C785990UsP;
import X.C786410Ut5;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.LiveVisibleScopeSettingFragment;
import com.bytedance.android.livesdk.dataChannel.GroupChatGoLiveAutoApproveSwitch;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public final class GroupGoLiveVisibleScopeSettingSheet extends LiveSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KjcjKCswKTY4Zz8hLTMlLDh9JyHELIOSspPS4jZiAiPT0yJiYpZwghJzA8DiAfITMpHyYgIScgLBwwJzUpGionPCwiLhw7LSA4";
    public DataChannel LLJLLL;

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C1119170fEJ gS() {
        C1119170fEJ c1119170fEJ = new C1119170fEJ();
        c1119170fEJ.LJI = false;
        c1119170fEJ.LIZ(C497740JfY.LJIJI(2131842118));
        ArrayList arrayList = new ArrayList();
        C758170Tod c758170TodVR = VR();
        if (c758170TodVR != null) {
            arrayList.add(c758170TodVR);
        }
        c1119170fEJ.LJ = arrayList;
        return c1119170fEJ;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final int QM(Context context) {
        return C20736316Cj.LIZIZ(R.attr.exw, context);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.LIZ(0, null);
        sheetOptions.cornerRadius = (int) C497740JfY.LIZIZ(26.0f);
        return sheetOptions;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean zBooleanValue;
        Boolean bool;
        super.onViewCreated(view, bundle);
        if (view.findViewById(R.id.j6p) != null) {
            C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
            DataChannel dataChannel = this.LLJLLL;
            String strLJIJI = C497740JfY.LJIJI(2131856078);
            LiveVisibleScopeSettingFragment liveVisibleScopeSettingFragment = new LiveVisibleScopeSettingFragment();
            liveVisibleScopeSettingFragment.LL = dataChannel;
            liveVisibleScopeSettingFragment.LLILLJJLI = strLJIJI;
            liveVisibleScopeSettingFragment.LLILLL = false;
            c19ehLJIIJ.LJIJ(R.id.j6p, liveVisibleScopeSettingFragment, null);
            c19ehLJIIJ.LJIIJJI();
        }
        C20743716Ff c20743716Ff = (C20743716Ff) view.findViewById(R.id.bdf);
        if (c20743716Ff != null) {
            DataChannel dataChannel2 = this.LLJLLL;
            if (dataChannel2 != null && (bool = (Boolean) dataChannel2.gg0(GroupChatGoLiveAutoApproveSwitch.class)) != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = true;
            }
            c20743716Ff.setChecked(zBooleanValue);
            C786410Ut5.A7(c20743716Ff, new C785990UsP(this, 15));
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.gon, viewGroup, false);
    }
}
