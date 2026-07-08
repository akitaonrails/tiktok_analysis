package com.ss.android.ugc.aweme.vibefeed.feed;

import X.C1372310lob;
import X.C2189821An6;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C679360Qko;
import X.C786410Ut5;
import X.C814420VxA;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import com.ss.android.ugc.aweme.analysis.Analysis;
import com.ss.android.ugc.aweme.detail.platform.DetailPageComponent;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes22.dex */
public abstract class SimpleVibeDetailPageComponent extends DetailPageComponent {
    @Override // com.ss.android.ugc.aweme.detail.platform.DetailPageComponent, com.ss.android.ugc.aweme.detail.platform.IDetailPageAbility
    public final Analysis getAnalysis() {
        Analysis analysis = new Analysis();
        C2189821An6 c2189821An6 = getPanelContext().LIZJ;
        analysis.setLabelName(c2189821An6 != null ? c2189821An6.getEventType() : null);
        return analysis;
    }

    @Override // com.ss.android.ugc.aweme.detail.platform.DetailPageComponent, com.ss.android.ugc.aweme.detail.platform.IDetailLifecycleAbility
    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    @Override // com.ss.android.ugc.aweme.detail.platform.DetailPageComponent
    public final void onDislikeAwemeEvent(C1372310lob c1372310lob) {
        View viewFindViewById;
        super.onDislikeAwemeEvent(c1372310lob);
        boolean z = c1372310lob.LIZ;
        View view = getFragment().getView();
        if (view != null && (viewFindViewById = view.findViewById(R.id.fdn)) != null) {
            if (z) {
                C679360Qko.LIZ(viewFindViewById.getAlpha(), 0.0f, viewFindViewById);
            } else {
                C679360Qko.LIZ(viewFindViewById.getAlpha(), 1.0f, viewFindViewById);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.platform.DetailPageComponent, com.ss.android.ugc.aweme.detail.platform.IDetailLifecycleAbility
    public void onViewCreated(View view, Bundle bundle) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        super.onViewCreated(view, bundle);
        ImageView imageView = (ImageView) view.findViewById(R.id.bn2);
        if (imageView != null) {
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
                marginLayoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44));
                marginLayoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
                imageView.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)));
                C786410Ut5.c6(imageView, marginLayoutParams);
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = R.raw.icon_chevron_left_offset_ltr;
                c419910GdJ.LJ = Integer.valueOf(R.attr.ee);
                imageView.setImageDrawable(c419910GdJ.LIZ(imageView.getContext()));
            }
        }
        ViewStub viewStub = (ViewStub) view.findViewById(R.id.fdo);
        if (viewStub != null) {
            viewStub.setLayoutResource(R.layout.i83);
            C786410Ut5.LJLLLL(viewStub);
        }
    }
}
