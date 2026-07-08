package com.bytedance.android.livesdk.markviewer;

import X.C01GW;
import X.C0GY9;
import X.C0IJT;
import X.C0J1N;
import X.C0UO0;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C11RD;
import X.C11RK;
import X.C13BV;
import X.C14KS;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C19475711Hn;
import X.C2204961BRm;
import X.C292401Bi;
import X.C474500IjA;
import X.C475510Ikn;
import X.C476130Iln;
import X.C482260Ivg;
import X.C497740JfY;
import X.C500260Jjc;
import X.C750550TcL;
import X.C752860Tg4;
import X.C752870Tg5;
import X.C764830TzN;
import X.C786120Usc;
import X.C786410Ut5;
import X.EnumC748580TYa;
import X.InterfaceC19323110ij;
import Y.ACListenerS147S0100000_12;
import Y.AUListenerS262S0100000_12;
import Y.AfS148S0200000_12;
import Y.AfS181S0100000_12;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.usermanage.MarkUserApi;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.text.a0;
import wh6.AbS694S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class AddMarkedViewerFragmentSheet extends LiveSheetFragment implements InterfaceC19323110ij {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9JSQ+IjHELIOSk6LTIpO2ESLCEBKD04LSEaICokLTcKOy40JSAiPRw7LSA4";
    public final C01GW LLJLLL = C292401Bi.LIZ(new AwS556S0100000_12(this, 308));
    public final C01GW LLJZ = C292401Bi.LIZ(new AwS556S0100000_12(this, 311));
    public final C01GW LLJZIJLIL = C292401Bi.LIZ(new AwS556S0100000_12(this, 310));
    public final C01GW LLL = C292401Bi.LIZ(new AwS556S0100000_12(this, 309));
    public final C01GW LLLF = C292401Bi.LIZ(new AwS556S0100000_12(this, 312));
    public final C01GW LLLFF = C292401Bi.LIZ(new AwS556S0100000_12(this, 307));
    public final C01GW LLLFFI = C292401Bi.LIZ(new AwS556S0100000_12(this, 313));
    public C752870Tg5 LLLFZ;
    public View LLLI;

    public final void wS() {
        String string;
        Editable editableLLJILLL;
        C752870Tg5 c752870Tg5 = this.LLLFZ;
        if (c752870Tg5 != null) {
            EditText editText = (EditText) this.LLJLLL.getValue();
            if (editText == null || (editableLLJILLL = C2204961BRm.LLJILLL(editText, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl5ith3F5psQjtNhRnQxoOQddzuK5wgiax6klEamkyiMH1POOO2LIW", null))) == null || (string = editableLLJILLL.toString()) == null) {
                string = "";
            }
            List<C752860Tg4> list = c752870Tg5.LLILZIL;
            ArrayList arrayList = new ArrayList();
            for (Object obj : (ArrayList) list) {
                C752860Tg4 c752860Tg4 = (C752860Tg4) obj;
                if (C500260Jjc.LJJJI(Boolean.valueOf(a0.LJJIIZI(c752860Tg4.LJFF, string, true))) || C500260Jjc.LJJJI(Boolean.valueOf(a0.LJJIIZI(c752860Tg4.LJ, string, true)))) {
                    arrayList.add(obj);
                }
            }
            c752870Tg5.LLILZ = new ArrayList(arrayList);
            c752870Tg5.notifyDataSetChanged();
            Function1<? super Boolean, Unit> function1 = c752870Tg5.LLILZLL;
            if (function1 != null) {
                function1.invoke(Boolean.valueOf(((ArrayList) c752870Tg5.LLILZ).isEmpty()));
            }
        }
    }

    public final void uS() {
        long ownerUserId;
        Room room;
        LiveMode liveMode;
        List<C750550TcL> allFriends = UserService.getInstance().user().getAllFriends();
        if (allFriends == null) {
            allFriends = C13BV.INSTANCE;
        }
        if (!(allFriends instanceof Collection) || !allFriends.isEmpty()) {
            Iterator<C750550TcL> it2 = allFriends.iterator();
            while (it2.hasNext()) {
                Long l = it2.next().LIZ;
                if (C500260Jjc.LJJIJLIJ()) {
                    ownerUserId = UserService.getInstance().user().getCurrentUserId();
                } else {
                    DataChannel dataChannelLJ = C475510Ikn.LJ(this);
                    ownerUserId = (dataChannelLJ == null || (room = (Room) dataChannelLJ.gg0(RoomChannel.class)) == null) ? 0L : room.getOwnerUserId();
                }
                if (l == null || l.longValue() != ownerUserId) {
                    ((C0J1N) ((MarkUserApi) C482260Ivg.LIZJ(MarkUserApi.class)).fetchMarkedUserList().LJIILIIL(new C0UO0()).LIZJ(C11RD.LIZLLL(this))).LIZ(new AfS148S0200000_12(allFriends, this, 14), new AfS148S0200000_12(allFriends, this, 15));
                    C500260Jjc.LLFFF((View) this.LLLF.getValue());
                    C500260Jjc.LLFFF((View) this.LLJZIJLIL.getValue());
                    this.LLLFZ = new C752870Tg5(C475510Ikn.LJ(this), EnumC748580TYa.ADD_MARKED_VIEWER, this);
                    RecyclerView recyclerView = (RecyclerView) this.LLLF.getValue();
                    if (recyclerView != null) {
                        recyclerView.setAdapter(this.LLLFZ);
                        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
                    }
                    View view = (View) this.LLJZ.getValue();
                    if (view != null) {
                        C786410Ut5.I7(new ACListenerS147S0100000_12(this, 33), view);
                    }
                    TextView textView = (TextView) this.LLJLLL.getValue();
                    if (textView != null) {
                        textView.addTextChangedListener(new C786120Usc(this, 0));
                        return;
                    }
                    return;
                }
            }
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_empty_mark_viewer");
        c474500IjALIZ.LJIJJLI(C475510Ikn.LJ(this));
        c474500IjALIZ.LJJII("add_mark_viewer_page", "enter_from_page");
        c474500IjALIZ.LJ("show");
        DataChannel dataChannelLJ2 = C475510Ikn.LJ(this);
        c474500IjALIZ.LJJ((dataChannelLJ2 == null || (liveMode = (LiveMode) dataChannelLJ2.gg0(LiveModeChannel.class)) == null) ? null : liveMode.logStreamingType);
        c474500IjALIZ.LIZ();
        C500260Jjc.LLFFF((View) this.LLLFFI.getValue());
        C1749280vcc c1749280vcc = (C1749280vcc) this.LLLFFI.getValue();
        if (c1749280vcc != null) {
            c1749280vcc.setStatus((C1722300uv6) this.LLLFF.getValue());
        }
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
    public final void onHiddenChanged(boolean z) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10501, "com/bytedance/android/livesdk/markviewer/AddMarkedViewerFragmentSheet", "onHiddenChanged", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl5ith3F5psQjtNhRnQxoOQddzuK5wgiax6klEamkyiMH1POOO2LIW", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        super.onHiddenChanged(z);
        if (!z) {
            uS();
            wS();
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (this.LLJL == null) {
            ViewGroup.LayoutParams layoutParams = view.findViewById(R.id.tqy).getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = (int) (((double) C14KS.LIZLLL()) * 0.6d);
                C786410Ut5.W5(view, layoutParams);
            }
            C764830TzN c764830TzN = new C764830TzN();
            c764830TzN.LIZ = this;
            c764830TzN.LIZIZ = view;
            c764830TzN.LIZ();
        }
        C786410Ut5.I7(new AbS694S0100000_12(this, 22), view.findViewById(R.id.bna));
        this.LLLI = view;
        uS();
        C11RK<Pair<Long, Boolean>> c11rk = C476130Iln.LIZ;
        c11rk.getClass();
        ((C0J1N) new C19475711Hn(c11rk).LIZJ(C11RD.LIZLLL(this))).LIZJ(new AfS181S0100000_12(this, 109));
    }

    @Override // X.InterfaceC19323110ij
    public final void u2(int i, boolean z) {
        int height;
        ValueAnimator valueAnimatorOfInt;
        int iLIZIZ = i + ((int) C497740JfY.LIZIZ(35.0f));
        double dLIZLLL = ((double) C14KS.LIZLLL()) * 0.9d;
        View view = this.LLLI;
        if (view != null) {
            height = view.getHeight();
        } else {
            height = 0;
        }
        int iMin = Math.min(iLIZIZ, (int) (dLIZLLL - ((double) height)));
        if (z) {
            valueAnimatorOfInt = ValueAnimator.ofInt(0, iMin);
            valueAnimatorOfInt.setDuration(300L);
            valueAnimatorOfInt.setInterpolator(C0GY9.LIZIZ(0.33f, 0.86f, 0.2f, 1.0f));
        } else {
            valueAnimatorOfInt = ValueAnimator.ofInt(iMin, 0);
            valueAnimatorOfInt.setDuration(250L);
            valueAnimatorOfInt.setInterpolator(C0GY9.LIZIZ(0.25f, 0.0f, 0.25f, 1.0f));
        }
        valueAnimatorOfInt.addUpdateListener(new AUListenerS262S0100000_12(this, 3));
        valueAnimatorOfInt.start();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.g4k, viewGroup, false);
    }
}
