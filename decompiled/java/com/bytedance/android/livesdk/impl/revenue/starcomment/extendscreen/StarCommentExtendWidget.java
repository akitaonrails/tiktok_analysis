package com.bytedance.android.livesdk.impl.revenue.starcomment.extendscreen;

import X.C0J8P;
import X.C1110110ezh;
import X.C1110130ezj;
import X.C1116210f9X;
import X.C1116220f9Y;
import X.C1117370fBP;
import X.C781570UlH;
import X.C786410Ut5;
import X.InterfaceC1116290f9f;
import X.ViewOnClickListenerC751210TdP;
import Y.ACListenerS152S0100000_17;
import Y.AObserverS181S0200000_17;
import Y.AsS44S0100000_17;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.api.revenue.crm.FullScreenCsCompanionSetting;
import com.bytedance.android.livesdk.impl.revenue.starcomment.datacenter.StarCommentViewModel;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes18.dex */
public final class StarCommentExtendWidget extends LiveWidget {
    public TextView LL;
    public C781570UlH LLILLJJLI;
    public View LLILLL;
    public boolean LLILZ;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.gfx;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        InterfaceC1116290f9f interfaceC1116290f9f;
        StarCommentViewModel starCommentViewModelLIZ;
        MutableLiveData<C1116220f9Y> mutableLiveData;
        super.onCreate();
        View viewFindViewById = findViewById(R.id.u2q);
        this.LLILLL = viewFindViewById;
        if (viewFindViewById != null) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById);
        }
        View view = this.LLILLL;
        if (view != null) {
            C786410Ut5.I7(new ViewOnClickListenerC751210TdP(new ACListenerS152S0100000_17(this, 205)), view);
        }
        this.LL = (TextView) findViewById(R.id.fyi);
        C781570UlH c781570UlH = (C781570UlH) findViewById(R.id.fyh);
        this.LLILLJJLI = c781570UlH;
        if (c781570UlH != null) {
            c781570UlH.setHasFixedSize(true);
        }
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.context, 1, false);
        linearLayoutManager.setStackFromEnd(true);
        C781570UlH c781570UlH2 = this.LLILLJJLI;
        if (c781570UlH2 != null) {
            c781570UlH2.setLayoutManager(linearLayoutManager);
        }
        C781570UlH c781570UlH3 = this.LLILLJJLI;
        if (c781570UlH3 != null) {
            c781570UlH3.addOnScrollListener(new AsS44S0100000_17(this, 9));
        }
        C781570UlH c781570UlH4 = this.LLILLJJLI;
        if (c781570UlH4 != null) {
            C1117370fBP c1117370fBP = new C1117370fBP();
            final DataChannel dataChannel = this.dataChannel;
            c1117370fBP.LLILLL.LLLI(C1116210f9X.class, new C0J8P<C1116210f9X, C1110130ezj>(dataChannel) { // from class: X.0ezl
                public final DataChannel LIZIZ;

                {
                    this.LIZIZ = dataChannel;
                }

                @Override // X.C0J8P
                public final void LIZJ(RecyclerView.ViewHolder viewHolder, C1116210f9X c1116210f9X) {
                    String strLJIJJ;
                    C1110130ezj c1110130ezj = (C1110130ezj) viewHolder;
                    C1116210f9X c1116210f9X2 = c1116210f9X;
                    c1110130ezj.I5(c1116210f9X2, this.LIZIZ);
                    C786410Ut5.LJLLLLLL(8, c1110130ezj.LLIZ);
                    User user = c1116210f9X2.LLJJI;
                    if (user != null) {
                        C786410Ut5.LLIL(c1110130ezj.LLILZLL, 0);
                        TextView textView = c1110130ezj.LLILZLL;
                        if (user.getId() == UserService.getInstance().user().getCurrentUserId()) {
                            strLJIJJ = C497740JfY.LJIJI(2131844100);
                        } else {
                            strLJIJJ = C497740JfY.LJIJJ(2131844099, C0KVU.LIZ(user));
                        }
                        textView.setText(strLJIJJ);
                    }
                }

                @Override // X.C0J8P
                /* JADX INFO: renamed from: LJ */
                public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                    int i;
                    if (FullScreenCsCompanionSetting.INSTANCE.getValue(null) > 0) {
                        i = R.layout.gfw;
                    } else {
                        i = R.layout.gfv;
                    }
                    return new C1110130ezj(C786410Ut5.Td(layoutInflater, i, viewGroup, false));
                }
            });
            DataChannel dataChannel2 = this.dataChannel;
            if (dataChannel2 != null && (interfaceC1116290f9f = (InterfaceC1116290f9f) dataChannel2.gg0(C1110110ezh.class)) != null && (starCommentViewModelLIZ = interfaceC1116290f9f.LIZ()) != null && (mutableLiveData = starCommentViewModelLIZ.LL) != null) {
                mutableLiveData.observe(this, new AObserverS181S0200000_17(this, c1117370fBP, 13));
            }
            c781570UlH4.setAdapter(c1117370fBP);
        }
    }
}
