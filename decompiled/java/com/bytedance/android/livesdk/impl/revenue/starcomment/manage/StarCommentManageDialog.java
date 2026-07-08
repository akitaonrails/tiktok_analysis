package com.bytedance.android.livesdk.impl.revenue.starcomment.manage;

import X.C0DXR;
import X.C0IJT;
import X.C0J8P;
import X.C0TZM;
import X.C1110110ezh;
import X.C1110130ezj;
import X.C1116200f9W;
import X.C1116210f9X;
import X.C1117370fBP;
import X.C474500IjA;
import X.C497740JfY;
import X.C500260Jjc;
import X.C786410Ut5;
import X.InterfaceC1116290f9f;
import X.RunnableC781530UlD;
import X.ViewOnClickListenerC751210TdP;
import Y.ACListenerS147S0100000_12;
import Y.AObserverS181S0200000_17;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.impl.revenue.starcomment.datacenter.StarCommentViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public abstract class StarCommentManageDialog extends DarkDialogFragment {
    public LinearLayout LL;
    public RunnableC781530UlD LLILLJJLI;
    public LiveIconView LLILLL;
    public String LLILZ = "";

    public abstract void OR(boolean z);

    public void clearFromXmlViewCache() {
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
    }

    @Override // com.bytedance.android.livesdk.impl.revenue.starcomment.manage.DarkDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    public final LinearLayout MR() {
        View viewFindViewById = this.LL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.bp1) : null;
            this.LL = (LinearLayout) viewFindViewById;
        }
        return (LinearLayout) viewFindViewById;
    }

    public final RunnableC781530UlD NR() {
        View viewFindViewById = this.LLILLJJLI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.t0q) : null;
            this.LLILLJJLI = (RunnableC781530UlD) viewFindViewById;
        }
        return (RunnableC781530UlD) viewFindViewById;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        clearFromXmlViewCache();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Boolean bool;
        InterfaceC1116290f9f interfaceC1116290f9f;
        StarCommentViewModel starCommentViewModelLIZ;
        MutableLiveData<List<C1116210f9X>> mutableLiveData;
        super.onViewCreated(view, bundle);
        DataChannel dataChannel = this.dataChannel;
        View viewFindViewById = null;
        if (dataChannel != null) {
            bool = (Boolean) dataChannel.gg0(C0TZM.class);
        } else {
            bool = null;
        }
        if (C500260Jjc.LJJIJIL(bool)) {
            MR().setBackgroundResource(R.drawable.e7n);
        } else if (!C497740JfY.LJJ()) {
            MR().setBackgroundResource(R.drawable.e7o);
        } else {
            MR().setBackgroundResource(R.drawable.e7p);
        }
        NR().setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        RunnableC781530UlD runnableC781530UlDNR = NR();
        C1117370fBP c1117370fBP = new C1117370fBP();
        final boolean z = true ^ (this instanceof AudienceStarCommentManageDialog);
        final DataChannel dataChannel2 = this.dataChannel;
        c1117370fBP.LLILLL.LLLI(C1116210f9X.class, new C0J8P<C1116210f9X, C1110130ezj>(dataChannel2, z) { // from class: X.0ezk
            public final boolean LIZIZ;
            public final DataChannel LIZJ;

            {
                this.LIZIZ = z;
                this.LIZJ = dataChannel2;
            }

            @Override // X.C0J8P
            public final void LIZJ(RecyclerView.ViewHolder viewHolder, C1116210f9X c1116210f9X) {
                C1110130ezj c1110130ezj = (C1110130ezj) viewHolder;
                C1116210f9X c1116210f9X2 = c1116210f9X;
                if (this.LIZIZ) {
                    c1110130ezj.I5(c1116210f9X2, this.LIZJ);
                } else {
                    c1110130ezj.L5(c1116210f9X2, false);
                }
            }

            @Override // X.C0J8P
            /* JADX INFO: renamed from: LJ */
            public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                return new C1110130ezj(C786410Ut5.Td(layoutInflater, R.layout.gvf, viewGroup, false));
            }

            @Override // X.C0J8P
            public final void LIZLLL(RecyclerView.ViewHolder viewHolder, C1116210f9X c1116210f9X, List list) {
                C1110130ezj c1110130ezj = (C1110130ezj) viewHolder;
                C1116210f9X c1116210f9X2 = c1116210f9X;
                if (this.LIZIZ) {
                    c1110130ezj.I5(c1116210f9X2, this.LIZJ);
                } else {
                    c1110130ezj.L5(c1116210f9X2, !list.isEmpty());
                }
            }
        });
        DataChannel dataChannel3 = this.dataChannel;
        if (dataChannel3 != null && (interfaceC1116290f9f = (InterfaceC1116290f9f) dataChannel3.gg0(C1110110ezh.class)) != null && (starCommentViewModelLIZ = interfaceC1116290f9f.LIZ()) != null && (mutableLiveData = starCommentViewModelLIZ.LLILLL) != null) {
            mutableLiveData.observe(getViewLifecycleOwner(), new AObserverS181S0200000_17(c1117370fBP, this, 0));
        }
        runnableC781530UlDNR.setAdapter(c1117370fBP);
        NR().addItemDecoration(new C0DXR() { // from class: X.0Ggt
            public final Paint LL;
            public final float LLILLJJLI;
            public final float LLILLL;

            {
                Paint paint = new Paint();
                paint.setColor(ColorProtector.parseColor("#99FFFFFF"));
                C1119920fFW.LIZLLL(C497740JfY.LJII(), paint, 6, 400);
                paint.setTextAlign(Paint.Align.CENTER);
                this.LL = paint;
                this.LLILLJJLI = ((paint.getFontMetrics().bottom - paint.getFontMetrics().top) / 2) - paint.getFontMetrics().bottom;
                this.LLILLL = C497740JfY.LJJ() ? C497740JfY.LJIIZILJ() - ((int) C497740JfY.LIZIZ(20.0f)) : (int) C497740JfY.LIZIZ(20.0f);
            }

            @Override // X.C0DXR
            public final void LIZLLL(Canvas canvas, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                int childCount = recyclerView.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    int childAdapterPosition = recyclerView.getChildAdapterPosition(recyclerView.getChildAt(i));
                    if (childAdapterPosition != -1) {
                        canvas.drawText(String.valueOf(childAdapterPosition + 1), this.LLILLL, ((r6.getTop() + r6.getBottom()) / 2.0f) + this.LLILLJJLI, this.LL);
                    }
                }
            }
        });
        View view2 = this.LLILLL;
        if (view2 == null) {
            View view3 = getView();
            if (view3 != null) {
                viewFindViewById = view3.findViewById(R.id.hor);
            }
            this.LLILLL = (LiveIconView) viewFindViewById;
            view2 = viewFindViewById;
        }
        C786410Ut5.g8((LiveIconView) view2, new ViewOnClickListenerC751210TdP(new ACListenerS147S0100000_12(this, 31)));
        DataChannel dataChannel4 = this.dataChannel;
        if (dataChannel4 != null) {
            String str = this.LLILZ;
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_star_comment_list_show");
            C1116200f9W.LJ(c474500IjALIZ, dataChannel4);
            c474500IjALIZ.LJJII(str, "list_position");
            c474500IjALIZ.LIZ();
        }
    }
}
