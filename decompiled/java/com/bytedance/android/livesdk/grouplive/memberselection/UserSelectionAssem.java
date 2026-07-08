package com.bytedance.android.livesdk.grouplive.memberselection;

import X.AbstractC1623806Xk;
import X.AbstractC485930J3v;
import X.C019F;
import X.C01GW;
import X.C0IJT;
import X.C1121660fIK;
import X.C1144610ftL;
import X.C1145190fuH;
import X.C1145220fuK;
import X.C1145230fuL;
import X.C1145270fuP;
import X.C1145280fuQ;
import X.C1145300fuS;
import X.C13LE;
import X.C1559260qg8;
import X.C1623606Xi;
import X.C1637806bA;
import X.C16FV;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C2868019e;
import X.C452501pT;
import X.C474500IjA;
import X.C723590SZx;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.DialogInterfaceOnDismissListenerC1151680g4k;
import X.InterfaceC1145360fuY;
import X.InterfaceC2217461Bqa;
import X.RunnableC514801zW;
import X.RunnableC781530UlD;
import X.ViewOnClickListenerC512201z6;
import Y.ACListenerS120S0200000_17;
import Y.ACListenerS152S0100000_17;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AFwS254S0000000_17;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.AwS631S0100000_17;

/* JADX INFO: loaded from: classes18.dex */
public final class UserSelectionAssem extends UIContentAssem implements InterfaceC1145360fuY {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILLL;
    public final C1559260qg8 LLIZLLLIL = new C1559260qg8(new C723590SZx(this, C1145190fuH.class, null), checkSupervisorPrepared());
    public final AssemVMLazy LLJ;
    public RunnableC781530UlD LLJI;
    public C1145270fuP LLJIJIL;
    public final C1145230fuL LLJILJIL;
    public final C01GW LLJILJILJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(UserSelectionAssem.class, "viewModel", "getViewModel()Lcom/bytedance/android/livesdk/grouplive/memberselection/UserSelectionViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public UserSelectionAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(UserSelectionViewModel.class);
        this.LLJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS561S0100000_17(c19719912DlLIZ, 172), AFwS254S0000000_17.get$arr$(65), null, true);
        this.LLJILJIL = new C1145230fuL();
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS561S0100000_17(this, 173));
    }

    public final C1145190fuH Go() {
        return (C1145190fuH) this.LLIZLLLIL.getValue();
    }

    public final void B6() {
        DialogFragment dialogFragment;
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (!(fragmentLJI instanceof LiveDialogFragment) || (dialogFragment = (DialogFragment) fragmentLJI) == null) {
            return;
        }
        dialogFragment.dismiss();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1145360fuY
    public final void Xc(C1145280fuQ c1145280fuQ) {
        Object obj;
        Room room;
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILLL;
        int itemCount = 0;
        AbstractC1623806Xk<C1144610ftL> abstractC1623806Xk = ((C1145220fuK) assemVMLazy.getValue().getState()).LL;
        C1145280fuQ next = null;
        if (abstractC1623806Xk instanceof C1623606Xi) {
            Iterator<C1145280fuQ> it2 = ((C1144610ftL) ((C1623606Xi) abstractC1623806Xk).LIZ).LIZ.iterator();
            while (it2.hasNext()) {
                next = it2.next();
                if (next.LJ) {
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        AssemVMLazy assemVMLazy2 = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = LLJILLL;
        DataChannel dataChannel = ((C1145190fuH) ((UserSelectionViewModel) assemVMLazy2.getValue()).LL.getValue()).LL;
        if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null) {
            C2868019e.LIZLLL(room.getId(), c1145280fuQ.LIZ);
        }
        Object value = this.LLJILJILJ.getValue();
        C1145190fuH c1145190fuHGo = Go();
        C1145270fuP c1145270fuP = this.LLJIJIL;
        if (c1145270fuP != null) {
            itemCount = c1145270fuP.getItemCount();
        }
        value.getClass();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_gift_change_to_member_panel_click");
        C1121660fIK.LIZ(c474500IjALIZ);
        c474500IjALIZ.LJJII(c1145190fuHGo.LLILLJJLI, "gift_enter_from");
        c474500IjALIZ.LJJII(Long.valueOf(c1145280fuQ.LIZ), "to_member_id");
        String str = "group_room_owner";
        if (c1145280fuQ.LIZLLL) {
            obj = "group_room_owner";
        } else {
            obj = "group_member";
        }
        c474500IjALIZ.LJJII(obj, "to_member_type");
        c474500IjALIZ.LJJII(Integer.valueOf(itemCount), "on_stage_group_member_cnt");
        if (next != null) {
            c474500IjALIZ.LJJII(Long.valueOf(next.LIZ), "before_member_id");
            if (!next.LIZLLL) {
                str = "group_member";
            }
            c474500IjALIZ.LJJII(str, "before_member_type");
        }
        c474500IjALIZ.LIZ();
        B6();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        LiveDialogFragment liveDialogFragment;
        super.onViewCreated(view);
        RunnableC781530UlD runnableC781530UlD = (RunnableC781530UlD) view.findViewById(R.id.user_list_view);
        runnableC781530UlD.setLayoutManager(new GridLayoutManager(runnableC781530UlD.getContext(), 3));
        C1145270fuP c1145270fuP = new C1145270fuP(this);
        c1145270fuP.LLLI(C1145280fuQ.class, new AbstractC485930J3v<C1145280fuQ, C1145300fuS>() { // from class: X.0fuR
            {
                Boolean bool = Boolean.FALSE;
            }

            @Override // X.AbstractC485930J3v, X.C0J8P
            public final void LIZJ(RecyclerView.ViewHolder viewHolder, Object obj) {
                List urls;
                C1145300fuS c1145300fuS = (C1145300fuS) viewHolder;
                C1145280fuQ c1145280fuQ = (C1145280fuQ) obj;
                c1145300fuS.getClass();
                if (c1145280fuQ.LIZLLL) {
                    C500260Jjc.LLFFF((View) c1145300fuS.LL.getValue());
                } else {
                    C500260Jjc.LJIILIIL((View) c1145300fuS.LL.getValue());
                }
                ImageModel imageModel = c1145280fuQ.LIZJ;
                if (imageModel != null && (urls = imageModel.getUrls()) != null) {
                    C1324610kZf c1324610kZfLIZJ = C1819620xS4.LIZ().LIZJ(urls);
                    c1324610kZfLIZJ.LJIILIIL = Boolean.TRUE;
                    c1324610kZfLIZJ.LJIIIZ = R.drawable.ela;
                    c1324610kZfLIZJ.LJJI((View) c1145300fuS.LLILLJJLI.getValue());
                } else {
                    ((C1322110kVd) c1145300fuS.LLILLJJLI.getValue()).setActualImageResource(R.drawable.ela);
                }
                ((TextView) c1145300fuS.LLILLL.getValue()).setText(c1145280fuQ.LIZIZ);
                c1145300fuS.itemView.setSelected(c1145280fuQ.LJ);
                C786410Ut5.I7(new ACListenerS120S0200000_17(c1145280fuQ, c1145300fuS, 20), c1145300fuS.itemView);
            }

            @Override // X.AbstractC485930J3v
            public final RecyclerView.ViewHolder LJIIIIZZ(View view2, ViewGroup viewGroup) {
                return new C1145300fuS(view2);
            }
        });
        this.LLJIJIL = c1145270fuP;
        runnableC781530UlD.setAdapter(c1145270fuP);
        this.LLJI = runnableC781530UlD;
        C786410Ut5.m8((C16FV) view.findViewById(R.id.k33), new ViewOnClickListenerC512201z6(this, 0));
        C786410Ut5.m8((C16FV) view.findViewById(R.id.jyv), new ACListenerS152S0100000_17(this, 7));
        if (Go().LLILZ) {
            Fragment fragmentLJI = C724240Sb0.LJI(this);
            if ((fragmentLJI instanceof LiveDialogFragment) && (liveDialogFragment = (LiveDialogFragment) fragmentLJI) != null) {
                liveDialogFragment.setOnDismissListener(new DialogInterfaceOnDismissListenerC1151680g4k(this, 0));
            }
        }
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILLL;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0fuO
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1145220fuK) obj).LL;
            }
        }, null, new AwS631S0100000_17(this, 0), 6);
        HandlerHook.viewPost(view, new RunnableC514801zW(this, 40));
    }
}
