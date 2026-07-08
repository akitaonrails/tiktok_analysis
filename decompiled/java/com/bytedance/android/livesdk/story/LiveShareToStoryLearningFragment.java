package com.bytedance.android.livesdk.story;

import X.C01GW;
import X.C20736316Cj;
import X.C452501pT;
import X.C497740JfY;
import X.C786410Ut5;
import Y.ACListenerS152S0100000_17;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS561S0100000_17;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveShareToStoryLearningFragment extends LiveSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9OzEjOzHELIOSZ9BCw6LBw7KTcpHSAAPCo+MAM2KTciICE0DjctLiI2JjE=";
    public final C01GW LLJLLL = C452501pT.LIZIZ(new AwS561S0100000_17(this, 248));
    public final C01GW LLJZ = C452501pT.LIZIZ(new AwS561S0100000_17(this, 249));

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final int QM(Context context) {
        return C20736316Cj.LIZIZ(R.attr.ezk, context);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        View viewFindViewById = view.findViewById(R.id.v23);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadii(new float[]{(int) C497740JfY.LIZIZ(15.0f), (int) C497740JfY.LIZIZ(15.0f), (int) C497740JfY.LIZIZ(15.0f), (int) C497740JfY.LIZIZ(15.0f), 0.0f, 0.0f, 0.0f, 0.0f});
        gradientDrawable.setColor(C20736316Cj.LIZIZ(R.attr.ezk, getContext()));
        viewFindViewById.setBackground(gradientDrawable);
        C786410Ut5.I7(new ACListenerS152S0100000_17(this, 72), view.findViewById(R.id.lc0));
        C786410Ut5.I7(new ACListenerS152S0100000_17(this, 73), view.findViewById(R.id.v25));
        view.findViewById(R.id.v1z).setBackground((Drawable) this.LLJLLL.getValue());
        view.findViewById(R.id.v20).setBackground((Drawable) this.LLJLLL.getValue());
        view.findViewById(R.id.v21).setBackground((Drawable) this.LLJLLL.getValue());
        view.findViewById(R.id.v29).setBackground((Drawable) this.LLJZ.getValue());
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.hlw, viewGroup, false);
    }
}
