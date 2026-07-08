package com.bytedance.android.livesdk.sheet;

import X.C16F5;
import X.C786410Ut5;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes32.dex */
public final class SheetLoremFragment extends SheetDemoFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/HELIOSLSR9Oy0pLDt9Gy0pLDsfJzcpJAkhKSIhLCEn";
    public C16F5 LLLZL;

    @Override // com.bytedance.android.livesdk.sheet.SheetDemoFragment
    public final boolean fT() {
        return false;
    }

    @Override // com.bytedance.android.livesdk.sheet.SheetDemoFragment
    public final void clearFromXmlViewCache() {
        super.clearFromXmlViewCache();
        this.LLLZL = null;
    }

    @Override // com.bytedance.android.livesdk.sheet.SheetDemoFragment, com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        clearFromXmlViewCache();
    }

    @Override // com.bytedance.android.livesdk.sheet.SheetDemoFragment, com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        int i = 500;
        if (arguments != null) {
            i = arguments.getInt("character_count", 500);
        }
        View viewFindViewById = this.LLLZL;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.nr2);
            } else {
                viewFindViewById = null;
            }
            this.LLLZL = (C16F5) viewFindViewById;
        }
        TextView textView = (TextView) viewFindViewById;
        if (3315 <= i) {
            i = 3315;
        }
        textView.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam luctus bibendum bibendum. Curabitur ornare, ex vitae cursus consectetur, metus purus rhoncus magna, in vehicula ligula ante ac orci. Ut nec est ut mauris dictum varius. Maecenas sed iaculis eros, sed eleifend metus. Donec eget nulla congue, elementum ipsum at, efficitur metus. Maecenas non fermentum velit. Nunc in lacus maximus, ultrices metus in, pellentesque ligula. Vivamus eget dui elementum, tempus neque sed, lacinia nibh. Fusce in ex et risus ultrices scelerisque id sed metus. Nullam et posuere ante. Cras iaculis elementum euismod. Maecenas consectetur risus faucibus lacus egestas gravida.\n\nVivamus lacinia venenatis dolor at aliquet. Nullam pharetra, velit id elementum eleifend, nunc lacus varius purus, id blandit lectus lorem vitae ante. Nunc dolor elit, vestibulum a dui ac, gravida facilisis ligula. Ut at pharetra sapien. Cras vulputate odio quis dictum sagittis. Sed dapibus ultricies viverra. Morbi suscipit ultrices risus, in laoreet enim posuere sed. Sed ut nulla quam. Mauris aliquam purus eu sapien gravida auctor. In condimentum turpis non orci hendrerit, vel consequat sem rhoncus. Mauris vitae laoreet odio. Quisque rutrum tempor justo quis pharetra. Vestibulum vel sagittis tellus. Aliquam convallis facilisis ipsum molestie luctus. Sed dignissim mauris id lectus condimentum euismod.\n\nAliquam nunc ante, dictum ac porttitor sed, efficitur non nisl. Sed faucibus lacus a massa tempor luctus. Aenean in eros finibus, feugiat diam ut, auctor nunc. Pellentesque nec euismod ligula. Sed tempor a risus vitae dapibus. Donec hendrerit mattis lacus, vitae pulvinar lacus dictum vitae. Aenean eget augue nunc. Donec iaculis ut tortor ut lobortis. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Proin consequat porttitor nisl, nec sollicitudin justo. Suspendisse ac sagittis ex.\n\nPellentesque ac ex sodales nunc volutpat luctus in a est. Duis vestibulum maximus sagittis. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Nam consectetur urna sit amet magna laoreet, et consequat tortor ultricies. Mauris ac tincidunt orci. Morbi ac ipsum augue. Aenean gravida rutrum sodales. Donec quis scelerisque erat. Sed maximus nisi ut tempus cursus. Proin consequat in diam id fringilla. Pellentesque sodales tortor sed nunc lacinia, in imperdiet nulla suscipit. Morbi vitae suscipit orci. Donec in laoreet turpis. Sed malesuada vestibulum velit. Curabitur sit amet porttitor orci.\n\nUt vel eros pretium, sollicitudin ligula vitae, mattis ligula. Proin purus sem, interdum eu ultrices et, tristique in dolor. Praesent magna metus, eleifend et tristique vitae, fermentum vitae quam. Proin maximus varius sem id mattis. Etiam blandit luctus dui et pulvinar. Etiam rhoncus, lorem nec venenatis fermentum, justo arcu ultrices tellus, in faucibus justo quam id neque. Etiam orci sem, sagittis vitae viverra non, ultrices sit amet tortor. Nunc sed turpis varius odio finibus consectetur suscipit sit amet dolor. Donec quis mi in dolor congue placerat id a justo. Curabitur sit amet consectetur libero, quis eleifend lectus. Morbi auctor, odio a finibus vehicula, libero elit pulvinar ex, et elementum augue metus ultricies tortor. Aenean vitae ligula metus.".subSequence(0, i));
    }

    @Override // com.bytedance.android.livesdk.sheet.SheetDemoFragment, com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.d8m, viewGroup, false);
    }
}
